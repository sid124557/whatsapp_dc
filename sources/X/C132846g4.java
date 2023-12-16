package X;

import com.whatsapp.R;

/* renamed from: X.6g4  reason: invalid class name and case insensitive filesystem */
public final class C132846g4 extends C149727Nq {
    public final int A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C132846g4) {
                C132846g4 r5 = (C132846g4) obj;
                if (this.A00 != r5.A00 || !C162457s7.A0P(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public C132846g4(int i, String str) {
        super(new C137926pU(str), R.color.f5nameremoved, i, false);
        this.A00 = i;
        this.A01 = str;
    }

    public int hashCode() {
        return (this.A00 * 31) + C18270x1.A00(this.A01);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("GroupName(numConnected=");
        A0o.append(this.A00);
        A0o.append(", groupName=");
        return C18260x0.A07(this.A01, A0o);
    }
}
