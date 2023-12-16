package X;

/* renamed from: X.1Dz  reason: invalid class name and case insensitive filesystem */
public final class C22001Dz extends C130786cX implements C181378mf {
    public static final int CONTEXT_INFO_FIELD_NUMBER = 17;
    public static final C22001Dz DEFAULT_INSTANCE;
    public static final int ITEM_COUNT_FIELD_NUMBER = 3;
    public static final int MESSAGE_FIELD_NUMBER = 6;
    public static final int MESSAGE_VERSION_FIELD_NUMBER = 12;
    public static final int ORDER_ID_FIELD_NUMBER = 1;
    public static final int ORDER_TITLE_FIELD_NUMBER = 7;
    public static volatile C178978iP PARSER = null;
    public static final int SELLER_JID_FIELD_NUMBER = 8;
    public static final int STATUS_FIELD_NUMBER = 4;
    public static final int SURFACE_FIELD_NUMBER = 5;
    public static final int THUMBNAIL_FIELD_NUMBER = 2;
    public static final int TOKEN_FIELD_NUMBER = 9;
    public static final int TOTAL_AMOUNT_1000_FIELD_NUMBER = 10;
    public static final int TOTAL_CURRENCY_CODE_FIELD_NUMBER = 11;
    public int bitField0_;
    public AnonymousClass1EF contextInfo_;
    public int itemCount_;
    public int messageVersion_ = 1;
    public String message_ = "";
    public String orderId_ = "";
    public String orderTitle_ = "";
    public String sellerJid_ = "";
    public int status_ = 1;
    public int surface_ = 1;
    public C172548Lq thumbnail_ = C172548Lq.A01;
    public String token_ = "";
    public long totalAmount1000_;
    public String totalCurrencyCode_ = "";

    static {
        C22001Dz r1 = new C22001Dz();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, C22001Dz.class);
    }

    public final Object A0J(C141056ux r4, Object obj, Object obj2) {
        C178978iP r0;
        switch (r4.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] objArr = new Object[16];
                AnonymousClass0x2.A1R(objArr);
                objArr[1] = "orderId_";
                objArr[2] = "thumbnail_";
                objArr[3] = "itemCount_";
                objArr[4] = "status_";
                objArr[5] = AnonymousClass3BY.A00;
                objArr[6] = "surface_";
                objArr[7] = AnonymousClass3BZ.A00;
                objArr[8] = "message_";
                objArr[9] = "orderTitle_";
                objArr[10] = "sellerJid_";
                objArr[11] = "token_";
                objArr[12] = "totalAmount1000_";
                objArr[13] = "totalCurrencyCode_";
                objArr[14] = "messageVersion_";
                objArr[15] = "contextInfo_";
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\r\u0000\u0001\u0001\u0011\r\u0000\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003င\u0002\u0004ဌ\u0003\u0005ဌ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဈ\u0007\tဈ\b\nဂ\t\u000bဈ\n\fင\f\u0011ဉ\u000b", objArr);
            case 3:
                return new C22001Dz();
            case 4:
                return new AnonymousClass176();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (C22001Dz.class) {
                    r0 = PARSER;
                    if (r0 == null) {
                        r0 = C18320x8.A0B(DEFAULT_INSTANCE);
                        PARSER = r0;
                    }
                }
                return r0;
            default:
                throw C18320x8.A0m();
        }
    }
}
