package br.ufjf.dcc193.t1.ong;

import java.sql.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(DemoApplication.class, args);

		SedeRepository repSede = ctx.getBean(SedeRepository.class);
		// MembroRepository repMembro = ctx.getBean(MembroRepository.class);
		// AtividadeRepository repAtividade =  ctx.getBean(AtividadeRepository.class);

		Sede sede = new Sede("Sede teste", "MG", "Juiz de Fora", "São Pedro", "999999999", "http://localhost:8080/index");

		Membro membro = new Membro("Membro teste", "Tester", "teste@teste.com", Date.valueOf("2019-04-21"), Date.valueOf("2019-04-22"));
		membro.setSede(sede);
		sede.getMembros().add(membro);

		membro = new Membro("Teste membro", "Membro", "membro@membro.com", Date.valueOf("2019-04-22"), Date.valueOf("2019-04-23"));
		membro.setSede(sede);
		sede.getMembros().add(membro);

		Atividade atividade = new Atividade("Atividade", "Uma atividade qualquer", Date.valueOf("2019-04-24"), Date.valueOf("2019-04-25"), 1f, 2f, 3f, 4f);
		atividade.setSede(sede);
		sede.getAtividades().add(atividade);

		atividade = new Atividade("Inatividade", "Uma não atividade qualquer", Date.valueOf("2019-04-25"), Date.valueOf("2019-04-24"), 0f, 0f, 0f, 0f);
		atividade.setSede(sede);
		sede.getAtividades().add(atividade);

		repSede.save(sede);

		// SedeRepository repSede = ctx.getBean(SedeRepository.class);
		// repSede.save(new Sede("Sede teste", "MG", "Juiz de Fora", "São Pedro", "999999999", "http://localhost:8080/index"));
		// repSede.save(new Sede("Outra sede teste", "MG", "Juiz de Fora", "São Pedro", "999999999", "http://localhost:8080/index"));
		// repSede.save(new Sede("YaST", "MG", "Juiz de Fora", "São Pedro", "999999999", "http://localhost:8080/index"));
		// repSede.save(new Sede("Yet another Sede Teste", "MG", "Juiz de Fora", "São Pedro", "999999999", "http://localhost:8080/index"));
		
		// MembroRepository repMembro = ctx.getBean(MembroRepository.class);
		// repMembro.save(new Membro("Membro teste", "Tester", "teste@teste.com", Date.valueOf("2019-04-21"), Date.valueOf("2019-04-22")));
		// repMembro.save(new Membro("Teste membro", "Membro", "membro@membro.com", Date.valueOf("2019-04-22"), Date.valueOf("2019-04-23")));
	}
}
