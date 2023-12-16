package X;

/* renamed from: X.3aE  reason: invalid class name and case insensitive filesystem */
public class C70273aE implements Runnable {
    public int A00;
    public int A01;
    public Object A02;
    public final int A03;

    public C70273aE(Object obj, int i, int i2, int i3) {
        this.A03 = i3;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0193, code lost:
        if (r3 == 3) goto L_0x0195;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r9 = this;
            int r0 = r9.A03
            switch(r0) {
                case 0: goto L_0x01a8;
                case 1: goto L_0x01f4;
                case 2: goto L_0x0213;
                case 3: goto L_0x0018;
                case 4: goto L_0x021f;
                case 5: goto L_0x0052;
                case 6: goto L_0x0085;
                case 7: goto L_0x022b;
                case 8: goto L_0x00a1;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r9.A02
            com.whatsapp.waffle.wfac.ui.WfacBanBaseFragment r0 = (com.whatsapp.waffle.wfac.ui.WfacBanBaseFragment) r0
            int r3 = r9.A00
            int r2 = r9.A01
            X.2XC r1 = r0.A1I()
            java.lang.String r0 = "tos_link_opened"
            r1.A01(r0, r3, r2)
        L_0x0017:
            return
        L_0x0018:
            java.lang.Object r5 = r9.A02
            X.5ft r5 = (X.C110225ft) r5
            int r4 = r9.A00
            int r3 = r9.A01
            X.5l7 r8 = r5.A04
            X.4uZ r7 = r8.A4J
            X.3LP r6 = r8.A42
            X.1VX r2 = r8.A41
            X.676 r0 = r8.A2z
            X.3Ex r1 = r0.getContactManager()
            X.2sM r0 = r8.A3o
            boolean r0 = X.C57642ty.A00(r1, r0, r2, r6, r7)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r8.A7Q = r0
            java.lang.Boolean r0 = r8.A7Q
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0017
            X.676 r0 = r8.A2z
            X.3Wi r2 = r0.getGlobalUI()
            r1 = 2
            X.3aE r0 = new X.3aE
            r0.<init>(r5, r4, r3, r1)
            r2.A0S(r0)
            return
        L_0x0052:
            java.lang.Object r0 = r9.A02
            X.4Mf r0 = (X.C86884Mf) r0
            int r4 = r9.A00
            int r2 = r9.A01
            java.lang.ref.WeakReference r0 = r0.A0E
            java.lang.Object r3 = r0.get()
            X.51g r3 = (X.C985351g) r3
            if (r3 == 0) goto L_0x0017
            int r1 = r4 - r2
            r0 = 0
            int r7 = java.lang.Math.max(r0, r1)
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r0 = (long) r7
            long r5 = r5.toSeconds(r0)
            int r1 = (int) r5
            boolean r0 = r3.A04
            if (r0 != 0) goto L_0x0293
            X.4Pf r0 = r3.A0A
            com.whatsapp.status.playback.widget.VoiceStatusContentView r0 = r0.A02
            if (r0 != 0) goto L_0x0290
            java.lang.String r0 = "voiceStatusContentView"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0085:
            java.lang.Object r3 = r9.A02
            android.widget.EditText r3 = (android.widget.EditText) r3
            int r2 = r9.A00
            int r1 = r9.A01
            android.text.Editable r0 = r3.getText()
            if (r0 == 0) goto L_0x009f
            int r0 = r0.length()
        L_0x0097:
            if (r2 > r0) goto L_0x0017
            if (r1 > r0) goto L_0x0017
            r3.setSelection(r2, r1)
            return
        L_0x009f:
            r0 = 0
            goto L_0x0097
        L_0x00a1:
            java.lang.Object r4 = r9.A02
            X.2X7 r4 = (X.AnonymousClass2X7) r4
            int r2 = r9.A00
            int r3 = r9.A01
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "InlineYoutubeVideoPlayer/YoutubeJsInterface/postPlayerEvent:"
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " data: "
            X.C18260x0.A0y(r0, r1, r3)
            if (r2 == 0) goto L_0x012a
            r5 = 1
            if (r2 == r5) goto L_0x02c4
            r0 = 2
            if (r2 == r0) goto L_0x00f4
            r0 = 3
            X.1uR r4 = r4.A00
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            if (r2 == r0) goto L_0x00e3
            java.lang.String r0 = "Invalid postPlayerEvent"
            java.lang.String r2 = X.AnonymousClass000.A0Y(r0, r1, r3)
            if (r3 == 0) goto L_0x00d4
            r5 = 0
        L_0x00d4:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "player_error_"
        L_0x00db:
            java.lang.String r0 = X.AnonymousClass000.A0Y(r0, r1, r3)
            r4.A0g(r2, r5, r0)
            return
        L_0x00e3:
            java.lang.String r0 = "Youtube player Error="
            java.lang.String r2 = X.AnonymousClass000.A0Y(r0, r1, r3)
            if (r3 == 0) goto L_0x00ec
            r5 = 0
        L_0x00ec:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "youtube_error_"
            goto L_0x00db
        L_0x00f4:
            X.1uR r6 = r4.A00
            int r0 = r3 * 1000
            long r7 = (long) r0
            boolean r0 = r6.A08
            if (r0 != 0) goto L_0x0017
            long r3 = r6.A04
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0017
            r6.A04 = r7
            android.webkit.WebView r1 = r6.A0C
            java.lang.String r0 = "javascript:(function() { loaded = true; })()"
            r1.loadUrl(r0)
            long r2 = r6.A04
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 > 0) goto L_0x0017
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Invalid duration="
            java.lang.String r2 = X.AnonymousClass000.A0Z(r0, r1, r2)
            r1 = 0
            java.lang.String r0 = "invalid_duration"
            r6.A0g(r2, r1, r0)
            return
        L_0x012a:
            X.1uR r2 = r4.A00
            r0 = 3
            if (r3 <= r0) goto L_0x0188
            r0 = 5
            if (r3 != r0) goto L_0x0017
        L_0x0132:
            int r1 = r2.A02
            r0 = 2
            r5 = 1
            if (r1 == r0) goto L_0x0173
            if (r3 != r0) goto L_0x013d
            r2.A0C()
        L_0x013d:
            X.8pt r0 = r2.A0A
            if (r0 == 0) goto L_0x0144
            r0.BYM(r5, r3)
        L_0x0144:
            r2.A03 = r3
            int r1 = r2.A00
            if (r1 != r5) goto L_0x0166
            if (r3 == r5) goto L_0x016b
        L_0x014c:
            boolean r0 = r2.A08
            if (r0 != 0) goto L_0x0192
            if (r3 != r5) goto L_0x0192
            long r6 = r2.A04
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x019d
            java.lang.String r1 = "Video started playing before duration loaded."
            java.lang.String r0 = "playback_started_before_duration_loaded"
            r2.A0g(r1, r5, r0)
            return
        L_0x0166:
            r0 = 2
            if (r1 != r0) goto L_0x014c
            if (r3 != r0) goto L_0x014c
        L_0x016b:
            r1 = 0
            r2.A00 = r1
            X.563 r0 = r2.A0F
            r0.A0K = r1
            goto L_0x014c
        L_0x0173:
            if (r3 != r5) goto L_0x013d
            android.webkit.WebView r1 = r2.A0C
            java.lang.String r0 = "javascript:(function() { player.playVideo(); })()"
            r1.loadUrl(r0)
            r2.A02 = r5
            r2.A00 = r5
            X.563 r0 = r2.A0F
            r0.A08()
            r0.A0K = r5
            goto L_0x013d
        L_0x0188:
            if (r3 != 0) goto L_0x0132
            int r0 = r2.A03
            if (r0 == r3) goto L_0x0132
            r2.A0H()
            goto L_0x0132
        L_0x0192:
            r0 = 3
            if (r3 != r0) goto L_0x01a6
        L_0x0195:
            X.8pp r0 = r2.A06
            if (r0 == 0) goto L_0x0017
            r0.BNm(r2, r5)
            return
        L_0x019d:
            r2.A08 = r5
            X.8ps r0 = r2.A09
            if (r0 == 0) goto L_0x01a6
            r0.Bc9(r2)
        L_0x01a6:
            r5 = 0
            goto L_0x0195
        L_0x01a8:
            int r2 = r9.A00
            int r1 = r9.A01
            java.lang.Object r6 = r9.A02
            X.5K3 r6 = (X.AnonymousClass5K3) r6
            X.1Yw r5 = new X.1Yw
            r5.<init>()
            java.lang.String r0 = X.C18280x3.A0Y()
            r5.A03 = r0
            java.lang.Long r0 = X.AnonymousClass0x9.A0m(r2)
            r5.A00 = r0
            java.lang.Long r0 = X.AnonymousClass0x9.A0m(r1)
            r5.A01 = r0
            X.3S3 r0 = r6.A04
            java.util.HashMap r0 = r0.A06
            java.util.Iterator r4 = X.C18290x4.A10(r0)
            r3 = 0
        L_0x01d0:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x01e8
            java.lang.Object r2 = r4.next()
            X.2SS r2 = (X.AnonymousClass2SS) r2
            int r1 = r2.A02
            r0 = 1
            if (r1 != r0) goto L_0x01d0
            int r0 = r2.A01
            if (r0 == 0) goto L_0x01d0
            int r3 = r3 + 1
            goto L_0x01d0
        L_0x01e8:
            java.lang.Long r0 = X.AnonymousClass0x9.A0m(r3)
            r5.A02 = r0
            X.4FV r0 = r6.A03
            r0.BhD(r5)
            return
        L_0x01f4:
            java.lang.Object r4 = r9.A02
            X.8KC r4 = (X.AnonymousClass8KC) r4
            int r3 = r9.A00
            int r2 = r9.A01
            X.5qe r0 = r4.A0D
            X.C626936e.A01()
            com.whatsapp.jid.UserJid r1 = r4.A0F
            X.2sr r0 = r0.A03
            boolean r0 = r0.A0a(r1)
            if (r0 == 0) goto L_0x020f
            com.whatsapp.voipcalling.Voip.setVideoPreviewSize(r3, r2)
            return
        L_0x020f:
            com.whatsapp.voipcalling.Voip.setVideoDisplayPort(r1, r4)
            return
        L_0x0213:
            java.lang.Object r2 = r9.A02
            X.5ft r2 = (X.C110225ft) r2
            int r1 = r9.A00
            int r0 = r9.A01
            r2.A00(r1, r0)
            return
        L_0x021f:
            java.lang.Object r2 = r9.A02
            X.2rB r2 = (X.C55952rB) r2
            int r1 = r9.A00
            int r0 = r9.A01
            r2.A02(r1, r0)
            return
        L_0x022b:
            java.lang.Object r4 = r9.A02
            X.2hu r4 = (X.C50272hu) r4
            int r0 = r9.A00
            int r6 = r9.A01
            monitor-enter(r4)
            X.1ZE r5 = new X.1ZE     // Catch:{ all -> 0x028d }
            r5.<init>()     // Catch:{ all -> 0x028d }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x028d }
            r5.A00 = r0     // Catch:{ all -> 0x028d }
            X.2aF r1 = r4.A04     // Catch:{ all -> 0x028d }
            int r0 = r1.A00()     // Catch:{ all -> 0x028d }
            java.lang.Long r0 = X.AnonymousClass0x9.A0m(r0)     // Catch:{ all -> 0x028d }
            r5.A03 = r0     // Catch:{ all -> 0x028d }
            X.2sH r0 = r4.A01     // Catch:{ all -> 0x028d }
            long r2 = r0.A0H()     // Catch:{ all -> 0x028d }
            X.2Yw r0 = r1.A02     // Catch:{ all -> 0x028d }
            android.content.SharedPreferences r1 = r0.A00()     // Catch:{ all -> 0x028d }
            java.lang.String r0 = "session_start_timestamp"
            long r0 = X.AnonymousClass0x2.A0A(r1, r0)     // Catch:{ all -> 0x028d }
            java.lang.Long r0 = X.C18310x6.A0f(r2, r0)     // Catch:{ all -> 0x028d }
            r5.A01 = r0     // Catch:{ all -> 0x028d }
            X.4FS r8 = r4.A05     // Catch:{ all -> 0x028d }
            X.66R r0 = r4.A06     // Catch:{ all -> 0x028d }
            long r2 = X.C18290x4.A0D(r0)     // Catch:{ all -> 0x028d }
            java.lang.String r7 = "TimeSpentExternalEventLogger/logExternalEvent"
            r1 = 19
            X.3cJ r0 = new X.3cJ     // Catch:{ all -> 0x028d }
            r0.<init>((java.lang.Object) r4, (int) r6, (int) r1)     // Catch:{ all -> 0x028d }
            java.lang.Runnable r3 = r8.Bkn(r0, r7, r2)     // Catch:{ all -> 0x028d }
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x028d }
            X.5Ip r2 = new X.5Ip     // Catch:{ all -> 0x028d }
            r2.<init>(r5, r3, r0)     // Catch:{ all -> 0x028d }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x028d }
            java.util.HashMap r0 = r4.A00     // Catch:{ all -> 0x028d }
            r0.put(r1, r2)     // Catch:{ all -> 0x028d }
            monitor-exit(r4)
            return
        L_0x028d:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x0290:
            r0.setDuration(r1)
        L_0x0293:
            r0 = 50
            r1 = 1
            if (r7 > r0) goto L_0x02a7
            boolean r0 = r3.A06
            if (r0 != 0) goto L_0x02a7
            boolean r0 = r3.A07
            if (r0 != 0) goto L_0x02a7
            X.5Pj r0 = r3.A05
            r0.A00()
            r3.A06 = r1
        L_0x02a7:
            float r1 = (float) r2
            float r0 = (float) r4
            float r1 = r1 / r0
            r0 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 * r0
            r3.A00 = r1
            X.5pQ r3 = r3.A0C
            X.08M r0 = r3.A04
            X.C06270Wx.A03(r0, r4)
            int r0 = r2 / 150
            int r2 = r0 + -2
            r1 = -1
            X.08M r0 = r3.A06
            if (r2 >= r1) goto L_0x02c0
            r2 = -4
        L_0x02c0:
            X.C06270Wx.A03(r0, r2)
            return
        L_0x02c4:
            X.1uR r1 = r4.A00
            int r0 = r3 * 1000
            r1.A01 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70273aE.run():void");
    }
}
