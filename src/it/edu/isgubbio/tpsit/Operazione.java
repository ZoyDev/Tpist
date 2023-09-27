package it.edu.isgubbio.tpsit;

public class Operazione {
	int n1,n2;
	public Operazione(int x, int y) {
		n1=x;
		n2=y;
	}
	public int somma() {
		return n1+n2;
	}
	public int prodotto() {
		return n1*n2;
	}
	
	
	public static void main(String[] args) {
		launch(args);
		Operazione op = new Operazione(3, 4);
		System.out.println(op.somma());
		System.out.println(op.prodotto());
	}
	private static void launch(String[] args) {
		
	}

}