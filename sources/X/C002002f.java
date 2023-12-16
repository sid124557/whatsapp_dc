package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.reflect.Constructor;
import java.util.Map;

/* renamed from: X.02f  reason: invalid class name and case insensitive filesystem */
public class C002002f extends ViewGroup.MarginLayoutParams {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public View A08;
    public View A09;
    public C05630Ug A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public final Rect A0F;

    public static Rect A00(C002002f r2) {
        r2.A0B = false;
        r2.A02 = 0;
        r2.A00 = 0;
        r2.A04 = -1;
        r2.A05 = -1;
        r2.A03 = 0;
        r2.A01 = 0;
        return new Rect();
    }

    public void A01(C05630Ug r2) {
        C05630Ug r0 = this.A0A;
        if (r0 != r2) {
            if (r0 != null) {
                r0.A08();
            }
            this.A0A = r2;
            this.A0B = true;
            if (r2 != null) {
                r2.A0D(this);
            }
        }
    }

    public C002002f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C05630Ug r0;
        this.A0B = false;
        this.A02 = 0;
        this.A00 = 0;
        this.A04 = -1;
        this.A05 = -1;
        this.A03 = 0;
        this.A01 = 0;
        this.A0F = AnonymousClass001.A0N();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C03350Ju.A01);
        this.A02 = obtainStyledAttributes.getInteger(0, 0);
        this.A05 = obtainStyledAttributes.getResourceId(1, -1);
        this.A00 = obtainStyledAttributes.getInteger(2, 0);
        this.A04 = obtainStyledAttributes.getInteger(6, -1);
        this.A03 = obtainStyledAttributes.getInt(5, 0);
        this.A01 = obtainStyledAttributes.getInt(4, 0);
        boolean hasValue = obtainStyledAttributes.hasValue(3);
        this.A0B = hasValue;
        if (hasValue) {
            String string = obtainStyledAttributes.getString(3);
            if (TextUtils.isEmpty(string)) {
                r0 = null;
            } else {
                if (string.startsWith(".")) {
                    string = AnonymousClass000.A0V(context.getPackageName(), string, AnonymousClass001.A0o());
                } else if (string.indexOf(46) < 0) {
                    String str = CoordinatorLayout.A0K;
                    if (!TextUtils.isEmpty(str)) {
                        StringBuilder A0l = AnonymousClass000.A0l(str);
                        A0l.append('.');
                        string = AnonymousClass000.A0X(string, A0l);
                    }
                }
                try {
                    ThreadLocal threadLocal = CoordinatorLayout.A0L;
                    Map map = (Map) threadLocal.get();
                    if (map == null) {
                        map = AnonymousClass001.A0t();
                        threadLocal.set(map);
                    }
                    Constructor<?> constructor = (Constructor) map.get(string);
                    if (constructor == null) {
                        constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.A0N);
                        constructor.setAccessible(true);
                        map.put(string, constructor);
                    }
                    Object[] A0M = AnonymousClass002.A0M();
                    A0M[0] = context;
                    A0M[1] = attributeSet;
                    r0 = (C05630Ug) constructor.newInstance(A0M);
                } catch (Exception e) {
                    throw new RuntimeException(AnonymousClass000.A0V("Could not inflate Behavior subclass ", string, AnonymousClass001.A0o()), e);
                }
            }
            this.A0A = r0;
        }
        obtainStyledAttributes.recycle();
        C05630Ug r02 = this.A0A;
        if (r02 != null) {
            r02.A0D(this);
        }
    }

    public C002002f(C002002f r2) {
        super(r2);
        this.A0F = A00(this);
    }

    public C002002f(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.A0F = A00(this);
    }

    public C002002f(int i, int i2) {
        super(i, i2);
        this.A0F = A00(this);
    }

    public C002002f(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.A0F = A00(this);
    }
}
