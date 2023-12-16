package X;

import android.view.View;
import androidx.appcompat.widget.AppCompatSpinner;

/* renamed from: X.0vj  reason: invalid class name and case insensitive filesystem */
public class C17530vj extends C07190aT {
    public Object A00;
    public Object A01;
    public final int A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C17530vj(View view, Object obj, Object obj2, int i) {
        super(view);
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    public C16920uF A00() {
        if (this.A02 != 0) {
            return (C07540bC) this.A01;
        }
        AnonymousClass04O r0 = ((AnonymousClass04R) this.A00).A00.A0H;
        if (r0 == null) {
            return null;
        }
        return r0.A00();
    }

    public boolean A02() {
        if (this.A02 != 0) {
            return super.A02();
        }
        C07530bB r1 = ((AnonymousClass04R) this.A00).A00;
        if (r1.A0F != null) {
            return false;
        }
        r1.A01();
        return true;
    }

    public boolean A03() {
        if (this.A02 != 0) {
            AppCompatSpinner appCompatSpinner = (AppCompatSpinner) this.A00;
            C17080uX r2 = appCompatSpinner.A02;
            if (r2.BIy()) {
                return true;
            }
            r2.Boe(appCompatSpinner.getTextDirection(), appCompatSpinner.getTextAlignment());
            return true;
        }
        ((AnonymousClass04R) this.A00).A00.A03();
        return true;
    }
}
