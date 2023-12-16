package X;

/* renamed from: X.1DF  reason: invalid class name */
public final class AnonymousClass1DF extends C130786cX implements C181378mf {
    public static final AnonymousClass1DF DEFAULT_INSTANCE;
    public static final int HISTORY_SYNC_ON_DEMAND_REQUEST_FIELD_NUMBER = 4;
    public static volatile C178978iP PARSER = null;
    public static final int PEER_DATA_OPERATION_REQUEST_TYPE_FIELD_NUMBER = 1;
    public static final int PLACEHOLDER_MESSAGE_RESEND_REQUEST_FIELD_NUMBER = 5;
    public static final int REQUEST_STICKER_REUPLOAD_FIELD_NUMBER = 2;
    public static final int REQUEST_URL_PREVIEW_FIELD_NUMBER = 3;
    public int bitField0_;
    public AnonymousClass1DE historySyncOnDemandRequest_;
    public int peerDataOperationRequestType_;
    public C188248ya placeholderMessageResendRequest_;
    public C188248ya requestStickerReupload_;
    public C188248ya requestUrlPreview_;

    static {
        AnonymousClass1DF r1 = new AnonymousClass1DF();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, AnonymousClass1DF.class);
    }

    public AnonymousClass1DF() {
        C130236bd r0 = C130236bd.A02;
        this.requestStickerReupload_ = r0;
        this.requestUrlPreview_ = r0;
        this.placeholderMessageResendRequest_ = r0;
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
                objArr[1] = "peerDataOperationRequestType_";
                objArr[2] = C63833Bb.A00;
                objArr[3] = "requestStickerReupload_";
                objArr[4] = AnonymousClass1AS.class;
                objArr[5] = "requestUrlPreview_";
                objArr[6] = AnonymousClass1BN.class;
                objArr[7] = "historySyncOnDemandRequest_";
                objArr[8] = "placeholderMessageResendRequest_";
                objArr[9] = AnonymousClass1AR.class;
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0003\u0000\u0001ဌ\u0000\u0002\u001b\u0003\u001b\u0004ဉ\u0001\u0005\u001b", objArr);
            case 3:
                return new AnonymousClass1DF();
            case 4:
                return new AnonymousClass178();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (AnonymousClass1DF.class) {
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
