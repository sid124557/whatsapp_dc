package X;

import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.2qM  reason: invalid class name and case insensitive filesystem */
public abstract class C55442qM {
    public final AnonymousClass08M A00 = C18330xA.A01(C18290x4.A0Z());
    public final C55682qk A01;
    public final C56982ss A02;
    public final C72303dV A03;
    public final AnonymousClass30D A04;
    public final C48602fA A05;

    public void A00() {
        if (!(this instanceof AnonymousClass1RV)) {
            AnonymousClass1RW r1 = (AnonymousClass1RW) this;
            C72303dV r0 = r1.A03;
            r0.A05();
            r0.A06.unlock();
            C183538qC r02 = r1.A00;
            if (r02 != null) {
                ((C66423Lj) r02.get()).A03(true);
            }
        }
    }

    public void A01(Set set, boolean z) {
        boolean z2;
        AnonymousClass08M r1;
        int i;
        C48602fA r7 = this.A05;
        AnonymousClass31D A022 = r7.A02("migration_jid_store");
        if (A022 == null || A022.A0M()) {
            z2 = true;
        } else {
            Log.e("BaseForceMigrationManager/afterForcedMigration, failed to migrate jidStore");
            z2 = false;
        }
        AnonymousClass31D A023 = r7.A02("migration_chat_store");
        if (A023 != null && !A023.A0M()) {
            Log.e("BaseForceMigrationManager/afterForcedMigration, failed to migrate chatStore");
            z2 = false;
        }
        Iterator it = set.iterator();
        boolean z3 = false;
        while (it.hasNext()) {
            String A0m = AnonymousClass001.A0m(it);
            AnonymousClass31D A024 = r7.A02(A0m);
            if (A024 != null && !A024.A0M()) {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("BaseForceMigrationManager/afterForcedMigration, failed to migrate ");
                A0o.append(A0m);
                Log.e(AnonymousClass000.A0b(", blocking = ", A0o, z));
                if (z3 || A024.A0K()) {
                    z2 = false;
                } else {
                    z2 = false;
                    z3 = true;
                }
            }
        }
        StringBuilder A0o2 = AnonymousClass001.A0o();
        if (z2) {
            C18260x0.A1E("BaseForceMigrationManager/afterForcedMigration, successfully migrated all forced migration, blocking = ", A0o2, z);
            r1 = this.A00;
            i = 5;
        } else {
            C18260x0.A1E("BaseForceMigrationManager/afterForcedMigration, failed to migrate all forced migration. blocking = ", A0o2, z);
            this.A01.A0A("ForcedDatabaseMigrationManager/failedToMigrate", true, "failedToMigrate");
            r1 = this.A00;
            if (!z) {
                i = 2;
            } else {
                i = 4;
                if (z3) {
                    i = 3;
                }
            }
        }
        C06270Wx.A04(r1, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0071, code lost:
        r1 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0074, code lost:
        if ((r6 instanceof X.AnonymousClass1RV) != false) goto L_0x008f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0076, code lost:
        r1 = (X.AnonymousClass1RW) r1;
        r0 = r1.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x007a, code lost:
        if (r0 == null) goto L_0x0085;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x007c, code lost:
        ((X.C66423Lj) r0.get()).A03(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0085, code lost:
        r0 = r1.A03;
        r0.A05();
        r0.A06.lock();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        r6.A02.A0G();
        X.C18260x0.A1E("BaseForceMigrationManager/processMigrations, running forced migrations. blocking = ", X.AnonymousClass001.A0o(), r7);
        r2 = new X.C44342Vr(new X.C84414Cg[0]);
        r1 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a5, code lost:
        if (r7 == false) goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a7, code lost:
        r1 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a8, code lost:
        r4.A06(r2, r3, 7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00b2, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00b3, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00b4, code lost:
        A01(r3, r7);
        A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00ba, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(boolean r7) {
        /*
            r6 = this;
            X.3dV r0 = r6.A03
            boolean r0 = X.C72303dV.A00(r0)
            r2 = 0
            if (r0 == 0) goto L_0x00be
            java.util.HashSet r3 = X.AnonymousClass002.A0K()
            X.2fA r0 = r6.A05
            X.8OQ r0 = r0.A01()
            X.8Sy r0 = r0.values()
            X.8Nf r5 = r0.iterator()
        L_0x001b:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0049
            java.lang.Object r4 = r5.next()
            X.31D r4 = (X.AnonymousClass31D) r4
            boolean r0 = r6 instanceof X.AnonymousClass1RV
            if (r0 == 0) goto L_0x0044
            boolean r0 = r4.A0N()
        L_0x002f:
            if (r0 == 0) goto L_0x001b
            int r1 = r4.A09()
            r0 = 3
            if (r1 != r0) goto L_0x001b
            boolean r0 = r4.A0M()
            if (r0 != 0) goto L_0x001b
            java.lang.String r0 = r4.A0C
            r3.add(r0)
            goto L_0x001b
        L_0x0044:
            boolean r0 = r4.A0O()
            goto L_0x002f
        L_0x0049:
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x00be
            X.30D r4 = r6.A04
            java.util.concurrent.atomic.AtomicBoolean r0 = r4.A0E
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x00be
            monitor-enter(r6)
            X.08M r5 = r6.A00     // Catch:{ all -> 0x00bb }
            java.lang.Object r0 = r5.A07()     // Catch:{ all -> 0x00bb }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x00bb }
            r1 = 1
            if (r0 == 0) goto L_0x006d
            int r0 = r0.intValue()     // Catch:{ all -> 0x00bb }
            if (r0 == 0) goto L_0x006d
            monitor-exit(r6)     // Catch:{ all -> 0x00bb }
            return
        L_0x006d:
            X.C06270Wx.A04(r5, r1)     // Catch:{ all -> 0x00bb }
            monitor-exit(r6)     // Catch:{ all -> 0x00bb }
            r1 = r6
            boolean r0 = r6 instanceof X.AnonymousClass1RV
            if (r0 != 0) goto L_0x008f
            X.1RW r1 = (X.AnonymousClass1RW) r1
            X.8qC r0 = r1.A00
            if (r0 == 0) goto L_0x0085
            java.lang.Object r0 = r0.get()
            X.3Lj r0 = (X.C66423Lj) r0
            r0.A03(r2)
        L_0x0085:
            X.3dV r0 = r1.A03
            r0.A05()
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r0.A06
            r0.lock()
        L_0x008f:
            X.2ss r0 = r6.A02     // Catch:{ all -> 0x00b3 }
            r0.A0G()     // Catch:{ all -> 0x00b3 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x00b3 }
            java.lang.String r0 = "BaseForceMigrationManager/processMigrations, running forced migrations. blocking = "
            X.C18260x0.A1E(r0, r1, r7)     // Catch:{ all -> 0x00b3 }
            X.4Cg[] r0 = new X.C84414Cg[r2]     // Catch:{ all -> 0x00b3 }
            X.2Vr r2 = new X.2Vr     // Catch:{ all -> 0x00b3 }
            r2.<init>(r0)     // Catch:{ all -> 0x00b3 }
            r1 = 2
            if (r7 == 0) goto L_0x00a8
            r1 = 3
        L_0x00a8:
            r0 = 7
            r4.A06(r2, r3, r0, r1)     // Catch:{ all -> 0x00b3 }
            r6.A01(r3, r7)
            r6.A00()
            return
        L_0x00b3:
            r0 = move-exception
            r6.A01(r3, r7)
            r6.A00()
            throw r0
        L_0x00bb:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x00bb }
            throw r0
        L_0x00be:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55442qM.A02(boolean):void");
    }

    public C55442qM(C55682qk r2, C56982ss r3, C72303dV r4, AnonymousClass30D r5, C48602fA r6) {
        this.A01 = r2;
        this.A02 = r3;
        this.A05 = r6;
        this.A03 = r4;
        this.A04 = r5;
    }
}
