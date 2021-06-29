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

public class Country
{
    private String code;
    private String countryName;
    private String continent;
    private long population;
    private double surfaceArea;
    private double gnp;
    private int capitalId;

    public Country(String code,
                   String countryname,
                   String continent,
                   long population,
                   double surfaceArea,
                   double gnp,
                   int capitalId)
    {
        this.code = code;
        this.countryName = countryname;
        this.continent = continent;
        this.surfaceArea = surfaceArea;
        this.population = population;
        this.gnp = gnp;
        this.capitalId = capitalId;
    }


    public String getCode() {
        return code;
    }
    public String getCountryName() {
        return countryName;
    }
    public String getContinent() {
        return continent;
    }
    public double getSurfaceArea() {
        return surfaceArea;
    }
    public long getPopulation() {
        return  population;
    }
    public double getGnp() {
        return gnp;
    }
    public int getCapitalId() {
        return capitalId;
    }

    @Override
    public String toString() {
        return countryName + "[ " + code + " ]";
    }

}