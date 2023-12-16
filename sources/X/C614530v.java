package X;

import android.content.ContentValues;
import android.database.Cursor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.30v  reason: invalid class name and case insensitive filesystem */
public class C614530v {
    public final C56972sr A00;
    public final C64773Ex A01;
    public final C620633i A02;
    public final C54292oU A03;
    public final C620733j A04;
    public final C52852m9 A05;
    public final C56922sm A06;
    public final C56982ss A07;
    public final C623334p A08;
    public final C55272q5 A09;
    public final C72303dV A0A;
    public final C56082rO A0B;

    public static /* synthetic */ void A00(C614530v r5, List list, long j) {
        C69833Yo Axl;
        List<C42032Mn> A012 = new AnonymousClass5Y4(r5.A01, r5.A02, r5.A03, r5.A04).A01(list);
        C85284Fq A042 = r5.A0A.A04();
        try {
            Axl = A042.Axl();
            for (C42032Mn r1 : A012) {
                r5.A07(r1.A00, j);
                r5.A08(r1, j);
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
        throw th;
    }

    public final List A01(long j, boolean z) {
        String str;
        String str2;
        Cursor A0E;
        if (z) {
            str = "SELECT vcard FROM message_quoted_vcard WHERE message_row_id = ? AND vcard IS NOT NULL AND vcard != \"\"";
        } else {
            str = "SELECT vcard FROM message_vcard WHERE message_row_id = ? AND vcard IS NOT NULL AND vcard != \"\"";
        }
        if (z) {
            str2 = "GET_QUOTED_VCARDS_BY_MESSAGE_ROW_ID_SQL";
        } else {
            str2 = "GET_VCARDS_BY_MESSAGE_ROW_ID_SQL";
        }
        ArrayList A0s = AnonymousClass001.A0s();
        AnonymousClass4GK A032 = this.A0A.get();
        try {
            C56862sg r1 = ((AnonymousClass3H0) A032).A03;
            String[] A1Y = AnonymousClass0x9.A1Y();
            C18260x0.A1Y(A1Y, j);
            A0E = r1.A0E(str, str2, A1Y);
            int columnIndexOrThrow = A0E.getColumnIndexOrThrow("vcard");
            while (A0E.moveToNext()) {
                A0s.add(A0E.getString(columnIndexOrThrow));
            }
            A0E.close();
            A032.close();
            return A0s;
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

    public void A04(AnonymousClass1nF r7) {
        Cursor A0E;
        if (r7.A09 == 7 && r7.A01 != null) {
            AnonymousClass4GK A032 = this.A0A.get();
            try {
                C56862sg r4 = ((AnonymousClass3H0) A032).A03;
                String[] A1Y = AnonymousClass0x9.A1Y();
                C18260x0.A1Y(A1Y, r7.A1L);
                A0E = r4.A0E("SELECT count FROM message_media_vcard_count WHERE message_row_id = ?", "GET_VCARD_COUNT_BY_MESSAGE_ROW_ID_SQL", A1Y);
                if (A0E.moveToFirst()) {
                    r7.A01.A01 = AnonymousClass0x2.A03(A0E);
                }
                A0E.close();
                A032.close();
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
        } else {
            return;
        }
        throw th;
    }

    public void A05(AnonymousClass1nF r6) {
        if (r6.A09 == 7 && r6.A01 != null) {
            C85284Fq A042 = this.A0A.A04();
            try {
                ContentValues A092 = C18280x3.A09();
                C624134x.A0H(A092, r6);
                AnonymousClass3H0.A01(A092, A042, "count", r6.A01.A01).A0A("message_media_vcard_count", "REPLACE_VCARD_COUNT_SQL", A092);
                A042.close();
            } catch (Throwable th) {
                th.addSuppressed(th);
                throw th;
            }
        }
    }

    public final void A06(String str, long j) {
        C85284Fq A042 = this.A0A.A04();
        try {
            ContentValues A092 = C18280x3.A09();
            C18270x1.A0a(A092, j);
            AnonymousClass3H0.A03(A092, A042, "vcard", str).A0C("message_quoted_vcard", "INSERT_QUOTED_VCARD_SQL", A092, 4);
            A042.close();
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public final void A07(String str, long j) {
        C85284Fq A042 = this.A0A.A04();
        try {
            ContentValues A092 = C18280x3.A09();
            C18270x1.A0a(A092, j);
            AnonymousClass3H0.A03(A092, A042, "vcard", str).A0C("message_vcard", "INSERT_VCARD_SQL", A092, 4);
            A042.close();
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public final void A08(C42032Mn r11, long j) {
        Cursor A0E;
        long j2;
        C69833Yo Axl;
        String str = r11.A00;
        C72303dV r4 = this.A0A;
        AnonymousClass4GK A032 = r4.get();
        try {
            C56862sg r3 = ((AnonymousClass3H0) A032).A03;
            String[] A1Z = AnonymousClass0x9.A1Z();
            AnonymousClass000.A16(Long.toString(j), str, A1Z);
            A0E = r3.A0E("SELECT _id FROM message_vcard WHERE message_row_id = ? AND vcard = ?", "GET_VCARD_ROW_ID_BY_VCARD", A1Z);
            if (A0E.moveToFirst()) {
                j2 = C18270x1.A01(A0E);
                A0E.close();
                A032.close();
            } else {
                A0E.close();
                A032.close();
                j2 = -1;
            }
            List<AnonymousClass7OD> list = r11.A01.A06;
            if (list != null) {
                C85284Fq A042 = r4.A04();
                try {
                    Axl = A042.Axl();
                    for (AnonymousClass7OD r42 : list) {
                        if (r42.A01 != null) {
                            ContentValues A0E2 = C18290x4.A0E();
                            C18270x1.A0c(A0E2, "vcard_jid_row_id", this.A08.A05(r42.A01));
                            C18270x1.A0c(A0E2, "vcard_row_id", j2);
                            C18270x1.A0a(A0E2, j);
                            ((AnonymousClass3H0) A042).A03.A08("message_vcard_jid", "INSERT_VCARD_JID_SQL", A0E2);
                        }
                    }
                    Axl.A00();
                    Axl.close();
                    A042.close();
                    return;
                } catch (Throwable th) {
                    th = th;
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
            throw th;
        } catch (Throwable th3) {
            th = th3;
            A032.close();
            throw th;
        }
    }

    public C614530v(C56972sr r1, C64773Ex r2, C620633i r3, C54292oU r4, C620733j r5, C52852m9 r6, C56922sm r7, C56982ss r8, C623334p r9, C55272q5 r10, C72303dV r11, C56082rO r12) {
        this.A03 = r4;
        this.A08 = r9;
        this.A06 = r7;
        this.A00 = r1;
        this.A07 = r8;
        this.A01 = r2;
        this.A02 = r3;
        this.A04 = r5;
        this.A0B = r12;
        this.A05 = r6;
        this.A0A = r11;
        this.A09 = r10;
    }

    public void A02(C30411mP r7) {
        C69833Yo Axl;
        if (!r7.A1v().isEmpty()) {
            List A1v = r7.A1v();
            C85284Fq A042 = this.A0A.A04();
            try {
                Axl = A042.Axl();
                Iterator it = A1v.iterator();
                while (it.hasNext()) {
                    A07(AnonymousClass001.A0m(it), r7.A1L);
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

    public void A03(C30411mP r5, long j) {
        C69833Yo Axl;
        List A1v = r5.A1v();
        if (!A1v.isEmpty()) {
            C85284Fq A042 = this.A0A.A04();
            try {
                Axl = A042.Axl();
                Iterator it = A1v.iterator();
                while (it.hasNext()) {
                    A06(AnonymousClass001.A0m(it), j);
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
}
