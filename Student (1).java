public class Student {
    Name name;
    String ic;
    String address;
    String schoolname;
    float marks[] = new float[5];
    String assigned_teacher;

    // METHODS (SETTERS)
    public void setName(Name name) {
        this.name = name;
    }

    public void setIC(String ic) {
        this.ic = ic;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setSchoolName(String schoolname) {
        this.schoolname = schoolname;
    }

    public void setMarks(int i, float score) {
        this.marks[i] = score;
    }

    public void setTeacher(float get_avg) {
        if (get_avg < 30) {
            this.assigned_teacher = "Mr Hassan";
        } else if (get_avg >= 30 && get_avg < 50) {
            this.assigned_teacher = "Mr Gopal";
        } else if (get_avg >= 50 && get_avg < 70) {
            this.assigned_teacher = "Mr Li";
        } else if (get_avg >= 70 && get_avg < 80) {
            this.assigned_teacher = "Ms Minah";
        } else {
            this.assigned_teacher = "Mr Raju";
        }
    }

    // METHODS (GETTERS)
    public String getName() {
        return name.toString();
    }

    public String getIC() {
        return ic;
    }

    public String getAddress() {
        return address;
    }

    public String getSchoolName() {
        return schoolname;
    }

    public float getMarks(int i) {
        return marks[i];
    }

    public float getAvg() {
        float sum = 0, avg = 0;
        for (int i = 0; i < 5; i++) {
            sum += marks[i];
        }
        avg = sum / 5;
        return avg;
    }

    public float getMin() {
        float min = 0;
        for (int i = 0; i < 5; i++) {
            if (marks[i] < min) {
                min = marks[i];
            }
        }
        return min;
    }

    public float getMax() {
        float max = 0;
        for (int i = 0; i < 5; i++) {
            if (marks[i] > max) {
                max = marks[i];
            }
        }
        return max;
    }
    public String getAssignedTeacher(){
        return assigned_teacher;
    }
}