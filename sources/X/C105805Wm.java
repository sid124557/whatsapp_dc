package X;

import android.text.TextUtils;
import java.io.Serializable;

/* renamed from: X.5Wm  reason: invalid class name and case insensitive filesystem */
public class C105805Wm {
    public Long A00;
    public Long A01;
    public Long A02;
    public Long A03;
    public Long A04;
    public Long A05;
    public Long A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;

    public String toString() {
        Serializable[] serializableArr = new Serializable[10];
        serializableArr[0] = this.A06;
        AnonymousClass000.A1R(serializableArr, this.A07);
        AnonymousClass001.A1S(serializableArr, this.A09);
        serializableArr[3] = this.A03;
        serializableArr[4] = Boolean.valueOf(this.A08);
        serializableArr[5] = this.A05;
        serializableArr[6] = this.A04;
        serializableArr[7] = this.A02;
        serializableArr[8] = this.A01;
        return TextUtils.join(",", AnonymousClass0x9.A1A(this.A00, serializableArr, 9));
    }

    public C105805Wm(Long l, Long l2, Long l3, Long l4, Long l5, Long l6, Long l7, boolean z, boolean z2, boolean z3) {
        this.A06 = l;
        this.A07 = z;
        this.A09 = z2;
        this.A03 = l2;
        this.A08 = z3;
        this.A05 = l3;
        this.A04 = l4;
        this.A02 = l5;
        this.A01 = l6;
        this.A00 = l7;
    }

    public static C105805Wm A00(String str) {
        boolean z;
        boolean z2;
        boolean z3;
        String[] A1b = C18320x8.A1b(str);
        Long A042 = C624334z.A04(A1b, 0);
        int length = A1b.length;
        if (length > 1) {
            z = Boolean.parseBoolean(A1b[1]);
            if (length > 2) {
                z2 = Boolean.parseBoolean(A1b[2]);
            }
            z2 = false;
        } else {
            z = false;
            z2 = false;
        }
        Long A043 = C624334z.A04(A1b, 3);
        if (length > 4) {
            z3 = Boolean.parseBoolean(A1b[4]);
        } else {
            z3 = false;
        }
        return new C105805Wm(A042, A043, C624334z.A04(A1b, 5), C624334z.A04(A1b, 6), C624334z.A04(A1b, 7), C624334z.A04(A1b, 8), C624334z.A04(A1b, 9), z, z2, z3);
    }
}
