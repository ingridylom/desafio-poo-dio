import br.com.dio.desafio.dominio.Bootcamp;
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
        Set<Curso> cursosJava = Set.of(cursoJava, cursoGit, cursoSCRUM);
        bootcampJava.setCursos(cursosJava);
        Set<Mentoria> mentoriasJava = Set.of(mentoriaJava, mentoriaSoftSkills, mentoriaAgil);
        bootcampJava.setMentorias(mentoriasJava);

        Bootcamp bootcampJS = new Bootcamp();
        bootcampJS.setNome("Bootcamp JS Developer");
        bootcampJS.setDescricao("Descrição Bootcamp JS Developer");
        Set<Curso> cursosJS = Set.of(cursoJS, cursoGit, cursoSCRUM);
        bootcampJS.setCursos(cursosJS);
        Set<Mentoria> mentoriasJS = Set.of(mentoriaJS, mentoriaSoftSkills, mentoriaAgil);
        bootcampJS.setMentorias(mentoriasJS);

        Bootcamp bootcampPython = new Bootcamp();
        bootcampPython.setNome("Bootcamp Python Developer");
        bootcampPython.setDescricao("Descrição Bootcamp Python Developer");
        Set<Curso> cursosPython = Set.of(cursoPython, cursoGit, cursoSCRUM);
        bootcampPython.setCursos(cursosPython);
        Set<Mentoria> mentoriasPython = Set.of(mentoriaPython, mentoriaSoftSkills, mentoriaAgil);
        bootcampPython.setMentorias(mentoriasPython);
        // endregion

        // region Devs
        Dev devIngridy = new Dev();
        devIngridy.setNome("Ingridy");
        devIngridy.inscreverBootcamp(bootcampJava);
        System.out.println("Cursos Inscritos Ingridy:" + devIngridy.getCursosInscritos());
        devIngridy.progredir();
        devIngridy.progredir();
        System.out.println("-");
        System.out.println("Cursos Inscritos Ingridy:" + devIngridy.getCursosInscritos());
        System.out.println("Cursos Concluídos Ingridy:" + devIngridy.getCursosConcluidos());
        System.out.println("XP:" + devIngridy.calcularTotalXp());

        System.out.println("-------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcampJS);
        System.out.println("Cursos Inscritos João:" + devJoao.getCursosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Cursos Inscritos João:" + devJoao.getCursosInscritos());
        System.out.println("Cursos Concluidos João:" + devJoao.getCursosConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXp());
        // endregion
    }

}
