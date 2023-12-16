package X;

import android.view.View;
import java.util.List;

/* renamed from: X.0Oj  reason: invalid class name and case insensitive filesystem */
public class C04460Oj {
    public int A00;
    public int A01;
    public int A02 = 0;
    public int A03;
    public int A04;
    public int A05;
    public int A06 = 0;
    public int A07;
    public int A08;
    public List A09 = null;
    public boolean A0A;
    public boolean A0B = true;

    public View A00(C04870Qz r7) {
        List list = this.A09;
        if (list != null) {
            int size = list.size();
            int i = 0;
            while (i < size) {
                View view = ((C05570Ua) this.A09.get(i)).A0H;
                C002102g A0Y = AnonymousClass001.A0Y(view);
                if (AnonymousClass000.A1S(A0Y.A00.A00 & 8) || this.A01 != AnonymousClass001.A0J(A0Y.A00)) {
                    i++;
                } else {
                    A01(view);
                    return view;
                }
            }
            return null;
        }
        View A012 = r7.A01(this.A01);
        this.A01 += this.A03;
        return A012;
    }

    public void A01(View view) {
        int i;
        int A0J;
        int size = this.A09.size();
        View view2 = null;
        int i2 = Integer.MAX_VALUE;
        int i3 = 0;
        while (true) {
            if (i3 < size) {
                View view3 = ((C05570Ua) this.A09.get(i3)).A0H;
                C002102g A0Y = AnonymousClass001.A0Y(view3);
                if (view3 != view && !AnonymousClass000.A1S(A0Y.A00.A00 & 8) && (A0J = (AnonymousClass001.A0J(A0Y.A00) - this.A01) * this.A03) >= 0 && A0J < i2) {
                    view2 = view3;
                    if (A0J == 0) {
                        break;
                    }
                    i2 = A0J;
                }
                i3++;
            } else if (view2 == null) {
                i = -1;
            }
        }
        i = AnonymousClass001.A0J(AnonymousClass001.A0Y(view2).A00);
        this.A01 = i;
    }
}
