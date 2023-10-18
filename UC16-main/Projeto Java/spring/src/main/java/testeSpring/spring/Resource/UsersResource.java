package testeSpring.spring.Resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import testeSpring.spring.Entity.Paciente;

@RestController
@RequestMapping(value = "/users")
public class UsersResource {
	
	@GetMapping
	public ResponseEntity<Paciente> findAll() {
		Paciente u = new Paciente(1L, "Rafael", 25092000, "teste@gmail.com", "Rua teste", "Complemento", 1234567810, 19, 1998965425);
		return ResponseEntity.ok().body(u);
	}
	
}
