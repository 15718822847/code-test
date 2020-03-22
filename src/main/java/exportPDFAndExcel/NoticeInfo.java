package exportPDFAndExcel;

import java.util.Date;

public class NoticeInfo {

    private String noticeInfoId;

    private String noticeTitle;

    private String noticeContent;

    private Date publishTime;

    private Date expiryTime;

    private String typeId;

    private String typeName;

    private String statusId;

    private String statusName;

    private String personNif;

    private String personName;


    private String noticeGroupId;

    private String noticeGroupName;

    private String signatureId;

    private String currentProcess;
    private String nextProcess;


    private String taxOfficeCode;


    private String region;


    private String taxPlayerType;


    private String industryType;

    private String organizationId;

    // 单个纳税人类型时，通知阅读状态
    private String taxpayerReadStatus;

    // 群发时通知未阅读人数
    private int unreadNumber;

    // 群发时通知已读人数
    private int readNumber;

    private Date taxpayerReadTime;

    // 系统来源
    private String systemSource;

    // 纳税人省份
    private String province;

    /**
     * GET
     *
     * @return noticeInfoId
     */
    public String getNoticeInfoId() {
        return noticeInfoId;
    }

    /**
     * SET
     *
     * @param noticeInfoId
     */
    public void setNoticeInfoId(String noticeInfoId) {
        this.noticeInfoId = noticeInfoId;
    }

    /**
     * GET
     *
     * @return noticeTitle
     */
    public String getNoticeTitle() {
        return noticeTitle;
    }

    /**
     * SET
     *
     * @param noticeTitle
     */
    public void setNoticeTitle(String noticeTitle) {
        this.noticeTitle = noticeTitle;
    }

    /**
     * GET
     *
     * @return noticeContent
     */
    public String getNoticeContent() {
        return noticeContent;
    }

    /**
     * SET
     *
     * @param noticeContent
     */
    public void setNoticeContent(String noticeContent) {
        this.noticeContent = noticeContent;
    }

    /**
     * GET
     *
     * @return publishTime
     */
    public Date getPublishTime() {
        return publishTime;
    }

