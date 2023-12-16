package X;

/* renamed from: X.3aI  reason: invalid class name and case insensitive filesystem */
public class C70313aI implements Runnable {
    public Object A00;
    public String A01;
    public String A02;
    public final int A03;

    public C70313aI(Object obj, String str, String str2, int i) {
        this.A03 = i;
        this.A00 = obj;
        this.A02 = str;
        this.A01 = str2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: com.whatsapp.registration.RegisterName} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: com.whatsapp.registration.profilecheckpoint.ProfileCheckpointRegisterName} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v12, resolved type: com.whatsapp.registration.RegisterName} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v13, resolved type: com.whatsapp.registration.RegisterName} */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x02bb, code lost:
        r1 = X.AnonymousClass0x9.A1X();
        X.C18280x3.A19((java.lang.Object) null, r5, r1);
        r1[2] = r4;
        X.AnonymousClass001.A0y(r6, (android.widget.TextView) r1.findViewById(com.whatsapp.R.id.restore_info), r1, com.whatsapp.R.string.f11nameremoved);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x02d5, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x032f, code lost:
        r1 = r4.A04;
        r1.A0o.setText(r2);
        r1.A0H.setText(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x033b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x04a2, code lost:
        r3.A00(r4.A0o(), 2, true, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x04ab, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01a5, code lost:
        r5.A0S(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01a8, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r12 = this;
            int r0 = r12.A03
            switch(r0) {
                case 0: goto L_0x0288;
                case 1: goto L_0x0485;
                case 2: goto L_0x033c;
                case 3: goto L_0x0239;
                case 4: goto L_0x0202;
                case 5: goto L_0x01de;
                case 6: goto L_0x01a9;
                case 7: goto L_0x0327;
                case 8: goto L_0x0315;
                case 9: goto L_0x02d6;
                case 10: goto L_0x015f;
                case 11: goto L_0x012c;
                case 12: goto L_0x00f3;
                case 13: goto L_0x02b1;
                case 14: goto L_0x02a6;
                case 15: goto L_0x001a;
                case 16: goto L_0x00d5;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r12.A00
            X.3Sm r0 = (X.C68263Sm) r0
            X.2P5 r0 = r0.A00
            X.8qC r0 = r0.A02
            java.lang.Object r2 = r0.get()
            X.30e r2 = (X.C613130e) r2
            r1 = -1
            java.lang.String r0 = "Delivery failure."
            r2.A03(r0, r1)
        L_0x0019:
            return
        L_0x001a:
            java.lang.Object r4 = r12.A00
            X.2sn r4 = (X.C56932sn) r4
            java.lang.String r3 = r12.A01
            java.lang.String r2 = r12.A02
            X.2ht r9 = r4.A0W     // Catch:{ Exception -> 0x00c5 }
            X.336 r0 = r9.A02     // Catch:{ Exception -> 0x00c5 }
            X.2iT r7 = r0.A02(r3, r2)     // Catch:{ Exception -> 0x00c5 }
            byte[] r1 = r0.A04(r7)     // Catch:{ Exception -> 0x00c5 }
            X.2jF r0 = r9.A06     // Catch:{ Exception -> 0x00c5 }
            r0.A00(r7, r1)     // Catch:{ Exception -> 0x00c5 }
            boolean r0 = r7.A0P     // Catch:{ Exception -> 0x00c5 }
            if (r0 != 0) goto L_0x00a3
            X.2zE r1 = r9.A04     // Catch:{ Exception -> 0x00c5 }
            java.util.List r0 = r7.A05     // Catch:{ Exception -> 0x00c5 }
            r1.A02(r3, r2, r0)     // Catch:{ Exception -> 0x00c5 }
            java.util.List r0 = r7.A05     // Catch:{ Exception -> 0x00c5 }
            java.util.Iterator r11 = r0.iterator()     // Catch:{ Exception -> 0x00c5 }
        L_0x0044:
            boolean r0 = r11.hasNext()     // Catch:{ Exception -> 0x00c5 }
            if (r0 == 0) goto L_0x00a3
            X.39M r1 = X.AnonymousClass0x7.A0b(r11)     // Catch:{ Exception -> 0x00c5 }
            java.lang.String r8 = r1.A0D     // Catch:{ Exception -> 0x00c5 }
            if (r8 == 0) goto L_0x0044
            X.330 r0 = r1.A04     // Catch:{ Exception -> 0x00c5 }
            if (r0 == 0) goto L_0x0044
            X.5Zv[] r0 = r0.A0B     // Catch:{ Exception -> 0x00c5 }
            if (r0 == 0) goto L_0x0044
            X.2ID r6 = r9.A05     // Catch:{ Exception -> 0x00c5 }
            java.lang.String r5 = X.C387228w.A00(r0)     // Catch:{ Exception -> 0x00c5 }
            java.lang.String r1 = r1.A0A     // Catch:{ Exception -> 0x00c5 }
            android.content.ContentValues r10 = X.AnonymousClass0x9.A06()     // Catch:{ Exception -> 0x00c5 }
            java.lang.String r0 = "plaintext_hash"
            r10.put(r0, r8)     // Catch:{ Exception -> 0x00c5 }
            java.lang.String r0 = "authority"
            r10.put(r0, r3)     // Catch:{ Exception -> 0x00c5 }
            java.lang.String r0 = "sticker_pack_id"
            r10.put(r0, r2)     // Catch:{ Exception -> 0x00c5 }
            java.lang.String r0 = "emojis"
            r10.put(r0, r5)     // Catch:{ Exception -> 0x00c5 }
            java.lang.String r0 = "hash_of_image_part"
            r10.put(r0, r1)     // Catch:{ Exception -> 0x00c5 }
            X.8qC r0 = r6.A00     // Catch:{ Exception -> 0x00c5 }
            X.4Fq r8 = X.C18630y0.A08(r0)     // Catch:{ Exception -> 0x00c5 }
            r0 = r8
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0099 }
            X.2sg r6 = r0.A03     // Catch:{ all -> 0x0099 }
            java.lang.String r5 = "third_party_sticker_emoji_mapping"
            r1 = 5
            java.lang.String r0 = "addMapping/INSERT_MAPPING"
            r6.A0C(r5, r0, r10, r1)     // Catch:{ all -> 0x0099 }
            r8.close()     // Catch:{ Exception -> 0x00c5 }
            goto L_0x0044
        L_0x0099:
            r1 = move-exception
            r8.close()     // Catch:{ all -> 0x009e }
            goto L_0x00a2
        L_0x009e:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ Exception -> 0x00c5 }
        L_0x00a2:
            throw r1     // Catch:{ Exception -> 0x00c5 }
        L_0x00a3:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x00c5 }
            java.lang.String r0 = "ThirdPartyStickerManager/addPack, added authority: "
            r1.append(r0)     // Catch:{ Exception -> 0x00c5 }
            int r0 = r3.hashCode()     // Catch:{ Exception -> 0x00c5 }
            r1.append(r0)     // Catch:{ Exception -> 0x00c5 }
            java.lang.String r0 = ", identifier: "
            X.C18260x0.A0q(r0, r2, r1)     // Catch:{ Exception -> 0x00c5 }
            X.2yb r0 = r9.A07     // Catch:{ Exception -> 0x00c5 }
            r0.A02(r7, r3, r2)     // Catch:{ Exception -> 0x00c5 }
            X.2jG r1 = r4.A0Y     // Catch:{ Exception -> 0x00c5 }
            java.lang.String r0 = r7.A0G     // Catch:{ Exception -> 0x00c5 }
            r1.A02(r0)     // Catch:{ Exception -> 0x00c5 }
            goto L_0x00ca
        L_0x00c5:
            java.lang.String r0 = "StickerRepository/InstallThirdPartyStickerPackAsyncTask failed to install third party pack"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x00ca:
            X.3Wi r5 = r4.A04
            r0 = 16
            X.3aI r1 = new X.3aI
            r1.<init>(r4, r2, r3, r0)
            goto L_0x01a5
        L_0x00d5:
            java.lang.Object r0 = r12.A00
            X.2sn r0 = (X.C56932sn) r0
            java.lang.String r3 = r12.A01
            java.lang.String r2 = r12.A02
            X.1ih r0 = r0.A0J
            java.util.Iterator r1 = X.C61102zi.A03(r0)
        L_0x00e3:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0019
            java.lang.Object r0 = r1.next()
            X.2sh r0 = (X.C56872sh) r0
            r0.A0E(r3, r2)
            goto L_0x00e3
        L_0x00f3:
            java.lang.Object r3 = r12.A00
            com.whatsapp.notification.OtpZeroTapMarkAsReadNotificationHandlerReceiver r3 = (com.whatsapp.notification.OtpZeroTapMarkAsReadNotificationHandlerReceiver) r3
            java.lang.String r0 = r12.A01
            java.lang.String r1 = r12.A02
            X.4uZ r0 = X.C18310x6.A0S(r0)
            X.2z0 r1 = X.AnonymousClass2z0.A03(r0, r1)
            X.2qz r0 = r3.A02
            if (r0 == 0) goto L_0x049b
            X.34x r4 = r0.A05(r1)
            if (r4 == 0) goto L_0x0019
            boolean r0 = r4 instanceof X.AnonymousClass1p5
            if (r0 == 0) goto L_0x0121
            X.30o r0 = r3.A01
            if (r0 == 0) goto L_0x0493
            com.whatsapp.jid.UserJid r2 = r4.A0o()
            if (r2 == 0) goto L_0x0121
            X.2sD r1 = r0.A08
            r0 = 1
            r1.A07(r2, r0)
        L_0x0121:
            X.2oD r3 = r3.A00
            if (r3 != 0) goto L_0x04a2
            java.lang.String r0 = "conversationSeenManager"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x012c:
            java.lang.Object r3 = r12.A00
            com.whatsapp.notification.OtpOneTapNotificationHandlerActivity r3 = (com.whatsapp.notification.OtpOneTapNotificationHandlerActivity) r3
            java.lang.String r0 = r12.A01
            java.lang.String r1 = r12.A02
            X.4uZ r0 = X.C18310x6.A0S(r0)
            X.2z0 r1 = X.AnonymousClass2z0.A03(r0, r1)
            X.2qz r0 = r3.A03
            if (r0 == 0) goto L_0x04b3
            X.34x r4 = r0.A05(r1)
            if (r4 == 0) goto L_0x0019
            X.3Wi r2 = r3.A00
            if (r2 == 0) goto L_0x04ac
            r1 = 31
            X.3Zz r0 = new X.3Zz
            r0.<init>(r3, r1, r4)
            r2.A0S(r0)
            X.2oD r3 = r3.A01
            if (r3 != 0) goto L_0x04a2
            java.lang.String r0 = "conversationSeenManager"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x015f:
            java.lang.Object r5 = r12.A00
            X.2bj r5 = (X.C46502bj) r5
            java.lang.String r6 = r12.A01
            java.lang.String r4 = r12.A02
            X.5Hg r0 = r5.A01
            java.lang.String r1 = X.C627236i.A04(r6)
            if (r1 == 0) goto L_0x04ba
            X.66R r0 = r0.A01
            java.lang.Object r0 = r0.getValue()
            X.30R r0 = (X.AnonymousClass30R) r0
            android.graphics.Bitmap r3 = r0.A00(r1)
            if (r3 == 0) goto L_0x04ba
            java.util.Map r0 = r5.A04
            java.lang.Object r0 = r0.get(r4)
            java.lang.ref.Reference r0 = (java.lang.ref.Reference) r0
            if (r0 == 0) goto L_0x0019
            java.lang.Object r2 = r0.get()
            android.view.View r2 = (android.view.View) r2
            if (r2 == 0) goto L_0x0019
            r0 = -1641051461(0xffffffff9e2f8abb, float:-9.293112E-21)
            java.lang.Object r0 = r2.getTag(r0)
            boolean r0 = X.C162457s7.A0P(r0, r4)
            if (r0 == 0) goto L_0x0019
            X.3Wi r5 = r5.A00
            r0 = 37
            X.3Zy r1 = new X.3Zy
            r1.<init>(r2, r0, r3)
        L_0x01a5:
            r5.A0S(r1)
            return
        L_0x01a9:
            java.lang.Object r5 = r12.A00
            X.5Ud r5 = (X.C105245Ud) r5
            java.lang.String r1 = r12.A01
            java.lang.String r4 = r12.A02
            android.app.Activity r0 = r5.A02
            boolean r0 = r0.isFinishing()
            if (r0 != 0) goto L_0x0019
            android.widget.EditText r3 = r5.A03
            android.text.Editable r0 = r3.getText()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0019
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r2 = r1.toUpperCase(r0)
            if (r4 == 0) goto L_0x01da
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r2)
            java.lang.String r0 = " +"
            java.lang.String r0 = X.AnonymousClass000.A0V(r0, r4, r1)
            r3.setText(r0)
        L_0x01da:
            r5.A05(r2)
            return
        L_0x01de:
            java.lang.Object r0 = r12.A00
            X.4Id r0 = (X.C85924Id) r0
            java.lang.String r4 = r12.A01
            java.lang.String r3 = r12.A02
            java.lang.Object r2 = r0.A00
            com.whatsapp.companiondevice.LinkedDevicesSharedViewModel r2 = (com.whatsapp.companiondevice.LinkedDevicesSharedViewModel) r2
            boolean r0 = r2.A03
            if (r0 == 0) goto L_0x0019
            r0 = 0
            r2.A03 = r0
            X.08M r1 = r2.A05
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r1.A0H(r0)
            X.4UC r1 = r2.A0P
            X.0PJ r0 = X.AnonymousClass0x9.A0G(r4, r3)
            r1.A0H(r0)
            return
        L_0x0202:
            java.lang.Object r0 = r12.A00
            X.2ut r0 = (X.C58212ut) r0
            java.lang.String r6 = r12.A01
            java.lang.String r5 = r12.A02
            com.whatsapp.companiondevice.LinkedDevicesEnterCodeActivity r4 = r0.A00
            boolean r0 = r4.BHW()
            if (r0 != 0) goto L_0x0019
            X.C626936e.A01()
            X.C626936e.A01()
            java.lang.Runnable r1 = r4.A0H
            if (r1 == 0) goto L_0x0221
            android.view.View r0 = r4.A00
            r0.removeCallbacks(r1)
        L_0x0221:
            android.view.View r3 = r4.A00
            X.C626936e.A01()
            java.lang.Runnable r2 = r4.A0H
            if (r2 != 0) goto L_0x0232
            r0 = 3
            X.3aI r2 = new X.3aI
            r2.<init>(r4, r5, r6, r0)
            r4.A0H = r2
        L_0x0232:
            r0 = 120000(0x1d4c0, double:5.9288E-319)
            r3.postDelayed(r2, r0)
            return
        L_0x0239:
            java.lang.Object r4 = r12.A00
            com.whatsapp.companiondevice.LinkedDevicesEnterCodeActivity r4 = (com.whatsapp.companiondevice.LinkedDevicesEnterCodeActivity) r4
            java.lang.String r5 = r12.A01
            java.lang.String r3 = r12.A02
            java.lang.String r0 = "LinkedDevicesEnterCodeActivity/timeout"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.4E3 r6 = r4.A09
            r2 = 2
            r0 = -3
            r6.BK7(r2, r0, r2)
            X.2Xi r0 = r4.A07
            X.C626936e.A01()
            X.2a5 r0 = r0.A01
            if (r0 == 0) goto L_0x025e
            X.2qg r0 = r0.A00()
            r0.A01()
        L_0x025e:
            X.4FS r1 = r4.A04
            r0 = 40
            X.3bu r0 = X.C71313bu.A00(r4, r0)
            r1.BkM(r0)
            X.31C r0 = r4.A0D
            X.3TD r1 = new X.3TD
            r1.<init>(r0)
            r0 = 0
            r1.A00(r5, r0)
            r2 = 0
            X.2Xh r1 = r4.A04
            r0 = 7
            r1.A00(r0, r5, r3)
            boolean r0 = r4.BHW()
            if (r0 != 0) goto L_0x0019
            r4.A74()
            r4.A75(r2)
            return
        L_0x0288:
            java.lang.Object r0 = r12.A00
            X.85C r0 = (X.AnonymousClass85C) r0
            java.util.concurrent.CopyOnWriteArraySet r0 = r0.A01
            java.util.Iterator r3 = r0.iterator()
        L_0x0292:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0019
            java.lang.Object r2 = r3.next()
            X.8vW r2 = (X.C186538vW) r2
            java.lang.String r1 = r12.A02
            java.lang.String r0 = r12.A01
            r2.BfL(r1, r0)
            goto L_0x0292
        L_0x02a6:
            java.lang.Object r6 = r12.A00
            com.whatsapp.registration.profilecheckpoint.ProfileCheckpointRegisterName r6 = (com.whatsapp.registration.profilecheckpoint.ProfileCheckpointRegisterName) r6
            java.lang.String r5 = r12.A01
            java.lang.String r4 = r12.A02
            X.4bO r1 = r6.A0u
            goto L_0x02bb
        L_0x02b1:
            java.lang.Object r6 = r12.A00
            com.whatsapp.registration.RegisterName r6 = (com.whatsapp.registration.RegisterName) r6
            java.lang.String r5 = r12.A01
            java.lang.String r4 = r12.A02
            X.4bO r1 = r6.A1I
        L_0x02bb:
            r0 = 2131433119(0x7f0b169f, float:1.8488015E38)
            android.view.View r3 = r1.findViewById(r0)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r2 = 2131890540(0x7f12116c, float:1.9415775E38)
            java.lang.Object[] r1 = X.AnonymousClass0x9.A1X()
            r0 = 0
            X.C18280x3.A19(r0, r5, r1)
            r0 = 2
            r1[r0] = r4
            X.AnonymousClass001.A0y(r6, r3, r1, r2)
            return
        L_0x02d6:
            java.lang.Object r1 = r12.A00
            com.whatsapp.location.StopLiveLocationDialogFragment r1 = (com.whatsapp.location.StopLiveLocationDialogFragment) r1
            java.lang.String r4 = r12.A01
            java.lang.String r0 = r12.A02
            X.33o r3 = r1.A00
            X.4uZ r2 = X.C18310x6.A0S(r0)
            java.lang.StringBuilder r1 = X.C18290x4.A0u(r2)
            java.lang.String r0 = "LocationSharingManager/cancelShareLocation; msgId="
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = "; jid="
            X.C18260x0.A1R(r1, r0, r2)
            java.lang.Object r1 = r3.A0R
            monitor-enter(r1)
            java.util.Map r0 = r3.A0C()     // Catch:{ all -> 0x0312 }
            java.lang.Object r0 = r0.get(r2)     // Catch:{ all -> 0x0312 }
            X.2QE r0 = (X.AnonymousClass2QE) r0     // Catch:{ all -> 0x0312 }
            if (r0 != 0) goto L_0x030d
            X.2z0 r0 = X.AnonymousClass2z0.A04(r2, r4)     // Catch:{ all -> 0x0312 }
            X.C621233o.A01(r3, r0)     // Catch:{ all -> 0x0312 }
            monitor-exit(r1)     // Catch:{ all -> 0x0312 }
            return
        L_0x030d:
            monitor-exit(r1)     // Catch:{ all -> 0x0312 }
            r3.A0Q(r2)
            return
        L_0x0312:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0312 }
            throw r0
        L_0x0315:
            java.lang.Object r4 = r12.A00
            X.1IL r4 = (X.AnonymousClass1IL) r4
            java.lang.String r3 = r12.A01
            java.lang.String r2 = r12.A02
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "conversations-gdrive-observer/set-message "
            X.C18260x0.A0s(r0, r3, r1)
            goto L_0x032f
        L_0x0327:
            java.lang.Object r4 = r12.A00
            X.1IL r4 = (X.AnonymousClass1IL) r4
            java.lang.String r3 = r12.A01
            java.lang.String r2 = r12.A02
        L_0x032f:
            com.whatsapp.conversationslist.ConversationsFragment r1 = r4.A04
            com.whatsapp.WaTextView r0 = r1.A0o
            r0.setText(r2)
            android.widget.TextView r0 = r1.A0H
            r0.setText(r3)
            return
        L_0x033c:
            java.lang.Object r4 = r12.A00
            com.whatsapp.anr.SigquitBasedANRDetector r4 = (com.whatsapp.anr.SigquitBasedANRDetector) r4
            java.lang.String r3 = r12.A01
            java.lang.String r2 = r12.A02
            java.lang.String r0 = "SigquitBasedANRDetector/processing ANR start"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r0 = "SigquitBasedANRDetector/persisting ANR report start"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            if (r2 == 0) goto L_0x035e
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "  | detected using Sigquit based detector\n"
            java.lang.String r0 = X.AnonymousClass000.A0V(r0, r2, r1)
            java.lang.String r3 = r3.replace(r2, r0)
        L_0x035e:
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            java.lang.Thread r0 = r0.getThread()
            java.lang.StackTraceElement[] r2 = r0.getStackTrace()
            java.lang.String r0 = "ANR detected"
            java.lang.Exception r1 = new java.lang.Exception
            r1.<init>(r0)
            r1.setStackTrace(r2)
            java.lang.String r0 = "SigquitBasedANRDetector/Generating ANR Report"
            com.whatsapp.util.Log.e(r0, r1)
            X.329 r0 = r4.A04     // Catch:{ IOException -> 0x046c }
            X.2oU r0 = r0.A00     // Catch:{ IOException -> 0x046c }
            android.content.Context r8 = r0.A00     // Catch:{ IOException -> 0x046c }
            java.io.File r1 = r8.getCacheDir()     // Catch:{ IOException -> 0x046c }
            java.lang.String r0 = "traces"
            java.io.File r6 = X.AnonymousClass002.A0A(r1, r0)     // Catch:{ IOException -> 0x046c }
            X.C18280x3.A10(r6)     // Catch:{ IOException -> 0x046c }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ IOException -> 0x046c }
            java.lang.String r0 = "2.23.26.14"
            r1.append(r0)     // Catch:{ IOException -> 0x046c }
            java.lang.String r7 = "_"
            r1.append(r7)     // Catch:{ IOException -> 0x046c }
            java.lang.String r0 = X.C106965aS.A08     // Catch:{ IOException -> 0x046c }
            java.lang.String r5 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ IOException -> 0x046c }
            boolean r0 = X.AnonymousClass322.A01(r8)     // Catch:{ IOException -> 0x046c }
            if (r0 == 0) goto L_0x03cc
            boolean r0 = X.AnonymousClass322.A01(r8)     // Catch:{ IOException -> 0x046c }
            if (r0 == 0) goto L_0x03cc
            java.lang.String r2 = X.AnonymousClass322.A00     // Catch:{ IOException -> 0x046c }
            java.lang.StringBuilder r1 = X.C18320x8.A0k(r8)     // Catch:{ IOException -> 0x046c }
            java.lang.String r0 = ":"
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ IOException -> 0x046c }
            java.lang.String r0 = X.C18320x8.A0f(r0, r2)     // Catch:{ IOException -> 0x046c }
            java.lang.String r1 = "account_switching"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x046c }
            if (r0 != 0) goto L_0x03c8
            java.lang.String r1 = "unknown_process_name"
        L_0x03c8:
            java.lang.String r5 = X.C18260x0.A06(r5, r7, r1)     // Catch:{ IOException -> 0x046c }
        L_0x03cc:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r5)     // Catch:{ IOException -> 0x046c }
            java.lang.String r0 = ".stacktrace"
            java.io.File r5 = X.C18270x1.A0A(r6, r0, r1)     // Catch:{ IOException -> 0x046c }
            java.io.FileOutputStream r2 = X.AnonymousClass0x9.A0h(r5)     // Catch:{ IOException -> 0x046c }
            java.io.PrintWriter r0 = new java.io.PrintWriter     // Catch:{ all -> 0x0462 }
            r0.<init>(r2)     // Catch:{ all -> 0x0462 }
            r0.write(r3)     // Catch:{ all -> 0x0462 }
            r0.flush()     // Catch:{ all -> 0x0462 }
            r2.close()     // Catch:{ IOException -> 0x046c }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ IOException -> 0x046c }
            java.lang.String r0 = "anr-helper/stored anr report: "
            java.lang.String r0 = X.AnonymousClass0x7.A0p(r5, r0, r1)     // Catch:{ IOException -> 0x046c }
            X.C18260x0.A1L(r1, r0)     // Catch:{ IOException -> 0x046c }
            java.lang.Object r2 = r4.A07
            monitor-enter(r2)
            X.2aY r6 = r4.A05     // Catch:{ all -> 0x045f }
            monitor-enter(r6)     // Catch:{ all -> 0x045f }
            int r0 = r6.A00     // Catch:{ all -> 0x045c }
            monitor-exit(r6)     // Catch:{ all -> 0x045f }
            if (r0 == 0) goto L_0x041a
            monitor-enter(r6)     // Catch:{ all -> 0x045f }
            int r0 = r6.A00     // Catch:{ all -> 0x0417 }
            if (r0 == 0) goto L_0x0415
            X.1uJ r3 = r6.A02     // Catch:{ all -> 0x0417 }
            java.lang.Object r1 = r3.A04     // Catch:{ all -> 0x0417 }
            monitor-enter(r1)     // Catch:{ all -> 0x0417 }
            r0 = 1
            r3.A01 = r0     // Catch:{ all -> 0x0412 }
            r1.notifyAll()     // Catch:{ all -> 0x0412 }
            monitor-exit(r1)     // Catch:{ all -> 0x0412 }
            goto L_0x0415
        L_0x0412:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0412 }
            throw r0     // Catch:{ all -> 0x0417 }
        L_0x0415:
            monitor-exit(r6)     // Catch:{ all -> 0x0417 }
            goto L_0x041a
        L_0x0417:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0417 }
            goto L_0x045e
        L_0x041a:
            java.lang.String r0 = "SigquitBasedANRDetector/About to start process anr error monitor"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x045f }
            X.2JL r7 = new X.2JL     // Catch:{ all -> 0x045f }
            r7.<init>(r4, r5)     // Catch:{ all -> 0x045f }
            java.lang.String r0 = "ProcessANRErrorMonitor/startMonitoring"
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ all -> 0x045f }
            monitor-enter(r6)     // Catch:{ all -> 0x045f }
            X.1uJ r3 = r6.A02     // Catch:{ all -> 0x0459 }
            if (r3 == 0) goto L_0x0440
            int r0 = r6.A00     // Catch:{ all -> 0x0459 }
            if (r0 == 0) goto L_0x0440
            java.lang.Object r1 = r3.A04     // Catch:{ all -> 0x0459 }
            monitor-enter(r1)     // Catch:{ all -> 0x0459 }
            r0 = 1
            r3.A01 = r0     // Catch:{ all -> 0x043d }
            r1.notifyAll()     // Catch:{ all -> 0x043d }
            monitor-exit(r1)     // Catch:{ all -> 0x043d }
            goto L_0x0440
        L_0x043d:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x043d }
            throw r0     // Catch:{ all -> 0x0459 }
        L_0x0440:
            long r9 = r6.A01     // Catch:{ all -> 0x0459 }
            r0 = 1
            long r9 = r9 + r0
            r6.A01 = r9     // Catch:{ all -> 0x0459 }
            X.33i r8 = r6.A03     // Catch:{ all -> 0x0459 }
            X.1uJ r5 = new X.1uJ     // Catch:{ all -> 0x0459 }
            r5.<init>(r6, r7, r8, r9)     // Catch:{ all -> 0x0459 }
            r6.A02 = r5     // Catch:{ all -> 0x0459 }
            r0 = 1
            r6.A00 = r0     // Catch:{ all -> 0x0459 }
            r5.start()     // Catch:{ all -> 0x0459 }
            monitor-exit(r6)     // Catch:{ all -> 0x0459 }
            monitor-exit(r2)     // Catch:{ all -> 0x045f }
            goto L_0x047f
        L_0x0459:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0459 }
            goto L_0x045e
        L_0x045c:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x045f }
        L_0x045e:
            throw r0     // Catch:{ all -> 0x045f }
        L_0x045f:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x045f }
            throw r0
        L_0x0462:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x0467 }
            goto L_0x046b
        L_0x0467:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x046c }
        L_0x046b:
            throw r1     // Catch:{ IOException -> 0x046c }
        L_0x046c:
            r1 = move-exception
            java.lang.String r0 = "SigquitBasedANRDetector/Error saving ANR report"
            com.whatsapp.util.Log.e(r0, r1)
            java.lang.String r0 = "SigquitBasedANRDetector/couldn't write ANR to file, aborting"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            java.lang.String r0 = "SigquitBasedANRDetector/abortANR"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 0
            r4.A09 = r0
        L_0x047f:
            java.lang.String r0 = "SigquitBasedANRDetector/processing ANR finish"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x0485:
            java.lang.Object r0 = r12.A00
            X.1gO r0 = (X.AnonymousClass1gO) r0
            java.lang.String r2 = r12.A01
            java.lang.String r1 = r12.A02
            X.2o5 r0 = r0.A03
            r0.A02(r2, r1)
            return
        L_0x0493:
            java.lang.String r0 = "otpMessageService"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x049b:
            java.lang.String r0 = "fMessageDatabase"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x04a2:
            com.whatsapp.jid.UserJid r2 = r4.A0o()
            r1 = 2
            r0 = 1
            r3.A00(r2, r1, r0, r0)
            return
        L_0x04ac:
            java.lang.String r0 = "globalUI"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x04b3:
            java.lang.String r0 = "fMessageDatabase"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x04ba:
            X.5Jv r3 = r5.A02
            X.3RH r2 = new X.3RH
            r2.<init>(r5, r4)
            X.4FS r1 = r3.A03
            r0 = 0
            X.C71403c3.A00(r1, r3, r2, r6, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70313aI.run():void");
    }
}
