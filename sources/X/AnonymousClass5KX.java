package X;

import android.content.Context;
import com.whatsapp.webpagepreview.WebPagePreviewView;

/* renamed from: X.5KX  reason: invalid class name */
public class AnonymousClass5KX {
    public boolean A00;
    public final C64393Dh A01;
    public final C185048sy A02;
    public final AnonymousClass4UA A03;
    public final AnonymousClass4FS A04;
    public final WebPagePreviewView A05;
    public final boolean A06;

    public AnonymousClass5KX(Context context, C64393Dh r5, C185048sy r6, AnonymousClass4UA r7, AnonymousClass4FS r8, boolean z, boolean z2) {
        this.A02 = r6;
        this.A03 = r7;
        this.A04 = r8;
        this.A01 = r5;
        WebPagePreviewView webPagePreviewView = new WebPagePreviewView(context);
        this.A05 = webPagePreviewView;
        this.A00 = z;
        this.A06 = z2;
        webPagePreviewView.setImageProgressBarVisibility(false);
        webPagePreviewView.setImageCancelClickListener(new C989553w(this, 0));
        webPagePreviewView.setImageContentClickListener(new C989553w(this, 1));
        webPagePreviewView.A02();
    }
}
