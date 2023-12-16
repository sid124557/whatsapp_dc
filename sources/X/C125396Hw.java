package X;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.6Hw  reason: invalid class name and case insensitive filesystem */
public class C125396Hw extends C04580Ov {
    public float A00;
    public C011009e A01;
    public boolean A02 = false;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final Paint A09 = new Paint();
    public final Rect A0A;
    public final RectF A0B = AnonymousClass002.A07();
    public final RectF A0C = AnonymousClass002.A07();
    public final AnonymousClass7OO A0D;
    public final boolean A0E;
    public final boolean A0F;

    public void A02(Canvas canvas, AnonymousClass0Q1 r13, RecyclerView recyclerView) {
        RectF rectF;
        RectF rectF2;
        float f;
        int i;
        Rect rect;
        float width;
        C011009e r1 = this.A01;
        if (r1 != null && !this.A02 && !r1.A04 && r1.A02) {
            C12160l6 r2 = new C12160l6(recyclerView, r1);
            r1.A01 = r2;
            recyclerView.postDelayed(r2, 1500);
        }
        boolean z = true;
        this.A02 = true;
        if (this.A00 != 0.0f) {
            C06440Xs layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof LinearLayoutManager) {
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                boolean A1U = AnonymousClass000.A1U(AnonymousClass0YH.A01(linearLayoutManager.A07), 1);
                if (linearLayoutManager.A01 == 1) {
                    int A0L = linearLayoutManager.A0L(r13);
                    int A0N = linearLayoutManager.A0N(r13);
                    int height = recyclerView.getHeight();
                    boolean z2 = this.A0F;
                    if (z2) {
                        Rect rect2 = this.A0A;
                        height = (height - rect2.top) - rect2.bottom;
                    }
                    int A0M = linearLayoutManager.A0M(r13);
                    if (A0N != A0L) {
                        int round = Math.round((((float) height) * ((float) A0L)) / ((float) A0N));
                        int i2 = height / 2;
                        if (round > i2) {
                            round = i2;
                        }
                        int round2 = Math.round((((float) (height - round)) * ((float) A0M)) / ((float) (A0N - A0L)));
                        rectF = this.A0C;
                        if (A1U) {
                            rect = this.A0A;
                            int i3 = rect.right;
                            rectF.left = (float) i3;
                            width = (float) (this.A07 + i3);
                        } else {
                            rect = this.A0A;
                            rectF.left = (float) ((recyclerView.getWidth() - this.A07) - rect.right);
                            width = (float) (recyclerView.getWidth() - rect.right);
                        }
                        rectF.right = width;
                        rectF.top = (float) round2;
                        rectF.bottom = (float) (round2 + round);
                        rectF2 = this.A0B;
                        rectF2.left = rectF.left;
                        rectF2.right = width;
                        rectF2.top = 0.0f;
                        rectF2.bottom = C86664Kz.A02(recyclerView);
                        if (z2) {
                            float f2 = rectF.top;
                            float f3 = (float) rect.top;
                            rectF.top = f2 + f3;
                            rectF.bottom += f3;
                            rectF2.top += f3;
                            rectF2.bottom -= (float) rect.bottom;
                        }
                    } else {
                        return;
                    }
                } else {
                    int A0I = linearLayoutManager.A0I(r13);
                    int A0K = linearLayoutManager.A0K(r13);
                    int width2 = recyclerView.getWidth();
                    boolean z3 = this.A0F;
                    if (z3) {
                        Rect rect3 = this.A0A;
                        width2 = (width2 - rect3.left) - rect3.right;
                    }
                    int A0J = linearLayoutManager.A0J(r13);
                    if (A0K != A0I) {
                        int round3 = Math.round((((float) width2) * ((float) A0I)) / ((float) A0K));
                        int i4 = width2 / 2;
                        if (round3 > i4) {
                            round3 = i4;
                        }
                        int round4 = Math.round((((float) (width2 - round3)) * ((float) A0J)) / ((float) (A0K - A0I)));
                        rectF = this.A0C;
                        rectF.left = (float) round4;
                        rectF.right = (float) (round4 + round3);
                        Rect rect4 = this.A0A;
                        rectF.top = (float) ((recyclerView.getHeight() - this.A07) - rect4.bottom);
                        rectF.bottom = (float) (recyclerView.getHeight() - rect4.bottom);
                        rectF2 = this.A0B;
                        rectF2.left = 0.0f;
                        rectF2.top = rectF.top;
                        rectF2.right = AnonymousClass4L0.A00(recyclerView);
                        rectF2.bottom = rectF.bottom;
                        if (z3) {
                            float f4 = rectF.left;
                            if (A1U) {
                                float f5 = (float) rect4.right;
                                rectF.left = f4 + f5;
                                rectF.right += f5;
                                rectF2.left += f5;
                                f = rectF2.right;
                                i = rect4.left;
                            } else {
                                float f6 = (float) rect4.left;
                                rectF.left = f4 + f6;
                                rectF.right += f6;
                                rectF2.left += f6;
                                f = rectF2.right;
                                i = rect4.right;
                            }
                            rectF2.right = f - ((float) i);
                        }
                    } else {
                        return;
                    }
                }
                int i5 = this.A03;
                if (i5 != 0) {
                    AnonymousClass7OO r8 = this.A0D;
                    float f7 = r8.A03;
                    if (f7 == 0.0f || !canvas.isHardwareAccelerated()) {
                        z = false;
                    } else {
                        this.A09.setShadowLayer(f7, r8.A01, r8.A00, r8.A05);
                    }
                    Paint paint = this.A09;
                    paint.setColor(i5);
                    paint.setAlpha((int) (this.A00 * ((float) this.A04)));
                    float f8 = (float) this.A06;
                    canvas.drawRoundRect(rectF2, f8, f8, paint);
                    if (z) {
                        paint.clearShadowLayer();
                    }
                }
                Paint paint2 = this.A09;
                paint2.setColor(this.A05);
                paint2.setAlpha((int) (this.A00 * ((float) this.A08)));
                float f9 = (float) this.A06;
                canvas.drawRoundRect(rectF, f9, f9, paint2);
            }
        }
    }

    public float A04() {
        return this.A00;
    }

    public void A05(float f) {
        this.A00 = f;
    }

    public void A06(C011009e r1) {
        this.A01 = r1;
    }

    public C125396Hw(Rect rect, AnonymousClass7OO r3, int i, int i2, int i3, int i4, boolean z, boolean z2) {
        this.A03 = i2;
        this.A05 = i;
        this.A08 = Color.alpha(i);
        this.A04 = Color.alpha(i2);
        this.A07 = i3;
        this.A06 = i4;
        this.A0E = z;
        if (z) {
            this.A00 = 1.0f;
        }
        this.A0A = rect;
        this.A0F = z2;
        this.A0D = r3;
    }
}
