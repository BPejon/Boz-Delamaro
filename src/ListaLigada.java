
public class ListaLigada<K> {
	private NoLista<K> inicio;
	private NoLista<K> fim;
	private int tam;
	
	public ListaLigada(){
		inicio = null;
		fim = null;
		tam = 0;
	}
	
	//true - inserido
	//false - nao inserido
	public boolean insereInicio(NoLista<K> no){
		//verifica o erro 
		if(no == null)
			return false;
		
		//inserei o primeiro elemento
		if(tam == 0){
			inicio = no;
			fim = no;
			no.setProxNo(null);
			++tam;
			return true;
		}
		else{
			no.setProxNo(inicio);
			inicio = no;
			++tam;
			return true;
			
		}
	}
		
	public boolean insereFim(NoLista<K> no){
		fim.setProxNo(no);
		no.setProxNo(null);
		return true;
	}
	
	
	
		
		
		
		
		
		
		
		
}
