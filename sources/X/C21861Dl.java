package X;

/* renamed from: X.1Dl  reason: invalid class name and case insensitive filesystem */
public final class C21861Dl extends C130786cX implements C181378mf {
    public static final int BUILD_HASH_FIELD_NUMBER = 7;
    public static final C21861Dl DEFAULT_INSTANCE;
    public static final int DEVICE_PROPS_FIELD_NUMBER = 8;
    public static final int E_IDENT_FIELD_NUMBER = 3;
    public static final int E_KEYTYPE_FIELD_NUMBER = 2;
    public static final int E_REGID_FIELD_NUMBER = 1;
    public static final int E_SKEY_ID_FIELD_NUMBER = 4;
    public static final int E_SKEY_SIG_FIELD_NUMBER = 6;
    public static final int E_SKEY_VAL_FIELD_NUMBER = 5;
    public static volatile C178978iP PARSER;
    public int bitField0_;
    public C172548Lq buildHash_;
    public C172548Lq deviceProps_;
    public C172548Lq eIdent_;
    public C172548Lq eKeytype_;
    public C172548Lq eRegid_;
    public C172548Lq eSkeyId_;
    public C172548Lq eSkeySig_;
    public C172548Lq eSkeyVal_;

    static {
        C21861Dl r1 = new C21861Dl();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, C21861Dl.class);
    }

    public C21861Dl() {
        C172548Lq r0 = C172548Lq.A01;
        this.eRegid_ = r0;
        this.eKeytype_ = r0;
        this.eIdent_ = r0;
        this.eSkeyId_ = r0;
        this.eSkeyVal_ = r0;
        this.eSkeySig_ = r0;
        this.buildHash_ = r0;
        this.deviceProps_ = r0;
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
                AnonymousClass0x2.A1R(objArr);
                objArr[1] = "eRegid_";
                objArr[2] = "eKeytype_";
                objArr[3] = "eIdent_";
                objArr[4] = "eSkeyId_";
                objArr[5] = "eSkeyVal_";
                objArr[6] = "eSkeySig_";
                objArr[7] = "buildHash_";
                objArr[8] = "deviceProps_";
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002\u0004ည\u0003\u0005ည\u0004\u0006ည\u0005\u0007ည\u0006\bည\u0007", objArr);
            case 3:
                return new C21861Dl();
            case 4:
                return new C206618v();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (C21861Dl.class) {
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
