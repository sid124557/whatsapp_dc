package X;

/* renamed from: X.3a2  reason: invalid class name and case insensitive filesystem */
public class C70153a2 implements Runnable {
    public Object A00;
    public Object A01;
    public final int A02;

    public C70153a2(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v37, resolved type: com.whatsapp.voipcalling.VoipCallControlBottomSheetV2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v47, resolved type: com.whatsapp.voipcalling.VoipActivityV2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v49, resolved type: com.whatsapp.voipcalling.VoipActivityV2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v17, resolved type: com.whatsapp.voipcalling.VoipActivityV2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v55, resolved type: com.whatsapp.voipcalling.VoipActivityV2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v24, resolved type: X.5qb} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v70, resolved type: com.whatsapp.voipcalling.VoipCallControlBottomSheetV2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v71, resolved type: com.whatsapp.voipcalling.VoipCallControlBottomSheetV2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v72, resolved type: com.whatsapp.voipcalling.VoipCallControlBottomSheetV2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v73, resolved type: com.whatsapp.voipcalling.VoipCallControlBottomSheetV2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v39, resolved type: com.whatsapp.voipcalling.VoipActivityV2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v74, resolved type: com.whatsapp.voipcalling.VoipCallControlBottomSheetV2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v40, resolved type: com.whatsapp.voipcalling.VoipActivityV2} */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0262, code lost:
        r0 = new X.C70153a2(r3, r1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0323, code lost:
        r0 = new X.C117105rO(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0328, code lost:
        r4.A0S(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x032b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0352, code lost:
        r2.A02(r1, X.C72043d5.A00());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0359, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x037a, code lost:
        r2.BSv(X.C60752z6.A03, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x037f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x008e, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0096, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0097, code lost:
        com.whatsapp.util.Log.w("Failed to fetch author thumbnail", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x009c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01e0, code lost:
        r1.Bot(com.whatsapp.R.string.f11nameremoved);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01e6, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x0458  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0096 A[ExcHandler: IOException | URISyntaxException (r1v88 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:14:0x006d] */
    /* JADX WARNING: Removed duplicated region for block: B:307:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r18 = this;
            r4 = r18
            int r0 = r4.A02
            switch(r0) {
                case 0: goto L_0x05af;
                case 1: goto L_0x0023;
                case 2: goto L_0x0034;
                case 3: goto L_0x0065;
                case 4: goto L_0x009d;
                case 5: goto L_0x00ad;
                case 6: goto L_0x0131;
                case 7: goto L_0x0182;
                case 8: goto L_0x01ad;
                case 9: goto L_0x01be;
                case 10: goto L_0x01d4;
                case 11: goto L_0x01e7;
                case 12: goto L_0x0207;
                case 13: goto L_0x023f;
                case 14: goto L_0x0269;
                case 15: goto L_0x0289;
                case 16: goto L_0x02ad;
                case 17: goto L_0x02bb;
                case 18: goto L_0x02e1;
                case 19: goto L_0x0305;
                case 20: goto L_0x032c;
                case 21: goto L_0x033f;
                case 22: goto L_0x035a;
                case 23: goto L_0x0366;
                case 24: goto L_0x0372;
                case 25: goto L_0x0366;
                case 26: goto L_0x0380;
                case 27: goto L_0x0394;
                case 28: goto L_0x0394;
                case 29: goto L_0x0394;
                case 30: goto L_0x0394;
                case 31: goto L_0x039c;
                case 32: goto L_0x039c;
                case 33: goto L_0x03e8;
                case 34: goto L_0x0432;
                case 35: goto L_0x0471;
                case 36: goto L_0x04b3;
                case 37: goto L_0x0007;
                case 38: goto L_0x0007;
                case 39: goto L_0x0007;
                case 40: goto L_0x0007;
                case 41: goto L_0x04c2;
                case 42: goto L_0x0513;
                case 43: goto L_0x0521;
                case 44: goto L_0x053b;
                case 45: goto L_0x054c;
                case 46: goto L_0x058d;
                case 47: goto L_0x05bb;
                case 48: goto L_0x0604;
                case 49: goto L_0x0610;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r4.A00
            X.2zi r0 = (X.C61102zi) r0
            java.lang.Object r2 = r4.A01
            java.util.List r2 = (java.util.List) r2
            java.util.Iterator r1 = X.C61102zi.A03(r0)
        L_0x0013:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x05ba
            java.lang.Object r0 = r1.next()
            X.65q r0 = (X.C1227665q) r0
            r0.BcN(r2)
            goto L_0x0013
        L_0x0023:
            java.lang.Object r0 = r4.A00
            X.5so r0 = (X.C117985so) r0
            java.lang.Object r1 = r4.A01
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            int r0 = r0.A00
            android.os.Process.setThreadPriority(r0)
            r1.run()
            return
        L_0x0034:
            java.lang.Object r0 = r4.A00
            X.5TM r0 = (X.AnonymousClass5TM) r0
            java.lang.Object r3 = r4.A01
            X.5Xn r3 = (X.C106075Xn) r3
            r2 = 0
            r0.A01()
            r1 = 0
            android.view.TextureView r0 = r0.A0A
            r0.setAlpha(r1)
            int r0 = r3.A00
            int r0 = r0 + 1
            r3.A00 = r0
            r3.A07 = r2
            r3.A06 = r2
            r2 = 0
            r3.A04 = r2
            r3.A05 = r2
            X.7a6 r1 = r3.A03
            r3.A03 = r2
            X.6wt r0 = r3.A02
            r3.A02 = r2
            if (r1 == 0) goto L_0x05ba
            if (r0 == 0) goto L_0x05ba
            r3.A03(r0, r1)
            return
        L_0x0065:
            java.lang.Object r5 = r4.A00
            X.5qO r5 = (X.C116505qO) r5
            java.lang.Object r4 = r4.A01
            X.3Ls r4 = (X.C66513Ls) r4
            X.1VX r1 = r5.A0V     // Catch:{ IOException | URISyntaxException -> 0x0096 }
            java.net.URL r0 = r4.A0K     // Catch:{ IOException | URISyntaxException -> 0x0096 }
            if (r0 == 0) goto L_0x007d
            java.lang.String r0 = r0.toString()     // Catch:{ IOException | URISyntaxException -> 0x0096 }
            byte[] r0 = r4.A0I(r1, r0)     // Catch:{ IOException | URISyntaxException -> 0x0096 }
            r4.A0U = r0     // Catch:{ IOException | URISyntaxException -> 0x0096 }
        L_0x007d:
            android.graphics.Bitmap r3 = r4.A07     // Catch:{ IOException | URISyntaxException -> 0x0096 }
            if (r3 != 0) goto L_0x008f
            byte[] r2 = r4.A0U     // Catch:{ IOException | URISyntaxException -> 0x0096 }
            if (r2 == 0) goto L_0x008f
            int r1 = r2.length     // Catch:{ OutOfMemoryError -> 0x008e, IOException | URISyntaxException -> 0x0096 }
            r0 = 0
            android.graphics.Bitmap r3 = android.graphics.BitmapFactory.decodeByteArray(r2, r0, r1)     // Catch:{ OutOfMemoryError -> 0x008e, IOException | URISyntaxException -> 0x0096 }
            r4.A07 = r3     // Catch:{ OutOfMemoryError -> 0x008e, IOException | URISyntaxException -> 0x0096 }
            goto L_0x008f
        L_0x008e:
            r3 = 0
        L_0x008f:
            X.3Wi r1 = r5.A0P     // Catch:{ IOException | URISyntaxException -> 0x0096 }
            r0 = 4
            X.C69263Wi.A06(r1, r5, r3, r0)     // Catch:{ IOException | URISyntaxException -> 0x0096 }
            return
        L_0x0096:
            r1 = move-exception
            java.lang.String r0 = "Failed to fetch author thumbnail"
            com.whatsapp.util.Log.w(r0, r1)
            return
        L_0x009d:
            java.lang.Object r0 = r4.A00
            X.5qO r0 = (X.C116505qO) r0
            java.lang.Object r1 = r4.A01
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            X.4P1 r0 = r0.A0C
            X.563 r0 = (X.AnonymousClass563) r0
            r0.setAuthorImage(r1)
            return
        L_0x00ad:
            java.lang.Object r1 = r4.A00
            X.5TM r1 = (X.AnonymousClass5TM) r1
            java.lang.Object r0 = r4.A01
            X.7Fh r0 = (X.C147697Fh) r0
            X.7Ei r4 = r1.A05
            if (r4 == 0) goto L_0x05ba
            int r3 = r1.A09
            java.lang.String r7 = r1.A07
            if (r7 != 0) goto L_0x00c1
            java.lang.String r7 = ""
        L_0x00c1:
            long r9 = r1.A00
            r15 = 0
            if (r0 == 0) goto L_0x012d
            long r11 = r0.A01
            int r8 = r0.A00
        L_0x00cb:
            X.7t6 r0 = r1.A02
            if (r0 == 0) goto L_0x012a
            long r13 = r0.A02()
        L_0x00d3:
            X.7t6 r0 = r1.A02
            if (r0 == 0) goto L_0x00db
            long r15 = r0.A03()
        L_0x00db:
            X.7n4 r5 = r1.A03
            if (r5 != 0) goto L_0x00e4
            X.7n4 r5 = new X.7n4
            r5.<init>()
        L_0x00e4:
            java.lang.String r1 = r1.A06
            r0 = 8
            java.lang.StringBuilder r2 = X.C18280x3.A0g(r1, r0)
            java.lang.String r0 = "CompositeHeroPlayer - onVideoStopped() - "
            X.C18260x0.A0w(r0, r2, r3)
            X.5Xn r0 = r4.A00
            java.util.Set r0 = r0.A0D
            java.util.Iterator r3 = r0.iterator()
        L_0x00f9:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x05ba
            java.lang.Object r0 = r3.next()
            X.7RZ r0 = (X.AnonymousClass7RZ) r0
            X.5KS r0 = r0.A00
            X.7kH r0 = r0.A01
            if (r0 == 0) goto L_0x00f9
            android.util.LruCache r2 = r0.A06
            java.lang.Object r6 = r2.get(r1)
            X.7a3 r6 = (X.C152747a3) r6
            r17 = 1
            X.2nr r4 = new X.2nr
            r4.<init>(r5, r6, r7, r8, r9, r11, r13, r15, r17)
            java.util.Set r0 = r0.A03
            java.util.Iterator r2 = r0.iterator()
        L_0x0120:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00f9
            X.C25141a2.A00(r4, r2)
            goto L_0x0120
        L_0x012a:
            r13 = 0
            goto L_0x00d3
        L_0x012d:
            r11 = 0
            r8 = 0
            goto L_0x00cb
        L_0x0131:
            java.lang.Object r7 = r4.A00
            X.3Uo r7 = (X.C68803Uo) r7
            java.lang.Object r3 = r4.A01
            X.2sU r3 = (X.C56742sU) r3
            X.8pn r4 = r7.A09
            if (r4 == 0) goto L_0x05ba
            X.1nB r6 = r7.A07
            X.2sU r5 = r7.A08
            int r2 = r5.A00()
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "MediaViewStreamingVideoPlayer/download state="
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = ", download stage="
            r1.append(r0)
            monitor-enter(r3)
            int r0 = r3.A00     // Catch:{ all -> 0x017f }
            monitor-exit(r3)
            X.C18260x0.A1F(r1, r0)
            r0 = 4
            java.lang.String r3 = ""
            if (r2 != r0) goto L_0x017a
            X.2oU r0 = r7.A04
            android.content.Context r2 = r0.A00
            X.5ZU r1 = r7.A03
            X.3Lo r0 = r7.A06
            java.lang.String r0 = X.AnonymousClass29T.A00(r2, r1, r0, r6, r5)
            if (r0 == 0) goto L_0x0171
            r3 = r0
        L_0x0171:
            boolean r1 = r5.A0A()
            r0 = 1
            r4.BcQ(r3, r1, r0)
            return
        L_0x017a:
            r0 = 0
            r4.BcQ(r3, r0, r0)
            return
        L_0x017f:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x0182:
            java.lang.Object r0 = r4.A00
            X.5qb r0 = (X.C116635qb) r0
            java.lang.Object r1 = r4.A01
            java.util.List r1 = (java.util.List) r1
            com.whatsapp.conversation.waveforms.VoiceVisualizer r3 = r0.A0G
            java.util.List r0 = r3.A0K
            boolean r0 = r0.isEmpty()
            X.C626936e.A0B(r0)
            java.util.Iterator r2 = r1.iterator()
        L_0x0199:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x01a9
            java.lang.Object r1 = r2.next()
            java.util.LinkedList r0 = r3.A0I
            r0.add(r1)
            goto L_0x0199
        L_0x01a9:
            r3.invalidate()
            return
        L_0x01ad:
            java.lang.Object r3 = r4.A00
            X.5qb r3 = (X.C116635qb) r3
            java.lang.Object r0 = r4.A01
            java.io.File r0 = (java.io.File) r0
            java.util.List r2 = X.AnonymousClass31P.A01(r0)
            X.3Wi r4 = r3.A0F
            r1 = 7
            goto L_0x0262
        L_0x01be:
            java.lang.Object r5 = r4.A00
            X.5ZT r5 = (X.AnonymousClass5ZT) r5
            java.lang.Object r4 = r4.A01
            X.5TQ r4 = (X.AnonymousClass5TQ) r4
            X.2qd r3 = r5.A11
            r1 = 0
            r0 = 0
            r3.A01(r4, r1, r0)
            r5.A0S(r0, r0)
            X.4FU r1 = r5.A0e
            goto L_0x01e0
        L_0x01d4:
            java.lang.Object r2 = r4.A00
            X.5ZT r2 = (X.AnonymousClass5ZT) r2
            java.lang.Object r1 = r4.A01
            X.4FU r1 = (X.AnonymousClass4FU) r1
            r0 = 0
            r2.A0S(r0, r0)
        L_0x01e0:
            r0 = 2131889123(0x7f120be3, float:1.94129E38)
            r1.Bot(r0)
            return
        L_0x01e7:
            java.lang.Object r2 = r4.A00
            com.whatsapp.voipcalling.VoipActivityV2 r2 = (com.whatsapp.voipcalling.VoipActivityV2) r2
            java.lang.Object r0 = r4.A01
            com.whatsapp.voipcalling.CallInfo r0 = (com.whatsapp.voipcalling.CallInfo) r0
            com.whatsapp.jid.UserJid r1 = r0.getPeerJid()
            if (r1 == 0) goto L_0x05ba
            X.33g r0 = r2.A0h
            X.5dt r0 = r0.A02(r1)
            if (r0 == 0) goto L_0x05ba
            boolean r0 = r0.A0V
            if (r0 == 0) goto L_0x05ba
            X.3Wi r4 = r2.A05
            r1 = 28
            goto L_0x0323
        L_0x0207:
            java.lang.Object r3 = r4.A00
            com.whatsapp.voipcalling.VoipActivityV2 r3 = (com.whatsapp.voipcalling.VoipActivityV2) r3
            java.lang.Object r2 = r4.A01
            X.227 r0 = X.AnonymousClass227.A0N
            X.2zU r1 = new X.2zU
            r1.<init>(r0)
            r0 = 1
            r1.A02 = r0
            X.2xW r0 = X.C59812xW.A0F
            r1.A00 = r0
            if (r2 == 0) goto L_0x0222
            java.util.Set r0 = r1.A07
            r0.add(r2)
        L_0x0222:
            X.2zz r1 = r1.A02()
            X.3Cq r0 = r3.A1S
            X.304 r2 = r0.A01(r1)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "fetchVerifiedNameDetails result = "
            X.C18260x0.A1P(r1, r0, r2)
            X.304 r0 = X.AnonymousClass304.A03
            if (r2 != r0) goto L_0x05ba
            java.lang.String r0 = "Unable to fetch the verifiedNameDetails"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x023f:
            java.lang.Object r3 = r4.A00
            com.whatsapp.voipcalling.VoipActivityV2 r3 = (com.whatsapp.voipcalling.VoipActivityV2) r3
            java.lang.Object r0 = r4.A01
            com.whatsapp.voipcalling.CallInfo r0 = (com.whatsapp.voipcalling.CallInfo) r0
            com.whatsapp.jid.UserJid r1 = r0.getPeerJid()
            if (r1 == 0) goto L_0x05ba
            X.33g r0 = r3.A0h
            X.5dt r0 = r0.A02(r1)
            if (r0 == 0) goto L_0x05ba
            boolean r0 = r0.A0V
            if (r0 == 0) goto L_0x05ba
            com.whatsapp.voipcalling.WASecuredDialogFragment r2 = new com.whatsapp.voipcalling.WASecuredDialogFragment
            r2.<init>()
            X.3Wi r4 = r3.A05
            r1 = 16
        L_0x0262:
            X.3a2 r0 = new X.3a2
            r0.<init>(r3, r1, r2)
            goto L_0x0328
        L_0x0269:
            java.lang.Object r2 = r4.A00
            com.whatsapp.voipcalling.VoipActivityV2 r2 = (com.whatsapp.voipcalling.VoipActivityV2) r2
            java.lang.Object r0 = r4.A01
            com.whatsapp.voipcalling.CallInfo r0 = (com.whatsapp.voipcalling.CallInfo) r0
            com.whatsapp.jid.UserJid r1 = r0.getPeerJid()
            if (r1 == 0) goto L_0x05ba
            X.33g r0 = r2.A0h
            X.5dt r0 = r0.A02(r1)
            if (r0 == 0) goto L_0x05ba
            boolean r0 = r0.A0V
            if (r0 == 0) goto L_0x05ba
            X.3Wi r4 = r2.A05
            r1 = 26
            goto L_0x0323
        L_0x0289:
            java.lang.Object r2 = r4.A00
            com.whatsapp.voipcalling.VoipActivityV2 r2 = (com.whatsapp.voipcalling.VoipActivityV2) r2
            java.lang.Object r0 = r4.A01
            com.whatsapp.voipcalling.CallInfo r0 = (com.whatsapp.voipcalling.CallInfo) r0
            com.whatsapp.jid.UserJid r1 = r0.getPeerJid()
            if (r1 == 0) goto L_0x05ba
            X.33g r0 = r2.A0h
            X.5dt r0 = r0.A02(r1)
            if (r0 == 0) goto L_0x05ba
            boolean r0 = r0.A0V
            if (r0 == 0) goto L_0x05ba
            java.lang.String r0 = "Update calling sys msg and icon"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            X.3Wi r4 = r2.A05
            r1 = 23
            goto L_0x0323
        L_0x02ad:
            java.lang.Object r2 = r4.A00
            X.4cw r2 = (X.C89434cw) r2
            java.lang.Object r1 = r4.A01
            androidx.fragment.app.DialogFragment r1 = (androidx.fragment.app.DialogFragment) r1
            java.lang.String r0 = "WASecuredDialogFragment"
            r2.A7A(r1, r0)
            return
        L_0x02bb:
            java.lang.Object r2 = r4.A00
            com.whatsapp.voipcalling.VoipActivityV2 r2 = (com.whatsapp.voipcalling.VoipActivityV2) r2
            java.lang.Object r6 = r4.A01
            com.whatsapp.jid.UserJid r6 = (com.whatsapp.jid.UserJid) r6
            X.2sq r1 = r2.A0i
            X.5j8 r0 = new X.5j8
            r0.<init>(r6, r2)
            java.lang.String r11 = "ongoing_call_link_block"
            r13 = 1
            X.C162457s7.A0J(r6, r13)
            r4 = 0
            X.2Tn r3 = new X.2Tn
            r7 = r4
            r8 = r4
            r9 = r4
            r10 = r4
            r12 = r4
            r5 = r4
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r1.A0C(r2, r0, r3, r13)
            return
        L_0x02e1:
            java.lang.Object r2 = r4.A00
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r2 = (com.whatsapp.voipcalling.VoipCallControlBottomSheetV2) r2
            java.lang.Object r0 = r4.A01
            com.whatsapp.voipcalling.CallInfo r0 = (com.whatsapp.voipcalling.CallInfo) r0
            com.whatsapp.jid.UserJid r1 = r0.getPeerJid()
            if (r1 == 0) goto L_0x05ba
            X.33g r0 = r2.A0K
            X.5dt r0 = r0.A02(r1)
            if (r0 == 0) goto L_0x05ba
            boolean r0 = r0.A0V
            if (r0 == 0) goto L_0x05ba
            java.lang.String r0 = "Disable dragging for bottom sheet"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.3Wi r4 = r2.A0J
            r1 = 30
            goto L_0x0323
        L_0x0305:
            java.lang.Object r2 = r4.A00
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r2 = (com.whatsapp.voipcalling.VoipCallControlBottomSheetV2) r2
            java.lang.Object r0 = r4.A01
            com.whatsapp.voipcalling.CallInfo r0 = (com.whatsapp.voipcalling.CallInfo) r0
            com.whatsapp.jid.UserJid r1 = r0.getPeerJid()
            if (r1 == 0) goto L_0x05ba
            X.33g r0 = r2.A0K
            X.5dt r0 = r0.A02(r1)
            if (r0 == 0) goto L_0x05ba
            boolean r0 = r0.A0V
            if (r0 == 0) goto L_0x05ba
            X.3Wi r4 = r2.A0J
            r1 = 33
        L_0x0323:
            X.5rO r0 = new X.5rO
            r0.<init>(r2, r1)
        L_0x0328:
            r4.A0S(r0)
            return
        L_0x032c:
            java.lang.Object r0 = r4.A00
            X.3XV r0 = (X.AnonymousClass3XV) r0
            java.lang.Object r2 = r4.A01
            X.2Jg r2 = (X.C41182Jg) r2
            X.2XW r1 = r0.A02
            java.lang.String r0 = "extension_message_response"
            X.2m3 r2 = r1.A00(r2, r0)
            java.lang.String r1 = "error"
            goto L_0x0352
        L_0x033f:
            java.lang.Object r0 = r4.A00
            X.3XV r0 = (X.AnonymousClass3XV) r0
            java.lang.Object r2 = r4.A01
            X.2Jg r2 = (X.C41182Jg) r2
            X.2XW r1 = r0.A02
            java.lang.String r0 = "extension_message_response"
            X.2m3 r2 = r1.A00(r2, r0)
            java.lang.String r1 = "success"
        L_0x0352:
            X.3d5 r0 = X.C72043d5.A00()
            r2.A02(r1, r0)
            return
        L_0x035a:
            java.lang.Object r2 = r4.A00
            X.4DK r2 = (X.AnonymousClass4DK) r2
            java.lang.Object r1 = r4.A01
            java.util.Map r1 = (java.util.Map) r1
            X.C18260x0.A0O(r2, r1)
            goto L_0x037a
        L_0x0366:
            java.lang.Object r1 = r4.A00
            X.4DK r1 = (X.AnonymousClass4DK) r1
            java.lang.Object r0 = r4.A01
            java.util.Map r0 = (java.util.Map) r0
            r1.BdH(r0)
            return
        L_0x0372:
            java.lang.Object r2 = r4.A00
            X.4DK r2 = (X.AnonymousClass4DK) r2
            java.lang.Object r1 = r4.A01
            java.util.Map r1 = (java.util.Map) r1
        L_0x037a:
            X.2z6 r0 = X.C60752z6.A03
            r2.BSv(r0, r1)
            return
        L_0x0380:
            java.lang.Object r1 = r4.A00
            java.lang.Object r0 = r4.A01
            X.49I r0 = (X.AnonymousClass49I) r0
            X.48t r2 = r0.B3r()
            X.6dJ r1 = X.AnonymousClass8DJ.A03(r1)
            X.7jD r0 = X.C157967jD.A01
            X.C157157hp.A00(r1, r0, r2)
            return
        L_0x0394:
            java.lang.Object r0 = r4.A01
            X.49I r0 = (X.AnonymousClass49I) r0
            r0.B3r()
            return
        L_0x039c:
            java.lang.Object r2 = r4.A00
            X.30E r2 = (X.AnonymousClass30E) r2
            java.lang.Object r4 = r4.A01
            X.2nJ r4 = (X.C53572nJ) r4
            X.5hc r1 = r2.A02()
            if (r1 == 0) goto L_0x03af
            java.lang.String r0 = "TAP_UNDO_CROSSPOST"
            r1.A03(r0)
        L_0x03af:
            X.8qC r0 = r2.A0A
            java.lang.Object r5 = r0.get()
            X.5Ng r5 = (X.C103515Ng) r5
            X.6aY r0 = r4.A01
            java.util.Iterator r3 = r0.iterator()
        L_0x03bd:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x05ba
            java.lang.Object r2 = r3.next()
            X.2kq r2 = (X.C52072kq) r2
            X.6aY r0 = r4.A02
            java.util.Iterator r1 = r0.iterator()
        L_0x03cf:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x03bd
            X.34x r7 = X.C18300x5.A0T(r1)
            X.C162457s7.A0H(r7)
            int r10 = r4.A00
            X.223 r6 = r2.A00
            java.lang.String r8 = r4.A04
            r9 = 0
            r11 = 2
            r5.A00(r6, r7, r8, r9, r10, r11)
            goto L_0x03cf
        L_0x03e8:
            java.lang.Object r7 = r4.A00
            X.3Gn r7 = (X.C65183Gn) r7
            java.lang.Object r6 = r4.A01
            X.34x r6 = (X.C624134x) r6
            java.util.ArrayList r5 = X.AnonymousClass001.A0s()
            X.2rH r4 = r7.A02
            long r2 = r6.A1L
            X.223 r1 = X.AnonymousClass223.FACEBOOK
            java.lang.Integer r0 = r4.A00(r1, r2)
            if (r0 == 0) goto L_0x0409
            int r0 = r0.intValue()
            if (r0 != 0) goto L_0x0409
            r5.add(r1)
        L_0x0409:
            long r2 = r6.A1L
            X.223 r1 = X.AnonymousClass223.INSTAGRAM
            java.lang.Integer r0 = r4.A00(r1, r2)
            if (r0 == 0) goto L_0x041c
            int r0 = r0.intValue()
            if (r0 != 0) goto L_0x041c
            r5.add(r1)
        L_0x041c:
            boolean r0 = X.AnonymousClass0x7.A1S(r5)
            if (r0 == 0) goto L_0x05ba
            X.8qC r0 = r7.A04
            java.lang.Object r1 = r0.get()
            X.2qW r1 = (X.C55542qW) r1
            java.util.List r0 = X.C18290x4.A12(r6)
            r1.A03(r0, r5)
            return
        L_0x0432:
            java.lang.Object r5 = r4.A00
            X.3Gn r5 = (X.C65183Gn) r5
            java.lang.Object r3 = r4.A01
            X.34x r3 = (X.C624134x) r3
            X.5de r1 = r3.A0O
            if (r1 == 0) goto L_0x05ba
            boolean r0 = r1.A03
            boolean r2 = r1.A04
            if (r0 == 0) goto L_0x046c
            com.whatsapp.bridge.wfal.WfalManager r1 = r5.A01
            X.223 r0 = X.AnonymousClass223.FACEBOOK
            if (r2 == 0) goto L_0x0452
            X.7yt r0 = r1.A01(r0)
            if (r0 == 0) goto L_0x05ba
        L_0x0450:
            X.223 r0 = X.AnonymousClass223.INSTAGRAM
        L_0x0452:
            X.7yt r0 = r1.A01(r0)
            if (r0 == 0) goto L_0x05ba
            X.8qC r0 = r5.A04
            java.lang.Object r2 = r0.get()
            X.2qW r2 = (X.C55542qW) r2
            java.util.List r1 = X.C18290x4.A12(r3)
            java.util.List r0 = X.C65183Gn.A00(r3)
            r2.A03(r1, r0)
            return
        L_0x046c:
            if (r2 == 0) goto L_0x05ba
            com.whatsapp.bridge.wfal.WfalManager r1 = r5.A01
            goto L_0x0450
        L_0x0471:
            java.lang.Object r5 = r4.A00
            X.34x r5 = (X.C624134x) r5
            java.lang.Object r1 = r4.A01
            X.3Gn r1 = (X.C65183Gn) r1
            boolean r0 = r5 instanceof X.C30481mW
            if (r0 != 0) goto L_0x048d
            X.8qC r0 = r1.A04
            java.lang.Object r1 = r0.get()
            X.2qW r1 = (X.C55542qW) r1
            java.util.List r0 = X.C65183Gn.A00(r5)
            r1.A01(r5, r0)
            return
        L_0x048d:
            boolean r0 = r1.A00
            if (r0 == 0) goto L_0x05ba
            X.8qC r0 = r1.A04
            java.lang.Object r3 = r0.get()
            X.2qW r3 = (X.C55542qW) r3
            r2 = r5
            X.1mW r2 = (X.C30481mW) r2
            java.util.List r1 = X.C65183Gn.A00(r5)
            r0 = 0
            X.C162457s7.A0J(r2, r0)
            r3.A01(r2, r1)
            X.8qC r0 = r3.A07
            java.lang.Object r0 = r0.get()
            X.2hO r0 = (X.C49962hO) r0
            r0.A01(r2)
            return
        L_0x04b3:
            java.lang.Object r0 = r4.A00
            X.2Tx r0 = (X.C43902Tx) r0
            java.lang.Object r2 = r4.A01
            X.3QO r2 = (X.AnonymousClass3QO) r2
            X.33c r1 = r0.A05
            r0 = 0
            r1.A0E(r2, r0)
            return
        L_0x04c2:
            java.lang.Object r7 = r4.A00
            X.2pr r7 = (X.C55142pr) r7
            java.lang.Object r4 = r4.A01
            java.util.concurrent.CountDownLatch r4 = (java.util.concurrent.CountDownLatch) r4
            X.1VW r2 = r7.A09     // Catch:{ all -> 0x050c }
            r0 = 2863(0xb2f, float:4.012E-42)
            long r5 = X.C56952sp.A06(r2, r0)     // Catch:{ all -> 0x050c }
            r1 = 2864(0xb30, float:4.013E-42)
            X.2vE r0 = X.C58422vE.A02     // Catch:{ all -> 0x050c }
            int r3 = r2.A0O(r0, r1)     // Catch:{ all -> 0x050c }
        L_0x04da:
            X.2rQ r2 = r7.A08     // Catch:{ all -> 0x050c }
            X.31B r0 = r7.A04     // Catch:{ all -> 0x050c }
            byte[] r1 = r0.A0K()     // Catch:{ all -> 0x050c }
            java.lang.String r0 = r2.A01()     // Catch:{ all -> 0x050c }
            byte[] r2 = r2.A06(r1, r0)     // Catch:{ all -> 0x050c }
            if (r2 == 0) goto L_0x04fc
            java.lang.String r0 = "blacknoise: sending payload to wamsys at ragtime!"
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ all -> 0x050c }
            com.whatsapp.wamsys.JniBridge r0 = r7.A0E     // Catch:{ all -> 0x050c }
            r1 = 1
            com.facebook.simplejni.NativeHolder r0 = X.C18300x5.A0I(r0)     // Catch:{ all -> 0x050c }
            com.whatsapp.wamsys.JniBridge.jvidispatchIOO(r1, r0, r2)     // Catch:{ all -> 0x050c }
            goto L_0x0506
        L_0x04fc:
            android.os.SystemClock.sleep(r5)     // Catch:{ all -> 0x050c }
            r0 = 2
            long r5 = r5 * r0
            int r3 = r3 + -1
            if (r3 >= 0) goto L_0x04da
        L_0x0506:
            if (r4 == 0) goto L_0x05ba
            r4.countDown()
            return
        L_0x050c:
            r0 = move-exception
            if (r4 == 0) goto L_0x0512
            r4.countDown()
        L_0x0512:
            throw r0
        L_0x0513:
            java.lang.Object r0 = r4.A00
            X.6Ys r0 = (X.C128996Ys) r0
            java.lang.Object r1 = r4.A01
            X.4GQ r0 = r0.A01
            if (r0 == 0) goto L_0x05ba
            r0.invoke(r1)
            return
        L_0x0521:
            java.lang.Object r0 = r4.A00
            X.15O r0 = (X.AnonymousClass15O) r0
            java.lang.Object r2 = r4.A01
            android.content.Context r2 = (android.content.Context) r2
            X.4FT r1 = r0.A04
            r0 = 2131895559(0x7f122507, float:1.9425954E38)
            java.lang.String r0 = X.C18290x4.A0l(r2, r0)
            r1.Bs3(r0)
            java.lang.String r0 = ""
            r1.Bs4(r0)
            return
        L_0x053b:
            java.lang.Object r2 = r4.A00
            com.whatsapp.webview.ui.WaInAppBrowsingActivity r2 = (com.whatsapp.webview.ui.WaInAppBrowsingActivity) r2
            java.lang.Object r0 = r4.A01
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            java.lang.String r1 = r0.getMessage()
            r0 = 0
            r2.A7A(r1, r0)
            return
        L_0x054c:
            java.lang.Object r1 = r4.A00
            java.util.concurrent.Future r1 = (java.util.concurrent.Future) r1
            java.lang.Object r4 = r4.A01
            com.whatsapp.workmanager.FrequentWorkersAnomalyDetector$LogExceptionsWorker r4 = (com.whatsapp.workmanager.FrequentWorkersAnomalyDetector$LogExceptionsWorker) r4
            r0 = 0
            X.C162457s7.A0J(r1, r0)
            r1.get()     // Catch:{ all -> 0x055c }
            goto L_0x058c
        L_0x055c:
            r3 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "FrequentWorkersAnomalyDetector/Worker "
            r1.append(r0)
            androidx.work.WorkerParameters r0 = r4.A01
            java.util.UUID r0 = r0.A08
            r1.append(r0)
            java.lang.String r0 = " had exception"
            X.C18260x0.A15(r0, r1, r3)
            boolean r0 = r3 instanceof java.util.concurrent.ExecutionException
            if (r0 == 0) goto L_0x05ba
            X.2qk r2 = r4.A01
            X.0QH r0 = r4.A00
            java.lang.String r1 = X.AnonymousClass000.A0O(r0)
            java.lang.Throwable r0 = r3.getCause()
            if (r0 == 0) goto L_0x0585
            r3 = r0
        L_0x0585:
            java.lang.String r0 = "workmanager-worker-exception"
            r2.A09(r0, r1, r3)
            return
        L_0x058c:
            return
        L_0x058d:
            java.lang.Object r0 = r4.A00
            X.5Ke r0 = (X.C102765Ke) r0
            java.lang.Object r4 = r4.A01
            android.content.Context r4 = (android.content.Context) r4
            X.5rC r0 = r0.A01
            java.lang.Object r0 = r0.A04()
            if (r0 == 0) goto L_0x05ba
            r3 = 0
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r1 = r4.getPackageName()
            java.lang.String r0 = "com.whatsapp.xfamily.accountlinking.ui.AccountLinkingWebAuthActivity"
            r2.setClassName(r1, r0)
            X.AnonymousClass0RN.A00(r4, r2, r3)
            return
        L_0x05af:
            java.lang.Object r1 = r4.A00
            X.3Wy r1 = (X.C69423Wy) r1
            java.lang.Object r0 = r4.A01
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            r1.BkM(r0)
        L_0x05ba:
            return
        L_0x05bb:
            java.lang.Object r5 = r4.A00
            com.whatsapp.xfamily.accountlinking.ui.AccountLinkingNativeAuthActivity r5 = (com.whatsapp.xfamily.accountlinking.ui.AccountLinkingNativeAuthActivity) r5
            java.lang.Object r0 = r4.A01
            X.2fU r0 = (X.C48792fU) r0
            X.5It r3 = r5.A04
            if (r3 == 0) goto L_0x05fd
            X.21S r7 = X.AnonymousClass21S.A02
            X.5dT r2 = r5.A05
            if (r2 != 0) goto L_0x05d4
            java.lang.String r0 = "fb4aUserEntityForNativeAuth"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x05d4:
            X.2Mg r1 = new X.2Mg
            r1.<init>(r5, r0)
            X.8qC r0 = r3.A00
            java.lang.Object r6 = r0.get()
            X.2Z8 r6 = (X.AnonymousClass2Z8) r6
            X.5dj r5 = r2.A00
            X.2aT r4 = new X.2aT
            r4.<init>(r3, r7, r1)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "NativeAuthTokenExchangeHelper/exchangeFb4aTokenForWaCrosspostingToken called by caller "
            X.C18260x0.A1N(r1, r0, r7)
            r3 = 3
            long r1 = X.C59192wV.A01
            X.2p5 r0 = new X.2p5
            r0.<init>(r3, r1)
            r6.A00(r0, r5, r4, r7)
            return
        L_0x05fd:
            java.lang.String r0 = "accountLinkingLoginManager"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0604:
            java.lang.Object r1 = r4.A00
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            java.lang.Object r0 = r4.A01
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
            r1.setImageDrawable(r0)
            return
        L_0x0610:
            java.lang.Object r5 = r4.A00
            com.whatsapp.xfamily.accountlinking.ui.AccountLinkingWebAuthActivity r5 = (com.whatsapp.xfamily.accountlinking.ui.AccountLinkingWebAuthActivity) r5
            java.lang.Object r3 = r4.A01
            X.2fU r3 = (X.C48792fU) r3
            boolean r2 = X.C18270x1.A1U(r5, r3)
            X.4xg r1 = r5.A00
            if (r1 == 0) goto L_0x062b
            r0 = 0
            r1.A08(r0, r0, r0, r2)
            r3.A00()
            r5.finish()
            return
        L_0x062b:
            java.lang.String r0 = "accountLinkingResultObservers"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70153a2.run():void");
    }
}
