//============================================================================
// Name        : Q3_Part-C.cpp
// Author      : Zarreen
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
#include <cstdlib>
#include <ctime>

using namespace std;

int main()
{
    int R, C;

    // Input rows and columns
    cout << "Enter number of rows: ";
    cin >> R;

    cout << "Enter number of columns: ";
    cin >> C;


    // Allocate 2D array dynamically
    int** map = new int*[R];

    for (int i = 0; i < R; i++)
    {
        map[i] = new int[C];
    }


    // Generate random tile values
    srand(time(0));

    for (int i = 0; i < R; i++)
    {
        for (int j = 0; j < C; j++)
        {
            map[i][j] = rand() % 5;
        }
    }


    // Display the game map
    cout << "\n===== GAME MAP (" << R << " x " << C << ") =====" << endl;

    for (int i = 0; i < R; i++)
    {
        for (int j = 0; j < C; j++)
        {
            cout << " " << map[i][j];
        }

        cout << endl;
    }


    // Display legend
    cout << "Legend: 0=Grass 1=Water 2=Mountain 3=Forest 4=Dungeon" << endl;


    // Count each tile type
    int grass = 0;
    int water = 0;
    int mountain = 0;
    int forest = 0;
    int dungeon = 0;

    for (int i = 0; i < R; i++)
    {
        for (int j = 0; j < C; j++)
        {
            switch (map[i][j])
            {
                case 0:
                    grass++;
                    break;

                case 1:
                    water++;
                    break;

                case 2:
                    mountain++;
                    break;

                case 3:
                    forest++;
                    break;

                case 4:
                    dungeon++;
                    break;
            }
        }
    }


    // Display tile counts
    cout << "Tile Count:" << endl;
    cout << " Grass : " << grass << endl;
    cout << " Water : " << water << endl;
    cout << " Mountain : " << mountain << endl;
    cout << " Forest : " << forest << endl;
    cout << " Dungeon : " << dungeon << endl;


    // Deallocate memory
    for (int i = 0; i < R; i++)
    {
        delete[] map[i];
    }

    delete[] map;


    return 0;
}
