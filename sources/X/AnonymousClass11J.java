package X;

import com.whatsapp.location.PlaceInfo;
import java.util.Set;

/* renamed from: X.11J  reason: invalid class name */
public final class AnonymousClass11J extends C05550Ty implements AnonymousClass4CZ {
    public final long A00;
    public final C621033m A01;
    public final AnonymousClass2NC A02;
    public final C29441ip A03;
    public final C56612sH A04;
    public final C54922pV A05;
    public final C95814uZ A06;
    public final C73853gB A07;
    public final C85504Gn A08;
    public final AnonymousClass4C8 A09;
    public final C85524Gp A0A;
    public final C85524Gp A0B;
    public final C85564Gt A0C;
    public final C85564Gt A0D;

    public AnonymousClass11J(C621033m r5, AnonymousClass2NC r6, C29441ip r7, C56612sH r8, C54922pV r9, C95814uZ r10, C73853gB r11, long j) {
        C18260x0.A0Z(r8, r5, r9, 1);
        C18260x0.A0T(r7, r11);
        this.A04 = r8;
        this.A01 = r5;
        this.A05 = r9;
        this.A02 = r6;
        this.A03 = r7;
        this.A07 = r11;
        this.A06 = r10;
        this.A00 = j;
        C832246p r0 = new C832246p(new C60562yl(AnonymousClass20W.MAIN, (PlaceInfo) null));
        this.A0B = r0;
        this.A0D = r0;
        C832246p r02 = new C832246p(new C60552yk(AnonymousClass21P.NONE, (String) null));
        this.A0A = r02;
        this.A0C = r02;
        C175748Zo r03 = new C175748Zo(C369720l.DROP_OLDEST, 1);
        this.A08 = r03;
        this.A09 = C154567dN.A01(r03);
        r6.A02.add(this);
    }

    public void BV8(String str, boolean z) {
        C162457s7.A0J(str, 0);
        C85524Gp r4 = this.A0A;
        do {
        } while (!r4.AzD(r4.getValue(), new C60552yk(AnonymousClass21P.SUCCESS, C107305b5.A05(str, true))));
    }

    public void A0C() {
        AnonymousClass2NC r1 = this.A02;
        Set set = r1.A02;
        set.remove(this);
        if (set.size() == 0) {
            r1.A00.A07(r1);
        }
    }

    public void BO2() {
        Object value;
        C85524Gp r3 = this.A0A;
        do {
            value = r3.getValue();
        } while (!C60552yk.A00(AnonymousClass21P.ERROR, (C60552yk) value, value, r3));
    }
}
