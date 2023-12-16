package X;

import com.whatsapp.jid.UserJid;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.9dj  reason: invalid class name and case insensitive filesystem */
public final class C197699dj implements AnonymousClass4DR {
    public final C64773Ex A00;
    public final C194909Va A01;
    public final AnonymousClass9U4 A02;
    public final AnonymousClass9TZ A03;
    public final C194259Se A04;

    public /* bridge */ /* synthetic */ Object Bk2(Enum enumR, Object obj, Map map) {
        Object obj2;
        Object obj3;
        Number number;
        Object obj4;
        long A0B;
        C85204Fi r0;
        Object obj5;
        Object obj6;
        Boolean bool;
        Object obj7;
        String str;
        Object obj8;
        String str2;
        Object obj9;
        String str3;
        Object obj10;
        String obj11;
        AnonymousClass9KG r8 = (AnonymousClass9KG) enumR;
        C162457s7.A0J(r8, 1);
        switch (r8.ordinal()) {
            case 0:
                if (map != null) {
                    obj5 = map.get("scenario");
                } else {
                    obj5 = null;
                }
                if (!(obj5 instanceof String)) {
                    obj5 = null;
                }
                if (map != null) {
                    obj6 = map.get("is_debit");
                } else {
                    obj6 = null;
                }
                if (obj6 instanceof Boolean) {
                    bool = (Boolean) obj6;
                } else {
                    bool = null;
                }
                if (obj5 == null || bool == null) {
                    return null;
                }
                boolean equals = "P2P".equals(obj5);
                if (equals && bool.booleanValue()) {
                    return AnonymousClass9U4.A03(this.A02).A06();
                }
                if (!equals || bool.booleanValue()) {
                    boolean equals2 = "P2M".equals(obj5);
                    if (equals2 && bool.booleanValue()) {
                        Iterator it = AnonymousClass9U4.A08(this.A02).iterator();
                        while (it.hasNext()) {
                            C166587yw A0C = C1899693i.A0C(it);
                            if (A0C.A03 == 2) {
                                return A0C;
                            }
                        }
                        return null;
                    } else if (!equals2 || bool.booleanValue()) {
                        return null;
                    } else {
                        AnonymousClass8EA A032 = AnonymousClass9U4.A03(this.A02);
                        synchronized (A032) {
                            Iterator it2 = A032.A0B().iterator();
                            while (it2.hasNext()) {
                                C166587yw A0C2 = C1899693i.A0C(it2);
                                if (A0C2.A02 == 2) {
                                    return A0C2;
                                }
                            }
                            return null;
                        }
                    }
                } else {
                    Iterator it3 = AnonymousClass9U4.A08(this.A02).iterator();
                    while (it3.hasNext()) {
                        C166587yw A0C3 = C1899693i.A0C(it3);
                        if (A0C3.A00 == 2) {
                            return A0C3;
                        }
                    }
                    return null;
                }
            case 1:
                if (map != null) {
                    obj7 = map.get("credential_id");
                } else {
                    obj7 = null;
                }
                if (!(obj7 instanceof String) || (str = (String) obj7) == null) {
                    return null;
                }
                return AnonymousClass8EA.A00(str, AnonymousClass9U4.A08(this.A02));
            case 2:
                return AnonymousClass9U4.A08(this.A02);
            case 3:
                AnonymousClass32Y r2 = UserJid.Companion;
                if (map != null) {
                    obj8 = map.get("jid");
                } else {
                    obj8 = null;
                }
                if (obj8 instanceof String) {
                    str2 = (String) obj8;
                } else {
                    str2 = null;
                }
                UserJid A0E = r2.A0E(str2);
                if (A0E != null) {
                    return this.A00.A0A(A0E);
                }
                return null;
            case 4:
                if (map != null) {
                    obj9 = map.get("message_id");
                } else {
                    obj9 = null;
                }
                if (!(obj9 instanceof String) || (str3 = (String) obj9) == null) {
                    return null;
                }
                return this.A01.A00(str3);
            case 5:
                return new C194689Uc(this.A04.A01());
            case 6:
                if (map != null) {
                    obj10 = map.get("code");
                } else {
                    obj10 = null;
                }
                if (!(obj10 instanceof Integer) || obj10 == null || (obj11 = obj10.toString()) == null) {
                    return null;
                }
                AnonymousClass9TZ r1 = this.A03;
                if (r1.A03()) {
                    return r1.A00.get(obj11);
                }
                return null;
            case 7:
                if (map != null) {
                    obj2 = map.get("currency_code");
                } else {
                    obj2 = null;
                }
                if (!(obj2 instanceof String)) {
                    obj2 = null;
                }
                if (map != null) {
                    obj3 = map.get("offset");
                } else {
                    obj3 = null;
                }
                if (!(obj3 instanceof Integer) || (number = (Number) obj3) == null) {
                    return null;
                }
                int intValue = number.intValue();
                if (map != null) {
                    obj4 = map.get("value");
                } else {
                    obj4 = null;
                }
                if (obj4 instanceof Integer) {
                    A0B = (long) AnonymousClass001.A0K(obj4);
                } else if (!(obj4 instanceof Long)) {
                    return null;
                } else {
                    A0B = C18310x6.A0B(obj4);
                }
                C60042xu r12 = new C60042xu();
                r12.A01 = A0B;
                r12.A00 = intValue;
                if (C162457s7.A0P(obj2, "INR")) {
                    r0 = AnonymousClass1S3.A05;
                } else if (!C162457s7.A0P(obj2, "BRL")) {
                    return null;
                } else {
                    r0 = AnonymousClass1S3.A04;
                }
                r12.A02 = r0;
                return r12.A01();
            case 8:
                C194979Vj A0C4 = this.A02.A0C("p2p_context");
                C162457s7.A0D(A0C4);
                return A0C4;
            default:
                throw new C73153f1();
        }
    }

    public C197699dj(C64773Ex r1, C194909Va r2, AnonymousClass9U4 r3, AnonymousClass9TZ r4, C194259Se r5) {
        this.A00 = r1;
        this.A04 = r5;
        this.A02 = r3;
        this.A01 = r2;
        this.A03 = r4;
    }

    public Class B3E() {
        return AnonymousClass9KG.class;
    }
}
