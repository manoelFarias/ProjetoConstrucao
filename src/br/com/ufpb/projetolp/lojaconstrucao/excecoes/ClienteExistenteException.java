package br.com.ufpb.projetolp.lojaconstrucao.excecoes;

public class ClienteExistenteException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public ClienteExistenteException(String mensagem) {
		super(mensagem);
	}

}
