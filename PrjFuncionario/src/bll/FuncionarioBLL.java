package bll;

import model.Funcionario;

public class FuncionarioBLL {
	Funcionario func;
	public FuncionarioBLL() {
		
	}
	public FuncionarioBLL(Funcionario f) {
		func = f;
	}
	
	public double salarioBase() {
		return (func.getSalario() + func.getVale_refeicao() + func.getVale_transporte());
	}
	
	
}
