package X;

import com.whatsapp.voipcalling.CallInfo;
import java.util.UUID;

/* renamed from: X.2ng  reason: invalid class name and case insensitive filesystem */
public final class C53792ng {
    public boolean A00 = false;
    public boolean A01 = false;
    public boolean A02;
    public final int A03;
    public final int A04;
    public final CallInfo A05;
    public final String A06;
    public final UUID A07;

    public C53792ng(CallInfo callInfo, String str, UUID uuid, int i, int i2, boolean z) {
        this.A07 = uuid;
        this.A06 = str;
        this.A05 = callInfo;
        this.A04 = i;
        this.A03 = i2;
        this.A02 = z;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53792ng) {
                C53792ng r5 = (C53792ng) obj;
                if (!(C162457s7.A0P(this.A07, r5.A07) && C162457s7.A0P(this.A06, r5.A06) && C162457s7.A0P(this.A05, r5.A05) && this.A04 == r5.A04 && this.A03 == r5.A03 && this.A02 == r5.A02 && this.A00 == r5.A00 && this.A01 == r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0x7.A00(AnonymousClass0x2.A01(AnonymousClass0x2.A01((((((((C18300x5.A04(this.A07) + C18270x1.A00(this.A06)) * 31) + C18310x6.A07(this.A05)) * 31) + this.A04) * 31) + this.A03) * 31, this.A02), this.A00), this.A01);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("CurrentSessionInfo(sessionId=");
        A0o.append(this.A07);
        A0o.append(", callRandomId=");
        A0o.append(this.A06);
        A0o.append(", activeCallInfo=");
        A0o.append(this.A05);
        A0o.append(", uiSurface=");
        A0o.append(this.A04);
        A0o.append(", subSurface=");
        A0o.append(this.A03);
        A0o.append(", shouldLogUserJourney=");
        A0o.append(this.A02);
        A0o.append(", hasLoggedFilterEvent=");
        A0o.append(this.A00);
        A0o.append(", hasLoggedSearchTermChangedEvent=");
        return C18260x0.A0A(A0o, this.A01);
    }
}
