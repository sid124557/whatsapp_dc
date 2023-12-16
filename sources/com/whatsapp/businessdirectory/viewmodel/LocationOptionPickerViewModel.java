package com.whatsapp.businessdirectory.viewmodel;

import X.AnonymousClass08M;
import X.AnonymousClass08N;
import X.AnonymousClass0x9;
import X.AnonymousClass4UC;
import X.AnonymousClass4w0;
import X.AnonymousClass5ZR;
import X.C06270Wx;
import X.C105085Tn;
import X.C105355Up;
import X.C111525iE;
import X.C184218rR;
import X.C54292oU;

public class LocationOptionPickerViewModel extends AnonymousClass08N implements C184218rR {
    public final AnonymousClass08M A00 = AnonymousClass08M.A01();
    public final C111525iE A01;
    public final AnonymousClass4w0 A02;
    public final C105085Tn A03;
    public final C54292oU A04;
    public final AnonymousClass5ZR A05;
    public final C105355Up A06;
    public final AnonymousClass4UC A07 = AnonymousClass0x9.A0b();

    public void A0D() {
        this.A01.A02(5, 1);
        if (!this.A06.A06()) {
            this.A02.A00();
        }
        C06270Wx.A03(this.A07, 5);
    }

    public void BVn() {
        this.A01.A02(3, 1);
        this.A02.A02(true);
        A0E();
    }

    public void BVo() {
        this.A01.A02(4, 1);
    }

    public final void A0E() {
        if (this.A05.A05()) {
            if (!this.A06.A06()) {
                this.A02.A00();
            }
            C06270Wx.A03(this.A07, 5);
            return;
        }
        C06270Wx.A04(this.A07, 1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x004b, code lost:
        if (((android.location.LocationManager) r4.A04.A00.getSystemService("location")).isProviderEnabled("gps") == false) goto L_0x004d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public LocationOptionPickerViewModel(android.app.Application r5, X.C111525iE r6, X.AnonymousClass4w0 r7, X.C105085Tn r8, X.C54292oU r9, X.AnonymousClass5ZR r10, X.C105355Up r11) {
        /*
            r4 = this;
            r4.<init>(r5)
            X.4UC r0 = X.AnonymousClass0x9.A0b()
            r4.A07 = r0
            X.08M r0 = X.AnonymousClass08M.A01()
            r4.A00 = r0
            r4.A04 = r9
            r4.A01 = r6
            r4.A05 = r10
            r4.A06 = r11
            r4.A03 = r8
            r4.A02 = r7
            java.util.ArrayList r2 = X.AnonymousClass001.A0s()
            X.6fl r3 = new X.6fl
            r3.<init>(r4)
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 31
            if (r1 < r0) goto L_0x004d
            boolean r0 = r10.A05()
            if (r0 == 0) goto L_0x004d
            java.lang.String r0 = "android.permission.ACCESS_FINE_LOCATION"
            int r0 = r10.A02(r0)
            if (r0 == 0) goto L_0x004d
            X.2oU r0 = r4.A04
            android.content.Context r1 = r0.A00
            java.lang.String r0 = "location"
            java.lang.Object r1 = r1.getSystemService(r0)
            android.location.LocationManager r1 = (android.location.LocationManager) r1
            java.lang.String r0 = "gps"
            boolean r0 = r1.isProviderEnabled(r0)
            r1 = 1
            if (r0 != 0) goto L_0x004e
        L_0x004d:
            r1 = 0
        L_0x004e:
            r3.A00 = r1
            r2.add(r3)
            X.6fk r0 = new X.6fk
            r0.<init>(r4)
            r2.add(r0)
            X.08M r0 = r4.A00
            r0.A0G(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.businessdirectory.viewmodel.LocationOptionPickerViewModel.<init>(android.app.Application, X.5iE, X.4w0, X.5Tn, X.2oU, X.5ZR, X.5Up):void");
    }
}
