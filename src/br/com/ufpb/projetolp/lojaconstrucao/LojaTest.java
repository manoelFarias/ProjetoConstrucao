package br.com.ufpb.projetolp.lojaconstrucao;

import static org.junit.Assert.*;

import org.junit.Test;

import br.com.ufpb.projetolp.lojaconstrucao.excecoes.ClienteExistenteException;
import br.com.ufpb.projetolp.lojaconstrucao.excecoes.FabricanteExistenteException;
import br.com.ufpb.projetolp.lojaconstrucao.excecoes.FuncionarioExistenteException;
import br.com.ufpb.projetolp.lojaconstrucao.excecoes.IdadeInvalidaException;
import br.com.ufpb.projetolp.lojaconstrucao.excecoes.ProdutoExistenteException;
import br.com.ufpb.projetolp.lojaconstrucao.excecoes.QuantidadeInvalidaException;
import br.com.ufpb.projetolp.lojaconstrucao.excecoes.SexoInvalidoException;
import br.com.ufpb.projetolp.lojaconstrucao.excecoes.ValorInvalidoException;

public class LojaTest {

	@Test(expected = QuantidadeInvalidaException.class)
	public void TratamentoExcecaoQuantInvalida() {
		Loja loja1 = new Loja(5, 5, 6, 1);
		Produto produto1 = new Produto();
		produto1.setQuant(-5);
		produto1.setPreco(1.50);
		loja1.FazerCompraCliente(produto1, -5);
		Produto produtoSalvo1 = (produto1);
		assertEquals(1.50, produtoSalvo1.getPreco(), 0.1);
		assertEquals("Quantidade Negativa", produtoSalvo1.getQuant());
	}

	@Test(expected = ValorInvalidoException.class)
	public void TratamentoExcecaoPrecoInvalido() {
		Loja loja1 = new Loja(2, 2, 2, 2);
		Produto produto1 = new Produto();
		produto1.setQuant(10);
		produto1.setPreco(-2.50);
		loja1.FazerCompraCliente(produto1, 10);
		Produto produtoSalvo1 = (produto1);
		assertEquals(10, produtoSalvo1.getQuant());
		assertEquals("Valor impossivel, está abaixo de R$ 0,00",
				produtoSalvo1.getPreco());
	}

	@Test(expected = IdadeInvalidaException.class)
	public void TratamentoExcecaoIdadeInvalida() {
		Loja loja1 = new Loja(5, 4, 5, 5);
		Funcionario funcionario1 = new Funcionario();
		funcionario1.setNome("Lidiane Paiva");
		funcionario1.setIdade(-1);
		loja1.validaIdadeFuncionario(funcionario1);
		Funcionario funcionarioSalvo1 = (funcionario1);
		assertEquals("Idade Inválida!!!!", funcionarioSalvo1.getIdade());

	}

	@Test(expected = SexoInvalidoException.class)
	public void TratamentoExcecaoHorarioFuncionario() {
		Loja loja1 = new Loja(5, 5, 5, 5);
		Funcionario funcionario1 = new Funcionario();
		funcionario1.setNome("Lidiane Paiva");
		funcionario1.setSexo("Indefinido");
		loja1.defineHorario(funcionario1);
		Funcionario funcionarioSalvo1 = (funcionario1);
		assertEquals("O Sexo informado é Invalido!!!",
				funcionarioSalvo1.getSexo());

	}

	@Test(expected = ProdutoExistenteException.class)
	public void TratarExcecaoProdutoExistente() {
		Loja loja1 = new Loja(3, 4, 3, 3);
		Produto produto1 = new Produto();
		Produto produto2 = new Produto();
		produto1.setNome("Parafuso 1/2");
		produto2.setNome("Parafuso 1/2");
		loja1.cadastrarProduto(produto1);
		loja1.cadastrarProduto(produto2);
		Produto produtoSalvo1 = (produto1);
		assertEquals("Parafuso 1/2", produtoSalvo1.getNome());
		assertEquals("O Produto Informado já foi Cadastrado Antes!!!",
				produto2.getNome());
	}

