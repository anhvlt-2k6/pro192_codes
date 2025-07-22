package DomainManagement;

import java.util.Comparator;
import java.util.regex.Pattern;

public class DomainName implements Comparator {
    /**
     * id - get only (assigned by ICANN)
     * domainType - get only
     * domainLevel - get only
     * domain - get only
     * expirationDate - get/set
     * whoisInformation - get/set
     */
    protected int id;
    protected String domainType;
    protected int domainLevel;
    protected String domain;
    protected int expirationDate;
    protected String whoisInformation;
    protected boolean isReadyRegister;
    
    protected String[] validDNType = {
      "gTLD", "ccTLD", "sTLD", "grTLD"  
    };
    
    public DomainName() {
        this.id = 0;
        this.domainType = "gTLD";
        this.domain = "icann.arpa";
        this.domainLevel = 1;
        this.expirationDate = Integer.MAX_VALUE;
        this.whoisInformation = "This domain is reserved for testing.";
        this.isReadyRegister = false;
    }
    
    public DomainName(int id, String domainType, String domain, int expirationDate, String whoisInformation) {
        this.id = id;
        
        this.domainType = "#Invalid domain type. Please chage when needed.#".toUpperCase();
        for (String dn : validDNType) {
            if (dn.equals(domainType)) {
                this.domainType = domainType;
                break;
            }
        }
        
        this.domain = domain;
        
        String[] domainTree = domain.split(Pattern.quote("."));
        this.domainLevel = (domainTree.length > 1) ? domainTree.length - 1 : 1;
        
        this.expirationDate = expirationDate;
        this.whoisInformation = whoisInformation;
        
        this.isReadyRegister = !(this.expirationDate > 0);
    }

    public int getId() {
        return id;
    }

    public String getDomainType() {
        return domainType;
    }

    public int getDomainLevel() {
        return domainLevel;
    }

    public String getDomain() {
        return domain;
    }

    public int getExpirationDate() {
        return expirationDate;
    }

    public String getWhoisInformation() {
        return whoisInformation;
    }

    public String[] getValidDNType() {
        return validDNType;
    }

    public void setExpirationDate(int expirationDate) {
        this.expirationDate = expirationDate;
    }

    public void setWhoisInformation(String whoisInformation) {
        this.whoisInformation = whoisInformation;
    }

    public String getDomainInformation() {
        return String.format("Domain %s:\n"
                           + "\tDomain Type: %s\n"
                           + "\tDomain Level: %d\n"
                           + "\tExpire in: %d days\n"
                           + "\tWhois: %s",
                           this.getDomain(),
                           this.getDomainType(),
                           this.getDomainLevel(),
                           this.getExpirationDate(),
                           this.getWhoisInformation());
    }
    
    /*
    * Compare 
    */
    @Override
    public int compare(Object o1, Object o2) {
        DomainName d1 = (DomainName) o1;
        DomainName d2 = (DomainName) o2;
        
        if (d1.getExpirationDate() < d2.getExpirationDate()) {
            return -1;
        }
        
        if (d1.getExpirationDate() > d2.getExpirationDate()) {
            return 1;
        }
        
        return 0;
    }
}
