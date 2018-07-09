
public class node <T extends Comparable<T>> implements Comparable<node<T>> {
	
	private node<T> prox, ant;
	private T item;
	
	
	public node(T item) {
		this.item = item;
		prox = null;
		ant = null;
	}

	public node<T> getProx() {
		return prox;
	}



	public void setProx(node<T> prox) {
		this.prox = prox;
	}



	public node<T> getAnt() {
		return ant;
	}



	public void setAnt(node<T> ant) {
		this.ant = ant;
	}



	public T getItem() {
		return item;
	}



	public void setItem(T item) {
		this.item = item;
	}



	public int compareTo(T valor) {
		return item.compareTo(valor);
	}

	@Override
	public int compareTo(node<T> o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
