package co.simplon.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import co.simplon.test.model.Test;
import co.simplon.test.service.BusinessService;

@SpringBootApplication
public class TestApplication implements CommandLineRunner {

	@Autowired
	private BusinessService bs;
	
	public static void main(String[] args) {
        SpringApplication.run(TestApplication.class, args);
    }


	@Override
	public void run(String... args) throws Exception {
		Test tset = bs.getTest();
		System.out.println(tset);
		
	}
	
}
