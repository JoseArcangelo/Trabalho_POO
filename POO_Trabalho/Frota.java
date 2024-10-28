import java.util.ArrayList;
import java.util.List;

public class Frota {
  List<Veiculos> veiculos;
  List<Motoristas> motoristas;

  public Frota() {
      this.veiculos = new ArrayList<>();
      this.motoristas = new ArrayList<>();
  }

  public void addVeiculo(Veiculos veiculo) {
    veiculos.add(veiculo);
  }

  public void addMotorista(Motoristas motorista){
    motoristas.add(motorista);
  }

  public void exibir() {
    for (Veiculos v : veiculos) {
      System.out.println(v.getModelo());
    }
  }
  

  
}
