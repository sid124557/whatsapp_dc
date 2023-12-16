package X;

import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: X.6Hi  reason: invalid class name and case insensitive filesystem */
public class C125316Hi extends AnonymousClass0R6 {
    public ArrayList A00;
    public AnonymousClass8J3[] A01;
    public final /* synthetic */ AnonymousClass8J5 A02;

    public C05570Ua BQR(ViewGroup viewGroup, int i) {
        AnonymousClass8J5 r0 = this.A02;
        if (i == 1) {
            return new AnonymousClass6J4(r0.A07, viewGroup, r0.A0B);
        }
        return new C125516Ii(r0.A07, viewGroup);
    }

    public C125316Hi(AnonymousClass8J5 r2, ArrayList arrayList, AnonymousClass8J3[] r4) {
        this.A02 = r2;
        this.A00 = arrayList;
        this.A01 = r4;
        A0E(true);
    }

    public long A0B(int i) {
        if (!this.A00) {
            return -1;
        }
        String str = ((C157327i7) this.A00.get(i)).A01;
        AnonymousClass8J5 r5 = this.A02;
        HashMap hashMap = r5.A0C;
        Number A0p = AnonymousClass0x9.A0p(str, hashMap);
        if (A0p == null) {
            long j = r5.A03;
            r5.A03 = 1 + j;
            A0p = Long.valueOf(j);
            hashMap.put(str, A0p);
        }
        return A0p.longValue();
    }

    public int A0G() {
        return this.A00.size();
    }

