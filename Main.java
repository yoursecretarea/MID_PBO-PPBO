public class Main {
	public static void main(String[] args){
		
		bangundatar bdt = new bangundatar();
		Persegi persegi = new Persegi (4);
		Lingkaran lingkaran = new Lingkaran (2);
		
		bdt.luas();
		
		System.out.println("Luas Persegi: " + persegi.luas());
		System.out.println("Luas Lingkaran: " + lingkaran.luas());
	}
}