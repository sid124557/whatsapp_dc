package X;

/* renamed from: X.6z6  reason: invalid class name and case insensitive filesystem */
public final class C143566z6 extends Exception {
    public final int errorCode;
    public final C166637z1 format;
    public final boolean isRecoverable;

    public C143566z6(C166637z1 r3, int i, boolean z) {
        super(AnonymousClass000.A0Y("AudioTrack write failed: ", AnonymousClass001.A0o(), i));
        this.isRecoverable = z;
        this.errorCode = i;
        this.format = r3;
    }
}
