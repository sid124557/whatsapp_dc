package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.4XZ  reason: invalid class name */
public class AnonymousClass4XZ extends C04580Ov {
    public int A00;
    public int A01;
    public boolean A02;
    public boolean A03 = false;
    public boolean A04;
    public final AnonymousClass8GN A05;
    public final boolean A06;
    public final boolean A07;

    public AnonymousClass4XZ(AnonymousClass8GN r2, int i, int i2, boolean z, boolean z2) {
        this.A01 = i;
        this.A07 = z;
        this.A06 = z2;
        this.A00 = i2;
        this.A05 = r2;
    }

    public int hashCode() {
        Object[] objArr = new Object[4];
        AnonymousClass000.A1L(objArr, this.A01);
        AnonymousClass000.A1R(objArr, this.A03);
        AnonymousClass000.A1N(objArr, this.A00);
        return C18310x6.A08(Boolean.valueOf(this.A06), objArr, 3);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass4XZ)) {
            return false;
        }
        AnonymousClass4XZ r4 = (AnonymousClass4XZ) obj;
        if (this.A01 == r4.A01 && this.A00 == r4.A00 && this.A03 == r4.A03 && this.A06 == r4.A06) {
            return true;
        }
        return false;
    }

    public void A03(Rect rect, View view, AnonymousClass0Q1 r17, RecyclerView recyclerView) {
        int A012;
        int i;
        int A022;
        int i2;
        int i3;
        int i4;
        int i5;
        int A002 = RecyclerView.A00(view);
        if (this.A04) {
            A012 = 3;
        } else if (this.A06) {
            A012 = r17.A00();
        } else {
            A012 = this.A05.A01(r17.A00(), this.A03);
        }
        int i6 = A002 % A012;
        boolean z = this.A06;
        int i7 = 0;
        RecyclerView recyclerView2 = recyclerView;
        if (!z || !this.A02 || A012 >= 3 || i6 != 0) {
            i = 0;
        } else {
            int width = recyclerView2.getWidth();
            i = ((width - (((int) (((double) width) / (((double) 3) + 0.25d))) * A012)) - ((A012 - 1) * this.A01)) / 2;
        }
        if (z) {
            A022 = 1;
        } else if (this.A04) {
            A022 = ((r17.A00() - 1) / 3) + 1;
        } else {
            A022 = this.A05.A02(r17.A00(), this.A03);
        }
        if (this.A04) {
            if (A002 / A012 == A022 - 1) {
                i = (C86664Kz.A0E(recyclerView2, A012) * ((A022 * A012) - r17.A00())) / 2;
            }
            i5 = this.A01 / 2;
            i3 = i5 + i;
            i4 = i5 - i;
            i7 = i5;
        } else {
            int A003 = (A002 * A022) / r17.A00();
            if (i6 != 0) {
                i2 = this.A01 / 2;
            } else if ((this.A00 & 4) == 4) {
                i2 = this.A01;
            } else {
                i2 = 0;
            }
            i3 = i2 + i;
            if (i6 != A012 - 1) {
                i4 = this.A01 / 2;
            } else if ((this.A00 & 8) == 8) {
                i4 = this.A01;
            } else {
                i4 = 0;
            }
            if (A003 != 0) {
                i5 = this.A01 / 2;
            } else if ((this.A00 & 1) == 1) {
                i5 = this.A01;
            } else {
                i5 = 0;
            }
            if (A003 != A022 - 1) {
                i7 = this.A01 / 2;
            } else if ((this.A00 & 2) == 2) {
                i7 = this.A01;
            }
        }
        int i8 = i4;
        if (this.A07) {
            i8 = i3;
            i3 = i4;
        }
        rect.set(i8, i5, i3, i7);
    }
}
