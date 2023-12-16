package com.whatsapp.mediacomposer.doodle;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass33O;
import X.AnonymousClass4GJ;
import X.AnonymousClass4L0;
import X.AnonymousClass4NK;
import X.AnonymousClass5BF;
import X.AnonymousClass5Q2;
import X.AnonymousClass5US;
import X.AnonymousClass5Y0;
import X.AnonymousClass7E7;
import X.C103795Ol;
import X.C104435Qy;
import X.C105425Uw;
import X.C106085Xo;
import X.C106985aV;
import X.C107385bE;
import X.C109245eJ;
import X.C116855qy;
import X.C182658om;
import X.C188048yE;
import X.C56612sH;
import X.C620733j;
import X.C64333Db;
import X.C70013Zn;
import X.C86614Ku;
import X.C86624Kv;
import X.C88864av;
import X.C95964vF;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Parcelable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.whatsapp.util.Log;
import org.json.JSONException;

public class DoodleView extends View implements C182658om, AnonymousClass4GJ {
    public float A00;
    public float A01;
    public float A02;
    public int A03;
    public C56612sH A04;
    public C620733j A05;
    public AnonymousClass5Y0 A06;
    public C188048yE A07;
    public C103795Ol A08;
    public C109245eJ A09;
    public AnonymousClass33O A0A;
    public C116855qy A0B;
    public boolean A0C;
    public final RectF A0D;
    public final Handler A0E;
    public final C106085Xo A0F;
    public final C104435Qy A0G;
    public final AnonymousClass5Q2 A0H;
    public final AnonymousClass5US A0I;
    public final Runnable A0J;

    private PointF getCenterPoint() {
        C104435Qy r2 = this.A0G;
        if (r2.A05 != null) {
            return this.A0H.A00(getX() + ((float) (getMeasuredWidth() / 2)), getY() + ((float) (getMeasuredHeight() / 2)));
        }
        return AnonymousClass4L0.A08(r2.A07.centerX(), r2.A07.centerY());
    }

    public void A02() {
        if (!this.A0C) {
            this.A0C = true;
            C64333Db A002 = C88864av.A00(generatedComponent());
            this.A04 = C64333Db.A2p(A002);
            this.A06 = C64333Db.A3o(A002);
            this.A05 = C64333Db.A2t(A002);
            this.A0A = (AnonymousClass33O) A002.AX1.get();
        }
    }

    public void A03(C105425Uw r13) {
        float f;
        float f2;
        C104435Qy r2 = this.A0G;
        RectF rectF = r2.A07;
        float width = rectF.width();
        float height = rectF.height();
        C105425Uw r6 = r13;
        boolean z = r13 instanceof C95964vF;
        if (z) {
            f = (width * 7.0f) / 8.0f;
            f2 = height / 10.0f;
        } else {
            f = width / 2.0f;
            f2 = height / 2.0f;
        }
        PointF centerPoint = getCenterPoint();
        float f3 = centerPoint.x;
        float f4 = f / 2.0f;
        float f5 = centerPoint.y;
        float f6 = f2 / 2.0f;
        r6.A0M(rectF, f3 - f4, f5 - f6, f3 + f4, f5 + f6);
        if (r13.A0Q() && !z) {
            r13.A0J(this.A03);
        }
        if (r13.A0R()) {
            r13.A0G(C105425Uw.A04 / this.A00);
        }
        r13.A0I(1.0f / r2.A01, 2);
        r13.A00 += (float) (-r2.A02);
        AnonymousClass5US r1 = this.A0I;
        r1.A03(r13);
        if (r13.A0S() && !r1.A06()) {
            this.A0E.postDelayed(this.A0J, 1000);
        }
        this.A08.A02 = false;
        C188048yE r0 = this.A07;
        if (r0 != null) {
            r0.BbS(r13);
        }
        invalidate();
    }

    public boolean A04() {
        C104435Qy r1 = this.A0G;
        if (r1.A06 == null || r1.A07 == null) {
            return false;
        }
        return true;
    }

