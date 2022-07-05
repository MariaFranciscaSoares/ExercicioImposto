package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Pessoa> list = new ArrayList<>();

		System.out.print("Digite o número de contribuintes: ");
		int contribuintes = sc.nextInt();

		for (int i = 1; i <= contribuintes; i++) {
			System.out.println("Dados do contribuinte 0" + i + ":");
			System.out.print("Pessoa Jurídica ou Física (j/f)? ");
			char pessoa = sc.next().charAt(0);
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Renda anual: ");
			double renda = sc.nextDouble();

			if (pessoa == 'f') {
				System.out.print("Despesas de saúde: ");
				double gastosSaude = sc.nextDouble();
				list.add(new PessoaFisica(nome, renda, gastosSaude));
			}

			else {
				System.out.print("Número de funcionários: ");
				int funcionarios = sc.nextInt();
				list.add(new PessoaJuridica(nome, renda, funcionarios));
			}
		}

		System.out.println();
		System.out.println("IMPOSTOS PAGOS: ");

		for (Pessoa pessoa : list) {
			System.out.println(pessoa.getNome() + ": $ " + String.format("%.2f", pessoa.imposto()));
		}

		double soma = 0;
		for (Pessoa pessoa : list) {
			soma += pessoa.imposto();
		}

		System.out.println();
		System.out.println("IMPOSTOS TOTAIS: $ " + soma);

		sc.close();

	}

}
