package latihan.array;

public class Array {
	public static void main (String[] args) {
		int[][] k = {{1,2,3},{1,2}};
		
		for(int i=0; i<k.length;i++) {
			for(int j=0; j<k[i].length;j++) {
				System.out.println("["+i+"]"+"["+j+"]"+"BERNILAI"+k[i][j]);
			}
		}
	}
}
