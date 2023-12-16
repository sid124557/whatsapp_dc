package com.whatsapp.mediacomposer;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0x7;
import X.AnonymousClass4FS;
import X.AnonymousClass4GJ;
import X.AnonymousClass4TK;
import X.AnonymousClass55T;
import X.AnonymousClass5ZM;
import X.AnonymousClass8HX;
import X.C06560Yg;
import X.C107385bE;
import X.C116855qy;
import X.C1458477n;
import X.C179428j8;
import X.C182588of;
import X.C182698oq;
import X.C620733j;
import X.C64333Db;
import X.C86604Kt;
import X.C86624Kv;
import X.C86654Ky;
import X.C88864av;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.whatsapp.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

public class VideoTimelineView extends View implements C182698oq, AnonymousClass4GJ {
    public static final long A0U = C86654Ky.A09(TimeUnit.SECONDS);
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public long A0D;
    public long A0E;
    public long A0F;
    public long A0G;
    public C620733j A0H;
    public C182588of A0I;
    public C179428j8 A0J;
    public AnonymousClass4TK A0K;
    public AnonymousClass5ZM A0L;
    public AnonymousClass4FS A0M;
    public C116855qy A0N;
    public File A0O;
    public ArrayList A0P;
    public boolean A0Q;
    public final Paint A0R;
    public final Rect A0S;
    public final RectF A0T;

    public final void A03(float f) {
        int i;
        if (this.A01 != f && (i = this.A0A) != 0) {
            float f2 = f - this.A02;
            if (i == 1) {
                long A012 = A01(this.A03 + f2);
                long j = this.A0G;
                long max = Math.max(0, Math.min(A012, j));
                this.A0F = max;
                long j2 = this.A0E;
                if (j - max > j2) {
                    this.A0G = max + j2;
                }
            } else if (i != 2) {
                long j3 = this.A0G - this.A0F;
                long A013 = A01(this.A03 + f2);
                this.A0F = A013;
                if (A013 == 0) {
                    this.A0G = A013 + j3;
                } else {
                    long A014 = A01(this.A04 + f2);
                    this.A0G = A014;
                    if (A014 == this.A0D) {
                        this.A0F = A014 - j3;
                    }
                }
            } else {
                long A015 = A01(this.A04 + f2);
                long j4 = this.A0D;
                long j5 = this.A0F;
                long min = Math.min(j4, Math.max(A015, j5));
                this.A0G = min;
                long j6 = this.A0E;
                if (min - j5 > j6) {
                    this.A0F = min - j6;
                }
            }
            this.A01 = f;
            invalidate();
            C182588of r7 = this.A0I;
            if (r7 != null) {
                r7.Be7(this, this.A0A, this.A0F, this.A0G);
            }
        }
    }

    public final long A01(float f) {
        return Math.min(this.A0D, Math.max((long) ((((float) this.A0D) * (f - ((float) getPaddingLeft()))) / ((float) getTimelineWidth())), 0));
    }

    public void A02() {
        if (!this.A0Q) {
            this.A0Q = true;
            C64333Db A002 = C88864av.A00(generatedComponent());
            this.A0M = C64333Db.A8y(A002);
            this.A0H = C64333Db.A2t(A002);
        }
    }

