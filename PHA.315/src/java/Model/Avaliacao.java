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
public class Avaliacao {
   
    protected int _avaliador;
    protected int _avaliado;
    protected int _it_id;
    protected int _avaliacao;
    protected String _comentario;

        public int getAvaliador() {
            return _avaliador;
        }//getAvaliador

        public void setAvaliador(int _avaliador) {
            this._avaliador = _avaliador;
        }//setAvaliador

        public int getAvaliado() {
            return _avaliado;
        }//getAvaliado

        public void setAvaliado(int _avaliado) {
            this._avaliado = _avaliado;
        }//setAvaliado

        public int getIt_id() {
            return _it_id;
        }//getIt_id

        public void setIt_id(int _it_id) {
            this._it_id = _it_id;
        }//setIt_id

        public int getAvaliacao() {
            return _avaliacao;
        }//getAvaliacao

        public void setAvaliacao(int _avaliacao) {
            this._avaliacao = _avaliacao;
        }//setAvaliacao

        public String getComentario() {
            return _comentario;
        }//getComentario

        public void setComentario(String _comentario) {
            this._comentario = _comentario;
        }//setComentario


}//Avaliacao
