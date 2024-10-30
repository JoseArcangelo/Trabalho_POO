
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

  public static void main(String[] args) {
   
    Scanner sc = new Scanner(System.in);
    
    List<Rota> rotas = new ArrayList<>();
    // Criando a frota
    Frota frota = new Frota();

    Veiculos v1 = new CarrosCompactos(2020, 35.0,  1, "Tesla", "Model 3", frota);
    Veiculos v2 = new CarrosCompactos(2019, 40.0, 2, "Nissan", "Leaf", frota);
    Veiculos v3 = new CarrosCompactos(2021, 38.0, 3 ,"Chevrolet", "Bolt EV", frota);

    // Criando 3 carros sedans
    Veiculos v4 = new CarrosSedans(2021, 65.0, 4, "Tesla", "Model S", frota);
    Veiculos v5 = new CarrosSedans(2020, 60.0, 5, "BMW", "i4", frota);
    Veiculos v6 = new CarrosSedans(2019, 70.0, 6 ,"Lucid", "Air", frota);

    // Criando 3 SUVs elétricos
    Veiculos v7 = new CarrosSUVsEletricos(2022, 80.0, 7, "Tesla", "Model X", frota);
    Veiculos v8 = new CarrosSUVsEletricos(2021, 75.0, 8, "Audi", "e-tron", frota);
    Veiculos v9 = new CarrosSUVsEletricos(2020, 85.0, 9, "Ford", "Mustang Mach-E", frota);


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
        int contador = 0;
        for(Rota rota : rotas){

          System.out.print("Digite o digito da roda que deseja adicionar um EletroPosto:\n");
          
          System.out.println(contador + " - Origem: " + rota.getOrigem() + ", Destino: " + rota.getDestino() + ", Distancia: " + rota.getKmPercorrido());
          
          contador = contador +1;
        }
        
        int digito = sc.nextInt();
        System.out.print("Informe o ID: ");
        int ids = sc.nextInt();

        System.out.print("Informe o numero de vagas: ");
        int numeroVagas = sc.nextInt();

        System.out.print("Informe o tempo de carregamento:");
        double tempoCarregamento = sc.nextDouble();

        Eletropostos as = new Eletropostos(ids, numeroVagas, tempoCarregamento);
        Rota teste = rotas.get(digito);
        teste.addEletroposto(as);
        System.out.println("::ELETROPOSTO REGISTRADO COM SUCESSO!::");

      
        
          
        }

      
    
      else if(opcao == 6) {
        System.out.print("Rotas disponiveis");
        int contador = 0;
        for(Rota rota : rotas) {
          
          System.out.println(contador + " - Origem: " + rota.getOrigem() + ", Destino: " + rota.getDestino() + ", Distancia: " + rota.getKmPercorrido());
          contador +=1;
        }
        int peganum = sc.nextInt();
        Rota rota = rotas.get(peganum);

        System.out.println("Escolha um motorista:");
        frota.listarMotoristas();
        int opcmotorista = sc.nextInt();

        Motoristas motorista = frota.listMotoristas().get(opcmotorista);

        System.out.println("Escolha um Veiculo:");
        frota.listarVeiculos();
        int opcveiculo = sc.nextInt();

        Veiculos veiculo = frota.listVeiculos().get(opcveiculo);

        double autonomia = veiculo.getAutonomiaMaxima();
        double distancia = rota.getKmPercorrido();

        if (autonomia>distancia){
          Viagem disney = new Viagem(rota,motorista,veiculo);
        }
        else if (autonomia<distancia){
          int contar = 0;
          while (autonomia<distancia){
            List<Eletropostos>EletropostosParada = new ArrayList<>();
            List<Eletropostos>ListaEletropostos = rota.getEletropostos();

            if(ListaEletropostos.get(contar).getNumeroVagas()>0){
            EletropostosParada.add(ListaEletropostos.get(contar));
            distancia = distancia - autonomia;
            contar +=1;
            }
            else{
            contar +=1;
            }
            
            if (contar > ListaEletropostos.size()){
              
              System.out.println("deu ruim");
              break;
            }

              
            }



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


