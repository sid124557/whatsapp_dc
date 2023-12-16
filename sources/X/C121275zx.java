package X;

import com.whatsapp.businessapisearch.view.fragment.BusinessApiBrowseFragment;
import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.5zx  reason: invalid class name and case insensitive filesystem */
public final class C121275zx extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ BusinessApiBrowseFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C121275zx(BusinessApiBrowseFragment businessApiBrowseFragment) {
        super(1);
        this.this$0 = businessApiBrowseFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        List<C136186lz> list = (List) obj;
        BusinessApiBrowseFragment businessApiBrowseFragment = this.this$0;
        C96244w3 r0 = businessApiBrowseFragment.A03;
        if (r0 != null) {
            r0.A0L(list);
            if (list == null) {
                Log.e("BusinessApiBrowseFragment/getTotalNumberOfBusinessProfileShown searchListItems cannot be null");
            } else {
                boolean z = C73723fy.A05(list) instanceof C96334wC;
                int size = list.size();
                if (!z) {
                    size--;
                }
                if (size != 0) {
                    AnonymousClass5ML r1 = businessApiBrowseFragment.A02;
                    if (r1 == null) {
                        throw C18270x1.A0S("businessApiSearchLoggingEligibility");
                    } else if (r1.A00(businessApiBrowseFragment.A06)) {
                        C104795Sj r4 = businessApiBrowseFragment.A04;
                        if (r4 != null) {
                            long j = (long) size;
                            int i = 0;
                            for (C136186lz r12 : list) {
                                if ((r12 instanceof C96334wC) && ((C96334wC) r12).A00.A08 == 2) {
                                    i++;
                                }
                            }
                            r4.A01(1, j, (long) i);
                        } else {
                            throw C18270x1.A0S("businessApiSearchAnalyticsManager");
                        }
                    }
                }
            }
            return C59022wD.A00;
        }
        throw C18270x1.A0S("listAdapter");
    }
}
