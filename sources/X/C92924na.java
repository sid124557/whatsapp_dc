package X;

import android.content.Context;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;

/* renamed from: X.4na  reason: invalid class name and case insensitive filesystem */
public class C92924na extends C93284oG {
    public boolean A00;

    public void A0v() {
        if (!this.A00) {
            this.A00 = true;
            C88864av A0C = C87094Nz.A0C(this);
            C64333Db r2 = A0C.A0K;
            C87094Nz.A0W(r2, this);
            C87094Nz.A0X(r2, this);
            C87094Nz.A0Y(r2, this);
            C87094Nz.A0Z(r2, this);
            C87094Nz.A0a(r2, this, C87094Nz.A0D(r2));
            C116985rC A0A = C87094Nz.A0A(r2, this);
            C87094Nz.A0R(r2, r2.A00, this);
            C87094Nz.A0M(A0A, r2, this, r2.A4V);
            C87094Nz.A0S(r2, A0C, this);
            C87094Nz.A0b(r2, this, C87094Nz.A0E(r2));
            C87094Nz.A0I(A0A, r2, A0C, this, C86604Kt.A0i(r2));
            C87094Nz.A0L(A0A, r2, this);
        }
    }

    public C92924na(Context context, AnonymousClass677 r2, C30961nV r3) {
        super(context, r2, r3);
        A0v();
    }

    public String getMessageString() {
        Context context;
        int i;
        UserJid userJid = ((C30961nV) getFMessage()).A00;
        if (this.A0Z.A0a(userJid)) {
            context = getContext();
            i = R.string.f11nameremoved;
        } else if (userJid == null) {
            context = getContext();
            i = R.string.f11nameremoved;
        } else {
            return AnonymousClass0x2.A0X(getContext(), this.A0v.A0W(C162197rQ.newArrayList((Object[]) new UserJid[]{userJid}), -1), 1, R.string.f11nameremoved);
        }
        return context.getString(i);
    }
}
