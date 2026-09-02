//============================================================================
// Name        : Q1_Part-B.cpp
// Author      : Zarreen
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
#include <iomanip>
using namespace std;


// 1. Integer quantity
double reorderCost(int qty, double unitPrice)
{
    return qty * unitPrice;
}


// 2. Fractional quantity
double reorderCost(double qty, double unitPrice)
{
    return qty * unitPrice;
}


// 3. Integer quantity with tax
double reorderCost(int qty, double unitPrice, double taxRate)
{
    double cost = qty * unitPrice;

    return cost + (cost * taxRate / 100);
}


// Function with default argument
double applyDiscount(double price, double discountPercent = 10.0)
{
    return price - (price * discountPercent / 100);
}


int main()
{
    cout << fixed << setprecision(2);


    // Calling integer quantity version
    cout << "Reorder Cost (int quantity): "
         << reorderCost(10, 250.00)
         << endl;


    // Calling fractional quantity version
    cout << "Reorder Cost (fractional quantity): "
         << reorderCost(5.5, 100.00)
         << endl;


    // Calling version with tax
    cout << "Reorder Cost (with tax): "
         << reorderCost(10, 250.00, 18.0)
         << endl;


    // Calling with default discount of 10%
    cout << "Discounted Price (default 10%): "
         << applyDiscount(1000.00)
         << endl;


    // Calling with our own discount
    cout << "Discounted Price (20%): "
         << applyDiscount(1000.00, 20.0)
         << endl;


    return 0;
}
