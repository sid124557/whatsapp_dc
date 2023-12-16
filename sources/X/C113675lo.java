package X;

import android.content.SharedPreferences;

/* renamed from: X.5lo  reason: invalid class name and case insensitive filesystem */
public class C113675lo implements AnonymousClass664 {
    public final C103525Nh A00;

    public String BDW() {
        return "NtpDailyCron";
    }

    public void BQV() {
        long j;
        long j2;
        long j3;
        long A0A;
        C103525Nh r10 = this.A00;
        SharedPreferences A03 = r10.A01.A03("ntp-scheduler");
        long j4 = A03.getLong("/ntp/last_event_timestamp", 0);
        long currentTimeMillis = System.currentTimeMillis();
        if (j4 == 0) {
            synchronized (r10) {
                C18270x1.A0i(A03.edit(), "/ntp/last_event_timestamp", currentTimeMillis);
            }
            return;
        }
        long j5 = currentTimeMillis - j4;
        synchronized (r10) {
            j = (long) A03.getInt("/ntp/started", 0);
            j2 = (long) A03.getInt("/ntp/succeeded", 0);
            j3 = (long) A03.getInt("/ntp/failed", 0);
            A0A = AnonymousClass0x2.A0A(A03, "/ntp/work_manager_init");
            C18270x1.A0i(A03.edit().remove("/ntp/started").remove("/ntp/succeeded").remove("/ntp/failed"), "/ntp/last_event_timestamp", currentTimeMillis);
        }
        C94644rg r1 = new C94644rg();
        r1.A02 = Long.valueOf(j);
        r1.A03 = Long.valueOf(j2);
        r1.A01 = Long.valueOf(j3);
        r1.A00 = Long.valueOf(j5);
        r1.A04 = Long.valueOf(A0A);
        r10.A00.BhD(r1);
    }

    public C113675lo(C103525Nh r1) {
        this.A00 = r1;
    }
}