    public void BnS(float f, int i) {
        int i2;
        AnonymousClass5US r2 = this.A0I;
        C105425Uw r3 = r2.A01;
        if (!(r3 == null || r3 == r2.A02 || (!r3.A0R() && !r3.A0Q()))) {
            r2.A00 = r3.A0A();
            r3 = r2.A01;
            r2.A02 = r3;
        }
        this.A02 = f;
        float f2 = this.A00;
        if (f2 == 0.0f) {
            this.A01 = f;
        } else {
            this.A01 = f / f2;
        }
        this.A03 = i;
        C103795Ol r0 = this.A08;
        if (r0 != null && !r0.A02 && r3 != null) {
            if (r3.A0R() || r3.A0Q()) {
                if (r3.A0Q()) {
                    r3.A0J(i);
                }
                C105425Uw r1 = r2.A01;
                if (r1.A0R()) {
                    r1.A0G(this.A01);
                }
                C105425Uw r4 = r2.A01;
                if (r4 instanceof C95964vF) {
                    C95964vF r42 = (C95964vF) r4;
                    float f3 = C105425Uw.A06;
                    float f4 = C105425Uw.A04;
                    float f5 = (f3 - f4) / 4.0f;
                    if (f < f4 + f5) {
                        i2 = 0;
                    } else if (f < (2.0f * f5) + f4) {
                        i2 = 1;
                    } else {
                        int i3 = (f > (f4 + (f5 * 3.0f)) ? 1 : (f == (f4 + (f5 * 3.0f)) ? 0 : -1));
                        i2 = 4;
                        if (i3 < 0) {
                            i2 = 2;
                        }
                    }
                    if (r42.A07 != i2) {
                        r42.A07 = i2;
                        TextPaint textPaint = r42.A0C;
                        textPaint.setTypeface(AnonymousClass5BF.A00(r42.A0B, i2));
                        textPaint.setFakeBoldText(AnonymousClass001.A1T(i2));
                        if (r42.A00 != 0.0f) {
                            RectF rectF = r42.A02;
                            float width = rectF.width() / r42.A00;
                            rectF.set(rectF.centerX() - (r42.A02 / 2.0f), rectF.centerY() - (r42.A01 / 2.0f), rectF.centerX() + (r42.A02 / 2.0f), rectF.centerY() + (r42.A01 / 2.0f));
                            r42.A0Z();
                            rectF.set(rectF.centerX() - ((rectF.width() * width) / 2.0f), rectF.centerY() - ((rectF.height() * width) / 2.0f), rectF.centerX() + ((rectF.width() * width) / 2.0f), rectF.centerY() + ((width * rectF.height()) / 2.0f));
                        }
                    }
                }
                invalidate();
            }
        }
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A0B;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A0B = r0;
        }
        return r0.generatedComponent();
    }

    public C106085Xo getDoodleRender() {
        return this.A0F;
    }

    public AnonymousClass5Q2 getPointsUtil() {
        return this.A0H;
    }

    public AnonymousClass5US getShapeRepository() {
        return this.A0I;
    }

    public C104435Qy getState() {
        return this.A0G;
    }

    public float getStrokeScale() {
        return this.A00;
    }

    public void onDetachedFromWindow() {
        this.A0E.removeCallbacks(this.A0J);
        super.onDetachedFromWindow();
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        AnonymousClass4NK r6 = (AnonymousClass4NK) parcelable;
        String str = r6.A01;
        if (!TextUtils.isEmpty(str)) {
            C106985aV A032 = C106985aV.A03(getContext(), this.A05, this.A06, this.A0A, str);
            if (A032 != null) {
                C104435Qy r2 = this.A0G;
                r2.A01(A032);
                AnonymousClass5US r0 = this.A0I;
                r0.A02();
                r0.A04.addAll(A032.A04);
                r2.A08 = C86614Ku.A0E(this);
                this.A0F.A02();
            }
            this.A0I.A05(r6.A02);
        }
        this.A08.A02 = r6.A03;
        this.A02 = r6.A00;
        requestLayout();
        this.A0F.A01();
        super.onRestoreInstanceState(r6.getSuperState());
    }

    public void setControllers(C109245eJ r1, C103795Ol r2) {
        this.A09 = r1;
        this.A08 = r2;
    }

    public void setDoodle(C106985aV r4) {
        C104435Qy r2 = this.A0G;
        r2.A01(r4);
        AnonymousClass5US r0 = this.A0I;
        r0.A02();
        r0.A04.addAll(r4.A04);
        r2.A08 = C86614Ku.A0E(this);
        C106085Xo r02 = this.A0F;
        r02.A02();
        requestLayout();
        r02.A01();
        invalidate();
    }

    public void setDoodleViewListener(C188048yE r2) {
        this.A07 = r2;
        this.A08.A00 = r2;
    }

    public DoodleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A0E = C86624Kv.A08(this);
        this.A0J = new C70013Zn(this, 4);
        AnonymousClass5US r4 = new AnonymousClass5US();
        this.A0I = r4;
        C104435Qy r3 = new C104435Qy();
        this.A0G = r3;
        this.A0H = new AnonymousClass5Q2(r3);
        this.A0F = new C106085Xo(this.A04, new AnonymousClass7E7(this), r3, r4);
        this.A0D = AnonymousClass002.A07();
        C107385bE.A00(this);
    }

    public C105425Uw A00(MotionEvent motionEvent) {
        if (!A04() || motionEvent.getPointerCount() != 1) {
            return null;
        }
        return this.A0I.A00(this.A0H.A00(motionEvent.getX(), motionEvent.getY()));
    }

    public C105425Uw A01(MotionEvent motionEvent) {
        if (!A04() || motionEvent.getPointerCount() != 2) {
            return null;
        }
        AnonymousClass5Q2 r2 = this.A0H;
        PointF A002 = r2.A00(motionEvent.getX(0), motionEvent.getY(0));
        PointF A003 = r2.A00(motionEvent.getX(1), motionEvent.getY(1));
        AnonymousClass5US r4 = this.A0I;
        C105425Uw A004 = r4.A00(A002);
        if (A004 != null) {
            return A004;
        }
        C105425Uw A005 = r4.A00(A003);
        if (A005 == null) {
            return r4.A00(AnonymousClass4L0.A08((A002.x + A003.x) / 2.0f, (A002.y + A003.y) / 2.0f));
        }
        return A005;
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return onTouchEvent(motionEvent);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0130, code lost:
        if (r2.A03 == ((int) r8.height())) goto L_0x0054;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void draw(android.graphics.Canvas r13) {
        /*
            r12 = this;
            super.draw(r13)
            X.5Xo r2 = r12.A0F
            X.5Qy r1 = r2.A0G
            android.graphics.Matrix r0 = r1.A0A
            r13.setMatrix(r0)
            android.graphics.RectF r0 = r1.A07
            if (r0 == 0) goto L_0x0253
            X.5US r4 = r2.A0H
            java.util.List r3 = r4.A04
            int r6 = r3.size()
            java.util.List r0 = r4.A01()
            int r0 = r0.size()
            int r6 = r6 - r0
            r0 = 3
            r5 = 0
            if (r6 < r0) goto L_0x003d
            boolean r0 = r2.A0A
            if (r0 == 0) goto L_0x0112
            java.util.Iterator r6 = r3.iterator()
        L_0x002d:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0112
            X.5Uw r0 = X.C86664Kz.A1F(r6)
            boolean r0 = r0.A0T()
            if (r0 == 0) goto L_0x002d
        L_0x003d:
            r2.A01 = r5
            r2.A02 = r5
            android.graphics.Bitmap r0 = r2.A07
            r5 = 0
            if (r0 == 0) goto L_0x004b
            r0.recycle()
            r2.A07 = r5
        L_0x004b:
            android.graphics.Bitmap r0 = r2.A08
            if (r0 == 0) goto L_0x0054
            r0.recycle()
            r2.A08 = r5
        L_0x0054:
            java.util.List r7 = r4.A05
            r13.save()
            android.graphics.RectF r5 = r1.A0B
            float r6 = r5.left
            float r0 = r5.top
            r13.translate(r6, r0)
            android.graphics.Bitmap r0 = r2.A06
            if (r0 != 0) goto L_0x00b0
            android.graphics.Bitmap r0 = r2.A05
            if (r0 != 0) goto L_0x00b0
        L_0x006a:
            int r0 = r2.A01
            r6 = 0
            if (r0 <= 0) goto L_0x0076
            android.graphics.Bitmap r8 = r2.A07
            android.graphics.Paint r0 = r2.A0C
            r13.drawBitmap(r8, r6, r6, r0)
        L_0x0076:
            r13.save()
            float r0 = r1.A00
            r13.scale(r0, r0)
            X.C104435Qy.A00(r13, r1)
            int r8 = r2.A01
        L_0x0083:
            int r1 = r7.size()
            int r0 = r2.A02
            int r1 = r1 - r0
            if (r8 >= r1) goto L_0x01e7
            java.lang.Object r1 = r7.get(r8)
            X.5Uw r1 = (X.C105425Uw) r1
            boolean r0 = r2.A0A
            if (r0 == 0) goto L_0x0099
            android.os.SystemClock.elapsedRealtime()
        L_0x0099:
            boolean r0 = r1 instanceof X.AnonymousClass4v7
            if (r0 == 0) goto L_0x00ac
            X.4v7 r1 = (X.AnonymousClass4v7) r1
            android.graphics.drawable.Drawable r0 = r1.A01
            if (r0 == 0) goto L_0x00a9
            X.AnonymousClass4v7.A00(r13, r1)
            r13.restore()
        L_0x00a9:
            int r8 = r8 + 1
            goto L_0x0083
        L_0x00ac:
            r1.A0K(r13)
            goto L_0x00a9
        L_0x00b0:
            java.util.Iterator r6 = r7.iterator()
        L_0x00b4:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x006a
            java.lang.Object r0 = r6.next()
            boolean r0 = r0 instanceof X.C95954vE
            if (r0 == 0) goto L_0x00b4
            r13.save()
            android.graphics.Bitmap r6 = r2.A06
            r9 = 0
            r8 = 0
            if (r6 == 0) goto L_0x0103
            int r0 = r1.A02
            float r10 = (float) r0
            int r0 = r6.getWidth()
            float r11 = (float) r0
            android.graphics.Bitmap r0 = r2.A06
        L_0x00d5:
            int r0 = r0.getHeight()
            float r6 = (float) r0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>(r8, r8, r11, r6)
            android.graphics.Matrix r8 = X.C1451774m.A00(r9, r0, r10)
            float r6 = r1.A00
            int r0 = r2.A00
            float r0 = (float) r0
            float r6 = r6 / r0
            r8.postScale(r6, r6)
            android.graphics.Bitmap r6 = r2.A05
            if (r6 == 0) goto L_0x00f5
            android.graphics.Paint r0 = r2.A0C
            r13.drawBitmap(r6, r8, r0)
        L_0x00f5:
            android.graphics.Bitmap r6 = r2.A06
            if (r6 == 0) goto L_0x00fe
            android.graphics.Paint r0 = r2.A0C
            r13.drawBitmap(r6, r8, r0)
        L_0x00fe:
            r13.restore()
            goto L_0x006a
        L_0x0103:
            android.graphics.Bitmap r6 = r2.A05
            if (r6 == 0) goto L_0x006a
            int r0 = r1.A02
            float r10 = (float) r0
            int r0 = r6.getWidth()
            float r11 = (float) r0
            android.graphics.Bitmap r0 = r2.A05
            goto L_0x00d5
        L_0x0112:
            java.util.List r6 = r4.A05
            X.5Uw r7 = r4.A01
            X.5Uw r0 = r2.A09
            if (r7 != r0) goto L_0x0132
            boolean r0 = r2.A0B
            if (r0 == 0) goto L_0x0132
            int r7 = r2.A04
            android.graphics.RectF r8 = r1.A0B
            float r0 = r8.width()
            int r0 = (int) r0
            if (r7 != r0) goto L_0x0132
            int r7 = r2.A03
            float r0 = r8.height()
            int r0 = (int) r0
            if (r7 == r0) goto L_0x0054
        L_0x0132:
            r2.A01 = r5
            r2.A02 = r5
            X.5Uw r0 = r4.A01
            r2.A09 = r0
            android.graphics.RectF r7 = r1.A0B
            float r0 = r7.width()
            int r0 = (int) r0
            r2.A04 = r0
            float r0 = r7.height()
            int r8 = (int) r0
            r2.A03 = r8
            r0 = 1
            r2.A0B = r0
            android.graphics.Bitmap r7 = r2.A07
            int r0 = r2.A04
            android.graphics.Bitmap r0 = X.C106085Xo.A00(r7, r0, r8)
            r2.A07 = r0
            if (r0 == 0) goto L_0x0197
            r0.eraseColor(r5)
            android.graphics.Bitmap r0 = r2.A07
            android.graphics.Canvas r8 = X.AnonymousClass4L0.A06(r0)
            float r0 = r1.A00
            r8.scale(r0, r0)
            X.C104435Qy.A00(r8, r1)
            java.util.Iterator r9 = r6.iterator()
        L_0x016e:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0197
            X.5Uw r7 = X.C86664Kz.A1F(r9)
            X.5Uw r0 = r2.A09
            if (r7 == r0) goto L_0x0197
            int r0 = r2.A01
            int r0 = r0 + 1
            r2.A01 = r0
            boolean r0 = r7 instanceof X.AnonymousClass4v7
            if (r0 == 0) goto L_0x0193
            X.4v7 r7 = (X.AnonymousClass4v7) r7
            android.graphics.drawable.Drawable r0 = r7.A01
            if (r0 == 0) goto L_0x016e
            X.AnonymousClass4v7.A00(r8, r7)
            r8.restore()
            goto L_0x016e
        L_0x0193:
            r7.A0K(r8)
            goto L_0x016e
        L_0x0197:
            android.graphics.Bitmap r8 = r2.A08
            int r7 = r2.A04
            int r0 = r2.A03
            android.graphics.Bitmap r0 = X.C106085Xo.A00(r8, r7, r0)
            r2.A08 = r0
            if (r0 == 0) goto L_0x0054
            r0.eraseColor(r5)
            android.graphics.Bitmap r0 = r2.A08
            android.graphics.Canvas r8 = X.AnonymousClass4L0.A06(r0)
            float r0 = r1.A00
            r8.scale(r0, r0)
            X.C104435Qy.A00(r8, r1)
            java.util.Iterator r7 = r6.iterator()
        L_0x01ba:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0054
            X.5Uw r6 = X.C86664Kz.A1F(r7)
            X.5Uw r0 = r2.A09
            if (r6 != r0) goto L_0x01ca
            r5 = 1
            goto L_0x01ba
        L_0x01ca:
            if (r5 == 0) goto L_0x01ba
            int r0 = r2.A02
            int r0 = r0 + 1
            r2.A02 = r0
            boolean r0 = r6 instanceof X.AnonymousClass4v7
            if (r0 == 0) goto L_0x01e3
            X.4v7 r6 = (X.AnonymousClass4v7) r6
            android.graphics.drawable.Drawable r0 = r6.A01
            if (r0 == 0) goto L_0x01ba
            X.AnonymousClass4v7.A00(r8, r6)
            r8.restore()
            goto L_0x01ba
        L_0x01e3:
            r6.A0K(r8)
            goto L_0x01ba
        L_0x01e7:
            r13.restore()
            int r0 = r2.A02
            if (r0 <= 0) goto L_0x01f5
            android.graphics.Bitmap r1 = r2.A08
            android.graphics.Paint r0 = r2.A0C
            r13.drawBitmap(r1, r6, r6, r0)
        L_0x01f5:
            r13.restore()
            X.5Uw r0 = r4.A02
            boolean r1 = X.AnonymousClass000.A1W(r0)
            float r0 = r5.left
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 > 0) goto L_0x020a
            float r0 = r5.top
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x021e
        L_0x020a:
            r13.save()
            android.graphics.Region$Op r0 = android.graphics.Region.Op.DIFFERENCE
            r13.clipRect(r5, r0)
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            if (r1 == 0) goto L_0x0218
            r0 = -1157627904(0xffffffffbb000000, float:-0.001953125)
        L_0x0218:
            r13.drawColor(r0)
            r13.restore()
        L_0x021e:
            boolean r0 = r2.A0A
            if (r0 == 0) goto L_0x023e
            java.util.Iterator r1 = r3.iterator()
        L_0x0226:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x023e
            X.5Uw r0 = X.C86664Kz.A1F(r1)
            boolean r0 = r0.A0T()
            if (r0 == 0) goto L_0x0226
        L_0x0236:
            X.7E7 r0 = r2.A0F
            com.whatsapp.mediacomposer.doodle.DoodleView r0 = r0.A00
            r0.invalidate()
            return
        L_0x023e:
            java.util.Iterator r1 = r3.iterator()
        L_0x0242:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0253
            X.5Uw r0 = X.C86664Kz.A1F(r1)
            boolean r0 = r0.A0U()
            if (r0 == 0) goto L_0x0242
            goto L_0x0236
        L_0x0253:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.mediacomposer.doodle.DoodleView.draw(android.graphics.Canvas):void");
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.A0I.A06()) {
            this.A0E.postDelayed(this.A0J, 1000);
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        C104435Qy r6 = this.A0G;
        RectF rectF = r6.A07;
        if (rectF != null) {
            RectF rectF2 = this.A0D;
            rectF2.set(rectF);
            r6.A09.mapRect(rectF2);
            float measuredWidth = (float) getMeasuredWidth();
            float measuredHeight = (float) getMeasuredHeight();
            float width = rectF2.width() / rectF2.height();
            if (measuredWidth / measuredHeight < width) {
                measuredHeight = measuredWidth / width;
            } else {
                measuredWidth = measuredHeight * width;
            }
            r6.A00 = measuredWidth / rectF2.width();
            if (this.A00 == 0.0f || !(!this.A0I.A04.isEmpty())) {
                float f = r6.A00;
                this.A00 = f;
                this.A01 = this.A02 / f;
            }
            r6.A0B.set((((float) getMeasuredWidth()) - measuredWidth) / 2.0f, (((float) getMeasuredHeight()) - measuredHeight) / 2.0f, (((float) getMeasuredWidth()) + measuredWidth) / 2.0f, (((float) getMeasuredHeight()) + measuredHeight) / 2.0f);
            r6.A08 = C86614Ku.A0E(this);
            r6.A03 = getMeasuredHeight();
            r6.A04 = getMeasuredWidth();
            C106085Xo r2 = this.A0F;
            if (r2.A04(false) || r2.A03(false)) {
                r2.A02();
            }
        }
    }

    public Parcelable onSaveInstanceState() {
        String str;
        String str2;
        RectF rectF;
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        C104435Qy r0 = this.A0G;
        RectF rectF2 = r0.A06;
        if (rectF2 == null || (rectF = r0.A07) == null) {
            str = null;
        } else {
            str = new C106985aV(rectF2, rectF, this.A0I.A05, r0.A02).A04();
        }
        AnonymousClass5US r02 = this.A0I;
        try {
            str2 = r02.A03.A01(r02.A04);
        } catch (JSONException e) {
            Log.e("ShapeRepository/getUndoJson", e);
            str2 = null;
        }
        return new AnonymousClass4NK(onSaveInstanceState, str, str2, this.A02, this.A08.A02);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002f, code lost:
        if (r3 != 6) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00a7, code lost:
        if (r1 != 6) goto L_0x00a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01ae, code lost:
        if (r2.getStrokeWidth() == r4.A01) goto L_0x01c0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0246  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0298 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00ae A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0155  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r13) {
        /*
            r12 = this;
            boolean r0 = r12.isEnabled()
            r8 = 0
            if (r0 == 0) goto L_0x0298
            r12.invalidate()
            X.5Ol r2 = r12.A08
            int r1 = r12.A03
            float r0 = r12.A01
            boolean r1 = r2.A00(r13, r0, r1, r8)
            r0 = 1
            if (r1 == 0) goto L_0x0018
            return r0
        L_0x0018:
            X.5eJ r7 = r12.A09
            if (r7 == 0) goto L_0x0298
            int r3 = r13.getActionMasked()
            r2 = 2
            r1 = 1
            if (r3 == 0) goto L_0x0230
            if (r3 == r0) goto L_0x0178
            if (r3 == r2) goto L_0x015e
            r0 = 3
            if (r3 == r0) goto L_0x0178
            r0 = 5
            if (r3 == r0) goto L_0x0230
            r0 = 6
            if (r3 == r0) goto L_0x0178
        L_0x0031:
            X.0N1 r0 = r7.A01
            boolean r11 = r0.A00(r13)
            X.6ES r0 = r7.A07
            boolean r0 = r0.onTouchEvent(r13)
            r11 = r11 | r0
            X.7N2 r6 = r7.A06
            int r0 = r13.getPointerCount()
            r10 = 0
            r1 = 2
            if (r0 != r1) goto L_0x0155
            int r0 = r13.getActionMasked()
            if (r0 != r1) goto L_0x0155
            r9 = 1
            float r5 = r13.getX(r9)
            float r0 = r13.getX(r8)
            float r5 = r5 - r0
            float r4 = r13.getY(r9)
            float r0 = r13.getY(r8)
            float r4 = r4 - r0
            double r2 = (double) r4
            double r0 = (double) r5
            double r0 = java.lang.Math.atan2(r2, r0)
            float r2 = (float) r0
            float r0 = r6.A01
            int r0 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r0 == 0) goto L_0x008b
            float r0 = r6.A02
            int r0 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r0 == 0) goto L_0x008b
            float r1 = r6.A00
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x008b
            X.5eJ r3 = r6.A03
            float r0 = r2 - r1
            double r0 = (double) r0
            double r0 = java.lang.Math.toDegrees(r0)
            float r9 = (float) r0
            X.5Ob r10 = r3.A04
            X.5Uw r0 = r10.A01
            if (r0 != 0) goto L_0x012a
            r9 = 0
        L_0x008b:
            r6.A01 = r5
            r6.A02 = r4
            r6.A00 = r2
        L_0x0091:
            r11 = r11 | r9
            X.5WF r4 = r7.A05
            int r1 = r13.getActionMasked()
            r5 = 1
            if (r1 == 0) goto L_0x011b
            if (r1 == r5) goto L_0x0118
            r0 = 2
            if (r1 == r0) goto L_0x00ba
            r0 = 3
            if (r1 == r0) goto L_0x0118
            r0 = 5
            if (r1 == r0) goto L_0x00b0
            r0 = 6
            if (r1 == r0) goto L_0x0118
        L_0x00a9:
            boolean r0 = r4.A02
            r0 = r0 | r11
            if (r0 == 0) goto L_0x0298
            r8 = 1
            return r8
        L_0x00b0:
            android.graphics.PointF r0 = r4.A04
            X.AnonymousClass5WF.A00(r0, r13)
            r4.A02 = r5
            r4.A01 = r5
            goto L_0x00a9
        L_0x00ba:
            android.graphics.PointF r6 = r4.A06
            X.AnonymousClass5WF.A00(r6, r13)
            boolean r1 = r4.A02
            if (r1 == 0) goto L_0x00fc
            boolean r0 = r4.A01
            if (r0 != 0) goto L_0x00fc
            float r10 = r6.x
            android.graphics.PointF r2 = r4.A05
            float r0 = r2.x
            float r1 = r10 - r0
            float r9 = r6.y
            float r0 = r2.y
            float r0 = r9 - r0
            float r1 = r1 * r1
            float r0 = r0 * r0
            float r1 = r1 + r0
            double r2 = (double) r1
            int r0 = r4.A03
            int r0 = r0 * r0
            double r0 = (double) r0
            int r7 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r7 <= 0) goto L_0x00f4
            r4.A01 = r5
            X.5eJ r2 = r4.A00
            android.graphics.PointF r1 = r4.A04
            float r0 = r1.x
            float r10 = r10 - r0
            float r0 = r1.y
            float r9 = r9 - r0
            android.graphics.PointF r0 = X.AnonymousClass4L0.A08(r10, r9)
            r2.A00(r0, r1)
        L_0x00f4:
            android.graphics.PointF r0 = r4.A04
            r0.set(r6)
            r4.A02 = r5
            goto L_0x00a9
        L_0x00fc:
            boolean r0 = r4.A01
            if (r0 == 0) goto L_0x00f4
            if (r1 == 0) goto L_0x00f4
            X.5eJ r7 = r4.A00
            float r3 = r6.x
            android.graphics.PointF r2 = r4.A04
            float r0 = r2.x
            float r3 = r3 - r0
            float r1 = r6.y
            float r0 = r2.y
            float r1 = r1 - r0
            android.graphics.PointF r0 = X.AnonymousClass4L0.A08(r3, r1)
            r7.A00(r0, r2)
            goto L_0x00f4
        L_0x0118:
            r4.A02 = r8
            goto L_0x00a9
        L_0x011b:
            android.graphics.PointF r1 = r4.A04
            X.AnonymousClass5WF.A00(r1, r13)
            r4.A02 = r5
            r4.A01 = r8
            android.graphics.PointF r0 = r4.A05
            r0.set(r1)
            goto L_0x00a9
        L_0x012a:
            r10.A00()
            X.5Q2 r3 = r10.A04
            X.5Uw r0 = r10.A01
            android.graphics.RectF r0 = r0.A02
            float r1 = r0.centerX()
            float r0 = r0.centerY()
            android.graphics.PointF r0 = X.AnonymousClass4L0.A08(r1, r0)
            android.graphics.PointF r3 = r3.A01(r0)
            X.5Qx r1 = r10.A05
            X.5Uw r0 = r10.A01
            float r3 = r1.A00(r3, r0, r9)
            X.5Uw r1 = r10.A01
            float r0 = r1.A00
            float r0 = r0 + r3
            r1.A00 = r0
            r9 = 1
            goto L_0x008b
        L_0x0155:
            r6.A00 = r10
            r6.A02 = r10
            r6.A01 = r10
            r9 = 0
            goto L_0x0091
        L_0x015e:
            X.5US r2 = r7.A09
            X.5Uw r1 = r2.A01
            if (r1 == 0) goto L_0x0031
            X.5Uw r0 = r2.A02
            if (r1 == r0) goto L_0x0031
            boolean r0 = r1 instanceof X.C95954vE
            if (r0 != 0) goto L_0x0031
            X.7N4 r0 = r1.A0A()
            r2.A00 = r0
            X.5Uw r0 = r2.A01
            r2.A02 = r0
            goto L_0x0031
        L_0x0178:
            X.5US r3 = r7.A09
            X.5Uw r2 = r3.A01
            if (r2 == 0) goto L_0x01ca
            X.5Uw r0 = r3.A02
            if (r0 == 0) goto L_0x01c0
            if (r0 != r2) goto L_0x01c0
            boolean r0 = r2 instanceof X.C95954vE
            if (r0 != 0) goto L_0x01c0
            X.7N4 r4 = r3.A00
            android.graphics.RectF r1 = r4.A03
            android.graphics.RectF r0 = r2.A02
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x01b0
            float r1 = r2.A00
            float r0 = r4.A00
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x01b0
            android.graphics.Paint r2 = r2.A01
            int r1 = r2.getColor()
            int r0 = r4.A02
            if (r1 != r0) goto L_0x01b0
            float r1 = r2.getStrokeWidth()
            float r0 = r4.A01
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x01c0
        L_0x01b0:
            X.5Uw r2 = r3.A01
            X.7N4 r0 = r3.A00
            X.4vK r1 = new X.4vK
            r1.<init>(r0, r2)
            X.5PR r0 = r3.A03
            java.util.LinkedList r0 = r0.A00
            r0.add(r1)
        L_0x01c0:
            X.5Uw r0 = r3.A01
            r0.A0E()
            r0 = 0
            r3.A02 = r0
            r3.A00 = r0
        L_0x01ca:
            X.8yE r0 = r7.A02
            r0.BRS()
            X.5Ob r3 = r7.A04
            X.5Uw r0 = r3.A01
            if (r0 == 0) goto L_0x0031
            float r5 = r13.getX()
            float r4 = r13.getY()
            X.5Qg r2 = r3.A06
            android.os.Handler r1 = r2.A01
            java.lang.Runnable r0 = r2.A06
            r1.removeCallbacks(r0)
            java.lang.Runnable r0 = r2.A05
            r1.post(r0)
            r2.A00()
            r2.A00 = r8
            boolean r0 = r2.A01(r5, r4)
            if (r0 == 0) goto L_0x0210
            X.5Uw r2 = r3.A01
            if (r2 == 0) goto L_0x0210
            X.7E9 r0 = r3.A02
            X.5nf r1 = r0.A00
            X.5US r0 = r1.A0T
            r0.A04(r2)
            X.5Xo r0 = r1.A0L
            r0.A01()
            com.whatsapp.mediacomposer.doodle.DoodleView r0 = r1.A0M
            r0.invalidate()
            r1.A06()
        L_0x0210:
            X.5Qx r2 = r3.A05
            java.util.Map r0 = r2.A05
            java.util.Iterator r1 = X.AnonymousClass001.A0v(r0)
        L_0x0218:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0228
            java.lang.Object r0 = r1.next()
            X.5UA r0 = (X.AnonymousClass5UA) r0
            r0.A02()
            goto L_0x0218
        L_0x0228:
            r2.A01()
            r0 = 0
            r3.A01 = r0
            goto L_0x0031
        L_0x0230:
            int r0 = r13.getPointerCount()
            if (r0 != r1) goto L_0x0289
            X.5US r1 = r7.A09
            com.whatsapp.mediacomposer.doodle.DoodleView r0 = r7.A03
            X.5Uw r0 = r0.A00(r13)
        L_0x023e:
            r1.A01 = r0
        L_0x0240:
            X.5US r0 = r7.A09
            X.5Uw r4 = r0.A01
            if (r4 == 0) goto L_0x0031
            X.5Ob r0 = r7.A04
            r0.A01 = r4
            X.5Qg r2 = r0.A06
            r1 = 700(0x2bc, float:9.81E-43)
            android.os.Handler r3 = r2.A01
            java.lang.Runnable r0 = r2.A05
            r3.removeCallbacks(r0)
            java.lang.Runnable r2 = r2.A06
            long r0 = (long) r1
            r3.postDelayed(r2, r0)
            X.8yE r0 = r7.A02
            r0.BbS(r4)
            r0.BRR()
            boolean r0 = r4.A0R()
            if (r0 == 0) goto L_0x0271
            com.whatsapp.mediacomposer.doodle.DoodleView r1 = r7.A03
            float r0 = r4.A08()
            r1.A01 = r0
        L_0x0271:
            boolean r0 = r4.A0Q()
            if (r0 == 0) goto L_0x0031
            android.graphics.Paint r2 = r4.A01
            int r0 = r2.getColor()
            if (r0 == 0) goto L_0x0031
            com.whatsapp.mediacomposer.doodle.DoodleView r1 = r7.A03
            int r0 = r2.getColor()
            r1.A03 = r0
            goto L_0x0031
        L_0x0289:
            int r0 = r13.getPointerCount()
            if (r0 != r2) goto L_0x0240
            X.5US r1 = r7.A09
            com.whatsapp.mediacomposer.doodle.DoodleView r0 = r7.A03
            X.5Uw r0 = r0.A01(r13)
            goto L_0x023e
        L_0x0298:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.mediacomposer.doodle.DoodleView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setStrokeColor(int i) {
        this.A03 = i;
    }

    public void setStrokeScale(float f) {
        this.A00 = f;
    }

    public void setStrokeWidth(float f) {
        this.A01 = f;
    }

    public DoodleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A0E = C86624Kv.A08(this);
        this.A0J = new C70013Zn(this, 4);
        AnonymousClass5US r4 = new AnonymousClass5US();
        this.A0I = r4;
        C104435Qy r3 = new C104435Qy();
        this.A0G = r3;
        this.A0H = new AnonymousClass5Q2(r3);
        this.A0F = new C106085Xo(this.A04, new AnonymousClass7E7(this), r3, r4);
        this.A0D = AnonymousClass002.A07();
        C107385bE.A00(this);
    }

    public DoodleView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.A0E = C86624Kv.A08(this);
        this.A0J = new C70013Zn(this, 4);
        AnonymousClass5US r4 = new AnonymousClass5US();
        this.A0I = r4;
        C104435Qy r3 = new C104435Qy();
        this.A0G = r3;
        this.A0H = new AnonymousClass5Q2(r3);
        this.A0F = new C106085Xo(this.A04, new AnonymousClass7E7(this), r3, r4);
        this.A0D = AnonymousClass002.A07();
        C107385bE.A00(this);
    }

    public DoodleView(Context context) {
        super(context);
        this.A0E = C86624Kv.A08(this);
        this.A0J = new C70013Zn(this, 4);
        AnonymousClass5US r4 = new AnonymousClass5US();
        this.A0I = r4;
        C104435Qy r3 = new C104435Qy();
        this.A0G = r3;
        this.A0H = new AnonymousClass5Q2(r3);
        this.A0F = new C106085Xo(this.A04, new AnonymousClass7E7(this), r3, r4);
        this.A0D = AnonymousClass002.A07();
        C107385bE.A00(this);
    }

    public DoodleView(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        super(context, attributeSet);
        A02();
    }
}
