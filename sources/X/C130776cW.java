package X;

/* renamed from: X.6cW  reason: invalid class name and case insensitive filesystem */
public final class C130776cW extends C130786cX implements C181378mf {
    public static final int AES_K_FIELD_NUMBER = 1;
    public static final C130776cW DEFAULT_INSTANCE;
    public static final int K_NONCE_FIELD_NUMBER = 2;
    public static volatile C178978iP PARSER;
    public C172548Lq aesK_;
    public int bitField0_;
    public C172548Lq kNonce_;

    static {
        C130776cW r1 = new C130776cW();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, C130776cW.class);
    }

    public static C130516c6 A00() {
        return (C130516c6) DEFAULT_INSTANCE.A0G();
    }

    public static C130776cW A01(byte[] bArr) {
        return (C130776cW) C130786cX.A05(DEFAULT_INSTANCE, bArr);
    }

    public C172548Lq A0M() {
        return this.aesK_;
    }

    public C172548Lq A0N() {
        return this.kNonce_;
    }

    public C130776cW() {
        C172548Lq r0 = C172548Lq.A01;
        this.aesK_ = r0;
        this.kNonce_ = r0;
    }
}
