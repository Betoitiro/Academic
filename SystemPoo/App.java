package SystemPoo;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        RegisterPatient rp = new RegisterPatient("", "", "", "");
        List<RegisterSpecalist> doctors = new ArrayList<>();
        boolean running = true;

        while (running) {
            System.out.println("Menu:");
            System.out.println("1. Adicionar Paciente");
            System.out.println("2. Exibir Paciente");
            System.out.println("3. Cadastrar Médico");
            System.out.println("4. Exibir Médicos");
            System.out.println("5. Escolher Médico");
            System.out.println("6. Escolher Forma de Pagamento");
            System.out.println("7. Sair");
            System.out.print("Escolha uma opção: ");

            int number = sc.nextInt();
            sc.nextLine();

            switch (number) {
                case 1:
                    System.out.print("Digite o nome do paciente: ");
                    String nome = sc.nextLine();
                    System.out.print("Digite o email do paciente: ");
                    String email = sc.nextLine();
                    System.out.print("Digite o telefone do paciente: ");
                    String telefone = sc.nextLine();
                    System.out.print("Digite o motivo da consulta: ");
                    String motivoDaConsulta = sc.nextLine();

                    rp = new RegisterPatient(nome, email, telefone, motivoDaConsulta);
                    System.out.println("Paciente adicionado com sucesso!");
                    break;

                case 2:
                    System.out.println("Informações do Paciente:");
                    System.out.println(rp.exibirPaciente());
                    break;

                case 3:
                    System.out.print("Digite o nome do médico: ");
                    String name = sc.nextLine();
                    System.out.print("Digite o CRM do médico: ");
                    String crm = sc.nextLine();
                    System.out.print("Digite a especialidade do médico: ");
                    String especialidade = sc.nextLine();

                    RegisterSpecalist rs = new RegisterSpecalist(name, crm, especialidade);
                    doctors.add(rs);
                    System.out.println("Médico cadastrado com sucesso!");
                    break;

                case 4:
                    System.out.println("Lista de Médicos:");
                    for (int i = 0; i < doctors.size(); i++) {
                        System.out.println(i + 1 + ". " + doctors.get(i).ExibirDadosDoMedico());
                    }
                    break;

                case 5:
                    System.out.println("Escolha um Médico:");
                    for (int i = 0; i < doctors.size(); i++) {
                        System.out.println(i + 1 + ". " + doctors.get(i).getName());
                    }
                    int escolhaMedico = sc.nextInt();
                    sc.nextLine(); // Consumir a nova linha

                    if (escolhaMedico > 0 && escolhaMedico <= doctors.size()) {
                        RegisterSpecalist medicoEscolhido = doctors.get(escolhaMedico - 1);
                        System.out.println("Você escolheu o médico: " + medicoEscolhido.getName());
                    } else {
                        System.out.println("Escolha inválida!");
                    }
                    break;

                case 6:
                    System.out.println("Escolha a forma de pagamento (opcional):");
                    System.out.println("1. Cartão de crédito ou débito");
                    System.out.println("2. Dinheiro");
                    System.out.println("3. Pix");
                    int pagamento = sc.nextInt();
                    sc.nextLine(); // Consumir a nova linha

                    switch (pagamento) {
                        case 1:
                            System.out.print("Digite o tipo de cartão (débito/crédito): ");
                            String tipoCartao = sc.nextLine();
                            System.out.print("Digite o número do cartão: ");
                            String numeroCartao = sc.nextLine();
                            System.out.print("Digite o CVV: ");
                            int cvv = sc.nextInt();
                            sc.nextLine(); // Consumir a nova linha
                            System.out.print("Digite a validade do cartão (MM/AA): ");
                            String validade = sc.nextLine();

                            PayCartao payCartao = new PayCartao(tipoCartao, numeroCartao, cvv, validade);
                            System.out.println("Pagamento com cartão registrado com sucesso!");
                            break;
                        case 2:
                            System.out.print("Digite o valor em dinheiro: ");
                            double valorDinheiro = sc.nextDouble();
                            sc.nextLine(); // Consumir a nova linha

                            PayDinheiro payDinheiro = new PayDinheiro(valorDinheiro);
                            System.out.println("Pagamento em dinheiro registrado com sucesso!");
                            break;
                        case 3:
                            PayPix payPix = new PayPix();
                            System.out.println("Pagamento via Pix registrado com sucesso!");
                            System.out.println("Chave Pix: " + payPix.getChavepix());
                            break;
                        default:
                            System.out.println("Forma de pagamento inválida!");
                            break;
                    }
                    break;


                case 7:
                    running = false;
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        }

        sc.close();
    }

}
