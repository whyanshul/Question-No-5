package com.realestateapp;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class ApartmentTest {

	@Nested
	class Apartment_For_Getting_Further_Details {

		Apartment apartment = new Apartment(50.0, new BigDecimal(4000.0));

		@Test
		void method_for_getApartment_Details() {

			apartment.setArea(65.0f);

			apartment.setPrice(new BigDecimal(6000.0));

			assertAll(() -> assertEquals(65.0, apartment.getArea()),

					() -> assertEquals(new BigDecimal(6000.0), apartment.getPrice()));
			
			System.out.println(apartment);
		}
	}
}
