package X;

import android.content.Context;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.util.concurrent.TimeUnit;

/* renamed from: X.3Fa  reason: invalid class name and case insensitive filesystem */
public final class C64793Fa implements AnonymousClass4E8 {
    public final long A00;
    public final long A01;
    public final C614930z A02;
    public final C56612sH A03;
    public final AnonymousClass33p A04;
    public final C183538qC A05;
    public final C183538qC A06;

    public void BQW() {
        boolean z;
        C61192zr r12;
        String str;
        String A002;
        String A012;
        String A042;
        C05480Tm r14;
        Context context;
        int i;
        if (this.A02.A07()) {
            Log.i("AccountSwitchingDailyCron/onDailyCronNoMessageStore");
            C183538qC r3 = this.A06;
            AnonymousClass30A r7 = (AnonymousClass30A) r3.get();
            Log.i("InactiveAccountNotificationManager/processDailyNotificationsDeletion");
            C53892nq A013 = r7.A00.A01();
            if (A013 != null) {
                r7.A03.A00(A013.A07, r7.A08.A0H());
            }
            for (C53892nq r0 : r7.A01.A02().A01) {
                r7.A03.A00(r0.A07, r0.A04);
            }
            for (C53892nq r72 : C613630k.A00(this.A05)) {
                if (!r72.A03 || r72.A02) {
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("AccountSwitchingDailyCron/onDailyCronNoMessageStore/account : ");
                    A0o.append(C57072t2.A01(r72.A07));
                    A0o.append(", isLoggedIn : ");
                    A0o.append(r72.A03);
                    A0o.append(", isCompanion : ");
                    C18260x0.A1V(A0o, r72.A02);
                } else {
                    long j = r72.A04;
                    long j2 = j + this.A00;
                    C56612sH r8 = this.A03;
                    if (j2 > r8.A0H() || j2 <= AnonymousClass0x2.A0B(AnonymousClass0x2.A0F(this.A04), "last_daily_cron")) {
                        long j3 = j + this.A01;
                        if (j3 <= r8.A0H() && j3 > AnonymousClass0x2.A0B(AnonymousClass0x2.A0F(this.A04), "last_daily_cron")) {
                            AnonymousClass30A r1 = (AnonymousClass30A) r3.get();
                            z = false;
                            Log.i("InactiveAccountNotificationManager/showLogoutAccountNotification");
                            r12 = r1.A05;
                            str = r72.A07;
                            A002 = AnonymousClass30A.A00(C373421w.LOGGED_OUT_ACCOUNT, str);
                            A012 = r1.A01(r72);
                            C54292oU r13 = r1.A09;
                            A042 = C54292oU.A04(r13, R.string.f11nameremoved);
                            r14 = null;
                            context = r13.A00;
                            i = 5;
                        }
                    } else {
                        AnonymousClass30A r15 = (AnonymousClass30A) r3.get();
                        z = false;
                        Log.i("InactiveAccountNotificationManager/showDeleteAccountNotification");
                        r12 = r15.A05;
                        str = r72.A07;
                        A002 = AnonymousClass30A.A00(C373421w.DELETE_ACCOUNT, str);
                        A012 = r15.A01(r72);
                        C54292oU r16 = r15.A09;
                        A042 = C54292oU.A04(r16, R.string.f11nameremoved);
                        r14 = null;
                        context = r16.A00;
                        i = 6;
                    }
                    r12.A03(C627736r.A0z(context, str, i, z), r14, A002, A012, A042, i, z, z);
                }
            }
        }
    }

    public C64793Fa(C614930z r4, C56612sH r5, AnonymousClass33p r6, C183538qC r7, C183538qC r8) {
        C18260x0.A0f(r5, r4, r6, r7, r8);
        this.A03 = r5;
        this.A02 = r4;
        this.A04 = r6;
        this.A05 = r7;
        this.A06 = r8;
        TimeUnit timeUnit = TimeUnit.DAYS;
        this.A01 = timeUnit.toMillis(25);
        this.A00 = timeUnit.toMillis(55);
    }

    public String BDW() {
        return "AccountSwitchingDailyCron";
    }

    public /* synthetic */ void BQX() {
    }
}
