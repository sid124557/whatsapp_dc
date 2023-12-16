package X;

/* renamed from: X.1DH  reason: invalid class name */
public final class AnonymousClass1DH extends C130786cX implements C181378mf {
    public static final int CONTEXT_INFO_FIELD_NUMBER = 3;
    public static final AnonymousClass1DH DEFAULT_INSTANCE;
    public static volatile C178978iP PARSER = null;
    public static final int SELECTED_CAROUSEL_CARD_INDEX_FIELD_NUMBER = 5;
    public static final int SELECTED_DISPLAY_TEXT_FIELD_NUMBER = 2;
    public static final int SELECTED_ID_FIELD_NUMBER = 1;
    public static final int SELECTED_INDEX_FIELD_NUMBER = 4;
    public int bitField0_;
    public AnonymousClass1EF contextInfo_;
    public int selectedCarouselCardIndex_;
    public String selectedDisplayText_ = "";
    public String selectedId_ = "";
    public int selectedIndex_;

    static {
        AnonymousClass1DH r1 = new AnonymousClass1DH();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, AnonymousClass1DH.class);
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
                A1Z[1] = "selectedId_";
                A1Z[2] = "selectedDisplayText_";
                A1Z[3] = "contextInfo_";
                A1Z[4] = "selectedIndex_";
                A1Z[5] = "selectedCarouselCardIndex_";
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဋ\u0003\u0005ဋ\u0004", A1Z);
            case 3:
                return new AnonymousClass1DH();
            case 4:
                return new AnonymousClass17T();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (AnonymousClass1DH.class) {
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
