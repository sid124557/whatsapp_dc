package X;

/* renamed from: X.21z  reason: invalid class name and case insensitive filesystem */
public enum C373721z {
    REFERRAL("referral"),
    SESSION_ID("session_id"),
    ADDITIONAL_PARAMS("additional_params"),
    RESUMABLE_DATA(C373621y.RESUMABLE_DATA.key),
    EXTENSIONS_CONTEXT("extensions_context"),
    EXTENSIONS_MERGE_MODE("merge_mode"),
    EXTENSIONS_BACK_NAV_CONTEXT("back_nav_context"),
    EXTENSIONS_IS_RESUMED("is_resumed_from_phoenix_session"),
    EXTENSIONS_IS_BACK_TRIGGERED("is_back_triggered");
    
    public final String key;

    /* access modifiers changed from: public */
    static {
        C373721z[] r1;
        A00 = C73653fr.A00(r1);
    }

    /* access modifiers changed from: public */
    C373721z(String str) {
        this.key = str;
    }
}
