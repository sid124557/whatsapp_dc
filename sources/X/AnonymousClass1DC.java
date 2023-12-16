package X;

/* renamed from: X.1DC  reason: invalid class name */
public final class AnonymousClass1DC extends C130786cX implements C181378mf {
    public static final int CONTEXT_INFO_FIELD_NUMBER = 4;
    public static final AnonymousClass1DC DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 5;
    public static final int LIST_TYPE_FIELD_NUMBER = 2;
    public static volatile C178978iP PARSER = null;
    public static final int SINGLE_SELECT_REPLY_FIELD_NUMBER = 3;
    public static final int TITLE_FIELD_NUMBER = 1;
    public int bitField0_;
    public AnonymousClass1EF contextInfo_;
    public String description_ = "";
    public int listType_;
    public AnonymousClass1AQ singleSelectReply_;
    public String title_ = "";

    static {
        AnonymousClass1DC r1 = new AnonymousClass1DC();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, AnonymousClass1DC.class);
    }

    public final Object A0J(C141056ux r4, Object obj, Object obj2) {
        C178978iP r0;
        switch (r4.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] objArr = new Object[7];
                AnonymousClass0x2.A1R(objArr);
                objArr[1] = "title_";
                objArr[2] = "listType_";
                objArr[3] = AnonymousClass3BX.A00;
                objArr[4] = "singleSelectReply_";
                objArr[5] = "contextInfo_";
                objArr[6] = "description_";
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဈ\u0004", objArr);
            case 3:
                return new AnonymousClass1DC();
            case 4:
                return new AnonymousClass170();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (AnonymousClass1DC.class) {
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
