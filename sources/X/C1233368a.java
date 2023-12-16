package X;

import android.view.animation.Animation;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.businessdirectory.view.activity.BusinessDirectorySERPMapViewActivity;

/* renamed from: X.68a  reason: invalid class name and case insensitive filesystem */
public class C1233368a implements Animation.AnimationListener {
    public Object A00;
    public final int A01;

    public C1233368a(BusinessDirectorySERPMapViewActivity businessDirectorySERPMapViewActivity, int i) {
        this.A01 = i;
        this.A00 = businessDirectorySERPMapViewActivity;
    }

    public void onAnimationEnd(Animation animation) {
        if (this.A01 != 0) {
            BusinessDirectorySERPMapViewActivity businessDirectorySERPMapViewActivity = (BusinessDirectorySERPMapViewActivity) this.A00;
            int dimensionPixelSize = businessDirectorySERPMapViewActivity.getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
            ImageView imageView = businessDirectorySERPMapViewActivity.A00;
            if (imageView == null) {
                throw C18270x1.A0S("myLocationBtn");
            }
            C106895aL.A01(imageView, new C158547k9(0, 0, dimensionPixelSize, dimensionPixelSize));
            RecyclerView recyclerView = businessDirectorySERPMapViewActivity.A02;
            if (recyclerView == null) {
                throw C18270x1.A0S("horizontalBusinessListView");
            }
            recyclerView.setVisibility(8);
            return;
        }
        BusinessDirectorySERPMapViewActivity businessDirectorySERPMapViewActivity2 = (BusinessDirectorySERPMapViewActivity) this.A00;
        int dimensionPixelSize2 = businessDirectorySERPMapViewActivity2.getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
        int dimensionPixelSize3 = businessDirectorySERPMapViewActivity2.getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
        ImageView imageView2 = businessDirectorySERPMapViewActivity2.A00;
        if (imageView2 == null) {
            throw C18270x1.A0S("myLocationBtn");
        }
        C106895aL.A01(imageView2, new C158547k9(0, 0, dimensionPixelSize2, dimensionPixelSize3));
    }

    public void onAnimationRepeat(Animation animation) {
    }

    public void onAnimationStart(Animation animation) {
    }
}
