package X;

/* renamed from: X.7T6  reason: invalid class name */
public class AnonymousClass7T6 {
    public final /* synthetic */ AnonymousClass7SL A00;
    public final /* synthetic */ C59682xJ A01;
    public final /* synthetic */ byte[][] A02;

    public AnonymousClass7T6(AnonymousClass7SL r1, C59682xJ r2, byte[][] bArr) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = bArr;
    }

    public void A00(String str, String str2, int i) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("keytransparencymanager/serializedlookup IQ with id: ");
        A0o.append(str);
        A0o.append(" received error code: ");
        A0o.append(i);
        C18260x0.A0r(" and error text: ", str2, A0o);
        this.A00.A00(i);
    }
}
