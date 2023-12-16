package X;

/* renamed from: X.1CV  reason: invalid class name */
public final class AnonymousClass1CV extends C130786cX implements C181378mf {
    public static final AnonymousClass1CV DEFAULT_INSTANCE;
    public static final int NEW_PHOTO_FIELD_NUMBER = 2;
    public static final int NEW_PHOTO_ID_FIELD_NUMBER = 3;
    public static final int OLD_PHOTO_FIELD_NUMBER = 1;
    public static volatile C178978iP PARSER;
    public int bitField0_;
    public int newPhotoId_;
    public C172548Lq newPhoto_;
    public C172548Lq oldPhoto_;

    static {
        AnonymousClass1CV r1 = new AnonymousClass1CV();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, AnonymousClass1CV.class);
    }

    public AnonymousClass1CV() {
        C172548Lq r0 = C172548Lq.A01;
        this.oldPhoto_ = r0;
        this.newPhoto_ = r0;
    }

    public final Object A0J(C141056ux r4, Object obj, Object obj2) {
        C178978iP r0;
        switch (r4.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1X = C18270x1.A1X();
                A1X[1] = "oldPhoto_";
                A1X[2] = "newPhoto_";
                A1X[3] = "newPhotoId_";
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ဋ\u0002", A1X);
            case 3:
                return new AnonymousClass1CV();
            case 4:
                return new AnonymousClass19B();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (AnonymousClass1CV.class) {
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
