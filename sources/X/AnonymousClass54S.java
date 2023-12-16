package X;

import com.whatsapp.R;
import com.whatsapp.status.playback.MyStatusesActivity;
import com.whatsapp.util.Log;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.54S  reason: invalid class name */
public class AnonymousClass54S extends AnonymousClass5ZM {
    public final /* synthetic */ MyStatusesActivity A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass54S(MyStatusesActivity myStatusesActivity) {
        super(myStatusesActivity, true);
        this.A00 = myStatusesActivity;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        MyStatusesActivity myStatusesActivity = this.A00;
        List A01 = myStatusesActivity.A0J.A01(AnonymousClass1fY.A00);
        if (myStatusesActivity.A0j.A00()) {
            ((C54592oy) myStatusesActivity.A0l.get()).A01();
        }
        myStatusesActivity.A0k.get();
        Collections.reverse(A01);
        Iterator it = A01.iterator();
        while (it.hasNext()) {
            C624134x A0T = C18300x5.A0T(it);
            if (A0T instanceof C30721mu) {
                myStatusesActivity.A0M.A01((C30721mu) A0T);
            }
        }
        return A01;
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        List list = (List) obj;
        StringBuilder A0o = AnonymousClass001.A0o();
        AnonymousClass000.A1H("mystatuses/loaded ", A0o, list);
        C18260x0.A1L(A0o, " messages");
        if (list.isEmpty()) {
            this.A00.finish();
            Log.i("MyStatusesActivity/maybeRedirectToHomeActivityWithStatusView ");
            return;
        }
        MyStatusesActivity myStatusesActivity = this.A00;
        AnonymousClass4OU r0 = myStatusesActivity.A0Z;
        r0.A00 = list;
        r0.notifyDataSetChanged();
        myStatusesActivity.A76();
        myStatusesActivity.A0S.A00();
        C86604Kt.A1L(myStatusesActivity, R.id.progress);
    }
}
