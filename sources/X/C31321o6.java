package X;

/* renamed from: X.1o6  reason: invalid class name and case insensitive filesystem */
public final class C31321o6 extends C30341mI {
    public int A00;
    public String A01;
    public boolean A02;

    public C31321o6(AnonymousClass2z0 r2, long j) {
        super(r2, 70, j);
    }

    public void A1Z(String str) {
        String[] A1b = C18320x8.A1b(str);
        for (int i = 0; i < A1b.length; i++) {
            String str2 = A1b[i];
            if (i == 0) {
                this.A01 = str2;
            } else if (i != 1) {
                C18260x0.A0x("FMessageSystemLinkedGroupCallStart/setData index out of bounds: ", AnonymousClass001.A0o(), i);
                return;
            } else {
                this.A00 = Integer.parseInt(str2);
            }
        }
    }
}
