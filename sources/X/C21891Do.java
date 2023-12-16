package X;

/* renamed from: X.1Do  reason: invalid class name and case insensitive filesystem */
public final class C21891Do extends C130786cX implements C181378mf {
    public static final int CLIENT_DEBUG_DATA_FIELD_NUMBER = 9;
    public static final C21891Do DEFAULT_INSTANCE;
    public static final int DEVICE_INDEX_FIELD_NUMBER = 8;
    public static final int EXIT_CODE_FIELD_NUMBER = 7;
    public static final int EXTERNAL_MUTATIONS_FIELD_NUMBER = 3;
    public static final int KEY_ID_FIELD_NUMBER = 6;
    public static final int MUTATIONS_FIELD_NUMBER = 2;
    public static volatile C178978iP PARSER = null;
    public static final int PATCH_MAC_FIELD_NUMBER = 5;
    public static final int SNAPSHOT_MAC_FIELD_NUMBER = 4;
    public static final int VERSION_FIELD_NUMBER = 1;
    public int bitField0_;
    public C172548Lq clientDebugData_;
    public int deviceIndex_;
    public C21231Ba exitCode_;
    public AnonymousClass1DW externalMutations_;
    public AnonymousClass1AY keyId_;
    public C188248ya mutations_ = C130236bd.A02;
    public C172548Lq patchMac_;
    public C172548Lq snapshotMac_;
    public C20981Ab version_;

    static {
        C21891Do r1 = new C21891Do();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, C21891Do.class);
    }

    public C21891Do() {
        C172548Lq r0 = C172548Lq.A01;
        this.snapshotMac_ = r0;
        this.patchMac_ = r0;
        this.clientDebugData_ = r0;
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
                objArr[1] = "version_";
                objArr[2] = "mutations_";
                objArr[3] = C21241Bb.class;
                objArr[4] = "externalMutations_";
                objArr[5] = "snapshotMac_";
                objArr[6] = "patchMac_";
                objArr[7] = "keyId_";
                objArr[8] = "exitCode_";
                objArr[9] = "deviceIndex_";
                objArr[10] = "clientDebugData_";
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003ဉ\u0001\u0004ည\u0002\u0005ည\u0003\u0006ဉ\u0004\u0007ဉ\u0005\bဋ\u0006\tည\u0007", objArr);
            case 3:
                return new C21891Do();
            case 4:
                return new AnonymousClass188();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (C21891Do.class) {
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
