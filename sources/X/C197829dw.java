package X;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.whatsapp.util.Log;

/* renamed from: X.9dw  reason: invalid class name and case insensitive filesystem */
public class C197829dw implements C185158tB {
    public final /* synthetic */ ImageView A00;
    public final /* synthetic */ C166587yw A01;
    public final /* synthetic */ AnonymousClass9TJ A02;
    public final /* synthetic */ boolean A03;

    public C197829dw(ImageView imageView, C166587yw r2, AnonymousClass9TJ r3, boolean z) {
        this.A02 = r3;
        this.A03 = z;
        this.A01 = r2;
        this.A00 = imageView;
    }

    public void BVO() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("PAY: Failed to display card art, empty image shown. Re-fetch ");
        boolean z = this.A03;
        Log.w(C18300x5.A0m(A0o, z));
        if (z) {
            this.A02.A01(this.A00, this.A01);
        }
    }

    public void Be1() {
    }

    public void Be2(Bitmap bitmap) {
    }
}
