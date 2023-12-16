package X;

import android.webkit.WebChromeClient;
import android.widget.ProgressBar;

/* renamed from: X.2vn  reason: invalid class name and case insensitive filesystem */
public final class C58772vn {
    public final WebChromeClient A00;
    public final ProgressBar A01;
    public final AnonymousClass2PM A02;
    public final AnonymousClass4FT A03;

    public C58772vn(ProgressBar progressBar, AnonymousClass2PM r2, AnonymousClass4FT r3) {
        this();
        this.A03 = r3;
        this.A02 = r2;
        this.A01 = progressBar;
    }

    public C58772vn() {
        this.A00 = new WebChromeClient();
    }
}
