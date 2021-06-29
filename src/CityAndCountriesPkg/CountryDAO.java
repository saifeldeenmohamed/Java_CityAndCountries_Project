/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CityAndCountriesPkg;

/**
 *
 * @author SaiF El-deen
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CountryDAO
{
    static List<Country> countries = new ArrayList<>();

    public static void readCountriesCSV(String path) throws IOException
    {
        BufferedReader reader = new BufferedReader(new FileReader(path));
        String line;
        String[] parts;
        Country country;
        do {
                line = reader.readLine();
                if (line != null)
                {
                    parts = line.split(",");
                    country = new Country(parts[0], parts[1].trim(),
                            parts[2], Integer.parseInt(parts[3]),
                            Double.parseDouble(parts[4]), Double.parseDouble(parts[5]),
                            Integer.parseInt(parts[6]));
                    countries.add(country);
                }
            } while (line != null);
        reader.close();
    }

    public static void getCountriesPopulation()
    {
        countries.forEach(c -> System.out.println(c.getCountryName() + " : "+ c.getPopulation())); // <<this meaning? why no return
    }

    public static double getAveragePopulation()
    {
        return countries.stream().mapToLong(Country::getPopulation).average().getAsDouble(); // << this meaning?
    }

    public static long getMaxCountryPopulation()
    {
        return countries.stream().map(Country::getPopulation).max(Long::compare).get(); // Long::compare meaning
    }

    public static List<Country> getCountryDataset()
    {
        return countries;
    }
}