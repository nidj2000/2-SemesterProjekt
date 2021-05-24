package gui;

import java.sql.SQLException;

import controller.RentalController;
import databases.AssistiveDeviceDB;
import databases.AssistiveDeviceInstanceDB;
import databases.DataAccessException;
import databases.ResidentDB;
import databases.ZipCityDB;
import model.AssistiveDevice;
import model.AssistiveDeviceInstance;
import model.Resident;
import model.ZipCity;

public class TryMe {
	// private static AssistiveDeviceInstanceDB ass;

	public static void main(String[] args) throws DataAccessException, SQLException {

		AssistiveDeviceInstanceDB ass = new AssistiveDeviceInstanceDB();
		AssistiveDeviceDB ass2 = new AssistiveDeviceDB();
		ResidentDB ass3 = new ResidentDB();

		Resident a = ass3.findResidentBySsn("1804646469");

		System.out.println(a.getFname() + " " + a.getZipCity().getCity());

		for (AssistiveDeviceInstance q : ass.findInstancesByDeviceId(1)) {
			System.out.println(q.getBarcode() + ", " + q.getRegisteredDate() + ", " + q.getNote());
		}

		for (AssistiveDevice q : ass2.findAssistiveDevices("102771")) {
			System.out.println(q.getHmiNumber() + ", " + q.getName() + ", " + q.getType());
		}

		RentalController rentalController = new RentalController();
		Resident a1 = rentalController.getResidentController().findResident("1804646469");
		System.out.println(a1.getEmail() + " " + a1.getZipCity().getCity());

	}
}
