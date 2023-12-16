package X;

import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.os.Environment;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.35r  reason: invalid class name and case insensitive filesystem */
public class C625835r {
    public int A00 = 3;
    public File A01;
    public File A02;
    public final AnonymousClass08M A03;
    public final C29171iO A04;
    public final C55682qk A05;
    public final C69263Wi A06;
    public final C56972sr A07;
    public final AnonymousClass0WN A08;
    public final C47372d9 A09;
    public final C29401il A0A;
    public final AnonymousClass310 A0B;
    public final C56512s6 A0C;
    public final C56612sH A0D;
    public final C54292oU A0E;
    public final AnonymousClass5ZR A0F;
    public final AnonymousClass33p A0G;
    public final C61072zf A0H;
    public final C48502f0 A0I;
    public final C56762sW A0J;
    public final AnonymousClass30G A0K;
    public final C55062pj A0L;
    public final C66533Lu A0M;
    public final AnonymousClass319 A0N;
    public final AnonymousClass2W1 A0O;
    public final C28761hj A0P;
    public final C55272q5 A0Q;
    public final C72303dV A0R;
    public final C47322d4 A0S;
    public final C49002fp A0T;
    public final AnonymousClass30D A0U;
    public final C48602fA A0V;
    public final C60972zT A0W;
    public final C45932ao A0X;
    public final AnonymousClass1VW A0Y;
    public final AnonymousClass1VX A0Z;
    public final AnonymousClass4FV A0a;
    public final C48092eK A0b;
    public final C59302wh A0c;
    public final C60152y5 A0d;
    public final C618232j A0e;
    public final C619632y A0f;
    public final C48772fR A0g;
    public final C622634i A0h;
    public final C49262gF A0i;
    public final AnonymousClass4FS A0j;
    public final C34441vA A0k;
    public final C183538qC A0l;
    public final C183538qC A0m;
    public final C183538qC A0n;
    public final Object A0o = AnonymousClass002.A0D();
    public final Set A0p = AnonymousClass002.A0K();

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002e, code lost:
        if (r2 != null) goto L_0x0030;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A00(java.io.File r6) {
        /*
            r5 = -1
            java.lang.String r1 = r6.getAbsolutePath()     // Catch:{ Exception -> 0x0076 }
            r0 = 536870928(0x20000010, float:1.0842042E-19)
            r4 = 0
            android.database.sqlite.SQLiteDatabase r3 = android.database.sqlite.SQLiteDatabase.openDatabase(r1, r4, r0)     // Catch:{ Exception -> 0x0076 }
            java.lang.String r1 = "table"
            java.lang.String r0 = "messages"
            java.lang.String[] r1 = new java.lang.String[]{r1, r0}     // Catch:{ all -> 0x006a }
            java.lang.String r0 = "SELECT sql FROM sqlite_master WHERE type = ? AND name = ?"
            android.database.Cursor r2 = r3.rawQuery(r0, r1)     // Catch:{ all -> 0x006a }
            if (r2 == 0) goto L_0x002d
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x005c }
            if (r0 == 0) goto L_0x002d
            java.lang.String r0 = "sql"
            java.lang.String r0 = X.AnonymousClass0x2.A0Z(r2, r0)     // Catch:{ all -> 0x005c }
            goto L_0x0030
        L_0x002d:
            r0 = r4
            if (r2 == 0) goto L_0x0033
        L_0x0030:
            r2.close()     // Catch:{ all -> 0x006a }
        L_0x0033:
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x006a }
            if (r0 != 0) goto L_0x0042
            java.lang.String r0 = "SELECT COUNT(*) as count FROM messages"
        L_0x003b:
            android.database.Cursor r2 = r3.rawQuery(r0, r4)     // Catch:{ all -> 0x006a }
            if (r2 == 0) goto L_0x0066
            goto L_0x0045
        L_0x0042:
            java.lang.String r0 = "SELECT COUNT(*) as count FROM message"
            goto L_0x003b
        L_0x0045:
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x005c }
            if (r0 == 0) goto L_0x0058
            int r0 = X.AnonymousClass0x2.A03(r2)     // Catch:{ all -> 0x005c }
            int r0 = r0 + -1
            r2.close()     // Catch:{ all -> 0x006a }
            r3.close()     // Catch:{ Exception -> 0x0076 }
            return r0
        L_0x0058:
            r2.close()     // Catch:{ all -> 0x006a }
            goto L_0x0066
        L_0x005c:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x0061 }
            goto L_0x0065
        L_0x0061:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x006a }
        L_0x0065:
            throw r1     // Catch:{ all -> 0x006a }
        L_0x0066:
            r3.close()     // Catch:{ Exception -> 0x0076 }
            return r5
        L_0x006a:
            r1 = move-exception
            if (r3 == 0) goto L_0x0075
            r3.close()     // Catch:{ all -> 0x0071 }
            goto L_0x0075
        L_0x0071:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ Exception -> 0x0076 }
        L_0x0075:
            throw r1     // Catch:{ Exception -> 0x0076 }
        L_0x0076:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "msgstore/getMessageCountInDb error while trying to retrieve messages count in "
            X.AnonymousClass000.A10(r6, r0, r1)
            X.C18280x3.A1C(r1, r2)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C625835r.A00(java.io.File):int");
    }

    public static long A01(AnonymousClass33M r8) {
        long A072 = r8.A07();
        String.format(Locale.ENGLISH, "MessageStoreBackup backupDatabase time spent: %.2f seconds", new Object[]{Float.valueOf(((float) A072) / 1000.0f)});
        return A072;
    }

    public static void A04(C25981bO r2, AbstractCollection abstractCollection) {
        r2.A0A = 2;
        r2.A0H = Long.valueOf((long) abstractCollection.size());
    }

    public static void A05(AnonymousClass33M r8) {
        String.format(Locale.ENGLISH, "MessageStoreBackup createIncrementalBackup time spent: %.2f seconds", new Object[]{Float.valueOf(((float) r8.A07()) / 1000.0f)});
    }

    public ArrayList A0Q() {
        AnonymousClass22O[] A042 = AnonymousClass22O.A04(AnonymousClass22O.A01(), AnonymousClass22O.A00());
        ArrayList A0s = AnonymousClass001.A0s();
        int i = 0;
        while (true) {
            int length = A042.length;
            if (i < length) {
                A0s.addAll(A0T(A042[(length - i) - 1], 3, false));
                i++;
            } else {
                Collections.sort(A0s, new C13450nC());
                return A0s;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0047, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0048, code lost:
        com.whatsapp.util.Log.i("MessageStoreBackup/lastbackupfileencrypted", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004d, code lost:
        return false;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0a() {
        /*
            r6 = this;
            r5 = 0
            X.1VW r0 = r6.A0Y     // Catch:{ IOException -> 0x0047 }
            boolean r0 = X.AnonymousClass0S8.A00(r0)     // Catch:{ IOException -> 0x0047 }
            r4 = 1
            if (r0 == 0) goto L_0x001f
            java.util.ArrayList r1 = r6.A0Q()     // Catch:{ IOException -> 0x0047 }
            boolean r0 = r1.isEmpty()     // Catch:{ IOException -> 0x0047 }
            if (r0 != 0) goto L_0x0046
            int r0 = X.AnonymousClass0x9.A03(r1, r4)     // Catch:{ IOException -> 0x0047 }
            java.lang.Object r3 = r1.get(r0)     // Catch:{ IOException -> 0x0047 }
            java.io.File r3 = (java.io.File) r3     // Catch:{ IOException -> 0x0047 }
            goto L_0x0023
        L_0x001f:
            java.io.File r3 = r6.A0K()     // Catch:{ IOException -> 0x0047 }
        L_0x0023:
            if (r3 == 0) goto L_0x0046
            java.lang.Class<X.22O> r2 = X.AnonymousClass22O.class
            monitor-enter(r2)     // Catch:{ IOException -> 0x0047 }
            X.22O[] r1 = new X.AnonymousClass22O[r4]     // Catch:{ all -> 0x0042 }
            X.22O r0 = X.AnonymousClass22O.CRYPT15     // Catch:{ all -> 0x0042 }
            r1[r5] = r0     // Catch:{ all -> 0x0042 }
            monitor-exit(r2)     // Catch:{ IOException -> 0x0047 }
            java.util.List r1 = java.util.Arrays.asList(r1)     // Catch:{ IOException -> 0x0047 }
            java.lang.String r0 = r3.getName()     // Catch:{ IOException -> 0x0047 }
            X.22O r0 = X.C57202tG.A00(r0)     // Catch:{ IOException -> 0x0047 }
            boolean r0 = r1.contains(r0)     // Catch:{ IOException -> 0x0047 }
            if (r0 == 0) goto L_0x0046
            goto L_0x0045
        L_0x0042:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ IOException -> 0x0047 }
            throw r0     // Catch:{ IOException -> 0x0047 }
        L_0x0045:
            r5 = 1
        L_0x0046:
            return r5
        L_0x0047:
            r1 = move-exception
            java.lang.String r0 = "MessageStoreBackup/lastbackupfileencrypted"
            com.whatsapp.util.Log.i(r0, r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C625835r.A0a():boolean");
    }

    public boolean A0b(File file, String str) {
        String str2 = str;
        if (str != null) {
            File file2 = file;
            AnonymousClass22O A002 = C57202tG.A00(file2.getName());
            if (A002 != null) {
                try {
                    C622634i r12 = this.A0h;
                    C56972sr r4 = this.A07;
                    C48502f0 r8 = this.A0I;
                    AnonymousClass0WN r6 = this.A08;
                    C56512s6 r7 = this.A0C;
                    C48772fR r10 = this.A0g;
                    if (!AnonymousClass0S7.A00(r4, (C06430Xr) this.A0l.get(), r6, r7, r8, this.A0b, r10, A002, r12, file2, (Boolean) null).A09(str2)) {
                        return false;
                    }
                } catch (IOException e) {
                    Log.e("MessageStoreBackup/has-jid-mismatch/failed to read backup footer", e);
                    return false;
                }
            }
        }
        return true;
    }

    public static void A03(C625835r r2, File file) {
        if (!file.exists()) {
            Log.i("MessageStoreBackup/integritycheck/corrupt-db-was-deleted/restore-from-backup-copy");
            r2.A0V();
            return;
        }
        C627536m.A0O(r2.A0M());
    }

    public static boolean A08(File file) {
        SQLiteDatabase openDatabase;
        AnonymousClass33M A012 = AnonymousClass33M.A01("MessageStoreIntegrityChecker/isDatabaseIntegrityOk");
        try {
            if (file.exists()) {
                openDatabase = SQLiteDatabase.openDatabase(file.getAbsolutePath(), (SQLiteDatabase.CursorFactory) null, 536870928);
                String stringForQuery = DatabaseUtils.stringForQuery(openDatabase, "PRAGMA integrity_check", (String[]) null);
                C18260x0.A0s("msgstore/fieldstat/isdatabaseintegrityok ", stringForQuery, AnonymousClass001.A0o());
                boolean equalsIgnoreCase = "ok".equalsIgnoreCase(stringForQuery);
                if (openDatabase != null) {
                    openDatabase.close();
                }
                A012.A07();
                return equalsIgnoreCase;
            }
        } catch (Exception e) {
            try {
                Log.e("msgstore/fieldstat/isdatabaseintegrityok/error ", e);
            } catch (Throwable th) {
                A012.A07();
                throw th;
            }
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        A012.A07();
        return false;
        throw th;
    }

    public int A0A() {
        C72303dV r0 = this.A0R;
        r0.A05();
        long length = r0.A05.length();
        long A022 = this.A0H.A02();
        if (A022 > 7 * length) {
            return 7;
        }
        int max = Math.max((int) (A022 / length), 2);
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("MessageStoreBackup/backup/backupexpirationInDays not enough space to store full backup history, saving backups only for ");
        A0o2.append(max);
        C18260x0.A1L(A0o2, " days");
        return max;
    }

    public long A0D() {
        File file;
        try {
            if (AnonymousClass0S8.A00(this.A0Y)) {
                ArrayList A0Q2 = A0Q();
                if (A0Q2.isEmpty()) {
                    return 0;
                }
                file = (File) A0Q2.get(A0Q2.size() - 1);
            } else {
                file = A0K();
            }
            if (file != null) {
                return file.lastModified();
            }
            return 0;
        } catch (IOException e) {
            Log.i("MessageStoreBackup/lastbackupfiletime", e);
            return 0;
        }
    }

    public long A0E() {
        long j = 0;
        try {
            if (AnonymousClass0S8.A00(this.A0Y)) {
                Iterator it = A0R().iterator();
                while (it.hasNext()) {
                    j += AnonymousClass0x9.A0f(it).length();
                }
            } else {
                File A0K2 = A0K();
                if (A0K2 != null) {
                    return A0K2.length();
                }
            }
        } catch (IOException e) {
            Log.e("MessageStoreBackup/getLastBackupSize failed to get size of the last backups", e);
        }
        return j;
    }

    public C06430Xr A0F() {
        return (C06430Xr) this.A0l.get();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x007c, code lost:
        r1 = (X.C30471mV) r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00d0, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00dd, code lost:
        r3.A05();
        r2.unlock();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00e3, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C59852xb A0G(X.C837349o r11, boolean r12) {
        /*
            r10 = this;
            X.3dV r3 = r10.A0R
            r3.A05()
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r2 = r3.A06
            r2.lock()
            java.lang.String r0 = "MessageStoreBackup/initializeWithExistingMsgStore"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x00e7 }
            monitor-enter(r10)     // Catch:{ all -> 0x00e7 }
            boolean r0 = X.C72303dV.A00(r3)     // Catch:{ all -> 0x00e4 }
            if (r0 != 0) goto L_0x00d1
            X.2xb r5 = r11.Bk7()     // Catch:{ all -> 0x00e4 }
            int r0 = r5.A00     // Catch:{ all -> 0x00e4 }
            r6 = 1
            boolean r1 = X.AnonymousClass000.A1U(r0, r6)
            r3.A05()     // Catch:{ SQLiteException -> 0x00a4 }
            X.0xz r0 = r3.A04     // Catch:{ SQLiteException -> 0x00a4 }
            r0.BEc()     // Catch:{ SQLiteException -> 0x00a4 }
            if (r1 == 0) goto L_0x00a4
            r3.A05()     // Catch:{ all -> 0x00e4 }
            r3.A09 = r6     // Catch:{ all -> 0x00e4 }
            X.2sW r0 = r10.A0J     // Catch:{ all -> 0x00e4 }
            X.3dV r0 = r0.A0G     // Catch:{ all -> 0x00e4 }
            boolean r0 = X.C72303dV.A00(r0)     // Catch:{ all -> 0x00e4 }
            if (r0 != 0) goto L_0x0048
            java.lang.String r0 = "CallsMessageStore/convertCallLogToV2/database is not ready"
        L_0x003c:
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x00e4 }
            X.319 r7 = r10.A0N     // Catch:{ all -> 0x00e4 }
            X.3dV r0 = r7.A0A     // Catch:{ all -> 0x00e4 }
            X.4Fq r9 = r0.A04()     // Catch:{ all -> 0x00e4 }
            goto L_0x004b
        L_0x0048:
            java.lang.String r0 = "CallsMessageStore/convertCallLogToV2/no need to migrate, migration completed."
            goto L_0x003c
        L_0x004b:
            X.1VX r1 = r7.A0C     // Catch:{ all -> 0x009a }
            java.lang.String r0 = "ViewOnceMessageStore/getUnopenedViewOnceMessages"
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ all -> 0x009a }
            r0 = r9
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x009a }
            X.2sg r8 = r0.A03     // Catch:{ all -> 0x009a }
            boolean r0 = X.C56952sp.A0H(r1)     // Catch:{ all -> 0x009a }
            if (r0 == 0) goto L_0x0069
            java.lang.String r4 = X.AnonymousClass2CA.A03     // Catch:{ all -> 0x009a }
        L_0x005f:
            r0 = 0
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x009a }
            java.lang.String r0 = "GET_UNOPENED_VIEW_ONCE_MESSAGES_SQL"
            android.database.Cursor r4 = r8.A0E(r4, r0, r1)     // Catch:{ all -> 0x009a }
            goto L_0x006c
        L_0x0069:
            java.lang.String r4 = X.AnonymousClass2CA.A02     // Catch:{ all -> 0x009a }
            goto L_0x005f
        L_0x006c:
            boolean r0 = r4.moveToNext()     // Catch:{ all -> 0x008e }
            if (r0 == 0) goto L_0x008a
            X.2qz r0 = r7.A0F     // Catch:{ all -> 0x008e }
            X.34x r1 = r0.A03(r4)     // Catch:{ all -> 0x008e }
            boolean r0 = r1 instanceof X.C30471mV     // Catch:{ all -> 0x008e }
            if (r0 == 0) goto L_0x006c
            X.1mV r1 = (X.C30471mV) r1     // Catch:{ all -> 0x008e }
            X.33C r0 = r1.A01     // Catch:{ all -> 0x008e }
            if (r0 == 0) goto L_0x006c
            r0.A0Z = r6     // Catch:{ all -> 0x008e }
            X.30m r0 = r7.A06     // Catch:{ all -> 0x008e }
            r0.A06(r1)     // Catch:{ all -> 0x008e }
            goto L_0x006c
        L_0x008a:
            r4.close()     // Catch:{ all -> 0x009a }
            goto L_0x00c1
        L_0x008e:
            r1 = move-exception
            if (r4 == 0) goto L_0x0099
            r4.close()     // Catch:{ all -> 0x0095 }
            goto L_0x0099
        L_0x0095:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x009a }
        L_0x0099:
            throw r1     // Catch:{ all -> 0x009a }
        L_0x009a:
            r1 = move-exception
            r9.close()     // Catch:{ all -> 0x009f }
            goto L_0x00a3
        L_0x009f:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x00e4 }
        L_0x00a3:
            throw r1     // Catch:{ all -> 0x00e4 }
        L_0x00a4:
            if (r12 == 0) goto L_0x00c9
            java.lang.String r0 = "MessageStoreBackup/initializeWithExistingMsgStore/re-creating db"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x00e4 }
            X.2q5 r0 = r10.A0Q     // Catch:{ all -> 0x00e4 }
            X.3dV r0 = r0.A02     // Catch:{ all -> 0x00e4 }
            r0.A05()     // Catch:{ all -> 0x00e4 }
            r0.A07()     // Catch:{ all -> 0x00e4 }
            java.lang.String r0 = "MessageStoreBackup/initializeWithExistingMsgStore/db recreated"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x00e4 }
            r0 = 2
            X.2xb r1 = new X.2xb     // Catch:{ all -> 0x00e4 }
            r1.<init>(r0)     // Catch:{ all -> 0x00e4 }
            goto L_0x00dc
        L_0x00c1:
            r9.close()     // Catch:{ all -> 0x00e4 }
            X.32j r0 = r10.A0e     // Catch:{ all -> 0x00e4 }
            r0.A02()     // Catch:{ all -> 0x00e4 }
        L_0x00c9:
            monitor-exit(r10)     // Catch:{ all -> 0x00e4 }
            r3.A05()
            r2.unlock()
            return r5
        L_0x00d1:
            java.lang.String r0 = "MessageStoreBackup/initializeWithExistingMsgStore/restoring-from-backup/6"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x00e4 }
            r0 = 6
            X.2xb r1 = new X.2xb     // Catch:{ all -> 0x00e4 }
            r1.<init>(r0)     // Catch:{ all -> 0x00e4 }
        L_0x00dc:
            monitor-exit(r10)     // Catch:{ all -> 0x00e4 }
            r3.A05()
            r2.unlock()
            return r1
        L_0x00e4:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x00e4 }
            throw r0     // Catch:{ all -> 0x00e7 }
        L_0x00e7:
            r0 = move-exception
            r3.A05()
            r2.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C625835r.A0G(X.49o, boolean):X.2xb");
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x02bb, code lost:
        if ((r3.getCause() instanceof javax.crypto.AEADBadTagException) != false) goto L_0x02bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:411:0x0a6e, code lost:
        if (r0 == 2) goto L_0x0a9e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:413:0x0a71, code lost:
        if (r0 == 4) goto L_0x0a8b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:415:0x0a74, code lost:
        if (r0 != 5) goto L_0x0a7c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:418:?, code lost:
        r6.A0L = "Increment Backup prefix is null";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:420:0x0a8a, code lost:
        throw X.AnonymousClass001.A0e(X.AnonymousClass000.A0Y("Unexpected integrity check result ", X.AnonymousClass001.A0o(), r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:421:0x0a8b, code lost:
        r6.A03 = java.lang.Boolean.TRUE;
        r6.A02 = java.lang.Boolean.FALSE;
        r6.A0L = "Increment JID mismatch";
        com.whatsapp.util.Log.e("MessageStoreBackup/restore/file-integrity-check/failed_jid_mismatch");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:422:0x0a9e, code lost:
        r0 = java.lang.Boolean.FALSE;
        r6.A03 = r0;
        r6.A02 = r0;
        r6.A0L = "Increment Integrity Check failed";
        com.whatsapp.util.Log.e("MessageStoreBackup/restore/file-integrity-check/failed");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:425:?, code lost:
        A04(r6, r22);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:551:0x0c3d, code lost:
        A04(r6, r22);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:565:0x0cae, code lost:
        if (r4 == 1) goto L_0x0cb0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:598:0x0d19, code lost:
        if (r5 != 0) goto L_0x0d1b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:612:0x0d6d, code lost:
        if (r3.A02.size() != 0) goto L_0x0d6f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x022b, code lost:
        if (r1 == false) goto L_0x022d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:687:0x0f0b, code lost:
        if (r0 != false) goto L_0x1452;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:883:0x148f, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:886:?, code lost:
        com.whatsapp.util.Log.e("DatabaseHelper/verifyBackup/restoreIndexes - database error.", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:888:0x149f, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:891:?, code lost:
        com.whatsapp.util.Log.e("DatabaseHelper/verifyBackup - unknown error.", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:941:0x15f8, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:943:?, code lost:
        r3.A00(r2);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x02bf A[Catch:{ all -> 0x0c56 }] */
    /* JADX WARNING: Removed duplicated region for block: B:1031:0x0e5c A[EDGE_INSN: B:1031:0x0e5c->B:666:0x0e5c ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x02e2 A[Catch:{ all -> 0x0c56 }] */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x02fb A[Catch:{ Exception -> 0x14ea }] */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x05b4 A[Catch:{ all -> 0x0ba2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:320:0x07b3 A[Catch:{ all -> 0x0ba2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:323:0x07c0 A[Catch:{ all -> 0x0ba2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:328:0x082d A[Catch:{ all -> 0x0ba2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:334:0x0877 A[Catch:{ all -> 0x0ba2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:365:0x0949 A[Catch:{ all -> 0x0ba2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:368:0x0991 A[Catch:{ all -> 0x0ba2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:516:0x0bdc A[Catch:{ all -> 0x0c36 }] */
    /* JADX WARNING: Removed duplicated region for block: B:517:0x0bdd A[Catch:{ all -> 0x0c36 }] */
    /* JADX WARNING: Removed duplicated region for block: B:530:0x0c01 A[Catch:{ all -> 0x0c36 }] */
    /* JADX WARNING: Removed duplicated region for block: B:536:0x0c18 A[SYNTHETIC, Splitter:B:536:0x0c18] */
    /* JADX WARNING: Removed duplicated region for block: B:554:0x0c55 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:565:0x0cae A[Catch:{ 23v | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x14e3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:568:0x0cc6  */
    /* JADX WARNING: Removed duplicated region for block: B:570:0x0cd3  */
    /* JADX WARNING: Removed duplicated region for block: B:660:0x0e45  */
    /* JADX WARNING: Removed duplicated region for block: B:663:0x0e4e A[LOOP:15: B:625:0x0da6->B:663:0x0e4e, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:664:0x0e52  */
    /* JADX WARNING: Removed duplicated region for block: B:888:0x149f A[ExcHandler: Exception (r1v23 'e' java.lang.Exception A[CUSTOM_DECLARE]), PHI: r8 r9 
      PHI: (r8v4 boolean) = (r8v0 boolean), (r8v0 boolean), (r8v0 boolean), (r8v6 boolean), (r8v7 boolean) binds: [B:878:0x1471, B:879:?, B:881:0x147f, B:885:0x1492, B:882:?] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r9v4 long) = (r9v0 long), (r9v0 long), (r9v0 long), (r9v6 long), (r9v7 long) binds: [B:878:0x1471, B:879:?, B:881:0x147f, B:885:0x1492, B:882:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:878:0x1471] */
    /* JADX WARNING: Removed duplicated region for block: B:902:0x14bf  */
    /* JADX WARNING: Removed duplicated region for block: B:917:0x1504  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x029f A[Catch:{ all -> 0x0c56 }] */
    /* JADX WARNING: Removed duplicated region for block: B:920:0x1515  */
    /* JADX WARNING: Removed duplicated region for block: B:929:0x15ab  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x02a0 A[Catch:{ all -> 0x0c56 }] */
    /* JADX WARNING: Removed duplicated region for block: B:938:0x15dc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C59852xb A0H(X.AnonymousClass4BZ r77, java.util.List r78, int r79) {
        /*
            r76 = this;
            r28 = 2
            r0 = r28
            boolean[] r0 = new boolean[r0]
            r41 = r0
            r0 = {1, 0} // fill-array
            r19 = 0
            r29 = 0
            r27 = 0
            r26 = 0
            r25 = 0
        L_0x0015:
            java.lang.String r45 = "MessageStoreBackup/restore/"
            r7 = r76
            r1 = r25
            r0 = r28
            if (r1 >= r0) goto L_0x1608
            boolean r24 = r41[r25]
            int r18 = X.AnonymousClass002.A03(r78)
        L_0x0025:
            if (r18 < 0) goto L_0x15f4
            if (r19 != 0) goto L_0x15f4
            if (r26 != 0) goto L_0x15f4
            r1 = r78
            r0 = r18
            java.lang.Object r40 = r1.get(r0)
            r0 = r40
            java.io.File r0 = (java.io.File) r0
            r40 = r0
            java.lang.String r1 = r40.getName()
            java.lang.String r0 = "-increment-"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x0075
            java.lang.String r1 = r40.getName()
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r0 = ".crypt"
            r3.append(r0)
            X.22O r2 = X.AnonymousClass22O.UNENCRYPTED
            int r0 = r2.version
            java.lang.String r0 = X.AnonymousClass000.A0h(r3, r0)
            boolean r0 = r1.endsWith(r0)
            if (r0 != 0) goto L_0x0078
            X.8qC r0 = r7.A0l
            java.lang.Object r1 = r0.get()
            X.0Xr r1 = (X.C06430Xr) r1
            r0 = r40
            boolean r0 = r1.A0C(r0)
            if (r0 != 0) goto L_0x0078
            java.lang.String r0 = "MessageStoreBackup/restore/backup-not-supported"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x0075:
            int r18 = r18 + -1
            goto L_0x0025
        L_0x0078:
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0l(r45)
            if (r24 == 0) goto L_0x15ef
            java.lang.String r0 = "repair-enabled"
        L_0x0081:
            r3.append(r0)
            java.lang.String r1 = " "
            r0 = r40
            X.AnonymousClass000.A10(r0, r1, r3)
            java.lang.String r0 = r3.toString()
            X.33M r44 = X.AnonymousClass33M.A01(r0)
            int r0 = r78.size()
            long r0 = (long) r0
            r74 = r0
            r0 = r18
            long r0 = (long) r0
            r72 = r0
            r14 = 1
            r3 = 0
            boolean r0 = r40.exists()
            r38 = 3
            if (r0 != 0) goto L_0x00ca
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "MessageStoreBackup/restore-db-backup-file/does-not-exist "
            r0 = r40
            X.AnonymousClass000.A10(r0, r1, r2)
            X.C18280x3.A13(r2)
        L_0x00b7:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r2 = "MessageStoreBackup/restore/failure "
        L_0x00bd:
            r0 = r40
            java.lang.String r0 = X.AnonymousClass0x7.A0p(r0, r2, r1)
            X.C18260x0.A1M(r1, r0)
        L_0x00c6:
            r44.A07()
            goto L_0x0075
        L_0x00ca:
            java.lang.String r0 = "MessageStoreBackup/restore/chatdb"
            X.33M r43 = X.AnonymousClass33M.A01(r0)
            java.lang.String r6 = r40.getName()
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "MessageStoreBackup/restore/copy "
            r4.append(r0)
            r4.append(r6)
            java.lang.String r1 = " size: "
            r0 = r40
            java.lang.String r0 = X.AnonymousClass000.A0N(r0, r1, r4)
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1VW r5 = r7.A0Y
            boolean r0 = X.AnonymousClass0S8.A00(r5)
            if (r0 == 0) goto L_0x0136
            java.util.ArrayList r22 = X.AnonymousClass001.A0s()
            java.lang.String r1 = r40.getName()
            X.22O r9 = X.C57202tG.A00(r1)
            if (r9 == 0) goto L_0x0155
            java.lang.String r0 = "(\\d{4})-(\\d{2})-(\\d{2})"
            java.util.regex.Pattern r8 = java.util.regex.Pattern.compile(r0)
            java.util.regex.Matcher r0 = r8.matcher(r1)
            boolean r4 = r0.find()
            if (r4 == 0) goto L_0x012f
            int r0 = r0.start()
        L_0x0115:
            java.lang.String r1 = r1.substring(r0)
            r0 = r28
            java.util.List r0 = r7.A0T(r9, r0, r3)
            java.util.Iterator r0 = r0.iterator()
        L_0x0123:
            boolean r10 = r0.hasNext()
            if (r10 == 0) goto L_0x0139
            r10 = r22
            A06(r1, r10, r0, r8, r4)
            goto L_0x0123
        L_0x012f:
            java.lang.String r0 = "."
            int r0 = r1.indexOf(r0)
            goto L_0x0115
        L_0x0136:
            r22 = 0
            goto L_0x0155
        L_0x0139:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "msgstore-increment-(\\d+)"
            r1.append(r0)
            java.lang.String r0 = A02(r9, r3)
            java.lang.String r1 = X.AnonymousClass000.A0X(r0, r1)
            X.4IT r0 = new X.4IT
            r0.<init>(r1, r3)
            r1 = r22
            java.util.Collections.sort(r1, r0)
        L_0x0155:
            r36 = 1
            r63 = r79
            if (r22 == 0) goto L_0x0198
            int r0 = r22.size()
            int r0 = r0 + 1
            int r21 = r79 / r0
        L_0x0163:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "MessageStoreBackup allotment for msgstore.db is "
            r1.append(r0)
            r0 = r21
            r1.append(r0)
            java.lang.String r39 = ", base is "
            r0 = r39
            X.C18260x0.A0y(r0, r1, r3)
            X.22O r20 = X.C57202tG.A00(r6)
            X.1bO r6 = new X.1bO
            r6.<init>()
            if (r20 == 0) goto L_0x0195
            r0 = r20
            int r0 = r0.version
            long r0 = (long) r0
        L_0x0188:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r6.A0E = r0
            r34 = 1000(0x3e8, double:4.94E-321)
            r57 = r77
            if (r20 == 0) goto L_0x0c5e
            goto L_0x019b
        L_0x0195:
            r0 = 0
            goto L_0x0188
        L_0x0198:
            r21 = r63
            goto L_0x0163
        L_0x019b:
            X.34i r0 = r7.A0h     // Catch:{ Exception -> 0x14ea }
            r71 = r0
            X.2sr r0 = r7.A07     // Catch:{ Exception -> 0x14ea }
            r70 = r0
            X.2f0 r0 = r7.A0I     // Catch:{ Exception -> 0x14ea }
            r69 = r0
            X.0WN r0 = r7.A08     // Catch:{ Exception -> 0x14ea }
            r68 = r0
            X.2s6 r0 = r7.A0C     // Catch:{ Exception -> 0x14ea }
            r67 = r0
            X.2fR r0 = r7.A0g     // Catch:{ Exception -> 0x14ea }
            r66 = r0
            X.2eK r0 = r7.A0b     // Catch:{ Exception -> 0x14ea }
            r65 = r0
            X.8qC r0 = r7.A0l     // Catch:{ Exception -> 0x14ea }
            r64 = r0
            java.lang.Object r0 = r64.get()     // Catch:{ Exception -> 0x14ea }
            X.0Xr r0 = (X.C06430Xr) r0     // Catch:{ Exception -> 0x14ea }
            r32 = 0
            r46 = r70
            r47 = r0
            r48 = r68
            r49 = r67
            r50 = r69
            r51 = r65
            r52 = r66
            r53 = r20
            r54 = r71
            r55 = r40
            r56 = r32
            X.0UR r4 = X.AnonymousClass0S7.A00(r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56)     // Catch:{ Exception -> 0x14ea }
            r2 = 5
            X.2oU r1 = r7.A0E     // Catch:{ IOException -> 0x0284 }
            X.3dV r0 = r7.A0R     // Catch:{ IOException -> 0x0284 }
            r0.A05()     // Catch:{ IOException -> 0x0284 }
            java.io.File r0 = r0.A05     // Catch:{ IOException -> 0x0284 }
            r55 = r4
            r56 = r1
            r58 = r0
            r59 = r3
            r60 = r21
            r61 = r14
            X.0NK r3 = r55.A04(r56, r57, r58, r59, r60, r61)     // Catch:{ IOException -> 0x0284 }
            java.lang.String r1 = r3.A01     // Catch:{ IOException -> 0x0284 }
            if (r1 == 0) goto L_0x0200
            java.util.Set r0 = r7.A0p     // Catch:{ IOException -> 0x0284 }
            r0.add(r1)     // Catch:{ IOException -> 0x0284 }
        L_0x0200:
            int r0 = r3.A00     // Catch:{ IOException -> 0x0284 }
            if (r0 != r14) goto L_0x0242
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch:{ IOException -> 0x0282 }
            r6.A03 = r1     // Catch:{ IOException -> 0x0282 }
            r6.A02 = r1     // Catch:{ IOException -> 0x0282 }
            boolean r1 = r4 instanceof X.AnonymousClass0DJ     // Catch:{ IOException -> 0x0282 }
            if (r1 == 0) goto L_0x0234
            X.0DJ r4 = (X.AnonymousClass0DJ) r4     // Catch:{ IOException -> 0x0282 }
            X.2rk r2 = r4.A00     // Catch:{ IOException -> 0x0282 }
            if (r2 == 0) goto L_0x022d
            X.6cV r1 = r2.A00()     // Catch:{ IOException -> 0x0282 }
            if (r1 == 0) goto L_0x022d
            X.6cV r1 = r2.A00()     // Catch:{ IOException -> 0x0282 }
            int r1 = r1.bitField1_     // Catch:{ IOException -> 0x0282 }
            r1 = r1 & 64
            if (r1 == 0) goto L_0x022d
            X.6cV r1 = r2.A00()     // Catch:{ IOException -> 0x0282 }
            boolean r1 = r1.cleanedDb_     // Catch:{ IOException -> 0x0282 }
            r2 = 1
            if (r1 != 0) goto L_0x022e
        L_0x022d:
            r2 = 0
        L_0x022e:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)     // Catch:{ IOException -> 0x0282 }
            r6.A00 = r1     // Catch:{ IOException -> 0x0282 }
        L_0x0234:
            java.lang.String r1 = "MessageStoreBackup/restore/file-integrity-check/success"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ IOException -> 0x0282 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r14)     // Catch:{ Exception -> 0x14ea }
            r6.A0A = r0     // Catch:{ Exception -> 0x14ea }
            r4 = 1
            goto L_0x02f5
        L_0x0242:
            r4 = 2
            if (r0 != r4) goto L_0x0256
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ IOException -> 0x0282 }
            r6.A03 = r1     // Catch:{ IOException -> 0x0282 }
            r6.A02 = r1     // Catch:{ IOException -> 0x0282 }
            java.lang.String r1 = "Integrity Check failed"
            r6.A0L = r1     // Catch:{ IOException -> 0x0282 }
            java.lang.String r1 = "MessageStoreBackup/restore/file-integrity-check/failed"
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ IOException -> 0x0282 }
            goto L_0x02ef
        L_0x0256:
            r4 = 4
            if (r0 != r4) goto L_0x026c
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch:{ IOException -> 0x0282 }
            r6.A03 = r1     // Catch:{ IOException -> 0x0282 }
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ IOException -> 0x0282 }
            r6.A02 = r1     // Catch:{ IOException -> 0x0282 }
            java.lang.String r1 = "JID mismatch"
            r6.A0L = r1     // Catch:{ IOException -> 0x0282 }
            java.lang.String r1 = "MessageStoreBackup/restore/file-integrity-check/failed_jid_mismatch"
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ IOException -> 0x0282 }
            goto L_0x02ef
        L_0x026c:
            if (r0 != r2) goto L_0x0273
            java.lang.String r1 = "Backup prefix is null"
            r6.A0L = r1     // Catch:{ IOException -> 0x0282 }
            goto L_0x02c8
        L_0x0273:
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ IOException -> 0x0282 }
            java.lang.String r1 = "Unexpected integrity check result "
            java.lang.String r1 = X.AnonymousClass000.A0Y(r1, r2, r0)     // Catch:{ IOException -> 0x0282 }
            java.lang.IllegalStateException r1 = X.AnonymousClass001.A0e(r1)     // Catch:{ IOException -> 0x0282 }
            throw r1     // Catch:{ IOException -> 0x0282 }
        L_0x0282:
            r3 = move-exception
            goto L_0x0286
        L_0x0284:
            r3 = move-exception
            r0 = 3
        L_0x0286:
            java.lang.String r1 = r3.toString()     // Catch:{ all -> 0x0c56 }
            r6.A0L = r1     // Catch:{ all -> 0x0c56 }
            java.lang.String r1 = r3.getMessage()     // Catch:{ all -> 0x0c56 }
            if (r1 == 0) goto L_0x02a0
            java.lang.String r2 = r3.getMessage()     // Catch:{ all -> 0x0c56 }
            java.lang.String r1 = "unknown format"
            boolean r1 = r2.contains(r1)     // Catch:{ all -> 0x0c56 }
            if (r1 == 0) goto L_0x02a0
            goto L_0x02bd
        L_0x02a0:
            java.lang.Throwable r1 = r3.getCause()     // Catch:{ all -> 0x0c56 }
            if (r1 == 0) goto L_0x02af
            java.lang.Throwable r1 = r3.getCause()     // Catch:{ all -> 0x0c56 }
            boolean r1 = r1 instanceof java.util.zip.DataFormatException     // Catch:{ all -> 0x0c56 }
            if (r1 == 0) goto L_0x02af
            goto L_0x02bd
        L_0x02af:
            java.lang.Throwable r1 = r3.getCause()     // Catch:{ all -> 0x0c56 }
            if (r1 == 0) goto L_0x02d0
            java.lang.Throwable r1 = r3.getCause()     // Catch:{ all -> 0x0c56 }
            boolean r1 = r1 instanceof javax.crypto.AEADBadTagException     // Catch:{ all -> 0x0c56 }
            if (r1 == 0) goto L_0x02d0
        L_0x02bd:
            if (r0 != r14) goto L_0x02d0
            java.lang.String r0 = "MessageStoreBackup/restore/error/decrypting-failure"
            com.whatsapp.util.Log.e(r0, r3)     // Catch:{ all -> 0x0c56 }
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0c56 }
            r6.A02 = r0     // Catch:{ all -> 0x0c56 }
        L_0x02c8:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r14)     // Catch:{ Exception -> 0x14ea }
            r6.A0A = r0     // Catch:{ Exception -> 0x14ea }
            r4 = 3
            goto L_0x02f5
        L_0x02d0:
            java.lang.String r0 = r3.getMessage()     // Catch:{ all -> 0x0c56 }
            if (r0 == 0) goto L_0x0c55
            java.lang.String r1 = r3.getMessage()     // Catch:{ all -> 0x0c56 }
            java.lang.String r0 = "ENOSPC"
            boolean r0 = r1.contains(r0)     // Catch:{ all -> 0x0c56 }
            if (r0 == 0) goto L_0x0c55
            java.lang.String r0 = "MessageStoreBackup/restore/error/no-space-left"
            com.whatsapp.util.Log.e(r0, r3)     // Catch:{ all -> 0x0c56 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r14)     // Catch:{ Exception -> 0x14ea }
            r6.A0A = r0     // Catch:{ Exception -> 0x14ea }
            r4 = 5
            goto L_0x02f5
        L_0x02ef:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r14)     // Catch:{ Exception -> 0x14ea }
            r6.A0A = r0     // Catch:{ Exception -> 0x14ea }
        L_0x02f5:
            boolean r0 = X.AnonymousClass0S8.A00(r5)     // Catch:{ Exception -> 0x14ea }
            if (r0 == 0) goto L_0x0cae
            if (r4 != r14) goto L_0x14f9
            if (r22 == 0) goto L_0x0c4f
            int r0 = r22.size()     // Catch:{ Exception -> 0x14ea }
            if (r0 <= 0) goto L_0x0c4f
            java.lang.String r0 = "MessageStoreBackup/restore/increments"
            X.33M r42 = X.AnonymousClass33M.A01(r0)     // Catch:{ Exception -> 0x14ea }
            int r23 = r79 - r21
            int r0 = r22.size()     // Catch:{ Exception -> 0x14ea }
            if (r0 <= 0) goto L_0x0a68
            int r0 = r22.size()     // Catch:{ Exception -> 0x14ea }
            int r23 = r23 / r0
        L_0x0319:
            java.util.Iterator r33 = r22.iterator()     // Catch:{ Exception -> 0x14ea }
        L_0x031d:
            boolean r0 = r33.hasNext()     // Catch:{ Exception -> 0x14ea }
            if (r0 == 0) goto L_0x0c42
            java.io.File r1 = X.AnonymousClass0x9.A0f(r33)     // Catch:{ Exception -> 0x14ea }
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x14ea }
            java.lang.String r0 = "MessageStoreBackup allotment for increment: "
            X.C18270x1.A0y(r1, r0, r2)     // Catch:{ Exception -> 0x14ea }
            java.lang.String r0 = " is "
            r2.append(r0)     // Catch:{ Exception -> 0x14ea }
            r0 = r23
            r2.append(r0)     // Catch:{ Exception -> 0x14ea }
            r0 = r39
            r3 = r21
            X.C18260x0.A0y(r0, r2, r3)     // Catch:{ Exception -> 0x14ea }
            java.lang.Object r0 = r64.get()     // Catch:{ Exception -> 0x14ea }
            X.0Xr r0 = (X.C06430Xr) r0     // Catch:{ Exception -> 0x14ea }
            r46 = r70
            r47 = r0
            r48 = r68
            r49 = r67
            r50 = r69
            r51 = r65
            r52 = r66
            r53 = r20
            r54 = r71
            r55 = r1
            r56 = r32
            X.0UR r55 = X.AnonymousClass0S7.A00(r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56)     // Catch:{ Exception -> 0x14ea }
            java.lang.String r1 = r1.getName()     // Catch:{ IOException -> 0x0bc0 }
            r0 = r65
            java.io.File r2 = r0.A01(r1)     // Catch:{ IOException -> 0x0bc0 }
            X.2oU r0 = r7.A0E     // Catch:{ IOException -> 0x0bc0 }
            r56 = r0
            r58 = r2
            r59 = r3
            r60 = r23
            r61 = r14
            X.0NK r3 = r55.A04(r56, r57, r58, r59, r60, r61)     // Catch:{ IOException -> 0x0bc0 }
            java.lang.String r0 = r3.A01     // Catch:{ IOException -> 0x0bc0 }
            if (r0 == 0) goto L_0x0386
            java.util.Set r1 = r7.A0p     // Catch:{ IOException -> 0x0bc0 }
            java.lang.String r0 = r3.A01     // Catch:{ IOException -> 0x0bc0 }
            r1.add(r0)     // Catch:{ IOException -> 0x0bc0 }
        L_0x0386:
            int r0 = r3.A00     // Catch:{ IOException -> 0x0bc0 }
            r37 = r0
            if (r0 == r14) goto L_0x038e
            goto L_0x0a6c
        L_0x038e:
            java.lang.String r0 = "MessageStoreBackup/restore/file-integrity-check/success"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IOException -> 0x0bbe }
            X.2d9 r0 = r7.A09     // Catch:{ IOException -> 0x0bbe }
            r62 = r0
            android.os.CancellationSignal r31 = new android.os.CancellationSignal     // Catch:{ IOException -> 0x0bbe }
            r31.<init>()     // Catch:{ IOException -> 0x0bbe }
            boolean r0 = r2.exists()     // Catch:{ all -> 0x0ba2 }
            if (r0 == 0) goto L_0x0b6c
            java.io.FileInputStream r4 = X.AnonymousClass0x9.A0g(r2)     // Catch:{ IOException -> 0x0b53 }
            java.util.zip.ZipInputStream r3 = new java.util.zip.ZipInputStream     // Catch:{ all -> 0x0b49 }
            r3.<init>(r4)     // Catch:{ all -> 0x0b49 }
            r0 = 131072(0x20000, float:1.83671E-40)
            byte[] r2 = new byte[r0]     // Catch:{ all -> 0x0b3f }
            java.util.zip.ZipEntry r5 = r3.getNextEntry()     // Catch:{ all -> 0x0b3f }
        L_0x03b3:
            if (r5 == 0) goto L_0x03e2
            r31.throwIfCanceled()     // Catch:{ all -> 0x0b3f }
            r0 = r62
            X.8qC r0 = r0.A06     // Catch:{ all -> 0x0b3f }
            java.lang.Object r1 = r0.get()     // Catch:{ all -> 0x0b3f }
            X.2j5 r1 = (X.C50982j5) r1     // Catch:{ all -> 0x0b3f }
            java.lang.String r0 = r5.getName()     // Catch:{ all -> 0x0b3f }
            java.io.File r0 = r1.A00(r0)     // Catch:{ all -> 0x0b3f }
            java.io.FileOutputStream r1 = X.AnonymousClass0x9.A0h(r0)     // Catch:{ all -> 0x0b3f }
            r0 = r62
            X.8qC r0 = r0.A09     // Catch:{ all -> 0x0ab4 }
            r0.get()     // Catch:{ all -> 0x0ab4 }
            r0 = r31
            X.C619032s.A01(r0, r3, r1, r2)     // Catch:{ all -> 0x0ab4 }
            r1.close()     // Catch:{ all -> 0x0b3f }
            java.util.zip.ZipEntry r5 = r3.getNextEntry()     // Catch:{ all -> 0x0b3f }
            goto L_0x03b3
        L_0x03e2:
            r3.close()     // Catch:{ all -> 0x0b49 }
            r4.close()     // Catch:{ IOException -> 0x0b53 }
            r0 = r62
            X.8qC r0 = r0.A06     // Catch:{ all -> 0x0ba2 }
            r61 = r0
            java.lang.Object r1 = r61.get()     // Catch:{ all -> 0x0ba2 }
            X.2j5 r1 = (X.C50982j5) r1     // Catch:{ all -> 0x0ba2 }
            java.lang.String r0 = "header.json"
            java.io.File r0 = r1.A01(r0)     // Catch:{ all -> 0x0ba2 }
            java.io.FileInputStream r11 = X.AnonymousClass0x9.A0g(r0)     // Catch:{ IOException -> 0x0b36, JSONException -> 0x0b2d }
            org.json.JSONObject r2 = X.C624535b.A02(r11)     // Catch:{ all -> 0x0b23 }
            java.lang.String r0 = "header"
            org.json.JSONObject r3 = r2.getJSONObject(r0)     // Catch:{ all -> 0x0b23 }
            X.2Tf r4 = new X.2Tf     // Catch:{ all -> 0x0b23 }
            r4.<init>()     // Catch:{ all -> 0x0b23 }
            java.lang.String r0 = "creation_date"
            long r0 = r3.getLong(r0)     // Catch:{ all -> 0x0b23 }
            r4.A00 = r0     // Catch:{ all -> 0x0b23 }
            java.lang.String r0 = "os"
            java.lang.String r0 = r3.getString(r0)     // Catch:{ all -> 0x0b23 }
            r4.A06 = r0     // Catch:{ all -> 0x0b23 }
            java.lang.String r0 = "os_version"
            java.lang.String r0 = r3.getString(r0)     // Catch:{ all -> 0x0b23 }
            r4.A07 = r0     // Catch:{ all -> 0x0b23 }
            java.lang.String r0 = "app_name"
            java.lang.String r0 = r3.getString(r0)     // Catch:{ all -> 0x0b23 }
            r4.A03 = r0     // Catch:{ all -> 0x0b23 }
            java.lang.String r0 = "app_version"
            java.lang.String r0 = r3.getString(r0)     // Catch:{ all -> 0x0b23 }
            r4.A04 = r0     // Catch:{ all -> 0x0b23 }
            java.lang.String r0 = "format_version"
            java.lang.String r0 = r3.getString(r0)     // Catch:{ all -> 0x0b23 }
            r4.A05 = r0     // Catch:{ all -> 0x0b23 }
            java.lang.String r0 = "added_messages"
            boolean r1 = r2.has(r0)     // Catch:{ all -> 0x0b23 }
            if (r1 == 0) goto L_0x04b9
            org.json.JSONObject r8 = r2.getJSONObject(r0)     // Catch:{ all -> 0x0b23 }
            X.2Rz r3 = new X.2Rz     // Catch:{ all -> 0x0b23 }
            r3.<init>()     // Catch:{ all -> 0x0b23 }
            java.lang.String r0 = "filename"
            java.lang.String r0 = r8.getString(r0)     // Catch:{ all -> 0x0b23 }
            r3.A03 = r0     // Catch:{ all -> 0x0b23 }
            java.lang.String r0 = "format"
            java.lang.String r0 = r8.getString(r0)     // Catch:{ all -> 0x0b23 }
            r3.A04 = r0     // Catch:{ all -> 0x0b23 }
            java.lang.String r0 = "messages_count_on_backup"
            long r0 = X.C18320x8.A06(r0, r8)     // Catch:{ all -> 0x0b23 }
            r3.A00 = r0     // Catch:{ all -> 0x0b23 }
            java.lang.String r0 = "messages_updated"
            r5 = 0
            int r0 = r8.optInt(r0, r5)     // Catch:{ all -> 0x0b23 }
            long r0 = (long) r0     // Catch:{ all -> 0x0b23 }
            r3.A02 = r0     // Catch:{ all -> 0x0b23 }
            java.lang.String r0 = "messages_deleted"
            int r0 = r8.optInt(r0, r5)     // Catch:{ all -> 0x0b23 }
            long r0 = (long) r0     // Catch:{ all -> 0x0b23 }
            r3.A01 = r0     // Catch:{ all -> 0x0b23 }
            java.lang.String r0 = "chunks"
            boolean r1 = r8.has(r0)     // Catch:{ all -> 0x0b23 }
            if (r1 == 0) goto L_0x04b7
            org.json.JSONArray r10 = r8.getJSONArray(r0)     // Catch:{ all -> 0x0b23 }
            java.util.ArrayList r9 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x0b23 }
        L_0x048e:
            int r0 = r10.length()     // Catch:{ all -> 0x0b23 }
            if (r5 >= r0) goto L_0x04b5
            org.json.JSONObject r1 = r10.getJSONObject(r5)     // Catch:{ all -> 0x0b23 }
            X.2JR r8 = new X.2JR     // Catch:{ all -> 0x0b23 }
            r8.<init>()     // Catch:{ all -> 0x0b23 }
            java.lang.String r0 = "chunk_number"
            int r0 = r1.getInt(r0)     // Catch:{ all -> 0x0b23 }
            r8.A00 = r0     // Catch:{ all -> 0x0b23 }
            java.lang.String r0 = "messages_count"
            int r0 = r1.getInt(r0)     // Catch:{ all -> 0x0b23 }
            long r0 = (long) r0     // Catch:{ all -> 0x0b23 }
            r8.A01 = r0     // Catch:{ all -> 0x0b23 }
            r9.add(r8)     // Catch:{ all -> 0x0b23 }
            int r5 = r5 + 1
            goto L_0x048e
        L_0x04b5:
            r3.A05 = r9     // Catch:{ all -> 0x0b23 }
        L_0x04b7:
            r4.A02 = r3     // Catch:{ all -> 0x0b23 }
        L_0x04b9:
            java.lang.String r0 = "deleted_messages"
            boolean r1 = r2.has(r0)     // Catch:{ all -> 0x0b23 }
            if (r1 == 0) goto L_0x04f7
            org.json.JSONObject r1 = r2.getJSONObject(r0)     // Catch:{ all -> 0x0b23 }
            X.2Ea r9 = new X.2Ea     // Catch:{ all -> 0x0b23 }
            r9.<init>()     // Catch:{ all -> 0x0b23 }
            java.lang.String r0 = "deleted_message_ids_files"
            boolean r3 = r1.has(r0)     // Catch:{ all -> 0x0b23 }
            if (r3 == 0) goto L_0x04f5
            org.json.JSONArray r8 = r1.getJSONArray(r0)     // Catch:{ all -> 0x0b23 }
            java.util.ArrayList r5 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x0b23 }
            if (r8 == 0) goto L_0x04f0
            int r3 = r8.length()     // Catch:{ all -> 0x0b23 }
            r1 = 0
        L_0x04e1:
            if (r1 >= r3) goto L_0x04f0
            java.lang.String r0 = r8.getString(r1)     // Catch:{ all -> 0x0b23 }
            X.C162457s7.A0D(r0)     // Catch:{ all -> 0x0b23 }
            r5.add(r0)     // Catch:{ all -> 0x0b23 }
            int r1 = r1 + 1
            goto L_0x04e1
        L_0x04f0:
            java.util.List r0 = r9.A00     // Catch:{ all -> 0x0b23 }
            r0.addAll(r5)     // Catch:{ all -> 0x0b23 }
        L_0x04f5:
            r4.A01 = r9     // Catch:{ all -> 0x0b23 }
        L_0x04f7:
            java.lang.String r0 = "entities"
            boolean r1 = r2.has(r0)     // Catch:{ all -> 0x0b23 }
            if (r1 == 0) goto L_0x0530
            org.json.JSONObject r9 = r2.getJSONObject(r0)     // Catch:{ all -> 0x0b23 }
            org.json.JSONArray r8 = r9.names()     // Catch:{ all -> 0x0b23 }
            if (r8 == 0) goto L_0x0530
            int r0 = r8.length()     // Catch:{ all -> 0x0b23 }
            if (r0 <= 0) goto L_0x0530
            r5 = 0
        L_0x0510:
            int r0 = r8.length()     // Catch:{ all -> 0x0b23 }
            if (r5 >= r0) goto L_0x0530
            java.lang.String r3 = r8.getString(r5)     // Catch:{ all -> 0x0b23 }
            X.1Ih r0 = new X.1Ih     // Catch:{ all -> 0x0b23 }
            r0.<init>(r3)     // Catch:{ all -> 0x0b23 }
            java.util.List r0 = r0.A00(r9)     // Catch:{ all -> 0x0b23 }
            X.2wb r1 = new X.2wb     // Catch:{ all -> 0x0b23 }
            r1.<init>(r3, r0)     // Catch:{ all -> 0x0b23 }
            java.util.Map r0 = r4.A09     // Catch:{ all -> 0x0b23 }
            r0.put(r3, r1)     // Catch:{ all -> 0x0b23 }
            int r5 = r5 + 1
            goto L_0x0510
        L_0x0530:
            java.lang.String r30 = "sequences"
            r0 = r30
            boolean r0 = r2.has(r0)     // Catch:{ all -> 0x0b23 }
            if (r0 == 0) goto L_0x0543
            r0 = r30
            java.lang.String r0 = r2.getString(r0)     // Catch:{ all -> 0x0b23 }
            r4.A08 = r0     // Catch:{ all -> 0x0b23 }
        L_0x0543:
            r11.close()     // Catch:{ IOException -> 0x0b36, JSONException -> 0x0b2d }
            r0 = r62
            X.8qC r0 = r0.A08     // Catch:{ all -> 0x0ba2 }
            java.lang.Object r3 = r0.get()     // Catch:{ all -> 0x0ba2 }
            X.2d1 r3 = (X.C47292d1) r3     // Catch:{ all -> 0x0ba2 }
            java.lang.Object r8 = r61.get()     // Catch:{ all -> 0x0ba2 }
            X.2j5 r8 = (X.C50982j5) r8     // Catch:{ all -> 0x0ba2 }
            X.2Ry r2 = r3.A02     // Catch:{ all -> 0x0ba2 }
            r0 = 0
            r2.A04 = r0     // Catch:{ all -> 0x0ba2 }
            r2.A02 = r0     // Catch:{ all -> 0x0ba2 }
            r2.A05 = r0     // Catch:{ all -> 0x0ba2 }
            r2.A03 = r0     // Catch:{ all -> 0x0ba2 }
            r2.A00 = r0     // Catch:{ all -> 0x0ba2 }
            r2.A01 = r0     // Catch:{ all -> 0x0ba2 }
            X.1If r5 = new X.1If     // Catch:{ all -> 0x0ba2 }
            r5.<init>(r3)     // Catch:{ all -> 0x0ba2 }
            X.2Ea r0 = r4.A01     // Catch:{ all -> 0x0ba2 }
            java.util.List r0 = r0.A00     // Catch:{ all -> 0x0ba2 }
            java.util.List r1 = java.util.Collections.unmodifiableList(r0)     // Catch:{ all -> 0x0ba2 }
            r0 = r31
            r5.A00(r0, r8, r1)     // Catch:{ all -> 0x0ba2 }
            X.34k r0 = r3.A01     // Catch:{ all -> 0x0ba2 }
            r60 = r0
            X.3dV r0 = r0.A00     // Catch:{ all -> 0x0ba2 }
            r59 = r0
            X.4Fq r9 = r59.A04()     // Catch:{ all -> 0x0ba2 }
            r0 = r9
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0b1e }
            X.2sg r5 = r0.A03     // Catch:{ all -> 0x0b1e }
            java.lang.String r1 = "DELETE FROM message WHERE _id IN (SELECT table_row_id FROM backup_changes WHERE ((table_name = 'message') AND (operation = 'DELETE')))"
            java.lang.String r0 = "BackupChangesStore/DELETE_MARKED_MESSAGES"
            r5.A0H(r1, r0)     // Catch:{ all -> 0x0b1e }
            r9.close()     // Catch:{ all -> 0x0ba2 }
            java.lang.String r56 = "Failed to parse serialized messages file."
            java.lang.String r55 = "IncrementalBackup/MessagesImporter/Failed to parse serialized messages file."
            X.2Rz r0 = r4.A02     // Catch:{ all -> 0x0ba2 }
            r58 = r0
            java.lang.String r0 = r0.A03     // Catch:{ all -> 0x0ba2 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0ba2 }
            if (r0 == 0) goto L_0x05c2
            java.lang.String r0 = "IncrementalBackup/MessagesImporter/There are no message file to import."
        L_0x05a5:
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0ba2 }
        L_0x05a8:
            X.2Rz r0 = r4.A02     // Catch:{ all -> 0x0ba2 }
            java.util.List r0 = r0.A05     // Catch:{ all -> 0x0ba2 }
            int r0 = r0.size()     // Catch:{ all -> 0x0ba2 }
            r16 = 0
            if (r0 <= 0) goto L_0x07a1
            long r8 = r60.A03()     // Catch:{ all -> 0x0ba2 }
            X.2Rz r0 = r4.A02     // Catch:{ all -> 0x0ba2 }
            long r0 = r0.A00     // Catch:{ all -> 0x0ba2 }
            int r5 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r5 <= 0) goto L_0x07a1
            goto L_0x0774
        L_0x05c2:
            java.lang.String r1 = "protobuf"
            r0 = r58
            java.lang.String r0 = r0.A04     // Catch:{ all -> 0x0ba2 }
            boolean r0 = r1.equalsIgnoreCase(r0)     // Catch:{ all -> 0x0ba2 }
            if (r0 != 0) goto L_0x05d2
            java.lang.String r0 = "IncrementalBackup/MessagesImporter/Messages file is not in expected protobuf format, skip importing messages."
            goto L_0x05a5
        L_0x05d2:
            r0 = r58
            java.util.List r0 = r0.A05     // Catch:{ all -> 0x0ba2 }
            int r0 = r0.size()     // Catch:{ all -> 0x0ba2 }
            if (r0 != 0) goto L_0x05e2
            java.lang.String r0 = "IncrementalBackup/MessagesImporter/Messages chunks are not specified."
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0ba2 }
            goto L_0x05a8
        L_0x05e2:
            r0 = r58
            java.lang.String r0 = r0.A03     // Catch:{ all -> 0x0ba2 }
            java.io.File r0 = r8.A01(r0)     // Catch:{ all -> 0x0ba2 }
            java.io.FileInputStream r54 = X.AnonymousClass0x9.A0g(r0)     // Catch:{ all -> 0x0ba2 }
            r53 = 0
        L_0x05f0:
            r0 = r58
            java.util.List r0 = r0.A05     // Catch:{ all -> 0x0b19 }
            int r1 = r0.size()     // Catch:{ all -> 0x0b19 }
            r0 = r53
            if (r0 >= r1) goto L_0x076f
            X.1E2 r1 = X.AnonymousClass1E2.DEFAULT_INSTANCE     // Catch:{ IOException -> 0x0b03 }
            r0 = r54
            X.6cX r52 = X.C130786cX.A04(r1, r0)     // Catch:{ IOException -> 0x0b03 }
            r0 = r52
            X.1E2 r0 = (X.AnonymousClass1E2) r0     // Catch:{ IOException -> 0x0b03 }
            r52 = r0
            if (r0 == 0) goto L_0x0b11
            r51 = 0
        L_0x060e:
            r0 = r52
            X.8ya r0 = r0.conversations_     // Catch:{ all -> 0x0b19 }
            int r1 = r0.size()     // Catch:{ all -> 0x0b19 }
            r0 = r51
            if (r0 >= r1) goto L_0x076b
            r0 = r52
            X.8ya r1 = r0.conversations_     // Catch:{ all -> 0x0b19 }
            r0 = r51
            java.lang.Object r1 = r1.get(r0)     // Catch:{ all -> 0x0b19 }
            X.1EG r1 = (X.AnonymousClass1EG) r1     // Catch:{ all -> 0x0b19 }
            java.lang.String r0 = r1.id_     // Catch:{ all -> 0x0b19 }
            X.4uZ r0 = X.C18310x6.A0S(r0)     // Catch:{ all -> 0x0b19 }
            if (r0 == 0) goto L_0x0767
            X.8ya r0 = r1.messages_     // Catch:{ all -> 0x0b19 }
            java.util.Iterator r50 = r0.iterator()     // Catch:{ all -> 0x0b19 }
        L_0x0634:
            boolean r0 = r50.hasNext()     // Catch:{ all -> 0x0b19 }
            if (r0 == 0) goto L_0x0767
            java.lang.Object r9 = r50.next()     // Catch:{ all -> 0x0b19 }
            X.1Bs r9 = (X.C21411Bs) r9     // Catch:{ all -> 0x0b19 }
            r31.throwIfCanceled()     // Catch:{ all -> 0x0b19 }
            if (r9 != 0) goto L_0x064b
            java.lang.String r0 = "IncrementalBackup/MessagesImporter/Conversation message is null."
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0b19 }
            goto L_0x0634
        L_0x064b:
            X.1ES r5 = r9.message_     // Catch:{ all -> 0x0b19 }
            if (r5 != 0) goto L_0x0651
            X.1ES r5 = X.AnonymousClass1ES.DEFAULT_INSTANCE     // Catch:{ all -> 0x0b19 }
        L_0x0651:
            X.20z r0 = X.C371120z.FOR_INCREMENTAL_BACKUP     // Catch:{ Exception -> 0x075f }
            X.2j4 r1 = new X.2j4     // Catch:{ Exception -> 0x075f }
            r1.<init>(r0)     // Catch:{ Exception -> 0x075f }
            X.33H r0 = r3.A08     // Catch:{ Exception -> 0x075f }
            X.34x r8 = r0.A04(r1, r5)     // Catch:{ Exception -> 0x075f }
            if (r8 == 0) goto L_0x0756
            int r0 = r9.bitField0_     // Catch:{ all -> 0x0b19 }
            r0 = r0 & 2
            if (r0 == 0) goto L_0x066a
            long r0 = r9.msgOrderId_     // Catch:{ all -> 0x0b19 }
            r8.A1L = r0     // Catch:{ all -> 0x0b19 }
        L_0x066a:
            X.1ES r9 = r9.message_     // Catch:{ all -> 0x0b19 }
            if (r9 != 0) goto L_0x0670
            X.1ES r9 = X.AnonymousClass1ES.DEFAULT_INSTANCE     // Catch:{ all -> 0x0b19 }
        L_0x0670:
            java.lang.String r49 = "incremental-backup-msg-importer-insert-failed"
            int r0 = r8.A05     // Catch:{ Exception -> 0x073d }
            if (r0 <= 0) goto L_0x067d
            X.313 r5 = r3.A06     // Catch:{ Exception -> 0x073d }
            long r0 = r8.A0K     // Catch:{ Exception -> 0x073d }
            r5.A04(r8, r0)     // Catch:{ Exception -> 0x073d }
        L_0x067d:
            boolean r0 = X.C624134x.A0g(r8)     // Catch:{ Exception -> 0x073d }
            if (r0 == 0) goto L_0x0688
            X.4F4 r0 = r3.A03     // Catch:{ Exception -> 0x073d }
            r0.Bh2(r9, r8)     // Catch:{ Exception -> 0x073d }
        L_0x0688:
            X.2qz r11 = r3.A09     // Catch:{ Exception -> 0x073d }
            X.2z0 r10 = r8.A1J     // Catch:{ Exception -> 0x073d }
            X.34x r9 = r11.A05(r10)     // Catch:{ Exception -> 0x073d }
            r5 = 0
            r47 = 1
            if (r9 == 0) goto L_0x06f4
            long r0 = r9.A1L     // Catch:{ Exception -> 0x073d }
            r8.A1L = r0     // Catch:{ Exception -> 0x073d }
            long r0 = r9.A1M     // Catch:{ Exception -> 0x073d }
            r8.A1M = r0     // Catch:{ Exception -> 0x073d }
            int r0 = r9.A0l()     // Catch:{ Exception -> 0x073d }
            r46 = 1
            if (r0 != r14) goto L_0x06ae
            X.3Lv r1 = r3.A05     // Catch:{ Exception -> 0x073d }
            java.util.Set r0 = java.util.Collections.singleton(r9)     // Catch:{ Exception -> 0x073d }
            r1.A0l(r0, r5)     // Catch:{ Exception -> 0x073d }
        L_0x06ae:
            long r0 = r8.A1L     // Catch:{ Exception -> 0x073d }
            X.4Fq r17 = r59.A04()     // Catch:{ Exception -> 0x073d }
            r12 = r17
            X.3H0 r12 = (X.AnonymousClass3H0) r12     // Catch:{ all -> 0x06ea }
            X.2sg r12 = r12.A03     // Catch:{ all -> 0x06ea }
            r15 = r12
            java.lang.String r13 = "message"
            java.lang.String r16 = "_id = ?"
            java.lang.String[] r12 = new java.lang.String[r14]     // Catch:{ all -> 0x06ea }
            X.AnonymousClass0x2.A1S(r12, r5, r0)     // Catch:{ all -> 0x06ea }
            java.lang.String r0 = "BackupChangesStore/DELETE_CONFLICTING_MESSAGE"
            r1 = r16
            r15.A07(r13, r1, r0, r12)     // Catch:{ all -> 0x06ea }
            r17.close()     // Catch:{ Exception -> 0x073d }
            X.2iV r0 = r3.A04     // Catch:{ Exception -> 0x073d }
            r0.A01(r10)     // Catch:{ Exception -> 0x073d }
            X.34x r0 = r11.A05(r10)     // Catch:{ Exception -> 0x073d }
            if (r0 == 0) goto L_0x06f6
            long r0 = r2.A03     // Catch:{ Exception -> 0x073d }
            long r0 = r0 + r47
            r2.A03 = r0     // Catch:{ Exception -> 0x073d }
            X.2qk r8 = r3.A00     // Catch:{ Exception -> 0x073d }
            java.lang.String r1 = "incremental-backup-msg-importer-update-failed"
            java.lang.String r0 = "Failed to delete old fMessage."
            r8.A0A(r1, r5, r0)     // Catch:{ Exception -> 0x073d }
            goto L_0x0634
        L_0x06ea:
            r1 = move-exception
            r17.close()     // Catch:{ all -> 0x06ef }
            goto L_0x06f3
        L_0x06ef:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ Exception -> 0x073d }
        L_0x06f3:
            throw r1     // Catch:{ Exception -> 0x073d }
        L_0x06f4:
            r46 = 0
        L_0x06f6:
            r11.A06(r8)     // Catch:{ all -> 0x072c }
            X.33f r0 = r3.A07     // Catch:{ all -> 0x072c }
            r0.A0D(r8)     // Catch:{ all -> 0x072c }
            X.2iV r0 = r3.A04     // Catch:{ Exception -> 0x073d }
            r0.A01(r10)     // Catch:{ Exception -> 0x073d }
            X.34x r0 = r11.A05(r10)     // Catch:{ Exception -> 0x073d }
            if (r0 != 0) goto L_0x071a
            long r0 = r2.A02     // Catch:{ Exception -> 0x073d }
            long r0 = r0 + r47
            r2.A02 = r0     // Catch:{ Exception -> 0x073d }
            X.2qk r8 = r3.A00     // Catch:{ Exception -> 0x073d }
            java.lang.String r1 = "Failed to insert new fMessage."
            r0 = r49
            r8.A0A(r0, r5, r1)     // Catch:{ Exception -> 0x073d }
            goto L_0x0634
        L_0x071a:
            if (r46 == 0) goto L_0x0724
            long r0 = r2.A05     // Catch:{ Exception -> 0x073d }
            long r0 = r0 + r47
            r2.A05 = r0     // Catch:{ Exception -> 0x073d }
            goto L_0x0634
        L_0x0724:
            long r0 = r2.A04     // Catch:{ Exception -> 0x073d }
            long r0 = r0 + r47
            r2.A04 = r0     // Catch:{ Exception -> 0x073d }
            goto L_0x0634
        L_0x072c:
            r5 = move-exception
            if (r9 == 0) goto L_0x0736
            long r0 = r2.A03     // Catch:{ Exception -> 0x073d }
            long r0 = r0 + r47
            r2.A03 = r0     // Catch:{ Exception -> 0x073d }
            goto L_0x073c
        L_0x0736:
            long r0 = r2.A02     // Catch:{ Exception -> 0x073d }
            long r0 = r0 + r47
            r2.A02 = r0     // Catch:{ Exception -> 0x073d }
        L_0x073c:
            throw r5     // Catch:{ Exception -> 0x073d }
        L_0x073d:
            r8 = move-exception
            java.lang.String r0 = "IncrementalBackup/MessagesImporter/Failed to insert fMessage."
            com.whatsapp.util.Log.e(r0, r8)     // Catch:{ all -> 0x0b19 }
            X.2qk r5 = r3.A00     // Catch:{ all -> 0x0b19 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0b19 }
            java.lang.String r0 = "Failed to insert fMessage: "
            java.lang.String r1 = X.AnonymousClass000.A0P(r8, r0, r1)     // Catch:{ all -> 0x0b19 }
            r0 = r49
            r5.A09(r0, r1, r8)     // Catch:{ all -> 0x0b19 }
            goto L_0x0634
        L_0x0756:
            java.lang.String r1 = "Parsed WMI message is null."
            r0 = r32
            r3.A00(r5, r1, r0)     // Catch:{ all -> 0x0b19 }
            goto L_0x0634
        L_0x075f:
            r1 = move-exception
            java.lang.String r0 = "Failed to parse message from WMI."
            r3.A00(r5, r0, r1)     // Catch:{ all -> 0x0b19 }
            goto L_0x0634
        L_0x0767:
            int r51 = r51 + 1
            goto L_0x060e
        L_0x076b:
            int r53 = r53 + 1
            goto L_0x05f0
        L_0x076f:
            r54.close()     // Catch:{ all -> 0x0ba2 }
            goto L_0x05a8
        L_0x0774:
            int r5 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r5 == 0) goto L_0x079c
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0ba2 }
            java.lang.String r10 = "Expected: "
            r5.append(r10)     // Catch:{ all -> 0x0ba2 }
            r5.append(r0)     // Catch:{ all -> 0x0ba2 }
            java.lang.String r0 = " Actual: "
            java.lang.String r8 = X.AnonymousClass000.A0Z(r0, r5, r8)     // Catch:{ all -> 0x0ba2 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0ba2 }
            java.lang.String r0 = "IncrementalBackup/MessagesImporter/Number of messages restored doesn't match to number of messages before backup. "
            X.C18260x0.A0r(r0, r8, r1)     // Catch:{ all -> 0x0ba2 }
            X.2qk r5 = r3.A00     // Catch:{ all -> 0x0ba2 }
            java.lang.String r1 = "incremental-backup-importer-count-mismatch"
            r0 = 0
            r5.A0A(r1, r0, r8)     // Catch:{ all -> 0x0ba2 }
            goto L_0x07a1
        L_0x079c:
            java.lang.String r0 = "IncrementalBackup/MessagesImporter/Number of messages restored match to number of messages before backup. "
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ all -> 0x0ba2 }
        L_0x07a1:
            long r0 = r2.A02     // Catch:{ all -> 0x0ba2 }
            int r5 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r5 > 0) goto L_0x0949
            long r8 = r2.A03     // Catch:{ all -> 0x0ba2 }
            int r5 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r5 > 0) goto L_0x0949
            long r8 = r2.A01     // Catch:{ all -> 0x0ba2 }
            int r5 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r5 > 0) goto L_0x0949
            java.lang.String r0 = "IncrementalBackup/MessagesImporter/All messages were restored."
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ all -> 0x0ba2 }
        L_0x07b8:
            X.2Rz r0 = r4.A02     // Catch:{ all -> 0x0ba2 }
            long r0 = r0.A02     // Catch:{ all -> 0x0ba2 }
            int r5 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r5 <= 0) goto L_0x0825
            long r12 = r2.A04     // Catch:{ all -> 0x0ba2 }
            long r10 = r2.A05     // Catch:{ all -> 0x0ba2 }
            long r8 = r12 + r10
            int r5 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r5 == 0) goto L_0x0942
            java.lang.StringBuilder r15 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0ba2 }
            java.lang.String r5 = "IncrementalBackup/MessagesImporter/Number of messages restored doesn't match to number of messages in backup. Archive contains "
            r15.append(r5)     // Catch:{ all -> 0x0ba2 }
            r15.append(r0)     // Catch:{ all -> 0x0ba2 }
            java.lang.String r0 = " messages, but the number of restored messages is "
            r15.append(r0)     // Catch:{ all -> 0x0ba2 }
            r15.append(r8)     // Catch:{ all -> 0x0ba2 }
            java.lang.String r0 = ". \nDetailed stats: \nNumber of messages inserted: "
            r15.append(r0)     // Catch:{ all -> 0x0ba2 }
            r15.append(r12)     // Catch:{ all -> 0x0ba2 }
            java.lang.String r0 = "\nNumber of messages updated: "
            X.C18260x0.A11(r0, r15, r10)     // Catch:{ all -> 0x0ba2 }
            X.2qk r12 = r3.A00     // Catch:{ all -> 0x0ba2 }
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0ba2 }
            java.lang.String r0 = "Archive msg:"
            r5.append(r0)     // Catch:{ all -> 0x0ba2 }
            X.2Rz r0 = r4.A02     // Catch:{ all -> 0x0ba2 }
            long r0 = r0.A02     // Catch:{ all -> 0x0ba2 }
            r5.append(r0)     // Catch:{ all -> 0x0ba2 }
            java.lang.String r0 = ", restored:"
            r5.append(r0)     // Catch:{ all -> 0x0ba2 }
            long r8 = r2.A04     // Catch:{ all -> 0x0ba2 }
            long r0 = r2.A05     // Catch:{ all -> 0x0ba2 }
            long r10 = r8 + r0
            r5.append(r10)     // Catch:{ all -> 0x0ba2 }
            java.lang.String r10 = "(inserted:"
            r5.append(r10)     // Catch:{ all -> 0x0ba2 }
            r5.append(r8)     // Catch:{ all -> 0x0ba2 }
            java.lang.String r8 = ", updated:"
            r5.append(r8)     // Catch:{ all -> 0x0ba2 }
            r5.append(r0)     // Catch:{ all -> 0x0ba2 }
            java.lang.String r5 = X.AnonymousClass000.A0e(r5)     // Catch:{ all -> 0x0ba2 }
            java.lang.String r1 = "incremental-backup-importer-import-mismatch"
            r0 = 0
            r12.A0A(r1, r0, r5)     // Catch:{ all -> 0x0ba2 }
        L_0x0825:
            X.2Rz r0 = r4.A02     // Catch:{ all -> 0x0ba2 }
            long r0 = r0.A01     // Catch:{ all -> 0x0ba2 }
            int r5 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r5 <= 0) goto L_0x0868
            long r8 = r2.A00     // Catch:{ all -> 0x0ba2 }
            int r5 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r5 == 0) goto L_0x093b
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0ba2 }
            java.lang.String r10 = "Archive contain "
            r5.append(r10)     // Catch:{ all -> 0x0ba2 }
            r5.append(r0)     // Catch:{ all -> 0x0ba2 }
            java.lang.String r0 = " messages to be deleted, but there number of deleted messages is "
            r5.append(r0)     // Catch:{ all -> 0x0ba2 }
            r5.append(r8)     // Catch:{ all -> 0x0ba2 }
            java.lang.String r0 = ", failed to delete "
            r5.append(r0)     // Catch:{ all -> 0x0ba2 }
            long r0 = r2.A01     // Catch:{ all -> 0x0ba2 }
            r5.append(r0)     // Catch:{ all -> 0x0ba2 }
            java.lang.String r0 = " messages."
            java.lang.String r5 = X.AnonymousClass000.A0X(r0, r5)     // Catch:{ all -> 0x0ba2 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0ba2 }
            java.lang.String r0 = "IncrementalBackup/MessagesImporter/Number of deleted messages  doesn't match to number of deleted messages in backup. "
            X.C18260x0.A0r(r0, r5, r1)     // Catch:{ all -> 0x0ba2 }
            X.2qk r2 = r3.A00     // Catch:{ all -> 0x0ba2 }
            java.lang.String r1 = "incremental-backup-importer-import-delete-mismatch"
            r0 = 0
            r2.A0A(r1, r0, r5)     // Catch:{ all -> 0x0ba2 }
        L_0x0868:
            r60.A07()     // Catch:{ all -> 0x0ba2 }
            java.util.Map r0 = r4.A09     // Catch:{ all -> 0x0ba2 }
            java.util.Iterator r48 = X.AnonymousClass001.A0v(r0)     // Catch:{ all -> 0x0ba2 }
        L_0x0871:
            boolean r0 = r48.hasNext()     // Catch:{ all -> 0x0ba2 }
            if (r0 == 0) goto L_0x097d
            java.lang.Object r0 = r48.next()     // Catch:{ all -> 0x0ba2 }
            X.2wb r0 = (X.C59242wb) r0     // Catch:{ all -> 0x0ba2 }
            java.util.List r0 = r0.A01     // Catch:{ all -> 0x0ba2 }
            java.util.Iterator r47 = X.AnonymousClass0x7.A0x(r0)     // Catch:{ all -> 0x0ba2 }
        L_0x0883:
            boolean r0 = r47.hasNext()     // Catch:{ all -> 0x0ba2 }
            if (r0 == 0) goto L_0x0871
            java.lang.Object r8 = r47.next()     // Catch:{ all -> 0x0ba2 }
            X.2vt r8 = (X.C58832vt) r8     // Catch:{ all -> 0x0ba2 }
            r0 = r62
            X.8qC r0 = r0.A03     // Catch:{ all -> 0x0ba2 }
            java.lang.Object r10 = r0.get()     // Catch:{ all -> 0x0ba2 }
            X.2EY r10 = (X.AnonymousClass2EY) r10     // Catch:{ all -> 0x0ba2 }
            java.lang.Object r9 = r61.get()     // Catch:{ all -> 0x0ba2 }
            X.2j5 r9 = (X.C50982j5) r9     // Catch:{ all -> 0x0ba2 }
            java.lang.String r5 = r8.A03     // Catch:{ all -> 0x0ba2 }
            java.lang.String r3 = r8.A02     // Catch:{ all -> 0x0ba2 }
            java.util.List r0 = r8.A04     // Catch:{ all -> 0x0ba2 }
            java.util.List r2 = java.util.Collections.unmodifiableList(r0)     // Catch:{ all -> 0x0ba2 }
            int r0 = r2.size()     // Catch:{ all -> 0x0ba2 }
            if (r0 == 0) goto L_0x08b9
            X.1Ig r1 = new X.1Ig     // Catch:{ all -> 0x0ba2 }
            r1.<init>(r10, r5, r3)     // Catch:{ all -> 0x0ba2 }
            r0 = r31
            r1.A00(r0, r9, r2)     // Catch:{ all -> 0x0ba2 }
        L_0x08b9:
            java.lang.String r12 = r8.A01     // Catch:{ all -> 0x0ba2 }
            java.util.List r0 = r8.A05     // Catch:{ all -> 0x0ba2 }
            java.util.List r1 = java.util.Collections.unmodifiableList(r0)     // Catch:{ all -> 0x0ba2 }
            int r0 = r1.size()     // Catch:{ all -> 0x0ba2 }
            if (r0 == 0) goto L_0x0910
            X.1Ik r11 = new X.1Ik     // Catch:{ all -> 0x0ba2 }
            r11.<init>(r5)     // Catch:{ all -> 0x0ba2 }
            java.util.Iterator r46 = r1.iterator()     // Catch:{ all -> 0x0ba2 }
        L_0x08d0:
            boolean r0 = r46.hasNext()     // Catch:{ all -> 0x0ba2 }
            if (r0 == 0) goto L_0x0910
            java.lang.String r13 = X.AnonymousClass001.A0m(r46)     // Catch:{ all -> 0x0ba2 }
            boolean r0 = r31.isCanceled()     // Catch:{ all -> 0x0ba2 }
            if (r0 != 0) goto L_0x0910
            java.io.File r2 = r9.A01(r13)     // Catch:{ all -> 0x0ba2 }
            boolean r0 = r2.exists()     // Catch:{ all -> 0x0ba2 }
            java.lang.String r1 = "EntityTableProcessor/Failed to parse input file '"
            if (r0 != 0) goto L_0x08f6
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0m(r1, r13)     // Catch:{ all -> 0x0ba2 }
            java.lang.String r0 = "'. File doesn't exist."
            X.C18260x0.A1K(r1, r0)     // Catch:{ all -> 0x0ba2 }
            goto L_0x08d0
        L_0x08f6:
            java.io.FileInputStream r15 = X.AnonymousClass0x9.A0g(r2)     // Catch:{ JSONException -> 0x0b80 }
            org.json.JSONObject r0 = X.C624535b.A02(r15)     // Catch:{ all -> 0x0abe }
            java.util.List r2 = r11.A00(r0)     // Catch:{ all -> 0x0abe }
            r15.close()     // Catch:{ JSONException -> 0x0b80 }
            X.1Ip r1 = new X.1Ip     // Catch:{ all -> 0x0ba2 }
            r1.<init>(r10, r5, r3, r12)     // Catch:{ all -> 0x0ba2 }
            r0 = r31
            r1.A00(r0, r2)     // Catch:{ all -> 0x0ba2 }
            goto L_0x08d0
        L_0x0910:
            X.34k r0 = r10.A00     // Catch:{ all -> 0x0ba2 }
            long r2 = r0.A04(r5, r3)     // Catch:{ all -> 0x0ba2 }
            long r0 = r8.A00     // Catch:{ all -> 0x0ba2 }
            int r8 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r8 <= 0) goto L_0x0883
            int r8 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r8 == 0) goto L_0x0883
            java.lang.StringBuilder r9 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0ba2 }
            java.lang.String r8 = "EntityTableProcessor/Number of entities ("
            r9.append(r8)     // Catch:{ all -> 0x0ba2 }
            r9.append(r5)     // Catch:{ all -> 0x0ba2 }
            java.lang.String r5 = ") restored doesn't match to number of entities before backup. Expected: "
            r9.append(r5)     // Catch:{ all -> 0x0ba2 }
            r9.append(r0)     // Catch:{ all -> 0x0ba2 }
            java.lang.String r0 = "; Actual: "
            X.C18260x0.A11(r0, r9, r2)     // Catch:{ all -> 0x0ba2 }
            goto L_0x0883
        L_0x093b:
            java.lang.String r0 = "IncrementalBackup/MessagesImporter/Number of messages deleted matches to number of deleted messages in backup."
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ all -> 0x0ba2 }
            goto L_0x0868
        L_0x0942:
            java.lang.String r0 = "IncrementalBackup/MessagesImporter/Number of messages restored matches to number of messages in backup."
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ all -> 0x0ba2 }
            goto L_0x0825
        L_0x0949:
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0ba2 }
            java.lang.String r8 = "failedToInsertMessages: "
            r5.append(r8)     // Catch:{ all -> 0x0ba2 }
            r5.append(r0)     // Catch:{ all -> 0x0ba2 }
            java.lang.String r0 = ", failedToUpdateMessages: "
            r5.append(r0)     // Catch:{ all -> 0x0ba2 }
            long r0 = r2.A03     // Catch:{ all -> 0x0ba2 }
            r5.append(r0)     // Catch:{ all -> 0x0ba2 }
            java.lang.String r0 = ", failedToDeleteMessages: "
            r5.append(r0)     // Catch:{ all -> 0x0ba2 }
            long r0 = r2.A01     // Catch:{ all -> 0x0ba2 }
            java.lang.String r8 = X.AnonymousClass001.A0k(r5, r0)     // Catch:{ all -> 0x0ba2 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0ba2 }
            java.lang.String r0 = "IncrementalBackup/MessagesImporter/Total number of errors during messages restore: "
            X.C18260x0.A0r(r0, r8, r1)     // Catch:{ all -> 0x0ba2 }
            X.2qk r5 = r3.A00     // Catch:{ all -> 0x0ba2 }
            java.lang.String r1 = "incremental-backup-importer-import-issues"
            r0 = 0
            r5.A0A(r1, r0, r8)     // Catch:{ all -> 0x0ba2 }
            goto L_0x07b8
        L_0x097d:
            r0 = r62
            X.8qC r0 = r0.A0A     // Catch:{ all -> 0x0ba2 }
            java.lang.Object r5 = r0.get()     // Catch:{ all -> 0x0ba2 }
            X.2Va r5 = (X.C44192Va) r5     // Catch:{ all -> 0x0ba2 }
            java.lang.String r3 = r4.A08     // Catch:{ all -> 0x0ba2 }
            java.lang.Object r2 = r61.get()     // Catch:{ all -> 0x0ba2 }
            X.2j5 r2 = (X.C50982j5) r2     // Catch:{ all -> 0x0ba2 }
            if (r3 == 0) goto L_0x0a49
            X.1Ik r1 = new X.1Ik     // Catch:{ all -> 0x0ba2 }
            r0 = r30
            r1.<init>(r0)     // Catch:{ all -> 0x0ba2 }
            boolean r0 = r31.isCanceled()     // Catch:{ all -> 0x0ba2 }
            if (r0 != 0) goto L_0x0a49
            java.io.File r0 = r2.A01(r3)     // Catch:{ all -> 0x0ba2 }
            java.io.FileInputStream r2 = X.AnonymousClass0x9.A0g(r0)     // Catch:{ JSONException -> 0x0ad8 }
            org.json.JSONObject r0 = X.C624535b.A02(r2)     // Catch:{ all -> 0x0ace }
            java.util.List r0 = r1.A00(r0)     // Catch:{ all -> 0x0ace }
            r2.close()     // Catch:{ JSONException -> 0x0ad8 }
            java.util.Map r8 = r5.A00()     // Catch:{ all -> 0x0ba2 }
            java.util.Iterator r13 = r0.iterator()     // Catch:{ all -> 0x0ba2 }
        L_0x09b9:
            boolean r0 = r13.hasNext()     // Catch:{ all -> 0x0ba2 }
            if (r0 == 0) goto L_0x0a49
            java.lang.Object r1 = r13.next()     // Catch:{ all -> 0x0ba2 }
            java.util.Map r1 = (java.util.Map) r1     // Catch:{ all -> 0x0ba2 }
            java.lang.String r11 = "name"
            java.lang.String r2 = X.C18310x6.A0o(r11, r1)     // Catch:{ all -> 0x0ba2 }
            java.lang.String r0 = "value"
            java.lang.Object r1 = r1.get(r0)     // Catch:{ all -> 0x0ba2 }
            boolean r0 = r1 instanceof java.lang.Integer     // Catch:{ all -> 0x0ba2 }
            if (r0 == 0) goto L_0x09dd
            int r0 = X.AnonymousClass0x7.A05(r1)     // Catch:{ all -> 0x0ba2 }
            long r0 = (long) r0     // Catch:{ all -> 0x0ba2 }
            goto L_0x09e8
        L_0x09dd:
            boolean r0 = r1 instanceof java.lang.Long     // Catch:{ all -> 0x0ba2 }
            if (r0 == 0) goto L_0x09e6
            long r0 = X.C18320x8.A05(r1)     // Catch:{ all -> 0x0ba2 }
            goto L_0x09e8
        L_0x09e6:
            r0 = 0
        L_0x09e8:
            if (r2 == 0) goto L_0x09b9
            int r3 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r3 == 0) goto L_0x09b9
            java.lang.Object r3 = r8.get(r2)     // Catch:{ all -> 0x0ba2 }
            java.lang.Long r3 = (java.lang.Long) r3     // Catch:{ all -> 0x0ba2 }
            if (r3 == 0) goto L_0x09fe
            long r9 = r3.longValue()     // Catch:{ all -> 0x0ba2 }
            int r3 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r3 == 0) goto L_0x09b9
        L_0x09fe:
            X.3dV r3 = r5.A00     // Catch:{ all -> 0x0ba2 }
            X.4Fq r4 = r3.A04()     // Catch:{ all -> 0x0ba2 }
            android.content.ContentValues r10 = X.AnonymousClass0x9.A06()     // Catch:{ all -> 0x0ac8 }
            java.lang.String r3 = "seq"
            X.2sg r9 = X.AnonymousClass3H0.A02(r10, r4, r3, r0)     // Catch:{ all -> 0x0ac8 }
            java.lang.String r3 = "SQLITE_SEQUENCE"
            java.lang.String r49 = "name = ?"
            java.lang.String[] r51 = X.C18300x5.A1a(r2, r14)     // Catch:{ all -> 0x0ac8 }
            java.lang.String r50 = "SequencesHandler/UPDATE_SEQUENCE"
            r46 = r9
            r47 = r10
            r48 = r3
            int r12 = r46.A05(r47, r48, r49, r50, r51)     // Catch:{ all -> 0x0ac8 }
            if (r12 > 0) goto L_0x0a44
            r10.put(r11, r2)     // Catch:{ all -> 0x0ac8 }
            java.lang.String r2 = "SequencesHandler/INSERT_SEQUENCE"
            long r9 = r9.A08(r3, r2, r10)     // Catch:{ all -> 0x0ac8 }
            int r2 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r2 >= 0) goto L_0x0a44
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0ac8 }
            java.lang.String r2 = "SequencesHandler/Failed to update / insert sequence with name = '"
            r3.append(r2)     // Catch:{ all -> 0x0ac8 }
            r3.append(r0)     // Catch:{ all -> 0x0ac8 }
            java.lang.String r2 = "' and value = "
            X.C18260x0.A11(r2, r3, r0)     // Catch:{ all -> 0x0ac8 }
        L_0x0a44:
            r4.close()     // Catch:{ all -> 0x0ba2 }
            goto L_0x09b9
        L_0x0a49:
            r0 = r62
            X.8qC r0 = r0.A01     // Catch:{ IOException -> 0x0bbe }
            java.lang.Object r0 = r0.get()     // Catch:{ IOException -> 0x0bbe }
            X.34k r0 = (X.C622834k) r0     // Catch:{ IOException -> 0x0bbe }
            r0.A07()     // Catch:{ IOException -> 0x0bbe }
            java.lang.Object r0 = r61.get()     // Catch:{ IOException -> 0x0bbe }
            X.2j5 r0 = (X.C50982j5) r0     // Catch:{ IOException -> 0x0bbe }
            r0.A02()     // Catch:{ IOException -> 0x0bbe }
            int r21 = r21 + r23
            r0 = r22
            A04(r6, r0)     // Catch:{ Exception -> 0x14ea }
            goto L_0x031d
        L_0x0a68:
            r23 = 0
            goto L_0x0319
        L_0x0a6c:
            r1 = r28
            if (r0 == r1) goto L_0x0a9e
            r1 = 4
            if (r0 == r1) goto L_0x0a8b
            r1 = 5
            if (r0 != r1) goto L_0x0a7c
            java.lang.String r0 = "Increment Backup prefix is null"
            r6.A0L = r0     // Catch:{ IOException -> 0x0bbe }
            goto L_0x0c12
        L_0x0a7c:
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ IOException -> 0x0bbe }
            java.lang.String r1 = "Unexpected integrity check result "
            java.lang.String r0 = X.AnonymousClass000.A0Y(r1, r2, r0)     // Catch:{ IOException -> 0x0bbe }
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)     // Catch:{ IOException -> 0x0bbe }
            throw r0     // Catch:{ IOException -> 0x0bbe }
        L_0x0a8b:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ IOException -> 0x0bbe }
            r6.A03 = r0     // Catch:{ IOException -> 0x0bbe }
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ IOException -> 0x0bbe }
            r6.A02 = r0     // Catch:{ IOException -> 0x0bbe }
            java.lang.String r0 = "Increment JID mismatch"
            r6.A0L = r0     // Catch:{ IOException -> 0x0bbe }
            java.lang.String r0 = "MessageStoreBackup/restore/file-integrity-check/failed_jid_mismatch"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ IOException -> 0x0bbe }
            goto L_0x0c3d
        L_0x0a9e:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ IOException -> 0x0bbe }
            r6.A03 = r0     // Catch:{ IOException -> 0x0bbe }
            r6.A02 = r0     // Catch:{ IOException -> 0x0bbe }
            java.lang.String r0 = "Increment Integrity Check failed"
            r6.A0L = r0     // Catch:{ IOException -> 0x0bbe }
            java.lang.String r0 = "MessageStoreBackup/restore/file-integrity-check/failed"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ IOException -> 0x0bbe }
            r0 = r22
            A04(r6, r0)     // Catch:{ Exception -> 0x14ea }
            goto L_0x0c42
        L_0x0ab4:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0ab9 }
            goto L_0x0abd
        L_0x0ab9:
            r1 = move-exception
            r0.addSuppressed(r1)     // Catch:{ all -> 0x0b3f }
        L_0x0abd:
            throw r0     // Catch:{ all -> 0x0b3f }
        L_0x0abe:
            r2 = move-exception
            r15.close()     // Catch:{ all -> 0x0ac3 }
            goto L_0x0ac7
        L_0x0ac3:
            r0 = move-exception
            r2.addSuppressed(r0)     // Catch:{ JSONException -> 0x0b80 }
        L_0x0ac7:
            throw r2     // Catch:{ JSONException -> 0x0b80 }
        L_0x0ac8:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x0b67 }
            goto L_0x0b6b
        L_0x0ace:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x0ad3 }
            goto L_0x0ad7
        L_0x0ad3:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ JSONException -> 0x0ad8 }
        L_0x0ad7:
            throw r1     // Catch:{ JSONException -> 0x0ad8 }
        L_0x0ad8:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0ba2 }
            java.lang.String r0 = "SequencesHandler/Failed to parse input file '"
            r1.append(r0)     // Catch:{ all -> 0x0ba2 }
            r1.append(r3)     // Catch:{ all -> 0x0ba2 }
            java.lang.String r0 = "'.\n"
            X.C18260x0.A1Q(r1, r0, r2)     // Catch:{ all -> 0x0ba2 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0ba2 }
            java.lang.String r0 = "Failed to parse input file '"
            r1.append(r0)     // Catch:{ all -> 0x0ba2 }
            r1.append(r3)     // Catch:{ all -> 0x0ba2 }
            java.lang.String r0 = "'."
            java.lang.String r1 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ all -> 0x0ba2 }
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0ba2 }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x0ba2 }
            goto L_0x0ba1
        L_0x0b03:
            r1 = move-exception
            r0 = r55
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0b19 }
            java.io.IOException r2 = new java.io.IOException     // Catch:{ all -> 0x0b19 }
            r0 = r56
            r2.<init>(r0, r1)     // Catch:{ all -> 0x0b19 }
            goto L_0x0b18
        L_0x0b11:
            com.whatsapp.util.Log.e((java.lang.String) r55)     // Catch:{ all -> 0x0b19 }
            java.io.IOException r2 = X.AnonymousClass002.A0C(r56)     // Catch:{ all -> 0x0b19 }
        L_0x0b18:
            throw r2     // Catch:{ all -> 0x0b19 }
        L_0x0b19:
            r1 = move-exception
            r54.close()     // Catch:{ all -> 0x0b67 }
            goto L_0x0b6b
        L_0x0b1e:
            r1 = move-exception
            r9.close()     // Catch:{ all -> 0x0b67 }
            goto L_0x0b6b
        L_0x0b23:
            r1 = move-exception
            r11.close()     // Catch:{ all -> 0x0b28 }
            goto L_0x0b2c
        L_0x0b28:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x0b36, JSONException -> 0x0b2d }
        L_0x0b2c:
            throw r1     // Catch:{ IOException -> 0x0b36, JSONException -> 0x0b2d }
        L_0x0b2d:
            r2 = move-exception
            java.lang.String r1 = "Unable to process header JSON file."
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0ba2 }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x0ba2 }
            goto L_0x0ba1
        L_0x0b36:
            r2 = move-exception
            java.lang.String r1 = "Unable to locate header metadata file in messages archive."
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0ba2 }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x0ba2 }
            goto L_0x0ba1
        L_0x0b3f:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0b44 }
            goto L_0x0b48
        L_0x0b44:
            r1 = move-exception
            r0.addSuppressed(r1)     // Catch:{ all -> 0x0b49 }
        L_0x0b48:
            throw r0     // Catch:{ all -> 0x0b49 }
        L_0x0b49:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x0b4e }
            goto L_0x0b52
        L_0x0b4e:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x0b53 }
        L_0x0b52:
            throw r1     // Catch:{ IOException -> 0x0b53 }
        L_0x0b53:
            r1 = move-exception
            java.lang.String r0 = "MessageStoreIncrementalBackup/Failed to unpack files from archive."
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0ba2 }
            r0 = r62
            X.8qC r0 = r0.A06     // Catch:{ all -> 0x0ba2 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0ba2 }
            X.2j5 r0 = (X.C50982j5) r0     // Catch:{ all -> 0x0ba2 }
            r0.A02()     // Catch:{ all -> 0x0ba2 }
            goto L_0x0b6b
        L_0x0b67:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0ba2 }
        L_0x0b6b:
            throw r1     // Catch:{ all -> 0x0ba2 }
        L_0x0b6c:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0ba2 }
            java.lang.String r0 = "Unable to locate input data file '"
            X.AnonymousClass000.A10(r2, r0, r1)     // Catch:{ all -> 0x0ba2 }
            java.lang.String r0 = "'."
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ all -> 0x0ba2 }
            java.io.FileNotFoundException r0 = X.C18330xA.A05(r0)     // Catch:{ all -> 0x0ba2 }
            goto L_0x0ba1
        L_0x0b80:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0m(r1, r13)     // Catch:{ all -> 0x0ba2 }
            java.lang.String r0 = "'.\n"
            X.C18260x0.A1Q(r1, r0, r2)     // Catch:{ all -> 0x0ba2 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0ba2 }
            java.lang.String r0 = "Failed to parse input file '"
            r1.append(r0)     // Catch:{ all -> 0x0ba2 }
            r1.append(r13)     // Catch:{ all -> 0x0ba2 }
            java.lang.String r0 = "'."
            java.lang.String r1 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ all -> 0x0ba2 }
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0ba2 }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x0ba2 }
        L_0x0ba1:
            throw r0     // Catch:{ all -> 0x0ba2 }
        L_0x0ba2:
            r1 = move-exception
            r0 = r62
            X.8qC r0 = r0.A01     // Catch:{ IOException -> 0x0bbe }
            java.lang.Object r0 = r0.get()     // Catch:{ IOException -> 0x0bbe }
            X.34k r0 = (X.C622834k) r0     // Catch:{ IOException -> 0x0bbe }
            r0.A07()     // Catch:{ IOException -> 0x0bbe }
            r0 = r62
            X.8qC r0 = r0.A06     // Catch:{ IOException -> 0x0bbe }
            java.lang.Object r0 = r0.get()     // Catch:{ IOException -> 0x0bbe }
            X.2j5 r0 = (X.C50982j5) r0     // Catch:{ IOException -> 0x0bbe }
            r0.A02()     // Catch:{ IOException -> 0x0bbe }
            throw r1     // Catch:{ IOException -> 0x0bbe }
        L_0x0bbe:
            r1 = move-exception
            goto L_0x0bc3
        L_0x0bc0:
            r1 = move-exception
            r37 = 3
        L_0x0bc3:
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0c36 }
            r6.A0L = r0     // Catch:{ all -> 0x0c36 }
            java.lang.String r0 = r1.getMessage()     // Catch:{ all -> 0x0c36 }
            if (r0 == 0) goto L_0x0bdd
            java.lang.String r2 = r1.getMessage()     // Catch:{ all -> 0x0c36 }
            java.lang.String r0 = "unknown format"
            boolean r0 = r2.contains(r0)     // Catch:{ all -> 0x0c36 }
            if (r0 == 0) goto L_0x0bdd
            goto L_0x0bfa
        L_0x0bdd:
            java.lang.Throwable r0 = r1.getCause()     // Catch:{ all -> 0x0c36 }
            if (r0 == 0) goto L_0x0bec
            java.lang.Throwable r0 = r1.getCause()     // Catch:{ all -> 0x0c36 }
            boolean r0 = r0 instanceof java.util.zip.DataFormatException     // Catch:{ all -> 0x0c36 }
            if (r0 == 0) goto L_0x0bec
            goto L_0x0bfa
        L_0x0bec:
            java.lang.Throwable r0 = r1.getCause()     // Catch:{ all -> 0x0c36 }
            if (r0 == 0) goto L_0x0bfc
            java.lang.Throwable r0 = r1.getCause()     // Catch:{ all -> 0x0c36 }
            boolean r0 = r0 instanceof javax.crypto.AEADBadTagException     // Catch:{ all -> 0x0c36 }
            if (r0 == 0) goto L_0x0bfc
        L_0x0bfa:
            r2 = 1
            goto L_0x0bfd
        L_0x0bfc:
            r2 = 0
        L_0x0bfd:
            r0 = r37
            if (r0 != r14) goto L_0x0c18
            if (r2 == 0) goto L_0x0c0d
            java.lang.String r0 = "MessageStoreBackup/restore/error/decrypting-failure"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0c36 }
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0c36 }
            r6.A02 = r0     // Catch:{ all -> 0x0c36 }
            goto L_0x0c12
        L_0x0c0d:
            java.lang.String r0 = "MessageStoreBackup/restore/error/IOException-during-incremental-message-restore"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0c36 }
        L_0x0c12:
            r0 = r22
            A04(r6, r0)     // Catch:{ Exception -> 0x14ea }
            goto L_0x0c42
        L_0x0c18:
            java.lang.String r0 = r1.getMessage()     // Catch:{ all -> 0x0c36 }
            if (r0 == 0) goto L_0x0c35
            java.lang.String r2 = r1.getMessage()     // Catch:{ all -> 0x0c36 }
            java.lang.String r0 = "ENOSPC"
            boolean r0 = r2.contains(r0)     // Catch:{ all -> 0x0c36 }
            if (r0 == 0) goto L_0x0c35
            java.lang.String r0 = "MessageStoreBackup/restore/error/no-space-left"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0c36 }
            r0 = r22
            A04(r6, r0)     // Catch:{ Exception -> 0x14ea }
            goto L_0x0c42
        L_0x0c35:
            throw r1     // Catch:{ all -> 0x0c36 }
        L_0x0c36:
            r1 = move-exception
            r0 = r22
            A04(r6, r0)     // Catch:{ Exception -> 0x14ea }
            goto L_0x0c5d
        L_0x0c3d:
            r0 = r22
            A04(r6, r0)     // Catch:{ Exception -> 0x14ea }
        L_0x0c42:
            long r2 = r42.A07()     // Catch:{ Exception -> 0x14ea }
            r0 = r34
            java.lang.Long r0 = X.AnonymousClass0x9.A0o(r2, r0)     // Catch:{ Exception -> 0x14ea }
            r6.A0I = r0     // Catch:{ Exception -> 0x14ea }
            goto L_0x0cb0
        L_0x0c4f:
            java.lang.String r0 = "MessageStoreBackup/restore/no increments for restore"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ Exception -> 0x14ea }
            goto L_0x0cb0
        L_0x0c55:
            throw r3     // Catch:{ all -> 0x0c56 }
        L_0x0c56:
            r1 = move-exception
            java.lang.Integer r0 = java.lang.Integer.valueOf(r14)     // Catch:{ Exception -> 0x14ea }
            r6.A0A = r0     // Catch:{ Exception -> 0x14ea }
        L_0x0c5d:
            throw r1     // Catch:{ Exception -> 0x14ea }
        L_0x0c5e:
            X.34i r10 = r7.A0h     // Catch:{ Exception -> 0x14ea }
            X.2sr r9 = r7.A07     // Catch:{ Exception -> 0x14ea }
            X.2f0 r8 = r7.A0I     // Catch:{ Exception -> 0x14ea }
            X.0WN r5 = r7.A08     // Catch:{ Exception -> 0x14ea }
            X.2s6 r4 = r7.A0C     // Catch:{ Exception -> 0x14ea }
            X.2fR r1 = r7.A0g     // Catch:{ Exception -> 0x14ea }
            X.2eK r0 = r7.A0b     // Catch:{ Exception -> 0x14ea }
            r65 = r0
            X.8qC r0 = r7.A0l     // Catch:{ Exception -> 0x14ea }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x14ea }
            X.0Xr r0 = (X.C06430Xr) r0     // Catch:{ Exception -> 0x14ea }
            r32 = 0
            r46 = r9
            r47 = r0
            r48 = r5
            r49 = r4
            r50 = r8
            r51 = r65
            r52 = r1
            r53 = r2
            r54 = r10
            r55 = r40
            r56 = r32
            X.0UR r58 = X.AnonymousClass0S7.A00(r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56)     // Catch:{ Exception -> 0x14ea }
            X.2oU r1 = r7.A0E     // Catch:{ 23v | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x14e3 }
            X.3dV r0 = r7.A0R     // Catch:{ 23v | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x14e3 }
            r0.A05()     // Catch:{ 23v | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x14e3 }
            java.io.File r0 = r0.A05     // Catch:{ 23v | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x14e3 }
            r64 = r3
            r60 = r57
            r59 = r1
            r61 = r0
            r62 = r3
            X.0NK r0 = r58.A04(r59, r60, r61, r62, r63, r64)     // Catch:{ 23v | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x14e3 }
            int r0 = r0.A00     // Catch:{ 23v | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x14e3 }
            if (r0 != r14) goto L_0x14f8
            goto L_0x0cb0
        L_0x0cae:
            if (r4 != r14) goto L_0x14f9
        L_0x0cb0:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r24)
            r6.A01 = r0
            X.3dV r0 = r7.A0R
            r39 = r0
            r39.A05()
            java.io.File r12 = r0.A05
            boolean r0 = r12.exists()
            r4 = 0
            if (r0 != 0) goto L_0x0cd3
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "MessageStoreBackup/restore/check-restored-db/missing-file "
            X.C18260x0.A1R(r1, r0, r12)
        L_0x0ccf:
            r4 = r38
            goto L_0x14f9
        L_0x0cd3:
            r3 = 0
            java.lang.String r5 = r12.getAbsolutePath()     // Catch:{ Exception -> 0x0d07 }
            X.37M r2 = new X.37M     // Catch:{ Exception -> 0x0d07 }
            r2.<init>(r12)     // Catch:{ Exception -> 0x0d07 }
            r1 = 536870928(0x20000010, float:1.0842042E-19)
            android.database.sqlite.SQLiteDatabase r2 = android.database.sqlite.SQLiteDatabase.openDatabase(r5, r3, r1, r2)     // Catch:{ Exception -> 0x0d07 }
            X.32M r1 = X.AnonymousClass350.A00(r2)     // Catch:{ all -> 0x0cfb }
            boolean r0 = r1.A04     // Catch:{ all -> 0x0cfb }
            if (r0 != 0) goto L_0x0cf5
            if (r2 == 0) goto L_0x0cf1
            r2.close()     // Catch:{ Exception -> 0x0d07 }
        L_0x0cf1:
            A03(r7, r12)
            goto L_0x0d10
        L_0x0cf5:
            if (r2 == 0) goto L_0x0d12
            r2.close()     // Catch:{ Exception -> 0x0d07 }
            goto L_0x0d12
        L_0x0cfb:
            r1 = move-exception
            if (r2 == 0) goto L_0x0d06
            r2.close()     // Catch:{ all -> 0x0d02 }
            goto L_0x0d06
        L_0x0d02:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ Exception -> 0x0d07 }
        L_0x0d06:
            throw r1     // Catch:{ Exception -> 0x0d07 }
        L_0x0d07:
            r1 = move-exception
            java.lang.String r0 = "MessageStoreBackup/integritycheck/error "
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x1603 }
            A03(r7, r12)
        L_0x0d10:
            r5 = -1
            goto L_0x0d1b
        L_0x0d12:
            A03(r7, r12)
            r3 = r1
            int r5 = r1.A00
            r0 = 1
            if (r5 == 0) goto L_0x0d1c
        L_0x0d1b:
            r0 = 0
        L_0x0d1c:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r6.A06 = r0
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "MessageStoreBackup/restore/errors/count "
            r2.append(r0)
            r2.append(r5)
            if (r3 == 0) goto L_0x0d59
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = " index="
            r1.append(r0)
            java.util.Map r0 = r3.A03
            X.AnonymousClass0x7.A1H(r1, r0)
            java.lang.String r0 = " other="
            r1.append(r0)
            java.util.List r0 = r3.A02
            int r0 = r0.size()
            java.lang.String r0 = X.AnonymousClass000.A0h(r1, r0)
        L_0x0d4d:
            X.C18260x0.A1L(r2, r0)
            if (r5 == 0) goto L_0x1452
            if (r24 != 0) goto L_0x0d5c
            X.C627536m.A0O(r12)
            goto L_0x0ccf
        L_0x0d59:
            java.lang.String r0 = ""
            goto L_0x0d4d
        L_0x0d5c:
            if (r3 == 0) goto L_0x0d6f
            java.util.Map r0 = r3.A03
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x0d6f
            java.util.List r0 = r3.A02
            int r0 = r0.size()
            r1 = 1
            if (r0 == 0) goto L_0x0d70
        L_0x0d6f:
            r1 = 0
        L_0x0d70:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r6.A08 = r0
            if (r1 == 0) goto L_0x0e8d
            java.io.File r1 = r7.A0M()
            boolean r0 = r1.exists()
            if (r0 == 0) goto L_0x0d8d
            boolean r0 = r1.delete()
            if (r0 != 0) goto L_0x0d8d
            java.lang.String r0 = "MessageStoreBackup/copydbtobackup/failed to delete backup file before copying from db."
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x0d8d:
            r39.A05()
            boolean r0 = r12.exists()
            if (r0 == 0) goto L_0x0e55
            r39.A05()
            r0 = r65
            X.C627536m.A0N(r0, r12, r1)
        L_0x0d9e:
            java.util.Map r0 = r3.A03
            java.util.Iterator r11 = X.AnonymousClass000.A0q(r0)
            r8 = 0
            r5 = 0
        L_0x0da6:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0e5c
            java.util.Map$Entry r10 = X.AnonymousClass001.A0w(r11)
            java.lang.String r3 = X.C18310x6.A0q(r10)
            java.lang.String r0 = "MessageStoreBackup/reindex"
            X.33M r2 = X.AnonymousClass33M.A01(r0)
            r39.A05()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0e22, SQLiteConstraintException -> 0x0e26, SQLiteFullException -> 0x0e2d, SQLiteException -> 0x0df1 }
            java.lang.String r9 = r12.getAbsolutePath()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0e22, SQLiteConstraintException -> 0x0e26, SQLiteFullException -> 0x0e2d, SQLiteException -> 0x0df1 }
            r1 = 536870928(0x20000010, float:1.0842042E-19)
            r0 = r32
            android.database.sqlite.SQLiteDatabase r9 = android.database.sqlite.SQLiteDatabase.openDatabase(r9, r0, r1)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0e22, SQLiteConstraintException -> 0x0e26, SQLiteFullException -> 0x0e2d, SQLiteException -> 0x0df1 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0de5 }
            java.lang.String r0 = "REINDEX "
            java.lang.String r0 = X.AnonymousClass000.A0V(r0, r3, r1)     // Catch:{ all -> 0x0de5 }
            r9.execSQL(r0)     // Catch:{ all -> 0x0de5 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0de5 }
            java.lang.String r0 = "MessageStoreBackup/reindex | time spent:"
            X.AnonymousClass33M.A05(r2, r0, r1)     // Catch:{ all -> 0x0de5 }
            r9.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0e22, SQLiteConstraintException -> 0x0e26, SQLiteFullException -> 0x0e2d, SQLiteException -> 0x0df1 }
            r2 = 1
            goto L_0x0e33
        L_0x0de5:
            r0 = move-exception
            if (r9 == 0) goto L_0x0df0
            r9.close()     // Catch:{ all -> 0x0dec }
            goto L_0x0df0
        L_0x0dec:
            r1 = move-exception
            r0.addSuppressed(r1)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0e22, SQLiteConstraintException -> 0x0e26, SQLiteFullException -> 0x0e2d, SQLiteException -> 0x0df1 }
        L_0x0df0:
            throw r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x0e22, SQLiteConstraintException -> 0x0e26, SQLiteFullException -> 0x0e2d, SQLiteException -> 0x0df1 }
        L_0x0df1:
            r3 = move-exception
            X.2oU r0 = r7.A0E
            android.content.Context r2 = r0.A00
            java.lang.String r1 = r3.toString()
            java.lang.String r0 = "unable to open"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x0e10
            X.2gF r1 = r7.A0i
            r0 = 2131889128(0x7f120be8, float:1.941291E38)
        L_0x0e08:
            java.lang.String r0 = r2.getString(r0)
            r1.A00(r0)
            goto L_0x0e32
        L_0x0e10:
            java.lang.String r1 = r3.toString()
            java.lang.String r0 = "attempt to write a readonly database"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x0e32
            X.2gF r1 = r7.A0i
            r0 = 2131889129(0x7f120be9, float:1.9412913E38)
            goto L_0x0e08
        L_0x0e22:
            r1 = move-exception
            java.lang.String r0 = "MessageStoreBackup/reindex/dbcorrupt"
            goto L_0x0e29
        L_0x0e26:
            r1 = move-exception
            java.lang.String r0 = "MessageStoreBackup/reindex/constraintexception "
        L_0x0e29:
            com.whatsapp.util.Log.w(r0, r1)
            goto L_0x0e32
        L_0x0e2d:
            X.1hj r0 = r7.A0P
            r0.A08(r4)
        L_0x0e32:
            r2 = 0
        L_0x0e33:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "MessageStoreBackup/restore/reindex/key: "
            r1.append(r0)
            java.lang.String r0 = X.C18310x6.A0q(r10)
            r1.append(r0)
            if (r2 == 0) goto L_0x0e52
            java.lang.String r0 = " ok"
        L_0x0e47:
            X.C18260x0.A1L(r1, r0)
            int r8 = r8 + 1
            if (r2 == 0) goto L_0x0e5c
            int r5 = r5 + 1
            goto L_0x0da6
        L_0x0e52:
            java.lang.String r0 = " failed"
            goto L_0x0e47
        L_0x0e55:
            java.lang.String r0 = "MessageStoreBackup/copydbtobackup/no db to backup."
            com.whatsapp.util.Log.w((java.lang.String) r0)
            goto L_0x0d9e
        L_0x0e5c:
            boolean r2 = A08(r12)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "MessageStoreBackup/restore/reindexresult/dbintegrity "
            r1.append(r0)
            if (r2 == 0) goto L_0x0ea3
            java.lang.String r0 = "ok"
        L_0x0e6e:
            X.C18260x0.A1L(r1, r0)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "MessageStoreBackup/restore/reindexresult/reindexed "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = "/"
            X.C18260x0.A0y(r0, r1, r8)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            r6.A05 = r0
            if (r2 != 0) goto L_0x1452
            r7.A0V()
        L_0x0e8d:
            r0 = 0
            java.lang.Double r1 = java.lang.Double.valueOf(r0)
            java.util.concurrent.atomic.AtomicReference r16 = new java.util.concurrent.atomic.AtomicReference
            r0 = r16
            r0.<init>(r1)
            X.2oU r0 = r7.A0E
            android.content.Context r0 = r0.A00
            r37 = r0
            X.2zf r8 = r7.A0H
            goto L_0x0ea6
        L_0x0ea3:
            java.lang.String r0 = "failed"
            goto L_0x0e6e
        L_0x0ea6:
            java.lang.String r0 = "sqlite"
            java.lang.System.loadLibrary(r0)     // Catch:{ UnsatisfiedLinkError -> 0x0ead }
            goto L_0x0ec3
        L_0x0ead:
            r2 = move-exception
            java.lang.String r0 = "libsqlite is not present on device, cannot perform dump and restore."
            goto L_0x0ebf
        L_0x0eb1:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Error while restoring dbFile "
            X.AnonymousClass000.A10(r12, r0, r1)
            java.lang.String r0 = r1.toString()
        L_0x0ebf:
            com.whatsapp.util.Log.e(r0, r2)
            goto L_0x0ee3
        L_0x0ec3:
            java.lang.String r0 = "sqlite-repair/recover-database sqlite_shell loaded"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            boolean r0 = r12.exists()
            if (r0 != 0) goto L_0x0f0f
            java.util.Locale r2 = java.util.Locale.ENGLISH
            java.lang.Object[] r1 = new java.lang.Object[r14]
            java.lang.String r0 = r12.getAbsolutePath()
            r1[r4] = r0
            java.lang.String r0 = "sqlite-repair/recover-database original database (%s) does not exist."
            java.lang.String r0 = java.lang.String.format(r2, r0, r1)
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0ee3:
            r0 = 0
        L_0x0ee4:
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "MessageStoreBackup/restore/dumpAndRestoreResult/"
            r3.append(r1)
            r3.append(r0)
            java.lang.String r2 = " recovery %age: "
            r1 = r16
            X.C18260x0.A1R(r3, r2, r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            r6.A07 = r1
            java.lang.Object r1 = r16.get()
            long r1 = X.C18310x6.A0B(r1)
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r6.A0F = r1
            if (r0 != 0) goto L_0x1452
            goto L_0x0ccf
        L_0x0f0f:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = r12.getAbsolutePath()
            r1.append(r0)
            java.lang.String r0 = "_new"
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)
            java.io.File r30 = X.AnonymousClass002.A0B(r0)
            X.C627536m.A0O(r30)
            r0 = 2
            long r2 = r12.length()
            long r2 = r2 * r0
            long r9 = r8.A03()
            int r0 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x0f47
            r0 = r37
            android.content.Intent r1 = X.C627736r.A0D(r0, r2)
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            android.content.Intent r1 = r1.setFlags(r0)
            r0 = r37
            r0.startActivity(r1)
        L_0x0f47:
            long r9 = r8.A03()
            int r0 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x0f73
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "waiting for "
            r5.append(r0)
            r5.append(r2)
            java.lang.String r0 = " bytes storage to be available, currently available storage space is "
            r5.append(r0)
            long r0 = r8.A03()
            r5.append(r0)
            java.lang.String r0 = " bytes"
            X.C18260x0.A1J(r5, r0)
            r0 = 200(0xc8, double:9.9E-322)
            android.os.SystemClock.sleep(r0)
            goto L_0x0f47
        L_0x0f73:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x0eb1 }
            java.lang.String r0 = "sqlite-repair/recover-database dbFile is "
            X.AnonymousClass000.A10(r12, r0, r1)     // Catch:{ Exception -> 0x0eb1 }
            java.lang.String r0 = " (Size: "
            X.C18280x3.A11(r12, r0, r1)     // Catch:{ Exception -> 0x0eb1 }
            java.lang.String r0 = ")"
            X.C18260x0.A1L(r1, r0)     // Catch:{ Exception -> 0x0eb1 }
            java.io.File r1 = r37.getFilesDir()     // Catch:{ Exception -> 0x0eb1 }
            java.lang.String r0 = "tmp_db_dump_schema"
            java.io.File r9 = X.AnonymousClass002.A0A(r1, r0)     // Catch:{ Exception -> 0x0eb1 }
            java.util.Locale r2 = java.util.Locale.ENGLISH     // Catch:{ Exception -> 0x0eb1 }
            java.lang.Object[] r1 = new java.lang.Object[r14]     // Catch:{ Exception -> 0x0eb1 }
            java.lang.String r0 = r9.getAbsolutePath()     // Catch:{ Exception -> 0x0eb1 }
            r1[r4] = r0     // Catch:{ Exception -> 0x0eb1 }
            java.lang.String r33 = ".read %s"
            r0 = r33
            java.lang.String r8 = java.lang.String.format(r2, r0, r1)     // Catch:{ Exception -> 0x0eb1 }
            X.C627536m.A0O(r9)     // Catch:{ Exception -> 0x0eb1 }
            java.lang.String r2 = r12.getAbsolutePath()     // Catch:{ all -> 0x1448 }
            java.lang.String r1 = r9.getAbsolutePath()     // Catch:{ all -> 0x1448 }
            java.lang.String r0 = ".schema"
            int r0 = com.whatsapp.SqliteShell.executeMetaCommand(r2, r1, r0)     // Catch:{ all -> 0x1448 }
            r17 = 0
            if (r0 == 0) goto L_0x0fdb
            java.lang.String r0 = "sqlite-repair/copy-schema/failed \".schema\""
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x1448 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x1448 }
            java.lang.String r0 = "sqlite-repair/copy-schema/result of command \".schema\" is \""
            r1.append(r0)     // Catch:{ all -> 0x1448 }
            java.io.FileInputStream r0 = X.AnonymousClass0x9.A0g(r9)     // Catch:{ all -> 0x1448 }
            java.lang.String r0 = X.C624535b.A00(r0)     // Catch:{ all -> 0x1448 }
            r1.append(r0)     // Catch:{ all -> 0x1448 }
            java.lang.String r0 = "\""
            X.C18260x0.A1L(r1, r0)     // Catch:{ all -> 0x1448 }
            goto L_0x10b9
        L_0x0fdb:
            java.lang.String r0 = "sqlite-repair/copy-schema/success \".schema\""
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x1448 }
            java.lang.String r11 = "ROLLBACK;"
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x1448 }
            java.lang.String r0 = r9.getAbsolutePath()     // Catch:{ all -> 0x1448 }
            r1.append(r0)     // Catch:{ all -> 0x1448 }
            java.lang.String r0 = ".tmp"
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ all -> 0x1448 }
            java.io.File r5 = X.AnonymousClass002.A0B(r0)     // Catch:{ all -> 0x1448 }
            java.lang.String r0 = "sqlite-repair/clean-schema-dump"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x1448 }
            boolean r0 = X.C627536m.A0O(r5)     // Catch:{ all -> 0x1448 }
            if (r0 == 0) goto L_0x10ab
            java.io.FileInputStream r1 = X.AnonymousClass0x9.A0g(r9)     // Catch:{ all -> 0x1448 }
            java.lang.String r2 = "ISO-8859-1"
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch:{ all -> 0x1448 }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x1448 }
            java.io.BufferedReader r10 = new java.io.BufferedReader     // Catch:{ all -> 0x1448 }
            r10.<init>(r0)     // Catch:{ all -> 0x1448 }
            java.io.FileOutputStream r1 = X.AnonymousClass0x9.A0h(r5)     // Catch:{ all -> 0x1414 }
            java.io.OutputStreamWriter r0 = new java.io.OutputStreamWriter     // Catch:{ UnsupportedEncodingException -> 0x140f }
            r0.<init>(r1, r2)     // Catch:{ UnsupportedEncodingException -> 0x140f }
            java.io.BufferedWriter r3 = new java.io.BufferedWriter     // Catch:{ UnsupportedEncodingException -> 0x140f }
            r3.<init>(r0)     // Catch:{ UnsupportedEncodingException -> 0x140f }
            java.lang.String r2 = r10.readLine()     // Catch:{ all -> 0x1405 }
        L_0x1026:
            if (r2 == 0) goto L_0x1072
            java.lang.String r15 = r10.readLine()     // Catch:{ all -> 0x1405 }
            if (r15 != 0) goto L_0x104e
            java.util.Locale r13 = java.util.Locale.US     // Catch:{ all -> 0x1405 }
            java.lang.String r0 = r2.toUpperCase(r13)     // Catch:{ all -> 0x1405 }
            boolean r0 = r0.contains(r11)     // Catch:{ all -> 0x1405 }
            if (r0 == 0) goto L_0x104e
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x1405 }
            java.lang.String r0 = "sqlite-repair/clean-schema-dump replacing following statement with 'commit transaction': "
            X.C18260x0.A0s(r0, r2, r1)     // Catch:{ all -> 0x1405 }
            java.lang.String r1 = r2.toUpperCase(r13)     // Catch:{ all -> 0x1405 }
            java.lang.String r0 = "COMMIT TRANSACTION;"
            java.lang.String r2 = r1.replace(r11, r0)     // Catch:{ all -> 0x1405 }
        L_0x104e:
            java.util.Locale r0 = java.util.Locale.US     // Catch:{ all -> 0x1405 }
            java.lang.String r1 = r2.toUpperCase(r0)     // Catch:{ all -> 0x1405 }
            java.lang.String r0 = "CREATE TABLE 'MESSAGES_FTS_"
            boolean r0 = r1.startsWith(r0)     // Catch:{ all -> 0x1405 }
            if (r0 == 0) goto L_0x1068
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x1405 }
            java.lang.String r0 = "sqlite-repair/clean-schema-dump creation of virtual table messages_fts will take care of this, ignoring: "
            X.C18260x0.A0s(r0, r2, r1)     // Catch:{ all -> 0x1405 }
            java.lang.String r2 = ""
        L_0x1068:
            r3.write(r2)     // Catch:{ all -> 0x1405 }
            java.lang.String r0 = "\n"
            r3.write(r0)     // Catch:{ all -> 0x1405 }
            r2 = r15
            goto L_0x1026
        L_0x1072:
            r3.close()     // Catch:{ all -> 0x1414 }
            r10.close()     // Catch:{ all -> 0x1448 }
            java.util.Locale r3 = java.util.Locale.ENGLISH     // Catch:{ all -> 0x1448 }
            r0 = 5
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ all -> 0x1448 }
            java.lang.String r0 = r9.getAbsolutePath()     // Catch:{ all -> 0x1448 }
            r2[r4] = r0     // Catch:{ all -> 0x1448 }
            long r0 = r9.length()     // Catch:{ all -> 0x1448 }
            X.AnonymousClass000.A1Q(r2, r14, r0)     // Catch:{ all -> 0x1448 }
            java.lang.String r0 = r5.getAbsolutePath()     // Catch:{ all -> 0x1448 }
            r2[r28] = r0     // Catch:{ all -> 0x1448 }
            long r0 = r5.length()     // Catch:{ all -> 0x1448 }
            r10 = r38
            X.AnonymousClass000.A1Q(r2, r10, r0)     // Catch:{ all -> 0x1448 }
            r0 = 4
            r2[r0] = r9     // Catch:{ all -> 0x1448 }
            java.lang.String r0 = "sqlite-repair/clean-schema-dump deleting %s (size %d), renaming %s (size:%d) -> %s"
            java.lang.String.format(r3, r0, r2)     // Catch:{ all -> 0x1448 }
            boolean r0 = r9.delete()     // Catch:{ all -> 0x1448 }
            if (r0 == 0) goto L_0x10ab
            r5.renameTo(r9)     // Catch:{ all -> 0x1448 }
        L_0x10ab:
            java.lang.String r1 = r30.getAbsolutePath()     // Catch:{ all -> 0x1448 }
            java.lang.String r0 = "/dev/null"
            int r0 = com.whatsapp.SqliteShell.executeMetaCommand(r1, r0, r8)     // Catch:{ all -> 0x1448 }
            if (r0 != 0) goto L_0x10b9
            r17 = 1
        L_0x10b9:
            X.C627536m.A0O(r9)     // Catch:{ Exception -> 0x0eb1 }
            if (r17 == 0) goto L_0x0ee3
            java.io.File r1 = r37.getFilesDir()     // Catch:{ Exception -> 0x0eb1 }
            java.lang.String r31 = "tmp_db_dump_table"
            r0 = r31
            java.io.File r2 = X.AnonymousClass002.A0A(r1, r0)     // Catch:{ Exception -> 0x0eb1 }
            java.lang.String r1 = r12.getAbsolutePath()     // Catch:{ Exception -> 0x0eb1 }
            java.lang.String r0 = r2.getAbsolutePath()     // Catch:{ Exception -> 0x0eb1 }
            java.lang.String r3 = ".tables"
            int r0 = com.whatsapp.SqliteShell.executeMetaCommand(r1, r0, r3)     // Catch:{ Exception -> 0x0eb1 }
            if (r0 == 0) goto L_0x10f9
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x0eb1 }
            java.lang.String r0 = "sqlite-repair/get-tables/failed \""
            r1.append(r0)     // Catch:{ Exception -> 0x0eb1 }
            r1.append(r3)     // Catch:{ Exception -> 0x0eb1 }
            java.lang.String r0 = "\""
            X.C18260x0.A1K(r1, r0)     // Catch:{ Exception -> 0x0eb1 }
        L_0x10ed:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x0eb1 }
            java.lang.String r0 = "sqlite-repair/recover-database/failed-to-get-tables "
            X.C18260x0.A1R(r1, r0, r12)     // Catch:{ Exception -> 0x0eb1 }
            goto L_0x0ee3
        L_0x10f9:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x0eb1 }
            java.lang.String r0 = "sqlite-repair/get-tables/success \""
            r1.append(r0)     // Catch:{ Exception -> 0x0eb1 }
            r1.append(r3)     // Catch:{ Exception -> 0x0eb1 }
            java.lang.String r23 = "\" dump size:"
            r0 = r23
            java.lang.String r0 = X.AnonymousClass000.A0N(r2, r0, r1)     // Catch:{ Exception -> 0x0eb1 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ Exception -> 0x0eb1 }
            java.util.ArrayList r9 = X.AnonymousClass001.A0s()     // Catch:{ Exception -> 0x0eb1 }
            java.io.FileInputStream r8 = X.AnonymousClass0x9.A0g(r2)     // Catch:{ Exception -> 0x0eb1 }
            java.lang.String r1 = X.C624535b.A00(r8)     // Catch:{ all -> 0x143e }
            java.lang.String r0 = "[\\t\\n\\r, ]"
            java.lang.String[] r3 = android.text.TextUtils.split(r1, r0)     // Catch:{ all -> 0x143e }
            int r2 = r3.length     // Catch:{ all -> 0x143e }
            r1 = 0
        L_0x1125:
            if (r1 >= r2) goto L_0x1139
            r0 = r3[r1]     // Catch:{ all -> 0x143e }
            java.lang.String r0 = r0.trim()     // Catch:{ all -> 0x143e }
            int r5 = r0.length()     // Catch:{ all -> 0x143e }
            if (r5 <= 0) goto L_0x1136
            r9.add(r0)     // Catch:{ all -> 0x143e }
        L_0x1136:
            int r1 = r1 + 1
            goto L_0x1125
        L_0x1139:
            r8.close()     // Catch:{ Exception -> 0x0eb1 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x0eb1 }
            java.lang.String r0 = "sqlite-repair/get-tables/ "
            r1.append(r0)     // Catch:{ Exception -> 0x0eb1 }
            java.lang.String r0 = ","
            java.lang.String r0 = android.text.TextUtils.join(r0, r9)     // Catch:{ Exception -> 0x0eb1 }
            X.C18260x0.A1L(r1, r0)     // Catch:{ Exception -> 0x0eb1 }
            int r0 = r9.size()     // Catch:{ Exception -> 0x0eb1 }
            if (r0 == 0) goto L_0x10ed
            r5 = 0
        L_0x1156:
            int r0 = r9.size()     // Catch:{ Exception -> 0x0eb1 }
            if (r5 >= r0) goto L_0x1323
            java.util.Locale r8 = java.util.Locale.ENGLISH     // Catch:{ Exception -> 0x0eb1 }
            java.lang.String r3 = "sqlite-repair/recover-database/reading-table %d/%d: %s"
            r0 = r38
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x0eb1 }
            int r22 = r5 + 1
            r0 = r22
            X.AnonymousClass000.A1P(r2, r0, r4)     // Catch:{ Exception -> 0x0eb1 }
            int r0 = r9.size()     // Catch:{ Exception -> 0x0eb1 }
            X.AnonymousClass000.A1P(r2, r0, r14)     // Catch:{ Exception -> 0x0eb1 }
            int r1 = r9.size()     // Catch:{ Exception -> 0x0eb1 }
            r0 = r28
            X.AnonymousClass000.A1P(r2, r1, r0)     // Catch:{ Exception -> 0x0eb1 }
            X.C18320x8.A1J(r3, r8, r2)     // Catch:{ Exception -> 0x0eb1 }
            java.lang.Object r1 = r9.get(r5)     // Catch:{ Exception -> 0x0eb1 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x0eb1 }
            java.io.File r2 = r37.getFilesDir()     // Catch:{ Exception -> 0x0eb1 }
            r0 = r31
            java.io.File r5 = X.AnonymousClass002.A0A(r2, r0)     // Catch:{ Exception -> 0x0eb1 }
            X.C627536m.A0O(r5)     // Catch:{ Exception -> 0x0eb1 }
            java.lang.Object[] r0 = new java.lang.Object[r14]     // Catch:{ all -> 0x144d }
            r0[r4] = r1     // Catch:{ all -> 0x144d }
            java.lang.String r1 = ".dump %s"
            java.lang.String r2 = java.lang.String.format(r8, r1, r0)     // Catch:{ all -> 0x144d }
            java.lang.String r1 = r12.getAbsolutePath()     // Catch:{ all -> 0x144d }
            java.lang.String r0 = r5.getAbsolutePath()     // Catch:{ all -> 0x144d }
            int r0 = com.whatsapp.SqliteShell.executeMetaCommand(r1, r0, r2)     // Catch:{ all -> 0x144d }
            if (r0 == 0) goto L_0x1304
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x144d }
            java.lang.String r0 = "sqlite-repair/recover-database-table/failed \""
            r1.append(r0)     // Catch:{ all -> 0x144d }
            r1.append(r2)     // Catch:{ all -> 0x144d }
            java.lang.String r0 = "\""
            X.C18260x0.A1K(r1, r0)     // Catch:{ all -> 0x144d }
        L_0x11bc:
            java.lang.String r13 = "ROLLBACK;"
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x144d }
            java.lang.String r0 = r5.getAbsolutePath()     // Catch:{ all -> 0x144d }
            r1.append(r0)     // Catch:{ all -> 0x144d }
            java.lang.String r0 = ".tmp"
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ all -> 0x144d }
            java.io.File r3 = X.AnonymousClass002.A0B(r0)     // Catch:{ all -> 0x144d }
            boolean r0 = r3.exists()     // Catch:{ all -> 0x144d }
            if (r0 == 0) goto L_0x120c
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x144d }
            java.lang.String r0 = "sqlite-repair/cleanup-per-table-dump-file deleting "
            X.C18260x0.A1R(r1, r0, r3)     // Catch:{ all -> 0x144d }
            boolean r0 = r3.delete()     // Catch:{ all -> 0x144d }
            if (r0 != 0) goto L_0x120c
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x144d }
            java.lang.String r0 = "sqlite-repair/cleanup-per-table-dump-file failed to delete "
            X.C18260x0.A1S(r1, r0, r3)     // Catch:{ all -> 0x144d }
        L_0x11f3:
            java.lang.String r3 = r30.getAbsolutePath()     // Catch:{ all -> 0x144d }
            java.lang.String r2 = "/dev/null"
            java.lang.Object[] r1 = new java.lang.Object[r14]     // Catch:{ all -> 0x144d }
            java.lang.String r0 = r5.getAbsolutePath()     // Catch:{ all -> 0x144d }
            r1[r4] = r0     // Catch:{ all -> 0x144d }
            r0 = r33
            java.lang.String r0 = java.lang.String.format(r8, r0, r1)     // Catch:{ all -> 0x144d }
            com.whatsapp.SqliteShell.executeMetaCommand(r3, r2, r0)     // Catch:{ all -> 0x144d }
            goto L_0x131c
        L_0x120c:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x144d }
            java.lang.String r0 = "sqlite-repair/cleanup-per-table-dump-file "
            java.lang.String r0 = X.AnonymousClass0x7.A0o(r5, r0, r1)     // Catch:{ all -> 0x144d }
            X.C18260x0.A1L(r1, r0)     // Catch:{ all -> 0x144d }
            java.io.FileInputStream r0 = X.AnonymousClass0x9.A0g(r5)     // Catch:{ all -> 0x144d }
            java.lang.String r2 = "ISO-8859-1"
            java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch:{ all -> 0x144d }
            r1.<init>(r0, r2)     // Catch:{ all -> 0x144d }
            java.io.BufferedReader r21 = new java.io.BufferedReader     // Catch:{ all -> 0x144d }
            r0 = r21
            r0.<init>(r1)     // Catch:{ all -> 0x144d }
            java.io.FileOutputStream r1 = X.AnonymousClass0x9.A0h(r3)     // Catch:{ all -> 0x142d }
            java.io.OutputStreamWriter r0 = new java.io.OutputStreamWriter     // Catch:{ UnsupportedEncodingException -> 0x1428 }
            r0.<init>(r1, r2)     // Catch:{ UnsupportedEncodingException -> 0x1428 }
            java.io.BufferedWriter r11 = new java.io.BufferedWriter     // Catch:{ UnsupportedEncodingException -> 0x1428 }
            r11.<init>(r0)     // Catch:{ UnsupportedEncodingException -> 0x1428 }
            java.lang.String r10 = r21.readLine()     // Catch:{ all -> 0x141e }
            r20 = 1
        L_0x1240:
            if (r10 == 0) goto L_0x12cb
            java.lang.String r17 = r21.readLine()     // Catch:{ all -> 0x141e }
            if (r17 != 0) goto L_0x1268
            java.util.Locale r2 = java.util.Locale.US     // Catch:{ all -> 0x141e }
            java.lang.String r0 = r10.toUpperCase(r2)     // Catch:{ all -> 0x141e }
            boolean r0 = r0.contains(r13)     // Catch:{ all -> 0x141e }
            if (r0 == 0) goto L_0x1268
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x141e }
            java.lang.String r0 = "sqlite-repair/cleanup-per-table-dump-file replacing following statement with 'commit transaction': "
            X.C18260x0.A0s(r0, r10, r1)     // Catch:{ all -> 0x141e }
            java.lang.String r1 = r10.toUpperCase(r2)     // Catch:{ all -> 0x141e }
            java.lang.String r0 = "COMMIT TRANSACTION;"
            java.lang.String r10 = r1.replace(r13, r0)     // Catch:{ all -> 0x141e }
        L_0x1268:
            java.util.Locale r15 = java.util.Locale.US     // Catch:{ all -> 0x141e }
            java.lang.String r2 = r10.toUpperCase(r15)     // Catch:{ all -> 0x141e }
            java.lang.String r1 = "\""
            java.lang.String r0 = "'"
            java.lang.String r1 = r2.replace(r1, r0)     // Catch:{ all -> 0x141e }
            java.lang.String r0 = "CREATE TABLE 'MESSAGES_FTS_"
            boolean r0 = r1.startsWith(r0)     // Catch:{ all -> 0x141e }
            java.lang.String r2 = ""
            if (r0 == 0) goto L_0x128b
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x141e }
            java.lang.String r0 = "sqlite-repair/cleanup-per-table-dump-file creation of virtual table messages_fts will take care of this, ignoring: "
            X.C18260x0.A0s(r0, r10, r1)     // Catch:{ all -> 0x141e }
            r10 = r2
        L_0x128b:
            if (r20 == 0) goto L_0x12a6
            java.lang.String r1 = r10.toUpperCase(r15)     // Catch:{ all -> 0x141e }
            java.lang.String r0 = "CREATE TABLE "
            boolean r0 = r1.startsWith(r0)     // Catch:{ all -> 0x141e }
            if (r0 == 0) goto L_0x12a4
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x141e }
            java.lang.String r0 = "sqlite-repair/cleanup-per-table-dump-file transaction started, ignoring: "
            X.C18260x0.A0s(r0, r10, r1)     // Catch:{ all -> 0x141e }
            r10 = r2
        L_0x12a4:
            r20 = 0
        L_0x12a6:
            java.lang.String r1 = r10.toUpperCase(r15)     // Catch:{ all -> 0x141e }
            java.lang.String r0 = "INSERT INTO SQLITE_MASTER"
            boolean r0 = r1.startsWith(r0)     // Catch:{ all -> 0x141e }
            if (r0 == 0) goto L_0x12c5
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x141e }
            java.lang.String r0 = "sqlite-repair/cleanup-per-table-dump-file ignoring: "
            X.C18260x0.A0s(r0, r10, r1)     // Catch:{ all -> 0x141e }
        L_0x12bc:
            r11.write(r2)     // Catch:{ all -> 0x141e }
            java.lang.String r0 = "\n"
            r11.write(r0)     // Catch:{ all -> 0x141e }
            goto L_0x12c7
        L_0x12c5:
            r2 = r10
            goto L_0x12bc
        L_0x12c7:
            r10 = r17
            goto L_0x1240
        L_0x12cb:
            r11.close()     // Catch:{ all -> 0x142d }
            r21.close()     // Catch:{ all -> 0x144d }
            r0 = 5
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ all -> 0x144d }
            java.lang.String r0 = r5.getAbsolutePath()     // Catch:{ all -> 0x144d }
            r2[r4] = r0     // Catch:{ all -> 0x144d }
            long r0 = r5.length()     // Catch:{ all -> 0x144d }
            X.AnonymousClass000.A1Q(r2, r14, r0)     // Catch:{ all -> 0x144d }
            java.lang.String r0 = r3.getAbsolutePath()     // Catch:{ all -> 0x144d }
            r2[r28] = r0     // Catch:{ all -> 0x144d }
            long r0 = r3.length()     // Catch:{ all -> 0x144d }
            r10 = r38
            X.AnonymousClass000.A1Q(r2, r10, r0)     // Catch:{ all -> 0x144d }
            r0 = 4
            r2[r0] = r5     // Catch:{ all -> 0x144d }
            java.lang.String r0 = "sqlite-repair/cleanup-per-table-dump-file deleting %s (size %d), renaming %s (size:%d) -> %s"
            java.lang.String.format(r8, r0, r2)     // Catch:{ all -> 0x144d }
            boolean r0 = r5.delete()     // Catch:{ all -> 0x144d }
            if (r0 == 0) goto L_0x11f3
            r3.renameTo(r5)     // Catch:{ all -> 0x144d }
            goto L_0x11f3
        L_0x1304:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x144d }
            java.lang.String r0 = "sqlite-repair/recover-database-table/success \""
            r1.append(r0)     // Catch:{ all -> 0x144d }
            r1.append(r2)     // Catch:{ all -> 0x144d }
            r0 = r23
            java.lang.String r0 = X.AnonymousClass000.A0N(r5, r0, r1)     // Catch:{ all -> 0x144d }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x144d }
            goto L_0x11bc
        L_0x131c:
            X.C627536m.A0O(r5)     // Catch:{ Exception -> 0x0eb1 }
            r5 = r22
            goto L_0x1156
        L_0x1323:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x0eb1 }
            java.lang.String r2 = "sqlite-repair/set-db-version "
            r0 = r30
            java.lang.String r0 = X.AnonymousClass0x7.A0o(r0, r2, r1)     // Catch:{ Exception -> 0x0eb1 }
            X.C18260x0.A1L(r1, r0)     // Catch:{ Exception -> 0x0eb1 }
            java.lang.String r2 = r30.getAbsolutePath()     // Catch:{ Exception -> 0x0eb1 }
            r1 = 536870928(0x20000010, float:1.0842042E-19)
            r0 = r32
            android.database.sqlite.SQLiteDatabase r0 = android.database.sqlite.SQLiteDatabase.openDatabase(r2, r0, r1)     // Catch:{ Exception -> 0x0eb1 }
            r0.setVersion(r14)     // Catch:{ all -> 0x1437 }
            r0.close()     // Catch:{ Exception -> 0x0eb1 }
            int r0 = A00(r12)     // Catch:{ Exception -> 0x0eb1 }
            long r4 = (long) r0     // Catch:{ Exception -> 0x0eb1 }
            int r0 = A00(r30)     // Catch:{ Exception -> 0x0eb1 }
            long r2 = (long) r0     // Catch:{ Exception -> 0x0eb1 }
            java.lang.StringBuilder r0 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x0eb1 }
            java.lang.String r1 = "sqlite-repair/check-restored-db/orig number of messages \""
            X.AnonymousClass000.A10(r12, r1, r0)     // Catch:{ Exception -> 0x0eb1 }
            java.lang.String r9 = "\" is "
            X.C18260x0.A12(r9, r0, r4)     // Catch:{ Exception -> 0x0eb1 }
            java.lang.StringBuilder r8 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x0eb1 }
            java.lang.String r1 = "sqlite-repair/check-restored-db/restored number of messages \""
            r0 = r30
            X.AnonymousClass000.A10(r0, r1, r8)     // Catch:{ Exception -> 0x0eb1 }
            X.C18260x0.A12(r9, r8, r2)     // Catch:{ Exception -> 0x0eb1 }
            java.lang.StringBuilder r13 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x0eb1 }
            java.lang.String r0 = "sqlite-repair/check-restored-db/ratio "
            r13.append(r0)     // Catch:{ Exception -> 0x0eb1 }
            double r8 = (double) r2     // Catch:{ Exception -> 0x0eb1 }
            r22 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r0 = r8 * r22
            double r10 = (double) r4     // Catch:{ Exception -> 0x0eb1 }
            double r0 = r0 / r10
            r13.append(r0)     // Catch:{ Exception -> 0x0eb1 }
            X.C18280x3.A14(r13)     // Catch:{ Exception -> 0x0eb1 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x0eb1 }
            java.lang.String r17 = "sqlite-repair/check-restored-db integrity of "
            r0 = r17
            r1.append(r0)     // Catch:{ Exception -> 0x0eb1 }
            r1.append(r12)     // Catch:{ Exception -> 0x0eb1 }
            java.lang.String r15 = " is "
            r1.append(r15)     // Catch:{ Exception -> 0x0eb1 }
            boolean r0 = A08(r12)     // Catch:{ Exception -> 0x0eb1 }
            X.C18260x0.A1U(r1, r0)     // Catch:{ Exception -> 0x0eb1 }
            java.lang.StringBuilder r13 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x0eb1 }
            r1 = r30
            r0 = r17
            X.AnonymousClass000.A10(r1, r0, r13)     // Catch:{ Exception -> 0x0eb1 }
            r13.append(r15)     // Catch:{ Exception -> 0x0eb1 }
            boolean r0 = A08(r30)     // Catch:{ Exception -> 0x0eb1 }
            X.C18260x0.A1U(r13, r0)     // Catch:{ Exception -> 0x0eb1 }
            r0 = 0
            r20 = 0
            int r13 = (r2 > r20 ? 1 : (r2 == r20 ? 0 : -1))
            if (r13 >= 0) goto L_0x13c9
            r1 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            java.lang.Double r2 = java.lang.Double.valueOf(r1)     // Catch:{ Exception -> 0x0eb1 }
            r1 = r16
            r1.set(r2)     // Catch:{ Exception -> 0x0eb1 }
            goto L_0x0ee4
        L_0x13c9:
            int r1 = (r4 > r20 ? 1 : (r4 == r20 ? 0 : -1))
            if (r1 > 0) goto L_0x13de
            if (r13 <= 0) goto L_0x13de
            r1 = 4636807660098813952(0x4059400000000000, double:101.0)
            java.lang.Double r2 = java.lang.Double.valueOf(r1)     // Catch:{ Exception -> 0x0eb1 }
            r1 = r16
            r1.set(r2)     // Catch:{ Exception -> 0x0eb1 }
            goto L_0x13e0
        L_0x13de:
            r4 = 0
            goto L_0x13e1
        L_0x13e0:
            r4 = 1
        L_0x13e1:
            double r8 = r8 / r10
            r2 = 4599075939470750515(0x3fd3333333333333, double:0.3)
            int r1 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r1 < 0) goto L_0x13ec
            goto L_0x13ef
        L_0x13ec:
            if (r4 == 0) goto L_0x0ee4
            goto L_0x13fa
        L_0x13ef:
            double r8 = r8 * r22
            java.lang.Double r2 = java.lang.Double.valueOf(r8)     // Catch:{ Exception -> 0x0eb1 }
            r1 = r16
            r1.set(r2)     // Catch:{ Exception -> 0x0eb1 }
        L_0x13fa:
            r1 = r30
            boolean r1 = r1.renameTo(r12)     // Catch:{ Exception -> 0x0eb1 }
            if (r1 == 0) goto L_0x0ee4
            r0 = 1
            goto L_0x0ee4
        L_0x1405:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x140a }
            goto L_0x1413
        L_0x140a:
            r1 = move-exception
            r0.addSuppressed(r1)     // Catch:{ all -> 0x1414 }
            goto L_0x1413
        L_0x140f:
            r0 = move-exception
            X.C624535b.A03(r1)     // Catch:{ all -> 0x1414 }
        L_0x1413:
            throw r0     // Catch:{ all -> 0x1414 }
        L_0x1414:
            r1 = move-exception
            r10.close()     // Catch:{ all -> 0x1419 }
            goto L_0x141d
        L_0x1419:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x1448 }
        L_0x141d:
            throw r1     // Catch:{ all -> 0x1448 }
        L_0x141e:
            r0 = move-exception
            r11.close()     // Catch:{ all -> 0x1423 }
            goto L_0x142c
        L_0x1423:
            r1 = move-exception
            r0.addSuppressed(r1)     // Catch:{ all -> 0x142d }
            goto L_0x142c
        L_0x1428:
            r0 = move-exception
            X.C624535b.A03(r1)     // Catch:{ all -> 0x142d }
        L_0x142c:
            throw r0     // Catch:{ all -> 0x142d }
        L_0x142d:
            r1 = move-exception
            r21.close()     // Catch:{ all -> 0x1432 }
            goto L_0x1436
        L_0x1432:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x144d }
        L_0x1436:
            throw r1     // Catch:{ all -> 0x144d }
        L_0x1437:
            r1 = move-exception
            if (r0 == 0) goto L_0x1451
            r0.close()     // Catch:{ all -> 0x1443 }
            goto L_0x1451
        L_0x143e:
            r1 = move-exception
            r8.close()     // Catch:{ all -> 0x1443 }
            goto L_0x1451
        L_0x1443:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ Exception -> 0x0eb1 }
            goto L_0x1451
        L_0x1448:
            r1 = move-exception
            X.C627536m.A0O(r9)     // Catch:{ Exception -> 0x0eb1 }
            goto L_0x1451
        L_0x144d:
            r1 = move-exception
            X.C627536m.A0O(r5)     // Catch:{ Exception -> 0x0eb1 }
        L_0x1451:
            throw r1     // Catch:{ Exception -> 0x0eb1 }
        L_0x1452:
            r39.A05()
            r0 = r39
            X.0xz r4 = r0.A04
            monitor-enter(r4)
            r9 = 0
            r8 = 0
            java.lang.String r0 = "DatabaseHelper/verifyBackup - initialize backup verification."
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x1600 }
            X.2am r3 = r4.A05     // Catch:{ all -> 0x1600 }
            monitor-enter(r3)     // Catch:{ all -> 0x1600 }
            boolean r2 = r3.A00     // Catch:{ all -> 0x15fd }
            monitor-exit(r3)     // Catch:{ all -> 0x1600 }
            X.2Kk r0 = r4.A01()     // Catch:{ all -> 0x1600 }
            X.2Kl r1 = new X.2Kl     // Catch:{ all -> 0x1600 }
            r1.<init>(r0)     // Catch:{ all -> 0x1600 }
            r3.A00(r14)     // Catch:{ SQLiteException -> 0x14a6, Exception -> 0x149f }
            X.2sg r0 = r4.BEc()     // Catch:{ SQLiteException -> 0x14a6, Exception -> 0x149f }
            java.lang.String r5 = "DatabaseHelper/verifyBackup - force re-create missing indexes."
            com.whatsapp.util.Log.i((java.lang.String) r5)     // Catch:{ SQLiteException -> 0x14a6, Exception -> 0x149f }
            java.lang.String r5 = "DatabaseHelper/verifyBackup/restoreIndexes"
            X.33M r5 = X.AnonymousClass33M.A01(r5)     // Catch:{ SQLiteException -> 0x148f, Exception -> 0x149f }
            r4.A07(r0, r1)     // Catch:{ SQLiteException -> 0x148f, Exception -> 0x149f }
            long r0 = r5.A07()     // Catch:{ SQLiteException -> 0x148f, Exception -> 0x149f }
            long r0 = r0 / r34
            r9 = r0
            r8 = 1
            goto L_0x1495
        L_0x148f:
            r1 = move-exception
            java.lang.String r0 = "DatabaseHelper/verifyBackup/restoreIndexes - database error."
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ SQLiteException -> 0x14a6, Exception -> 0x149f }
        L_0x1495:
            r4.close()     // Catch:{ SQLiteException -> 0x14a6, Exception -> 0x149f }
            java.lang.String r0 = "DatabaseHelper/verifyBackup - database is valid and ready to be used."
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ SQLiteException -> 0x14a6, Exception -> 0x149f }
            r1 = 1
            goto L_0x14ad
        L_0x149f:
            r1 = move-exception
            java.lang.String r0 = "DatabaseHelper/verifyBackup - unknown error."
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x15f8 }
            goto L_0x14ac
        L_0x14a6:
            r1 = move-exception
            java.lang.String r0 = "DatabaseHelper/verifyBackup - database error."
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x15f8 }
        L_0x14ac:
            r1 = 0
        L_0x14ad:
            r3.A00(r2)     // Catch:{ all -> 0x1600 }
            monitor-exit(r4)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r8)
            r6.A09 = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r9)
            r6.A0J = r0
            if (r1 == 0) goto L_0x0ccf
            if (r24 == 0) goto L_0x14d9
            X.2y5 r1 = r7.A0d
            java.lang.String r0 = X.C58152un.A0A
            android.content.SharedPreferences$Editor r1 = X.C60152y5.A00(r1, r0)
            java.lang.String r0 = "maintain_db_integrity"
            r1.putBoolean(r0, r14)
            boolean r0 = r1.commit()
            if (r0 != 0) goto L_0x14dd
            java.lang.String r0 = "MessageStoreBackup/restore/maintain-db-integrity/failed"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x14d9:
            r38 = 1
            goto L_0x0ccf
        L_0x14dd:
            java.lang.String r0 = "MessageStoreBackup/restore/maintain-db-integrity/success"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            goto L_0x14d9
        L_0x14e3:
            r1 = move-exception
            java.lang.String r0 = "MessageStoreBackup/restore/plaintext error"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ Exception -> 0x14ea }
            goto L_0x14f8
        L_0x14ea:
            r1 = move-exception
            java.lang.String r0 = "MessageStoreBackup/restore/error"
            com.whatsapp.util.Log.w(r0, r1)
            java.lang.String r0 = r1.toString()
            r6.A0L = r0
            r4 = 3
            goto L_0x14f9
        L_0x14f8:
            r4 = 3
        L_0x14f9:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "MessageStoreBackup/restore/result/"
            X.C18260x0.A0y(r0, r1, r4)
            if (r4 == r14) goto L_0x1506
            r36 = 0
        L_0x1506:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r36)
            r6.A04 = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r74)
            r6.A0K = r0
            r0 = 1
            if (r4 == r14) goto L_0x151f
            r0 = 2
            if (r4 == r0) goto L_0x151f
            r0 = 3
            if (r4 == r0) goto L_0x151f
            r0 = 4
            if (r4 == r0) goto L_0x151f
            r0 = 5
        L_0x151f:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6.A0C = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r72)
            r6.A0D = r0
            int r0 = r7.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6.A0B = r0
            X.33p r1 = r7.A0G
            r0 = 512(0x200, float:7.175E-43)
            r1.A11(r0)
            long r2 = r43.A07()
            r0 = r34
            java.lang.Long r0 = X.AnonymousClass0x9.A0o(r2, r0)
            r6.A0G = r0
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "MessageStoreBackup/restore/log-chat-db-restore-event overall-result: "
            r1.append(r0)
            java.lang.Boolean r0 = r6.A04
            r1.append(r0)
            java.lang.String r0 = " database-backup-version: "
            r1.append(r0)
            java.lang.Long r0 = r6.A0E
            r1.append(r0)
            java.lang.String r0 = " file-integrity-check: "
            r1.append(r0)
            java.lang.Boolean r0 = r6.A03
            r1.append(r0)
            java.lang.String r0 = " jid-correct: "
            r1.append(r0)
            java.lang.Boolean r0 = r6.A02
            r1.append(r0)
            java.lang.String r0 = " database-repair-enabled: "
            r1.append(r0)
            java.lang.Boolean r0 = r6.A01
            r1.append(r0)
            java.lang.String r0 = " sqlite-integrity-check: "
            r1.append(r0)
            java.lang.Boolean r0 = r6.A06
            r1.append(r0)
            java.lang.String r0 = " has-only-index-errors: "
            r1.append(r0)
            java.lang.Boolean r0 = r6.A08
            r1.append(r0)
            java.lang.String r0 = " dump-and-restore-result: "
            r1.append(r0)
            java.lang.Boolean r0 = r6.A07
            r1.append(r0)
            java.lang.String r0 = " dump-and-restore-recovery-percentage: "
            r1.append(r0)
            java.lang.Long r0 = r6.A0F
            X.C18260x0.A0o(r0, r1)
            X.4FV r0 = r7.A0a
            r0.BhD(r6)
            if (r4 == r14) goto L_0x15dc
            r0 = r28
            if (r4 == r0) goto L_0x15d2
            r0 = 3
            if (r4 == r0) goto L_0x00b7
            r0 = 4
            if (r4 == r0) goto L_0x15c8
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "MessageStoreBackup/restore/failure/out-of-space "
            r0 = r40
            java.lang.String r0 = X.AnonymousClass0x7.A0p(r0, r1, r2)
            X.C18260x0.A1M(r2, r0)
            r26 = 1
            goto L_0x00c6
        L_0x15c8:
            int r27 = r27 + 1
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r2 = "MessageStoreBackup/restore/failure/jid-mismatch "
            goto L_0x00bd
        L_0x15d2:
            int r29 = r29 + 1
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r2 = "MessageStoreBackup/restore/failure/file-integrity "
            goto L_0x00bd
        L_0x15dc:
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "MessageStoreBackup/restore/success "
            r0 = r40
            java.lang.String r0 = X.AnonymousClass0x7.A0p(r0, r1, r2)
            X.C18260x0.A1L(r2, r0)
            r19 = 1
            goto L_0x00c6
        L_0x15ef:
            java.lang.String r0 = "repair-disabled"
            goto L_0x0081
        L_0x15f4:
            int r25 = r25 + 1
            goto L_0x0015
        L_0x15f8:
            r0 = move-exception
            r3.A00(r2)     // Catch:{ all -> 0x1600 }
            goto L_0x15ff
        L_0x15fd:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x1600 }
        L_0x15ff:
            throw r0     // Catch:{ all -> 0x1600 }
        L_0x1600:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x1603:
            r0 = move-exception
            A03(r7, r12)
            throw r0
        L_0x1608:
            r2 = 1
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0l(r45)
            if (r19 == 0) goto L_0x1662
            java.lang.String r0 = "success"
        L_0x1612:
            r3.append(r0)
            java.lang.String r0 = " num-backup-files-attempts: "
            r3.append(r0)
            r0 = r28
            r3.append(r0)
            java.lang.String r0 = " num-integrity-failure: "
            r3.append(r0)
            r0 = r29
            r3.append(r0)
            java.lang.String r1 = " num-jid-mismatch: "
            r0 = r27
            X.C18260x0.A0y(r1, r3, r0)
            if (r19 != 0) goto L_0x1644
            X.2d4 r0 = r7.A0S
            r0.A00()
            X.2q5 r0 = r7.A0Q
            r0.A03()
            if (r26 == 0) goto L_0x164a
            java.lang.String r0 = "MessageStoreBackup/restore/nothing-restored/out-of-space"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r2 = 5
        L_0x1644:
            X.2xb r0 = new X.2xb
            r0.<init>(r2)
            return r0
        L_0x164a:
            if (r27 <= 0) goto L_0x1653
            java.lang.String r0 = "MessageStoreBackup/restore/nothing-restored/some-failures-are-jid-mismatch"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r2 = 3
            goto L_0x1644
        L_0x1653:
            r1 = r29
            r0 = r28
            if (r1 != r0) goto L_0x1660
            java.lang.String r0 = "MessageStoreBackup/restore/nothing-restored/all-failures-are-file-integrity-issues"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r2 = 4
            goto L_0x1644
        L_0x1660:
            r2 = 0
            goto L_0x1644
        L_0x1662:
            java.lang.String r0 = "failed"
            goto L_0x1612
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C625835r.A0H(X.4BZ, java.util.List, int):X.2xb");
    }

    /* JADX WARNING: Removed duplicated region for block: B:104:0x026c  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0168  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass1RM A0I(X.C15500rR r13) {
        /*
            r12 = this;
            java.lang.String r0 = "MessageStoreBackup/restoreFromMigration"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.3DX r13 = (X.AnonymousClass3DX) r13
            X.1qE r0 = r13.A00
            X.4MC r6 = r0.A02
            boolean r0 = r6.isCancelled()
            java.lang.String r11 = "MessageStoreBackup/restoreFromMigration/canceled"
            if (r0 != 0) goto L_0x0261
            X.2d4 r0 = r12.A0S
            r0.A00()
            X.2q5 r0 = r12.A0Q
            r0.A03()
            X.32y r3 = r12.A0f
            java.lang.String r0 = "MigrateFileDirectlyHelper/migrateMsgStoreFile"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r5 = 0
            X.33i r9 = r3.A01     // Catch:{ IOException -> 0x00cb, SecurityException -> 0x00cd }
            X.5UR r2 = r9.A0R()     // Catch:{ IOException -> 0x00cb, SecurityException -> 0x00cd }
            java.lang.String r8 = "msg_store"
            X.33p r7 = r3.A03     // Catch:{ IOException -> 0x00cb, SecurityException -> 0x00cd }
            java.lang.String r1 = r7.A0Z()     // Catch:{ IOException -> 0x00cb, SecurityException -> 0x00cd }
            java.lang.String r0 = r7.A0b()     // Catch:{ IOException -> 0x00cb, SecurityException -> 0x00cd }
            android.net.Uri r1 = X.C619632y.A00(r8, r1, r0)     // Catch:{ IOException -> 0x00cb, SecurityException -> 0x00cd }
            java.lang.String r0 = "r"
            android.os.ParcelFileDescriptor r4 = r2.A05(r1, r0)     // Catch:{ IOException -> 0x00cb, SecurityException -> 0x00cd }
            if (r4 == 0) goto L_0x00a8
            java.io.FileDescriptor r0 = r4.getFileDescriptor()     // Catch:{ all -> 0x00bf }
            if (r0 == 0) goto L_0x00a8
            X.5UR r2 = r9.A0R()     // Catch:{ all -> 0x00bf }
            java.lang.String r1 = r7.A0Z()     // Catch:{ all -> 0x00bf }
            java.lang.String r0 = r7.A0b()     // Catch:{ all -> 0x00bf }
            android.net.Uri r1 = X.C619632y.A00(r8, r1, r0)     // Catch:{ all -> 0x00bf }
            r0 = 0
            X.C162457s7.A0J(r1, r0)     // Catch:{ all -> 0x00bf }
            android.content.ContentResolver r0 = r2.A02()     // Catch:{ all -> 0x00bf }
            java.lang.String r1 = r0.getType(r1)     // Catch:{ all -> 0x00bf }
            X.2oU r0 = r3.A02     // Catch:{ all -> 0x00bf }
            java.io.File r0 = X.C54292oU.A03(r0)     // Catch:{ all -> 0x00bf }
            java.io.File r2 = X.AnonymousClass002.A0A(r0, r1)     // Catch:{ all -> 0x00bf }
            boolean r0 = r2.exists()     // Catch:{ all -> 0x00bf }
            if (r0 == 0) goto L_0x0092
            boolean r0 = r2.delete()     // Catch:{ all -> 0x00bf }
            if (r0 != 0) goto L_0x0092
            java.lang.String r0 = "MigrateFileDirectlyHelper/migrateMsgStoreFile/failed-to-delete"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x00bf }
            r1 = 15
            X.1RM r0 = new X.1RM     // Catch:{ all -> 0x00bf }
            r0.<init>(r1)     // Catch:{ all -> 0x00bf }
            android.util.Pair r0 = X.AnonymousClass0x9.A0C(r0, r5)     // Catch:{ all -> 0x00bf }
            r4.close()     // Catch:{ IOException -> 0x00cb, SecurityException -> 0x00cd }
            goto L_0x015a
        L_0x0092:
            java.io.FileDescriptor r0 = r4.getFileDescriptor()     // Catch:{ all -> 0x00bf }
            int r1 = r3.A02(r2, r0)     // Catch:{ all -> 0x00bf }
            X.1RM r0 = new X.1RM     // Catch:{ all -> 0x00bf }
            r0.<init>(r1)     // Catch:{ all -> 0x00bf }
            android.util.Pair r0 = X.AnonymousClass0x9.A0C(r0, r2)     // Catch:{ all -> 0x00bf }
            r4.close()     // Catch:{ IOException -> 0x00cb, SecurityException -> 0x00cd }
            goto L_0x015a
        L_0x00a8:
            java.lang.String r0 = "MigrateFileDirectlyHelper/migrateMsgStoreFile/consumer file is null"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x00bf }
            r1 = 15
            X.1RM r0 = new X.1RM     // Catch:{ all -> 0x00bf }
            r0.<init>(r1)     // Catch:{ all -> 0x00bf }
            android.util.Pair r0 = X.AnonymousClass0x9.A0C(r0, r5)     // Catch:{ all -> 0x00bf }
            if (r4 == 0) goto L_0x015a
            r4.close()     // Catch:{ IOException -> 0x00cb, SecurityException -> 0x00cd }
            goto L_0x015a
        L_0x00bf:
            r1 = move-exception
            if (r4 == 0) goto L_0x00ca
            r4.close()     // Catch:{ all -> 0x00c6 }
            goto L_0x00ca
        L_0x00c6:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x00cb, SecurityException -> 0x00cd }
        L_0x00ca:
            throw r1     // Catch:{ IOException -> 0x00cb, SecurityException -> 0x00cd }
        L_0x00cb:
            r0 = move-exception
            goto L_0x00ce
        L_0x00cd:
            r0 = move-exception
        L_0x00ce:
            java.lang.String r7 = r0.toString()
            java.lang.String r4 = "MigrateFileDirectlyHelper/parseErrorCodeIfPossible/"
            java.lang.String r0 = ":\\s"
            java.lang.String[] r2 = r7.split(r0)     // Catch:{ NumberFormatException -> 0x0144 }
            int r1 = r2.length     // Catch:{ NumberFormatException -> 0x0144 }
            r0 = 2
            if (r1 != r0) goto L_0x0148
            r0 = 1
            r0 = r2[r0]     // Catch:{ NumberFormatException -> 0x0144 }
            int r2 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x0144 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ NumberFormatException -> 0x0144 }
            java.lang.String r0 = "MigrateFileDirectlyHelper/parseErrorCodeIfPossible/error while fetching msg store: error is = "
            r1.append(r0)     // Catch:{ NumberFormatException -> 0x0144 }
            switch(r2) {
                case 0: goto L_0x0139;
                case 1: goto L_0x0136;
                case 2: goto L_0x0133;
                case 3: goto L_0x0130;
                case 4: goto L_0x012d;
                case 5: goto L_0x012a;
                case 6: goto L_0x0127;
                case 7: goto L_0x0124;
                case 8: goto L_0x0121;
                case 9: goto L_0x011e;
                case 10: goto L_0x011b;
                case 11: goto L_0x0118;
                case 12: goto L_0x0115;
                case 13: goto L_0x0112;
                case 14: goto L_0x010f;
                case 15: goto L_0x010c;
                case 16: goto L_0x0109;
                case 17: goto L_0x0106;
                case 18: goto L_0x0103;
                case 19: goto L_0x0100;
                case 20: goto L_0x00fd;
                default: goto L_0x00f1;
            }     // Catch:{ NumberFormatException -> 0x0144 }
        L_0x00f1:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ NumberFormatException -> 0x0144 }
            java.lang.String r0 = "state is not recognized = "
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0G(r0, r1, r2)     // Catch:{ NumberFormatException -> 0x0144 }
            throw r0     // Catch:{ NumberFormatException -> 0x0144 }
        L_0x00fd:
            java.lang.String r0 = "FAILED_DECRYPTION_KEY_MISSING"
            goto L_0x013b
        L_0x0100:
            java.lang.String r0 = "SUCCESS_TRANSFER_DB_FILE"
            goto L_0x013b
        L_0x0103:
            java.lang.String r0 = "BACKUP_FAILED_INVALID"
            goto L_0x013b
        L_0x0106:
            java.lang.String r0 = "BACKUP_FAILED_OUT_OF_SPACE"
            goto L_0x013b
        L_0x0109:
            java.lang.String r0 = "BACKUP_FAILED_GENERIC"
            goto L_0x013b
        L_0x010c:
            java.lang.String r0 = "FAILED_TO_GET_BACKUP_FILE"
            goto L_0x013b
        L_0x010f:
            java.lang.String r0 = "MSG_DB_DOES_NOT_EXIST"
            goto L_0x013b
        L_0x0112:
            java.lang.String r0 = "PHONE_NUMBER_MISMATCH"
            goto L_0x013b
        L_0x0115:
            java.lang.String r0 = "INCORRECT_FILE_MODE"
            goto L_0x013b
        L_0x0118:
            java.lang.String r0 = "REQUESTER_APP_VERSION_INCORRECT"
            goto L_0x013b
        L_0x011b:
            java.lang.String r0 = "INCORRECT_CALLER_PACKAGE_NAME"
            goto L_0x013b
        L_0x011e:
            java.lang.String r0 = "APP_SIGNATURE_MISMATCH"
            goto L_0x013b
        L_0x0121:
            java.lang.String r0 = "PROVIDER_SERVER_PROP_NOT_ENABLED"
            goto L_0x013b
        L_0x0124:
            java.lang.String r0 = "FAILED_CANCELED"
            goto L_0x013b
        L_0x0127:
            java.lang.String r0 = "FAILED_MSG_STORE_ALREADY_EXISTS"
            goto L_0x013b
        L_0x012a:
            java.lang.String r0 = "FAILED_OUT_OF_SPACE"
            goto L_0x013b
        L_0x012d:
            java.lang.String r0 = "FAILED_FILE_INTEGRITY_CHECK"
            goto L_0x013b
        L_0x0130:
            java.lang.String r0 = "FAILED_JID_MISMATCH"
            goto L_0x013b
        L_0x0133:
            java.lang.String r0 = "SUCCESS_CREATED"
            goto L_0x013b
        L_0x0136:
            java.lang.String r0 = "SUCCESS_RESTORED"
            goto L_0x013b
        L_0x0139:
            java.lang.String r0 = "FAILED"
        L_0x013b:
            X.C18260x0.A1K(r1, r0)     // Catch:{ NumberFormatException -> 0x0144 }
            X.1RM r1 = new X.1RM     // Catch:{ NumberFormatException -> 0x0144 }
            r1.<init>(r2)     // Catch:{ NumberFormatException -> 0x0144 }
            goto L_0x0156
        L_0x0144:
            r0 = move-exception
            com.whatsapp.util.Log.e(r4, r0)
        L_0x0148:
            java.lang.StringBuilder r0 = X.AnonymousClass001.A0o()
            X.C18260x0.A0r(r4, r7, r0)
            r0 = 15
            X.1RM r1 = new X.1RM
            r1.<init>(r0)
        L_0x0156:
            android.util.Pair r0 = X.AnonymousClass0x9.A0C(r1, r5)
        L_0x015a:
            java.lang.Object r2 = r0.first
            X.1RM r2 = (X.AnonymousClass1RM) r2
            java.lang.Object r5 = r0.second
            java.io.File r5 = (java.io.File) r5
            boolean r0 = r6.isCancelled()
            if (r0 != 0) goto L_0x0261
            int r1 = r2.A00
            r0 = 19
            if (r0 != r1) goto L_0x0260
            if (r5 == 0) goto L_0x0260
            java.lang.String r0 = "MessageStoreBackup/restoreFromMigration/received-file-decrypting"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r0 = r5.getName()
            X.22O r1 = X.C57202tG.A00(r0)
            X.22O r0 = X.AnonymousClass22O.CRYPT15
            if (r1 != r0) goto L_0x022b
            r8 = 0
            java.lang.String r0 = "RSA"
            java.security.KeyPairGenerator r1 = java.security.KeyPairGenerator.getInstance(r0)     // Catch:{ IOException | NoSuchAlgorithmException -> 0x0227 }
            r0 = 2024(0x7e8, float:2.836E-42)
            r1.initialize(r0)     // Catch:{ IOException | NoSuchAlgorithmException -> 0x0227 }
            java.security.KeyPair r10 = r1.generateKeyPair()     // Catch:{ IOException | NoSuchAlgorithmException -> 0x0227 }
            android.os.Bundle r9 = X.AnonymousClass002.A08()     // Catch:{ IOException | NoSuchAlgorithmException -> 0x0227 }
            java.lang.String r1 = "query_param_country_code"
            X.33p r7 = r3.A03     // Catch:{ IOException | NoSuchAlgorithmException -> 0x0227 }
            java.lang.String r0 = r7.A0Z()     // Catch:{ IOException | NoSuchAlgorithmException -> 0x0227 }
            r9.putString(r1, r0)     // Catch:{ IOException | NoSuchAlgorithmException -> 0x0227 }
            java.lang.String r1 = "query_param_phone_number"
            java.lang.String r0 = r7.A0b()     // Catch:{ IOException | NoSuchAlgorithmException -> 0x0227 }
            r9.putString(r1, r0)     // Catch:{ IOException | NoSuchAlgorithmException -> 0x0227 }
            java.lang.String r1 = "pk"
            java.security.PublicKey r0 = r10.getPublic()     // Catch:{ IOException | NoSuchAlgorithmException -> 0x0227 }
            byte[] r0 = r0.getEncoded()     // Catch:{ IOException | NoSuchAlgorithmException -> 0x0227 }
            r9.putByteArray(r1, r0)     // Catch:{ IOException | NoSuchAlgorithmException -> 0x0227 }
            X.33i r0 = r3.A01     // Catch:{ IOException | NoSuchAlgorithmException -> 0x0227 }
            X.5UR r4 = r0.A0R()     // Catch:{ IOException | NoSuchAlgorithmException -> 0x0227 }
            java.lang.String r2 = ""
            java.lang.String r1 = r7.A0Z()     // Catch:{ IOException | NoSuchAlgorithmException -> 0x0227 }
            java.lang.String r0 = r7.A0b()     // Catch:{ IOException | NoSuchAlgorithmException -> 0x0227 }
            android.net.Uri r1 = X.C619632y.A00(r2, r1, r0)     // Catch:{ IOException | NoSuchAlgorithmException -> 0x0227 }
            java.lang.String r0 = "retrieve_rk"
            android.os.Bundle r9 = r4.A04(r1, r9, r0)     // Catch:{ IOException | NoSuchAlgorithmException -> 0x0227 }
            if (r9 != 0) goto L_0x01dd
            java.lang.String r0 = "MigrateFileDirectlyHelper/migrateBackupEncryptionKey null returned"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ IOException | NoSuchAlgorithmException -> 0x0227 }
            goto L_0x025d
        L_0x01dd:
            java.security.PrivateKey r0 = r10.getPrivate()     // Catch:{ IOException | NoSuchAlgorithmException -> 0x0227 }
            byte[] r1 = r0.getEncoded()     // Catch:{ IOException | NoSuchAlgorithmException -> 0x0227 }
            java.lang.String r0 = "erk"
            byte[] r0 = X.C619632y.A01(r9, r0, r1)     // Catch:{ IOException | NoSuchAlgorithmException -> 0x0227 }
            if (r0 != 0) goto L_0x01f3
            java.lang.String r0 = "MigrateFileDirectlyHelper/migrateBackupEncryptionKey root key is null"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ IOException | NoSuchAlgorithmException -> 0x0227 }
            goto L_0x025d
        L_0x01f3:
            X.0Qy r4 = r3.A00     // Catch:{ IOException | NoSuchAlgorithmException -> 0x0227 }
            r4.A08(r0)     // Catch:{ IOException | NoSuchAlgorithmException -> 0x0227 }
            java.lang.String r0 = "ph"
            byte[] r3 = X.C619632y.A01(r9, r0, r1)     // Catch:{ IOException | NoSuchAlgorithmException -> 0x0227 }
            java.lang.String r0 = "ps"
            byte[] r2 = X.C619632y.A01(r9, r0, r1)     // Catch:{ IOException | NoSuchAlgorithmException -> 0x0227 }
            java.lang.String r1 = "ic"
            r0 = 100000(0x186a0, float:1.4013E-40)
            int r1 = r9.getInt(r1, r0)     // Catch:{ IOException | NoSuchAlgorithmException -> 0x0227 }
            r0 = 1
            r7.A1u(r0)     // Catch:{ IOException | NoSuchAlgorithmException -> 0x0227 }
            if (r3 == 0) goto L_0x0223
            if (r2 == 0) goto L_0x0223
            X.0Lx r0 = new X.0Lx     // Catch:{ IOException | NoSuchAlgorithmException -> 0x0227 }
            r0.<init>(r3, r2, r1)     // Catch:{ IOException | NoSuchAlgorithmException -> 0x0227 }
            r4.A07(r0)     // Catch:{ IOException | NoSuchAlgorithmException -> 0x0227 }
            r7.A1v(r8)     // Catch:{ IOException | NoSuchAlgorithmException -> 0x0227 }
            goto L_0x0266
        L_0x0223:
            r7.A1v(r0)     // Catch:{ IOException | NoSuchAlgorithmException -> 0x0227 }
            goto L_0x0266
        L_0x0227:
            r1 = move-exception
            java.lang.String r0 = "MigrateFileDirectlyHelper/migrateBackupEncryptionKey failed"
            goto L_0x025a
        L_0x022b:
            X.2f0 r4 = r12.A0I
            X.3dJ r3 = new X.3dJ
            r3.<init>()
            java.util.List r2 = java.util.Collections.singletonList(r5)
            r1 = 49
            X.5rT r0 = new X.5rT
            r0.<init>(r4, r1, r3)
            r4.A00(r0, r2)
            java.lang.String r0 = "MessageStoreBackup/restoreFromMigration/try to get cipher key"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x0257 }
            r0 = 3
            r12.A00 = r0     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x0257 }
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x0257 }
            r0 = 32000(0x7d00, double:1.581E-319)
            java.lang.Object r0 = r3.get(r0, r2)     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x0257 }
            boolean r0 = X.AnonymousClass001.A1Z(r0)     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x0257 }
            if (r0 == 0) goto L_0x025d
            goto L_0x0266
        L_0x0257:
            r1 = move-exception
            java.lang.String r0 = "MessageStoreBackup/restoreFromMigration/exception"
        L_0x025a:
            com.whatsapp.util.Log.e(r0, r1)
        L_0x025d:
            r1 = 20
            goto L_0x027d
        L_0x0260:
            return r2
        L_0x0261:
            com.whatsapp.util.Log.i((java.lang.String) r11)
            r1 = 7
            goto L_0x027d
        L_0x0266:
            boolean r0 = r6.isCancelled()
            if (r0 != 0) goto L_0x0261
            java.lang.String r0 = "MessageStoreBackup/restoreFromMigration/restore-db-from-backup-now"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.util.List r2 = java.util.Collections.singletonList(r5)
            r1 = 1
            r0 = 0
            X.2xb r0 = r12.A0H(r0, r2, r1)
            int r1 = r0.A00
        L_0x027d:
            X.1RM r0 = new X.1RM
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C625835r.A0I(X.0rR):X.1RM");
    }

    public File A0J() {
        File file;
        synchronized (this.A0o) {
            file = this.A02;
            if (file == null) {
                file = AnonymousClass002.A0A(this.A0B.A03(), "msgstore.db");
                this.A02 = file;
            }
        }
        return file;
    }

    public final File A0M() {
        File file;
        synchronized (this.A0o) {
            file = this.A01;
            if (file == null) {
                file = this.A0E.A00.getDatabasePath("msgstore.db-backup");
                this.A01 = file;
            }
        }
        return file;
    }

    public File A0N(AnonymousClass22O r4) {
        if (r4 == AnonymousClass22O.UNENCRYPTED) {
            return A0J();
        }
        return C18270x1.A0A(this.A0B.A03(), C06550Ye.A08(r4), AnonymousClass000.A0l("msgstore.db"));
    }

    public final File A0O(File file, long j) {
        C61072zf r5 = this.A0H;
        if (r5.A03() < 3 * j) {
            Log.i("MessageStoreBackup/backup/prepare/db/not enough internal storage to make db copy");
            return file;
        }
        try {
            C48092eK r2 = this.A0b;
            File A002 = r2.A00.A00("");
            if (!C627536m.A0N(r2, file, A002)) {
                Log.i("MessageStoreBackup/backup/prepare/db/failed to copy");
                return file;
            } else if (r5.A02() < j * 2) {
                Log.i("MessageStoreBackup/backup/prepare/db/not enough external storage to use db copy");
                A002.delete();
                return file;
            } else {
                Log.i("MessageStoreBackup/backup/prepare/db/let's use db copy");
                return A002;
            }
        } catch (IOException e) {
            Log.w("MessageStoreBackup/backup/prepare/db/source failed", e);
            return file;
        }
    }

    public ArrayList A0P() {
        Log.d("MessageStoreBackup/getbackupfiles/includeolderfiles");
        ArrayList A092 = C06550Ye.A09(A0J(), C06550Ye.A0A(AnonymousClass22O.A01()));
        C06550Ye.A0M(A0J(), A092);
        return A092;
    }

    public Set A0U() {
        return Collections.unmodifiableSet(this.A0p);
    }

    public final void A0V() {
        C72303dV r3 = this.A0R;
        r3.A05();
        File file = r3.A05;
        if (file.exists()) {
            r3.A05();
            if (!file.delete()) {
                Log.w("MessageStoreBackup/copybackuptodb/failed to delete db before copying from backup up.");
            }
        }
        File A0M2 = A0M();
        if (A0M2.exists()) {
            C48092eK r0 = this.A0b;
            r3.A05();
            C627536m.A0N(r0, A0M2, file);
            return;
        }
        Log.w("MessageStoreBackup/copybackuptodb/no backup db to copy.");
    }

    public final void A0W() {
        ((C66423Lj) this.A0n.get()).A03(true);
        AnonymousClass0x9.A1I(this.A03);
        C72303dV r0 = this.A0R;
        r0.A05();
        r0.A06.unlock();
    }

    public void A0X(int i) {
        this.A00 = i;
    }

    public boolean A0Z() {
        return Boolean.TRUE.equals(this.A03.A07());
    }

    public static final String A02(AnonymousClass22O r4, boolean z) {
        String A0X2;
        StringBuilder A0o2 = AnonymousClass001.A0o();
        String str = "";
        if (z) {
            A0X2 = str;
        } else {
            StringBuilder A0o3 = AnonymousClass001.A0o();
            A0o3.append("(-(\\d{4})-(\\d{2})-(\\d{2})");
            A0o3.append(Pattern.quote("."));
            A0o3.append("(\\d+)");
            A0X2 = AnonymousClass000.A0X(")?", A0o3);
        }
        StringBuilder A0w = C18290x4.A0w(A0X2, A0o2);
        A0w.append(".db");
        if (r4 != AnonymousClass22O.UNENCRYPTED) {
            str = C06550Ye.A08(r4);
        }
        return AnonymousClass000.A0X(Pattern.quote(AnonymousClass000.A0X(str, A0w)), A0o2);
    }

    public static void A06(String str, AbstractCollection abstractCollection, Iterator it, Pattern pattern, int i) {
        File file = (File) it.next();
        if (file.getName().endsWith(str) && i == pattern.matcher(file.getName()).find()) {
            abstractCollection.add(file);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002c, code lost:
        if (r2 != null) goto L_0x002e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A07(android.database.sqlite.SQLiteDatabase r2, java.lang.String r3) {
        /*
            java.lang.String r0 = "table"
            java.lang.String[] r1 = X.AnonymousClass0x9.A1Z()
            X.AnonymousClass000.A16(r0, r3, r1)
            java.lang.String r0 = "SELECT sql FROM sqlite_master WHERE type = ? AND name = ?"
            android.database.Cursor r2 = r2.rawQuery(r0, r1)
            if (r2 == 0) goto L_0x002a
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0020 }
            if (r0 == 0) goto L_0x002a
            java.lang.String r0 = "sql"
            java.lang.String r0 = X.AnonymousClass0x2.A0Z(r2, r0)     // Catch:{ all -> 0x0020 }
            goto L_0x002e
        L_0x0020:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x0025 }
            throw r1
        L_0x0025:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x002a:
            java.lang.String r0 = ""
            if (r2 == 0) goto L_0x0031
        L_0x002e:
            r2.close()
        L_0x0031:
            boolean r0 = X.C18320x8.A1U(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C625835r.A07(android.database.sqlite.SQLiteDatabase, java.lang.String):boolean");
    }

    public static final boolean A09(File file, String str) {
        File parentFile = file.getParentFile();
        C626936e.A06(parentFile);
        if (parentFile.exists()) {
            return true;
        }
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("MessageStoreBackup/");
        A0o2.append(str);
        C18260x0.A1L(A0o2, "/createdir");
        if (parentFile.mkdirs()) {
            return true;
        }
        C18260x0.A1M(AnonymousClass000.A0m("MessageStoreBackup/", str), "/createdir failed");
        return false;
    }

    public int A0B() {
        for (AnonymousClass22O r2 : AnonymousClass22O.values()) {
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append("MessageStoreBackup/getbackupfilecount/backupfile/");
            AnonymousClass0x2.A1N(A0o2, C06550Ye.A08(r2));
            C18260x0.A0m(A0N(r2), A0o2);
        }
        return A0P().size();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:254:0x071d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:?, code lost:
        r1.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x0730, code lost:
        if (r0.booleanValue() != false) goto L_0x0746;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x073a, code lost:
        if (r0.booleanValue() != false) goto L_0x0746;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x0744, code lost:
        if (r0.booleanValue() != false) goto L_0x0746;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x08a7, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:319:0x08b0, code lost:
        if (r8.A0H.A02() == 0) goto L_0x08b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:0x08b2, code lost:
        com.whatsapp.util.Log.w("MessageStoreBackup/backupDatabase/out-of-space");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:322:?, code lost:
        X.C18260x0.A12("MessageStoreBackup/backupDatabase | time spent: ", X.AnonymousClass001.A0o(), A01(r24));
        r4 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:?, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:325:0x08c7, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:?, code lost:
        r12.A01(X.AnonymousClass000.A0P(r2, "MessageStoreBackup/backupDatabase/failed ", X.AnonymousClass001.A0o()), 4);
        r7.A0C = r2.toString();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:325:0x08c7 A[ExcHandler: UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException (r2v14 'e' java.lang.Object A[CUSTOM_DECLARE]), Splitter:B:149:0x03fd] */
    /* JADX WARNING: Removed duplicated region for block: B:347:0x0952 A[Catch:{ SQLiteException -> 0x0963, all -> 0x09f1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:358:0x09bb A[Catch:{ SQLiteException -> 0x0963, all -> 0x09f1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:361:0x09c9  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:127:0x0393=Splitter:B:127:0x0393, B:313:0x088b=Splitter:B:313:0x088b, B:328:0x08dc=Splitter:B:328:0x08dc} */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:82:0x01a7=Splitter:B:82:0x01a7, B:364:0x09db=Splitter:B:364:0x09db} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A0C(X.C16370su r48, int r49, int r50) {
        /*
            r47 = this;
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "MessageStoreBackup/backupdb backupTypeToCreate="
            r9 = r49
            X.C18260x0.A0y(r0, r1, r9)
            r8 = r47
            X.2oU r0 = r8.A0E
            android.content.Context r0 = r0.A00
            r45 = r0
            X.2fR r12 = r8.A0g
            java.lang.String r0 = "checkaccounthashvalidity"
            r6 = 0
            r12.A01(r0, r6)
            X.0NX r5 = X.C06550Ye.A05(r45)     // Catch:{ Exception -> 0x0a1a }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "checkaccounthashvalidity/null-check: backup key is null = "
            r1.append(r0)
            boolean r0 = X.AnonymousClass000.A1X(r5)
            java.lang.String r0 = X.C18300x5.A0m(r1, r0)
            r4 = 2
            r12.A01(r0, r4)
            if (r5 == 0) goto L_0x0a29
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "checkaccounthashvalidity/google id salt is null = "
            r3.append(r0)
            X.0Nl r0 = r5.A00
            byte[] r2 = r0.A02
            r3.append(r6)
            java.lang.String r0 = " hashedGoogleId is null = "
            r3.append(r0)
            byte[] r1 = r5.A02
            java.lang.String r0 = X.C18300x5.A0m(r3, r6)
            r12.A01(r0, r4)
            byte[] r0 = X.C06550Ye.A0T(r2)
            boolean r0 = java.util.Arrays.equals(r0, r1)
            if (r0 == 0) goto L_0x0a29
            X.2pj r4 = r8.A0L
            r3 = 1
            X.3bj r2 = r4.A08
            r0 = 0
            r4.A01(r2, r0, r3)
            X.3dV r0 = r8.A0R
            r44 = r0
            X.4Fq r2 = r44.A04()
            X.3Yo r3 = r2.Axl()     // Catch:{ all -> 0x0a10 }
            r44.A05()     // Catch:{ all -> 0x0a06 }
            X.0xz r0 = r0.A04     // Catch:{ all -> 0x0a06 }
            r22 = r0
            X.2sg r0 = r0.A00     // Catch:{ all -> 0x0a06 }
            if (r0 == 0) goto L_0x09ff
            java.lang.String r0 = "databasehelper/cleanBeforeBackup"
            X.33M r1 = X.AnonymousClass33M.A01(r0)     // Catch:{ all -> 0x0a06 }
            r0 = r22
            r0.A03(r2)     // Catch:{ all -> 0x0a06 }
            r1.A07()     // Catch:{ all -> 0x0a06 }
            r3.A00()     // Catch:{ all -> 0x0a06 }
            r3.close()     // Catch:{ all -> 0x0a10 }
            r2.close()
            java.lang.String r0 = "MessageStoreBackup/backupdb/ephemeral purge is done and starting backup now"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1bF r7 = new X.1bF
            r7.<init>()
            r6 = 1
            r0 = r50
            if (r0 != r6) goto L_0x00b2
            X.1iO r0 = r8.A04
            boolean r0 = r0.A00
            if (r0 == 0) goto L_0x00b2
            java.lang.String r0 = "MessageStoreBackup/backup/skipping message backup since app is in foreground"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r0 = 4
            return r0
        L_0x00b2:
            X.1VX r5 = r8.A0Z
            r0 = 3968(0xf80, float:5.56E-42)
            X.2vE r4 = X.C58422vE.A02
            int r3 = r5.A0O(r4, r0)
            r44.A05()
            r0 = r44
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r0.A06
            r43 = r0
            if (r3 > 0) goto L_0x00dd
            r43.lock()
        L_0x00ca:
            X.08M r0 = r8.A03
            X.AnonymousClass0x7.A18(r0)
            X.8qC r0 = r8.A0n
            java.lang.Object r1 = r0.get()
            X.3Lj r1 = (X.C66423Lj) r1
            r0 = 0
            r1.A03(r0)
            r2 = 0
            goto L_0x00f9
        L_0x00dd:
            long r0 = (long) r3
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ InterruptedException -> 0x00ee }
            r2 = r43
            boolean r0 = r2.tryLock(r0, r10)     // Catch:{ InterruptedException -> 0x00ee }
            if (r0 == 0) goto L_0x00f3
            java.lang.String r0 = "MessageStoreBackup/lockMessageStoreDb lock succeeded"
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ InterruptedException -> 0x00ee }
            goto L_0x00ca
        L_0x00ee:
            java.lang.String r0 = "MessageStoreBackup/lockMessageStoreDb interrupted while waiting for lock"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x00f3:
            r0 = 500(0x1f4, double:2.47E-321)
            android.os.SystemClock.sleep(r0)
            goto L_0x00dd
        L_0x00f9:
            r44.A05()     // Catch:{ Exception -> 0x0126 }
            X.2sg r3 = r22.BBw()     // Catch:{ Exception -> 0x0126 }
            java.lang.String r1 = "select sqlite_version() AS sqlite_version"
            java.lang.String r0 = "GET_SQLITE_VERSION"
            android.database.Cursor r3 = r3.A0D(r2, r1, r0, r2)     // Catch:{ Exception -> 0x0126 }
            java.lang.String r1 = ""
            boolean r0 = r3.moveToNext()     // Catch:{ all -> 0x011c }
            if (r0 == 0) goto L_0x0118
            java.lang.String r0 = "sqlite_version"
            java.lang.String r1 = X.AnonymousClass0x2.A0Z(r3, r0)     // Catch:{ all -> 0x011c }
        L_0x0118:
            r3.close()     // Catch:{ Exception -> 0x0126 }
            goto L_0x012d
        L_0x011c:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x0121 }
            goto L_0x0125
        L_0x0121:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ Exception -> 0x0126 }
        L_0x0125:
            throw r1     // Catch:{ Exception -> 0x0126 }
        L_0x0126:
            r1 = move-exception
            java.lang.String r0 = "MessageStoreBackup/backup/errors/failed to query sqlite version"
            com.whatsapp.util.Log.e(r0, r1)
            r1 = r2
        L_0x012d:
            r7.A0F = r1
            r44.A05()     // Catch:{ all -> 0x09f1 }
            r0 = r44
            java.io.File r3 = r0.A05     // Catch:{ all -> 0x09f1 }
            java.lang.String r0 = "MessageStoreBackup/backupdb/beforeclose/list "
            X.C627536m.A0F(r3, r0)     // Catch:{ all -> 0x09f1 }
            r44.A05()     // Catch:{ all -> 0x09f1 }
            monitor-enter(r22)     // Catch:{ all -> 0x09f1 }
            r0 = r22
            X.2sg r0 = r0.A00     // Catch:{ all -> 0x09ee }
            r13 = 1
            if (r0 == 0) goto L_0x01a7
            android.database.sqlite.SQLiteDatabase r0 = r0.A00     // Catch:{ all -> 0x09ee }
            boolean r0 = r0.isOpen()     // Catch:{ all -> 0x09ee }
            if (r0 == 0) goto L_0x01a7
            r0 = r22
            X.2sg r0 = r0.A00     // Catch:{ all -> 0x09ee }
            android.database.sqlite.SQLiteDatabase r1 = r0.A00     // Catch:{ all -> 0x09ee }
            boolean r0 = r1.isWriteAheadLoggingEnabled()     // Catch:{ all -> 0x09ee }
            if (r0 == 0) goto L_0x01a7
            java.lang.String r0 = "PRAGMA wal_checkpoint(FULL);"
            android.database.Cursor r10 = r1.rawQuery(r0, r2)     // Catch:{ all -> 0x09ee }
            r1 = 0
            if (r10 == 0) goto L_0x09db
            boolean r0 = r10.moveToFirst()     // Catch:{ all -> 0x019d }
            if (r0 == 0) goto L_0x0198
            int r11 = r10.getInt(r1)     // Catch:{ all -> 0x019d }
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x019d }
            java.lang.String r0 = "msgstore/wal_checkpoint: "
            r2.append(r0)     // Catch:{ all -> 0x019d }
            r2.append(r11)     // Catch:{ all -> 0x019d }
            java.lang.String r1 = " "
            r2.append(r1)     // Catch:{ all -> 0x019d }
            int r0 = r10.getInt(r6)     // Catch:{ all -> 0x019d }
            r2.append(r0)     // Catch:{ all -> 0x019d }
            r2.append(r1)     // Catch:{ all -> 0x019d }
            r0 = 2
            int r0 = r10.getInt(r0)     // Catch:{ all -> 0x019d }
            X.C18260x0.A1G(r2, r0)     // Catch:{ all -> 0x019d }
            if (r11 == 0) goto L_0x0194
            r13 = 0
        L_0x0194:
            r10.close()     // Catch:{ all -> 0x09ee }
            goto L_0x01a7
        L_0x0198:
            r10.close()     // Catch:{ all -> 0x09ee }
            goto L_0x09db
        L_0x019d:
            r1 = move-exception
            r10.close()     // Catch:{ all -> 0x01a2 }
            goto L_0x01a6
        L_0x01a2:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x09ee }
        L_0x01a6:
            throw r1     // Catch:{ all -> 0x09ee }
        L_0x01a7:
            monitor-exit(r22)     // Catch:{ all -> 0x09f1 }
            if (r13 == 0) goto L_0x09dc
            r44.A05()     // Catch:{ all -> 0x09f1 }
            r22.close()     // Catch:{ all -> 0x09f1 }
            r44.A05()     // Catch:{ all -> 0x09f1 }
            java.lang.String r0 = "MessageStoreBackup/backupdb/afterclose/list "
            X.C627536m.A0F(r3, r0)     // Catch:{ all -> 0x09f1 }
            X.0WN r0 = r8.A08     // Catch:{ all -> 0x09f1 }
            r34 = r0
            boolean r0 = r34.A0G()     // Catch:{ all -> 0x09f1 }
            if (r0 == 0) goto L_0x01c5
            X.22O r2 = X.AnonymousClass22O.CRYPT15     // Catch:{ all -> 0x09f1 }
            goto L_0x01c7
        L_0x01c5:
            X.22O r2 = X.AnonymousClass22O.CRYPT14     // Catch:{ all -> 0x09f1 }
        L_0x01c7:
            X.3cX r11 = new X.3cX     // Catch:{ Exception -> 0x093d }
            r11.<init>((X.C625835r) r8)     // Catch:{ Exception -> 0x093d }
            java.lang.String r0 = "MessageStoreBackup/dodbbackup/start"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ Exception -> 0x093d }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x093d }
            r7.A06 = r1     // Catch:{ Exception -> 0x093d }
            r30 = 2
            r0 = r30
            if (r9 != r0) goto L_0x01e1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r30)     // Catch:{ Exception -> 0x093d }
        L_0x01e1:
            r7.A05 = r1     // Catch:{ Exception -> 0x093d }
            long r20 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x093d }
            java.lang.String r0 = "MessageStoreBackup/backupDatabase/start"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0923 }
            X.2s6 r0 = r8.A0C     // Catch:{ all -> 0x0923 }
            r35 = r0
            boolean r0 = r35.A06()     // Catch:{ all -> 0x0923 }
            if (r0 == 0) goto L_0x0204
            java.lang.String r1 = "MessageStoreBackup/backupDatabase/skip no media or read-only media"
            r0 = r30
            r12.A01(r1, r0)     // Catch:{ all -> 0x0923 }
            java.lang.String r0 = "no/read-only media"
        L_0x0200:
            r7.A0C = r0     // Catch:{ all -> 0x0923 }
            goto L_0x08f9
        L_0x0204:
            r44.A05()     // Catch:{ all -> 0x0923 }
            boolean r0 = r3.exists()     // Catch:{ all -> 0x0923 }
            if (r0 != 0) goto L_0x0224
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0923 }
            java.lang.String r0 = "MessageStoreBackup/backupDatabase/skip/file-not-found "
            r1.append(r0)     // Catch:{ all -> 0x0923 }
            r44.A05()     // Catch:{ all -> 0x0923 }
            java.lang.String r1 = X.AnonymousClass000.A0R(r3, r1)     // Catch:{ all -> 0x0923 }
            r0 = 4
            r12.A01(r1, r0)     // Catch:{ all -> 0x0923 }
            java.lang.String r0 = "db file not found"
            goto L_0x0200
        L_0x0224:
            java.io.File r1 = r8.A0N(r2)     // Catch:{ all -> 0x0923 }
            java.lang.String r0 = "backupDatabase"
            boolean r0 = A09(r1, r0)     // Catch:{ all -> 0x0923 }
            if (r0 == 0) goto L_0x08f9
            r0 = 4329(0x10e9, float:6.066E-42)
            boolean r0 = r5.A0Y(r4, r0)     // Catch:{ all -> 0x0923 }
            if (r0 == 0) goto L_0x025e
            X.2W1 r0 = r8.A0O     // Catch:{ all -> 0x0923 }
            X.3dV r0 = r0.A00     // Catch:{ all -> 0x0923 }
            r0.A05()     // Catch:{ all -> 0x0923 }
            java.io.File r0 = r0.A05     // Catch:{ all -> 0x0923 }
            boolean r0 = A08(r0)     // Catch:{ all -> 0x0923 }
            if (r0 != 0) goto L_0x025e
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0923 }
            java.lang.String r0 = "MessageStoreBackup/backupDatabase/skip/database corrupted "
            r1.append(r0)     // Catch:{ all -> 0x0923 }
            r44.A05()     // Catch:{ all -> 0x0923 }
            java.lang.String r1 = X.AnonymousClass000.A0R(r3, r1)     // Catch:{ all -> 0x0923 }
            r0 = 4
            r12.A01(r1, r0)     // Catch:{ all -> 0x0923 }
            java.lang.String r0 = "db corrupted"
            goto L_0x0200
        L_0x025e:
            r46 = r48
            if (r9 == r6) goto L_0x03de
            java.lang.String r10 = "MessageStoreBackup/createIncrementalBackup/failed "
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0923 }
            java.lang.String r0 = "MessageStoreBackup/createIncrementalBackup/"
            java.lang.String r0 = X.AnonymousClass000.A0P(r2, r0, r1)     // Catch:{ all -> 0x0923 }
            X.33M r15 = X.AnonymousClass33M.A01(r0)     // Catch:{ all -> 0x0923 }
            int r0 = r2.version     // Catch:{ all -> 0x0923 }
            java.lang.Long r0 = X.AnonymousClass0x9.A0m(r0)     // Catch:{ all -> 0x0923 }
            r7.A07 = r0     // Catch:{ all -> 0x0923 }
            r3 = 0
            r9 = 0
            r0 = r30
            java.util.List r4 = r8.A0T(r2, r0, r6)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x03ac, IOException -> 0x039e }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x03ac, IOException -> 0x039e }
            java.lang.String r0 = "msgstore-increment-(\\d+)"
            r1.append(r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x03ac, IOException -> 0x039e }
            java.lang.String r0 = A02(r2, r6)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x03ac, IOException -> 0x039e }
            java.lang.String r1 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x03ac, IOException -> 0x039e }
            X.4IT r0 = new X.4IT     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x03ac, IOException -> 0x039e }
            r0.<init>(r1, r6)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x03ac, IOException -> 0x039e }
            java.util.Collections.sort(r4, r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x03ac, IOException -> 0x039e }
            int r0 = r4.size()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x03ac, IOException -> 0x039e }
            if (r0 <= 0) goto L_0x032b
            java.lang.Object r0 = r4.get(r3)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x03ac, IOException -> 0x039e }
            java.io.File r0 = (java.io.File) r0     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x03ac, IOException -> 0x039e }
            java.lang.String r0 = r0.getName()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x03ac, IOException -> 0x039e }
            boolean r0 = r0.matches(r1)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x03ac, IOException -> 0x039e }
            if (r0 == 0) goto L_0x032b
            java.lang.Object r0 = r4.get(r3)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x03ac, IOException -> 0x039e }
            java.io.File r0 = (java.io.File) r0     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x03ac, IOException -> 0x039e }
            java.lang.String r3 = r0.getName()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x03ac, IOException -> 0x039e }
            java.lang.String r0 = "$1"
            java.lang.String r0 = r3.replaceAll(r1, r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x03ac, IOException -> 0x039e }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x03ac, IOException -> 0x039e }
            int r0 = r0 + 1
            java.lang.String r3 = java.lang.String.valueOf(r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x03ac, IOException -> 0x039e }
        L_0x02cc:
            java.lang.String r0 = "\\Q"
            java.lang.String r13 = ""
            java.lang.String r1 = r1.replace(r0, r13)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x03ac, IOException -> 0x039e }
            java.lang.String r0 = "\\E"
            java.lang.String r1 = r1.replace(r0, r13)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x03ac, IOException -> 0x039e }
            java.lang.String r0 = "(\\d+)"
            java.lang.String r1 = r1.replace(r0, r3)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x03ac, IOException -> 0x039e }
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x03ac, IOException -> 0x039e }
            java.lang.String r0 = "MessageStoreBackupgetNextIncrementalDbBackupFile/name: "
            X.C18260x0.A0q(r0, r1, r3)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x03ac, IOException -> 0x039e }
            X.310 r0 = r8.A0B     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x03ac, IOException -> 0x039e }
            java.io.File r0 = r0.A03()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x03ac, IOException -> 0x039e }
            java.io.File r5 = X.AnonymousClass002.A0A(r0, r1)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x03ac, IOException -> 0x039e }
            X.34i r14 = r8.A0h     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x03ac, IOException -> 0x039e }
            X.2sr r4 = r8.A07     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x03ac, IOException -> 0x039e }
            X.2f0 r3 = r8.A0I     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x03ac, IOException -> 0x039e }
            X.2eK r1 = r8.A0b     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x03ac, IOException -> 0x039e }
            X.8qC r0 = r8.A0l     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x03ac, IOException -> 0x039e }
            java.lang.Object r0 = r0.get()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x03ac, IOException -> 0x039e }
            X.0Xr r0 = (X.C06430Xr) r0     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x03ac, IOException -> 0x039e }
            r23 = r4
            r24 = r0
            r25 = r34
            r26 = r35
            r27 = r3
            r28 = r1
            r29 = r12
            r30 = r2
            r31 = r14
            r32 = r5
            r33 = r9
            X.0UR r14 = X.AnonymousClass0S7.A00(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x03ac, IOException -> 0x039e }
            r0 = r45
            boolean r0 = r14.A07(r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x03ac, IOException -> 0x039e }
            if (r0 != 0) goto L_0x032e
            java.lang.String r0 = "failed to prepare for backup"
            r7.A0C = r0     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x03ac, IOException -> 0x039e }
            goto L_0x03c8
        L_0x032b:
            java.lang.String r3 = "1"
            goto L_0x02cc
        L_0x032e:
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x03ac, IOException -> 0x039e }
            java.lang.String r0 = "MessageStoreBackup/createIncrementalBackup/to "
            java.lang.String r0 = X.AnonymousClass0x7.A0p(r5, r0, r2)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x03ac, IOException -> 0x039e }
            X.C18260x0.A1L(r2, r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x03ac, IOException -> 0x039e }
            X.2gw r0 = r1.A00     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x03ac, IOException -> 0x039e }
            java.io.File r9 = r0.A00(r13)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x03ac, IOException -> 0x039e }
            X.2d9 r13 = r8.A09     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x03ac, IOException -> 0x039e }
            android.os.CancellationSignal r4 = new android.os.CancellationSignal     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x03ac, IOException -> 0x039e }
            r4.<init>()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x03ac, IOException -> 0x039e }
            r3 = 10
            r2 = 80
            X.3DT r1 = new X.3DT     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x03ac, IOException -> 0x039e }
            r0 = r46
            r1.<init>(r0, r3, r2)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x03ac, IOException -> 0x039e }
            r13.A00(r4, r1, r7, r9)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x03ac, IOException -> 0x039e }
            r3 = 90
            r2 = 100
            X.3DT r1 = new X.3DT     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x03ac, IOException -> 0x039e }
            r1.<init>(r0, r3, r2)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x03ac, IOException -> 0x039e }
            r14.A06(r1, r9)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x03ac, IOException -> 0x039e }
            X.8qC r0 = r13.A01     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x03ac, IOException -> 0x039e }
            java.lang.Object r0 = r0.get()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x03ac, IOException -> 0x039e }
            X.34k r0 = (X.C622834k) r0     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x03ac, IOException -> 0x039e }
            r0.A07()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x03ac, IOException -> 0x039e }
            long r2 = r9.length()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x03ac, IOException -> 0x039e }
            long r4 = r5.length()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x03ac, IOException -> 0x039e }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x03ac, IOException -> 0x039e }
            java.lang.String r0 = "MessageStoreBackup/createIncrementalBackup/file/size: "
            X.C18260x0.A12(r0, r1, r2)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x03ac, IOException -> 0x039e }
            java.lang.Long r0 = java.lang.Long.valueOf(r2)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x03ac, IOException -> 0x039e }
            r7.A09 = r0     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x03ac, IOException -> 0x039e }
            r13 = 0
            int r0 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r0 <= 0) goto L_0x0393
            double r0 = (double) r2     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x03ac, IOException -> 0x039e }
            double r2 = (double) r4     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x03ac, IOException -> 0x039e }
            double r0 = r0 / r2
            java.lang.Double r0 = java.lang.Double.valueOf(r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x03ac, IOException -> 0x039e }
            r7.A04 = r0     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x03ac, IOException -> 0x039e }
        L_0x0393:
            r11.run()     // Catch:{ all -> 0x0923 }
            X.C627536m.A0O(r9)     // Catch:{ all -> 0x0923 }
            A05(r15)     // Catch:{ all -> 0x0923 }
            goto L_0x08a5
        L_0x039e:
            r2 = move-exception
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0k(r2, r10)     // Catch:{ all -> 0x03d0 }
            java.lang.String r1 = r0.toString()     // Catch:{ all -> 0x03d0 }
            r0 = 4
            r12.A01(r1, r0)     // Catch:{ all -> 0x03d0 }
            throw r2     // Catch:{ all -> 0x03d0 }
        L_0x03ac:
            r2 = move-exception
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0k(r2, r10)     // Catch:{ all -> 0x03d0 }
            java.lang.String r1 = r0.toString()     // Catch:{ all -> 0x03d0 }
            r0 = 4
            r12.A01(r1, r0)     // Catch:{ all -> 0x03d0 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x03d0 }
            r7.A0C = r0     // Catch:{ all -> 0x03d0 }
            r11.run()     // Catch:{ all -> 0x0923 }
            if (r9 == 0) goto L_0x03cb
            X.C627536m.A0O(r9)     // Catch:{ all -> 0x0923 }
            goto L_0x03cb
        L_0x03c8:
            r11.run()     // Catch:{ all -> 0x0923 }
        L_0x03cb:
            A05(r15)     // Catch:{ all -> 0x0923 }
            goto L_0x08f9
        L_0x03d0:
            r4 = move-exception
            r11.run()     // Catch:{ all -> 0x0923 }
            if (r9 == 0) goto L_0x03d9
            X.C627536m.A0O(r9)     // Catch:{ all -> 0x0923 }
        L_0x03d9:
            A05(r15)     // Catch:{ all -> 0x0923 }
            goto L_0x08f8
        L_0x03de:
            java.lang.String r23 = "MessageStoreBackup/backupDatabase | time spent: "
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0923 }
            java.lang.String r0 = "MessageStoreBackup/backupDatabase/full/"
            java.lang.String r0 = X.AnonymousClass000.A0P(r2, r0, r1)     // Catch:{ all -> 0x0923 }
            X.33M r24 = X.AnonymousClass33M.A01(r0)     // Catch:{ all -> 0x0923 }
            r32 = 1
            r8.A0Y(r6)     // Catch:{ all -> 0x0923 }
            int r0 = r2.version     // Catch:{ all -> 0x0923 }
            java.lang.Long r0 = X.AnonymousClass0x9.A0m(r0)     // Catch:{ all -> 0x0923 }
            r7.A07 = r0     // Catch:{ all -> 0x0923 }
            r9 = 0
            r44.A05()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x08c7, IOException -> 0x08a7 }
            long r16 = r3.length()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x08c7, IOException -> 0x08a7 }
            java.lang.Long r0 = java.lang.Long.valueOf(r16)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x08c7, IOException -> 0x08a7 }
            r7.A09 = r0     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x08c7, IOException -> 0x08a7 }
            java.lang.StringBuilder r14 = X.AnonymousClass001.A0o()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x08c7, IOException -> 0x08a7 }
            java.lang.String r13 = "MessageStoreBackup/backupDatabase/size "
            r0 = r16
            X.C18260x0.A12(r13, r14, r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x08c7, IOException -> 0x08a7 }
            r44.A05()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x08c7, IOException -> 0x08a7 }
            java.io.File r31 = r8.A0O(r3, r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x08c7, IOException -> 0x08a7 }
            r44.A05()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x08c7, IOException -> 0x08a7 }
            r0 = r31
            boolean r0 = r3.equals(r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x08c7, IOException -> 0x08a7 }
            if (r0 != 0) goto L_0x042f
            java.lang.String r0 = "MessageStoreBackup/backupDatabase/unlocking db"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x08c7, IOException -> 0x08a7 }
            r11.run()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x08c7, IOException -> 0x08a7 }
        L_0x042f:
            r44.A05()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x08c7, IOException -> 0x08a7 }
            r0 = r31
            boolean r0 = r3.equals(r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x08c7, IOException -> 0x08a7 }
            if (r0 != 0) goto L_0x0722
            r0 = r31
            boolean r0 = r0.setWritable(r6)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x08c7, IOException -> 0x08a7 }
            if (r0 == 0) goto L_0x0722
            java.lang.String r29 = "newsletter_message_enforcements"
            java.lang.String r28 = " ms"
            java.lang.String r27 = "status_crossposting"
            java.lang.String r1 = r31.getAbsolutePath()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x08c7, IOException -> 0x08a7 }
            r0 = 0
            android.database.sqlite.SQLiteDatabase r11 = android.database.sqlite.SQLiteDatabase.openOrCreateDatabase(r1, r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x08c7, IOException -> 0x08a7 }
            java.lang.String r14 = X.C39372Bs.A00     // Catch:{ Exception -> 0x048b }
            r15 = 0
            android.database.Cursor r13 = r11.rawQuery(r14, r0)     // Catch:{ Exception -> 0x048b }
            int r0 = r13.getCount()     // Catch:{ all -> 0x047f }
            boolean r0 = X.AnonymousClass001.A1W(r0)
            r13.close()     // Catch:{ Exception -> 0x048b }
            if (r0 == 0) goto L_0x048f
            java.lang.String r13 = "message_thumbnail"
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ SQLException -> 0x0491 }
            java.lang.String r0 = "message_row_id IN ("
            r1.append(r0)     // Catch:{ SQLException -> 0x0491 }
            r1.append(r14)     // Catch:{ SQLException -> 0x0491 }
            java.lang.String r1 = X.AnonymousClass000.A0e(r1)     // Catch:{ SQLException -> 0x0491 }
            r11.delete(r13, r1, r15)     // Catch:{ SQLException -> 0x0491 }
            goto L_0x048f
        L_0x047f:
            r1 = move-exception
            if (r13 == 0) goto L_0x048a
            r13.close()     // Catch:{ all -> 0x0486 }
            goto L_0x048a
        L_0x0486:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ Exception -> 0x048b }
        L_0x048a:
            throw r1     // Catch:{ Exception -> 0x048b }
        L_0x048b:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)     // Catch:{ SQLException -> 0x0491 }
        L_0x048f:
            r0 = 1
            goto L_0x0498
        L_0x0491:
            r1 = move-exception
            java.lang.String r0 = "ThumbnailHelper/deleteMediaThumbnails failed with exception"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0716 }
            r0 = 0
        L_0x0498:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0716 }
            r7.A02 = r0     // Catch:{ all -> 0x0716 }
            X.8qC r0 = r8.A0m     // Catch:{ all -> 0x0716 }
            r0.get()     // Catch:{ all -> 0x0716 }
            r0 = 0
            X.C162457s7.A0J(r11, r0)     // Catch:{ all -> 0x0716 }
            android.content.ContentValues r14 = X.AnonymousClass0x9.A06()     // Catch:{ SQLiteException -> 0x04c0 }
            java.lang.String r0 = "reporting_token_content"
            r13 = 0
            r14.put(r0, r13)     // Catch:{ SQLiteException -> 0x04c0 }
            java.lang.String r1 = "version"
            r0 = -2
            X.C18270x1.A0b(r14, r1, r0)     // Catch:{ SQLiteException -> 0x04c0 }
            java.lang.String r0 = "reporting_token"
            r11.update(r0, r14, r13, r13)     // Catch:{ SQLiteException -> 0x04c0 }
            goto L_0x04c6
        L_0x04c0:
            r1 = move-exception
            java.lang.String r0 = "ReportingTokenTable/deleteDataBeforeBackup failed with exception"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0716 }
        L_0x04c6:
            long r0 = r31.length()     // Catch:{ all -> 0x0716 }
            r13 = 1000000(0xf4240, double:4.940656E-318)
            long r0 = r0 / r13
            int r13 = (int) r0     // Catch:{ all -> 0x0716 }
            r0 = 3075(0xc03, float:4.309E-42)
            int r0 = r5.A0O(r4, r0)     // Catch:{ all -> 0x0716 }
            r1 = 0
            if (r13 > r0) goto L_0x04d9
            r1 = 1
        L_0x04d9:
            r0 = 2660(0xa64, float:3.727E-42)
            boolean r0 = r5.A0Y(r4, r0)     // Catch:{ all -> 0x0716 }
            if (r0 == 0) goto L_0x06e1
            if (r1 == 0) goto L_0x06c2
            long r18 = r31.length()     // Catch:{ all -> 0x0716 }
            java.lang.String r4 = "backup"
            X.2ao r1 = r8.A0X     // Catch:{ all -> 0x0716 }
            X.2zT r0 = r8.A0W     // Catch:{ all -> 0x0716 }
            X.2sg r13 = X.C626135u.A00(r11, r0, r1, r4)     // Catch:{ all -> 0x0716 }
            r0 = 0
            X.33M r5 = new X.33M     // Catch:{ all -> 0x0716 }
            r5.<init>((boolean) r0)     // Catch:{ all -> 0x0716 }
            java.lang.String r0 = "MessageStoreBackup/deleteUnnecessaryDataForBackup/dropFtsTables/start"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0716 }
            r5.A09()     // Catch:{ all -> 0x0716 }
            java.lang.String r14 = "msgtore_db_schema_version"
            X.C622033z.A01(r13, r14)     // Catch:{ all -> 0x0716 }
            java.lang.String r26 = "msgtore_db_schema_indexes_version"
            r0 = r26
            X.C622033z.A01(r13, r0)     // Catch:{ all -> 0x0716 }
            java.lang.String r0 = "migration_fts_index"
            X.C622033z.A01(r13, r0)     // Catch:{ all -> 0x0716 }
            java.lang.String r0 = "migration_fts_retry"
            X.C622033z.A01(r13, r0)     // Catch:{ all -> 0x0716 }
            java.lang.String r0 = "fts_index_start"
            X.C622033z.A01(r13, r0)     // Catch:{ all -> 0x0716 }
            java.lang.String r4 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x0716 }
            java.lang.String r1 = "FtsMessageStore"
            java.lang.String r0 = "fts_ready"
            X.C622033z.A03(r13, r0, r4, r1)     // Catch:{ all -> 0x0716 }
            X.C622033z.A01(r13, r14)     // Catch:{ all -> 0x0716 }
            java.util.ArrayList r14 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x0716 }
            java.lang.String r0 = "messages_fts"
            r14.add(r0)     // Catch:{ all -> 0x0716 }
            java.lang.String[] r0 = X.AnonymousClass3L1.A00     // Catch:{ all -> 0x0716 }
            java.util.ArrayList r1 = X.AnonymousClass0x2.A0i(r0)     // Catch:{ all -> 0x0716 }
            java.lang.String r0 = "v2"
            r1.add(r0)     // Catch:{ all -> 0x0716 }
            java.util.Iterator r25 = r1.iterator()     // Catch:{ all -> 0x0716 }
        L_0x0546:
            boolean r0 = r25.hasNext()     // Catch:{ all -> 0x0716 }
            if (r0 == 0) goto L_0x058b
            java.lang.String r4 = X.AnonymousClass001.A0m(r25)     // Catch:{ all -> 0x0716 }
            java.lang.StringBuilder r0 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0716 }
            java.lang.String r1 = "message_fts"
            r0.append(r1)     // Catch:{ all -> 0x0716 }
            X.C18270x1.A1D(r4, r0, r14)     // Catch:{ all -> 0x0716 }
            java.lang.StringBuilder r15 = X.AnonymousClass000.A0m(r1, r4)     // Catch:{ all -> 0x0716 }
            java.lang.String r0 = "_content"
            X.C18270x1.A1D(r0, r15, r14)     // Catch:{ all -> 0x0716 }
            java.lang.StringBuilder r15 = X.AnonymousClass000.A0m(r1, r4)     // Catch:{ all -> 0x0716 }
            java.lang.String r0 = "_docsize"
            X.C18270x1.A1D(r0, r15, r14)     // Catch:{ all -> 0x0716 }
            java.lang.StringBuilder r15 = X.AnonymousClass000.A0m(r1, r4)     // Catch:{ all -> 0x0716 }
            java.lang.String r0 = "_segdir"
            X.C18270x1.A1D(r0, r15, r14)     // Catch:{ all -> 0x0716 }
            java.lang.StringBuilder r15 = X.AnonymousClass000.A0m(r1, r4)     // Catch:{ all -> 0x0716 }
            java.lang.String r0 = "_segments"
            X.C18270x1.A1D(r0, r15, r14)     // Catch:{ all -> 0x0716 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0m(r1, r4)     // Catch:{ all -> 0x0716 }
            java.lang.String r0 = "_stat"
            X.C18270x1.A1D(r0, r1, r14)     // Catch:{ all -> 0x0716 }
            goto L_0x0546
        L_0x058b:
            java.util.Iterator r15 = r14.iterator()     // Catch:{ all -> 0x0716 }
            r4 = 1
        L_0x0590:
            boolean r0 = r15.hasNext()     // Catch:{ all -> 0x0716 }
            if (r0 == 0) goto L_0x05c0
            java.lang.String r14 = X.AnonymousClass001.A0m(r15)     // Catch:{ all -> 0x0716 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ SQLException -> 0x05b4 }
            java.lang.String r0 = "DatabaseUtils/dropTables/attempting to drop table: "
            X.C18260x0.A0q(r0, r14, r1)     // Catch:{ SQLException -> 0x05b4 }
            java.lang.String r0 = "DatabaseUtils"
            X.C626235v.A03(r13, r0, r14)     // Catch:{ SQLException -> 0x05b4 }
            if (r4 == 0) goto L_0x0590
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0716 }
            java.lang.String r0 = "DatabaseUtils/dropTables/table dropped: "
            X.C18260x0.A0q(r0, r14, r1)     // Catch:{ all -> 0x0716 }
            goto L_0x0590
        L_0x05b4:
            r4 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0716 }
            java.lang.String r0 = "DatabaseUtils/dropTables/failed to drop table: "
            X.C18260x0.A0u(r0, r14, r1, r4)     // Catch:{ all -> 0x0716 }
            r4 = 0
            goto L_0x0590
        L_0x05c0:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)     // Catch:{ all -> 0x0716 }
            r7.A00 = r0     // Catch:{ all -> 0x0716 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0716 }
            java.lang.String r0 = "MessageStoreBackup/deleteUnnecessaryDataForBackup/dropFtsTables/end. Time elapsed: "
            X.AnonymousClass33M.A03(r5, r0, r1)     // Catch:{ all -> 0x0716 }
            r0 = r28
            X.C18260x0.A1L(r1, r0)     // Catch:{ all -> 0x0716 }
            r5.A01 = r9     // Catch:{ all -> 0x0716 }
            r5.A00 = r9     // Catch:{ all -> 0x0716 }
            java.lang.String r0 = "MessageStoreBackup/deleteUnnecessaryDataForBackup/dropIndices/start"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0716 }
            r5.A09()     // Catch:{ all -> 0x0716 }
            r44.A05()     // Catch:{ all -> 0x0716 }
            X.2Kk r0 = r22.A01()     // Catch:{ SQLException -> 0x063a }
            X.2Kl r1 = new X.2Kl     // Catch:{ SQLException -> 0x063a }
            r1.<init>(r0)     // Catch:{ SQLException -> 0x063a }
            X.2sI r4 = new X.2sI     // Catch:{ SQLException -> 0x063a }
            r4.<init>()     // Catch:{ SQLException -> 0x063a }
            r0 = r22
            X.8qC r0 = r0.A09     // Catch:{ SQLException -> 0x063a }
            java.util.Iterator r14 = X.AnonymousClass0x2.A0j(r0)     // Catch:{ SQLException -> 0x063a }
        L_0x05f9:
            boolean r0 = r14.hasNext()     // Catch:{ SQLException -> 0x063a }
            if (r0 == 0) goto L_0x0609
            java.lang.Object r0 = r14.next()     // Catch:{ SQLException -> 0x063a }
            X.4ED r0 = (X.AnonymousClass4ED) r0     // Catch:{ SQLException -> 0x063a }
            r0.B3g(r13, r1, r4)     // Catch:{ SQLException -> 0x063a }
            goto L_0x05f9
        L_0x0609:
            java.lang.String r1 = "DatabaseHelper"
            java.util.Map r0 = r4.A01     // Catch:{ SQLException -> 0x063a }
            java.util.Iterator r14 = X.C18280x3.A0i(r0)     // Catch:{ SQLException -> 0x063a }
        L_0x0611:
            boolean r0 = r14.hasNext()     // Catch:{ SQLException -> 0x063a }
            if (r0 == 0) goto L_0x061f
            java.lang.String r0 = X.AnonymousClass001.A0m(r14)     // Catch:{ SQLException -> 0x063a }
            X.C626235v.A02(r13, r1, r0)     // Catch:{ SQLException -> 0x063a }
            goto L_0x0611
        L_0x061f:
            java.util.Map r0 = r4.A00     // Catch:{ SQLException -> 0x063a }
            java.util.Iterator r4 = X.C18280x3.A0i(r0)     // Catch:{ SQLException -> 0x063a }
        L_0x0625:
            boolean r0 = r4.hasNext()     // Catch:{ SQLException -> 0x063a }
            if (r0 == 0) goto L_0x0633
            java.lang.String r0 = X.AnonymousClass001.A0m(r4)     // Catch:{ SQLException -> 0x063a }
            X.C626235v.A02(r13, r1, r0)     // Catch:{ SQLException -> 0x063a }
            goto L_0x0625
        L_0x0633:
            r0 = r26
            X.C622033z.A01(r13, r0)     // Catch:{ SQLException -> 0x063a }
            r0 = 1
            goto L_0x0640
        L_0x063a:
            java.lang.String r0 = "DatabaseHelperdropIndexes failed to drop all of the indexes"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0716 }
            r0 = 0
        L_0x0640:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0716 }
            r7.A01 = r0     // Catch:{ all -> 0x0716 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0716 }
            java.lang.String r0 = "MessageStoreBackup/deleteUnnecessaryDataForBackup/dropIndices/end. Time elapsed: "
            X.AnonymousClass33M.A03(r5, r0, r1)     // Catch:{ all -> 0x0716 }
            r0 = r28
            X.C18260x0.A1L(r1, r0)     // Catch:{ all -> 0x0716 }
            r5.A01 = r9     // Catch:{ all -> 0x0716 }
            r5.A00 = r9     // Catch:{ all -> 0x0716 }
            java.lang.String r0 = "MessageStoreBackup/deleteUnnecessaryDataForBackup/vacuumDb/start"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0716 }
            r5.A09()     // Catch:{ all -> 0x0716 }
            java.lang.String r14 = "MessageStoreBackup"
            java.lang.String r4 = "VACUUM"
            java.lang.String r1 = "vacuumDb"
            java.lang.String r0 = "vacuum"
            java.lang.String r0 = X.C57242tK.A00(r14, r1, r0)     // Catch:{ SQLException -> 0x0673 }
            r13.A0H(r4, r0)     // Catch:{ SQLException -> 0x0673 }
            r0 = 1
            goto L_0x067a
        L_0x0673:
            r1 = move-exception
            java.lang.String r0 = "SharedDBQueryExecutor/vacuumDb/failed to vacuum"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0716 }
            r0 = 0
        L_0x067a:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0716 }
            r7.A03 = r0     // Catch:{ all -> 0x0716 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0716 }
            java.lang.String r0 = "MessageStoreBackup/deleteUnnecessaryDataForBackup/vacuumDb/end. Time elapsed: "
            X.AnonymousClass33M.A03(r5, r0, r1)     // Catch:{ all -> 0x0716 }
            r0 = r28
            X.C18260x0.A1L(r1, r0)     // Catch:{ all -> 0x0716 }
            long r13 = r31.length()     // Catch:{ all -> 0x0716 }
            r4 = 100
            long r0 = r13 * r4
            long r0 = r0 / r18
            java.lang.Long r5 = X.C18310x6.A0f(r4, r0)     // Catch:{ all -> 0x0716 }
            r7.A0A = r5     // Catch:{ all -> 0x0716 }
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0716 }
            java.lang.String r0 = "MessageStoreBackup/deleteUnnecessaryDataForBackup/original size "
            r4.append(r0)     // Catch:{ all -> 0x0716 }
            r0 = r18
            r4.append(r0)     // Catch:{ all -> 0x0716 }
            java.lang.String r0 = " cleaned size "
            r4.append(r0)     // Catch:{ all -> 0x0716 }
            r4.append(r13)     // Catch:{ all -> 0x0716 }
            java.lang.String r0 = ", saved "
            r4.append(r0)     // Catch:{ all -> 0x0716 }
            r4.append(r5)     // Catch:{ all -> 0x0716 }
            java.lang.String r0 = "%"
            X.C18260x0.A1L(r4, r0)     // Catch:{ all -> 0x0716 }
            goto L_0x06e1
        L_0x06c2:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0716 }
            java.lang.String r0 = "MessageStoreBackup/deleteUnnecessaryDataForBackup/skip DB cleanup as originalDBSize: "
            r1.append(r0)     // Catch:{ all -> 0x0716 }
            r1.append(r13)     // Catch:{ all -> 0x0716 }
            java.lang.String r0 = "MB exceeds threshold limit: "
            r1.append(r0)     // Catch:{ all -> 0x0716 }
            r0 = 3075(0xc03, float:4.309E-42)
            int r0 = r5.A0O(r4, r0)     // Catch:{ all -> 0x0716 }
            r1.append(r0)     // Catch:{ all -> 0x0716 }
            java.lang.String r0 = "MB"
            X.C18260x0.A1L(r1, r0)     // Catch:{ all -> 0x0716 }
        L_0x06e1:
            boolean r0 = android.text.TextUtils.isEmpty(r27)     // Catch:{ all -> 0x0716 }
            if (r0 != 0) goto L_0x06fe
            r0 = r27
            boolean r0 = A07(r11, r0)     // Catch:{ all -> 0x0716 }
            if (r0 == 0) goto L_0x06fe
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0716 }
            java.lang.String r1 = "MessageStoreBackup/emptyTableFromDatabase/Attempting to empty table: "
            r0 = r27
            X.C18260x0.A0q(r1, r0, r4)     // Catch:{ all -> 0x0716 }
            r1 = 0
            r11.delete(r0, r1, r1)     // Catch:{ all -> 0x0716 }
        L_0x06fe:
            r0 = r29
            boolean r0 = A07(r11, r0)     // Catch:{ all -> 0x0716 }
            if (r0 == 0) goto L_0x0725
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0716 }
            java.lang.String r1 = "MessageStoreBackup/emptyTableFromDatabase/Attempting to empty table: "
            r0 = r29
            X.C18260x0.A0q(r1, r0, r4)     // Catch:{ all -> 0x0716 }
            r1 = 0
            r11.delete(r0, r1, r1)     // Catch:{ all -> 0x0716 }
            goto L_0x0725
        L_0x0716:
            r1 = move-exception
            if (r11 == 0) goto L_0x0721
            r11.close()     // Catch:{ all -> 0x071d }
            goto L_0x0721
        L_0x071d:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x08c7, IOException -> 0x08a7 }
        L_0x0721:
            throw r1     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x08c7, IOException -> 0x08a7 }
        L_0x0722:
            r32 = 0
            goto L_0x0746
        L_0x0725:
            r11.close()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x08c7, IOException -> 0x08a7 }
            java.lang.Boolean r0 = r7.A01     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x08c7, IOException -> 0x08a7 }
            if (r0 == 0) goto L_0x0732
            boolean r0 = r0.booleanValue()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x08c7, IOException -> 0x08a7 }
            if (r0 != 0) goto L_0x0746
        L_0x0732:
            java.lang.Boolean r0 = r7.A00     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x08c7, IOException -> 0x08a7 }
            if (r0 == 0) goto L_0x073c
            boolean r0 = r0.booleanValue()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x08c7, IOException -> 0x08a7 }
            if (r0 != 0) goto L_0x0746
        L_0x073c:
            java.lang.Boolean r0 = r7.A03     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x08c7, IOException -> 0x08a7 }
            if (r0 == 0) goto L_0x0722
            boolean r0 = r0.booleanValue()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x08c7, IOException -> 0x08a7 }
            if (r0 == 0) goto L_0x0722
        L_0x0746:
            java.io.File r4 = r8.A0N(r2)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x08c7, IOException -> 0x08a7 }
            X.34i r13 = r8.A0h     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x08c7, IOException -> 0x08a7 }
            X.2sr r11 = r8.A07     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x08c7, IOException -> 0x08a7 }
            X.2f0 r5 = r8.A0I     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x08c7, IOException -> 0x08a7 }
            X.2eK r1 = r8.A0b     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x08c7, IOException -> 0x08a7 }
            X.8qC r0 = r8.A0l     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x08c7, IOException -> 0x08a7 }
            java.lang.Object r0 = r0.get()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x08c7, IOException -> 0x08a7 }
            X.0Xr r0 = (X.C06430Xr) r0     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x08c7, IOException -> 0x08a7 }
            java.lang.Boolean r42 = java.lang.Boolean.valueOf(r32)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x08c7, IOException -> 0x08a7 }
            r32 = r11
            r33 = r0
            r36 = r5
            r37 = r1
            r38 = r12
            r39 = r2
            r40 = r13
            r41 = r4
            X.0UR r11 = X.AnonymousClass0S7.A00(r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x08c7, IOException -> 0x08a7 }
            r0 = r45
            boolean r0 = r11.A07(r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x08c7, IOException -> 0x08a7 }
            if (r0 != 0) goto L_0x0780
            java.lang.String r0 = "failed to prepare for backup"
            r7.A0C = r0     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x08c7, IOException -> 0x08a7 }
            goto L_0x08dc
        L_0x0780:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x08c7, IOException -> 0x08a7 }
            java.lang.String r0 = "MessageStoreBackup/backupDatabase/to "
            java.lang.String r0 = X.AnonymousClass0x7.A0p(r4, r0, r1)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x08c7, IOException -> 0x08a7 }
            X.C18260x0.A1L(r1, r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x08c7, IOException -> 0x08a7 }
            r1 = r46
            r0 = r31
            r11.A06(r1, r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x08c7, IOException -> 0x08a7 }
            r44.A05()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x08c7, IOException -> 0x08a7 }
            boolean r0 = r3.equals(r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x08c7, IOException -> 0x08a7 }
            if (r0 != 0) goto L_0x07a0
            r31.delete()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x08c7, IOException -> 0x08a7 }
        L_0x07a0:
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x08c7, IOException -> 0x08a7 }
            java.lang.String r0 = "MessageStoreBackup/backupDatabase/file-closed size="
            X.C18280x3.A11(r4, r0, r2)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x08c7, IOException -> 0x08a7 }
            java.lang.String r0 = " modification time = "
            r2.append(r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x08c7, IOException -> 0x08a7 }
            long r0 = r4.lastModified()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x08c7, IOException -> 0x08a7 }
            X.C18260x0.A1I(r2, r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x08c7, IOException -> 0x08a7 }
            long r4 = r4.length()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x08c7, IOException -> 0x08a7 }
            int r0 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x07c8
            r0 = r16
            double r2 = (double) r0     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x08c7, IOException -> 0x08a7 }
            double r0 = (double) r4     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x08c7, IOException -> 0x08a7 }
            double r2 = r2 / r0
            java.lang.Double r0 = java.lang.Double.valueOf(r2)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x08c7, IOException -> 0x08a7 }
            r7.A04 = r0     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x08c7, IOException -> 0x08a7 }
        L_0x07c8:
            X.0NK r0 = r11.A03()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x08c7, IOException -> 0x08a7 }
            int r0 = r0.A00     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x08c7, IOException -> 0x08a7 }
            if (r0 == r6) goto L_0x07e7
            java.lang.String r1 = "MessageStoreBackup/backupDatabase/integrity-check/not-successful"
            r0 = r30
            r12.A01(r1, r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x08c7, IOException -> 0x08a7 }
            long r0 = A01(r24)     // Catch:{ all -> 0x0923 }
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0923 }
            r2 = r23
            X.C18260x0.A12(r2, r3, r0)     // Catch:{ all -> 0x0923 }
            r4 = 3
            goto L_0x08fa
        L_0x07e7:
            int r17 = r8.A0A()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x08c7, IOException -> 0x08a7 }
            X.310 r0 = r8.A0B     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x08c7, IOException -> 0x08a7 }
            java.io.File r1 = r0.A03()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x08c7, IOException -> 0x08a7 }
            X.0wd r0 = new X.0wd     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x08c7, IOException -> 0x08a7 }
            r0.<init>(r6)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x08c7, IOException -> 0x08a7 }
            java.io.File[] r5 = r1.listFiles(r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x08c7, IOException -> 0x08a7 }
            if (r5 == 0) goto L_0x085d
            int r4 = r5.length     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x08c7, IOException -> 0x08a7 }
            if (r4 < r6) goto L_0x085d
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x08c7, IOException -> 0x08a7 }
            java.util.Date r3 = new java.util.Date     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x08c7, IOException -> 0x08a7 }
            r3.<init>(r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x08c7, IOException -> 0x08a7 }
            java.lang.String r0 = "yyyy-MM-dd"
            java.text.SimpleDateFormat r13 = X.AnonymousClass0x7.A0u(r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x08c7, IOException -> 0x08a7 }
            r11 = 0
        L_0x0810:
            r2 = r5[r11]     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x08c7, IOException -> 0x08a7 }
            java.lang.String r0 = r2.getName()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x08c7, IOException -> 0x08a7 }
            java.lang.String r14 = "^.*((\\d{4})-(\\d{2})-(\\d{2})).*$"
            boolean r0 = r0.matches(r14)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x08c7, IOException -> 0x08a7 }
            if (r0 == 0) goto L_0x0858
            java.lang.String r1 = r2.getName()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x08c7, IOException -> 0x08a7 }
            java.lang.String r0 = "$1"
            java.lang.String r0 = r1.replaceAll(r14, r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x08c7, IOException -> 0x08a7 }
            java.util.Date r0 = r13.parse(r0)     // Catch:{ ParseException -> 0x0849, UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x08c7, UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x08c7, UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x08c7, UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x08c7 }
            if (r0 == 0) goto L_0x0858
            long r15 = r3.getTime()     // Catch:{ ParseException -> 0x0849, UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x08c7, UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x08c7, UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x08c7, UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x08c7 }
            long r0 = r0.getTime()     // Catch:{ ParseException -> 0x0849, UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x08c7, UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x08c7, UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x08c7, UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x08c7 }
            long r15 = r15 - r0
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            long r15 = r15 / r0
            r0 = r17
            long r0 = (long) r0     // Catch:{ ParseException -> 0x0849, UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x08c7, UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x08c7, UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x08c7, UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x08c7 }
            int r14 = (r15 > r0 ? 1 : (r15 == r0 ? 0 : -1))
            if (r14 <= 0) goto L_0x0858
            X.C627536m.A0O(r2)     // Catch:{ ParseException -> 0x0849, UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x08c7, UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x08c7, UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x08c7, UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x08c7 }
            r2.getAbsolutePath()     // Catch:{ ParseException -> 0x0849, UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x08c7, UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x08c7, UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x08c7, UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x08c7 }
            goto L_0x0858
        L_0x0849:
            r14 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x08c7, IOException -> 0x08a7 }
            java.lang.String r0 = "CoreBackupUtils/deleteExpiredBackups/failed parsing the date from the msgstore db backup file "
            X.C18270x1.A0y(r2, r0, r1)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x08c7, IOException -> 0x08a7 }
            java.lang.String r0 = ". Exception: "
            X.C18260x0.A1Q(r1, r0, r14)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x08c7, IOException -> 0x08a7 }
        L_0x0858:
            int r11 = r11 + 1
            if (r11 >= r4) goto L_0x085d
            goto L_0x0810
        L_0x085d:
            java.io.File r5 = r8.A0J()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x08c7, IOException -> 0x08a7 }
            boolean r0 = r5.exists()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x08c7, IOException -> 0x08a7 }
            if (r0 == 0) goto L_0x088b
            r5.lastModified()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x08c7, IOException -> 0x08a7 }
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x08c7, IOException -> 0x08a7 }
            long r0 = r5.lastModified()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x08c7, IOException -> 0x08a7 }
            long r3 = r3 - r0
            long r1 = X.AnonymousClass0x7.A0D(r17)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x088b
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x08c7, IOException -> 0x08a7 }
            java.lang.String r0 = "MessageStoreBackup/backup/basefile_delete "
            r1.append(r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x08c7, IOException -> 0x08a7 }
            boolean r0 = r5.delete()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x08c7, IOException -> 0x08a7 }
            X.C18260x0.A1V(r1, r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x08c7, IOException -> 0x08a7 }
        L_0x088b:
            long r0 = A01(r24)     // Catch:{ all -> 0x0923 }
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0923 }
            r2 = r23
            X.C18260x0.A12(r2, r3, r0)     // Catch:{ all -> 0x0923 }
            X.2d9 r0 = r8.A09     // Catch:{ all -> 0x0923 }
            X.8qC r0 = r0.A01     // Catch:{ all -> 0x0923 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0923 }
            X.34k r0 = (X.C622834k) r0     // Catch:{ all -> 0x0923 }
            r0.A07()     // Catch:{ all -> 0x0923 }
        L_0x08a5:
            r4 = 0
            goto L_0x08fa
        L_0x08a7:
            r3 = move-exception
            X.2zf r0 = r8.A0H     // Catch:{ all -> 0x08ea }
            long r1 = r0.A02()     // Catch:{ all -> 0x08ea }
            int r0 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r0 != 0) goto L_0x08c6
            java.lang.String r0 = "MessageStoreBackup/backupDatabase/out-of-space"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x08ea }
            long r0 = A01(r24)     // Catch:{ all -> 0x0923 }
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0923 }
            r2 = r23
            X.C18260x0.A12(r2, r3, r0)     // Catch:{ all -> 0x0923 }
            r4 = 2
            goto L_0x08fa
        L_0x08c6:
            throw r3     // Catch:{ all -> 0x08ea }
        L_0x08c7:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x08ea }
            java.lang.String r0 = "MessageStoreBackup/backupDatabase/failed "
            java.lang.String r1 = X.AnonymousClass000.A0P(r2, r0, r1)     // Catch:{ all -> 0x08ea }
            r0 = 4
            r12.A01(r1, r0)     // Catch:{ all -> 0x08ea }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x08ea }
            r7.A0C = r0     // Catch:{ all -> 0x08ea }
        L_0x08dc:
            long r0 = A01(r24)     // Catch:{ all -> 0x0923 }
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0923 }
            r2 = r23
            X.C18260x0.A12(r2, r3, r0)     // Catch:{ all -> 0x0923 }
            goto L_0x08f9
        L_0x08ea:
            r4 = move-exception
            long r0 = A01(r24)     // Catch:{ all -> 0x0923 }
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0923 }
            r2 = r23
            X.C18260x0.A12(r2, r3, r0)     // Catch:{ all -> 0x0923 }
        L_0x08f8:
            throw r4     // Catch:{ all -> 0x0923 }
        L_0x08f9:
            r4 = 1
        L_0x08fa:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0923 }
            r7.A06 = r0     // Catch:{ all -> 0x0923 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0923 }
            java.lang.String r0 = "MessageStoreBackup/dodbbackup/result = "
            X.C18260x0.A0y(r0, r1, r4)     // Catch:{ all -> 0x0923 }
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x093d }
            r0 = r20
            java.lang.Long r0 = X.C18310x6.A0f(r2, r0)     // Catch:{ Exception -> 0x093d }
            r7.A0B = r0     // Catch:{ Exception -> 0x093d }
            X.2zf r0 = r8.A0H     // Catch:{ Exception -> 0x093d }
            long r0 = r0.A03()     // Catch:{ Exception -> 0x093d }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ Exception -> 0x093d }
            r7.A08 = r0     // Catch:{ Exception -> 0x093d }
            r6 = r4
            goto L_0x0949
        L_0x0923:
            r4 = move-exception
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x093d }
            r0 = r20
            java.lang.Long r0 = X.C18310x6.A0f(r2, r0)     // Catch:{ Exception -> 0x093d }
            r7.A0B = r0     // Catch:{ Exception -> 0x093d }
            X.2zf r0 = r8.A0H     // Catch:{ Exception -> 0x093d }
            long r0 = r0.A03()     // Catch:{ Exception -> 0x093d }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ Exception -> 0x093d }
            r7.A08 = r0     // Catch:{ Exception -> 0x093d }
            throw r4     // Catch:{ Exception -> 0x093d }
        L_0x093d:
            r1 = move-exception
            java.lang.String r0 = "MessageStoreBackup/backupdb/backup/error "
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ all -> 0x09f1 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x09f1 }
            r7.A0C = r0     // Catch:{ all -> 0x09f1 }
        L_0x0949:
            r44.A05()     // Catch:{ all -> 0x09f1 }
            boolean r0 = r43.isHeldByCurrentThread()     // Catch:{ all -> 0x09f1 }
            if (r0 == 0) goto L_0x09bb
            java.lang.String r0 = "MessageStoreBackup/backupdb/callreset"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x09f1 }
            r44.A05()     // Catch:{ SQLiteException -> 0x0963 }
            r22.BEc()     // Catch:{ SQLiteException -> 0x0963 }
            X.2fp r0 = r8.A0T     // Catch:{ SQLiteException -> 0x0963 }
            r0.A01()     // Catch:{ SQLiteException -> 0x0963 }
            goto L_0x09c0
        L_0x0963:
            r1 = move-exception
            java.lang.String r0 = "MessageStoreBackup/backupdb/failed-to-get-database/cannot-generate-fts-or-links"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x09f1 }
            java.lang.Long r0 = r7.A07     // Catch:{ all -> 0x09f1 }
            if (r0 == 0) goto L_0x09b9
            int r0 = r0.intValue()     // Catch:{ all -> 0x09f1 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x09f1 }
        L_0x0975:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x09f1 }
            java.lang.String r0 = "MessageStoreBackup/backup/log-chat-db-backup-event overall-result: "
            r1.append(r0)     // Catch:{ all -> 0x09f1 }
            java.lang.Integer r0 = r7.A06     // Catch:{ all -> 0x09f1 }
            r1.append(r0)     // Catch:{ all -> 0x09f1 }
            java.lang.String r0 = " database-backup-version: "
            r1.append(r0)     // Catch:{ all -> 0x09f1 }
            r1.append(r2)     // Catch:{ all -> 0x09f1 }
            java.lang.String r0 = " compression-ratio: "
            r1.append(r0)     // Catch:{ all -> 0x09f1 }
            java.lang.Double r0 = r7.A04     // Catch:{ all -> 0x09f1 }
            r1.append(r0)     // Catch:{ all -> 0x09f1 }
            java.lang.String r0 = " backup-file-size: "
            r1.append(r0)     // Catch:{ all -> 0x09f1 }
            java.lang.Long r0 = r7.A09     // Catch:{ all -> 0x09f1 }
            r1.append(r0)     // Catch:{ all -> 0x09f1 }
            java.lang.String r0 = " time: "
            r1.append(r0)     // Catch:{ all -> 0x09f1 }
            java.lang.Long r0 = r7.A0B     // Catch:{ all -> 0x09f1 }
            r1.append(r0)     // Catch:{ all -> 0x09f1 }
            java.lang.String r0 = " free-disk-space: "
            r1.append(r0)     // Catch:{ all -> 0x09f1 }
            java.lang.Long r0 = r7.A08     // Catch:{ all -> 0x09f1 }
            X.C18260x0.A0o(r0, r1)     // Catch:{ all -> 0x09f1 }
            X.4FV r0 = r8.A0a     // Catch:{ all -> 0x09f1 }
            r0.BhD(r7)     // Catch:{ all -> 0x09f1 }
            goto L_0x09e1
        L_0x09b9:
            r2 = 0
            goto L_0x0975
        L_0x09bb:
            java.lang.String r0 = "MessageStoreBackup/backupdb/db lock not held by current thread"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x09f1 }
        L_0x09c0:
            r44.A05()
            boolean r0 = r43.isHeldByCurrentThread()
            if (r0 == 0) goto L_0x09cc
            r8.A0W()
        L_0x09cc:
            X.4FV r0 = r8.A0a
            r0.BhD(r7)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "MessageStoreBackup/backupdb/result = "
            X.C18260x0.A0y(r0, r1, r6)
            return r6
        L_0x09db:
            monitor-exit(r22)     // Catch:{ all -> 0x09f1 }
        L_0x09dc:
            java.lang.String r0 = "MessageStoreBackup/backup/wal checkpoint failed"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x09f1 }
        L_0x09e1:
            r44.A05()
            boolean r0 = r43.isHeldByCurrentThread()
            if (r0 == 0) goto L_0x09ed
            r8.A0W()
        L_0x09ed:
            return r6
        L_0x09ee:
            r0 = move-exception
            monitor-exit(r22)     // Catch:{ all -> 0x09f1 }
            throw r0     // Catch:{ all -> 0x09f1 }
        L_0x09f1:
            r1 = move-exception
            r44.A05()
            boolean r0 = r43.isHeldByCurrentThread()
            if (r0 == 0) goto L_0x09fe
            r8.A0W()
        L_0x09fe:
            throw r1
        L_0x09ff:
            java.lang.String r0 = "databasehelper/cleanBeforeBackup/database is not initialized"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)     // Catch:{ all -> 0x0a06 }
            throw r0     // Catch:{ all -> 0x0a06 }
        L_0x0a06:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x0a0b }
            goto L_0x0a0f
        L_0x0a0b:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0a10 }
        L_0x0a0f:
            throw r1     // Catch:{ all -> 0x0a10 }
        L_0x0a10:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x0a15 }
            throw r1
        L_0x0a15:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x0a1a:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "checkaccounthashvalidity/error = "
            java.lang.String r1 = X.AnonymousClass000.A0P(r2, r0, r1)
            r0 = 3
            r12.A01(r1, r0)
        L_0x0a29:
            java.lang.String r1 = "MessageStoreBackup/backupdb/check/invalid"
            r0 = 2
            r12.A01(r1, r0)
            r0 = 3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C625835r.A0C(X.0su, int, int):int");
    }

    public File A0K() {
        String externalStorageState = Environment.getExternalStorageState();
        AnonymousClass5ZR r1 = this.A0F;
        if (("mounted".equals(externalStorageState) || "mounted_ro".equals(externalStorageState)) && (r1.A08() || r1.A03(C107035aa.A04()) == 0)) {
            ArrayList A0P2 = A0P();
            int size = A0P2.size();
            while (true) {
                size--;
                if (size < 0) {
                    return null;
                }
                File file = (File) A0P2.get(size);
                if (file.length() > 0 && !file.getName().contains("-increment-")) {
                    StringBuilder A0o2 = AnonymousClass001.A0o();
                    C18270x1.A0y(file, "MessageStoreBackup/lastbackupfile/file ", A0o2);
                    Log.i(AnonymousClass000.A0N(file, " size=", A0o2));
                    return file;
                }
            }
        } else {
            C18260x0.A0r("MessageStoreBackup/verifyExternalMediaReadable/media_unavailable ", externalStorageState, AnonymousClass001.A0o());
            throw AnonymousClass002.A0C("External media is not readable");
        }
    }

    public File A0L() {
        File[] A0c2 = A0c();
        int length = A0c2.length;
        if (length != 0) {
            int i = 0;
            do {
                File file = A0c2[i];
                if (file.exists()) {
                    StringBuilder A0o2 = AnonymousClass001.A0o();
                    C18260x0.A1L(A0o2, AnonymousClass0x7.A0o(file, "MessageStoreBackup/get-latest-db-backup-for-gdrive ", A0o2));
                    return file;
                }
                i++;
            } while (i < length);
            StringBuilder A0o3 = AnonymousClass001.A0o();
            A0o3.append("MessageStoreBackup/get-latest-db-backup-for-gdrive/no-file-exists ");
            C18260x0.A1L(A0o3, A0c2[0].getAbsolutePath());
            return A0c2[0];
        }
        throw AnonymousClass001.A0e("MessageStoreBackup/backup/list-of-backup-files-is-null");
    }

    public List A0R() {
        int indexOf;
        ArrayList A0Q2 = A0Q();
        if (A0Q2.size() <= 1) {
            return A0Q2;
        }
        String name = ((File) A0Q2.get(AnonymousClass0x9.A03(A0Q2, 1))).getName();
        Pattern compile = Pattern.compile("(\\d{4})-(\\d{2})-(\\d{2})");
        Matcher matcher = compile.matcher(name);
        boolean find = matcher.find();
        if (find) {
            indexOf = matcher.start();
        } else {
            indexOf = name.indexOf(".");
        }
        String substring = name.substring(indexOf);
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator it = A0Q2.iterator();
        while (it.hasNext()) {
            A06(substring, A0s, it, compile, find ? 1 : 0);
        }
        return A0s;
    }

    public List A0S(int i) {
        AnonymousClass22O[] A042 = AnonymousClass22O.A04(AnonymousClass22O.A01(), AnonymousClass22O.A00());
        int i2 = 0;
        while (true) {
            int length = A042.length;
            if (i2 >= length) {
                return Collections.emptyList();
            }
            List A0T2 = A0T(A042[(length - i2) - 1], i, true);
            if (!A0T2.isEmpty()) {
                return A0T2;
            }
            i2++;
        }
    }

    public List A0T(AnonymousClass22O r8, int i, boolean z) {
        String A0X2;
        ArrayList A0s = AnonymousClass001.A0s();
        File A032 = this.A0B.A03();
        if (i == 1) {
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append("msgstore");
            A0X2 = AnonymousClass000.A0X(A02(r8, z), A0o2);
        } else if (i != 2) {
            StringBuilder A0o3 = AnonymousClass001.A0o();
            StringBuilder A0o4 = AnonymousClass001.A0o();
            A0o4.append("msgstore");
            C18270x1.A1C(A02(r8, z), A0o4, A0o3);
            A0o3.append("|");
            StringBuilder A0o5 = AnonymousClass001.A0o();
            A0o5.append("msgstore-increment-(\\d+)");
            A0X2 = AnonymousClass000.A0X(AnonymousClass000.A0X(A02(r8, z), A0o5), A0o3);
        } else {
            StringBuilder A0o6 = AnonymousClass001.A0o();
            A0o6.append("msgstore-increment-(\\d+)");
            A0X2 = AnonymousClass000.A0X(A02(r8, z), A0o6);
        }
        Pattern compile = Pattern.compile(A0X2);
        File[] listFiles = A032.listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                if (C18280x3.A1X(file.getName(), compile)) {
                    A0s.add(file);
                }
            }
        }
        return A0s;
    }

    public void A0Y(boolean z) {
        for (AnonymousClass22O r3 : AnonymousClass22O.values()) {
            List A0T2 = A0T(r3, 1, true);
            A0T2.addAll(A0T(r3, 2, true));
            Iterator it = A0T2.iterator();
            while (it.hasNext()) {
                File A0f2 = AnonymousClass0x9.A0f(it);
                if (A0f2.exists()) {
                    if (!z || System.currentTimeMillis() - A0f2.lastModified() < AnonymousClass0x7.A0D(A0A())) {
                        C06550Ye.A0L(A0f2);
                    } else {
                        StringBuilder A0o2 = AnonymousClass001.A0o();
                        A0o2.append("MessageStoreBackup/backup/too_old ");
                        C18260x0.A0o(new Date(A0f2.lastModified()), A0o2);
                        StringBuilder A0o3 = AnonymousClass001.A0o();
                        C18270x1.A0y(A0f2, "MessageStoreBackup/backup/delete ", A0o3);
                        AnonymousClass001.A1L(A0o3);
                        C18260x0.A1V(A0o3, A0f2.delete());
                    }
                }
            }
        }
    }

    public File[] A0c() {
        AnonymousClass22O[] A042 = AnonymousClass22O.A04(AnonymousClass22O.A01(), AnonymousClass22O.A00());
        int length = A042.length;
        File[] fileArr = new File[length];
        for (int i = 0; i < length; i++) {
            fileArr[i] = A0N(A042[(length - i) - 1]);
        }
        TextUtils.join(", ", fileArr);
        return fileArr;
    }

    public C625835r(C29171iO r5, C55682qk r6, C69263Wi r7, C56972sr r8, AnonymousClass0WN r9, C47372d9 r10, C29401il r11, AnonymousClass310 r12, C56512s6 r13, C56612sH r14, C54292oU r15, AnonymousClass5ZR r16, AnonymousClass33p r17, C61072zf r18, C48502f0 r19, C56762sW r20, AnonymousClass30G r21, C55062pj r22, C66533Lu r23, AnonymousClass319 r24, AnonymousClass2W1 r25, C28761hj r26, C55272q5 r27, C72303dV r28, C47322d4 r29, C49002fp r30, AnonymousClass30D r31, C48602fA r32, C60972zT r33, C45932ao r34, AnonymousClass1VW r35, AnonymousClass1VX r36, AnonymousClass4FV r37, C48092eK r38, C59302wh r39, C60152y5 r40, C618232j r41, C619632y r42, C48772fR r43, C622634i r44, C49262gF r45, AnonymousClass4FS r46, C34441vA r47, C183538qC r48, C183538qC r49) {
        this.A0E = r15;
        this.A0D = r14;
        AnonymousClass1VX r2 = r36;
        this.A0Z = r2;
        this.A06 = r7;
        this.A05 = r6;
        this.A0h = r44;
        this.A07 = r8;
        this.A0j = r46;
        this.A0a = r37;
        this.A0B = r12;
        this.A0H = r18;
        this.A0X = r34;
        this.A0i = r45;
        this.A0k = r47;
        this.A0Y = r35;
        this.A0M = r23;
        this.A0c = r39;
        this.A0I = r19;
        this.A08 = r9;
        this.A0K = r21;
        this.A0J = r20;
        this.A0N = r24;
        this.A0C = r13;
        C48602fA r3 = r32;
        this.A0V = r3;
        this.A0T = r30;
        this.A0e = r41;
        this.A0P = r26;
        this.A0n = r48;
        this.A0R = r28;
        this.A0F = r16;
        this.A0G = r17;
        this.A0A = r11;
        this.A0W = r33;
        this.A0L = r22;
        this.A0m = r49;
        this.A0g = r43;
        this.A0U = r31;
        this.A0d = r40;
        this.A04 = r5;
        this.A0S = r29;
        this.A0f = r42;
        this.A0O = r25;
        this.A0Q = r27;
        this.A09 = r10;
        this.A0b = r38;
        this.A03 = AnonymousClass08M.A01();
        this.A0l = C72333dY.A06(new AnonymousClass4KK(r2, 1, r3));
    }
}
