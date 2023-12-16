package X;

/* renamed from: X.1EL  reason: invalid class name */
public final class AnonymousClass1EL extends C130786cX implements C181378mf {
    public static final int BUTTON_TEXT_FIELD_NUMBER = 3;
    public static final int CONTEXT_INFO_FIELD_NUMBER = 8;
    public static final AnonymousClass1EL DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 2;
    public static final int FOOTER_TEXT_FIELD_NUMBER = 7;
    public static final int LIST_TYPE_FIELD_NUMBER = 4;
    public static volatile C178978iP PARSER = null;
    public static final int PRODUCT_LIST_INFO_FIELD_NUMBER = 6;
    public static final int SECTIONS_FIELD_NUMBER = 5;
    public static final int TITLE_FIELD_NUMBER = 1;
    public int bitField0_;
    public String buttonText_ = "";
    public AnonymousClass1EF contextInfo_;
    public String description_ = "";
    public String footerText_ = "";
    public int listType_;
    public AnonymousClass1CB productListInfo_;
    public C188248ya sections_ = C130236bd.A02;
    public String title_ = "";

    static {
        AnonymousClass1EL r1 = new AnonymousClass1EL();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, AnonymousClass1EL.class);
    }

    public AnonymousClass22j A0M() {
        int i = this.listType_;
        if (i != 0) {
            if (i == 1) {
                return AnonymousClass22j.SINGLE_SELECT;
            }
            if (i == 2) {
                return AnonymousClass22j.PRODUCT_LIST;
            }
        }
        return AnonymousClass22j.UNKNOWN;
    }

    public final Object A0J(C141056ux r4, Object obj, Object obj2) {
        C178978iP r0;
        switch (r4.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] objArr = new Object[11];
                AnonymousClass0x2.A1R(objArr);
                objArr[1] = "title_";
                objArr[2] = "description_";
                objArr[3] = "buttonText_";
                objArr[4] = "listType_";
                objArr[5] = AnonymousClass3BW.A00;
                objArr[6] = "sections_";
                objArr[7] = AnonymousClass1BL.class;
                objArr[8] = "productListInfo_";
                objArr[9] = "footerText_";
                objArr[10] = "contextInfo_";
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဌ\u0003\u0005\u001b\u0006ဉ\u0004\u0007ဈ\u0005\bဉ\u0006", objArr);
            case 3:
                return new AnonymousClass1EL();
            case 4:
                return new C201216t();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (AnonymousClass1EL.class) {
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
