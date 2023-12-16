package X;

/* renamed from: X.6cT  reason: invalid class name and case insensitive filesystem */
public final class C130746cT extends C130786cX implements C181378mf {
    public static final int BACKUP_KEY_DATA_ENCRYPTED_FIELD_NUMBER = 1;
    public static final C130746cT DEFAULT_INSTANCE;
    public static volatile C178978iP PARSER = null;
    public static final int RK_NONCE_FIELD_NUMBER = 2;
    public C172548Lq backupKeyDataEncrypted_;
    public int bitField0_;
    public C172548Lq rkNonce_;

    static {
        C130746cT r1 = new C130746cT();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, C130746cT.class);
    }

    public static C130746cT A00(byte[] bArr) {
        return (C130746cT) C130786cX.A05(DEFAULT_INSTANCE, bArr);
    }

    public C172548Lq A0M() {
        return this.backupKeyDataEncrypted_;
    }

    public C172548Lq A0N() {
        return this.rkNonce_;
    }

    public C130746cT() {
        C172548Lq r0 = C172548Lq.A01;
        this.backupKeyDataEncrypted_ = r0;
        this.rkNonce_ = r0;
    }
}
