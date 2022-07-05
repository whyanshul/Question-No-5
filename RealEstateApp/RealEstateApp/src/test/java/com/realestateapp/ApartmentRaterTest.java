package com.realestateapp;

import static org.junit.Assert.assertTrue;
import static org.junit.Assume.assumeTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ApartmentRaterTest {

	double area = 200;
	double price = 50000;
  
	@Test
	void Is_Apartment_EmptyTest() {

		List<Apartment> ApartmentEmptyList = Collections.<Apartment>emptyList();
		assertThrows(RuntimeException.class, () -> ApartmentRater.calculateAverageRating(ApartmentEmptyList));

	}

	@Nested
	class Apartment_NotEmptyTest {
		@Test
		void Is_Apartment_NotEmptyTest() {
			double area = 20;
			BigDecimal price = new BigDecimal(250000.00);
			Apartment apartment1 = new Apartment(area, price);

			List<Apartment> List = new ArrayList<>();
			List.add(apartment1);
			assertEquals(0.0, ApartmentRater.calculateAverageRating(List));

		}

		@Test
		void Is_Apartment_NotEmptyTest1() {
			double area = 30.0;
			BigDecimal price = new BigDecimal(350000.00);
			Apartment apartment1 = new Apartment(area, price);

			List<Apartment> List = new ArrayList<>();
			List.add(apartment1);
			assertEquals(-1.0, ApartmentRater.calculateAverageRating(List));

		}

		@Test
		void Is_Apartment_NotEmptyTest2() {
			double area = 40.0;
			BigDecimal price = new BigDecimal(600000.00);
			Apartment apartment1 = new Apartment(area, price);

			List<Apartment> List = new ArrayList<>();
			List.add(apartment1);
			assertEquals(1.0, ApartmentRater.calculateAverageRating(List));

		}
	}
}