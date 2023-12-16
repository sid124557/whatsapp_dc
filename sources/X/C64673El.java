package X;

import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.3El  reason: invalid class name and case insensitive filesystem */
public class C64673El implements C84404Cf, C84484Cn {
    public AnonymousClass2ZT A00 = null;
    public final C56972sr A01;
    public final C64743Et A02;
    public final C43532Sm A03;
    public final C64663Ek A04;
    public final C613730l A05;
    public final C56792sZ A06;
    public final C55392qH A07;
    public final C55262q4 A08;
    public final C53632nP A09;
    public final C623934v A0A;
    public final C50962j3 A0B;
    public final Object A0C = AnonymousClass002.A0D();
    public final Set A0D;
    public final Set A0E;

    public synchronized void A02(AnonymousClass2ZT r2) {
        this.A00 = r2;
    }

    public void A03(List list) {
        AnonymousClass2ZT r5;
        C21891Do r4;
        synchronized (this) {
            r5 = this.A00;
        }
        if (r5 != null) {
            synchronized (r5) {
                Iterator it = list.iterator();
                long j = 0;
                while (it.hasNext()) {
                    C42782Pm r42 = (C42782Pm) it.next();
                    if (r42 != null && "critical_unblock_low".equals(r42.A01)) {
                        for (Object obj : r42.A02) {
                            if (obj instanceof AnonymousClass1SN) {
                                j++;
                            }
                        }
                    }
                }
                r5.A00 = j;
                Iterator it2 = list.iterator();
                long j2 = 0;
                while (it2.hasNext()) {
                    C42782Pm r0 = (C42782Pm) it2.next();
                    if (!(r0 == null || (r4 = r0.A00) == null)) {
                        j2 += (long) r4.A0D((C186358vA) null);
                        if ((r4.bitField0_ & 2) != 0) {
                            AnonymousClass1DW r02 = r4.externalMutations_;
                            if (r02 == null) {
                                r02 = AnonymousClass1DW.DEFAULT_INSTANCE;
                            }
                            j2 += r02.fileSizeBytes_;
                        }
                    }
                }
                r5.A01 = j2;
            }
            C18260x0.A1R(AnonymousClass001.A0o(), "SyncdBootstrapManager/syncdRequestPrepared: ", r5);
            int A022 = C18280x3.A02(this.A05.A02(), "syncd_bootstrap_state");
            C64663Ek r3 = this.A04;
            C51442jp r2 = r5.A02;
            int i = 2;
            if (A022 == 1) {
                i = 1;
            }
            r3.A0D(r2, i, true);
        }
    }

    public void BSj(boolean z) {
        AnonymousClass2ZT r3;
        synchronized (this) {
            r3 = this.A00;
        }
        if (r3 != null) {
            int i = this.A05.A02().getInt("syncd_bootstrap_state", 0);
            C18260x0.A0y("SyncdBootstrapManager/criticalBootstrapFailed currentState: ", AnonymousClass001.A0o(), i);
            int i2 = 1;
            if (i != 0) {
                if (i != 1) {
                    i2 = 2;
                    if (i != 2) {
                        if (i != 3) {
                            if (i == 4) {
                                Log.e("SyncdBootstrapManager/criticalBootstrapFailed should never reach here");
                            }
                            A02((AnonymousClass2ZT) null);
                        }
                    }
                }
                this.A04.A0C(r3.A02, i2, 0, 0, false);
                A02((AnonymousClass2ZT) null);
            }
            this.A04.A0D(r3.A02, i2, false);
            A02((AnonymousClass2ZT) null);
        }
    }

