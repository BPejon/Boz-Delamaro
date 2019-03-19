public class Random {
	//parametros da geracao
	private long p = 2147483648L;
	private long m = 843314861;
	private long a =  453816693;
	
	//semente
	private long xi = 1023;
	
	public double getRand() {
		xi = (a+m *xi )% p ;
		
		double d = xi; //promove pra double
		return d/p;
		
	}
	
	public int getIntRand(int max) {
		double d = getRand()*max;
		return (int) d;
		
	}
	


}
