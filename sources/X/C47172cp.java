package X;

import android.text.TextUtils;
import android.util.Base64;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.util.Log;
import java.util.Map;
import java.util.Set;

/* renamed from: X.2cp  reason: invalid class name and case insensitive filesystem */
public class C47172cp {
    public int A00 = 0;
    public int A01 = 0;
    public int A02 = 0;
    public int A03 = 0;
    public final DeviceJid A04;
    public final String A05;
    public final Map A06 = AnonymousClass001.A0t();
    public final Set A07;
    public final /* synthetic */ C64833Fe A08;

    public C47172cp(C64833Fe r2, DeviceJid deviceJid, String str, Set set) {
        this.A08 = r2;
        this.A05 = str;
        this.A04 = deviceJid;
        this.A07 = set;
    }

    public void A00(AnonymousClass23E r20, AnonymousClass39M r21, String str, boolean z) {
        C130786cX r0;
        AnonymousClass39M r4 = r21;
        boolean A1W = AnonymousClass000.A1W(r4);
        Map map = this.A06;
        if (A1W) {
            C208519o r7 = (C208519o) AnonymousClass1EA.DEFAULT_INSTANCE.A0G();
            if (!TextUtils.isEmpty(r4.A0G)) {
                String str2 = r4.A0G;
                AnonymousClass1EA r2 = (AnonymousClass1EA) C18320x8.A0C(r7);
                str2.getClass();
                r2.bitField0_ |= 1;
                r2.url_ = str2;
            }
            String str3 = r4.A0D;
            if (!TextUtils.isEmpty(str3)) {
                byte[] decode = Base64.decode(str3, 0);
                C172548Lq A022 = C172548Lq.A02(decode, 0, decode.length);
                AnonymousClass1EA A0S = C18300x5.A0S(r7);
                A0S.bitField0_ |= 2;
                A0S.fileSha256_ = A022;
            }
            String str4 = r4.A08;
            if (!TextUtils.isEmpty(str4)) {
                C172548Lq A082 = C18270x1.A08(r7, str4);
                AnonymousClass1EA r22 = (AnonymousClass1EA) r7.A00;
                r22.bitField0_ |= 4;
                r22.fileEncSha256_ = A082;
            }
            String str5 = r4.A0B;
            if (!TextUtils.isEmpty(str5)) {
                C172548Lq A09 = C18270x1.A09(r7, Base64.decode(str5, 1));
                AnonymousClass1EA r23 = (AnonymousClass1EA) r7.A00;
                r23.bitField0_ |= 8;
                r23.mediaKey_ = A09;
            }
            String str6 = r4.A0C;
            if (!TextUtils.isEmpty(str6)) {
                AnonymousClass1EA r24 = (AnonymousClass1EA) C18320x8.A0C(r7);
                str6.getClass();
                r24.bitField0_ |= 16;
                r24.mimetype_ = str6;
            }
            int i = r4.A02;
            AnonymousClass1EA r25 = (AnonymousClass1EA) C18320x8.A0C(r7);
            r25.bitField0_ |= 32;
            r25.height_ = i;
            int i2 = r4.A03;
            AnonymousClass1EA r26 = (AnonymousClass1EA) C18320x8.A0C(r7);
            r26.bitField0_ |= 64;
            r26.width_ = i2;
            String str7 = r4.A06;
            if (!TextUtils.isEmpty(str7)) {
                AnonymousClass1EA r27 = (AnonymousClass1EA) C18320x8.A0C(r7);
                str7.getClass();
                r27.bitField0_ |= 128;
                r27.directPath_ = str7;
            }
            long j = (long) r4.A00;
            AnonymousClass1EA r42 = (AnonymousClass1EA) C18320x8.A0C(r7);
            r42.bitField0_ |= 256;
            r42.fileLength_ = j;
            r0 = r7.A06();
        } else {
            r0 = null;
        }
        AnonymousClass23E r43 = r20;
        String str8 = str;
        map.put(str8, AnonymousClass0x9.A0C(r43, r0));
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("NonMessageDataRequestManager/processResult expectedSize=");
        Set set = this.A07;
        A0o.append(set.size());
        A0o.append("; currentSize=");
        AnonymousClass0x7.A1H(A0o, map);
        A0o.append("fileHash=");
        A0o.append(str8);
        A0o.append("; result");
        A0o.append(r43.value);
        C18260x0.A1D("; hasSticker", A0o, A1W);
        if (r43 == AnonymousClass23E.SUCCESS) {
            if (z) {
                this.A03++;
            } else {
                this.A01++;
            }
        } else if (r43 == AnonymousClass23E.GENERAL_ERROR) {
            this.A00++;
        } else {
            this.A02++;
        }
        if (map.size() == set.size()) {
            C64833Fe r8 = this.A08;
            C46952cT r10 = r8.A04;
            DeviceJid deviceJid = this.A04;
            String str9 = this.A05;
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append("NonMessageDataRequestSendMethod/sendStickerRequestResponseMessage sticker stanzaId=");
            A0o2.append(str9);
            A0o2.append("; remoteDeviceJid");
            A0o2.append(deviceJid);
            A0o2.append("; stickerSize=");
            C18260x0.A1G(A0o2, map.size());
            if (map.isEmpty()) {
                Log.w("NonMessageDataRequestSendMethod/sendStickerRequestResponseMessage sticker result is empty");
            } else {
                AnonymousClass1OS r72 = new AnonymousClass1OS(AnonymousClass35J.A01(C56972sr.A04(r10.A00), r10.A06), str9, r10.A03.A0H());
                r72.A00 = deviceJid;
                r72.A00 = map;
                if (r10.A04.A00(r72) < 0) {
                    Log.e("NonMessageDataRequestSendMethod/sendStickerRequestResponseMessage unable to add sticker peer message");
                } else {
                    C49712gy.A00(r10.A01, deviceJid, r72);
                }
            }
            r8.A03.A01(str9, 0, set.size(), this.A03, this.A01, 0, this.A00, this.A02);
        }
    }
}
