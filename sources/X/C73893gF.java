package X;

/* renamed from: X.3gF  reason: invalid class name and case insensitive filesystem */
public abstract class C73893gF extends AnonymousClass8P9 {
    public C73893gF(C84814Du r3) {
        super(r3);
        if (r3 != null && r3.B5w() != C72553du.A00) {
            throw AnonymousClass001.A0c("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    public C85494Gl B5w() {
        return C72553du.A00;
    }
}
