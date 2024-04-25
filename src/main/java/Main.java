public class Main {
  public static void main(String[] args) {
    Carro carro = new Carro("Fiat", "Uno", 2010, 0, false);
    Pessoa pessoa = new Pessoa("Ginaldo", 25, "Programador", true);

    if (pessoa.possuiCnh) {
      System.out.println(pessoa.nome + " esta habilitado para dirigir");
      carro.ligarMotor();
      carro.acelerar(50);

    }

    if (carro.estaMovendo()) {
      System.out.println("Frear...");
      carro.frear();
    }
    System.out.println(carro);

  }

}