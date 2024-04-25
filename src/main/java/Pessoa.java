public class Pessoa {
  String nome;
  int idade;
  String profissao;
  boolean possuiCnh;

  public Pessoa(String nome, int idade, String profissao, boolean possuiCnh) {
    this.nome=nome;
    this.idade=idade;
    this.profissao=profissao;
    this.possuiCnh=possuiCnh;
  }

  public boolean estarHabilitado() {
    return this.possuiCnh;
  }
  
  
}
