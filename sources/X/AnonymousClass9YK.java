package X;

import java.util.Map;

/* renamed from: X.9YK  reason: invalid class name */
public final class AnonymousClass9YK implements C16900uD {
    public final Map A00;

    public /* bridge */ /* synthetic */ Long B90(String str) {
        long A0B;
        C162457s7.A0J(str, 0);
        Object obj = this.A00.get(AnonymousClass000.A0V("bloks/impression-time-tracker/", str, AnonymousClass001.A0o()));
        if (!(obj instanceof Long)) {
            A0B = -2147483648L;
        } else {
            A0B = C18310x6.A0B(obj);
        }
        return Long.valueOf(A0B);
    }

    public boolean BFV(String str) {
        long A0B;
        C162457s7.A0J(str, 0);
        String A0V = AnonymousClass000.A0V("bloks/impression-time-tracker/", str, AnonymousClass001.A0o());
        C162457s7.A0J(A0V, 0);
        Object obj = this.A00.get(AnonymousClass000.A0V("bloks/impression-time-tracker/", A0V, AnonymousClass001.A0o()));
        if (!(obj instanceof Long)) {
            A0B = -2147483648L;
        } else {
            A0B = C18310x6.A0B(obj);
        }
        return AnonymousClass000.A1S((A0B > -2147483648L ? 1 : (A0B == -2147483648L ? 0 : -1)));
    }

    public void Brh(String str) {
        C162457s7.A0J(str, 0);
        this.A00.put(AnonymousClass000.A0V("bloks/impression-time-tracker/", str, AnonymousClass001.A0o()), Long.valueOf(System.currentTimeMillis()));
    }

    public AnonymousClass9YK(Map map) {
        this.A00 = map;
    }
}
