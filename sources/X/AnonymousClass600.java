package X;

import com.whatsapp.R;
import com.whatsapp.businessdirectory.view.activity.BusinessDirectoryMapViewActivity;

/* renamed from: X.600  reason: invalid class name */
public final class AnonymousClass600 extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ BusinessDirectoryMapViewActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass600(BusinessDirectoryMapViewActivity businessDirectoryMapViewActivity) {
        super(1);
        this.this$0 = businessDirectoryMapViewActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass043 r0;
        BusinessDirectoryMapViewActivity businessDirectoryMapViewActivity = this.this$0;
        int A07 = C86644Kx.A07((Number) obj);
        if (A07 == 0) {
            AnonymousClass043 r02 = businessDirectoryMapViewActivity.A06;
            if (r02 != null) {
                r02.dismiss();
            }
            C19340zH A00 = AnonymousClass5V0.A00(businessDirectoryMapViewActivity);
            A00.A0U(R.string.f11nameremoved);
            A00.A0T(R.string.f11nameremoved);
            A00.A0Y(new AnonymousClass69T(A00, 2, businessDirectoryMapViewActivity), R.string.f11nameremoved);
            A00.A0W(new AnonymousClass69T(A00, 3, businessDirectoryMapViewActivity), R.string.f11nameremoved);
            businessDirectoryMapViewActivity.A06 = A00.A0S();
        } else if (A07 == 1 && (r0 = businessDirectoryMapViewActivity.A06) != null) {
            r0.dismiss();
        }
        return C59022wD.A00;
    }
}
