package X;

import android.graphics.Rect;

/* renamed from: X.0Pg  reason: invalid class name */
public final class AnonymousClass0Pg {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;

    public boolean equals(Object obj) {
        Class<?> cls;
        if (this != obj) {
            Class<AnonymousClass0Pg> cls2 = AnonymousClass0Pg.class;
            if (obj != null) {
                cls = obj.getClass();
            } else {
                cls = null;
            }
            if (cls2.equals(cls)) {
                C162457s7.A0K(obj, "null cannot be cast to non-null type androidx.window.core.Bounds");
                AnonymousClass0Pg r5 = (AnonymousClass0Pg) obj;
                if (!(this.A01 == r5.A01 && this.A03 == r5.A03 && this.A02 == r5.A02 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public AnonymousClass0Pg(Rect rect) {
        int i = rect.left;
        int i2 = rect.top;
        int i3 = rect.right;
        int i4 = rect.bottom;
        this.A01 = i;
        this.A03 = i2;
        this.A02 = i3;
        this.A00 = i4;
        if (i > i3) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("Left must be less than or equal to right, left: ");
            A0o.append(i);
            throw AnonymousClass000.A0G(", right: ", A0o, i3);
        } else if (i2 > i4) {
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append("top must be less than or equal to bottom, top: ");
            A0o2.append(i2);
            throw AnonymousClass000.A0G(", bottom: ", A0o2, i4);
        }
    }

    public int hashCode() {
        return (((((this.A01 * 31) + this.A03) * 31) + this.A02) * 31) + this.A00;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(AnonymousClass0Pg.class.getSimpleName());
        A0o.append(" { [");
        A0o.append(this.A01);
        A0o.append(',');
        A0o.append(this.A03);
        A0o.append(',');
        A0o.append(this.A02);
        A0o.append(',');
        A0o.append(this.A00);
        return AnonymousClass000.A0X("] }", A0o);
    }
}
