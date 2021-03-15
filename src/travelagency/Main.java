package travelagency;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Continent europa = new Continent();
        europa.setName("Europa");
        ArrayList<Country> countries = new ArrayList<>();

        Country romania = new Country();
        romania.setName("Romania");
        countries.add(romania);
        Country franta = new Country();
        franta.setName("Franta");
        countries.add(franta);
        europa.setCountries(countries);

        ArrayList<City> citiesRomania = new ArrayList<>();
        City bucuresti = new City();
        bucuresti.setName("Bucuresti");
        citiesRomania.add(bucuresti);
        City craiova = new City();
        craiova.setName("Craiova");
        citiesRomania.add(craiova);
        romania.setCities(citiesRomania);

        ArrayList<City> citiesFranta = new ArrayList<>();
        City paris = new City();
        paris.setName("Paris");
        citiesFranta.add(paris);
        City marseille = new City();
        marseille.setName("Marseille");
        citiesFranta.add(marseille);
        franta.setCities(citiesFranta);

        ArrayList<Hotel> hoteleBucuresti = new ArrayList<>();
        Hotel ramada = new Hotel();
        ramada.setNume("Ramada");
        hoteleBucuresti.add(ramada);
        Hotel hilton = new Hotel();
        hilton.setNume("Hilton");
        hoteleBucuresti.add(hilton);
        bucuresti.setHotels(hoteleBucuresti);

        ArrayList<Airport> aeroportBucuresti = new ArrayList<>();
        Airport otopeni = new Airport();
        otopeni.setNume("OTP");
        aeroportBucuresti.add(otopeni);
        bucuresti.setAirports(aeroportBucuresti);

        ArrayList<Airport> aeroportCraiova = new ArrayList<>();
        Airport cra = new Airport();
        cra.setNume("CRA");
        aeroportCraiova.add(cra);
        craiova.setAirports(aeroportCraiova);

        ArrayList<Airport> aeroportParis = new ArrayList<>();
        Airport par = new Airport();
        par.setNume("PAR");
        aeroportParis.add(par);
        paris.setAirports(aeroportParis);

        ArrayList<Airport> aeroportMarsaille = new ArrayList<>();
        Airport mar = new Airport();
        mar.setNume("MAR");
        aeroportMarsaille.add(mar);
        marseille.setAirports(aeroportMarsaille);

        europa.display();

    }
}
