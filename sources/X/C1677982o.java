package X;

import java.util.Date;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

/* renamed from: X.82o  reason: invalid class name and case insensitive filesystem */
public final class C1677982o implements C185268tM {
    public int A00;
    public C158867kg A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final C184798sX A05;
    public final AnonymousClass7FO A06;
    public final C156167g9 A07;
    public final C151077Ti A08;
    public final String A09 = String.valueOf(hashCode());
    public final boolean A0A;

    public final AnonymousClass7FP A00(int i, int i2) {
        if (!this.A0A) {
            return new AnonymousClass7FP(this.A03, this.A02);
        }
        int i3 = this.A03;
        int i4 = this.A02;
        if (i < i3 || i2 < i4) {
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
        return new AnonymousClass7FP(i3, i4);
    }

    public final C158867kg A01() {
        C158867kg r5 = this.A01;
        if (r5 == null) {
            C156167g9 r52 = this.A07;
            String str = this.A09;
            C151077Ti r4 = this.A08;
            C184798sX r3 = this.A05;
            C162457s7.A0J(str, 0);
            ConcurrentHashMap concurrentHashMap = C156167g9.A02;
            synchronized (concurrentHashMap) {
                AnonymousClass7FT r0 = (AnonymousClass7FT) concurrentHashMap.get(str);
                if (r0 != null) {
                    concurrentHashMap.remove(str);
                    r5 = r0.A00;
                } else {
                    r5 = new C158867kg(r3, new AnonymousClass7R7(r52.A00), r4, r52.A01);
                }
            }
            this.A01 = r5;
        }
        return r5;
    }

    public void BhM(AnonymousClass4GP r3, int i, int i2) {
        if (i > 0 && i2 > 0 && this.A03 > 0 && this.A02 > 0) {
            AnonymousClass7FP A002 = A00(i, i2);
            C158867kg A012 = A01();
            int i3 = A002.A01;
            A012.A04(i3, i3);
        }
    }

    public C1677982o(C184798sX r8, C156167g9 r9, C151077Ti r10, boolean z) {
        this.A05 = r8;
        this.A08 = r10;
        this.A07 = r9;
        this.A0A = z;
        C158637kJ r5 = ((C1677482j) r8).A00;
        C186338v8 r1 = r5.A06;
        this.A03 = r1.getWidth();
        this.A02 = r1.getHeight();
        long millis = TimeUnit.SECONDS.toMillis(1) / ((long) (r5.A01 / r8.getFrameCount()));
        int i = (int) (millis < 1 ? 1 : millis);
        this.A04 = i;
        this.A00 = i;
        this.A06 = new AnonymousClass7FO(this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x00d9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C172258Kh B4e(int r11, int r12, int r13) {
        /*
            r10 = this;
            X.7FP r0 = r10.A00(r12, r13)
            X.7kg r4 = r10.A01()
            int r6 = r0.A01
            int r5 = r0.A00
            java.util.Map r0 = r4.A02
            java.lang.Object r2 = X.AnonymousClass001.A0i(r0, r11)
            java.lang.Number r2 = (java.lang.Number) r2
            r1 = 0
            if (r2 == 0) goto L_0x00b9
            int r7 = r2.intValue()
            r4.A00 = r7
            java.util.concurrent.ConcurrentHashMap r0 = r4.A0A
            java.lang.Object r0 = r0.get(r2)
            X.8Kh r0 = (X.C172258Kh) r0
            if (r0 == 0) goto L_0x00c8
            X.8Kh r3 = r0.A02()
            if (r3 == 0) goto L_0x00c8
            X.7AL r2 = r4.A07
            java.util.List r0 = r4.A01
            boolean r0 = r0.isEmpty()
            r1 = 1056964608(0x3f000000, float:0.5)
            if (r0 == 0) goto L_0x00a9
            int r0 = r4.A04
            float r0 = (float) r0
            float r0 = r0 * r1
            int r9 = (int) r0
        L_0x003e:
            int r1 = r4.A04
            r0 = 0
            X.8Zj r1 = X.C175708Zk.A02(r0, r1)
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L_0x008b
            r0 = r1
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x008b
        L_0x0052:
            X.6vv r0 = X.C141656vv.SUCCESS
            X.7FS r5 = new X.7FS
            r5.<init>(r3, r0)
        L_0x0059:
            X.7FO r4 = r10.A06
            r3 = 0
            X.C162457s7.A0J(r4, r3)
            java.util.concurrent.ConcurrentHashMap r2 = X.C159927mh.A02
            boolean r0 = r2.contains(r4)
            if (r0 != 0) goto L_0x0072
            int r0 = r4.A00
            float r1 = (float) r0
            r0 = 1045220557(0x3e4ccccd, float:0.2)
            float r1 = r1 * r0
            int r0 = (int) r1
            X.AnonymousClass0x2.A1I(r4, r2, r0)
        L_0x0072:
            X.6vv r0 = r5.A01
            int r1 = r0.ordinal()
            if (r1 == r3) goto L_0x0088
            r0 = 1
            if (r1 == r0) goto L_0x0085
            java.util.concurrent.atomic.AtomicInteger r0 = X.C159927mh.A03
        L_0x007f:
            r0.incrementAndGet()
            X.8Kh r0 = r5.A00
            return r0
        L_0x0085:
            java.util.concurrent.atomic.AtomicInteger r0 = X.C159927mh.A04
            goto L_0x007f
        L_0x0088:
            java.util.concurrent.atomic.AtomicInteger r0 = X.C159927mh.A05
            goto L_0x007f
        L_0x008b:
            java.util.Iterator r8 = r1.iterator()
        L_0x008f:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0052
            r0 = r8
            X.3d2 r0 = (X.C72013d2) r0
            int r1 = r0.A00()
            int r1 = r1 + r9
            int r0 = r2.A00
            int r1 = r1 % r0
            if (r1 >= 0) goto L_0x00a3
            int r1 = r1 + r0
        L_0x00a3:
            if (r1 != r7) goto L_0x008f
            r4.A04(r6, r5)
            goto L_0x0052
        L_0x00a9:
            java.util.List r0 = r4.A01
            int r0 = r0.size()
            float r0 = (float) r0
            float r0 = r0 * r1
            int r1 = (int) r0
            java.util.List r0 = r4.A01
            int r9 = X.AnonymousClass000.A09(r0, r1)
            goto L_0x003e
        L_0x00b9:
            X.8KM r0 = r4.A02(r11)
            if (r0 == 0) goto L_0x00c5
            X.8Kh r0 = r0.A01
            X.8Kh r1 = r0.A02()
        L_0x00c5:
            r4.A00 = r11
            goto L_0x00d7
        L_0x00c8:
            r4.A04(r6, r5)
            X.8KM r0 = r4.A02(r7)
            if (r0 == 0) goto L_0x00e2
            X.8Kh r0 = r0.A01
            X.8Kh r1 = r0.A02()
        L_0x00d7:
            if (r1 == 0) goto L_0x00e2
            X.6vv r0 = X.C141656vv.NEAREST
        L_0x00db:
            X.7FS r5 = new X.7FS
            r5.<init>(r1, r0)
            goto L_0x0059
        L_0x00e2:
            X.6vv r0 = X.C141656vv.MISSING
            goto L_0x00db
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1677982o.B4e(int, int, int):X.8Kh");
    }

    public void Bcl() {
        Integer num;
        C158867kg A012 = A01();
        AnonymousClass8KM A022 = A012.A02(A012.A00);
        ConcurrentHashMap concurrentHashMap = A012.A0A;
        Set keySet = concurrentHashMap.keySet();
        C162457s7.A0D(keySet);
        if (A022 != null) {
            num = Integer.valueOf(A022.A00);
        } else {
            num = null;
        }
        for (Object next : C73723fy.A0C(C73823g8.A02(num, keySet))) {
            C172258Kh r0 = (C172258Kh) concurrentHashMap.get(next);
            if (r0 != null) {
                r0.close();
            }
            concurrentHashMap.remove(next);
        }
        C158867kg A013 = A01();
        String str = this.A09;
        C162457s7.A0J(str, 0);
        C156167g9.A02.put(str, new AnonymousClass7FT(A013, new Date()));
        this.A01 = null;
    }

    public void BhN(C187518xL r1, C186188ut r2, AnonymousClass7NW r3, AnonymousClass4GP r4, int i) {
    }
}
