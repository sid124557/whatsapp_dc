package X;

/* renamed from: X.06j  reason: invalid class name and case insensitive filesystem */
public class C007006j extends AnonymousClass0GP {
    public final String type;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C007006j(String str, CharSequence charSequence) {
        super(str, charSequence);
        C162457s7.A0J(str, 1);
        this.type = str;
        if (str.length() <= 0) {
            throw AnonymousClass001.A0c("type must not be empty");
        }
    }
}
