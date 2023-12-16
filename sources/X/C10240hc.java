package X;

import android.content.Context;
import android.content.Intent;
import android.net.wifi.WifiManager;
import android.os.ConditionVariable;
import android.os.Environment;
import com.whatsapp.util.Log;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.0hc  reason: invalid class name and case insensitive filesystem */
public class C10240hc implements AnonymousClass498, AnonymousClass49Y {
    public int A00;
    public int A01 = 0;
    public int A02 = 0;
    public WifiManager.WifiLock A03;
    public boolean A04 = false;
    public boolean A05 = false;
    public boolean A06 = false;
    public boolean A07 = false;
    public boolean A08 = false;
    public boolean A09 = false;
    public final ConditionVariable A0A = new ConditionVariable(false);
    public final ConditionVariable A0B = new ConditionVariable(false);
    public final ConditionVariable A0C = new ConditionVariable(false);
    public final ConditionVariable A0D = new ConditionVariable(false);
    public final ConditionVariable A0E = new ConditionVariable(false);
    public final ConditionVariable A0F = new ConditionVariable(false);
    public final ConditionVariable A0G = new ConditionVariable(false);
    public final C56972sr A0H;
    public final AnonymousClass5XU A0I;
    public final C29411im A0J;
    public final AnonymousClass0F1 A0K;
    public final C04710Qi A0L = new AnonymousClass0w3(this, 0);
    public final AnonymousClass5PA A0M;
    public final C29441ip A0N;
    public final C620633i A0O;
    public final C56612sH A0P;
    public final C54292oU A0Q;
    public final AnonymousClass33p A0R;
    public final C72303dV A0S;
    public final AnonymousClass31C A0T;
    public final C60152y5 A0U;
    public final C28861ht A0V;
    public final C51072jE A0W;
    public final AnonymousClass4FS A0X;
    public final C183538qC A0Y;
    public final ThreadLocal A0Z = new ThreadLocal();
    public final AtomicBoolean A0a = new AtomicBoolean(false);
    public final AtomicBoolean A0b = new AtomicBoolean(false);
    public final AtomicBoolean A0c = new AtomicBoolean(false);
    public final AtomicBoolean A0d = new AtomicBoolean(false);
    public final AtomicBoolean A0e = new AtomicBoolean(false);
    public final AtomicBoolean A0f = new AtomicBoolean(false);
    public final AtomicBoolean A0g = new AtomicBoolean(false);
    public final AtomicBoolean A0h = new AtomicBoolean(false);
    public final AtomicBoolean A0i = new AtomicBoolean(false);

