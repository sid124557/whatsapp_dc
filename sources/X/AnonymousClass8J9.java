package X;

/* renamed from: X.8J9  reason: invalid class name */
public class AnonymousClass8J9 implements C185118t7 {
    public String A00;
    public String A01;
    public final long A02;
    public final C30591mh A03;
    public final boolean A04;

    public boolean B2b(C185118t7 r7) {
        if (r7 instanceof AnonymousClass8J9) {
            AnonymousClass8J9 r72 = (AnonymousClass8J9) r7;
            if (!C107575bX.A0G(this.A00, r72.A00) || !C107575bX.A0G(this.A01, r72.A01) || this.A02 != r72.A02) {
                return false;
            }
            return true;
        }
        return false;
    }

    public long BCM() {
        return this.A03.A1L;
    }

    public int BEN() {
        return 2;
    }

    public AnonymousClass8J9(C30591mh r1, String str, String str2, long j, boolean z) {
        this.A03 = r1;
        this.A00 = str;
        this.A01 = str2;
        this.A02 = j;
        this.A04 = z;
    }
}
