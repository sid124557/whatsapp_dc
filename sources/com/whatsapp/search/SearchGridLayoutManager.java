package com.whatsapp.search;

import X.AnonymousClass0Q1;
import X.AnonymousClass0R6;
import X.C04870Qz;
import X.C1231167e;
import android.content.Context;
import androidx.recyclerview.widget.GridLayoutManager;
import com.whatsapp.util.Log;

public class SearchGridLayoutManager extends GridLayoutManager {
    public final AnonymousClass0R6 A00;

    public SearchGridLayoutManager(Context context, AnonymousClass0R6 r4) {
        super(6);
        this.A00 = r4;
        this.A01 = new C1231167e(context, 1, this);
    }

    public void A0v(C04870Qz r2, AnonymousClass0Q1 r3) {
        try {
            super.A0v(r2, r3);
        } catch (IndexOutOfBoundsException e) {
            Log.e((Throwable) e);
        }
    }
}
