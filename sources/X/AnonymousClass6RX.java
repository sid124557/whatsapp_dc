package X;

import android.content.Context;
import android.location.Location;
import android.os.Looper;
import android.os.Parcel;

/* renamed from: X.6RX  reason: invalid class name */
public final class AnonymousClass6RX extends C127196Ra {
    public final AnonymousClass7Ng A00;
    public final C178598hn A01;
    public final String A02 = "locationServices";

    public AnonymousClass6RX(Context context, Looper looper, C187778xn r12, C187788xo r13, AnonymousClass7P4 r14) {
        super(context, looper, r12, r13, r14, 23);
        C169668Ae r1 = new C169668Ae(this);
        this.A01 = r1;
        this.A00 = new AnonymousClass7Ng(context, r1);
    }

    public final Location A08(String str) {
        C127806Tj[] r1;
        Parcel A002;
        AnonymousClass6TW r0 = this.A0Q;
        if (r0 == null) {
            r1 = null;
        } else {
            r1 = r0.A03;
        }
        boolean A003 = AnonymousClass72L.A00(AnonymousClass79R.A02, r1);
        AnonymousClass6RX r02 = ((C169668Ae) this.A00.A01).A00;
        r02.A04();
        if (A003) {
            C163157tM r2 = (C163157tM) ((C187248wq) r02.A02());
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken(r2.A01);
            obtain.writeString(str);
            A002 = r2.A00(80, obtain);
        } else {
            C163157tM r3 = (C163157tM) ((C187248wq) r02.A02());
            Parcel obtain2 = Parcel.obtain();
            obtain2.writeInterfaceToken(r3.A01);
            A002 = r3.A00(7, obtain2);
        }
        Location location = (Location) AnonymousClass6C7.A0Q(A002, Location.CREATOR);
        A002.recycle();
        return location;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final void B1l() {
        /*
            r12 = this;
            X.7Ng r3 = r12.A00
            monitor-enter(r3)
            boolean r0 = r12.isConnected()     // Catch:{ all -> 0x009a }
            if (r0 == 0) goto L_0x0095
            java.util.Map r2 = r3.A02     // Catch:{ Exception -> 0x008d }
            monitor-enter(r2)     // Catch:{ Exception -> 0x008d }
            java.util.Iterator r1 = X.AnonymousClass001.A0v(r2)     // Catch:{ all -> 0x008a }
        L_0x0010:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x008a }
            r6 = 0
            if (r0 == 0) goto L_0x0038
            java.lang.Object r7 = r1.next()     // Catch:{ all -> 0x008a }
            X.6Ws r7 = (X.C128596Ws) r7     // Catch:{ all -> 0x008a }
            if (r7 == 0) goto L_0x0010
            X.8hn r0 = r3.A01     // Catch:{ all -> 0x008a }
            X.8Ae r0 = (X.C169668Ae) r0     // Catch:{ all -> 0x008a }
            X.6RX r0 = r0.A00     // Catch:{ all -> 0x008a }
            android.os.IInterface r0 = r0.A02()     // Catch:{ all -> 0x008a }
            X.8wq r0 = (X.C187248wq) r0     // Catch:{ all -> 0x008a }
            r11 = 2
            X.6SR r5 = new X.6SR     // Catch:{ all -> 0x008a }
            r9 = r6
            r10 = r6
            r8 = r6
            r5.<init>(r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x008a }
            r0.BuH(r5)     // Catch:{ all -> 0x008a }
            goto L_0x0010
        L_0x0038:
            r2.clear()     // Catch:{ all -> 0x008a }
            monitor-exit(r2)     // Catch:{ all -> 0x008a }
            java.util.Map r2 = r3.A04     // Catch:{ Exception -> 0x008d }
            monitor-enter(r2)     // Catch:{ Exception -> 0x008d }
            java.util.Iterator r1 = X.AnonymousClass001.A0v(r2)     // Catch:{ all -> 0x0087 }
        L_0x0043:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0087 }
            if (r0 == 0) goto L_0x006a
            java.lang.Object r8 = r1.next()     // Catch:{ all -> 0x0087 }
            X.6Wr r8 = (X.C128586Wr) r8     // Catch:{ all -> 0x0087 }
            if (r8 == 0) goto L_0x0043
            X.8hn r0 = r3.A01     // Catch:{ all -> 0x0087 }
            X.8Ae r0 = (X.C169668Ae) r0     // Catch:{ all -> 0x0087 }
            X.6RX r0 = r0.A00     // Catch:{ all -> 0x0087 }
            android.os.IInterface r0 = r0.A02()     // Catch:{ all -> 0x0087 }
            X.8wq r0 = (X.C187248wq) r0     // Catch:{ all -> 0x0087 }
            r11 = 2
            X.6SR r5 = new X.6SR     // Catch:{ all -> 0x0087 }
            r9 = r6
            r10 = r6
            r7 = r6
            r5.<init>(r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x0087 }
            r0.BuH(r5)     // Catch:{ all -> 0x0087 }
            goto L_0x0043
        L_0x006a:
            r2.clear()     // Catch:{ all -> 0x0087 }
            monitor-exit(r2)     // Catch:{ all -> 0x0087 }
            java.util.Map r2 = r3.A03     // Catch:{ Exception -> 0x008d }
            monitor-enter(r2)     // Catch:{ Exception -> 0x008d }
            java.util.Iterator r1 = X.AnonymousClass001.A0v(r2)     // Catch:{ all -> 0x0084 }
        L_0x0075:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0084 }
            if (r0 == 0) goto L_0x007f
            r1.next()     // Catch:{ all -> 0x0084 }
            goto L_0x0075
        L_0x007f:
            r2.clear()     // Catch:{ all -> 0x0084 }
            monitor-exit(r2)     // Catch:{ all -> 0x0084 }
            goto L_0x0095
        L_0x0084:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0084 }
            goto L_0x008c
        L_0x0087:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0087 }
            goto L_0x008c
        L_0x008a:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x008a }
        L_0x008c:
            throw r0     // Catch:{ Exception -> 0x008d }
        L_0x008d:
            r2 = move-exception
            java.lang.String r1 = "LocationClientImpl"
            java.lang.String r0 = "Client disconnected before listeners could be cleaned up"
            android.util.Log.e(r1, r0, r2)     // Catch:{ all -> 0x009a }
        L_0x0095:
            super.B1l()     // Catch:{ all -> 0x009a }
            monitor-exit(r3)     // Catch:{ all -> 0x009a }
            return
        L_0x009a:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x009a }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6RX.B1l():void");
    }

    public final int B9m() {
        return 11717000;
    }
}
