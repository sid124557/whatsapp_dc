package X;

import android.util.Pair;

/* renamed from: X.3DK  reason: invalid class name */
public final class AnonymousClass3DK implements AnonymousClass66U {
    public final C69263Wi A00;
    public final AnonymousClass2VX A01;
    public final AnonymousClass1VX A02;
    public final C183538qC A03;
    public final C183538qC A04;
    public final C183538qC A05;
    public final C183538qC A06;
    public final C183538qC A07;
    public final C183538qC A08;
    public final C183538qC A09;
    public final C183538qC A0A;
    public final C183538qC A0B;

    public final C50612iT A00() {
        C56932sn r1 = (C56932sn) this.A0B.get();
        C54972pa r3 = r1.A0T;
        C50612iT A012 = r3.A01("meta-avatar");
        if (A012 == null) {
            if ("meta-avatar".contains(" ")) {
                try {
                    Pair A002 = AnonymousClass336.A00("meta-avatar");
                    if (A002 != null) {
                        A012 = r1.A0W.A00((String) A002.first, (String) A002.second);
                    }
                } catch (Exception e) {
                    C18260x0.A0u("StickerRepository/getInstalledStickerPackByIdSync/error fetching sticker pack: ", "meta-avatar", AnonymousClass001.A0o(), e);
                }
            }
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("AvatarAsyncInit");
            C18260x0.A1J(A0o, "/shouldDownloadAvatarStickerPack: avatar sticker pack is null");
            return null;
        }
        AnonymousClass2X2.A00(A012, r3, "meta-avatar");
        return A012;
    }

    public AnonymousClass3DK(C69263Wi r2, AnonymousClass2VX r3, AnonymousClass1VX r4, C183538qC r5, C183538qC r6, C183538qC r7, C183538qC r8, C183538qC r9, C183538qC r10, C183538qC r11, C183538qC r12, C183538qC r13) {
        C18260x0.A0f(r4, r2, r5, r6, r7);
        C18260x0.A0g(r8, r9, r10, r11, r12);
        C162457s7.A0J(r13, 11);
        this.A02 = r4;
        this.A00 = r2;
        this.A05 = r5;
        this.A0B = r6;
        this.A04 = r7;
        this.A03 = r8;
        this.A06 = r9;
        this.A09 = r10;
        this.A07 = r11;
        this.A0A = r12;
        this.A08 = r13;
        this.A01 = r3;
    }

    public String BDW() {
        return "AvatarAsyncInit";
    }

