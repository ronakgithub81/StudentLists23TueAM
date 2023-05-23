
package studentlists23tueam;


public class Student {
    private String sname;
    private String sID;
//this has been edited on github.com to show fetch+merge
    //some comment at 9:42
    public Student(String sID,String sname ) {
        this.sname = sname;
        this.sID = sID;
    }

    
    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getsID() {
        return sID;
    }

    public void setsID(String sID) {
        this.sID = sID;
    }
    
    
    
}
