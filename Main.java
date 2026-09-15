import java.util.Scanner;

public class Main{
    public static void main(String [] args){
        System.out.println("---------- CARREGANDO TELA DE LOGIN... ----------\n");

        Scanner scannergeral = new Scanner(System.in);

        String usuario_correto = "Davi";
        String senha_correta = "1234";

        System.out.println("++++ Digite seu nome de usuário: ++++");
        String scannerusu = scannergeral.nextLine();

        System.out.println("++++ Digite sua senha ++++");
        String scannersenha = scannergeral.nextLine();

        int tentativas = 0;
            while (!usuario_correto.equals(scannerusu) || !senha_correta.equals(scannersenha) && tentativas <=2 ) {
                if(tentativas >= 2){
                    System.out.println("---------- Número de tentativas excedeu o limite. ----------");
                    System.out.println("\n---------- FIM DA OPERAÇÃO ----------");
                    break;
                }
                else{
                    System.out.println("\n--- Usuário ou senha incorreto. ---");

                    System.out.println("\n++++ Digite seu nome de usuário: ++++");
                    scannerusu = scannergeral.nextLine();

                    System.out.println("\n++++ Digite sua senha ++++");
                    scannersenha = scannergeral.nextLine();
                    tentativas += 1;
                }
            
            }
            
        if(senha_correta.equals(scannersenha) && usuario_correto.equals(scannerusu)){  
            System.out.println("\n---------- Login realizado com sucesso! ----------");

            System.out.println("\n---------- Iniciando programa... ----------");
            System.out.println("\n---------- Olá, ".toUpperCase() + scannerusu.toUpperCase() + " seja bem vindo a Calculadora Plus! ---------- ".toUpperCase());   

            boolean continuar = true;

            while(continuar){
                System.out.println("\n---------- Digite o primeiro número: ----------".toUpperCase());
                double numero1 = scannergeral.nextDouble();

                System.out.println("\n---------- Digite a operação: (+, -, *, /, ^) ----------".toUpperCase());
                String operacao = scannergeral.next();

                System.out.println("\n---------- Digite o segundo número: ----------".toUpperCase());
                double numero2 = scannergeral.nextDouble();

                    switch(operacao){
                        case "+":
                            System.out.println("---------- CALCULANDO... ----------");
                            System.out.println("\nO resultado da soma é: " + (numero1 + numero2));
                            break;

                        case "-":
                            System.out.println("\n---------- CALCULANDO... ----------");
                            System.out.println("\nO resultado da subtração é: " + (numero1 - numero2));
                            break;

                        case "*":
                            System.out.println("\n---------- CALCULANDO... ----------");
                            System.out.println("\no resultado da multiplicação é: " + (numero1 * numero2));
                            break;

                        case "/":
                            if(numero2 == 0){
                                System.out.println("\nErro. Escolha um denominador diferente de 0 para esta operação.".toUpperCase());
                                break;
                            }

                            else{
                                System.out.println("\n---------- CALCULANDO... ----------");
                                System.out.println("\nO resultado da divisão é: " + (numero1 / numero2));
                                System.out.println("\n O resto da divisão é: " + (numero1 % numero2));
                                break;
                            }
                        case "^":
                            System.out.println("O resultado da potenciação é: " + (Math.pow(numero1, numero2)));
                            break;
                
                        default:
                            System.out.println("\nOperação inválida.");
                            break;
                    }

                System.out.println("\n ---------- Deseja realizar outra operação? ----------");
                scannergeral.nextLine();
                String resposta = scannergeral.nextLine().toUpperCase();

                while(!resposta.equals("N") && !resposta.equals("NAO") && !resposta.equals("S") && !resposta.equals("SIM") && !resposta.equals("NÃO")){
                    System.out.println("Seja preciso meu brother!.\nDigite (Sim ou Nao) ");
                    resposta = scannergeral.nextLine().toUpperCase();
                    }
                
                continuar = resposta.equalsIgnoreCase("sim") || resposta.equalsIgnoreCase("s");
            
            }
                System.out.println("\n---------- FIM DA OPERAÇÃO ----------");
            
                    scannergeral.close();

        }
    }
}