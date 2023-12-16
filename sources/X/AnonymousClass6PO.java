package X;

import com.google.android.exoplayer2.Timeline;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;

/* renamed from: X.6PO  reason: invalid class name */
public final class AnonymousClass6PO extends AnonymousClass6PJ {
    public static final C151877Wq A09;
    public int A00 = -1;
    public C140546tv A01;
    public long[][] A02;
    public final C178118h0 A03;
    public final C185838uK A04;
    public final ArrayList A05;
    public final Map A06;
    public final Timeline[] A07;
    public final C186428vI[] A08;

    static {
        AnonymousClass7UC r1 = new AnonymousClass7UC();
        r1.A02 = "MergingMediaSource";
        A09 = r1.A00();
    }

    public AnonymousClass6PO(C186428vI... r2) {
        C1689587k r0 = new C1689587k();
        this.A08 = r2;
        this.A03 = r0;
        this.A05 = AnonymousClass0x2.A0i(r2);
        this.A07 = new Timeline[r2.length];
        this.A02 = new long[0][];
        this.A06 = AnonymousClass001.A0t();
        this.A04 = C161807qY.hashKeys().arrayListValues().build();
    }

    public C187628xY B0w(AnonymousClass6PS r13, C183888qp r14, long j) {
        C186428vI[] r9 = this.A08;
        int length = r9.length;
        C187628xY[] r5 = new C187628xY[length];
        Timeline[] timelineArr = this.A07;
        int A042 = timelineArr[0].A04(r13.A04);
        for (int i = 0; i < length; i++) {
            r5[i] = r9[i].B0w(r13.A00(timelineArr[i].A0C(A042)), r14, j - this.A02[A042][i]);
        }
        return new C1689987o(this.A03, this.A02[A042], r5);
    }

    public C151877Wq B9V() {
        C186428vI[] r1 = this.A08;
        if (r1.length > 0) {
            return r1[0].B9V();
        }
        return A09;
    }

    public void BL3() {
        C140546tv r0 = this.A01;
        if (r0 == null) {
            super.BL3();
            return;
        }
        throw r0;
    }

    public void Biv(C187628xY r5) {
        C1689987o r52 = (C1689987o) r5;
        int i = 0;
        while (true) {
            C186428vI[] r1 = this.A08;
            if (i < r1.length) {
                C186428vI r2 = r1[i];
                C187628xY r12 = r52.A07[i];
                if (r12 instanceof C1689887n) {
                    r12 = ((C1689887n) r12).A02;
                }
                r2.Biv(r12);
                i++;
            } else {
                return;
            }
        }
    }

    public void A00() {
        super.A00();
        Arrays.fill(this.A07, (Object) null);
        this.A00 = -1;
        this.A01 = null;
        ArrayList arrayList = this.A05;
        arrayList.clear();
        Collections.addAll(arrayList, this.A08);
    }

    public void A02(C178288hI r5) {
        super.A02(r5);
        int i = 0;
        while (true) {
            C186428vI[] r2 = this.A08;
            if (i < r2.length) {
                A03(r2[i], Integer.valueOf(i));
                i++;
            } else {
                return;
            }
        }
    }
}
