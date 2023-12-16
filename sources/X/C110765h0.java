package X;

import com.google.android.material.tabs.TabLayout;
import java.lang.ref.WeakReference;

/* renamed from: X.5h0  reason: invalid class name and case insensitive filesystem */
public class C110765h0 implements C16870uA {
    public int A00;
    public int A01;
    public final WeakReference A02;

    public void BXd(int i) {
        this.A00 = this.A01;
        this.A01 = i;
        TabLayout tabLayout = (TabLayout) this.A02.get();
        if (tabLayout != null) {
            tabLayout.A0H = i;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001b, code lost:
        r4.A0A(r7, r6, r1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001f, code lost:
        if (r3 == 2) goto L_0x0016;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0018, code lost:
        if (r5.A00 != 0) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
        r2 = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BXe(int r6, float r7, int r8) {
        /*
            r5 = this;
            java.lang.ref.WeakReference r0 = r5.A02
            java.lang.Object r4 = r0.get()
            com.google.android.material.tabs.TabLayout r4 = (com.google.android.material.tabs.TabLayout) r4
            if (r4 == 0) goto L_0x001e
            int r3 = r5.A01
            r2 = 0
            r0 = 2
            r1 = 1
            if (r3 != r0) goto L_0x001f
            int r0 = r5.A00
            if (r0 == r1) goto L_0x0016
            r1 = 0
        L_0x0016:
            int r0 = r5.A00
            if (r0 == 0) goto L_0x001b
        L_0x001a:
            r2 = 1
        L_0x001b:
            r4.A0A(r7, r6, r1, r2)
        L_0x001e:
            return
        L_0x001f:
            if (r3 != r0) goto L_0x001a
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C110765h0.BXe(int, float, int):void");
    }

    public void BXf(int i) {
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

    public C110765h0(TabLayout tabLayout) {
        this.A02 = AnonymousClass0x9.A14(tabLayout);
    }
}
