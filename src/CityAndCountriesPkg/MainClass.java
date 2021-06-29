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
import java.io.IOException;

public class MainClass
{
    public static void main(String[] args) throws IOException
    {
        CountryDAO.readCountriesCSV("C:\\Users\\SaiF El-deen\\Desktop\\JavaITI\\CityAndCountriesAnalysis\\Data_sets\\Countries.csv");
        CityDAO.readCitiesCSV("C:\\Users\\SaiF El-deen\\Desktop\\JavaITI\\CityAndCountriesAnalysis\\Data_sets\\Cities.csv");

        System.out.println("\n A List Of Countries Population: ");
        CountryDAO.getCountriesPopulation();

        System.out.println("\n Average Population per Countries: " + CountryDAO.getAveragePopulation());
        System.out.println("\n Max Country Population: " + CountryDAO.getMaxCountryPopulation());

        MappingClass.mappingCountry(CityDAO.getCityDataset() ,CountryDAO.getCountryDataset());
        System.out.println("\n Highest Population City per Country: ");
        MappingClass.getHighestPopulationCityOfEachCountry();

        System.out.println("\n Highest Population Capital");
        MappingClass.getHighestPopulationCapital(CityDAO.getCityDataset() ,CountryDAO.getCountryDataset());

    }

}