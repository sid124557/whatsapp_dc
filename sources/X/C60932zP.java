package X;

import java.util.List;

/* renamed from: X.2zP  reason: invalid class name and case insensitive filesystem */
public final class C60932zP {
    public final int A00;
    public final C52322lI A01;
    public final AnonymousClass3ZH A02;
    public final C624134x A03;
    public final List A04;
    public final boolean A05;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C60932zP) {
                C60932zP r5 = (C60932zP) obj;
                if (!C162457s7.A0P(this.A02, r5.A02) || !C162457s7.A0P(this.A03, r5.A03) || !C162457s7.A0P(this.A04, r5.A04) || this.A00 != r5.A00 || this.A05 != r5.A05 || !C162457s7.A0P(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0x2.A01((AnonymousClass000.A08(this.A04, ((AnonymousClass000.A07(this.A02) * 31) + AnonymousClass000.A07(this.A03)) * 31) + this.A00) * 31, this.A05) + C18310x6.A07(this.A01);
    }

    public C60932zP(C52322lI r1, AnonymousClass3ZH r2, C624134x r3, List list, int i, boolean z) {
        this.A02 = r2;
        this.A03 = r3;
        this.A04 = list;
        this.A00 = i;
        this.A05 = z;
        this.A01 = r1;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("UiState(groupContact=");
        A0o.append(this.A02);
        A0o.append(", parentMessage=");
        A0o.append(this.A03);
        A0o.append(", bottomSheetListItems=");
        A0o.append(this.A04);
        A0o.append(", inputState=");
        A0o.append(this.A00);
        A0o.append(", sendVisibility=");
        A0o.append(this.A05);
        A0o.append(", errorState=");
        return C18260x0.A04(this.A01, A0o);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C60932zP() {
        /*
            r7 = this;
            r1 = 0
            java.util.List r4 = java.util.Collections.emptyList()
            X.C162457s7.A0D(r4)
            r5 = 1
            r6 = 0
            r0 = r7
            r2 = r1
            r3 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60932zP.<init>():void");
    }
}
