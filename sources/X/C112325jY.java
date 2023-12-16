package X;

import com.whatsapp.R;
import com.whatsapp.businessdirectory.view.activity.BusinessDirectoryMapViewActivity;

/* renamed from: X.5jY  reason: invalid class name and case insensitive filesystem */
public final class C112325jY implements C184218rR {
    public final /* synthetic */ BusinessDirectoryMapViewActivity A00;

    public C112325jY(BusinessDirectoryMapViewActivity businessDirectoryMapViewActivity) {
        this.A00 = businessDirectoryMapViewActivity;
    }

    public void BVn() {
        BusinessDirectoryMapViewActivity businessDirectoryMapViewActivity = this.A00;
        businessDirectoryMapViewActivity.A0V = true;
        AnonymousClass4U2 r0 = businessDirectoryMapViewActivity.A0N;
        if (r0 == null) {
            throw C86604Kt.A0j();
        }
        r0.A0V.A01(3);
        AnonymousClass4w0 r02 = businessDirectoryMapViewActivity.A0C;
        if (r02 != null) {
            r02.A02(true);
            AnonymousClass5UF A01 = AnonymousClass5UF.A01(businessDirectoryMapViewActivity);
            A01.A02 = R.string.f11nameremoved;
            businessDirectoryMapViewActivity.startActivityForResult(A01.A02(), 34);
            return;
        }
        throw C18270x1.A0S("businessDirectorySharedPrefs");
    }

    public void BVo() {
        BusinessDirectoryMapViewActivity businessDirectoryMapViewActivity = this.A00;
        AnonymousClass4U2 r0 = businessDirectoryMapViewActivity.A0N;
        if (r0 == null) {
            throw C18270x1.A0S("viewModel");
        }
        r0.A0V.A01(4);
        AnonymousClass4U2 r02 = businessDirectoryMapViewActivity.A0N;
        if (r02 == null) {
            throw C18270x1.A0S("viewModel");
        }
        r02.A0H();
    }
}
