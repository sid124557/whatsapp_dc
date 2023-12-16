package X;

import android.graphics.Bitmap;

/* renamed from: X.8HK  reason: invalid class name */
public class AnonymousClass8HK implements C83854Ab {
    public final AnonymousClass2z0 A00;
    public final /* synthetic */ C624134x A01;
    public final /* synthetic */ C116505qO A02;
    public final /* synthetic */ Bitmap[] A03;

    public AnonymousClass8HK(C624134x r1, AnonymousClass2z0 r2, C116505qO r3, Bitmap[] bitmapArr) {
        this.A02 = r3;
        this.A03 = bitmapArr;
        this.A01 = r1;
        this.A00 = r2;
    }

    public void BXc(C66513Ls r9, boolean z) {
        AnonymousClass2z0 r5 = this.A00;
        C116505qO r1 = this.A02;
        if (r5 == r1.A0A) {
            int i = r1.A06;
            Bitmap[] bitmapArr = this.A03;
            r1.A02(r9, r9.A0A, this.A01, r5, bitmapArr, i);
        }
    }
}
