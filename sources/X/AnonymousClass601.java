package X;

import com.whatsapp.businessdirectory.view.activity.BusinessDirectoryMapViewActivity;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.601  reason: invalid class name */
public final class AnonymousClass601 extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ BusinessDirectoryMapViewActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass601(BusinessDirectoryMapViewActivity businessDirectoryMapViewActivity) {
        super(1);
        this.this$0 = businessDirectoryMapViewActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Iterable iterable = (Iterable) obj;
        BusinessDirectoryMapViewActivity businessDirectoryMapViewActivity = this.this$0;
        C162457s7.A0H(iterable);
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            C109065e1 A0K = AnonymousClass4L0.A0K(it);
            Map map = businessDirectoryMapViewActivity.A0Y;
            AnonymousClass360.A02(map).remove(A0K.A0G);
        }
        return C59022wD.A00;
    }
}
