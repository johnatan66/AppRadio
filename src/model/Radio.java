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
			System.out.print("O radio já esta ligado!");
		}
	}

	public void desligar() {
		if (this.ligado == true) {
			this.ligado = false;
			System.out.println("Voce desligou o radio");
		} else {
			System.out.println("O radio já está desligado");
		}
	}

	public void aumentarvolume() {
		this.volume++;
		System.out.println("Voce aumentou o o volume para " + volume);
	}

	public void reduzirvolume() {
		if (this.volume == 0) {
			System.out.println("Você ja esta no mudo");
		} else {
			this.volume--;
			System.out.println("Voce abaixou o volume para " + volume);
		}
	}

	public String mostrarDisplay() {
				return "O radio está " + ligado + " sintonizado na estação " + estacao + " no volume " + volume;
	}

}
