package X;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.wds.components.profilephoto.WDSProfilePhoto;
import java.lang.ref.WeakReference;

/* renamed from: X.55D  reason: invalid class name */
public class AnonymousClass55D extends AnonymousClass5ZM {
    public final float A00;
    public final int A01;
    public final AnonymousClass5UX A02;
    public final C613330g A03;
    public final AnonymousClass3ZH A04;
    public final C56072rN A05;
    public final WeakReference A06;
    public final WeakReference A07;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        View A0j = C86664Kz.A0j(this.A07);
        if (A0j == null) {
            return null;
        }
        return this.A03.A03(A0j.getContext(), this.A04, this.A00, this.A01, false);
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        ImageView imageView = (ImageView) this.A07.get();
        if (imageView != null) {
            if (bitmap == null) {
                AnonymousClass5UX r4 = this.A02;
                bitmap = r4.A02(imageView.getContext(), this.A00, r4.A00(this.A04), this.A01);
            }
            imageView.setImageBitmap(bitmap);
            if ((imageView instanceof WDSProfilePhoto) && this.A00 == -2.14748365E9f) {
                ((WDSProfilePhoto) imageView).setProfilePhotoShape(C142746xh.SQUIRCLE);
            }
            AnonymousClass7DZ r0 = (AnonymousClass7DZ) this.A06.get();
            if (r0 != null) {
                C89884fR r1 = r0.A00;
                if (r1 instanceof C92134m9) {
                    C89884fR.A00((C92134m9) r1).A0D();
                } else {
                    r1.A0A.setVisibility(0);
                }
            }
        }
    }

    public AnonymousClass55D(ImageView imageView, AnonymousClass5UX r4, C613330g r5, AnonymousClass7DZ r6, AnonymousClass3ZH r7, C56072rN r8) {
        float A012;
        this.A02 = r4;
        this.A05 = r8;
        this.A03 = r5;
        this.A04 = r7;
        this.A01 = C18290x4.A0G(imageView).getDimensionPixelSize(R.dimen.f6nameremoved);
        if (this.A05.A06(AnonymousClass34R.A01(r7.A0H))) {
            A012 = -2.14748365E9f;
        } else {
            A012 = C18310x6.A01(imageView.getContext());
        }
        this.A00 = A012;
        this.A07 = AnonymousClass0x9.A14(imageView);
        this.A06 = AnonymousClass0x9.A14(r6);
    }
}
