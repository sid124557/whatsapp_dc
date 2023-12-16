package X;

import android.view.View;

/* renamed from: X.9p5  reason: invalid class name and case insensitive filesystem */
public class C204269p5 implements View.OnClickListener {
    public int A00;
    public Object A01;
    public final int A02;

    public C204269p5(AnonymousClass9QL r1, int i, int i2) {
        this.A02 = i2;
        this.A01 = r1;
        this.A00 = i;
    }

    public final void onClick(View view) {
        int i = this.A02;
        AnonymousClass9QL r0 = (AnonymousClass9QL) this.A01;
        if (i != 0) {
            r0.A0A.BPj(r0.A08, this.A00);
            return;
        }
        r0.A0A.Ba7(this.A00);
    }
}
