package br.com.ufpb.projetolp.lojaconstrucao;

/**
 * Classe Cliente
 * 
 * @author (Manoel, Liviany, Ewerton e João Leandro)
 * @version v2.0
 */
public class Cliente {
	private String nome;
	private String id;
	private String cpf;
	private String endereco;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
