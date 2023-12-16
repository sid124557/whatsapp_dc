package X;

/* renamed from: X.0nr  reason: invalid class name and case insensitive filesystem */
public class C13860nr extends RuntimeException {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13860nr(String str) {
        super(str != null ? str.toString() : "The operation has been canceled.");
    }

    public C13860nr() {
        super("The operation has been canceled.");
    }
}
