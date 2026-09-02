//============================================================================
// Name        : Q3_Part-A.cpp
// Author      : Zarreen
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
#include <string>
using namespace std;


class Entity
{
private:
    string name;
    int health;
    int level;
    string type;


public:

    // Setter for name
    Entity& setName(const string& name)
    {
        this->name = name;
        return *this;
    }


    // Setter for health
    Entity& setHealth(int health)
    {
        this->health = health;
        return *this;
    }


    // Setter for level
    Entity& setLevel(int level)
    {
        this->level = level;
        return *this;
    }


    // Setter for type
    Entity& setType(const string& type)
    {
        this->type = type;
        return *this;
    }


    // Getter for name
    string getName() const
    {
        return name;
    }


    // Getter for health
    int getHealth() const
    {
        return health;
    }


    // Getter for level
    int getLevel() const
    {
        return level;
    }


    // Getter for type
    string getType() const
    {
        return type;
    }


    // Display entity information
    void displayInfo() const
    {
        cout << "Name   : " << name << endl;
        cout << "Health : " << health << endl;
        cout << "Level  : " << level << endl;
        cout << "Type   : " << type << endl;
    }
};


int main()
{
    Entity player, enemy, item;


    // Method chaining
    player.setName("Aragorn")
          .setHealth(100)
          .setLevel(10)
          .setType("Player");


    enemy.setName("Orc")
          .setHealth(60)
          .setLevel(5)
          .setType("Enemy");


    item.setName("HealthPotion")
        .setHealth(0)
        .setLevel(1)
        .setType("Item");


    // Display information
    cout << "\nPlayer:" << endl;
    player.displayInfo();


    cout << "\nEnemy:" << endl;
    enemy.displayInfo();


    cout << "\nItem:" << endl;
    item.displayInfo();


    return 0;
}
