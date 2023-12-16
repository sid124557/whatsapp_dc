package X;

/* renamed from: X.1B5  reason: invalid class name */
public final class AnonymousClass1B5 extends C130786cX implements C181378mf {
    public static final AnonymousClass1B5 DEFAULT_INSTANCE;
    public static volatile C178978iP PARSER = null;
    public static final int SELECTED_PROMPT_INDEX_FIELD_NUMBER = 2;
    public static final int SUGGESTED_PROMPTS_FIELD_NUMBER = 1;
    public int bitField0_;
    public int selectedPromptIndex_;
    public C188248ya suggestedPrompts_ = C130236bd.A02;

    static {
        AnonymousClass1B5 r1 = new AnonymousClass1B5();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, AnonymousClass1B5.class);
    }

    public final Object A0J(C141056ux r4, Object obj, Object obj2) {
        C178978iP r0;
        switch (r4.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1W = C18270x1.A1W();
                A1W[1] = "suggestedPrompts_";
                A1W[2] = "selectedPromptIndex_";
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001a\u0002ဋ\u0000", A1W);
            case 3:
                return new AnonymousClass1B5();
            case 4:
                return new C199115v();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (AnonymousClass1B5.class) {
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
