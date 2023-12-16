package X;

/* renamed from: X.6cO  reason: invalid class name and case insensitive filesystem */
public final class C130696cO extends C130786cX implements C181378mf {
    public static final C130696cO DEFAULT_INSTANCE;
    public static final int LOCALBASEKEYPRIVATE_FIELD_NUMBER = 3;
    public static final int LOCALBASEKEY_FIELD_NUMBER = 2;
    public static final int LOCALIDENTITYKEYPRIVATE_FIELD_NUMBER = 8;
    public static final int LOCALIDENTITYKEY_FIELD_NUMBER = 7;
    public static final int LOCALRATCHETKEYPRIVATE_FIELD_NUMBER = 5;
    public static final int LOCALRATCHETKEY_FIELD_NUMBER = 4;
    public static volatile C178978iP PARSER = null;
    public static final int SEQUENCE_FIELD_NUMBER = 1;
    public int bitField0_;
    public C172548Lq localBaseKeyPrivate_;
    public C172548Lq localBaseKey_;
    public C172548Lq localIdentityKeyPrivate_;
    public C172548Lq localIdentityKey_;
    public C172548Lq localRatchetKeyPrivate_;
    public C172548Lq localRatchetKey_;
    public int sequence_;

    static {
        C130696cO r1 = new C130696cO();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, C130696cO.class);
    }

    public C130696cO() {
        C172548Lq r0 = C172548Lq.A01;
        this.localBaseKey_ = r0;
        this.localBaseKeyPrivate_ = r0;
        this.localRatchetKey_ = r0;
        this.localRatchetKeyPrivate_ = r0;
        this.localIdentityKey_ = r0;
        this.localIdentityKeyPrivate_ = r0;
    }
}
