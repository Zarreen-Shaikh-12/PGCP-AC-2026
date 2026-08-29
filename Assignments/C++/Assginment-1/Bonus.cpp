//============================================================================
// Name        : Bonus.cpp
// Author      : Zarreen
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

struct Layout1
{
    char c1;
    int i;
    char c2;
};

struct Layout2
{
    int i;
    char c1;
    char c2;
};

int main()
{
    cout << "Size of Layout1 : " << sizeof(Layout1) << " bytes" << endl;
    cout << "Size of Layout2 : " << sizeof(Layout2) << " bytes" << endl;

    /*
        Struct padding:

        Padding is extra unused memory added by the compiler
        between or after structure members.

        The compiler adds padding so that members are properly
        aligned in memory according to their data type.

        Layout1 has:
        char c1 -> 1 byte
        padding
        int i  -> 4 bytes
        char c2 -> 1 byte
        padding

        Therefore, Layout1 may require more memory.

        Layout2 has:
        int i  -> 4 bytes
        char c1 -> 1 byte
        char c2 -> 1 byte
        padding

        The order of members affects the amount of padding,
        so changing the order can change the size of the structure.

        Member order matters when defining network packet headers
        or hardware register maps because the exact memory layout
        and position of each member can be important.
    */

    return 0;
}
