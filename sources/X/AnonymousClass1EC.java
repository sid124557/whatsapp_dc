package X;

/* renamed from: X.1EC  reason: invalid class name */
public final class AnonymousClass1EC extends C130786cX implements C181378mf {
    public static final int BACKGROUND_ARGB_FIELD_NUMBER = 8;
    public static final int CANONICAL_URL_FIELD_NUMBER = 4;
    public static final int CONTEXT_INFO_FIELD_NUMBER = 17;
    public static final AnonymousClass1EC DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 5;
    public static final int DONOTPLAYINLINE_FIELD_NUMBER = 18;
    public static final int FONT_FIELD_NUMBER = 9;
    public static final int INVITE_LINK_GROUP_TYPE_FIELD_NUMBER = 26;
    public static final int INVITE_LINK_GROUP_TYPE_V2_FIELD_NUMBER = 29;
    public static final int INVITE_LINK_PARENT_GROUP_SUBJECT_V2_FIELD_NUMBER = 27;
    public static final int INVITE_LINK_PARENT_GROUP_THUMBNAIL_V2_FIELD_NUMBER = 28;
    public static final int JPEG_THUMBNAIL_FIELD_NUMBER = 16;
    public static final int MATCHED_TEXT_FIELD_NUMBER = 2;
    public static final int MEDIA_KEY_FIELD_NUMBER = 22;
    public static final int MEDIA_KEY_TIMESTAMP_FIELD_NUMBER = 23;
    public static volatile C178978iP PARSER = null;
    public static final int PREVIEW_TYPE_FIELD_NUMBER = 10;
    public static final int TEXT_ARGB_FIELD_NUMBER = 7;
    public static final int TEXT_FIELD_NUMBER = 1;
    public static final int THUMBNAIL_DIRECT_PATH_FIELD_NUMBER = 19;
    public static final int THUMBNAIL_ENC_SHA256_FIELD_NUMBER = 21;
    public static final int THUMBNAIL_HEIGHT_FIELD_NUMBER = 24;
    public static final int THUMBNAIL_SHA256_FIELD_NUMBER = 20;
    public static final int THUMBNAIL_WIDTH_FIELD_NUMBER = 25;
    public static final int TITLE_FIELD_NUMBER = 6;
    public static final int VIEW_ONCE_FIELD_NUMBER = 30;
    public int backgroundArgb_;
    public int bitField0_;
    public String canonicalUrl_ = "";
    public AnonymousClass1EF contextInfo_;
    public String description_ = "";
    public boolean doNotPlayInline_;
    public int font_;
    public int inviteLinkGroupTypeV2_;
    public int inviteLinkGroupType_;
    public String inviteLinkParentGroupSubjectV2_;
    public C172548Lq inviteLinkParentGroupThumbnailV2_;
    public C172548Lq jpegThumbnail_;
    public String matchedText_ = "";
    public long mediaKeyTimestamp_;
    public C172548Lq mediaKey_;
    public int previewType_;
    public int textArgb_;
    public String text_ = "";
    public String thumbnailDirectPath_;
    public C172548Lq thumbnailEncSha256_;
    public int thumbnailHeight_;
    public C172548Lq thumbnailSha256_;
    public int thumbnailWidth_;
    public String title_ = "";
    public boolean viewOnce_;

    static {
        AnonymousClass1EC r1 = new AnonymousClass1EC();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, AnonymousClass1EC.class);
    }

    public AnonymousClass1EC() {
        C172548Lq r0 = C172548Lq.A01;
        this.jpegThumbnail_ = r0;
        this.thumbnailDirectPath_ = "";
        this.thumbnailSha256_ = r0;
        this.thumbnailEncSha256_ = r0;
        this.mediaKey_ = r0;
        this.inviteLinkParentGroupSubjectV2_ = "";
        this.inviteLinkParentGroupThumbnailV2_ = r0;
    }

    public final Object A0J(C141056ux r5, Object obj, Object obj2) {
        C178978iP r0;
        switch (r5.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] objArr = new Object[29];
                AnonymousClass0x2.A1R(objArr);
                objArr[1] = "text_";
                objArr[2] = "matchedText_";
                objArr[3] = "canonicalUrl_";
                objArr[4] = "description_";
                objArr[5] = "title_";
                objArr[6] = "textArgb_";
                objArr[7] = "backgroundArgb_";
                objArr[8] = "font_";
                objArr[9] = AnonymousClass3BP.A00;
                objArr[10] = "previewType_";
                objArr[11] = AnonymousClass3BR.A00;
                objArr[12] = "jpegThumbnail_";
                objArr[13] = "contextInfo_";
                objArr[14] = "doNotPlayInline_";
                objArr[15] = "thumbnailDirectPath_";
                objArr[16] = "thumbnailSha256_";
                objArr[17] = "thumbnailEncSha256_";
                objArr[18] = "mediaKey_";
                objArr[19] = "mediaKeyTimestamp_";
                objArr[20] = "thumbnailHeight_";
                objArr[21] = "thumbnailWidth_";
                objArr[22] = "inviteLinkGroupType_";
                C181368me r2 = AnonymousClass3BQ.A00;
                objArr[23] = r2;
                objArr[24] = "inviteLinkParentGroupSubjectV2_";
                objArr[25] = "inviteLinkParentGroupThumbnailV2_";
                objArr[26] = "inviteLinkGroupTypeV2_";
                objArr[27] = r2;
                objArr[28] = "viewOnce_";
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\u0018\u0000\u0001\u0001\u001e\u0018\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0004ဈ\u0002\u0005ဈ\u0003\u0006ဈ\u0004\u0007ဆ\u0005\bဆ\u0006\tဌ\u0007\nဌ\b\u0010ည\t\u0011ဉ\n\u0012ဇ\u000b\u0013ဈ\f\u0014ည\r\u0015ည\u000e\u0016ည\u000f\u0017ဂ\u0010\u0018ဋ\u0011\u0019ဋ\u0012\u001aဌ\u0013\u001bဈ\u0014\u001cည\u0015\u001dဌ\u0016\u001eဇ\u0017", objArr);
            case 3:
                return new AnonymousClass1EC();
            case 4:
                return new C207119a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (AnonymousClass1EC.class) {
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
