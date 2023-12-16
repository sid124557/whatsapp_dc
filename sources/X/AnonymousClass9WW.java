package X;

import android.content.Context;
import android.content.DialogInterface;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.9WW  reason: invalid class name */
public class AnonymousClass9WW {
    public final C69263Wi A00;
    public final C621033m A01;
    public final AnonymousClass1VX A02;
    public final AnonymousClass9U5 A03;
    public final C45022Yj A04;
    public final C55832qz A05;
    public final AnonymousClass4FS A06;

    public final C30481mW A03(C95814uZ r10, UserJid userJid, String str, List list, long j) {
        C624134x r3;
        C45022Yj r1 = this.A04;
        C95814uZ r2 = r10;
        C626936e.A06(r10);
        AnonymousClass3YM r4 = new AnonymousClass3YM();
        if (j != 0) {
            r3 = this.A05.A02.A01(j);
        } else {
            r3 = null;
        }
        C30481mW A002 = r1.A00(r2, r3, r4, str, list, 0);
        if (C627336j.A0K(r10) && userJid != null) {
            A002.A1J(userJid);
        }
        return A002;
    }

    public final boolean A05(AnonymousClass9PL r3) {
        int i;
        if (!this.A02.A0X(1084) || (i = r3.A00) == 7 || i == 1) {
            return false;
        }
        return true;
    }

    public AnonymousClass9WW(C69263Wi r1, C621033m r2, AnonymousClass1VX r3, AnonymousClass9U5 r4, C45022Yj r5, C55832qz r6, AnonymousClass4FS r7) {
        this.A02 = r3;
        this.A00 = r1;
        this.A06 = r7;
        this.A01 = r2;
        this.A05 = r6;
        this.A04 = r5;
        this.A03 = r4;
    }

    public static final void A00(Context context, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2) {
        C19340zH A002 = AnonymousClass5V0.A00(context);
        A002.A0U(R.string.f11nameremoved);
        A002.A0T(R.string.f11nameremoved);
        A002.A0Y(onClickListener, R.string.f11nameremoved);
        A002.A0W(onClickListener2, R.string.f11nameremoved);
        C18280x3.A0q(A002);
    }

    public static final void A01(Context context, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2) {
        C19340zH A002 = AnonymousClass5V0.A00(context);
        A002.A0U(R.string.f11nameremoved);
        A002.A0T(R.string.f11nameremoved);
        A002.A0Y(onClickListener, R.string.f11nameremoved);
        A002.A0W(onClickListener2, R.string.f11nameremoved);
        C18280x3.A0q(A002);
    }

    public static final void A02(Context context, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2) {
        C19340zH A002 = AnonymousClass5V0.A00(context);
        A002.A0U(R.string.f11nameremoved);
        A002.A0T(R.string.f11nameremoved);
        A002.A0Y(onClickListener, R.string.f11nameremoved);
        A002.A0W(onClickListener2, R.string.f11nameremoved);
        C18280x3.A0q(A002);
    }

    public void A04(Context context, AnonymousClass39Q r27, AnonymousClass39R r28, C95814uZ r29, UserJid userJid, AnonymousClass9PL r31, C203749oF r32, String str, List list, long j) {
        C203749oF r9 = r32;
        UserJid userJid2 = userJid;
        r9.BjL();
        AnonymousClass9PL r3 = r31;
        Context context2 = context;
        if (r3.A01 != 5) {
            if (!this.A02.A0X(1084) || r3.A00 != 5) {
                int i = r3.A01;
                AnonymousClass39Q r5 = r27;
                C95814uZ r7 = r29;
                String str2 = str;
                List list2 = list;
                long j2 = j;
                if (i == 1 || i == 6 || !A05(r3)) {
                    int i2 = r3.A01;
                    AnonymousClass39R r6 = r28;
                    if (i2 != 1 && i2 != 6) {
                        A02(context2, new AnonymousClass9X8(r5, r6, r7, userJid2, r9, this, str2, list2, j2), new C204219p0(r9, 93));
                        return;
                    } else if (A05(r3)) {
                        A00(context2, new AnonymousClass9X6(r5, r7, userJid2, r3, r9, this), new C204219p0(r9, 86));
                        return;
                    } else {
                        AnonymousClass1nE r2 = r3.A03;
                        C626936e.A06(r2);
                        AnonymousClass9U5 r1 = this.A03;
                        if (!C627336j.A0K(r7)) {
                            userJid2 = AnonymousClass32Y.A03(r7);
                        }
                        r1.A0K(r5, r6, userJid2, r2);
                        this.A00.A0S(new C201279jo(r3, r9, this, r2));
                        return;
                    }
                } else {
                    A01(context2, new AnonymousClass9X7(r5, r7, userJid2, r9, this, str2, list2, j2), new C204219p0(r9, 92));
                    return;
                }
            }
        }
        C19340zH A002 = AnonymousClass5V0.A00(context2);
        boolean A022 = C29441ip.A02(context2);
        int i3 = R.string.f11nameremoved;
        if (A022) {
            i3 = R.string.f11nameremoved;
        }
        A002.A0T(i3);
        C19340zH.A06(A002);
        C18280x3.A0q(A002);
    }
}
