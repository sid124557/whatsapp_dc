package X;

/* renamed from: X.1m5  reason: invalid class name and case insensitive filesystem */
public final class C30211m5 extends C55162pu {
    public final long A00;
    public final C52042kn A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C30211m5) {
                C30211m5 r8 = (C30211m5) obj;
                if (!C162457s7.A0P(this.A01, r8.A01) || this.A00 != r8.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public static void A00(C624134x r1, C52042kn r2, long j) {
        r1.A1N(new C30211m5(r2, j));
    }

    public int hashCode() {
        return AnonymousClass0x2.A00(C18300x5.A04(this.A01), this.A00);
    }

    public C30211m5(C52042kn r1, long j) {
        this.A01 = r1;
        this.A00 = j;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Comment(parentMessageKey=");
        A0o.append(this.A01);
        A0o.append(", parentMessageRowId=");
        return C18270x1.A0U(A0o, this.A00);
    }
}
