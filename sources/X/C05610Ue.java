package X;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import com.whatsapp.R;
import java.util.ArrayList;

/* renamed from: X.0Ue  reason: invalid class name and case insensitive filesystem */
public class C05610Ue {
    public int A00 = 0;
    public int A01 = 0;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06 = 0;
    public Notification A07;
    public Notification A08;
    public PendingIntent A09;
    public PendingIntent A0A;
    public Context A0B;
    public Bitmap A0C;
    public Bundle A0D;
    public RemoteViews A0E;
    public C04730Qk A0F;
    public CharSequence A0G;
    public CharSequence A0H;
    public Object A0I;
    public String A0J;
    public String A0K;
    public String A0L;
    public String A0M;
    public String A0N;
    public ArrayList A0O = AnonymousClass001.A0s();
    public ArrayList A0P = AnonymousClass001.A0s();
    @Deprecated
    public ArrayList A0Q;
    public ArrayList A0R = AnonymousClass001.A0s();
    public boolean A0S;
    public boolean A0T;
    public boolean A0U = false;
    public boolean A0V;
    public boolean A0W = true;
    public boolean A0X;
    public boolean A0Y;

    public void A0F(boolean z) {
        int i;
        Notification notification = this.A07;
        int i2 = notification.flags;
        if (z) {
            i = 2 | i2;
        } else {
            i = (~2) & i2;
        }
        notification.flags = i;
    }

    public static CharSequence A00(CharSequence charSequence) {
        if (charSequence == null || charSequence.length() <= 5120) {
            return charSequence;
        }
        return charSequence.subSequence(0, 5120);
    }

    public Notification A01() {
        return new C07860cw(this).A00();
    }

    public void A02(int i) {
        Notification notification = this.A07;
        notification.defaults = i;
        if ((i & 4) != 0) {
            notification.flags |= 1;
        }
    }

    public void A03(int i, int i2, boolean z) {
        this.A05 = i;
        this.A04 = i2;
        this.A0V = z;
    }

    public void A04(int i, CharSequence charSequence, PendingIntent pendingIntent) {
        this.A0O.add(new C05480Tm(i, charSequence, pendingIntent));
    }

    public void A05(long j) {
        this.A07.when = j;
    }

    public void A06(Bitmap bitmap) {
        if (bitmap != null && Build.VERSION.SDK_INT < 27) {
            Resources resources = this.A0B.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.f6nameremoved);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.f6nameremoved);
            if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                double min = Math.min(((double) dimensionPixelSize) / ((double) Math.max(1, bitmap.getWidth())), ((double) dimensionPixelSize2) / ((double) Math.max(1, bitmap.getHeight())));
                bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * min), (int) Math.ceil(((double) bitmap.getHeight()) * min), true);
            }
        }
        this.A0C = bitmap;
    }

    public void A07(Uri uri) {
        Notification notification = this.A07;
        notification.sound = uri;
        notification.audioStreamType = -1;
        notification.audioAttributes = AnonymousClass0WR.A03(AnonymousClass0WR.A02(AnonymousClass0WR.A01(AnonymousClass0WR.A00(), 4), 5));
    }

    public void A08(C04730Qk r2) {
        if (this.A0F != r2) {
            this.A0F = r2;
            if (r2.A00 != this) {
                r2.A00 = this;
                A08(r2);
            }
        }
    }

    public void A09(IconCompat iconCompat) {
        this.A0I = iconCompat.A09(this.A0B);
    }

    public void A0C(CharSequence charSequence) {
        this.A07.tickerText = A00(charSequence);
    }

    @Deprecated
    public void A0D(String str) {
        if (str != null && !str.isEmpty()) {
            this.A0Q.add(str);
        }
    }

    public void A0E(boolean z) {
        int i;
        Notification notification = this.A07;
        int i2 = notification.flags;
        if (z) {
            i = 16 | i2;
        } else {
            i = (~16) & i2;
        }
        notification.flags = i;
    }

    public C05610Ue(Context context, String str) {
        Notification notification = new Notification();
        this.A07 = notification;
        this.A0B = context;
        this.A0K = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.A03 = 0;
        this.A0Q = AnonymousClass001.A0s();
        this.A0S = true;
    }

    public void A0A(CharSequence charSequence) {
        this.A0G = A00(charSequence);
    }

    public void A0B(CharSequence charSequence) {
        this.A0H = A00(charSequence);
    }
}
