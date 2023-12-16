package X;

/* renamed from: X.5sI  reason: invalid class name and case insensitive filesystem */
public class C117665sI implements Runnable {
    public Object A00;
    public Object A01;
    public boolean A02;
    public final int A03;

    public C117665sI(C48972fm r2, Runnable runnable) {
        this.A03 = 21;
        this.A00 = r2;
        this.A02 = true;
        this.A01 = runnable;
    }

    public static void A00(C69263Wi r1, Object obj, Object obj2, int i, boolean z) {
        r1.A0S(new C117665sI(obj, obj2, i, z));
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:871)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:128)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:497:0x0c2c  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0167  */
    /* JADX WARNING: Removed duplicated region for block: B:684:0x1050  */
    /* JADX WARNING: Removed duplicated region for block: B:687:0x1060  */
    /* JADX WARNING: Removed duplicated region for block: B:695:0x1071  */
    /* JADX WARNING: Removed duplicated region for block: B:702:0x1084  */
    /* JADX WARNING: Removed duplicated region for block: B:733:0x10e5  */
    /* JADX WARNING: Removed duplicated region for block: B:738:0x1118  */
    /* JADX WARNING: Removed duplicated region for block: B:884:? A[RETURN, SYNTHETIC] */
    public void run() {
        /*
            r40 = this;
            r1 = r40
            int r0 = r1.A03
            switch(r0) {
                case 0: goto L_0x0562;
                case 1: goto L_0x11a6;
                case 2: goto L_0x0355;
                case 3: goto L_0x117e;
                case 4: goto L_0x031d;
                case 5: goto L_0x02fd;
                case 6: goto L_0x1170;
                case 7: goto L_0x1162;
                case 8: goto L_0x02bb;
                case 9: goto L_0x113b;
                case 10: goto L_0x0ebf;
                case 11: goto L_0x0ea4;
                case 12: goto L_0x0e7d;
                case 13: goto L_0x0e37;
                case 14: goto L_0x1205;
                case 15: goto L_0x029e;
                case 16: goto L_0x08f0;
                case 17: goto L_0x08dd;
                case 18: goto L_0x0245;
                case 19: goto L_0x01d9;
                case 20: goto L_0x08cf;
                case 21: goto L_0x08b9;
                case 22: goto L_0x0845;
                case 23: goto L_0x0814;
                case 24: goto L_0x01bb;
                case 25: goto L_0x0806;
                case 26: goto L_0x07f5;
                case 27: goto L_0x019e;
                case 28: goto L_0x07de;
                case 29: goto L_0x0126;
                case 30: goto L_0x0105;
                case 31: goto L_0x00e0;
                case 32: goto L_0x00c0;
                case 33: goto L_0x00a0;
                case 34: goto L_0x0080;
                case 35: goto L_0x07af;
                case 36: goto L_0x079c;
                case 37: goto L_0x0050;
                case 38: goto L_0x05e1;
                case 39: goto L_0x0595;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r1.A00
            com.whatsapp.voipcalling.VoipActivityV2 r0 = (com.whatsapp.voipcalling.VoipActivityV2) r0
            java.lang.Object r7 = r1.A01
            com.whatsapp.voipcalling.CallInfo r7 = (com.whatsapp.voipcalling.CallInfo) r7
            boolean r5 = r1.A02
            X.32x r6 = r0.A1Q
            X.5b3 r4 = r0.A16
            java.lang.String r3 = r7.callId
            X.2sH r2 = r4.A2X
            X.2sr r1 = r4.A1e
            r0 = 1
            byte[] r0 = X.AnonymousClass35J.A03(r1, r2, r0)
            java.lang.String r0 = X.C627236i.A06(r0)
            java.lang.String r8 = r4.A0A(r3, r0)
            r9 = 4
            if (r5 == 0) goto L_0x002c
            r9 = 5
        L_0x002c:
            r0 = 1
            X.C162457s7.A0J(r8, r0)
            X.66R r0 = X.C619532x.A04
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            boolean r0 = X.AnonymousClass0x7.A1U(r0, r9)
            if (r0 != 0) goto L_0x0589
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Cannot start a session from subSurface:"
            java.lang.String r1 = X.AnonymousClass000.A0Y(r0, r1, r9)
            r0 = 0
            X.C626936e.A0D(r0, r1)
        L_0x004c:
            com.whatsapp.util.Log.e((java.lang.String) r1)
        L_0x004f:
            return
        L_0x0050:
            java.lang.Object r0 = r1.A00
            X.2Zx r0 = (X.C45402Zx) r0
            java.lang.Object r8 = r1.A01
            X.4uY r8 = (X.C95804uY) r8
            boolean r7 = r1.A02
            X.1io r6 = r0.A01
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "MessageObservers/notifyNewsletterHistoricalMessagesFetched "
            X.C18260x0.A1D(r0, r1, r7)
            java.util.Iterator r5 = X.C61102zi.A03(r6)
        L_0x0069:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x004f
            java.lang.Object r4 = r5.next()
            X.4FW r4 = (X.AnonymousClass4FW) r4
            long r2 = r6.A00
            r0 = 1
            long r2 = r2 + r0
            r6.A00 = r2
            r4.BX5(r8, r7)
            goto L_0x0069
        L_0x0080:
            java.lang.Object r6 = r1.A00
            X.2iB r6 = (X.C50442iB) r6
            java.lang.Object r5 = r1.A01
            com.whatsapp.jid.DeviceJid[] r5 = (com.whatsapp.jid.DeviceJid[]) r5
            boolean r4 = r1.A02
            int r3 = r5.length
            r2 = 0
        L_0x008c:
            if (r2 >= r3) goto L_0x004f
            r1 = r5[r2]
            boolean r0 = r1.isPrimary()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x009d
            X.33Z r0 = r6.A08
            r0.A09(r1, r4)
        L_0x009d:
            int r2 = r2 + 1
            goto L_0x008c
        L_0x00a0:
            java.lang.Object r6 = r1.A00
            X.2iB r6 = (X.C50442iB) r6
            java.lang.Object r5 = r1.A01
            com.whatsapp.jid.DeviceJid[] r5 = (com.whatsapp.jid.DeviceJid[]) r5
            boolean r4 = r1.A02
            int r3 = r5.length
            r2 = 0
        L_0x00ac:
            if (r2 >= r3) goto L_0x004f
            r1 = r5[r2]
            boolean r0 = r1.isPrimary()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x00bd
            X.33Z r0 = r6.A08
            r0.A09(r1, r4)
        L_0x00bd:
            int r2 = r2 + 1
            goto L_0x00ac
        L_0x00c0:
            java.lang.Object r3 = r1.A00
            com.whatsapp.mediaview.MediaViewFragment r3 = (com.whatsapp.mediaview.MediaViewFragment) r3
            java.lang.Object r2 = r1.A01
            X.1mV r2 = (X.C30471mV) r2
            boolean r0 = r1.A02
            if (r2 == 0) goto L_0x004f
            if (r0 == 0) goto L_0x004f
            X.03q r0 = r3.A0Q()
            if (r0 == 0) goto L_0x004f
            boolean r0 = r0.isFinishing()
            if (r0 != 0) goto L_0x004f
            r1 = 0
            r0 = 1
            r3.A1r(r2, r1, r0)
            return
        L_0x00e0:
            java.lang.Object r3 = r1.A00
            X.5cU r3 = (X.C108145cU) r3
            boolean r2 = r1.A02
            java.lang.Object r4 = r1.A01
            android.location.Location r4 = (android.location.Location) r4
            X.5dv r0 = r3.A0g
            if (r0 == 0) goto L_0x00f0
            if (r2 == 0) goto L_0x004f
        L_0x00f0:
            float r0 = r4.getAccuracy()
            int r1 = (int) r0
            r0 = 100
            int r6 = java.lang.Math.max(r1, r0)
            r5 = 0
            r7 = 1
            boolean r0 = r3.A0u
            r8 = r0 ^ 1
            r3.A0J(r4, r5, r6, r7, r8)
            return
        L_0x0105:
            java.lang.Object r3 = r1.A00
            com.whatsapp.gesture.VerticalSwipeDismissBehavior r3 = (com.whatsapp.gesture.VerticalSwipeDismissBehavior) r3
            X.0WM r2 = r3.A04
            if (r2 == 0) goto L_0x0116
            r0 = 1
            boolean r0 = r2.A0I(r0)
            if (r0 == 0) goto L_0x0116
            goto L_0x0571
        L_0x0116:
            X.8u7 r3 = r3.A05
            if (r3 == 0) goto L_0x004f
            boolean r2 = r1.A02
            java.lang.Object r0 = r1.A01
            android.view.View r0 = (android.view.View) r0
            if (r2 == 0) goto L_0x11e2
            r3.BRJ(r0)
            return
        L_0x0126:
            java.lang.Object r5 = r1.A00
            X.55F r5 = (X.AnonymousClass55F) r5
            java.lang.Object r4 = r1.A01
            java.util.List r4 = (java.util.List) r4
            boolean r2 = r1.A02
            boolean r0 = X.C18320x8.A1T(r5)
            if (r0 != 0) goto L_0x004f
            X.7Du r1 = r5.A04
            int r0 = r5.A01
            com.whatsapp.gallery.MediaGalleryFragmentBase r3 = r1.A00
            r3.A01 = r0
            java.lang.String r7 = " incomplete buckets"
            java.lang.String r6 = "LoadSectionsTask/added "
            if (r2 == 0) goto L_0x016c
            java.lang.String r0 = "LoadSectionsTask/reported incomplete buckets"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            int r0 = r5.A00
            if (r0 != 0) goto L_0x015c
            java.lang.StringBuilder r0 = X.AnonymousClass001.A0o()
            X.AnonymousClass000.A1H(r6, r0, r4)
            X.C18260x0.A1J(r0, r7)
        L_0x0157:
            java.util.List r0 = r5.A07
            r0.addAll(r4)
        L_0x015c:
            r3.A1P()
            java.util.List r0 = r3.A0d
            boolean r0 = X.C18310x6.A1X(r0)
            if (r0 == 0) goto L_0x004f
            r0 = 0
            r3.A1U(r0)
            return
        L_0x016c:
            int r0 = r5.A00
            if (r0 != 0) goto L_0x0188
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "LoadSectionsTask/clear "
            r2.append(r0)
            java.util.List r1 = r5.A07
            int r0 = r1.size()
            r2.append(r0)
            X.C18260x0.A1J(r2, r7)
            r1.clear()
        L_0x0188:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            X.AnonymousClass000.A1H(r6, r1, r4)
            java.lang.String r0 = " buckets"
            X.C18260x0.A1J(r1, r0)
            int r1 = r5.A00
            int r0 = r4.size()
            int r1 = r1 + r0
            r5.A00 = r1
            goto L_0x0157
        L_0x019e:
            java.lang.Object r2 = r1.A00
            X.2qw r2 = (X.C55802qw) r2
            java.lang.Object r3 = r1.A01
            boolean r0 = r1.A02
            X.3XB r2 = r2.A00
            java.lang.Object r1 = r2.A01()
            java.util.Map r1 = (java.util.Map) r1
            if (r1 == 0) goto L_0x004f
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.put(r3, r0)
            r2.A05(r1)
            return
        L_0x01bb:
            java.lang.Object r0 = r1.A00
            X.2zi r0 = (X.C61102zi) r0
            java.lang.Object r3 = r1.A01
            X.4uZ r3 = (X.C95814uZ) r3
            boolean r2 = r1.A02
            java.util.Iterator r1 = X.C61102zi.A03(r0)
        L_0x01c9:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x004f
            java.lang.Object r0 = r1.next()
            X.4FD r0 = (X.AnonymousClass4FD) r0
            r0.BLe(r3, r2)
            goto L_0x01c9
        L_0x01d9:
            java.lang.Object r2 = r1.A00
            X.69r r2 = (X.C1237669r) r2
            java.lang.Object r4 = r1.A01
            X.4uZ r4 = (X.C95814uZ) r4
            boolean r3 = r1.A02
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "conversations/group/toggleGroupProgressbar/:"
            X.C18260x0.A1R(r1, r0, r4)
            java.lang.Object r2 = r2.A00
            com.whatsapp.conversationslist.ConversationsFragment r2 = (com.whatsapp.conversationslist.ConversationsFragment) r2
            android.view.View r1 = r2.A1M(r4)
            if (r1 == 0) goto L_0x0205
            r0 = 2131432741(0x7f0b1525, float:1.8487248E38)
            android.view.View r1 = r1.findViewById(r0)
            int r0 = X.AnonymousClass001.A08(r3)
            r1.setVisibility(r0)
            return
        L_0x0205:
            android.widget.ListView r0 = r2.A0E
            if (r0 == 0) goto L_0x004f
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "conversations/refresh: no view for "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = " "
            r1.append(r0)
            android.widget.ListView r0 = r2.A0E
            int r0 = r0.getFirstVisiblePosition()
            r1.append(r0)
            java.lang.String r0 = "-"
            r1.append(r0)
            android.widget.ListView r0 = r2.A0E
            int r0 = r0.getLastVisiblePosition()
            r1.append(r0)
            java.lang.String r0 = " ("
            r1.append(r0)
            android.widget.ListView r0 = r2.A0E
            int r0 = r0.getCount()
            r1.append(r0)
            java.lang.String r0 = ")"
            X.C18260x0.A1M(r1, r0)
            return
        L_0x0245:
            java.lang.Object r3 = r1.A00
            X.4UA r3 = (X.AnonymousClass4UA) r3
            java.lang.Object r5 = r1.A01
            X.3Ls r5 = (X.C66513Ls) r5
            boolean r2 = r1.A02
            boolean r0 = r3.A0R()
            if (r0 == 0) goto L_0x11ff
            if (r5 == 0) goto L_0x0262
            java.lang.String r1 = r3.A07
            java.lang.String r0 = r5.A0Z
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 != 0) goto L_0x0262
            return
        L_0x0262:
            if (r2 == 0) goto L_0x028a
            if (r5 == 0) goto L_0x11e6
            boolean r0 = r5.A0F()
            if (r0 == 0) goto L_0x11e6
            X.08M r3 = r3.A0H
            java.lang.Object r0 = r3.A07()
            X.5SA r0 = (X.AnonymousClass5SA) r0
            if (r0 == 0) goto L_0x004f
            X.59D r0 = r0.A01
            int r1 = r0.value
            X.59D r2 = X.AnonymousClass59D.SMALL_THUMBNAIL_LOADED
            int r0 = r2.value
            if (r1 >= r0) goto L_0x004f
            r1 = 0
        L_0x0281:
            X.5SA r0 = new X.5SA
            r0.<init>(r5, r2, r1)
            r3.A0H(r0)
            return
        L_0x028a:
            if (r5 == 0) goto L_0x004f
            boolean r0 = r5.A0F()
            if (r0 == 0) goto L_0x004f
            X.08M r3 = r3.A0H
            X.59D r2 = X.AnonymousClass59D.WEB_PAGE_LOADED
            java.lang.String r1 = r5.A07()     // Catch:{ MalformedURLException -> 0x029b }
            goto L_0x0281
        L_0x029b:
            java.lang.String r1 = r5.A0Z
            goto L_0x0281
        L_0x029e:
            java.lang.Object r0 = r1.A00
            com.whatsapp.community.CommunitySpamReportDialogFragment r0 = (com.whatsapp.community.CommunitySpamReportDialogFragment) r0
            boolean r4 = r1.A02
            java.lang.Object r3 = r1.A01
            X.4VM r3 = (X.AnonymousClass4VM) r3
            X.3Wi r2 = r0.A00
            r1 = 2131888207(0x7f12084f, float:1.9411043E38)
            r0 = 1
            r2.A0H(r1, r0)
            if (r4 == 0) goto L_0x004f
            X.4UC r1 = r3.A03
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x121f
        L_0x02bb:
            java.lang.Object r0 = r1.A00
            X.8KG r0 = (X.AnonymousClass8KG) r0
            java.lang.Object r7 = r1.A01
            android.graphics.Bitmap r7 = (android.graphics.Bitmap) r7
            boolean r8 = r1.A02
            X.4xk r0 = r0.A00
            java.util.Iterator r6 = X.C61102zi.A03(r0)
        L_0x02cb:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x004f
            X.4VK r5 = X.C86664Kz.A15(r6)
            boolean r0 = r5 instanceof com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel
            if (r0 == 0) goto L_0x02cb
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r5 = (com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel) r5
            r4 = 0
            r3 = 1
            if (r8 == 0) goto L_0x02e6
            X.5Jg r0 = r5.A0T
            boolean r1 = r0.A04
            r0 = 1
            if (r1 != 0) goto L_0x02e7
        L_0x02e6:
            r0 = 0
        L_0x02e7:
            X.55O r2 = new X.55O
            r2.<init>(r5, r0)
            if (r7 != 0) goto L_0x02f3
            r0 = 0
            r2.A0C(r0)
            goto L_0x02cb
        L_0x02f3:
            X.4FS r1 = r5.A10
            android.graphics.Bitmap[] r0 = new android.graphics.Bitmap[r3]
            r0[r4] = r7
            r1.BkO(r2, r0)
            goto L_0x02cb
        L_0x02fd:
            java.lang.Object r0 = r1.A00
            X.5Y9 r0 = (X.AnonymousClass5Y9) r0
            java.lang.Object r3 = r1.A01
            X.7Od r3 = (X.C149847Od) r3
            boolean r2 = r1.A02
            java.util.List r0 = r0.A0Q
            java.util.Iterator r1 = r0.iterator()
        L_0x030d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x004f
            java.lang.Object r0 = r1.next()
            X.8nF r0 = (X.C181738nF) r0
            r0.BYv(r3, r2)
            goto L_0x030d
        L_0x031d:
            java.lang.Object r5 = r1.A00
            X.33g r5 = (X.C620433g) r5
            java.lang.Object r4 = r1.A01
            com.whatsapp.jid.UserJid r4 = (com.whatsapp.jid.UserJid) r4
            boolean r2 = r1.A02
            X.5dt r1 = r5.A02(r4)
            if (r1 == 0) goto L_0x004f
            boolean r0 = r1.A0W
            if (r0 == r2) goto L_0x004f
            X.5Wt r0 = new X.5Wt
            r0.<init>(r1)
            r0.A0X = r2
            X.5dt r3 = r0.A01()
            X.56I r1 = r5.A0A
            java.util.HashMap r0 = X.AnonymousClass001.A0t()
            r0.put(r4, r3)
            r1.A04(r0)
            android.os.Handler r2 = r5.A00
            r1 = 33
            X.5rU r0 = new X.5rU
            r0.<init>(r5, r1, r3)
            r2.post(r0)
            return
        L_0x0355:
            java.lang.Object r5 = r1.A00
            X.33m r5 = (X.C621033m) r5
            java.lang.Object r0 = r1.A01
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r4 = r1.A02
            java.util.List r6 = r5.A04(r0)
            java.util.Iterator r14 = r6.iterator()
        L_0x0367:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x1223
            X.34x r3 = X.C18300x5.A0T(r14)
            r0 = 1
            r3.A1V = r0
            boolean r0 = X.C627636p.A0l(r3)
            if (r0 != 0) goto L_0x0367
            X.2z0 r9 = r3.A1J
            X.4uZ r2 = r9.A00
            boolean r1 = r2 instanceof X.C95804uY
            boolean r0 = X.C624134x.A0g(r3)
            if (r0 == 0) goto L_0x0392
            if (r1 != 0) goto L_0x0394
            X.2pu r0 = r3.A0t()
            if (r0 != 0) goto L_0x03be
            java.lang.String r1 = "UserActions/userActionRevokeMessages/commentInfo is null for a comment message"
            goto L_0x004c
        L_0x0392:
            if (r1 == 0) goto L_0x0406
        L_0x0394:
            X.2sH r0 = r5.A0V
            boolean r0 = X.C106855aH.A03(r0, r3)
            if (r0 != 0) goto L_0x03a2
            java.lang.String r0 = "UserActions/userActionRevokeMessages/outside of edit window"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x0367
        L_0x03a2:
            long r0 = r3.A0K
            X.1nU r7 = new X.1nU
            r7.<init>((X.C624134x) r3, (X.AnonymousClass2z0) r9, (long) r0)
            X.8qC r0 = r5.A1z
            java.lang.Object r3 = r0.get()
            X.2iH r3 = (X.C50502iH) r3
            X.4FS r2 = r3.A0B
            r1 = 36
            X.5sI r0 = new X.5sI
            r0.<init>(r3, r7, r1, r4)
            r2.BkM(r0)
            goto L_0x0367
        L_0x03be:
            X.2pu r0 = r3.A0t()
            X.2kn r1 = r0.A02()
            if (r1 == 0) goto L_0x03d0
            X.2z0 r0 = r1.A01
            if (r0 == 0) goto L_0x03d0
            X.4uZ r0 = r1.A00
            if (r0 != 0) goto L_0x0406
        L_0x03d0:
            java.lang.String r0 = "UserActions/userActionRevokeMessages/parent key not already loaded"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            X.2qz r7 = r5.A1o
            X.2pu r0 = r3.A0t()
            java.lang.Long r0 = r0.A03()
            long r0 = r0.longValue()
            X.34x r0 = X.C55122pp.A00(r7, r0)
            X.2z0 r1 = r0.A1J
            com.whatsapp.jid.UserJid r0 = r0.A0o()
            X.2kn r8 = new X.2kn
            r8.<init>(r0, r1)
            X.2pu r0 = r3.A0t()
            java.lang.Long r0 = r0.A03()
            long r0 = r0.longValue()
            X.1m5 r7 = new X.1m5
            r7.<init>(r8, r0)
            r3.A1N(r7)
        L_0x0406:
            boolean r0 = r9.A02
            if (r0 == 0) goto L_0x04cc
            boolean r0 = r3 instanceof X.C30471mV
            if (r0 == 0) goto L_0x0414
            X.2re r1 = r5.A1I
            r0 = 0
            r1.A04(r3, r0)
        L_0x0414:
            boolean r0 = r2 instanceof X.C135166kE
            if (r0 == 0) goto L_0x0453
            X.36Y r7 = r5.A13
            X.2hp r1 = r5.A1e
            X.2Yl r0 = r5.A1f
            int r9 = X.AnonymousClass29K.A01(r7, r3, r1, r0)
            X.5mK r8 = r5.A1k
            X.4rP r7 = new X.4rP
            r7.<init>()
            X.5Kz r0 = r8.A00
            if (r0 == 0) goto L_0x04c8
            long r0 = r0.A05
        L_0x042f:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r7.A02 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
            r7.A00 = r0
            X.2sH r0 = r8.A04
            long r0 = X.C56612sH.A04(r0, r3)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r7.A01 = r0
            X.4FV r0 = r8.A08
            r0.BhB(r7)
            X.5Z9 r7 = r8.A0C
            r1 = 4
            r0 = 0
            r7.A02(r3, r0, r0, r1)
        L_0x0453:
            boolean r0 = r3 instanceof X.C30391mN
            if (r0 == 0) goto L_0x0480
            r11 = r3
            X.1mN r11 = (X.C30391mN) r11
            X.2sH r0 = r5.A0V
            long r9 = r0.A0H()
            long r0 = r11.A01
            r7 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r7
            int r7 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r7 >= 0) goto L_0x0480
            boolean r0 = r11.A07
            if (r0 != 0) goto L_0x0480
            X.3Lr r8 = r5.A1D
            X.1fJ r7 = r11.A02
            X.C626936e.A06(r7)
            X.2z0 r0 = r11.A1J
            X.4uZ r0 = r0.A00
            java.util.List r1 = java.util.Collections.singletonList(r0)
            r0 = 0
            r8.A04(r0, r7, r1)
        L_0x0480:
            X.2Yi r7 = r5.A1b
            X.2sH r11 = r5.A0V
            long r0 = r11.A0H()
            X.35J r10 = r7.A01
            r9 = 1
            X.2z0 r8 = r10.A04(r2, r9)
            X.1nU r7 = new X.1nU
            r7.<init>((X.C624134x) r3, (X.AnonymousClass2z0) r8, (long) r0)
            r5.A0S(r3, r7)
            X.30G r13 = r5.A0m
            r13.A03(r7, r4)
            boolean r0 = r3.A1B
            if (r0 == 0) goto L_0x0367
            java.util.List r0 = r3.A19()
            if (r0 == 0) goto L_0x0367
            java.util.Iterator r12 = r0.iterator()
        L_0x04aa:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x0367
            X.4uZ r7 = X.C18300x5.A0P(r12)
            long r0 = r11.A0H()
            X.2z0 r8 = r10.A04(r7, r9)
            X.1nU r7 = new X.1nU
            r7.<init>((X.C624134x) r3, (X.AnonymousClass2z0) r8, (long) r0)
            r7.A1J(r2)
            r13.A03(r7, r4)
            goto L_0x04aa
        L_0x04c8:
            r0 = 0
            goto L_0x042f
        L_0x04cc:
            X.8qC r1 = r5.A1v
            r1.get()
            X.4uZ r0 = r3.A0n()
            boolean r0 = X.C155477ey.A00(r0)
            if (r0 == 0) goto L_0x0501
            java.lang.Object r0 = r1.get()
            X.2sS r0 = (X.C56722sS) r0
            boolean r0 = r0.A05(r3)
            if (r0 == 0) goto L_0x0501
            X.2Yi r7 = r5.A1b
            X.2sH r0 = r5.A0V
            long r0 = r0.A0H()
            X.35J r7 = r7.A01
            X.2z0 r2 = X.AnonymousClass35J.A01(r2, r7)
            X.1nU r7 = new X.1nU
            r7.<init>((X.C624134x) r3, (X.AnonymousClass2z0) r2, (long) r0)
        L_0x04fa:
            X.30G r0 = r5.A0m
            r0.A03(r7, r4)
            goto L_0x0367
        L_0x0501:
            r1.get()
            X.4uZ r0 = r3.A0n()
            boolean r9 = X.C155477ey.A00(r0)
            X.2Yi r7 = r5.A1b
            X.2sH r0 = r5.A0V
            long r0 = r0.A0H()
            X.35J r8 = r7.A01
            r7 = 0
            X.2z0 r2 = r8.A04(r2, r7)
            X.1nV r7 = new X.1nV
            if (r9 == 0) goto L_0x055b
            r7.<init>((X.C624134x) r3, (X.AnonymousClass2z0) r2, (long) r0)
            X.34x r0 = r3.A0w()
            if (r0 == 0) goto L_0x054d
            X.2qz r1 = r5.A1o
            X.2z0 r0 = r0.A1J
            X.34x r1 = r1.A05(r0)
            if (r1 == 0) goto L_0x054d
            com.whatsapp.jid.UserJid r0 = r1.A0o()
            if (r0 == 0) goto L_0x054d
            r0 = 1
            X.3ZM[] r3 = new X.AnonymousClass3ZM[r0]
            X.4uZ r2 = r1.A0n()
            r0 = 0
            X.3ZM r1 = new X.3ZM
            r1.<init>(r2, r0)
            r0 = 0
            java.util.List r0 = X.AnonymousClass0x9.A1A(r1, r3, r0)
            r7.A1g(r0)
        L_0x054d:
            X.2qk r0 = r5.A00
            r7.A01 = r0
            X.2sr r0 = r5.A04
            com.whatsapp.jid.PhoneUserJid r0 = X.C56972sr.A04(r0)
            r7.A1v(r0)
            goto L_0x04fa
        L_0x055b:
            r7.<init>((X.C624134x) r3, (X.AnonymousClass2z0) r2, (long) r0)
            r5.A0S(r3, r7)
            goto L_0x054d
        L_0x0562:
            java.lang.Object r3 = r1.A00
            com.google.android.material.behavior.SwipeDismissBehavior r3 = (com.google.android.material.behavior.SwipeDismissBehavior) r3
            X.0WM r2 = r3.A03
            if (r2 == 0) goto L_0x0579
            r0 = 1
            boolean r0 = r2.A0I(r0)
            if (r0 == 0) goto L_0x0579
        L_0x0571:
            java.lang.Object r0 = r1.A01
            android.view.View r0 = (android.view.View) r0
            X.AnonymousClass0YY.A07(r0, r1)
            return
        L_0x0579:
            boolean r0 = r1.A02
            if (r0 == 0) goto L_0x004f
            X.8mL r2 = r3.A04
            if (r2 == 0) goto L_0x004f
            java.lang.Object r0 = r1.A01
            android.view.View r0 = (android.view.View) r0
            r2.BRJ(r0)
            return
        L_0x0589:
            X.3dI r0 = r6.A02
            r10 = 4
            X.3aY r5 = new X.3aY
            r5.<init>(r6, r7, r8, r9, r10)
            r0.execute(r5)
            return
        L_0x0595:
            java.lang.Object r7 = r1.A00
            X.317 r7 = (X.AnonymousClass317) r7
            java.lang.Object r2 = r1.A01
            X.2fb r2 = (X.C48862fb) r2
            boolean r1 = r1.A02
            X.2dr r0 = r7.A0O
            r0.A01(r2)
            X.1iO r0 = r7.A0F
            boolean r0 = r0.A00
            if (r0 == 0) goto L_0x05b0
            if (r1 == 0) goto L_0x05b0
            java.lang.String r0 = "RegistrationManager/showDeviceConfirmationOverlayAlertOrNotify/App is no longer in background - skipping notification"
            goto L_0x0ebb
        L_0x05b0:
            X.2oU r0 = r7.A0a
            android.content.Context r6 = r0.A00
            r0 = 2131895980(0x7f1226ac, float:1.9426808E38)
            java.lang.String r5 = r6.getString(r0)
            X.33T r4 = r7.A0b
            r2 = 2131891269(0x7f121445, float:1.9417253E38)
            r3 = 1
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r0 = 0
            java.lang.String r2 = X.AnonymousClass002.A0F(r6, r5, r1, r0, r2)
            r1 = 2131891270(0x7f121446, float:1.9417255E38)
            java.lang.Object[] r0 = X.C18310x6.A1b(r5, r0)
            java.lang.String r0 = X.AnonymousClass002.A0F(r6, r5, r0, r3, r1)
            X.0Ue r0 = r7.A02(r5, r2, r0)
            android.app.Notification r1 = r0.A01()
            r0 = 52
            r4.A04(r0, r1)
            return
        L_0x05e1:
            java.lang.Object r3 = r1.A00
            X.37K r3 = (X.AnonymousClass37K) r3
            java.lang.Object r4 = r1.A01
            X.7O1 r4 = (X.AnonymousClass7O1) r4
            boolean r10 = r1.A02
            java.lang.Object r2 = r3.A0B
            monitor-enter(r2)
            X.7LF r9 = r3.A08     // Catch:{ all -> 0x0799 }
            java.io.File r7 = r9.A01     // Catch:{ all -> 0x0799 }
            boolean r0 = r7.exists()     // Catch:{ all -> 0x0799 }
            if (r0 == 0) goto L_0x0615
            long r0 = r3.A02     // Catch:{ all -> 0x0799 }
            long r5 = r4.A00     // Catch:{ all -> 0x0799 }
            int r8 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r8 >= 0) goto L_0x0782
            if (r10 != 0) goto L_0x0615
            java.lang.Object r10 = r3.A0A     // Catch:{ all -> 0x0799 }
            monitor-enter(r10)     // Catch:{ all -> 0x0799 }
            long r0 = r3.A01     // Catch:{ all -> 0x0612 }
            int r8 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            boolean r0 = X.AnonymousClass000.A1T(r8)
            monitor-exit(r10)     // Catch:{ all -> 0x0612 }
            if (r0 != 0) goto L_0x0615
            goto L_0x0782
        L_0x0612:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x0612 }
            throw r0     // Catch:{ all -> 0x0799 }
        L_0x0615:
            java.util.Map r12 = r4.A02     // Catch:{ Exception -> 0x0773 }
            java.lang.Object r6 = r9.A02     // Catch:{ Exception -> 0x0773 }
            monitor-enter(r6)     // Catch:{ Exception -> 0x0773 }
            boolean r0 = r7.exists()     // Catch:{ all -> 0x0770 }
            if (r0 == 0) goto L_0x064e
            java.io.File r5 = r9.A00     // Catch:{ all -> 0x0770 }
            boolean r0 = r5.exists()     // Catch:{ all -> 0x0770 }
            if (r0 == 0) goto L_0x062c
            r7.delete()     // Catch:{ all -> 0x0770 }
            goto L_0x064e
        L_0x062c:
            boolean r0 = r7.renameTo(r5)     // Catch:{ all -> 0x0770 }
            if (r0 != 0) goto L_0x064e
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0770 }
            java.lang.String r0 = "DefaultSharedPreferencesStorage/Couldn't rename file "
            r1.append(r0)     // Catch:{ all -> 0x0770 }
            r1.append(r7)     // Catch:{ all -> 0x0770 }
            java.lang.String r0 = " to backup file "
            X.C18260x0.A1Q(r1, r0, r5)     // Catch:{ all -> 0x0770 }
            monitor-exit(r6)     // Catch:{ all -> 0x0770 }
            r0 = 0
            r4.A04 = r0     // Catch:{ Exception -> 0x0773 }
            java.util.concurrent.CountDownLatch r0 = r4.A03     // Catch:{ Exception -> 0x0773 }
            r0.countDown()     // Catch:{ Exception -> 0x0773 }
            goto L_0x078a
        L_0x064e:
            java.lang.String r10 = "DefaultSharedPreferencesStorage/Couldn't create directory for SharedPreferences file "
            java.io.FileOutputStream r8 = X.AnonymousClass0x9.A0h(r7)     // Catch:{ FileNotFoundException -> 0x0655 }
            goto L_0x0679
        L_0x0655:
            r5 = move-exception
            java.io.File r8 = r7.getParentFile()     // Catch:{ XmlPullParserException -> 0x073e, IOException -> 0x073c }
            r8.mkdir()     // Catch:{ SecurityException -> 0x072f }
            boolean r0 = r8.exists()     // Catch:{ XmlPullParserException -> 0x073e, IOException -> 0x073c }
            if (r0 == 0) goto L_0x071c
            boolean r0 = r8.isDirectory()     // Catch:{ XmlPullParserException -> 0x073e, IOException -> 0x073c }
            if (r0 == 0) goto L_0x06e8
            boolean r0 = r8.canRead()     // Catch:{ XmlPullParserException -> 0x073e, IOException -> 0x073c }
            if (r0 == 0) goto L_0x06e8
            boolean r0 = r8.canWrite()     // Catch:{ XmlPullParserException -> 0x073e, IOException -> 0x073c }
            if (r0 == 0) goto L_0x06e8
            java.io.FileOutputStream r8 = X.AnonymousClass0x9.A0h(r7)     // Catch:{ FileNotFoundException -> 0x0724 }
        L_0x0679:
            java.io.File r9 = r9.A00     // Catch:{ all -> 0x06e1 }
            long r14 = r9.length()     // Catch:{ all -> 0x06e1 }
            r10 = 2048(0x800, double:1.0118E-320)
            r13 = 2048(0x800, float:2.87E-42)
            int r0 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r0 <= 0) goto L_0x069a
            r10 = 32768(0x8000, double:1.61895E-319)
            int r0 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r0 < 0) goto L_0x0692
            r13 = 32768(0x8000, float:4.5918E-41)
            goto L_0x069a
        L_0x0692:
            long r0 = (long) r13     // Catch:{ all -> 0x06e1 }
            int r5 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r5 >= 0) goto L_0x069a
            int r13 = r13 * 2
            goto L_0x0692
        L_0x069a:
            X.3ew r10 = new X.3ew     // Catch:{ all -> 0x06e1 }
            r10.<init>(r13)     // Catch:{ all -> 0x06e1 }
            java.lang.String r0 = X.C58152un.A0B     // Catch:{ all -> 0x06e1 }
            r10.setOutput(r8, r0)     // Catch:{ all -> 0x06e1 }
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x06e1 }
            r5 = 0
            r10.startDocument(r5, r0)     // Catch:{ all -> 0x06e1 }
            java.lang.String r1 = "http://xmlpull.org/v1/doc/features.html#indent-output"
            r0 = 1
            r10.setFeature(r1, r0)     // Catch:{ all -> 0x06e1 }
            X.C159467lt.A06(r5, r12, r10)     // Catch:{ all -> 0x06e1 }
            r10.endDocument()     // Catch:{ all -> 0x06e1 }
            java.io.FileDescriptor r0 = r8.getFD()     // Catch:{ IOException -> 0x06be }
            r0.sync()     // Catch:{ IOException -> 0x06be }
            goto L_0x06cc
        L_0x06be:
            r5 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x06e1 }
            java.lang.String r0 = "DefaultSharedPreferencesStorage/Exception while syncing preferences, file= "
            java.lang.String r0 = X.AnonymousClass0x7.A0p(r7, r0, r1)     // Catch:{ all -> 0x06e1 }
            X.C18260x0.A14(r0, r1, r5)     // Catch:{ all -> 0x06e1 }
        L_0x06cc:
            r9.delete()     // Catch:{ all -> 0x06e1 }
            r8.close()     // Catch:{ XmlPullParserException -> 0x073e, IOException -> 0x073c }
            monitor-exit(r6)     // Catch:{ all -> 0x0770 }
            long r0 = r4.A00     // Catch:{ Exception -> 0x0773 }
            r3.A02 = r0     // Catch:{ Exception -> 0x0773 }
            r0 = 1
            r4.A04 = r0     // Catch:{ Exception -> 0x0773 }
            java.util.concurrent.CountDownLatch r0 = r4.A03     // Catch:{ Exception -> 0x0773 }
            r0.countDown()     // Catch:{ Exception -> 0x0773 }
            goto L_0x078a
        L_0x06e1:
            r1 = move-exception
            r8.close()     // Catch:{ all -> 0x06e6 }
            goto L_0x073b
        L_0x06e6:
            r0 = move-exception
            goto L_0x0738
        L_0x06e8:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ XmlPullParserException -> 0x073e, IOException -> 0x073c }
            java.lang.String r0 = "DefaultSharedPreferencesStorage/Invalid directory for SharedPreferences file "
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x073e, IOException -> 0x073c }
            r1.append(r7)     // Catch:{ XmlPullParserException -> 0x073e, IOException -> 0x073c }
            java.lang.String r0 = ", isDirectory="
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x073e, IOException -> 0x073c }
            boolean r0 = r8.isDirectory()     // Catch:{ XmlPullParserException -> 0x073e, IOException -> 0x073c }
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x073e, IOException -> 0x073c }
            java.lang.String r0 = ", canRead="
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x073e, IOException -> 0x073c }
            boolean r0 = r8.canRead()     // Catch:{ XmlPullParserException -> 0x073e, IOException -> 0x073c }
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x073e, IOException -> 0x073c }
            java.lang.String r0 = ", canWrite="
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x073e, IOException -> 0x073c }
            boolean r0 = r8.canWrite()     // Catch:{ XmlPullParserException -> 0x073e, IOException -> 0x073c }
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x073e, IOException -> 0x073c }
            X.C18280x3.A1C(r1, r5)     // Catch:{ XmlPullParserException -> 0x073e, IOException -> 0x073c }
            goto L_0x072e
        L_0x071c:
            java.lang.StringBuilder r0 = X.AnonymousClass001.A0o()     // Catch:{ XmlPullParserException -> 0x073e, IOException -> 0x073c }
            X.C18260x0.A1Q(r0, r10, r7)     // Catch:{ XmlPullParserException -> 0x073e, IOException -> 0x073c }
            goto L_0x072e
        L_0x0724:
            r5 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ XmlPullParserException -> 0x073e, IOException -> 0x073c }
            java.lang.String r0 = "DefaultSharedPreferencesStorage/Couldn't create SharedPreferences file "
            X.C18260x0.A0k(r7, r0, r1, r5)     // Catch:{ XmlPullParserException -> 0x073e, IOException -> 0x073c }
        L_0x072e:
            throw r5     // Catch:{ XmlPullParserException -> 0x073e, IOException -> 0x073c }
        L_0x072f:
            r1 = move-exception
            java.lang.StringBuilder r0 = X.AnonymousClass001.A0o()     // Catch:{ XmlPullParserException -> 0x073e, IOException -> 0x073c }
            X.C18260x0.A0k(r7, r10, r0, r1)     // Catch:{ XmlPullParserException -> 0x073e, IOException -> 0x073c }
            goto L_0x073b
        L_0x0738:
            r1.addSuppressed(r0)     // Catch:{ XmlPullParserException -> 0x073e, IOException -> 0x073c }
        L_0x073b:
            throw r1     // Catch:{ XmlPullParserException -> 0x073e, IOException -> 0x073c }
        L_0x073c:
            r5 = move-exception
            goto L_0x074d
        L_0x073e:
            r5 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0770 }
            java.lang.String r0 = "DefaultSharedPreferencesStorage/Exception while serializing to XML, file= "
            java.lang.String r0 = X.AnonymousClass0x7.A0p(r7, r0, r1)     // Catch:{ all -> 0x0770 }
            X.C18260x0.A15(r0, r1, r5)     // Catch:{ all -> 0x0770 }
            goto L_0x075a
        L_0x074d:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0770 }
            java.lang.String r0 = "DefaultSharedPreferencesStorage/Exception while saving preferences, file= "
            java.lang.String r0 = X.AnonymousClass0x7.A0p(r7, r0, r1)     // Catch:{ all -> 0x0770 }
            X.C18260x0.A15(r0, r1, r5)     // Catch:{ all -> 0x0770 }
        L_0x075a:
            boolean r0 = r7.exists()     // Catch:{ all -> 0x0770 }
            if (r0 == 0) goto L_0x076f
            boolean r0 = r7.delete()     // Catch:{ all -> 0x0770 }
            if (r0 != 0) goto L_0x076f
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0770 }
            java.lang.String r0 = "DefaultSharedPreferencesStorage/Couldn't clean up partially-written file "
            X.C18260x0.A1Q(r1, r0, r7)     // Catch:{ all -> 0x0770 }
        L_0x076f:
            throw r5     // Catch:{ all -> 0x0770 }
        L_0x0770:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0770 }
            throw r0     // Catch:{ Exception -> 0x0773 }
        L_0x0773:
            r1 = move-exception
            java.lang.String r0 = "LightSharedPreferencesImpl/writeToFile: Got exception:"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0799 }
            r0 = 0
            r4.A04 = r0     // Catch:{ all -> 0x0799 }
            java.util.concurrent.CountDownLatch r0 = r4.A03     // Catch:{ all -> 0x0799 }
            r0.countDown()     // Catch:{ all -> 0x0799 }
            goto L_0x078a
        L_0x0782:
            r0 = 1
            r4.A04 = r0     // Catch:{ all -> 0x0799 }
            java.util.concurrent.CountDownLatch r0 = r4.A03     // Catch:{ all -> 0x0799 }
            r0.countDown()     // Catch:{ all -> 0x0799 }
        L_0x078a:
            monitor-exit(r2)     // Catch:{ all -> 0x0799 }
            java.lang.Object r2 = r3.A0A
            monitor-enter(r2)
            int r0 = r3.A00     // Catch:{ all -> 0x0796 }
            int r0 = r0 + -1
            r3.A00 = r0     // Catch:{ all -> 0x0796 }
            monitor-exit(r2)     // Catch:{ all -> 0x0796 }
            return
        L_0x0796:
            r1 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0796 }
            throw r1
        L_0x0799:
            r1 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0799 }
            throw r1
        L_0x079c:
            java.lang.Object r3 = r1.A00
            X.2iH r3 = (X.C50502iH) r3
            java.lang.Object r2 = r1.A01
            X.1mS r2 = (X.C30441mS) r2
            boolean r1 = r1.A02
            X.2qf r0 = r3.A07
            r0.A04(r2, r1)
            r3.A00(r2)
            return
        L_0x07af:
            java.lang.Object r5 = r1.A00
            com.whatsapp.newsletter.NewsletterInfoMembersListViewModel r5 = (com.whatsapp.newsletter.NewsletterInfoMembersListViewModel) r5
            java.lang.Object r4 = r1.A01
            X.21d r4 = (X.C371521d) r4
            boolean r3 = r1.A02
            r0 = 0
            r5.A0D(r4, r0)
            X.21d r0 = X.C371521d.SHORT
            if (r4 == r0) goto L_0x07c7
            X.21d r0 = X.C371521d.FULL
            if (r4 != r0) goto L_0x07ce
            if (r3 != 0) goto L_0x07ce
        L_0x07c7:
            X.47C r0 = r5.A00
            if (r0 == 0) goto L_0x07ce
            r0.cancel()
        L_0x07ce:
            X.2hh r2 = r5.A0F
            X.4uY r1 = r5.A0B
            X.5o1 r0 = new X.5o1
            r0.<init>(r4, r5)
            X.47C r0 = r2.A00(r4, r1, r0, r3)
            r5.A00 = r0
            return
        L_0x07de:
            java.lang.Object r7 = r1.A00
            X.7l0 r7 = (X.C159047l0) r7
            java.lang.Object r6 = r1.A01
            X.7o1 r6 = (X.C160627o1) r6
            boolean r5 = r1.A02
            r3 = 987(0x3db, double:4.876E-321)
            r1 = 1
            X.2pM r0 = new X.2pM
            r0.<init>(r1, r3)
            r7.A06(r6, r0, r5)
            return
        L_0x07f5:
            java.lang.Object r0 = r1.A00
            X.2qe r0 = (X.C55622qe) r0
            java.lang.Object r3 = r1.A01
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r2 = r1.A02
            X.1io r1 = r0.A0A
            r0 = 0
            r1.A0A(r0, r3, r2)
            return
        L_0x0806:
            java.lang.Object r3 = r1.A00
            X.30G r3 = (X.AnonymousClass30G) r3
            java.lang.Object r2 = r1.A01
            X.34x r2 = (X.C624134x) r2
            boolean r0 = r1.A02
            r3.A05(r2, r0)
            return
        L_0x0814:
            java.lang.Object r0 = r1.A00
            X.2sA r0 = (X.C56542sA) r0
            java.lang.Object r4 = r1.A01
            X.31A r4 = (X.AnonymousClass31A) r4
            boolean r3 = r1.A02
            X.8qC r2 = r0.A02
            java.lang.Object r0 = r2.get()
            X.2UO r0 = (X.AnonymousClass2UO) r0
            X.3Gp r1 = r0.A04
            X.4uZ r0 = r4.A0q
            java.util.Set r1 = r1.A05(r0, r3)
            java.lang.Object r0 = r2.get()
            X.2UO r0 = (X.AnonymousClass2UO) r0
            X.2sm r0 = r0.A0C
            r0.A0G(r4)
            java.lang.Object r0 = r2.get()
            X.2UO r0 = (X.AnonymousClass2UO) r0
            X.3Gp r0 = r0.A04
            r0.A0O(r1)
            return
        L_0x0845:
            java.lang.Object r6 = r1.A00
            X.2sA r6 = (X.C56542sA) r6
            java.lang.Object r0 = r1.A01
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r4 = r1.A02
            java.util.HashSet r3 = X.AnonymousClass002.A0K()
            java.util.Iterator r5 = r0.iterator()
        L_0x0857:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0877
            java.lang.Object r2 = r5.next()
            X.31A r2 = (X.AnonymousClass31A) r2
            X.8qC r0 = r6.A02
            java.lang.Object r0 = r0.get()
            X.2UO r0 = (X.AnonymousClass2UO) r0
            X.3Gp r1 = r0.A04
            X.4uZ r0 = r2.A0q
            java.util.Set r0 = r1.A05(r0, r4)
            r3.addAll(r0)
            goto L_0x0857
        L_0x0877:
            X.8qC r1 = r6.A02
            java.lang.Object r0 = r1.get()
            X.2UO r0 = (X.AnonymousClass2UO) r0
            X.2sm r0 = r0.A0C
            X.3dV r0 = r0.A06
            X.4Fq r2 = r0.A04()
            r0 = 1
            android.content.ContentValues r5 = new android.content.ContentValues     // Catch:{ all -> 0x08af }
            r5.<init>(r0)     // Catch:{ all -> 0x08af }
            java.lang.String r0 = "archived"
            X.AnonymousClass0x2.A0o(r5, r0, r4)     // Catch:{ all -> 0x08af }
            r0 = r2
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x08af }
            X.2sg r4 = r0.A03     // Catch:{ all -> 0x08af }
            java.lang.String r6 = "chat"
            r7 = 0
            java.lang.String r8 = "updateAllChatsArchivedInChatList/UPDATE_CHAT"
            r9 = r7
            r4.A05(r5, r6, r7, r8, r9)     // Catch:{ all -> 0x08af }
            r2.close()
            java.lang.Object r0 = r1.get()
            X.2UO r0 = (X.AnonymousClass2UO) r0
            X.3Gp r0 = r0.A04
            r0.A0O(r3)
            return
        L_0x08af:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x08b4 }
            throw r1
        L_0x08b4:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x08b9:
            java.lang.Object r3 = r1.A00
            X.2fm r3 = (X.C48972fm) r3
            java.lang.Object r2 = r1.A01
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r0 = 1
            r3.A02 = r0
            r1 = 0
            r2.run()     // Catch:{ all -> 0x08cb }
            r3.A02 = r1
            return
        L_0x08cb:
            r0 = move-exception
            r3.A02 = r1
            throw r0
        L_0x08cf:
            java.lang.Object r3 = r1.A00
            X.4qc r3 = (X.C94244qc) r3
            java.lang.Object r2 = r1.A01
            X.2Xw r2 = (X.C44892Xw) r2
            boolean r0 = r1.A02
            r3.A04(r2, r0)
            return
        L_0x08dd:
            java.lang.Object r3 = r1.A00
            X.30j r3 = (X.C613530j) r3
            java.lang.Object r2 = r1.A01
            X.2o6 r2 = (X.C54052o6) r2
            boolean r1 = r1.A02
            r0 = 2
            r3.A01(r2, r0, r1)
            r0 = 1
            r3.A05(r2, r0)
            return
        L_0x08f0:
            java.lang.Object r5 = r1.A00
            X.4mv r5 = (X.C92584mv) r5
            java.lang.Object r4 = r1.A01
            X.1mT r4 = (X.C30451mT) r4
            boolean r0 = r1.A02
            r20 = r0
            android.widget.LinearLayout r0 = r5.A07
            r39 = r0
            java.lang.Object r0 = r39.getTag()
            if (r0 == 0) goto L_0x0e1d
            X.2z0 r0 = r4.A1J
            r38 = r0
            r1 = r39
            boolean r0 = X.C86664Kz.A1U(r1, r0)
            if (r0 == 0) goto L_0x0e1d
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "ConversationRowPoll/initialize UI after poll message votes loaded id="
            r1.append(r0)
            r0 = r38
            java.lang.String r0 = r0.A01
            X.C18260x0.A1J(r1, r0)
            java.util.List r6 = r4.A04
            r10 = 0
            if (r6 == 0) goto L_0x094f
            java.util.Iterator r9 = r6.iterator()
            r7 = 0
        L_0x092d:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x094f
            java.lang.Object r3 = r9.next()
            X.1mH r3 = (X.C30331mH) r3
            X.2z0 r0 = r3.A1J
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x092d
            boolean r0 = r3 instanceof X.C30591mh
            if (r0 == 0) goto L_0x092d
            X.1mh r3 = (X.C30591mh) r3
            long r1 = r3.A00
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 <= 0) goto L_0x092d
            java.util.List r10 = r3.A06
            r7 = r1
            goto L_0x092d
        L_0x094f:
            r5.A01 = r10
            X.5UY r1 = r5.A0C
            int r0 = r4.A00
            int r0 = X.C86664Kz.A03(r0)
            r1.A06(r0)
            java.util.List r0 = r4.A05
            r37 = r0
            java.util.Iterator r2 = r37.iterator()
            r19 = 0
        L_0x0966:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x097b
            java.lang.Object r0 = r2.next()
            X.2y4 r0 = (X.C60142y4) r0
            int r1 = r0.A00
            r0 = r19
            int r19 = java.lang.Math.max(r0, r1)
            goto L_0x0966
        L_0x097b:
            java.util.HashMap r18 = X.AnonymousClass001.A0t()
            if (r6 == 0) goto L_0x09cb
            int r8 = r6.size()
        L_0x0985:
            int r8 = r8 + -1
            if (r8 < 0) goto L_0x09cb
            java.lang.Object r7 = r6.get(r8)
            X.1mH r7 = (X.C30331mH) r7
            boolean r0 = r7 instanceof X.C30591mh
            if (r0 == 0) goto L_0x0985
            X.1mh r7 = (X.C30591mh) r7
            X.2z0 r0 = r7.A1J
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x0985
            java.util.List r0 = r7.A06
            java.util.Iterator r3 = r0.iterator()
        L_0x09a1:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0985
            java.lang.Object r2 = r3.next()
            r0 = r18
            java.lang.Object r1 = r0.get(r2)
            android.util.Pair r1 = (android.util.Pair) r1
            if (r1 != 0) goto L_0x09c0
            r0 = 0
            android.util.Pair r1 = X.AnonymousClass0x9.A0C(r7, r0)
        L_0x09ba:
            r0 = r18
            r0.put(r2, r1)
            goto L_0x09a1
        L_0x09c0:
            java.lang.Object r0 = r1.second
            if (r0 != 0) goto L_0x09a1
            java.lang.Object r0 = r1.first
            android.util.Pair r1 = X.AnonymousClass0x9.A0C(r0, r7)
            goto L_0x09ba
        L_0x09cb:
            com.whatsapp.WaTextView r1 = r5.A0A
            r3 = 1
            boolean r0 = X.AnonymousClass001.A1W(r19)
            r1.setEnabled(r0)
            java.util.List r17 = r5.getHighlightTerms()
            r6 = 0
        L_0x09da:
            int r1 = r37.size()
            java.util.List r0 = r5.A0D
            if (r6 >= r1) goto L_0x0cd1
            int r1 = X.AnonymousClass002.A04(r0, r3)
            if (r1 >= r6) goto L_0x0cc2
            android.view.LayoutInflater r2 = X.C18280x3.A0D(r5)
            r1 = 2131625760(0x7f0e0720, float:1.8878737E38)
            android.view.View r8 = X.C18310x6.A0H(r2, r1)
            X.7Ca r2 = r5.A00
            X.5Uq r10 = r5.A0B
            boolean r9 = r5.A0E
            X.5su r1 = r2.A00
            X.3Db r1 = r1.A03
            X.1VX r30 = X.C64333Db.A4B(r1)
            X.5su r1 = r2.A00
            X.3Db r7 = r1.A03
            X.33j r28 = X.C64333Db.A2t(r7)
            X.2sr r23 = X.C64333Db.A06(r7)
            X.5Y0 r29 = X.C64333Db.A3o(r7)
            X.33m r24 = X.C64333Db.A08(r7)
            X.3Ex r25 = X.C64333Db.A26(r7)
            X.33i r27 = X.C64333Db.A2o(r7)
            X.4C1 r1 = r7.A5B
            X.8qC r33 = X.C72343dZ.A00(r1)
            X.5bk r2 = r7.A00
            X.4C1 r1 = r2.A9D
            java.lang.Object r1 = r1.get()
            X.32c r1 = (X.C617532c) r1
            X.2y5 r32 = X.C64333Db.A74(r7)
            X.4C1 r2 = r2.A85
            X.8qC r34 = X.C72343dZ.A00(r2)
            X.5RF r2 = new X.5RF
            r21 = r2
            r22 = r8
            r26 = r10
            r31 = r1
            r35 = r0
            r36 = r9
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            r1 = r39
            r1.addView(r8)
            r0.add(r2)
        L_0x0a50:
            android.content.Context r7 = r5.getContext()
            java.util.List r11 = r5.A01
            int r0 = r4.A00
            boolean r13 = X.AnonymousClass000.A1T(r0)
            r2.A01 = r4
            r0 = r37
            java.lang.Object r0 = r0.get(r6)
            X.2y4 r0 = (X.C60142y4) r0
            r2.A00 = r0
            java.lang.String r9 = r0.A03
            if (r17 == 0) goto L_0x0a76
            X.33j r8 = r2.A0E
            X.5ae r1 = X.C107075ae.A00
            r0 = r17
            java.lang.CharSequence r9 = X.C86644Kx.A0d(r7, r8, r1, r9, r0)
        L_0x0a76:
            android.text.SpannableStringBuilder r9 = X.C18330xA.A00(r9)
            X.33i r1 = r2.A0D
            X.2y5 r0 = r2.A0I
            X.C107635bd.A07(r1, r0, r9)
            android.widget.TextView r8 = r2.A05
            android.text.TextPaint r1 = r8.getPaint()
            X.5Y0 r0 = r2.A0F
            java.lang.CharSequence r0 = X.C107345b9.A03(r7, r1, r0, r9)
            r8.setText(r0)
            X.5UY r10 = r2.A0K
            r0 = 8
            r10.A06(r0)
            X.5UY r9 = r2.A0L
            r9.A06(r0)
            X.5UY r8 = r2.A0J
            r8.A06(r0)
            X.2y4 r0 = r2.A00
            int r12 = r0.A00
            X.33j r0 = r2.A0E
            r23 = r0
            java.text.NumberFormat r14 = r23.A0M()
            X.2y4 r0 = r2.A00
            int r0 = r0.A00
            long r0 = (long) r0
            java.lang.String r1 = r14.format(r0)
            X.1mT r0 = r2.A01
            boolean r0 = X.AnonymousClass2z0.A0C(r0)
            if (r0 == 0) goto L_0x0ad4
            X.1VX r14 = r2.A0G
            r0 = 6489(0x1959, float:9.093E-42)
            boolean r0 = r14.A0X(r0)
            if (r0 == 0) goto L_0x0ad4
            X.8qC r0 = r2.A0N
            java.lang.Object r0 = r0.get()
            X.5QQ r0 = (X.AnonymousClass5QQ) r0
            java.lang.String r1 = r0.A01(r12)
        L_0x0ad4:
            android.widget.TextView r0 = r2.A06
            r0.setText(r1)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "PollOptionViewHolder/pollOption.getOptionCount()= "
            r1.append(r0)
            X.2y4 r0 = r2.A00
            int r0 = r0.A00
            X.C18260x0.A1F(r1, r0)
            java.lang.StringBuilder r12 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "PollOptionViewHolder/maxVoteCount= "
            r0 = r19
            X.C18260x0.A0w(r1, r12, r0)
            android.widget.CheckBox r12 = r2.A04
            r12.setEnabled(r13)
            r0 = r38
            boolean r1 = r0.A02
            r0 = 2131102400(0x7f060ac0, float:1.7817237E38)
            if (r1 == 0) goto L_0x0b05
            r0 = 2131102401(0x7f060ac1, float:1.7817239E38)
        L_0x0b05:
            android.content.res.ColorStateList r0 = X.AnonymousClass0Y8.A07(r7, r0)
            X.C06070Wc.A02(r0, r12)
            com.whatsapp.components.RoundCornerProgressBarV2 r13 = r2.A0A
            r0 = 2131102171(0x7f0609db, float:1.7816772E38)
            if (r1 == 0) goto L_0x0b16
            r0 = 2131102172(0x7f0609dc, float:1.7816774E38)
        L_0x0b16:
            int r0 = X.AnonymousClass0Y8.A04(r7, r0)
            r13.A01 = r0
            r7 = 0
            if (r19 != 0) goto L_0x0ca8
            r1 = 0
        L_0x0b20:
            int r0 = r13.A02
            if (r1 == r0) goto L_0x0b5d
            r13.A02 = r1
            android.animation.ValueAnimator r0 = r13.A00
            if (r0 == 0) goto L_0x0b35
            boolean r0 = r0.isStarted()
            if (r0 == 0) goto L_0x0b35
            android.animation.ValueAnimator r0 = r13.A00
            r0.cancel()
        L_0x0b35:
            if (r20 == 0) goto L_0x0ca0
            float[] r1 = X.AnonymousClass4L0.A0T()
            float r0 = r13.A00
            r1[r7] = r0
            int r0 = r13.A02
            float r0 = (float) r0
            android.animation.ValueAnimator r14 = X.C86664Kz.A0P(r1, r0)
            r13.A00 = r14
            r0 = 200(0xc8, double:9.9E-322)
            r14.setDuration(r0)
            android.animation.ValueAnimator r0 = r13.A00
            X.C86644Kx.A0j(r0)
            android.animation.ValueAnimator r1 = r13.A00
            r0 = 6
            X.C100295Aj.A03(r1, r13, r0)
            android.animation.ValueAnimator r0 = r13.A00
            r0.start()
        L_0x0b5d:
            android.view.View r13 = r2.A02
            r1 = 23
            X.3bp r0 = new X.3bp
            r0.<init>((java.lang.Object) r2, (int) r1)
            r13.post(r0)
            if (r11 == 0) goto L_0x0c9b
            X.2y4 r0 = r2.A00
            long r0 = r0.A01
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            boolean r0 = r11.contains(r0)
            if (r0 == 0) goto L_0x0c9b
            r12.setChecked(r3)
        L_0x0b7c:
            boolean r0 = r2.A0O
            if (r0 == 0) goto L_0x0bbd
            boolean r0 = r12.isChecked()
            r16 = 2131755010(0x7f100002, float:1.9140887E38)
            if (r0 == 0) goto L_0x0b8c
            r16 = 2131755009(0x7f100001, float:1.9140885E38)
        L_0x0b8c:
            X.2y4 r0 = r2.A00
            r15 = r0
            int r13 = r0.A00
            long r0 = (long) r13
            r21 = r0
            java.lang.Object[] r14 = X.AnonymousClass002.A0M()
            java.lang.String r0 = r15.A03
            r14[r7] = r0
            X.AnonymousClass000.A1P(r14, r13, r3)
            r15 = r23
            r0 = r21
            r13 = r16
            java.lang.String r0 = r15.A0L(r14, r13, r0)
            androidx.constraintlayout.widget.ConstraintLayout r13 = r2.A07
            r13.setContentDescription(r0)
            boolean r1 = r12.isChecked()
            r0 = 2131886182(0x7f120066, float:1.9406936E38)
            if (r1 == 0) goto L_0x0bba
            r0 = 2131886181(0x7f120065, float:1.9406934E38)
        L_0x0bba:
            X.C107295b4.A03(r13, r0)
        L_0x0bbd:
            X.2y4 r0 = r2.A00
            if (r0 == 0) goto L_0x0c3e
            long r0 = r0.A01
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            r0 = r18
            java.lang.Object r12 = r0.get(r1)
            android.util.Pair r12 = (android.util.Pair) r12
            if (r11 == 0) goto L_0x0c57
            X.2y4 r0 = r2.A00
            long r0 = r0.A01
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            boolean r0 = r11.contains(r0)
            if (r0 == 0) goto L_0x0c57
            if (r12 == 0) goto L_0x0c42
            java.lang.Object r0 = r12.first
            if (r0 == 0) goto L_0x0c42
            r10.A06(r7)
            android.view.View r11 = X.AnonymousClass5UY.A00(r8, r7)
            android.view.View r0 = r8.A04()
            android.content.Context r8 = r0.getContext()
            X.1mT r0 = r2.A01
            if (r0 == 0) goto L_0x0c01
            X.2z0 r0 = r0.A1J
            boolean r1 = r0.A02
            r0 = 2131233449(0x7f080aa9, float:1.8083036E38)
            if (r1 != 0) goto L_0x0c04
        L_0x0c01:
            r0 = 2131233448(0x7f080aa8, float:1.8083034E38)
        L_0x0c04:
            X.C86614Ku.A11(r8, r11, r0)
            X.5Uq r8 = r2.A0C
            X.2sr r0 = r2.A08
            X.1RR r1 = X.C56972sr.A01(r0)
            android.view.View r0 = r10.A04()
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r8.A08(r0, r1)
        L_0x0c18:
            java.lang.Object r1 = r12.first
        L_0x0c1a:
            X.34x r1 = (X.C624134x) r1
            android.view.View r8 = X.AnonymousClass5UY.A00(r9, r7)
            android.widget.ImageView r8 = (android.widget.ImageView) r8
            X.2z0 r0 = r1.A1J
            X.4uZ r7 = r0.A00
            boolean r0 = X.C627336j.A0K(r7)
            if (r0 == 0) goto L_0x0c30
            X.4uZ r7 = r1.A0n()
        L_0x0c30:
            X.C626936e.A06(r7)
            X.5Uq r1 = r2.A0C
            X.3Ex r0 = r2.A0B
            X.3ZH r0 = r0.A0A(r7)
            r1.A08(r8, r0)
        L_0x0c3e:
            int r6 = r6 + 1
            goto L_0x09da
        L_0x0c42:
            r9.A06(r7)
            X.5Uq r7 = r2.A0C
            X.2sr r0 = r2.A08
            X.1RR r1 = X.C56972sr.A01(r0)
            android.view.View r0 = r9.A04()
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r7.A08(r0, r1)
            goto L_0x0c3e
        L_0x0c57:
            if (r12 == 0) goto L_0x0c3e
            java.lang.Object r1 = r12.first
            if (r1 == 0) goto L_0x0c3e
            r11 = r1
            X.34x r11 = (X.C624134x) r11
            boolean r0 = X.AnonymousClass2z0.A0C(r11)
            if (r0 == 0) goto L_0x0c6a
            r2.A00(r11)
            goto L_0x0c3e
        L_0x0c6a:
            java.lang.Object r0 = r12.second
            if (r0 == 0) goto L_0x0c18
            X.34x r1 = (X.C624134x) r1
            r10.A06(r7)
            r8.A06(r7)
            android.view.View r10 = r10.A04()
            android.widget.ImageView r10 = (android.widget.ImageView) r10
            X.2z0 r0 = r1.A1J
            X.4uZ r8 = r0.A00
            boolean r0 = X.C627336j.A0K(r8)
            if (r0 == 0) goto L_0x0c8a
            X.4uZ r8 = r1.A0n()
        L_0x0c8a:
            X.C626936e.A06(r8)
            X.5Uq r1 = r2.A0C
            X.3Ex r0 = r2.A0B
            X.3ZH r0 = r0.A0A(r8)
            r1.A08(r10, r0)
            java.lang.Object r1 = r12.second
            goto L_0x0c1a
        L_0x0c9b:
            r12.setChecked(r7)
            goto L_0x0b7c
        L_0x0ca0:
            float r0 = (float) r1
            r13.A00 = r0
            r13.invalidate()
            goto L_0x0b5d
        L_0x0ca8:
            X.2y4 r0 = r2.A00
            int r0 = r0.A00
            r1 = 100
            int r0 = r0 * 100
            int r0 = r0 / r19
            int r0 = java.lang.Math.min(r0, r1)
            int r1 = java.lang.Math.max(r0, r7)
            if (r1 < 0) goto L_0x0cca
            r0 = 100
            if (r1 > r0) goto L_0x0cca
            goto L_0x0b20
        L_0x0cc2:
            java.lang.Object r2 = r0.get(r6)
            X.5RF r2 = (X.AnonymousClass5RF) r2
            goto L_0x0a50
        L_0x0cca:
            java.lang.String r0 = "Progress must be between 0 and 100 inclusive"
            java.lang.IllegalArgumentException r1 = X.AnonymousClass001.A0c(r0)
            throw r1
        L_0x0cd1:
            int r6 = X.AnonymousClass002.A04(r0, r3)
        L_0x0cd5:
            int r1 = r37.size()
            if (r6 < r1) goto L_0x0cee
            java.lang.Object r1 = r0.get(r6)
            X.5RF r1 = (X.AnonymousClass5RF) r1
            android.view.View r2 = r1.A02
            r1 = r39
            r1.removeView(r2)
            r0.remove(r6)
            int r6 = r6 + -1
            goto L_0x0cd5
        L_0x0cee:
            android.widget.LinearLayout r6 = r5.A06
            boolean r0 = r5.A0E
            java.lang.StringBuilder r7 = X.AnonymousClass001.A0o()
            if (r0 != 0) goto L_0x0d6a
            android.content.res.Resources r10 = r5.getResources()
            r9 = 2131892661(0x7f1219b5, float:1.9420077E38)
            java.lang.Object[] r8 = X.AnonymousClass0x9.A1X()
            android.content.Context r2 = r5.getContext()
            X.3Ex r1 = r5.A0t
            X.5ZU r0 = r5.A0v
            java.lang.String r1 = X.AnonymousClass287.A00(r2, r1, r0, r4)
            r0 = 0
            r8[r0] = r1
            java.lang.String r0 = X.C87094Nz.A0F(r5, r4)
            r8[r3] = r0
            java.lang.String r1 = r4.A03
            r0 = 2
            java.lang.String r0 = X.C18320x8.A0b(r10, r1, r8, r0, r9)
            r7.append(r0)
            java.util.ArrayList r4 = X.AnonymousClass002.A0J(r37)
            r1 = 12
            X.91R r0 = new X.91R
            r0.<init>(r5, r1)
            java.util.Collections.sort(r4, r0)
            java.util.Iterator r3 = r4.iterator()
        L_0x0d34:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0d53
            java.lang.Object r2 = r3.next()
            X.2y4 r2 = (X.C60142y4) r2
            java.lang.String r0 = r2.A03
            r7.append(r0)
            java.lang.String r1 = " "
            r7.append(r1)
            int r0 = r2.A00
            r7.append(r0)
            r7.append(r1)
            goto L_0x0d34
        L_0x0d53:
            r1 = 13
            X.91R r0 = new X.91R
            r0.<init>(r5, r1)
            java.util.Collections.sort(r4, r0)
            android.content.res.Resources r1 = r5.getResources()
            r0 = 2131892665(0x7f1219b9, float:1.9420085E38)
            java.lang.String r0 = r1.getString(r0)
            goto L_0x0df5
        L_0x0d6a:
            r0 = r38
            boolean r0 = r0.A02
            r9 = 2
            r8 = 0
            android.content.res.Resources r12 = r5.getResources()
            if (r0 == 0) goto L_0x0dca
            r11 = 2131892663(0x7f1219b7, float:1.942008E38)
            java.lang.Object[] r10 = new java.lang.Object[r3]
            java.lang.String r0 = r4.A03
            r10[r8] = r0
        L_0x0d7f:
            java.lang.String r0 = r12.getString(r11, r10)
            r7.append(r0)
            java.lang.String r0 = "\n"
            r7.append(r0)
            boolean r0 = r5.A05
            if (r0 == 0) goto L_0x0da9
            int r2 = r4.A01
            android.content.res.Resources r1 = r5.getResources()
            r0 = 2131892679(0x7f1219c7, float:1.9420113E38)
            if (r2 != 0) goto L_0x0d9d
            r0 = 2131892680(0x7f1219c8, float:1.9420115E38)
        L_0x0d9d:
            java.lang.String r0 = r1.getString(r0)
            r7.append(r0)
            r0 = 10
            r7.append(r0)
        L_0x0da9:
            java.util.Iterator r2 = r37.iterator()
            r11 = 0
            r10 = 0
            r12 = 0
        L_0x0db0:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0de2
            java.lang.Object r1 = r2.next()
            X.2y4 r1 = (X.C60142y4) r1
            int r0 = r1.A00
            if (r0 <= r10) goto L_0x0dc5
            r10 = r0
            java.lang.String r11 = r1.A03
            r12 = 1
            goto L_0x0db0
        L_0x0dc5:
            if (r0 != r10) goto L_0x0db0
            int r12 = r12 + 1
            goto L_0x0db0
        L_0x0dca:
            r11 = 2131892664(0x7f1219b8, float:1.9420083E38)
            java.lang.Object[] r10 = new java.lang.Object[r9]
            android.content.Context r2 = r5.getContext()
            X.3Ex r1 = r5.A0t
            X.5ZU r0 = r5.A0v
            java.lang.String r0 = X.AnonymousClass287.A00(r2, r1, r0, r4)
            r10[r8] = r0
            java.lang.String r0 = r4.A03
            r10[r3] = r0
            goto L_0x0d7f
        L_0x0de2:
            java.lang.String r4 = X.C87094Nz.A0F(r5, r4)
            android.content.res.Resources r2 = r5.getResources()
            if (r10 > 0) goto L_0x0dfd
            r1 = 2131892662(0x7f1219b6, float:1.9420079E38)
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.String r0 = X.C18320x8.A0b(r2, r4, r0, r8, r1)
        L_0x0df5:
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r7)
            r6.setContentDescription(r0)
            return
        L_0x0dfd:
            if (r12 <= r3) goto L_0x0e0e
            r1 = 2131755279(0x7f10010f, float:1.9141433E38)
            java.lang.Object[] r0 = new java.lang.Object[r9]
            X.AnonymousClass000.A1P(r0, r10, r8)
            r0[r3] = r4
        L_0x0e09:
            java.lang.String r0 = r2.getQuantityString(r1, r10, r0)
            goto L_0x0df5
        L_0x0e0e:
            r1 = 2131755280(0x7f100110, float:1.9141435E38)
            java.lang.Object[] r0 = X.AnonymousClass0x9.A1X()
            r0[r8] = r11
            X.AnonymousClass000.A1P(r0, r10, r3)
            r0[r9] = r4
            goto L_0x0e09
        L_0x0e1d:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "ConversationRowPoll/current poll message does not match loaded newMessage="
            X.2z0 r0 = X.C624134x.A08(r4, r0, r1)
            X.AnonymousClass2z0.A0A(r0, r1)
            java.lang.String r0 = " previousMessage="
            r1.append(r0)
            java.lang.Object r0 = r39.getTag()
            X.C18260x0.A0m(r0, r1)
            return
        L_0x0e37:
            java.lang.Object r4 = r1.A00
            X.5b3 r4 = (X.C107285b3) r4
            java.lang.Object r3 = r1.A01
            com.whatsapp.jid.UserJid r3 = (com.whatsapp.jid.UserJid) r3
            boolean r2 = r1.A02
            int r0 = com.whatsapp.voipcalling.Voip.sendRemoveUserRequest(r3)
            if (r0 != 0) goto L_0x0e66
            if (r2 == 0) goto L_0x0e4e
            java.util.Set r0 = r4.A12
            r0.add(r3)
        L_0x0e4e:
            android.os.Handler r1 = r4.A0H
            r0 = 46
            r1.removeMessages(r0)
            android.os.Message r1 = new android.os.Message
            r1.<init>()
            r1.what = r0
            r1.arg1 = r2
            r1.obj = r3
            android.os.Handler r0 = r4.A0H
            r0.sendMessage(r1)
            return
        L_0x0e66:
            r1 = 28
            if (r2 == 0) goto L_0x0e6c
            r1 = 29
        L_0x0e6c:
            switch(r0) {
                case 670041: goto L_0x0e7a;
                case 670042: goto L_0x0e77;
                default: goto L_0x0e6f;
            }
        L_0x0e6f:
            java.util.List r0 = java.util.Collections.singletonList(r3)
            r4.A0p(r0, r1)
            return
        L_0x0e77:
            r1 = 25
            goto L_0x0e6f
        L_0x0e7a:
            r1 = 27
            goto L_0x0e6f
        L_0x0e7d:
            java.lang.Object r4 = r1.A00
            X.5b3 r4 = (X.C107285b3) r4
            java.lang.Object r0 = r1.A01
            com.whatsapp.voipcalling.CallInfo r0 = (com.whatsapp.voipcalling.CallInfo) r0
            boolean r3 = r1.A02
            java.lang.String r0 = r0.callId
            boolean r0 = r4.A0u(r0)
            r2 = r0 ^ 1
            X.1VX r1 = r4.A2o
            r0 = 4204(0x106c, float:5.891E-42)
            boolean r1 = r1.A0X(r0)
            boolean r0 = X.C107385bE.A09()
            if (r0 == 0) goto L_0x0ea0
            if (r1 == 0) goto L_0x0ea0
            r2 = 1
        L_0x0ea0:
            com.whatsapp.voipcalling.Voip.onCallInterrupted(r3, r2)
            return
        L_0x0ea4:
            java.lang.Object r0 = r1.A00
            X.5ZK r0 = (X.AnonymousClass5ZK) r0
            java.lang.Object r3 = r1.A01
            android.os.Vibrator r3 = (android.os.Vibrator) r3
            boolean r2 = r1.A02
            if (r3 == 0) goto L_0x0eb9
            long[] r1 = r0.A05
            r0 = -1
            if (r2 == 0) goto L_0x0eb6
            r0 = 0
        L_0x0eb6:
            r3.vibrate(r1, r0)
        L_0x0eb9:
            java.lang.String r0 = "voip/vibrate/start complete"
        L_0x0ebb:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x0ebf:
            java.lang.Object r4 = r1.A00
            com.whatsapp.calling.controls.viewmodel.ParticipantsListViewModel r4 = (com.whatsapp.calling.controls.viewmodel.ParticipantsListViewModel) r4
            java.lang.Object r0 = r1.A01
            X.5XK r0 = (X.AnonymousClass5XK) r0
            boolean r6 = r1.A02
            com.whatsapp.voipcalling.CallState r9 = r0.A07
            boolean r3 = r0.A0E
            X.8OQ r5 = r0.A02
            java.util.ArrayList r7 = X.AnonymousClass001.A0s()
            java.util.Collection r1 = r5.values()
            java.util.Iterator r12 = r1.iterator()
        L_0x0edb:
            r15 = 0
        L_0x0edc:
            boolean r1 = r12.hasNext()
            if (r1 == 0) goto L_0x0f15
            X.5Lb r2 = X.C86664Kz.A13(r12)
            boolean r1 = r2.A0J
            if (r1 != 0) goto L_0x0edc
            com.whatsapp.jid.UserJid r11 = r2.A08
            X.C162457s7.A0D(r11)
            int r10 = r2.A02
            r1 = 3
            if (r10 == r1) goto L_0x0efc
            r1 = 2
            if (r10 == r1) goto L_0x0efc
            r1 = 11
            r8 = 0
            if (r10 != r1) goto L_0x0efd
        L_0x0efc:
            r8 = 1
        L_0x0efd:
            boolean r2 = r2.A0D
            X.5SQ r1 = new X.5SQ
            r1.<init>(r11, r10, r8, r2)
            r7.add(r1)
            if (r15 != 0) goto L_0x0f13
            r1 = 3
            if (r10 == r1) goto L_0x0f13
            r1 = 2
            if (r10 == r1) goto L_0x0f13
            r1 = 11
            if (r10 != r1) goto L_0x0edb
        L_0x0f13:
            r15 = 1
            goto L_0x0edc
        L_0x0f15:
            boolean r1 = r0.A0I
            if (r1 == 0) goto L_0x0f4b
            X.2rS r2 = r4.A0C
            java.lang.String r1 = r0.A08
            java.lang.String r1 = X.C627436k.A08(r1)
            X.3ZF r1 = r2.A04(r1)
            if (r1 == 0) goto L_0x0f4b
            java.util.Iterator r11 = X.AnonymousClass3ZF.A01(r1)
        L_0x0f2b:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L_0x0f4b
            java.lang.Object r1 = r11.next()
            X.3ZE r1 = (X.AnonymousClass3ZE) r1
            com.whatsapp.jid.UserJid r10 = r1.A02
            boolean r1 = r5.containsKey(r10)
            if (r1 != 0) goto L_0x0f2b
            r8 = 0
            r2 = 11
            X.5SQ r1 = new X.5SQ
            r1.<init>(r10, r2, r8, r8)
            r7.add(r1)
            goto L_0x0f2b
        L_0x0f4b:
            r11 = 2
            X.6A5 r1 = new X.6A5
            r1.<init>(r4, r11)
            java.util.Collections.sort(r7, r1)
            X.1fJ r1 = r0.A04
            if (r1 != 0) goto L_0x0f6f
            if (r6 == 0) goto L_0x0f64
            boolean r1 = com.whatsapp.voipcalling.Voip.A09(r9)
            if (r1 != 0) goto L_0x0f6f
            com.whatsapp.voipcalling.CallState r1 = com.whatsapp.voipcalling.CallState.ACCEPT_SENT
            if (r9 == r1) goto L_0x0f6f
        L_0x0f64:
            X.1VX r2 = r4.A0D
            r1 = 4848(0x12f0, float:6.793E-42)
            boolean r1 = r2.A0X(r1)
            r14 = 1
            if (r1 == 0) goto L_0x0f70
        L_0x0f6f:
            r14 = 0
        L_0x0f70:
            X.8Sy r1 = r5.values()
            java.util.Iterator r5 = r1.iterator()
            r13 = 0
        L_0x0f79:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x0f8b
            X.5Lb r1 = X.C86664Kz.A13(r5)
            int r2 = r1.A02
            r1 = 1
            if (r2 != r1) goto L_0x0f79
            int r13 = r13 + 1
            goto L_0x0f79
        L_0x0f8b:
            if (r6 != 0) goto L_0x103a
            r8 = 1
            if (r13 <= r8) goto L_0x103a
            boolean r1 = r0.A0G
            if (r1 == 0) goto L_0x103a
            X.1VX r2 = r4.A0D
            r1 = 4848(0x12f0, float:6.793E-42)
            boolean r1 = r2.A0X(r1)
            if (r1 != 0) goto L_0x103a
        L_0x0f9e:
            if (r3 == 0) goto L_0x0fa3
            r12 = 1
            if (r15 != 0) goto L_0x0fa4
        L_0x0fa3:
            r12 = 0
        L_0x0fa4:
            java.util.ArrayList r3 = X.AnonymousClass001.A0s()
            java.util.HashSet r5 = X.AnonymousClass002.A0K()
            r6 = 0
            r2 = 1
            if (r8 == 0) goto L_0x0fd0
            X.107 r1 = r4.A0E
            boolean r1 = X.C86604Kt.A1Z(r1)
            r10 = 2131755174(0x7f1000a6, float:1.914122E38)
            if (r1 == 0) goto L_0x0fbe
            r10 = 2131755384(0x7f100178, float:1.9141646E38)
        L_0x0fbe:
            java.lang.Object[] r1 = new java.lang.Object[r2]
            X.AnonymousClass000.A1P(r1, r13, r6)
            X.6pX r8 = new X.6pX
            r8.<init>(r1, r10, r13)
            X.6fy r1 = new X.6fy
            r1.<init>(r8)
            r3.add(r1)
        L_0x0fd0:
            if (r12 == 0) goto L_0x0fda
            X.7Xm r1 = new X.7Xm
            r1.<init>(r11)
            r3.add(r1)
        L_0x0fda:
            java.lang.String r1 = r0.A09
            if (r1 == 0) goto L_0x0fed
            boolean r1 = X.AnonymousClass745.A00(r0)
            if (r1 != 0) goto L_0x0fed
            r8 = 5
            X.7Xm r1 = new X.7Xm
            r1.<init>(r8)
            r3.add(r1)
        L_0x0fed:
            if (r14 == 0) goto L_0x0ff7
            X.7Xm r1 = new X.7Xm
            r1.<init>(r6)
            r3.add(r1)
        L_0x0ff7:
            com.whatsapp.voipcalling.CallState r1 = com.whatsapp.voipcalling.CallState.PRECALLING
            if (r9 == r1) goto L_0x1037
            X.5Lb r1 = r0.A03
            if (r1 == 0) goto L_0x1037
            int r8 = r1.A02
            if (r8 == r2) goto L_0x1006
            r1 = 7
            if (r8 != r1) goto L_0x1037
        L_0x1006:
            r16 = 1
        L_0x1008:
            r1 = 0
        L_0x1009:
            int r8 = r7.size()
            if (r1 >= r8) goto L_0x1041
            java.lang.Object r9 = r7.get(r1)
            X.5SQ r9 = (X.AnonymousClass5SQ) r9
            int r8 = r9.A00
            if (r8 != r2) goto L_0x1041
            com.whatsapp.jid.UserJid r14 = r9.A01
            X.3Ex r8 = r4.A08
            X.3ZH r13 = r8.A0A(r14)
            int r15 = r9.A00
            X.107 r8 = r4.A0E
            boolean r17 = X.C86604Kt.A1Z(r8)
            X.6fx r12 = new X.6fx
            r12.<init>(r13, r14, r15, r16, r17)
            r3.add(r12)
            r5.add(r14)
            int r1 = r1 + 1
            goto L_0x1009
        L_0x1037:
            r16 = 0
            goto L_0x1008
        L_0x103a:
            r8 = 0
            int r13 = r7.size()
            goto L_0x0f9e
        L_0x1041:
            X.1VX r9 = r4.A0D
            r8 = 5091(0x13e3, float:7.134E-42)
            int r8 = r9.A0N(r8)
            int r8 = r8 >> 4
            r15 = 1
            r8 = r8 & 1
            if (r8 == r2) goto L_0x1051
            r15 = 0
        L_0x1051:
            r8 = 4716(0x126c, float:6.609E-42)
            int r9 = r9.A0N(r8)
            int r8 = r7.size()
            int r8 = r8 + 1
            r14 = 0
            if (r8 > r9) goto L_0x1061
            r14 = 1
        L_0x1061:
            boolean r12 = r0.A0C
            if (r12 == 0) goto L_0x107d
            int r8 = r7.size()
            if (r1 >= r8) goto L_0x107d
            if (r15 == 0) goto L_0x107d
            boolean r0 = r0.A0B
            if (r0 == 0) goto L_0x1074
            r8 = 1
            if (r14 != 0) goto L_0x1075
        L_0x1074:
            r8 = 0
        L_0x1075:
            X.6fz r0 = new X.6fz
            r0.<init>(r8)
            r3.add(r0)
        L_0x107d:
            r9 = 0
        L_0x107e:
            int r0 = r7.size()
            if (r1 >= r0) goto L_0x1116
            java.lang.Object r11 = r7.get(r1)
            X.5SQ r11 = (X.AnonymousClass5SQ) r11
            if (r12 == 0) goto L_0x10f5
            if (r14 != 0) goto L_0x10f5
            X.3Ex r0 = r4.A08
            com.whatsapp.jid.UserJid r10 = r11.A01
            boolean r0 = r0.A0l(r10)
            if (r0 != 0) goto L_0x10f5
            if (r15 == 0) goto L_0x10f5
            int r9 = r9 + 1
        L_0x109c:
            java.util.Set r8 = r4.A0H
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L_0x10ef
            boolean r0 = r8.contains(r10)
            if (r0 != 0) goto L_0x10ef
            int r0 = r11.A00
            if (r0 == r2) goto L_0x10ef
            X.5Ml r0 = r4.A00
            if (r0 == 0) goto L_0x10ef
            com.whatsapp.voipcalling.VoipActivityV2 r13 = r0.A00
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r0 = r13.A1t
            if (r0 == 0) goto L_0x10ef
            boolean r0 = r0.A1c()
            if (r0 != 0) goto L_0x10ef
            com.whatsapp.contact.picker.ContactPickerFragment r0 = r13.A1P
            if (r0 != 0) goto L_0x10ef
            boolean r0 = r11.A02
            if (r0 != 0) goto L_0x10ef
            com.whatsapp.voipcalling.CallInfo r8 = r13.A7D()
            if (r8 == 0) goto L_0x10ef
            com.whatsapp.voipcalling.CallState r11 = r8.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACTIVE
            if (r11 != r0) goto L_0x10ef
            boolean r0 = r8.isGroupCall
            if (r0 == 0) goto L_0x10ef
            com.whatsapp.calling.callgrid.viewmodel.InCallBannerViewModel r11 = r13.A0t
            boolean r13 = r8.videoEnabled
            com.whatsapp.jid.UserJid[] r0 = new com.whatsapp.jid.UserJid[r2]
            java.util.List r8 = X.AnonymousClass0x9.A1A(r10, r0, r6)
            r0 = 2131102707(0x7f060bf3, float:1.781786E38)
            if (r13 == 0) goto L_0x10e8
            r0 = 2131102073(0x7f060979, float:1.7816574E38)
        L_0x10e8:
            X.5L7 r0 = r11.A0H(r8, r0)
            r11.A0J(r0)
        L_0x10ef:
            r5.add(r10)
            int r1 = r1 + 1
            goto L_0x107e
        L_0x10f5:
            com.whatsapp.jid.UserJid r10 = r11.A01
            X.3Ex r0 = r4.A08
            X.3ZH r18 = r0.A0A(r10)
            int r8 = r11.A00
            X.107 r0 = r4.A0E
            boolean r22 = X.C86604Kt.A1Z(r0)
            X.6fx r0 = new X.6fx
            r17 = r0
            r19 = r10
            r20 = r8
            r21 = r16
            r17.<init>(r18, r19, r20, r21, r22)
            r3.add(r0)
            goto L_0x109c
        L_0x1116:
            if (r9 <= 0) goto L_0x112d
            java.lang.Object[] r2 = new java.lang.Object[r2]
            X.AnonymousClass000.A1P(r2, r9, r6)
            r0 = 2131755254(0x7f1000f6, float:1.9141382E38)
            X.6pX r1 = new X.6pX
            r1.<init>(r2, r0, r9)
            X.4jO r0 = new X.4jO
            r0.<init>(r1)
            r3.add(r0)
        L_0x112d:
            java.util.Set r0 = r4.A0H
            r0.clear()
            r0.addAll(r5)
            X.08M r0 = r4.A01
            r0.A0G(r3)
            return
        L_0x113b:
            java.lang.Object r4 = r1.A00
            X.4j9 r4 = (X.C91234j9) r4
            boolean r3 = r1.A02
            java.lang.Object r0 = r1.A01
            X.5Tw r0 = (X.C105175Tw) r0
            if (r3 == 0) goto L_0x1156
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r2 = r4.A06
            if (r2 == 0) goto L_0x1156
            X.4xk r0 = r2.A0R
            X.5XK r1 = r0.A08()
            r0 = 0
            r2.A0T(r1, r0)
            return
        L_0x1156:
            if (r0 == 0) goto L_0x1160
            if (r3 != 0) goto L_0x1160
            android.graphics.Bitmap r0 = r0.A07
        L_0x115c:
            r4.A0K(r0)
            return
        L_0x1160:
            r0 = 0
            goto L_0x115c
        L_0x1162:
            java.lang.Object r3 = r1.A00
            X.5pi r3 = (X.C116085pi) r3
            java.lang.Object r2 = r1.A01
            com.whatsapp.voipcalling.CallInfo r2 = (com.whatsapp.voipcalling.CallInfo) r2
            boolean r0 = r1.A02
            X.C116085pi.A03(r3, r2, r0)
            return
        L_0x1170:
            java.lang.Object r3 = r1.A00
            X.0y4 r3 = (X.C18670y4) r3
            java.lang.Object r2 = r1.A01
            java.util.concurrent.ScheduledFuture r2 = (java.util.concurrent.ScheduledFuture) r2
            boolean r0 = r1.A02
            X.C18670y4.A02(r3, r2, r0)
            return
        L_0x117e:
            java.lang.Object r5 = r1.A00
            java.lang.Object r2 = r1.A01
            X.49I r2 = (X.AnonymousClass49I) r2
            boolean r0 = r1.A02
            X.48t r4 = r2.B3r()
            if (r0 == 0) goto L_0x11a3
            java.lang.String r3 = "account_not_linked_error"
        L_0x118e:
            X.6dJ r2 = X.AnonymousClass8DJ.A03(r5)
            X.7Xj r1 = new X.7Xj
            r1.<init>()
            r0 = 0
            r1.A04(r3, r0)
            X.7jD r0 = r1.A03()
            X.C157157hp.A00(r2, r0, r4)
            return
        L_0x11a3:
            java.lang.String r3 = "generic_error"
            goto L_0x118e
        L_0x11a6:
            java.lang.Object r4 = r1.A00
            X.5c5 r4 = (X.C107895c5) r4
            java.lang.Object r3 = r1.A01
            android.app.Activity r3 = (android.app.Activity) r3
            boolean r1 = r1.A02
            X.1Xr r2 = new X.1Xr
            r2.<init>()
            java.lang.String r0 = X.C18310x6.A0n(r3)
            r2.A02 = r0
            X.2Zo r0 = r4.A0G
            java.lang.Long r0 = r0.A00()
            r2.A01 = r0
            int r0 = X.C18280x3.A01(r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A00 = r0
            X.4FV r1 = r4.A0E
            boolean r0 = r3 instanceof X.AnonymousClass64D
            if (r0 == 0) goto L_0x11df
            X.64D r3 = (X.AnonymousClass64D) r3
            X.5ZC r0 = r3.BCP()
        L_0x11d9:
            int r0 = r0.A01
            r1.BhE(r2, r0)
            return
        L_0x11df:
            X.5ZC r0 = X.C58152un.A03
            goto L_0x11d9
        L_0x11e2:
            r3.BbQ(r0)
            return
        L_0x11e6:
            X.08M r4 = r3.A0H
            X.59D r3 = X.AnonymousClass59D.LOADING_FAILED
            r2 = 0
            if (r5 == 0) goto L_0x11f5
            java.lang.String r1 = r5.A07()     // Catch:{ MalformedURLException -> 0x11f2 }
            goto L_0x11f6
        L_0x11f2:
            java.lang.String r1 = r5.A0Z
            goto L_0x11f6
        L_0x11f5:
            r1 = 0
        L_0x11f6:
            X.5SA r0 = new X.5SA
            r0.<init>(r2, r3, r1)
            r4.A0H(r0)
            return
        L_0x11ff:
            X.08M r0 = r3.A0E
            r0.A0H(r5)
            return
        L_0x1205:
            java.lang.Object r3 = r1.A00
            com.whatsapp.chatlock.ChatLockAuthViewModel r3 = (com.whatsapp.chatlock.ChatLockAuthViewModel) r3
            boolean r2 = r1.A02
            java.lang.Object r0 = r1.A01
            X.31A r0 = (X.AnonymousClass31A) r0
            X.5aW r1 = r3.A04
            X.4uZ r0 = r0.A05()
            X.C162457s7.A0D(r0)
            r1.A0D(r0, r2)
            X.08M r1 = r3.A03
            X.2wD r0 = X.C59022wD.A00
        L_0x121f:
            r1.A0G(r0)
            return
        L_0x1223:
            X.7am r1 = r5.A0F
            r0 = 4
            r1.A04(r6, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C117665sI.run():void");
    }

    public C117665sI(Object obj, Object obj2, int i, boolean z) {
        this.A03 = i;
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = z;
    }
}
