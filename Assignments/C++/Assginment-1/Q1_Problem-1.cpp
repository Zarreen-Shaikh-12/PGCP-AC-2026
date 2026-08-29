//============================================================================
// Name        : Problem-1.cpp
// Author      : Zarreen
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
//#include <iomanip>
using namespace std;

int main() {
	double temperature;
	int statusCode;
	double fahrenheit;

	cout << "Enter temperature: ";
	cin >> temperature;

	if(temperature < 0){
		statusCode = -1 ;
	} else if(temperature <= 29){
		statusCode = 0 ;
	} else if(temperature <= 44){
		statusCode = 1 ;
	} else if(temperature <= 59){
		statusCode = 2;
	} else{
		statusCode = 3 ;
	}

	fahrenheit = (temperature * 9 / 5) + 32;

	cout << "Temperature : " << temperature << "°C / " ;
	cout << fahrenheit << "°F" << endl;

	switch(statusCode){
	case -1:
		cout << "Status : SENSOR_ERROR" << endl ;
	    cout << "Action : Sensor fault - check wiring" << endl;
	    break;
	case 0:
		cout << "Status : NORMAL" << endl ;
	    cout << "Action : No action required" << endl;
	    break;
	case 1:
		cout << "Status : WARNING" << endl ;
	    cout << "Action : Alert sent to supervisor" << endl;
	    break;
	case 2:
		cout << "Status : CRITICAL" << endl ;
	    cout << "Action : Cooling system triggered" << endl;
	    break;
	case 3:
		cout << "Status : SHUTDOWN" << endl ;
	    cout << "Action : Emergency shutdown initiated" << endl;
	    break;
	}
	cout << "Reading : "
		 << (temperature >= 25 ? "Above Average" : "Below Average")
		 << endl;
	return 0;
}

