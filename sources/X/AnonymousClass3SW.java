package X;

import android.util.Pair;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3SW  reason: invalid class name */
public class AnonymousClass3SW implements AnonymousClass4EZ {
    public final AnonymousClass4EQ A00;

    public void BQs(String str) {
        C626435x r1 = (C626435x) this.A00;
        if (r1.A01 != 0) {
            Log.d("CreateCommunityManager/linkGroupsToParentGroup/timeout Failed to link a group");
            C59822xY r12 = (C59822xY) r1.A00;
            C59822xY.A00(r12, r12.A0I.decrementAndGet());
            return;
        }
        Log.e("LinkExistingGroupsUseCase/LinkSubgroupsProtocolHelper/timeout");
        ((C84814Du) r1.A00).BkD(new C27621eE(-2));
    }

    public AnonymousClass3SW(AnonymousClass4EQ r1) {
        this.A00 = r1;
    }

    public void BSN(AnonymousClass36K r3, String str) {
        this.A00.onError(C57492tj.A01(r3));
    }

    public void BdM(AnonymousClass36K r11, String str) {
        AnonymousClass36K A0l;
        AnonymousClass36K A0l2;
        if (!(AnonymousClass36K.A07(r11) == null || (A0l = r11.A0l("links")) == null || (A0l2 = A0l.A0l("link")) == null)) {
            List A0s = A0l2.A0s("group");
            if (A0s.size() != 0) {
                HashSet A0K = AnonymousClass002.A0K();
                HashSet A0K2 = AnonymousClass002.A0K();
                Iterator it = A0s.iterator();
                while (it.hasNext()) {
                    AnonymousClass36K A0Y = C18310x6.A0Y(it);
                    Jid A0g = A0Y.A0g(GroupJid.class, "jid");
                    if (A0g != null) {
                        AnonymousClass0x2.A1F(A0g, Integer.valueOf(A0Y.A0b("error", -1)), A0K);
                        Iterator A0M = AnonymousClass36K.A0M(A0Y, "participant");
                        while (A0M.hasNext()) {
                            AnonymousClass36K A0Y2 = C18310x6.A0Y(A0M);
                            Jid A0g2 = A0Y2.A0g(UserJid.class, "jid");
                            if (A0g2 != null) {
                                AnonymousClass0x2.A1F(A0g2, Integer.valueOf(A0Y2.A0b("error", -1)), A0K2);
                            }
                        }
                    }
                }
                AnonymousClass4EQ r4 = this.A00;
                C27651eH r1 = new C27651eH(A0K, A0K2);
                C626435x r42 = (C626435x) r4;
                if (r42.A01 != 0) {
                    ArrayList A0s2 = AnonymousClass001.A0s();
                    Iterator it2 = r1.A00.iterator();
                    while (it2.hasNext()) {
                        Pair A0D = AnonymousClass0x9.A0D(it2);
                        if (-1 == C18290x4.A03(A0D)) {
                            Object obj = A0D.first;
                            C626936e.A06(obj);
                            A0s2.add(obj);
                        }
                    }
                    Iterator it3 = A0s2.iterator();
                    while (it3.hasNext()) {
                        ((C59822xY) r42.A00).A0H.remove(it3.next());
                    }
                    C59822xY r12 = (C59822xY) r42.A00;
                    C59822xY.A00(r12, r12.A0I.decrementAndGet());
                    return;
                }
                Log.e("LinkExistingGroupsUseCase/LinkSubgroupsProtocolHelper/response");
                ((C84814Du) r42.A00).BkD(r1);
                return;
            }
        }
        this.A00.onError(-1);
    }
}
