package X;

import android.view.ViewGroup;

/* renamed from: X.4Wy  reason: invalid class name and case insensitive filesystem */
public class C88004Wy extends AnonymousClass0R6 {
    public AnonymousClass0R6 A00;

    public int A0G() {
        AnonymousClass0R6 r0 = this.A00;
        return r0.A0G() + ((C185858uM) r0).B83();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0029, code lost:
        r2 = r2 << 32;
        r0 = (long) (r6 + (r9 - r5));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long A0K(int r9) {
        /*
            r8 = this;
            X.0R6 r7 = r8.A00
            X.8uM r7 = (X.C185858uM) r7
            int r3 = r7.B83()
            r2 = 0
            r6 = 0
            r5 = 0
        L_0x000b:
            r4 = 32
            if (r2 >= r3) goto L_0x001a
            if (r5 != r9) goto L_0x001e
            long r2 = (long) r2
            long r2 = r2 << r4
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
        L_0x0018:
            long r2 = r2 | r0
            return r2
        L_0x001a:
            int r0 = r3 + -1
            long r2 = (long) r0
            goto L_0x0029
        L_0x001e:
            int r5 = r5 + 1
            int r1 = r7.B62(r2)
            int r0 = r5 + r1
            if (r0 <= r9) goto L_0x002e
            long r2 = (long) r2
        L_0x0029:
            long r2 = r2 << r4
            int r9 = r9 - r5
            int r6 = r6 + r9
            long r0 = (long) r6
            goto L_0x0018
        L_0x002e:
            int r6 = r6 + r1
            int r2 = r2 + 1
            r5 = r0
            goto L_0x000b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C88004Wy.A0K(int):long");
    }

    public C05570Ua BQR(ViewGroup viewGroup, int i) {
        if (i == -1000) {
            return ((C185858uM) this.A00).BQN(viewGroup);
        }
        return this.A00.BQR(viewGroup, i);
    }

    public C88004Wy(AnonymousClass0R6 r3) {
        this.A00 = r3;
        A0E(r3.A00);
        r3.BiZ(new C188828zY(this, 3));
    }

    public long A0B(int i) {
        long A0K = A0K(i);
        long j = A0K & 4294967295L;
        boolean A1T = AnonymousClass000.A1T((j > 4294967295L ? 1 : (j == 4294967295L ? 0 : -1)));
        AnonymousClass0R6 r1 = this.A00;
        if (A1T) {
            return ((C185858uM) r1).B84((int) (A0K >> 32));
        }
        return r1.A0B((int) j);
    }

    public void BNf(C05570Ua r9, int i) {
        long A0K = A0K(i);
        long j = A0K & 4294967295L;
        boolean A1T = AnonymousClass000.A1T((j > 4294967295L ? 1 : (j == 4294967295L ? 0 : -1)));
        AnonymousClass0R6 r1 = this.A00;
        if (A1T) {
            ((C185858uM) r1).BNd(r9, (int) (A0K >> 32));
        } else {
            r1.BNf(r9, (int) j);
        }
    }

    public int getItemViewType(int i) {
        long A0K = A0K(i) & 4294967295L;
        if (AnonymousClass000.A1T((A0K > 4294967295L ? 1 : (A0K == 4294967295L ? 0 : -1)))) {
            return -1000;
        }
        return this.A00.getItemViewType((int) A0K);
    }
}
