package X;

import android.database.Cursor;
import android.util.Pair;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.2sc  reason: invalid class name and case insensitive filesystem */
public abstract class C56822sc {
    public final C623934v A00;

    public static boolean A01(String str, String[] strArr) {
        return str.equals(strArr[0]);
    }

    public final void A08(AnonymousClass33W r3) {
        r3.A0A(false);
        this.A00.A0H(Collections.singleton(r3));
    }

    public final void A09(AnonymousClass33W r3) {
        r3.A0A(true);
        this.A00.A0H(Collections.singleton(r3));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:203:0x02d5, code lost:
        if (r1 == null) goto L_0x0d16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x008d, code lost:
        if (r3 != null) goto L_0x008f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x0299  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:837:0x0cff  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0125  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass33W A02(X.AnonymousClass35M r25, java.lang.String r26, boolean r27) {
        /*
            r24 = this;
            r2 = r24
            boolean r1 = r2 instanceof X.AnonymousClass1On
            r0 = r25
            r17 = r26
            if (r1 == 0) goto L_0x005f
            java.lang.String[] r5 = r0.A06
            int r2 = r5.length
            r1 = 2
            r15 = 0
            if (r2 != r1) goto L_0x005e
            java.lang.String r1 = "nux"
            boolean r1 = A01(r1, r5)
            if (r1 == 0) goto L_0x005e
            X.1EO r4 = r0.A03
            X.2yt r2 = X.C60642yt.A03
            X.2yt r1 = r0.A01
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x005e
            if (r4 == 0) goto L_0x005e
            int r1 = r4.bitField0_
            boolean r1 = X.AnonymousClass0x2.A1X(r1)
            if (r1 == 0) goto L_0x005e
            r3 = 1
            r18 = r5[r3]
            if (r18 == 0) goto L_0x005e
            int r2 = r4.bitField0_
            r1 = 33554432(0x2000000, float:9.403955E-38)
            r2 = r2 & r1
            if (r2 == 0) goto L_0x004f
            X.1Ak r1 = r4.nuxAction_
            r2 = r1
            if (r1 != 0) goto L_0x0043
            X.1Ak r1 = X.C21071Ak.DEFAULT_INSTANCE
        L_0x0043:
            int r1 = r1.bitField0_
            r1 = r1 & 1
            if (r1 == 0) goto L_0x004f
            if (r2 != 0) goto L_0x004d
            X.1Ak r2 = X.C21071Ak.DEFAULT_INSTANCE
        L_0x004d:
            boolean r3 = r2.acknowledged_
        L_0x004f:
            long r1 = r4.timestamp_
            X.33J r0 = r0.A02
            X.1SR r15 = new X.1SR
            r19 = r1
            r21 = r3
            r16 = r0
            r15.<init>(r16, r17, r18, r19, r21)
        L_0x005e:
            return r15
        L_0x005f:
            boolean r1 = r2 instanceof X.AnonymousClass1P3
            r23 = r27
            if (r1 == 0) goto L_0x0142
            X.1P3 r2 = (X.AnonymousClass1P3) r2
            java.lang.String[] r6 = r0.A06
            X.C162457s7.A0C(r6)
            X.1EO r4 = r0.A03
            X.2yt r1 = X.C60642yt.A03
            X.2yt r3 = r0.A01
            boolean r1 = X.C162457s7.A0P(r1, r3)
            if (r1 == 0) goto L_0x0c6d
            if (r4 == 0) goto L_0x0c6d
            int r1 = r4.bitField0_
            boolean r1 = X.AnonymousClass0x2.A1X(r1)
            if (r1 == 0) goto L_0x0c6d
            boolean r1 = r2 instanceof X.AnonymousClass1P2
            if (r1 == 0) goto L_0x00c1
            X.1Ad r3 = r4.botWelcomeRequestAction_
            if (r3 != 0) goto L_0x008f
            X.1Ad r3 = X.C21001Ad.DEFAULT_INSTANCE
            r1 = 0
            if (r3 == 0) goto L_0x0095
        L_0x008f:
            boolean r1 = r3.isSent_
            boolean r1 = X.C18310x6.A1W(r1)
        L_0x0095:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)
            r1 = r2
            X.1P2 r1 = (X.AnonymousClass1P2) r1
            X.20U r1 = r1.A01
        L_0x009e:
            int r9 = r1.ordinal()
            r8 = 0
            long r3 = r4.timestamp_
            r7 = 1
            int r1 = r6.length
            int r1 = r1 + -1
            if (r9 == r8) goto L_0x0c57
            if (r7 > r1) goto L_0x00bf
            r10 = r6[r7]
        L_0x00af:
            X.33J r0 = r0.A02
            X.1SB r6 = new X.1SB
            r7 = r2
            r8 = r0
            r9 = r5
            r11 = r17
            r12 = r3
            r14 = r23
            r6.<init>(r7, r8, r9, r10, r11, r12, r14)
            return r6
        L_0x00bf:
            r10 = 0
            goto L_0x00af
        L_0x00c1:
            boolean r8 = r2 instanceof X.AnonymousClass1P1
            if (r8 == 0) goto L_0x00db
            X.1Ak r1 = r4.nuxAction_
            if (r1 != 0) goto L_0x00cd
            X.1Ak r1 = X.C21071Ak.DEFAULT_INSTANCE
            if (r1 == 0) goto L_0x00f9
        L_0x00cd:
            boolean r1 = r1.acknowledged_
        L_0x00cf:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)
        L_0x00d3:
            if (r8 == 0) goto L_0x0125
            r1 = r2
            X.1P1 r1 = (X.AnonymousClass1P1) r1
            X.20U r1 = r1.A00
            goto L_0x009e
        L_0x00db:
            boolean r1 = r2 instanceof X.AnonymousClass1P0
            if (r1 == 0) goto L_0x00ea
            X.1Ao r1 = r4.privacySettingRelayAllCalls_
            if (r1 != 0) goto L_0x00e7
            X.1Ao r1 = X.C21111Ao.DEFAULT_INSTANCE
            if (r1 == 0) goto L_0x00f9
        L_0x00e7:
            boolean r1 = r1.isEnabled_
            goto L_0x00cf
        L_0x00ea:
            boolean r1 = r2 instanceof X.C22641Oz
            if (r1 == 0) goto L_0x00fb
            X.1Ah r1 = r4.externalWebBetaAction_
            if (r1 != 0) goto L_0x00f6
            X.1Ah r1 = X.C21041Ah.DEFAULT_INSTANCE
            if (r1 == 0) goto L_0x00f9
        L_0x00f6:
            boolean r1 = r1.isOptIn_
            goto L_0x00cf
        L_0x00f9:
            r5 = 0
            goto L_0x00d3
        L_0x00fb:
            X.1At r1 = r4.ugcBot_
            r7 = r1
            if (r1 != 0) goto L_0x0102
            X.1At r1 = X.C21161At.DEFAULT_INSTANCE
        L_0x0102:
            r3 = 0
            if (r1 == 0) goto L_0x010c
            int r1 = r1.bitField0_
            r1 = r1 & 1
            if (r1 == 0) goto L_0x010c
            r3 = 1
        L_0x010c:
            r5 = 0
            if (r3 == 0) goto L_0x00d3
            if (r7 != 0) goto L_0x0115
            X.1At r7 = X.C21161At.DEFAULT_INSTANCE
            if (r7 == 0) goto L_0x00d3
        L_0x0115:
            X.8Lq r1 = r7.definition_
            if (r1 == 0) goto L_0x00d3
            byte[] r3 = r1.A07()
            java.nio.charset.Charset r1 = X.AnonymousClass79X.A05
            java.lang.String r5 = new java.lang.String
            r5.<init>(r3, r1)
            goto L_0x00d3
        L_0x0125:
            boolean r1 = r2 instanceof X.AnonymousClass1P0
            if (r1 == 0) goto L_0x0130
            r1 = r2
            X.1P0 r1 = (X.AnonymousClass1P0) r1
            X.20U r1 = r1.A01
            goto L_0x009e
        L_0x0130:
            boolean r1 = r2 instanceof X.C22641Oz
            if (r1 == 0) goto L_0x013b
            r1 = r2
            X.1Oz r1 = (X.C22641Oz) r1
            X.20U r1 = r1.A00
            goto L_0x009e
        L_0x013b:
            r1 = r2
            X.1Oy r1 = (X.C22631Oy) r1
            X.20U r1 = r1.A01
            goto L_0x009e
        L_0x0142:
            boolean r1 = r2 instanceof X.C22451Oc
            if (r1 == 0) goto L_0x01a7
            r2 = 2
            java.lang.String[] r5 = r0.A06
            X.C162457s7.A0C(r5)
            int r1 = r5.length
            r6 = 0
            if (r1 != r2) goto L_0x01a6
            java.lang.String r1 = "userStatusMute"
            boolean r1 = A01(r1, r5)
            if (r1 == 0) goto L_0x01a6
            X.1EO r4 = r0.A03
            if (r4 == 0) goto L_0x01a6
            X.2yt r2 = X.C60642yt.A03
            X.2yt r1 = r0.A01
            boolean r1 = X.C162457s7.A0P(r2, r1)
            if (r1 == 0) goto L_0x01a6
            int r1 = r4.bitField0_
            boolean r1 = X.AnonymousClass0x2.A1X(r1)
            if (r1 == 0) goto L_0x01a6
            int r2 = r4.bitField0_
            r1 = 8388608(0x800000, float:1.17549435E-38)
            r2 = r2 & r1
            if (r2 == 0) goto L_0x01a6
            X.1Av r1 = r4.userStatusMuteAction_
            r2 = r1
            if (r1 != 0) goto L_0x017d
            X.1Av r1 = X.C21181Av.DEFAULT_INSTANCE
        L_0x017d:
            int r1 = r1.bitField0_
            r1 = r1 & 1
            if (r1 == 0) goto L_0x01a6
            if (r2 != 0) goto L_0x0189
            X.1Av r2 = X.C21181Av.DEFAULT_INSTANCE
            if (r2 == 0) goto L_0x01a6
        L_0x0189:
            boolean r3 = r2.muted_
            X.32Y r2 = com.whatsapp.jid.UserJid.Companion
            r1 = 1
            r1 = r5[r1]
            com.whatsapp.jid.UserJid r8 = r2.A0E(r1)
            if (r8 == 0) goto L_0x01a6
            long r1 = r4.timestamp_
            X.33J r0 = r0.A02
            X.1SM r6 = new X.1SM
            r7 = r0
            r9 = r17
            r10 = r1
            r12 = r3
            r13 = r23
            r6.<init>(r7, r8, r9, r10, r12, r13)
        L_0x01a6:
            return r6
        L_0x01a7:
            boolean r1 = r2 instanceof X.C22601Ov
            if (r1 == 0) goto L_0x01f0
            java.lang.String[] r5 = r0.A06
            X.2yt r3 = r0.A01
            X.1EO r4 = r0.A03
            int r2 = r5.length
            r1 = 1
            r15 = 0
            if (r2 != r1) goto L_0x005e
            java.lang.String r1 = "setting_unarchiveChats"
            boolean r1 = A01(r1, r5)
            if (r1 == 0) goto L_0x005e
            X.2yt r1 = X.C60642yt.A03
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x005e
            if (r4 == 0) goto L_0x005e
            int r1 = r4.bitField0_
            boolean r1 = X.AnonymousClass0x2.A1X(r1)
            if (r1 == 0) goto L_0x005e
            int r2 = r4.bitField0_
            r1 = 262144(0x40000, float:3.67342E-40)
            r2 = r2 & r1
            if (r2 == 0) goto L_0x005e
            long r2 = r4.timestamp_
            X.33J r1 = r0.A02
            X.1Au r0 = r4.unarchiveChatsSetting_
            if (r0 != 0) goto L_0x01e2
            X.1Au r0 = X.C21171Au.DEFAULT_INSTANCE
        L_0x01e2:
            boolean r0 = r0.unarchiveChats_
            X.1SJ r15 = new X.1SJ
            r18 = r2
            r20 = r0
            r16 = r1
            r15.<init>(r16, r17, r18, r20)
            return r15
        L_0x01f0:
            boolean r1 = r2 instanceof X.AnonymousClass1Ol
            if (r1 == 0) goto L_0x0244
            java.lang.String[] r5 = r0.A06
            X.2yt r3 = r0.A01
            X.1EO r4 = r0.A03
            int r2 = r5.length
            r1 = 1
            r15 = 0
            if (r2 != r1) goto L_0x005e
            java.lang.String r1 = "time_format"
            boolean r1 = A01(r1, r5)
            if (r1 == 0) goto L_0x005e
            X.2yt r1 = X.C60642yt.A03
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x005e
            if (r4 == 0) goto L_0x005e
            int r1 = r4.bitField0_
            boolean r1 = X.AnonymousClass0x2.A1X(r1)
            if (r1 == 0) goto L_0x005e
            int r2 = r4.bitField0_
            r1 = 16777216(0x1000000, float:2.3509887E-38)
            r2 = r2 & r1
            if (r2 == 0) goto L_0x005e
            X.1As r1 = r4.timeFormatAction_
            r2 = r1
            if (r1 != 0) goto L_0x0228
            X.1As r1 = X.C21151As.DEFAULT_INSTANCE
        L_0x0228:
            int r1 = r1.bitField0_
            r1 = r1 & 1
            if (r1 == 0) goto L_0x005e
            if (r2 != 0) goto L_0x0232
            X.1As r2 = X.C21151As.DEFAULT_INSTANCE
        L_0x0232:
            boolean r3 = r2.isTwentyFourHourFormatEnabled_
            long r1 = r4.timestamp_
            X.33J r0 = r0.A02
            X.1SI r15 = new X.1SI
            r18 = r1
            r20 = r3
            r16 = r0
            r15.<init>(r16, r17, r18, r20)
            return r15
        L_0x0244:
            boolean r1 = r2 instanceof X.AnonymousClass1Ok
            if (r1 == 0) goto L_0x02de
            r3 = 2
            r2 = 1
            java.lang.String[] r4 = r0.A06
            X.C162457s7.A0C(r4)
            int r1 = r4.length
            r14 = 0
            if (r1 != r2) goto L_0x0d16
            java.lang.String r1 = "status_privacy"
            boolean r1 = A01(r1, r4)
            if (r1 == 0) goto L_0x0d16
            X.2yt r6 = r0.A01
            X.C162457s7.A0C(r6)
            X.1EO r5 = r0.A03
            if (r5 == 0) goto L_0x0d16
            int r1 = r5.bitField0_
            boolean r1 = X.AnonymousClass0x2.A1X(r1)
            if (r1 == 0) goto L_0x0d16
            int r1 = r5.bitField1_
            r1 = r1 & 32
            if (r1 == 0) goto L_0x0d16
            X.1Bg r1 = r5.statusPrivacy_
            r7 = r1
            if (r1 != 0) goto L_0x027a
            X.1Bg r1 = X.C21291Bg.DEFAULT_INSTANCE
        L_0x027a:
            int r1 = r1.bitField0_
            r1 = r1 & 1
            if (r1 == 0) goto L_0x0d16
            r1 = r7
            if (r7 != 0) goto L_0x0285
            X.1Bg r1 = X.C21291Bg.DEFAULT_INSTANCE
        L_0x0285:
            if (r1 == 0) goto L_0x0d16
            int r1 = r1.mode_
            if (r1 == 0) goto L_0x02db
            if (r1 == r2) goto L_0x02d8
            if (r1 != r3) goto L_0x02db
            X.22s r1 = X.C374622s.CONTACTS
        L_0x0291:
            int r4 = r1.ordinal()
            r3 = 1
            r2 = 0
            if (r4 == r2) goto L_0x02d1
            r3 = 2
            r1 = 1
            if (r4 == r1) goto L_0x02d1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
        L_0x02a1:
            int r19 = r1.intValue()
            java.util.HashSet r4 = X.AnonymousClass002.A0K()
            if (r7 != 0) goto L_0x02ad
            X.1Bg r7 = X.C21291Bg.DEFAULT_INSTANCE
        L_0x02ad:
            X.8ya r1 = r7.userJid_
            int r1 = r1.size()
            if (r1 <= 0) goto L_0x0c8b
            X.1Bg r1 = r5.statusPrivacy_
            if (r1 != 0) goto L_0x02bb
            X.1Bg r1 = X.C21291Bg.DEFAULT_INSTANCE
        L_0x02bb:
            X.8ya r1 = r1.userJid_
            java.util.Iterator r3 = r1.iterator()
        L_0x02c1:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x0c8b
            java.lang.String r2 = X.AnonymousClass001.A0m(r3)
            X.32Y r1 = com.whatsapp.jid.UserJid.Companion
            X.AnonymousClass32Y.A0C(r1, r2, r4)
            goto L_0x02c1
        L_0x02d1:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            if (r1 == 0) goto L_0x0d16
            goto L_0x02a1
        L_0x02d8:
            X.22s r1 = X.C374622s.DENY_LIST
            goto L_0x0291
        L_0x02db:
            X.22s r1 = X.C374622s.ALLOW_LIST
            goto L_0x0291
        L_0x02de:
            boolean r1 = r2 instanceof X.C22591Ou
            if (r1 == 0) goto L_0x0382
            java.lang.String[] r5 = r0.A06
            X.2yt r8 = r0.A01
            X.1EO r4 = r0.A03
            int r2 = r5.length
            r1 = 5
            r9 = 0
            if (r2 != r1) goto L_0x0310
            java.lang.String r1 = "star"
            boolean r1 = A01(r1, r5)
            if (r1 == 0) goto L_0x0310
            r7 = 1
            r1 = r5[r7]
            X.5Yw r3 = X.C95814uZ.A00
            X.4uZ r6 = r3.A05(r1)
            if (r6 != 0) goto L_0x0311
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "star-message-mutation/from-key-value unable to create chat jid from "
            r2.append(r0)
            r0 = r5[r7]
        L_0x030d:
            X.C18260x0.A1K(r2, r0)
        L_0x0310:
            return r9
        L_0x0311:
            r7 = 3
            r1 = r5[r7]
            java.lang.Boolean r2 = X.AnonymousClass34E.A00(r1)
            if (r2 != 0) goto L_0x0332
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "star-message-mutation/from-key-value value="
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = " at index="
            r2.append(r0)
            r2.append(r7)
            java.lang.String r0 = " is not one of the valid strings"
            goto L_0x030d
        L_0x0332:
            X.2yt r1 = X.C60642yt.A03
            boolean r1 = r1.equals(r8)
            if (r1 == 0) goto L_0x0310
            if (r4 == 0) goto L_0x0310
            int r1 = r4.bitField0_
            boolean r1 = X.AnonymousClass0x2.A1X(r1)
            if (r1 == 0) goto L_0x0310
            int r1 = r4.bitField0_
            r1 = r1 & 2
            if (r1 == 0) goto L_0x0310
            X.1Ar r1 = r4.starAction_
            if (r1 != 0) goto L_0x0350
            X.1Ar r1 = X.C21141Ar.DEFAULT_INSTANCE
        L_0x0350:
            int r1 = r1.bitField0_
            r1 = r1 & 1
            if (r1 == 0) goto L_0x0310
            boolean r2 = r2.booleanValue()
            r1 = 2
            r1 = r5[r1]
            X.2z0 r12 = X.AnonymousClass2z0.A05(r6, r1, r2)
            r1 = 4
            r1 = r5[r1]
            X.4uZ r11 = r3.A05(r1)
            X.1Ar r1 = r4.starAction_
            if (r1 != 0) goto L_0x036e
            X.1Ar r1 = X.C21141Ar.DEFAULT_INSTANCE
        L_0x036e:
            boolean r3 = r1.starred_
            long r1 = r4.timestamp_
            X.33J r0 = r0.A02
            X.1Sa r9 = new X.1Sa
            r10 = r0
            r13 = r17
            r14 = r1
            r16 = r3
            r17 = r23
            r9.<init>(r10, r11, r12, r13, r14, r16, r17)
            return r9
        L_0x0382:
            boolean r1 = r2 instanceof X.C22471Oe
            if (r1 == 0) goto L_0x03c6
            r6 = 2
            r5 = 1
            X.1EO r4 = r0.A03
            r14 = 0
            if (r4 == 0) goto L_0x0d16
            java.lang.String[] r3 = r0.A06
            r1 = 0
            r2 = r3[r1]
            java.lang.String r1 = "shareOwnPn"
            boolean r1 = X.C162457s7.A0P(r2, r1)
            if (r1 == 0) goto L_0x0d16
            int r1 = r3.length
            if (r1 != r6) goto L_0x0d16
            X.2yt r2 = r0.A01
            X.2yt r1 = X.AnonymousClass1SQ.A01
            boolean r1 = X.C162457s7.A0P(r2, r1)
            if (r1 == 0) goto L_0x0d16
            X.32Y r2 = com.whatsapp.jid.UserJid.Companion
            r1 = r3[r5]
            com.whatsapp.jid.UserJid r3 = r2.A0E(r1)
            boolean r1 = r3 instanceof X.C27981fH
            if (r1 == 0) goto L_0x0d16
            X.1fH r3 = (X.C27981fH) r3
            if (r3 == 0) goto L_0x0d16
            long r1 = r4.timestamp_
            X.33J r15 = r0.A02
            X.1SQ r14 = new X.1SQ
            r18 = r1
            r16 = r3
            r14.<init>(r15, r16, r17, r18)
            return r14
        L_0x03c6:
            boolean r1 = r2 instanceof X.C22521Oj
            if (r1 == 0) goto L_0x03f4
            java.lang.String[] r5 = r0.A06
            X.2yt r4 = r0.A01
            X.1EO r2 = r0.A03
            int r3 = r5.length
            r1 = 2
            r15 = 0
            if (r3 != r1) goto L_0x005e
            java.lang.String r1 = "sentinel"
            boolean r1 = A01(r1, r5)
            if (r1 == 0) goto L_0x005e
            r1 = 1
            r5 = r5[r1]
            java.util.Set r1 = X.AnonymousClass33W.A08
            boolean r1 = r1.contains(r5)
            if (r1 != 0) goto L_0x0bdc
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "sentinel-mutation/from-key-value unknown collectionName: "
            X.C18260x0.A0r(r0, r5, r1)
            return r15
        L_0x03f4:
            boolean r1 = r2 instanceof X.AnonymousClass1Om
            if (r1 == 0) goto L_0x0425
            java.lang.String[] r5 = r0.A06
            X.2yt r4 = r0.A01
            X.1EO r3 = r0.A03
            int r2 = r5.length
            r1 = 2
            r15 = 0
            if (r2 != r1) goto L_0x005e
            java.lang.String r1 = "removeRecentSticker"
            boolean r1 = A01(r1, r5)
            if (r1 == 0) goto L_0x005e
            r2 = 1
            r18 = r5[r2]
            boolean r1 = android.text.TextUtils.isEmpty(r18)
            if (r1 == 0) goto L_0x0c1b
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "remove-recent-sticker-mutation/from-key-value unable to create file hash from "
            r1.append(r0)
            r0 = r5[r2]
            X.C18260x0.A1K(r1, r0)
            return r15
        L_0x0425:
            boolean r1 = r2 instanceof X.C22441Ob
            if (r1 == 0) goto L_0x0478
            java.lang.String[] r5 = r0.A06
            X.2yt r3 = r0.A01
            X.1EO r4 = r0.A03
            int r2 = r5.length
            r1 = 1
            r15 = 0
            if (r2 != r1) goto L_0x005e
            java.lang.String r1 = "setting_pushName"
            boolean r1 = A01(r1, r5)
            if (r1 == 0) goto L_0x005e
            X.2yt r1 = X.C60642yt.A03
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x005e
            if (r4 == 0) goto L_0x005e
            int r1 = r4.bitField0_
            boolean r1 = X.AnonymousClass0x2.A1X(r1)
            if (r1 == 0) goto L_0x005e
            int r1 = r4.bitField0_
            r1 = r1 & 64
            if (r1 == 0) goto L_0x005e
            X.1Ap r1 = r4.pushNameSetting_
            r2 = r1
            if (r1 != 0) goto L_0x045c
            X.1Ap r1 = X.C21121Ap.DEFAULT_INSTANCE
        L_0x045c:
            int r1 = r1.bitField0_
            r1 = r1 & 1
            if (r1 == 0) goto L_0x005e
            if (r2 != 0) goto L_0x0466
            X.1Ap r2 = X.C21121Ap.DEFAULT_INSTANCE
        L_0x0466:
            java.lang.String r3 = r2.name_
            long r1 = r4.timestamp_
            X.33J r0 = r0.A02
            X.1SG r15 = new X.1SG
            r18 = r3
            r19 = r1
            r16 = r0
            r15.<init>(r16, r17, r18, r19)
            return r15
        L_0x0478:
            boolean r1 = r2 instanceof X.C22501Oh
            if (r1 == 0) goto L_0x04ec
            r4 = 1
            java.lang.String[] r3 = r0.A06
            X.C162457s7.A0C(r3)
            int r2 = r3.length
            r1 = 2
            r13 = 0
            if (r2 != r1) goto L_0x04a3
            java.lang.String r1 = "primary_version"
            boolean r1 = A01(r1, r3)
            if (r1 == 0) goto L_0x04a3
            r15 = r3[r4]
            java.lang.String r1 = "current"
            boolean r1 = X.C162457s7.A0P(r15, r1)
            if (r1 != 0) goto L_0x04a4
            java.lang.String r1 = "session_start"
            boolean r1 = X.C162457s7.A0P(r15, r1)
            if (r1 != 0) goto L_0x04a4
        L_0x04a3:
            return r13
        L_0x04a4:
            X.2yt r2 = r0.A01
            X.C162457s7.A0C(r2)
            X.1EO r4 = r0.A03
            X.2yt r1 = X.C60642yt.A03
            boolean r1 = X.C162457s7.A0P(r1, r2)
            if (r1 == 0) goto L_0x04a3
            if (r4 == 0) goto L_0x04a3
            int r1 = r4.bitField0_
            boolean r1 = X.AnonymousClass0x2.A1X(r1)
            if (r1 == 0) goto L_0x04a3
            int r2 = r4.bitField0_
            r1 = 67108864(0x4000000, float:1.5046328E-36)
            r2 = r2 & r1
            if (r2 == 0) goto L_0x04a3
            X.1An r1 = r4.primaryVersionAction_
            if (r1 != 0) goto L_0x04ca
            X.1An r1 = X.C21101An.DEFAULT_INSTANCE
        L_0x04ca:
            int r1 = r1.bitField0_
            r1 = r1 & 1
            if (r1 == 0) goto L_0x04a3
            long r2 = r4.timestamp_
            X.C162457s7.A0H(r15)
            X.1An r1 = r4.primaryVersionAction_
            if (r1 != 0) goto L_0x04db
            X.1An r1 = X.C21101An.DEFAULT_INSTANCE
        L_0x04db:
            java.lang.String r1 = r1.version_
            X.C162457s7.A0D(r1)
            X.33J r14 = r0.A02
            X.1SK r13 = new X.1SK
            r18 = r2
            r16 = r1
            r13.<init>(r14, r15, r16, r17, r18)
            return r13
        L_0x04ec:
            boolean r1 = r2 instanceof X.C22571Os
            if (r1 == 0) goto L_0x0535
            java.lang.String[] r3 = r0.A06
            int r2 = r3.length
            r1 = 1
            r15 = 0
            if (r2 != r1) goto L_0x005e
            java.lang.String r1 = "primary_feature"
            boolean r1 = A01(r1, r3)
            if (r1 == 0) goto L_0x005e
            X.1EO r4 = r0.A03
            X.2yt r2 = X.C60642yt.A03
            X.2yt r1 = r0.A01
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x005e
            if (r4 == 0) goto L_0x005e
            int r1 = r4.bitField0_
            boolean r1 = X.AnonymousClass0x2.A1X(r1)
            if (r1 == 0) goto L_0x005e
            int r2 = r4.bitField0_
            r1 = 524288(0x80000, float:7.34684E-40)
            r2 = r2 & r1
            if (r2 == 0) goto L_0x005e
            X.1AC r1 = r4.primaryFeature_
            if (r1 != 0) goto L_0x0523
            X.1AC r1 = X.AnonymousClass1AC.DEFAULT_INSTANCE
        L_0x0523:
            X.8ya r3 = r1.flags_
            long r1 = r4.timestamp_
            X.33J r0 = r0.A02
            X.1SF r15 = new X.1SF
            r18 = r3
            r19 = r1
            r16 = r0
            r15.<init>(r16, r17, r18, r19)
            return r15
        L_0x0535:
            boolean r1 = r2 instanceof X.C22431Oa
            if (r1 == 0) goto L_0x0594
            r6 = 2
            r5 = 1
            X.1EO r4 = r0.A03
            r13 = 0
            if (r4 == 0) goto L_0x04a3
            java.lang.String[] r3 = r0.A06
            r1 = 0
            r2 = r3[r1]
            java.lang.String r1 = "pnForLidChat"
            boolean r1 = X.C162457s7.A0P(r2, r1)
            if (r1 == 0) goto L_0x04a3
            int r1 = r3.length
            if (r1 != r6) goto L_0x04a3
            X.2yt r2 = r0.A01
            X.2yt r1 = X.AnonymousClass1SS.A02
            boolean r1 = X.C162457s7.A0P(r2, r1)
            if (r1 == 0) goto L_0x04a3
            int r2 = r4.bitField0_
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 & r1
            if (r2 == 0) goto L_0x04a3
            X.32Y r2 = com.whatsapp.jid.UserJid.Companion
            r1 = r3[r5]
            com.whatsapp.jid.UserJid r15 = r2.A0E(r1)
            boolean r1 = r15 instanceof X.C27981fH
            if (r1 == 0) goto L_0x04a3
            X.1fH r15 = (X.C27981fH) r15
            if (r15 == 0) goto L_0x04a3
            X.1Am r1 = r4.pnForLidChatAction_
            if (r1 != 0) goto L_0x0578
            X.1Am r1 = X.C21091Am.DEFAULT_INSTANCE
        L_0x0578:
            java.lang.String r1 = r1.pnJid_
            com.whatsapp.jid.UserJid r3 = r2.A0E(r1)
            boolean r1 = r3 instanceof com.whatsapp.jid.PhoneUserJid
            if (r1 == 0) goto L_0x04a3
            com.whatsapp.jid.PhoneUserJid r3 = (com.whatsapp.jid.PhoneUserJid) r3
            if (r3 == 0) goto L_0x04a3
            long r1 = r4.timestamp_
            X.33J r14 = r0.A02
            X.1SS r13 = new X.1SS
            r18 = r1
            r16 = r3
            r13.<init>(r14, r15, r16, r17, r18)
            return r13
        L_0x0594:
            boolean r1 = r2 instanceof X.C22551Oq
            if (r1 == 0) goto L_0x05c5
            java.lang.String[] r5 = r0.A06
            X.2yt r3 = r0.A01
            X.1EO r4 = r0.A03
            int r2 = r5.length
            r1 = 2
            r6 = 0
            if (r2 != r1) goto L_0x01a6
            java.lang.String r1 = "pin_v1"
            boolean r1 = A01(r1, r5)
            if (r1 == 0) goto L_0x01a6
            r2 = 1
            r1 = r5[r2]
            X.4uZ r8 = X.C18310x6.A0S(r1)
            if (r8 != 0) goto L_0x09d4
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "pin-chat-mutation/from-key-value unable to create chat jid from "
            r1.append(r0)
            r0 = r5[r2]
            X.C18260x0.A1K(r1, r0)
            return r6
        L_0x05c5:
            boolean r1 = r2 instanceof X.C22511Oi
            if (r1 == 0) goto L_0x05f6
            java.lang.String[] r4 = r0.A06
            X.2yt r3 = r0.A01
            X.1EO r6 = r0.A03
            int r2 = r4.length
            r1 = 2
            r14 = 0
            if (r2 != r1) goto L_0x0d16
            java.lang.String r1 = "mute"
            boolean r1 = A01(r1, r4)
            if (r1 == 0) goto L_0x0d16
            r2 = 1
            r1 = r4[r2]
            X.4uZ r16 = X.C18310x6.A0S(r1)
            if (r16 != 0) goto L_0x0caa
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "mute-chat-mutation/from-key-value unable to create chat jid from "
            r1.append(r0)
            r0 = r4[r2]
            X.C18260x0.A1K(r1, r0)
            return r14
        L_0x05f6:
            boolean r1 = r2 instanceof X.C22561Or
            if (r1 == 0) goto L_0x061c
            java.lang.String[] r5 = r0.A06
            X.2yt r3 = r0.A01
            X.1EO r4 = r0.A03
            int r2 = r5.length
            r1 = 2
            r6 = 0
            if (r2 != r1) goto L_0x01a6
            java.lang.String r1 = "markChatAsRead"
            boolean r1 = A01(r1, r5)
            if (r1 == 0) goto L_0x01a6
            r1 = 1
            r1 = r5[r1]
            X.4uZ r9 = X.C18310x6.A0S(r1)
            if (r9 != 0) goto L_0x0a10
            java.lang.String r0 = "mark-chat-as-read-mutation/from-key-value unable to create chat jid"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return r6
        L_0x061c:
            boolean r1 = r2 instanceof X.C22491Og
            if (r1 == 0) goto L_0x066f
            java.lang.String[] r5 = r0.A06
            X.2yt r3 = r0.A01
            X.1EO r4 = r0.A03
            int r2 = r5.length
            r1 = 1
            r15 = 0
            if (r2 != r1) goto L_0x005e
            java.lang.String r1 = "setting_locale"
            boolean r1 = A01(r1, r5)
            if (r1 == 0) goto L_0x005e
            X.2yt r1 = X.C60642yt.A03
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x005e
            if (r4 == 0) goto L_0x005e
            int r1 = r4.bitField0_
            boolean r1 = X.AnonymousClass0x2.A1X(r1)
            if (r1 == 0) goto L_0x005e
            int r1 = r4.bitField0_
            r1 = r1 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x005e
            X.1Aj r1 = r4.localeSetting_
            r2 = r1
            if (r1 != 0) goto L_0x0653
            X.1Aj r1 = X.C21061Aj.DEFAULT_INSTANCE
        L_0x0653:
            int r1 = r1.bitField0_
            r1 = r1 & 1
            if (r1 == 0) goto L_0x005e
            if (r2 != 0) goto L_0x065d
            X.1Aj r2 = X.C21061Aj.DEFAULT_INSTANCE
        L_0x065d:
            java.lang.String r3 = r2.locale_
            long r1 = r4.timestamp_
            X.33J r0 = r0.A02
            X.1SE r15 = new X.1SE
            r18 = r3
            r19 = r1
            r16 = r0
            r15.<init>(r16, r17, r18, r19)
            return r15
        L_0x066f:
            boolean r1 = r2 instanceof X.C22611Ow
            if (r1 == 0) goto L_0x074c
            java.lang.String[] r3 = r0.A06
            X.2yt r2 = r0.A01
            X.1EO r4 = r0.A03
            int r1 = r3.length
            r12 = 0
            r6 = 2
            if (r1 != r6) goto L_0x069d
            java.lang.String r1 = "favoriteSticker"
            boolean r1 = A01(r1, r3)
            if (r1 == 0) goto L_0x069d
            r5 = 1
            r7 = r3[r5]
            boolean r1 = android.text.TextUtils.isEmpty(r7)
            if (r1 == 0) goto L_0x069e
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "favorite-sticker-mutation/from-key-value unable to create file hash from "
            r1.append(r0)
            r0 = r3[r5]
            X.C18260x0.A1K(r1, r0)
        L_0x069d:
            return r12
        L_0x069e:
            X.2yt r1 = X.C60642yt.A03
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x069d
            if (r4 == 0) goto L_0x069d
            int r1 = r4.bitField0_
            boolean r1 = X.AnonymousClass0x2.A1X(r1)
            if (r1 == 0) goto L_0x069d
            int r2 = r4.bitField0_
            r1 = 134217728(0x8000000, float:3.85186E-34)
            r2 = r2 & r1
            if (r2 == 0) goto L_0x069d
            X.1Dt r1 = r4.stickerAction_
            r2 = r1
            if (r1 != 0) goto L_0x06be
            X.1Dt r1 = X.C21941Dt.DEFAULT_INSTANCE
        L_0x06be:
            int r1 = r1.bitField0_
            r1 = r1 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x069d
            r1 = r2
            if (r2 != 0) goto L_0x06c9
            X.1Dt r1 = X.C21941Dt.DEFAULT_INSTANCE
        L_0x06c9:
            int r1 = r1.bitField0_
            r1 = r1 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x074a
            r1 = r2
            if (r2 != 0) goto L_0x06d4
            X.1Dt r1 = X.C21941Dt.DEFAULT_INSTANCE
        L_0x06d4:
            int r3 = r1.deviceIdHint_
        L_0x06d6:
            if (r2 != 0) goto L_0x06da
            X.1Dt r2 = X.C21941Dt.DEFAULT_INSTANCE
        L_0x06da:
            int r1 = r2.bitField0_
            r1 = r1 & 2
            if (r1 == 0) goto L_0x0748
            X.8Lq r1 = r2.fileEncSha256_
            java.lang.String r9 = X.C18320x8.A0d(r1, r6)
        L_0x06e6:
            int r1 = r2.bitField0_
            r1 = r1 & 4
            if (r1 == 0) goto L_0x0746
            X.8Lq r1 = r2.mediaKey_
            java.lang.String r10 = X.C18320x8.A0d(r1, r5)
        L_0x06f2:
            int r5 = r2.bitField0_
            r1 = r5 & 1
            if (r1 == 0) goto L_0x0744
            java.lang.String r8 = r2.url_
        L_0x06fa:
            r1 = r5 & 8
            if (r1 == 0) goto L_0x0742
            java.lang.String r11 = r2.mimetype_
        L_0x0700:
            r1 = r5 & 32
            if (r1 == 0) goto L_0x0740
            int r13 = r2.width_
        L_0x0706:
            r1 = r5 & 16
            if (r1 == 0) goto L_0x073e
            int r14 = r2.height_
        L_0x070c:
            r1 = r5 & 64
            if (r1 == 0) goto L_0x0712
            java.lang.String r12 = r2.directPath_
        L_0x0712:
            r1 = r5 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x073b
            long r15 = r2.fileLength_
        L_0x0718:
            X.2cr r6 = new X.2cr
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            long r1 = r4.timestamp_
            X.33J r5 = r0.A02
            X.1Dt r0 = r4.stickerAction_
            if (r0 != 0) goto L_0x0727
            X.1Dt r0 = X.C21941Dt.DEFAULT_INSTANCE
        L_0x0727:
            boolean r0 = r0.isFavorite_
            X.1SP r12 = new X.1SP
            r13 = r6
            r14 = r5
            r15 = r17
            r16 = r3
            r17 = r1
            r19 = r0
            r20 = r23
            r12.<init>(r13, r14, r15, r16, r17, r19, r20)
            return r12
        L_0x073b:
            r15 = 0
            goto L_0x0718
        L_0x073e:
            r14 = 0
            goto L_0x070c
        L_0x0740:
            r13 = 0
            goto L_0x0706
        L_0x0742:
            r11 = r12
            goto L_0x0700
        L_0x0744:
            r8 = r12
            goto L_0x06fa
        L_0x0746:
            r10 = r12
            goto L_0x06f2
        L_0x0748:
            r9 = r12
            goto L_0x06e6
        L_0x074a:
            r3 = -1
            goto L_0x06d6
        L_0x074c:
            boolean r1 = r2 instanceof X.C22461Od
            if (r1 == 0) goto L_0x0801
            java.lang.String[] r5 = r0.A06
            X.2yt r8 = r0.A01
            X.1EO r4 = r0.A03
            int r2 = r5.length
            r1 = 5
            r13 = 0
            if (r2 != r1) goto L_0x04a3
            java.lang.String r1 = "deleteMessageForMe"
            boolean r1 = A01(r1, r5)
            if (r1 == 0) goto L_0x04a3
            r2 = 1
            r1 = r5[r2]
            X.5Yw r3 = X.C95814uZ.A00
            X.4uZ r6 = r3.A05(r1)
            if (r6 != 0) goto L_0x077d
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "delete-message-for-me-mutation/from-key-value unable to create chat jid from "
            r3.append(r0)
            r0 = r5[r2]
        L_0x0779:
            X.C18260x0.A1K(r3, r0)
            return r13
        L_0x077d:
            r2 = 3
            r1 = r5[r2]
            java.lang.Boolean r7 = X.AnonymousClass34E.A00(r1)
            if (r7 != 0) goto L_0x079d
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "delete-message-for-me-mutation/from-key-value value="
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = " at index="
            r3.append(r0)
            r3.append(r2)
            java.lang.String r0 = " is not one of the valid strings"
            goto L_0x0779
        L_0x079d:
            X.2yt r1 = X.C60642yt.A03
            boolean r1 = r1.equals(r8)
            if (r1 == 0) goto L_0x04a3
            if (r4 == 0) goto L_0x04a3
            int r1 = r4.bitField0_
            boolean r1 = X.AnonymousClass0x2.A1X(r1)
            if (r1 == 0) goto L_0x04a3
            int r1 = r4.bitField0_
            r1 = r1 & 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L_0x04a3
            X.1Be r1 = r4.deleteMessageForMeAction_
            r2 = r1
            if (r1 != 0) goto L_0x07bc
            X.1Be r1 = X.C21271Be.DEFAULT_INSTANCE
        L_0x07bc:
            int r1 = r1.bitField0_
            r1 = r1 & 1
            if (r1 == 0) goto L_0x04a3
            if (r2 != 0) goto L_0x07c6
            X.1Be r2 = X.C21271Be.DEFAULT_INSTANCE
        L_0x07c6:
            int r1 = r2.bitField0_
            r1 = r1 & 2
            if (r1 == 0) goto L_0x04a3
            boolean r2 = r7.booleanValue()
            r1 = 2
            r1 = r5[r1]
            X.2z0 r16 = X.AnonymousClass2z0.A05(r6, r1, r2)
            r1 = 4
            r1 = r5[r1]
            X.4uZ r15 = r3.A05(r1)
            X.1Be r1 = r4.deleteMessageForMeAction_
            r3 = r1
            if (r1 != 0) goto L_0x07e5
            X.1Be r1 = X.C21271Be.DEFAULT_INSTANCE
        L_0x07e5:
            boolean r6 = r1.deleteMedia_
            long r1 = r4.timestamp_
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS
            if (r3 != 0) goto L_0x07ef
            X.1Be r3 = X.C21271Be.DEFAULT_INSTANCE
        L_0x07ef:
            long r3 = r3.messageTimestamp_
            long r20 = r5.toMillis(r3)
            X.33J r14 = r0.A02
            X.1SZ r13 = new X.1SZ
            r18 = r1
            r22 = r6
            r13.<init>(r14, r15, r16, r17, r18, r20, r22, r23)
            return r13
        L_0x0801:
            boolean r1 = r2 instanceof X.C22541Op
            if (r1 == 0) goto L_0x088e
            java.lang.String[] r5 = r0.A06
            X.2yt r6 = r0.A01
            X.1EO r4 = r0.A03
            int r2 = r5.length
            r1 = 3
            r7 = 0
            if (r2 != r1) goto L_0x0826
            java.lang.String r1 = "deleteChat"
            boolean r1 = A01(r1, r5)
            if (r1 == 0) goto L_0x0826
            r1 = 1
            r1 = r5[r1]
            X.4uZ r10 = X.C18310x6.A0S(r1)
            if (r10 != 0) goto L_0x0827
            java.lang.String r0 = "delete-chat-mutation/from-key-value unable to create chat jid"
        L_0x0823:
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0826:
            return r7
        L_0x0827:
            r3 = 2
            r2 = r5[r3]
            java.lang.Boolean r5 = X.AnonymousClass34E.A00(r2)
            if (r5 != 0) goto L_0x084b
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "delete-chat-mutation/from-key-value value="
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " at index="
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = " is not one of the valid strings"
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)
            goto L_0x0823
        L_0x084b:
            X.2yt r1 = X.C60642yt.A03
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L_0x0826
            if (r4 == 0) goto L_0x0826
            int r1 = r4.bitField0_
            boolean r1 = X.AnonymousClass0x2.A1X(r1)
            if (r1 == 0) goto L_0x0826
            int r2 = r4.bitField0_
            r1 = 131072(0x20000, float:1.83671E-40)
            r2 = r2 & r1
            if (r2 == 0) goto L_0x0826
            X.1Ag r3 = r4.deleteChatAction_
            if (r3 != 0) goto L_0x086a
            X.1Ag r3 = X.C21031Ag.DEFAULT_INSTANCE
        L_0x086a:
            int r1 = r3.bitField0_
            boolean r2 = X.AnonymousClass0x2.A1X(r1)
            X.1CO r1 = r3.messageRange_
            if (r1 != 0) goto L_0x0876
            X.1CO r1 = X.AnonymousClass1CO.DEFAULT_INSTANCE
        L_0x0876:
            X.35N r9 = X.AnonymousClass35N.A02(r1, r2)
            boolean r14 = r5.booleanValue()
            long r1 = r4.timestamp_
            X.33J r0 = r0.A02
            X.1ST r7 = new X.1ST
            r8 = r0
            r11 = r17
            r12 = r1
            r15 = r23
            r7.<init>(r8, r9, r10, r11, r12, r14, r15)
            return r7
        L_0x088e:
            boolean r1 = r2 instanceof X.C22621Ox
            if (r1 == 0) goto L_0x0940
            java.lang.String[] r6 = r0.A06
            X.2yt r5 = r0.A01
            X.1EO r3 = r0.A03
            int r2 = r6.length
            r1 = 2
            r4 = 0
            if (r2 != r1) goto L_0x08c3
            java.lang.String r1 = "contact"
            boolean r1 = A01(r1, r6)
            if (r1 == 0) goto L_0x08c3
            r2 = 1
            r1 = r6[r2]
            com.whatsapp.jid.UserJid r16 = X.AnonymousClass32Y.A08(r1)
            if (r16 != 0) goto L_0x08c4
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "contact-mutation/from-key-value unable to create user jid from "
            r1.append(r0)
            r0 = r6[r2]
            r1.append(r0)
        L_0x08bc:
            java.lang.String r0 = r1.toString()
        L_0x08c0:
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x08c3:
            return r4
        L_0x08c4:
            X.2yt r13 = X.C60642yt.A03
            boolean r1 = r13.equals(r5)
            if (r1 == 0) goto L_0x0918
            if (r3 == 0) goto L_0x0915
            int r1 = r3.bitField0_
            boolean r1 = X.AnonymousClass0x2.A1X(r1)
            if (r1 == 0) goto L_0x0915
            int r1 = r3.bitField0_
            r1 = r1 & 4
            if (r1 == 0) goto L_0x0915
            long r1 = r3.timestamp_
            X.1CM r7 = r3.contactAction_
            if (r7 != 0) goto L_0x08e4
            X.1CM r7 = X.AnonymousClass1CM.DEFAULT_INSTANCE
        L_0x08e4:
            int r6 = r7.bitField0_
            r3 = r6 & 1
            if (r3 == 0) goto L_0x0912
            java.lang.String r5 = r7.fullName_
            r3 = r6 & 2
            if (r3 == 0) goto L_0x08f2
            java.lang.String r4 = r7.firstName_
        L_0x08f2:
            r3 = r6 & 4
            if (r3 == 0) goto L_0x0910
            java.lang.String r3 = r7.lidJid_
            com.whatsapp.jid.UserJid r15 = X.AnonymousClass32Y.A08(r3)
            boolean r3 = r15 instanceof X.C27981fH
            if (r3 == 0) goto L_0x0910
            X.1fH r15 = (X.C27981fH) r15
        L_0x0902:
            X.33J r14 = r0.A02
            X.1SN r12 = new X.1SN
            r18 = r4
            r19 = r5
            r20 = r1
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20)
            return r12
        L_0x0910:
            r15 = 0
            goto L_0x0902
        L_0x0912:
            java.lang.String r0 = "contact-mutation/from-key-value fullName was not in contactAction protobuf"
            goto L_0x08c0
        L_0x0915:
            java.lang.String r0 = "contact-mutation/from-key-value syncActionValue is null, missing timestamp, or is missing contactAction"
            goto L_0x08c0
        L_0x0918:
            X.2yt r2 = X.C60642yt.A02
            boolean r1 = r2.equals(r5)
            if (r1 == 0) goto L_0x0932
            r9 = 0
            X.33J r0 = r0.A02
            X.1SN r12 = new X.1SN
            r8 = r4
            r1 = r12
            r3 = r0
            r5 = r16
            r6 = r17
            r7 = r4
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return r12
        L_0x0932:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "contact-mutation/from-key-value unknown operation: "
            r1.append(r0)
            r1.append(r5)
            goto L_0x08bc
        L_0x0940:
            boolean r1 = r2 instanceof X.C22531Oo
            if (r1 == 0) goto L_0x0a60
            java.lang.String[] r10 = r0.A06
            X.2yt r9 = r0.A01
            X.1EO r4 = r0.A03
            int r2 = r10.length
            r1 = 4
            r13 = 0
            if (r2 != r1) goto L_0x04a3
            java.lang.String r1 = "clearChat"
            boolean r1 = A01(r1, r10)
            if (r1 == 0) goto L_0x04a3
            r1 = 1
            r1 = r10[r1]
            X.4uZ r16 = X.C18310x6.A0S(r1)
            if (r16 != 0) goto L_0x0966
            java.lang.String r0 = "clear-chat-mutation/from-key-value unable to create chat jid"
        L_0x0962:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return r13
        L_0x0966:
            r8 = 2
            r1 = r10[r8]
            java.lang.Boolean r7 = X.AnonymousClass34E.A00(r1)
            java.lang.String r6 = " is not one of the valid strings"
            java.lang.String r3 = " at index="
            java.lang.String r2 = "clear-chat-mutation/from-key-value value="
            if (r7 == 0) goto L_0x09c3
            r8 = 3
            r1 = r10[r8]
            java.lang.Boolean r5 = X.AnonymousClass34E.A00(r1)
            if (r5 == 0) goto L_0x09c3
            X.2yt r1 = X.C60642yt.A03
            boolean r1 = r1.equals(r9)
            if (r1 == 0) goto L_0x04a3
            if (r4 == 0) goto L_0x04a3
            int r1 = r4.bitField0_
            boolean r1 = X.AnonymousClass0x2.A1X(r1)
            if (r1 == 0) goto L_0x04a3
            int r2 = r4.bitField0_
            r1 = 65536(0x10000, float:9.18355E-41)
            r2 = r2 & r1
            if (r2 == 0) goto L_0x04a3
            X.1Af r3 = r4.clearChatAction_
            if (r3 != 0) goto L_0x099d
            X.1Af r3 = X.C21021Af.DEFAULT_INSTANCE
        L_0x099d:
            int r1 = r3.bitField0_
            boolean r2 = X.AnonymousClass0x2.A1X(r1)
            X.1CO r1 = r3.messageRange_
            if (r1 != 0) goto L_0x09a9
            X.1CO r1 = X.AnonymousClass1CO.DEFAULT_INSTANCE
        L_0x09a9:
            X.35N r15 = X.AnonymousClass35N.A02(r1, r2)
            boolean r20 = r7.booleanValue()
            boolean r21 = r5.booleanValue()
            long r1 = r4.timestamp_
            X.33J r14 = r0.A02
            X.1SU r13 = new X.1SU
            r18 = r1
            r22 = r23
            r13.<init>(r14, r15, r16, r17, r18, r20, r21, r22)
            return r13
        L_0x09c3:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r2)
            r0 = r10[r8]
            r1.append(r0)
            X.C18270x1.A19(r3, r6, r1, r8)
            java.lang.String r0 = r1.toString()
            goto L_0x0962
        L_0x09d4:
            X.2yt r1 = X.C60642yt.A03
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x01a6
            if (r4 == 0) goto L_0x01a6
            int r1 = r4.bitField0_
            boolean r1 = X.AnonymousClass0x2.A1X(r1)
            if (r1 == 0) goto L_0x01a6
            int r1 = r4.bitField0_
            r1 = r1 & 16
            if (r1 == 0) goto L_0x01a6
            X.1Al r1 = r4.pinAction_
            r2 = r1
            if (r1 != 0) goto L_0x09f3
            X.1Al r1 = X.C21081Al.DEFAULT_INSTANCE
        L_0x09f3:
            int r1 = r1.bitField0_
            r1 = r1 & 1
            if (r1 == 0) goto L_0x01a6
            if (r2 != 0) goto L_0x09fd
            X.1Al r2 = X.C21081Al.DEFAULT_INSTANCE
        L_0x09fd:
            boolean r3 = r2.pinned_
            long r1 = r4.timestamp_
            X.33J r0 = r0.A02
            X.1SY r6 = new X.1SY
            r7 = r0
            r9 = r17
            r10 = r1
            r12 = r3
            r13 = r23
            r6.<init>(r7, r8, r9, r10, r12, r13)
            return r6
        L_0x0a10:
            X.2yt r1 = X.C60642yt.A03
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x01a6
            if (r4 == 0) goto L_0x01a6
            int r1 = r4.bitField0_
            boolean r1 = X.AnonymousClass0x2.A1X(r1)
            if (r1 == 0) goto L_0x01a6
            int r2 = r4.bitField0_
            r1 = 32768(0x8000, float:4.5918E-41)
            r2 = r2 & r1
            if (r2 == 0) goto L_0x01a6
            X.1Bf r1 = r4.markChatAsReadAction_
            r3 = r1
            if (r1 != 0) goto L_0x0a31
            X.1Bf r1 = X.C21281Bf.DEFAULT_INSTANCE
        L_0x0a31:
            int r1 = r1.bitField0_
            r1 = r1 & 1
            if (r1 == 0) goto L_0x01a6
            if (r3 != 0) goto L_0x0a3b
            X.1Bf r3 = X.C21281Bf.DEFAULT_INSTANCE
        L_0x0a3b:
            int r1 = r3.bitField0_
            r1 = r1 & 2
            boolean r2 = X.AnonymousClass000.A1S(r1)
            X.1CO r1 = r3.messageRange_
            if (r1 != 0) goto L_0x0a49
            X.1CO r1 = X.AnonymousClass1CO.DEFAULT_INSTANCE
        L_0x0a49:
            X.35N r8 = X.AnonymousClass35N.A02(r1, r2)
            boolean r3 = r3.read_
            long r1 = r4.timestamp_
            X.33J r0 = r0.A02
            X.1SV r6 = new X.1SV
            r7 = r0
            r10 = r17
            r11 = r1
            r13 = r3
            r14 = r23
            r6.<init>(r7, r8, r9, r10, r11, r13, r14)
            return r6
        L_0x0a60:
            boolean r1 = r2 instanceof X.C22481Of
            if (r1 == 0) goto L_0x0b19
            X.1Of r2 = (X.C22481Of) r2
            r6 = 2
            X.2sr r12 = r2.A00
            r4 = 1
            java.lang.String[] r3 = r0.A06
            X.C162457s7.A0C(r3)
            int r2 = r3.length
            r1 = 4
            r11 = 0
            if (r2 != r1) goto L_0x0a8b
            java.lang.String r1 = "call_log"
            boolean r1 = A01(r1, r3)
            if (r1 == 0) goto L_0x0a8b
            X.32Y r2 = com.whatsapp.jid.UserJid.Companion
            r1 = r3[r4]
            com.whatsapp.jid.UserJid r4 = r2.A0E(r1)
            if (r4 != 0) goto L_0x0a8c
            java.lang.String r0 = "CallLogSyncMutation/fromKeyValue unable to create call creator jid"
        L_0x0a88:
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0a8b:
            return r11
        L_0x0a8c:
            r1 = 3
            r1 = r3[r1]
            java.lang.Boolean r5 = X.AnonymousClass34E.A00(r1)
            if (r5 != 0) goto L_0x0a98
            java.lang.String r0 = "CallLogSyncMutation/fromKeyValue unable to create is incoming value"
            goto L_0x0a88
        L_0x0a98:
            r3 = r3[r6]
            X.2yt r6 = r0.A01
            X.C162457s7.A0C(r6)
            X.1EO r2 = r0.A03
            if (r2 == 0) goto L_0x0a8b
            int r1 = r2.bitField0_
            boolean r1 = X.AnonymousClass0x2.A1X(r1)
            if (r1 == 0) goto L_0x0a8b
            X.2yt r14 = X.C60642yt.A02
            boolean r1 = r14.equals(r6)
            if (r1 == 0) goto L_0x0acd
            X.33J r15 = r0.A02
            X.C162457s7.A0H(r3)
            boolean r0 = r5.booleanValue()
            X.2lP r13 = new X.2lP
            r13.<init>(r4, r3, r0)
            r16 = 0
            r1 = 0
        L_0x0ac5:
            X.1SC r11 = new X.1SC
            r18 = r1
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            return r11
        L_0x0acd:
            X.1Ae r1 = r2.callLogAction_
            if (r1 != 0) goto L_0x0ad5
            X.1Ae r1 = X.C21011Ae.DEFAULT_INSTANCE
            if (r1 == 0) goto L_0x0a8b
        L_0x0ad5:
            X.1E6 r7 = r1.callLogRecord_
            if (r7 != 0) goto L_0x0ade
            X.1E6 r7 = X.AnonymousClass1E6.DEFAULT_INSTANCE
            if (r7 != 0) goto L_0x0ade
            return r11
        L_0x0ade:
            java.lang.String r6 = r4.getRawString()
            java.lang.String r1 = r7.callCreatorJid_
            boolean r1 = X.C162457s7.A0P(r6, r1)
            if (r1 == 0) goto L_0x0b15
            java.lang.String r1 = r7.callId_
            boolean r1 = X.C162457s7.A0P(r3, r1)
            if (r1 == 0) goto L_0x0b15
            boolean r1 = r7.isIncoming_
            boolean r1 = X.C18320x8.A1W(r5, r1)
            if (r1 == 0) goto L_0x0b15
            X.35H r1 = X.AnonymousClass35H.A00
            X.3ZF r16 = r1.A03(r7)
            if (r16 == 0) goto L_0x0a8b
            long r1 = r2.timestamp_
            X.33J r15 = r0.A02
            X.2yt r14 = X.C60642yt.A03
            X.C162457s7.A0H(r3)
            boolean r0 = r5.booleanValue()
            X.2lP r13 = new X.2lP
            r13.<init>(r4, r3, r0)
            goto L_0x0ac5
        L_0x0b15:
            java.lang.String r0 = "CallLogSyncMutation/fromKeyValue critical values are not matched in mutation index and value"
            goto L_0x0a88
        L_0x0b19:
            boolean r1 = r2 instanceof X.C22581Ot
            java.lang.String[] r5 = r0.A06
            if (r1 == 0) goto L_0x0b96
            X.2yt r3 = r0.A01
            X.1EO r4 = r0.A03
            int r2 = r5.length
            r1 = 2
            r6 = 0
            if (r2 != r1) goto L_0x01a6
            java.lang.String r1 = "archive"
            boolean r1 = A01(r1, r5)
            if (r1 == 0) goto L_0x01a6
            r2 = 1
            r1 = r5[r2]
            X.4uZ r9 = X.C18310x6.A0S(r1)
            if (r9 != 0) goto L_0x0b48
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "archive-chat-mutation/from-key-value unable to create chat jid from "
            r1.append(r0)
            r0 = r5[r2]
            X.C18260x0.A1K(r1, r0)
            return r6
        L_0x0b48:
            X.2yt r1 = X.C60642yt.A03
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x01a6
            if (r4 == 0) goto L_0x01a6
            int r1 = r4.bitField0_
            boolean r1 = X.AnonymousClass0x2.A1X(r1)
            if (r1 == 0) goto L_0x01a6
            int r1 = r4.bitField0_
            r1 = r1 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L_0x01a6
            X.1Bd r1 = r4.archiveChatAction_
            r3 = r1
            if (r1 != 0) goto L_0x0b67
            X.1Bd r1 = X.C21261Bd.DEFAULT_INSTANCE
        L_0x0b67:
            int r1 = r1.bitField0_
            r1 = r1 & 1
            if (r1 == 0) goto L_0x01a6
            if (r3 != 0) goto L_0x0b71
            X.1Bd r3 = X.C21261Bd.DEFAULT_INSTANCE
        L_0x0b71:
            int r1 = r3.bitField0_
            r1 = r1 & 2
            boolean r2 = X.AnonymousClass000.A1S(r1)
            X.1CO r1 = r3.messageRange_
            if (r1 != 0) goto L_0x0b7f
            X.1CO r1 = X.AnonymousClass1CO.DEFAULT_INSTANCE
        L_0x0b7f:
            X.35N r8 = X.AnonymousClass35N.A02(r1, r2)
            boolean r3 = r3.archived_
            long r1 = r4.timestamp_
            X.33J r0 = r0.A02
            X.1SW r6 = new X.1SW
            r7 = r0
            r10 = r17
            r11 = r1
            r13 = r3
            r14 = r23
            r6.<init>(r7, r8, r9, r10, r11, r13, r14)
            return r6
        L_0x0b96:
            X.2yt r4 = r0.A01
            X.1EO r3 = r0.A03
            int r2 = r5.length
            r1 = 1
            r6 = 0
            if (r2 != r1) goto L_0x01a6
            java.lang.String r1 = "android_unsupported_actions"
            boolean r1 = A01(r1, r5)
            if (r1 == 0) goto L_0x01a6
            X.2yt r1 = X.C60642yt.A03
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x01a6
            if (r3 == 0) goto L_0x01a6
            int r1 = r3.bitField0_
            boolean r1 = X.AnonymousClass0x2.A1X(r1)
            if (r1 == 0) goto L_0x01a6
            int r2 = r3.bitField0_
            r1 = 1048576(0x100000, float:1.469368E-39)
            r2 = r2 & r1
            if (r2 == 0) goto L_0x01a6
            X.1Ac r1 = r3.androidUnsupportedActions_
            if (r1 != 0) goto L_0x0bc6
            X.1Ac r1 = X.C20991Ac.DEFAULT_INSTANCE
        L_0x0bc6:
            int r1 = r1.bitField0_
            r1 = r1 & 1
            if (r1 == 0) goto L_0x01a6
            long r1 = r3.timestamp_
            X.33J r0 = r0.A02
            X.1SD r6 = new X.1SD
            r7 = r0
            r8 = r17
            r9 = r1
            r11 = r23
            r6.<init>(r7, r8, r9, r11)
            return r6
        L_0x0bdc:
            X.2yt r1 = X.C60642yt.A03
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x005e
            if (r2 == 0) goto L_0x005e
            int r1 = r2.bitField0_
            boolean r1 = X.AnonymousClass0x2.A1X(r1)
            if (r1 == 0) goto L_0x005e
            int r1 = r2.bitField0_
            r1 = r1 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L_0x005e
            X.1Ai r1 = r2.keyExpiration_
            r4 = r1
            if (r1 != 0) goto L_0x0bfb
            X.1Ai r1 = X.C21051Ai.DEFAULT_INSTANCE
        L_0x0bfb:
            int r1 = r1.bitField0_
            r1 = r1 & 1
            if (r1 == 0) goto L_0x005e
            long r2 = r2.timestamp_
            if (r4 != 0) goto L_0x0c07
            X.1Ai r4 = X.C21051Ai.DEFAULT_INSTANCE
        L_0x0c07:
            int r1 = r4.expiredKeyEpoch_
            X.33J r0 = r0.A02
            X.1SH r15 = new X.1SH
            r18 = r5
            r19 = r1
            r20 = r2
            r22 = r23
            r16 = r0
            r15.<init>(r16, r17, r18, r19, r20, r22)
            return r15
        L_0x0c1b:
            X.2yt r1 = X.C60642yt.A03
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x005e
            if (r3 == 0) goto L_0x005e
            int r1 = r3.bitField0_
            boolean r1 = X.AnonymousClass0x2.A1X(r1)
            if (r1 == 0) goto L_0x005e
            int r2 = r3.bitField0_
            r1 = 268435456(0x10000000, float:2.5243549E-29)
            r2 = r2 & r1
            if (r2 == 0) goto L_0x005e
            X.1Aq r1 = r3.removeRecentStickerAction_
            r2 = r1
            if (r1 != 0) goto L_0x0c3b
            X.1Aq r1 = X.C21131Aq.DEFAULT_INSTANCE
        L_0x0c3b:
            int r1 = r1.bitField0_
            r1 = r1 & 1
            if (r1 == 0) goto L_0x005e
            long r3 = r3.timestamp_
            if (r2 != 0) goto L_0x0c47
            X.1Aq r2 = X.C21131Aq.DEFAULT_INSTANCE
        L_0x0c47:
            long r1 = r2.lastStickerSentTs_
            X.33J r0 = r0.A02
            X.1SO r15 = new X.1SO
            r19 = r3
            r21 = r1
            r16 = r0
            r15.<init>(r16, r17, r18, r19, r21, r23)
            return r15
        L_0x0c57:
            if (r7 > r1) goto L_0x0c6b
            r10 = r6[r7]
        L_0x0c5b:
            X.33J r0 = r0.A02
            X.1P4 r6 = new X.1P4
            r7 = r2
            r8 = r0
            r9 = r5
            r11 = r17
            r12 = r3
            r14 = r23
            r6.<init>(r7, r8, r9, r10, r11, r12, r14)
            return r6
        L_0x0c6b:
            r10 = 0
            goto L_0x0c5b
        L_0x0c6d:
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "PropertySyncHandler failed to parse mutation, operation: "
            r2.append(r0)
            r2.append(r3)
            X.AnonymousClass001.A1M(r2)
            r6 = 0
            if (r4 == 0) goto L_0x0c89
            long r0 = r4.timestamp_
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        L_0x0c85:
            X.C18270x1.A17(r0, r2)
            return r6
        L_0x0c89:
            r0 = r6
            goto L_0x0c85
        L_0x0c8b:
            X.2yt r15 = X.C60642yt.A02
            boolean r1 = r15.equals(r6)
            if (r1 == 0) goto L_0x0ca3
            r1 = 0
            X.33J r0 = r0.A02
        L_0x0c97:
            X.1SA r14 = new X.1SA
            r18 = r4
            r20 = r1
            r16 = r0
            r14.<init>(r15, r16, r17, r18, r19, r20)
            return r14
        L_0x0ca3:
            long r1 = r5.timestamp_
            X.33J r0 = r0.A02
            X.2yt r15 = X.C60642yt.A03
            goto L_0x0c97
        L_0x0caa:
            X.2yt r1 = X.C60642yt.A03
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0d16
            if (r6 == 0) goto L_0x0d16
            int r1 = r6.bitField0_
            boolean r1 = X.AnonymousClass0x2.A1X(r1)
            if (r1 == 0) goto L_0x0d16
            int r1 = r6.bitField0_
            r1 = r1 & 8
            if (r1 == 0) goto L_0x0d16
            X.1CN r1 = r6.muteAction_
            r7 = r1
            if (r1 != 0) goto L_0x0cc9
            X.1CN r1 = X.AnonymousClass1CN.DEFAULT_INSTANCE
        L_0x0cc9:
            int r1 = r1.bitField0_
            r1 = r1 & 1
            if (r1 == 0) goto L_0x0d16
            r1 = r7
            if (r7 != 0) goto L_0x0cd4
            X.1CN r1 = X.AnonymousClass1CN.DEFAULT_INSTANCE
        L_0x0cd4:
            boolean r1 = r1.muted_
            if (r1 == 0) goto L_0x0d13
            r1 = r7
            if (r7 != 0) goto L_0x0cdd
            X.1CN r1 = X.AnonymousClass1CN.DEFAULT_INSTANCE
        L_0x0cdd:
            int r1 = r1.bitField0_
            r1 = r1 & 2
            if (r1 == 0) goto L_0x0d13
            r1 = r7
            if (r7 != 0) goto L_0x0ce8
            X.1CN r1 = X.AnonymousClass1CN.DEFAULT_INSTANCE
        L_0x0ce8:
            long r4 = r1.muteEndTimestamp_
            r2 = 0
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 >= 0) goto L_0x0cf6
            r2 = -1
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 != 0) goto L_0x0d13
        L_0x0cf6:
            r1 = r7
            if (r7 != 0) goto L_0x0cfb
            X.1CN r1 = X.AnonymousClass1CN.DEFAULT_INSTANCE
        L_0x0cfb:
            long r2 = r1.muteEndTimestamp_
        L_0x0cfd:
            if (r7 != 0) goto L_0x0d01
            X.1CN r7 = X.AnonymousClass1CN.DEFAULT_INSTANCE
        L_0x0d01:
            boolean r4 = r7.muted_
            X.33J r15 = r0.A02
            long r0 = r6.timestamp_
            X.1SX r14 = new X.1SX
            r18 = r2
            r20 = r0
            r22 = r4
            r14.<init>(r15, r16, r17, r18, r20, r22, r23)
            return r14
        L_0x0d13:
            r2 = 0
            goto L_0x0cfd
        L_0x0d16:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56822sc.A02(X.35M, java.lang.String, boolean):X.33W");
    }

    public String A03() {
        if (this instanceof AnonymousClass1On) {
            return "regular_low";
        }
        if (this instanceof C22451Oc) {
            return "regular_high";
        }
        if ((this instanceof C22601Ov) || (this instanceof AnonymousClass1Ol)) {
            return "regular_low";
        }
        if ((this instanceof AnonymousClass1Ok) || (this instanceof C22591Ou)) {
            return "regular_high";
        }
        if (this instanceof C22471Oe) {
            return "regular";
        }
        if (this instanceof C22521Oj) {
            return null;
        }
        if (this instanceof AnonymousClass1Om) {
            return "regular_low";
        }
        if (this instanceof C22441Ob) {
            return "critical_block";
        }
        if (this instanceof C22501Oh) {
            return "regular_low";
        }
        if ((this instanceof C22571Os) || (this instanceof C22431Oa)) {
            return "regular";
        }
        if (this instanceof C22551Oq) {
            return "regular_low";
        }
        if (this instanceof C22511Oi) {
            return "regular_high";
        }
        if (this instanceof C22561Or) {
            return "regular_low";
        }
        if (this instanceof C22491Og) {
            return "critical_block";
        }
        if (this instanceof C22611Ow) {
            return "regular_low";
        }
        if ((this instanceof C22461Od) || (this instanceof C22541Op)) {
            return "regular_high";
        }
        if (this instanceof C22621Ox) {
            return "critical_unblock_low";
        }
        if (this instanceof C22531Oo) {
            return "regular_high";
        }
        if (this instanceof C22481Of) {
            return "regular";
        }
        if ((this instanceof C22581Ot) || (this instanceof AnonymousClass1OZ) || (this instanceof AnonymousClass1P2) || (this instanceof AnonymousClass1P1)) {
            return "regular_low";
        }
        if ((this instanceof AnonymousClass1P0) || (this instanceof C22641Oz)) {
            return "regular";
        }
        return "regular_high";
    }

    public String A04() {
        if (this instanceof AnonymousClass1On) {
            return "nux";
        }
        if (this instanceof AnonymousClass1P3) {
            return ((AnonymousClass1P3) this).A0D().mutationName;
        }
        if (this instanceof C22451Oc) {
            return "userStatusMute";
        }
        if (this instanceof C22601Ov) {
            return "setting_unarchiveChats";
        }
        if (this instanceof AnonymousClass1Ol) {
            return "time_format";
        }
        if (this instanceof AnonymousClass1Ok) {
            return "status_privacy";
        }
        if (this instanceof C22591Ou) {
            return "star";
        }
        if (this instanceof C22471Oe) {
            return "shareOwnPn";
        }
        if (this instanceof C22521Oj) {
            return "sentinel";
        }
        if (this instanceof AnonymousClass1Om) {
            return "removeRecentSticker";
        }
        if (this instanceof C22441Ob) {
            return "setting_pushName";
        }
        if (this instanceof C22501Oh) {
            return "primary_version";
        }
        if (this instanceof C22571Os) {
            return "primary_feature";
        }
        if (this instanceof C22431Oa) {
            return "pnForLidChat";
        }
        if (this instanceof C22551Oq) {
            return "pin_v1";
        }
        if (this instanceof C22511Oi) {
            return "mute";
        }
        if (this instanceof C22561Or) {
            return "markChatAsRead";
        }
        if (this instanceof C22491Og) {
            return "setting_locale";
        }
        if (this instanceof C22611Ow) {
            return "favoriteSticker";
        }
        if (this instanceof C22461Od) {
            return "deleteMessageForMe";
        }
        if (this instanceof C22541Op) {
            return "deleteChat";
        }
        if (this instanceof C22621Ox) {
            return "contact";
        }
        if (this instanceof C22531Oo) {
            return "clearChat";
        }
        if (this instanceof C22481Of) {
            return "call_log";
        }
        if (this instanceof C22581Ot) {
            return "archive";
        }
        return "android_unsupported_actions";
    }

    public List A05(boolean z) {
        ArrayList arrayList;
        boolean z2;
        Cursor A01;
        Cursor B9f;
        if (this instanceof AnonymousClass1On) {
            AnonymousClass1On r0 = (AnonymousClass1On) this;
            arrayList = AnonymousClass001.A0s();
            Iterator it = r0.A00.A00.A00().iterator();
            while (it.hasNext()) {
                arrayList.add(new AnonymousClass1SR((AnonymousClass33J) null, (String) null, AnonymousClass001.A0m(it), r0.A02.A0H(), true));
            }
        } else if (this instanceof AnonymousClass1P3) {
            AnonymousClass1P3 r02 = (AnonymousClass1P3) this;
            List<C51452jq> A0E = r02.A0E();
            arrayList = C73783g4.A0c(A0E);
            for (C51452jq r5 : A0E) {
                C44322Vp r2 = r02.A00;
                C162457s7.A0J(r5, 0);
                long A0H = r2.A00.A0H();
                arrayList.add(new AnonymousClass1SB(r02, (AnonymousClass33J) null, r5.A00, r5.A01, (String) null, A0H, false));
            }
        } else if (this instanceof C22451Oc) {
            C22451Oc r03 = (C22451Oc) this;
            arrayList = AnonymousClass001.A0s();
            AnonymousClass1R1 r4 = r03.A02;
            AnonymousClass4GK A02 = C18630y0.A02(r4);
            try {
                C56862sg r6 = ((AnonymousClass3H0) A02).A03;
                String[] strArr = new String[1];
                C18270x1.A1O(strArr, 1);
                Cursor A0E2 = r6.A0E("SELECT jid FROM settings WHERE status_muted = ?", "GET_USER_JIDS_WITH_MUTED_STATUSES", strArr);
                try {
                    ArrayList A0s = AnonymousClass001.A0s();
                    if (A0E2 != null) {
                        int columnIndex = A0E2.getColumnIndex("jid");
                        while (A0E2.moveToNext()) {
                            Jid A012 = AnonymousClass32W.A01(A0E2.getString(columnIndex));
                            if (A012 instanceof UserJid) {
                                A0s.add(A012);
                            }
                        }
                    }
                    if (A0E2 != null) {
                        A0E2.close();
                    }
                    A02.close();
                    Iterator it2 = A0s.iterator();
                    while (it2.hasNext()) {
                        UserJid A0T = C18310x6.A0T(it2);
                        if (AnonymousClass1R1.A00(C106405Yw.A03(A0T), r4).A0J) {
                            long A0H2 = r03.A00.A0H();
                            C162457s7.A0J(A0T, 1);
                            arrayList.add(new AnonymousClass1SM((AnonymousClass33J) null, A0T, (String) null, A0H2, true, false));
                        }
                    }
                } catch (AnonymousClass24P e) {
                    Log.e("ChatSettingsStore#getAllMutedStatusJids. Failed to map jid", e);
                } catch (Throwable th) {
                    if (A0E2 != null) {
                        A0E2.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                try {
                    A02.close();
                    throw th;
                } catch (Throwable th3) {
                    th.addSuppressed(th3);
                    throw th;
                }
            }
        } else if (this instanceof C22601Ov) {
            C22601Ov r04 = (C22601Ov) this;
            AnonymousClass33p r22 = r04.A06;
            if (!r22.A28() || r04.A00.A0Y()) {
                Log.i("unarchive-chats-setting-handler/createBootstrapMutations/empty");
                return Collections.emptyList();
            }
            Log.i("unarchive-chats-setting-handler/createBootstrapMutations");
            if (z) {
                return r04.A0D();
            }
            return Collections.singletonList(new AnonymousClass1SJ((AnonymousClass33J) null, (String) null, r04.A05.A0H(), C18280x3.A1W(AnonymousClass0x2.A0F(r22), "notify_new_message_for_archived_chats")));
        } else if (this instanceof AnonymousClass1Ol) {
            AnonymousClass1Ol r05 = (AnonymousClass1Ol) this;
            C56972sr.A07(r05.A00);
            return Collections.singletonList(new AnonymousClass1SI((AnonymousClass33J) null, (String) null, r05.A01.A0H(), r05.A02.A05().A00));
        } else if (this instanceof AnonymousClass1Ok) {
            return C18290x4.A12(((AnonymousClass1Ok) this).A0D());
        } else {
            if (this instanceof C22591Ou) {
                C22591Ou r06 = (C22591Ou) this;
                AnonymousClass4GK A03 = r06.A05.get();
                try {
                    B9f = r06.A04.B9f((AnonymousClass0QU) null, (C95814uZ) null, (C56532s8) null);
                    List A0D = r06.A0D(B9f, true);
                    B9f.close();
                    A03.close();
                    return A0D;
                } catch (Throwable th4) {
                    th = th4;
                    A03.close();
                    throw th;
                }
            } else if (this instanceof C22471Oe) {
                C22471Oe r07 = (C22471Oe) this;
                Set A0F = r07.A01.A0F();
                C162457s7.A0D(A0F);
                AnonymousClass4C5 A04 = C829345m.A04(C826944o.A00, new C626335w(A0F, 1));
                C162457s7.A0K(A04, "null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesKt.filterIsInstance>");
                return C829345m.A01(new C72623e1(new C817941c(r07), C829345m.A04(new C817841b(r07), A04)));
            } else {
                if (!(this instanceof C22521Oj)) {
                    if (this instanceof AnonymousClass1Om) {
                        return AnonymousClass001.A0s();
                    }
                    if (this instanceof C22441Ob) {
                        C22441Ob r08 = (C22441Ob) this;
                        return Collections.singletonList(new AnonymousClass1SG((AnonymousClass33J) null, (String) null, r08.A00.A0D.A03(), r08.A01.A0H()));
                    } else if (this instanceof C22501Oh) {
                        C22501Oh r09 = (C22501Oh) this;
                        arrayList = AnonymousClass002.A0I(2);
                        arrayList.add(r09.A0D("current"));
                        if (!z) {
                            arrayList.add(r09.A0D("session_start"));
                        }
                    } else if (this instanceof C22571Os) {
                        C22571Os r010 = (C22571Os) this;
                        List A0D2 = r010.A0D();
                        A0D2.contains("payment_info_sync_support");
                        return Collections.singletonList(new AnonymousClass1SF((AnonymousClass33J) null, (String) null, A0D2, r010.A02.A0H()));
                    } else {
                        if (!(this instanceof C22431Oa)) {
                            if (this instanceof C22551Oq) {
                                C22551Oq r011 = (C22551Oq) this;
                                ArrayList A0s2 = AnonymousClass001.A0s();
                                Iterator A0q = AnonymousClass000.A0q(r011.A08.A0Q());
                                while (A0q.hasNext()) {
                                    Map.Entry A0w = AnonymousClass001.A0w(A0q);
                                    A0s2.add(new AnonymousClass1SY(C18320x8.A0N(A0w), C18310x6.A0B(A0w.getValue()), true));
                                }
                                if (z) {
                                    r011.A0D(A0s2);
                                }
                                arrayList = AnonymousClass001.A0s();
                                Iterator it3 = A0s2.iterator();
                                while (it3.hasNext()) {
                                    AnonymousClass1SY r3 = (AnonymousClass1SY) it3.next();
                                    r011.A02.A07(1);
                                    C95814uZ r8 = r3.A00;
                                    arrayList.add(new AnonymousClass1SW(r011.A01.A04(r8, false), r8, r011.A03.A0H(), false));
                                    arrayList.add(r3);
                                }
                            } else if (this instanceof C22511Oi) {
                                C22511Oi r012 = (C22511Oi) this;
                                arrayList = AnonymousClass001.A0s();
                                AnonymousClass1R1 r23 = r012.A02;
                                HashSet A0K = AnonymousClass002.A0K();
                                AnonymousClass4GK A022 = C18630y0.A02(r23);
                                try {
                                    A01 = C56862sg.A01(((AnonymousClass3H0) A022).A03, "SELECT jid, mute_end FROM settings WHERE mute_end IS NOT NULL", "GET_MUTED_CHAT_JID_WITH_END_TIME");
                                    int columnIndex2 = A01.getColumnIndex("jid");
                                    int columnIndex3 = A01.getColumnIndex("mute_end");
                                    while (A01.moveToNext()) {
                                        C95814uZ A0K2 = AnonymousClass0x2.A0K(A01, columnIndex2);
                                        if (A0K2 != null) {
                                            AnonymousClass0x2.A1F(A0K2, C18280x3.A0T(A01, columnIndex3), A0K);
                                        }
                                    }
                                    A01.close();
                                    A022.close();
                                    Iterator it4 = A0K.iterator();
                                    while (it4.hasNext()) {
                                        Pair A0D3 = AnonymousClass0x9.A0D(it4);
                                        C95814uZ r9 = (C95814uZ) A0D3.first;
                                        long A0B = C18310x6.A0B(A0D3.second);
                                        C56612sH r52 = r012.A00;
                                        if (A0B > System.currentTimeMillis() || A0B == -1) {
                                            arrayList.add(new AnonymousClass1SX((AnonymousClass33J) null, r9, (String) null, A0B, r52.A0H(), true, false));
                                        }
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    A022.close();
                                    throw th;
                                }
                            } else if (this instanceof C22561Or) {
                                C22561Or r013 = (C22561Or) this;
                                arrayList = AnonymousClass001.A0s();
                                C56982ss r7 = r013.A03;
                                ArrayList A0s3 = AnonymousClass001.A0s();
                                ConcurrentHashMap A0G = r7.A0G();
                                synchronized (r7) {
                                    z2 = r7.A00;
                                }
                                if (z2) {
                                    Iterator A0u = AnonymousClass001.A0u(A0G);
                                    while (A0u.hasNext()) {
                                        Map.Entry A0w2 = AnonymousClass001.A0w(A0u);
                                        C95814uZ A0N = C18320x8.A0N(A0w2);
                                        if (((AnonymousClass31A) A0w2.getValue()).A08 == -1 && !r7.A0Q(A0N)) {
                                            A0s3.add(A0N);
                                        }
                                    }
                                    Iterator it5 = A0s3.iterator();
                                    while (it5.hasNext()) {
                                        C95814uZ A0P = C18300x5.A0P(it5);
                                        arrayList.add(new AnonymousClass1SV((AnonymousClass33J) null, r013.A00.A04(A0P, false), A0P, (String) null, r013.A02.A0H(), false, false));
                                    }
                                } else {
                                    throw AnonymousClass001.A0e("ChatsCache/getMarkedAsUnreadChats: chat haven't initialized");
                                }
                            } else if (this instanceof C22491Og) {
                                return Collections.singletonList(new AnonymousClass1SE((AnonymousClass33J) null, (String) null, Locale.getDefault().toLanguageTag(), ((C22491Og) this).A01.A0H()));
                            } else {
                                if (this instanceof C22611Ow) {
                                    C22611Ow r014 = (C22611Ow) this;
                                    Log.i("FavoriteStickerHandler/createBootstrapMutations");
                                    C54962pZ r1 = r014.A07;
                                    C626936e.A00();
                                    List<AnonymousClass2UB> A013 = r1.A05.A01(150, 1);
                                    ArrayList A0p = AnonymousClass000.A0p(A013);
                                    for (AnonymousClass2UB r32 : A013) {
                                        AnonymousClass0x2.A1F(new C47192cr(r32.A0D, r32.A0G, r32.A0C, r32.A0E, r32.A0F, r32.A0B, r32.A09, r32.A08, (long) r32.A07), Long.valueOf(r32.A0A), A0p);
                                    }
                                    ArrayList A0y = C18290x4.A0y(A0p);
                                    Iterator it6 = A0p.iterator();
                                    while (it6.hasNext()) {
                                        Pair A0D4 = AnonymousClass0x9.A0D(it6);
                                        A0y.add(new AnonymousClass1SP((C47192cr) A0D4.first, (AnonymousClass33J) null, (String) null, r014.A01.A0D(), C18310x6.A0B(A0D4.second), true, false));
                                    }
                                    return A0y;
                                } else if (this instanceof C22461Od) {
                                    return AnonymousClass001.A0s();
                                } else {
                                    if (!(this instanceof C22541Op)) {
                                        if (this instanceof C22621Ox) {
                                            C626936e.A0D(false, "Please use createBootstrapMutations(initialData) method instead");
                                            return ((C22621Ox) this).A0E(Collections.emptyList());
                                        } else if (!(this instanceof C22531Oo)) {
                                            if (!(this instanceof C22481Of)) {
                                                if (!(this instanceof C22581Ot)) {
                                                    return Collections.singletonList(new AnonymousClass1SD((AnonymousClass33J) null, (String) null, ((AnonymousClass1OZ) this).A01.A0H(), false));
                                                }
                                                C22581Ot r015 = (C22581Ot) this;
                                                arrayList = AnonymousClass001.A0s();
                                                Iterator it7 = r015.A02.A06().iterator();
                                                while (it7.hasNext()) {
                                                    C95814uZ A0P2 = C18300x5.A0P(it7);
                                                    arrayList.add(new AnonymousClass1SW(r015.A00.A04(A0P2, false), A0P2, r015.A03.A0H(), true));
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        return C72023d3.A00;
                    }
                }
                return Collections.emptyList();
            }
        }
        return arrayList;
        throw th;
        throw th;
    }

    public final void A06(AnonymousClass33W r8) {
        C69833Yo Axl;
        String str;
        C85284Fq A0C = this.A00.A01.A0C();
        try {
            Axl = A0C.Axl();
            C56862sg r4 = ((AnonymousClass3H0) A0C).A03;
            String[] A1a = AnonymousClass0x9.A1a();
            A1a[0] = r8.A09();
            if (r8 instanceof C837649r) {
                str = ((C837649r) r8).getChatJid().getRawString();
            } else {
                str = null;
            }
            A1a[1] = str;
            A1a[2] = r8.A08();
            r4.A0I("UPDATE syncd_mutations SET are_dependencies_missing = 0, mutation_name = ?, chat_jid = ?  WHERE mutation_index = ? ", "SyncdMutationsStore.MARK_MUTATION_AS_APPLIED_BY_INDEX", A1a);
            Axl.A00();
            Axl.close();
            A0C.close();
            return;
        } catch (Throwable th) {
            try {
                A0C.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public final void A07(AnonymousClass33W r3) {
        this.A00.A0I(Collections.singleton(r3.A07));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: X.1SZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: X.1Od} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: X.1SZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: X.1Od} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: X.1SG} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: X.1Ob} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: X.1SZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: X.1Od} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: X.1SW} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: X.1Ot} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: X.1Oo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: X.1SU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: X.1Op} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: X.1ST} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: X.1Ow} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: X.1SP} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: X.1Or} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: X.1SV} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: X.1Oi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v17, resolved type: X.1SX} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: X.1Oq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v18, resolved type: X.1SY} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: X.1Oa} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v21, resolved type: X.1SS} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: X.1Os} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v22, resolved type: X.1SF} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v19, resolved type: X.1Oe} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v26, resolved type: X.1SQ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v27, resolved type: X.1SG} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v20, resolved type: X.1Ob} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v21, resolved type: X.1Ou} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v28, resolved type: X.1Sa} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v22, resolved type: X.1Ok} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v29, resolved type: X.1SA} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v23, resolved type: X.1Ov} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v30, resolved type: X.1SJ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v26, resolved type: X.1Oc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v33, resolved type: X.1SM} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v27, resolved type: X.1P3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v34, resolved type: X.1SB} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v35, resolved type: X.1SZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v28, resolved type: X.1Od} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v29, resolved type: X.1On} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v36, resolved type: X.1SR} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v37, resolved type: X.1SZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v38, resolved type: X.1SZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v30, resolved type: X.1Od} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v31, resolved type: X.1Od} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v32, resolved type: X.1Ot} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v33, resolved type: X.1Ot} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v39, resolved type: X.1SW} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v40, resolved type: X.1SW} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v34, resolved type: X.1Ot} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v35, resolved type: X.1Ot} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v41, resolved type: X.1SW} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v42, resolved type: X.1SW} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v36, resolved type: X.1Ot} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v37, resolved type: X.1Ot} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v43, resolved type: X.1SW} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v44, resolved type: X.1SW} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v38, resolved type: X.1Od} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v39, resolved type: X.1Od} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v40, resolved type: X.1Od} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v41, resolved type: X.1Od} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v42, resolved type: X.1Od} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v45, resolved type: X.1SZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v46, resolved type: X.1SZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v47, resolved type: X.1SZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v48, resolved type: X.1SZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v49, resolved type: X.1SZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v29, resolved type: X.1SZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v30, resolved type: X.1SZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v43, resolved type: X.1Od} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v44, resolved type: X.1Od} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v45, resolved type: X.1Od} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v50, resolved type: X.1SZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v51, resolved type: X.1SZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v52, resolved type: X.1SZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v46, resolved type: X.1Ot} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v47, resolved type: X.1Ot} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v53, resolved type: X.1SW} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v54, resolved type: X.1SW} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v48, resolved type: X.1Od} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v49, resolved type: X.1Od} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v55, resolved type: X.1SZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v56, resolved type: X.1SZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v50, resolved type: X.1Od} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v51, resolved type: X.1Od} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v52, resolved type: X.1Od} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v57, resolved type: X.1SZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v58, resolved type: X.1SZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v59, resolved type: X.1SZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v53, resolved type: X.1Od} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v54, resolved type: X.1Od} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v60, resolved type: X.1SZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v61, resolved type: X.1SZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v55, resolved type: X.1Od} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v56, resolved type: X.1Od} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v57, resolved type: X.1Od} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v62, resolved type: X.1SZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v63, resolved type: X.1SZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v64, resolved type: X.1SZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v58, resolved type: X.1Ob} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v59, resolved type: X.1Ob} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v60, resolved type: X.1Ob} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v65, resolved type: X.1SG} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v66, resolved type: X.1SG} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v67, resolved type: X.1SG} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v61, resolved type: X.1Od} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v62, resolved type: X.1Od} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v68, resolved type: X.1SZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v69, resolved type: X.1SZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v63, resolved type: X.1Ob} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v64, resolved type: X.1Ob} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v65, resolved type: X.1Ob} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v70, resolved type: X.1SG} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v71, resolved type: X.1SG} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v72, resolved type: X.1SG} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v66, resolved type: X.1Od} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v73, resolved type: X.1SZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v67, resolved type: X.1Od} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v68, resolved type: X.1Od} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v69, resolved type: X.1Od} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v74, resolved type: X.1SZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v75, resolved type: X.1SZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v76, resolved type: X.1SZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v70, resolved type: X.1Od} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v71, resolved type: X.1Od} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v72, resolved type: X.1Od} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v77, resolved type: X.1SZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v78, resolved type: X.1SZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v79, resolved type: X.1SZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v31, resolved type: X.1SM} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v32, resolved type: X.1SM} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v73, resolved type: X.1Od} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v74, resolved type: X.1Od} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v75, resolved type: X.1Od} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v80, resolved type: X.1SZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v81, resolved type: X.1SZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v82, resolved type: X.1SZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v76, resolved type: X.1Od} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v77, resolved type: X.1Od} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v83, resolved type: X.1SZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v84, resolved type: X.1SZ} */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0212, code lost:
        if (r2 >= 0) goto L_0x01b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0030, code lost:
        if (r2 >= 0) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x02b0, code lost:
        if (r2 < 0) goto L_0x02b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0037, code lost:
        if (r2 != false) goto L_0x03c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x02e4, code lost:
        if (r2 > 0) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0305, code lost:
        if (r2 > 0) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0319, code lost:
        if (r2 >= 0) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x037f, code lost:
        if (r2 > 0) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x03bb, code lost:
        if (r2 != false) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x03c5, code lost:
        if (r2 < 0) goto L_0x03c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x03db, code lost:
        if (r2 != null) goto L_0x03dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0057, code lost:
        if (r2 >= 0) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x043a, code lost:
        if (r2 <= 0) goto L_0x043c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x0498, code lost:
        if (r2 <= 0) goto L_0x049a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:331:0x05f0, code lost:
        if (r2 <= 0) goto L_0x05f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:338:0x0605, code lost:
        if (r2 <= 0) goto L_0x0607;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0016, code lost:
        if (r2 >= 0) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0183, code lost:
        if (r2 >= 0) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01b7, code lost:
        if (r2 >= 0) goto L_0x01b9;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0A(X.AnonymousClass33W r21, X.AnonymousClass33W r22) {
        /*
            r20 = this;
            r4 = r22
            r1 = r21
            r0 = r20
            boolean r2 = r0 instanceof X.AnonymousClass1On
            if (r2 == 0) goto L_0x001c
            X.1On r0 = (X.AnonymousClass1On) r0
            X.1SR r1 = (X.AnonymousClass1SR) r1
            if (r22 == 0) goto L_0x050e
            long r7 = r4.A04
            long r5 = r1.A04
            int r2 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r2 < 0) goto L_0x050e
        L_0x0018:
            r0.A08(r1)
        L_0x001b:
            return
        L_0x001c:
            boolean r2 = r0 instanceof X.AnonymousClass1P3
            if (r2 == 0) goto L_0x003b
            X.1P3 r0 = (X.AnonymousClass1P3) r0
            X.1SB r1 = (X.AnonymousClass1SB) r1
            r2 = 0
            X.C162457s7.A0J(r1, r2)
            if (r22 == 0) goto L_0x0033
            long r7 = r4.A04
            long r5 = r1.A04
            int r2 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r2 < 0) goto L_0x0033
            goto L_0x0018
        L_0x0033:
            boolean r2 = r0.A0F(r1)
            if (r2 == 0) goto L_0x05fb
            goto L_0x03c7
        L_0x003b:
            boolean r2 = r0 instanceof X.C22451Oc
            if (r2 == 0) goto L_0x006c
            X.1Oc r0 = (X.C22451Oc) r0
            X.1SM r1 = (X.AnonymousClass1SM) r1
            X.1SM r4 = (X.AnonymousClass1SM) r4
            if (r4 == 0) goto L_0x005a
            com.whatsapp.jid.UserJid r3 = r4.A00
            com.whatsapp.jid.UserJid r2 = r1.A00
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x005a
            long r7 = r4.A04
            long r5 = r1.A04
            int r2 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r2 < 0) goto L_0x005a
            goto L_0x0018
        L_0x005a:
            boolean r5 = r1.A01
            X.1R1 r3 = r0.A02
            com.whatsapp.jid.UserJid r2 = r1.A00
            if (r5 == 0) goto L_0x0067
            r3.A0m(r2)
            goto L_0x03c7
        L_0x0067:
            r3.A0l(r2)
            goto L_0x03c7
        L_0x006c:
            boolean r2 = r0 instanceof X.C22601Ov
            if (r2 == 0) goto L_0x016b
            X.1Ov r0 = (X.C22601Ov) r0
            X.1SJ r1 = (X.AnonymousClass1SJ) r1
            X.2sr r2 = r0.A00
            boolean r2 = r2.A0Y()
            if (r2 == 0) goto L_0x0018
            X.2yt r3 = r1.A05
            X.2yt r2 = X.C60642yt.A03
            if (r3 != r2) goto L_0x001b
            X.33p r5 = r0.A06
            boolean r2 = r5.A28()
            if (r2 != 0) goto L_0x00a1
            X.34f r3 = r0.A04
            X.2sr r2 = r3.A00
            boolean r2 = r2.A0Y()
            X.C626936e.A0C(r2)
            X.33p r2 = r3.A03
            r4 = 1
            android.content.SharedPreferences$Editor r3 = X.C18270x1.A03(r2)
            java.lang.String r2 = "archive_v2_enabled"
            X.C18270x1.A0l(r3, r2, r4)
        L_0x00a1:
            boolean r4 = r1.A00
            android.content.SharedPreferences$Editor r3 = X.C18270x1.A03(r5)
            java.lang.String r2 = "notify_new_message_for_archived_chats"
            X.C18270x1.A0l(r3, r2, r4)
            if (r4 == 0) goto L_0x012e
            X.34v r10 = r0.A00
            java.lang.String r3 = "archive"
            r8 = 0
            java.util.ArrayList r6 = X.AnonymousClass001.A0s()
            X.4GK r9 = X.C18630y0.A01(r10)
            r2 = r9
            X.3H0 r2 = (X.AnonymousClass3H0) r2     // Catch:{ all -> 0x052d }
            X.2sg r5 = r2.A03     // Catch:{ all -> 0x052d }
            java.lang.String r4 = "SELECT mutation_index, mutation_value, mutation_version, are_dependencies_missing, device_id, epoch, mutation_mac FROM syncd_mutations WHERE mutation_name = ? AND are_dependencies_missing = ?"
            java.lang.String[] r3 = X.AnonymousClass0x7.A1a(r3, r8)     // Catch:{ all -> 0x052d }
            r7 = 1
            X.C18280x3.A1Q(r3, r8, r7)     // Catch:{ all -> 0x052d }
            java.lang.String r2 = "syncd_mutationsSELECT_STORED_MUTATIONS_BY_MUTATION_NAME_AND_DEPENDENCY"
            android.database.Cursor r3 = r5.A0E(r4, r2, r3)     // Catch:{ all -> 0x052d }
        L_0x00d2:
            boolean r2 = r3.moveToNext()     // Catch:{ all -> 0x0521 }
            if (r2 == 0) goto L_0x00e2
            X.33W r2 = r10.A04(r3)     // Catch:{ all -> 0x0521 }
            if (r2 == 0) goto L_0x00d2
            r6.add(r2)     // Catch:{ all -> 0x0521 }
            goto L_0x00d2
        L_0x00e2:
            r3.close()     // Catch:{ all -> 0x052d }
            r9.close()
            java.util.ListIterator r3 = r6.listIterator()
        L_0x00ec:
            boolean r2 = r3.hasNext()
            if (r2 == 0) goto L_0x0100
            java.lang.Object r2 = r3.next()
            X.1SW r2 = (X.AnonymousClass1SW) r2
            boolean r2 = r2.A02
            if (r2 != 0) goto L_0x00ec
            r3.remove()
            goto L_0x00ec
        L_0x0100:
            java.util.Iterator r6 = r6.iterator()
        L_0x0104:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L_0x0018
            java.lang.Object r5 = r6.next()
            X.1SW r5 = (X.AnonymousClass1SW) r5
            X.33E r2 = r0.A01
            X.4uZ r4 = r5.A01
            X.35N r3 = r2.A04(r4, r8)
            X.35N r2 = r5.A00
            int r3 = X.AnonymousClass35N.A00(r3, r2)
            if (r3 == 0) goto L_0x0125
            if (r3 == r7) goto L_0x0104
            r2 = 2
            if (r3 == r2) goto L_0x0104
        L_0x0125:
            java.lang.String r2 = "UnarchiveChatsSettingHandler/handleSettingOn/setArchivedState - false"
            com.whatsapp.util.Log.i((java.lang.String) r2)
            r0.A0E(r4, r8)
            goto L_0x0104
        L_0x012e:
            X.34v r4 = r0.A00
            java.lang.String r3 = "archive"
            r2 = 0
            java.util.List r4 = r4.A0A(r3, r2)
            java.util.ListIterator r3 = r4.listIterator()
        L_0x013b:
            boolean r2 = r3.hasNext()
            if (r2 == 0) goto L_0x014f
            java.lang.Object r2 = r3.next()
            X.1SW r2 = (X.AnonymousClass1SW) r2
            boolean r2 = r2.A02
            if (r2 != 0) goto L_0x013b
            r3.remove()
            goto L_0x013b
        L_0x014f:
            java.util.Iterator r4 = r4.iterator()
        L_0x0153:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L_0x0018
            java.lang.Object r3 = r4.next()
            X.1SW r3 = (X.AnonymousClass1SW) r3
            java.lang.String r2 = "UnarchiveChatsSettingHandler/handleSettingOff/setArchivedState - true"
            com.whatsapp.util.Log.i((java.lang.String) r2)
            X.4uZ r3 = r3.A01
            r2 = 1
            r0.A0E(r3, r2)
            goto L_0x0153
        L_0x016b:
            boolean r2 = r0 instanceof X.AnonymousClass1Ol
            if (r2 != 0) goto L_0x0618
            boolean r2 = r0 instanceof X.AnonymousClass1Ok
            if (r2 == 0) goto L_0x0187
            X.1Ok r0 = (X.AnonymousClass1Ok) r0
            X.1SA r1 = (X.AnonymousClass1SA) r1
            r2 = 0
            X.C162457s7.A0J(r1, r2)
            if (r22 == 0) goto L_0x0537
            long r7 = r4.A04
            long r5 = r1.A04
            int r2 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r2 < 0) goto L_0x0537
            goto L_0x0018
        L_0x0187:
            boolean r2 = r0 instanceof X.C22591Ou
            if (r2 == 0) goto L_0x01bd
            X.1Ou r0 = (X.C22591Ou) r0
            X.1Sa r1 = (X.C23291Sa) r1
            X.2z0 r9 = r1.A01
            X.4uZ r3 = r1.A00
            java.lang.String r2 = "deleteMessageForMe"
            java.lang.String[] r2 = new java.lang.String[]{r2}
            java.lang.String[] r2 = X.AnonymousClass34E.A01(r3, r9, r2)
            java.lang.String r5 = X.AnonymousClass33W.A01(r2)
            X.34v r3 = r0.A00
            X.33W r2 = r3.A06(r5)
            if (r2 != 0) goto L_0x0558
            X.33W r2 = r3.A07(r5)
            if (r2 != 0) goto L_0x0558
            if (r22 == 0) goto L_0x0544
            long r7 = r4.A04
            long r5 = r1.A04
            int r2 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r2 < 0) goto L_0x0544
        L_0x01b9:
            r0.A08(r1)
            return
        L_0x01bd:
            boolean r2 = r0 instanceof X.C22471Oe
            if (r2 == 0) goto L_0x01d4
            X.1Oe r0 = (X.C22471Oe) r0
            X.1SQ r1 = (X.AnonymousClass1SQ) r1
            r2 = 0
            X.C162457s7.A0J(r1, r2)
            if (r22 != 0) goto L_0x03bf
            X.1fH r3 = r1.A00
            X.311 r2 = r0.A02
            r2.A05(r3)
            goto L_0x0018
        L_0x01d4:
            boolean r2 = r0 instanceof X.C22521Oj
            if (r2 == 0) goto L_0x01ea
            X.1Oj r0 = (X.C22521Oj) r0
            X.1SH r1 = (X.AnonymousClass1SH) r1
            X.1SH r4 = (X.AnonymousClass1SH) r4
            if (r4 == 0) goto L_0x0564
            int r3 = r4.A00
            int r2 = r1.A00
            if (r3 <= r2) goto L_0x0564
            r0.A08(r1)
            return
        L_0x01ea:
            boolean r2 = r0 instanceof X.AnonymousClass1Om
            if (r2 == 0) goto L_0x0202
            X.1Om r0 = (X.AnonymousClass1Om) r0
            X.1SO r1 = (X.AnonymousClass1SO) r1
            X.1SO r4 = (X.AnonymousClass1SO) r4
            if (r4 == 0) goto L_0x056f
            long r7 = r4.A00
            long r5 = r1.A00
            int r2 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r2 > 0) goto L_0x0594
            r0.A0B(r1, r4)
            return
        L_0x0202:
            boolean r2 = r0 instanceof X.C22441Ob
            if (r2 == 0) goto L_0x0215
            X.1Ob r0 = (X.C22441Ob) r0
            X.1SG r1 = (X.AnonymousClass1SG) r1
            if (r22 == 0) goto L_0x05a3
            long r7 = r4.A04
            long r5 = r1.A04
            int r2 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r2 < 0) goto L_0x05a3
            goto L_0x01b9
        L_0x0215:
            boolean r2 = r0 instanceof X.C22501Oh
            if (r2 != 0) goto L_0x0618
            boolean r2 = r0 instanceof X.C22571Os
            if (r2 == 0) goto L_0x0287
            X.1Os r0 = (X.C22571Os) r0
            X.1SF r1 = (X.AnonymousClass1SF) r1
            X.2sr r2 = r0.A00
            boolean r2 = r2.A0Y()
            if (r2 == 0) goto L_0x0018
            X.2q4 r6 = r0.A01
            java.util.List r5 = r1.A00
            java.lang.String r2 = "ddm_settings"
            boolean r4 = r5.contains(r2)
            android.content.SharedPreferences$Editor r3 = X.C55262q4.A00(r6)
            java.lang.String r2 = "ddm_settings_feature_flag"
            X.C18270x1.A0l(r3, r2, r4)
            java.lang.String r4 = "post_status_in_companion"
            boolean r3 = r5.contains(r4)
            android.content.SharedPreferences$Editor r2 = X.C55262q4.A00(r6)
            X.C18270x1.A0l(r2, r4, r3)
            java.lang.String r2 = "username_supported"
            boolean r4 = r5.contains(r2)
            android.content.SharedPreferences$Editor r3 = X.C55262q4.A00(r6)
            java.lang.String r2 = "username_creation_supported_on_primary"
            X.C18270x1.A0l(r3, r2, r4)
            java.lang.String r2 = "username_is_set"
            boolean r2 = r5.contains(r2)
            if (r2 == 0) goto L_0x0270
            X.33p r2 = r0.A03
            android.content.SharedPreferences$Editor r3 = X.C18270x1.A03(r2)
            java.lang.String r2 = "username_ever_set"
            X.C18270x1.A0f(r3, r2)
        L_0x0270:
            java.lang.String r2 = "username_chats_exist"
            boolean r2 = r5.contains(r2)
            if (r2 == 0) goto L_0x0018
            X.33p r2 = r0.A03
            android.content.SharedPreferences$Editor r3 = X.C18270x1.A03(r2)
            java.lang.String r2 = "username_chats_ever_existed"
            X.C18270x1.A0f(r3, r2)
            goto L_0x0018
        L_0x0287:
            boolean r2 = r0 instanceof X.C22431Oa
            if (r2 == 0) goto L_0x02a0
            X.1Oa r0 = (X.C22431Oa) r0
            X.1SS r1 = (X.AnonymousClass1SS) r1
            r2 = 0
            X.C162457s7.A0J(r1, r2)
            if (r22 != 0) goto L_0x03bf
            X.2sM r4 = r0.A01
            X.1fH r3 = r1.A00
            com.whatsapp.jid.PhoneUserJid r2 = r1.A01
            r4.A09(r3, r2)
            goto L_0x0018
        L_0x02a0:
            boolean r2 = r0 instanceof X.C22551Oq
            if (r2 == 0) goto L_0x0309
            X.1Oq r0 = (X.C22551Oq) r0
            X.1SY r1 = (X.AnonymousClass1SY) r1
            if (r22 == 0) goto L_0x02b2
            long r7 = r4.A04
            long r5 = r1.A04
            int r2 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r2 >= 0) goto L_0x0018
        L_0x02b2:
            boolean r2 = r1.A01
            if (r2 == 0) goto L_0x05c8
            X.4uZ r5 = r1.A00
            java.lang.String[] r3 = X.AnonymousClass0x9.A1Z()
            java.lang.String r2 = "archive"
            X.AnonymousClass0x2.A15(r5, r2, r3)
            java.lang.String r10 = X.AnonymousClass33W.A01(r3)
            X.34v r9 = r0.A00
            X.33W r3 = r9.A07(r10)
            if (r3 == 0) goto L_0x02e8
            X.1EO r2 = r3.A07()
            X.C626936e.A06(r2)
            X.1Bd r2 = r2.archiveChatAction_
            if (r2 != 0) goto L_0x02da
            X.1Bd r2 = X.C21261Bd.DEFAULT_INSTANCE
        L_0x02da:
            boolean r2 = r2.archived_
            if (r2 == 0) goto L_0x02e8
            long r7 = r3.A04
            long r5 = r1.A04
            int r2 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r2 <= 0) goto L_0x02e8
            goto L_0x0018
        L_0x02e8:
            X.33W r3 = r9.A06(r10)
            if (r3 == 0) goto L_0x05c8
            X.1EO r2 = r3.A07()
            X.C626936e.A06(r2)
            X.1Bd r2 = r2.archiveChatAction_
            if (r2 != 0) goto L_0x02fb
            X.1Bd r2 = X.C21261Bd.DEFAULT_INSTANCE
        L_0x02fb:
            boolean r2 = r2.archived_
            if (r2 == 0) goto L_0x05c8
            long r7 = r3.A04
            long r5 = r1.A04
            int r2 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r2 <= 0) goto L_0x05c8
            goto L_0x0018
        L_0x0309:
            boolean r2 = r0 instanceof X.C22511Oi
            if (r2 == 0) goto L_0x031d
            X.1Oi r0 = (X.C22511Oi) r0
            X.1SX r1 = (X.AnonymousClass1SX) r1
            if (r22 == 0) goto L_0x05d9
            long r7 = r4.A04
            long r5 = r1.A04
            int r2 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r2 < 0) goto L_0x05d9
            goto L_0x0018
        L_0x031d:
            boolean r2 = r0 instanceof X.C22561Or
            if (r2 == 0) goto L_0x036b
            X.1Or r0 = (X.C22561Or) r0
            X.1SV r1 = (X.AnonymousClass1SV) r1
            X.1SV r4 = (X.AnonymousClass1SV) r4
            if (r4 == 0) goto L_0x05f7
            X.35N r9 = r1.A00
            X.35N r8 = r4.A00
            int r3 = X.AnonymousClass35N.A00(r9, r8)
            if (r3 == 0) goto L_0x05f2
            r2 = 1
            if (r3 == r2) goto L_0x0610
            r2 = 2
            if (r3 == r2) goto L_0x05ea
            r10 = 0
            X.4uZ r12 = r4.A01
            long r5 = r1.A04
            long r2 = r4.A04
            int r7 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r7 < 0) goto L_0x0368
            boolean r4 = r1.A02
        L_0x0346:
            long r14 = java.lang.Math.max(r5, r2)
            X.35N r11 = X.AnonymousClass35N.A01(r9, r8)
            r17 = 1
            X.1SV r9 = new X.1SV
            r13 = r10
            r16 = r4
            r9.<init>(r10, r11, r12, r13, r14, r16, r17)
            r0.A08(r1)
            X.34v r2 = r0.A00
            java.util.Set r1 = java.util.Collections.singleton(r9)
            r2.A0G(r1)
            r0.A0E(r9)
            return
        L_0x0368:
            boolean r4 = r4.A02
            goto L_0x0346
        L_0x036b:
            boolean r2 = r0 instanceof X.C22491Og
            if (r2 != 0) goto L_0x0618
            boolean r2 = r0 instanceof X.C22611Ow
            if (r2 == 0) goto L_0x03a9
            X.1Ow r0 = (X.C22611Ow) r0
            X.1SP r1 = (X.AnonymousClass1SP) r1
            if (r22 == 0) goto L_0x0383
            long r7 = r4.A04
            long r5 = r1.A04
            int r2 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r2 <= 0) goto L_0x0383
            goto L_0x0018
        L_0x0383:
            X.2cr r2 = r1.A01
            java.lang.String r3 = r2.A07
            boolean r2 = r1.A02
            if (r2 != 0) goto L_0x038f
            r0.A0F(r3)
            goto L_0x03c7
        L_0x038f:
            X.2pZ r2 = r0.A07
            X.39M r2 = r2.A00(r3)
            if (r2 != 0) goto L_0x03c7
            if (r22 == 0) goto L_0x039e
            X.34v r2 = r0.A00
            r2.A0F(r4)
        L_0x039e:
            r0.A09(r1)
            X.4FS r3 = r0.A08
            r2 = 37
            X.C70193a6.A01(r3, r0, r1, r2)
            return
        L_0x03a9:
            boolean r2 = r0 instanceof X.C22461Od
            if (r2 == 0) goto L_0x03ea
            X.1Od r0 = (X.C22461Od) r0
            X.1SZ r1 = (X.AnonymousClass1SZ) r1
            X.1SZ r4 = (X.AnonymousClass1SZ) r4
            if (r4 == 0) goto L_0x03cb
            boolean r2 = r1.A03
            if (r2 != 0) goto L_0x03c7
            boolean r2 = r4.A03
            if (r2 == 0) goto L_0x03c7
            goto L_0x0018
        L_0x03bf:
            long r7 = r4.A04
            long r5 = r1.A04
            int r2 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r2 >= 0) goto L_0x0018
        L_0x03c7:
            r0.A0B(r1, r4)
            return
        L_0x03cb:
            X.2qz r2 = r0.A03
            X.2z0 r3 = r1.A02
            X.34x r2 = r2.A05(r3)
            if (r2 != 0) goto L_0x03dd
            X.33f r2 = r0.A02
            X.34x r2 = r2.A05(r3)
            if (r2 == 0) goto L_0x05fb
        L_0x03dd:
            boolean r4 = r1.A03
            X.3Lv r3 = r0.A01
            java.util.Set r2 = java.util.Collections.singleton(r2)
            r3.A0k(r2, r4)
            goto L_0x0018
        L_0x03ea:
            boolean r2 = r0 instanceof X.C22541Op
            if (r2 == 0) goto L_0x0442
            X.1Op r0 = (X.C22541Op) r0
            X.1ST r1 = (X.AnonymousClass1ST) r1
            X.1ST r4 = (X.AnonymousClass1ST) r4
            X.33E r2 = r0.A02
            X.35N r8 = r1.A00
            r2.A05(r8)
            if (r4 == 0) goto L_0x042d
            X.35N r7 = r4.A00
            int r3 = X.AnonymousClass35N.A00(r8, r7)
            if (r3 == 0) goto L_0x043c
            r2 = 1
            if (r3 == r2) goto L_0x0610
            r2 = 2
            if (r3 == r2) goto L_0x0434
            r9 = 0
            X.4uZ r11 = r4.A01
            boolean r15 = r4.A02
            long r5 = r1.A04
            long r2 = r4.A04
            long r13 = java.lang.Math.max(r5, r2)
            r16 = 1
            X.35N r10 = X.AnonymousClass35N.A01(r8, r7)
            X.1ST r8 = new X.1ST
            r12 = r9
            r8.<init>(r9, r10, r11, r12, r13, r15, r16)
            X.34v r3 = r0.A00
            java.util.Set r2 = java.util.Collections.singleton(r8)
            r3.A0G(r2)
        L_0x042d:
            r0.A09(r1)
            r0.A0D(r1)
            return
        L_0x0434:
            long r7 = r4.A04
            long r5 = r1.A04
            int r2 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r2 > 0) goto L_0x0610
        L_0x043c:
            X.34v r2 = r0.A00
            r2.A0F(r4)
            goto L_0x042d
        L_0x0442:
            boolean r2 = r0 instanceof X.C22531Oo
            if (r2 == 0) goto L_0x04a0
            X.1Oo r0 = (X.C22531Oo) r0
            X.1SU r1 = (X.AnonymousClass1SU) r1
            X.1SU r4 = (X.AnonymousClass1SU) r4
            X.33E r2 = r0.A02
            X.35N r10 = r1.A00
            r2.A05(r10)
            if (r4 == 0) goto L_0x048b
            X.35N r9 = r4.A00
            int r3 = X.AnonymousClass35N.A00(r10, r9)
            if (r3 == 0) goto L_0x049a
            r2 = 1
            if (r3 == r2) goto L_0x0610
            r2 = 2
            if (r3 == r2) goto L_0x0492
            r11 = 0
            X.4uZ r13 = r4.A01
            boolean r8 = r4.A03
            boolean r7 = r4.A02
            long r5 = r1.A04
            long r2 = r4.A04
            long r15 = java.lang.Math.max(r5, r2)
            r19 = 1
            X.35N r12 = X.AnonymousClass35N.A01(r10, r9)
            X.1SU r10 = new X.1SU
            r14 = r11
            r18 = r7
            r17 = r8
            r10.<init>(r11, r12, r13, r14, r15, r17, r18, r19)
            X.34v r3 = r0.A00
            java.util.Set r2 = java.util.Collections.singleton(r10)
            r3.A0G(r2)
        L_0x048b:
            r0.A09(r1)
            r0.A0D(r1)
            return
        L_0x0492:
            long r7 = r4.A04
            long r5 = r1.A04
            int r2 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r2 > 0) goto L_0x0610
        L_0x049a:
            X.34v r2 = r0.A00
            r2.A0F(r4)
            goto L_0x048b
        L_0x04a0:
            boolean r2 = r0 instanceof X.C22481Of
            if (r2 == 0) goto L_0x04a8
            r0.A08(r1)
            return
        L_0x04a8:
            boolean r2 = r0 instanceof X.C22581Ot
            if (r2 == 0) goto L_0x0614
            X.1Ot r0 = (X.C22581Ot) r0
            X.1SW r1 = (X.AnonymousClass1SW) r1
            X.1SW r4 = (X.AnonymousClass1SW) r4
            if (r4 == 0) goto L_0x060c
            X.35N r9 = r1.A00
            X.35N r8 = r4.A00
            int r3 = X.AnonymousClass35N.A00(r9, r8)
            if (r3 == 0) goto L_0x0607
            r2 = 1
            if (r3 == r2) goto L_0x0610
            r2 = 2
            if (r3 == r2) goto L_0x05ff
            long r5 = r1.A04
            long r2 = r4.A04
            int r7 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r7 < 0) goto L_0x050b
            boolean r7 = r1.A02
        L_0x04ce:
            r10 = 0
            X.4uZ r12 = r4.A01
            long r14 = java.lang.Math.max(r5, r2)
            r17 = 1
            X.35N r11 = X.AnonymousClass35N.A01(r9, r8)
            X.1SW r9 = new X.1SW
            r13 = r10
            r16 = r7
            r9.<init>(r10, r11, r12, r13, r14, r16, r17)
            r0.A08(r1)
            X.34v r2 = r0.A00
            java.util.Set r1 = java.util.Collections.singleton(r9)
            r2.A0G(r1)
            X.2ss r2 = r0.A07
            X.4uZ r1 = r9.A01
            X.31A r3 = X.C56982ss.A00(r2, r1)
            if (r3 == 0) goto L_0x001b
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "ArchiveChatHandler/handleMutation/setArchivedState - "
            r2.append(r1)
            boolean r1 = r9.A02
            X.C18260x0.A1V(r2, r1)
            r0.A0D(r3, r9)
            return
        L_0x050b:
            boolean r7 = r4.A02
            goto L_0x04ce
        L_0x050e:
            java.util.Set r2 = X.AnonymousClass1SR.A02
            java.lang.String r3 = r1.A00
            boolean r2 = r2.contains(r3)
            if (r2 == 0) goto L_0x05fb
            boolean r2 = r1.A01
            r0.A0D(r3, r2)
            r0.A0B(r1, r4)
            return
        L_0x0521:
            r1 = move-exception
            if (r3 == 0) goto L_0x052c
            r3.close()     // Catch:{ all -> 0x0528 }
            goto L_0x052c
        L_0x0528:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x052d }
        L_0x052c:
            throw r1     // Catch:{ all -> 0x052d }
        L_0x052d:
            r1 = move-exception
            r9.close()     // Catch:{ all -> 0x0532 }
            throw r1
        L_0x0532:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x0537:
            int r5 = r1.A00
            java.util.Set r3 = r1.A01
            X.33e r2 = r0.A01
            r2.A0E(r3, r5)
            r0.A0B(r1, r4)
            return
        L_0x0544:
            X.2qz r2 = r0.A08
            X.34x r2 = r2.A05(r9)
            if (r2 != 0) goto L_0x05c1
            X.33f r2 = r0.A07
            X.34x r2 = r2.A05(r9)
            if (r2 != 0) goto L_0x05c1
            r0.A09(r1)
            return
        L_0x0558:
            X.3Ek r2 = r0.A01
            X.30l r6 = r2.A01
            java.lang.String r5 = "cross_index_conflict_counter"
            r2 = 1
            r6.A06(r5, r2)
            goto L_0x05c4
        L_0x0564:
            X.2sZ r3 = r0.A01
            int r2 = r1.A00
            r3.A07(r2)
            r0.A0B(r1, r4)
            return
        L_0x056f:
            X.8qC r2 = r0.A04
            X.1el r3 = X.AnonymousClass0x9.A0a(r2)
            java.lang.String r2 = r1.A01
            android.util.Pair r3 = r3.A0B(r2)
            if (r3 == 0) goto L_0x059f
            java.lang.Object r7 = r3.first
            X.39M r7 = (X.AnonymousClass39M) r7
            java.lang.String r2 = r7.A0D
            if (r2 == 0) goto L_0x059f
            java.lang.Object r2 = r3.second
            long r5 = X.C18310x6.A0B(r2)
            long r3 = r1.A00
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x0598
            r0.A0D(r7)
        L_0x0594:
            r0.A08(r1)
            return
        L_0x0598:
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 >= 0) goto L_0x0594
            r0.A0D(r7)
        L_0x059f:
            r0.A09(r1)
            return
        L_0x05a3:
            java.lang.String r5 = r1.A00
            boolean r2 = r5.isEmpty()
            if (r2 != 0) goto L_0x05bb
            X.2sr r2 = r0.A00
            r2.A0W(r5)
            X.31C r3 = r0.A02
            r2 = 3
            android.os.Message r2 = X.C18290x4.A0J(r2, r5)
            r3.A0J(r2)
            goto L_0x05c4
        L_0x05bb:
            java.lang.String r2 = "PushNameSettingHandler/handleMutation/invalid: push name is empty."
            com.whatsapp.util.Log.e((java.lang.String) r2)
            goto L_0x05c4
        L_0x05c1:
            r0.A0E(r1, r2)
        L_0x05c4:
            r0.A0B(r1, r4)
            return
        L_0x05c8:
            r0.A0B(r1, r4)
            X.34v r3 = r0.A07
            java.lang.String r2 = "pin_v1"
            r1 = 1
            java.util.List r1 = r3.A0A(r2, r1)
            r0.A0D(r1)
            return
        L_0x05d9:
            X.2ss r3 = r0.A01
            X.4uZ r2 = r1.A01
            boolean r2 = r3.A0L(r2)
            if (r2 == 0) goto L_0x05fb
            r0.A0D(r1)
            r0.A0B(r1, r4)
            return
        L_0x05ea:
            long r7 = r4.A04
            long r5 = r1.A04
            int r2 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r2 > 0) goto L_0x0610
        L_0x05f2:
            X.34v r2 = r0.A00
            r2.A0F(r4)
        L_0x05f7:
            r0.A0D(r1)
            return
        L_0x05fb:
            r0.A09(r1)
            return
        L_0x05ff:
            long r7 = r4.A04
            long r5 = r1.A04
            int r2 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r2 > 0) goto L_0x0610
        L_0x0607:
            X.34v r2 = r0.A00
            r2.A0F(r4)
        L_0x060c:
            r0.A0E(r1)
            return
        L_0x0610:
            r0.A08(r1)
            return
        L_0x0614:
            r0.A0B(r1, r4)
            return
        L_0x0618:
            r0.A08(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56822sc.A0A(X.33W, X.33W):void");
    }

    public final void A0B(AnonymousClass33W r3, AnonymousClass33W r4) {
        if (r4 != null) {
            this.A00.A0F(r4);
        }
        this.A00.A0H(Collections.singleton(r3));
    }

    public boolean A0C() {
        AnonymousClass1VX r2;
        int i;
        C66663Mh r1;
        C22051Ei r0;
        if (this instanceof AnonymousClass1On) {
            r2 = ((AnonymousClass1On) this).A03;
            i = 1343;
        } else if (this instanceof C22451Oc) {
            r2 = ((C22451Oc) this).A01;
            i = 2070;
        } else if ((this instanceof C22601Ov) || (this instanceof AnonymousClass1Ol)) {
            return true;
        } else {
            if (this instanceof AnonymousClass1Ok) {
                r2 = ((AnonymousClass1Ok) this).A02;
                i = 4905;
            } else if (this instanceof C22591Ou) {
                return true;
            } else {
                if (this instanceof C22471Oe) {
                    r2 = ((C22471Oe) this).A03;
                    i = 3070;
                } else if (this instanceof C22521Oj) {
                    return true;
                } else {
                    if (this instanceof AnonymousClass1Om) {
                        AnonymousClass1Om r12 = (AnonymousClass1Om) this;
                        if (r12.A00.A0Y()) {
                            return C18280x3.A1W(r12.A01.A01(), "recent_sticker_feature_flag");
                        }
                        return C18280x3.A1U(r12.A03.A0O(C58422vE.A02, 1829), 2);
                    } else if ((this instanceof C22441Ob) || (this instanceof C22501Oh) || (this instanceof C22571Os)) {
                        return true;
                    } else {
                        if (this instanceof C22431Oa) {
                            r2 = ((C22431Oa) this).A02;
                            i = 3062;
                        } else {
                            if (this instanceof C22551Oq) {
                                r1 = ((C22551Oq) this).A00;
                                r0 = C66663Mh.A0X;
                            } else if ((this instanceof C22511Oi) || (this instanceof C22561Or) || (this instanceof C22491Og)) {
                                return true;
                            } else {
                                if (this instanceof C22611Ow) {
                                    r2 = ((C22611Ow) this).A04;
                                    i = 2775;
                                } else if (this instanceof C22461Od) {
                                    return true;
                                } else {
                                    if (this instanceof C22541Op) {
                                        r1 = ((C22541Op) this).A00;
                                    } else if (this instanceof C22621Ox) {
                                        return true;
                                    } else {
                                        if (this instanceof C22531Oo) {
                                            r1 = ((C22531Oo) this).A00;
                                        } else if (this instanceof C22481Of) {
                                            AnonymousClass1VX r22 = ((C22481Of) this).A04;
                                            C58422vE r13 = C58422vE.A02;
                                            if (r22.A0O(r13, 5417) >= 1 || r22.A0O(r13, 6646) >= 1) {
                                                return true;
                                            }
                                            return false;
                                        } else if (this instanceof C22581Ot) {
                                            return true;
                                        } else {
                                            if (this instanceof AnonymousClass1OZ) {
                                                r1 = ((AnonymousClass1OZ) this).A00;
                                                r0 = C66663Mh.A0U;
                                            } else if (this instanceof AnonymousClass1P2) {
                                                AnonymousClass1VX r23 = ((AnonymousClass1P2) this).A04;
                                                C58422vE r14 = C58422vE.A02;
                                                if (r23.A0Y(r14, 5587) || r23.A0Y(r14, 4873)) {
                                                    return true;
                                                }
                                                return false;
                                            } else if (this instanceof AnonymousClass1P1) {
                                                return ((AnonymousClass1P1) this).A02.A0Y(C58422vE.A01, 2998);
                                            } else {
                                                if (this instanceof AnonymousClass1P0) {
                                                    r2 = ((AnonymousClass1P0) this).A03;
                                                    i = 3436;
                                                } else if (!(this instanceof C22641Oz)) {
                                                    return false;
                                                } else {
                                                    r2 = ((C22641Oz) this).A03;
                                                    i = 3530;
                                                }
                                            }
                                        }
                                    }
                                    r0 = C66663Mh.A0V;
                                }
                            }
                            return r1.A08(r0);
                        }
                    }
                }
            }
        }
        return r2.A0Y(C58422vE.A02, i);
    }

    public C56822sc(C623934v r1) {
        this.A00 = r1;
    }
}
