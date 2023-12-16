package X;

/* renamed from: X.2YW  reason: invalid class name */
public final class AnonymousClass2YW {
    public final C56612sH A00;
    public final C50872iu A01;

    public boolean A00(String str, long j) {
        C162457s7.A0J(str, 0);
        C50872iu r3 = this.A01;
        String A002 = r3.A00(AnonymousClass000.A0X("_timestamp", AnonymousClass000.A0l(str)));
        if (A002 != null) {
            long parseLong = Long.parseLong(A002);
            if (Long.valueOf(parseLong) != null && (parseLong == -1 || this.A00.A0D() - parseLong <= j)) {
                return true;
            }
        }
        r3.A01(AnonymousClass000.A0T(str, "_timestamp"));
        r3.A01(AnonymousClass000.A0X("_data", AnonymousClass000.A0l(str)));
        return false;
    }

    public AnonymousClass2YW(C56612sH r1, C50872iu r2) {
        C18260x0.A0Q(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }
}
