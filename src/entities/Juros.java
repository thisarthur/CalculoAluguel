package entities;

public class Juros {

	private double jurosAtraso;
	private double jurosDiario;
	
	
	public Juros(double jurosAtraso, double jurosDiario) {
		this.jurosAtraso = jurosAtraso;
		this.jurosDiario = jurosDiario;
	}


	public double getJurosAtraso() {
		return jurosAtraso;
	}


	public void setJurosAtraso(double jurosAtraso) {
		this.jurosAtraso = jurosAtraso;
	}


	public double getJurosDiario() {
		return jurosDiario;
	}


	public void setJurosDiario(double jurosDiario) {
		this.jurosDiario = jurosDiario;
	}
	
	
}
