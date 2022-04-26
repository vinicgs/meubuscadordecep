package meubuscadordecep;

import java.util.Scanner;


public class Main {
	public static void main(String[] args) throws Exception {
		System.out.println("Informe seu cep");
		@SuppressWarnings("resource")
		String cep = new Scanner(System.in).nextLine();
		Endereco endereco = ServicoDeCep.buscaEnderecoPelo(cep);

		System.out.println("Logradouro: " + endereco.getLogradouro());
		System.out.println("Bairro: " + endereco.getBairro());
		System.out.println("Localidade: " + endereco.getLocalidade());

	}

}
