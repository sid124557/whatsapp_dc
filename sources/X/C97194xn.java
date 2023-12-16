package X;

import android.content.Context;
import android.content.Intent;
import com.whatsapp.R;
import com.whatsapp.util.Log;

/* renamed from: X.4xn  reason: invalid class name and case insensitive filesystem */
public class C97194xn extends C194629Tw {
    public static int A04 = 7;
    public final C56612sH A00;
    public final AnonymousClass33p A01;
    public final C153087ae A02;
    public final AnonymousClass9U4 A03;

    public String A01() {
        C161357pU A022 = this.A02.A02();
        if (A022 != null) {
            return ((AnonymousClass3H6) A022.A02).A05;
        }
        return null;
    }

    public void A02() {
        C18260x0.A0M(this.A01, "payments_onboarding_banner_start_cool_off_timestamp", System.currentTimeMillis());
    }

    public void A03() {
        C18270x1.A0l(C18270x1.A03(this.A01), "payments_onboarding_chat_banner_dismmissed", true);
    }

    public void A04(Context context) {
        Intent BBE = this.A03.A0G().BBE(context, "p2p_context", "in_app_banner");
        if (BBE == null) {
            Log.e("Pay : PaymentsOnboardingBannerManager/showPaymentsOnboardingScreen intent is null");
            return;
        }
        context.startActivity(BBE);
        A03();
    }

    public boolean A05() {
        AnonymousClass1VX r1 = this.A00;
        A04 = r1.A0N(486);
        if (!r1.A0X(484)) {
            return false;
        }
        AnonymousClass33p r4 = this.A01;
        C183538qC r3 = r4.A01;
        if (C18300x5.A0B(r3).getBoolean("payments_onboarding_banner_registration_started", false) || !A06() || A08() || A07()) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long A0A = AnonymousClass0x2.A0A(AnonymousClass0x2.A0F(r4), "payments_onboarding_banner_start_cool_off_timestamp");
        if ((A0A != -1 && currentTimeMillis <= A0A + 604800000) || C18300x5.A0B(r3).getBoolean("payments_onboarding_chat_banner_dismmissed", false)) {
            return false;
        }
        if (AnonymousClass0x2.A0A(AnonymousClass0x2.A0F(r4), "payments_onboarding_banner_start_timestamp") == -1) {
            C18260x0.A0M(r4, "payments_onboarding_banner_start_timestamp", System.currentTimeMillis());
            C18260x0.A0M(r4, "payments_onboarding_banner_last_seen_timestamp", System.currentTimeMillis());
            C18270x1.A0h(C18270x1.A03(r4), "payments_onboarding_banner_total_days", 0);
        } else if (r4.A2P("payments_onboarding_banner_last_seen_timestamp", 86400000)) {
            int i = C18300x5.A0B(r3).getInt("payments_onboarding_banner_total_days", 0);
            int i2 = A04;
            if (i >= i2) {
                C18260x0.A0L(r4, "payments_onboarding_banner_total_days", i2);
                A03();
            } else {
                C18260x0.A0L(r4, "payments_onboarding_banner_total_days", C86664Kz.A08(C18300x5.A0B(r3), "payments_onboarding_banner_total_days", 0));
            }
            C18260x0.A0M(r4, "payments_onboarding_banner_last_seen_timestamp", System.currentTimeMillis());
        }
        if (C18300x5.A0B(r3).getInt("payments_onboarding_banner_total_days", 0) < A04) {
            return true;
        }
        return false;
    }

    public C97194xn(C56612sH r1, AnonymousClass33p r2, AnonymousClass1VX r3, C1906899l r4, C153087ae r5, C1907099n r6, AnonymousClass9U4 r7) {
        super(r3, r4, r6);
        this.A00 = r1;
        this.A03 = r7;
        this.A01 = r2;
        this.A02 = r5;
    }

    public CharSequence A00(Context context, int i) {
        if (!this.A00.A0X(6066) || !C161357pU.A0F.equals(this.A02.A02())) {
            return super.A00(context, R.string.f11nameremoved);
        }
        return C107575bX.A00(context, AnonymousClass4L0.A0U(), R.string.f11nameremoved);
    }
}
