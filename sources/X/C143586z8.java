package X;

/* renamed from: X.6z8  reason: invalid class name and case insensitive filesystem */
public final class C143586z8 extends Exception {
    public final int errorCode;
    public final C166527yp format;
    public final boolean isRecoverable;

    public C143586z8(C166527yp r3, int i, boolean z) {
        super(AnonymousClass000.A0Y("AudioTrack write failed: ", AnonymousClass001.A0o(), i));
        this.isRecoverable = z;
        this.errorCode = i;
        this.format = r3;
    }
}
