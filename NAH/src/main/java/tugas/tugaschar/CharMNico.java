package tugas.tugaschar;
import java.util.*;

public class CharMNico {
	public static void main (String[] args) {
		// BUGS...
		// 1. Programmer konfirmasi kepada user untuk memastikan program dibuat secara statis atau dinamis.
		// 2. Pada kondisi if pertama tertera m>20, berarti kita harus memasukkan input dengan format bilangan bulat.
		//    Program akan berjalan namun tidak dapat memenuhi apa yang kita inginkan karena if cabang membandingkan m dengan alfabet, dan bukan bilangat bulat
		// 3. Ketika kita memasukkan m<20, hasil yang akan keluar adalah selalu statement pada else. 
		//    Dan kita tidak akan pernah bisa menghasilkan statement true karena m adalah bilangan bulat, sedangkan kondisinya m=='c' yaitu alfabet.
		//    Begitu juga dengan m>20
		// 4. Ketika kita memasukkan input m=20, akan memasuki if percabangan kedua dan menghasilkan output 4, sedangkan 20 = 20, 20 !> 20 atau 20 !< 20
		
		
		//deklarasi & inisialisasi
//		char m = 19;
		char m = 20;
//		char m = 21;
		
		if(m>20) {
			if(m=='c') {
				System.out.println(1);
			} else {
				System.out.println(2);
			}
		} else {
			if(m=='k') {
				System.out.println(3);
			} else {
				System.out.println(4);
			}
		}
		
	}
}