    /**
     * SET
     *
     * @param publishTime
     */
    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
    }

    /**
     * GET
     *
     * @return expiryTime
     */
    public Date getExpiryTime() {
        return expiryTime;
    }

    /**
     * SET
     *
     * @param expiryTime
     */
    public void setExpiryTime(Date expiryTime) {
        this.expiryTime = expiryTime;
    }

    /**
     * GET
     *
     * @return typeId
     */
    public String getTypeId() {
        return typeId;
    }

    /**
     * SET
     *
     * @param typeId
     */
    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

    /**
     * GET
     *
     * @return typeName
     */
    public String getTypeName() {
        return typeName;
    }

    /**
     * SET
     *
     * @param typeName
     */
    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    /**
     * GET
     *
     * @return stautsId
     */
    public String getStatusId() {
        return statusId;
    }

    /**
     * SET
     *
     * @param statusId
     */
    public void setStatusId(String statusId) {
        this.statusId = statusId;
    }

    /**
     * GET
     *
     * @return statusName
     */
    public String getStatusName() {
        return statusName;
    }

    /**
     * SET
     *
     * @param statusName
     */
    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }

    /**
     * GET
     *
     * @return personNif
     */
    public String getPersonNif() {
        return personNif;
    }

    /**
     * SET
     *
     * @param personNif
     */
    public void setPersonNif(String personNif) {
        this.personNif = personNif;
    }

    /**
     * GET
     *
     * @return personName
     */
    public String getPersonName() {
        return personName;
    }

    /**
     * SET
     *
     * @param personName
     */
    public void setPersonName(String personName) {
        this.personName = personName;
    }

    /**
     * GET
     *
     * @return noticeGroupId
     */
    public String getNoticeGroupId() {
        return noticeGroupId;
    }

    /**
     * SET
     *
     * @param noticeGroupId
     */
    public void setNoticeGroupId(String noticeGroupId) {
        this.noticeGroupId = noticeGroupId;
    }

    /**
     * GET
     *
     * @return noticeGroupName
     */
    public String getNoticeGroupName() {
        return noticeGroupName;
    }

    /**
     * SET
     *
     * @param noticeGroupName
     */
    public void setNoticeGroupName(String noticeGroupName) {
        this.noticeGroupName = noticeGroupName;
    }

    /**
     * GET
     *
     * @return signatureId
     */
    public String getSignatureId() {
        return signatureId;
    }

    /**
     * SET
     *
     * @param signatureId
     */
    public void setSignatureId(String signatureId) {
        this.signatureId = signatureId;
    }


    /**
     * GET
     *
     * @return currentProcess
     */
    public String getCurrentProcess() {
        return currentProcess;
    }

    /**
     * SET
     *
     * @param currentProcess
     */
    public void setCurrentProcess(String currentProcess) {
        this.currentProcess = currentProcess;
    }

    /**
     * GET
     *
     * @return nextProcess
     */
    public String getNextProcess() {
        return nextProcess;
    }

    /**
     * SET
     *
     * @param nextProcess
     */
    public void setNextProcess(String nextProcess) {
        this.nextProcess = nextProcess;
    }

    /**
     * GET
     *
     * @return taxOfficeCode
     */
    public String getTaxOfficeCode() {
        return taxOfficeCode;
    }

    /**
     * SET
     *
     * @param taxOfficeCode
     */
    public void setTaxOfficeCode(String taxOfficeCode) {
        this.taxOfficeCode = taxOfficeCode;
    }

    /**
     * GET
     *
     * @return region
     */
    public String getRegion() {
        return region;
    }

    /**
     * SET
     *
     * @param region
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * GET
     *
     * @return taxPlayerType
     */
    public String getTaxPlayerType() {
        return taxPlayerType;
    }

    /**
     * SET
     *
     * @param taxPlayerType
     */
    public void setTaxPlayerType(String taxPlayerType) {
        this.taxPlayerType = taxPlayerType;
    }

    /**
     * GET
     *
     * @return industryType
     */
    public String getIndustryType() {
        return industryType;
    }

    /**
     * SET
     *
     * @param industryType
     */
    public void setIndustryType(String industryType) {
        this.industryType = industryType;
    }

    /**
     * GET
     *
     * @return organizationId
     */
    public String getOrganizationId() {
        return organizationId;
    }

    /**
     * SET
     *
     * @param organizationId
     */
    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    /**
     * GET
     *
     * @return taxpayerReadStatus
     */
    public String getTaxpayerReadStatus() {
        return taxpayerReadStatus;
    }

    /**
     * SET
     *
     * @param taxpayerReadStatus
     */
    public void setTaxpayerReadStatus(String taxpayerReadStatus) {
        this.taxpayerReadStatus = taxpayerReadStatus;
    }

    /**
     * GET
     *
     * @return unreadNumber
     */
    public int getUnreadNumber() {
        return unreadNumber;
    }

    /**
     * SET
     *
     * @param unreadNumber
     */
    public void setUnreadNumber(int unreadNumber) {
        this.unreadNumber = unreadNumber;
    }

    /**
     * GET
     *
     * @return readNumber
     */
    public int getReadNumber() {
        return readNumber;
    }

    /**
     * SET
     *
     * @param readNumber
     */
    public void setReadNumber(int readNumber) {
        this.readNumber = readNumber;
    }

    /**
     * GET
     *
     * @return taxpayerReadTime
     */
    public Date getTaxpayerReadTime() {
        return taxpayerReadTime;
    }

    /**
     * SET
     *
     * @param taxpayerReadTime
     */
    public void setTaxpayerReadTime(Date taxpayerReadTime) {
        this.taxpayerReadTime = taxpayerReadTime;
    }

    /**
     * GET
     *
     * @return systemSource
     */
    public String getSystemSource() {
        return systemSource;
    }

    /**
     * SET
     *
     * @param systemSource
     */
    public void setSystemSource(String systemSource) {
        this.systemSource = systemSource;
    }

    /**
     * GET
     *
     * @return province
     */
    public String getProvince() {
        return province;
    }

    /**
     * SET
     *
     * @param province
     */
    public void setProvince(String province) {
        this.province = province;
    }
}
