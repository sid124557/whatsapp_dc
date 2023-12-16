package X;

import android.text.TextUtils;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.util.Log;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.3bS  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C71033bS implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ C64833Fe A03;
    public final /* synthetic */ DeviceJid A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ List A06;
    public final /* synthetic */ Map A07;
    public final /* synthetic */ Set A08;

    public final void run() {
        C130786cX r0;
        C64833Fe r12 = this.A03;
        List<AnonymousClass2NR> list = this.A06;
        Map map = this.A07;
        DeviceJid deviceJid = this.A04;
        String str = this.A05;
        Set set = this.A08;
        int i = this.A00;
        int i2 = this.A01;
        int i3 = this.A02;
        int i4 = 0;
        for (AnonymousClass2NR r02 : list) {
            if (r02 != null) {
                String str2 = r02.A02;
                AnonymousClass23E r13 = r02.A01;
                C58882vy r7 = r02.A00;
                if (r7 != null) {
                    C130546c9 A0G = C21841Dj.DEFAULT_INSTANCE.A0G();
                    String str3 = r7.A06;
                    C21841Dj A0W = AnonymousClass0x7.A0W(A0G, str3);
                    A0W.bitField0_ |= 1;
                    A0W.url_ = str3;
                    String str4 = r7.A05;
                    if (!TextUtils.isEmpty(str4)) {
                        C21841Dj A0W2 = AnonymousClass0x7.A0W(A0G, str4);
                        A0W2.bitField0_ |= 2;
                        A0W2.title_ = str4;
                    }
                    String str5 = r7.A02;
                    if (!TextUtils.isEmpty(str5)) {
                        C21841Dj A0W3 = AnonymousClass0x7.A0W(A0G, str5);
                        A0W3.bitField0_ |= 4;
                        A0W3.description_ = str5;
                    }
                    byte[] bArr = r7.A07;
                    if (bArr != null) {
                        C172548Lq A09 = C18270x1.A09(A0G, bArr);
                        C21841Dj r1 = (C21841Dj) A0G.A00;
                        r1.bitField0_ |= 8;
                        r1.thumbData_ = A09;
                    }
                    String str6 = r7.A01;
                    if (!TextUtils.isEmpty(str6)) {
                        C21841Dj A0W4 = AnonymousClass0x7.A0W(A0G, str6);
                        A0W4.bitField0_ |= 16;
                        A0W4.canonicalUrl_ = str6;
                    }
                    String str7 = r7.A03;
                    if (!TextUtils.isEmpty(str7)) {
                        C21841Dj A0W5 = AnonymousClass0x7.A0W(A0G, str7);
                        A0W5.bitField0_ |= 32;
                        A0W5.matchText_ = str7;
                    }
                    String str8 = r7.A04;
                    if (!TextUtils.isEmpty(str8)) {
                        C21841Dj A0W6 = AnonymousClass0x7.A0W(A0G, str8);
                        A0W6.bitField0_ |= 64;
                        A0W6.previewType_ = str8;
                    }
                    C43512Sk r5 = r7.A00;
                    if (r5 != null) {
                        C130546c9 A0G2 = C21771Dc.DEFAULT_INSTANCE.A0G();
                        String str9 = r5.A03;
                        C21771Dc r14 = (C21771Dc) C18320x8.A0C(A0G2);
                        str9.getClass();
                        r14.bitField0_ |= 1;
                        r14.directPath_ = str9;
                        String str10 = r5.A05;
                        C21771Dc r15 = (C21771Dc) C18320x8.A0C(A0G2);
                        str10.getClass();
                        r15.bitField0_ |= 2;
                        r15.thumbHash_ = str10;
                        String str11 = r5.A04;
                        C21771Dc r16 = (C21771Dc) C18320x8.A0C(A0G2);
                        str11.getClass();
                        r16.bitField0_ |= 4;
                        r16.encThumbHash_ = str11;
                        C172548Lq A092 = C18270x1.A09(A0G2, r5.A06);
                        C21771Dc r17 = (C21771Dc) A0G2.A00;
                        r17.bitField0_ |= 8;
                        r17.mediaKey_ = A092;
                        long j = r5.A02;
                        C21771Dc r18 = (C21771Dc) C18320x8.A0C(A0G2);
                        r18.bitField0_ |= 16;
                        r18.mediaKeyTimestampMs_ = j;
                        int i5 = r5.A01;
                        C21771Dc r19 = (C21771Dc) C18320x8.A0C(A0G2);
                        r19.bitField0_ |= 32;
                        r19.thumbWidth_ = i5;
                        int i6 = r5.A00;
                        C21771Dc r110 = (C21771Dc) C18320x8.A0C(A0G2);
                        r110.bitField0_ |= 64;
                        r110.thumbHeight_ = i6;
                        C21841Dj r111 = (C21841Dj) C18320x8.A0C(A0G);
                        C21771Dc r03 = (C21771Dc) A0G2.A06();
                        r03.getClass();
                        r111.hqThumbnail_ = r03;
                        r111.bitField0_ |= 128;
                    }
                    r0 = A0G.A06();
                } else {
                    r0 = null;
                }
                map.put(str2, AnonymousClass0x9.A0C(r13, r0));
                if (r7 != null && r7.A00 == null) {
                    i4++;
                }
            }
        }
        C46952cT r6 = r12.A04;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("NonMessageDataRequestSendMethod/sendLinkPreviewRequestResponseMessage link preview stanzaId=");
        A0o.append(str);
        A0o.append("; remoteDeviceJid");
        A0o.append(deviceJid);
        A0o.append("; linkPreviewSize=");
        C18260x0.A1G(A0o, map.size());
        if (map.isEmpty()) {
            Log.w("NonMessageDataRequestSendMethod/sendLinkPreviewRequestResponseMessage link preview result is empty");
        } else {
            AnonymousClass1OR r52 = new AnonymousClass1OR(AnonymousClass35J.A01(C56972sr.A04(r6.A00), r6.A06), str, r6.A03.A0H());
            r52.A00 = deviceJid;
            r52.A00 = map;
            if (r6.A04.A00(r52) < 0) {
                Log.e("NonMessageDataRequestSendMethod/sendLinkPreviewRequestResponseMessage unable to add link preview peer message");
            } else {
                C49712gy.A00(r6.A01, deviceJid, r52);
            }
        }
        r12.A03.A01(str, 2, set.size(), i, i2, i4, 0, i3);
    }

    public /* synthetic */ C71033bS(C64833Fe r1, DeviceJid deviceJid, String str, List list, Map map, Set set, int i, int i2, int i3) {
        this.A03 = r1;
        this.A06 = list;
        this.A07 = map;
        this.A04 = deviceJid;
        this.A05 = str;
        this.A08 = set;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
    }
}
