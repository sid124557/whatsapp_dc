package X;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import com.whatsapp.util.Log;
import java.util.Random;

/* renamed from: X.1Hy  reason: invalid class name */
public class AnonymousClass1Hy extends C105185Tx {
    public final C50862it A00;
    public final C56612sH A01;
    public final AnonymousClass33p A02;
    public final C66523Lt A03;
    public final Random A04;

    public boolean A04(Intent intent) {
        return C18280x3.A1V(intent, "com.whatsapp.action.HEARTBEAT_WAKEUP");
    }

    public final void A05() {
        long A0H = this.A01.A0H();
        AnonymousClass33p r10 = this.A02;
        C183538qC r9 = r10.A01;
        if (!C18300x5.A0B(r9).contains("last_heartbeat_login")) {
            long A0A = A0H - C18290x4.A0A(this.A04.nextInt(86400));
            C18260x0.A0M(r10, "last_heartbeat_login", A0A);
            StringBuilder A0o = AnonymousClass001.A0o();
            C18260x0.A1L(A0o, AnonymousClass0x9.A11("no last heartbeat known; setting to ", A0o, A0A));
        }
        long A0B = AnonymousClass0x2.A0B(C18300x5.A0B(r9), "last_heartbeat_login");
        if (A0B <= A0H) {
            long j = 86400000 + A0B;
            if (j >= A0H) {
                long elapsedRealtime = (j - A0H) + SystemClock.elapsedRealtime();
                StringBuilder A0o2 = AnonymousClass001.A0o();
                C18260x0.A1L(A0o2, AnonymousClass0x9.A11("HeartbeatWakeupAction; elapsedRealTimeHeartbeatLogin=", A0o2, elapsedRealtime));
                if (!this.A00.A02(A00("com.whatsapp.action.HEARTBEAT_WAKEUP", 134217728), 2, elapsedRealtime)) {
                    Log.w("HeartbeatWakeupAction; AlarmManager is null");
                    return;
                }
                return;
            }
        }
        StringBuilder A0o3 = AnonymousClass001.A0o();
        A0o3.append("HeartbeatWakeupAction/last heart beat login=");
        A0o3.append(A0B);
        A0o3.append(" server time=");
        A0o3.append(A0H);
        C18290x4.A1Q(A0o3, " client time=");
        C18260x0.A0y(" interval=", A0o3, 86400);
        A06((Intent) null);
    }

    public AnonymousClass1Hy(Context context, C50862it r2, C56612sH r3, AnonymousClass33p r4, C66523Lt r5, Random random) {
        super(context);
        this.A01 = r3;
        this.A04 = random;
        this.A00 = r2;
        this.A03 = r5;
        this.A02 = r4;
    }

    public void A01() {
        A05();
    }

    public final void A06(Intent intent) {
        C18260x0.A1R(AnonymousClass001.A0o(), "HeartbeatWakeupAction; intent=", intent);
        long A0H = this.A01.A0H();
        this.A03.A09(0, false, true, true, true);
        C18260x0.A12("HeartbeatWakeupAction/setting last heart beat login time: ", AnonymousClass001.A0o(), A0H);
        C18270x1.A0i(C18270x1.A03(this.A02), "last_heartbeat_login", A0H);
        A05();
    }

    public void A02(Intent intent) {
        A06(intent);
    }
}
