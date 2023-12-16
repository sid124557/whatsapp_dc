package X;

/* renamed from: X.06r  reason: invalid class name and case insensitive filesystem */
public class C007806r extends AnonymousClass0GQ {
    public final String type;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C007806r(String str, CharSequence charSequence) {
        super(str, charSequence);
        C162457s7.A0J(str, 1);
        this.type = str;
        if (str.length() <= 0) {
            throw AnonymousClass001.A0c("type must not be empty");
        }
    }
}
