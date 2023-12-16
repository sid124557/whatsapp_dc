package com.whatsapp.crop;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass4L0;
import X.AnonymousClass4TL;
import X.AnonymousClass5UE;
import X.C06560Yg;
import X.C117155rT;
import X.C117425ru;
import X.C179288iu;
import X.C18290x4;
import X.C86614Ku;
import X.C86664Kz;
import X.C94244qc;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.whatsapp.R;
import java.util.ArrayList;
import java.util.Iterator;

public class CropImageView extends C94244qc implements C179288iu {
    public float A00;
    public float A01;
    public int A02;
    public AnonymousClass5UE A03;
    public boolean A04;
    public boolean A05;
    public final AnonymousClass4TL A06;
    public final ArrayList A07;

    public void clearFocus() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.A07;
            if (i < arrayList.size()) {
                AnonymousClass5UE r1 = (AnonymousClass5UE) arrayList.get(i);
                r1.A09 = false;
                r1.A04 = r1.A03();
                i++;
            } else {
                return;
            }
        }
    }

    public final void A05(int i, int i2, int i3, int i4) {
        AnonymousClass4TL r2 = this.A06;
        Rect rect = r2.A02;
        int i5 = r2.A0P;
        rect.set(i4 - i5, i, i4, i3);
        r2.A03.set(i4, i, i5 + i4, i3);
        r2.A04.set(i2 - i5, i, i2, i3);
        r2.A05.set(i2, i, i5 + i2, i3);
        r2.A07.set(i4, i - i5, i2, i);
        r2.A06.set(i4, i, i2, i5 + i);
        r2.A01.set(i4, i3 - i5, i2, i3);
        r2.A00.set(i4, i3, i2, i5 + i3);
        r2.A0O = true;
        r2.A0H();
    }

    public void A06(AnonymousClass5UE r8) {
        Rect rect = r8.A04;
        int max = Math.max(0, -rect.left);
        int min = Math.min(0, getWidth() - rect.right);
        int max2 = Math.max(0, -rect.top);
        int min2 = Math.min(0, getHeight() - rect.bottom);
        if (max == 0 && rect.width() <= getWidth()) {
            max = min;
        }
        if (max2 == 0 && rect.height() <= getHeight()) {
            max2 = min2;
        }
        if (max != 0 || max2 != 0) {
            float f = (float) max;
            float f2 = (float) max2;
            if (f != 0.0f || f2 != 0.0f) {
                A01(f, f2);
                setImageMatrix(getImageViewMatrix());
            }
        }
    }

    public final void A07(AnonymousClass5UE r14) {
        Rect rect = r14.A04;
        float width = (float) rect.width();
        float max = Math.max(1.0f, Math.min((AnonymousClass4L0.A00(this) / width) * 0.6f, (C86664Kz.A02(this) / ((float) rect.height())) * 0.6f) * getScale());
        if (((double) (AnonymousClass002.A00(max, getScale()) / max)) > 0.1d) {
            float[] A0T = AnonymousClass4L0.A0T();
            A0T[0] = r14.A05.centerX();
            A0T[1] = r14.A05.centerY();
            getImageMatrix().mapPoints(A0T);
            float f = A0T[0];
            float f2 = A0T[1];
            this.A09.post(new C117425ru(this, new C117155rT(this, 43, r14), getScale(), (max - getScale()) / 300.0f, f, f2, System.currentTimeMillis()));
        }
    }

    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (this.A06.A0S(motionEvent) || super.dispatchHoverEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public void onDraw(Canvas canvas) {
        Paint paint;
        Paint paint2;
        Paint paint3;
        Paint paint4;
        Canvas canvas2 = canvas;
        if (!this.A05) {
            super.onDraw(canvas2);
        }
        int i = 0;
        while (true) {
            ArrayList arrayList = this.A07;
            if (i < arrayList.size()) {
                AnonymousClass5UE r8 = (AnonymousClass5UE) arrayList.get(i);
                Path A062 = AnonymousClass002.A06();
                View view = r8.A07;
                float f = C86614Ku.A0E(view).density;
                Paint paint5 = r8.A0D;
                paint5.setStrokeWidth(0.5f + f);
                Rect A0N = AnonymousClass001.A0N();
                view.getDrawingRect(A0N);
                boolean z = r8.A08;
                Rect rect = r8.A04;
                if (z) {
                    float width = (float) rect.width();
                    float height = (float) r8.A04.height();
                    Rect rect2 = r8.A04;
                    float f2 = width / 2.0f;
                    A062.addCircle(((float) rect2.left) + f2, ((float) rect2.top) + (height / 2.0f), f2, Path.Direction.CW);
                    paint5.setColor(-1112874);
                } else {
                    A062.addRect(new RectF(rect), Path.Direction.CW);
                    paint5.setColor(1728053247);
                    Rect A0N2 = AnonymousClass001.A0N();
                    A0N2.set(A0N);
                    A0N2.right = r8.A04.left;
                    if (r8.A09) {
                        paint = r8.A0B;
                    } else {
                        paint = r8.A0C;
                    }
                    canvas2.drawRect(A0N2, paint);
                    A0N2.set(A0N);
                    Rect rect3 = r8.A04;
                    A0N2.right = rect3.right;
                    A0N2.left = rect3.left;
                    A0N2.bottom = rect3.top;
                    if (r8.A09) {
                        paint2 = r8.A0B;
                    } else {
                        paint2 = r8.A0C;
                    }
                    canvas2.drawRect(A0N2, paint2);
                    A0N2.set(A0N);
                    Rect rect4 = r8.A04;
                    A0N2.right = rect4.right;
                    A0N2.left = rect4.left;
                    A0N2.top = rect4.bottom;
                    if (r8.A09) {
                        paint3 = r8.A0B;
                    } else {
                        paint3 = r8.A0C;
                    }
                    canvas2.drawRect(A0N2, paint3);
                    A0N2.set(A0N);
                    A0N2.left = r8.A04.right;
                    if (r8.A09) {
                        paint4 = r8.A0B;
                    } else {
                        paint4 = r8.A0C;
                    }
                    canvas2.drawRect(A0N2, paint4);
                    int round = Math.round(f);
                    Rect rect5 = r8.A04;
                    int i2 = rect5.left + round;
                    int i3 = rect5.right - round;
                    int i4 = rect5.top;
                    int i5 = i4 + round;
                    int i6 = rect5.bottom;
                    int i7 = i6 - round;
                    float f3 = (float) i2;
                    float f4 = (float) (((i6 - i4) / 3) + i4);
                    Paint paint6 = paint5;
                    float f5 = (float) i3;
                    canvas2.drawLine(f3, f4, f5, f4, paint6);
                    Rect rect6 = r8.A04;
                    int i8 = rect6.bottom;
                    float f6 = (float) (i8 - ((i8 - rect6.top) / 3));
                    canvas2.drawLine(f3, f6, f5, f6, paint6);
                    Rect rect7 = r8.A04;
                    int i9 = rect7.left;
                    float f7 = (float) (((rect7.right - i9) / 3) + i9);
                    float f8 = (float) i7;
                    float f9 = (float) i5;
                    canvas2.drawLine(f7, f9, f7, f8, paint6);
                    Rect rect8 = r8.A04;
                    int i10 = rect8.right;
                    float f10 = (float) (i10 - ((i10 - rect8.left) / 3));
                    canvas2.drawLine(f10, f9, f10, f8, paint6);
                }
                canvas2.drawPath(A062, paint5);
                float f11 = 2.0f * f;
                int round2 = Math.round(f11);
                Rect rect9 = r8.A04;
                int i11 = rect9.left + round2;
                int i12 = rect9.right - round2;
                int i13 = rect9.top + round2;
                int i14 = rect9.bottom - round2;
                int i15 = (int) (f * 24.0f);
                int min = Math.min(i15, rect9.width() / 4);
                int min2 = Math.min(i15, r8.A04.height() / 4);
                Rect rect10 = r8.A04;
                int i16 = rect10.left;
                int i17 = i16 + ((rect10.right - i16) / 2);
                int i18 = rect10.top;
                int i19 = i18 + ((rect10.bottom - i18) / 2);
                paint5.setStrokeWidth(f11);
                paint5.setColor(-1);
                paint5.setStrokeCap(Paint.Cap.SQUARE);
                int i20 = min / 2;
                float f12 = (float) i13;
                Paint paint7 = paint5;
                float f13 = (float) (i17 - i20);
                float f14 = (float) (i17 + i20);
                Canvas canvas3 = canvas2;
                canvas3.drawLine(f13, f12, f14, f12, paint7);
                float f15 = (float) i14;
                canvas3.drawLine(f13, f15, f14, f15, paint7);
                float f16 = (float) i11;
                int i21 = min2 / 2;
                float f17 = (float) (i19 - i21);
                float f18 = (float) (i19 + i21);
                canvas3.drawLine(f16, f17, f16, f18, paint7);
                float f19 = (float) i12;
                canvas3.drawLine(f19, f17, f19, f18, paint7);
                float f20 = (float) (i11 + min);
                float f21 = f12;
                float f22 = f16;
                canvas3.drawLine(f22, f21, f20, f12, paint7);
                float f23 = (float) (i13 + min2);
                canvas3.drawLine(f22, f21, f16, f23, paint7);
                float f24 = (float) (i12 - min);
                Canvas canvas4 = canvas2;
                float f25 = f19;
                float f26 = f12;
                Paint paint8 = paint5;
                canvas4.drawLine(f25, f26, f24, f12, paint8);
                canvas4.drawLine(f25, f26, f19, f23, paint8);
                canvas4.drawLine(f25, f15, f24, f15, paint8);
                float f27 = (float) (i14 - min2);
                Paint paint9 = paint5;
                float f28 = f15;
                canvas2.drawLine(f19, f28, f19, f27, paint9);
                float f29 = f16;
                canvas2.drawLine(f29, f28, f20, f15, paint9);
                canvas2.drawLine(f29, f28, f16, f27, paint9);
                i++;
            } else {
                return;
            }
        }
    }

    public CropImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        if (!this.A04) {
            this.A04 = true;
            generatedComponent();
        }
    }

    public void A01(float f, float f2) {
        super.A01(f, f2);
        int i = 0;
        while (true) {
            ArrayList arrayList = this.A07;
            if (i < arrayList.size()) {
                AnonymousClass5UE r1 = (AnonymousClass5UE) arrayList.get(i);
                r1.A03.postTranslate(f, f2);
                r1.A04 = r1.A03();
                i++;
            } else {
                return;
            }
        }
    }

    public void A02(float f, float f2, float f3) {
        super.A02(f, f2, f3);
        Iterator it = this.A07.iterator();
        while (it.hasNext()) {
            AnonymousClass5UE r2 = (AnonymousClass5UE) it.next();
            r2.A03.set(getImageMatrix());
            r2.A04 = r2.A03();
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.A0A.A00 != null) {
            Iterator it = this.A07.iterator();
            while (it.hasNext()) {
                AnonymousClass5UE r2 = (AnonymousClass5UE) it.next();
                r2.A03.set(getImageMatrix());
                r2.A04 = r2.A03();
                if (r2.A09) {
                    A07(r2);
                }
            }
        }
        ArrayList arrayList = this.A07;
        if (arrayList.size() > 0) {
            ((AnonymousClass5UE) arrayList.get(0)).A02();
            Rect A022 = ((AnonymousClass5UE) arrayList.get(0)).A02();
            A05(A022.top, A022.right, A022.bottom, A022.left);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        AnonymousClass5UE r6;
        int i = 0;
        if (!isEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            while (true) {
                ArrayList arrayList = this.A07;
                if (i >= arrayList.size()) {
                    break;
                }
                AnonymousClass5UE r2 = (AnonymousClass5UE) arrayList.get(i);
                int A002 = r2.A00(motionEvent.getX(), motionEvent.getY());
                if (A002 != 1) {
                    this.A02 = A002;
                    this.A03 = r2;
                    this.A00 = motionEvent.getX();
                    this.A01 = motionEvent.getY();
                    AnonymousClass5UE r22 = this.A03;
                    int i2 = 2;
                    if (A002 == 32) {
                        i2 = 1;
                    }
                    if (i2 != r22.A02) {
                        r22.A02 = i2;
                        r22.A07.invalidate();
                    }
                    clearFocus();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= arrayList.size()) {
                            break;
                        }
                        AnonymousClass5UE r23 = (AnonymousClass5UE) arrayList.get(i3);
                        if (r23.A00(motionEvent.getX(), motionEvent.getY()) == 1) {
                            i3++;
                        } else if (!r23.A09) {
                            r23.A09 = true;
                            r23.A04 = r23.A03();
                        }
                    }
                    invalidate();
                } else {
                    i++;
                }
            }
        } else if (action == 1) {
            AnonymousClass5UE r1 = this.A03;
            if (r1 != null) {
                if (r1.A09) {
                    r1.A09 = false;
                    r1.A04 = r1.A03();
                    invalidate();
                }
                A07(this.A03);
                AnonymousClass5UE r12 = this.A03;
                if (0 != r12.A02) {
                    r12.A02 = 0;
                    r12.A07.invalidate();
                }
            }
            this.A03 = null;
        } else if (action == 2 && (r6 = this.A03) != null) {
            r6.A04(this.A02, motionEvent.getX() - this.A00, motionEvent.getY() - this.A01);
            this.A00 = motionEvent.getX();
            this.A01 = motionEvent.getY();
            A06(this.A03);
        }
        int action2 = motionEvent.getAction();
        if (action2 != 1 && (action2 == 2 ? getScale() != 1.0f : action2 != 3)) {
            return true;
        }
        A00();
        return true;
    }

    public CropImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!this.A04) {
            this.A04 = true;
            generatedComponent();
        }
        this.A07 = AnonymousClass001.A0s();
        this.A03 = null;
        AnonymousClass4TL r0 = new AnonymousClass4TL(this, this, C18290x4.A0G(this).getDimensionPixelSize(R.dimen.f6nameremoved));
        this.A06 = r0;
        C06560Yg.A0O(this, r0);
    }
}
