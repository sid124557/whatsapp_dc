package X;

import android.database.Cursor;

/* renamed from: X.2xB  reason: invalid class name and case insensitive filesystem */
public final class C59602xB {
    public static final int[] A04 = {-1, 7, 11, 15, 35, 36, 38, 39, 50, 56, 58, 64, 68, 69, 70, 71, 74, 75, 76, 77, 79, 84, 87};
    public long A00 = System.currentTimeMillis();
    public final C380625j A01;
    public final C56382rt A02;
    public final C55832qz A03;

    public final Integer A00(C95814uZ r11, long j) {
        String str;
        Cursor A0E;
        long j2;
        int A1S;
        C56382rt r2 = this.A02;
        long j3 = j - 86400000;
        int[] iArr = A04;
        AnonymousClass33M r5 = new AnonymousClass33M(false);
        r5.A0A("rowidstore/getFirstSentOrReceivedRowIdInTimeWindowExcludingTypes");
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("SELECT _id FROM available_message_view WHERE chat_row_id = ? AND ");
        if (iArr.length != 0) {
            str = AnonymousClass000.A0V(AnonymousClass34U.A00(iArr), " AND ", AnonymousClass001.A0o());
        } else {
            str = "";
        }
        C18310x6.A1O(A0o, str);
        A0o.append("from_me=1");
        A0o.append(" AND ");
        A0o.append("timestamp BETWEEN ? AND ?");
        A0o.append(" OR ");
        A0o.append("from_me=0");
        A0o.append(" AND ");
        A0o.append("received_timestamp BETWEEN ? AND ?");
        String A0X = AnonymousClass000.A0X(") ORDER BY sort_id ASC LIMIT 1", A0o);
        AnonymousClass4GK A032 = r2.A05.get();
        try {
            C56862sg r4 = ((AnonymousClass3H0) A032).A03;
            String[] strArr = new String[5];
            C56922sm.A02(r2.A01, r11, strArr, 0);
            String l = Long.toString(j3);
            strArr[1] = l;
            String l2 = Long.toString(j);
            AnonymousClass001.A1H(l2, l, strArr);
            strArr[4] = l2;
            A0E = r4.A0E(A0X, "GET_FIRST_IN_TIME_WINDOW_EXCLUDE_TYPES", strArr);
            if (A0E.moveToNext()) {
                j2 = C18270x1.A01(A0E);
            } else {
                j2 = 1;
            }
            A0E.close();
            StringBuilder A0f = C18280x3.A0f(A032);
            A0f.append("rowidstore/getFirstSentOrReceivedRowIdInTimeWindowExcludingTypes ");
            A0f.append("");
            AnonymousClass33M.A05(r5, " | time spent:", A0f);
            if (j2 == 1) {
                A1S = 2;
            } else {
                C624134x A002 = C55122pp.A00(this.A03, j2);
                if (A002 == null) {
                    C18260x0.A11("calculateConversationInitiator: cannot load FMessage for rowId=", AnonymousClass001.A0o(), j2);
                    return null;
                }
                A1S = AnonymousClass000.A1S(A002.A1J.A02 ? 1 : 0);
            }
            return Integer.valueOf(A1S);
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

    public C59602xB(C380625j r3, C56382rt r4, C55832qz r5) {
        C18260x0.A0V(r3, r4, r5);
        this.A01 = r3;
        this.A02 = r4;
        this.A03 = r5;
    }
}
