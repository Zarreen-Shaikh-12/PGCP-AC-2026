//============================================================================
// Name        : Problem-2.cpp
// Author      : Zarreen
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

int main(){
	int n;
	double readings[100];

	int skipped = 0;
	int normal = 0;
	int warning = 0;
	int critical = 0;
	int shutdown = 0;

	double minTemp;
	double maxTemp;
	double sum = 0;

	cout << "Enter number of readings: ";
	cin >> n;

	if(n < 1 || n > 100){
		cout << "Invalid number of readings." << endl;
		return 1;
	}

	for (int i = 0; i < n; i++){
		cout << "Enter reading " << i << ": ";
		cin >> readings[i];
	}

	cout << endl;

	cout << "Readings entered : " << n << endl;;
//	cout << endl;
	cout << "Valid readings : ";

	bool firstValid = true;
	for(int i = 0; i < n; i++){
		if(readings[i] < 0){
			skipped++;
			continue;
		}
		cout << readings[i] << " ";

		if (firstValid){
			minTemp = readings[i];
			maxTemp = readings[i];
			firstValid = false;
		}
		else{
			if(readings[i] < minTemp){
				minTemp = readings[i];
			}
			if(readings[i] > maxTemp){
				maxTemp = readings[i];
			}
		}
		sum = sum + readings[i];

		if(readings[i] <= 29){
			normal++;
		} else if(readings[i] <= 44){
			warning++;
		} else if(readings[i] <= 59){
			critical++;
		} else{
			shutdown++;
		}
	}

	cout << endl;
	cout << "Skipped (errors) : " << skipped << endl;

	bool foundCritical = false;
	for(int i = 0; i < n; i++){
		if(readings[i] < 0){
			continue;
		}
		if(readings[i] >= 45){
			cout << "First CRITICAL : Index " << i << " -> " << readings[i] << " C" << endl;
			foundCritical = true;
			break;
		}
	}
	if(!foundCritical){
		cout << "First CRITICAL : None" << endl;
	}

	int validCount = n - skipped;

	if(validCount > 0){
		double average = sum / validCount;
		cout << "Min :  " << minTemp
			 << " C  Max : " << maxTemp
			 << " C  Avg : " << average << " C" << endl;
	}

	cout << "Normal: " << normal
		 << "  Warning: " << warning
		 << "  Critical: " << critical
		 << "  Shutdown: " << shutdown << endl;
	return 0;
}
