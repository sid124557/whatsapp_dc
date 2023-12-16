package X;

/* renamed from: X.6z2  reason: invalid class name and case insensitive filesystem */
public final class C143526z2 extends Exception {
    public final String msg;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C143526z2(String str) {
        super(AnonymousClass000.A0V("ServerMalformedSuccessResponse: Server sent malformed success response: ", str, AnonymousClass001.A0o()));
        C162457s7.A0J(str, 1);
        this.msg = str;
    }
}
