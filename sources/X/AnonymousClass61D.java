package X;

/* renamed from: X.61D  reason: invalid class name */
public final class AnonymousClass61D extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ C93124nw this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass61D(C93124nw r2) {
        super(1);
        this.this$0 = r2;
    }

    /* JADX WARNING: type inference failed for: r7v3, types: [X.74Y] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r16) {
        /*
            r15 = this;
            r4 = r16
            java.util.List r4 = (java.util.List) r4
            X.4nw r1 = r15.this$0
            X.C162457s7.A0H(r4)
            boolean r0 = r1 instanceof X.C92744nB
            if (r0 == 0) goto L_0x0089
            r8 = 0
            X.C162457s7.A0J(r4, r8)
            java.util.Iterator r7 = r4.iterator()
            r6 = 0
        L_0x0016:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x003a
            java.lang.Object r5 = r7.next()
            X.74Y r5 = (X.AnonymousClass74Y) r5
            boolean r0 = r5 instanceof X.C134276ik
            if (r0 == 0) goto L_0x0016
            android.content.res.Resources r4 = r1.getResources()
            r3 = 2131889410(0x7f120d02, float:1.9413483E38)
            java.lang.Object[] r2 = X.AnonymousClass002.A0L()
            X.6ik r5 = (X.C134276ik) r5
            java.lang.String r0 = r5.A00
            java.lang.String r6 = X.C18320x8.A0b(r4, r0, r2, r8, r3)
            goto L_0x0016
        L_0x003a:
            android.content.res.Resources r2 = r1.getResources()
            r0 = 2131889412(0x7f120d04, float:1.9413487E38)
            java.lang.String r4 = X.C86624Kv.A0a(r2, r0)
            android.content.res.Resources r2 = r1.getResources()
            r0 = 2131887158(0x7f120436, float:1.9408915E38)
            java.lang.String r3 = X.C86624Kv.A0a(r2, r0)
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0l(r4)
            java.lang.String r2 = " • "
            java.lang.String r0 = X.AnonymousClass000.A0V(r2, r3, r0)
            if (r6 == 0) goto L_0x0060
            java.lang.String r0 = X.C18260x0.A06(r6, r2, r0)
        L_0x0060:
            r1.setTrustSignals(r0)
            com.whatsapp.TextEmojiLabel r6 = r1.A0B
            java.lang.String r0 = r1.A06
            r6.setText(r0)
            com.facebook.shimmer.ShimmerFrameLayout r0 = r1.A0A
            r0.A03()
            r2 = 8
            r0.setVisibility(r2)
            r6.setVisibility(r8)
            com.whatsapp.wds.components.button.WDSButton r0 = r1.A0H
            r0.setVisibility(r2)
            X.33j r7 = r1.A0M
            int r11 = X.C86654Ky.A05(r1)
            r10 = r8
            r9 = r8
            X.C107555bV.A07(r6, r7, r8, r9, r10, r11)
            goto L_0x01a1
        L_0x0089:
            r11 = 0
            X.C162457s7.A0J(r4, r11)
            android.content.res.Resources r2 = r1.getResources()
            r0 = 2131889411(0x7f120d03, float:1.9413485E38)
            java.lang.String r3 = X.C86624Kv.A0a(r2, r0)
            java.util.Iterator r9 = r4.iterator()
            r5 = 0
            r4 = r5
        L_0x009e:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x013a
            java.lang.Object r7 = r9.next()
            X.74Y r7 = (X.AnonymousClass74Y) r7
            boolean r0 = r7 instanceof X.C134286il
            if (r0 == 0) goto L_0x00b8
            com.whatsapp.WaTextView r2 = r1.A06
            X.6il r7 = (X.C134286il) r7
            java.lang.String r0 = r7.A00
            r2.setText(r0)
            goto L_0x009e
        L_0x00b8:
            boolean r0 = r7 instanceof X.C134276ik
            r8 = 1
            if (r0 == 0) goto L_0x00cf
            android.content.res.Resources r6 = r1.getResources()
            r5 = 2131889410(0x7f120d02, float:1.9413483E38)
            java.lang.Object[] r2 = new java.lang.Object[r8]
            X.6ik r7 = (X.C134276ik) r7
            java.lang.String r0 = r7.A00
            java.lang.String r5 = X.C18320x8.A0b(r6, r0, r2, r11, r5)
            goto L_0x009e
        L_0x00cf:
            boolean r0 = r7 instanceof X.C134266ij
            if (r0 == 0) goto L_0x009e
            r4 = r7
            X.6ij r4 = (X.C134266ij) r4
            X.5XS r7 = r4.A00
            X.5XY r0 = r7.A02
            java.lang.String r2 = r0.A03
            X.5Qj r0 = r1.A0D
            boolean r0 = r0.A07
            if (r0 == 0) goto L_0x0128
            int r0 = r2.length()
            if (r0 <= 0) goto L_0x0128
            int r0 = r7.A00
            if (r0 != r8) goto L_0x010e
            android.content.res.Resources r6 = r1.getResources()
            r3 = 2131893855(0x7f121e5f, float:1.9422498E38)
            java.lang.Object[] r2 = new java.lang.Object[r8]
            X.5XY r0 = r7.A02
            java.lang.String r0 = r0.A03
            r2[r11] = r0
        L_0x00fb:
            java.lang.String r3 = r6.getString(r3, r2)
            X.C162457s7.A0D(r3)
        L_0x0102:
            int r0 = r7.A01
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r0 = 9
            r1.A27(r0, r2)
            goto L_0x009e
        L_0x010e:
            if (r0 <= r8) goto L_0x0102
            android.content.res.Resources r6 = r1.getResources()
            r3 = 2131890888(0x7f1212c8, float:1.941648E38)
            java.lang.Object[] r2 = X.AnonymousClass002.A0M()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r2[r11] = r0
            X.5XY r0 = r7.A02
            java.lang.String r0 = r0.A03
            r2[r8] = r0
            goto L_0x00fb
        L_0x0128:
            android.content.res.Resources r3 = r1.getResources()
            r2 = 2131755034(0x7f10001a, float:1.9140936E38)
            int r0 = r7.A00
            java.lang.String r3 = X.AnonymousClass0x2.A0Y(r3, r0, r11, r2)
            X.C162457s7.A0D(r3)
            goto L_0x009e
        L_0x013a:
            android.content.res.Resources r2 = r1.getResources()
            r0 = 2131889412(0x7f120d04, float:1.9413487E38)
            java.lang.String r2 = X.C86624Kv.A0a(r2, r0)
            java.lang.String r0 = " • "
            if (r5 == 0) goto L_0x014d
            java.lang.String r2 = X.C18260x0.A06(r5, r0, r2)
        L_0x014d:
            r1.A06 = r2
            java.lang.String r0 = X.C18260x0.A06(r2, r0, r3)
            r1.A06 = r0
            r2 = 8
            com.whatsapp.TextEmojiLabel r9 = r1.A0B
            if (r4 == 0) goto L_0x01ee
            X.5a2 r3 = r1.A20
            android.content.Context r4 = r9.getContext()
            java.lang.String r6 = r1.A06
            java.lang.String r7 = "common-group"
            int r8 = X.AnonymousClass5Yj.A04(r1)
            r0 = 36
            X.5rM r5 = X.C117085rM.A00(r1, r0)
            android.text.SpannableStringBuilder r0 = r3.A06(r4, r5, r6, r7, r8)
            r9.setText(r0)
            X.33i r0 = r1.A0L
            X.AnonymousClass0x2.A12(r9, r0)
            X.1VX r0 = r1.A0O
            X.C18270x1.A0q(r9, r0)
            X.5Qj r0 = r1.A0D
            boolean r0 = r0.A07
            if (r0 == 0) goto L_0x0196
            com.whatsapp.wds.components.button.WDSButton r0 = r1.A0H
            r0.setVisibility(r2)
            X.33j r10 = r1.A0M
            int r14 = X.C86654Ky.A05(r1)
            r13 = r11
            r12 = r11
            X.C107555bV.A07(r9, r10, r11, r12, r13, r14)
        L_0x0196:
            com.facebook.shimmer.ShimmerFrameLayout r0 = r1.A0A
            r0.A03()
            r0.setVisibility(r2)
            r9.setVisibility(r11)
        L_0x01a1:
            X.4nw r1 = r15.this$0
            boolean r0 = r1.A08
            if (r0 != 0) goto L_0x01eb
            r0 = 1
            r1.A08 = r0
            X.34x r0 = r1.A0S
            X.2z0 r0 = r0.A1J
            X.4uZ r0 = r0.A00
            if (r0 == 0) goto L_0x01eb
            X.5Qj r8 = r1.A0D
            X.4UP r7 = r1.A0E
            java.lang.String r6 = r0.toString()
            X.33p r5 = r8.A01
            java.lang.String r4 = "fmx_card_view_pending_chats"
            android.content.SharedPreferences r1 = X.AnonymousClass0x2.A0F(r5)
            java.util.HashSet r0 = X.AnonymousClass002.A0K()
            java.util.Set r3 = r1.getStringSet(r4, r0)
            X.C626936e.A06(r3)
            X.C162457s7.A0D(r3)
            boolean r0 = r3.contains(r6)
            if (r0 == 0) goto L_0x01eb
            r2 = 0
            r1 = 7
            r0 = 0
            r8.A01(r7, r2, r1, r0)
            java.util.Set r1 = X.C73823g8.A02(r6, r3)
            android.content.SharedPreferences$Editor r0 = X.C18270x1.A03(r5)
            android.content.SharedPreferences$Editor r0 = r0.putStringSet(r4, r1)
            r0.apply()
        L_0x01eb:
            X.2wD r0 = X.C59022wD.A00
            return r0
        L_0x01ee:
            r9.setText(r0)
            goto L_0x0196
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass61D.invoke(java.lang.Object):java.lang.Object");
    }
}
