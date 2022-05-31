
	public class Main {

		public static void main(String[] args) {

			Cliente cliente1 = new Cliente();
			cliente1.setNome("UwUsca");
			Conta cc1 = new ContaCorrente(cliente1);
			Conta poupanca1 = new ContaPoupanca(cliente1);

			Cliente cliente2 = new Cliente();
			cliente2.setNome("jUwUliana");
			Conta cc2 = new ContaCorrente(cliente2);
			Conta poupanca2 = new ContaPoupanca(cliente2);

			cc1.depositar(100);
			cc1.sacar(50);

			cc1.imprimirExtrato();

			cc1.transferir(200, cc2);

			cc1.transferir(50, poupanca1);

			poupanca1.imprimirExtrato();

		}

	}

