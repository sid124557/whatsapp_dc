package X;

import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.2rA  reason: invalid class name and case insensitive filesystem */
public class C55942rA {
    public final C116985rC A00;
    public final C56972sr A01;
    public final C620433g A02;
    public final C56422rx A03;
    public final AnonymousClass33p A04;
    public final AnonymousClass1VX A05;
    public final AnonymousClass4FV A06;
    public final AnonymousClass2Ze A07;
    public final C1906899l A08;
    public final C1907099n A09;
    public final C194529Tg A0A;
    public final C195219Wq A0B;
    public final C45032Yk A0C;
    public final AnonymousClass4FS A0D;

    public void A02(AnonymousClass4DV r19, Integer num, String str, List list, int i, boolean z, boolean z2, boolean z3) {
        String str2;
        String str3;
        String str4;
        int i2;
        AnonymousClass39W B5s;
        AnonymousClass39S r1;
        AnonymousClass4DV r7 = r19;
        if (!A04(r7)) {
            C624134x r4 = (C624134x) r7;
            C95814uZ r10 = r4.A1J.A00;
            AnonymousClass39W B5s2 = r7.B5s();
            if (B5s2 == null || (r1 = B5s2.A01) == null) {
                str2 = "";
                str3 = str2;
            } else {
                str2 = r1.A07.A08;
                str3 = ((AnonymousClass3H6) r1.A06).A04;
            }
            try {
                String A012 = A01(r7);
                JSONObject A1G = AnonymousClass0x9.A1G();
                A00(this, "order_details", A012, A1G);
                A1G.put("is_cta_available", z2);
                AnonymousClass39W B5s3 = r7.B5s();
                C626936e.A06(B5s3);
                AnonymousClass39S r12 = B5s3.A01;
                C626936e.A06(r12);
                if ("payment_instruction".equals(r12.A02)) {
                    str4 = "cpi";
                } else {
                    C626936e.A06(r12);
                    str4 = "confirm";
                    if (!str4.equals(r12.A02)) {
                        C626936e.A06(r12);
                        str4 = "pix";
                        if (!str4.equals(r12.A02)) {
                            if (!C107575bX.A0F(r12.A04)) {
                                str4 = "native";
                            } else {
                                str4 = null;
                            }
                        }
                    }
                }
                String str5 = str;
                String str6 = str4;
                if (!C107575bX.A0F(str5)) {
                    str6 = str5;
                }
                if (!C107575bX.A0F(str6)) {
                    A1G.put("payment_method_choice", str6);
                }
                Integer num2 = num;
                if (num != null) {
                    A1G.put("num_installments", num2);
                }
                A1G.put("p2m_flow", str2);
                A1G.put("currency", str3);
                if (z3) {
                    JSONArray A1F = AnonymousClass0x9.A1F();
                    if (str4 != null) {
                        A1F.put(str4);
                    } else if (list != null && !list.isEmpty()) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            AnonymousClass0x7.A1L(it, A1F);
                        }
                    } else if (str != null) {
                        A1F.put(str5);
                    }
                    C18300x5.A1L(A1F, "accepted_payment_method", A1G);
                }
                if (z && (B5s = r7.B5s()) != null) {
                    AnonymousClass39S r13 = B5s.A01;
                    C626936e.A06(r13);
                    AnonymousClass39G r0 = r13.A09;
                    C626936e.A06(r0);
                    Float valueOf = Float.valueOf(r13.A03(r0).A02.A00.floatValue());
                    if (valueOf != null) {
                        A1G.put("order_amount", valueOf);
                    }
                }
                AnonymousClass1VX r3 = this.A05;
                C162457s7.A0J(r3, 0);
                A1G.put("order_content_variant", r3.A0O(C58422vE.A02, 4248));
                AnonymousClass2Ze r9 = this.A07;
                String obj = A1G.toString();
                if (r4 instanceof C30741mw) {
                    i2 = 8;
                } else if (r4 instanceof AnonymousClass1n1) {
                    i2 = 2;
                } else {
                    i2 = 1;
                    if (r4 instanceof C31941p8) {
                        i2 = 3;
                    }
                }
                r9.A00(r10, Integer.valueOf(C106945aQ.A00(this.A03.A01(AnonymousClass32Y.A03(r10)))), obj, (String) null, i, 4, i2, true);
            } catch (JSONException unused) {
                Log.e("OrderDetailsMessageLogging/logOrderDetailsAction failed to construct message class attributes");
            }
        }
    }

    public void A03(AnonymousClass4DV r10, String str, int i) {
        A02(r10, (Integer) null, str, (List) null, i, false, false, false);
    }

    public static void A00(C55942rA r1, Object obj, Object obj2, JSONObject jSONObject) {
        jSONObject.put("cta", obj);
        jSONObject.put("wa_pay_registered", r1.A08.A0D());
        jSONObject.put("p2m_type", obj2);
    }

    public final boolean A04(AnonymousClass4DV r4) {
        AnonymousClass39W B5s;
        if (!this.A05.A0Y(C58422vE.A02, 1345) || (B5s = r4.B5s()) == null || B5s.A01 == null || !(r4 instanceof C624134x)) {
            return true;
        }
        return false;
    }

    public C55942rA(C116985rC r1, C56972sr r2, C620433g r3, C56422rx r4, AnonymousClass33p r5, AnonymousClass1VX r6, AnonymousClass4FV r7, AnonymousClass2Ze r8, C1906899l r9, C1907099n r10, C194529Tg r11, C195219Wq r12, C45032Yk r13, AnonymousClass4FS r14) {
        this.A05 = r6;
        this.A01 = r2;
        this.A0D = r14;
        this.A06 = r7;
        this.A0B = r12;
        this.A00 = r1;
        this.A08 = r9;
        this.A03 = r4;
        this.A04 = r5;
        this.A09 = r10;
        this.A02 = r3;
        this.A0A = r11;
        this.A0C = r13;
        this.A07 = r8;
    }

    public final String A01(AnonymousClass4DV r4) {
        AnonymousClass39W B5s = r4.B5s();
        C626936e.A06(B5s);
        AnonymousClass39S r2 = B5s.A01;
        C626936e.A06(r2);
        String str = r2.A0D;
        if (str != null && this.A09.A0K(str)) {
            return "p2m_lite";
        }
        C626936e.A06(r2);
        C85204Fi r0 = r2.A06;
        C626936e.A06(r0);
        String str2 = ((AnonymousClass3H6) r0).A04;
        if (((AnonymousClass3H6) AnonymousClass1S3.A04).A04.equals(str2)) {
            return "p2m_pro";
        }
        if (!((AnonymousClass3H6) AnonymousClass1S3.A05).A04.equals(str2)) {
            return "UNSET";
        }
        if (this.A09.A0M(r2.A0K)) {
            return "p2m_checkout_lite";
        }
        return "p2m_hybrid";
    }
}
