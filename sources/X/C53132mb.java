package X;

import android.content.ContentValues;
import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2mb  reason: invalid class name and case insensitive filesystem */
public class C53132mb {
    public final C56972sr A00;
    public final C56922sm A01;
    public final C623334p A02;
    public final C72303dV A03;
    public final C56082rO A04;

    public void A00(C624134x r9) {
        C69833Yo Axl;
        List<AnonymousClass3ZM> list = r9.A18;
        if (list != null && !list.isEmpty()) {
            C85284Fq A042 = this.A03.A04();
            try {
                Axl = A042.Axl();
                for (AnonymousClass3ZM r3 : list) {
                    ContentValues A06 = AnonymousClass0x9.A06();
                    C624134x.A0H(A06, r9);
                    C18270x1.A0c(A06, "jid_row_id", this.A02.A05(r3.A00));
                    AnonymousClass3H0.A03(A06, A042, "display_name", r3.A01).A0C("message_mentions", "INSERT_TABLE_MESSAGE_MENTIONS", A06, 4);
                }
                Axl.A00();
                Axl.close();
                A042.close();
                return;
            } catch (Throwable th) {
                try {
                    A042.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } else {
            return;
        }
        throw th;
    }

    public void A02(C624134x r9, long j) {
        C69833Yo Axl;
        List<AnonymousClass3ZM> list = r9.A18;
        if (list != null && !list.isEmpty()) {
            C85284Fq A042 = this.A03.A04();
            try {
                Axl = A042.Axl();
                for (AnonymousClass3ZM r3 : list) {
                    ContentValues A06 = AnonymousClass0x9.A06();
                    C18270x1.A0a(A06, j);
                    C18270x1.A0c(A06, "jid_row_id", this.A02.A05(r3.A00));
                    AnonymousClass3H0.A03(A06, A042, "display_name", r3.A01).A0C("message_quoted_mentions", "INSERT_TABLE_QUOTED_MESSAGE_MENTIONS", A06, 4);
                }
                Axl.A00();
                Axl.close();
                A042.close();
                return;
            } catch (Throwable th) {
                try {
                    A042.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } else {
            return;
        }
        throw th;
    }

    public C53132mb(C56972sr r1, C56922sm r2, C623334p r3, C72303dV r4, C56082rO r5) {
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r1;
        this.A04 = r5;
        this.A03 = r4;
    }

    public void A01(C624134x r11) {
        Cursor A0E;
        ArrayList A0s = AnonymousClass001.A0s();
        AnonymousClass4GK A032 = this.A03.get();
        try {
            C56862sg r4 = ((AnonymousClass3H0) A032).A03;
            String[] A1Y = AnonymousClass0x9.A1Y();
            C18260x0.A1Y(A1Y, r11.A1L);
            A0E = r4.A0E("SELECT jid_row_id, display_name FROM message_mentions WHERE message_row_id = ?", "GET_JIDS_FROM_MESSAGES_MENTIONED_TABLE_SQL", A1Y);
            int columnIndexOrThrow = A0E.getColumnIndexOrThrow("jid_row_id");
            int columnIndexOrThrow2 = A0E.getColumnIndexOrThrow("display_name");
            while (A0E.moveToNext()) {
                long j = A0E.getLong(columnIndexOrThrow);
                String string = A0E.getString(columnIndexOrThrow2);
                C95814uZ A033 = C106405Yw.A03(this.A02.A08(j));
                if (A033 != null) {
                    A0s.add(new AnonymousClass3ZM(A033, string));
                }
            }
            A0E.close();
            A032.close();
            r11.A1g(A0s);
            return;
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
