package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;

/* renamed from: X.6ND  reason: invalid class name */
public class AnonymousClass6ND extends C161797qU implements C184838sd {
    public static C185318tS A0B = new AnonymousClass84P();
    public static C185318tS A0C = new AnonymousClass84Q();
    public static C185318tS A0D = new AnonymousClass84R();
    public static C185318tS A0E = new AnonymousClass84S();
    public int A00 = -1;
    public int A01 = 0;
    public int A02;
    public long A03;
    public Drawable A04;
    public Drawable A05;
    public View.OnClickListener A06;
    public AnonymousClass84O A07;
    public C147967Gk A08;
    public boolean A09 = true;
    public final C153427bI A0A;

    public AnonymousClass6ND(C153427bI r7, long j, boolean z) {
        super(C141236vF.VIEW);
        this.A03 = j;
        C157267i1[] r2 = {new C157267i1(A0B, this), new C157267i1(A0C, this), new C157267i1(A0E, this), new C157267i1(A0D, this)};
        int i = 0;
        do {
            A0L(r2[i]);
            i++;
        } while (i < 4);
        this.A02 = 0;
        this.A08 = new C147967Gk();
        this.A0A = r7;
        C157267i1[] r22 = {new C157267i1(new C1681484h(), this), new C157267i1(new C1681584i(), this)};
        int i2 = 0;
        do {
            A0L(r22[i2]);
            i2++;
        } while (i2 < 2);
        if (!z) {
            C157267i1.A00(new C1681984m(this), this);
        }
    }

    public /* bridge */ /* synthetic */ Object B0R(Context context) {
        return new AnonymousClass6N4(context);
    }

    public /* synthetic */ Class BBU() {
        return getClass();
    }
}
