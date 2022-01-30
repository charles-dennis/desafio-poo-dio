import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import br.com.dio.desafio.dominio.BootCamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.CursoAceleracao;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		  Curso curso1 = new Curso();
	        curso1.setTitulo("curso java");
	        curso1.setDescricao("descri��o curso java");
	        curso1.setCargaHoraria(8);

	        Curso curso2 = new Curso();
	        curso2.setTitulo("curso js");
	        curso2.setDescricao("descri��o curso js");
	        curso2.setCargaHoraria(4);
	        
	        DateTimeFormatter dataFormatada = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	        Mentoria mentoria = new Mentoria();
	        mentoria.setTitulo("mentoria de java");
	        mentoria.setDescricao("descri��o mentoria java");
	        mentoria.setData(dataFormatada.format(LocalDate.now()));

	        BootCamp bootcamp = new BootCamp();
	        bootcamp.setNome("Bootcamp Java Developer");
	        bootcamp.setDescricao("Descri��o Bootcamp Java Developer");
	        bootcamp.getConteudos().add(curso1);
	        bootcamp.getConteudos().add(curso2);
	        bootcamp.getConteudos().add(mentoria);

	        Dev devCamila = new Dev();
	        devCamila.setNome("Camila");
	        devCamila.inscreverBootcamp(bootcamp);
	        System.out.println("Conte�dos Inscritos Camila:" + devCamila.getConteudosInscritos());
	        devCamila.progredirBootCamp();
	        devCamila.progredirBootCamp();
	        System.out.println("-");
	        System.out.println("Conte�dos Inscritos Camila:" + devCamila.getConteudosInscritos());
	        System.out.println("Conte�dos Conclu�dos Camila:" + devCamila.getConteudosConcluidos());
	        System.out.println("XP:" + devCamila.calcularTotalXp());

	        System.out.println("-------");

	        Dev devJoao = new Dev();
	        devJoao.setNome("Joao");
	        devJoao.inscreverBootcamp(bootcamp);
	        System.out.println("Conte�dos Inscritos Jo�o:" + devJoao.getConteudosInscritos());
	        devJoao.progredirBootCamp();
	        devJoao.progredirBootCamp();
	        devJoao.progredirBootCamp();
	        System.out.println("-");
	        System.out.println("Conte�dos Inscritos Jo�o:" + devJoao.getConteudosInscritos());
	        System.out.println("Conte�dos Concluidos Jo�o:" + devJoao.getConteudosConcluidos());
	        System.out.println("XP:" + devJoao.calcularTotalXp());
	        
	        System.out.println("-------");
	        
	        
	        CursoAceleracao aceleracao1 = new CursoAceleracao();
	        aceleracao1.setTitulo("Java-Spring");
	        aceleracao1.setDescricao("Spring boot para iniciante");
	        aceleracao1.setCargaHoraria(9);
	        aceleracao1.getConteudos().add(curso1);
	        aceleracao1.getConteudos().add(curso2);
	        aceleracao1.getConteudos().add(mentoria);
	        aceleracao1.getConteudos().add(aceleracao1);
	        
	        
	        Dev devCharles = new Dev();
	        devCharles.setNome("Charles");
	        devCharles.inscreverAceleracao(aceleracao1);
	        System.out.println("Conte�dos Inscritos por Charles:" + devCharles.getConteudosInscritos());
	        devCharles.progredirAceleracao();
	        devCharles.progredirAceleracao();
	        devCharles.progredirAceleracao();
			devCharles.progredirAceleracao();
	        System.out.println("-");
	        System.out.println("Conte�dos Inscritos por charles:" + devCharles.getConteudosInscritos());
	        System.out.println("Conte�dos Concluidos por charles:" + devCharles.getConteudosConcluidos());
	        System.out.println("XP:" + devCharles.calcularTotalXp());
	        

	}

}
