//============================================================================
// Name        : Bonus.cpp
// Author      : Zarreen
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>

using namespace std;


// Global variable
int level = 1;


// Nested namespace
namespace Engine
{
    namespace Audio
    {
        void playSound(string name)
        {
            cout << "Playing: " << name << endl;
        }
    }
}


int main()
{
    // Local variable
    int level = 10;

    cout << "Local level : " << level << endl;

    cout << "Global level : " << ::level << endl;


    // Calling function from nested namespace
    Engine::Audio::playSound("sword_clash");


    return 0;
}
