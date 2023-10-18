package testeSpring.spring.Config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import testeSpring.spring.Entity.Paciente;
import testeSpring.spring.Repository.UsersRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{

	@Autowired
	private UsersRepository usersRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		Paciente u1 = new Paciente(null, "Rafael", 25092000, "teste@gmail.com", "Rua teste", "Complemento", 1234567810, 19, 1998965425);
		Paciente u2 = new Paciente(null, "Rafael", 25092000, "teste@gmail.com", "Rua teste", "Complemento", 1234567810, 19, 1998965425);
		Paciente u3 = new Paciente(null, "Rafael", 25092000, "teste@gmail.com", "Rua teste", "Complemento", 1234567810, 19, 1998965425);
		Paciente u4 = new Paciente(null, "Rafael", 25092000, "teste@gmail.com", "Rua teste", "Complemento", 1234567810, 19, 1998965425);
		
		usersRepository.saveAll(Arrays.asList(u1, u2, u3, u4));
	}
	
	
}
