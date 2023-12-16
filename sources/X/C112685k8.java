package X;

import java.util.HashSet;

/* renamed from: X.5k8  reason: invalid class name and case insensitive filesystem */
public class C112685k8 implements C84414Cg {
    public int A00;
    public int A01;
    public Runnable A02;
    public boolean A03;
    public boolean A04;
    public final HashSet A05 = AnonymousClass002.A0K();

    public Integer B1a() {
        return null;
    }

    public boolean isValid() {
        if (this.A03) {
            int i = this.A00;
            while (i <= this.A01) {
                if (C86624Kv.A1a(this.A05, i)) {
                    i++;
                }
            }
            this.A04 = true;
            return true;
        }
        return false;
    }
}
