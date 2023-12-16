package X;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bloks.stdlib.components.bkcomponentscollection.StickyHeadersLinearLayoutManager;

/* renamed from: X.0Ct  reason: invalid class name and case insensitive filesystem */
public final class C01930Ct extends C152007Xe {
    public final boolean A00;
    public final boolean A01;

    public C06440Xs A01(Context context) {
        LinearLayoutManager linearLayoutManager;
        C162457s7.A0J(context, 0);
        boolean z = this.A00;
        int A002 = A00();
        if (z) {
            linearLayoutManager = new StickyHeadersLinearLayoutManager(A002);
        } else {
            linearLayoutManager = new LinearLayoutManager(A002);
        }
        linearLayoutManager.A1i(this.A01);
        return linearLayoutManager;
    }

    public boolean A02(C152007Xe r4) {
        C162457s7.A0J(r4, 0);
        if (r4 instanceof C01930Ct) {
            C01930Ct r42 = (C01930Ct) r4;
            if (A00() == r42.A00() && this.A01 == r42.A01 && this.A00 == r42.A00) {
                return true;
            }
            return false;
        }
        return false;
    }

    public C01930Ct(int i, boolean z, boolean z2) {
        super(i);
        this.A01 = z;
        this.A00 = z2;
    }
}
