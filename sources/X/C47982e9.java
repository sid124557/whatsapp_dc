package X;

import android.content.ContentValues;
import android.database.Cursor;

/* renamed from: X.2e9  reason: invalid class name and case insensitive filesystem */
public class C47982e9 {
    public final C72303dV A00;

    public void A00(long j, int i) {
        C85284Fq A04 = this.A00.A04();
        try {
            ContentValues A09 = C18280x3.A09();
            C18270x1.A0a(A09, j);
            AnonymousClass3H0.A01(A09, A04, "forward_score", i).A08("message_forwarded", "INSERT_FORWARDING_SCORE_FOR_ROW_ID_SQL", A09);
            A04.close();
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public void A01(C624134x r8) {
        Cursor A0E;
        AnonymousClass4GK A03 = this.A00.get();
        try {
            C56862sg r5 = ((AnonymousClass3H0) A03).A03;
            int i = 1;
            String[] strArr = new String[1];
            C18260x0.A1Y(strArr, r8.A1L);
            A0E = r5.A0E("SELECT forward_score FROM message_forwarded WHERE message_row_id = ?", "GET_FORWARDING_SCORE_FOR_ROW_ID_SQL", strArr);
            if (A0E != null) {
                if (A0E.moveToNext()) {
                    i = AnonymousClass0x2.A04(A0E, "forward_score");
                }
            }
            r8.A06 = i;
            if (A0E != null) {
                A0E.close();
            }
            A03.close();
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

    public C47982e9(C72303dV r1) {
        this.A00 = r1;
    }
}
