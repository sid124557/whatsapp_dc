package X;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.8GF  reason: invalid class name */
public final class AnonymousClass8GF implements AnonymousClass664 {
    public final C54882pR A00;

    public AnonymousClass8GF(C54882pR r2) {
        C162457s7.A0J(r2, 1);
        this.A00 = r2;
    }

    public static final C134236if A00(AnonymousClass33B r3) {
        C134236if r2 = new C134236if();
        r2.A0M = Long.valueOf(r3.A0M);
        r2.A0K = Long.valueOf(r3.A0J);
        r2.A0J = Long.valueOf(r3.A0L);
        r2.A0L = Long.valueOf(r3.A0K);
        r2.A0O = Long.valueOf(r3.A0O);
        r2.A0N = Long.valueOf(r3.A0N);
        r2.A0U = Long.valueOf(r3.A0U);
        r2.A0Q = Long.valueOf(r3.A0Q);
        r2.A0S = Long.valueOf(r3.A0S);
        r2.A0R = Long.valueOf(r3.A0R);
        r2.A0T = Long.valueOf(r3.A0T);
        r2.A0V = Long.valueOf(r3.A0V);
        r2.A05 = Long.valueOf(r3.A05);
        r2.A02 = Long.valueOf(r3.A02);
        r2.A08 = Long.valueOf(r3.A08);
        r2.A03 = Long.valueOf(r3.A03);
        r2.A04 = Long.valueOf(r3.A04);
        r2.A09 = Long.valueOf(r3.A09);
        r2.A01 = Long.valueOf(r3.A01);
        r2.A00 = Long.valueOf(r3.A00);
        r2.A06 = Long.valueOf(r3.A06);
        r2.A07 = Long.valueOf(r3.A07);
        r2.A0P = Long.valueOf(r3.A0P);
        r2.A0A = Long.valueOf(r3.A0A);
        r2.A0B = Long.valueOf(r3.A0B);
        r2.A0C = Long.valueOf(r3.A0C);
        r2.A0D = Long.valueOf(r3.A0D);
        r2.A0F = Long.valueOf(r3.A0F);
        r2.A0G = Long.valueOf(r3.A0G);
        r2.A0H = Long.valueOf(r3.A0H);
        r2.A0I = Long.valueOf(r3.A0I);
        r2.A0E = Long.valueOf(r3.A0E);
        return r2;
    }

    public static final C134216id A01(C61052zd r3) {
        C134216id r2 = new C134216id();
        r2.A0F = Long.valueOf(r3.A0F);
        r2.A0E = Long.valueOf(r3.A0E);
        r2.A0I = Long.valueOf(r3.A0I);
        r2.A0G = Long.valueOf(r3.A0G);
        r2.A0H = Long.valueOf(r3.A0H);
        r2.A0M = Long.valueOf(r3.A0M);
        r2.A0L = Long.valueOf(r3.A0L);
        r2.A0P = Long.valueOf(r3.A0P);
        r2.A0N = Long.valueOf(r3.A0N);
        r2.A0O = Long.valueOf(r3.A0O);
        r2.A01 = Long.valueOf(r3.A01);
        r2.A02 = Long.valueOf(r3.A02);
        r2.A03 = Long.valueOf(r3.A03);
        r2.A07 = Long.valueOf(r3.A07);
        r2.A06 = Long.valueOf(r3.A06);
        r2.A08 = Long.valueOf(r3.A08);
        r2.A00 = Long.valueOf(r3.A00);
        r2.A0J = Long.valueOf(r3.A0J);
        r2.A0K = Long.valueOf(r3.A0K);
        r2.A05 = Long.valueOf(r3.A05);
        r2.A04 = Long.valueOf(r3.A04);
        r2.A09 = Long.valueOf(r3.A09);
        r2.A0B = Long.valueOf(r3.A0B);
        r2.A0A = Long.valueOf(r3.A0A);
        r2.A0C = Long.valueOf(r3.A0C);
        r2.A0D = Long.valueOf(r3.A0D);
        return r2;
    }

    public String BDW() {
        return "MediaDailyUsageRandomizedDailyCron";
    }

