package X;

/* renamed from: X.1EI  reason: invalid class name */
public final class AnonymousClass1EI extends C130786cX implements C181378mf {
    public static final int CONTEXT_INFO_FIELD_NUMBER = 3;
    public static final AnonymousClass1EI DEFAULT_INSTANCE;
    public static final int FOUR_ROW_TEMPLATE_FIELD_NUMBER = 1;
    public static final int HYDRATED_FOUR_ROW_TEMPLATE_FIELD_NUMBER = 2;
    public static final int HYDRATED_TEMPLATE_FIELD_NUMBER = 4;
    public static final int INTERACTIVE_MESSAGE_TEMPLATE_FIELD_NUMBER = 5;
    public static volatile C178978iP PARSER = null;
    public static final int TEMPLATE_ID_FIELD_NUMBER = 9;
    public int bitField0_;
    public AnonymousClass1EF contextInfo_;
    public int formatCase_ = 0;
    public Object format_;
    public AnonymousClass1EK hydratedTemplate_;
    public String templateId_ = "";

    static {
        AnonymousClass1EI r1 = new AnonymousClass1EI();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, AnonymousClass1EI.class);
    }

    public AnonymousClass1EJ A0M() {
        if (this.formatCase_ == 1) {
            return (AnonymousClass1EJ) this.format_;
        }
        return AnonymousClass1EJ.DEFAULT_INSTANCE;
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
                objArr[0] = "format_";
                AnonymousClass0x2.A1W(objArr, "formatCase_");
                objArr[3] = AnonymousClass1EJ.class;
                objArr[4] = AnonymousClass1EK.class;
                objArr[5] = "contextInfo_";
                objArr[6] = "hydratedTemplate_";
                objArr[7] = AnonymousClass1ER.class;
                objArr[8] = "templateId_";
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\u0006\u0001\u0001\u0001\t\u0006\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ဉ\u0003\u0004ဉ\u0004\u0005ြ\u0000\tဈ\u0005", objArr);
            case 3:
                return new AnonymousClass1EI();
            case 4:
                return new C208619p();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (AnonymousClass1EI.class) {
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
