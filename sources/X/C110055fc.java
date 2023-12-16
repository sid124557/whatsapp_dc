package X;

import android.graphics.Bitmap;
import android.view.ViewTreeObserver;

/* renamed from: X.5fc  reason: invalid class name and case insensitive filesystem */
public class C110055fc implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C147247Dj A01;
    public final /* synthetic */ C113245l7 A02;
    public final /* synthetic */ C624134x A03;
    public final /* synthetic */ AnonymousClass2z0 A04;
    public final /* synthetic */ AnonymousClass5NI A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ Bitmap[] A08;

    public C110055fc(C147247Dj r1, C113245l7 r2, C624134x r3, AnonymousClass2z0 r4, AnonymousClass5NI r5, String str, String str2, Bitmap[] bitmapArr, int i) {
        this.A02 = r2;
        this.A01 = r1;
        this.A07 = str;
        this.A06 = str2;
        this.A04 = r4;
        this.A05 = r5;
        this.A00 = i;
        this.A08 = bitmapArr;
        this.A03 = r3;
    }

    public void onGlobalLayout() {
        C113245l7 r4 = this.A02;
        if (r4.A5l != null) {
            C86604Kt.A1G(r4.A5j, this);
            r4.A5j.setVisibility(0);
            r4.A5l.Bq3(this.A01, r4.A5j, r4.A1a.getWidth());
            AnonymousClass66v r3 = r4.A5l;
            String str = this.A07;
            String str2 = this.A06;
            AnonymousClass2z0 r6 = this.A04;
            AnonymousClass5NI r7 = this.A05;
            int i = this.A00;
            Bitmap[] bitmapArr = this.A08;
            r3.B36(new C66513Ls(r4.A1h, r4.A4K, str), this.A03, r6, r7, str, str2, bitmapArr, i);
        }
    }
}
