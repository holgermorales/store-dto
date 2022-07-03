package com.todo1.store;

/**
 * @author holger.morales
 */
public class ResponseDTO<T> {
    private String mensaje;
    private Integer total;
    private String tipoMensaje;
    private T dato;

    public ResponseDTO() {
        super();
        this.total = 0;
        this.mensaje = "";
    }

    public T getDato() {
        return this.dato;
    }

    public String getMensaje() {
        return this.mensaje;
    }

    public String getTipoMensaje() {
        return this.tipoMensaje;
    }

    public Integer getTotal() {
        return this.total;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public void setTipoMensaje(String tipoMensaje) {
        this.tipoMensaje = tipoMensaje;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }
}
