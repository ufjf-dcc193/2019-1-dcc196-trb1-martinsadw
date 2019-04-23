package br.ufjf.dcc193.t1.ong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(DemoApplication.class, args);

		SedeRepository rep = ctx.getBean(SedeRepository.class);
		rep.save(new Sede("Sede teste", "MG", "Juiz de Fora", "São Pedro", "999999999", "http://localhost:8080/index"));
		rep.save(new Sede("Outra sede teste", "MG", "Juiz de Fora", "São Pedro", "999999999", "http://localhost:8080/index"));
		rep.save(new Sede("YaST", "MG", "Juiz de Fora", "São Pedro", "999999999", "http://localhost:8080/index"));
		rep.save(new Sede("Yet another Sede Teste", "MG", "Juiz de Fora", "São Pedro", "999999999", "http://localhost:8080/index"));
	}
}
