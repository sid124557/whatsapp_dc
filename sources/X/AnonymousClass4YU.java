package X;

import android.view.View;
import android.widget.ImageView;
import com.whatsapp.CatalogImageListActivity;
import com.whatsapp.R;

/* renamed from: X.4YU  reason: invalid class name */
public class AnonymousClass4YU extends C05570Ua {
    public boolean A00;
    public final ImageView A01;
    public final AnonymousClass5MG A02;
    public final /* synthetic */ CatalogImageListActivity A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4YU(View view, CatalogImageListActivity catalogImageListActivity, AnonymousClass5MG r4) {
        super(view);
        this.A03 = catalogImageListActivity;
        this.A02 = r4;
        this.A01 = AnonymousClass0x9.A0F(view, R.id.catalog_image_list_image_view);
    }
}
