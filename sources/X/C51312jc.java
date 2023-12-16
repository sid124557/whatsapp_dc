package X;

import com.whatsapp.R;

/* renamed from: X.2jc  reason: invalid class name and case insensitive filesystem */
public final class C51312jc {
    public final String A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51312jc) {
                C51312jc r5 = (C51312jc) obj;
                if (!C162457s7.A0P(this.A01, r5.A01) || !C162457s7.A0P(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0x2.A07(this.A00, C18310x6.A09(this.A01)) + R.string.f11nameremoved;
    }

    public C51312jc(String str, String str2) {
        C18260x0.A0Q(str, str2);
        this.A01 = str;
        this.A00 = str2;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("UpcomingActivitySectionItemViewState(dayOfWeek=");
        A0o.append(this.A01);
        A0o.append(", date=");
        A0o.append(this.A00);
        A0o.append(", dateFormatStringId=");
        return C18260x0.A09(A0o, R.string.f11nameremoved);
    }
}
