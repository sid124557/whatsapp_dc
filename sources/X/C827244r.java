package X;

import java.util.Arrays;

/* renamed from: X.44r  reason: invalid class name and case insensitive filesystem */
public final class C827244r extends C829045j implements AnonymousClass4GQ {
    public static final C827244r A00 = new C827244r();

    public C827244r() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object[] objArr = new Object[1];
        C18310x6.A1T(objArr, ((Number) obj).byteValue(), 0);
        String format = String.format("%02X", Arrays.copyOf(objArr, 1));
        C162457s7.A0D(format);
        return format;
    }
}
