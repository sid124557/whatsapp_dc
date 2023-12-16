package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.3c6  reason: invalid class name and case insensitive filesystem */
public class C71433c6 implements Runnable {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    public C71433c6(Object obj, Object obj2, Object obj3, int i, int i2) {
        this.A04 = i2;
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
        this.A03 = obj3;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v16, resolved type: X.1ZS} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v45, resolved type: X.1bS} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v48, resolved type: X.1ZS} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v49, resolved type: X.1ZS} */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x0604, code lost:
        r3.A00(r6, r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x0607, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x07a1, code lost:
        r0.BhD(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x07a4, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:351:0x0973, code lost:
        if (r1 == 0) goto L_0x0975;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:377:0x09c9, code lost:
        if (r3 != 4) goto L_0x09cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:473:0x0bfe, code lost:
        if (r1.length() == 0) goto L_0x0c00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x013f, code lost:
        if (r9.A1L == r13) goto L_0x0141;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:384:0x09db  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:526:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r26 = this;
            r3 = r26
            int r0 = r3.A04
            switch(r0) {
                case 0: goto L_0x004c;
                case 1: goto L_0x008d;
                case 2: goto L_0x01a3;
                case 3: goto L_0x01d3;
                case 4: goto L_0x047f;
                case 5: goto L_0x04b9;
                case 6: goto L_0x051f;
                case 7: goto L_0x0575;
                case 8: goto L_0x0598;
                case 9: goto L_0x05e6;
                case 10: goto L_0x0608;
                case 11: goto L_0x06b9;
                case 12: goto L_0x06ed;
                case 13: goto L_0x070f;
                case 14: goto L_0x07a5;
                case 15: goto L_0x07c7;
                case 16: goto L_0x07ef;
                case 17: goto L_0x0801;
                case 18: goto L_0x0823;
                case 19: goto L_0x0837;
                case 20: goto L_0x084b;
                case 21: goto L_0x08bc;
                case 22: goto L_0x0948;
                case 23: goto L_0x0a0c;
                case 24: goto L_0x0a58;
                case 25: goto L_0x0a82;
                case 26: goto L_0x0a94;
                case 27: goto L_0x0abe;
                case 28: goto L_0x0aeb;
                case 29: goto L_0x0b47;
                case 30: goto L_0x0b59;
                case 31: goto L_0x0bda;
                case 32: goto L_0x0c09;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r5 = r3.A01
            X.2yL r5 = (X.C60312yL) r5
            java.lang.Object r2 = r3.A02
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r4 = r3.A03
            android.net.Uri r4 = (android.net.Uri) r4
            int r3 = r3.A00
            java.lang.Boolean r0 = r5.A03     // Catch:{ Exception -> 0x0b30 }
            if (r0 != 0) goto L_0x0023
            X.1VX r1 = r5.A00     // Catch:{ Exception -> 0x0b30 }
            r0 = 6832(0x1ab0, float:9.574E-42)
            java.lang.Boolean r0 = X.C56952sp.A07(r1, r0)     // Catch:{ Exception -> 0x0b30 }
            r5.A03 = r0     // Catch:{ Exception -> 0x0b30 }
        L_0x0023:
            boolean r0 = r0.booleanValue()     // Catch:{ Exception -> 0x0b30 }
            if (r0 == 0) goto L_0x0049
            X.2X6 r0 = r5.A02     // Catch:{ Exception -> 0x0b30 }
            android.os.Looper r0 = r0.A00()     // Catch:{ Exception -> 0x0b30 }
        L_0x002f:
            X.53p r1 = new X.53p     // Catch:{ Exception -> 0x0b30 }
            r1.<init>(r0, r3)     // Catch:{ Exception -> 0x0b30 }
            android.media.MediaPlayer r0 = r1.A01     // Catch:{ Exception -> 0x0b30 }
            r0.setDataSource(r2, r4)     // Catch:{ Exception -> 0x0b30 }
            r1.A05()     // Catch:{ Exception -> 0x0b30 }
            r1.A08()     // Catch:{ Exception -> 0x0b30 }
            X.5ZQ r0 = r5.A01     // Catch:{ Exception -> 0x0b30 }
            if (r0 == 0) goto L_0x0046
            r0.A06()     // Catch:{ Exception -> 0x0b30 }
        L_0x0046:
            r5.A01 = r1     // Catch:{ Exception -> 0x0b30 }
            goto L_0x004b
        L_0x0049:
            r0 = 0
            goto L_0x002f
        L_0x004b:
            return
        L_0x004c:
            java.lang.Object r2 = r3.A01
            X.2rV r2 = (X.C56152rV) r2
            java.lang.Object r1 = r3.A02
            X.4uZ r1 = (X.C95814uZ) r1
            int r0 = r3.A00
            java.lang.Object r4 = r3.A03
            X.4FV r4 = (X.AnonymousClass4FV) r4
            java.util.ArrayList r0 = r2.A03(r1, r0)
            java.util.Iterator r3 = r0.iterator()
        L_0x0062:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0b46
            X.34x r2 = X.C18300x5.A0T(r3)
            if (r2 == 0) goto L_0x0b46
            X.1YB r1 = new X.1YB
            r1.<init>()
            X.2z0 r0 = r2.A1J
            java.lang.String r0 = r0.A01
            r1.A02 = r0
            java.lang.String r0 = X.AnonymousClass31G.A00(r2)
            r1.A01 = r0
            int r0 = X.C624134x.A05(r2)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A00 = r0
            r4.BhD(r1)
            goto L_0x0062
        L_0x008d:
            java.lang.Object r6 = r3.A01
            X.36E r6 = (X.AnonymousClass36E) r6
            java.lang.Object r5 = r3.A02
            X.1bS r5 = (X.C26021bS) r5
            java.lang.Object r9 = r3.A03
            X.34x r9 = (X.C624134x) r9
            int r8 = r3.A00
            int r0 = X.AnonymousClass321.A00()
            java.lang.Long r0 = X.AnonymousClass0x9.A0m(r0)
            r5.A0S = r0
            java.lang.Boolean r0 = r5.A0A
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x011a
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
        L_0x00af:
            r5.A09 = r0
        L_0x00b1:
            java.lang.Boolean r0 = r5.A0A
            if (r0 == 0) goto L_0x00bb
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x00dd
        L_0x00bb:
            java.lang.Boolean r0 = r5.A09
            if (r0 == 0) goto L_0x00c5
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x00dd
        L_0x00c5:
            java.lang.Boolean r0 = r5.A01
            if (r0 == 0) goto L_0x00e3
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00e3
            java.lang.Long r0 = r5.A0P
            if (r0 == 0) goto L_0x00e3
            long r3 = r0.longValue()
            r1 = 50
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x00e3
        L_0x00dd:
            X.4FV r0 = r6.A0G
            r0.BhB(r5)
            return
        L_0x00e3:
            X.1VX r2 = r6.A0F
            r1 = 1861(0x745, float:2.608E-42)
            X.2vE r0 = X.C58422vE.A02
            int r0 = r2.A0O(r0, r1)
            if (r8 >= r0) goto L_0x00dd
            java.lang.Long r0 = r5.A0X
            if (r0 == 0) goto L_0x0105
            long r3 = r0.longValue()
            r1 = 50
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0105
            X.4FV r1 = r6.A0G
            X.5ZC r0 = X.AnonymousClass3ZG.DEFAULT_SAMPLING_RATE
        L_0x0101:
            r1.BhC(r5, r0)
            return
        L_0x0105:
            java.lang.Integer r0 = r5.A0E
            if (r0 == 0) goto L_0x0189
            int r1 = r0.intValue()
            r0 = 14
            if (r1 == r0) goto L_0x0115
            r0 = 15
            if (r1 != r0) goto L_0x0189
        L_0x0115:
            X.4FV r1 = r6.A0G
            X.5ZC r0 = X.AnonymousClass36E.A0f
            goto L_0x0101
        L_0x011a:
            X.2z0 r0 = r9.A1J
            X.4uZ r7 = r0.A00
            boolean r0 = X.C627336j.A0K(r7)
            if (r0 == 0) goto L_0x00b1
            android.util.LruCache r4 = r6.A00
            java.lang.Object r0 = r4.get(r7)
            if (r0 == 0) goto L_0x0148
            java.lang.Object r0 = r4.get(r7)
            long r13 = X.C18310x6.A0B(r0)
        L_0x0134:
            r1 = -1
            int r0 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0141
            long r2 = r9.A1L
            int r1 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            r0 = 0
            if (r1 != 0) goto L_0x0142
        L_0x0141:
            r0 = 1
        L_0x0142:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            goto L_0x00af
        L_0x0148:
            r11 = -1
            if (r7 == 0) goto L_0x0141
            X.2rt r1 = r6.A0B
            java.lang.String[] r10 = X.AnonymousClass0x9.A1Y()
            X.2sm r0 = r1.A01
            X.C56922sm.A01(r0, r7, r10)
            X.3dV r0 = r1.A05
            X.4GK r3 = r0.get()
            r0 = r3
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0199 }
            X.2sg r2 = r0.A03     // Catch:{ all -> 0x0199 }
            java.lang.String r1 = "SELECT _id FROM available_message_view WHERE chat_row_id = ? AND message_type NOT IN ('7') AND from_me = 1  ORDER BY sort_id ASC LIMIT 1"
            java.lang.String r0 = "FIRST_OUTGOING_MESSAGE_RAW_SQL"
            android.database.Cursor r2 = r2.A0E(r1, r0, r10)     // Catch:{ all -> 0x0199 }
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x018d }
            if (r0 == 0) goto L_0x0175
            long r13 = X.C18270x1.A01(r2)     // Catch:{ all -> 0x018d }
            goto L_0x0177
        L_0x0175:
            r13 = -1
        L_0x0177:
            r2.close()     // Catch:{ all -> 0x0199 }
            r3.close()
            int r0 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r0 == 0) goto L_0x0134
            java.lang.Long r0 = java.lang.Long.valueOf(r13)
            r4.put(r7, r0)
            goto L_0x0134
        L_0x0189:
            X.4FV r0 = r6.A0G
            goto L_0x07a1
        L_0x018d:
            r1 = move-exception
            if (r2 == 0) goto L_0x0198
            r2.close()     // Catch:{ all -> 0x0194 }
            goto L_0x0198
        L_0x0194:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0199 }
        L_0x0198:
            throw r1     // Catch:{ all -> 0x0199 }
        L_0x0199:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x019e }
            throw r1
        L_0x019e:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x01a3:
            java.lang.Object r6 = r3.A01
            com.whatsapp.avatar.profilephoto.AvatarProfilePhotoViewModel r6 = (com.whatsapp.avatar.profilephoto.AvatarProfilePhotoViewModel) r6
            java.lang.Object r5 = r3.A02
            X.3ZH r5 = (X.AnonymousClass3ZH) r5
            java.lang.Object r4 = r3.A03
            byte[] r4 = (byte[]) r4
            int r3 = r3.A00
            r0 = 2
            X.C162457s7.A0J(r4, r0)
            X.1m3 r2 = r6.A0B
            r1 = 1
            r0 = 0
            boolean r2 = r2.A0H(r5, r0, r4, r1)
            r6.A0F(r2)
            X.2qu r1 = r6.A0A
            java.lang.String r0 = "profile_photo_updated"
            r1.A01(r3, r0)
            if (r2 == 0) goto L_0x01d0
            X.21o r0 = X.C372621o.SUCCESS
        L_0x01cc:
            r1.A02(r0, r3)
            return
        L_0x01d0:
            X.21o r0 = X.C372621o.FAIL
            goto L_0x01cc
        L_0x01d3:
            java.lang.Object r12 = r3.A01
            X.2dT r12 = (X.C47572dT) r12
            java.lang.Object r2 = r3.A02
            X.2iT r2 = (X.C50612iT) r2
            int r11 = r3.A00
            java.lang.Object r0 = r3.A03
            r18 = r0
            r0 = r18
            X.4GQ r0 = (X.AnonymousClass4GQ) r0
            r18 = r0
            X.33p r0 = r12.A04
            r3 = 1
            android.content.SharedPreferences$Editor r1 = X.C18270x1.A03(r0)
            java.lang.String r0 = "sticker_store_onboarding_badge_shown"
            X.C18270x1.A0l(r1, r0, r3)
            X.2Qp r10 = r12.A03
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "updateRecentAvatarStickers(stickerPack="
            r1.append(r0)
            java.lang.String r4 = r2.A0I
            r1.append(r4)
            java.lang.String r3 = ", stickers="
            r1.append(r3)
            java.util.List r0 = r2.A05
            int r0 = r0.size()
            java.lang.String r0 = X.C18260x0.A09(r1, r0)
            com.whatsapp.util.Log.d((java.lang.String) r0)
            X.1el r6 = r10.A02
            java.util.List r13 = r2.A05
            java.util.HashMap r7 = X.AnonymousClass001.A0t()
            java.util.Map r0 = r6.A05()
            java.util.HashMap r5 = X.AnonymousClass001.A0t()
            java.util.Iterator r9 = X.AnonymousClass000.A0q(r0)
        L_0x022b:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0245
            java.util.Map$Entry r8 = X.AnonymousClass001.A0w(r9)
            java.lang.Object r0 = r8.getKey()
            X.2hJ r0 = (X.C49922hJ) r0
            java.lang.String r1 = r0.A01
            java.lang.Object r0 = r8.getValue()
            r5.put(r1, r0)
            goto L_0x022b
        L_0x0245:
            java.util.Iterator r8 = r13.iterator()
        L_0x0249:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0265
            X.39M r1 = X.AnonymousClass0x7.A0b(r8)
            boolean r0 = r1.A0J
            if (r0 == 0) goto L_0x025f
            java.lang.String r0 = r1.A05
            if (r0 == 0) goto L_0x025f
            r7.put(r0, r1)
            goto L_0x0249
        L_0x025f:
            java.lang.String r0 = "RecentStickers/sticker is not avatar or with null stable id, skipping"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x0249
        L_0x0265:
            java.util.List r0 = r6.A03()
            java.util.Iterator r16 = r0.iterator()
        L_0x026d:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x02d0
            java.lang.Object r0 = r16.next()
            X.2hJ r0 = (X.C49922hJ) r0
            java.lang.String r15 = r0.A01
            if (r15 == 0) goto L_0x026d
            r6.A07(r0)
            java.lang.Object r14 = r7.get(r15)
            X.39M r14 = (X.AnonymousClass39M) r14
            if (r14 == 0) goto L_0x026d
            java.lang.String r13 = r14.A0D
            java.lang.String r8 = r14.A0A
            long r0 = r0.A00
            X.2hJ r9 = new X.2hJ
            r22 = r8
            r23 = r15
            r24 = r0
            r19 = r9
            r20 = r14
            r21 = r13
            r19.<init>(r20, r21, r22, r23, r24)
            java.lang.Number r0 = X.AnonymousClass0x9.A0p(r15, r5)
            if (r0 != 0) goto L_0x02ab
            r0 = 1065353216(0x3f800000, float:1.0)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
        L_0x02ab:
            float r0 = r0.floatValue()
            X.3Pu r8 = new X.3Pu
            r8.<init>(r9, r0)
            r6.A06()
            monitor-enter(r6)
            java.util.List r0 = r6.A03     // Catch:{ all -> 0x02cd }
            r0.add(r8)     // Catch:{ all -> 0x02cd }
            X.4ET r1 = r6.A00     // Catch:{ all -> 0x02cd }
            java.util.List r0 = r6.A03     // Catch:{ all -> 0x02cd }
            r1.Bgs(r0)     // Catch:{ all -> 0x02cd }
            monitor-exit(r6)     // Catch:{ all -> 0x02cd }
            X.2hJ r0 = r8.A01
            X.39M r0 = r0.A04
            r6.A0C(r0)
            goto L_0x026d
        L_0x02cd:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x02cd }
            throw r0
        L_0x02d0:
            X.3Wi r9 = r10.A00
            r1 = 2
            X.5rP r0 = new X.5rP
            r0.<init>(r10, r1)
            r9.A0S(r0)
            X.2qu r8 = r10.A01
            java.lang.String r0 = "migrate_stickers_recents_done"
            r8.A01(r11, r0)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "updateStarredAvatarStickers(stickerPack="
            X.AnonymousClass001.A1K(r0, r4, r3, r1)
            java.util.List r0 = r2.A05
            int r0 = r0.size()
            java.lang.String r0 = X.C18260x0.A09(r1, r0)
            com.whatsapp.util.Log.d((java.lang.String) r0)
            X.2pZ r7 = r10.A04
            java.util.List r2 = r2.A05
            java.util.HashMap r6 = X.AnonymousClass001.A0t()
            X.2yp r5 = r7.A05
            r1 = 2
            r0 = 2147483647(0x7fffffff, float:NaN)
            java.util.List r3 = r5.A01(r0, r1)
            java.util.Iterator r2 = r2.iterator()
        L_0x0310:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x032c
            X.39M r1 = X.AnonymousClass0x7.A0b(r2)
            boolean r0 = r1.A0J
            if (r0 == 0) goto L_0x0326
            java.lang.String r0 = r1.A05
            if (r0 == 0) goto L_0x0326
            r6.put(r0, r1)
            goto L_0x0310
        L_0x0326:
            java.lang.String r0 = "StarredStickers/updateStarredStickersByAvatarStableId/is not avatar or with null stable id, skipping"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x0310
        L_0x032c:
            java.util.Iterator r17 = r3.iterator()
        L_0x0330:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x041a
            java.lang.Object r4 = r17.next()
            X.2UB r4 = (X.AnonymousClass2UB) r4
            java.lang.String r0 = r4.A00
            if (r0 != 0) goto L_0x0346
            java.lang.String r0 = "StarredStickers/updateStarredStickersByAvatarStableId/sticker has no avatar stable id, aborting"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x0330
        L_0x0346:
            java.lang.Object r3 = r6.get(r0)
            X.39M r3 = (X.AnonymousClass39M) r3
            if (r3 != 0) goto L_0x0354
            java.lang.String r0 = r4.A0D
            r5.A03(r0)
            goto L_0x0330
        L_0x0354:
            java.lang.String r0 = r3.A05
            r16 = r0
            java.lang.String r0 = r3.A0D
            r25 = r0
            java.lang.String r0 = r3.A0G
            r24 = r0
            java.lang.String r0 = r3.A06
            r23 = r0
            java.lang.String r0 = r3.A0C
            r22 = r0
            int r0 = r3.A00
            r21 = r0
            int r0 = r3.A03
            r20 = r0
            int r0 = r3.A02
            r19 = r0
            java.lang.String r14 = r3.A07
            boolean r13 = r3.A0K
            boolean r1 = r3.A0J
            android.content.ContentValues r2 = X.AnonymousClass0x9.A06()
            java.lang.String r15 = "plaintext_hash"
            r0 = r25
            r2.put(r15, r0)
            java.lang.String r15 = "url"
            r0 = r24
            r2.put(r15, r0)
            java.lang.String r15 = "direct_path"
            r0 = r23
            r2.put(r15, r0)
            java.lang.String r15 = "mimetype"
            r0 = r22
            r2.put(r15, r0)
            java.lang.String r15 = "file_size"
            r0 = r21
            X.C18270x1.A0b(r2, r15, r0)
            java.lang.String r15 = "width"
            r0 = r20
            X.C18270x1.A0b(r2, r15, r0)
            java.lang.String r15 = "height"
            r0 = r19
            X.C18270x1.A0b(r2, r15, r0)
            java.lang.String r0 = "emojis"
            r2.put(r0, r14)
            java.lang.String r0 = "is_first_party"
            X.AnonymousClass0x2.A0o(r2, r0, r13)
            java.lang.String r0 = "is_avatar"
            X.AnonymousClass0x2.A0o(r2, r0, r1)
            r15 = 0
            X.8qC r0 = r5.A01     // Catch:{ Exception -> 0x0411 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0411 }
            X.1RH r0 = (X.AnonymousClass1RH) r0     // Catch:{ Exception -> 0x0411 }
            X.4Fq r14 = r0.A0C()     // Catch:{ Exception -> 0x0411 }
            r0 = r14
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0407 }
            X.2sg r13 = r0.A03     // Catch:{ all -> 0x0407 }
            java.lang.String r21 = "starred_stickers"
            java.lang.String r22 = "avatar_template_id = ?"
            r1 = 1
            java.lang.String[] r0 = new java.lang.String[r1]     // Catch:{ all -> 0x0407 }
            r0[r15] = r16     // Catch:{ all -> 0x0407 }
            java.lang.String r23 = "updateStickerAttrsByAvatarTemplateId/UPDATE_STARRED_STICKERS"
            r19 = r13
            r20 = r2
            r24 = r0
            int r0 = r19.A05(r20, r21, r22, r23, r24)     // Catch:{ all -> 0x0407 }
            if (r0 > 0) goto L_0x03ee
            r1 = 0
        L_0x03ee:
            r14.close()     // Catch:{ Exception -> 0x0411 }
            if (r1 == 0) goto L_0x0330
            X.2oo r2 = r7.A01
            java.lang.String r1 = r4.A0D
            java.lang.String r0 = r2.A00(r1)
            r2.A02(r1, r0)
            java.lang.String r1 = r3.A0D
            java.lang.String r0 = r3.A0A
            r2.A01(r1, r0)
            goto L_0x0330
        L_0x0407:
            r1 = move-exception
            r14.close()     // Catch:{ all -> 0x040c }
            goto L_0x0410
        L_0x040c:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ Exception -> 0x0411 }
        L_0x0410:
            throw r1     // Catch:{ Exception -> 0x0411 }
        L_0x0411:
            r1 = move-exception
            java.lang.String r0 = "updateStickerAttrsByAvatarTemplateId/unable to update sticker"
            com.whatsapp.util.Log.e(r0, r1)
            goto L_0x0330
        L_0x041a:
            r7.A01()
            r1 = 3
            X.5rP r0 = new X.5rP
            r0.<init>(r10, r1)
            r9.A0S(r0)
            java.lang.String r0 = "migrate_stickers_favorites_done"
            r8.A01(r11, r0)
            X.21o r1 = X.C372621o.SUCCESS
            r8.A02(r1, r11)
            X.2qu r0 = r12.A08
            r0.A02(r1, r11)
            X.2kc r0 = r12.A05
            X.66R r4 = r0.A01
            android.content.SharedPreferences r0 = X.C18310x6.A0F(r4)
            java.lang.String r3 = "pref_avatar_art_pending_revision"
            java.lang.String r2 = X.C18280x3.A0Z(r0, r3)
            if (r2 == 0) goto L_0x0477
            android.content.SharedPreferences$Editor r1 = X.C18270x1.A04(r4)
            java.lang.String r0 = "pref_avatar_art_revision"
            X.C18270x1.A0j(r1, r0, r2)
            android.content.SharedPreferences r0 = X.C18310x6.A0F(r4)
            X.C18270x1.A0n(r0, r3)
            android.content.SharedPreferences$Editor r1 = X.C18270x1.A04(r4)
            java.lang.String r0 = "pref_avatar_sticker_search_dictionary_revision"
            android.content.SharedPreferences$Editor r1 = r1.remove(r0)
            java.lang.String r0 = "pref_avatar_sticker_search_dictionary_state"
            android.content.SharedPreferences$Editor r1 = r1.remove(r0)
            java.lang.String r0 = "pref_avatar_sticker_search_dictionary_filters"
            android.content.SharedPreferences$Editor r1 = r1.remove(r0)
            java.lang.String r0 = "pref_avatar_sticker_search_dictionary_country_code"
            X.C18270x1.A0g(r1, r0)
        L_0x0477:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r0 = r18
            r0.invoke(r1)
            return
        L_0x047f:
            int r2 = r3.A00
            java.lang.Object r5 = r3.A01
            X.4GQ r5 = (X.AnonymousClass4GQ) r5
            java.lang.Object r4 = r3.A02
            X.2cQ r4 = (X.C46922cQ) r4
            java.lang.Object r1 = r3.A03
            X.7n8 r1 = (X.C160157n8) r1
            r0 = -1
            if (r2 == r0) goto L_0x04b6
            r0 = 406(0x196, float:5.69E-43)
            if (r2 == r0) goto L_0x049e
            r0 = 421(0x1a5, float:5.9E-43)
            if (r2 == r0) goto L_0x049e
        L_0x0498:
            X.6gg r0 = X.C133096gg.A00
        L_0x049a:
            r5.invoke(r0)
            return
        L_0x049e:
            com.whatsapp.jid.UserJid r3 = r1.A07
            X.C162457s7.A0C(r3)
            boolean r0 = r4.A00
            if (r0 != 0) goto L_0x0498
            r0 = 1
            r4.A00 = r0
            X.33g r2 = r4.A02
            X.3Dq r1 = new X.3Dq
            r1.<init>(r4)
            r0 = 0
            r2.A08(r1, r3, r0)
            goto L_0x0498
        L_0x04b6:
            X.6gh r0 = X.C133106gh.A00
            goto L_0x049a
        L_0x04b9:
            java.lang.Object r5 = r3.A01
            X.3GM r5 = (X.AnonymousClass3GM) r5
            java.lang.Object r4 = r3.A02
            X.4uZ r4 = (X.C95814uZ) r4
            int r2 = r3.A00
            java.lang.Object r1 = r3.A03
            java.util.Collection r1 = (java.util.Collection) r1
            X.7am r0 = r5.A04
            r0.A03(r4, r1, r2)
            X.2p9 r0 = r5.A00
            r0.A03(r1)
            X.8qC r0 = r5.A0H
            java.lang.Object r4 = r0.get()
            X.2zw r4 = (X.C61242zw) r4
            if (r1 == 0) goto L_0x0b46
            java.util.ArrayList r5 = X.AnonymousClass001.A0s()
            java.util.Iterator r3 = r1.iterator()
        L_0x04e3:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x04ff
            java.lang.Object r2 = r3.next()
            r0 = r2
            X.34x r0 = (X.C624134x) r0
            X.2jD r0 = r0.A0u()
            if (r0 == 0) goto L_0x04e3
            boolean r1 = r0.A00
            r0 = 1
            if (r1 != r0) goto L_0x04e3
            r5.add(r2)
            goto L_0x04e3
        L_0x04ff:
            java.util.Iterator r1 = r5.iterator()
        L_0x0503:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0b46
            X.34x r0 = X.C18300x5.A0T(r1)
            X.2q9 r5 = r4.A06
            X.2z0 r0 = r0.A1J
            X.4uZ r6 = r0.A00
            if (r6 == 0) goto L_0x0503
            r7 = 0
            r12 = 6
            r9 = r7
            r10 = r7
            r11 = r7
            r8 = r7
            r5.A04(r6, r7, r8, r9, r10, r11, r12)
            goto L_0x0503
        L_0x051f:
            java.lang.Object r5 = r3.A01
            X.34x r5 = (X.C624134x) r5
            java.lang.Object r4 = r3.A02
            X.1Px r4 = (X.C22741Px) r4
            java.lang.Object r6 = r3.A03
            X.226 r6 = (X.AnonymousClass226) r6
            int r2 = r3.A00
            X.2z0 r0 = r5.A1J
            X.4uZ r1 = r0.A00
            if (r1 == 0) goto L_0x054f
            X.2pk r0 = r4.A04
            java.util.Map r0 = r0.A00(r1)
            java.util.Collection r1 = r0.values()
            int r0 = r1.size()
            if (r0 < r2) goto L_0x054f
            X.33m r2 = r4.A01
            java.lang.Object r1 = X.C73723fy.A02(r1)
            X.34x r1 = (X.C624134x) r1
            r0 = 0
            r2.A0Q(r1, r0, r0)
        L_0x054f:
            X.33m r4 = r4.A01
            int r3 = r6.durationInDisplayUnit
            int r2 = r6.displayUnit
            r1 = 1
            if (r2 == 0) goto L_0x0568
            r0 = 1
            r1 = 60
            if (r2 == r0) goto L_0x0568
            r0 = 2
            r1 = 3600(0xe10, float:5.045E-42)
            if (r2 == r0) goto L_0x0568
            r0 = 3
            if (r2 != r0) goto L_0x056e
            r1 = 86400(0x15180, float:1.21072E-40)
        L_0x0568:
            int r3 = r3 * r1
            r0 = 1
            r4.A0Q(r5, r0, r3)
            return
        L_0x056e:
            java.lang.String r0 = "TimeUnit not allowed in PinInChat expiration dialog"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)
            throw r0
        L_0x0575:
            java.lang.Object r5 = r3.A01
            X.1QG r5 = (X.AnonymousClass1QG) r5
            java.lang.Object r6 = r3.A02
            X.34x r6 = (X.C624134x) r6
            int r4 = r3.A00
            java.lang.Object r2 = r3.A03
            X.2w3 r2 = (X.C58932w3) r2
            X.2p9 r1 = r5.A02
            r0 = 0
            X.C162457s7.A0J(r6, r0)
            r0 = 5
            r1.A01(r6, r0, r4)
            X.2Yp r3 = r5.A04
            int r0 = r2.A05
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "cta-call"
            goto L_0x0604
        L_0x0598:
            java.lang.Object r6 = r3.A01
            X.34x r6 = (X.C624134x) r6
            java.lang.Object r5 = r3.A02
            X.1Q2 r5 = (X.AnonymousClass1Q2) r5
            int r4 = r3.A00
            java.lang.Object r2 = r3.A03
            X.2w3 r2 = (X.C58932w3) r2
            r0 = 3
            X.C162457s7.A0J(r2, r0)
            X.2z0 r0 = r6.A1J
            X.4uZ r0 = r0.A00
            if (r0 == 0) goto L_0x0b46
            boolean r0 = X.C624134x.A0f(r6)
            if (r0 == 0) goto L_0x05ce
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            X.2oz r3 = r5.A02
            r0 = 2
            X.20x[] r0 = new X.C370920x[r0]
            X.2kE r2 = X.C370920x.A00(r0)
            r1 = 30
            X.3aK r0 = new X.3aK
            r0.<init>(r5, r6, r4, r1)
            r3.A01(r2, r6, r0)
            return
        L_0x05ce:
            boolean r0 = X.C18300x5.A1T(r6)
            if (r0 == 0) goto L_0x0b46
            X.2p9 r1 = r5.A03
            r0 = 4
            r1.A01(r6, r0, r4)
            X.2Yp r3 = r5.A07
            int r0 = r2.A05
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "quick-reply"
            goto L_0x0604
        L_0x05e6:
            java.lang.Object r5 = r3.A01
            X.1QI r5 = (X.AnonymousClass1QI) r5
            java.lang.Object r6 = r3.A02
            X.34x r6 = (X.C624134x) r6
            int r4 = r3.A00
            java.lang.Object r2 = r3.A03
            X.2w3 r2 = (X.C58932w3) r2
            X.2p9 r1 = r5.A04
            r0 = 3
            r1.A01(r6, r0, r4)
            X.2Yp r3 = r5.A07
            int r0 = r2.A05
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "cta-url"
        L_0x0604:
            r3.A00(r6, r0, r1)
            return
        L_0x0608:
            java.lang.Object r2 = r3.A01
            X.5l7 r2 = (X.C113245l7) r2
            java.lang.Object r6 = r3.A02
            android.net.Uri r6 = (android.net.Uri) r6
            java.lang.Object r4 = r3.A03
            java.lang.Byte r4 = (java.lang.Byte) r4
            int r3 = r3.A00
            r5 = 0
            X.8qC r0 = r2.A68     // Catch:{ IOException -> 0x0680 }
            java.lang.Object r0 = r0.get()     // Catch:{ IOException -> 0x0680 }
            X.2Fi r0 = (X.C40312Fi) r0     // Catch:{ IOException -> 0x0680 }
            X.5a0 r1 = r0.A00     // Catch:{ IOException -> 0x0680 }
            r0 = 1
            java.io.InputStream r7 = r1.A07(r6, r0)     // Catch:{ IOException -> 0x0680 }
            r0 = 0
            android.graphics.Bitmap r8 = android.graphics.BitmapFactory.decodeStream(r7, r0, r0)     // Catch:{ all -> 0x0676 }
            r10 = 0
            if (r8 == 0) goto L_0x066c
            boolean r0 = r8.hasAlpha()     // Catch:{ all -> 0x0676 }
            if (r0 == 0) goto L_0x066c
            int r9 = r8.getWidth()     // Catch:{ all -> 0x0676 }
            r0 = 1
            int r9 = r9 - r0
            int r1 = r8.getHeight()     // Catch:{ all -> 0x0676 }
            int r1 = r1 - r0
            if (r9 < 0) goto L_0x066c
            if (r1 < 0) goto L_0x066c
            int r0 = r8.getPixel(r5, r5)     // Catch:{ all -> 0x0676 }
            int r0 = android.graphics.Color.alpha(r0)     // Catch:{ all -> 0x0676 }
            if (r0 == 0) goto L_0x066b
            int r0 = r8.getPixel(r9, r5)     // Catch:{ all -> 0x0676 }
            int r0 = android.graphics.Color.alpha(r0)     // Catch:{ all -> 0x0676 }
            if (r0 == 0) goto L_0x066b
            int r0 = r8.getPixel(r5, r1)     // Catch:{ all -> 0x0676 }
            int r0 = android.graphics.Color.alpha(r0)     // Catch:{ all -> 0x0676 }
            if (r0 == 0) goto L_0x066b
            int r0 = r8.getPixel(r9, r1)     // Catch:{ all -> 0x0676 }
            int r0 = android.graphics.Color.alpha(r0)     // Catch:{ all -> 0x0676 }
            if (r0 != 0) goto L_0x066c
        L_0x066b:
            r10 = 1
        L_0x066c:
            r5 = r10
            if (r8 == 0) goto L_0x0672
            r8.recycle()     // Catch:{ all -> 0x0676 }
        L_0x0672:
            r7.close()     // Catch:{ IOException -> 0x0680 }
            goto L_0x0686
        L_0x0676:
            r1 = move-exception
            r7.close()     // Catch:{ all -> 0x067b }
            goto L_0x067f
        L_0x067b:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x0680 }
        L_0x067f:
            throw r1     // Catch:{ IOException -> 0x0680 }
        L_0x0680:
            r1 = move-exception
            java.lang.String r0 = "conversation/createMentionableEntry/error while getting bitmap stream"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0686:
            if (r5 == 0) goto L_0x06b3
            X.676 r0 = r2.A2z
            X.0df r5 = r0.getSupportFragmentManager()
            X.4uZ r4 = r2.A4J
            X.C18260x0.A0O(r6, r4)
            com.whatsapp.conversation.CustomStickerConfirmationDialog r3 = new com.whatsapp.conversation.CustomStickerConfirmationDialog
            r3.<init>()
            android.os.Bundle r2 = X.AnonymousClass002.A08()
            java.lang.String r1 = "URI"
            java.lang.String r0 = r6.toString()
            r2.putString(r1, r0)
            java.lang.String r0 = "jid"
            X.AnonymousClass0x2.A0v(r2, r4, r0)
            r3.A0u(r2)
            java.lang.String r0 = "STICKER_CONFIRMATION_DIALOG"
            X.C18300x5.A1B(r3, r5, r0)
            return
        L_0x06b3:
            X.4fS r0 = r2.A2a
            r0.A0B(r6, r4, r3)
            return
        L_0x06b9:
            java.lang.Object r8 = r3.A01
            X.5g7 r8 = (X.C110365g7) r8
            int r7 = r3.A00
            java.lang.Object r6 = r3.A02
            java.lang.Object r5 = r3.A03
            com.whatsapp.conversationslist.ConversationsFragment r4 = r8.A0N
            android.content.res.Resources r2 = X.C08310eF.A09(r4)
            r1 = 2131755024(0x7f100010, float:1.9140916E38)
            java.lang.Object[] r0 = X.AnonymousClass002.A0L()
            X.C18270x1.A1Q(r0, r7)
            java.lang.String r3 = r2.getQuantityString(r1, r7, r0)
            r1 = 2131894586(0x7f12213a, float:1.942398E38)
            android.content.res.Resources r0 = X.C08310eF.A09(r4)
            java.lang.String r2 = r0.getString(r1)
            r1 = 42
            X.5f5 r0 = new X.5f5
            r0.<init>((java.lang.Object) r8, (java.lang.Object) r6, (java.lang.Object) r5, (int) r1)
            r4.A1h(r3, r2, r0)
            return
        L_0x06ed:
            java.lang.Object r5 = r3.A01
            X.2R1 r5 = (X.AnonymousClass2R1) r5
            java.lang.Object r2 = r3.A03
            X.6aY r2 = (X.C129586aY) r2
            java.lang.Object r1 = r3.A02
            X.6aY r1 = (X.C129586aY) r1
            X.11W r0 = new X.11W
            r0.<init>(r2, r1, r5)
            X.0U0 r4 = X.AnonymousClass0SC.A00(r0)
            java.util.concurrent.Executor r2 = r5.A04
            r1 = 37
            X.5rT r0 = new X.5rT
            r0.<init>(r3, r1, r4)
            r2.execute(r0)
            return
        L_0x070f:
            java.lang.Object r6 = r3.A01
            X.2hn r6 = (X.C50202hn) r6
            java.lang.Object r2 = r3.A02
            X.4uZ r2 = (X.C95814uZ) r2
            java.lang.Object r4 = r3.A03
            X.2z9 r4 = (X.C60782z9) r4
            int r1 = r3.A00
            X.3Ex r0 = r6.A00
            X.3ZH r2 = r0.A0A(r2)
            X.1ZS r5 = new X.1ZS
            r5.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r5.A01 = r0
            java.lang.String r0 = r4.A00
            r5.A03 = r0
            X.2WM r1 = r6.A05
            X.4uZ r0 = r2.A0H
            java.lang.String r0 = r1.A00(r0)
            r5.A04 = r0
            boolean r0 = r4.A02
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r5.A00 = r0
            X.2KN r2 = r6.A02
            X.33p r4 = r2.A01
            java.lang.String r7 = "pref_ctwa_customer_logging_counter_timestamp"
            android.content.SharedPreferences r0 = X.AnonymousClass0x2.A0F(r4)
            long r0 = X.AnonymousClass0x2.A0A(r0, r7)
            X.2sH r8 = r2.A00
            long r0 = X.C56612sH.A03(r8, r0)
            float r2 = (float) r0
            r0 = 1285868416(0x4ca4cb80, float:8.64E7)
            float r2 = r2 / r0
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0777
            long r0 = r8.A0H()
            X.C18260x0.A0M(r4, r7, r0)
            r0 = 0
            android.content.SharedPreferences$Editor r3 = X.C18270x1.A03(r4)
            java.lang.String r2 = "pref_ctwa_customer_logging_counter"
            X.C18270x1.A0i(r3, r2, r0)
        L_0x0777:
            X.8qC r2 = r4.A01
            android.content.SharedPreferences r0 = X.C18300x5.A0B(r2)
            java.lang.String r9 = "pref_ctwa_customer_logging_counter"
            long r0 = X.AnonymousClass0x2.A0B(r0, r9)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r5.A02 = r0
            android.content.SharedPreferences r0 = X.C18300x5.A0B(r2)
            long r2 = X.AnonymousClass0x2.A0B(r0, r9)
            long r0 = r8.A0H()
            X.C18260x0.A0M(r4, r7, r0)
            r0 = 1
            long r2 = r2 + r0
            X.C18260x0.A0M(r4, r9, r2)
            X.4FV r0 = r6.A04
        L_0x07a1:
            r0.BhD(r5)
            return
        L_0x07a5:
            java.lang.Object r0 = r3.A01
            X.2zi r0 = (X.C61102zi) r0
            java.lang.Object r5 = r3.A02
            X.4uZ r5 = (X.C95814uZ) r5
            java.lang.Object r4 = r3.A03
            java.util.Collection r4 = (java.util.Collection) r4
            int r2 = r3.A00
            java.util.Iterator r1 = X.C61102zi.A03(r0)
        L_0x07b7:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0b46
            java.lang.Object r0 = r1.next()
            X.4FD r0 = (X.AnonymousClass4FD) r0
            r0.BLf(r5, r4, r2)
            goto L_0x07b7
        L_0x07c7:
            java.lang.Object r0 = r3.A01
            X.3Lv r0 = (X.C66543Lv) r0
            java.lang.Object r5 = r3.A02
            X.34x r5 = (X.C624134x) r5
            int r4 = r3.A00
            java.lang.Object r3 = r3.A03
            java.util.concurrent.CountDownLatch r3 = (java.util.concurrent.CountDownLatch) r3
            X.1io r2 = r0.A14
            java.lang.String r0 = "MessageObservers/notifyBeforeMessageAdded"
            java.util.Iterator r1 = X.C61102zi.A04(r2, r0)
        L_0x07dd:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x07eb
            X.4FW r0 = X.C29431io.A00(r2, r1)
            r0.BNb(r5, r4)
            goto L_0x07dd
        L_0x07eb:
            r3.countDown()
            return
        L_0x07ef:
            java.lang.Object r4 = r3.A01
            X.300 r4 = (X.AnonymousClass300) r4
            java.lang.Object r2 = r3.A02
            X.2z0 r2 = (X.AnonymousClass2z0) r2
            int r1 = r3.A00
            java.lang.Object r0 = r3.A03
            X.2JG r0 = (X.AnonymousClass2JG) r0
            r4.A03(r0, r2, r1)
            return
        L_0x0801:
            java.lang.Object r2 = r3.A01
            com.whatsapp.gallery.MediaGalleryFragmentBase r2 = (com.whatsapp.gallery.MediaGalleryFragmentBase) r2
            int r1 = r3.A00
            java.lang.Object r4 = r3.A02
            java.lang.Object r5 = r3.A03
            X.8v5 r0 = r2.A0L
            if (r0 == 0) goto L_0x0821
            X.8ug r3 = r0.Bhe(r1)
        L_0x0813:
            X.3Wi r0 = r2.A1J()
            r6 = 1
            X.3ac r1 = new X.3ac
            r1.<init>(r2, r3, r4, r5, r6)
            r0.A0S(r1)
            return
        L_0x0821:
            r3 = 0
            goto L_0x0813
        L_0x0823:
            java.lang.Object r4 = r3.A01
            X.2qa r4 = (X.C55582qa) r4
            java.lang.Object r2 = r3.A02
            com.whatsapp.jid.GroupJid r2 = (com.whatsapp.jid.GroupJid) r2
            int r0 = r3.A00
            java.lang.Object r1 = r3.A03
            X.2OD r1 = (X.AnonymousClass2OD) r1
            int r0 = r0 + 1
            r4.A03(r1, r2, r0)
            return
        L_0x0837:
            java.lang.Object r0 = r3.A01
            X.3Ch r0 = (X.C64153Ch) r0
            java.lang.Object r4 = r3.A02
            com.whatsapp.jid.GroupJid r4 = (com.whatsapp.jid.GroupJid) r4
            int r2 = r3.A00
            java.lang.Object r1 = r3.A03
            X.2OD r1 = (X.AnonymousClass2OD) r1
            X.2qa r0 = r0.A02
            r0.A03(r1, r4, r2)
            return
        L_0x084b:
            java.lang.Object r5 = r3.A01
            com.whatsapp.group.GroupChatInfoActivity r5 = (com.whatsapp.group.GroupChatInfoActivity) r5
            java.lang.Object r6 = r3.A02
            android.view.View r6 = (android.view.View) r6
            java.lang.Object r2 = r3.A03
            X.3ZH r2 = (X.AnonymousClass3ZH) r2
            int r4 = r3.A00
            r5.invalidateOptionsMenu()
            r0 = 2131430998(0x7f0b0e56, float:1.8483713E38)
            android.view.View r3 = X.C005205m.A00(r5, r0)
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            X.33j r1 = r5.A11
            r0 = 2131231275(0x7f08022b, float:1.8078626E38)
            X.C18270x1.A0d(r5, r3, r1, r0)
            r3 = 0
            r6.setVisibility(r3)
            r0 = 37
            X.C18310x6.A18(r6, r5, r0)
            r0 = 2131431000(0x7f0b0e58, float:1.8483717E38)
            android.view.View r1 = X.C005205m.A00(r5, r0)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            X.5Uq r0 = r5.A0v
            r0.A08(r1, r2)
            X.2lX r0 = r5.A0P
            boolean r0 = r0.A00(r2)
            if (r0 == 0) goto L_0x0891
            r0 = 1056964608(0x3f000000, float:0.5)
            r1.setAlpha(r0)
        L_0x0891:
            r0 = 2131431002(0x7f0b0e5a, float:1.848372E38)
            android.view.View r1 = X.C005205m.A00(r5, r0)
            com.whatsapp.TextEmojiLabel r1 = (com.whatsapp.TextEmojiLabel) r1
            X.5ZU r0 = r5.A0t
            java.lang.String r0 = r0.A0H(r2)
            r1.A0I(r0)
            X.C106905aM.A04(r1)
            r0 = 2131431001(0x7f0b0e59, float:1.8483719E38)
            android.widget.TextView r2 = X.C005205m.A01(r5, r0)
            android.content.res.Resources r1 = r5.getResources()
            r0 = 2131755173(0x7f1000a5, float:1.9141218E38)
            java.lang.String r0 = X.AnonymousClass0x2.A0Y(r1, r4, r3, r0)
            r2.setText(r0)
            return
        L_0x08bc:
            java.lang.Object r6 = r3.A01
            com.whatsapp.invites.SMSPreviewInviteBottomSheetFragment r6 = (com.whatsapp.invites.SMSPreviewInviteBottomSheetFragment) r6
            java.lang.Object r5 = r3.A02
            X.1fJ r5 = (X.C27991fJ) r5
            java.lang.Object r4 = r3.A03
            android.view.View r4 = (android.view.View) r4
            int r7 = r3.A00
            X.03q r1 = r6.A0Q()
            if (r1 == 0) goto L_0x08d9
            r0 = 45
            X.3Zm r0 = X.C70003Zm.A00(r4, r0)
            r1.runOnUiThread(r0)
        L_0x08d9:
            java.util.ArrayList r11 = X.AnonymousClass001.A0s()
            java.util.ArrayList r0 = r6.A0F
            java.util.Iterator r2 = r0.iterator()
        L_0x08e3:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x08f6
            com.whatsapp.jid.UserJid r1 = X.C18310x6.A0T(r2)
            X.1wZ r0 = new X.1wZ
            r0.<init>((com.whatsapp.jid.UserJid) r1)
            r11.add(r0)
            goto L_0x08e3
        L_0x08f6:
            X.31C r0 = r6.A0A
            if (r0 == 0) goto L_0x0941
            java.lang.String r12 = r0.A03()
            X.1wm r10 = X.C35381wm.A00(r5, r12)
            X.2rL r9 = X.C56052rL.A01()
            java.lang.String r0 = "store_sent_invite_sms"
            X.2rL r8 = X.C56052rL.A04(r0)
            r2 = 1
            r0 = 32
            boolean r0 = X.C626836d.A0O(r11, r2, r0)
            if (r0 == 0) goto L_0x0925
            java.util.Iterator r1 = r11.iterator()
        L_0x091b:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0925
            X.C41032Ir.A0F(r8, r1)
            goto L_0x091b
        L_0x0925:
            X.36K r11 = X.C41032Ir.A03(r8, r9, r10)
            X.31C r9 = r6.A0A
            if (r9 == 0) goto L_0x093a
            r13 = 408(0x198, float:5.72E-43)
            X.3St r10 = new X.3St
            r10.<init>(r4, r6, r5, r7)
            r14 = 0
            r9.A0D(r10, r11, r12, r13, r14)
            return
        L_0x093a:
            java.lang.String r0 = "messageClient"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0941:
            java.lang.String r0 = "messageClient"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0948:
            java.lang.Object r10 = r3.A01
            com.whatsapp.invites.SMSPreviewInviteBottomSheetFragment r10 = (com.whatsapp.invites.SMSPreviewInviteBottomSheetFragment) r10
            java.lang.Object r2 = r3.A02
            X.1fJ r2 = (X.C27991fJ) r2
            java.lang.Object r7 = r3.A03
            java.util.AbstractCollection r7 = (java.util.AbstractCollection) r7
            int r3 = r3.A00
            r8 = 0
            r6 = 1
            r5 = 2
            X.C162457s7.A0J(r7, r5)
            X.3Ex r0 = r10.A02
            if (r0 == 0) goto L_0x0a05
            X.3ZH r9 = r0.A0A(r2)
            X.2ss r0 = r10.A08
            if (r0 == 0) goto L_0x09fe
            java.lang.String r0 = r0.A0D(r2)
            if (r0 == 0) goto L_0x0975
            int r1 = r0.length()
            r0 = 0
            if (r1 != 0) goto L_0x0976
        L_0x0975:
            r0 = 1
        L_0x0976:
            java.lang.String r4 = "https://whatsapp.com/dl/"
            boolean r1 = r10.A1Z(r2)
            if (r0 != 0) goto L_0x09ab
            r2 = 2131893503(0x7f121cff, float:1.9421784E38)
            if (r1 == 0) goto L_0x0986
            r2 = 2131893482(0x7f121cea, float:1.9421742E38)
        L_0x0986:
            java.lang.Object[] r1 = new java.lang.Object[r5]
            X.5ZU r0 = r10.A03
            if (r0 == 0) goto L_0x09f6
            java.lang.String r0 = r0.A0R(r9, r6, r8)
            r1[r8] = r0
            java.lang.String r13 = X.AnonymousClass0x7.A0n(r10, r4, r1, r6, r2)
        L_0x0996:
            X.C162457s7.A0H(r13)
            java.util.ArrayList r11 = X.AnonymousClass001.A0s()
            java.util.Iterator r1 = r7.iterator()
        L_0x09a1:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x09b8
            X.C18270x1.A1L(r11, r1)
            goto L_0x09a1
        L_0x09ab:
            r0 = 2131893505(0x7f121d01, float:1.9421788E38)
            if (r1 == 0) goto L_0x09b3
            r0 = 2131893504(0x7f121d00, float:1.9421786E38)
        L_0x09b3:
            java.lang.String r13 = X.C18310x6.A0m(r10, r4, r0)
            goto L_0x0996
        L_0x09b8:
            X.3Yy r12 = new X.3Yy
            r12.<init>()
            if (r3 == 0) goto L_0x09eb
            if (r3 == r6) goto L_0x09ed
            r1 = 22
            if (r3 == r5) goto L_0x09e6
            r0 = 3
            if (r3 == r0) goto L_0x09eb
            r0 = 4
            if (r3 == r0) goto L_0x09e6
        L_0x09cb:
            java.lang.Object r0 = r12.element
            if (r0 == 0) goto L_0x0b46
            X.03q r1 = r10.A0Q()
            if (r1 == 0) goto L_0x0b46
            int r0 = r11.size()
            if (r0 <= 0) goto L_0x0b46
            r14 = 23
            X.3cN r9 = new X.3cN
            r9.<init>(r10, r11, r12, r13, r14)
            r1.runOnUiThread(r9)
            return
        L_0x09e6:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            goto L_0x09f3
        L_0x09eb:
            r0 = 0
            goto L_0x09f3
        L_0x09ed:
            r0 = 21
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x09f3:
            r12.element = r0
            goto L_0x09cb
        L_0x09f6:
            java.lang.String r0 = "waContactNames"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x09fe:
            java.lang.String r0 = "chatsCache"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0a05:
            java.lang.String r0 = "contactManager"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0a0c:
            java.lang.Object r4 = r3.A01
            com.whatsapp.invites.SMSPreviewInviteBottomSheetFragment r4 = (com.whatsapp.invites.SMSPreviewInviteBottomSheetFragment) r4
            java.lang.Object r2 = r3.A02
            android.view.View r2 = (android.view.View) r2
            java.lang.Object r5 = r3.A03
            int r7 = r3.A00
            boolean r0 = r4.A0i
            r1 = 1
            if (r0 != 0) goto L_0x0a27
            boolean r0 = r4.A0Z
            if (r0 != 0) goto L_0x0a27
            r2.setEnabled(r1)
            r4.A1L()
        L_0x0a27:
            X.03q r0 = r4.A0Q()
            if (r0 == 0) goto L_0x0b46
            boolean r0 = r0.isFinishing()
            if (r0 != 0) goto L_0x0b46
            X.03q r0 = r4.A0Q()
            if (r0 == 0) goto L_0x0b46
            boolean r0 = r0.isDestroyed()
            if (r0 != 0) goto L_0x0b46
            java.util.ArrayList r6 = r4.A0F
            X.4FS r0 = r4.A0B
            if (r0 == 0) goto L_0x0a50
            r8 = 22
            X.3c6 r3 = new X.3c6
            r3.<init>(r4, r5, r6, r7, r8)
            r0.BkP(r3)
            return
        L_0x0a50:
            java.lang.String r0 = "waWorkers"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0a58:
            java.lang.Object r7 = r3.A01
            X.33c r7 = (X.C620033c) r7
            java.lang.Object r6 = r3.A02
            X.3QO r6 = (X.AnonymousClass3QO) r6
            int r5 = r3.A00
            java.lang.Object r4 = r3.A03
            X.2zt r4 = (X.C61212zt) r4
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "MediaJobManager/enqueueUploading/responseCallback Streaming upload failed, enqueue a new upload for media job "
            X.C18260x0.A1R(r1, r0, r6)
            X.4FV r3 = r7.A07
            X.33a r2 = r6.A0M
            int r1 = r6.A01
            X.1VX r0 = r7.A06
            X.1bW r0 = r2.A02(r0, r5, r1)
            r3.BhD(r0)
            r7.A0A(r6, r4)
            return
        L_0x0a82:
            java.lang.Object r4 = r3.A01
            X.33d r4 = (X.C620133d) r4
            java.lang.Object r2 = r3.A02
            X.1mV r2 = (X.C30471mV) r2
            int r1 = r3.A00
            java.lang.Object r0 = r3.A03
            X.4EV r0 = (X.AnonymousClass4EV) r0
            r4.A07(r0, r2, r1)
            return
        L_0x0a94:
            java.lang.Object r0 = r3.A01
            X.33d r0 = (X.C620133d) r0
            java.lang.Object r2 = r3.A02
            X.1mV r2 = (X.C30471mV) r2
            java.lang.Object r1 = r3.A03
            X.33C r1 = (X.AnonymousClass33C) r1
            int r6 = r3.A00
            X.1i8 r5 = r0.A0Z
            X.38t r0 = X.AnonymousClass36O.A02(r2)
            java.lang.String r4 = r0.A02
            java.lang.String r3 = r2.A03
            java.lang.String r2 = r1.A0G
            r1 = 1
            if (r6 != 0) goto L_0x0ab2
            r1 = 2
        L_0x0ab2:
            r0 = 1
            X.C626936e.A0C(r0)
            if (r4 != 0) goto L_0x0aba
            java.lang.String r4 = "image"
        L_0x0aba:
            r5.A0J(r4, r3, r2, r1)
            return
        L_0x0abe:
            java.lang.Object r0 = r3.A01
            X.2yO r0 = (X.C60342yO) r0
            int r14 = r3.A00
            java.lang.Object r12 = r3.A02
            java.io.File r12 = (java.io.File) r12
            java.lang.Object r4 = r3.A03
            X.2Na r4 = (X.C42162Na) r4
            X.2qk r1 = r0.A01
            com.whatsapp.stickers.WebpUtils r8 = r0.A0G
            X.3Dh r2 = r0.A02
            X.5ah r10 = r0.A0I
            X.2Yt r9 = r0.A0H
            X.36E r3 = r0.A03
            X.5af r11 = r0.A0J
            X.2dc r7 = r0.A0D
            X.2sk r6 = r0.A0C
            X.1I7 r5 = r0.A0B
            int r13 = r5.A12
            X.AnonymousClass36U.A05(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            java.lang.String r0 = "MediaDownload/ProgressiveJpeg/generatedThumbnail"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            return
        L_0x0aeb:
            java.lang.Object r4 = r3.A01
            com.whatsapp.mentions.MentionableEntry r4 = (com.whatsapp.mentions.MentionableEntry) r4
            java.lang.Object r1 = r3.A02
            X.3ZH r1 = (X.AnonymousClass3ZH) r1
            java.lang.Object r0 = r3.A03
            X.7HU r0 = (X.AnonymousClass7HU) r0
            int r3 = r3.A00
            r4.A0I(r0, r1)
            r0 = 32
            if (r3 != r0) goto L_0x0b17
            java.lang.String r2 = "imagine"
            android.text.Editable r1 = r4.getText()
            if (r1 == 0) goto L_0x0b17
            java.lang.String r0 = "/"
            android.text.Editable r0 = r1.append(r0)
            android.text.Editable r1 = r0.append(r2)
            java.lang.String r0 = " "
            r1.append(r0)
        L_0x0b17:
            X.4uZ r2 = r4.A0B
            if (r2 == 0) goto L_0x0b46
            r0 = 8
            if (r3 != r0) goto L_0x0b27
            X.5mB r1 = r4.A08
            X.21N r0 = X.AnonymousClass21N.DEFAULT_BOT_CLICKED
        L_0x0b23:
            r1.A04(r0, r2)
            return
        L_0x0b27:
            r0 = 32
            if (r3 != r0) goto L_0x0b46
            X.5mB r1 = r4.A08
            X.21N r0 = X.AnonymousClass21N.DEFAULT_BOT_IMAGINE_CMD_CLICKED
            goto L_0x0b23
        L_0x0b30:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "asyncaudioplayer/play/e Error playing URI: "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = " with stream: "
            java.lang.String r0 = X.AnonymousClass000.A0Y(r0, r1, r3)
            com.whatsapp.util.Log.w(r0, r2)
        L_0x0b46:
            return
        L_0x0b47:
            java.lang.Object r4 = r3.A01
            X.3Qm r4 = (X.C67743Qm) r4
            int r2 = r3.A00
            java.lang.Object r1 = r3.A02
            X.36K r1 = (X.AnonymousClass36K) r1
            java.lang.Object r0 = r3.A03
            X.39T r0 = (X.AnonymousClass39T) r0
            r4.A02(r1, r0, r2)
            return
        L_0x0b59:
            java.lang.Object r5 = r3.A01
            X.2U7 r5 = (X.AnonymousClass2U7) r5
            java.lang.Object r4 = r3.A02
            X.4uZ r4 = (X.C95814uZ) r4
            java.lang.Object r6 = r3.A03
            com.whatsapp.jid.Jid r6 = (com.whatsapp.jid.Jid) r6
            int r8 = r3.A00
            X.3S3 r7 = r5.A0C
            java.util.HashMap r0 = r7.A06
            X.2SS r3 = X.C18290x4.A0R(r4, r0)
            if (r6 == 0) goto L_0x0b9b
            boolean r0 = X.C627336j.A0K(r4)
            if (r0 == 0) goto L_0x0b9b
            java.util.HashMap r0 = r3.A05
            if (r0 != 0) goto L_0x0b81
            java.util.HashMap r0 = X.AnonymousClass001.A0t()
            r3.A05 = r0
        L_0x0b81:
            java.lang.Object r2 = r0.get(r6)
            X.2La r2 = (X.C41642La) r2
            if (r2 != 0) goto L_0x0b93
            X.2La r2 = new X.2La
            r2.<init>()
            java.util.HashMap r0 = r3.A05
            r0.put(r6, r2)
        L_0x0b93:
            long r0 = android.os.SystemClock.elapsedRealtime()
            r2.A01 = r0
            r2.A00 = r8
        L_0x0b9b:
            long r0 = android.os.SystemClock.elapsedRealtime()
            r3.A03 = r0
            r3.A00 = r8
            if (r6 != 0) goto L_0x0bcd
            java.lang.String r2 = r4.getRawString()
        L_0x0ba9:
            java.util.HashMap r1 = r7.A05
            java.lang.Object r3 = r1.get(r2)
            X.3aM r3 = (X.C70353aM) r3
            if (r3 != 0) goto L_0x0bbd
            r0 = 34
            X.3aM r3 = new X.3aM
            r3.<init>(r6, r4, r7, r0)
            r1.put(r2, r3)
        L_0x0bbd:
            android.os.Handler r2 = r7.A00
            r2.removeCallbacks(r3)
            r0 = 25000(0x61a8, double:1.23516E-319)
            r2.postDelayed(r3, r0)
            X.1ib r0 = r5.A04
            r0.A08(r4)
            return
        L_0x0bcd:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = r4.getRawString()
            java.lang.String r2 = X.C18260x0.A03(r6, r0, r1)
            goto L_0x0ba9
        L_0x0bda:
            java.lang.Object r0 = r3.A01
            X.5Um r0 = (X.C105325Um) r0
            int r1 = r3.A00
            java.lang.Object r4 = r3.A02
            java.lang.ref.Reference r4 = (java.lang.ref.Reference) r4
            java.lang.Object r2 = r3.A03
            X.4GQ r2 = (X.AnonymousClass4GQ) r2
            X.2rB r0 = r0.A08
            java.lang.String r1 = r0.A00(r1)
            X.4ea r0 = X.C18320x8.A0F(r4)
            if (r0 == 0) goto L_0x0bf7
            r0.BjL()
        L_0x0bf7:
            if (r1 == 0) goto L_0x0c00
            int r1 = r1.length()
            r0 = 0
            if (r1 != 0) goto L_0x0c01
        L_0x0c00:
            r0 = 1
        L_0x0c01:
            java.lang.Boolean r0 = X.C18320x8.A0V(r0)
            r2.invoke(r0)
            return
        L_0x0c09:
            java.lang.Object r4 = r3.A01
            X.5NY r4 = (X.AnonymousClass5NY) r4
            java.lang.Object r0 = r3.A02
            int r1 = r3.A00
            java.lang.Object r3 = r3.A03
            X.5ZC r3 = (X.AnonymousClass5ZC) r3
            X.1Xr r2 = new X.1Xr
            r2.<init>()
            java.lang.String r0 = X.C18310x6.A0n(r0)
            r2.A02 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r2.A00 = r0
            X.2Zo r0 = r4.A01
            java.lang.Long r0 = r0.A00()
            r2.A01 = r0
            X.4FV r1 = r4.A00
            int r0 = r3.A01
            r1.BhE(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71433c6.run():void");
    }

    public C71433c6(C50202hn r2, C60782z9 r3, UserJid userJid, int i) {
        this.A04 = 13;
        this.A01 = r2;
        this.A02 = userJid;
        this.A03 = r3;
        this.A00 = i;
    }
}
