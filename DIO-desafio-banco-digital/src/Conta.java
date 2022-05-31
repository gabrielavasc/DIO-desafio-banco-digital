
	public abstract class Conta implements IConta{
		
		private static final int AGENCIA_PADRAO = 1;
		private static int SEQUENCIAL = 1;
		protected int agencia;
		protected int numero;
		protected double saldo;
		protected Cliente cliente;
		
		public Conta(Cliente cliente) {
			this.agencia = Conta.AGENCIA_PADRAO;
			this.numero = SEQUENCIAL++;
			this.cliente = cliente;
		}
		
		@Override
		public void sacar(double valor) {
			if(valor > this.saldo) {
				System.out.println("Saldo insuficiente para saque!"+ "\n");
			} else {
				this.saldo -= valor;
				System.out.println("Saque de " + valor + " feito com sucesso da conta de " + this.cliente.getNome() + "\n");
			}
			
		}
		@Override
		public void depositar(double valor) {
			this.saldo += valor;
			System.out.println("Deposito de " + valor + " feito com sucesso na conta de " + this.cliente.getNome()+ "\n");
		}
		@Override
		public void transferir(double valor, Conta contaDestino) {
			if(valor > saldo) {
				System.out.println("Saldo insuficiente para transferencia!"+ "\n");
			} else {
				this.sacar(valor);
			contaDestino.depositar(valor);
			}
		}
		
		protected void imprimirInfosComuns() {
			System.out.println(String.format("Titular: %s", this.cliente.getNome()));
			System.out.println(String.format("Agencia: %d", this.agencia));
			System.out.println(String.format("Numero: %d", this.numero));
			System.out.println(String.format("Saldo: %.2f", this.saldo) + "\n");
		}
		
		public int getAgencia() {
			return agencia;
		}
		public int getNumero() {
			return numero;
		}
		public double getSaldo() {
			return saldo;
		}

	}
	
