package br.com.techcamps;

public class Pessoa {
    
    public Pessoa(){

    }
    
    private String email;
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static final boolean emailValid(String email) {


        String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        return email != null && email.matches(emailRegex) || email.length()> 50;
    }

}
