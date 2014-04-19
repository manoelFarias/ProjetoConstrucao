package br.com.ufpb.projetolp.lojaconstrucao;

import static org.junit.Assert.*;
import org.junit.Test;

public class LojaTest {

	@Test
	public void CadastraUmProduto() {
		Loja loja1 = new Loja(2, 0, 0, 0);
		Produto produto1 = new Produto();
		produto1.getNome();
		produto1.getCategoria();

	}

	@Test
	public void ListaFuncionariosCadastrados() {
		Loja loja1 = new Loja(0, 0, 5, 1);
		Funcionario funcionario1 = new Funcionario();
		Funcionario funcionario2 = new Funcionario();
		Funcionario funcionario3 = new Funcionario();
		funcionario1.setNome("Ewerton Guedes");
		funcionario1.setCpf("777.333.444-55");
		funcionario2.setNome("João Leandro");
		funcionario2.setCpf("333.444.222-54");
		funcionario3.setNome("Rodrigo Vilar");
		funcionario3.setCpf("111.222.333-44");
		loja1.cadastrarFuncionario(funcionario1);
		loja1.cadastrarFuncionario(funcionario2);
		loja1.cadastrarFuncionario(funcionario3);
		assertEquals(5, loja1.getCapacidadeFuncionarios());
		Funcionario[] funcionarios = loja1.getFuncionarios();
		assertEquals("Ewerton Guedes", funcionarios[0].getNome());
		assertEquals("João Leandro", funcionarios[1].getNome());
		assertEquals("Rodrigo Vilar", funcionarios[2].getNome());

	}

	@Test
	public void ListaClientesCadastrados() {
		Loja loja1 = new Loja(3, 3, 3, 1);
		Cliente cliente1 = new Cliente();
		Cliente cliente2 = new Cliente();
		Cliente cliente3 = new Cliente();
		cliente1.setNome("Liviany");
		cliente1.setCpf("555.444.333-22");
		cliente2.setNome("Manoel");
		cliente2.setCpf("666.444.333-11");
		cliente3.setNome("Ewerton");
		cliente3.setCpf("777.888.999-54");
		loja1.cadastrarCliente(cliente1);
		loja1.cadastrarCliente(cliente2);
		loja1.cadastrarCliente(cliente3);
		assertEquals(3, loja1.getCapacidadeFuncionarios());
		Cliente[] clientes = loja1.getClientes();
		assertEquals("Liviany", clientes[0].getNome());
		assertEquals("Manoel", clientes[1].getNome());
		assertEquals("Ewerton", clientes[2].getNome());

	}

	@Test
	public void PosicaoProdutos() {// teste para verificar a posição de cada
									// produto e capacidade de produtos.
		Loja loja1 = new Loja(5, 0, 0, 0);
		Produto produto1 = new Produto();
		Produto produto2 = new Produto();
		Produto produto3 = new Produto();
		loja1.cadastrarProduto(produto1);
		loja1.cadastrarProduto(produto2);
		loja1.cadastrarProduto(produto3);
		assertEquals(produto1, loja1.getProduto(0));
		assertEquals(produto2, loja1.getProduto(1));
		assertEquals(produto3, loja1.getProduto(2));
		assertEquals(5, loja1.getCapacidadeProdutos());

	}

	@Test
	public void PosicaoFuncionarios() {// testando posição do funcionario e cpf
										// do funcionario.
		Loja loja1 = new Loja(0, 0, 5, 0);
		Funcionario funcionario1 = new Funcionario();
		Funcionario funcionario2 = new Funcionario();
		Funcionario funcionario3 = new Funcionario();
		funcionario1.setCpf("1");
		funcionario2.setCpf("2");
		funcionario3.setCpf("3");
		loja1.cadastrarFuncionario(funcionario1);
		loja1.cadastrarFuncionario(funcionario2);
		loja1.cadastrarFuncionario(funcionario3);
		assertEquals(funcionario1, loja1.getFuncionario(0));
		assertEquals(funcionario2, loja1.getFuncionario(1));
		assertEquals(funcionario3, loja1.getFuncionario(2));
		assertEquals(5, loja1.getCapacidadeFuncionarios());
		Funcionario[] funcionarios = loja1.getFuncionarios();
		assertNotNull(funcionarios[0]);
		assertNotNull(funcionarios[1]);
		assertNotNull(funcionarios[2]);
	}

