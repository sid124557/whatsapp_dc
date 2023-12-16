package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.7bf  reason: invalid class name and case insensitive filesystem */
public abstract class C153617bf {
    public int A00 = -1;
    public C153617bf A01;
    public C153617bf A02;
    public Boolean A03 = null;
    public Boolean A04 = null;

    public void A04(C158627kI r5, Object obj, String str, int i) {
        C172478Lh r2;
        String A022 = C160947oi.A02(str, "[", String.valueOf(i), "]");
        if (r5.A08) {
            r2 = new C131366dT(obj, i);
        } else {
            r2 = C172478Lh.A01;
        }
        if (i < 0) {
            i += r5.A01.A00.BJg(obj);
        }
        try {
            Object obj2 = ((List) obj).get(i);
            if (this.A01 == null) {
                r5.A02(r2, obj2, A022);
            } else {
                A01().A03(r2, r5, obj2, A022);
            }
        } catch (IndexOutOfBoundsException unused) {
        }
    }

    public C153617bf A01() {
        C153617bf r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        throw AnonymousClass001.A0e("Current path token is a leaf");
    }

    public String A02() {
        if (this instanceof C131586dp) {
            return "[*]";
        }
        if (this instanceof C131636du) {
            return "..";
        }
        if (this instanceof C131616ds) {
            return ((C131616ds) this).A02;
        }
        if (this instanceof C131596dq) {
            C131596dq r0 = (C131596dq) this;
            return AnonymousClass000.A0W(C160947oi.A00(r0.A01, ",", r0.A00), AnonymousClass001.A0p());
        } else if (this instanceof C131626dt) {
            C131626dt r3 = (C131626dt) this;
            StringBuilder A0p = AnonymousClass001.A0p();
            for (int i = 0; i < r3.A00.size(); i++) {
                if (i != 0) {
                    C18320x8.A1K(A0p);
                }
                A0p.append("?");
            }
            return AnonymousClass000.A0f(A0p);
        } else if (this instanceof C131606dr) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append(".");
            return AnonymousClass000.A0X(((C131606dr) this).A02, A0o);
        } else if (this instanceof C131566dn) {
            return ((C131566dn) this).A00.toString();
        } else {
            return ((C131556dm) this).A00.toString();
        }
    }

    public void A03(C172478Lh r21, C158627kI r22, Object obj, String str) {
        C181498mr r2;
        String A0O;
        C181508ms r11;
        C172478Lh r8 = r21;
        C158627kI r9 = r22;
        Object obj2 = obj;
        String str2 = str;
        if (this instanceof C131586dp) {
            AnonymousClass7TV r6 = r9.A01;
            C187038wL r5 = r6.A00;
            if (obj2 instanceof Map) {
                for (Object singletonList : r5.BBl(obj2)) {
                    A05(r9, obj2, str2, Collections.singletonList(singletonList));
                }
            } else if (obj2 instanceof List) {
                for (int i = 0; i < r5.BJg(obj2); i++) {
                    try {
                        A04(r9, obj2, str2, i);
                    } catch (C131276dK e) {
                        if (r6.A03.contains(C141926wM.REQUIRE_PROPERTIES)) {
                            throw e;
                        }
                    }
                }
            }
        } else if (this instanceof C131636du) {
            C153617bf A012 = A01();
            if (A012 instanceof C131596dq) {
                r11 = new C170578Ds(r9, A012);
            } else if (A012 instanceof C131576do) {
                r11 = new C170558Dq(r9);
            } else if (A012 instanceof C131586dp) {
                r11 = new C170548Dp();
            } else if (A012 instanceof C131626dt) {
                r11 = new C170568Dr(r9, A012);
            } else {
                r11 = C131636du.A00;
            }
            C131636du.A00(r8, r9, A012, r11, obj2, str2);
        } else if (this instanceof C131616ds) {
            C131616ds r3 = (C131616ds) this;
            if (r3.A01 == null) {
                if (!r9.A08) {
                    r8 = C172478Lh.A01;
                }
                r9.A02(r8, obj2, r3.A02);
                return;
            }
            r3.A01().A03(r8, r9, obj2, r3.A02);
        } else if (this instanceof C131596dq) {
            C131596dq r32 = (C131596dq) this;
            AnonymousClass7TV r1 = r9.A01;
            C187038wL r52 = r1.A00;
            if (obj2 instanceof Map) {
                List<Object> list = r32.A01;
                if (list.size() == 1 || (r32.A01 == null && list.size() > 1)) {
                    r32.A05(r9, obj2, str2, list);
                    return;
                }
                ArrayList A0I = AnonymousClass002.A0I(1);
                A0I.add((Object) null);
                for (Object obj3 : list) {
                    A0I.set(0, obj3);
                    r32.A05(r9, obj2, str2, A0I);
                }
            } else if (r32.A08() && !r1.A03.contains(C141926wM.SUPPRESS_EXCEPTIONS)) {
                if (obj == null) {
                    A0O = "null";
                } else {
                    A0O = AnonymousClass000.A0O(obj2);
                }
                Object[] objArr = new Object[4];
                objArr[0] = r32.A02();
                C18300x5.A1K(str2, A0O, objArr);
                objArr[3] = AnonymousClass000.A0O(r52);
                throw new C131276dK(String.format("Expected to find an object with property %s in path %s but found '%s'. This is not a json object according to the JsonProvider: '%s'.", objArr));
            }
        } else if (this instanceof C131626dt) {
            C131626dt r33 = (C131626dt) this;
            AnonymousClass7TV r53 = r9.A01;
            C187038wL r12 = r53.A00;
            if (!(obj2 instanceof Map)) {
                int i2 = 0;
                if (obj2 instanceof List) {
                    for (Object A09 : r12.Bqo(obj2)) {
                        if (r33.A09(r53, r9, A09, r9.A04)) {
                            r33.A04(r9, obj2, str2, i2);
                        }
                        i2++;
                    }
                } else if (r33.A08()) {
                    Object[] A0M = AnonymousClass002.A0M();
                    C18280x3.A19(r33.toString(), obj2, A0M);
                    throw C131316dO.A00(String.format("Filter: %s can not be applied to primitives. Current context is: %s", A0M));
                }
            } else if (r33.A09(r53, r9, obj2, r9.A04)) {
                if (!r9.A08) {
                    r8 = C172478Lh.A01;
                }
                if (r33.A01 == null) {
                    r9.A02(r8, obj2, str2);
                } else {
                    r33.A01().A03(r8, r9, obj2, str2);
                }
            }
        } else if (this instanceof C131606dr) {
            C131606dr r34 = (C131606dr) this;
            String str3 = r34.A01;
            Class cls = (Class) AnonymousClass77Q.A00.get(str3);
            if (cls != null) {
                try {
                    C181488mq r14 = (C181488mq) cls.newInstance();
                    List<C161297pO> list2 = r34.A00;
                    if (list2 != null) {
                        for (C161297pO r13 : list2) {
                            int ordinal = r13.A00.ordinal();
                            if (ordinal == 1) {
                                r2 = new C170528Dn(r9.A01, r13.A02, r9.A04);
                                if (r13.A03.booleanValue() && r2.equals(r13.A01)) {
                                }
                            } else if (ordinal == 0 && !r13.A03.booleanValue()) {
                                r2 = new C170518Dm(r13, r9.A01.A00);
                            }
                            r13.A01 = r2;
                            r13.A03 = Boolean.TRUE;
                        }
                    }
                    Object BGp = r14.BGp(r8, r9, obj2, str2, r34.A00);
                    r9.A02(r8, BGp, AnonymousClass000.A0V(".", str3, AnonymousClass000.A0l(str2)));
                    if (r34.A01 != null) {
                        r34.A01().A03(r8, r9, BGp, str2);
                    }
                } catch (Exception e2) {
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("Function of name: ");
                    A0o.append(str3);
                    throw new C131316dO(AnonymousClass000.A0X(" cannot be created", A0o), e2);
                }
            } else {
                StringBuilder A0o2 = AnonymousClass001.A0o();
                A0o2.append("Function with name: ");
                A0o2.append(str3);
                throw C131316dO.A00(AnonymousClass000.A0X(" does not exist.", A0o2));
            }
        } else if (this instanceof C131566dn) {
            C131566dn r35 = (C131566dn) this;
            if (r35.A09(r9, obj2, str2)) {
                C150927St r4 = r35.A00;
                int ordinal2 = r4.A00.ordinal();
                if (ordinal2 != 0) {
                    C187038wL r0 = r9.A01.A00;
                    if (ordinal2 != 2) {
                        int BJg = r0.BJg(obj2);
                        if (BJg != 0) {
                            int intValue = r4.A02.intValue();
                            if (intValue < 0) {
                                intValue += BJg;
                            }
                            int min = Math.min(BJg, intValue);
                            r35.toString();
                            for (int i3 = 0; i3 < min; i3++) {
                                r35.A04(r9, obj2, str2, i3);
                            }
                            return;
                        }
                        return;
                    }
                    int BJg2 = r0.BJg(obj2);
                    int intValue2 = r4.A01.intValue();
                    int min2 = Math.min(BJg2, r4.A02.intValue());
                    if (intValue2 < min2 && BJg2 != 0) {
                        r35.toString();
                        while (intValue2 < min2) {
                            r35.A04(r9, obj2, str2, intValue2);
                            intValue2++;
                        }
                        return;
                    }
                    return;
                }
                int BJg3 = r9.A01.A00.BJg(obj2);
                int intValue3 = r4.A01.intValue();
                if (intValue3 < 0) {
                    intValue3 += BJg3;
                }
                int max = Math.max(0, intValue3);
                r35.toString();
                if (BJg3 != 0 && max < BJg3) {
                    while (max < BJg3) {
                        r35.A04(r9, obj2, str2, max);
                        max++;
                    }
                }
            }
        } else {
            C131556dm r36 = (C131556dm) this;
            if (r36.A09(r9, obj2, str2)) {
                List list3 = r36.A00.A00;
                if (list3.size() == 1) {
                    r36.A04(r9, obj2, str2, AnonymousClass000.A09(list3, 0));
                    return;
                }
                Iterator it = list3.iterator();
                while (it.hasNext()) {
                    r36.A04(r9, obj2, str2, C18280x3.A05(it));
                }
            }
        }
    }

    public boolean A06() {
        C153617bf r0;
        Boolean bool = this.A03;
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean A07 = A07();
        if (A07 && (r0 = this.A01) != null) {
            A07 = r0.A06();
        }
        this.A03 = Boolean.valueOf(A07);
        return A07;
    }

    public boolean A07() {
        if ((this instanceof C131586dp) || (this instanceof C131636du)) {
            return false;
        }
        if (this instanceof C131616ds) {
            return true;
        }
        if (this instanceof C131596dq) {
            C131596dq r3 = (C131596dq) this;
            List list = r3.A01;
            if (list.size() == 1) {
                return true;
            }
            if (r3.A01 != null || list.size() <= 1) {
                return false;
            }
            return true;
        } else if (this instanceof C131626dt) {
            return false;
        } else {
            if (this instanceof C131606dr) {
                return true;
            }
            if (!(this instanceof C131566dn)) {
                return AnonymousClass001.A1T(((C131556dm) this).A00.A00.size());
            }
            return false;
        }
    }

    public boolean A08() {
        boolean z;
        Boolean bool = this.A04;
        if (bool == null) {
            C153617bf r0 = this.A02;
            if (r0 == null || (r0.A07() && this.A02.A08())) {
                z = true;
            } else {
                z = false;
            }
            bool = Boolean.valueOf(z);
            this.A04 = bool;
        }
        return bool.booleanValue();
    }

    public String toString() {
        if (this.A01 == null) {
            return A02();
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(A02());
        AnonymousClass000.A1B(A01(), A0o);
        return A0o.toString();
    }

    public void A05(C158627kI r11, Object obj, String str, List list) {
        C172478Lh r0;
        Object obj2;
        Object obj3;
        C172478Lh r3;
        Object obj4 = null;
        if (list.size() == 1) {
            String A0n = AnonymousClass001.A0n(list, 0);
            CharSequence[] charSequenceArr = new CharSequence[4];
            charSequenceArr[0] = str;
            C18300x5.A1K("['", A0n, charSequenceArr);
            charSequenceArr[3] = "']";
            String A022 = C160947oi.A02(charSequenceArr);
            Map map = (Map) obj;
            if (!map.containsKey(A0n)) {
                obj3 = C187038wL.A00;
            } else {
                obj3 = map.get(A0n);
            }
            if (obj3 != C187038wL.A00) {
                obj4 = obj3;
            } else if (this.A01 == null) {
                Set set = r11.A01.A03;
                if (!set.contains(C141926wM.DEFAULT_PATH_LEAF_TO_NULL)) {
                    if (!set.contains(C141926wM.SUPPRESS_EXCEPTIONS) && set.contains(C141926wM.REQUIRE_PROPERTIES)) {
                        throw new C131276dK(AnonymousClass000.A0V("No results for path: ", A022, AnonymousClass001.A0o()));
                    }
                    return;
                }
            } else if (((A08() && A07()) || r11.A01.A03.contains(C141926wM.REQUIRE_PROPERTIES)) && !r11.A01.A03.contains(C141926wM.SUPPRESS_EXCEPTIONS)) {
                throw new C131276dK(AnonymousClass000.A0T("Missing property in path ", A022));
            } else {
                return;
            }
            if (r11.A08) {
                r3 = new C131356dS(obj, A0n);
            } else {
                r3 = C172478Lh.A01;
            }
            if (this.A01 == null) {
                String A0V = AnonymousClass000.A0V(String.valueOf(this.A00), "]", AnonymousClass000.A0l("["));
                if (A0V.equals("[-1]") || r11.A02.A00.A01.A02.A02().equals(A0V)) {
                    r11.A02(r3, obj4, A022);
                    return;
                }
                return;
            }
            A01().A03(r3, r11, obj4, A022);
            return;
        }
        String A0V2 = AnonymousClass000.A0V(C160947oi.A00(list, ", ", "'"), "]", AnonymousClass000.A0m(str, "["));
        AnonymousClass7TV r7 = r11.A01;
        C187038wL r32 = r7.A00;
        Object A023 = ((C170598Du) r32).A00.A02();
        for (Object next : list) {
            if (r32.BBl(obj).contains(next)) {
                Map map2 = (Map) obj;
                if (!map2.containsKey(next)) {
                    obj2 = C187038wL.A00;
                } else {
                    obj2 = map2.get(next);
                }
                if (obj2 == C187038wL.A00) {
                    if (!r7.A03.contains(C141926wM.DEFAULT_PATH_LEAF_TO_NULL)) {
                    }
                }
                r32.Bn8(A023, next, obj2);
            } else {
                Set set2 = r7.A03;
                if (!set2.contains(C141926wM.DEFAULT_PATH_LEAF_TO_NULL)) {
                    if (set2.contains(C141926wM.REQUIRE_PROPERTIES)) {
                        throw new C131276dK(AnonymousClass000.A0T("Missing property in path ", A0V2));
                    }
                }
            }
            obj2 = null;
            r32.Bn8(A023, next, obj2);
        }
        if (r11.A08) {
            r0 = new C131346dR(obj, list);
        } else {
            r0 = C172478Lh.A01;
        }
        r11.A02(r0, A023, A0V2);
    }

    public int hashCode() {
        return toString().hashCode();
    }
}
