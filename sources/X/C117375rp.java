package X;

import com.whatsapp.webpagepreview.WebPagePreviewView;
import java.util.List;

/* renamed from: X.5rp  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C117375rp implements Runnable {
    public final /* synthetic */ AnonymousClass1Hk A00;
    public final /* synthetic */ AnonymousClass5KW A01;
    public final /* synthetic */ WebPagePreviewView A02;
    public final /* synthetic */ List A03;
    public final /* synthetic */ boolean A04;
    public final /* synthetic */ boolean A05;

    public final void run() {
        WebPagePreviewView webPagePreviewView = this.A02;
        AnonymousClass1Hk r4 = this.A00;
        boolean z = this.A04;
        List list = this.A03;
        boolean z2 = this.A05;
        AnonymousClass5KW r0 = this.A01;
        webPagePreviewView.A0F(r4, list, z, z2);
        C106055Xl r1 = r0.A00;
        C624134x r3 = r0.A01;
        boolean z3 = r0.A04;
        r1.A03(r1.A07, r3, r0.A02, r0.A03, z3, r0.A05, r0.A06);
    }

    public /* synthetic */ C117375rp(AnonymousClass1Hk r1, AnonymousClass5KW r2, WebPagePreviewView webPagePreviewView, List list, boolean z, boolean z2) {
        this.A02 = webPagePreviewView;
        this.A00 = r1;
        this.A04 = z;
        this.A03 = list;
        this.A05 = z2;
        this.A01 = r2;
    }
}
