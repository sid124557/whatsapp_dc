package X;

/* renamed from: X.5As  reason: invalid class name and case insensitive filesystem */
public class C100385As implements C15930sC {
    public Object A00;
    public Object A01;
    public final int A02;

    public C100385As(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public static void A00(C15910sA r1, C06270Wx r2, Object obj, int i) {
        r2.A0B(r1, new C100385As(obj, i, r1));
    }

    public static void A01(C15910sA r1, C06270Wx r2, Object obj, Object obj2, int i) {
        r2.A0B(r1, new C100385As(obj, i, obj2));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:118:0x02bd, code lost:
        if (r6.isEmpty() != false) goto L_0x02bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x0516, code lost:
        if (r2.A0R == null) goto L_0x0518;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x058d, code lost:
        if (r2.A0Q == null) goto L_0x058f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:305:0x0807, code lost:
        if (r13.booleanValue() == false) goto L_0x0809;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01e2, code lost:
        if (r13.booleanValue() == false) goto L_0x01e4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void BOf(java.lang.Object r13) {
        /*
            r12 = this;
            int r0 = r12.A02
            switch(r0) {
                case 0: goto L_0x057c;
                case 1: goto L_0x0503;
                case 2: goto L_0x07f4;
                case 3: goto L_0x04dd;
                case 4: goto L_0x07e8;
                case 5: goto L_0x07dc;
                case 6: goto L_0x07d0;
                case 7: goto L_0x07c4;
                case 8: goto L_0x0496;
                case 9: goto L_0x0771;
                case 10: goto L_0x0462;
                case 11: goto L_0x0742;
                case 12: goto L_0x0412;
                case 13: goto L_0x03d4;
                case 14: goto L_0x0247;
                case 15: goto L_0x0215;
                case 16: goto L_0x0723;
                case 17: goto L_0x01d1;
                case 18: goto L_0x06e8;
                case 19: goto L_0x0693;
                case 20: goto L_0x067e;
                case 21: goto L_0x0668;
                case 22: goto L_0x0131;
                case 23: goto L_0x060b;
                case 24: goto L_0x05f1;
                case 25: goto L_0x00de;
                case 26: goto L_0x00c2;
                case 27: goto L_0x008d;
                case 28: goto L_0x0014;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r12.A00
            X.5Ml r0 = (X.C103325Ml) r0
            java.lang.Object r2 = r12.A01
            com.whatsapp.jid.UserJid r2 = (com.whatsapp.jid.UserJid) r2
            com.whatsapp.voipcalling.VoipActivityV2 r1 = r0.A00
            r0 = 1
            X.AnonymousClass4SG.A3k(r2, r1, r0)
        L_0x0013:
            return
        L_0x0014:
            java.lang.Object r4 = r12.A00
            com.whatsapp.status.StatusesFragment r4 = (com.whatsapp.status.StatusesFragment) r4
            java.lang.Object r3 = r12.A01
            android.widget.ListView r3 = (android.widget.ListView) r3
            boolean r0 = X.AnonymousClass001.A1Z(r13)
            if (r0 != 0) goto L_0x0013
            android.view.View r0 = r4.A03
            r5 = 0
            if (r0 != 0) goto L_0x0084
            r4.A1H()
            android.widget.ListView r6 = r4.A04
            android.view.LayoutInflater r1 = X.C86634Kw.A0K(r4)
            r0 = 2131626090(0x7f0e086a, float:1.8879406E38)
            android.view.View r1 = r1.inflate(r0, r6, r5)
            r4.A03 = r1
            r0 = 2131434200(0x7f0b1ad8, float:1.8490207E38)
            android.widget.TextView r8 = X.AnonymousClass002.A09(r1, r0)
            r2 = 1
            java.lang.Object[] r7 = new java.lang.Object[r2]
            r0 = 24
            X.AnonymousClass000.A1P(r7, r0, r5)
            r1 = 2131893973(0x7f121ed5, float:1.9422738E38)
            android.content.res.Resources r0 = X.C08310eF.A09(r4)
            java.lang.String r0 = r0.getString(r1, r7)
            r8.setText(r0)
            android.view.View r1 = r4.A03
            r0 = 2131428506(0x7f0b049a, float:1.8478658E38)
            android.view.View r1 = r1.findViewById(r0)
            r0 = 43
            X.C634139d.A00(r1, r4, r0)
            android.view.View r1 = r4.A03
            r0 = 2131432639(0x7f0b14bf, float:1.8487041E38)
            android.view.View r1 = r1.findViewById(r0)
            r0 = 44
            X.C634139d.A00(r1, r4, r0)
            android.content.Context r0 = r4.A0G()
            android.widget.FrameLayout r1 = new android.widget.FrameLayout
            r1.<init>(r0)
            android.view.View r0 = r4.A03
            r1.addView(r0)
            r0 = 0
            r6.addHeaderView(r1, r0, r2)
        L_0x0084:
            android.view.View r0 = r4.A03
            r0.setVisibility(r5)
            r4.A1S(r3)
            return
        L_0x008d:
            java.lang.Object r1 = r12.A00
            com.whatsapp.search.SearchViewModel r1 = (com.whatsapp.search.SearchViewModel) r1
            java.lang.Object r5 = r12.A01
            X.0XV r5 = (X.AnonymousClass0XV) r5
            java.lang.String r13 = (java.lang.String) r13
            if (r13 != 0) goto L_0x009b
            java.lang.String r13 = ""
        L_0x009b:
            java.lang.String r0 = r1.A0N()
            boolean r0 = X.AnonymousClass75J.A00(r13, r0)
            if (r0 != 0) goto L_0x0013
            X.5tY r4 = r1.A0A
            int r0 = r1.A0E()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            com.whatsapp.jid.UserJid r2 = r1.A0J()
            r1 = 3
            X.5Yu r0 = new X.5Yu
            r0.<init>(r2, r3, r13, r1)
            r4.A00(r0)
            java.lang.String r0 = "query_text"
            r5.A06(r0, r13)
            return
        L_0x00c2:
            java.lang.Object r1 = r12.A00
            com.whatsapp.search.SearchViewModel r1 = (com.whatsapp.search.SearchViewModel) r1
            java.lang.Object r0 = r12.A01
            X.8qC r0 = (X.C183538qC) r0
            X.4zG r13 = (X.C97794zG) r13
            r1.A0C = r13
            java.lang.Object r0 = r0.get()
            X.5aW r0 = (X.C106995aW) r0
            boolean r0 = r0.A0H()
            if (r0 == 0) goto L_0x0013
            r1.A0T()
            return
        L_0x00de:
            java.lang.Object r0 = r12.A00
            com.whatsapp.search.SearchFragment r0 = (com.whatsapp.search.SearchFragment) r0
            java.lang.Object r5 = r12.A01
            X.4XH r5 = (X.AnonymousClass4XH) r5
            java.util.Map r13 = (java.util.Map) r13
            com.whatsapp.status.viewmodels.StatusesViewModel r0 = r0.A1g
            java.util.Set r1 = r0.A0G
            monitor-enter(r1)
            java.util.ArrayList r0 = X.AnonymousClass002.A0J(r1)     // Catch:{ all -> 0x0829 }
            r1.clear()     // Catch:{ all -> 0x0829 }
            monitor-exit(r1)
            java.util.HashSet r4 = X.AnonymousClass0x9.A15(r0)
            r5.A02 = r13
            r3 = 0
        L_0x00fc:
            X.5tJ r1 = r5.A0z
            int r0 = r1.size()
            if (r3 >= r0) goto L_0x0013
            java.lang.Object r2 = r1.get(r3)
            X.7g5 r2 = (X.C156137g5) r2
            int r1 = r2.A00
            r0 = 3
            if (r1 != r0) goto L_0x0127
            java.lang.Object r1 = r2.A01
            boolean r0 = r1 instanceof X.AnonymousClass3ZH
            if (r0 == 0) goto L_0x0124
            X.3ZH r1 = (X.AnonymousClass3ZH) r1
            X.4uZ r1 = r1.A0H
        L_0x0119:
            if (r1 == 0) goto L_0x0124
            boolean r0 = r4.contains(r1)
            if (r0 == 0) goto L_0x0124
            r5.A06(r3)
        L_0x0124:
            int r3 = r3 + 1
            goto L_0x00fc
        L_0x0127:
            r0 = 2
            if (r1 != r0) goto L_0x0124
            java.lang.Object r1 = r2.A01
            boolean r0 = r1 instanceof com.whatsapp.jid.PhoneUserJid
            if (r0 == 0) goto L_0x0124
            goto L_0x0119
        L_0x0131:
            java.lang.Object r2 = r12.A00
            com.whatsapp.reactions.ReactionsBottomSheetDialogFragment r2 = (com.whatsapp.reactions.ReactionsBottomSheetDialogFragment) r2
            java.lang.Object r0 = r12.A01
            X.4UX r0 = (X.AnonymousClass4UX) r0
            int r1 = r0.A00
            com.whatsapp.WaTabLayout r5 = r2.A05
            java.util.ArrayList r0 = r5.A0k
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x0013
            if (r1 < 0) goto L_0x0013
            java.util.ArrayList r6 = r5.A0k
            int r0 = r6.size()
            if (r1 >= r0) goto L_0x0013
            r7 = 0
            int r8 = r5.A0I(r1, r7)
            X.5T2 r0 = r5.A0U
            if (r0 == 0) goto L_0x01b3
            int r9 = r0.A00
        L_0x015a:
            X.4QR r0 = r5.A0i
            android.view.View r1 = r0.getChildAt(r8)
            X.4Qc r1 = (X.AnonymousClass4Qc) r1
            r0.removeViewAt(r8)
            if (r1 == 0) goto L_0x0173
            r0 = 0
            r1.setTab(r0)
            r1.setSelected(r7)
            X.0tf r0 = r5.A0h
            r0.Bio(r1)
        L_0x0173:
            r5.requestLayout()
            java.lang.Object r2 = r6.remove(r8)
            X.5T2 r2 = (X.AnonymousClass5T2) r2
            if (r2 == 0) goto L_0x0193
            r1 = 0
            r2.A03 = r1
            r2.A02 = r1
            r2.A06 = r1
            r0 = -1
            r2.A05 = r1
            r2.A04 = r1
            r2.A00 = r0
            r2.A01 = r1
            X.0tf r0 = com.google.android.material.tabs.TabLayout.A0l
            r0.Bio(r2)
        L_0x0193:
            int r4 = r6.size()
            r3 = -1
            r2 = r8
        L_0x0199:
            if (r2 >= r4) goto L_0x01b5
            java.lang.Object r0 = r6.get(r2)
            X.5T2 r0 = (X.AnonymousClass5T2) r0
            int r1 = r0.A00
            int r0 = r5.A03
            if (r1 != r0) goto L_0x01a8
            r3 = r2
        L_0x01a8:
            java.lang.Object r0 = r6.get(r2)
            X.5T2 r0 = (X.AnonymousClass5T2) r0
            r0.A00 = r2
            int r2 = r2 + 1
            goto L_0x0199
        L_0x01b3:
            r9 = 0
            goto L_0x015a
        L_0x01b5:
            r5.A03 = r3
            if (r9 != r8) goto L_0x0013
            boolean r0 = r6.isEmpty()
            r1 = 0
            if (r0 != 0) goto L_0x01cc
            int r0 = r8 + -1
            int r0 = java.lang.Math.max(r7, r0)
            java.lang.Object r1 = r6.get(r0)
            X.5T2 r1 = (X.AnonymousClass5T2) r1
        L_0x01cc:
            r0 = 1
            r5.A0G(r1, r0)
            return
        L_0x01d1:
            java.lang.Object r6 = r12.A00
            com.whatsapp.mediaview.MediaViewFragment r6 = (com.whatsapp.mediaview.MediaViewFragment) r6
            java.lang.Object r5 = r12.A01
            android.view.View r5 = (android.view.View) r5
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            if (r13 == 0) goto L_0x01e4
            boolean r0 = r13.booleanValue()
            r4 = 1
            if (r0 != 0) goto L_0x01e5
        L_0x01e4:
            r4 = 0
        L_0x01e5:
            r6.A1t = r4
            android.view.ViewGroup$MarginLayoutParams r3 = X.AnonymousClass001.A0T(r5)
            r2 = 0
            if (r4 == 0) goto L_0x0210
            android.content.res.Resources r1 = X.C08310eF.A09(r6)
            r0 = 2131165286(0x7f070066, float:1.7944785E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r3.topMargin = r0
        L_0x01fb:
            r5.setLayoutParams(r3)
            X.5YG r0 = r6.A1n
            if (r0 == 0) goto L_0x0013
            X.561 r1 = r0.A0A()
            if (r1 == 0) goto L_0x0013
            if (r4 == 0) goto L_0x082c
            r1.A08 = r2
            r1.A05()
            return
        L_0x0210:
            r3.topMargin = r2
            r3.bottomMargin = r2
            goto L_0x01fb
        L_0x0215:
            java.lang.Object r2 = r12.A00
            com.whatsapp.group.GroupChatInfoActivity r2 = (com.whatsapp.group.GroupChatInfoActivity) r2
            java.lang.Object r1 = r12.A01
            com.whatsapp.jid.GroupJid r1 = (com.whatsapp.jid.GroupJid) r1
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = r0.equals(r13)
            if (r0 == 0) goto L_0x0013
            X.3Wi r0 = r2.A05
            r0.A0D()
            X.5ZU r0 = r2.A0t
            java.lang.String r1 = r0.A0T(r1)
            if (r1 != 0) goto L_0x023f
            r0 = 2131889205(0x7f120c35, float:1.9413067E38)
            java.lang.String r1 = r2.getString(r0)
        L_0x0239:
            X.67D r0 = r2.A0o
            r0.BJc(r2, r1)
            return
        L_0x023f:
            r0 = 2131889204(0x7f120c34, float:1.9413065E38)
            java.lang.String r1 = X.C86604Kt.A0m(r2, r1, r0)
            goto L_0x0239
        L_0x0247:
            java.lang.Object r3 = r12.A00
            X.5l7 r3 = (X.C113245l7) r3
            java.lang.Object r4 = r12.A01
            X.7Ns r4 = (X.C149747Ns) r4
            X.2NW r13 = (X.AnonymousClass2NW) r13
            boolean r0 = r13.A02
            r7 = 1
            if (r0 == 0) goto L_0x0835
            X.5IV r0 = r3.A3P
            X.5Rl r6 = r0.A00
            boolean r1 = r4.A03
            if (r1 == 0) goto L_0x03ad
            boolean r0 = r4.A04
            if (r0 == 0) goto L_0x03ad
        L_0x0262:
            java.lang.String r5 = "preview_load_success"
            if (r7 == 0) goto L_0x0270
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "icebreaker_"
            java.lang.String r5 = X.AnonymousClass000.A0V(r0, r5, r2)
        L_0x0270:
            r6.A00(r5)
            X.2TX r8 = r13.A00
            X.C626936e.A06(r8)
            X.5IV r0 = r3.A3P
            X.2hn r7 = r0.A02
            X.4uZ r0 = r3.A4J
            com.whatsapp.jid.UserJid r6 = X.AnonymousClass32Y.A03(r0)
            X.2Nb r0 = r8.A00
            java.lang.String r2 = r0.A00
            r5 = 1
            X.C162457s7.A0J(r2, r5)
            if (r6 == 0) goto L_0x0292
            X.2z9 r0 = r7.A00(r6)
            r0.A00 = r2
        L_0x0292:
            X.5IV r0 = r3.A3P
            X.2hn r6 = r0.A02
            X.4uZ r0 = r3.A4J
            com.whatsapp.jid.UserJid r0 = X.AnonymousClass32Y.A05(r0)
            r2 = 3
            r6.A01(r0, r2)
            boolean r0 = r4.A04
            if (r0 == 0) goto L_0x0013
            java.lang.String r4 = r8.A07
            if (r4 == 0) goto L_0x03b0
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L_0x03b0
            X.5RH r9 = r3.A3T
            boolean r0 = r9.A0E
            if (r0 == 0) goto L_0x034e
            java.util.List r6 = r8.A08
            if (r1 == 0) goto L_0x02bf
            boolean r0 = r6.isEmpty()
            r2 = 1
            if (r0 == 0) goto L_0x02c0
        L_0x02bf:
            r2 = 0
        L_0x02c0:
            int r1 = r9.A0H
            r0 = 2
            if (r1 != r0) goto L_0x0362
            X.5GD r0 = r9.A0Q
            X.1VX r1 = r0.A00
            r0 = 2087(0x827, float:2.925E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x02de
            X.4ZC r0 = r9.A09
            if (r0 == 0) goto L_0x02de
            android.view.ViewTreeObserver r1 = r0.getViewTreeObserver()
            r0 = 20
            X.AnonymousClass6BG.A00(r1, r9, r0)
        L_0x02de:
            X.5KX r0 = r9.A06
            com.whatsapp.webpagepreview.WebPagePreviewView r0 = r0.A05
            android.view.View r1 = r0.A01
            r0 = 8
            r1.setVisibility(r0)
            X.4ZC r1 = r9.A09
            X.C626936e.A04(r1)
            X.8GI r0 = new X.8GI
            r0.<init>(r9)
            r1.setData(r4, r6, r0)
            boolean r0 = r9.A0C
            if (r0 != 0) goto L_0x032f
            r9.A0C = r5
            r0 = 0
            r9.A0F = r0
            android.view.ViewGroup r0 = r9.A01
            int r1 = r0.getHeight()
            X.5KX r0 = r9.A06
            com.whatsapp.webpagepreview.WebPagePreviewView r7 = r0.A05
            X.4ZC r10 = r9.A09
            X.C626936e.A04(r10)
            android.view.View r8 = r9.A00
            X.C626936e.A04(r8)
            X.6AM r6 = new X.6AM
            r6.<init>(r10, r9, r1, r5)
            r11 = 3
            X.67J r5 = new X.67J
            r5.<init>(r6, r7, r8, r9, r10, r11)
            android.view.ViewPropertyAnimator r4 = X.C86624Kv.A0A(r8)
            r0 = 100
            android.view.ViewPropertyAnimator r0 = r4.setDuration(r0)
            android.view.ViewPropertyAnimator r0 = r0.setListener(r5)
            r0.start()
        L_0x032f:
            X.5Py r6 = r9.A0P
            X.4uZ r0 = r9.A0A
            java.lang.String r5 = r0.getRawString()
            java.util.Map r4 = r6.A02
            boolean r0 = r4.containsKey(r5)
            if (r0 != 0) goto L_0x034e
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r4.put(r5, r0)
            r0 = 0
            r6.A00(r0, r5, r2)
        L_0x034e:
            X.5IV r0 = r3.A3P
            X.2hn r2 = r0.A02
            X.4uZ r0 = r3.A4J
            com.whatsapp.jid.UserJid r0 = X.AnonymousClass32Y.A05(r0)
            r1 = 1
            if (r0 == 0) goto L_0x0013
            X.2z9 r0 = r2.A00(r0)
            r0.A02 = r1
            return
        L_0x0362:
            com.whatsapp.ctwa.icebreaker.ui.IcebreakerBubbleView r7 = r9.A08
            X.C626936e.A04(r7)
            r0 = 48
            X.5eg r6 = new X.5eg
            r6.<init>(r9, r0, r8)
            r7.removeAllViews()
            android.view.LayoutInflater r1 = X.C18280x3.A0D(r7)
            r0 = 2131624499(0x7f0e0233, float:1.887618E38)
            android.view.View r8 = r1.inflate(r0, r7, r5)
            r0 = 2131431506(0x7f0b1052, float:1.8484743E38)
            android.widget.TextView r5 = X.C18300x5.A0G(r8, r0)
            r5.setText(r4)
            android.content.res.Resources r1 = r7.getResources()
            r0 = 2131166717(0x7f0705fd, float:1.7947687E38)
            int r0 = X.AnonymousClass4L0.A01(r1, r0)
            r4 = 0
            if (r2 == 0) goto L_0x0395
            r0 = 0
        L_0x0395:
            r5.setPadding(r4, r4, r4, r0)
            r0 = 2131430648(0x7f0b0cf8, float:1.8483003E38)
            android.view.View r1 = X.C06560Yg.A02(r8, r0)
            int r0 = X.C86614Ku.A09(r2)
            r1.setVisibility(r0)
            r1.setOnClickListener(r6)
            r7.setVisibility(r4)
            goto L_0x032f
        L_0x03ad:
            r7 = 0
            goto L_0x0262
        L_0x03b0:
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto L_0x0013
            X.5IV r0 = r3.A3P
            X.5Rl r1 = r0.A00
            java.lang.String r0 = "no_welcome_message"
            r1.A02(r0, r2)
            X.5RH r0 = r3.A3T
            X.5Py r2 = r0.A0P
            X.4rk r1 = new X.4rk
            r1.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r1.A03 = r0
            X.4FV r0 = r2.A01
            r0.BhD(r1)
            return
        L_0x03d4:
            java.lang.Object r3 = r12.A00
            X.5l7 r3 = (X.C113245l7) r3
            java.lang.Object r1 = r12.A01
            com.whatsapp.jid.GroupJid r1 = (com.whatsapp.jid.GroupJid) r1
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = r0.equals(r13)
            if (r0 == 0) goto L_0x0013
            X.3Wi r0 = r3.A1Z
            r0.A0D()
            X.676 r0 = r3.A2z
            X.5ZU r0 = r0.getWAContactNames()
            java.lang.String r2 = r0.A0T(r1)
            X.4eZ r1 = X.C113245l7.A09(r3)
            if (r2 != 0) goto L_0x040a
            r0 = 2131889205(0x7f120c35, float:1.9413067E38)
            java.lang.String r2 = r1.getString(r0)
        L_0x0400:
            X.67D r1 = r3.A2N
            X.4eZ r0 = X.C113245l7.A09(r3)
            r1.BJc(r0, r2)
            return
        L_0x040a:
            r0 = 2131889204(0x7f120c34, float:1.9413065E38)
            java.lang.String r2 = X.C86604Kt.A0m(r1, r2, r0)
            goto L_0x0400
        L_0x0412:
            java.lang.Object r5 = r12.A00
            X.5kg r5 = (X.C112975kg) r5
            java.lang.Object r7 = r12.A01
            com.whatsapp.reactions.ReactionsTrayViewModel r7 = (com.whatsapp.reactions.ReactionsTrayViewModel) r7
            X.5Q4 r13 = (X.AnonymousClass5Q4) r13
            boolean r0 = r13.A02
            if (r0 == 0) goto L_0x0013
            X.34x r6 = r7.A0G
            X.C626936e.A06(r6)
            boolean r0 = X.AnonymousClass2z0.A0C(r6)
            if (r0 == 0) goto L_0x0445
            X.2sH r1 = r7.A06
            X.34x r0 = r7.A0G
            X.C18260x0.A0O(r1, r0)
            long r3 = X.C56612sH.A04(r1, r0)
            r1 = 2592000000(0x9a7ec800, double:1.280618154E-314)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0445
            X.107 r0 = r7.A0D
            X.AnonymousClass0x7.A18(r0)
            return
        L_0x0445:
            r5.Bqw(r6)
            java.lang.String r0 = r13.A01
            boolean r2 = X.C18320x8.A1U(r0)
            X.33m r1 = r5.A07
            java.lang.String r0 = r13.A00
            boolean r0 = r1.A0a(r6, r0, r2)
            if (r0 != 0) goto L_0x0013
            X.4eZ r1 = X.C112975kg.A00(r5)
            r0 = 106(0x6a, float:1.49E-43)
            X.C621433s.A01(r1, r0)
            return
        L_0x0462:
            java.lang.Object r3 = r12.A00
            X.4Rd r3 = (X.AnonymousClass4Rd) r3
            java.lang.Object r2 = r12.A01
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = r0.equals(r13)
            if (r0 == 0) goto L_0x0013
            X.3Wi r0 = r3.A01
            r0.A0D()
            X.5ZU r1 = r3.A06
            X.1fJ r0 = r3.A0A
            java.lang.String r1 = r1.A0T(r0)
            if (r1 != 0) goto L_0x048e
            r0 = 2131889205(0x7f120c35, float:1.9413067E38)
            java.lang.String r1 = r2.getString(r0)
        L_0x0488:
            X.3Ej r0 = r3.A04
            r0.BJc(r2, r1)
            return
        L_0x048e:
            r0 = 2131889204(0x7f120c34, float:1.9413065E38)
            java.lang.String r1 = X.C86604Kt.A0m(r2, r1, r0)
            goto L_0x0488
        L_0x0496:
            java.lang.Object r3 = r12.A00
            com.whatsapp.community.CommunityHomeActivity r3 = (com.whatsapp.community.CommunityHomeActivity) r3
            java.lang.Object r1 = r12.A01
            X.5Qo r1 = (X.C104335Qo) r1
            X.5AY r13 = (X.AnonymousClass5AY) r13
            r3.BjL()
            boolean r0 = r13 instanceof X.C91724kx
            if (r0 == 0) goto L_0x04af
            X.4kx r13 = (X.C91724kx) r13
            X.1fJ r0 = r3.A0p
            r1.A01(r13, r0)
            return
        L_0x04af:
            boolean r0 = r13 instanceof X.C91744kz
            if (r0 == 0) goto L_0x04bd
            r1 = 2131891659(0x7f1215cb, float:1.9418044E38)
            r0 = 2131892992(0x7f121b00, float:1.9420748E38)
            r3.BpA(r1, r0)
            return
        L_0x04bd:
            boolean r0 = r13 instanceof X.C91704kv
            if (r0 == 0) goto L_0x04d3
            X.4kv r13 = (X.C91704kv) r13
            X.3Wi r2 = r3.A05
            int r1 = X.C29441ip.A00(r3)
            r0 = 0
            r2.A0H(r1, r0)
            X.4GP r0 = r13.A00
            r0.invoke()
            return
        L_0x04d3:
            boolean r0 = r13 instanceof X.C91714kw
            if (r0 == 0) goto L_0x0013
            X.4kw r13 = (X.C91714kw) r13
            r1.A00(r13)
            return
        L_0x04dd:
            java.lang.Object r2 = r12.A00
            com.whatsapp.biz.product.view.activity.ProductDetailActivity r2 = (com.whatsapp.biz.product.view.activity.ProductDetailActivity) r2
            java.lang.Object r1 = r12.A01
            X.5dt r1 = (X.C108985dt) r1
            java.lang.String r13 = (java.lang.String) r13
            r2.BjL()
            boolean r0 = android.text.TextUtils.isEmpty(r13)
            if (r0 != 0) goto L_0x0013
            java.lang.String r0 = "success"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x0883
            r2.A78(r1)
            com.whatsapp.biz.catalog.view.PostcodeChangeBottomSheet r0 = r2.A04
            if (r0 == 0) goto L_0x0013
            r0.A1b()
            return
        L_0x0503:
            java.lang.Object r2 = r12.A00
            com.whatsapp.biz.catalog.view.activity.ProductListActivity r2 = (com.whatsapp.biz.catalog.view.activity.ProductListActivity) r2
            java.lang.Object r3 = r12.A01
            android.view.MenuItem r3 = (android.view.MenuItem) r3
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r0 = r13.booleanValue()
            if (r0 == 0) goto L_0x0518
            java.lang.String r1 = r2.A0R
            r0 = 1
            if (r1 != 0) goto L_0x0519
        L_0x0518:
            r0 = 0
        L_0x0519:
            r3.setVisible(r0)
            X.4XL r1 = r2.A0H
            java.lang.Boolean r0 = r1.A03
            boolean r0 = r13.equals(r0)
            if (r0 != 0) goto L_0x052b
            r1.A03 = r13
            r1.A05()
        L_0x052b:
            r2.A75()
            boolean r0 = r2.A0V
            if (r0 != 0) goto L_0x0013
            X.7KG r1 = r2.A0C
            if (r1 == 0) goto L_0x0013
            r0 = 1
            r2.A0V = r0
            X.5Tt r4 = r2.A0D
            X.5P6 r3 = new X.5P6
            r3.<init>()
            java.lang.String r0 = r1.A02
            r3.A0A = r0
            int r0 = r1.A00
            X.AnonymousClass5P6.A05(r3, r4, r0)
            long r0 = r1.A01
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r3.A09 = r0
            java.lang.Integer r0 = X.C18290x4.A0b()
            r3.A06 = r0
            r0 = 23
            X.AnonymousClass5P6.A03(r3, r0)
            X.4Tu r0 = r2.A0I
            X.5Qn r0 = r0.A06
            X.0Wx r0 = r0.A03
            X.AnonymousClass5P6.A01(r0, r3)
            com.whatsapp.jid.UserJid r0 = r2.A0L
            r3.A00 = r0
            X.4Ty r0 = r2.A0B
            X.08M r0 = r0.A00
            java.lang.Object r0 = r0.A07()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            r3.A01 = r0
            r4.A03(r3)
            r0 = 0
            r2.A0C = r0
            return
        L_0x057c:
            java.lang.Object r2 = r12.A00
            X.4hW r2 = (X.C90504hW) r2
            java.lang.Object r3 = r12.A01
            android.view.MenuItem r3 = (android.view.MenuItem) r3
            boolean r0 = X.AnonymousClass001.A1Z(r13)
            if (r0 == 0) goto L_0x058f
            java.lang.String r1 = r2.A0Q
            r0 = 1
            if (r1 != 0) goto L_0x0590
        L_0x058f:
            r0 = 0
        L_0x0590:
            r3.setVisible(r0)
            boolean r0 = r2.A0S
            if (r0 != 0) goto L_0x0013
            X.7KG r0 = r2.A0B
            if (r0 == 0) goto L_0x0013
            r0 = 1
            r2.A0S = r0
            android.content.Intent r1 = r2.getIntent()
            java.lang.String r0 = "source"
            java.io.Serializable r5 = r1.getSerializableExtra(r0)
            java.lang.Integer r5 = (java.lang.Integer) r5
            X.5Tt r4 = r2.A0C
            X.5P6 r3 = new X.5P6
            r3.<init>()
            X.7KG r1 = r2.A0B
            java.lang.String r0 = r1.A02
            r3.A0A = r0
            int r0 = r1.A00
            X.AnonymousClass5P6.A05(r3, r4, r0)
            long r0 = r1.A01
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r3.A09 = r0
            java.lang.Integer r0 = X.C18290x4.A0b()
            r3.A06 = r0
            r0 = 23
            X.AnonymousClass5P6.A03(r3, r0)
            com.whatsapp.jid.UserJid r0 = r2.A0M
            r3.A00 = r0
            X.4Tz r0 = r2.A0I
            X.5Qn r0 = r0.A0O
            X.0Wx r0 = r0.A03
            X.AnonymousClass5P6.A01(r0, r3)
            r3.A07 = r5
            X.4Ty r0 = r2.A07
            X.08M r0 = r0.A00
            java.lang.Object r0 = r0.A07()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            r3.A01 = r0
            r4.A03(r3)
            r0 = 0
            r2.A0B = r0
            return
        L_0x05f1:
            java.lang.Object r2 = r12.A00
            X.5Kx r2 = (X.C102955Kx) r2
            java.lang.Object r0 = r12.A01
            X.0Wx r0 = (X.C06270Wx) r0
            X.7O4 r1 = r2.A08
            java.lang.Object r0 = r0.A07()
            boolean r0 = X.AnonymousClass000.A1W(r0)
            r1.A03 = r0
            X.08J r0 = r2.A02
            r0.A0G(r1)
            return
        L_0x060b:
            java.lang.Object r7 = r12.A00
            com.whatsapp.reactions.ReactionsBottomSheetDialogFragment r7 = (com.whatsapp.reactions.ReactionsBottomSheetDialogFragment) r7
            java.lang.Object r1 = r12.A01
            android.view.LayoutInflater r1 = (android.view.LayoutInflater) r1
            java.util.List r13 = (java.util.List) r13
            boolean r0 = r13.isEmpty()
            if (r0 == 0) goto L_0x061f
            r7.A1L()
            return
        L_0x061f:
            X.33j r10 = r7.A0E
            int r8 = r13.size()
            android.content.Context r9 = r1.getContext()
            r0 = 2131625879(0x7f0e0797, float:1.8878978E38)
            android.view.View r6 = X.C18310x6.A0H(r1, r0)
            r0 = 2131432863(0x7f0b159f, float:1.8487495E38)
            android.widget.TextView r5 = X.C18300x5.A0G(r6, r0)
            android.content.res.Resources r3 = r9.getResources()
            r2 = 2131755288(0x7f100118, float:1.9141451E38)
            java.lang.Object[] r1 = X.AnonymousClass002.A0L()
            r4 = 0
            java.lang.String r0 = X.C107165ao.A01(r9, r10, r8)
            r1[r4] = r0
            X.C86614Ku.A16(r3, r5, r1, r2, r8)
            java.lang.String r3 = X.C107165ao.A01(r9, r10, r8)
            android.content.res.Resources r2 = r9.getResources()
            r1 = 2131755286(0x7f100116, float:1.9141447E38)
            java.lang.Object[] r0 = X.AnonymousClass002.A0L()
            r0[r4] = r3
            java.lang.String r0 = r2.getQuantityString(r1, r8, r0)
            r6.setContentDescription(r0)
            r7.A1a(r6, r4)
            return
        L_0x0668:
            java.lang.Object r4 = r12.A00
            X.4el r4 = (X.C89704el) r4
            java.lang.Object r3 = r12.A01
            r0 = 1
            X.C162457s7.A0J(r3, r0)
            X.4FS r2 = r4.A04
            r1 = 7
            X.3Zz r0 = new X.3Zz
            r0.<init>(r4, r1, r3)
            r2.BkP(r0)
            return
        L_0x067e:
            java.lang.Object r4 = r12.A00
            X.4el r4 = (X.C89704el) r4
            java.lang.Object r3 = r12.A01
            android.content.DialogInterface r13 = (android.content.DialogInterface) r13
            X.4FS r2 = r4.A04
            r1 = 5
            X.3Zz r0 = new X.3Zz
            r0.<init>(r4, r1, r3)
            r2.BkP(r0)
            goto L_0x0761
        L_0x0693:
            java.lang.Object r3 = r12.A00
            com.whatsapp.newsletter.ui.directory.NewsletterDirectoryActivity r3 = (com.whatsapp.newsletter.ui.directory.NewsletterDirectoryActivity) r3
            java.lang.Object r2 = r12.A01
            X.5Sx r2 = (X.C104935Sx) r2
            android.content.DialogInterface r13 = (android.content.DialogInterface) r13
            X.21F r0 = r2.A03
            int r1 = r0.ordinal()
            r0 = 3
            if (r1 == r0) goto L_0x06d1
            r0 = 2
            if (r1 != r0) goto L_0x0761
            com.whatsapp.newsletter.viewmodel.NewsletterListViewModel r0 = r3.A0G
            if (r0 != 0) goto L_0x06b4
            java.lang.String r0 = "newsletterListViewModel"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x06b4:
            X.5m4 r0 = r0.A03
            X.08M r0 = r0.A00
            java.lang.Object r1 = r0.A07()
            java.util.Map r1 = (java.util.Map) r1
            if (r1 == 0) goto L_0x0761
            X.4uY r0 = r2.A02
            java.lang.Object r0 = r1.get(r0)
            X.5Rp r0 = (X.C104595Rp) r0
            if (r0 == 0) goto L_0x0761
            X.1RL r0 = r0.A00
            r3.A76(r0)
            goto L_0x0761
        L_0x06d1:
            X.4uY r2 = r2.A02
            com.whatsapp.newsletter.viewmodel.NewsletterListViewModel r1 = r3.A0G
            if (r1 != 0) goto L_0x06de
            java.lang.String r0 = "newsletterListViewModel"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x06de:
            r0 = 0
            X.C162457s7.A0J(r2, r0)
            X.2se r0 = r1.A04
            r0.A0A(r2)
            goto L_0x0761
        L_0x06e8:
            java.lang.Object r3 = r12.A00
            com.whatsapp.newsletter.NewsletterInfoActivity r3 = (com.whatsapp.newsletter.NewsletterInfoActivity) r3
            java.lang.Object r0 = r12.A01
            X.5Sx r0 = (X.C104935Sx) r0
            android.content.DialogInterface r13 = (android.content.DialogInterface) r13
            X.21F r0 = r0.A03
            int r2 = r0.ordinal()
            r1 = 1
            r0 = 3
            if (r2 == r0) goto L_0x071f
            r0 = 2
            if (r2 == r0) goto L_0x071b
            if (r2 == r1) goto L_0x070f
            r0 = 0
            if (r2 != r0) goto L_0x0761
            androidx.appcompat.widget.SwitchCompat r0 = r3.A09
            if (r0 == 0) goto L_0x0761
            r0.setSelected(r1)
            r3.A7P()
            goto L_0x0761
        L_0x070f:
            r1 = 0
            androidx.appcompat.widget.SwitchCompat r0 = r3.A09
            if (r0 == 0) goto L_0x0761
            r0.setSelected(r1)
            r3.A7T()
            goto L_0x0761
        L_0x071b:
            r3.A7O()
            goto L_0x0761
        L_0x071f:
            r3.A7S()
            goto L_0x0761
        L_0x0723:
            java.lang.Object r4 = r12.A00
            com.whatsapp.group.GroupProfileEmojiEditor r4 = (com.whatsapp.group.GroupProfileEmojiEditor) r4
            java.lang.Object r3 = r12.A01
            X.8mX r3 = (X.C181298mX) r3
            java.lang.Number r13 = (java.lang.Number) r13
            X.2xc r2 = r4.A09
            int r1 = r13.intValue()
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r0.<init>(r1)
            android.graphics.drawable.Drawable r1 = X.C86654Ky.A0F(r0, r3, r2)
            android.widget.ImageView r0 = r4.A04
            r0.setBackground(r1)
            return
        L_0x0742:
            java.lang.Object r3 = r12.A00
            X.4mO r3 = (X.C92284mO) r3
            java.lang.Object r0 = r12.A01
            X.5Sx r0 = (X.C104935Sx) r0
            android.content.DialogInterface r13 = (android.content.DialogInterface) r13
            X.21F r0 = r0.A03
            int r2 = r0.ordinal()
            r0 = 2
            if (r2 == r0) goto L_0x076d
            r1 = 0
            if (r2 == r1) goto L_0x0769
            r0 = 1
            if (r2 == r0) goto L_0x0765
            r0 = 3
            if (r2 != r0) goto L_0x0761
            r3.A0A()
        L_0x0761:
            r13.dismiss()
            return
        L_0x0765:
            r3.A0E(r1)
            goto L_0x0761
        L_0x0769:
            r3.A0D(r1)
            goto L_0x0761
        L_0x076d:
            r3.A08()
            goto L_0x0761
        L_0x0771:
            java.lang.Object r6 = r12.A00
            com.whatsapp.community.CommunitySubgroupsBottomSheet r6 = (com.whatsapp.community.CommunitySubgroupsBottomSheet) r6
            java.lang.Object r1 = r12.A01
            X.1fJ r1 = (X.C27991fJ) r1
            java.util.List r13 = (java.util.List) r13
            java.util.HashSet r5 = X.AnonymousClass002.A0K()
            X.2so r0 = r6.A0B
            boolean r0 = r0.A0F(r1)
            r4 = 0
            if (r0 == 0) goto L_0x0791
            r1 = 0
            X.7HP r0 = new X.7HP
            r0.<init>(r1, r4)
            r5.add(r0)
        L_0x0791:
            java.util.Iterator r3 = r13.iterator()
        L_0x0795:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x07b5
            java.lang.Object r2 = r3.next()
            X.2mC r2 = (X.C52882mC) r2
            X.2sj r1 = r6.A0T
            com.whatsapp.jid.GroupJid r0 = r2.A02
            boolean r0 = r1.A0C(r0)
            if (r0 == 0) goto L_0x0795
            r1 = 1
            X.7HP r0 = new X.7HP
            r0.<init>(r1, r2)
            r5.add(r0)
            goto L_0x0795
        L_0x07b5:
            r1 = 2
            X.7HP r0 = new X.7HP
            r0.<init>(r1, r4)
            r5.add(r0)
            X.0QY r0 = r6.A00
            r0.A04(r5)
            return
        L_0x07c4:
            java.lang.Object r1 = r12.A00
            android.os.Bundle r1 = (android.os.Bundle) r1
            java.lang.Object r0 = r12.A01
            com.whatsapp.chatlock.dialogs.ClearLockedChatsDialogFragment r0 = (com.whatsapp.chatlock.dialogs.ClearLockedChatsDialogFragment) r0
            com.whatsapp.chatlock.dialogs.ClearLockedChatsDialogFragment.A01(r1, r0)
            return
        L_0x07d0:
            java.lang.Object r1 = r12.A00
            android.os.Bundle r1 = (android.os.Bundle) r1
            java.lang.Object r0 = r12.A01
            com.whatsapp.chatlock.dialogs.ClearLockedChatsDialogFragment r0 = (com.whatsapp.chatlock.dialogs.ClearLockedChatsDialogFragment) r0
            com.whatsapp.chatlock.dialogs.ClearLockedChatsDialogFragment.A00(r1, r0)
            return
        L_0x07dc:
            java.lang.Object r1 = r12.A00
            android.os.Bundle r1 = (android.os.Bundle) r1
            java.lang.Object r0 = r12.A01
            com.whatsapp.chatlock.dialogs.ChatsAreLockedDialogFragment r0 = (com.whatsapp.chatlock.dialogs.ChatsAreLockedDialogFragment) r0
            com.whatsapp.chatlock.dialogs.ChatsAreLockedDialogFragment.A01(r1, r0)
            return
        L_0x07e8:
            java.lang.Object r1 = r12.A00
            android.os.Bundle r1 = (android.os.Bundle) r1
            java.lang.Object r0 = r12.A01
            com.whatsapp.chatlock.dialogs.ChatsAreLockedDialogFragment r0 = (com.whatsapp.chatlock.dialogs.ChatsAreLockedDialogFragment) r0
            com.whatsapp.chatlock.dialogs.ChatsAreLockedDialogFragment.A00(r1, r0)
            return
        L_0x07f4:
            java.lang.Object r0 = r12.A00
            X.5nj r0 = (X.C114865nj) r0
            java.lang.Object r4 = r12.A01
            android.view.View r4 = (android.view.View) r4
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            com.whatsapp.biz.linkedaccounts.LinkedAccountMediaViewFragment r3 = r0.A00
            if (r13 == 0) goto L_0x0809
            boolean r1 = r13.booleanValue()
            r0 = 1
            if (r1 != 0) goto L_0x080a
        L_0x0809:
            r0 = 0
        L_0x080a:
            r3.A0H = r0
            android.view.ViewGroup$MarginLayoutParams r2 = X.AnonymousClass001.A0T(r4)
            if (r0 == 0) goto L_0x0823
            android.content.res.Resources r1 = X.C08310eF.A09(r3)
            r0 = 2131165286(0x7f070066, float:1.7944785E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r2.topMargin = r0
        L_0x081f:
            r4.setLayoutParams(r2)
            return
        L_0x0823:
            r0 = 0
            r2.topMargin = r0
            r2.bottomMargin = r0
            goto L_0x081f
        L_0x0829:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x082c:
            r0 = 1
            r1.A08 = r0
            r0 = 3000(0xbb8, float:4.204E-42)
            r1.A0E(r0)
            return
        L_0x0835:
            r3.A0z()
            X.5IV r0 = r3.A3P
            X.2hn r2 = r0.A02
            X.4uZ r0 = r3.A4J
            com.whatsapp.jid.UserJid r1 = X.AnonymousClass32Y.A03(r0)
            r0 = 12
            r2.A01(r1, r0)
            boolean r0 = r4.A04
            if (r0 == 0) goto L_0x085f
            X.5RH r0 = r3.A3T
            X.5Py r2 = r0.A0P
            X.4rk r1 = new X.4rk
            r1.<init>()
            java.lang.Integer r0 = X.C18290x4.A0Z()
            r1.A03 = r0
            X.4FV r0 = r2.A01
            r0.BhD(r1)
        L_0x085f:
            X.5IV r0 = r3.A3P
            X.5Rl r5 = r0.A00
            boolean r0 = r4.A03
            if (r0 != 0) goto L_0x0868
            r7 = 0
        L_0x0868:
            java.lang.String r4 = "preview_load_fail"
            r3 = 1029386189(0x3d5b2fcd, float:0.053512383)
            r2 = 3
            if (r7 == 0) goto L_0x087a
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "icebreaker_"
            java.lang.String r4 = X.AnonymousClass000.A0V(r0, r4, r1)
        L_0x087a:
            r5.A02(r4, r2)
            X.8JP r0 = r5.A01
            r0.markerPoint(r3, r4)
            return
        L_0x0883:
            java.lang.String r0 = "unserviceable_location"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x0892
            r0 = 2131894635(0x7f12216b, float:1.942408E38)
        L_0x088e:
            r2.Bot(r0)
            return
        L_0x0892:
            java.lang.String r0 = "invalid_postcode"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x08a0
            com.whatsapp.biz.catalog.view.PostcodeChangeBottomSheet r0 = r2.A04
            r0.A1c()
            return
        L_0x08a0:
            r0 = 2131893926(0x7f121ea6, float:1.9422642E38)
            goto L_0x088e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C100385As.BOf(java.lang.Object):void");
    }
}
