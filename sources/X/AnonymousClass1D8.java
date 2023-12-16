package X;

/* renamed from: X.1D8  reason: invalid class name */
public final class AnonymousClass1D8 extends C130786cX implements C181378mf {
    public static final int AVATAR_METADATA_FIELD_NUMBER = 1;
    public static final AnonymousClass1D8 DEFAULT_INSTANCE;
    public static final int INVOKER_JID_FIELD_NUMBER = 5;
    public static volatile C178978iP PARSER = null;
    public static final int PERSONA_ID_FIELD_NUMBER = 2;
    public static final int PLUGIN_METADATA_FIELD_NUMBER = 3;
    public static final int SUGGESTED_PROMPT_METADATA_FIELD_NUMBER = 4;
    public AnonymousClass1D7 avatarMetadata_;
    public int bitField0_;
    public String invokerJid_ = "";
    public String personaId_ = "";
    public AnonymousClass1DT pluginMetadata_;
    public AnonymousClass1B5 suggestedPromptMetadata_;

    static {
        AnonymousClass1D8 r1 = new AnonymousClass1D8();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, AnonymousClass1D8.class);
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
                A1Z[1] = "avatarMetadata_";
                A1Z[2] = "personaId_";
                A1Z[3] = "pluginMetadata_";
                A1Z[4] = "suggestedPromptMetadata_";
                A1Z[5] = "invokerJid_";
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဈ\u0004", A1Z);
            case 3:
                return new AnonymousClass1D8();
            case 4:
                return new C198915t();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (AnonymousClass1D8.class) {
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
