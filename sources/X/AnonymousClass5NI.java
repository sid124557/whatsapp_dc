package X;

import com.whatsapp.webpagepreview.WebPagePreviewView;

/* renamed from: X.5NI  reason: invalid class name */
public class AnonymousClass5NI {
    public final /* synthetic */ C624134x A00;
    public final /* synthetic */ C187948y4 A01;

    public AnonymousClass5NI(C624134x r1, C187948y4 r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public void A00(AnonymousClass2z0 r9, int i) {
        C187948y4 r4;
        float f;
        float f2;
        float f3;
        float f4;
        if (r9 != null && C86664Kz.A1X(this.A00, r9)) {
            if (i != 1) {
                r4 = this.A01;
                f = 0.0f;
                if (i != 2) {
                    f2 = 1.0f;
                } else {
                    f3 = 1.0f;
                    f4 = 0.67f;
                    f2 = 0.0f;
                    WebPagePreviewView webPagePreviewView = (WebPagePreviewView) r4;
                    long j = (long) 150;
                    webPagePreviewView.A0G.animate().setDuration(j).alpha(f);
                    C86654Ky.A0I(webPagePreviewView.A04, j).alpha(f2);
                    C86654Ky.A0I(webPagePreviewView.A0C, j).alpha(f2);
                    C86654Ky.A0I(webPagePreviewView.A05, j).alpha(f3);
                    C86654Ky.A0I(webPagePreviewView.A06, j).alpha(f4);
                }
            } else {
                r4 = this.A01;
                f = 1.0f;
                f2 = 0.0f;
            }
            f3 = 0.0f;
            f4 = 0.0f;
            WebPagePreviewView webPagePreviewView2 = (WebPagePreviewView) r4;
            long j2 = (long) 150;
            webPagePreviewView2.A0G.animate().setDuration(j2).alpha(f);
            C86654Ky.A0I(webPagePreviewView2.A04, j2).alpha(f2);
            C86654Ky.A0I(webPagePreviewView2.A0C, j2).alpha(f2);
            C86654Ky.A0I(webPagePreviewView2.A05, j2).alpha(f3);
            C86654Ky.A0I(webPagePreviewView2.A06, j2).alpha(f4);
        }
    }
}
