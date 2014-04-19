package br.com.ufpb.projetolp.lojaconstrucao;

import br.com.ufpb.projetolp.lojaconstrucao.excecoes.QuantidadeInvalidaException;
import br.com.ufpb.projetolp.lojaconstrucao.excecoes.ValorInvalidoException;
import br.com.ufpb.projetolp.lojaconstrucao.excecoes.SexoInvalidoException;
import br.com.ufpb.projetolp.lojaconstrucao.excecoes.IdadeInvalidaException;
import br.com.ufpb.projetolp.lojaconstrucao.excecoes.ProdutoExistenteException;
import br.com.ufpb.projetolp.lojaconstrucao.excecoes.FuncionarioExistenteException;
import br.com.ufpb.projetolp.lojaconstrucao.excecoes.ClienteExistenteException;
import br.com.ufpb.projetolp.lojaconstrucao.excecoes.FabricanteExistenteException;

/**
 * Classe Loja
 * 
 * @author (Manoel, Liviany, Ewerton e Jo�o Leandro)
 * @version v2.0
 */
public class Loja {
	// Atributos ===>
	private Produto[] produtos;
	private Cliente[] clientes;
	private Funcionario[] funcionarios;
	private Fabricante[] fabricantes;
	private int contFabricantes;
	private int contProdutos;
	private int contClientes;
	private int contFuncionarios;
	private final int IDADE_MINIMO = 18;

	// Inicializa��o dos Arrays ===>
	public Loja(int quantProduto, int quantCliente, int quantFuncionario,
			int quantFabricante) {
		// Construtor da Classe principal.
		produtos = new Produto[quantProduto];
		clientes = new Cliente[quantCliente];
		funcionarios = new Funcionario[quantFuncionario];
		fabricantes = new Fabricante[quantFabricante];
	}

	// Fazer Compra do Cliente ===>
	public double FazerCompraCliente(Produto produto, int quantidade) {
		double valorCompra;
		if (produto.getPreco() < 0) {
			throw new ValorInvalidoException(
					"Valor impossivel, est� abaixo de R$ 0,00");
		} else if (quantidade < 0) {
			throw new QuantidadeInvalidaException("Quantidade Negativa");
		} else {
			valorCompra = produto.getPreco() * quantidade;
			return valorCompra;
		}
	}

	// Alvaria ===>
	public int ReportarAlvaria(Produto produto, int quant) {
		if (quant < 0) {
			throw new QuantidadeInvalidaException("Quantidade Negativa!!!");
		} else {
			return quant;
		}
	}

	// Definir Horario do Funcionario ===>
	public String defineHorario(Funcionario funcionario) {
		if ((funcionario.getSexo() != "feminino")
				&& (funcionario.getSexo() != "masculino")) {
			throw new SexoInvalidoException("O Sexo informado � Invalido!!!");
		} else if (funcionario.getSexo() == "feminino") {
			return "Hor�rio Diurno";
		} else {
			return "Hor�rio Noturno";
		}
	}

	// Valida��o da idade do funcionario
	public String validaIdadeFuncionario(Funcionario funcionario) {
		if (funcionario.getIdade() < 0) {
			throw new IdadeInvalidaException("Idade Inv�lida!!!!");
		} else if (funcionario.getIdade() < IDADE_MINIMO) {
			return "Funcion�rio N�o pode ser Contratado!!!!";
		} else {
			return "Parab�ns Contratado!!!";
		}
	}

	// Cadastrar o Produto
	public void cadastrarProduto(Produto novoProduto) {
		for (Produto produtoAntigo : produtos) {

			if ((produtoAntigo != null)
					&& (produtoAntigo.getNome() == novoProduto.getNome())) {
				throw new ProdutoExistenteException(
						"O Produto Informado j� foi Cadastrado Antes!!!");
			}
		}
		produtos[contProdutos++] = novoProduto;
	}

	// Cadastrar Funcionario
	public void cadastrarFuncionario(Funcionario novoFuncionario) {
		for (Funcionario funcionarioAntigo : funcionarios) {

			if ((funcionarioAntigo != null)
					&& (funcionarioAntigo.getCpf() == novoFuncionario.getCpf())) {
				throw new FuncionarioExistenteException(
						"Funcionario Informado j� est� Cadastrado");
			}
		}
		funcionarios[contFuncionarios++] = novoFuncionario;
	}

	// Cadastrar Cliente
	public void cadastrarCliente(Cliente novoCliente) {
		for (Cliente clienteAntigo : clientes) {

			if ((clienteAntigo != null)
					&& (clienteAntigo.getCpf() == novoCliente.getCpf())) {
				throw new ClienteExistenteException(
						"Cliente informado j� est� cadastrado!!!");
			}
		}
		clientes[contClientes++] = novoCliente;
	}

	// Cadastrar Fabricante
	public void cadastrarFabricante(Fabricante novoFabricante) {
		for (Fabricante fabricanteAntigo : fabricantes) {

			if ((fabricanteAntigo != null)
					&& (fabricanteAntigo.getCnpj() == novoFabricante.getCnpj())) {
				throw new FabricanteExistenteException(
						"O Fabricante Informado j� est� cadastrado!!!");
			}
		}
		fabricantes[contFabricantes++] = novoFabricante;
	}

	public Produto getProduto(int posicao) {
		return produtos[posicao];
	}

	public Fabricante getFabricante(int posicao) {
		return fabricantes[posicao];
	}

	public Funcionario getFuncionario(int posicao) {
		return funcionarios[posicao];
	}

	public Cliente getCliente(int posicao) {
		return clientes[posicao];
	}

	public Produto[] getProdutos() {
		return produtos;
	}

	public Cliente[] getClientes() {
		return clientes;
	}

	public Funcionario[] getFuncionarios() {
		return funcionarios;
	}

	public Fabricante[] getFabricantes() {
		return fabricantes;
	}

	public int getCapacidadeFabricantes() {
		return fabricantes.length;
	}

	public int getCapacidadeProdutos() {
		return produtos.length;
	}

	public int getCapacidadeFuncionarios() {
		return funcionarios.length;
	}

	public int getCapacidadeClientes() {
		return clientes.length;
	}

}