package X;

import java.util.Arrays;

/* renamed from: X.44d  reason: invalid class name and case insensitive filesystem */
public final class C825844d extends C829045j implements AnonymousClass4GQ {
    public static final C825844d A00 = new C825844d();

    public C825844d() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object[] objArr = new Object[1];
        C18310x6.A1T(objArr, ((Number) obj).byteValue(), 0);
        String format = String.format("%02x", Arrays.copyOf(objArr, 1));
        C162457s7.A0D(format);
        return format;
    }
}
