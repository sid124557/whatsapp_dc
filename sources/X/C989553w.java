package X;

/* renamed from: X.53w  reason: invalid class name and case insensitive filesystem */
public class C989553w extends C109665ez {
    public Object A00;
    public final int A01;

    public C989553w(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: com.whatsapp.identity.IdentityVerificationActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v28, resolved type: com.whatsapp.group.GroupPermissionsActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v36, resolved type: com.whatsapp.identity.IdentityVerificationActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v37, resolved type: com.whatsapp.identity.IdentityVerificationActivity} */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0256, code lost:
        ((androidx.fragment.app.DialogFragment) r0).A1K();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x025b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0264, code lost:
        X.C86634Kw.A1I(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0267, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x0518, code lost:
        r1 = new X.AnonymousClass4s5();
        r1.A04 = java.lang.Integer.valueOf(r0);
        r2.A07.BhD(r1);
        r2.A06.A1U();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x052d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:388:0x09a2, code lost:
        r4.startActivity(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:389:0x09a5, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:283:0x06ca  */
    /* JADX WARNING: Removed duplicated region for block: B:285:0x06d0  */
    /* JADX WARNING: Removed duplicated region for block: B:287:0x06da  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A07(android.view.View r26) {
        /*
            r25 = this;
            r6 = r26
            r2 = r25
            int r0 = r2.A01
            switch(r0) {
                case 0: goto L_0x02e7;
                case 1: goto L_0x0049;
                case 2: goto L_0x034b;
                case 3: goto L_0x0035;
                case 4: goto L_0x043a;
                case 5: goto L_0x047f;
                case 6: goto L_0x04a9;
                case 7: goto L_0x04b5;
                case 8: goto L_0x04ca;
                case 9: goto L_0x04dd;
                case 10: goto L_0x006a;
                case 11: goto L_0x050d;
                case 12: goto L_0x0513;
                case 13: goto L_0x00c8;
                case 14: goto L_0x00dc;
                case 15: goto L_0x00ed;
                case 16: goto L_0x0101;
                case 17: goto L_0x0147;
                case 18: goto L_0x0039;
                case 19: goto L_0x0041;
                case 20: goto L_0x0562;
                case 21: goto L_0x0709;
                case 22: goto L_0x0167;
                case 23: goto L_0x0228;
                case 24: goto L_0x025c;
                case 25: goto L_0x0726;
                case 26: goto L_0x0730;
                case 27: goto L_0x0738;
                case 28: goto L_0x0758;
                case 29: goto L_0x0761;
                case 30: goto L_0x0268;
                case 31: goto L_0x0779;
                case 32: goto L_0x07d3;
                case 33: goto L_0x07eb;
                case 34: goto L_0x07f8;
                case 35: goto L_0x080b;
                case 36: goto L_0x0828;
                case 37: goto L_0x085f;
                case 38: goto L_0x0872;
                case 39: goto L_0x087b;
                case 40: goto L_0x052e;
                case 41: goto L_0x029f;
                case 42: goto L_0x0883;
                case 43: goto L_0x08b2;
                case 44: goto L_0x098b;
                case 45: goto L_0x08e6;
                case 46: goto L_0x08f5;
                case 47: goto L_0x0035;
                case 48: goto L_0x02c3;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r1 = r2.A00
            X.5i6 r1 = (X.C111445i6) r1
            boolean r0 = r1.A0r
            if (r0 != 0) goto L_0x0034
            android.app.Activity r2 = r1.A0E
            X.5UF r1 = new X.5UF
            r1.<init>(r2)
            r0 = 2131233411(0x7f080a83, float:1.8082959E38)
            r1.A01 = r0
            java.lang.String[] r0 = X.C622534h.A09
            r1.A0D = r0
            r0 = 2131892377(0x7f121899, float:1.94195E38)
            r1.A03 = r0
            r0 = 2131892378(0x7f12189a, float:1.9419503E38)
            r1.A02 = r0
            android.content.Intent r1 = r1.A02()
            r0 = 35
            r2.startActivityForResult(r1, r0)
        L_0x0034:
            return
        L_0x0035:
            java.lang.Object r0 = r2.A00
            goto L_0x0256
        L_0x0039:
            java.lang.Object r0 = r2.A00
            com.whatsapp.emoji.search.EmojiSearchContainer r0 = (com.whatsapp.emoji.search.EmojiSearchContainer) r0
            com.whatsapp.InterceptingEditText r0 = r0.A04
            goto L_0x0264
        L_0x0041:
            java.lang.Object r0 = r2.A00
            com.whatsapp.emoji.search.EmojiSearchKeyboardContainer r0 = (com.whatsapp.emoji.search.EmojiSearchKeyboardContainer) r0
            com.whatsapp.InterceptingEditText r0 = r0.A04
            goto L_0x0264
        L_0x0049:
            java.lang.Object r7 = r2.A00
            X.5KX r7 = (X.AnonymousClass5KX) r7
            X.4UA r2 = r7.A03
            X.3Ls r0 = r2.A01
            if (r0 == 0) goto L_0x0034
            X.7Kq r0 = r0.A09
            if (r0 == 0) goto L_0x0034
            java.lang.String r1 = r0.A01
            java.lang.String r0 = "video/mp4"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0943
            java.lang.String r0 = "image/gif"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0943
            return
        L_0x006a:
            java.lang.Object r5 = r2.A00
            com.whatsapp.conversationslist.ConversationsFragment r5 = (com.whatsapp.conversationslist.ConversationsFragment) r5
            X.5hX r4 = r5.A0c
            android.content.Context r3 = r5.A1D()
            android.content.Context r0 = r5.A1D()
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r1 = r0.getPackageName()
            java.lang.String r0 = "com.whatsapp.conversationslist.ArchivedConversationsActivity"
            r2.setClassName(r1, r0)
            r4.A0A(r3, r2)
            com.whatsapp.conversationslist.ArchiveHeaderViewModel r4 = r5.A1R
            if (r4 == 0) goto L_0x0034
            X.4FV r3 = r5.A26
            X.08M r0 = r4.A01
            java.lang.Object r2 = r0.A07()
            r1 = 0
            if (r2 == 0) goto L_0x00c3
            java.lang.String r0 = "@"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x00bc
            r0 = 0
            r1 = 1
        L_0x00a1:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)
            X.1YA r1 = new X.1YA
            r1.<init>()
            if (r0 == 0) goto L_0x00b2
            java.lang.Long r0 = X.C18280x3.A0U(r0)
            r1.A01 = r0
        L_0x00b2:
            java.lang.String r0 = "Archive"
            r1.A02 = r0
            r1.A00 = r2
            r3.BhD(r1)
            return
        L_0x00bc:
            int r0 = r4.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x00a1
        L_0x00c3:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            goto L_0x00a1
        L_0x00c8:
            java.lang.Object r3 = r2.A00
            X.5Qz r3 = (X.C104445Qz) r3
            X.8oK r2 = r3.A02
            X.4qq r2 = (X.C94264qq) r2
            int r1 = r2.A00
            r0 = 3
            if (r1 == r0) goto L_0x0034
            r2.A0H(r0)
            r3.A00()
            return
        L_0x00dc:
            java.lang.Object r0 = r2.A00
            X.5KZ r0 = (X.AnonymousClass5KZ) r0
            X.8oK r1 = r0.A00
            X.4qq r1 = (X.C94264qq) r1
            int r0 = r1.A00
            if (r0 == 0) goto L_0x0034
            r0 = 0
            r1.A0H(r0)
            return
        L_0x00ed:
            java.lang.Object r3 = r2.A00
            X.5mw r3 = (X.C114375mw) r3
            X.8oK r2 = r3.A00
            X.4qq r2 = (X.C94264qq) r2
            int r1 = r2.A00
            r0 = 1
            if (r1 == r0) goto L_0x0034
            r2.A0H(r0)
            r3.A00()
            return
        L_0x0101:
            java.lang.Object r3 = r2.A00
            X.5RA r3 = (X.AnonymousClass5RA) r3
            X.8oK r2 = r3.A01
            X.4qq r2 = (X.C94264qq) r2
            int r1 = r2.A00
            r0 = 2
            if (r1 == r0) goto L_0x0034
            r2.A0H(r0)
            X.8oK r0 = r3.A01
            X.4c7 r0 = (X.C89224c7) r0
            r0.A0B()
            X.5Jq r0 = r3.A02
            android.view.View r0 = r0.A01
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0034
            X.5LY r0 = r3.A06
            X.33p r0 = r0.A05
            r2 = 1
            android.content.SharedPreferences$Editor r1 = X.C18270x1.A03(r0)
            java.lang.String r0 = "sticker_store_onboarding_badge_shown"
            X.C18270x1.A0l(r1, r0, r2)
            X.5Jq r0 = r3.A02
            r1 = 8
            android.view.View r0 = r0.A01
            r0.setVisibility(r1)
            X.5Jq r0 = r3.A02
            android.view.View r0 = r0.A01
            android.view.animation.Animation r0 = r0.getAnimation()
            if (r0 == 0) goto L_0x0034
            r0.cancel()
            return
        L_0x0147:
            java.lang.Object r2 = r2.A00
            X.4c7 r2 = (X.C89224c7) r2
            X.8oM r0 = r2.A0A
            if (r0 == 0) goto L_0x0156
            boolean r0 = r0.BHm()
            if (r0 != 0) goto L_0x0156
            return
        L_0x0156:
            r2.Bk0()
            com.whatsapp.emoji.search.EmojiSearchProvider r1 = r2.A0P
            boolean r0 = r1.A02
            if (r0 == 0) goto L_0x0034
            X.5Ok r0 = r2.A0B
            if (r0 == 0) goto L_0x0034
            r0.A00(r1)
            return
        L_0x0167:
            java.lang.Object r3 = r2.A00
            X.4qq r3 = (X.C94264qq) r3
            int r0 = r3.A00
            if (r0 != 0) goto L_0x017a
            X.8oM r0 = r3.A0A
            if (r0 == 0) goto L_0x017a
            boolean r0 = r0.BHm()
            if (r0 != 0) goto L_0x017a
            return
        L_0x017a:
            r3.Bk0()
            int r0 = r3.A00
            if (r0 != 0) goto L_0x018e
            com.whatsapp.emoji.search.EmojiSearchProvider r1 = r3.A0P
            boolean r0 = r1.A02
            if (r0 == 0) goto L_0x018e
            X.5Ok r0 = r3.A0B
            if (r0 == 0) goto L_0x018e
            r0.A00(r1)
        L_0x018e:
            int r1 = r3.A00
            r0 = 1
            if (r1 == r0) goto L_0x01db
            r0 = 2
            if (r1 == r0) goto L_0x019a
            r0 = 3
            if (r1 == r0) goto L_0x019a
            return
        L_0x019a:
            X.5RA r5 = r3.A0D
            if (r5 == 0) goto L_0x0034
            com.whatsapp.emoji.search.EmojiSearchProvider r0 = r3.A0P
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x0034
            X.5pX r0 = r5.A03
            if (r0 == 0) goto L_0x0034
            X.6oS r4 = r5.A05
            if (r4 == 0) goto L_0x01c6
            X.5pX r3 = r4.A06
            if (r3 == 0) goto L_0x01c6
            X.6pT r0 = r4.A0D
            r2 = 0
            if (r0 == 0) goto L_0x01d9
            java.util.List r1 = r0.A06
        L_0x01b7:
            X.6pR r0 = r4.A0E
            if (r0 == 0) goto L_0x01bd
            java.util.List r2 = r0.A03
        L_0x01bd:
            X.7rM r0 = r4.A0e
            java.util.List r0 = r0.A01(r1, r2)
            r3.A03(r0)
        L_0x01c6:
            X.5pX r3 = r5.A03
            X.8s7 r1 = r3.A02
            if (r1 == 0) goto L_0x0034
            X.4qq r0 = r3.A00
            if (r0 == 0) goto L_0x0034
            r0 = 1
            r3.A07 = r0
            com.whatsapp.picker.search.StickerSearchDialogFragment r0 = new com.whatsapp.picker.search.StickerSearchDialogFragment
            r0.<init>()
            goto L_0x01fd
        L_0x01d9:
            r1 = r2
            goto L_0x01b7
        L_0x01db:
            X.5mw r2 = r3.A0C
            if (r2 == 0) goto L_0x0034
            X.3Mh r1 = r3.A09
            X.1Ei r0 = X.C66663Mh.A0O
            boolean r0 = r1.A08(r0)
            if (r0 == 0) goto L_0x0208
            X.5pX r3 = r2.A04
            if (r3 == 0) goto L_0x0208
            X.8s7 r1 = r3.A02
            if (r1 == 0) goto L_0x0034
            X.4qq r0 = r3.A00
            if (r0 == 0) goto L_0x0034
            r0 = 1
            r3.A07 = r0
            com.whatsapp.picker.search.GifSearchDialogFragment r0 = new com.whatsapp.picker.search.GifSearchDialogFragment
            r0.<init>()
        L_0x01fd:
            r1.Bom(r0)
            X.4qq r0 = r3.A00
            if (r0 == 0) goto L_0x0034
            r0.dismiss()
            return
        L_0x0208:
            X.7Kr r5 = r2.A02
            if (r5 == 0) goto L_0x0034
            X.2r8 r4 = r2.A07
            r0 = 0
            X.C162457s7.A0J(r4, r0)
            X.4qq r1 = r5.A01
            com.whatsapp.WaEditText r0 = r1.A0K
            r1.A06(r0)
            X.4qu r3 = r5.A02
            com.whatsapp.gifsearch.GifSearchContainer r2 = r3.A02
            android.app.Activity r1 = r5.A00
            X.5mv r0 = new X.5mv
            r0.<init>(r3, r4)
            r2.A01(r1, r3, r4, r0)
            return
        L_0x0228:
            java.lang.Object r2 = r2.A00
            com.whatsapp.gifsearch.GifSearchContainer r2 = (com.whatsapp.gifsearch.GifSearchContainer) r2
            X.5S9 r0 = r2.A0B
            if (r0 == 0) goto L_0x0234
            r0.A03()
            return
        L_0x0234:
            com.whatsapp.WaEditText r1 = r2.A07
            if (r1 == 0) goto L_0x023f
            X.5Wv r0 = r2.getImeUtils()
            r0.A02(r1)
        L_0x023f:
            r0 = 8
            r2.setVisibility(r0)
            X.2r8 r1 = r2.A0G
            if (r1 == 0) goto L_0x024f
            X.4FV r0 = r2.getWamRuntime()
            X.AnonymousClass277.A00(r0, r1)
        L_0x024f:
            r0 = 0
            r2.A0G = r0
            X.8j0 r0 = r2.A0F
            if (r0 == 0) goto L_0x0034
        L_0x0256:
            androidx.fragment.app.DialogFragment r0 = (androidx.fragment.app.DialogFragment) r0
            r0.A1K()
            return
        L_0x025c:
            java.lang.Object r0 = r2.A00
            com.whatsapp.gifsearch.GifSearchContainer r0 = (com.whatsapp.gifsearch.GifSearchContainer) r0
            com.whatsapp.WaEditText r0 = r0.A07
            if (r0 == 0) goto L_0x0034
        L_0x0264:
            X.C86634Kw.A1I(r0)
            return
        L_0x0268:
            java.lang.Object r4 = r2.A00
            com.whatsapp.group.GroupChatInfoActivity r4 = (com.whatsapp.group.GroupChatInfoActivity) r4
            X.3Lq r0 = r4.A1T
            X.2rN r0 = r0.A1B
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x0034
            X.2ss r1 = r4.A0L
            X.1fJ r0 = r4.A7G()
            int r1 = r1.A06(r0)
            r0 = 2
            if (r1 == r0) goto L_0x096c
            r0 = 6
            if (r1 == r0) goto L_0x096c
            r0 = 2131894602(0x7f12214a, float:1.9424013E38)
            r4.Bot(r0)
            r0 = 2131430999(0x7f0b0e57, float:1.8483715E38)
            android.view.View r0 = X.C005205m.A00(r4, r0)
            r1 = 8
            r0.setVisibility(r1)
            r0 = 2131432983(0x7f0b1617, float:1.8487739E38)
            X.C86654Ky.A0s(r4, r0, r1)
            return
        L_0x029f:
            java.lang.Object r4 = r2.A00
            X.8j3 r4 = (X.C179378j3) r4
            com.whatsapp.group.GroupPermissionsActivity r4 = (com.whatsapp.group.GroupPermissionsActivity) r4
            X.1fJ r3 = r4.A0E
            if (r3 == 0) goto L_0x0034
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r1 = r4.getPackageName()
            java.lang.String r0 = "com.whatsapp.group.HistorySettingActivity"
            android.content.Intent r2 = r2.setClassName(r1, r0)
            java.lang.String r0 = "group_jid"
            X.AnonymousClass0x2.A0u(r2, r3, r0)
            r0 = 335544320(0x14000000, float:6.4623485E-27)
            r2.setFlags(r0)
            goto L_0x09a2
        L_0x02c3:
            java.lang.Object r2 = r2.A00
            com.whatsapp.languageselector.LanguageSelectorBottomSheet r2 = (com.whatsapp.languageselector.LanguageSelectorBottomSheet) r2
            X.65J r0 = r2.A04
            if (r0 == 0) goto L_0x0034
            com.whatsapp.BottomSheetListView r0 = r2.A00
            android.widget.ListAdapter r0 = r0.getAdapter()
            X.4OR r0 = (X.AnonymousClass4OR) r0
            int r1 = r0.A01()
            java.util.List r0 = r0.A02
            java.lang.Object r0 = r0.get(r1)
            X.7Hi r0 = (X.C148187Hi) r0
            X.65J r1 = r2.A04
            java.lang.String r0 = r0.A01
            r1.BQ5(r0)
            return
        L_0x02e7:
            java.lang.Object r0 = r2.A00
            X.5KX r0 = (X.AnonymousClass5KX) r0
            X.8sy r1 = r0.A02
            X.6BY r1 = (X.AnonymousClass6BY) r1
            int r0 = r1.A01
            if (r0 == 0) goto L_0x0330
            java.lang.Object r4 = r1.A00
            X.5l7 r4 = (X.C113245l7) r4
            X.4UA r1 = r4.A3D
            java.lang.String r0 = r1.A07
            r1.A0O(r0)
            java.util.HashMap r1 = X.C113245l7.A7S
            com.whatsapp.jid.Jid r0 = X.C113245l7.A0F(r4)
            java.lang.Object r3 = r1.get(r0)
            X.7Ns r3 = (X.C149747Ns) r3
            if (r3 == 0) goto L_0x032c
            X.5IV r0 = r4.A3P
            X.2hn r2 = r0.A02
            X.4uZ r0 = r4.A4J
            com.whatsapp.jid.UserJid r1 = X.AnonymousClass32Y.A03(r0)
            r0 = 5
            r2.A01(r1, r0)
            X.5RH r1 = r4.A3T
            boolean r3 = r3.A03
            X.4uZ r0 = r1.A0A
            if (r0 == 0) goto L_0x032c
            X.5Py r2 = r1.A0P
            java.lang.String r1 = r0.getRawString()
            r0 = 6
            r2.A00(r0, r1, r3)
        L_0x032c:
            r4.A0f()
            return
        L_0x0330:
            java.lang.Object r3 = r1.A00
            com.whatsapp.conversation.EditMessageActivity r3 = (com.whatsapp.conversation.EditMessageActivity) r3
            X.4UY r2 = r3.A0A
            X.4UA r1 = r2.A09
            java.lang.String r0 = r1.A07
            r1.A0O(r0)
            r0 = 1
            r2.A02 = r0
            r1 = 8
            android.view.ViewGroup r0 = r3.A02
            r0.setVisibility(r1)
            r3.A76()
            return
        L_0x034b:
            java.lang.Object r5 = r2.A00
            X.4pj r5 = (X.C94024pj) r5
            boolean r0 = r6 instanceof com.whatsapp.reactions.ReactionEmojiTextView
            if (r0 != 0) goto L_0x0359
            java.lang.String r1 = "Given view is not ReactionEmojiTextView."
            r0 = 0
            X.C626936e.A0D(r0, r1)
        L_0x0359:
            com.whatsapp.reactions.ReactionEmojiTextView r6 = (com.whatsapp.reactions.ReactionEmojiTextView) r6
            android.animation.AnimatorSet r0 = r5.A01
            if (r0 != 0) goto L_0x0365
            android.animation.AnimatorSet r0 = X.C86664Kz.A0O()
            r5.A01 = r0
        L_0x0365:
            boolean r0 = r0.isRunning()
            if (r0 == 0) goto L_0x0370
            android.animation.AnimatorSet r0 = r5.A01
            r0.cancel()
        L_0x0370:
            r4 = 0
        L_0x0371:
            int r0 = r5.getChildCount()
            if (r4 >= r0) goto L_0x0399
            android.view.View r3 = r5.getChildAt(r4)
            boolean r0 = r3 instanceof com.whatsapp.reactions.ReactionEmojiTextView
            if (r0 == 0) goto L_0x0396
            boolean r0 = r3.isSelected()
            if (r0 == 0) goto L_0x0396
            boolean r0 = r3.equals(r6)
            if (r0 != 0) goto L_0x0396
            android.animation.AnimatorSet r1 = r5.A01
            com.whatsapp.reactions.ReactionEmojiTextView r3 = (com.whatsapp.reactions.ReactionEmojiTextView) r3
            android.animation.Animator r0 = r5.A01(r3)
            r1.play(r0)
        L_0x0396:
            int r4 = r4 + 1
            goto L_0x0371
        L_0x0399:
            boolean r0 = r6.isSelected()
            android.animation.AnimatorSet r4 = r5.A01
            if (r0 == 0) goto L_0x03b9
            android.animation.Animator r3 = r5.A01(r6)
        L_0x03a5:
            r4.play(r3)
            android.animation.AnimatorSet r3 = r5.A01
            r1 = 1
            X.67K r0 = new X.67K
            r0.<init>(r2, r1, r6)
            r3.addListener(r0)
            android.animation.AnimatorSet r0 = r5.A01
            r0.start()
            return
        L_0x03b9:
            android.animation.AnimatorSet r3 = X.C86664Kz.A0O()
            r9 = 1065353216(0x3f800000, float:1.0)
            r11 = 1060320051(0x3f333333, float:0.7)
            r0 = 80
            float[] r8 = X.C86654Ky.A1b(r9)
            r7 = 1
            r8[r7] = r11
            java.lang.String r13 = "foregroundScale"
            android.animation.ObjectAnimator r7 = android.animation.ObjectAnimator.ofFloat(r6, r13, r8)
            android.animation.ObjectAnimator r10 = r7.setDuration(r0)
            android.view.animation.Interpolator r14 = X.C100865Co.A01
            r10.setInterpolator(r14)
            r8 = 0
            X.67H r0 = new X.67H
            r0.<init>(r6, r5, r11, r8)
            r10.addListener(r0)
            r7 = 2
            android.animation.Animator[] r12 = new android.animation.Animator[r7]
            r12[r8] = r10
            r0 = 80
            float[] r15 = new float[r7]
            r15[r8] = r11
            r11 = 1
            r15[r11] = r9
            android.animation.ObjectAnimator r13 = android.animation.ObjectAnimator.ofFloat(r6, r13, r15)
            android.animation.ObjectAnimator r1 = r13.setDuration(r0)
            r1.setInterpolator(r14)
            X.67H r0 = new X.67H
            r0.<init>(r6, r5, r9, r8)
            r1.addListener(r0)
            r12[r11] = r1
            r3.playSequentially(r12)
            r12 = 0
            r0 = 250(0xfa, double:1.235E-321)
            float[] r13 = new float[r7]
            r13[r8] = r12
            r13[r11] = r9
            java.lang.String r12 = "backgroundScale"
            android.animation.ObjectAnimator r12 = android.animation.ObjectAnimator.ofFloat(r6, r12, r13)
            android.animation.ObjectAnimator r1 = r12.setDuration(r0)
            X.67H r0 = new X.67H
            r0.<init>(r6, r5, r9, r11)
            r1.addListener(r0)
            android.view.animation.Interpolator r0 = X.C107165ao.A00
            r1.setInterpolator(r0)
            android.animation.Animator[] r0 = X.C86664Kz.A1b(r10, r1, r7, r8)
            r3.playTogether(r0)
            X.67K r0 = new X.67K
            r0.<init>(r5, r7, r6)
            r3.addListener(r0)
            goto L_0x03a5
        L_0x043a:
            java.lang.Object r6 = r2.A00
            X.5l7 r6 = (X.C113245l7) r6
            X.3ZH r0 = r6.A3n
            com.whatsapp.jid.UserJid r4 = X.AnonymousClass3ZH.A07(r0)
            X.5Tt r5 = r6.A20
            java.lang.String r3 = r6.A6F
            java.lang.String r1 = r6.A6E
            r0 = 7
            r5.A02(r0, r3, r1)
            X.5Tt r3 = r6.A20
            X.5P6 r1 = X.AnonymousClass5P6.A00(r3)
            X.5Tt r0 = r6.A20
            X.AnonymousClass5P6.A04(r1, r0)
            r0 = 42
            X.AnonymousClass5P6.A02(r1, r0)
            r1.A00 = r4
            r3.A03(r1)
            X.4FS r3 = X.C113245l7.A0G(r6)
            r1 = 47
            X.5sD r0 = new X.5sD
            r0.<init>((java.lang.Object) r2, (int) r1)
            r3.BkM(r0)
            X.676 r3 = r6.A2z
            X.5Lp r2 = r6.A4Z
            r1 = 4
            r0 = 0
            androidx.fragment.app.DialogFragment r0 = r2.A00(r4, r0, r1)
            r3.Boo(r0)
            return
        L_0x047f:
            java.lang.Object r3 = r2.A00
            X.5l7 r3 = (X.C113245l7) r3
            X.4VQ r1 = r3.A3B
            r0 = 0
            r1.A0S(r0)
            android.view.ViewGroup r0 = r3.A0W
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x04a5
            int r2 = r3.A05
            if (r2 < 0) goto L_0x04a5
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "conversation/hidelinkpreview/start "
            X.C18260x0.A0y(r0, r1, r2)
            android.view.ViewGroup r1 = r3.A0W
            android.view.View r0 = r3.A0H
            r3.A1g(r0, r1)
        L_0x04a5:
            r3.A0r()
            return
        L_0x04a9:
            java.lang.Object r0 = r2.A00
            X.4pn r0 = (X.C94064pn) r0
            android.view.ViewGroup r1 = r0.A02
            r0 = 8
            r1.setVisibility(r0)
            return
        L_0x04b5:
            java.lang.Object r2 = r2.A00
            X.4qR r2 = (X.C94234qR) r2
            com.whatsapp.conversationslist.ConversationsFragment r0 = r2.A06
            r0.A1U()
            r1 = 5
            r0 = 0
            X.4s5 r1 = r2.A03(r0, r0, r1)
            X.4FV r0 = r2.A07
            r0.BhD(r1)
            return
        L_0x04ca:
            java.lang.Object r0 = r2.A00
            X.0eF r0 = (X.C08310eF) r0
            X.03q r3 = r0.A0Q()
            r2 = 2131892358(0x7f121886, float:1.9419462E38)
            r1 = 2131892359(0x7f121887, float:1.9419464E38)
            r0 = 0
            com.whatsapp.RequestPermissionActivity.A0d(r3, r2, r1, r0)
            return
        L_0x04dd:
            java.lang.Object r6 = r2.A00
            com.whatsapp.conversationslist.ConversationsFragment r6 = (com.whatsapp.conversationslist.ConversationsFragment) r6
            X.5hX r5 = r6.A0c
            android.content.Context r4 = r6.A1D()
            r3 = 0
            android.content.Context r0 = r6.A1D()
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r1 = r0.getPackageName()
            java.lang.String r0 = "com.whatsapp.conversationslist.ArchivedConversationsActivity"
            r2.setClassName(r1, r0)
            r5.A0A(r4, r2)
            X.4FV r2 = r6.A26
            X.1YA r1 = new X.1YA
            r1.<init>()
            java.lang.String r0 = "Archive"
            r1.A02 = r0
            r1.A00 = r3
            r2.BhD(r1)
            return
        L_0x050d:
            java.lang.Object r2 = r2.A00
            X.5Ui r2 = (X.C105295Ui) r2
            r0 = 0
            goto L_0x0518
        L_0x0513:
            java.lang.Object r2 = r2.A00
            X.5Ui r2 = (X.C105295Ui) r2
            r0 = 1
        L_0x0518:
            X.4s5 r1 = new X.4s5
            r1.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A04 = r0
            X.4FV r0 = r2.A07
            r0.BhD(r1)
            com.whatsapp.conversationslist.ConversationsFragment r0 = r2.A06
            r0.A1U()
            return
        L_0x052e:
            java.lang.Object r5 = r2.A00
            com.whatsapp.group.GroupPermissionsActivity r5 = (com.whatsapp.group.GroupPermissionsActivity) r5
            X.1fJ r4 = r5.A0E
            X.66x r0 = r5.A0B
            if (r0 != 0) goto L_0x053d
            java.lang.RuntimeException r0 = X.C86604Kt.A0j()
            throw r0
        L_0x053d:
            java.util.List r3 = r0.B4H()
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r1 = r5.getPackageName()
            java.lang.String r0 = "com.whatsapp.group.EditGroupAdminsSelector"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "gid"
            X.AnonymousClass0x2.A0u(r2, r4, r0)
            java.lang.String r1 = "selected"
            java.util.ArrayList r0 = X.C627336j.A0A(r3)
            r2.putExtra(r1, r0)
            r0 = 17
            r5.startActivityForResult(r2, r0)
            return
        L_0x0562:
            java.lang.Object r4 = r2.A00
            com.whatsapp.events.EventCreationFragment r4 = (com.whatsapp.events.EventCreationFragment) r4
            X.66R r0 = r4.A0T
            java.lang.Object r9 = r0.getValue()
            X.11J r9 = (X.AnonymousClass11J) r9
            com.whatsapp.WaEditText r0 = r4.A05
            r3 = 0
            if (r0 == 0) goto L_0x05d6
            android.text.Editable r0 = r0.getText()
        L_0x0577:
            java.lang.String r2 = java.lang.String.valueOf(r0)
            java.util.Calendar r0 = r4.A1K()
            java.util.Date r0 = r0.getTime()
            long r23 = r0.getTime()
            com.whatsapp.WaEditText r0 = r4.A03
            if (r0 == 0) goto L_0x05d4
            android.text.Editable r0 = r0.getText()
        L_0x058f:
            java.lang.String r1 = java.lang.String.valueOf(r0)
            X.5UY r0 = r4.A0I
            if (r0 == 0) goto L_0x05a9
            android.view.View r0 = r0.A04()
            android.widget.EditText r0 = (android.widget.EditText) r0
            if (r0 == 0) goto L_0x05a9
            android.text.Editable r0 = r0.getText()
            if (r0 == 0) goto L_0x05a9
            java.lang.String r3 = r0.toString()
        L_0x05a9:
            r8 = 0
            java.lang.String r14 = X.C107635bd.A0B(r2, r8)
            X.C162457s7.A0D(r14)
            java.lang.String r13 = X.C107635bd.A0B(r1, r8)
            X.C162457s7.A0D(r13)
            int r0 = r14.length()
            r4 = 1
            boolean r0 = X.AnonymousClass000.A1T(r0)
            r7 = 0
            if (r0 == 0) goto L_0x05d8
            X.4C6 r3 = X.AnonymousClass0IV.A00(r9)
            X.3gB r2 = r9.A07
            com.whatsapp.events.EventCreationViewModel$onSendEvent$1 r1 = new com.whatsapp.events.EventCreationViewModel$onSendEvent$1
            r1.<init>(r9, r7)
            r0 = 2
            X.C616131n.A02(r2, r1, r3, r7, r0)
            return
        L_0x05d4:
            r0 = r3
            goto L_0x058f
        L_0x05d6:
            r0 = r3
            goto L_0x0577
        L_0x05d8:
            X.4Gt r2 = r9.A0C
            java.lang.Object r0 = r2.getValue()
            X.2yk r0 = (X.C60552yk) r0
            X.21P r0 = r0.A00
            int r1 = r0.ordinal()
            r0 = 3
            if (r1 == r4) goto L_0x06f1
            if (r1 != r0) goto L_0x06ff
            java.lang.Object r0 = r2.getValue()
            X.2yk r0 = (X.C60552yk) r0
            java.lang.String r11 = r0.A01
        L_0x05f3:
            X.33m r6 = r9.A01
            X.2pV r3 = r9.A05
            X.4uZ r2 = r9.A06
            X.2sH r0 = r9.A04
            long r21 = r0.A0H()
            X.4Gt r5 = r9.A0D
            java.lang.Object r0 = r5.getValue()
            X.2yl r0 = (X.C60562yl) r0
            com.whatsapp.location.PlaceInfo r0 = r0.A01
            if (r0 == 0) goto L_0x06ed
            double r0 = r0.A01
            java.lang.Double r17 = java.lang.Double.valueOf(r0)
        L_0x0611:
            java.lang.Object r0 = r5.getValue()
            X.2yl r0 = (X.C60562yl) r0
            com.whatsapp.location.PlaceInfo r0 = r0.A01
            if (r0 == 0) goto L_0x06ea
            double r0 = r0.A02
            java.lang.Double r12 = java.lang.Double.valueOf(r0)
        L_0x0621:
            java.lang.Object r0 = r5.getValue()
            X.2yl r0 = (X.C60562yl) r0
            com.whatsapp.location.PlaceInfo r0 = r0.A01
            if (r0 == 0) goto L_0x06e7
            java.lang.String r10 = r0.A06
        L_0x062d:
            java.lang.Object r0 = r5.getValue()
            X.2yl r0 = (X.C60562yl) r0
            com.whatsapp.location.PlaceInfo r0 = r0.A01
            if (r0 == 0) goto L_0x06e4
            java.lang.String r5 = r0.A04
        L_0x0639:
            long r15 = r9.A00
            X.2pV r0 = r6.A16
            boolean r1 = r0.A02(r2)
            if (r1 == 0) goto L_0x06de
            X.1VX r1 = r0.A04
            r0 = 5562(0x15ba, float:7.794E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x06de
            boolean r0 = X.C175738Zn.A0V(r14)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0702
            X.35J r0 = r3.A05
            X.2z0 r19 = r0.A04(r2, r4)
            java.lang.String r20 = X.AnonymousClass2AB.A00(r14)
            X.1mU r4 = new X.1mU
            r18 = r4
            r18.<init>(r19, r20, r21, r23)
            r14 = 0
            java.lang.String r0 = X.AnonymousClass2AB.A00(r13)
            r4.A02 = r0
            r13 = 0
            if (r17 != 0) goto L_0x06b9
            if (r12 != 0) goto L_0x06dc
            if (r10 != 0) goto L_0x06dc
            if (r5 != 0) goto L_0x06dc
            r1 = r7
        L_0x0677:
            r4.A01 = r1
            if (r11 == 0) goto L_0x067f
            java.lang.String r14 = X.AnonymousClass2AB.A00(r11)
        L_0x067f:
            r4.A03 = r14
            r4.A06 = r8
            r1 = 0
            int r0 = (r15 > r1 ? 1 : (r15 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x06b0
            X.4FS r1 = r6.A1r
            X.3aF r0 = new X.3aF
            r2 = r0
            r3 = r6
            r5 = r8
            r6 = r15
            r2.<init>(r3, r4, r5, r6)
            r1.BkM(r0)
        L_0x0697:
            X.4Gp r4 = r9.A0B
        L_0x0699:
            java.lang.Object r3 = r4.getValue()
            r0 = r3
            X.2yl r0 = (X.C60562yl) r0
            X.20W r2 = X.AnonymousClass20W.CLOSED
            com.whatsapp.location.PlaceInfo r1 = r0.A01
            X.2yl r0 = new X.2yl
            r0.<init>(r2, r1)
            boolean r0 = r4.AzD(r3, r0)
            if (r0 == 0) goto L_0x0699
            return
        L_0x06b0:
            java.lang.String r0 = "UserActions/sendEventMessage"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            X.C86654Ky.A1K(r6, r4, r7)
            goto L_0x0697
        L_0x06b9:
            if (r12 == 0) goto L_0x06dc
            double r2 = r17.doubleValue()
            double r0 = r12.doubleValue()
            X.2k9 r12 = new X.2k9
            r12.<init>(r2, r0)
        L_0x06c8:
            if (r10 == 0) goto L_0x06da
            java.lang.String r0 = X.AnonymousClass2AB.A00(r10)
        L_0x06ce:
            if (r5 == 0) goto L_0x06d4
            java.lang.String r13 = X.AnonymousClass2AB.A00(r5)
        L_0x06d4:
            X.2lS r1 = new X.2lS
            r1.<init>(r12, r0, r13)
            goto L_0x0677
        L_0x06da:
            r0 = r7
            goto L_0x06ce
        L_0x06dc:
            r12 = r7
            goto L_0x06c8
        L_0x06de:
            java.lang.String r0 = "UserActions/userActionSendEventCreation Event's creation ABProp is off"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            goto L_0x0697
        L_0x06e4:
            r5 = r7
            goto L_0x0639
        L_0x06e7:
            r10 = r7
            goto L_0x062d
        L_0x06ea:
            r12 = r7
            goto L_0x0621
        L_0x06ed:
            r17 = r7
            goto L_0x0611
        L_0x06f1:
            if (r3 == 0) goto L_0x06ff
            int r0 = r3.length()
            if (r0 == 0) goto L_0x06ff
            java.lang.String r11 = X.C107635bd.A0B(r3, r8)
            goto L_0x05f3
        L_0x06ff:
            r11 = r7
            goto L_0x05f3
        L_0x0702:
            java.lang.String r0 = "EventMessageManager/Event's Name cannot be blank or omitted"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)
            throw r0
        L_0x0709:
            java.lang.Object r0 = r2.A00
            com.whatsapp.expressionstray.avatars.AvatarExpressionsFragment r0 = (com.whatsapp.expressionstray.avatars.AvatarExpressionsFragment) r0
            X.66R r0 = r0.A0M
            java.lang.Object r0 = r0.getValue()
            com.whatsapp.expressionstray.avatars.AvatarExpressionsViewModel r0 = (com.whatsapp.expressionstray.avatars.AvatarExpressionsViewModel) r0
            X.4C6 r4 = X.AnonymousClass0IV.A00(r0)
            X.3gB r3 = r0.A0D
            r2 = 0
            com.whatsapp.expressionstray.avatars.AvatarExpressionsViewModel$onCreateAvatarButton$1 r1 = new com.whatsapp.expressionstray.avatars.AvatarExpressionsViewModel$onCreateAvatarButton$1
            r1.<init>(r0, r2)
            r0 = 2
            X.C616131n.A02(r3, r1, r4, r2, r0)
            return
        L_0x0726:
            java.lang.Object r1 = r2.A00
            com.whatsapp.gifsearch.GifSearchContainer r1 = (com.whatsapp.gifsearch.GifSearchContainer) r1
            java.lang.String r0 = r1.A0L
            r1.A02(r0)
            return
        L_0x0730:
            java.lang.Object r0 = r2.A00
            com.whatsapp.group.GroupAdminPickerActivity r0 = (com.whatsapp.group.GroupAdminPickerActivity) r0
            r0.A74()
            return
        L_0x0738:
            java.lang.Object r3 = r2.A00
            com.whatsapp.group.GroupChangedParticipantsBottomSheet r3 = (com.whatsapp.group.GroupChangedParticipantsBottomSheet) r3
            android.widget.FrameLayout r0 = r3.A01
            r2 = 0
            if (r0 == 0) goto L_0x074a
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            if (r1 == 0) goto L_0x074a
            r0 = -2
            r1.height = r0
        L_0x074a:
            android.widget.LinearLayout r0 = r3.A02
            X.AnonymousClass0x2.A0x(r0)
            android.view.View r0 = r3.A00
            X.C18270x1.A0p(r0)
            r3.A1Z(r2)
            return
        L_0x0758:
            java.lang.Object r1 = r2.A00
            com.whatsapp.group.GroupChatInfoActivity r1 = (com.whatsapp.group.GroupChatInfoActivity) r1
            r0 = 1
            r1.A7c(r0)
            return
        L_0x0761:
            java.lang.Object r2 = r2.A00
            com.whatsapp.group.GroupChatInfoActivity r2 = (com.whatsapp.group.GroupChatInfoActivity) r2
            X.4sb r1 = r2.A1K
            if (r1 == 0) goto L_0x076d
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1.A09 = r0
        L_0x076d:
            X.3ZH r0 = r2.A19
            X.4uZ r0 = r0.A0H
            android.content.Intent r0 = X.C627736r.A0a(r2, r0)
            r2.startActivity(r0)
            return
        L_0x0779:
            java.lang.Object r6 = r2.A00
            com.whatsapp.group.GroupChatInfoActivity r6 = (com.whatsapp.group.GroupChatInfoActivity) r6
            X.4sb r1 = r6.A1K
            if (r1 == 0) goto L_0x0785
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1.A00 = r0
        L_0x0785:
            boolean r0 = X.AnonymousClass4SG.A49(r6)
            r3 = 0
            if (r0 == 0) goto L_0x07ce
            X.1fJ r0 = r6.A1h
            X.C626936e.A06(r0)
            X.3S3 r1 = r6.A1r
            X.1fJ r0 = r6.A1h
            r1.A05(r0)
            X.1ib r1 = r6.A0e
            X.1fJ r0 = r6.A1h
            r1.A08(r0)
            X.2lX r1 = r6.A0P
            X.1fJ r0 = r6.A1h
            boolean r1 = r1.A02(r0)
            r0 = 8
            if (r1 != 0) goto L_0x07cf
            r0 = 2131892992(0x7f121b00, float:1.9420748E38)
            r6.Bp9(r0)
            X.4FS r1 = r6.A04
            X.2qY r8 = r6.A18
            X.2so r7 = r6.A0m
            X.1fJ r0 = r6.A1h
            java.util.Set r9 = java.util.Collections.singleton(r0)
            r0 = 6
            X.6Az r5 = new X.6Az
            r5.<init>(r2, r0)
            X.54s r4 = new X.54s
            r4.<init>(r5, r6, r7, r8, r9)
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r1.BkL(r4, r0)
            return
        L_0x07ce:
            r0 = 1
        L_0x07cf:
            X.C621433s.A01(r6, r0)
            return
        L_0x07d3:
            java.lang.Object r3 = r2.A00
            com.whatsapp.group.GroupChatInfoActivity r3 = (com.whatsapp.group.GroupChatInfoActivity) r3
            X.4sb r1 = r3.A1K
            if (r1 == 0) goto L_0x07df
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1.A0C = r0
        L_0x07df:
            X.1iB r0 = r3.A1D
            X.3XA r1 = r0.A08()
            r0 = 9
            X.C124266Bp.A00(r1, r2, r0)
            return
        L_0x07eb:
            java.lang.Object r3 = r2.A00
            com.whatsapp.group.GroupChatInfoActivity r3 = (com.whatsapp.group.GroupChatInfoActivity) r3
            X.1fd r2 = r3.A1k
            X.1fJ r1 = r3.A1h
            r0 = 0
            r2.A07(r3, r1, r0)
            return
        L_0x07f8:
            java.lang.Object r3 = r2.A00
            com.whatsapp.group.GroupChatInfoActivity r3 = (com.whatsapp.group.GroupChatInfoActivity) r3
            android.content.Context r2 = r3.getApplicationContext()
            X.1fJ r1 = r3.A1h
            r0 = 1
            android.content.Intent r0 = X.C627736r.A0V(r2, r1, r0)
            r3.startActivity(r0)
            return
        L_0x080b:
            java.lang.Object r4 = r2.A00
            com.whatsapp.group.GroupChatInfoActivity r4 = (com.whatsapp.group.GroupChatInfoActivity) r4
            android.content.Context r0 = r4.getApplicationContext()
            X.1fJ r3 = r4.A1h
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r1 = r0.getPackageName()
            java.lang.String r0 = "com.whatsapp.settings.SettingsJidNotificationActivity"
            X.C86604Kt.A13(r2, r3, r1, r0)
            r0 = 16
            r4.startActivityForResult(r2, r0)
            return
        L_0x0828:
            java.lang.Object r4 = r2.A00
            com.whatsapp.group.GroupChatInfoActivity r4 = (com.whatsapp.group.GroupChatInfoActivity) r4
            X.1VX r1 = r4.A0D
            X.3ZH r0 = r4.A19
            X.C18260x0.A0O(r1, r0)
            java.lang.String r0 = r0.A0J()
            if (r0 == 0) goto L_0x083f
            int r0 = r0.length()
            if (r0 != 0) goto L_0x084f
        L_0x083f:
            r0 = 3011(0xbc3, float:4.22E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x084f
            r1 = 2131886348(0x7f12010c, float:1.9407272E38)
            r0 = 1
            X.AnonymousClass5B6.A00(r4, r0, r1)
            return
        L_0x084f:
            X.67D r3 = r4.A0o
            java.lang.Integer r2 = X.C18310x6.A0e()
            java.lang.Integer r1 = X.C18290x4.A0a()
            X.1fJ r0 = r4.A1h
            r3.Bpi(r4, r0, r2, r1)
            return
        L_0x085f:
            java.lang.Object r3 = r2.A00
            com.whatsapp.group.GroupChatInfoActivity r3 = (com.whatsapp.group.GroupChatInfoActivity) r3
            X.67D r2 = r3.A0o
            X.1fJ r1 = r3.A1i
            r0 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r0 = X.C005205m.A00(r3, r0)
            r2.Bg5(r3, r0, r1)
            return
        L_0x0872:
            java.lang.Object r1 = r2.A00
            com.whatsapp.group.GroupChatInfoActivity r1 = (com.whatsapp.group.GroupChatInfoActivity) r1
            r0 = 2
            r1.A7Y(r0)
            return
        L_0x087b:
            java.lang.Object r0 = r2.A00
            com.whatsapp.group.GroupParticipantsSearchFragment r0 = (com.whatsapp.group.GroupParticipantsSearchFragment) r0
            r0.A1K()
            return
        L_0x0883:
            java.lang.Object r5 = r2.A00
            com.whatsapp.group.newgroup.NewGroup r5 = (com.whatsapp.group.newgroup.NewGroup) r5
            X.33p r1 = r5.A09
            X.0df r0 = r5.getSupportFragmentManager()
            boolean r0 = com.whatsapp.ephemeral.EphemeralDmKicBottomSheetDialog.A02(r0, r1)
            if (r0 == 0) goto L_0x08a7
            X.33p r4 = r5.A09
            X.0df r3 = r5.getSupportFragmentManager()
            java.util.concurrent.atomic.AtomicReference r0 = r5.A0q
            java.lang.Object r2 = r0.get()
            X.4uZ r2 = (X.C95814uZ) r2
            r1 = 2
            r0 = 0
            com.whatsapp.ephemeral.EphemeralDmKicBottomSheetDialog.A00(r3, r4, r0, r2, r1)
            return
        L_0x08a7:
            int r2 = r5.A00
            X.0df r1 = r5.getSupportFragmentManager()
            r0 = 1
            com.whatsapp.ephemeral.ChangeEphemeralSettingsDialog.A00(r1, r2, r0)
            return
        L_0x08b2:
            java.lang.Object r0 = r2.A00
            com.whatsapp.group.view.custom.GroupDetailsCard r0 = (com.whatsapp.group.view.custom.GroupDetailsCard) r0
            X.5hX r4 = r0.getActivityUtils()
            android.content.Context r3 = r0.getContext()
            X.36r r2 = X.C86664Kz.A1B()
            android.content.Context r1 = r0.getContext()
            X.3ZH r0 = r0.A0M
            if (r0 != 0) goto L_0x08d1
            java.lang.String r0 = "groupChat"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x08d1:
            X.4uZ r0 = X.AnonymousClass3ZH.A01(r0)
            android.content.Intent r2 = X.C86634Kw.A0D(r1, r2, r0)
            java.lang.String r1 = "args_conversation_screen_entry_point"
            r0 = 5
            android.content.Intent r1 = r2.putExtra(r1, r0)
            java.lang.String r0 = "GroupChatInfoActivity"
            r4.A0C(r3, r1, r0)
            return
        L_0x08e6:
            java.lang.Object r2 = r2.A00
            com.whatsapp.identity.IdentityVerificationActivity r2 = (com.whatsapp.identity.IdentityVerificationActivity) r2
            X.33p r1 = r2.A09
            java.lang.String r0 = "security_notifications_alert_timestamp"
            r1.A1Y(r0)
            r2.A74()
            return
        L_0x08f5:
            java.lang.Object r5 = r2.A00
            com.whatsapp.invites.ViewGroupInviteActivity r5 = (com.whatsapp.invites.ViewGroupInviteActivity) r5
            boolean r0 = r5.A0S
            if (r0 == 0) goto L_0x090c
            com.whatsapp.jid.UserJid r1 = r5.A0L
            X.C626936e.A06(r1)
            X.1mN r0 = r5.A0O
            com.whatsapp.invites.RevokeInviteDialogFragment r0 = com.whatsapp.invites.RevokeInviteDialogFragment.A00(r1, r0)
            r5.Boo(r0)
            return
        L_0x090c:
            X.2rN r1 = r5.A0Q
            X.1mN r0 = r5.A0O
            int r0 = r0.A00
            boolean r2 = r1.A03(r0)
            android.widget.TextView r1 = r5.A07
            r0 = 2131890348(0x7f1210ac, float:1.9415385E38)
            if (r2 == 0) goto L_0x0920
            r0 = 2131890350(0x7f1210ae, float:1.941539E38)
        L_0x0920:
            r1.setText(r0)
            android.view.ViewGroup r1 = r5.A04
            r0 = 0
            r1.setVisibility(r0)
            android.view.ViewGroup r1 = r5.A03
            r0 = 4
            r1.setVisibility(r0)
            X.4FS r4 = r5.A04
            X.2sH r3 = r5.A06
            X.3Lr r2 = r5.A0J
            X.2QT r1 = r5.A0N
            X.C626936e.A06(r1)
            X.1tP r0 = new X.1tP
            r0.<init>(r3, r2, r5, r1)
            X.AnonymousClass0x7.A1B(r0, r4)
            return
        L_0x0943:
            com.whatsapp.webpagepreview.WebPagePreviewView r1 = r7.A05
            r0 = 1
            r1.setImageProgressBarVisibility(r0)
            boolean r0 = r7.A06
            r6 = 0
            r1.A0L(r6, r0)
            X.4FS r5 = r7.A04
            X.3Dh r4 = r7.A01
            X.3Ls r0 = r2.A01
            X.7Kq r0 = r0.A09
            java.lang.String r3 = r0.A02
            java.lang.String r2 = r0.A01
            r1 = 1
            X.6AX r0 = new X.6AX
            r0.<init>(r7, r1)
            X.54w r1 = new X.54w
            r1.<init>(r4, r0, r3, r2)
            java.lang.String[] r0 = new java.lang.String[r6]
            r5.BkL(r1, r0)
            return
        L_0x096c:
            X.1fJ r0 = r4.A1h
            X.C626936e.A06(r0)
            X.2so r1 = r4.A0m
            X.1fJ r0 = r4.A1h
            X.1fJ r3 = r1.A01(r0)
            X.2wE r2 = r4.A0R
            r0 = 6
            X.3Zx r1 = new X.3Zx
            r1.<init>(r4, r0, r3)
            X.3ZH r0 = r4.A19
            X.2zZ r0 = r2.A01(r4, r0, r1)
            r0.A01()
            return
        L_0x098b:
            java.lang.Object r4 = r2.A00
            com.whatsapp.identity.IdentityVerificationActivity r4 = (com.whatsapp.identity.IdentityVerificationActivity) r4
            X.3ZH r0 = r4.A0K
            com.whatsapp.jid.Jid r3 = X.AnonymousClass3ZH.A03(r0)
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r1 = r4.getPackageName()
            java.lang.String r0 = "com.whatsapp.identity.ScanQrCodeActivity"
            X.C86604Kt.A13(r2, r3, r1, r0)
        L_0x09a2:
            r4.startActivity(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C989553w.A07(android.view.View):void");
    }
}
