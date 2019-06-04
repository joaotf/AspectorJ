package main;

import main.Funcoes;




public aspect main {
	pointcut adicionar() : execution(* Funcoes.adicionar_Contato(..));
	
	pointcut remover() : execution(* Funcoes.remover_Contato(..));
	
	after() returning() : adicionar(){
		Funcoes.add_Contato();
	}
	after() returning() : remover(){
		Funcoes.rem_Contato();
	}
}