    public static boolean A04(C10240hc r17, AnonymousClass0Y7 r18, long j, long j2, long j3, long j4) {
        boolean z;
        boolean z2;
        AnonymousClass0Y7 r13 = r18;
        if (r18 != null) {
            C10240hc r11 = r17;
            boolean z3 = r11.A0f.get();
            boolean z4 = r11.A06;
            if (r11.A0J.A0C() || (!r11.A0a.get() && !r11.A0b.get())) {
                z = true;
            } else {
                z = false;
            }
            if (r11.A0a.get() || r11.A0b.get()) {
                z3 = r11.A0e.get();
                z4 = r11.A05;
            } else if (r11.A0c.get()) {
                z3 = r11.A0g.get();
                z4 = r11.A07;
            }
            if (!z3 || !z4 || !r11.A09 || !z) {
                WifiManager.WifiLock wifiLock = r11.A03;
                if (wifiLock == null || !wifiLock.isHeld()) {
                    z2 = false;
                } else {
                    z2 = true;
                    r11.A0S();
                }
                long j5 = j3;
                long j6 = j4;
                long j7 = j;
                long j8 = j2;
                if (!z3) {
                    int A0A2 = r11.A0R.A0A();
                    if (A0A2 == 1) {
                        int i = r11.A01;
                        AnonymousClass0F1 r14 = r11.A0K;
                        if (i == 0) {
                            r14.A0P(j6, j5);
                        } else {
                            r14.A0L(j6, j5);
                        }
                    } else if (A0A2 == 2) {
                        int i2 = r11.A02;
                        AnonymousClass0F1 r142 = r11.A0K;
                        if (i2 == 0) {
                            r142.A0W(j7, j8);
                        } else {
                            r142.A0S(j7, j8);
                        }
                    }
                    C06540Yd.A07(r13, r11.A0M, false);
                }
                if (!z4) {
                    int A0A3 = r11.A0R.A0A();
                    if (A0A3 == 1) {
                        r11.A0K.A0M(j6, j5);
                    } else if (A0A3 == 2) {
                        r11.A0K.A0T(j7, j8);
                    }
                    C06540Yd.A07(r13, r11.A0M, false);
                }
                if (!r11.A09) {
                    int A0A4 = r11.A0R.A0A();
                    if (A0A4 == 1) {
                        boolean equals = "unmounted".equals(Environment.getExternalStorageState());
                        AnonymousClass0F1 r5 = r11.A0K;
                        if (equals) {
                            r5.A0O(j6, j5);
                        } else {
                            r5.A0N(j6, j5);
                        }
                    } else if (A0A4 == 2) {
                        boolean equals2 = "unmounted".equals(Environment.getExternalStorageState());
                        AnonymousClass0F1 r0 = r11.A0K;
                        if (equals2) {
                            r0.A0V(j7, j8);
                        } else {
                            r0.A0U(j7, j8);
                        }
                    }
                }
                if (!z) {
                    C06540Yd.A07(r13, r11.A0M, false);
                }
                if (!r11.A0q() || !r11.A0p() || !r11.A0s() || !r11.A0u()) {
                    String.format("gdrive-service/wait-for-suitable-conditions network-available:%b, battery-available:%b sdcard-available:%b", new Object[]{Boolean.valueOf(z3), Boolean.valueOf(z4), Boolean.valueOf(r11.A09)});
                } else if (z2) {
                    r11.A09();
                }
            }
            C06540Yd.A07(r13, r11.A0M, true);
            return true;
        }
        return false;
    }

    public void A0A() {
        this.A04 = true;
        A0V();
    }

    public void A0B() {
        this.A08 = true;
        A0X(((C29401il) this.A0Y.get()).A08());
        A0O();
    }

    public void A0D() {
        this.A08 = true;
        A0X(((C29401il) this.A0Y.get()).A08());
        A0O();
    }

    public void A0T() {
        this.A04 = false;
    }

