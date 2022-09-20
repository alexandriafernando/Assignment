package CollegeStudents;

 class hostellers implements interfac {
                int hostno, roomno, regno;
                String depart, name ;

     @Override
     public void dayscholar(String college, int studno, String name, String depart) {

     }

     public void Hosteller(int hostno, int roomno, int regno, String name, String depart){
            System.out.print("For Hostellers\n");
             System.out.println ("Name of the Student: "+name+"\nHostel Number: "+hostno+"\nDepartment: "+depart
             +"\nRoom Number: "+roomno+"\nRegistration Number: "+regno+"\n");
         }
}

