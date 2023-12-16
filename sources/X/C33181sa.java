package X;

import android.graphics.Bitmap;
import android.view.View;

/* renamed from: X.1sa  reason: invalid class name and case insensitive filesystem */
public class C33181sa extends C151987Xb {
    public final /* synthetic */ int A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ C624134x A02;
    public final /* synthetic */ C185528tp A03;
    public final /* synthetic */ C33141sV A04;
    public final /* synthetic */ Object A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;

    public C33181sa(View view, C624134x r2, C185528tp r3, C33141sV r4, Object obj, int i, boolean z, boolean z2, boolean z3) {
        this.A04 = r4;
        this.A02 = r2;
        this.A06 = z;
        this.A08 = z2;
        this.A00 = i;
        this.A01 = view;
        this.A03 = r3;
        this.A05 = obj;
        this.A07 = z3;
    }

    public Bitmap A00() {
        C624134x r4 = this.A02;
        boolean z = this.A06;
        boolean z2 = this.A08;
        return C33141sV.A01(r4, C33141sV.A03(r4), this.A00, z, z2);
    }

    public void A01() {
        C33141sV r10 = this.A04;
        C624134x r2 = this.A02;
        View view = this.A01;
        C185528tp r4 = this.A03;
        Object obj = this.A05;
        r10.A05.A01(view, r2, new AnonymousClass7O7(view, r2, r4, r10, obj), r4, obj, this.A07);
    }

    public void A02(Bitmap bitmap) {
        int BD5 = (int) (((float) this.A03.BD5()) / this.A01.getResources().getDisplayMetrics().density);
        if (BD5 > bitmap.getWidth() || BD5 == 0) {
            A01();
        }
    }
}
