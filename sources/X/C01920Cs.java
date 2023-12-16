package X;

import android.content.Context;
import androidx.recyclerview.widget.GridLayoutManager;

/* renamed from: X.0Cs  reason: invalid class name and case insensitive filesystem */
public final class C01920Cs extends C152007Xe {
    public final int A00;
    public final AnonymousClass0OM A01;

    public C06440Xs A01(Context context) {
        C162457s7.A0J(context, 0);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.A00, A00());
        gridLayoutManager.A01 = this.A01;
        return gridLayoutManager;
    }

    public boolean A02(C152007Xe r4) {
        C162457s7.A0J(r4, 0);
        if (r4 instanceof C01920Cs) {
            C01920Cs r42 = (C01920Cs) r4;
            if (A00() == r42.A00() && this.A00 == r42.A00) {
                return true;
            }
            return false;
        }
        return false;
    }

    public C01920Cs(AnonymousClass0OM r1, int i, int i2) {
        super(i);
        this.A00 = i2;
        this.A01 = r1;
    }
}
