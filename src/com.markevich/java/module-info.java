module com.example.serial_port_menu {
	requires javafx.controls;
	requires javafx.fxml;


	opens com.markevich to javafx.fxml;
	exports com.markevich;
	exports com.markevich.controller;
	opens com.markevich.controller to javafx.fxml;
}