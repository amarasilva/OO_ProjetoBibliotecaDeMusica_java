package APP;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Biblioteca b = new Biblioteca();

		int op;

		do {

			System.out.println("1 - Cadastrar Artista");
			System.out.println("2 - Exibir Artista");
			System.out.println("3 - Ver quantidade de Artistas");
			System.out.println("4 - Apagar todos os Artistas");
			System.out.println("5 - Exibir Artistas e Albuns");
			System.out.println("0 - Sair");

			op = sc.nextInt();
			switch (op) {

			case 1:
				Artista al = new Artista();
				System.out.println("Digite o nome do Artista: ");
				sc.nextLine();
				al.setNome(sc.nextLine());

				System.out.println("Digite o nome nome do Album: ");
				al.setAlbum(sc.nextLine());

				b.cadastrarArtista(al);

				System.out.println("\nCadastro do artista efetuado! \n");
				break;

			case 2:

				if (b.getArtistas().isEmpty()) {
					System.out.println("Não há artistas cadastrados");
				} else {

					String nome;
					System.out.println("informe o nome do artista para buscar: ");
					sc.nextLine();
					nome = sc.nextLine();

					b.buscaArtista(nome);
					
				}
				break;

			case 3:

				System.out.println("Total de Artistas: " + b.quantidadeDeArtistas());
				break;

			case 4:

				if (b.getArtistas().isEmpty()) {

					System.out.println("Não há Artistas");

				} else {

					int escolha;

					System.out.println("Limpar todos os cadastros de Artistas?\nl-SIM\n2-NAO");

					escolha = sc.nextInt();

					if (escolha == 1) {
						b.apagarTudo();
						System.out.println("lista de artistas vazia");

					} else {

						System.out.println("cancelada a exclusão.");

					}
				}
				break;

			case 5:
				b.exibirTudo();
				break;

			case 0:
				System.out.println("Sistema encerrado.");
				break;

			default:
				System.out.println("Opcao inválida.");

			}

		} while (op != 0);
	}
}