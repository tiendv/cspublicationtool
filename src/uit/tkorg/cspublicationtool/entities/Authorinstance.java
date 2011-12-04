package uit.tkorg.cspublicationtool.entities;
// Generated Dec 4, 2011 10:51:22 AM by Hibernate Tools 3.2.1.GA



/**
 * Authorinstance generated by hbm2java
 */
public class Authorinstance  implements java.io.Serializable {


     private Integer autoId;
     private Author author;
     private String instanceName;

    public Authorinstance() {
    }

	
    public Authorinstance(Author author) {
        this.author = author;
    }
    public Authorinstance(Author author, String instanceName) {
       this.author = author;
       this.instanceName = instanceName;
    }
   
    public Integer getAutoId() {
        return this.autoId;
    }
    
    public void setAutoId(Integer autoId) {
        this.autoId = autoId;
    }
    public Author getAuthor() {
        return this.author;
    }
    
    public void setAuthor(Author author) {
        this.author = author;
    }
    public String getInstanceName() {
        return this.instanceName;
    }
    
    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }




}


