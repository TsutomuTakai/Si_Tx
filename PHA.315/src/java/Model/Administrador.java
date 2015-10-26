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
public class Administrador {
    
    /*
    USUARIO_ID INTEGER UNSIGNED NOT NULL,
  NOME VARCHAR(45) NULL,
  CPF INTEGER UNSIGNED NULL,
  EMAIL VARCHAR(45) NULL,
  TELEFONE INTEGER UNSIGNED NULL,
  PRIMARY KEY(USUARIO_ID),
  INDEX Table_04_FKIndex1(USUARIO_ID)

    
    */
    private String _id;
    private String _nome;
    private String _cpf;
    private String _email;
    private String _telefone;

    public String getId() {
        return _id;
    }

    public void setId(String _id) {
        this._id = _id;
    }

    public String getNome() {
        return _nome;
    }

    public void setNome(String _nome) {
        this._nome = _nome;
    }

    public String getCpf() {
        return _cpf;
    }

    public void setCpf(String _cpf) {
        this._cpf = _cpf;
    }

    public String getEmail() {
        return _email;
    }

    public void setEmail(String _email) {
        this._email = _email;
    }

    public String getTelefone() {
        return _telefone;
    }

    public void setTelefone(String _telefone) {
        this._telefone = _telefone;
    }
   
}
