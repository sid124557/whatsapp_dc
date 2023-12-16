package X;

/* renamed from: X.6VD  reason: invalid class name */
public class AnonymousClass6VD extends AnonymousClass6VE {
    public final byte[] zza;

    public final boolean equals(Object obj) {
        int A01;
        if (obj == this) {
            return true;
        }
        if ((obj instanceof AnonymousClass8Ln) && (A01 = A01()) == ((AnonymousClass8Ln) obj).A01()) {
            if (A01 == 0) {
                return true;
            }
            if (!(obj instanceof AnonymousClass6VD)) {
                return obj.equals(this);
            }
            AnonymousClass6VD r9 = (AnonymousClass6VD) obj;
            int i = this.zzc;
            int i2 = r9.zzc;
            if (i == 0 || i2 == 0 || i == i2) {
                int A012 = r9.A01();
                if (A01 > A012) {
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("Length too large: ");
                    A0o.append(A01);
                    A0o.append(A01);
                    throw C18310x6.A0d(A0o);
                } else if (A01 <= A012) {
                    byte[] bArr = this.zza;
                    byte[] bArr2 = r9.zza;
                    int i3 = 0;
                    int i4 = 0;
                    while (i3 < A01) {
                        if (bArr[i3] != bArr2[i4]) {
                            return false;
                        }
                        i3++;
                        i4++;
                    }
                    return true;
                } else {
                    StringBuilder A0o2 = AnonymousClass001.A0o();
                    A0o2.append("Ran off end of other: 0, ");
                    A0o2.append(A01);
                    throw AnonymousClass000.A0G(", ", A0o2, A012);
                }
            }
        }
        return false;
    }

    public AnonymousClass6VD(byte[] bArr) {
        bArr.getClass();
        this.zza = bArr;
    }
}
