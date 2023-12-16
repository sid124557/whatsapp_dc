package X;

import com.whatsapp.conversationslist.LeaveGroupsDialogFragment;
import com.whatsapp.jid.UserJid;
import com.whatsapp.status.viewmodels.StatusesViewModel;
import java.util.Collections;
import java.util.Set;

/* renamed from: X.6Ay  reason: invalid class name and case insensitive filesystem */
public class C124096Ay implements C15630rg {
    public Object A00;
    public Object A01;
    public final int A02;

    public C124096Ay(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    public final Object apply(Object obj) {
        int i = this.A02;
        Object obj2 = this.A00;
        if (i != 0) {
            return ((StatusesViewModel) obj2).A0D((UserJid) this.A01);
        }
        AnonymousClass4FU r1 = (AnonymousClass4FU) obj2;
        Object obj3 = this.A01;
        C101985Ha r10 = (C101985Ha) obj;
        r1.BjL();
        Set singleton = Collections.singleton(obj3);
        int i2 = r10.A00;
        C27991fJ r2 = r10.A01;
        int i3 = 0;
        if (r2 != null) {
            i3 = 2;
        }
        r1.Bon(LeaveGroupsDialogFragment.A00(r2, (String) null, singleton, i2, i3, false, true), (String) null);
        return null;
    }
}
