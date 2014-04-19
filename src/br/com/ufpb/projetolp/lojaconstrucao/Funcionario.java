package br.com.ufpb.projetolp.lojaconstrucao;

/**
 * Classe Funcionario
 * 
 * @author (Manoel, Liviany, Ewerton e João Leandro)
 * @version v2.0
 */
public class Funcionario {
	private String nome;
	private String cpf;
	private String cargo;
	private String sexo;
	private int idade;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

}
