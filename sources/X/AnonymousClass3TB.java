package X;

/* renamed from: X.3TB  reason: invalid class name */
public final class AnonymousClass3TB implements AnonymousClass4EZ {
    public final int A00;
    public final int A01;
    public final long A02;
    public final long A03;
    public final C56612sH A04;
    public final AnonymousClass4EZ A05;
    public final AnonymousClass36K A06;
    public final /* synthetic */ AnonymousClass31C A07;

    public void BQs(String str) {
        String str2 = str;
        C162457s7.A0J(str, 0);
        long j = this.A03;
        long j2 = this.A02;
        C56612sH r3 = this.A04;
        long A032 = j - C56612sH.A03(r3, j2);
        int i = this.A00;
        if (i >= 3 || A032 <= 1000) {
            this.A07.A0B.markerAnnotate(154475307, str.hashCode(), "retry", i);
            this.A05.BQs(str);
            return;
        }
        AnonymousClass36K r5 = this.A06;
        this.A07.A0C(r3, this.A05, r5, str2, this.A01, i + 1, A032);
    }

    public AnonymousClass3TB(C56612sH r3, AnonymousClass31C r4, AnonymousClass4EZ r5, AnonymousClass36K r6, int i, int i2, long j) {
        this.A07 = r4;
        this.A04 = r3;
        this.A01 = i;
        this.A06 = r6;
        this.A05 = r5;
        this.A00 = i2;
        this.A03 = j;
        this.A02 = r3.A0H();
    }

    public void BSN(AnonymousClass36K r6, String str) {
        C18260x0.A0O(str, r6);
        this.A07.A0B.markerAnnotate(154475307, str.hashCode(), "retry", this.A00);
        this.A05.BSN(r6, str);
    }

    public void BdM(AnonymousClass36K r6, String str) {
        C18260x0.A0O(str, r6);
        this.A07.A0B.markerAnnotate(154475307, str.hashCode(), "retry", this.A00);
        this.A05.BdM(r6, str);
    }
}
