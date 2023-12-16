package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import com.whatsapp.R;
import java.util.Map;
import java.util.Objects;

/* renamed from: X.4tG  reason: invalid class name and case insensitive filesystem */
public class C95294tG extends AnonymousClass6G2 {
    public float A00 = 0.0f;
    public float A01 = 0.0f;
    public float A02;
    public float A03 = 0.0f;
    public float A04 = 0.0f;
    public float A05 = 0.0f;
    public Bitmap A06;
    public Drawable A07;
    public Drawable A08;
    public Drawable A09;
    public C186058ug A0A;
    public Integer A0B;
    public boolean A0C;
    public boolean A0D;
    public final Paint A0E = C86664Kz.A0a(1);
    public final Paint A0F = C86664Kz.A0a(1);
    public final Paint A0G = C86664Kz.A0a(1);
    public final Paint A0H = C86664Kz.A0a(1);
    public final Map A0I = AnonymousClass001.A0t();

    public C186058ug getMediaItem() {
        return this.A0A;
    }

    public Bitmap getThumbnail() {
        return this.A06;
    }

    public Uri getUri() {
        C186058ug r0 = this.A0A;
        if (r0 == null) {
            return null;
        }
        return r0.B3d();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00c4, code lost:
        if (r0 != null) goto L_0x00c6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDraw(android.graphics.Canvas r22) {
        /*
            r21 = this;
            r1 = r21
            r10 = r22
            super.onDraw(r10)
            r1.A01(r10)
            boolean r0 = r1.A0C
            if (r0 == 0) goto L_0x00fb
            java.lang.Integer r0 = r1.A0B
            if (r0 == 0) goto L_0x00b3
            int r0 = r0.intValue()
            int r0 = r0 + 1
            java.lang.String r4 = java.lang.String.valueOf(r0)
            int r9 = r4.length()
            java.util.Map r8 = r1.A0I
            java.lang.Integer r7 = java.lang.Integer.valueOf(r9)
            boolean r0 = r8.containsKey(r7)
            if (r0 == 0) goto L_0x0092
            java.lang.Object r6 = X.C18320x8.A0Z(r8, r7)
            android.graphics.Rect r6 = (android.graphics.Rect) r6
        L_0x0032:
            int r2 = r6.right
            int r0 = r6.left
            int r2 = r2 - r0
            float r8 = (float) r2
            int r2 = r6.bottom
            int r0 = r6.top
            int r2 = r2 - r0
            float r7 = (float) r2
            float r5 = X.AnonymousClass4L0.A00(r1)
            float r5 = r5 - r8
            float r0 = r1.A04
            float r5 = r5 - r0
            float r3 = r1.A02
            float r0 = r1.A05
            float r3 = r3 + r0
            r0 = 1056964608(0x3f000000, float:0.5)
            float r8 = r8 * r0
            float r7 = r7 * r0
            float r5 = r5 + r8
            float r14 = r3 - r7
            r16 = 0
            float r18 = X.AnonymousClass4L0.A00(r1)
            float r19 = X.C86664Kz.A02(r1)
            android.graphics.Paint r0 = r1.A0E
            r15 = r10
            r17 = r16
            r20 = r0
            r15.drawRect(r16, r17, r18, r19, r20)
            android.graphics.Paint r6 = r1.A0F
            float r11 = r5 - r8
            float r2 = r1.A00
            float r11 = r11 - r2
            float r12 = r14 - r7
            float r0 = r1.A01
            float r12 = r12 - r0
            float r13 = r5 + r8
            float r13 = r13 + r2
            float r14 = r14 + r7
            float r14 = r14 + r0
            float r15 = r1.A03
            r16 = r15
            r17 = r6
            r10.drawRoundRect(r11, r12, r13, r14, r15, r16, r17)
            android.graphics.Paint r0 = r1.A0G
            r10.drawText(r4, r5, r3, r0)
        L_0x0085:
            android.graphics.drawable.Drawable r0 = r1.A08
            if (r0 == 0) goto L_0x0091
            X.C86624Kv.A0n(r0, r1)
            android.graphics.drawable.Drawable r0 = r1.A08
            r0.draw(r10)
        L_0x0091:
            return
        L_0x0092:
            android.graphics.Rect r6 = X.AnonymousClass001.A0N()
            android.graphics.Paint r5 = r1.A0G
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            r2 = 0
        L_0x009d:
            if (r2 >= r9) goto L_0x00a7
            java.lang.String r0 = "0"
            r3.append(r0)
            int r2 = r2 + 1
            goto L_0x009d
        L_0x00a7:
            java.lang.String r2 = r3.toString()
            r0 = 0
            r5.getTextBounds(r2, r0, r9, r6)
            r8.put(r7, r6)
            goto L_0x0032
        L_0x00b3:
            android.graphics.drawable.Drawable r0 = r1.A07
            if (r0 != 0) goto L_0x00c6
            android.content.Context r2 = r1.getContext()
            r0 = 2131233429(0x7f080a95, float:1.8082995E38)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass0RP.A00(r2, r0)
            r1.A07 = r0
            if (r0 == 0) goto L_0x0085
        L_0x00c6:
            r0 = 1073741824(0x40000000, float:2.0)
            r10.drawColor(r0)
            int r2 = r1.getWidth()
            android.graphics.drawable.Drawable r0 = r1.A07
            int r0 = r0.getIntrinsicWidth()
            int r2 = r2 - r0
            int r5 = r2 / 2
            int r2 = r1.getHeight()
            android.graphics.drawable.Drawable r0 = r1.A07
            int r0 = X.AnonymousClass4L0.A02(r0, r2)
            int r4 = r0 / 2
            android.graphics.drawable.Drawable r3 = r1.A07
            int r2 = r3.getIntrinsicWidth()
            int r2 = r2 + r5
            android.graphics.drawable.Drawable r0 = r1.A07
            int r0 = r0.getIntrinsicHeight()
            int r0 = r0 + r4
            r3.setBounds(r5, r4, r2, r0)
            android.graphics.drawable.Drawable r0 = r1.A07
            r0.draw(r10)
            goto L_0x0085
        L_0x00fb:
            boolean r0 = r1.A0D
            if (r0 == 0) goto L_0x0085
            java.lang.String r8 = "0"
            int r7 = r8.length()
            java.util.Map r6 = r1.A0I
            java.lang.Integer r5 = java.lang.Integer.valueOf(r7)
            boolean r0 = r6.containsKey(r5)
            if (r0 == 0) goto L_0x0151
            java.lang.Object r4 = X.C18320x8.A0Z(r6, r5)
            android.graphics.Rect r4 = (android.graphics.Rect) r4
        L_0x0117:
            int r2 = r4.right
            int r0 = r4.left
            int r2 = r2 - r0
            float r5 = (float) r2
            int r2 = r4.bottom
            int r0 = r4.top
            int r2 = r2 - r0
            float r4 = (float) r2
            float r13 = X.AnonymousClass4L0.A00(r1)
            float r13 = r13 - r5
            float r0 = r1.A04
            float r13 = r13 - r0
            float r14 = r1.A02
            float r0 = r1.A05
            float r14 = r14 + r0
            r0 = 1056964608(0x3f000000, float:0.5)
            float r5 = r5 * r0
            float r4 = r4 * r0
            float r13 = r13 + r5
            float r14 = r14 - r4
            android.graphics.Paint r3 = r1.A0H
            float r11 = r13 - r5
            float r2 = r1.A00
            float r11 = r11 - r2
            float r12 = r14 - r4
            float r0 = r1.A01
            float r12 = r12 - r0
            float r13 = r13 + r5
            float r13 = r13 + r2
            float r14 = r14 + r4
            float r14 = r14 + r0
            float r15 = r1.A03
            r16 = r15
            r17 = r3
            r10.drawRoundRect(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x0085
        L_0x0151:
            android.graphics.Rect r4 = X.AnonymousClass001.A0N()
            android.graphics.Paint r3 = r1.A0G
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            r0 = 0
        L_0x015c:
            if (r0 >= r7) goto L_0x0164
            r2.append(r8)
            int r0 = r0 + 1
            goto L_0x015c
        L_0x0164:
            java.lang.String r2 = r2.toString()
            r0 = 0
            r3.getTextBounds(r2, r0, r7, r4)
            r6.put(r5, r4)
            goto L_0x0117
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C95294tG.onDraw(android.graphics.Canvas):void");
    }

    public void setChecked(boolean z) {
        if (this.A0C != z) {
            this.A0C = z;
            setSelected(z);
            invalidate();
        }
    }

    public void setCheckedPosition(Integer num) {
        if (!Objects.equals(this.A0B, num)) {
            boolean A1W = AnonymousClass000.A1W(num);
            this.A0C = A1W;
            this.A0B = num;
            setSelected(A1W);
            invalidate();
        }
    }

    public void setFrameDrawable(Drawable drawable) {
        this.A08 = drawable;
        invalidate();
    }

    public void setMediaItem(C186058ug r3) {
        int i;
        this.A0A = r3;
        if (r3 != null) {
            int type = r3.getType();
            if (type == 0) {
                i = R.string.f11nameremoved;
            } else if (type == 1) {
                i = R.string.f11nameremoved;
            } else if (type == 2) {
                i = R.string.f11nameremoved;
            } else if (type == 3) {
                i = R.string.f11nameremoved;
            } else if (type == 4) {
                i = R.string.f11nameremoved;
            } else {
                return;
            }
            C18300x5.A13(getContext(), this, i);
        }
    }

    public void setSelector(Drawable drawable) {
        Drawable drawable2 = this.A09;
        if (drawable2 != drawable) {
            C86644Kx.A0q(drawable2);
            this.A09 = drawable;
            if (drawable != null) {
                drawable.setCallback(this);
            }
        }
    }

    public boolean verifyDrawable(Drawable drawable) {
        if (drawable == this.A09) {
            return true;
        }
        if (drawable == null || !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public C95294tG(Context context) {
        super(context);
        Drawable A002 = AnonymousClass0RP.A00(context, R.drawable.selector_orange_gradient);
        this.A09 = A002;
        if (A002 != null) {
            A002.setCallback(this);
        }
        this.A01 = C86664Kz.A01(context.getResources(), R.dimen.f6nameremoved);
        this.A00 = C86664Kz.A01(context.getResources(), R.dimen.f6nameremoved);
        this.A05 = (float) C18320x8.A00(context, R.dimen.f6nameremoved);
        this.A04 = C86664Kz.A01(context.getResources(), R.dimen.f6nameremoved);
        this.A03 = C86664Kz.A01(context.getResources(), R.dimen.f6nameremoved);
        Paint paint = this.A0E;
        C86614Ku.A10(context, paint, R.color.f5nameremoved);
        paint.setAlpha(153);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        Paint paint2 = this.A0F;
        paint2.setColor(C18300x5.A03(context, R.attr.f3nameremoved, R.color.f5nameremoved));
        paint2.setStyle(style);
        Paint paint3 = this.A0G;
        paint3.setColor(C18300x5.A03(context, R.attr.f3nameremoved, R.color.f5nameremoved));
        paint3.setTextSize(C86664Kz.A01(context.getResources(), R.dimen.f6nameremoved));
        paint3.setTextAlign(Paint.Align.CENTER);
        paint3.setTypeface(C106905aM.A00());
        this.A02 = paint3.getTextSize();
        Paint paint4 = this.A0H;
        C86614Ku.A10(context, paint4, R.color.f5nameremoved);
        C86634Kw.A17(paint4);
        paint4.setStrokeWidth(C86664Kz.A01(context.getResources(), R.dimen.f6nameremoved));
        paint4.setShadowLayer(this.A03, 0.0f, 0.0f, -16777216);
    }

    public void A01(Canvas canvas) {
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.A09;
        if (drawable != null) {
            C86624Kv.A0n(drawable, this);
            drawable.draw(canvas);
        }
    }

    public void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.A09;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.A09;
        if (drawable != null) {
            AnonymousClass000.A0t(drawable, this);
        }
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.A09;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public void onMeasure(int i, int i2) {
        int defaultSize = View.getDefaultSize(getSuggestedMinimumWidth(), i);
        setMeasuredDimension(defaultSize, defaultSize);
    }

    public void setMultiCheckEnabled(boolean z) {
        this.A0D = z;
    }

    public void setThumbnail(Bitmap bitmap) {
        this.A06 = bitmap;
    }
}
