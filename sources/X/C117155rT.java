package X;

/* renamed from: X.5rT  reason: invalid class name and case insensitive filesystem */
public class C117155rT implements Runnable {
    public Object A00;
    public Object A01;
    public final int A02;

    public C117155rT(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    public static void A00(AnonymousClass4FS r1, Object obj, Object obj2, int i) {
        r1.BkM(new C117155rT(obj, i, obj2));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:213:0x0484, code lost:
        r2.A0S(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x0487, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:397:0x09cd, code lost:
        r0.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:398:0x09d0, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x02aa  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x0302  */
    /* JADX WARNING: Removed duplicated region for block: B:421:0x02ac A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r20 = this;
            r3 = r20
            int r0 = r3.A02
            switch(r0) {
                case 0: goto L_0x04c7;
                case 1: goto L_0x0024;
                case 2: goto L_0x04d9;
                case 3: goto L_0x04f1;
                case 4: goto L_0x0525;
                case 5: goto L_0x0981;
                case 6: goto L_0x099c;
                case 7: goto L_0x053b;
                case 8: goto L_0x0552;
                case 9: goto L_0x09b7;
                case 10: goto L_0x05d0;
                case 11: goto L_0x060f;
                case 12: goto L_0x0652;
                case 13: goto L_0x065e;
                case 14: goto L_0x0050;
                case 15: goto L_0x0145;
                case 16: goto L_0x016a;
                case 17: goto L_0x0184;
                case 18: goto L_0x01b7;
                case 19: goto L_0x066a;
                case 20: goto L_0x0335;
                case 21: goto L_0x0680;
                case 22: goto L_0x0697;
                case 23: goto L_0x06b4;
                case 24: goto L_0x0351;
                case 25: goto L_0x06df;
                case 26: goto L_0x070c;
                case 27: goto L_0x0376;
                case 28: goto L_0x0736;
                case 29: goto L_0x039f;
                case 30: goto L_0x075b;
                case 31: goto L_0x0007;
                case 32: goto L_0x0007;
                case 33: goto L_0x078f;
                case 34: goto L_0x079d;
                case 35: goto L_0x07a9;
                case 36: goto L_0x07bb;
                case 37: goto L_0x03c3;
                case 38: goto L_0x07c9;
                case 39: goto L_0x07d9;
                case 40: goto L_0x07f3;
                case 41: goto L_0x08d4;
                case 42: goto L_0x0913;
                case 43: goto L_0x091f;
                case 44: goto L_0x03e1;
                case 45: goto L_0x09c7;
                case 46: goto L_0x03f3;
                case 47: goto L_0x092b;
                case 48: goto L_0x0488;
                case 49: goto L_0x0948;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r1 = r3.A00
            X.1IL r1 = (X.AnonymousClass1IL) r1
            java.lang.Object r0 = r3.A01
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isFinishing()
            if (r0 != 0) goto L_0x0023
            com.whatsapp.conversationslist.ConversationsFragment r2 = r1.A04
            android.widget.ListView r1 = r2.A0E
            if (r1 == 0) goto L_0x0020
            android.view.View r0 = r2.A09
            r1.removeHeaderView(r0)
        L_0x0020:
            r0 = 0
            r2.A09 = r0
        L_0x0023:
            return
        L_0x0024:
            java.lang.Object r1 = r3.A00
            X.5l7 r1 = (X.C113245l7) r1
            java.lang.Object r3 = r3.A01
            com.whatsapp.jid.UserJid r3 = (com.whatsapp.jid.UserJid) r3
            java.lang.String r0 = r1.A6F
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0023
            X.2n3 r2 = r1.A3Q
            java.lang.String r4 = r1.A6F
            java.lang.String r5 = r1.A6E
            X.676 r0 = r1.A2z
            r0.getTime()
            long r6 = java.lang.System.currentTimeMillis()
            X.676 r0 = r1.A2z
            r0.getTime()
            long r8 = java.lang.System.currentTimeMillis()
            r2.A03(r3, r4, r5, r6, r8)
            return
        L_0x0050:
            java.lang.Object r9 = r3.A01
            X.4VQ r9 = (X.AnonymousClass4VQ) r9
            if (r9 == 0) goto L_0x0023
            X.3Lv r2 = r9.A0m
            X.4uZ r11 = r9.A0x
            boolean r0 = X.C627336j.A0K(r11)
            if (r0 != 0) goto L_0x0081
            java.util.ArrayList r8 = X.AnonymousClass001.A0s()
        L_0x0064:
            java.util.ArrayList r0 = r9.A1H
            r0.clear()
            r0.addAll(r8)
            X.5Pd r2 = X.C103975Pd.A00(r9, r0)
            java.lang.Object r0 = r3.A00
            X.7Dq r0 = (X.C147317Dq) r0
            r1 = 0
            if (r0 == 0) goto L_0x007e
            X.08M r0 = r0.A00
            r0.A0G(r2)
            r3.A00 = r1
        L_0x007e:
            r3.A01 = r1
            return
        L_0x0081:
            X.2ss r1 = r2.A0X
            X.31A r0 = X.C56982ss.A01(r1, r11)
            if (r0 != 0) goto L_0x0141
            r6 = 1
        L_0x008b:
            X.31A r0 = X.C56982ss.A01(r1, r11)
            if (r0 != 0) goto L_0x013d
            r4 = 1
        L_0x0093:
            java.util.ArrayList r8 = X.AnonymousClass001.A0s()
            r12 = 1
            int r0 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r0 != 0) goto L_0x00ab
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "CoreMessageStore/get-important-messages empty jid="
            java.lang.String r0 = X.AnonymousClass000.A0P(r11, r0, r1)
        L_0x00a7:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            goto L_0x0064
        L_0x00ab:
            java.lang.String r0 = "msgstore/get-important-messages"
            X.33M r10 = new X.33M
            r10.<init>((java.lang.String) r0)
            r0 = 3
            java.lang.String[] r12 = new java.lang.String[r0]
            X.2sm r0 = r2.A0W
            long r0 = r0.A07(r11)
            X.C18260x0.A1X(r12, r0)
            r0 = 1
            X.AnonymousClass0x2.A1S(r12, r0, r6)
            X.2rr r0 = r2.A1U
            long r0 = r0.A04(r4)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            r0 = 2
            r12[r0] = r1
            X.3dV r0 = r2.A18     // Catch:{ SQLiteDatabaseCorruptException -> 0x0119 }
            X.4GK r5 = r0.get()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0119 }
            r0 = r5
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x010f }
            X.2sg r4 = r0.A03     // Catch:{ all -> 0x010f }
            java.lang.String r1 = X.AnonymousClass2C9.A00     // Catch:{ all -> 0x010f }
            java.lang.String r0 = "GET_MESSAGES_RANGE_SQL"
            android.database.Cursor r4 = r4.A0E(r1, r0, r12)     // Catch:{ all -> 0x010f }
        L_0x00e2:
            boolean r0 = r4.moveToNext()     // Catch:{ all -> 0x0103 }
            if (r0 == 0) goto L_0x00fc
            X.2qz r0 = r2.A2D     // Catch:{ all -> 0x0103 }
            X.34x r1 = r0.A04(r4, r11)     // Catch:{ all -> 0x0103 }
            if (r1 == 0) goto L_0x00e2
            X.2sr r0 = r2.A09     // Catch:{ all -> 0x0103 }
            boolean r0 = X.C627636p.A0M(r0, r1)     // Catch:{ all -> 0x0103 }
            if (r0 == 0) goto L_0x00e2
            r8.add(r1)     // Catch:{ all -> 0x0103 }
            goto L_0x00e2
        L_0x00fc:
            r4.close()     // Catch:{ all -> 0x010f }
            r5.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0119 }
            goto L_0x0122
        L_0x0103:
            r1 = move-exception
            if (r4 == 0) goto L_0x010e
            r4.close()     // Catch:{ all -> 0x010a }
            goto L_0x010e
        L_0x010a:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x010f }
        L_0x010e:
            throw r1     // Catch:{ all -> 0x010f }
        L_0x010f:
            r1 = move-exception
            r5.close()     // Catch:{ all -> 0x0114 }
            goto L_0x0118
        L_0x0114:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0119 }
        L_0x0118:
            throw r1     // Catch:{ SQLiteDatabaseCorruptException -> 0x0119 }
        L_0x0119:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            X.2q5 r0 = r2.A17
            r0.A04()
        L_0x0122:
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "CoreMessageStore/get-important-messages time spent:"
            r2.append(r0)
            long r0 = r10.A07()
            r2.append(r0)
            java.lang.String r0 = " found:"
            X.C18260x0.A19(r0, r2, r8)
            java.lang.String r0 = r2.toString()
            goto L_0x00a7
        L_0x013d:
            long r4 = r0.A0L
            goto L_0x0093
        L_0x0141:
            long r6 = r0.A0Q
            goto L_0x008b
        L_0x0145:
            java.lang.Object r4 = r3.A00
            X.4UA r4 = (X.AnonymousClass4UA) r4
            java.lang.Object r3 = r3.A01
            com.whatsapp.jid.UserJid r3 = (com.whatsapp.jid.UserJid) r3
            X.3Ls r0 = r4.A01
            if (r0 == 0) goto L_0x0023
            X.33g r2 = r4.A0M
            java.lang.String r1 = r2.A03(r3)
            if (r1 == 0) goto L_0x0161
            X.3Ls r0 = r4.A01
            r0.A0G = r1
            r4.A0L(r3)
            return
        L_0x0161:
            X.4CM r1 = r4.A02
            if (r1 == 0) goto L_0x0023
            r0 = 0
            r2.A08(r1, r3, r0)
            return
        L_0x016a:
            java.lang.Object r2 = r3.A00
            X.4UA r2 = (X.AnonymousClass4UA) r2
            java.lang.Object r0 = r3.A01
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            X.3Ls r1 = r2.A01
            if (r1 == 0) goto L_0x0023
            byte[] r0 = r1.A0G(r0)
            r1.A0V = r0
            X.3Ls r1 = r2.A01
            X.59D r0 = X.AnonymousClass59D.SMALL_THUMBNAIL_LOADED
            r2.A0G(r1, r0)
            return
        L_0x0184:
            java.lang.Object r4 = r3.A00
            X.4pu r4 = (X.C94104pu) r4
            java.lang.Object r3 = r3.A01
            java.util.List r3 = (java.util.List) r3
            X.03q r0 = r4.A02
            if (r0 == 0) goto L_0x0023
            boolean r0 = r0.isFinishing()
            if (r0 != 0) goto L_0x0023
            android.view.ViewGroup r0 = r4.A01
            if (r0 == 0) goto L_0x0023
            r0 = 0
            r4.A02(r0)
            X.03q r2 = r4.A02
            android.view.ViewGroup r1 = r4.A01
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x01b4
            java.util.ArrayList r3 = (java.util.ArrayList) r3
        L_0x01aa:
            java.util.ArrayList r0 = r4.A04
            int r0 = r0.size()
            r4.A04(r1, r2, r3, r0)
            return
        L_0x01b4:
            java.util.ArrayList r3 = r4.A03
            goto L_0x01aa
        L_0x01b7:
            java.lang.Object r6 = r3.A00
            X.4pu r6 = (X.C94104pu) r6
            java.lang.Object r3 = r3.A01
            java.util.List r3 = (java.util.List) r3
            java.util.ArrayList r9 = r6.A04
            if (r9 == 0) goto L_0x0023
            java.util.ArrayList r10 = r6.A03
            if (r10 == 0) goto L_0x0023
            X.7IQ r7 = r6.A09
            java.util.ArrayList r5 = X.AnonymousClass001.A0s()
            if (r3 == 0) goto L_0x032a
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x032a
            X.1VX r4 = r7.A01
            r0 = 6202(0x183a, float:8.691E-42)
            boolean r0 = r4.A0X(r0)
            if (r0 == 0) goto L_0x032a
            java.util.LinkedHashMap r12 = X.C18320x8.A0r()
            java.util.Iterator r2 = r9.iterator()
        L_0x01e7:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0201
            X.3ZH r1 = X.C18310x6.A0R(r2)
            if (r1 == 0) goto L_0x01e7
            com.whatsapp.jid.Jid r0 = X.AnonymousClass3ZH.A03(r1)
            if (r0 == 0) goto L_0x01e7
            java.lang.String r0 = r0.getRawString()
            r12.put(r0, r1)
            goto L_0x01e7
        L_0x0201:
            java.util.HashMap r11 = X.AnonymousClass001.A0t()
            r0 = 6203(0x183b, float:8.692E-42)
            float r8 = r4.A0L(r0)
            java.util.Iterator r2 = r10.iterator()
        L_0x020f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0227
            X.3ZH r1 = X.C18310x6.A0R(r2)
            if (r1 == 0) goto L_0x020f
            boolean r0 = r1.A0m
            if (r0 == 0) goto L_0x020f
            java.lang.Float r0 = java.lang.Float.valueOf(r8)
            r11.put(r1, r0)
            goto L_0x020f
        L_0x0227:
            r0 = 6205(0x183d, float:8.695E-42)
            float r19 = r4.A0L(r0)
            r0 = 6204(0x183c, float:8.694E-42)
            float r18 = r4.A0L(r0)
            java.util.Iterator r17 = r3.iterator()
        L_0x0237:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x02bb
            java.lang.Object r1 = r17.next()
            X.5Ry r1 = (X.C104685Ry) r1
            X.57r r10 = r1.A00
            X.57r r8 = X.C997057r.PRESENCE
            if (r10 != r8) goto L_0x02b4
            r16 = r19
        L_0x024b:
            java.util.List r13 = r1.A01
            int r4 = r13.size()
            r3 = 0
        L_0x0252:
            if (r3 >= r4) goto L_0x0237
            java.lang.Object r14 = r13.get(r3)
            X.7YR r14 = (X.AnonymousClass7YR) r14
            java.lang.String r0 = r14.A01
            java.lang.Object r2 = r12.get(r0)
            X.3ZH r2 = (X.AnonymousClass3ZH) r2
            if (r2 == 0) goto L_0x02ac
            boolean r0 = r11.containsKey(r2)
            if (r0 == 0) goto L_0x02af
            java.lang.Number r0 = X.AnonymousClass0x9.A0p(r2, r11)
            if (r0 == 0) goto L_0x027d
            float r0 = r0.floatValue()
            float r0 = r0 + r16
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
        L_0x027a:
            r11.put(r2, r0)
        L_0x027d:
            int r0 = r13.size()
            r1 = 1
            int r0 = r0 - r1
            if (r3 >= r0) goto L_0x029e
            java.lang.Object r0 = r13.get(r3)
            X.7YR r0 = (X.AnonymousClass7YR) r0
            int r15 = r0.A00
            int r0 = r3 + 1
            java.lang.Object r0 = r13.get(r0)
            X.7YR r0 = (X.AnonymousClass7YR) r0
            int r0 = r0.A00
            if (r15 == r0) goto L_0x029e
            r0 = 981668463(0x3a83126f, float:0.001)
            float r16 = r16 - r0
        L_0x029e:
            if (r10 != r8) goto L_0x02a6
            int r0 = r14.A00
            if (r0 != 0) goto L_0x02a6
            r2.A0p = r1
        L_0x02a6:
            X.57r r0 = X.C997057r.PROFILE_PICTURE
            if (r10 != r0) goto L_0x02ac
            r2.A0h = r1
        L_0x02ac:
            int r3 = r3 + 1
            goto L_0x0252
        L_0x02af:
            java.lang.Float r0 = java.lang.Float.valueOf(r16)
            goto L_0x027a
        L_0x02b4:
            X.57r r0 = X.C997057r.PROFILE_PICTURE
            if (r10 != r0) goto L_0x0237
            r16 = r18
            goto L_0x024b
        L_0x02bb:
            java.util.Set r0 = r11.entrySet()
            java.util.ArrayList r3 = X.C86624Kv.A0d(r0)
            X.63r r2 = X.C1222563r.A00
            r1 = 16
            X.91R r0 = new X.91R
            r0.<init>(r2, r1)
            X.C73753g1.A0a(r3, r0)
            java.util.LinkedHashSet r4 = X.AnonymousClass0x9.A17()
            java.util.Iterator r2 = r3.iterator()
        L_0x02d7:
            boolean r0 = r2.hasNext()
            r8 = 15
            if (r0 == 0) goto L_0x02f8
            java.util.Map$Entry r1 = X.AnonymousClass001.A0w(r2)
            int r0 = r5.size()
            if (r0 >= r8) goto L_0x02f8
            java.lang.Object r0 = r1.getKey()
            r5.add(r0)
            java.lang.Object r0 = r1.getKey()
            r4.add(r0)
            goto L_0x02d7
        L_0x02f8:
            java.util.Iterator r3 = r9.iterator()
        L_0x02fc:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x032a
            X.3ZH r2 = X.C18310x6.A0R(r3)
            int r0 = r5.size()
            if (r0 >= r8) goto L_0x032a
            if (r2 == 0) goto L_0x02fc
            com.whatsapp.jid.UserJid r1 = X.AnonymousClass3ZH.A07(r2)
            X.2sq r0 = r7.A00
            boolean r0 = r0.A0P(r1)
            if (r0 != 0) goto L_0x02fc
            boolean r0 = X.C86654Ky.A1Y(r2)
            if (r0 != 0) goto L_0x02fc
            boolean r0 = r4.contains(r2)
            if (r0 != 0) goto L_0x02fc
            r5.add(r2)
            goto L_0x02fc
        L_0x032a:
            X.3Wi r2 = r6.A05
            r0 = 17
            X.5rT r1 = new X.5rT
            r1.<init>(r6, r0, r5)
            goto L_0x0484
        L_0x0335:
            java.lang.Object r0 = r3.A00
            java.util.Set r0 = (java.util.Set) r0
            java.lang.Object r3 = r3.A01
            X.5Qi r3 = (X.C104275Qi) r3
            java.util.Iterator r2 = r0.iterator()
        L_0x0341:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0023
            X.4uZ r1 = X.C18300x5.A0P(r2)
            X.2sA r0 = r3.A04
            r0.A00(r1)
            goto L_0x0341
        L_0x0351:
            java.lang.Object r2 = r3.A00
            com.whatsapp.conversationslist.ConversationsFragment r2 = (com.whatsapp.conversationslist.ConversationsFragment) r2
            java.lang.Object r1 = r3.A01
            X.4uZ r1 = (X.C95814uZ) r1
            X.3Ex r0 = r2.A19
            X.3ZH r1 = r0.A07(r1)
            if (r1 == 0) goto L_0x0023
            boolean r0 = r1.A0S()
            if (r0 != 0) goto L_0x036d
            boolean r0 = r1.A0T()
            if (r0 == 0) goto L_0x0023
        L_0x036d:
            X.2Z2 r1 = r2.A2x
            java.lang.Integer r0 = X.C18290x4.A0a()
            r1.A00 = r0
            return
        L_0x0376:
            java.lang.Object r5 = r3.A00
            X.5g7 r5 = (X.C110365g7) r5
            java.lang.Object r1 = r3.A01
            java.util.List r1 = (java.util.List) r1
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0023
            java.util.Iterator r4 = r1.iterator()
        L_0x0388:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0023
            X.4uZ r3 = X.C18300x5.A0P(r4)
            com.whatsapp.conversationslist.ConversationsFragment r0 = r5.A0N
            X.2sA r2 = r0.A1n
            r1 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r2.A06(r3, r0, r1)
            goto L_0x0388
        L_0x039f:
            java.lang.Object r4 = r3.A00
            X.5g7 r4 = (X.C110365g7) r4
            java.lang.Object r0 = r3.A01
            java.util.AbstractCollection r0 = (java.util.AbstractCollection) r0
            java.util.Iterator r3 = r0.iterator()
        L_0x03ab:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0023
            X.4uZ r2 = X.C18300x5.A0P(r3)
            boolean r0 = r2 instanceof X.C28001fK
            if (r0 != 0) goto L_0x03ab
            com.whatsapp.conversationslist.ConversationsFragment r0 = r4.A0N
            X.2iC r1 = r0.A2O
            X.21R r0 = X.AnonymousClass21R.CHAT_LIST_SCREEN
            r1.A00(r2, r0)
            goto L_0x03ab
        L_0x03c3:
            java.lang.Object r4 = r3.A00
            X.3c6 r4 = (X.C71433c6) r4
            java.lang.Object r2 = r4.A01
            X.2R1 r2 = (X.AnonymousClass2R1) r2
            int r1 = r2.A00
            int r0 = r4.A00
            if (r1 != r0) goto L_0x0023
            java.lang.Object r0 = r4.A02
            X.6aY r0 = (X.C129586aY) r0
            java.lang.Object r1 = r3.A01
            X.0U0 r1 = (X.AnonymousClass0U0) r1
            r2.A01 = r0
            X.0uJ r0 = r2.A03
            r1.A01(r0)
            return
        L_0x03e1:
            java.lang.Object r1 = r3.A00
            X.3XF r1 = (X.AnonymousClass3XF) r1
            java.lang.Object r0 = r3.A01
            X.3ZF r0 = (X.AnonymousClass3ZF) r0
            X.39J r0 = r0.A0E
            boolean r0 = r0.A03
            if (r0 == 0) goto L_0x0023
            X.8qC r0 = r1.A01
            goto L_0x09cd
        L_0x03f3:
            java.lang.Object r7 = r3.A00
            X.3TZ r7 = (X.AnonymousClass3TZ) r7
            java.lang.Object r3 = r3.A01
            X.7Ns r3 = (X.C149747Ns) r3
            boolean r0 = r7.A01
            if (r0 != 0) goto L_0x0023
            X.31C r6 = r7.A06
            java.lang.String r9 = r6.A03()
            r10 = 246(0xf6, float:3.45E-43)
            java.lang.String r0 = "iq"
            X.2rL r5 = new X.2rL
            r5.<init>(r0)
            java.lang.String r0 = "id"
            X.C56052rL.A0D(r5, r0, r9)
            java.lang.String r1 = "type"
            java.lang.String r0 = "get"
            X.C56052rL.A0D(r5, r1, r0)
            X.39V r0 = X.AnonymousClass39V.A00()
            r5.A0G(r0)
            java.lang.String r1 = "smax_id"
            java.lang.String r0 = "4"
            X.C56052rL.A0D(r5, r1, r0)
            java.lang.String r1 = "xmlns"
            java.lang.String r0 = "fb:thrift_iq"
            X.C56052rL.A0D(r5, r1, r0)
            java.lang.String r2 = r3.A01
            java.lang.String r1 = "account_number"
            r4 = 0
            X.36K r0 = new X.36K
            r0.<init>((java.lang.String) r1, (java.lang.String) r2, (X.AnonymousClass39V[]) r4)
            r5.A0H(r0)
            java.lang.String r2 = "code"
            java.lang.String r1 = r3.A00
            X.36K r0 = new X.36K
            r0.<init>((java.lang.String) r2, (java.lang.String) r1, (X.AnonymousClass39V[]) r4)
            r5.A0H(r0)
            java.lang.String r2 = "expected_source_url"
            java.lang.String r1 = r3.A02
            X.36K r0 = new X.36K
            r0.<init>((java.lang.String) r2, (java.lang.String) r1, (X.AnonymousClass39V[]) r4)
            r5.A0H(r0)
            r0 = 1
            X.39V[] r4 = new X.AnonymousClass39V[r0]
            java.lang.String r1 = "support_icebreakers"
            java.lang.String r0 = "true"
            boolean r2 = X.AnonymousClass39V.A0F(r1, r0, r4)
            java.lang.String r1 = "feature"
            X.36K r0 = new X.36K
            r0.<init>(r1, r4)
            r5.A0H(r0)
            X.36K r8 = r5.A0F()
            r11 = 0
            boolean r0 = r6.A0K(r7, r8, r9, r10, r11)
            if (r0 != 0) goto L_0x0023
            boolean r0 = r7.A02
            if (r0 == 0) goto L_0x09d1
            r7.A02 = r2
            X.3Wi r2 = r7.A03
            r0 = 47
            X.5rT r1 = new X.5rT
            r1.<init>(r7, r0, r3)
        L_0x0484:
            r2.A0S(r1)
            return
        L_0x0488:
            java.lang.Object r0 = r3.A00
            X.3TZ r0 = (X.AnonymousClass3TZ) r0
            java.lang.Object r6 = r3.A01
            X.2TX r6 = (X.AnonymousClass2TX) r6
            X.2ah r5 = r0.A05
            X.4UA r4 = r5.A03
            X.3Ls r2 = r4.A01
            boolean r0 = r2 instanceof X.AnonymousClass1Hk
            if (r0 == 0) goto L_0x0023
            X.1Hk r2 = (X.AnonymousClass1Hk) r2
            X.2e0 r1 = r4.A0R
            X.5Wq r0 = r5.A01
            X.2U8 r0 = r1.A01(r0, r6)
            r2.A0K(r0)
            X.08M r3 = r5.A00
            X.7Ns r2 = r5.A02
            r1 = 1
            X.2NW r0 = new X.2NW
            r0.<init>(r6, r2, r1)
            r3.A0G(r0)
            X.3Ls r1 = r4.A01
            X.59D r0 = X.AnonymousClass59D.WEB_PAGE_LOADED
            r4.A0G(r1, r0)
            X.4FS r1 = r4.A0d
            r0 = 21
            X.5sE r0 = X.C117625sE.A00(r5, r0)
            r1.BkM(r0)
            return
        L_0x04c7:
            java.lang.Object r0 = r3.A00
            X.5l7 r0 = (X.C113245l7) r0
            java.lang.Object r1 = r3.A01
            X.4eZ r0 = X.C113245l7.A09(r0)
            X.67A r0 = X.AnonymousClass31N.A01(r0)
            r0.BJZ(r1)
            return
        L_0x04d9:
            java.lang.Object r1 = r3.A00
            X.5l7 r1 = (X.C113245l7) r1
            java.lang.Object r0 = r3.A01
            X.5R9 r0 = (X.AnonymousClass5R9) r0
            X.4eZ r2 = X.C113245l7.A09(r1)
            X.36r r1 = r1.A7C
            com.whatsapp.jid.UserJid r0 = r0.A08
            android.content.Intent r0 = X.C86634Kw.A0D(r2, r1, r0)
            r2.startActivity(r0)
            return
        L_0x04f1:
            java.lang.Object r6 = r3.A00
            X.5l7 r6 = (X.C113245l7) r6
            java.lang.Object r5 = r3.A01
            X.34x r5 = (X.C624134x) r5
            long r3 = r6.A07
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x050c
            X.676 r0 = r6.A2z
            X.5mA r0 = r0.getMessageAudioPlayerProvider()
            r0.A07()
            r6.A07 = r1
        L_0x050c:
            com.whatsapp.conversation.ConversationListView r0 = r6.A2f
            X.2z0 r2 = r5.A1J
            X.4oJ r1 = r0.A00(r2)
            if (r1 == 0) goto L_0x051b
            r0 = 1
            r1.A1r(r5, r0)
            return
        L_0x051b:
            X.4On r0 = X.C113245l7.A0A(r6)
            java.util.HashSet r0 = r0.A0X
            r0.add(r2)
            return
        L_0x0525:
            java.lang.Object r0 = r3.A00
            X.67r r0 = (X.C1232467r) r0
            java.lang.Object r1 = r3.A01
            android.view.View r1 = (android.view.View) r1
            java.lang.Object r0 = r0.A00
            X.6BJ r0 = (X.AnonymousClass6BJ) r0
            java.lang.Object r0 = r0.A00
            X.5l7 r0 = (X.C113245l7) r0
            com.whatsapp.KeyboardPopupLayout r0 = r0.A1a
            r0.removeView(r1)
            return
        L_0x053b:
            java.lang.Object r2 = r3.A01
            X.4ea r2 = (X.C89654ea) r2
            r0 = 2131895851(0x7f12262b, float:1.9426547E38)
            java.lang.String r1 = X.C18290x4.A0l(r2, r0)
            r0 = 0
            android.widget.Toast r0 = android.widget.Toast.makeText(r2, r1, r0)
            r0.show()
            r2.BjL()
            return
        L_0x0552:
            java.lang.Object r4 = r3.A00
            com.whatsapp.conversation.selection.SingleSelectedMessageActivity r4 = (com.whatsapp.conversation.selection.SingleSelectedMessageActivity) r4
            java.lang.Object r0 = r3.A01
            android.view.View r0 = (android.view.View) r0
            X.4pj r2 = r4.A05
            java.lang.String r3 = "reactionsTrayLayout"
            if (r2 != 0) goto L_0x0565
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r3)
            throw r0
        L_0x0565:
            float r1 = r0.getY()
            X.4pj r0 = r4.A05
            if (r0 != 0) goto L_0x0572
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r3)
            throw r0
        L_0x0572:
            int r0 = r0.getMeasuredHeight()
            float r0 = (float) r0
            float r1 = r1 - r0
            r2.setY(r1)
            boolean r0 = r4.A79()
            X.4pj r2 = r4.A05
            if (r0 == 0) goto L_0x05ae
            if (r2 != 0) goto L_0x058a
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r3)
            throw r0
        L_0x058a:
            com.whatsapp.conversation.selection.MessageSelectionDropDownRecyclerView r0 = r4.A75()
            int r1 = r0.getRight()
            X.4pj r0 = r4.A05
            if (r0 != 0) goto L_0x059b
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r3)
            throw r0
        L_0x059b:
            int r0 = r0.getPaddingRight()
            int r1 = r1 + r0
            X.4pj r0 = r4.A05
            if (r0 != 0) goto L_0x05a9
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r3)
            throw r0
        L_0x05a9:
            int r0 = r0.getMeasuredWidth()
            goto L_0x05ca
        L_0x05ae:
            if (r2 != 0) goto L_0x05b5
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r3)
            throw r0
        L_0x05b5:
            com.whatsapp.conversation.selection.MessageSelectionDropDownRecyclerView r0 = r4.A75()
            int r1 = r0.getLeft()
            X.4pj r0 = r4.A05
            if (r0 != 0) goto L_0x05c6
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r3)
            throw r0
        L_0x05c6:
            int r0 = r0.getPaddingLeft()
        L_0x05ca:
            int r1 = r1 - r0
            float r0 = (float) r1
            r2.setX(r0)
            return
        L_0x05d0:
            java.lang.Object r2 = r3.A00
            X.4VQ r2 = (X.AnonymousClass4VQ) r2
            java.lang.Object r1 = r3.A01
            java.util.Map r1 = (java.util.Map) r1
            java.util.Map r0 = r2.A1J
            r0.clear()
            r0.putAll(r1)
            X.4UC r6 = r2.A18
            java.util.Collection r0 = r1.values()
            X.58X r5 = X.AnonymousClass58X.DEFAULT
            X.C18260x0.A0O(r0, r5)
            java.util.ArrayList r4 = X.C73783g4.A0c(r0)
            java.util.Iterator r3 = r0.iterator()
        L_0x05f3:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x060b
            X.34x r2 = X.C18300x5.A0T(r3)
            r0 = 1
            X.C162457s7.A0J(r2, r0)
            r1 = 0
            X.5SF r0 = new X.5SF
            r0.<init>(r5, r2, r1)
            r4.add(r0)
            goto L_0x05f3
        L_0x060b:
            r6.A0G(r4)
            return
        L_0x060f:
            java.lang.Object r8 = r3.A00
            X.4VQ r8 = (X.AnonymousClass4VQ) r8
            java.lang.Object r7 = r3.A01
            X.34x r7 = (X.C624134x) r7
            X.2z0 r0 = r7.A1J
            X.4uZ r6 = r0.A00
            r5 = 0
            r4 = 1
            if (r6 == 0) goto L_0x062a
            X.7am r1 = r8.A0d
            X.34x[] r0 = new X.C624134x[r4]
            java.util.List r0 = X.AnonymousClass0x9.A1A(r7, r0, r5)
            r1.A03(r6, r0, r4)
        L_0x062a:
            X.8qC r0 = r8.A0H
            java.lang.Object r3 = r0.get()
            X.5mB r3 = (X.C113905mB) r3
            X.2sr r0 = r3.A03
            boolean r0 = r0.A0a(r6)
            if (r0 != 0) goto L_0x0646
            X.3dI r2 = r3.A0e
            r1 = 26
            X.3ca r0 = new X.3ca
            r0.<init>((X.C113905mB) r3, (X.C95814uZ) r6, (int) r4, (int) r1)
            r2.execute(r0)
        L_0x0646:
            X.2p9 r1 = r8.A0D
            X.34x[] r0 = new X.C624134x[r4]
            java.util.List r0 = X.AnonymousClass0x9.A1A(r7, r0, r5)
            r1.A03(r0)
            return
        L_0x0652:
            java.lang.Object r1 = r3.A00
            X.4VQ r1 = (X.AnonymousClass4VQ) r1
            java.lang.Object r0 = r3.A01
            X.2Ni r0 = (X.C42242Ni) r0
            r1.A0Q(r0)
            return
        L_0x065e:
            java.lang.Object r0 = r3.A00
            X.4VQ r0 = (X.AnonymousClass4VQ) r0
            java.lang.Object r1 = r3.A01
            X.4UC r0 = r0.A14
            r0.A0H(r1)
            return
        L_0x066a:
            java.lang.Object r1 = r3.A00
            X.33p r1 = (X.AnonymousClass33p) r1
            java.lang.Object r0 = r3.A01
            X.2rt r0 = (X.C56382rt) r0
            long r2 = r0.A01()
            android.content.SharedPreferences$Editor r1 = X.C18270x1.A03(r1)
            java.lang.String r0 = "last_message_row_id_since_archive_open"
            X.C18270x1.A0i(r1, r0, r2)
            return
        L_0x0680:
            java.lang.Object r4 = r3.A00
            X.5Qi r4 = (X.C104275Qi) r4
            java.lang.Object r1 = r3.A01
            X.4uZ r1 = (X.C95814uZ) r1
            r2 = 0
            X.2sA r0 = r4.A04
            r0.A00(r1)
            X.3Wi r1 = r4.A00
            r0 = 2131894620(0x7f12215c, float:1.942405E38)
            r1.A0I(r0, r2)
            return
        L_0x0697:
            java.lang.Object r5 = r3.A00
            X.5Qi r5 = (X.C104275Qi) r5
            java.lang.Object r4 = r3.A01
            X.4uZ r4 = (X.C95814uZ) r4
            r3 = 0
            X.5XH r2 = r5.A02
            X.2sH r0 = r5.A03
            long r0 = r0.A0H()
            r2.A01(r4, r0)
            X.3Wi r1 = r5.A00
            r0 = 2131892584(0x7f121968, float:1.941992E38)
            r1.A0I(r0, r3)
            return
        L_0x06b4:
            java.lang.Object r0 = r3.A00
            com.whatsapp.conversationslist.ConversationsFragment r0 = (com.whatsapp.conversationslist.ConversationsFragment) r0
            java.lang.Object r5 = r3.A01
            X.1fJ r5 = (X.C27991fJ) r5
            X.67D r4 = r0.A14
            X.03q r0 = r0.A0R()
            X.0df r3 = r0.getSupportFragmentManager()
            com.whatsapp.community.CommunitySubgroupsBottomSheet r2 = new com.whatsapp.community.CommunitySubgroupsBottomSheet
            r2.<init>()
            android.os.Bundle r1 = X.AnonymousClass002.A08()
            java.lang.String r0 = "extra_community_jid"
            X.C86604Kt.A18(r1, r2, r5, r0)
            r1 = 12
            X.91H r0 = new X.91H
            r0.<init>(r2, r1)
            r4.BpH(r3, r5, r0)
            return
        L_0x06df:
            java.lang.Object r4 = r3.A00
            com.whatsapp.conversationslist.ConversationsFragment r4 = (com.whatsapp.conversationslist.ConversationsFragment) r4
            java.lang.Object r1 = r3.A01
            X.1fJ r1 = (X.C27991fJ) r1
            X.2so r0 = r4.A13
            X.1fJ r3 = r0.A01(r1)
            if (r3 == 0) goto L_0x06fc
            X.3Wi r2 = r4.A0i
            r1 = 23
            X.5rT r0 = new X.5rT
            r0.<init>(r4, r1, r3)
            r2.BkS(r0)
            return
        L_0x06fc:
            java.lang.String r0 = "conversations/subgroupBottomSheet/parentGroupJid is null"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.2qk r3 = r4.A0e
            java.lang.String r2 = "null_parent_group_jid"
            r1 = 1
            java.lang.String r0 = "wa-com-event/subgroupBottomSheet"
            r3.A0A(r0, r1, r2)
            return
        L_0x070c:
            java.lang.Object r0 = r3.A00
            X.69r r0 = (X.C1237669r) r0
            java.lang.Object r3 = r3.A01
            X.4uZ r3 = (X.C95814uZ) r3
            java.lang.Object r2 = r0.A00
            com.whatsapp.conversationslist.ConversationsFragment r2 = (com.whatsapp.conversationslist.ConversationsFragment) r2
            X.4Oj r0 = r2.A1V
            if (r0 == 0) goto L_0x0732
            X.5U2 r0 = r0.A00
            java.util.List r1 = r0.A01()
            java.lang.String r0 = "UNREAD_FILTER"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x0732
            X.5U2 r0 = r2.A1N()
            r2.AxH(r0)
            return
        L_0x0732:
            r2.A1f(r3)
            return
        L_0x0736:
            java.lang.Object r4 = r3.A00
            X.5g7 r4 = (X.C110365g7) r4
            java.lang.Object r5 = r3.A01
            java.util.List r5 = (java.util.List) r5
            com.whatsapp.conversationslist.ConversationsFragment r2 = r4.A0N
            X.2sA r1 = r2.A1n
            java.lang.Integer r0 = X.C18290x4.A0Z()
            java.util.HashMap r6 = r1.A01(r0, r5)
            int r7 = r5.size()
            X.3Wi r0 = r2.A0i
            r8 = 11
            X.3c6 r3 = new X.3c6
            r3.<init>(r4, r5, r6, r7, r8)
            r0.A0S(r3)
            return
        L_0x075b:
            java.lang.Object r4 = r3.A00
            X.5g7 r4 = (X.C110365g7) r4
            java.lang.Object r0 = r3.A01
            java.util.AbstractCollection r0 = (java.util.AbstractCollection) r0
            int r3 = r0.size()
            java.util.Iterator r2 = r0.iterator()
        L_0x076b:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x077d
            X.4uZ r1 = X.C18300x5.A0P(r2)
            com.whatsapp.conversationslist.ConversationsFragment r0 = r4.A0N
            X.2sA r0 = r0.A1n
            r0.A00(r1)
            goto L_0x076b
        L_0x077d:
            r0 = 1
            r2 = 2131894619(0x7f12215b, float:1.9424048E38)
            if (r3 != r0) goto L_0x0786
            r2 = 2131894620(0x7f12215c, float:1.942405E38)
        L_0x0786:
            com.whatsapp.conversationslist.ConversationsFragment r0 = r4.A0N
            X.3Wi r1 = r0.A0i
            r0 = 0
            r1.A0I(r2, r0)
            return
        L_0x078f:
            java.lang.Object r1 = r3.A01
            X.4ea r1 = (X.C89654ea) r1
            r0 = 9
            com.whatsapp.conversation.conversationrow.E2EEDescriptionBottomSheet r0 = com.whatsapp.conversation.conversationrow.E2EEDescriptionBottomSheet.A00(r0)
            r1.Boo(r0)
            return
        L_0x079d:
            java.lang.Object r1 = r3.A00
            X.5Tj r1 = (X.C105045Tj) r1
            java.lang.Object r0 = r3.A01
            X.0eF r0 = (X.C08310eF) r0
            r1.A02(r0)
            return
        L_0x07a9:
            java.lang.Object r0 = r3.A00
            com.whatsapp.conversationslist.LeaveGroupsDialogFragment r0 = (com.whatsapp.conversationslist.LeaveGroupsDialogFragment) r0
            java.lang.Object r2 = r3.A01
            java.util.List r2 = (java.util.List) r2
            X.2sA r1 = r0.A06
            java.lang.Integer r0 = X.C18280x3.A0S()
            r1.A01(r0, r2)
            return
        L_0x07bb:
            java.lang.Object r0 = r3.A00
            com.whatsapp.conversationslist.ConversationsFragment r0 = (com.whatsapp.conversationslist.ConversationsFragment) r0
            java.lang.Object r1 = r3.A01
            X.4uZ r1 = (X.C95814uZ) r1
            X.1R1 r0 = r0.A2g
            r0.A0N(r1)
            return
        L_0x07c9:
            java.lang.Object r2 = r3.A00
            X.5N0 r2 = (X.AnonymousClass5N0) r2
            java.lang.Object r1 = r3.A01
            android.view.View r1 = (android.view.View) r1
            r0 = 1
            r1.setSelected(r0)
            r0 = 0
            r2.A00 = r0
            return
        L_0x07d9:
            java.lang.Object r1 = r3.A00
            X.2qk r1 = (X.C55682qk) r1
            java.lang.Object r3 = r3.A01
            java.util.Map r3 = (java.util.Map) r3
            r4 = 0
            r5 = 1
            java.lang.String r0 = "log_files_upload"
            java.util.List r0 = java.util.Collections.singletonList(r0)
            java.util.HashSet r2 = X.AnonymousClass0x9.A15(r0)
            r7 = r5
            r6 = r5
            r1.A0B(r2, r3, r4, r5, r6, r7)
            return
        L_0x07f3:
            java.lang.Object r4 = r3.A00
            X.5aS r4 = (X.C106965aS) r4
            java.lang.Object r0 = r3.A01
            android.content.Context r0 = (android.content.Context) r0
            java.io.File r1 = r0.getFilesDir()
            java.lang.String r0 = "app_state"
            java.io.File r0 = X.AnonymousClass002.A0A(r1, r0)
            r4.A04 = r0
            java.io.File r0 = r4.A04
            boolean r0 = r0.exists()
            r3 = 0
            if (r0 == 0) goto L_0x0818
            java.io.File r0 = r4.A04
            boolean r0 = r0.isDirectory()
            if (r0 != 0) goto L_0x0828
        L_0x0818:
            java.io.File r0 = r4.A04
            r0.delete()
            java.io.File r0 = r4.A04
            boolean r0 = r0.mkdir()
            if (r0 != 0) goto L_0x0828
            r4.A06 = r3
            return
        L_0x0828:
            r5 = 0
        L_0x0829:
            java.io.File r0 = r4.A04
            java.lang.String r1 = java.lang.String.valueOf(r5)
            java.io.File r2 = X.AnonymousClass002.A0A(r0, r1)
            boolean r0 = r2.exists()
            if (r0 == 0) goto L_0x0854
            int r5 = r5 + 1
            r0 = 5
            if (r5 < r0) goto L_0x0829
            long r5 = java.lang.System.currentTimeMillis()
            r0 = 5
            long r5 = r5 % r0
            java.lang.String r0 = java.lang.String.valueOf(r5)
            r4.A05 = r0
            java.io.File r1 = r4.A04
            java.lang.String r0 = r4.A05
            java.io.File r2 = X.AnonymousClass002.A0A(r1, r0)
            goto L_0x0856
        L_0x0854:
            r4.A05 = r1
        L_0x0856:
            java.lang.String r0 = "rw"
            java.io.RandomAccessFile r5 = new java.io.RandomAccessFile     // Catch:{ IOException -> 0x08be }
            r5.<init>(r2, r0)     // Catch:{ IOException -> 0x08be }
            r10 = 1024(0x400, double:5.06E-321)
            r5.setLength(r10)     // Catch:{ all -> 0x08b4 }
            java.nio.channels.FileChannel r6 = r5.getChannel()     // Catch:{ all -> 0x08b4 }
            java.nio.channels.FileChannel$MapMode r7 = java.nio.channels.FileChannel.MapMode.READ_WRITE     // Catch:{ all -> 0x08b4 }
            r8 = 0
            java.nio.MappedByteBuffer r0 = r6.map(r7, r8, r10)     // Catch:{ all -> 0x08b4 }
            r4.A01 = r0     // Catch:{ all -> 0x08b4 }
            r0.position(r3)     // Catch:{ all -> 0x08b4 }
            java.nio.MappedByteBuffer r0 = r4.A01     // Catch:{ all -> 0x08b4 }
            byte[] r7 = X.C106965aS.A09     // Catch:{ all -> 0x08b4 }
            r0.put(r7)     // Catch:{ all -> 0x08b4 }
            java.nio.MappedByteBuffer r1 = r4.A01     // Catch:{ all -> 0x08b4 }
            int r6 = X.C106965aS.A07     // Catch:{ all -> 0x08b4 }
            int r0 = r6 + -1
            r1.position(r0)     // Catch:{ all -> 0x08b4 }
            java.nio.MappedByteBuffer r1 = r4.A01     // Catch:{ all -> 0x08b4 }
            r0 = 10
            r1.put(r0)     // Catch:{ all -> 0x08b4 }
            java.nio.MappedByteBuffer r0 = r4.A01     // Catch:{ all -> 0x08b4 }
            r0.put(r7)     // Catch:{ all -> 0x08b4 }
            java.nio.MappedByteBuffer r0 = r4.A01     // Catch:{ all -> 0x08b4 }
            r0.position(r3)     // Catch:{ all -> 0x08b4 }
            java.nio.MappedByteBuffer r1 = r4.A01     // Catch:{ all -> 0x08b4 }
            java.lang.String r0 = X.C106965aS.A08     // Catch:{ all -> 0x08b4 }
            byte[] r0 = r0.getBytes()     // Catch:{ all -> 0x08b4 }
            r1.put(r0)     // Catch:{ all -> 0x08b4 }
            java.nio.MappedByteBuffer r1 = r4.A01     // Catch:{ all -> 0x08b4 }
            int r0 = r6 + 2
            r1.position(r0)     // Catch:{ all -> 0x08b4 }
            X.8Tr r0 = new X.8Tr     // Catch:{ all -> 0x08b4 }
            r0.<init>()     // Catch:{ all -> 0x08b4 }
            r4.A00 = r0     // Catch:{ all -> 0x08b4 }
            r0 = 1
            r4.A06 = r0     // Catch:{ all -> 0x08b4 }
            r5.close()     // Catch:{ IOException -> 0x08be }
            goto L_0x08c0
        L_0x08b4:
            r1 = move-exception
            r5.close()     // Catch:{ all -> 0x08b9 }
            goto L_0x08bd
        L_0x08b9:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x08be }
        L_0x08bd:
            throw r1     // Catch:{ IOException -> 0x08be }
        L_0x08be:
            r4.A06 = r3
        L_0x08c0:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "UiNavigationPersistenceManager/initAsync fileInUse:"
            r1.append(r0)
            java.lang.String r0 = r4.A05
            r1.append(r0)
            java.lang.String r0 = " appStateFile:"
            X.C18260x0.A1P(r1, r0, r2)
            return
        L_0x08d4:
            java.lang.Object r5 = r3.A00
            android.app.Activity r5 = (android.app.Activity) r5
            java.lang.Object r4 = r3.A01
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            java.lang.String r0 = r4.getMessage()
            r3 = 0
            if (r0 == 0) goto L_0x090e
            boolean r0 = X.C86624Kv.A1Z(r4)
            if (r0 == 0) goto L_0x090e
            java.lang.String r0 = "profileinfo/activityres/no-space"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r1 = "no-space"
            r0 = 1
            android.content.Intent r2 = r2.putExtra(r1, r0)
            java.lang.String r1 = "error_message_id"
            r0 = 2131889102(0x7f120bce, float:1.9412858E38)
            android.content.Intent r0 = r2.putExtra(r1, r0)
        L_0x0902:
            r5.setResult(r3, r0)
            java.lang.String r0 = "cropimage"
            com.whatsapp.util.Log.e(r0, r4)
            r5.finish()
            return
        L_0x090e:
            android.content.Intent r0 = com.whatsapp.crop.CropImage.A0C()
            goto L_0x0902
        L_0x0913:
            java.lang.Object r1 = r3.A00
            com.whatsapp.crop.CropImage r1 = (com.whatsapp.crop.CropImage) r1
            java.lang.Object r0 = r3.A01
            X.2Xw r0 = (X.C44892Xw) r0
            com.whatsapp.crop.CropImage.A0L(r1, r0)
            return
        L_0x091f:
            java.lang.Object r1 = r3.A00
            com.whatsapp.crop.CropImageView r1 = (com.whatsapp.crop.CropImageView) r1
            java.lang.Object r0 = r3.A01
            X.5UE r0 = (X.AnonymousClass5UE) r0
            r1.A06(r0)
            return
        L_0x092b:
            java.lang.Object r4 = r3.A00
            X.3TZ r4 = (X.AnonymousClass3TZ) r4
            java.lang.Object r2 = r3.A01
            X.4F2 r1 = r4.A00
            if (r1 == 0) goto L_0x093a
            X.1im r0 = r4.A04
            r0.A07(r1)
        L_0x093a:
            r0 = 0
            X.28s r1 = new X.28s
            r1.<init>(r2, r0, r4)
            r4.A00 = r1
            X.1im r0 = r4.A04
            r0.A08(r1)
            return
        L_0x0948:
            java.lang.Object r0 = r3.A00
            X.2f0 r0 = (X.C48502f0) r0
            java.lang.Object r3 = r3.A01
            X.3dJ r3 = (X.C72183dJ) r3
            X.2Vx r0 = r0.A01
            java.util.HashMap r1 = r0.A00
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>(r1)
            java.util.Iterator r1 = X.C18290x4.A10(r0)
        L_0x095d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x097e
            java.lang.Object r0 = r1.next()
            X.2ZX r0 = (X.AnonymousClass2ZX) r0
            int r2 = r0.A00
            r0 = 500(0x1f4, float:7.0E-43)
            if (r2 < r0) goto L_0x095d
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "getKeyForEncryptedBackupWithFuture/received/received/error "
            X.C18260x0.A0z(r0, r1, r2)
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
        L_0x097a:
            r3.BQt(r0)
            return
        L_0x097e:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            goto L_0x097a
        L_0x0981:
            java.lang.Object r2 = r3.A00
            X.5Ks r2 = (X.C102905Ks) r2
            java.lang.Object r1 = r3.A01
            X.1fL r1 = (X.C28011fL) r1
            X.5rC r0 = r2.A00
            r0.A04()
            X.2sj r0 = r2.A04
            X.33h r0 = r0.A09
            r0.A03(r1)
            java.lang.String r0 = "logMessageSendAction"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)
            throw r0
        L_0x099c:
            java.lang.Object r2 = r3.A00
            X.5Ks r2 = (X.C102905Ks) r2
            java.lang.Object r1 = r3.A01
            X.1fL r1 = (X.C28011fL) r1
            X.5rC r0 = r2.A00
            r0.A04()
            X.2sj r0 = r2.A04
            X.33h r0 = r0.A09
            r0.A03(r1)
            java.lang.String r0 = "logOpenChatAction"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)
            throw r0
        L_0x09b7:
            java.lang.Object r0 = r3.A00
            com.whatsapp.conversation.viewmodel.ConversationTitleViewModel r0 = (com.whatsapp.conversation.viewmodel.ConversationTitleViewModel) r0
            X.5rC r0 = r0.A03
            r0.A04()
            java.lang.String r0 = "logSecondaryActionEvent"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)
            throw r0
        L_0x09c7:
            java.lang.Object r0 = r3.A00
            X.3XF r0 = (X.AnonymousClass3XF) r0
            X.8qC r0 = r0.A01
        L_0x09cd:
            r0.get()
            return
        L_0x09d1:
            r7.BQs(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C117155rT.run():void");
    }
}
