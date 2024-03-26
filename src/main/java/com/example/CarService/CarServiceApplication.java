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
			RepairRequestRepository requestRepository,
			RepairRequestService service
	) {
		return args -> {
			var client = RepairRequest.builder()
					.id(new RepairRequestId(new ObjectId("65ebfd734ddfaf6f62395dd9"), "Y707YB"))
					.problem("some problems")
					.build();
			requestRepository.save(client);
			requestRepository.findAll();
			requestRepository.findByIdCar("Y707YB");
			requestRepository.findByIdClient(new ObjectId("65ebfd734ddfaf6f62395dd9"));
			service.delete(client.getId());
			requestRepository.findAll();
		};
	}*/
}
