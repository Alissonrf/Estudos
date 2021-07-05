package br.com.alissons.cm.modelo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.alissons.cm.excecao.ExplosaoException;

class CampoTeste {

	private Campo campo;
	
	@BeforeEach
	void iniciarCampo() {
		campo = new Campo(3,3);
	}
	
	@Test
	void testeVizinhoRealEsquerda() {
		Campo vizinho = new Campo(3,2);
		boolean resultado = campo.adicionarVizinho(vizinho);
		assertTrue(resultado);	
	}
	@Test
	void testeVizinhoRealDireita() {
		Campo vizinho = new Campo(3,4);
		boolean resultado = campo.adicionarVizinho(vizinho);
		assertTrue(resultado);
	}
	@Test
	void testeVizinhoRealEmbaixo() {
		Campo vizinho = new Campo(4,3);
		boolean resultado = campo.adicionarVizinho(vizinho);
		assertTrue(resultado);	
	}
	@Test
	void testeVizinhoRealEmCima() {
		Campo vizinho = new Campo(2,3);
		boolean resultado = campo.adicionarVizinho(vizinho);
		assertTrue(resultado);
	}
	@Test
	void testeVizinhoRealDiagonal() {
		Campo vizinho = new Campo(2,2);
		boolean resultado = campo.adicionarVizinho(vizinho);
		assertTrue(resultado);
	}
	@Test
	void testeVizinhoFalso() {
		Campo vizinho = new Campo(1,2);
		boolean resultado = campo.adicionarVizinho(vizinho);
		assertFalse(resultado);
	}
	@Test
	void testeValorPadraoMarcacao() {
		assertFalse(campo.isMarcado());
	}
	@Test
	void testeAlternarMarcacao() {
		campo.alternarMarcacao();
		assertTrue(campo.isMarcado());
	}
	@Test
	void testeAlternarMarcacaoDuasChamadas() {
		campo.alternarMarcacao();
		campo.alternarMarcacao();
		assertFalse(campo.isMarcado());
	}
	@Test
	void testeAbrirCampoNaoMinadoNaoMarcado() {
		assertTrue(campo.abrir());
	}
	@Test
	void testeAbrirCampoNaoMinadoMarcado() {
		campo.alternarMarcacao();
		assertFalse(campo.abrir());
	}
	@Test
	void testeAbrirCampoMinadoMarcado() {
		campo.minar();
		campo.alternarMarcacao();
		assertFalse(campo.abrir());
	}
	@Test
	void testeAbrirCampoMinadoNaoMarcado() {
		campo.minar();
		assertThrows(ExplosaoException.class , () -> {
			campo.abrir();
		});
	}
	@Test
	void testeAbrirComVizinhos1() {
		Campo campo11 = new Campo(1,1);
		Campo campo22 = new Campo(2,2);
		
		campo22.adicionarVizinho(campo11);
		
		campo.adicionarVizinho(campo22);
		campo.abrir();
		assertTrue(campo11.isAberto() && campo22.isAberto());
	}
	@Test
	void testeAbrirComVizinhos2() {
		Campo campo11 = new Campo(1,1);
		Campo campo12 = new Campo(1,2);
		
		campo12.minar();
		
		Campo campo22 = new Campo(2,2);
		
		campo22.adicionarVizinho(campo11);
		campo22.adicionarVizinho(campo12);
		
		campo.adicionarVizinho(campo22);
		campo.abrir();
		
		assertTrue(campo22.isAberto() && !campo11.isAberto());
	}
	@Test
	void testeMinasNaVizinhanca1() {
		Campo campo43 = new Campo(4,3);
		Campo campo44 = new Campo(4,4);
		Campo campo23 = new Campo(2,3);
		Campo campo34 = new Campo(3,4);
		campo.adicionarVizinho(campo34);
		campo.adicionarVizinho(campo43);
		campo.adicionarVizinho(campo23);
		campo.adicionarVizinho(campo44);
		campo43.minar();
		campo44.minar();
		campo23.minar();
		campo34.minar();
		long resultado = campo.minasNaVizinhanca();
		assertTrue(resultado == 4);
	}
	@Test
	void testeMinasNaVizinhanca2() {
		Campo campo43 = new Campo(4,3);
		Campo campo44 = new Campo(4,4);
		Campo campo23 = new Campo(2,3);
		Campo campo34 = new Campo(3,4);
		campo.adicionarVizinho(campo34);
		campo.adicionarVizinho(campo43);
		campo.adicionarVizinho(campo23);
		campo.adicionarVizinho(campo44);
		campo43.minar();
		campo44.minar();
		long resultado = campo.minasNaVizinhanca();
		assertTrue(resultado == 2);
	}
	@Test
	void testeObjetivoAlcancado1() {
		campo.abrir();
		assertTrue(campo.objetivoAlcancado());
	}
	@Test
	void testeObjetivoAlcancado2() {
		campo.minar();
		campo.alternarMarcacao();
		assertTrue(campo.objetivoAlcancado());
	}
	@Test
	void testeObjetivoAlcancado3() {
		campo.minar();
		assertFalse(campo.objetivoAlcancado());
	}
	@Test
	void testeObjetivoAlcancado4() {
		campo.minar();
		assertFalse(campo.objetivoAlcancado());
	}
	@Test
	void testeReiniciarJogo() {
		campo.alternarMarcacao();
		campo.reiniciar();
		assertFalse(campo.isMarcado());
	}
	@Test
	void testeReiniciarJogo2() {
		campo.minar();
		campo.reiniciar();
		assertFalse(campo.isMinado());
	}
	@Test
	void testeReiniciarJogo3() {
		campo.abrir();
		campo.reiniciar();
		assertFalse(campo.isAberto());
	}
}
