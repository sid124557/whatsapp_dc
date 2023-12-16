package X;

import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import com.whatsapp.businessdirectory.view.activity.BusinessDirectorySERPMapViewActivity;

/* renamed from: X.609  reason: invalid class name */
public final class AnonymousClass609 extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ BusinessDirectorySERPMapViewActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass609(BusinessDirectorySERPMapViewActivity businessDirectorySERPMapViewActivity) {
        super(1);
        this.this$0 = businessDirectorySERPMapViewActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        CardView cardView;
        BusinessDirectorySERPMapViewActivity businessDirectorySERPMapViewActivity = this.this$0;
        int A07 = C86644Kx.A07((Number) obj);
        if (A07 == 0) {
            ViewGroup viewGroup = businessDirectorySERPMapViewActivity.A00;
            if (viewGroup == null) {
                throw C18270x1.A0S("progressBarContainer");
            }
            viewGroup.setVisibility(8);
            cardView = businessDirectorySERPMapViewActivity.A01;
            if (cardView == null) {
                throw C18270x1.A0S("mapViewChip");
            }
        } else if (A07 == 1 || A07 == 2) {
            ViewGroup viewGroup2 = businessDirectorySERPMapViewActivity.A00;
            if (viewGroup2 == null) {
                throw C18270x1.A0S("progressBarContainer");
            }
            viewGroup2.setVisibility(0);
            cardView = businessDirectorySERPMapViewActivity.A01;
            if (cardView == null) {
                throw C18270x1.A0S("mapViewChip");
            }
        } else {
            if (A07 == 3) {
                ViewGroup viewGroup3 = businessDirectorySERPMapViewActivity.A00;
                if (viewGroup3 == null) {
                    throw C18270x1.A0S("progressBarContainer");
                }
                viewGroup3.setVisibility(8);
                CardView cardView2 = businessDirectorySERPMapViewActivity.A01;
                if (cardView2 == null) {
                    throw C18270x1.A0S("mapViewChip");
                }
                cardView2.setVisibility(0);
            }
            return C59022wD.A00;
        }
        cardView.setVisibility(8);
        return C59022wD.A00;
    }
}
