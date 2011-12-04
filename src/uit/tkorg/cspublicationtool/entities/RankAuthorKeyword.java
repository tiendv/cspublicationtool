package uit.tkorg.cspublicationtool.entities;
// Generated Dec 4, 2011 10:51:22 AM by Hibernate Tools 3.2.1.GA



/**
 * RankAuthorKeyword generated by hbm2java
 */
public class RankAuthorKeyword  implements java.io.Serializable {


     private RankAuthorKeywordId id;
     private Integer publicationCount;
     private Integer citationCount;
     private int rank;
     private Integer coAuthorCount;

    public RankAuthorKeyword() {
    }

	
    public RankAuthorKeyword(RankAuthorKeywordId id, int rank) {
        this.id = id;
        this.rank = rank;
    }
    public RankAuthorKeyword(RankAuthorKeywordId id, Integer publicationCount, Integer citationCount, int rank, Integer coAuthorCount) {
       this.id = id;
       this.publicationCount = publicationCount;
       this.citationCount = citationCount;
       this.rank = rank;
       this.coAuthorCount = coAuthorCount;
    }
   
    public RankAuthorKeywordId getId() {
        return this.id;
    }
    
    public void setId(RankAuthorKeywordId id) {
        this.id = id;
    }
    public Integer getPublicationCount() {
        return this.publicationCount;
    }
    
    public void setPublicationCount(Integer publicationCount) {
        this.publicationCount = publicationCount;
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
    public Integer getCoAuthorCount() {
        return this.coAuthorCount;
    }
    
    public void setCoAuthorCount(Integer coAuthorCount) {
        this.coAuthorCount = coAuthorCount;
    }




}


