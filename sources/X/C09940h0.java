package X;

import android.content.Context;
import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.0h0  reason: invalid class name and case insensitive filesystem */
public class C09940h0 implements C185318tS {
    public final C03540Kp A00;
    public final C04020Mm A01;

    public /* bridge */ /* synthetic */ Object Axn(Context context, Object obj, Object obj2, Object obj3) {
        RecyclerView recyclerView = (RecyclerView) obj;
        C04020Mm r5 = this.A01;
        r5.A07 = recyclerView;
        r5.A04 = recyclerView.getScrollX();
        recyclerView.A0q(r5.A06);
        int i = r5.A00;
        if (i != -1) {
            if (!r5.A09) {
                recyclerView.A0Z(i);
            } else if (!r5.A08.equals("")) {
                AnonymousClass09E r1 = new AnonymousClass09E(context);
                r1.A0D(r5.A08);
                r1.A00 = r5.A03;
                r1.A03 = r5.A0B;
                r1.A00 = r5.A00;
                C06440Xs layoutManager = recyclerView.getLayoutManager();
                if (layoutManager != null) {
                    layoutManager.A0x(r1);
                }
            } else {
                recyclerView.A0a(i);
            }
            r5.A00 = -1;
            r5.A09 = false;
            r5.A08 = "";
            r5.A03 = 0;
            r5.A0B = true;
        }
        int i2 = r5.A01;
        if (i2 == -1 && r5.A02 == -1) {
            return null;
        }
        boolean z = r5.A0A;
        int i3 = r5.A02;
        if (z) {
            recyclerView.A0f(i2, i3);
        } else {
            recyclerView.scrollBy(i2, i3);
        }
        r5.A01 = -1;
        r5.A02 = -1;
        r5.A0A = false;
        return null;
    }

    public /* bridge */ /* synthetic */ void BrF(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        RecyclerView recyclerView;
        RecyclerView recyclerView2 = (RecyclerView) obj;
        if (Build.VERSION.SDK_INT >= 26 && (recyclerView = this.A01.A07) != null) {
            recyclerView.setImportantForAutofill(0);
        }
        C04020Mm r0 = this.A01;
        r0.A07 = null;
        recyclerView2.A0r(r0.A06);
    }

    public C09940h0(C03540Kp r1, C04020Mm r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public /* synthetic */ String B6x() {
        return AnonymousClass71Y.A00(this);
    }

    public /* bridge */ /* synthetic */ boolean Bob(Object obj, Object obj2, Object obj3, Object obj4) {
        return true;
    }
}
