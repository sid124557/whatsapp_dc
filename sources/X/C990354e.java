package X;

import android.graphics.Bitmap;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.biz.catalog.view.CatalogHeader;
import java.lang.ref.WeakReference;

/* renamed from: X.54e  reason: invalid class name and case insensitive filesystem */
public class C990354e extends AnonymousClass5ZM {
    public final C613330g A00;
    public final AnonymousClass3ZH A01;
    public final WeakReference A02;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        View A0j = C86664Kz.A0j(this.A02);
        if (A0j != null) {
            return this.A00.A03(A0j.getContext(), this.A01, 0.0f, 640, true);
        }
        return null;
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        CatalogHeader catalogHeader = (CatalogHeader) this.A02.get();
        if (catalogHeader == null) {
            return;
        }
        if (bitmap == null) {
            catalogHeader.A00.setImageResource(R.drawable.avatar_contact_large);
        } else {
            catalogHeader.A00.setImageBitmap(bitmap);
        }
    }

    public C990354e(CatalogHeader catalogHeader, C613330g r3, AnonymousClass3ZH r4) {
        this.A01 = r4;
        this.A00 = r3;
        this.A02 = AnonymousClass0x9.A14(catalogHeader);
    }
}
