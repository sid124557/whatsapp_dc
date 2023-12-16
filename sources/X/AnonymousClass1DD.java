package X;

/* renamed from: X.1DD  reason: invalid class name */
public final class AnonymousClass1DD extends C130786cX implements C181378mf {
    public static final int CAPTION_FIELD_NUMBER = 4;
    public static final AnonymousClass1DD DEFAULT_INSTANCE;
    public static final int INVITE_EXPIRATION_FIELD_NUMBER = 5;
    public static final int JPEG_THUMBNAIL_FIELD_NUMBER = 3;
    public static final int NEWSLETTER_JID_FIELD_NUMBER = 1;
    public static final int NEWSLETTER_NAME_FIELD_NUMBER = 2;
    public static volatile C178978iP PARSER;
    public int bitField0_;
    public String caption_ = "";
    public long inviteExpiration_;
    public C172548Lq jpegThumbnail_ = C172548Lq.A01;
    public String newsletterJid_ = "";
    public String newsletterName_ = "";

    static {
        AnonymousClass1DD r1 = new AnonymousClass1DD();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, AnonymousClass1DD.class);
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
                A1Z[1] = "newsletterJid_";
                A1Z[2] = "newsletterName_";
                A1Z[3] = "jpegThumbnail_";
                A1Z[4] = "caption_";
                A1Z[5] = "inviteExpiration_";
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ည\u0002\u0004ဈ\u0003\u0005ဂ\u0004", A1Z);
            case 3:
                return new AnonymousClass1DD();
            case 4:
                return new AnonymousClass175();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (AnonymousClass1DD.class) {
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
