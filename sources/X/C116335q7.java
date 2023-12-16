package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.webpagepreview.WebPagePreviewView;

/* renamed from: X.5q7  reason: invalid class name and case insensitive filesystem */
public final class C116335q7 implements C185528tp {
    public final int A00;
    public final Context A01;
    public final WebPagePreviewView A02;
    public final boolean A03;
    public final Bitmap[] A04;

    public C116335q7(Context context, WebPagePreviewView webPagePreviewView, Bitmap[] bitmapArr, int i, boolean z) {
        C162457s7.A0J(context, 1);
        this.A01 = context;
        this.A02 = webPagePreviewView;
        this.A00 = i;
        this.A03 = z;
        this.A04 = bitmapArr;
    }

    public int BD5() {
        return this.A00;
    }

    public /* synthetic */ void BTR() {
    }

    public void Bof(Bitmap bitmap, View view, C624134x r8) {
        WebPagePreviewView webPagePreviewView = this.A02;
        if (bitmap == null) {
            boolean z = this.A03;
            int A032 = C18300x5.A03(this.A01, R.attr.f3nameremoved, R.color.f5nameremoved);
            if (z) {
                webPagePreviewView.setVideoLargeThumbWithBackground(A032);
            } else {
                webPagePreviewView.setImageLargeThumbWithBackground(A032);
            }
        } else if (this.A03) {
            webPagePreviewView.setVideoLargeThumbWithBitmap(bitmap);
            this.A04[0] = bitmap;
        } else {
            webPagePreviewView.setImageLargeThumbWithBitmap(bitmap);
        }
    }

    public void Bp1(View view) {
        WebPagePreviewView webPagePreviewView = this.A02;
        if (this.A03) {
            webPagePreviewView.setVideoLargeThumbWithBackground(-7829368);
        } else {
            webPagePreviewView.setImageLargeThumbWithBackground(-7829368);
        }
    }
}
