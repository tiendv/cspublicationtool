package uit.tkorg.cspublicationtool.entities;
// Generated Nov 30, 2011 8:42:51 AM by Hibernate Tools 3.2.1.GA



/**
 * ConferencePcmember generated by hbm2java
 */
public class ConferencePcmember  implements java.io.Serializable {


     private ConferencePcmemberId id;
     private Pcmember pcmember;
     private Conference conference;
     private Integer year;

    public ConferencePcmember() {
    }

	
    public ConferencePcmember(ConferencePcmemberId id, Pcmember pcmember, Conference conference) {
        this.id = id;
        this.pcmember = pcmember;
        this.conference = conference;
    }
    public ConferencePcmember(ConferencePcmemberId id, Pcmember pcmember, Conference conference, Integer year) {
       this.id = id;
       this.pcmember = pcmember;
       this.conference = conference;
       this.year = year;
    }
   
    public ConferencePcmemberId getId() {
        return this.id;
    }
    
    public void setId(ConferencePcmemberId id) {
        this.id = id;
    }
    public Pcmember getPcmember() {
        return this.pcmember;
    }
    
    public void setPcmember(Pcmember pcmember) {
        this.pcmember = pcmember;
    }
    public Conference getConference() {
        return this.conference;
    }
    
    public void setConference(Conference conference) {
        this.conference = conference;
    }
    public Integer getYear() {
        return this.year;
    }
    
    public void setYear(Integer year) {
        this.year = year;
    }




}


