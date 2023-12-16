package X;

import android.content.Context;
import android.text.TextUtils;
import com.whatsapp.R;

/* renamed from: X.3ca  reason: invalid class name and case insensitive filesystem */
public class C71733ca implements Runnable {
    public int A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public C71733ca(C621033m r2, C624134x r3, int i) {
        this.A03 = 44;
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = i;
    }

    public static void A01(AnonymousClass4FS r1, Object obj, Object obj2, int i, int i2) {
        r1.BkM(new C71733ca(obj, obj2, i, i2));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:133:0x02be, code lost:
        if (r4 != null) goto L_0x017d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:?, code lost:
        r2.call("kill_process", (java.lang.String) null, (android.os.Bundle) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x05e2, code lost:
        com.whatsapp.accountswitching.secondaryprocess.AccountSwitchingActivity.A0C(r2);
        r2 = r3.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x05e7, code lost:
        if (r2 == null) goto L_0x05e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x05ef, code lost:
        throw X.C18270x1.A0S("mainThreadHandler");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x05f0, code lost:
        r2.post(new X.C117165rU(r3, 11, r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x05fa, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x05fb, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x05fc, code lost:
        com.whatsapp.accountswitching.secondaryprocess.AccountSwitchingActivity.A0C(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:286:0x05ff, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:345:0x07f1, code lost:
        if (X.C18280x3.A1X(r11, X.C617432b.A0C) != false) goto L_0x07f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:349:0x07fd, code lost:
        if (X.C617432b.A00(r11, X.C617432b.A02) == false) goto L_0x07ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:354:0x0807, code lost:
        if (r1 != false) goto L_0x0809;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:367:0x082a, code lost:
        if (r9.isEmpty() == false) goto L_0x082c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:374:0x0839, code lost:
        if (r1 != false) goto L_0x083b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:379:0x084f, code lost:
        if (r15 != false) goto L_0x0851;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:404:0x08a0, code lost:
        if (X.C18280x3.A1X(r9, r1) == false) goto L_0x08a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:422:0x08dd, code lost:
        if (r1 != null) goto L_0x07b5;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0291 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:284:0x05fb A[ExcHandler: all (r0v190 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:254:0x0569] */
    /* JADX WARNING: Removed duplicated region for block: B:342:0x07d4  */
    /* JADX WARNING: Removed duplicated region for block: B:407:0x08b0  */
    /* JADX WARNING: Removed duplicated region for block: B:410:0x08b7  */
    /* JADX WARNING: Removed duplicated region for block: B:413:0x08c0  */
    /* JADX WARNING: Removed duplicated region for block: B:595:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r27 = this;
            r4 = r27
            int r0 = r4.A03
            switch(r0) {
                case 0: goto L_0x0023;
                case 1: goto L_0x04db;
                case 2: goto L_0x04eb;
                case 3: goto L_0x04fa;
                case 4: goto L_0x0508;
                case 5: goto L_0x0055;
                case 6: goto L_0x0127;
                case 7: goto L_0x0516;
                case 8: goto L_0x0548;
                case 9: goto L_0x0605;
                case 10: goto L_0x0144;
                case 11: goto L_0x061a;
                case 12: goto L_0x02c2;
                case 13: goto L_0x0630;
                case 14: goto L_0x064e;
                case 15: goto L_0x064e;
                case 16: goto L_0x0670;
                case 17: goto L_0x02ea;
                case 18: goto L_0x02ea;
                case 19: goto L_0x0680;
                case 20: goto L_0x032e;
                case 21: goto L_0x035b;
                case 22: goto L_0x068e;
                case 23: goto L_0x06ab;
                case 24: goto L_0x06bd;
                case 25: goto L_0x06db;
                case 26: goto L_0x0709;
                case 27: goto L_0x0a52;
                case 28: goto L_0x0b1b;
                case 29: goto L_0x073d;
                case 30: goto L_0x074e;
                case 31: goto L_0x0397;
                case 32: goto L_0x0763;
                case 33: goto L_0x0778;
                case 34: goto L_0x092d;
                case 35: goto L_0x0965;
                case 36: goto L_0x03ca;
                case 37: goto L_0x03e2;
                case 38: goto L_0x0972;
                case 39: goto L_0x0402;
                case 40: goto L_0x0982;
                case 41: goto L_0x09f9;
                case 42: goto L_0x045d;
                case 43: goto L_0x0a07;
                case 44: goto L_0x0a15;
                case 45: goto L_0x0007;
                case 46: goto L_0x0007;
                case 47: goto L_0x0a24;
                case 48: goto L_0x0478;
                case 49: goto L_0x04a2;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r4.A01
            X.3Ln r0 = (X.C66463Ln) r0
            java.lang.Object r3 = r4.A02
            com.whatsapp.jid.DeviceJid r3 = (com.whatsapp.jid.DeviceJid) r3
            int r2 = r4.A00
            X.8qC r0 = r0.A04
            java.lang.Object r1 = r0.get()
            X.33Z r1 = (X.AnonymousClass33Z) r1
            r0 = 406(0x196, float:5.69E-43)
            boolean r0 = X.AnonymousClass000.A1U(r2, r0)
            r1.A09(r3, r0)
        L_0x0022:
            return
        L_0x0023:
            java.lang.Object r0 = r4.A01
            java.util.AbstractCollection r0 = (java.util.AbstractCollection) r0
            int r5 = r4.A00
            java.lang.Object r4 = r4.A02
            X.48s r4 = (X.C835148s) r4
            java.util.Iterator r3 = r0.iterator()
        L_0x0031:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0022
            java.lang.Object r2 = r3.next()
            X.7Wa r2 = (X.C151717Wa) r2
            boolean r0 = r2.A02
            if (r0 != 0) goto L_0x0031
            r0 = -1
            if (r5 == r0) goto L_0x004c
            X.7VD r0 = r2.A00
            android.util.SparseBooleanArray r1 = r0.A00
            r0 = 1
            r1.append(r5, r0)
        L_0x004c:
            r0 = 1
            r2.A01 = r0
            java.lang.Object r0 = r2.A03
            r4.BGn(r0)
            goto L_0x0031
        L_0x0055:
            java.lang.Object r2 = r4.A01
            X.3Go r2 = (X.C65193Go) r2
            int r5 = r4.A00
            java.lang.Object r6 = r4.A02
            X.34x r6 = (X.C624134x) r6
            X.1VX r0 = r2.A0Y
            r1 = 508(0x1fc, float:7.12E-43)
            X.2vE r4 = X.C58422vE.A02
            boolean r0 = r0.A0Y(r4, r1)
            if (r0 == 0) goto L_0x0022
            X.2R2 r2 = r2.A0L
            X.1VX r3 = r2.A03
            boolean r0 = r3.A0Y(r4, r1)
            if (r0 == 0) goto L_0x0022
            X.2z0 r1 = r6.A1J
            X.4uZ r0 = r1.A00
            com.whatsapp.jid.UserJid r7 = X.AnonymousClass32Y.A03(r0)
            if (r7 == 0) goto L_0x0022
            boolean r0 = r1.A02
            if (r0 == 0) goto L_0x0022
            java.lang.String r0 = r6.A12
            if (r0 != 0) goto L_0x008b
            java.lang.String r0 = r6.A11
            if (r0 == 0) goto L_0x0022
        L_0x008b:
            int r1 = r6.A0D
            r0 = 24
            if (r5 != r0) goto L_0x00c5
            X.1i3 r0 = r2.A00
            java.util.Iterator r5 = X.C61102zi.A03(r0)
        L_0x0097:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0022
            java.lang.Object r4 = r5.next()
            X.5mB r4 = (X.C113905mB) r4
            X.2sr r0 = r4.A03
            boolean r0 = r0.A0a(r7)
            if (r0 != 0) goto L_0x0097
            X.2n3 r0 = r4.A0E
            X.2wd r0 = r0.A01
            X.2pe r3 = r0.A01(r7)
            if (r3 == 0) goto L_0x0097
            boolean r0 = r3.A08
            if (r0 != 0) goto L_0x0097
            X.3dI r2 = r4.A0e
            r1 = 7
            X.3aK r0 = new X.3aK
            r0.<init>(r4, r7, r3, r1)
            r2.execute(r0)
            goto L_0x0097
        L_0x00c5:
            r0 = 5
            if (r1 == r0) goto L_0x00cc
            r0 = 13
            if (r1 != r0) goto L_0x0022
        L_0x00cc:
            r0 = 6657(0x1a01, float:9.328E-42)
            boolean r0 = r3.A0Y(r4, r0)
            if (r0 != 0) goto L_0x00ef
            java.lang.String r0 = "CTWA: EntryPointConversionMessageHandler/handleSentMessageWithEntryPointConversionAttached/ deleting conversion"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            X.2n3 r0 = r2.A02
            X.2wd r0 = r0.A01
            X.2y5 r1 = r0.A00
            java.lang.String r0 = "entry_point_conversions_for_sending"
            android.content.SharedPreferences$Editor r1 = X.C60152y5.A00(r1, r0)
            java.lang.String r0 = r7.getRawString()
            android.content.SharedPreferences$Editor r0 = r1.remove(r0)
            goto L_0x0b7d
        L_0x00ef:
            java.lang.String r0 = "CTWA: EntryPointConversionMessageHandler/handleSentMessageWithEntryPointConversionAttached/ updating conversion to set wasDeliveredToBiz to true."
            com.whatsapp.util.Log.d((java.lang.String) r0)
            X.2n3 r2 = r2.A02
            X.2wd r0 = r2.A01
            X.2pe r1 = r0.A01(r7)
            if (r1 == 0) goto L_0x0022
            boolean r0 = r1.A08
            if (r0 != 0) goto L_0x0022
            java.lang.String r8 = r1.A06
            java.lang.String r9 = r1.A05
            long r10 = r1.A01
            long r12 = r1.A03
            X.2TW r6 = new X.2TW
            r6.<init>(r7, r8, r9, r10, r12)
            boolean r0 = r1.A07
            r6.A02 = r0
            int r0 = r1.A00
            r6.A00 = r0
            long r0 = r1.A02
            r6.A01 = r0
            r0 = 1
            r6.A03 = r0
            X.2pe r0 = new X.2pe
            r0.<init>(r6)
            r2.A01(r0)
            return
        L_0x0127:
            java.lang.Object r5 = r4.A01
            X.33m r5 = (X.C621033m) r5
            java.lang.Object r4 = r4.A02
            X.1fJ r4 = (X.C27991fJ) r4
            r3 = 1
            X.2so r0 = r5.A0K
            X.1fJ r2 = r0.A01(r4)
            if (r2 == 0) goto L_0x0022
            X.2W8 r1 = r5.A11
            X.2ss r0 = r5.A0i
            int r0 = r0.A06(r4)
            r1.A00(r2, r0, r3)
            return
        L_0x0144:
            java.lang.Object r3 = r4.A01
            X.2hZ r3 = (X.C50062hZ) r3
            java.lang.Object r7 = r4.A02
            X.34x r7 = (X.C624134x) r7
            int r0 = r4.A00
            byte r6 = (byte) r0
            r0 = 56
            if (r6 == r0) goto L_0x016b
            r0 = 68
            if (r6 == r0) goto L_0x016b
            r0 = 93
            if (r6 == r0) goto L_0x016b
            X.1VX r2 = r3.A05
            r1 = 3158(0xc56, float:4.425E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            if (r0 == 0) goto L_0x0022
            r0 = 67
            if (r6 != r0) goto L_0x0022
        L_0x016b:
            X.33f r5 = r3.A04
            java.util.HashSet r3 = X.AnonymousClass002.A0K()
            r0 = 56
            if (r6 != r0) goto L_0x026b
            X.4FP r0 = r7.A0L
            if (r0 == 0) goto L_0x0285
            java.util.Collection r4 = r0.B4S()
        L_0x017d:
            java.util.HashSet r2 = X.AnonymousClass002.A0K()
            java.util.Iterator r9 = r4.iterator()
        L_0x0185:
            boolean r0 = r9.hasNext()
            r8 = 17
            if (r0 == 0) goto L_0x01a3
            X.34x r1 = X.C18300x5.A0T(r9)
            X.2sr r0 = r5.A02
            boolean r0 = X.C627636p.A0P(r0, r1)
            if (r0 != 0) goto L_0x0185
            int r0 = r1.A0D
            if (r0 == r8) goto L_0x0185
            long r0 = r1.A1L
            X.AnonymousClass0x2.A1Q(r2, r0)
            goto L_0x0185
        L_0x01a3:
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x024a
            int r0 = r2.size()
            java.lang.String[] r11 = new java.lang.String[r0]
            java.util.Iterator r10 = r2.iterator()
            r9 = 0
        L_0x01b4:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x01c5
            long r0 = X.C18270x1.A02(r10)
            int r2 = r9 + 1
            X.AnonymousClass0x2.A1S(r11, r9, r0)
            r9 = r2
            goto L_0x01b4
        L_0x01c5:
            java.util.HashSet r9 = X.AnonymousClass002.A0K()
            X.3dV r0 = r5.A0G
            X.4GK r13 = r0.get()
            r0 = 975(0x3cf, float:1.366E-42)
            X.3ct r10 = new X.3ct     // Catch:{ all -> 0x0a48 }
            r10.<init>(r11, r0)     // Catch:{ all -> 0x0a48 }
        L_0x01d6:
            boolean r0 = r10.hasNext()     // Catch:{ all -> 0x0a48 }
            if (r0 == 0) goto L_0x022b
            java.lang.String[] r11 = X.C71923ct.A01(r10)     // Catch:{ all -> 0x0a48 }
            int r12 = r11.length     // Catch:{ all -> 0x0a48 }
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0a48 }
            java.lang.String r0 = "SELECT _id FROM message_add_on WHERE "
            r2.append(r0)     // Catch:{ all -> 0x0a48 }
            java.lang.String r0 = "status = "
            r2.append(r0)     // Catch:{ all -> 0x0a48 }
            r2.append(r8)     // Catch:{ all -> 0x0a48 }
            java.lang.String r1 = " AND "
            r2.append(r1)     // Catch:{ all -> 0x0a48 }
            java.lang.String r0 = "from_me = 0"
            r2.append(r0)     // Catch:{ all -> 0x0a48 }
            r2.append(r1)     // Catch:{ all -> 0x0a48 }
            java.lang.String r0 = "_id IN "
            X.C57212tH.A02(r0, r2, r12)     // Catch:{ all -> 0x0a48 }
            r2.append(r1)     // Catch:{ all -> 0x0a48 }
            java.lang.String r0 = "(message_add_on.expiry_timestamp > ? OR IFNULL(message_add_on.expiry_timestamp,0) = 0)"
            java.lang.String r2 = X.AnonymousClass000.A0X(r0, r2)     // Catch:{ all -> 0x0a48 }
            r0 = r13
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0a48 }
            X.2sg r1 = r0.A03     // Catch:{ all -> 0x0a48 }
            java.lang.String r0 = "MessageAddOnStore/ensureMessageAddOnStatusesUpToDate"
            android.database.Cursor r2 = r1.A0E(r2, r0, r11)     // Catch:{ all -> 0x0a48 }
            int r1 = X.AnonymousClass0x7.A02(r2)     // Catch:{ all -> 0x0a3c }
        L_0x021d:
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0a3c }
            if (r0 == 0) goto L_0x0227
            X.C18260x0.A0H(r2, r9, r1)     // Catch:{ all -> 0x0a3c }
            goto L_0x021d
        L_0x0227:
            r2.close()     // Catch:{ all -> 0x0a48 }
            goto L_0x01d6
        L_0x022b:
            r13.close()
            java.util.Iterator r2 = r4.iterator()
        L_0x0232:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x024a
            X.34x r1 = X.C18300x5.A0T(r2)
            java.lang.Long r0 = X.C624134x.A0A(r1)
            boolean r0 = r9.contains(r0)
            if (r0 == 0) goto L_0x0232
            r1.A1G(r8)
            goto L_0x0232
        L_0x024a:
            java.util.Iterator r2 = r4.iterator()
        L_0x024e:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0285
            X.34x r1 = X.C18300x5.A0T(r2)
            X.2sr r0 = r5.A02
            boolean r0 = X.C627636p.A0P(r0, r1)
            if (r0 != 0) goto L_0x024e
            int r0 = r1.A0D
            if (r0 == r8) goto L_0x024e
            r3.add(r1)
            r1.A1G(r8)
            goto L_0x024e
        L_0x026b:
            r0 = 68
            if (r6 != r0) goto L_0x02b1
            X.1md r2 = r7.A1S
            if (r2 == 0) goto L_0x0285
            X.2z0 r0 = r2.A1J
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x0285
            int r1 = r2.A0D
            r0 = 17
            if (r1 == r0) goto L_0x0285
            r3.add(r2)
            r2.A1G(r0)
        L_0x0285:
            long r2 = r5.A04(r3)
            X.2z0 r0 = r7.A1J
            X.4uZ r4 = r0.A00
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x0022
            if (r4 == 0) goto L_0x0022
            java.util.List r1 = r5.A0Z
            java.lang.Byte r0 = java.lang.Byte.valueOf(r6)
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x02a4
            X.2sm r0 = r5.A07
            r0.A0L(r4, r2)
        L_0x02a4:
            X.2HP r0 = r5.A0a
            if (r0 == 0) goto L_0x0022
            X.2HP r0 = r5.A0a
            X.33b r1 = r0.A00
            r0 = 0
            r1.A09(r4, r0)
            return
        L_0x02b1:
            r0 = 67
            if (r6 != r0) goto L_0x0285
            boolean r0 = r7 instanceof X.C30451mT
            if (r0 == 0) goto L_0x0285
            r0 = r7
            X.1mT r0 = (X.C30451mT) r0
            java.util.List r4 = r0.A04
            if (r4 == 0) goto L_0x0285
            goto L_0x017d
        L_0x02c2:
            java.lang.Object r0 = r4.A01
            X.8Eq r0 = (X.C170818Eq) r0
            java.lang.Object r5 = r4.A02
            X.7PB r5 = (X.AnonymousClass7PB) r5
            int r3 = r4.A00
            X.5Y9 r0 = r0.A00
            java.util.List r0 = r0.A0P
            java.util.ArrayList r0 = X.AnonymousClass002.A0J(r0)
            java.util.Iterator r2 = r0.iterator()
        L_0x02d8:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0022
            java.lang.Object r1 = r2.next()
            X.8rA r1 = (X.C184048rA) r1
            java.lang.String r0 = r5.A04
            r1.BTH(r0, r3)
            goto L_0x02d8
        L_0x02ea:
            java.lang.Object r0 = r4.A01
            X.4IE r0 = (X.AnonymousClass4IE) r0
            java.lang.Object r6 = r4.A02
            X.2i6 r6 = (X.C50392i6) r6
            int r2 = r4.A00
            java.lang.Object r0 = r0.A00
            X.5XL r0 = (X.AnonymousClass5XL) r0
            X.7DD r1 = r0.A06
            if (r2 == 0) goto L_0x0303
            r0 = 1
            if (r2 == r0) goto L_0x0320
            r0 = 2
            if (r2 == r0) goto L_0x0320
            return
        L_0x0303:
            if (r6 == 0) goto L_0x0320
            com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentV2ViewModel r5 = r1.A00
            X.5ji r0 = r5.A04
            if (r0 == 0) goto L_0x0313
            long r3 = r0.A00
            long r1 = r6.A03
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0316
        L_0x0313:
            com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentV2ViewModel.A03(r5, r6)
        L_0x0316:
            int r0 = r5.A00
            int r0 = r0 + 1
            r5.A00 = r0
            com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentV2ViewModel.A02(r5)
            return
        L_0x0320:
            com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentV2ViewModel r0 = r1.A00
            X.5XL r1 = r0.A0L
            r1.A02()
            r0 = 1
            if (r2 != r0) goto L_0x0022
            r1.A01()
            return
        L_0x032e:
            java.lang.Object r0 = r4.A01
            android.content.Context r0 = (android.content.Context) r0
            java.lang.Object r3 = r4.A02
            X.5Xv r3 = (X.C106155Xv) r3
            int r2 = X.C627436k.A00(r0)
            if (r2 <= 0) goto L_0x0022
            android.content.SharedPreferences r0 = r3.A03()
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.String r0 = "end_call_tone_duration_ms"
            X.C18270x1.A0h(r1, r0, r2)
            java.lang.String r2 = "2.23.26.14"
            android.content.SharedPreferences r0 = r3.A03()
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.String r0 = "end_call_tone_duration_last_cached_app_version"
            android.content.SharedPreferences$Editor r0 = r1.putString(r0, r2)
            goto L_0x0b7d
        L_0x035b:
            java.lang.Object r6 = r4.A01
            X.3Ej r6 = (X.C64653Ej) r6
            int r5 = r4.A00
            java.lang.Object r4 = r4.A02
            X.1fJ r4 = (X.C27991fJ) r4
            X.33U r3 = r6.A06
            X.4Cd r0 = r6.A04
            int r2 = r0.B9t(r4)
            X.2sj r0 = r6.A0D
            int r0 = X.C56892sj.A00(r0, r4)
            long r0 = (long) r0
            r3.A06(r5, r0, r2)
            r0 = 3
            if (r5 == r0) goto L_0x038a
            r0 = 6
            if (r5 == r0) goto L_0x038a
            r0 = 5
            if (r5 == r0) goto L_0x038a
            r0 = 4
            if (r5 != r0) goto L_0x0022
            X.2so r1 = r6.A03
            r0 = 2
            r1.A06(r0)
            return
        L_0x038a:
            X.2so r2 = r6.A03
            X.1fJ r1 = r2.A01(r4)
            if (r1 == 0) goto L_0x0022
            r0 = 1
            r2.A08(r1, r0)
            return
        L_0x0397:
            java.lang.Object r5 = r4.A01
            X.34x r5 = (X.C624134x) r5
            java.lang.Object r2 = r4.A02
            X.1Q2 r2 = (X.AnonymousClass1Q2) r2
            int r4 = r4.A00
            X.39W r0 = X.AnonymousClass0x9.A0Y(r5)
            if (r0 == 0) goto L_0x03c8
            X.39P r0 = r0.A03
            if (r0 == 0) goto L_0x03c8
            java.util.List r1 = r0.A03
        L_0x03ad:
            X.3Lv r3 = r2.A01
            X.2z0 r0 = r5.A1J
            X.34x r2 = X.C55832qz.A00(r3, r0)
            if (r2 == 0) goto L_0x0022
            if (r1 == 0) goto L_0x0022
            java.lang.Object r1 = X.C73723fy.A06(r1, r4)
            X.395 r1 = (X.AnonymousClass395) r1
            if (r1 == 0) goto L_0x0022
            r0 = 1
            r1.A00 = r0
            r3.A0Y(r2)
            return
        L_0x03c8:
            r1 = 0
            goto L_0x03ad
        L_0x03ca:
            java.lang.Object r0 = r4.A01
            X.2f0 r0 = (X.C48502f0) r0
            int r2 = r4.A00
            java.lang.Object r1 = r4.A02
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            X.2Vx r0 = r0.A01
            java.util.HashMap r0 = r0.A00
            int r0 = r0.size()
            if (r0 != r2) goto L_0x0022
            r1.run()
            return
        L_0x03e2:
            java.lang.Object r0 = r4.A01
            X.2sA r0 = (X.C56542sA) r0
            java.lang.Object r1 = r4.A02
            com.whatsapp.jid.Jid r1 = (com.whatsapp.jid.Jid) r1
            int r3 = r4.A00
            X.8qC r0 = r0.A02
            X.2UO r0 = X.C18310x6.A0Q(r0)
            X.1R1 r2 = r0.A0S
            X.2sa r1 = X.AnonymousClass1R1.A00(r1, r2)
            int r0 = r1.A02
            if (r3 == r0) goto L_0x0022
            r1.A02 = r3
            r2.A0a(r1)
            return
        L_0x0402:
            java.lang.Object r3 = r4.A01
            X.3Lv r3 = (X.C66543Lv) r3
            java.lang.Object r6 = r4.A02
            X.34x r6 = (X.C624134x) r6
            int r4 = r4.A00
            X.2z0 r2 = r6.A1J
            boolean r0 = r2.A02
            if (r0 == 0) goto L_0x043d
            boolean r0 = r6.A1W
            if (r0 != 0) goto L_0x043d
            long r18 = android.os.SystemClock.uptimeMillis()
            X.36E r5 = r3.A0A
            r9 = 0
            int r15 = r6.A0B
            r7 = 0
            long r0 = r6.A1Q
            long r16 = r18 - r0
            long r0 = r6.A1b
            long r18 = r18 - r0
            r8 = 4
            r11 = r9
            r12 = r9
            r13 = r9
            r14 = r9
            r22 = r9
            r23 = r9
            r24 = r9
            r25 = r9
            r26 = r9
            r10 = r9
            r20 = r18
            r5.A0O(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r18, r20, r22, r23, r24, r25, r26)
        L_0x043d:
            X.2KS r0 = r3.A09(r6, r4)
            boolean r0 = r0.A00
            if (r0 == 0) goto L_0x0022
            X.1hw r0 = r3.A0a
            X.4uZ r2 = r2.A00
            java.util.Iterator r1 = X.C61102zi.A03(r0)
        L_0x044d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0022
            java.lang.Object r0 = r1.next()
            X.4FI r0 = (X.AnonymousClass4FI) r0
            r0.BQA(r2)
            goto L_0x044d
        L_0x045d:
            java.lang.Object r1 = r4.A01
            X.3Lv r1 = (X.C66543Lv) r1
            java.lang.Object r3 = r4.A02
            X.34x r3 = (X.C624134x) r3
            int r2 = r4.A00
            X.2qz r0 = r1.A2D
            boolean r0 = r0.A07(r3, r2)
            if (r0 == 0) goto L_0x0022
            X.2hU r0 = r1.A0q
            android.os.Handler r1 = r0.A02
            r0 = 2
            X.C18300x5.A16(r1, r3, r0, r2)
            return
        L_0x0478:
            java.lang.Object r5 = r4.A01
            X.3Mn r5 = (X.C66723Mn) r5
            java.lang.Object r1 = r4.A02
            X.3ZG r1 = (X.AnonymousClass3ZG) r1
            int r3 = r4.A00
            int r2 = r1.bufferChannel
            r0 = 1
            java.lang.Object r1 = r1.clone()
            X.3ZG r1 = (X.AnonymousClass3ZG) r1
            if (r2 != r0) goto L_0x0b81
            boolean r0 = r5.A0B()
            if (r0 == 0) goto L_0x0022
            X.2qN r0 = r5.A05
            r0.A02(r1, r3)
            X.2qN r1 = r5.A05
            r0 = 0
            r1.A03(r0)
            r5.A02()
            return
        L_0x04a2:
            java.lang.Object r3 = r4.A01
            X.3Mn r3 = (X.C66723Mn) r3
            java.lang.Object r0 = r4.A02
            X.3ZG r0 = (X.AnonymousClass3ZG) r0
            int r6 = r4.A00
            java.lang.Object r5 = r0.clone()
            X.3ZG r5 = (X.AnonymousClass3ZG) r5
            boolean r0 = r3.A0A()
            if (r0 == 0) goto L_0x0022
            boolean r0 = r3.A0S
            r8 = 1
            if (r0 == 0) goto L_0x0ba2
            boolean r0 = r3.A0Q
            if (r0 != 0) goto L_0x0b86
            X.33p r0 = r3.A0D
            android.content.SharedPreferences r1 = X.AnonymousClass0x2.A0F(r0)
            java.lang.String r0 = "private_stats_id"
            java.lang.String r2 = X.C18280x3.A0Z(r1, r0)
            X.2rP r1 = r3.A0H
            java.util.ArrayList r0 = X.C57302tQ.A00()
            r1.A06(r2, r0)
            r3.A0Q = r8
            goto L_0x0b86
        L_0x04db:
            java.lang.Object r0 = r4.A02
            com.google.android.gms.vision.clearcut.DynamiteClearcutLogger r0 = (com.google.android.gms.vision.clearcut.DynamiteClearcutLogger) r0
            com.google.android.gms.vision.clearcut.VisionClearcutLogger r2 = r0.zzc
            int r1 = r4.A00
            java.lang.Object r0 = r4.A01
            X.6Xd r0 = (X.C128706Xd) r0
            r2.zza(r1, r0)
            return
        L_0x04eb:
            java.lang.Object r3 = r4.A01
            com.google.android.material.bottomsheet.BottomSheetBehavior r3 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r3
            java.lang.Object r2 = r4.A02
            android.view.View r2 = (android.view.View) r2
            int r1 = r4.A00
            r0 = 0
            r3.A0Y(r2, r1, r0)
            return
        L_0x04fa:
            java.lang.Object r2 = r4.A01
            X.3Wi r2 = (X.C69263Wi) r2
            java.lang.Object r1 = r4.A02
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            int r0 = r4.A00
            r2.A0P(r1, r0)
            return
        L_0x0508:
            java.lang.Object r0 = r4.A01
            X.3Go r0 = (X.C65193Go) r0
            java.lang.Object r1 = r4.A02
            X.34x r1 = (X.C624134x) r1
            X.2q6 r0 = r0.A0U
            r0.A03(r1)
            return
        L_0x0516:
            java.lang.Object r6 = r4.A01
            X.33m r6 = (X.C621033m) r6
            int r1 = r4.A00
            java.lang.Object r5 = r4.A02
            X.34x r5 = (X.C624134x) r5
            X.2pR r4 = r6.A1L
            r3 = 2
            if (r1 == r3) goto L_0x0546
            r0 = 3
            if (r1 == r0) goto L_0x0531
            r0 = 4
            if (r1 == r0) goto L_0x0544
            r0 = 10
            r3 = 7
            if (r1 == r0) goto L_0x0531
            r3 = 0
        L_0x0531:
            byte r2 = r5.A1I
            int r1 = r5.A09
            r0 = 0
            int r1 = X.C106495Zf.A00(r2, r1, r0)
            X.2ZV r0 = r6.A0f
            X.2nt r0 = r0.A00(r5)
            r4.A03(r0, r3, r1)
            return
        L_0x0544:
            r3 = 3
            goto L_0x0531
        L_0x0546:
            r3 = 1
            goto L_0x0531
        L_0x0548:
            java.lang.Object r3 = r4.A01
            com.whatsapp.accountswitching.secondaryprocess.AccountSwitchingActivity r3 = (com.whatsapp.accountswitching.secondaryprocess.AccountSwitchingActivity) r3
            int r6 = r4.A00
            java.lang.Object r4 = r4.A02
            android.content.ContentResolver r1 = r3.getContentResolver()
            java.lang.String r0 = "com.whatsapp.accountswitching.AccountSwitchingContentProvider"
            android.content.ContentProviderClient r2 = r1.acquireUnstableContentProviderClient(r0)
            if (r2 == 0) goto L_0x0600
            r5 = 0
            r0 = 1
            if (r6 == r0) goto L_0x05c2
            r0 = 2
            if (r6 == r0) goto L_0x05a5
            r0 = 3
            if (r6 == r0) goto L_0x0586
            r0 = 4
            if (r6 != r0) goto L_0x057f
            android.content.Intent r0 = r3.getIntent()     // Catch:{ RemoteException -> 0x05c7, IllegalStateException -> 0x05dd, all -> 0x05fb }
            java.lang.String r1 = "remove_account_lid"
            java.lang.String r0 = r0.getStringExtra(r1)     // Catch:{ RemoteException -> 0x05c7, IllegalStateException -> 0x05dd, all -> 0x05fb }
            android.os.Bundle r1 = X.AnonymousClass0x7.A0F(r1, r0)     // Catch:{ RemoteException -> 0x05c7, IllegalStateException -> 0x05dd, all -> 0x05fb }
            java.lang.String r0 = "remove_account"
            r2.call(r0, r5, r1)     // Catch:{ RemoteException -> 0x05c7, IllegalStateException -> 0x05dd, all -> 0x05fb }
            goto L_0x05c7
        L_0x057f:
            java.lang.String r0 = "AccountSwitchingActivity/one of the flags should be set"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)     // Catch:{ RemoteException -> 0x05c7, IllegalStateException -> 0x05dd, all -> 0x05fb }
            goto L_0x05c1
        L_0x0586:
            android.content.Intent r0 = r3.getIntent()     // Catch:{ RemoteException -> 0x05c7, IllegalStateException -> 0x05dd, all -> 0x05fb }
            java.lang.String r6 = "switch_to_account_lid"
            java.lang.String r1 = r0.getStringExtra(r6)     // Catch:{ RemoteException -> 0x05c7, IllegalStateException -> 0x05dd, all -> 0x05fb }
            if (r1 == 0) goto L_0x05a3
            int r0 = r1.length()     // Catch:{ RemoteException -> 0x05c7, IllegalStateException -> 0x05dd, all -> 0x05fb }
            if (r0 == 0) goto L_0x05a3
            android.os.Bundle r1 = X.AnonymousClass0x7.A0F(r6, r1)     // Catch:{ RemoteException -> 0x05c7, IllegalStateException -> 0x05dd, all -> 0x05fb }
        L_0x059d:
            java.lang.String r0 = "abandon_add_account"
            r2.call(r0, r5, r1)     // Catch:{ RemoteException -> 0x05c7, IllegalStateException -> 0x05dd, all -> 0x05fb }
            goto L_0x05c7
        L_0x05a3:
            r1 = r5
            goto L_0x059d
        L_0x05a5:
            android.content.Intent r0 = r3.getIntent()     // Catch:{ RemoteException -> 0x05c7, IllegalStateException -> 0x05dd, all -> 0x05fb }
            java.lang.String r1 = "switch_to_account_lid"
            java.lang.String r0 = r0.getStringExtra(r1)     // Catch:{ RemoteException -> 0x05c7, IllegalStateException -> 0x05dd, all -> 0x05fb }
            if (r0 == 0) goto L_0x05bd
            android.os.Bundle r1 = X.AnonymousClass0x7.A0F(r1, r0)     // Catch:{ RemoteException -> 0x05c7, IllegalStateException -> 0x05dd, all -> 0x05fb }
            java.lang.String r0 = "switch_account"
            r2.call(r0, r5, r1)     // Catch:{ RemoteException -> 0x05c7, IllegalStateException -> 0x05dd, all -> 0x05fb }
            goto L_0x05c7
        L_0x05bd:
            java.lang.IllegalStateException r0 = X.C18290x4.A0Y()     // Catch:{ RemoteException -> 0x05c7, IllegalStateException -> 0x05dd, all -> 0x05fb }
        L_0x05c1:
            throw r0     // Catch:{ RemoteException -> 0x05c7, IllegalStateException -> 0x05dd, all -> 0x05fb }
        L_0x05c2:
            java.lang.String r0 = "add_account"
            r2.call(r0, r5, r5)     // Catch:{ RemoteException -> 0x05c7, IllegalStateException -> 0x05dd, all -> 0x05fb }
        L_0x05c7:
            com.whatsapp.accountswitching.secondaryprocess.AccountSwitchingActivity.A0C(r2)
            java.lang.String r1 = "account_switching"
            r0 = 0
            java.io.File r1 = r3.getDir(r1, r0)
            java.lang.String r0 = "checkpoint"
            boolean r0 = X.C18300x5.A1V(r1, r0)
            r0 = r0 ^ 1
            r3.A5q(r0)
            return
        L_0x05dd:
            java.lang.String r0 = "kill_process"
            r2.call(r0, r5, r5)     // Catch:{ RemoteException -> 0x05e2, all -> 0x05fb }
        L_0x05e2:
            com.whatsapp.accountswitching.secondaryprocess.AccountSwitchingActivity.A0C(r2)
            android.os.Handler r2 = r3.A00
            if (r2 != 0) goto L_0x05f0
            java.lang.String r0 = "mainThreadHandler"
            java.lang.RuntimeException r1 = X.C18270x1.A0S(r0)
            throw r1
        L_0x05f0:
            r1 = 11
            X.5rU r0 = new X.5rU
            r0.<init>(r3, r1, r4)
            r2.post(r0)
            return
        L_0x05fb:
            r0 = move-exception
            com.whatsapp.accountswitching.secondaryprocess.AccountSwitchingActivity.A0C(r2)
            throw r0
        L_0x0600:
            java.lang.IllegalStateException r1 = X.C18290x4.A0Y()
            throw r1
        L_0x0605:
            java.lang.Object r6 = r4.A01
            int r5 = r4.A00
            java.lang.Object r3 = r4.A02
            java.util.concurrent.ExecutorService r2 = java.util.concurrent.Executors.newSingleThreadExecutor()
            r1 = 8
            X.3ca r0 = new X.3ca
            r0.<init>((java.lang.Object) r3, (java.lang.Object) r6, (int) r5, (int) r1)
            r2.execute(r0)
            return
        L_0x061a:
            java.lang.Object r1 = r4.A01
            X.2hZ r1 = (X.C50062hZ) r1
            java.lang.Object r2 = r4.A02
            X.34x r2 = (X.C624134x) r2
            r3 = 0
            r4 = 56
            X.3N0 r0 = r1.A01
            boolean r5 = r0.A01(r2, r4)
            r6 = 0
            r1.A01(r2, r3, r4, r5, r6)
            return
        L_0x0630:
            java.lang.Object r3 = r4.A01
            X.7Cd r3 = (X.C146927Cd) r3
            int r2 = r4.A00
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Failed to load promotions with errorCode="
            X.C18260x0.A0x(r0, r1, r2)
            X.5Ox r3 = r3.A00
            X.4FS r2 = r3.A09
            r1 = 16
            X.5rP r0 = new X.5rP
            r0.<init>(r3, r1)
            r2.BkM(r0)
            return
        L_0x064e:
            java.lang.Object r0 = r4.A01
            X.93I r0 = (X.AnonymousClass93I) r0
            java.lang.Object r2 = r4.A02
            X.7n8 r2 = (X.C160157n8) r2
            int r1 = r4.A00
            java.lang.Object r0 = r0.A00
            X.5Y9 r0 = (X.AnonymousClass5Y9) r0
            java.util.Map r0 = r0.A0R
            java.lang.Object r0 = r0.remove(r2)
            X.8r9 r0 = (X.C184038r9) r0
            if (r0 != 0) goto L_0x066c
            java.lang.String r0 = "The response handler must not be null"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x066c:
            r0.BTF(r2, r1)
            return
        L_0x0670:
            java.lang.Object r0 = r4.A01
            X.5pi r0 = (X.C116085pi) r0
            int r2 = r4.A00
            java.lang.Object r1 = r4.A02
            com.whatsapp.voipcalling.CallInfo r1 = (com.whatsapp.voipcalling.CallInfo) r1
            X.5b3 r0 = r0.A0C
            r0.A0c(r1, r2)
            return
        L_0x0680:
            java.lang.Object r2 = r4.A01
            X.5b3 r2 = (X.C107285b3) r2
            int r1 = r4.A00
            java.lang.Object r0 = r4.A02
            java.util.List r0 = (java.util.List) r0
            X.C107285b3.A04(r2, r0, r1)
            return
        L_0x068e:
            java.lang.Object r6 = r4.A01
            X.3Ej r6 = (X.C64653Ej) r6
            int r5 = r4.A00
            java.lang.Object r1 = r4.A02
            X.1fJ r1 = (X.C27991fJ) r1
            X.33U r3 = r6.A06
            X.4Cd r0 = r6.A04
            int r2 = r0.B9t(r1)
            X.2sj r0 = r6.A0D
            int r0 = X.C56892sj.A00(r0, r1)
            long r0 = (long) r0
            r3.A05(r5, r0, r2)
            return
        L_0x06ab:
            java.lang.Object r1 = r4.A01
            X.12i r1 = (X.C197312i) r1
            java.lang.Object r0 = r4.A02
            X.2lD r0 = (X.C52272lD) r0
            int r2 = r4.A00
            X.2so r1 = r1.A06
            com.whatsapp.jid.GroupJid r0 = r0.A01
            r1.A08(r0, r2)
            return
        L_0x06bd:
            java.lang.Object r0 = r4.A01
            X.3Cp r0 = (X.C64213Cp) r0
            java.lang.Object r1 = r4.A02
            java.util.List r1 = (java.util.List) r1
            int r3 = r4.A00
            X.2gy r2 = r0.A00
            r0 = 0
            com.whatsapp.jid.UserJid[] r0 = new com.whatsapp.jid.UserJid[r0]
            java.lang.Object[] r1 = r1.toArray(r0)
            com.whatsapp.jid.UserJid[] r1 = (com.whatsapp.jid.UserJid[]) r1
            com.whatsapp.jobqueue.job.SyncDevicesJob r0 = new com.whatsapp.jobqueue.job.SyncDevicesJob
            r0.<init>(r1, r3)
            r2.A02(r0)
            return
        L_0x06db:
            java.lang.Object r1 = r4.A01
            X.5mB r1 = (X.C113905mB) r1
            java.lang.Object r0 = r4.A02
            com.whatsapp.jid.Jid r0 = (com.whatsapp.jid.Jid) r0
            int r3 = r4.A00
            r1.A02()
            android.content.SharedPreferences r1 = r1.A01()
            java.lang.String r2 = r0.getRawString()
            java.lang.String r0 = "0,0,0,0,0,0,0,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,0,0,0,0,0,0,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null"
            java.lang.String r0 = r1.getString(r2, r0)
            X.5XM r0 = X.AnonymousClass5XM.A00(r0)
            r0.A01(r3)
            android.content.SharedPreferences$Editor r1 = r1.edit()
            java.lang.String r0 = r0.toString()
            X.C18270x1.A0j(r1, r2, r0)
            return
        L_0x0709:
            java.lang.Object r2 = r4.A01
            X.5mB r2 = (X.C113905mB) r2
            java.lang.Object r0 = r4.A02
            com.whatsapp.jid.Jid r0 = (com.whatsapp.jid.Jid) r0
            int r1 = r4.A00
            r2.A02()
            android.content.SharedPreferences r5 = r2.A01()
            java.lang.String r4 = r0.getRawString()
            java.lang.String r0 = "0,0,0,0,0,0,0,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,0,0,0,0,0,0,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null"
            java.lang.String r0 = r5.getString(r4, r0)
            X.5XM r3 = X.AnonymousClass5XM.A00(r0)
            java.lang.Long r2 = r3.A0q
            long r0 = (long) r1
            java.lang.Long r0 = X.C624334z.A03(r2, r0)
            r3.A0q = r0
            android.content.SharedPreferences$Editor r1 = r5.edit()
            java.lang.String r0 = r3.toString()
            X.C18270x1.A0j(r1, r4, r0)
            return
        L_0x073d:
            java.lang.Object r0 = r4.A01
            X.1QE r0 = (X.AnonymousClass1QE) r0
            java.lang.Object r3 = r4.A02
            X.34x r3 = (X.C624134x) r3
            int r2 = r4.A00
            X.2p9 r1 = r0.A00
            r0 = 2
            r1.A01(r3, r0, r2)
            return
        L_0x074e:
            java.lang.Object r1 = r4.A01
            X.1QG r1 = (X.AnonymousClass1QG) r1
            java.lang.Object r3 = r4.A02
            X.34x r3 = (X.C624134x) r3
            int r0 = r4.A00
            X.2Yd r2 = r1.A03
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 2
            r2.A00(r3, r1, r0)
            return
        L_0x0763:
            java.lang.Object r1 = r4.A01
            X.1QI r1 = (X.AnonymousClass1QI) r1
            java.lang.Object r3 = r4.A02
            X.34x r3 = (X.C624134x) r3
            int r0 = r4.A00
            r2 = 1
            X.2Yd r1 = r1.A05
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A00(r3, r0, r2)
            return
        L_0x0778:
            java.lang.Object r6 = r4.A01
            X.4VB r6 = (X.AnonymousClass4VB) r6
            java.lang.Object r5 = r4.A02
            com.whatsapp.jid.UserJid r5 = (com.whatsapp.jid.UserJid) r5
            int r11 = r4.A00
            X.3Ex r0 = r6.A0A
            X.3ZH r9 = r0.A07(r5)
            if (r9 != 0) goto L_0x08e4
            r2 = 0
        L_0x078b:
            X.2Qz r11 = r6.A0C
            X.1VX r3 = r11.A03
            X.2vE r1 = X.C58422vE.A01
            r0 = 3261(0xcbd, float:4.57E-42)
            boolean r0 = r3.A0Y(r1, r0)
            if (r0 == 0) goto L_0x092b
            r8 = 0
            X.3Ex r0 = r11.A00
            X.3ZH r4 = r0.A07(r5)
            if (r4 == 0) goto L_0x08cb
            java.lang.String r1 = r4.A0J()
            r10 = 0
            if (r1 == 0) goto L_0x08dc
            java.lang.String r0 = r4.A0R
            if (r0 == 0) goto L_0x08dc
            boolean r0 = X.C175728Zm.A0S(r1, r0, r10)
            if (r0 == 0) goto L_0x08dc
            java.lang.String r9 = r4.A0R
        L_0x07b5:
            java.lang.String r0 = r4.A0Q
            if (r0 == 0) goto L_0x08e1
            boolean r0 = X.C175728Zm.A0S(r1, r0, r10)
            if (r0 == 0) goto L_0x08e1
            java.lang.String r3 = r4.A0Q
        L_0x07c1:
            X.5ZU r0 = r11.A01
            java.lang.String r1 = r0.A0O(r4)
            X.2lG r7 = new X.2lG
            r7.<init>(r9, r3, r1)
            java.util.HashMap r4 = r11.A04
            boolean r0 = r4.containsKey(r7)
            if (r0 != 0) goto L_0x08c7
            X.32b r13 = r11.A02
            java.lang.String r11 = A00(r13, r9)
            java.lang.String r9 = A00(r13, r3)
            java.lang.String r3 = A00(r13, r1)
            boolean r0 = android.text.TextUtils.isEmpty(r11)
            r17 = 1
            if (r0 != 0) goto L_0x07f3
            java.util.regex.Pattern r0 = X.C617432b.A0C
            boolean r0 = X.C18280x3.A1X(r11, r0)
            r14 = 1
            if (r0 == 0) goto L_0x07f4
        L_0x07f3:
            r14 = 0
        L_0x07f4:
            if (r11 == 0) goto L_0x07ff
            java.util.List r0 = X.C617432b.A02
            boolean r0 = X.C617432b.A00(r11, r0)
            r1 = 1
            if (r0 != 0) goto L_0x0800
        L_0x07ff:
            r1 = 0
        L_0x0800:
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 != 0) goto L_0x0809
            r12 = 1
            if (r1 == 0) goto L_0x080a
        L_0x0809:
            r12 = 0
        L_0x080a:
            boolean r0 = android.text.TextUtils.isEmpty(r11)
            if (r0 != 0) goto L_0x081b
            java.util.regex.Pattern r0 = X.C617432b.A0C
            boolean r0 = X.C18280x3.A1X(r11, r0)
            if (r0 == 0) goto L_0x081b
            if (r12 != 0) goto L_0x081b
            r14 = 1
        L_0x081b:
            if (r11 == 0) goto L_0x082c
            boolean r0 = r11.isEmpty()
            if (r0 == 0) goto L_0x082c
            if (r9 == 0) goto L_0x082c
            boolean r0 = r9.isEmpty()
            r1 = 1
            if (r0 != 0) goto L_0x082d
        L_0x082c:
            r1 = 0
        L_0x082d:
            if (r14 != 0) goto L_0x083b
            if (r12 != 0) goto L_0x083b
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L_0x083b
            r16 = 1
            if (r1 == 0) goto L_0x083d
        L_0x083b:
            r16 = 0
        L_0x083d:
            r0 = 3
            boolean[] r1 = new boolean[r0]
            r1[r10] = r14
            r1[r17] = r12
            r0 = 2
            r1[r0] = r16
            boolean r0 = r1[r10]
            boolean r15 = r1[r17]
            r12 = 2
            if (r0 == 0) goto L_0x0851
            r1 = 1
            if (r15 == 0) goto L_0x0852
        L_0x0851:
            r1 = 0
        L_0x0852:
            r14 = 0
            if (r0 == 0) goto L_0x08da
            boolean r0 = android.text.TextUtils.isEmpty(r11)
            if (r0 != 0) goto L_0x08da
            java.lang.String r11 = r13.A01(r11, r1)
        L_0x085f:
            if (r15 == 0) goto L_0x08d8
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 != 0) goto L_0x08d8
            java.lang.String r9 = r13.A01(r9, r10)
        L_0x086b:
            if (r16 == 0) goto L_0x0878
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L_0x0878
            java.lang.String r11 = r13.A01(r3, r1)
            r9 = r8
        L_0x0878:
            boolean r0 = android.text.TextUtils.isEmpty(r11)
            if (r0 != 0) goto L_0x08d6
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 != 0) goto L_0x08d6
            java.util.List r0 = X.C617432b.A01
            java.util.Iterator r3 = r0.iterator()
        L_0x088a:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x08a2
            java.lang.Object r1 = r3.next()
            java.util.regex.Pattern r1 = (java.util.regex.Pattern) r1
            boolean r0 = X.C18280x3.A1X(r11, r1)
            if (r0 == 0) goto L_0x088a
            boolean r0 = X.C18280x3.A1X(r9, r1)
            if (r0 != 0) goto L_0x08d6
        L_0x08a2:
            java.lang.String[] r3 = new java.lang.String[r12]
            r3[r10] = r11
            r3[r17] = r14
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            r0 = r3[r10]
            if (r0 == 0) goto L_0x08b3
            r1.append(r0)
        L_0x08b3:
            r0 = r3[r17]
            if (r0 == 0) goto L_0x08ba
            r1.append(r0)
        L_0x08ba:
            int r0 = r1.length()
            if (r0 <= 0) goto L_0x08c4
            java.lang.String r8 = r1.toString()
        L_0x08c4:
            r4.put(r7, r8)
        L_0x08c7:
            java.lang.String r8 = X.C18320x8.A0e(r7, r4)
        L_0x08cb:
            X.08J r1 = r6.A01
            X.7Kh r0 = new X.7Kh
            r0.<init>(r2, r5, r8)
            r1.A0G(r0)
            return
        L_0x08d6:
            r14 = r9
            goto L_0x08a2
        L_0x08d8:
            r9 = r8
            goto L_0x086b
        L_0x08da:
            r11 = r8
            goto L_0x085f
        L_0x08dc:
            r9 = r8
            if (r1 == 0) goto L_0x08e1
            goto L_0x07b5
        L_0x08e1:
            r3 = r8
            goto L_0x07c1
        L_0x08e4:
            X.1VX r2 = r6.A0E
            r0 = 3573(0xdf5, float:5.007E-42)
            boolean r14 = X.C56952sp.A0J(r2, r0)
            r1 = 3798(0xed6, float:5.322E-42)
            X.2vE r0 = X.C58422vE.A02
            int r0 = r2.A0O(r0, r1)
            long r2 = X.AnonymousClass0x7.A0D(r0)
            r0 = 604800000(0x240c8400, double:2.988109026E-315)
            long r12 = java.lang.Math.max(r0, r2)
            X.30g r7 = r6.A0B
            X.2oU r0 = r6.A0D
            android.content.Context r8 = r0.A00
            r10 = 0
            X.2ro r0 = r7.A03
            java.lang.String r1 = r9.A0M(r10, r11)
            X.30B r3 = r0.A02
            X.1sU r0 = r3.A01()
            java.lang.Object r2 = r0.A06(r1)
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
            if (r2 != 0) goto L_0x092b
            android.graphics.Bitmap r2 = r7.A02(r8, r9, r10, r11, r12, r14)
            if (r2 == 0) goto L_0x078b
            java.lang.String r1 = r9.A0M(r10, r11)
            X.1sU r0 = r3.A01()
            r0.A09(r1, r2)
        L_0x092b:
            r8 = 0
            goto L_0x08cb
        L_0x092d:
            java.lang.Object r6 = r4.A01
            X.5g7 r6 = (X.C110365g7) r6
            java.lang.Object r0 = r4.A02
            java.util.Set r0 = (java.util.Set) r0
            int r5 = r4.A00
            java.util.Iterator r4 = r0.iterator()
        L_0x093b:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0953
            X.4uZ r3 = X.C18300x5.A0P(r4)
            com.whatsapp.conversationslist.ConversationsFragment r0 = r6.A0N
            X.5XH r2 = r0.A1X
            X.2sH r0 = r0.A1i
            long r0 = r0.A0H()
            r2.A01(r3, r0)
            goto L_0x093b
        L_0x0953:
            com.whatsapp.conversationslist.ConversationsFragment r0 = r6.A0N
            X.3Wi r2 = r0.A0i
            r0 = 1
            r1 = 2131892583(0x7f121967, float:1.9419918E38)
            if (r5 != r0) goto L_0x0960
            r1 = 2131892584(0x7f121968, float:1.941992E38)
        L_0x0960:
            r0 = 0
            r2.A0I(r1, r0)
            return
        L_0x0965:
            int r0 = r4.A00
            if (r0 <= 0) goto L_0x096f
            java.lang.Object r0 = r4.A01
        L_0x096b:
            X.AnonymousClass0x9.A1K(r0)
            return
        L_0x096f:
            java.lang.Object r0 = r4.A02
            goto L_0x096b
        L_0x0972:
            java.lang.Object r0 = r4.A01
            X.3Lv r0 = (X.C66543Lv) r0
            java.lang.Object r2 = r4.A02
            X.34x r2 = (X.C624134x) r2
            int r1 = r4.A00
            X.1io r0 = r0.A14
            r0.A0B(r2, r1)
            return
        L_0x0982:
            java.lang.Object r0 = r4.A01
            X.3Lv r0 = (X.C66543Lv) r0
            java.lang.Object r6 = r4.A02
            X.34x r6 = (X.C624134x) r6
            int r7 = r4.A00
            X.2wf r1 = r0.A1S
            X.3dV r0 = r1.A00
            X.4Fq r3 = r0.A04()
            X.3Yo r11 = r3.Axl()     // Catch:{ all -> 0x09f4 }
            long r4 = r6.A1L     // Catch:{ all -> 0x09ea }
            X.2rO r10 = r1.A01     // Catch:{ all -> 0x09ea }
            java.lang.String r2 = "send_count_ready"
            r0 = 0
            long r8 = r10.A00(r2, r0)     // Catch:{ all -> 0x09ea }
            r1 = 1
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x09b8
            java.lang.String r2 = "migration_message_send_count_index"
            r0 = 0
            long r1 = r10.A00(r2, r0)     // Catch:{ all -> 0x09ea }
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x09e0
        L_0x09b8:
            X.C59282wf.A00(r6)     // Catch:{ all -> 0x09ea }
            android.content.ContentValues r5 = X.AnonymousClass0x9.A06()     // Catch:{ all -> 0x09ea }
            X.C624134x.A0H(r5, r6)     // Catch:{ all -> 0x09ea }
            java.lang.String r0 = "send_count"
            X.2sg r4 = X.AnonymousClass3H0.A01(r5, r3, r0, r7)     // Catch:{ all -> 0x09ea }
            java.lang.String r2 = "message_send_count"
            r1 = 5
            java.lang.String r0 = "INSERT_MESSAGE_SEND_COUNT_SQL"
            long r4 = r4.A0C(r2, r0, r5, r1)     // Catch:{ all -> 0x09ea }
            long r1 = r6.A1L     // Catch:{ all -> 0x09ea }
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            boolean r1 = X.AnonymousClass000.A1T(r0)
            java.lang.String r0 = "SendCountMessageStore/insertOrUpdateSendCount/inserted row should have same row_id"
            X.C626936e.A0F(r1, r0)     // Catch:{ all -> 0x09ea }
        L_0x09e0:
            r11.A00()     // Catch:{ all -> 0x09ea }
            r11.close()     // Catch:{ all -> 0x09f4 }
            r3.close()
            return
        L_0x09ea:
            r1 = move-exception
            r11.close()     // Catch:{ all -> 0x09ef }
            goto L_0x09f3
        L_0x09ef:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x09f4 }
        L_0x09f3:
            throw r1     // Catch:{ all -> 0x09f4 }
        L_0x09f4:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x0a4d }
            throw r1
        L_0x09f9:
            java.lang.Object r2 = r4.A01
            X.3Lv r2 = (X.C66543Lv) r2
            java.lang.Object r1 = r4.A02
            java.util.Collection r1 = (java.util.Collection) r1
            int r0 = r4.A00
            r2.A0l(r1, r0)
            return
        L_0x0a07:
            java.lang.Object r2 = r4.A01
            X.2hU r2 = (X.C50012hU) r2
            java.lang.Object r1 = r4.A02
            X.34x r1 = (X.C624134x) r1
            int r0 = r4.A00
            r2.A01(r1, r0)
            return
        L_0x0a15:
            java.lang.Object r3 = r4.A01
            X.33m r3 = (X.C621033m) r3
            java.lang.Object r2 = r4.A02
            X.34x r2 = (X.C624134x) r2
            int r1 = r4.A00
            r0 = 0
            r3.A0R(r2, r1, r0, r0)
            return
        L_0x0a24:
            java.lang.Object r8 = r4.A01
            X.7oN r8 = (X.C160827oN) r8
            java.lang.Object r7 = r4.A02
            X.7o1 r7 = (X.C160627o1) r7
            int r6 = r4.A00
            r5 = 0
            r3 = 987(0x3db, double:4.876E-321)
            r1 = 1
            X.2pM r0 = new X.2pM
            r0.<init>(r1, r3)
            r8.A0B(r7, r0, r5, r6)
            return
        L_0x0a3c:
            r1 = move-exception
            if (r2 == 0) goto L_0x0a47
            r2.close()     // Catch:{ all -> 0x0a43 }
            goto L_0x0a47
        L_0x0a43:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0a48 }
        L_0x0a47:
            throw r1     // Catch:{ all -> 0x0a48 }
        L_0x0a48:
            r1 = move-exception
            r13.close()     // Catch:{ all -> 0x0a4d }
            throw r1
        L_0x0a4d:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x0a52:
            java.lang.Object r2 = r4.A01
            X.5mB r2 = (X.C113905mB) r2
            java.lang.Object r1 = r4.A02
            com.whatsapp.jid.Jid r1 = (com.whatsapp.jid.Jid) r1
            int r0 = r4.A00
            r17 = r0
            r2.A02()
            android.content.SharedPreferences r16 = r2.A01()
            java.lang.String r14 = r1.getRawString()
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0l(r14)
            java.lang.String r13 = "_notification"
            java.lang.String r2 = X.AnonymousClass000.A0X(r13, r0)
            java.lang.String r1 = "null,null,null,null,null,null,null,null,null,null,null"
            r0 = r16
            java.lang.String r0 = r0.getString(r2, r1)
            java.lang.String r15 = ","
            java.lang.String[] r1 = r0.split(r15)
            r0 = 0
            java.lang.Long r12 = X.C624334z.A04(r1, r0)
            r0 = 1
            java.lang.Long r11 = X.C624334z.A04(r1, r0)
            r0 = 2
            java.lang.Long r10 = X.C624334z.A04(r1, r0)
            r0 = 3
            java.lang.Long r9 = X.C624334z.A04(r1, r0)
            r0 = 4
            java.lang.Long r8 = X.C624334z.A04(r1, r0)
            r0 = 5
            java.lang.Long r7 = X.C624334z.A04(r1, r0)
            r0 = 6
            java.lang.Long r6 = X.C624334z.A04(r1, r0)
            r0 = 7
            java.lang.Long r5 = X.C624334z.A04(r1, r0)
            r0 = 8
            java.lang.Long r4 = X.C624334z.A04(r1, r0)
            r0 = 9
            java.lang.Long r3 = X.C624334z.A04(r1, r0)
            r0 = 10
            java.lang.Long r2 = X.C624334z.A04(r1, r0)
            r0 = 1
            switch(r17) {
                case 0: goto L_0x0b16;
                case 1: goto L_0x0b11;
                case 2: goto L_0x0b0c;
                case 3: goto L_0x0b07;
                case 4: goto L_0x0b02;
                case 5: goto L_0x0afd;
                case 6: goto L_0x0af8;
                case 7: goto L_0x0af3;
                case 8: goto L_0x0ac5;
                case 9: goto L_0x0aee;
                default: goto L_0x0ac1;
            }
        L_0x0ac1:
            java.lang.Long r2 = X.C624334z.A03(r2, r0)
        L_0x0ac5:
            android.content.SharedPreferences$Editor r1 = r16.edit()
            java.lang.String r13 = X.AnonymousClass000.A0T(r14, r13)
            r0 = 11
            java.lang.Long[] r14 = new java.lang.Long[r0]
            r0 = 0
            r14[r0] = r12
            X.AnonymousClass000.A11(r11, r10, r9, r8, r14)
            X.AnonymousClass000.A12(r7, r6, r5, r4, r14)
            r0 = 9
            r14[r0] = r3
            r0 = 10
            java.util.List r0 = X.AnonymousClass0x9.A1A(r2, r14, r0)
            java.lang.String r0 = android.text.TextUtils.join(r15, r0)
            android.content.SharedPreferences$Editor r0 = r1.putString(r13, r0)
            goto L_0x0b7d
        L_0x0aee:
            java.lang.Long r3 = X.C624334z.A03(r3, r0)
            goto L_0x0ac5
        L_0x0af3:
            java.lang.Long r5 = X.C624334z.A03(r5, r0)
            goto L_0x0ac5
        L_0x0af8:
            java.lang.Long r6 = X.C624334z.A03(r6, r0)
            goto L_0x0ac5
        L_0x0afd:
            java.lang.Long r7 = X.C624334z.A03(r7, r0)
            goto L_0x0ac5
        L_0x0b02:
            java.lang.Long r8 = X.C624334z.A03(r8, r0)
            goto L_0x0ac5
        L_0x0b07:
            java.lang.Long r9 = X.C624334z.A03(r9, r0)
            goto L_0x0ac5
        L_0x0b0c:
            java.lang.Long r10 = X.C624334z.A03(r10, r0)
            goto L_0x0ac5
        L_0x0b11:
            java.lang.Long r11 = X.C624334z.A03(r11, r0)
            goto L_0x0ac5
        L_0x0b16:
            java.lang.Long r12 = X.C624334z.A03(r12, r0)
            goto L_0x0ac5
        L_0x0b1b:
            java.lang.Object r0 = r4.A01
            X.5mB r0 = (X.C113905mB) r0
            java.lang.Object r10 = r4.A02
            com.whatsapp.jid.Jid r10 = (com.whatsapp.jid.Jid) r10
            r0.A02()
            android.content.SharedPreferences r11 = r0.A01()
            java.lang.String r0 = r10.getRawString()
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0l(r0)
            java.lang.String r9 = "_businessTools"
            java.lang.String r1 = X.AnonymousClass000.A0X(r9, r0)
            java.lang.String r0 = "null,null,null,null"
            java.lang.String r0 = r11.getString(r1, r0)
            java.lang.String r7 = ","
            java.lang.String[] r1 = r0.split(r7)
            r0 = 0
            java.lang.Long r8 = X.C624334z.A04(r1, r0)
            r0 = 1
            java.lang.Long r6 = X.C624334z.A04(r1, r0)
            r0 = 2
            java.lang.Long r5 = X.C624334z.A04(r1, r0)
            r4 = 3
            java.lang.Long r2 = X.C624334z.A04(r1, r4)
            r0 = 1
            long r0 = (long) r0
            java.lang.Long r3 = X.C624334z.A03(r2, r0)
            android.content.SharedPreferences$Editor r2 = r11.edit()
            java.lang.String r0 = r10.getRawString()
            java.lang.String r1 = X.AnonymousClass000.A0T(r0, r9)
            r0 = 4
            java.lang.Long[] r0 = new java.lang.Long[r0]
            X.C18260x0.A0i(r8, r6, r5, r0)
            java.util.List r0 = X.AnonymousClass0x9.A1A(r3, r0, r4)
            java.lang.String r0 = android.text.TextUtils.join(r7, r0)
            android.content.SharedPreferences$Editor r0 = r2.putString(r1, r0)
        L_0x0b7d:
            r0.apply()
            return
        L_0x0b81:
            r0 = 0
            r5.A04(r1, r3, r0)
            return
        L_0x0b86:
            X.3Mk r4 = r3.A0I     // Catch:{ IllegalArgumentException -> 0x0b9c }
            X.2rP r1 = r3.A0H     // Catch:{ IllegalArgumentException -> 0x0b9c }
            int r0 = r5.psId     // Catch:{ IllegalArgumentException -> 0x0b9c }
            java.lang.String r2 = r1.A02(r0)     // Catch:{ IllegalArgumentException -> 0x0b9c }
            r0 = 0
            X.C162457s7.A0J(r4, r0)     // Catch:{ IllegalArgumentException -> 0x0b9c }
            r1 = 6005(0x1775, float:8.415E-42)
            r0 = 2
            r4.Blk(r2, r1, r0)     // Catch:{ IllegalArgumentException -> 0x0b9c }
            goto L_0x0c66
        L_0x0b9c:
            java.lang.String r0 = "invalid ps-id key"
            r3.A06(r0)
            return
        L_0x0ba2:
            boolean r0 = r3.A0R
            r7 = 113760892(0x6c7da7c, float:7.5176514E-35)
            if (r0 != 0) goto L_0x0c5c
            X.2rP r4 = r3.A0H     // Catch:{ IllegalArgumentException -> 0x0c21 }
            java.lang.String r2 = r4.A02(r7)     // Catch:{ IllegalArgumentException -> 0x0c21 }
            X.33p r0 = r3.A0D     // Catch:{ IllegalArgumentException -> 0x0c21 }
            java.lang.String r1 = "private_stats_id"
            if (r2 == 0) goto L_0x0c1c
            android.content.SharedPreferences$Editor r0 = X.C18270x1.A03(r0)     // Catch:{ IllegalArgumentException -> 0x0c21 }
            android.content.SharedPreferences$Editor r0 = r0.putString(r1, r2)     // Catch:{ IllegalArgumentException -> 0x0c21 }
        L_0x0bbe:
            r0.apply()     // Catch:{ IllegalArgumentException -> 0x0c21 }
            java.util.HashMap r0 = r4.A03     // Catch:{ IllegalArgumentException -> 0x0c21 }
            if (r0 == 0) goto L_0x0bd4
            android.content.SharedPreferences r0 = r4.A01()     // Catch:{ IllegalArgumentException -> 0x0c21 }
            X.C18270x1.A0m(r0)     // Catch:{ IllegalArgumentException -> 0x0c21 }
            java.util.HashMap r0 = r4.A03     // Catch:{ IllegalArgumentException -> 0x0c21 }
            r0.clear()     // Catch:{ IllegalArgumentException -> 0x0c21 }
            r0 = 0
            r4.A03 = r0     // Catch:{ IllegalArgumentException -> 0x0c21 }
        L_0x0bd4:
            android.content.SharedPreferences r0 = r4.A00()     // Catch:{ IllegalArgumentException -> 0x0c21 }
            X.C18270x1.A0m(r0)     // Catch:{ IllegalArgumentException -> 0x0c21 }
            X.2rX r2 = r3.A02     // Catch:{ IllegalArgumentException -> 0x0c21 }
            java.lang.String r9 = "wamdit3.wam"
            int r1 = r2.A02     // Catch:{ IllegalArgumentException -> 0x0c21 }
            r0 = 2
            if (r1 != r0) goto L_0x0c21
            java.io.File r0 = r2.A08     // Catch:{ IllegalArgumentException -> 0x0c21 }
            java.lang.String r1 = r0.getAbsolutePath()     // Catch:{ IllegalArgumentException -> 0x0c21 }
            char r0 = java.io.File.separatorChar     // Catch:{ IllegalArgumentException -> 0x0c21 }
            int r0 = r1.lastIndexOf(r0)     // Catch:{ IllegalArgumentException -> 0x0c21 }
            int r0 = r0 + 1
            r4 = 0
            java.lang.String r2 = r1.substring(r4, r0)     // Catch:{ IllegalArgumentException -> 0x0c21 }
            java.lang.String r0 = X.AnonymousClass000.A0T(r2, r9)     // Catch:{ IllegalArgumentException -> 0x0c21 }
            java.io.File r0 = X.AnonymousClass002.A0B(r0)     // Catch:{ IllegalArgumentException -> 0x0c21 }
            X.C18270x1.A0x(r0)     // Catch:{ IllegalArgumentException -> 0x0c21 }
        L_0x0c03:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r2)     // Catch:{ IllegalArgumentException -> 0x0c21 }
            java.lang.String r0 = "wampsid"
            java.lang.String r0 = X.AnonymousClass000.A0Y(r0, r1, r4)     // Catch:{ IllegalArgumentException -> 0x0c21 }
            java.io.File r0 = X.AnonymousClass002.A0B(r0)     // Catch:{ IllegalArgumentException -> 0x0c21 }
            X.C18270x1.A0x(r0)     // Catch:{ IllegalArgumentException -> 0x0c21 }
            int r4 = r4 + 1
            r0 = 8
            if (r4 >= r0) goto L_0x0c21
            goto L_0x0c03
        L_0x0c1c:
            android.content.SharedPreferences$Editor r0 = X.C18300x5.A09(r0, r1)     // Catch:{ IllegalArgumentException -> 0x0c21 }
            goto L_0x0bbe
        L_0x0c21:
            X.3Mk r4 = r3.A0I
            X.33p r9 = r3.A0D
            android.content.SharedPreferences r0 = X.AnonymousClass0x2.A0F(r9)
            java.lang.String r1 = "private_stats_id"
            java.lang.String r2 = X.C18280x3.A0Z(r0, r1)
            if (r2 != 0) goto L_0x0c50
            java.lang.String r2 = X.C18280x3.A0Y()
            if (r2 == 0) goto L_0x0c61
            android.content.SharedPreferences$Editor r0 = X.C18270x1.A03(r9)
            android.content.SharedPreferences$Editor r0 = r0.putString(r1, r2)
        L_0x0c40:
            r0.apply()
            X.1Vk r0 = new X.1Vk
            r0.<init>()
            r3.BhD(r0)
            java.lang.String r0 = "WamRuntime/getPrivateStatsId created a new ps-id"
            com.whatsapp.util.Log.d((java.lang.String) r0)
        L_0x0c50:
            r0 = 0
            X.C162457s7.A0J(r4, r0)
            r1 = 6005(0x1775, float:8.415E-42)
            r0 = 2
            r4.Blk(r2, r1, r0)
            r3.A0R = r8
        L_0x0c5c:
            int r0 = r5.psId
            if (r0 == r7) goto L_0x0c66
            return
        L_0x0c61:
            android.content.SharedPreferences$Editor r0 = X.C18300x5.A09(r9, r1)
            goto L_0x0c40
        L_0x0c66:
            X.2qN r0 = r3.A04
            r0.A02(r5, r6)
            X.2qN r1 = r3.A04
            int r0 = r5.psId
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A03(r0)
            r3.A01()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71733ca.run():void");
    }

    public static String A00(C617432b r2, String str) {
        if (!TextUtils.isEmpty(str)) {
            return str.trim().toUpperCase(C620733j.A01(r2.A00.A00));
        }
        return null;
    }

    public C71733ca(Context context, C106155Xv r3) {
        this.A03 = 20;
        this.A01 = context;
        this.A00 = R.raw.end_call_m4;
        this.A02 = r3;
    }

    public C71733ca(C50062hZ r2, C624134x r3) {
        this.A03 = 11;
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = 56;
    }

    public C71733ca(Object obj, Object obj2, int i, int i2) {
        this.A03 = i2;
        this.A02 = obj;
        this.A00 = i;
        this.A01 = obj2;
    }

    public C71733ca(C621033m r2, C27991fJ r3) {
        this.A03 = 6;
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = 1;
    }

    public C71733ca(C113905mB r2, C95814uZ r3, int i, int i2) {
        this.A03 = i2;
        switch (i2) {
            case 25:
            case 26:
            case 27:
                this.A01 = r2;
                this.A02 = r3;
                this.A00 = i;
                return;
            default:
                this.A01 = r2;
                this.A02 = r3;
                this.A00 = 3;
                return;
        }
    }

    public C71733ca(C160827oN r2, C160627o1 r3, int i) {
        this.A03 = 47;
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = i;
    }
}
