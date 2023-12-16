package X;

/* renamed from: X.7oh  reason: invalid class name and case insensitive filesystem */
public final class C160937oh {
    public static void checkEntryNotNull(Object obj, Object obj2) {
        if (obj == null) {
            String valueOf = String.valueOf(obj2);
            StringBuilder A0Y = AnonymousClass6CA.A0Y(valueOf.length() + 24);
            A0Y.append("null key in entry: null=");
            throw AnonymousClass0x2.A0V(valueOf, A0Y);
        } else if (obj2 == null) {
            String valueOf2 = String.valueOf(obj);
            StringBuilder A0Y2 = AnonymousClass6CA.A0Y(valueOf2.length() + 26);
            A0Y2.append("null value in entry: ");
            A0Y2.append(valueOf2);
            throw AnonymousClass0x2.A0V("=null", A0Y2);
        }
    }

    public static int checkNonnegative(int i, String str) {
        if (i >= 0) {
            return i;
        }
        throw AnonymousClass000.A0G(" cannot be negative but was: ", AnonymousClass6C8.A0g(AnonymousClass6C7.A06(str) + 40, str), i);
    }

    public static void checkPositive(int i, String str) {
        if (i <= 0) {
            throw AnonymousClass000.A0G(" must be positive but was: ", AnonymousClass6C8.A0g(AnonymousClass6C7.A06("count") + 38, "count"), i);
        }
    }

    public static void checkRemove(boolean z) {
        C162187rP.A05("no calls to next() since the last call to remove()", z);
    }
}
