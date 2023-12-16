package X;

import android.content.ContentValues;
import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2sL  reason: invalid class name and case insensitive filesystem */
public final class C56652sL {
    public final C47922e3 A00;
    public final C56922sm A01;
    public final C56982ss A02;
    public final C623334p A03;
    public final C72303dV A04;
    public final AnonymousClass2KX A05;
    public final AnonymousClass5UP A06;

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0027, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        X.AnonymousClass2A8.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002b, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A01(android.content.ContentValues r11, X.AnonymousClass1RL r12) {
        /*
            r10 = this;
            r3 = 0
            X.3dV r0 = r10.A04     // Catch:{ all -> 0x002c }
            X.4Fq r2 = r0.A04()     // Catch:{ all -> 0x002c }
            r0 = r2
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0025 }
            X.2sg r4 = r0.A03     // Catch:{ all -> 0x0025 }
            java.lang.String r6 = "newsletter"
            java.lang.String r7 = "chat_row_id = ?"
            java.lang.String[] r9 = X.AnonymousClass0x9.A1Y()     // Catch:{ all -> 0x0025 }
            long r0 = r12.A00     // Catch:{ all -> 0x0025 }
            X.AnonymousClass0x2.A1S(r9, r3, r0)     // Catch:{ all -> 0x0025 }
            java.lang.String r8 = "NewsletterStore/UPDATE_MEMBERSHIP_NEWSLETTER_INFO"
            r5 = r11
            int r0 = r4.A05(r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0025 }
            r2.close()     // Catch:{ all -> 0x002c }
            return r0
        L_0x0025:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0027 }
        L_0x0027:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r2, r1)     // Catch:{ all -> 0x002c }
            throw r0     // Catch:{ all -> 0x002c }
        L_0x002c:
            r0 = move-exception
            X.AnonymousClass3Z0.A01(r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56652sL.A01(android.content.ContentValues, X.1RL):int");
    }

    public final int A02(C95804uY r5, boolean z) {
        C162457s7.A0J(r5, 0);
        AnonymousClass1RL r3 = (AnonymousClass1RL) this.A02.A0A(r5, false);
        if (r3 != null) {
            r3.A0N = z;
            ContentValues A062 = AnonymousClass0x9.A06();
            A062.put("show_enforced_update_banner", Boolean.valueOf(r3.A0N));
            return A01(A062, r3);
        }
        C18260x0.A1Q(AnonymousClass001.A0o(), "NewsletterStore/failed to find newsletter in chatsCache for ", r5);
        this.A00.A01(AnonymousClass22M.A02, (String) null);
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        X.AnonymousClass2A8.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002f, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0032, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        X.AnonymousClass2A8.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0036, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass1RL A03(java.lang.String r8) {
        /*
            r7 = this;
            r4 = 0
            X.C162457s7.A0J(r8, r4)
            r6 = 0
            X.3dV r0 = r7.A04     // Catch:{ all -> 0x0037 }
            X.4GK r5 = r0.get()     // Catch:{ all -> 0x0037 }
            r0 = r5
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0030 }
            X.2sg r3 = r0.A03     // Catch:{ all -> 0x0030 }
            java.lang.String r2 = "SELECT * FROM newsletter JOIN chat ON chat_row_id = _id WHERE invite_code = ?"
            java.lang.String[] r1 = X.AnonymousClass0x9.A1Y()     // Catch:{ all -> 0x0030 }
            r1[r4] = r8     // Catch:{ all -> 0x0030 }
            java.lang.String r0 = "NewsletterStore/GET_NEWSLETTER_BY_CODE"
            android.database.Cursor r3 = X.C56862sg.A02(r3, r2, r0, r1)     // Catch:{ all -> 0x0030 }
            java.util.List r2 = r7.A06(r3)     // Catch:{ all -> 0x0029 }
            r3.close()     // Catch:{ all -> 0x0030 }
            r5.close()     // Catch:{ all -> 0x0037 }
            goto L_0x003c
        L_0x0029:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x002b }
        L_0x002b:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r3, r1)     // Catch:{ all -> 0x0030 }
            throw r0     // Catch:{ all -> 0x0030 }
        L_0x0030:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0032 }
        L_0x0032:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r5, r1)     // Catch:{ all -> 0x0037 }
            throw r0     // Catch:{ all -> 0x0037 }
        L_0x0037:
            r0 = move-exception
            X.3Z0 r2 = X.AnonymousClass3Z0.A01(r0)
        L_0x003c:
            java.lang.Throwable r1 = X.AnonymousClass3Z9.A00(r2)
            if (r1 == 0) goto L_0x0047
            java.lang.String r0 = "NewsletterStore/failed to read newsletter"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0047:
            X.3d3 r1 = X.C72023d3.A00
            boolean r0 = r2 instanceof X.AnonymousClass3Z0
            if (r0 == 0) goto L_0x004e
            r2 = r1
        L_0x004e:
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r3 = X.C73783g4.A0c(r2)
            java.util.Iterator r2 = r2.iterator()
        L_0x0058:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0071
            X.4uZ r1 = X.C18300x5.A0P(r2)
            X.2ss r0 = r7.A02
            X.31A r1 = r0.A0A(r1, r4)
            boolean r0 = r1 instanceof X.AnonymousClass1RL
            if (r0 != 0) goto L_0x006d
            r1 = r6
        L_0x006d:
            r3.add(r1)
            goto L_0x0058
        L_0x0071:
            java.lang.Object r0 = X.C73723fy.A04(r3)
            X.1RL r0 = (X.AnonymousClass1RL) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56652sL.A03(java.lang.String):X.1RL");
    }

    public final synchronized AnonymousClass3Z6 A07(C95804uY r8, String str) {
        AnonymousClass3Z6 r0;
        C162457s7.A0J(r8, 0);
        C56982ss r6 = this.A02;
        AnonymousClass31A A0A = r6.A0A(r8, false);
        if (A0A != null) {
            long j = A0A.A0W;
            if (j != -1) {
                r0 = AnonymousClass3Z6.A02(A0A, Long.valueOf(j));
            }
        }
        r6.A0I(r8);
        long A07 = this.A01.A07(r8);
        AnonymousClass31A r1 = new AnonymousClass31A((C95814uZ) r8);
        r1.A0W = A07;
        r1.A0h = str;
        r1.A02 = 4;
        r0 = AnonymousClass3Z6.A02(r1, Long.valueOf(A07));
        return r0;
    }

    public final void A08(C372821q r5, C95804uY r6) {
        C162457s7.A0J(r5, 1);
        AnonymousClass1RL r3 = (AnonymousClass1RL) C56982ss.A00(this.A02, r6);
        if (r3 != null) {
            r3.A07 = r5;
            ContentValues A062 = AnonymousClass0x9.A06();
            A062.put("membership", Integer.valueOf(r3.A07.value));
            A01(A062, r3);
        }
    }

    public final void A09(C95804uY r5, boolean z) {
        C162457s7.A0J(r5, 0);
        AnonymousClass1RL r3 = (AnonymousClass1RL) this.A02.A0A(r5, false);
        if (r3 != null) {
            r3.A0L = z;
            ContentValues A062 = AnonymousClass0x9.A06();
            A062.put("muted", Boolean.valueOf(r3.A0L));
            A01(A062, r3);
        }
    }

    public static void A00(ContentValues contentValues, AnonymousClass31A r3) {
        contentValues.put("last_read_message_sort_id", Long.valueOf(r3.A0Q));
        contentValues.put("display_message_sort_id", Long.valueOf(r3.A0V));
        contentValues.put("last_message_sort_id", Long.valueOf(r3.A0O));
        contentValues.put("last_read_receipt_sent_message_sort_id", Long.valueOf(r3.A0S));
        contentValues.put("last_read_message_row_id", Long.valueOf(r3.A0P));
        contentValues.put("display_message_row_id", Long.valueOf(r3.A0U));
        contentValues.put("last_message_row_id", Long.valueOf(r3.A0N));
        contentValues.put("last_read_receipt_sent_message_row_id", Long.valueOf(r3.A0R));
        contentValues.put("sort_timestamp", Long.valueOf(r3.A0X));
        contentValues.put("unseen_message_count", Integer.valueOf(r3.A08));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0226, code lost:
        r6 = r1.getInt(r23);
        r3 = X.C371421c.values();
        r5 = r3.length;
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0236, code lost:
        if (r0 >= r5) goto L_0x02de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0238, code lost:
        r13 = r3[r0];
        r0 = r0 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x023e, code lost:
        if (r13.value != r6) goto L_0x0236;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0240, code lost:
        r6 = r1.getInt(r22);
        r3 = X.C371621e.values();
        r5 = r3.length;
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x024c, code lost:
        if (r0 >= r5) goto L_0x02d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x024e, code lost:
        r12 = r3[r0];
        r0 = r0 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0254, code lost:
        if (r12.value != r6) goto L_0x024c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0256, code lost:
        r83 = X.C382426h.A00(r1, r21);
        r68 = X.AnonymousClass001.A0s();
        r84 = X.C382426h.A00(r1, r20);
        r6 = r1.getInt(r19);
        r3 = X.C372321l.values();
        r5 = r3.length;
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0272, code lost:
        if (r0 >= r5) goto L_0x02d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0274, code lost:
        r9 = r3[r0];
        r0 = r0 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x027a, code lost:
        if (r9.value != r6) goto L_0x0272;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x027c, code lost:
        r85 = X.C382426h.A00(r1, r18);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0286, code lost:
        if (r1.isNull(r14) != false) goto L_0x029f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0288, code lost:
        r0 = r1.getString(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x028c, code lost:
        if (r0 == null) goto L_0x029f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x028e, code lost:
        r53 = X.C129586aY.copyOf((java.util.Collection) X.AnonymousClass2AB.A01(r0, ","));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x029c, code lost:
        if (r1.isNull(r11) == false) goto L_0x02a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x029f, code lost:
        r53 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x02a2, code lost:
        r61 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x02a5, code lost:
        r61 = X.C18280x3.A0T(r1, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x02a9, code lost:
        r54 = r2;
        r55 = r16;
        r52 = new X.AnonymousClass1RL(r53, r54, r55, X.AnonymousClass599.A03, r10, r13, r9, r12, r61, r62, r63, r64, r65, r66, r67, r68, r87, r71, r73, r75, r77, r79, r81, r83, r84, r85, X.C382426h.A00(r1, r17));
        r8.A05.A01.A04(3877);
        r7.add(r52);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x02d4, code lost:
        r0 = X.C18320x8.A0t();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x02d9, code lost:
        r0 = X.C18320x8.A0t();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x02de, code lost:
        r0 = X.C18320x8.A0t();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x02fd, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:?, code lost:
        X.AnonymousClass2A8.A00(r1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0301, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0304, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:?, code lost:
        X.AnonymousClass2A8.A00(r51, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x030a, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List A04() {
        /*
            r89 = this;
            r8 = r89
            X.5UP r0 = r8.A06
            boolean r0 = X.C18300x5.A1S(r0)
            if (r0 == 0) goto L_0x0317
            X.3dV r0 = r8.A04     // Catch:{ all -> 0x030b }
            X.4GK r51 = r0.get()     // Catch:{ all -> 0x030b }
            r0 = r51
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0302 }
            X.2sg r2 = r0.A03     // Catch:{ all -> 0x0302 }
            java.lang.String r1 = "SELECT * FROM newsletter JOIN chat ON chat_row_id = _id"
            java.lang.String r0 = "NewsletterStore/GET_NEWSLETTER_SQL"
            android.database.Cursor r1 = X.C56862sg.A01(r2, r1, r0)     // Catch:{ all -> 0x0302 }
            X.C162457s7.A0D(r1)     // Catch:{ all -> 0x0302 }
            java.util.ArrayList r7 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x02fb }
            int r50 = X.AnonymousClass0x7.A02(r1)     // Catch:{ all -> 0x02fb }
            java.lang.String r0 = "jid_row_id"
            int r49 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x02fb }
            java.lang.String r0 = "subject"
            int r48 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x02fb }
            java.lang.String r0 = "last_read_message_sort_id"
            int r47 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x02fb }
            java.lang.String r0 = "display_message_sort_id"
            int r46 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x02fb }
            java.lang.String r0 = "last_message_sort_id"
            int r45 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x02fb }
            java.lang.String r0 = "last_read_receipt_sent_message_sort_id"
            int r44 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x02fb }
            java.lang.String r0 = "last_read_message_row_id"
            int r43 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x02fb }
            java.lang.String r0 = "display_message_row_id"
            int r42 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x02fb }
            java.lang.String r0 = "last_message_row_id"
            int r41 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x02fb }
            java.lang.String r0 = "last_read_receipt_sent_message_row_id"
            int r40 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x02fb }
            java.lang.String r0 = "sort_timestamp"
            int r39 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x02fb }
            java.lang.String r0 = "unseen_message_count"
            int r38 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x02fb }
            java.lang.String r0 = "group_type"
            int r37 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x02fb }
            java.lang.String r0 = "created_timestamp"
            int r36 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x02fb }
            java.lang.String r0 = "name"
            int r35 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x02fb }
            java.lang.String r0 = "name_id"
            int r34 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x02fb }
            java.lang.String r0 = "description"
            int r33 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x02fb }
            java.lang.String r0 = "description_id"
            int r32 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x02fb }
            java.lang.String r0 = "picture_url"
            int r31 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x02fb }
            java.lang.String r0 = "picture_id"
            int r30 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x02fb }
            java.lang.String r0 = "preview_url"
            int r29 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x02fb }
            java.lang.String r0 = "preview_id"
            int r28 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x02fb }
            java.lang.String r0 = "invite_code"
            int r27 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x02fb }
            java.lang.String r0 = "handle"
            int r26 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x02fb }
            java.lang.String r0 = "subscribers_count"
            int r25 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x02fb }
            java.lang.String r0 = "membership"
            int r24 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x02fb }
            java.lang.String r0 = "privacy"
            int r23 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x02fb }
            java.lang.String r0 = "verified"
            int r22 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x02fb }
            java.lang.String r0 = "muted"
            int r21 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x02fb }
            java.lang.String r0 = "oldest_message_retrieved"
            int r20 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x02fb }
            java.lang.String r0 = "suspended"
            int r19 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x02fb }
            java.lang.String r0 = "deleted"
            int r18 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x02fb }
            java.lang.String r0 = "reaction_setting"
            int r15 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x02fb }
            java.lang.String r0 = "reaction_setting_blocklist"
            int r14 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x02fb }
            java.lang.String r0 = "reaction_setting_update_ts"
            int r11 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x02fb }
            java.lang.String r0 = "show_enforced_update_banner"
            int r17 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x02fb }
        L_0x0114:
            boolean r0 = r1.moveToNext()     // Catch:{ all -> 0x02fb }
            if (r0 == 0) goto L_0x02f4
            X.34p r4 = r8.A03     // Catch:{ all -> 0x02fb }
            r0 = r49
            long r2 = r1.getLong(r0)     // Catch:{ all -> 0x02fb }
            com.whatsapp.jid.Jid r0 = r4.A08(r2)     // Catch:{ all -> 0x02fb }
            X.4uZ r0 = X.C106405Yw.A03(r0)     // Catch:{ all -> 0x02fb }
            r5 = 1
            if (r0 == 0) goto L_0x02e8
            X.31A r2 = new X.31A     // Catch:{ all -> 0x02fb }
            r2.<init>((X.C95814uZ) r0)     // Catch:{ all -> 0x02fb }
            r0 = r50
            long r3 = r1.getLong(r0)     // Catch:{ all -> 0x02fb }
            r2.A0W = r3     // Catch:{ all -> 0x02fb }
            r0 = r48
            java.lang.String r0 = r1.getString(r0)     // Catch:{ all -> 0x02fb }
            r2.A0h = r0     // Catch:{ all -> 0x02fb }
            r0 = r47
            long r3 = r1.getLong(r0)     // Catch:{ all -> 0x02fb }
            r2.A0Q = r3     // Catch:{ all -> 0x02fb }
            r0 = r46
            long r3 = r1.getLong(r0)     // Catch:{ all -> 0x02fb }
            r2.A0V = r3     // Catch:{ all -> 0x02fb }
            r0 = r45
            long r3 = r1.getLong(r0)     // Catch:{ all -> 0x02fb }
            r2.A0O = r3     // Catch:{ all -> 0x02fb }
            r0 = r44
            long r3 = r1.getLong(r0)     // Catch:{ all -> 0x02fb }
            r2.A0S = r3     // Catch:{ all -> 0x02fb }
            r0 = r43
            long r3 = r1.getLong(r0)     // Catch:{ all -> 0x02fb }
            r2.A0P = r3     // Catch:{ all -> 0x02fb }
            r0 = r42
            long r3 = r1.getLong(r0)     // Catch:{ all -> 0x02fb }
            r2.A0U = r3     // Catch:{ all -> 0x02fb }
            r0 = r41
            long r3 = r1.getLong(r0)     // Catch:{ all -> 0x02fb }
            r2.A0N = r3     // Catch:{ all -> 0x02fb }
            r0 = r40
            long r3 = r1.getLong(r0)     // Catch:{ all -> 0x02fb }
            r2.A0R = r3     // Catch:{ all -> 0x02fb }
            r0 = r39
            long r3 = r1.getLong(r0)     // Catch:{ all -> 0x02fb }
            r2.A0X = r3     // Catch:{ all -> 0x02fb }
            r0 = r38
            int r0 = r1.getInt(r0)     // Catch:{ all -> 0x02fb }
            r2.A08 = r0     // Catch:{ all -> 0x02fb }
            r0 = r37
            int r3 = r1.getInt(r0)     // Catch:{ all -> 0x02fb }
            r2.A02 = r3     // Catch:{ all -> 0x02fb }
            r0 = 4
            if (r3 == r0) goto L_0x019e
            r5 = 0
        L_0x019e:
            X.C626936e.A0C(r5)     // Catch:{ all -> 0x02fb }
            r0 = r35
            java.lang.String r62 = r1.getString(r0)     // Catch:{ all -> 0x02fb }
            boolean r0 = r1.isNull(r15)     // Catch:{ all -> 0x02fb }
            if (r0 != 0) goto L_0x01c8
            int r6 = r1.getInt(r15)     // Catch:{ all -> 0x02fb }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x02fb }
            if (r0 == 0) goto L_0x01c8
            X.21r[] r5 = X.C372921r.values()     // Catch:{ all -> 0x02fb }
            int r4 = r5.length     // Catch:{ all -> 0x02fb }
            r3 = 0
        L_0x01bd:
            if (r3 >= r4) goto L_0x02ef
            r10 = r5[r3]     // Catch:{ all -> 0x02fb }
            int r0 = r10.value     // Catch:{ all -> 0x02fb }
            if (r0 == r6) goto L_0x01ca
            int r3 = r3 + 1
            goto L_0x01bd
        L_0x01c8:
            X.21r r10 = X.C372921r.DEFAULT     // Catch:{ all -> 0x02fb }
        L_0x01ca:
            long r3 = r2.A0W     // Catch:{ all -> 0x02fb }
            r87 = r3
            r0 = r34
            long r71 = r1.getLong(r0)     // Catch:{ all -> 0x02fb }
            r0 = r33
            java.lang.String r63 = r1.getString(r0)     // Catch:{ all -> 0x02fb }
            r0 = r32
            long r73 = r1.getLong(r0)     // Catch:{ all -> 0x02fb }
            r0 = r31
            java.lang.String r64 = r1.getString(r0)     // Catch:{ all -> 0x02fb }
            r0 = r30
            long r75 = r1.getLong(r0)     // Catch:{ all -> 0x02fb }
            r0 = r29
            java.lang.String r65 = r1.getString(r0)     // Catch:{ all -> 0x02fb }
            r0 = r28
            long r77 = r1.getLong(r0)     // Catch:{ all -> 0x02fb }
            r0 = r36
            long r79 = r1.getLong(r0)     // Catch:{ all -> 0x02fb }
            r0 = r26
            java.lang.String r66 = r1.getString(r0)     // Catch:{ all -> 0x02fb }
            r0 = r27
            java.lang.String r67 = r1.getString(r0)     // Catch:{ all -> 0x02fb }
            r0 = r25
            long r81 = r1.getLong(r0)     // Catch:{ all -> 0x02fb }
            r0 = r24
            int r6 = r1.getInt(r0)     // Catch:{ all -> 0x02fb }
            X.21q[] r4 = X.C372821q.values()     // Catch:{ all -> 0x02fb }
            int r5 = r4.length     // Catch:{ all -> 0x02fb }
            r3 = 0
        L_0x021c:
            if (r3 >= r5) goto L_0x02e3
            r16 = r4[r3]     // Catch:{ all -> 0x02fb }
            r0 = r16
            int r0 = r0.value     // Catch:{ all -> 0x02fb }
            if (r0 != r6) goto L_0x0233
            r0 = r23
            int r6 = r1.getInt(r0)     // Catch:{ all -> 0x02fb }
            X.21c[] r3 = X.C371421c.values()     // Catch:{ all -> 0x02fb }
            int r5 = r3.length     // Catch:{ all -> 0x02fb }
            r0 = 0
            goto L_0x0236
        L_0x0233:
            int r3 = r3 + 1
            goto L_0x021c
        L_0x0236:
            if (r0 >= r5) goto L_0x02de
            r13 = r3[r0]     // Catch:{ all -> 0x02fb }
            int r4 = r13.value     // Catch:{ all -> 0x02fb }
            int r0 = r0 + 1
            if (r4 != r6) goto L_0x0236
            r0 = r22
            int r6 = r1.getInt(r0)     // Catch:{ all -> 0x02fb }
            X.21e[] r3 = X.C371621e.values()     // Catch:{ all -> 0x02fb }
            int r5 = r3.length     // Catch:{ all -> 0x02fb }
            r0 = 0
        L_0x024c:
            if (r0 >= r5) goto L_0x02d9
            r12 = r3[r0]     // Catch:{ all -> 0x02fb }
            int r4 = r12.value     // Catch:{ all -> 0x02fb }
            int r0 = r0 + 1
            if (r4 != r6) goto L_0x024c
            r0 = r21
            boolean r83 = X.C382426h.A00(r1, r0)     // Catch:{ all -> 0x02fb }
            java.util.ArrayList r68 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x02fb }
            r0 = r20
            boolean r84 = X.C382426h.A00(r1, r0)     // Catch:{ all -> 0x02fb }
            r0 = r19
            int r6 = r1.getInt(r0)     // Catch:{ all -> 0x02fb }
            X.21l[] r3 = X.C372321l.values()     // Catch:{ all -> 0x02fb }
            int r5 = r3.length     // Catch:{ all -> 0x02fb }
            r0 = 0
        L_0x0272:
            if (r0 >= r5) goto L_0x02d4
            r9 = r3[r0]     // Catch:{ all -> 0x02fb }
            int r4 = r9.value     // Catch:{ all -> 0x02fb }
            int r0 = r0 + 1
            if (r4 != r6) goto L_0x0272
            r0 = r18
            boolean r85 = X.C382426h.A00(r1, r0)     // Catch:{ all -> 0x02fb }
            boolean r0 = r1.isNull(r14)     // Catch:{ all -> 0x02fb }
            if (r0 != 0) goto L_0x029f
            java.lang.String r0 = r1.getString(r14)     // Catch:{ all -> 0x02fb }
            if (r0 == 0) goto L_0x029f
            java.lang.String r3 = ","
            java.util.List r0 = X.AnonymousClass2AB.A01(r0, r3)     // Catch:{ all -> 0x02fb }
            X.6aY r53 = X.C129586aY.copyOf((java.util.Collection) r0)     // Catch:{ all -> 0x02fb }
        L_0x0298:
            boolean r0 = r1.isNull(r11)     // Catch:{ all -> 0x02fb }
            if (r0 == 0) goto L_0x02a5
            goto L_0x02a2
        L_0x029f:
            r53 = 0
            goto L_0x0298
        L_0x02a2:
            r61 = 0
            goto L_0x02a9
        L_0x02a5:
            java.lang.Long r61 = X.C18280x3.A0T(r1, r11)     // Catch:{ all -> 0x02fb }
        L_0x02a9:
            r0 = r17
            boolean r86 = X.C382426h.A00(r1, r0)     // Catch:{ all -> 0x02fb }
            X.599 r56 = X.AnonymousClass599.DEFAULT     // Catch:{ all -> 0x02fb }
            X.1RL r0 = new X.1RL     // Catch:{ all -> 0x02fb }
            r52 = r0
            r54 = r2
            r55 = r16
            r57 = r10
            r58 = r13
            r59 = r9
            r60 = r12
            r69 = r87
            r52.<init>(r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r71, r73, r75, r77, r79, r81, r83, r84, r85, r86)     // Catch:{ all -> 0x02fb }
            X.2KX r2 = r8.A05     // Catch:{ all -> 0x02fb }
            X.5UP r3 = r2.A01     // Catch:{ all -> 0x02fb }
            r2 = 3877(0xf25, float:5.433E-42)
            r3.A04(r2)     // Catch:{ all -> 0x02fb }
            r7.add(r0)     // Catch:{ all -> 0x02fb }
            goto L_0x0114
        L_0x02d4:
            java.util.NoSuchElementException r0 = X.C18320x8.A0t()     // Catch:{ all -> 0x02fb }
            goto L_0x02f3
        L_0x02d9:
            java.util.NoSuchElementException r0 = X.C18320x8.A0t()     // Catch:{ all -> 0x02fb }
            goto L_0x02f3
        L_0x02de:
            java.util.NoSuchElementException r0 = X.C18320x8.A0t()     // Catch:{ all -> 0x02fb }
            goto L_0x02f3
        L_0x02e3:
            java.util.NoSuchElementException r0 = X.C18320x8.A0t()     // Catch:{ all -> 0x02fb }
            goto L_0x02f3
        L_0x02e8:
            java.lang.String r0 = "Check failed."
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)     // Catch:{ all -> 0x02fb }
            goto L_0x02f3
        L_0x02ef:
            java.util.NoSuchElementException r0 = X.C18320x8.A0t()     // Catch:{ all -> 0x02fb }
        L_0x02f3:
            throw r0     // Catch:{ all -> 0x02fb }
        L_0x02f4:
            r1.close()     // Catch:{ all -> 0x0302 }
            r51.close()     // Catch:{ all -> 0x030b }
            return r7
        L_0x02fb:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x02fd }
        L_0x02fd:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r1, r2)     // Catch:{ all -> 0x0302 }
            throw r0     // Catch:{ all -> 0x0302 }
        L_0x0302:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x0304 }
        L_0x0304:
            r1 = move-exception
            r0 = r51
            X.AnonymousClass2A8.A00(r0, r2)     // Catch:{ all -> 0x030b }
            throw r1     // Catch:{ all -> 0x030b }
        L_0x030b:
            r0 = move-exception
            java.lang.Throwable r1 = X.AnonymousClass3Z0.A00(r0)
            if (r1 == 0) goto L_0x0317
            java.lang.String r0 = "NewsletterStore/failed to read newsletter"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0317:
            X.3d3 r7 = X.C72023d3.A00
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56652sL.A04():java.util.List");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0053, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        X.AnonymousClass2A8.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0057, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        X.AnonymousClass2A8.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005e, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List A05() {
        /*
            r6 = this;
            X.5UP r0 = r6.A06
            boolean r0 = X.C18300x5.A1S(r0)
            if (r0 == 0) goto L_0x006b
            r1 = 2
            java.lang.String[] r5 = new java.lang.String[r1]     // Catch:{ all -> 0x005f }
            X.21q r0 = X.C372821q.ADMIN     // Catch:{ all -> 0x005f }
            int r0 = r0.value     // Catch:{ all -> 0x005f }
            X.C18270x1.A1O(r5, r0)     // Catch:{ all -> 0x005f }
            X.21q r0 = X.C372821q.OWNER     // Catch:{ all -> 0x005f }
            int r0 = r0.value     // Catch:{ all -> 0x005f }
            X.C18270x1.A1P(r5, r0)     // Catch:{ all -> 0x005f }
            X.3dV r0 = r6.A04     // Catch:{ all -> 0x005f }
            X.4GK r4 = r0.get()     // Catch:{ all -> 0x005f }
            r0 = r4
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0058 }
            X.2sg r3 = r0.A03     // Catch:{ all -> 0x0058 }
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0058 }
            java.lang.String r0 = "SELECT chat_row_id FROM newsletter WHERE membership IN ("
            r2.append(r0)     // Catch:{ all -> 0x0058 }
            java.lang.String r0 = "?"
            java.util.List r1 = java.util.Collections.nCopies(r1, r0)     // Catch:{ all -> 0x0058 }
            X.C162457s7.A0D(r1)     // Catch:{ all -> 0x0058 }
            java.lang.String r0 = ","
            java.lang.String r0 = X.C73723fy.A09(r0, r1)     // Catch:{ all -> 0x0058 }
            java.lang.String r1 = X.C18260x0.A07(r0, r2)     // Catch:{ all -> 0x0058 }
            java.lang.String r0 = "NewsletterStore/GET_NEWSLETTER_JID_WITH_MEMBERSHIP_SQL"
            android.database.Cursor r2 = X.C56862sg.A02(r3, r1, r0, r5)     // Catch:{ all -> 0x0058 }
            java.util.List r0 = r6.A06(r2)     // Catch:{ all -> 0x0051 }
            r2.close()     // Catch:{ all -> 0x0058 }
            r4.close()     // Catch:{ all -> 0x005f }
            return r0
        L_0x0051:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0053 }
        L_0x0053:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r2, r1)     // Catch:{ all -> 0x0058 }
            throw r0     // Catch:{ all -> 0x0058 }
        L_0x0058:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x005a }
        L_0x005a:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r4, r1)     // Catch:{ all -> 0x005f }
            throw r0     // Catch:{ all -> 0x005f }
        L_0x005f:
            r0 = move-exception
            java.lang.Throwable r1 = X.AnonymousClass3Z0.A00(r0)
            if (r1 == 0) goto L_0x006b
            java.lang.String r0 = "NewsletterStore/failed to fetch admin newsletter jids"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x006b:
            X.3d3 r0 = X.C72023d3.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56652sL.A05():java.util.List");
    }

    public final List A06(Cursor cursor) {
        int columnIndexOrThrow = cursor.getColumnIndexOrThrow("chat_row_id");
        if (!cursor.moveToFirst()) {
            return C72023d3.A00;
        }
        ArrayList A0o = AnonymousClass000.A0o(cursor);
        do {
            C95814uZ A0B = this.A01.A0B(cursor.getLong(columnIndexOrThrow));
            if ((A0B instanceof C95804uY) && A0B != null) {
                A0o.add(A0B);
            }
        } while (cursor.moveToNext());
        return A0o;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:?, code lost:
        X.AnonymousClass2A8.A00(r10, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0243, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0246, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:?, code lost:
        X.AnonymousClass2A8.A00(r9, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x024a, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0269, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:?, code lost:
        X.AnonymousClass2A8.A00(r8, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x026d, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0270, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:?, code lost:
        X.AnonymousClass2A8.A00(r18, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0276, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x01ce, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        X.AnonymousClass2A8.A00(r12, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x01d2, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0210, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:?, code lost:
        X.AnonymousClass2A8.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0214, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0217, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:?, code lost:
        X.AnonymousClass2A8.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x021b, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x023f, code lost:
        r0 = move-exception;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0A(java.util.List r23) {
        /*
            r22 = this;
            r7 = r22
            X.3dV r0 = r7.A04     // Catch:{ all -> 0x0277 }
            r21 = r0
            X.4Fq r18 = r21.A04()     // Catch:{ all -> 0x0277 }
            X.3Yo r8 = r18.Axl()     // Catch:{ all -> 0x026e }
            java.util.Iterator r17 = r23.iterator()     // Catch:{ all -> 0x0267 }
        L_0x0012:
            boolean r0 = r17.hasNext()     // Catch:{ all -> 0x0267 }
            if (r0 == 0) goto L_0x025d
            java.lang.Object r6 = r17.next()     // Catch:{ all -> 0x0267 }
            X.1RL r6 = (X.AnonymousClass1RL) r6     // Catch:{ all -> 0x0267 }
            r0 = 0
            X.C162457s7.A0J(r6, r0)     // Catch:{ all -> 0x0267 }
            android.content.ContentValues r5 = X.AnonymousClass0x9.A06()     // Catch:{ all -> 0x0267 }
            long r0 = r6.A00     // Catch:{ all -> 0x0267 }
            r19 = r0
            java.lang.Long r4 = java.lang.Long.valueOf(r19)     // Catch:{ all -> 0x0267 }
            java.lang.String r0 = "_id"
            r5.put(r0, r4)     // Catch:{ all -> 0x0267 }
            X.34p r1 = r7.A03     // Catch:{ all -> 0x0267 }
            X.4uZ r0 = r6.A05()     // Catch:{ all -> 0x0267 }
            java.lang.Long r1 = X.C623334p.A03(r1, r0)     // Catch:{ all -> 0x0267 }
            java.lang.String r0 = "jid_row_id"
            r5.put(r0, r1)     // Catch:{ all -> 0x0267 }
            java.lang.String r0 = "subject"
            java.lang.String r9 = r6.A0H     // Catch:{ all -> 0x0267 }
            r5.put(r0, r9)     // Catch:{ all -> 0x0267 }
            A00(r5, r6)     // Catch:{ all -> 0x0267 }
            int r0 = r6.A02     // Catch:{ all -> 0x0267 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0267 }
            java.lang.String r0 = "group_type"
            r5.put(r0, r1)     // Catch:{ all -> 0x0267 }
            java.lang.Integer r1 = X.AnonymousClass001.A0f()     // Catch:{ all -> 0x0267 }
            java.lang.String r0 = "hidden"
            r5.put(r0, r1)     // Catch:{ all -> 0x0267 }
            long r0 = r6.A0O     // Catch:{ all -> 0x0267 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0267 }
            java.lang.String r0 = "created_timestamp"
            r5.put(r0, r1)     // Catch:{ all -> 0x0267 }
            android.content.ContentValues r3 = X.AnonymousClass0x9.A06()     // Catch:{ all -> 0x0267 }
            java.lang.String r2 = "chat_row_id"
            r3.put(r2, r4)     // Catch:{ all -> 0x0267 }
            java.lang.String r0 = "name"
            r3.put(r0, r9)     // Catch:{ all -> 0x0267 }
            long r0 = r6.A02     // Catch:{ all -> 0x0267 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0267 }
            java.lang.String r0 = "name_id"
            r3.put(r0, r1)     // Catch:{ all -> 0x0267 }
            java.lang.String r1 = r6.A0E     // Catch:{ all -> 0x0267 }
            if (r1 != 0) goto L_0x008d
            java.lang.String r1 = ""
        L_0x008d:
            java.lang.String r0 = "description"
            r3.put(r0, r1)     // Catch:{ all -> 0x0267 }
            long r0 = r6.A01     // Catch:{ all -> 0x0267 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0267 }
            java.lang.String r0 = "description_id"
            r3.put(r0, r1)     // Catch:{ all -> 0x0267 }
            java.lang.String r1 = "picture_url"
            java.lang.String r0 = r6.A0J     // Catch:{ all -> 0x0267 }
            r3.put(r1, r0)     // Catch:{ all -> 0x0267 }
            long r0 = r6.A03     // Catch:{ all -> 0x0267 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0267 }
            java.lang.String r0 = "picture_id"
            r3.put(r0, r1)     // Catch:{ all -> 0x0267 }
            java.lang.String r1 = "preview_url"
            java.lang.String r0 = r6.A0I     // Catch:{ all -> 0x0267 }
            r3.put(r1, r0)     // Catch:{ all -> 0x0267 }
            long r0 = r6.A04     // Catch:{ all -> 0x0267 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0267 }
            java.lang.String r0 = "preview_id"
            r3.put(r0, r1)     // Catch:{ all -> 0x0267 }
            java.lang.String r1 = "invite_code"
            java.lang.String r0 = r6.A0G     // Catch:{ all -> 0x0267 }
            r3.put(r1, r0)     // Catch:{ all -> 0x0267 }
            java.lang.String r1 = "handle"
            java.lang.String r0 = r6.A0F     // Catch:{ all -> 0x0267 }
            r3.put(r1, r0)     // Catch:{ all -> 0x0267 }
            long r0 = r6.A05     // Catch:{ all -> 0x0267 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0267 }
            java.lang.String r0 = "subscribers_count"
            r3.put(r0, r1)     // Catch:{ all -> 0x0267 }
            X.21q r0 = r6.A07     // Catch:{ all -> 0x0267 }
            int r0 = r0.value     // Catch:{ all -> 0x0267 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0267 }
            java.lang.String r0 = "membership"
            r3.put(r0, r1)     // Catch:{ all -> 0x0267 }
            X.21c r0 = r6.A0A     // Catch:{ all -> 0x0267 }
            int r0 = r0.value     // Catch:{ all -> 0x0267 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0267 }
            java.lang.String r0 = "privacy"
            r3.put(r0, r1)     // Catch:{ all -> 0x0267 }
            X.21e r0 = r6.A0C     // Catch:{ all -> 0x0267 }
            int r0 = r0.value     // Catch:{ all -> 0x0267 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0267 }
            java.lang.String r0 = "verified"
            r3.put(r0, r1)     // Catch:{ all -> 0x0267 }
            X.21l r0 = r6.A0B     // Catch:{ all -> 0x0267 }
            int r0 = r0.value     // Catch:{ all -> 0x0267 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0267 }
            java.lang.String r0 = "suspended"
            r3.put(r0, r1)     // Catch:{ all -> 0x0267 }
            java.lang.String r1 = "muted"
            boolean r0 = r6.A0L     // Catch:{ all -> 0x0267 }
            X.C382326g.A00(r3, r1, r0)     // Catch:{ all -> 0x0267 }
            java.lang.String r1 = "oldest_message_retrieved"
            boolean r0 = r6.A0M     // Catch:{ all -> 0x0267 }
            X.C382326g.A00(r3, r1, r0)     // Catch:{ all -> 0x0267 }
            java.lang.String r1 = "deleted"
            boolean r0 = r6.A0K     // Catch:{ all -> 0x0267 }
            X.C382326g.A00(r3, r1, r0)     // Catch:{ all -> 0x0267 }
            java.lang.String r1 = "show_enforced_update_banner"
            boolean r0 = r6.A0N     // Catch:{ all -> 0x0267 }
            X.C382326g.A00(r3, r1, r0)     // Catch:{ all -> 0x0267 }
            X.21r r0 = r6.A09     // Catch:{ all -> 0x0267 }
            int r0 = r0.value     // Catch:{ all -> 0x0267 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0267 }
            java.lang.String r0 = "reaction_setting"
            r3.put(r0, r1)     // Catch:{ all -> 0x0267 }
            X.6aY r9 = r6.A06     // Catch:{ all -> 0x0267 }
            if (r9 != 0) goto L_0x0149
            r1 = 0
            goto L_0x0150
        L_0x0149:
            r1 = 0
            java.lang.String r0 = ", "
            java.lang.String r1 = X.C73723fy.A0A(r0, r9, r1)     // Catch:{ all -> 0x0267 }
        L_0x0150:
            java.lang.String r0 = "reaction_setting_blocklist"
            r3.put(r0, r1)     // Catch:{ all -> 0x0267 }
            java.lang.String r1 = "reaction_setting_update_ts"
            java.lang.Long r0 = r6.A0D     // Catch:{ all -> 0x0267 }
            r3.put(r1, r0)     // Catch:{ all -> 0x0267 }
            X.4Fq r9 = r21.A04()     // Catch:{ all -> 0x024b }
            X.3Yo r10 = r9.Axl()     // Catch:{ all -> 0x0244 }
            r0 = r9
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x023d }
            X.2sg r12 = r0.A03     // Catch:{ all -> 0x023d }
            java.lang.String r11 = "newsletter"
            r14 = 0
            r1 = 5
            java.lang.String r0 = "NewsletterStore/INSERT_NEWSLETTER"
            long r15 = r12.A0C(r11, r0, r3, r1)     // Catch:{ all -> 0x023d }
            r12 = 0
            r11 = 0
            int r0 = (r15 > r12 ? 1 : (r15 == r12 ? 0 : -1))
            if (r0 >= 0) goto L_0x0188
            X.2e3 r1 = r7.A00     // Catch:{ all -> 0x023d }
            X.22M r0 = X.AnonymousClass22M.A0B     // Catch:{ all -> 0x023d }
            r1.A01(r0, r14)     // Catch:{ all -> 0x023d }
        L_0x0184:
            X.2wD r0 = X.C59022wD.A00     // Catch:{ all -> 0x023d }
            goto L_0x022c
        L_0x0188:
            X.2sm r0 = r7.A01     // Catch:{ all -> 0x023d }
            X.3dV r0 = r0.A06     // Catch:{ all -> 0x023d }
            X.4Fq r12 = r0.A04()     // Catch:{ all -> 0x023d }
            r0 = r12
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0233 }
            X.2sg r3 = r0.A03     // Catch:{ all -> 0x0233 }
            java.lang.String r1 = "chat"
            java.lang.String r0 = "replaceIntoChatTable/REPLACE_CHAT"
            r3.A0A(r1, r0, r5)     // Catch:{ all -> 0x0233 }
            r12.close()     // Catch:{ all -> 0x023d }
            X.2KX r0 = r7.A05     // Catch:{ all -> 0x023d }
            X.3dV r0 = r0.A00     // Catch:{ all -> 0x021c }
            X.4Fq r3 = r0.A04()     // Catch:{ all -> 0x021c }
            X.3Yo r5 = r3.Axl()     // Catch:{ all -> 0x0215 }
            X.4Fq r12 = r0.A04()     // Catch:{ all -> 0x01d3 }
            r0 = r12
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x01cc }
            X.2sg r15 = r0.A03     // Catch:{ all -> 0x01cc }
            java.lang.String r14 = "newsletter_linked_account"
            java.lang.String r13 = "chat_row_id = ?"
            java.lang.String[] r1 = X.C18260x0.A1b(r19)     // Catch:{ all -> 0x01cc }
            java.lang.String r0 = "NewsletterLinkedAccountsStore/DELETE_NEWSLETTER_LINKED_ACCOUNTS"
            int r0 = r15.A07(r14, r13, r0, r1)     // Catch:{ all -> 0x01cc }
            r12.close()     // Catch:{ all -> 0x01d3 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x01d3 }
            goto L_0x01d8
        L_0x01cc:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x01ce }
        L_0x01ce:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r12, r1)     // Catch:{ all -> 0x01d3 }
            throw r0     // Catch:{ all -> 0x01d3 }
        L_0x01d3:
            r0 = move-exception
            X.3Z0 r0 = X.AnonymousClass3Z0.A01(r0)     // Catch:{ all -> 0x020e }
        L_0x01d8:
            java.lang.Throwable r1 = X.AnonymousClass3Z9.A00(r0)     // Catch:{ all -> 0x020e }
            if (r1 == 0) goto L_0x01e3
            java.lang.String r0 = "NewsletterLinkedAccountsStore/failed to store newsletter"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x020e }
        L_0x01e3:
            java.util.List r0 = r6.A0Q     // Catch:{ all -> 0x020e }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x020e }
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x020e }
            if (r0 == 0) goto L_0x0204
            r1.next()     // Catch:{ all -> 0x020e }
            r0 = 1
            X.C162457s7.A0J(r11, r0)     // Catch:{ all -> 0x020e }
            android.content.ContentValues r0 = X.AnonymousClass0x9.A06()     // Catch:{ all -> 0x020e }
            r0.put(r2, r4)     // Catch:{ all -> 0x020e }
            java.lang.String r0 = "getName"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)     // Catch:{ all -> 0x020e }
            throw r0     // Catch:{ all -> 0x020e }
        L_0x0204:
            r5.A00()     // Catch:{ all -> 0x020e }
            r5.close()     // Catch:{ all -> 0x0215 }
            r3.close()     // Catch:{ all -> 0x021c }
            goto L_0x0220
        L_0x020e:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0210 }
        L_0x0210:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r5, r1)     // Catch:{ all -> 0x0215 }
            throw r0     // Catch:{ all -> 0x0215 }
        L_0x0215:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0217 }
        L_0x0217:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r3, r1)     // Catch:{ all -> 0x021c }
            throw r0     // Catch:{ all -> 0x021c }
        L_0x021c:
            r0 = move-exception
            X.AnonymousClass3Z0.A01(r0)     // Catch:{ all -> 0x023d }
        L_0x0220:
            X.2ss r1 = r7.A02     // Catch:{ all -> 0x023d }
            X.4uZ r0 = r6.A0q     // Catch:{ all -> 0x023d }
            r1.A0H(r6, r0)     // Catch:{ all -> 0x023d }
            r10.A00()     // Catch:{ all -> 0x023d }
            goto L_0x0184
        L_0x022c:
            r10.close()     // Catch:{ all -> 0x0244 }
            r9.close()     // Catch:{ all -> 0x024b }
            goto L_0x0250
        L_0x0233:
            r1 = move-exception
            r12.close()     // Catch:{ all -> 0x0238 }
            goto L_0x023c
        L_0x0238:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x023d }
        L_0x023c:
            throw r1     // Catch:{ all -> 0x023d }
        L_0x023d:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x023f }
        L_0x023f:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r10, r1)     // Catch:{ all -> 0x0244 }
            throw r0     // Catch:{ all -> 0x0244 }
        L_0x0244:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0246 }
        L_0x0246:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r9, r1)     // Catch:{ all -> 0x024b }
            throw r0     // Catch:{ all -> 0x024b }
        L_0x024b:
            r0 = move-exception
            X.3Z0 r0 = X.AnonymousClass3Z0.A01(r0)     // Catch:{ all -> 0x0267 }
        L_0x0250:
            java.lang.Throwable r1 = X.AnonymousClass3Z9.A00(r0)     // Catch:{ all -> 0x0267 }
            if (r1 == 0) goto L_0x0012
            java.lang.String r0 = "NewsletterStore/failed to store newsletter"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0267 }
            goto L_0x0012
        L_0x025d:
            r8.A00()     // Catch:{ all -> 0x0267 }
            r8.close()     // Catch:{ all -> 0x026e }
            r18.close()     // Catch:{ all -> 0x0277 }
            return
        L_0x0267:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0269 }
        L_0x0269:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r8, r1)     // Catch:{ all -> 0x026e }
            throw r0     // Catch:{ all -> 0x026e }
        L_0x026e:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x0270 }
        L_0x0270:
            r1 = move-exception
            r0 = r18
            X.AnonymousClass2A8.A00(r0, r2)     // Catch:{ all -> 0x0277 }
            throw r1     // Catch:{ all -> 0x0277 }
        L_0x0277:
            r0 = move-exception
            X.AnonymousClass3Z0.A01(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56652sL.A0A(java.util.List):void");
    }

    public C56652sL(C47922e3 r2, C56922sm r3, C56982ss r4, C623334p r5, C72303dV r6, AnonymousClass2KX r7, AnonymousClass5UP r8) {
        C18260x0.A0V(r5, r3, r4);
        C162457s7.A0J(r8, 5);
        C18260x0.A0U(r6, r7);
        this.A03 = r5;
        this.A01 = r3;
        this.A02 = r4;
        this.A00 = r2;
        this.A06 = r8;
        this.A04 = r6;
        this.A05 = r7;
    }
}
