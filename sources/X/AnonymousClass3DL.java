package X;

import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: X.3DL  reason: invalid class name */
public final class AnonymousClass3DL implements AnonymousClass66U {
    public final C49712gy A00;
    public final C64773Ex A01;
    public final AnonymousClass33p A02;
    public final C56892sj A03;
    public final AnonymousClass1VX A04;

    public final void A00(Set set) {
        C162457s7.A0J(set, 0);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            GroupJid groupJid = (GroupJid) it.next();
            AnonymousClass3ZH A09 = this.A01.A09(groupJid);
            if (A09 != null && A09.A13 && this.A03.A0D(groupJid)) {
                C162457s7.A0J(groupJid, 0);
                this.A00.A02(new AnonymousClass47H(groupJid.getRawString()));
            }
        }
    }

    public String BDW() {
        return AnonymousClass0x9.A1E(AnonymousClass3DL.class).toString();
    }

    public void BMe() {
        AnonymousClass33p r5 = this.A02;
        int i = AnonymousClass0x2.A0F(r5).getInt("group_join_request_startup_sync_count", 0);
        int A0O = this.A04.A0O(C58422vE.A02, 2868);
        if (i < A0O) {
            Log.i("GroupMembershipApprovalRequestsManager/ starting jobs to reSync pending membership approval requests for all eligible groups.");
            C18260x0.A0L(r5, "group_join_request_startup_sync_count", A0O);
            LinkedHashSet A17 = AnonymousClass0x9.A17();
            Iterator it = C73723fy.A0C(this.A01.A05.A0C()).iterator();
            while (it.hasNext()) {
                Jid A042 = AnonymousClass3ZH.A04(C18310x6.A0R(it));
                if (A042 != null) {
                    A17.add(A042);
                }
            }
            A00(A17);
        }
    }

    public AnonymousClass3DL(C49712gy r1, C64773Ex r2, AnonymousClass33p r3, C56892sj r4, AnonymousClass1VX r5) {
        C18260x0.A0f(r5, r1, r3, r2, r4);
        this.A04 = r5;
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
        this.A03 = r4;
    }

    public /* synthetic */ void BMd() {
    }
}
