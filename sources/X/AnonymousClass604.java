package X;

import com.whatsapp.businessdirectory.view.activity.BusinessDirectoryMapViewActivity;

/* renamed from: X.604  reason: invalid class name */
public final class AnonymousClass604 extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ BusinessDirectoryMapViewActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass604(BusinessDirectoryMapViewActivity businessDirectoryMapViewActivity) {
        super(1);
        this.this$0 = businessDirectoryMapViewActivity;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x009f, code lost:
        if (r14.A05() == false) goto L_0x00a1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r20) {
        /*
            r19 = this;
            r5 = r20
            X.7Y5 r5 = (X.AnonymousClass7Y5) r5
            java.lang.String r8 = "businessProfileSheet"
            r2 = r19
            if (r5 != 0) goto L_0x002d
            com.whatsapp.businessdirectory.view.activity.BusinessDirectoryMapViewActivity r0 = r2.this$0
            android.view.View r1 = r0.A02
            if (r1 != 0) goto L_0x0015
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r8)
            throw r0
        L_0x0015:
            r0 = 8
            r1.setVisibility(r0)
            com.whatsapp.businessdirectory.view.activity.BusinessDirectoryMapViewActivity r0 = r2.this$0
            com.google.android.material.bottomsheet.BottomSheetBehavior r1 = r0.A09
            if (r1 != 0) goto L_0x0027
            java.lang.String r0 = "bottomSheetBehavior"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0027:
            r0 = 5
            r1.A0S(r0)
            goto L_0x00c6
        L_0x002d:
            com.whatsapp.businessdirectory.view.activity.BusinessDirectoryMapViewActivity r4 = r2.this$0
            android.view.View r0 = r4.A02
            if (r0 != 0) goto L_0x0038
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r8)
            throw r0
        L_0x0038:
            r3 = 0
            r0.setVisibility(r3)
            com.google.android.material.bottomsheet.BottomSheetBehavior r1 = r4.A09
            if (r1 != 0) goto L_0x0047
            java.lang.String r0 = "bottomSheetBehavior"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0047:
            r0 = 3
            r1.A0S(r0)
            X.5e1 r14 = r5.A01
            X.4U2 r0 = r4.A0N
            java.lang.String r7 = "viewModel"
            if (r0 != 0) goto L_0x0058
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r7)
            throw r0
        L_0x0058:
            X.5Tn r0 = r0.A0Z
            X.5ZO r6 = r0.A02()
            if (r6 != 0) goto L_0x0064
            X.5ZO r6 = X.AnonymousClass5ZO.A01()
        L_0x0064:
            java.lang.Double r0 = r6.A04
            X.C162457s7.A0H(r0)
            double r0 = r0.doubleValue()
            java.lang.Double r5 = r6.A05
            X.C162457s7.A0H(r5)
            com.google.android.gms.maps.model.LatLng r10 = X.C86624Kv.A0H(r5, r0)
            X.5UV r1 = r4.A0H
            if (r1 == 0) goto L_0x00e5
            X.4U2 r0 = r4.A0N
            if (r0 != 0) goto L_0x0083
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r7)
            throw r0
        L_0x0083:
            X.5Tn r0 = r0.A0Z
            X.5ZO r0 = r0.A02()
            if (r0 != 0) goto L_0x008f
            X.5ZO r0 = X.AnonymousClass5ZO.A01()
        L_0x008f:
            int r16 = r0.A04()
            boolean r0 = r6.A09()
            if (r0 == 0) goto L_0x00a1
            boolean r0 = r14.A05()
            r17 = 1
            if (r0 != 0) goto L_0x00a3
        L_0x00a1:
            r17 = 0
        L_0x00a3:
            X.5Up r0 = r4.A0S
            if (r0 == 0) goto L_0x00de
            boolean r18 = r0.A03()
            X.8FH r11 = new X.8FH
            r11.<init>(r4)
            X.7mG r12 = new X.7mG
            r12.<init>(r3)
            X.8FK r13 = new X.8FK
            r13.<init>(r14)
            r15 = 11
            X.4wK r9 = new X.4wK
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r9.A03 = r3
            r1.A06(r9)
        L_0x00c6:
            com.whatsapp.businessdirectory.view.activity.BusinessDirectoryMapViewActivity r3 = r2.this$0
            android.view.View r2 = r3.A02
            if (r2 != 0) goto L_0x00d1
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r8)
            throw r0
        L_0x00d1:
            r1 = 27
            X.5rQ r0 = new X.5rQ
            r0.<init>(r3, r1)
            r2.post(r0)
            X.2wD r0 = X.C59022wD.A00
            return r0
        L_0x00de:
            java.lang.String r0 = "directoryGating"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x00e5:
            java.lang.String r0 = "businessProfileRowHelper"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass604.invoke(java.lang.Object):java.lang.Object");
    }
}
