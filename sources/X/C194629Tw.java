package X;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.util.concurrent.TimeUnit;

/* renamed from: X.9Tw  reason: invalid class name and case insensitive filesystem */
public abstract class C194629Tw {
    public final AnonymousClass1VX A00;
    public final C1906899l A01;
    public final C1907099n A02;

    public void A02() {
        ((C1908199y) this).A01.A1f("payments_incentive_banner_start_cool_off_timestamp", System.currentTimeMillis());
    }

    public void A03() {
        C18270x1.A0l(((C1908199y) this).A01.A0U(), "payments_incentive_banner_dismissed", true);
    }

    public void A04(Context context) {
        C1908199y r4 = (C1908199y) this;
        AnonymousClass9U4 r1 = r4.A02;
        Intent B8I = r1.A0G().B8I(context);
        if (B8I == null) {
            Log.e("Pay : PaymentsIncentiveBannerManager/getIncentivesOnboardingIntent intent is null");
            return;
        }
        context.startActivity(B8I);
        C194659Tz A05 = AnonymousClass9U4.A05(r1);
        if (A05 != null && !A05.A07.A0X(979)) {
            AnonymousClass33p r3 = r4.A01;
            int A022 = C18280x3.A02(AnonymousClass0x2.A0F(r3), "payments_incentive_banner_clicked_count") + 1;
            C18270x1.A0h(r3.A0U(), "payments_incentive_banner_clicked_count", A022);
            int A0N = r4.A00.A0N(2217);
            if (A0N != 0 && A022 >= A0N) {
                r4.A03();
            }
        }
    }

    public boolean A05() {
        C194659Tz A05;
        C194869Uu A022;
        C1908199y r6 = (C1908199y) this;
        AnonymousClass9U4 r7 = r6.A02;
        C194659Tz A052 = AnonymousClass9U4.A05(r7);
        if (!(A052 == null || !C1899693i.A0w(A052.A07) || (A022 = r6.A03.A02()) == null)) {
            long j = A022.A08.A01;
            AnonymousClass33p r8 = r6.A01;
            if (j != AnonymousClass0x2.A0A(AnonymousClass0x2.A0F(r8), "payments_incentive_banner_offer_id")) {
                r8.A1f("payments_incentive_banner_start_timestamp", -1);
                C18270x1.A0h(r8.A0U(), "payments_incentive_banner_total_days", 0);
                C18270x1.A0h(r8.A0U(), "payments_incentive_banner_clicked_count", 0);
                C18270x1.A0l(r8.A0U(), "payments_incentive_banner_dismissed", false);
                C18270x1.A0i(r8.A0U(), "payments_incentive_banner_offer_id", j);
            }
        }
        AnonymousClass1VX r4 = r6.A00;
        if (!r4.A0X(884) || !r6.A02.A02()) {
            return false;
        }
        AnonymousClass33p r2 = r6.A01;
        C183538qC r5 = r2.A01;
        if (((SharedPreferences) r5.get()).getBoolean("payments_incentive_banner_dismissed", false)) {
            return false;
        }
        long A0N = ((long) r4.A0N(905)) * 60000;
        long currentTimeMillis = System.currentTimeMillis();
        long A0A = AnonymousClass0x2.A0A(AnonymousClass0x2.A0F(r2), "payments_incentive_banner_start_cool_off_timestamp");
        if ((A0A != -1 && currentTimeMillis <= A0A + A0N) || (A05 = AnonymousClass9U4.A05(r7)) == null || !C1899693i.A0w(A05.A07)) {
            return false;
        }
        AnonymousClass9VG A002 = r6.A03.A00();
        C194869Uu r0 = A002.A01;
        C194839Ur r72 = A002.A02;
        boolean A023 = A05.A02(r0, r72);
        if (r0 == null || A023) {
            r6.A04.BkM(new C200019he(r6, A023));
        }
        if (A002.A00(TimeUnit.MILLISECONDS.toSeconds(r6.A00.A0H())) != 1) {
            return false;
        }
        if (r72 != null && (!r72.A04 || r72.A01 >= 1 || r72.A00 >= 1)) {
            return false;
        }
        if (AnonymousClass0x2.A0A(AnonymousClass0x2.A0F(r2), "payments_incentive_banner_start_timestamp") == -1) {
            r2.A1f("payments_incentive_banner_start_timestamp", System.currentTimeMillis());
            r2.A1f("payments_incentive_banner_last_seen_timestamp", System.currentTimeMillis());
            C18270x1.A0h(r2.A0U(), "payments_incentive_banner_total_days", 0);
        } else if (r2.A2P("payments_incentive_banner_last_seen_timestamp", 86400000)) {
            int A0N2 = r4.A0N(885);
            if (((SharedPreferences) r5.get()).getInt("payments_incentive_banner_total_days", 0) >= A0N2) {
                C18270x1.A0h(r2.A0U(), "payments_incentive_banner_total_days", A0N2);
                r6.A03();
            } else {
                C18270x1.A0h(r2.A0U(), "payments_incentive_banner_total_days", ((SharedPreferences) r5.get()).getInt("payments_incentive_banner_total_days", 0) + 1);
            }
            r2.A1f("payments_incentive_banner_last_seen_timestamp", System.currentTimeMillis());
        }
        if (((SharedPreferences) r5.get()).getInt("payments_incentive_banner_total_days", 0) < r4.A0N(885)) {
            return true;
        }
        return false;
    }

    public boolean A06() {
        return this.A02.A02();
    }

    public boolean A07() {
        return this.A01.A0G("tos_no_wallet");
    }

    public boolean A08() {
        return this.A01.A0C();
    }

    public C194629Tw(AnonymousClass1VX r1, C1906899l r2, C1907099n r3) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }

    public CharSequence A00(Context context, int i) {
        return C107575bX.A00(context, new Object[0], R.string.f11nameremoved);
    }

    public String A01() {
        return null;
    }
}
