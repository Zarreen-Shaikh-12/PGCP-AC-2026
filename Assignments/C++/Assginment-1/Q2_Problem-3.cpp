//============================================================================
// Name        : Q2_Problem-3.cpp
// Author      : Zarreen
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

int main()
{
    int statusReg = 0b10110001;
    int controlReg = 0b00000000;
    int dataReg = 0b11001010;


    // 1. Pointer to const int
    const int* regPtr1 = &statusReg;

    cout << "Status Register : " << *regPtr1 << endl;

    // *regPtr1 = 10;
    // ERROR: Cannot modify the value through a pointer-to-const.

    regPtr1 = &dataReg;
    // This is allowed because the pointer itself is not const.


    // 2. Const pointer to int
    int* const regPtr2 = &controlReg;

    *regPtr2 = 0b11110000;

    cout << "Control Register : " << *regPtr2 << endl;

    // regPtr2 = &dataReg;
    // ERROR: Cannot change where a const pointer points.


    // 3. Const pointer to const int
    const int* const regPtr3 = &statusReg;

    cout << "ROM Config : " << *regPtr3 << endl;

    // *regPtr3 = 10;
    // ERROR: Cannot modify the value.

    // regPtr3 = &dataReg;
    // ERROR: Cannot change where the const pointer points.


    return 0;
}
