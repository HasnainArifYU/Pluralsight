package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    public void accelarate_should_increaseCarSpeed() {

        //arrange
        Car raysCar = new Car("ford", "f150 Raptor");
        int speedChange = 15;
        int exceptedSpeed = 15;

        //act
        raysCar.accelerate(speedChange);

        //assert
        int actualSpeed = raysCar.getSpeed();
        assertEquals(exceptedSpeed, actualSpeed);
    }

}