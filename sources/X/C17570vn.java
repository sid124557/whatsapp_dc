package X;

import android.view.View;

/* renamed from: X.0vn  reason: invalid class name and case insensitive filesystem */
public class C17570vn extends C08150dP {
    public int A00;
    public Object A01;
    public boolean A02;
    public final int A03 = 0;

    public C17570vn(C07580bG r2, int i) {
        this.A01 = r2;
        this.A00 = i;
        this.A02 = false;
    }

    public void BMP(View view) {
        if (1 - this.A03 == 0) {
            this.A02 = true;
        }
    }

    public void BMQ(View view) {
        if (this.A03 == 0) {
            int i = this.A00 + 1;
            this.A00 = i;
            C04410Oc r2 = (C04410Oc) this.A01;
            if (i == r2.A05.size()) {
                AnonymousClass0u4 r1 = r2.A02;
                if (r1 != null) {
                    r1.BMQ((View) null);
                }
                this.A00 = 0;
                this.A02 = false;
                r2.A03 = false;
            }
        } else if (!this.A02) {
            ((C07580bG) this.A01).A09.setVisibility(this.A00);
        }
    }

    public void BMS(View view) {
        if (this.A03 != 0) {
            ((C07580bG) this.A01).A09.setVisibility(0);
        } else if (!this.A02) {
            this.A02 = true;
            AnonymousClass0u4 r1 = ((C04410Oc) this.A01).A02;
            if (r1 != null) {
                r1.BMS((View) null);
            }
        }
    }

    public C17570vn(C04410Oc r2) {
        this.A01 = r2;
        this.A02 = false;
        this.A00 = 0;
    }
}
