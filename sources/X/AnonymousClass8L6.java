package X;

import java.io.Serializable;

/* renamed from: X.8L6  reason: invalid class name */
public abstract class AnonymousClass8L6 implements Serializable {
    public void A01(AnonymousClass8L6 r9, AnonymousClass8L6 r10) {
        boolean z;
        Boolean bool;
        if (this instanceof C126016Kj) {
            C126016Kj r4 = (C126016Kj) this;
            C126016Kj r92 = (C126016Kj) r9;
            C126016Kj r102 = (C126016Kj) r10;
            if (r102 == null) {
                r102 = new C126016Kj();
            }
            if (r92 == null) {
                r102.uptimeMs = r4.uptimeMs;
                r102.realtimeMs = r4.realtimeMs;
                return;
            }
            r102.uptimeMs = r4.uptimeMs - r92.uptimeMs;
            r102.realtimeMs = r4.realtimeMs - r92.realtimeMs;
        } else if (this instanceof C126026Kk) {
            C126026Kk r42 = (C126026Kk) this;
            C126026Kk r93 = (C126026Kk) r9;
            C126026Kk r103 = (C126026Kk) r10;
            if (r103 == null) {
                r103 = new C126026Kk();
            }
            if (r93 == null) {
                r103.mobileBytesRx = r42.mobileBytesRx;
                r103.mobileBytesTx = r42.mobileBytesTx;
                r103.wifiBytesRx = r42.wifiBytesRx;
                r103.wifiBytesTx = r42.wifiBytesTx;
                return;
            }
            r103.mobileBytesTx = r42.mobileBytesTx - r93.mobileBytesTx;
            r103.mobileBytesRx = r42.mobileBytesRx - r93.mobileBytesRx;
            r103.wifiBytesTx = r42.wifiBytesTx - r93.wifiBytesTx;
            r103.wifiBytesRx = r42.wifiBytesRx - r93.wifiBytesRx;
        } else if (this instanceof C126046Km) {
            C126046Km r43 = (C126046Km) this;
            C126046Km r94 = (C126046Km) r9;
            C126046Km r104 = (C126046Km) r10;
            if (r104 == null) {
                r104 = new C126046Km();
            }
            if (r94 == null) {
                r104.A02(r43);
                return;
            }
            r104.rcharBytes = r43.rcharBytes - r94.rcharBytes;
            r104.wcharBytes = r43.wcharBytes - r94.wcharBytes;
            r104.syscrCount = r43.syscrCount - r94.syscrCount;
            r104.syscwCount = r43.syscwCount - r94.syscwCount;
            r104.readBytes = r43.readBytes - r94.readBytes;
            r104.writeBytes = r43.writeBytes - r94.writeBytes;
            r104.cancelledWriteBytes = r43.cancelledWriteBytes - r94.cancelledWriteBytes;
            r104.majorFaults = r43.majorFaults - r94.majorFaults;
            r104.blkIoTicks = r43.blkIoTicks - r94.blkIoTicks;
        } else if (this instanceof C126036Kl) {
            C126036Kl r44 = (C126036Kl) this;
            C126036Kl r95 = (C126036Kl) r9;
            C126036Kl r105 = (C126036Kl) r10;
            if (r105 == null) {
                r105 = new C126036Kl();
            }
            if (r95 == null) {
                r105.A02(r44);
                return;
            }
            r105.systemTimeS = r44.systemTimeS - r95.systemTimeS;
            r105.userTimeS = r44.userTimeS - r95.userTimeS;
            r105.childSystemTimeS = r44.childSystemTimeS - r95.childSystemTimeS;
            r105.childUserTimeS = r44.childUserTimeS - r95.childUserTimeS;
        } else {
            C126056Kn r7 = (C126056Kn) this;
            C126056Kn r96 = (C126056Kn) r9;
            C126056Kn r106 = (C126056Kn) r10;
            if (r106 == null) {
                throw AnonymousClass001.A0c("CompositeMetrics doesn't support nullable results");
            } else if (r96 == null) {
                r106.A03(r7);
            } else {
                int size = r7.mMetricsMap.size();
                for (int i = 0; i < size; i++) {
                    Class cls = (Class) r7.mMetricsMap.A02[i << 1];
                    if (!r7.A04(cls) || !r96.A04(cls)) {
                        z = false;
                    } else {
                        z = true;
                        AnonymousClass8L6 A02 = r106.A02(cls);
                        if (A02 != null) {
                            r7.A02(cls).A01(r96.A02(cls), A02);
                        }
                    }
                    C06290Wz r1 = r106.mMetricsValid;
                    if (z) {
                        bool = Boolean.TRUE;
                    } else {
                        bool = Boolean.FALSE;
                    }
                    r1.put(cls, bool);
                }
            }
        }
    }
}
