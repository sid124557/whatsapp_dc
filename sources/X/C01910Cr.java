package X;

import android.content.Context;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

/* renamed from: X.0Cr  reason: invalid class name and case insensitive filesystem */
public final class C01910Cr extends C152007Xe {
    public final int A00;

    public boolean A02(C152007Xe r4) {
        C162457s7.A0J(r4, 0);
        if (r4 instanceof C01910Cr) {
            C01910Cr r42 = (C01910Cr) r4;
            if (A00() == r42.A00() && this.A00 == r42.A00) {
                return true;
            }
            return false;
        }
        return false;
    }

    public C06440Xs A01(Context context) {
        return new StaggeredGridLayoutManager(this.A00, A00());
    }

    public C01910Cr(int i, int i2) {
        super(i);
        this.A00 = i2;
    }
}
