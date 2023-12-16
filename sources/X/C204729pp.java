package X;

import android.graphics.Point;

/* renamed from: X.9pp  reason: invalid class name and case insensitive filesystem */
public class C204729pp implements C202329lq {
    public Object A00;
    public final int A01;

    public C204729pp(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void BTf(Point point, C192379Jm r9) {
        Object[] objArr;
        int i;
        int i2;
        long j;
        if (this.A01 != 0) {
            AnonymousClass9ZR r5 = (AnonymousClass9ZR) this.A00;
            if (!r5.A0f) {
                if (r5.A0G) {
                    j = 4000;
                } else {
                    j = 2000;
                }
                synchronized (r5) {
                    r5.A07();
                    r5.A0c = r5.A0U.A02("reset_focus", new C204469pP((Object) r5, 2), j);
                }
                return;
            }
            return;
        }
        C195579Yl r6 = (C195579Yl) this.A00;
        AnonymousClass9N9 r52 = r6.A0E;
        if (r52 != null) {
            int ordinal = r9.ordinal();
            if (ordinal != 0) {
                if (ordinal != 3) {
                    if (ordinal == 4 || ordinal == 5) {
                        i2 = 13;
                    } else if (ordinal == 1) {
                        i2 = 14;
                    } else {
                        return;
                    }
                    AnonymousClass6C7.A10(r6.A0J, r52, i2);
                    return;
                } else if (point != null) {
                    objArr = AnonymousClass4L0.A0V(r52, point, 2);
                    i = 12;
                } else {
                    return;
                }
            } else if (point != null) {
                objArr = AnonymousClass4L0.A0V(r52, point, 2);
                i = 11;
            } else {
                return;
            }
            AnonymousClass6C7.A10(r6.A0J, objArr, i);
        }
    }
}
