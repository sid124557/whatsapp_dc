package X;

import android.content.Context;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1tT  reason: invalid class name and case insensitive filesystem */
public class C33651tT extends AnonymousClass5ZM {
    public final long A00;
    public final C620733j A01;
    public final C55972rD A02;
    public final Integer A03;
    public final WeakReference A04;
    public final WeakReference A05;
    public final List A06;
    public final boolean A07;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        long j;
        AnonymousClass5LM A022;
        C55972rD r9 = this.A02;
        Iterator it = this.A06.iterator();
        long j2 = 0;
        while (it.hasNext()) {
            C30471mV A0S = C18320x8.A0S(it);
            AnonymousClass33C A002 = C30471mV.A00(A0S);
            long j3 = A0S.A00;
            if (A002.A0Z) {
                j = 0;
            } else {
                String str = A002.A0I;
                j = 0;
                if (!(str == null || (A022 = r9.A0J.A02(str, 1)) == null)) {
                    j = A022.A0A;
                }
            }
            j2 += j3 - j;
        }
        return Long.valueOf(j2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001a, code lost:
        if ((r1 instanceof java.util.List) != false) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void A0C(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Number r11 = (java.lang.Number) r11
            java.lang.ref.WeakReference r0 = r10.A05
            java.lang.Object r9 = r0.get()
            android.widget.TextView r9 = (android.widget.TextView) r9
            java.lang.ref.WeakReference r0 = r10.A04
            java.lang.Object r8 = r0.get()
            android.content.Context r8 = (android.content.Context) r8
            if (r9 == 0) goto L_0x0056
            java.lang.Object r1 = r9.getTag()
            boolean r0 = r1 instanceof java.util.List
            if (r0 == 0) goto L_0x0056
        L_0x001c:
            java.util.List r0 = r10.A06
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x004b
            long r1 = r11.longValue()
            r6 = 0
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 > 0) goto L_0x0030
            long r1 = r10.A00
        L_0x0030:
            X.33j r5 = r10.A01
            boolean r4 = r10.A07
            java.lang.Integer r3 = r10.A03
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 > 0) goto L_0x0051
            java.lang.String r2 = ""
        L_0x003c:
            r1 = 1
            if (r3 != 0) goto L_0x004c
            if (r4 == 0) goto L_0x0048
            r0 = 2131890058(0x7f120f8a, float:1.9414797E38)
        L_0x0044:
            java.lang.String r2 = X.AnonymousClass0x2.A0X(r8, r2, r1, r0)
        L_0x0048:
            r9.setText(r2)
        L_0x004b:
            return
        L_0x004c:
            int r0 = r3.intValue()
            goto L_0x0044
        L_0x0051:
            java.lang.String r2 = X.AnonymousClass35V.A03(r5, r1)
            goto L_0x003c
        L_0x0056:
            r1 = 0
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C33651tT.A0C(java.lang.Object):void");
    }

    public C33651tT(Context context, TextView textView, C620733j r4, C55972rD r5, Integer num, List list, long j, boolean z) {
        this.A02 = r5;
        this.A01 = r4;
        this.A06 = list;
        this.A03 = num;
        this.A00 = j;
        this.A07 = z;
        this.A05 = AnonymousClass0x9.A14(textView);
        this.A04 = AnonymousClass0x9.A14(context);
    }
}
