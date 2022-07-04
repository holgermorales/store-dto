/**
 *
 */
package com.todo1.store;

/**
 * @author hogler.morales
 */
public class GaleriaDTO {
    private Long id;
    private String imagen;

    public GaleriaDTO() {

    }

    /**
     * @see com.todo1.store.kardex.dao.GaleriaDao#obtenerPorIdProducto(java.lang.Long)
     * @param id
     * @param imagen
     */
    public GaleriaDTO(Long id, String imagen) {
        this.id = id;
        this.imagen = imagen;
    }

    public Long getId() {
        return this.id;
    }

    public String getImagen() {
        return this.imagen;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

}
