import java.util.Scanner;

public class inputanMID {
	public static void main(String args[]){
		
		String nama;
		int nilaitugas1, nilaitugas2, nilaitugas3, nilaimid, nilaifinal;
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("MID Teori");
		System.out.println();
		
		System.out.print("Masukkan Nama Anda : ");
		nama = input.nextLine();
		System.out.print("Masukkan Nilai Tugas 1 : ");
		nilaitugas1 = input.nextInt();
		System.out.print("Masukkan Nilai Tugas 2 : ");
		nilaitugas2 = input.nextInt();
		System.out.print("Masukkan Nilai Tugas 3 : ");
		nilaitugas3 = input.nextInt();
		System.out.print("Masukkan Nilai Mid : ");
		nilaimid = input.nextInt();
		System.out.print("Masukkan Nilai Final : ");
		nilaifinal = input.nextInt();
		
		CariHasilNilai X = new CariHasilNilai();
		
		X.setNilai1(nilaitugas1);
		X.setNilai2(nilaitugas2);
		X.setNilai3(nilaitugas3);
		X.setNilaiMid(nilaimid);
		X.setNilaiFinal(nilaifinal);
		X.hitnilairatarata();
		X.hitnilaiakhir();
		X.hitnilaihuruf();
		
		System.out.println();
		System.out.println("Nama : " + nama);
		System.out.println("Nilai Akhir  : " + X.getnilaiakhir());
		System.out.println("Nilai Huruf : " + X.getnilaihuruf());
	}
}