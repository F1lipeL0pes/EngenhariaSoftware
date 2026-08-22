package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

import bll.FuncionarioBLL;
import model.Funcionario;

public class FuncionarioTest {
	
	
	@Test
	public void testarFuncionarioConhecido() {
		Funcionario f = new Funcionario();
		f.setNome("Filipe");
		f.setSalario(1000.00);
		f.setVale_refeicao(100.00);
		f.setVale_transporte(100.00);
		FuncionarioBLL fBll = new FuncionarioBLL(f);
		double salarioBase = fBll.salarioBase();
		assertEquals(salarioBase, 1200.00);
	}
	@Test
	public void testarFuncionarioDesconhecido() {
		Funcionario f = new Funcionario();
		f.setNome("Filipe");
		f.setSalario(1000);
		f.setVale_refeicao(100);
		f.setVale_transporte(100);
		FuncionarioBLL fBll = new FuncionarioBLL(f);
		double salarioBase = fBll.salarioBase();
		assertNotEquals(salarioBase, 1201);
	}
	
}
