package X;

import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.businessdirectory.view.activity.BusinessDirectoryMapViewActivity;

/* renamed from: X.6kK  reason: invalid class name and case insensitive filesystem */
public final class C135226kK extends C95874ug {
    public final /* synthetic */ BusinessDirectoryMapViewActivity A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C135226kK(C150067Pa r1, BusinessDirectoryMapViewActivity businessDirectoryMapViewActivity) {
        super(businessDirectoryMapViewActivity, r1);
        this.A00 = businessDirectoryMapViewActivity;
    }

    public void A0L(int i) {
        ImageView imageView = this.A00.A05;
        if (imageView == null) {
            throw C18270x1.A0S("myLocationBtn");
        }
        imageView.setImageResource(R.drawable.btn_myl);
    }
}
