public class CarrosCompactos extends Veiculos{ 
  
  // public Veiculos(int anoFabricacao, double capacidadeTotalBateria, int id, String marca, String modelo) {
  //   super(anoFabricacao, capacidadeTotalBateria)
      // this.anoFabricacao = anoFabricacao;
      // this.autonomiaMaxima = 200;
      // this.capacidadeTotalBateria = capacidadeTotalBateria;
      // this.id = id;
      // this.marca = marca;
      // this.modelo = modelo;
      // this.tempoMedioRecarga = 4;
  // }

    public CarrosCompactos(int anoFabricacao, double capacidadeTotalBateria, int id, String marca, String modelo, Frota frota) {
        super(anoFabricacao, 200, capacidadeTotalBateria, id, marca, modelo,  4, frota);
    }


    


  
}
