package atividades.Agenda;

public class Fone {
  private String id;
  private String number;

  public Fone(String id, String number) {
    this.id = id;
    this.number = number;
  }

  // verifica se o nÃºmero Ã© um nÃºmero de telefone vÃ¡lido
  /**
   * ^ - inicio da string
   * \(? - Obtendo um parÃªntese opcional
   * [0-9]{2} - Obtendo um conjunto de dois digitos de 0 a 9
   * \)? - Obtendo um parÃªntese opcional
   * (\s*)? - Obtendo um espaÃ§o ou traÃ§o opcional
   * ([0-9]*) - Obtendo um conjunto de qualquer tamanho de digitos de 0 a 9
   * [.]? - Obtendo um ponto opcional
   * ([0-9]*) - Obtendo um conjunto de qualquer tamanho de digitos de 0 a 9
   * $ - fim da string
   * 
   * number - nÃºmero de telefone a ser verificado
   * true se o nÃºmero Ã© vÃ¡lido, false caso contrÃ¡rio
   */
  public static boolean validate(String number) {
    return number.matches("^\\(?[1-9]{2}\\)?(\\s*)?([0-9]*)[.]?([0-9]*)$");
  }

  // O resultado deve ficar assim
  // oi:1234
  public String toString() {
    return this.id + ":" + this.number;
  }

  // GETS e SETS
  /**
   * MÃ©todo getter que retorna o id do telefone
   * 
   */
  public String getId() {
    return this.id;
  }

  /**
   * MÃ©todo setter que define o id do telefone
   * 
   */
  public void setId(String id) {
    this.id = id;
  }

  /**
   * MÃ©todo getter que retorna o nÃºmero do telefone
   * 
   */
  public String getNumber() {
    return this.number;
  }

  /**
   * MÃ©todo setter que define o nÃºmero do telefone
   * 
   */
  public void setNumber(String number) {
    this.number = number;
  }
}
