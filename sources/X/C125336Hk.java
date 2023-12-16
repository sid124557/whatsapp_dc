package X;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* renamed from: X.6Hk  reason: invalid class name and case insensitive filesystem */
public abstract class C125336Hk extends AnonymousClass0R6 {
    public int A00;
    public int A01;
    public RecyclerView A02;
    public List A03;
    public final C03550Kq A04;

    public void A0D(RecyclerView recyclerView) {
        this.A02 = null;
    }

    public long A0B(int i) {
        return (long) ((C151627Vn) this.A03.get(i)).A01.A02;
    }

    public void A0C(RecyclerView recyclerView) {
        this.A02 = recyclerView;
    }

    public int A0G() {
        return this.A03.size();
    }

    public List A0L() {
        return this.A03;
    }

    public void A0M(AnonymousClass6IO r3) {
        ((C180498lA) r3.A0H).setRenderTree((C151847Wn) null);
        r3.A00 = null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00ef, code lost:
        if (r4 != null) goto L_0x00f1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0N(X.AnonymousClass6IO r14, int r15) {
        /*
            r13 = this;
            X.0Kq r2 = r13.A04
            if (r2 == 0) goto L_0x00a1
            int r1 = r13.A01
            r0 = -1
            if (r1 == r0) goto L_0x00a1
            java.util.List r0 = r13.A03
            java.lang.Object r0 = r0.get(r15)
            X.7Vn r0 = (X.C151627Vn) r0
            X.84O r3 = r0.A01
            int r10 = r13.A01
            int r6 = r13.A00
            int r8 = r2.A00
            r1 = -1
            r0 = -2
            r7 = 1
            r2 = 0
            android.view.ViewGroup$LayoutParams r4 = new android.view.ViewGroup$LayoutParams
            if (r8 != r7) goto L_0x004f
            r4.<init>(r1, r0)
        L_0x0024:
            r0 = 132(0x84, float:1.85E-43)
            X.84O r0 = r3.A0K(r0)
            if (r0 == 0) goto L_0x00b0
            r0 = 132(0x84, float:1.85E-43)
            X.84O r0 = r3.A0K(r0)
            int r1 = r0.A03
            r0 = 13366(0x3436, float:1.873E-41)
            if (r1 != r0) goto L_0x00b0
            r0 = 132(0x84, float:1.85E-43)
            X.84O r5 = r3.A0K(r0)
            r0 = 41
            java.lang.Object r9 = X.AnonymousClass84O.A05(r5, r0)
            java.lang.String r9 = (java.lang.String) r9
            r11 = 4636737291354636288(0x4059000000000000, double:100.0)
            java.lang.String r3 = "CollectionBinderUtils"
            if (r8 != 0) goto L_0x007c
            if (r9 == 0) goto L_0x007c
            goto L_0x0053
        L_0x004f:
            r4.<init>(r0, r1)
            goto L_0x0024
        L_0x0053:
            X.7iE r1 = X.C162407s0.A0D(r9)     // Catch:{ 6u2 -> 0x006f }
            X.6vZ r0 = r1.A01     // Catch:{ 6u2 -> 0x006f }
            int r0 = r0.ordinal()     // Catch:{ 6u2 -> 0x006f }
            if (r0 == r2) goto L_0x0069
            if (r0 != r7) goto L_0x007c
            float r1 = r1.A00     // Catch:{ 6u2 -> 0x006f }
            float r0 = (float) r10     // Catch:{ 6u2 -> 0x006f }
            float r1 = r1 * r0
            double r0 = (double) r1     // Catch:{ 6u2 -> 0x006f }
            double r0 = r0 / r11
            int r10 = (int) r0     // Catch:{ 6u2 -> 0x006f }
            goto L_0x006c
        L_0x0069:
            float r0 = r1.A00     // Catch:{ 6u2 -> 0x006f }
            int r10 = (int) r0     // Catch:{ 6u2 -> 0x006f }
        L_0x006c:
            r4.width = r10     // Catch:{ 6u2 -> 0x006f }
            goto L_0x007c
        L_0x006f:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Error parsing style width: "
            java.lang.String r0 = X.AnonymousClass000.A0V(r0, r9, r1)
            X.C159737mN.A01(r3, r0)
        L_0x007c:
            java.lang.String r5 = X.AnonymousClass84O.A06(r5)
            if (r8 != r7) goto L_0x00b0
            if (r5 == 0) goto L_0x00b0
            X.7iE r1 = X.C162407s0.A0D(r5)     // Catch:{ 6u2 -> 0x00a3 }
            X.6vZ r0 = r1.A01     // Catch:{ 6u2 -> 0x00a3 }
            int r0 = r0.ordinal()     // Catch:{ 6u2 -> 0x00a3 }
            if (r0 == r2) goto L_0x0093
            if (r0 != r7) goto L_0x00b0
            goto L_0x0097
        L_0x0093:
            float r0 = r1.A00     // Catch:{ 6u2 -> 0x00a3 }
            int r0 = (int) r0     // Catch:{ 6u2 -> 0x00a3 }
            goto L_0x009e
        L_0x0097:
            float r1 = r1.A00     // Catch:{ 6u2 -> 0x00a3 }
            float r0 = (float) r6     // Catch:{ 6u2 -> 0x00a3 }
            float r1 = r1 * r0
            double r1 = (double) r1     // Catch:{ 6u2 -> 0x00a3 }
            double r1 = r1 / r11
            int r0 = (int) r1     // Catch:{ 6u2 -> 0x00a3 }
        L_0x009e:
            r4.height = r0     // Catch:{ 6u2 -> 0x00a3 }
            goto L_0x00b0
        L_0x00a1:
            r4 = 0
            goto L_0x00b5
        L_0x00a3:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Error parsing style height: "
            java.lang.String r0 = X.AnonymousClass000.A0V(r0, r5, r1)
            X.C159737mN.A01(r3, r0)
        L_0x00b0:
            android.view.View r0 = r14.A0H
            r0.setLayoutParams(r4)
        L_0x00b5:
            boolean r0 = r14.A01
            if (r0 == 0) goto L_0x00ef
            if (r4 != 0) goto L_0x00f1
            android.view.View r1 = r14.A0H
            androidx.recyclerview.widget.RecyclerView r0 = r13.A02
            X.0Xs r0 = r0.getLayoutManager()
            X.02g r0 = r0.A0S()
            r1.setLayoutParams(r0)
        L_0x00ca:
            r0 = 0
        L_0x00cb:
            r14.A01 = r0
            java.util.List r0 = r13.A03
            java.lang.Object r0 = r0.get(r15)
            X.7Vn r0 = (X.C151627Vn) r0
            X.6NK r0 = r0.A00
            android.view.View r1 = r14.A0H
            X.8lA r1 = (X.C180498lA) r1
            java.lang.Object r0 = r0.A00()
            X.7nJ r0 = (X.C160247nJ) r0
            X.7Wn r0 = r0.A02
            r1.setRenderTree(r0)
            java.util.List r0 = r13.A03
            java.lang.Object r0 = r0.get(r15)
            r14.A00 = r0
            return
        L_0x00ef:
            if (r4 == 0) goto L_0x00ca
        L_0x00f1:
            r0 = 1
            goto L_0x00cb
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C125336Hk.A0N(X.6IO, int):void");
    }

    public C125336Hk(C03550Kq r2) {
        this.A03 = AnonymousClass001.A0s();
        this.A04 = r2;
        A0E(true);
    }

    public AnonymousClass6IO A0K(ViewGroup viewGroup) {
        return new AnonymousClass6IO(new AnonymousClass6N6(viewGroup.getContext()));
    }

    public C125336Hk() {
        this((C03550Kq) null);
    }
}
