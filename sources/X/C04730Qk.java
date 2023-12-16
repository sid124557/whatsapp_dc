package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import com.whatsapp.R;

/* renamed from: X.0Qk  reason: invalid class name and case insensitive filesystem */
public abstract class C04730Qk {
    public C05610Ue A00;
    public CharSequence A01;
    public boolean A02 = false;

    public abstract String A04();

    public abstract void A06(C14880qQ r1);

    public final Bitmap A00(int i, int i2, int i3, int i4) {
        if (i4 == 0) {
            i4 = 0;
        }
        Context context = this.A00.A0B;
        context.getClass();
        Bitmap A012 = A01(IconCompat.A02(context.getResources(), context.getPackageName(), R.drawable.notification_icon_background), i4, i2);
        Canvas canvas = new Canvas(A012);
        Drawable mutate = this.A00.A0B.getResources().getDrawable(i).mutate();
        mutate.setFilterBitmap(true);
        int i5 = (i2 - i3) / 2;
        int i6 = i3 + i5;
        mutate.setBounds(i5, i5, i6, i6);
        AnonymousClass001.A12(PorterDuff.Mode.SRC_ATOP, mutate, -1);
        mutate.draw(canvas);
        return A012;
    }

    public final Bitmap A01(IconCompat iconCompat, int i, int i2) {
        int i3;
        Drawable A07 = iconCompat.A07(this.A00.A0B);
        if (i2 == 0) {
            i3 = A07.getIntrinsicWidth();
            i2 = A07.getIntrinsicHeight();
        } else {
            i3 = i2;
        }
        Bitmap createBitmap = Bitmap.createBitmap(i3, i2, Bitmap.Config.ARGB_8888);
        A07.setBounds(0, 0, i3, i2);
        if (i != 0) {
            AnonymousClass001.A12(PorterDuff.Mode.SRC_IN, A07.mutate(), i);
        }
        A07.draw(new Canvas(createBitmap));
        return createBitmap;
    }

    public void A05(Bundle bundle) {
        if (this.A02) {
            bundle.putCharSequence("android.summaryText", this.A01);
        }
        String A04 = A04();
        if (A04 != null) {
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", A04);
        }
    }

    public RemoteViews A02(C14880qQ r2) {
        return null;
    }

    public RemoteViews A03(C14880qQ r2) {
        return null;
    }
}
