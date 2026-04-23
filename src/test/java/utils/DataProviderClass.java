package utils;

import org.testng.annotations.DataProvider;

public class DataProviderClass {

@DataProvider(name="userdata")
public Object[][] data(){

return new Object[][]{
{"Rohit","QA Engineer"},
{"Amit","Tester"}
};

}

}