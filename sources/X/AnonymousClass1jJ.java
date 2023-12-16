package X;

import java.util.Map;

/* renamed from: X.1jJ  reason: invalid class name */
public abstract class AnonymousClass1jJ extends C55212pz implements C185488tl, AnonymousClass4GA {
    public C160397nZ A00;
    public final AnonymousClass2E1 A01;

    public void AxJ(String str) {
        C162457s7.A0J(str, 0);
        this.A00 = new C160397nZ(this, (C60482yd) this.A01.A00.A01.AZ5.get(), str);
    }

    public final C160397nZ A07() {
        C160397nZ r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("screenOpener");
    }

    public void A08(C53952nw r5, AnonymousClass4DK r6, C60752z6 r7, String str, Map map) {
        if (this instanceof AnonymousClass1jY) {
            C54522or A02 = ((AnonymousClass1jY) this).A04.A02(str);
            String str2 = r5.A04;
            C626936e.A06(str2);
            A02.A01(new C197909e4(str2));
        } else if (this instanceof C29521ix) {
            C29521ix r3 = (C29521ix) this;
            String str3 = r5.A05;
            r3.A00 = str3;
            String str4 = r5.A04;
            AnonymousClass3Z6 A022 = AnonymousClass3Z6.A02(str3, str4);
            r3.A02.A00 = A022;
            r3.A01.A01(r5, r6, map, A022);
            A01(r5, r3, r3.A03, str, str4);
            r3.A09(r7, str4, map);
        } else {
            C29531iy r32 = (C29531iy) this;
            String str5 = r5.A05;
            r32.A00 = str5;
            String str6 = r5.A04;
            AnonymousClass3Z6 A023 = AnonymousClass3Z6.A02(str5, str6);
            r32.A02.A00 = A023;
            r32.A01.A01(r5, r6, map, A023);
            A01(r5, r32, r32.A03, str, str6);
            r32.A09(r7, str6, map);
        }
    }

    public AnonymousClass1jJ(AnonymousClass2E1 r1, AnonymousClass1j2 r2) {
        super(r2);
        this.A01 = r1;
    }

    public static void A01(C53952nw r2, AnonymousClass1jJ r3, C60482yd r4, String str, String str2) {
        C54522or A02 = r4.A02(str);
        C626936e.A06(str2);
        A02.A01(new C197909e4(str2));
        boolean z = r2.A08;
        AnonymousClass7O0 r1 = r2.A02;
        C626936e.A06(r1);
        C162457s7.A0D(r1);
        if (z) {
            r3.A07().A00(r1);
        }
    }
}
