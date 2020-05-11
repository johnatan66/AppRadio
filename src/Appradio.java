import model.Estacoes;
import model.Radio;


public class Appradio {
	public static void main(String args[]) {
		Radio r1;
		
		r1 = new Radio(10, 106.3);
		
		System.out.println(r1.mostrarDisplay());	
		r1.ligar();
		System.out.println(r1.mostrarDisplay());
		r1.aumentarvolume();
		r1.reduzirvolume();
		r1.sintonizar(Estacoes.ENERGIA);
		System.out.println(r1.mostrarDisplay());

	}
	

}
