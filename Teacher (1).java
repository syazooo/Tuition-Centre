public class Teacher{
    Name name;
    String ic;
    String address;
    int numyearexp;
    String qualification;

    // METHODS (SETTERS)
    public void setName(Name name){
        this.name = name;
    }
    public void setIC(String ic){
        this.ic = ic;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public void setNumYearExp(int numyearexp){
        this.numyearexp = numyearexp;
    }
    public void setQualification(String qualification){
        this.qualification = qualification;
    }

    // METHODS (GETTERS)
    public String getName(){
        return name.toString();
    }
    public String getIC(){
        return ic;
    }
    public String getAddress(){
        return address;
    }
    public int getNumYearExp(){
        return numyearexp;
    }
    public String getQualification(){
        return qualification;
    }
}