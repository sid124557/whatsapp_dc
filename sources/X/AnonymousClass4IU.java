package X;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: X.4IU  reason: invalid class name */
public class AnonymousClass4IU implements Comparator {
    public final int A00;

    public AnonymousClass4IU(int i) {
        this.A00 = i;
    }

    public static void A00(List list, int i) {
        Collections.sort(list, new AnonymousClass4IU(i));
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0368  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ int compare(java.lang.Object r10, java.lang.Object r11) {
        /*
            r9 = this;
            int r0 = r9.A00
            switch(r0) {
                case 0: goto L_0x03b2;
                case 1: goto L_0x03a5;
                case 2: goto L_0x0383;
                case 3: goto L_0x00ac;
                case 4: goto L_0x0341;
                case 5: goto L_0x032c;
                case 6: goto L_0x031f;
                case 7: goto L_0x030f;
                case 8: goto L_0x0097;
                case 9: goto L_0x02f3;
                case 10: goto L_0x006c;
                case 11: goto L_0x02de;
                case 12: goto L_0x02d3;
                case 13: goto L_0x0042;
                case 14: goto L_0x02c6;
                case 15: goto L_0x02bd;
                case 16: goto L_0x02a8;
                case 17: goto L_0x0293;
                case 18: goto L_0x0282;
                case 19: goto L_0x0005;
                case 20: goto L_0x00c3;
                case 21: goto L_0x026d;
                case 22: goto L_0x0258;
                case 23: goto L_0x022a;
                case 24: goto L_0x0215;
                case 25: goto L_0x01fc;
                case 26: goto L_0x01ef;
                case 27: goto L_0x01e6;
                case 28: goto L_0x01c9;
                case 29: goto L_0x01b4;
                case 30: goto L_0x01a7;
                case 31: goto L_0x0192;
                case 32: goto L_0x0005;
                case 33: goto L_0x0185;
                case 34: goto L_0x0016;
                case 35: goto L_0x0177;
                case 36: goto L_0x016a;
                case 37: goto L_0x014d;
                case 38: goto L_0x0132;
                case 39: goto L_0x0115;
                case 40: goto L_0x00fc;
                case 41: goto L_0x00f2;
                case 42: goto L_0x00dd;
                default: goto L_0x0005;
            }
        L_0x0005:
            X.3Z6 r10 = (X.AnonymousClass3Z6) r10
            java.lang.Object r1 = r10.first
            java.lang.Integer r1 = (java.lang.Integer) r1
            X.3Z6 r11 = (X.AnonymousClass3Z6) r11
            java.lang.Object r0 = r11.first
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r4 = X.AnonymousClass2A6.A00(r1, r0)
        L_0x0015:
            return r4
        L_0x0016:
            X.36K r10 = (X.AnonymousClass36K) r10
            X.36K r11 = (X.AnonymousClass36K) r11
            java.lang.String r3 = "jid"
            r4 = 0
            java.lang.Class<com.whatsapp.jid.DeviceJid> r2 = com.whatsapp.jid.DeviceJid.class
            com.whatsapp.jid.Jid r0 = r10.A0h(r2, r3)     // Catch:{ 24Y -> 0x0015 }
            com.whatsapp.jid.DeviceJid r0 = (com.whatsapp.jid.DeviceJid) r0     // Catch:{ 24Y -> 0x0015 }
            int r0 = r0.getDevice()     // Catch:{ 24Y -> 0x0015 }
            boolean r1 = X.AnonymousClass000.A1T(r0)     // Catch:{ 24Y -> 0x0015 }
            com.whatsapp.jid.Jid r0 = r11.A0h(r2, r3)     // Catch:{ 24Y -> 0x0015 }
            com.whatsapp.jid.DeviceJid r0 = (com.whatsapp.jid.DeviceJid) r0     // Catch:{ 24Y -> 0x0015 }
            int r0 = r0.getDevice()     // Catch:{ 24Y -> 0x0015 }
            boolean r0 = X.AnonymousClass000.A1T(r0)     // Catch:{ 24Y -> 0x0015 }
            if (r1 == r0) goto L_0x0015
            r4 = 1
            if (r1 == 0) goto L_0x0015
            goto L_0x00cc
        L_0x0042:
            X.33G r10 = (X.AnonymousClass33G) r10
            X.33G r11 = (X.AnonymousClass33G) r11
            long r1 = r10.A01
            r5 = 0
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x0054
            long r3 = r11.A01
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x005e
        L_0x0054:
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x0067
            long r3 = r11.A01
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x0067
        L_0x005e:
            long r2 = r11.A00
            long r0 = r10.A00
            int r4 = java.lang.Long.compare(r2, r0)
            return r4
        L_0x0067:
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x00cc
            goto L_0x00db
        L_0x006c:
            java.util.Map$Entry r10 = (java.util.Map.Entry) r10
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            java.lang.Object r8 = r11.getValue()
            X.3ZJ r8 = (X.AnonymousClass3ZJ) r8
            java.lang.Object r7 = r10.getValue()
            X.3ZJ r7 = (X.AnonymousClass3ZJ) r7
            r4 = 0
            if (r7 == r8) goto L_0x0015
            int r1 = r8.A00
            int r0 = r7.A00
            int r1 = r1 - r0
            long r2 = (long) r1
            r5 = 0
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x0090
            long r2 = r8.A01
            long r0 = r7.A01
            long r2 = r2 - r0
        L_0x0090:
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 < 0) goto L_0x00cc
            if (r0 <= 0) goto L_0x0015
            goto L_0x00db
        L_0x0097:
            X.2jt r10 = (X.C51482jt) r10
            X.2jt r11 = (X.C51482jt) r11
            long r3 = r10.A00
            long r1 = r11.A00
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x00d9
            X.4uZ r1 = r10.A01
            X.4uZ r0 = r11.A01
            int r4 = r1.compareTo((com.whatsapp.jid.Jid) r0)
            return r4
        L_0x00ac:
            X.34x r10 = (X.C624134x) r10
            X.34x r11 = (X.C624134x) r11
            long r3 = r11.A1M
            long r1 = r10.A1M
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x00cc
            if (r0 != 0) goto L_0x00db
            byte r1 = r11.A1I
            byte r0 = r10.A1I
            int r4 = X.C162457s7.A00(r1, r0)
            return r4
        L_0x00c3:
            X.2mC r10 = (X.C52882mC) r10
            X.2mC r11 = (X.C52882mC) r11
            if (r10 != 0) goto L_0x00ce
            r4 = 0
            if (r11 == 0) goto L_0x0015
        L_0x00cc:
            r4 = -1
            return r4
        L_0x00ce:
            if (r11 == 0) goto L_0x00db
            com.whatsapp.jid.GroupJid r1 = r10.A02
            com.whatsapp.jid.GroupJid r0 = r11.A02
            int r4 = r1.compareTo((com.whatsapp.jid.Jid) r0)
            return r4
        L_0x00d9:
            if (r0 >= 0) goto L_0x00cc
        L_0x00db:
            r4 = 1
            return r4
        L_0x00dd:
            X.3YL r10 = (X.AnonymousClass3YL) r10
            long r0 = r10.A04
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            X.3YL r11 = (X.AnonymousClass3YL) r11
            long r0 = r11.A04
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            int r4 = X.AnonymousClass2A6.A00(r2, r0)
            return r4
        L_0x00f2:
            X.22O r10 = (X.AnonymousClass22O) r10
            X.22O r11 = (X.AnonymousClass22O) r11
            int r4 = r10.version
            int r0 = r11.version
            int r4 = r4 - r0
            return r4
        L_0x00fc:
            X.1rT r11 = (X.C32701rT) r11
            X.2iT r0 = r11.A00
            int r0 = r0.A00
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            X.1rT r10 = (X.C32701rT) r10
            X.2iT r0 = r10.A00
            int r0 = r0.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r4 = X.AnonymousClass2A6.A00(r1, r0)
            return r4
        L_0x0115:
            X.2ed r11 = (X.C48272ed) r11
            X.2iT r0 = r11.A00()
            int r0 = r0.A00
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            X.2ed r10 = (X.C48272ed) r10
            X.2iT r0 = r10.A00()
            int r0 = r0.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r4 = X.AnonymousClass2A6.A00(r1, r0)
            return r4
        L_0x0132:
            java.io.File r10 = (java.io.File) r10
            java.io.File r11 = (java.io.File) r11
            java.lang.String r1 = r10.getName()
            java.lang.String r3 = r11.getName()
            r2 = 0
            r0 = 2
            java.lang.String r1 = r1.substring(r2, r0)
            java.lang.String r0 = r3.substring(r2, r0)
            int r4 = r1.compareTo(r0)
            return r4
        L_0x014d:
            X.3Z6 r11 = (X.AnonymousClass3Z6) r11
            java.lang.Object r0 = r11.second
            int r0 = X.AnonymousClass001.A0K(r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            X.3Z6 r10 = (X.AnonymousClass3Z6) r10
            java.lang.Object r0 = r10.second
            int r0 = X.AnonymousClass001.A0K(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r4 = X.AnonymousClass2A6.A00(r1, r0)
            return r4
        L_0x016a:
            X.2lq r11 = (X.C52662lq) r11
            com.whatsapp.jid.GroupJid r1 = r11.A01
            X.2lq r10 = (X.C52662lq) r10
            com.whatsapp.jid.GroupJid r0 = r10.A01
            int r4 = X.AnonymousClass2A6.A00(r1, r0)
            return r4
        L_0x0177:
            X.3ZF r10 = (X.AnonymousClass3ZF) r10
            X.3ZF r11 = (X.AnonymousClass3ZF) r11
            X.39J r0 = r10.A0E
            int r4 = r0.A00
            X.39J r0 = r11.A0E
            int r0 = r0.A00
            int r4 = r4 - r0
            return r4
        L_0x0185:
            X.34x r10 = (X.C624134x) r10
            X.34x r11 = (X.C624134x) r11
            long r2 = r10.A0K
            long r0 = r11.A0K
            int r4 = java.lang.Long.compare(r2, r0)
            return r4
        L_0x0192:
            X.1ka r11 = (X.C29581ka) r11
            X.38T r0 = r11.A00
            java.lang.String r1 = r0.A01()
            X.1ka r10 = (X.C29581ka) r10
            X.38T r0 = r10.A00
            java.lang.String r0 = r0.A01()
            int r4 = X.AnonymousClass2A6.A00(r1, r0)
            return r4
        L_0x01a7:
            X.2j7 r10 = (X.C51002j7) r10
            java.lang.String r1 = r10.A00
            X.2j7 r11 = (X.C51002j7) r11
            java.lang.String r0 = r11.A00
            int r4 = X.AnonymousClass2A6.A00(r1, r0)
            return r4
        L_0x01b4:
            boolean r0 = r10 instanceof X.AnonymousClass1kY
            r0 = r0 ^ 1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            boolean r0 = r11 instanceof X.AnonymousClass1kY
            r0 = r0 ^ 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r4 = X.AnonymousClass2A6.A00(r1, r0)
            return r4
        L_0x01c9:
            java.util.List r10 = (java.util.List) r10
            java.util.List r11 = (java.util.List) r11
            java.lang.Object r0 = X.C18300x5.A0c(r10)
            X.2sO r0 = (X.C56682sO) r0
            X.34x r1 = r0.A00
            java.lang.Object r0 = X.C18300x5.A0c(r11)
            X.2sO r0 = (X.C56682sO) r0
            X.34x r0 = r0.A00
            long r2 = r1.A0K
            long r0 = r0.A0K
            int r4 = java.lang.Long.compare(r2, r0)
            return r4
        L_0x01e6:
            android.util.Pair r10 = (android.util.Pair) r10
            android.util.Pair r11 = (android.util.Pair) r11
            int r4 = X.AnonymousClass36W.A00(r10, r11)
            return r4
        L_0x01ef:
            X.2SN r10 = (X.AnonymousClass2SN) r10
            X.2SN r11 = (X.AnonymousClass2SN) r11
            java.lang.String r1 = r10.A04
            java.lang.String r0 = r11.A04
            int r4 = r1.compareTo(r0)
            return r4
        L_0x01fc:
            X.31A r11 = (X.AnonymousClass31A) r11
            long r0 = r11.A02()
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            X.31A r10 = (X.AnonymousClass31A) r10
            long r0 = r10.A02()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            int r4 = X.AnonymousClass2A6.A00(r2, r0)
            return r4
        L_0x0215:
            X.3ZF r11 = (X.AnonymousClass3ZF) r11
            long r0 = r11.A0B
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            X.3ZF r10 = (X.AnonymousClass3ZF) r10
            long r0 = r10.A0B
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            int r4 = X.AnonymousClass2A6.A00(r2, r0)
            return r4
        L_0x022a:
            X.4F8 r10 = (X.AnonymousClass4F8) r10
            X.4F8 r11 = (X.AnonymousClass4F8) r11
            float r6 = r10.BEU()
            float r5 = r11.BEU()
            float r0 = r6 - r5
            float r0 = java.lang.Math.abs(r0)
            double r3 = (double) r0
            r1 = 4562254508917369340(0x3f50624dd2f1a9fc, double:0.001)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0253
            long r2 = r11.B4B()
            long r0 = r10.B4B()
            int r4 = java.lang.Long.compare(r2, r0)
            return r4
        L_0x0253:
            int r4 = java.lang.Float.compare(r5, r6)
            return r4
        L_0x0258:
            X.2lZ r10 = (X.C52492lZ) r10
            int r0 = r10.A00
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            X.2lZ r11 = (X.C52492lZ) r11
            int r0 = r11.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r4 = X.AnonymousClass2A6.A00(r1, r0)
            return r4
        L_0x026d:
            X.2kI r10 = (X.C51732kI) r10
            int r0 = r10.A00
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            X.2kI r11 = (X.C51732kI) r11
            int r0 = r11.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r4 = X.AnonymousClass2A6.A00(r1, r0)
            return r4
        L_0x0282:
            java.io.File r10 = (java.io.File) r10
            java.io.File r11 = (java.io.File) r11
            long r2 = r10.lastModified()
            long r0 = r11.lastModified()
            int r4 = java.lang.Long.compare(r2, r0)
            return r4
        L_0x0293:
            X.2Kr r10 = (X.C41552Kr) r10
            int r0 = r10.A00
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            X.2Kr r11 = (X.C41552Kr) r11
            int r0 = r11.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r4 = X.AnonymousClass2A6.A00(r1, r0)
            return r4
        L_0x02a8:
            X.34x r10 = (X.C624134x) r10
            long r0 = r10.A0K
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            X.34x r11 = (X.C624134x) r11
            long r0 = r11.A0K
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            int r4 = X.AnonymousClass2A6.A00(r2, r0)
            return r4
        L_0x02bd:
            java.lang.String r10 = (java.lang.String) r10
            java.lang.String r11 = (java.lang.String) r11
            int r4 = r10.compareToIgnoreCase(r11)
            return r4
        L_0x02c6:
            X.2pH r10 = (X.C54782pH) r10
            X.2pH r11 = (X.C54782pH) r11
            long r2 = r11.A00
            long r0 = r10.A00
            int r4 = java.lang.Long.compare(r2, r0)
            return r4
        L_0x02d3:
            X.34x r10 = (X.C624134x) r10
            X.34x r11 = (X.C624134x) r11
            long r2 = r10.A1M
            long r0 = r11.A1M
            long r2 = r2 - r0
            int r4 = (int) r2
            return r4
        L_0x02de:
            java.util.Map$Entry r10 = (java.util.Map.Entry) r10
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            java.lang.Object r1 = r11.getValue()
            java.lang.Integer r1 = (java.lang.Integer) r1
            java.lang.Object r0 = r10.getValue()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r4 = r1.compareTo(r0)
            return r4
        L_0x02f3:
            X.34x r10 = (X.C624134x) r10
            X.2nF r0 = r10.A0r()
            r2 = 0
            if (r0 == 0) goto L_0x030d
            java.lang.Integer r1 = r0.A02
        L_0x02fe:
            X.34x r11 = (X.C624134x) r11
            X.2nF r0 = r11.A0r()
            if (r0 == 0) goto L_0x0308
            java.lang.Integer r2 = r0.A02
        L_0x0308:
            int r4 = X.AnonymousClass2A6.A00(r1, r2)
            return r4
        L_0x030d:
            r1 = r2
            goto L_0x02fe
        L_0x030f:
            X.36K r10 = (X.AnonymousClass36K) r10
            X.36K r11 = (X.AnonymousClass36K) r11
            java.lang.String r0 = "id"
            int r4 = X.AnonymousClass36K.A02(r10, r0)     // Catch:{ 24Y -> 0x03a3 }
            int r0 = X.AnonymousClass36K.A02(r11, r0)     // Catch:{ 24Y -> 0x03a3 }
            int r4 = r4 - r0
            return r4
        L_0x031f:
            X.33W r10 = (X.AnonymousClass33W) r10
            X.33W r11 = (X.AnonymousClass33W) r11
            long r2 = r11.A04
            long r0 = r10.A04
            int r4 = java.lang.Long.compare(r2, r0)
            return r4
        L_0x032c:
            X.33W r10 = (X.AnonymousClass33W) r10
            long r0 = r10.A04
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            X.33W r11 = (X.AnonymousClass33W) r11
            long r0 = r11.A04
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            int r4 = X.AnonymousClass2A6.A00(r2, r0)
            return r4
        L_0x0341:
            X.1Do r10 = (X.C21891Do) r10
            X.1Do r11 = (X.C21891Do) r11
            int r0 = r10.bitField0_
            boolean r0 = X.AnonymousClass0x2.A1X(r0)
            r1 = 0
            if (r0 == 0) goto L_0x0380
            X.1Ab r0 = r10.version_
            r3 = r0
            if (r0 != 0) goto L_0x0356
            X.1Ab r0 = X.C20981Ab.DEFAULT_INSTANCE
        L_0x0356:
            int r0 = r0.bitField0_
            r0 = r0 & 1
            if (r0 == 0) goto L_0x0380
            if (r3 != 0) goto L_0x0360
            X.1Ab r3 = X.C20981Ab.DEFAULT_INSTANCE
        L_0x0360:
            long r3 = r3.version_
        L_0x0362:
            int r0 = r11.bitField0_
            r0 = r0 & 1
            if (r0 == 0) goto L_0x037b
            X.1Ab r0 = r11.version_
            r5 = r0
            if (r0 != 0) goto L_0x036f
            X.1Ab r0 = X.C20981Ab.DEFAULT_INSTANCE
        L_0x036f:
            int r0 = r0.bitField0_
            r0 = r0 & 1
            if (r0 == 0) goto L_0x037b
            if (r5 != 0) goto L_0x0379
            X.1Ab r5 = X.C20981Ab.DEFAULT_INSTANCE
        L_0x0379:
            long r1 = r5.version_
        L_0x037b:
            int r4 = java.lang.Long.compare(r3, r1)
            return r4
        L_0x0380:
            r3 = 0
            goto L_0x0362
        L_0x0383:
            java.io.File r10 = (java.io.File) r10
            java.io.File r11 = (java.io.File) r11
            java.lang.String r0 = r10.getName()     // Catch:{  }
            r1 = 8
            java.lang.String r0 = r0.substring(r1)     // Catch:{  }
            int r4 = java.lang.Integer.parseInt(r0)     // Catch:{  }
            java.lang.String r0 = r11.getName()     // Catch:{  }
            java.lang.String r0 = r0.substring(r1)     // Catch:{  }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{  }
            int r4 = r4 - r0
            return r4
        L_0x03a3:
            r4 = 0
            return r4
        L_0x03a5:
            X.2m7 r10 = (X.C52832m7) r10
            java.lang.String r1 = r10.A03
            X.2m7 r11 = (X.C52832m7) r11
            java.lang.String r0 = r11.A03
            int r4 = X.AnonymousClass2A6.A00(r1, r0)
            return r4
        L_0x03b2:
            java.io.File r10 = (java.io.File) r10
            java.io.File r11 = (java.io.File) r11
            long r0 = r11.lastModified()
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            long r0 = r10.lastModified()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            int r4 = r2.compareTo(r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4IU.compare(java.lang.Object, java.lang.Object):int");
    }
}
