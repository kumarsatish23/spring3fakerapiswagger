package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import com.example.demo.binding.CompanyDTLS;
import com.github.javafaker.Faker;

@org.springframework.stereotype.Service
public class Service {
	Faker faker = new Faker();

	public List<CompanyDTLS> getDTLS() {
		List<CompanyDTLS> dtls = new ArrayList<>();
		for (int i = 0; i <= 200; i++) {
			dtls.add(new CompanyDTLS(faker.idNumber().validSvSeSsn().toString(), faker.company().name(),
					faker.address().fullAddress().toString(), faker.commerce().price(1000000, 1000000000),
					faker.number().digit().toString(), faker.number().digit().toString(), faker.bool().bool(),
					faker.company().industry().toString()));
		}
		return dtls;
	}
}