    public synchronized void A0W() {
        boolean z;
        AtomicBoolean atomicBoolean;
        AtomicBoolean atomicBoolean2;
        AtomicBoolean atomicBoolean3;
        boolean z2;
        boolean z3;
        boolean z4;
        C626936e.A00();
        C29441ip r4 = this.A0N;
        boolean z5 = true;
        int A082 = r4.A08(true);
        this.A00 = A082;
        Log.d(AnonymousClass000.A0Y("GoogleBackupConditionsManager/can-use-network/active_network ", AnonymousClass001.A0o(), A082));
        int i = this.A00;
        boolean z6 = false;
        if (i != 0) {
            if (i == 1) {
                C50092hc A0A2 = r4.A0A();
                if (A0A2 == null) {
                    Log.i("GoogleBackupConditionsManager/can-use-network/active_network/wifi active network info is null, no connection");
                    this.A0E.close();
                    this.A0F.close();
                    this.A0D.close();
                    atomicBoolean3 = this.A0f;
                    boolean andSet = atomicBoolean3.getAndSet(false);
                    atomicBoolean = this.A0g;
                    z = andSet | atomicBoolean.getAndSet(false);
                    atomicBoolean2 = this.A0e;
                    z2 = atomicBoolean2.getAndSet(false);
                } else if (!A0A2.A00() || !C29441ip.A01()) {
                    Log.i("GoogleBackupConditionsManager/can-use-network/active_network/wifi");
                    this.A0E.open();
                    this.A0F.open();
                    this.A0D.open();
                    atomicBoolean3 = this.A0f;
                    boolean A1T = AnonymousClass000.A1T(atomicBoolean3.getAndSet(true) ? 1 : 0);
                    atomicBoolean = this.A0g;
                    if (!atomicBoolean.getAndSet(true)) {
                        z6 = true;
                    }
                    z = A1T | z6;
                    atomicBoolean2 = this.A0e;
                    z3 = atomicBoolean2.getAndSet(true);
                } else {
                    Log.i("GoogleBackupConditionsManager/can-use-network/active_network/wifi/captive");
                    this.A0E.close();
                    this.A0F.close();
                    this.A0D.close();
                    atomicBoolean3 = this.A0f;
                    boolean andSet2 = atomicBoolean3.getAndSet(false);
                    atomicBoolean = this.A0g;
                    z = andSet2 | atomicBoolean.getAndSet(false);
                    atomicBoolean2 = this.A0e;
                    z2 = atomicBoolean2.getAndSet(false);
                }
            } else if (i == 2) {
                Log.i("GoogleBackupConditionsManager/can-use-network/active_network/cellular");
                this.A0E.open();
                atomicBoolean3 = this.A0f;
                boolean A1T2 = AnonymousClass000.A1T(atomicBoolean3.getAndSet(true) ? 1 : 0);
                if (this.A04 || this.A01 == 1) {
                    this.A0D.open();
                    atomicBoolean2 = this.A0e;
                    z4 = !atomicBoolean2.getAndSet(true);
                } else {
                    this.A0D.close();
                    atomicBoolean2 = this.A0e;
                    z4 = atomicBoolean2.getAndSet(false);
                }
                z = A1T2 | z4;
                if (this.A02 == 1) {
                    this.A0F.open();
                    atomicBoolean = this.A0g;
                    z3 = atomicBoolean.getAndSet(true);
                } else {
                    this.A0F.close();
                    atomicBoolean = this.A0g;
                    z2 = atomicBoolean.getAndSet(false);
                }
            } else if (i == 3) {
                Log.i("GoogleBackupConditionsManager/can-use-network/active_network/roaming");
                this.A0E.open();
                this.A0F.close();
                this.A0D.close();
                atomicBoolean3 = this.A0f;
                if (atomicBoolean3.getAndSet(true)) {
                    z5 = false;
                }
                atomicBoolean = this.A0g;
                z = atomicBoolean.getAndSet(false) | z5;
                atomicBoolean2 = this.A0e;
                z2 = atomicBoolean2.getAndSet(false);
            }
            z2 = true ^ z3;
        } else {
            Log.i("GoogleBackupConditionsManager/can-use-network/active_network/none");
            this.A0E.close();
            this.A0F.close();
            this.A0D.close();
            atomicBoolean3 = this.A0f;
            boolean andSet3 = atomicBoolean3.getAndSet(false);
            atomicBoolean = this.A0g;
            z = andSet3 | atomicBoolean.getAndSet(false);
            atomicBoolean2 = this.A0e;
            z2 = atomicBoolean2.getAndSet(false);
        }
        if (z || z2) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A03("restore>GoogleBackupConditionsManager/can-use-network/message-restore/", A0o, atomicBoolean3);
            Log.i(A0o.toString());
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A03("restore>GoogleBackupConditionsManager/can-use-network/media-restore/", A0o2, atomicBoolean);
            Log.i(A0o2.toString());
            StringBuilder A0o3 = AnonymousClass001.A0o();
            A03("GoogleBackupConditionsManager/can-use-network/backup/", A0o3, atomicBoolean2);
            Log.i(A0o3.toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x007d, code lost:
        if (r1.A0X() == null) goto L_0x0071;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0n() {
        /*
            r4 = this;
            r3 = 0
            X.2sr r0 = r4.A0H
            boolean r0 = r0.A0Y()
            if (r0 != 0) goto L_0x001a
            X.2oU r0 = r4.A0Q
            android.content.Context r0 = r0.A06()
            boolean r0 = X.AnonymousClass0YV.A0F(r0)
            if (r0 != 0) goto L_0x001b
            java.lang.String r0 = "GoogleBackupConditionsManager/should-start/false/gdrive-access-not-allowed"
        L_0x0017:
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x001a:
            return r3
        L_0x001b:
            X.2jE r0 = r4.A0W
            boolean r0 = r0.A02()
            if (r0 != 0) goto L_0x0026
            java.lang.String r0 = "GoogleBackupConditionsManager/should-start/false/reg-not-verified"
            goto L_0x0017
        L_0x0026:
            X.1ht r0 = r4.A0V
            boolean r0 = r0.A09()
            if (r0 == 0) goto L_0x0031
            java.lang.String r0 = "GoogleBackupConditionsManager/should-start/false/login-failed"
            goto L_0x0017
        L_0x0031:
            X.5XU r1 = r4.A0I
            boolean r0 = r1.A03()
            if (r0 == 0) goto L_0x003c
            java.lang.String r0 = "GoogleBackupConditionsManager/should-start/false/clock-wrong"
            goto L_0x0017
        L_0x003c:
            boolean r0 = r1.A02()
            if (r0 == 0) goto L_0x0045
            java.lang.String r0 = "GoogleBackupConditionsManager/should-start/false/software-expired"
            goto L_0x0017
        L_0x0045:
            X.3dV r0 = r4.A0S
            boolean r0 = r0.A09()
            if (r0 != 0) goto L_0x0050
            java.lang.String r0 = "GoogleBackupConditionsManager/should-start/false/message-count-low"
            goto L_0x0017
        L_0x0050:
            X.33p r1 = r4.A0R
            int r2 = r1.A05()
            r0 = 1
            if (r2 == 0) goto L_0x0071
            if (r2 == r0) goto L_0x0079
            r0 = 2
            if (r2 == r0) goto L_0x0079
            r0 = 3
            if (r2 == r0) goto L_0x0079
            r0 = 4
            if (r2 == r0) goto L_0x0079
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "GoogleBackupConditionsManager/should-start/unexpected-backup-freq/"
            java.lang.String r0 = X.AnonymousClass000.A0Y(r0, r1, r2)
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0071:
            boolean r0 = r4.A0t()
            if (r0 == 0) goto L_0x001a
            r3 = 1
            return r3
        L_0x0079:
            java.lang.String r0 = r1.A0X()
            if (r0 != 0) goto L_0x001a
            goto L_0x0071
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10240hc.A0n():boolean");
    }

    public final boolean A0t() {
        try {
            long A0M2 = this.A0R.A0M();
            long currentTimeMillis = System.currentTimeMillis();
            Locale locale = Locale.ENGLISH;
            Object[] objArr = new Object[3];
            objArr[0] = Long.valueOf(A0M2);
            AnonymousClass000.A1Q(objArr, 1, currentTimeMillis);
            long j = currentTimeMillis - A0M2;
            objArr[2] = Long.valueOf(j);
            String.format(locale, "saved time: %d, current time: %d, difference: %d", objArr);
            if (A0M2 >= 0) {
                if (j <= 0) {
                    return false;
                }
                Log.i("GoogleBackupConditionsManager/sufficient-time-passed-since-last-user-prompt/true");
            }
            return true;
        } catch (NumberFormatException e) {
            Log.e("GoogleBackupConditionsManager/sufficient-time-passed-since-last-user-prompt/", e);
            return true;
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void A00() {
        if (!AnonymousClass0YV.A0F(this.A0Q.A06())) {
            return;
        }
        if (this.A0a.get() || this.A0d.get() || this.A0c.get() || this.A0b.get()) {
            A0W();
        } else {
            A0N();
        }
    }

    public int A05() {
        int A012 = AnonymousClass34G.A01(this.A0O, this.A0U);
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("GoogleBackupConditionsManager/calc-max-concurrent-reads/network_type=");
        A0o.append(this.A00);
        Log.i(AnonymousClass000.A0Y(", year class = ", A0o, A012));
        if (this.A00 != 1 || A012 < 2011) {
            return Math.min(4, 2);
        }
        return 4;
    }

    public int A06() {
        return this.A00;
    }

    public int A07() {
        return this.A01;
    }

    public int A08() {
        return this.A02;
    }

    public void A09() {
        if (this.A03 == null) {
            WifiManager A0I2 = this.A0O.A0I();
            if (A0I2 == null) {
                Log.w("GoogleBackupConditionsManager/create-wifi-lock wm=null");
            } else {
                WifiManager.WifiLock createWifiLock = A0I2.createWifiLock(1, "backup-lock");
                this.A03 = createWifiLock;
                createWifiLock.setReferenceCounted(false);
            }
        }
        WifiManager.WifiLock wifiLock = this.A03;
        if (wifiLock != null && !wifiLock.isHeld()) {
            this.A03.acquire();
        }
    }

    public void A0C() {
        this.A0R.A0x();
        A0Q();
        A0V();
    }

    public void A0E() {
        this.A0A.open();
    }

    public void A0F() {
        this.A0B.open();
    }

    public void A0G() {
        this.A0C.open();
    }

    public void A0H() {
        this.A0D.open();
    }

    public void A0I() {
        this.A0E.open();
    }

    public void A0J() {
        this.A0F.open();
    }

    public void A0K() {
        this.A0G.open();
    }

    public void A0L() {
        this.A0i.set(false);
    }

    public void A0M() {
        Context A062 = this.A0Q.A06();
        Intent A0t = C627736r.A0t(A062, "action_backup");
        A0t.putExtra("only_if_pending", true);
        AnonymousClass29R.A00(A062, A0t);
    }

    public void A0N() {
        String str;
        Boolean bool = Boolean.TRUE;
        ThreadLocal threadLocal = this.A0Z;
        if (bool != threadLocal.get()) {
            threadLocal.set(bool);
            try {
                C626936e.A00();
                AnonymousClass33p r6 = this.A0R;
                if (C06540Yd.A0K(r6)) {
                    AtomicBoolean atomicBoolean = this.A0c;
                    if (!atomicBoolean.get()) {
                        A0R();
                        A0Q();
                        A0W();
                        AtomicBoolean atomicBoolean2 = this.A0g;
                        if (!atomicBoolean2.get() || !this.A07 || !this.A09) {
                            StringBuilder A0o = AnonymousClass001.A0o();
                            A0o.append("restore>GoogleBackupConditionsManager/trigger-nothing media-restore-pending: ");
                            A0o.append(C06540Yd.A0K(r6));
                            A03(" media-restore-running: ", A0o, atomicBoolean);
                            A03(" network_available_for_media_restore: ", A0o, atomicBoolean2);
                            A0o.append(" battery_available_for_media_restore: ");
                            A0o.append(this.A07);
                            A0o.append(" sdcard_available: ");
                            A0o.append(this.A09);
                            str = A0o.toString();
                            Log.i(str);
                        }
                        Log.i("restore>GoogleBackupConditionsManager/trigger-pending-media-restore");
                        A0P();
                    }
                }
                if (C06540Yd.A0J(r6)) {
                    AtomicBoolean atomicBoolean3 = this.A0a;
                    if (!atomicBoolean3.get()) {
                        A0R();
                        A0Q();
                        A0W();
                        AtomicBoolean atomicBoolean4 = this.A0e;
                        if (!atomicBoolean4.get() || !this.A05 || !this.A09) {
                            StringBuilder A0o2 = AnonymousClass001.A0o();
                            A0o2.append("GoogleBackupConditionsManager/trigger-nothing is-backup-pending: ");
                            A0o2.append(C06540Yd.A0J(r6));
                            A03(" is-backup-running: ", A0o2, atomicBoolean3);
                            A03(" network_available_for_backup: ", A0o2, atomicBoolean4);
                            A0o2.append(" battery_available_for_backup: ");
                            A0o2.append(this.A05);
                            A0o2.append(" sdcard_available: ");
                            A0o2.append(this.A09);
                            str = A0o2.toString();
                        } else {
                            A0M();
                            str = "GoogleBackupConditionsManager/trigger-pending-backup";
                        }
                        Log.i(str);
                    }
                }
                if (this.A0h.get() || this.A0i.get()) {
                    Log.i("GoogleBackupConditionsManager/service-running/recalculate-network-and-sdcard");
                    A0R();
                    A0Q();
                    A0W();
                }
                str = "GoogleBackupConditionsManager/trigger-nothing/nothing-pending";
                Log.i(str);
            } finally {
                threadLocal.set(Boolean.FALSE);
            }
        }
    }

    public void A0O() {
        this.A0X.BkM(new C11460jg(this));
    }

    public void A0P() {
        Context A062 = this.A0Q.A06();
        AnonymousClass29R.A00(A062, C627736r.A0t(A062, "action_restore_media"));
    }

    public void A0Q() {
        String str;
        try {
            AnonymousClass33p r1 = this.A0R;
            this.A01 = r1.A06();
            this.A02 = r1.A08();
            int i = this.A01;
            String str2 = "unknown";
            if (i != 0) {
                str = "Wi-Fi or cellular";
                if (i != 1) {
                    str = str2;
                }
            } else {
                str = "Wi-Fi only";
            }
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("GoogleBackupConditionsManager/init-network network setting for backup is ");
            A0o.append(i);
            Log.d(AnonymousClass000.A0U(" (", str, ")", A0o));
            int i2 = this.A02;
            if (i2 == 0) {
                str2 = "Wi-Fi only";
            } else if (i2 == 1) {
                str2 = "Wi-Fi or cellular";
            }
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append("GoogleBackupConditionsManager/init-network network setting for media restore is ");
            A0o2.append(this.A01);
            Log.d(AnonymousClass000.A0U(" (", str2, ")", A0o2));
        } catch (NumberFormatException e) {
            Log.e((Throwable) e);
        }
    }

    public void A0S() {
        WifiManager.WifiLock wifiLock = this.A03;
        if (wifiLock != null && wifiLock.isHeld()) {
            this.A03.release();
        }
    }

    public void A0U() {
        this.A0i.set(true);
        A0R();
        A0Q();
        A0W();
    }

    public final void A0V() {
        this.A0X.BkM(new C11430jd(this));
    }

    public void A0Z(boolean z) {
        this.A0h.set(z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
        if (r2.A02() != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0a(boolean r4) {
        /*
            r3 = this;
            X.8qC r0 = r3.A0Y
            java.lang.Object r0 = r0.get()
            X.1il r0 = (X.C29401il) r0
            X.30O r2 = r0.A08()
            if (r4 == 0) goto L_0x0015
            boolean r1 = r2.A02()
            r0 = 1
            if (r1 == 0) goto L_0x0016
        L_0x0015:
            r0 = 0
        L_0x0016:
            r3.A08 = r0
            r3.A0X(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10240hc.A0a(boolean):void");
    }

    public boolean A0b() {
        return this.A0a.get();
    }

    public boolean A0c() {
        return this.A05;
    }

    public boolean A0d() {
        return this.A07;
    }

    public boolean A0e() {
        return this.A04;
    }

    public boolean A0f() {
        return this.A0b.get();
    }

    public boolean A0g() {
        return this.A0c.get();
    }

    public boolean A0h() {
        return this.A0d.get();
    }

    public boolean A0i() {
        return this.A0e.get();
    }

    public boolean A0j() {
        return this.A0f.get();
    }

    public boolean A0k() {
        return this.A0g.get();
    }

    public boolean A0l() {
        return this.A09;
    }

    public boolean A0m() {
        return this.A0J.A0C();
    }

    public boolean A0p() {
        String str;
        if (this.A0a.get() || this.A0b.get()) {
            if (this.A0A.block(86400000)) {
                return true;
            }
            str = "GoogleBackupConditionsManager/battery-wait/backup 86400000 milliseconds, giving up now.";
        } else if (!this.A0c.get() || this.A0C.block(86400000)) {
            return true;
        } else {
            str = "restore>GoogleBackupConditionsManager/battery-wait/media-restore 86400000 milliseconds, giving up now.";
        }
        Log.e(str);
        return false;
    }

    public boolean A0q() {
        String str;
        if (this.A0a.get() || this.A0b.get()) {
            if (this.A0D.block(1800000)) {
                return true;
            }
            str = "GoogleBackupConditionsManager/network-wait/backup 1800000 milliseconds, giving up now.";
        } else if (this.A0c.get()) {
            if (this.A0F.block(1800000)) {
                return true;
            }
            Log.e("restore>GoogleBackupConditionsManager/network-wait/media-restore 1800000 milliseconds, giving up now.");
            return true;
        } else if (this.A0E.block(1800000)) {
            return true;
        } else {
            str = "restore>GoogleBackupConditionsManager/network-wait/message-restore 1800000 milliseconds, giving up now.";
        }
        Log.e(str);
        return false;
    }

    public final boolean A0u() {
        if (!this.A0a.get() && !this.A0b.get()) {
            return true;
        }
        try {
            this.A0T.A08(86400000);
            return true;
        } catch (C376223j unused) {
            return false;
        }
    }

    public boolean A0w(boolean z) {
        return this.A0a.getAndSet(z);
    }

    public boolean A0x(boolean z) {
        return this.A0b.getAndSet(z);
    }

    public boolean A0y(boolean z) {
        return this.A0c.getAndSet(z);
    }

    public boolean A0z(boolean z) {
        return this.A0d.getAndSet(z);
    }

    public void BPq(C59622xD r3) {
        this.A0X.BkM(new C11440je(this));
    }

    public static /* synthetic */ void A01(C10240hc r0) {
        r0.A0W();
        r0.A0N();
    }

    public static void A03(String str, StringBuilder sb, AtomicBoolean atomicBoolean) {
        sb.append(str);
        sb.append(atomicBoolean.get());
    }

    public void A0R() {
        A0Y(Environment.getExternalStorageState());
    }

    public void A0X(AnonymousClass30O r7) {
        int i;
        double A002 = r7.A00();
        boolean z = false;
        if (!Double.isNaN(A002)) {
            i = (int) A002;
        } else {
            i = 0;
        }
        this.A0B.open();
        boolean z2 = true;
        this.A06 = true;
        if (this.A08 || r7.A02()) {
            this.A0A.open();
            this.A0C.open();
            if (!this.A05 || !this.A07) {
                z = true;
            }
            this.A05 = true;
            this.A07 = true;
            z2 = z;
        } else {
            this.A0A.close();
            this.A0C.close();
            if (!this.A05 && !this.A07) {
                z2 = false;
            }
            this.A05 = false;
            this.A07 = false;
        }
        if (z2) {
            Log.i(AnonymousClass000.A0Y("GoogleBackupConditionsManager/can-use-battery/battery-level/", AnonymousClass001.A0o(), i));
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("GoogleBackupConditionsManager/can-use-battery-for-backup/");
            A0o.append(this.A05);
            Log.i(A0o.toString());
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append("restore>GoogleBackupConditionsManager/can-use-battery-for-media-restore/");
            A0o2.append(this.A07);
            Log.i(A0o2.toString());
            StringBuilder A0o3 = AnonymousClass001.A0o();
            A0o3.append("GoogleBackupConditionsManager/ignore-battery-status/");
            A0o3.append(this.A08);
            Log.i(A0o3.toString());
        }
    }

    public void A0Y(String str) {
        C626936e.A00();
        boolean equals = "mounted".equals(str);
        ConditionVariable conditionVariable = this.A0G;
        if (equals) {
            conditionVariable.open();
            if (!this.A09) {
                this.A09 = true;
                if (AnonymousClass0YV.A0F(this.A0Q.A06())) {
                    A0N();
                    return;
                }
                return;
            }
            return;
        }
        conditionVariable.close();
        Log.d("GoogleBackupConditionsManager/can-use-sdcard/not-mounted");
        this.A09 = false;
    }

    @Deprecated
    public boolean A0o() {
        return A0n();
    }

    public boolean A0r() {
        return A0s();
    }

    public boolean A0s() {
        if (this.A0G.block(86400000)) {
            return true;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("GoogleBackupConditionsManager/sdcard-wait ");
        A0o.append(86400000);
        Log.e(AnonymousClass000.A0X(" milliseconds, giving up now.", A0o));
        return false;
    }

    public boolean A0v(int i) {
        C626936e.A00();
        if (i == 0 || i == 1) {
            this.A01 = i;
            A0W();
            this.A0R.A14(i);
            return true;
        }
        Log.e(AnonymousClass000.A0Y("GoogleBackupConditionsManager/set-backup-network-setting/incorrect-value/", AnonymousClass001.A0o(), i));
        return false;
    }

    public void BNW(AnonymousClass30O r1) {
        A0X(r1);
    }

    public C10240hc(C56972sr r3, AnonymousClass5XU r4, C29411im r5, AnonymousClass0F1 r6, AnonymousClass5PA r7, C29441ip r8, C620633i r9, C56612sH r10, C54292oU r11, AnonymousClass33p r12, C72303dV r13, AnonymousClass31C r14, C60152y5 r15, C28861ht r16, C51072jE r17, AnonymousClass4FS r18, C183538qC r19) {
        this.A0Q = r11;
        this.A0P = r10;
        this.A0H = r3;
        this.A0X = r18;
        this.A0I = r4;
        this.A0V = r16;
        this.A0T = r14;
        this.A0M = r7;
        this.A0O = r9;
        this.A0J = r5;
        this.A0S = r13;
        this.A0R = r12;
        this.A0Y = r19;
        this.A0W = r17;
        this.A0U = r15;
        this.A0N = r8;
        this.A0K = r6;
    }
}
