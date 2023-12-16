package X;

import com.whatsapp.jid.GroupJid;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.Callable;

/* renamed from: X.5si  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C117925si implements Callable {
    public final /* synthetic */ C95764uT A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ HashSet A02;

    public final Object call() {
        C95764uT r1 = this.A00;
        HashSet hashSet = this.A02;
        String str = this.A01;
        ArrayList A0J = AnonymousClass002.A0J(hashSet);
        return Integer.valueOf(((C112455jl) r1.A03).A03(r1.A05.A00, (GroupJid) null, (Integer) null, str, (String) null, A0J, 26, 0, false, false, false, false));
    }

    public /* synthetic */ C117925si(C95764uT r1, String str, HashSet hashSet) {
        this.A00 = r1;
        this.A02 = hashSet;
        this.A01 = str;
    }
}
