package br.com.ufpb.projetolp.lojaconstrucao;

/**
 * Classe Fabricante
 * 
 * @author (Manoel, Liviany, Ewerton, Jo�o Leandro)
 * @version v2.0
 */
public class Fabricante {
	// vari�veis de inst�ncia
	private String nomeFantasia;
	private String cnpj;

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
}
