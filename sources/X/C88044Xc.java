package X;

import android.graphics.drawable.ColorDrawable;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.CatalogImageListActivity;

/* renamed from: X.4Xc  reason: invalid class name and case insensitive filesystem */
public class C88044Xc extends AnonymousClass0O5 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ AnonymousClass0R8 A03;
    public final /* synthetic */ CatalogImageListActivity A04;

    public C88044Xc(AnonymousClass0R8 r1, CatalogImageListActivity catalogImageListActivity, int i, int i2, int i3) {
        this.A04 = catalogImageListActivity;
        this.A00 = i;
        this.A01 = i2;
        this.A03 = r1;
        this.A02 = i3;
    }

    public void A04(RecyclerView recyclerView, int i, int i2) {
        CatalogImageListActivity catalogImageListActivity = this.A04;
        float f = 1.0f;
        if (catalogImageListActivity.A02.A1H() == 0) {
            int top = catalogImageListActivity.A02.A0P(0).getTop();
            int i3 = catalogImageListActivity.A04.A01;
            f = Math.min(Math.max(0.0f, ((float) (i3 - top)) / ((float) i3)), 1.0f);
        }
        int i4 = this.A00;
        int i5 = this.A01;
        this.A03.A0D(new ColorDrawable(AnonymousClass0YI.A03(f, i4, i5)));
        catalogImageListActivity.getWindow().setStatusBarColor(AnonymousClass0YI.A03(f, this.A02, i5));
    }
}
