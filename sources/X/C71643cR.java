package X;

import android.app.Activity;
import android.graphics.Bitmap;
import com.whatsapp.mediaview.MediaViewFragment;
import com.whatsapp.mediaview.PhotoView;
import java.util.AbstractList;
import java.util.Stack;

/* renamed from: X.3cR  reason: invalid class name and case insensitive filesystem */
public class C71643cR implements Runnable {
    public Object A00;
    public Object A01;
    public Object A02;
    public boolean A03;
    public final int A04;

    public C71643cR(Activity activity, C56962sq r3, AnonymousClass3ZH r4) {
        this.A04 = 2;
        this.A03 = true;
        this.A00 = r3;
        this.A01 = activity;
        this.A02 = r4;
    }

    public final void A00(Bitmap bitmap, C51812kQ r5) {
        ((MediaViewFragment) this.A01).A0L.A0S(new C70353aM(this, bitmap, r5, 8));
    }

    public void A01(PhotoView photoView, C30471mV r5) {
        C51812kQ r2 = new C51812kQ(photoView, r5);
        AbstractList abstractList = (AbstractList) this.A00;
        synchronized (abstractList) {
            abstractList.add(0, r2);
            abstractList.notifyAll();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v18, resolved type: X.3a0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v207, resolved type: X.3bL} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v30, resolved type: X.3bL} */
    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Runnable] */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x031f, code lost:
        r0.BhD(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0322, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x0782, code lost:
        r1.A0S(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x0785, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x02a9  */
    /* JADX WARNING: Removed duplicated region for block: B:321:0x0844 A[Catch:{ InterruptedException -> 0x08d4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:324:0x0851 A[Catch:{ InterruptedException -> 0x08d4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:329:0x0889 A[Catch:{ InterruptedException -> 0x08d4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:337:0x08a3 A[Catch:{ InterruptedException -> 0x08d4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:417:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r20 = this;
            r0 = r20
            int r1 = r0.A04
            switch(r1) {
                case 0: goto L_0x001f;
                case 1: goto L_0x03af;
                case 2: goto L_0x03c7;
                case 3: goto L_0x03e8;
                case 4: goto L_0x0409;
                case 5: goto L_0x0106;
                case 6: goto L_0x01c1;
                case 7: goto L_0x041b;
                case 8: goto L_0x0260;
                case 9: goto L_0x042d;
                case 10: goto L_0x044b;
                case 11: goto L_0x02b4;
                case 12: goto L_0x02d9;
                case 13: goto L_0x02fd;
                case 14: goto L_0x05ca;
                case 15: goto L_0x05ee;
                case 16: goto L_0x0637;
                case 17: goto L_0x065b;
                case 18: goto L_0x067c;
                case 19: goto L_0x06c0;
                case 20: goto L_0x071d;
                case 21: goto L_0x0323;
                case 22: goto L_0x07ad;
                case 23: goto L_0x072f;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r5 = r0.A00
            X.5Jy r5 = (X.C102705Jy) r5
            java.lang.Object r4 = r0.A01
            X.34x r4 = (X.C624134x) r4
            java.lang.Object r3 = r0.A02
            android.view.View r3 = (android.view.View) r3
            boolean r2 = r0.A03
            X.1sV r1 = r5.A03
            X.5q4 r0 = r5.A00
            if (r2 == 0) goto L_0x03ab
            r1.A09(r3, r4, r0)
        L_0x001e:
            return
        L_0x001f:
            java.lang.Object r4 = r0.A00
            X.7Wo r4 = (X.C151857Wo) r4
            java.lang.Object r3 = r0.A01
            X.7hG r3 = (X.C156817hG) r3
            java.lang.Object r1 = r0.A02
            X.7Py r1 = (X.C150267Py) r1
            boolean r2 = r0.A03
            if (r4 == 0) goto L_0x0034
            android.util.LruCache r0 = r4.A00
            r0.evictAll()
        L_0x0034:
            if (r3 == 0) goto L_0x0042
            monitor-enter(r3)
            android.util.LruCache r0 = r3.A01     // Catch:{ all -> 0x08e2 }
            r0.evictAll()     // Catch:{ all -> 0x08e2 }
            android.util.LruCache r0 = r3.A02     // Catch:{ all -> 0x08e2 }
            r0.evictAll()     // Catch:{ all -> 0x08e2 }
            monitor-exit(r3)
        L_0x0042:
            if (r1 == 0) goto L_0x004a
            java.util.concurrent.atomic.AtomicReference r1 = r1.A07
            r0 = 0
            r1.set(r0)
        L_0x004a:
            X.7kY r5 = X.C158787kY.A04
            if (r2 == 0) goto L_0x00ad
            X.7W4 r0 = r5.A01
            X.7kY r6 = r0.A02
            java.util.Map r5 = r6.A03
            monitor-enter(r5)
            java.util.Map r0 = r6.A03     // Catch:{ all -> 0x08e5 }
            java.util.Iterator r3 = X.AnonymousClass001.A0v(r0)     // Catch:{ all -> 0x08e5 }
            r4 = 0
        L_0x005c:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x08e5 }
            if (r0 == 0) goto L_0x0086
            java.lang.Object r2 = r3.next()     // Catch:{ all -> 0x08e5 }
            java.util.Set r2 = (java.util.Set) r2     // Catch:{ all -> 0x08e5 }
            java.util.Iterator r1 = r2.iterator()     // Catch:{ all -> 0x08e5 }
        L_0x006c:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x08e5 }
            if (r0 == 0) goto L_0x0082
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x08e5 }
            X.8vT r0 = (X.C186508vT) r0     // Catch:{ all -> 0x08e5 }
            if (r4 != 0) goto L_0x007e
            java.util.LinkedList r4 = X.AnonymousClass0x9.A18()     // Catch:{ all -> 0x08e5 }
        L_0x007e:
            r4.add(r0)     // Catch:{ all -> 0x08e5 }
            goto L_0x006c
        L_0x0082:
            r2.clear()     // Catch:{ all -> 0x08e5 }
            goto L_0x005c
        L_0x0086:
            java.util.Map r0 = r6.A03     // Catch:{ all -> 0x08e5 }
            r0.clear()     // Catch:{ all -> 0x08e5 }
            r0 = 0
            r6.A00 = r0     // Catch:{ all -> 0x08e5 }
            monitor-exit(r5)     // Catch:{ all -> 0x08e5 }
            if (r4 == 0) goto L_0x001e
            java.util.Iterator r2 = r4.iterator()
        L_0x0095:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x08e8
            java.lang.Object r1 = r2.next()
            X.8vT r1 = (X.C186508vT) r1
            r1.stop()     // Catch:{ all -> 0x00a8 }
            r1.release()     // Catch:{ Exception -> 0x0095 }
            goto L_0x0095
        L_0x00a8:
            r0 = move-exception
            r1.release()     // Catch:{ Exception -> 0x0095 }
            throw r0     // Catch:{ Exception -> 0x0095 }
        L_0x00ad:
            monitor-enter(r5)
            java.util.Map r0 = r5.A03     // Catch:{ all -> 0x08ec }
            java.util.Iterator r3 = X.AnonymousClass001.A0v(r0)     // Catch:{ all -> 0x08ec }
            r4 = 0
        L_0x00b5:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x08ec }
            if (r0 == 0) goto L_0x00df
            java.lang.Object r2 = r3.next()     // Catch:{ all -> 0x08ec }
            java.util.Set r2 = (java.util.Set) r2     // Catch:{ all -> 0x08ec }
            java.util.Iterator r1 = r2.iterator()     // Catch:{ all -> 0x08ec }
        L_0x00c5:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x08ec }
            if (r0 == 0) goto L_0x00db
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x08ec }
            X.8vT r0 = (X.C186508vT) r0     // Catch:{ all -> 0x08ec }
            if (r4 != 0) goto L_0x00d7
            java.util.LinkedList r4 = X.AnonymousClass0x9.A18()     // Catch:{ all -> 0x08ec }
        L_0x00d7:
            r4.add(r0)     // Catch:{ all -> 0x08ec }
            goto L_0x00c5
        L_0x00db:
            r2.clear()     // Catch:{ all -> 0x08ec }
            goto L_0x00b5
        L_0x00df:
            java.util.Map r0 = r5.A03     // Catch:{ all -> 0x08ec }
            r0.clear()     // Catch:{ all -> 0x08ec }
            r0 = 0
            r5.A00 = r0     // Catch:{ all -> 0x08ec }
            monitor-exit(r5)     // Catch:{ all -> 0x08ec }
            if (r4 == 0) goto L_0x001e
            java.util.Iterator r2 = r4.iterator()
        L_0x00ee:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x08e8
            java.lang.Object r1 = r2.next()
            X.8vT r1 = (X.C186508vT) r1
            r1.stop()     // Catch:{ all -> 0x0101 }
            r1.release()     // Catch:{ Exception -> 0x00ee }
            goto L_0x00ee
        L_0x0101:
            r0 = move-exception
            r1.release()     // Catch:{ Exception -> 0x00ee }
            throw r0     // Catch:{ Exception -> 0x00ee }
        L_0x0106:
            java.lang.Object r7 = r0.A00
            X.5b3 r7 = (X.C107285b3) r7
            java.lang.Object r10 = r0.A01
            java.util.List r10 = (java.util.List) r10
            java.lang.Object r9 = r0.A02
            com.whatsapp.voipcalling.CallInfo r9 = (com.whatsapp.voipcalling.CallInfo) r9
            boolean r3 = r0.A03
            java.util.LinkedHashMap r6 = X.C18320x8.A0r()
            java.util.ArrayList r5 = X.AnonymousClass001.A0s()
            java.util.Iterator r2 = r10.iterator()
        L_0x0120:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0148
            com.whatsapp.jid.UserJid r1 = X.C18310x6.A0T(r2)
            boolean r0 = r1 instanceof com.whatsapp.jid.PhoneUserJid
            if (r0 == 0) goto L_0x0144
            com.whatsapp.jid.UserJid r0 = r9.getCreatorJid()
            if (r0 == 0) goto L_0x0144
            com.whatsapp.jid.UserJid r0 = r9.getCreatorJid()
            boolean r0 = r0 instanceof X.C27981fH
            if (r0 == 0) goto L_0x0144
            X.2sM r0 = r7.A2l
            com.whatsapp.jid.PhoneUserJid r1 = (com.whatsapp.jid.PhoneUserJid) r1
            X.1fH r1 = r0.A01(r1)
        L_0x0144:
            r5.add(r1)
            goto L_0x0120
        L_0x0148:
            java.util.Iterator r4 = r5.iterator()
        L_0x014c:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0163
            com.whatsapp.jid.UserJid r2 = X.C18310x6.A0T(r4)
            X.2ad r1 = r7.A2J
            java.lang.String r0 = "voip/invite"
            com.whatsapp.voipcalling.CallParticipantJid r0 = r1.A00(r2, r0)
            r6.put(r2, r0)
            goto L_0x014c
        L_0x0163:
            java.util.Collection r1 = r6.values()
            r0 = 0
            com.whatsapp.voipcalling.CallParticipantJid[] r0 = new com.whatsapp.voipcalling.CallParticipantJid[r0]
            java.lang.Object[] r0 = r1.toArray(r0)
            com.whatsapp.voipcalling.CallParticipantJid[] r0 = (com.whatsapp.voipcalling.CallParticipantJid[]) r0
            int r0 = com.whatsapp.voipcalling.Voip.invite(r0, r3)
            if (r0 == 0) goto L_0x0198
            java.util.ArrayList r4 = X.AnonymousClass001.A0s()
            java.util.Iterator r2 = r5.iterator()
        L_0x017e:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x08ef
            X.4uZ r1 = X.C18300x5.A0P(r2)
            X.3Ex r0 = r7.A2O
            X.3ZH r1 = r0.A0A(r1)
            X.5ZU r0 = r7.A2Q
            java.lang.String r0 = X.C18300x5.A0h(r0, r1)
            r4.add(r0)
            goto L_0x017e
        L_0x0198:
            java.util.Iterator r2 = r5.iterator()
        L_0x019c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x01ac
            com.whatsapp.jid.UserJid r1 = X.C18310x6.A0T(r2)
            X.2pK r0 = r7.A2v
            r0.A02(r1)
            goto L_0x019c
        L_0x01ac:
            com.whatsapp.jid.UserJid r8 = r9.getInitialPeerJid()
            if (r3 != 0) goto L_0x001e
            if (r8 == 0) goto L_0x001e
            X.4FS r0 = r7.A35
            r11 = 24
            X.3cM r6 = new X.3cM
            r6.<init>((java.lang.Object) r7, (java.lang.Object) r8, (java.lang.Object) r9, (java.lang.Object) r10, (int) r11)
            r0.BkP(r6)
            return
        L_0x01c1:
            java.lang.Object r11 = r0.A00
            X.5b3 r11 = (X.C107285b3) r11
            java.lang.Object r14 = r0.A01
            com.whatsapp.jid.UserJid r14 = (com.whatsapp.jid.UserJid) r14
            java.lang.Object r13 = r0.A02
            com.whatsapp.voipcalling.CallInfo r13 = (com.whatsapp.voipcalling.CallInfo) r13
            boolean r5 = r0.A03
            X.2ad r2 = r11.A2J
            r1 = r14
            boolean r0 = r14 instanceof com.whatsapp.jid.PhoneUserJid
            if (r0 == 0) goto L_0x01ec
            com.whatsapp.jid.UserJid r0 = r13.getCreatorJid()
            if (r0 == 0) goto L_0x01ec
            com.whatsapp.jid.UserJid r0 = r13.getCreatorJid()
            boolean r0 = r0 instanceof X.C27981fH
            if (r0 == 0) goto L_0x01ec
            X.2sM r0 = r11.A2l
            com.whatsapp.jid.PhoneUserJid r1 = (com.whatsapp.jid.PhoneUserJid) r1
            X.1fH r1 = r0.A01(r1)
        L_0x01ec:
            java.lang.String r0 = "voip/inviteToGroupCall"
            com.whatsapp.voipcalling.CallParticipantJid r0 = r2.A00(r1, r0)
            int r4 = com.whatsapp.voipcalling.Voip.inviteToGroupCall(r0)
            if (r4 == 0) goto L_0x025a
            r0 = 670021(0xa3945, float:9.389E-40)
            if (r4 == r0) goto L_0x025a
            r0 = 670038(0xa3956, float:9.38923E-40)
            if (r4 == r0) goto L_0x025a
            X.5ZU r8 = r11.A2Q
            X.3Ex r9 = r11.A2O
            X.3ZH r0 = r9.A0A(r14)
            java.lang.String r2 = X.C18300x5.A0h(r8, r0)
            android.content.Context r7 = r11.A1W
            r1 = 2131894544(0x7f122110, float:1.9423896E38)
            r10 = 1
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r6 = 0
            java.lang.String r1 = X.AnonymousClass002.A0F(r7, r2, r0, r6, r1)
            r0 = 670033(0xa3951, float:9.38916E-40)
            if (r4 != r0) goto L_0x0240
            com.whatsapp.voipcalling.CallInfo r3 = com.whatsapp.voipcalling.Voip.getCallInfo()
            if (r3 == 0) goto L_0x0240
            boolean r0 = r3.isGroupCall
            if (r0 != 0) goto L_0x0240
            r2 = 2131895396(0x7f122464, float:1.9425624E38)
            java.lang.Object[] r1 = new java.lang.Object[r10]
            com.whatsapp.jid.UserJid r0 = r3.getPeerJid()
            X.3ZH r0 = X.C64773Ex.A00(r9, r0)
            java.lang.String r0 = X.C18300x5.A0h(r8, r0)
            java.lang.String r1 = X.AnonymousClass002.A0F(r7, r0, r1, r6, r2)
        L_0x0240:
            r11.A0k(r1)
        L_0x0243:
            com.whatsapp.jid.UserJid r12 = r13.getInitialPeerJid()
            if (r4 != 0) goto L_0x001e
            if (r5 != 0) goto L_0x001e
            if (r12 == 0) goto L_0x001e
            X.4FS r0 = r11.A35
            r15 = 23
            X.3cM r10 = new X.3cM
            r10.<init>((java.lang.Object) r11, (java.lang.Object) r12, (java.lang.Object) r13, (java.lang.Object) r14, (int) r15)
            r0.BkP(r10)
            return
        L_0x025a:
            X.2pK r0 = r11.A2v
            r0.A02(r14)
            goto L_0x0243
        L_0x0260:
            java.lang.Object r7 = r0.A00
            X.11H r7 = (X.AnonymousClass11H) r7
            boolean r6 = r0.A03
            java.lang.Object r5 = r0.A01
            X.1fJ r5 = (X.C27991fJ) r5
            java.lang.Object r4 = r0.A02
            java.util.List r4 = (java.util.List) r4
            X.2Jw r2 = r7.A0Q
            X.4C6 r0 = r7.A1F
            X.C18260x0.A0O(r0, r5)
            X.4Gl r1 = r0.B61()
            r3 = 0
            if (r6 == 0) goto L_0x0291
            com.whatsapp.community.LinkExistingGroupsUseCase$suggestExistingGroups$1 r0 = new com.whatsapp.community.LinkExistingGroupsUseCase$suggestExistingGroups$1
            r0.<init>(r2, r5, r4, r3)
            java.lang.Object r2 = X.C380725l.A00(r1, r0)
            X.27J r2 = (X.AnonymousClass27J) r2
            boolean r0 = r2 instanceof X.C27641eG
            if (r0 == 0) goto L_0x02a5
            X.08M r1 = r7.A0I
        L_0x028d:
            r1.A0G(r2)
            return
        L_0x0291:
            com.whatsapp.community.LinkExistingGroupsUseCase$linkExistingGroups$1 r0 = new com.whatsapp.community.LinkExistingGroupsUseCase$linkExistingGroups$1
            r0.<init>(r2, r5, r4, r3)
            java.lang.Object r2 = X.C380725l.A00(r1, r0)
            X.27J r2 = (X.AnonymousClass27J) r2
            boolean r0 = r2 instanceof X.C27651eH
            X.08M r1 = r7.A0G
            if (r0 != 0) goto L_0x028d
            r1.A0G(r3)
        L_0x02a5:
            boolean r0 = r2 instanceof X.C27631eF
            if (r0 == 0) goto L_0x001e
            X.08M r1 = r7.A0H
            X.1eF r2 = (X.C27631eF) r2
            int r0 = r2.A00
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            goto L_0x028d
        L_0x02b4:
            java.lang.Object r4 = r0.A00
            X.4uZ r4 = (X.C95814uZ) r4
            java.lang.Object r3 = r0.A01
            X.32x r3 = (X.C619532x) r3
            boolean r2 = r0.A03
            java.lang.Object r1 = r0.A02
            X.2y2 r1 = (X.C60122y2) r1
            if (r4 == 0) goto L_0x001e
            java.lang.String r0 = "onContactPicked"
            X.1bI r6 = r3.A02(r0)
            if (r6 == 0) goto L_0x001e
            java.lang.Integer r0 = X.C18290x4.A0b()
            r6.A00 = r0
            X.C619532x.A00(r1, r6, r4, r2)
            X.4FV r0 = r3.A01
            goto L_0x031f
        L_0x02d9:
            java.lang.Object r5 = r0.A00
            X.32x r5 = (X.C619532x) r5
            java.lang.Object r4 = r0.A01
            X.4uZ r4 = (X.C95814uZ) r4
            boolean r3 = r0.A03
            java.lang.Object r2 = r0.A02
            X.2y2 r2 = (X.C60122y2) r2
            r1 = 1
            java.lang.String r0 = "onInviteConfirmed"
            X.1bI r6 = r5.A02(r0)
            if (r6 == 0) goto L_0x001e
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r6.A00 = r0
            X.C619532x.A00(r2, r6, r4, r3)
            X.4FV r0 = r5.A01
            goto L_0x031f
        L_0x02fd:
            java.lang.Object r4 = r0.A00
            X.32x r4 = (X.C619532x) r4
            java.lang.Object r3 = r0.A01
            X.4uZ r3 = (X.C95814uZ) r3
            boolean r2 = r0.A03
            java.lang.Object r1 = r0.A02
            X.2y2 r1 = (X.C60122y2) r1
            java.lang.String r0 = "onContactDeselected"
            X.1bI r6 = r4.A02(r0)
            if (r6 == 0) goto L_0x001e
            java.lang.Integer r0 = X.C18280x3.A0S()
            r6.A00 = r0
            X.C619532x.A00(r1, r6, r3, r2)
            X.4FV r0 = r4.A01
        L_0x031f:
            r0.BhD(r6)
            return
        L_0x0323:
            java.lang.Object r4 = r0.A00
            com.whatsapp.mediaview.MediaViewFragment r4 = (com.whatsapp.mediaview.MediaViewFragment) r4
            java.lang.Object r3 = r0.A01
            X.33C r3 = (X.AnonymousClass33C) r3
            java.lang.Object r2 = r0.A02
            X.1mV r2 = (X.C30471mV) r2
            boolean r1 = r0.A03
            java.io.File r0 = r3.A0F
            if (r0 == 0) goto L_0x03a8
            long r14 = X.C989053r.A01(r0)
        L_0x0339:
            X.2LJ r9 = r4.A17
            X.2z0 r0 = r2.A1J
            boolean r0 = r0.A02
            r13 = 1
            if (r0 == 0) goto L_0x0343
            r13 = 3
        L_0x0343:
            if (r1 == 0) goto L_0x03a6
            int r11 = r4.A05
        L_0x0347:
            int r0 = r2.A0B
            long r0 = (long) r0
            java.io.File r10 = r3.A0F
            int r2 = r3.A08
            long r6 = (long) r2
            int r2 = r3.A06
            long r4 = (long) r2
            r12 = 1
            if (r10 == 0) goto L_0x001e
            X.1b0 r8 = new X.1b0
            r8.<init>()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r8.A08 = r0
            long r2 = java.lang.System.currentTimeMillis()
            long r0 = r10.lastModified()
            long r0 = X.C18280x3.A08(r2, r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r8.A07 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r13)
            r8.A04 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r12)
            r8.A03 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)
            r8.A01 = r0
            long r0 = r10.length()
            java.lang.Double r0 = X.C18330xA.A07(r0)
            r8.A00 = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r6)
            r8.A0B = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            r8.A06 = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r14)
            r8.A05 = r0
            X.4FV r0 = r9.A01
            r0.BhD(r8)
            return
        L_0x03a6:
            r11 = 4
            goto L_0x0347
        L_0x03a8:
            r14 = 0
            goto L_0x0339
        L_0x03ab:
            r1.A0A(r3, r4, r0)
            return
        L_0x03af:
            java.lang.Object r5 = r0.A00
            X.33g r5 = (X.C620433g) r5
            java.lang.Object r4 = r0.A01
            com.whatsapp.jid.UserJid r4 = (com.whatsapp.jid.UserJid) r4
            boolean r3 = r0.A03
            java.lang.Object r2 = r0.A02
            X.4CL r2 = (X.AnonymousClass4CL) r2
            X.5dt r1 = r5.A02(r4)
            X.2ra r0 = r5.A07
            r0.A02(r2, r1, r4, r3)
            return
        L_0x03c7:
            java.lang.Object r7 = r0.A00
            X.2sq r7 = (X.C56962sq) r7
            java.lang.Object r6 = r0.A01
            android.content.Context r6 = (android.content.Context) r6
            java.lang.Object r5 = r0.A02
            X.3ZH r5 = (X.AnonymousClass3ZH) r5
            r4 = 1
            r3 = 2131886806(0x7f1202d6, float:1.9408201E38)
            X.3Wi r2 = r7.A05
            java.lang.Object[] r1 = new java.lang.Object[r4]
            X.5ZU r0 = r7.A0H
            X.C18290x4.A1K(r0, r5, r1)
            java.lang.String r0 = r6.getString(r3, r1)
            r2.A0Q(r0, r4)
            return
        L_0x03e8:
            java.lang.Object r3 = r0.A00
            X.33R r3 = (X.AnonymousClass33R) r3
            boolean r2 = r0.A03
            java.lang.Object r1 = r0.A01
            X.0sA r1 = (X.C15910sA) r1
            java.lang.Object r4 = r0.A02
            X.4GQ r4 = (X.AnonymousClass4GQ) r4
            X.3ZH r0 = r3.A02(r2)
            X.0ni r3 = X.AnonymousClass0IT.A00(r1)
            r2 = 0
            com.whatsapp.bonsai.BonsaiPrewarmer$getDefaultBotForInvoke$1$1 r1 = new com.whatsapp.bonsai.BonsaiPrewarmer$getDefaultBotForInvoke$1$1
            r1.<init>(r0, r2, r4)
            r0 = 3
            X.C616131n.A02(r2, r1, r3, r2, r0)
            return
        L_0x0409:
            java.lang.Object r3 = r0.A00
            X.0y4 r3 = (X.C18670y4) r3
            java.lang.Object r2 = r0.A01
            java.util.concurrent.ScheduledFuture r2 = (java.util.concurrent.ScheduledFuture) r2
            java.lang.Object r1 = r0.A02
            android.net.Network r1 = (android.net.Network) r1
            boolean r0 = r0.A03
            X.C18670y4.A00(r1, r3, r2, r0)
            return
        L_0x041b:
            java.lang.Object r3 = r0.A00
            com.whatsapp.community.CommunityMembersActivity r3 = (com.whatsapp.community.CommunityMembersActivity) r3
            java.lang.Object r2 = r0.A01
            X.4X5 r2 = (X.AnonymousClass4X5) r2
            java.lang.Object r1 = r0.A02
            java.util.List r1 = (java.util.List) r1
            boolean r0 = r0.A03
            r3.A74(r2, r1, r0)
            return
        L_0x042d:
            java.lang.Object r4 = r0.A00
            X.2pi r4 = (X.C55052pi) r4
            boolean r3 = r0.A03
            java.lang.Object r2 = r0.A01
            X.3ZH r2 = (X.AnonymousClass3ZH) r2
            java.lang.Object r1 = r0.A02
            X.4uZ r1 = (X.C95814uZ) r1
            if (r3 != 0) goto L_0x0442
            X.2ro r0 = r4.A06
            r0.A04(r2)
        L_0x0442:
            X.1in r0 = r4.A05
            r0.A09(r1)
            r0.A08(r1)
            return
        L_0x044b:
            java.lang.Object r5 = r0.A00
            com.whatsapp.contact.picker.ContactPickerFragment r5 = (com.whatsapp.contact.picker.ContactPickerFragment) r5
            java.lang.Object r4 = r0.A01
            X.4uY r4 = (X.C95804uY) r4
            java.lang.Object r3 = r0.A02
            X.4uZ r3 = (X.C95814uZ) r3
            boolean r0 = r0.A03
            r19 = r0
            X.8qC r0 = r5.A2o
            java.lang.Object r10 = r0.get()
            X.5Yy r10 = (X.C106425Yy) r10
            java.util.LinkedList r18 = X.AnonymousClass0x9.A18()
            java.util.LinkedList r17 = X.AnonymousClass0x9.A18()
            X.5Xq r16 = new X.5Xq
            r16.<init>()
            java.lang.String r2 = ""
            X.21p r1 = X.C372721p.LINK_CARD
            r0 = 0
            X.2mS r7 = new X.2mS
            r7.<init>(r4, r1, r2, r0)
            X.3Lo r0 = r5.A1g
            X.3ZH r13 = r0.A01(r4)
            android.content.Context r0 = r5.A1D()
            r9 = 0
            X.C162457s7.A0J(r0, r9)
            r8 = 1
            X.00m r6 = X.C107405bG.A01(r0)
            X.1h7 r2 = new X.1h7
            r2.<init>(r6)
            android.content.res.Resources r1 = r2.getResources()
            r0 = 2131167608(0x7f070978, float:1.7949494E38)
            int r15 = r1.getDimensionPixelSize(r0)
            float r14 = (float) r15
            r0 = 1073741824(0x40000000, float:2.0)
            float r14 = r14 / r0
            X.30g r1 = r2.getContactPhotosBitmapManager()
            android.content.Context r0 = r2.getContext()
            android.graphics.Bitmap r1 = r1.A01(r0, r13, r14, r15)
            android.graphics.drawable.Drawable r0 = r2.A00(r1)
            r2.setBackground(r0)
            android.widget.ImageView r12 = r2.A04
            if (r1 != 0) goto L_0x04cf
            X.5UX r0 = r2.getContactAvatars()
            int r11 = r0.A00(r13)
            X.5UX r1 = r2.getContactAvatars()
            android.content.Context r0 = r2.getContext()
            android.graphics.Bitmap r1 = r1.A02(r0, r14, r11, r15)
            X.C162457s7.A0D(r1)
        L_0x04cf:
            r12.setImageBitmap(r1)
            X.5YB r0 = r2.A08
            r0.A08(r13)
            X.2ss r1 = r2.getChatsCache()
            X.4uZ r0 = r13.A0H
            X.31A r12 = r1.A0A(r0, r9)
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.data.NewsletterInfo"
            X.C162457s7.A0K(r12, r0)
            X.1RL r12 = (X.AnonymousClass1RL) r12
            long r0 = r12.A05
            int r11 = (int) r0
            X.5QQ r0 = r2.getNewsletterNumberFormatter()
            int r15 = r0.A00(r11)
            java.lang.String r14 = r0.A01(r15)
            X.C162457s7.A0J(r14, r8)
            android.widget.TextView r13 = r2.A06
            android.content.res.Resources r11 = r2.getResources()
            r1 = 2131755230(0x7f1000de, float:1.9141333E38)
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r9] = r14
            java.lang.String r0 = r11.getQuantityString(r1, r15, r0)
            r13.setText(r0)
            java.lang.String r15 = r12.A0E
            if (r15 == 0) goto L_0x05c1
            boolean r0 = X.C175738Zn.A0V(r15)
            if (r0 != 0) goto L_0x05c1
            X.33i r14 = r2.getSystemServices()
            X.2y5 r13 = r2.getSharedPreferencesFactory()
            android.content.Context r12 = r2.getContext()
            android.widget.TextView r11 = r2.A05
            android.text.TextPaint r1 = r11.getPaint()
            X.5Y0 r0 = r2.getEmojiLoader()
            java.lang.CharSequence r0 = X.C107345b9.A03(r12, r1, r0, r15)
            java.lang.CharSequence r0 = X.C107635bd.A07(r14, r13, r0)
            android.text.SpannableStringBuilder r0 = X.C18330xA.A00(r0)
            r11.setText(r0)
        L_0x053e:
            android.content.res.Resources r1 = r2.getResources()
            r0 = 2131167631(0x7f07098f, float:1.7949541E38)
            int r12 = r1.getDimensionPixelSize(r0)
            android.content.res.Resources r1 = r2.getResources()
            r0 = 2131167627(0x7f07098b, float:1.7949533E38)
            int r11 = r1.getDimensionPixelSize(r0)
            r0 = 1073741824(0x40000000, float:2.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r12, r0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r11, r0)
            r2.measure(r1, r0)
            int r1 = r2.getMeasuredWidth()
            int r0 = r2.getMeasuredHeight()
            r2.layout(r9, r9, r1, r0)
            java.io.File r1 = r10.A02(r6, r2)
            if (r1 == 0) goto L_0x05ab
            android.net.Uri r0 = android.net.Uri.fromFile(r1)
            X.5YF r6 = new X.5YF
            r6.<init>(r0)
            r6.A0E(r1)
            android.view.View r0 = r2.A03
            X.4vH r10 = X.C106425Yy.A00(r0, r7, r8)
            androidx.cardview.widget.CardView r0 = r2.A07
            X.4vH r1 = X.C106425Yy.A00(r0, r7, r9)
            r0 = 2
            X.4vH[] r0 = new X.C95984vH[r0]
            r0[r9] = r10
            java.util.List r0 = X.AnonymousClass0x9.A19(r1, r0, r8)
            X.C106425Yy.A01(r2, r6, r0)
            android.net.Uri r1 = r6.A0G
            r0 = r18
            r0.add(r1)
            java.io.File r1 = r6.A07()
            r0 = r17
            r0.add(r1)
            r0 = r16
            r0.A04(r6)
        L_0x05ab:
            X.3Wi r1 = r5.A0a
            X.3bL r0 = new X.3bL
            r11 = r7
            r12 = r18
            r13 = r17
            r14 = r19
            r6 = r0
            r7 = r5
            r8 = r16
            r9 = r3
            r10 = r4
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14)
            goto L_0x0782
        L_0x05c1:
            android.widget.TextView r1 = r2.A05
            r0 = 8
            r1.setVisibility(r0)
            goto L_0x053e
        L_0x05ca:
            java.lang.Object r2 = r0.A00
            X.4oJ r2 = (X.C93314oJ) r2
            java.lang.Object r1 = r0.A01
            X.32K r1 = (X.AnonymousClass32K) r1
            boolean r6 = r0.A03
            java.lang.Object r5 = r0.A02
            X.1mW r5 = (X.C30481mW) r5
            X.4Fm r4 = r2.A0Y
            android.content.Context r3 = r2.getContext()
            java.lang.String r0 = r1.A03
            android.net.Uri r2 = android.net.Uri.parse(r0)
            r1 = 0
            if (r6 == 0) goto L_0x05e8
            r1 = r5
        L_0x05e8:
            int r0 = r5.A00
            r4.BkX(r3, r2, r1, r0)
            return
        L_0x05ee:
            java.lang.Object r5 = r0.A00
            X.2sA r5 = (X.C56542sA) r5
            boolean r1 = r0.A03
            java.lang.Object r4 = r0.A01
            X.4uZ r4 = (X.C95814uZ) r4
            java.lang.Object r3 = r0.A02
            X.31A r3 = (X.AnonymousClass31A) r3
            if (r1 == 0) goto L_0x0632
            X.8qC r0 = r5.A02
            X.2UO r0 = X.C18310x6.A0Q(r0)
            X.3Gp r1 = r0.A04
            r0 = 0
            java.util.Set r2 = r1.A08(r4, r0)
        L_0x060b:
            X.8qC r1 = r5.A02
            X.2UO r0 = X.C18310x6.A0Q(r1)
            X.2sm r0 = r0.A0C
            r0.A0J(r3)
            X.2UO r0 = X.C18310x6.A0Q(r1)
            X.3Gp r0 = r0.A04
            r0.A0O(r2)
            X.2UO r0 = X.C18310x6.A0Q(r1)
            X.1hu r3 = r0.A0B
            X.3Wh r2 = r3.A00
            r1 = 15
            X.3Zw r0 = new X.3Zw
            r0.<init>(r3, r1, r4)
            X.C69253Wh.A01(r2, r0)
            return
        L_0x0632:
            java.util.Set r2 = java.util.Collections.emptySet()
            goto L_0x060b
        L_0x0637:
            java.lang.Object r3 = r0.A00
            X.2sA r3 = (X.C56542sA) r3
            java.lang.Object r4 = r0.A01
            X.4uZ r4 = (X.C95814uZ) r4
            java.lang.Object r2 = r0.A02
            java.lang.Number r2 = (java.lang.Number) r2
            boolean r1 = r0.A03
            X.8qC r0 = r3.A02
            X.2UO r0 = X.C18310x6.A0Q(r0)
            X.7am r3 = r0.A01
            int r8 = r2.intValue()
            r9 = r1 ^ 1
            r5 = 0
            r10 = 0
            r7 = r5
            r6 = r5
            r3.A02(r4, r5, r6, r7, r8, r9, r10)
            return
        L_0x065b:
            java.lang.Object r5 = r0.A00
            X.3Lv r5 = (X.C66543Lv) r5
            boolean r4 = r0.A03
            java.lang.Object r3 = r0.A01
            java.util.Collection r3 = (java.util.Collection) r3
            java.lang.Object r2 = r0.A02
            X.4uZ r2 = (X.C95814uZ) r2
            X.1io r1 = r5.A14
            if (r4 == 0) goto L_0x0678
            r0 = 0
            r1.A0F(r3, r0)
        L_0x0671:
            X.1hu r1 = r5.A0U
            r0 = 0
            r1.A0A(r2, r0)
            return
        L_0x0678:
            r1.A08(r2)
            goto L_0x0671
        L_0x067c:
            java.lang.Object r7 = r0.A00
            X.33h r7 = (X.C620533h) r7
            java.lang.Object r6 = r0.A01
            X.1fL r6 = (X.C28011fL) r6
            java.lang.Object r5 = r0.A02
            X.2zG r5 = (X.C60842zG) r5
            boolean r4 = r0.A03
            X.4Fq r3 = X.C620533h.A02(r7)
            X.3Yo r2 = r3.Axl()     // Catch:{ all -> 0x06b6 }
            X.34p r1 = r7.A09     // Catch:{ all -> 0x06ac }
            com.whatsapp.jid.UserJid r0 = r5.A03     // Catch:{ all -> 0x06ac }
            long r0 = r1.A05(r0)     // Catch:{ all -> 0x06ac }
            r7.A0N(r6, r0)     // Catch:{ all -> 0x06ac }
            if (r4 == 0) goto L_0x06a2
            r7.A0E(r5, r6)     // Catch:{ all -> 0x06ac }
        L_0x06a2:
            r2.A00()     // Catch:{ all -> 0x06ac }
            r2.close()     // Catch:{ all -> 0x06b6 }
            r3.close()
            return
        L_0x06ac:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x06b1 }
            goto L_0x06b5
        L_0x06b1:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x06b6 }
        L_0x06b5:
            throw r1     // Catch:{ all -> 0x06b6 }
        L_0x06b6:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x06bb }
            throw r1
        L_0x06bb:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x06c0:
            java.lang.Object r1 = r0.A00
            X.3H3 r1 = (X.AnonymousClass3H3) r1
            java.lang.Object r8 = r0.A01
            X.2fi r8 = (X.C48932fi) r8
            boolean r7 = r0.A03
            java.lang.Object r6 = r0.A02
            X.1iB r5 = r1.A01
            java.lang.Object r4 = r5.A0P
            monitor-enter(r4)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x071a }
            java.lang.String r0 = "companion-device-manager/critical sync failed. DeviceJid: "
            r1.append(r0)     // Catch:{ all -> 0x071a }
            X.33G r0 = r8.A02     // Catch:{ all -> 0x071a }
            com.whatsapp.jid.DeviceJid r0 = r0.A07     // Catch:{ all -> 0x071a }
            X.C18260x0.A0o(r0, r1)     // Catch:{ all -> 0x071a }
            X.30l r0 = r5.A0B     // Catch:{ all -> 0x071a }
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x071a }
            android.content.SharedPreferences$Editor r1 = X.C613730l.A00(r0)     // Catch:{ all -> 0x071a }
            java.lang.String r0 = "syncd_bootstrap_fail_time"
            X.C18270x1.A0i(r1, r0, r2)     // Catch:{ all -> 0x071a }
            java.util.Iterator r1 = X.C61102zi.A03(r5)     // Catch:{ all -> 0x071a }
        L_0x06f5:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x071a }
            if (r0 == 0) goto L_0x0705
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x071a }
            X.4FJ r0 = (X.AnonymousClass4FJ) r0     // Catch:{ all -> 0x071a }
            r0.BQS(r8)     // Catch:{ all -> 0x071a }
            goto L_0x06f5
        L_0x0705:
            if (r7 == 0) goto L_0x0708
            goto L_0x070c
        L_0x0708:
            java.lang.String r0 = "syncd_failure"
            goto L_0x070e
        L_0x070c:
            java.lang.String r0 = "critical_sync_timeout"
        L_0x070e:
            r5.A0J(r0)     // Catch:{ all -> 0x071a }
            X.2nP r0 = r5.A0J     // Catch:{ all -> 0x071a }
            X.1i4 r0 = r0.A04     // Catch:{ all -> 0x071a }
            r0.A07(r6)     // Catch:{ all -> 0x071a }
            monitor-exit(r4)     // Catch:{ all -> 0x071a }
            return
        L_0x071a:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x071a }
            throw r0
        L_0x071d:
            java.lang.Object r3 = r0.A00
            X.7l0 r3 = (X.C159047l0) r3
            java.lang.Object r2 = r0.A01
            X.7o1 r2 = (X.C160627o1) r2
            boolean r1 = r0.A03
            java.lang.Object r0 = r0.A02
            X.2pM r0 = (X.C54832pM) r0
            r3.A06(r2, r0, r1)
            return
        L_0x072f:
            boolean r1 = r0.A03
            java.lang.Object r5 = r0.A00
            X.2SU r5 = (X.AnonymousClass2SU) r5
            java.lang.Object r4 = r0.A01
            X.4GQ r4 = (X.AnonymousClass4GQ) r4
            java.lang.Object r6 = r0.A02
            X.4GQ r6 = (X.AnonymousClass4GQ) r6
            if (r1 != 0) goto L_0x0786
            X.2kc r0 = r5.A02
            X.66R r0 = r0.A01
            android.content.SharedPreferences r1 = X.C18310x6.A0F(r0)
            java.lang.String r0 = "pref_avatar_preview_cache_url"
            java.lang.String r3 = X.C18280x3.A0Z(r1, r0)
            if (r3 == 0) goto L_0x0786
            X.8qC r0 = r5.A04
            java.lang.Object r2 = r0.get()
            X.2gt r2 = (X.C49662gt) r2
            X.C162457s7.A0H(r2)
            r1 = 0
            X.38j r0 = new X.38j
            r0.<init>(r3, r1)
            java.util.List r1 = X.C18290x4.A12(r0)
            r0 = 0
            java.util.List r0 = r2.A01(r1, r0, r0)
            java.lang.Object r0 = X.C73723fy.A04(r0)
            X.2kd r0 = (X.C51942kd) r0
            if (r0 == 0) goto L_0x0786
            android.graphics.Bitmap r0 = r0.A00
            android.graphics.Bitmap r2 = X.C57452tf.A00(r0)
            if (r2 == 0) goto L_0x0786
            X.3Wi r1 = r5.A00
            r0 = 8
            X.3a0 r0 = X.C70133a0.A00(r4, r2, r0)
        L_0x0782:
            r1.A0S(r0)
            return
        L_0x0786:
            X.4C1 r0 = r5.A05
            java.lang.Object r2 = r0.get()
            X.2Li r2 = (X.C41722Li) r2
            X.4B1 r1 = r2.A01
            r7 = 2
            X.4Kl r0 = new X.4Kl
            r0.<init>(r2, r7)
            X.3Os r3 = r1.B03(r0)
            X.448 r2 = new X.448
            r2.<init>(r5, r6, r4)
            X.43v r1 = new X.43v
            r1.<init>(r5, r6)
            X.4Kd r0 = new X.4Kd
            r0.<init>(r2, r7, r1)
            r3.Bh4(r0)
            return
        L_0x07ad:
            java.lang.Object r4 = r0.A01     // Catch:{ InterruptedException -> 0x08d4 }
            com.whatsapp.mediaview.MediaViewFragment r4 = (com.whatsapp.mediaview.MediaViewFragment) r4     // Catch:{ InterruptedException -> 0x08d4 }
            X.5ZR r1 = r4.A0k     // Catch:{ InterruptedException -> 0x08d4 }
            boolean r8 = r1.A0C()     // Catch:{ InterruptedException -> 0x08d4 }
        L_0x07b7:
            boolean r1 = r0.A03     // Catch:{ InterruptedException -> 0x08d4 }
            if (r1 != 0) goto L_0x08da
            java.lang.Object r2 = r0.A00     // Catch:{ InterruptedException -> 0x08d4 }
            java.util.Stack r2 = (java.util.Stack) r2     // Catch:{ InterruptedException -> 0x08d4 }
            int r1 = r2.size()     // Catch:{ InterruptedException -> 0x08d4 }
            if (r1 != 0) goto L_0x07ca
            monitor-enter(r2)     // Catch:{ InterruptedException -> 0x08d4 }
            r2.wait()     // Catch:{ all -> 0x08ce }
            monitor-exit(r2)     // Catch:{ all -> 0x08ce }
        L_0x07ca:
            boolean r1 = r0.A03     // Catch:{ InterruptedException -> 0x08d4 }
            if (r1 != 0) goto L_0x08da
            int r1 = r2.size()     // Catch:{ InterruptedException -> 0x08d4 }
            if (r1 == 0) goto L_0x07b7
            monitor-enter(r2)     // Catch:{ InterruptedException -> 0x08d4 }
            java.lang.Object r3 = r2.pop()     // Catch:{ all -> 0x08d1 }
            X.2kQ r3 = (X.C51812kQ) r3     // Catch:{ all -> 0x08d1 }
            monitor-exit(r2)     // Catch:{ all -> 0x08d1 }
            X.1mV r6 = r3.A01     // Catch:{ InterruptedException -> 0x08d4 }
            X.33C r5 = X.C30471mV.A00(r6)     // Catch:{ InterruptedException -> 0x08d4 }
            java.io.File r2 = r5.A0F     // Catch:{ InterruptedException -> 0x08d4 }
            r10 = 0
            if (r2 == 0) goto L_0x08c9
            if (r8 == 0) goto L_0x08c9
            boolean r1 = r6 instanceof X.AnonymousClass1n2     // Catch:{ InterruptedException -> 0x08d4 }
            r15 = 1
            if (r1 != 0) goto L_0x080a
            boolean r1 = r6 instanceof X.AnonymousClass1n3     // Catch:{ InterruptedException -> 0x08d4 }
            if (r1 != 0) goto L_0x080a
            byte r1 = r6.A1I     // Catch:{ InterruptedException -> 0x08d4 }
            boolean r1 = X.AnonymousClass35Z.A00(r1)     // Catch:{ InterruptedException -> 0x08d4 }
            if (r1 == 0) goto L_0x08c4
            android.graphics.Bitmap r9 = X.C107085af.A01(r2)     // Catch:{ OutOfMemoryError -> 0x0807 }
            if (r9 != 0) goto L_0x08b7
            java.lang.String r1 = "MediaViewFragment/PhotoLoader/run/fillView/bitmap/null"
            com.whatsapp.util.Log.w((java.lang.String) r1)     // Catch:{ OutOfMemoryError -> 0x0807 }
            goto L_0x08c4
        L_0x0807:
            r2 = move-exception
            goto L_0x08bc
        L_0x080a:
            boolean r1 = r4.A1t(r6)     // Catch:{ InterruptedException -> 0x08d4 }
            if (r1 == 0) goto L_0x0862
            X.2r1 r6 = r4.A1C     // Catch:{ InterruptedException -> 0x08d4 }
            X.2y5 r2 = r6.A05     // Catch:{ InterruptedException -> 0x08d4 }
            X.33i r1 = r6.A00     // Catch:{ InterruptedException -> 0x08d4 }
            int r7 = X.AnonymousClass34G.A02(r1, r2)     // Catch:{ InterruptedException -> 0x08d4 }
            X.1VX r6 = r6.A02     // Catch:{ InterruptedException -> 0x08d4 }
            r2 = 3303(0xce7, float:4.628E-42)
            X.2vE r1 = X.C58422vE.A02     // Catch:{ InterruptedException -> 0x08d4 }
            int r1 = r6.A0O(r1, r2)     // Catch:{ InterruptedException -> 0x08d4 }
            if (r7 < r1) goto L_0x0862
            int r1 = r5.A08     // Catch:{ InterruptedException -> 0x08d4 }
            r2 = 6000(0x1770, float:8.408E-42)
            int r7 = java.lang.Math.min(r1, r2)     // Catch:{ InterruptedException -> 0x08d4 }
            int r1 = r5.A06     // Catch:{ InterruptedException -> 0x08d4 }
            int r6 = java.lang.Math.min(r1, r2)     // Catch:{ InterruptedException -> 0x08d4 }
        L_0x0834:
            X.1VX r2 = r4.A0z     // Catch:{ InterruptedException -> 0x08d4 }
            X.03q r1 = r4.A0R()     // Catch:{ InterruptedException -> 0x08d4 }
            android.view.WindowManager r1 = r1.getWindowManager()     // Catch:{ InterruptedException -> 0x08d4 }
            java.lang.Long r11 = X.AnonymousClass29J.A00(r1, r2)     // Catch:{ InterruptedException -> 0x08d4 }
            if (r11 != 0) goto L_0x084d
            int r7 = r7 * r6
            long r1 = (long) r7     // Catch:{ InterruptedException -> 0x08d4 }
            r6 = 4
            long r1 = r1 * r6
            java.lang.Long r11 = java.lang.Long.valueOf(r1)     // Catch:{ InterruptedException -> 0x08d4 }
        L_0x084d:
            java.io.File r1 = r5.A0F     // Catch:{ InterruptedException -> 0x08d4 }
            if (r1 == 0) goto L_0x0889
            r12 = 2147483647(0x7fffffff, float:NaN)
            r14 = 0
            X.5WB r9 = new X.5WB     // Catch:{ InterruptedException -> 0x08d4 }
            r13 = r12
            r9.<init>(r10, r11, r12, r13, r14)     // Catch:{ InterruptedException -> 0x08d4 }
            X.7KE r1 = X.C107245ax.A06(r9, r1)     // Catch:{ InterruptedException -> 0x08d4 }
            android.graphics.Bitmap r9 = r1.A02     // Catch:{ InterruptedException -> 0x08d4 }
            goto L_0x088a
        L_0x0862:
            com.whatsapp.mediaview.PhotoView r1 = r3.A00     // Catch:{ InterruptedException -> 0x08d4 }
            int r7 = r1.getWidth()     // Catch:{ InterruptedException -> 0x08d4 }
            int r6 = r1.getHeight()     // Catch:{ InterruptedException -> 0x08d4 }
            if (r7 == 0) goto L_0x0870
            if (r6 != 0) goto L_0x0834
        L_0x0870:
            android.content.Context r1 = r4.A0G()     // Catch:{ InterruptedException -> 0x08d4 }
            android.view.WindowManager r1 = X.C620633i.A01(r1)     // Catch:{ InterruptedException -> 0x08d4 }
            android.view.Display r2 = r1.getDefaultDisplay()     // Catch:{ InterruptedException -> 0x08d4 }
            android.graphics.Point r1 = new android.graphics.Point     // Catch:{ InterruptedException -> 0x08d4 }
            r1.<init>()     // Catch:{ InterruptedException -> 0x08d4 }
            r2.getSize(r1)     // Catch:{ InterruptedException -> 0x08d4 }
            int r7 = r1.x     // Catch:{ InterruptedException -> 0x08d4 }
            int r6 = r1.y     // Catch:{ InterruptedException -> 0x08d4 }
            goto L_0x0834
        L_0x0889:
            r9 = r10
        L_0x088a:
            java.io.File r1 = r5.A0F     // Catch:{ IOException -> 0x089a }
            java.lang.String r2 = r1.getAbsolutePath()     // Catch:{ IOException -> 0x089a }
            X.0YU r1 = new X.0YU     // Catch:{ IOException -> 0x089a }
            r1.<init>((java.lang.String) r2)     // Catch:{ IOException -> 0x089a }
            int r1 = r1.A0G(r15)     // Catch:{ IOException -> 0x089a }
            goto L_0x08a1
        L_0x089a:
            r2 = move-exception
            java.lang.String r1 = "MediaViewFragment/PhotoLoader/run/getExif"
            com.whatsapp.util.Log.e(r1, r2)     // Catch:{ InterruptedException -> 0x08d4 }
            r1 = 1
        L_0x08a1:
            if (r9 == 0) goto L_0x08c4
            if (r1 == r15) goto L_0x08b7
            r10 = 0
            int r12 = r9.getWidth()     // Catch:{ InterruptedException -> 0x08d4 }
            int r13 = r9.getHeight()     // Catch:{ InterruptedException -> 0x08d4 }
            android.graphics.Matrix r14 = X.C107655bf.A0J(r1)     // Catch:{ InterruptedException -> 0x08d4 }
            r11 = r10
            android.graphics.Bitmap r9 = android.graphics.Bitmap.createBitmap(r9, r10, r11, r12, r13, r14, r15)     // Catch:{ InterruptedException -> 0x08d4 }
        L_0x08b7:
            r0.A00(r9, r3)     // Catch:{ InterruptedException -> 0x08d4 }
            goto L_0x07b7
        L_0x08bc:
            java.lang.String r1 = "MediaViewFragment/PhotoLoader/run/oom"
            com.whatsapp.util.Log.e(r1, r2)     // Catch:{ InterruptedException -> 0x08d4 }
            java.lang.System.gc()     // Catch:{ InterruptedException -> 0x08d4 }
        L_0x08c4:
            r0.A00(r10, r3)     // Catch:{ InterruptedException -> 0x08d4 }
            goto L_0x07b7
        L_0x08c9:
            r0.A00(r10, r3)     // Catch:{ InterruptedException -> 0x08d4 }
            goto L_0x07b7
        L_0x08ce:
            r1 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x08ce }
            goto L_0x08d3
        L_0x08d1:
            r1 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x08d1 }
        L_0x08d3:
            throw r1     // Catch:{ InterruptedException -> 0x08d4 }
        L_0x08d4:
            r2 = move-exception
            java.lang.String r1 = "MediaViewFragment/PhotoLoader/run/e = "
            com.whatsapp.util.Log.e(r1, r2)
        L_0x08da:
            java.lang.Object r0 = r0.A00
            java.util.AbstractCollection r0 = (java.util.AbstractCollection) r0
            r0.clear()
            return
        L_0x08e2:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x08e5:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x08e5 }
            throw r0
        L_0x08e8:
            r4.clear()
            return
        L_0x08ec:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x08ec }
            throw r0
        L_0x08ef:
            X.5ZU r0 = r7.A2Q
            r3 = 1
            X.33j r0 = r0.A03
            java.lang.String r2 = X.AnonymousClass5VS.A00(r0, r4, r3)
            android.content.Context r1 = r7.A1W
            r0 = 2131894544(0x7f122110, float:1.9423896E38)
            java.lang.String r0 = X.AnonymousClass0x2.A0X(r1, r2, r3, r0)
            r7.A0k(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71643cR.run():void");
    }

    public C71643cR(Object obj, Object obj2, Object obj3, int i, boolean z) {
        this.A04 = i;
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = obj3;
        this.A03 = z;
    }

    public C71643cR(MediaViewFragment mediaViewFragment) {
        this.A04 = 22;
        this.A01 = mediaViewFragment;
        this.A00 = new Stack();
        this.A02 = new C173778Rq(this, "PhotoLoader");
    }
}
