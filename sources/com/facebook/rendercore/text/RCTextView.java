package com.facebook.rendercore.text;

import X.AnonymousClass000;
import X.AnonymousClass002;
import X.AnonymousClass0WH;
import X.AnonymousClass4TN;
import X.C06560Yg;
import X.C86664Kz;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.text.style.ImageSpan;
import android.view.MotionEvent;
import android.view.View;

public class RCTextView extends View {
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public ColorStateList A07;
    public Paint A08;
    public Path A09;
    public Layout A0A;
    public CharSequence A0B;
    public boolean A0C;
    public boolean A0D = false;
    public boolean A0E;
    public ClickableSpan[] A0F;
    public ImageSpan[] A0G;
    public final AnonymousClass4TN A0H;

    public final int A01(int i, int i2) {
        float paragraphLeft;
        float lineMax;
        int i3 = (int) (((float) i2) - this.A01);
        int i4 = (int) (((float) i) - this.A00);
        int lineForVertical = this.A0A.getLineForVertical(i3);
        Layout.Alignment alignment = this.A0A.getAlignment();
        Layout.Alignment alignment2 = Layout.Alignment.ALIGN_CENTER;
        Layout layout = this.A0A;
        if (alignment == alignment2) {
            paragraphLeft = layout.getLineLeft(lineForVertical);
            lineMax = this.A0A.getLineRight(lineForVertical);
        } else {
            boolean A1U = AnonymousClass000.A1U(layout.getParagraphDirection(lineForVertical), -1);
            Layout layout2 = this.A0A;
            if (A1U) {
                paragraphLeft = ((float) layout2.getWidth()) - this.A0A.getLineMax(lineForVertical);
                lineMax = (float) this.A0A.getParagraphRight(lineForVertical);
            } else {
                paragraphLeft = (float) layout2.getParagraphLeft(lineForVertical);
                lineMax = this.A0A.getLineMax(lineForVertical);
            }
        }
        float f = (float) i4;
        if (f >= paragraphLeft && f <= lineMax) {
            try {
                return this.A0A.getOffsetForHorizontal(lineForVertical, f);
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
        }
        return -1;
    }

    private Path getSelectionPath() {
        if (this.A06 == this.A05 || Color.alpha(this.A02) == 0) {
            return null;
        }
        if (this.A0E) {
            Path path = this.A09;
            if (path == null) {
                path = AnonymousClass002.A06();
                this.A09 = path;
            }
            this.A0A.getSelectionPath(this.A06, this.A05, path);
            this.A0E = false;
        }
        return this.A09;
    }

    /* access modifiers changed from: private */
    public CharSequence getTextForAccessibility() {
        CharSequence charSequence = this.A0B;
        if (charSequence == null || charSequence.length() < 1000000) {
            return this.A0B;
        }
        if (!Character.isHighSurrogate(this.A0B.charAt(999999)) || !Character.isLowSurrogate(this.A0B.charAt(1000000))) {
            return this.A0B.subSequence(0, 1000000);
        }
        return this.A0B.subSequence(0, 999999);
    }

    private void setSelection(ClickableSpan clickableSpan) {
        Spanned spanned = (Spanned) this.A0B;
        A02(spanned.getSpanStart(clickableSpan), spanned.getSpanEnd(clickableSpan));
    }

    public final void A02(int i, int i2) {
        CornerPathEffect cornerPathEffect;
        if (Color.alpha(this.A02) == 0) {
            return;
        }
        if (this.A06 != i || this.A05 != i2) {
            this.A06 = i;
            this.A05 = i2;
            Paint paint = this.A08;
            if (paint == null) {
                paint = C86664Kz.A0Z();
                this.A08 = paint;
            }
            paint.setColor(this.A02);
            int i3 = this.A03;
            Paint paint2 = this.A08;
            if (i3 != 0) {
                cornerPathEffect = new CornerPathEffect((float) i3);
            } else {
                cornerPathEffect = null;
            }
            paint2.setPathEffect(cornerPathEffect);
            this.A0E = true;
            invalidate();
        }
    }

    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        AnonymousClass4TN r0 = this.A0H;
        if ((r0 == null || !r0.A0S(motionEvent)) && !super.dispatchHoverEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public Layout getLayout() {
        return this.A0A;
    }

    public float getLayoutTranslationX() {
        return this.A00;
    }

    public float getLayoutTranslationY() {
        return this.A01;
    }

    public CharSequence getText() {
        return this.A0B;
    }

    public RCTextView(Context context) {
        super(context);
        if (getImportantForAccessibility() == 0) {
            AnonymousClass4TN r1 = new AnonymousClass4TN(this);
            this.A0H = r1;
            this.A0D = true;
            C06560Yg.A0O(this, r1);
            this.A0D = false;
            return;
        }
        this.A0H = null;
    }

    public void draw(Canvas canvas) {
        int save;
        boolean z;
        super.draw(canvas);
        if (this.A0A != null) {
            if (this.A00 == 0.0f && this.A01 == 0.0f && getPaddingTop() == 0 && getPaddingLeft() == 0) {
                save = 0;
                z = false;
            } else {
                save = canvas.save();
                canvas.translate(this.A00, this.A01);
                canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
                z = true;
            }
            this.A0A.draw(canvas, getSelectionPath(), this.A08, 0);
            if (z) {
                canvas.restoreToCount(save);
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        ClickableSpan[] clickableSpanArr;
        ClickableSpan clickableSpan;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 3) {
            A02(0, 0);
            return false;
        }
        int A012 = A01((int) motionEvent.getX(), (int) motionEvent.getY());
        CharSequence charSequence = this.A0B;
        if (!(charSequence instanceof Spanned) || A012 < 0 || (clickableSpanArr = (ClickableSpan[]) ((Spanned) charSequence).getSpans(A012, A012, ClickableSpan.class)) == null || clickableSpanArr.length <= 0 || (clickableSpan = clickableSpanArr[0]) == null) {
            A02(0, 0);
            return super.onTouchEvent(motionEvent);
        } else if (actionMasked == 1) {
            A02(0, 0);
            clickableSpan.onClick(this);
            return true;
        } else if (actionMasked != 0) {
            return true;
        } else {
            setSelection(clickableSpan);
            return true;
        }
    }

    public void setAccessibilityDelegate(View.AccessibilityDelegate accessibilityDelegate) {
        AnonymousClass0WH A032;
        super.setAccessibilityDelegate(accessibilityDelegate);
        AnonymousClass4TN r1 = this.A0H;
        if (r1 != null && !this.A0D && (A032 = C06560Yg.A03(this)) != r1) {
            r1.A00 = A032;
            this.A0D = true;
            C06560Yg.A0O(this, r1);
            this.A0D = false;
        }
    }
}
