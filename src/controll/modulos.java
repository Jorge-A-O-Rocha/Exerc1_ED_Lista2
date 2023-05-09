package controll;
import  br.edu.fateczl.lista.listaint.*;
public class modulos {

	public modulos() {
		super();
	
	}
	
	Lista l = new Lista();
	
	public void carregaFila() throws Exception {
		
		l.addFirst(10);
		l.addLast(5);
		l.addLast(8);
		l.addLast(1);
		l.addLast(9);
		l.addLast(2);
		l.addLast(4);
		l.addLast(7);
		l.addLast(3);
		l.addLast(6);
		
		System.out.println("Lista carregada");
	}
	
	public void ordenaFIla() throws Exception {
		Lista aux = l; 
		int tamanho = l.size();
		
		for(int i = 0; i < tamanho; i++){
			for(int j = 0; j < tamanho - 1; j++){
				
				int x = l.get(j);
				int y = l.get(j + 1);
				
				if( x > y ){
					
					
					l.add(j,y);
					l.add(j+1, x);
				}
			}			
		}
		
		for(int i = 0; i < tamanho; i++){
			System.out.print(l.get(i)+" ");
		}
		
		
	}
	

}
