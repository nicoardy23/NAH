package latihan.sort;

public class LinearSearch {
	public static void main(String[] args) {

		int[] intArr = {3,8,5,2,1,9,10};
		int intB = 8;
		boolean isFound = true;
		
		for(int i=0;i<intArr.length;i++)
		{
			if(intB==intArr[i])
			{
				System.out.println("Angka "+intB+" sudah ditemukan , pada index ke "+i);
				isFound = false;
				break;
			}
		}
		
		if(isFound)
		{
			System.out.println("Angka  "+intB+" yang anda cari tidak ditemukan !! ");			
		}
	}
}
