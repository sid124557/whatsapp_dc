package X;

/* renamed from: X.6cR  reason: invalid class name and case insensitive filesystem */
public final class C130726cR extends C130786cX implements C181378mf {
    public static final int BACKUP_CIPHER_HEADER_FIELD_NUMBER = 1;
    public static final C130726cR DEFAULT_INSTANCE;
    public static final int ENCRYPTION_IV_FIELD_NUMBER = 5;
    public static final int GOOGLE_ID_SALT_FIELD_NUMBER = 4;
    public static final int KEY_VERSION_FIELD_NUMBER = 2;
    public static volatile C178978iP PARSER = null;
    public static final int SERVER_SALT_FIELD_NUMBER = 3;
    public C172548Lq backupCipherHeader_;
    public int bitField0_;
    public C172548Lq encryptionIv_;
    public C172548Lq googleIdSalt_;
    public String keyVersion_ = "";
    public C172548Lq serverSalt_;

    static {
        C130726cR r1 = new C130726cR();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, C130726cR.class);
    }

    public C172548Lq A0M() {
        return this.backupCipherHeader_;
    }

    public C172548Lq A0N() {
        return this.encryptionIv_;
    }

    public C172548Lq A0O() {
        return this.googleIdSalt_;
    }

    public C172548Lq A0P() {
        return this.serverSalt_;
    }

    public String A0Q() {
        return this.keyVersion_;
    }

    public C130726cR() {
        C172548Lq r1 = C172548Lq.A01;
        this.backupCipherHeader_ = r1;
        this.serverSalt_ = r1;
        this.googleIdSalt_ = r1;
        this.encryptionIv_ = r1;
    }
}
