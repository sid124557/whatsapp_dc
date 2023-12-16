package com.whatsapp.group;

import X.AnonymousClass0O1;
import X.AnonymousClass0x2;
import X.AnonymousClass0x9;
import X.AnonymousClass1VX;
import X.AnonymousClass340;
import X.AnonymousClass42V;
import X.AnonymousClass4KP;
import X.AnonymousClass58H;
import X.AnonymousClass66R;
import X.C003203q;
import X.C003403v;
import X.C154517dI;
import X.C18270x1;
import X.C18290x4;
import X.C18320x8;
import X.C27991fJ;
import X.C28891hw;
import X.C29441ip;
import X.C39692Cy;
import X.C47602dW;
import X.C56892sj;
import X.C56982ss;
import X.C64333Db;
import X.C66493Lq;
import X.C78683vP;
import X.C80663yb;
import X.C80673yc;
import X.C80683yd;
import X.C89654ea;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import java.util.List;

public final class AddMembersRouter extends Hilt_AddMembersRouter {
    public C39692Cy A00;
    public C56982ss A01;
    public final AnonymousClass66R A02 = AnonymousClass340.A03(this, "entry_point", 6);
    public final AnonymousClass66R A03;
    public final AnonymousClass66R A04 = AnonymousClass340.A00(this, "is_cag_and_community_add");
    public final AnonymousClass66R A05;
    public final AnonymousClass66R A06 = AnonymousClass340.A03(this, "request_invite_members", 1);
    public final AnonymousClass66R A07;

    public void A0p(Bundle bundle) {
        super.A0p(bundle);
        if (bundle == null) {
            C18270x1.A0p(this.A0B);
            C39692Cy r5 = this.A00;
            if (r5 != null) {
                Context A0G = A0G();
                C003203q A0R = A0R();
                AnonymousClass0x9.A1L(A0R);
                int A09 = AnonymousClass0x2.A09(this.A06);
                boolean A1V = C18270x1.A1V(this.A04);
                int A092 = AnonymousClass0x2.A09(this.A02);
                C78683vP r4 = new C78683vP(this);
                AnonymousClass42V r3 = new AnonymousClass42V(this);
                C64333Db r52 = r5.A00.A04;
                C56892sj A3G = C64333Db.A3G(r52);
                C29441ip A24 = C64333Db.A24(r52);
                C66493Lq AnO = r52.AnO();
                AnonymousClass1VX A4B = C64333Db.A4B(r52);
                C28891hw A3C = C64333Db.A3C(r52);
                C47602dW r9 = new C47602dW(A0G, this, (C89654ea) A0R, C64333Db.A04(r52), A24, C64333Db.A26(r52), C64333Db.A39(r52), A3C, A3G, A4B, AnO, r52.AnR(), (C27991fJ) this.A03.getValue(), (C27991fJ) this.A05.getValue(), (List) this.A07.getValue(), r4, r3, A09, A092, A1V);
                r9.A00 = r9.A04.Bid(new AnonymousClass4KP(r9, 2), new C003403v());
                List list = r9.A0H;
                if (list.isEmpty()) {
                    AnonymousClass0O1 r6 = r9.A00;
                    if (r6 == null) {
                        throw C18270x1.A0S("addMembersCaller");
                    }
                    C56982ss r0 = r9.A09;
                    C27991fJ r8 = r9.A0G;
                    String A0D = r0.A0D(r8);
                    Context context = r9.A03;
                    C27991fJ r53 = r9.A0F;
                    boolean z = r9.A0K;
                    int i = r9.A01;
                    Intent className = C18320x8.A07().setClassName(context.getPackageName(), "com.whatsapp.contact.picker.AddGroupParticipantsSelector");
                    AnonymousClass0x2.A0u(className, r53, "gid");
                    className.putExtra("community_name", A0D);
                    className.putExtra("parent_group_jid_to_link", C18290x4.A0n(r8));
                    className.putExtra("is_cag_and_community_add", z);
                    className.putExtra("entry_point", i);
                    r6.A01(className);
                    return;
                }
                r9.A00(list);
                return;
            }
            throw C18270x1.A0S("addMembersResultHandlerFactory");
        }
    }

    public AddMembersRouter() {
        AnonymousClass58H r1 = AnonymousClass58H.NONE;
        this.A03 = C154517dI.A00(r1, new C80663yb(this));
        this.A05 = C154517dI.A00(r1, new C80673yc(this));
        this.A07 = C154517dI.A00(r1, new C80683yd(this));
    }
}
