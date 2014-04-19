package br.com.ufpb.projetolp.lojaconstrucao.excecoes;

public class IdadeInvalidaException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public IdadeInvalidaException(String mensagem) {
		super(mensagem);
	}

}
