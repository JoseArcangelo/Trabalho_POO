import java.util.ArrayList;
import java.util.List;

public class Frota {
  private List<Veiculos> veiculos;
  private List<Motoristas> motoristas;

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
    if(motoristas.size() > 0){
      System.out.println("Lista dos motoristas: ");
      for(Motoristas m : motoristas) {
        System.out.println("Motoristas: " + m.getNome() + ", Experiencia: " + m.getExpertise());
      }
    }
    else{
      System.out.println("::NENHUM MOTORISTA REGISTRADO!::");
    }
  }

    public List<Veiculos> getVeiculos() {
        return veiculos;
    }

    public List<Motoristas> getMotoristas() {
        return motoristas;
    }

  public void autonomiaInferior() {
    for (Veiculos v : veiculos) {
      double capacidade = v.getCapacidadeTotalBateria() * 0.2;
      if(v.getAutonomiaMaxima() < capacidade){
        System.out.println("Modelo: " + v.getModelo() + ", Marca: " + v.getMarca() + ", Autonomia: " + v.getAutonomiaMaxima());  
      }
     
    }
  }

  
}
