package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableString;
import android.text.TextUtils;
import com.whatsapp.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* renamed from: X.9U0  reason: invalid class name */
public class AnonymousClass9U0 {
    public C203479nl A00;
    public final Resources A01;
    public final C56422rx A02;
    public final C56612sH A03;
    public final C620733j A04;
    public final C66473Lo A05;
    public final AnonymousClass1VX A06;
    public final C1907099n A07;
    public final AnonymousClass9U4 A08;
    public final C195219Wq A09;
    public final C106715a2 A0A;

    public C194069Rl A00(Context context, C624034w r11, AnonymousClass399 r12, AnonymousClass394 r13, String str, int i) {
        AnonymousClass399 r4 = r12;
        int i2 = i;
        if (r11 != null) {
            AnonymousClass9U4 r1 = this.A08;
            C203549nv B66 = r1.A0G().B66();
            if (this.A09.A0q(r11, r1.A0G().B9W(), B66, 2)) {
                return new C194069Rl(r4, (AnonymousClass394) null, context.getString(R.string.f11nameremoved), (List) null, i2);
            }
        }
        return new C194069Rl(r4, r13, str, (List) null, i2);
    }

    public List A04(Context context, AnonymousClass9XZ r29, AnonymousClass39S r30, HashMap hashMap, boolean z, boolean z2) {
        ArrayList A0s;
        SpannableString spannableString;
        C632538n A002;
        String str;
        List list;
        Context context2 = context;
        AnonymousClass39S r8 = r30;
        if (this instanceof AnonymousClass9G4) {
            C162457s7.A0J(context2, 0);
            ArrayList A0s2 = AnonymousClass001.A0s();
            List<AnonymousClass399> list2 = r8.A0I;
            if ((list2 != null || z) && AnonymousClass39S.A00(r8.A07.A01) == 1) {
                Map A012 = AnonymousClass9UM.A01(context2, this.A06, r8.A0K);
                if (!z) {
                    String string = context2.getString(R.string.f11nameremoved);
                    String string2 = context2.getString(R.string.f11nameremoved);
                    String string3 = context2.getString(R.string.f11nameremoved);
                    A0s2.add(new C195339Xj(new C51872kW((SpannableString) null, false), new C51882kX((SpannableString) null, false), new C51892kY((SpannableString) null, false), "WhatsappPay", string, string2, string3, 0));
                    if (list2 != null) {
                        for (AnonymousClass399 r1 : list2) {
                            C195339Xj r5 = (C195339Xj) A012.get(r1.A01);
                            if (r5 != null && (str = r1.A02) != null && (list = r5.A0B) != null) {
                                Iterator it = list.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        if (Pattern.compile(AnonymousClass001.A0m(it)).matcher(str).matches()) {
                                            A0s2.add(r5);
                                            break;
                                        }
                                    } else {
                                        break;
                                    }
                                }
                            }
                        }
                    }
                } else {
                    Object obj = A012.get("checkout_lite");
                    if (obj != null) {
                        A0s2.add(obj);
                    }
                }
            }
            return A0s2;
        }
        if (this instanceof AnonymousClass9G5) {
            AnonymousClass9G5 r0 = (AnonymousClass9G5) this;
            C51872kW r13 = new C51872kW((SpannableString) null, false);
            AnonymousClass9XZ r6 = r29;
            if (r29 != null) {
                boolean z3 = r6.A02;
                AnonymousClass1VX r52 = r0.A06;
                if (r52.A0X(4443) && (A002 = r6.A00()) != null) {
                    int i = A002.A00;
                    AnonymousClass39L r10 = A002.A01;
                    if (r10 != null) {
                        Resources resources = context2.getResources();
                        Object[] objArr = new Object[2];
                        objArr[0] = String.valueOf(i);
                        String A0b = C18320x8.A0b(resources, AnonymousClass1S3.A04.B3W(r0.A01, r10.A02.A00), objArr, 1, R.string.f11nameremoved);
                        C106715a2 r82 = r0.A04;
                        String[] strArr = {r52.A0Q(4144)};
                        spannableString = r82.A04(context2, A0b, new Runnable[]{new C198219eZ(), new C198229ea(), new C198239eb()}, new String[]{"installment-learn-more"}, strArr);
                        r13 = new C51872kW(spannableString, z3);
                    }
                }
                spannableString = null;
                r13 = new C51872kW(spannableString, z3);
            }
            HashMap hashMap2 = hashMap;
            C194069Rl r2 = (C194069Rl) C18290x4.A0j(hashMap2, 2);
            Object A0j = C18290x4.A0j(hashMap2, 0);
            Object A0j2 = C18290x4.A0j(hashMap2, 6);
            A0s = AnonymousClass001.A0s();
            if (A0j != null) {
                String string4 = context2.getString(R.string.f11nameremoved);
                String string5 = context2.getString(R.string.f11nameremoved);
                C51892kY r15 = new C51892kY(r0.A09(context2), !z2);
                C106715a2 r102 = r0.A04;
                String[] strArr2 = {String.valueOf(r0.A03.A03("817549892726019"))};
                A0s.add(new C195339Xj(r13, new C51882kX(r102.A04(context2, context2.getString(R.string.f11nameremoved), new Runnable[]{new C198279ef()}, new String[]{"pay-natively-learn-more"}, strArr2), z2), r15, "WhatsappPay", string4, "", string5, R.drawable.card_default));
            }
            if (r2 != null) {
                String string6 = context2.getString(R.string.f11nameremoved);
                AnonymousClass399 r22 = r2.A02;
                C626936e.A06(r22);
                String str2 = r22.A00;
                String string7 = context2.getString(R.string.f11nameremoved);
                A0s.add(new C195339Xj(new C51872kW((SpannableString) null, false), new C51882kX((SpannableString) null, false), new C51892kY(r0.A09(context2), false), "CustomPaymentInstructions", string6, str2, string7, R.drawable.note_icon));
            }
            if (A0j2 != null && r0.A02.A02.A0X(4780)) {
                String string8 = context2.getString(R.string.f11nameremoved);
                String string9 = context2.getString(R.string.f11nameremoved);
                A0s.add(new C195339Xj(new C51872kW((SpannableString) null, false), new C51882kX((SpannableString) null, false), new C51892kY(r0.A09(context2), false), "pix", string8, "", string9, R.drawable.pix_logo));
            }
        } else {
            A0s = AnonymousClass001.A0s();
            List<AnonymousClass399> list3 = r8.A0I;
            int A0D = this.A09.A0D(r8.A07);
            Integer[] numArr = new Integer[2];
            AnonymousClass000.A1L(numArr, 1);
            AnonymousClass000.A1P(numArr, 7, 1);
            HashSet A0h = C18280x3.A0h(numArr);
            if (list3 != null && C86624Kv.A1a(A0h, A0D)) {
                Map A013 = AnonymousClass9UM.A01(context2, this.A06, r8.A0K);
                for (AnonymousClass399 r12 : list3) {
                    C195339Xj r3 = (C195339Xj) A013.get(r12.A01);
                    if (r3 != null) {
                        String str3 = r12.A02;
                        List list4 = r3.A0B;
                        if (list4 != null) {
                            Iterator it2 = list4.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    if (Pattern.compile(AnonymousClass001.A0m(it2)).matcher(str3).matches()) {
                                        A0s.add(r3);
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        return A0s;
    }

    public boolean A05() {
        if (this instanceof AnonymousClass9G5) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x001a A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A06(X.C624034w r5, X.C95814uZ r6, X.AnonymousClass39S r7) {
        /*
            r4 = this;
            boolean r0 = r4 instanceof X.AnonymousClass9G5
            if (r0 == 0) goto L_0x0006
            r0 = 1
            return r0
        L_0x0006:
            X.99n r3 = r4.A07
            java.lang.String r0 = r7.A0D
            boolean r0 = r3.A0K(r0)
            r2 = 0
            r1 = 1
            if (r0 == 0) goto L_0x001c
            if (r5 == 0) goto L_0x001b
            boolean r0 = r5.A0M()
        L_0x0018:
            if (r0 == 0) goto L_0x001b
        L_0x001a:
            r2 = 1
        L_0x001b:
            return r2
        L_0x001c:
            java.util.List r0 = r7.A0K
            boolean r0 = r3.A0M(r0)
            if (r0 == 0) goto L_0x002f
            X.39H r0 = r7.A07
            java.lang.String r0 = r0.A01
            int r0 = X.AnonymousClass39S.A00(r0)
            if (r0 == r1) goto L_0x001b
            goto L_0x001a
        L_0x002f:
            java.lang.String r0 = r7.A04
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0042
            X.9Wq r1 = r4.A09
            X.39H r0 = r7.A07
            int r1 = r1.A0D(r0)
            r0 = 4
            if (r1 != r0) goto L_0x001b
        L_0x0042:
            if (r5 == 0) goto L_0x004a
            boolean r0 = r5.A0I()
            if (r0 != 0) goto L_0x001b
        L_0x004a:
            X.9Wq r0 = r4.A09
            boolean r0 = r0.A0s(r6)
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9U0.A06(X.34w, X.4uZ, X.39S):boolean");
    }

    public boolean A07(C624034w r7, AnonymousClass213 r8, AnonymousClass39S r9, HashMap hashMap, int i, boolean z) {
        if (this instanceof AnonymousClass9G5) {
            AnonymousClass9G5 r4 = (AnonymousClass9G5) this;
            if (hashMap.isEmpty()) {
                C1899593h.A1Q("BrazilPaymentCheckoutOrderDetailsViewConfigurationFactory", "shouldShowPaymentButton, missing default Whatsapp payment option in the map");
            } else if (!((z && !r4.A02.A02.A0X(2178)) || 4 == i || 3 == i)) {
                if (TextUtils.isEmpty(r9.A02) && TextUtils.isEmpty(r9.A04) && r4.A02.A0C()) {
                    return true;
                }
                if (r7 != null) {
                    AnonymousClass9U4 r1 = r4.A08;
                    C203549nv B66 = r1.A0G().B66();
                    if (r4.A09.A0q(r7, r1.A0G().B9W(), B66, 2)) {
                        return true;
                    }
                }
                if (TextUtils.isEmpty(r9.A02) || !"pending_buyer_confirmation".equals(r9.A03)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        C1907099n r12 = this.A07;
        String str = r9.A0D;
        boolean A0K = r12.A0K(str);
        if (i != 1 || (A0K ? !r12.A01() || (r7 != null && r7.A0M()) : !this.A06.A0X(994)) || (this.A09.A0C.A0L(str, r9.A0K) && r7 != null && r7.A0M())) {
            return false;
        }
        return true;
    }

    public boolean A08(String str, List list, boolean z) {
        if (!(this instanceof AnonymousClass9G5)) {
            String A0Q = this.A06.A0Q(1763);
            if (list.isEmpty() || z || A0Q == null || !A0Q.contains(str)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public AnonymousClass9U0(Resources resources, C56422rx r2, C56612sH r3, C620733j r4, C66473Lo r5, AnonymousClass1VX r6, C1907099n r7, AnonymousClass9U4 r8, C195219Wq r9, C106715a2 r10) {
        this.A03 = r3;
        this.A06 = r6;
        this.A0A = r10;
        this.A09 = r9;
        this.A04 = r4;
        this.A08 = r8;
        this.A02 = r2;
        this.A07 = r7;
        this.A05 = r5;
        this.A01 = resources;
    }

    public HashMap A02(Context context) {
        String string;
        HashMap A0t = AnonymousClass001.A0t();
        int[] iArr = {R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved};
        if (this.A07.A0G()) {
            boolean A012 = AnonymousClass2BO.A00.A01(this.A06);
            int i = R.string.f11nameremoved;
            if (A012) {
                i = R.string.f11nameremoved;
            }
            string = context.getString(i);
        } else {
            AnonymousClass1VX r1 = this.A06;
            C162457s7.A0J(r1, 0);
            string = context.getString(iArr[r1.A0N(4248)]);
        }
        A0t.put(3, string);
        return A0t;
    }

    public HashMap A03(Context context, C624034w r14, AnonymousClass39S r15) {
        HashMap A0t = AnonymousClass001.A0t();
        List<AnonymousClass399> list = r15.A0I;
        if (list != null) {
            for (AnonymousClass399 r8 : list) {
                if ("payment_instruction".equals(r8.A01)) {
                    boolean A0G = this.A07.A0G();
                    int i = R.string.f11nameremoved;
                    if (A0G) {
                        i = R.string.f11nameremoved;
                    }
                    A0t.put(2, A00(context, r14, r8, (AnonymousClass394) null, context.getString(i), 2));
                }
            }
        }
        return A0t;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:81:0x02e0, code lost:
        if (r1 > r4) goto L_0x02e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0356, code lost:
        if (r0.A0X(5575) == false) goto L_0x03d0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x03c9  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x03cd  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x03d6  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x03dc  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x03df  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0150  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0162  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x018c  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x01ab A[LOOP:1: B:60:0x01a5->B:62:0x01ab, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01d7  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01da  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01df  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0221  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x02a9  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x02d3  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0346  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0372  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x037e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass9QL A01(android.content.Context r68, X.C624034w r69, X.AnonymousClass213 r70, X.AnonymousClass4DV r71, java.util.List r72) {
        /*
            r67 = this;
            r29 = r71
            r0 = r29
            X.34x r0 = (X.C624134x) r0
            r28 = r0
            X.39W r0 = r29.B5s()
            X.C626936e.A06(r0)
            X.39S r3 = r0.A01
            X.C626936e.A06(r3)
            X.39H r13 = r3.A07
            r0 = r28
            X.2z0 r0 = r0.A1J
            X.4uZ r0 = r0.A00
            r27 = r0
            X.C626936e.A06(r27)
            r2 = r67
            X.3Lo r1 = r2.A05
            X.3ZH r22 = r1.A01(r0)
            java.lang.String r0 = r22.A0J()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0143
            java.lang.String r35 = r22.A0L()
        L_0x0037:
            boolean r0 = android.text.TextUtils.isEmpty(r35)
            r4 = 1
            r47 = r0 ^ 1
            X.9Wq r0 = r2.A09
            r26 = r0
            int r42 = r0.A0D(r13)
            X.33j r14 = r2.A04
            java.lang.String r32 = r3.A05(r14)
            X.39G r0 = r13.A06
            r25 = r0
            r18 = r69
            r5 = r26
            r0 = r18
            boolean r52 = r5.A0r(r0, r3)
            X.99n r0 = r5.A0C
            r23 = r0
            java.lang.String r0 = r3.A0D
            r20 = r0
            r5 = r23
            boolean r0 = r5.A0K(r0)
            r45 = 0
            if (r0 == 0) goto L_0x0076
            if (r69 == 0) goto L_0x0076
            boolean r0 = r18.A0M()
            if (r0 == 0) goto L_0x0076
            r45 = 1
        L_0x0076:
            r5 = r18
            r0 = r27
            boolean r46 = r2.A06(r5, r0, r3)
            if (r46 == 0) goto L_0x013f
            X.C626936e.A06(r27)
            X.3ZH r1 = r1.A01(r0)
            java.lang.String r0 = r1.A0J()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0139
            java.lang.String r5 = r1.A0L()
        L_0x0095:
            X.9O6 r17 = new X.9O6
            r1 = r17
            r0 = r27
            r1.<init>(r0, r5)
        L_0x009e:
            X.39G r0 = r3.A09
            X.39L r24 = r3.A03(r0)
            X.39G r0 = r13.A03
            if (r0 != 0) goto L_0x0118
            r5 = 0
            r12 = 0
        L_0x00ab:
            r38 = 0
        L_0x00ad:
            X.1VX r0 = r2.A06
            r21 = r0
            r1 = 6012(0x177c, float:8.425E-42)
            boolean r0 = r0.A0X(r1)
            if (r0 == 0) goto L_0x0115
            if (r69 == 0) goto L_0x0115
            X.39L r0 = r18.A04()
            if (r0 == 0) goto L_0x0115
            X.39L r0 = r18.A04()
            X.4Fi r1 = r0.A01
            X.39Q r0 = r0.A02
            java.math.BigDecimal r0 = r0.A00
            java.lang.String r0 = r1.B3W(r14, r0)
            if (r0 == 0) goto L_0x0115
            boolean r7 = r14.A0T()
            java.lang.String r1 = "–"
            if (r7 == 0) goto L_0x0110
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0m(r1, r0)
        L_0x00dd:
            java.lang.String r39 = r0.toString()
        L_0x00e1:
            X.39G r0 = r13.A04
            r19 = r0
            java.util.List r0 = r13.A09
            r16 = r0
            java.util.Iterator r15 = r16.iterator()
            r9 = 0
        L_0x00ee:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x0149
            java.lang.Object r0 = r15.next()
            X.39F r0 = (X.AnonymousClass39F) r0
            int r8 = r0.A00
            int r9 = r9 + r8
            X.39G r7 = r0.A02
            if (r7 == 0) goto L_0x00ee
            X.39G r0 = r0.A01
            long r0 = r0.A01
            long r10 = r7.A01
            long r0 = r0 - r10
            long r10 = (long) r8
            long r0 = r0 * r10
            long r5 = r5 + r0
            if (r12 != 0) goto L_0x00ee
            int r12 = r7.A00
            goto L_0x00ee
        L_0x0110:
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0m(r0, r1)
            goto L_0x00dd
        L_0x0115:
            r39 = 0
            goto L_0x00e1
        L_0x0118:
            long r5 = r0.A01
            int r12 = r0.A00
            java.lang.String r0 = r3.A06(r14, r0)
            if (r0 == 0) goto L_0x00ab
            boolean r7 = r14.A0T()
            java.lang.String r1 = "–"
            if (r7 == 0) goto L_0x0134
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0m(r1, r0)
        L_0x012e:
            java.lang.String r38 = r0.toString()
            goto L_0x00ad
        L_0x0134:
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0m(r0, r1)
            goto L_0x012e
        L_0x0139:
            java.lang.String r5 = r1.A0J()
            goto L_0x0095
        L_0x013f:
            r17 = 0
            goto L_0x009e
        L_0x0143:
            java.lang.String r35 = r22.A0J()
            goto L_0x0037
        L_0x0149:
            int r0 = r16.size()
            r10 = 2
            if (r0 >= r10) goto L_0x01df
            android.content.res.Resources r8 = r2.A01
            r1 = 2131891498(0x7f12152a, float:1.9417718E38)
            java.lang.Object[] r0 = new java.lang.Object[r4]
            boolean r7 = X.C18300x5.A1Y(r0, r9)
            r8.getString(r1, r0)
        L_0x015e:
            X.393 r0 = r13.A02
            if (r0 == 0) goto L_0x01da
            r11 = 2131891437(0x7f1214ed, float:1.9417594E38)
            java.lang.Object[] r9 = new java.lang.Object[r10]
            long r0 = r0.A00
            r15 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r15
            java.text.DateFormat r4 = X.C107505bQ.A09(r14, r7)
            java.lang.String r4 = X.C86624Kv.A0c(r4, r0)
            r9[r7] = r4
            X.2sH r4 = r2.A03
            long r0 = r4.A0I(r0)
            java.lang.String r0 = X.C107145am.A00(r14, r0)
            r4 = 1
            java.lang.String r33 = X.C18320x8.A0b(r8, r0, r9, r4, r11)
            r9 = 0
        L_0x0187:
            int r0 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            r11 = 0
            if (r0 <= 0) goto L_0x01d7
            X.39G r0 = new X.39G
            r0.<init>(r5, r12, r11)
            java.lang.String r37 = r3.A06(r14, r0)
        L_0x0195:
            java.util.HashMap r16 = X.AnonymousClass001.A0t()
            r30 = r68
            r0 = r30
            java.util.HashMap r0 = r2.A02(r0)
            java.util.Iterator r6 = X.AnonymousClass001.A0u(r0)
        L_0x01a5:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x01ef
            java.util.Map$Entry r1 = X.AnonymousClass001.A0w(r6)
            java.lang.Object r5 = r1.getKey()
            java.lang.Object r0 = r1.getKey()
            int r59 = X.AnonymousClass001.A0K(r0)
            java.lang.Object r0 = r1.getValue()
            java.lang.String r0 = (java.lang.String) r0
            r57 = r11
            r53 = r2
            r54 = r30
            r55 = r18
            r56 = r11
            r58 = r0
            X.9Rl r1 = r53.A00(r54, r55, r56, r57, r58, r59)
            r0 = r16
            r0.put(r5, r1)
            goto L_0x01a5
        L_0x01d7:
            r37 = r11
            goto L_0x0195
        L_0x01da:
            r9 = 0
            r33 = 0
            goto L_0x0187
        L_0x01df:
            r7 = 0
            android.content.res.Resources r8 = r2.A01
            r9 = 2131755250(0x7f1000f2, float:1.9141374E38)
            java.lang.Object[] r1 = new java.lang.Object[r4]
            X.AnonymousClass000.A1P(r1, r0, r7)
            r8.getQuantityString(r9, r0, r1)
            goto L_0x015e
        L_0x01ef:
            r1 = r30
            r0 = r18
            java.util.HashMap r1 = r2.A03(r1, r0, r3)
            r0 = r16
            r0.putAll(r1)
            X.2rx r1 = r2.A02
            com.whatsapp.jid.UserJid r0 = X.AnonymousClass32Y.A03(r27)
            boolean r59 = r1.A03(r0)
            r55 = r70
            r53 = r2
            r54 = r18
            r56 = r3
            r57 = r16
            r58 = r42
            boolean r48 = r53.A07(r54, r55, r56, r57, r58, r59)
            X.99n r15 = r2.A07
            r0 = r20
            boolean r0 = r15.A0K(r0)
            r5 = 3
            if (r0 == 0) goto L_0x0287
            java.util.Map r1 = r15.A08()
            r0 = r20
            java.lang.Object r6 = r1.get(r0)
            X.C626936e.A06(r6)
            X.5a2 r9 = r2.A0A
            r1 = 2131896225(0x7f1227a1, float:1.9427305E38)
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.String r62 = X.C18320x8.A0b(r8, r6, r0, r7, r1)
            java.lang.String r6 = "p2m-lite-wa-policies"
            java.lang.String r1 = "p2m-lite-meta-privacy-policy"
            java.lang.String r0 = "p2m-lite-wa-terms"
            java.lang.String[] r64 = new java.lang.String[]{r0, r6, r1}
            java.lang.String[] r1 = new java.lang.String[r5]
            r6 = 2669(0xa6d, float:3.74E-42)
            r0 = r21
            java.lang.String r0 = r0.A0Q(r6)
            r1[r7] = r0
            r6 = 2670(0xa6e, float:3.741E-42)
            r0 = r21
            java.lang.String r0 = r0.A0Q(r6)
            r1[r4] = r0
            r6 = 2671(0xa6f, float:3.743E-42)
            r0 = r21
            java.lang.String r0 = r0.A0Q(r6)
            r6 = 2
            r1[r6] = r0
            java.lang.Runnable[] r0 = new java.lang.Runnable[r5]
            X.9ew r5 = new X.9ew
            r5.<init>()
            r0[r7] = r5
            X.9f1 r5 = new X.9f1
            r5.<init>()
            r0[r4] = r5
            X.9f2 r5 = new X.9f2
            r5.<init>()
            r0[r6] = r5
            r60 = r9
            r61 = r30
            r63 = r0
            r65 = r1
            android.text.SpannableString r11 = r60.A04(r61, r62, r63, r64, r65)
        L_0x0287:
            java.util.List r1 = r3.A0K
            r0 = r23
            boolean r12 = r0.A0M(r1)
            X.9U4 r0 = r2.A08
            X.9oC r0 = r0.A0G()
            boolean r0 = r0.BIH()
            if (r0 == 0) goto L_0x02cf
            if (r12 != 0) goto L_0x02cf
            r0 = r26
            X.6wO r0 = r0.A0H(r3)
            X.6wO r1 = X.C141946wO.TOS_V1
            java.lang.String r10 = "https://www.whatsapp.com/legal/privacy-policy"
            if (r0 != r1) goto L_0x03df
            X.5a2 r9 = r2.A0A
            r0 = 2131891595(0x7f12158b, float:1.9417914E38)
            java.lang.String r62 = r8.getString(r0)
            java.lang.String r0 = "p2m-hybrid-wa-policies"
            java.lang.String[] r64 = new java.lang.String[]{r0}
            java.lang.String[] r65 = new java.lang.String[]{r10}
            java.lang.Runnable[] r0 = new java.lang.Runnable[r4]
            X.9f3 r1 = new X.9f3
            r1.<init>()
            r0[r7] = r1
        L_0x02c5:
            r60 = r9
            r61 = r30
            r63 = r0
            android.text.SpannableString r11 = r60.A04(r61, r62, r63, r64, r65)
        L_0x02cf:
            X.390 r0 = r3.A08
            if (r0 == 0) goto L_0x03dc
            int r1 = r0.A00
            r5 = 4443(0x115b, float:6.226E-42)
            r0 = r21
            boolean r0 = r0.A0X(r5)
            if (r0 == 0) goto L_0x03d9
            r0 = 1
            if (r1 <= r4) goto L_0x03d9
        L_0x02e2:
            X.9XZ r7 = new X.9XZ
            r5 = r72
            r7.<init>(r5, r1, r0)
        L_0x02e9:
            X.5a2 r9 = r2.A0A
            r0 = 2131890394(0x7f1210da, float:1.9415479E38)
            java.lang.String r62 = r8.getString(r0)
            java.lang.String r0 = "installment-learn-more"
            java.lang.String[] r64 = new java.lang.String[]{r0}
            java.lang.String[] r5 = new java.lang.String[r4]
            r1 = 4144(0x1030, float:5.807E-42)
            r0 = r21
            java.lang.String r0 = r0.A0Q(r1)
            r6 = 0
            r5[r6] = r0
            r0 = 3
            java.lang.Runnable[] r0 = new java.lang.Runnable[r0]
            X.9ey r1 = new X.9ey
            r1.<init>()
            r0[r6] = r1
            X.9ez r1 = new X.9ez
            r1.<init>()
            r0[r4] = r1
            X.9f0 r1 = new X.9f0
            r1.<init>()
            r6 = 2
            r0[r6] = r1
            r60 = r9
            r61 = r30
            r63 = r0
            r65 = r5
            android.text.SpannableString r20 = r60.A04(r61, r62, r63, r64, r65)
            r60 = r2
            r62 = r7
            r63 = r3
            r64 = r16
            r65 = r12
            r66 = r59
            java.util.List r9 = r60.A04(r61, r62, r63, r64, r65, r66)
            java.lang.String r1 = r13.A08
            java.lang.String r0 = "PAYMENT_REQUEST"
            boolean r0 = r0.equals(r1)
            r51 = 1
            if (r0 == 0) goto L_0x03d0
            X.1VX r0 = r15.A02
            r1 = 5574(0x15c6, float:7.811E-42)
            boolean r1 = r0.A0X(r1)
            if (r1 != 0) goto L_0x0358
            r1 = 5575(0x15c7, float:7.812E-42)
            boolean r0 = r0.A0X(r1)
            if (r0 == 0) goto L_0x03d0
        L_0x0358:
            r0 = r28
            long r0 = r0.A1L
            r54 = r0
            java.lang.String r1 = "pending_buyer_confirmation"
            java.lang.String r0 = r3.A03
            boolean r49 = r1.equals(r0)
            r0 = r27
            java.lang.String r0 = r0.user
            boolean r50 = r2.A08(r0, r9, r12)
            boolean r0 = r2 instanceof X.AnonymousClass9G5
            if (r0 == 0) goto L_0x03cd
            r53 = 1
        L_0x0374:
            r1 = 4248(0x1098, float:5.953E-42)
            r0 = r21
            int r1 = r0.A0N(r1)
            if (r1 == r4) goto L_0x03c9
            if (r1 == r6) goto L_0x03c5
            r5 = 3
            r0 = 2131896206(0x7f12278e, float:1.9427267E38)
            if (r1 == r5) goto L_0x0389
            r0 = 2131896203(0x7f12278b, float:1.942726E38)
        L_0x0389:
            java.lang.Object[] r5 = new java.lang.Object[r4]
            java.lang.String r4 = r3.A0E
            r1 = 0
            java.lang.String r31 = X.C18320x8.A0b(r8, r4, r5, r1, r0)
            X.9nl r4 = r2.A00
            java.lang.String r2 = r3.A04
            r0 = r25
            r3.A06(r14, r0)
            java.lang.String r1 = r13.A00
            X.39G r0 = r13.A05
            r3.A06(r14, r0)
            r0 = r19
            r3.A06(r14, r0)
            X.9QL r19 = new X.9QL
            r21 = r14
            r23 = r17
            r25 = r18
            r26 = r27
            r27 = r7
            r28 = r4
            r30 = r11
            r34 = r2
            r36 = r1
            r40 = r16
            r41 = r9
            r43 = r54
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r45, r46, r47, r48, r49, r50, r51, r52, r53)
            return r19
        L_0x03c5:
            r0 = 2131896205(0x7f12278d, float:1.9427265E38)
            goto L_0x0389
        L_0x03c9:
            r0 = 2131896204(0x7f12278c, float:1.9427263E38)
            goto L_0x0389
        L_0x03cd:
            r53 = 0
            goto L_0x0374
        L_0x03d0:
            boolean r0 = r53.A07(r54, r55, r56, r57, r58, r59)
            if (r0 == 0) goto L_0x0358
            r51 = 0
            goto L_0x0358
        L_0x03d9:
            r0 = 0
            goto L_0x02e2
        L_0x03dc:
            r7 = 0
            goto L_0x02e9
        L_0x03df:
            X.6wO r9 = X.C141946wO.TOS_V2
            java.lang.String r7 = "https://www.whatsapp.com/legal/payments/india/psp"
            java.lang.String r6 = "https://www.whatsapp.com/legal/payments/india/terms"
            java.lang.String r5 = "payment-provider-terms"
            java.lang.String r1 = "terms"
            if (r0 != r9) goto L_0x0410
            X.5a2 r9 = r2.A0A
            r0 = 2131891596(0x7f12158c, float:1.9417917E38)
            java.lang.String r62 = r8.getString(r0)
            java.lang.String[] r64 = new java.lang.String[]{r1, r5}
            java.lang.String[] r65 = new java.lang.String[]{r6, r7}
            r0 = 2
            java.lang.Runnable[] r0 = new java.lang.Runnable[r0]
            X.9f4 r5 = new X.9f4
            r5.<init>()
            r1 = 0
            r0[r1] = r5
            X.9f5 r1 = new X.9f5
            r1.<init>()
            r0[r4] = r1
            goto L_0x02c5
        L_0x0410:
            X.6wO r9 = X.C141946wO.TOS_ALL
            if (r0 != r9) goto L_0x02cf
            X.5a2 r9 = r2.A0A
            r0 = 2131891594(0x7f12158a, float:1.9417912E38)
            java.lang.String r62 = r8.getString(r0)
            java.lang.String r0 = "privacy-policy"
            java.lang.String[] r64 = new java.lang.String[]{r1, r0, r5}
            java.lang.String[] r65 = new java.lang.String[]{r6, r10, r7}
            r0 = 3
            java.lang.Runnable[] r0 = new java.lang.Runnable[r0]
            X.9f6 r5 = new X.9f6
            r5.<init>()
            r1 = 0
            r0[r1] = r5
            X.9f7 r1 = new X.9f7
            r1.<init>()
            r0[r4] = r1
            X.9ex r5 = new X.9ex
            r5.<init>()
            r1 = 2
            r0[r1] = r5
            goto L_0x02c5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9U0.A01(android.content.Context, X.34w, X.213, X.4DV, java.util.List):X.9QL");
    }
}