	@Test
	public void PosicaoClientes() {// testando posição dos clientes e também seu
									// cpf.
		Loja loja1 = new Loja(1, 5, 1, 0);
		Cliente cliente1 = new Cliente();
		Cliente cliente2 = new Cliente();
		Cliente cliente3 = new Cliente();
		cliente1.setCpf("1");
		cliente2.setCpf("2");
		cliente3.setCpf("3");
		loja1.cadastrarCliente(cliente1);
		loja1.cadastrarCliente(cliente2);
		loja1.cadastrarCliente(cliente3);
		assertEquals(cliente1, loja1.getCliente(0));
		assertEquals(cliente2, loja1.getCliente(1));
		assertEquals(cliente3, loja1.getCliente(2));
		Cliente[] clientes = loja1.getClientes();
		assertNotNull(clientes[0]);
		assertNotNull(clientes[1]);
		assertNotNull(clientes[1]);
	}

	@Test
	public void tresClientes() {// testando dois clientes com cpfs diferentes.
		Loja loja1 = new Loja(5, 3, 1, 0);
		Cliente cliente1 = new Cliente();
		cliente1.setCpf("333.555.222-11");
		Cliente cliente2 = new Cliente();
		cliente2.setCpf("111.222.333-22");
		loja1.cadastrarCliente(cliente1);
		loja1.cadastrarCliente(cliente2);
		Cliente[] clientes = loja1.getClientes();
		assertEquals("333.555.222-11", clientes[0].getCpf());
		assertEquals(cliente1, clientes[0]);
		assertEquals(cliente2, clientes[1]);
		assertNotNull(clientes[0]);
		assertNotNull(clientes[1]);
	}

	@Test
	public void TresFuncionario() {// Testando o Cpf do funcionario.
		Loja loja1 = new Loja(5, 3, 3, 2);
		Funcionario funcionario1 = new Funcionario();
		funcionario1.setCpf("222.333.222-12");
		Funcionario funcionario2 = new Funcionario();
		funcionario2.setCpf("231.222.333-33");
		Funcionario funcionario3 = new Funcionario();
		funcionario3.setCpf("111.222.333-62");
		loja1.cadastrarFuncionario(funcionario1);
		loja1.cadastrarFuncionario(funcionario2);
		loja1.cadastrarFuncionario(funcionario3);
		Funcionario[] funcionarios = loja1.getFuncionarios();
		assertNotNull(funcionarios[0]);
		assertNotNull(funcionarios[1]);
		assertNotNull(funcionarios[2]);

	}

	@Test
	public void TesteCompraCliente() {// teste para verificar a compra de um
										// cliente.
		Loja loja1 = new Loja(5, 5, 6, 1);
		Produto produto1 = new Produto();
		produto1.setQuant(50);
		produto1.setPreco(5.6);
		Produto produtoSalvo1 = (produto1);
		assertEquals(50, produtoSalvo1.getQuant());
		assertEquals(5.6, produtoSalvo1.getPreco(), 0.1);
		assertEquals(28, loja1.FazerCompraCliente(produto1, 5), 0.1);
	}

	@Test
	public void TesteHorárioEIdade() {// testando o cadastro de um funcionário e
										// fazendo o teste quanto seu horário e
										// sua idade.
		Funcionario funcionario1 = new Funcionario();
		Loja loja1 = new Loja(1, 1, 1, 1);
		funcionario1.setSexo("feminino");
		funcionario1.setIdade(21);
		loja1.cadastrarFuncionario(funcionario1);
		Funcionario funcionarioSalvo = (funcionario1);
		assertEquals("feminino", funcionarioSalvo.getSexo());
		assertEquals(21, funcionarioSalvo.getIdade());
		assertEquals("Horário Diurno", loja1.defineHorario(funcionario1));
		assertEquals("Parabéns Contratado!!!",
				loja1.validaIdadeFuncionario(funcionario1));
	}

	@Test
	public void ReportarAlvaria() {// testando Alvaria para um produto.
		Loja loja1 = new Loja(5, 4, 3, 1);
		Produto produto1 = new Produto();
		produto1.setNome("Armario");
		produto1.setQuant(100);
		loja1.cadastrarProduto(produto1);
		Produto produtoSalvo = (produto1);
		assertEquals(10, loja1.ReportarAlvaria(produtoSalvo, 10));
	}

	@Test
	public void ReportarMaisAlvaria() {// testanto o cadastro de Alvaria para
										// dois produtos diferentes.
		Loja loja1 = new Loja(5, 0, 0, 0);
		Produto produto1 = new Produto();
		Produto produto2 = new Produto();
		loja1.cadastrarProduto(produto1);
		loja1.cadastrarProduto(produto2);
		assertEquals(10, loja1.ReportarAlvaria(produto1, 10));
		assertEquals(8, loja1.ReportarAlvaria(produto2, 8));
	}
}