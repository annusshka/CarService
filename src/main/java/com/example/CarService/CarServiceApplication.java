package com.example.CarService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CarServiceApplication {

	//@Autowired
	//private ClientRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(CarServiceApplication.class, args);
	}

	/*
	@Bean
	public CommandLineRunner commandLineRunner(
			ClientRepository clientRepository
	) {
		return args -> {
			var client = Client.builder()
					.name("Ann")
					.fartherName("Sergeevna")
					.surname("Telegina")
					.build();
			clientRepository.insert(client);
		};
	}*/
	/*
	@Override
	public void run(String... args) throws Exception {

		repository.deleteAll();

		// save a couple of customers
		repository.save(new Client("Alice", "Smith"));
		repository.save(new Client("Bob", "Smith"));

		System.out.println("Clients found with findAll():");
		System.out.println("-------------------------------");
		for (Client client : repository.findAll()) {
			System.out.println(client);
		}
		System.out.println();

		System.out.println("Clients found with findByFirstName('Alice'):");
		System.out.println("--------------------------------");
		System.out.println(repository.findByFirstName("Alice"));

		System.out.println("Clients found with findByLastName('Smith'):");
		System.out.println("--------------------------------");
		for (Client client : repository.findByLastName("Smith")) {
			System.out.println(client);
		}
	}*/
}
