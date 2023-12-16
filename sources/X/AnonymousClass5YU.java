package X;

import android.view.View;
import android.widget.ListView;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.5YU  reason: invalid class name */
public final class AnonymousClass5YU {
    public static final void A00(View view, C08310eF r3) {
        AnonymousClass673 r1;
        C162457s7.A0J(view, 0);
        C003203q A0Q = r3.A0Q();
        if ((A0Q instanceof AnonymousClass673) && (r1 = (AnonymousClass673) A0Q) != null) {
            r1.installScrollableCallbacks(view);
        }
    }

    public static final void A01(View view, C08310eF r6, int i) {
        C162457s7.A0J(view, 0);
        C003203q A0Q = r6.A0Q();
        if (A0Q instanceof AnonymousClass673) {
            ListView listView = (ListView) C86664Kz.A0i(view);
            C124886Eg r1 = new C124886Eg(A0Q, i);
            AnonymousClass0YY.A06(r1, 2);
            if (listView != null) {
                listView.addFooterView(r1, (Object) null, false);
            }
        }
    }

    public static final void A02(C08310eF r3, RecyclerView recyclerView) {
        AnonymousClass673 r32;
        C162457s7.A0J(recyclerView, 0);
        C003203q A0Q = r3.A0Q();
        if ((A0Q instanceof AnonymousClass673) && (r32 = (AnonymousClass673) A0Q) != null) {
            C95704uI r33 = (C95704uI) r32;
            if (r33.A07.A01()) {
                recyclerView.A0N.BiZ(new C188828zY(r33, 0));
                recyclerView.A0q(new C1231667j(r33, 0, recyclerView));
            }
        }
    }
}
