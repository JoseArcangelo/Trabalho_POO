
import java.util.Scanner;

public class Principal {

  public static void main(String[] args) {
   
    Scanner sc = new Scanner(System.in);

    Veiculos v1 = new CarrosCompactos(2000, 100, 01, "qualquercoisa", "gol");
    
    Frota frota = new Frota();
    int id = 1;
    int opcao =1; 
    while(opcao != 0) {
    
      System.out.println("Informe a opcao desejada: ");
      opcao = sc.nextInt();
      
      if(opcao == 1 ) {
        System.out.println("Informe o modelo de carro elétrico: " + "\n1- Carros compatos " + "2\n Carros Sedans " + "3- Carros SUV's Elétricos");
        int opc = sc.nextInt();

        System.out.println("Informe o ano de fabricação do veículo: "); 
        int anoFabricacao = sc.nextInt();
        
        System.out.println("Informe a capacidade total da bateria: ");
        double capacidadeTotalBatetia = sc.nextDouble();
        
        System.out.println("Informe a marca do veículo: "); 
        String marca = sc.next();

        System.out.println("Informe o modelo do veiculo: ");
        String modelo = sc.next();

        if(opc == 1) {
          Veiculos v = new CarrosCompactos(anoFabricacao, capacidadeTotalBatetia, id, marca, modelo, frota);
        }
        else if (opc = 2) {
          Veiculos v = new CarrosSedans(anoFabricacao, capacidadeTotalBatetia, id, marca, modelo, frota);
        }
        else if (opc = 3) {
          Veiculos v = new CarrosSUVsEletricos(anoFabricacao, capacidadeTotalBatetia, id, marca, modelo, frota);
        }
        
        id += 1;
      } 

      }
      
      

      


    }
    
    
  }


}
