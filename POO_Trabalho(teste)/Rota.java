
import java.util.ArrayList;
import java.util.List;

public class Rota {
  private String origem;
  private String destino;
  private double kmPercorrido;
  private List<Eletropostos> eletropostos;
  
  public String getOrigem() {
    return origem;
  }

  public String getDestino() {
    return destino;
  }

  public double getKmPercorrido() {
    return kmPercorrido;
  }

  public List<Eletropostos> getEletropostos() {
    return eletropostos;
  }

  public void listarEletropostos (){
    for (Eletropostos eletroposto:eletropostos){
      System.out.print(eletroposto.get_id());

    }
  }

  public void ordenarEletropostos() {        
    for (int i = 0; i < eletropostos.size(); i++) {
        int menorEletroposto = i;

        // Encontrar o eletroposto com a menor distância
        for (int v = i + 1; v < eletropostos.size(); v++) {
            if (eletropostos.get(v).getDistancia() < eletropostos.get(menorEletroposto).getDistancia()) {
                menorEletroposto = v;
            }
        }

        // Trocar o eletroposto atual com o de menor distância encontrado
        if (menorEletroposto != i) {
            Eletropostos temp = eletropostos.get(i);
            eletropostos.set(i, eletropostos.get(menorEletroposto));
            eletropostos.set(menorEletroposto, temp);
        }
    }
}





  public Rota(String origem, String destino, double kmPercorrido) {
    this.origem = origem;
    this.destino = destino;
    this.kmPercorrido = kmPercorrido;
    this.eletropostos = new ArrayList<>();
  }


  public void addEletroposto(Eletropostos eletroposto) {
    this.eletropostos.add(eletroposto);
  }


  
  
}
