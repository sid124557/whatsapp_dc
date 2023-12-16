package X;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.01G  reason: invalid class name */
public class AnonymousClass01G extends Drawable implements Animatable, Drawable.Callback {
    public float A00;
    public int A01;
    public AnonymousClass0GZ A02;
    public C15430rK A03;
    public AnonymousClass0QL A04;
    public C02400Ga A05;
    public AnonymousClass0MT A06;
    public AnonymousClass0TI A07;
    public C01680Bu A08;
    public String A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public final ValueAnimator.AnimatorUpdateListener A0I;
    public final Matrix A0J = AnonymousClass002.A05();
    public final AnonymousClass00H A0K;
    public final ArrayList A0L;

    public void draw(Canvas canvas) {
        this.A0D = false;
        if (this.A0G) {
            try {
                A0B(canvas);
            } catch (Throwable unused) {
            }
        } else {
            A0B(canvas);
        }
        AnonymousClass0K1.A01();
    }

    public void A00() {
        AnonymousClass00H r1 = this.A0K;
        if (r1.A07) {
            r1.cancel();
        }
        this.A04 = null;
        this.A08 = null;
        this.A07 = null;
        r1.A06 = null;
        r1.A02 = -2.14748365E9f;
        r1.A01 = 2.14748365E9f;
        invalidateSelf();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001e, code lost:
        if (r2.getRepeatCount() == 0) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01() {
        /*
            r3 = this;
            X.0Bu r0 = r3.A08
            if (r0 != 0) goto L_0x0010
            java.util.ArrayList r2 = r3.A0L
            r1 = 0
            X.0wN r0 = new X.0wN
            r0.<init>(r3, r1)
            r2.add(r0)
        L_0x000f:
            return
        L_0x0010:
            boolean r0 = r3.A0H
            if (r0 != 0) goto L_0x0020
            boolean r0 = r3.A0B
            if (r0 != 0) goto L_0x0020
            X.00H r2 = r3.A0K
            int r0 = r2.getRepeatCount()
            if (r0 != 0) goto L_0x0025
        L_0x0020:
            X.00H r2 = r3.A0K
            r2.A05()
        L_0x0025:
            boolean r0 = r3.A0H
            if (r0 != 0) goto L_0x000f
            boolean r0 = r3.A0B
            if (r0 != 0) goto L_0x000f
            float r1 = r2.A03
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x004c
            float r0 = r2.A03()
        L_0x0038:
            int r0 = (int) r0
            r3.A07(r0)
            X.AnonymousClass00H.A00(r2)
            float r1 = r2.A03
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            boolean r0 = X.AnonymousClass001.A1V(r0)
            r2.A09(r0)
            return
        L_0x004c:
            float r0 = r2.A02()
            goto L_0x0038
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass01G.A01():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001e, code lost:
        if (r2.getRepeatCount() == 0) goto L_0x0020;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02() {
        /*
            r3 = this;
            X.0Bu r0 = r3.A08
            if (r0 != 0) goto L_0x0010
            java.util.ArrayList r2 = r3.A0L
            r1 = 1
            X.0wN r0 = new X.0wN
            r0.<init>(r3, r1)
            r2.add(r0)
        L_0x000f:
            return
        L_0x0010:
            boolean r0 = r3.A0H
            if (r0 != 0) goto L_0x0020
            boolean r0 = r3.A0B
            if (r0 != 0) goto L_0x0020
            X.00H r2 = r3.A0K
            int r0 = r2.getRepeatCount()
            if (r0 != 0) goto L_0x0043
        L_0x0020:
            X.00H r2 = r3.A0K
            r0 = 1
            r2.A07 = r0
            r2.A06()
            r0 = 0
            r2.A05 = r0
            float r1 = r2.A03
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            float r1 = r2.A00
            if (r0 >= 0) goto L_0x006f
            float r0 = r2.A03()
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0043
            float r0 = r2.A02()
        L_0x0041:
            r2.A00 = r0
        L_0x0043:
            boolean r0 = r3.A0H
            if (r0 != 0) goto L_0x000f
            boolean r0 = r3.A0B
            if (r0 != 0) goto L_0x000f
            float r1 = r2.A03
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x006a
            float r0 = r2.A03()
        L_0x0056:
            int r0 = (int) r0
            r3.A07(r0)
            X.AnonymousClass00H.A00(r2)
            float r1 = r2.A03
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            boolean r0 = X.AnonymousClass001.A1V(r0)
            r2.A09(r0)
            return
        L_0x006a:
            float r0 = r2.A02()
            goto L_0x0056
        L_0x006f:
            float r0 = r2.A02()
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0043
            float r0 = r2.A03()
            goto L_0x0041
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass01G.A02():void");
    }

    public final void A03() {
        AnonymousClass0QL r5 = this.A04;
        Rect rect = r5.A04;
        List emptyList = Collections.emptyList();
        C02190Ff r10 = C02190Ff.PRE_COMP;
        List emptyList2 = Collections.emptyList();
        C09510gJ r9 = new C09510gJ();
        int width = rect.width();
        int height = rect.height();
        C04510Oo r4 = new C04510Oo(r5, (C01610Bn) null, (C01600Bm) null, (AnonymousClass0MC) null, r9, r10, AnonymousClass0FS.NONE, "__container", (String) null, emptyList, emptyList2, Collections.emptyList(), 0.0f, 0.0f, 0, 0, 0, width, height, -1, -1, false);
        AnonymousClass0QL r3 = this.A04;
        C01680Bu r1 = new C01680Bu(r3, this, r4, r3.A07);
        this.A08 = r1;
        if (this.A0E) {
            r1.A0A(true);
        }
    }

    public void A04(float f) {
        AnonymousClass0QL r0 = this.A04;
        if (r0 == null) {
            this.A0L.add(new C17860wM(this, f, 2));
            return;
        }
        A08((int) AnonymousClass001.A00(r0.A00, r0.A02, f));
    }

    public void A05(float f) {
        AnonymousClass0QL r0 = this.A04;
        if (r0 == null) {
            this.A0L.add(new C17860wM(this, f, 1));
            return;
        }
        A09((int) AnonymousClass001.A00(r0.A00, r0.A02, f));
    }

    public void A06(float f) {
        AnonymousClass0QL r0 = this.A04;
        if (r0 == null) {
            this.A0L.add(new C17860wM(this, f, 0));
            return;
        }
        this.A0K.A07(AnonymousClass001.A00(r0.A00, r0.A02, f));
        AnonymousClass0K1.A01();
    }

    public void A07(int i) {
        if (this.A04 == null) {
            this.A0L.add(new C17850wL(this, i, 0));
        } else {
            this.A0K.A07((float) i);
        }
    }

    public void A08(int i) {
        if (this.A04 == null) {
            this.A0L.add(new C17850wL(this, i, 2));
            return;
        }
        AnonymousClass00H r2 = this.A0K;
        r2.A08(r2.A02, ((float) i) + 0.99f);
    }

    public void A09(int i) {
        if (this.A04 == null) {
            this.A0L.add(new C17850wL(this, i, 1));
            return;
        }
        AnonymousClass00H r2 = this.A0K;
        r2.A08((float) i, (float) ((int) r2.A01));
    }

    public void A0A(int i, int i2) {
        if (this.A04 == null) {
            this.A0L.add(new C09170fl(this, i, i2));
        } else {
            this.A0K.A08((float) i, ((float) i2) + 0.99f);
        }
    }

    public final void A0B(Canvas canvas) {
        int i;
        AnonymousClass0QL r2 = this.A04;
        if (r2 != null && !getBounds().isEmpty()) {
            Rect bounds = getBounds();
            Rect rect = r2.A04;
            if (((float) bounds.width()) / ((float) bounds.height()) != ((float) rect.width()) / ((float) rect.height())) {
                if (this.A08 != null) {
                    Rect bounds2 = getBounds();
                    float width = ((float) bounds2.width()) / ((float) this.A04.A04.width());
                    float height = ((float) bounds2.height()) / ((float) this.A04.A04.height());
                    int i2 = -1;
                    float min = Math.min(width, height);
                    if (min < 1.0f) {
                        float f = 1.0f / min;
                        width /= f;
                        height /= f;
                        if (f > 1.0f) {
                            i2 = canvas.save();
                            float width2 = ((float) bounds2.width()) / 2.0f;
                            float height2 = ((float) bounds2.height()) / 2.0f;
                            float f2 = width2 * min;
                            float f3 = min * height2;
                            canvas.translate(width2 - f2, height2 - f3);
                            canvas.scale(f, f, f2, f3);
                        }
                    }
                    Matrix matrix = this.A0J;
                    matrix.reset();
                    matrix.preScale(width, height);
                    this.A08.B2C(canvas, matrix, this.A01);
                    if (i2 > 0) {
                        canvas.restoreToCount(i2);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        if (this.A08 != null) {
            float f4 = this.A00;
            float min2 = Math.min(((float) canvas.getWidth()) / ((float) this.A04.A04.width()), ((float) canvas.getHeight()) / ((float) this.A04.A04.height()));
            if (f4 > min2) {
                float f5 = this.A00 / min2;
                if (f5 > 1.0f) {
                    i = canvas.save();
                    float width3 = ((float) this.A04.A04.width()) / 2.0f;
                    float height3 = ((float) this.A04.A04.height()) / 2.0f;
                    float f6 = width3 * min2;
                    float f7 = height3 * min2;
                    float f8 = this.A00;
                    canvas.translate((f8 * width3) - f6, (f8 * height3) - f7);
                    canvas.scale(f5, f5, f6, f7);
                }
                i = -1;
            } else {
                min2 = f4;
                i = -1;
            }
            Matrix matrix2 = this.A0J;
            matrix2.reset();
            matrix2.preScale(min2, min2);
            this.A08.B2C(canvas, matrix2, this.A01);
            if (i > 0) {
                canvas.restoreToCount(i);
            }
        }
    }

    public void A0C(AnonymousClass0WB r7, C05560Tz r8, Object obj) {
        C01680Bu r5 = this.A08;
        if (r5 == null) {
            this.A0L.add(new C09180fm(this, r7, r8, obj));
            return;
        }
        if (r7 == AnonymousClass0WB.A02) {
            r5.Aws(r8, obj);
        } else {
            C16790ty r0 = r7.A00;
            if (r0 != null) {
                r0.Aws(r8, obj);
            } else {
                ArrayList A0s = AnonymousClass001.A0s();
                r5.Bk4(r7, new AnonymousClass0WB(new String[0]), A0s, 0);
                for (int i = 0; i < A0s.size(); i++) {
                    ((AnonymousClass0WB) A0s.get(i)).A00.Aws(r8, obj);
                }
                if (!(true ^ A0s.isEmpty())) {
                    return;
                }
            }
        }
        invalidateSelf();
        if (obj == C17150ue.A0J) {
            A06(this.A0K.A01());
        }
    }

    public void A0D(String str) {
        AnonymousClass0QL r0 = this.A04;
        if (r0 == null) {
            this.A0L.add(new C17840wK(this, str, 2));
            return;
        }
        C03820Lr A022 = r0.A02(str);
        if (A022 != null) {
            A08((int) (A022.A01 + A022.A00));
            return;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Cannot find marker with name ");
        A0o.append(str);
        throw AnonymousClass000.A0F(".", A0o);
    }

    public void A0E(String str) {
        AnonymousClass0QL r0 = this.A04;
        if (r0 == null) {
            this.A0L.add(new C17840wK(this, str, 0));
            return;
        }
        C03820Lr A022 = r0.A02(str);
        if (A022 != null) {
            int i = (int) A022.A01;
            A0A(i, ((int) A022.A00) + i);
            return;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Cannot find marker with name ");
        A0o.append(str);
        throw AnonymousClass000.A0F(".", A0o);
    }

    public void A0F(String str) {
        AnonymousClass0QL r0 = this.A04;
        if (r0 == null) {
            this.A0L.add(new C17840wK(this, str, 1));
            return;
        }
        C03820Lr A022 = r0.A02(str);
        if (A022 != null) {
            A09((int) A022.A01);
            return;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Cannot find marker with name ");
        A0o.append(str);
        throw AnonymousClass000.A0F(".", A0o);
    }

    public boolean A0G(AnonymousClass0QL r5) {
        float f;
        float f2;
        if (this.A04 == r5) {
            return false;
        }
        this.A0D = false;
        A00();
        this.A04 = r5;
        A03();
        AnonymousClass00H r3 = this.A0K;
        boolean A1X = AnonymousClass000.A1X(r3.A06);
        r3.A06 = r5;
        if (A1X) {
            f = (float) ((int) Math.max(r3.A02, r5.A02));
            f2 = Math.min(r3.A01, r5.A00);
        } else {
            f = (float) ((int) r5.A02);
            f2 = r5.A00;
        }
        r3.A08(f, (float) ((int) f2));
        float f3 = r3.A00;
        r3.A00 = 0.0f;
        r3.A07((float) ((int) f3));
        r3.A04();
        A06(r3.getAnimatedFraction());
        this.A00 = this.A00;
        ArrayList arrayList = this.A0L;
        Iterator it = AnonymousClass002.A0J(arrayList).iterator();
        while (it.hasNext()) {
            C16190sc r0 = (C16190sc) it.next();
            if (r0 != null) {
                r0.BkJ(r5);
            }
            it.remove();
        }
        arrayList.clear();
        r5.A0D.A00 = this.A0F;
        Drawable.Callback callback = getCallback();
        if (callback instanceof ImageView) {
            ImageView imageView = (ImageView) callback;
            imageView.setImageDrawable((Drawable) null);
            imageView.setImageDrawable(this);
        }
        return true;
    }

    public int getAlpha() {
        return this.A01;
    }

    public int getIntrinsicHeight() {
        AnonymousClass0QL r0 = this.A04;
        if (r0 == null) {
            return -1;
        }
        return (int) (((float) r0.A04.height()) * this.A00);
    }

    public int getIntrinsicWidth() {
        AnonymousClass0QL r0 = this.A04;
        if (r0 == null) {
            return -1;
        }
        return (int) (((float) r0.A04.width()) * this.A00);
    }

    public int getOpacity() {
        return -3;
    }

    public void invalidateSelf() {
        if (!this.A0D) {
            this.A0D = true;
            Drawable.Callback callback = getCallback();
            if (callback != null) {
                callback.invalidateDrawable(this);
            }
        }
    }

    public boolean isRunning() {
        AnonymousClass00H r0 = this.A0K;
        if (r0 == null) {
            return false;
        }
        return r0.A07;
    }

    public void setAlpha(int i) {
        this.A01 = i;
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        AnonymousClass0S3.A00("Use addColorFilter instead.");
    }

    public void stop() {
        this.A0L.clear();
        AnonymousClass00H r2 = this.A0K;
        AnonymousClass00H.A00(r2);
        r2.A09(AnonymousClass001.A1V((r2.A03 > 0.0f ? 1 : (r2.A03 == 0.0f ? 0 : -1))));
    }

    public AnonymousClass01G() {
        AnonymousClass00H r4 = new AnonymousClass00H();
        this.A0K = r4;
        this.A00 = 1.0f;
        this.A0H = true;
        this.A0B = false;
        this.A0G = false;
        this.A0L = AnonymousClass001.A0s();
        C02910Ib r1 = new C02910Ib(this, 1);
        this.A0I = r1;
        this.A01 = 255;
        this.A0D = false;
        r4.addUpdateListener(r1);
    }

    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    public void start() {
        Drawable.Callback callback = getCallback();
        if ((callback instanceof View) && !((View) callback).isInEditMode()) {
            A01();
        }
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }
}
