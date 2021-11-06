class inputanhasil extends PatokInputnilai {
	
	public double nilairatatugas, nilaiakhir;
	char huruf;
	
	public void hitnilairatarata() {
		nilairatatugas = (nilaitugas1 + nilaitugas2 + nilaitugas3) / 3;
		
	} 
	
	public void hitnilaiakhir(){
		nilaiakhir = (nilairatatugas * 0.3) + (nilaimid * 0.3) + (nilaifinal * 0.4);
	}
	
	
	public void hitnilaihuruf(){
		
		if (nilaiakhir >= 80) {
			huruf = 'A';
		} else
		if (nilaiakhir >= 60 & nilaiakhir <= 79) {
			huruf = 'B';
		} else
		if (nilaiakhir >= 50 & nilaiakhir <= 59) {
			huruf = 'C';
		} else
		if (nilaiakhir >= 40 & nilaiakhir <= 49) {
			huruf = 'D';
		} else
		if (nilaiakhir <= 39) {
			huruf = 'E';
		} 
		
	}
	
	public double getnilaiakhir(){
		return nilaiakhir;
	}
	
	public char getnilaihuruf(){
		return huruf;
	}
	
}