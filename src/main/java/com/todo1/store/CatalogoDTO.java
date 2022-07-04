package com.todo1.store;

/**
 * @author holger.morales
 */
public class CatalogoDTO {
    private Long id;
    private String grupo;
    private String nemonico;
    private String nombre;
    private String descripcion;
    private String visible;

    public CatalogoDTO() {

    }

    /**
     * @param id
     * @param grupo
     * @param nemonico
     * @param nombre
     */
    public CatalogoDTO(Long id, String grupo, String nemonico, String nombre) {
        this.id = id;
        this.grupo = grupo;
        this.nemonico = nemonico;
        this.nombre = nombre;
    }

    /**
     * @see com.todo1.store.dao.general.dao.CatalogoDao#obtenerPorGrupoEstado(java.lang.String, com.todo1.enumarados.EstadoRegistro)
     * @param id
     * @param grupo
     * @param nemonico
     * @param nombre
     * @param descripcion
     * @param visible
     */
    public CatalogoDTO(Long id, String grupo, String nemonico, String nombre, String descripcion, String visible) {
        this.id = id;
        this.grupo = grupo;
        this.nemonico = nemonico;
        this.descripcion = descripcion;
        this.visible = visible;
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public String getGrupo() {
        return this.grupo;
    }

    public Long getId() {
        return this.id;
    }

    public String getNemonico() {
        return this.nemonico;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getVisible() {
        return this.visible;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNemonico(String nemonico) {
        this.nemonico = nemonico;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setVisible(String visible) {
        this.visible = visible;
    }

}
