package twentyClass20180321;

import twentyClass20180321.twentyClassException.TemperatureOutOfRangeException;

import java.util.Calendar;
import java.util.Objects;

/**
 * 10.天气
 * @author tangweijr
 * @since 20180325
 */
public class Weather {
    public static String[] WEATHER = {"晴天", "多云", "雨", "雪"};
    public String todayWeather;
    private double temperature;
    private double humidity;
    public String city;
    public Calendar day;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Weather weather = (Weather) o;
        return Double.compare(weather.temperature, temperature) == 0 &&
                Double.compare(weather.humidity, humidity) == 0 &&
                Objects.equals(todayWeather, weather.todayWeather) &&
                Objects.equals(city, weather.city) &&
                Objects.equals(day, weather.day);
    }

    @Override
    public String toString() {
        return "Weather{" +
                "todayWeather='" + todayWeather + '\'' +
                ", temperature=" + temperature +
                ", humidity=" + humidity +
                ", city='" + city + '\'' +
                ", day=" + day +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Weather weather = new Weather(this.city,this.temperature,this.humidity,this.day);
        return weather;
    }

    @Override
    public int hashCode() {
        return (int) (((city.hashCode() * 37 + temperature) * 13 + humidity) * 13 + day.hashCode());
    }

    /**
     * 设置温度
     * @param temperature 温度
     */
    public void setTemperature(double temperature) {
        if (temperature > -50 && temperature < 55) {
            this.temperature = temperature;
        } else {
            throw new TemperatureOutOfRangeException();
        }
    }

    /**
     * 设置湿度
     * @param humidity 湿度
     */
    public void setHumidity(double humidity) {
        if (humidity >= 0 && humidity <= 100) {
            this.humidity = humidity;
        } else {
            throw new TemperatureOutOfRangeException();
        }
    }

    public static void changeWEATHER(String[] strings) {
        WEATHER = new String[strings.length];
        System.arraycopy(strings, 0, WEATHER, 0, WEATHER.length);
    }

    /**
     * 构造器，转发
     * @param day 当天日期
     */
    public Weather(Calendar day) {
        this("南京", 22, 50, Calendar.getInstance());
    }

    /**
     * 构造器，输入数据
     * @param city 城市
     * @param temperature 温度
     * @param humidity 湿度
     * @param day 当天日期
     */
    public Weather(String city, double temperature, double humidity, Calendar day) {
        this.city = city;
        this.temperature = temperature;
        this.humidity = humidity;
        this.day = day;
        if (temperature > 0 && humidity < 20) {
            this.todayWeather = WEATHER[0];
        } else if (temperature > 0 && humidity < 40) {
            this.todayWeather = WEATHER[1];
        } else if (temperature > 0 && humidity < 100) {
            this.todayWeather = WEATHER[2];
        } else if (temperature < 0) {
            this.todayWeather = WEATHER[3];
        }
    }

    /**
     * 显示当前时间和日期
     * @return 返回天气
     */
    public String showTodayWeather() {
        String today = "todoy is " + Calendar.getInstance().getTime().toLocaleString() + ", in city " + city + ", the temperature is " + temperature
                + ", and the humidity is " + humidity;
        if (temperature > 0) {
            System.out.println(today);
        } else {
            System.err.println(today);
        }
        return today;
    }

    /**
     * 雨雪天气警报
     */
    public boolean weatherWarning() {
        if (temperature < 0 && humidity > 60) {
            System.err.println("today may snowing, be careful");
            return true;
        } else {
            return false;
        }
    }
}
