package X;

import android.view.View;
import android.view.ViewStub;
import com.whatsapp.R;
import com.whatsapp.gallery.views.GalleryPartialPermissionBanner;

/* renamed from: X.5Q0  reason: invalid class name */
public final class AnonymousClass5Q0 {
    public GalleryPartialPermissionBanner A00;
    public boolean A01;
    public final AnonymousClass5ZR A02;

    public AnonymousClass5Q0(AnonymousClass5ZR r2) {
        C162457s7.A0J(r2, 1);
        this.A02 = r2;
    }

    public final void A00(View view, C003203q r6) {
        GalleryPartialPermissionBanner galleryPartialPermissionBanner;
        if (C107385bE.A0B() && this.A02.A04() == C997357z.PARTIAL) {
            ViewStub viewStub = (ViewStub) C06560Yg.A02(view, R.id.partial_permission_banner_view_stub);
            View inflate = viewStub.inflate();
            if ((inflate instanceof GalleryPartialPermissionBanner) && (galleryPartialPermissionBanner = (GalleryPartialPermissionBanner) inflate) != null) {
                this.A00 = galleryPartialPermissionBanner;
                galleryPartialPermissionBanner.A01 = new AnonymousClass8X4(r6, this);
                galleryPartialPermissionBanner.setVisibility(0);
                viewStub.requestLayout();
            }
        }
    }

    public final void A01(AnonymousClass4GP r6) {
        if (C107385bE.A0B()) {
            GalleryPartialPermissionBanner galleryPartialPermissionBanner = this.A00;
            if (galleryPartialPermissionBanner != null) {
                int i = 0;
                if (this.A02.A04() != C997357z.PARTIAL) {
                    i = 8;
                }
                galleryPartialPermissionBanner.setVisibility(i);
            }
            if (this.A01 && this.A02.A04() != C997357z.DENIED) {
                r6.invoke();
            }
            this.A01 = false;
        }
    }
}
