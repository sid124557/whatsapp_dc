package X;

import com.bloks.stdlib.components.bkcomponentscollection.StickyHeadersLinearLayoutManager;
import java.util.List;

/* renamed from: X.09M  reason: invalid class name */
public final class AnonymousClass09M extends C04640Qa {
    public final /* synthetic */ StickyHeadersLinearLayoutManager A00;

    public static final boolean A00(C125336Hk r2, int i) {
        AnonymousClass84O r1;
        List A0L;
        C151627Vn r0;
        C180488l9 r12 = null;
        if (!(r2 == null || (A0L = r2.A0L()) == null || (r0 = (C151627Vn) A0L.get(i)) == null)) {
            r12 = r0.A00();
        }
        if (!(r12 instanceof AnonymousClass84O) || (r1 = (AnonymousClass84O) r12) == null) {
            return false;
        }
        return AnonymousClass0JE.A00(r1);
    }

    public AnonymousClass09M(StickyHeadersLinearLayoutManager stickyHeadersLinearLayoutManager) {
        this.A00 = stickyHeadersLinearLayoutManager;
    }

    public void A05() {
        int i;
        StickyHeadersLinearLayoutManager stickyHeadersLinearLayoutManager = this.A00;
        List list = stickyHeadersLinearLayoutManager.A06;
        list.clear();
        C125336Hk A002 = stickyHeadersLinearLayoutManager.A04;
        if (A002 != null) {
            i = A002.A0G();
        } else {
            i = 0;
        }
        boolean z = true;
        for (int i2 = 0; i2 < i; i2++) {
            if (A00(stickyHeadersLinearLayoutManager.A04, i2)) {
                list.add(Integer.valueOf(i2));
                if (i2 == stickyHeadersLinearLayoutManager.A02) {
                    z = false;
                }
            }
        }
        if (stickyHeadersLinearLayoutManager.A03 != null && z) {
            stickyHeadersLinearLayoutManager.A1q((C04870Qz) null);
        }
    }

    public void A06(int i, int i2) {
        StickyHeadersLinearLayoutManager stickyHeadersLinearLayoutManager = this.A00;
        List list = stickyHeadersLinearLayoutManager.A06;
        int size = list.size();
        int A1k = stickyHeadersLinearLayoutManager.A1k(i);
        if (size > 0 && A1k != -1) {
            while (A1k < size) {
                list.set(A1k, Integer.valueOf(AnonymousClass000.A09(list, A1k) + i2));
                A1k++;
            }
        }
        int i3 = i2 + i;
        while (i < i3) {
            if (A00(stickyHeadersLinearLayoutManager.A04, i)) {
                int A1k2 = stickyHeadersLinearLayoutManager.A1k(i);
                Integer valueOf = Integer.valueOf(i);
                if (A1k2 != -1) {
                    list.add(A1k2, valueOf);
                } else {
                    list.add(valueOf);
                }
            }
            i++;
        }
    }

    public void A07(int i, int i2) {
        StickyHeadersLinearLayoutManager stickyHeadersLinearLayoutManager = this.A00;
        List list = stickyHeadersLinearLayoutManager.A06;
        int size = list.size();
        if (size > 0) {
            int i3 = i + i2;
            int i4 = i3 - 1;
            boolean z = false;
            if (i <= i4) {
                while (true) {
                    int A1j = stickyHeadersLinearLayoutManager.A1j(i4);
                    if (A1j != -1) {
                        list.remove(Integer.valueOf(A1j));
                        size--;
                        if (A1j == stickyHeadersLinearLayoutManager.A02) {
                            z = true;
                        }
                    }
                    if (i4 == i) {
                        break;
                    }
                    i4--;
                }
            }
            if (stickyHeadersLinearLayoutManager.A03 != null && z) {
                stickyHeadersLinearLayoutManager.A1q((C04870Qz) null);
            }
            int A1k = stickyHeadersLinearLayoutManager.A1k(i3);
            if (A1k != -1) {
                while (A1k < size) {
                    list.set(A1k, Integer.valueOf(-i2));
                    A1k++;
                }
            }
        }
    }
}
