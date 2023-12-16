package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0UY  reason: invalid class name */
public abstract class AnonymousClass0UY {
    public long A00 = 120;
    public long A01 = 250;
    public long A02 = 250;
    public long A03 = 120;
    public C15210qx A04 = null;
    public ArrayList A05 = AnonymousClass001.A0s();

    public abstract void A07();

    public abstract void A08();

    public abstract void A09(C05570Ua r1);

    public abstract boolean A0A();

    public boolean A0B(C05570Ua r3, List list) {
        if (!((AnonymousClass09N) this).A00 || (r3.A00 & 4) != 0) {
            return true;
        }
        return false;
    }

    public final void A01() {
        ArrayList arrayList = this.A05;
        if (0 < arrayList.size()) {
            arrayList.get(0);
            throw AnonymousClass001.A0g("onAnimationsFinished");
        } else {
            arrayList.clear();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(X.C05570Ua r8) {
        /*
            r7 = this;
            X.0qx r2 = r7.A04
            if (r2 == 0) goto L_0x0054
            X.0ed r2 = (X.C08530ed) r2
            r0 = 1
            r8.A05(r0)
            X.0Ua r0 = r8.A0A
            r1 = 0
            if (r0 == 0) goto L_0x0015
            X.0Ua r0 = r8.A0B
            if (r0 != 0) goto L_0x0015
            r8.A0A = r1
        L_0x0015:
            r8.A0B = r1
            int r0 = r8.A00
            r0 = r0 & 16
            if (r0 != 0) goto L_0x0054
            androidx.recyclerview.widget.RecyclerView r4 = r2.A00
            android.view.View r3 = r8.A0H
            r4.A0S()
            X.0R0 r6 = r4.A0K
            X.0sK r0 = r6.A01
            X.0eY r0 = (X.C08480eY) r0
            androidx.recyclerview.widget.RecyclerView r5 = r0.A00
            int r2 = r5.indexOfChild(r3)
            r0 = -1
            if (r2 != r0) goto L_0x0055
            r6.A09(r3)
        L_0x0036:
            r2 = 1
            X.0Ua r1 = androidx.recyclerview.widget.RecyclerView.A02(r3)
            X.0Qz r0 = r4.A0w
            r0.A09(r1)
            r0.A08(r1)
        L_0x0043:
            r0 = r2 ^ 1
            r4.A0w(r0)
            if (r2 != 0) goto L_0x0054
            int r0 = r8.A00
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0054
            r0 = 0
            r4.removeDetachedView(r3, r0)
        L_0x0054:
            return
        L_0x0055:
            X.0Qr r1 = r6.A00
            boolean r0 = r1.A06(r2)
            if (r0 == 0) goto L_0x0073
            r1.A07(r2)
            r6.A09(r3)
            android.view.View r0 = r5.getChildAt(r2)
            if (r0 == 0) goto L_0x006f
            r5.A0k(r0)
            r0.clearAnimation()
        L_0x006f:
            r5.removeViewAt(r2)
            goto L_0x0036
        L_0x0073:
            r2 = 0
            goto L_0x0043
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0UY.A02(X.0Ua):void");
    }

    public long A03() {
        return this.A00;
    }

    public long A04() {
        return this.A01;
    }

    public long A05() {
        return this.A02;
    }

    public long A06() {
        return this.A03;
    }
}
