package br.com.ufpb.projetolp.lojaconstrucao;

/**
 * Classe Produto
 * 
 * @author (Manoel, Liviany, Ewerton e João Leandro)
 * @version v2.0
 */
public class Produto {
	private String nome;
	private String categoria;
	private String marca;
	private String fabricante;
	private double preco;
	private int quant;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuant() {
		return quant;
	}

	public void setQuant(int quant) {
		this.quant = quant;
	}

}
