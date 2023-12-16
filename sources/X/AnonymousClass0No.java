package X;

import androidx.viewpager2.widget.ViewPager2;

/* renamed from: X.0No  reason: invalid class name */
public class AnonymousClass0No {
    public long A00 = -1;
    public C17280vG A01;
    public C04640Qa A02;
    public C04590Ow A03;
    public ViewPager2 A04;
    public final /* synthetic */ AnonymousClass09I A05;

    public AnonymousClass0No(AnonymousClass09I r3) {
        this.A05 = r3;
    }

    public void A00(boolean z) {
        int i;
        C08310eF r0;
        AnonymousClass09I r2 = this.A05;
        C08270df r6 = r2.A06;
        if (!r6.A0t() && this.A04.A0D.A02 == 0) {
            C10550i7 r7 = r2.A03;
            if (r7.A01() != 0 && r2.A0G() != 0 && (i = this.A04.A00) < r2.A0G()) {
                long j = (long) i;
                if ((j != this.A00 || z) && (r0 = (C08310eF) C10550i7.A00(r7, j)) != null && r0.A16()) {
                    this.A00 = j;
                    C08240dc r5 = new C08240dc(r6);
                    C08310eF r62 = null;
                    for (int i2 = 0; i2 < r7.A01(); i2++) {
                        long A022 = r7.A02(i2);
                        C08310eF r3 = (C08310eF) r7.A04(i2);
                        if (r3.A16()) {
                            if (A022 != this.A00) {
                                r5.A0B(r3, AnonymousClass0GC.STARTED);
                            } else {
                                r62 = r3;
                            }
                            r3.A14(AnonymousClass000.A1T((A022 > this.A00 ? 1 : (A022 == this.A00 ? 0 : -1))));
                        }
                    }
                    if (r62 != null) {
                        r5.A0B(r62, AnonymousClass0GC.RESUMED);
                    }
                    if (!r5.A0B.isEmpty()) {
                        r5.A03();
                    }
                }
            }
        }
    }
}
