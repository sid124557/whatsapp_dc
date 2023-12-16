package X;

import com.whatsapp.util.Log;

/* renamed from: X.0Ey  reason: invalid class name and case insensitive filesystem */
public final class C02120Ey extends C47722di {
    public boolean A00;
    public boolean A01;
    public final AnonymousClass0U8 A02;
    public final AnonymousClass33p A03;
    public final AnonymousClass1VX A04;
    public final AnonymousClass4FS A05;
    public final C34171uL A06;

    public C02120Ey(AnonymousClass0U8 r2, AnonymousClass33p r3, AnonymousClass1VX r4, AnonymousClass4FS r5, C34171uL r6) {
        C162457s7.A0J(r4, 1);
        C162457s7.A0J(r5, 2);
        C162457s7.A0J(r6, 3);
        C162457s7.A0J(r3, 4);
        C162457s7.A0J(r2, 5);
        this.A04 = r4;
        this.A05 = r5;
        this.A06 = r6;
        this.A03 = r3;
        this.A02 = r2;
    }

    public static final void A00(C02120Ey r4) {
        AnonymousClass0U8 r3 = r4.A02;
        r3.A01().edit().putBoolean("send_gpb_signal", true).apply();
        AnonymousClass0JO.A00(r3, r4.A03, r4.A04, r4.A06);
    }

    public static final boolean A02(AnonymousClass1VX r1) {
        return r1.A0X(4774);
    }

    public void A03() {
        if (!this.A00 && A02(this.A04)) {
            Log.i("GoogleBackupABPropsObserver/setGpbEligibleTimestamp");
            AnonymousClass0U8 r4 = this.A02;
            r4.A01().edit().putLong("bg_gpb_eligible_timestamp", System.currentTimeMillis()).apply();
            if (C06520Ya.A0E(this.A03)) {
                this.A05.BkM(new C11420jc(this));
            } else {
                r4.A02();
                return;
            }
        }
        if (!this.A01 && C06520Ya.A0I(this.A04) && !C06520Ya.A0E(this.A03)) {
            this.A02.A02();
        }
    }

    public void A04() {
        AnonymousClass1VX r1 = this.A04;
        this.A00 = A02(r1);
        this.A01 = C06520Ya.A0I(r1);
    }
}
