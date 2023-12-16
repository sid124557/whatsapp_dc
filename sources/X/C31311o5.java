package X;

/* renamed from: X.1o5  reason: invalid class name and case insensitive filesystem */
public class C31311o5 extends C30341mI {
    public long A00;
    public long A01;
    public String A02 = "";

    public C31311o5(AnonymousClass2z0 r2, long j) {
        super(r2, 117, j);
    }

    public void A1Z(String str) {
        String[] A1b = C18320x8.A1b(str);
        for (int i = 0; i < A1b.length; i++) {
            String str2 = A1b[i];
            if (i == 0) {
                this.A01 = Long.parseLong(str2);
            } else if (i == 1) {
                this.A00 = Long.parseLong(str2);
            } else if (i != 2) {
                C18260x0.A0x("FMessageSystemScheduledCallStart/setData index out of bounds: ", AnonymousClass001.A0o(), i);
                return;
            } else {
                this.A02 = str2;
            }
        }
    }
}
