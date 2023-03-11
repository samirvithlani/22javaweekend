package com.oops.abstracction;

interface IMF{
	
	void loan();
	
}
abstract class RBI implements IMF{
	
	public void loan() {
		
	}
	
}
class India extends RBI{
	
	
}


public class CountryTest {

}
