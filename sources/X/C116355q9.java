package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Pair;
import android.view.View;
import android.widget.LinearLayout;
import com.whatsapp.R;
import com.whatsapp.webpagepreview.WebPagePreviewView;

/* renamed from: X.5q9  reason: invalid class name and case insensitive filesystem */
public final class C116355q9 implements C185528tp {
    public final int A00;
    public final int A01;
    public final Context A02;
    public final C94004ph A03;
    public final WebPagePreviewView A04;
    public final boolean A05;
    public final Bitmap[] A06;

    public C116355q9(Context context, C94004ph r3, WebPagePreviewView webPagePreviewView, Bitmap[] bitmapArr, int i, int i2, boolean z) {
        C162457s7.A0J(context, 1);
        this.A02 = context;
        this.A04 = webPagePreviewView;
        this.A05 = z;
        this.A01 = i;
        this.A00 = i2;
        this.A06 = bitmapArr;
        this.A03 = r3;
    }

    public void Bof(Bitmap bitmap, View view, C624134x r9) {
        C162457s7.A0J(r9, 2);
        C55592qb r0 = r9.A0l;
        C626936e.A06(r0);
        int i = r0.A01;
        int i2 = r0.A00;
        C94004ph r1 = this.A03;
        r1.A06(i, i2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        Pair A042 = r1.A04(makeMeasureSpec, makeMeasureSpec);
        int A032 = (C18280x3.A03(A042) - this.A00) - this.A01;
        Object obj = A042.second;
        C162457s7.A0C(obj);
        Object obj2 = A042.first;
        C162457s7.A0C(obj2);
        int A0K = (AnonymousClass001.A0K(obj) * A032) / AnonymousClass001.A0K(obj2);
        int i3 = new int[]{A032, A0K}[0];
        WebPagePreviewView webPagePreviewView = this.A04;
        boolean z = this.A05;
        if (z) {
            LinearLayout.LayoutParams A0U = AnonymousClass001.A0U(webPagePreviewView.A09);
            A0U.width = i3;
            A0U.height = A0K;
            webPagePreviewView.A09.setLayoutParams(A0U);
        } else {
            webPagePreviewView.A0A(i3, A0K);
        }
        if (bitmap == null) {
            int A033 = C18300x5.A03(this.A02, R.attr.f3nameremoved, R.color.f5nameremoved);
            if (z) {
                webPagePreviewView.setVideoLargeThumbWithBackground(A033);
            } else {
                webPagePreviewView.setImageLargeThumbWithBackground(A033);
            }
        } else if (z) {
            webPagePreviewView.setVideoLargeThumbWithBitmap(bitmap);
            this.A06[0] = bitmap;
        } else {
            webPagePreviewView.setImageLargeThumbWithBitmap(bitmap);
        }
    }

    public int BD5() {
        return 0;
    }

    public /* synthetic */ void BTR() {
    }

    public /* synthetic */ void Bp1(View view) {
    }
}
