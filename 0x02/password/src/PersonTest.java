import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class PersonTest {

    // Instância da classe Person para ser usada nos testes
    private Person person;

    @BeforeAll
    public void setup() {
        // Instanciando a classe Person antes de todos os testes
        person = new Person();
    }

    // --- Testes para checkUser() ---

    @ParameterizedTest
    @ValueSource(strings = {"PaulMcCartney2", "NeilArms2"})
    public void check_user_valid(String username) {
        Assertions.assertTrue(person.checkUser(username));
    }

    @ParameterizedTest
    @ValueSource(strings = {"Paul#McCartney", "Neil@Arms"})
    public void check_user_not_valid(String username) {
        Assertions.assertFalse(person.checkUser(username));
    }

    @ParameterizedTest
    @ValueSource(strings = {"123456789", "#$%1234"})
    public void does_not_have_letters(String password) {
        Assertions.assertFalse(person.checkPassword(password));
    }

    @ParameterizedTest
    @ValueSource(strings = {"Abcabcdefgh@", "#hbtn@%tc"})
    public void does_not_have_numbers(String password) {
        Assertions.assertFalse(person.checkPassword(password));
    }

    @ParameterizedTest
    @ValueSource(strings = {"Abc@123", "12$@hbt"})
    public void does_not_have_eight_chars(String password) {
        Assertions.assertFalse(person.checkPassword(password));
    }

    @ParameterizedTest
    @ValueSource(strings = {"abC123456$", "Hbtn@1234", "Betty@1#2", "Hbtn@123"})
    public void check_password_valid(String password) {
        // Espera-se que essas senhas sejam VÁLIDAS (true)
        Assertions.assertTrue(person.checkPassword(password));
    }
}