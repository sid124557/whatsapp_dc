package X;

import java.util.Arrays;

/* renamed from: X.7ZU  reason: invalid class name */
public final class AnonymousClass7ZU {
    public final String A00;
    public final String A01;
    public final C152517Ze A02;
    public final Object[] A03;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AnonymousClass7ZU)) {
            return false;
        }
        AnonymousClass7ZU r4 = (AnonymousClass7ZU) obj;
        return this.A01.equals(r4.A01) && this.A00.equals(r4.A00) && this.A02.equals(r4.A02) && Arrays.equals(this.A03, r4.A03);
    }

    public int hashCode() {
        return ((this.A01.hashCode() ^ Integer.rotateLeft(this.A00.hashCode(), 8)) ^ Integer.rotateLeft(this.A02.hashCode(), 16)) ^ Integer.rotateLeft(Arrays.hashCode(this.A03), 24);
    }

    public AnonymousClass7ZU(String str, String str2, C152517Ze r3, Object... objArr) {
        this.A01 = str;
        this.A00 = str2;
        this.A02 = r3;
        this.A03 = objArr;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(this.A01);
        A0o.append(" : ");
        A0o.append(this.A00);
        A0o.append(' ');
        A0o.append(this.A02);
        A0o.append(' ');
        C18320x8.A1P(A0o, this.A03);
        return A0o.toString();
    }
}
