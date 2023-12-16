package X;

import android.content.SharedPreferences;
import android.database.Cursor;

/* renamed from: X.5lq  reason: invalid class name and case insensitive filesystem */
public final class C113695lq implements AnonymousClass664 {
    public final C56922sm A00;
    public final AnonymousClass4FV A01;
    public final C45432a0 A02;

    public String BDW() {
        return "AndroidInfraHealthDailyCron";
    }

    public void BQV() {
        Cursor A0E;
        C95054sX r9 = new C95054sX();
        C45432a0 r8 = this.A02;
        SharedPreferences A002 = r8.A00();
        long A003 = ((C56612sH.A00(r8.A01) / 60) / 10) * 10;
        int i = 0;
        r9.A01 = AnonymousClass0x9.A0m(A002.getInt("total_cold_start_count_pref", 0));
        r9.A02 = AnonymousClass0x9.A0m(A002.getInt("fg_cold_start_count_pref", 0));
        r9.A00 = AnonymousClass0x9.A0m(A002.getInt("bg_cold_start_count_pref", 0));
        r9.A08 = C18310x6.A0f(A003, (long) A002.getInt("last_cold_start_time_min", 0));
        r9.A04 = AnonymousClass0x9.A0m(A002.getInt("warm_start_count_pref", 0));
        r9.A0B = C18310x6.A0f(A003, (long) A002.getInt("last_warm_start_time_min", 0));
        r9.A03 = AnonymousClass0x9.A0m(A002.getInt("lukewarm_start_count_pref", 0));
        r9.A0A = C18310x6.A0f(A003, (long) A002.getInt("last_lukewarm_start_time_min", 0));
        r9.A09 = C18310x6.A0f(A003, (long) A002.getInt("last_health_event_time_min", 0));
        SharedPreferences.Editor edit = r8.A00().edit();
        edit.putInt("last_health_event_time_min", (int) A003);
        edit.apply();
        C56922sm r2 = this.A00;
        if (r2.A08.A0X(3911)) {
            AnonymousClass4GK A03 = r2.A06.get();
            try {
                A0E = ((AnonymousClass3H0) A03).A03.A0E("SELECT hidden, COUNT(1) as chat_count FROM chat GROUP BY hidden", "GET_CHAT_COUNT_BY_HIDDEN_COLUMN", (String[]) null);
                int columnIndexOrThrow = A0E.getColumnIndexOrThrow("hidden");
                int columnIndexOrThrow2 = A0E.getColumnIndexOrThrow("chat_count");
                int i2 = 0;
                int i3 = 0;
                while (A0E.moveToNext()) {
                    if (A0E.isNull(columnIndexOrThrow)) {
                        i3 = A0E.getInt(columnIndexOrThrow2);
                    } else if (A0E.getInt(columnIndexOrThrow) == 0) {
                        i2 = A0E.getInt(columnIndexOrThrow2);
                    } else if (A0E.getInt(columnIndexOrThrow) == 1) {
                        i = A0E.getInt(columnIndexOrThrow2);
                    }
                }
                A0E.close();
                A03.close();
                r9.A05 = AnonymousClass0x9.A0m(i2);
                r9.A06 = AnonymousClass0x9.A0m(i);
                r9.A07 = AnonymousClass0x9.A0m(i3);
            } catch (Throwable th) {
                try {
                    A03.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        }
        this.A01.BhA(r9);
        synchronized (r8) {
            SharedPreferences.Editor edit2 = r8.A00().edit();
            edit2.putInt("fg_cold_start_count_pref", 0);
            edit2.putInt("bg_cold_start_count_pref", 0);
            edit2.putInt("total_cold_start_count_pref", 0);
            edit2.putInt("warm_start_count_pref", 0);
            edit2.putInt("lukewarm_start_count_pref", 0);
            edit2.apply();
        }
        return;
        throw th;
    }

    public C113695lq(C56922sm r1, AnonymousClass4FV r2, C45432a0 r3) {
        C18260x0.A0V(r2, r3, r1);
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
    }
}
