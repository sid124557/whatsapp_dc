package X;

/* renamed from: X.6B9  reason: invalid class name */
public class AnonymousClass6B9 implements C181088m7 {
    public Object A00;
    public final int A01;

    public AnonymousClass6B9(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0107, code lost:
        r0 = r3.A0A;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void BOI() {
        /*
            r5 = this;
            int r0 = r5.A01
            switch(r0) {
                case 0: goto L_0x008f;
                case 1: goto L_0x0049;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r2 = r5.A00
            com.whatsapp.location.LocationPicker2 r2 = (com.whatsapp.location.LocationPicker2) r2
            X.5cU r0 = r2.A0X
            android.view.View r0 = r0.A0C
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0030
            X.5cU r0 = r2.A0X
            android.view.View r1 = r0.A0C
            r0 = 8
            r1.setVisibility(r0)
            X.5cU r0 = r2.A0X
            android.view.View r0 = r0.A0C
            int r0 = r0.getHeight()
            int r0 = -r0
            android.view.animation.TranslateAnimation r1 = X.C86604Kt.A0I(r0)
            X.5cU r0 = r2.A0X
            android.view.View r0 = r0.A0D
            r0.startAnimation(r1)
        L_0x0030:
            X.5Uv r0 = r2.A02
            X.C626936e.A06(r0)
            com.google.android.gms.maps.model.CameraPosition r0 = r0.A02()
            if (r0 == 0) goto L_0x0048
            com.google.android.gms.maps.model.LatLng r0 = r0.A03
            if (r0 == 0) goto L_0x0048
            X.5cU r4 = r2.A0X
            double r2 = r0.A00
            double r0 = r0.A01
            r4.A0E(r2, r0)
        L_0x0048:
            return
        L_0x0049:
            java.lang.Object r4 = r5.A00
            com.whatsapp.location.GroupChatLiveLocationsActivity2 r4 = (com.whatsapp.location.GroupChatLiveLocationsActivity2) r4
            X.5Uv r0 = r4.A06
            X.C626936e.A06(r0)
            X.5Uv r0 = r4.A06
            com.google.android.gms.maps.model.CameraPosition r3 = r0.A02()
            if (r3 == 0) goto L_0x0048
            float r1 = r4.A00
            r0 = 1084227584(0x40a00000, float:5.0)
            float r1 = r1 * r0
            int r2 = (int) r1
            float r1 = r3.A02
            float r0 = r0 * r1
            int r0 = (int) r0
            if (r2 == r0) goto L_0x006b
            r4.A00 = r1
            r4.A76()
        L_0x006b:
            X.5i6 r1 = r4.A0O
            X.7Hj r0 = r1.A0j
            if (r0 == 0) goto L_0x0075
            r0 = 0
            r1.A0W(r0)
        L_0x0075:
            X.5i6 r0 = r4.A0O
            X.5We r1 = r0.A0l
            if (r1 == 0) goto L_0x0048
            boolean r0 = r0.A0t
            if (r0 == 0) goto L_0x0048
            com.google.android.gms.maps.model.LatLng r0 = r1.A00()
            boolean r0 = r4.A7A(r0)
            if (r0 == 0) goto L_0x0048
            X.5i6 r0 = r4.A0O
            r0.A0C()
            return
        L_0x008f:
            java.lang.Object r3 = r5.A00
            com.whatsapp.businessdirectory.view.activity.DirectorySetLocationMapActivity r3 = (com.whatsapp.businessdirectory.view.activity.DirectorySetLocationMapActivity) r3
            X.5cT r0 = r3.A0B
            android.view.View r0 = r0.A01
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x00ba
            X.5cT r0 = r3.A0B
            android.view.View r1 = r0.A01
            r0 = 8
            r1.setVisibility(r0)
            X.5cT r0 = r3.A0B
            android.view.View r0 = r0.A01
            int r0 = r0.getHeight()
            int r0 = -r0
            android.view.animation.TranslateAnimation r1 = X.C86604Kt.A0I(r0)
            X.5cT r0 = r3.A0B
            android.view.View r0 = r0.A02
            r0.startAnimation(r1)
        L_0x00ba:
            X.5Uv r1 = r3.A01
            java.lang.String r0 = "DirectorySetLocationMapActivity/setUpMap map is not available"
            X.C626936e.A07(r1, r0)
            X.5cT r2 = r3.A0B
            X.5Uv r0 = r3.A01
            com.google.android.gms.maps.model.CameraPosition r0 = r0.A02()
            com.google.android.gms.maps.model.LatLng r0 = r0.A03
            double r0 = r0.A00
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r2.A09 = r0
            X.5cT r2 = r3.A0B
            X.5Uv r0 = r3.A01
            com.google.android.gms.maps.model.CameraPosition r0 = r0.A02()
            com.google.android.gms.maps.model.LatLng r0 = r0.A03
            double r0 = r0.A01
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r2.A0A = r0
            X.5cT r1 = r3.A0B
            X.5Uv r0 = r3.A01
            com.google.android.gms.maps.model.CameraPosition r0 = r0.A02()
            float r0 = r0.A02
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r1.A0B = r0
            X.5cT r0 = r3.A0B
            boolean r0 = r0.A0G
            if (r0 == 0) goto L_0x00ff
            r3.A77()
            return
        L_0x00ff:
            X.5Tn r0 = r3.A09
            X.5ZO r2 = r0.A01()
            if (r2 != 0) goto L_0x0111
            X.5TO r0 = r3.A0A
            X.5ZO r2 = r0.A00
            if (r2 != 0) goto L_0x0111
            X.5ZO r2 = r0.A01()
        L_0x0111:
            X.5cT r1 = r3.A0B
            java.lang.String r0 = r2.A08
            X.C626936e.A06(r0)
            r1.A03(r0)
            X.5cT r1 = r3.A0B
            r1.A08 = r2
            r0 = 1
            r1.A0G = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6B9.BOI():void");
    }
}
