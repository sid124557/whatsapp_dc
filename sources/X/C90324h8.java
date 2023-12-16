package X;

import android.os.Parcel;

/* renamed from: X.4h8  reason: invalid class name and case insensitive filesystem */
public class C90324h8 extends C109015dw {
    public final boolean A00;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C90324h8(X.C109015dw r35, boolean r36) {
        /*
            r34 = this;
            r1 = r35
            java.lang.String r0 = r1.A0F
            r17 = r0
            java.lang.String r15 = r1.A05
            java.lang.String r14 = r1.A0C
            java.math.BigDecimal r13 = r1.A06
            X.7ny r12 = r1.A04
            java.lang.String r11 = r1.A0E
            java.lang.String r10 = r1.A0G
            java.util.List r9 = r1.A07
            X.38u r8 = r1.A01
            X.5dU r7 = r1.A02
            java.lang.String r6 = r1.A0D
            int r5 = r1.A00
            boolean r4 = r1.A08
            long r2 = r1.A09
            X.5dV r1 = r1.A0B
            r32 = 1
            r16 = 0
            r0 = r34
            r33 = r4
            r30 = r2
            r28 = r9
            r29 = r5
            r26 = r6
            r27 = r13
            r24 = r11
            r25 = r10
            r22 = r15
            r23 = r14
            r20 = r12
            r21 = r17
            r18 = r7
            r19 = r1
            r17 = r8
            r15 = r0
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r32, r33)
            r1 = r36
            r0.A00 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C90324h8.<init>(X.5dw, boolean):void");
    }

    public boolean equals(Object obj) {
        if (!super.equals(obj) || !(obj instanceof C90324h8) || this.A00 != ((C90324h8) obj).A00) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (super.hashCode() * 31) + (this.A00 ? 1 : 0);
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.A00 ? (byte) 1 : 0);
    }
}
