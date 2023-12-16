package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;

/* renamed from: X.0Cz  reason: invalid class name and case insensitive filesystem */
public class C01980Cz extends AnonymousClass6NB {
    public C203699oA A00;
    public final C16280sl A01;

    public /* bridge */ /* synthetic */ Object A0M(View view, C153427bI r3, AnonymousClass84O r4, Object obj) {
        return A0Q((FrameLayout) view, r3, r4);
    }

    public /* bridge */ /* synthetic */ void A0O(View view, C153427bI r2, AnonymousClass84O r3, Object obj, Object obj2) {
        A0R((FrameLayout) view, r2);
    }

    public final C203699oA A0P(C153427bI r3) {
        C203699oA r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        C203699oA B0o = this.A01.B0o(r3.A00());
        this.A00 = B0o;
        return B0o;
    }

    public /* bridge */ /* synthetic */ Object B0R(Context context) {
        return new FrameLayout(context);
    }

    public C01980Cz(C16280sl r1, C153427bI r2, AnonymousClass84O r3) {
        super(r2, r3);
        this.A01 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
        if (r1.equals("front") != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Void A0Q(android.widget.FrameLayout r4, X.C153427bI r5, X.AnonymousClass84O r6) {
        /*
            r3 = this;
            X.9oA r2 = r3.A0P(r5)
            r0 = 35
            java.lang.String r1 = r6.A0O(r0)
            if (r1 == 0) goto L_0x0015
            java.lang.String r0 = "front"
            boolean r1 = r1.equals(r0)
            r0 = 0
            if (r1 == 0) goto L_0x0016
        L_0x0015:
            r0 = 1
        L_0x0016:
            r2.BmQ(r0)
            android.content.Context r0 = r5.A00()
            android.view.View r0 = r2.B5D(r0)
            r4.addView(r0)
            r2.Bk9()
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C01980Cz.A0Q(android.widget.FrameLayout, X.7bI, X.84O):java.lang.Void");
    }

    public void A0R(FrameLayout frameLayout, C153427bI r3) {
        frameLayout.removeAllViews();
        A0P(r3).pause();
    }
}
