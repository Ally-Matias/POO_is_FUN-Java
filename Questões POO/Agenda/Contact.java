package atividades.Agenda;

import java.util.ArrayList;

public class Contact {
  // Attributes
  private String name;
  private ArrayList<Fone> fones;
  protected String prefix = "-"; // utilizado no toString
  // Crie um ArrayList para o ATRIBUTO fones
  // Se a variÃ¡vel fones nÃ£o for null, adicione todos os fones usando o mÃ©todo
  // addFone

  public Contact(String name, ArrayList<Fone> fones) {
    this.name = name == null ? "" : name;
    this.fones = new ArrayList<Fone>();

    if (fones != null) {
      for (Fone fone : fones) {
        this.addFone(fone);
      }
    }

  }

  // Se fone for vÃ¡lido, insira no atributo fones
  // Se nÃ£o, informe o erro
  /**
   * MÃ©todo que adiciona um fone a lista contatod
   */
  public void addFone(Fone fone) {
    if (Fone.validate(fone.getNumber())) {
      this.fones.add(fone);
    } else {
      System.out.println("fail: invalid number");
    }
  }

  // Se o Ã­ndice existir no ArrayList, remova o telefone com esse Ã­ndice
  /**
   * MÃ©todo que remove um fone da lista contatos
   *
   */
  public void rmFone(int index) {
    if (index < this.fones.size() && index >= 0) {
      this.fones.remove(index);
    } else {
      System.out.println("fail: invalid index");
    }
  }

  // Use um contador para mostrar o Ã­ndice do telefone
  // Use o toString do fone para adicionÃ¡-lo Ã  saÃ­da
  // O resultado dever ficar assim:
  // - david [0:oi:123] [1:tim:9081] [2:claro:5431]
  public String toString() {
    String state = this.prefix + " " + this.name + " ";

    for (int i = 0; i < this.fones.size(); i++) {
      state += "[";
      state += i + ":" + this.fones.get(i).toString();
      state += "]";
    }
    return state;
  }

  // GETS e SETS
  /**
   * MÃ©todo getter que retorna o nome do contato
   *
   */
  public String getName() {
    return this.name;
  }

  /**
   * MÃ©todo setter que define o nome do contato
   *
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * MÃ©to que retorna o ArrayList de fones
   * 
   */
  public ArrayList<Fone> getFones() {
    return this.fones;
  }
}
