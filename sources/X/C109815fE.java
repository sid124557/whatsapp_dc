package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.DisplayMetrics;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.webpagepreview.WebPagePreviewView;

/* renamed from: X.5fE  reason: invalid class name and case insensitive filesystem */
public final class C109815fE implements View.OnLayoutChangeListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ C985651j A02;
    public final /* synthetic */ WebPagePreviewView A03;
    public final /* synthetic */ boolean A04;

    public C109815fE(View view, View view2, C985651j r3, WebPagePreviewView webPagePreviewView, boolean z) {
        this.A03 = webPagePreviewView;
        this.A02 = r3;
        this.A00 = view;
        this.A01 = view2;
        this.A04 = z;
    }

    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9;
        int i10;
        Bitmap bitmap;
        int i11;
        C86644Kx.A0v(this, view);
        WebPagePreviewView webPagePreviewView = this.A03;
        int height = webPagePreviewView.A0E.getHeight();
        C985651j r8 = this.A02;
        C30481mW r2 = r8.A0C;
        String A1w = r2.A1w();
        if (A1w != null && (!(r2.A0l == null && r2.A1z() == null) && C107415bH.A02(r8.A0B, A1w) < 250)) {
            DisplayMetrics displayMetrics = r8.A00;
            if (displayMetrics == null) {
                throw C18270x1.A0S("displayMetrics");
            } else if (((float) displayMetrics.heightPixels) / displayMetrics.density <= 640.0f) {
                if (C86664Kz.A0D(r8.A07, r8.A06.getHeight()) - height >= r8.A03().getResources().getDimensionPixelSize(R.dimen.f6nameremoved)) {
                    C55592qb r4 = r2.A0l;
                    if (r4 != null && (i11 = r4.A01) > 0 && r4.A00 > 0) {
                        float f = (float) r8.A05;
                        DisplayMetrics displayMetrics2 = r8.A00;
                        if (displayMetrics2 == null) {
                            throw C18270x1.A0S("displayMetrics");
                        } else if (i11 >= ((int) (f / displayMetrics2.density))) {
                            r8.A0G.A09(webPagePreviewView, r2, new C116365qA(this.A00, this.A01, r4, r8, webPagePreviewView, height, this.A04));
                            return;
                        }
                    }
                    byte[] A1z = r2.A1z();
                    bitmap = null;
                    if (A1z != null) {
                        try {
                            BitmapFactory.Options options = new BitmapFactory.Options();
                            options.inDither = true;
                            options.inPreferredConfig = Bitmap.Config.RGB_565;
                            bitmap = BitmapFactory.decodeByteArray(r2.A1z(), 0, A1z.length, options);
                        } catch (OutOfMemoryError unused) {
                        }
                        if (bitmap != null) {
                            i10 = bitmap.getWidth();
                            i9 = bitmap.getHeight();
                            C985651j.A00(bitmap, this.A00, this.A01, r8, webPagePreviewView, i10, i9, height, this.A04);
                        }
                    }
                    i10 = 0;
                    i9 = 0;
                    C985651j.A00(bitmap, this.A00, this.A01, r8, webPagePreviewView, i10, i9, height, this.A04);
                }
            }
        }
        bitmap = null;
        i10 = 0;
        i9 = 0;
        C985651j.A00(bitmap, this.A00, this.A01, r8, webPagePreviewView, i10, i9, height, this.A04);
    }
}
