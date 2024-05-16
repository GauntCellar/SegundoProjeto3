package br.tec.abrindoportas.principal;

import br.tec.abrindoportas.controller.PeopleController;
import br.tec.abrindoportas.controller.TarefaA;
import br.tec.abrindoportas.model.PeopleModel;

public class Principal.java {
public static  void main(String[] args) {
		
		PeopleController peopleController =new PeopleController();
		peopleController.createPerson();
		
		PeopleModel peopleModel = new PeopleModel();
		peopleModel.toString();
			
	    TarefaA func = new TarefaA();
	    func.escolha();

}
}	