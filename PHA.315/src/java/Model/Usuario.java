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
public class Usuario {

    private int _id;
    private String _senha;
    private String _username;
    private int _tipo;
    
    public int getId(){
        return _id;
    }

    public void setId(int _id){
        this._id = _id; 
    }
    
    public String getSenha() {
        return _senha;
    }//getSenha

    public void setSenha(String _senha) {
        this._senha = _senha;
    }//setSenha

    public String getUsername() {
        return _username;
    }//getUsername

    public void setUsername(String _username) {
        this._username = _username;
    }//setUsername

    public int getTipo() {
        return _tipo;
    }//getTipo

    public void setTipo(int _tipo) {
        this._tipo = _tipo;
    }//setTipo
    
}//Usuario