    public void BQV() {
        C134236if A002;
        C134216id A01;
        Double valueOf;
        Double valueOf2;
        Long valueOf3;
        Long valueOf4;
        Long valueOf5;
        Long valueOf6;
        Long valueOf7;
        Long valueOf8;
        C160167n9 A003;
        C54882pR r2 = this.A00;
        AnonymousClass2YQ r4 = r2.A05;
        AnonymousClass66R r5 = r4.A01.A01;
        String string = ((SharedPreferences) r5.getValue()).getString("media_engagement_daily_received_key", (String) null);
        AnonymousClass33B A004 = C1451574j.A00(string);
        if (!(string == null || string.length() == 0)) {
            SharedPreferences.Editor A04 = C18270x1.A04(r5);
            A04.remove("media_engagement_daily_received_key");
            A04.apply();
        }
        AnonymousClass4FV r42 = r4.A00;
        if (A004 != null) {
            A002 = A00(A004);
        } else {
            A002 = A00(new AnonymousClass33B(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0));
        }
        r42.BhD(A002);
        String string2 = ((SharedPreferences) r5.getValue()).getString("media_engagement_daily_sent_key", (String) null);
        C61052zd A005 = AnonymousClass74k.A00(string2);
        if (!(string2 == null || string2.length() == 0)) {
            SharedPreferences.Editor A042 = C18270x1.A04(r5);
            A042.remove("media_engagement_daily_sent_key");
            A042.apply();
        }
        if (A005 != null) {
            A01 = A01(A005);
        } else {
            A01 = A01(new C61052zd(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0));
        }
        r42.BhD(A01);
        long A012 = r2.A01();
        C158017jI r43 = r2.A04;
        ArrayList A0s = AnonymousClass001.A0s();
        SharedPreferences sharedPreferences = r43.A00;
        if (sharedPreferences == null) {
            sharedPreferences = r43.A01.A03("media_daily_usage_preferences_v1");
            r43.A00 = sharedPreferences;
        }
        Map<String, ?> all = sharedPreferences.getAll();
        SharedPreferences sharedPreferences2 = r43.A00;
        if (sharedPreferences2 == null) {
            sharedPreferences2 = r43.A01.A03("media_daily_usage_preferences_v1");
            r43.A00 = sharedPreferences2;
        }
        SharedPreferences.Editor edit = sharedPreferences2.edit();
        Iterator A0q = AnonymousClass000.A0q(all);
        while (A0q.hasNext()) {
            Map.Entry A0w = AnonymousClass001.A0w(A0q);
            String obj = A0w.getValue().toString();
            if (!obj.isEmpty() && (A003 = C160167n9.A00(obj)) != null && A003.A0C < A012) {
                A0s.add(A003);
                edit.remove(C18310x6.A0q(A0w));
            }
        }
        edit.apply();
        Iterator it = A0s.iterator();
        while (it.hasNext()) {
            C160167n9 r52 = (C160167n9) it.next();
            AnonymousClass4FV r44 = r2.A03;
            C134146iW r3 = new C134146iW();
            long j = r52.A01;
            Long l = null;
            if (j == 0) {
                valueOf = null;
            } else {
                valueOf = Double.valueOf((double) j);
            }
            r3.A02 = valueOf;
            long j2 = r52.A00;
            if (j2 == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Double.valueOf((double) j2);
            }
            r3.A01 = valueOf2;
            long j3 = r52.A05;
            if (j3 == 0) {
                valueOf3 = null;
            } else {
                valueOf3 = Long.valueOf(j3);
            }
            r3.A09 = valueOf3;
            long j4 = r52.A04;
            if (j4 == 0) {
                valueOf4 = null;
            } else {
                valueOf4 = Long.valueOf(j4);
            }
            r3.A08 = valueOf4;
            long j5 = r52.A07;
            if (j5 == 0) {
                valueOf5 = null;
            } else {
                valueOf5 = Long.valueOf(j5);
            }
            r3.A0B = valueOf5;
            long j6 = r52.A02;
            if (j6 == 0) {
                valueOf6 = null;
            } else {
                valueOf6 = Long.valueOf(j6);
            }
            r3.A06 = valueOf6;
            long j7 = r52.A03;
            if (j7 == 0) {
                valueOf7 = null;
            } else {
                valueOf7 = Long.valueOf(j7);
            }
            r3.A07 = valueOf7;
            long j8 = r52.A06;
            if (j8 == 0) {
                valueOf8 = null;
            } else {
                valueOf8 = Long.valueOf(j8);
            }
            r3.A0A = valueOf8;
            long j9 = r52.A08;
            if (j9 != 0) {
                l = Long.valueOf(j9);
            }
            r3.A0C = l;
            r3.A0D = Long.valueOf(r52.A0C);
            r3.A04 = Integer.valueOf(r52.A0A);
            r3.A05 = Integer.valueOf(r52.A0B);
            r3.A03 = Integer.valueOf(r52.A09);
            r3.A00 = Boolean.valueOf(r52.A0D);
            r44.BhD(r3);
        }
    }
}
