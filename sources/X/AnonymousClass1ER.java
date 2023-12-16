package X;

/* renamed from: X.1ER  reason: invalid class name */
public final class AnonymousClass1ER extends C130786cX implements C181378mf {
    public static final int BODY_FIELD_NUMBER = 2;
    public static final int CAROUSEL_MESSAGE_FIELD_NUMBER = 7;
    public static final int COLLECTION_MESSAGE_FIELD_NUMBER = 5;
    public static final int CONTEXT_INFO_FIELD_NUMBER = 15;
    public static final AnonymousClass1ER DEFAULT_INSTANCE;
    public static final int FOOTER_FIELD_NUMBER = 3;
    public static final int HEADER_FIELD_NUMBER = 1;
    public static final int NATIVE_FLOW_MESSAGE_FIELD_NUMBER = 6;
    public static volatile C178978iP PARSER = null;
    public static final int SHOP_STOREFRONT_MESSAGE_FIELD_NUMBER = 4;
    public int bitField0_;
    public AnonymousClass1AN body_;
    public AnonymousClass1EF contextInfo_;
    public AnonymousClass1AO footer_;
    public AnonymousClass1DR header_;
    public int interactiveMessageCase_ = 0;
    public Object interactiveMessage_;

    static {
        AnonymousClass1ER r1 = new AnonymousClass1ER();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, AnonymousClass1ER.class);
    }

    public AnonymousClass20G A0M() {
        int i = this.interactiveMessageCase_;
        if (i == 0) {
            return AnonymousClass20G.INTERACTIVEMESSAGE_NOT_SET;
        }
        if (i == 4) {
            return AnonymousClass20G.SHOP_STOREFRONT_MESSAGE;
        }
        if (i == 5) {
            return AnonymousClass20G.COLLECTION_MESSAGE;
        }
        if (i == 6) {
            return AnonymousClass20G.NATIVE_FLOW_MESSAGE;
        }
        if (i != 7) {
            return null;
        }
        return AnonymousClass20G.CAROUSEL_MESSAGE;
    }

    public AnonymousClass1C7 A0N() {
        if (this.interactiveMessageCase_ == 6) {
            return (AnonymousClass1C7) this.interactiveMessage_;
        }
        return AnonymousClass1C7.DEFAULT_INSTANCE;
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
                objArr[0] = "interactiveMessage_";
                AnonymousClass0x2.A1W(objArr, "interactiveMessageCase_");
                objArr[3] = "header_";
                objArr[4] = "body_";
                objArr[5] = "footer_";
                objArr[6] = AnonymousClass1C8.class;
                objArr[7] = AnonymousClass1C6.class;
                objArr[8] = AnonymousClass1C7.class;
                objArr[9] = AnonymousClass1BG.class;
                objArr[10] = "contextInfo_";
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\b\u0001\u0001\u0001\u000f\b\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ြ\u0000\u0005ြ\u0000\u0006ြ\u0000\u0007ြ\u0000\u000fဉ\u0007", objArr);
            case 3:
                return new AnonymousClass1ER();
            case 4:
                return new C209219v();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (AnonymousClass1ER.class) {
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
