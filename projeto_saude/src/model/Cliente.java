// src/model/Cliente.java
package model;

import enums.MetodoPagamento;
import enums.TipoDeServico;

import java.util.List;

public class Cliente extends Pessoa implements Usuario {
  
  public Cliente(int id, String nome, String email, String contato, String senha) {
    super(id, nome, email, contato, senha);
  }
  
  public List<Profissional> buscarServicos(TipoDeServico tipoDeServico, List<Profissional> profissionais) {
    return profissionais.stream()
        .filter(profissional -> profissional.getTipoDeServico().equals(tipoDeServico))
        .toList();
  }
  
  public boolean escolherHorario(Profissional profissional, String horario) {
    List<String> calendario = profissional.getCalendario();
    if (calendario.contains(horario)) {
      calendario.remove(horario);
      profissional.setCalendario(calendario);
      return true;
    }
    return false;
  }
  
  public void pagar(Pagamento pagamento) {
    // Implement payment logic here
  }
  
  @Override
  public String toString() {
    return "Cliente{" +
        "id=" + id +
        ", nome='" + nome + '\'' +
        ", email='" + email + '\'' +
        ", contato='" + contato + '\'' +
        ", senha='" + senha + '\'' +
        '}';
  }
}