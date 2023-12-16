package X;

import java.io.File;
import java.util.ArrayDeque;

/* renamed from: X.8U7  reason: invalid class name */
public final class AnonymousClass8U7 extends C71993d0 {
    public final ArrayDeque A00;
    public final /* synthetic */ AnonymousClass8PK A01;

    public AnonymousClass8U7(AnonymousClass8PK r5) {
        Object r0;
        this.A01 = r5;
        ArrayDeque A0a = AnonymousClass6CA.A0a();
        this.A00 = A0a;
        File file = r5.A00;
        if (file.isDirectory()) {
            if (this.A01.A01.ordinal() != 0) {
                r0 = new AnonymousClass8Uk(file, this);
            } else {
                r0 = new C174408Uj(file, this);
            }
        } else if (file.isFile()) {
            r0 = new C174428Um(file, this);
        } else {
            this.A01 = AnonymousClass21I.Done;
            return;
        }
        A0a.push(r0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x009f, code lost:
        if (r3.length != 0) goto L_0x00af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00ad, code lost:
        if (r4.A00 < r3.length) goto L_0x00af;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00() {
        /*
            r7 = this;
        L_0x0000:
            java.util.ArrayDeque r2 = r7.A00
            java.lang.Object r6 = r2.peek()
            X.7Rr r6 = (X.C150657Rr) r6
            if (r6 != 0) goto L_0x000f
            X.21I r0 = X.AnonymousClass21I.Done
        L_0x000c:
            r7.A01 = r0
            return
        L_0x000f:
            boolean r0 = r6 instanceof X.C174428Um
            if (r0 == 0) goto L_0x0052
            r1 = r6
            X.8Um r1 = (X.C174428Um) r1
            boolean r0 = r1.A00
            if (r0 != 0) goto L_0x00a1
            r0 = 1
            r1.A00 = r0
            java.io.File r3 = r1.A00
        L_0x001f:
            if (r3 == 0) goto L_0x00a1
            java.io.File r0 = r6.A00
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x00b9
            boolean r0 = r3.isDirectory()
            if (r0 == 0) goto L_0x00b9
            int r1 = r2.size()
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r1 >= r0) goto L_0x00b9
            X.8PK r0 = r7.A01
            X.6vu r0 = r0.A01
            int r1 = r0.ordinal()
            r0 = 0
            if (r1 == r0) goto L_0x004c
            X.8Uk r0 = new X.8Uk
            r0.<init>(r3, r7)
        L_0x0048:
            r2.push(r0)
            goto L_0x0000
        L_0x004c:
            X.8Uj r0 = new X.8Uj
            r0.<init>(r3, r7)
            goto L_0x0048
        L_0x0052:
            boolean r0 = r6 instanceof X.C174408Uj
            if (r0 == 0) goto L_0x0063
            r4 = r6
            X.8Uj r4 = (X.C174408Uj) r4
            boolean r0 = r4.A01
            if (r0 != 0) goto L_0x00a6
            r0 = 1
            r4.A01 = r0
            java.io.File r3 = r4.A00
            goto L_0x001f
        L_0x0063:
            r5 = r6
            X.8Uk r5 = (X.AnonymousClass8Uk) r5
            boolean r0 = r5.A01
            r4 = 1
            if (r0 != 0) goto L_0x007b
            java.io.File[] r0 = r5.A03
            if (r0 != 0) goto L_0x007b
            java.io.File r0 = r5.A00
            java.io.File[] r0 = r0.listFiles()
            r5.A03 = r0
            if (r0 != 0) goto L_0x007b
            r5.A01 = r4
        L_0x007b:
            java.io.File[] r3 = r5.A03
            if (r3 == 0) goto L_0x008b
            int r1 = r5.A00
            int r0 = r3.length
            if (r1 >= r0) goto L_0x008b
            int r0 = r1 + 1
            r5.A00 = r0
            r3 = r3[r1]
            goto L_0x001f
        L_0x008b:
            boolean r0 = r5.A02
            if (r0 != 0) goto L_0x00a1
            r5.A02 = r4
            java.io.File r3 = r5.A00
            goto L_0x001f
        L_0x0094:
            java.io.File r0 = r4.A00
            java.io.File[] r3 = r0.listFiles()
            r4.A02 = r3
            if (r3 == 0) goto L_0x00a1
            int r0 = r3.length
            if (r0 != 0) goto L_0x00af
        L_0x00a1:
            r2.pop()
            goto L_0x0000
        L_0x00a6:
            java.io.File[] r3 = r4.A02
            if (r3 == 0) goto L_0x0094
            int r1 = r4.A00
            int r0 = r3.length
            if (r1 >= r0) goto L_0x00a1
        L_0x00af:
            int r1 = r4.A00
            int r0 = r1 + 1
            r4.A00 = r0
            r3 = r3[r1]
            goto L_0x001f
        L_0x00b9:
            r7.A00 = r3
            X.21I r0 = X.AnonymousClass21I.Ready
            goto L_0x000c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8U7.A00():void");
    }
}
