package X;

import com.whatsapp.util.Log;

/* renamed from: X.3aD  reason: invalid class name and case insensitive filesystem */
public class C70263aD implements Runnable {
    public int A00;
    public long A01;
    public Object A02;
    public final int A03;

    public C70263aD(Object obj, int i, int i2, long j) {
        this.A03 = i2;
        this.A02 = obj;
        this.A00 = i;
        this.A01 = j;
    }

    public final void run() {
        switch (this.A03) {
            case 0:
                return;
            case 1:
                ((AnonymousClass7GH) this.A02).A01.BfM(this.A01, this.A00);
                return;
            case 2:
                ((AnonymousClass7GH) this.A02).A01.BRh(this.A00, this.A01);
                return;
            case 3:
                AnonymousClass4IE r5 = (AnonymousClass4IE) this.A02;
                long j = this.A01;
                int i = this.A00;
                AnonymousClass5XL r1 = (AnonymousClass5XL) r5.A00;
                r1.A08.A0S(new C71733ca((Object) r1.A0I.A00(j), (Object) r5, i, 18));
                return;
            case 4:
                C46642by r6 = (C46642by) this.A02;
                int i2 = this.A00;
                long j2 = this.A01;
                AnonymousClass1ZW r7 = new AnonymousClass1ZW();
                r7.A00 = Integer.valueOf(i2);
                r7.A04 = r6.A01;
                long A002 = C56612sH.A00(r6.A03);
                r7.A03 = Long.valueOf(A002);
                r7.A01 = C18310x6.A0f(A002, r6.A00);
                r7.A02 = Long.valueOf(j2);
                r6.A04.BhD(r7);
                if (r6.A01 == null) {
                    Log.w("CompanionRegistrationLogger/logEvent MD session ID is null");
                }
                r6.A01 = null;
                r6.A00 = 0;
                return;
            default:
                C55112po r62 = (C55112po) this.A02;
                int i3 = this.A00;
                long j3 = this.A01;
                C25991bP A003 = r62.A00(0);
                A003.A03 = Integer.valueOf(i3);
                if (j3 != 0) {
                    A003.A0I = Long.valueOf(j3);
                }
                r62.A03(A003);
                return;
        }
    }
}
