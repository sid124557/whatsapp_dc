package X;

import android.view.View;
import java.util.AbstractCollection;

/* renamed from: X.0vx  reason: invalid class name and case insensitive filesystem */
public class C17670vx extends C08750f0 {
    public Object A00;
    public Object A01;
    public final int A02;

    public C17670vx(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public void Bef(C10560i8 r4) {
        switch (this.A02) {
            case 0:
                AnonymousClass0VZ.A02.A04((View) this.A01, 1.0f);
                break;
            case 1:
                ((AbstractCollection) ((C06290Wz) this.A01).get(((C06990a9) this.A00).A00)).remove(r4);
                break;
            default:
                ((C10560i8) this.A01).A0I();
                break;
        }
        r4.A0C(this);
    }
}
