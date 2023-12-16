package X;

import java.util.Locale;

/* renamed from: X.44X  reason: invalid class name */
public final class AnonymousClass44X extends C829045j implements AnonymousClass4GQ {
    public static final AnonymousClass44X A00 = new AnonymousClass44X();

    public AnonymousClass44X() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str = (String) obj;
        C162457s7.A0J(str, 0);
        String A0g = C18320x8.A0g(Locale.ROOT, str);
        if (A0g.length() <= 0) {
            return A0g;
        }
        char titleCase = Character.toTitleCase(A0g.charAt(0));
        String substring = A0g.substring(1);
        C162457s7.A0D(substring);
        return AnonymousClass0x2.A0e(substring, AnonymousClass001.A0o(), titleCase);
    }
}
