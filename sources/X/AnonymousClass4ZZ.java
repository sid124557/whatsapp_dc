package X;

import com.google.android.material.tabs.TabLayout;
import java.lang.ref.WeakReference;

/* renamed from: X.4ZZ  reason: invalid class name */
public class AnonymousClass4ZZ extends C04590Ow {
    public int A00 = 0;
    public int A01 = 0;
    public final WeakReference A02;

    public void A00(int i) {
        this.A00 = this.A01;
        this.A01 = i;
        TabLayout tabLayout = (TabLayout) this.A02.get();
        if (tabLayout != null) {
            tabLayout.A0H = i;
        }
    }

    public void A01(int i) {
        boolean z;
        TabLayout tabLayout = (TabLayout) this.A02.get();
        if (tabLayout != null && tabLayout.getSelectedTabPosition() != i && i < tabLayout.A0k.size()) {
            int i2 = this.A01;
            if (i2 == 0 || (i2 == 2 && this.A00 == 0)) {
                z = true;
            } else {
                z = false;
            }
            tabLayout.A0G(tabLayout.A05(i), z);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0016, code lost:
        if (r0 != 0) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(int r6, float r7, int r8) {
        /*
            r5 = this;
            java.lang.ref.WeakReference r0 = r5.A02
            java.lang.Object r4 = r0.get()
            com.google.android.material.tabs.TabLayout r4 = (com.google.android.material.tabs.TabLayout) r4
            if (r4 == 0) goto L_0x001c
            int r3 = r5.A01
            r2 = 0
            r0 = 2
            r1 = 1
            if (r3 != r0) goto L_0x0018
            int r0 = r5.A00
            if (r0 == r1) goto L_0x0018
            r1 = 0
            if (r0 == 0) goto L_0x0019
        L_0x0018:
            r2 = 1
        L_0x0019:
            r4.A0A(r7, r6, r1, r2)
        L_0x001c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4ZZ.A02(int, float, int):void");
    }

    public AnonymousClass4ZZ(TabLayout tabLayout) {
        this.A02 = AnonymousClass0x9.A14(tabLayout);
    }
}
