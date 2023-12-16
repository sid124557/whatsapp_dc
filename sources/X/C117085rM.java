package X;

/* renamed from: X.5rM  reason: invalid class name and case insensitive filesystem */
public class C117085rM implements Runnable {
    public Object A00;
    public final int A01;

    public C117085rM(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static C117085rM A00(Object obj, int i) {
        return new C117085rM(obj, i);
    }

    public static void A01(AnonymousClass4FS r1, Object obj, int i) {
        r1.BkM(new C117085rM(obj, i));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: X.4mx} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v20, resolved type: X.4o1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v213, resolved type: X.4mN} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v21, resolved type: X.4mx} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v22, resolved type: X.4mx} */
    /* JADX WARNING: type inference failed for: r3v28, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0318, code lost:
        if (r4.A09.A0a(r2.A0P.A0E) == false) goto L_0x031a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x0588, code lost:
        r0 = r0.A0V;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x058a, code lost:
        monitor-enter(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:?, code lost:
        r5 = r6.A01();
        r4 = X.AnonymousClass000.A0X("_actions", X.AnonymousClass000.A0l(r0.getRawString()));
        X.C18270x1.A0j(r5.edit(), r4, java.lang.Long.toString(X.C615531h.A03(r5.getString(r4, "0")) + 1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x05b5, code lost:
        monitor-exit(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x05b6, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x016b, code lost:
        if (r2 != null) goto L_0x016d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01b2, code lost:
        r2.A0S(new X.C71333bw(r4, r1, r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01ba, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r14 = this;
            int r0 = r14.A01
            switch(r0) {
                case 0: goto L_0x02f7;
                case 1: goto L_0x05ec;
                case 2: goto L_0x05e4;
                case 3: goto L_0x02d4;
                case 4: goto L_0x05d8;
                case 5: goto L_0x05d0;
                case 6: goto L_0x05c8;
                case 7: goto L_0x02a0;
                case 8: goto L_0x0285;
                case 9: goto L_0x026a;
                case 10: goto L_0x05ba;
                case 11: goto L_0x0582;
                case 12: goto L_0x0576;
                case 13: goto L_0x056f;
                case 14: goto L_0x0567;
                case 15: goto L_0x0559;
                case 16: goto L_0x0217;
                case 17: goto L_0x054c;
                case 18: goto L_0x0541;
                case 19: goto L_0x001a;
                case 20: goto L_0x0539;
                case 21: goto L_0x0531;
                case 22: goto L_0x01e6;
                case 23: goto L_0x050e;
                case 24: goto L_0x01d9;
                case 25: goto L_0x04ed;
                case 26: goto L_0x04d7;
                case 27: goto L_0x01bb;
                case 28: goto L_0x0005;
                case 29: goto L_0x01bb;
                case 30: goto L_0x0005;
                case 31: goto L_0x04cd;
                case 32: goto L_0x04c5;
                case 33: goto L_0x0483;
                case 34: goto L_0x018c;
                case 35: goto L_0x013f;
                case 36: goto L_0x0464;
                case 37: goto L_0x0456;
                case 38: goto L_0x0434;
                case 39: goto L_0x001b;
                case 40: goto L_0x008d;
                case 41: goto L_0x0424;
                case 42: goto L_0x0416;
                case 43: goto L_0x040e;
                case 44: goto L_0x0065;
                case 45: goto L_0x0358;
                case 46: goto L_0x0347;
                case 47: goto L_0x033f;
                case 48: goto L_0x0337;
                case 49: goto L_0x032d;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r1 = r14.A00
            X.4oJ r1 = (X.C93314oJ) r1
            X.34x r0 = r1.getFMessage()
            X.2z0 r0 = r0.A1J
            X.4uZ r0 = r0.A00
            if (r0 == 0) goto L_0x001a
            X.34x r0 = r1.getFMessage()
            r1.A1k(r0)
        L_0x001a:
            return
        L_0x001b:
            java.lang.Object r4 = r14.A00
            X.4o1 r4 = (X.AnonymousClass4o1) r4
            java.util.List r0 = r4.A09
            X.1Ep r5 = r4.A04
            java.util.ArrayList r3 = X.AnonymousClass001.A0s()
            java.util.Iterator r6 = r0.iterator()     // Catch:{ RuntimeException -> 0x0054 }
        L_0x002b:
            boolean r0 = r6.hasNext()     // Catch:{ RuntimeException -> 0x0054 }
            if (r0 == 0) goto L_0x005f
            X.1mV r2 = X.C18320x8.A0S(r6)     // Catch:{ RuntimeException -> 0x0054 }
            byte r1 = r2.A1I     // Catch:{ RuntimeException -> 0x0054 }
            r0 = 3
            if (r1 == r0) goto L_0x002b
            X.33C r0 = r2.A01     // Catch:{ RuntimeException -> 0x0054 }
            if (r0 == 0) goto L_0x002b
            java.io.File r0 = r0.A0F     // Catch:{ RuntimeException -> 0x0054 }
            if (r0 == 0) goto L_0x002b
            android.net.Uri r1 = android.net.Uri.fromFile(r0)     // Catch:{ RuntimeException -> 0x0054 }
            java.io.File r0 = X.C18310x6.A0a(r1)     // Catch:{ RuntimeException -> 0x0054 }
            boolean r0 = r0.exists()     // Catch:{ RuntimeException -> 0x0054 }
            if (r0 == 0) goto L_0x002b
            r3.add(r1)     // Catch:{ RuntimeException -> 0x0054 }
            goto L_0x002b
        L_0x0054:
            r0 = move-exception
            java.lang.String r2 = r0.toString()
            r1 = 0
            java.lang.String r0 = "FMessageUtil/getDownloadedImagesUrisFromAlbum"
            r5.A0A(r0, r1, r2)
        L_0x005f:
            X.3Wi r2 = r4.A0X
            r1 = 18
            goto L_0x01b2
        L_0x0065:
            java.lang.Object r5 = r14.A00
            X.4oK r5 = (X.C93324oK) r5
            X.34x r0 = r5.getFMessage()
            X.2z0 r0 = r0.A1J
            X.4uZ r4 = r0.A00
            boolean r0 = r4 instanceof com.whatsapp.jid.UserJid
            if (r0 == 0) goto L_0x001a
            r3 = 0
            android.content.Context r2 = r5.getContext()
            com.whatsapp.jid.UserJid r4 = (com.whatsapp.jid.UserJid) r4
            java.lang.Integer r1 = X.C18320x8.A0W()
            r0 = 1
            android.content.Intent r1 = X.C627736r.A0l(r2, r4, r1, r0, r0)
            android.content.Context r0 = r5.getContext()
            X.AnonymousClass0RN.A00(r0, r1, r3)
            return
        L_0x008d:
            java.lang.Object r1 = r14.A00
            X.566 r1 = (X.AnonymousClass566) r1
            r5 = 0
            X.5Xh r3 = r1.A00
            X.5Rg r7 = r3.A03
            if (r7 == 0) goto L_0x001a
            X.1pC r8 = r7.A01
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "conversation/row/ConversationRowInlineVideoPlayer/createPlayer state="
            X.C18260x0.A1P(r2, r0, r3)
            X.5RW r4 = r1.A05
            android.view.ViewGroup r6 = r1.A03
            android.app.Activity r3 = X.C111095hX.A04(r6)
            X.5Xh r0 = r1.A00
            boolean r0 = r0.A06
            r2 = 1
            r0 = r0 ^ 1
            X.7ND r8 = r4.A00(r3, r8, r2, r0)
            if (r8 != 0) goto L_0x00c4
            X.5Xh r2 = r1.A00
            X.58U r0 = X.AnonymousClass58U.FAILED
            X.5Xh r5 = X.C106015Xh.A00(r0, r2)
        L_0x00c0:
            r1.A0h(r5)
            return
        L_0x00c4:
            X.5Xh r0 = r1.A00
            boolean r0 = r0.A06
            X.5YG r4 = r8.A03
            r4.A0Z(r0)
            X.5Xh r0 = r1.A00
            int r0 = r0.A00
            r4.A0Q(r0)
            r4.A0B = r2
            r4.A0C = r2
            int r0 = r7.A00
            r4.A0R(r0)
            X.7Df r0 = new X.7Df
            r0.<init>(r1)
            r8.A00 = r0
            X.5b7 r0 = new X.5b7
            r0.<init>(r1, r5)
            r8.A01 = r0
            X.68r r0 = new X.68r
            r0.<init>(r1, r2, r8)
            r4.A0V(r0)
            r6.removeAllViews()
            android.view.View r3 = r4.A09()
            if (r3 == 0) goto L_0x0115
            android.view.ViewParent r2 = r3.getParent()
            boolean r0 = r2 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x010b
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            if (r2 == 0) goto L_0x010b
            r2.removeAllViews()
        L_0x010b:
            r6.setVisibility(r5)
            android.widget.FrameLayout$LayoutParams r0 = X.C86664Kz.A0q()
            r6.addView(r3, r0)
        L_0x0115:
            boolean r0 = r4.A0e()
            if (r0 == 0) goto L_0x013b
            r4.A0M()
        L_0x011e:
            X.5Xh r0 = r1.A00
            int r0 = r0.A01
            r4.A0T(r5, r0)
            X.5Xh r0 = r1.A00
            X.5Rg r6 = r0.A03
            boolean r12 = r0.A07
            int r9 = r0.A02
            boolean r13 = r0.A06
            X.58U r7 = r0.A04
            int r10 = r0.A01
            int r11 = r0.A00
            X.5Xh r5 = new X.5Xh
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            goto L_0x00c0
        L_0x013b:
            r4.A0J()
            goto L_0x011e
        L_0x013f:
            java.lang.Object r3 = r14.A00
            X.5f6 r3 = (X.C109735f6) r3
            java.lang.Object r2 = r3.A02
            X.4uZ r2 = (X.C95814uZ) r2
            java.lang.Object r1 = r3.A01
            X.2sS r1 = (X.C56722sS) r1
            boolean r0 = X.C155477ey.A00(r2)
            if (r0 == 0) goto L_0x001a
            boolean r0 = r2 instanceof com.whatsapp.jid.UserJid
            if (r0 == 0) goto L_0x018a
            com.whatsapp.jid.UserJid r2 = (com.whatsapp.jid.UserJid) r2
            r0 = 0
            X.C162457s7.A0J(r2, r0)
            X.8qC r0 = r1.A0A
            java.lang.Object r0 = r0.get()
            X.2ff r0 = (X.C48902ff) r0
            X.2o1 r0 = r0.A00(r2)
            if (r0 == 0) goto L_0x018a
            java.lang.String r2 = r0.A08
            if (r2 == 0) goto L_0x018a
        L_0x016d:
            X.1ZN r1 = new X.1ZN
            r1.<init>()
            r0 = 31
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A00 = r0
            r1.A04 = r2
            java.lang.Integer r0 = X.C18290x4.A0b()
            r1.A02 = r0
            java.lang.Object r0 = r3.A06
            X.4FV r0 = (X.AnonymousClass4FV) r0
            r0.BhD(r1)
            return
        L_0x018a:
            r2 = 0
            goto L_0x016d
        L_0x018c:
            java.lang.Object r4 = r14.A00
            X.4mx r4 = (X.C92604mx) r4
            java.util.ArrayList r1 = r4.A0b
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x001a
            java.lang.Object r1 = X.AnonymousClass0x9.A0t(r1)
            X.4uZ r1 = (X.C95814uZ) r1
            if (r1 == 0) goto L_0x001a
            X.3Ex r0 = r4.A0t
            X.3ZH r3 = r0.A07(r1)
            if (r3 == 0) goto L_0x001a
            boolean r0 = r3.A0T()
            if (r0 == 0) goto L_0x001a
            X.3Wi r2 = r4.A0X
            r1 = 14
        L_0x01b2:
            X.3bw r0 = new X.3bw
            r0.<init>(r4, r1, r3)
            r2.A0S(r0)
            return
        L_0x01bb:
            java.lang.Object r2 = r14.A00
            X.4oJ r2 = (X.C93314oJ) r2
            X.34x r0 = r2.getFMessage()
            X.2z0 r0 = r0.A1J
            X.4uZ r0 = r0.A00
            if (r0 == 0) goto L_0x001a
            X.34x r0 = r2.getFMessage()
            X.2z0 r0 = r0.A1J
            X.4uZ r1 = r0.A00
            X.4FP r0 = r2.getMessageReactions()
            r2.A1f(r0, r1)
            return
        L_0x01d9:
            java.lang.Object r0 = r14.A00
            X.4W9 r0 = (X.AnonymousClass4W9) r0
            r1 = 0
            androidx.recyclerview.widget.RecyclerView r0 = r0.A00
            if (r0 == 0) goto L_0x001a
            r0.A0a(r1)
            return
        L_0x01e6:
            java.lang.Object r3 = r14.A00
            X.4mC r3 = (X.C92164mC) r3
            com.whatsapp.TextEmojiLabel r1 = r3.A0F
            java.lang.String r0 = r3.A0C()
            r1.setText(r0)
            com.whatsapp.TextEmojiLabel r0 = r3.A0F
            android.view.ViewPropertyAnimator r2 = r0.animate()
            if (r2 == 0) goto L_0x001a
            r0 = 1065353216(0x3f800000, float:1.0)
            r2.alpha(r0)
            r0 = 0
            r2.setStartDelay(r0)
            r0 = 250(0xfa, double:1.235E-321)
            r2.setDuration(r0)
            r0 = 21
            X.5rM r0 = A00(r3, r0)
            r2.withEndAction(r0)
            r2.start()
            return
        L_0x0217:
            java.lang.Object r4 = r14.A00
            X.4mK r4 = (X.C92244mK) r4
            X.3ZF r7 = r4.A08
            if (r7 == 0) goto L_0x0258
            java.util.ArrayList r5 = X.AnonymousClass001.A0s()
            java.util.Iterator r3 = X.AnonymousClass3ZF.A01(r7)
        L_0x0227:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0243
            java.lang.Object r2 = r3.next()
            X.C162457s7.A0D(r2)
            X.3ZE r2 = (X.AnonymousClass3ZE) r2
            int r1 = r2.A00
            r0 = 5
            if (r1 != r0) goto L_0x0227
            X.3Ex r1 = r4.A0G
            com.whatsapp.jid.UserJid r0 = r2.A02
            X.C86614Ku.A1P(r1, r0, r5)
            goto L_0x0227
        L_0x0243:
            android.view.View r6 = r4.A01
            if (r6 == 0) goto L_0x0258
            r8 = 34
            X.3cM r3 = new X.3cM
            r3.<init>((java.lang.Object) r4, (java.lang.Object) r5, (java.lang.Object) r6, (java.lang.Object) r7, (int) r8)
            boolean r0 = r6.post(r3)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            if (r0 != 0) goto L_0x001a
        L_0x0258:
            X.2i6 r3 = r4.A07
            if (r3 == 0) goto L_0x001a
            android.view.View r2 = r4.A01
            if (r2 == 0) goto L_0x001a
            r1 = 2
            X.3aK r0 = new X.3aK
            r0.<init>(r4, r2, r3, r1)
            r2.post(r0)
            return
        L_0x026a:
            java.lang.Object r3 = r14.A00
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            r2 = 0
        L_0x026f:
            int r0 = r3.getChildCount()
            if (r2 >= r0) goto L_0x001a
            android.view.View r1 = r3.getChildAt(r2)
            boolean r0 = r1 instanceof X.C93184o6
            if (r0 == 0) goto L_0x0282
            X.4oJ r1 = (X.C93314oJ) r1
            r1.A1G()
        L_0x0282:
            int r2 = r2 + 1
            goto L_0x026f
        L_0x0285:
            java.lang.Object r3 = r14.A00
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            r2 = 0
        L_0x028a:
            int r0 = r3.getChildCount()
            if (r2 >= r0) goto L_0x001a
            android.view.View r1 = r3.getChildAt(r2)
            boolean r0 = r1 instanceof X.C93254oD
            if (r0 == 0) goto L_0x029d
            X.4oJ r1 = (X.C93314oJ) r1
            r1.A1G()
        L_0x029d:
            int r2 = r2 + 1
            goto L_0x028a
        L_0x02a0:
            java.lang.Object r5 = r14.A00
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            r4 = 0
        L_0x02a5:
            int r0 = r5.getChildCount()
            if (r4 >= r0) goto L_0x001a
            android.view.View r3 = r5.getChildAt(r4)
            boolean r0 = r3 instanceof X.C93314oJ
            if (r0 == 0) goto L_0x02d1
            r2 = r3
            X.4oJ r2 = (X.C93314oJ) r2
            X.34x r0 = r2.getFMessage()
            X.34x r1 = r0.A0w()
            boolean r0 = r3 instanceof X.C93254oD
            if (r0 != 0) goto L_0x02ce
            if (r1 == 0) goto L_0x02d1
            X.34w r0 = r1.A0P
            if (r0 == 0) goto L_0x02d1
            X.39R r0 = r0.A05()
            if (r0 == 0) goto L_0x02d1
        L_0x02ce:
            r2.A1G()
        L_0x02d1:
            int r4 = r4 + 1
            goto L_0x02a5
        L_0x02d4:
            java.lang.Object r3 = r14.A00
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            r2 = 0
        L_0x02d9:
            int r0 = r3.getChildCount()
            if (r2 >= r0) goto L_0x001a
            android.view.View r1 = r3.getChildAt(r2)
            boolean r0 = r1 instanceof X.C93274oF
            if (r0 != 0) goto L_0x02ef
            boolean r0 = r1 instanceof X.C93254oD
            if (r0 != 0) goto L_0x02ef
            boolean r0 = r1 instanceof X.C93264oE
            if (r0 == 0) goto L_0x02f4
        L_0x02ef:
            X.4oJ r1 = (X.C93314oJ) r1
            r1.A1G()
        L_0x02f4:
            int r2 = r2 + 1
            goto L_0x02d9
        L_0x02f7:
            java.lang.Object r4 = r14.A00
            X.4fS r4 = (X.C89894fS) r4
            X.8td r3 = r4.A0K
            X.34x r2 = r3.getQuotedMessage()
            if (r2 == 0) goto L_0x031a
            X.34w r0 = r2.A0P
            if (r0 == 0) goto L_0x031a
            boolean r0 = r0.A0K()
            if (r0 == 0) goto L_0x031a
            X.2sr r1 = r4.A09
            X.34w r0 = r2.A0P
            com.whatsapp.jid.UserJid r0 = r0.A0E
            boolean r0 = r1.A0a(r0)
            r1 = 1
            if (r0 != 0) goto L_0x031b
        L_0x031a:
            r1 = 0
        L_0x031b:
            com.whatsapp.mentions.MentionableEntry r0 = r4.A0Z
            java.lang.String r0 = r0.getStringText()
            if (r1 != 0) goto L_0x0329
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x001a
        L_0x0329:
            r3.Bjx()
            return
        L_0x032d:
            java.lang.Object r0 = r14.A00
            X.5R6 r0 = (X.AnonymousClass5R6) r0
            android.os.CountDownTimer r0 = r0.A00
            r0.start()
            return
        L_0x0337:
            java.lang.Object r1 = r14.A00
            X.5kg r1 = (X.C112975kg) r1
            r0 = 0
            r1.A0w = r0
            return
        L_0x033f:
            java.lang.Object r1 = r14.A00
            X.4ni r1 = (X.C93004ni) r1
            r0 = 0
            r1.A00 = r0
            return
        L_0x0347:
            java.lang.Object r1 = r14.A00
            X.5TR r1 = (X.AnonymousClass5TR) r1
            X.7ND r0 = r1.A00
            if (r0 == 0) goto L_0x0354
            X.5YG r0 = r0.A03
            r0.A0N()
        L_0x0354:
            r0 = 0
            r1.A01 = r0
            return
        L_0x0358:
            java.lang.Object r8 = r14.A00
            X.5TR r8 = (X.AnonymousClass5TR) r8
            X.1pB r9 = r8.A0D
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "conversation/row/video/autoplay/createVideoPlayer/"
            X.2z0 r0 = X.C624134x.A08(r9, r0, r1)
            java.lang.String r7 = r0.A01
            X.C18260x0.A1J(r1, r7)
            X.7ND r0 = r8.A00
            if (r0 != 0) goto L_0x03df
            X.5RW r2 = r8.A0E
            X.4oC r0 = r8.A0A
            android.app.Activity r0 = X.C111095hX.A04(r0)
            r1 = 0
            X.7ND r0 = r2.A00(r0, r9, r1, r1)
            r8.A00 = r0
            if (r0 == 0) goto L_0x03df
            r8.A03 = r1
            r1 = 1
            X.5YG r0 = r0.A03
            r0.A0Z(r1)
            X.7ND r4 = r8.A00
            X.5YG r3 = r4.A03
            r2 = 1
            r3.A0B = r1
            r1 = 2
            X.68r r0 = new X.68r
            r0.<init>(r8, r1, r9)
            r3.A0V(r0)
            X.5b7 r0 = new X.5b7
            r0.<init>(r8, r2)
            r4.A01 = r0
            r3.A0C = r2
            r0 = 3
            r3.A0R(r0)
            android.widget.FrameLayout r6 = r8.A06
            r6.removeAllViews()
            X.7ND r0 = r8.A00
            if (r0 == 0) goto L_0x03df
            X.5YG r0 = r0.A03
            android.view.View r1 = r0.A09()
            if (r1 == 0) goto L_0x03df
            android.view.ViewGroup r0 = X.C86664Kz.A0l(r1)
            if (r0 == 0) goto L_0x03c1
            r0.removeAllViews()
        L_0x03c1:
            android.widget.FrameLayout$LayoutParams r0 = X.C86664Kz.A0q()
            r6.addView(r1, r0)
            android.content.Context r5 = r6.getContext()
            r4 = 2131895024(0x7f1222f0, float:1.942487E38)
            java.lang.Object[] r3 = new java.lang.Object[r2]
            X.33j r2 = r8.A0C
            int r0 = r9.A0B
            r1 = 0
            java.lang.String r0 = X.C107565bW.A05(r2, r0, r1)
            r3[r1] = r0
            X.C86624Kv.A0h(r5, r6, r3, r4)
        L_0x03df:
            X.7ND r0 = r8.A00
            if (r0 == 0) goto L_0x0404
            X.5YG r1 = r0.A03
            boolean r0 = r1.A0e()
            r2 = 1
            if (r0 == 0) goto L_0x0408
            int r0 = r1.A07()
            if (r0 != r2) goto L_0x03fd
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "conversation/row/video/autoplay/initializePlayer/playerRendering/stateIdle"
            X.C18260x0.A0q(r0, r7, r1)
            r8.A03 = r2
        L_0x03fd:
            X.7ND r0 = r8.A00
            X.5YG r0 = r0.A03
            r0.A0M()
        L_0x0404:
            r0 = 0
            r8.A02 = r0
            return
        L_0x0408:
            r8.A03 = r2
            r1.A0F()
            goto L_0x0404
        L_0x040e:
            java.lang.Object r0 = r14.A00
            X.4oC r0 = (X.C93244oC) r0
            r0.A27()
            return
        L_0x0416:
            java.lang.Object r0 = r14.A00
            X.4oC r0 = (X.C93244oC) r0
            X.2p9 r1 = r0.A1h
            X.1mV r0 = r0.getFMessage()
            r1.A00(r0)
            return
        L_0x0424:
            java.lang.Object r2 = r14.A00
            X.566 r2 = (X.AnonymousClass566) r2
            X.5Xh r1 = r2.A00
            X.58U r0 = X.AnonymousClass58U.INITIALIZED
            X.5Xh r0 = X.C106015Xh.A00(r0, r1)
            r2.A0h(r0)
            return
        L_0x0434:
            java.lang.Object r3 = r14.A00
            X.4nz r3 = (X.C93154nz) r3
            X.34x r2 = r3.A0S
            X.1mV r2 = (X.C30471mV) r2
            X.1pC r2 = (X.C31981pC) r2
            r3.A29()
            X.5XQ r0 = r3.A0C
            if (r0 == 0) goto L_0x0452
            int r1 = r0.A00(r2)
        L_0x0449:
            X.566 r0 = r3.A0D
            r0.A0i(r2, r1)
            r0.A0F()
            return
        L_0x0452:
            r1 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x0449
        L_0x0456:
            java.lang.Object r1 = r14.A00
            X.4nz r1 = (X.C93154nz) r1
            X.34x r0 = r1.A0S
            X.1mV r0 = (X.C30471mV) r0
            X.1pA r0 = (X.C31961pA) r0
            r1.A2C(r0)
            return
        L_0x0464:
            java.lang.Object r1 = r14.A00
            X.4nw r1 = (X.C93124nw) r1
            r5 = 0
            r0 = 4
            r1.A27(r0, r5)
            X.3ZH r0 = r1.A09
            com.whatsapp.jid.UserJid r4 = X.C86604Kt.A0d(r0)
            X.4eZ r3 = r1.A0C
            java.lang.Integer r2 = X.C18280x3.A0S()
            r1 = 0
            r0 = 1
            android.content.Intent r0 = X.C627736r.A0l(r3, r4, r2, r0, r1)
            X.AnonymousClass0RN.A00(r3, r0, r5)
            return
        L_0x0483:
            java.lang.Object r7 = r14.A00
            X.4ns r7 = (X.C93084ns) r7
            java.util.ArrayList r8 = X.AnonymousClass001.A0s()
            java.util.ArrayList r0 = r7.A01
            java.util.Iterator r9 = r0.iterator()
        L_0x0491:
            boolean r0 = r9.hasNext()
            r2 = 4
            if (r0 == 0) goto L_0x04b5
            java.lang.Object r6 = r9.next()
            X.1mW r6 = (X.C30481mW) r6
            int r0 = r6.A01
            if (r0 != r2) goto L_0x0491
            long r4 = r6.A0I
            X.2sH r0 = r7.A1E
            long r2 = r0.A0H()
            r0 = 30000(0x7530, double:1.4822E-319)
            long r2 = r2 - r0
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x0491
            r8.add(r6)
            goto L_0x0491
        L_0x04b5:
            X.3Lv r1 = r7.A1I
            java.util.List r0 = X.C73723fy.A0F(r8)
            r1.A0k(r0, r2)
            r0 = 0
            r7.A03 = r0
            r7.A2A()
            return
        L_0x04c5:
            java.lang.Object r0 = r14.A00
            X.4oJ r0 = (X.C93314oJ) r0
            r0.A1H()
            return
        L_0x04cd:
            java.lang.Object r0 = r14.A00
            X.4VB r0 = (X.AnonymousClass4VB) r0
            X.08M r0 = r0.A04
            X.C86654Ky.A1H(r0)
            return
        L_0x04d7:
            java.lang.Object r2 = r14.A00
            android.view.View r2 = (android.view.View) r2
            android.view.ViewParent r1 = r2.getParent()
            if (r1 == 0) goto L_0x04e5
            r0 = 1
            r1.requestDisallowInterceptTouchEvent(r0)
        L_0x04e5:
            r2.cancelLongPress()
            r0 = 0
            r2.setPressed(r0)
            return
        L_0x04ed:
            java.lang.Object r3 = r14.A00
            com.whatsapp.conversation.comments.DecryptionFailureMessageView r3 = (com.whatsapp.conversation.comments.DecryptionFailureMessageView) r3
            X.3Lk r1 = r3.getFaqLinkFactory()
            java.lang.String r0 = "26000015"
            android.net.Uri r0 = r1.A03(r0)
            X.C162457s7.A0D(r0)
            android.content.Intent r2 = X.C18310x6.A0D(r0)
            X.5hX r1 = r3.getActivityUtils()
            android.content.Context r0 = r3.getContext()
            r1.A0A(r0, r2)
            return
        L_0x050e:
            java.lang.Object r0 = r14.A00
            com.whatsapp.conversation.comments.CommentActionsBottomSheet r0 = (com.whatsapp.conversation.comments.CommentActionsBottomSheet) r0
            X.7am r2 = r0.A08
            if (r2 == 0) goto L_0x052a
            X.34x r0 = r0.A0V
            if (r0 != 0) goto L_0x0521
            java.lang.String r0 = "message"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0521:
            java.util.List r1 = X.C18290x4.A12(r0)
            r0 = 2
            r2.A04(r1, r0)
            return
        L_0x052a:
            java.lang.String r0 = "bizIntegrityLogger"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0531:
            java.lang.Object r1 = r14.A00
            X.4mC r1 = (X.C92164mC) r1
            r0 = 0
            r1.A03 = r0
            return
        L_0x0539:
            java.lang.Object r1 = r14.A00
            X.4mO r1 = (X.C92284mO) r1
            r0 = 0
            r1.A02 = r0
            return
        L_0x0541:
            java.lang.Object r0 = r14.A00
            X.1VN r0 = (X.AnonymousClass1VN) r0
            X.33p r1 = r0.A02
            r0 = 1
            r1.A1o(r0)
            return
        L_0x054c:
            java.lang.Object r0 = r14.A00
            X.4mE r0 = (X.C92184mE) r0
            r2 = 1
            X.3Ex r1 = r0.A05
            X.1fJ r0 = r0.A02
            r1.A0W(r0, r2)
            return
        L_0x0559:
            java.lang.Object r0 = r14.A00
            X.4mH r0 = (X.C92214mH) r0
            X.3Ex r2 = r0.A06
            X.1fJ r1 = r0.A02
            boolean r0 = r0.A03
            r2.A0V(r1, r0)
            return
        L_0x0567:
            java.lang.Object r0 = r14.A00
            X.4fR r0 = (X.C89884fR) r0
            r0.A02()
            return
        L_0x056f:
            java.lang.Object r0 = r14.A00
            X.4mN r0 = (X.C92274mN) r0
            X.5mB r6 = r0.A0J
            goto L_0x0588
        L_0x0576:
            java.lang.Object r0 = r14.A00
            com.whatsapp.conversation.EditMessageActivity r0 = (com.whatsapp.conversation.EditMessageActivity) r0
            android.widget.ScrollView r1 = r0.A03
            r0 = 130(0x82, float:1.82E-43)
            r1.fullScroll(r0)
            return
        L_0x0582:
            java.lang.Object r0 = r14.A00
            X.4fT r0 = (X.C89904fT) r0
            X.5mB r6 = r0.A0L
        L_0x0588:
            X.4uZ r0 = r0.A0V
            monitor-enter(r6)
            android.content.SharedPreferences r5 = r6.A01()     // Catch:{ all -> 0x05b7 }
            java.lang.String r0 = r0.getRawString()     // Catch:{ all -> 0x05b7 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r0)     // Catch:{ all -> 0x05b7 }
            java.lang.String r0 = "_actions"
            java.lang.String r4 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ all -> 0x05b7 }
            java.lang.String r0 = "0"
            java.lang.String r0 = r5.getString(r4, r0)     // Catch:{ all -> 0x05b7 }
            long r2 = X.C615531h.A03(r0)     // Catch:{ all -> 0x05b7 }
            r0 = 1
            long r2 = r2 + r0
            android.content.SharedPreferences$Editor r1 = r5.edit()     // Catch:{ all -> 0x05b7 }
            java.lang.String r0 = java.lang.Long.toString(r2)     // Catch:{ all -> 0x05b7 }
            X.C18270x1.A0j(r1, r4, r0)     // Catch:{ all -> 0x05b7 }
            monitor-exit(r6)
            return
        L_0x05b7:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        L_0x05ba:
            java.lang.Object r0 = r14.A00
            X.4fT r0 = (X.C89904fT) r0
            X.2iC r2 = r0.A0W
            X.4uZ r1 = r0.A0V
            X.21R r0 = X.AnonymousClass21R.CONVERSATION_SCREEN
            r2.A00(r1, r0)
            return
        L_0x05c8:
            java.lang.Object r0 = r14.A00
            com.whatsapp.conversation.ConversationListView r0 = (com.whatsapp.conversation.ConversationListView) r0
            r0.A01()
            return
        L_0x05d0:
            java.lang.Object r0 = r14.A00
            com.whatsapp.conversation.ConversationListView r0 = (com.whatsapp.conversation.ConversationListView) r0
            r0.A05()
            return
        L_0x05d8:
            java.lang.Object r1 = r14.A00
            com.whatsapp.conversation.ConversationListView r1 = (com.whatsapp.conversation.ConversationListView) r1
            r0 = 2
            r1.setTranscriptMode(r0)
            r1.A03()
            return
        L_0x05e4:
            java.lang.Object r0 = r14.A00
            X.8uR r0 = (X.C185908uR) r0
            r0.BZ9()
            return
        L_0x05ec:
            java.lang.Object r0 = r14.A00
            X.8uR r0 = (X.C185908uR) r0
            r0.Bfe()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C117085rM.run():void");
    }
}
