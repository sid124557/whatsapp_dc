package X;

import com.whatsapp.community.CommunityDeleteDialogFragment;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: X.1t7  reason: invalid class name */
public class AnonymousClass1t7 extends AnonymousClass5ZM {
    public final /* synthetic */ long A00;
    public final /* synthetic */ CommunityDeleteDialogFragment A01;
    public final /* synthetic */ WeakReference A02;
    public final /* synthetic */ List A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1t7(C15910sA r2, CommunityDeleteDialogFragment communityDeleteDialogFragment, WeakReference weakReference, List list, long j) {
        super(r2, true);
        this.A01 = communityDeleteDialogFragment;
        this.A03 = list;
        this.A00 = j;
        this.A02 = weakReference;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        for (Object next : this.A03) {
            C621033m r1 = this.A01.A01;
            C626936e.A06(next);
            r1.A0K((C95814uZ) next, true);
        }
        C89654ea.A4P(this.A00, 300);
        return null;
    }

    public void A0C(Object obj) {
        C89654ea A0F = C18320x8.A0F(this.A02);
        if (A0F != null && !A0F.isFinishing()) {
            A0F.BjL();
        }
        this.A01.A06.A09(0);
    }
}
