package X;

import com.whatsapp.payments.ui.IndiaUpiBankPickerActivityOld;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.9Gi  reason: invalid class name and case insensitive filesystem */
public class C191759Gi extends AnonymousClass5ZM {
    public final String A00;
    public final ArrayList A01;
    public final List A02;
    public final /* synthetic */ IndiaUpiBankPickerActivityOld A03;

    public C191759Gi(IndiaUpiBankPickerActivityOld indiaUpiBankPickerActivityOld, String str, ArrayList arrayList, List list) {
        ArrayList arrayList2;
        this.A03 = indiaUpiBankPickerActivityOld;
        if (arrayList != null) {
            arrayList2 = AnonymousClass002.A0J(arrayList);
        } else {
            arrayList2 = null;
        }
        this.A01 = arrayList2;
        this.A00 = str;
        this.A02 = list;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0016, code lost:
        if (r1 != false) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void A0C(java.lang.Object r8) {
        /*
            r7 = this;
            java.util.List r8 = (java.util.List) r8
            com.whatsapp.payments.ui.IndiaUpiBankPickerActivityOld r5 = r7.A03
            r0 = 0
            r5.A09 = r0
            android.view.View r2 = r5.A00
            java.util.ArrayList r0 = r7.A01
            r6 = 8
            r4 = 0
            if (r0 == 0) goto L_0x0018
            boolean r1 = r0.isEmpty()
            r0 = 8
            if (r1 == 0) goto L_0x0019
        L_0x0018:
            r0 = 0
        L_0x0019:
            r2.setVisibility(r0)
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L_0x0053
            android.widget.TextView r3 = r5.A02
            r2 = 2131893369(0x7f121c79, float:1.9421513E38)
            java.lang.Object[] r1 = X.AnonymousClass002.A0L()
            java.lang.String r0 = r5.A0C
            r1[r4] = r0
            X.AnonymousClass001.A0y(r5, r3, r1, r2)
            android.widget.TextView r0 = r5.A02
            r0.setVisibility(r4)
            androidx.recyclerview.widget.RecyclerView r0 = r5.A03
        L_0x0039:
            r0.setVisibility(r6)
            com.facebook.shimmer.ShimmerFrameLayout r0 = r5.A05
            r0.setVisibility(r6)
            com.facebook.shimmer.ShimmerFrameLayout r0 = r5.A04
            r0.setVisibility(r6)
            X.956 r0 = r5.A08
            r0.A00 = r8
            r0.A05()
            androidx.recyclerview.widget.RecyclerView r0 = r5.A03
            r0.A0a(r4)
            return
        L_0x0053:
            androidx.recyclerview.widget.RecyclerView r0 = r5.A03
            r0.setVisibility(r4)
            android.widget.TextView r0 = r5.A02
            goto L_0x0039
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C191759Gi.A0C(java.lang.Object):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0047, code lost:
        if (X.C107155an.A04(r3.A00, r4.A0C(), r8.A00) != false) goto L_0x0049;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r9) {
        /*
            r8 = this;
            java.util.ArrayList r6 = X.AnonymousClass001.A0s()
            java.util.ArrayList r5 = r8.A01
            if (r5 == 0) goto L_0x000e
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L_0x0018
        L_0x000e:
            com.whatsapp.payments.ui.IndiaUpiBankPickerActivityOld r0 = r8.A03
            java.util.List r0 = r0.A0F
            if (r0 == 0) goto L_0x0018
            r6.addAll(r0)
        L_0x0017:
            return r6
        L_0x0018:
            java.util.List r0 = r8.A02
            if (r0 == 0) goto L_0x0017
            java.util.Iterator r7 = r0.iterator()
        L_0x0020:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0017
            java.lang.Object r4 = r7.next()
            X.6hu r4 = (X.C133766hu) r4
            java.lang.String r2 = r4.A0C()
            com.whatsapp.payments.ui.IndiaUpiBankPickerActivityOld r3 = r8.A03
            X.33j r1 = r3.A00
            r0 = 1
            boolean r0 = X.C107155an.A05(r1, r2, r5, r0)
            if (r0 != 0) goto L_0x0049
            java.lang.String r2 = r4.A0C()
            java.lang.String r1 = r8.A00
            X.33j r0 = r3.A00
            boolean r0 = X.C107155an.A04(r0, r2, r1)
            if (r0 == 0) goto L_0x004c
        L_0x0049:
            r6.add(r4)
        L_0x004c:
            X.4MC r0 = r8.A02
            boolean r0 = r0.isCancelled()
            if (r0 == 0) goto L_0x0020
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C191759Gi.A08(java.lang.Object[]):java.lang.Object");
    }
}
