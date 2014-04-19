package br.com.ufpb.projetolp.lojaconstrucao.excecoes;

public class QuantidadeInvalidaException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public QuantidadeInvalidaException(String mensagem) {
		super(mensagem);
	}

}
