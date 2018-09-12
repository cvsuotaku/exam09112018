# City Ids 
	London - 5056033
	Prague - 3067696
	San Francisco - 3837675
	
	Note: for more cities please download the list at:
	http://bulk.openweathermap.org/sample/city.list.json.gz 

# Services 
	Get weather information of location by id. 
	http://localhost:8080/weather/getWeatherInformation?cityId=<CITY_ID>
	
	Get last five unique responses of getWeatherInformation.
	http://localhost:8080/weatherLog/getAll