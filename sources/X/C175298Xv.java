package X;

import com.whatsapp.businessdirectory.view.activity.BusinessDirectoryMapViewActivity;
import java.util.List;

/* renamed from: X.8Xv  reason: invalid class name and case insensitive filesystem */
public final class C175298Xv extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ BusinessDirectoryMapViewActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C175298Xv(BusinessDirectoryMapViewActivity businessDirectoryMapViewActivity) {
        super(1);
        this.this$0 = businessDirectoryMapViewActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        List list = (List) obj;
        AnonymousClass4W6 r0 = this.this$0.A0G;
        if (r0 != null) {
            r0.A0L(list);
            return C59022wD.A00;
        }
        throw C18270x1.A0S("filterAdapter");
    }
}
