package br.tec.abrindoportas.controller;

import javax.swing.JOptionPane;

import br.tec.abrindoportas.model.PeopleModel;

public class PeopleController {

	public void createPerson() {

		PeopleModel peopleModel = new PeopleModel();

		peopleModel.setFirsName(JOptionPane.showInputDialog(null, "Digite o primeiro nome: "));
		peopleModel.setLastName(JOptionPane.showInputDialog(null, "Digite o Sobre Nome: "));
		peopleModel.setCpf(JOptionPane.showInputDialog(null, "Digite o CPF: "));
		peopleModel.setEndereco(JOptionPane.showInputDialog(null, "Digite o Endereço: "));
		peopleModel.setIdade(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a Idade: ")));
		peopleModel.setSalario(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o Salário: ")));
		
		JOptionPane.showMessageDialog(null, peopleModel);
	}	
	    public void readPerson() {
	    
		System.out.println(peopleModel.toString());
		
//		System.out.println("Nome: " + peopleModel.getFirsName()
//		+ "\nSobre Nome: " + peopleModel.getLastName()
//		+ "\nCPF: " + peopleModel.getCpf()
//		+ "\nEndereço: " + peopleModel.getEndereco()
//		+ "\nIdade: " + peopleModel.getIdade()
//		+ "\nSalario: " + peopleModel.getSalario());
		
	}
	

}
