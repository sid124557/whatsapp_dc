package X;

import com.whatsapp.util.Log;

/* renamed from: X.3au  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C70693au implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ long A03;
    public final /* synthetic */ AnonymousClass2S3 A04;
    public final /* synthetic */ AnonymousClass3Eo A05;

    public final void run() {
        C51442jp A06;
        AnonymousClass3Eo r8 = this.A05;
        AnonymousClass2S3 r10 = this.A04;
        int i = this.A00;
        long j = this.A02;
        long j2 = this.A03;
        int i2 = this.A01;
        if (r10 == null || (A06 = r8.A02.A06(r10.A00, r10.A03)) == null) {
            Log.e("CompanionRegistrationLogger/no session id");
            return;
        }
        C25431aV r7 = new C25431aV();
        r7.A01 = Integer.valueOf(i);
        r7.A07 = A06.A01;
        r7.A06 = A06.A00;
        long A002 = C56612sH.A00(r8.A03);
        r7.A05 = Long.valueOf(A002);
        r7.A03 = C18310x6.A0f(A002, j);
        r7.A04 = Long.valueOf(j2);
        r7.A00 = r10.A02;
        r7.A02 = Integer.valueOf(i2);
        r8.A04.BhD(r7);
    }

    public /* synthetic */ C70693au(AnonymousClass2S3 r1, AnonymousClass3Eo r2, int i, int i2, long j, long j2) {
        this.A05 = r2;
        this.A04 = r1;
        this.A00 = i;
        this.A02 = j;
        this.A03 = j2;
        this.A01 = i2;
    }
}
