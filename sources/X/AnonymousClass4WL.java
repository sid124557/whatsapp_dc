package X;

import android.view.ViewGroup;
import android.widget.ImageView;
import com.whatsapp.CatalogImageListActivity;
import com.whatsapp.R;

/* renamed from: X.4WL  reason: invalid class name */
public class AnonymousClass4WL extends AnonymousClass0R6 {
    public final AnonymousClass5MG A00;
    public final /* synthetic */ CatalogImageListActivity A01;

    public AnonymousClass4WL(CatalogImageListActivity catalogImageListActivity, AnonymousClass5MG r2) {
        this.A01 = catalogImageListActivity;
        this.A00 = r2;
    }

    public int A0G() {
        return this.A01.A05.A07.size();
    }

    public /* bridge */ /* synthetic */ void BNf(C05570Ua r10, int i) {
        AnonymousClass4YU r102 = (AnonymousClass4YU) r10;
        r102.A00 = AnonymousClass000.A1U(i, this.A01.A00);
        CatalogImageListActivity catalogImageListActivity = r102.A03;
        C107025aZ r7 = new C107025aZ(r102, 0);
        AnonymousClass90T r6 = new AnonymousClass90T(r102, 0);
        ImageView imageView = r102.A01;
        catalogImageListActivity.A07.A02(imageView, (C108815db) catalogImageListActivity.A05.A07.get(i), r6, r7, 1);
        imageView.setOnClickListener(new AnonymousClass541(r102, i, 0));
        AnonymousClass0YZ.A0F(imageView, C107315b6.A06(AnonymousClass000.A0Y("_", AnonymousClass000.A0l(catalogImageListActivity.A05.A0F), i)));
    }

    public /* bridge */ /* synthetic */ C05570Ua BQR(ViewGroup viewGroup, int i) {
        CatalogImageListActivity catalogImageListActivity = this.A01;
        return new AnonymousClass4YU(AnonymousClass001.A0R(catalogImageListActivity.getLayoutInflater(), viewGroup, R.layout.f8nameremoved), catalogImageListActivity, this.A00);
    }
}
