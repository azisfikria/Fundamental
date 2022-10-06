package juaracodingday5;
import juaracodingday5.model.User;


public class ContohEncapsulation {
    public static void main(String[] args) {
            User dadang = new User();
            dadang.setUsername("dadang");
            dadang.setPassword("password");
            System.out.println(dadang.getUsername());
            System.out.println(dadang.getPassword());
    }
}

