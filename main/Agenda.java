package main;

import static java.lang.System.out;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.swing.JOptionPane;

import main.Funcoes;
import main.Pessoa;

import java.util.ArrayList;

public class Agenda {
		
	public static void main(String [] args) {
		int menu=0;
		ArrayList<Pessoa> pessoa = new ArrayList<Pessoa>(); 

		do {
			menu = Integer.parseInt(JOptionPane.showInputDialog("Menu\n1)Adicionar contato\n2)Remover contato\n3)Exibir contatos\n4)Exibir log\n5)Sair"));
			switch (menu) {
			case 1:
				Pessoa y = new Pessoa();
				Funcoes.adicionar_Contato(y,pessoa);
				break;
			
			case 2:
				int escolha = Integer.parseInt(JOptionPane.showInputDialog("Parâmetro para remover:\n1)Nome\n2)Número"));
				
				if(escolha == 1) {
					String nome_pessoa = JOptionPane.showInputDialog("Nome :");
					Funcoes.remover_Contato(pessoa,nome_pessoa,0);	
				}
				else if(escolha == 2) {
					int numero_pessoa = Integer.parseInt(JOptionPane.showInputDialog("Número :"));
					Funcoes.remover_Contato(pessoa,null,numero_pessoa);
				}
				break;
			case 3:
				Funcoes.printar(pessoa);
				break;
			case 4:
				try {
					Path path = Paths.get("D:\\Agenda_LOG.txt");
					byte[] log = Files.readAllBytes(path);
					String tudo = new String(log);
					JOptionPane.showMessageDialog(null,tudo);
					
				} catch (IOException e) {
					 JOptionPane.showMessageDialog(null,"Erro:"+e);
				}
				break;
			}
		}while(menu != 5);
	}
	
}
