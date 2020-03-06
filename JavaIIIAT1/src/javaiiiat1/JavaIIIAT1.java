package javaiiiat1;
import java.util.LinkedList;

/**
 *
 * @author M227545
 */
public class JavaIIIAT1
{
    public static void main(String[] args)
    {
        LinkedList<Country.City> cities;
        cities = new LinkedList<Country.City>();
        
        Country.City c1 = new Country.City("Bandar Seri Begawan","Brunei","Asia");
        Country.City c2 = new Country.City("Ouagadougou","Burkina Faso","Africa");
        Country.City c3 = new Country.City("Yamoussoukro","Ivory Coast","Africa");
        Country.City c4 = new Country.City("Sri Jayawardenepura Kotte","Sri Lanka","Asia");
        
        cities.add(c1);
        cities.add(c2);
        cities.add(c3);
        cities.add(c4);
        
        
        for(int i=0; i<cities.size(); i++)
        {
            cities.get(i).info();
        }
    }
}

class Country
{
    static public class City
    {
        private String sCityName;
        private String sCountryName;
        private String sContinent;
        
        public City(String CityName, String CountryName, String Continent)
        {
            sCityName = CityName;
            sCountryName = CountryName;
            sContinent = Continent;
        }
        
        public void info()
        {
            System.out.println("The capital of " + sCountryName + " is " + sCityName + ". The country is in " + sContinent + ".");
        }
    }
}