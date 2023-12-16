package X;

import com.whatsapp.conversationslist.LeaveGroupsDialogFragment;
import com.whatsapp.dialogs.ProgressDialogFragment;
import java.util.Set;

/* renamed from: X.5gC  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C110415gC implements C15630rg {
    public final /* synthetic */ C08270df A00;
    public final /* synthetic */ ProgressDialogFragment A01;
    public final /* synthetic */ Set A02;

    public final Object apply(Object obj) {
        ProgressDialogFragment progressDialogFragment = this.A01;
        Set set = this.A02;
        C08270df r1 = this.A00;
        C101985Ha r10 = (C101985Ha) obj;
        progressDialogFragment.A1V();
        LeaveGroupsDialogFragment.A00(r10.A01, (String) null, set, r10.A00, 1, false, true).A1O(r1, (String) null);
        return null;
    }

    public /* synthetic */ C110415gC(C08270df r1, ProgressDialogFragment progressDialogFragment, Set set) {
        this.A01 = progressDialogFragment;
        this.A02 = set;
        this.A00 = r1;
    }
}
