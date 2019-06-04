package main;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JOptionPane;

public class Funcoes {
	
	public static void adicionar_Contato(Pessoa pessoa,ArrayList<Pessoa> array) {
		String nome = JOptionPane.showInputDialog("Nome :");
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Número :"));
		
		pessoa.setNome(nome);
		pessoa.setNumero(numero);		
		
		array.add(pessoa);
		JOptionPane.showMessageDialog(null,"Contato adicionado com sucesso!");	
	}
	
	public static void remover_Contato(ArrayList<Pessoa> array,String nome,int numero) {
		if(nome != null) {
			for (int i = 0; i < array.size(); i++) {
				if((nome.equals(array.get(i).getNome())) != true) {
					JOptionPane.showMessageDialog(null,"Nome não encontrado!");
					break;
				}else {
					array.remove(i);
					JOptionPane.showMessageDialog(null,"Contato excluído com sucesso!");
				}
			}
			
		}else if(numero != 0) {
			for (int i = 0; i < array.size(); i++) {
				if(numero != array.get(i).getNumero()) {
					JOptionPane.showMessageDialog(null,"Número não encontrado!");
					break;
				}else {
					array.remove(i);
					JOptionPane.showMessageDialog(null,"Contato excluído com sucesso!");
				}
			}
			
		}
		
	}
	
	public static void printar(ArrayList<Pessoa> pessoa) {
		if(pessoa.size() >= 1) {
			for (int i = 0; i < pessoa.size(); i++) {
				JOptionPane.showMessageDialog(null,
						"ID : "	+i+"\n"+
						"Nome : "+ pessoa.get(i).getNome()+ "\n" +
						"Número : " +pessoa.get(i).getNumero());
				}
		}else {
			JOptionPane.showMessageDialog(null,"Array vazio!");
				}
			}
		

public static void add_Contato() {
	SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");  
	Date date = new Date(System.currentTimeMillis());  
	try {
		File file = new File("D:\\Agenda_LOG.txt");

        if (!file.exists()) {
            file.createNewFile();
        }
        FileWriter fw = new FileWriter(file.getAbsoluteFile(),true);
        BufferedWriter bw = new BufferedWriter(fw);
        
        bw.write("Adicionar Contato\n"+formatter.format(date)+"\n\n\n");
        bw.close();
	}
	catch (IOException e) {
		JOptionPane.showMessageDialog(null,"Erro:"+e);
		}	
	}

public static void rem_Contato() {
	SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");  
	Date date = new Date(System.currentTimeMillis());  
	try {
		File file = new File("D:\\Agenda_LOG.txt");

        if (!file.exists()) {
            file.createNewFile();
        }
        FileWriter fw = new FileWriter(file.getAbsoluteFile(),true);
        BufferedWriter bw = new BufferedWriter(fw);
        
        bw.write("Remover Contato\n"+formatter.format(date)+"\n\n\n");
        bw.close();
	}
	catch (IOException e) {
		JOptionPane.showMessageDialog(null,"Erro:"+e);
		}
	}
}
	


