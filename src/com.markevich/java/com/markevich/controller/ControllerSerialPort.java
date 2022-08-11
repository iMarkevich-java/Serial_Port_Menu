package com.markevich.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableArray;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class ControllerSerialPort implements Initializable {

	@FXML
	private ComboBox<String> comboBoxBaudRate;


	private ObservableList <String> baudRade = FXCollections.observableArrayList();


	@Override
	public void initialize(URL url, ResourceBundle resourceBundle) {
		baudRade = FXCollections.observableArrayList("4800", "9600");
		comboBoxBaudRate.setItems(baudRade);

	}
}