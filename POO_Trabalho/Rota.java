
import java.util.ArrayList;
import java.util.List;

public class Rota {
  private String origem;
  private String destino;
  private double distancia;

  private List<Eletropostos> eletropostos;

    public Rota(String destino, double distancia, String origem) {
        this.destino = destino;
        this.distancia = distancia;
        this.eletropostos = new ArrayList<>();
        this.origem = origem;
    }

    public void addEletroposto(Eletropostos eletroposto) {
      eletropostos.add(eletroposto);
    }

    
   
}
