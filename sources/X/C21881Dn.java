package X;

/* renamed from: X.1Dn  reason: invalid class name and case insensitive filesystem */
public final class C21881Dn extends C130786cX implements C181378mf {
    public static final C21881Dn DEFAULT_INSTANCE;
    public static final int DETERMINISTIC_LC_FIELD_NUMBER = 8;
    public static final int DETERMINISTIC_LG_FIELD_NUMBER = 7;
    public static final int ELEMENT_NAME_FIELD_NUMBER = 2;
    public static final int FALLBACK_LC_FIELD_NUMBER = 5;
    public static final int FALLBACK_LG_FIELD_NUMBER = 4;
    public static final int HYDRATED_HSM_FIELD_NUMBER = 9;
    public static final int LOCALIZABLE_PARAMS_FIELD_NUMBER = 6;
    public static final int NAMESPACE_FIELD_NUMBER = 1;
    public static final int PARAMS_FIELD_NUMBER = 3;
    public static volatile C178978iP PARSER;
    public int bitField0_;
    public String deterministicLc_;
    public String deterministicLg_;
    public String elementName_ = "";
    public String fallbackLc_;
    public String fallbackLg_;
    public AnonymousClass1EI hydratedHsm_;
    public C188248ya localizableParams_;
    public String namespace_ = "";
    public C188248ya params_;

    static {
        C21881Dn r1 = new C21881Dn();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, C21881Dn.class);
    }

    public C21881Dn() {
        C130236bd r0 = C130236bd.A02;
        this.params_ = r0;
        this.fallbackLg_ = "";
        this.fallbackLc_ = "";
        this.localizableParams_ = r0;
        this.deterministicLg_ = "";
        this.deterministicLc_ = "";
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
                AnonymousClass0x2.A1R(objArr);
                objArr[1] = "namespace_";
                objArr[2] = "elementName_";
                objArr[3] = "params_";
                objArr[4] = "fallbackLg_";
                objArr[5] = "fallbackLc_";
                objArr[6] = "localizableParams_";
                objArr[7] = AnonymousClass1C5.class;
                objArr[8] = "deterministicLg_";
                objArr[9] = "deterministicLc_";
                objArr[10] = "hydratedHsm_";
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0002\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003\u001a\u0004ဈ\u0002\u0005ဈ\u0003\u0006\u001b\u0007ဈ\u0004\bဈ\u0005\tဉ\u0006", objArr);
            case 3:
                return new C21881Dn();
            case 4:
                return new C199616d();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (C21881Dn.class) {
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
