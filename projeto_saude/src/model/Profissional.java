// src/model/Profissional.java
package model;

import enums.TipoDeServico;
import java.util.List;

public class Profissional extends Pessoa implements Usuario {
  private TipoDeServico tipoDeServico;
  private double valor;
  private List<String> calendario;
  
  public Profissional(int id, String nome, String email, String contato, String senha, TipoDeServico tipoDeServico, double valor, List<String> calendario) {
    super(id, nome, email, contato, senha);
    this.tipoDeServico = tipoDeServico;
    this.valor = valor;
    this.calendario = calendario;
  }
  
  public TipoDeServico getTipoDeServico() {
    return tipoDeServico;
  }
  
  public void setTipoDeServico(TipoDeServico tipoDeServico) {
    this.tipoDeServico = tipoDeServico;
  }
  
  public double getValor() {
    return valor;
  }
  
  public void setValor(double valor) {
    this.valor = valor;
  }
  
  public List<String> getCalendario() {
    return calendario;
  }
  
  public void setCalendario(List<String> calendario) {
    this.calendario = calendario;
  }
  
  @Override
  public String toString() {
    return "Profissional{" +
        "id=" + id +
        ", nome='" + nome + '\'' +
        ", email='" + email + '\'' +
        ", contato='" + contato + '\'' +
        ", senha='" + senha + '\'' +
        ", tipoDeServico=" + tipoDeServico +
        ", valor=" + valor +
        ", calendario=" + calendario +
        '}';
  }
}