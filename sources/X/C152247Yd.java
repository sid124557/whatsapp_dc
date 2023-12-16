package X;

/* renamed from: X.7Yd  reason: invalid class name and case insensitive filesystem */
public final class C152247Yd {
    public final int A00;
    public final int A01;
    public final String A02;

    public C152247Yd(String str, int i, int i2) {
        C162457s7.A0J(str, 1);
        this.A02 = str;
        this.A01 = i;
        this.A00 = i2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C152247Yd) {
                C152247Yd r5 = (C152247Yd) obj;
                if (!(C162457s7.A0P(this.A02, r5.A02) && this.A01 == r5.A01 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((C18310x6.A09(this.A02) + this.A01) * 31) + this.A00;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("AIBotEmbodimentTransitionData(nextState=");
        A0o.append(this.A02);
        A0o.append(", transitionPolicy=");
        A0o.append(this.A01);
        A0o.append(", queueDurationThreshold=");
        return C18260x0.A09(A0o, this.A00);
    }
}
