package X;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.0hb  reason: invalid class name and case insensitive filesystem */
public final class C10230hb implements C17110ua, AnonymousClass49Y {
    public int A00;
    public int A01 = 0;
    public int A02;
    public long A03;
    public long A04;
    public BroadcastReceiver A05;
    public BroadcastReceiver A06;
    public BroadcastReceiver A07;
    public BroadcastReceiver A08;
    public String A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public final Handler A0D = AnonymousClass000.A0A();
    public final C55682qk A0E;
    public final C10240hc A0F;
    public final AnonymousClass0QJ A0G;
    public final C29441ip A0H;
    public final C54292oU A0I;
    public final AnonymousClass33T A0J;
    public final AnonymousClass33p A0K;
    public final C620733j A0L;
    public final AnonymousClass1VX A0M;
    public final AnonymousClass4FS A0N;
    public final C34171uL A0O;
    public final AtomicReference A0P = new AtomicReference(10);
    public volatile Notification A0Q;

    public void A0F() {
        this.A0Q = null;
        AnonymousClass33T r2 = this.A0J;
        r2.A05(5, "GoogleDriveNotificationManager1");
        r2.A05(46, "GoogleDriveNotificationManager1");
    }

    public synchronized void A0I() {
        int i = this.A01 + 1;
        this.A01 = i;
        if (i <= 1) {
            Log.i("gdrive-notification-manager/register");
            this.A0P.set(10);
            this.A0C = false;
            this.A0B = false;
            this.A0A = false;
            this.A00 = 0;
            this.A02 = 0;
            this.A03 = 0;
            this.A04 = 0;
            this.A09 = null;
            if (this.A0Q != null) {
                C55682qk r3 = this.A0E;
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("numOfClientsRegistered=");
                r3.A0A("gdrive-notification-manager/register called with non-null last notification", false, AnonymousClass000.A0h(A0o, this.A01));
            }
            this.A0Q = null;
            this.A0D.post(new C11510jl(this));
            this.A0G.A01(this);
        }
    }

    public synchronized void A0J() {
        A0H();
        int i = this.A01 - 1;
        this.A01 = i;
        if (i <= 0) {
            Log.i("gdrive-notification-manager/unregister");
            this.A0D.post(new C11520jm(this));
            this.A0G.A02(this);
            A0K(this.A05);
            A0K(this.A07);
            A0K(this.A06);
            A0K(this.A08);
        }
    }

