
public class Motoristas {
  private String nome;
  private int id;
  private int NumeroCNH;
  private String expertise;

    public Motoristas(int NumeroCNH, String expertise, int id, String nome, Frota frota) {
        this.NumeroCNH = NumeroCNH;
        this.expertise = expertise;
        this.id = id;
        this.nome = nome;
    
        frota.addMotorista(this);
    }

    public String getNome() {
      return nome;
    }

    



  


}
