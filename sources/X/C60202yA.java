package X;

import android.database.Cursor;

/* renamed from: X.2yA  reason: invalid class name and case insensitive filesystem */
public class C60202yA {
    public final C56922sm A00;
    public final C72303dV A01;
    public final C56082rO A02;
    public final C106685Zz A03;
    public final C55832qz A04;
    public final AnonymousClass2MK A05;

    public static String A00(C624134x r2) {
        if (r2 instanceof AnonymousClass4DV) {
            AnonymousClass39W A0Y = AnonymousClass0x9.A0Y(r2);
            if (A0Y != null) {
                return A0Y.A08;
            }
            return null;
        } else if (AnonymousClass353.A04(r2)) {
            return AnonymousClass353.A01(r2);
        } else {
            if (r2 instanceof C30481mW) {
                return r2.A13();
            }
            if ((r2 instanceof AnonymousClass1n2) || (r2 instanceof C31981pC)) {
                return ((C30471mV) r2).A1w();
            }
            return null;
        }
    }

    public int A01(AnonymousClass0QU r8, C95814uZ r9) {
        Cursor A0D;
        String l = Long.toString(this.A00.A07(r9));
        AnonymousClass4GK A032 = this.A01.get();
        try {
            C56862sg r4 = ((AnonymousClass3H0) A032).A03;
            String[] A1Y = AnonymousClass0x9.A1Y();
            A1Y[0] = l;
            A0D = r4.A0D(r8, "SELECT COUNT(*) AS count FROM message_link WHERE chat_row_id = ?", "MESSAGE_LINK_TABLE_GET_COUNT", A1Y);
            if (A0D.moveToFirst()) {
                int A033 = AnonymousClass0x2.A03(A0D);
                A0D.close();
                A032.close();
                return A033;
            }
            A0D.close();
            A032.close();
            return 0;
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

    public void A02(C624134x r7) {
        String A002;
        if (this.A02.A00("links_ready", 0) != 0 && !AnonymousClass2z0.A0B(r7) && (A002 = A00(r7)) != null) {
            AnonymousClass2MK r4 = this.A05;
            r4.A01.execute(new C71403c3(r4, new AnonymousClass2KW(this, r7), A002, 15));
        }
    }

    public C60202yA(C56922sm r1, C72303dV r2, C56082rO r3, C106685Zz r4, C55832qz r5, AnonymousClass2MK r6) {
        this.A00 = r1;
        this.A03 = r4;
        this.A04 = r5;
        this.A05 = r6;
        this.A02 = r3;
        this.A01 = r2;
    }
}