    public synchronized void A0M(boolean z) {
        this.A0C = z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0N(boolean r11) {
        /*
            r10 = this;
            r7 = 1
            if (r11 == 0) goto L_0x0009
            java.lang.String r0 = "gdrive-notification-manager/backup-error/backup-user-initiated/true"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return r7
        L_0x0009:
            X.33p r3 = r10.A0K
            int r6 = r3.A05()
            r8 = 86400000(0x5265c00, double:4.2687272E-316)
            if (r6 == 0) goto L_0x0082
            if (r6 == r7) goto L_0x007d
            r2 = 2
            if (r6 == r2) goto L_0x0079
            r0 = 3
            if (r6 == r0) goto L_0x002c
            r0 = 4
            if (r6 == r0) goto L_0x0082
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "gdrive-notification-manager/backup-error/unexpected-frequency/"
            java.lang.String r0 = X.AnonymousClass000.A0Y(r0, r1, r6)
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x002c:
            r8 = 5184000000(0x134fd9000, double:2.561236308E-314)
        L_0x0031:
            int r5 = r3.A0E()
            int r0 = r5 + 1
            int r0 = r0 % r2
            r2 = 1
            if (r0 == 0) goto L_0x0051
            r2 = 0
            java.lang.String r0 = r3.A0X()
            if (r0 == 0) goto L_0x0073
            long r3 = r3.A0R(r0)
            long r1 = java.lang.System.currentTimeMillis()
            long r1 = r1 - r3
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 > 0) goto L_0x0050
            r7 = 0
        L_0x0050:
            r2 = r7
        L_0x0051:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "gdrive-notification-manager/backup-error/frequency="
            r1.append(r0)
            java.lang.String r0 = X.AnonymousClass0YV.A03(r6)
            r1.append(r0)
            java.lang.String r0 = "/success-backup-fail-count="
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = "/show-notification="
            java.lang.String r0 = X.AnonymousClass000.A0b(r0, r1, r2)
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return r2
        L_0x0073:
            java.lang.String r0 = "gdrive-notification-manager/backup-error/google-account-is-null/unexpected"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x0051
        L_0x0079:
            r8 = 1209600000(0x48190800, double:5.97621805E-315)
            goto L_0x0031
        L_0x007d:
            r2 = 5
            r8 = 432000000(0x19bfcc00, double:2.13436359E-315)
            goto L_0x0031
        L_0x0082:
            r2 = 1
            goto L_0x0031
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10230hb.A0N(boolean):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0020, code lost:
        if (A0N(r12.A0C) != false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void BNJ(boolean r13) {
        /*
            r12 = this;
            r4 = r12
            monitor-enter(r4)
            java.util.concurrent.atomic.AtomicReference r3 = r12.A0P     // Catch:{ all -> 0x0057 }
            java.lang.Object r0 = r3.get()     // Catch:{ all -> 0x0057 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x0057 }
            int r2 = r0.intValue()     // Catch:{ all -> 0x0057 }
            r1 = 23
            if (r2 == r1) goto L_0x0055
            r0 = 15
            if (r13 != 0) goto L_0x0022
            if (r2 == r0) goto L_0x0055
            if (r2 != r0) goto L_0x0022
            boolean r0 = r12.A0C     // Catch:{ all -> 0x0057 }
            boolean r0 = r12.A0N(r0)     // Catch:{ all -> 0x0057 }
            if (r0 != 0) goto L_0x0029
        L_0x0022:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0057 }
            r3.set(r0)     // Catch:{ all -> 0x0057 }
        L_0x0029:
            java.lang.String r0 = "gdrive-notification-manager/backup-end"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0057 }
            r0 = 0
            r12.A00 = r0     // Catch:{ all -> 0x0057 }
            X.2oU r0 = r12.A0I     // Catch:{ all -> 0x0057 }
            android.content.Context r1 = r0.A06()     // Catch:{ all -> 0x0057 }
            r0 = 2131889562(0x7f120d9a, float:1.9413791E38)
            if (r13 == 0) goto L_0x003f
            r0 = 2131889563(0x7f120d9b, float:1.9413793E38)
        L_0x003f:
            java.lang.String r6 = r1.getString(r0)     // Catch:{ all -> 0x0057 }
            r0 = 2131889560(0x7f120d98, float:1.9413787E38)
            java.lang.String r7 = r1.getString(r0)     // Catch:{ all -> 0x0057 }
            X.0Tm r5 = r12.A0D()     // Catch:{ all -> 0x0057 }
            r8 = 1
            r9 = -1
            r10 = 0
            r11 = r8
            r4.A0L(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x0057 }
        L_0x0055:
            monitor-exit(r4)
            return
        L_0x0057:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10230hb.BNJ(boolean):void");
    }

    public void BNM(long j, long j2) {
        if (A00(this.A0P, 20) != 20) {
            Log.i("gdrive-notification-manager/backup-paused-for-sdcard-missing");
            int A012 = AnonymousClass000.A01(j, (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1)), j2);
            Context A062 = this.A0I.A06();
            A0L((C05480Tm) null, A062.getString(R.string.f11nameremoved), A062.getString(R.string.f11nameremoved), 3, A012, false, false);
        }
    }

    public void BNN(long j, long j2) {
        if (A00(this.A0P, 19) != 19) {
            Log.i("gdrive-notification-manager/backup-paused-for-sdcard-unmounted");
            int A012 = AnonymousClass000.A01(j, (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1)), j2);
            Context A062 = this.A0I.A06();
            A0L((C05480Tm) null, A062.getString(R.string.f11nameremoved), A062.getString(R.string.f11nameremoved), 3, A012, false, false);
        }
    }

    public void BNO(long j, long j2) {
        C05480Tm r6;
        if (A00(this.A0P, 16) != 16) {
            Log.i("gdrive-notification-manager/backup-paused-wifi-unavailable");
            if (this.A05 == null) {
                C17480ve r62 = new C17480ve(this, 5);
                this.A05 = r62;
                C154317cy.A00(r62, this.A0I.A06(), new IntentFilter("enable_backup_over_cellular"), (Handler) null, C58152un.A0C, false);
            }
            if (this.A0H.A08(true) == 2) {
                r6 = new C05480Tm(R.drawable.ic_action_refresh, this.A0I.A06().getString(R.string.f11nameremoved), A0C("enable_backup_over_cellular"));
            } else {
                r6 = null;
            }
            int A012 = AnonymousClass000.A01(j, (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1)), j2);
            Context A062 = this.A0I.A06();
            A0L(r6, A062.getString(R.string.f11nameremoved), A062.getString(R.string.f11nameremoved), 3, A012, false, false);
        }
    }

    public void BNP(int i) {
        AtomicReference atomicReference = this.A0P;
        boolean A1X = AnonymousClass001.A1X(AnonymousClass001.A0K(atomicReference.get()), 12);
        if (A00(atomicReference, 12) != 12 || System.currentTimeMillis() - this.A04 >= 200) {
            this.A04 = System.currentTimeMillis();
            Context A062 = this.A0I.A06();
            String string = A062.getString(R.string.f11nameremoved);
            if (i >= 0 || A1X) {
                A0L((C05480Tm) null, string, AnonymousClass002.A0F(A062, AnonymousClass001.A0l(this.A0L.A0N(), i), new Object[1], 0, R.string.f11nameremoved), 2, -1, true, false);
            }
        }
    }

    public void BNQ() {
        if (A00(this.A0P, 11) != 11) {
            Log.i("gdrive-notification-manager/backup-prep-start");
            Context A062 = this.A0I.A06();
            A0L((C05480Tm) null, A062.getString(R.string.f11nameremoved), A062.getString(R.string.f11nameremoved), 2, -1, true, false);
        }
    }

    public synchronized void BSQ(int i, Bundle bundle) {
        synchronized (this) {
            if (i != 10) {
                if (((Integer) this.A0P.getAndSet(15)).intValue() != 15) {
                    Log.i(AnonymousClass0YV.A0C("gdrive-notification-manager/backup-error/", AnonymousClass001.A0o(), i));
                    if (A0N(this.A0C)) {
                        Context A062 = this.A0I.A06();
                        String string = A062.getString(R.string.f11nameremoved);
                        int i2 = R.string.f11nameremoved;
                        if (i == 13) {
                            i2 = R.string.f11nameremoved;
                        }
                        A0L((C05480Tm) null, string, A062.getString(i2), 1, -1, false, true);
                    }
                }
            }
        }
    }

    public void BWC(long j, boolean z) {
        String str;
        if (A00(this.A0P, 33) != 33) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("gdrive-notification-manager/restore-end/");
            if (z) {
                str = "success";
            } else {
                str = "failed";
            }
            A0o.append(str);
            Log.i(AnonymousClass000.A0Z(" restored: ", A0o, j));
        }
        if (!z || j != 0) {
            Context A062 = this.A0I.A06();
            A0L((C05480Tm) null, A062.getString(R.string.f11nameremoved), AnonymousClass002.A0F(A062, AnonymousClass35V.A04(this.A0L, j), AnonymousClass002.A0L(), 0, R.string.f11nameremoved), 1, -1, false, true);
            return;
        }
        A0F();
    }

    public void BWD(long j, long j2) {
        if (A00(this.A0P, 29) != 29) {
            Log.i("gdrive-notification-manager/restore-paused-data-unavailable");
            Context A062 = this.A0I.A06();
            A0L((C05480Tm) null, A062.getString(R.string.f11nameremoved), A062.getString(R.string.f11nameremoved), 3, AnonymousClass000.A01(j, (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1)), j2), false, true);
        }
    }

    public void BWE(long j, long j2) {
        int i;
        if (A00(this.A0P, 30) != 30) {
            Log.i("gdrive-notification-manager/restore-paused-for-battery");
            if (this.A08 == null) {
                C17480ve r6 = new C17480ve(this, 9);
                this.A08 = r6;
                C154317cy.A00(r6, this.A0I.A06(), new IntentFilter("enable_restore_over_low_battery"), (Handler) null, C58152un.A0C, false);
            }
            Context A062 = this.A0I.A06();
            C05480Tm r62 = new C05480Tm(R.drawable.ic_action_refresh, A062.getString(R.string.f11nameremoved), A0C("enable_restore_over_low_battery"));
            String string = A062.getString(R.string.f11nameremoved);
            String string2 = A062.getString(R.string.f11nameremoved);
            long j3 = j2;
            if (j2 > 0) {
                i = AnonymousClass001.A0F(j, j3);
            } else {
                i = -1;
            }
            A0L(r62, string, string2, 3, i, false, true);
        }
    }

    public void BWF(long j, long j2) {
        if (A00(this.A0P, 32) != 32) {
            Log.i("gdrive-notification-manager/restore-paused-sdcard-missing");
            Context A062 = this.A0I.A06();
            A0L((C05480Tm) null, A062.getString(R.string.f11nameremoved), A062.getString(R.string.f11nameremoved), 3, AnonymousClass000.A01(j, (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1)), j2), false, true);
        }
    }

    public void BWG(long j, long j2) {
        if (A00(this.A0P, 31) != 31) {
            Log.i("gdrive-notification-manager/restore-paused-sdcard-unmounted");
            A0F();
            Context A062 = this.A0I.A06();
            A0L((C05480Tm) null, A062.getString(R.string.f11nameremoved), A062.getString(R.string.f11nameremoved), 3, AnonymousClass000.A01(j, (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1)), j2), false, true);
        }
    }

    public void BWH(long j, long j2) {
        C05480Tm r6;
        if (A00(this.A0P, 28) != 28) {
            Log.i("gdrive-notification-manager/restore-paused-wifi-unavailable");
            if (this.A07 == null) {
                C17480ve r62 = new C17480ve(this, 8);
                this.A07 = r62;
                C154317cy.A00(r62, this.A0I.A06(), new IntentFilter("enable_restore_over_cellular"), (Handler) null, C58152un.A0C, false);
            }
            if (this.A0H.A08(true) == 2) {
                r6 = new C05480Tm(R.drawable.ic_action_refresh, this.A0I.A06().getString(R.string.f11nameremoved), A0C("enable_restore_over_cellular"));
            } else {
                r6 = null;
            }
            Context A062 = this.A0I.A06();
            A0L(r6, A062.getString(R.string.f11nameremoved), A062.getString(R.string.f11nameremoved), 3, AnonymousClass000.A01(j, (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1)), j2), false, true);
        }
    }

    public void BWJ() {
        Context A062 = this.A0I.A06();
        String string = A062.getString(R.string.f11nameremoved);
        if (A00(this.A0P, 24) != 24) {
            Log.i("gdrive-notification-manager/restore-prep-start");
        }
        A0L((C05480Tm) null, string, A062.getString(R.string.f11nameremoved), 2, -1, true, false);
    }

    public void Bax() {
        if (A00(this.A0P, 21) != 21) {
            Log.i("gdrive-notification-manager/backup-scrub-start");
            Context A062 = this.A0I.A06();
            A0L((C05480Tm) null, A062.getString(R.string.f11nameremoved), A062.getString(R.string.f11nameremoved), 2, -1, true, false);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void A04() {
        AtomicReference atomicReference = this.A0P;
        int A0K2 = AnonymousClass001.A0K(atomicReference.get());
        int A082 = this.A0H.A08(true);
        if (A0K2 == 28) {
            if (A082 == 2 || A082 == 0) {
                atomicReference.set(10);
                BWH((long) this.A02, 100);
            }
        } else if (A0K2 != 16) {
        } else {
            if (A082 == 2 || A082 == 0) {
                atomicReference.set(10);
                BNO((long) this.A02, 100);
            }
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void A05() {
        this.A0H.A06(this);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void A06() {
        this.A0H.A07(this);
    }

    public Notification A0A() {
        return this.A0Q;
    }

    public final PendingIntent A0C(String str) {
        Intent intent = new Intent(str);
        intent.setPackage("com.whatsapp");
        return C624735e.A01(this.A0I.A06(), 0, intent, 0);
    }

    public final C05480Tm A0D() {
        if (!C06540Yd.A0Q(this.A0M)) {
            return null;
        }
        C17480ve r4 = new C17480ve(this, 7);
        Context A062 = this.A0I.A06();
        C154317cy.A00(r4, A062, new IntentFilter("clear_backup_worker"), (Handler) null, C58152un.A0C, false);
        return new C05480Tm(R.drawable.ic_action_cancel, A062.getString(R.string.f11nameremoved), A0C("clear_backup_worker"));
    }

    public final C05610Ue A0E() {
        Context A062 = this.A0I.A06();
        C05610Ue A012 = C66553Lw.A01(A062);
        A012.A0K = "chat_history_backup@1";
        Intent intent = new Intent();
        intent.setClassName(A062.getPackageName(), "com.whatsapp.backup.google.SettingsGoogleDrive");
        A012.A09 = C624735e.A00(A062, 0, intent, 0);
        AnonymousClass33T.A02(A012, R.drawable.notifybar);
        A012.A06 = 1;
        return A012;
    }

    public void A0G() {
        if (!this.A0B) {
            A0F();
        }
    }

    public final void A0H() {
        Notification notification = this.A0Q;
        Number number = (Number) this.A0P.get();
        if (notification != null && number != null) {
            A0F();
            int intValue = number.intValue();
            if ((intValue == 15 || intValue == 27) && A0N(this.A0C)) {
                Log.i("gdrive-notification-manager/re-posting important notification");
                this.A0J.A04(46, notification);
            }
        }
    }

    public final void A0K(BroadcastReceiver broadcastReceiver) {
        if (broadcastReceiver != null) {
            try {
                this.A0I.A06().unregisterReceiver(broadcastReceiver);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    public final void A0L(C05480Tm r7, String str, String str2, int i, int i2, boolean z, boolean z2) {
        this.A09 = str2;
        if (this.A0A) {
            A0F();
        }
        C05610Ue A0E2 = A0E();
        boolean z3 = true;
        if (i == 1) {
            A0E2.A03(0, 0, false);
        } else if (i != 2) {
            A0E2.A03(100, i2, false);
        } else {
            A0E2.A03(100, i2, true);
        }
        A0E2.A0E(z2);
        A0E2.A0F(z);
        A0E2.A0B(str);
        A0E2.A0A(str2);
        this.A0B = z;
        if (r7 == null) {
            z3 = false;
        }
        this.A0A = z3;
        if (r7 != null) {
            A0E2.A0O.add(r7);
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        if (i == 2) {
            A0o.append("indeterminate");
        } else {
            A0o.append(i2);
            A0o.append('%');
        }
        Notification A012 = A0E2.A01();
        this.A0Q = A012;
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("gdrive-notification-manager/update-notification title:");
        A0o2.append(str);
        A0o2.append(" text:");
        A0o2.append(str2);
        Log.d(AnonymousClass000.A0P(A0o, " progress:", A0o2));
        this.A0J.A04(5, A012);
    }

    public void BNK(long j, long j2) {
        Log.i("gdrive-notification-manager/backup-paused-for-data-connection");
        if (A00(this.A0P, 17) != 17) {
            int A012 = AnonymousClass000.A01(j, (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1)), j2);
            Context A062 = this.A0I.A06();
            A0L((C05480Tm) null, A062.getString(R.string.f11nameremoved), A062.getString(R.string.f11nameremoved), 3, A012, false, false);
        }
    }

    public void BNL(long j, long j2) {
        int i;
        Log.i("gdrive-notification-manager/backup-paused-for-low-battery");
        if (A00(this.A0P, 18) != 18) {
            if (this.A06 == null) {
                C17480ve r7 = new C17480ve(this, 6);
                this.A06 = r7;
                C154317cy.A00(r7, this.A0I.A06(), new IntentFilter("enable_backup_over_low_battery"), (Handler) null, C58152un.A0C, false);
            }
            Context A062 = this.A0I.A06();
            C05480Tm r72 = new C05480Tm(R.drawable.ic_action_refresh, A062.getString(R.string.f11nameremoved), A0C("enable_backup_over_low_battery"));
            long j3 = j2;
            if (j2 > 0) {
                i = AnonymousClass001.A0F(j, j3);
            } else {
                i = -1;
            }
            A0L(r72, A062.getString(R.string.f11nameremoved), A062.getString(R.string.f11nameremoved), 3, i, false, false);
        }
    }

    public synchronized void BNR(long j, long j2) {
        int i;
        synchronized (this) {
            AtomicReference atomicReference = this.A0P;
            boolean A1X = AnonymousClass001.A1X(((Integer) atomicReference.get()).intValue(), 14);
            if (((Integer) atomicReference.getAndSet(14)).intValue() != 14 || System.currentTimeMillis() - this.A04 >= 200) {
                this.A04 = System.currentTimeMillis();
                long j3 = j2;
                long j4 = j;
                if (j2 > 0) {
                    i = AnonymousClass001.A0F(j4, j3);
                } else {
                    i = 0;
                }
                if (i - this.A00 > 0 || A1X) {
                    Locale locale = Locale.ENGLISH;
                    Object[] objArr = new Object[3];
                    AnonymousClass000.A1Q(objArr, 0, j4);
                    AnonymousClass000.A1Q(objArr, 1, j3);
                    objArr[2] = Integer.valueOf(i);
                    Log.i(String.format(locale, "gdrive-notification-manager/backup-progress %d/%d (%d)", objArr));
                    this.A00 = i;
                    Context A062 = this.A0I.A06();
                    String string = A062.getString(R.string.f11nameremoved);
                    Object[] objArr2 = new Object[3];
                    C620733j r11 = this.A0L;
                    objArr2[0] = AnonymousClass35V.A04(r11, j4);
                    objArr2[1] = AnonymousClass35V.A04(r11, j3);
                    String A0F2 = AnonymousClass002.A0F(A062, AnonymousClass001.A0l(r11.A0N(), i), objArr2, 2, R.string.f11nameremoved);
                    if (!A0F2.equals(this.A09)) {
                        A0L((C05480Tm) null, string, A0F2, 3, i, true, false);
                    }
                }
            }
        }
    }

    public void BNS() {
        this.A0P.getAndSet(13);
    }

    public void BPq(C59622xD r3) {
        this.A0N.BkM(new C11530jn(this));
    }

    public void BRt() {
    }

    public void BSR(int i, Bundle bundle) {
        if (i != 10) {
            if (A00(this.A0P, 27) != 27) {
                Log.i(AnonymousClass0YV.A0C("gdrive-notification-manager/media-restore-error/", AnonymousClass001.A0o(), i));
                Context A062 = this.A0I.A06();
                A0L((C05480Tm) null, A062.getString(R.string.f11nameremoved), A062.getString(R.string.f11nameremoved), 1, -1, false, true);
            }
        }
    }

    public synchronized void BWI(int i) {
        synchronized (this) {
            Context A062 = this.A0I.A06();
            String string = A062.getString(R.string.f11nameremoved);
            AtomicReference atomicReference = this.A0P;
            if (((Integer) atomicReference.get()).intValue() != 25 || System.currentTimeMillis() - this.A03 >= 200) {
                this.A03 = System.currentTimeMillis();
                boolean A1X = AnonymousClass001.A1X(((Integer) atomicReference.getAndSet(25)).intValue(), 25);
                int i2 = i;
                if (i > 0 || A1X) {
                    A0L((C05480Tm) null, string, AnonymousClass002.A0F(A062, AnonymousClass001.A0l(this.A0L.A0N(), i2), new Object[1], 0, R.string.f11nameremoved), 2, i2, true, false);
                }
            }
        }
    }

    public synchronized void BWK(long j, long j2) {
        int i;
        synchronized (this) {
            Context A062 = this.A0I.A06();
            String string = A062.getString(R.string.f11nameremoved);
            AtomicReference atomicReference = this.A0P;
            if (((Integer) atomicReference.get()).intValue() != 26 || System.currentTimeMillis() - this.A04 >= 200) {
                this.A04 = System.currentTimeMillis();
                long j3 = j;
                long j4 = j2;
                if (((Integer) atomicReference.getAndSet(26)).intValue() != 26) {
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("gdrive-notification-manager/restore-progress ");
                    A0o.append(j3);
                    A0o.append("/");
                    A0o.append(j4);
                    Log.i(AnonymousClass000.A0X(" bytes.", A0o));
                }
                if (j2 > 0) {
                    i = AnonymousClass001.A0F(j3, j4);
                } else {
                    i = -1;
                }
                this.A02 = i;
                Object[] objArr = new Object[3];
                C620733j r7 = this.A0L;
                objArr[0] = AnonymousClass35V.A04(r7, j3);
                objArr[1] = AnonymousClass35V.A04(r7, j4);
                String A0F2 = AnonymousClass002.A0F(A062, AnonymousClass001.A0l(r7.A0N(), this.A02), objArr, 2, R.string.f11nameremoved);
                if (!A0F2.equals(this.A09)) {
                    A0L((C05480Tm) null, string, A0F2, 3, this.A02, true, false);
                }
            }
        }
    }

    public void BWd() {
    }

    public void Bew() {
    }

    public C10230hb(C55682qk r3, C10240hc r4, AnonymousClass0QJ r5, C29441ip r6, C54292oU r7, AnonymousClass33T r8, AnonymousClass33p r9, C620733j r10, AnonymousClass1VX r11, AnonymousClass4FS r12, C34171uL r13) {
        this.A0I = r7;
        this.A0M = r11;
        this.A0E = r3;
        this.A0N = r12;
        this.A0L = r10;
        this.A0O = r13;
        this.A0K = r9;
        this.A0J = r8;
        this.A0H = r6;
        this.A0F = r4;
        this.A0G = r5;
    }

    public static int A00(AtomicReference atomicReference, int i) {
        return ((Number) atomicReference.getAndSet(Integer.valueOf(i))).intValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0048, code lost:
        if (r0 == false) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0019, code lost:
        if (r1 != false) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.app.Notification A0B(android.content.res.Resources r6, java.lang.String r7) {
        /*
            r5 = this;
            android.content.res.Resources r3 = X.C18570xu.A01(r6)
            X.0Ue r2 = r5.A0E()
            java.lang.String r0 = "action_restore"
            boolean r4 = r0.equals(r7)
            if (r4 != 0) goto L_0x001b
            java.lang.String r0 = "action_restore_media"
            boolean r1 = r0.equals(r7)
            r0 = 2131895937(0x7f122681, float:1.9426721E38)
            if (r1 == 0) goto L_0x001e
        L_0x001b:
            r0 = 2131895939(0x7f122683, float:1.9426725E38)
        L_0x001e:
            java.lang.String r0 = r3.getString(r0)
            r2.A0B(r0)
            java.lang.String r0 = "action_backup"
            boolean r0 = r0.equals(r7)
            if (r0 != 0) goto L_0x004a
            if (r4 != 0) goto L_0x0059
            java.lang.String r0 = "action_restore_media"
            boolean r0 = r0.equals(r7)
            if (r0 != 0) goto L_0x0059
            java.lang.String r0 = "action_change_number"
            boolean r0 = r0.equals(r7)
            if (r0 != 0) goto L_0x004a
            java.lang.String r0 = "action_delete"
            boolean r0 = r0.equals(r7)
            r1 = 2131895800(0x7f1225f8, float:1.9426443E38)
            if (r0 != 0) goto L_0x004d
        L_0x004a:
            r1 = 2131895936(0x7f122680, float:1.942672E38)
        L_0x004d:
            java.lang.String r0 = r3.getString(r1)
            r2.A0A(r0)
            android.app.Notification r0 = r2.A01()
            return r0
        L_0x0059:
            r1 = 2131895938(0x7f122682, float:1.9426723E38)
            goto L_0x004d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10230hb.A0B(android.content.res.Resources, java.lang.String):android.app.Notification");
    }

    public void BSS(int i, Bundle bundle) {
        Log.i(AnonymousClass0YV.A0C("gdrive-notification-manager/msgstore-restore-error/", AnonymousClass001.A0o(), i));
    }

    public void BWc(long j, long j2) {
    }

    public void BLu(boolean z) {
    }

    public void BWb(boolean z) {
    }

    public void BNI() {
        A0F();
    }

    public void BWB() {
        A0F();
    }
}
