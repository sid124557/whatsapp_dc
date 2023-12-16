package X;

import android.util.SparseArray;

/* renamed from: X.82p  reason: invalid class name and case insensitive filesystem */
public final class C1678082p implements C185268tM {
    public final int A00;

    public void Bcl() {
    }

    public void BhN(C187518xL r14, C186188ut r15, AnonymousClass7NW r16, AnonymousClass4GP r17, int i) {
        int i2 = this.A00;
        int i3 = 1;
        while (true) {
            C187518xL r8 = r14;
            int frameCount = (i + i3) % r14.getFrameCount();
            if (C161577py.A00.BI0(2)) {
                C161577py.A01(C1678082p.class, Integer.valueOf(frameCount), Integer.valueOf(i), "Preparing frame %d, last drawn: %d");
            }
            int A04 = C18300x5.A04(r14) + frameCount;
            AnonymousClass7NW r7 = r16;
            SparseArray sparseArray = r7.A01;
            synchronized (sparseArray) {
                if (sparseArray.get(A04) != null) {
                    C161577py.A02(AnonymousClass7NW.class, Integer.valueOf(frameCount), "Already scheduled decode job for frame %d");
                } else {
                    C186188ut r9 = r15;
                    if (r15.Aza(frameCount)) {
                        C161577py.A02(AnonymousClass7NW.class, Integer.valueOf(frameCount), "Frame %d is cached already.");
                    } else {
                        C117685sK r6 = new C117685sK(r7, r8, r9, frameCount, A04, 0);
                        sparseArray.put(A04, r6);
                        r7.A04.execute(r6);
                    }
                }
            }
            if (i3 != i2) {
                i3++;
            } else {
                return;
            }
        }
    }

    public C1678082p(int i) {
        this.A00 = i;
    }

    public C172258Kh B4e(int i, int i2, int i3) {
        return null;
    }

    public void BhM(AnonymousClass4GP r1, int i, int i2) {
    }

    public C1678082p() {
        this(3);
    }
}
