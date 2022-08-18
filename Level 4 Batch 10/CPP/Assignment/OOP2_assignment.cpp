#include<iostream>
#include<string>
using namespace std;

class Student
{
    private:
        int r_no;
        string name, coures;
        
    public:
        void setR_no(int no)
        {
            if (no > 0)
                this -> r_no = no;
            else
                //this -> r_no = 0;
                cout << "\nIncorrect roll number";
        }

        int getR_no()
        {
            return r_no;
        }

        void setName (string name)
        {
            this -> name = name;
        }

        string getName ()
        {
            return name;
        }

        void setCourse (string course)
        {
            this -> coures = course;
        }

        string getCourse ()
        {
            return coures;
        }

        bool searchData (int no)
        {
            if (r_no == no)
                return true;
            else
                return false;
        }
};

int main()
{
    int no, s_no, to = 0, ho = 0;
    string name, course, result;
    

    Student s[5];

    for (int i = 0; i < 5; i++)
    {
        cout << "\n------- For Student " << (i+1) << " Data -----------\n";

        cout << "Enter roll number : ";
        cin >> no;

        s[i].setR_no(no);  
          

        cin.ignore();
        cout << "Enter student name : ";
        getline(cin,name);

        s[i].setName(name);
        

        cout << "Enter student course : ";
        cin >> course;

        s[i].setCourse(course);
                                       
    }

    cout << "\n\n----------- All Student Data ---------------\n";
    cout << "No \tStudent Name \tCourse\n";
    cout << "--------------------------------------------";

    for (int i = 0; i < 5; i++)
    {
        cout << endl;

        cout << s[i].getR_no();
        cout << "\t";

        cout << s[i].getName();
        cout << "\t";

        cout << s[i].getCourse();
        cout << endl;        
    }
    
    cout << "\n\nEnter roll number for searching : ";
    cin >> s_no;

    cout << endl;
    
    for (int i = 0; i < 5; i++)
    {
        if (ho > 0)
            break;

        if (s[i].searchData(s_no) == true)
        {
            ho++;

            for (int i = 0; i < 5; i++)
            {
                if (s[i].searchData(s_no) == true)
                {
                    ho++;

                    for (int j = i; j <= i ; j++)
                    {
                        cout << "Name : " << s[j].getName() << endl;
                    }
                    for (int u = i; u <= i; u++)
                    {
                        cout << "Course : " << s[u].getCourse() << endl;
                    }
                }                           
            }
        }
        else
            to++;
    }
       
    

    if (to >= 5) 
        cout << s_no << " does not exist."; 
    
    return 0;    
}