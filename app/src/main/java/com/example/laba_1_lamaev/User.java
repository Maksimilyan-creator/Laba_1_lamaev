package com.example.laba_1_lamaev;
import com.google.gson.Gson;

public class User
{
    private String firstName;
    private String lastName;
    private int age;
    private float salary;

    public User(String firstName, String lastName, int age, float salary)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    // Геттеры

    public String getFirstName() {return firstName;}
    public String getLastName() {return lastName;}
    public int getAge() {return age;}
    public float getSalary() {return  salary;}

    // Сеттеры

    public void setFirstName (String firstName)
    {
        this.firstName = firstName;
    }

    public void setLastName (String lastName)
    {
        this.lastName = lastName;
    }

    public  void setAge (int age)
    {
        this.age = age;
    }

    public void setSalary (float salary)
    {
        this.salary = salary;
    }



    //Преобразование объекта в JSON строку
    public String toJsonString()
    {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}
