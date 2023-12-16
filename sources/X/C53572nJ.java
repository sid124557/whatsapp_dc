package X;

import java.util.Map;

/* renamed from: X.2nJ  reason: invalid class name and case insensitive filesystem */
public final class C53572nJ {
    public final int A00;
    public final C129586aY A01;
    public final C129586aY A02;
    public final C53862nn A03;
    public final String A04;
    public final Map A05;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53572nJ) {
                C53572nJ r5 = (C53572nJ) obj;
                if (!C162457s7.A0P(this.A04, r5.A04) || !C162457s7.A0P(this.A02, r5.A02) || !C162457s7.A0P(this.A01, r5.A01) || !C162457s7.A0P(this.A05, r5.A05) || !C162457s7.A0P(this.A03, r5.A03) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A08(this.A03, AnonymousClass000.A08(this.A05, AnonymousClass000.A08(this.A01, AnonymousClass000.A08(this.A02, C18310x6.A09(this.A04))))) + this.A00;
    }

    public C53572nJ(C129586aY r1, C129586aY r2, C53862nn r3, String str, Map map, int i) {
        this.A04 = str;
        this.A02 = r1;
        this.A01 = r2;
        this.A05 = map;
        this.A03 = r3;
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("CrosspostSessionData(sessionId=");
        A0o.append(this.A04);
        A0o.append(", messageToCrosspost=");
        A0o.append(this.A02);
        A0o.append(", destinationList=");
        A0o.append(this.A01);
        A0o.append(", multiDestinationCrosspostingInfoMap=");
        A0o.append(this.A05);
        A0o.append(", purposeEncryptionParams=");
        A0o.append(this.A03);
        A0o.append(", crosspostingEntryPoint=");
        return C18260x0.A09(A0o, this.A00);
    }
}
