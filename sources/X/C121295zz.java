package X;

import com.whatsapp.businessdirectory.view.activity.BusinessDirectoryMapViewActivity;

/* renamed from: X.5zz  reason: invalid class name and case insensitive filesystem */
public final class C121295zz extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ BusinessDirectoryMapViewActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C121295zz(BusinessDirectoryMapViewActivity businessDirectoryMapViewActivity) {
        super(1);
        this.this$0 = businessDirectoryMapViewActivity;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x007f, code lost:
        if (r3 != 2) goto L_0x000d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Number r7 = (java.lang.Number) r7
            com.whatsapp.businessdirectory.view.activity.BusinessDirectoryMapViewActivity r3 = r6.this$0
            int r0 = X.C86644Kx.A07(r7)
            r2 = 0
            r4 = 0
            switch(r0) {
                case 0: goto L_0x0010;
                case 1: goto L_0x0031;
                case 2: goto L_0x0035;
                case 3: goto L_0x0065;
                case 4: goto L_0x000d;
                case 5: goto L_0x008a;
                case 6: goto L_0x0094;
                case 7: goto L_0x00bb;
                case 8: goto L_0x00c1;
                case 9: goto L_0x00fc;
                case 10: goto L_0x000d;
                case 11: goto L_0x010d;
                default: goto L_0x000d;
            }
        L_0x000d:
            X.2wD r0 = X.C59022wD.A00
            return r0
        L_0x0010:
            com.whatsapp.businessdirectory.util.DirectoryMapViewLocationUpdateListener r0 = r3.A0F
            if (r0 == 0) goto L_0x0135
            r0.A00()
            java.lang.Runnable r1 = r3.A0T
            if (r1 == 0) goto L_0x0020
            android.os.Handler r0 = r3.A0W
            r0.removeCallbacks(r1)
        L_0x0020:
            r0 = 26
            X.5rQ r4 = new X.5rQ
            r4.<init>(r3, r0)
            r3.A0T = r4
            android.os.Handler r2 = r3.A0W
            r0 = 15000(0x3a98, double:7.411E-320)
            r2.postDelayed(r4, r0)
            goto L_0x000d
        L_0x0031:
            r3.A78(r2)
            goto L_0x000d
        L_0x0035:
            X.33p r0 = r3.A09
            java.lang.String[] r1 = X.C622534h.A09
            boolean r0 = com.whatsapp.RequestPermissionActivity.A0t(r0, r1)
            if (r0 == 0) goto L_0x0052
            boolean r0 = com.whatsapp.RequestPermissionActivity.A0p(r3, r1)
            if (r0 != 0) goto L_0x0052
            X.5Mu r1 = r3.A0J
            if (r1 == 0) goto L_0x013c
            X.5jY r0 = new X.5jY
            r0.<init>(r3)
            r1.A00(r3, r0, r2)
            goto L_0x000d
        L_0x0052:
            X.5UF r1 = X.AnonymousClass5UF.A01(r3)
            r0 = 2131892381(0x7f12189d, float:1.9419509E38)
            r1.A02 = r0
            android.content.Intent r1 = r1.A02()
            r0 = 34
            r3.startActivityForResult(r1, r0)
            goto L_0x000d
        L_0x0065:
            com.whatsapp.businessdirectory.util.DirectoryMapViewLocationUpdateListener r0 = r3.A0F
            if (r0 == 0) goto L_0x0143
            r0.A00()
            X.4ug r4 = r3.A0Q
            if (r4 != 0) goto L_0x0077
            java.lang.String r0 = "facebookMapView"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0077:
            int r3 = r4.A02
            r1 = 1
            if (r3 == 0) goto L_0x0086
            if (r3 == r1) goto L_0x0082
            r0 = 2
            if (r3 == r0) goto L_0x0086
            goto L_0x000d
        L_0x0082:
            r4.setLocationMode(r2)
            goto L_0x000d
        L_0x0086:
            r4.setLocationMode(r1)
            goto L_0x000d
        L_0x008a:
            X.3Wi r1 = r3.A05
            r0 = 2131886743(0x7f120297, float:1.9408073E38)
            r1.A0H(r0, r2)
            goto L_0x000d
        L_0x0094:
            X.3Wi r1 = r3.A05
            r0 = 2131886744(0x7f120298, float:1.9408075E38)
            r1.A0H(r0, r2)
            com.whatsapp.TextEmojiLabel r1 = r3.A0B
            java.lang.String r0 = "mapViewChipText"
            if (r1 != 0) goto L_0x00a7
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x00a7:
            r1.setVisibility(r2)
            com.whatsapp.TextEmojiLabel r1 = r3.A0B
            if (r1 != 0) goto L_0x00b3
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x00b3:
            r0 = 2131893203(0x7f121bd3, float:1.9421176E38)
            r1.setText(r0)
            goto L_0x000d
        L_0x00bb:
            r0 = 1
            r3.A78(r0)
            goto L_0x000d
        L_0x00c1:
            java.lang.String r0 = "android.permission.ACCESS_FINE_LOCATION"
            boolean r5 = X.C005205m.A03(r3, r0)
            r1 = 2131892380(0x7f12189c, float:1.9419507E38)
            r2 = 2131886703(0x7f12026f, float:1.9407992E38)
            if (r5 == 0) goto L_0x00d5
            r1 = 2131892379(0x7f12189b, float:1.9419505E38)
            r2 = 2131886794(0x7f1202ca, float:1.9408177E38)
        L_0x00d5:
            X.0zH r4 = X.AnonymousClass5V0.A00(r3)
            r0 = 2131886790(0x7f1202c6, float:1.9408169E38)
            r4.A0U(r0)
            r4.A0T(r1)
            r1 = 0
            X.914 r0 = new X.914
            r0.<init>(r1, r3, r5)
            r4.A0Y(r0, r2)
            r2 = 2131891264(0x7f121440, float:1.9417243E38)
            r1 = 6
            X.90p r0 = new X.90p
            r0.<init>(r1)
            r4.A0W(r0, r2)
            X.C18280x3.A0q(r4)
            goto L_0x000d
        L_0x00fc:
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r1 = "location_permission_changed"
            boolean r0 = r3.A0V
            android.content.Intent r0 = r2.putExtra(r1, r0)
            X.AnonymousClass0x2.A0m(r3, r0)
            goto L_0x000d
        L_0x010d:
            X.4U2 r1 = r3.A0N
            if (r1 != 0) goto L_0x0116
            java.lang.RuntimeException r0 = X.C86604Kt.A0j()
            throw r0
        L_0x0116:
            X.4Zb r0 = r1.A07
            if (r0 == 0) goto L_0x0120
            X.7yS r0 = r0.A04
            X.5e1 r0 = r0.A03
            if (r0 != 0) goto L_0x0128
        L_0x0120:
            X.4Za r0 = r1.A08
            if (r0 == 0) goto L_0x000d
            X.5e1 r0 = r0.A0E
            if (r0 == 0) goto L_0x000d
        L_0x0128:
            X.5U9 r2 = r3.A0E
            if (r2 == 0) goto L_0x014a
            java.lang.String r1 = r0.A0F
            android.view.View r0 = r3.A00
            r2.A02(r0, r4, r4, r1)
            goto L_0x000d
        L_0x0135:
            java.lang.String r0 = "locationUpdateListener"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x013c:
            java.lang.String r0 = "locationInfoDialogHelper"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0143:
            java.lang.String r0 = "locationUpdateListener"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x014a:
            java.lang.String r0 = "businessProfileSyncUtil"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C121295zz.invoke(java.lang.Object):java.lang.Object");
    }
}
