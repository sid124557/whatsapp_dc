package X;

/* renamed from: X.4wJ  reason: invalid class name and case insensitive filesystem */
public final class C96404wJ extends C136186lz {
    public final Integer A00;
    public final String A01;
    public final String A02;
    public final AnonymousClass4GQ A03;
    public final AnonymousClass4GR A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C96404wJ(Integer num, String str, String str2, AnonymousClass4GQ r5, AnonymousClass4GR r6) {
        super(60);
        C162457s7.A0J(str2, 2);
        this.A01 = str;
        this.A02 = str2;
        this.A00 = num;
        this.A03 = r5;
        this.A04 = r6;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C96404wJ) {
                C96404wJ r5 = (C96404wJ) obj;
                if (!C162457s7.A0P(this.A01, r5.A01) || !C162457s7.A0P(this.A02, r5.A02) || !C162457s7.A0P(this.A00, r5.A00) || !C162457s7.A0P(this.A03, r5.A03) || !C162457s7.A0P(this.A04, r5.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int A09 = C18310x6.A09(this.A01);
        return AnonymousClass002.A02(this.A04, AnonymousClass000.A08(this.A03, (AnonymousClass0x2.A07(this.A02, A09) + AnonymousClass000.A07(this.A00)) * 31));
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("BusinessApiCategoryListItemData(displayName=");
        A0o.append(this.A01);
        A0o.append(", imageUrl=");
        A0o.append(this.A02);
        A0o.append(", bizNumber=");
        A0o.append(this.A00);
        A0o.append(", onClick=");
        A0o.append(this.A03);
        A0o.append(", loadImage=");
        return C18260x0.A04(this.A04, A0o);
    }
}
