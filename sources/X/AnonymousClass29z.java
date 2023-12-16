package X;

import android.content.Context;

/* renamed from: X.29z  reason: invalid class name */
public final class AnonymousClass29z {
    public static boolean A00(Context context) {
        C389229y.A02(context, C64333Db.class);
        C129526aS of = C129526aS.of();
        boolean z = false;
        if (of.size() <= 1) {
            z = true;
        }
        AnonymousClass2A2.A00("Cannot bind the flag @DisableFragmentGetContextFix more than once.", new Object[0], z);
        if (of.isEmpty()) {
            return true;
        }
        return AnonymousClass001.A1Z(of.iterator().next());
    }
}
