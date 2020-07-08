package com.vucko;

import com.vucko.ttl.Context;
import com.vucko.ttl.ContextManager;
import com.vucko.ttl.ExecutorKit;
import com.vucko.ttl.TraceInfo;

import java.util.concurrent.ExecutorService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

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
