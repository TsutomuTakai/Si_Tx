/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Rafael
 */
public class Gamer {
    
//Declaracao de variaveis
    private int _usuario_id;
    private String _nome;
    private String _cpf;
    private String _email;
    private String _telefone;
    private String _cidade;
    private String _suspenso_ate;
    private boolean _ativo;   
    
    
//Geters and Setters    
    public int getUsuario_id() {
        return _usuario_id;
    }//getUsuario_id

    public void setUsuario_id(int _usuario_id) {
        this._usuario_id = _usuario_id;
    }//setUsuario_id

    public String getNome() {
        return _nome;
    }//getNome

    public void setNome(String _nome) {
        this._nome = _nome;
    }//setNome

    public String getCpf() {
        return _cpf;
    }//getCpf

    public void setCpf(String _cpf) {
        this._cpf = _cpf;
    }//setCpf

    public String getEmail() {
        return _email;
    }//getEmail

    public void setEmail(String _email) {
        this._email = _email;
    }//setEmail

    public String getTelefone() {
        return _telefone;
    }//getTelefone

    public void setTelefone(String _telefone) {
        this._telefone = _telefone;
    }//setTelefone

    public String getCidade() {
        return _cidade;
    }//getCidade

    public void setCidade(String _cidade) {
        this._cidade = _cidade;
    }//setCidade

    public String getSuspenso_ate() {
        return _suspenso_ate;
    }//getSuspenso

    public void setSuspenso_ate(String _suspenso_ate) {
        this._suspenso_ate = _suspenso_ate;
    }//setSuspenso_ate

    public boolean isAtivo() {
        return _ativo;
    }//isAtivo

    public void setAtivo(boolean _ativo) {
        this._ativo = _ativo;
    }//setAtivo
    
    
}//Gamer


/*
    SQL de Criacao do Banco de Dados

  USUARIO_ID INTEGER UNSIGNED NOT NULL,
  NOME VARCHAR(45) NULL,
  CPF INTEGER UNSIGNED NULL,
  EMAIL VARCHAR(45) NULL,
  TELEFONE INTEGER UNSIGNED NULL,
  CIDADE VARCHAR(45) NULL,
  FOTO BLOB NULL,
  SUSPENSO_ATE DATE NULL,
  ATIVO BOOL NULL,
  PRIMARY KEY(USUARIO_ID),
  INDEX GAMER_FKIndex1(USUARIO_ID)
    
*/