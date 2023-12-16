package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* renamed from: X.6N7  reason: invalid class name */
public class AnonymousClass6N7 extends C124956Ep {
    public Drawable A00;
    public SparseArray A01;
    public C177888gc A02;
    public Object A03;
    public boolean A04;
    public boolean A05;
    public int[] A06 = new int[0];
    public AnonymousClass7NY[] A07;
    public AnonymousClass7NY[] A08;
    public final C156587gs A09 = new C156587gs(this);

    public int getMountItemCount() {
        int i = 0;
        int i2 = 0;
        while (true) {
            AnonymousClass7NY[] r1 = this.A07;
            if (i >= r1.length) {
                return i2;
            }
            if (r1[i] != null) {
                i2++;
            }
            i++;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: X.6N6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: com.facebook.rendercore.RootHostView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: X.6N6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: X.6N6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: X.6N6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: X.6N6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: X.6N6} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onLayout(boolean r8, int r9, int r10, int r11, int r12) {
        /*
            r7 = this;
            r0 = 1
            r7.A04 = r0
            r4 = r7
            boolean r0 = r7 instanceof com.facebook.rendercore.RootHostView
            if (r0 == 0) goto L_0x004d
            com.facebook.rendercore.RootHostView r4 = (com.facebook.rendercore.RootHostView) r4
            X.7Tk r5 = r4.A00
            X.7ku r6 = r5.A00
            boolean r0 = r5.A02
            r3 = 0
            if (r0 == 0) goto L_0x0021
            if (r6 == 0) goto L_0x0021
            int r11 = r11 - r9
            int r12 = r12 - r10
            long r1 = X.C153917cG.A01(r11, r12)
            r0 = 0
            r6.A04(r0, r1)
            r5.A02 = r3
        L_0x0021:
            X.7Wn r2 = r5.A01
            if (r2 == 0) goto L_0x003e
            X.7lF r1 = r5.A04
            r1.A0C(r2)
        L_0x002a:
            X.7Wn r0 = r5.A01
            boolean r0 = X.C162457s7.A0P(r2, r0)
            if (r0 != 0) goto L_0x003e
            r0 = 4
            if (r3 <= r0) goto L_0x0045
            X.6vE r2 = X.C141226vE.ERROR
            java.lang.String r1 = "RootHostDelegate"
            java.lang.String r0 = "More than 4 recursive mount attempts. Skipping mounting the latest version."
            X.C159557m5.A01(r2, r1, r0)
        L_0x003e:
            A01(r4)
        L_0x0041:
            r0 = 0
            r7.A04 = r0
            return
        L_0x0045:
            X.7Wn r2 = r5.A01
            r1.A0C(r2)
            int r3 = r3 + 1
            goto L_0x002a
        L_0x004d:
            boolean r0 = r7 instanceof X.AnonymousClass6N6
            if (r0 == 0) goto L_0x0041
            X.6N6 r4 = (X.AnonymousClass6N6) r4
            X.7Wn r0 = r4.A00
            if (r0 == 0) goto L_0x003e
            X.7lF r3 = r4.A01
            r3.A0C(r0)
            r2 = 0
        L_0x005d:
            X.7Wn r1 = r4.A00
            if (r0 == r1) goto L_0x003e
            r0 = 4
            if (r2 <= r0) goto L_0x006e
            X.6vE r2 = X.C141226vE.ERROR
            java.lang.String r1 = "RenderTreeHostView"
            java.lang.String r0 = "More than 4 recursive mount attempts. Skipping mounting the latest version."
            X.C159557m5.A01(r2, r1, r0)
            goto L_0x0041
        L_0x006e:
            r3.A0C(r1)
            int r2 = r2 + 1
            r0 = r1
            goto L_0x005d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6N7.onLayout(boolean, int, int, int, int):void");
    }

    public void requestLayout() {
        ViewParent viewParent = this;
        while (viewParent instanceof AnonymousClass6N7) {
            if (!((AnonymousClass6N7) viewParent).A04) {
                viewParent = viewParent.getParent();
            } else {
                return;
            }
        }
        super.requestLayout();
    }

    public static final String A00(AnonymousClass7NY[] r5) {
        if (r5 == null) {
            return "<null>";
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        for (int i = 0; i < r5.length; i++) {
            AnonymousClass7NY r2 = r5[i];
            A0o.append("Item at index: ");
            if (r2 != null) {
                A0o.append(i);
                A0o.append(" Type: ");
                A0o.append(r5[i].A01.A07.A0E());
                A0o.append(" Position in parent: ");
                A0o.append(r5[i].A01.A03);
            } else {
                A0o.append(i);
                A0o.append(" item is null");
            }
            A0o.append("\n");
        }
        return A0o.toString();
    }

    private void setForegroundLollipop(Drawable drawable) {
        Drawable drawable2 = this.A00;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
                unscheduleDrawable(this.A00);
            }
            this.A00 = drawable;
            if (drawable != null) {
                drawable.setCallback(this);
                AnonymousClass000.A0t(drawable, this);
            }
            invalidate();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x001d, code lost:
        if (r4 > -1) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0041, code lost:
        if (r2[r4] == null) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0056, code lost:
        if (r2 != null) goto L_0x0049;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(X.AnonymousClass7NY r6) {
        /*
            r5 = this;
            X.7NY[] r1 = r5.A07
            r4 = 0
        L_0x0003:
            int r0 = r1.length
            if (r4 >= r0) goto L_0x000d
            r0 = r1[r4]
            if (r0 == r6) goto L_0x000e
            int r4 = r4 + 1
            goto L_0x0003
        L_0x000d:
            r4 = -1
        L_0x000e:
            r2 = -1
            if (r4 > r2) goto L_0x001f
            X.7NY[] r1 = r5.A08
            if (r1 == 0) goto L_0x0081
            r4 = 0
        L_0x0016:
            int r0 = r1.length
            if (r4 >= r0) goto L_0x0081
            r0 = r1[r4]
            if (r0 != r6) goto L_0x0077
            if (r4 <= r2) goto L_0x0081
        L_0x001f:
            com.facebook.rendercore.RenderTreeNode r0 = r6.A01
            X.7qU r0 = r0.A07
            X.6vF r2 = r0.A04
            X.6vF r0 = X.C141236vF.DRAWABLE
            java.lang.Object r1 = r6.A02
            if (r2 != r0) goto L_0x0059
            android.graphics.drawable.Drawable r1 = (android.graphics.drawable.Drawable) r1
            r0 = 0
            r1.setCallback(r0)
            android.graphics.Rect r0 = r1.getBounds()
            r5.invalidate(r0)
        L_0x0038:
            X.7NY[] r3 = r5.A07
            X.7NY[] r2 = r5.A08
            if (r2 == 0) goto L_0x0043
            r0 = r2[r4]
            r1 = 1
            if (r0 != 0) goto L_0x0044
        L_0x0043:
            r1 = 0
        L_0x0044:
            r0 = 0
            if (r1 == 0) goto L_0x0054
            r2[r4] = r0
        L_0x0049:
            r1 = 0
        L_0x004a:
            int r0 = r2.length
            if (r1 >= r0) goto L_0x007a
            r0 = r2[r1]
            if (r0 != 0) goto L_0x007d
            int r1 = r1 + 1
            goto L_0x004a
        L_0x0054:
            r3[r4] = r0
            if (r2 == 0) goto L_0x007d
            goto L_0x0049
        L_0x0059:
            android.view.View r1 = (android.view.View) r1
            r0 = 1
            r5.A05 = r0
            boolean r0 = r1.isPressed()
            if (r0 == 0) goto L_0x0068
            r0 = 0
            r1.setPressed(r0)
        L_0x0068:
            boolean r0 = r5.A04
            if (r0 == 0) goto L_0x0073
            super.removeViewInLayout(r1)
        L_0x006f:
            r0 = 1
            r5.A05 = r0
            goto L_0x0038
        L_0x0073:
            super.removeView(r1)
            goto L_0x006f
        L_0x0077:
            int r4 = r4 + 1
            goto L_0x0016
        L_0x007a:
            r0 = 0
            r5.A08 = r0
        L_0x007d:
            r0 = 0
            r6.A00 = r0
            return
        L_0x0081:
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Mount item was not found in the list of mounted items.\nItem to remove: "
            r2.append(r0)
            com.facebook.rendercore.RenderTreeNode r1 = r6.A01
            r0 = 0
            java.lang.String r0 = r1.A00(r0)
            r2.append(r0)
            java.lang.String r0 = "\nMounted items: "
            r2.append(r0)
            X.7NY[] r0 = r5.A07
            java.lang.String r0 = A00(r0)
            r2.append(r0)
            java.lang.String r0 = "\nScraped items: "
            r2.append(r0)
            X.7NY[] r0 = r5.A08
            java.lang.String r0 = A00(r0)
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0I(r0, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6N7.A02(X.7NY):void");
    }

    public void A03(AnonymousClass7NY r6, int i) {
        if (r6.A01.A07.A04 == C141236vF.DRAWABLE) {
            Drawable drawable = (Drawable) r6.A02;
            drawable.setVisible(AnonymousClass000.A1T(getVisibility()), false);
            drawable.setCallback(this);
            AnonymousClass000.A0t(drawable, this);
            invalidate(r6.A01.A04);
        } else {
            View view = (View) r6.A02;
            this.A05 = true;
            if (!(view instanceof AnonymousClass6N7) || view.getParent() != this) {
                if (view.getLayoutParams() == null) {
                    view.setLayoutParams(generateDefaultLayoutParams());
                }
                boolean z = this.A04;
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (z) {
                    super.addViewInLayout(view, -1, layoutParams, true);
                } else {
                    super.addView(view, -1, layoutParams);
                }
            } else {
                C06560Yg.A0E(view);
                view.setVisibility(0);
            }
        }
        AnonymousClass7NY[] r3 = this.A07;
        int length = r3.length;
        if (i >= length) {
            int i2 = length;
            do {
                i2 *= 2;
            } while (i >= i2);
            AnonymousClass7NY[] r1 = new AnonymousClass7NY[i2];
            System.arraycopy(r3, 0, r1, 0, length);
            this.A07 = r1;
            r3 = r1;
        }
        r3[i] = r6;
        r6.A00 = this;
    }

    public void dispatchDraw(Canvas canvas) {
        C156587gs r2 = this.A09;
        r2.A02 = canvas;
        int i = 0;
        r2.A00 = 0;
        AnonymousClass7NY[] r0 = r2.A03.A07;
        if (r0 != null) {
            i = r0.length;
        }
        r2.A01 = i;
        super.dispatchDraw(canvas);
        if (r2.A02 != null && r2.A00 < r2.A01) {
            C156587gs.A00(r2);
        }
        r2.A02 = null;
    }

    public int getChildDrawingOrder(int i, int i2) {
        if (this.A05) {
            int childCount = getChildCount();
            if (this.A06.length < childCount) {
                this.A06 = new int[(childCount + 5)];
            }
            AnonymousClass7NY[] r0 = this.A07;
            if (r0 != null) {
                int length = r0.length;
                int i3 = 0;
                for (int i4 = 0; i4 < length; i4++) {
                    AnonymousClass7NY r2 = this.A07[i4];
                    if (r2 != null && r2.A01.A07.A04 == C141236vF.VIEW) {
                        this.A06[i3] = indexOfChild((View) r2.A02);
                        i3++;
                    }
                }
            }
            this.A05 = false;
        }
        C156587gs r22 = this.A09;
        if (r22.A02 != null && r22.A00 < r22.A01) {
            C156587gs.A00(r22);
        }
        return this.A06[i2];
    }

    public Object getTag(int i) {
        Object obj;
        SparseArray sparseArray = this.A01;
        if (sparseArray == null || (obj = sparseArray.get(i)) == null) {
            return super.getTag(i);
        }
        return obj;
    }

    public void setForegroundCompat(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23) {
            AnonymousClass71X.A00(drawable, this);
        } else {
            setForegroundLollipop(drawable);
        }
    }

    public void setInterceptTouchEventHandler(C177888gc r1) {
        this.A02 = r1;
    }

    public void setViewTag(Object obj) {
        this.A03 = obj;
    }

    public void setViewTags(SparseArray sparseArray) {
        this.A01 = sparseArray;
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public boolean verifyDrawable(Drawable drawable) {
        return true;
    }

    public AnonymousClass6N7(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setWillNotDraw(false);
        setChildrenDrawingOrderEnabled(true);
        this.A07 = new AnonymousClass7NY[8];
    }

    public static void A01(AnonymousClass6N7 r7) {
        int childCount = r7.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = r7.getChildAt(i);
            if (childAt.isLayoutRequested()) {
                AnonymousClass001.A19(childAt, childAt.getHeight(), 1073741824, View.MeasureSpec.makeMeasureSpec(childAt.getWidth(), 1073741824));
                childAt.layout(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
            }
            if (childAt instanceof AnonymousClass6N7) {
                A01((AnonymousClass6N7) childAt);
            }
        }
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.draw(canvas);
        }
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        AnonymousClass7NY[] r0 = this.A07;
        if (r0 != null) {
            int length = r0.length;
            for (int i = 0; i < length; i++) {
                AnonymousClass7NY r2 = this.A07[i];
                if (r2 != null && r2.A01.A07.A04 == C141236vF.DRAWABLE) {
                    AnonymousClass000.A0t((Drawable) r2.A02, this);
                }
            }
        }
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.setState(getDrawableState());
        }
    }

    public String getDescriptionOfMountedItems() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("\nMounted Items");
        A0o.append(A00(this.A07));
        A0o.append("\nScraped Items: ");
        return AnonymousClass000.A0X(A00(this.A08), A0o);
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        AnonymousClass7NY[] r0 = this.A07;
        if (r0 != null) {
            int length = r0.length;
            for (int i = 0; i < length; i++) {
                AnonymousClass7NY r2 = this.A07[i];
                if (r2 != null && r2.A01.A07.A04 == C141236vF.DRAWABLE) {
                    ((Drawable) r2.A02).jumpToCurrentState();
                }
            }
        }
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.setBounds(0, 0, getRight(), getBottom());
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        AnonymousClass7NY[] r0;
        if (isEnabled() && (r0 = this.A07) != null) {
            for (int length = r0.length - 1; length >= 0; length--) {
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        AnonymousClass7NY[] r0 = this.A07;
        if (r0 != null) {
            int length = r0.length;
            for (int i2 = 0; i2 < length; i2++) {
                AnonymousClass7NY r2 = this.A07[i2];
                if (r2 != null && r2.A01.A07.A04 == C141236vF.DRAWABLE) {
                    ((Drawable) r2.A02).setVisible(AnonymousClass000.A1T(i), false);
                }
            }
        }
    }

    public Object getTag() {
        Object obj = this.A03;
        if (obj == null) {
            return super.getTag();
        }
        return obj;
    }
}
