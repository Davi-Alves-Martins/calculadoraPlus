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
            System.out.println("\n ----------\n Olá, ".toUpperCase() + scannerusu.toUpperCase() + "." + "\n seja bem vindo a Calculadora Plus!\n ---------- ".toUpperCase()); 
            
            System.out.println("----------\nQual operação deseja realizar?\n1- Calculadora Básica\n2- Raiz Quadrada/Cubica\n3- Valor de PI\n0- Sair\n----------");
            int scanneroperacao = scannergeral.nextInt();

        
            while(scanneroperacao == 1){
                System.out.println("\n---------- Digite o primeiro número: ----------".toUpperCase());
                double numero1 = scannergeral.nextDouble();

                System.out.println("\n----------\n Digite a operação:\n Adição: +\n Subtração: -\n Multiplicação: *\n Divisão: /\n Exponenciação: ^\n ----------".toUpperCase());
                String operacao = scannergeral.next();

                System.out.println("\n---------- Digite o segundo número: ----------".toUpperCase());
                double numero2 = scannergeral.nextDouble();

                    switch(operacao){
                        case "+":
                            System.out.println(" ----------\n CALCULANDO...\n ----------");
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
                            System.out.println("O resultado da exponenciação é: " + (Math.pow(numero1, numero2)));
                            break;

                
                        default:
                            System.out.println("\nOperação inválida.");
                            break;
                    }

                System.out.println("\n ---------- Deseja realizar outra operação? ----------");
                scannergeral.nextLine();
                String resposta = scannergeral.nextLine().toUpperCase();

                while(!resposta.equals("N") && !resposta.equals("NAO") && !resposta.equals("S") && !resposta.equals("SIM")){
                    System.out.println("Seja preciso meu brother!.\nDigite (Sim ou Nao) ");
                    resposta = scannergeral.nextLine().toUpperCase();
                    }
                
                scanneroperacao = resposta.equalsIgnoreCase("sim") || resposta.equalsIgnoreCase("s")? 1: 0;
            
            }

            while(scanneroperacao == 2){
                System.out.println("----------\nDigite o número para descobrir a Raiz:\n");
                int scannernumeroraiz = scannergeral.nextInt();
                scannergeral.nextLine();
                System.out.println("----------");
                System.out.println("----------\nQual raiz você deseja descobrir?\nRaiz Quadrada: ^2\nRaiz Cúbica: ^3\n----------");
                String scanneroperacaoraiz = scannergeral.nextLine();

                
                if(scanneroperacaoraiz.equals("^2")){
                    System.out.println("Calculando resultado...");
                    System.out.println("-----------\nO resultado da Raiz Quadrada do número: " + scannernumeroraiz + " é: " + Math.sqrt(scannernumeroraiz));
                }
                else if(scanneroperacaoraiz.equals("^3")){
                    System.out.println("Calculando resultado...");
                    System.out.println("-----------\nO resultado da Raiz Cúbica do número: " + scannernumeroraiz + " é: " + Math.cbrt(scannernumeroraiz));
                }
                else{
                    System.out.println("Operação inválida.");
                    System.out.println("Encerrando programa...");
                    break;
                }
                
                System.out.println("\n ---------- Deseja realizar outra operação? ----------");
                String resposta = scannergeral.nextLine().toUpperCase();

                while(!resposta.equals("N") && !resposta.equals("NAO") && !resposta.equals("S") && !resposta.equals("SIM")){
                    System.out.println("Seja preciso meu brother!.\nDigite (Sim ou Nao) ");
                    resposta = scannergeral.nextLine().toUpperCase();
                    }
                
                scanneroperacao = resposta.equalsIgnoreCase("sim") || resposta.equalsIgnoreCase("s")? 2: 0; 
                
            }

            if(scanneroperacao == 3){
                System.out.println("----------");
                System.out.println("O valor de PI é igual a: " + Math.PI);
                
            }

            else if(scanneroperacao == 0){
                System.out.println("----------\nSaindo do programa...\n----------");
            }
            
                System.out.println("\n---------- FIM DA OPERAÇÃO ----------");
            
                    scannergeral.close();

        }
    }
}