package X;

import android.os.SystemClock;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.82q  reason: invalid class name and case insensitive filesystem */
public final class C1678182q implements C185268tM {
    public static final long A0C = TimeUnit.SECONDS.toMillis(5);
    public long A00 = SystemClock.uptimeMillis();
    public AnonymousClass8KL A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final C186188ut A06;
    public final AnonymousClass7FR A07;
    public final SortedSet A08 = new TreeSet();
    public final AtomicBoolean A09 = new AtomicBoolean(false);
    public final AtomicBoolean A0A = new AtomicBoolean(false);
    public final boolean A0B;

    public final C1678482v A00(AnonymousClass7FQ r9, AnonymousClass4GP r10) {
        AnonymousClass7FR r0 = this.A07;
        int i = r9.A01;
        int i2 = r9.A00;
        int i3 = this.A04;
        return new C1678482v(new AnonymousClass82r(this, r10), C142446xD.LOW, r0.A00, r0.A01, i, i2, i3);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v21, resolved type: java.lang.Number} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: java.lang.Integer} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C172258Kh B4e(int r15, int r16, int r17) {
        /*
            r14 = this;
            X.8ut r4 = r14.A06
            X.8Kh r6 = r4.B54(r15)
            r3 = 1
            if (r6 == 0) goto L_0x0081
            boolean r0 = r6.A04()
            if (r0 != r3) goto L_0x0081
            java.util.concurrent.atomic.AtomicBoolean r5 = r14.A0A
            boolean r0 = r5.getAndSet(r3)
            if (r0 != 0) goto L_0x005f
            java.util.SortedSet r4 = r14.A08
            boolean r0 = r4.isEmpty()
            r1 = 0
            if (r0 != 0) goto L_0x0045
            java.util.Iterator r3 = r4.iterator()
        L_0x0024:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x003b
            java.lang.Object r2 = r3.next()
            r0 = r2
            java.lang.Number r0 = (java.lang.Number) r0
            X.C162457s7.A0H(r0)
            int r0 = r0.intValue()
            if (r0 <= r15) goto L_0x0024
            r1 = r2
        L_0x003b:
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 != 0) goto L_0x0045
            java.lang.Object r1 = r4.first()
            java.lang.Integer r1 = (java.lang.Integer) r1
        L_0x0045:
            r4 = 0
            if (r1 == 0) goto L_0x005c
            X.8KL r3 = r14.A01
            if (r3 == 0) goto L_0x0060
            int r2 = r1.intValue()
            int r0 = r3.A00
            if (r0 != r2) goto L_0x0060
            X.8Kh r0 = r3.A01
            boolean r0 = r0.A04()
            if (r0 == 0) goto L_0x0060
        L_0x005c:
            r5.set(r4)
        L_0x005f:
            return r6
        L_0x0060:
            X.7FR r0 = r14.A07
            int r13 = r1.intValue()
            X.8Xk r11 = new X.8Xk
            r11.<init>(r14)
            X.8Yd r12 = new X.8Yd
            r12.<init>(r14, r1)
            X.6xD r8 = X.C142446xD.MEDIUM
            X.7iw r10 = r0.A01
            X.7Ti r9 = r0.A00
            X.82u r7 = new X.82u
            r7.<init>(r8, r9, r10, r11, r12, r13)
            java.util.concurrent.ThreadPoolExecutor r0 = X.C155277eb.A01
            r0.execute(r7)
            return r6
        L_0x0081:
            int r1 = r14.A05
            int r0 = r14.A04
            if (r1 > r0) goto L_0x00c9
            int r0 = r15 % r1
            if (r0 != r3) goto L_0x00c9
        L_0x008b:
            X.8KL r1 = r14.A01
            if (r1 == 0) goto L_0x00a2
            int r0 = r1.A00
            if (r0 != r15) goto L_0x00a2
            X.8Kh r0 = r1.A01
            boolean r0 = r0.A04()
            if (r0 == 0) goto L_0x00a2
            X.8KL r0 = r14.A01
            if (r0 == 0) goto L_0x00d3
            X.8Kh r2 = r0.A01
        L_0x00a1:
            return r2
        L_0x00a2:
            r2 = 0
            r1 = -1
            X.8Ls r0 = new X.8Ls
            r0.<init>(r15, r2, r1)
            X.4C5 r0 = X.C73723fy.A0R(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x00b1:
            boolean r0 = r1.hasNext()
            r2 = 0
            if (r0 == 0) goto L_0x00a1
            int r0 = X.C18280x3.A05(r1)
            X.8Kh r2 = r4.B54(r0)
            if (r2 == 0) goto L_0x00b1
            boolean r0 = r2.A04()
            if (r0 != r3) goto L_0x00b1
            return r2
        L_0x00c9:
            X.8XB r0 = X.AnonymousClass8XB.A00
            r2 = r16
            r1 = r17
            r14.BhM(r0, r2, r1)
            goto L_0x008b
        L_0x00d3:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1678182q.B4e(int, int, int):X.8Kh");
    }

    public void Bcl() {
        AnonymousClass8KL r0 = this.A01;
        if (r0 != null) {
            r0.close();
        }
        this.A06.clear();
    }

    public void BhM(AnonymousClass4GP r10, int i, int i2) {
        int i3;
        int i4;
        C1678482v r1;
        if (i > 0 && i2 > 0 && (i3 = this.A03) > 0 && (i4 = this.A02) > 0) {
            C186188ut r6 = this.A06;
            if (!r6.BH1()) {
                AtomicBoolean atomicBoolean = this.A09;
                if (!atomicBoolean.get() && SystemClock.uptimeMillis() >= this.A00) {
                    atomicBoolean.set(true);
                    if (this.A0B && (i < i3 || i2 < i4)) {
                        double d = ((double) i3) / ((double) i4);
                        if (i2 > i) {
                            if (i2 > i4) {
                                i2 = i4;
                            }
                            i4 = i2;
                            i3 = (int) (((double) i2) * d);
                        } else {
                            if (i > i3) {
                                i = i3;
                            }
                            i3 = i;
                            i4 = (int) (((double) i) / d);
                        }
                    }
                    AnonymousClass7FQ r12 = new AnonymousClass7FQ(i3, i4);
                    C172258Kh B54 = r6.B54(0);
                    if (B54 == null || !B54.A04()) {
                        AnonymousClass7FR r0 = this.A07;
                        int i5 = r12.A01;
                        int i6 = r12.A00;
                        r1 = new C1678482v(new C1678282s(this, r12, r10), C142446xD.HIGH, r0.A00, r0.A01, i5, i6, 1);
                    } else {
                        r1 = A00(r12, r10);
                    }
                    C155277eb.A01.execute(r1);
                    return;
                }
            }
            if (r6.BH1() && r10 != null) {
                r10.invoke();
            }
        }
    }

    public C1678182q(C184798sX r5, C186188ut r6, AnonymousClass7FR r7, int i, boolean z) {
        this.A07 = r7;
        this.A06 = r6;
        this.A0B = z;
        int frameCount = r5.getFrameCount();
        this.A04 = frameCount;
        C158637kJ r2 = ((C1677482j) r5).A00;
        C186338v8 r1 = r2.A06;
        this.A03 = r1.getWidth();
        this.A02 = r1.getHeight();
        int ceil = (int) ((float) Math.ceil((double) (((float) i) / ((float) (r2.A01 / frameCount)))));
        this.A05 = ceil < 2 ? 2 : ceil;
    }

    public void BhN(C187518xL r1, C186188ut r2, AnonymousClass7NW r3, AnonymousClass4GP r4, int i) {
    }
}
