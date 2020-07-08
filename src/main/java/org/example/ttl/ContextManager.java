package org.example.ttl;

public class ContextManager {

    ThreadLocal<Context> ctx = new ThreadLocal<>();

    private static ContextManager contextManager = new ContextManager();

    public static Context getCurrContext(){
        return contextManager.getContext();
    }

    public static void setCurrContext(Context context){
        contextManager.setContext(context);
    }


    public Context getContext(){
        if(ctx == null){
            Context context = new Context();
            ctx.set(context);
        }

        return ctx.get();
    }

    public void setContext(Context context){
        ctx.set(context);
    }

}
