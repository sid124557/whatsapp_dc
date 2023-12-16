package X;

/* renamed from: X.7Zf  reason: invalid class name and case insensitive filesystem */
public class C152527Zf {
    public long A00 = -1;
    public long A01 = -1;
    public long A02 = -1;
    public long A03 = -1;
    public String A04 = "";
    public String A05 = "";

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C152527Zf r7 = (C152527Zf) obj;
            if (!(this.A03 == r7.A03 && this.A00 == r7.A00 && this.A02 == r7.A02 && this.A01 == r7.A01 && this.A05.equals(r7.A05) && this.A04.equals(r7.A04))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[6];
        C18280x3.A1S(objArr, this.A03);
        AnonymousClass001.A1Q(objArr, this.A00);
        AnonymousClass0x2.A1U(objArr, this.A02);
        AnonymousClass0x2.A1V(objArr, this.A01);
        objArr[4] = this.A05;
        return C18310x6.A08(this.A04, objArr, 5);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("startReadTimeUs:");
        A0o.append(this.A03);
        A0o.append("\nendReadTimeUs:");
        A0o.append(this.A00);
        A0o.append("\nframeBeforeStartReadTimeUs:");
        A0o.append(this.A02);
        A0o.append("\nframeAfterEndReadTimeUs:");
        A0o.append(this.A01);
        A0o.append("\ntrackInfoMap:");
        A0o.append(this.A05);
        A0o.append("\nexceptions:");
        return AnonymousClass000.A0X(this.A04, A0o);
    }
}
