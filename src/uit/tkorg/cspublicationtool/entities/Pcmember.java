package uit.tkorg.cspublicationtool.entities;
// Generated Dec 4, 2011 5:00:43 PM by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * Pcmember generated by hbm2java
 */
public class Pcmember  implements java.io.Serializable {


     private Integer idPcmember;
     private String pcMemberName;
     private String image;
     private String emailAddress;
     private String website;
     private String organization;
     private Set conferencePcmembers = new HashSet(0);

    public Pcmember() {
    }

    public Pcmember(String pcMemberName, String image, String emailAddress, String website, String organization, Set conferencePcmembers) {
       this.pcMemberName = pcMemberName;
       this.image = image;
       this.emailAddress = emailAddress;
       this.website = website;
       this.organization = organization;
       this.conferencePcmembers = conferencePcmembers;
    }
   
    public Integer getIdPcmember() {
        return this.idPcmember;
    }
    
    public void setIdPcmember(Integer idPcmember) {
        this.idPcmember = idPcmember;
    }
    public String getPcMemberName() {
        return this.pcMemberName;
    }
    
    public void setPcMemberName(String pcMemberName) {
        this.pcMemberName = pcMemberName;
    }
    public String getImage() {
        return this.image;
    }
    
    public void setImage(String image) {
        this.image = image;
    }
    public String getEmailAddress() {
        return this.emailAddress;
    }
    
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
    public String getWebsite() {
        return this.website;
    }
    
    public void setWebsite(String website) {
        this.website = website;
    }
    public String getOrganization() {
        return this.organization;
    }
    
    public void setOrganization(String organization) {
        this.organization = organization;
    }
    public Set getConferencePcmembers() {
        return this.conferencePcmembers;
    }
    
    public void setConferencePcmembers(Set conferencePcmembers) {
        this.conferencePcmembers = conferencePcmembers;
    }




}


