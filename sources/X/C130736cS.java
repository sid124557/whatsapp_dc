package X;

/* renamed from: X.6cS  reason: invalid class name and case insensitive filesystem */
public final class C130736cS extends C130786cX implements C181378mf {
    public static final int BACKUP_KEY_DATA_FIELD_NUMBER = 1;
    public static final C130736cS DEFAULT_INSTANCE;
    public static final int OPAQUE_CHALLENGE_FIELD_NUMBER = 3;
    public static volatile C178978iP PARSER = null;
    public static final int R3_FIELD_NUMBER = 2;
    public static final int TRANSCRIPT_FIELD_NUMBER = 4;
    public C172548Lq backupKeyData_;
    public int bitField0_;
    public C172548Lq opaqueChallenge_;
    public C172548Lq r3_;
    public C172548Lq transcript_;

    static {
        C130736cS r1 = new C130736cS();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, C130736cS.class);
    }

    public static C130526c7 A00() {
        return (C130526c7) DEFAULT_INSTANCE.A0G();
    }

    public C130736cS() {
        C172548Lq r0 = C172548Lq.A01;
        this.backupKeyData_ = r0;
        this.r3_ = r0;
        this.opaqueChallenge_ = r0;
        this.transcript_ = r0;
    }
}
