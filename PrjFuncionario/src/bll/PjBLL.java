package bll;

import model.Pj;

public class PjBLL extends FuncionarioBLL{
	Pj p;
	
	public PjBLL() {
		
	}
	public PjBLL(Pj pj) {
		super(pj);
		p = pj;
	}
	
	public double salarioFinal() {
		return (salarioBase() + (p.getQtd_projetos() * p.getValor_projeto()) - p.getIrpf());
	}
}
