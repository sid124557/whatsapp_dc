package X;

import java.util.List;
import java.util.Map;
import java.util.Stack;

/* renamed from: X.7Zx  reason: invalid class name and case insensitive filesystem */
public final class C152687Zx {
    public C141576vn A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final List A05;
    public final Map A06;
    public final Map A07;
    public final Stack A08;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C152687Zx) {
                C152687Zx r5 = (C152687Zx) obj;
                if (!C162457s7.A0P(this.A01, r5.A01) || !C162457s7.A0P(this.A03, r5.A03) || !C162457s7.A0P(this.A02, r5.A02) || !C162457s7.A0P(this.A06, r5.A06) || !C162457s7.A0P(this.A07, r5.A07) || !C162457s7.A0P(this.A05, r5.A05) || !C162457s7.A0P(this.A08, r5.A08) || !C162457s7.A0P(this.A04, r5.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ C152687Zx(String str, String str2, String str3, String str4, List list, Map map, Map map2) {
        Stack stack = new Stack();
        C141576vn r1 = C141576vn.BOTTOM_SHEET;
        C162457s7.A0J(str3, 3);
        this.A01 = str;
        this.A03 = str2;
        this.A02 = str3;
        this.A06 = map;
        this.A07 = map2;
        this.A05 = list;
        this.A08 = stack;
        this.A00 = r1;
        this.A04 = str4;
    }

    public int hashCode() {
        int A072 = AnonymousClass0x2.A07(this.A03, C18310x6.A09(this.A01));
        Map map = this.A07;
        return AnonymousClass0x7.A08(this.A04, AnonymousClass000.A08(this.A00, AnonymousClass000.A08(this.A08, (AnonymousClass000.A08(map, (AnonymousClass0x2.A07(this.A02, A072) + AnonymousClass000.A07(this.A06)) * 31) + C18310x6.A07(this.A05)) * 31)));
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("StateMachineData(config=");
        A0o.append(this.A01);
        A0o.append(", sessionContextId=");
        A0o.append(this.A03);
        A0o.append(", fdsManagerId=");
        A0o.append(this.A02);
        A0o.append(", overwriteFirstScreenPresentation=");
        A0o.append(this.A06);
        A0o.append(", stateRegistry=");
        A0o.append(this.A07);
        A0o.append(", nextScreens=");
        A0o.append(this.A05);
        A0o.append(", uiStack=");
        A0o.append(this.A08);
        A0o.append(", modalType=");
        A0o.append(this.A00);
        A0o.append(", startAt=");
        return C18260x0.A07(this.A04, A0o);
    }
}
