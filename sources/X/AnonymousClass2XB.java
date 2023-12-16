package X;

/* renamed from: X.2XB  reason: invalid class name */
public final class AnonymousClass2XB {
    public final C41912Mb A00;

    public AnonymousClass2XB(C41912Mb r2) {
        C162457s7.A0J(r2, 1);
        this.A00 = r2;
    }

    public final String A00() {
        String str;
        String A0Z = C18280x3.A0Z(C18310x6.A0F(this.A00.A01), "wfac_ban_state");
        if (A0Z != null) {
            int hashCode = A0Z.hashCode();
            if (hashCode != 191367207) {
                if (hashCode == 272787191) {
                    str = "UNBANNED";
                } else if (hashCode == 1951953694) {
                    str = "BANNED";
                }
                if (!A0Z.equals(str)) {
                    return "UNKNOWN_IN_CLIENT";
                }
                return A0Z;
            } else if (A0Z.equals("CHECKPOINTED")) {
                return A0Z;
            }
        }
        return "UNKNOWN_IN_CLIENT";
    }
}
