package com.whatsapp.group;

import X.AnonymousClass0O1;
import X.AnonymousClass0x2;
import X.AnonymousClass0x9;
import X.AnonymousClass2D0;
import X.AnonymousClass2SJ;
import X.AnonymousClass340;
import X.AnonymousClass4KP;
import X.AnonymousClass58H;
import X.AnonymousClass66R;
import X.C003203q;
import X.C003403v;
import X.C154517dI;
import X.C18270x1;
import X.C18290x4;
import X.C18300x5;
import X.C18320x8;
import X.C59002wA;
import X.C627336j;
import X.C64333Db;
import X.C80583yT;
import X.C80713yg;
import X.C80723yh;
import X.C80733yi;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.whatsapp.jid.Jid;
import java.util.ArrayList;
import java.util.Collection;

public final class NewGroupRouter extends Hilt_NewGroupRouter {
    public static final C59002wA A0A = new C59002wA();
    public AnonymousClass2D0 A00;
    public final AnonymousClass66R A01;
    public final AnonymousClass66R A02 = AnonymousClass340.A00(this, "create_lazily");
    public final AnonymousClass66R A03 = AnonymousClass340.A00(this, "duplicate_ug_found");
    public final AnonymousClass66R A04 = AnonymousClass340.A03(this, "entry_point", -1);
    public final AnonymousClass66R A05;
    public final AnonymousClass66R A06;
    public final AnonymousClass66R A07 = AnonymousClass340.A00(this, "optional_participants");
    public final AnonymousClass66R A08;
    public final AnonymousClass66R A09;

    public void A0p(Bundle bundle) {
        super.A0p(bundle);
        if (bundle == null) {
            C18270x1.A0p(this.A0B);
            AnonymousClass2D0 r0 = this.A00;
            if (r0 != null) {
                Context A0G = A0G();
                C003203q A0R = A0R();
                C64333Db r02 = r0.A00.A04;
                AnonymousClass2SJ r4 = new AnonymousClass2SJ(A0R, A0G, this, C64333Db.A00(r02), C64333Db.A39(r02));
                r4.A00 = r4.A03.Bid(new AnonymousClass4KP(r4, 3), new C003403v());
                Context A0G2 = A0G();
                Intent A072 = C18320x8.A07();
                A072.setClassName(A0G2.getPackageName(), "com.whatsapp.group.newgroup.NewGroup");
                A072.putExtra("duplicate_ug_exists", C18270x1.A1V(this.A03));
                A072.putExtra("entry_point", AnonymousClass0x2.A09(this.A04));
                A072.putExtra("create_group_for_community", C18270x1.A1V(this.A02));
                A072.putExtra("optional_participants", C18270x1.A1V(this.A07));
                Collection collection = (Collection) this.A09.getValue();
                ArrayList A0u = C18300x5.A0u(collection);
                C627336j.A0H(collection, A0u);
                A072.putExtra("selected", A0u);
                A072.putExtra("parent_group_jid_to_link", C18290x4.A0n((Jid) this.A08.getValue()));
                A072.putExtra("messages_to_forward_bundle", (Bundle) this.A06.getValue());
                A072.putExtra("include_captions", C18270x1.A1V(this.A05));
                A072.putExtra("appended_message", AnonymousClass0x9.A13(this.A01));
                AnonymousClass0O1 r03 = r4.A00;
                if (r03 != null) {
                    r03.A01(A072);
                    return;
                }
                throw C18270x1.A0S("createGroup");
            }
            throw C18270x1.A0S("createGroupResultHandlerFactory");
        }
    }

    public NewGroupRouter() {
        AnonymousClass58H r2 = AnonymousClass58H.NONE;
        this.A09 = C154517dI.A00(r2, new C80733yi(this));
        this.A08 = C154517dI.A00(r2, new C80723yh(this));
        this.A06 = C154517dI.A00(r2, new C80713yg(this));
        this.A05 = AnonymousClass340.A00(this, "include_captions");
        this.A01 = C154517dI.A00(r2, new C80583yT(this, "appended_message"));
    }
}
