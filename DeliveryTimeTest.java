package Delivery;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class DeliveryTimeTest {

	@Test
	public void testAddcusAndAddtime() {
		List<String> sampleDestinations = new ArrayList<>();
		sampleDestinations.add("palani");
		sampleDestinations.add("trichy");

		List<LocalTime> sampleTimes = new ArrayList<>();
		sampleTimes.add(LocalTime.of(1, 30));
		sampleTimes.add(LocalTime.of(0, 45));

		User user = new User();
		user.addcus(sampleDestinations.size());

		assertEquals(sampleDestinations, user.destination);

		user.time.addAll(sampleTimes);

		LocalDateTime currentTime = LocalDateTime.of(2023, Month.AUGUST, 1, 12, 0); // Example time
		LocalDateTime expectedTime = currentTime.plusHours(1).plusMinutes(30).plusHours(0).plusMinutes(45);

		LocalDateTime actualTime = user.addtime(currentTime);

		assertEquals(expectedTime, actualTime);
	}

	private final InputStream originalSystemIn = System.in;
	private final String lineSeparator = System.lineSeparator();

	@BeforeEach
	public void setUp() {
		// Restore original System.in after each test
		System.setIn(originalSystemIn);
	}

	@Test
	public void testGetInputAndCalculateDeliveryTime() {
		String input = "3" + lineSeparator + "CityA" + lineSeparator + "02:30" + lineSeparator + "CityB" + lineSeparator
				+ "03:15" + lineSeparator + "CityC" + lineSeparator + "2023:08:25 10:00" + lineSeparator;
		InputStream inputStream = new ByteArrayInputStream(input.getBytes());
		User u = new User();
		u.addcus(0);
		System.setIn(inputStream);

		LocalDateTime expectedDeliveryTime = LocalDateTime.of(2023, Month.AUGUST, 28, 14, 15); // Example time
		LocalDateTime actualDeliveryTime = expectedDeliveryTime.plusHours(0).plusMinutes(0).plusHours(0).plusMinutes(0);

		LocalDateTime actualTime = u.addtime(expectedDeliveryTime);

		assertEquals(actualDeliveryTime, actualTime);
	}

}
