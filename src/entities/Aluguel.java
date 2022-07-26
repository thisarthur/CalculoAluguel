package entities;

public class Aluguel extends Juros {

	private double valorAluguel;
	private int diasAtraso;

	public Aluguel(double jurosAtraso, double jurosDiario, double valorAluguel, int diasAtraso) {
		super(jurosAtraso, jurosDiario);
		this.valorAluguel = valorAluguel;
		this.diasAtraso = diasAtraso;
	}

	public double getValorAluguel() {
		return valorAluguel;
	}

	public void setValorAluguel(double valorAluguel) {
		this.valorAluguel = valorAluguel;
	}

	public int getDiasAtraso() {
		return diasAtraso;
	}

	public void setDiasAtraso(int diasAtraso) {
		this.diasAtraso = diasAtraso;
	}

	
	public double multaAtraso() {
		return valorAluguel * getJurosAtraso();

	}

	public double jurosDia() {
		double soma = valorAluguel;
		for (int i = 1; i <= diasAtraso; i++) {
			soma += (soma * getJurosDiario());
		}
		return soma;
	}

	
	public double valorAtualizado() {
		return multaAtraso() + jurosDia();
	}

	public double valorJuros() {
		return valorAtualizado() - valorAluguel;
	}
}
