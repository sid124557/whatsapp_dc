package X;

import android.os.Handler;

/* renamed from: X.3by  reason: invalid class name and case insensitive filesystem */
public class C71353by implements Runnable {
    public Object A00;
    public Object A01;
    public final int A02;

    public C71353by(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    public static void A00(Handler handler, Object obj, Object obj2, int i) {
        handler.post(new C71353by(obj, i, obj2));
    }

    public static void A01(AnonymousClass4FS r1, Object obj, Object obj2, int i) {
        r1.BkM(new C71353by(obj, i, obj2));
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:871)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:128)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0319  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0165  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0266  */
    public final void run() {
        /*
            r108 = this;
            r2 = r108
            int r0 = r2.A02
            switch(r0) {
                case 0: goto L_0x0643;
                case 1: goto L_0x0015;
                case 2: goto L_0x0037;
                case 3: goto L_0x0068;
                case 4: goto L_0x065e;
                case 5: goto L_0x066a;
                case 6: goto L_0x009d;
                case 7: goto L_0x0682;
                case 8: goto L_0x06a6;
                case 9: goto L_0x06b5;
                case 10: goto L_0x06c1;
                case 11: goto L_0x0007;
                case 12: goto L_0x0007;
                case 13: goto L_0x0007;
                case 14: goto L_0x0007;
                case 15: goto L_0x06d5;
                case 16: goto L_0x0007;
                case 17: goto L_0x0007;
                case 18: goto L_0x00b5;
                case 19: goto L_0x06e7;
                case 20: goto L_0x06c1;
                case 21: goto L_0x0733;
                case 22: goto L_0x0740;
                case 23: goto L_0x074c;
                case 24: goto L_0x075a;
                case 25: goto L_0x0775;
                case 26: goto L_0x078b;
                case 27: goto L_0x0803;
                case 28: goto L_0x080e;
                case 29: goto L_0x00db;
                case 30: goto L_0x0822;
                case 31: goto L_0x082f;
                case 32: goto L_0x0848;
                case 33: goto L_0x0858;
                case 34: goto L_0x042c;
                case 35: goto L_0x044e;
                case 36: goto L_0x0869;
                case 37: goto L_0x0880;
                case 38: goto L_0x08a8;
                case 39: goto L_0x08b4;
                case 40: goto L_0x04bb;
                case 41: goto L_0x08c2;
                case 42: goto L_0x04e4;
                case 43: goto L_0x08de;
                case 44: goto L_0x08ea;
                case 45: goto L_0x0906;
                case 46: goto L_0x0956;
                case 47: goto L_0x0993;
                case 48: goto L_0x052b;
                case 49: goto L_0x09af;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r2.A00
            X.33o r0 = (X.C621233o) r0
            java.lang.Object r1 = r2.A01
            X.4uZ r1 = (X.C95814uZ) r1
            X.1hw r0 = r0.A0H
            r0.A0A(r1)
        L_0x0014:
            return
        L_0x0015:
            java.lang.Object r0 = r2.A00
            X.4IC r0 = (X.AnonymousClass4IC) r0
            java.lang.Object r2 = r2.A01
            X.4uZ r2 = (X.C95814uZ) r2
            java.lang.Object r3 = r0.A00
            X.4ea r3 = (X.C89654ea) r3
            boolean r0 = r3.BHW()
            if (r0 != 0) goto L_0x0014
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "ViewGroupInviteActivity/onConversationChanged/ok/"
            X.C18260x0.A1R(r1, r0, r2)
            android.content.Intent r1 = X.C627736r.A0O(r3, r2)
            java.lang.String r0 = "ViewGroupInviteActivity:onConversationChanged"
            goto L_0x0060
        L_0x0037:
            java.lang.Object r0 = r2.A00
            X.4IC r0 = (X.AnonymousClass4IC) r0
            java.lang.Object r2 = r2.A01
            X.4uZ r2 = (X.C95814uZ) r2
            java.lang.Object r3 = r0.A00
            com.whatsapp.invites.ViewGroupInviteActivity r3 = (com.whatsapp.invites.ViewGroupInviteActivity) r3
            X.2ss r0 = r3.A0E
            boolean r0 = r0.A0L(r2)
            if (r0 == 0) goto L_0x0014
            boolean r0 = r3.BHW()
            if (r0 != 0) goto L_0x0014
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "ViewGroupInviteActivity/onConversationsListChanged/ok/"
            X.C18260x0.A1R(r1, r0, r2)
            android.content.Intent r1 = X.C627736r.A0O(r3, r2)
            java.lang.String r0 = "ViewGroupInviteActivity:onConversationsListChanged"
        L_0x0060:
            X.AnonymousClass5VI.A00(r1, r0)
            r0 = 1
            r3.A6T(r1, r0)
            return
        L_0x0068:
            java.lang.Object r0 = r2.A00
            X.3P3 r0 = (X.AnonymousClass3P3) r0
            java.lang.Object r3 = r2.A01
            byte[] r3 = (byte[]) r3
            com.whatsapp.invites.ViewGroupInviteActivity r2 = r0.A00
            boolean r0 = r2.BHW()
            if (r0 != 0) goto L_0x0014
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "ViewGroupInviteActivity/fetchGroupProfilePicture: "
            r1.append(r0)
            if (r3 != 0) goto L_0x0097
            java.lang.String r0 = "null"
        L_0x0086:
            X.C18260x0.A0o(r0, r1)
            if (r3 == 0) goto L_0x0014
            r1 = 0
            int r0 = r3.length
            android.graphics.Bitmap r1 = android.graphics.BitmapFactory.decodeByteArray(r3, r1, r0)
            X.5RG r0 = r2.A0K
            r0.A00(r1)
            return
        L_0x0097:
            int r0 = r3.length
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x0086
        L_0x009d:
            java.lang.Object r3 = r2.A00
            X.2sp r3 = (X.C56952sp) r3
            java.lang.Object r2 = r2.A01
            X.3dV r2 = (X.C72303dV) r2
            r1 = 1350(0x546, float:1.892E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r3.A0Y(r0, r1)
            if (r0 == 0) goto L_0x0014
            X.4Fq r4 = r2.A04()
            goto L_0x0a51
        L_0x00b5:
            java.lang.Object r3 = r2.A00
            X.33o r3 = (X.C621233o) r3
            java.lang.Object r0 = r2.A01
            java.util.AbstractCollection r0 = (java.util.AbstractCollection) r0
            java.util.Iterator r2 = r0.iterator()
        L_0x00c1:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0014
            X.4uZ r1 = X.C18300x5.A0P(r2)
            if (r1 != 0) goto L_0x00d3
            java.lang.String r0 = "LocationSharingManager/ContactObserver/found jid == null"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x00c1
        L_0x00d3:
            r3.A0Q(r1)
            r0 = 0
            r3.A0R(r1, r0)
            goto L_0x00c1
        L_0x00db:
            java.lang.Object r0 = r2.A00
            r37 = r0
            r0 = r37
            X.1I7 r0 = (X.AnonymousClass1I7) r0
            r37 = r0
            java.lang.Object r4 = r2.A01
            X.35m r4 = (X.C625435m) r4
            X.2ZV r2 = r0.A0R
            X.2dc r0 = r0.A0e
            r107 = r0
            r0 = r37
            X.2sk r0 = r0.A0d
            r36 = r0
            monitor-enter(r36)
            boolean r3 = r0.A0I     // Catch:{ all -> 0x0aed }
            monitor-exit(r36)
            r1 = 0
            r0 = r107
            X.C162457s7.A0J(r0, r1)
            int r1 = r4.A01
            boolean r10 = X.AnonymousClass000.A1T(r1)
            r0 = 23
            if (r10 != 0) goto L_0x0156
            if (r1 == r0) goto L_0x015b
            r11 = 0
        L_0x010c:
            r0 = r37
            X.2pR r0 = r0.A0Z
            r35 = r0
            r0 = r37
            X.2sf r0 = r0.A0h
            r106 = r0
            long r2 = r106.A05()
            double r4 = (double) r2
            r0 = r107
            int r0 = r0.A05
            r105 = r0
            r0 = r37
            int r3 = r0.A07
            r0 = 11
            if (r3 == r0) goto L_0x013b
            r0 = 13
            if (r3 == r0) goto L_0x0154
            switch(r3) {
                case 1: goto L_0x0152;
                case 2: goto L_0x0150;
                case 3: goto L_0x014e;
                case 4: goto L_0x014c;
                case 5: goto L_0x013b;
                case 6: goto L_0x013b;
                case 7: goto L_0x013b;
                default: goto L_0x0132;
            }
        L_0x0132:
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "MediaDownload/downloadOriginTypeToMediaOriginType/invalid downloadOriginType = "
            X.C18260x0.A0x(r0, r2, r3)
        L_0x013b:
            r6 = 0
        L_0x013c:
            r0 = r37
            int r0 = r0.A12
            boolean r20 = X.AnonymousClass000.A1S(r0)
            r0 = 14
            boolean r9 = X.AnonymousClass000.A1U(r1, r0)
            monitor-enter(r35)
            goto L_0x0198
        L_0x014c:
            r6 = 4
            goto L_0x013c
        L_0x014e:
            r6 = 3
            goto L_0x013c
        L_0x0150:
            r6 = 2
            goto L_0x013c
        L_0x0152:
            r6 = 1
            goto L_0x013c
        L_0x0154:
            r6 = 7
            goto L_0x013c
        L_0x0156:
            if (r1 == r0) goto L_0x015b
            r13 = 0
            if (r3 == 0) goto L_0x015c
        L_0x015b:
            r13 = 1
        L_0x015c:
            r0 = r107
            boolean r3 = r0.A0b
            int r4 = r0.A05
            r0 = 2
            if (r4 != r0) goto L_0x0168
            r14 = 1
            if (r13 == 0) goto L_0x0169
        L_0x0168:
            r14 = 0
        L_0x0169:
            X.2ss r2 = r2.A00
            r0 = r107
            X.4uZ r0 = r0.A08
            boolean r17 = r2.A0N(r0)
            r0 = r107
            boolean r5 = r0.A0a
            java.lang.String r2 = r0.A0J
            X.38t r0 = r0.A0A
            boolean r0 = X.C106695a0.A03(r0)
            if (r0 == 0) goto L_0x018b
            if (r2 == 0) goto L_0x018b
            boolean r0 = X.C989053r.A07(r2)
            r16 = 1
            if (r0 != 0) goto L_0x018d
        L_0x018b:
            r16 = 0
        L_0x018d:
            X.2nV r11 = new X.2nV
            r12 = r4
            r15 = r3
            r18 = r5
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            goto L_0x010c
        L_0x0198:
            long r18 = r35.A01()     // Catch:{ all -> 0x0aea }
            int r12 = r35.A00()     // Catch:{ all -> 0x0aea }
            r0 = r35
            X.7jI r8 = r0.A04     // Catch:{ all -> 0x0aea }
            r14 = r8
            r15 = r105
            r16 = r12
            r17 = r6
            X.7n9 r7 = r14.A00(r15, r16, r17, r18, r20)     // Catch:{ all -> 0x0aea }
            long r0 = r7.A00     // Catch:{ all -> 0x0aea }
            double r2 = (double) r0     // Catch:{ all -> 0x0aea }
            double r2 = r2 + r4
            long r0 = (long) r2     // Catch:{ all -> 0x0aea }
            r7.A00 = r0     // Catch:{ all -> 0x0aea }
            if (r10 == 0) goto L_0x01bf
            long r0 = r7.A02     // Catch:{ all -> 0x0aea }
            r2 = 1
            long r0 = r0 + r2
            r7.A02 = r0     // Catch:{ all -> 0x0aea }
        L_0x01bf:
            r13 = r8
            r14 = r7
            r13.A01(r14, r15, r16, r17, r18, r20)     // Catch:{ all -> 0x0aea }
            if (r11 == 0) goto L_0x03a4
            r0 = r35
            X.2YQ r0 = r0.A05     // Catch:{ all -> 0x0aea }
            X.7aI r0 = r0.A01     // Catch:{ all -> 0x0aea }
            r104 = r0
            X.33B r8 = r104.A00()     // Catch:{ all -> 0x0aea }
            r0 = 1
            r33 = 1
            if (r6 == r0) goto L_0x01fe
            r0 = 2
            if (r6 == r0) goto L_0x01e2
            r0 = 3
            if (r6 == r0) goto L_0x020e
            r0 = 4
            if (r6 == r0) goto L_0x020e
            goto L_0x0261
        L_0x01e2:
            boolean r0 = r11.A01     // Catch:{ all -> 0x0aea }
            r40 = 0
            if (r0 == 0) goto L_0x01f2
            long r4 = r8.A0C     // Catch:{ all -> 0x0aea }
            long r4 = r4 + r33
            r39 = -33554433(0xfffffffffdffffff, float:-4.2535293E37)
            r0 = 0
            goto L_0x0209
        L_0x01f2:
            long r2 = r8.A0F     // Catch:{ all -> 0x0aea }
            long r2 = r2 + r33
            r39 = -134217729(0xfffffffff7ffffff, float:-1.0384593E34)
            r0 = 0
            r4 = 0
            goto L_0x020b
        L_0x01fe:
            r40 = 0
            long r0 = r8.A0A     // Catch:{ all -> 0x0aea }
            long r0 = r0 + r33
            r39 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r4 = 0
        L_0x0209:
            r2 = 0
        L_0x020b:
            r6 = 0
            goto L_0x021d
        L_0x020e:
            r40 = 0
            long r6 = r8.A0H     // Catch:{ all -> 0x0aea }
            long r6 = r6 + r33
            r39 = -536870913(0xffffffffdfffffff, float:-3.6893486E19)
            r0 = 0
            r4 = 0
            r2 = 0
        L_0x021d:
            r44 = r40
            r46 = r40
            r48 = r40
            r50 = r40
            r52 = r40
            r54 = r40
            r56 = r40
            r58 = r40
            r60 = r40
            r62 = r40
            r64 = r40
            r66 = r40
            r68 = r40
            r70 = r40
            r72 = r40
            r74 = r40
            r76 = r40
            r78 = r40
            r80 = r40
            r82 = r40
            r84 = r40
            r88 = r40
            r92 = r40
            r96 = r40
            r100 = r40
            r102 = r40
            r42 = r40
            r86 = r0
            r90 = r4
            r94 = r2
            r98 = r6
            r38 = r8
            X.33B r8 = X.AnonymousClass33B.A00(r38, r39, r40, r42, r44, r46, r48, r50, r52, r54, r56, r58, r60, r62, r64, r66, r68, r70, r72, r74, r76, r78, r80, r82, r84, r86, r88, r90, r92, r94, r96, r98, r100, r102)     // Catch:{ all -> 0x0aea }
        L_0x0261:
            int r1 = r11.A00     // Catch:{ all -> 0x0aea }
            r0 = 2
            if (r1 == r0) goto L_0x0319
            r0 = 3
            if (r1 == r0) goto L_0x02e7
            r0 = 4
            if (r1 == r0) goto L_0x02bf
            r0 = 5
            if (r1 == r0) goto L_0x02bf
            r0 = 8
            if (r1 == r0) goto L_0x0283
            r0 = 11
            if (r1 != r0) goto L_0x039e
            r40 = 0
            long r0 = r8.A06     // Catch:{ all -> 0x0aea }
            long r31 = r0 + r33
            r39 = -1048577(0xffffffffffefffff, float:NaN)
            r17 = 0
            goto L_0x02ca
        L_0x0283:
            boolean r2 = r11.A03     // Catch:{ all -> 0x0aea }
            long r0 = r8.A09     // Catch:{ all -> 0x0aea }
            r29 = r0
            if (r2 == 0) goto L_0x028d
            long r29 = r0 + r33
        L_0x028d:
            r2 = 111(0x6f, float:1.56E-43)
            long r0 = r8.A03     // Catch:{ all -> 0x0aea }
            r27 = r0
            if (r12 != r2) goto L_0x0297
            long r27 = r27 + r33
        L_0x0297:
            r2 = 1
            long r0 = r8.A04     // Catch:{ all -> 0x0aea }
            r25 = r0
            if (r12 != r2) goto L_0x02a0
            long r25 = r25 + r33
        L_0x02a0:
            long r0 = r8.A02     // Catch:{ all -> 0x0aea }
            long r23 = r0 + r33
            r40 = 0
            r39 = -237569(0xfffffffffffc5fff, float:NaN)
            r0 = 0
            r21 = 0
            r2 = 0
            r19 = 0
            r4 = 0
            r6 = 0
            r15 = 0
            r13 = 0
            r11 = 0
            r9 = 0
            goto L_0x0356
        L_0x02bf:
            r40 = 0
            long r0 = r8.A00     // Catch:{ all -> 0x0aea }
            long r17 = r0 + r33
            r39 = -524289(0xfffffffffff7ffff, float:NaN)
            r31 = 0
        L_0x02ca:
            r0 = 0
            r21 = 0
            r2 = 0
            r19 = 0
            r4 = 0
            r6 = 0
            r15 = 0
            r13 = 0
            r11 = 0
            r9 = 0
            r23 = 0
            r27 = 0
            r25 = 0
            r29 = 0
            goto L_0x035a
        L_0x02e7:
            boolean r0 = r11.A06     // Catch:{ all -> 0x0aea }
            long r9 = r8.A0V     // Catch:{ all -> 0x0aea }
            if (r0 == 0) goto L_0x02ef
            long r9 = r9 + r33
        L_0x02ef:
            r1 = 111(0x6f, float:1.56E-43)
            long r15 = r8.A0R     // Catch:{ all -> 0x0aea }
            if (r12 != r1) goto L_0x02f7
            long r15 = r15 + r33
        L_0x02f7:
            r1 = 1
            long r13 = r8.A0S     // Catch:{ all -> 0x0aea }
            if (r12 != r1) goto L_0x02fe
            long r13 = r13 + r33
        L_0x02fe:
            boolean r0 = r11.A05     // Catch:{ all -> 0x0aea }
            long r11 = r8.A0T     // Catch:{ all -> 0x0aea }
            if (r0 == 0) goto L_0x0306
            long r11 = r11 + r33
        L_0x0306:
            long r6 = r8.A0Q     // Catch:{ all -> 0x0aea }
            long r6 = r6 + r33
            r40 = 0
            r39 = -3969(0xfffffffffffff07f, float:NaN)
            r0 = 0
            r21 = 0
            r2 = 0
            r19 = 0
            r4 = 0
            goto L_0x034e
        L_0x0319:
            boolean r0 = r11.A06     // Catch:{ all -> 0x0aea }
            long r4 = r8.A0N     // Catch:{ all -> 0x0aea }
            if (r0 == 0) goto L_0x0321
            long r4 = r4 + r33
        L_0x0321:
            boolean r2 = r11.A04     // Catch:{ all -> 0x0aea }
            long r0 = r8.A0L     // Catch:{ all -> 0x0aea }
            r21 = r0
            if (r2 == 0) goto L_0x032b
            long r21 = r0 + r33
        L_0x032b:
            boolean r0 = r11.A02     // Catch:{ all -> 0x0aea }
            long r2 = r8.A0K     // Catch:{ all -> 0x0aea }
            if (r0 == 0) goto L_0x0333
            long r2 = r2 + r33
        L_0x0333:
            r6 = 1
            long r0 = r8.A0O     // Catch:{ all -> 0x0aea }
            r19 = r0
            if (r12 != r6) goto L_0x033c
            long r19 = r19 + r33
        L_0x033c:
            long r0 = r8.A0J     // Catch:{ all -> 0x0aea }
            long r0 = r0 + r33
            r40 = 0
            r39 = -63
            r6 = 0
            r15 = 0
            r13 = 0
            r11 = 0
            r9 = 0
        L_0x034e:
            r23 = 0
            r27 = 0
            r25 = 0
            r29 = 0
        L_0x0356:
            r17 = 0
            r31 = 0
        L_0x035a:
            r64 = r40
            r68 = r40
            r76 = r40
            r82 = r40
            r84 = r40
            r86 = r40
            r88 = r40
            r90 = r40
            r92 = r40
            r94 = r40
            r96 = r40
            r98 = r40
            r100 = r40
            r102 = r40
            r44 = r21
            r46 = r2
            r48 = r19
            r50 = r4
            r52 = r40
            r54 = r6
            r56 = r15
            r58 = r13
            r60 = r11
            r62 = r9
            r66 = r23
            r70 = r27
            r72 = r25
            r74 = r29
            r78 = r17
            r80 = r31
            r38 = r8
            r42 = r0
            X.33B r8 = X.AnonymousClass33B.A00(r38, r39, r40, r42, r44, r46, r48, r50, r52, r54, r56, r58, r60, r62, r64, r66, r68, r70, r72, r74, r76, r78, r80, r82, r84, r86, r88, r90, r92, r94, r96, r98, r100, r102)     // Catch:{ all -> 0x0aea }
        L_0x039e:
            r0 = r104
            r0.A02(r8)     // Catch:{ all -> 0x0aea }
            goto L_0x0403
        L_0x03a4:
            if (r10 != 0) goto L_0x0403
            if (r9 != 0) goto L_0x0403
            r0 = r35
            X.2YQ r0 = r0.A05     // Catch:{ all -> 0x0aea }
            X.7aI r5 = r0.A01     // Catch:{ all -> 0x0aea }
            X.33B r4 = r5.A00()     // Catch:{ all -> 0x0aea }
            r40 = 0
            long r2 = r4.A0E     // Catch:{ all -> 0x0aea }
            r0 = 1
            long r2 = r2 + r0
            r39 = 2147483647(0x7fffffff, float:NaN)
            r44 = r40
            r46 = r40
            r48 = r40
            r50 = r40
            r52 = r40
            r54 = r40
            r56 = r40
            r58 = r40
            r60 = r40
            r62 = r40
            r64 = r40
            r66 = r40
            r68 = r40
            r70 = r40
            r72 = r40
            r74 = r40
            r76 = r40
            r78 = r40
            r80 = r40
            r82 = r40
            r84 = r40
            r86 = r40
            r88 = r40
            r90 = r40
            r92 = r40
            r94 = r40
            r96 = r40
            r98 = r40
            r100 = r40
            r42 = r40
            r102 = r2
            r38 = r4
            X.33B r0 = X.AnonymousClass33B.A00(r38, r39, r40, r42, r44, r46, r48, r50, r52, r54, r56, r58, r60, r62, r64, r66, r68, r70, r72, r74, r76, r78, r80, r82, r84, r86, r88, r90, r92, r94, r96, r98, r100, r102)     // Catch:{ all -> 0x0aea }
            r5.A02(r0)     // Catch:{ all -> 0x0aea }
        L_0x0403:
            monitor-exit(r35)
            r0 = r37
            X.36E r3 = r0.A0C
            java.io.File r2 = r36.A03()
            r0 = r106
            X.35m r0 = r0.A0J
            if (r0 != 0) goto L_0x0429
            r0 = -1
        L_0x0413:
            int r1 = X.C106495Zf.A01(r0)
            r0 = r107
            X.38t r5 = r0.A0A
            boolean r0 = X.AnonymousClass36O.A06(r5)
            if (r0 == 0) goto L_0x0014
            r0 = 1
            if (r1 == r0) goto L_0x0a7b
            r0 = 15
            if (r1 == r0) goto L_0x0a7b
            return
        L_0x0429:
            int r0 = r0.A01
            goto L_0x0413
        L_0x042c:
            java.lang.Object r3 = r2.A00
            com.whatsapp.mediacomposer.MediaComposerActivity r3 = (com.whatsapp.mediacomposer.MediaComposerActivity) r3
            java.lang.Object r1 = r2.A01
            android.view.Window r1 = (android.view.Window) r1
            X.0Wx r0 = r3.A0A
            java.lang.Object r0 = r0.A07()
            if (r0 != 0) goto L_0x0014
            r0 = 1
            r3.A1V = r0
            r0 = 0
            r1.setSharedElementEnterTransition(r0)
            android.view.View r1 = r3.A06
            r0 = 8
            r1.setVisibility(r0)
            r3.A5V()
            return
        L_0x044e:
            java.lang.Object r5 = r2.A00
            com.whatsapp.mediacomposer.bottomsheet.ImageQualitySettingsBottomSheetFragment r5 = (com.whatsapp.mediacomposer.bottomsheet.ImageQualitySettingsBottomSheetFragment) r5
            java.lang.Object r6 = r2.A01
            java.util.Map r6 = (java.util.Map) r6
            java.util.SortedMap r0 = r5.A04
            java.util.Iterator r7 = X.AnonymousClass000.A0q(r0)
        L_0x045c:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0014
            java.util.Map$Entry r0 = X.AnonymousClass001.A0w(r7)
            java.lang.Object r4 = r0.getKey()
            java.lang.Number r4 = (java.lang.Number) r4
            java.lang.Object r0 = r0.getValue()
            X.7YH r0 = (X.AnonymousClass7YH) r0
            int r0 = r0.A00
            java.lang.Object r0 = X.AnonymousClass001.A0i(r6, r0)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x045c
            long r1 = r0.longValue()
            android.view.View r3 = r5.A0B
            if (r3 == 0) goto L_0x045c
            X.C162457s7.A0H(r4)
            int r0 = r4.intValue()
            android.view.View r4 = r3.findViewById(r0)
            com.whatsapp.radio.RadioButtonWithSubtitle r4 = (com.whatsapp.radio.RadioButtonWithSubtitle) r4
            if (r4 == 0) goto L_0x045c
            java.lang.CharSequence r3 = r4.A00
            X.33j r0 = r5.A03
            if (r0 == 0) goto L_0x0af0
            java.lang.String r0 = X.AnonymousClass35V.A03(r0, r1)
            if (r3 == 0) goto L_0x04b7
            if (r0 == 0) goto L_0x04b6
            java.lang.Object[] r2 = X.AnonymousClass002.A0M()
            X.AnonymousClass000.A16(r3, r0, r2)
            r1 = 2131890640(0x7f1211d0, float:1.9415978E38)
            android.content.res.Resources r0 = X.C08310eF.A09(r5)
            java.lang.String r0 = r0.getString(r1, r2)
            if (r0 == 0) goto L_0x04b6
            r3 = r0
        L_0x04b6:
            r0 = r3
        L_0x04b7:
            r4.setSubTitle(r0)
            goto L_0x045c
        L_0x04bb:
            java.lang.Object r3 = r2.A00
            X.1ry r3 = (X.C32961ry) r3
            java.lang.Object r1 = r2.A01
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0 = 0
            r3.A00 = r0
            android.view.View r0 = r3.A01
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0014
            X.6Gy r0 = r3.A03
            java.lang.String r2 = r1.toString()
            X.107 r1 = r0.A02
            java.lang.Object r0 = r1.A07()
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x0014
            r1.A0H(r2)
            return
        L_0x04e4:
            java.lang.Object r0 = r2.A00
            X.8GQ r0 = (X.AnonymousClass8GQ) r0
            java.lang.Object r7 = r2.A01
            java.util.AbstractMap r7 = (java.util.AbstractMap) r7
            X.4Wu r6 = r0.A00
            r0 = 0
            r6.A00 = r0
            java.util.Iterator r5 = X.C18290x4.A11(r7)
            r4 = 0
        L_0x04f6:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0520
            java.lang.Object r1 = r5.next()
            java.util.Map r0 = X.C106315Ym.A01
            java.lang.Object r0 = r0.get(r1)
            X.7L7 r0 = (X.AnonymousClass7L7) r0
            int r3 = r0.A00
            r0 = 1
            int r3 = r3 - r0
            java.lang.Object r0 = r7.get(r1)
            if (r3 < 0) goto L_0x04f6
            boolean r2 = X.AnonymousClass000.A1W(r0)
            boolean[] r1 = r6.A02
            boolean r0 = r1[r3]
            if (r2 == r0) goto L_0x051d
            r4 = 1
        L_0x051d:
            r1[r3] = r2
            goto L_0x04f6
        L_0x0520:
            java.lang.String r0 = "FilterThumbnailAdapter/fetchFilters filters ready"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            if (r4 == 0) goto L_0x0014
            r6.A05()
            return
        L_0x052b:
            java.lang.Object r6 = r2.A00
            X.2SL r6 = (X.AnonymousClass2SL) r6
            java.lang.Object r1 = r2.A01
            X.33i r1 = (X.C620633i) r1
            X.1aA r4 = new X.1aA
            r4.<init>()
            X.5ZC r9 = r4.samplingRate
            boolean r0 = r9.A00()
            if (r0 == 0) goto L_0x0014
            android.app.ActivityManager r2 = r1.A06()
            if (r2 == 0) goto L_0x0014
            int[] r1 = X.C18330xA.A0E()
            int r0 = android.os.Process.myPid()
            r5 = 0
            r1[r5] = r0
            android.os.Debug$MemoryInfo[] r3 = r2.getProcessMemoryInfo(r1)
            X.2Zo r2 = r6.A04
            long r0 = android.os.SystemClock.uptimeMillis()
            r2.A00 = r0
            if (r3 == 0) goto L_0x0014
            int r0 = r3.length
            if (r0 == 0) goto L_0x0014
            r2 = r3[r5]
            int r0 = r2.getTotalPss()
            double r0 = (double) r0
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r4.A05 = r0
            int r0 = r2.getTotalPrivateDirty()
            double r0 = (double) r0
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r4.A02 = r0
            int r0 = r2.dalvikPrivateDirty
            double r0 = (double) r0
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r4.A00 = r0
            int r0 = r2.nativePrivateDirty
            double r0 = (double) r0
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r4.A01 = r0
            int r0 = r2.getTotalSharedDirty()
            double r0 = (double) r0
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r4.A03 = r0
            long r7 = android.os.SystemClock.uptimeMillis()
            X.3Er r0 = r6.A02
            long r0 = r0.A00
            long r7 = r7 - r0
            double r2 = (double) r7
            r0 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r2 = r2 / r0
            java.lang.Double r0 = java.lang.Double.valueOf(r2)
            r4.A04 = r0
            int r0 = java.lang.Thread.activeCount()
            java.lang.Long r0 = X.AnonymousClass0x9.A0m(r0)
            r4.A06 = r0
            X.4FV r1 = r6.A03
            int r0 = r9.A01
            r1.BhE(r4, r0)
            java.lang.Long r8 = r4.A06
            long r3 = r8.longValue()
            r1 = 140(0x8c, double:6.9E-322)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x061d
            X.2qk r7 = r6.A00
            java.lang.String r1 = java.lang.String.valueOf(r8)
            java.lang.String r0 = "too-many-threads"
            r7.A0A(r0, r5, r1)
            java.util.Map r1 = java.lang.Thread.getAllStackTraces()
            int r0 = r1.size()
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>(r0)
            java.util.Iterator r3 = X.AnonymousClass000.A0q(r1)
        L_0x05e7:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x061d
            java.util.Map$Entry r0 = X.AnonymousClass001.A0w(r3)
            java.lang.Object r0 = r0.getKey()
            java.lang.Thread r0 = (java.lang.Thread) r0
            java.lang.String r2 = r0.getName()
            boolean r0 = r4.contains(r2)
            if (r0 == 0) goto L_0x0619
            java.util.Set r0 = X.AnonymousClass2BQ.A00
            boolean r0 = r0.contains(r2)
            if (r0 != 0) goto L_0x05e7
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "ThreadLeakDetector/detectAndReportThreadLeak detected:"
            X.C18260x0.A0r(r0, r2, r1)
            java.lang.String r0 = "thread-leak"
            r7.A0A(r0, r5, r2)
            goto L_0x05e7
        L_0x0619:
            r4.add(r2)
            goto L_0x05e7
        L_0x061d:
            X.4FS r0 = r6.A05
            boolean r0 = r0 instanceof X.C69423Wy
            if (r0 == 0) goto L_0x0014
            X.8Tz r0 = X.C69423Wy.A05
            int r0 = r0.getLargestPoolSize()
            long r3 = (long) r0
            r1 = 128(0x80, double:6.32E-322)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0014
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0014
            X.2qk r2 = r6.A00
            java.lang.String r1 = "too-many-threads-waworkers"
            java.lang.String r0 = java.lang.String.valueOf(r3)
            r2.A0A(r1, r5, r0)
            return
        L_0x0643:
            java.lang.Object r3 = r2.A00
            com.whatsapp.invites.SMSPreviewInviteBottomSheetFragment r3 = (com.whatsapp.invites.SMSPreviewInviteBottomSheetFragment) r3
            java.lang.Object r2 = r2.A01
            android.view.View r2 = (android.view.View) r2
            boolean r0 = r3.A0i
            r1 = 1
            if (r0 != 0) goto L_0x065a
            boolean r0 = r3.A0Z
            if (r0 != 0) goto L_0x065a
            r2.setEnabled(r1)
            r3.A1L()
        L_0x065a:
            X.C18320x8.A1D(r3)
            return
        L_0x065e:
            java.lang.Object r1 = r2.A00
            com.whatsapp.jobqueue.job.RotateSignedPreKeyJob r1 = (com.whatsapp.jobqueue.job.RotateSignedPreKeyJob) r1
            java.lang.Object r0 = r2.A01
            byte[] r0 = (byte[]) r0
            r1.A09(r0)
            return
        L_0x066a:
            java.lang.Object r0 = r2.A00
            com.whatsapp.jobqueue.job.SendE2EMessageJob r0 = (com.whatsapp.jobqueue.job.SendE2EMessageJob) r0
            java.lang.Object r1 = r2.A01
            X.4uZ r1 = (X.C95814uZ) r1
            X.34x r2 = r0.A0r
            if (r2 == 0) goto L_0x067c
            X.1io r1 = r0.A0U
            r0 = 30
            goto L_0x0854
        L_0x067c:
            X.1io r0 = r0.A0U
            r0.A08(r1)
            return
        L_0x0682:
            java.lang.Object r0 = r2.A00
            X.33i r0 = (X.C620633i) r0
            java.lang.Object r3 = r2.A01
            X.5mA r3 = (X.C113895mA) r3
            android.telephony.TelephonyManager r2 = r0.A0N()
            if (r2 != 0) goto L_0x0696
            java.lang.String r0 = "appinit/async tm=null"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x0696:
            java.lang.String r0 = "appinit/async set listener for call state"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0ya r1 = new X.0ya
            r1.<init>(r3)
            r0 = 32
            r2.listen(r1, r0)
            return
        L_0x06a6:
            java.lang.Object r1 = r2.A00
            X.4ug r1 = (X.C95874ug) r1
            java.lang.Object r0 = r2.A01
            X.5hC r0 = (X.C110885hC) r0
            r0.A07()
            r0 = 0
            r1.A02 = r0
            return
        L_0x06b5:
            java.lang.Object r1 = r2.A00
            X.5cU r1 = (X.C108145cU) r1
            java.lang.Object r0 = r2.A01
            com.whatsapp.location.PlaceInfo r0 = (com.whatsapp.location.PlaceInfo) r0
            r1.A0M(r0)
            return
        L_0x06c1:
            java.lang.Object r0 = r2.A00
            X.33o r0 = (X.C621233o) r0
            java.lang.Object r2 = r2.A01
            X.2ov r2 = (X.C54562ov) r2
            X.33n r1 = r0.A0F
            X.6kD r0 = X.C135156kD.A00
            X.2oh r0 = X.C54422oh.A00(r2, r0)
            r1.A0S(r0)
            return
        L_0x06d5:
            java.lang.Object r1 = r2.A00
            X.33o r1 = (X.C621233o) r1
            java.lang.Object r0 = r2.A01
            X.34x r0 = (X.C624134x) r0
            X.1hw r1 = r1.A0H
            X.2z0 r0 = r0.A1J
            X.4uZ r0 = r0.A00
            r1.A0A(r0)
            return
        L_0x06e7:
            java.lang.Object r5 = r2.A00
            X.33o r5 = (X.C621233o) r5
            java.lang.Object r4 = r2.A01
            X.2pX r4 = (X.C54942pX) r4
            X.34h r1 = r5.A0I
            r0 = 0
            X.1EU r6 = r1.A02(r4, r0)
            long r2 = X.C56612sH.A08(r5)
            long r0 = r4.A05
            long r2 = X.C18280x3.A08(r2, r0)
            r0 = 0
            long r2 = java.lang.Math.max(r0, r2)
            X.33n r0 = r5.A0F     // Catch:{ InterruptedException | ExecutionException -> 0x072c }
            boolean r0 = r0.A0X()     // Catch:{ InterruptedException | ExecutionException -> 0x072c }
            if (r0 == 0) goto L_0x0718
            X.2zu r1 = r5.A0K     // Catch:{ InterruptedException | ExecutionException -> 0x072c }
            X.2a1 r0 = r5.A07(r6)     // Catch:{ InterruptedException | ExecutionException -> 0x072c }
            r1.A03(r0, r2)     // Catch:{ InterruptedException | ExecutionException -> 0x072c }
            return
        L_0x0718:
            X.2fm r4 = r5.A0G     // Catch:{ InterruptedException | ExecutionException -> 0x072c }
            r1 = 4
            X.4IJ r0 = new X.4IJ     // Catch:{ InterruptedException | ExecutionException -> 0x072c }
            r0.<init>(r6, r1, r5)     // Catch:{ InterruptedException | ExecutionException -> 0x072c }
            java.lang.Object r1 = X.C48972fm.A01(r4, r0)     // Catch:{ InterruptedException | ExecutionException -> 0x072c }
            X.2a1 r1 = (X.C45442a1) r1     // Catch:{ InterruptedException | ExecutionException -> 0x072c }
            X.2zu r0 = r5.A0K     // Catch:{ InterruptedException | ExecutionException -> 0x072c }
            r0.A03(r1, r2)     // Catch:{ InterruptedException | ExecutionException -> 0x072c }
            return
        L_0x072c:
            r1 = move-exception
            java.lang.String r0 = "LocationSharingManager/encryptAndSendLocation error"
            com.whatsapp.util.Log.e(r0, r1)
            return
        L_0x0733:
            java.lang.Object r3 = r2.A00
            X.33c r3 = (X.C620033c) r3
            java.lang.Object r1 = r2.A01
            X.3QO r1 = (X.AnonymousClass3QO) r1
            r0 = 0
            r3.A0F(r1, r0)
            return
        L_0x0740:
            java.lang.Object r1 = r2.A00
            X.33c r1 = (X.C620033c) r1
            java.lang.Object r0 = r2.A01
            X.3QO r0 = (X.AnonymousClass3QO) r0
            r1.A08(r0)
            return
        L_0x074c:
            java.lang.Object r0 = r2.A00
            X.33c r0 = (X.C620033c) r0
            java.lang.Object r1 = r2.A01
            X.5LM r1 = (X.AnonymousClass5LM) r1
            X.2qx r0 = r0.A0A
            r0.A04(r1)
            return
        L_0x075a:
            java.lang.Object r5 = r2.A00
            X.2re r5 = (X.C56232re) r5
            java.lang.Object r4 = r2.A01
            X.30M r4 = (X.AnonymousClass30M) r4
            X.32i r3 = r5.A0E
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r1 = 1
            X.4Ja r0 = new X.4Ja
            r0.<init>(r3, r1)
            X.C618132i.A00(r4, r0, r2)
            X.1io r2 = r5.A07
            java.util.concurrent.CopyOnWriteArrayList r1 = r4.A02
            r0 = -1
            goto L_0x0787
        L_0x0775:
            java.lang.Object r1 = r2.A00
            X.2re r1 = (X.C56232re) r1
            java.lang.Object r0 = r2.A01
            X.30M r0 = (X.AnonymousClass30M) r0
            X.1io r2 = r1.A07
            java.util.concurrent.CopyOnWriteArrayList r0 = r0.A02
            java.util.List r1 = java.util.Collections.unmodifiableList(r0)
            r0 = 12
        L_0x0787:
            r2.A0E(r1, r0)
            return
        L_0x078b:
            java.lang.Object r5 = r2.A00
            X.2qx r5 = (X.C55812qx) r5
            java.lang.Object r10 = r2.A01
            X.5LM r10 = (X.AnonymousClass5LM) r10
            monitor-enter(r5)
            X.C626936e.A00()     // Catch:{ all -> 0x0800 }
            X.0Qw r2 = r5.A00     // Catch:{ all -> 0x0800 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0800 }
            java.lang.String r9 = r10.A0D     // Catch:{ all -> 0x0800 }
            r1.append(r9)     // Catch:{ all -> 0x0800 }
            int r0 = r10.A0B     // Catch:{ all -> 0x0800 }
            java.lang.String r0 = X.AnonymousClass000.A0h(r1, r0)     // Catch:{ all -> 0x0800 }
            r2.A08(r0, r10)     // Catch:{ all -> 0x0800 }
            X.2sH r8 = r5.A01     // Catch:{ all -> 0x0800 }
            long r3 = r8.A0H()     // Catch:{ all -> 0x0800 }
            X.1RC r0 = r5.A02     // Catch:{ SQLiteDatabaseCorruptException -> 0x07f9, Error | RuntimeException -> 0x07f4 }
            X.4Fq r7 = r0.A0C()     // Catch:{ SQLiteDatabaseCorruptException -> 0x07f9, Error | RuntimeException -> 0x07f4 }
            r0 = r7
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x07ea }
            X.2sg r6 = r0.A03     // Catch:{ all -> 0x07ea }
            java.lang.String r2 = "media_job"
            android.content.ContentValues r1 = r5.A00(r10)     // Catch:{ all -> 0x07ea }
            java.lang.String r0 = "MediaJobDataStore/insert"
            r6.A08(r2, r0, r1)     // Catch:{ all -> 0x07ea }
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x07ea }
            java.lang.String r0 = "mediajobdb/insert/"
            r2.append(r0)     // Catch:{ all -> 0x07ea }
            r2.append(r9)     // Catch:{ all -> 0x07ea }
            java.lang.String r0 = "/time="
            r2.append(r0)     // Catch:{ all -> 0x07ea }
            long r0 = X.C56612sH.A03(r8, r3)     // Catch:{ all -> 0x07ea }
            r2.append(r0)     // Catch:{ all -> 0x07ea }
            java.lang.String r0 = "ms"
            X.C18260x0.A1J(r2, r0)     // Catch:{ all -> 0x07ea }
            r7.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x07f9, Error | RuntimeException -> 0x07f4 }
            monitor-exit(r5)
            return
        L_0x07ea:
            r1 = move-exception
            r7.close()     // Catch:{ all -> 0x07ef }
            goto L_0x07f3
        L_0x07ef:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x07f9, Error | RuntimeException -> 0x07f4 }
        L_0x07f3:
            throw r1     // Catch:{ SQLiteDatabaseCorruptException -> 0x07f9, Error | RuntimeException -> 0x07f4 }
        L_0x07f4:
            r1 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r1)     // Catch:{ all -> 0x0800 }
            goto L_0x07ff
        L_0x07f9:
            r1 = move-exception
            java.lang.String r0 = "mediajobdb/insert"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0800 }
        L_0x07ff:
            throw r1     // Catch:{ all -> 0x0800 }
        L_0x0800:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x0803:
            java.lang.Object r0 = r2.A00
            X.2d5 r0 = (X.C47332d5) r0
            java.lang.Object r2 = r2.A01
            X.34x r2 = (X.C624134x) r2
            X.1io r1 = r0.A05
            goto L_0x0852
        L_0x080e:
            java.lang.Object r0 = r2.A00
            X.1I7 r0 = (X.AnonymousClass1I7) r0
            java.lang.Object r3 = r2.A01
            X.7US r3 = (X.AnonymousClass7US) r3
            X.2sf r2 = r0.A0h
            X.2pd r1 = r0.A0V
            r0 = 1
            int r0 = r1.A00(r3, r0)
            r2.A02 = r0
            return
        L_0x0822:
            java.lang.Object r0 = r2.A00
            X.33d r0 = (X.C620133d) r0
            java.lang.Object r2 = r2.A01
            X.34x r2 = (X.C624134x) r2
            X.1io r1 = r0.A0H
            r0 = 35
            goto L_0x0854
        L_0x082f:
            java.lang.Object r3 = r2.A00
            X.1I7 r3 = (X.AnonymousClass1I7) r3
            java.lang.Object r2 = r2.A01
            X.1I8 r2 = (X.AnonymousClass1I8) r2
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "mediaDownloadManager/startDownloadImmediately cancel existing express path download "
            X.C18260x0.A1R(r1, r0, r3)
            r0 = 1
            r3.Ayd(r0)
            r2.run()
            return
        L_0x0848:
            java.lang.Object r0 = r2.A00
            X.2iO r0 = (X.C50572iO) r0
            java.lang.Object r2 = r2.A01
            X.34x r2 = (X.C624134x) r2
            X.1io r1 = r0.A06
        L_0x0852:
            r0 = 12
        L_0x0854:
            r1.A0C(r2, r0)
            return
        L_0x0858:
            java.lang.Object r3 = r2.A00
            X.5Qk r3 = (X.C104295Qk) r3
            java.lang.Object r1 = r2.A01
            X.1mV r1 = (X.C30471mV) r1
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException
            r0.<init>()
            r3.A01(r1, r0)
            return
        L_0x0869:
            java.lang.Object r1 = r2.A00
            X.1ek r1 = (X.C27831ek) r1
            java.lang.Object r0 = r2.A01
            X.4Fe r0 = (X.C85164Fe) r0
            X.3QV r0 = (X.AnonymousClass3QV) r0
            X.2rq r1 = r1.A00
            X.39M r0 = r0.A00
            java.lang.String r0 = r0.A0D
            X.C626936e.A06(r0)
            r1.A06(r0)
            return
        L_0x0880:
            java.lang.Object r3 = r2.A00
            X.1ek r3 = (X.C27831ek) r3
            java.lang.Object r0 = r2.A01
            X.4Fe r0 = (X.C85164Fe) r0
            X.3QV r0 = (X.AnonymousClass3QV) r0
            X.39M r2 = r0.A00
            java.lang.String r0 = r2.A0D
            X.C626936e.A06(r0)
            java.lang.String r0 = r2.A09
            if (r0 == 0) goto L_0x08a0
            int r1 = r2.A01
            r0 = 1
            if (r1 == r0) goto L_0x08a0
            X.2sn r0 = r3.A01
            r0.A03(r2)
            return
        L_0x08a0:
            X.2rq r1 = r3.A00
            java.lang.String r0 = r2.A0D
            r1.A01(r0)
            return
        L_0x08a8:
            java.lang.Object r1 = r2.A00
            android.view.View r1 = (android.view.View) r1
            java.lang.Object r0 = r2.A01
            android.view.ViewGroup$LayoutParams r0 = (android.view.ViewGroup.LayoutParams) r0
            r1.setLayoutParams(r0)
            return
        L_0x08b4:
            java.lang.Object r0 = r2.A00
            X.7XM r0 = (X.AnonymousClass7XM) r0
            java.lang.Object r1 = r2.A01
            android.view.ViewGroup$LayoutParams r1 = (android.view.ViewGroup.LayoutParams) r1
            android.view.View r0 = r0.A03
            r0.setLayoutParams(r1)
            return
        L_0x08c2:
            java.lang.Object r3 = r2.A00
            X.4vO r3 = (X.AnonymousClass4vO) r3
            java.lang.Object r2 = r2.A01
            X.5ng r2 = (X.C114835ng) r2
            com.whatsapp.mediacomposer.doodle.textentry.DoodleEditText r0 = r3.A01
            android.text.Editable r1 = r0.getEditableText()
            com.whatsapp.mediacomposer.doodle.textentry.DoodleEditText r0 = r3.A01
            r0.getWidth()
            com.whatsapp.mediacomposer.doodle.textentry.DoodleEditText r0 = r3.A01
            r0.getPaint()
            r2.A01(r1)
            return
        L_0x08de:
            java.lang.Object r1 = r2.A00
            com.whatsapp.mediaview.MediaViewFragment r1 = (com.whatsapp.mediaview.MediaViewFragment) r1
            java.lang.Object r0 = r2.A01
            X.1mV r0 = (X.C30471mV) r0
            r1.A1p(r0)
            return
        L_0x08ea:
            java.lang.Object r3 = r2.A00
            com.whatsapp.mediaview.MediaViewFragment r3 = (com.whatsapp.mediaview.MediaViewFragment) r3
            java.lang.Object r2 = r2.A01
            X.34x r2 = (X.C624134x) r2
            X.2qz r1 = r3.A1d
            X.2z0 r0 = r2.A1J
            X.34x r0 = r1.A05(r0)
            if (r0 == 0) goto L_0x0900
            r3.A1n(r0, r2)
            return
        L_0x0900:
            java.lang.String r0 = "MediaViewFragment/onOptionsItemSelected/no-main-message-to-view-in-chat"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x0906:
            java.lang.Object r3 = r2.A00
            com.whatsapp.mediaview.MediaViewFragment r3 = (com.whatsapp.mediaview.MediaViewFragment) r3
            java.lang.Object r5 = r2.A01
            X.2Vu r0 = r3.A0e
            r4 = 1
            r0.A00(r4, r4)
            X.2Vu r0 = r3.A0e
            X.316 r0 = r0.A00
            java.lang.String r2 = "update_star_message_store"
            r0.A0A(r2)
            X.2qe r1 = r3.A0v
            java.util.Set r0 = java.util.Collections.singleton(r5)
            r1.A01(r0)
            X.2Vu r0 = r3.A0e
            X.316 r0 = r0.A00
            r0.A09(r2)
            X.2Vu r0 = r3.A0e
            X.316 r0 = r0.A00
            java.lang.String r2 = "sync"
            r0.A0A(r2)
            X.3Gp r1 = r3.A0T
            java.util.Set r0 = java.util.Collections.singleton(r5)
            java.util.Set r1 = r1.A0C(r0, r4)
            X.3Gp r0 = r3.A0T
            r0.A0O(r1)
            X.2Vu r0 = r3.A0e
            X.316 r0 = r0.A00
            r0.A09(r2)
            X.3Wi r2 = r3.A0L
            r0 = 13
            X.3Zn r1 = new X.3Zn
            r1.<init>(r3, r0)
            goto L_0x0989
        L_0x0956:
            java.lang.Object r4 = r2.A00
            com.whatsapp.mediaview.MediaViewFragment r4 = (com.whatsapp.mediaview.MediaViewFragment) r4
            java.lang.Object r5 = r2.A01
            X.3Gp r1 = r4.A0T
            java.util.Set r0 = java.util.Collections.singleton(r5)
            r3 = 0
            java.util.Set r2 = r1.A0C(r0, r3)
            X.2qe r1 = r4.A0v
            java.util.Set r0 = java.util.Collections.singleton(r5)
            boolean r0 = r1.A04(r0)
            if (r0 != 0) goto L_0x098d
            X.3Wi r1 = r4.A0L
            r0 = 2131894640(0x7f122170, float:1.942409E38)
            r1.A0I(r0, r3)
            X.3Gp r0 = r4.A0T
            r0.A0N(r2)
        L_0x0980:
            X.3Wi r2 = r4.A0L
            r0 = 12
            X.3Zn r1 = new X.3Zn
            r1.<init>(r4, r0)
        L_0x0989:
            r2.A0S(r1)
            return
        L_0x098d:
            X.3Gp r0 = r4.A0T
            r0.A0O(r2)
            goto L_0x0980
        L_0x0993:
            java.lang.Object r1 = r2.A00
            com.whatsapp.mediaview.MediaViewFragment r1 = (com.whatsapp.mediaview.MediaViewFragment) r1
            java.lang.Object r4 = r2.A01
            X.34x r4 = (X.C624134x) r4
            byte r0 = r4.A1I
            r3 = 2
            r2 = 3
            if (r0 == r2) goto L_0x09a2
            r2 = 2
        L_0x09a2:
            X.2pR r1 = r1.A19
            boolean r0 = X.AnonymousClass2z0.A0D(r4)
            if (r0 != 0) goto L_0x09ab
            r3 = 1
        L_0x09ab:
            r1.A02(r2, r3)
            return
        L_0x09af:
            java.lang.Object r1 = r2.A00
            X.2sT r1 = (X.C56732sT) r1
            java.lang.Object r3 = r2.A01
            X.4EW r3 = (X.AnonymousClass4EW) r3
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "ClientPingManager/on-connected, can use short: "
            r2.append(r0)
            boolean r0 = r1.A04
            X.C18260x0.A1V(r2, r0)
            android.os.Handler r5 = r1.A07
            X.C626936e.A02(r5)
            boolean r0 = r1.A05
            if (r0 == 0) goto L_0x09e0
            X.4EW r0 = r1.A03
            if (r3 != r0) goto L_0x09d8
            java.lang.String r0 = "ClientPingManager/on-connected; already connected, ignoring."
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return
        L_0x09d8:
            java.lang.String r0 = "ClientPingManager/on-connected; new channel, forcing disconnect."
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r1.A03()
        L_0x09e0:
            r1.A03 = r3
            r7 = 0
            r1.A00 = r7
            r2 = 0
            r1.A0G = r2
            r1.A06 = r7
            r0 = 1
            r1.A05 = r0
            boolean r0 = r1.A0A()
            if (r0 == 0) goto L_0x09f8
            r1.A06()
            return
        L_0x09f8:
            java.lang.String r0 = "ClientPingManager/periodic/register-receiver"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            X.C626936e.A02(r5)
            X.1Qd r0 = r1.A01
            if (r0 == 0) goto L_0x0a39
            java.lang.String r0 = "ClientPingManager/periodic/register-receiver; duplicate receiver registration."
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x0a09:
            r1.A06()
            java.lang.String r0 = "ClientPingManager/timeout/register-receiver"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            X.C626936e.A02(r5)
            X.1Qe r0 = r1.A02
            if (r0 == 0) goto L_0x0a21
            java.lang.String r0 = "ClientPingManager/timeout/register-receiver; duplicate receiver registration."
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x0a1d:
            r1.A02()
            return
        L_0x0a21:
            X.1Qe r2 = new X.1Qe
            r2.<init>(r1)
            r1.A02 = r2
            X.2oU r0 = r1.A0D
            android.content.Context r3 = r0.A00
            java.lang.String r0 = "com.whatsapp.alarm.CLIENT_PING_TIMEOUT"
            android.content.IntentFilter r4 = new android.content.IntentFilter
            r4.<init>(r0)
            java.lang.String r6 = X.C58152un.A0C
            X.C154317cy.A00(r2, r3, r4, r5, r6, r7)
            goto L_0x0a1d
        L_0x0a39:
            X.1Qd r2 = new X.1Qd
            r2.<init>(r1)
            r1.A01 = r2
            X.2oU r0 = r1.A0D
            android.content.Context r3 = r0.A00
            java.lang.String r0 = "com.whatsapp.alarm.CLIENT_PING_PERIODIC"
            android.content.IntentFilter r4 = new android.content.IntentFilter
            r4.<init>(r0)
            java.lang.String r6 = X.C58152un.A0C
            X.C154317cy.A00(r2, r3, r4, r5, r6, r7)
            goto L_0x0a09
        L_0x0a51:
            java.lang.String r0 = "app-init/async/create-chat-sort-id-index"
            X.33M r3 = X.AnonymousClass33M.A01(r0)     // Catch:{ all -> 0x0a71 }
            r0 = r4
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0a71 }
            X.2sg r2 = r0.A03     // Catch:{ all -> 0x0a71 }
            java.lang.String r1 = "CREATE INDEX IF NOT EXISTS message_chat_sort_id_index ON message (chat_row_id, sort_id)"
            java.lang.String r0 = "CREATE_MESSAGE_JID_SORT_ID_INDEX"
            r2.A0H(r1, r0)     // Catch:{ all -> 0x0a71 }
            java.lang.String r1 = "CREATE INDEX IF NOT EXISTS message_starred_sort_id_index ON message (starred, sort_id)"
            java.lang.String r0 = "CREATE_MESSAGE_STARRED_SORT_ID_INDEX"
            r2.A0H(r1, r0)     // Catch:{ all -> 0x0a71 }
            r3.A07()     // Catch:{ all -> 0x0a71 }
            r4.close()
            return
        L_0x0a71:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x0a76 }
            throw r1
        L_0x0a76:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x0a7b:
            X.1Zo r4 = new X.1Zo
            r4.<init>()
            r0 = r107
            long r0 = r0.A07
            java.lang.Double r0 = X.C18330xA.A07(r0)
            r4.A04 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r105)
            r4.A05 = r0
            boolean r0 = X.AnonymousClass36O.A06(r5)
            if (r0 == 0) goto L_0x0ae4
            if (r2 == 0) goto L_0x0ae4
            boolean r0 = r2.exists()
            if (r0 == 0) goto L_0x0ae4
            X.2qp r1 = r3.A0U
            r0 = r107
            java.lang.String r0 = r0.A0J
            X.330 r5 = r1.A02(r2, r0)
            if (r5 == 0) goto L_0x0ace
            boolean r0 = r5.A09
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r4.A02 = r0
            boolean r0 = r5.A08
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r4.A01 = r0
            X.1VX r2 = r3.A0F
            r1 = 5325(0x14cd, float:7.462E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            if (r0 == 0) goto L_0x0ace
            boolean r0 = r5.A06
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r4.A00 = r0
        L_0x0ace:
            X.1VX r2 = r3.A0F
            r1 = 6787(0x1a83, float:9.51E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            if (r0 == 0) goto L_0x0ae4
            r0 = r107
            boolean r0 = r0.A0T
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r4.A03 = r0
        L_0x0ae4:
            X.4FV r0 = r3.A0G
            r0.BhD(r4)
            return
        L_0x0aea:
            r1 = move-exception
            monitor-exit(r35)
            throw r1
        L_0x0aed:
            r1 = move-exception
            monitor-exit(r36)
            throw r1
        L_0x0af0:
            java.lang.String r0 = "whatsAppLocale"
            java.lang.RuntimeException r1 = X.C18270x1.A0S(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71353by.run():void");
    }

    public C71353by(C620033c r2, AnonymousClass3QO r3) {
        this.A02 = 21;
        this.A00 = r2;
        this.A01 = r3;
    }
}
