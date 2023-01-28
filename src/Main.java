import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // region Cursos
        Curso cursoJava = new Curso();
        cursoJava.setTitulo("curso java");
        cursoJava.setDescricao("descrição curso java");
        cursoJava.setCargaHoraria(48);

        Curso cursoJS = new Curso();
        cursoJS.setTitulo("curso js");
        cursoJS.setDescricao("descrição curso js");
        cursoJS.setCargaHoraria(18);

        Curso cursoPython = new Curso();
        cursoPython.setTitulo("curso python");
        cursoPython.setDescricao("descrição curso python");
        cursoPython.setCargaHoraria(20);

        Curso cursoGit = new Curso();
        cursoGit.setTitulo("curso git");
        cursoGit.setDescricao("descrição curso git");
        cursoGit.setCargaHoraria(2);

        Curso cursoSCRUM = new Curso();
        cursoSCRUM.setTitulo("curso SCRUM");
        cursoSCRUM.setDescricao("descrição curso SCRUM");
        cursoSCRUM.setCargaHoraria(3);
        // endregion

        // region Mentorias
        Mentoria mentoriaJava = new Mentoria();
        mentoriaJava.setTitulo("mentoria de java");
        mentoriaJava.setDescricao("descrição mentoria java");
        mentoriaJava.setData(LocalDate.now());

        Mentoria mentoriaJS = new Mentoria();
        mentoriaJS.setTitulo("mentoria de js");
        mentoriaJS.setDescricao("descrição mentoria js");
        mentoriaJS.setData(LocalDate.now());

        Mentoria mentoriaPython = new Mentoria();
        mentoriaPython.setTitulo("mentoria de python");
        mentoriaPython.setDescricao("descrição mentoria python");
        mentoriaPython.setData(LocalDate.now());

        Mentoria mentoriaSoftSkills = new Mentoria();
        mentoriaSoftSkills.setTitulo("mentoria de soft skills");
        mentoriaSoftSkills.setDescricao("descrição mentoria soft skills");
        mentoriaSoftSkills.setData(LocalDate.now());

        Mentoria mentoriaAgil = new Mentoria();
        mentoriaAgil.setTitulo("mentoria de desenvolvimento agil");
        mentoriaAgil.setDescricao("descrição mentoria desenvolvimento agil");
        mentoriaAgil.setData(LocalDate.now());
        // endregion

        // region Bootcamps
        Bootcamp bootcampJava = new Bootcamp();
        bootcampJava.setNome("Bootcamp Java Developer");
        bootcampJava.setDescricao("Descrição Bootcamp Java Developer");
        Set<Conteudo> conteudosJava = Set.of(
                cursoJava,
                cursoGit,
                cursoSCRUM,
                mentoriaJava,
                mentoriaSoftSkills,
                mentoriaAgil);
        bootcampJava.setConteudos(conteudosJava);

        Bootcamp bootcampJS = new Bootcamp();
        bootcampJS.setNome("Bootcamp JS Developer");
        bootcampJS.setDescricao("Descrição Bootcamp JS Developer");
        Set<Conteudo> cursosJS = Set.of(
                cursoJS,
                cursoGit,
                cursoSCRUM,
                mentoriaJS,
                mentoriaSoftSkills,
                mentoriaAgil);
        bootcampJS.setConteudos(cursosJS);

        Bootcamp bootcampPython = new Bootcamp();
        bootcampPython.setNome("Bootcamp Python Developer");
        bootcampPython.setDescricao("Descrição Bootcamp Python Developer");
        Set<Conteudo> cursosPython = Set.of(
                cursoPython,
                cursoGit,
                cursoSCRUM,
                mentoriaSoftSkills,
                mentoriaAgil);
        bootcampPython.setConteudos(cursosPython);
        // endregion

        // region Devs
        System.out.println("-------");
        System.out.println("-------");
        Dev devIngridy = new Dev();
        devIngridy.setNome("Ingridy");
        devIngridy.inscreverBootcamp(bootcampJava);
        System.out.println("Conteudos Inscritos Ingridy:" + devIngridy.getConteudosInscritos());
        devIngridy.progredir();
        devIngridy.progredir();
        devIngridy.progredir();
        devIngridy.progredir();
        devIngridy.progredir();
        System.out.println("#############");
        System.out.println("Conteudos Inscritos Ingridy:" + devIngridy.getConteudosInscritos());
        System.out.println("Conteudos Concluídos Ingridy:" + devIngridy.getConteudosConcluidos());
        System.out.println("XP:" + devIngridy.calcularTotalXp());

        System.out.println("-------");

        Dev devMayron = new Dev();
        devMayron.setNome("Mayron");
        devMayron.inscreverBootcamp(bootcampJS);
        System.out.println("Conteudos Inscritos Mayron:" + devMayron.getConteudosInscritos());
        devMayron.progredir();
        devMayron.progredir();
        devMayron.progredir();
        devMayron.progredir();
        devMayron.progredir();
        System.out.println("#############");
        System.out.println("Conteudos Inscritos Mayron:" + devMayron.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Mayron:" + devMayron.getConteudosConcluidos());
        System.out.println("XP:" + devMayron.calcularTotalXp());
        devMayron.regredir();
        devMayron.regredir();
        System.out.println("#############");
        System.out.println("Conteudos Inscritos Mayron:" + devMayron.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Mayron:" + devMayron.getConteudosConcluidos());
        System.out.println("XP:" + devMayron.calcularTotalXp());
        // endregion
    }

}
