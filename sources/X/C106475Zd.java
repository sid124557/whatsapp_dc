package X;

import android.content.Context;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;

/* renamed from: X.5Zd  reason: invalid class name and case insensitive filesystem */
public class C106475Zd {
    public static View.OnClickListener A00(Context context, C56972sr r10, C28071fd r11, C30801n8 r12, boolean z) {
        C30801n8 r3 = r12;
        UserJid A0o = r12.A0o();
        UserJid userJid = A0o;
        if (r12.A1J.A02) {
            userJid = null;
        }
        C56972sr r4 = r10;
        Context context2 = context;
        if (r10.A0Y()) {
            return new C109345eT(context, 28);
        }
        C28071fd r5 = r11;
        if (z) {
            return new AnonymousClass549(context, userJid, r12, r5, 2);
        }
        return new AnonymousClass54A(context2, r3, r4, r5, A0o, 0);
    }

    public static String A01(Context context, C56972sr r13, C56612sH r14, C620733j r15, C621233o r16, C30801n8 r17, boolean z) {
        int i;
        long A05;
        if (r13.A0Y()) {
            i = R.string.f11nameremoved;
        } else if (z) {
            C30801n8 r4 = r17;
            long j = r4.A0K + ((long) (r4.A00 * 1000));
            C621233o r1 = r16;
            if (r4.A1J.A02) {
                A05 = r1.A06(r4);
            } else {
                A05 = r1.A05(r4);
            }
            long A0I = r14.A0I(A05);
            Object[] objArr = new Object[1];
            if (A05 > r14.A0H()) {
                return C107145am.A01(r15, AnonymousClass002.A0F(context, C107145am.A00(r15, A0I), objArr, 0, R.string.f11nameremoved), A0I);
            }
            return C107145am.A01(r15, AnonymousClass002.A0F(context, C107145am.A00(r15, j), objArr, 0, R.string.f11nameremoved), j);
        } else {
            i = R.string.f11nameremoved;
        }
        return context.getString(i);
    }

    public static boolean A02(C56612sH r6, C30801n8 r7, long j) {
        long A0H = r6.A0H();
        long A0A = r7.A0K + C18290x4.A0A(r7.A00);
        if (!r7.A1J.A02) {
            if (j <= A0H) {
                return false;
            }
            return true;
        } else if ((j != -1 || A0A <= A0H) && j <= A0H) {
            return false;
        } else {
            return true;
        }
    }
}
