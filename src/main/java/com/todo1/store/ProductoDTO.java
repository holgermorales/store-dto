/**
 *
 */
package com.todo1.store;

import java.util.List;

/**
 * @author holger.morales
 */
public class ProductoDTO {
    private Long id;
    private Double precio;
    private Double precioVentaPublico;
    private String titulo;
    private String descripcion;
    private CatalogoDTO categoria;
    private Long stock;
    private List<GaleriaDTO> galerias;

    public ProductoDTO() {

    }

    /**
     * @see com.todo1.store.kardex.dao.ProductoDao#obtenerTodos()
     * @param id
     * @param precio
     * @param precioVentaPublico
     * @param titulo
     * @param descripcion
     * @param stock
     * @param idCategoria
     * @param grupoCategoria
     * @param nemonicoCategoria
     * @param nombreCategoria
     */
    public ProductoDTO(Long id, Double precio, Double precioVentaPublico, String titulo, String descripcion, Long stock, Long idCategoria, String grupoCategoria,
            String nemonicoCategoria, String nombreCategoria) {
        this.id = id;
        this.precio = precio;
        this.precioVentaPublico = precioVentaPublico;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.stock = stock;
        this.setCategoria(new CatalogoDTO(idCategoria, grupoCategoria, nemonicoCategoria, nombreCategoria));

    }

    public CatalogoDTO getCategoria() {
        return this.categoria;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public List<GaleriaDTO> getGalerias() {
        return this.galerias;
    }

    public Long getId() {
        return this.id;
    }

    public Double getPrecio() {
        return this.precio;
    }

    public Double getPrecioVentaPublico() {
        return this.precioVentaPublico;
    }

    public Long getStock() {
        return this.stock;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setCategoria(CatalogoDTO categoria) {
        this.categoria = categoria;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setGalerias(List<GaleriaDTO> galerias) {
        this.galerias = galerias;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public void setPrecioVentaPublico(Double precioVentaPublico) {
        this.precioVentaPublico = precioVentaPublico;
    }

    public void setStock(Long stock) {
        this.stock = stock;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

}
