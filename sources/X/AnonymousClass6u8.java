package X;

import java.io.IOException;

/* renamed from: X.6u8  reason: invalid class name */
public final class AnonymousClass6u8 extends IOException {
    public AnonymousClass6u8(String str, Throwable th) {
        super(AnonymousClass6C7.A0j("CodedOutputStream was writing to a flat byte array and ran out of space.: ", str), th);
    }

    public AnonymousClass6u8() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    public AnonymousClass6u8(Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
    }
}
