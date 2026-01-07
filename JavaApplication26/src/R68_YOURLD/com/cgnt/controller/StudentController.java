
package R68_YOURLD.com.cgnt.controller;

import R68_YOURLD.com.cgnt.service.StudentService;
import R68_YOURLD.com.cgnt.ui.Student;


public class StudentController {
    public Student create(Student s){
        
        StudentService s3 = new StudentService();
            return s3.create1(s);
        
    }
}
