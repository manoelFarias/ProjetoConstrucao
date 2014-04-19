package br.com.ufpb.projetolp.lojaconstrucao;

/**
 * Classe Fabricante
 * 
 * @author (Manoel, Liviany, Ewerton, João Leandro)
 * @version v2.0
 */
public class Fabricante {
	// variáveis de instância
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
