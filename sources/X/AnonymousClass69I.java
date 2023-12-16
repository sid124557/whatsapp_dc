package X;

/* renamed from: X.69I  reason: invalid class name */
public class AnonymousClass69I implements C181198mM {
    public Object A00;
    public final int A01;

    public AnonymousClass69I(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00ac, code lost:
        if (X.AnonymousClass34G.A02(r2.A08, r2.A0y) < r2.A0D.A0N(5645)) goto L_0x00ae;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void BNx(com.google.android.material.button.MaterialButtonToggleGroup r10, int r11, boolean r12) {
        /*
            r9 = this;
            int r0 = r9.A01
            if (r0 == 0) goto L_0x0100
            java.lang.Object r2 = r9.A00
            com.whatsapp.status.playback.MessageReplyActivity r2 = (com.whatsapp.status.playback.MessageReplyActivity) r2
            if (r12 == 0) goto L_0x002b
            android.widget.GridLayout r1 = r2.A09
            java.lang.String r0 = "hasAvatar="
            r5 = 4
            if (r1 != 0) goto L_0x002c
            X.2r2 r3 = r2.A10
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r0)
            X.2gs r0 = r2.A0z
            boolean r0 = r0.A01()
            java.lang.String r1 = X.C18300x5.A0m(r1, r0)
            java.lang.String r0 = "failed_to_select_reaction_tab_null_avatar_grid"
        L_0x0023:
            r3.A02(r5, r0, r1)
        L_0x0026:
            android.graphics.Bitmap r0 = r2.A01
            r2.A7B(r0)
        L_0x002b:
            return
        L_0x002c:
            android.widget.GridLayout r4 = r2.A0A
            if (r4 != 0) goto L_0x0043
            X.2r2 r3 = r2.A10
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r0)
            X.2gs r0 = r2.A0z
            boolean r0 = r0.A01()
            java.lang.String r1 = X.C18300x5.A0m(r1, r0)
            java.lang.String r0 = "failed_to_select_reaction_tab_null_emoji_grid"
            goto L_0x0023
        L_0x0043:
            r0 = 2131429739(0x7f0b096b, float:1.848116E38)
            r3 = 8
            r1 = 0
            if (r11 != r0) goto L_0x006c
            r4.setVisibility(r1)
            android.widget.GridLayout r0 = r2.A09
            r0.setVisibility(r3)
            android.widget.FrameLayout r0 = r2.A08
            r2.setStatusReactionsEmojiLayout(r0)
            X.59M r1 = X.AnonymousClass59M.EMOJI
        L_0x005a:
            r2.A14 = r1
            X.33p r0 = r2.A09
            java.lang.String r3 = r1.name()
            android.content.SharedPreferences$Editor r1 = X.C18270x1.A03(r0)
            java.lang.String r0 = "status_reactions_type_selected_tab"
            X.C18270x1.A0j(r1, r0, r3)
            goto L_0x0026
        L_0x006c:
            r0 = 2131427852(0x7f0b020c, float:1.8477332E38)
            if (r11 != r0) goto L_0x0026
            r4.setVisibility(r3)
            android.widget.GridLayout r0 = r2.A09
            r0.setVisibility(r1)
            com.whatsapp.status.playback.avatar.AvatarReactionRepository r4 = r2.A15
            boolean r0 = X.AnonymousClass4SG.A43(r2)
            if (r0 == 0) goto L_0x00ae
            boolean r0 = X.AnonymousClass4SG.A40(r2)
            if (r0 == 0) goto L_0x00ae
            X.1VX r1 = r2.A0D
            r0 = 4196(0x1064, float:5.88E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x00ae
            X.1VX r1 = r2.A0D
            r0 = 5644(0x160c, float:7.909E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x00ae
            X.2y5 r1 = r2.A0y
            X.33i r0 = r2.A08
            int r3 = X.AnonymousClass34G.A02(r0, r1)
            X.1VX r1 = r2.A0D
            r0 = 5645(0x160d, float:7.91E-42)
            int r0 = r1.A0N(r0)
            r8 = 1
            if (r3 >= r0) goto L_0x00af
        L_0x00ae:
            r8 = 0
        L_0x00af:
            X.5PV r0 = r2.A1Z
            java.lang.ref.WeakReference r5 = X.AnonymousClass0x9.A14(r0)
            java.lang.Object r1 = r5.get()
            X.5PV r1 = (X.AnonymousClass5PV) r1
            if (r1 == 0) goto L_0x00c2
            java.util.List r0 = r4.A01
            r1.A01(r0)
        L_0x00c2:
            X.3gB r1 = r4.A05
            r6 = 0
            X.46U r0 = new X.46U
            r0.<init>(r6)
            X.4Gl r0 = X.C616031m.A00(r1, r0)
            X.4C6 r7 = X.AnonymousClass349.A02(r0)
            java.util.List r1 = r4.A01
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L_0x00e2
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x00e2
        L_0x00de:
            X.59M r1 = X.AnonymousClass59M.AVATAR
            goto L_0x005a
        L_0x00e2:
            java.util.Iterator r1 = r1.iterator()
        L_0x00e6:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00de
            java.lang.Object r0 = r1.next()
            boolean r0 = r0 instanceof X.C984851b
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x00e6
            com.whatsapp.status.playback.avatar.AvatarReactionRepository$startAsyncAvatarReactionFetch$2 r3 = new com.whatsapp.status.playback.avatar.AvatarReactionRepository$startAsyncAvatarReactionFetch$2
            r3.<init>(r4, r5, r6, r7, r8)
            r0 = 3
            X.C616131n.A02(r6, r3, r7, r6, r0)
            goto L_0x00de
        L_0x0100:
            java.lang.Object r3 = r9.A00
            com.whatsapp.newsletter.ui.reactions.NewsletterReactionsSheet r3 = (com.whatsapp.newsletter.ui.reactions.NewsletterReactionsSheet) r3
            r0 = 2131432869(0x7f0b15a5, float:1.8487508E38)
            if (r11 != r0) goto L_0x0123
            com.google.android.material.button.MaterialButton r1 = r3.A00
            X.6x7 r2 = X.C142386x7.A02
        L_0x010d:
            if (r1 == 0) goto L_0x0118
            r0 = 0
            if (r12 == 0) goto L_0x0115
            r0 = 2131233571(0x7f080b23, float:1.8083283E38)
        L_0x0115:
            r1.setIconResource(r0)
        L_0x0118:
            if (r12 == 0) goto L_0x002b
            X.4Ut r1 = r3.A0B
            if (r1 != 0) goto L_0x012d
            java.lang.RuntimeException r0 = X.C86604Kt.A0j()
            throw r0
        L_0x0123:
            r0 = 2131432870(0x7f0b15a6, float:1.848751E38)
            if (r11 != r0) goto L_0x002b
            com.google.android.material.button.MaterialButton r1 = r3.A01
            X.6x7 r2 = X.C142386x7.A03
            goto L_0x010d
        L_0x012d:
            r0 = 0
            X.C162457s7.A0J(r2, r0)
            X.08M r0 = r1.A04
            java.lang.Object r0 = r0.A07()
            X.7YM r0 = (X.AnonymousClass7YM) r0
            if (r0 == 0) goto L_0x002b
            java.util.List r0 = r0.A01
            int r0 = r0.indexOf(r2)
            r1.A0D(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass69I.BNx(com.google.android.material.button.MaterialButtonToggleGroup, int, boolean):void");
    }
}
