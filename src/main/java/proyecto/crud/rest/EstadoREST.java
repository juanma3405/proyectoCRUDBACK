package proyecto.crud.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import proyecto.crud.model.Estado;
import proyecto.crud.service.EstadoService;

@RestController
@RequestMapping("/estados/")
public class EstadoREST {
	@Autowired
    private EstadoService estadoService;
	
	@GetMapping("{id}")
	private ResponseEntity<List<Estado>> getAllEstadoByPais(@PathVariable("id") Long idPais) {
	        return ResponseEntity.ok(estadoService.findAllByCountry(idPais));
	    }
}
