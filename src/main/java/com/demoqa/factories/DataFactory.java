package com.demoqa.factories;

import com.demoqa.models.DatePickersModel;
import lombok.SneakyThrows;
import org.openqa.selenium.NotFoundException;

import java.io.FileNotFoundException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;

import static io.restassured.path.json.JsonPath.from;

public class DataFactory {

    private static final String DATE_PICKERS_JSON = "json/date_pickers.json";

    private DataFactory() {
    }

    public static DatePickersModel with(String code) {
        return getData().stream()
                .filter(user -> user.getCode()
                        .equals(code))
                .findFirst()
                .orElseThrow(() ->
                        new NotFoundException(String.format("Data with code %s not found", code)));
    }

    public static List<DatePickersModel> getData() {
        return Arrays.asList(from(getFile()).getObject("DatePickers", DatePickersModel[].class));
    }

    @SneakyThrows
    private static URL getFile() {
        String path = DATE_PICKERS_JSON;
        URL filePath = DataFactory.class.getClassLoader().getResource(path);
        if (filePath == null) {
            throw new FileNotFoundException("File not found for data: " + path);
        }
        return filePath;
    }

}
