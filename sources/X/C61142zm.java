package X;

import android.content.ContentValues;
import android.database.Cursor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2zm  reason: invalid class name and case insensitive filesystem */
public class C61142zm {
    public final C72303dV A00;
    public final C55832qz A01;
    public final C183538qC A02;

    public int A00(C624134x r7) {
        Cursor A0E;
        AnonymousClass4GK A03 = this.A00.get();
        try {
            C56862sg r4 = ((AnonymousClass3H0) A03).A03;
            String[] A1Y = AnonymousClass0x9.A1Y();
            boolean A1W = AnonymousClass0x7.A1W(A1Y, r7.A1L);
            A0E = r4.A0E("\n          SELECT COUNT(*) as reply_count\n          FROM message_comment\n          WHERE parent_message_row_id = ?\n        ", "SELECT_COMMENT_COUNT_FOR_PARENT_MESSAGE_QUERY_ID", A1Y);
            if (A0E.moveToNext()) {
                int A04 = AnonymousClass0x2.A04(A0E, "reply_count");
                A0E.close();
                A03.close();
                return A04;
            }
            A0E.close();
            A03.close();
            return A1W ? 1 : 0;
        } catch (Throwable th) {
            try {
                A03.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public void A02(AnonymousClass4GK r5, C624134x r6, int i, boolean z) {
        long j = r6.A1L;
        String[] A1Y = AnonymousClass0x9.A1Y();
        C18270x1.A1S(A1Y, j);
        Cursor A0E = ((AnonymousClass3H0) r5).A03.A0E(C58092uh.A00, "SELECT_ALL_COMMENTS_FOR_PARENT_MESSAGE_QUERY_ID", A1Y);
        while (A0E.moveToNext()) {
            try {
                C624134x A03 = this.A01.A03(A0E);
                if (A03 != null) {
                    AnonymousClass0x9.A0M(this.A02).A0d(A03, i, z);
                }
            } catch (Throwable th) {
                th.addSuppressed(th);
                throw th;
            }
        }
        A0E.close();
    }

    public C61142zm(C72303dV r1, C55832qz r2, C183538qC r3) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
    }

    public List A01(List list, int i) {
        Throwable th;
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C624134x A0T = C18300x5.A0T(it);
            if (A0T.A1r(16)) {
                long j = A0T.A1L;
                AnonymousClass4GK A03 = this.A00.get();
                try {
                    String[] A1Z = AnonymousClass0x9.A1Z();
                    C18260x0.A1W(A1Z, i, j);
                    Cursor A002 = C56862sg.A00(A03, ((AnonymousClass3H0) A03).A03, C58092uh.A01, "SELECT_COMMENTS_FOR_PARENT_MESSAGE_QUERY_ID", A1Z);
                    while (A002.moveToNext()) {
                        try {
                            A0s.add(this.A01.A03(A002));
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                    A002.close();
                } catch (Throwable th3) {
                    th = th3;
                    A03.close();
                    throw th;
                }
            }
        }
        return A0s;
    }

    public void A03(C624134x r8) {
        C69833Yo Axl;
        C55162pu A0t = r8.A0t();
        if (A0t != null) {
            Long A03 = A0t.A03();
            if (A03.longValue() != -1) {
                C85284Fq A04 = this.A00.A04();
                try {
                    Axl = A04.Axl();
                    ContentValues A09 = C18280x3.A09();
                    C624134x.A0H(A09, r8);
                    AnonymousClass3H0.A00(A09, A03, A04, "parent_message_row_id").A0C("message_comment", "insertIntoCommentsTable/INSERT_COMMENT_MESSAGES", A09, 4);
                    Axl.A00();
                    Axl.close();
                    A04.close();
                    return;
                } catch (Throwable th) {
                    try {
                        A04.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            } else {
                return;
            }
        } else {
            return;
        }
        throw th;
    }
}
