
public class NoLista<K> {
	
	private K valor;
	private NoLista<K> proximo;
	
	public NoLista(K valor){
		this.valor = valor;
		this.proximo = null;
}

	public K getConteudo(){
		return valor;
	}
	
	public void setProxNo(NoLista<K> no){
		this.proximo = no;
	}
	
	
}

