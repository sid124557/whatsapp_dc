package X;

import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import android.widget.Toast;

/* renamed from: X.5fG  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C109835fG implements View.OnLongClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C89904fT A01;

    public final boolean onLongClick(View view) {
        C89904fT r8 = this.A01;
        Toast A0C = r8.A06.A0C(C86624Kv.A0b(view, this.A00));
        int[] A1Z = C86664Kz.A1Z();
        Rect A0N = AnonymousClass001.A0N();
        view.getLocationOnScreen(A1Z);
        view.getWindowVisibleDisplayFrame(A0N);
        int A09 = C86634Kw.A09(view, A1Z) - A0N.top;
        int i = A1Z[0];
        if (C620733j.A04(r8.A0N)) {
            Point A07 = AnonymousClass4L0.A07();
            C86604Kt.A0x(r8.A01, A07);
            if (A0C.getView() != null) {
                A0C.getView().measure(A07.x, A07.y);
                i -= A0C.getView().getMeasuredWidth();
            }
        } else {
            i += view.getWidth();
        }
        A0C.setGravity(51, i, A09);
        A0C.show();
        return true;
    }

    public /* synthetic */ C109835fG(C89904fT r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }
}
