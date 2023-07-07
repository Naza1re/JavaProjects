package com.example.pogoda;
import org.json.JSONArray;
import org.json.JSONObject;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ResourceBundle;

public class HelloController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button GetData;

    @FXML
    private Text chous;

    @FXML
    private TextField city;

    @FXML
    private Text max;

    @FXML
    private Text min;

    @FXML
    private Text preasyre;

    @FXML
    private Text temprityre;

    @FXML
    void initialize() {
        GetData.setOnAction(event -> {
            String getUserCity = city.getText().trim();
            if (!getUserCity.equals("")) {
                String output = getUrlContent("http://api.openweathermap.org/data/2.5/find?q=" + getUserCity + "&type=like&APPID=97873f87fc1b4927356aa0b926698655");
                System.out.println(output);

                JSONObject obj = new JSONObject(output);
                JSONArray list = obj.getJSONArray("list");

                for (int i = 0; i < list.length(); i++) {
                    JSONObject cityObj = list.getJSONObject(i);
                    JSONObject mainObj = cityObj.getJSONObject("main");

                    String cityName = cityObj.getString("name");
                    double temperature = mainObj.getDouble("temp");
                    double feelsLike = mainObj.getDouble("feels_like");
                    int pressure = mainObj.getInt("pressure");

                    temprityre.setText("Температура : "+ fromKelvinToCels(temperature)+" C");
                    chous.setText("Ощущается : " + fromKelvinToCels(feelsLike)+ " С");

                    preasyre.setText("Давление " +  fromPhaToMm(pressure) + " мм.рт.ст.");
                }
            }
        });
    }
    private static int fromKelvinToCels(double Kelvin){
        return (int)Kelvin - 273;
    }
    private static int fromPhaToMm(double Pha){
        return (int) ((int)Pha * 0.75006);
    }

    private static String getUrlContent(String urlAdress) {
        StringBuilder content = new StringBuilder();
        try {
            URL url = new URL(urlAdress);
            URLConnection urlConn = url.openConnection();

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConn.getInputStream()));
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                content.append(line).append("\n");
            }
            bufferedReader.close();
        } catch (Exception e) {
            System.out.println("Ты ввел не правильный город ");
        }
        return content.toString();
    }



}

