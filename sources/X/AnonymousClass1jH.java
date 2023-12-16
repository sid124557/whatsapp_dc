package X;

import java.util.List;
import java.util.Map;

/* renamed from: X.1jH  reason: invalid class name */
public final class AnonymousClass1jH extends C55212pz {
    public AnonymousClass4DK A00;
    public final C56612sH A01;
    public final C66543Lv A02;
    public final AnonymousClass8EA A03;
    public final AnonymousClass9U5 A04;
    public final C44532Wk A05;
    public final C45022Yj A06;
    public final AnonymousClass4FS A07;
    public final AnonymousClass4C1 A08;

    public void A06(C53952nw r25, AnonymousClass4DK r26, C60752z6 r27, Map map) {
        C624134x r18;
        String str;
        C53952nw r7 = r25;
        AnonymousClass4DK r6 = r26;
        Map map2 = map;
        C18260x0.A0Z(map2, r7, r6, 0);
        this.A00 = r6;
        Object obj = map2.get("is_wa_pay");
        if (obj == null || !(obj instanceof Boolean)) {
            StringBuilder A0l = AnonymousClass000.A0l("is_wa_pay");
            A0l.append(" is null or not a ");
            C18260x0.A0N(Boolean.class, A0l);
            A05(r6, "incorrect_input", A0l.toString());
            obj = null;
        }
        Boolean bool = (Boolean) obj;
        if (bool == null) {
            return;
        }
        if (bool.booleanValue()) {
            String str2 = r7.A05;
            AnonymousClass99L r3 = new AnonymousClass99L();
            AnonymousClass4DK r72 = this.A00;
            if (r72 == null) {
                throw C18270x1.A0S("resourceResultCallback");
            }
            Object obj2 = map2.get("sender");
            if (obj2 == null || !(obj2 instanceof Map)) {
                StringBuilder A0m = AnonymousClass000.A0m("sender", " is null or not a ");
                C18260x0.A0N(Map.class, A0m);
                A05(r72, "incorrect_input", A0m.toString());
                obj2 = null;
            }
            Map map3 = (Map) obj2;
            if (map3 != null) {
                AnonymousClass4DK r73 = this.A00;
                if (r73 == null) {
                    throw C18270x1.A0S("resourceResultCallback");
                }
                Object obj3 = map2.get("recipient");
                if (obj3 == null || !(obj3 instanceof Map)) {
                    StringBuilder A0m2 = AnonymousClass000.A0m("recipient", " is null or not a ");
                    C18260x0.A0N(Map.class, A0m2);
                    A05(r73, "incorrect_input", A0m2.toString());
                    obj3 = null;
                }
                Map map4 = (Map) obj3;
                if (map4 != null) {
                    AnonymousClass4DK r9 = this.A00;
                    if (r9 == null) {
                        throw C18270x1.A0S("resourceResultCallback");
                    }
                    Object obj4 = map2.get("device_id");
                    Class<String> cls = String.class;
                    if (obj4 == null || !(obj4 instanceof String)) {
                        A00(r9, this, cls, "device_id");
                        obj4 = null;
                    }
                    String str3 = (String) obj4;
                    if (str3 != null) {
                        r3.A0J = str3;
                        AnonymousClass4DK r92 = this.A00;
                        if (r92 == null) {
                            throw C18270x1.A0S("resourceResultCallback");
                        }
                        Object obj5 = map4.get("mcc");
                        if (obj5 == null || !(obj5 instanceof String)) {
                            A00(r92, this, cls, "mcc");
                            obj5 = null;
                        }
                        String str4 = (String) obj5;
                        if (str4 != null) {
                            r3.A0M = str4;
                            AnonymousClass4DK r93 = this.A00;
                            if (r93 == null) {
                                throw C18270x1.A0S("resourceResultCallback");
                            }
                            Object obj6 = map4.get("purpose_code");
                            if (obj6 == null || !(obj6 instanceof String)) {
                                A00(r93, this, cls, "purpose_code");
                                obj6 = null;
                            }
                            String str5 = (String) obj6;
                            if (str5 != null) {
                                r3.A0N = str5;
                                AnonymousClass4DK r94 = this.A00;
                                if (r94 == null) {
                                    throw C18270x1.A0S("resourceResultCallback");
                                }
                                Object obj7 = map4.get("receiver_vpa");
                                if (obj7 == null || !(obj7 instanceof String)) {
                                    A00(r94, this, cls, "receiver_vpa");
                                    obj7 = null;
                                }
                                String str6 = (String) obj7;
                                if (str6 != null) {
                                    r3.A0O = str6;
                                    AnonymousClass4DK r95 = this.A00;
                                    if (r95 == null) {
                                        throw C18270x1.A0S("resourceResultCallback");
                                    }
                                    Object obj8 = map3.get("sender_vpa");
                                    if (obj8 == null || !(obj8 instanceof String)) {
                                        A00(r95, this, cls, "sender_vpa");
                                        obj8 = null;
                                    }
                                    String str7 = (String) obj8;
                                    if (str7 != null) {
                                        r3.A0Q = str7;
                                        AnonymousClass4DK r96 = this.A00;
                                        if (r96 == null) {
                                            throw C18270x1.A0S("resourceResultCallback");
                                        }
                                        Object obj9 = map3.get("sender_vpa_id");
                                        if (obj9 == null || !(obj9 instanceof String)) {
                                            A00(r96, this, cls, "sender_vpa_id");
                                            obj9 = null;
                                        }
                                        String str8 = (String) obj9;
                                        if (str8 != null) {
                                            r3.A0R = str8;
                                            AnonymousClass4DK r97 = this.A00;
                                            if (r97 == null) {
                                                throw C18270x1.A0S("resourceResultCallback");
                                            }
                                            Object obj10 = map2.get("seq_no");
                                            if (obj10 == null || !(obj10 instanceof String)) {
                                                A00(r97, this, cls, "seq_no");
                                                obj10 = null;
                                            }
                                            String str9 = (String) obj10;
                                            if (str9 != null) {
                                                r3.A0S = str9;
                                                AnonymousClass4DK r98 = this.A00;
                                                if (r98 == null) {
                                                    throw C18270x1.A0S("resourceResultCallback");
                                                }
                                                Object obj11 = map2.get("token");
                                                if (obj11 == null || !(obj11 instanceof String)) {
                                                    A00(r98, this, cls, "token");
                                                    obj11 = null;
                                                }
                                                String str10 = (String) obj11;
                                                if (str10 != null) {
                                                    r3.A0U = str10;
                                                    r3.A05 = this.A01.A0H();
                                                    AnonymousClass4DK r12 = this.A00;
                                                    if (r12 == null) {
                                                        throw C18270x1.A0S("resourceResultCallback");
                                                    }
                                                    Object obj12 = map3.get("is_first_send");
                                                    if (obj12 == null || !(obj12 instanceof Boolean)) {
                                                        StringBuilder A0m3 = AnonymousClass000.A0m("is_first_send", " is null or not a ");
                                                        C18260x0.A0N(Boolean.class, A0m3);
                                                        A05(r12, "incorrect_input", A0m3.toString());
                                                        obj12 = null;
                                                    }
                                                    Boolean bool2 = (Boolean) obj12;
                                                    if (bool2 != null) {
                                                        r3.A0g(bool2);
                                                        AnonymousClass3QD A002 = AnonymousClass3QD.A00();
                                                        AnonymousClass4DK r122 = this.A00;
                                                        if (r122 == null) {
                                                            throw C18270x1.A0S("resourceResultCallback");
                                                        }
                                                        String str11 = "bank_info";
                                                        Object obj13 = map3.get(str11);
                                                        if (obj13 != null && (obj13 instanceof String)) {
                                                            r3.A0C = new C166557yt(A002, cls, obj13, "bankInfo");
                                                            AnonymousClass3QD A003 = AnonymousClass3QD.A00();
                                                            r122 = this.A00;
                                                            if (r122 == null) {
                                                                throw C18270x1.A0S("resourceResultCallback");
                                                            }
                                                            str11 = "mpin";
                                                            Object obj14 = map3.get(str11);
                                                            if (obj14 != null && (obj14 instanceof String)) {
                                                                r3.A0D = new C166557yt(A003, cls, obj14, "pin");
                                                                AnonymousClass4DK r74 = this.A00;
                                                                if (r74 == null) {
                                                                    throw C18270x1.A0S("resourceResultCallback");
                                                                }
                                                                Object obj15 = map2.get("order_id");
                                                                if (obj15 == null || !(obj15 instanceof String)) {
                                                                    A00(r74, this, cls, "order_id");
                                                                    obj15 = null;
                                                                }
                                                                String str12 = (String) obj15;
                                                                if (str12 != null) {
                                                                    r3.A02 = new AnonymousClass39U(0, str12, "");
                                                                    AnonymousClass4DK r123 = this.A00;
                                                                    if (r123 == null) {
                                                                        throw C18270x1.A0S("resourceResultCallback");
                                                                    }
                                                                    Object obj16 = map2.get("total_amount");
                                                                    if (obj16 == null || !(obj16 instanceof Map)) {
                                                                        StringBuilder A0m4 = AnonymousClass000.A0m("total_amount", " is null or not a ");
                                                                        C18260x0.A0N(Map.class, A0m4);
                                                                        A05(r123, "incorrect_input", A0m4.toString());
                                                                        obj16 = null;
                                                                    }
                                                                    Map map5 = (Map) obj16;
                                                                    if (map5 != null) {
                                                                        C60042xu r99 = new C60042xu();
                                                                        AnonymousClass4DK r124 = this.A00;
                                                                        if (r124 == null) {
                                                                            throw C18270x1.A0S("resourceResultCallback");
                                                                        }
                                                                        Object obj17 = map5.get("value");
                                                                        Class<Integer> cls2 = Integer.class;
                                                                        if (obj17 == null || !(obj17 instanceof Integer)) {
                                                                            A00(r124, this, cls2, "value");
                                                                            obj17 = null;
                                                                        }
                                                                        Number number = (Number) obj17;
                                                                        if (number != null) {
                                                                            r99.A01 = (long) number.intValue();
                                                                            AnonymousClass4DK r125 = this.A00;
                                                                            if (r125 == null) {
                                                                                throw C18270x1.A0S("resourceResultCallback");
                                                                            }
                                                                            Object obj18 = map5.get("offset");
                                                                            if (obj18 == null || !(obj18 instanceof Integer)) {
                                                                                A00(r125, this, cls2, "offset");
                                                                                obj18 = null;
                                                                            }
                                                                            Number number2 = (Number) obj18;
                                                                            if (number2 != null) {
                                                                                r99.A00 = number2.intValue();
                                                                                AnonymousClass4DK r126 = this.A00;
                                                                                if (r126 == null) {
                                                                                    throw C18270x1.A0S("resourceResultCallback");
                                                                                }
                                                                                Object obj19 = map2.get("currency_code");
                                                                                if (obj19 == null || !(obj19 instanceof String)) {
                                                                                    obj19 = null;
                                                                                    A00(r126, this, cls, "currency_code");
                                                                                }
                                                                                if (C162457s7.A0P(obj19, "INR")) {
                                                                                    r99.A02 = AnonymousClass1S3.A05;
                                                                                    AnonymousClass39L A012 = r99.A01();
                                                                                    C106405Yw r127 = C95814uZ.A00;
                                                                                    AnonymousClass4DK r11 = this.A00;
                                                                                    if (r11 == null) {
                                                                                        throw C18270x1.A0S("resourceResultCallback");
                                                                                    }
                                                                                    Object obj20 = map4.get("jid");
                                                                                    if (obj20 == null || !(obj20 instanceof String)) {
                                                                                        A00(r11, this, cls, "jid");
                                                                                        obj20 = null;
                                                                                    }
                                                                                    C95814uZ A052 = r127.A05((String) obj20);
                                                                                    if (A052 != null) {
                                                                                        Object obj21 = map2.get("quoted_message_id");
                                                                                        if (!(obj21 instanceof String) || (str = (String) obj21) == null) {
                                                                                            r18 = null;
                                                                                        } else {
                                                                                            r18 = C55832qz.A00(this.A02, AnonymousClass2z0.A05(A052, str, false));
                                                                                        }
                                                                                        C45022Yj r16 = this.A06;
                                                                                        C30481mW A004 = r16.A00(A052, r18, new AnonymousClass3YM(), "", (List) null, 0);
                                                                                        List A0B = this.A03.A0B();
                                                                                        AnonymousClass4DK r910 = this.A00;
                                                                                        if (r910 == null) {
                                                                                            throw C18270x1.A0S("resourceResultCallback");
                                                                                        }
                                                                                        Object obj22 = map3.get("credential_id");
                                                                                        if (obj22 == null || !(obj22 instanceof String)) {
                                                                                            A00(r910, this, cls, "credential_id");
                                                                                            obj22 = null;
                                                                                        }
                                                                                        String str13 = (String) obj22;
                                                                                        if (str13 != null) {
                                                                                            C166587yw A005 = AnonymousClass8EA.A00(str13, A0B);
                                                                                            AnonymousClass4DK r75 = this.A00;
                                                                                            if (r75 == null) {
                                                                                                throw C18270x1.A0S("resourceResultCallback");
                                                                                            }
                                                                                            Object obj23 = map2.get("transaction_type");
                                                                                            if (obj23 == null || !(obj23 instanceof String)) {
                                                                                                A00(r75, this, cls, "transaction_type");
                                                                                                return;
                                                                                            }
                                                                                            boolean equals = obj23.equals("p2m");
                                                                                            AnonymousClass4DK r76 = this.A00;
                                                                                            if (r76 == null) {
                                                                                                throw C18270x1.A0S("resourceResultCallback");
                                                                                            }
                                                                                            Object obj24 = map2.get("transaction_id");
                                                                                            if (obj24 == null || !(obj24 instanceof String)) {
                                                                                                A00(r76, this, cls, "transaction_id");
                                                                                                obj24 = null;
                                                                                            }
                                                                                            String str14 = (String) obj24;
                                                                                            if (str14 != null) {
                                                                                                AnonymousClass0x7.A1B(new AnonymousClass1u2(A005, A012, r3, this, A004, str14, str2, equals), this.A07);
                                                                                                return;
                                                                                            }
                                                                                            return;
                                                                                        }
                                                                                        return;
                                                                                    }
                                                                                    return;
                                                                                }
                                                                                return;
                                                                            }
                                                                            return;
                                                                        }
                                                                        return;
                                                                    }
                                                                    return;
                                                                }
                                                                return;
                                                            }
                                                        }
                                                        A00(r122, this, cls, str11);
                                                        return;
                                                    }
                                                    return;
                                                }
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        AnonymousClass4DK r0 = this.A00;
        if (r0 == null) {
            throw C18270x1.A0S("resourceResultCallback");
        }
        A05(r0, "not_supported", "pay to non-WA user is not supported yet");
    }

    public static void A00(AnonymousClass4DK r3, C55212pz r4, Class cls, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" is null or not a ");
        sb.append(new AnonymousClass8PJ(cls).BD4());
        r4.A05(r3, "incorrect_input", sb.toString());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1jH(C56612sH r2, C66543Lv r3, AnonymousClass8EA r4, AnonymousClass9U5 r5, AnonymousClass1j2 r6, C44532Wk r7, C45022Yj r8, AnonymousClass4FS r9, AnonymousClass4C1 r10) {
        super(r6);
        C18260x0.A0c(r6, r2, r9, r3);
        C18260x0.A0W(r4, r5, r10);
        C162457s7.A0J(r7, 9);
        this.A01 = r2;
        this.A07 = r9;
        this.A02 = r3;
        this.A06 = r8;
        this.A03 = r4;
        this.A04 = r5;
        this.A08 = r10;
        this.A05 = r7;
    }
}
