package X;

import com.whatsapp.util.Log;
import java.util.Map;

/* renamed from: X.9GC  reason: invalid class name */
public final class AnonymousClass9GC extends C50702id {
    public final C153087ae A00;
    public final C197669dg A01;
    public final C197689di A02;
    public final C197609da A03 = new C197609da();
    public final C197659df A04;
    public final C197619db A05;
    public final C197679dh A06;
    public final C197629dc A07;
    public final C197699dj A08;
    public final Map A09;
    public final Map A0A;
    public final Map A0B;

    public Object A01(C58672vd r4, Object obj, Map map) {
        C58672vd[] r0;
        AnonymousClass4DR r02;
        StringBuilder A0o;
        String str;
        String str2;
        String str3;
        if (r4 == null || (r0 = r4.A02) == null || r0.length == 0) {
            return obj;
        }
        if (obj instanceof C166587yw) {
            r02 = this.A06;
        } else if (obj instanceof AnonymousClass39L) {
            r02 = this.A07;
        } else if (obj instanceof C194979Vj) {
            r02 = this.A04;
        } else if (obj instanceof C133796hx) {
            Map map2 = this.A0B;
            C161357pU A022 = this.A00.A02();
            if (A022 != null) {
                str3 = A022.A03;
            } else {
                str3 = null;
            }
            r02 = (AnonymousClass4DR) map2.get(str3);
            if (r02 == null) {
                Log.e("PaymentClientDaslQueryResolverRegistry/resolveObject PaymentMethodCountryData country not supported");
                return null;
            }
        } else if (obj instanceof AnonymousClass3ZH) {
            r02 = this.A01;
        } else if (obj instanceof C30791n7) {
            r02 = this.A03;
        } else if (obj instanceof C133676hl) {
            Map map3 = this.A09;
            C161357pU A023 = this.A00.A02();
            if (A023 != null) {
                str2 = A023.A03;
            } else {
                str2 = null;
            }
            r02 = (AnonymousClass4DR) map3.get(str2);
            if (r02 == null) {
                Log.e("PaymentClientDaslQueryResolverRegistry/resolveObject PaymentContactInfoCountryData country not supported");
                return null;
            }
        } else if (obj instanceof C194689Uc) {
            Class<AnonymousClass9GC> cls = AnonymousClass9GC.class;
            if (obj instanceof C191019As) {
                r02 = (AnonymousClass4DR) this.A0A.get("IN");
                if (r02 == null) {
                    A0o = AnonymousClass001.A0o();
                    A0o.append(cls.getSimpleName());
                    str = "/resolveObject Country Specific Device resolver does not exists";
                }
            } else if (obj instanceof C191029At) {
                r02 = (AnonymousClass4DR) this.A0A.get("BR");
                if (r02 == null) {
                    A0o = AnonymousClass001.A0o();
                    A0o.append(cls.getSimpleName());
                    str = "/resolveObject Brazil Specific Device resolver does not exists";
                }
            } else {
                r02 = this.A02;
            }
            C18260x0.A1K(A0o, str);
            return C59022wD.A00;
        } else if (obj instanceof C193529Oz) {
            r02 = this.A05;
        } else {
            Log.e("PaymentClientDaslQueryResolverRegistry/resolveObject Object type not supported");
            return null;
        }
        return A02(r4, r02, obj, map);
    }

    public /* bridge */ /* synthetic */ AnonymousClass4DR A00() {
        return this.A08;
    }

    public AnonymousClass9GC(C64773Ex r25, AnonymousClass5ZU r26, C613330g r27, C54292oU r28, AnonymousClass5ZR r29, C620733j r30, C194909Va r31, AnonymousClass1VX r32, AnonymousClass4FV r33, C620933l r34, C153087ae r35, AnonymousClass9U4 r36, AnonymousClass9TZ r37, C158777kX r38, C194259Se r39, AnonymousClass3UD r40, Map map, Map map2, Map map3) {
        C54292oU r6 = r28;
        C64773Ex r10 = r25;
        AnonymousClass1VX r22 = r32;
        AnonymousClass4FV r21 = r33;
        AnonymousClass5ZU r7 = r26;
        C18260x0.A0f(r22, r6, r21, r10, r7);
        C194259Se r2 = r39;
        AnonymousClass9U4 r4 = r36;
        C620733j r9 = r30;
        C194909Va r12 = r31;
        C620933l r5 = r34;
        C18260x0.A0g(r9, r2, r4, r5, r12);
        AnonymousClass5ZR r23 = r29;
        C162457s7.A0J(r23, 11);
        C158777kX r3 = r38;
        C162457s7.A0J(r3, 12);
        AnonymousClass9TZ r8 = r37;
        C162457s7.A0J(r8, 13);
        AnonymousClass3UD r20 = r40;
        C162457s7.A0J(r20, 14);
        C153087ae r13 = r35;
        C162457s7.A0J(r13, 15);
        C613330g r11 = r27;
        C162457s7.A0J(r11, 16);
        Map map4 = map;
        C162457s7.A0J(map4, 17);
        Map map5 = map2;
        C162457s7.A0J(map5, 18);
        Map map6 = map3;
        C162457s7.A0J(map6, 19);
        this.A00 = r13;
        this.A0B = map4;
        this.A09 = map5;
        this.A0A = map6;
        this.A08 = new C197699dj(r10, r12, r4, r8, r2);
        this.A06 = new C197679dh(r6, r5, r13, r3);
        this.A07 = new C197629dc(r9);
        this.A01 = new C197669dg(r7, r11, r6, r4);
        AnonymousClass5ZR r72 = r23;
        this.A02 = new C197689di(r72, r22, r21, r4, r20);
        this.A05 = new C197619db();
        this.A04 = new C197659df(r5, r4);
    }
}
