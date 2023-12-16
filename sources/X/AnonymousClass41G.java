package X;

import com.whatsapp.businessdirectory.view.fragment.BusinessDirectoryPopularApiBusinessesFragment;
import java.util.List;

/* renamed from: X.41G  reason: invalid class name */
public final class AnonymousClass41G extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ BusinessDirectoryPopularApiBusinessesFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass41G(BusinessDirectoryPopularApiBusinessesFragment businessDirectoryPopularApiBusinessesFragment) {
        super(1);
        this.this$0 = businessDirectoryPopularApiBusinessesFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        List list = (List) obj;
        AnonymousClass4WE r0 = this.this$0.A02;
        if (r0 != null) {
            r0.A0L(list);
            return C59022wD.A00;
        }
        throw C18270x1.A0S("directoryListAdapter");
    }
}