	@Test(expected = FuncionarioExistenteException.class)
	public void TratarExcecaoFuncionarioExistente() {
		Loja loja1 = new Loja(5, 4, 3, 3);
		Funcionario funcionario1 = new Funcionario();
		Funcionario funcionario2 = new Funcionario();
		funcionario1.setNome("Marcos Uchoa");
		funcionario1.setCpf("101.233.333-44");
		funcionario2.setNome("Marcos Uchoa");
		funcionario2.setCpf("101.233.333-44");
		loja1.cadastrarFuncionario(funcionario1);
		loja1.cadastrarFuncionario(funcionario2);
		Funcionario funcionarioSalvo1 = (funcionario1);
		assertEquals("101.233.333-44", funcionarioSalvo1.getCpf());
		assertEquals("Funcionário informado já está cadastrado!!!",
				funcionario2.getCpf());
	}

	@Test(expected = FabricanteExistenteException.class)
	public void TratarExcecaoFabricanteExistente() {
		Loja loja1 = new Loja(5, 4, 3, 3);
		Fabricante fabricante1 = new Fabricante();
		Fabricante fabricante2 = new Fabricante();
		fabricante1.setNomeFantasia("Tigre");
		fabricante1.setCnpj("0001.2233.2333-44");
		fabricante2.setNomeFantasia("Lidiane Paiva");
		fabricante2.setCnpj("0001.2233.2333-44");
		loja1.cadastrarFabricante(fabricante1);
		loja1.cadastrarFabricante(fabricante2);
		Fabricante fabricanteSalvo1 = (fabricante1);
		assertEquals("0001.2233.2333-44", fabricanteSalvo1.getCnpj());
		assertEquals("Fabricante informado já está cadastrado!!!",
				fabricante2.getCnpj());
	}

	@Test(expected = ClienteExistenteException.class)
	public void TratarExcecaoClienteExistente() {
		Loja loja1 = new Loja(3, 3, 3, 3);
		Cliente cliente1 = new Cliente();
		Cliente cliente2 = new Cliente();
		cliente1.setNome("Lidiane Paiva");
		cliente1.setCpf("733.233.333-44");
		cliente2.setNome("Lidiane Paiva");
		cliente2.setCpf("733.233.333-44");
		loja1.cadastrarCliente(cliente1);
		loja1.cadastrarCliente(cliente2);
		Cliente clienteSalvo1 = (cliente1);
		assertEquals("733.233.333-44", clienteSalvo1.getCpf());
		assertEquals("Cliente informado já está cadastrado!!!",
				cliente2.getCpf());
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
		produto1.setNome("Parafuso");
		produto2.setNome("Torneira");
		produto3.setNome("Calha");
		loja1.cadastrarProduto(produto1);
		loja1.cadastrarProduto(produto2);
		loja1.cadastrarProduto(produto3);
		Produto produtoSalvo1 = (produto1);
		Produto produtoSalvo2 = (produto2);
		Produto produtoSalvo3 = (produto3);
		assertEquals(produtoSalvo1, loja1.getProduto(0));
		assertEquals(produtoSalvo2, loja1.getProduto(1));
		assertEquals(produtoSalvo3, loja1.getProduto(2));
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
		produto1.setNome("Parafuso");
		produto1.setQuant(500);
		produto2.setNome("Torneira 3/4");
		produto2.setQuant(250);
		loja1.cadastrarProduto(produto1);
		loja1.cadastrarProduto(produto2);
		Produto produtoSalvo1 = (produto1);
		Produto produtoSalvo2 = (produto2);
		assertEquals(10, loja1.ReportarAlvaria(produtoSalvo1, 10));
		assertEquals(8, loja1.ReportarAlvaria(produtoSalvo2, 8));
	}
}