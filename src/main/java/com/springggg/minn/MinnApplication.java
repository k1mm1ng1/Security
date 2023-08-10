package com.springggg.minn;

import com.springggg.minn.domain.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class MinnApplication {

	public static void main(String[] args) {
		SpringApplication.run(MinnApplication.class, args);
	}
}
