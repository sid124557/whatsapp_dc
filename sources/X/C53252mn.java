package X;

/* renamed from: X.2mn  reason: invalid class name and case insensitive filesystem */
public final class C53252mn {
    public final Integer A00;
    public final Integer A01;
    public final Integer A02;
    public final Integer A03;
    public final String A04;

    public C53252mn(AnonymousClass1D7 r8) {
        Integer num;
        String str;
        Integer num2;
        Integer num3;
        C162457s7.A0J(r8, 1);
        int i = r8.bitField0_;
        Integer num4 = null;
        if (AnonymousClass0x2.A1X(i)) {
            num = Integer.valueOf(r8.sentiment_);
        } else {
            num = null;
        }
        if ((i & 2) != 0) {
            str = r8.behaviorGraph_;
        } else {
            str = null;
        }
        if ((i & 4) != 0) {
            num2 = Integer.valueOf(r8.action_);
        } else {
            num2 = null;
        }
        if ((i & 8) != 0) {
            num3 = Integer.valueOf(r8.intensity_);
        } else {
            num3 = null;
        }
        num4 = (i & 16) != 0 ? Integer.valueOf(r8.wordCount_) : num4;
        this.A02 = num;
        this.A04 = str;
        this.A00 = num2;
        this.A01 = num3;
        this.A03 = num4;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53252mn) {
                C53252mn r5 = (C53252mn) obj;
                if (!C162457s7.A0P(this.A02, r5.A02) || !C162457s7.A0P(this.A04, r5.A04) || !C162457s7.A0P(this.A00, r5.A00) || !C162457s7.A0P(this.A01, r5.A01) || !C162457s7.A0P(this.A03, r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((((AnonymousClass000.A07(this.A02) * 31) + C18270x1.A00(this.A04)) * 31) + AnonymousClass000.A07(this.A00)) * 31) + AnonymousClass000.A07(this.A01)) * 31) + C18310x6.A07(this.A03);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("BotAvatarMetadata(sentiment=");
        A0o.append(this.A02);
        A0o.append(", behaviorGraph=");
        A0o.append(this.A04);
        A0o.append(", action=");
        A0o.append(this.A00);
        A0o.append(", intensity=");
        A0o.append(this.A01);
        A0o.append(", wordCount=");
        return C18260x0.A04(this.A03, A0o);
    }
}
