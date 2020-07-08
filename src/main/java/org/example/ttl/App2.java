package org.example.ttl;

import java.util.concurrent.*;

public class App2 {

    public static void main(String[] args) {

        TraceInfo trace = new TraceInfo();
        trace.setTraceId("1111");
        trace.setSpanId("1");
        Context contextCarrier = new Context();
        contextCarrier.setTraceInfo(trace);
        ContextManager.setCurrContext(contextCarrier);

        System.out.println(ContextManager.getCurrContext());

        ExecutorService executorService2 = ExecutorKit.newFixedThreadPool(1);

        executorService2.execute(() -> {
            System.out.println("tst");
        });

    }


}
