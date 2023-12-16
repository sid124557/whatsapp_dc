package X;

import android.database.sqlite.SQLiteFullException;
import android.os.SystemClock;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.util.Log;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: X.30i  reason: invalid class name */
public class AnonymousClass30i {
    public static final AnonymousClass8OQ A0K;
    public static final String[] A0L = new String[0];
    public final C55682qk A00;
    public final C56972sr A01;
    public final C153167am A02;
    public final C50072ha A03;
    public final C58872vx A04;
    public final AnonymousClass2FT A05;
    public final C64663Ek A06;
    public final C613730l A07;
    public final AnonymousClass339 A08;
    public final C56792sZ A09;
    public final C55392qH A0A;
    public final C55262q4 A0B;
    public final C56612sH A0C;
    public final AnonymousClass34c A0D;
    public final AnonymousClass1RE A0E;
    public final C29041iB A0F;
    public final C56272ri A0G;
    public final C623934v A0H;
    public final AnonymousClass1VX A0I;
    public final C60902zM A0J;

    static {
        C160667o6 r2 = new C160667o6();
        AnonymousClass0x2.A11(r2, 400, 64);
        AnonymousClass0x2.A11(r2, 404, 65);
        AnonymousClass0x2.A11(r2, 405, 66);
        AnonymousClass0x2.A11(r2, 406, 67);
        A0K = r2.build();
    }

    public final void A00() {
        this.A0J.A02();
        AnonymousClass2FT r1 = this.A05;
        Log.i("sync-manager/onFailed");
        C65203Gp r12 = r1.A00;
        C65203Gp.A01(r12, false);
        if (r12.A0P()) {
            r12.A09.A08();
        }
    }

