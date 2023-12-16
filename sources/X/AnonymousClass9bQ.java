package X;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;

/* renamed from: X.9bQ  reason: invalid class name */
public class AnonymousClass9bQ implements AnonymousClass4EY, C203189nG {
    public AnonymousClass4DI A00;
    public AnonymousClass9U4 A01;
    public AnonymousClass9H0 A02;
    public final C89644eZ A03;
    public final C194539Ti A04;
    public final C1906899l A05;
    public final C1906999m A06;
    public final C194489Tb A07;
    public final C620933l A08;
    public final C29271iY A09;
    public final AnonymousClass9U5 A0A;
    public final AnonymousClass9b0 A0B;
    public final C160757oG A0C = C160757oG.A00("PaymentDataPresenter", "payment", "COMMON");
    public final AnonymousClass2T7 A0D;
    public final C203189nG A0E;
    public final C202819md A0F;
    public final C203209nI A0G;
    public final AnonymousClass4FS A0H;
    public final String A0I;
    public final boolean A0J;

    public synchronized void A00(boolean z) {
        synchronized (this) {
            AnonymousClass9H0 r1 = this.A02;
            if (r1 != null) {
                r1.A0D(true);
            }
            C89644eZ r4 = this.A03;
            AnonymousClass4FS r9 = this.A0H;
            AnonymousClass9H0 r3 = new AnonymousClass9H0(r4, this.A04, this.A07, this.A01, this.A0D, r9, AnonymousClass0x9.A14(this.A0F), AnonymousClass0x9.A14(this.A0G), this.A0J, z);
            this.A02 = r3;
            r9.BkO(r3, new Void[0]);
        }
    }

    public void A01(boolean z, boolean z2) {
        boolean z3 = this.A0J;
        if (z3) {
            AnonymousClass9UF r1 = new AnonymousClass9UF(this, 4);
            this.A00 = r1;
            this.A09.A06(r1);
        }
        C1906899l r3 = this.A05;
        if (r3.A0E() || this.A06.A0E()) {
            C620933l r2 = this.A08;
            if (!C18280x3.A1W(r2.A03(), "has_p2mlite_account") && (z2 || r2.A01.A0H() - AnonymousClass0x2.A0B(r2.A03(), "payments_methods_last_sync_time") > C86654Ky.A09(TimeUnit.HOURS))) {
                this.A0A.A08(this);
            }
        }
        if (!r3.A0E() && !this.A06.A0E()) {
            C620933l r32 = this.A08;
            if (!r32.A03().getBoolean("payment_account_recovered", false) || !r32.A03().getBoolean("payment_account_recoverable", false)) {
                return;
            }
        }
        if (z3 && z) {
            this.A0B.A01(this, (Integer) null, (Integer) null, (String) null, this.A0I);
        }
    }

    public void BMA(boolean z) {
        this.A0E.BMA(z);
    }

    public void BXr(C166587yw r2) {
        this.A0E.BXr(r2);
    }

    public void Ba4(AnonymousClass34V r4) {
        C1899593h.A1G(this.A0C, r4, "getPaymentMethods/getPaymentTransactions/onRequestError. paymentNetworkError: ", AnonymousClass001.A0o());
    }

    public void BaB(AnonymousClass34V r4) {
        C1899593h.A1G(this.A0C, r4, "getPaymentMethods/getPaymentTransactions/onResponseError. paymentNetworkError: ", AnonymousClass001.A0o());
    }

    public void BaC(AnonymousClass2Oi r11) {
        if (r11 instanceof C190859Ac) {
            this.A0C.A04("init/getMethods/onResponseSuccess");
        } else if (r11 instanceof C29491iu) {
            C160757oG r2 = this.A0C;
            r2.A04("init/getTransactions/onResponseSuccess");
            C29491iu r112 = (C29491iu) r11;
            C166267yP r1 = r112.A00;
            if (r1 == null) {
                r2.A04("unexpected payment transaction result type.");
            } else if (!r1.A01 && !TextUtils.isEmpty(r1.A00)) {
                this.A0B.A01(this, (Integer) null, (Integer) null, r112.A00.A00, this.A0I);
            }
        } else {
            return;
        }
        A00(false);
    }

    public AnonymousClass9bQ(C89644eZ r4, C194539Ti r5, C1906899l r6, C1906999m r7, C194489Tb r8, C620933l r9, C29271iY r10, AnonymousClass9U5 r11, AnonymousClass9U4 r12, AnonymousClass9b0 r13, AnonymousClass2T7 r14, C203189nG r15, C202819md r16, C203209nI r17, AnonymousClass4FS r18, String str, boolean z) {
        this.A03 = r4;
        this.A0H = r18;
        this.A0D = r14;
        this.A01 = r12;
        this.A08 = r9;
        this.A05 = r6;
        this.A0A = r11;
        this.A0B = r13;
        this.A06 = r7;
        this.A0F = r16;
        this.A09 = r10;
        this.A04 = r5;
        this.A07 = r8;
        this.A0E = r15;
        this.A0G = r17;
        this.A0I = str;
        this.A0J = z;
    }
}
