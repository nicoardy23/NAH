package latihan.async;

public class UsualEvent extends Thread implements AsyncListener{

	public void onAsyncParent(int intAsyncParent) {
		 for(int i=5;i>0;i--)
		 {
			 try {
				sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("Interrupted Exception in Asynchronous Task Class UsualEvent Method onAsyncParent "+e);
			}
//			 interrupted();
			 System.out.println("Asynchronous onAsyncParent Finish in "+i+" second !!");
		 }
		 System.out.println("====================== Asynchronous onAsyncParent "+intAsyncParent+"Process Finish !! ============================");
	}
	
	public void onAsyncChild(int intAsyncParent, int intAsyncParentLoop) {
		 for(int i=5;i>0;i--)
		 {
			 try {
				sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("Interrupted Exception in Asynchronous Task Class UsualEvent Method onAsyncChild "+e);
			}
//			 interrupted();
			 System.out.println("Asynchronous onAsyncChild Finish in "+i+" second !!");
		 }
		 System.out.println("====================== Asynchronous onAsyncChild in AsyncParent Loop "+intAsyncParentLoop+" Process Finish !! ============================");
	}
}

//A,B,C
//E