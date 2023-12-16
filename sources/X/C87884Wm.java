package X;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.WaMediaThumbnailView;
import java.util.List;

/* renamed from: X.4Wm  reason: invalid class name and case insensitive filesystem */
public class C87884Wm extends AnonymousClass0R6 {
    public final LayoutInflater A00;
    public final C53492nB A01;
    public final List A02 = AnonymousClass001.A0s();

    public C87884Wm(LayoutInflater layoutInflater, C53492nB r3) {
        C162457s7.A0J(r3, 2);
        this.A00 = layoutInflater;
        this.A01 = r3;
    }

    public /* bridge */ /* synthetic */ C05570Ua BQR(ViewGroup viewGroup, int i) {
        C162457s7.A0J(viewGroup, 0);
        return new AnonymousClass4YX(C18310x6.A0I(this.A00, viewGroup, R.layout.f8nameremoved, false), this.A01);
    }

    public int A0G() {
        return this.A02.size();
    }

    public /* bridge */ /* synthetic */ void A0J(C05570Ua r3) {
        AnonymousClass4YX r32 = (AnonymousClass4YX) r3;
        C162457s7.A0J(r32, 0);
        WaMediaThumbnailView waMediaThumbnailView = r32.A03;
        waMediaThumbnailView.setImageDrawable((Drawable) null);
        waMediaThumbnailView.A01 = null;
        waMediaThumbnailView.setThumbnail((Bitmap) null);
        waMediaThumbnailView.setTag((Object) null);
    }

    public /* bridge */ /* synthetic */ void BNf(C05570Ua r6, int i) {
        C84584Cx r2;
        AnonymousClass4YX r62 = (AnonymousClass4YX) r6;
        C162457s7.A0J(r62, 0);
        C186058ug r4 = (C186058ug) this.A02.get(i);
        WaMediaThumbnailView waMediaThumbnailView = r62.A03;
        waMediaThumbnailView.A01 = r4;
        Object tag = waMediaThumbnailView.getTag();
        if ((tag instanceof C84584Cx) && (r2 = (C84584Cx) tag) != null) {
            r62.A04.A01(r2);
        }
        if (r4 != null) {
            C86644Kx.A1A(waMediaThumbnailView);
            C171208Ge r22 = new C171208Ge(r4, r62);
            waMediaThumbnailView.setTag(r22);
            r62.A04.A02(r22, new C1234368k(r62, r22, r4, 1));
            return;
        }
        C86664Kz.A1R(waMediaThumbnailView);
        waMediaThumbnailView.setBackgroundColor(r62.A01);
        waMediaThumbnailView.setImageDrawable((Drawable) null);
    }
}
