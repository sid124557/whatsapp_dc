package com.whatsapp.collections;

import X.AnonymousClass0Q1;
import X.C04870Qz;
import X.C162457s7;
import android.content.Context;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public final class AutoFitGridLayoutManager extends GridLayoutManager {
    public int A00;
    public boolean A01 = true;
    public final Context A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AutoFitGridLayoutManager(Context context, int i) {
        super(1);
        C162457s7.A0J(context, 1);
        this.A02 = context;
        this.A00 = i;
        if (i > 0 && i != i) {
            this.A00 = i;
            this.A01 = true;
        }
    }

    public void A10(RecyclerView recyclerView) {
        this.A01 = true;
    }

    public void A0v(C04870Qz r6, AnonymousClass0Q1 r7) {
        int i;
        int i2;
        int A0D;
        int A0A;
        if (this.A01 && (i = this.A00) > 0 && (i2 = this.A03) > 0 && r7 != null && !r7.A09) {
            if (this.A01 == 1) {
                A0D = i2 - A0C();
                A0A = A0B();
            } else {
                A0D = this.A00 - A0D();
                A0A = A0A();
            }
            A1o(Math.max(1, (A0D - A0A) / i));
            this.A01 = false;
        }
        super.A0v(r6, r7);
    }
}
