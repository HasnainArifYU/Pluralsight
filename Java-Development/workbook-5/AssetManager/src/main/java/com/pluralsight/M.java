package com.pluralsight;

import java.util.ArrayList;

public class M {
    public static void main(String[] args) {
        ArrayList<Asset> assets = new ArrayList<>();

        House house1 = new House("123 Main St", 5, 2500, 5000, "My House", "2010-01-01", 300000);
        House house2 = new House("456 Oak St", 4, 3000, 6000, "Tom's House", "2015-06-15", 400000);

        Vehicle vehicle1 = new Vehicle("Ford F-150", 2020, 25000, "Tom's Truck", "2020-05-01");
        vehicle1.setOdo(15000);
        Vehicle vehicle2 = new Vehicle("Honda Civic", 2018, 20000, "My Car", "2018-03-01");
        vehicle2.setOdo(105000);

        assets.add(house1);
        assets.add(house2);
        assets.add(vehicle1);
        assets.add(vehicle2);

        for (Asset asset : assets) {
            System.out.println("Description: " + asset.getDescription());
            System.out.println("Date Acquired: " + asset.getDateAcquired());
            System.out.println("Original Cost: " + asset.getOriginalCost());
            System.out.println("Current Value: " + asset.getValue());

            if (asset instanceof House) {
                House house = (House) asset;
                System.out.println("Address: " + house.getAddress());
            } else if (asset instanceof Vehicle) {
                Vehicle vehicle = (Vehicle) asset;
                System.out.println("Make & Model: " + vehicle.getMakeModel());
                System.out.println("Year: " + vehicle.getYear());
            }

            System.out.println();
        }
    }
}
