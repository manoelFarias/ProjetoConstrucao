package br.com.ufpb.projetolp.lojaconstrucao.excecoes;

public class FuncionarioExistenteException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public FuncionarioExistenteException(String mensagem) {
		super(mensagem);
	}

}
