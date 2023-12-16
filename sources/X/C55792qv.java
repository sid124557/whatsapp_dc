package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: X.2qv  reason: invalid class name and case insensitive filesystem */
public class C55792qv {
    public final C56922sm A00;
    public final C56982ss A01;
    public final C72303dV A02;
    public final C56362rr A03;

    public final C43912Ty A01(long j) {
        Cursor A0E;
        AnonymousClass4GK A032 = this.A02.get();
        try {
            C56862sg r3 = ((AnonymousClass3H0) A032).A03;
            String[] A1Y = AnonymousClass0x9.A1Y();
            C18260x0.A1Y(A1Y, j);
            A0E = r3.A0E("SELECT _id, chat_row_id, block_size, deleted_message_row_id, deleted_starred_message_row_id, deleted_messages_remove_files, deleted_categories_message_row_id, deleted_categories_starred_message_row_id, deleted_categories_remove_files, deleted_message_categories, singular_message_delete_rows_id, delete_files_singular_delete FROM deleted_chat_job WHERE chat_row_id = ? ORDER BY _id DESC LIMIT 1", "GET_DELETED_CHAT_JOBS_LATEST_SQL", A1Y);
            if (A0E.moveToFirst()) {
                C43912Ty A022 = A02(A0E);
                A0E.close();
                A032.close();
                return A022;
            }
            A0E.close();
            A032.close();
            return null;
        } catch (Throwable th) {
            try {
                A032.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public final C43912Ty A02(Cursor cursor) {
        ArrayList arrayList;
        Cursor cursor2 = cursor;
        long A0C = AnonymousClass0x2.A0C(cursor2, "chat_row_id");
        C95814uZ A0B = this.A00.A0B(A0C);
        if (A0B == null) {
            return null;
        }
        long A0C2 = AnonymousClass0x2.A0C(cursor2, "deleted_message_row_id");
        if (A0C2 == 0) {
            A0C2 = Long.MIN_VALUE;
        }
        long A0C3 = AnonymousClass0x2.A0C(cursor2, "deleted_starred_message_row_id");
        if (A0C3 == 0) {
            A0C3 = Long.MIN_VALUE;
        }
        long A0C4 = AnonymousClass0x2.A0C(cursor2, "deleted_categories_message_row_id");
        if (A0C4 == 0) {
            A0C4 = Long.MIN_VALUE;
        }
        long A0C5 = AnonymousClass0x2.A0C(cursor2, "deleted_categories_starred_message_row_id");
        if (A0C5 == 0) {
            A0C5 = Long.MIN_VALUE;
        }
        long A012 = C18270x1.A01(cursor2);
        int A04 = AnonymousClass0x2.A04(cursor2, "block_size");
        boolean A1S = AnonymousClass000.A1S(AnonymousClass0x2.A04(cursor2, "deleted_messages_remove_files"));
        boolean A1S2 = AnonymousClass000.A1S(AnonymousClass0x2.A04(cursor2, "delete_files_singular_delete"));
        boolean A1S3 = AnonymousClass000.A1S(AnonymousClass0x2.A04(cursor2, "deleted_categories_remove_files"));
        String A0Z = AnonymousClass0x2.A0Z(cursor2, "deleted_message_categories");
        String A0Z2 = AnonymousClass0x2.A0Z(cursor2, "singular_message_delete_rows_id");
        if (A0Z2 == null || A0Z2.isEmpty()) {
            arrayList = null;
        } else {
            String[] A1b = C18320x8.A1b(A0Z2.replace("\"", ""));
            arrayList = AnonymousClass001.A0s();
            for (String valueOf : A1b) {
                arrayList.add(Long.valueOf(valueOf));
            }
        }
        return new C43912Ty(A0B, A0Z, arrayList, A04, A012, A0C, A0C2, A0C3, A0C4, A0C5, A1S, A1S2, A1S3);
    }

    public C43912Ty A03(C95814uZ r47, Long l, List list, boolean z, boolean z2, boolean z3) {
        long j;
        long max;
        boolean z4;
        long j2;
        long j3;
        long j4;
        C69833Yo Axl;
        String str;
        boolean z5 = z2;
        C43912Ty r26 = null;
        C72303dV r8 = this.A02;
        C85284Fq A04 = r8.A04();
        try {
            C69833Yo Axl2 = A04.Axl();
            try {
                C56922sm r7 = this.A00;
                C95814uZ r6 = r47;
                long A07 = r7.A07(r6);
                if (l != null) {
                    max = l.longValue();
                } else {
                    AnonymousClass31A A002 = C56982ss.A00(this.A01, r6);
                    long A06 = this.A03.A06(r6);
                    if (A002 != null) {
                        j = A002.A0O;
                    } else {
                        j = Long.MIN_VALUE;
                    }
                    max = Math.max(A06, j);
                }
                if (TextUtils.isEmpty((CharSequence) null)) {
                    if (z) {
                        j4 = max;
                    } else {
                        j4 = Long.MIN_VALUE;
                    }
                    j3 = Long.MIN_VALUE;
                    j2 = Long.MIN_VALUE;
                    z4 = false;
                } else {
                    if (z) {
                        j2 = max;
                    } else {
                        j2 = Long.MIN_VALUE;
                    }
                    z4 = z5;
                    j3 = max;
                    z5 = false;
                    max = Long.MIN_VALUE;
                    j4 = Long.MIN_VALUE;
                }
                C43912Ty r24 = new C43912Ty(r6, (String) null, list, 100, -1, A07, max, j4, j3, j2, z5, z3, z4);
                C85284Fq A042 = r8.A04();
                try {
                    Axl = A042.Axl();
                    long j5 = r24.A01;
                    C95814uZ A0B = r7.A0B(j5);
                    if (A0B != null) {
                        AnonymousClass31A A0A = this.A01.A0A(A0B, false);
                        C43912Ty A012 = A01(j5);
                        if (A012 == null || TextUtils.isEmpty((CharSequence) null) || TextUtils.isEmpty(A012.A08)) {
                            long j6 = r24.A04;
                            long j7 = r24.A05;
                            boolean z6 = r24.A0C;
                            long j8 = r24.A02;
                            long j9 = r24.A03;
                            boolean z7 = r24.A0A;
                            String str2 = null;
                            List list2 = r24.A09;
                            List list3 = list2;
                            if (list2 == null) {
                                str = null;
                            } else {
                                String[] strArr = new String[list3.size()];
                                for (int i = 0; i < list3.size(); i++) {
                                    AnonymousClass0x7.A1E((Long) list3.get(i), strArr, i);
                                }
                                StringBuilder A0o = AnonymousClass001.A0o();
                                A0o.append("\"");
                                str = AnonymousClass000.A0V(C107575bX.A09("\",\"", strArr), "\"", A0o);
                            }
                            boolean z8 = r24.A0B;
                            if (A012 != null) {
                                if (TextUtils.isEmpty((CharSequence) null) || TextUtils.isEmpty(A012.A08)) {
                                    str2 = A012.A08;
                                    if (!TextUtils.isEmpty(str2)) {
                                        z7 = A012.A0A;
                                    } else {
                                        str2 = null;
                                    }
                                    j6 = Math.max(j6, A012.A04);
                                    j7 = Math.max(j7, A012.A05);
                                    j8 = Math.max(j8, A012.A02);
                                    j9 = Math.max(j9, A012.A03);
                                } else {
                                    Axl.close();
                                    A042.close();
                                    Axl2.close();
                                    A04.close();
                                    return r26;
                                }
                            }
                            ContentValues A062 = AnonymousClass0x9.A06();
                            C18270x1.A0c(A062, "chat_row_id", j5);
                            C18270x1.A0b(A062, "block_size", 100);
                            C18270x1.A0c(A062, "deleted_message_row_id", j6);
                            C18270x1.A0c(A062, "deleted_starred_message_row_id", j7);
                            AnonymousClass0x2.A0o(A062, "deleted_messages_remove_files", z6);
                            C18270x1.A0c(A062, "deleted_categories_message_row_id", j8);
                            C18270x1.A0c(A062, "deleted_categories_starred_message_row_id", j9);
                            A062.put("deleted_message_categories", str2);
                            AnonymousClass0x2.A0o(A062, "deleted_categories_remove_files", z7);
                            AnonymousClass0x2.A0o(A062, "delete_files_singular_delete", z8);
                            C621833x.A02(A062, "singular_message_delete_rows_id", str);
                            C56862sg r14 = ((AnonymousClass3H0) A042).A03;
                            long A08 = r14.A08("deleted_chat_job", "markChatForDeletion/INSERT_DELETED_CHAT_JOB", A062);
                            if (A012 != null) {
                                String[] A1Y = AnonymousClass0x9.A1Y();
                                C18280x3.A1R(A1Y, 0, A012.A06);
                                r14.A07("deleted_chat_job", "_id = ?", "markChatForDeletion/DELETE_DELETED_CHAT_JOB", A1Y);
                            }
                            StringBuilder A0o2 = AnonymousClass001.A0o();
                            A0o2.append("msgstore/deletemsgs/mark jid:");
                            A0o2.append(A0B);
                            A0o2.append(" lastDeletedMessageSortId:");
                            A0o2.append(j6);
                            C18260x0.A12(" lastDeletedStarredMessageSortId:", A0o2, j7);
                            if (A08 > 0 && A0A != null) {
                                A0A.A0F(str2, j6, j7, j8, j9);
                            }
                            Axl.A00();
                            r26 = new C43912Ty(A0B, str2, list3, 100, A08, j5, j6, j7, j8, j9, z6, z8, z7);
                            Axl.close();
                            A042.close();
                            Axl2.A00();
                            Axl2.close();
                            A04.close();
                            return r26;
                        }
                    }
                    Axl.close();
                    A042.close();
                    Axl2.close();
                    A04.close();
                    return r26;
                } catch (Throwable th) {
                    A042.close();
                    throw th;
                }
                throw th;
            } catch (Throwable th2) {
                Axl2.close();
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                A04.close();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }

    public void A05(C43912Ty r22) {
        C56982ss r0 = this.A01;
        C43912Ty r10 = r22;
        C95814uZ r5 = r10.A07;
        AnonymousClass31A A0A = r0.A0A(r5, false);
        C85284Fq A04 = this.A02.A04();
        try {
            C56862sg r6 = ((AnonymousClass3H0) A04).A03;
            String[] A1Y = AnonymousClass0x9.A1Y();
            AnonymousClass0x2.A1S(A1Y, 0, r10.A06);
            r6.A07("deleted_chat_job", "_id = ?", "unmarkJidForDeletionInChats/DELETE_DELETED_CHAT_JOB", A1Y);
            if (A0A != null && A01(r10.A01) == null) {
                A0A.A0F((String) null, Long.MIN_VALUE, Long.MIN_VALUE, Long.MIN_VALUE, Long.MIN_VALUE);
            }
            C18260x0.A1R(AnonymousClass001.A0o(), "msgstore/deletemsgs/unmark jid:", r5);
            A04.close();
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public C55792qv(C56922sm r1, C56982ss r2, C72303dV r3, C56362rr r4) {
        this.A00 = r1;
        this.A01 = r2;
        this.A03 = r4;
        this.A02 = r3;
    }

    public int A00(C95814uZ r7) {
        Cursor A0E;
        String[] A1Y = AnonymousClass0x9.A1Y();
        int A032 = C56922sm.A03(this.A00, r7, A1Y);
        AnonymousClass4GK A033 = this.A02.get();
        try {
            A0E = ((AnonymousClass3H0) A033).A03.A0E("SELECT COUNT(*) as count  FROM deleted_messages_ids_view WHERE chat_row_id = ? AND message_type != 8", "GET_MESSAGE_COUNT_JID_TO_DELETE_SQL", A1Y);
            if (A0E.moveToNext()) {
                A032 = AnonymousClass0x2.A03(A0E);
                C18260x0.A0y("msgstore/countmessagestodelete/count: ", AnonymousClass001.A0o(), A032);
            } else {
                C18260x0.A1R(AnonymousClass001.A0o(), "msgstore/countmessagestodelete/db no message for ", r7);
            }
            A0E.close();
            A033.close();
            return A032;
        } catch (Throwable th) {
            try {
                A033.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public Set A04() {
        Cursor A012;
        HashSet A0K = AnonymousClass002.A0K();
        AnonymousClass4GK A032 = this.A02.get();
        try {
            A012 = C56862sg.A01(((AnonymousClass3H0) A032).A03, "SELECT DISTINCT chat_row_id FROM deleted_chat_job", "GET_DELETED_CHATS_SQL");
            int columnIndexOrThrow = A012.getColumnIndexOrThrow("chat_row_id");
            while (A012.moveToNext()) {
                C95814uZ A0B = this.A00.A0B(A012.getLong(columnIndexOrThrow));
                if (A0B != null) {
                    A0K.add(A0B);
                }
            }
            A012.close();
            A032.close();
            return A0K;
        } catch (Throwable th) {
            try {
                A032.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }
}
