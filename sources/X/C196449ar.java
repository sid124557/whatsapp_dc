package X;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/* renamed from: X.9ar  reason: invalid class name and case insensitive filesystem */
public class C196449ar implements AnonymousClass4E8 {
    public final AnonymousClass99P A00;
    public final AnonymousClass36F A01;
    public final AnonymousClass1VX A02;
    public final C1907099n A03;
    public final AnonymousClass9U4 A04;
    public final C194589Tn A05;
    public final C40612Hb A06;
    public final AnonymousClass7WN A07;
    public final AnonymousClass2YY A08;
    public final C29501iv A09;
    public final C29511iw A0A;
    public final C196419ao A0B;
    public final AnonymousClass4FS A0C;

    public void BQW() {
        C161307pP A002;
        C1907099n r6 = this.A03;
        if (r6.A02()) {
            AnonymousClass36F r5 = this.A01;
            Integer[] numArr = new Integer[4];
            boolean A1Y = C18300x5.A1Y(numArr, 20);
            numArr[1] = 401;
            AnonymousClass000.A1N(numArr, 417);
            numArr[3] = 418;
            Integer[] numArr2 = new Integer[1];
            AnonymousClass000.A1P(numArr2, 40, A1Y ? 1 : 0);
            List A0V = r5.A0V(numArr, numArr2, -1);
            if (A0V.size() > 0) {
                AnonymousClass7WN r2 = this.A07;
                C161307pP A003 = r2.A00();
                this.A04.A0G().Bh0(A003, A0V);
                r2.A01(A003);
            }
        }
        AnonymousClass2YY r52 = this.A08;
        synchronized (r52) {
            AnonymousClass7WN r3 = r52.A01;
            long A0H = r3.A01.A0H();
            long j = A0H - (A0H % 86400000);
            ArrayList A0s = AnonymousClass001.A0s();
            SharedPreferences sharedPreferences = r3.A00;
            if (sharedPreferences == null) {
                sharedPreferences = r3.A02.A03("payment_daily_usage_preferences");
                r3.A00 = sharedPreferences;
            }
            Map<String, ?> all = sharedPreferences.getAll();
            SharedPreferences sharedPreferences2 = r3.A00;
            if (sharedPreferences2 == null) {
                sharedPreferences2 = r3.A02.A03("payment_daily_usage_preferences");
                r3.A00 = sharedPreferences2;
            }
            SharedPreferences.Editor edit = sharedPreferences2.edit();
            Iterator A0q = AnonymousClass000.A0q(all);
            while (A0q.hasNext()) {
                Map.Entry A0w = AnonymousClass001.A0w(A0q);
                String obj = A0w.getValue().toString();
                if (!obj.isEmpty() && (A002 = C161307pP.A00(obj)) != null && A002.A0G < j) {
                    A0s.add(A002);
                    edit.remove(C18310x6.A0q(A0w));
                }
            }
            edit.apply();
            C18260x0.A1A("PaymentDailyUsageSync/sendAndCleanDailyStats Num events to log: ", AnonymousClass001.A0o(), A0s);
            Iterator it = A0s.iterator();
            while (it.hasNext()) {
                C161307pP r4 = (C161307pP) it.next();
                AnonymousClass4FV r32 = r52.A00;
                C1905999b r22 = new C1905999b();
                r22.A05 = Long.valueOf(r4.A0H);
                r22.A06 = Long.valueOf(r4.A02);
                r22.A09 = Long.valueOf(r4.A05);
                r22.A07 = Long.valueOf(r4.A03);
                r22.A08 = Long.valueOf(r4.A04);
                r22.A0F = Long.valueOf(r4.A0B);
                r22.A0E = Long.valueOf(r4.A0A);
                r22.A0C = Long.valueOf(r4.A08);
                r22.A0B = Long.valueOf(r4.A07);
                r22.A0D = Long.valueOf(r4.A09);
                r22.A0A = Long.valueOf(r4.A06);
                r22.A04 = Long.valueOf(r4.A01);
                r22.A00 = Long.valueOf((long) r4.A0D.size());
                r22.A01 = Long.valueOf((long) r4.A0F.size());
                r22.A03 = Long.valueOf(r4.A00);
                r22.A02 = Long.valueOf((long) r4.A0E.size());
                r22.A0G = r4.A0C;
                r32.BhD(r22);
            }
        }
        this.A09.A05();
        SharedPreferences A032 = this.A06.A00.A03("hybrid_payment_methods_used");
        C162457s7.A0D(A032);
        A032.edit().clear().apply();
        this.A0A.A05();
        if (r6.A02() && this.A02.A0X(991)) {
            AnonymousClass99P r53 = this.A00;
            int nextInt = new Random().nextInt(AnonymousClass99P.A0E);
            Locale locale = Locale.US;
            Object[] A0L = AnonymousClass002.A0L();
            AnonymousClass000.A1P(A0L, nextInt, 0);
            String.format(locale, "BloksAssetManager/triggerBackgroundFetchWithJitter triggering bloks fetch in %d ms", A0L);
            r53.A06.Bkn(new C198749fQ(r53), "BloksAssetmanager/trigger-bg-fetch", (long) nextInt);
        }
        AnonymousClass1VX r1 = this.A02;
        if (r1.A0X(629) || r1.A0X(605)) {
            C194589Tn r33 = this.A05;
            AnonymousClass33p r42 = r33.A02;
            if (C18280x3.A1W(AnonymousClass0x2.A0F(r42), "payment_background_batch_require_fetch") && r42.A2P("payment_backgrounds_batch_last_fetch_timestamp", TimeUnit.DAYS.toMillis(7))) {
                r33.A01.A0S(new C200079hk(r33, r33.A07.A00()));
            }
        }
    }

    public void BQX() {
        this.A0C.BkM(new C198889fe(this));
    }

    public C196449ar(AnonymousClass99P r1, AnonymousClass36F r2, AnonymousClass1VX r3, C1907099n r4, AnonymousClass9U4 r5, C194589Tn r6, C40612Hb r7, AnonymousClass7WN r8, AnonymousClass2YY r9, C29501iv r10, C29511iw r11, C196419ao r12, AnonymousClass4FS r13) {
        this.A01 = r2;
        this.A06 = r7;
        this.A09 = r10;
        this.A0A = r11;
        this.A05 = r6;
        this.A07 = r8;
        this.A08 = r9;
        this.A03 = r4;
        this.A04 = r5;
        this.A0B = r12;
        this.A00 = r1;
        this.A02 = r3;
        this.A0C = r13;
    }

    public String BDW() {
        return "PaymentDailyCron";
    }
}
