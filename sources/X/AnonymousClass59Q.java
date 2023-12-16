package X;

/* renamed from: X.59Q  reason: invalid class name */
public enum AnonymousClass59Q {
    HIDE(false, false),
    SHOW_APP_EXIST(true, true),
    SHOW_APP_EXIST_XPOST_DISABLED(true, false);
    
    public final boolean isEnabled;
    public final boolean isVisible;

    /* access modifiers changed from: public */
    static {
        AnonymousClass59Q[] r0;
        A00 = C73653fr.A00(r0);
    }

    /* access modifiers changed from: public */
    AnonymousClass59Q(boolean z, boolean z2) {
        this.isVisible = z;
        this.isEnabled = z2;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("visible: ");
        A0o.append(this.isVisible);
        A0o.append(" enabled: ");
        return C18300x5.A0m(A0o, this.isEnabled);
    }
}
