package X;

/* renamed from: X.1E8  reason: invalid class name */
public final class AnonymousClass1E8 extends C130786cX implements C181378mf {
    public static final int AUTO_DOWNLOAD_CELLULAR_FIELD_NUMBER = 5;
    public static final int AUTO_DOWNLOAD_ROAMING_FIELD_NUMBER = 6;
    public static final int AUTO_DOWNLOAD_WIFI_FIELD_NUMBER = 4;
    public static final int AUTO_UNARCHIVE_CHATS_FIELD_NUMBER = 14;
    public static final int AVATAR_USER_SETTINGS_FIELD_NUMBER = 11;
    public static final int DARK_THEME_WALLPAPER_FIELD_NUMBER = 3;
    public static final AnonymousClass1E8 DEFAULT_INSTANCE;
    public static final int DISAPPEARING_MODE_DURATION_FIELD_NUMBER = 9;
    public static final int DISAPPEARING_MODE_TIMESTAMP_FIELD_NUMBER = 10;
    public static final int FONT_SIZE_FIELD_NUMBER = 12;
    public static final int GROUPNOTIFICATIONSETTINGS_FIELD_NUMBER = 18;
    public static final int INDIVIDUALNOTIFICATIONSETTINGS_FIELD_NUMBER = 17;
    public static final int LIGHT_THEME_WALLPAPER_FIELD_NUMBER = 1;
    public static final int MEDIA_VISIBILITY_FIELD_NUMBER = 2;
    public static volatile C178978iP PARSER = null;
    public static final int PHOTO_QUALITY_MODE_FIELD_NUMBER = 16;
    public static final int SECURITY_NOTIFICATIONS_FIELD_NUMBER = 13;
    public static final int SHOW_GROUP_NOTIFICATIONS_PREVIEW_FIELD_NUMBER = 8;
    public static final int SHOW_INDIVIDUAL_NOTIFICATIONS_PREVIEW_FIELD_NUMBER = 7;
    public static final int VIDEO_QUALITY_MODE_FIELD_NUMBER = 15;
    public C21651Cq autoDownloadCellular_;
    public C21651Cq autoDownloadRoaming_;
    public C21651Cq autoDownloadWiFi_;
    public boolean autoUnarchiveChats_;
    public AnonymousClass1BU avatarUserSettings_;
    public int bitField0_;
    public AnonymousClass1BX darkThemeWallpaper_;
    public int disappearingModeDuration_;
    public long disappearingModeTimestamp_;
    public int fontSize_;
    public AnonymousClass1DV groupNotificationSettings_;
    public AnonymousClass1DV individualNotificationSettings_;
    public AnonymousClass1BX lightThemeWallpaper_;
    public int mediaVisibility_;
    public int photoQualityMode_;
    public boolean securityNotifications_;
    public boolean showGroupNotificationsPreview_;
    public boolean showIndividualNotificationsPreview_;
    public int videoQualityMode_;

    static {
        AnonymousClass1E8 r1 = new AnonymousClass1E8();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, AnonymousClass1E8.class);
    }

    public final Object A0J(C141056ux r4, Object obj, Object obj2) {
        C178978iP r0;
        switch (r4.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] objArr = new Object[20];
                AnonymousClass0x2.A1R(objArr);
                objArr[1] = "lightThemeWallpaper_";
                objArr[2] = "mediaVisibility_";
                objArr[3] = C63943Bm.A00;
                objArr[4] = "darkThemeWallpaper_";
                objArr[5] = "autoDownloadWiFi_";
                objArr[6] = "autoDownloadCellular_";
                objArr[7] = "autoDownloadRoaming_";
                objArr[8] = "showIndividualNotificationsPreview_";
                objArr[9] = "showGroupNotificationsPreview_";
                objArr[10] = "disappearingModeDuration_";
                objArr[11] = "disappearingModeTimestamp_";
                objArr[12] = "avatarUserSettings_";
                objArr[13] = "fontSize_";
                objArr[14] = "securityNotifications_";
                objArr[15] = "autoUnarchiveChats_";
                objArr[16] = "videoQualityMode_";
                objArr[17] = "photoQualityMode_";
                objArr[18] = "individualNotificationSettings_";
                objArr[19] = "groupNotificationSettings_";
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\u0012\u0000\u0001\u0001\u0012\u0012\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဇ\u0006\bဇ\u0007\tင\b\nဂ\t\u000bဉ\n\fင\u000b\rဇ\f\u000eဇ\r\u000fင\u000e\u0010င\u000f\u0011ဉ\u0010\u0012ဉ\u0011", objArr);
            case 3:
                return new AnonymousClass1E8();
            case 4:
                return new C202717i();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (AnonymousClass1E8.class) {
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
