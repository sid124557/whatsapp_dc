package X;

import android.database.Cursor;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.0Y4  reason: invalid class name */
public class AnonymousClass0Y4 {
    public final /* synthetic */ WorkDatabase_Impl A00;

    public AnonymousClass0LE A08(C17430vW r39) {
        StringBuilder A0o;
        String str;
        HashMap hashMap = new HashMap(2);
        hashMap.put("work_spec_id", new AnonymousClass0W6("work_spec_id", "TEXT", (String) null, 1, 1, true));
        hashMap.put("prerequisite_id", new AnonymousClass0W6("prerequisite_id", "TEXT", (String) null, 2, 1, true));
        HashSet hashSet = new HashSet(2);
        hashSet.add(new C04600Pm("WorkSpec", "CASCADE", "CASCADE", A03("work_spec_id"), A03(PublicKeyCredentialControllerUtility.JSON_KEY_ID)));
        A07("prerequisite_id", hashSet);
        HashSet hashSet2 = new HashSet(2);
        hashSet2.add(new AnonymousClass0Pe("index_Dependency_work_spec_id", A03("work_spec_id"), A03("ASC"), false));
        hashSet2.add(new AnonymousClass0Pe("index_Dependency_prerequisite_id", A03("prerequisite_id"), A03("ASC"), false));
        AnonymousClass0Pf r0 = new AnonymousClass0Pf("Dependency", hashMap, hashSet, hashSet2);
        C17430vW r11 = r39;
        AnonymousClass0Pf A01 = A01(r11, "Dependency");
        if (!r0.equals(A01)) {
            A0o = AnonymousClass001.A0o();
            str = "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n";
        } else {
            HashMap hashMap2 = new HashMap(27);
            hashMap2.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, new AnonymousClass0W6(PublicKeyCredentialControllerUtility.JSON_KEY_ID, "TEXT", (String) null, 1, 1, true));
            hashMap2.put("state", new AnonymousClass0W6("state", "INTEGER", (String) null, 0, 1, true));
            String str2 = "TEXT";
            hashMap2.put("worker_class_name", new AnonymousClass0W6("worker_class_name", str2, (String) null, 0, 1, true));
            hashMap2.put("input_merger_class_name", new AnonymousClass0W6("input_merger_class_name", str2, (String) null, 0, 1, false));
            hashMap2.put("input", new AnonymousClass0W6("input", "BLOB", (String) null, 0, 1, true));
            hashMap2.put("output", new AnonymousClass0W6("output", "BLOB", (String) null, 0, 1, true));
            String str3 = "INTEGER";
            hashMap2.put("initial_delay", new AnonymousClass0W6("initial_delay", str3, (String) null, 0, 1, true));
            hashMap2.put("interval_duration", new AnonymousClass0W6("interval_duration", str3, (String) null, 0, 1, true));
            hashMap2.put("flex_duration", new AnonymousClass0W6("flex_duration", str3, (String) null, 0, 1, true));
            hashMap2.put("run_attempt_count", new AnonymousClass0W6("run_attempt_count", str3, (String) null, 0, 1, true));
            hashMap2.put("backoff_policy", new AnonymousClass0W6("backoff_policy", str3, (String) null, 0, 1, true));
            hashMap2.put("backoff_delay_duration", new AnonymousClass0W6("backoff_delay_duration", str3, (String) null, 0, 1, true));
            hashMap2.put("last_enqueue_time", new AnonymousClass0W6("last_enqueue_time", str3, (String) null, 0, 1, true));
            hashMap2.put("minimum_retention_duration", new AnonymousClass0W6("minimum_retention_duration", str3, (String) null, 0, 1, true));
            hashMap2.put("schedule_requested_at", new AnonymousClass0W6("schedule_requested_at", str3, (String) null, 0, 1, true));
            hashMap2.put("run_in_foreground", new AnonymousClass0W6("run_in_foreground", str3, (String) null, 0, 1, true));
            hashMap2.put("out_of_quota_policy", new AnonymousClass0W6("out_of_quota_policy", str3, (String) null, 0, 1, true));
            hashMap2.put("period_count", new AnonymousClass0W6("period_count", str3, "0", 0, 1, true));
            String str4 = "generation";
            hashMap2.put("generation", new AnonymousClass0W6(str4, str3, "0", 0, 1, true));
            String str5 = "INTEGER";
            hashMap2.put("required_network_type", new AnonymousClass0W6("required_network_type", str5, (String) null, 0, 1, true));
            hashMap2.put("requires_charging", new AnonymousClass0W6("requires_charging", str5, (String) null, 0, 1, true));
            hashMap2.put("requires_device_idle", new AnonymousClass0W6("requires_device_idle", str5, (String) null, 0, 1, true));
            hashMap2.put("requires_battery_not_low", new AnonymousClass0W6("requires_battery_not_low", str5, (String) null, 0, 1, true));
            hashMap2.put("requires_storage_not_low", new AnonymousClass0W6("requires_storage_not_low", str5, (String) null, 0, 1, true));
            hashMap2.put("trigger_content_update_delay", new AnonymousClass0W6("trigger_content_update_delay", str5, (String) null, 0, 1, true));
            hashMap2.put("trigger_max_content_delay", new AnonymousClass0W6("trigger_max_content_delay", str5, (String) null, 0, 1, true));
            hashMap2.put("content_uri_triggers", new AnonymousClass0W6("content_uri_triggers", "BLOB", (String) null, 0, 1, true));
            HashSet hashSet3 = new HashSet(0);
            HashSet hashSet4 = new HashSet(2);
            hashSet4.add(new AnonymousClass0Pe("index_WorkSpec_schedule_requested_at", A03("schedule_requested_at"), A03("ASC"), false));
            hashSet4.add(new AnonymousClass0Pe("index_WorkSpec_last_enqueue_time", A03("last_enqueue_time"), A03("ASC"), false));
            r0 = new AnonymousClass0Pf("WorkSpec", hashMap2, hashSet3, hashSet4);
            A01 = A01(r11, "WorkSpec");
            if (!r0.equals(A01)) {
                A0o = AnonymousClass001.A0o();
                str = "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n";
            } else {
                HashMap hashMap3 = new HashMap(2);
                String str6 = "TEXT";
                hashMap3.put("tag", new AnonymousClass0W6("tag", str6, (String) null, 1, 1, true));
                String str7 = "work_spec_id";
                hashMap3.put("work_spec_id", new AnonymousClass0W6(str7, str6, (String) null, 2, 1, true));
                HashSet hashSet5 = new HashSet(1);
                A07("work_spec_id", hashSet5);
                HashSet hashSet6 = new HashSet(1);
                hashSet6.add(new AnonymousClass0Pe("index_WorkTag_work_spec_id", A03("work_spec_id"), A03("ASC"), false));
                r0 = new AnonymousClass0Pf("WorkTag", hashMap3, hashSet5, hashSet6);
                A01 = A01(r11, "WorkTag");
                if (!r0.equals(A01)) {
                    A0o = AnonymousClass001.A0o();
                    str = "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n";
                } else {
                    HashMap hashMap4 = new HashMap(3);
                    hashMap4.put("work_spec_id", new AnonymousClass0W6(str7, str6, (String) null, 1, 1, true));
                    hashMap4.put("generation", new AnonymousClass0W6(str4, str3, "0", 2, 1, true));
                    hashMap4.put("system_id", new AnonymousClass0W6("system_id", str3, (String) null, 0, 1, true));
                    HashSet hashSet7 = new HashSet(1);
                    A07("work_spec_id", hashSet7);
                    r0 = new AnonymousClass0Pf("SystemIdInfo", hashMap4, hashSet7, new HashSet(0));
                    A01 = A01(r11, "SystemIdInfo");
                    if (!r0.equals(A01)) {
                        A0o = AnonymousClass001.A0o();
                        str = "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n";
                    } else {
                        HashMap hashMap5 = new HashMap(2);
                        String str8 = "TEXT";
                        hashMap5.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, new AnonymousClass0W6(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str8, (String) null, 1, 1, true));
                        String str9 = "work_spec_id";
                        hashMap5.put("work_spec_id", new AnonymousClass0W6(str9, str8, (String) null, 2, 1, true));
                        HashSet hashSet8 = new HashSet(1);
                        A07("work_spec_id", hashSet8);
                        HashSet hashSet9 = new HashSet(1);
                        hashSet9.add(new AnonymousClass0Pe("index_WorkName_work_spec_id", A03("work_spec_id"), A03("ASC"), false));
                        r0 = new AnonymousClass0Pf("WorkName", hashMap5, hashSet8, hashSet9);
                        A01 = A01(r11, "WorkName");
                        if (!r0.equals(A01)) {
                            A0o = AnonymousClass001.A0o();
                            str = "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n";
                        } else {
                            HashMap hashMap6 = new HashMap(2);
                            hashMap6.put("work_spec_id", new AnonymousClass0W6(str9, str8, (String) null, 1, 1, true));
                            hashMap6.put("progress", new AnonymousClass0W6("progress", "BLOB", (String) null, 0, 1, true));
                            HashSet hashSet10 = new HashSet(1);
                            A07("work_spec_id", hashSet10);
                            r0 = new AnonymousClass0Pf("WorkProgress", hashMap6, hashSet10, new HashSet(0));
                            A01 = A01(r11, "WorkProgress");
                            if (!r0.equals(A01)) {
                                A0o = AnonymousClass001.A0o();
                                str = "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n";
                            } else {
                                HashMap hashMap7 = new HashMap(2);
                                hashMap7.put("key", new AnonymousClass0W6("key", "TEXT", (String) null, 1, 1, true));
                                hashMap7.put("long_value", new AnonymousClass0W6("long_value", "INTEGER", (String) null, 0, 1, false));
                                AnonymousClass0Pf r3 = new AnonymousClass0Pf("Preference", hashMap7, new HashSet(0), new HashSet(0));
                                AnonymousClass0Pf A012 = A01(r11, "Preference");
                                if (r3.equals(A012)) {
                                    return new AnonymousClass0LE(true, (String) null);
                                }
                                StringBuilder A0o2 = AnonymousClass001.A0o();
                                A0o2.append("Preference(androidx.work.impl.model.Preference).\n Expected:\n");
                                A0o2.append(r3);
                                return new AnonymousClass0LE(false, AnonymousClass000.A0P(A012, "\n Found:\n", A0o2));
                            }
                        }
                    }
                }
            }
        }
        A0o.append(str);
        A0o.append(r0);
        return new AnonymousClass0LE(false, AnonymousClass000.A0P(A01, "\n Found:\n", A0o));
    }

    public AnonymousClass0Y4(WorkDatabase_Impl workDatabase_Impl) {
        this.A00 = workDatabase_Impl;
    }

    public static final List A02(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        List A0f = C159507lx.A0f();
        while (cursor.moveToNext()) {
            int i = cursor.getInt(columnIndex);
            int i2 = cursor.getInt(columnIndex2);
            String string = cursor.getString(columnIndex3);
            C162457s7.A0D(string);
            String string2 = cursor.getString(columnIndex4);
            C162457s7.A0D(string2);
            A0f.add(new C10590iB(i, i2, string, string2));
        }
        return C73723fy.A0E(C159507lx.A0h(A0f));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x007c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x007d, code lost:
        X.AnonymousClass2A8.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0080, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.Map A04(X.C17430vW r14, java.lang.String r15) {
        /*
            java.lang.String r3 = "type"
            java.lang.String r2 = "name"
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "PRAGMA table_info(`"
            r1.append(r0)
            r1.append(r15)
            java.lang.String r0 = "`)"
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)
            android.database.Cursor r6 = r14.Bi1(r0)
            int r0 = r6.getColumnCount()     // Catch:{ all -> 0x007a }
            r8 = 0
            if (r0 > 0) goto L_0x0026
            java.util.Map r0 = X.C73813g7.A0A()     // Catch:{ all -> 0x007a }
            goto L_0x0076
        L_0x0026:
            int r7 = r6.getColumnIndex(r2)     // Catch:{ all -> 0x007a }
            int r5 = r6.getColumnIndex(r3)     // Catch:{ all -> 0x007a }
            java.lang.String r0 = "notnull"
            int r4 = r6.getColumnIndex(r0)     // Catch:{ all -> 0x007a }
            java.lang.String r0 = "pk"
            int r3 = r6.getColumnIndex(r0)     // Catch:{ all -> 0x007a }
            java.lang.String r0 = "dflt_value"
            int r2 = r6.getColumnIndex(r0)     // Catch:{ all -> 0x007a }
            java.util.Map r1 = X.AnonymousClass8UG.A0J()     // Catch:{ all -> 0x007a }
        L_0x0044:
            boolean r0 = r6.moveToNext()     // Catch:{ all -> 0x007a }
            if (r0 == 0) goto L_0x0072
            java.lang.String r10 = r6.getString(r7)     // Catch:{ all -> 0x007a }
            java.lang.String r11 = r6.getString(r5)     // Catch:{ all -> 0x007a }
            int r0 = r6.getInt(r4)     // Catch:{ all -> 0x007a }
            boolean r15 = X.AnonymousClass000.A1S(r0)
            int r13 = r6.getInt(r3)     // Catch:{ all -> 0x007a }
            java.lang.String r12 = r6.getString(r2)     // Catch:{ all -> 0x007a }
            X.C162457s7.A0D(r10)     // Catch:{ all -> 0x007a }
            X.C162457s7.A0D(r11)     // Catch:{ all -> 0x007a }
            r14 = 2
            X.0W6 r9 = new X.0W6     // Catch:{ all -> 0x007a }
            r9.<init>(r10, r11, r12, r13, r14, r15)     // Catch:{ all -> 0x007a }
            r1.put(r10, r9)     // Catch:{ all -> 0x007a }
            goto L_0x0044
        L_0x0072:
            java.util.Map r0 = X.AnonymousClass8UG.A0K(r1)     // Catch:{ all -> 0x007a }
        L_0x0076:
            X.AnonymousClass2A8.A00(r6, r8)
            return r0
        L_0x007a:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x007c }
        L_0x007c:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r6, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0Y4.A04(X.0vW, java.lang.String):java.util.Map");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006e, code lost:
        X.AnonymousClass2A8.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0071, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.Set A06(X.C17430vW r8, java.lang.String r9) {
        /*
            java.lang.String r2 = "name"
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "PRAGMA index_list(`"
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = "`)"
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)
            android.database.Cursor r4 = r8.Bi1(r0)
            int r7 = r4.getColumnIndex(r2)     // Catch:{ all -> 0x006b }
            java.lang.String r0 = "origin"
            int r6 = r4.getColumnIndex(r0)     // Catch:{ all -> 0x006b }
            java.lang.String r0 = "unique"
            int r5 = r4.getColumnIndex(r0)     // Catch:{ all -> 0x006b }
            r0 = -1
            r3 = 0
            if (r7 == r0) goto L_0x0067
            if (r6 == r0) goto L_0x0067
            if (r5 == r0) goto L_0x0067
            java.util.Set r2 = X.C154537dK.A07()     // Catch:{ all -> 0x006b }
        L_0x0034:
            boolean r0 = r4.moveToNext()     // Catch:{ all -> 0x006b }
            if (r0 == 0) goto L_0x005f
            java.lang.String r1 = r4.getString(r6)     // Catch:{ all -> 0x006b }
            java.lang.String r0 = "c"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x006b }
            if (r0 == 0) goto L_0x0034
            java.lang.String r1 = r4.getString(r7)     // Catch:{ all -> 0x006b }
            int r0 = r4.getInt(r5)     // Catch:{ all -> 0x006b }
            boolean r0 = X.AnonymousClass001.A1T(r0)
            X.C162457s7.A0D(r1)     // Catch:{ all -> 0x006b }
            X.0Pe r0 = A00(r8, r1, r0)     // Catch:{ all -> 0x006b }
            if (r0 == 0) goto L_0x0067
            r2.add(r0)     // Catch:{ all -> 0x006b }
            goto L_0x0034
        L_0x005f:
            java.util.Set r0 = X.C154537dK.A08(r2)     // Catch:{ all -> 0x006b }
            X.AnonymousClass2A8.A00(r4, r3)
            return r0
        L_0x0067:
            X.AnonymousClass2A8.A00(r4, r3)
            return r3
        L_0x006b:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x006d }
        L_0x006d:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r4, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0Y4.A06(X.0vW, java.lang.String):java.util.Set");
    }

    public static void A07(String str, AbstractCollection abstractCollection) {
        abstractCollection.add(new C04600Pm("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{str}), Arrays.asList(new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_ID})));
    }

    public void A09(C17430vW r2) {
        r2.B2q("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        r2.B2q("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
        r2.B2q("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
        r2.B2q("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
        r2.B2q("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
        r2.B2q("CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
        r2.B2q("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        r2.B2q("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
        r2.B2q("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        r2.B2q("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        r2.B2q("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
        r2.B2q("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        r2.B2q("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        r2.B2q("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        r2.B2q("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '5181942b9ebc31ce68dacb56c16fd79f')");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0094, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0095, code lost:
        X.AnonymousClass2A8.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0098, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.AnonymousClass0Pe A00(X.C17430vW r11, java.lang.String r12, boolean r13) {
        /*
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "PRAGMA index_xinfo(`"
            r1.append(r0)
            r1.append(r12)
            java.lang.String r0 = "`)"
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)
            android.database.Cursor r4 = r11.Bi1(r0)
            java.lang.String r0 = "seqno"
            int r11 = r4.getColumnIndex(r0)     // Catch:{ all -> 0x0092 }
            java.lang.String r0 = "cid"
            int r10 = r4.getColumnIndex(r0)     // Catch:{ all -> 0x0092 }
            java.lang.String r0 = "name"
            int r9 = r4.getColumnIndex(r0)     // Catch:{ all -> 0x0092 }
            java.lang.String r0 = "desc"
            int r8 = r4.getColumnIndex(r0)     // Catch:{ all -> 0x0092 }
            r6 = 0
            r0 = -1
            if (r11 == r0) goto L_0x008e
            if (r10 == r0) goto L_0x008e
            if (r9 == r0) goto L_0x008e
            if (r8 == r0) goto L_0x008e
            java.util.TreeMap r7 = new java.util.TreeMap     // Catch:{ all -> 0x0092 }
            r7.<init>()     // Catch:{ all -> 0x0092 }
            java.util.TreeMap r5 = new java.util.TreeMap     // Catch:{ all -> 0x0092 }
            r5.<init>()     // Catch:{ all -> 0x0092 }
        L_0x0042:
            boolean r0 = r4.moveToNext()     // Catch:{ all -> 0x0092 }
            if (r0 == 0) goto L_0x006f
            int r0 = r4.getInt(r10)     // Catch:{ all -> 0x0092 }
            if (r0 < 0) goto L_0x0042
            int r3 = r4.getInt(r11)     // Catch:{ all -> 0x0092 }
            java.lang.String r2 = r4.getString(r9)     // Catch:{ all -> 0x0092 }
            int r0 = r4.getInt(r8)     // Catch:{ all -> 0x0092 }
            if (r0 <= 0) goto L_0x006c
            java.lang.String r1 = "DESC"
        L_0x005e:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0092 }
            X.C162457s7.A0D(r2)     // Catch:{ all -> 0x0092 }
            r7.put(r0, r2)     // Catch:{ all -> 0x0092 }
            r5.put(r0, r1)     // Catch:{ all -> 0x0092 }
            goto L_0x0042
        L_0x006c:
            java.lang.String r1 = "ASC"
            goto L_0x005e
        L_0x006f:
            java.util.Collection r0 = r7.values()     // Catch:{ all -> 0x0092 }
            X.C162457s7.A0D(r0)     // Catch:{ all -> 0x0092 }
            java.util.List r2 = X.C73723fy.A0F(r0)     // Catch:{ all -> 0x0092 }
            java.util.Collection r0 = r5.values()     // Catch:{ all -> 0x0092 }
            X.C162457s7.A0D(r0)     // Catch:{ all -> 0x0092 }
            java.util.List r1 = X.C73723fy.A0F(r0)     // Catch:{ all -> 0x0092 }
            X.0Pe r0 = new X.0Pe     // Catch:{ all -> 0x0092 }
            r0.<init>(r12, r2, r1, r13)     // Catch:{ all -> 0x0092 }
            X.AnonymousClass2A8.A00(r4, r6)
            return r0
        L_0x008e:
            X.AnonymousClass2A8.A00(r4, r6)
            return r6
        L_0x0092:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0094 }
        L_0x0094:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r4, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0Y4.A00(X.0vW, java.lang.String, boolean):X.0Pe");
    }

    public static final AnonymousClass0Pf A01(C17430vW r4, String str) {
        return new AnonymousClass0Pf(str, A04(r4, str), A05(r4, str), A06(r4, str));
    }

    public static List A03(String str) {
        return Arrays.asList(new String[]{str});
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00c5, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00c6, code lost:
        X.AnonymousClass2A8.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00c9, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.Set A05(X.C17430vW r19, java.lang.String r20) {
        /*
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "PRAGMA foreign_key_list(`"
            r1.append(r0)
            r0 = r20
            r1.append(r0)
            java.lang.String r0 = "`)"
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)
            r1 = r19
            android.database.Cursor r6 = r1.Bi1(r0)
            java.lang.String r0 = "id"
            int r10 = r6.getColumnIndex(r0)     // Catch:{ all -> 0x00c3 }
            java.lang.String r0 = "seq"
            int r9 = r6.getColumnIndex(r0)     // Catch:{ all -> 0x00c3 }
            java.lang.String r0 = "table"
            int r8 = r6.getColumnIndex(r0)     // Catch:{ all -> 0x00c3 }
            java.lang.String r0 = "on_delete"
            int r7 = r6.getColumnIndex(r0)     // Catch:{ all -> 0x00c3 }
            java.lang.String r0 = "on_update"
            int r5 = r6.getColumnIndex(r0)     // Catch:{ all -> 0x00c3 }
            java.util.List r14 = A02(r6)     // Catch:{ all -> 0x00c3 }
            r0 = -1
            r6.moveToPosition(r0)     // Catch:{ all -> 0x00c3 }
            java.util.Set r4 = X.C154537dK.A07()     // Catch:{ all -> 0x00c3 }
        L_0x0044:
            boolean r0 = r6.moveToNext()     // Catch:{ all -> 0x00c3 }
            if (r0 == 0) goto L_0x00ba
            int r0 = r6.getInt(r9)     // Catch:{ all -> 0x00c3 }
            if (r0 != 0) goto L_0x0044
            int r12 = r6.getInt(r10)     // Catch:{ all -> 0x00c3 }
            java.util.ArrayList r3 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x00c3 }
            java.util.ArrayList r2 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x00c3 }
            java.util.ArrayList r11 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x00c3 }
            java.util.Iterator r13 = r14.iterator()     // Catch:{ all -> 0x00c3 }
        L_0x0064:
            boolean r0 = r13.hasNext()     // Catch:{ all -> 0x00c3 }
            if (r0 == 0) goto L_0x007d
            java.lang.Object r1 = r13.next()     // Catch:{ all -> 0x00c3 }
            r0 = r1
            X.0iB r0 = (X.C10590iB) r0     // Catch:{ all -> 0x00c3 }
            int r0 = r0.A00     // Catch:{ all -> 0x00c3 }
            boolean r0 = X.AnonymousClass000.A1U(r0, r12)
            if (r0 == 0) goto L_0x0064
            r11.add(r1)     // Catch:{ all -> 0x00c3 }
            goto L_0x0064
        L_0x007d:
            java.util.Iterator r11 = r11.iterator()     // Catch:{ all -> 0x00c3 }
        L_0x0081:
            boolean r0 = r11.hasNext()     // Catch:{ all -> 0x00c3 }
            if (r0 == 0) goto L_0x0098
            java.lang.Object r1 = r11.next()     // Catch:{ all -> 0x00c3 }
            X.0iB r1 = (X.C10590iB) r1     // Catch:{ all -> 0x00c3 }
            java.lang.String r0 = r1.A02     // Catch:{ all -> 0x00c3 }
            r3.add(r0)     // Catch:{ all -> 0x00c3 }
            java.lang.String r0 = r1.A03     // Catch:{ all -> 0x00c3 }
            r2.add(r0)     // Catch:{ all -> 0x00c3 }
            goto L_0x0081
        L_0x0098:
            java.lang.String r16 = r6.getString(r8)     // Catch:{ all -> 0x00c3 }
            X.C162457s7.A0D(r16)     // Catch:{ all -> 0x00c3 }
            java.lang.String r17 = r6.getString(r7)     // Catch:{ all -> 0x00c3 }
            X.C162457s7.A0D(r17)     // Catch:{ all -> 0x00c3 }
            java.lang.String r18 = r6.getString(r5)     // Catch:{ all -> 0x00c3 }
            X.C162457s7.A0D(r18)     // Catch:{ all -> 0x00c3 }
            X.0Pm r15 = new X.0Pm     // Catch:{ all -> 0x00c3 }
            r19 = r3
            r20 = r2
            r15.<init>(r16, r17, r18, r19, r20)     // Catch:{ all -> 0x00c3 }
            r4.add(r15)     // Catch:{ all -> 0x00c3 }
            goto L_0x0044
        L_0x00ba:
            java.util.Set r1 = X.C154537dK.A08(r4)     // Catch:{ all -> 0x00c3 }
            r0 = 0
            X.AnonymousClass2A8.A00(r6, r0)
            return r1
        L_0x00c3:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00c5 }
        L_0x00c5:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r6, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0Y4.A05(X.0vW, java.lang.String):java.util.Set");
    }
}
