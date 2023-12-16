package X;

/* renamed from: X.1Du  reason: invalid class name and case insensitive filesystem */
public final class C21951Du extends C130786cX implements C181378mf {
    public static final int CURRENCY_CODE_FIELD_NUMBER = 5;
    public static final C21951Du DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 4;
    public static final int FIRST_IMAGE_ID_FIELD_NUMBER = 11;
    public static volatile C178978iP PARSER = null;
    public static final int PRICE_AMOUNT_1000_FIELD_NUMBER = 6;
    public static final int PRODUCT_ID_FIELD_NUMBER = 2;
    public static final int PRODUCT_IMAGE_COUNT_FIELD_NUMBER = 9;
    public static final int PRODUCT_IMAGE_FIELD_NUMBER = 1;
    public static final int RETAILER_ID_FIELD_NUMBER = 7;
    public static final int SALE_PRICE_AMOUNT_1000_FIELD_NUMBER = 12;
    public static final int TITLE_FIELD_NUMBER = 3;
    public static final int URL_FIELD_NUMBER = 8;
    public int bitField0_;
    public String currencyCode_ = "";
    public String description_ = "";
    public String firstImageId_ = "";
    public long priceAmount1000_;
    public String productId_ = "";
    public int productImageCount_;
    public AnonymousClass1EE productImage_;
    public String retailerId_ = "";
    public long salePriceAmount1000_;
    public String title_ = "";
    public String url_ = "";

    static {
        C21951Du r1 = new C21951Du();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, C21951Du.class);
    }

    public final Object A0J(C141056ux r4, Object obj, Object obj2) {
        C178978iP r0;
        switch (r4.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] objArr = new Object[12];
                AnonymousClass0x2.A1R(objArr);
                objArr[1] = "productImage_";
                objArr[2] = "productId_";
                objArr[3] = "title_";
                objArr[4] = "description_";
                objArr[5] = "currencyCode_";
                objArr[6] = "priceAmount1000_";
                objArr[7] = "retailerId_";
                objArr[8] = "url_";
                objArr[9] = "productImageCount_";
                objArr[10] = "firstImageId_";
                objArr[11] = "salePriceAmount1000_";
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\u000b\u0000\u0001\u0001\f\u000b\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဂ\u0005\u0007ဈ\u0006\bဈ\u0007\tဋ\b\u000bဈ\t\fဂ\n", objArr);
            case 3:
                return new C21951Du();
            case 4:
                return new AnonymousClass17N();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (C21951Du.class) {
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
