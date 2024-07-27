package com.alx.pattern_builder.builders;

import com.alx.pattern_builder.components.Color;
import com.alx.pattern_builder.components.Transmission;
import com.alx.pattern_builder.components.CarType;
import com.alx.pattern_builder.components.Engine;

public interface IBuilder {

    void setCarType(CarType carType);
    void setSeats(int seats);
    void setTransmission(Transmission transmission);
    void setEngine(Engine engine);
    void setColor(Color color);

}