    public void A0J(C05570Ua r2) {
        if (r2 instanceof AnonymousClass6J4) {
            ((AnonymousClass6J4) r2).A07();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x01b9, code lost:
        if (r3 != 3) goto L_0x01bb;
     */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x01cc  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x01e8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BNf(X.C05570Ua r19, int r20) {
        /*
            r18 = this;
            r11 = r19
            r2 = r18
            r1 = r20
            int r0 = r2.getItemViewType(r1)
            if (r0 != 0) goto L_0x00cf
            X.6Ii r11 = (X.C125516Ii) r11
            java.util.ArrayList r0 = r2.A00
            java.lang.Object r5 = r0.get(r1)
            X.7i7 r5 = (X.C157327i7) r5
            X.8J5 r0 = r2.A02
            int r0 = r0.A00
            boolean r6 = r5.A00(r0)
            android.view.View r7 = r11.A01
            if (r6 == 0) goto L_0x00cc
            android.content.Context r4 = r7.getContext()
            android.content.Context r3 = r7.getContext()
            r1 = 2130970305(0x7f0406c1, float:1.7549316E38)
            r0 = 2131102149(0x7f0609c5, float:1.7816728E38)
            int r0 = X.AnonymousClass5Yj.A02(r3, r1, r0)
            int r0 = X.AnonymousClass0Y8.A04(r4, r0)
        L_0x0038:
            r7.setBackgroundColor(r0)
            X.8J3[] r1 = r2.A01
            int r0 = r5.A00
            r4 = r1[r0]
            android.widget.ImageView r3 = r11.A02
            boolean r0 = r4 instanceof X.C137906pS
            if (r0 == 0) goto L_0x0093
            r12 = r4
            X.6pS r12 = (X.C137906pS) r12
            r0 = 0
            X.C05040Rr.A00(r0, r3)
            X.2iT r0 = r12.A04
            java.lang.String r0 = r0.A0G
            r3.setTag(r0)
            X.8Jd r10 = new X.8Jd
            r10.<init>(r3, r12, r0)
            android.content.Context r9 = r12.A0B
            r8 = 2131894015(0x7f121eff, float:1.9422823E38)
            java.lang.Object[] r7 = X.AnonymousClass002.A0L()
            X.2iT r0 = r12.A04
            java.lang.String r1 = r0.A0I
            r0 = 0
            java.lang.String r0 = X.AnonymousClass002.A0F(r9, r1, r7, r0, r8)
            r3.setContentDescription(r0)
            r3.setSelected(r6)
            X.2sn r1 = r12.A06
            X.2iT r0 = r12.A04
            r1.A0B(r0, r10)
        L_0x0079:
            boolean r0 = r4 instanceof X.C137906pS
            if (r0 == 0) goto L_0x0091
            X.6pS r4 = (X.C137906pS) r4
            X.2iT r0 = r4.A04
            boolean r0 = r0.A08
        L_0x0083:
            android.view.View r1 = r11.A00
            int r0 = X.AnonymousClass001.A08(r0)
            r1.setVisibility(r0)
            r0 = 6
            X.C109495ei.A00(r3, r2, r5, r0)
        L_0x0090:
            return
        L_0x0091:
            r0 = 0
            goto L_0x0083
        L_0x0093:
            boolean r0 = r4 instanceof X.C137896pR
            if (r0 == 0) goto L_0x00a6
            r0 = 2131233691(0x7f080b9b, float:1.8083527E38)
            X.AnonymousClass6C7.A11(r3, r0, r6)
            android.content.Context r1 = r4.A0B
            r0 = 2131894010(0x7f121efa, float:1.9422813E38)
            X.C18300x5.A13(r1, r3, r0)
            goto L_0x0079
        L_0x00a6:
            boolean r0 = r4 instanceof X.C137916pT
            if (r0 == 0) goto L_0x00b9
            r0 = 2131231453(0x7f0802dd, float:1.8078987E38)
            X.AnonymousClass6C7.A11(r3, r0, r6)
            android.content.Context r1 = r4.A0B
            r0 = 2131894040(0x7f121f18, float:1.9422874E38)
            X.C18300x5.A13(r1, r3, r0)
            goto L_0x0079
        L_0x00b9:
            boolean r0 = r4 instanceof X.C137886pQ
            if (r0 != 0) goto L_0x0079
            r0 = 2131233682(0x7f080b92, float:1.8083508E38)
            X.AnonymousClass6C7.A11(r3, r0, r6)
            android.content.Context r1 = r4.A0B
            r0 = 2131894001(0x7f121ef1, float:1.9422794E38)
            X.C18300x5.A13(r1, r3, r0)
            goto L_0x0079
        L_0x00cc:
            r0 = 0
            goto L_0x0038
        L_0x00cf:
            X.6J4 r11 = (X.AnonymousClass6J4) r11
            java.util.ArrayList r0 = r2.A00
            java.lang.Object r10 = r0.get(r1)
            X.7i7 r10 = (X.C157327i7) r10
            android.view.View r9 = r11.A02
            r0 = 7
            X.C109495ei.A00(r9, r2, r10, r0)
            android.view.View r8 = r11.A03
            r0 = 8
            X.C109495ei.A00(r8, r2, r10, r0)
            android.view.View r7 = r11.A04
            r0 = 9
            X.C109495ei.A00(r7, r2, r10, r0)
            android.view.View r6 = r11.A05
            r0 = 10
            X.C109495ei.A00(r6, r2, r10, r0)
            X.8J5 r0 = r2.A02
            r17 = r0
            int r0 = r0.A00
            boolean r0 = r10.A00(r0)
            if (r0 == 0) goto L_0x01dc
            boolean r0 = r11.A00
            if (r0 == 0) goto L_0x01a0
            X.0A8 r5 = new X.0A8
            r5.<init>()
            r5.A09(r8)
            android.view.View r14 = r11.A01
            r5.A09(r14)
            r0 = 300(0x12c, double:1.48E-321)
            r5.A07(r0)
            X.0A7 r13 = new X.0A7
            r13.<init>()
            X.0AO r2 = new X.0AO
            r2.<init>()
            X.33j r0 = r11.A08
            r16 = r0
            boolean r1 = r16.A0T()
            r15 = 5
            r0 = 3
            if (r1 == 0) goto L_0x012d
            r0 = 5
        L_0x012d:
            r2.A0b(r0)
            r3 = 400(0x190, double:1.976E-321)
            r2.A07(r3)
            X.0AN r12 = new X.0AN
            r12.<init>()
            r0 = 100
            r12.A02 = r0
            r12.A07(r3)
            r13.A0b(r9)
            r13.A0c(r2)
            r13.A0c(r12)
            X.0A7 r12 = new X.0A7
            r12.<init>()
            X.0AO r2 = new X.0AO
            r2.<init>()
            boolean r16 = r16.A0T()
            if (r16 == 0) goto L_0x015b
            r15 = 3
        L_0x015b:
            r2.A0b(r15)
            r2.A07(r3)
            r2.A02 = r0
            X.0AN r3 = new X.0AN
            r3.<init>()
            r0 = 200(0xc8, double:9.9E-322)
            r3.A02 = r0
            r0 = 300(0x12c, double:1.48E-321)
            r3.A07(r0)
            r12.A0b(r6)
            r12.A0b(r7)
            r12.A0c(r2)
            r12.A0c(r3)
            android.view.View r0 = r11.A0H
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            X.AnonymousClass0XC.A02(r0, r5)
            android.view.ViewGroup r0 = r11.A07
            X.AnonymousClass0XC.A02(r0, r12)
            android.view.ViewGroup r0 = r11.A06
            X.AnonymousClass0XC.A02(r0, r13)
            r0 = 2131233697(0x7f080ba1, float:1.8083539E38)
            r14.setBackgroundResource(r0)
            r0 = 0
            r7.setVisibility(r0)
            r6.setVisibility(r0)
            r9.setVisibility(r0)
            r11.A00 = r0
        L_0x01a0:
            r0 = r17
            int r3 = r0.A00
            int r1 = r10.A00
            if (r3 < r1) goto L_0x01bb
            int r0 = r1 + 4
            if (r3 >= r0) goto L_0x01bb
            int r3 = r3 - r1
            r0 = 1
            r2 = 1
            if (r3 == 0) goto L_0x01bc
            r2 = 2
            if (r3 == r0) goto L_0x01bc
            if (r3 == r2) goto L_0x01da
            r0 = 3
            r2 = 8
            if (r3 == r0) goto L_0x01bc
        L_0x01bb:
            r2 = 0
        L_0x01bc:
            r0 = 0
            r9.setSelected(r0)
            r7.setSelected(r0)
            r8.setSelected(r0)
            r6.setSelected(r0)
            r1 = 1
            if (r2 == r1) goto L_0x01e8
            r0 = 2
            if (r2 == r0) goto L_0x01e4
            r0 = 4
            if (r2 == r0) goto L_0x01e0
            r0 = 8
            if (r2 != r0) goto L_0x0090
            r6.setSelected(r1)
            return
        L_0x01da:
            r2 = 4
            goto L_0x01bc
        L_0x01dc:
            r11.A07()
            goto L_0x01a0
        L_0x01e0:
            r7.setSelected(r1)
            return
        L_0x01e4:
            r8.setSelected(r1)
            return
        L_0x01e8:
            r9.setSelected(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C125316Hi.BNf(X.0Ua, int):void");
    }

    public int getItemViewType(int i) {
        return this.A00.get(i) instanceof C137816pJ ? 1 : 0;
    }
}