    public final void A02(C23351Sg r5, String str, int i) {
        this.A00.A0A("malformed_syncd_mutation", false, r5.getMessage());
        this.A06.A01.A06("invalid_action_counter", 1);
        throw C23341Sf.A00(str, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0057, code lost:
        if (r10 != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A04(java.lang.Long r8, boolean r9, boolean r10) {
        /*
            r7 = this;
            if (r9 == 0) goto L_0x0057
            X.30l r6 = r7.A07
            android.content.SharedPreferences r0 = r6.A02()
            java.lang.String r5 = "first_transient_server_failure_timestamp"
            r3 = 0
            long r1 = r0.getLong(r5, r3)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0043
            long r1 = java.lang.System.currentTimeMillis()
            android.content.SharedPreferences r0 = r6.A02()
            X.C18270x1.A0o(r0, r5, r1)
        L_0x001f:
            if (r8 == 0) goto L_0x007a
            X.2FT r2 = r7.A05
            long r3 = r8.longValue()
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "sync-manager/onRetryNeeded "
            X.C18260x0.A12(r0, r1, r3)
            X.3Gp r6 = r2.A00
            r0 = 0
            X.C65203Gp.A01(r6, r0)
            boolean r0 = r6.A0P()
            if (r0 == 0) goto L_0x005a
            X.1i6 r0 = r6.A09
            r0.A08()
            return
        L_0x0043:
            long r3 = X.AnonymousClass0x9.A05(r1)
            r1 = 604800000(0x240c8400, double:2.988109026E-315)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x001f
            java.lang.Integer r1 = X.AnonymousClass001.A0f()
            r0 = 0
            r7.A03(r1, r0)
            return
        L_0x0057:
            if (r10 == 0) goto L_0x007a
            goto L_0x001f
        L_0x005a:
            monitor-enter(r6)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0077 }
            java.lang.String r0 = "sync-manager/scheduleSync with delay "
            X.C18260x0.A12(r0, r1, r3)     // Catch:{ all -> 0x0077 }
            X.4FS r5 = r6.A0h     // Catch:{ all -> 0x0077 }
            java.lang.String r2 = "SyncManager/scheduleSync"
            r1 = 0
            X.1sf r0 = new X.1sf     // Catch:{ all -> 0x0077 }
            r0.<init>(r6, r1)     // Catch:{ all -> 0x0077 }
            java.lang.Runnable r0 = r5.Bkn(r0, r2, r3)     // Catch:{ all -> 0x0077 }
            r6.A03 = r0     // Catch:{ all -> 0x0077 }
            monitor-exit(r6)     // Catch:{ all -> 0x0077 }
            return
        L_0x0077:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0077 }
            throw r0
        L_0x007a:
            r7.A00()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass30i.A04(java.lang.Long, boolean, boolean):void");
    }

    public void A05(Throwable th) {
        boolean z;
        boolean z2;
        Long A012;
        if (th instanceof C23341Sf) {
            C23341Sf r5 = (C23341Sf) th;
            A03(Integer.valueOf(r5.errorCode), r5.collectionName);
        } else if (th instanceof C23321Sd) {
            A00();
        } else {
            if (th instanceof C23331Se) {
                z = ((C23331Se) th).isServerTransient;
                z2 = !z;
                A012 = this.A0J.A01();
            } else {
                boolean z3 = th instanceof SQLiteFullException;
                z = false;
                z2 = true;
                A012 = this.A0J.A01();
                if (!z3) {
                    A04(A012, true, false);
                    return;
                }
            }
            A04(A012, z, z2);
        }
    }

    public AnonymousClass30i(C55682qk r2, C56972sr r3, C153167am r4, C50072ha r5, C58872vx r6, AnonymousClass2FT r7, C64663Ek r8, C613730l r9, AnonymousClass339 r10, C56792sZ r11, C55392qH r12, C55262q4 r13, C56612sH r14, AnonymousClass34c r15, AnonymousClass1RE r16, C29041iB r17, C56272ri r18, C623934v r19, AnonymousClass1VX r20, C60902zM r21) {
        this.A0C = r14;
        this.A0I = r20;
        this.A00 = r2;
        this.A01 = r3;
        this.A0E = r16;
        this.A09 = r11;
        this.A0A = r12;
        this.A06 = r8;
        this.A02 = r4;
        this.A0H = r19;
        this.A08 = r10;
        this.A0G = r18;
        this.A0F = r17;
        this.A0D = r15;
        this.A07 = r9;
        this.A03 = r5;
        this.A04 = r6;
        this.A0B = r13;
        this.A0J = r21;
        this.A05 = r7;
    }

    public final void A01(C23351Sg r5, String str) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("SyncResponseHandler/handleMutationException failed with MutationException, reason ");
        A0o.append(r5.reason);
        C18280x3.A1C(A0o, r5);
        int i = r5.reason;
        if (i == 0) {
            A02(r5, str, 19);
            throw AnonymousClass000.A0L();
        } else if (i == 1) {
            A02(r5, str, 21);
            throw AnonymousClass000.A0L();
        } else if (i == 2) {
            A02(r5, str, 23);
            throw AnonymousClass000.A0L();
        } else if (i == 3) {
            A02(r5, str, 24);
            throw AnonymousClass000.A0L();
        } else if (i == 4) {
            A02(r5, str, 22);
            throw AnonymousClass000.A0L();
        } else if (i == 6) {
            this.A06.A01.A06("unsupported_action_counter", 1);
        } else if (i == 7) {
            A02(r5, str, 25);
            throw AnonymousClass000.A0L();
        } else {
            throw AnonymousClass002.A0E(AnonymousClass000.A0Y("Unhandled MutationException with reason: ", AnonymousClass001.A0o(), i));
        }
    }

    public void A03(Integer num, String str) {
        String str2;
        String str3;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("SyncResponseHandler/fatalFailure reason:");
        Integer num2 = num;
        C18260x0.A1K(A0o, C18270x1.A0T(num2));
        C55682qk r3 = this.A00;
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("errorCode:");
        A0o2.append(num2);
        String str4 = str;
        r3.A0A("app-sate-sync-handle-fatal-exception", false, AnonymousClass000.A0V("; collectionName:", str4, A0o2));
        if (num != null) {
            C64663Ek r32 = this.A06;
            int intValue = num2.intValue();
            AnonymousClass1YP r1 = new AnonymousClass1YP();
            r1.A02 = Integer.valueOf(intValue);
            r1.A01 = C64663Ek.A03(str4);
            r1.A00 = true;
            C64663Ek.A05(r32, r1);
        }
        this.A0J.A02();
        C18270x1.A0g(C613730l.A00(this.A07), "first_transient_server_failure_timestamp");
        AnonymousClass2FT r2 = this.A05;
        C18260x0.A0s("sync-manager/onFatalFailure for collection ", str4, AnonymousClass001.A0o());
        C65203Gp r22 = r2.A00;
        r22.A09.A08();
        C65203Gp.A01(r22, false);
        Iterator A032 = C61102zi.A03(r22.A0K);
        while (A032.hasNext()) {
            A032.next();
        }
        synchronized (r22) {
            r22.A02 = null;
        }
        if (!C56972sr.A0C(r22)) {
            r22.A0H(1);
            return;
        }
        C43502Sj r4 = r22.A0C;
        C56972sr r23 = r4.A00;
        C626936e.A0E(r23.A0Y(), "method should only be called by a device in companion mode");
        C55262q4 r5 = r4.A03;
        C18270x1.A0l(C55262q4.A00(r5), "companion_syncd_dirty", true);
        PhoneUserJid A042 = C56972sr.A04(r23);
        if (A042 == null) {
            str3 = "CompanionSyncdFatalHandler/my user jid is null.";
        } else {
            try {
                DeviceJid A012 = DeviceJid.Companion.A01(A042, 0);
                AnonymousClass2z0 A043 = r4.A06.A04(A042, true);
                C56612sH r0 = r4.A04;
                C30861nK r9 = new C30861nK(A043, Collections.singleton(str4), r0.A0H(), r0.A0H());
                r9.A00 = A012;
                if (r4.A05.A00(r9) < 0) {
                    str3 = "CompanionSyncdFatalHandler/failed to add peer message";
                } else {
                    C49712gy.A00(r4.A01, A012, r9);
                    SystemClock.sleep(5000);
                    int A022 = C18280x3.A02(r5.A01(), "companion_syncd_critical_bootstrap_state");
                    boolean z = true;
                    if (!(A022 == 1 || A022 == 2)) {
                        z = false;
                    }
                    C47872dy r12 = r4.A02;
                    if (z) {
                        str2 = "syncd_error_during_bootstrap";
                    } else {
                        str2 = "syncd_failure";
                    }
                    r12.A01(str2, true, true);
                    return;
                }
            } catch (AnonymousClass24P unused) {
                Log.e("CompanionSyncdFatalHandler/cannot get primary device jid.");
                return;
            }
        }
        Log.e(str3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0077, code lost:
        if (r8 != 0) goto L_0x0079;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A06(java.util.List r30) {
        /*
            r29 = this;
            java.util.Iterator r14 = r30.iterator()
        L_0x0004:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x0270
            java.lang.Object r6 = r14.next()
            X.2Ph r6 = (X.C42732Ph) r6
            java.lang.String r5 = r6.A01
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "SyncResponseHandler/handleIncomingPatches for collection="
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = "; size="
            r1.append(r0)
            java.util.List r3 = r6.A02
            int r0 = r3.size()
            r1.append(r0)
            java.lang.String r0 = "; hasMorePatch="
            r1.append(r0)
            boolean r7 = r6.A03
            X.C18260x0.A1V(r1, r7)
            r15 = r29
            X.2sr r10 = r15.A01
            boolean r0 = r10.A0Y()
            r4 = 0
            if (r0 == 0) goto L_0x005c
            X.2ri r0 = r15.A0G
            java.lang.Long r2 = r0.A00(r5)
            X.2q4 r0 = r15.A0B
            android.content.SharedPreferences r1 = r0.A01()
            java.lang.String r0 = "companion_syncd_critical_bootstrap_state"
            int r1 = r1.getInt(r0, r4)
            r0 = 1
            if (r1 == r0) goto L_0x020f
            r0 = 2
            if (r1 == r0) goto L_0x020f
            if (r2 != 0) goto L_0x005c
        L_0x005b:
            r4 = 1
        L_0x005c:
            X.1DW r2 = r6.A00
            java.lang.String r6 = " with version: "
            if (r2 == 0) goto L_0x014d
            X.2ri r0 = r15.A0G
            java.lang.Long r0 = r0.A00(r5)
            r11 = 0
            if (r0 != 0) goto L_0x0142
            r8 = 0
        L_0x006e:
            boolean r0 = r10.A0Y()
            if (r0 == 0) goto L_0x0079
            int r0 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            r1 = 1
            if (r0 == 0) goto L_0x007a
        L_0x0079:
            r1 = 0
        L_0x007a:
            java.lang.String r0 = "Only companion devices that are undergoing bootstrap should receive and handle snapshots."
            X.C626936e.A0E(r1, r0)
            X.2sH r0 = r15.A0C
            long r20 = r0.A0H()
            X.2vx r0 = r15.A04     // Catch:{ Exception -> 0x025c }
            X.1ft r10 = new X.1ft     // Catch:{ Exception -> 0x025c }
            r10.<init>(r0, r2, r5)     // Catch:{ Exception -> 0x025c }
            r0 = 1
            X.C58872vx.A00(r10, r5, r0)     // Catch:{ Exception -> 0x025c }
            java.io.File r9 = r10.A00     // Catch:{ 6u5 -> 0x022b, IOException -> 0x021d }
            byte[] r1 = X.C382926u.A00(r9)     // Catch:{ 6u5 -> 0x022b, IOException -> 0x021d }
            X.1Cr r0 = X.C21661Cr.DEFAULT_INSTANCE     // Catch:{ 6u5 -> 0x022b, IOException -> 0x021d }
            X.6cX r8 = X.C130786cX.A05(r0, r1)     // Catch:{ 6u5 -> 0x022b, IOException -> 0x021d }
            X.1Cr r8 = (X.C21661Cr) r8     // Catch:{ 6u5 -> 0x022b, IOException -> 0x021d }
            java.io.File r0 = r10.A01     // Catch:{ 6u5 -> 0x022b, IOException -> 0x021d }
            boolean r0 = r0.delete()     // Catch:{ 6u5 -> 0x022b, IOException -> 0x021d }
            if (r0 == 0) goto L_0x00a9
            r9.delete()     // Catch:{ 6u5 -> 0x022b, IOException -> 0x021d }
        L_0x00a9:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ 6u5 -> 0x022b, IOException -> 0x021d }
            java.lang.String r0 = "external-mutations-downloader: downloaded snapshot= "
            X.C18260x0.A1R(r1, r0, r8)     // Catch:{ 6u5 -> 0x022b, IOException -> 0x021d }
            if (r4 == 0) goto L_0x00c3
            X.2ha r0 = r15.A03     // Catch:{ Exception -> 0x025c }
            r22 = 1
            r18 = 0
            r17 = r2
            r19 = r5
            r16 = r0
            r16.A01(r17, r18, r19, r20, r22)     // Catch:{ Exception -> 0x025c }
        L_0x00c3:
            int r0 = r8.bitField0_
            r0 = r0 & 1
            if (r0 == 0) goto L_0x0148
            X.1Ab r0 = r8.version_
            r1 = r0
            if (r0 != 0) goto L_0x00d0
            X.1Ab r0 = X.C20981Ab.DEFAULT_INSTANCE
        L_0x00d0:
            int r0 = r0.bitField0_
            r0 = r0 & 1
            if (r0 == 0) goto L_0x0148
            if (r1 != 0) goto L_0x00da
            X.1Ab r1 = X.C20981Ab.DEFAULT_INSTANCE
        L_0x00da:
            long r0 = r1.version_
            java.lang.StringBuilder r9 = X.AnonymousClass001.A0o()
            java.lang.String r2 = "SyncResponseHandler/handleIncomingPatches applying snapshot for collection "
            r9.append(r2)
            r9.append(r5)
            X.C18260x0.A12(r6, r9, r0)
            java.util.ArrayList r10 = X.AnonymousClass001.A0s()
            X.8ya r2 = r8.records_
            java.util.Iterator r13 = r2.iterator()
        L_0x00f5:
            boolean r2 = r13.hasNext()
            if (r2 == 0) goto L_0x012e
            java.lang.Object r12 = r13.next()
            X.1CK r12 = (X.AnonymousClass1CK) r12
            X.1Bb r2 = X.C21241Bb.DEFAULT_INSTANCE
            X.6c9 r11 = r2.A0G()
            X.22c r2 = X.AnonymousClass22c.SET
            X.6cX r9 = X.C18320x8.A0C(r11)
            X.1Bb r9 = (X.C21241Bb) r9
            int r2 = r2.value
            r9.operation_ = r2
            int r2 = r9.bitField0_
            r2 = r2 | 1
            r9.bitField0_ = r2
            X.6cX r9 = X.C18320x8.A0C(r11)
            X.1Bb r9 = (X.C21241Bb) r9
            r12.getClass()
            r9.record_ = r12
            int r2 = r9.bitField0_
            r2 = r2 | 2
            r9.bitField0_ = r2
            X.C18320x8.A1B(r11, r10)
            goto L_0x00f5
        L_0x012e:
            r16 = 0
            r20 = r0
            r22 = r4
            r18 = r5
            r19 = r10
            r17 = r8
            boolean r0 = r15.A07(r16, r17, r18, r19, r20, r22)
            if (r0 != 0) goto L_0x014d
            goto L_0x0004
        L_0x0142:
            long r8 = r0.longValue()
            goto L_0x006e
        L_0x0148:
            java.lang.String r0 = "SyncResponseHandler/handleIncomingPatches snapshot has no version, cannot apply"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x014d:
            java.util.Iterator r12 = r3.iterator()
        L_0x0151:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x0206
            java.lang.Object r8 = r12.next()
            X.1Do r8 = (X.C21891Do) r8
            int r0 = r8.bitField0_
            r0 = r0 & 1
            if (r0 == 0) goto L_0x01ff
            X.1Ab r0 = r8.version_
            r1 = r0
            if (r0 != 0) goto L_0x016a
            X.1Ab r0 = X.C20981Ab.DEFAULT_INSTANCE
        L_0x016a:
            int r0 = r0.bitField0_
            r0 = r0 & 1
            if (r0 == 0) goto L_0x01ff
            if (r1 != 0) goto L_0x0174
            X.1Ab r1 = X.C20981Ab.DEFAULT_INSTANCE
        L_0x0174:
            long r0 = r1.version_
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r2 = "SyncResponseHandler/handleIncomingPatches applying patch for collection "
            r3.append(r2)
            r3.append(r5)
            X.C18260x0.A12(r6, r3, r0)
            X.2sH r2 = r15.A0C
            long r20 = r2.A0H()
            int r2 = r8.bitField0_     // Catch:{ Exception -> 0x0253 }
            r2 = r2 & 2
            if (r2 == 0) goto L_0x01c7
            X.2vx r3 = r15.A04     // Catch:{ Exception -> 0x0253 }
            X.1DW r2 = r8.externalMutations_     // Catch:{ Exception -> 0x0253 }
            if (r2 != 0) goto L_0x0199
            X.1DW r2 = X.AnonymousClass1DW.DEFAULT_INSTANCE     // Catch:{ Exception -> 0x0253 }
        L_0x0199:
            X.1ft r11 = new X.1ft     // Catch:{ Exception -> 0x0253 }
            r11.<init>(r3, r2, r5)     // Catch:{ Exception -> 0x0253 }
            r2 = 0
            X.C58872vx.A00(r11, r5, r2)     // Catch:{ Exception -> 0x0253 }
            java.io.File r10 = r11.A00     // Catch:{ 6u5 -> 0x0246, IOException -> 0x0238 }
            byte[] r3 = X.C382926u.A00(r10)     // Catch:{ 6u5 -> 0x0246, IOException -> 0x0238 }
            X.1AA r2 = X.AnonymousClass1AA.DEFAULT_INSTANCE     // Catch:{ 6u5 -> 0x0246, IOException -> 0x0238 }
            X.6cX r9 = X.C130786cX.A05(r2, r3)     // Catch:{ 6u5 -> 0x0246, IOException -> 0x0238 }
            X.1AA r9 = (X.AnonymousClass1AA) r9     // Catch:{ 6u5 -> 0x0246, IOException -> 0x0238 }
            java.io.File r2 = r11.A01     // Catch:{ 6u5 -> 0x0246, IOException -> 0x0238 }
            boolean r2 = r2.delete()     // Catch:{ 6u5 -> 0x0246, IOException -> 0x0238 }
            if (r2 == 0) goto L_0x01bb
            r10.delete()     // Catch:{ 6u5 -> 0x0246, IOException -> 0x0238 }
        L_0x01bb:
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ 6u5 -> 0x0246, IOException -> 0x0238 }
            java.lang.String r2 = "external-mutations-downloader: downloaded mutations= "
            X.C18260x0.A1R(r3, r2, r9)     // Catch:{ 6u5 -> 0x0246, IOException -> 0x0238 }
            X.8ya r9 = r9.mutations_     // Catch:{ Exception -> 0x0253 }
            goto L_0x01c9
        L_0x01c7:
            X.8ya r9 = r8.mutations_     // Catch:{ Exception -> 0x0253 }
        L_0x01c9:
            if (r4 == 0) goto L_0x01dc
            X.2ha r2 = r15.A03     // Catch:{ Exception -> 0x0253 }
            r28 = 1
            r23 = 0
            r22 = r2
            r24 = r8
            r25 = r5
            r26 = r20
            r22.A01(r23, r24, r25, r26, r28)     // Catch:{ Exception -> 0x0253 }
        L_0x01dc:
            X.3Ek r10 = r15.A06
            int r2 = r9.size()
            long r2 = (long) r2
            X.30l r11 = r10.A01
            java.lang.String r10 = "mutation_counter"
            r11.A06(r10, r2)
            r17 = 0
            r20 = r0
            r22 = r4
            r18 = r5
            r19 = r9
            r16 = r8
            boolean r0 = r15.A07(r16, r17, r18, r19, r20, r22)
            if (r0 != 0) goto L_0x0151
            goto L_0x0004
        L_0x01ff:
            java.lang.String r0 = "SyncResponseHandler/handleIncomingPatches incoming patch has no version. Cannot apply."
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x0151
        L_0x0206:
            if (r7 != 0) goto L_0x0004
            X.2ri r0 = r15.A0G
            r0.A02(r5)
            goto L_0x0004
        L_0x020f:
            if (r2 == 0) goto L_0x005b
            long r8 = r2.longValue()
            r1 = 0
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x005c
            goto L_0x005b
        L_0x021d:
            r1 = move-exception
            java.lang.String r0 = "external-mutations-downloader/failed to read snapshot"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ Exception -> 0x025c }
            java.lang.String r0 = "Failed to read snapshot from file"
            X.1Sd r3 = new X.1Sd     // Catch:{ Exception -> 0x025c }
            r3.<init>(r0, r1)     // Catch:{ Exception -> 0x025c }
            goto L_0x0237
        L_0x022b:
            r1 = move-exception
            java.lang.String r0 = "external-mutations-downloader/failed to parse snapshot into ProtoBuf"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ Exception -> 0x025c }
            r0 = 70
            X.1Sf r3 = X.C23341Sf.A00(r5, r0)     // Catch:{ Exception -> 0x025c }
        L_0x0237:
            throw r3     // Catch:{ Exception -> 0x025c }
        L_0x0238:
            r1 = move-exception
            java.lang.String r0 = "external-mutations-downloader/failed to read mutations"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ Exception -> 0x0253 }
            java.lang.String r0 = "Failed to read mutations from file"
            X.1Sd r2 = new X.1Sd     // Catch:{ Exception -> 0x0253 }
            r2.<init>(r0, r1)     // Catch:{ Exception -> 0x0253 }
            goto L_0x0252
        L_0x0246:
            r1 = move-exception
            java.lang.String r0 = "external-mutations-downloader/failed to parse mutations into ProtoBuf"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ Exception -> 0x0253 }
            r0 = 26
            X.1Sf r2 = X.C23341Sf.A00(r5, r0)     // Catch:{ Exception -> 0x0253 }
        L_0x0252:
            throw r2     // Catch:{ Exception -> 0x0253 }
        L_0x0253:
            r1 = move-exception
            if (r4 == 0) goto L_0x026f
            X.2ha r0 = r15.A03
            r22 = 0
            r2 = 0
            goto L_0x0264
        L_0x025c:
            r1 = move-exception
            if (r4 == 0) goto L_0x026f
            X.2ha r0 = r15.A03
            r22 = 0
            r8 = 0
        L_0x0264:
            r17 = r2
            r18 = r8
            r19 = r5
            r16 = r0
            r16.A01(r17, r18, r19, r20, r22)
        L_0x026f:
            throw r1
        L_0x0270:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass30i.A06(java.util.List):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x017a, code lost:
        if (r52 == null) goto L_0x019f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0180, code lost:
        if ((r6.bitField0_ & 4) == 0) goto L_0x0192;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0182, code lost:
        r3 = r6.keyId_;
        r4 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0185, code lost:
        if (r3 != null) goto L_0x0189;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0187, code lost:
        r3 = X.AnonymousClass1AY.DEFAULT_INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x018d, code lost:
        if ((r3.bitField0_ & 1) == 0) goto L_0x0192;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x018f, code lost:
        if (r4 != null) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0192, code lost:
        com.whatsapp.util.Log.e("SyncResponseHandler/applyMutations missing snapshot key");
        r3 = X.C23341Sf.A00(r0, 59);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x019f, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x01a1, code lost:
        r4 = X.AnonymousClass1AY.DEFAULT_INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x01a3, code lost:
        r4 = new X.AnonymousClass33J(r4.id_.A07());
        r11.add(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x01b1, code lost:
        r34 = r1.A09.A02(r0, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x01bd, code lost:
        if (r34.containsValue((java.lang.Object) null) == false) goto L_0x01ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x01bf, code lost:
        com.whatsapp.util.Log.i("SyncResponseHandler/applyMutations keyMap contains null value, retry");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x01c4, code lost:
        com.whatsapp.util.Log.d("SyncResponseHandler/not able to process the patch/snapshot");
        r21.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x01ce, code lost:
        r33 = (X.C60542yj) X.C18290x4.A0i(r4, r34);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x01da, code lost:
        if (r51 == null) goto L_0x026d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x01dc, code lost:
        r4 = r1.A08;
        r3 = r2.bitField0_;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x01e2, code lost:
        if ((r3 & 8) == 0) goto L_0x0931;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x01e6, code lost:
        if ((r3 & 4) == 0) goto L_0x0924;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:?, code lost:
        r12 = r2.patchMac_.A07();
        r11 = r2.snapshotMac_.A07();
        r7 = X.AnonymousClass0x9.A18();
        r9 = r35.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0200, code lost:
        if (r9.hasNext() == false) goto L_0x020e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0202, code lost:
        r7.add(((X.AnonymousClass2RA) r9.next()).A04);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x020e, code lost:
        r10 = r4.A08;
        r3 = r2.version_;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0212, code lost:
        if (r3 != null) goto L_0x0216;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0214, code lost:
        r3 = X.C20981Ab.DEFAULT_INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0216, code lost:
        r3 = r3.version_;
        r9 = X.AnonymousClass36A.A05(r7);
        r7 = new byte[4][];
        X.AnonymousClass000.A16(r11, r9, r7);
        r7[2] = X.C18320x8.A1X(r3);
        r7 = X.AnonymousClass34c.A00(com.facebook.msys.mci.DefaultCrypto.HMAC_SHA256, X.AnonymousClass36A.A04(r0.getBytes(X.C58152un.A0D), r7, 3), r10.A00.A00(r33.A00).A01);
        r4 = X.AnonymousClass001.A0o();
        r4.append("SyncEncryptionHelper/validatePatchMac/expected=");
        r4.append(X.C627236i.A06(r12));
        r4.append("; actual = ");
        X.C18260x0.A1J(r4, X.C627236i.A06(r7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0266, code lost:
        if (java.util.Arrays.equals(r12, r7) == false) goto L_0x090a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0268, code lost:
        com.whatsapp.util.Log.i("SyncEncryptionHelper/validatePatchMac/patch mac validated");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:?, code lost:
        r28 = X.AnonymousClass002.A0K();
        r32 = X.AnonymousClass002.A0K();
        r27 = X.AnonymousClass002.A0K();
        r31 = X.AnonymousClass001.A0s();
        r30 = X.AnonymousClass001.A0s();
        r29 = X.AnonymousClass001.A0s();
        r23 = X.AnonymousClass001.A0s();
        r26 = X.AnonymousClass001.A0t();
        r25 = r35.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0295, code lost:
        if (r25.hasNext() == false) goto L_0x0471;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0297, code lost:
        r7 = (X.AnonymousClass2RA) r25.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:?, code lost:
        r3 = r7.A01;
        r38 = r3;
        r4 = (X.C60542yj) X.C18290x4.A0i(r3, r34);
        r14 = r1.A0D;
        r11 = r7.A02;
        r3 = X.AnonymousClass36A.A08(r11, 16, (r11.length - 32) - 16, 32);
        r13 = r3[0];
        r12 = r3[1];
        r24 = r3[2];
        r15 = r14.A00.A00(r4.A00);
        r10 = X.AnonymousClass36A.A03(r13, r12, new byte[2][], 0, 1);
        r3 = r7.A00;
        r37 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x02ea, code lost:
        if (java.util.Arrays.equals(r24, r14.A03(r4.A01, r3.A01, r15.A04, r10)) == false) goto L_0x044f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x02ec, code lost:
        r4 = X.AnonymousClass34c.A01(r13, r12, r15.A03, 2);
        r11 = r7.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:?, code lost:
        r4 = (X.C21671Cs) X.C130786cX.A05(X.C21671Cs.DEFAULT_INSTANCE, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x02fc, code lost:
        if (r4 == null) goto L_0x036c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:?, code lost:
        r10 = r4.bitField0_;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0308, code lost:
        if (X.AnonymousClass000.A1S(r10 & 8) == false) goto L_0x0311;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:?, code lost:
        r40 = java.lang.Integer.valueOf(r4.version_);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0311, code lost:
        r40 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0315, code lost:
        if ((r10 & 1) == 0) goto L_0x0318;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0318, code lost:
        r41 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x031b, code lost:
        r3 = r4.index_;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x031d, code lost:
        if (r3 == null) goto L_0x0318;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x031f, code lost:
        r41 = r3.A05();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0327, code lost:
        if ((r4.bitField0_ & 2) == 0) goto L_0x0332;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0329, code lost:
        r3 = r4.value_;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x032b, code lost:
        if (r3 != null) goto L_0x0334;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x032d, code lost:
        r3 = X.AnonymousClass1EO.DEFAULT_INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x032f, code lost:
        if (r3 == null) goto L_0x0332;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0332, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x0334, code lost:
        if (r40 == null) goto L_0x0360;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x0336, code lost:
        if (r41 == null) goto L_0x034a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x0338, code lost:
        if (r3 != null) goto L_0x0390;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x033e, code lost:
        if (r37 == X.C60642yt.A02) goto L_0x03aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x0340, code lost:
        r36 = new X.C23351Sg(r37, r38, (X.AnonymousClass1EO) null, r40, r41, r11, 2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x034a, code lost:
        r41 = new X.C23351Sg(r37, r38, r3, r40, (java.lang.String) null, r11, 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x0360, code lost:
        r36 = new X.C23351Sg(r37, r38, r3, r40, r41, r11, 3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x036c, code lost:
        r36 = new X.C23351Sg(r37, (X.AnonymousClass33J) null, (X.AnonymousClass1EO) null, (java.lang.Integer) null, (java.lang.String) null, r11, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:?, code lost:
        r36 = new X.C23351Sg(r37, (X.AnonymousClass33J) null, (X.AnonymousClass1EO) null, (java.lang.Integer) null, (java.lang.String) null, r11, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x0396, code lost:
        if (X.AnonymousClass0x2.A1X(r3.bitField0_) != false) goto L_0x03aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x039c, code lost:
        if (r37 == X.C60642yt.A02) goto L_0x03aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x039e, code lost:
        r36 = new X.C23351Sg(r37, r38, r3, r40, r41, r11, 7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:?, code lost:
        r36 = new X.C23351Sg(r37, r38, r3, r40, r41, r11, 4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x03bb, code lost:
        r36 = new X.AnonymousClass35M(r37, r38, r3, r41, r11, X.AnonymousClass35M.A01(r41), r40.intValue());
        r11 = r36.A04;
        r3 = X.AnonymousClass34c.A00(com.facebook.msys.mci.DefaultCrypto.HMAC_SHA256, r11.getBytes(X.C58152un.A0D), r15.A00);
        r7 = r7.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x03e2, code lost:
        if (java.util.Arrays.equals(r7, r3) == false) goto L_0x0447;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x03e4, code lost:
        r26.put(r11, r7);
        r9 = r36.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x03ef, code lost:
        if (r9 != X.C60642yt.A03) goto L_0x040b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x03f1, code lost:
        r31.add(r36);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x03fc, code lost:
        if (r32.add(r11) != false) goto L_0x0291;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x03fe, code lost:
        com.whatsapp.util.Log.e("SyncResponseHandler/applyMutations same index for multi set mutations");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x0403, code lost:
        if (r51 == null) goto L_0x0406;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x0406, code lost:
        r4 = X.C23341Sf.A00(r0, 68);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x040d, code lost:
        if (r9 != X.C60642yt.A02) goto L_0x043c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x040f, code lost:
        r3 = r30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x041b, code lost:
        if (r36.A06[0].equals("contact") == false) goto L_0x041f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x041d, code lost:
        r3 = r29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x041f, code lost:
        r3.add(r36);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x0428, code lost:
        if (r27.add(r11) != false) goto L_0x0291;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x042a, code lost:
        com.whatsapp.util.Log.e("SyncResponseHandler/applyMutations same index for multi remove mutations");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x042f, code lost:
        if (r51 == null) goto L_0x0437;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x0431, code lost:
        r4 = X.C23341Sf.A00(r0, 6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x0437, code lost:
        r4 = X.C23341Sf.A00(r0, 68);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x043c, code lost:
        X.C18260x0.A1Q(X.AnonymousClass001.A0o(), "SyncResponseHandler/applyMutations: Unknown operation ", r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x0447, code lost:
        r4 = new X.C22871Qk("Index hash corrupt");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x044f, code lost:
        r4 = new X.C22871Qk("Data mac corrupt");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x0457, code lost:
        r4 = X.C23341Sf.A00(r0, 6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x045c, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x0471, code lost:
        r4 = r1.A0I;
        r15 = X.C58422vE.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x047b, code lost:
        if (r4.A0Y(r15, 624) == false) goto L_0x04a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x047d, code lost:
        r7 = X.AnonymousClass001.A0o();
        r7.append("SyncResponseHandler/applyMutations:");
        r7.append("\nREMOVE mutations: ");
        X.C18310x6.A1G("\n", r30, r7);
        X.C18310x6.A1G("\n", r29, r7);
        r7.append("\nSET mutations: ");
        X.C18260x0.A1J(r7, android.text.TextUtils.join("\n", r31));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x04a5, code lost:
        r4 = X.C18320x8.A0o(r28);
        r4.addAll(r32);
        r4.addAll(r27);
        r7 = X.AnonymousClass001.A0o();
        r7.append("SyncResponseHandler/applyMutations/ collection=");
        r7.append(r0);
        X.C18260x0.A19("; failed=", r7, r28);
        X.C18260x0.A19("; set=", r7, r32);
        X.C18260x0.A19("; remove=", r7, r27);
        r7.append("; isSnapshot=");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:?, code lost:
        X.C18260x0.A1U(r7, X.AnonymousClass000.A1W(r6));
        r13 = r1.A08;
        r12 = (java.lang.String[]) r4.toArray(A0L);
        r11 = X.AnonymousClass001.A0s();
        r14 = X.AnonymousClass001.A0s();
        r9 = r35.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x04fa, code lost:
        if (r9.hasNext() == false) goto L_0x0513;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x04fc, code lost:
        r7 = (X.AnonymousClass2RA) r9.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x0506, code lost:
        if (r7.A00 != X.C60642yt.A03) goto L_0x04f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x0508, code lost:
        r11.add(r7.A04);
        r14.add(r7.A03);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x0513, code lost:
        r10 = null;
        r9 = X.AnonymousClass001.A0o();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x051c, code lost:
        if (r11.isEmpty() != false) goto L_0x0559;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x051e, code lost:
        r10 = X.AnonymousClass002.A0K();
        r9.append("SyncEncryptionHelper/calculateNewLtHash/antiTampering:\nindexMac: valueMac\nmacsToAdd:\n");
        r7 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x052c, code lost:
        if (r7 >= r11.size()) goto L_0x0559;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x052e, code lost:
        r3 = r13.A01((byte[]) r14.get(r7));
        r10.add(r3);
        r4 = X.AnonymousClass000.A0l(r3);
        r4.append(": ");
        r4.append(r13.A01((byte[]) r11.get(r7)));
        X.C18270x1.A1C("\n", r4, r9);
        r7 = r7 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x0559, code lost:
        r36 = r0;
        r27 = r13.A03((X.AnonymousClass2S5) null, r36, r9, r11, r26, r10, r13.A09.A07(r0), r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x0575, code lost:
        if (r51 == null) goto L_0x0626;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:?, code lost:
        X.C626936e.A0C(X.AnonymousClass000.A1S(r2.bitField0_ & 4));
        r7 = r2.snapshotMac_.A07();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:?, code lost:
        r9 = r13.A08;
        r3 = r2.version_;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x058c, code lost:
        if (r3 != null) goto L_0x0590;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x058e, code lost:
        r3 = X.C20981Ab.DEFAULT_INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x0590, code lost:
        r9 = r9.A02(r33, r36, r27, r3.version_);
        r4 = X.AnonymousClass001.A0o();
        r4.append("SyncEncryptionHelper/validateSnapshotMac/expected=");
        r4.append(X.C627236i.A06(r7));
        r4.append("; actual = ");
        X.C18260x0.A1J(r4, X.C627236i.A06(r9));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x05be, code lost:
        if (java.util.Arrays.equals(r7, r9) != false) goto L_0x0620;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x05c0, code lost:
        com.whatsapp.util.Log.w("SyncEncryptionHelper/validateSnapshotMac/snapshot mac mismatch but do not throw fatal");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x05cd, code lost:
        if (r13.A0B.A0Y(r15, 1783) == false) goto L_0x05d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x05cf, code lost:
        r13.A02(16, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x05d4, code lost:
        r9 = r13.A05;
        r3 = r9.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x05ea, code lost:
        if (((1 << X.C58442vG.A00(r0)) & r3.A02().getInt("syncd_has_logged_snapshot_mac_mismatch_in_patch", 0)) != 0) goto L_0x0620;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x05ec, code lost:
        X.C18270x1.A0h(X.C613730l.A00(r3), "syncd_has_logged_snapshot_mac_mismatch_in_patch", (1 << X.C58442vG.A00(r0)) | r3.A02().getInt("syncd_has_logged_snapshot_mac_mismatch_in_patch", 0));
        r7 = r9.A00;
        r4 = new X.AnonymousClass1YP();
        r4.A02 = 60;
        r4.A01 = X.C64663Ek.A03(r0);
        r4.A00 = false;
        X.C64663Ek.A05(r7, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x0620, code lost:
        com.whatsapp.util.Log.i("SyncEncryptionHelper/validateSnapshotMac/snapshot mac validated");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x0626, code lost:
        if (r52 == null) goto L_0x0674;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:?, code lost:
        X.C626936e.A0C(X.AnonymousClass000.A1S(r6.bitField0_ & 2));
        r7 = r6.mac_.A07();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:?, code lost:
        r9 = r13.A08;
        r3 = r6.version_;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x063d, code lost:
        if (r3 != null) goto L_0x0641;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x063f, code lost:
        r3 = X.C20981Ab.DEFAULT_INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x0641, code lost:
        r9 = r9.A02(r33, r0, r27, r3.version_);
        r4 = X.AnonymousClass001.A0o();
        r4.append("SyncEncryptionHelper/validateSnapshotMac/expected=");
        r4.append(X.C627236i.A06(r7));
        r4.append("; actual = ");
        X.C18260x0.A1J(r4, X.C627236i.A06(r9));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x066d, code lost:
        if (java.util.Arrays.equals(r7, r9) == false) goto L_0x0959;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x066f, code lost:
        com.whatsapp.util.Log.i("SyncEncryptionHelper/validateSnapshotMac/snapshot mac validated");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x0678, code lost:
        if (r30.isEmpty() != false) goto L_0x06b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x067a, code lost:
        r11 = r1.A0H.A01.A0C();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:?, code lost:
        r10 = r11.Axl();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:?, code lost:
        r7 = ((X.AnonymousClass3H0) r11).A03;
        r4 = X.AnonymousClass0x9.A17();
        r9 = r30.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x0697, code lost:
        if (r9.hasNext() == false) goto L_0x06a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:286:0x0699, code lost:
        r4.add(((X.AnonymousClass35M) r9.next()).A04);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x06a5, code lost:
        X.C623934v.A02(r7, (java.lang.String[]) r4.toArray(X.AnonymousClass34E.A00));
        r10.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:?, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:?, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x06b9, code lost:
        r12 = X.AnonymousClass001.A0s();
        r9 = r29.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x06c5, code lost:
        if (r9.hasNext() == false) goto L_0x06e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:0x06c7, code lost:
        r7 = (X.AnonymousClass35M) r9.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x06d5, code lost:
        if (r32.contains(r7.A04) != false) goto L_0x06c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:299:0x06d7, code lost:
        r12.add(r5.A00(r7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:0x06df, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:?, code lost:
        A01(r4, r0);
        r23.add(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:0x06e9, code lost:
        r7 = r31.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:305:0x06f1, code lost:
        if (r7.hasNext() == false) goto L_0x070b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:308:?, code lost:
        r12.add(r5.A00((X.AnonymousClass35M) r7.next()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:309:0x0701, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:311:?, code lost:
        A01(r4, r0);
        r23.add(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:313:?, code lost:
        r29 = r1.A06;
        r11 = new X.C47902e1();
        r9 = r12.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:315:0x071c, code lost:
        if (r9.hasNext() == false) goto L_0x0730;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x071e, code lost:
        r7 = r9.next();
        r4 = r11.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:317:0x0728, code lost:
        if (r4.containsKey(r7) != false) goto L_0x0718;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:318:0x072a, code lost:
        r4.put(r7, (java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:319:0x0730, code lost:
        r26 = r12.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:321:0x0738, code lost:
        if (r26.hasNext() == false) goto L_0x07cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:322:0x073a, code lost:
        r10 = X.C18320x8.A0K(r26);
        r9 = (java.util.List) X.AnonymousClass325.A00.get(r10.A09());
        r7 = (java.util.List) X.AnonymousClass325.A01.get(r10.A09());
        r25 = r12.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x075e, code lost:
        if (r25.hasNext() == false) goto L_0x0734;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:325:0x0760, code lost:
        r13 = X.C18320x8.A0K(r25);
        r24 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:326:0x0766, code lost:
        if (r9 == null) goto L_0x0795;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:328:0x0770, code lost:
        if (r9.contains(r13.A09()) == false) goto L_0x0795;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:329:0x0772, code lost:
        r3 = X.AnonymousClass325.A00(r13);
        r15 = r3.first;
        r14 = (X.AnonymousClass2z0) r3.second;
        r3 = X.AnonymousClass325.A00(r10);
        r4 = r3.first;
        r3 = r3.second;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:330:0x0788, code lost:
        if (X.AnonymousClass75J.A00(r15, r4) == false) goto L_0x0795;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:331:0x078a, code lost:
        if (r14 == null) goto L_0x0797;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:332:0x078c, code lost:
        if (r3 == null) goto L_0x0797;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:334:0x0792, code lost:
        if (r14.equals(r3) == false) goto L_0x0795;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:336:0x0795, code lost:
        r4 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:337:0x0797, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:338:0x0798, code lost:
        if (r7 == null) goto L_0x07a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:340:0x07a2, code lost:
        if (r7.contains(r13.A09()) == false) goto L_0x07a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:342:0x07a5, code lost:
        r24 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:343:0x07a7, code lost:
        if (r13 == r10) goto L_0x075a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:344:0x07a9, code lost:
        if (r4 != false) goto L_0x07ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:345:0x07ab, code lost:
        if (r24 == false) goto L_0x075a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:347:0x07b3, code lost:
        if (r13.A04 >= r10.A04) goto L_0x07ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:348:0x07b5, code lost:
        r3 = r11.A01(r10, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:349:0x07ba, code lost:
        r3 = r11.A01(r13, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:350:0x07be, code lost:
        if (r3 == false) goto L_0x075a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:351:0x07c0, code lost:
        r29.A01.A06("cross_index_conflict_counter", 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:352:0x07cc, code lost:
        r12 = X.AnonymousClass001.A0s();
        r10 = X.AnonymousClass002.A0K();
        r9 = r11.A00;
        r7 = r9.size();
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:353:0x07db, code lost:
        if (r4 >= r7) goto L_0x07e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:354:0x07dd, code lost:
        r11.A00(r9.A02[r4 << 1], r12, r10);
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:355:0x07e9, code lost:
        r10 = r12.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:357:0x07f1, code lost:
        if (r10.hasNext() == false) goto L_0x085f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:358:0x07f3, code lost:
        r4 = X.C18320x8.A0K(r10);
        r7 = r5.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:359:0x07f9, code lost:
        if (r4 != null) goto L_0x07fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:360:0x07fb, code lost:
        r9 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:361:0x07fd, code lost:
        r3 = r4.A09();
        X.C162457s7.A0D(r3);
        r9 = r7.A00(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:362:0x0808, code lost:
        X.C626936e.A06(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:364:?, code lost:
        r9.A0A(r4, r5.A02.A06(r4.A08()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:366:?, code lost:
        r5.A01(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:367:0x081d, code lost:
        if ((r4 instanceof X.AnonymousClass1SW) == false) goto L_0x083b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:368:0x081f, code lost:
        r4 = (X.AnonymousClass1SW) r4;
        r3 = r4.A02;
        r7 = r1.A02;
        r4 = r4.A01;
        r34 = 3;
        r35 = !r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:369:0x082b, code lost:
        r7.A02(r4, (java.lang.Integer) null, (java.lang.String) null, (java.lang.String) null, r34, r35, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:371:0x083d, code lost:
        if ((r4 instanceof X.AnonymousClass1SX) == false) goto L_0x0850;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:372:0x083f, code lost:
        r4 = (X.AnonymousClass1SX) r4;
        r3 = r4.A02;
        r7 = r1.A02;
        r4 = r4.A01;
        r34 = 3;
        r35 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:373:0x084b, code lost:
        if (r3 == false) goto L_0x082b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:374:0x084d, code lost:
        r35 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:376:0x0852, code lost:
        if ((r4 instanceof X.AnonymousClass1SU) == false) goto L_0x07ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:377:0x0854, code lost:
        r7 = r1.A02;
        r4 = ((X.AnonymousClass1SU) r4).A01;
        r34 = 3;
        r35 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:379:?, code lost:
        r23 = r23.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:381:0x0867, code lost:
        if (r23.hasNext() == false) goto L_0x08fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:382:0x0869, code lost:
        r3 = (X.C23351Sg) r23.next();
        com.whatsapp.util.Log.d("SyncResponseHandler/applyMutations add unsupported mutation");
        r10 = r3.reason;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:385:?, code lost:
        X.C626936e.A0F(X.AnonymousClass000.A1U(6, r10), X.AnonymousClass000.A0Y("unexpected reason=", X.AnonymousClass001.A0o(), r10));
        r11 = r1.A0H;
        r10 = r3.version;
        r13 = r3.operation;
        r9 = r3.index;
        X.C626936e.A06(r9);
        r7 = r3.mutationMac;
        r4 = r3.syncdKeyId;
        X.C626936e.A06(r4);
        r12 = r3.syncActionValue;
        r15 = r11.A01.A0C();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:387:?, code lost:
        r14 = r15.Axl();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:390:0x08a9, code lost:
        if (r13 != X.C60642yt.A02) goto L_0x08cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:391:0x08ab, code lost:
        r7 = ((X.AnonymousClass3H0) r15).A03;
        r10 = X.AnonymousClass001.A0o();
        X.C57212tH.A02("DELETE FROM syncd_mutations WHERE mutation_index IN ", r10, 1);
        r7.A0I(r10.toString(), "SyncdMutationsStore.addUnsupportedMutation", new java.lang.String[]{r9});
     */
    /* JADX WARNING: Code restructure failed: missing block: B:392:0x08c8, code lost:
        r14.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:394:0x08ce, code lost:
        if (r13 != X.C60642yt.A03) goto L_0x08c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:395:0x08d0, code lost:
        r3 = ((X.AnonymousClass3H0) r15).A03;
        X.C626936e.A06(r12);
        r11.A0D(r3, r4, (X.C95814uZ) null, r9, r0, X.AnonymousClass35M.A00(r9), r12.A0F(), r7, r10, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:397:?, code lost:
        r14.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:399:?, code lost:
        r15.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:400:0x08fe, code lost:
        if (r27 == null) goto L_0x01c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:403:?, code lost:
        r21.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:405:?, code lost:
        r22.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:408:0x0909, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:411:?, code lost:
        com.whatsapp.util.Log.e("SyncEncryptionHelper/validatePatchMac/patch mac mismatch");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:412:0x0915, code lost:
        throw X.C23341Sf.A00(r0, 34);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:413:0x0916, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:416:?, code lost:
        com.whatsapp.util.Log.e("SyncEncryptionHelper/validatePatchIntegrity: ", r4);
        r3 = X.C23341Sf.A00(r0, 10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:417:0x0924, code lost:
        com.whatsapp.util.Log.e("SyncEncryptionHelper/validatePatchMac/No snapshot mac");
        r3 = X.C23341Sf.A00(r0, 47);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:418:0x0931, code lost:
        com.whatsapp.util.Log.e("SyncEncryptionHelper/validatePatchMac/No patch mac");
        r3 = X.C23341Sf.A00(r0, 48);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:419:0x093e, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:420:0x093f, code lost:
        com.whatsapp.util.Log.e("SyncResponseHandler/applyMutations", r4);
        r3 = X.C23341Sf.A00(r0, 7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:421:0x094b, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:422:0x094c, code lost:
        com.whatsapp.util.Log.e("SyncEncryptionHelper/validateSnapshotMac: ", r4);
        r3 = X.C23341Sf.A00(r0, 10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:425:?, code lost:
        com.whatsapp.util.Log.e("SyncEncryptionHelper/validateSnapshotMac/snapshot mac mismatch");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:426:0x0964, code lost:
        throw X.C23341Sf.A00(r0, 61);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:427:0x0965, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:430:?, code lost:
        com.whatsapp.util.Log.e("SyncEncryptionHelper/validateSnapshotMac: ", r4);
        r3 = X.C23341Sf.A00(r0, 10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:431:0x0973, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:433:?, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:434:0x0978, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:436:?, code lost:
        r3.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:438:0x097d, code lost:
        r3 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:440:?, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:444:0x0985, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:446:?, code lost:
        r14.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:447:0x098a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:449:?, code lost:
        r3.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:451:0x098f, code lost:
        r3 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:453:?, code lost:
        r15.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:454:0x0995, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:456:?, code lost:
        r3.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:457:0x099b, code lost:
        r49.A05(r0, r27, r16);
        r21.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:458:0x09a7, code lost:
        if (r57 == false) goto L_0x0a3b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:459:0x09a9, code lost:
        r9 = r1.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:460:0x09ab, code lost:
        if (r52 == null) goto L_0x09ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:461:0x09ad, code lost:
        r8 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:462:0x09ae, code lost:
        r10 = new X.C25691av();
        r4 = 1;
        r10.A05 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:463:0x09c0, code lost:
        if (X.AnonymousClass33W.A09.contains(r0) != false) goto L_0x09c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:464:0x09c2, code lost:
        r4 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:465:0x09c3, code lost:
        r10.A04 = java.lang.Integer.valueOf(r4);
        r10.A0A = r9.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:466:0x09d3, code lost:
        switch(r0.hashCode()) {
            case -849492943: goto L_0x09dd;
            case -564602779: goto L_0x09e7;
            case -498584183: goto L_0x09f1;
            case 207170541: goto L_0x09fa;
            case 1086463900: goto L_0x0a03;
            default: goto L_0x09d6;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:468:0x09dc, code lost:
        throw X.AnonymousClass001.A0c("CompanionSyncStatsLogger/convertToWamCollection received undefined collection name");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:470:0x09e4, code lost:
        if (r0.equals("regular_low") == false) goto L_0x09d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:473:0x09ee, code lost:
        if (r0.equals("regular_high") == false) goto L_0x09d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:476:0x09f7, code lost:
        if (r0.equals("critical_unblock_low") == false) goto L_0x09d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:479:0x0a00, code lost:
        if (r0.equals("critical_block") == false) goto L_0x09d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:482:0x0a0a, code lost:
        if (r0.equals("regular") == false) goto L_0x09d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:484:0x0a0d, code lost:
        r0 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:485:0x0a0f, code lost:
        r0 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:486:0x0a11, code lost:
        r0 = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:487:0x0a13, code lost:
        r0 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:488:0x0a15, code lost:
        r0 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:489:0x0a16, code lost:
        r10.A02 = java.lang.Integer.valueOf(r0);
        r6 = r9.A03.A0H();
        r10.A09 = java.lang.Long.valueOf(r6);
        r10.A08 = X.C18310x6.A0f(r6, r18);
        r10.A01 = java.lang.Boolean.valueOf(r8);
        r9.A06.BhD(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:491:?, code lost:
        r21.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:493:?, code lost:
        r22.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:496:0x0a42, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:497:0x0a43, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:499:?, code lost:
        X.C18260x0.A1Q(X.AnonymousClass001.A0o(), "SyncResponseHandler/applyMutations cyclic mutation e=", r6);
        r3 = X.C23341Sf.A00(r0, 39);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x012e, code lost:
        r3 = X.C23341Sf.A00(r0, 12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0136, code lost:
        r3 = X.C23341Sf.A00(r0, 20);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x013e, code lost:
        r3 = X.C23341Sf.A00(r0, 17);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002e, code lost:
        if (r52 == null) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0157, code lost:
        if (r51 == null) goto L_0x017a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x015d, code lost:
        if ((r2.bitField0_ & 16) == 0) goto L_0x016d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x015f, code lost:
        r3 = r2.keyId_;
        r4 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0162, code lost:
        if (r3 != null) goto L_0x0166;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0164, code lost:
        r3 = X.AnonymousClass1AY.DEFAULT_INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x016a, code lost:
        if ((r3.bitField0_ & 1) == 0) goto L_0x016d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x016d, code lost:
        com.whatsapp.util.Log.e("SyncResponseHandler/applyMutations missing patch key");
        r3 = X.C23341Sf.A00(r0, 56);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:419:0x093e A[Catch:{ 1Sb | 1Sh | ParseException -> 0x093e, 1Sg -> 0x045d, all -> 0x0a76 }, ExcHandler: 1Sb | 1Sh | ParseException (r4v56 'e' java.lang.Throwable A[CUSTOM_DECLARE, Catch:{ all -> 0x0a7b, all -> 0x0a80 }]), Splitter:B:140:0x029d] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A07(X.C21891Do r51, X.C21661Cr r52, java.lang.String r53, java.util.List r54, long r55, boolean r57) {
        /*
            r50 = this;
            r20 = 1
            r8 = 0
            r2 = r51
            boolean r1 = X.AnonymousClass000.A1W(r2)
            r6 = r52
            boolean r0 = X.AnonymousClass000.A1W(r6)
            r1 = r1 ^ r0
            java.lang.String r4 = "patch XOR snapshot must be non null"
            X.C626936e.A0E(r1, r4)
            r1 = r50
            X.2sH r0 = r1.A0C
            long r18 = r0.A0H()
            X.2qH r5 = r1.A0A
            monitor-enter(r5)
            X.1RE r0 = r1.A0E     // Catch:{ 1Sf -> 0x0a8a }
            X.4Fq r22 = r0.A0C()     // Catch:{ 1Sf -> 0x0a8a }
            X.3Yo r21 = r22.Axl()     // Catch:{ all -> 0x0a80 }
            if (r51 != 0) goto L_0x0030
            r15 = 1
            if (r52 != 0) goto L_0x0031
        L_0x0030:
            r15 = 0
        L_0x0031:
            X.2ri r0 = r1.A0G     // Catch:{ all -> 0x0a76 }
            r49 = r0
            r0 = r53
            r3 = r49
            java.lang.Long r3 = r3.A00(r0)     // Catch:{ all -> 0x0a76 }
            if (r3 != 0) goto L_0x0042
            r9 = 0
            goto L_0x0046
        L_0x0042:
            long r9 = r3.longValue()     // Catch:{ all -> 0x0a76 }
        L_0x0046:
            java.lang.Long r3 = java.lang.Long.valueOf(r9)     // Catch:{ all -> 0x0a76 }
            long r13 = r3.longValue()     // Catch:{ all -> 0x0a76 }
            r11 = 1
            r16 = r55
            long r9 = r55 - r11
            int r7 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r7 == 0) goto L_0x005c
            if (r15 != 0) goto L_0x005c
            goto L_0x0a54
        L_0x005c:
            boolean r3 = X.AnonymousClass000.A1W(r2)
            boolean r7 = X.AnonymousClass000.A1W(r6)
            r3 = r3 ^ r7
            X.C626936e.A0E(r3, r4)     // Catch:{ all -> 0x0a76 }
            java.util.ArrayList r35 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x0a76 }
            java.util.HashSet r11 = X.AnonymousClass002.A0K()     // Catch:{ all -> 0x0a76 }
            java.util.Iterator r13 = r54.iterator()     // Catch:{ all -> 0x0a76 }
        L_0x0074:
            boolean r3 = r13.hasNext()     // Catch:{ all -> 0x0a76 }
            if (r3 == 0) goto L_0x0156
            java.lang.Object r7 = r13.next()     // Catch:{ all -> 0x0a76 }
            X.1Bb r7 = (X.C21241Bb) r7     // Catch:{ all -> 0x0a76 }
            int r3 = r7.bitField0_     // Catch:{ all -> 0x0a76 }
            r4 = r3 & 1
            if (r4 == 0) goto L_0x014e
            r3 = r3 & 2
            if (r3 == 0) goto L_0x0146
            X.1CK r12 = r7.record_     // Catch:{ all -> 0x0a76 }
            if (r12 != 0) goto L_0x0092
            X.1CK r12 = X.AnonymousClass1CK.DEFAULT_INSTANCE     // Catch:{ all -> 0x0a76 }
            if (r12 == 0) goto L_0x0146
        L_0x0092:
            int r4 = r12.bitField0_     // Catch:{ all -> 0x0a76 }
            r3 = r4 & 4
            if (r3 == 0) goto L_0x013e
            X.1AY r9 = r12.keyId_     // Catch:{ all -> 0x0a76 }
            if (r9 != 0) goto L_0x00a7
            X.1AY r3 = X.AnonymousClass1AY.DEFAULT_INSTANCE     // Catch:{ all -> 0x0a76 }
            if (r3 == 0) goto L_0x013e
        L_0x00a0:
            int r3 = r3.bitField0_     // Catch:{ all -> 0x0a76 }
            r3 = r3 & 1
            if (r3 == 0) goto L_0x013e
            goto L_0x00a9
        L_0x00a7:
            r3 = r9
            goto L_0x00a0
        L_0x00a9:
            r3 = r4 & 1
            if (r3 == 0) goto L_0x0136
            X.1AZ r3 = r12.index_     // Catch:{ all -> 0x0a76 }
            r10 = r3
            if (r3 != 0) goto L_0x00b4
            X.1AZ r3 = X.AnonymousClass1AZ.DEFAULT_INSTANCE     // Catch:{ all -> 0x0a76 }
        L_0x00b4:
            int r3 = r3.bitField0_     // Catch:{ all -> 0x0a76 }
            r3 = r3 & 1
            if (r3 == 0) goto L_0x0136
            if (r10 != 0) goto L_0x00be
            X.1AZ r10 = X.AnonymousClass1AZ.DEFAULT_INSTANCE     // Catch:{ all -> 0x0a76 }
        L_0x00be:
            X.8Lq r3 = r10.blob_     // Catch:{ all -> 0x0a76 }
            if (r3 == 0) goto L_0x0136
            r3 = r4 & 2
            if (r3 == 0) goto L_0x012e
            X.1Aa r3 = r12.value_     // Catch:{ all -> 0x0a76 }
            r4 = r3
            if (r3 != 0) goto L_0x00cd
            X.1Aa r3 = X.C20971Aa.DEFAULT_INSTANCE     // Catch:{ all -> 0x0a76 }
        L_0x00cd:
            int r3 = r3.bitField0_     // Catch:{ all -> 0x0a76 }
            r3 = r3 & 1
            if (r3 == 0) goto L_0x012e
            if (r4 != 0) goto L_0x00d7
            X.1Aa r4 = X.C20971Aa.DEFAULT_INSTANCE     // Catch:{ all -> 0x0a76 }
        L_0x00d7:
            X.8Lq r3 = r4.blob_     // Catch:{ all -> 0x0a76 }
            if (r3 == 0) goto L_0x012e
            if (r9 != 0) goto L_0x00df
            X.1AY r9 = X.AnonymousClass1AY.DEFAULT_INSTANCE     // Catch:{ all -> 0x0a76 }
        L_0x00df:
            X.8Lq r3 = r9.id_     // Catch:{ all -> 0x0a76 }
            byte[] r3 = r3.A07()     // Catch:{ all -> 0x0a76 }
            X.33J r10 = new X.33J     // Catch:{ all -> 0x0a76 }
            r10.<init>(r3)     // Catch:{ all -> 0x0a76 }
            X.1AZ r3 = r12.index_     // Catch:{ all -> 0x0a76 }
            if (r3 != 0) goto L_0x00f0
            X.1AZ r3 = X.AnonymousClass1AZ.DEFAULT_INSTANCE     // Catch:{ all -> 0x0a76 }
        L_0x00f0:
            X.8Lq r3 = r3.blob_     // Catch:{ all -> 0x0a76 }
            byte[] r9 = r3.A07()     // Catch:{ all -> 0x0a76 }
            int r4 = r7.operation_     // Catch:{ all -> 0x0a76 }
            if (r4 == 0) goto L_0x0101
            r3 = r20
            if (r4 == r3) goto L_0x0104
            X.22c r3 = X.AnonymousClass22c.SET     // Catch:{ all -> 0x0a76 }
            goto L_0x0106
        L_0x0101:
            X.22c r3 = X.AnonymousClass22c.SET     // Catch:{ all -> 0x0a76 }
            goto L_0x0106
        L_0x0104:
            X.22c r3 = X.AnonymousClass22c.REMOVE     // Catch:{ all -> 0x0a76 }
        L_0x0106:
            int r3 = r3.ordinal()     // Catch:{ all -> 0x0a76 }
            if (r3 == r8) goto L_0x012b
            X.2yt r7 = X.C60642yt.A02     // Catch:{ all -> 0x0a76 }
        L_0x010e:
            X.1Aa r3 = r12.value_     // Catch:{ all -> 0x0a76 }
            if (r3 != 0) goto L_0x0114
            X.1Aa r3 = X.C20971Aa.DEFAULT_INSTANCE     // Catch:{ all -> 0x0a76 }
        L_0x0114:
            X.8Lq r3 = r3.blob_     // Catch:{ all -> 0x0a76 }
            byte[] r4 = r3.A07()     // Catch:{ all -> 0x0a76 }
            X.2RA r3 = new X.2RA     // Catch:{ all -> 0x0a76 }
            r3.<init>(r7, r10, r9, r4)     // Catch:{ all -> 0x0a76 }
            r4 = r35
            r4.add(r3)     // Catch:{ all -> 0x0a76 }
            X.33J r3 = r3.A01     // Catch:{ all -> 0x0a76 }
            r11.add(r3)     // Catch:{ all -> 0x0a76 }
            goto L_0x0074
        L_0x012b:
            X.2yt r7 = X.C60642yt.A03     // Catch:{ all -> 0x0a76 }
            goto L_0x010e
        L_0x012e:
            r3 = 12
            X.1Sf r3 = X.C23341Sf.A00(r0, r3)     // Catch:{ all -> 0x0a76 }
            goto L_0x0a75
        L_0x0136:
            r3 = 20
            X.1Sf r3 = X.C23341Sf.A00(r0, r3)     // Catch:{ all -> 0x0a76 }
            goto L_0x0a75
        L_0x013e:
            r3 = 17
            X.1Sf r3 = X.C23341Sf.A00(r0, r3)     // Catch:{ all -> 0x0a76 }
            goto L_0x0a75
        L_0x0146:
            r3 = 16
            X.1Sf r3 = X.C23341Sf.A00(r0, r3)     // Catch:{ all -> 0x0a76 }
            goto L_0x0a75
        L_0x014e:
            r3 = 15
            X.1Sf r3 = X.C23341Sf.A00(r0, r3)     // Catch:{ all -> 0x0a76 }
            goto L_0x0a75
        L_0x0156:
            r7 = 0
            if (r51 == 0) goto L_0x017a
            int r3 = r2.bitField0_     // Catch:{ all -> 0x0a76 }
            r3 = r3 & 16
            if (r3 == 0) goto L_0x016d
            X.1AY r3 = r2.keyId_     // Catch:{ all -> 0x0a76 }
            r4 = r3
            if (r3 != 0) goto L_0x0166
            X.1AY r3 = X.AnonymousClass1AY.DEFAULT_INSTANCE     // Catch:{ all -> 0x0a76 }
        L_0x0166:
            int r3 = r3.bitField0_     // Catch:{ all -> 0x0a76 }
            r3 = r3 & 1
            if (r3 == 0) goto L_0x016d
            goto L_0x018f
        L_0x016d:
            java.lang.String r3 = "SyncResponseHandler/applyMutations missing patch key"
            com.whatsapp.util.Log.e((java.lang.String) r3)     // Catch:{ all -> 0x0a76 }
            r3 = 56
            X.1Sf r3 = X.C23341Sf.A00(r0, r3)     // Catch:{ all -> 0x0a76 }
            goto L_0x0a75
        L_0x017a:
            if (r52 == 0) goto L_0x019f
            int r3 = r6.bitField0_     // Catch:{ all -> 0x0a76 }
            r3 = r3 & 4
            if (r3 == 0) goto L_0x0192
            X.1AY r3 = r6.keyId_     // Catch:{ all -> 0x0a76 }
            r4 = r3
            if (r3 != 0) goto L_0x0189
            X.1AY r3 = X.AnonymousClass1AY.DEFAULT_INSTANCE     // Catch:{ all -> 0x0a76 }
        L_0x0189:
            int r3 = r3.bitField0_     // Catch:{ all -> 0x0a76 }
            r3 = r3 & 1
            if (r3 == 0) goto L_0x0192
        L_0x018f:
            if (r4 != 0) goto L_0x01a3
            goto L_0x01a1
        L_0x0192:
            java.lang.String r3 = "SyncResponseHandler/applyMutations missing snapshot key"
            com.whatsapp.util.Log.e((java.lang.String) r3)     // Catch:{ all -> 0x0a76 }
            r3 = 59
            X.1Sf r3 = X.C23341Sf.A00(r0, r3)     // Catch:{ all -> 0x0a76 }
            goto L_0x0a75
        L_0x019f:
            r4 = r7
            goto L_0x01b1
        L_0x01a1:
            X.1AY r4 = X.AnonymousClass1AY.DEFAULT_INSTANCE     // Catch:{ all -> 0x0a76 }
        L_0x01a3:
            X.8Lq r3 = r4.id_     // Catch:{ all -> 0x0a76 }
            byte[] r3 = r3.A07()     // Catch:{ all -> 0x0a76 }
            X.33J r4 = new X.33J     // Catch:{ all -> 0x0a76 }
            r4.<init>(r3)     // Catch:{ all -> 0x0a76 }
            r11.add(r4)     // Catch:{ all -> 0x0a76 }
        L_0x01b1:
            X.2sZ r3 = r1.A09     // Catch:{ all -> 0x0a76 }
            java.util.HashMap r34 = r3.A02(r0, r11)     // Catch:{ all -> 0x0a76 }
            r3 = r34
            boolean r3 = r3.containsValue(r7)     // Catch:{ all -> 0x0a76 }
            if (r3 == 0) goto L_0x01ce
            java.lang.String r0 = "SyncResponseHandler/applyMutations keyMap contains null value, retry"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0a76 }
        L_0x01c4:
            java.lang.String r0 = "SyncResponseHandler/not able to process the patch/snapshot"
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ all -> 0x0a76 }
            r21.A00()     // Catch:{ all -> 0x0a76 }
            goto L_0x0902
        L_0x01ce:
            r3 = r34
            java.lang.Object r33 = X.C18290x4.A0i(r4, r3)     // Catch:{ all -> 0x0a76 }
            r3 = r33
            X.2yj r3 = (X.C60542yj) r3     // Catch:{ all -> 0x0a76 }
            r33 = r3
            if (r51 == 0) goto L_0x026d
            X.339 r4 = r1.A08     // Catch:{ all -> 0x0a76 }
            int r3 = r2.bitField0_     // Catch:{ all -> 0x0a76 }
            r7 = r3 & 8
            if (r7 == 0) goto L_0x0931
            r3 = r3 & 4
            if (r3 == 0) goto L_0x0924
            X.8Lq r3 = r2.patchMac_     // Catch:{ 1Sb | 1Sh -> 0x0916 }
            byte[] r12 = r3.A07()     // Catch:{ 1Sb | 1Sh -> 0x0916 }
            X.8Lq r3 = r2.snapshotMac_     // Catch:{ 1Sb | 1Sh -> 0x0916 }
            byte[] r11 = r3.A07()     // Catch:{ 1Sb | 1Sh -> 0x0916 }
            java.util.LinkedList r7 = X.AnonymousClass0x9.A18()     // Catch:{ 1Sb | 1Sh -> 0x0916 }
            java.util.Iterator r9 = r35.iterator()     // Catch:{ 1Sb | 1Sh -> 0x0916 }
        L_0x01fc:
            boolean r3 = r9.hasNext()     // Catch:{ 1Sb | 1Sh -> 0x0916 }
            if (r3 == 0) goto L_0x020e
            java.lang.Object r3 = r9.next()     // Catch:{ 1Sb | 1Sh -> 0x0916 }
            X.2RA r3 = (X.AnonymousClass2RA) r3     // Catch:{ 1Sb | 1Sh -> 0x0916 }
            byte[] r3 = r3.A04     // Catch:{ 1Sb | 1Sh -> 0x0916 }
            r7.add(r3)     // Catch:{ 1Sb | 1Sh -> 0x0916 }
            goto L_0x01fc
        L_0x020e:
            X.34c r10 = r4.A08     // Catch:{ 1Sb | 1Sh -> 0x0916 }
            X.1Ab r3 = r2.version_     // Catch:{ 1Sb | 1Sh -> 0x0916 }
            if (r3 != 0) goto L_0x0216
            X.1Ab r3 = X.C20981Ab.DEFAULT_INSTANCE     // Catch:{ 1Sb | 1Sh -> 0x0916 }
        L_0x0216:
            long r3 = r3.version_     // Catch:{ 1Sb | 1Sh -> 0x0916 }
            byte[] r9 = X.AnonymousClass36A.A05(r7)     // Catch:{ 1Sb | 1Sh -> 0x0916 }
            r7 = 4
            byte[][] r7 = new byte[r7][]     // Catch:{ 1Sb | 1Sh -> 0x0916 }
            X.AnonymousClass000.A16(r11, r9, r7)     // Catch:{ 1Sb | 1Sh -> 0x0916 }
            r9 = 2
            byte[] r3 = X.C18320x8.A1X(r3)     // Catch:{ 1Sb | 1Sh -> 0x0916 }
            r7[r9] = r3     // Catch:{ 1Sb | 1Sh -> 0x0916 }
            java.nio.charset.Charset r3 = X.C58152un.A0D     // Catch:{ 1Sb | 1Sh -> 0x0916 }
            byte[] r4 = r0.getBytes(r3)     // Catch:{ 1Sb | 1Sh -> 0x0916 }
            r3 = 3
            byte[] r4 = X.AnonymousClass36A.A04(r4, r7, r3)     // Catch:{ 1Sb | 1Sh -> 0x0916 }
            X.2Vw r7 = r10.A00     // Catch:{ 1Sb | 1Sh -> 0x0916 }
            r3 = r33
            X.2lQ r3 = r3.A00     // Catch:{ 1Sb | 1Sh -> 0x0916 }
            X.2vs r3 = r7.A00(r3)     // Catch:{ 1Sb | 1Sh -> 0x0916 }
            byte[] r7 = r3.A01     // Catch:{ 1Sb | 1Sh -> 0x0916 }
            java.lang.String r3 = "HmacSHA256"
            byte[] r7 = X.AnonymousClass34c.A00(r3, r4, r7)     // Catch:{ 1Sb | 1Sh -> 0x0916 }
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()     // Catch:{ 1Sb | 1Sh -> 0x0916 }
            java.lang.String r3 = "SyncEncryptionHelper/validatePatchMac/expected="
            r4.append(r3)     // Catch:{ 1Sb | 1Sh -> 0x0916 }
            java.lang.String r3 = X.C627236i.A06(r12)     // Catch:{ 1Sb | 1Sh -> 0x0916 }
            r4.append(r3)     // Catch:{ 1Sb | 1Sh -> 0x0916 }
            java.lang.String r3 = "; actual = "
            r4.append(r3)     // Catch:{ 1Sb | 1Sh -> 0x0916 }
            java.lang.String r3 = X.C627236i.A06(r7)     // Catch:{ 1Sb | 1Sh -> 0x0916 }
            X.C18260x0.A1J(r4, r3)     // Catch:{ 1Sb | 1Sh -> 0x0916 }
            boolean r3 = java.util.Arrays.equals(r12, r7)     // Catch:{ 1Sb | 1Sh -> 0x0916 }
            if (r3 == 0) goto L_0x090a
            java.lang.String r3 = "SyncEncryptionHelper/validatePatchMac/patch mac validated"
            com.whatsapp.util.Log.i((java.lang.String) r3)     // Catch:{ 1Sb | 1Sh -> 0x0916 }
        L_0x026d:
            java.util.HashSet r28 = X.AnonymousClass002.A0K()     // Catch:{ all -> 0x0a76 }
            java.util.HashSet r32 = X.AnonymousClass002.A0K()     // Catch:{ all -> 0x0a76 }
            java.util.HashSet r27 = X.AnonymousClass002.A0K()     // Catch:{ all -> 0x0a76 }
            java.util.ArrayList r31 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x0a76 }
            java.util.ArrayList r30 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x0a76 }
            java.util.ArrayList r29 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x0a76 }
            java.util.ArrayList r23 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x0a76 }
            java.util.HashMap r26 = X.AnonymousClass001.A0t()     // Catch:{ all -> 0x0a76 }
            java.util.Iterator r25 = r35.iterator()     // Catch:{ all -> 0x0a76 }
        L_0x0291:
            boolean r3 = r25.hasNext()     // Catch:{ all -> 0x0a76 }
            if (r3 == 0) goto L_0x0471
            java.lang.Object r7 = r25.next()     // Catch:{ all -> 0x0a76 }
            X.2RA r7 = (X.AnonymousClass2RA) r7     // Catch:{ all -> 0x0a76 }
            X.33J r3 = r7.A01     // Catch:{ 1Sb | 1Sh | ParseException -> 0x093e, 1Sg -> 0x045d }
            r38 = r3
            r4 = r3
            r3 = r34
            java.lang.Object r4 = X.C18290x4.A0i(r4, r3)     // Catch:{ 1Sb | 1Sh | ParseException -> 0x093e, 1Sg -> 0x045d }
            X.2yj r4 = (X.C60542yj) r4     // Catch:{ 1Sb | 1Sh | ParseException -> 0x093e, 1Sg -> 0x045d }
            X.34c r14 = r1.A0D     // Catch:{ 1Sb | 1Sh | ParseException -> 0x093e, 1Sg -> 0x045d }
            byte[] r11 = r7.A02     // Catch:{ 1Sb | 1Sh | ParseException -> 0x093e, 1Sg -> 0x045d }
            int r10 = r11.length     // Catch:{ 1Sb | 1Sh | ParseException -> 0x093e, 1Sg -> 0x045d }
            r9 = 32
            int r10 = r10 - r9
            r3 = 16
            int r10 = r10 - r3
            byte[][] r3 = X.AnonymousClass36A.A08(r11, r3, r10, r9)     // Catch:{ 1Sb | 1Sh | ParseException -> 0x093e, 1Sg -> 0x045d }
            r13 = r3[r8]     // Catch:{ 1Sb | 1Sh | ParseException -> 0x093e, 1Sg -> 0x045d }
            r12 = r3[r20]     // Catch:{ 1Sb | 1Sh | ParseException -> 0x093e, 1Sg -> 0x045d }
            r9 = 2
            r24 = r3[r9]     // Catch:{ 1Sb | 1Sh | ParseException -> 0x093e, 1Sg -> 0x045d }
            X.2Vw r10 = r14.A00     // Catch:{ 1Sb | 1Sh | ParseException -> 0x093e, 1Sg -> 0x045d }
            X.2lQ r3 = r4.A00     // Catch:{ 1Sb | 1Sh | ParseException -> 0x093e, 1Sg -> 0x045d }
            X.2vs r15 = r10.A00(r3)     // Catch:{ 1Sb | 1Sh | ParseException -> 0x093e, 1Sg -> 0x045d }
            byte[][] r10 = new byte[r9][]     // Catch:{ 1Sb | 1Sh | ParseException -> 0x093e, 1Sg -> 0x045d }
            r3 = r20
            byte[] r10 = X.AnonymousClass36A.A03(r13, r12, r10, r8, r3)     // Catch:{ 1Sb | 1Sh | ParseException -> 0x093e, 1Sg -> 0x045d }
            X.2yt r3 = r7.A00     // Catch:{ 1Sb | 1Sh | ParseException -> 0x093e, 1Sg -> 0x045d }
            r37 = r3
            byte[] r3 = r3.A01     // Catch:{ 1Sb | 1Sh | ParseException -> 0x093e, 1Sg -> 0x045d }
            r36 = r3
            X.33J r3 = r4.A01     // Catch:{ 1Sb | 1Sh | ParseException -> 0x093e, 1Sg -> 0x045d }
            r4 = r3
            byte[] r3 = r15.A04     // Catch:{ 1Sb | 1Sh | ParseException -> 0x093e, 1Sg -> 0x045d }
            r11 = r10
            r10 = r36
            byte[] r4 = r14.A03(r4, r10, r3, r11)     // Catch:{ 1Sb | 1Sh | ParseException -> 0x093e, 1Sg -> 0x045d }
            r3 = r24
            boolean r3 = java.util.Arrays.equals(r3, r4)     // Catch:{ 1Sb | 1Sh | ParseException -> 0x093e, 1Sg -> 0x045d }
            if (r3 == 0) goto L_0x044f
            byte[] r3 = r15.A03     // Catch:{ 1Sb | 1Sh | ParseException -> 0x093e, 1Sg -> 0x045d }
            byte[] r4 = X.AnonymousClass34c.A01(r13, r12, r3, r9)     // Catch:{ 1Sb | 1Sh | ParseException -> 0x093e, 1Sg -> 0x045d }
            byte[] r11 = r7.A04     // Catch:{ 1Sb | 1Sh | ParseException -> 0x093e, 1Sg -> 0x045d }
            X.1Cs r3 = X.C21671Cs.DEFAULT_INSTANCE     // Catch:{ 6u5 -> 0x037e, 1Sb | 1Sh | ParseException -> 0x093e, 1Sb | 1Sh | ParseException -> 0x093e }
            X.6cX r4 = X.C130786cX.A05(r3, r4)     // Catch:{ 6u5 -> 0x037e, 1Sb | 1Sh | ParseException -> 0x093e, 1Sb | 1Sh | ParseException -> 0x093e }
            X.1Cs r4 = (X.C21671Cs) r4     // Catch:{ 6u5 -> 0x037e, 1Sb | 1Sh | ParseException -> 0x093e, 1Sb | 1Sh | ParseException -> 0x093e }
            if (r4 == 0) goto L_0x036c
            int r10 = r4.bitField0_     // Catch:{ 1Sb | 1Sh | ParseException -> 0x093e, 1Sg -> 0x045d }
            r3 = r10 & 8
            boolean r3 = X.AnonymousClass000.A1S(r3)
            r39 = 0
            if (r3 == 0) goto L_0x0311
            int r3 = r4.version_     // Catch:{ 1Sb | 1Sh | ParseException -> 0x093e, 1Sg -> 0x045d }
            java.lang.Integer r40 = java.lang.Integer.valueOf(r3)     // Catch:{ 1Sb | 1Sh | ParseException -> 0x093e, 1Sg -> 0x045d }
            goto L_0x0313
        L_0x0311:
            r40 = r39
        L_0x0313:
            r3 = r10 & 1
            if (r3 == 0) goto L_0x0318
            goto L_0x031b
        L_0x0318:
            r41 = r39
            goto L_0x0323
        L_0x031b:
            X.8Lq r3 = r4.index_     // Catch:{ 1Sb | 1Sh | ParseException -> 0x093e, 1Sg -> 0x045d }
            if (r3 == 0) goto L_0x0318
            java.lang.String r41 = r3.A05()     // Catch:{ 1Sb | 1Sh | ParseException -> 0x093e, 1Sg -> 0x045d }
        L_0x0323:
            int r3 = r4.bitField0_     // Catch:{ 1Sb | 1Sh | ParseException -> 0x093e, 1Sg -> 0x045d }
            r3 = r3 & 2
            if (r3 == 0) goto L_0x0332
            X.1EO r3 = r4.value_     // Catch:{ 1Sb | 1Sh | ParseException -> 0x093e, 1Sg -> 0x045d }
            if (r3 != 0) goto L_0x0334
            X.1EO r3 = X.AnonymousClass1EO.DEFAULT_INSTANCE     // Catch:{ 1Sb | 1Sh | ParseException -> 0x093e, 1Sg -> 0x045d }
            if (r3 == 0) goto L_0x0332
            goto L_0x0334
        L_0x0332:
            r3 = r39
        L_0x0334:
            if (r40 == 0) goto L_0x0360
            if (r41 == 0) goto L_0x034a
            if (r3 != 0) goto L_0x0390
            X.2yt r10 = X.C60642yt.A02     // Catch:{ 1Sb | 1Sh | ParseException -> 0x093e, 1Sg -> 0x045d }
            r4 = r37
            if (r4 == r10) goto L_0x03aa
            X.1Sg r36 = new X.1Sg     // Catch:{ 1Sb | 1Sh | ParseException -> 0x093e, 1Sg -> 0x045d }
            r42 = r11
            r43 = r9
            r36.<init>(r37, r38, r39, r40, r41, r42, r43)     // Catch:{ 1Sb | 1Sh | ParseException -> 0x093e, 1Sg -> 0x045d }
            goto L_0x03a9
        L_0x034a:
            X.1Sg r36 = new X.1Sg     // Catch:{ 1Sb | 1Sh | ParseException -> 0x093e, 1Sg -> 0x045d }
            r41 = r36
            r42 = r37
            r43 = r38
            r44 = r3
            r45 = r40
            r46 = r39
            r47 = r11
            r48 = r20
            r41.<init>(r42, r43, r44, r45, r46, r47, r48)     // Catch:{ 1Sb | 1Sh | ParseException -> 0x093e, 1Sg -> 0x045d }
            goto L_0x03a9
        L_0x0360:
            r43 = 3
            X.1Sg r36 = new X.1Sg     // Catch:{ 1Sb | 1Sh | ParseException -> 0x093e, 1Sg -> 0x045d }
            r39 = r3
            r42 = r11
            r36.<init>(r37, r38, r39, r40, r41, r42, r43)     // Catch:{ 1Sb | 1Sh | ParseException -> 0x093e, 1Sg -> 0x045d }
            goto L_0x03a9
        L_0x036c:
            r38 = 0
            X.1Sg r36 = new X.1Sg     // Catch:{ 1Sb | 1Sh | ParseException -> 0x093e, 1Sg -> 0x045d }
            r40 = r38
            r41 = r38
            r39 = r38
            r42 = r11
            r43 = r8
            r36.<init>(r37, r38, r39, r40, r41, r42, r43)     // Catch:{ 1Sb | 1Sh | ParseException -> 0x093e, 1Sg -> 0x045d }
            goto L_0x03a9
        L_0x037e:
            r38 = 0
            X.1Sg r36 = new X.1Sg     // Catch:{ 1Sb | 1Sh | ParseException -> 0x093e, 1Sg -> 0x045d }
            r40 = r38
            r41 = r38
            r39 = r38
            r42 = r11
            r43 = r8
            r36.<init>(r37, r38, r39, r40, r41, r42, r43)     // Catch:{ 1Sb | 1Sh | ParseException -> 0x093e, 1Sg -> 0x045d }
            goto L_0x03a9
        L_0x0390:
            int r4 = r3.bitField0_     // Catch:{ 1Sb | 1Sh | ParseException -> 0x093e, 1Sg -> 0x045d }
            boolean r4 = X.AnonymousClass0x2.A1X(r4)     // Catch:{ 1Sb | 1Sh | ParseException -> 0x093e, 1Sg -> 0x045d }
            if (r4 != 0) goto L_0x03aa
            X.2yt r9 = X.C60642yt.A02     // Catch:{ 1Sb | 1Sh | ParseException -> 0x093e, 1Sg -> 0x045d }
            r4 = r37
            if (r4 == r9) goto L_0x03aa
            r43 = 7
            X.1Sg r36 = new X.1Sg     // Catch:{ 1Sb | 1Sh | ParseException -> 0x093e, 1Sg -> 0x045d }
            r39 = r3
            r42 = r11
            r36.<init>(r37, r38, r39, r40, r41, r42, r43)     // Catch:{ 1Sb | 1Sh | ParseException -> 0x093e, 1Sg -> 0x045d }
        L_0x03a9:
            throw r36     // Catch:{ 1Sb | 1Sh | ParseException -> 0x093e, 1Sg -> 0x045d }
        L_0x03aa:
            java.lang.String[] r42 = X.AnonymousClass35M.A01(r41)     // Catch:{ IllegalArgumentException | JSONException -> 0x03af, 1Sb | 1Sh | ParseException -> 0x093e, 1Sb | 1Sh | ParseException -> 0x093e }
            goto L_0x03bb
        L_0x03af:
            r43 = 4
            X.1Sg r36 = new X.1Sg     // Catch:{ 1Sb | 1Sh | ParseException -> 0x093e, 1Sg -> 0x045d }
            r39 = r3
            r42 = r11
            r36.<init>(r37, r38, r39, r40, r41, r42, r43)     // Catch:{ 1Sb | 1Sh | ParseException -> 0x093e, 1Sg -> 0x045d }
            goto L_0x03a9
        L_0x03bb:
            int r43 = r40.intValue()     // Catch:{ 1Sb | 1Sh | ParseException -> 0x093e, 1Sg -> 0x045d }
            X.35M r4 = new X.35M     // Catch:{ 1Sb | 1Sh | ParseException -> 0x093e, 1Sg -> 0x045d }
            r36 = r4
            r39 = r3
            r40 = r41
            r41 = r11
            r36.<init>(r37, r38, r39, r40, r41, r42, r43)     // Catch:{ 1Sb | 1Sh | ParseException -> 0x093e, 1Sg -> 0x045d }
            java.lang.String r11 = r4.A04     // Catch:{ 1Sb | 1Sh | ParseException -> 0x093e, 1Sg -> 0x045d }
            java.nio.charset.Charset r3 = X.C58152un.A0D     // Catch:{ 1Sb | 1Sh | ParseException -> 0x093e, 1Sg -> 0x045d }
            byte[] r10 = r11.getBytes(r3)     // Catch:{ 1Sb | 1Sh | ParseException -> 0x093e, 1Sg -> 0x045d }
            byte[] r9 = r15.A00     // Catch:{ 1Sb | 1Sh | ParseException -> 0x093e, 1Sg -> 0x045d }
            java.lang.String r3 = "HmacSHA256"
            byte[] r3 = X.AnonymousClass34c.A00(r3, r10, r9)     // Catch:{ 1Sb | 1Sh | ParseException -> 0x093e, 1Sg -> 0x045d }
            byte[] r7 = r7.A03     // Catch:{ 1Sb | 1Sh | ParseException -> 0x093e, 1Sg -> 0x045d }
            boolean r3 = java.util.Arrays.equals(r7, r3)     // Catch:{ 1Sb | 1Sh | ParseException -> 0x093e, 1Sg -> 0x045d }
            if (r3 == 0) goto L_0x0447
            r3 = r26
            r3.put(r11, r7)     // Catch:{ 1Sb | 1Sh | ParseException -> 0x093e, 1Sg -> 0x045d }
            X.2yt r9 = r4.A01     // Catch:{ 1Sb | 1Sh | ParseException -> 0x093e, 1Sg -> 0x045d }
            X.2yt r3 = X.C60642yt.A03     // Catch:{ 1Sb | 1Sh | ParseException -> 0x093e, 1Sg -> 0x045d }
            r7 = 68
            if (r9 != r3) goto L_0x040b
            r3 = r31
            r3.add(r4)     // Catch:{ 1Sb | 1Sh | ParseException -> 0x093e, 1Sg -> 0x045d }
            r3 = r32
            boolean r3 = r3.add(r11)     // Catch:{ 1Sb | 1Sh | ParseException -> 0x093e, 1Sg -> 0x045d }
            if (r3 != 0) goto L_0x0291
            java.lang.String r3 = "SyncResponseHandler/applyMutations same index for multi set mutations"
            com.whatsapp.util.Log.e((java.lang.String) r3)     // Catch:{ 1Sb | 1Sh | ParseException -> 0x093e, 1Sg -> 0x045d }
            if (r51 == 0) goto L_0x0406
            goto L_0x0457
        L_0x0406:
            X.1Sf r4 = X.C23341Sf.A00(r0, r7)     // Catch:{ 1Sb | 1Sh | ParseException -> 0x093e, 1Sg -> 0x045d }
            goto L_0x045c
        L_0x040b:
            X.2yt r3 = X.C60642yt.A02     // Catch:{ 1Sb | 1Sh | ParseException -> 0x093e, 1Sg -> 0x045d }
            if (r9 != r3) goto L_0x043c
            java.lang.String[] r3 = r4.A06     // Catch:{ 1Sb | 1Sh | ParseException -> 0x093e, 1Sg -> 0x045d }
            r9 = r3[r8]     // Catch:{ 1Sb | 1Sh | ParseException -> 0x093e, 1Sg -> 0x045d }
            java.lang.String r3 = "contact"
            boolean r9 = r9.equals(r3)     // Catch:{ 1Sb | 1Sh | ParseException -> 0x093e, 1Sg -> 0x045d }
            r3 = r30
            if (r9 == 0) goto L_0x041f
            r3 = r29
        L_0x041f:
            r3.add(r4)     // Catch:{ 1Sb | 1Sh | ParseException -> 0x093e, 1Sg -> 0x045d }
            r3 = r27
            boolean r3 = r3.add(r11)     // Catch:{ 1Sb | 1Sh | ParseException -> 0x093e, 1Sg -> 0x045d }
            if (r3 != 0) goto L_0x0291
            java.lang.String r3 = "SyncResponseHandler/applyMutations same index for multi remove mutations"
            com.whatsapp.util.Log.e((java.lang.String) r3)     // Catch:{ 1Sb | 1Sh | ParseException -> 0x093e, 1Sg -> 0x045d }
            if (r51 == 0) goto L_0x0437
            r3 = 6
            X.1Sf r4 = X.C23341Sf.A00(r0, r3)     // Catch:{ 1Sb | 1Sh | ParseException -> 0x093e, 1Sg -> 0x045d }
            goto L_0x045c
        L_0x0437:
            X.1Sf r4 = X.C23341Sf.A00(r0, r7)     // Catch:{ 1Sb | 1Sh | ParseException -> 0x093e, 1Sg -> 0x045d }
            goto L_0x045c
        L_0x043c:
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()     // Catch:{ 1Sb | 1Sh | ParseException -> 0x093e, 1Sg -> 0x045d }
            java.lang.String r3 = "SyncResponseHandler/applyMutations: Unknown operation "
            X.C18260x0.A1Q(r4, r3, r9)     // Catch:{ 1Sb | 1Sh | ParseException -> 0x093e, 1Sg -> 0x045d }
            goto L_0x0291
        L_0x0447:
            java.lang.String r3 = "Index hash corrupt"
            X.1Qk r4 = new X.1Qk     // Catch:{ 1Sb | 1Sh | ParseException -> 0x093e, 1Sg -> 0x045d }
            r4.<init>(r3)     // Catch:{ 1Sb | 1Sh | ParseException -> 0x093e, 1Sg -> 0x045d }
            goto L_0x045c
        L_0x044f:
            java.lang.String r3 = "Data mac corrupt"
            X.1Qk r4 = new X.1Qk     // Catch:{ 1Sb | 1Sh | ParseException -> 0x093e, 1Sg -> 0x045d }
            r4.<init>(r3)     // Catch:{ 1Sb | 1Sh | ParseException -> 0x093e, 1Sg -> 0x045d }
            goto L_0x045c
        L_0x0457:
            r3 = 6
            X.1Sf r4 = X.C23341Sf.A00(r0, r3)     // Catch:{ 1Sb | 1Sh | ParseException -> 0x093e, 1Sg -> 0x045d }
        L_0x045c:
            throw r4     // Catch:{ 1Sb | 1Sh | ParseException -> 0x093e, 1Sg -> 0x045d }
        L_0x045d:
            r4 = move-exception
            r1.A01(r4, r0)     // Catch:{ all -> 0x0a76 }
            r3 = r23
            r3.add(r4)     // Catch:{ all -> 0x0a76 }
            java.lang.String r4 = r4.index     // Catch:{ all -> 0x0a76 }
            if (r4 == 0) goto L_0x0291
            r3 = r28
            r3.add(r4)     // Catch:{ all -> 0x0a76 }
            goto L_0x0291
        L_0x0471:
            X.1VX r4 = r1.A0I     // Catch:{ all -> 0x0a76 }
            r3 = 624(0x270, float:8.74E-43)
            X.2vE r15 = X.C58422vE.A02     // Catch:{ all -> 0x0a76 }
            boolean r3 = r4.A0Y(r15, r3)     // Catch:{ all -> 0x0a76 }
            if (r3 == 0) goto L_0x04a5
            java.lang.StringBuilder r7 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0a76 }
            java.lang.String r3 = "SyncResponseHandler/applyMutations:"
            r7.append(r3)     // Catch:{ all -> 0x0a76 }
            java.lang.String r3 = "\nREMOVE mutations: "
            r7.append(r3)     // Catch:{ all -> 0x0a76 }
            java.lang.String r4 = "\n"
            r3 = r30
            X.C18310x6.A1G(r4, r3, r7)     // Catch:{ all -> 0x0a76 }
            r3 = r29
            X.C18310x6.A1G(r4, r3, r7)     // Catch:{ all -> 0x0a76 }
            java.lang.String r3 = "\nSET mutations: "
            r7.append(r3)     // Catch:{ all -> 0x0a76 }
            r3 = r31
            java.lang.String r3 = android.text.TextUtils.join(r4, r3)     // Catch:{ all -> 0x0a76 }
            X.C18260x0.A1J(r7, r3)     // Catch:{ all -> 0x0a76 }
        L_0x04a5:
            java.util.ArrayList r4 = X.C18320x8.A0o(r28)     // Catch:{ all -> 0x0a76 }
            r3 = r32
            r4.addAll(r3)     // Catch:{ all -> 0x0a76 }
            r3 = r27
            r4.addAll(r3)     // Catch:{ all -> 0x0a76 }
            java.lang.StringBuilder r7 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0a76 }
            java.lang.String r3 = "SyncResponseHandler/applyMutations/ collection="
            r7.append(r3)     // Catch:{ all -> 0x0a76 }
            r7.append(r0)     // Catch:{ all -> 0x0a76 }
            java.lang.String r9 = "; failed="
            r3 = r28
            X.C18260x0.A19(r9, r7, r3)     // Catch:{ all -> 0x0a76 }
            java.lang.String r9 = "; set="
            r3 = r32
            X.C18260x0.A19(r9, r7, r3)     // Catch:{ all -> 0x0a76 }
            java.lang.String r9 = "; remove="
            r3 = r27
            X.C18260x0.A19(r9, r7, r3)     // Catch:{ all -> 0x0a76 }
            java.lang.String r3 = "; isSnapshot="
            r7.append(r3)     // Catch:{ all -> 0x0a76 }
            boolean r3 = X.AnonymousClass000.A1W(r6)
            X.C18260x0.A1U(r7, r3)     // Catch:{ all -> 0x0a76 }
            X.339 r13 = r1.A08     // Catch:{ all -> 0x0a76 }
            java.lang.String[] r3 = A0L     // Catch:{ all -> 0x0a76 }
            java.lang.Object[] r12 = r4.toArray(r3)     // Catch:{ all -> 0x0a76 }
            java.lang.String[] r12 = (java.lang.String[]) r12     // Catch:{ all -> 0x0a76 }
            java.util.ArrayList r11 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x0a76 }
            java.util.ArrayList r14 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x0a76 }
            java.util.Iterator r9 = r35.iterator()     // Catch:{ all -> 0x0a76 }
        L_0x04f6:
            boolean r3 = r9.hasNext()     // Catch:{ all -> 0x0a76 }
            if (r3 == 0) goto L_0x0513
            java.lang.Object r7 = r9.next()     // Catch:{ all -> 0x0a76 }
            X.2RA r7 = (X.AnonymousClass2RA) r7     // Catch:{ all -> 0x0a76 }
            X.2yt r4 = r7.A00     // Catch:{ all -> 0x0a76 }
            X.2yt r3 = X.C60642yt.A03     // Catch:{ all -> 0x0a76 }
            if (r4 != r3) goto L_0x04f6
            byte[] r3 = r7.A04     // Catch:{ all -> 0x0a76 }
            r11.add(r3)     // Catch:{ all -> 0x0a76 }
            byte[] r3 = r7.A03     // Catch:{ all -> 0x0a76 }
            r14.add(r3)     // Catch:{ all -> 0x0a76 }
            goto L_0x04f6
        L_0x0513:
            r10 = 0
            java.lang.StringBuilder r9 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0a76 }
            boolean r3 = r11.isEmpty()     // Catch:{ all -> 0x0a76 }
            if (r3 != 0) goto L_0x0559
            java.util.HashSet r10 = X.AnonymousClass002.A0K()     // Catch:{ all -> 0x0a76 }
            java.lang.String r3 = "SyncEncryptionHelper/calculateNewLtHash/antiTampering:\nindexMac: valueMac\nmacsToAdd:\n"
            r9.append(r3)     // Catch:{ all -> 0x0a76 }
            r7 = 0
        L_0x0528:
            int r3 = r11.size()     // Catch:{ all -> 0x0a76 }
            if (r7 >= r3) goto L_0x0559
            java.lang.Object r3 = r14.get(r7)     // Catch:{ all -> 0x0a76 }
            byte[] r3 = (byte[]) r3     // Catch:{ all -> 0x0a76 }
            java.lang.String r3 = r13.A01(r3)     // Catch:{ all -> 0x0a76 }
            r10.add(r3)     // Catch:{ all -> 0x0a76 }
            java.lang.StringBuilder r4 = X.AnonymousClass000.A0l(r3)     // Catch:{ all -> 0x0a76 }
            java.lang.String r3 = ": "
            r4.append(r3)     // Catch:{ all -> 0x0a76 }
            java.lang.Object r3 = r11.get(r7)     // Catch:{ all -> 0x0a76 }
            byte[] r3 = (byte[]) r3     // Catch:{ all -> 0x0a76 }
            java.lang.String r3 = r13.A01(r3)     // Catch:{ all -> 0x0a76 }
            r4.append(r3)     // Catch:{ all -> 0x0a76 }
            java.lang.String r3 = "\n"
            X.C18270x1.A1C(r3, r4, r9)     // Catch:{ all -> 0x0a76 }
            int r7 = r7 + 1
            goto L_0x0528
        L_0x0559:
            X.2ri r3 = r13.A09     // Catch:{ all -> 0x0a76 }
            byte[] r41 = r3.A07(r0)     // Catch:{ all -> 0x0a76 }
            r28 = 0
            r34 = r13
            r35 = r28
            r36 = r0
            r37 = r9
            r38 = r11
            r39 = r26
            r40 = r10
            r42 = r12
            byte[] r27 = r34.A03(r35, r36, r37, r38, r39, r40, r41, r42)     // Catch:{ all -> 0x0a76 }
            if (r51 == 0) goto L_0x0626
            int r3 = r2.bitField0_     // Catch:{ all -> 0x0a76 }
            r3 = r3 & 4
            boolean r3 = X.AnonymousClass000.A1S(r3)
            X.C626936e.A0C(r3)     // Catch:{ all -> 0x0a76 }
            X.8Lq r3 = r2.snapshotMac_     // Catch:{ all -> 0x0a76 }
            byte[] r7 = r3.A07()     // Catch:{ all -> 0x0a76 }
            X.34c r9 = r13.A08     // Catch:{ 1Sb | 1Sh -> 0x094b }
            X.1Ab r3 = r2.version_     // Catch:{ 1Sb | 1Sh -> 0x094b }
            if (r3 != 0) goto L_0x0590
            X.1Ab r3 = X.C20981Ab.DEFAULT_INSTANCE     // Catch:{ 1Sb | 1Sh -> 0x094b }
        L_0x0590:
            long r3 = r3.version_     // Catch:{ 1Sb | 1Sh -> 0x094b }
            r34 = r9
            r35 = r33
            r37 = r27
            r38 = r3
            byte[] r9 = r34.A02(r35, r36, r37, r38)     // Catch:{ 1Sb | 1Sh -> 0x094b }
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()     // Catch:{ 1Sb | 1Sh -> 0x094b }
            java.lang.String r3 = "SyncEncryptionHelper/validateSnapshotMac/expected="
            r4.append(r3)     // Catch:{ 1Sb | 1Sh -> 0x094b }
            java.lang.String r3 = X.C627236i.A06(r7)     // Catch:{ 1Sb | 1Sh -> 0x094b }
            r4.append(r3)     // Catch:{ 1Sb | 1Sh -> 0x094b }
            java.lang.String r3 = "; actual = "
            r4.append(r3)     // Catch:{ 1Sb | 1Sh -> 0x094b }
            java.lang.String r3 = X.C627236i.A06(r9)     // Catch:{ 1Sb | 1Sh -> 0x094b }
            X.C18260x0.A1J(r4, r3)     // Catch:{ 1Sb | 1Sh -> 0x094b }
            boolean r3 = java.util.Arrays.equals(r7, r9)     // Catch:{ 1Sb | 1Sh -> 0x094b }
            if (r3 != 0) goto L_0x0620
            java.lang.String r3 = "SyncEncryptionHelper/validateSnapshotMac/snapshot mac mismatch but do not throw fatal"
            com.whatsapp.util.Log.w((java.lang.String) r3)     // Catch:{ 1Sb | 1Sh -> 0x094b }
            X.1VX r4 = r13.A0B     // Catch:{ 1Sb | 1Sh -> 0x094b }
            r3 = 1783(0x6f7, float:2.499E-42)
            boolean r3 = r4.A0Y(r15, r3)     // Catch:{ 1Sb | 1Sh -> 0x094b }
            if (r3 == 0) goto L_0x05d4
            r3 = 16
            r13.A02(r3, r0)     // Catch:{ 1Sb | 1Sh -> 0x094b }
        L_0x05d4:
            X.2vG r9 = r13.A05     // Catch:{ 1Sb | 1Sh -> 0x094b }
            X.30l r3 = r9.A01     // Catch:{ 1Sb | 1Sh -> 0x094b }
            android.content.SharedPreferences r4 = r3.A02()     // Catch:{ 1Sb | 1Sh -> 0x094b }
            java.lang.String r7 = "syncd_has_logged_snapshot_mac_mismatch_in_patch"
            int r10 = r4.getInt(r7, r8)     // Catch:{ 1Sb | 1Sh -> 0x094b }
            int r4 = X.C58442vG.A00(r0)     // Catch:{ 1Sb | 1Sh -> 0x094b }
            int r4 = r20 << r4
            r4 = r4 & r10
            if (r4 != 0) goto L_0x0620
            android.content.SharedPreferences r4 = r3.A02()     // Catch:{ 1Sb | 1Sh -> 0x094b }
            int r10 = r4.getInt(r7, r8)     // Catch:{ 1Sb | 1Sh -> 0x094b }
            int r4 = X.C58442vG.A00(r0)     // Catch:{ 1Sb | 1Sh -> 0x094b }
            int r4 = r20 << r4
            r4 = r4 | r10
            android.content.SharedPreferences$Editor r3 = X.C613730l.A00(r3)     // Catch:{ 1Sb | 1Sh -> 0x094b }
            X.C18270x1.A0h(r3, r7, r4)     // Catch:{ 1Sb | 1Sh -> 0x094b }
            X.3Ek r7 = r9.A00     // Catch:{ 1Sb | 1Sh -> 0x094b }
            r3 = 60
            X.1YP r4 = new X.1YP     // Catch:{ 1Sb | 1Sh -> 0x094b }
            r4.<init>()     // Catch:{ 1Sb | 1Sh -> 0x094b }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ 1Sb | 1Sh -> 0x094b }
            r4.A02 = r3     // Catch:{ 1Sb | 1Sh -> 0x094b }
            java.lang.Integer r3 = X.C64663Ek.A03(r0)     // Catch:{ 1Sb | 1Sh -> 0x094b }
            r4.A01 = r3     // Catch:{ 1Sb | 1Sh -> 0x094b }
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r8)     // Catch:{ 1Sb | 1Sh -> 0x094b }
            r4.A00 = r3     // Catch:{ 1Sb | 1Sh -> 0x094b }
            X.C64663Ek.A05(r7, r4)     // Catch:{ 1Sb | 1Sh -> 0x094b }
        L_0x0620:
            java.lang.String r3 = "SyncEncryptionHelper/validateSnapshotMac/snapshot mac validated"
            com.whatsapp.util.Log.i((java.lang.String) r3)     // Catch:{ 1Sb | 1Sh -> 0x094b }
            goto L_0x0674
        L_0x0626:
            if (r52 == 0) goto L_0x0674
            int r3 = r6.bitField0_     // Catch:{ all -> 0x0a76 }
            r3 = r3 & 2
            boolean r3 = X.AnonymousClass000.A1S(r3)
            X.C626936e.A0C(r3)     // Catch:{ all -> 0x0a76 }
            X.8Lq r3 = r6.mac_     // Catch:{ all -> 0x0a76 }
            byte[] r7 = r3.A07()     // Catch:{ all -> 0x0a76 }
            X.34c r9 = r13.A08     // Catch:{ 1Sb | 1Sh -> 0x0965 }
            X.1Ab r3 = r6.version_     // Catch:{ 1Sb | 1Sh -> 0x0965 }
            if (r3 != 0) goto L_0x0641
            X.1Ab r3 = X.C20981Ab.DEFAULT_INSTANCE     // Catch:{ 1Sb | 1Sh -> 0x0965 }
        L_0x0641:
            long r3 = r3.version_     // Catch:{ 1Sb | 1Sh -> 0x0965 }
            r10 = r33
            r11 = r0
            r12 = r27
            r13 = r3
            byte[] r9 = r9.A02(r10, r11, r12, r13)     // Catch:{ 1Sb | 1Sh -> 0x0965 }
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()     // Catch:{ 1Sb | 1Sh -> 0x0965 }
            java.lang.String r3 = "SyncEncryptionHelper/validateSnapshotMac/expected="
            r4.append(r3)     // Catch:{ 1Sb | 1Sh -> 0x0965 }
            java.lang.String r3 = X.C627236i.A06(r7)     // Catch:{ 1Sb | 1Sh -> 0x0965 }
            r4.append(r3)     // Catch:{ 1Sb | 1Sh -> 0x0965 }
            java.lang.String r3 = "; actual = "
            r4.append(r3)     // Catch:{ 1Sb | 1Sh -> 0x0965 }
            java.lang.String r3 = X.C627236i.A06(r9)     // Catch:{ 1Sb | 1Sh -> 0x0965 }
            X.C18260x0.A1J(r4, r3)     // Catch:{ 1Sb | 1Sh -> 0x0965 }
            boolean r3 = java.util.Arrays.equals(r7, r9)     // Catch:{ 1Sb | 1Sh -> 0x0965 }
            if (r3 == 0) goto L_0x0959
            java.lang.String r3 = "SyncEncryptionHelper/validateSnapshotMac/snapshot mac validated"
            com.whatsapp.util.Log.i((java.lang.String) r3)     // Catch:{ 1Sb | 1Sh -> 0x0965 }
        L_0x0674:
            boolean r3 = r30.isEmpty()     // Catch:{ all -> 0x0a76 }
            if (r3 != 0) goto L_0x06b9
            X.34v r3 = r1.A0H     // Catch:{ all -> 0x0a76 }
            X.1RE r3 = r3.A01     // Catch:{ all -> 0x0a76 }
            X.4Fq r11 = r3.A0C()     // Catch:{ all -> 0x0a76 }
            X.3Yo r10 = r11.Axl()     // Catch:{ all -> 0x097d }
            r3 = r11
            X.3H0 r3 = (X.AnonymousClass3H0) r3     // Catch:{ all -> 0x0973 }
            X.2sg r7 = r3.A03     // Catch:{ all -> 0x0973 }
            java.util.LinkedHashSet r4 = X.AnonymousClass0x9.A17()     // Catch:{ all -> 0x0973 }
            java.util.Iterator r9 = r30.iterator()     // Catch:{ all -> 0x0973 }
        L_0x0693:
            boolean r3 = r9.hasNext()     // Catch:{ all -> 0x0973 }
            if (r3 == 0) goto L_0x06a5
            java.lang.Object r3 = r9.next()     // Catch:{ all -> 0x0973 }
            X.35M r3 = (X.AnonymousClass35M) r3     // Catch:{ all -> 0x0973 }
            java.lang.String r3 = r3.A04     // Catch:{ all -> 0x0973 }
            r4.add(r3)     // Catch:{ all -> 0x0973 }
            goto L_0x0693
        L_0x06a5:
            java.lang.String[] r3 = X.AnonymousClass34E.A00     // Catch:{ all -> 0x0973 }
            java.lang.Object[] r3 = r4.toArray(r3)     // Catch:{ all -> 0x0973 }
            java.lang.String[] r3 = (java.lang.String[]) r3     // Catch:{ all -> 0x0973 }
            X.C623934v.A02(r7, r3)     // Catch:{ all -> 0x0973 }
            r10.A00()     // Catch:{ all -> 0x0973 }
            r10.close()     // Catch:{ all -> 0x097d }
            r11.close()     // Catch:{ all -> 0x0a76 }
        L_0x06b9:
            java.util.ArrayList r12 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x0a76 }
            java.util.Iterator r9 = r29.iterator()     // Catch:{ all -> 0x0a76 }
        L_0x06c1:
            boolean r3 = r9.hasNext()     // Catch:{ all -> 0x0a76 }
            if (r3 == 0) goto L_0x06e9
            java.lang.Object r7 = r9.next()     // Catch:{ all -> 0x0a76 }
            X.35M r7 = (X.AnonymousClass35M) r7     // Catch:{ all -> 0x0a76 }
            java.lang.String r4 = r7.A04     // Catch:{ 1Sg -> 0x06df }
            r3 = r32
            boolean r3 = r3.contains(r4)     // Catch:{ 1Sg -> 0x06df }
            if (r3 != 0) goto L_0x06c1
            X.33W r3 = r5.A00(r7)     // Catch:{ 1Sg -> 0x06df }
            r12.add(r3)     // Catch:{ 1Sg -> 0x06df }
            goto L_0x06c1
        L_0x06df:
            r4 = move-exception
            r1.A01(r4, r0)     // Catch:{ all -> 0x0a76 }
            r3 = r23
            r3.add(r4)     // Catch:{ all -> 0x0a76 }
            goto L_0x06c1
        L_0x06e9:
            java.util.Iterator r7 = r31.iterator()     // Catch:{ all -> 0x0a76 }
        L_0x06ed:
            boolean r3 = r7.hasNext()     // Catch:{ all -> 0x0a76 }
            if (r3 == 0) goto L_0x070b
            java.lang.Object r3 = r7.next()     // Catch:{ all -> 0x0a76 }
            X.35M r3 = (X.AnonymousClass35M) r3     // Catch:{ all -> 0x0a76 }
            X.33W r3 = r5.A00(r3)     // Catch:{ 1Sg -> 0x0701 }
            r12.add(r3)     // Catch:{ 1Sg -> 0x0701 }
            goto L_0x06ed
        L_0x0701:
            r4 = move-exception
            r1.A01(r4, r0)     // Catch:{ all -> 0x0a76 }
            r3 = r23
            r3.add(r4)     // Catch:{ all -> 0x0a76 }
            goto L_0x06ed
        L_0x070b:
            X.3Ek r3 = r1.A06     // Catch:{ 23W -> 0x0a43 }
            r29 = r3
            X.2e1 r11 = new X.2e1     // Catch:{ 23W -> 0x0a43 }
            r11.<init>()     // Catch:{ 23W -> 0x0a43 }
            java.util.Iterator r9 = r12.iterator()     // Catch:{ 23W -> 0x0a43 }
        L_0x0718:
            boolean r3 = r9.hasNext()     // Catch:{ 23W -> 0x0a43 }
            if (r3 == 0) goto L_0x0730
            java.lang.Object r7 = r9.next()     // Catch:{ 23W -> 0x0a43 }
            X.0Wz r4 = r11.A00     // Catch:{ 23W -> 0x0a43 }
            boolean r3 = r4.containsKey(r7)     // Catch:{ 23W -> 0x0a43 }
            if (r3 != 0) goto L_0x0718
            r3 = r28
            r4.put(r7, r3)     // Catch:{ 23W -> 0x0a43 }
            goto L_0x0718
        L_0x0730:
            java.util.Iterator r26 = r12.iterator()     // Catch:{ 23W -> 0x0a43 }
        L_0x0734:
            boolean r3 = r26.hasNext()     // Catch:{ 23W -> 0x0a43 }
            if (r3 == 0) goto L_0x07cc
            X.33W r10 = X.C18320x8.A0K(r26)     // Catch:{ 23W -> 0x0a43 }
            X.8OQ r4 = X.AnonymousClass325.A00     // Catch:{ 23W -> 0x0a43 }
            java.lang.String r3 = r10.A09()     // Catch:{ 23W -> 0x0a43 }
            java.lang.Object r9 = r4.get(r3)     // Catch:{ 23W -> 0x0a43 }
            java.util.List r9 = (java.util.List) r9     // Catch:{ 23W -> 0x0a43 }
            X.8OQ r4 = X.AnonymousClass325.A01     // Catch:{ 23W -> 0x0a43 }
            java.lang.String r3 = r10.A09()     // Catch:{ 23W -> 0x0a43 }
            java.lang.Object r7 = r4.get(r3)     // Catch:{ 23W -> 0x0a43 }
            java.util.List r7 = (java.util.List) r7     // Catch:{ 23W -> 0x0a43 }
            java.util.Iterator r25 = r12.iterator()     // Catch:{ 23W -> 0x0a43 }
        L_0x075a:
            boolean r3 = r25.hasNext()     // Catch:{ 23W -> 0x0a43 }
            if (r3 == 0) goto L_0x0734
            X.33W r13 = X.C18320x8.A0K(r25)     // Catch:{ 23W -> 0x0a43 }
            r24 = 1
            if (r9 == 0) goto L_0x0795
            java.lang.String r3 = r13.A09()     // Catch:{ 23W -> 0x0a43 }
            boolean r3 = r9.contains(r3)     // Catch:{ 23W -> 0x0a43 }
            if (r3 == 0) goto L_0x0795
            android.util.Pair r3 = X.AnonymousClass325.A00(r13)     // Catch:{ 23W -> 0x0a43 }
            java.lang.Object r15 = r3.first     // Catch:{ 23W -> 0x0a43 }
            java.lang.Object r14 = r3.second     // Catch:{ 23W -> 0x0a43 }
            X.2z0 r14 = (X.AnonymousClass2z0) r14     // Catch:{ 23W -> 0x0a43 }
            android.util.Pair r3 = X.AnonymousClass325.A00(r10)     // Catch:{ 23W -> 0x0a43 }
            java.lang.Object r4 = r3.first     // Catch:{ 23W -> 0x0a43 }
            java.lang.Object r3 = r3.second     // Catch:{ 23W -> 0x0a43 }
            boolean r4 = X.AnonymousClass75J.A00(r15, r4)     // Catch:{ 23W -> 0x0a43 }
            if (r4 == 0) goto L_0x0795
            if (r14 == 0) goto L_0x0797
            if (r3 == 0) goto L_0x0797
            boolean r3 = r14.equals(r3)     // Catch:{ 23W -> 0x0a43 }
            if (r3 == 0) goto L_0x0795
            goto L_0x0797
        L_0x0795:
            r4 = 0
            goto L_0x0798
        L_0x0797:
            r4 = 1
        L_0x0798:
            if (r7 == 0) goto L_0x07a5
            java.lang.String r3 = r13.A09()     // Catch:{ 23W -> 0x0a43 }
            boolean r3 = r7.contains(r3)     // Catch:{ 23W -> 0x0a43 }
            if (r3 == 0) goto L_0x07a5
            goto L_0x07a7
        L_0x07a5:
            r24 = 0
        L_0x07a7:
            if (r13 == r10) goto L_0x075a
            if (r4 != 0) goto L_0x07ad
            if (r24 == 0) goto L_0x075a
        L_0x07ad:
            long r14 = r13.A04     // Catch:{ 23W -> 0x0a43 }
            long r3 = r10.A04     // Catch:{ 23W -> 0x0a43 }
            int r24 = (r14 > r3 ? 1 : (r14 == r3 ? 0 : -1))
            if (r24 >= 0) goto L_0x07ba
            boolean r3 = r11.A01(r10, r13)     // Catch:{ 23W -> 0x0a43 }
            goto L_0x07be
        L_0x07ba:
            boolean r3 = r11.A01(r13, r10)     // Catch:{ 23W -> 0x0a43 }
        L_0x07be:
            if (r3 == 0) goto L_0x075a
            r3 = r29
            X.30l r14 = r3.A01     // Catch:{ 23W -> 0x0a43 }
            java.lang.String r13 = "cross_index_conflict_counter"
            r3 = 1
            r14.A06(r13, r3)     // Catch:{ 23W -> 0x0a43 }
            goto L_0x075a
        L_0x07cc:
            java.util.ArrayList r12 = X.AnonymousClass001.A0s()     // Catch:{ 23W -> 0x0a43 }
            java.util.HashSet r10 = X.AnonymousClass002.A0K()     // Catch:{ 23W -> 0x0a43 }
            X.0Wz r9 = r11.A00     // Catch:{ 23W -> 0x0a43 }
            int r7 = r9.size()     // Catch:{ 23W -> 0x0a43 }
            r4 = 0
        L_0x07db:
            if (r4 >= r7) goto L_0x07e9
            java.lang.Object[] r3 = r9.A02     // Catch:{ 23W -> 0x0a43 }
            int r13 = r4 << 1
            r3 = r3[r13]     // Catch:{ 23W -> 0x0a43 }
            r11.A00(r3, r12, r10)     // Catch:{ 23W -> 0x0a43 }
            int r4 = r4 + 1
            goto L_0x07db
        L_0x07e9:
            java.util.Iterator r10 = r12.iterator()     // Catch:{ 23W -> 0x0a43 }
        L_0x07ed:
            boolean r3 = r10.hasNext()     // Catch:{ 23W -> 0x0a43 }
            if (r3 == 0) goto L_0x085f
            X.33W r4 = X.C18320x8.A0K(r10)     // Catch:{ 23W -> 0x0a43 }
            X.2j3 r7 = r5.A04     // Catch:{ 23W -> 0x0a43 }
            if (r4 != 0) goto L_0x07fd
            r9 = 0
            goto L_0x0808
        L_0x07fd:
            java.lang.String r3 = r4.A09()     // Catch:{ 23W -> 0x0a43 }
            X.C162457s7.A0D(r3)     // Catch:{ 23W -> 0x0a43 }
            X.2sc r9 = r7.A00(r3)     // Catch:{ 23W -> 0x0a43 }
        L_0x0808:
            X.C626936e.A06(r9)     // Catch:{ 23W -> 0x0a43 }
            X.34v r7 = r5.A02     // Catch:{ all -> 0x0983 }
            java.lang.String r3 = r4.A08()     // Catch:{ all -> 0x0983 }
            X.33W r3 = r7.A06(r3)     // Catch:{ all -> 0x0983 }
            r9.A0A(r4, r3)     // Catch:{ all -> 0x0983 }
            r5.A01(r4)     // Catch:{ 23W -> 0x0a43 }
            boolean r3 = r4 instanceof X.AnonymousClass1SW     // Catch:{ 23W -> 0x0a43 }
            if (r3 == 0) goto L_0x083b
            X.1SW r4 = (X.AnonymousClass1SW) r4     // Catch:{ 23W -> 0x0a43 }
            boolean r3 = r4.A02     // Catch:{ 23W -> 0x0a43 }
            X.7am r7 = r1.A02     // Catch:{ 23W -> 0x0a43 }
            X.4uZ r4 = r4.A01     // Catch:{ 23W -> 0x0a43 }
            r34 = 3
            r35 = r3 ^ 1
        L_0x082b:
            r32 = r28
            r33 = r28
            r29 = r7
            r30 = r4
            r31 = r28
            r36 = r8
            r29.A02(r30, r31, r32, r33, r34, r35, r36)     // Catch:{ 23W -> 0x0a43 }
            goto L_0x07ed
        L_0x083b:
            boolean r3 = r4 instanceof X.AnonymousClass1SX     // Catch:{ 23W -> 0x0a43 }
            if (r3 == 0) goto L_0x0850
            X.1SX r4 = (X.AnonymousClass1SX) r4     // Catch:{ 23W -> 0x0a43 }
            boolean r3 = r4.A02     // Catch:{ 23W -> 0x0a43 }
            X.7am r7 = r1.A02     // Catch:{ 23W -> 0x0a43 }
            X.4uZ r4 = r4.A01     // Catch:{ 23W -> 0x0a43 }
            r34 = 3
            r35 = 3
            if (r3 == 0) goto L_0x082b
            r35 = 2
            goto L_0x082b
        L_0x0850:
            boolean r3 = r4 instanceof X.AnonymousClass1SU     // Catch:{ 23W -> 0x0a43 }
            if (r3 == 0) goto L_0x07ed
            X.7am r7 = r1.A02     // Catch:{ 23W -> 0x0a43 }
            X.1SU r4 = (X.AnonymousClass1SU) r4     // Catch:{ 23W -> 0x0a43 }
            X.4uZ r4 = r4.A01     // Catch:{ 23W -> 0x0a43 }
            r34 = 3
            r35 = 4
            goto L_0x082b
        L_0x085f:
            java.util.Iterator r23 = r23.iterator()     // Catch:{ all -> 0x0a76 }
        L_0x0863:
            boolean r3 = r23.hasNext()     // Catch:{ all -> 0x0a76 }
            if (r3 == 0) goto L_0x08fe
            java.lang.Object r3 = r23.next()     // Catch:{ all -> 0x0a76 }
            X.1Sg r3 = (X.C23351Sg) r3     // Catch:{ all -> 0x0a76 }
            java.lang.String r4 = "SyncResponseHandler/applyMutations add unsupported mutation"
            com.whatsapp.util.Log.d((java.lang.String) r4)     // Catch:{ all -> 0x0a76 }
            int r10 = r3.reason     // Catch:{ all -> 0x0a76 }
            r4 = 6
            boolean r9 = X.AnonymousClass000.A1U(r4, r10)
            java.lang.StringBuilder r7 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0a76 }
            java.lang.String r4 = "unexpected reason="
            java.lang.String r4 = X.AnonymousClass000.A0Y(r4, r7, r10)     // Catch:{ all -> 0x0a76 }
            X.C626936e.A0F(r9, r4)     // Catch:{ all -> 0x0a76 }
            X.34v r11 = r1.A0H     // Catch:{ all -> 0x0a76 }
            int r10 = r3.version     // Catch:{ all -> 0x0a76 }
            X.2yt r13 = r3.operation     // Catch:{ all -> 0x0a76 }
            java.lang.String r9 = r3.index     // Catch:{ all -> 0x0a76 }
            X.C626936e.A06(r9)     // Catch:{ all -> 0x0a76 }
            byte[] r7 = r3.mutationMac     // Catch:{ all -> 0x0a76 }
            X.33J r4 = r3.syncdKeyId     // Catch:{ all -> 0x0a76 }
            X.C626936e.A06(r4)     // Catch:{ all -> 0x0a76 }
            X.1EO r12 = r3.syncActionValue     // Catch:{ all -> 0x0a76 }
            X.1RE r3 = r11.A01     // Catch:{ all -> 0x0a76 }
            X.4Fq r15 = r3.A0C()     // Catch:{ all -> 0x0a76 }
            X.3Yo r14 = r15.Axl()     // Catch:{ all -> 0x098f }
            X.2yt r3 = X.C60642yt.A02     // Catch:{ all -> 0x0985 }
            if (r13 != r3) goto L_0x08cc
            r3 = r15
            X.3H0 r3 = (X.AnonymousClass3H0) r3     // Catch:{ all -> 0x0985 }
            X.2sg r7 = r3.A03     // Catch:{ all -> 0x0985 }
            java.lang.StringBuilder r10 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0985 }
            java.lang.String r4 = "DELETE FROM syncd_mutations WHERE mutation_index IN "
            r3 = r20
            X.C57212tH.A02(r4, r10, r3)     // Catch:{ all -> 0x0985 }
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x0985 }
            java.lang.String[] r4 = new java.lang.String[r3]     // Catch:{ all -> 0x0985 }
            r4[r8] = r9     // Catch:{ all -> 0x0985 }
            java.lang.String r3 = "SyncdMutationsStore.addUnsupportedMutation"
            r7.A0I(r10, r3, r4)     // Catch:{ all -> 0x0985 }
        L_0x08c8:
            r14.A00()     // Catch:{ all -> 0x0985 }
            goto L_0x08f6
        L_0x08cc:
            X.2yt r3 = X.C60642yt.A03     // Catch:{ all -> 0x0985 }
            if (r13 != r3) goto L_0x08c8
            r3 = r15
            X.3H0 r3 = (X.AnonymousClass3H0) r3     // Catch:{ all -> 0x0985 }
            X.2sg r3 = r3.A03     // Catch:{ all -> 0x0985 }
            X.C626936e.A06(r12)     // Catch:{ all -> 0x0985 }
            byte[] r36 = r12.A0F()     // Catch:{ all -> 0x0985 }
            java.lang.String r35 = X.AnonymousClass35M.A00(r9)     // Catch:{ all -> 0x0985 }
            r29 = r11
            r30 = r3
            r31 = r4
            r32 = r28
            r33 = r9
            r34 = r0
            r37 = r7
            r38 = r10
            r39 = r20
            r29.A0D(r30, r31, r32, r33, r34, r35, r36, r37, r38, r39)     // Catch:{ all -> 0x0985 }
            goto L_0x08c8
        L_0x08f6:
            r14.close()     // Catch:{ all -> 0x098f }
            r15.close()     // Catch:{ all -> 0x0a76 }
            goto L_0x0863
        L_0x08fe:
            if (r27 == 0) goto L_0x01c4
            goto L_0x099b
        L_0x0902:
            r21.close()     // Catch:{ all -> 0x0a80 }
            r22.close()     // Catch:{ 1Sf -> 0x0a8a }
            monitor-exit(r5)     // Catch:{ all -> 0x0acc }
            return r8
        L_0x090a:
            java.lang.String r3 = "SyncEncryptionHelper/validatePatchMac/patch mac mismatch"
            com.whatsapp.util.Log.e((java.lang.String) r3)     // Catch:{ 1Sb | 1Sh -> 0x0916 }
            r3 = 34
            X.1Sf r3 = X.C23341Sf.A00(r0, r3)     // Catch:{ 1Sb | 1Sh -> 0x0916 }
            throw r3     // Catch:{ 1Sb | 1Sh -> 0x0916 }
        L_0x0916:
            r4 = move-exception
            java.lang.String r3 = "SyncEncryptionHelper/validatePatchIntegrity: "
            com.whatsapp.util.Log.e(r3, r4)     // Catch:{ all -> 0x0a76 }
            r3 = 10
            X.1Sf r3 = X.C23341Sf.A00(r0, r3)     // Catch:{ all -> 0x0a76 }
            goto L_0x0a75
        L_0x0924:
            java.lang.String r3 = "SyncEncryptionHelper/validatePatchMac/No snapshot mac"
            com.whatsapp.util.Log.e((java.lang.String) r3)     // Catch:{ all -> 0x0a76 }
            r3 = 47
            X.1Sf r3 = X.C23341Sf.A00(r0, r3)     // Catch:{ all -> 0x0a76 }
            goto L_0x0a75
        L_0x0931:
            java.lang.String r3 = "SyncEncryptionHelper/validatePatchMac/No patch mac"
            com.whatsapp.util.Log.e((java.lang.String) r3)     // Catch:{ all -> 0x0a76 }
            r3 = 48
            X.1Sf r3 = X.C23341Sf.A00(r0, r3)     // Catch:{ all -> 0x0a76 }
            goto L_0x0a75
        L_0x093e:
            r4 = move-exception
            java.lang.String r3 = "SyncResponseHandler/applyMutations"
            com.whatsapp.util.Log.e(r3, r4)     // Catch:{ all -> 0x0a76 }
            r3 = 7
            X.1Sf r3 = X.C23341Sf.A00(r0, r3)     // Catch:{ all -> 0x0a76 }
            goto L_0x0a75
        L_0x094b:
            r4 = move-exception
            java.lang.String r3 = "SyncEncryptionHelper/validateSnapshotMac: "
            com.whatsapp.util.Log.e(r3, r4)     // Catch:{ all -> 0x0a76 }
            r3 = 10
            X.1Sf r3 = X.C23341Sf.A00(r0, r3)     // Catch:{ all -> 0x0a76 }
            goto L_0x0a75
        L_0x0959:
            java.lang.String r3 = "SyncEncryptionHelper/validateSnapshotMac/snapshot mac mismatch"
            com.whatsapp.util.Log.e((java.lang.String) r3)     // Catch:{ 1Sb | 1Sh -> 0x0965 }
            r3 = 61
            X.1Sf r3 = X.C23341Sf.A00(r0, r3)     // Catch:{ 1Sb | 1Sh -> 0x0965 }
            throw r3     // Catch:{ 1Sb | 1Sh -> 0x0965 }
        L_0x0965:
            r4 = move-exception
            java.lang.String r3 = "SyncEncryptionHelper/validateSnapshotMac: "
            com.whatsapp.util.Log.e(r3, r4)     // Catch:{ all -> 0x0a76 }
            r3 = 10
            X.1Sf r3 = X.C23341Sf.A00(r0, r3)     // Catch:{ all -> 0x0a76 }
            goto L_0x0a75
        L_0x0973:
            r3 = move-exception
            r10.close()     // Catch:{ all -> 0x0978 }
            goto L_0x097c
        L_0x0978:
            r0 = move-exception
            r3.addSuppressed(r0)     // Catch:{ all -> 0x097d }
        L_0x097c:
            throw r3     // Catch:{ all -> 0x097d }
        L_0x097d:
            r3 = move-exception
            r11.close()     // Catch:{ all -> 0x0995 }
            goto L_0x0a75
        L_0x0983:
            r3 = move-exception
            throw r3     // Catch:{ 23W -> 0x0a43 }
        L_0x0985:
            r3 = move-exception
            r14.close()     // Catch:{ all -> 0x098a }
            goto L_0x098e
        L_0x098a:
            r0 = move-exception
            r3.addSuppressed(r0)     // Catch:{ all -> 0x098f }
        L_0x098e:
            throw r3     // Catch:{ all -> 0x098f }
        L_0x098f:
            r3 = move-exception
            r15.close()     // Catch:{ all -> 0x0995 }
            goto L_0x0a75
        L_0x0995:
            r0 = move-exception
            r3.addSuppressed(r0)     // Catch:{ all -> 0x0a76 }
            goto L_0x0a75
        L_0x099b:
            r9 = r49
            r7 = r27
            r3 = r16
            r9.A05(r0, r7, r3)     // Catch:{ all -> 0x0a76 }
            r21.A00()     // Catch:{ all -> 0x0a76 }
            if (r57 == 0) goto L_0x0a3b
            X.2ha r9 = r1.A03     // Catch:{ all -> 0x0a76 }
            if (r52 == 0) goto L_0x09ae
            r8 = 1
        L_0x09ae:
            X.1av r10 = new X.1av     // Catch:{ all -> 0x0a76 }
            r10.<init>()     // Catch:{ all -> 0x0a76 }
            r4 = 1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r20)     // Catch:{ all -> 0x0a76 }
            r10.A05 = r3     // Catch:{ all -> 0x0a76 }
            java.util.Set r3 = X.AnonymousClass33W.A09     // Catch:{ all -> 0x0a76 }
            boolean r3 = r3.contains(r0)     // Catch:{ all -> 0x0a76 }
            if (r3 != 0) goto L_0x09c3
            r4 = 2
        L_0x09c3:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0a76 }
            r10.A04 = r3     // Catch:{ all -> 0x0a76 }
            java.lang.String r3 = r9.A00()     // Catch:{ all -> 0x0a76 }
            r10.A0A = r3     // Catch:{ all -> 0x0a76 }
            int r3 = r0.hashCode()     // Catch:{ all -> 0x0a76 }
            switch(r3) {
                case -849492943: goto L_0x09dd;
                case -564602779: goto L_0x09e7;
                case -498584183: goto L_0x09f1;
                case 207170541: goto L_0x09fa;
                case 1086463900: goto L_0x0a03;
                default: goto L_0x09d6;
            }     // Catch:{ all -> 0x0a76 }
        L_0x09d6:
            java.lang.String r0 = "CompanionSyncStatsLogger/convertToWamCollection received undefined collection name"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)     // Catch:{ all -> 0x0a76 }
            throw r0     // Catch:{ all -> 0x0a76 }
        L_0x09dd:
            java.lang.String r3 = "regular_low"
            boolean r0 = r0.equals(r3)     // Catch:{ all -> 0x0a76 }
            if (r0 == 0) goto L_0x09d6
            goto L_0x0a0d
        L_0x09e7:
            java.lang.String r3 = "regular_high"
            boolean r0 = r0.equals(r3)     // Catch:{ all -> 0x0a76 }
            if (r0 == 0) goto L_0x09d6
            goto L_0x0a0f
        L_0x09f1:
            java.lang.String r3 = "critical_unblock_low"
            boolean r0 = r0.equals(r3)     // Catch:{ all -> 0x0a76 }
            if (r0 == 0) goto L_0x09d6
            goto L_0x0a11
        L_0x09fa:
            java.lang.String r3 = "critical_block"
            boolean r0 = r0.equals(r3)     // Catch:{ all -> 0x0a76 }
            if (r0 == 0) goto L_0x09d6
            goto L_0x0a13
        L_0x0a03:
            java.lang.String r3 = "regular"
            boolean r0 = r0.equals(r3)     // Catch:{ all -> 0x0a76 }
            if (r0 == 0) goto L_0x09d6
            goto L_0x0a15
        L_0x0a0d:
            r0 = 2
            goto L_0x0a16
        L_0x0a0f:
            r0 = 3
            goto L_0x0a16
        L_0x0a11:
            r0 = 5
            goto L_0x0a16
        L_0x0a13:
            r0 = 4
            goto L_0x0a16
        L_0x0a15:
            r0 = 1
        L_0x0a16:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0a76 }
            r10.A02 = r0     // Catch:{ all -> 0x0a76 }
            X.2sH r0 = r9.A03     // Catch:{ all -> 0x0a76 }
            long r6 = r0.A0H()     // Catch:{ all -> 0x0a76 }
            java.lang.Long r0 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0a76 }
            r10.A09 = r0     // Catch:{ all -> 0x0a76 }
            r3 = r18
            java.lang.Long r0 = X.C18310x6.A0f(r6, r3)     // Catch:{ all -> 0x0a76 }
            r10.A08 = r0     // Catch:{ all -> 0x0a76 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r8)     // Catch:{ all -> 0x0a76 }
            r10.A01 = r0     // Catch:{ all -> 0x0a76 }
            X.4FV r0 = r9.A06     // Catch:{ all -> 0x0a76 }
            r0.BhD(r10)     // Catch:{ all -> 0x0a76 }
        L_0x0a3b:
            r21.close()     // Catch:{ all -> 0x0a80 }
            r22.close()     // Catch:{ 1Sf -> 0x0a8a }
            monitor-exit(r5)     // Catch:{ all -> 0x0acc }
            return r20
        L_0x0a43:
            r6 = move-exception
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0a76 }
            java.lang.String r3 = "SyncResponseHandler/applyMutations cyclic mutation e="
            X.C18260x0.A1Q(r4, r3, r6)     // Catch:{ all -> 0x0a76 }
            r3 = 39
            X.1Sf r3 = X.C23341Sf.A00(r0, r3)     // Catch:{ all -> 0x0a76 }
            goto L_0x0a75
        L_0x0a54:
            java.lang.StringBuilder r6 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0a76 }
            java.lang.String r4 = "SyncResponseHandler/verifyCollectionVersion fail for incoming patch, currentVersion="
            r6.append(r4)     // Catch:{ all -> 0x0a76 }
            r6.append(r3)     // Catch:{ all -> 0x0a76 }
            java.lang.String r3 = "; newVersion="
            r6.append(r3)     // Catch:{ all -> 0x0a76 }
            r3 = r16
            r6.append(r3)     // Catch:{ all -> 0x0a76 }
            java.lang.String r3 = "; collection="
            X.C18260x0.A0r(r3, r0, r6)     // Catch:{ all -> 0x0a76 }
            r3 = 73
            X.1Sf r3 = X.C23341Sf.A00(r0, r3)     // Catch:{ all -> 0x0a76 }
        L_0x0a75:
            throw r3     // Catch:{ all -> 0x0a76 }
        L_0x0a76:
            r3 = move-exception
            r21.close()     // Catch:{ all -> 0x0a7b }
            goto L_0x0a7f
        L_0x0a7b:
            r0 = move-exception
            r3.addSuppressed(r0)     // Catch:{ all -> 0x0a80 }
        L_0x0a7f:
            throw r3     // Catch:{ all -> 0x0a80 }
        L_0x0a80:
            r3 = move-exception
            r22.close()     // Catch:{ all -> 0x0a85 }
            goto L_0x0a89
        L_0x0a85:
            r0 = move-exception
            r3.addSuppressed(r0)     // Catch:{ 1Sf -> 0x0a8a }
        L_0x0a89:
            throw r3     // Catch:{ 1Sf -> 0x0a8a }
        L_0x0a8a:
            r4 = move-exception
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0acc }
            java.lang.String r0 = "SyncResponseHandler/handleIncomingPatches applyMutations ex="
            X.C18260x0.A1Q(r3, r0, r4)     // Catch:{ all -> 0x0acc }
            if (r51 == 0) goto L_0x0acb
            int r0 = r2.bitField0_     // Catch:{ all -> 0x0acc }
            r0 = r0 & 64
            if (r0 == 0) goto L_0x0acb
            int r3 = r2.deviceIndex_     // Catch:{ all -> 0x0acc }
            X.1iB r0 = r1.A0F     // Catch:{ all -> 0x0acc }
            X.33G r2 = r0.A09(r3)     // Catch:{ all -> 0x0acc }
            if (r2 == 0) goto L_0x0acb
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0acc }
            java.lang.String r0 = "SyncResponseHandler/logCompanionInfo companion: "
            r1.append(r0)     // Catch:{ all -> 0x0acc }
            r1.append(r3)     // Catch:{ all -> 0x0acc }
            java.lang.String r0 = "; ["
            r1.append(r0)     // Catch:{ all -> 0x0acc }
            X.23P r0 = r2.A08     // Catch:{ all -> 0x0acc }
            r1.append(r0)     // Catch:{ all -> 0x0acc }
            r0 = 40
            r1.append(r0)     // Catch:{ all -> 0x0acc }
            java.lang.String r0 = r2.A09     // Catch:{ all -> 0x0acc }
            r1.append(r0)     // Catch:{ all -> 0x0acc }
            java.lang.String r0 = ")]"
            X.C18260x0.A1K(r1, r0)     // Catch:{ all -> 0x0acc }
        L_0x0acb:
            throw r4     // Catch:{ all -> 0x0acc }
        L_0x0acc:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0acc }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass30i.A07(X.1Do, X.1Cr, java.lang.String, java.util.List, long, boolean):boolean");
    }
}
