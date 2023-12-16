package X;

import android.location.LocationManager;

/* renamed from: X.5jc  reason: invalid class name and case insensitive filesystem */
public class C112365jc implements C185638u0, C184158rL {
    public boolean A00 = true;
    public final AnonymousClass5QV A01;
    public final AnonymousClass5U8 A02;
    public final C149357Md A03;
    public final C54292oU A04;
    public final AnonymousClass5ZR A05;
    public final C186568vZ A06;

    public void BVs(AnonymousClass7KT r11) {
        Number A0i;
        Number A0i2;
        AnonymousClass5U8 r2 = this.A02;
        AnonymousClass4UC r1 = r2.A06;
        if (r1.A07() != null && (A0i = C86654Ky.A0i(r1)) != null && A0i.intValue() == 0) {
            this.A01.A01(r11.A01, this, (AnonymousClass5ZI) null, r11.A02, "device", r11.A00);
            if (r1.A07() != null && (A0i2 = C86654Ky.A0i(r1)) != null && A0i2.intValue() == 0) {
                C06270Wx.A03(r1, 2);
                r2.A01.removeCallbacks(r2.A08);
            }
        }
    }

    public void A00() {
        AnonymousClass4UC r1;
        int i;
        boolean isProviderEnabled = ((LocationManager) this.A04.A00.getSystemService("location")).isProviderEnabled("network");
        AnonymousClass5U8 r2 = this.A02;
        boolean A032 = r2.A03();
        if (isProviderEnabled) {
            if (A032) {
                r1 = r2.A06;
                i = 5;
            } else {
                return;
            }
        } else if (A032) {
            r1 = r2.A06;
            i = 6;
        } else {
            return;
        }
        C06270Wx.A04(r1, i);
        r2.A01.postDelayed(r2.A08, 20000);
    }

    public void B3A() {
        this.A02.A02();
        this.A06.markerPoint(207368785, "fetch_user_location_request_start");
    }

    public void BUU(AnonymousClass7T4 r6, int i) {
        AnonymousClass5U8 r4 = this.A02;
        AnonymousClass08M r3 = r4.A02;
        Number A0i = C86654Ky.A0i(r3);
        if (A0i != null && A0i.intValue() == 7) {
            int i2 = 3;
            if (i == -1) {
                i2 = 5;
            }
            r4.A01.removeCallbacks(r4.A08);
            Number A0i2 = C86654Ky.A0i(r3);
            if (A0i2 != null && A0i2.intValue() == 7) {
                C06270Wx.A04(r4.A06, 7);
            }
            C06270Wx.A03(r3, i2);
        }
    }

    public void BUV(AnonymousClass5ZO r5) {
        boolean z;
        AnonymousClass5U8 r3 = this.A02;
        C162457s7.A0J(r5, 0);
        r3.A01.removeCallbacks(r3.A08);
        C18290x4.A1M(r3.A07, r3, r5, 44);
        Number A0i = C86654Ky.A0i(r3.A02);
        if (A0i == null || A0i.intValue() != 7) {
            C149357Md r1 = this.A03;
            synchronized (r1) {
                z = r1.A02;
            }
            if (z) {
                return;
            }
        }
        this.A00 = false;
    }

    public void BVl() {
        boolean isProviderEnabled = ((LocationManager) this.A04.A00.getSystemService("location")).isProviderEnabled("gps");
        AnonymousClass5U8 r1 = this.A02;
        if (isProviderEnabled) {
            r1.A02();
        } else if (r1.A03()) {
            C06270Wx.A04(r1.A06, 4);
        }
    }

    public void BVp() {
        this.A02.A01();
    }

    public void Brw() {
        AnonymousClass5U8 r3 = this.A02;
        r3.A07.BkM(new C117125rQ(r3, 35));
    }

    public C112365jc(AnonymousClass5MD r2, AnonymousClass5TO r3, C111515iD r4, C111505iC r5, C149357Md r6, C54292oU r7, AnonymousClass5ZR r8, C186568vZ r9, AnonymousClass4FS r10) {
        this.A04 = r7;
        this.A05 = r8;
        this.A06 = r9;
        this.A03 = r6;
        this.A01 = r2.A00(r5, r4);
        this.A02 = new AnonymousClass5U8(r3, r6, r8, r10);
    }
}
