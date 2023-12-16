package X;

import android.view.View;

/* renamed from: X.935  reason: invalid class name */
public class AnonymousClass935 implements AnonymousClass4C1 {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    public AnonymousClass935(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.A04 = i;
        this.A00 = obj3;
        this.A01 = obj;
        this.A02 = obj4;
        this.A03 = obj2;
    }

    public final Object get() {
        View view;
        float f;
        float left;
        float right;
        AnonymousClass8P2 r0;
        int i = this.A04;
        Object obj = this.A00;
        if (i != 0) {
            C133306h7 r4 = (C133306h7) obj;
            view = (View) this.A03;
            f = (float) ((View) this.A01).getLeft();
            if (((C620733j) this.A02).A0U()) {
                right = (float) view.getRight();
                r0 = r4.A0A;
            }
            left = (float) view.getLeft();
            return Float.valueOf(left - f);
        }
        C133316h8 r42 = (C133316h8) obj;
        view = (View) this.A03;
        f = (float) ((View) this.A01).getLeft();
        if (((C620733j) this.A02).A0U()) {
            right = (float) view.getRight();
            r0 = r42.A0E;
        }
        left = (float) view.getLeft();
        return Float.valueOf(left - f);
        left = right - AnonymousClass8P2.A00(r0);
        return Float.valueOf(left - f);
    }
}
