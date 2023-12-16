package X;

import java.io.IOException;

/* renamed from: X.6uB  reason: invalid class name and case insensitive filesystem */
public final class C140606uB extends IOException {
    public C140606uB(String str, Throwable th) {
        super(AnonymousClass6C7.A0j("CodedOutputStream was writing to a flat byte array and ran out of space.: ", str), th);
    }

    public C140606uB() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    public C140606uB(String str) {
        super(AnonymousClass6C7.A0j("CodedOutputStream was writing to a flat byte array and ran out of space.: ", str));
    }

    public C140606uB(Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
    }
}
