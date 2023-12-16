package X;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import com.whatsapp.util.Log;

/* renamed from: X.2qx  reason: invalid class name and case insensitive filesystem */
public class C55812qx {
    public final C04840Qw A00 = new AnonymousClass67Y(this);
    public final C56612sH A01;
    public final AnonymousClass1RC A02;
    public final AnonymousClass4FS A03;

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00ea, code lost:
        return r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized X.AnonymousClass5LM A02(java.lang.String r12, int r13) {
        /*
            r11 = this;
            monitor-enter(r11)
            X.C626936e.A00()     // Catch:{ all -> 0x00eb }
            X.0Qw r2 = r11.A00     // Catch:{ all -> 0x00eb }
            java.lang.String r0 = X.C18260x0.A05(r12, r13)     // Catch:{ all -> 0x00eb }
            java.lang.Object r4 = r2.A04(r0)     // Catch:{ all -> 0x00eb }
            X.5LM r4 = (X.AnonymousClass5LM) r4     // Catch:{ all -> 0x00eb }
            if (r4 != 0) goto L_0x00e9
            X.1RC r0 = r11.A02     // Catch:{ all -> 0x00eb }
            X.4GK r10 = r0.get()     // Catch:{ all -> 0x00eb }
            r0 = r10
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x00df }
            X.2sg r6 = r0.A03     // Catch:{ all -> 0x00df }
            java.lang.String r4 = "SELECT + _id, uuid, job_type , create_time, transfer_start_time, last_update_time, user_initiated_attempt_count, overall_cumulative_time, overall_cumulative_user_visible_time, streaming_playback_count, media_key_reuse_type, doodle_id, transferred_bytes, reupload_attempt_count, last_reupload_attempt_timestamp, last_reupload_success_timestamp FROM media_job WHERE uuid=? AND job_type=?"
            r5 = 2
            java.lang.String[] r3 = X.C18300x5.A1a(r12, r5)     // Catch:{ all -> 0x00df }
            java.lang.String r0 = java.lang.Integer.toString(r13)     // Catch:{ all -> 0x00df }
            r1 = 1
            r3[r1] = r0     // Catch:{ all -> 0x00df }
            java.lang.String r0 = "MediaJobDataStore/get"
            android.database.Cursor r3 = r6.A0E(r4, r0, r3)     // Catch:{ all -> 0x00df }
            boolean r0 = r3.moveToLast()     // Catch:{ all -> 0x00d3 }
            if (r0 == 0) goto L_0x00ca
            X.2dO r4 = new X.2dO     // Catch:{ all -> 0x00d3 }
            r4.<init>()     // Catch:{ all -> 0x00d3 }
            java.lang.String r0 = r3.getString(r1)     // Catch:{ all -> 0x00d3 }
            r4.A0D = r0     // Catch:{ all -> 0x00d3 }
            int r0 = r3.getInt(r5)     // Catch:{ all -> 0x00d3 }
            r4.A00 = r0     // Catch:{ all -> 0x00d3 }
            r0 = 3
            long r5 = r3.getLong(r0)     // Catch:{ all -> 0x00d3 }
            r4.A05 = r5     // Catch:{ all -> 0x00d3 }
            long r0 = r4.A08     // Catch:{ all -> 0x00d3 }
            r8 = 0
            int r7 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r7 >= 0) goto L_0x0059
            r4.A08 = r5     // Catch:{ all -> 0x00d3 }
        L_0x0059:
            r0 = 4
            long r0 = r3.getLong(r0)     // Catch:{ all -> 0x00d3 }
            r4.A0B = r0     // Catch:{ all -> 0x00d3 }
            r0 = 5
            long r0 = r3.getLong(r0)     // Catch:{ all -> 0x00d3 }
            r4.A08 = r0     // Catch:{ all -> 0x00d3 }
            r0 = 6
            int r0 = r3.getInt(r0)     // Catch:{ all -> 0x00d3 }
            r4.A04 = r0     // Catch:{ all -> 0x00d3 }
            r0 = 7
            long r0 = r3.getLong(r0)     // Catch:{ all -> 0x00d3 }
            r4.A09 = r0     // Catch:{ all -> 0x00d3 }
            r0 = 8
            long r0 = r3.getLong(r0)     // Catch:{ all -> 0x00d3 }
            r4.A0A = r0     // Catch:{ all -> 0x00d3 }
            r0 = 9
            int r0 = r3.getInt(r0)     // Catch:{ all -> 0x00d3 }
            r4.A03 = r0     // Catch:{ all -> 0x00d3 }
            r0 = 10
            int r0 = r3.getInt(r0)     // Catch:{ all -> 0x00d3 }
            r4.A01 = r0     // Catch:{ all -> 0x00d3 }
            r0 = 12
            long r0 = r3.getLong(r0)     // Catch:{ all -> 0x00d3 }
            r4.A0C = r0     // Catch:{ all -> 0x00d3 }
            r0 = 13
            int r0 = r3.getInt(r0)     // Catch:{ all -> 0x00d3 }
            r4.A02 = r0     // Catch:{ all -> 0x00d3 }
            r0 = 14
            long r0 = r3.getLong(r0)     // Catch:{ all -> 0x00d3 }
            r4.A06 = r0     // Catch:{ all -> 0x00d3 }
            r0 = 15
            long r0 = r3.getLong(r0)     // Catch:{ all -> 0x00d3 }
            r4.A07 = r0     // Catch:{ all -> 0x00d3 }
            X.5LM r4 = r4.A00()     // Catch:{ all -> 0x00d3 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x00d3 }
            java.lang.String r0 = r4.A0D     // Catch:{ all -> 0x00d3 }
            r1.append(r0)     // Catch:{ all -> 0x00d3 }
            int r0 = r4.A0B     // Catch:{ all -> 0x00d3 }
            java.lang.String r0 = X.AnonymousClass000.A0h(r1, r0)     // Catch:{ all -> 0x00d3 }
            r2.A08(r0, r4)     // Catch:{ all -> 0x00d3 }
            r3.close()     // Catch:{ all -> 0x00df }
            r10.close()     // Catch:{ all -> 0x00eb }
            goto L_0x00e9
        L_0x00ca:
            r3.close()     // Catch:{ all -> 0x00df }
            r10.close()     // Catch:{ all -> 0x00eb }
            monitor-exit(r11)
            r0 = 0
            return r0
        L_0x00d3:
            r1 = move-exception
            if (r3 == 0) goto L_0x00de
            r3.close()     // Catch:{ all -> 0x00da }
            goto L_0x00de
        L_0x00da:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x00df }
        L_0x00de:
            throw r1     // Catch:{ all -> 0x00df }
        L_0x00df:
            r1 = move-exception
            r10.close()     // Catch:{ all -> 0x00e4 }
            goto L_0x00e8
        L_0x00e4:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x00eb }
        L_0x00e8:
            throw r1     // Catch:{ all -> 0x00eb }
        L_0x00e9:
            monitor-exit(r11)
            return r4
        L_0x00eb:
            r0 = move-exception
            monitor-exit(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55812qx.A02(java.lang.String, int):X.5LM");
    }

    public synchronized void A04(AnonymousClass5LM r11) {
        C69833Yo Axl;
        C626936e.A00();
        try {
            C85284Fq A0C = this.A02.A0C();
            try {
                Axl = A0C.Axl();
                C56862sg r7 = ((AnonymousClass3H0) A0C).A03;
                String[] A1Z = AnonymousClass0x9.A1Z();
                String str = r11.A0D;
                A1Z[0] = str;
                int i = r11.A0B;
                A1Z[1] = Integer.toString(i);
                r7.A07("media_job", "uuid = ? AND job_type = ? ", "MediaJobDataStore/delete", A1Z);
                Axl.A00();
                this.A00.A05(C18260x0.A05(str, i));
                Axl.close();
                A0C.close();
            } catch (Throwable th) {
                A0C.close();
                throw th;
            }
        } catch (SQLiteDatabaseCorruptException e) {
            Log.e("mediajobdb/delete", e);
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        return;
        throw th;
    }

    public final ContentValues A00(AnonymousClass5LM r26) {
        AnonymousClass5LM r2 = r26;
        String str = r2.A0D;
        long j = (long) r2.A0B;
        long j2 = r2.A0C;
        long j3 = r2.A09;
        long j4 = (long) r2.A03;
        long j5 = r2.A07;
        long j6 = r2.A08;
        int i = r2.A02;
        int i2 = r2.A00;
        long j7 = r2.A0A;
        int i3 = r2.A01;
        long j8 = r2.A04;
        long j9 = r2.A05;
        ContentValues A06 = AnonymousClass0x9.A06();
        A06.put("uuid", str);
        C18270x1.A0c(A06, "job_type", j);
        C18270x1.A0c(A06, "create_time", j2);
        C18270x1.A0c(A06, "transfer_start_time", j3);
        A06.put("last_update_time", C56612sH.A09(this.A01));
        C18270x1.A0c(A06, "user_initiated_attempt_count", j4);
        C18270x1.A0c(A06, "overall_cumulative_time", j5);
        C18270x1.A0c(A06, "overall_cumulative_user_visible_time", j6);
        C18270x1.A0b(A06, "streaming_playback_count", i);
        C18270x1.A0b(A06, "media_key_reuse_type", i2);
        C18270x1.A0c(A06, "transferred_bytes", j7);
        C18270x1.A0b(A06, "reupload_attempt_count", i3);
        C18270x1.A0c(A06, "last_reupload_attempt_timestamp", j8);
        C18270x1.A0c(A06, "last_reupload_success_timestamp", j9);
        return A06;
    }

    public AnonymousClass5LM A01(String str, int i) {
        C47522dO r8 = new C47522dO();
        r8.A0D = str;
        r8.A00 = i;
        C56612sH r9 = this.A01;
        long A0H = r9.A0H();
        r8.A05 = A0H;
        if (r8.A08 < 0) {
            r8.A08 = A0H;
        }
        r8.A0B = r9.A0H();
        r8.A08 = r9.A0H();
        r8.A04 = 0;
        r8.A03 = 0;
        r8.A02 = 0;
        r8.A06 = 0;
        r8.A07 = 0;
        AnonymousClass5LM A002 = r8.A00();
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("mediajobdb/create/");
        C18260x0.A1J(A0o, A002.A0D);
        C71353by.A01(this.A03, this, A002, 26);
        return A002;
    }

    public void A03(AnonymousClass5LM r4) {
        r4.A06 = this.A01.A0H();
        if (A05(r4)) {
            C04840Qw r2 = this.A00;
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append(r4.A0D);
            r2.A08(AnonymousClass000.A0h(A0o, r4.A0B), r4);
        }
    }

    public C55812qx(C56612sH r2, AnonymousClass1RC r3, AnonymousClass4FS r4) {
        this.A01 = r2;
        this.A03 = r4;
        this.A02 = r3;
    }

    public final boolean A05(AnonymousClass5LM r11) {
        C85284Fq A0C;
        C626936e.A00();
        try {
            A0C = this.A02.A0C();
            C56862sg r4 = ((AnonymousClass3H0) A0C).A03;
            ContentValues A002 = A00(r11);
            String[] A1Z = AnonymousClass0x9.A1Z();
            A1Z[0] = r11.A0D;
            A1Z[1] = Integer.toString(r11.A0B);
            r4.A05(A002, "media_job", "uuid = ? AND job_type = ? ", "MediaJobDataStore/updateInternal", A1Z);
            A0C.close();
            return true;
        } catch (SQLiteDatabaseCorruptException e) {
            Log.e("mediajobdb/update", e);
            return false;
        } catch (Error | RuntimeException e2) {
            Log.e(e2);
            throw e2;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }
}
