package org.example.ttl;

public class RunnableWrapper implements Runnable{

    private Runnable runnable;

    private Context context;

    public RunnableWrapper(Runnable task) {
        this.runnable = task;
        this.context = ContextManager.getCurrContext();
    }

    @Override
    public void run() {
        TraceInfo traceInfo = new TraceInfo();
        traceInfo.setTraceId(context.getTraceInfo().getTraceId());
        traceInfo.setParSpanId(context.getTraceInfo().getParSpanId());
        traceInfo.setSpanId("2");
        Context curcontext = new Context();
        curcontext.setTraceInfo(traceInfo);
        ContextManager.setCurrContext(curcontext);

        runnable.run();

        System.out.println(ContextManager.getCurrContext());
    }
}
