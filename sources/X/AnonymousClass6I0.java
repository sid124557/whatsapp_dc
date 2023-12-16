package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.6I0  reason: invalid class name */
public class AnonymousClass6I0 extends AnonymousClass0O5 {
    public static final ViewGroup.MarginLayoutParams A01;
    public AnonymousClass0NV A00;

    static {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
        marginLayoutParams.setMargins(0, 0, 0, 0);
        A01 = marginLayoutParams;
    }

    public AnonymousClass6I0(AnonymousClass0NV r1) {
        this.A00 = r1;
    }

    public void A04(RecyclerView recyclerView, int i, int i2) {
        View A0P;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int height;
        int top;
        int i3;
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
        int A1H = linearLayoutManager.A1H();
        if (A1H != -1 && (A0P = linearLayoutManager.A0P(A1H)) != null) {
            if (A0P.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                marginLayoutParams = AnonymousClass001.A0T(A0P);
            } else {
                marginLayoutParams = A01;
            }
            if (linearLayoutManager.A01 == 0) {
                height = A0P.getWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
                if (AnonymousClass0YH.A01(linearLayoutManager.A07) == 0) {
                    top = A0P.getLeft();
                    i3 = marginLayoutParams.leftMargin;
                } else {
                    top = height - A0P.getRight();
                    i3 = marginLayoutParams.rightMargin;
                }
            } else {
                height = marginLayoutParams.bottomMargin + A0P.getHeight() + marginLayoutParams.topMargin;
                top = A0P.getTop();
                i3 = marginLayoutParams.topMargin;
            }
            int i4 = -(top - i3);
            float f = 0.0f;
            if (height != 0) {
                f = ((float) i4) / ((float) height);
            }
            AnonymousClass0NV r5 = this.A00;
            C152057Xj r4 = new C152057Xj();
            C153427bI r3 = r5.A00;
            r4.A05(r3, 0);
            r4.A05(Integer.valueOf(A1H), 1);
            r4.A05(C159427lo.A00((double) f), 2);
            C159377lj.A01(r3, r5.A01, C152057Xj.A00(r4, Integer.valueOf(i4), 3), r5.A02);
        }
    }
}
