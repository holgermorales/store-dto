package com.todo1.store;

public class EtiquetaDTO {
    private String etiqueta;
    private String colorEtiqueta;

    public EtiquetaDTO() {
    }

    public EtiquetaDTO(String etiqueta, String colorEtiqueta) {
        this.etiqueta = etiqueta;
        this.colorEtiqueta = colorEtiqueta;
    }

    public String getEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
    }

    public String getColorEtiqueta() {
        return colorEtiqueta;
    }

    public void setColorEtiqueta(String colorEtiqueta) {
        this.colorEtiqueta = colorEtiqueta;
    }
}
