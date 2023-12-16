package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: X.82i  reason: invalid class name and case insensitive filesystem */
public final class C1677382i implements C187518xL {
    public int A00;
    public int A01;
    public Rect A02;
    public AnonymousClass7AM A03;
    public final Bitmap.Config A04 = Bitmap.Config.ARGB_8888;
    public final Matrix A05 = new Matrix();
    public final Paint A06 = new Paint(6);
    public final Path A07 = AnonymousClass002.A06();
    public final C184798sX A08;
    public final C186188ut A09;
    public final C185268tM A0A;
    public final AnonymousClass7NW A0B;
    public final C151077Ti A0C;
    public final C157827iw A0D;
    public final boolean A0E;

    public C1677382i(C184798sX r3, C186188ut r4, C185268tM r5, AnonymousClass7NW r6, C151077Ti r7, C157827iw r8, boolean z) {
        C162457s7.A0J(r8, 1);
        this.A0D = r8;
        this.A09 = r4;
        this.A08 = r3;
        this.A0C = r7;
        this.A0E = z;
        this.A0A = r5;
        this.A0B = r6;
        A00();
    }

    public final boolean A01(Canvas canvas, int i, int i2) {
        C172258Kh r3 = null;
        try {
            boolean z = false;
            int i3 = 1;
            if (this.A0E) {
                C185268tM r2 = this.A0A;
                if (r2 == null) {
                    return false;
                }
                C172258Kh B4e = r2.B4e(i, canvas.getWidth(), canvas.getHeight());
                if (B4e != null) {
                    try {
                        if (B4e.A04()) {
                            Bitmap A002 = C172258Kh.A00(B4e);
                            Rect rect = this.A02;
                            if (rect == null) {
                                canvas.drawBitmap(A002, 0.0f, 0.0f, this.A06);
                            } else {
                                rect.width();
                                rect.height();
                                canvas.drawBitmap(A002, (Rect) null, rect, this.A06);
                            }
                            B4e.close();
                            return true;
                        }
                    } catch (Throwable th) {
                        th = th;
                        r3 = B4e;
                        if (r3 != null) {
                            r3.close();
                        }
                        throw th;
                    }
                }
                r2.BhM((AnonymousClass4GP) null, canvas.getWidth(), canvas.getHeight());
                if (B4e == null) {
                    return false;
                }
                B4e.close();
                return false;
            }
            if (i2 == 0) {
                r3 = this.A09.B54(i);
                z = A02(canvas, r3, i, 0);
            } else if (i2 == 1) {
                r3 = this.A09.B4f(i, this.A01, this.A00);
                if (r3 != null && r3.A04()) {
                    if (!this.A0C.A00(C172258Kh.A00(r3), i)) {
                        r3.close();
                    } else if (A02(canvas, r3, i, 1)) {
                        z = true;
                    }
                }
                i3 = 2;
            } else if (i2 != 2) {
                r3 = this.A09.B7Z(i);
                z = A02(canvas, r3, i, 3);
                i3 = -1;
            } else {
                r3 = this.A0D.A01(this.A04, this.A01, this.A00);
                if (r3.A04()) {
                    if (!this.A0C.A00(C172258Kh.A00(r3), i)) {
                        r3.close();
                    } else if (A02(canvas, r3, i, 2)) {
                        z = true;
                    }
                }
                i3 = 3;
                r3.close();
                if (z && i3 != -1) {
                    return A01(canvas, i, i3);
                }
            }
            if (r3 != null) {
                r3.close();
            }
            return z ? z : z;
        } catch (RuntimeException e) {
            Class<C1677382i> cls = C1677382i.class;
            C186438vJ r1 = C161577py.A00;
            if (!r1.BI0(5)) {
                return false;
            }
            r1.BsK(cls.getSimpleName(), "Failed to create frame bitmap", e);
            return false;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public boolean B2D(Canvas canvas, Drawable drawable, int i) {
        AnonymousClass7NW r5;
        C185268tM r2;
        C162457s7.A0J(canvas, 1);
        int i2 = i;
        boolean A012 = A01(canvas, i, 0);
        if (!(this.A0E || (r5 = this.A0B) == null || (r2 = this.A0A) == null)) {
            r2.BhN(this, this.A09, r5, (AnonymousClass4GP) null, i2);
        }
        return A012;
    }

    public final void A00() {
        int i;
        C151077Ti r2 = this.A0C;
        int width = r2.A00.A06.getWidth();
        this.A01 = width;
        int i2 = -1;
        if (width == -1) {
            Rect rect = this.A02;
            if (rect != null) {
                i = rect.width();
            } else {
                i = -1;
            }
            this.A01 = i;
        }
        int height = r2.A00.A06.getHeight();
        this.A00 = height;
        if (height == -1) {
            Rect rect2 = this.A02;
            if (rect2 != null) {
                i2 = rect2.height();
            }
            this.A00 = i2;
        }
    }

    public final boolean A02(Canvas canvas, C172258Kh r6, int i, int i2) {
        if (r6 == null || !C172258Kh.A01(r6)) {
            return false;
        }
        Bitmap A002 = C172258Kh.A00(r6);
        Rect rect = this.A02;
        if (rect == null) {
            canvas.drawBitmap(A002, 0.0f, 0.0f, this.A06);
        } else {
            rect.width();
            rect.height();
            canvas.drawBitmap(A002, (Rect) null, rect, this.A06);
        }
        if (i2 == 3 || this.A0E) {
            return true;
        }
        this.A09.BTs(r6, i, i2);
        return true;
    }

    public int B7s(int i) {
        return this.A08.B7s(i);
    }

    public int B8R() {
        return this.A00;
    }

    public int B8S() {
        return this.A01;
    }

    public void Blf(int i) {
        this.A06.setAlpha(i);
    }

    public void Blg(AnonymousClass7AM r1) {
        this.A03 = r1;
    }

    public void Blp(Rect rect) {
        this.A02 = rect;
        C151077Ti r4 = this.A0C;
        C158637kJ r3 = r4.A00;
        if (!C158637kJ.A00(rect, r3.A06).equals(r3.A05)) {
            r3 = new C158637kJ(rect, r3.A07, r3.A08, r3.A09);
        }
        if (r3 != r4.A00) {
            r4.A00 = r3;
            r4.A01 = new C152947aQ(r3, r4.A03, r4.A04);
        }
        A00();
    }

    public void Bly(ColorFilter colorFilter) {
        this.A06.setColorFilter(colorFilter);
    }

    public int getFrameCount() {
        return this.A08.getFrameCount();
    }

    public int getLoopCount() {
        return this.A08.getLoopCount();
    }
}
