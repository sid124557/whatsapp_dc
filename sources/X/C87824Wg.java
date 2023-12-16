package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.gallerypicker.GalleryPickerFragment;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4Wg  reason: invalid class name and case insensitive filesystem */
public final class C87824Wg extends AnonymousClass0R6 {
    public final ArrayList A00 = AnonymousClass001.A0s();
    public final /* synthetic */ GalleryPickerFragment A01;

    public /* bridge */ /* synthetic */ void BNf(C05570Ua r12, int i) {
        int i2;
        C84584Cx r2;
        AnonymousClass4Z8 r6 = (AnonymousClass4Z8) r12;
        C162457s7.A0J(r6, 0);
        C104245Qf r4 = (C104245Qf) C86654Ky.A0j(this.A00, i);
        C162457s7.A0J(r4, 0);
        r6.A00 = r4;
        TextView textView = r6.A03;
        GalleryPickerFragment galleryPickerFragment = r6.A05;
        C620733j r0 = galleryPickerFragment.A0E;
        if (r0 != null) {
            C86634Kw.A1K(textView, r0.A0M(), (long) r4.A00);
            r6.A04.A0K((List) null, r4.A05);
            ImageView imageView = r6.A01;
            switch (r4.A02) {
                case 0:
                case 4:
                case 7:
                    i2 = R.drawable.frame_overlay_gallery_camera;
                    break;
                case 1:
                case 5:
                    i2 = R.drawable.frame_overlay_gallery_video;
                    break;
                case 9:
                    i2 = R.drawable.frame_overlay_gallery_whatsapp;
                    break;
                default:
                    i2 = R.drawable.frame_overlay_gallery_folder;
                    break;
            }
            imageView.setImageResource(i2);
            Context A1D = galleryPickerFragment.A1D();
            if (A1D != null && C1001059l.A04) {
                C86614Ku.A15(A1D.getResources(), imageView, R.dimen.f6nameremoved);
            }
            ImageView imageView2 = r6.A02;
            Object tag = imageView2.getTag();
            String str = null;
            if (tag instanceof C84584Cx) {
                r2 = (C84584Cx) tag;
                if (r2 != null) {
                    str = r2.BDW();
                }
            } else {
                r2 = null;
            }
            if (!C162457s7.A0P(str, r4.A00())) {
                C53492nB r02 = galleryPickerFragment.A0K;
                if (r02 != null) {
                    r02.A01(r2);
                }
                C186058ug r8 = r4.A03;
                C171228Gg r9 = new C171228Gg(r8, r4, r6, galleryPickerFragment);
                C1234268j r5 = new C1234268j(r6, galleryPickerFragment, r8, r9, 1);
                imageView2.setTag(r9);
                C53492nB r03 = galleryPickerFragment.A0K;
                if (r03 != null) {
                    r03.A02(r9, r5);
                    return;
                }
                return;
            }
            return;
        }
        throw C18270x1.A0S("whatsAppLocale");
    }

    public C87824Wg(GalleryPickerFragment galleryPickerFragment) {
        this.A01 = galleryPickerFragment;
        A0E(true);
    }

    public int A0G() {
        return this.A00.size();
    }

    public /* bridge */ /* synthetic */ C05570Ua BQR(ViewGroup viewGroup, int i) {
        GalleryPickerFragment galleryPickerFragment = this.A01;
        View A0H = C18310x6.A0H(galleryPickerFragment.A0I(), R.layout.f8nameremoved);
        C162457s7.A0D(A0H);
        return new AnonymousClass4Z8(A0H, galleryPickerFragment);
    }

    public long A0B(int i) {
        return (long) i;
    }
}
