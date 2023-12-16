package com.whatsapp.data;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0PW;
import X.AnonymousClass0x2;
import X.AnonymousClass0x9;
import X.AnonymousClass2CE;
import X.AnonymousClass2KR;
import X.AnonymousClass2Y7;
import X.AnonymousClass31A;
import X.AnonymousClass33M;
import X.AnonymousClass33T;
import X.AnonymousClass3H0;
import X.AnonymousClass4GK;
import X.C05610Ue;
import X.C107385bE;
import X.C130066bK;
import X.C162457s7;
import X.C18260x0;
import X.C18280x3;
import X.C18300x5;
import X.C18320x8;
import X.C183538qC;
import X.C188268yc;
import X.C28891hw;
import X.C30471mV;
import X.C389229y;
import X.C43912Ty;
import X.C46702c4;
import X.C55682qk;
import X.C55792qv;
import X.C55832qz;
import X.C56862sg;
import X.C56892sj;
import X.C56922sm;
import X.C56982ss;
import X.C60302yK;
import X.C612830a;
import X.C620733j;
import X.C626135u;
import X.C626936e;
import X.C64333Db;
import X.C65253Gu;
import X.C66543Lv;
import X.C66553Lw;
import X.C69833Yo;
import X.C72303dV;
import X.C85284Fq;
import X.C95814uZ;
import android.app.Notification;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDiskIOException;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public class ConversationDeleteWorker extends Worker {
    public static final ConcurrentHashMap A0B = AnonymousClass0x9.A1D();
    public static final AtomicInteger A0C = new AtomicInteger();
    public static final AtomicInteger A0D = new AtomicInteger();
    public static final AtomicInteger A0E = new AtomicInteger();
    public static final AtomicLong A0F = new AtomicLong();
    public final Context A00;
    public final C55682qk A01;
    public final AnonymousClass33T A02;
    public final C620733j A03;
    public final C56922sm A04;
    public final C56982ss A05;
    public final C28891hw A06;
    public final C66543Lv A07;
    public final C55792qv A08;
    public final C56892sj A09;
    public final C60302yK A0A;

    public C188268yc A08() {
        Context context = this.A00;
        String string = context.getString(R.string.f11nameremoved);
        C05610Ue A002 = C66553Lw.A00(context);
        A002.A03 = -1;
        AnonymousClass33T.A02(A002, R.drawable.notifybar);
        A002.A0J = "progress";
        A002.A06 = -1;
        A002.A03(100, 0, true);
        C18320x8.A17(A002, string, "", false);
        Notification A012 = A002.A01();
        C130066bK r3 = new C130066bK();
        r3.A05(new AnonymousClass0PW(13, A012, C107385bE.A07() ? 1 : 0));
        return r3;
    }

    public void A0A() {
        A0D.addAndGet(-1);
        A0D();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005b, code lost:
        X.C18260x0.A0r("conversation-delete-worker/handle-intent invalid action=", r6, X.AnonymousClass001.A0o());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x014d, code lost:
        if (r4.A00 <= 5) goto L_0x015d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x014f, code lost:
        r13.A01.A0A("ConversationDeleteWorker/Deletion failed", false, (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x015c, code lost:
        return new X.C01400Ao();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0162, code lost:
        return new X.C01390An();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C03070Is A0C() {
        /*
            r13 = this;
            androidx.work.WorkerParameters r4 = r13.A01
            X.0Xq r7 = r4.A01
            java.lang.String r1 = "job_id"
            java.util.Map r0 = r7.A00
            java.lang.Object r1 = r0.get(r1)
            boolean r0 = r1 instanceof java.lang.Long
            if (r0 == 0) goto L_0x001d
            long r8 = X.C18310x6.A0B(r1)
        L_0x0014:
            X.2qv r2 = r13.A08
            X.3dV r0 = r2.A02
            X.4GK r6 = r0.get()
            goto L_0x0020
        L_0x001d:
            r8 = -1
            goto L_0x0014
        L_0x0020:
            r0 = r6
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x016f }
            X.2sg r5 = r0.A03     // Catch:{ all -> 0x016f }
            java.lang.String r3 = "SELECT _id, chat_row_id, block_size, deleted_message_row_id, deleted_starred_message_row_id, deleted_messages_remove_files, deleted_categories_message_row_id, deleted_categories_starred_message_row_id, deleted_categories_remove_files, deleted_message_categories, singular_message_delete_rows_id, delete_files_singular_delete FROM deleted_chat_job WHERE _id= ?"
            java.lang.String[] r1 = X.C18260x0.A1b(r8)     // Catch:{ all -> 0x016f }
            java.lang.String r0 = "GET_DELETED_CHAT_JOB_BY_ID_SQL"
            android.database.Cursor r3 = r5.A0E(r3, r0, r1)     // Catch:{ all -> 0x016f }
            boolean r0 = r3.moveToFirst()     // Catch:{ all -> 0x0163 }
            if (r0 == 0) goto L_0x0042
            X.2Ty r1 = r2.A02(r3)     // Catch:{ all -> 0x0163 }
            r3.close()     // Catch:{ all -> 0x016f }
            r6.close()
            goto L_0x0049
        L_0x0042:
            r3.close()     // Catch:{ all -> 0x016f }
            r6.close()
            r1 = 0
        L_0x0049:
            if (r1 == 0) goto L_0x0064
            X.4uZ r5 = r1.A07
            java.lang.String r0 = "delete_action"
            java.lang.String r6 = r7.A03(r0)
            int r0 = r6.hashCode()
            r3 = 0
            switch(r0) {
                case 893674186: goto L_0x006a;
                case 1096596436: goto L_0x007c;
                case 1835767556: goto L_0x00fc;
                default: goto L_0x005b;
            }
        L_0x005b:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "conversation-delete-worker/handle-intent invalid action="
            X.C18260x0.A0r(r0, r6, r1)
        L_0x0064:
            X.0Ap r0 = new X.0Ap
            r0.<init>()
            return r0
        L_0x006a:
            java.lang.String r0 = "action_singular_delete"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x005b
            boolean r0 = r13.A0F(r1)
            if (r0 == 0) goto L_0x014a
            r2.A05(r1)
            goto L_0x0064
        L_0x007c:
            java.lang.String r0 = "action_delete"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x005b
            boolean r0 = r13.A0F(r1)
            if (r0 == 0) goto L_0x014a
            X.2ss r0 = r13.A05
            boolean r0 = r0.A0Q(r5)
            if (r0 == 0) goto L_0x0064
            r2.A05(r1)
            boolean r0 = r5 instanceof X.C28011fL
            if (r0 == 0) goto L_0x00f0
            X.2sj r9 = r13.A09
            r7 = r5
            X.1fL r7 = (X.C28011fL) r7
            X.3dV r0 = r9.A07
            X.4Fq r12 = r0.A04()
            X.3Yo r11 = r12.Axl()     // Catch:{ all -> 0x0145 }
            X.33h r10 = r9.A09     // Catch:{ all -> 0x013b }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x013b }
            java.lang.String r0 = "participant-user-store/updateGroupParticipants/deleteParticipants/"
            X.C18260x0.A1R(r1, r0, r7)     // Catch:{ all -> 0x013b }
            X.4Fq r8 = X.C620533h.A02(r10)     // Catch:{ all -> 0x013b }
            r0 = r8
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0131 }
            X.2sg r6 = r0.A03     // Catch:{ all -> 0x0131 }
            java.lang.String r4 = "group_participant_user"
            java.lang.String r3 = "group_jid_row_id = ?"
            java.lang.String[] r2 = X.AnonymousClass0x9.A1Y()     // Catch:{ all -> 0x0131 }
            X.34p r0 = r10.A09     // Catch:{ all -> 0x0131 }
            long r0 = r0.A05(r7)     // Catch:{ all -> 0x0131 }
            X.C18260x0.A1X(r2, r0)     // Catch:{ all -> 0x0131 }
            java.lang.String r0 = "deleteParticipants/DELETE_GROUP_PARTICIPANT_USER"
            r6.A07(r4, r3, r0, r2)     // Catch:{ all -> 0x0131 }
            r8.close()     // Catch:{ all -> 0x013b }
            X.2zn r3 = r9.A0A     // Catch:{ all -> 0x013b }
            X.1VX r2 = r3.A02     // Catch:{ all -> 0x013b }
            r1 = 1613(0x64d, float:2.26E-42)
            X.2vE r0 = X.C58422vE.A02     // Catch:{ all -> 0x013b }
            boolean r0 = r2.A0Y(r0, r1)     // Catch:{ all -> 0x013b }
            if (r0 == 0) goto L_0x00e7
            r3.A02(r7)     // Catch:{ all -> 0x013b }
        L_0x00e7:
            r11.A00()     // Catch:{ all -> 0x013b }
            r11.close()     // Catch:{ all -> 0x0145 }
            r12.close()
        L_0x00f0:
            X.2sm r0 = r13.A04
            r0.A0K(r5)
            X.1hw r0 = r13.A06
            r0.A0B(r5)
            goto L_0x0064
        L_0x00fc:
            java.lang.String r0 = "action_clear"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x005b
            boolean r0 = r13.A0F(r1)
            if (r0 == 0) goto L_0x014a
            r2.A05(r1)
            X.3Lv r0 = r13.A07
            r0.A0s(r5, r3)
            r0.A0T(r5, r3)
            r0.A0S(r5, r3)
            X.1hw r0 = r13.A06
            X.C626936e.A06(r5)
            java.util.Iterator r1 = X.C61102zi.A03(r0)
        L_0x0121:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0064
            java.lang.Object r0 = r1.next()
            X.4FI r0 = (X.AnonymousClass4FI) r0
            r0.BQD(r5)
            goto L_0x0121
        L_0x0131:
            r1 = move-exception
            r8.close()     // Catch:{ all -> 0x0136 }
            goto L_0x013a
        L_0x0136:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x013b }
        L_0x013a:
            throw r1     // Catch:{ all -> 0x013b }
        L_0x013b:
            r1 = move-exception
            r11.close()     // Catch:{ all -> 0x0140 }
            goto L_0x0144
        L_0x0140:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0145 }
        L_0x0144:
            throw r1     // Catch:{ all -> 0x0145 }
        L_0x0145:
            r1 = move-exception
            r12.close()     // Catch:{ all -> 0x0174 }
            throw r1
        L_0x014a:
            int r1 = r4.A00
            r0 = 5
            if (r1 <= r0) goto L_0x015d
            X.2qk r2 = r13.A01
            r1 = 0
            java.lang.String r0 = "ConversationDeleteWorker/Deletion failed"
            r2.A0A(r0, r3, r1)
            X.0Ao r0 = new X.0Ao
            r0.<init>()
            return r0
        L_0x015d:
            X.0An r0 = new X.0An
            r0.<init>()
            return r0
        L_0x0163:
            r1 = move-exception
            if (r3 == 0) goto L_0x016e
            r3.close()     // Catch:{ all -> 0x016a }
            goto L_0x016e
        L_0x016a:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x016f }
        L_0x016e:
            throw r1     // Catch:{ all -> 0x016f }
        L_0x016f:
            r1 = move-exception
            r6.close()     // Catch:{ all -> 0x0174 }
            throw r1
        L_0x0174:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.data.ConversationDeleteWorker.A0C():X.0Is");
    }

    public final void A0D() {
        AtomicInteger atomicInteger = A0D;
        if (atomicInteger.get() <= 0) {
            A0C.set(0);
            A0E.set(0);
            A0F.set(0);
            atomicInteger.set(0);
            A0B.clear();
            this.A02.A05(13, "ConversationDeleteWorker");
        }
    }

    public void A0E(C95814uZ r11, int i) {
        int max;
        AnonymousClass2KR r3 = (AnonymousClass2KR) A0B.get(r11);
        synchronized (r3) {
            int i2 = r3.A00;
            max = Math.max(0, i - i2);
            r3.A00 = i2 + max;
            r3.A01 -= max;
        }
        AtomicInteger atomicInteger = A0C;
        atomicInteger.addAndGet(max);
        AtomicInteger atomicInteger2 = A0E;
        if (atomicInteger2.get() == 0 || atomicInteger.get() > atomicInteger2.get()) {
            Log.w("conversation-delete-worker/delete-progress/totalMessagesAllJids not updated.");
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        AtomicLong atomicLong = A0F;
        if (uptimeMillis - atomicLong.get() >= 250) {
            atomicLong.set(uptimeMillis);
            int i3 = (atomicInteger.get() * 100) / atomicInteger2.get();
            Context context = this.A00;
            String string = context.getString(R.string.f11nameremoved);
            Object[] A1X = AnonymousClass0x9.A1X();
            AnonymousClass000.A1L(A1X, atomicInteger.get());
            AnonymousClass000.A1M(A1X, atomicInteger2.get());
            String A0F2 = AnonymousClass002.A0F(context, AnonymousClass001.A0l(this.A03.A0N(), i3), A1X, 2, R.string.f11nameremoved);
            C05610Ue A002 = C66553Lw.A00(context);
            A002.A03 = -1;
            AnonymousClass33T.A02(A002, R.drawable.notifybar);
            A002.A0J = "progress";
            A002.A06 = -1;
            A002.A03(100, i3, false);
            C18320x8.A17(A002, string, A0F2, false);
            this.A02.A04(13, A002.A01());
        }
    }

    public final boolean A0F(C43912Ty r38) {
        Cursor A0E2;
        C85284Fq A042;
        C69833Yo Axl;
        C85284Fq A043;
        Cursor A0E3;
        C43912Ty r13 = r38;
        C95814uZ r12 = r13.A07;
        try {
            C65253Gu r4 = new C65253Gu(this, r13);
            AnonymousClass31A A012 = C56982ss.A01(this.A05, r12);
            if (A012 == null || A012.A0D <= 1 || TextUtils.isEmpty(A012.A0g)) {
                return this.A07.A0o(r13, r4, false);
            }
            C60302yK r5 = this.A0A;
            String rawString = r12.getRawString();
            C183538qC r6 = r5.A04.A01;
            if (rawString.equals(C18280x3.A0Z(C18300x5.A0B(r6), "storage_usage_deletion_jid"))) {
                C18260x0.A1P(AnonymousClass001.A0o(), "storage-usage-manager/start-delete-messages-for-jid/continue/", r12);
                return r5.A08.A00(r13, new AnonymousClass2Y7(r4, r5), C18300x5.A0B(r6).getInt("storage_usage_deletion_all_msg_cnt", 0), C18300x5.A0B(r6).getInt("storage_usage_deletion_current_msg_cnt", 0));
            }
            C18260x0.A1P(AnonymousClass001.A0o(), "storage-usage-manager/start-delete-messages-for-jid/", r12);
            C46702c4 r10 = r5.A08;
            AnonymousClass2Y7 r9 = new AnonymousClass2Y7(r4, r5);
            AnonymousClass33M A013 = AnonymousClass33M.A01("storageUsageMsgStore/deleteMessagesForJid");
            r10.A04.A01(r12);
            C66543Lv r52 = r10.A01;
            String[] A1Y = AnonymousClass0x9.A1Y();
            C56922sm.A01(r52.A0W, r12, A1Y);
            AnonymousClass33M A014 = AnonymousClass33M.A01("CoreMessageStore/getMessageCountForJid");
            try {
                AnonymousClass4GK A032 = r52.A18.get();
                try {
                    A0E3 = ((AnonymousClass3H0) A032).A03.A0E("SELECT COUNT(*) as count FROM available_message_view WHERE chat_row_id = ? AND (message_type != '8')", "GET_CHAT_MESSAGES_COUNT_EXCLUDE_DELETED_SQL", A1Y);
                    if (A0E3.moveToFirst()) {
                        long A0C2 = AnonymousClass0x2.A0C(A0E3, "count");
                        A0E3.close();
                        A032.close();
                        A014.A07();
                        if (A0C2 != 0) {
                            long j = r13.A06;
                            long j2 = r13.A01;
                            int i = r13.A00;
                            long j3 = r13.A04;
                            long j4 = r13.A05;
                            boolean z = r13.A0C;
                            boolean z2 = r13.A0B;
                            C95814uZ r18 = r12;
                            r13 = new C43912Ty(r18, r13.A08, r13.A09, i, j, j2, j3, j4, r13.A02, r13.A03, z, z2, r13.A0A);
                            C55792qv r0 = r10.A02;
                            C95814uZ r2 = r13.A07;
                            boolean A002 = r10.A00(r13, r9, r0.A00(r2), 0);
                            StringBuilder A0o = AnonymousClass001.A0o();
                            A0o.append("storageUsageMsgStore/deleteMessagesForJid ");
                            A0o.append(r2);
                            AnonymousClass33M.A05(A013, " success:true time spent:", A0o);
                            return A002;
                        }
                    } else {
                        A0E3.close();
                        A032.close();
                        A014.A07();
                    }
                    r52.A0r(r12, (Long) null);
                    C55792qv r02 = r10.A02;
                    C95814uZ r22 = r13.A07;
                    boolean A0022 = r10.A00(r13, r9, r02.A00(r22), 0);
                    StringBuilder A0o2 = AnonymousClass001.A0o();
                    A0o2.append("storageUsageMsgStore/deleteMessagesForJid ");
                    A0o2.append(r22);
                    AnonymousClass33M.A05(A013, " success:true time spent:", A0o2);
                    return A0022;
                } catch (Throwable th) {
                    A032.close();
                    throw th;
                }
            } catch (Throwable th2) {
                A014.A07();
                throw th2;
            }
            throw th;
            throw th;
            throw th;
        } catch (IllegalStateException e) {
            Log.e("Error while deleting messages in batches, switching to old way of deleting...", e);
            int A003 = this.A08.A00(r12);
            C66543Lv r42 = this.A07;
            C626936e.A00();
            AnonymousClass33M A015 = AnonymousClass33M.A01("msgstore/deletemsgs/fallback");
            AnonymousClass33M A016 = AnonymousClass33M.A01("msgstore/deletemedia");
            HashSet A0K = AnonymousClass002.A0K();
            try {
                C72303dV r7 = r42.A18;
                AnonymousClass4GK A033 = r7.get();
                try {
                    C56862sg r102 = ((AnonymousClass3H0) A033).A03;
                    String str = AnonymousClass2CE.A03;
                    String[] strArr = new String[1];
                    C56922sm r132 = r42.A0W;
                    boolean A034 = C56922sm.A03(r132, r12, strArr);
                    A0E2 = r102.A0E(str, "GET_MEDIA_FILE_MESSAGES_FOR_DELETE_SQL", strArr);
                    int columnIndexOrThrow = A0E2.getColumnIndexOrThrow("remove_files");
                    while (A0E2.moveToNext()) {
                        C55832qz r03 = r42.A2D;
                        C162457s7.A0J(r12, 1);
                        C30471mV r3 = (C30471mV) r03.A02.A02(A0E2, r12, true);
                        C626936e.A06(r3);
                        boolean A035 = C626135u.A03(A0E2, columnIndexOrThrow);
                        String str2 = r3.A04;
                        if (str2 != null) {
                            A0K.add(str2);
                        }
                        r42.A0w.A09(r3, A035, A034);
                    }
                    A0E2.close();
                    A033.close();
                    StringBuilder A0o3 = AnonymousClass001.A0o();
                    A0o3.append("CoreMessageStore/deletemedia ");
                    A0o3.append(r12);
                    AnonymousClass33M.A05(A016, " timeSpent:", A0o3);
                    A042 = r7.A04();
                    Axl = A042.Axl();
                    r42.A0y.A01(r12);
                    C56862sg r103 = ((AnonymousClass3H0) A042).A03;
                    String[] strArr2 = new String[1];
                    C56922sm.A02(r132, r12, strArr2, A034 ? 1 : 0);
                    C18260x0.A0y("CoreMessageStore/deletemsgs/count:", AnonymousClass001.A0o(), r103.A07("message", "_id IN (   SELECT _id   FROM deleted_messages_ids_view   WHERE chat_row_id= ?)", "deleteAllMessagesForJidInBackground/DELETE_MESSAGE", strArr2));
                    C612830a r72 = r42.A1f;
                    try {
                        A043 = r72.A02.A04();
                        C56862sg r133 = ((AnonymousClass3H0) A043).A03;
                        String[] strArr3 = new String[1];
                        C56922sm.A02(r72.A00, r12, strArr3, A034);
                        int A072 = r133.A07("message_thumbnail", "message_row_id IN (SELECT _id FROM message_view WHERE chat_row_id = ?)", "deleteMessageThumbnailsFor/DELETE_MESSAGE_THUMBNAILS", strArr3);
                        StringBuilder A0o4 = AnonymousClass001.A0o();
                        A0o4.append("msgstore/deleteAllMessageThumbnailsFor-jid/");
                        A0o4.append(r12);
                        C18260x0.A0y("/", A0o4, A072);
                        A043.close();
                    } catch (SQLiteDatabaseCorruptException e2) {
                        Log.e("msgstore/deleteAllMessageThumbnailsFor-jid", e2);
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                    r72.A04(A0K);
                    r42.A0l.A04(r12);
                    r42.A0b.A00();
                    Axl.A00();
                    Axl.close();
                    StringBuilder A0f = C18280x3.A0f(A042);
                    A0f.append("CoreMessageStore/deletemsgs/fallback ");
                    A0f.append(r12);
                    AnonymousClass33M.A05(A015, " timeSpent:", A0f);
                    A0E(r12, A003);
                    return true;
                } catch (Throwable th4) {
                    A043.close();
                    throw th4;
                }
            } catch (SQLiteDiskIOException e3) {
                r42.A16.A08(1);
                throw e3;
            } catch (Throwable th5) {
                th.addSuppressed(th5);
            }
        } catch (Throwable th6) {
            Log.e("conversation-delete-worker/delete/exception", th6);
            throw th6;
        }
    }

    public ConversationDeleteWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        C64333Db A012 = C389229y.A01(context);
        this.A00 = context;
        this.A04 = (C56922sm) A012.A58.get();
        this.A01 = A012.Azq();
        this.A05 = C64333Db.A39(A012);
        this.A03 = A012.BsW();
        this.A07 = C64333Db.A3D(A012);
        this.A08 = (C55792qv) A012.A81.get();
        this.A0A = (C60302yK) A012.AcK.A00.ABS.get();
        this.A06 = C64333Db.A3C(A012);
        this.A02 = A012.BsM();
        this.A09 = C64333Db.A3G(A012);
    }
}
