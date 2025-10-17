package br.com.techcamps;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TesteEmail{

    

    @Test
    public void testar_email_com_arroba(){
        String email_com_arroba = "email_teste@dominio.com.br";
        Pessoa pessoa = new Pessoa();
        pessoa.setEmail(email_com_arroba);
        Assertions.assertTrue(Pessoa.emailValid(email_com_arroba));
    }

    @Test
    public void testar_email_sem_arroba(){
        String email_sem_arroba = "email_teste_dominio.com.br";
        Pessoa pessoa = new Pessoa();
        pessoa.setEmail(email_sem_arroba);
        Assertions.assertFalse(Pessoa.emailValid(email_sem_arroba));
    }

    public void testar_email_mais_50_caracteres(){
        String email_mais_50 = "email_teste_muito_longo_nao_deve_ser_valido@dominio.com.br";
        Pessoa pessoa = new Pessoa();
        pessoa.setEmail(email_mais_50);
        Assertions.assertEquals(false, Pessoa.emailValid(email_mais_50));
    }


}