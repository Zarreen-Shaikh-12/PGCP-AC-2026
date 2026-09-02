//============================================================================
// Name        : Q1_Part-A.cpp
// Author      : Zarreen
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
#include <iomanip>
#include <string>
using namespace std;

class Product
{
private:
    int productId;
    string name;
    double price;
    int quantity;

public:


    void acceptDetails()
    {
        cout << "Enter Product ID: ";
        cin >> productId;

        cout << "Enter Product Name: ";
        cin >> name;

        cout << "Enter Price: ";
        cin >> price;

        cout << "Enter Quantity: ";
        cin >> quantity;
    }

    void displayDetails() const
    {
        cout << left
             << setw(8) << productId
             << setw(15) << name
             << setw(12) << fixed << setprecision(2) << price
             << setw(8) << quantity
             << setw(15) << totalValue();

        if (isLowStock(10))
        {
            cout << " <- LOW STOCK";
        }

        cout << endl;
    }

    double totalValue() const
    {
        return price * quantity;
    }

    bool isLowStock(int threshold) const
    {
        return quantity < threshold;
    }

    string getName() const
    {
        return name;
    }
};


int main()
{
    Product products[5];

    // Accept details for all 5 products
    for (int i = 0; i < 5; i++)
    {
        cout << "\nEnter details for Product " << i + 1 << endl;
        products[i].acceptDetails();
    }

    // Low-stock products
        int threshold;

        cout << "\nEnter low-stock threshold: ";
        cin >> threshold;


    // Display inventory
    cout << "\n===== INVENTORY REPORT =====" << endl;

    cout << left
         << setw(8) << "ID"
         << setw(15) << "Name"
         << setw(12) << "Price"
         << setw(8) << "Qty"
         << setw(15) << "Total Value"
         << endl;

    for (int i = 0; i < 5; i++)
    {
        products[i].displayDetails();
    }


    // Find product with highest total value
    int highestIndex = 0;

    for (int i = 1; i < 5; i++)
    {
        if (products[i].totalValue() >
            products[highestIndex].totalValue())
        {
            highestIndex = i;
        }
    }

    cout << "\nHighest Value Product : "
         << products[highestIndex].getName()
         << " (Rs. "
         << fixed << setprecision(2)
         << products[highestIndex].totalValue()
         << ")" << endl;


//    // Low-stock products
//    int threshold;
//
//    cout << "\nEnter low-stock threshold: ";
//    cin >> threshold;

    cout << "Low Stock (threshold: "
         << threshold << ") : ";

    bool found = false;

    for (int i = 0; i < 5; i++)
    {
        if (products[i].isLowStock(threshold))
        {
            cout << products[i].getName() << ", ";
            found = true;
        }
    }

    if (!found)
    {
        cout << "None";
    }

    cout << endl;

    return 0;
}
