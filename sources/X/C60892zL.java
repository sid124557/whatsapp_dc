package X;

import android.database.Cursor;

/* renamed from: X.2zL  reason: invalid class name and case insensitive filesystem */
public final class C60892zL {
    public final C56612sH A00;
    public final C56982ss A01;
    public final C66543Lv A02;
    public final AnonymousClass1VX A03;
    public final AnonymousClass4FV A04;

    public final void A03(AnonymousClass3ZH r9, C95814uZ r10) {
        AnonymousClass31A A0A;
        boolean z;
        C162457s7.A0J(r10, 0);
        if (this.A03.A0Y(C58422vE.A02, 5245) && (A0A = this.A01.A0A(r10, false)) != null) {
            long longValue = A0A.A06().longValue();
            AnonymousClass1ZZ r5 = new AnonymousClass1ZZ();
            r5.A04 = r10.getRawString();
            if (r9 == null || (r9.A0F == null && r9.A0G == null)) {
                z = false;
            } else {
                z = true;
            }
            r5.A00 = Boolean.valueOf(z);
            r5.A03 = Double.valueOf(A00(this.A00.A0H() - this.A02.A04(longValue)));
            r5.A01 = Double.valueOf(A01(longValue));
            r5.A02 = Double.valueOf(A02(longValue));
            this.A04.BhD(r5);
        }
    }

    public static final double A00(long j) {
        return ((double) j) * (((double) 1) + (Math.pow((((double) 2) * Math.random()) - 1.0d, 5.0d) * 0.5d));
    }

    public final double A01(long j) {
        Cursor A0E;
        long j2;
        C66543Lv r1 = this.A02;
        AnonymousClass33M A012 = AnonymousClass33M.A01("CoreMessageStore/getNumOfMessagesReceivedFromJid");
        try {
            AnonymousClass4GK A032 = r1.A18.get();
            try {
                C56862sg r6 = ((AnonymousClass3H0) A032).A03;
                String[] A1a = AnonymousClass0x9.A1a();
                C18260x0.A1X(A1a, j);
                A1a[1] = "0";
                AnonymousClass0x2.A1T(A1a, 1000);
                A0E = r6.A0E("SELECT COUNT(*) as count FROM (SELECT * FROM available_message_view WHERE chat_row_id = ? AND from_me = ? AND (message_type != '7') AND (message_type != '8') LIMIT ?)", "GET_NON_SYSTEM_MESSAGES_COUNT_IN_CHAT_FROM_ME_OR_OTHERS_SQL", A1a);
                if (A0E.moveToFirst()) {
                    j2 = AnonymousClass0x2.A0C(A0E, "count");
                } else {
                    j2 = -1;
                }
                A0E.close();
                A032.close();
                A012.A07();
                if (j2 < 1000) {
                    return A00(j2);
                }
                return 2000.0d;
            } catch (Throwable th) {
                A032.close();
                throw th;
            }
            throw th;
        } catch (Throwable th2) {
            A012.A07();
            throw th2;
        }
    }

    public final double A02(long j) {
        Cursor A0E;
        long j2;
        C66543Lv r1 = this.A02;
        AnonymousClass33M A012 = AnonymousClass33M.A01("CoreMessageStore/getNumOfMessagesSentToJid");
        try {
            AnonymousClass4GK A032 = r1.A18.get();
            try {
                C56862sg r6 = ((AnonymousClass3H0) A032).A03;
                String[] A1a = AnonymousClass0x9.A1a();
                C18260x0.A1X(A1a, j);
                A1a[1] = "1";
                AnonymousClass0x2.A1T(A1a, 1000);
                A0E = r6.A0E("SELECT COUNT(*) as count FROM (SELECT * FROM available_message_view WHERE chat_row_id = ? AND from_me = ? AND (message_type != '7') AND (message_type != '8') LIMIT ?)", "GET_NON_SYSTEM_MESSAGES_COUNT_IN_CHAT_FROM_ME_OR_OTHERS_SQL", A1a);
                if (A0E.moveToFirst()) {
                    j2 = AnonymousClass0x2.A0C(A0E, "count");
                } else {
                    j2 = -1;
                }
                A0E.close();
                A032.close();
                A012.A07();
                if (j2 < 1000) {
                    return A00(j2);
                }
                return 2000.0d;
            } catch (Throwable th) {
                A032.close();
                throw th;
            }
            throw th;
        } catch (Throwable th2) {
            A012.A07();
            throw th2;
        }
    }

    public C60892zL(C56612sH r1, C56982ss r2, C66543Lv r3, AnonymousClass1VX r4, AnonymousClass4FV r5) {
        C18260x0.A0f(r1, r4, r2, r5, r3);
        this.A00 = r1;
        this.A03 = r4;
        this.A01 = r2;
        this.A04 = r5;
        this.A02 = r3;
    }
}
