package X;

/* renamed from: X.4Is  reason: invalid class name and case insensitive filesystem */
public class C86074Is implements AnonymousClass4C9 {
    public Object A00;
    public Object A01;
    public final int A02;

    public C86074Is(AnonymousClass4GR r1, AnonymousClass4C9 r2, int i) {
        this.A02 = i;
        if (11 - i != 0) {
            this.A01 = r2;
            this.A00 = r1;
        } else {
            this.A00 = r2;
            this.A01 = r1;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0023  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.C84814Du r6, int r7) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof X.C74063gW
            if (r0 == 0) goto L_0x0041
            r4 = r6
            X.3gW r4 = (X.C74063gW) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0041
            int r2 = r2 - r1
            r4.label = r2
        L_0x0012:
            java.lang.Object r1 = r4.result
            X.218 r3 = X.AnonymousClass218.COROUTINE_SUSPENDED
            int r0 = r4.label
            r2 = 1
            if (r0 == 0) goto L_0x0023
            if (r0 != r2) goto L_0x0047
            X.C57682u2.A01(r1)
        L_0x0020:
            X.2wD r0 = X.C59022wD.A00
            return r0
        L_0x0023:
            X.C57682u2.A01(r1)
            if (r7 <= 0) goto L_0x0020
            java.lang.Object r1 = r5.A01
            X.3Yv r1 = (X.C69873Yv) r1
            boolean r0 = r1.element
            if (r0 != 0) goto L_0x0020
            r1.element = r2
            java.lang.Object r1 = r5.A00
            X.4C9 r1 = (X.AnonymousClass4C9) r1
            X.20m r0 = X.C369820m.START
            r4.label = r2
            java.lang.Object r0 = r1.B2K(r0, r4)
            if (r0 != r3) goto L_0x0020
            return r3
        L_0x0041:
            X.3gW r4 = new X.3gW
            r4.<init>(r5, r6)
            goto L_0x0012
        L_0x0047:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C86074Is.A00(X.4Du, int):java.lang.Object");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x0448, code lost:
        X.C57682u2.A01(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x05dd, code lost:
        X.C57682u2.A01(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x05e2, code lost:
        return X.C59022wD.A00;
     */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x032e  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x033b  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x036f  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x037c  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x03b1  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x03be  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x03fe  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x040b  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x043b  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x044d  */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x0501  */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x0518  */
    /* JADX WARNING: Removed duplicated region for block: B:241:0x054d  */
    /* JADX WARNING: Removed duplicated region for block: B:246:0x055c  */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x059f  */
    /* JADX WARNING: Removed duplicated region for block: B:263:0x05ae  */
    /* JADX WARNING: Removed duplicated region for block: B:269:0x05dc A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object B2K(java.lang.Object r13, X.C84814Du r14) {
        /*
            r12 = this;
            int r0 = r12.A02
            switch(r0) {
                case 0: goto L_0x0156;
                case 1: goto L_0x01a3;
                case 2: goto L_0x0221;
                case 3: goto L_0x000e;
                case 4: goto L_0x0251;
                case 5: goto L_0x0313;
                case 6: goto L_0x0354;
                case 7: goto L_0x0396;
                case 8: goto L_0x03e3;
                case 9: goto L_0x0420;
                case 10: goto L_0x04e5;
                case 11: goto L_0x0531;
                case 12: goto L_0x0583;
                default: goto L_0x0005;
            }
        L_0x0005:
            int r0 = X.AnonymousClass001.A0K(r13)
            java.lang.Object r5 = r12.A00(r14, r0)
            return r5
        L_0x000e:
            X.2zP r13 = (X.C60932zP) r13
            java.lang.Object r6 = r12.A01
            com.whatsapp.conversation.CommentsBottomSheet r6 = (com.whatsapp.conversation.CommentsBottomSheet) r6
            X.4W9 r0 = r6.A07
            if (r0 != 0) goto L_0x001f
            java.lang.String r0 = "adapter"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x001f:
            java.util.List r5 = r13.A04
            r0.A0L(r5)
            java.lang.Object r1 = r12.A00
            android.view.View r1 = (android.view.View) r1
            int r7 = r13.A00
            r0 = 2131429655(0x7f0b0917, float:1.8480989E38)
            android.view.View r4 = X.C18280x3.A0E(r1, r0)
            r0 = 2131428846(0x7f0b05ee, float:1.8479348E38)
            X.5UY r2 = X.AnonymousClass0x2.A0M(r1, r0)
            r1 = 3
            r0 = 8
            if (r7 != r1) goto L_0x0098
            r4.setVisibility(r0)
            r2.A06(r0)
        L_0x0043:
            boolean r2 = r13.A05
            X.66R r0 = r6.A0Z
            java.lang.Object r1 = r0.getValue()
            android.view.View r1 = (android.view.View) r1
            if (r1 == 0) goto L_0x0056
            int r0 = X.AnonymousClass001.A08(r2)
            r1.setVisibility(r0)
        L_0x0056:
            int r1 = r5.size()
            r0 = 1
            if (r1 != r0) goto L_0x0075
            X.66R r1 = r6.A0Y
            java.lang.Object r0 = r1.getValue()
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            X.0UY r0 = r0.A0R
            if (r0 == 0) goto L_0x05e0
            java.lang.Object r1 = r1.getValue()
            androidx.recyclerview.widget.RecyclerView r1 = (androidx.recyclerview.widget.RecyclerView) r1
            r0 = 0
        L_0x0070:
            r1.setItemAnimator(r0)
            goto L_0x05e0
        L_0x0075:
            if (r1 <= r0) goto L_0x05e0
            X.66R r1 = r6.A0Y
            java.lang.Object r0 = r1.getValue()
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            X.0UY r0 = r0.A0R
            if (r0 != 0) goto L_0x05e0
            java.lang.Object r0 = r1.getValue()
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            int r0 = r0.getScrollState()
            if (r0 != 0) goto L_0x05e0
            java.lang.Object r1 = r1.getValue()
            androidx.recyclerview.widget.RecyclerView r1 = (androidx.recyclerview.widget.RecyclerView) r1
            X.09l r0 = r6.A0R
            goto L_0x0070
        L_0x0098:
            r3 = 1
            r9 = 0
            if (r7 != r3) goto L_0x00ea
            r4.setVisibility(r9)
            r2.A06(r0)
        L_0x00a2:
            android.view.View r1 = r2.A04()
            r0 = 2131428837(0x7f0b05e5, float:1.847933E38)
            android.view.View r4 = r1.findViewById(r0)
            com.whatsapp.WaTextView r4 = (com.whatsapp.WaTextView) r4
            r0 = 2
            r1 = 2131887447(0x7f120557, float:1.9409501E38)
            if (r7 == r0) goto L_0x012b
            r0 = 4
            r1 = 2131888449(0x7f120941, float:1.9411534E38)
            if (r7 == r0) goto L_0x012b
            r0 = 5
            if (r7 == r0) goto L_0x00f1
            r0 = 6
            if (r7 != r0) goto L_0x0043
            X.33j r11 = r6.A0C
            if (r11 == 0) goto L_0x013a
            r10 = 2131755032(0x7f100018, float:1.9140932E38)
            X.1VX r0 = r6.A0I
            if (r0 == 0) goto L_0x0135
            r8 = 4728(0x1278, float:6.625E-42)
            long r0 = X.C56952sp.A06(r0, r8)
            java.lang.Object[] r7 = new java.lang.Object[r3]
            X.1VX r3 = r6.A0I
            if (r3 == 0) goto L_0x0130
            X.2vE r2 = X.C58422vE.A02
            int r2 = r3.A0O(r2, r8)
            X.AnonymousClass000.A1P(r7, r2, r9)
            java.lang.String r0 = r11.A0L(r7, r10, r0)
            r4.setText(r0)
            goto L_0x0043
        L_0x00ea:
            r4.setVisibility(r0)
            r2.A06(r9)
            goto L_0x00a2
        L_0x00f1:
            X.5a2 r8 = r6.A0M
            if (r8 == 0) goto L_0x014f
            android.view.View r0 = r2.A04()
            android.content.Context r7 = r0.getContext()
            android.view.View r0 = r2.A04()
            android.content.Context r2 = r0.getContext()
            r1 = 2131894178(0x7f121fa2, float:1.9423153E38)
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.String r3 = "learn-more"
            java.lang.String r2 = X.AnonymousClass002.A0F(r2, r3, r0, r9, r1)
            r1 = 45
            X.3Zj r0 = new X.3Zj
            r0.<init>(r6, r1)
            android.text.SpannableStringBuilder r0 = r8.A05(r7, r0, r2, r3)
            r4.setText(r0)
            X.1VX r1 = r6.A0I
            if (r1 == 0) goto L_0x014a
            X.33i r0 = r6.A09
            if (r0 == 0) goto L_0x0142
            X.C107295b4.A07(r4, r0, r1)
            goto L_0x0043
        L_0x012b:
            r4.setText(r1)
            goto L_0x0043
        L_0x0130:
            java.lang.RuntimeException r0 = X.C18270x1.A0R()
            throw r0
        L_0x0135:
            java.lang.RuntimeException r0 = X.C18270x1.A0R()
            throw r0
        L_0x013a:
            java.lang.String r0 = "whatsAppLocale"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0142:
            java.lang.String r0 = "systemServices"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x014a:
            java.lang.RuntimeException r0 = X.C18270x1.A0R()
            throw r0
        L_0x014f:
            java.lang.String r0 = "linkifier"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0156:
            X.20T r13 = (X.AnonymousClass20T) r13
            java.lang.Object r6 = r12.A01
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementActivity r6 = (com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementActivity) r6
            java.lang.Object r5 = r12.A00
            com.whatsapp.WaTextView r5 = (com.whatsapp.WaTextView) r5
            X.C162457s7.A0C(r5)
            int r1 = r13.ordinal()
            r0 = 0
            if (r1 == r0) goto L_0x0175
            r0 = 1
            if (r1 != r0) goto L_0x05e0
            r0 = 2131890667(0x7f1211eb, float:1.9416032E38)
            r5.setText(r0)
            goto L_0x05e0
        L_0x0175:
            X.5a2 r4 = r6.A04
            if (r4 == 0) goto L_0x019c
            android.content.Context r3 = r5.getContext()
            r0 = 2131890666(0x7f1211ea, float:1.941603E38)
            java.lang.String r2 = r6.getString(r0)
            r0 = 26
            X.3bu r1 = X.C71313bu.A00(r6, r0)
            java.lang.String r0 = "community_settings_link"
            android.text.SpannableStringBuilder r0 = r4.A05(r3, r1, r2, r0)
            r5.setText(r0)
            X.1VX r0 = r5.getAbProps()
            X.AnonymousClass1Hf.A2C(r5, r6, r0)
            goto L_0x05e0
        L_0x019c:
            java.lang.String r0 = "linkifier"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x01a3:
            X.20S r13 = (X.AnonymousClass20S) r13
            int r2 = r13.ordinal()
            r4 = 0
            r1 = 8
            if (r2 == r4) goto L_0x0209
            r0 = 1
            if (r2 != r0) goto L_0x05e0
            java.lang.Object r0 = r12.A00
            android.view.View r0 = (android.view.View) r0
            r0.setVisibility(r1)
            java.lang.Object r3 = r12.A01
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementActivity r3 = (com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementActivity) r3
            X.66R r0 = r3.A0F
            java.lang.Object r0 = r0.getValue()
            android.view.View r0 = (android.view.View) r0
            r0.setVisibility(r4)
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel r0 = r3.A74()
            X.4Gt r0 = r0.A0O
            java.lang.Object r1 = r0.getValue()
            X.20T r0 = X.AnonymousClass20T.MEMBER
            if (r1 == r0) goto L_0x05e0
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel r0 = r3.A74()
            int r2 = r0.A00
            X.66R r0 = r3.A0D
            java.lang.Object r1 = r0.getValue()
            X.5UY r1 = (X.AnonymousClass5UY) r1
            if (r2 == 0) goto L_0x01ec
            r0 = 8
            r1.A06(r0)
            goto L_0x05e0
        L_0x01ec:
            r1.A06(r4)
            X.66R r0 = r3.A0C
            android.widget.TextView r1 = X.C18280x3.A0G(r0)
            r0 = 2131891228(0x7f12141c, float:1.941717E38)
            r1.setText(r0)
            X.66R r0 = r3.A0B
            android.widget.TextView r1 = X.C18280x3.A0G(r0)
            r0 = 2131891227(0x7f12141b, float:1.9417168E38)
            r1.setText(r0)
            goto L_0x05e0
        L_0x0209:
            java.lang.Object r0 = r12.A00
            android.view.View r0 = (android.view.View) r0
            r0.setVisibility(r4)
            java.lang.Object r0 = r12.A01
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementActivity r0 = (com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementActivity) r0
            X.66R r0 = r0.A0F
            java.lang.Object r0 = r0.getValue()
            android.view.View r0 = (android.view.View) r0
            r0.setVisibility(r1)
            goto L_0x05e0
        L_0x0221:
            X.20T r13 = (X.AnonymousClass20T) r13
            java.lang.Object r4 = r12.A01
            X.4el r4 = (X.C89704el) r4
            java.lang.Object r3 = r12.A00
            androidx.appcompat.widget.Toolbar r3 = (androidx.appcompat.widget.Toolbar) r3
            X.C162457s7.A0C(r3)
            int r2 = r13.ordinal()
            r1 = 0
            r0 = 2131890657(0x7f1211e1, float:1.9416012E38)
            if (r2 == r1) goto L_0x023e
            r0 = 1
            if (r2 != r0) goto L_0x024c
            r0 = 2131890664(0x7f1211e8, float:1.9416026E38)
        L_0x023e:
            X.33j r1 = r4.A00
            X.C162457s7.A0C(r1)
            java.lang.String r0 = X.C18290x4.A0l(r4, r0)
            X.AnonymousClass29F.A00(r4, r3, r1, r0)
            goto L_0x05e0
        L_0x024c:
            X.3f1 r0 = X.C73153f1.A00()
            throw r0
        L_0x0251:
            java.util.Collection r13 = (java.util.Collection) r13
            if (r13 == 0) goto L_0x025b
            boolean r0 = r13.isEmpty()
            if (r0 == 0) goto L_0x029e
        L_0x025b:
            java.lang.Object r2 = r12.A01
            X.10y r2 = (X.C194510y) r2
            X.2yN r0 = r2.A00
            if (r0 != 0) goto L_0x026a
            java.lang.String r0 = "commentListManager"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x026a:
            java.util.concurrent.atomic.AtomicReference r0 = r0.A06
            java.lang.Object r1 = r0.get()
            X.21B r0 = X.AnonymousClass21B.COMPLETE
            if (r1 != r0) goto L_0x029e
            X.4Gp r4 = r2.A0V
        L_0x0276:
            java.lang.Object r3 = r4.getValue()
            r2 = r3
            X.2zP r2 = (X.C60932zP) r2
            r1 = -1
            X.6hI r0 = new X.6hI
            r0.<init>(r1)
            java.util.List r9 = X.C18290x4.A12(r0)
            X.3ZH r7 = r2.A02
            X.34x r8 = r2.A03
            int r10 = r2.A00
            boolean r11 = r2.A05
            X.2lI r6 = r2.A01
            X.2zP r5 = new X.2zP
            r5.<init>(r6, r7, r8, r9, r10, r11)
            boolean r0 = r4.AzD(r3, r5)
            if (r0 == 0) goto L_0x0276
            goto L_0x05e0
        L_0x029e:
            X.C162457s7.A0H(r13)
            boolean r0 = X.C18310x6.A1X(r13)
            if (r0 == 0) goto L_0x05e0
            java.lang.Object r2 = r12.A01
            X.10y r2 = (X.C194510y) r2
            java.util.ArrayList r3 = X.C73783g4.A0c(r13)
            java.util.Iterator r1 = r13.iterator()
        L_0x02b3:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x02c8
            X.34x r0 = X.C18300x5.A0T(r1)
            X.C162457s7.A0H(r0)
            X.7Dc r0 = r2.A0E(r0)
            r3.add(r0)
            goto L_0x02b3
        L_0x02c8:
            java.util.ArrayList r7 = X.AnonymousClass002.A0J(r3)
            X.2sr r0 = r2.A04
            boolean r0 = r0.A0Y()
            if (r0 == 0) goto L_0x02f1
            java.lang.Object r0 = r12.A00
            X.34x r0 = (X.C624134x) r0
            X.2pu r0 = r0.A0t()
            if (r0 == 0) goto L_0x0311
            int r1 = r0.A01()
        L_0x02e2:
            int r0 = r13.size()
            if (r1 <= r0) goto L_0x02f1
            r1 = -1
            X.6hJ r0 = new X.6hJ
            r0.<init>(r1)
            r7.add(r0)
        L_0x02f1:
            X.4Gp r2 = r2.A0V
        L_0x02f3:
            java.lang.Object r1 = r2.getValue()
            r0 = r1
            X.2zP r0 = (X.C60932zP) r0
            X.3ZH r5 = r0.A02
            X.34x r6 = r0.A03
            int r8 = r0.A00
            boolean r9 = r0.A05
            X.2lI r4 = r0.A01
            X.2zP r3 = new X.2zP
            r3.<init>(r4, r5, r6, r7, r8, r9)
            boolean r0 = r2.AzD(r1, r3)
            if (r0 == 0) goto L_0x02f3
            goto L_0x05e0
        L_0x0311:
            r1 = 0
            goto L_0x02e2
        L_0x0313:
            boolean r0 = r14 instanceof X.C74133gd
            if (r0 == 0) goto L_0x0335
            r3 = r14
            X.3gd r3 = (X.C74133gd) r3
            int r2 = r3.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0335
            int r2 = r2 - r1
            r3.label = r2
        L_0x0325:
            java.lang.Object r1 = r3.result
            X.218 r5 = X.AnonymousClass218.COROUTINE_SUSPENDED
            int r0 = r3.label
            r2 = 1
            if (r0 == 0) goto L_0x033b
            if (r0 == r2) goto L_0x0448
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        L_0x0335:
            X.3gd r3 = new X.3gd
            r3.<init>(r12, r14)
            goto L_0x0325
        L_0x033b:
            X.C57682u2.A01(r1)
            java.lang.Object r1 = r12.A00
            X.4C9 r1 = (X.AnonymousClass4C9) r1
            java.util.List r13 = (java.util.List) r13
            java.lang.Object r0 = r12.A01
            com.whatsapp.expressionstray.avatars.AvatarExpressionsViewModel r0 = (com.whatsapp.expressionstray.avatars.AvatarExpressionsViewModel) r0
            X.26V r0 = r0.A0D(r13, r2)
            r3.label = r2
            java.lang.Object r0 = r1.B2K(r0, r3)
            goto L_0x05da
        L_0x0354:
            boolean r0 = r14 instanceof X.C74143ge
            if (r0 == 0) goto L_0x0376
            r4 = r14
            X.3ge r4 = (X.C74143ge) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0376
            int r2 = r2 - r1
            r4.label = r2
        L_0x0366:
            java.lang.Object r1 = r4.result
            X.218 r5 = X.AnonymousClass218.COROUTINE_SUSPENDED
            int r0 = r4.label
            r3 = 1
            if (r0 == 0) goto L_0x037c
            if (r0 == r3) goto L_0x0448
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        L_0x0376:
            X.3ge r4 = new X.3ge
            r4.<init>(r12, r14)
            goto L_0x0366
        L_0x037c:
            X.C57682u2.A01(r1)
            java.lang.Object r2 = r12.A00
            X.4C9 r2 = (X.AnonymousClass4C9) r2
            java.util.List r13 = (java.util.List) r13
            java.lang.Object r1 = r12.A01
            com.whatsapp.expressionstray.avatars.AvatarExpressionsViewModel r1 = (com.whatsapp.expressionstray.avatars.AvatarExpressionsViewModel) r1
            r0 = 0
            X.26V r0 = r1.A0D(r13, r0)
            r4.label = r3
            java.lang.Object r0 = r2.B2K(r0, r4)
            goto L_0x05da
        L_0x0396:
            boolean r0 = r14 instanceof X.C74173gh
            if (r0 == 0) goto L_0x03b8
            r3 = r14
            X.3gh r3 = (X.C74173gh) r3
            int r2 = r3.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x03b8
            int r2 = r2 - r1
            r3.label = r2
        L_0x03a8:
            java.lang.Object r1 = r3.result
            X.218 r5 = X.AnonymousClass218.COROUTINE_SUSPENDED
            int r0 = r3.label
            r2 = 1
            if (r0 == 0) goto L_0x03be
            if (r0 == r2) goto L_0x0448
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        L_0x03b8:
            X.3gh r3 = new X.3gh
            r3.<init>(r12, r14)
            goto L_0x03a8
        L_0x03be:
            X.C57682u2.A01(r1)
            java.lang.Object r1 = r12.A00
            X.4C9 r1 = (X.AnonymousClass4C9) r1
            X.28Q r13 = (X.AnonymousClass28Q) r13
            r0 = 0
            X.C162457s7.A0J(r13, r0)
            boolean r0 = r13 instanceof X.C30131lu
            if (r0 == 0) goto L_0x03e0
            X.1lu r13 = (X.C30131lu) r13
            X.2iT r0 = r13.A00
            java.util.List r0 = r0.A05
            X.C162457s7.A0H(r0)
        L_0x03d8:
            r3.label = r2
            java.lang.Object r0 = r1.B2K(r0, r3)
            goto L_0x05da
        L_0x03e0:
            X.3d3 r0 = X.C72023d3.A00
            goto L_0x03d8
        L_0x03e3:
            boolean r0 = r14 instanceof X.C74183gi
            if (r0 == 0) goto L_0x0405
            r3 = r14
            X.3gi r3 = (X.C74183gi) r3
            int r2 = r3.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0405
            int r2 = r2 - r1
            r3.label = r2
        L_0x03f5:
            java.lang.Object r1 = r3.result
            X.218 r5 = X.AnonymousClass218.COROUTINE_SUSPENDED
            int r0 = r3.label
            r2 = 1
            if (r0 == 0) goto L_0x040b
            if (r0 == r2) goto L_0x0448
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        L_0x0405:
            X.3gi r3 = new X.3gi
            r3.<init>(r12, r14)
            goto L_0x03f5
        L_0x040b:
            X.C57682u2.A01(r1)
            java.lang.Object r1 = r12.A01
            X.4C9 r1 = (X.AnonymousClass4C9) r1
            java.lang.Object r0 = r12.A00
            X.3Z6 r0 = X.AnonymousClass3Z6.A02(r0, r13)
            r3.label = r2
            java.lang.Object r0 = r1.B2K(r0, r3)
            goto L_0x05da
        L_0x0420:
            boolean r0 = r14 instanceof X.C74203gk
            if (r0 == 0) goto L_0x0442
            r7 = r14
            X.3gk r7 = (X.C74203gk) r7
            int r2 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0442
            int r2 = r2 - r1
            r7.label = r2
        L_0x0432:
            java.lang.Object r1 = r7.result
            X.218 r5 = X.AnonymousClass218.COROUTINE_SUSPENDED
            int r0 = r7.label
            r8 = 1
            if (r0 == 0) goto L_0x044d
            if (r0 == r8) goto L_0x0448
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        L_0x0442:
            X.3gk r7 = new X.3gk
            r7.<init>(r12, r14)
            goto L_0x0432
        L_0x0448:
            X.C57682u2.A01(r1)
            goto L_0x05e0
        L_0x044d:
            X.C57682u2.A01(r1)
            java.lang.Object r9 = r12.A00
            X.4C9 r9 = (X.AnonymousClass4C9) r9
            X.2kF r13 = (X.C51702kF) r13
            java.lang.Object r0 = r12.A01
            com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel r0 = (com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel) r0
            X.08M r0 = r0.A06
            java.lang.Object r1 = r0.A07()
            X.26c r1 = (X.C381926c) r1
            r6 = 0
            if (r1 == 0) goto L_0x04dd
            boolean r0 = r1 instanceof X.AnonymousClass1UI
            if (r0 == 0) goto L_0x04a1
            X.1UI r1 = (X.AnonymousClass1UI) r1
            java.util.List r0 = r1.A01
            java.util.ArrayList r6 = X.C73783g4.A0d(r0)
            java.util.Iterator r10 = r0.iterator()
        L_0x0475:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x04dd
            java.lang.Object r4 = r10.next()
            X.26b r4 = (X.AnonymousClass26b) r4
            java.lang.String r1 = r13.A01
            boolean r0 = r4 instanceof X.AnonymousClass1UD
            if (r0 == 0) goto L_0x049d
            r3 = r4
            X.1UD r3 = (X.AnonymousClass1UD) r3
            X.39D r2 = r3.A00
            java.lang.String r0 = r2.A07
            boolean r0 = X.C162457s7.A0P(r0, r1)
            if (r0 == 0) goto L_0x049d
            java.lang.String r1 = r3.A02
            X.39M r0 = r3.A01
            X.1UD r4 = new X.1UD
            r4.<init>(r2, r0, r1, r8)
        L_0x049d:
            r6.add(r4)
            goto L_0x0475
        L_0x04a1:
            boolean r0 = r1 instanceof X.AnonymousClass1UH
            if (r0 == 0) goto L_0x04dd
            X.1UH r1 = (X.AnonymousClass1UH) r1
            java.util.List r0 = r1.A01
            java.util.ArrayList r6 = X.C73783g4.A0d(r0)
            java.util.Iterator r10 = r0.iterator()
        L_0x04b1:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x04dd
            java.lang.Object r4 = r10.next()
            X.26b r4 = (X.AnonymousClass26b) r4
            java.lang.String r1 = r13.A01
            boolean r0 = r4 instanceof X.AnonymousClass1UD
            if (r0 == 0) goto L_0x04d9
            r3 = r4
            X.1UD r3 = (X.AnonymousClass1UD) r3
            X.39D r2 = r3.A00
            java.lang.String r0 = r2.A07
            boolean r0 = X.C162457s7.A0P(r0, r1)
            if (r0 == 0) goto L_0x04d9
            java.lang.String r1 = r3.A02
            X.39M r0 = r3.A01
            X.1UD r4 = new X.1UD
            r4.<init>(r2, r0, r1, r8)
        L_0x04d9:
            r6.add(r4)
            goto L_0x04b1
        L_0x04dd:
            r7.label = r8
            java.lang.Object r0 = r9.B2K(r6, r7)
            goto L_0x05da
        L_0x04e5:
            r2 = r12
            boolean r0 = r14 instanceof X.C74343gy
            if (r0 == 0) goto L_0x0508
            r4 = r14
            X.3gy r4 = (X.C74343gy) r4
            int r3 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L_0x0508
            int r3 = r3 - r1
            r4.label = r3
        L_0x04f8:
            java.lang.Object r3 = r4.result
            X.218 r5 = X.AnonymousClass218.COROUTINE_SUSPENDED
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L_0x0518
            if (r0 != r1) goto L_0x0513
            java.lang.Object r2 = r4.L$0
            X.4Is r2 = (X.C86074Is) r2
            goto L_0x050e
        L_0x0508:
            X.3gy r4 = new X.3gy
            r4.<init>(r12, r14)
            goto L_0x04f8
        L_0x050e:
            X.C57682u2.A01(r3)     // Catch:{ all -> 0x0529 }
            goto L_0x05e0
        L_0x0513:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        L_0x0518:
            X.C57682u2.A01(r3)
            java.lang.Object r0 = r12.A00     // Catch:{ all -> 0x0529 }
            X.4C9 r0 = (X.AnonymousClass4C9) r0     // Catch:{ all -> 0x0529 }
            r4.L$0 = r12     // Catch:{ all -> 0x0529 }
            r4.label = r1     // Catch:{ all -> 0x0529 }
            java.lang.Object r0 = r0.B2K(r13, r4)     // Catch:{ all -> 0x0529 }
            goto L_0x05da
        L_0x0529:
            r1 = move-exception
            java.lang.Object r0 = r2.A01
            X.3Yy r0 = (X.C69903Yy) r0
            r0.element = r1
            throw r1
        L_0x0531:
            boolean r0 = r14 instanceof X.C74353gz
            if (r0 == 0) goto L_0x0556
            r4 = r14
            X.3gz r4 = (X.C74353gz) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0556
            int r2 = r2 - r1
            r4.label = r2
        L_0x0543:
            java.lang.Object r6 = r4.result
            X.218 r5 = X.AnonymousClass218.COROUTINE_SUSPENDED
            int r0 = r4.label
            r3 = 2
            r2 = 1
            if (r0 == 0) goto L_0x055c
            if (r0 == r2) goto L_0x0572
            if (r0 == r3) goto L_0x05dd
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        L_0x0556:
            X.3gz r4 = new X.3gz
            r4.<init>(r12, r14)
            goto L_0x0543
        L_0x055c:
            X.C57682u2.A01(r6)
            java.lang.Object r1 = r12.A00
            X.4C9 r1 = (X.AnonymousClass4C9) r1
            java.lang.Object r0 = r12.A01
            X.4GR r0 = (X.AnonymousClass4GR) r0
            r4.L$0 = r1
            r4.label = r2
            java.lang.Object r6 = r0.invoke(r13, r4)
            if (r6 != r5) goto L_0x0579
            return r5
        L_0x0572:
            java.lang.Object r1 = r4.L$0
            X.4C9 r1 = (X.AnonymousClass4C9) r1
            X.C57682u2.A01(r6)
        L_0x0579:
            r0 = 0
            r4.L$0 = r0
            r4.label = r3
            java.lang.Object r0 = r1.B2K(r6, r4)
            goto L_0x05da
        L_0x0583:
            boolean r0 = r14 instanceof X.C74523hG
            if (r0 == 0) goto L_0x05a8
            r4 = r14
            X.3hG r4 = (X.C74523hG) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x05a8
            int r2 = r2 - r1
            r4.label = r2
        L_0x0595:
            java.lang.Object r6 = r4.result
            X.218 r5 = X.AnonymousClass218.COROUTINE_SUSPENDED
            int r0 = r4.label
            r3 = 2
            r2 = 1
            if (r0 == 0) goto L_0x05ae
            if (r0 == r2) goto L_0x05c6
            if (r0 == r3) goto L_0x05dd
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        L_0x05a8:
            X.3hG r4 = new X.3hG
            r4.<init>(r12, r14)
            goto L_0x0595
        L_0x05ae:
            X.C57682u2.A01(r6)
            java.lang.Object r1 = r12.A01
            X.4C9 r1 = (X.AnonymousClass4C9) r1
            java.lang.Object r0 = r12.A00
            X.4GR r0 = (X.AnonymousClass4GR) r0
            r4.L$0 = r13
            r4.L$1 = r1
            r4.label = r2
            java.lang.Object r0 = r0.invoke(r13, r4)
            if (r0 != r5) goto L_0x05cf
            return r5
        L_0x05c6:
            java.lang.Object r1 = r4.L$1
            X.4C9 r1 = (X.AnonymousClass4C9) r1
            java.lang.Object r13 = r4.L$0
            X.C57682u2.A01(r6)
        L_0x05cf:
            r0 = 0
            r4.L$0 = r0
            r4.L$1 = r0
            r4.label = r3
            java.lang.Object r0 = r1.B2K(r13, r4)
        L_0x05da:
            if (r0 != r5) goto L_0x05e0
            return r5
        L_0x05dd:
            X.C57682u2.A01(r6)
        L_0x05e0:
            X.2wD r5 = X.C59022wD.A00
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C86074Is.B2K(java.lang.Object, X.4Du):java.lang.Object");
    }

    public C86074Is(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A01 = obj2;
        this.A00 = obj;
    }
}
