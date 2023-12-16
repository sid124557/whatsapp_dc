package X;

import androidx.work.impl.WorkDatabase_Impl;
import java.util.List;

/* renamed from: X.0A5  reason: invalid class name */
public class AnonymousClass0A5 extends AnonymousClass0U2 {
    public C04030Mn A00;
    public final AnonymousClass0Y4 A01;

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004c, code lost:
        X.AnonymousClass2A8.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004f, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C17430vW r4) {
        /*
            r3 = 0
            java.util.List r1 = X.C159507lx.A0f()
            java.lang.String r0 = "SELECT name FROM sqlite_master WHERE type = 'trigger'"
            android.database.Cursor r2 = r4.Bi1(r0)
        L_0x000b:
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0049 }
            if (r0 == 0) goto L_0x0019
            java.lang.String r0 = r2.getString(r3)     // Catch:{ all -> 0x0049 }
            r1.add(r0)     // Catch:{ all -> 0x0049 }
            goto L_0x000b
        L_0x0019:
            r0 = 0
            X.AnonymousClass2A8.A00(r2, r0)
            java.util.List r0 = X.C159507lx.A0h(r1)
            java.util.Iterator r3 = r0.iterator()
        L_0x0025:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0048
            java.lang.String r2 = X.AnonymousClass001.A0m(r3)
            X.C162457s7.A0B(r2)
            java.lang.String r0 = "room_fts_content_sync_"
            boolean r0 = X.C175738Zn.A0Y(r2, r0, false)
            if (r0 == 0) goto L_0x0025
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "DROP TRIGGER IF EXISTS "
            java.lang.String r0 = X.AnonymousClass000.A0V(r0, r2, r1)
            r4.B2q(r0)
            goto L_0x0025
        L_0x0048:
            return
        L_0x0049:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x004b }
        L_0x004b:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r2, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0A5.A00(X.0vW):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001d, code lost:
        X.AnonymousClass2A8.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0020, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A01(X.C17430vW r4) {
        /*
            r3 = 0
            java.lang.String r0 = "SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'"
            android.database.Cursor r2 = r4.Bi1(r0)
            boolean r0 = r2.moveToFirst()     // Catch:{ all -> 0x001a }
            r1 = 0
            if (r0 == 0) goto L_0x0015
            int r0 = r2.getInt(r3)     // Catch:{ all -> 0x001a }
            if (r0 == 0) goto L_0x0015
            r1 = 1
        L_0x0015:
            r0 = 0
            X.AnonymousClass2A8.A00(r2, r0)
            return r1
        L_0x001a:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x001c }
        L_0x001c:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r2, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0A5.A01(X.0vW):boolean");
    }

    public void A04(C17430vW r6, int i, int i2) {
        List<AnonymousClass0NF> A002;
        C04030Mn r0 = this.A00;
        if (r0 == null || (A002 = r0.A02.A00(i, i2)) == null) {
            C04030Mn r1 = this.A00;
            if (r1 == null || ((i <= i2 || !r1.A0B) && r1.A0D && !r1.A08.contains(Integer.valueOf(i)))) {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("A migration from ");
                A0o.append(i);
                A0o.append(" to ");
                A0o.append(i2);
                throw AnonymousClass000.A0I(" was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.", A0o);
            }
            AnonymousClass0Y4 r4 = this.A01;
            r6.B2q("DROP TABLE IF EXISTS `Dependency`");
            r6.B2q("DROP TABLE IF EXISTS `WorkSpec`");
            r6.B2q("DROP TABLE IF EXISTS `WorkTag`");
            r6.B2q("DROP TABLE IF EXISTS `SystemIdInfo`");
            r6.B2q("DROP TABLE IF EXISTS `WorkName`");
            r6.B2q("DROP TABLE IF EXISTS `WorkProgress`");
            r6.B2q("DROP TABLE IF EXISTS `Preference`");
            WorkDatabase_Impl workDatabase_Impl = r4.A00;
            List list = workDatabase_Impl.A01;
            if (list != null) {
                int size = list.size();
                for (int i3 = 0; i3 < size; i3++) {
                    workDatabase_Impl.A01.get(i3);
                }
            }
            r4.A09(r6);
            return;
        }
        AnonymousClass0Y4 r2 = this.A01;
        A00(r6);
        for (AnonymousClass0NF A003 : A002) {
            A003.A00(r6);
        }
        AnonymousClass0LE A08 = r2.A08(r6);
        if (A08.A01) {
            r6.B2q("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '");
            A0o2.append("5181942b9ebc31ce68dacb56c16fd79f");
            r6.B2q(AnonymousClass000.A0X("')", A0o2));
            return;
        }
        StringBuilder A0o3 = AnonymousClass001.A0o();
        A0o3.append("Migration didn't properly handle: ");
        throw AnonymousClass000.A0I(A08.A00, A0o3);
    }

    public AnonymousClass0A5(C04030Mn r1, AnonymousClass0Y4 r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004b, code lost:
        X.AnonymousClass2A8.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004e, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A05(X.C17430vW r5) {
        /*
            r4 = this;
            boolean r0 = A01(r5)
            if (r0 == 0) goto L_0x004f
            java.lang.String r1 = "SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"
            X.0ev r0 = new X.0ev
            r0.<init>(r1)
            android.database.Cursor r2 = r5.Bi0(r0)
            boolean r0 = r2.moveToFirst()     // Catch:{ all -> 0x0048 }
            r1 = 0
            if (r0 == 0) goto L_0x001e
            r0 = 0
            java.lang.String r3 = r2.getString(r0)     // Catch:{ all -> 0x0048 }
            goto L_0x001f
        L_0x001e:
            r3 = r1
        L_0x001f:
            X.AnonymousClass2A8.A00(r2, r1)
            java.lang.String r2 = "5181942b9ebc31ce68dacb56c16fd79f"
            boolean r0 = r2.equals(r3)
            if (r0 != 0) goto L_0x0075
            java.lang.String r0 = "ae2044fb577e65ee8bb576ca48a2f06e"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x0075
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = ", found: "
            r1.append(r0)
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0I(r3, r1)
            throw r0
        L_0x0048:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x004a }
        L_0x004a:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r2, r1)
            throw r0
        L_0x004f:
            X.0Y4 r0 = r4.A01
            X.0LE r2 = r0.A08(r5)
            boolean r0 = r2.A01
            if (r0 == 0) goto L_0x0076
            java.lang.String r0 = "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)"
            r5.B2q(r0)
            java.lang.String r2 = "5181942b9ebc31ce68dacb56c16fd79f"
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '"
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = "')"
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)
            r5.B2q(r0)
        L_0x0075:
            return
        L_0x0076:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Pre-packaged database has an invalid schema: "
            r1.append(r0)
            java.lang.String r0 = r2.A00
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0I(r0, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0A5.A05(X.0vW):void");
    }
}
