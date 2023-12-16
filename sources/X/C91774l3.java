package X;

/* renamed from: X.4l3  reason: invalid class name and case insensitive filesystem */
public final class C91774l3 extends C100225Ab {
    public final String A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C91774l3) && C162457s7.A0P(this.A00, ((C91774l3) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C91774l3(String str) {
        this.A00 = str;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("QrDataState(qrData=");
        return C18260x0.A07(this.A00, A0o);
    }
}
