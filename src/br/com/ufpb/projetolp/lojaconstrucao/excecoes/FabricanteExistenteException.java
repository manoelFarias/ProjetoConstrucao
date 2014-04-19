package br.com.ufpb.projetolp.lojaconstrucao.excecoes;

public class FabricanteExistenteException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public FabricanteExistenteException(String mensagem) {
		super(mensagem);

	}
}
