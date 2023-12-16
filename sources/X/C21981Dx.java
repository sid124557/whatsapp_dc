package X;

/* renamed from: X.1Dx  reason: invalid class name and case insensitive filesystem */
public final class C21981Dx extends C130786cX implements C181378mf {
    public static final int CHUNK_ORDER_FIELD_NUMBER = 7;
    public static final C21981Dx DEFAULT_INSTANCE;
    public static final int DIRECT_PATH_FIELD_NUMBER = 5;
    public static final int FILE_ENC_SHA256_FIELD_NUMBER = 4;
    public static final int FILE_LENGTH_FIELD_NUMBER = 2;
    public static final int FILE_SHA256_FIELD_NUMBER = 1;
    public static final int INITIAL_HIST_BOOTSTRAP_INLINE_PAYLOAD_FIELD_NUMBER = 11;
    public static final int MEDIA_KEY_FIELD_NUMBER = 3;
    public static final int OLDEST_MSG_IN_CHUNK_TIMESTAMP_SEC_FIELD_NUMBER = 10;
    public static final int ORIGINAL_MESSAGE_ID_FIELD_NUMBER = 8;
    public static volatile C178978iP PARSER = null;
    public static final int PEER_DATA_REQUEST_SESSION_ID_FIELD_NUMBER = 12;
    public static final int PROGRESS_FIELD_NUMBER = 9;
    public static final int SYNC_TYPE_FIELD_NUMBER = 6;
    public int bitField0_;
    public int chunkOrder_;
    public String directPath_ = "";
    public C172548Lq fileEncSha256_;
    public long fileLength_;
    public C172548Lq fileSha256_;
    public C172548Lq initialHistBootstrapInlinePayload_;
    public C172548Lq mediaKey_;
    public long oldestMsgInChunkTimestampSec_;
    public String originalMessageId_ = "";
    public String peerDataRequestSessionId_;
    public int progress_;
    public int syncType_;

    static {
        C21981Dx r1 = new C21981Dx();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, C21981Dx.class);
    }

    public C21981Dx() {
        C172548Lq r1 = C172548Lq.A01;
        this.fileSha256_ = r1;
        this.mediaKey_ = r1;
        this.fileEncSha256_ = r1;
        this.initialHistBootstrapInlinePayload_ = r1;
        this.peerDataRequestSessionId_ = "";
    }

    public final Object A0J(C141056ux r4, Object obj, Object obj2) {
        C178978iP r0;
        switch (r4.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] objArr = new Object[14];
                AnonymousClass0x2.A1R(objArr);
                objArr[1] = "fileSha256_";
                objArr[2] = "fileLength_";
                objArr[3] = "mediaKey_";
                objArr[4] = "fileEncSha256_";
                objArr[5] = "directPath_";
                objArr[6] = "syncType_";
                objArr[7] = AnonymousClass3BT.A00;
                objArr[8] = "chunkOrder_";
                objArr[9] = "originalMessageId_";
                objArr[10] = "progress_";
                objArr[11] = "oldestMsgInChunkTimestampSec_";
                objArr[12] = "initialHistBootstrapInlinePayload_";
                objArr[13] = "peerDataRequestSessionId_";
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0000\u0000\u0001ည\u0000\u0002ဃ\u0001\u0003ည\u0002\u0004ည\u0003\u0005ဈ\u0004\u0006ဌ\u0005\u0007ဋ\u0006\bဈ\u0007\tဋ\b\nဂ\t\u000bည\n\fဈ\u000b", objArr);
            case 3:
                return new C21981Dx();
            case 4:
                return new C199916g();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (C21981Dx.class) {
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
