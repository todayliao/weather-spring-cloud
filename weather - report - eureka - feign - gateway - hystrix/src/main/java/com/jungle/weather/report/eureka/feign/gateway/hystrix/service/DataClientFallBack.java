package com.jungle.weather.report.eureka.feign.gateway.hystrix.service;

import com.jungle.weather.report.eureka.feign.gateway.hystrix.vo.City;
import com.jungle.weather.report.eureka.feign.gateway.hystrix.vo.WeatherResponse;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DataClientFallBack implements DataClient{
    @Override
    public List<City> listCity() throws Exception {
        List<City> cityList = null;
        cityList = new ArrayList<>();

        City city = new City();
        city.setCityId("101280601");
        city.setCityName("深圳");
        cityList.add(city);

        city = new City();
        city.setCityId("101280301");
        city.setCityName("惠州");
        cityList.add(city);

        return cityList;
    }

    @Override
    public WeatherResponse getDataByCityId(String cityId) {
        return null;
    }
}
