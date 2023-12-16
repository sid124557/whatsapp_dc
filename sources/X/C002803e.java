package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.whatsapp.R;
import java.lang.reflect.Field;

/* renamed from: X.03e  reason: invalid class name and case insensitive filesystem */
public class C002803e extends ListView {
    public int A00;
    public int A01 = 0;
    public int A02 = 0;
    public int A03 = 0;
    public int A04 = 0;
    public AnonymousClass047 A05;
    public C10720iP A06;
    public C07180aS A07;
    public Field A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public final Rect A0C = AnonymousClass001.A0N();

    public C002803e(Context context, boolean z) {
        super(context, (AttributeSet) null, R.attr.f3nameremoved);
        this.A0A = z;
        setCacheColorHint(0);
        try {
            Field declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.A08 = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    public void onDetachedFromWindow() {
        this.A06 = null;
        super.onDetachedFromWindow();
    }

    private void setSelectorEnabled(boolean z) {
        AnonymousClass047 r0 = this.A05;
        if (r0 != null) {
            r0.A00 = z;
        }
    }

    public void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.A0C;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    public void drawableStateChanged() {
        if (this.A06 == null) {
            super.drawableStateChanged();
            setSelectorEnabled(true);
            Drawable selector = getSelector();
            if (selector != null && this.A09 && isPressed()) {
                AnonymousClass001.A13(selector, this);
            }
        }
    }

    public boolean hasFocus() {
        if (this.A0A || super.hasFocus()) {
            return true;
        }
        return false;
    }

    public boolean hasWindowFocus() {
        if (this.A0A || super.hasWindowFocus()) {
            return true;
        }
        return false;
    }

    public boolean isFocused() {
        if (this.A0A || super.isFocused()) {
            return true;
        }
        return false;
    }

    public boolean isInTouchMode() {
        if ((!this.A0A || !this.A0B) && !super.isInTouchMode()) {
            return false;
        }
        return true;
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        if (Build.VERSION.SDK_INT < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.A06 == null) {
            C10720iP r1 = new C10720iP(this);
            this.A06 = r1;
            r1.A00.post(r1);
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (!(pointToPosition == -1 || pointToPosition == getSelectedItemPosition())) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                }
                Drawable selector = getSelector();
                if (selector != null && this.A09 && isPressed()) {
                    AnonymousClass001.A13(selector, this);
                    return onHoverEvent;
                }
            }
        } else {
            setSelection(-1);
        }
        return onHoverEvent;
    }

    public void setSelector(Drawable drawable) {
        AnonymousClass047 r0;
        if (drawable != null) {
            r0 = new AnonymousClass047(drawable);
        } else {
            r0 = null;
        }
        this.A05 = r0;
        super.setSelector(r0);
        Rect A0N = AnonymousClass001.A0N();
        if (drawable != null) {
            drawable.getPadding(A0N);
        }
        this.A02 = A0N.left;
        this.A04 = A0N.top;
        this.A03 = A0N.right;
        this.A01 = A0N.bottom;
    }

