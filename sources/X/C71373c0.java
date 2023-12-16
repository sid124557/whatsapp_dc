package X;

/* renamed from: X.3c0  reason: invalid class name and case insensitive filesystem */
public class C71373c0 implements Runnable {
    public Object A00;
    public String A01;
    public final int A02;

    public C71373c0(int i, String str, Object obj) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = str;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: com.whatsapp.registration.RegisterName} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: com.whatsapp.registration.profilecheckpoint.ProfileCheckpointRegisterName} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v9, resolved type: com.whatsapp.registration.RegisterName} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v10, resolved type: com.whatsapp.registration.RegisterName} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r8 = this;
            int r0 = r8.A02
            switch(r0) {
                case 0: goto L_0x029f;
                case 1: goto L_0x0287;
                case 2: goto L_0x026e;
                case 3: goto L_0x0262;
                case 4: goto L_0x01d4;
                case 5: goto L_0x01ab;
                case 6: goto L_0x01a1;
                case 7: goto L_0x0190;
                case 8: goto L_0x016d;
                case 9: goto L_0x0161;
                case 10: goto L_0x0154;
                case 11: goto L_0x012a;
                case 12: goto L_0x00f1;
                case 13: goto L_0x00af;
                case 14: goto L_0x008a;
                case 15: goto L_0x0070;
                case 16: goto L_0x004a;
                case 17: goto L_0x01f5;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r8.A00
            X.2Yz r0 = (X.C45182Yz) r0
            java.lang.String r1 = r8.A01
            X.2H3 r0 = r0.A00
            X.C626936e.A00()
            X.1RC r0 = r0.A00
            X.4Fq r6 = r0.A0C()
            X.3Yo r5 = r6.Axl()     // Catch:{ all -> 0x0040 }
            r0 = r6
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0036 }
            X.2sg r4 = r0.A03     // Catch:{ all -> 0x0036 }
            java.lang.String r3 = "draft_voice_note_metadata"
            java.lang.String r2 = "chat_jid=?"
            java.lang.String[] r1 = X.C18270x1.A1b(r1)     // Catch:{ all -> 0x0036 }
            java.lang.String r0 = "DraftVoiceNoteMetadataDataStore/delete"
            r4.A07(r3, r2, r0, r1)     // Catch:{ all -> 0x0036 }
            r5.A00()     // Catch:{ all -> 0x0036 }
            r5.close()     // Catch:{ all -> 0x0040 }
            r6.close()
            return
        L_0x0036:
            r1 = move-exception
            r5.close()     // Catch:{ all -> 0x003b }
            goto L_0x003f
        L_0x003b:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0040 }
        L_0x003f:
            throw r1     // Catch:{ all -> 0x0040 }
        L_0x0040:
            r1 = move-exception
            r6.close()     // Catch:{ all -> 0x0045 }
            throw r1
        L_0x0045:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x004a:
            java.lang.Object r0 = r8.A00
            X.1VQ r0 = (X.AnonymousClass1VQ) r0
            java.lang.String r4 = r8.A01
            X.2pb r1 = r0.A04
            r6 = 0
            r2 = -1
            r5 = 1
            r1.A02(r2, r4, r5, r6)
            X.3Cq r2 = r0.A01
            X.227 r0 = X.AnonymousClass227.A03
            X.2zU r1 = new X.2zU
            r1.<init>(r0)
            X.2xW r0 = X.C59812xW.A0P
            r1.A00 = r0
            r1.A02 = r5
            X.2zz r0 = r1.A02()
            r2.A03(r0, r5)
            return
        L_0x0070:
            java.lang.String r3 = r8.A01
            java.lang.Object r2 = r8.A00
            com.whatsapp.textstatus.AddTextStatusActivity r2 = (com.whatsapp.textstatus.AddTextStatusActivity) r2
            android.content.res.Resources r1 = r2.getResources()
            X.C162457s7.A0D(r1)
            X.5Y0 r0 = r2.A0C
            X.C162457s7.A0D(r0)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass31U.A00(r1, r0, r3)
            r2.A05.A0S(new X.C71573cK(r2, 39, r0))
            return
        L_0x008a:
            java.lang.String r5 = r8.A01
            java.lang.Object r4 = r8.A00
            com.whatsapp.textstatus.AddTextStatusActivity r4 = (com.whatsapp.textstatus.AddTextStatusActivity) r4
            android.content.res.Resources r1 = r4.getResources()
            X.C162457s7.A0D(r1)
            X.5Y0 r0 = r4.A0C
            X.C162457s7.A0C(r0)
            android.graphics.drawable.Drawable r3 = X.AnonymousClass31U.A00(r1, r0, r5)
            X.3Wi r2 = r4.A05
            r1 = 39
            X.3cK r0 = new X.3cK
            r0.<init>(r4, r1, r3)
            r2.A0S(r0)
            r4.A0D = r5
            return
        L_0x00af:
            java.lang.Object r4 = r8.A00
            com.whatsapp.support.faq.FaqItemActivity r4 = (com.whatsapp.support.faq.FaqItemActivity) r4
            java.lang.String r5 = r8.A01
            boolean r0 = X.AnonymousClass2BI.A00(r5)
            if (r0 == 0) goto L_0x00dc
            android.content.Intent r1 = r4.getIntent()
            java.lang.String r0 = "payments_support_topics"
            java.util.ArrayList r3 = r1.getParcelableArrayListExtra(r0)
            if (r3 == 0) goto L_0x00dc
            android.content.Intent r1 = r4.getIntent()
            java.lang.String r0 = "describe_problem_fields"
            android.os.Bundle r2 = r1.getBundleExtra(r0)
            r1 = 1
            r0 = 3
            android.content.Intent r0 = X.C627736r.A0K(r4, r2, r3, r1, r0)
            r4.startActivity(r0)
            return
        L_0x00dc:
            X.2hd r2 = r4.A03
            if (r5 != 0) goto L_0x00e2
            java.lang.String r5 = "FaqItemActivity"
        L_0x00e2:
            android.content.Intent r1 = r4.getIntent()
            java.lang.String r0 = "describe_problem_fields"
            android.os.Bundle r1 = r1.getBundleExtra(r0)
            r0 = 1
            r2.A00(r1, r4, r5, r0)
            return
        L_0x00f1:
            java.lang.Object r0 = r8.A00
            X.5PU r0 = (X.AnonymousClass5PU) r0
            java.lang.String r1 = r8.A01
            r3 = 0
            java.util.concurrent.ConcurrentHashMap r0 = r0.A00
            java.lang.Object r0 = r0.get(r1)
            java.lang.ref.Reference r0 = (java.lang.ref.Reference) r0
            if (r0 == 0) goto L_0x0261
            java.lang.Object r2 = r0.get()
            X.66g r2 = (X.C1228966g) r2
            if (r2 == 0) goto L_0x0261
            X.0GC r1 = r2.B6S()
            X.0GC r0 = X.AnonymousClass0GC.STARTED
            int r0 = r1.compareTo(r0)
            boolean r0 = X.AnonymousClass001.A1U(r0)
            if (r0 == 0) goto L_0x0261
            r1 = 2131893996(0x7f121eec, float:1.9422784E38)
            r0 = 3500(0xdac, float:4.905E-42)
            X.5fd r0 = r2.BD8(r1, r0, r3)
            X.C162457s7.A0D(r0)
            r0.A01()
            return
        L_0x012a:
            java.lang.Object r2 = r8.A00
            X.3Gm r2 = (X.C65173Gm) r2
            java.lang.String r1 = r8.A01
            java.util.Map r0 = r2.A03
            java.lang.Object r0 = r0.remove(r1)
            if (r0 == 0) goto L_0x0261
            X.1iG r1 = r2.A01
            java.util.Map r0 = r2.A03
            java.util.ArrayList r2 = X.C18300x5.A0v(r0)
            java.util.Iterator r1 = X.C61102zi.A03(r1)
        L_0x0144:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0261
            java.lang.Object r0 = r1.next()
            X.65c r0 = (X.C1226265c) r0
            r0.BX0(r2)
            goto L_0x0144
        L_0x0154:
            java.lang.Object r0 = r8.A00
            X.5kc r0 = (X.C112935kc) r0
            java.lang.String r2 = r8.A01
            r1 = 1
            X.3Wi r0 = r0.A00
            r0.A0P(r2, r1)
            return
        L_0x0161:
            java.lang.Object r0 = r8.A00
            com.whatsapp.settings.SettingsPrivacy r0 = (com.whatsapp.settings.SettingsPrivacy) r0
            java.lang.String r1 = r8.A01
            android.widget.TextView r0 = r0.A0O
            r0.setText(r1)
            return
        L_0x016d:
            java.lang.Object r6 = r8.A00
            com.whatsapp.registration.profilecheckpoint.ProfileCheckpointRegisterName r6 = (com.whatsapp.registration.profilecheckpoint.ProfileCheckpointRegisterName) r6
            java.lang.String r5 = r8.A01
            X.33j r4 = r6.A00
            X.3Dh r0 = r6.A04
            java.io.File r1 = r0.A0G()
            r0 = 0
            long r2 = X.C627536m.A00(r0, r1)
            X.35r r0 = r6.A0R
            long r0 = r0.A0E()
            long r2 = r2 + r0
            java.lang.String r1 = X.AnonymousClass35V.A04(r4, r2)
            X.3Wi r3 = r6.A05
            r0 = 14
            goto L_0x01cd
        L_0x0190:
            java.lang.Object r3 = r8.A00
            android.content.Context r3 = (android.content.Context) r3
            java.lang.String r1 = r8.A01
            r0 = 3
            byte[] r2 = android.util.Base64.decode(r1, r0)
            r1 = 2
            r0 = 0
            X.AnonymousClass36Q.A03(r3, r0, r2, r1)
            return
        L_0x01a1:
            java.lang.Object r1 = r8.A00
            com.whatsapp.registration.VerifyCaptcha r1 = (com.whatsapp.registration.VerifyCaptcha) r1
            java.lang.String r0 = r8.A01
            com.whatsapp.registration.VerifyCaptcha.A0C(r1, r0)
            return
        L_0x01ab:
            java.lang.Object r6 = r8.A00
            com.whatsapp.registration.RegisterName r6 = (com.whatsapp.registration.RegisterName) r6
            java.lang.String r5 = r8.A01
            X.33j r4 = r6.A00
            X.3Dh r0 = r6.A04
            java.io.File r1 = r0.A0G()
            r0 = 0
            long r2 = X.C627536m.A00(r0, r1)
            X.35r r0 = r6.A0g
            long r0 = r0.A0E()
            long r2 = r2 + r0
            java.lang.String r1 = X.AnonymousClass35V.A04(r4, r2)
            X.3Wi r3 = r6.A05
            r0 = 13
        L_0x01cd:
            X.3aI r2 = new X.3aI
            r2.<init>(r6, r1, r5, r0)
            goto L_0x029b
        L_0x01d4:
            java.lang.Object r2 = r8.A00
            com.whatsapp.registration.RegisterName r2 = (com.whatsapp.registration.RegisterName) r2
            java.lang.String r1 = r8.A01
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0261
            boolean r0 = r2.isFinishing()
            if (r0 != 0) goto L_0x0261
            com.whatsapp.WaEditText r0 = r2.A0L
            r0.setText(r1)
            com.whatsapp.WaEditText r1 = r2.A0L
            int r0 = r1.length()
            r1.setSelection(r0)
            return
        L_0x01f5:
            java.lang.Object r6 = r8.A00
            X.2ms r6 = (X.C53302ms) r6
            com.whatsapp.videoplayback.ExoPlayerErrorFrame r5 = r6.A02
            r4 = 8
            r5.setLoadingViewVisibility(r4)
            java.lang.String r3 = r8.A01
            if (r3 != 0) goto L_0x020f
            android.content.Context r1 = r5.getContext()
            r0 = 2131894548(0x7f122114, float:1.9423904E38)
            java.lang.String r3 = X.C18290x4.A0l(r1, r0)
        L_0x020f:
            android.widget.FrameLayout r0 = r5.A02
            if (r0 != 0) goto L_0x0249
            android.view.LayoutInflater r7 = X.C18280x3.A0D(r5)
            r1 = 2131626336(0x7f0e0960, float:1.8879905E38)
            r0 = 0
            r2 = 0
            android.view.View r1 = r7.inflate(r1, r2, r0)
            java.lang.String r0 = "null cannot be cast to non-null type android.widget.FrameLayout"
            X.C162457s7.A0K(r1, r0)
            android.widget.FrameLayout r1 = (android.widget.FrameLayout) r1
            r5.A02 = r1
            android.widget.FrameLayout r0 = r5.A06
            r0.addView(r1)
            r0 = 2131429888(0x7f0b0a00, float:1.8481461E38)
            android.widget.TextView r0 = X.AnonymousClass002.A09(r5, r0)
            r5.A03 = r0
            r0 = 2131433131(0x7f0b16ab, float:1.848804E38)
            android.view.View r1 = r5.findViewById(r0)
            if (r1 == 0) goto L_0x0247
            android.view.View$OnClickListener r0 = r5.A00
            r1.setOnClickListener(r0)
            r2 = r1
        L_0x0247:
            r5.A01 = r2
        L_0x0249:
            android.widget.TextView r0 = r5.A03
            X.C626936e.A04(r0)
            r0.setText(r3)
            android.widget.FrameLayout r1 = r5.A02
            X.C626936e.A04(r1)
            r0 = 0
            r1.setVisibility(r0)
            X.561 r0 = r6.A03
            if (r0 == 0) goto L_0x0261
            r0.setPlayControlVisibility(r4)
        L_0x0261:
            return
        L_0x0262:
            java.lang.Object r0 = r8.A00
            X.6EW r0 = (X.AnonymousClass6EW) r0
            java.lang.String r1 = r8.A01
            X.4Eb r0 = r0.A09
            r0.BZC(r1)
            return
        L_0x026e:
            java.lang.Object r2 = r8.A00
            X.2Oo r2 = (X.C42542Oo) r2
            java.lang.String r3 = "fmessage-protobuf-subsystem-deserialize"
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "SlowMethodWatcher found a thread stuck for "
            X.C18260x0.A0r(r0, r3, r1)
            X.2qk r2 = r2.A00
            java.lang.String r1 = "slow-method-watcher"
            r0 = 1
            r2.A0A(r1, r0, r3)
            return
        L_0x0287:
            java.lang.Object r4 = r8.A00
            com.whatsapp.profile.ProfilePhotoReminder r4 = (com.whatsapp.profile.ProfilePhotoReminder) r4
            java.lang.String r1 = r8.A01
            X.2b8 r0 = r4.A0I
            r0.A00(r1)
            X.3Wi r3 = r4.A05
            r0 = 13
            X.3bq r2 = new X.3bq
            r2.<init>((java.lang.Object) r4, (int) r0)
        L_0x029b:
            r3.A0S(r2)
            return
        L_0x029f:
            java.lang.Object r0 = r8.A00
            com.whatsapp.profile.ProfileInfoActivity r0 = (com.whatsapp.profile.ProfileInfoActivity) r0
            java.lang.String r1 = r8.A01
            X.2b8 r0 = r0.A0R
            r0.A00(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71373c0.run():void");
    }

    public C71373c0(C42542Oo r2) {
        this.A02 = 2;
        this.A00 = r2;
        this.A01 = "fmessage-protobuf-subsystem-deserialize";
    }
}