    public void A00() {
        int i;
        int i2;
        synchronized (this.A0C) {
            C56972sr r2 = this.A01;
            boolean A0Y = r2.A0Y();
            C18260x0.A1E("SyncdBootstrapManager/bootstrapNewFeatures isCompanion=", AnonymousClass001.A0o(), A0Y);
            if (!A0Y) {
                i = C18280x3.A02(this.A05.A02(), "syncd_bootstrap_state");
                i2 = 4;
            } else {
                i = C18280x3.A02(this.A08.A01(), "companion_syncd_critical_bootstrap_state");
                i2 = 3;
            }
            if (i == i2) {
                C613730l r6 = this.A05;
                if (r6.A03().isEmpty()) {
                    r6.A07(this.A0E);
                }
                Set A032 = r6.A03();
                C50962j3 r7 = this.A0B;
                Set A022 = r7.A02();
                A022.removeAll(A032);
                if (r2.A0Y()) {
                    A022.retainAll(this.A0D);
                }
                if (!A022.isEmpty()) {
                    ArrayList A0s = AnonymousClass001.A0s();
                    Iterator it = A022.iterator();
                    while (it.hasNext()) {
                        C56822sc A002 = r7.A00(AnonymousClass001.A0m(it));
                        if (A002 != null) {
                            A0s.addAll(A002.A05(true));
                            StringBuilder A0o = AnonymousClass001.A0o();
                            C18260x0.A1L(A0o, C18310x6.A0c(A002, "SyncdBootstrapManager/bootstrapNewFeatures adding mutations for ", A0o).getCanonicalName());
                        } else {
                            Log.e("SyncdBootstrapManager/bootstrapNewFeatures handler not found");
                        }
                    }
                    if (!A0s.isEmpty()) {
                        this.A07.A04(A0s);
                    }
                    r6.A07(A022);
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x00ee  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01() {
        /*
            r13 = this;
            X.30l r4 = r13.A05
            android.content.SharedPreferences r0 = r4.A02()
            java.lang.String r3 = "syncd_bootstrap_state"
            int r6 = X.C18280x3.A02(r0, r3)
            r2 = r13
            monitor-enter(r2)
            X.2ZT r0 = r13.A00     // Catch:{ all -> 0x010c }
            monitor-exit(r2)
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "SyncdBootstrapManager/onSyncdSuccess "
            r2.append(r1)
            r2.append(r0)
            java.lang.String r1 = "; bootstrapState: "
            X.C18260x0.A0y(r1, r2, r6)
            r5 = 2
            r7 = 1
            if (r6 == r7) goto L_0x0040
            if (r6 == r5) goto L_0x0068
            r1 = 3
            if (r6 != r1) goto L_0x003f
            java.util.Set r1 = X.AnonymousClass33W.A08
            java.util.HashSet r2 = X.AnonymousClass0x9.A15(r1)
            java.util.Set r1 = X.AnonymousClass33W.A09
            r2.removeAll(r1)
            X.34v r1 = r13.A0A
            boolean r1 = r1.A0K(r2)
            if (r1 != 0) goto L_0x00e4
        L_0x003f:
            return
        L_0x0040:
            X.34v r2 = r13.A0A
            java.util.Set r1 = X.AnonymousClass33W.A09
            boolean r1 = r2.A0K(r1)
            if (r1 == 0) goto L_0x003f
            android.content.SharedPreferences$Editor r1 = X.C613730l.A00(r4)
            X.C18270x1.A0h(r1, r3, r5)
            X.2nP r1 = r13.A09
            r1.A02(r7)
            if (r0 == 0) goto L_0x0068
            X.3Ek r5 = r13.A04
            X.2jp r6 = r0.A02
            monitor-enter(r0)
            long r8 = r0.A00     // Catch:{ all -> 0x00f5 }
            monitor-exit(r0)
            monitor-enter(r0)
            long r10 = r0.A01     // Catch:{ all -> 0x00f5 }
            monitor-exit(r0)
            r12 = r7
            r5.A0C(r6, r7, r8, r10, r12)
        L_0x0068:
            java.lang.String r1 = "SyncdBootstrapManager/prepareAppStateSyncNonCriticalBootstrap"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            java.util.HashSet r8 = X.AnonymousClass002.A0K()
            java.util.ArrayList r6 = X.AnonymousClass001.A0s()
            java.util.Set r1 = X.AnonymousClass33W.A08
            java.util.HashSet r9 = X.AnonymousClass0x9.A15(r1)
            java.util.Set r1 = X.AnonymousClass33W.A09
            r9.removeAll(r1)
            X.2j3 r7 = r13.A0B
            java.util.Set r1 = r7.A02()
            java.util.Iterator r11 = r1.iterator()
        L_0x008a:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L_0x00c7
            java.lang.String r5 = X.AnonymousClass001.A0m(r11)
            X.2sc r10 = r7.A00(r5)
            if (r10 != 0) goto L_0x00a0
            java.lang.String r1 = "SyncdBootstrapManager/prepareAppStateSyncNonCriticalBootstrap handler not found"
            com.whatsapp.util.Log.e((java.lang.String) r1)
            goto L_0x008a
        L_0x00a0:
            java.lang.String r1 = r10.A03()
            boolean r1 = r9.contains(r1)
            if (r1 == 0) goto L_0x008a
            r1 = 0
            java.util.List r1 = r10.A05(r1)
            r6.addAll(r1)
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "SyncdBootstrapManager/prepareAppStateSyncNonCriticalBootstrap adding mutations for "
            java.lang.Class r1 = X.C18310x6.A0c(r10, r1, r2)
            java.lang.String r1 = r1.getCanonicalName()
            X.C18260x0.A1L(r2, r1)
            r8.add(r5)
            goto L_0x008a
        L_0x00c7:
            X.2qH r1 = r13.A07
            r1.A04(r6)
            r4.A07(r8)
            r2 = 3
            android.content.SharedPreferences$Editor r1 = X.C613730l.A00(r4)
            X.C18270x1.A0h(r1, r3, r2)
            boolean r1 = r6.isEmpty()
            if (r1 == 0) goto L_0x003f
            java.util.List r1 = java.util.Collections.emptyList()
            r13.A03(r1)
        L_0x00e4:
            r2 = 4
            android.content.SharedPreferences$Editor r1 = X.C613730l.A00(r4)
            X.C18270x1.A0h(r1, r3, r2)
            if (r0 == 0) goto L_0x0107
            X.3Ek r1 = r13.A04
            X.2jp r2 = r0.A02
            r8 = 1
            monitor-enter(r0)
            goto L_0x00f8
        L_0x00f5:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x00f8:
            long r4 = r0.A00     // Catch:{ all -> 0x00ff }
            monitor-exit(r0)
            monitor-enter(r0)
            long r6 = r0.A01     // Catch:{ all -> 0x00ff }
            goto L_0x0102
        L_0x00ff:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x0102:
            monitor-exit(r0)
            r3 = 2
            r1.A0C(r2, r3, r4, r6, r8)
        L_0x0107:
            r0 = 0
            r13.A02(r0)
            return
        L_0x010c:
            r1 = move-exception
            monitor-exit(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64673El.A01():void");
    }

    public void Bds() {
        Log.i("SyncdBootstrapManager/onSyncdFailed");
        this.A09.A02(false);
    }

    public C64673El(C56972sr r2, C64743Et r3, C43532Sm r4, C64663Ek r5, C613730l r6, C56792sZ r7, C55392qH r8, C55262q4 r9, C53632nP r10, C623934v r11, C50962j3 r12, Set set, Set set2) {
        this.A01 = r2;
        this.A06 = r7;
        this.A07 = r8;
        this.A0B = r12;
        this.A04 = r5;
        this.A02 = r3;
        this.A0A = r11;
        this.A05 = r6;
        this.A09 = r10;
        this.A08 = r9;
        this.A0E = set;
        this.A0D = set2;
        this.A03 = r4;
    }

    public void Bdt() {
        A01();
    }

    public void onSuccess() {
    }
}