    public /* synthetic */ void BMd() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0116, code lost:
        if (((X.C54612p0) r8.A07.get()).A00() != null) goto L_0x0118;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BMe() {
        /*
            r8 = this;
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r3 = "AvatarAsyncInit"
            r1.append(r3)
            java.lang.String r0 = "/onAsyncInit started"
            X.C18260x0.A1J(r1, r0)
            X.8qC r7 = r8.A06
            java.lang.Object r5 = r7.get()
            X.2kc r5 = (X.C51932kc) r5
            java.lang.Object r0 = r7.get()
            X.2kc r0 = (X.C51932kc) r0
            X.66R r1 = r0.A01
            android.content.SharedPreferences r0 = X.C18310x6.A0F(r1)
            java.lang.String r4 = "pref_avatar_notice_consent_accepted"
            boolean r0 = r0.contains(r4)
            if (r0 == 0) goto L_0x0039
            android.content.SharedPreferences r0 = X.C18310x6.A0F(r1)
            boolean r0 = X.C18280x3.A1W(r0, r4)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            if (r0 != 0) goto L_0x0057
        L_0x0039:
            X.8qC r0 = r8.A03
            java.lang.Object r0 = r0.get()
            X.2gs r0 = (X.C49652gs) r0
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x0057
            java.lang.Object r0 = r7.get()
            X.2kc r0 = (X.C51932kc) r0
            r1 = 1
            X.66R r0 = r0.A01
            android.content.SharedPreferences$Editor r0 = X.C18270x1.A04(r0)
            X.C18270x1.A0l(r0, r4, r1)
        L_0x0057:
            X.1VX r2 = r8.A02
            r1 = 4890(0x131a, float:6.852E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            if (r0 == 0) goto L_0x009a
            X.8qC r0 = r8.A03
            java.lang.Object r0 = r0.get()
            X.2gs r0 = (X.C49652gs) r0
            boolean r0 = r0.A01()
            if (r0 != 0) goto L_0x009a
            X.8qC r0 = r8.A08
            java.lang.Object r0 = r0.get()
            X.2kU r0 = (X.C51852kU) r0
            java.lang.String r6 = "avatar_animated_sticker"
            int r1 = r0.A00(r6)
            r0 = 3
            if (r1 == r0) goto L_0x009a
            r0 = 2
            if (r1 == r0) goto L_0x009a
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r3)
            java.lang.String r0 = "/downloadAvatarAssets: downloading the avatar animated sticker"
            X.C18260x0.A1J(r1, r0)
            X.8qC r0 = r8.A09
            java.lang.Object r1 = r0.get()
            X.2hg r1 = (X.C50132hg) r1
            r0 = 0
            r1.A00(r0, r6)
        L_0x009a:
            X.C162457s7.A0H(r5)
            X.66R r6 = r5.A01
            android.content.SharedPreferences r0 = X.C18310x6.A0F(r6)
            java.lang.String r5 = "pref_avatar_user_local_deletion"
            boolean r0 = X.C18280x3.A1W(r0, r5)
            if (r0 == 0) goto L_0x00db
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r3)
            java.lang.String r0 = "/hasPendingLocalDeletion is true"
            X.C18260x0.A1J(r1, r0)
            X.8qC r0 = r8.A07
            java.lang.Object r1 = r0.get()
            X.2p0 r1 = (X.C54612p0) r1
            X.8qC r0 = r8.A04
            java.lang.Object r2 = r0.get()
            X.C162457s7.A0H(r2)
            X.C162457s7.A0H(r1)
            r1.A01()
            android.content.SharedPreferences r0 = X.C18310x6.A0F(r6)
            X.C18270x1.A0n(r0, r5)
            X.3Wi r1 = r8.A00
            r0 = 48
            X.C69263Wi.A00(r1, r2, r0)
        L_0x00da:
            return
        L_0x00db:
            android.content.SharedPreferences r1 = X.C18310x6.A0F(r6)
            java.lang.String r0 = "pref_avatar_user_remote_deletion"
            boolean r0 = X.C18280x3.A1W(r1, r0)
            if (r0 != 0) goto L_0x0118
            java.lang.Object r0 = r7.get()
            X.2kc r0 = (X.C51932kc) r0
            X.66R r1 = r0.A01
            android.content.SharedPreferences r0 = X.C18310x6.A0F(r1)
            boolean r0 = r0.contains(r4)
            if (r0 == 0) goto L_0x013c
            android.content.SharedPreferences r0 = X.C18310x6.A0F(r1)
            boolean r1 = X.C18280x3.A1W(r0, r4)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            if (r0 == 0) goto L_0x013c
            if (r1 != 0) goto L_0x013c
            X.8qC r0 = r8.A07
            java.lang.Object r0 = r0.get()
            X.2p0 r0 = (X.C54612p0) r0
            X.2yH r0 = r0.A00()
            if (r0 == 0) goto L_0x013c
        L_0x0118:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r3)
            java.lang.String r0 = "/hasPendingRemoteDeletion is true"
            X.C18260x0.A1J(r1, r0)
            X.8qC r0 = r8.A04
            java.lang.Object r3 = X.C18300x5.A0b(r0)
            X.1ig r3 = (X.C29351ig) r3
            X.8qC r0 = r8.A07
            java.lang.Object r2 = X.C18300x5.A0b(r0)
            X.2p0 r2 = (X.C54612p0) r2
            X.3SK r1 = new X.3SK
            r1.<init>(r8, r3, r2)
            java.lang.String r0 = "event"
            r2.A02(r1, r0)
            return
        L_0x013c:
            r0 = 1396(0x574, float:1.956E-42)
            boolean r0 = X.C56952sp.A0J(r2, r0)
            if (r0 == 0) goto L_0x014e
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r3)
            java.lang.String r0 = "/shouldDownloadAvatarStickerPack: Avatar is disabled"
            X.C18260x0.A1J(r1, r0)
            return
        L_0x014e:
            r2 = 0
            com.whatsapp.avatar.init.AvatarAsyncInit$checkHasAvatarUser$1 r0 = new com.whatsapp.avatar.init.AvatarAsyncInit$checkHasAvatarUser$1
            r0.<init>(r8, r2)
            X.3du r1 = X.C72553du.A00
            java.lang.Object r0 = X.C380725l.A00(r1, r0)
            if (r0 == 0) goto L_0x00da
            com.whatsapp.avatar.init.AvatarAsyncInit$checkUserHasAvatar$1 r0 = new com.whatsapp.avatar.init.AvatarAsyncInit$checkUserHasAvatar$1
            r0.<init>(r8, r2)
            java.lang.Object r0 = X.C380725l.A00(r1, r0)
            if (r0 == 0) goto L_0x00da
            X.2iT r0 = r8.A00()
            if (r0 == 0) goto L_0x018c
            X.2iT r5 = r8.A00()
            if (r5 == 0) goto L_0x018c
            java.util.List r0 = r5.A05
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0197
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0l(r3)
            java.lang.String r0 = "/shouldDownloadAvatarStickerPack: stickers size = "
            r2.append(r0)
            java.util.List r0 = r5.A05
            r2.append(r0)
        L_0x0189:
            X.AnonymousClass0x2.A18(r2)
        L_0x018c:
            X.2VX r3 = r8.A01
            java.lang.String r2 = "retry"
            r1 = 6
            r0 = 0
            r3.A00(r1, r2, r0)
            return
        L_0x0197:
            java.util.List r1 = r5.A05
            X.C162457s7.A0D(r1)
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L_0x01f4
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x01f4
        L_0x01a6:
            X.8qC r0 = r8.A0A
            java.lang.Object r4 = r0.get()
            X.2rq r4 = (X.C56352rq) r4
            java.util.List r1 = r5.A05
            X.C162457s7.A0D(r1)
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L_0x01be
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x01be
            return
        L_0x01be:
            java.util.Iterator r2 = r1.iterator()
            r1 = 0
        L_0x01c3:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x01e3
            X.39M r0 = X.AnonymousClass0x7.A0b(r2)
            java.lang.String r0 = r0.A0D
            if (r0 == 0) goto L_0x01c3
            java.io.File r0 = r4.A01(r0)
            if (r0 != 0) goto L_0x01c3
            int r1 = r1 + 1
            if (r1 >= 0) goto L_0x01c3
            X.AnonymousClass8UF.A0q()
            java.lang.RuntimeException r0 = X.AnonymousClass000.A0L()
            throw r0
        L_0x01e3:
            if (r1 <= 0) goto L_0x00da
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0l(r3)
            java.lang.String r0 = "/shouldDownloadAvatarStickerPack: found "
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = " without existing file"
            goto L_0x0229
        L_0x01f4:
            java.util.Iterator r2 = r1.iterator()
            r1 = 0
        L_0x01f9:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0219
            X.39M r0 = X.AnonymousClass0x7.A0b(r2)
            java.lang.String r0 = r0.A09
            if (r0 == 0) goto L_0x020d
            int r0 = r0.length()
            if (r0 != 0) goto L_0x01f9
        L_0x020d:
            int r1 = r1 + 1
            if (r1 >= 0) goto L_0x01f9
            X.AnonymousClass8UF.A0q()
            java.lang.RuntimeException r0 = X.AnonymousClass000.A0L()
            throw r0
        L_0x0219:
            if (r1 <= 0) goto L_0x01a6
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0l(r3)
            java.lang.String r0 = "/shouldDownloadAvatarStickerPack: found "
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = " with empty file path"
        L_0x0229:
            r2.append(r0)
            goto L_0x0189
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3DK.BMe():void");
    }
}
