package br.com.ufpb.projetolp.lojaconstrucao.excecoes;

public class SexoInvalidoException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public SexoInvalidoException(String mensagem) {
		super(mensagem);
	}

}
