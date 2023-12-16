package X;

/* renamed from: X.0eI  reason: invalid class name and case insensitive filesystem */
public class C08340eI implements C15930sC {
    public boolean A00 = true;
    public final /* synthetic */ AnonymousClass08J A01;

    public C08340eI(AnonymousClass08J r2) {
        this.A01 = r2;
    }

    public void BOf(Object obj) {
        AnonymousClass08J r2 = this.A01;
        Object A07 = r2.A07();
        if (!this.A00) {
            if (A07 == null) {
                if (obj == null) {
                    return;
                }
            } else if (A07.equals(obj)) {
                return;
            }
        }
        this.A00 = false;
        r2.A0H(obj);
    }
}
