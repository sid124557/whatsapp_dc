package X;

/* renamed from: X.06i  reason: invalid class name and case insensitive filesystem */
public final class C006906i extends AnonymousClass0GP {
    public final String type;

    public C006906i(String str, CharSequence charSequence) {
        super(str, charSequence);
        this.type = str;
        if (str.length() <= 0) {
            throw AnonymousClass001.A0c("type must not be empty");
        }
    }
}
