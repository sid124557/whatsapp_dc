package X;

/* renamed from: X.2mP  reason: invalid class name and case insensitive filesystem */
public final class C53012mP {
    public final int A00;
    public final C61202zs A01;
    public final String A02;
    public final String A03;

    public boolean equals(Object obj) {
        Class<?> cls;
        int i;
        int i2;
        if (this != obj) {
            Class<C53012mP> cls2 = C53012mP.class;
            if (obj != null) {
                cls = obj.getClass();
            } else {
                cls = null;
            }
            if (cls2.equals(cls)) {
                C162457s7.A0K(obj, "null cannot be cast to non-null type com.whatsapp.privacy.usernotice.badge.UserNoticeBadged");
                C53012mP r12 = (C53012mP) obj;
                String str = this.A03;
                String str2 = r12.A03;
                if (C162457s7.A0P(str, str2)) {
                    String str3 = this.A02;
                    String str4 = r12.A02;
                    if (C162457s7.A0P(str3, str4) && (i = this.A00) == (i2 = r12.A00)) {
                        C61202zs r2 = this.A01;
                        C61202zs r1 = r12.A01;
                        if (!C162457s7.A0P(r2, r1) || !C162457s7.A0P(str, str2) || !C162457s7.A0P(str3, str4) || i != i2 || !r2.equals(r1)) {
                            return false;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A01, AnonymousClass0x2.A07(this.A02, C18310x6.A09(this.A03)));
    }

    public C53012mP(C61202zs r1, String str, String str2, int i) {
        C18260x0.A0Q(str, str2);
        this.A03 = str;
        this.A02 = str2;
        this.A00 = i;
        this.A01 = r1;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("UserNoticeBadge(text='");
        A0o.append(this.A03);
        A0o.append("', action='");
        A0o.append(this.A02);
        A0o.append("', badgeExpirationInHours=");
        A0o.append(this.A00);
        A0o.append(", timing=");
        return C18260x0.A04(this.A01, A0o);
    }
}
