package X;

import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.HomeActivity;

/* renamed from: X.67j  reason: invalid class name and case insensitive filesystem */
public class C1231667j extends AnonymousClass0O5 {
    public Object A00;
    public Object A01;
    public final int A02;

    public C1231667j(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A01 = obj2;
        this.A00 = obj;
    }

    public void A04(RecyclerView recyclerView, int i, int i2) {
        if (this.A02 != 0) {
            super.A04(recyclerView, i, i2);
            return;
        }
        HomeActivity homeActivity = (HomeActivity) this.A00;
        homeActivity.A7c(i2 + homeActivity.A03, false, AnonymousClass001.A1T(((RecyclerView) this.A01).getScrollState()));
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A05(androidx.recyclerview.widget.RecyclerView r15, int r16) {
        /*
            r14 = this;
            int r0 = r14.A02
            r1 = r16
            if (r0 == 0) goto L_0x0038
            r0 = 0
            X.C162457s7.A0J(r15, r0)
            if (r16 != 0) goto L_0x00d1
            java.lang.Object r3 = r14.A01
            com.whatsapp.businessdirectory.view.activity.BusinessDirectorySERPMapViewActivity r3 = (com.whatsapp.businessdirectory.view.activity.BusinessDirectorySERPMapViewActivity) r3
            X.09n r2 = r3.A0C
            androidx.recyclerview.widget.RecyclerView r0 = r3.A02
            java.lang.String r1 = "horizontalBusinessListView"
            if (r0 != 0) goto L_0x001d
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r1)
            throw r0
        L_0x001d:
            X.0Xs r0 = r0.getLayoutManager()
            android.view.View r0 = r2.A03(r0)
            if (r0 == 0) goto L_0x00d1
            int r6 = X.C06440Xs.A03(r0)
            X.4U8 r4 = r3.A74()
            androidx.recyclerview.widget.RecyclerView r0 = r3.A02
            if (r0 != 0) goto L_0x0056
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r1)
            throw r0
        L_0x0038:
            r2 = 1
            if (r1 != r2) goto L_0x0044
            java.lang.Object r1 = r14.A00
            com.whatsapp.HomeActivity r1 = (com.whatsapp.HomeActivity) r1
            r0 = 0
            r1.A7c(r0, r2, r2)
            return
        L_0x0044:
            if (r16 != 0) goto L_0x00d1
            java.lang.Object r1 = r14.A00
            com.whatsapp.HomeActivity r1 = (com.whatsapp.HomeActivity) r1
            java.lang.Object r0 = r14.A01
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            int r0 = r0.computeVerticalScrollOffset()
            r1.Baw(r0)
            return
        L_0x0056:
            int r5 = r0.getHeight()
            android.app.Application r1 = r4.A00
            r0 = 1098907648(0x41800000, float:16.0)
            int r0 = X.AnonymousClass5YI.A04(r1, r0)
            int r5 = r5 + r0
            X.08M r3 = r4.A0H
            java.util.List r0 = X.C86644Kx.A0h(r3)
            if (r0 == 0) goto L_0x00dd
            java.lang.Object r1 = r0.get(r6)
            X.6lz r1 = (X.C136186lz) r1
        L_0x0071:
            boolean r0 = r1 instanceof X.C96414wK
            if (r0 == 0) goto L_0x00d4
            X.4wK r1 = (X.C96414wK) r1
            java.lang.Object r2 = r1.A00
            if (r2 == 0) goto L_0x0088
            X.5e2 r2 = (X.C109075e2) r2
        L_0x007d:
            r4.A07 = r2
            X.5UT r1 = r4.A08
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r1.A05(r2, r0)
        L_0x0088:
            X.5e2 r5 = r4.A07
            if (r5 == 0) goto L_0x00d1
            java.util.List r0 = X.C86644Kx.A0h(r3)
            if (r0 == 0) goto L_0x00d2
            int r3 = r0.size()
        L_0x0096:
            X.5iG r7 = r4.A0K
            int r2 = r6 + 1
            X.5ZO r0 = r4.A05
            java.lang.Integer r8 = X.AnonymousClass5ZO.A03(r0)
            java.util.LinkedHashMap r10 = X.C18320x8.A0r()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            java.lang.String r0 = "local_biz_count"
            r10.put(r0, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            java.lang.String r0 = "ranked_position"
            r10.put(r0, r1)
            r11 = 11
            r12 = 70
            r13 = 8
            r9 = 0
            r7.A09(r8, r9, r10, r11, r12, r13)
            X.5e0 r0 = r5.A0B
            X.5e1 r0 = r0.A03
            boolean r1 = X.AnonymousClass000.A1W(r0)
            X.5ZO r0 = r4.A05
            java.lang.Integer r0 = X.AnonymousClass5ZO.A03(r0)
            r7.A06(r0, r2, r3, r1)
        L_0x00d1:
            return
        L_0x00d2:
            r3 = 0
            goto L_0x0096
        L_0x00d4:
            boolean r0 = r1 instanceof X.C136046ll
            if (r0 == 0) goto L_0x0088
            X.6ll r1 = (X.C136046ll) r1
            X.5e2 r2 = r1.A00
            goto L_0x007d
        L_0x00dd:
            r1 = 0
            goto L_0x0071
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1231667j.A05(androidx.recyclerview.widget.RecyclerView, int):void");
    }
}
