//write a JAVA program to input basiJAVAsalary of an employee and calculate its Gross     salary according to following:
//BasiJAVASalary <= 10000 : HRA = 20%, DA = 80%
//BasiJAVASalary <= 20000 : HRA = 25%, DA = 90%
//BasiJAVASalary > 20000 : HRA = 30%, DA = 95%
  import java.util.*;
class salary
  {
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the basic salary of an employee");
      int basic = sc.nextInt();
      float HRA, DA, gross_salary;
      if(basic<=10000)
      {
        HRA = (20*basic)/100;
        DA = (80*basic)/100;
      }
      else if(basic<=20000)
      {
        HRA = (25*basic)/100;
        DA = (90*basic)/100;
      }
      else
      {
        HRA = (30*basic)/100;
        DA = (95*basic)/100;
      }
      gross_salary = HRA+DA+basic;
      System.out.println("Gross salary of an employee is: "+gross_salary);
    }
  }