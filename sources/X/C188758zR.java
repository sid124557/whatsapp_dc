package X;

import com.whatsapp.businessapisearch.view.fragment.BusinessApiBrowseFragment;
import com.whatsapp.businessdirectory.view.fragment.BusinessDirectorySearchFragment;

/* renamed from: X.8zR  reason: invalid class name and case insensitive filesystem */
public class C188758zR extends AnonymousClass0N7 {
    public Object A00;
    public final int A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C188758zR(Object obj, int i) {
        super(true);
        this.A01 = i;
        this.A00 = obj;
    }

    public void A00() {
        int i = this.A01;
        Object obj = this.A00;
        if (i != 0) {
            ((BusinessDirectorySearchFragment) obj).A0D.A0H();
        } else {
            ((BusinessApiBrowseFragment) obj).A1I().A74();
        }
    }
}
