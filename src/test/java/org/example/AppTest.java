package org.example;

import static org.junit.Assert.assertTrue;

import org.example.ttl.Context;
import org.example.ttl.ContextManager;
import org.example.ttl.ExecutorKit;
import org.example.ttl.TraceInfo;
import org.junit.Test;

import java.util.concurrent.ExecutorService;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {

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

        assertTrue( true );
    }
}
