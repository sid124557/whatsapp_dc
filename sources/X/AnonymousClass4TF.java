package X;

import android.view.View;
import java.util.List;

/* renamed from: X.4TF  reason: invalid class name */
public final class AnonymousClass4TF extends AnonymousClass0QA implements C15830s0 {
    public View A00;
    public AnonymousClass0XY A01;
    public boolean A02;

    public AnonymousClass4TF() {
        super(1);
    }

    public void A03(C05820Vc r3) {
        View view;
        if (this.A02 && (r3.A00.A06() & 8) != 0) {
            this.A02 = false;
            AnonymousClass0XY r1 = this.A01;
            if (r1 != null && (view = this.A00) != null) {
                C06560Yg.A07(view, r1);
            }
        }
    }

    public AnonymousClass0XY A01(AnonymousClass0XY r1, List list) {
        return r1;
    }

    public void A02(C05820Vc r2) {
        if ((r2.A00.A06() & 8) != 0) {
            this.A02 = true;
        }
    }

    public AnonymousClass0XY BMX(View view, AnonymousClass0XY r8) {
        C18260x0.A0O(view, r8);
        this.A00 = view;
        this.A01 = r8;
        int i = 7;
        if (!this.A02) {
            i = 15;
        }
        AnonymousClass0XU A0C = r8.A00.A0C(i);
        C162457s7.A0D(A0C);
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(i);
        A0o.append(' ');
        int i2 = A0C.A01;
        A0o.append(i2);
        A0o.append(", ");
        int i3 = A0C.A03;
        A0o.append(i3);
        A0o.append(", ");
        int i4 = A0C.A02;
        A0o.append(i4);
        A0o.append(", ");
        int i5 = A0C.A00;
        C18260x0.A1F(A0o, i5);
        view.setPadding(i2, i3, i4, i5);
        AnonymousClass0XY r0 = AnonymousClass0XY.A01;
        C162457s7.A0F(r0);
        return r0;
    }
}
