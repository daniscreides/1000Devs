import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String palavra = pegarPalavraAleatoria();
        if (palavra.isEmpty()) {
            System.out.println("Não foi possível carregar a palavra. Encerrando o jogo.");
            scanner.close();
            return;
        }

        char[] letrasDescobertas = new char[palavra.length()];
        Arrays.fill(letrasDescobertas, '_');

        ArrayList<Character> letrasUsadas = new ArrayList<>();
        int numTentativa = 6;
        boolean palavraCompleta = false;

        limparConsole();

        // Desenha a forca e palavra inicialmente
        mostrarStatus(letrasUsadas, numTentativa, 1);
        exibirForca(numTentativa);
        mostrarPalavra(letrasDescobertas, 10);
        mostrarPrompt();

        while (numTentativa > 0 && !palavraCompleta) {

            // Solicita letra do usuário
            char letra = ' ';
            boolean entradaValida = false;
            while (!entradaValida) {
                // Limpa linha do prompt e mensagem de erro
                System.out.print("\033[12;0H\033[2K"); // Prompt
                System.out.print("\033[13;0H\033[2K"); // Mensagem de erro
                System.out.print("Digite uma letra: ");

                String entrada = scanner.nextLine().trim().toLowerCase(); // Garante que Enter sozinho não funcione

                if (entrada.length() == 1 && Character.isLetter(entrada.charAt(0))) {
                    letra = entrada.charAt(0);
                    entradaValida = true;
                } else {
                    System.out.print("\033[13;0H\033[2K");
                    System.out.print("Entrada inválida! Digite apenas uma letra.");
                }
            }

            // Verifica se a letra já foi usada
            if (letrasUsadas.contains(letra)) {
                System.out.print("\033[13;0H\033[2K");
                System.out.print("Você já digitou essa letra! Pressione Enter para continuar...");
                scanner.nextLine();
                mostrarPrompt();
                continue;
            }

            letrasUsadas.add(letra);

            // Verifica se acertou
            if (palavra.contains(String.valueOf(letra))) {
                for (int i = 0; i < palavra.length(); i++) {
                    if (palavra.charAt(i) == letra) {
                        letrasDescobertas[i] = letra;
                    }
                }
            } else {
                numTentativa--;
            }

            // Atualiza todas as áreas
            mostrarStatus(letrasUsadas, numTentativa, 1);
            exibirForca(numTentativa);
            mostrarPalavra(letrasDescobertas, 10);
            mostrarPrompt();

            // Verifica se a palavra foi completa
            palavraCompleta = true;
            for (char c : letrasDescobertas) {
                if (c == '_') {
                    palavraCompleta = false;
                    break;
                }
            }
        }

        // Resultado final
        System.out.print("\033[12;0H\033[2K"); // Limpa prompt
        System.out.print("\033[13;0H\033[2K"); // Limpa mensagem
        mostrarStatus(letrasUsadas, numTentativa, 1);
        exibirForca(numTentativa);
        mostrarPalavra(letrasDescobertas, 10);
        System.out.print("\033[12;0H"); // Linha do resultado
        if (palavraCompleta) {
            System.out.println("Parabéns! Você venceu.");
        } else {
            System.out.println("Você perdeu.");
        }
        System.out.println("A palavra era: " + palavra);

        scanner.close();
    }

    // 🔧 Método ajustado com caminho completo
    public static String pegarPalavraAleatoria() {
        // Caminho completo do arquivo (ajustado para o seu Mac)
        String caminhoArquivo = "/Users/Dani/Documents/Mesttra1000Devs/Java/Exercicios03/JogoDaVelha/JogoVelha/src/palavras.txt";

        File arquivo = new File(caminhoArquivo);
        ArrayList<String> listaPalavras = new ArrayList<>();

        try (Scanner scanner = new Scanner(arquivo)) {
            while (scanner.hasNextLine()) {
                listaPalavras.add(scanner.nextLine());
            }
            Random random = new Random();
            return listaPalavras.get(random.nextInt(listaPalavras.size())).toLowerCase();
        } catch (FileNotFoundException e) {
            System.err.println("Arquivo não encontrado: " + e.getMessage());
            return "";
        }
    }

    public static void limparConsole() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void exibirForca(int tentativas) {
        String[] forca = {
            """
            +---+
            |   |
                |
                |
                |
                |
            =========
            """,
            """
            +---+
            |   |
            O   |
                |
                |
                |
            =========
            """,
            """
            +---+
            |   |
            O   |
            |   |
                |
                |
            =========
            """,
            """
            +---+
            |   |
            O   |
           /|   |
                |
                |
            =========
            """,
            """
            +---+
            |   |
            O   |
           /|\\  |
                |
                |
            =========
            """,
            """
            +---+
            |   |
            O   |
           /|\\  |
           /    |
                |
            =========
            """,
            """
            +---+
            |   |
            O   |
           /|\\  |
           / \\  |
                |
            =========
            """
        };
        System.out.print("\033[3;0H"); // Linha da forca
        System.out.println(forca[6 - tentativas]);
    }

    public static void mostrarPalavra(char[] letras, int linha) {
        System.out.print("\033[" + linha + ";0H\033[2K");
        String palavraFormatada = "";
        for (char c : letras) {
            palavraFormatada += c + " ";
        }
        System.out.println(palavraFormatada);
    }

    public static void mostrarStatus(ArrayList<Character> letrasUsadas, int vidas, int linha) {
        System.out.print("\033[" + linha + ";0H\033[2K");
        String letrasTentadasString = "";
        for (char c : letrasUsadas) {
            letrasTentadasString += c + " ";
        }
        System.out.println("Letras já tentadas: " + letrasTentadasString);
        System.out.print("\033[" + (linha + 1) + ";0H\033[2K");
        System.out.println("Vidas restantes: " + vidas);
    }

    public static void mostrarPrompt() {
        System.out.print("\033[12;0H\033[2K");
        System.out.print("Digite uma letra: ");
    }
}
