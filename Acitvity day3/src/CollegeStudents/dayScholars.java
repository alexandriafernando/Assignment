package CollegeStudents;

class dayScholars implements interfac {
    int studno;
    String depart, name, college ;


    public void dayscholar(String college, int studno, String name, String depart){
        System.out.print("For Day Scholars\n");
        System.out.println ("Name of the Student: "+name+"\nStudent Number: "+studno+"\nDepartment: "+depart
                +"\nCollege: "+college +"\n");
    }

    @Override
    public void Hosteller(int hostno, int roomno, int regno, String name, String depart) {

    }

}
