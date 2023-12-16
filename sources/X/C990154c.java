package X;

import com.whatsapp.status.playback.MyStatusesActivity;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.54c  reason: invalid class name and case insensitive filesystem */
public class C990154c extends AnonymousClass5ZM {
    public final C624134x A00;
    public final /* synthetic */ MyStatusesActivity A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C990154c(C624134x r2, MyStatusesActivity myStatusesActivity) {
        super(myStatusesActivity, true);
        this.A01 = myStatusesActivity;
        this.A00 = r2;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        Iterator A10 = C18290x4.A10(this.A01.A0I.A00(this.A00).A00);
        int i = 0;
        while (A10.hasNext()) {
            if (((C60722z3) A10.next()).A01(13) > 0) {
                i++;
            }
        }
        return Integer.valueOf(i);
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        MyStatusesActivity myStatusesActivity = this.A01;
        HashMap hashMap = myStatusesActivity.A0y;
        AnonymousClass2z0 r1 = this.A00.A1J;
        hashMap.put(r1, obj);
        myStatusesActivity.A0z.remove(r1);
        myStatusesActivity.A0Z.notifyDataSetChanged();
    }
}
