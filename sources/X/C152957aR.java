package X;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.7aR  reason: invalid class name and case insensitive filesystem */
public class C152957aR {
    public C147977Gl A00;
    public C147977Gl A01;
    public C141726w2 A02;
    public Float A03;

    public final int A00(View view, C05590Uc r6) {
        C141726w2 r3 = this.A02;
        int ordinal = r3.ordinal();
        if (ordinal == 0) {
            return r6.A09(view);
        }
        if (ordinal == 1) {
            return r6.A09(view) + (r6.A07(view) / 2);
        }
        if (ordinal == 2) {
            return r6.A06(view);
        }
        throw AnonymousClass000.A0E(r3, "Invalid gravity :", AnonymousClass001.A0o());
    }

    public final int A01(C05590Uc r4, C06440Xs r5) {
        int i;
        C141726w2 r2 = this.A02;
        int ordinal = r2.ordinal();
        if (ordinal == 0) {
            Float f = this.A03;
            RecyclerView recyclerView = r5.A07;
            if (recyclerView == null || !recyclerView.A0d) {
                return 0;
            }
            return r4.A04() + Math.round(f.floatValue());
        } else if (ordinal == 1) {
            RecyclerView recyclerView2 = r5.A07;
            if (recyclerView2 == null || !recyclerView2.A0d) {
                i = 0;
            } else {
                i = r4.A04();
            }
            return i + (r4.A05() / 2);
        } else if (ordinal == 2) {
            RecyclerView recyclerView3 = r5.A07;
            if (recyclerView3 == null || !recyclerView3.A0d) {
                return r4.A01();
            }
            return r4.A02();
        } else {
            throw AnonymousClass000.A0E(r2, "Invalid gravity :", AnonymousClass001.A0o());
        }
    }

    public C152957aR(C141726w2 r1, Float f) {
        this.A02 = r1;
        this.A03 = f;
    }

    public View A02(C06440Xs r9) {
        C147977Gl r1;
        if (r9.A17()) {
            r1 = this.A00;
            if (r1 == null || r1.A01 != r9) {
                r1 = new C147977Gl(new C17600vq(r9, 0), r9);
                this.A00 = r1;
            }
        } else {
            r1 = this.A01;
            if (r1 == null || r1.A01 != r9) {
                r1 = new C147977Gl(new C17600vq(r9, 1), r9);
                this.A01 = r1;
            }
        }
        C05590Uc r6 = r1.A00;
        int A08 = r9.A08();
        View view = null;
        if (A08 == 0) {
            return null;
        }
        if (this.A02 == C141726w2.CENTER && (r9 instanceof LinearLayoutManager)) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) r9;
            if (linearLayoutManager.A1G() == 0) {
                return r9.A0Q(0);
            }
            if (linearLayoutManager.A1I() == r9.A09() - 1) {
                return r9.A0Q(r9.A08() - 1);
            }
        }
        int A012 = A01(r6, r9);
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < A08; i2++) {
            View A0Q = r9.A0Q(i2);
            int A0A = AnonymousClass001.A0A(A00(A0Q, r6), A012);
            if (A0A < i) {
                view = A0Q;
                i = A0A;
            }
        }
        return view;
    }

    public int[] A03(View view, C06440Xs r7) {
        int[] A1Z = C86664Kz.A1Z();
        if (r7.A17()) {
            C147977Gl r1 = this.A00;
            if (r1 == null || r1.A01 != r7) {
                r1 = new C147977Gl(new C17600vq(r7, 0), r7);
                this.A00 = r1;
            }
            C05590Uc r0 = r1.A00;
            A1Z[0] = A00(view, r0) - A01(r0, r7);
        } else {
            A1Z[0] = 0;
        }
        if (r7.A18()) {
            C147977Gl r12 = this.A01;
            if (r12 == null || r12.A01 != r7) {
                r12 = new C147977Gl(new C17600vq(r7, 1), r7);
                this.A01 = r12;
            }
            C05590Uc r02 = r12.A00;
            A1Z[1] = A00(view, r02) - A01(r02, r7);
            return A1Z;
        }
        A1Z[1] = 0;
        return A1Z;
    }
}
