package com.whatsapp.group;

import X.AnonymousClass34R;
import X.AnonymousClass4SG;
import X.AnonymousClass68W;
import X.C107695bk;
import X.C172878Nf;
import X.C27991fJ;
import X.C56892sj;
import X.C56972sr;
import X.C60842zG;
import X.C64333Db;
import X.C86614Ku;
import X.C86664Kz;
import X.C88834as;
import X.C89634eX;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;

public class EditGroupAdminsSelector extends C89634eX {
    public C56892sj A00;
    public boolean A01;

    public void A5r() {
        if (!this.A01) {
            this.A01 = true;
            C88834as A2W = AnonymousClass4SG.A2W(this);
            C64333Db r2 = A2W.A4Z;
            AnonymousClass4SG.A3W(r2, this);
            C107695bk r1 = r2.A00;
            AnonymousClass4SG.A3Q(r2, r1, this, AnonymousClass4SG.A2t(r2, r1, this));
            AnonymousClass4SG.A3T(r2, r1, this);
            AnonymousClass4SG.A3M(A2W, r2, this, r2.A6O.get());
            this.A00 = C64333Db.A3G(r2);
        }
    }

    public EditGroupAdminsSelector(int i) {
        this.A01 = false;
        AnonymousClass68W.A00(this, 59);
    }

    public void A7U(ArrayList arrayList) {
        C27991fJ A04 = AnonymousClass34R.A04(C86664Kz.A1J(getIntent(), "gid"));
        if (A04 != null) {
            C172878Nf it = C56892sj.A01(this.A00, A04).A04().iterator();
            while (it.hasNext()) {
                C60842zG r1 = (C60842zG) it.next();
                C56972sr r0 = this.A01;
                UserJid userJid = r1.A03;
                if (!r0.A0a(userJid) && r1.A01 != 2) {
                    C86614Ku.A1P(this.A0B, userJid, arrayList);
                }
            }
        }
    }

    public EditGroupAdminsSelector() {
        this(0);
    }
}
