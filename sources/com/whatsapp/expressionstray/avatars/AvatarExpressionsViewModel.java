package com.whatsapp.expressionstray.avatars;

import X.AnonymousClass08M;
import X.AnonymousClass0IV;
import X.AnonymousClass0x9;
import X.AnonymousClass1TU;
import X.AnonymousClass1TV;
import X.AnonymousClass20D;
import X.AnonymousClass26V;
import X.AnonymousClass2AN;
import X.AnonymousClass2GI;
import X.AnonymousClass2GJ;
import X.AnonymousClass2TU;
import X.AnonymousClass2UA;
import X.AnonymousClass2UW;
import X.AnonymousClass4GR;
import X.AnonymousClass4J5;
import X.AnonymousClass4J6;
import X.AnonymousClass4UC;
import X.C05550Ty;
import X.C162457s7;
import X.C18260x0;
import X.C18280x3;
import X.C18330xA;
import X.C23551Tr;
import X.C41562Ks;
import X.C43952Uc;
import X.C45952aq;
import X.C47712dh;
import X.C49932hK;
import X.C55862r2;
import X.C56932sn;
import X.C57742u8;
import X.C57752u9;
import X.C58072uf;
import X.C58912w1;
import X.C616131n;
import X.C73853gB;
import X.C831146e;
import X.C832246p;
import X.C84814Du;
import X.C85444Gg;
import X.C85474Gj;
import X.C85524Gp;
import X.C85534Gq;
import com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickers;
import com.whatsapp.util.Log;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class AvatarExpressionsViewModel extends C05550Ty {
    public C85474Gj A00;
    public final AnonymousClass08M A01;
    public final AnonymousClass2UA A02;
    public final C45952aq A03;
    public final C41562Ks A04;
    public final AvatarOnDemandStickers A05;
    public final C55862r2 A06;
    public final C56932sn A07;
    public final C49932hK A08;
    public final AnonymousClass2TU A09;
    public final C58912w1 A0A;
    public final AnonymousClass4UC A0B = AnonymousClass0x9.A0b();
    public final C85444Gg A0C = new C831146e();
    public final C73853gB A0D;
    public final C85534Gq A0E;
    public final C85534Gq A0F;
    public final C85524Gp A0G;

    public static final boolean A00(C43952Uc r5, List list) {
        C23551Tr r2;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AnonymousClass2UW A012 = ((C47712dh) it.next()).A01();
                C43952Uc r0 = null;
                if ((A012 instanceof C23551Tr) && (r2 = (C23551Tr) A012) != null) {
                    r0 = r2.A00;
                }
                if (C162457s7.A0P(r0, r5)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass26V A0D(java.util.List r9, boolean r10) {
        /*
            r8 = this;
            X.4Gp r0 = r8.A0G
            java.lang.Object r2 = r0.getValue()
            X.26V r2 = (X.AnonymousClass26V) r2
            r4 = r9
            java.lang.Object r0 = X.C73723fy.A04(r9)
            X.2dh r0 = (X.C47712dh) r0
            if (r0 == 0) goto L_0x006f
            X.2UW r1 = r0.A01()
            if (r1 == 0) goto L_0x006f
            boolean r0 = r1 instanceof X.C23551Tr
            if (r0 == 0) goto L_0x006f
            X.1Tr r1 = (X.C23551Tr) r1
            if (r1 == 0) goto L_0x006f
            X.2Uc r1 = r1.A00
        L_0x0021:
            boolean r0 = r2 instanceof X.AnonymousClass1TU
            if (r0 == 0) goto L_0x006c
            X.1TU r2 = (X.AnonymousClass1TU) r2
            X.2Uc r3 = r2.A00
            boolean r0 = A00(r3, r9)
            if (r0 == 0) goto L_0x006c
            boolean r7 = r2.A02
        L_0x0031:
            X.1lX r0 = X.C29901lX.A00
            boolean r5 = A00(r0, r9)
            X.1lZ r0 = X.C29921lZ.A00
            boolean r6 = A00(r0, r9)
            boolean r1 = r9.isEmpty()
            r0 = 1
            if (r1 != r0) goto L_0x005c
            if (r10 != r0) goto L_0x0059
            X.4UC r0 = r8.A0B
            java.lang.Object r0 = r0.A07()
            X.39M r0 = (X.AnonymousClass39M) r0
            X.1TS r2 = new X.1TS
            r2.<init>(r0)
        L_0x0053:
            X.08M r0 = r8.A01
            r0.A0G(r2)
            return r2
        L_0x0059:
            X.1TV r2 = X.AnonymousClass1TV.A00
            goto L_0x0053
        L_0x005c:
            if (r1 != 0) goto L_0x0072
            if (r10 == 0) goto L_0x0066
            X.1TT r2 = new X.1TT
            r2.<init>(r9)
            goto L_0x0053
        L_0x0066:
            X.1TU r2 = new X.1TU
            r2.<init>(r3, r4, r5, r6, r7)
            goto L_0x0053
        L_0x006c:
            r3 = r1
            r7 = 0
            goto L_0x0031
        L_0x006f:
            X.1lX r1 = X.C29901lX.A00
            goto L_0x0021
        L_0x0072:
            X.3f1 r0 = X.C73153f1.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.expressionstray.avatars.AvatarExpressionsViewModel.A0D(java.util.List, boolean):X.26V");
    }

    public final void A0E() {
        C85474Gj r0;
        C85474Gj r02 = this.A00;
        if (r02 == null || !r02.BGz() || (r0 = this.A00) == null || r0.BHF()) {
            AnonymousClass4J6 r03 = new AnonymousClass4J6((AnonymousClass4GR) new AvatarExpressionsViewModel$observeEverything$3(this, (C84814Du) null), C57752u9.A00(new AvatarExpressionsViewModel$observeEverything$$inlined$flatMapLatest$1(this, (C84814Du) null), C58072uf.A00(new AnonymousClass4J5(this.A09.A07, 0))), 10);
            C73853gB r3 = this.A0D;
            this.A00 = C57742u8.A00(AnonymousClass0IV.A00(this), AnonymousClass2AN.A00(r3, r03));
            if (this.A0B.A07() == null) {
                C616131n.A02(r3, new AvatarExpressionsViewModel$getLoudlyCryingAvatarSticker$1(this, (C84814Du) null), AnonymousClass0IV.A00(this), (AnonymousClass20D) null, 2);
                return;
            }
            return;
        }
        Log.e("AvatarExpressionsViewModel/data source is still being observed, no need to subscribe again.");
    }

    public final void A0F(AnonymousClass2UW r10) {
        C85524Gp r2 = this.A0G;
        AnonymousClass26V r1 = (AnonymousClass26V) r2.getValue();
        if ((r1 instanceof AnonymousClass1TU) && (r10 instanceof C23551Tr)) {
            AnonymousClass1TU r12 = (AnonymousClass1TU) r1;
            ((C832246p) r2).A04((Object) null, new AnonymousClass1TU(((C23551Tr) r10).A00, r12.A01, r12.A03, r12.A04, false));
        }
    }

    public AvatarExpressionsViewModel(AnonymousClass2GI r4, AnonymousClass2GJ r5, AnonymousClass2UA r6, C45952aq r7, C41562Ks r8, AvatarOnDemandStickers avatarOnDemandStickers, C55862r2 r10, C56932sn r11, C49932hK r12, AnonymousClass2TU r13, C58912w1 r14, C73853gB r15) {
        C18260x0.A0f(r10, r11, r14, r8, r13);
        C162457s7.A0J(r7, 6);
        C18280x3.A15(r12, r4);
        C162457s7.A0J(r5, 11);
        this.A06 = r10;
        this.A07 = r11;
        this.A0A = r14;
        this.A04 = r8;
        this.A09 = r13;
        this.A03 = r7;
        this.A05 = avatarOnDemandStickers;
        this.A02 = r6;
        this.A08 = r12;
        this.A0D = r15;
        AnonymousClass1TV r1 = AnonymousClass1TV.A00;
        this.A0G = new C832246p(r1);
        this.A0E = r5.A00;
        this.A01 = C18330xA.A01(r1);
        this.A0F = r4.A00;
        C57742u8.A01(this, new AvatarExpressionsViewModel$observeAvatarExpressionsSideEffects$1(this, (C84814Du) null), this.A0E);
    }
}
