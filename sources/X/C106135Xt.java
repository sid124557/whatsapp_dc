package X;

import android.content.Context;
import android.util.SparseArray;
import android.view.MenuItem;
import android.view.View;
import com.whatsapp.R;

/* renamed from: X.5Xt  reason: invalid class name and case insensitive filesystem */
public final class C106135Xt {
    public AnonymousClass0AR A00;
    public AnonymousClass4P2 A01;
    public final int A02;
    public final AnonymousClass0AO A03 = new AnonymousClass0AO(80);
    public final AnonymousClass0AO A04 = new AnonymousClass0AO(3);
    public final C620733j A05;
    public final AnonymousClass5SY A06;
    public final AnonymousClass5UP A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;

    public C106135Xt(C620733j r8, AnonymousClass1VX r9, AnonymousClass5SY r10, AnonymousClass5UP r11, C187958y5 r12) {
        int A052 = C18300x5.A05(r12, r9, 1);
        AnonymousClass0x2.A1A(r8, 4, r11);
        this.A06 = r10;
        this.A05 = r8;
        this.A07 = r11;
        boolean z = r10.A03;
        this.A08 = z;
        this.A09 = false | (z & r9.A0Y(C58422vE.A01, 3625));
        int A0N = r9.A0N(5378);
        this.A02 = A0N;
        Integer[] numArr = new Integer[A052];
        AnonymousClass000.A1L(numArr, 10);
        AnonymousClass000.A1P(numArr, 12, 1);
        this.A0F = AnonymousClass0x7.A1U(AnonymousClass8UF.A0o(numArr), A0N);
        this.A0D = r9.A0X(4459);
        this.A0C = r9.A0X(4458);
        this.A0B = r9.A0X(4562);
        this.A0E = r9.A0X(5376);
        this.A0A = r9.A0X(6988);
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x00db A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0060  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A01(int r16) {
        /*
            r15 = this;
            boolean r0 = r15.A08
            r1 = 600(0x258, float:8.41E-43)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r1)
            r1 = 800(0x320, float:1.121E-42)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r1)
            r1 = 400(0x190, float:5.6E-43)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r1)
            r1 = 300(0x12c, float:4.2E-43)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r1)
            r1 = 200(0xc8, float:2.8E-43)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r1)
            r8 = 0
            r7 = 5
            r6 = 2
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)
            r4 = 1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            java.lang.Integer r2 = X.C18290x4.A0a()
            r14 = 4
            java.lang.Integer r1 = java.lang.Integer.valueOf(r14)
            if (r0 != 0) goto L_0x0065
            X.3Z6[] r7 = new X.AnonymousClass3Z6[r7]
            X.AnonymousClass3Z6.A09(r13, r3, r7, r8)
            X.AnonymousClass3Z6.A09(r9, r5, r7, r4)
            X.3Z6 r0 = X.AnonymousClass3Z6.A02(r10, r2)
        L_0x0043:
            r7[r6] = r0
            X.3Z6 r2 = X.AnonymousClass3Z6.A02(r11, r1)
        L_0x0049:
            r0 = 3
            r7[r0] = r2
            X.3Z6 r0 = X.AnonymousClass3Z6.A02(r12, r1)
        L_0x0050:
            r7[r14] = r0
            java.util.Map r0 = X.C73813g7.A0F(r7)
            r1 = r16
            java.lang.Object r0 = X.AnonymousClass001.A0i(r0, r1)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x00db
            int r0 = r0.intValue()
            return r0
        L_0x0065:
            boolean r0 = r15.A0D
            if (r0 == 0) goto L_0x0076
            X.3Z6[] r7 = new X.AnonymousClass3Z6[r7]
            X.AnonymousClass3Z6.A09(r9, r3, r7, r8)
            X.AnonymousClass3Z6.A09(r10, r5, r7, r4)
            X.3Z6 r0 = X.AnonymousClass3Z6.A02(r13, r2)
            goto L_0x0043
        L_0x0076:
            boolean r0 = r15.A0C
            if (r0 == 0) goto L_0x008d
            X.3Z6[] r7 = new X.AnonymousClass3Z6[r7]
            X.AnonymousClass3Z6.A09(r9, r3, r7, r8)
            X.AnonymousClass3Z6.A09(r10, r5, r7, r4)
            X.3Z6 r0 = X.AnonymousClass3Z6.A02(r11, r2)
        L_0x0086:
            r7[r6] = r0
            X.3Z6 r2 = X.AnonymousClass3Z6.A02(r13, r1)
            goto L_0x0049
        L_0x008d:
            boolean r0 = r15.A0B
            if (r0 == 0) goto L_0x009e
            X.3Z6[] r7 = new X.AnonymousClass3Z6[r7]
            X.AnonymousClass3Z6.A09(r9, r3, r7, r8)
            X.AnonymousClass3Z6.A09(r11, r5, r7, r4)
            X.3Z6 r0 = X.AnonymousClass3Z6.A02(r10, r2)
            goto L_0x0086
        L_0x009e:
            boolean r0 = r15.A0A
            if (r0 == 0) goto L_0x00b5
            X.3Z6[] r7 = new X.AnonymousClass3Z6[r7]
            X.AnonymousClass3Z6.A09(r9, r3, r7, r8)
            X.AnonymousClass3Z6.A09(r11, r5, r7, r4)
            X.AnonymousClass3Z6.A09(r13, r2, r7, r6)
            X.AnonymousClass3Z6.A07(r12, r2, r7)
            X.3Z6 r0 = X.AnonymousClass3Z6.A02(r10, r1)
            goto L_0x0050
        L_0x00b5:
            boolean r0 = r15.A0E
            X.3Z6[] r7 = new X.AnonymousClass3Z6[r7]
            if (r0 == 0) goto L_0x00cc
            X.AnonymousClass3Z6.A09(r10, r3, r7, r8)
            X.AnonymousClass3Z6.A09(r9, r5, r7, r4)
            X.AnonymousClass3Z6.A09(r13, r2, r7, r6)
            X.AnonymousClass3Z6.A07(r12, r2, r7)
            X.3Z6 r0 = X.AnonymousClass3Z6.A02(r11, r1)
            goto L_0x0050
        L_0x00cc:
            X.AnonymousClass3Z6.A09(r9, r3, r7, r8)
            X.AnonymousClass3Z6.A09(r11, r5, r7, r4)
            X.AnonymousClass3Z6.A09(r13, r2, r7, r6)
            X.3Z6 r2 = X.AnonymousClass3Z6.A02(r10, r1)
            goto L_0x0049
        L_0x00db:
            r0 = 2147483647(0x7fffffff, float:NaN)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C106135Xt.A01(int):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
        r0 = X.C175708Zk.A02(0, r5.getChildCount());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View A02(android.view.View r5) {
        /*
            r4 = this;
            java.lang.Class<X.4Ny> r1 = X.C87084Ny.class
            if (r5 == 0) goto L_0x0010
            boolean r0 = r1.isInstance(r5)
            if (r0 == 0) goto L_0x0011
            java.lang.Object r5 = r1.cast(r5)
            android.view.View r5 = (android.view.View) r5
        L_0x0010:
            return r5
        L_0x0011:
            boolean r0 = r5 instanceof android.view.ViewGroup
            r3 = 0
            if (r0 == 0) goto L_0x0039
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            if (r5 == 0) goto L_0x0039
            r1 = 0
            int r0 = r5.getChildCount()
            X.8Zj r0 = X.C175708Zk.A02(r1, r0)
            int r2 = r0.A00
            int r1 = r0.A01
            if (r2 > r1) goto L_0x0039
        L_0x0029:
            android.view.View r0 = r5.getChildAt(r2)
            android.view.View r0 = r4.A02(r0)
            if (r0 == 0) goto L_0x0034
            return r0
        L_0x0034:
            if (r2 == r1) goto L_0x0039
            int r2 = r2 + 1
            goto L_0x0029
        L_0x0039:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C106135Xt.A02(android.view.View):android.view.View");
    }

    public final AnonymousClass4PF A03(MenuItem menuItem) {
        View A022 = A02(this.A01);
        if (A022 != null) {
            return (AnonymousClass4PF) A022.findViewById(menuItem.getItemId());
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00d2, code lost:
        if (r1.A01.A0X(6541) == false) goto L_0x00d4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A04(android.content.Context r7, X.C1450774b r8, int r9) {
        /*
            r6 = this;
            X.4P2 r3 = r6.A01
            if (r3 == 0) goto L_0x00a3
            if (r9 < 0) goto L_0x01a1
            X.4SJ r0 = r3.A03
            int r0 = r0.size()
            if (r9 > r0) goto L_0x01a1
            X.4SJ r0 = r3.A03
            android.view.MenuItem r2 = r0.getItem(r9)
            if (r2 == 0) goto L_0x00a3
            boolean r0 = r8 instanceof X.C134686jS
            if (r0 == 0) goto L_0x0152
            X.6jS r8 = (X.C134686jS) r8
            X.74a r1 = r8.A00
            r6.A05(r2, r3, r1)
            boolean r0 = r1 instanceof X.C134656jP
            if (r0 == 0) goto L_0x00a4
            X.6jP r1 = (X.C134656jP) r1
            int r5 = r1.A00
            X.4M1 r2 = A00(r7, r2, r3)
            r2.A03()
            r0 = 1086324736(0x40c00000, float:6.0)
            int r0 = X.AnonymousClass5YI.A04(r7, r0)
            X.5O1 r1 = r2.A09
            X.5dn r4 = r1.A04
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.A0E = r0
            X.5dn r3 = r1.A03
            r3.A0E = r0
            r2.A07()
            r4.A0D = r0
            r3.A0D = r0
            r2.A07()
            r0 = 1090519040(0x41000000, float:8.0)
            int r0 = X.AnonymousClass5YI.A04(r7, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.A0G = r0
            r3.A0G = r0
            r2.A07()
            r4.A0F = r0
            r3.A0F = r0
            r2.A07()
            X.33j r0 = r6.A05
            java.util.Locale r1 = X.C620733j.A02(r0)
            java.util.Locale r0 = r3.A0H
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x007b
            r4.A0H = r1
            r3.A0H = r1
            r2.invalidateSelf()
        L_0x007b:
            r1 = 3
            int r0 = r3.A04
            if (r0 == r1) goto L_0x0087
            r4.A04 = r1
            r3.A04 = r1
            r2.A06()
        L_0x0087:
            r0 = 0
            int r1 = java.lang.Math.max(r0, r5)
            int r0 = r3.A05
            if (r0 == r1) goto L_0x009f
            r4.A05 = r1
            r3.A05 = r1
            X.7Wy r1 = r2.A0A
            r0 = 1
            r1.A03 = r0
            r2.A07()
            r2.invalidateSelf()
        L_0x009f:
            r0 = 1
            r2.A09(r0)
        L_0x00a3:
            return
        L_0x00a4:
            X.6jR r0 = X.C134676jR.A00
            boolean r0 = X.C162457s7.A0P(r1, r0)
            if (r0 == 0) goto L_0x00f6
            boolean r0 = r6.A0F
            if (r0 == 0) goto L_0x015f
            X.4PF r4 = r6.A03(r2)
            if (r4 == 0) goto L_0x00a3
            r0 = 2131428123(0x7f0b031b, float:1.8477882E38)
            android.view.View r1 = r4.findViewById(r0)
            if (r1 != 0) goto L_0x00e8
            int r3 = r6.A02
            r2 = 12
            X.5SY r1 = r6.A06
            boolean r0 = r1.A03
            if (r0 == 0) goto L_0x00d4
            X.1VX r1 = r1.A01
            r0 = 6541(0x198d, float:9.166E-42)
            boolean r1 = r1.A0X(r0)
            r0 = 1
            if (r1 != 0) goto L_0x00d5
        L_0x00d4:
            r0 = 0
        L_0x00d5:
            if (r3 != r2) goto L_0x00ed
            r2 = 2131624196(0x7f0e0104, float:1.8875565E38)
            if (r0 == 0) goto L_0x00df
            r2 = 2131624198(0x7f0e0106, float:1.8875569E38)
        L_0x00df:
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r7)
            r0 = 1
            android.view.View r1 = X.C18310x6.A0I(r1, r4, r2, r0)
        L_0x00e8:
            r0 = 0
            r1.setVisibility(r0)
            return
        L_0x00ed:
            r2 = 2131624195(0x7f0e0103, float:1.8875563E38)
            if (r0 == 0) goto L_0x00df
            r2 = 2131624197(0x7f0e0105, float:1.8875567E38)
            goto L_0x00df
        L_0x00f6:
            X.6jQ r0 = X.C134666jQ.A00
            boolean r0 = X.C162457s7.A0P(r1, r0)
            if (r0 == 0) goto L_0x00a3
            r1 = 0
            X.4PF r2 = r6.A03(r2)
            if (r2 == 0) goto L_0x00a3
            r0 = 2131427717(0x7f0b0185, float:1.8477058E38)
            android.view.View r0 = r2.findViewById(r0)
            if (r0 == 0) goto L_0x0119
            r0.setVisibility(r1)
        L_0x0111:
            X.0AR r0 = r6.A00
            if (r0 == 0) goto L_0x00a3
            r0.start()
            return
        L_0x0119:
            android.content.Context r3 = X.C18290x4.A0F(r3)
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r3)
            r0 = 2131624107(0x7f0e00ab, float:1.8875384E38)
            android.view.View r1 = X.C86664Kz.A0h(r1, r2, r0)
            r0 = 2131427717(0x7f0b0185, float:1.8477058E38)
            android.widget.ImageView r2 = X.AnonymousClass0x9.A0F(r1, r0)
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 21
            if (r1 <= r0) goto L_0x014b
            X.0AR r0 = r6.A00
            if (r0 != 0) goto L_0x0144
            r0 = 2131232045(0x7f08052d, float:1.8080188E38)
            X.0AR r0 = X.AnonymousClass0AR.A04(r3, r0)
            if (r0 == 0) goto L_0x0111
            r6.A00 = r0
        L_0x0144:
            r2.setImageDrawable(r0)
            r0.start()
            goto L_0x0111
        L_0x014b:
            r0 = 2131233942(0x7f080c96, float:1.8084036E38)
            r2.setImageResource(r0)
            goto L_0x0111
        L_0x0152:
            X.6jT r0 = X.C134696jT.A00
            boolean r0 = X.C162457s7.A0P(r8, r0)
            if (r0 == 0) goto L_0x00a3
            r0 = 0
            r6.A05(r2, r3, r0)
            return
        L_0x015f:
            X.4M1 r3 = A00(r7, r2, r3)
            r3.A03()
            r0 = 1073741824(0x40000000, float:2.0)
            int r0 = X.AnonymousClass5YI.A04(r7, r0)
            X.5O1 r1 = r3.A09
            X.5dn r2 = r1.A04
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A0E = r0
            X.5dn r1 = r1.A03
            r1.A0E = r0
            r3.A07()
            r2.A0D = r0
            r1.A0D = r0
            r3.A07()
            r0 = 1086324736(0x40c00000, float:6.0)
            int r0 = X.AnonymousClass5YI.A04(r7, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A0G = r0
            r1.A0G = r0
            r3.A07()
            r2.A0F = r0
            r1.A0F = r0
            r3.A07()
            r0 = 1
            r3.A09(r0)
            return
        L_0x01a1:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Tried to set badge for invalid tab id, index: "
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = ", count: "
            r1.append(r0)
            int r0 = r3.getChildCount()
            java.lang.String r1 = X.AnonymousClass000.A0h(r1, r0)
            com.whatsapp.util.Log.e((java.lang.String) r1)
            r0 = 0
            X.C626936e.A0D(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C106135Xt.A04(android.content.Context, X.74b, int):void");
    }

    public final void A05(MenuItem menuItem, AnonymousClass4P2 r6, C1450674a r7) {
        AnonymousClass4PF A032;
        View findViewById;
        View findViewById2;
        if (!C162457s7.A0P(r7, C134676jR.A00)) {
            AnonymousClass4M1 r0 = (AnonymousClass4M1) r6.A04.A0O.get(menuItem.getItemId());
            if (r0 != null) {
                r0.A09(false);
            }
            AnonymousClass4PF A033 = A03(menuItem);
            if (!(A033 == null || (findViewById2 = A033.findViewById(R.id.bottom_nav_indicator_badge)) == null)) {
                findViewById2.setVisibility(8);
            }
        }
        if (!(r7 instanceof C134656jP)) {
            AnonymousClass4M1 r02 = (AnonymousClass4M1) r6.A04.A0O.get(menuItem.getItemId());
            if (r02 != null) {
                r02.A09(false);
            }
        }
        if (!C162457s7.A0P(r7, C134666jQ.A00) && (A032 = A03(menuItem)) != null && (findViewById = A032.findViewById(R.id.animated_icon)) != null) {
            findViewById.setVisibility(8);
            AnonymousClass0AR r03 = this.A00;
            if (r03 != null) {
                r03.stop();
            }
        }
    }

    public static final AnonymousClass4M1 A00(Context context, MenuItem menuItem, AnonymousClass4P2 r9) {
        int itemId = menuItem.getItemId();
        C87084Ny r3 = r9.A04;
        if (itemId != -1) {
            SparseArray sparseArray = r3.A0O;
            AnonymousClass4M1 r4 = (AnonymousClass4M1) sparseArray.get(itemId);
            if (r4 == null) {
                r4 = new AnonymousClass4M1(r3.getContext(), (C108925dn) null);
                sparseArray.put(itemId, r4);
            }
            if (itemId != -1) {
                AnonymousClass4PF[] r5 = r3.A0M;
                if (r5 != null) {
                    int length = r5.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            break;
                        }
                        AnonymousClass4PF r1 = r5[i];
                        if (r1.getId() == itemId) {
                            r1.setBadge(r4);
                            break;
                        }
                        i++;
                    }
                }
                int A032 = C18300x5.A03(context, R.attr.f3nameremoved, R.color.f5nameremoved);
                AnonymousClass5O1 r12 = r4.A09;
                C108925dn r32 = r12.A04;
                Integer valueOf = Integer.valueOf(A032);
                r32.A0A = valueOf;
                C108925dn r2 = r12.A03;
                r2.A0A = valueOf;
                r4.A04();
                if (r2.A0B.intValue() != 8388661) {
                    r32.A0B = 8388661;
                    r2.A0B = 8388661;
                    r4.A05();
                }
                return r4;
            }
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append(itemId);
            throw AnonymousClass000.A0F(" is not a valid view id", A0o);
        }
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append(itemId);
        throw AnonymousClass000.A0F(" is not a valid view id", A0o2);
    }
}
