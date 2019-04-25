/**
 * 
 * @author Breno Pejon
 *N°USP 10801152
 * @param <K> valor generico do primeiro numero 
 * @param <V> valor generico do primeiro numero
 */
public class Par<K, V> {

	private K num1;
	private V num2;
	
	public Par(K num1, V num2){
		this.num1 = num1;
		this.num2 = num2;		
	}	
	
	public K getNum1(){
		return num1;
	}
	
	public V getNum2(){
		return num2;
	}
}
