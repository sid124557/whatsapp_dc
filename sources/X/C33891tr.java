package X;

import android.database.Cursor;
import android.os.SystemClock;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;

/* renamed from: X.1tr  reason: invalid class name and case insensitive filesystem */
public class C33891tr extends AnonymousClass5ZM {
    public int A00;
    public long A01 = 1;
    public C42242Ni A02;
    public C624134x A03;
    public final C56612sH A04;
    public final C66543Lv A05;
    public final C66533Lu A06;
    public final C56362rr A07;
    public final C95814uZ A08;
    public final C624134x A09;
    public final C56532s8 A0A;
    public final C55832qz A0B;
    public final WeakReference A0C;
    public final boolean A0D;

    public void A0A() {
        C84464Cl r3 = (C84464Cl) this.A0C.get();
        long A032 = this.A06.A03();
        this.A01 = A032;
        if (r3 != null) {
            r3.BQG(A032, this.A0D);
        }
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        C84464Cl r0 = (C84464Cl) this.A0C.get();
        if (r0 != null) {
            r0.BQF(this.A02, this.A03, this.A00, this.A01);
        }
    }

    public C33891tr(C84464Cl r3, C56612sH r4, C66543Lv r5, C66533Lu r6, C56362rr r7, C624134x r8, C56532s8 r9, C55832qz r10, boolean z) {
        this.A04 = r4;
        this.A07 = r7;
        this.A06 = r6;
        this.A05 = r5;
        this.A0B = r10;
        C95814uZ r0 = r9.A04;
        C626936e.A06(r0);
        this.A08 = r0;
        this.A0A = r9;
        this.A0D = z;
        this.A09 = r8;
        this.A0C = AnonymousClass0x9.A14(r3);
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        Cursor A0E;
        C58592vV r1;
        String str;
        String str2;
        String[] strArr;
        String str3;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        C66533Lu r8 = this.A06;
        C624134x r2 = this.A09;
        boolean z = this.A0D;
        C56532s8 r9 = this.A0A;
        if (r8.A0N()) {
            AnonymousClass33M A012 = AnonymousClass33M.A01("FtsMessageStore/searchforjid");
            C95814uZ r12 = r9.A04;
            C626936e.A06(r12);
            long A013 = C627636p.A01(r2);
            if (A013 == Long.MIN_VALUE) {
                Log.e("FtsMessageStore/searchforjid/startSortId < 0");
            } else {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("start:");
                A0o.append(A013);
                A012.A08(AnonymousClass000.A0b(" up:", A0o, z));
                if (C56532s8.A00(r9)) {
                    long A032 = r8.A03();
                    if (A032 == 1) {
                        StringBuilder A0A2 = C18330xA.A0A(AnonymousClass2CD.A04);
                        AnonymousClass34U.A02(A0A2, z);
                        str = AnonymousClass000.A0X(" LIMIT 1", A0A2);
                        String A0F = r8.A0F(r9.A02());
                        strArr = AnonymousClass0x9.A1a();
                        strArr[0] = A0F;
                        C56922sm.A02(r8.A08, r12, strArr, 1);
                        AnonymousClass0x2.A1S(strArr, 2, A013);
                        str2 = "FIND_FTS_MESSAGE_FOR_JID_DEPRECATED";
                    } else if (A032 == 5) {
                        r9.A0F = true;
                        if (C56952sp.A0H(r8.A0J)) {
                            str3 = AnonymousClass2CD.A07;
                        } else {
                            str3 = AnonymousClass2CD.A06;
                        }
                        StringBuilder A0A3 = C18330xA.A0A(str3);
                        AnonymousClass34U.A02(A0A3, z);
                        str = AnonymousClass000.A0X(" LIMIT 1", A0A3);
                        strArr = new String[2];
                        strArr[0] = r8.A0A((AnonymousClass0QU) null, r9, (Integer) null);
                        AnonymousClass0x2.A1S(strArr, 1, A013);
                        str2 = "FIND_FTS_MESSAGE_FOR_JID";
                    } else {
                        str = "";
                        str2 = str;
                        strArr = null;
                    }
                    C626936e.A06(strArr);
                    A012.A08("compiled");
                    r1 = r8.A07(str, str2, strArr);
                    if (r1.A00 == -2) {
                        r9.A0F = false;
                        String[] strArr2 = new String[2];
                        strArr2[0] = r8.A0A((AnonymousClass0QU) null, r9, (Integer) null);
                        AnonymousClass0x2.A1S(strArr2, 1, A013);
                        r1 = r8.A07(str, "FIND_FTS_MESSAGE_FOR_JID_CONTENT_ONLY", strArr2);
                    }
                    StringBuilder A0o2 = AnonymousClass001.A0o();
                    A0o2.append("found: ");
                    A012.A08(AnonymousClass001.A0k(A0o2, r1.A01));
                    A012.A07();
                }
            }
            r1 = C58592vV.A00(-4);
        } else {
            AnonymousClass33M A014 = AnonymousClass33M.A01("FtsMessageStore/like/searchforjid");
            C95814uZ r20 = r9.A04;
            C626936e.A06(r20);
            long A015 = C627636p.A01(r2);
            if (A015 == Long.MIN_VALUE) {
                Log.e("FtsMessageStore/like/searchforjid/startid < 0");
                r1 = C58592vV.A00(-4);
            } else {
                String replace = r9.A02().replace("'", "''").replace("%", "\\%");
                StringBuilder A0A4 = C18330xA.A0A("(");
                A0A4.append("(");
                A0A4.append("data");
                A0A4.append(" LIKE '%");
                A0A4.append(replace);
                A0A4.append("%' ESCAPE '\\' AND ");
                A0A4.append("message_type");
                A0A4.append(" = '");
                A0A4.append(0);
                A0A4.append("') ");
                A0A4.append(" OR ");
                A0A4.append("(");
                C18260x0.A0p("media_name", " LIKE '%", replace, "%' ESCAPE '\\' AND ", A0A4);
                A0A4.append("message_type");
                A0A4.append(" = '");
                A0A4.append(5);
                AnonymousClass001.A1K("') ", " OR ", "(", A0A4);
                AnonymousClass001.A1K("media_caption", " LIKE '%", replace, A0A4);
                AnonymousClass001.A1K("%' ESCAPE '\\' AND NOT ", "message_type", " = '", A0A4);
                A0A4.append(0);
                A0A4.append("') ");
                A0A4.append(")");
                StringBuilder A0A5 = C18330xA.A0A("   SELECT _id, sort_id FROM available_message_view WHERE chat_row_id = ?");
                A0A5.append(" AND ");
                A0A5.append(A0A4);
                AnonymousClass34U.A02(A0A5, z);
                String A0X = AnonymousClass000.A0X(" LIMIT 1", A0A5);
                C58592vV A002 = C58592vV.A00(-4);
                String[] A1Z = AnonymousClass0x9.A1Z();
                C56922sm.A02(r8.A08, r20, A1Z, 0);
                AnonymousClass0x2.A1S(A1Z, 1, A015);
                AnonymousClass4GK A033 = r8.A0F.get();
                try {
                    A0E = ((AnonymousClass3H0) A033).A03.A0E(A0X, "FIND_MESSAGE_FOR_JID_LIKE", A1Z);
                    if (A0E.moveToNext()) {
                        A002 = new C58592vV(1, AnonymousClass0x2.A0C(A0E, "sort_id"), C18270x1.A01(A0E));
                    }
                    A0E.close();
                    StringBuilder A0f = C18280x3.A0f(A033);
                    A0f.append("found: ");
                    A014.A08(AnonymousClass001.A0k(A0f, r1.A01));
                    A014.A07();
                } catch (Throwable th) {
                    try {
                        A033.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            }
        }
        long j = r1.A01;
        if (j > 0) {
            C66543Lv r22 = this.A05;
            C95814uZ r3 = this.A08;
            this.A02 = r22.A0B(r3, 100, r22.A1P.A04(r3, 100, j, -1), -1, true);
            this.A03 = C55122pp.A00(this.A0B, j);
            this.A00 = this.A07.A03(r3, this.A02.A02, r1.A02);
            Cursor cursor = this.A02.A00;
            if (cursor != null) {
                this.A02.A00.moveToPosition(Math.max(0, (cursor.getCount() - this.A00) - 50));
            }
        }
        if (this.A01 != 1) {
            return null;
        }
        C89654ea.A4P(elapsedRealtime, 300);
        return null;
        throw th;
    }
}
