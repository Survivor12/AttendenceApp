
package attendanceapp;

public class AttendanceAppFirstPeriod {    
    String[] StudentList = {"Student1","Student2","Student3","Student4","Student5","Student6","Student7","Student8","Student9","Student10","Student11","Student12",};
    int[] Absences = {1,0,23,6,12,45,223,67,2,345,0,0,0,0,0,0,0  };
        
    public static void main(String args[]){
        AttendanceAppFirstPeriod bob = new AttendanceAppFirstPeriod();
        System.out.println(bob.Absences[5]);
    }
}
