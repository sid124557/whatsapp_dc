package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* renamed from: X.0R0  reason: invalid class name */
public class AnonymousClass0R0 {
    public final C04790Qr A00 = new C04790Qr();
    public final C16010sK A01;
    public final List A02 = AnonymousClass001.A0s();

    public final int A03(int i) {
        if (i >= 0) {
            int childCount = ((C08480eY) this.A01).A00.getChildCount();
            int i2 = i;
            while (i2 < childCount) {
                C04790Qr r1 = this.A00;
                int A002 = i - (i2 - r1.A00(i2));
                if (A002 != 0) {
                    i2 += A002;
                } else {
                    while (r1.A06(i2)) {
                        i2++;
                    }
                    return i2;
                }
            }
        }
        return -1;
    }

    public static C05570Ua A00(AnonymousClass0R0 r0, int i) {
        return RecyclerView.A02(((C08480eY) r0.A01).A00.getChildAt(i));
    }

    public int A01() {
        return ((C08480eY) this.A01).A00.getChildCount() - this.A02.size();
    }

    public int A02() {
        return ((C08480eY) this.A01).A00.getChildCount();
    }

    public int A04(View view) {
        int indexOfChild = ((C08480eY) this.A01).A00.indexOfChild(view);
        if (indexOfChild != -1) {
            C04790Qr r1 = this.A00;
            if (!r1.A06(indexOfChild)) {
                return indexOfChild - r1.A00(indexOfChild);
            }
        }
        return -1;
    }

    public final void A08(View view) {
        this.A02.add(view);
        C08480eY r1 = (C08480eY) this.A01;
        C05570Ua r3 = AnonymousClass001.A0Y(view).A00;
        if (r3 != null) {
            RecyclerView recyclerView = r1.A00;
            int i = r3.A04;
            if (i == -1) {
                i = AnonymousClass0YY.A00(r3.A0H);
            }
            r3.A07 = i;
            if (recyclerView.A09 > 0) {
                r3.A04 = 4;
                recyclerView.A15.add(r3);
                return;
            }
            AnonymousClass0YY.A06(r3.A0H, 4);
        }
    }

    public final void A09(View view) {
        if (this.A02.remove(view)) {
            this.A01.BV3(view);
        }
    }

    public void A0A(View view, int i, boolean z) {
        int A03;
        if (i < 0) {
            A03 = ((C08480eY) this.A01).A00.getChildCount();
        } else {
            A03 = A03(i);
        }
        this.A00.A05(A03, z);
        if (z) {
            A08(view);
        }
        RecyclerView recyclerView = ((C08480eY) this.A01).A00;
        recyclerView.addView(view, A03);
        C05570Ua r1 = AnonymousClass001.A0Y(view).A00;
        AnonymousClass0R6 r0 = recyclerView.A0N;
        if (!(r0 == null || r1 == null)) {
            r0.A0H(r1);
        }
        List list = recyclerView.A0a;
        if (list != null) {
            int size = list.size();
            while (true) {
                size--;
                if (size >= 0) {
                    ((C16670tm) recyclerView.A0a.get(size)).BOt(view);
                } else {
                    return;
                }
            }
        }
    }

    public void A0B(View view, ViewGroup.LayoutParams layoutParams, int i, boolean z) {
        int A03;
        if (i < 0) {
            A03 = ((C08480eY) this.A01).A00.getChildCount();
        } else {
            A03 = A03(i);
        }
        this.A00.A05(A03, z);
        if (z) {
            A08(view);
        }
        C08480eY r3 = (C08480eY) this.A01;
        C05570Ua r2 = AnonymousClass001.A0Y(view).A00;
        if (r2 != null) {
            int i2 = r2.A00;
            if ((i2 & 256) != 0 || AnonymousClass000.A1S(i2 & 128)) {
                r2.A00 = i2 & -257;
            } else {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("Called attach on a child which is not detached: ");
                A0o.append(r2);
                throw AnonymousClass000.A0F(r3.A00.A0I(), A0o);
            }
        }
        r3.A00.attachViewToParent(view, A03, layoutParams);
    }

    public AnonymousClass0R0(C16010sK r2) {
        this.A01 = r2;
    }

    public View A05(int i) {
        return ((C08480eY) this.A01).A00.getChildAt(A03(i));
    }

    public void A06(int i) {
        C05570Ua r2;
        int A03 = A03(i);
        this.A00.A07(A03);
        RecyclerView recyclerView = ((C08480eY) this.A01).A00;
        View childAt = recyclerView.getChildAt(A03);
        if (!(childAt == null || (r2 = AnonymousClass001.A0Y(childAt).A00) == null)) {
            int i2 = r2.A00;
            if ((i2 & 256) == 0 || AnonymousClass000.A1S(i2 & 128)) {
                r2.A00 = 256 | i2;
            } else {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("called detach on an already detached child ");
                A0o.append(r2);
                throw AnonymousClass000.A0F(recyclerView.A0I(), A0o);
            }
        }
        recyclerView.detachViewFromParent(A03);
    }

    public void A07(int i) {
        int A03 = A03(i);
        RecyclerView recyclerView = ((C08480eY) this.A01).A00;
        View childAt = recyclerView.getChildAt(A03);
        if (childAt != null) {
            if (this.A00.A07(A03)) {
                A09(childAt);
            }
            View childAt2 = recyclerView.getChildAt(A03);
            if (childAt2 != null) {
                recyclerView.A0k(childAt2);
                childAt2.clearAnimation();
            }
            recyclerView.removeViewAt(A03);
        }
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        AnonymousClass000.A1B(this.A00, A0o);
        A0o.append(", hidden list:");
        return AnonymousClass000.A0h(A0o, this.A02.size());
    }
}
