package X;

/* renamed from: X.1Dh  reason: invalid class name and case insensitive filesystem */
public final class C21821Dh extends C130786cX implements C181378mf {
    public static final int CAPTION_FIELD_NUMBER = 6;
    public static final int CONTEXT_INFO_FIELD_NUMBER = 7;
    public static final C21821Dh DEFAULT_INSTANCE;
    public static final int GROUP_JID_FIELD_NUMBER = 1;
    public static final int GROUP_NAME_FIELD_NUMBER = 4;
    public static final int GROUP_TYPE_FIELD_NUMBER = 8;
    public static final int INVITE_CODE_FIELD_NUMBER = 2;
    public static final int INVITE_EXPIRATION_FIELD_NUMBER = 3;
    public static final int JPEG_THUMBNAIL_FIELD_NUMBER = 5;
    public static volatile C178978iP PARSER;
    public int bitField0_;
    public String caption_ = "";
    public AnonymousClass1EF contextInfo_;
    public String groupJid_ = "";
    public String groupName_ = "";
    public int groupType_;
    public String inviteCode_ = "";
    public long inviteExpiration_;
    public C172548Lq jpegThumbnail_ = C172548Lq.A01;

    static {
        C21821Dh r1 = new C21821Dh();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, C21821Dh.class);
    }

    public final Object A0J(C141056ux r4, Object obj, Object obj2) {
        C178978iP r0;
        switch (r4.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] objArr = new Object[10];
                AnonymousClass0x2.A1R(objArr);
                objArr[1] = "groupJid_";
                objArr[2] = "inviteCode_";
                objArr[3] = "inviteExpiration_";
                objArr[4] = "groupName_";
                objArr[5] = "jpegThumbnail_";
                objArr[6] = "caption_";
                objArr[7] = "contextInfo_";
                objArr[8] = "groupType_";
                objArr[9] = AnonymousClass3BS.A00;
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဈ\u0003\u0005ည\u0004\u0006ဈ\u0005\u0007ဉ\u0006\bဌ\u0007", objArr);
            case 3:
                return new C21821Dh();
            case 4:
                return new C199516c();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (C21821Dh.class) {
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
