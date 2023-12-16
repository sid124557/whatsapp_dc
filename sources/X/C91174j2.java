package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.4j2  reason: invalid class name and case insensitive filesystem */
public class C91174j2 extends AnonymousClass4XD {
    public int A00 = 0;
    public int A01 = 0;
    public int A02 = 0;

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0009, code lost:
        if (r5 == 9) goto L_0x000b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass4Z7 A0L(android.view.View r4, int r5) {
        /*
            r3 = this;
            r2 = 1
            if (r5 == 0) goto L_0x000b
            r0 = 3
            if (r5 == r0) goto L_0x000b
            r0 = 9
            r1 = 0
            if (r5 != r0) goto L_0x000c
        L_0x000b:
            r1 = 1
        L_0x000c:
            java.lang.String r0 = "Unknown view holder type in HScroll"
            X.C626936e.A0D(r1, r0)
            X.4Z7 r0 = super.A0M(r4, r5, r2)
            r0.A09 = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C91174j2.A0L(android.view.View, int):X.4Z7");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0008, code lost:
        if (r3 == 9) goto L_0x000a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View A0K(int r3, android.view.ViewGroup r4) {
        /*
            r2 = this;
            if (r3 == 0) goto L_0x000a
            r0 = 3
            if (r3 == r0) goto L_0x000a
            r0 = 9
            r1 = 0
            if (r3 != r0) goto L_0x000b
        L_0x000a:
            r1 = 1
        L_0x000b:
            java.lang.String r0 = "Unknown view holder type in HScroll"
            X.C626936e.A0D(r1, r0)
            android.view.View r0 = super.A0K(r3, r4)
            r2.A0S(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C91174j2.A0K(int, android.view.ViewGroup):android.view.View");
    }

    public final void A0S(View view) {
        int i;
        if (this.A02 == 0 && this.A01 != null) {
            int size = this.A0I.size();
            int i2 = this.A01;
            int i3 = this.A00;
            if (size == 3) {
                i = (i2 + i3) / 3;
            } else {
                i = (int) (((double) i2) / (((double) 3) + 0.25d));
            }
            this.A02 = i;
        }
        if (this.A01 != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            int i4 = this.A02;
            if (i4 != layoutParams.height) {
                layoutParams.height = i4;
                layoutParams.width = i4 - this.A00;
                view.setLayoutParams(layoutParams);
            }
        }
    }

    public C91174j2(AnonymousClass5E5 r2, AnonymousClass5E6 r3, AnonymousClass5E7 r4, AnonymousClass5E8 r5, AnonymousClass5E9 r6, AnonymousClass5EA r7, AnonymousClass5EB r8, AnonymousClass8GN r9, AnonymousClass1VX r10, C187958y5 r11) {
        super(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11);
        this.A00 = R.style.f12nameremoved;
    }

    public void A0O(AnonymousClass4Z7 r2, int i) {
        super.BNf(r2, i);
        A0S(r2.A0H);
        r2.A0A(3);
    }

    public void A0P(AnonymousClass4Z7 r2, List list, int i) {
        super.A0A(r2, list, i);
        A0S(r2.A0H);
        r2.A0A(3);
    }

    public void A0R(List list) {
        RecyclerView recyclerView;
        int i;
        if (!list.isEmpty() && (recyclerView = this.A01) != null) {
            int i2 = this.A02;
            int width = recyclerView.getWidth();
            if (width != 0) {
                this.A01 = width;
            }
            int size = list.size();
            int i3 = this.A01;
            int i4 = this.A00;
            if (size == 3) {
                i = (i3 + i4) / 3;
            } else {
                i = (int) (((double) i3) / (((double) 3) + 0.25d));
            }
            this.A02 = i;
            if (!(i2 == 0 || i == 0 || i2 == i)) {
                A05();
            }
        }
        super.A0R(list);
    }
}
