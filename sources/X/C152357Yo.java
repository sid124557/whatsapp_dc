package X;

/* renamed from: X.7Yo  reason: invalid class name and case insensitive filesystem */
public final class C152357Yo {
    public final long A00;
    public final long A01;
    public final String A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C152357Yo) {
                C152357Yo r8 = (C152357Yo) obj;
                if (!(this.A01 == r8.A01 && C162457s7.A0P(this.A02, r8.A02) && this.A00 == r8.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0x2.A00((AnonymousClass0x2.A02(this.A01) + C18270x1.A00(this.A02)) * 31, this.A00);
    }

    public C152357Yo(long j, String str, long j2) {
        this.A01 = j;
        this.A02 = str;
        this.A00 = j2;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("PictureProcessingHelper(pictureId=");
        A0o.append(this.A01);
        A0o.append(", pictureDirectPath=");
        A0o.append(this.A02);
        A0o.append(", photoIdForWaContact=");
        return C18270x1.A0U(A0o, this.A00);
    }
}
