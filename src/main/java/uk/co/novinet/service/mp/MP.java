package uk.co.novinet.service.mp;

import static org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString;

public class MP {
    private Long id;
    private String lastName;
    private String firstName;
    private String mpName;
    private String party;
    private String twitter;
    private String email;
    private String constituency;
    private String constituencyAddress;
    private String edmStatus;
    private String edmUrl;
    private String ministerialStatus;
    private String url;
    private Long majority;
    private String pCon;
    private Integer mpGroupNo;
    private String telNo;
    private String campaignNotes;
    private String sharedCampaignEmails;
    private String privateCampaignEmails;

    private String administratorName;

    public MP() {}

    public MP(
    	Long id,
    	String lastName,
    	String firstName,
        String mpName,
        String party,
        String twitter,
    	String email,
    	String constituency,
    	String constituencyAddress,
    	String edmStatus,
    	String edmUrl,
    	String ministerialStatus,
    	String url,
        Long majority,
    	String pCon,
    	Integer mpGroupNo,
        String telNo,
        String campaignNotes,
        String sharedCampaignEmails,
        String privateCampaignEmails,
        String administratorName
    ) {
		this.id = id;
		this.lastName = lastName;
		this.firstName = firstName;
		this.mpName = mpName;
		this.party = party;
		this.twitter = twitter;
		this.email = email;
		this.constituency = constituency;
		this.constituencyAddress = constituencyAddress;
		this.edmStatus = edmStatus;
		this.edmUrl = edmUrl;
		this.ministerialStatus = ministerialStatus;
		this.url = url;
		this.majority = majority;
		this.pCon			        = pCon;
		this.mpGroupNo = mpGroupNo;
		this.telNo = telNo;
		this.campaignNotes = campaignNotes;
		this.sharedCampaignEmails = sharedCampaignEmails;
		this.privateCampaignEmails = privateCampaignEmails;
		this.administratorName = administratorName;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long MpId) {
        this.id = MpId;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getMpName() {
        return mpName;
    }
    public void setMpName(String mpName) {
        this.mpName = mpName;
    }
    public String getParty() {
        return party;
    }
    public void setParty(String MpParty) {
        this.party = MpParty;
    }
    public String getTwitter() {
        return twitter;
    }
    public void setTwitter(String MpTwitter) {
        this.twitter = MpTwitter;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String MpEmail) {
        this.email = MpEmail;
    }
    public String getConstituency() {
        return constituency;
    }
    public void setConstituency(String MpConstituency) {
        this.constituency = MpConstituency;
    }
    public String getConstituencyAddress() {
        return constituencyAddress;
    }
    public void setConstituencyAddress(String MpConstituencyAddress) {
        this.constituencyAddress = MpConstituencyAddress;
    }
    public String getEdmStatus() {
        return edmStatus;
    }
    public void setEdmStatus(String edmStatus) {
        this.edmStatus = edmStatus;
    }
    public String getEdmUrl() {
        return edmUrl;
    }
    public void setEdmUrl(String edmUrl) {
        this.edmUrl = edmUrl;
    }
    public String getMinisterialStatus() {
        return ministerialStatus;
    }
    public void setMinisterialStatus(String MinisterialStatus) {
        this.ministerialStatus = MinisterialStatus;
    }
    public String getUrl() {
        return url;
    }
    public void setUrl(String Url) {
        this.url = Url;
    }
    public Long getMajority() {
        return majority;
    }
    public void setMajority(Long Majority) {
        this.majority = Majority;
    }
    public String getpCon() {
        return pCon;
    }
    public void setpCon(String pCon) {
        this.pCon = pCon;
    }
    public Integer getMpGroupNo() {
        return mpGroupNo;
    }
    public void setMpGroupNo(Integer MpGroup) {
        this.mpGroupNo = MpGroup;
    }
    public String getTelNo() {
        return telNo;
    }
    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }
    public String getCampaignNotes() {
        return campaignNotes;
    }
    public void setCampaignNotes(String campaignNotes) {
        this.campaignNotes = campaignNotes;
    }
    public String getSharedCampaignEmails() {
        return sharedCampaignEmails;
    }
    public void setSharedCampaignEmails(String sharedCampaignEmails) {
        this.sharedCampaignEmails = sharedCampaignEmails;
    }
    public String getPrivateCampaignEmails() {
        return privateCampaignEmails;
    }
    public void setPrivateCampaignEmails(String privateCampaignEmails) {
        this.privateCampaignEmails = privateCampaignEmails;
    }

    // Extra
    public String getAdministratorName() {
        return administratorName;
    }
    public void setAdministratorName(String administratorName) {
        this.administratorName = administratorName;
    }
}
