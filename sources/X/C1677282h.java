package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: X.82h  reason: invalid class name and case insensitive filesystem */
public class C1677282h implements C187518xL {
    public long A00;
    public ColorFilter A01;
    public Rect A02;
    public C187518xL A03;
    public C1677382i A04;
    public boolean A05 = false;
    public final C183718qV A06;
    public final Runnable A07 = new C172668Mf(this, 6);
    public final ScheduledExecutorService A08;

    public final synchronized void A00() {
        if (!this.A05) {
            this.A05 = true;
            this.A08.schedule(this.A07, 1000, TimeUnit.MILLISECONDS);
        }
    }

    public boolean B2D(Canvas canvas, Drawable drawable, int i) {
        this.A00 = this.A06.now();
        boolean A1S = AnonymousClass000.A1S(this.A03.B2D(canvas, drawable, i) ? 1 : 0);
        A00();
        return A1S;
    }

    public int B7s(int i) {
        return this.A03.B7s(i);
    }

    public int B8R() {
        return this.A03.B8R();
    }

    public int B8S() {
        return this.A03.B8S();
    }

    public void Blf(int i) {
        this.A03.Blf(i);
    }

    public void Blg(AnonymousClass7AM r2) {
        this.A03.Blg(r2);
    }

    public void Blp(Rect rect) {
        this.A03.Blp(rect);
        this.A02 = rect;
    }

    public void Bly(ColorFilter colorFilter) {
        this.A03.Bly(colorFilter);
        this.A01 = colorFilter;
    }

    public int getFrameCount() {
        return this.A03.getFrameCount();
    }

    public int getLoopCount() {
        return this.A03.getLoopCount();
    }

    public C1677282h(C183718qV r3, C187518xL r4, C1677382i r5, ScheduledExecutorService scheduledExecutorService) {
        this.A03 = r4;
        this.A04 = r5;
        this.A06 = r3;
        this.A08 = scheduledExecutorService;
    }
}
