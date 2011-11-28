package uit.tkorg.cspublicationtool.entities;
// Generated Nov 28, 2011 11:53:12 PM by Hibernate Tools 3.2.1.GA



/**
 * RankPaperSubdomain generated by hbm2java
 */
public class RankPaperSubdomain  implements java.io.Serializable {


     private RankPaperSubdomainId id;
     private Integer citationCount;
     private int rank;

    public RankPaperSubdomain() {
    }

	
    public RankPaperSubdomain(RankPaperSubdomainId id, int rank) {
        this.id = id;
        this.rank = rank;
    }
    public RankPaperSubdomain(RankPaperSubdomainId id, Integer citationCount, int rank) {
       this.id = id;
       this.citationCount = citationCount;
       this.rank = rank;
    }
   
    public RankPaperSubdomainId getId() {
        return this.id;
    }
    
    public void setId(RankPaperSubdomainId id) {
        this.id = id;
    }
    public Integer getCitationCount() {
        return this.citationCount;
    }
    
    public void setCitationCount(Integer citationCount) {
        this.citationCount = citationCount;
    }
    public int getRank() {
        return this.rank;
    }
    
    public void setRank(int rank) {
        this.rank = rank;
    }




}

