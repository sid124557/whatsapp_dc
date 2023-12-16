package X;

/* renamed from: X.2jp  reason: invalid class name and case insensitive filesystem */
public final class C51442jp {
    public String A00;
    public String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || C51442jp.class != obj.getClass()) {
                return false;
            }
            C51442jp r5 = (C51442jp) obj;
            if (!this.A01.equals(r5.A01) || !this.A00.equals(r5.A00)) {
                return false;
            }
        }
        return true;
    }

    public C51442jp(String str, String str2) {
        this.A01 = str;
        this.A00 = str2;
    }

    public int hashCode() {
        Object[] A0M = AnonymousClass002.A0M();
        A0M[0] = this.A01;
        return C18310x6.A08(this.A00, A0M, 1);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("BootstrapId{sessionId=");
        A0o.append(this.A01);
        A0o.append(", mdRegAttemptId=");
        A0o.append(this.A00);
        return AnonymousClass000.A0d(A0o);
    }
}
