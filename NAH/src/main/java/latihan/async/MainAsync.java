package latihan.async;

public class MainAsync {

	private static int intLoop = 0;//you can change this variable into static or not-static for testing
	private AsyncListener asyncListener; // listener field
	  
    // setting the listener
    public void registerAsynchronous(AsyncListener mListener)
    {
    	System.out.println("LISTENER REGISTER ON INTLOOP KE "+intLoop);
    	intLoop++;
        this.asyncListener = mListener;
    }
    
    public void getIntLoop()
    {
    	System.out.println("LAST VALUE OF intLoop Variable is "+intLoop);
    }
  
    // My Asynchronous task main
    public void asyncParent(final int intAsyncParent)
    {
    	System.out.println("CREATE Thread Process - "+intLoop);
        // An Async task always executes in new thread
        new Thread(new Runnable() {
            public void run()
            {
            	for(int i=0;i<10;i++)
            	{
            		asyncChild(intAsyncParent,i);
            		synchronousTaskForAsync(intAsyncParent,i);
            		try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						System.out.println("Exception Thread asyncParent "+e);
					}
            		System.out.println("Asynchronous asyncParent Activity Loop - "+i);
            	}
  
                // check if listener is registered.
                if (asyncListener != null) {
                	System.out.println("Asynchronous asyncParent Listener ");
                    // invoke the callback method of class UsualEvent
                	asyncListener.onAsyncParent(intAsyncParent);
                }
            }
        }).start();
    }
    
    // My Asynchronous task without sync task inside it
    public void asyncChild(final int intAsyncParent, final int intAsyncParentLoop)
    {
        // An Async task always executes in new thread
        new Thread(new Runnable() {
            public void run()
            {
            	for(int i=0;i<10;i++)
            	{
            		try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						System.out.println("Exception Thread asyncChild "+e);
					}
            		System.out.println("Asynchronous asyncChild Activity "+i+" From asyncParent - "+intAsyncParent+" Loop - "+intAsyncParentLoop);
            	}
  
                // check if listener is registered.
                if (asyncListener != null) {
                	System.out.println("Asynchronous asyncChild Listener ");
                    // invoke the callback method of class UsualEvent
                	asyncListener.onAsyncChild(intAsyncParent,intAsyncParentLoop);
                }
            }
        }).start();
    }
    
    public void synchronousTask()
    {
    	for(int i=0;i<10;i++)
    	{
    		intLoop++;
    		try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("Interrupted Exception in Synchronous Task "+e);
			}
    		System.out.println("Synchronous Task - "+i+" INT LOOP VALUE "+intLoop);
    	}
    }
    
    public void synchronousTaskForAsync(int intAsyncParent,int intLoopAsyncParent)
    {
    	for(int i=0;i<10;i++)
    	{
    		intLoop++;
    		try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("Interrupted Exception in Synchronous Task "+e);
			}
    		System.out.println("synchronousTaskForAsync Synchronous Task - "+i+" From asyncParent "+intAsyncParent+" Loop - "+intLoopAsyncParent);
    	}
    }
    
    
    public static void main(String[] args)
    {	
    	MainAsync obj = new MainAsync();
    	
    	AsyncListener mListener = new UsualEvent();
        obj.registerAsynchronous(mListener);
        obj.asyncParent(1);
        
        obj.getIntLoop();
        
//        obj.synchronousTask();
//        
//        obj.getIntLoop();
//        obj = new MainAsync();
//    	mListener = new UsualEvent();
//        obj.registerAsynchronous(mListener);
//        obj.asyncParent(2);
////        
//        obj.synchronousTask();
//        
//        obj = new MainAsync();
//    	mListener = new UsualEvent();
//        obj.registerAsynchronous(mListener);
//        obj.asyncParent(3);
    }
}