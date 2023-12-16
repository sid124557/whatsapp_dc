package X;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.0Oc  reason: invalid class name and case insensitive filesystem */
public class C04410Oc {
    public long A00 = -1;
    public Interpolator A01;
    public AnonymousClass0u4 A02;
    public boolean A03;
    public final C08150dP A04 = new C17570vn(this);
    public final ArrayList A05 = AnonymousClass001.A0s();

    public void A00() {
        if (this.A03) {
            Iterator it = this.A05.iterator();
            while (it.hasNext()) {
                ((C04830Qv) it.next()).A01();
            }
            this.A03 = false;
        }
    }

    public void A01() {
        if (!this.A03) {
            Iterator it = this.A05.iterator();
            while (it.hasNext()) {
                C04830Qv r5 = (C04830Qv) it.next();
                long j = this.A00;
                if (j >= 0) {
                    r5.A08(j);
                }
                Interpolator interpolator = this.A01;
                if (interpolator != null) {
                    r5.A09(interpolator);
                }
                if (this.A02 != null) {
                    r5.A0A(this.A04);
                }
                r5.A02();
            }
            this.A03 = true;
        }
    }
}
