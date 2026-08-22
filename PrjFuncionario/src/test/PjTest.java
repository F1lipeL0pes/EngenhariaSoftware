package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

import bll.PjBLL;
import model.Pj;

public class PjTest {
	@Test
	public void testarPjConhecido() {
		Pj p = new Pj();
		p.setIrpf(100);
		p.setNome("Filipe");
		p.setQtd_projetos(10);
		p.setSalario(1000);
		p.setVale_refeicao(100);
		p.setVale_transporte(100);
		p.setValor_projeto(100);
		PjBLL pBll = new PjBLL(p);
		double salarioFinal = pBll.salarioFinal();
		System.out.println(salarioFinal);
		assertEquals(salarioFinal, 2100);
	}
	@Test
	public void testarPjDesconhecido() {
		Pj p = new Pj();
		p.setIrpf(100);
		p.setNome("Filipe");
		p.setQtd_projetos(10);
		p.setSalario(1000);
		p.setVale_refeicao(100);
		p.setVale_transporte(100);
		p.setValor_projeto(100);
		PjBLL pBll = new PjBLL(p);
		double salarioFinal = pBll.salarioFinal();
		System.out.println(salarioFinal);
		assertNotEquals(salarioFinal, 2200);
	}
}
