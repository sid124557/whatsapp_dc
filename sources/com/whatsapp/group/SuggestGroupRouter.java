package com.whatsapp.group;

import X.AnonymousClass0O1;
import X.AnonymousClass0x2;
import X.AnonymousClass2C4;
import X.AnonymousClass2D2;
import X.AnonymousClass340;
import X.AnonymousClass46Q;
import X.AnonymousClass4C6;
import X.AnonymousClass4KP;
import X.AnonymousClass58H;
import X.AnonymousClass66R;
import X.C003203q;
import X.C003403v;
import X.C154517dI;
import X.C18270x1;
import X.C18290x4;
import X.C18320x8;
import X.C38972Ae;
import X.C43742Th;
import X.C615931l;
import X.C620633i;
import X.C64333Db;
import X.C69263Wi;
import X.C80743yj;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManager;
import com.whatsapp.jid.Jid;

public final class SuggestGroupRouter extends Hilt_SuggestGroupRouter {
    public AnonymousClass2D2 A00;
    public final AnonymousClass66R A01 = AnonymousClass340.A03(this, "entry_point", -1);
    public final AnonymousClass66R A02 = C154517dI.A00(AnonymousClass58H.NONE, new C80743yj(this));

    public void A0p(Bundle bundle) {
        super.A0p(bundle);
        if (bundle == null) {
            C18270x1.A0p(this.A0B);
            AnonymousClass2D2 r0 = this.A00;
            if (r0 != null) {
                Context A0G = A0G();
                C003203q A0R = A0R();
                C64333Db r1 = r0.A00.A04;
                C69263Wi A04 = C64333Db.A04(r1);
                C620633i A2o = C64333Db.A2o(r1);
                CreateSubGroupSuggestionProtocolHelper ALv = r1.A00.ALv();
                AnonymousClass4C6 r13 = C38972Ae.A00;
                C615931l.A00(r13);
                AnonymousClass46Q r12 = AnonymousClass2C4.A02;
                C615931l.A00(r12);
                C43742Th r4 = new C43742Th(A0R, A0G, this, A04, (MemberSuggestedGroupsManager) r1.AKB.get(), A2o, ALv, r12, r13);
                r4.A00 = r4.A03.Bid(new AnonymousClass4KP(r4, 4), new C003403v());
                Context A0G2 = A0G();
                Intent A07 = C18320x8.A07();
                A07.setClassName(A0G2.getPackageName(), "com.whatsapp.group.newgroup.NewGroup");
                A07.putExtra("entry_point", AnonymousClass0x2.A09(this.A01));
                A07.putExtra("parent_group_jid_to_link", C18290x4.A0n((Jid) this.A02.getValue()));
                AnonymousClass0O1 r02 = r4.A00;
                if (r02 != null) {
                    r02.A01(A07);
                    return;
                }
                throw C18270x1.A0S("suggestGroup");
            }
            throw C18270x1.A0S("suggestGroupResultHandlerFactory");
        }
    }
}
