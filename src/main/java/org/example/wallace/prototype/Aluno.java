package org.example.wallace.prototype;

public class Aluno implements Cloneable {
    private DadosPessoais dadosPessoais;
    private String matricula;
    private String curso;

    public Aluno(DadosPessoais dadosPessoais, String matricula, String curso) {
        this.dadosPessoais = dadosPessoais;
        this.matricula = matricula;
        this.curso = curso;
    }

    public DadosPessoais getDadosPessoais() {
        return dadosPessoais;
    }

    public void setDadosPessoais(DadosPessoais dadosPessoais) {
        this.dadosPessoais = dadosPessoais;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public Aluno clone() {
        try {
            Aluno clone = (Aluno) super.clone();
            clone.dadosPessoais = this.dadosPessoais.clone();
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
