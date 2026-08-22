package model;

public class Clt extends Funcionario{
	
	private int qtd_horas_extras;
	private double valor_unit_horas_extras;
	private double inss;
	private double seguro_vida;
	private double plano_saude;
	public int getQtd_horas_extras() {
		return qtd_horas_extras;
	}
	public void setQtd_horas_extras(int qtd_horas_extras) {
		this.qtd_horas_extras = qtd_horas_extras;
	}
	public double getValor_unit_horas_extras() {
		return valor_unit_horas_extras;
	}
	public void setValor_unit_horas_extras(double valor_unit_horas_extras) {
		this.valor_unit_horas_extras = valor_unit_horas_extras;
	}
	public double getInss() {
		return inss;
	}
	public void setInss(double inss) {
		this.inss = inss;
	}
	public double getSeguro_vida() {
		return seguro_vida;
	}
	public void setSeguro_vida(double seguro_vida) {
		this.seguro_vida = seguro_vida;
	}
	public double getPlano_saude() {
		return plano_saude;
	}
	public void setPlano_saude(double plano_saude) {
		this.plano_saude = plano_saude;
	}
	
	
}
