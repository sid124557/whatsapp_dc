package X;

/* renamed from: X.1De  reason: invalid class name and case insensitive filesystem */
public final class C21791De extends C130786cX implements C181378mf {
    public static final int CREATEDAT_FIELD_NUMBER = 4;
    public static final C21791De DEFAULT_INSTANCE;
    public static final int ISDELETED_FIELD_NUMBER = 6;
    public static final int LASTSENTAT_FIELD_NUMBER = 5;
    public static final int MEDIAID_FIELD_NUMBER = 7;
    public static final int MESSAGE_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    public static volatile C178978iP PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 3;
    public int bitField0_;
    public long createdAt_;
    public boolean isDeleted_;
    public long lastSentAt_;
    public String mediaId_ = "";
    public String message_ = "";
    public String name_ = "";
    public int type_;

    static {
        C21791De r1 = new C21791De();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, C21791De.class);
    }

    public final Object A0J(C141056ux r4, Object obj, Object obj2) {
        C178978iP r0;
        switch (r4.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] objArr = new Object[9];
                AnonymousClass0x2.A1R(objArr);
                objArr[1] = "name_";
                objArr[2] = "message_";
                objArr[3] = "type_";
                objArr[4] = C64043Bw.A00;
                objArr[5] = "createdAt_";
                objArr[6] = "lastSentAt_";
                objArr[7] = "isDeleted_";
                objArr[8] = "mediaId_";
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဌ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဇ\u0005\u0007ဈ\u0006", objArr);
            case 3:
                return new C21791De();
            case 4:
                return new AnonymousClass18X();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (C21791De.class) {
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
