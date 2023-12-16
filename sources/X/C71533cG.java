package X;

import com.whatsapp.mediacomposer.MediaComposerActivity;

/* renamed from: X.3cG  reason: invalid class name and case insensitive filesystem */
public class C71533cG implements Runnable {
    public Object A00;
    public final int A01;

    public C71533cG(C111445i6 r1, int i) {
        this.A01 = i;
        switch (i) {
            case 8:
            case 9:
            case 10:
                this.A00 = r1;
                return;
            default:
                this.A00 = r1;
                return;
        }
    }

    public static void A00(AnonymousClass4FS r1, Object obj, int i) {
        r1.BkM(new C71533cG(obj, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:133:0x02c2, code lost:
        if (r0.A03(r7) == false) goto L_0x02c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:321:0x08be, code lost:
        r1.A05();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:322:0x08c1, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:379:0x09f5, code lost:
        r1.A03(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:380:0x09f8, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:399:0x0aa2, code lost:
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:400:0x0aa3, code lost:
        r1.setVisibility(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:401:0x0aa6, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:438:0x0b12, code lost:
        com.whatsapp.util.Log.d(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:439:0x0b15, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:444:0x0b24, code lost:
        r0.postDelayed(r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:445:0x0b27, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r40 = this;
            r7 = r40
            int r0 = r7.A01
            switch(r0) {
                case 0: goto L_0x0711;
                case 1: goto L_0x07c5;
                case 2: goto L_0x001a;
                case 3: goto L_0x07cd;
                case 4: goto L_0x001b;
                case 5: goto L_0x0075;
                case 6: goto L_0x07d5;
                case 7: goto L_0x0085;
                case 8: goto L_0x0812;
                case 9: goto L_0x0840;
                case 10: goto L_0x00a3;
                case 11: goto L_0x0848;
                case 12: goto L_0x0868;
                case 13: goto L_0x0881;
                case 14: goto L_0x088b;
                case 15: goto L_0x088b;
                case 16: goto L_0x0897;
                case 17: goto L_0x01cd;
                case 18: goto L_0x089f;
                case 19: goto L_0x08a7;
                case 20: goto L_0x08af;
                case 21: goto L_0x08b7;
                case 22: goto L_0x08c2;
                case 23: goto L_0x0224;
                case 24: goto L_0x0007;
                case 25: goto L_0x023e;
                case 26: goto L_0x028c;
                case 27: goto L_0x02de;
                case 28: goto L_0x0902;
                case 29: goto L_0x090e;
                case 30: goto L_0x09d0;
                case 31: goto L_0x09dc;
                case 32: goto L_0x02f4;
                case 33: goto L_0x0007;
                case 34: goto L_0x09e5;
                case 35: goto L_0x09ed;
                case 36: goto L_0x09f9;
                case 37: goto L_0x0a13;
                case 38: goto L_0x02ff;
                case 39: goto L_0x0a42;
                case 40: goto L_0x0313;
                case 41: goto L_0x0a4e;
                case 42: goto L_0x0a58;
                case 43: goto L_0x0a60;
                case 44: goto L_0x0a74;
                case 45: goto L_0x05a0;
                case 46: goto L_0x06ca;
                case 47: goto L_0x0a98;
                case 48: goto L_0x0a9e;
                case 49: goto L_0x06fe;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r2 = r7.A00
            X.4EV r2 = (X.AnonymousClass4EV) r2
            r0 = 8
            X.35m r1 = new X.35m
            r1.<init>(r0)
            X.2sk r0 = new X.2sk
            r0.<init>()
            r2.BRX(r1, r0)
        L_0x001a:
            return
        L_0x001b:
            java.lang.Object r0 = r7.A00
            X.3Fb r0 = (X.C64803Fb) r0
            X.34f r8 = r0.A02
            X.314 r0 = r8.A01
            java.util.List r2 = r0.A06()
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x001a
            X.1ZK r7 = new X.1ZK
            r7.<init>()
            X.33p r0 = r8.A03
            android.content.SharedPreferences r1 = X.AnonymousClass0x2.A0F(r0)
            java.lang.String r0 = "notify_new_message_for_archived_chats"
            boolean r0 = X.C18280x3.A1W(r1, r0)
            java.lang.Boolean r0 = X.C18320x8.A0V(r0)
            r7.A00 = r0
            java.util.Iterator r9 = r2.iterator()
            r6 = 0
            r5 = 0
            r4 = 0
            r3 = 0
        L_0x004d:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0aa7
            X.4uZ r2 = X.C18300x5.A0P(r9)
            X.2ss r0 = r8.A04
            int r0 = r0.A03(r2)
            boolean r1 = X.AnonymousClass001.A1W(r0)
            com.whatsapp.jid.GroupJid r0 = X.AnonymousClass32V.A00(r2)
            if (r0 == 0) goto L_0x006e
            int r6 = r6 + 1
            if (r1 == 0) goto L_0x004d
            int r4 = r4 + 1
            goto L_0x004d
        L_0x006e:
            int r5 = r5 + 1
            if (r1 == 0) goto L_0x004d
            int r3 = r3 + 1
            goto L_0x004d
        L_0x0075:
            java.lang.Object r0 = r7.A00
            X.5n8 r0 = (X.C114495n8) r0
            X.667 r1 = r0.A01
            if (r1 == 0) goto L_0x001a
            X.2nU r0 = r0.A06
            com.whatsapp.jid.UserJid r0 = r0.A03
            r1.Bd4(r0)
            return
        L_0x0085:
            java.lang.Object r2 = r7.A00
            com.whatsapp.location.GroupChatLiveLocationsActivity2 r2 = (com.whatsapp.location.GroupChatLiveLocationsActivity2) r2
            boolean r0 = r2.A0X
            if (r0 != 0) goto L_0x001a
            X.5Uv r0 = r2.A06
            if (r0 == 0) goto L_0x001a
            com.google.android.gms.maps.model.CameraPosition r0 = r0.A02()
            float r1 = r0.A02
            r0 = 1098907648(0x41800000, float:16.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x001a
            X.5Uv r0 = r2.A06
            r0.A04()
            return
        L_0x00a3:
            java.lang.Object r7 = r7.A00
            X.5i6 r7 = (X.C111445i6) r7
            boolean r0 = r7.A1U
            android.os.Handler r3 = r7.A0v
            java.lang.Runnable r2 = r7.A1N
            if (r0 == 0) goto L_0x00b5
            r0 = 500(0x1f4, double:2.47E-321)
            r3.postDelayed(r2, r0)
            return
        L_0x00b5:
            r3.removeCallbacks(r2)
            java.util.Map r2 = r7.A1S
            monitor-enter(r2)
            java.util.ArrayList r1 = X.C18300x5.A0v(r2)     // Catch:{ all -> 0x0ae2 }
            r2.clear()     // Catch:{ all -> 0x0ae2 }
            monitor-exit(r2)     // Catch:{ all -> 0x0ae2 }
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x001a
            X.5Ww r6 = r7.A0A()
            if (r6 == 0) goto L_0x001a
            X.7Mw r5 = r7.A0k
            java.util.List r9 = r7.A1Q
            java.util.HashSet r8 = X.AnonymousClass002.A0K()
            java.util.Iterator r15 = r1.iterator()
        L_0x00db:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x0ac5
            java.lang.Object r10 = r15.next()
            X.2pX r10 = (X.C54942pX) r10
            java.util.Iterator r3 = r9.iterator()
        L_0x00eb:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x01c4
            java.lang.Object r4 = r3.next()
            X.5We r4 = (X.C105735We) r4
            java.util.List r11 = r4.A04
            java.util.Iterator r2 = r11.iterator()
        L_0x00fd:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00eb
            java.lang.Object r0 = r2.next()
            X.2pX r0 = (X.C54942pX) r0
            com.whatsapp.jid.UserJid r1 = r0.A06
            com.whatsapp.jid.UserJid r0 = r10.A06
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00fd
            int r0 = r4.A00
            r3 = 1
            if (r0 == r3) goto L_0x01c8
            X.34h r2 = r5.A02
            long r0 = r10.A05
            X.2sH r2 = r2.A04
            long r12 = X.C56612sH.A03(r2, r0)
            r1 = 600000(0x927c0, double:2.964394E-318)
            int r0 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            boolean r1 = X.AnonymousClass001.A1U(r0)
            int r0 = r4.A01
            if (r0 == r3) goto L_0x0130
            r3 = 0
        L_0x0130:
            if (r1 != r3) goto L_0x01c4
            int r1 = r11.size()
            r0 = 1
            if (r1 == r0) goto L_0x0174
            double r2 = r10.A00
            double r0 = r10.A01
            com.google.android.gms.maps.model.LatLng r10 = new com.google.android.gms.maps.model.LatLng
            r10.<init>(r2, r0)
            android.graphics.Point r14 = r6.A00(r10)
            com.google.android.gms.maps.model.LatLng r0 = r4.A00()
            android.graphics.Point r13 = r6.A00(r0)
            int r1 = r14.x
            int r0 = r13.x
            int r1 = r1 - r0
            int r0 = java.lang.Math.abs(r1)
            double r2 = (double) r0
            float r0 = r5.A00
            double r0 = (double) r0
            r11 = 4609434218613702656(0x3ff8000000000000, double:1.5)
            double r0 = r0 * r11
            int r10 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r10 >= 0) goto L_0x01c4
            int r1 = r14.y
            int r0 = r13.y
            int r1 = r1 - r0
            int r0 = java.lang.Math.abs(r1)
            double r2 = (double) r0
            float r0 = r5.A01
            double r0 = (double) r0
            double r0 = r0 * r11
            int r10 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r10 >= 0) goto L_0x01c4
        L_0x0174:
            com.google.android.gms.maps.model.LatLng r0 = r4.A00()
            android.graphics.Point r2 = r6.A00(r0)
            java.util.Iterator r11 = r9.iterator()
        L_0x0180:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x01c8
            java.lang.Object r10 = r11.next()
            X.5We r10 = (X.C105735We) r10
            if (r10 == r4) goto L_0x0180
            java.util.List r0 = r10.A04
            int r3 = r0.size()
            r0 = 2
            r1 = 1
            if (r3 > r0) goto L_0x019c
            int r0 = r10.A00
            if (r1 == r0) goto L_0x0180
        L_0x019c:
            com.google.android.gms.maps.model.LatLng r0 = r10.A00()
            android.graphics.Point r3 = r6.A00(r0)
            int r1 = r3.x
            int r0 = r2.x
            int r1 = r1 - r0
            int r0 = java.lang.Math.abs(r1)
            float r1 = (float) r0
            float r0 = r5.A00
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0180
            int r1 = r3.y
            int r0 = r2.y
            int r1 = r1 - r0
            int r0 = java.lang.Math.abs(r1)
            float r1 = (float) r0
            float r0 = r5.A01
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0180
        L_0x01c4:
            r7.A0I()
            return
        L_0x01c8:
            r8.add(r4)
            goto L_0x00db
        L_0x01cd:
            java.lang.Object r2 = r7.A00
            X.5cU r2 = (X.C108145cU) r2
            r6 = 1
            r2.A0r = r6
            android.location.Location r1 = r2.A06
            if (r1 == 0) goto L_0x01ee
            X.5dv r0 = r2.A0g
            if (r0 != 0) goto L_0x01ee
            float r0 = r1.getAccuracy()
            int r1 = (int) r0
            r0 = 100
            int r5 = java.lang.Math.max(r1, r0)
            android.location.Location r3 = r2.A06
            r4 = 0
            r7 = r6
            r2.A0J(r3, r4, r5, r6, r7)
        L_0x01ee:
            X.5ZR r0 = r2.A1B
            boolean r0 = r0.A05()
            if (r0 == 0) goto L_0x001a
            android.location.Location r0 = r2.A06
            if (r0 == 0) goto L_0x0204
            float r1 = r0.getAccuracy()
            r0 = 1128792064(0x43480000, float:200.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x001a
        L_0x0204:
            X.33i r0 = r2.A18
            android.location.LocationManager r1 = r0.A0F()
            if (r1 == 0) goto L_0x001a
            java.lang.String r0 = "gps"
            boolean r0 = r1.isProviderEnabled(r0)
            if (r0 == 0) goto L_0x021d
            java.lang.String r0 = "network"
            boolean r0 = r1.isProviderEnabled(r0)
            if (r0 != 0) goto L_0x001a
        L_0x021d:
            X.07r r1 = r2.A0X
            r0 = 2
            X.C621433s.A01(r1, r0)
            return
        L_0x0224:
            java.lang.Object r0 = r7.A00
            X.2s6 r0 = (X.C56512s6) r0
            java.util.List r0 = r0.A07
            java.util.Iterator r1 = r0.iterator()
        L_0x022e:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x001a
            java.lang.Object r0 = r1.next()
            X.49h r0 = (X.C836649h) r0
            r0.BcM()
            goto L_0x022e
        L_0x023e:
            java.lang.Object r4 = r7.A00
            X.3XH r4 = (X.AnonymousClass3XH) r4
            X.1ip r1 = r4.A03
            r0 = 1
            int r1 = r1.A08(r0)
            X.33d r2 = r4.A07
            r0 = 0
            X.4Jm r3 = new X.4Jm
            r3.<init>(r4, r1, r0)
            X.1fp r0 = r2.A0R
            r0.A03(r3)
            X.5UP r1 = r2.A0V
            boolean r0 = X.C18300x5.A1S(r1)
            if (r0 == 0) goto L_0x001a
            r0 = 3
            boolean r0 = r1.A03(r0)
            if (r0 != 0) goto L_0x026c
            r0 = 2
            boolean r0 = r1.A03(r0)
            if (r0 == 0) goto L_0x001a
        L_0x026c:
            X.1fq r1 = r2.A0S
            monitor-enter(r1)
            java.util.Map r0 = r1.A01     // Catch:{ all -> 0x0ae5 }
            java.util.HashSet r0 = X.C18310x6.A0s(r0)     // Catch:{ all -> 0x0ae5 }
            monitor-exit(r1)
            java.util.Iterator r2 = r0.iterator()
        L_0x027a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x001a
            java.lang.Object r1 = r2.next()
            boolean r0 = r1 instanceof X.C30471mV
            if (r0 == 0) goto L_0x027a
            r3.AwB(r1)
            goto L_0x027a
        L_0x028c:
            java.lang.Object r2 = r7.A00
            X.3XH r2 = (X.AnonymousClass3XH) r2
            java.util.ArrayList r1 = r2.A0B
            monitor-enter(r1)
            java.util.ArrayList r3 = X.AnonymousClass002.A0J(r1)     // Catch:{ all -> 0x0ae8 }
            r1.clear()     // Catch:{ all -> 0x0ae8 }
            monitor-exit(r1)     // Catch:{ all -> 0x0ae8 }
            X.1ip r1 = r2.A03
            r0 = 0
            int r1 = r1.A08(r0)
            java.util.Iterator r4 = r3.iterator()
        L_0x02a6:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x001a
            java.lang.Object r3 = r4.next()
            X.2RN r3 = (X.AnonymousClass2RN) r3
            int r8 = r3.A00
            r0 = 1
            if (r8 == r0) goto L_0x02ba
            r0 = 3
            if (r8 != r0) goto L_0x02c4
        L_0x02ba:
            X.2qZ r0 = r2.A06
            X.1mV r7 = r3.A03
            boolean r0 = r0.A03(r7)
            if (r0 != 0) goto L_0x02d1
        L_0x02c4:
            r0 = 2
            if (r8 != r0) goto L_0x02a6
            X.2qZ r0 = r2.A06
            X.1mV r7 = r3.A03
            boolean r0 = r0.A04(r7, r1)
            if (r0 == 0) goto L_0x02a6
        L_0x02d1:
            X.33d r5 = r2.A07
            X.4EV r6 = r3.A02
            long r9 = r3.A01
            boolean r11 = r3.A04
            r12 = 1
            r5.A08(r6, r7, r8, r9, r11, r12)
            goto L_0x02a6
        L_0x02de:
            java.lang.Object r0 = r7.A00
            X.3XH r0 = (X.AnonymousClass3XH) r0
            boolean r2 = r0.A00
            if (r2 == 0) goto L_0x001a
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "mediaautodownload/timeout getting offline complete marker "
            java.lang.String r0 = X.AnonymousClass000.A0b(r0, r1, r2)
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return
        L_0x02f4:
            java.lang.Object r6 = r7.A00
            X.1I7 r6 = (X.AnonymousClass1I7) r6
            java.io.File r5 = r6.A03
            if (r5 == 0) goto L_0x001a
            monitor-enter(r5)
            goto L_0x0aeb
        L_0x02ff:
            java.lang.Object r2 = r7.A00
            X.5nf r2 = (X.C114825nf) r2
            X.5Ol r0 = r2.A0O
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x001a
            X.5Uj r1 = r2.A0V
            r0 = 1
            r1.A07(r0)
            r2.A02()
            return
        L_0x0313:
            java.lang.Object r8 = r7.A00
            com.whatsapp.mediacomposer.MediaComposerActivity r8 = (com.whatsapp.mediacomposer.MediaComposerActivity) r8
            boolean r0 = r8.A1f
            if (r0 == 0) goto L_0x001a
            boolean r0 = r8.A1U
            if (r0 == 0) goto L_0x001a
            java.lang.String r0 = "MediaComposerActivity/start enqueue optimistic uploads"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            X.5Us r0 = r8.A0t
            X.08M r0 = r0.A01
            java.lang.Object r0 = r0.A07()
            java.util.Collection r0 = (java.util.Collection) r0
            X.4uZ r0 = X.C627336j.A03(r0)
            boolean r7 = X.AnonymousClass000.A1W(r0)
            X.5Us r0 = r8.A0t
            X.08M r0 = r0.A01
            java.lang.Object r0 = r0.A07()
            java.util.Collection r0 = (java.util.Collection) r0
            java.util.Iterator r1 = r0.iterator()
        L_0x0344:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x059d
            java.lang.Object r0 = r1.next()
            boolean r0 = r0 instanceof X.C135166kE
            if (r0 != 0) goto L_0x0344
            r6 = 1
        L_0x0353:
            X.5Us r0 = r8.A0t
            X.08M r0 = r0.A03
            java.lang.Object r0 = r0.A07()
            java.util.Iterator r16 = X.C18320x8.A0q(r0)
        L_0x035f:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x0b10
            java.lang.Object r1 = r16.next()
            android.net.Uri r1 = (android.net.Uri) r1
            X.5Xq r0 = r8.A1n
            X.5YF r4 = r0.A00(r1)
            X.53q r0 = r8.A0o
            byte r1 = r0.A01(r4)
            r0 = 1
            if (r1 == r0) goto L_0x037e
            r0 = 42
            if (r1 != r0) goto L_0x035f
        L_0x037e:
            java.io.File r0 = r4.A07()
            android.net.Uri r0 = android.net.Uri.fromFile(r0)
            android.net.Uri$Builder r3 = r0.buildUpon()
            android.net.Uri r2 = r4.A0G
            int r0 = r4.A01()
            X.C989053r.A03(r3, r2, r0)
            java.lang.String r1 = "flip-h"
            java.lang.String r0 = r2.getQueryParameter(r1)
            if (r0 == 0) goto L_0x03a2
            java.lang.String r0 = r2.getQueryParameter(r1)
            r3.appendQueryParameter(r1, r0)
        L_0x03a2:
            android.net.Uri r29 = r3.build()
            X.33c r5 = r8.A0p
            java.lang.Byte r0 = r4.A08()
            X.C626936e.A06(r0)
            byte r9 = r0.byteValue()
            X.5Us r0 = r8.A0t
            X.08M r0 = r0.A01
            java.lang.Object r4 = r0.A07()
            java.util.List r4 = (java.util.List) r4
            X.1VX r2 = r8.A0D
            r0 = 1
            r3 = 0
            if (r4 == 0) goto L_0x059a
            int r1 = r4.size()
            if (r1 != r0) goto L_0x059a
            java.lang.Object r1 = r4.get(r3)
            boolean r1 = r1 instanceof com.whatsapp.jid.PhoneUserJid
            if (r1 == 0) goto L_0x059a
            boolean r1 = X.C56952sp.A0I(r2)
            if (r1 == 0) goto L_0x059a
        L_0x03d7:
            r1 = 1
            X.7iO r2 = new X.7iO
            r2.<init>(r1, r7, r6)
            X.2r1 r1 = r5.A0F
            r4 = 0
            X.7Td r31 = r1.A00(r4, r9, r7)
            r15 = 0
            X.38t r33 = X.AnonymousClass36O.A01(r4, r9, r3)
            r1 = 1
            r34 = r4
            r35 = r4
            r39 = r1
            r30 = r4
            r32 = r2
            r36 = r3
            r37 = r7
            r38 = r1
            X.32J r9 = X.AnonymousClass32J.A00(r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39)
            X.2rD r12 = r5.A09
            X.2qx r11 = r12.A0J
            java.lang.String r2 = X.C18280x3.A0Y()
            X.5LM r19 = r11.A01(r2, r3)
            X.2sH r10 = r12.A06
            X.4FS r2 = r12.A0Q
            X.33a r3 = new X.33a
            r17 = r3
            r18 = r10
            r20 = r11
            r21 = r2
            r22 = r1
            r17.<init>(r18, r19, r20, r21, r22)
            monitor-enter(r3)
            r3.A0C = r1     // Catch:{ all -> 0x0b0d }
            monitor-exit(r3)
            X.1VX r11 = r12.A0B
            r2 = 4
            X.C162457s7.A0J(r11, r2)
            X.2UD r2 = r9.A01
            X.8rZ r21 = X.C620033c.A00(r2)
            X.3QO r10 = new X.3QO
            r20 = r10
            r22 = r11
            r24 = r3
            r25 = r9
            r23 = r19
            r20.<init>(r21, r22, r23, r24, r25)
            X.5LM r2 = r10.A0L
            java.lang.String r2 = r2.A0D
            X.C162457s7.A0J(r2, r15)
            X.3XB r12 = r10.A0A
            r12.A05(r2)
            java.lang.StringBuilder r11 = X.AnonymousClass001.A0o()
            java.lang.String r3 = "app/mediajobmanager/enqueueOptimisticMediaUpload "
            X.C18260x0.A1P(r11, r3, r10)
            if (r0 == 0) goto L_0x0475
            X.32f r3 = r5.A0K
            X.2dV r0 = r9.A02
            X.38t r0 = r0.A05
            boolean r0 = r3.A01(r0, r1)
            if (r0 != 0) goto L_0x0475
            X.1VX r3 = r5.A06
            r1 = 3926(0xf56, float:5.501E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r3.A0Y(r0, r1)
            if (r0 == 0) goto L_0x0475
            java.lang.String r0 = "express-optimistic"
            r10.A0W = r0
            X.33a r1 = r10.A0M
            r0 = 4
            r1.A09(r0)
        L_0x0475:
            X.2he r11 = r5.A0D
            X.2dV r13 = r10.A01()
            X.4FV r0 = r11.A01
            X.7kZ r9 = new X.7kZ
            r9.<init>(r0)
            X.6ie r1 = r9.A03
            java.lang.Long r0 = X.C18290x4.A0g(r2)
            r1.A0E = r0
            X.7PV r3 = new X.7PV
            r3.<init>(r9)
            X.38t r1 = r13.A05
            X.38t r2 = X.C633138t.A0C
            if (r1 == r2) goto L_0x0551
            X.38t r0 = X.C633138t.A0j
            if (r1 == r0) goto L_0x0551
            X.38t r0 = X.C633138t.A0H
            if (r1 == r0) goto L_0x0551
            X.38t r0 = X.C633138t.A0Z
            if (r1 == r0) goto L_0x0551
            X.38t r0 = X.C633138t.A07
            if (r1 == r0) goto L_0x0551
            X.38t r0 = X.C633138t.A08
            if (r1 == r0) goto L_0x0551
            X.38t r0 = X.C633138t.A0R
            if (r1 == r0) goto L_0x0551
            X.38t r0 = X.C633138t.A0F
            if (r1 == r0) goto L_0x0551
            boolean r0 = X.AnonymousClass36O.A06(r1)
            if (r0 == 0) goto L_0x035f
            java.io.File r0 = r13.A07
            r24 = r0
            java.lang.String r0 = r13.A0B
            r26 = r0
            java.lang.String r0 = r13.A09
            r20 = r0
            X.330 r0 = r13.A06
            r19 = r0
            java.lang.String r0 = r13.A0A
            r18 = r0
            X.8od r0 = r3.A06
            r17 = r0
            X.7E3 r15 = r3.A05
            X.8oe r2 = r3.A07
            java.io.File r14 = r13.A01()
            boolean r0 = r13.A0G
            if (r0 == 0) goto L_0x054e
            java.lang.String r13 = ".json"
        L_0x04dd:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = X.C18280x3.A0Y()
            java.lang.String r0 = X.AnonymousClass000.A0V(r0, r13, r1)
            java.io.File r25 = r11.A01(r14, r0)
            X.6ki r1 = new X.6ki
            r21 = r17
            r22 = r2
            r23 = r19
            r27 = r20
            r28 = r18
            r17 = r1
            r18 = r9
            r19 = r10
            r20 = r15
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            X.2gn r2 = r11.A05
            X.38t r0 = X.C633138t.A0b
            r2.A01(r1, r0)
        L_0x050b:
            X.33a r1 = r10.A0M
            X.7kZ r0 = r3.A00
            r1.A0A(r0)
            r5.A0B(r10, r3)
            r1 = 10
            X.6Bp r0 = new X.6Bp
            r0.<init>(r10, r1)
            r12.A04(r0, r4)
            r0 = 11
            X.6Bp r1 = new X.6Bp
            r1.<init>(r10, r0)
            X.3XB r0 = r10.A0F
            r0.A04(r1, r4)
            r0 = 12
            X.6Bp r1 = new X.6Bp
            r1.<init>(r10, r0)
            X.3XB r0 = r10.A0J
            r0.A04(r1, r4)
            r0 = 8
            X.4Jl r1 = new X.4Jl
            r1.<init>(r5, r0, r10)
            java.util.concurrent.Executor r0 = r5.A0O
            r10.A04(r1, r0)
            android.net.Uri r1 = X.C989053r.A02(r29)
            java.util.Map r0 = r8.A1w
            r0.put(r1, r10)
            goto L_0x035f
        L_0x054e:
            java.lang.String r13 = ".webp"
            goto L_0x04dd
        L_0x0551:
            java.lang.String r0 = r13.A0B
            r25 = r0
            X.C626936e.A06(r25)
            X.8od r0 = r3.A06
            r21 = r0
            X.8oe r0 = r3.A07
            r22 = r0
            java.io.File r14 = r13.A01()
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.util.UUID r0 = java.util.UUID.randomUUID()
            X.AnonymousClass000.A1B(r0, r1)
            java.lang.String r0 = ".jpg"
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)
            java.io.File r24 = r11.A01(r14, r0)
            X.7Td r14 = r13.A04
            X.C626936e.A06(r14)
            boolean r1 = r13.A0E
            X.6kg r0 = new X.6kg
            r17 = r0
            r18 = r9
            r19 = r10
            r20 = r4
            r23 = r14
            r26 = r15
            r27 = r1
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            X.2gn r1 = r11.A05
            r1.A01(r0, r2)
            goto L_0x050b
        L_0x059a:
            r0 = 0
            goto L_0x03d7
        L_0x059d:
            r6 = 0
            goto L_0x0353
        L_0x05a0:
            java.lang.Object r6 = r7.A00
            com.whatsapp.mediacomposer.MediaComposerActivity r6 = (com.whatsapp.mediacomposer.MediaComposerActivity) r6
            X.5mJ r5 = r6.A0m
            X.5Us r0 = r6.A0t
            X.08M r0 = r0.A01
            java.lang.Object r0 = r0.A07()
            java.util.Collection r0 = (java.util.Collection) r0
            X.4uZ r0 = X.C627336j.A03(r0)
            boolean r17 = X.AnonymousClass000.A1W(r0)
            X.5Us r0 = r6.A0t
            X.08M r0 = r0.A01
            java.lang.Object r0 = r0.A07()
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r12 = X.C627336j.A0N(r0)
            X.1VX r2 = r6.A0D
            r1 = 3306(0xcea, float:4.633E-42)
            X.2vE r0 = X.C58422vE.A02
            int r15 = r2.A0O(r0, r1)
            java.util.HashSet r11 = r6.A1v
            X.5Xq r0 = r6.A1n
            java.util.Collection r2 = r0.A01()
            r9 = 3
            X.C162457s7.A0J(r11, r9)
            int r1 = r2.size()
            r0 = 20
            r8 = 0
            if (r1 < r0) goto L_0x001a
            X.1ip r1 = r5.A00
            int r0 = r1.A08(r8)
            r4 = 1
            if (r0 == r4) goto L_0x001a
            X.2hc r0 = r1.A0A()
            if (r0 == 0) goto L_0x05ff
            java.util.Set r1 = X.AnonymousClass2B9.A00
            java.lang.String r0 = r0.A01
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x05ff
            return
        L_0x05ff:
            java.util.Iterator r16 = r2.iterator()
            r0 = 0
        L_0x0605:
            boolean r2 = r16.hasNext()
            if (r2 == 0) goto L_0x06a3
            java.lang.Object r14 = r16.next()
            X.5YF r14 = (X.AnonymousClass5YF) r14
            X.53q r2 = r5.A01
            byte r2 = r2.A02(r14)
            if (r2 != r4) goto L_0x064d
            android.net.Uri r10 = r14.A0G
            X.C162457s7.A0D(r10)
            boolean r2 = r11.contains(r10)
            android.graphics.Rect r19 = r14.A03()
            r3 = 0
            if (r2 == 0) goto L_0x062a
            r3 = 3
        L_0x062a:
            X.2r1 r13 = r5.A02
            int[] r2 = new int[r4]
            r2[r8] = r3
            r21 = r2
            r22 = r8
            r23 = r17
            r18 = r13
            r20 = r10
            java.util.Map r2 = r18.A01(r19, r20, r21, r22, r23)
            java.lang.Object r2 = X.AnonymousClass001.A0i(r2, r3)
            X.2lc r2 = (X.C52522lc) r2
            if (r2 == 0) goto L_0x064a
            long r2 = r2.A02
        L_0x0648:
            long r0 = r0 + r2
            goto L_0x0605
        L_0x064a:
            r2 = 0
            goto L_0x0648
        L_0x064d:
            if (r2 != r9) goto L_0x0605
            java.io.File r10 = r14.A07()
            X.5Qm r20 = r14.A04()
            if (r10 == 0) goto L_0x0605
            if (r20 == 0) goto L_0x0605
            boolean r13 = r14.A0J()
            monitor-enter(r14)
            boolean r2 = r14.A0E     // Catch:{ all -> 0x0b16 }
            r18 = r2
            monitor-exit(r14)
            android.graphics.Point r2 = r14.A02()
            if (r2 == 0) goto L_0x06a1
            int r2 = r2.x
        L_0x066d:
            long r2 = (long) r2
            r24 = r2
            android.graphics.Point r2 = r14.A02()
            if (r2 == 0) goto L_0x069f
            int r2 = r2.y
        L_0x0678:
            long r2 = (long) r2
            r26 = r2
            X.7rd r2 = r5.A03
            if (r12 == 0) goto L_0x069c
            X.38t r3 = X.C633138t.A0V
        L_0x0681:
            boolean r28 = r2.A0I(r3, r10)
            r3 = r17
            X.7Yn r19 = r2.A0D(r3, r13, r12)
            r21 = r10
            r22 = r24
            r24 = r26
            r26 = r13
            r27 = r18
            r18 = r2
            long r2 = r18.A0A(r19, r20, r21, r22, r24, r26, r27, r28)
            goto L_0x0648
        L_0x069c:
            X.38t r3 = X.C633138t.A0g
            goto L_0x0681
        L_0x069f:
            r2 = 0
            goto L_0x0678
        L_0x06a1:
            r2 = 0
            goto L_0x066d
        L_0x06a3:
            r2 = 1000000(0xf4240, double:4.940656E-318)
            long r0 = r0 / r2
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r2 = "MediaDataWarning/aboveAcceptableSize : -> "
            r3.append(r2)
            r3.append(r0)
            java.lang.String r2 = " MB"
            X.C18260x0.A1J(r3, r2)
            long r3 = (long) r15
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 < 0) goto L_0x001a
            X.3Wi r2 = r6.A05
            r1 = 44
            X.3cG r0 = new X.3cG
            r0.<init>((java.lang.Object) r7, (int) r1)
            r2.A0S(r0)
            return
        L_0x06ca:
            java.lang.Object r8 = r7.A00
            com.whatsapp.mediacomposer.VideoComposerFragment r8 = (com.whatsapp.mediacomposer.VideoComposerFragment) r8
            X.5YG r0 = r8.A0W
            if (r0 == 0) goto L_0x001a
            int r0 = r0.A05()
            long r5 = (long) r0
            long r3 = r8.A08
            r1 = 50
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x0b19
            boolean r0 = r8.A0d
            if (r0 != 0) goto L_0x06ef
            r8.A1T()
        L_0x06e6:
            X.5YG r3 = r8.A0W
            long r1 = r8.A07
            int r0 = (int) r1
            r3.A0P(r0)
            return
        L_0x06ef:
            com.whatsapp.mediacomposer.VideoTimelineView r0 = r8.A0R
            r0.invalidate()
            X.5YG r0 = r8.A0W
            android.view.View r0 = r0.A09()
            r0.postDelayed(r7, r1)
            goto L_0x06e6
        L_0x06fe:
            java.lang.Object r1 = r7.A00
            X.4LD r1 = (X.AnonymousClass4LD) r1
            X.5S9 r0 = r1.A02
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x001a
            X.5S9 r1 = r1.A02
            r0 = 1
            r1.A01(r0)
            return
        L_0x0711:
            java.lang.Object r2 = r7.A00
            X.2cZ r2 = (X.C47012cZ) r2
            r4 = 0
            java.util.ArrayList r5 = X.AnonymousClass001.A0s()
            java.util.ArrayList r3 = X.AnonymousClass001.A0s()
            java.util.List r0 = r2.A06
            java.util.Iterator r7 = r0.iterator()
        L_0x0724:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0794
            com.whatsapp.jid.UserJid r6 = X.C18310x6.A0T(r7)
            X.2sr r0 = r2.A00
            com.whatsapp.jid.PhoneUserJid r0 = X.C56972sr.A04(r0)
            boolean r0 = X.C162457s7.A0P(r0, r6)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            if (r0 == 0) goto L_0x0764
            java.lang.String r0 = "Retrieving self identity key for "
            r1.append(r0)
            java.lang.String r0 = r6.user
            X.C18260x0.A1J(r1, r0)
            X.33n r0 = r2.A01
            X.35n r0 = r0.A00
            X.2KK r0 = r0.A04()
            X.2e4 r1 = r0.A01
        L_0x0752:
            if (r1 == 0) goto L_0x0779
            java.lang.String r0 = r6.user
            r5.add(r0)
            X.2jv r0 = r1.A00
            byte[] r0 = r0.A01
            X.C162457s7.A0D(r0)
            r3.add(r0)
            goto L_0x0724
        L_0x0764:
            java.lang.String r0 = "Retrieving user identity key for "
            r1.append(r0)
            java.lang.String r0 = r6.user
            X.C18260x0.A1J(r1, r0)
            X.33n r1 = r2.A01
            X.2ov r0 = X.AnonymousClass36G.A03(r6)
            X.2e4 r1 = r1.A08(r0)
            goto L_0x0752
        L_0x0779:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "deviceidentityverifier/verify Primary identity key is null for user: "
            r1.append(r0)
            java.lang.String r0 = r6.user
            r1.append(r0)
            java.lang.String r0 = ", failing verification"
            X.C18260x0.A1K(r1, r0)
            X.65H r1 = r2.A02
            X.20a r0 = X.C368620a.FAIL
            r1.BPQ(r0)
            return
        L_0x0794:
            X.2xJ r6 = r2.A03
            java.lang.String[] r0 = new java.lang.String[r4]
            java.lang.Object[] r7 = r5.toArray(r0)
            byte[][] r0 = new byte[r4][]
            java.lang.Object[] r8 = r3.toArray(r0)
            X.65H r0 = r2.A02
            X.7SL r9 = new X.7SL
            r9.<init>(r0, r6)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "keytransparencymanager/multiserializedlookup Initiating serialized lookups for user labels: "
            r1.append(r0)
            java.lang.String r0 = java.util.Arrays.toString(r7)
            X.C18260x0.A1J(r1, r0)
            X.4FS r0 = r6.A05
            r10 = 4
            X.3ac r5 = new X.3ac
            r5.<init>(r6, r7, r8, r9, r10)
            r0.BkM(r5)
            return
        L_0x07c5:
            java.lang.Object r0 = r7.A00
            X.1hy r0 = (X.C28911hy) r0
            r0.A09()
            return
        L_0x07cd:
            java.lang.Object r0 = r7.A00
            X.317 r0 = (X.AnonymousClass317) r0
            r0.A06()
            return
        L_0x07d5:
            java.lang.Object r2 = r7.A00
            X.5n8 r2 = (X.C114495n8) r2
            X.5GR r1 = r2.A07
            X.2nU r8 = r2.A06
            r0 = 0
            X.C162457s7.A0J(r8, r0)
            X.5Fb r0 = r1.A00
            X.5sy r0 = r0.A00
            X.3Db r1 = r0.A01
            X.1VX r7 = X.C64333Db.A4B(r1)
            X.3FI r10 = X.C64333Db.A8x(r1)
            X.2s4 r4 = X.C64333Db.A07(r1)
            X.2oU r5 = X.C64333Db.A2q(r1)
            X.33p r6 = X.C64333Db.A2s(r1)
            X.8qC r11 = X.C64333Db.A9V(r1)
            X.5bk r0 = r1.A00
            X.4C1 r12 = r0.A6y
            X.4C1 r13 = r0.A6z
            X.28T r9 = X.C64333Db.A7R(r1)
            X.1df r3 = new X.1df
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r3.Bh4(r2)
            return
        L_0x0812:
            java.lang.Object r5 = r7.A00
            X.5i6 r5 = (X.C111445i6) r5
            r0 = 1
            r5.A1U = r0
            java.lang.String r0 = "group-chat-live-location-ui-update-locations"
            r5.A0X(r0)
            r5.A0J()
            java.util.List r4 = r5.A1P
            X.2sr r3 = r5.A0z
            X.3Ex r2 = r5.A14
            X.5ZU r1 = r5.A17
            X.5sT r0 = new X.5sT
            r0.<init>(r3, r2, r1)
            java.util.Collections.sort(r4, r0)
            r1 = 0
            r5.A0Y(r1)
            X.4Wo r0 = r5.A0h
            r0.A05()
            r5.A0L()
            r5.A1U = r1
            return
        L_0x0840:
            java.lang.Object r0 = r7.A00
            X.5i6 r0 = (X.C111445i6) r0
            r0.A0J()
            return
        L_0x0848:
            java.lang.Object r5 = r7.A00
            X.5i6 r5 = (X.C111445i6) r5
            X.4uZ r0 = r5.A0c
            X.904 r4 = new X.904
            r4.<init>((X.C71533cG) r7, (X.C95814uZ) r0)
            android.os.Handler r3 = r5.A0v
            java.lang.Runnable r2 = r5.A1M
            r3.removeCallbacks(r2)
            long r0 = r5.A0C
            r3.postDelayed(r2, r0)
            X.2zu r0 = r5.A1L
            r0.A02(r4)
            r5.A0I()
            return
        L_0x0868:
            java.lang.Object r2 = r7.A00
            X.5Kv r2 = (X.C102935Kv) r2
            X.5S9 r1 = r2.A06
            boolean r0 = r1.A02()
            if (r0 == 0) goto L_0x0878
            r0 = 1
            r1.A01(r0)
        L_0x0878:
            android.widget.ImageButton r1 = r2.A03
            r0 = 2131231688(0x7f0803c8, float:1.8079464E38)
            r1.setImageResource(r0)
            return
        L_0x0881:
            java.lang.Object r0 = r7.A00
            com.whatsapp.location.LiveLocationPrivacyActivity r0 = (com.whatsapp.location.LiveLocationPrivacyActivity) r0
            X.33o r0 = r0.A0B
            r0.A0E()
            return
        L_0x088b:
            java.lang.Object r0 = r7.A00
            X.7mD r0 = (X.C159637mD) r0
            java.lang.Object r0 = r0.A00
            com.whatsapp.location.LiveLocationPrivacyActivity r0 = (com.whatsapp.location.LiveLocationPrivacyActivity) r0
            r0.A74()
            return
        L_0x0897:
            java.lang.Object r0 = r7.A00
            X.5cU r0 = (X.C108145cU) r0
            r0.A08()
            return
        L_0x089f:
            java.lang.Object r0 = r7.A00
            X.33o r0 = (X.C621233o) r0
            r0.A0G()
            return
        L_0x08a7:
            java.lang.Object r0 = r7.A00
            X.33o r0 = (X.C621233o) r0
            r0.A0L()
            return
        L_0x08af:
            java.lang.Object r1 = r7.A00
            com.whatsapp.location.LocationSharingService r1 = (com.whatsapp.location.LocationSharingService) r1
            r0 = 0
            r1.A0G = r0
            goto L_0x08be
        L_0x08b7:
            java.lang.Object r1 = r7.A00
            com.whatsapp.location.LocationSharingService r1 = (com.whatsapp.location.LocationSharingService) r1
            r0 = 0
            r1.A0H = r0
        L_0x08be:
            r1.A05()
            return
        L_0x08c2:
            long r3 = java.lang.System.currentTimeMillis()
            long r0 = X.C1441870j.A00
            long r3 = r3 - r0
            r1 = 1000(0x3e8, double:4.94E-321)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x08d9
            java.lang.Object r0 = r7.A00
            X.4Ic r0 = (X.C85914Ic) r0
            java.lang.Object r0 = r0.A00
            android.view.View r0 = (android.view.View) r0
            goto L_0x0b24
        L_0x08d9:
            java.lang.Object r0 = r7.A00     // Catch:{ IncompatibleClassChangeError -> 0x08f2 }
            X.4Ic r0 = (X.C85914Ic) r0     // Catch:{ IncompatibleClassChangeError -> 0x08f2 }
            java.lang.Object r2 = r0.A00     // Catch:{ IncompatibleClassChangeError -> 0x08f2 }
            com.whatsapp.location.WaMapView r2 = (com.whatsapp.location.WaMapView) r2     // Catch:{ IncompatibleClassChangeError -> 0x08f2 }
            X.6FD r0 = r2.A01     // Catch:{ IncompatibleClassChangeError -> 0x08f2 }
            X.C626936e.A04(r0)     // Catch:{ IncompatibleClassChangeError -> 0x08f2 }
            X.6FD r1 = r2.A01     // Catch:{ IncompatibleClassChangeError -> 0x08f2 }
            r0 = 0
            r1.A06(r0)     // Catch:{ IncompatibleClassChangeError -> 0x08f2 }
            X.6FD r0 = r2.A01     // Catch:{ IncompatibleClassChangeError -> 0x08f2 }
            r0.A05()     // Catch:{ IncompatibleClassChangeError -> 0x08f2 }
            goto L_0x08f6
        L_0x08f2:
            r0 = move-exception
            com.whatsapp.util.Log.i((java.lang.Throwable) r0)
        L_0x08f6:
            java.lang.Object r0 = r7.A00
            X.4Ic r0 = (X.C85914Ic) r0
            java.lang.Object r1 = r0.A01
            X.34h r1 = (X.C622534h) r1
            r0 = 1
            r1.A00 = r0
            return
        L_0x0902:
            java.lang.Object r0 = r7.A00
            X.1I7 r0 = (X.AnonymousClass1I7) r0
            X.3Dh r1 = r0.A0B
            java.io.File r0 = r0.A03
            X.AnonymousClass1I7.A00(r1, r0)
            return
        L_0x090e:
            java.lang.Object r10 = r7.A00
            X.1I7 r10 = (X.AnonymousClass1I7) r10
            X.2sf r1 = r10.A0h
            X.1fw r1 = (X.C28231fw) r1
            long r2 = r1.A00
            r8 = -1
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 != 0) goto L_0x0922
            long r2 = r1.A06()
        L_0x0922:
            long r6 = r1.A0A
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 != 0) goto L_0x0938
            r4 = 0
        L_0x092a:
            X.2YR r8 = r10.A0a
            X.2dc r0 = r10.A0e
            java.lang.String r9 = r0.A0G
            X.2sH r0 = r10.A0N
            long r0 = r0.A0H()
            monitor-enter(r8)
            goto L_0x0945
        L_0x0938:
            long r4 = r1.A01
            int r0 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r0 != 0) goto L_0x0943
            long r4 = r1.A04()
            goto L_0x092a
        L_0x0943:
            long r4 = r4 - r6
            goto L_0x092a
        L_0x0945:
            X.C626936e.A00()     // Catch:{ all -> 0x09cd }
            X.2sH r11 = r8.A00     // Catch:{ all -> 0x09cd }
            long r6 = r11.A0H()     // Catch:{ all -> 0x09cd }
            X.1RC r10 = r8.A01     // Catch:{ SQLiteDatabaseCorruptException -> 0x09c6, Error | RuntimeException -> 0x09c1 }
            X.4Fq r15 = r10.A0C()     // Catch:{ SQLiteDatabaseCorruptException -> 0x09c6, Error | RuntimeException -> 0x09c1 }
            r10 = r15
            X.3H0 r10 = (X.AnonymousClass3H0) r10     // Catch:{ all -> 0x09b7 }
            X.2sg r13 = r10.A03     // Catch:{ all -> 0x09b7 }
            java.lang.String r12 = "express_path_download_data"
            android.content.ContentValues r10 = X.AnonymousClass0x9.A06()     // Catch:{ all -> 0x09b7 }
            java.lang.String r14 = "enc_file_hash"
            r10.put(r14, r9)     // Catch:{ all -> 0x09b7 }
            java.lang.String r14 = "ep_saved_time_ms"
            X.C18270x1.A0c(r10, r14, r4)     // Catch:{ all -> 0x09b7 }
            java.lang.String r14 = "ep_saved_bytes"
            X.C18270x1.A0c(r10, r14, r2)     // Catch:{ all -> 0x09b7 }
            java.lang.String r14 = "last_update_time"
            X.C18270x1.A0c(r10, r14, r0)     // Catch:{ all -> 0x09b7 }
            r1 = 4
            java.lang.String r0 = "ExpressPathDownloadDataStore/insert"
            r13.A0C(r12, r0, r10, r1)     // Catch:{ all -> 0x09b7 }
            java.lang.StringBuilder r10 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x09b7 }
            java.lang.String r0 = "expresspathdownloaddb/insert/"
            r10.append(r0)     // Catch:{ all -> 0x09b7 }
            r10.append(r9)     // Catch:{ all -> 0x09b7 }
            java.lang.String r0 = "/time="
            r10.append(r0)     // Catch:{ all -> 0x09b7 }
            long r0 = X.C56612sH.A03(r11, r6)     // Catch:{ all -> 0x09b7 }
            r10.append(r0)     // Catch:{ all -> 0x09b7 }
            java.lang.String r0 = "ms"
            X.C18260x0.A1J(r10, r0)     // Catch:{ all -> 0x09b7 }
            r15.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x09c6, Error | RuntimeException -> 0x09c1 }
            monitor-exit(r8)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "MediaDownload/sendStat Log EP gain data for hash: "
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = ", gainTimeMS: "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = ", gainBytes: "
            java.lang.String r0 = X.AnonymousClass000.A0Z(r0, r1, r2)
            goto L_0x0b12
        L_0x09b7:
            r1 = move-exception
            r15.close()     // Catch:{ all -> 0x09bc }
            goto L_0x09c0
        L_0x09bc:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x09c6, Error | RuntimeException -> 0x09c1 }
        L_0x09c0:
            throw r1     // Catch:{ SQLiteDatabaseCorruptException -> 0x09c6, Error | RuntimeException -> 0x09c1 }
        L_0x09c1:
            r1 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r1)     // Catch:{ all -> 0x09cd }
            goto L_0x09cc
        L_0x09c6:
            r1 = move-exception
            java.lang.String r0 = "expresspathdownloaddb/insert"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x09cd }
        L_0x09cc:
            throw r1     // Catch:{ all -> 0x09cd }
        L_0x09cd:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        L_0x09d0:
            java.lang.Object r0 = r7.A00
            X.1I7 r0 = (X.AnonymousClass1I7) r0
            X.2qx r1 = r0.A0b
            X.5LM r0 = r0.A01
            r1.A04(r0)
            return
        L_0x09dc:
            java.lang.Object r0 = r7.A00
            X.1I7 r0 = (X.AnonymousClass1I7) r0
            X.2qx r1 = r0.A0b
            X.5LM r0 = r0.A01
            goto L_0x09f5
        L_0x09e5:
            java.lang.Object r0 = r7.A00
            X.4GP r0 = (X.AnonymousClass4GP) r0
            r0.invoke()
            return
        L_0x09ed:
            java.lang.Object r0 = r7.A00
            X.33a r0 = (X.C619833a) r0
            X.2qx r1 = r0.A0L
            X.5LM r0 = r0.A0K
        L_0x09f5:
            r1.A03(r0)
            return
        L_0x09f9:
            java.lang.Object r0 = r7.A00
            X.1I5 r0 = (X.AnonymousClass1I5) r0
            X.5If r4 = r0.A0c
            X.1qP r3 = r0.A02
            X.C626936e.A06(r3)
            X.2YO r2 = r0.A01
            X.C626936e.A06(r2)
            r1 = 2
            X.4Ke r0 = new X.4Ke
            r0.<init>(r4, r1, r3)
            r2.A00(r0)
            return
        L_0x0a13:
            java.lang.Object r2 = r7.A00
            X.5LQ r2 = (X.AnonymousClass5LQ) r2
            android.view.View r3 = r2.A05
            r0 = 1962934272(0x75000000, float:1.6225928E32)
            r3.setBackgroundColor(r0)
            boolean r0 = r2.A0B
            if (r0 != 0) goto L_0x0a31
            android.widget.TextView r1 = r2.A0A
            r0 = -1291845633(0xffffffffb2ffffff, float:-2.980232E-8)
            r1.setTextColor(r0)
            android.graphics.drawable.Drawable r1 = r2.A03
            r0 = 178(0xb2, float:2.5E-43)
            r1.setAlpha(r0)
        L_0x0a31:
            r1 = 0
            r0 = 1065353216(0x3f800000, float:1.0)
            android.view.animation.AlphaAnimation r2 = new android.view.animation.AlphaAnimation
            r2.<init>(r1, r0)
            r0 = 300(0x12c, double:1.48E-321)
            r2.setDuration(r0)
            r3.startAnimation(r2)
            return
        L_0x0a42:
            java.lang.Object r1 = r7.A00
            X.07r r1 = (X.C009707r) r1
            r0 = 2131432721(0x7f0b1511, float:1.8487207E38)
            android.view.View r1 = r1.findViewById(r0)
            goto L_0x0aa2
        L_0x0a4e:
            java.lang.Object r0 = r7.A00
            com.whatsapp.mediacomposer.MediaComposerActivity r0 = (com.whatsapp.mediacomposer.MediaComposerActivity) r0
            X.5Tg r0 = r0.A1J
            r0.A00()
            return
        L_0x0a58:
            java.lang.Object r0 = r7.A00
            com.whatsapp.mediacomposer.MediaComposerActivity r0 = (com.whatsapp.mediacomposer.MediaComposerActivity) r0
            r0.A7G()
            return
        L_0x0a60:
            java.lang.Object r2 = r7.A00
            com.whatsapp.mediacomposer.MediaComposerActivity r2 = (com.whatsapp.mediacomposer.MediaComposerActivity) r2
            X.5nY r0 = r2.A0w
            X.5nZ r0 = r0.A08
            X.4Ww r1 = r0.A02
            r0 = 1
            r1.A00 = r0
            r1.A05()
            r0 = 0
            r2.A1T = r0
            return
        L_0x0a74:
            java.lang.Object r4 = r7.A00
            X.3cG r4 = (X.C71533cG) r4
            r0 = 8
            X.6C0 r3 = new X.6C0
            r3.<init>(r4, r0)
            X.5sz r2 = new X.5sz
            r2.<init>()
            r1 = 13
            X.92f r0 = new X.92f
            r0.<init>(r4, r1)
            com.whatsapp.mediacomposer.dialog.DataWarningDialog r1 = new com.whatsapp.mediacomposer.dialog.DataWarningDialog
            r1.<init>(r3, r2, r0)
            java.lang.Object r0 = r4.A00
            X.03q r0 = (X.C003203q) r0
            X.C18270x1.A0t(r1, r0)
            return
        L_0x0a98:
            java.lang.Object r1 = r7.A00
            android.view.View r1 = (android.view.View) r1
            r0 = 4
            goto L_0x0aa3
        L_0x0a9e:
            java.lang.Object r1 = r7.A00
            android.view.View r1 = (android.view.View) r1
        L_0x0aa2:
            r0 = 0
        L_0x0aa3:
            r1.setVisibility(r0)
            return
        L_0x0aa7:
            java.lang.Long r0 = X.AnonymousClass0x9.A0m(r6)
            r7.A01 = r0
            java.lang.Long r0 = X.AnonymousClass0x9.A0m(r5)
            r7.A02 = r0
            java.lang.Long r0 = X.AnonymousClass0x9.A0m(r4)
            r7.A03 = r0
            java.lang.Long r0 = X.AnonymousClass0x9.A0m(r3)
            r7.A04 = r0
            X.4FV r0 = r8.A05
            r0.BhD(r7)
            return
        L_0x0ac5:
            java.util.Iterator r1 = r8.iterator()
        L_0x0ac9:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0ad9
            java.lang.Object r0 = r1.next()
            X.5We r0 = (X.C105735We) r0
            r7.A0R(r0)
            goto L_0x0ac9
        L_0x0ad9:
            r7.A0K()
            X.4Wo r0 = r7.A0h
            r0.A05()
            return
        L_0x0ae2:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0ae2 }
            throw r0
        L_0x0ae5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x0ae8:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0ae8 }
            throw r0
        L_0x0aeb:
            java.io.File r0 = r6.A03     // Catch:{ all -> 0x0b0a }
            if (r0 == 0) goto L_0x0b08
            boolean r0 = r0.exists()     // Catch:{ all -> 0x0b0a }
            if (r0 == 0) goto L_0x0b08
            java.io.File r0 = r6.A03     // Catch:{ all -> 0x0b0a }
            long r3 = r0.length()     // Catch:{ all -> 0x0b0a }
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0b08
            X.3Dh r1 = r6.A0B     // Catch:{ all -> 0x0b0a }
            java.io.File r0 = r6.A03     // Catch:{ all -> 0x0b0a }
            X.AnonymousClass1I7.A00(r1, r0)     // Catch:{ all -> 0x0b0a }
        L_0x0b08:
            monitor-exit(r5)     // Catch:{ all -> 0x0b0a }
            return
        L_0x0b0a:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0b0a }
            throw r0
        L_0x0b0d:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x0b10:
            java.lang.String r0 = "MediaComposerActivity/end enqueue optimistic uploads"
        L_0x0b12:
            com.whatsapp.util.Log.d((java.lang.String) r0)
            return
        L_0x0b16:
            r0 = move-exception
            monitor-exit(r14)
            throw r0
        L_0x0b19:
            com.whatsapp.mediacomposer.VideoTimelineView r0 = r8.A0R
            r0.invalidate()
            X.5YG r0 = r8.A0W
            android.view.View r0 = r0.A09()
        L_0x0b24:
            r0.postDelayed(r7, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71533cG.run():void");
    }

    public C71533cG(MediaComposerActivity mediaComposerActivity, int i) {
        this.A01 = i;
        switch (i) {
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
                this.A00 = mediaComposerActivity;
                return;
            default:
                this.A00 = mediaComposerActivity;
                return;
        }
    }

    public C71533cG(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }
}
