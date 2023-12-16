package X;

import android.os.Parcelable;

/* renamed from: X.91V  reason: invalid class name */
public class AnonymousClass91V implements Parcelable.Creator {
    public final int A00;

    public AnonymousClass91V(int i) {
        this.A00 = i;
    }

    public static AnonymousClass91V A00(int i) {
        return new AnonymousClass91V(i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:126:0x01fe, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x01ff, code lost:
        X.C159737mN.A00((X.C153427bI) null, "BloksDataStorage", "Casting error when retrieving data", r2);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r13) {
        /*
            r12 = this;
            int r0 = r12.A00
            switch(r0) {
                case 0: goto L_0x0491;
                case 1: goto L_0x048b;
                case 2: goto L_0x0485;
                case 3: goto L_0x047f;
                case 4: goto L_0x0479;
                case 5: goto L_0x0473;
                case 6: goto L_0x046d;
                case 7: goto L_0x0467;
                case 8: goto L_0x0461;
                case 9: goto L_0x045b;
                case 10: goto L_0x0455;
                case 11: goto L_0x044f;
                case 12: goto L_0x0449;
                case 13: goto L_0x0443;
                case 14: goto L_0x043d;
                case 15: goto L_0x0437;
                case 16: goto L_0x0431;
                case 17: goto L_0x042b;
                case 18: goto L_0x03e4;
                case 19: goto L_0x03de;
                case 20: goto L_0x03d8;
                case 21: goto L_0x03d2;
                case 22: goto L_0x03cc;
                case 23: goto L_0x03be;
                case 24: goto L_0x03b8;
                case 25: goto L_0x03b2;
                case 26: goto L_0x03ac;
                case 27: goto L_0x03a6;
                case 28: goto L_0x03a0;
                case 29: goto L_0x0388;
                case 30: goto L_0x0382;
                case 31: goto L_0x037c;
                case 32: goto L_0x0376;
                case 33: goto L_0x0370;
                case 34: goto L_0x036a;
                case 35: goto L_0x0364;
                case 36: goto L_0x035e;
                case 37: goto L_0x0358;
                case 38: goto L_0x0347;
                case 39: goto L_0x0341;
                case 40: goto L_0x033b;
                case 41: goto L_0x0335;
                case 42: goto L_0x032f;
                case 43: goto L_0x0329;
                case 44: goto L_0x0323;
                case 45: goto L_0x031d;
                case 46: goto L_0x0317;
                case 47: goto L_0x0311;
                case 48: goto L_0x030b;
                case 49: goto L_0x0305;
                case 50: goto L_0x02ff;
                case 51: goto L_0x02f9;
                case 52: goto L_0x02f3;
                case 53: goto L_0x02ed;
                case 54: goto L_0x02e7;
                case 55: goto L_0x02e1;
                case 56: goto L_0x02db;
                case 57: goto L_0x02d5;
                case 58: goto L_0x02cf;
                case 59: goto L_0x02c9;
                case 60: goto L_0x02c3;
                case 61: goto L_0x02bd;
                case 62: goto L_0x02af;
                case 63: goto L_0x02a9;
                case 64: goto L_0x02a3;
                case 65: goto L_0x029d;
                case 66: goto L_0x0297;
                case 67: goto L_0x0291;
                case 68: goto L_0x028b;
                case 69: goto L_0x0285;
                case 70: goto L_0x027f;
                case 71: goto L_0x0259;
                case 72: goto L_0x024f;
                case 73: goto L_0x022c;
                case 74: goto L_0x0226;
                case 75: goto L_0x01d7;
                case 76: goto L_0x01d1;
                case 77: goto L_0x01cb;
                case 78: goto L_0x01c5;
                case 79: goto L_0x01bf;
                case 80: goto L_0x01b9;
                case 81: goto L_0x01b3;
                case 82: goto L_0x01ad;
                case 83: goto L_0x01a3;
                case 84: goto L_0x019d;
                case 85: goto L_0x0197;
                case 86: goto L_0x0191;
                case 87: goto L_0x018b;
                case 88: goto L_0x0185;
                case 89: goto L_0x0172;
                case 90: goto L_0x0158;
                case 91: goto L_0x0133;
                case 92: goto L_0x0129;
                case 93: goto L_0x00f3;
                case 94: goto L_0x00ed;
                case 95: goto L_0x00d5;
                case 96: goto L_0x00b5;
                case 97: goto L_0x00af;
                case 98: goto L_0x00a5;
                case 99: goto L_0x009f;
                case 100: goto L_0x0099;
                case 101: goto L_0x0093;
                case 102: goto L_0x008d;
                case 103: goto L_0x0087;
                case 104: goto L_0x0081;
                case 105: goto L_0x007b;
                case 106: goto L_0x0075;
                case 107: goto L_0x006f;
                case 108: goto L_0x0069;
                case 109: goto L_0x005f;
                case 110: goto L_0x0059;
                case 111: goto L_0x0053;
                case 112: goto L_0x004d;
                case 113: goto L_0x0047;
                case 114: goto L_0x0041;
                case 115: goto L_0x003b;
                case 116: goto L_0x0035;
                case 117: goto L_0x002b;
                case 118: goto L_0x0019;
                case 119: goto L_0x000b;
                default: goto L_0x0005;
            }
        L_0x0005:
            X.5dk r6 = new X.5dk
            r6.<init>(r13)
            return r6
        L_0x000b:
            byte r2 = r13.readByte()
            int r1 = r13.readInt()
            r0 = 0
            X.38t r6 = X.AnonymousClass36O.A01(r0, r2, r1)
            return r6
        L_0x0019:
            java.lang.String r1 = X.C18310x6.A0l(r13)
            byte r0 = r13.readByte()
            boolean r0 = X.AnonymousClass001.A1T(r0)
            X.6nl r6 = new X.6nl
            r6.<init>(r1, r0)
            return r6
        L_0x002b:
            java.lang.String r0 = X.C18310x6.A0l(r13)
            X.6nk r6 = new X.6nk
            r6.<init>(r0)
            return r6
        L_0x0035:
            X.4lC r6 = new X.4lC
            r6.<init>(r13)
            return r6
        L_0x003b:
            X.4NI r6 = new X.4NI
            r6.<init>(r13)
            return r6
        L_0x0041:
            X.4NK r6 = new X.4NK
            r6.<init>(r13)
            return r6
        L_0x0047:
            X.6Ed r6 = new X.6Ed
            r6.<init>(r13)
            return r6
        L_0x004d:
            X.7yt r6 = new X.7yt
            r6.<init>(r13)
            return r6
        L_0x0053:
            X.5dq r6 = new X.5dq
            r6.<init>(r13)
            return r6
        L_0x0059:
            X.7yQ r6 = new X.7yQ
            r6.<init>(r13)
            return r6
        L_0x005f:
            r0 = 0
            X.C162457s7.A0J(r13, r0)
            X.7yd r6 = new X.7yd
            r6.<init>(r13)
            return r6
        L_0x0069:
            X.5dp r6 = new X.5dp
            r6.<init>(r13)
            return r6
        L_0x006f:
            X.6hp r6 = new X.6hp
            r6.<init>(r13)
            return r6
        L_0x0075:
            X.7yP r6 = new X.7yP
            r6.<init>(r13)
            return r6
        L_0x007b:
            X.6hq r6 = new X.6hq
            r6.<init>(r13)
            return r6
        L_0x0081:
            X.6ho r6 = new X.6ho
            r6.<init>(r13)
            return r6
        L_0x0087:
            X.7yO r6 = new X.7yO
            r6.<init>(r13)
            return r6
        L_0x008d:
            X.7yL r6 = new X.7yL
            r6.<init>(r13)
            return r6
        L_0x0093:
            X.6hl r6 = new X.6hl
            r6.<init>(r13)
            return r6
        L_0x0099:
            X.6hr r6 = new X.6hr
            r6.<init>(r13)
            return r6
        L_0x009f:
            X.6hm r6 = new X.6hm
            r6.<init>(r13)
            return r6
        L_0x00a5:
            r0 = 0
            X.C162457s7.A0J(r13, r0)
            X.6hn r6 = new X.6hn
            r6.<init>(r13)
            return r6
        L_0x00af:
            X.4NJ r6 = new X.4NJ
            r6.<init>((android.os.Parcel) r13)
            return r6
        L_0x00b5:
            java.lang.String r3 = X.AnonymousClass0x2.A0a(r13)
            java.lang.String r2 = r13.readString()
            java.lang.String r1 = r13.readString()
            java.lang.Class<X.5dH> r0 = X.C108615dH.class
            android.os.Parcelable r0 = X.C18280x3.A0C(r13, r0)
            X.C626936e.A06(r0)
            X.C162457s7.A0D(r0)
            X.5dH r0 = (X.C108615dH) r0
            X.5da r6 = new X.5da
            r6.<init>(r0, r3, r2, r1)
            return r6
        L_0x00d5:
            java.lang.String r2 = X.AnonymousClass0x2.A0a(r13)
            X.C626936e.A06(r2)
            X.C162457s7.A0D(r2)
            java.lang.String r1 = r13.readString()
            java.lang.String r0 = r13.readString()
            X.7y6 r6 = new X.7y6
            r6.<init>(r2, r1, r0)
            return r6
        L_0x00ed:
            X.5e1 r6 = new X.5e1
            r6.<init>(r13)
            return r6
        L_0x00f3:
            java.lang.String r5 = X.AnonymousClass0x2.A0a(r13)
            X.C626936e.A06(r5)
            X.C162457s7.A0D(r5)
            java.lang.String r4 = X.C18310x6.A0l(r13)
            X.C162457s7.A0D(r4)
            byte r0 = r13.readByte()
            r3 = 0
            if (r0 != 0) goto L_0x0120
            r2 = r3
        L_0x010c:
            byte r0 = r13.readByte()
            if (r0 == 0) goto L_0x011a
            double r0 = r13.readDouble()
            java.lang.Double r3 = java.lang.Double.valueOf(r0)
        L_0x011a:
            X.5dH r6 = new X.5dH
            r6.<init>(r2, r3, r5, r4)
            return r6
        L_0x0120:
            double r0 = r13.readDouble()
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            goto L_0x010c
        L_0x0129:
            r0 = 0
            X.C162457s7.A0J(r13, r0)
            X.5dt r6 = new X.5dt
            r6.<init>(r13)
            return r6
        L_0x0133:
            int r4 = X.C18310x6.A04(r13)
            int r3 = r13.readInt()
            byte r0 = r13.readByte()
            r2 = 0
            if (r0 != 0) goto L_0x0153
            r1 = r2
        L_0x0143:
            byte r0 = r13.readByte()
            if (r0 == 0) goto L_0x014d
            java.lang.Integer r2 = X.AnonymousClass6CA.A0P(r13)
        L_0x014d:
            X.7yB r6 = new X.7yB
            r6.<init>(r1, r2, r4, r3)
            return r6
        L_0x0153:
            java.lang.Integer r1 = X.AnonymousClass6CA.A0P(r13)
            goto L_0x0143
        L_0x0158:
            java.lang.String r2 = X.AnonymousClass0x2.A0a(r13)
            java.lang.String r1 = r13.readString()
            android.os.Parcelable$Creator r0 = X.C166127yB.CREATOR
            java.util.ArrayList r0 = r13.createTypedArrayList(r0)
            X.C626936e.A06(r0)
            X.C162457s7.A0D(r0)
            X.5dQ r6 = new X.5dQ
            r6.<init>(r2, r1, r0)
            return r6
        L_0x0172:
            java.lang.String r0 = X.AnonymousClass0x2.A0a(r13)
            if (r0 == 0) goto L_0x017e
            X.7xt r6 = new X.7xt
            r6.<init>(r0)
            return r6
        L_0x017e:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)
            throw r0
        L_0x0185:
            X.7yh r6 = new X.7yh
            r6.<init>(r13)
            return r6
        L_0x018b:
            X.4NH r6 = new X.4NH
            r6.<init>(r13)
            return r6
        L_0x0191:
            X.4NL r6 = new X.4NL
            r6.<init>((android.os.Parcel) r13)
            return r6
        L_0x0197:
            X.7yT r6 = new X.7yT
            r6.<init>(r13)
            return r6
        L_0x019d:
            X.7yU r6 = new X.7yU
            r6.<init>(r13)
            return r6
        L_0x01a3:
            r0 = 0
            X.C162457s7.A0J(r13, r0)
            X.6hB r6 = new X.6hB
            r6.<init>(r13)
            return r6
        L_0x01ad:
            X.5dl r6 = new X.5dl
            r6.<init>(r13)
            return r6
        L_0x01b3:
            X.7yY r6 = new X.7yY
            r6.<init>(r13)
            return r6
        L_0x01b9:
            X.6Ee r6 = new X.6Ee
            r6.<init>((android.os.Parcel) r13)
            return r6
        L_0x01bf:
            X.5dw r6 = new X.5dw
            r6.<init>(r13)
            return r6
        L_0x01c5:
            X.4NG r6 = new X.4NG
            r6.<init>((android.os.Parcel) r13)
            return r6
        L_0x01cb:
            X.6Ec r6 = new X.6Ec
            r6.<init>((android.os.Parcel) r13)
            return r6
        L_0x01d1:
            X.7yR r6 = new X.7yR
            r6.<init>(r13)
            return r6
        L_0x01d7:
            int r5 = r13.readInt()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            java.lang.Class<X.8mt> r4 = X.C181518mt.class
            r3 = 0
            if (r0 == 0) goto L_0x0208
            java.lang.Object r2 = X.AnonymousClass0K2.A01     // Catch:{ ClassCastException -> 0x01fe }
            monitor-enter(r2)     // Catch:{ ClassCastException -> 0x01fe }
            android.util.SparseArray r1 = X.AnonymousClass0K2.A00     // Catch:{ all -> 0x01fb }
            int r0 = r1.indexOfKey(r5)     // Catch:{ all -> 0x01fb }
            if (r0 >= 0) goto L_0x01f1
            r0 = r3
            goto L_0x01f9
        L_0x01f1:
            java.lang.Object r0 = r1.get(r5)     // Catch:{ all -> 0x01fb }
            java.lang.Object r0 = r4.cast(r0)     // Catch:{ all -> 0x01fb }
        L_0x01f9:
            monitor-exit(r2)     // Catch:{ ClassCastException -> 0x01fe }
            goto L_0x0207
        L_0x01fb:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ ClassCastException -> 0x01fe }
            throw r0     // Catch:{ ClassCastException -> 0x01fe }
        L_0x01fe:
            r2 = move-exception
            java.lang.String r1 = "BloksDataStorage"
            java.lang.String r0 = "Casting error when retrieving data"
            X.C159737mN.A00(r3, r1, r0, r2)
            goto L_0x0208
        L_0x0207:
            r3 = r0
        L_0x0208:
            X.8mt r3 = (X.C181518mt) r3
            if (r3 != 0) goto L_0x0220
            X.6vE r2 = X.C141226vE.ERROR
            java.lang.String r1 = "CdsOpenScreenCallerDismissCallback"
            java.lang.String r0 = "Expected non-null CallerDismissCallbackRunnable from BloksDataStorage"
            X.C159557m5.A01(r2, r1, r0)
            X.8Dv r0 = new X.8Dv
            r0.<init>()
            X.7xk r6 = new X.7xk
            r6.<init>(r0)
            return r6
        L_0x0220:
            X.7xk r6 = new X.7xk
            r6.<init>(r3)
            return r6
        L_0x0226:
            X.7yN r6 = new X.7yN
            r6.<init>(r13)
            return r6
        L_0x022c:
            int r3 = r13.readInt()
            int r2 = r13.readInt()
            java.lang.String r0 = "UTC"
            java.util.TimeZone r0 = java.util.TimeZone.getTimeZone(r0)
            java.util.Calendar r1 = java.util.Calendar.getInstance(r0)
            r1.clear()
            r0 = 1
            r1.set(r0, r3)
            r0 = 2
            r1.set(r0, r2)
            X.5rI r6 = new X.5rI
            r6.<init>(r1)
            return r6
        L_0x024f:
            long r0 = r13.readLong()
            X.8Bn r6 = new X.8Bn
            r6.<init>(r0)
            return r6
        L_0x0259:
            java.lang.Class<X.5rI> r0 = X.C117045rI.class
            android.os.Parcelable r8 = X.C18280x3.A0C(r13, r0)
            X.5rI r8 = (X.C117045rI) r8
            android.os.Parcelable r9 = X.C18280x3.A0C(r13, r0)
            X.5rI r9 = (X.C117045rI) r9
            android.os.Parcelable r10 = X.C18280x3.A0C(r13, r0)
            X.5rI r10 = (X.C117045rI) r10
            java.lang.Class<X.8x4> r0 = X.C187358x4.class
            android.os.Parcelable r7 = X.C18280x3.A0C(r13, r0)
            X.8x4 r7 = (X.C187358x4) r7
            int r11 = r13.readInt()
            X.5dI r6 = new X.5dI
            r6.<init>(r7, r8, r9, r10, r11)
            return r6
        L_0x027f:
            X.6Ef r6 = new X.6Ef
            r6.<init>((android.os.Parcel) r13)
            return r6
        L_0x0285:
            X.5dn r6 = new X.5dn
            r6.<init>(r13)
            return r6
        L_0x028b:
            X.7ym r6 = new X.7ym
            r6.<init>(r13)
            return r6
        L_0x0291:
            X.7ye r6 = new X.7ye
            r6.<init>(r13)
            return r6
        L_0x0297:
            X.7xs r6 = new X.7xs
            r6.<init>(r13)
            return r6
        L_0x029d:
            X.6Pj r6 = new X.6Pj
            r6.<init>(r13)
            return r6
        L_0x02a3:
            X.7yb r6 = new X.7yb
            r6.<init>((android.os.Parcel) r13)
            return r6
        L_0x02a9:
            X.7ya r6 = new X.7ya
            r6.<init>((android.os.Parcel) r13)
            return r6
        L_0x02af:
            long r2 = r13.readLong()
            long r0 = r13.readLong()
            X.6PF r6 = new X.6PF
            r6.<init>(r2, r0)
            return r6
        L_0x02bd:
            X.6PE r6 = new X.6PE
            r6.<init>((android.os.Parcel) r13)
            return r6
        L_0x02c3:
            X.6PD r6 = new X.6PD
            r6.<init>()
            return r6
        L_0x02c9:
            X.6PH r6 = new X.6PH
            r6.<init>(r13)
            return r6
        L_0x02cf:
            X.6PG r6 = new X.6PG
            r6.<init>(r13)
            return r6
        L_0x02d5:
            X.87a r6 = new X.87a
            r6.<init>(r13)
            return r6
        L_0x02db:
            X.87d r6 = new X.87d
            r6.<init>(r13)
            return r6
        L_0x02e1:
            X.87c r6 = new X.87c
            r6.<init>(r13)
            return r6
        L_0x02e7:
            X.6P6 r6 = new X.6P6
            r6.<init>(r13)
            return r6
        L_0x02ed:
            X.6P5 r6 = new X.6P5
            r6.<init>(r13)
            return r6
        L_0x02f3:
            X.6P4 r6 = new X.6P4
            r6.<init>(r13)
            return r6
        L_0x02f9:
            X.6PB r6 = new X.6PB
            r6.<init>(r13)
            return r6
        L_0x02ff:
            X.6P8 r6 = new X.6P8
            r6.<init>(r13)
            return r6
        L_0x0305:
            X.6PA r6 = new X.6PA
            r6.<init>(r13)
            return r6
        L_0x030b:
            X.6P7 r6 = new X.6P7
            r6.<init>(r13)
            return r6
        L_0x0311:
            X.6P3 r6 = new X.6P3
            r6.<init>(r13)
            return r6
        L_0x0317:
            X.6PC r6 = new X.6PC
            r6.<init>(r13)
            return r6
        L_0x031d:
            X.6P2 r6 = new X.6P2
            r6.<init>(r13)
            return r6
        L_0x0323:
            X.6P9 r6 = new X.6P9
            r6.<init>(r13)
            return r6
        L_0x0329:
            X.87b r6 = new X.87b
            r6.<init>(r13)
            return r6
        L_0x032f:
            X.87e r6 = new X.87e
            r6.<init>(r13)
            return r6
        L_0x0335:
            X.87Z r6 = new X.87Z
            r6.<init>(r13)
            return r6
        L_0x033b:
            X.87g r6 = new X.87g
            r6.<init>(r13)
            return r6
        L_0x0341:
            X.87f r6 = new X.87f
            r6.<init>(r13)
            return r6
        L_0x0347:
            java.lang.String r1 = r13.readString()
            r1.getClass()
            int r0 = r13.readInt()
            X.87Y r6 = new X.87Y
            r6.<init>(r0, r1)
            return r6
        L_0x0358:
            X.7ys r6 = new X.7ys
            r6.<init>((android.os.Parcel) r13)
            return r6
        L_0x035e:
            X.7yc r6 = new X.7yc
            r6.<init>(r13)
            return r6
        L_0x0364:
            X.7z2 r6 = new X.7z2
            r6.<init>(r13)
            return r6
        L_0x036a:
            X.7yp r6 = new X.7yp
            r6.<init>((android.os.Parcel) r13)
            return r6
        L_0x0370:
            X.7xv r6 = new X.7xv
            r6.<init>(r13)
            return r6
        L_0x0376:
            X.7yv r6 = new X.7yv
            r6.<init>(r13)
            return r6
        L_0x037c:
            X.7yW r6 = new X.7yW
            r6.<init>(r13)
            return r6
        L_0x0382:
            X.7yM r6 = new X.7yM
            r6.<init>(r13)
            return r6
        L_0x0388:
            int r2 = r13.readInt()
            android.util.SparseArray r1 = X.C142936y3.A00
            java.lang.Object r0 = r1.get(r2)
            if (r0 == 0) goto L_0x0399
            java.lang.Object r6 = r1.get(r2)
            return r6
        L_0x0399:
            java.lang.String r0 = "Invalid VideoMemoryState value"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)
            throw r0
        L_0x03a0:
            X.7yr r6 = new X.7yr
            r6.<init>(r13)
            return r6
        L_0x03a6:
            X.6Nv r6 = new X.6Nv
            r6.<init>(r13)
            return r6
        L_0x03ac:
            X.6Nt r6 = new X.6Nt
            r6.<init>((android.os.Parcel) r13)
            return r6
        L_0x03b2:
            X.6Ns r6 = new X.6Ns
            r6.<init>((android.os.Parcel) r13)
            return r6
        L_0x03b8:
            X.6Nu r6 = new X.6Nu
            r6.<init>(r13)
            return r6
        L_0x03be:
            long r2 = r13.readLong()
            long r0 = r13.readLong()
            X.7xl r6 = new X.7xl
            r6.<init>(r2, r0)
            return r6
        L_0x03cc:
            X.7yf r6 = new X.7yf
            r6.<init>(r13)
            return r6
        L_0x03d2:
            X.7yi r6 = new X.7yi
            r6.<init>(r13)
            return r6
        L_0x03d8:
            X.7yu r6 = new X.7yu
            r6.<init>(r13)
            return r6
        L_0x03de:
            X.7yn r6 = new X.7yn
            r6.<init>(r13)
            return r6
        L_0x03e4:
            int r2 = r13.readInt()
            android.util.SparseArray r1 = X.C142536xM.A00
            java.lang.Object r0 = r1.get(r2)
            if (r0 == 0) goto L_0x0424
            java.lang.Object r0 = r1.get(r2)
            X.6xM r0 = (X.C142536xM) r0
            int r0 = r0.ordinal()
            switch(r0) {
                case 1: goto L_0x0404;
                case 2: goto L_0x03fd;
                case 3: goto L_0x03fd;
                case 4: goto L_0x03fd;
                case 5: goto L_0x040a;
                case 6: goto L_0x0410;
                case 7: goto L_0x0416;
                case 8: goto L_0x041c;
                case 9: goto L_0x0422;
                default: goto L_0x03fd;
            }
        L_0x03fd:
            java.lang.String r0 = "Unknown event type"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)
            throw r0
        L_0x0404:
            X.6L7 r6 = new X.6L7
            r6.<init>((android.os.Parcel) r13)
            return r6
        L_0x040a:
            X.6L8 r6 = new X.6L8
            r6.<init>(r13)
            return r6
        L_0x0410:
            X.6L4 r6 = new X.6L4
            r6.<init>(r13)
            return r6
        L_0x0416:
            X.6L5 r6 = new X.6L5
            r6.<init>(r13)
            return r6
        L_0x041c:
            X.6L6 r6 = new X.6L6
            r6.<init>(r13)
            return r6
        L_0x0422:
            r6 = 0
            return r6
        L_0x0424:
            java.lang.String r0 = "Invalid EventType value"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)
            throw r0
        L_0x042b:
            X.7yo r6 = new X.7yo
            r6.<init>((android.os.Parcel) r13)
            return r6
        L_0x0431:
            X.7yZ r6 = new X.7yZ
            r6.<init>((android.os.Parcel) r13)
            return r6
        L_0x0437:
            X.5du r6 = new X.5du
            r6.<init>(r13)
            return r6
        L_0x043d:
            X.5ds r6 = new X.5ds
            r6.<init>(r13)
            return r6
        L_0x0443:
            X.7yk r6 = new X.7yk
            r6.<init>(r13)
            return r6
        L_0x0449:
            X.7xr r6 = new X.7xr
            r6.<init>(r13)
            return r6
        L_0x044f:
            X.6KG r6 = new X.6KG
            r6.<init>((android.os.Parcel) r13)
            return r6
        L_0x0455:
            X.81N r6 = new X.81N
            r6.<init>(r13)
            return r6
        L_0x045b:
            X.6Jv r6 = new X.6Jv
            r6.<init>(r13)
            return r6
        L_0x0461:
            X.6Jx r6 = new X.6Jx
            r6.<init>(r13)
            return r6
        L_0x0467:
            X.6Jw r6 = new X.6Jw
            r6.<init>(r13)
            return r6
        L_0x046d:
            X.6Jy r6 = new X.6Jy
            r6.<init>(r13)
            return r6
        L_0x0473:
            X.81P r6 = new X.81P
            r6.<init>(r13)
            return r6
        L_0x0479:
            X.7yg r6 = new X.7yg
            r6.<init>((android.os.Parcel) r13)
            return r6
        L_0x047f:
            X.81O r6 = new X.81O
            r6.<init>(r13)
            return r6
        L_0x0485:
            X.7yl r6 = new X.7yl
            r6.<init>(r13)
            return r6
        L_0x048b:
            X.7z3 r6 = new X.7z3
            r6.<init>(r13)
            return r6
        L_0x0491:
            X.7QM r1 = new X.7QM
            r1.<init>()
            java.lang.String r0 = r13.readString()
            r1.A05 = r0
            boolean r0 = X.AnonymousClass6C7.A1W(r13)
            r1.A0F = r0
            boolean r0 = X.AnonymousClass6C7.A1W(r13)
            r1.A0G = r0
            boolean r0 = X.AnonymousClass6C7.A1W(r13)
            r1.A0C = r0
            boolean r0 = X.AnonymousClass6C7.A1W(r13)
            r1.A0B = r0
            boolean r0 = X.AnonymousClass6C7.A1W(r13)
            r1.A0A = r0
            boolean r0 = X.AnonymousClass6C7.A1W(r13)
            r1.A09 = r0
            boolean r0 = X.AnonymousClass6C7.A1W(r13)
            r1.A08 = r0
            boolean r0 = X.AnonymousClass6C7.A1W(r13)
            r1.A07 = r0
            boolean r0 = X.AnonymousClass6C7.A1W(r13)
            r1.A0H = r0
            java.lang.String r0 = r13.readString()
            r1.A03 = r0
            java.lang.String r0 = r13.readString()
            r1.A04 = r0
            java.lang.String r0 = r13.readString()
            r1.A02 = r0
            java.lang.String r0 = r13.readString()
            r1.A06 = r0
            java.lang.String r0 = r13.readString()
            r1.A01 = r0
            boolean r0 = X.AnonymousClass6C7.A1W(r13)
            r1.A0E = r0
            int r0 = r13.readInt()
            r1.A00 = r0
            boolean r0 = X.AnonymousClass6C7.A1W(r13)
            r1.A0D = r0
            boolean r0 = X.AnonymousClass6C7.A1W(r13)
            r1.A0I = r0
            X.7xp r6 = new X.7xp
            r6.<init>(r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass91V.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        switch (this.A00) {
            case 0:
                return new C165907xp[i];
            case 1:
                return new C166657z3[i];
            case 2:
                return new C166487yl[i];
            case 3:
                return new AnonymousClass81O[i];
            case 4:
                return new C166437yg[i];
            case 5:
                return new AnonymousClass81P[i];
            case 6:
                return new C125906Jy[i];
            case 7:
                return new C125886Jw[i];
            case 8:
                return new C125896Jx[i];
            case 9:
                return new C125876Jv[i];
            case 10:
                return new AnonymousClass81N[i];
            case 11:
                return new AnonymousClass6KG[i];
            case 12:
                return new C165927xr[i];
            case 13:
                return new C166477yk[i];
            case 14:
                return new C108975ds[i];
            case 15:
                return new C108995du[i];
            case 16:
                return new C166367yZ[i];
            case 17:
                return new C166517yo[i];
            case 18:
                return new C165847xj[i];
            case 19:
                return new C166507yn[i];
            case 20:
                return new C166567yu[i];
            case 21:
                return new C166457yi[i];
            case 22:
                return new C166427yf[i];
            case 23:
                return new C165867xl[i];
            case 24:
                return new C126416Nu[i];
            case 25:
                return new C126396Ns[i];
            case 26:
                return new C126406Nt[i];
            case 27:
                return new C126426Nv[i];
            case 28:
                return new C166537yr[i];
            case 29:
                return new C142936y3[i];
            case 30:
                return new C166237yM[i];
            case 31:
                return new C166337yW[i];
            case 32:
                return new C166577yv[i];
            case 33:
                return new C165967xv[i];
            case 34:
                return new C166527yp[i];
            case 35:
                return new C166647z2[i];
            case 36:
                return new C166397yc[i];
            case 37:
                return new C166547ys[i];
            case 38:
                return new AnonymousClass87Y[i];
            case 39:
                return new C1689087f[i];
            case 40:
                return new C1689187g[i];
            case 41:
                return new AnonymousClass87Z[i];
            case 42:
                return new C1688987e[i];
            case 43:
                return new C1688687b[i];
            case 44:
                return new AnonymousClass6P9[i];
            case 45:
                return new AnonymousClass6P2[i];
            case 46:
                return new AnonymousClass6PC[i];
            case 47:
                return new AnonymousClass6P3[i];
            case 48:
                return new AnonymousClass6P7[i];
            case 49:
                return new AnonymousClass6PA[i];
            case 50:
                return new AnonymousClass6P8[i];
            case 51:
                return new AnonymousClass6PB[i];
            case AnonymousClass1ES.REVOKE_MESSAGE_TIMESTAMP_FIELD_NUMBER:
                return new AnonymousClass6P4[i];
            case 53:
                return new AnonymousClass6P5[i];
            case 54:
                return new AnonymousClass6P6[i];
            case 55:
                return new C1688787c[i];
            case 56:
                return new C1688887d[i];
            case AnonymousClass1ES.IS_GROUP_HISTORY_MESSAGE_FIELD_NUMBER:
                return new C1688587a[i];
            case 58:
                return new AnonymousClass6PG[i];
            case 59:
                return new AnonymousClass6PH[i];
            case AnonymousClass1EU.POLL_CREATION_MESSAGE_V2_FIELD_NUMBER:
                return new AnonymousClass6PD[i];
            case 61:
                return new AnonymousClass6PE[i];
            case 62:
                return new AnonymousClass6PF[i];
            case 63:
                return new C166377ya[i];
            case AnonymousClass1EU.POLL_CREATION_MESSAGE_V3_FIELD_NUMBER:
                return new C166387yb[i];
            case AnonymousClass1EU.SCHEDULED_CALL_EDIT_MESSAGE_FIELD_NUMBER:
                return new C126806Pj[i];
            case AnonymousClass1EU.PTV_MESSAGE_FIELD_NUMBER:
                return new C165937xs[i];
            case AnonymousClass1EU.BOT_INVOKE_MESSAGE_FIELD_NUMBER:
                return new C166417ye[i];
            case 68:
                return new C166497ym[i];
            case AnonymousClass1EU.CALL_LOG_MESSSAGE_FIELD_NUMBER:
                return new C108925dn[i];
            case AnonymousClass1EU.MESSAGE_HISTORY_BUNDLE_FIELD_NUMBER:
                return new C124876Ef[i];
            case AnonymousClass1EU.ENC_COMMENT_MESSAGE_FIELD_NUMBER:
                return new C108625dI[i];
            case 72:
                return new C170018Bn[i];
            case 73:
                return new C117045rI[i];
            case AnonymousClass1EU.LOTTIE_STICKER_MESSAGE_FIELD_NUMBER:
                return new C166247yN[i];
            case AnonymousClass1EU.EVENT_MESSAGE_FIELD_NUMBER:
                return new C165857xk[i];
            case AnonymousClass1EU.ENC_EVENT_RESPONSE_MESSAGE_FIELD_NUMBER:
                return new C166287yR[i];
            case AnonymousClass1EU.COMMENT_MESSAGE_FIELD_NUMBER:
                return new C124846Ec[i];
            case AnonymousClass1EU.NEWSLETTER_ADMIN_INVITE_MESSAGE_FIELD_NUMBER:
                return new AnonymousClass4NG[i];
            case 79:
                return new C109015dw[i];
            case 80:
                return new C124866Ee[i];
            case 81:
                return new C166357yY[i];
            case 82:
                return new C108915dl[i];
            case 83:
                return new C133336hB[i];
            case 84:
                return new C166317yU[i];
            case 85:
                return new C166307yT[i];
            case 86:
                return new AnonymousClass4NL[i];
            case 87:
                return new AnonymousClass4NH[i];
            case 88:
                return new C166447yh[i];
            case 89:
                return new C165947xt[i];
            case 90:
                return new C108705dQ[i];
            case 91:
                return new C166127yB[i];
            case 92:
                return new C108985dt[i];
            case 93:
                return new C108615dH[i];
            case 94:
                return new C109065e1[i];
            case 95:
                return new C166077y6[i];
            case 96:
                return new C108805da[i];
            case 97:
                return new AnonymousClass4NJ[i];
            case 98:
                return new C133696hn[i];
            case 99:
                return new C133686hm[i];
            case 100:
                return new C133736hr[i];
            case 101:
                return new C133676hl[i];
            case 102:
                return new C166227yL[i];
            case 103:
                return new C166257yO[i];
            case 104:
                return new C133706ho[i];
            case 105:
                return new C133726hq[i];
            case 106:
                return new C166267yP[i];
            case 107:
                return new C133716hp[i];
            case C627136h.A03:
                return new C108945dp[i];
            case 109:
                return new C166407yd[i];
            case 110:
                return new C166277yQ[i];
            case 111:
                return new C108955dq[i];
            case 112:
                return new C166557yt[i];
            case 113:
                return new C124856Ed[i];
            case 114:
                return new AnonymousClass4NK[i];
            case 115:
                return new AnonymousClass4NI[i];
            case 116:
                return new C91824lC[i];
            case 117:
                return new C137076nk[i];
            case 118:
                return new C137086nl[i];
            case 119:
                return new C633138t[i];
            default:
                return new C108905dk[i];
        }
    }
}
