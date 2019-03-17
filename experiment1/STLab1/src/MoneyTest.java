import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


@RunWith(Parameterized.class)

public class MoneyTest {
	private int input;
	private Money money = null;
	public MoneyTest(int input) {
		this.input = input;
	}
	
	@Before
	public void setup() {
		money = new Money();
	}
	
	@Parameters
	public static Collection<Object[]> getData(){
		return Arrays.asList(new Object[][]{
			{83},
			{51},
			{84},
			{0},
			{85}
		});
	}
	
	@org.junit.Test
	public void testMoneyCal() {
		assertTrue(money.CalMoney(input));
	}
	
}
