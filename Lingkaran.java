public class Lingkaran extends bangundatar{
	int r;
	
	public Lingkaran (int r){
		this.r = r;
	}
	
	@Override
	public float luas(){
		return (float) (Math.PI * r * r);
	}
	
}