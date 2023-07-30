package employeeApp.model;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Employee {
    private int id;
    private String fullName;
    private String email;
    private String password;
    private String[] healthplans;

    public Employee(int id, String fullName, String email, String password, String[] healthplans) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.healthplans = healthplans;
    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String[] getHealthplans() {
        return healthplans;
    }

    public void addHealthplan(int index, String name){
        boolean isExist = false;
        for (String healthplan: healthplans){
            if (healthplan.equals(name)){
                isExist = true;
                break;
            }
        }
        if (!isExist){
            try{
                if (healthplans[index]==null){
                    healthplans[index] = name;
                }else {
                    System.out.println("zaten atama yapıldı");
                }
            }catch (ArrayIndexOutOfBoundsException ex){
                System.out.println("bu indexe atama yapılamaz"+ index);
            }
        }else {
            System.out.println(name+" daha önceden eklenmiş");
        }


    }

    public String toString(){
        return "Employee= "+" Fullname: "+fullName+" Healthplans: "+ Arrays.toString(healthplans);
    }
}
