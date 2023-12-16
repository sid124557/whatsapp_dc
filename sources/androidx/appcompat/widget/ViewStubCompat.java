package androidx.appcompat.widget;

import X.AnonymousClass001;
import X.AnonymousClass0KC;
import X.C14560pt;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.ref.WeakReference;

public final class ViewStubCompat extends View {
    public int A00;
    public int A01;
    public LayoutInflater A02;
    public C14560pt A03;
    public WeakReference A04;

    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public int getInflatedId() {
        return this.A00;
    }

    public LayoutInflater getLayoutInflater() {
        return this.A02;
    }

    public int getLayoutResource() {
        return this.A01;
    }

    public void setVisibility(int i) {
        WeakReference weakReference = this.A04;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (view != null) {
                view.setVisibility(i);
                return;
            }
            throw AnonymousClass001.A0e("setVisibility called on un-referenced view");
        }
        super.setVisibility(i);
        if (i == 0 || i == 4) {
            A00();
        }
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A01 = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass0KC.A0Q, i, 0);
        this.A00 = obtainStyledAttributes.getResourceId(2, -1);
        this.A01 = obtainStyledAttributes.getResourceId(1, 0);
        setId(obtainStyledAttributes.getResourceId(0, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    public View A00() {
        ViewParent parent = getParent();
        if (!(parent instanceof ViewGroup)) {
            throw AnonymousClass001.A0e("ViewStub must have a non-null ViewGroup viewParent");
        } else if (this.A01 != 0) {
            ViewGroup viewGroup = (ViewGroup) parent;
            LayoutInflater layoutInflater = this.A02;
            if (layoutInflater == null) {
                layoutInflater = LayoutInflater.from(getContext());
            }
            View A0R = AnonymousClass001.A0R(layoutInflater, viewGroup, this.A01);
            int i = this.A00;
            if (i != -1) {
                A0R.setId(i);
            }
            int indexOfChild = viewGroup.indexOfChild(this);
            viewGroup.removeViewInLayout(this);
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                viewGroup.addView(A0R, indexOfChild, layoutParams);
            } else {
                viewGroup.addView(A0R, indexOfChild);
            }
            this.A04 = new WeakReference(A0R);
            return A0R;
        } else {
            throw AnonymousClass001.A0c("ViewStub must have a valid layoutResource");
        }
    }

    public void dispatchDraw(Canvas canvas) {
    }

    public void draw(Canvas canvas) {
    }

    public void setInflatedId(int i) {
        this.A00 = i;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.A02 = layoutInflater;
    }

    public void setLayoutResource(int i) {
        this.A01 = i;
    }

    public void setOnInflateListener(C14560pt r1) {
        this.A03 = r1;
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
