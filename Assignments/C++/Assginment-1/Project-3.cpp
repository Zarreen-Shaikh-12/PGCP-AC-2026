//============================================================================
// Name        : Project-3.cpp
// Author      : Zarreen
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

int main() {
	double temperature[3][3];

	cout << "Enter temperature for 3 floors and 3 rooms: " << endl;

	for(int i = 0; i < 3; i++){
		for(int j = 0; j < 3; j++){
			cout << "Floor" << i + 1
				 << ", Room " << j + 1 << ": ";
			cin >> temperature[i][j];
		}
	}
	cout << endl;
	cout << "        Room1 Room2 Room3" << endl;

	for(int i = 0; i < 3; i++){
		cout << "Floor " << i + 1 << " : ";
		for(int j = 0; j < 3; j++){
			cout << temperature[i][j] << " ";
		}
		cout << endl;
	}

	double hottest = temperature[0][0];
	int hottestFloor = 0;
	int hottestRoom = 0;

	for(int i = 0; i < 3; i++){
		for(int j = 0; j < 3; j++){
			if(temperature[i][j] > hottest){
				hottest = temperature[i][j];
				hottestFloor = i;
				hottestRoom = j;
			}
		}
	}

	cout << "Hottest Room : Floor "
		 << hottestFloor + 1
		 << ", Room" << hottestRoom + 1
		 << " -> " << hottest << " C" << endl;

	double highestAverage = 0;
	int hottestFloorNumber = 0;

	for(int i = 0; i < 3; i++){
		double floorSum = 0;

		for(int j = 0; j < 3; j++){
			floorSum += temperature[i][j];
		}
		double floorAverage = floorSum / 3;
		if(floorAverage > highestAverage){
			highestAverage = floorAverage;
			hottestFloorNumber = i;
		}
	}

	cout << "Hottest Floor : Floor "
	         << hottestFloorNumber + 1
	         << " (avg " << highestAverage << " C)" << endl;

	    // Count rooms at WARNING level or above
	    int warningOrAbove = 0;

	    for (int i = 0; i < 3; i++)
	    {
	        for (int j = 0; j < 3; j++)
	        {
	            if (temperature[i][j] >= 30)
	            {
	                warningOrAbove++;
	            }
	        }
	    }

	    cout << "Rooms at WARNING or above : "
	         << warningOrAbove << endl;

	    return 0;
}



