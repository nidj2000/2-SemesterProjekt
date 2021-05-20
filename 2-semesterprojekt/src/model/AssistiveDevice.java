package model;

import java.util.ArrayList;
import java.util.List;

public class AssistiveDevice {

	private List<AssistiveDeviceInstance> adi;
	private int hmiNumber;
	private String name;
	private String type;

	public AssistiveDevice(int hmiNumber, String name, String type) {
		this.hmiNumber = hmiNumber;
		this.name = name;
		this.type = type;

		adi = new ArrayList<>();
	}

	public int getHmiNumber() {
		return hmiNumber;
	}

	public void setHmiNumber(int hmiNumber) {
		this.hmiNumber = hmiNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}