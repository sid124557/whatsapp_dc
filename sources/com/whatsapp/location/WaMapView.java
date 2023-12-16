package com.whatsapp.location;

import X.AnonymousClass1n9;
import X.AnonymousClass4L0;
import X.AnonymousClass4PH;
import X.AnonymousClass6FD;
import X.AnonymousClass6FV;
import X.AnonymousClass6TJ;
import X.AnonymousClass7AD;
import X.AnonymousClass7BV;
import X.C107585bY;
import X.C110875hB;
import X.C111025hQ;
import X.C28071fd;
import X.C30801n8;
import X.C54942pX;
import android.content.Context;
import android.util.AttributeSet;
import com.google.android.gms.maps.model.LatLng;
import com.whatsapp.R;

public class WaMapView extends AnonymousClass6FV {
    public static AnonymousClass7AD A02;
    public static AnonymousClass7BV A03;
    public AnonymousClass4PH A00;
    public AnonymousClass6FD A01;

    public void setupGoogleMap(AnonymousClass6FD r7, LatLng latLng, AnonymousClass6TJ r9) {
        r7.A08(new C107585bY(r7, latLng, r9, this, 0));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (r9.A00 != 0.0d) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(com.google.android.gms.maps.model.LatLng r9, X.AnonymousClass6TJ r10, X.C28071fd r11) {
        /*
            r8 = this;
            double r0 = r9.A01
            r4 = 0
            r6 = 0
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 != 0) goto L_0x0010
            double r2 = r9.A00
            int r5 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            r2 = 0
            if (r5 == 0) goto L_0x0011
        L_0x0010:
            r2 = 1
        L_0x0011:
            r8.setVisibility(r4)
            if (r2 == 0) goto L_0x0123
            android.content.Context r2 = r8.getContext()
            boolean r2 = r11.A05(r2)
            if (r2 == 0) goto L_0x00cf
            X.6FD r0 = r8.A01     // Catch:{ IncompatibleClassChangeError -> 0x00ca }
            if (r0 != 0) goto L_0x0071
            boolean r0 = r8 instanceof X.AnonymousClass4un     // Catch:{ IncompatibleClassChangeError -> 0x00ca }
            if (r0 == 0) goto L_0x0086
            com.google.android.gms.maps.GoogleMapOptions r2 = new com.google.android.gms.maps.GoogleMapOptions     // Catch:{ IncompatibleClassChangeError -> 0x00ca }
            r2.<init>()     // Catch:{ IncompatibleClassChangeError -> 0x00ca }
            r0 = 1
            r2.A00 = r0     // Catch:{ IncompatibleClassChangeError -> 0x00ca }
            java.lang.Boolean r0 = X.C18320x8.A0U()     // Catch:{ IncompatibleClassChangeError -> 0x00ca }
            r2.A0C = r0     // Catch:{ IncompatibleClassChangeError -> 0x00ca }
            r2.A05 = r0     // Catch:{ IncompatibleClassChangeError -> 0x00ca }
            r2.A08 = r0     // Catch:{ IncompatibleClassChangeError -> 0x00ca }
            r2.A06 = r0     // Catch:{ IncompatibleClassChangeError -> 0x00ca }
            r2.A0A = r0     // Catch:{ IncompatibleClassChangeError -> 0x00ca }
            r2.A09 = r0     // Catch:{ IncompatibleClassChangeError -> 0x00ca }
            r2.A07 = r0     // Catch:{ IncompatibleClassChangeError -> 0x00ca }
            android.content.Context r0 = r8.getContext()     // Catch:{ IncompatibleClassChangeError -> 0x00ca }
            X.C154947e0.A00(r0)     // Catch:{ IncompatibleClassChangeError -> 0x00ca }
            android.content.Context r0 = r8.getContext()     // Catch:{ IncompatibleClassChangeError -> 0x00ca }
            X.6FD r1 = new X.6FD     // Catch:{ IncompatibleClassChangeError -> 0x00ca }
            r1.<init>(r0, r2)     // Catch:{ IncompatibleClassChangeError -> 0x00ca }
        L_0x0052:
            r8.A01 = r1     // Catch:{ IncompatibleClassChangeError -> 0x00ca }
            boolean r0 = r11.A00     // Catch:{ IncompatibleClassChangeError -> 0x00ca }
            if (r0 != 0) goto L_0x007c
            android.view.ViewTreeObserver r2 = r1.getViewTreeObserver()     // Catch:{ IncompatibleClassChangeError -> 0x00ca }
            r1 = 1
            X.4Ic r0 = new X.4Ic     // Catch:{ IncompatibleClassChangeError -> 0x00ca }
            r0.<init>(r11, r1, r8)     // Catch:{ IncompatibleClassChangeError -> 0x00ca }
            r2.addOnPreDrawListener(r0)     // Catch:{ IncompatibleClassChangeError -> 0x00ca }
        L_0x0065:
            X.6FD r1 = r8.A01     // Catch:{ IncompatibleClassChangeError -> 0x00ca }
            r0 = 4
            r1.setVisibility(r0)     // Catch:{ IncompatibleClassChangeError -> 0x00ca }
            X.6FD r1 = r8.A01     // Catch:{ IncompatibleClassChangeError -> 0x00ca }
            r0 = -1
            r8.addView(r1, r0, r0)     // Catch:{ IncompatibleClassChangeError -> 0x00ca }
        L_0x0071:
            X.6FD r1 = r8.A01     // Catch:{ IncompatibleClassChangeError -> 0x00ca }
            X.8B8 r0 = new X.8B8     // Catch:{ IncompatibleClassChangeError -> 0x00ca }
            r0.<init>(r9, r10, r8)     // Catch:{ IncompatibleClassChangeError -> 0x00ca }
            r1.A08(r0)     // Catch:{ IncompatibleClassChangeError -> 0x00ca }
            goto L_0x00c9
        L_0x007c:
            r0 = 0
            r1.A06(r0)     // Catch:{ IncompatibleClassChangeError -> 0x00ca }
            X.6FD r0 = r8.A01     // Catch:{ IncompatibleClassChangeError -> 0x00ca }
            r0.A05()     // Catch:{ IncompatibleClassChangeError -> 0x00ca }
            goto L_0x0065
        L_0x0086:
            com.google.android.gms.maps.GoogleMapOptions r3 = new com.google.android.gms.maps.GoogleMapOptions     // Catch:{ IncompatibleClassChangeError -> 0x00ca }
            r3.<init>()     // Catch:{ IncompatibleClassChangeError -> 0x00ca }
            X.7Wd r1 = new X.7Wd     // Catch:{ IncompatibleClassChangeError -> 0x00ca }
            r1.<init>()     // Catch:{ IncompatibleClassChangeError -> 0x00ca }
            r1.A01(r9)     // Catch:{ IncompatibleClassChangeError -> 0x00ca }
            r0 = 1097859072(0x41700000, float:15.0)
            r1.A00 = r0     // Catch:{ IncompatibleClassChangeError -> 0x00ca }
            com.google.android.gms.maps.model.CameraPosition r2 = r1.A00()     // Catch:{ IncompatibleClassChangeError -> 0x00ca }
            r1 = 1
            r3.A00 = r1     // Catch:{ IncompatibleClassChangeError -> 0x00ca }
            java.lang.Boolean r0 = X.C18320x8.A0U()     // Catch:{ IncompatibleClassChangeError -> 0x00ca }
            r3.A0C = r0     // Catch:{ IncompatibleClassChangeError -> 0x00ca }
            r3.A05 = r0     // Catch:{ IncompatibleClassChangeError -> 0x00ca }
            r3.A08 = r0     // Catch:{ IncompatibleClassChangeError -> 0x00ca }
            r3.A06 = r0     // Catch:{ IncompatibleClassChangeError -> 0x00ca }
            r3.A0A = r0     // Catch:{ IncompatibleClassChangeError -> 0x00ca }
            r3.A09 = r0     // Catch:{ IncompatibleClassChangeError -> 0x00ca }
            r3.A07 = r0     // Catch:{ IncompatibleClassChangeError -> 0x00ca }
            r3.A01 = r2     // Catch:{ IncompatibleClassChangeError -> 0x00ca }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)     // Catch:{ IncompatibleClassChangeError -> 0x00ca }
            r3.A0B = r0     // Catch:{ IncompatibleClassChangeError -> 0x00ca }
            android.content.Context r0 = r8.getContext()     // Catch:{ IncompatibleClassChangeError -> 0x00ca }
            X.C154947e0.A00(r0)     // Catch:{ IncompatibleClassChangeError -> 0x00ca }
            android.content.Context r0 = r8.getContext()     // Catch:{ IncompatibleClassChangeError -> 0x00ca }
            X.6FD r1 = new X.6FD     // Catch:{ IncompatibleClassChangeError -> 0x00ca }
            r1.<init>(r0, r3)     // Catch:{ IncompatibleClassChangeError -> 0x00ca }
            goto L_0x0052
        L_0x00c9:
            return
        L_0x00ca:
            r0 = move-exception
            com.whatsapp.util.Log.i((java.lang.Throwable) r0)
            return
        L_0x00cf:
            X.4PH r2 = r8.A00
            if (r2 != 0) goto L_0x0118
            X.7Sg r5 = new X.7Sg
            r5.<init>()
            double r2 = r9.A00
            X.5ds r0 = X.C108975ds.A00(r2, r0)
            r5.A02 = r0
            r0 = 1097859072(0x41700000, float:15.0)
            r5.A01 = r0
            X.7yk r1 = r5.A00()
            X.7Pa r2 = new X.7Pa
            r2.<init>()
            r0 = 1
            r2.A00 = r0
            r2.A08 = r4
            r2.A05 = r4
            r2.A07 = r4
            r2.A02 = r1
            java.lang.String r0 = "whatsapp_consumer"
            r2.A04 = r0
            android.content.Context r0 = r8.getContext()
            r11.A04(r0)
            android.content.Context r0 = r8.getContext()
            X.4ug r1 = new X.4ug
            r1.<init>(r0, r2)
            r8.A00 = r1
            r0 = 0
            r1.A0E(r0)
            X.4PH r1 = r8.A00
            r0 = -1
            r8.addView(r1, r0, r0)
        L_0x0118:
            X.4PH r2 = r8.A00
            r1 = 4
            X.5ba r0 = new X.5ba
            r0.<init>(r9, r1, r8)
            r2.A0G(r0)
        L_0x0123:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.location.WaMapView.A01(com.google.android.gms.maps.model.LatLng, X.6TJ, X.1fd):void");
    }

    public void A02(C28071fd r5, C30801n8 r6, boolean z) {
        double d;
        double d2;
        AnonymousClass6TJ A002;
        C54942pX r2;
        if (z || (r2 = r6.A02) == null) {
            d = r6.A00;
            d2 = r6.A01;
        } else {
            d = r2.A00;
            d2 = r2.A01;
        }
        LatLng A0H = AnonymousClass4L0.A0H(d, d2);
        if (z) {
            A002 = null;
        } else {
            A002 = AnonymousClass6TJ.A00(getContext(), R.raw.expired_map_style_json);
        }
        A01(A0H, A002, r5);
    }

    public void A03(C28071fd r5, AnonymousClass1n9 r6) {
        LatLng A0H = AnonymousClass4L0.A0H(r6.A00, r6.A01);
        A01(A0H, (AnonymousClass6TJ) null, r5);
        A00(A0H);
    }

    public AnonymousClass4PH getFacebookMapView() {
        return this.A00;
    }

    public void A00(LatLng latLng) {
        String string = getContext().getString(R.string.f11nameremoved);
        AnonymousClass6FD r1 = this.A01;
        if (r1 != null) {
            r1.A08(new C111025hQ(latLng, string));
            return;
        }
        AnonymousClass4PH r12 = this.A00;
        if (r12 != null) {
            r12.A0G(new C110875hB(latLng, string));
        }
    }

    public WaMapView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public WaMapView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public WaMapView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public WaMapView(Context context) {
        super(context);
    }
}
