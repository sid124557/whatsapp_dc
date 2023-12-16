package X;

import android.graphics.Rect;

/* renamed from: X.2ld  reason: invalid class name and case insensitive filesystem */
public final class C52532ld {
    public final C620633i A00;
    public final AnonymousClass1VX A01;
    public final C60152y5 A02;

    public final boolean A02(AnonymousClass33C r6) {
        C162457s7.A0J(r6, 0);
        int i = r6.A06;
        int i2 = r6.A08;
        int max = Math.max(i, i2);
        int min = Math.min(i, i2);
        AnonymousClass1VX r2 = this.A01;
        C58422vE r1 = C58422vE.A02;
        if (min >= r2.A0O(r1, 4171)) {
            return true;
        }
        if (max <= r2.A0O(r1, 4172) || min < r2.A0O(r1, 4175)) {
            return false;
        }
        return true;
    }

    public final boolean A00() {
        int A022 = AnonymousClass34G.A02(this.A00, this.A02);
        AnonymousClass1VX r2 = this.A01;
        C58422vE r1 = C58422vE.A02;
        if (A022 < r2.A0O(r1, 4154) || !r2.A0Y(r1, 3935)) {
            return false;
        }
        return true;
    }

    public final boolean A01(Rect rect, AnonymousClass3Z6 r7) {
        int max;
        int A002;
        int A0K;
        if (rect != null) {
            max = Math.max(rect.height(), rect.width());
            A002 = rect.height();
            A0K = rect.width();
        } else {
            max = Math.max(AnonymousClass3Z6.A00(r7), AnonymousClass001.A0K(r7.second));
            A002 = AnonymousClass3Z6.A00(r7);
            A0K = AnonymousClass001.A0K(r7.second);
        }
        int min = Math.min(A002, A0K);
        AnonymousClass1VX r2 = this.A01;
        C58422vE r1 = C58422vE.A02;
        if (min >= r2.A0O(r1, 4171)) {
            return true;
        }
        if (max <= r2.A0O(r1, 4172) || min < r2.A0O(r1, 4175)) {
            return false;
        }
        return true;
    }

    public C52532ld(C620633i r1, AnonymousClass1VX r2, C60152y5 r3) {
        C18260x0.A0V(r2, r1, r3);
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
    }
}
