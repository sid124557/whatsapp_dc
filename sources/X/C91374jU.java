package X;

import com.whatsapp.R;

/* renamed from: X.4jU  reason: invalid class name and case insensitive filesystem */
public final class C91374jU extends C151657Vt {
    public final int A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C91374jU) {
                C91374jU r5 = (C91374jU) obj;
                if (!(this.A03 == r5.A03 && this.A01 == r5.A01 && this.A02 == r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        if (r2 == false) goto L_0x0005;
     */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C91374jU(boolean r2, boolean r3, boolean r4) {
        /*
            r1 = this;
            if (r3 == 0) goto L_0x0005
            r0 = 1
            if (r2 != 0) goto L_0x0006
        L_0x0005:
            r0 = 0
        L_0x0006:
            r1.<init>(r0, r4)
            r1.A03 = r2
            r1.A01 = r3
            r1.A02 = r4
            r0 = 2131895303(0x7f122407, float:1.9425435E38)
            if (r4 == 0) goto L_0x0017
            r0 = 2131895302(0x7f122406, float:1.9425433E38)
        L_0x0017:
            r1.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C91374jU.<init>(boolean, boolean, boolean):void");
    }

    public int A00() {
        return this.A00;
    }

    public int hashCode() {
        return AnonymousClass0x7.A00(AnonymousClass0x2.A01(AnonymousClass0x9.A04(this.A03), this.A01), this.A02);
    }

    public Integer A01() {
        return Integer.valueOf(R.string.f11nameremoved);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("BluetoothToggle(isCallActive=");
        A0o.append(this.A03);
        A0o.append(", isBluetoothAvailable=");
        A0o.append(this.A01);
        A0o.append(", isBluetoothSelected=");
        return C18260x0.A0A(A0o, this.A02);
    }
}
