package X;

import android.database.Cursor;
import com.whatsapp.data.FMessageCommentInfoLazyLoader$getParentMessageCommentInfo$1;

/* renamed from: X.3Mx  reason: invalid class name and case insensitive filesystem */
public final class C66823Mx implements C84554Cu {
    public final C56972sr A00;
    public final AnonymousClass4F4 A01;
    public final C56982ss A02;
    public final C53612nN A03;
    public final C61142zm A04;
    public final AnonymousClass1VX A05;
    public final C55832qz A06;

    public C66823Mx(C56972sr r1, AnonymousClass4F4 r2, C56982ss r3, C53612nN r4, C61142zm r5, AnonymousClass1VX r6, C55832qz r7) {
        C18260x0.A0f(r6, r1, r3, r7, r5);
        C18260x0.A0U(r2, r4);
        this.A05 = r6;
        this.A00 = r1;
        this.A02 = r3;
        this.A06 = r7;
        this.A04 = r5;
        this.A01 = r2;
        this.A03 = r4;
    }

    public void BJr(C51692kE r7, C624134x r8) {
        C55162pu r3;
        Cursor A0E;
        C624134x A002;
        C95814uZ A0o;
        C18260x0.A0O(r8, r7);
        if (BLR(r7, r8)) {
            if (C624134x.A0g(r8)) {
                AnonymousClass4GK A032 = this.A04.A00.get();
                try {
                    C56862sg r4 = ((AnonymousClass3H0) A032).A03;
                    String[] A1Y = AnonymousClass0x9.A1Y();
                    C18260x0.A1X(A1Y, r8.A1L);
                    A0E = r4.A0E("\n          SELECT parent_message_row_id\n          FROM message_comment\n          WHERE message_row_id = ?    \n        ", "SELECT_PARENT_MESSAGE_FOR_COMMENT_QUERY_ID", A1Y);
                    Long l = null;
                    if (A0E.moveToNext()) {
                        int columnIndexOrThrow = A0E.getColumnIndexOrThrow("parent_message_row_id");
                        if (!A0E.isNull(columnIndexOrThrow)) {
                            l = C18280x3.A0T(A0E, columnIndexOrThrow);
                        }
                    }
                    A0E.close();
                    A032.close();
                    if (!(l == null || (A002 = C55122pp.A00(this.A06, l.longValue())) == null)) {
                        AnonymousClass2z0 r1 = A002.A1J;
                        if (r1.A02) {
                            A0o = C56972sr.A04(this.A00);
                        } else {
                            A0o = A002.A0o();
                        }
                        r3 = new C30211m5(new C52042kn(A0o, r1), A002.A1L);
                    }
                    r3 = null;
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
                if (r8.A1r(16)) {
                    this.A03.A01(r8);
                    C55162pu A0t = r8.A0t();
                    if (r8.A1r(16) && (A0t == null || A0t.A01() < 1)) {
                        C380725l.A00(C72553du.A00, new FMessageCommentInfoLazyLoader$getParentMessageCommentInfo$1(this, r8, (C84814Du) null));
                    }
                    r3 = r8.A0t();
                }
                r3 = null;
            }
            r8.A1N(r3);
            return;
        }
        return;
        throw th;
    }

    public boolean BLR(C51692kE r4, C624134x r5) {
        C18260x0.A0O(r5, r4);
        if (r4.A00.contains(C370920x.SKIP_COMMENT_INFO) || !this.A05.A0Y(C58422vE.A02, 5141) || !this.A02.A0N(r5.A1J.A00) || r5.A0t() != null) {
            return false;
        }
        if (r5.A1r(16) || C624134x.A0g(r5)) {
            return true;
        }
        return false;
    }
}
