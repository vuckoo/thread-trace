package org.example.ttl;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.*;

public class ExecutorServiceWrapper extends ExecutorWrapper implements ExecutorService {

    private ExecutorService executorService;

    public ExecutorServiceWrapper(ExecutorService executorService) {
        super(executorService);
        this.executorService = executorService;
    }


    @Override
    public void shutdown() {
        executorService.shutdown();
    }

    
    @Override
    public List<Runnable> shutdownNow() {
        return executorService.shutdownNow();
    }

    @Override
    public boolean isShutdown() {
        return executorService.isShutdown();
    }

    @Override
    public boolean isTerminated() {
        return executorService.isTerminated();
    }

    @Override
    public boolean awaitTermination(long timeout,  TimeUnit unit) throws InterruptedException {
        return executorService.awaitTermination(timeout, unit);
    }

    
    @Override
    public <T> Future<T> submit( Callable<T> task) {
        return null;
    }

    
    @Override
    public <T> Future<T> submit( Runnable task, T result) {
        return executorService.submit(new RunnableWrapper(task), result);
    }

    
    @Override
    public Future<?> submit( Runnable task) {
        return executorService.submit(new RunnableWrapper(task));
    }

    
    @Override
    public <T> List<Future<T>> invokeAll( Collection<? extends Callable<T>> tasks) throws InterruptedException {
        //return executorService.invokeAll(TtlCallable.gets(tasks));
        return null;
    }

    
    @Override
    public <T> List<Future<T>> invokeAll( Collection<? extends Callable<T>> tasks, long timeout,  TimeUnit unit) throws InterruptedException {
        //return executorService.invokeAll(TtlCallable.gets(tasks), timeout, unit);
        return null;
    }

    
    @Override
    public <T> T invokeAny( Collection<? extends Callable<T>> tasks) throws InterruptedException, ExecutionException {
       // return executorService.invokeAny(TtlCallable.gets(tasks));
        return null;
    }

    @Override
    public <T> T invokeAny( Collection<? extends Callable<T>> tasks, long timeout,  TimeUnit unit) throws InterruptedException, ExecutionException, TimeoutException {
        //return executorService.invokeAny(TtlCallable.gets(tasks), timeout, unit);
        return null;
    }
}
