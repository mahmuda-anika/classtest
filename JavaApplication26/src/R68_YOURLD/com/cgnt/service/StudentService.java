/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package R68_YOURLD.com.cgnt.service;

import R68_YOURLD.com.cgnt.dao.StudentDAO;
import R68_YOURLD.com.cgnt.ui.Student;


public class StudentService {
    public Student create1(Student s){
        StudentDAO  s5 = new StudentDAO();
        
        return s5.insert(s);
        
    }    
}
