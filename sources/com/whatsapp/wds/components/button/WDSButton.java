package com.whatsapp.wds.components.button;

import X.AnonymousClass000;
import X.AnonymousClass002;
import X.AnonymousClass0Y8;
import X.AnonymousClass1VW;
import X.AnonymousClass1VX;
import X.AnonymousClass4L0;
import X.AnonymousClass4SL;
import X.AnonymousClass5LK;
import X.AnonymousClass5Yj;
import X.AnonymousClass66R;
import X.C102805Ki;
import X.C141606vq;
import X.C141856wF;
import X.C141996wT;
import X.C142006wU;
import X.C1462679k;
import X.C152447Yx;
import X.C154517dI;
import X.C162457s7;
import X.C175088Xa;
import X.C18270x1;
import X.C18290x4;
import X.C18300x5;
import X.C620733j;
import X.C73153f1;
import X.C86614Ku;
import X.C86644Kx;
import X.C86664Kz;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;

public class WDSButton extends AnonymousClass4SL {
    public static final int[] A0I = {16842913};
    public static final int[] A0J = new int[0];
    public PorterDuffColorFilter A00;
    public Drawable A01;
    public C620733j A02;
    public AnonymousClass1VW A03;
    public AnonymousClass1VX A04;
    public C141996wT A05;
    public AnonymousClass5LK A06 = new AnonymousClass5LK();
    public C141606vq A07;
    public C142006wU A08;
    public String A09 = "";
    public boolean A0A = true;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E = true;
    public final RectF A0F = AnonymousClass002.A07();
    public final RectF A0G = AnonymousClass002.A07();
    public final AnonymousClass66R A0H = C154517dI.A01(C175088Xa.A00);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WDSButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        boolean z;
        Drawable drawable;
        C162457s7.A0J(context, 1);
        C141996wT r7 = C141996wT.NORMAL;
        this.A05 = r7;
        C141606vq r6 = C141606vq.NORMAL;
        this.A07 = r6;
        C142006wU r5 = C142006wU.FILLED;
        this.A08 = r5;
        this.A0C = true;
        C620733j r0 = this.A02;
        if (r0 != null) {
            z = C102805Ki.A00(r0);
        } else {
            z = false;
        }
        this.A0D = z;
        if (attributeSet != null) {
            TypedArray A0X = C86664Kz.A0X(context, attributeSet, C1462679k.A04);
            int resourceId = A0X.getResourceId(5, 0);
            if (resourceId != 0) {
                C18300x5.A13(context, this, resourceId);
            }
            int resourceId2 = A0X.getResourceId(3, 0);
            if (resourceId2 != 0) {
                setHint(resourceId2);
            }
            int resourceId3 = A0X.getResourceId(4, 0);
            if (resourceId3 != 0) {
                setImeActionLabel(context.getString(resourceId3), getImeActionId());
            }
            int resourceId4 = A0X.getResourceId(2, 0);
            if (resourceId4 != 0) {
                setText(resourceId4);
            }
            this.A0E = AnonymousClass000.A1T(A0X.getResourceId(7, 0));
            this.A0B = A0X.getBoolean(9, false);
            int i = A0X.getInt(6, 0);
            C141996wT[] values = C141996wT.values();
            if (i >= 0) {
                C162457s7.A0J(values, 0);
                if (i <= values.length - 1) {
                    r7 = values[i];
                }
            }
            setAction(r7);
            int i2 = A0X.getInt(11, 0);
            C141606vq[] values2 = C141606vq.values();
            if (i2 >= 0) {
                C162457s7.A0J(values2, 0);
                if (i2 <= values2.length - 1) {
                    r6 = values2[i2];
                }
            }
            setSize(r6);
            int i3 = A0X.getInt(10, 0);
            C142006wU[] values3 = C142006wU.values();
            if (i3 >= 0) {
                C162457s7.A0J(values3, 0);
                if (i3 <= values3.length - 1) {
                    r5 = values3[i3];
                }
            }
            setVariant(r5);
            Drawable[] compoundDrawables = super.getCompoundDrawables();
            C162457s7.A0D(compoundDrawables);
            if (compoundDrawables.length == 0 || super.getCompoundDrawables()[0] == null) {
                drawable = this.A01 == null ? A0X.getDrawable(8) : drawable;
                A0X.recycle();
            } else {
                drawable = super.getCompoundDrawables()[0];
            }
            setupIcon(drawable);
            A0X.recycle();
        }
        A05();
        A06();
    }

    public static final ColorStateList A02(Context context, C152447Yx r8) {
        C162457s7.A0J(r8, 0);
        int[][] iArr = {new int[]{-16842910}, new int[]{16842919}, new int[0]};
        int[] iArr2 = new int[3];
        iArr2[0] = AnonymousClass0Y8.A04(context, r8.A00);
        iArr2[1] = AnonymousClass0Y8.A04(context, r8.A02);
        return C86664Kz.A0W(iArr2, iArr, AnonymousClass0Y8.A04(context, r8.A01), 2);
    }

    public final Drawable A04(int i, boolean z) {
        int i2;
        int i3;
        if (z) {
            i2 = 0;
            i3 = 0;
        } else {
            AnonymousClass5LK r0 = this.A06;
            i2 = r0.A03;
            i3 = r0.A04;
        }
        float[] fArr = new float[8];
        int i4 = 0;
        do {
            fArr[i4] = this.A06.A00;
            i4++;
        } while (i4 < 8);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, (RectF) null, (float[]) null));
        shapeDrawable.getPaint().setColor(i);
        if (this.A0E) {
            return new InsetDrawable(shapeDrawable, i2, i3, i2, i3);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{shapeDrawable});
        layerDrawable.setLayerInset(0, i2, i3, i2, i3);
        return layerDrawable;
    }

    public Drawable[] getCompoundDrawables() {
        return new Drawable[]{this.A01, null, null, null};
    }

    public void onDraw(Canvas canvas) {
        int width;
        float f;
        C162457s7.A0J(canvas, 0);
        this.A09 = getEllipsizedText();
        float measureText = getPaint().measureText(this.A09);
        if (this.A01 == null) {
            width = 0;
        } else {
            AnonymousClass5LK r2 = this.A06;
            width = r2.A03 + r2.A07 + ((((getWidth() - getFixedSpace()) - r2.A02) - ((int) measureText)) / 2);
            if (this.A0D) {
                width = (getWidth() - width) - r2.A02;
            }
        }
        int height = getHeight();
        AnonymousClass5LK r22 = this.A06;
        int i = r22.A02;
        int i2 = (height - i) / 2;
        if (this.A01 == null) {
            f = (AnonymousClass4L0.A00(this) - measureText) / 2.0f;
        } else if (this.A0D) {
            f = ((float) (width - r22.A06)) - measureText;
        } else {
            f = ((float) (width + i)) + ((float) r22.A06);
        }
        canvas.drawText(this.A09, f, ((C86664Kz.A02(this) - getPaint().descent()) - getPaint().ascent()) / 2.0f, getPaint());
        Drawable drawable = this.A01;
        if (drawable != null) {
            if (!this.A0B) {
                PorterDuffColorFilter porterDuffColorFilter = this.A00;
                if (porterDuffColorFilter == null) {
                    throw C18270x1.A0S("colorFilter");
                }
                drawable.setColorFilter(porterDuffColorFilter);
            }
            int i3 = r22.A02;
            drawable.setBounds(width, i2, i3 + width, i3 + i2);
            drawable.draw(canvas);
            drawable.clearColorFilter();
        }
        if (this.A08 == C142006wU.OUTLINE) {
            RectF rectF = this.A0F;
            rectF.set(getBackground().getBounds());
            float f2 = ((float) r22.A09) / 2.0f;
            float f3 = (float) r22.A04;
            float A022 = (C86664Kz.A02(this) / 2.0f) - f3;
            RectF rectF2 = this.A0G;
            float f4 = (float) r22.A03;
            rectF2.set(rectF.left + f2 + f4, rectF.top + f2 + f3, (rectF.right - f2) - f4, (rectF.bottom - f2) - f3);
            canvas.drawRoundRect(rectF2, A022, A022, getButtonStrokePaint());
        }
    }

    public void onMeasure(int i, int i2) {
        AnonymousClass5LK r3;
        int min;
        this.A0A = true;
        CharSequence text = getText();
        if ((text == null || text.length() == 0) && this.A01 != null) {
            r3 = this.A06;
            min = r3.A05;
        } else {
            int fixedSpace = getFixedSpace();
            r3 = this.A06;
            min = Math.min(getMaxWidth(), Math.max(getMinWidth(), fixedSpace + r3.A02 + ((int) getPaint().measureText(C86664Kz.A1K(this)))));
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.resolveSize(min, i), 1073741824), View.MeasureSpec.makeMeasureSpec(r3.A01, 1073741824));
    }

    public final void setAction(C141996wT r2) {
        C162457s7.A0J(r2, 0);
        boolean A1W = C18300x5.A1W(this.A05, r2);
        this.A05 = r2;
        if (A1W) {
            A06();
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Drawable A0C2;
        Drawable A0C3;
        if (i == 0) {
            A0C2 = null;
        } else {
            A0C2 = C86644Kx.A0C(this, i);
        }
        if (i3 == 0) {
            A0C3 = null;
        } else {
            A0C3 = C86644Kx.A0C(this, i3);
        }
        setCompoundDrawablesWithIntrinsicBounds(A0C2, (Drawable) null, A0C3, (Drawable) null);
    }

    public final void setSize(C141606vq r2) {
        C162457s7.A0J(r2, 0);
        boolean A1W = C18300x5.A1W(this.A07, r2);
        this.A07 = r2;
        if (A1W) {
            A05();
            A06();
            requestLayout();
        }
    }

    public final void setVariant(C142006wU r2) {
        C162457s7.A0J(r2, 0);
        boolean A1W = C18300x5.A1W(this.A08, r2);
        this.A08 = r2;
        if (A1W) {
            A06();
        }
    }

    public void setupBackgroundStyle(ColorStateList colorStateList) {
        C162457s7.A0J(colorStateList, 0);
        int defaultColor = colorStateList.getDefaultColor();
        Drawable A042 = A04(colorStateList.getColorForState(getDrawableState(), defaultColor), false);
        int[] A1Z = C86664Kz.A1Z();
        // fill-array-data instruction
        A1Z[0] = 16842919;
        A1Z[1] = 16842910;
        int colorForState = colorStateList.getColorForState(A1Z, defaultColor);
        if (isEnabled()) {
            A042 = new RippleDrawable(colorStateList, A042, A04(colorForState, true));
        }
        setBackground(A042);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0028, code lost:
        if (r4.A08 != X.C142006wU.A04) goto L_0x002a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setupContentStyle(android.content.res.ColorStateList r5) {
        /*
            r4 = this;
            r0 = 0
            X.C162457s7.A0J(r5, r0)
            int[] r1 = r4.getDrawableState()
            r0 = -1
            int r2 = r5.getColorForState(r1, r0)
            android.text.TextPaint r0 = r4.getPaint()
            r0.setColor(r2)
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuffColorFilter r0 = new android.graphics.PorterDuffColorFilter
            r0.<init>(r2, r1)
            r4.A00 = r0
            X.6wT r1 = r4.A05
            X.6wT r0 = X.C141996wT.MEDIA
            if (r1 != r0) goto L_0x002a
            X.6wU r2 = r4.A08
            X.6wU r1 = X.C142006wU.OUTLINE
            r0 = 1
            if (r2 == r1) goto L_0x002b
        L_0x002a:
            r0 = 0
        L_0x002b:
            android.text.TextPaint r3 = r4.getPaint()
            if (r0 == 0) goto L_0x0043
            android.content.Context r1 = r4.getContext()
            r0 = 2131103016(0x7f060d28, float:1.7818486E38)
            int r2 = X.AnonymousClass0Y8.A04(r1, r0)
            r1 = 1073741824(0x40000000, float:2.0)
            r0 = 0
            r3.setShadowLayer(r1, r0, r0, r2)
            return
        L_0x0043:
            r3.clearShadowLayer()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.wds.components.button.WDSButton.setupContentStyle(android.content.res.ColorStateList):void");
    }

    private final Paint getButtonStrokePaint() {
        return (Paint) this.A0H.getValue();
    }

    private final String getEllipsizedText() {
        if (!this.A0A) {
            return this.A09;
        }
        this.A0A = false;
        return TextUtils.ellipsize(getText(), getPaint(), Math.min((float) ((getWidth() - getFixedSpace()) - this.A06.A02), getPaint().measureText(C86664Kz.A1K(this))), TextUtils.TruncateAt.END).toString();
    }

    private final int getFixedSpace() {
        AnonymousClass5LK r2 = this.A06;
        return (r2.A03 * 2) + r2.A07 + r2.A06 + r2.A08;
    }

    private final void setupIcon(Drawable drawable) {
        AnonymousClass1VX r1;
        int[] iArr;
        if ((drawable instanceof StateListDrawable) && (r1 = this.A04) != null && r1.A0X(4359)) {
            if (isSelected()) {
                iArr = A0I;
            } else {
                iArr = A0J;
            }
            drawable.setState(iArr);
        }
        AnonymousClass1VX r12 = this.A04;
        if (r12 != null && r12.A0X(4358)) {
            if (drawable != null) {
                drawable = drawable.mutate();
            } else {
                drawable = null;
            }
        }
        this.A01 = drawable;
    }

    public final void A05() {
        C141856wF r7;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        if (this.A0C) {
            boolean A1X = AnonymousClass000.A1X(this.A01);
            CharSequence text = getText();
            if (text == null || text.length() == 0) {
                if (!A1X) {
                    r7 = C141856wF.ICON;
                }
                r7 = C141856wF.TEXT;
            } else {
                if (!A1X) {
                    r7 = C141856wF.ICON_TEXT;
                }
                r7 = C141856wF.TEXT;
            }
            AnonymousClass5LK r5 = this.A06;
            Resources resources = getResources();
            C162457s7.A0D(resources);
            C141606vq r1 = this.A07;
            C142006wU r0 = this.A08;
            C162457s7.A0J(r1, 1);
            C86614Ku.A1S(r0, 2, r7);
            r5.A0B = r1;
            r5.A0C = r0;
            r5.A0A = r7;
            int ordinal = r1.ordinal();
            if (ordinal == 0) {
                i = R.dimen.f6nameremoved;
            } else if (ordinal == 1) {
                i = R.dimen.f6nameremoved;
            } else if (ordinal == 2) {
                i = R.dimen.f6nameremoved;
            } else {
                throw C73153f1.A00();
            }
            r5.A01 = resources.getDimensionPixelSize(i);
            int ordinal2 = r5.A0B.ordinal();
            if (ordinal2 == 0) {
                i2 = R.dimen.f6nameremoved;
            } else if (ordinal2 == 1) {
                i2 = R.dimen.f6nameremoved;
            } else if (ordinal2 == 2) {
                i2 = R.dimen.f6nameremoved;
            } else {
                throw C73153f1.A00();
            }
            r5.A05 = resources.getDimensionPixelSize(i2);
            int ordinal3 = r7.ordinal();
            if (ordinal3 != 1) {
                if (ordinal3 == 0) {
                    int ordinal4 = r5.A0B.ordinal();
                    if (ordinal4 == 0) {
                        i11 = R.dimen.f6nameremoved;
                    } else if (ordinal4 == 1) {
                        i11 = R.dimen.f6nameremoved;
                    } else if (ordinal4 == 2) {
                        i11 = R.dimen.f6nameremoved;
                    } else {
                        throw C73153f1.A00();
                    }
                } else if (ordinal3 == 2) {
                    int ordinal5 = r5.A0B.ordinal();
                    if (ordinal5 == 0) {
                        i11 = R.dimen.f6nameremoved;
                    } else if (ordinal5 == 1) {
                        i11 = R.dimen.f6nameremoved;
                    } else if (ordinal5 == 2) {
                        i11 = R.dimen.f6nameremoved;
                    } else {
                        throw C73153f1.A00();
                    }
                } else {
                    throw C73153f1.A00();
                }
                i3 = resources.getDimensionPixelSize(i11);
            } else {
                i3 = 0;
            }
            r5.A02 = i3;
            int ordinal6 = r5.A0B.ordinal();
            if (ordinal6 == 0) {
                i4 = R.dimen.f6nameremoved;
            } else if (ordinal6 == 1) {
                i4 = R.dimen.f6nameremoved;
            } else if (ordinal6 == 2) {
                i4 = R.dimen.f6nameremoved;
            } else {
                throw C73153f1.A00();
            }
            r5.A09 = resources.getDimensionPixelSize(i4);
            int ordinal7 = r5.A0B.ordinal();
            if (ordinal7 == 0) {
                int ordinal8 = r5.A0C.ordinal();
                i5 = 3;
                int ordinal9 = r5.A0A.ordinal();
                if (ordinal8 != 3) {
                    if (ordinal9 != 1) {
                        if (ordinal9 != 0) {
                            if (ordinal9 != 2) {
                                throw C73153f1.A00();
                            }
                        }
                    }
                    i6 = R.dimen.f6nameremoved;
                } else if (ordinal9 == 1) {
                    i6 = R.dimen.f6nameremoved;
                } else if (ordinal9 != 0) {
                    if (ordinal9 == 2) {
                        i6 = R.dimen.f6nameremoved;
                    } else {
                        throw C73153f1.A00();
                    }
                }
                i6 = R.dimen.f6nameremoved;
            } else if (ordinal7 == 1) {
                int ordinal10 = r5.A0C.ordinal();
                i5 = 3;
                int ordinal11 = r5.A0A.ordinal();
                if (ordinal10 != 3) {
                    if (ordinal11 != 1) {
                        if (ordinal11 != 0) {
                            if (ordinal11 != 2) {
                                throw C73153f1.A00();
                            }
                        }
                    }
                    i6 = R.dimen.f6nameremoved;
                } else if (ordinal11 == 1) {
                    i6 = R.dimen.f6nameremoved;
                } else if (ordinal11 != 0) {
                    if (ordinal11 == 2) {
                        i6 = R.dimen.f6nameremoved;
                    } else {
                        throw C73153f1.A00();
                    }
                }
                i6 = R.dimen.f6nameremoved;
            } else if (ordinal7 == 2) {
                int ordinal12 = r5.A0C.ordinal();
                i5 = 3;
                int ordinal13 = r5.A0A.ordinal();
                if (ordinal12 != 3) {
                    if (ordinal13 != 1) {
                        if (ordinal13 != 0) {
                            if (ordinal13 != 2) {
                                throw C73153f1.A00();
                            }
                        }
                    }
                    i6 = R.dimen.f6nameremoved;
                } else if (ordinal13 == 1) {
                    i6 = R.dimen.f6nameremoved;
                } else if (ordinal13 != 0) {
                    if (ordinal13 == 2) {
                        i6 = R.dimen.f6nameremoved;
                    } else {
                        throw C73153f1.A00();
                    }
                }
                i6 = R.dimen.f6nameremoved;
            } else {
                throw C73153f1.A00();
            }
            r5.A07 = resources.getDimensionPixelSize(i6);
            int ordinal14 = r5.A0B.ordinal();
            if (ordinal14 == 0) {
                int ordinal15 = r5.A0C.ordinal();
                int ordinal16 = r5.A0A.ordinal();
                if (ordinal15 != i5) {
                    if (ordinal16 != 1) {
                        if (ordinal16 != 0) {
                            if (ordinal16 != 2) {
                                throw C73153f1.A00();
                            }
                        }
                    }
                    i7 = R.dimen.f6nameremoved;
                } else if (ordinal16 == 1) {
                    i7 = R.dimen.f6nameremoved;
                } else if (ordinal16 != 0) {
                    if (ordinal16 == 2) {
                        i7 = R.dimen.f6nameremoved;
                    } else {
                        throw C73153f1.A00();
                    }
                }
                i7 = R.dimen.f6nameremoved;
            } else if (ordinal14 == 1) {
                int ordinal17 = r5.A0C.ordinal();
                int ordinal18 = r5.A0A.ordinal();
                if (ordinal17 != i5) {
                    if (ordinal18 != 1) {
                        if (ordinal18 != 0) {
                            if (ordinal18 != 2) {
                                throw C73153f1.A00();
                            }
                        }
                    }
                    i7 = R.dimen.f6nameremoved;
                } else if (ordinal18 == 1) {
                    i7 = R.dimen.f6nameremoved;
                } else if (ordinal18 != 0) {
                    if (ordinal18 == 2) {
                        i7 = R.dimen.f6nameremoved;
                    } else {
                        throw C73153f1.A00();
                    }
                }
                i7 = R.dimen.f6nameremoved;
            } else if (ordinal14 == 2) {
                int ordinal19 = r5.A0C.ordinal();
                int ordinal20 = r5.A0A.ordinal();
                if (ordinal19 != i5) {
                    if (ordinal20 != 1) {
                        if (ordinal20 != 0) {
                            if (ordinal20 != 2) {
                                throw C73153f1.A00();
                            }
                        }
                    }
                    i7 = R.dimen.f6nameremoved;
                } else if (ordinal20 == 1) {
                    i7 = R.dimen.f6nameremoved;
                } else if (ordinal20 != 0) {
                    if (ordinal20 == 2) {
                        i7 = R.dimen.f6nameremoved;
                    } else {
                        throw C73153f1.A00();
                    }
                }
                i7 = R.dimen.f6nameremoved;
            } else {
                throw C73153f1.A00();
            }
            r5.A08 = resources.getDimensionPixelSize(i7);
            int ordinal21 = r5.A0B.ordinal();
            if (ordinal21 == 0) {
                i8 = R.dimen.f6nameremoved;
            } else if (ordinal21 == 1) {
                i8 = R.dimen.f6nameremoved;
            } else if (ordinal21 == 2) {
                i8 = R.dimen.f6nameremoved;
            } else {
                throw C73153f1.A00();
            }
            r5.A04 = resources.getDimensionPixelSize(i8);
            int ordinal22 = r5.A0B.ordinal();
            if (ordinal22 == 0) {
                int ordinal23 = r5.A0C.ordinal();
                int ordinal24 = r5.A0A.ordinal();
                if (ordinal23 != i5) {
                    if (ordinal24 != 1) {
                        if (ordinal24 != 0) {
                            if (ordinal24 != 2) {
                                throw C73153f1.A00();
                            }
                        }
                    }
                    i9 = R.dimen.f6nameremoved;
                } else if (ordinal24 == 1) {
                    i9 = R.dimen.f6nameremoved;
                } else if (ordinal24 != 0) {
                    if (ordinal24 == 2) {
                        i9 = R.dimen.f6nameremoved;
                    } else {
                        throw C73153f1.A00();
                    }
                }
                i9 = R.dimen.f6nameremoved;
            } else if (ordinal22 == 1) {
                int ordinal25 = r5.A0C.ordinal();
                int ordinal26 = r5.A0A.ordinal();
                if (ordinal25 != i5) {
                    if (ordinal26 != 1) {
                        if (ordinal26 != 0) {
                            if (ordinal26 != 2) {
                                throw C73153f1.A00();
                            }
                        }
                    }
                    i9 = R.dimen.f6nameremoved;
                } else if (ordinal26 == 1) {
                    i9 = R.dimen.f6nameremoved;
                } else if (ordinal26 != 0) {
                    if (ordinal26 == 2) {
                        i9 = R.dimen.f6nameremoved;
                    } else {
                        throw C73153f1.A00();
                    }
                }
                i9 = R.dimen.f6nameremoved;
            } else if (ordinal22 == 2) {
                int ordinal27 = r5.A0C.ordinal();
                int ordinal28 = r5.A0A.ordinal();
                if (ordinal27 != i5) {
                    if (ordinal28 != 1) {
                        if (ordinal28 != 0) {
                            if (ordinal28 != 2) {
                                throw C73153f1.A00();
                            }
                        }
                    }
                    i9 = R.dimen.f6nameremoved;
                } else if (ordinal28 == 1) {
                    i9 = R.dimen.f6nameremoved;
                } else if (ordinal28 != 0) {
                    if (ordinal28 == 2) {
                        i9 = R.dimen.f6nameremoved;
                    } else {
                        throw C73153f1.A00();
                    }
                }
                i9 = R.dimen.f6nameremoved;
            } else {
                throw C73153f1.A00();
            }
            r5.A06 = resources.getDimensionPixelSize(i9);
            int ordinal29 = r5.A0B.ordinal();
            if (ordinal29 == 0) {
                i10 = R.dimen.f6nameremoved;
            } else if (ordinal29 == 1) {
                i10 = R.dimen.f6nameremoved;
            } else if (ordinal29 == 2) {
                i10 = R.dimen.f6nameremoved;
            } else {
                throw C73153f1.A00();
            }
            r5.A03 = resources.getDimensionPixelSize(i10);
            r5.A00 = (((float) r5.A01) / 2.0f) - ((float) r5.A04);
            getButtonStrokePaint().setStrokeWidth((float) r5.A09);
            this.A0A = true;
        }
    }

    public final void A06() {
        int i;
        C152447Yx r3;
        int i2;
        C152447Yx r5;
        C152447Yx r32;
        C152447Yx A002;
        int A022;
        C152447Yx r33;
        int i3;
        int i4;
        int i5;
        int i6;
        if (this.A0C) {
            setStateListAnimator((StateListAnimator) null);
            Context A0F2 = C18290x4.A0F(this);
            C142006wU r0 = this.A08;
            C141996wT r1 = this.A05;
            C152447Yx r2 = null;
            C162457s7.A0J(r0, 2);
            C162457s7.A0J(r1, 3);
            int ordinal = r0.ordinal();
            if (ordinal == 0) {
                int ordinal2 = r1.ordinal();
                if (ordinal2 == 0) {
                    A002 = AnonymousClass4SL.A00(R.color.f5nameremoved);
                    A022 = AnonymousClass5Yj.A02(A0F2, R.attr.f3nameremoved, R.color.f5nameremoved);
                } else if (ordinal2 == 1) {
                    r32 = AnonymousClass4SL.A00(R.color.f5nameremoved);
                    i = R.color.f5nameremoved;
                    i2 = R.color.f5nameremoved;
                    r5 = new C152447Yx(i, i2, R.color.f5nameremoved);
                } else if (ordinal2 == 2) {
                    r32 = AnonymousClass4SL.A00(R.color.f5nameremoved);
                    i = R.color.f5nameremoved;
                    i2 = R.color.f5nameremoved;
                    r5 = new C152447Yx(i, i2, R.color.f5nameremoved);
                } else if (ordinal2 != 3) {
                    if (ordinal2 == 4) {
                        A002 = new C152447Yx(R.color.f5nameremoved, R.color.f5nameremoved, R.color.f5nameremoved);
                        A022 = R.color.f5nameremoved;
                    }
                    throw C18270x1.A0S("content");
                } else {
                    A002 = AnonymousClass4SL.A00(R.color.f5nameremoved);
                    A022 = R.color.f5nameremoved;
                }
                i2 = R.color.f5nameremoved;
                r5 = new C152447Yx(i, i2, R.color.f5nameremoved);
            } else if (ordinal == 1) {
                int ordinal3 = r1.ordinal();
                if (ordinal3 == 0) {
                    r32 = new C152447Yx(AnonymousClass5Yj.A02(A0F2, R.attr.f3nameremoved, R.color.f5nameremoved), AnonymousClass5Yj.A02(A0F2, R.attr.f3nameremoved, R.color.f5nameremoved), R.color.f5nameremoved);
                    i = AnonymousClass5Yj.A02(A0F2, R.attr.f3nameremoved, R.color.f5nameremoved);
                    i2 = AnonymousClass5Yj.A02(A0F2, R.attr.f3nameremoved, R.color.f5nameremoved);
                } else if (ordinal3 == 1) {
                    r32 = AnonymousClass4SL.A00(R.color.f5nameremoved);
                    i = R.color.f5nameremoved;
                    i2 = R.color.f5nameremoved;
                } else if (ordinal3 == 2) {
                    r32 = AnonymousClass4SL.A00(R.color.f5nameremoved);
                    i = R.color.f5nameremoved;
                    i2 = R.color.f5nameremoved;
                } else if (ordinal3 != 3) {
                    if (ordinal3 == 4) {
                        r3 = new C152447Yx(R.color.f5nameremoved, R.color.f5nameremoved, R.color.f5nameremoved);
                        r5 = new C152447Yx(R.color.f5nameremoved, R.color.f5nameremoved, R.color.f5nameremoved);
                    }
                    throw C18270x1.A0S("content");
                } else {
                    r32 = AnonymousClass4SL.A00(R.color.f5nameremoved);
                    i = R.color.f5nameremoved;
                    i2 = R.color.f5nameremoved;
                }
                r5 = new C152447Yx(i, i2, R.color.f5nameremoved);
            } else if (ordinal != 2) {
                if (ordinal == 3) {
                    int ordinal4 = r1.ordinal();
                    if (ordinal4 != 0) {
                        if (ordinal4 == 1) {
                            r3 = AnonymousClass4SL.A00(R.color.f5nameremoved);
                            i5 = R.color.f5nameremoved;
                            i6 = R.color.f5nameremoved;
                        } else if (ordinal4 == 2) {
                            r3 = AnonymousClass4SL.A00(R.color.f5nameremoved);
                            i5 = R.color.f5nameremoved;
                            i6 = R.color.f5nameremoved;
                        } else if (ordinal4 == 3) {
                            r3 = AnonymousClass4SL.A00(R.color.f5nameremoved);
                            i5 = R.color.f5nameremoved;
                            i6 = R.color.f5nameremoved;
                        } else if (ordinal4 == 4) {
                            r3 = new C152447Yx(R.color.f5nameremoved, R.color.f5nameremoved, R.color.f5nameremoved);
                            i5 = R.color.f5nameremoved;
                            i6 = R.color.f5nameremoved;
                        }
                        r5 = new C152447Yx(i5, i6, i5);
                    } else {
                        r3 = new C152447Yx(AnonymousClass5Yj.A02(A0F2, R.attr.f3nameremoved, R.color.f5nameremoved), AnonymousClass5Yj.A02(A0F2, R.attr.f3nameremoved, R.color.f5nameremoved), R.color.f5nameremoved);
                        r5 = new C152447Yx(R.color.f5nameremoved, AnonymousClass5Yj.A02(A0F2, R.attr.f3nameremoved, R.color.f5nameremoved), R.color.f5nameremoved);
                    }
                }
                throw C18270x1.A0S("content");
            } else {
                int ordinal5 = r1.ordinal();
                if (ordinal5 != 0) {
                    if (ordinal5 == 1) {
                        r33 = AnonymousClass4SL.A00(R.color.f5nameremoved);
                        i3 = R.color.f5nameremoved;
                        i4 = R.color.f5nameremoved;
                    } else if (ordinal5 == 2) {
                        r3 = new C152447Yx(R.color.f5nameremoved, R.color.f5nameremoved, R.color.f5nameremoved);
                        r5 = new C152447Yx(R.color.f5nameremoved, R.color.f5nameremoved, R.color.f5nameremoved);
                        r2 = new C152447Yx(R.color.f5nameremoved, R.color.f5nameremoved, R.color.f5nameremoved);
                    } else if (ordinal5 != 3) {
                        if (ordinal5 == 4) {
                            r33 = new C152447Yx(R.color.f5nameremoved, R.color.f5nameremoved, R.color.f5nameremoved);
                            i3 = R.color.f5nameremoved;
                            i4 = R.color.f5nameremoved;
                        }
                        throw C18270x1.A0S("content");
                    } else {
                        r33 = AnonymousClass4SL.A00(R.color.f5nameremoved);
                        i3 = R.color.f5nameremoved;
                        i4 = R.color.f5nameremoved;
                    }
                    r5 = new C152447Yx(i3, i4, i3);
                } else {
                    r33 = new C152447Yx(AnonymousClass5Yj.A02(A0F2, R.attr.f3nameremoved, R.color.f5nameremoved), AnonymousClass5Yj.A02(A0F2, R.attr.f3nameremoved, R.color.f5nameremoved), R.color.f5nameremoved);
                    r5 = new C152447Yx(R.color.f5nameremoved, AnonymousClass5Yj.A02(A0F2, R.attr.f3nameremoved, R.color.f5nameremoved), R.color.f5nameremoved);
                }
                r2 = new C152447Yx(R.color.f5nameremoved, R.color.f5nameremoved, R.color.f5nameremoved);
            }
            setupContentStyle(A02(C18290x4.A0F(this), r3));
            setupBackgroundStyle(A02(C18290x4.A0F(this), r5));
            if (r2 != null) {
                setupStrokeStyle(A02(C18290x4.A0F(this), r2));
            }
        }
    }

    public final AnonymousClass1VW getAbPreChatdProps() {
        return this.A03;
    }

    public final AnonymousClass1VX getAbProps() {
        return this.A04;
    }

    public final C141996wT getAction() {
        return this.A05;
    }

    public final Drawable getIcon() {
        return this.A01;
    }

    public final C141606vq getSize() {
        return this.A07;
    }

    public final C142006wU getVariant() {
        return this.A08;
    }

    public final C620733j getWhatsAppLocale() {
        return this.A02;
    }

    public void setBackground(Drawable drawable) {
        if (drawable == null) {
            setVariant(C142006wU.BORDERLESS);
        } else {
            super.setBackground(drawable);
        }
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (!this.A0D || drawable != null) {
            setIcon(drawable);
        } else {
            setIcon(drawable3);
        }
    }

    public final void setIcon(int i) {
        Drawable A0C2;
        if (i == 0) {
            A0C2 = null;
        } else {
            A0C2 = C86644Kx.A0C(this, i);
        }
        setIcon(A0C2);
    }

    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        if (!this.A0A) {
            this.A0A = !C162457s7.A0P(getText(), String.valueOf(charSequence));
        }
        super.setText(charSequence, bufferType);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001b, code lost:
        if (r4.A08 != X.C142006wU.A04) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void setupStrokeStyle(android.content.res.ColorStateList r5) {
        /*
            r4 = this;
            android.graphics.Paint r2 = r4.getButtonStrokePaint()
            int[] r1 = r4.getDrawableState()
            r0 = 0
            int r0 = r5.getColorForState(r1, r0)
            r2.setColor(r0)
            X.6wT r1 = r4.A05
            X.6wT r0 = X.C141996wT.MEDIA
            if (r1 != r0) goto L_0x001d
            X.6wU r2 = r4.A08
            X.6wU r1 = X.C142006wU.OUTLINE
            r0 = 1
            if (r2 == r1) goto L_0x001e
        L_0x001d:
            r0 = 0
        L_0x001e:
            android.graphics.Paint r3 = r4.getButtonStrokePaint()
            if (r0 == 0) goto L_0x0036
            android.content.Context r1 = r4.getContext()
            r0 = 2131103016(0x7f060d28, float:1.7818486E38)
            int r2 = X.AnonymousClass0Y8.A04(r1, r0)
            r1 = 1073741824(0x40000000, float:2.0)
            r0 = 0
            r3.setShadowLayer(r1, r0, r0, r2)
            return
        L_0x0036:
            r3.clearShadowLayer()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.wds.components.button.WDSButton.setupStrokeStyle(android.content.res.ColorStateList):void");
    }

    public final void setAbPreChatdProps(AnonymousClass1VW r1) {
        this.A03 = r1;
    }

    public final void setAbProps(AnonymousClass1VX r1) {
        this.A04 = r1;
    }

    public void setEnabled(boolean z) {
        if (isEnabled() != z) {
            super.setEnabled(z);
            A06();
        }
    }

    public void setSelected(boolean z) {
        super.setSelected(z);
        Drawable drawable = this.A01;
        if (drawable instanceof StateListDrawable) {
            setIcon(drawable);
        }
    }

    public final void setWhatsAppLocale(C620733j r1) {
        this.A02 = r1;
    }

    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (!this.A0D || drawable != null) {
            setIcon(drawable);
        } else {
            setIcon(drawable3);
        }
    }

    public final void setIcon(Drawable drawable) {
        setupIcon(drawable);
        A05();
        requestLayout();
    }
}
