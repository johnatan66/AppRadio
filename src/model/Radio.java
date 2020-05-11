package model;

public class Radio {
	private boolean ligado;
	private int volume;
	private double estacao;

	public Radio(int volume, double estacao) {
		this.volume = volume;
		this.estacao = estacao;
		this.ligado = false;
	}

	public void sintonizar(double estacao) {
		if (this.ligado == true) {
			this.estacao = estacao;
		}

	}

	public void ligar() {
		if (ligado == false) {
			this.ligado = true;

		} else {
			System.out.print("O radio j� esta ligado!");
		}
	}

	public void desligar() {
		if (this.ligado == true) {
			this.ligado = false;
			System.out.println("Voce desligou o radio");
		} else {
			System.out.println("O radio j� est� desligado");
		}
	}

	public void aumentarvolume() {
		this.volume++;
		System.out.println("Voce aumentou o o volume para " + volume);
	}

	public void reduzirvolume() {
		if (this.volume == 0) {
			System.out.println("Voc� ja esta no mudo");
		} else {
			this.volume--;
			System.out.println("Voce abaixou o volume para " + volume);
		}
	}

	public String mostrarDisplay() {
				return "O radio est� " + ligado + " sintonizado na esta��o " + estacao + " no volume " + volume;
	}

}
