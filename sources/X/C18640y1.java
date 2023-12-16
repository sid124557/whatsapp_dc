package X;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* renamed from: X.0y1  reason: invalid class name and case insensitive filesystem */
public final class C18640y1 extends BitmapDrawable {
    public final C30471mV A00;

    public int getIntrinsicHeight() {
        int i;
        AnonymousClass33C r0 = this.A00.A01;
        if (r0 == null || (i = r0.A06) <= 0) {
            return super.getIntrinsicHeight();
        }
        return i;
    }

    public int getIntrinsicWidth() {
        int i;
        AnonymousClass33C r0 = this.A00.A01;
        if (r0 == null || (i = r0.A08) <= 0) {
            return super.getIntrinsicWidth();
        }
        return i;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C18640y1(Resources resources, Bitmap bitmap, C30471mV r3) {
        super(resources, bitmap);
        C18260x0.A0Q(r3, resources);
        this.A00 = r3;
    }
}
