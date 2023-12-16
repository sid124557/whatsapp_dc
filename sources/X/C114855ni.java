package X;

import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.biz.catalog.CatalogMediaViewFragment;
import com.whatsapp.ui.media.MediaCaptionTextView;

/* renamed from: X.5ni  reason: invalid class name and case insensitive filesystem */
public class C114855ni implements C185718u8 {
    public final /* synthetic */ CatalogMediaViewFragment A00;

    public /* bridge */ /* synthetic */ int BBY(Object obj) {
        int i = 0;
        while (true) {
            CatalogMediaViewFragment catalogMediaViewFragment = this.A00;
            if (i >= catalogMediaViewFragment.A02.A07.size()) {
                return 0;
            }
            if (AnonymousClass000.A0Y("_", AnonymousClass000.A0l(catalogMediaViewFragment.A02.A0F), i).equals(obj)) {
                return i;
            }
            i++;
        }
    }

    public C114855ni(CatalogMediaViewFragment catalogMediaViewFragment) {
        this.A00 = catalogMediaViewFragment;
    }

    public AnonymousClass0PJ B1A(int i) {
        CatalogMediaViewFragment catalogMediaViewFragment = this.A00;
        ViewGroup viewGroup = (ViewGroup) catalogMediaViewFragment.A0I().inflate(R.layout.f8nameremoved, (ViewGroup) null);
        ViewGroup A0J = C86644Kx.A0J(viewGroup, R.id.footer);
        AnonymousClass68C r9 = new AnonymousClass68C(catalogMediaViewFragment.A0G(), this, 0);
        r9.A0M = new C989453v(this, 14);
        if (i == catalogMediaViewFragment.A00) {
            AnonymousClass0YZ.A0F(r9, C107315b6.A06(AnonymousClass000.A0Y("_", AnonymousClass000.A0l(catalogMediaViewFragment.A02.A0F), i)));
        }
        int i2 = 0;
        viewGroup.addView(r9, 0);
        r9.A01 = 0.2f;
        r9.A0Y = true;
        catalogMediaViewFragment.A05.A02(r9, (C108815db) catalogMediaViewFragment.A02.A07.get(i), (C181758nH) null, new C111885iq(catalogMediaViewFragment, r9, i), 1);
        if (!TextUtils.isEmpty(catalogMediaViewFragment.A02.A0C)) {
            View inflate = catalogMediaViewFragment.A0I().inflate(R.layout.f8nameremoved, (ViewGroup) null);
            A0J.addView(inflate, 0);
            AnonymousClass0YY.A04(new ColorDrawable(AnonymousClass0Y8.A04(catalogMediaViewFragment.A0G(), R.color.f5nameremoved)), A0J);
            ((MediaCaptionTextView) C06560Yg.A02(inflate, R.id.caption)).setCaptionText(catalogMediaViewFragment.A02.A0C);
        }
        if (!catalogMediaViewFragment.A0J) {
            i2 = 8;
        }
        A0J.setVisibility(i2);
        return AnonymousClass0x9.A0G(viewGroup, AnonymousClass000.A0Y("_", AnonymousClass000.A0l(catalogMediaViewFragment.A02.A0F), i));
    }

    public void BTY() {
    }

    public int getCount() {
        return this.A00.A02.A07.size();
    }

    public void B1b(int i) {
    }
}
