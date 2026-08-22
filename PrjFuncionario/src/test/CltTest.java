package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

import bll.CltBLL;
import model.Clt;

public class CltTest {
	@Test
	public void testarCltConhecido() {
		Clt c = new Clt();
		c.setInss(100);
		c.setNome("Filipe");
		c.setPlano_saude(100);
		c.setQtd_horas_extras(10);
		c.setSalario(1000);
		c.setSeguro_vida(100);
		c.setVale_refeicao(100);
		c.setVale_transporte(100);
		c.setValor_unit_horas_extras(10);
		CltBLL cBll = new CltBLL(c);
		double salarioFinal = cBll.salarioFinal();
		assertEquals(salarioFinal, 1000);
	}
	@Test
	public void testarCltDesconhecido() {
		Clt c = new Clt();
		c.setInss(100);
		c.setNome("Filipe");
		c.setPlano_saude(100);
		c.setQtd_horas_extras(10);
		c.setSalario(1000);
		c.setSeguro_vida(100);
		c.setVale_refeicao(100);
		c.setVale_transporte(100);
		c.setValor_unit_horas_extras(10);
		CltBLL cBll = new CltBLL(c);
		double salarioFinal = cBll.salarioFinal();
		assertNotEquals(salarioFinal, 1100);
	}
}
