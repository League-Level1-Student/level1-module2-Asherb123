package _03_smurf;

public class SmurfRunner {
public static void main(String[] args) {

	Smurf handy = new Smurf("handy");
handy.getName();	
handy.eat();



Smurf pappa = new Smurf("pappa");

System.out.println(pappa.getHatColor());

System.out.println(pappa.isGirlOrBoy());



Smurf smurfette = new Smurf("smurfette");

System.out.println( smurfette.getHatColor());
System.out.println( smurfette.isGirlOrBoy());













}
}
