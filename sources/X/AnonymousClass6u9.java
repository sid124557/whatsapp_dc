package X;

import java.io.IOException;

/* renamed from: X.6u9  reason: invalid class name */
public class AnonymousClass6u9 extends IOException {
    public static final long serialVersionUID = -6947486886997889499L;

    public AnonymousClass6u9(String str, Throwable th) {
        super(AnonymousClass000.A0V("CodedOutputStream was writing to a flat byte array and ran out of space.: ", str, AnonymousClass001.A0o()), th);
    }

    public AnonymousClass6u9() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    public AnonymousClass6u9(Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
    }
}
