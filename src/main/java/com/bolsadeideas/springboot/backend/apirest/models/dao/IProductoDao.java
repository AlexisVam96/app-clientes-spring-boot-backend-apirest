package com.bolsadeideas.springboot.backend.apirest.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.bolsadeideas.springboot.backend.apirest.models.entity.Producto;

public interface IProductoDao extends CrudRepository<Producto, Long>{

	//FORMA MANUEL 
	@Query("select p from Producto p where p.nombre like %?1%")
	public List<Producto> findByNombre(String termino);

	//METODO UTLIZANDO NOMBRE CONTAINNING QUE SERIA LO MISMO DE ARRIBA
	public List<Producto> findByNombreContainingIgnoreCase(String termino);
	
	public List<Producto> findByNombreStartingWithIgnoreCase(String termino);
}
