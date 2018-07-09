import java.util.ArrayList;

public class Teste {

	public static void main(final String[] args) throws Exception {
		
		Lista<Integer> list = new Lista<Integer>();
		
		list.adicionarNoInicio(1);		
		list.adicionarNoInicio(2);
		list.adicionarNoInicio(5);		
		list.adicionarNoInicio(7);		
		list.adicionarNoFim(9);
		list.adicionarNoInicio(10);
		list.adicionarNoFim(3);
        list.adicionarNoInicio(4);
        list.adicionarNoFim(6);
        list.adicionarNoInicio(8);
        
        Lista<String> listaS = new Lista<String>();
				
		ArrayList<Integer> listar = new ArrayList<Integer>();                
        listar(list.Listar(listar));  
        System.out.println("\n Ordenar..");
        list.efficienteSort(listar); 
             
     }	
	
	
	public static void listar(ArrayList<Integer> lista)
	{
	        
	        for(Object elemento : lista){
	           System.out.print(elemento + " ");
	        }
	}
	
}
