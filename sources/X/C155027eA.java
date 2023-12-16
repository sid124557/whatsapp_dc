package X;

import java.util.Map;

/* renamed from: X.7eA  reason: invalid class name and case insensitive filesystem */
public final class C155027eA {
    public static final Map A00;

    static {
        AnonymousClass3Z6[] r2 = new AnonymousClass3Z6[3];
        AnonymousClass3Z6.A04("pincode", "^\\d{6}$", r2);
        r2[1] = AnonymousClass3Z6.A02("cep", "^\\d{8}$");
        r2[2] = AnonymousClass3Z6.A02("postal_code", "^\\d{5}$");
        A00 = C73813g7.A0F(r2);
    }
}
