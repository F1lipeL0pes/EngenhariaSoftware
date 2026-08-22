package bll;

import model.Clt;

public class CltBLL extends FuncionarioBLL{
	Clt c;
	public CltBLL() {
		
	}
	public CltBLL(Clt clt) {
		super(clt);
		c = clt;
	}
	public double salarioFinal() {
		return (salarioBase() + (c.getQtd_horas_extras() * c.getValor_unit_horas_extras()) - c.getInss() - c.getSeguro_vida() - c.getPlano_saude());
	}
	
}
