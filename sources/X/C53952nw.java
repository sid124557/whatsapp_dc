package X;

import java.util.Map;

/* renamed from: X.2nw  reason: invalid class name and case insensitive filesystem */
public final class C53952nw {
    public final int A00;
    public final C368820c A01;
    public final AnonymousClass7O0 A02;
    public final C152677Zw A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final Map A07;
    public final boolean A08;

    public C53952nw(C368820c r2, AnonymousClass7O0 r3, C152677Zw r4, String str, String str2, String str3, Map map, int i, boolean z) {
        C162457s7.A0J(str, 1);
        this.A04 = str;
        this.A00 = i;
        this.A05 = str2;
        this.A08 = z;
        this.A07 = map;
        this.A02 = r3;
        this.A03 = r4;
        this.A01 = r2;
        this.A06 = str3;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53952nw) {
                C53952nw r5 = (C53952nw) obj;
                if (!C162457s7.A0P(this.A04, r5.A04) || this.A00 != r5.A00 || !C162457s7.A0P(this.A05, r5.A05) || this.A08 != r5.A08 || !C162457s7.A0P(this.A07, r5.A07) || !C162457s7.A0P(this.A02, r5.A02) || !C162457s7.A0P(this.A03, r5.A03) || this.A01 != r5.A01 || !C162457s7.A0P(this.A06, r5.A06)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((AnonymousClass000.A08(this.A07, AnonymousClass0x2.A01(AnonymousClass0x2.A07(this.A05, (C18310x6.A09(this.A04) + this.A00) * 31), this.A08)) + AnonymousClass000.A07(this.A02)) * 31) + AnonymousClass000.A07(this.A03)) * 31) + AnonymousClass000.A07(this.A01)) * 31) + AnonymousClass0x7.A07(this.A06);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("FcsStateMachineContextParams(configPrefixedStateName=");
        A0o.append(this.A04);
        A0o.append(", qplInstanceKey=");
        A0o.append(this.A00);
        A0o.append(", fdsManagerId=");
        A0o.append(this.A05);
        A0o.append(", isModalOnScreen=");
        A0o.append(this.A08);
        A0o.append(", initialStateMachineInput=");
        A0o.append(this.A07);
        A0o.append(", presentationConfig=");
        A0o.append(this.A02);
        A0o.append(", phoenixSessionData=");
        A0o.append(this.A03);
        A0o.append(", backNavContext=");
        A0o.append(this.A01);
        A0o.append(", mergerName=");
        return C18260x0.A07(this.A06, A0o);
    }
}
