import org.example.wallace.prototype.Aluno;
import org.example.wallace.prototype.DadosPessoais;
import org.junit.Test;
import static org.junit.Assert.*;

public class AlunoTest {
    @Test
    public void testClonagem() {
        DadosPessoais dadosPessoais = new DadosPessoais("João", 20, "Rua A");
        Aluno aluno1 = new Aluno(dadosPessoais, "123", "Engenharia");
        Aluno aluno2 = aluno1.clone();

        assertNotSame(aluno1, aluno2);
        assertNotSame(aluno1.getDadosPessoais(), aluno2.getDadosPessoais());

        assertEquals(aluno1.getMatricula(), aluno2.getMatricula());
        assertEquals(aluno1.getCurso(), aluno2.getCurso());
    }
}