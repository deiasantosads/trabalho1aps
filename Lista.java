import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;

public class Lista<T extends Comparable<T>> {
	private node<T> inicio = null;
	private node<T> fim = null;
	private int size;
	
	public void adicionarNoInicio(T item){
		node<T> newNode = new node<>(item);
		newNode.setProx(inicio);
		inicio = newNode;

		if (fim == null){
			fim = inicio;
		}
		size++;
	}
	
	public void adicionarNoFim(T item){
		
		 node<T> novo = new node<>(item);                     
         if(fim == null){         
            novo.setItem(item);
            inicio = novo;
            fim = novo;         
         }else{
            fim.setProx(novo);
            novo.setItem(item);
            fim = novo;
         }
         size++;	
	}
	
	
	
   public ArrayList<T> Listar(ArrayList<Integer> listar) throws Exception  {           
      if(inicio.getItem() == null)
         throw new Exception("A lista esta vazia!");      
      else{
         node<T> aux = getInicio();         
         for(int i = 0;i < size; i++){
        	Integer vl = (Integer) aux.getItem(); 
            listar.add(vl);
            aux = aux.getProx();
         }
         return (ArrayList<T>) listar;
      }      
   }
	
	public void efficienteSort(ArrayList lista)
	{
		
		for(int i=0; i < lista.size(); i++) {
            for(int j=i+1; j < lista.size(); j++) {
                int item1 = (Integer)lista.get(i);
                int item2 = (Integer)lista.get(j);
                if(lista.get(i).equals(lista.get(j)) == false && item1 > item2) {                	
                	lista.set(i, item2);
                	lista.set(j, item1);
                }
            }
        }
        for(Object elemento : lista){
	           System.out.print(elemento + " ");
	        }	
	}
	
	
	private boolean isEmpty()
	{
		return inicio == null;		
	}

	public node getInicio() {
		return inicio;
	}

	public void setInicio(node inicio) {
		this.inicio = inicio;
	}

	public node getFim() {
		return fim;
	}

	public void setFim(node fim) {
		this.fim = fim;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	public String toString(){
		StringBuilder tmp = new StringBuilder("List: [");
		node<T> temp = inicio;
		while(temp != null){
			tmp.append(temp);
			temp = temp.getProx();
		}
		tmp.append("]");
		return tmp.toString();
		
	}
}
