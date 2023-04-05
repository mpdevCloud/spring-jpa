package dio.aula;

import dio.aula.model.User;
import dio.aula.repository.UserRepesitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.stereotype.Component;

@Component
public class StartApp implements CommandLineRunner {
    @Autowired
    private UserRepesitory repository;
    @Override
    public void run (String... args) throws Exception {
        User user = new User();
        user.setName("RODRIGO");
        user.setUsername("mpdevCloud");
        user.setPassword("dio321");

        repository.save(user);

        for(User u: repository.findAll()) {
            System.out.println(u);
        }
    }
}
