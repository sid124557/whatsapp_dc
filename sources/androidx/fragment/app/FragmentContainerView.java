package androidx.fragment.app;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0IP;
import X.AnonymousClass0WE;
import X.AnonymousClass0XY;
import X.C03370Jw;
import X.C05930Vn;
import X.C06560Yg;
import X.C08240dc;
import X.C08270df;
import X.C08310eF;
import X.C162457s7;
import X.C378924l;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.whatsapp.R;
import java.util.List;

public final class FragmentContainerView extends FrameLayout {
    public View.OnApplyWindowInsetsListener A00;
    public boolean A01;
    public final List A02;
    public final List A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, C08270df r9) {
        super(context, attributeSet);
        View view;
        String str;
        C162457s7.A0J(context, 1);
        C162457s7.A0J(attributeSet, 2);
        C162457s7.A0J(r9, 3);
        this.A02 = AnonymousClass001.A0s();
        this.A03 = AnonymousClass001.A0s();
        this.A01 = true;
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C03370Jw.A01, 0, 0);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(0) : classAttribute;
        String string = obtainStyledAttributes.getString(1);
        obtainStyledAttributes.recycle();
        int id = getId();
        C08310eF A0B = r9.A0B(id);
        if (classAttribute != null && A0B == null) {
            if (id == -1) {
                if (string != null) {
                    str = AnonymousClass000.A0V(" with tag ", string, AnonymousClass001.A0o());
                } else {
                    str = "";
                }
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("FragmentContainerView must have an android:id to add Fragment ");
                A0o.append(classAttribute);
                throw AnonymousClass000.A0I(str, A0o);
            }
            C05930Vn A0E = r9.A0E();
            context.getClassLoader();
            C08310eF A002 = A0E.A00(classAttribute);
            C162457s7.A0D(A002);
            A002.A0X = true;
            if (A002.A0G != null) {
                A002.A0X = false;
                A002.A0X = true;
            }
            C08240dc r1 = new C08240dc(r9);
            r1.A0H = true;
            A002.A0C = this;
            r1.A0D(A002, string, getId());
            r1.A04();
        }
        for (AnonymousClass0WE r3 : r9.A0Y.A04()) {
            C08310eF r2 = r3.A02;
            if (r2.A01 == getId() && (view = r2.A0B) != null && view.getParent() == null) {
                r2.A0C = this;
                r3.A02();
            }
        }
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        C162457s7.A0J(view, 0);
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if (!(tag instanceof C08310eF) || tag == null) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("Views added to a FragmentContainerView must be associated with a Fragment. View ");
            A0o.append(view);
            throw AnonymousClass000.A0I(" is not associated with a Fragment.", A0o);
        }
        super.addView(view, i, layoutParams);
    }

    public WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        AnonymousClass0XY A08;
        C162457s7.A0J(windowInsets, 0);
        AnonymousClass0XY r1 = new AnonymousClass0XY(windowInsets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.A00;
        if (onApplyWindowInsetsListener != null) {
            C162457s7.A0H(onApplyWindowInsetsListener);
            A08 = new AnonymousClass0XY(AnonymousClass0IP.A00(onApplyWindowInsetsListener, this, windowInsets));
        } else {
            A08 = C06560Yg.A08(this, r1);
        }
        if (!A08.A00.A0A()) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                C06560Yg.A07(getChildAt(i), A08);
            }
        }
        return windowInsets;
    }

    public void dispatchDraw(Canvas canvas) {
        C162457s7.A0J(canvas, 0);
        if (this.A01) {
            for (View drawChild : this.A02) {
                super.drawChild(canvas, drawChild, getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    public boolean drawChild(Canvas canvas, View view, long j) {
        C162457s7.A0J(canvas, 0);
        C162457s7.A0J(view, 1);
        if (this.A01) {
            List list = this.A02;
            if ((!list.isEmpty()) && list.contains(view)) {
                return false;
            }
        }
        return super.drawChild(canvas, view, j);
    }

    public void endViewTransition(View view) {
        C162457s7.A0J(view, 0);
        this.A03.remove(view);
        if (this.A02.remove(view)) {
            this.A01 = true;
        }
        super.endViewTransition(view);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0024, code lost:
        return r1.A0B(getId());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C08310eF getFragment() {
        /*
            r3 = this;
            r1 = r3
        L_0x0001:
            if (r1 == 0) goto L_0x0030
            r0 = 2131430251(0x7f0b0b6b, float:1.8482198E38)
            java.lang.Object r2 = r1.getTag(r0)
            boolean r0 = r2 instanceof X.C08310eF
            if (r0 == 0) goto L_0x0025
            X.0eF r2 = (X.C08310eF) r2
            if (r2 == 0) goto L_0x0025
            boolean r0 = r2.A16()
            if (r0 == 0) goto L_0x004c
            X.0df r1 = r2.A0T()
        L_0x001c:
            int r0 = r3.getId()
            X.0eF r0 = r1.A0B(r0)
            return r0
        L_0x0025:
            android.view.ViewParent r1 = r1.getParent()
            boolean r0 = r1 instanceof android.view.View
            if (r0 == 0) goto L_0x0030
            android.view.View r1 = (android.view.View) r1
            goto L_0x0001
        L_0x0030:
            android.content.Context r1 = r3.getContext()
        L_0x0034:
            boolean r0 = r1 instanceof android.content.ContextWrapper
            if (r0 == 0) goto L_0x0067
            boolean r0 = r1 instanceof X.C003203q
            if (r0 == 0) goto L_0x0045
            X.03q r1 = (X.C003203q) r1
            if (r1 == 0) goto L_0x0067
            X.0df r1 = X.AnonymousClass00M.A01(r1)
            goto L_0x001c
        L_0x0045:
            android.content.ContextWrapper r1 = (android.content.ContextWrapper) r1
            android.content.Context r1 = r1.getBaseContext()
            goto L_0x0034
        L_0x004c:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "The Fragment "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " that owns View "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = " has already been destroyed. Nested fragments should always use the child FragmentManager."
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0I(r0, r1)
            throw r0
        L_0x0067:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "View "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = " is not within a subclass of FragmentActivity."
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0I(r0, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.FragmentContainerView.getFragment():X.0eF");
    }

    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        C162457s7.A0J(windowInsets, 0);
        return windowInsets;
    }

    public void removeView(View view) {
        C162457s7.A0J(view, 0);
        A00(view);
        super.removeView(view);
    }

    public void removeViewInLayout(View view) {
        C162457s7.A0J(view, 0);
        A00(view);
        super.removeViewInLayout(view);
    }

    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        C162457s7.A0J(onApplyWindowInsetsListener, 0);
        this.A00 = onApplyWindowInsetsListener;
    }

    public void startViewTransition(View view) {
        C162457s7.A0J(view, 0);
        if (view.getParent() == this) {
            this.A03.add(view);
        }
        super.startViewTransition(view);
    }

    public final void A00(View view) {
        if (this.A03.contains(view)) {
            this.A02.add(view);
        }
    }

    public void removeViews(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            View childAt = getChildAt(i4);
            C162457s7.A0D(childAt);
            A00(childAt);
        }
        super.removeViews(i, i2);
    }

    public void removeViewsInLayout(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            View childAt = getChildAt(i4);
            C162457s7.A0D(childAt);
            A00(childAt);
        }
        super.removeViewsInLayout(i, i2);
    }

    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw AnonymousClass002.A0G("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    public void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 < childCount) {
                View childAt = getChildAt(childCount);
                C162457s7.A0D(childAt);
                A00(childAt);
            } else {
                super.removeAllViewsInLayout();
                return;
            }
        }
    }

    public void removeViewAt(int i) {
        View childAt = getChildAt(i);
        C162457s7.A0D(childAt);
        A00(childAt);
        super.removeViewAt(i);
    }

    public final void setDrawDisappearingViewsLast(boolean z) {
        this.A01 = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FragmentContainerView(Context context, AttributeSet attributeSet, int i, int i2, C378924l r6) {
        this(context, attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        String str;
        C162457s7.A0J(context, 1);
        this.A02 = AnonymousClass001.A0s();
        this.A03 = AnonymousClass001.A0s();
        this.A01 = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C03370Jw.A01, 0, 0);
            if (classAttribute == null) {
                classAttribute = obtainStyledAttributes.getString(0);
                str = "android:name";
            } else {
                str = "class";
            }
            obtainStyledAttributes.recycle();
            if (classAttribute != null && !isInEditMode()) {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("FragmentContainerView must be within a FragmentActivity to use ");
                A0o.append(str);
                A0o.append("=\"");
                A0o.append(classAttribute);
                throw AnonymousClass002.A0G(AnonymousClass001.A0j(A0o, '\"'));
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C162457s7.A0J(context, 1);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context) {
        super(context);
        C162457s7.A0J(context, 1);
        this.A02 = AnonymousClass001.A0s();
        this.A03 = AnonymousClass001.A0s();
        this.A01 = true;
    }
}
