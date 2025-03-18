package DigitalThermometer;
public class DigitalThermometer {
	private String serialNumber;
	private char type;
	private double temperature;
	private String diagnosis;

	public DigitalThermometer(String serialNumber, char type) {
	this.serialNumber = serialNumber;
	this.type = type;
	this.temperature = 0.0;
	this.diagnosis = "";
	}

	public void hurtTemperature(double temperature) {
	this.temperature = temperature;
	this.diagnosis = readDiagnosis();
	}

	public String readDiagnosis() {
	if (temperature < 35.5) {
	return "Hypothermia";
	} else if (temperature >= 35.5 && temperature < 37.5) {
	return "Normal";
	} else if (temperature >= 37.5 && temperature < 38.1) {
	return "Febrile State";
	} else if (temperature >= 38.1 && temperature < 39.0) {
	return "Fever";
	} else if (temperature >= 39.0 && temperature < 40.0) {
	return "High Fever";
	} else {
	return "Hyperthermia";
	}
	}

	public String getSerialNumber() {
	return serialNumber;
	}
	public char getType() {
	return type;
	}
	public double getTemperature() {
	return temperature;
	}
	public String getDiagnosis() {
	return diagnosis;
	}
}
