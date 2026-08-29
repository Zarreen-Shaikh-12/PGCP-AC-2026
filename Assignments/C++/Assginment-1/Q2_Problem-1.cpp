//============================================================================
// Name        : Q2_Problem-1.cpp
// Author      : Zarreen
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;


// V1: Call by Value - Original Bug
void resetSensorPairV1(int reading1, int reading2)
{
    int temp = reading1;
    reading1 = reading2;
    reading2 = temp;
}


// V2: Call by Reference - Fixed
void resetSensorPairV2(int& reading1, int& reading2)
{
    int temp = reading1;
    reading1 = reading2;
    reading2 = temp;
}


// V3: Call by Pointer - Fixed
void resetSensorPairV3(int* reading1, int* reading2)
{
    int temp = *reading1;
    *reading1 = *reading2;
    *reading2 = temp;
}


int main()
{
    int reading1 = 10;
    int reading2 = 20;


    // V1 - Call by Value

    cout << " --- V1 : Call by Value --- " << endl;

    cout << "Before : A="
         << reading1 << " B=" << reading2 << endl;

    resetSensorPairV1(reading1, reading2);

    cout << "After  : A="
         << reading1 << " B=" << reading2 << "    <- values unchanged" <<endl;


    /*
    V1 fails because the function receives copies
    of the original sensor readings.
    The function swaps only those local copies.
    The original variables in main() are not changed.
    Therefore, the values remain the same after the call.
    */


    // V2 - Call by Reference

    reading1 = 10;
    reading2 = 20;

    cout << endl;
    cout << " --- V2 : Call by Reference --- " << endl;

    cout << "Before : A="
         << reading1 << " B=" << reading2 << endl;

    resetSensorPairV2(reading1, reading2);

    cout << "After  : A="
         << reading1 << " B=" << reading2 << "    <- values swapped" <<endl;


    // V3 - Call by Pointer

    reading1 = 10;
    reading2 = 20;

    cout << endl;
    cout << " --- V3 : Call by Pointer --- " << endl;

    cout << "Before : A="
         << reading1 << " B=" << reading2 << "    <- values swapped back" << endl;

    resetSensorPairV3(&reading1, &reading2);

    cout << "After  : A="
         << reading1 << " B=" << reading2 << endl;


    return 0;
}

