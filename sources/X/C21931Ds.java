package X;

/* renamed from: X.1Ds  reason: invalid class name and case insensitive filesystem */
public final class C21931Ds extends C130786cX implements C181378mf {
    public static final C21931Ds DEFAULT_INSTANCE;
    public static final int FILE_LENGTH_FIELD_NUMBER = 2;
    public static final int HEIGHT_FIELD_NUMBER = 4;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int MEDIA_DATA_FIELD_NUMBER = 9;
    public static final int MIMETYPE_FIELD_NUMBER = 5;
    public static volatile C178978iP PARSER = null;
    public static final int PLACEHOLDER_ARGB_FIELD_NUMBER = 6;
    public static final int SUBTEXT_ARGB_FIELD_NUMBER = 8;
    public static final int TEXT_ARGB_FIELD_NUMBER = 7;
    public static final int TYPE_FIELD_NUMBER = 10;
    public static final int WIDTH_FIELD_NUMBER = 3;
    public int bitField0_;
    public long fileLength_;
    public int height_;
    public String id_ = "";
    public AnonymousClass1DI mediaData_;
    public String mimetype_ = "";
    public int placeholderArgb_;
    public int subtextArgb_;
    public int textArgb_;
    public int type_;
    public int width_;

    static {
        C21931Ds r1 = new C21931Ds();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, C21931Ds.class);
    }

    public final Object A0J(C141056ux r4, Object obj, Object obj2) {
        C178978iP r0;
        switch (r4.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] objArr = new Object[12];
                AnonymousClass0x2.A1R(objArr);
                objArr[1] = "id_";
                objArr[2] = "fileLength_";
                objArr[3] = "width_";
                objArr[4] = "height_";
                objArr[5] = "mimetype_";
                objArr[6] = "placeholderArgb_";
                objArr[7] = "textArgb_";
                objArr[8] = "subtextArgb_";
                objArr[9] = "mediaData_";
                objArr[10] = "type_";
                objArr[11] = C63893Bh.A00;
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဃ\u0001\u0003ဋ\u0002\u0004ဋ\u0003\u0005ဈ\u0004\u0006ဆ\u0005\u0007ဆ\u0006\bဆ\u0007\tဉ\b\nဌ\t", objArr);
            case 3:
                return new C21931Ds();
            case 4:
                return new AnonymousClass17X();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (C21931Ds.class) {
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
