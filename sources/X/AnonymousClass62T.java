package X;

import com.whatsapp.status.StatusExpirationLifecycleOwner;
import com.whatsapp.updates.ui.UpdatesFragment;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.62T  reason: invalid class name */
public final class AnonymousClass62T extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ UpdatesFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass62T(UpdatesFragment updatesFragment) {
        super(1);
        this.this$0 = updatesFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass673 r1;
        C105765Wh r9 = (C105765Wh) obj;
        C162457s7.A0J(r9, 0);
        UpdatesFragment updatesFragment = this.this$0;
        List list = r9.A02;
        int size = list.size();
        Iterator it = list.iterator();
        long j = 0;
        while (it.hasNext()) {
            long A04 = C86664Kz.A19(it).A04();
            if (A04 < j) {
                A04 = j;
            }
            j = A04;
        }
        C003203q A0Q = updatesFragment.A0Q();
        if ((A0Q instanceof AnonymousClass673) && (r1 = (AnonymousClass673) A0Q) != null) {
            r1.Bs0(j, size);
        }
        StatusExpirationLifecycleOwner statusExpirationLifecycleOwner = updatesFragment.A0c;
        if (statusExpirationLifecycleOwner == null) {
            throw C18270x1.A0S("statusExpirationLifecycleOwner");
        }
        statusExpirationLifecycleOwner.A00();
        return C59022wD.A00;
    }
}
