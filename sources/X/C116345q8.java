package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.webpagepreview.WebPagePreviewView;

/* renamed from: X.5q8  reason: invalid class name and case insensitive filesystem */
public final class C116345q8 implements C185528tp {
    public final int A00;
    public final Context A01;
    public final WebPagePreviewView A02;
    public final boolean A03;
    public final Bitmap[] A04;

    public C116345q8(Context context, WebPagePreviewView webPagePreviewView, Bitmap[] bitmapArr, int i, boolean z) {
        C162457s7.A0J(context, 1);
        this.A01 = context;
        this.A02 = webPagePreviewView;
        this.A00 = i;
        this.A04 = bitmapArr;
        this.A03 = z;
    }

    public int BD5() {
        return this.A00;
    }

    public /* synthetic */ void BTR() {
    }

    public void Bof(Bitmap bitmap, View view, C624134x r7) {
        if (bitmap != null) {
            this.A02.setVideoLargeThumbWithBitmap(bitmap);
            this.A04[0] = bitmap;
            return;
        }
        boolean z = this.A03;
        WebPagePreviewView webPagePreviewView = this.A02;
        if (z) {
            webPagePreviewView.A0D.setAlpha(0.3f);
            webPagePreviewView.setVideoLargeThumbWithBackground(-7829368);
            return;
        }
        webPagePreviewView.setVideoLargeThumbWithBackground(C18300x5.A03(this.A01, R.attr.f3nameremoved, R.color.f5nameremoved));
    }

    public void Bp1(View view) {
        this.A02.setVideoLargeThumbWithBackground(-7829368);
    }
}
