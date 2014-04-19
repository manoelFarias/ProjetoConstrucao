package br.com.ufpb.projetolp.lojaconstrucao.excecoes;

public class ProdutoExistenteException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public ProdutoExistenteException(String mensagem) {
		super(mensagem);
	}
}
