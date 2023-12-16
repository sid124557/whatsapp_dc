package X;

/* renamed from: X.206  reason: invalid class name */
public enum AnonymousClass206 {
    QUICK_REPLY_BUTTON(1),
    URL_BUTTON(2),
    CALL_BUTTON(3),
    HYDRATEDBUTTON_NOT_SET(0);
    
    public final int value;

    /* access modifiers changed from: public */
    static {
        QUICK_REPLY_BUTTON = new AnonymousClass206("QUICK_REPLY_BUTTON", 0, 1);
        URL_BUTTON = new AnonymousClass206("URL_BUTTON", 1, 2);
        CALL_BUTTON = new AnonymousClass206("CALL_BUTTON", 2, 3);
        HYDRATEDBUTTON_NOT_SET = new AnonymousClass206("HYDRATEDBUTTON_NOT_SET", 3, 0);
    }

    /* access modifiers changed from: public */
    AnonymousClass206(int i) {
        this.value = i;
    }
}