    public int A00(int i, int i2) {
        int makeMeasureSpec;
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        int i3 = listPaddingTop + listPaddingBottom;
        if (adapter != null) {
            if (dividerHeight <= 0 || divider == null) {
                dividerHeight = 0;
            }
            int count = adapter.getCount();
            View view = null;
            int i4 = 0;
            for (int i5 = 0; i5 < count; i5++) {
                int itemViewType = adapter.getItemViewType(i5);
                if (itemViewType != i4) {
                    view = null;
                    i4 = itemViewType;
                }
                view = adapter.getView(i5, view, this);
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams == null) {
                    layoutParams = generateDefaultLayoutParams();
                    view.setLayoutParams(layoutParams);
                }
                int i6 = layoutParams.height;
                if (i6 > 0) {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
                } else {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                }
                view.measure(i, makeMeasureSpec);
                view.forceLayout();
                if (i5 > 0) {
                    i3 += dividerHeight;
                }
                i3 += view.getMeasuredHeight();
                if (i3 >= i2) {
                    return i2;
                }
            }
        }
        return i3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000b, code lost:
        if (r9 != 3) goto L_0x000d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0012  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A01(android.view.MotionEvent r15, int r16) {
        /*
            r14 = this;
            int r9 = r15.getActionMasked()
            r7 = 1
            if (r9 == r7) goto L_0x0021
            r0 = 2
            if (r9 == r0) goto L_0x001f
            r0 = 3
            if (r9 == r0) goto L_0x0118
        L_0x000d:
            r3 = 1
        L_0x000e:
            X.0aS r0 = r14.A07
            if (r0 != 0) goto L_0x0019
            X.0aS r0 = new X.0aS
            r0.<init>(r14)
            r14.A07 = r0
        L_0x0019:
            r0.A04 = r7
            r0.onTouch(r14, r15)
        L_0x001e:
            return r3
        L_0x001f:
            r3 = 1
            goto L_0x0022
        L_0x0021:
            r3 = 0
        L_0x0022:
            r0 = r16
            int r1 = r15.findPointerIndex(r0)
            if (r1 < 0) goto L_0x0118
            float r0 = r15.getX(r1)
            int r2 = (int) r0
            float r0 = r15.getY(r1)
            int r1 = (int) r0
            int r6 = r14.pointToPosition(r2, r1)
            r0 = -1
            if (r6 == r0) goto L_0x0119
            int r0 = r14.getFirstVisiblePosition()
            int r0 = r6 - r0
            android.view.View r5 = r14.getChildAt(r0)
            float r8 = (float) r2
            float r4 = (float) r1
            r14.A09 = r7
            r14.drawableHotspotChanged(r8, r4)
            boolean r0 = r14.isPressed()
            if (r0 != 0) goto L_0x0055
            r14.setPressed(r7)
        L_0x0055:
            r14.layoutChildren()
            int r1 = r14.A00
            r0 = -1
            r3 = 0
            if (r1 == r0) goto L_0x0074
            int r0 = r14.getFirstVisiblePosition()
            int r1 = r1 - r0
            android.view.View r1 = r14.getChildAt(r1)
            if (r1 == 0) goto L_0x0074
            if (r1 == r5) goto L_0x0074
            boolean r0 = r1.isPressed()
            if (r0 == 0) goto L_0x0074
            r1.setPressed(r3)
        L_0x0074:
            r14.A00 = r6
            int r0 = r5.getLeft()
            float r0 = (float) r0
            float r1 = r8 - r0
            int r0 = r5.getTop()
            float r0 = (float) r0
            float r0 = r4 - r0
            r5.drawableHotspotChanged(r1, r0)
            boolean r0 = r5.isPressed()
            if (r0 != 0) goto L_0x0090
            r5.setPressed(r7)
        L_0x0090:
            android.graphics.drawable.Drawable r11 = r14.getSelector()
            r10 = 1
            if (r11 == 0) goto L_0x00c0
            r0 = -1
            if (r6 == r0) goto L_0x00c0
            r13 = 1
            r11.setVisible(r3, r3)
        L_0x009e:
            android.graphics.Rect r1 = r14.A0C
            X.AnonymousClass000.A0x(r5, r1)
            int r2 = r1.left
            int r0 = r14.A02
            int r2 = r2 - r0
            r1.left = r2
            int r2 = r1.top
            int r0 = r14.A04
            int r2 = r2 - r0
            r1.top = r2
            int r2 = r1.right
            int r0 = r14.A03
            int r2 = r2 + r0
            r1.right = r2
            int r2 = r1.bottom
            int r0 = r14.A01
            int r2 = r2 + r0
            r1.bottom = r2
            goto L_0x00c2
        L_0x00c0:
            r13 = 0
            goto L_0x009e
        L_0x00c2:
            java.lang.reflect.Field r2 = r14.A08     // Catch:{ IllegalAccessException -> 0x00e0 }
            boolean r12 = r2.getBoolean(r14)     // Catch:{ IllegalAccessException -> 0x00e0 }
            boolean r0 = r5.isEnabled()     // Catch:{ IllegalAccessException -> 0x00e0 }
            if (r0 == r12) goto L_0x00e4
            boolean r0 = X.AnonymousClass000.A1T(r12)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ IllegalAccessException -> 0x00e0 }
            r2.set(r14, r0)     // Catch:{ IllegalAccessException -> 0x00e0 }
            r0 = -1
            if (r6 == r0) goto L_0x00e4
            r14.refreshDrawableState()     // Catch:{ IllegalAccessException -> 0x00e0 }
            goto L_0x00e4
        L_0x00e0:
            r0 = move-exception
            r0.printStackTrace()
        L_0x00e4:
            if (r13 == 0) goto L_0x00fb
            float r2 = r1.exactCenterX()
            float r1 = r1.exactCenterY()
            int r0 = r14.getVisibility()
            if (r0 == 0) goto L_0x00f5
            r10 = 0
        L_0x00f5:
            r11.setVisible(r10, r3)
            X.AnonymousClass0YG.A05(r11, r2, r1)
        L_0x00fb:
            android.graphics.drawable.Drawable r1 = r14.getSelector()
            if (r1 == 0) goto L_0x0107
            r0 = -1
            if (r6 == r0) goto L_0x0107
            X.AnonymousClass0YG.A05(r1, r8, r4)
        L_0x0107:
            r14.setSelectorEnabled(r3)
            r14.refreshDrawableState()
            if (r9 != r7) goto L_0x000d
            long r0 = r14.getItemIdAtPosition(r6)
            r14.performItemClick(r5, r6, r0)
            goto L_0x000d
        L_0x0118:
            r3 = 0
        L_0x0119:
            r2 = 0
            r14.A09 = r2
            r14.setPressed(r2)
            r14.drawableStateChanged()
            int r1 = r14.A00
            int r0 = r14.getFirstVisiblePosition()
            int r1 = r1 - r0
            android.view.View r0 = r14.getChildAt(r1)
            if (r0 == 0) goto L_0x0132
            r0.setPressed(r2)
        L_0x0132:
            if (r3 != 0) goto L_0x000e
            X.0aS r2 = r14.A07
            if (r2 == 0) goto L_0x001e
            r1 = 0
            boolean r0 = r2.A04
            if (r0 == 0) goto L_0x0140
            r2.A01()
        L_0x0140:
            r2.A04 = r1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C002803e.A01(android.view.MotionEvent, int):boolean");
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.A00 = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        C10720iP r2 = this.A06;
        if (r2 != null) {
            C002803e r1 = r2.A00;
            r1.A06 = null;
            r1.removeCallbacks(r2);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z) {
        this.A0B = z;
    }
}
