package X;

/* renamed from: X.7m9  reason: invalid class name and case insensitive filesystem */
public class C159597m9 {
    public static boolean A00 = true;

    public static void A00(C162987t5 r3, String str, String str2, Object... objArr) {
        if (A00) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("playerId[");
            A0o.append(r3.A0k);
            C161157p6.A01(str, AnonymousClass000.A0V("]: ", str2, A0o), objArr);
        }
    }

    public static void A02(String str, Object... objArr) {
        if (A00) {
            C161157p6.A01("HeroService", str, objArr);
        }
    }

    public static void A01(C162987t5 r3, String str, Throwable th, Object... objArr) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("playerId[");
        A0o.append(r3.A0k);
        AnonymousClass6C9.A15(AnonymousClass000.A0V("]: ", str, A0o), "HeroService", th, objArr);
    }
}
