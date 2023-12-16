package X;

import java.util.Iterator;

/* renamed from: X.8OG  reason: invalid class name */
public final class AnonymousClass8OG implements Iterator, C834348j {
    public int A00;
    public int A01;
    public int A02;
    public int A03 = -1;
    public C175698Zj A04;
    public final /* synthetic */ AnonymousClass8PN A05;

    public AnonymousClass8OG(AnonymousClass8PN r3) {
        this.A05 = r3;
        int A002 = C175708Zk.A00(0, 0, r3.A01.length());
        this.A01 = A002;
        this.A02 = A002;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0019, code lost:
        if (r0 < r1) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00() {
        /*
            r8 = this;
            int r7 = r8.A02
            r5 = 0
            if (r7 >= 0) goto L_0x000b
            r8.A03 = r5
            r0 = 0
            r8.A04 = r0
            return
        L_0x000b:
            X.8PN r6 = r8.A05
            int r1 = r6.A00
            r2 = -1
            r4 = 1
            if (r1 <= 0) goto L_0x001b
            int r0 = r8.A00
            int r0 = r0 + 1
            r8.A00 = r0
            if (r0 >= r1) goto L_0x0051
        L_0x001b:
            java.lang.CharSequence r3 = r6.A01
            int r0 = r3.length()
            if (r7 > r0) goto L_0x0051
            X.4GR r1 = r6.A02
            int r0 = r8.A02
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r1.invoke(r3, r0)
            X.3Z6 r0 = (X.AnonymousClass3Z6) r0
            if (r0 == 0) goto L_0x0051
            int r2 = X.AnonymousClass3Z6.A00(r0)
            java.lang.Object r0 = r0.second
            int r1 = X.AnonymousClass001.A0K(r0)
            int r0 = r8.A01
            X.8Zj r0 = X.C175708Zk.A02(r0, r2)
            r8.A04 = r0
            int r2 = r2 + r1
            r8.A01 = r2
            if (r1 != 0) goto L_0x004b
            r5 = 1
        L_0x004b:
            int r2 = r2 + r5
        L_0x004c:
            r8.A02 = r2
            r8.A03 = r4
            return
        L_0x0051:
            int r3 = r8.A01
            java.lang.CharSequence r0 = r6.A01
            int r0 = r0.length()
            int r1 = r0 + -1
            X.8Zj r0 = new X.8Zj
            r0.<init>(r3, r1)
            r8.A04 = r0
            goto L_0x004c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8OG.A00():void");
    }

    public boolean hasNext() {
        if (this.A03 == -1) {
            A00();
        }
        return AnonymousClass001.A1T(this.A03);
    }

    public /* bridge */ /* synthetic */ Object next() {
        if (this.A03 == -1) {
            A00();
        }
        if (this.A03 != 0) {
            C175698Zj r1 = this.A04;
            C162457s7.A0K(r1, "null cannot be cast to non-null type kotlin.ranges.IntRange");
            this.A04 = null;
            this.A03 = -1;
            return r1;
        }
        throw AnonymousClass6CA.A0c();
    }

    public void remove() {
        throw C18290x4.A0x();
    }
}
