package X;

import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.2ml  reason: invalid class name and case insensitive filesystem */
public final class C53232ml {
    public final C65203Gp A00;
    public final AnonymousClass1On A01;
    public final AnonymousClass1P1 A02;
    public final AnonymousClass4FS A03;
    public final Map A04;

    public C53232ml(C65203Gp r9, AnonymousClass1On r10, AnonymousClass1P1 r11, AnonymousClass33p r12, AnonymousClass1VX r13, AnonymousClass4FS r14) {
        int A05 = C18300x5.A05(r13, r14, 1);
        C162457s7.A0J(r10, 3);
        C162457s7.A0J(r11, 4);
        C162457s7.A0J(r12, 5);
        C162457s7.A0J(r9, 6);
        this.A03 = r14;
        this.A01 = r10;
        this.A02 = r11;
        this.A00 = r9;
        AnonymousClass3Z6[] r4 = new AnonymousClass3Z6[6];
        AnonymousClass3Z6.A04("community_home", new AnonymousClass3RP(r12), r4);
        AnonymousClass3Z6.A09("community", new AnonymousClass3RU(r12, r13), r4, 1);
        AnonymousClass3Z6.A09("ephemeral", new AnonymousClass3RQ(r12), r4, A05);
        AnonymousClass3Z6.A09("ephemeral_view_once", new AnonymousClass3RR(r12), r4, 3);
        AnonymousClass3Z6.A09("ephemeral_view_once_receiver", new AnonymousClass3RS(r12), r4, 4);
        AnonymousClass3Z6.A09("newsletter_multi_admin", new AnonymousClass3RT(r12), r4, 5);
        this.A04 = C73813g7.A0G(r4);
        if (!this.A02.A0C()) {
            Log.d("T153214485: listening for sync updates");
            AnonymousClass1On r0 = this.A01;
            r0.A04.add(new AnonymousClass2HV(this));
        }
        if (!this.A02.A0C()) {
            this.A01.A00 = new AnonymousClass2HU(this);
        }
    }

    public final boolean A02(Object obj, String str) {
        C85064Eu r1;
        Object obj2 = this.A04.get(str);
        if ((obj2 instanceof C85064Eu) && (r1 = (C85064Eu) obj2) != null) {
            return r1.BFM(obj);
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Support for the nux key ");
        A0o.append(str);
        C18260x0.A1K(A0o, " has not been added yet.");
        return false;
    }

    public final Set A00() {
        Collection values = this.A04.values();
        ArrayList A0s = AnonymousClass001.A0s();
        for (Object next : values) {
            if (((C85064Eu) next).BFM((Object) null)) {
                A0s.add(next);
            }
        }
        ArrayList A0c = C73783g4.A0c(A0s);
        Iterator it = A0s.iterator();
        while (it.hasNext()) {
            A0c.add(((C85064Eu) it.next()).BA5());
        }
        return C73723fy.A0O(A0c);
    }

    public final void A01(String str, Object obj) {
        Object obj2 = this.A04.get(str);
        if (!(obj2 instanceof C85064Eu) || obj2 == null) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("Support for the nux key ");
            A0o.append(str);
            C18260x0.A1K(A0o, " has not been added yet.");
            return;
        }
        C70353aM.A00(this.A03, obj2, obj, this, 29);
    }
}
