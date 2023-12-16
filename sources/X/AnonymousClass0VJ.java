package X;

import android.database.Cursor;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0VJ  reason: invalid class name */
public class AnonymousClass0VJ {
    public static final String A00 = C06240Wu.A01("Schedulers");

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0056, code lost:
        if (r2 == null) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0058, code lost:
        r2 = new X.C09030fX(r6);
        X.AnonymousClass0SG.A00(r6, androidx.work.impl.background.systemalarm.SystemAlarmService.class, true);
        r1 = X.C06240Wu.A00();
        r0 = "Created SystemAlarmScheduler";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C16880uB A00(android.content.Context r6, X.C06310Xb r7) {
        /*
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 23
            r4 = 1
            if (r1 < r0) goto L_0x001d
            X.0fY r2 = new X.0fY
            r2.<init>(r6, r7)
            java.lang.Class<androidx.work.impl.background.systemjob.SystemJobService> r0 = androidx.work.impl.background.systemjob.SystemJobService.class
            X.AnonymousClass0SG.A00(r6, r0, r4)
            X.0Wu r1 = X.C06240Wu.A00()
            java.lang.String r5 = A00
            java.lang.String r0 = "Created SystemJobScheduler and enabled SystemJobService"
        L_0x0019:
            r1.A04(r5, r0)
        L_0x001c:
            return r2
        L_0x001d:
            java.lang.String r0 = "androidx.work.impl.background.gcm.GcmScheduler"
            java.lang.Class r3 = java.lang.Class.forName(r0)     // Catch:{ all -> 0x0044 }
            java.lang.Class[] r1 = new java.lang.Class[r4]     // Catch:{ all -> 0x0044 }
            java.lang.Class<android.content.Context> r0 = android.content.Context.class
            r2 = 0
            r1[r2] = r0     // Catch:{ all -> 0x0044 }
            java.lang.reflect.Constructor r1 = r3.getConstructor(r1)     // Catch:{ all -> 0x0044 }
            java.lang.Object[] r0 = new java.lang.Object[r4]     // Catch:{ all -> 0x0044 }
            r0[r2] = r6     // Catch:{ all -> 0x0044 }
            java.lang.Object r2 = r1.newInstance(r0)     // Catch:{ all -> 0x0044 }
            X.0uB r2 = (X.C16880uB) r2     // Catch:{ all -> 0x0044 }
            X.0Wu r1 = X.C06240Wu.A00()     // Catch:{ all -> 0x0044 }
            java.lang.String r5 = A00     // Catch:{ all -> 0x0044 }
            java.lang.String r0 = "Created androidx.work.impl.background.gcm.GcmScheduler"
            r1.A04(r5, r0)     // Catch:{ all -> 0x0044 }
            goto L_0x0056
        L_0x0044:
            r3 = move-exception
            X.0Wu r0 = X.C06240Wu.A00()
            java.lang.String r5 = A00
            java.lang.String r2 = "Unable to create GCM Scheduler"
            int r1 = r0.A00
            r0 = 3
            if (r1 > r0) goto L_0x0058
            android.util.Log.d(r5, r2, r3)
            goto L_0x0058
        L_0x0056:
            if (r2 != 0) goto L_0x001c
        L_0x0058:
            X.0fX r2 = new X.0fX
            r2.<init>(r6)
            java.lang.Class<androidx.work.impl.background.systemalarm.SystemAlarmService> r0 = androidx.work.impl.background.systemalarm.SystemAlarmService.class
            X.AnonymousClass0SG.A00(r6, r0, r4)
            X.0Wu r1 = X.C06240Wu.A00()
            java.lang.String r0 = "Created SystemAlarmScheduler"
            goto L_0x0019
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0VJ.A00(android.content.Context, X.0Xb):X.0uB");
    }

    public static void A01(C04320Nt r70, WorkDatabase workDatabase, List list) {
        C08700eu A002;
        Cursor A003;
        String str;
        String str2;
        String str3;
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        if (list != null && list.size() != 0) {
            C17060uV A0J = workDatabase.A0J();
            workDatabase.A0A();
            try {
                int A004 = r70.A00();
                A002 = C02920Ic.A00("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))", 1);
                A002.Axs(1, (long) A004);
                AnonymousClass0R5 r1 = ((C09140fi) A0J).A02;
                r1.A09();
                A003 = C02930Id.A00(r1, A002, false);
                int A02 = AnonymousClass0X4.A02(A003, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                int A022 = AnonymousClass0X4.A02(A003, "state");
                int A023 = AnonymousClass0X4.A02(A003, "worker_class_name");
                int A024 = AnonymousClass0X4.A02(A003, "input_merger_class_name");
                int A025 = AnonymousClass0X4.A02(A003, "input");
                int A026 = AnonymousClass0X4.A02(A003, "output");
                int A027 = AnonymousClass0X4.A02(A003, "initial_delay");
                int A028 = AnonymousClass0X4.A02(A003, "interval_duration");
                int A029 = AnonymousClass0X4.A02(A003, "flex_duration");
                int A0210 = AnonymousClass0X4.A02(A003, "run_attempt_count");
                int A0211 = AnonymousClass0X4.A02(A003, "backoff_policy");
                int A0212 = AnonymousClass0X4.A02(A003, "backoff_delay_duration");
                int A0213 = AnonymousClass0X4.A02(A003, "last_enqueue_time");
                int A0214 = AnonymousClass0X4.A02(A003, "minimum_retention_duration");
                int A0215 = AnonymousClass0X4.A02(A003, "schedule_requested_at");
                int A0216 = AnonymousClass0X4.A02(A003, "run_in_foreground");
                int A0217 = AnonymousClass0X4.A02(A003, "out_of_quota_policy");
                int A0218 = AnonymousClass0X4.A02(A003, "period_count");
                int A0219 = AnonymousClass0X4.A02(A003, "generation");
                int A0220 = AnonymousClass0X4.A02(A003, "required_network_type");
                int A0221 = AnonymousClass0X4.A02(A003, "requires_charging");
                int A0222 = AnonymousClass0X4.A02(A003, "requires_device_idle");
                int A0223 = AnonymousClass0X4.A02(A003, "requires_battery_not_low");
                int A0224 = AnonymousClass0X4.A02(A003, "requires_storage_not_low");
                int A0225 = AnonymousClass0X4.A02(A003, "trigger_content_update_delay");
                int A0226 = AnonymousClass0X4.A02(A003, "trigger_max_content_delay");
                int A0227 = AnonymousClass0X4.A02(A003, "content_uri_triggers");
                ArrayList A0o = AnonymousClass000.A0o(A003);
                while (A003.moveToNext()) {
                    if (A003.isNull(A02)) {
                        str = null;
                    } else {
                        str = A003.getString(A02);
                    }
                    AnonymousClass0GD A07 = AnonymousClass0YN.A07(A003.getInt(A022));
                    if (A003.isNull(A023)) {
                        str2 = null;
                    } else {
                        str2 = A003.getString(A023);
                    }
                    if (A003.isNull(A024)) {
                        str3 = null;
                    } else {
                        str3 = A003.getString(A024);
                    }
                    if (A003.isNull(A025)) {
                        bArr = null;
                    } else {
                        bArr = A003.getBlob(A025);
                    }
                    AnonymousClass0Xq A005 = AnonymousClass0Xq.A00(bArr);
                    if (A003.isNull(A026)) {
                        bArr2 = null;
                    } else {
                        bArr2 = A003.getBlob(A026);
                    }
                    AnonymousClass0Xq A006 = AnonymousClass0Xq.A00(bArr2);
                    long j = A003.getLong(A027);
                    long j2 = A003.getLong(A028);
                    long j3 = A003.getLong(A029);
                    int i = A003.getInt(A0210);
                    AnonymousClass0FN A04 = AnonymousClass0YN.A04(A003.getInt(A0211));
                    long j4 = A003.getLong(A0212);
                    long j5 = A003.getLong(A0213);
                    long j6 = A003.getLong(A0214);
                    long j7 = A003.getLong(A0215);
                    boolean A1S = AnonymousClass000.A1S(A003.getInt(A0216));
                    AnonymousClass0FO A06 = AnonymousClass0YN.A06(A003.getInt(A0217));
                    int i2 = A003.getInt(A0218);
                    int i3 = A003.getInt(A0219);
                    C02380Fy A05 = AnonymousClass0YN.A05(A003.getInt(A0220));
                    boolean A1S2 = AnonymousClass000.A1S(A003.getInt(A0221));
                    boolean A1S3 = AnonymousClass000.A1S(A003.getInt(A0222));
                    boolean A1S4 = AnonymousClass000.A1S(A003.getInt(A0223));
                    boolean A1S5 = AnonymousClass000.A1S(A003.getInt(A0224));
                    long j8 = A003.getLong(A0225);
                    long j9 = A003.getLong(A0226);
                    if (A003.isNull(A0227)) {
                        bArr3 = null;
                    } else {
                        bArr3 = A003.getBlob(A0227);
                    }
                    A0o.add(new C06250Wv(A04, new AnonymousClass0XS(A05, AnonymousClass0YN.A08(bArr3), j8, j9, A1S2, A1S3, A1S4, A1S5), A005, A006, A06, A07, str, str2, str3, i, i2, i3, j, j2, j3, j4, j5, j6, j7, A1S));
                }
                A003.close();
                A002.A01();
                List B4O = A0J.B4O(200);
                if (A0o.size() > 0) {
                    long currentTimeMillis = System.currentTimeMillis();
                    Iterator it = A0o.iterator();
                    while (it.hasNext()) {
                        A0J.BKZ(((C06250Wv) it.next()).A0J, currentTimeMillis);
                    }
                }
                workDatabase.A0B();
                workDatabase.A0C();
                if (A0o.size() > 0) {
                    C06250Wv[] r3 = (C06250Wv[]) A0o.toArray(new C06250Wv[A0o.size()]);
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        C16880uB r12 = (C16880uB) it2.next();
                        if (r12.BFJ()) {
                            r12.Bkm(r3);
                        }
                    }
                }
                if (B4O.size() > 0) {
                    C06250Wv[] r32 = (C06250Wv[]) B4O.toArray(new C06250Wv[B4O.size()]);
                    Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        C16880uB r13 = (C16880uB) it3.next();
                        if (!r13.BFJ()) {
                            r13.Bkm(r32);
                        }
                    }
                }
            } catch (Throwable th) {
                workDatabase.A0C();
                throw th;
            }
        }
    }
}
