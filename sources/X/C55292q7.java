package X;

import android.content.ContentValues;
import android.database.Cursor;
import com.whatsapp.util.Log;

/* renamed from: X.2q7  reason: invalid class name and case insensitive filesystem */
public class C55292q7 {
    public final C57162tC A00;
    public final C72303dV A01;
    public final AnonymousClass1VX A02;

    public void A02(C624134x r9) {
        Cursor A0E;
        int i;
        AnonymousClass4DU r7 = (AnonymousClass4DU) r9;
        long j = r9.A1L;
        AnonymousClass4GK A03 = this.A01.get();
        try {
            C56862sg r3 = ((AnonymousClass3H0) A03).A03;
            String[] A1Y = AnonymousClass0x9.A1Y();
            C18260x0.A1Y(A1Y, j);
            A0E = r3.A0E("SELECT state FROM message_view_once_media WHERE message_row_id = ?", "GET_VIEW_ONCE_STATE_BY_MESSAGE_ROW_ID_SQL", A1Y);
            int columnIndexOrThrow = A0E.getColumnIndexOrThrow("state");
            if (A0E.moveToNext()) {
                i = A0E.getInt(columnIndexOrThrow);
                A0E.close();
                A03.close();
            } else {
                A0E.close();
                A03.close();
                i = 2;
            }
            r7.Bno(i);
            return;
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

    public final void A00(long j, int i) {
        C85284Fq A04;
        try {
            A04 = this.A01.A04();
            ContentValues A06 = AnonymousClass0x9.A06();
            C18270x1.A0a(A06, j);
            AnonymousClass3H0.A01(A06, A04, "state", i).A0C("message_view_once_media", "INSERT_VIEW_ONCE_SQL", A06, 5);
            A04.close();
            return;
        } catch (Exception e) {
            Log.e("ViewOnceMessageStore/updateInsert failed", e);
            return;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public final void A01(long j, int i) {
        C85284Fq A04;
        try {
            A04 = this.A01.A04();
            ContentValues A06 = AnonymousClass0x9.A06();
            AnonymousClass3H0.A01(A06, A04, "state", i).A05(A06, "message_view_once_media", "message_row_id = ?", "UPDATE_VIEW_ONCE_SQL", C18260x0.A1b(j));
            A04.close();
            return;
        } catch (Exception e) {
            Log.e("ViewOnceMessageStore/updateInsert failed", e);
            return;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public void A04(C624134x r4) {
        if (r4 instanceof AnonymousClass4DU) {
            int i = r4.A0D;
            if (i == 9 || i == 10 || i == 8) {
                C624134x r42 = (C624134x) ((AnonymousClass4DU) r4);
                AnonymousClass4DU r0 = (AnonymousClass4DU) r42;
                r0.Bno(1);
                A01(r42.A1L, r0.BEM());
            }
        }
    }

    public C55292q7(C57162tC r1, C72303dV r2, AnonymousClass1VX r3) {
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r1;
    }

    public void A03(C624134x r4) {
        C626936e.A00();
        C626936e.A0C(r4 instanceof AnonymousClass4DU);
        A00(r4.A1L, ((AnonymousClass4DU) r4).BEM());
    }
}
