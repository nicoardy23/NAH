package ujian.ujiankelima.testng;

public class Parsing {
	public String parseToIntegerActual(String x) {
		Integer value = 0;
		try {
			value = Integer.parseInt(x);
		} catch (Exception e) {
			System.out.println("Tidak ada nilai numeric. Numeric = "+value);
		}
		System.out.println("Nilai ini numeric => "+value);
		return value.toString();
	}

	public String parseToIntegerExpect(String x) {
		Integer value = 0;
		try {
			value = Integer.valueOf(x);
		} catch (Exception e) {
			System.out.println("Tidak ada nilai numeric. Numeric = "+value);
		}
		System.out.println("Nilai ini numeric => "+value);
		return value.toString();
	}
	
	public String parseToDoubleActual(String x) {
		Double value = 0.0;
		try {
			value = Double.parseDouble(x);
		} catch (Exception e) {
			System.out.println("Nilai ini bukan numeric => "+value);
		}
		System.out.println("Nilai ini numeric => "+value);
		return value.toString();
	}
	
	public String parseToDoubleExpect(String x) {
		Double value = 0.0;
		try {
			value = Double.valueOf(x);
		} catch (Exception e) {
			System.out.println("Nilai ini bukan numeric => "+value);
		}
		System.out.println("Nilai ini numeric => "+value);
		return value.toString();
	}
	
	public String parseToLongActual(String x) {
		Long value = 0L;
		try {
			value = Long.parseLong(x);
		} catch (Exception e) {
			System.out.println("Nilai ini bukan numeric => "+value);
		}
		System.out.println("Nilai ini numeric => "+value);
		return value.toString();
	}
	
	public String parseToLongExpect(String x) {
		Long value = 0L;
		try {
			value = Long.valueOf(x);
		} catch (Exception e) {
			System.out.println("Nilai ini bukan numeric => "+value);
		}
		System.out.println("Nilai ini numeric => "+value);
		return value.toString();
	}

	public String parseToFloatActual(String x) {
		Float value = 0F;
		try {
			value = Float.parseFloat(x);
		} catch (Exception e) {
			System.out.println("Nilai ini bukan numeric => "+value);
		}
		System.out.println("Nilai ini numeric => "+value);
		return value.toString();
	}
	
	public String parseToFloatExpect(String x) {
		Float value = 0F;
		try {
			value = Float.valueOf(x);
		} catch (Exception e) {
			System.out.println("Nilai ini bukan numeric => "+value);
		}
		System.out.println("Nilai ini numeric => "+value);
		return value.toString();
	}
}
