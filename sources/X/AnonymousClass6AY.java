package X;

/* renamed from: X.6AY  reason: invalid class name */
public class AnonymousClass6AY implements AnonymousClass4C9 {
    public Object A00;
    public final int A01;

    public AnonymousClass6AY(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v26, resolved type: X.4Rm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v31, resolved type: X.4Ro} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v43, resolved type: X.4Rm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v44, resolved type: X.4Rm} */
    /* JADX WARNING: type inference failed for: r12v2, types: [X.4rD] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object B2K(java.lang.Object r19, X.C84814Du r20) {
        /*
            r18 = this;
            r1 = r19
            r3 = r18
            int r0 = r3.A01
            switch(r0) {
                case 0: goto L_0x0015;
                case 1: goto L_0x0269;
                case 2: goto L_0x02a9;
                default: goto L_0x0009;
            }
        L_0x0009:
            X.5Nd r1 = (X.C103485Nd) r1
            java.lang.Object r2 = r1.A01
            monitor-enter(r2)
            boolean r0 = r1.A00     // Catch:{ all -> 0x0012 }
            goto L_0x02d4
        L_0x0012:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x0015:
            X.5Aw r1 = (X.C100425Aw) r1
            java.lang.Object r11 = r3.A00
            com.whatsapp.expressionstray.emoji.EmojiExpressionsFragment r11 = (com.whatsapp.expressionstray.emoji.EmojiExpressionsFragment) r11
            boolean r0 = r1 instanceof X.AnonymousClass4r0
            if (r0 == 0) goto L_0x0084
            X.4r0 r1 = (X.AnonymousClass4r0) r1
            int[] r6 = r1.A01
            X.1VX r0 = r11.A02
            r5 = 6653(0x19fd, float:9.323E-42)
            boolean r0 = r0.A0X(r5)
            int r4 = r1.A00
            r2 = r4
            if (r0 == 0) goto L_0x0036
            int r0 = r11.A1U()
            int r2 = r4 / r0
        L_0x0036:
            com.whatsapp.AutoFitGridRecyclerView r0 = r11.A08
            r3 = 0
            if (r0 == 0) goto L_0x0082
            X.0Ua r2 = r0.A0F(r2)
        L_0x003f:
            X.1VX r0 = r11.A02
            boolean r0 = r0.A0X(r5)
            if (r0 == 0) goto L_0x007d
            if (r2 == 0) goto L_0x007b
            android.view.View r2 = r2.A0H
        L_0x004b:
            boolean r0 = r2 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x0079
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
        L_0x0051:
            int r0 = r11.A1U()
            int r4 = r4 % r0
            if (r2 == 0) goto L_0x0304
            android.view.View r3 = r2.getChildAt(r4)
        L_0x005c:
            if (r3 == 0) goto L_0x0304
            X.5Y0 r5 = r11.A0C
            if (r5 == 0) goto L_0x00e5
            r7 = 1
            r0 = 2
            X.5au r4 = new X.5au
            r4.<init>(r1, r0, r11)
            X.4Ro r2 = new X.4Ro
            r2.<init>(r3, r4, r5, r6, r7)
            r11.A09 = r2
        L_0x0070:
            android.view.View r0 = r11.A0B
            if (r0 == 0) goto L_0x0304
            X.C106825aE.A00(r3, r0, r2)
            goto L_0x0304
        L_0x0079:
            r2 = r3
            goto L_0x0051
        L_0x007b:
            r2 = r3
            goto L_0x004b
        L_0x007d:
            if (r2 == 0) goto L_0x0304
            android.view.View r3 = r2.A0H
            goto L_0x005c
        L_0x0082:
            r2 = r3
            goto L_0x003f
        L_0x0084:
            boolean r0 = r1 instanceof X.AnonymousClass4r1
            if (r0 == 0) goto L_0x00f3
            X.4r1 r1 = (X.AnonymousClass4r1) r1
            int[] r6 = r1.A01
            X.1VX r0 = r11.A02
            r5 = 6653(0x19fd, float:9.323E-42)
            boolean r0 = r0.A0X(r5)
            int r4 = r1.A00
            r2 = r4
            if (r0 == 0) goto L_0x009f
            int r0 = r11.A1U()
            int r2 = r4 / r0
        L_0x009f:
            com.whatsapp.AutoFitGridRecyclerView r0 = r11.A08
            r3 = 0
            if (r0 == 0) goto L_0x00e3
            X.0Ua r2 = r0.A0F(r2)
        L_0x00a8:
            X.1VX r0 = r11.A02
            boolean r0 = r0.A0X(r5)
            if (r0 == 0) goto L_0x00de
            if (r2 == 0) goto L_0x00dc
            android.view.View r2 = r2.A0H
        L_0x00b4:
            boolean r0 = r2 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x00da
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
        L_0x00ba:
            int r0 = r11.A1U()
            int r4 = r4 % r0
            if (r2 == 0) goto L_0x0304
            android.view.View r3 = r2.getChildAt(r4)
        L_0x00c5:
            if (r3 == 0) goto L_0x0304
            r0 = 3
            X.5au r4 = new X.5au
            r4.<init>(r1, r0, r11)
            X.5Y0 r5 = r11.A0C
            if (r5 == 0) goto L_0x00ec
            r7 = 1
            X.4Rm r2 = new X.4Rm
            r2.<init>(r3, r4, r5, r6, r7)
            r11.A0B = r2
            goto L_0x0070
        L_0x00da:
            r2 = r3
            goto L_0x00ba
        L_0x00dc:
            r2 = r3
            goto L_0x00b4
        L_0x00de:
            if (r2 == 0) goto L_0x0304
            android.view.View r3 = r2.A0H
            goto L_0x00c5
        L_0x00e3:
            r2 = r3
            goto L_0x00a8
        L_0x00e5:
            java.lang.String r0 = "emojiLoader"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x00ec:
            java.lang.String r0 = "emojiLoader"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x00f3:
            boolean r0 = r1 instanceof X.AnonymousClass4r2
            if (r0 == 0) goto L_0x019e
            X.4r2 r1 = (X.AnonymousClass4r2) r1
            int r14 = r1.A00
            int[] r4 = r1.A01
            android.view.View r13 = r11.A03
            if (r13 == 0) goto L_0x0304
            r0 = 2131427695(0x7f0b016f, float:1.8477014E38)
            android.view.View r9 = X.C18290x4.A0M(r13, r0)
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9
            r9.removeAllViews()
            android.content.res.Resources r1 = X.C08310eF.A09(r11)
            r0 = 2131166390(0x7f0704b6, float:1.7947024E38)
            int r8 = r1.getDimensionPixelSize(r0)
            android.content.res.Resources r1 = X.C08310eF.A09(r11)
            r0 = 2131166388(0x7f0704b4, float:1.794702E38)
            int r0 = X.C86664Kz.A09(r1, r0, r8)
            int r7 = r0 / 2
            int[][] r6 = X.C107425bI.A0A(r4)
            X.C162457s7.A0H(r6)
            int r5 = r6.length
            r15 = 0
            r3 = 0
        L_0x012f:
            if (r3 >= r5) goto L_0x0162
            r12 = r6[r3]
            android.widget.ImageView r2 = X.C86614Ku.A0H(r13)
            r2.setPadding(r7, r7, r7, r7)
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.FIT_CENTER
            r2.setScaleType(r0)
            X.C86624Kv.A0t(r2, r8)
            X.5Y0 r1 = r11.A0C
            if (r1 == 0) goto L_0x015b
            android.content.res.Resources r0 = X.C08310eF.A09(r11)
            X.AnonymousClass5Y0.A00(r0, r2, r1, r12)
            X.5eo r10 = new X.5eo
            r10.<init>(r11, r12, r13, r14, r15)
            r2.setOnClickListener(r10)
            r9.addView(r2)
            int r3 = r3 + 1
            goto L_0x012f
        L_0x015b:
            java.lang.String r0 = "emojiLoader"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0162:
            r0 = 2131433208(0x7f0b16f8, float:1.8488195E38)
            android.view.View r2 = X.C18290x4.A0M(r13, r0)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r2.setPadding(r7, r7, r7, r7)
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.FIT_CENTER
            r2.setScaleType(r0)
            X.5Y0 r1 = r11.A0C
            if (r1 == 0) goto L_0x0197
            android.content.res.Resources r0 = X.C08310eF.A09(r11)
            X.AnonymousClass5Y0.A00(r0, r2, r1, r4)
            r0 = 2131431928(0x7f0b11f8, float:1.84856E38)
            android.view.View r1 = r13.findViewById(r0)
            r0 = 5
            X.C635339p.A00(r1, r13, r0)
            r1 = 6
            X.39p r0 = new X.39p
            r0.<init>((java.lang.Object) r13, (int) r1)
            r13.setOnClickListener(r0)
            r13.setVisibility(r15)
            goto L_0x0304
        L_0x0197:
            java.lang.String r0 = "emojiLoader"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x019e:
            boolean r0 = r1 instanceof X.C94354r3
            if (r0 == 0) goto L_0x0304
            X.4r3 r1 = (X.C94354r3) r1
            int r5 = r1.A00
            int[] r4 = r1.A01
            X.1VX r1 = r11.A02
            r0 = 6653(0x19fd, float:9.323E-42)
            boolean r0 = r1.A0X(r0)
            r6 = 0
            r12 = 0
            if (r0 == 0) goto L_0x01ee
            int r0 = r11.A1U()
            int r2 = r5 / r0
            X.4WC r0 = r11.A0D
            if (r0 == 0) goto L_0x01ec
            X.0Tk r0 = r0.A01
            java.util.List r0 = r0.A02
            if (r0 == 0) goto L_0x01ec
            java.util.ArrayList r12 = X.AnonymousClass002.A0J(r0)
            java.lang.Object r3 = r12.get(r2)
            X.5MX r3 = (X.AnonymousClass5MX) r3
        L_0x01ce:
            boolean r0 = r3 instanceof X.AnonymousClass4rE
            if (r0 == 0) goto L_0x0245
            X.4rE r3 = (X.AnonymousClass4rE) r3
            if (r3 == 0) goto L_0x0245
            int[][] r1 = r3.A04
            int r0 = r11.A1U()
            int r5 = r5 % r0
            r0 = r1[r5]
            boolean r0 = java.util.Arrays.equals(r0, r4)
            if (r0 == 0) goto L_0x0214
            java.lang.String r0 = "Emoji are the same, not updating"
        L_0x01e7:
            com.whatsapp.util.Log.d((java.lang.String) r0)
            goto L_0x0304
        L_0x01ec:
            r3 = r12
            goto L_0x01ce
        L_0x01ee:
            X.4WC r0 = r11.A0D
            if (r0 == 0) goto L_0x0304
            X.0Tk r0 = r0.A01
            java.util.List r0 = r0.A02
            if (r0 == 0) goto L_0x0304
            java.util.ArrayList r3 = X.AnonymousClass002.A0J(r0)
            java.lang.Object r2 = r3.get(r5)
            boolean r0 = r2 instanceof X.C94404rD
            if (r0 == 0) goto L_0x025d
            X.4rD r2 = (X.C94404rD) r2
            if (r2 == 0) goto L_0x025d
            int[] r0 = r2.A04
            boolean r1 = java.util.Arrays.equals(r0, r4)
            r0 = 1
            if (r1 != r0) goto L_0x024c
            java.lang.String r0 = "Emoji is the same, not updating item"
            goto L_0x01e7
        L_0x0214:
            X.3ch r0 = new X.3ch
            r0.<init>(r1, r6)
            java.util.ArrayList r1 = X.AnonymousClass002.A0J(r0)
            r1.set(r5, r4)
            int[][] r0 = new int[r6][]
            java.lang.Object[] r8 = r1.toArray(r0)
            int[][] r8 = (int[][]) r8
            int[][] r7 = r3.A03
            X.5Y0 r4 = r3.A00
            java.lang.Integer r6 = r3.A02
            X.5SX r5 = r3.A01
            r0 = 1
            X.C162457s7.A0J(r8, r0)
            X.4rE r3 = new X.4rE
            r3.<init>(r4, r5, r6, r7, r8)
            r12.set(r2, r3)
            X.4WC r0 = r11.A0D
            if (r0 == 0) goto L_0x0304
            r0.A0L(r12)
            goto L_0x0304
        L_0x0245:
            java.lang.String r0 = "Unable to identify current emoji row to update skin tone."
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x0304
        L_0x024c:
            int[] r0 = r2.A03
            X.5Y0 r13 = r2.A00
            java.lang.Integer r15 = r2.A02
            X.5SX r14 = r2.A01
            X.4rD r12 = new X.4rD
            r16 = r0
            r17 = r4
            r12.<init>(r13, r14, r15, r16, r17)
        L_0x025d:
            r3.set(r5, r12)
            X.4WC r0 = r11.A0D
            if (r0 == 0) goto L_0x0304
            r0.A0L(r3)
            goto L_0x0304
        L_0x0269:
            X.5Ax r1 = (X.C100435Ax) r1
            boolean r0 = r1 instanceof X.C94364r4
            if (r0 == 0) goto L_0x02a3
            java.lang.Object r4 = r3.A00
            com.whatsapp.expressionstray.emoji.EmojiExpressionsFragment r4 = (com.whatsapp.expressionstray.emoji.EmojiExpressionsFragment) r4
            X.4WC r2 = r4.A0D
            if (r2 == 0) goto L_0x027f
            r0 = r1
            X.4r4 r0 = (X.C94364r4) r0
            java.util.List r0 = r0.A01
            r2.A0L(r0)
        L_0x027f:
            androidx.recyclerview.widget.RecyclerView r3 = r4.A07
            if (r3 == 0) goto L_0x0297
            r4.A1D()
            r0 = r1
            X.4r4 r0 = (X.C94364r4) r0
            java.util.List r0 = r0.A02
            int r2 = r0.size()
            androidx.recyclerview.widget.GridLayoutManager r0 = new androidx.recyclerview.widget.GridLayoutManager
            r0.<init>(r2)
            r3.setLayoutManager(r0)
        L_0x0297:
            X.4WB r2 = r4.A0F
            if (r2 == 0) goto L_0x0304
            X.4r4 r1 = (X.C94364r4) r1
            java.util.List r0 = r1.A02
            r2.A0L(r0)
            goto L_0x0304
        L_0x02a3:
            X.4r5 r0 = X.AnonymousClass4r5.A00
            X.C162457s7.A0P(r1, r0)
            goto L_0x0304
        L_0x02a9:
            java.lang.Object r3 = r3.A00
            X.0eF r3 = (X.C08310eF) r3
            boolean r0 = r1 instanceof X.C988553m
            if (r0 == 0) goto L_0x02c4
            r2 = 2131891130(0x7f1213ba, float:1.9416971E38)
        L_0x02b4:
            X.03q r1 = r3.A0Q()
            boolean r0 = r1 instanceof X.C89654ea
            if (r0 == 0) goto L_0x0304
            X.4ea r1 = (X.C89654ea) r1
            if (r1 == 0) goto L_0x0304
            r1.Bot(r2)
            goto L_0x0304
        L_0x02c4:
            boolean r0 = r1 instanceof X.C988453l
            if (r0 == 0) goto L_0x02cc
            r2 = 2131889415(0x7f120d07, float:1.9413493E38)
            goto L_0x02b4
        L_0x02cc:
            boolean r0 = r1 instanceof X.C988653n
            if (r0 == 0) goto L_0x0309
            r2 = 2131894592(0x7f122140, float:1.9423993E38)
            goto L_0x02b4
        L_0x02d4:
            monitor-exit(r2)
            if (r0 != 0) goto L_0x0304
            java.lang.String r2 = r1.A00()
            java.lang.Object r4 = r3.A00
            com.whatsapp.updates.viewmodels.SearchUsecase r4 = (com.whatsapp.updates.viewmodels.SearchUsecase) r4
            X.5Nd r0 = r4.A02
            r3 = 0
            if (r0 == 0) goto L_0x0307
            java.lang.String r0 = r0.A00()
        L_0x02e8:
            boolean r0 = X.C162457s7.A0P(r2, r0)
            if (r0 == 0) goto L_0x0304
            java.lang.String r0 = r1.A00()
            boolean r0 = X.C175738Zn.A0V(r0)
            if (r0 != 0) goto L_0x0304
            X.2se r2 = r4.A08
            java.lang.String r0 = r1.A00()
            X.6nC r0 = r2.A01(r4, r0, r3)
            r4.A01 = r0
        L_0x0304:
            X.2wD r0 = X.C59022wD.A00
            return r0
        L_0x0307:
            r0 = r3
            goto L_0x02e8
        L_0x0309:
            X.3f1 r0 = X.C73153f1.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6AY.B2K(java.lang.Object, X.4Du):java.lang.Object");
    }
}
