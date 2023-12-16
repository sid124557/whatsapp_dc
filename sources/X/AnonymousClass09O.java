package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collections;
import java.util.List;

/* renamed from: X.09O  reason: invalid class name */
public final class AnonymousClass09O extends C04580Ov {
    public final C153427bI A00;
    public final AnonymousClass84O A01;

    public void A03(Rect rect, View view, AnonymousClass0Q1 r6, RecyclerView recyclerView) {
        List unmodifiableList;
        Rect rect2;
        C162457s7.A0J(rect, 0);
        C162457s7.A0J(view, 1);
        C162457s7.A0J(recyclerView, 2);
        int A002 = RecyclerView.A00(view);
        List list = ((C06300Xa) C162377rs.A06(this.A00, this.A01)).A08;
        if (list != null && (unmodifiableList = Collections.unmodifiableList(list)) != null && (rect2 = (Rect) C73723fy.A06(unmodifiableList, A002)) != null) {
            rect.set(rect2);
        }
    }

    public AnonymousClass09O(C153427bI r1, AnonymousClass84O r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}
