 public enum WeatherCondition
{
 SUNNY("sunny"),CLOUDY("cloudy"),RAINY("rainy"),SNOW("snow"),WINDY("windy"),THUNDER("thunder");
 String value;
 
 WeatherCondition(String value) //param Constructor initialization
 {
	this.value=value; 
 }
}