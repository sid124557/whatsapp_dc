package X;

import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.whatsapp.R;

/* renamed from: X.2Xc  reason: invalid class name and case insensitive filesystem */
public final class C44692Xc {
    public final C54292oU A00;
    public final AnonymousClass33T A01;

    public final void A00() {
        Bitmap bitmap;
        Context context = this.A00.A00;
        C162457s7.A0D(context);
        PendingIntent A002 = C624735e.A00(context, 0, C627736r.A0p(context, C18290x4.A0d()), 0);
        C05610Ue A003 = C66553Lw.A00(context);
        C18300x5.A14(context, A003, R.string.f11nameremoved);
        C18320x8.A0z(context, A003, R.string.f11nameremoved);
        A003.A0E(true);
        A003.A07.icon = R.drawable.notifybar;
        Drawable A004 = AnonymousClass0RP.A00(context, R.drawable.vec_bonsai_pictogram);
        if (A004 != null) {
            int intrinsicWidth = A004.getIntrinsicWidth();
            int intrinsicHeight = A004.getIntrinsicHeight();
            if (A004 instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) A004;
                if (bitmapDrawable.getBitmap() != null) {
                    if (bitmapDrawable.getBitmap() == null) {
                        throw AnonymousClass001.A0c("bitmap is null");
                    } else if (intrinsicWidth == bitmapDrawable.getBitmap().getWidth() && intrinsicHeight == bitmapDrawable.getBitmap().getHeight()) {
                        bitmap = bitmapDrawable.getBitmap();
                    } else {
                        bitmap = Bitmap.createScaledBitmap(bitmapDrawable.getBitmap(), intrinsicWidth, intrinsicHeight, true);
                    }
                }
            } else {
                Rect bounds = A004.getBounds();
                C162457s7.A0D(bounds);
                int i = bounds.left;
                int i2 = bounds.top;
                int i3 = bounds.right;
                int i4 = bounds.bottom;
                bitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
                A004.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
                A004.draw(new Canvas(bitmap));
                A004.setBounds(i, i2, i3, i4);
            }
            C162457s7.A0D(bitmap);
            A003.A06(bitmap);
            A003.A09 = A002;
            AnonymousClass33T.A03(A003, this.A01, 75);
        }
        bitmap = null;
        A003.A06(bitmap);
        A003.A09 = A002;
        AnonymousClass33T.A03(A003, this.A01, 75);
    }

    public C44692Xc(C54292oU r1, AnonymousClass33T r2) {
        C18260x0.A0Q(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }
}
