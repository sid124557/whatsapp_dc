package X;

/* renamed from: X.1DJ  reason: invalid class name */
public final class AnonymousClass1DJ extends C130786cX implements C181378mf {
    public static final int COLOR_FIELD_NUMBER = 2;
    public static final AnonymousClass1DJ DEFAULT_INSTANCE;
    public static final int DELETED_FIELD_NUMBER = 4;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int ORDER_INDEX_FIELD_NUMBER = 5;
    public static volatile C178978iP PARSER = null;
    public static final int PREDEFINEDID_FIELD_NUMBER = 3;
    public int bitField0_;
    public int color_;
    public boolean deleted_;
    public String name_ = "";
    public int orderIndex_;
    public int predefinedId_;

    static {
        AnonymousClass1DJ r1 = new AnonymousClass1DJ();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, AnonymousClass1DJ.class);
    }

    public final Object A0J(C141056ux r4, Object obj, Object obj2) {
        C178978iP r0;
        switch (r4.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1Z = C18270x1.A1Z();
                A1Z[1] = "name_";
                A1Z[2] = "color_";
                A1Z[3] = "predefinedId_";
                A1Z[4] = "deleted_";
                A1Z[5] = "orderIndex_";
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003င\u0002\u0004ဇ\u0003\u0005င\u0004", A1Z);
            case 3:
                return new AnonymousClass1DJ();
            case 4:
                return new AnonymousClass18T();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (AnonymousClass1DJ.class) {
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
