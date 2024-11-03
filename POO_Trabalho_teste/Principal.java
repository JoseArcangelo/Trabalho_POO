
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    List<Rota> rotas = new ArrayList<>();
    Registro registros = new Registro();
    // Criando a frota
    Frota frota = new Frota();
    Veiculos v1 = new CarrosCompactos(2020, 6000.0,  01, "Tesla", "Model 3", frota);
    Veiculos v2 = new CarrosCompactos(2019, 5000.0, 02, "Nissan", "Leaf", frota);
    Veiculos v3 = new CarrosCompactos(2021, 5500.0, 03, "Chevrolet", "Bolt EV", frota);

    // Criando 3 carros sedans
    Veiculos v4 = new CarrosSedans(2021, 4500.0, 04, "Tesla", "Model S", frota);
    Veiculos v5 = new CarrosSedans(2020, 3700.0, 05, "BMW", "i4", frota);
    Veiculos v6 = new CarrosSedans(2019, 4770.0, 06 ,"Lucid", "Air", frota);

    // Criando 3 SUVs elétricos
    Veiculos v7 = new CarrosSUVsEletricos(2022, 1000.0, 07, "Tesla", "Model X", frota);
    Veiculos v8 = new CarrosSUVsEletricos(2021, 5600.0, 10, "Audi", "e-tron", frota);
    Veiculos v9 = new CarrosSUVsEletricos(2020, 5500.0, 9, "Ford", "Mustang Mach-E", frota);
    
    Motoristas m1 = new Motoristas(89, "avancado", 1, "Jose Silva", frota);
    Motoristas m2 = new Motoristas(21, "intermediario", 2, "Maria Oliveira", frota);
    Motoristas m3 = new Motoristas(45, "iniciante", 3, "Carlos Souza", frota);
    Motoristas m4 = new Motoristas(65, "avancado", 4, "Ana Costa", frota);
    Motoristas m5 = new Motoristas(221, "intermediario", 5, "Joao Pereira", frota);

    Rota rota1 = new Rota("Sao Paulo", "Rio de Janeiro", 430.0);
    Rota rota2 = new Rota("Porto Alegre", "Curitiba", 700.0);
    Rota rota3 = new Rota("Belo Horizonte", "Vitoria", 530.0);
    Rota rota4 = new Rota("Brasilia", "Goiania", 210.0);
    Rota rota5 = new Rota("Salvador", "Recife", 800.0);

    
    rotas.add(rota1);
    rotas.add(rota2);
    rotas.add(rota3);
    rotas.add(rota4);
    rotas.add(rota5);

    Eletropostos ee = new Eletropostos(1, 12, 12);
    Eletropostos eee = new Eletropostos(2, 12, 12);
    double distancias1 = 300;
    double distancias2 = 600;
    boolean verificacaos = ee.setDistancia(distancias1, rota5);
    if(verificacaos == true) {       
      rota5.addEletroposto(ee);
      System.out.println("::ELETROPOSTO REGISTRADO COM SUCESSO!::");            
      rota5.ordenarEletropostos();  
    }
    boolean verificacaoo = eee.setDistancia(distancias2, rota5);
    if(verificacaoo == true) {       
      rota5.addEletroposto(eee);
      System.out.println("::ELETROPOSTO REGISTRADO COM SUCESSO!::");            
      rota5.ordenarEletropostos();  
    }

    int id = 100;
    int opcao = 1; 

    // Menu de opcoes
    while(opcao != 0) {
    
      System.out.print("--GESTAO DA FROTA--" +
      "\n1 - ADICIONAR VEICULO" + 
      "\n2 - ADICIONAR MOTORISTA" + 
      "\n3 - LISTAR MOTORISTAS" + 
      "\n4 - REGISTRAR VIAGEM" + 
      "\n5 - REGISTRAR ROTA" +
      "\n6 - CONSULTAR ELETROPOSTOS" +
      "\n7 - REGISTRAR ELETROPOSTO" +
      "\n8 - RELATORIOS" + 
      "\n9 - SAIR" +    
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
      //Registrar eletroposto
      else if(opcao == 7) {
        int contador = 0;
        for(Rota rota : rotas){
          System.out.println(contador + " - Origem: " + rota.getOrigem() + ", Destino: " + rota.getDestino() + ", Distancia: " + rota.getKmPercorrido());
          
          contador = contador +1;
        }
        System.out.print("Infome a rota para adicionar o eletroposto: ");
        int digito = sc.nextInt();

        System.out.print("Informe o numero de vagas: ");
        int numeroVagas = sc.nextInt();

        System.out.print("Informe o tempo de carregamento(horas): ");
        double tempoCarregamento = sc.nextDouble();

        System.out.print("Informe a distancia do eletroposto em relacao ao ponto inicial da rota: ");
        double distancia = sc.nextDouble();

        Eletropostos e = new Eletropostos(id, numeroVagas, tempoCarregamento);
        Rota rota = rotas.get(digito);
        boolean verificacao = e.setDistancia(distancia, rota);
        if(verificacao == true) {
          id += 1;          
          rota.addEletroposto(e);
          System.out.println("::ELETROPOSTO REGISTRADO COM SUCESSO!::");            
          rota.ordenarEletropostos();  
        }
        
        }
      // Consultar eletropostos
      else if(opcao == 6) {
        int contador = 0;
        for(Rota rota : rotas){
          System.out.println(contador + " - Origem: " + rota.getOrigem() + ", Destino: " + rota.getDestino() + ", Distancia: " + rota.getKmPercorrido());
          
          contador = contador +1;
        }
        System.out.print("Infome a rota que deseja pesquisar os eletropostos: ");
        int digito = sc.nextInt();
        Rota rota = rotas.get(digito);
        List<Eletropostos> eletropostosRota = rota.getEletropostos();
        if (eletropostosRota.size() > 0) {
          for(Eletropostos eletroposto : eletropostosRota) {
            eletroposto.exibirEletroposto();
          }
        }
        else{
          System.out.println("::NENHUM ELETROPOSTO ENCONTRADO NESSA ROTA!::");
        }

      }
      // Registrar viagem
      else if(opcao == 4) {
        System.out.println("::ROTAS DISPONIVEIS::");
        int contador = 0;
        for(Rota rota : rotas){
          System.out.println(contador + " - Origem: " + rota.getOrigem() + ", Destino: " + rota.getDestino() + ", Distancia: " + rota.getKmPercorrido());
          
          contador = contador +1;
        }
        System.out.print("Infome a rota para registrar a viagem: ");
        int digitoRota = sc.nextInt();
        
        System.out.println("\n::Motoristas::");
        List<Motoristas> listMotoristas = frota.getMotoristas();
        contador = 0;
        for(Motoristas motorista : listMotoristas) {
          System.out.println(contador + ", Nome: " + motorista.getNome() + ", Numero CNH: " + motorista.getNumeroCNH() + ", Nivel de experiencia: " + motorista.getExpertise());
          contador += 1;
        }
        System.out.print("Informe o motorista para registrar a viagem: "); 
        int digitoMotorista = sc.nextInt();

        System.out.println("\n::Veiculos::");
        List<Veiculos> listVeiculos = frota.getVeiculos();
        contador = 0;
        for(Veiculos veiculo : listVeiculos) {
          System.out.println(contador + ", Marca: " + veiculo.getMarca() + ", Modelo: " + veiculo.getModelo() + ", Autonomia Maxima: " + veiculo.getAutonomiaMaxima() + ", id: #" + veiculo.getId());
          contador += 1;
        }
        System.out.print("Informe o veiculo para registrar a viagem: " );
        int digitoVeiculo = sc.nextInt();

        // Verificar autonomia
        boolean verificacao = listVeiculos.get(digitoVeiculo).verificarAutonomia(rotas.get(digitoRota), registros);
        boolean verificacaoManutencao = registros.veiculosManutencao(listVeiculos.get(digitoVeiculo).getId());
        if(verificacao == true && verificacaoManutencao == true){
          Viagem v = new Viagem(rotas.get(digitoRota), listMotoristas.get(digitoMotorista), listVeiculos.get(digitoVeiculo)); 
          System.out.println("::Viagem cadastrada com sucesso!::");
          registros.addRegistro(v);
        }
        else {
          System.out.println("::ERRO! AUTONOMIA INSUFICIENTE! OU O CARRO ESTA EM MANUTENCAO::");
        } 
      }
      //Registrar rota
      else if(opcao == 5){
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
      
      else if(opcao == 8) {
        int o = 0;
        while(o != 5) {
          System.out.println("\n1 - LISTA DOS VEICULOS COM AUTONOMIA INFERIOR A 20% DA CAPACIDADE TOTAL DA BATERIA." + 
        "\n2 - VIAGENS REALIZADAS POR UM DETERMINADO MOTORISTA" + 
        "\n3 - HISTORICO DE RECARGAS" + 
        "\n4 - CARROS QUE PRECISAM DE MANUTENCAO." + 
        "\n5 - VOLTAR");

        System.out.print("Informe a opcao desejada: ");
        o = sc.nextInt();
        if(o == 1){
          List<Veiculos> listVeiculos = frota.getVeiculos();
          int contador = 0;
          System.out.println("Lista dos veiculos com menos de 20% da bateria:\n");
          registros.autonomiaInferior(frota.getVeiculos());
          }    
        
        else if (o == 2) {
        System.out.println("\n::Motoristas::");
          List<Motoristas> listMotoristas = frota.getMotoristas();
          int contador = 0;
          for(Motoristas motorista : listMotoristas) {
            System.out.println(contador + ", Nome: " + motorista.getNome() + ", Numero CNH: " + motorista.getNumeroCNH() + ", Nivel de experiencia: " + motorista.getExpertise());
            contador += 1;
          }
          System.out.print("Informe o motorista para a consulta: "); 
          int digitoMotorista = sc.nextInt();

          registros.consultarMotorista(frota.getMotoristas().get(digitoMotorista));

          }
        
        else if (o == 3) {
          registros.exibirHistoricoRecargas();
        }

        else if (o == 4){
          registros.consultarVeiculosManutencao(frota.getVeiculos());
        }
        
        
        }
        
      }
      //Sair...
      else if(opcao == 9) {
        System.out.println("Saindo...");
        break;
      }
    }
    
    
  }

}


