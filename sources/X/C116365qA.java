package X;

import android.graphics.Bitmap;
import android.view.View;
import com.whatsapp.webpagepreview.WebPagePreviewView;

/* renamed from: X.5qA  reason: invalid class name and case insensitive filesystem */
public final class C116365qA implements C185528tp {
    public final /* synthetic */ int A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ View A02;
    public final /* synthetic */ C55592qb A03;
    public final /* synthetic */ C985651j A04;
    public final /* synthetic */ WebPagePreviewView A05;
    public final /* synthetic */ boolean A06;

    public C116365qA(View view, View view2, C55592qb r3, C985651j r4, WebPagePreviewView webPagePreviewView, int i, boolean z) {
        this.A04 = r4;
        this.A05 = webPagePreviewView;
        this.A01 = view;
        this.A02 = view2;
        this.A03 = r3;
        this.A00 = i;
        this.A06 = z;
    }

    public int BD5() {
        return this.A04.A05;
    }

    public /* synthetic */ void BTR() {
    }

    public void Bof(Bitmap bitmap, View view, C624134x r12) {
        C985651j r3 = this.A04;
        WebPagePreviewView webPagePreviewView = this.A05;
        View view2 = this.A01;
        View view3 = this.A02;
        C55592qb r0 = this.A03;
        C985651j.A00(bitmap, view2, view3, r3, webPagePreviewView, r0.A01, r0.A00, this.A00, this.A06);
    }

    public /* synthetic */ void Bp1(View view) {
    }
}
