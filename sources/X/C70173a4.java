package X;

/* renamed from: X.3a4  reason: invalid class name and case insensitive filesystem */
public class C70173a4 implements Runnable {
    public Object A00;
    public Object A01;
    public final int A02;

    public C70173a4(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A01 = obj;
        this.A00 = obj2;
    }

    public static void A00(AnonymousClass4FS r1, Object obj, Object obj2, int i) {
        r1.BkM(new C70173a4(obj, i, obj2));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0269, code lost:
        X.C18260x0.A1R(r1, r0, r3);
        r0 = X.C627736r.A0O(r2, r3);
        X.AnonymousClass5VI.A00(r0, "AcceptInviteLinkActivity");
        r1 = true;
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0276, code lost:
        r2.A6T(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0279, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0387, code lost:
        if ((r4.A00 / com.google.android.search.verification.client.SearchActionVerificationClientService.MS_TO_NS) <= 100) goto L_0x0389;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x0855, code lost:
        r1.A04(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x0858, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x0901, code lost:
        r5.A01(r6, r7, r8, r9, r10, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x0904, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x0905, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00fd, code lost:
        r8.A00(r9, r10, r11, r12, r13, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0100, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r81 = this;
            r4 = r81
            int r0 = r4.A02
            switch(r0) {
                case 5: goto L_0x027a;
                case 6: goto L_0x028d;
                case 7: goto L_0x02c1;
                case 8: goto L_0x02fb;
                case 9: goto L_0x032d;
                case 10: goto L_0x0339;
                case 11: goto L_0x0008;
                case 12: goto L_0x0345;
                case 13: goto L_0x035a;
                case 14: goto L_0x05be;
                case 15: goto L_0x0013;
                case 16: goto L_0x00a1;
                case 17: goto L_0x05cc;
                case 18: goto L_0x05dc;
                case 19: goto L_0x05ea;
                case 20: goto L_0x0915;
                case 21: goto L_0x0605;
                case 22: goto L_0x0624;
                case 23: goto L_0x0101;
                case 24: goto L_0x0101;
                case 25: goto L_0x0159;
                case 26: goto L_0x0792;
                case 27: goto L_0x079e;
                case 28: goto L_0x07ac;
                case 29: goto L_0x07b8;
                case 30: goto L_0x07c8;
                case 31: goto L_0x07e0;
                case 32: goto L_0x07ec;
                case 33: goto L_0x0177;
                case 34: goto L_0x07f8;
                case 35: goto L_0x07f8;
                case 36: goto L_0x019d;
                case 37: goto L_0x07f8;
                case 38: goto L_0x01d0;
                case 39: goto L_0x0806;
                case 40: goto L_0x084a;
                case 41: goto L_0x01ed;
                case 42: goto L_0x0859;
                case 43: goto L_0x087c;
                case 44: goto L_0x08b5;
                case 45: goto L_0x08c9;
                case 46: goto L_0x0909;
                case 47: goto L_0x020a;
                case 48: goto L_0x0230;
                case 49: goto L_0x0251;
                default: goto L_0x0007;
            }
        L_0x0007:
            return
        L_0x0008:
            java.lang.Object r2 = r4.A00
            X.4ea r2 = (X.C89654ea) r2
            java.lang.Object r0 = r4.A01
            android.content.Intent r0 = (android.content.Intent) r0
            r1 = 0
            goto L_0x0276
        L_0x0013:
            java.lang.Object r0 = r4.A00
            X.3Go r0 = (X.C65193Go) r0
            java.lang.Object r4 = r4.A01
            X.34x r4 = (X.C624134x) r4
            X.2d6 r8 = r0.A0l
            X.1p1 r4 = (X.C31891p1) r4
            X.39T r0 = r4.A04
            if (r0 == 0) goto L_0x0007
            X.2ss r1 = r8.A07
            com.whatsapp.jid.Jid r0 = r0.A02
            X.4uZ r0 = X.C627336j.A02(r0)
            X.31A r7 = X.C56982ss.A00(r1, r0)
            if (r7 == 0) goto L_0x0007
            boolean r0 = r7.A0i
            r3 = 0
            if (r0 == 0) goto L_0x0043
            X.2sA r2 = r8.A06
            X.4uZ r1 = r7.A05()
            java.lang.Integer r0 = X.C18290x4.A0a()
            r2.A06(r1, r0, r3)
        L_0x0043:
            X.1R1 r1 = r8.A09
            X.4uZ r0 = r7.A05()
            X.2sa r0 = X.AnonymousClass1R1.A00(r0, r1)
            long r5 = r0.A00()
            r1 = 0
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            boolean r0 = X.AnonymousClass000.A1S(r0)
            if (r0 != 0) goto L_0x0007
            X.2oU r0 = r8.A04
            android.content.Context r10 = r0.A00
            java.lang.String r13 = r7.A07()
            X.3Lw r1 = r8.A08
            android.content.Context r0 = r10.getApplicationContext()
            java.lang.CharSequence r12 = r1.A0F(r0, r4)
            X.4uZ r1 = r7.A05()
            com.whatsapp.jid.GroupJid r1 = (com.whatsapp.jid.GroupJid) r1
            X.2so r0 = r8.A01
            X.1fJ r1 = (X.C27991fJ) r1
            X.1fJ r11 = r0.A01(r1)
            if (r11 == 0) goto L_0x0007
            java.util.List r2 = r4.A01
            int r1 = r2.size()
            r0 = 1
            if (r1 != r0) goto L_0x0095
            X.2sr r1 = r8.A00
            boolean r0 = X.C56972sr.A0B(r1, r2)
            if (r0 == 0) goto L_0x0095
            boolean r0 = X.C56972sr.A0A(r1, r4)
            if (r0 == 0) goto L_0x0095
            return
        L_0x0095:
            android.content.Intent r1 = X.C627736r.A0U(r10, r11, r3)
            r0 = 6
            android.app.PendingIntent r9 = X.C624735e.A04(r10, r1, r0)
            r14 = 49
            goto L_0x00fd
        L_0x00a1:
            java.lang.Object r0 = r4.A00
            X.3Go r0 = (X.C65193Go) r0
            java.lang.Object r6 = r4.A01
            X.34x r6 = (X.C624134x) r6
            X.2d6 r8 = r0.A0l
            X.2z0 r0 = r6.A1J
            X.4uZ r11 = r0.A00
            com.whatsapp.jid.GroupJid r11 = (com.whatsapp.jid.GroupJid) r11
            if (r11 == 0) goto L_0x0007
            X.2ss r7 = r8.A07
            boolean r0 = r7.A0N(r11)
            if (r0 != 0) goto L_0x0007
            X.2so r0 = r8.A01
            r5 = r11
            X.1fJ r5 = (X.C27991fJ) r5
            X.2rM r0 = r0.A0H
            X.2mC r0 = r0.A00(r5)
            if (r0 == 0) goto L_0x0007
            com.whatsapp.jid.GroupJid r1 = r0.A02
            X.1R1 r0 = r8.A09
            X.2sa r0 = X.AnonymousClass1R1.A00(r1, r0)
            long r3 = r0.A00()
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            boolean r0 = X.AnonymousClass000.A1S(r0)
            if (r0 != 0) goto L_0x0007
            X.2oU r0 = r8.A04
            android.content.Context r10 = r0.A00
            java.lang.String r13 = r7.A0D(r11)
            if (r13 == 0) goto L_0x0007
            X.3Lw r1 = r8.A08
            android.content.Context r0 = r10.getApplicationContext()
            java.lang.CharSequence r12 = r1.A0F(r0, r6)
            android.content.Intent r1 = X.C627736r.A0i(r10, r5)
            r0 = 6
            android.app.PendingIntent r9 = X.C624735e.A04(r10, r1, r0)
            r14 = 72
        L_0x00fd:
            r8.A00(r9, r10, r11, r12, r13, r14)
            return
        L_0x0101:
            java.lang.Object r5 = r4.A00
            X.1i9 r5 = (X.C29021i9) r5
            java.lang.Object r7 = r4.A01
            X.2Ov[] r7 = (X.C42612Ov[]) r7
            X.30x r0 = r5.A0G
            X.3fe r6 = r0.A03()
            X.33n r4 = r5.A0E     // Catch:{ all -> 0x0931 }
            if (r7 == 0) goto L_0x0135
            int r2 = r7.length     // Catch:{ all -> 0x0931 }
            if (r2 == 0) goto L_0x0135
            int[] r3 = new int[r2]     // Catch:{ all -> 0x0931 }
            r1 = 0
        L_0x0119:
            r0 = r7[r1]     // Catch:{ all -> 0x0931 }
            byte[] r0 = r0.A01     // Catch:{ all -> 0x0931 }
            int r0 = X.AnonymousClass36A.A00(r0)     // Catch:{ all -> 0x0931 }
            r3[r1] = r0     // Catch:{ all -> 0x0931 }
            int r1 = r1 + 1
            if (r1 < r2) goto L_0x0119
            X.30x r0 = r4.A0K     // Catch:{ all -> 0x0931 }
            X.3fe r2 = r0.A03()     // Catch:{ all -> 0x0931 }
            X.2q3 r0 = r4.A09     // Catch:{ all -> 0x0925 }
            r0.A03(r3)     // Catch:{ all -> 0x0925 }
            if (r2 == 0) goto L_0x013f
            goto L_0x013c
        L_0x0135:
            java.lang.String r0 = "tried to mark an empty list of preKeys as sent to server"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x0931 }
            goto L_0x013f
        L_0x013c:
            r2.close()     // Catch:{ all -> 0x0931 }
        L_0x013f:
            X.33p r1 = r5.A0D     // Catch:{ all -> 0x0931 }
            boolean r0 = r1.A2K()     // Catch:{ all -> 0x0931 }
            if (r0 == 0) goto L_0x014e
            r0 = 0
            r1.A21(r0)     // Catch:{ all -> 0x0931 }
            r1.A1z(r0)     // Catch:{ all -> 0x0931 }
        L_0x014e:
            r0 = 0
            r5.A0E(r0)     // Catch:{ all -> 0x0931 }
            if (r6 == 0) goto L_0x0007
            r6.close()
            return
        L_0x0159:
            java.lang.Object r3 = r4.A00
            X.2r7 r3 = (X.C55912r7) r3
            java.lang.Object r2 = r4.A01
            X.3Wi r2 = (X.C69263Wi) r2
            java.util.Map r1 = r3.A07
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0007
            r1.clear()
            X.C55912r7.A00(r3)
            r1 = 2131889321(0x7f120ca9, float:1.9413302E38)
            r0 = 1
            r2.A0H(r1, r0)
            return
        L_0x0177:
            java.lang.Object r0 = r4.A00
            X.33m r0 = (X.C621033m) r0
            java.lang.Object r1 = r4.A01
            X.30M r1 = (X.AnonymousClass30M) r1
            X.2rq r4 = r0.A06     // Catch:{ IOException -> 0x093e }
            X.1mV r0 = r1.A00()     // Catch:{ IOException -> 0x093e }
            java.io.File r3 = X.C30471mV.A01(r0)     // Catch:{ IOException -> 0x093e }
            java.util.concurrent.CopyOnWriteArrayList r0 = r1.A02     // Catch:{ IOException -> 0x093e }
            int r2 = r0.size()     // Catch:{ IOException -> 0x093e }
            r1 = 0
            X.3Dh r0 = r4.A00     // Catch:{ IOException -> 0x093e }
            boolean r0 = r0.A0e(r3)     // Catch:{ IOException -> 0x093e }
            if (r0 == 0) goto L_0x0007
            r4.A05(r3, r2, r1)     // Catch:{ IOException -> 0x093e }
            goto L_0x093d
        L_0x019d:
            java.lang.Object r0 = r4.A00
            X.33m r0 = (X.C621033m) r0
            java.lang.Object r6 = r4.A01
            X.34x r6 = (X.C624134x) r6
            X.7am r3 = r0.A0F
            X.2z0 r0 = r6.A1J
            X.4uZ r4 = r0.A00
            if (r4 == 0) goto L_0x0007
            X.34q r1 = r3.A00
            boolean r0 = r1.A0B()
            if (r0 == 0) goto L_0x0007
            r2 = 0
            X.2rV r1 = r1.A05
            r0 = 1
            java.util.List r1 = r1.A04(r4, r0, r2, r2)
            boolean r0 = X.C18310x6.A1X(r1)
            if (r0 == 0) goto L_0x01ce
            X.34x r5 = X.C18320x8.A0R(r1, r2)
        L_0x01c7:
            byte r7 = r6.A1I
            r8 = 1
            r3.A01(r4, r5, r6, r7, r8)
            return
        L_0x01ce:
            r5 = 0
            goto L_0x01c7
        L_0x01d0:
            java.lang.Object r3 = r4.A00
            X.33m r3 = (X.C621033m) r3
            java.lang.Object r0 = r4.A01
            java.util.Iterator r2 = X.C18320x8.A0q(r0)
        L_0x01da:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0007
            X.34x r1 = X.C18300x5.A0T(r2)
            X.2ol r0 = r3.A1P
            r0.A01(r1)
            r0.A03(r1)
            goto L_0x01da
        L_0x01ed:
            java.lang.Object r2 = r4.A00
            X.33m r2 = (X.C621033m) r2
            java.lang.Object r0 = r4.A01
            boolean r0 = X.AnonymousClass001.A1Z(r0)
            java.lang.String r1 = "starred"
            if (r0 == 0) goto L_0x0945
            X.2gs r0 = r2.A1W
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x0007
            X.4xh r0 = r2.A1n
            r0.A09(r1)
            return
        L_0x020a:
            java.lang.Object r5 = r4.A00
            com.whatsapp.acceptinvitelink.AcceptInviteLinkActivity r5 = (com.whatsapp.acceptinvitelink.AcceptInviteLinkActivity) r5
            java.lang.Object r3 = r4.A01
            byte[] r3 = (byte[]) r3
            boolean r0 = r5.BHW()
            if (r0 != 0) goto L_0x0007
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "AcceptInviteLinkActivity/fetchGroupProfilePicture: "
            r2.append(r0)
            int r1 = r3.length
            X.C18260x0.A1G(r2, r1)
            r0 = 0
            android.graphics.Bitmap r1 = android.graphics.BitmapFactory.decodeByteArray(r3, r0, r1)
            X.5RG r0 = r5.A0H
            r0.A00(r1)
            return
        L_0x0230:
            java.lang.Object r0 = r4.A00
            X.4IC r0 = (X.AnonymousClass4IC) r0
            java.lang.Object r3 = r4.A01
            X.4uZ r3 = (X.C95814uZ) r3
            java.lang.Object r2 = r0.A00
            com.whatsapp.acceptinvitelink.AcceptInviteLinkActivity r2 = (com.whatsapp.acceptinvitelink.AcceptInviteLinkActivity) r2
            boolean r0 = r2.BHW()
            if (r0 != 0) goto L_0x0007
            X.2ss r0 = r2.A08
            boolean r0 = r0.A0L(r3)
            if (r0 == 0) goto L_0x0007
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "acceptlink/onConversationsListChanged/ok/"
            goto L_0x0269
        L_0x0251:
            java.lang.Object r0 = r4.A00
            X.4IC r0 = (X.AnonymousClass4IC) r0
            java.lang.Object r3 = r4.A01
            X.4uZ r3 = (X.C95814uZ) r3
            java.lang.Object r2 = r0.A00
            X.4ea r2 = (X.C89654ea) r2
            boolean r0 = r2.BHW()
            if (r0 != 0) goto L_0x0007
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "acceptlink/onConversationChanged/ok/"
        L_0x0269:
            X.C18260x0.A1R(r1, r0, r3)
            android.content.Intent r0 = X.C627736r.A0O(r2, r3)
            java.lang.String r1 = "AcceptInviteLinkActivity"
            X.AnonymousClass5VI.A00(r0, r1)
            r1 = 1
        L_0x0276:
            r2.A6T(r0, r1)
            return
        L_0x027a:
            java.lang.Object r1 = r4.A00
            X.6T0 r1 = (X.AnonymousClass6T0) r1
            java.lang.Object r0 = r4.A01
            X.6YZ r0 = (X.AnonymousClass6YZ) r0
            X.6CW r0 = r0.A01
            r1.A00(r0)
            X.8Bc r0 = r0.A04
            r1.A00(r0)
            return
        L_0x028d:
            java.lang.Object r3 = r4.A00
            X.7sh r3 = (X.C162757sh) r3
            java.lang.Object r2 = r4.A01
            android.os.IBinder r2 = (android.os.IBinder) r2
            monitor-enter(r3)
            r1 = 0
            if (r2 != 0) goto L_0x029a
            goto L_0x02b7
        L_0x029a:
            X.7GU r0 = new X.7GU     // Catch:{ RemoteException -> 0x02b1 }
            r0.<init>(r2)     // Catch:{ RemoteException -> 0x02b1 }
            r3.A01 = r0     // Catch:{ RemoteException -> 0x02b1 }
            r0 = 2
            r3.A00 = r0     // Catch:{ all -> 0x02be }
            X.7iS r0 = r3.A05     // Catch:{ all -> 0x02be }
            java.util.concurrent.ScheduledExecutorService r1 = r0.A03     // Catch:{ all -> 0x02be }
            X.8Lx r0 = new X.8Lx     // Catch:{ all -> 0x02be }
            r0.<init>(r3)     // Catch:{ all -> 0x02be }
            r1.execute(r0)     // Catch:{ all -> 0x02be }
            goto L_0x02bc
        L_0x02b1:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x02be }
            goto L_0x02b9
        L_0x02b7:
            java.lang.String r0 = "Null service connection"
        L_0x02b9:
            r3.A01(r1, r0)     // Catch:{ all -> 0x02be }
        L_0x02bc:
            monitor-exit(r3)     // Catch:{ all -> 0x02be }
            return
        L_0x02be:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x02be }
            throw r0
        L_0x02c1:
            java.lang.Object r6 = r4.A00
            X.7sh r6 = (X.C162757sh) r6
            java.lang.Object r0 = r4.A01
            X.7ay r0 = (X.C153277ay) r0
            int r5 = r0.A00
            monitor-enter(r6)
            android.util.SparseArray r4 = r6.A03     // Catch:{ all -> 0x05bb }
            java.lang.Object r3 = r4.get(r5)     // Catch:{ all -> 0x05bb }
            X.7ay r3 = (X.C153277ay) r3     // Catch:{ all -> 0x05bb }
            if (r3 == 0) goto L_0x02f9
            java.lang.String r2 = "MessengerIpcClient"
            r0 = 31
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x05bb }
            r1.<init>(r0)     // Catch:{ all -> 0x05bb }
            java.lang.String r0 = "Timing out request: "
            java.lang.String r0 = X.AnonymousClass000.A0Y(r0, r1, r5)     // Catch:{ all -> 0x05bb }
            android.util.Log.w(r2, r0)     // Catch:{ all -> 0x05bb }
            r4.remove(r5)     // Catch:{ all -> 0x05bb }
            java.lang.String r2 = "Timed out waiting for response"
            r1 = 3
            X.6yy r0 = new X.6yy     // Catch:{ all -> 0x05bb }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x05bb }
            r3.A01(r0)     // Catch:{ all -> 0x05bb }
            r6.A00()     // Catch:{ all -> 0x05bb }
        L_0x02f9:
            monitor-exit(r6)
            return
        L_0x02fb:
            java.lang.Object r3 = r4.A00
            X.7TR r3 = (X.AnonymousClass7TR) r3
            java.lang.Object r0 = r4.A01
            android.content.Intent r0 = (android.content.Intent) r0
            java.lang.String r2 = r0.getAction()
            java.lang.String r0 = java.lang.String.valueOf(r2)
            int r0 = r0.length()
            int r0 = r0 + 61
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = "Service took too long to process intent: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " App may get closed."
            java.lang.String r1 = X.AnonymousClass000.A0X(r0, r1)
            java.lang.String r0 = "FirebaseInstanceId"
            android.util.Log.w(r0, r1)
            r3.A00()
            return
        L_0x032d:
            java.lang.Object r1 = r4.A00
            X.2vB r1 = (X.C58392vB) r1
            java.lang.Object r0 = r4.A01
            X.4FO r0 = (X.AnonymousClass4FO) r0
            com.whatsapp.AbstractAppShellDelegate.lambda$queueAsyncInit$5(r1, r0)
            return
        L_0x0339:
            java.lang.Object r1 = r4.A00
            X.48y r1 = (X.C835748y) r1
            java.lang.Object r0 = r4.A01
            java.util.Set r0 = (java.util.Set) r0
            r1.BQl(r0)
            return
        L_0x0345:
            java.lang.Object r3 = r4.A00
            X.5ZE r3 = (X.AnonymousClass5ZE) r3
            java.lang.Object r2 = r4.A01
            android.view.animation.Animation r2 = (android.view.animation.Animation) r2
            android.widget.TextView r1 = r3.A01
            r0 = 8
            r1.setVisibility(r0)
            android.widget.TextView r0 = r3.A01
            r0.startAnimation(r2)
            return
        L_0x035a:
            java.lang.Object r5 = r4.A00
            X.3Go r5 = (X.C65193Go) r5
            java.lang.Object r4 = r4.A01
            X.1mV r4 = (X.C30471mV) r4
            X.2pR r6 = r5.A0b
            X.36Y r2 = r5.A0X
            X.2hp r1 = r5.A0v
            X.2Yl r0 = r5.A0w
            int r0 = X.AnonymousClass29K.A01(r2, r4, r1, r0)
            int r9 = X.AnonymousClass368.A02(r4)
            X.2ZV r11 = r5.A0N
            r10 = 0
            X.C162457s7.A0J(r4, r10)
            boolean r1 = r4 instanceof X.AnonymousClass1nF
            if (r1 == 0) goto L_0x0389
            long r1 = r4.A00
            r7 = 1000000(0xf4240, double:4.940656E-318)
            long r1 = r1 / r7
            r7 = 100
            int r3 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            r1 = 1
            if (r3 > 0) goto L_0x038a
        L_0x0389:
            r1 = 0
        L_0x038a:
            X.2ss r3 = r11.A00
            X.2z0 r2 = r4.A1J
            X.4uZ r7 = r2.A00
            boolean r14 = r3.A0N(r7)
            monitor-enter(r6)
            long r20 = r6.A01()     // Catch:{ all -> 0x05bb }
            int r18 = r6.A00()     // Catch:{ all -> 0x05bb }
            X.7jI r11 = r6.A04     // Catch:{ all -> 0x05bb }
            r22 = r11
            r23 = r0
            r24 = r18
            r25 = r9
            r26 = r20
            r28 = r10
            X.7n9 r8 = r22.A00(r23, r24, r25, r26, r28)     // Catch:{ all -> 0x05bb }
            long r2 = r8.A04     // Catch:{ all -> 0x05bb }
            r12 = 1
            long r2 = r2 + r12
            r8.A04 = r2     // Catch:{ all -> 0x05bb }
            r19 = r9
            r22 = r10
            r15 = r11
            r16 = r8
            r17 = r0
            r15.A01(r16, r17, r18, r19, r20, r22)     // Catch:{ all -> 0x05bb }
            X.2YQ r2 = r6.A05     // Catch:{ all -> 0x05bb }
            X.7aI r8 = r2.A01     // Catch:{ all -> 0x05bb }
            X.33B r15 = r8.A00()     // Catch:{ all -> 0x05bb }
            r2 = 1
            if (r9 == r2) goto L_0x04b3
            r2 = 2
            if (r9 == r2) goto L_0x041c
            r17 = 0
            long r2 = r15.A0I     // Catch:{ all -> 0x05bb }
            long r2 = r2 + r12
            r16 = -1073741825(0xffffffffbfffffff, float:-1.9999999)
            r21 = r17
            r23 = r17
            r25 = r17
            r27 = r17
            r29 = r17
            r31 = r17
            r33 = r17
            r35 = r17
            r37 = r17
            r39 = r17
            r41 = r17
            r43 = r17
            r45 = r17
            r47 = r17
            r49 = r17
            r51 = r17
            r53 = r17
            r55 = r17
            r57 = r17
            r59 = r17
            r61 = r17
            r63 = r17
            r65 = r17
            r67 = r17
            r69 = r17
            r71 = r17
            r73 = r17
            r75 = r17
            r79 = r17
            r19 = r17
            r77 = r2
            X.33B r9 = X.AnonymousClass33B.A00(r15, r16, r17, r19, r21, r23, r25, r27, r29, r31, r33, r35, r37, r39, r41, r43, r45, r47, r49, r51, r53, r55, r57, r59, r61, r63, r65, r67, r69, r71, r73, r75, r77, r79)     // Catch:{ all -> 0x05bb }
            goto L_0x04fd
        L_0x041c:
            r17 = 0
            if (r14 == 0) goto L_0x046a
            long r2 = r15.A0D     // Catch:{ all -> 0x05bb }
            long r2 = r2 + r12
            r16 = -67108865(0xfffffffffbffffff, float:-2.6584558E36)
            r21 = r17
            r23 = r17
            r25 = r17
            r27 = r17
            r29 = r17
            r31 = r17
            r33 = r17
            r35 = r17
            r37 = r17
            r39 = r17
            r41 = r17
            r43 = r17
            r45 = r17
            r47 = r17
            r49 = r17
            r51 = r17
            r53 = r17
            r55 = r17
            r57 = r17
            r59 = r17
            r61 = r17
            r63 = r17
            r65 = r17
            r67 = r17
            r71 = r17
            r73 = r17
            r75 = r17
            r77 = r17
            r79 = r17
            r19 = r17
            r69 = r2
            X.33B r9 = X.AnonymousClass33B.A00(r15, r16, r17, r19, r21, r23, r25, r27, r29, r31, r33, r35, r37, r39, r41, r43, r45, r47, r49, r51, r53, r55, r57, r59, r61, r63, r65, r67, r69, r71, r73, r75, r77, r79)     // Catch:{ all -> 0x05bb }
            goto L_0x04fd
        L_0x046a:
            long r2 = r15.A0G     // Catch:{ all -> 0x05bb }
            long r2 = r2 + r12
            r16 = -268435457(0xffffffffefffffff, float:-1.5845632E29)
            r21 = r17
            r23 = r17
            r25 = r17
            r27 = r17
            r29 = r17
            r31 = r17
            r33 = r17
            r35 = r17
            r37 = r17
            r39 = r17
            r41 = r17
            r43 = r17
            r45 = r17
            r47 = r17
            r49 = r17
            r51 = r17
            r53 = r17
            r55 = r17
            r57 = r17
            r59 = r17
            r61 = r17
            r63 = r17
            r65 = r17
            r67 = r17
            r69 = r17
            r71 = r17
            r75 = r17
            r77 = r17
            r79 = r17
            r19 = r17
            r73 = r2
            X.33B r9 = X.AnonymousClass33B.A00(r15, r16, r17, r19, r21, r23, r25, r27, r29, r31, r33, r35, r37, r39, r41, r43, r45, r47, r49, r51, r53, r55, r57, r59, r61, r63, r65, r67, r69, r71, r73, r75, r77, r79)     // Catch:{ all -> 0x05bb }
            goto L_0x04fd
        L_0x04b3:
            r17 = 0
            long r2 = r15.A0B     // Catch:{ all -> 0x05bb }
            long r2 = r2 + r12
            r16 = -16777217(0xfffffffffeffffff, float:-1.7014117E38)
            r21 = r17
            r23 = r17
            r25 = r17
            r27 = r17
            r29 = r17
            r31 = r17
            r33 = r17
            r35 = r17
            r37 = r17
            r39 = r17
            r41 = r17
            r43 = r17
            r45 = r17
            r47 = r17
            r49 = r17
            r51 = r17
            r53 = r17
            r55 = r17
            r57 = r17
            r59 = r17
            r61 = r17
            r63 = r17
            r67 = r17
            r69 = r17
            r71 = r17
            r73 = r17
            r75 = r17
            r77 = r17
            r79 = r17
            r19 = r17
            r65 = r2
            X.33B r9 = X.AnonymousClass33B.A00(r15, r16, r17, r19, r21, r23, r25, r27, r29, r31, r33, r35, r37, r39, r41, r43, r45, r47, r49, r51, r53, r55, r57, r59, r61, r63, r65, r67, r69, r71, r73, r75, r77, r79)     // Catch:{ all -> 0x05bb }
        L_0x04fd:
            r2 = 2
            if (r0 == r2) goto L_0x0543
            r2 = 3
            if (r0 == r2) goto L_0x052b
            r2 = 4
            if (r0 == r2) goto L_0x0557
            r2 = 5
            if (r0 == r2) goto L_0x0557
            r2 = 8
            if (r0 != r2) goto L_0x056f
            long r2 = r9.A08     // Catch:{ all -> 0x05bb }
            long r0 = (long) r1     // Catch:{ all -> 0x05bb }
            long r2 = r2 + r0
            long r0 = r9.A05     // Catch:{ all -> 0x05bb }
            long r0 = r0 + r12
            r10 = -20481(0xffffffffffffafff, float:NaN)
            r11 = 0
            r13 = 0
            r15 = 0
            r65 = 0
            r69 = 0
            r73 = 0
            r35 = r0
            r39 = r2
            X.33B r15 = X.AnonymousClass33B.A00(r9, r10, r11, r13, r15, r17, r19, r21, r23, r25, r27, r29, r31, r33, r35, r37, r39, r41, r43, r45, r47, r49, r51, r53, r55, r57, r59, r61, r63, r65, r67, r69, r71, r73)     // Catch:{ all -> 0x05bb }
            goto L_0x056f
        L_0x052b:
            long r0 = r9.A0U     // Catch:{ all -> 0x05bb }
            long r0 = r0 + r12
            r10 = -65
            r11 = 0
            r13 = 0
            r15 = 0
            r65 = 0
            r69 = 0
            r73 = 0
            r23 = r0
            X.33B r15 = X.AnonymousClass33B.A00(r9, r10, r11, r13, r15, r17, r19, r21, r23, r25, r27, r29, r31, r33, r35, r37, r39, r41, r43, r45, r47, r49, r51, r53, r55, r57, r59, r61, r63, r65, r67, r69, r71, r73)     // Catch:{ all -> 0x05bb }
            goto L_0x056f
        L_0x0543:
            long r0 = r9.A0M     // Catch:{ all -> 0x05bb }
            long r0 = r0 + r12
            r10 = -2
            r13 = 0
            r15 = 0
            r65 = 0
            r69 = 0
            r73 = 0
            r11 = r0
            X.33B r15 = X.AnonymousClass33B.A00(r9, r10, r11, r13, r15, r17, r19, r21, r23, r25, r27, r29, r31, r33, r35, r37, r39, r41, r43, r45, r47, r49, r51, r53, r55, r57, r59, r61, r63, r65, r67, r69, r71, r73)     // Catch:{ all -> 0x05bb }
            goto L_0x056f
        L_0x0557:
            long r0 = r9.A01     // Catch:{ all -> 0x05bb }
            long r0 = r0 + r12
            r10 = -262145(0xfffffffffffbffff, float:NaN)
            r11 = 0
            r13 = 0
            r15 = 0
            r65 = 0
            r69 = 0
            r73 = 0
            r47 = r0
            X.33B r15 = X.AnonymousClass33B.A00(r9, r10, r11, r13, r15, r17, r19, r21, r23, r25, r27, r29, r31, r33, r35, r37, r39, r41, r43, r45, r47, r49, r51, r53, r55, r57, r59, r61, r63, r65, r67, r69, r71, r73)     // Catch:{ all -> 0x05bb }
        L_0x056f:
            r8.A02(r15)     // Catch:{ all -> 0x05bb }
            monitor-exit(r6)
            X.2ny r1 = r5.A0f
            boolean r0 = r1.A01(r4)
            if (r0 == 0) goto L_0x0581
            X.2iO r1 = r1.A06
            r0 = 1
            r1.A01(r4, r0)
        L_0x0581:
            boolean r0 = r4.A1W
            if (r0 == 0) goto L_0x05a1
            boolean r0 = r4 instanceof X.AnonymousClass1nE
            if (r0 == 0) goto L_0x05a1
            X.1VX r2 = r5.A0Y
            r1 = 1829(0x725, float:2.563E-42)
            X.2vE r0 = X.C58422vE.A02
            int r0 = r2.A0O(r0, r1)
            if (r0 <= 0) goto L_0x05a1
            X.3XH r2 = r5.A0d
            r1 = 1
            X.4IX r0 = new X.4IX
            r0.<init>(r5, r1, r4)
            r2.A00(r0, r4, r1, r1)
            return
        L_0x05a1:
            boolean r0 = r7 instanceof X.C95804uY
            if (r0 == 0) goto L_0x05b5
            X.8qC r0 = r5.A19
            java.lang.Object r1 = r0.get()
            X.5UP r1 = (X.AnonymousClass5UP) r1
            r0 = 3
            boolean r0 = r1.A03(r0)
            if (r0 != 0) goto L_0x05b5
            return
        L_0x05b5:
            X.3XH r0 = r5.A0d
            r0.A01(r4)
            return
        L_0x05bb:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        L_0x05be:
            java.lang.Object r0 = r4.A00
            X.3Go r0 = (X.C65193Go) r0
            java.lang.Object r1 = r4.A01
            X.3ZH r1 = (X.AnonymousClass3ZH) r1
            X.3Ex r0 = r0.A0C
            r0.A0N(r1)
            return
        L_0x05cc:
            java.lang.Object r0 = r4.A00
            X.3Go r0 = (X.C65193Go) r0
            java.lang.Object r1 = r4.A01
            X.34x r1 = (X.C624134x) r1
            X.9R2 r0 = r0.A0s
            X.1n7 r1 = (X.C30791n7) r1
            r0.A00(r1)
            return
        L_0x05dc:
            java.lang.Object r0 = r4.A00
            X.3Go r0 = (X.C65193Go) r0
            java.lang.Object r1 = r4.A01
            X.34x r1 = (X.C624134x) r1
            X.9Th r0 = r0.A0r
            r0.A02(r1)
            return
        L_0x05ea:
            java.lang.Object r2 = r4.A00
            X.3Go r2 = (X.C65193Go) r2
            java.lang.Object r1 = r4.A01
            X.34x r1 = (X.C624134x) r1
            X.8qC r0 = r2.A16
            java.lang.Object r0 = r0.get()
            X.3Dg r0 = (X.C64383Dg) r0
            r0.A00(r1)
            X.1VX r1 = r2.A0Y
            r0 = 508(0x1fc, float:7.12E-43)
            r1.A0X(r0)
            return
        L_0x0605:
            java.lang.Object r0 = r4.A00
            X.36E r0 = (X.AnonymousClass36E) r0
            java.lang.Object r1 = r4.A01
            X.34x r1 = (X.C624134x) r1
            X.2pR r3 = r0.A0K
            X.2ZV r0 = r0.A07
            X.2nt r2 = r0.A00(r1)
            monitor-enter(r3)
            int r1 = r3.A00()     // Catch:{ all -> 0x0621 }
            X.2YQ r0 = r3.A05     // Catch:{ all -> 0x0621 }
            r0.A00(r2, r1)     // Catch:{ all -> 0x0621 }
            monitor-exit(r3)
            return
        L_0x0621:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x0624:
            java.lang.Object r0 = r4.A00
            X.36E r0 = (X.AnonymousClass36E) r0
            java.lang.Object r3 = r4.A01
            X.34x r3 = (X.C624134x) r3
            X.2pR r2 = r0.A0K
            X.2ZV r1 = r0.A07
            r0 = 0
            X.C162457s7.A0J(r3, r0)
            int r6 = X.AnonymousClass368.A02(r3)
            X.2ss r1 = r1.A00
            X.2z0 r0 = r3.A1J
            X.4uZ r0 = r0.A00
            boolean r1 = r1.A0N(r0)
            monitor-enter(r2)
            X.2YQ r0 = r2.A05     // Catch:{ all -> 0x078f }
            X.7aI r3 = r0.A01     // Catch:{ all -> 0x078f }
            X.33B r7 = r3.A00()     // Catch:{ all -> 0x078f }
            r0 = 1
            r4 = 1
            if (r6 == r0) goto L_0x06e9
            r0 = 2
            if (r6 == r0) goto L_0x069c
            r9 = 0
            long r0 = r7.A0I     // Catch:{ all -> 0x078f }
            long r0 = r0 + r4
            r8 = -1073741825(0xffffffffbfffffff, float:-1.9999999)
            r13 = r9
            r15 = r9
            r17 = r9
            r19 = r9
            r21 = r9
            r23 = r9
            r25 = r9
            r27 = r9
            r29 = r9
            r31 = r9
            r33 = r9
            r35 = r9
            r37 = r9
            r39 = r9
            r41 = r9
            r43 = r9
            r45 = r9
            r47 = r9
            r49 = r9
            r51 = r9
            r53 = r9
            r55 = r9
            r57 = r9
            r59 = r9
            r61 = r9
            r63 = r9
            r65 = r9
            r67 = r9
            r71 = r9
            r11 = r9
            r69 = r0
            X.33B r7 = X.AnonymousClass33B.A00(r7, r8, r9, r11, r13, r15, r17, r19, r21, r23, r25, r27, r29, r31, r33, r35, r37, r39, r41, r43, r45, r47, r49, r51, r53, r55, r57, r59, r61, r63, r65, r67, r69, r71)     // Catch:{ all -> 0x078f }
            goto L_0x0776
        L_0x069c:
            r9 = 0
            if (r1 == 0) goto L_0x06a2
            goto L_0x0731
        L_0x06a2:
            long r0 = r7.A0G     // Catch:{ all -> 0x078f }
            long r0 = r0 + r4
            r8 = -268435457(0xffffffffefffffff, float:-1.5845632E29)
            r13 = r9
            r15 = r9
            r17 = r9
            r19 = r9
            r21 = r9
            r23 = r9
            r25 = r9
            r27 = r9
            r29 = r9
            r31 = r9
            r33 = r9
            r35 = r9
            r37 = r9
            r39 = r9
            r41 = r9
            r43 = r9
            r45 = r9
            r47 = r9
            r49 = r9
            r51 = r9
            r53 = r9
            r55 = r9
            r57 = r9
            r59 = r9
            r61 = r9
            r63 = r9
            r67 = r9
            r69 = r9
            r71 = r9
            r11 = r9
            r65 = r0
            X.33B r7 = X.AnonymousClass33B.A00(r7, r8, r9, r11, r13, r15, r17, r19, r21, r23, r25, r27, r29, r31, r33, r35, r37, r39, r41, r43, r45, r47, r49, r51, r53, r55, r57, r59, r61, r63, r65, r67, r69, r71)     // Catch:{ all -> 0x078f }
            goto L_0x0776
        L_0x06e9:
            r9 = 0
            long r0 = r7.A0B     // Catch:{ all -> 0x078f }
            long r0 = r0 + r4
            r8 = -16777217(0xfffffffffeffffff, float:-1.7014117E38)
            r13 = r9
            r15 = r9
            r17 = r9
            r19 = r9
            r21 = r9
            r23 = r9
            r25 = r9
            r27 = r9
            r29 = r9
            r31 = r9
            r33 = r9
            r35 = r9
            r37 = r9
            r39 = r9
            r41 = r9
            r43 = r9
            r45 = r9
            r47 = r9
            r49 = r9
            r51 = r9
            r53 = r9
            r55 = r9
            r59 = r9
            r61 = r9
            r63 = r9
            r65 = r9
            r67 = r9
            r69 = r9
            r71 = r9
            r11 = r9
            r57 = r0
            X.33B r7 = X.AnonymousClass33B.A00(r7, r8, r9, r11, r13, r15, r17, r19, r21, r23, r25, r27, r29, r31, r33, r35, r37, r39, r41, r43, r45, r47, r49, r51, r53, r55, r57, r59, r61, r63, r65, r67, r69, r71)     // Catch:{ all -> 0x078f }
            goto L_0x0776
        L_0x0731:
            long r0 = r7.A0D     // Catch:{ all -> 0x078f }
            long r0 = r0 + r4
            r8 = -67108865(0xfffffffffbffffff, float:-2.6584558E36)
            r13 = r9
            r15 = r9
            r17 = r9
            r19 = r9
            r21 = r9
            r23 = r9
            r25 = r9
            r27 = r9
            r29 = r9
            r31 = r9
            r33 = r9
            r35 = r9
            r37 = r9
            r39 = r9
            r41 = r9
            r43 = r9
            r45 = r9
            r47 = r9
            r49 = r9
            r51 = r9
            r53 = r9
            r55 = r9
            r57 = r9
            r59 = r9
            r63 = r9
            r65 = r9
            r67 = r9
            r69 = r9
            r71 = r9
            r11 = r9
            r61 = r0
            X.33B r7 = X.AnonymousClass33B.A00(r7, r8, r9, r11, r13, r15, r17, r19, r21, r23, r25, r27, r29, r31, r33, r35, r37, r39, r41, r43, r45, r47, r49, r51, r53, r55, r57, r59, r61, r63, r65, r67, r69, r71)     // Catch:{ all -> 0x078f }
        L_0x0776:
            long r0 = r7.A0P     // Catch:{ all -> 0x078f }
            long r0 = r0 + r4
            r8 = -4194305(0xffffffffffbfffff, float:NaN)
            r57 = r9
            r61 = r9
            r65 = r9
            r69 = r9
            r53 = r0
            X.33B r0 = X.AnonymousClass33B.A00(r7, r8, r9, r11, r13, r15, r17, r19, r21, r23, r25, r27, r29, r31, r33, r35, r37, r39, r41, r43, r45, r47, r49, r51, r53, r55, r57, r59, r61, r63, r65, r67, r69, r71)     // Catch:{ all -> 0x078f }
            r3.A02(r0)     // Catch:{ all -> 0x078f }
            monitor-exit(r2)
            return
        L_0x078f:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x0792:
            java.lang.Object r1 = r4.A00
            com.whatsapp.SecondaryProcessAbstractAppShellDelegate r1 = (com.whatsapp.SecondaryProcessAbstractAppShellDelegate) r1
            java.lang.Object r0 = r4.A01
            X.47u r0 = (X.AnonymousClass47u) r0
            r1.lambda$onCreate$0(r0)
            return
        L_0x079e:
            java.lang.Object r0 = r4.A00
            X.5Ul r0 = (X.AnonymousClass5Ul) r0
            java.lang.Object r1 = r4.A01
            X.6zK r1 = (X.C143696zK) r1
            X.5TD r0 = r0.A0M
            r0.A02(r1)
            return
        L_0x07ac:
            java.lang.Object r1 = r4.A00
            X.8tZ r1 = (X.C185388tZ) r1
            java.lang.Object r0 = r4.A01
            android.net.Uri r0 = (android.net.Uri) r0
            r1.Bf4(r0)
            return
        L_0x07b8:
            java.lang.Object r2 = r4.A00
            X.2bO r2 = (X.C46292bO) r2
            java.lang.Object r0 = r4.A01
            java.util.ArrayList r1 = X.C18300x5.A0s(r0)
            X.3Ex r0 = r2.A03
            r0.A0g(r1)
            return
        L_0x07c8:
            java.lang.Object r0 = r4.A00
            X.33m r0 = (X.C621033m) r0
            java.lang.Object r3 = r4.A01
            X.34x r3 = (X.C624134x) r3
            X.1io r2 = r0.A0u
            X.2z0 r0 = r3.A1J
            boolean r1 = r0.A02
            r0 = 25
            if (r1 == 0) goto L_0x07dc
            r0 = 9
        L_0x07dc:
            r2.A0C(r3, r0)
            return
        L_0x07e0:
            java.lang.Object r1 = r4.A00
            X.33m r1 = (X.C621033m) r1
            java.lang.Object r0 = r4.A01
            X.1mK r0 = (X.C30361mK) r0
            r1.A0X(r0)
            return
        L_0x07ec:
            java.lang.Object r0 = r4.A00
            X.33m r0 = (X.C621033m) r0
            java.lang.Object r2 = r4.A01
            java.util.Collection r2 = (java.util.Collection) r2
            X.7am r1 = r0.A0F
            r0 = 4
            goto L_0x0855
        L_0x07f8:
            java.lang.Object r0 = r4.A00
            X.33m r0 = (X.C621033m) r0
            java.lang.Object r1 = r4.A01
            X.4uZ r1 = (X.C95814uZ) r1
            X.1hw r0 = r0.A0k
            r0.A0A(r1)
            return
        L_0x0806:
            java.lang.Object r3 = r4.A00
            X.33m r3 = (X.C621033m) r3
            java.lang.Object r6 = r4.A01
            X.1fH r6 = (X.C27981fH) r6
            X.3Gp r2 = r3.A0L
            X.2j3 r1 = r2.A0c
            java.lang.String r0 = "shareOwnPn"
            X.2sc r1 = r1.A00(r0)
            X.1Oe r1 = (X.C22471Oe) r1
            if (r1 == 0) goto L_0x0845
            boolean r0 = r2.A0Q()
            if (r0 == 0) goto L_0x0845
            r0 = 0
            X.C162457s7.A0J(r6, r0)
            X.2sH r0 = r1.A00
            long r8 = r0.A0H()
            r5 = 0
            X.1SQ r4 = new X.1SQ
            r7 = r5
            r4.<init>(r5, r6, r7, r8)
            java.util.Set r0 = java.util.Collections.singleton(r4)
            java.util.Set r1 = r2.A0B(r0)
        L_0x083c:
            X.311 r0 = r3.A0z
            r0.A05(r6)
            r2.A0O(r1)
            return
        L_0x0845:
            java.util.Set r1 = java.util.Collections.emptySet()
            goto L_0x083c
        L_0x084a:
            java.lang.Object r0 = r4.A00
            X.33m r0 = (X.C621033m) r0
            java.lang.Object r2 = r4.A01
            java.util.Collection r2 = (java.util.Collection) r2
            X.7am r1 = r0.A0F
            r0 = 0
        L_0x0855:
            r1.A04(r2, r0)
            return
        L_0x0859:
            java.lang.Object r5 = r4.A00
            X.33m r5 = (X.C621033m) r5
            java.lang.Object r3 = r4.A01
            X.34x r3 = (X.C624134x) r3
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "UserActions/userActionViewViewOnceMessage/"
            r2.append(r0)
            long r0 = r3.A1L
            X.C18260x0.A1I(r2, r0)
            X.2q7 r0 = r5.A0y
            r0.A03(r3)
            X.3Wi r1 = r5.A02
            r0 = 30
            X.C69263Wi.A0B(r1, r3, r5, r0)
            return
        L_0x087c:
            java.lang.Object r0 = r4.A00
            X.33m r0 = (X.C621033m) r0
            java.lang.Object r3 = r4.A01
            X.34x r3 = (X.C624134x) r3
            X.2pR r4 = r0.A1L
            X.36Y r2 = r0.A13
            X.2hp r1 = r0.A1e
            X.2Yl r0 = r0.A1f
            int r7 = X.AnonymousClass29K.A01(r2, r3, r1, r0)
            int r9 = X.AnonymousClass368.A02(r3)
            monitor-enter(r4)
            long r10 = r4.A01()     // Catch:{ all -> 0x0906 }
            int r8 = r4.A00()     // Catch:{ all -> 0x0906 }
            X.7jI r5 = r4.A04     // Catch:{ all -> 0x0906 }
            r12 = 0
            r13 = r5
            r14 = r7
            r15 = r8
            r16 = r9
            r17 = r10
            r19 = r12
            X.7n9 r6 = r13.A00(r14, r15, r16, r17, r19)     // Catch:{ all -> 0x0906 }
            long r0 = r6.A06     // Catch:{ all -> 0x0906 }
            r2 = 1
            long r0 = r0 + r2
            r6.A06 = r0     // Catch:{ all -> 0x0906 }
            goto L_0x0901
        L_0x08b5:
            java.lang.Object r0 = r4.A00
            X.33m r0 = (X.C621033m) r0
            java.lang.Object r4 = r4.A01
            X.7am r3 = r0.A0F
            r2 = 1
            X.34x[] r1 = new X.C624134x[r2]
            r0 = 0
            java.util.List r0 = X.AnonymousClass0x9.A1A(r4, r1, r0)
            r3.A04(r0, r2)
            return
        L_0x08c9:
            java.lang.Object r0 = r4.A00
            X.33m r0 = (X.C621033m) r0
            java.lang.Object r3 = r4.A01
            X.34x r3 = (X.C624134x) r3
            X.2pR r4 = r0.A1L
            X.36Y r2 = r0.A13
            X.2hp r1 = r0.A1e
            X.2Yl r0 = r0.A1f
            int r7 = X.AnonymousClass29K.A01(r2, r3, r1, r0)
            int r9 = X.AnonymousClass368.A02(r3)
            monitor-enter(r4)
            long r10 = r4.A01()     // Catch:{ all -> 0x0906 }
            int r8 = r4.A00()     // Catch:{ all -> 0x0906 }
            X.7jI r5 = r4.A04     // Catch:{ all -> 0x0906 }
            r12 = 0
            r13 = r5
            r14 = r7
            r15 = r8
            r16 = r9
            r17 = r10
            r19 = r12
            X.7n9 r6 = r13.A00(r14, r15, r16, r17, r19)     // Catch:{ all -> 0x0906 }
            long r0 = r6.A03     // Catch:{ all -> 0x0906 }
            r2 = 1
            long r0 = r0 + r2
            r6.A03 = r0     // Catch:{ all -> 0x0906 }
        L_0x0901:
            r5.A01(r6, r7, r8, r9, r10, r12)     // Catch:{ all -> 0x0906 }
            monitor-exit(r4)
            return
        L_0x0906:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x0909:
            java.lang.Object r1 = r4.A00
            X.4ei r1 = (X.C89684ei) r1
            java.lang.Object r0 = r4.A01
            android.view.View r0 = (android.view.View) r0
            r0.getViewTreeObserver().removeOnDrawListener(r1.A01)
            return
        L_0x0915:
            java.lang.Object r0 = r4.A00
            X.36E r0 = (X.AnonymousClass36E) r0
            X.5rC r0 = r0.A01
            r0.A04()
            java.lang.String r0 = "logMessageSendSuccessAction"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)
            throw r0
        L_0x0925:
            r1 = move-exception
            if (r2 == 0) goto L_0x0930
            r2.close()     // Catch:{ all -> 0x092c }
            goto L_0x0930
        L_0x092c:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0931 }
        L_0x0930:
            throw r1     // Catch:{ all -> 0x0931 }
        L_0x0931:
            r1 = move-exception
            if (r6 == 0) goto L_0x093c
            r6.close()     // Catch:{ all -> 0x0938 }
            throw r1
        L_0x0938:
            r0 = move-exception
            r1.addSuppressed(r0)
        L_0x093c:
            throw r1
        L_0x093d:
            return
        L_0x093e:
            r1 = move-exception
            java.lang.String r0 = "UserActions/userActionSendMediaMessages/addManagedFileReferencesIfExternalShared"
            com.whatsapp.util.Log.e(r0, r1)
            return
        L_0x0945:
            X.4xh r0 = r2.A1n
            r0.A0A(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70173a4.run():void");
    }
}
