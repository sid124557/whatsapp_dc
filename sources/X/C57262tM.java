package X;

/* renamed from: X.2tM  reason: invalid class name and case insensitive filesystem */
public final class C57262tM {
    public static final String A00(String str) {
        String[] A1b = AnonymousClass0x7.A1b(C175728Zm.A0P(str, new String[]{","}, 0));
        String A0j = AnonymousClass001.A0j(AnonymousClass000.A0l("CN"), '=');
        for (String str2 : A1b) {
            int length = str2.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                int i2 = length;
                if (!z) {
                    i2 = i;
                }
                boolean A1P = AnonymousClass0x7.A1P(C162457s7.A00(str2.charAt(i2), 32));
                if (z) {
                    if (!A1P) {
                        break;
                    }
                    length--;
                } else if (!A1P) {
                    z = true;
                } else {
                    i++;
                }
            }
            String obj = str2.subSequence(i, length + 1).toString();
            if (AnonymousClass2AB.A05(obj, A0j)) {
                String A0f = C18320x8.A0f(A0j, obj);
                C162457s7.A0D(A0f);
                return A0f;
            }
        }
        return null;
    }
}
