//============================================================================
// Name        : Question-2.cpp
// Author      : Zarreen
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
#include <string>
using namespace std;


class Patient
{
private:
    int patientId;
    string name;
    int age;
    string ward;
    const string bloodGroup;


public:

    // Default constructor
    Patient()
        : patientId(0),
          name("Unknown"),
          age(0),
          ward("General"),
          bloodGroup("O+")
    {
        cout << "[Constructor] Default patient registered." << endl;
    }


    // Emergency constructor
    Patient(int id, const string& name)
        : patientId(id),
          name(name),
          age(0),
          ward("Emergency"),
          bloodGroup("O+")
    {
        cout << "[Constructor] Emergency: " << name << endl;
    }


    // Full admission constructor
    Patient(int id, const string& name, int age,
            const string& ward, const string& bg)
        : patientId(id),
          name(name),
          age(age),
          ward(ward),
          bloodGroup(bg)
    {
        cout << "[Constructor] Full admission: "
             << name << endl;
    }


    // Destructor
    ~Patient()
    {
        cout << "[Destructor] Patient "
             << name
             << " discharged."
             << endl;
    }


    // Display patient record
    void displayRecord() const
    {
        cout << "\nPatient Record:" << endl;
        cout << "ID        : " << patientId << endl;
        cout << "Name      : " << name << endl;
        cout << "Age       : " << age << endl;
        cout << "Ward      : " << ward << endl;
        cout << "Blood Grp : " << bloodGroup << endl;
    }


    // Transfer patient to another ward
    void transferWard(const string& newWard)
    {
        cout << "Ward Transfer: "
             << name
             << " -> "
             << newWard
             << endl;

        ward = newWard;
    }
};


int main()
{
    // Three stack objects
    Patient p1(1001, "Meera Joshi", 34, "Cardiology", "B+");
    Patient p2(1002, "Raj Patel");
    Patient p3;


    // Dynamic array of 4 Patient objects
    Patient* patients = new Patient[4];


    // Display all 4 patients
    for (int i = 0; i < 4; i++)
    {
        patients[i].displayRecord();
    }


    // Transfer one patient's ward
    p2.transferWard(string("ICU"));


    // Delete dynamic array
    delete[] patients;


    return 0;
}
