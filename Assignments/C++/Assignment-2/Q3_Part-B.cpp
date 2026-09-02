//============================================================================
// Name        : Q3_Part-B.cpp
// Author      : Zarreen
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;


// Physics namespace
namespace Physics
{
    double clamp(double val, double min, double max)
    {
        if (val < min)
            return min;

        if (val > max)
            return max;

        return val;
    }

    double lerp(double a, double b, double t)
    {
        return a + (b - a) * t;
    }
}


// GameMath namespace
namespace GameMath
{
    int clamp(int val, int min, int max)
    {
        if (val < min)
            return min;

        if (val > max)
            return max;

        return val;
    }

    double lerp(double a, double b, double t)
    {
        return a + (b - a) * t;
    }
}


int main()
{
    // Physics clamp
    double velocity = Physics::clamp(120.5, 0.0, 100.0);

    cout << "Physics Clamp : " << velocity << endl;


    // GameMath clamp
    int health = GameMath::clamp(120, 0, 100);

    cout << "GameMath Clamp : " << health << endl;


    // Physics lerp
    double physicsValue = Physics::lerp(10.0, 20.0, 0.5);

    cout << "Physics Lerp : " << physicsValue << endl;


    // GameMath lerp
    double uiValue = GameMath::lerp(0.0, 100.0, 0.25);

    cout << "GameMath Lerp : " << uiValue << endl;


    // Limited namespace scope
    {
        using namespace Physics;

        cout << "Limited Scope Clamp : "
             << clamp(150.0, 0.0, 100.0)
             << endl;
    }


    return 0;
}
