package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.BeforeEach;
public class AirportTest {
    @DisplayName("Given there is an economy flight")
    @Nested
    class EconomyFlightTest {
        private Flight economyFlight;
        @BeforeEach
        void setUp() {
            economyFlight = new EconomyFlight("1");
        }
        @Test
        public void testEconomyFlightRegularPassenger() {
            Passenger mike = new Passenger("Mike", false);
            Assertions.assertEquals("1", economyFlight.getId());
            Assertions.assertEquals(true, economyFlight.addPassenger(mike));
            Assertions.assertEquals(1, economyFlight.getPassengersList().size());
            Assertions.assertEquals("Mike",
                    economyFlight.getPassengersList().get(0).getName());
            Assertions.assertEquals(true, economyFlight.removePassenger(mike));
            Assertions.assertEquals(0, economyFlight.getPassengersList().size());
        }
        @Test
        public void testEconomyFlightVipPassenger() {
            Passenger james = new Passenger("James", true);
            Assertions.assertEquals("1", economyFlight.getId());
            Assertions.assertEquals(true, economyFlight.addPassenger(james));
            Assertions.assertEquals(1, economyFlight.getPassengersList().size());
            Assertions.assertEquals("James",
                    economyFlight.getPassengersList().get(0).getName());
            Assertions.assertEquals(false, economyFlight.removePassenger(james));
            Assertions.assertEquals(1, economyFlight.getPassengersList().size());
        }
    }

    @DisplayName("Given there is a business flight")
    @Nested
    class BusinessFlightTest {
        private Flight businessFlight;
        @BeforeEach
        void setUp() {
            businessFlight = new BusinessFlight("2");
        }
        @Test
        public void testBusinessFlightRegularPassenger() {
            Passenger mike = new Passenger("Mike", false);
            Assertions.assertEquals(false, businessFlight.addPassenger(mike));
            Assertions.assertEquals(0, businessFlight.getPassengersList().size());
            Assertions.assertEquals(false, businessFlight.removePassenger(mike));
            Assertions.assertEquals(0, businessFlight.getPassengersList().size());
        }
        @Test
        public void testBusinessFlightVipPassenger() {
            Passenger james = new Passenger("James", true);
            Assertions.assertEquals(true, businessFlight.addPassenger(james));
            Assertions.assertEquals(1, businessFlight.getPassengersList().size());
            Assertions.assertEquals(false, businessFlight.removePassenger(james));
            Assertions.assertEquals(1, businessFlight.getPassengersList().size());
        }
    }
}
