package X;

/* renamed from: X.1Db  reason: invalid class name and case insensitive filesystem */
public final class C21761Db extends C130786cX implements C181378mf {
    public static final int CONTEXT_INFO_FIELD_NUMBER = 1;
    public static final C21761Db DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 4;
    public static final int IS_CANCELED_FIELD_NUMBER = 2;
    public static final int JOIN_LINK_FIELD_NUMBER = 6;
    public static final int LOCATION_FIELD_NUMBER = 5;
    public static final int NAME_FIELD_NUMBER = 3;
    public static volatile C178978iP PARSER = null;
    public static final int START_TIME_FIELD_NUMBER = 7;
    public int bitField0_;
    public AnonymousClass1EF contextInfo_;
    public String description_ = "";
    public boolean isCanceled_;
    public String joinLink_ = "";
    public C21991Dy location_;
    public String name_ = "";
    public long startTime_;

    static {
        C21761Db r1 = new C21761Db();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, C21761Db.class);
    }

    public final Object A0J(C141056ux r4, Object obj, Object obj2) {
        C178978iP r0;
        switch (r4.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] objArr = new Object[8];
                AnonymousClass0x2.A1R(objArr);
                objArr[1] = "contextInfo_";
                objArr[2] = "isCanceled_";
                objArr[3] = "name_";
                objArr[4] = "description_";
                objArr[5] = "location_";
                objArr[6] = "joinLink_";
                objArr[7] = "startTime_";
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဉ\u0004\u0006ဈ\u0005\u0007ဂ\u0006", objArr);
            case 3:
                return new C21761Db();
            case 4:
                return new C199316a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (C21761Db.class) {
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
