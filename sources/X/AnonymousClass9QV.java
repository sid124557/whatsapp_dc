package X;

/* renamed from: X.9QV  reason: invalid class name */
public final class AnonymousClass9QV {
    public final /* synthetic */ AnonymousClass7EY A00;

    public AnonymousClass9QV(AnonymousClass7EY r1) {
        this.A00 = r1;
    }

    public void A00(String str, String str2, Throwable th) {
        C150467Qv r2 = this.A00.A00.A03;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("AREngineLogger/softReport ");
        A0o.append(str);
        A0o.append(' ');
        r2.A00(AnonymousClass000.A0X(str2, A0o), new RuntimeException(str2, th));
    }
}
