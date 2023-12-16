package X;

/* renamed from: X.1Cq  reason: invalid class name and case insensitive filesystem */
public final class C21651Cq extends C130786cX implements C181378mf {
    public static final C21651Cq DEFAULT_INSTANCE;
    public static final int DOWNLOAD_AUDIO_FIELD_NUMBER = 2;
    public static final int DOWNLOAD_DOCUMENTS_FIELD_NUMBER = 4;
    public static final int DOWNLOAD_IMAGES_FIELD_NUMBER = 1;
    public static final int DOWNLOAD_VIDEO_FIELD_NUMBER = 3;
    public static volatile C178978iP PARSER;
    public int bitField0_;
    public boolean downloadAudio_;
    public boolean downloadDocuments_;
    public boolean downloadImages_;
    public boolean downloadVideo_;

    static {
        C21651Cq r1 = new C21651Cq();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, C21651Cq.class);
    }

    public final Object A0J(C141056ux r4, Object obj, Object obj2) {
        C178978iP r0;
        switch (r4.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1Y = C18270x1.A1Y();
                A1Y[1] = "downloadImages_";
                A1Y[2] = "downloadAudio_";
                A1Y[3] = "downloadVideo_";
                A1Y[4] = "downloadDocuments_";
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003", A1Y);
            case 3:
                return new C21651Cq();
            case 4:
                return new C202517g();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (C21651Cq.class) {
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
