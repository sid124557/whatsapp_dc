package X;

/* renamed from: X.24H  reason: invalid class name */
public class AnonymousClass24H extends Exception {
    public static final long serialVersionUID = 1;
    public String banAppealToken;
    public String banMessage;
    public int code;
    public long expiration_time;
    public int expire_time_out;
    public String faqUrl;
    public String logoutMainButtonText;
    public String logoutMainButtonUrl;
    public String logoutMessageHeader;
    public String logoutMessageLocale;
    public String logoutMessageSubtext;
    public String logoutSecondaryButtonText;
    public String logoutSecondaryButtonUrl;
    public final int serverErrorCode;
    public final int type;
    public String violationReason;
    public int violationSourceAcct;
    public int violationType;

    public AnonymousClass24H(int i, int i2) {
        this.type = i;
        this.serverErrorCode = i2;
    }
}
