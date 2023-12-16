package X;

/* renamed from: X.6jX  reason: invalid class name and case insensitive filesystem */
public final class C134736jX extends C1450974d {
    public final String A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C134736jX) && C162457s7.A0P(this.A00, ((C134736jX) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C134736jX(String str) {
        this.A00 = str;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Success(taskId=");
        return C18260x0.A07(this.A00, A0o);
    }
}
