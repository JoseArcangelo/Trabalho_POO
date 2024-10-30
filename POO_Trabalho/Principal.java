
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

  public static void main(String[] args) {
   
    Scanner sc = new Scanner(System.in);
    
    List<Rota> rotas = new ArrayList<>();
    // Criando a frota
    Frota frota = new Frota();

    int id = 1;
    int opcao = 1; 

    // Menu de opcoes
    while(opcao != 0) {
    
      System.out.print("--GESTAO DA FROTA--" 
      + "\n1 - Adicionar veiculo" + 
      "\n2 - Adicionar motorista" + 
      "\n3 - Listar motoristas" + 
      "\n4 - Registrar eletroposto" + 
      "\n5 - Consultar eletropostos" + 
      "\n6 - Resgistrar viagem" + 
      "\n7 - Registrar rota" + 
      "\nInforme a opcao desejada: ");
      opcao = sc.nextInt();
      
      // Add Veiculo
      if(opcao == 1 ) {
        System.out.print("\n1- CARROS COMPACTOS " + "\n2- CARROS SEDANS " + "\n3- CARROS SUV's ELETRICOS" + "\nInforme o modelo de carro eletrico: ");
        int opc = sc.nextInt(); 

        System.out.print("Informe o ano de fabricacao do veiculo: "); 
        int anoFabricacao = sc.nextInt();
        
        System.out.print("Informe a capacidade total da bateria: ");
        double capacidadeTotalBatetia = sc.nextDouble();
        
        System.out.print("Informe a marca do veiculo: "); 
        String marca = sc.next();

        System.out.print("Informe o modelo do veiculo: ");
        String modelo = sc.next();

        if(opc == 1) {
          Veiculos v = new CarrosCompactos(anoFabricacao, capacidadeTotalBatetia, id, marca, modelo, frota);
        }
        else if (opc == 2) {
          Veiculos v = new CarrosSedans(anoFabricacao, capacidadeTotalBatetia, id, marca, modelo, frota);
        }
        else if (opc == 3) {
          Veiculos v = new CarrosSUVsEletricos(anoFabricacao, capacidadeTotalBatetia, id, marca, modelo, frota);
        }
        System.out.println("::VEICULO ADICIONADO A FROTA!::\n");
        id += 1;
      } 
      // Add Motorista
      else if(opcao == 2) {
        System.out.print("Informe o numero da CNH do motorista: ");
        int numeroCNH = sc.nextInt();

        System.out.print("Informe o nivel de experiencia do motorista: ");
        String nivelExperiencia = sc.next();

        System.out.print("Informe o nome do motorista: ");
        String nome = sc.next();

        Motoristas m = new Motoristas(numeroCNH, nivelExperiencia, id, nome, frota);
        System.out.println("::MOTORISTA ADICIONADO COM SUCESSO!::");
        id += 1;
      }
      // Listar motoristas
      else if(opcao == 3) {
        frota.listarMotoristas();

      }
      else if(opcao == 4) {
        for(Rota rota : rotas){

          System.out.print("Digite o digito da roda que deseja adicionar um EletroPosto:\n");
          int contador = 0;
          System.out.println(contador + " - Origem: " + rota.getOrigem() + ", Destino: " + rota.getDestino() + ", Distancia: " + rota.getKmPercorrido());
          contador +=1;
          
        }
        int contador = sc.nextInt();
        System.out.print("Informe o ID: ");
        int ids = sc.nextInt();

        System.out.print("Informe o numero de vagas: ");
        int numeroVagas = sc.nextInt();

        System.out.print("Informe o tempo de carregamento:");
        double tempoCarregamento = sc.nextDouble();

        Eletropostos as = new Eletropostos(ids, numeroVagas, tempoCarregamento);
        Rota teste = rotas.get(contador);
        teste.addEletroposto(as);
        System.out.println("::ELETROPOSTO REGISTRADO COM SUCESSO!::");
      }
    
      else if(opcao == 6) {
        System.out.print("Rotas disponiveis");
        int contador = 0;
        for(Rota rota : rotas) {
          contador +=1;
          System.out.println("ROTA #" + contador + "\nOrigem: " + rota.getOrigem() + "\nDestino: " + rota.getDestino() + "\nDistancia: " + rota.getKmPercorrido());
  
        }
      }

      else if(opcao == 7){
        System.out.print("Informe a origem: ");
        String origem = sc.next();

        System.out.print("Informe o destino: ");
        String destino = sc.next();

        System.out.print("Informe a distancia(KM): ");
        double distancia = sc.nextDouble();

        // Rota r = new Rota(origem, destino, distancia);
        rotas.add(new Rota(origem, destino, distancia));
        System.out.println("::ROTA REGISTRADA COM SUCESSO!::");
        
      }
      else if(opcao == 8){

        
      }
      else if(opcao == 9) {
        break;
      }
    }
    
    
  }

}


