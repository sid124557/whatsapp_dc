package X;

import android.content.SharedPreferences;
import java.util.Calendar;
import java.util.TimeZone;

/* renamed from: X.5hd  reason: invalid class name and case insensitive filesystem */
public class C111155hd implements AnonymousClass4CD, AnonymousClass65A {
    public long A00;
    public long A01;
    public long A02;
    public final AnonymousClass5XU A03;
    public final C56612sH A04;
    public final AnonymousClass4FV A05;
    public final C49532gg A06;
    public final C45132Yu A07;

    public void A00() {
        long A002 = C56612sH.A00(this.A04);
        long j = this.A00;
        if (A002 != j) {
            boolean A1V = AnonymousClass001.A1V((A002 > j ? 1 : (A002 == j ? 0 : -1)));
            long max = Math.max(j, A002);
            if (A002 - j > 30 || A1V) {
                A02();
                if (A05(A002) || A1V) {
                    C18270x1.A0i(this.A07.A00().edit(), "timespent_end_time", max);
                    A04(A1V);
                    A03(A002);
                }
                this.A02 = A002;
            }
            this.A00 = A002;
        }
    }

    public void A01() {
        C45132Yu r4 = this.A07;
        if (r4.A00().getLong("timespent_saved_start_time", 0) > 0) {
            long j = r4.A00().getLong("timespent_summary_sequence", 0);
            long j2 = r4.A00().getLong("timespent_saved_start_time", 0);
            long j3 = r4.A00().getLong("timespent_saved_duration", 0);
            long j4 = r4.A00().getLong("timespent_saved_session_total", 0);
            long j5 = r4.A00().getLong("timespent_saved_foreground_count", 0);
            boolean A1W = C18280x3.A1W(r4.A00(), "timespent_saved_time_altered");
            AnonymousClass4s9 r12 = new AnonymousClass4s9();
            r12.A03 = Long.valueOf(j2);
            r12.A00 = Long.valueOf(j3);
            r12.A02 = Long.valueOf(j4);
            Long valueOf = Long.valueOf(j);
            r12.A05 = valueOf;
            r12.A01 = Long.valueOf(j5);
            r12.A04 = Long.valueOf(C18290x4.A09(A1W ? 1 : 0));
            this.A05.BhB(r12);
            C49532gg r5 = this.A06;
            long j6 = r4.A00().getLong("timespent_saved_start_time", 0);
            long j7 = r4.A00().getLong("timespent_saved_duration", 0);
            long j8 = r4.A00().getLong("timespent_saved_session_total", 0);
            long j9 = r4.A00().getLong("timespent_saved_foreground_count", 0);
            boolean A1W2 = C18280x3.A1W(r4.A00(), "timespent_saved_time_altered");
            AnonymousClass4s7 r122 = new AnonymousClass4s7();
            r122.A03 = Long.valueOf(j6);
            r122.A00 = Long.valueOf(j7);
            r122.A02 = Long.valueOf(j8);
            r122.A05 = valueOf;
            r122.A01 = Long.valueOf(j9);
            r122.A04 = Long.valueOf(C18290x4.A09(A1W2 ? 1 : 0));
            r5.A03.BhB(r122);
            C18270x1.A0i(r4.A00().edit().putLong("timespent_saved_start_time", 0).putLong("timespent_saved_duration", 0).putLong("timespent_saved_session_total", 0).putLong("timespent_saved_foreground_count", 0).putBoolean("timespent_saved_time_altered", false), "timespent_summary_sequence", (j % 9999) + 1);
        }
    }

    public final void A02() {
        long j = this.A02;
        if (j > 0) {
            long j2 = this.A00;
            long j3 = ((j2 - j) + 1) - this.A01;
            C45132Yu r2 = this.A07;
            C18270x1.A0i(r2.A00().edit().putLong("timespent_last_activity_time", j2), "timespent_session_total", r2.A00().getLong("timespent_session_total", 0) + j3);
            this.A02 = 0;
            this.A00 = 0;
            this.A01 = 0;
        }
    }

    public final void A03(long j) {
        long time = this.A03.A01().getTime() / 1000;
        if (1702528694 <= j && time >= j) {
            C45132Yu r6 = this.A07;
            if (r6.A00().getLong("timespent_start_time", 0) == 0) {
                C18270x1.A0i(r6.A00().edit(), "timespent_start_time", j);
            }
        }
    }

    public final boolean A05(long j) {
        if (AnonymousClass0x2.A0B(this.A07.A00(), "timespent_rollover_time") < j || j < this.A00) {
            return true;
        }
        return false;
    }

    public void BMV() {
        long j;
        long A002 = C56612sH.A00(this.A04);
        C45132Yu r6 = this.A07;
        long A0B = AnonymousClass0x2.A0B(r6.A00(), "timespent_last_activity_time");
        this.A00 = A0B;
        boolean A1V = AnonymousClass001.A1V((A002 > A0B ? 1 : (A002 == A0B ? 0 : -1)));
        if (A05(A002) || A1V) {
            A04(A1V);
        }
        A03(A002);
        if (A002 == this.A00) {
            j = 1;
        } else {
            j = 0;
        }
        this.A01 = j;
        this.A02 = A002;
        this.A00 = A002;
        C18270x1.A0i(r6.A00().edit(), "timespent_foreground_count", r6.A00().getLong("timespent_foreground_count", 0) + 1);
    }

    public void onAppBackgrounded() {
        long A002 = C56612sH.A00(this.A04);
        long j = this.A00;
        boolean A1V = AnonymousClass001.A1V((A002 > j ? 1 : (A002 == j ? 0 : -1)));
        long max = Math.max(j, A002);
        A02();
        C18270x1.A0i(this.A07.A00().edit(), "timespent_end_time", max);
        if (A05(A002) || A1V) {
            A04(A1V);
        }
    }

    public C111155hd(AnonymousClass5XU r1, C56612sH r2, AnonymousClass4FV r3, C49532gg r4, C45132Yu r5) {
        this.A04 = r2;
        this.A03 = r1;
        this.A05 = r3;
        this.A06 = r4;
        this.A07 = r5;
    }

    public final void A04(boolean z) {
        C18260x0.A1D("updating time spent saved session; timeAltered=", AnonymousClass001.A0o(), z);
        Calendar instance = Calendar.getInstance(TimeZone.getTimeZone("PST8PDT"));
        instance.add(6, 1);
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        instance.set(14, 0);
        long A0B = C18290x4.A0B(instance.getTimeInMillis());
        C45132Yu r11 = this.A07;
        C18270x1.A0i(r11.A00().edit(), "timespent_rollover_time", A0B);
        A01();
        SharedPreferences.Editor edit = r11.A00().edit();
        long j = r11.A00().getLong("timespent_start_time", 0);
        if (j > 0) {
            edit.putLong("timespent_saved_start_time", j).putLong("timespent_saved_duration", (r11.A00().getLong("timespent_end_time", 0) - j) + 1).putLong("timespent_saved_session_total", r11.A00().getLong("timespent_session_total", 0)).putLong("timespent_saved_foreground_count", r11.A00().getLong("timespent_foreground_count", 0)).putBoolean("timespent_saved_time_altered", z);
        }
        C18270x1.A0i(edit.putLong("timespent_start_time", 0).putLong("timespent_session_total", 0).putLong("timespent_end_time", 0), "timespent_foreground_count", 0);
    }

    public void BUN() {
        A01();
    }
}
