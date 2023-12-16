package X;

/* renamed from: X.7TF  reason: invalid class name */
public class AnonymousClass7TF {
    public String A00;
    public String A01;
    public String A02;

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("OtpSms{, sms='");
        char A012 = C18300x5.A01(this.A00, A0o);
        A0o.append(", otp='");
        A0o.append(this.A01);
        A0o.append(A012);
        A0o.append(", id='");
        A0o.append(this.A02);
        A0o.append(A012);
        return AnonymousClass000.A0d(A0o);
    }
}
