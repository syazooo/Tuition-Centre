
public class StudentBatch {
    Student students[] = new Student[100];
    int currsz_s = 0;

    // METHODS
    public void add(Student s) {
        students[currsz_s++] = s;
    }
    public boolean find(String name) {
        for (int i = 0; i<currsz_s; i++) {
            if (students[i].name.toString() == name) {
                return true;
            }
        }
        return false;
    }
    public int getNumOfStudents(){
        return (currsz_s+1);
    }
    public float getAvg(){
        float total=0;
        for (int i=0; i<currsz_s; i++){
            for (int j=0; j<5; j++){
                total += students[i].marks[j];
            }
        }
        return (total/(currsz_s+1));
    }
    public float getMin(){
        float min=0;
        for (int i=0; i<currsz_s; i++){
            for (int j=0; j<5; j++){
                if (students[i].marks[j]<min){
                    min = students[i].marks[j];
                }
            }
        }
        return min;
    }
    public float getMax(){
        float max=0;
        for (int i=0; i<currsz_s; i++){
            for (int j=0; j<5; j++){
                if (students[i].marks[j]>max){
                    max = students[i].marks[j];
                }
            }
        }
        return max;
    }
}