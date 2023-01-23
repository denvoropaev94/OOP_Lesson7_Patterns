package meteo;

import java.time.LocalDateTime;

public class SpikeAdapter implements MeteoSensor{
    private SensorTemperature sensorTemperature;

    public SpikeAdapter(SensorTemperature sensorTemperature) {
        this.sensorTemperature = sensorTemperature;
    }

    @Override
    public int getId() {
        return sensorTemperature.identifier();
    }

    @Override
    public Float getTemperature() {
        return (float) sensorTemperature.temperature();
    }

    @Override
    public Float getHumidity() {
        return null;
    }

    @Override
    public Float getPressure() {
        return null;
    }

    @Override
    public LocalDateTime getDateTime() {
        LocalDateTime dateTime = LocalDateTime.of(sensorTemperature.year(),1,1,0,0,0);
        dateTime.plusDays((long)sensorTemperature.day() -1);
        dateTime.plusSeconds((long)sensorTemperature.second());

        return dateTime;
    }
}
