package X;

import com.whatsapp.util.Log;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.9Tg  reason: invalid class name and case insensitive filesystem */
public class C194529Tg {
    public final C1906999m A00;
    public final C620933l A01;
    public final AnonymousClass9U5 A02;
    public final AnonymousClass9U4 A03;
    public final AnonymousClass4FS A04;

    public void A01() {
        if (this.A00.A0C()) {
            C620933l r1 = this.A01;
            if (r1.A01.A0H() - AnonymousClass0x2.A0B(r1.A03(), "payments_methods_last_sync_time") > C86654Ky.A09(TimeUnit.HOURS)) {
                this.A02.A08((AnonymousClass4EY) null);
            }
        }
    }

    public void A03(AnonymousClass7SP r3) {
        this.A02.A08(new C204519pU(r3, 1, this));
    }

    public AnonymousClass7YE A00() {
        C133706ho r0;
        List A09 = AnonymousClass9U4.A03(this.A03).A09();
        if (A09.isEmpty() || (r0 = (C133706ho) C18290x4.A0k(A09)) == null) {
            return null;
        }
        return new AnonymousClass7YE(r0);
    }

    public void A02(AnonymousClass4EY r4) {
        C195069Vt B9W = this.A03.A0G().B9W();
        if (B9W == null) {
            return;
        }
        if (AnonymousClass9U4.A03(B9W.A06).A0A().size() > 1 || B9W.A0A.A05.A03()) {
            B9W.A08.A00(r4);
        } else {
            B9W.A07.A00(r4);
        }
    }

    public boolean A04(String str) {
        if (str == null) {
            return true;
        }
        this.A03.A0J();
        Log.w("PAY: removeMerchantPaymentMethod for nonSmbApp!");
        return false;
    }

    public C194529Tg(C1906999m r1, C620933l r2, AnonymousClass9U5 r3, AnonymousClass9U4 r4, AnonymousClass4FS r5) {
        this.A04 = r5;
        this.A03 = r4;
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
    }
}
