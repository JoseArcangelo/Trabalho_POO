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

  public void listarVeiculos() {
    for (Veiculos v : veiculos) {
      System.out.println(v.getModelo());
    }
  }

  public void listarMotoristas() {
    System.out.println("Lista dos motoristas: ");
    int contador = 0;
    for(Motoristas m : motoristas) {
      System.out.println("0 - " + m.getNome());
      contador += 1;
    }
  }
  public List<Motoristas> listMotoristas(){
    return motoristas;
  }
  public List<Veiculos> listVeiculos(){
    return veiculos;
  }

  
}
