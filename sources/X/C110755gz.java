package X;

import com.whatsapp.biz.linkedaccounts.LinkedAccountMediaViewFragment;

/* renamed from: X.5gz  reason: invalid class name and case insensitive filesystem */
public class C110755gz implements C16870uA {
    public int A00;
    public final /* synthetic */ LinkedAccountMediaViewFragment A01;

    public C110755gz(LinkedAccountMediaViewFragment linkedAccountMediaViewFragment) {
        this.A01 = linkedAccountMediaViewFragment;
        this.A00 = linkedAccountMediaViewFragment.A03;
    }

    public void BXe(int i, float f, int i2) {
        if (this.A00 != i) {
            LinkedAccountMediaViewFragment linkedAccountMediaViewFragment = this.A01;
            linkedAccountMediaViewFragment.A01 = i;
            this.A00 = i;
            if (linkedAccountMediaViewFragment.A02 == 0) {
                int i3 = 27;
                if (linkedAccountMediaViewFragment.A00 == 0) {
                    i3 = 26;
                }
                linkedAccountMediaViewFragment.A06.A02(linkedAccountMediaViewFragment.A07, i3);
                return;
            }
            linkedAccountMediaViewFragment.A05.A00(linkedAccountMediaViewFragment.A0E, 3);
        }
    }

    public void BXd(int i) {
    }

    public void BXf(int i) {
    }
}
