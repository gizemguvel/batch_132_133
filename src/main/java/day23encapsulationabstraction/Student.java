package day23encapsulationabstraction;

public class Student {

    /*
      1)When we type code, we may need to hide some data for some reasons.
        "Encapsulation" means "hiding data"
      2)After encapsulating a data, if you need you may read the value
        by using "get" method(getter)
      3)In getters;
          i)"Access modifier" is public
          ii)"Return type" must be the same with the data type of the variable
          iii)"Method name" should have <get + variable name> structure
              Note:if the data type of the variable is boolean make the method name structure <is + variable name>
          iv)"Method body" will have "return" keyword with the "variable name"
      4)After encapsulating a data, if you need you may update the value
        by using "set" method(setter)
      5)In setters;
         i)"Access modifier" is public
         ii)"Return type" must be void
         iii)"Method name" should have <set + variable name> structure
         iv)setters use "parameters", the parameter will be the same with the variable
      6)If you want to create a "hidden", "updatable" but "not readable" variable: i)make access modifier "private"
                                                                                   ii)create set method for the variable
                                                                                   iii)do not create get method for the variable

     */

    public String stdName;
    int stdGpa;
    private String psychologicalIssues="Depression";
    private boolean success= true;



    public String getPsychologicalIssues() {
        return psychologicalIssues;
    }
    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success){
        this.success = success;
    }

    public void setPsychologicalIssues(String psychologicalIssues) {
        this.psychologicalIssues = psychologicalIssues;
    }
}


