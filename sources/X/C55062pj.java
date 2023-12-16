package X;

import com.whatsapp.util.Log;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.2pj  reason: invalid class name and case insensitive filesystem */
public class C55062pj {
    public AnonymousClass4FW A00;
    public ScheduledFuture A01;
    public final C64773Ex A02;
    public final C57162tC A03;
    public final C56982ss A04;
    public final C49482gb A05;
    public final C40422Ft A06;
    public final C71203bj A07;
    public final C71203bj A08;
    public final C29431io A09;
    public final ScheduledThreadPoolExecutor A0A;

    public final synchronized void A01(C71203bj r6, long j, boolean z) {
        long j2 = 0;
        if (j != 0) {
            j2 = Math.max(C625635p.A0L, j);
        }
        ScheduledFuture scheduledFuture = this.A01;
        if (scheduledFuture != null && !scheduledFuture.isDone() && this.A01.getDelay(TimeUnit.MILLISECONDS) > j2 && !this.A01.cancel(false)) {
            Log.e("EphemeralUpdateManager/scheduleRunnable/unable to cancel future");
        }
        if (j2 < 86400000) {
            ScheduledFuture<?> schedule = this.A0A.schedule(r6, j2, TimeUnit.MILLISECONDS);
            this.A01 = schedule;
            if (z) {
                try {
                    schedule.get();
                } catch (InterruptedException | ExecutionException e) {
                    Log.e("EphemeralUpdateManager/scheduleNextRun", e);
                }
            }
        }
        return;
    }

    public C55062pj(C55682qk r23, C64773Ex r24, C56612sH r25, C57162tC r26, C56922sm r27, C56982ss r28, C66543Lv r29, AnonymousClass313 r30, C49482gb r31, C50012hU r32, C40432Fu r33, C29431io r34, C55332qB r35, C55292q7 r36, C620333f r37, C66443Ll r38, AnonymousClass1VX r39, C55832qz r40, AnonymousClass4FS r41) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        AnonymousClass4FS r2 = r41;
        AnonymousClass1VX r3 = r39;
        if (r3.A0Y(C58422vE.A02, 2335)) {
            scheduledThreadPoolExecutor = new C73513fd((C69423Wy) r2, new C72233dO("ephemeral-update"), 1);
        } else {
            scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new AnonymousClass343(0));
            scheduledThreadPoolExecutor.setKeepAliveTime(10, TimeUnit.MILLISECONDS);
        }
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.A00 = new C86164Jb(this, 5);
        C49482gb r11 = r31;
        this.A05 = r11;
        C40422Ft r12 = new C40422Ft(this);
        this.A06 = r12;
        this.A09 = r34;
        this.A04 = r28;
        this.A02 = r24;
        C55332qB r15 = r35;
        C40432Fu r14 = r33;
        C50012hU r13 = r32;
        AnonymousClass313 r10 = r30;
        C55832qz r20 = r40;
        C56922sm r8 = r27;
        C66443Ll r18 = r38;
        C56612sH r7 = r25;
        C620333f r17 = r37;
        C55292q7 r16 = r36;
        C55682qk r6 = r23;
        C66543Lv r9 = r29;
        AnonymousClass1VX r19 = r3;
        this.A07 = new C71203bj(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, 100);
        this.A08 = new C71203bj(r6, r7, r8, r9, r10, r11, (C40422Ft) null, r13, r14, r15, r16, r17, r18, r19, r20, 0);
        this.A03 = r26;
        this.A0A = scheduledThreadPoolExecutor;
    }

    public void A00() {
        this.A0A.execute(C69983Zk.A00(this, 22));
    }

    public void A02(C95814uZ r3, String str) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("EphemeralUpdateManager/sessionActive/");
        A0o.append(str);
        C18260x0.A1P(A0o, "/", r3);
        this.A05.A01(r3, str);
    }

    public void A03(C95814uZ r5, String str) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("EphemeralUpdateManager/sessionInactive/");
        A0o.append(str);
        C18260x0.A1P(A0o, "/", r5);
        C49482gb r3 = this.A05;
        Map map = r3.A03;
        Set set = (Set) map.get(r5);
        if (set != null) {
            set.remove(str);
            if (set.isEmpty()) {
                map.remove(r5);
            }
        } else {
            C18260x0.A1Q(AnonymousClass001.A0o(), "EphemeralSessionManager/null session: ", r5);
        }
        if (map.isEmpty()) {
            r3.A00 = -1;
        }
        if (r5 != null) {
            C624134x A0C = r3.A02.A0C(r5);
            if (A0C == null) {
                return;
            }
            if (A0C.A05 <= 0 && !C627636p.A0I(A0C.A1I)) {
                return;
            }
        }
        A00();
    }
}
