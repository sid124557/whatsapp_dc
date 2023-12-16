package X;

import android.content.Intent;
import android.content.res.Resources;

/* renamed from: X.5Ql  reason: invalid class name and case insensitive filesystem */
public class C104305Ql {
    public int A00;
    public int A01 = 1;
    public Integer A02;
    public Integer A03;
    public boolean A04;
    public final int A05;
    public final int A06;
    public final Intent A07;

    public C108905dk A00() {
        C108905dk r1 = new C108905dk(this.A06, this.A05, this.A07);
        r1.A04 = this.A04;
        r1.A01 = this.A01;
        r1.A00 = this.A00;
        r1.A02 = this.A02;
        r1.A03 = this.A03;
        return r1;
    }

    public C104305Ql(int i, int i2, Intent intent) {
        this.A07 = intent;
        this.A06 = i;
        this.A05 = i2;
    }

    public void A01(Resources resources, int i) {
        this.A02 = Integer.valueOf(resources.getColor(i));
    }
}
