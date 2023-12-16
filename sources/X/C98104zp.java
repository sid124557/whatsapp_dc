package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.whatsapp.R;

/* renamed from: X.4zp  reason: invalid class name and case insensitive filesystem */
public abstract class C98104zp extends C98174zw {
    public CharSequence A04(AnonymousClass3ZH r6, C624134x r7) {
        Drawable A01;
        Context context;
        int i;
        String string;
        C95814uZ r1;
        if ((r6 == null || (r1 = r6.A0H) == null || this.A01.A0a(r1)) && !r7.A1J.A02) {
            return "";
        }
        CharSequence A00 = AnonymousClass4Qv.A00(r6, r7, this);
        if (this instanceof C98004zf) {
            A01 = AnonymousClass5YN.A00(getContext(), (C30721mu) r7);
        } else {
            boolean z = this instanceof C97974zc;
            if (z) {
                C30721mu r12 = (C30721mu) r7;
                C162457s7.A0J(r12, 0);
                A01 = AnonymousClass5YN.A00(getContext(), r12);
                C162457s7.A0D(A01);
            } else if (this instanceof C98014zg) {
                int i2 = R.drawable.ic_inline_live_location;
                if (r7 instanceof AnonymousClass1n9) {
                    i2 = R.drawable.msg_status_location;
                }
                A01 = C107335b8.A01(getContext(), i2);
            } else {
                boolean z2 = this instanceof C97994ze;
                Context context2 = getContext();
                if (z2) {
                    A01 = C107335b8.A01(context2, R.drawable.msg_status_contact);
                } else {
                    A01 = C107335b8.A01(context2, R.drawable.msg_status_audio);
                }
            }
            if (z) {
                C30721mu r72 = (C30721mu) r7;
                C162457s7.A0J(r72, 0);
                C620733j r4 = this.A06;
                if (C627636p.A0z(r72) || C627636p.A10(r72)) {
                    string = C107565bW.A0G(r4, r72);
                } else if (r72.A0B != 0) {
                    string = C107565bW.A0G(r4, r72);
                } else {
                    string = AnonymousClass35V.A03(r4, r72.A00);
                }
                C162457s7.A0D(string);
            } else {
                if (this instanceof C98014zg) {
                    string = getContext().getString(R.string.f11nameremoved);
                    if (r7 instanceof AnonymousClass1n9) {
                        context = getContext();
                        i = R.string.f11nameremoved;
                    }
                } else if (this instanceof C97994ze) {
                    context = getContext();
                    i = R.string.f11nameremoved;
                }
                string = context.getString(i);
            }
            return C106795aB.A02(A00, C87044Mw.A01(this.A01.getPaint(), A01, string));
        }
        C30721mu r73 = (C30721mu) r7;
        C620733j r42 = this.A06;
        if (C627636p.A0z(r73) || C627636p.A10(r73)) {
            string = C107565bW.A0G(r42, r73);
            return C106795aB.A02(A00, C87044Mw.A01(this.A01.getPaint(), A01, string));
        }
        if (r73.A0B != 0) {
            string = C107565bW.A0G(r42, r73);
        } else {
            string = AnonymousClass35V.A03(r42, r73.A00);
        }
        return C106795aB.A02(A00, C87044Mw.A01(this.A01.getPaint(), A01, string));
    }

    public C98104zp(Context context, C103445Mz r2) {
        super(context, r2);
    }
}
