package br.tec.abrindoportas.model;

public class PeopleModel {

	private String firsName;
	private String lastName;
	private String cpf;
	private int idade;
	private String endereco;
	private double salario;
	
	public PeopleModel() {
		super();
	}

	public PeopleModel(String firsName, String lastName, String cpf, int idade, String endereco, double salario) {
		super();
		this.firsName = firsName;
		this.lastName = lastName;
		this.cpf = cpf;
		this.idade = idade;
		this.endereco = endereco;
		this.salario = salario;
	}

	public String getFirsName() {
		return firsName;
	}

	public void setFirsName(String firsName) {
		this.firsName = firsName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double string) {
		this.salario = string;
	}

	@Override
	public String toString() {
		return String.format("People [firsName=%s, lastName=%s, cpf=%s, idade=%s, endereco=%s, salario=%s]", firsName, lastName,
				cpf, idade, endereco, salario);
	}
	
	
	
}
