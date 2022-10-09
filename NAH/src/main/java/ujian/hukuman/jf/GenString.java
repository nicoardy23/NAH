package ujian.hukuman.jf;

import java.util.Random;

public class GenString {
	public static void main(String[] args) {
		Random rand = new Random();
		char[] voc = "aeiou".toCharArray();
		char[] cons = "bcdfghjklmnpqrstvwxyz".toCharArray();
		int total = rand.nextInt(10, 30);
		StringBuilder sBuild = new StringBuilder(total);
		Integer firstText = total%2;
		Integer sort;
		char alp;
		
		for (int i = 0; i < total; i++) {
			sort = i%2;
			if (firstText.equals(0)) {
				if (sort.equals(0)) {
					alp = voc[rand.nextInt(voc.length)];
				} else {				
					alp = cons[rand.nextInt(cons.length)];
				}
			} else {
				
				if (sort.equals(0)) {
					alp = cons[rand.nextInt(cons.length)];
				} else {				
					alp = voc[rand.nextInt(voc.length)];
				}
			}
			sBuild.append(alp);
		}
		String output = sBuild.toString();
		String makeCapital = output.substring(0,1).toUpperCase().concat(output.substring(1));
		System.out.println(makeCapital);
	}
}

