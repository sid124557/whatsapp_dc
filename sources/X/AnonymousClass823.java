package X;

import android.widget.ImageView;
import com.whatsapp.businessdirectory.view.activity.BusinessDirectorySERPMapViewActivity;

/* renamed from: X.823  reason: invalid class name */
public final class AnonymousClass823 implements C183698qT {
    public final /* synthetic */ BusinessDirectorySERPMapViewActivity A00;
    public final /* synthetic */ C152307Yj A01;

    public AnonymousClass823(BusinessDirectorySERPMapViewActivity businessDirectorySERPMapViewActivity, C152307Yj r2) {
        this.A01 = r2;
        this.A00 = businessDirectorySERPMapViewActivity;
    }

    public void BOO() {
    }

    public void BTW() {
        if (this.A01.A02) {
            BusinessDirectorySERPMapViewActivity businessDirectorySERPMapViewActivity = this.A00;
            ImageView imageView = businessDirectorySERPMapViewActivity.A00;
            if (imageView == null) {
                throw C18270x1.A0S("myLocationBtn");
            }
            imageView.post(new C117125rQ(businessDirectorySERPMapViewActivity, 28));
        }
    }
}
