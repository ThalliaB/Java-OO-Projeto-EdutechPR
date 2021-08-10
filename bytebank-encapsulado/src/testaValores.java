
public class testaValores {

	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24226);

		System.out.println(conta.getAgencia());
		
		conta.setAgencia(123121);
		
		Conta conta2 = new Conta(1337, 15649);
		Conta conta3 = new Conta(2112, 14660);
		
		System.out.println(Conta.getTotal());
	}
}
