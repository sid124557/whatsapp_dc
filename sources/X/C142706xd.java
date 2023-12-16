package X;

/* renamed from: X.6xd  reason: invalid class name and case insensitive filesystem */
public enum C142706xd {
    FACEBOOK("com.facebook.auth.login", "com.facebook.katana", 0),
    FACEBOOK_DEBUG("com.facebook.auth.login", "com.facebook.wakizashi", 1),
    FACEBOOK_LITE("com.facebook.lite", "com.facebook.lite", 2),
    INSTAGRAM("www.instagram.com", "com.instagram.android", 3),
    MLITE("com.facebook.mlite", "com.facebook.mlite", 4),
    MESSENGER("com.facebook.messenger", "com.facebook.orca", 5);
    
    public final String mAccountManagerType;
    public final String mPackageName;
    public final String mPrefPrefix;

    /* access modifiers changed from: public */
    C142706xd(String str, String str2, int i) {
        this.mPrefPrefix = r2;
        this.mAccountManagerType = str;
        this.mPackageName = str2;
    }
}
