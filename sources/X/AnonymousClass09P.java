package X;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collections;
import java.util.List;

/* renamed from: X.09P  reason: invalid class name */
public final class AnonymousClass09P extends C04580Ov {
    public final C153427bI A00;
    public final AnonymousClass84O A01;

    public void A03(Rect rect, View view, AnonymousClass0Q1 r6, RecyclerView recyclerView) {
        AnonymousClass09Y r1;
        List unmodifiableList;
        Rect rect2;
        C162457s7.A0J(rect, 0);
        C162457s7.A0J(view, 1);
        C162457s7.A0J(recyclerView, 2);
        int A002 = RecyclerView.A00(view);
        C153427bI r0 = this.A00;
        AnonymousClass84O r12 = this.A01;
        List list = ((C06300Xa) C162377rs.A06(r0, r12)).A08;
        if (!(list == null || (unmodifiableList = Collections.unmodifiableList(list)) == null || (rect2 = (Rect) C73723fy.A06(unmodifiableList, A002)) == null)) {
            rect.set(rect2);
        }
        Object obj = r12.A0Q().get(A002);
        C162457s7.A0D(obj);
        boolean A03 = AnonymousClass0YQ.A02((AnonymousClass84O) obj);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if ((layoutParams instanceof AnonymousClass09Y) && (r1 = (AnonymousClass09Y) layoutParams) != null) {
            r1.A01 = A03;
        }
    }

    public AnonymousClass09P(C153427bI r1, AnonymousClass84O r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}
