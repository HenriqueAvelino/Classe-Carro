public class Carro { 
   private String modelo;
   private int ano;
   private double velocidadeAtual;
   public boolean motorLigado;
   private String marca;
  
  public Carro(String marca, String modelo, int ano, double velocidadeAtual, boolean motorLigado) {
    this.marca = marca;
    this.modelo = modelo;
    this.ano = ano;
    this.velocidadeAtual = velocidadeAtual;
    this.motorLigado = motorLigado;
  }

  public void ligarMotor() {
      this.motorLigado = true;
  }

  public void desligarMotor() {
      this.motorLigado = false;
  }

  public void acelerar(double aumentoVelocidade) {
      this.velocidadeAtual += aumentoVelocidade;
  }

  public boolean estaMovendo() {
      return velocidadeAtual > 0;
  }

  public void frear() {
      this.velocidadeAtual = 0;
  }
  @Override
    public String toString() {
        return "Marca: " + marca + "\nModelo: " + modelo + "\nAno: " + ano +
                "\nVelocidade Atual: " + velocidadeAtual + "\nMotor Ligado: " + motorLigado;
    }
} 