    public final void A04(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            AnonymousClass4TK r0 = new AnonymousClass4TK(this, this, context.getResources().getDimensionPixelSize(R.dimen.f6nameremoved));
            this.A0K = r0;
            C06560Yg.A0O(this, r0);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1458477n.A00);
            this.A00 = obtainStyledAttributes.getDimension(1, this.A00);
            this.A07 = obtainStyledAttributes.getInteger(0, this.A07);
            this.A05 = obtainStyledAttributes.getDimension(5, this.A05);
            this.A0B = obtainStyledAttributes.getInteger(3, this.A0B);
            this.A06 = obtainStyledAttributes.getDimension(6, this.A06);
            this.A0C = obtainStyledAttributes.getInteger(4, this.A0C);
            this.A08 = obtainStyledAttributes.getInteger(2, this.A08);
            obtainStyledAttributes.recycle();
        }
    }

    public void Bs1(int i, boolean z) {
        long j;
        int i2 = i;
        if (z) {
            long j2 = this.A0F;
            j = A0U;
            long j3 = this.A0G;
            long max = Math.max(0, Math.min(j2 + (j * ((long) i2)), j3));
            this.A0F = max;
            long j4 = this.A0E;
            if (j3 - max > j4) {
                this.A0G = max + j4;
            }
        } else {
            long j5 = this.A0G;
            j = A0U;
            long j6 = this.A0D;
            long j7 = this.A0F;
            long min = Math.min(j6, Math.max(j5 + (j * ((long) i2)), j7));
            this.A0G = min;
            long j8 = this.A0E;
            if (min - j7 > j8) {
                this.A0F = min - j8;
            }
        }
        invalidate();
        C182588of r11 = this.A0I;
        if (r11 != null) {
            r11.Be7(this, this.A0A, this.A0F, this.A0G);
        }
        long j9 = this.A0G / j;
        C620733j r7 = this.A0H;
        Object[] A0M2 = AnonymousClass002.A0M();
        AnonymousClass000.A1Q(A0M2, 0, this.A0F / j);
        AnonymousClass000.A1Q(A0M2, 1, j9);
        announceForAccessibility(r7.A0L(A0M2, R.plurals.f9nameremoved, j9));
    }

    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (this.A0K.A0S(motionEvent) || super.dispatchHoverEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A0N;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A0N = r0;
        }
        return r0.generatedComponent();
    }

    public void onDraw(Canvas canvas) {
        int i;
        float f;
        int i2;
        float f2;
        Canvas canvas2 = canvas;
        super.onDraw(canvas2);
        if (this.A0O != null) {
            int timelineWidth = getTimelineWidth();
            int timelineHeight = getTimelineHeight();
            if (timelineHeight > 0 && timelineWidth > 0) {
                if (this.A09 != timelineWidth) {
                    this.A09 = timelineWidth;
                    this.A0P = null;
                    AnonymousClass5ZM r0 = this.A0L;
                    if (r0 != null) {
                        r0.A0D(true);
                        this.A0L = null;
                    }
                }
                if (this.A0P != null) {
                    float f3 = ((float) timelineWidth) / ((float) (timelineWidth / timelineHeight));
                    RectF rectF = this.A0T;
                    rectF.top = (float) getPaddingTop();
                    rectF.bottom = (float) (getPaddingTop() + timelineHeight);
                    for (int i3 = 0; i3 < this.A0P.size(); i3++) {
                        float paddingLeft = ((float) getPaddingLeft()) + (((float) i3) * f3);
                        rectF.left = paddingLeft;
                        rectF.right = paddingLeft + f3;
                        Bitmap bitmap = (Bitmap) this.A0P.get(i3);
                        if (bitmap != null) {
                            int width = bitmap.getWidth();
                            int height = bitmap.getHeight();
                            Rect rect = this.A0S;
                            if (width > height) {
                                rect.top = 0;
                                rect.bottom = height;
                                int i4 = (width - height) / 2;
                                rect.left = i4;
                                rect.right = i4 + height;
                            } else {
                                rect.left = 0;
                                rect.right = width;
                                int i5 = (height - width) / 2;
                                rect.top = i5;
                                rect.bottom = i5 + width;
                            }
                            canvas2.drawBitmap(bitmap, rect, rectF, this.A0R);
                        }
                    }
                } else if (this.A0L == null) {
                    int i6 = timelineWidth / timelineHeight;
                    this.A0P = AnonymousClass002.A0I(i6);
                    AnonymousClass55T r13 = new AnonymousClass55T(this, this.A0O, ((float) timelineWidth) / ((float) i6), (float) timelineHeight, i6);
                    this.A0L = r13;
                    AnonymousClass0x7.A1B(r13, this.A0M);
                }
                if (this.A0I != null) {
                    float A002 = (float) A00(this.A0F);
                    float A003 = (float) A00(this.A0G);
                    Paint paint = this.A0R;
                    AnonymousClass001.A10(paint);
                    paint.setColor(this.A08);
                    RectF rectF2 = this.A0T;
                    rectF2.set((float) getPaddingLeft(), (float) getPaddingTop(), A002, (float) AnonymousClass001.A0H(this));
                    canvas2.drawRect(rectF2, paint);
                    rectF2.set(A003, (float) getPaddingTop(), (float) AnonymousClass001.A0I(this), (float) AnonymousClass001.A0H(this));
                    canvas2.drawRect(rectF2, paint);
                    C179428j8 r02 = this.A0J;
                    if (r02 != null) {
                        VideoComposerFragment videoComposerFragment = ((AnonymousClass8HX) r02).A00;
                        if (videoComposerFragment.A0W.A0a()) {
                            videoComposerFragment.A05 = (long) videoComposerFragment.A0W.A05();
                        }
                        long j = videoComposerFragment.A05;
                        if (j >= 0 && j >= this.A0F && j <= this.A0G) {
                            C86624Kv.A0e(this.A07, paint);
                            paint.setStrokeWidth(this.A00 / 2.0f);
                            float A004 = (float) A00(j);
                            canvas2.drawLine(A004, (float) getPaddingTop(), A004, (float) AnonymousClass001.A0H(this), paint);
                        }
                        if (((AnonymousClass8HX) this.A0J).A00.A0W.A0a()) {
                            invalidate();
                        }
                    }
                    C86624Kv.A0e(this.A07, paint);
                    paint.setStrokeWidth(this.A00);
                    rectF2.set(A002 - 1.0f, (float) getPaddingTop(), 1.0f + A003, (float) AnonymousClass001.A0H(this));
                    canvas2.drawRect(rectF2, paint);
                    AnonymousClass001.A10(paint);
                    if (this.A0A == 1) {
                        i = this.A0C;
                    } else {
                        i = this.A0B;
                    }
                    paint.setColor(i);
                    int i7 = timelineHeight / 2;
                    float paddingTop = (float) (getPaddingTop() + i7);
                    if (this.A0A == 1) {
                        f = this.A06;
                    } else {
                        f = this.A05;
                    }
                    canvas2.drawCircle(A002, paddingTop, f, paint);
                    if (this.A0A == 2) {
                        i2 = this.A0C;
                    } else {
                        i2 = this.A0B;
                    }
                    paint.setColor(i2);
                    float paddingTop2 = (float) (getPaddingTop() + i7);
                    if (this.A0A == 2) {
                        f2 = this.A06;
                    } else {
                        f2 = this.A05;
                    }
                    canvas2.drawCircle(A003, paddingTop2, f2, paint);
                    int i8 = (int) A002;
                    int i9 = (int) A003;
                    int paddingTop3 = getPaddingTop();
                    int A0H2 = AnonymousClass001.A0H(this);
                    AnonymousClass4TK r3 = this.A0K;
                    Rect rect2 = r3.A02;
                    int i10 = r3.A05;
                    rect2.left = i8 - i10;
                    rect2.right = i8;
                    rect2.top = paddingTop3;
                    rect2.bottom = A0H2;
                    Rect rect3 = r3.A03;
                    rect3.left = i8;
                    rect3.right = i8 + i10;
                    rect3.top = paddingTop3;
                    rect3.bottom = A0H2;
                    Rect rect4 = r3.A00;
                    rect4.left = i9 - i10;
                    rect4.right = i9;
                    rect4.top = paddingTop3;
                    rect4.bottom = A0H2;
                    Rect rect5 = r3.A01;
                    rect5.left = i9;
                    rect5.right = i9 + i10;
                    rect5.top = paddingTop3;
                    rect5.bottom = A0H2;
                    r3.A04 = true;
                    r3.A0H();
                }
            }
        } else if (isInEditMode()) {
            Paint paint2 = this.A0R;
            AnonymousClass001.A10(paint2);
            paint2.setColor(this.A08);
            RectF rectF3 = this.A0T;
            rectF3.set((float) getPaddingLeft(), (float) getPaddingTop(), (float) AnonymousClass001.A0I(this), (float) AnonymousClass001.A0H(this));
            canvas2.drawRect(rectF3, paint2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0024, code lost:
        if (r1 != 3) goto L_0x0026;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00cf, code lost:
        if (X.AnonymousClass001.A04(r11, r6) <= 0.5f) goto L_0x0109;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0105, code lost:
        if (r6 >= (r9 - r8)) goto L_0x0107;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r12) {
        /*
            r11 = this;
            X.8of r0 = r11.A0I
            if (r0 != 0) goto L_0x0009
            boolean r0 = super.onTouchEvent(r12)
            return r0
        L_0x0009:
            boolean r0 = r11.isEnabled()
            r4 = 0
            if (r0 != 0) goto L_0x0011
            return r4
        L_0x0011:
            int r0 = r12.getAction()
            r1 = r0 & 255(0xff, float:3.57E-43)
            float r6 = r12.getX()
            r5 = 1
            if (r1 == 0) goto L_0x0065
            if (r1 == r5) goto L_0x0027
            r0 = 2
            if (r1 == r0) goto L_0x010b
            r0 = 3
            if (r1 == r0) goto L_0x0027
        L_0x0026:
            return r5
        L_0x0027:
            r11.A03(r6)
            X.8of r0 = r11.A0I
            if (r0 == 0) goto L_0x0061
            X.5nX r0 = (X.C114745nX) r0
            com.whatsapp.mediacomposer.VideoComposerFragment r6 = r0.A00
            boolean r0 = r6.A0d
            if (r0 == 0) goto L_0x0041
            X.5YG r3 = r6.A0W
            long r1 = r6.A07
            int r0 = (int) r1
            r3.A0P(r0)
            r6.A1M()
        L_0x0041:
            android.widget.TextView r1 = r6.A0J
            r0 = 4
            r1.setVisibility(r0)
            android.view.animation.AlphaAnimation r2 = X.C86604Kt.A0G()
            r0 = 100
            r2.setDuration(r0)
            android.widget.TextView r0 = r6.A0J
            r0.startAnimation(r2)
            X.8uh r0 = X.C86664Kz.A1E(r6)
            r0.BRS()
            X.5Uj r0 = r6.A0S
            r0.A03()
        L_0x0061:
            r11.A0A = r4
            goto L_0x00f6
        L_0x0065:
            r11.A02 = r6
            long r0 = r11.A0F
            int r0 = r11.A00(r0)
            float r0 = (float) r0
            r11.A03 = r0
            long r0 = r11.A0G
            int r0 = r11.A00(r0)
            float r0 = (float) r0
            r11.A04 = r0
            long r0 = r11.A0F
            int r0 = r11.A00(r0)
            float r10 = (float) r0
            long r0 = r11.A0G
            int r0 = r11.A00(r0)
            float r9 = (float) r0
            float r2 = r11.A05
            int r1 = r11.getTimelineWidth()
            r0 = 3
            int r1 = r1 / r0
            int r0 = r11.getTimelineHeight()
            int r0 = java.lang.Math.min(r1, r0)
            float r0 = (float) r0
            float r8 = java.lang.Math.max(r2, r0)
            float r7 = X.AnonymousClass002.A00(r6, r10)
            r2 = 1
            int r0 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            boolean r3 = X.AnonymousClass001.A1V(r0)
            float r1 = X.AnonymousClass002.A00(r6, r9)
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            boolean r0 = X.AnonymousClass001.A1V(r0)
            if (r3 == 0) goto L_0x00fa
            if (r0 == 0) goto L_0x00d1
            int r0 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r0 < 0) goto L_0x00d1
            int r0 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r0 > 0) goto L_0x0109
            float r7 = r7 - r1
            r1 = 0
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x00d1
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0109
            float r1 = X.AnonymousClass001.A04(r11, r6)
            r0 = 1056964608(0x3f000000, float:0.5)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0109
        L_0x00d1:
            r11.A0A = r2
            X.8of r0 = r11.A0I
            if (r0 == 0) goto L_0x0026
            X.5nX r0 = (X.C114745nX) r0
            com.whatsapp.mediacomposer.VideoComposerFragment r3 = r0.A00
            X.AnonymousClass5YG.A04(r3)
            android.widget.TextView r0 = r3.A0J
            r0.setVisibility(r4)
            android.view.animation.AlphaAnimation r2 = X.C86604Kt.A0H()
            r0 = 100
            r2.setDuration(r0)
            android.widget.TextView r0 = r3.A0J
            r0.startAnimation(r2)
            X.5Uj r0 = r3.A0S
            r0.A02()
        L_0x00f6:
            r11.invalidate()
            return r5
        L_0x00fa:
            if (r0 != 0) goto L_0x0109
            float r10 = r10 + r8
            int r0 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r0 <= 0) goto L_0x0107
            float r9 = r9 - r8
            int r0 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            r2 = 3
            if (r0 < 0) goto L_0x00d1
        L_0x0107:
            r2 = 0
            goto L_0x00d1
        L_0x0109:
            r2 = 2
            goto L_0x00d1
        L_0x010b:
            r11.A03(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.mediacomposer.VideoTimelineView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public VideoTimelineView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A02();
        this.A0R = C86604Kt.A0B();
        this.A0T = AnonymousClass002.A07();
        this.A0S = AnonymousClass001.A0N();
        C86604Kt.A1S(this);
        A04(context, attributeSet);
    }

    private int getTimelineHeight() {
        return Math.max(0, AnonymousClass000.A05(this, getHeight()));
    }

    private int getTimelineWidth() {
        return Math.max(0, AnonymousClass000.A06(this, getWidth()));
    }

    public final int A00(long j) {
        return Math.min(getPaddingLeft() + getTimelineWidth(), Math.max(getPaddingLeft(), (int) (((long) getPaddingLeft()) + ((((long) getTimelineWidth()) * j) / this.A0D))));
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AnonymousClass5ZM r2 = this.A0L;
        if (r2 != null) {
            r2.A0D(true);
            this.A0L = null;
        }
        this.A0P = null;
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (C107385bE.A07()) {
            setSystemGestureExclusionRects(Collections.singletonList(new Rect(0, 0, i, i2)));
        }
    }

    public void setMaxTrim(long j) {
        this.A0E = j;
    }

    public void setTrimListener(C182588of r1) {
        this.A0I = r1;
    }

    public void setVideoPlayback(C179428j8 r1) {
        this.A0J = r1;
    }

    public VideoTimelineView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A02();
        this.A0R = C86604Kt.A0B();
        this.A0T = AnonymousClass002.A07();
        this.A0S = AnonymousClass001.A0N();
        C86604Kt.A1S(this);
        A04(context, attributeSet);
    }

    public VideoTimelineView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        A02();
        this.A0R = C86604Kt.A0B();
        this.A0T = AnonymousClass002.A07();
        this.A0S = AnonymousClass001.A0N();
        C86604Kt.A1S(this);
        A04(context, attributeSet);
    }

    public VideoTimelineView(Context context) {
        super(context);
        A02();
        this.A0R = C86604Kt.A0B();
        this.A0T = AnonymousClass002.A07();
        this.A0S = AnonymousClass001.A0N();
        C86604Kt.A1S(this);
    }

    public VideoTimelineView(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        super(context, attributeSet);
        A02();
    }
}
