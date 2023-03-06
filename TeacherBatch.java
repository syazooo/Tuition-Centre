public class TeacherBatch {
    Teacher teacher[] = new Teacher[5];
    int currsz_t = 0;

    // METHODS
    public void add(Teacher t) {
        teacher[currsz_t++] = t;
    }
    public boolean find(String name) {
        for (int i = 0; i<currsz_t; i++) {
            if (teacher[i].name.toString() == name) {
                return true;
            }
        }
        return false;
    }
    public int getNumOfTeachers(){
        return (currsz_t+1);
    }
}