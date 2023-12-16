package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.6D5  reason: invalid class name */
public class AnonymousClass6D5 extends Drawable implements Animatable, C179698jZ {
    public static int A09 = 4000;
    public int A00;
    public int A01;
    public long A02;
    public boolean A03;
    public boolean A04;
    public boolean A05 = false;
    public final Paint A06 = C86604Kt.A0B();
    public final AnonymousClass7XO A07;
    public final List A08 = AnonymousClass001.A0s();

    public void A00(Canvas canvas) {
        canvas.drawBitmap(this.A07.A09, (Rect) null, getBounds(), this.A06);
    }

    public void draw(Canvas canvas) {
        Bitmap bitmap;
        boolean z = this.A04;
        AnonymousClass7XO r0 = this.A07;
        if (!z) {
            bitmap = r0.A09;
        } else {
            bitmap = r0.A04;
        }
        if (bitmap == null) {
            bitmap = r0.A09;
        }
        canvas.drawBitmap(bitmap, (Rect) null, getBounds(), this.A06);
    }

    public int getOpacity() {
        return -3;
    }

    public boolean isRunning() {
        return this.A04;
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    public void stop() {
        if (this.A04) {
            this.A04 = false;
            AnonymousClass7XO r5 = this.A07;
            Set set = r5.A0F;
            set.remove(this);
            if (set.isEmpty()) {
                r5.A0G = false;
                r5.A00 = 0;
                AnonymousClass7XJ r3 = r5.A0B;
                synchronized (r3) {
                    r3.A00 = 0;
                    r3.A02 = null;
                    Bitmap bitmap = r3.A01;
                    if (bitmap != null) {
                        r3.A03 = null;
                        bitmap.recycle();
                        r3.A01 = null;
                    }
                }
                r5.A06 = false;
                Bitmap bitmap2 = r5.A04;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                    r5.A04 = null;
                }
                r5.A03 = null;
                r5.A0A.A0R(r5.A0E);
                AnonymousClass7IO r2 = r5.A0C.A04;
                synchronized (r2) {
                    Iterator it = r2.A01.iterator();
                    while (it.hasNext()) {
                        if (((AnonymousClass8LW) it.next()).A02 == r3) {
                            it.remove();
                        }
                    }
                }
            }
            for (AnonymousClass0P5 A022 : this.A08) {
                A022.A02(this);
            }
            invalidateSelf();
        }
    }

    public AnonymousClass6D5(AnonymousClass7XO r2) {
        this.A07 = r2;
        if (AnonymousClass320.A00) {
            A09 = SearchActionVerificationClientService.NOTIFICATION_ID;
        }
    }

    public void start() {
        this.A02 = SystemClock.uptimeMillis();
        if (!this.A04 || AnonymousClass320.A00) {
            this.A00 = 0;
            this.A04 = true;
            AnonymousClass7XO r4 = this.A07;
            int i = r4.A00;
            int i2 = r4.A0D.A00;
            boolean z = true;
            if (i <= Math.max(i2 / 5, 1)) {
                z = false;
            }
            this.A05 = z;
            r4.A0F.add(this);
            if (!r4.A0G && i2 > 1) {
                r4.A0G = true;
                r4.A00();
            }
            for (AnonymousClass0P5 A012 : this.A08) {
                A012.A01(this);
            }
        }
    }
}
