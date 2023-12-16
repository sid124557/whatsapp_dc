package X;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* renamed from: X.0Xa  reason: invalid class name and case insensitive filesystem */
public class C06300Xa {
    public static final ViewGroup.MarginLayoutParams A09;
    public AnonymousClass09E A00;
    public final C01940Cu A01;
    public final C04020Mm A02;
    public final C146477Ak A03;
    public volatile C011709l A04;
    public volatile AnonymousClass09Z A05;
    public volatile C125396Hw A06;
    public volatile C141726w2 A07;
    public volatile List A08;

    static {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
        marginLayoutParams.setMargins(0, 0, 0, 0);
        A09 = marginLayoutParams;
    }

    public final void A03(int i) {
        C01940Cu r0 = this.A01;
        C011109f.A01(r0.A02, r0.A00, i, false);
    }

    public final void A04(int i) {
        if (C011109f.A02(this.A01.A00)) {
            A03(i);
        }
    }

    public C06300Xa(C01940Cu r1, C04020Mm r2, C146477Ak r3) {
        this.A02 = r2;
        this.A03 = r3;
        this.A01 = r1;
    }

    public static int A00(String str, List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            String A0N = ((AnonymousClass84O) ((C151627Vn) list.get(i)).A00()).A0N();
            if (A0N != null && A0N.equals(str)) {
                return i;
            }
        }
        return -1;
    }

    public int A01() {
        if (C161827qc.A04()) {
            return this.A02.A04;
        }
        throw AnonymousClass002.A0E("Cannot getScroll off the main thread!");
    }

    public int A02() {
        if (C161827qc.A04()) {
            return this.A02.A05;
        }
        throw AnonymousClass002.A0E("Cannot getScroll off the main thread!");
    }

    public void A05(int i, int i2, boolean z) {
        if (C161827qc.A04()) {
            C04020Mm r1 = this.A02;
            RecyclerView recyclerView = r1.A07;
            if (recyclerView == null) {
                r1.A01 = i;
                r1.A02 = i2;
                r1.A0A = z;
            } else if (z) {
                recyclerView.A0f(i, i2);
            } else {
                recyclerView.scrollBy(i, i2);
            }
        } else {
            throw AnonymousClass002.A0E("Cannot doScrollBy off the main thread!");
        }
    }

    public void A06(int i, boolean z) {
        if (C161827qc.A04()) {
            C04020Mm r1 = this.A02;
            RecyclerView recyclerView = r1.A07;
            if (recyclerView == null) {
                r1.A00 = i;
                r1.A09 = z;
            } else if (z) {
                recyclerView.A0a(i);
            } else {
                recyclerView.A0Z(i);
                A04(i);
            }
        } else {
            throw AnonymousClass002.A0E("Cannot doScrollTo off the main thread!");
        }
    }
}
