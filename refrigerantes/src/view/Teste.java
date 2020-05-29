package view;

import model.ImplementacaoRefrigerante;
import model.Jesus;
import model.TamanhoFamilia;
import model.TamanhoKS;
import model.AbstracaoTamanho;
import model.Guarana;
import model.TamanhoMedio;
import model.TamanhoPequeno;

public class Teste {
	public static void main(String[] args) {
		ImplementacaoRefrigerante guarana = new Guarana();
		AbstracaoTamanho guaranaMedio = new TamanhoMedio(guarana);
		AbstracaoTamanho guaranaPequeno = new TamanhoPequeno(guarana);
		
		guaranaMedio.beber();
		guaranaPequeno.beber();
		
		ImplementacaoRefrigerante jesus = new Jesus();
		AbstracaoTamanho jesusKs = new TamanhoKS(jesus);
		AbstracaoTamanho jesusFamilia = new TamanhoFamilia(jesus);
		
		jesusFamilia.beber();
		jesusKs.beber();
	}
}
