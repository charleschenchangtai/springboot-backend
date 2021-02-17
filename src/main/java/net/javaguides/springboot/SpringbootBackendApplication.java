package net.javaguides.springboot;

import net.javaguides.springboot.model.User;
import net.javaguides.springboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Repository;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootBackendApplication.class, args);
    }

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        this.userRepository.save(new User("Bruise","Wayne","bruise@gmail.com"));
        this.userRepository.save(new User("Diana","Prince ","diana@gmail.com"));
        this.userRepository.save(new User("Clerk","Kent","clerk@gmail.com"));
        this.userRepository.save(new User("Barry","Allen","barry@gmail.com"));
        this.userRepository.save(new User("Arthur","Curry","authur@0com"));
        this.userRepository.save(new User("Cyborg","","Cyborg@gmail.com"));
    }

}
