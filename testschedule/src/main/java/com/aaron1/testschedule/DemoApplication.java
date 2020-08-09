package com.aaron1.testschedule;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication()
public class DemoApplication {

	public static void main(String[] args) {
		// EdgeWeightedDigraph digraph = new EdgeWeightedDigraph(createTournArray("/Users/aaroncohen/Downloads/ATP2020ScheduleUpdate.xlsx"));

		SpringApplication.run(DemoApplication.class, args);
		// TournamentController.createTournArray();

	}

}
