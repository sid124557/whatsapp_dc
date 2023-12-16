package X;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import com.whatsapp.instrumentation.api.InstrumentationService;

/* renamed from: X.4MD  reason: invalid class name */
public class AnonymousClass4MD extends Binder implements IInterface {
    public final /* synthetic */ InstrumentationService A00;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AnonymousClass4MD(InstrumentationService instrumentationService) {
        this();
        this.A00 = instrumentationService;
    }

    public IBinder asBinder() {
        return this;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x020a, code lost:
        if (r6.equals("send_message") == false) goto L_0x0b06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x020c, code lost:
        r1 = r8.A0A;
        r6 = r4.getJSONObject("payload");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:?, code lost:
        r3 = r1.A0C.A00(r3, r6.getString("contact_id"));
        r4 = X.C86604Kt.A0a(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x022d, code lost:
        if (r1.A0F.A01(r4) != false) goto L_0x0235;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x022f, code lost:
        r3 = X.AnonymousClass5YV.A02(3, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0239, code lost:
        if (r3.A0U() == false) goto L_0x025d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x023b, code lost:
        r8 = r3.A0H;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x023f, code lost:
        if ((r8 instanceof X.C27991fJ) == false) goto L_0x025d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0241, code lost:
        r8 = (com.whatsapp.jid.GroupJid) r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0249, code lost:
        if (r1.A0A.A0C(r8) == false) goto L_0x0253;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0251, code lost:
        if (r1.A0M.A04(r3, r8) == false) goto L_0x025d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0253, code lost:
        r3 = X.AnonymousClass5YV.A02(16, "You can't send a message to this group");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0263, code lost:
        if (X.C86604Kt.A1a(r1.A04, r3) == false) goto L_0x026f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0265, code lost:
        r3 = X.AnonymousClass5YV.A02(11, "The requested contact is blocked.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x026f, code lost:
        r8 = r1.A0D;
        r3 = r8.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0277, code lost:
        if (r3.A07(r4) != false) goto L_0x0288;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0279, code lost:
        com.whatsapp.util.Log.i("system-messages-handler/new chat initiated");
        r3 = X.AnonymousClass5YV.A02(22, "User tries to start a new thread which would produce a system message");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x028c, code lost:
        if (r3.A07(r4) != false) goto L_0x029d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x028e, code lost:
        com.whatsapp.util.Log.i("system-messages-handler/new chat initiated");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0293, code lost:
        r3 = X.AnonymousClass5YV.A02(20, "There is a critical unread system message in the thread");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x02a3, code lost:
        if (r8.A01.A09(r4) == false) goto L_0x032a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x02a5, code lost:
        r20 = r8.A02.A08(r4);
        r11 = r8.A03.A0B(r4, 100, r20, -1, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:?, code lost:
        r10 = r11.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x02bd, code lost:
        if (r10 == null) goto L_0x032a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x02c3, code lost:
        if (r10.moveToFirst() != false) goto L_0x02c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x02c6, code lost:
        r9 = r8.A05.A04(r10, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x02cc, code lost:
        if (r9 == null) goto L_0x0302;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x02d2, code lost:
        if (r9.A1L == r20) goto L_0x0302;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x02e3, code lost:
        if (r9.A0K < (r8.A00.A0H() - 86400000)) goto L_0x0302;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x02e7, code lost:
        if ((r9 instanceof X.C30311mF) != false) goto L_0x0319;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x02eb, code lost:
        if ((r9 instanceof X.C30341mI) == false) goto L_0x0302;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x02ed, code lost:
        r2 = ((X.C30341mI) r9).A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x02f5, code lost:
        if (X.AnonymousClass34J.A01(r2) != false) goto L_0x0309;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x02f9, code lost:
        if (r2 == 62) goto L_0x0309;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x02fd, code lost:
        if (r2 == 63) goto L_0x0309;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x02ff, code lost:
        switch(r2) {
            case 4: goto L_0x030c;
            case 12: goto L_0x030c;
            case 18: goto L_0x030c;
            case 20: goto L_0x030c;
            case 27: goto L_0x030c;
            case X.1ES.REVOKE_MESSAGE_TIMESTAMP_FIELD_NUMBER :int: goto L_0x030c;
            case 56: goto L_0x030c;
            case X.1ES.IS_GROUP_HISTORY_MESSAGE_FIELD_NUMBER :int: goto L_0x030c;
            case 59: goto L_0x030c;
            case X.1EU.BOT_INVOKE_MESSAGE_FIELD_NUMBER :int: goto L_0x030c;
            case X.1EU.ENC_COMMENT_MESSAGE_FIELD_NUMBER :int: goto L_0x030c;
            case 79: goto L_0x030c;
            case 80: goto L_0x030c;
            case 90: goto L_0x030c;
            case 106: goto L_0x030c;
            case 123: goto L_0x030c;
            case 124: goto L_0x030c;
            case 126: goto L_0x030c;
            case 127: goto L_0x030c;
            case 130: goto L_0x030c;
            case 131: goto L_0x030c;
            case org.wawebrtc.MediaCodecVideoEncoder.MIN_ENCODER_HEIGHT :int: goto L_0x030c;
            case 149: goto L_0x030c;
            default: goto L_0x0302;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0306, code lost:
        if (r10.moveToNext() != false) goto L_0x02c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0309, code lost:
        r1 = "system-messages-handler/critical message";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x030c, code lost:
        r1 = X.AnonymousClass000.A0Y("system-messages-handler/critical message ", X.AnonymousClass001.A0o(), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0316, code lost:
        com.whatsapp.util.Log.i(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:?, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x031e, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x031f, code lost:
        r1 = r11.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0321, code lost:
        if (r1 != null) goto L_0x0323;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0323, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0326, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0327, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x032a, code lost:
        r8 = r6.optString("media_type", "plain_text");
        r10 = r6.optString("media_uri");
        r24 = r6.optString("message");
        r3 = r6.optInt("media_quality", -1);
        r9 = r6.optJSONArray("visualization_data");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x034d, code lost:
        switch(r8.hashCode()) {
            case 106642994: goto L_0x0358;
            case 112202875: goto L_0x0372;
            case 354039290: goto L_0x045b;
            case 1021751938: goto L_0x0476;
            default: goto L_0x0350;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x0350, code lost:
        r3 = X.AnonymousClass5YV.A02(2, "Request is not implemented yet!");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x035e, code lost:
        if (r8.equals("photo") == false) goto L_0x0350;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x0368, code lost:
        if (android.text.TextUtils.isEmpty(r10) == false) goto L_0x048a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x036a, code lost:
        r3 = X.AnonymousClass5YV.A02(1, "Bad request -  photo uri is empty");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x0378, code lost:
        if (r8.equals("video") == false) goto L_0x0350;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x037e, code lost:
        if (android.text.TextUtils.isEmpty(r10) == false) goto L_0x0389;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x0380, code lost:
        r2 = 1;
        r1 = "Bad request -  video uri is empty";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x0383, code lost:
        r3 = X.AnonymousClass5YV.A02(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x0391, code lost:
        if (r1.A09.A04() == X.C997357z.GRANTED) goto L_0x0398;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x0393, code lost:
        r2 = 24;
        r1 = "Missing media permission to send media Messages";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:?, code lost:
        r1.A00();
        r6 = r1.A01;
        r25 = java.util.Collections.singletonList(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:?, code lost:
        r7 = r1.A06.A0R().A06(android.net.Uri.parse(r10));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:?, code lost:
        r8 = X.AnonymousClass001.A0o();
        r8.append("temp_");
        r23 = java.io.File.createTempFile(X.AnonymousClass001.A0k(r8, java.lang.System.currentTimeMillis()), (java.lang.String) null, r1.A08.A00.getCacheDir());
        r8 = X.AnonymousClass0x9.A0h(r23);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:?, code lost:
        r9 = new byte[com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor.UNZIP_BUFFER_SIZE];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x03d5, code lost:
        r3 = r7.read(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x03da, code lost:
        if (r3 == -1) goto L_0x03e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x03dc, code lost:
        r8.write(r9, 0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:?, code lost:
        r7.close();
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x03e8, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x03ea, code lost:
        r2 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x03eb, code lost:
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x03ed, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x03ee, code lost:
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x03f0, code lost:
        r2 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x03f2, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x03f3, code lost:
        r7 = null;
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:?, code lost:
        r2.printStackTrace();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x03f9, code lost:
        r2 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x03fa, code lost:
        if (r7 != null) goto L_0x03fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:?, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x03ff, code lost:
        if (r8 != null) goto L_0x0401;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x0401, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x0405, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:?, code lost:
        r1.printStackTrace();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x0409, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x040a, code lost:
        if (r7 != null) goto L_0x040c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:?, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x040f, code lost:
        if (r8 != null) goto L_0x0411;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x0411, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x0415, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:?, code lost:
        r2.printStackTrace();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x0419, code lost:
        r23 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x041c, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x041d, code lost:
        r2.printStackTrace();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x0420, code lost:
        r6.A09((X.C185388tZ) null, (X.C108845de) null, (X.C106985aV) null, (X.C624134x) null, r23, r24, r25, 0, 0, false);
        r1.A05.A00(r4, 1, true, true);
        r3 = X.AnonymousClass5YV.A03((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x043e, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:?, code lost:
        com.whatsapp.util.Log.e("sendmedia/sendvideos/share-failed/ ", r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x0448, code lost:
        if (r2.getMessage() == null) goto L_0x0456;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x0450, code lost:
        r2 = 19;
        r1 = "Device doesn't have enough free space";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x0456, code lost:
        r2 = 5;
        r1 = "Service internal error! ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x0461, code lost:
        if (r8.equals("voice_message") == false) goto L_0x0350;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x0467, code lost:
        if (android.text.TextUtils.isEmpty(r10) == false) goto L_0x0532;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x0469, code lost:
        com.whatsapp.util.Log.e("sendVoiceMessage/ empty URI");
        r3 = X.AnonymousClass5YV.A02(1, "Bad request -  voice message uri is empty");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x047a, code lost:
        if (r8.equals("plain_text") == false) goto L_0x0350;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x0480, code lost:
        if (android.text.TextUtils.isEmpty(r24) == false) goto L_0x07ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x0482, code lost:
        r3 = X.AnonymousClass5YV.A02(1, "Bad request -  message is empty");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x0492, code lost:
        if (r1.A09.A04() == X.C997357z.GRANTED) goto L_0x049e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x0494, code lost:
        r2 = 24;
        r1 = "Missing media permission to send media Messages";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x0498, code lost:
        r3 = X.AnonymousClass5YV.A02(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x049e, code lost:
        r17 = android.net.Uri.parse(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:?, code lost:
        r1.A00();
        r7 = r1.A01;
        r25 = java.util.Collections.singletonList(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x04b0, code lost:
        if (r3 == -1) goto L_0x04c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x04b2, code lost:
        r8 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x04b3, code lost:
        if (r3 == 0) goto L_0x04ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x04b5, code lost:
        r8 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x04b6, code lost:
        if (r3 == 1) goto L_0x04ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x04b8, code lost:
        r8 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x04b9, code lost:
        if (r3 == 2) goto L_0x04ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x04bb, code lost:
        r8 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x04bc, code lost:
        if (r3 == 3) goto L_0x04ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x04be, code lost:
        X.C18260x0.A0z("sendmedia/translateMediaQuality/ Unknown media quality: ", X.AnonymousClass001.A0o(), r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x04c7, code lost:
        r23 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x04ca, code lost:
        r23 = java.lang.Integer.valueOf(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x04ce, code lost:
        r7.A00(r17, (android.net.Uri) null, (X.C181618n3) null, (X.C108845de) null, (X.AnonymousClass65N) null, (X.C624134x) null, r23, r24, r25, (java.util.List) null, (java.util.List) null, 0, 0, 0, false, false, false, false, false);
        r1.A05.A00(r4, 1, true, true);
        r3 = X.AnonymousClass5YV.A03((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x04f8, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:?, code lost:
        com.whatsapp.util.Log.e("sendmedia/sendimages/share-failed/ ", r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x0501, code lost:
        if (r4.getMessage() == null) goto L_0x052c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x0509, code lost:
        r2 = 19;
        r1 = "Device doesn't have enough free space";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x050e, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x050f, code lost:
        com.whatsapp.util.Log.e("sendmedia/sendimages/share-failed/ ", r1);
        r3 = X.AnonymousClass5YV.A02(5, "Service internal error! ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x0519, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x051a, code lost:
        com.whatsapp.util.Log.e("sendmedia/sendimages/share-failed/ ", r1);
        r1 = "Bad request -  file not an image";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x0520, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x0521, code lost:
        com.whatsapp.util.Log.e("sendmedia/sendimages/share-failed/ ", r1);
        r1 = "Bad request -  URI inaccessible";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x0526, code lost:
        r3 = X.AnonymousClass5YV.A02(1, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x052c, code lost:
        r3 = X.AnonymousClass5YV.A02(5, "Service internal error! ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x053c, code lost:
        if (r1.A0B.A01.A0X(5649) != false) goto L_0x0546;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x053e, code lost:
        com.whatsapp.util.Log.e("sendVoiceMessage/ feature disabled");
        r1 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:?, code lost:
        r1.A00();
        r3 = android.net.Uri.parse(r10);
        r6 = new X.AnonymousClass33C();
        r8 = r1.A0N.A0E(r3);
        r10 = r1.A0G;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x055e, code lost:
        if (r8.canRead() != false) goto L_0x0582;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x0560, code lost:
        r3 = r10.A00;
        com.whatsapp.util.Log.w("emitFileNotExistsError");
        r3.A00("PTT_VALIDATION_FILE_NOT_EXIST", (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x056d, code lost:
        com.whatsapp.util.Log.e("isValidVoiceMessageFile file validation failed");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x0572, code lost:
        com.whatsapp.util.Log.e("sendVoiceMessage/ file validation failed");
        r8.delete();
        r3 = X.AnonymousClass5YV.A02(1, "Bad request -  voice message file validation failed");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:0x0582, code lost:
        r2 = r8.length();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x058a, code lost:
        if (r2 <= 0) goto L_0x068e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x0591, code lost:
        if (r2 > 2000000) goto L_0x068e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:?, code lost:
        r7 = com.whatsapp.media.OggAnalyzer.examineOggStream(r8.getAbsolutePath());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x059d, code lost:
        if (r7.isAudioStreamOpus != false) goto L_0x05ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:0x059f, code lost:
        r4 = r10.A00;
        com.whatsapp.util.Log.w("emitNotOpusError");
        r5 = "PTT_VALIDATION_NOT_OPUS";
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:0x05a9, code lost:
        r4.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:305:0x05ad, code lost:
        r2 = r7.fileDurationSeconds;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:306:0x05b3, code lost:
        if (r2 >= 1.0f) goto L_0x05c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:307:0x05b5, code lost:
        r4 = r10.A00;
        r3 = X.AnonymousClass001.A0o();
        r3.append("emitDurationTooShortError durationSeconds=");
        r3.append(r2);
        X.AnonymousClass0x2.A19(r3);
        r5 = "PTT_VALIDATION_DURATION_MIN";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:309:0x05cd, code lost:
        if (r2 <= 300.0f) goto L_0x060a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:0x05cf, code lost:
        r4 = r10.A00;
        r3 = X.AnonymousClass001.A0o();
        r3.append("emitDurationTooLongError durationSeconds=");
        r3.append(r2);
        X.AnonymousClass0x2.A19(r3);
        r5 = "PTT_VALIDATION_DURATION_MAX";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:312:0x05e7, code lost:
        if (r2 <= 86400.0f) goto L_0x05ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:313:0x05e9, code lost:
        r1 = "P1D-P1Y";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:315:0x05f0, code lost:
        if (r2 <= 360.0f) goto L_0x05f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x05f2, code lost:
        r1 = "PT6M-P1D";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:318:0x05f9, code lost:
        if (r2 <= 300.0f) goto L_0x05fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:319:0x05fb, code lost:
        r1 = "PT5M-PT6M";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:321:0x0602, code lost:
        if (r2 <= 1.0f) goto L_0x0607;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:322:0x0604, code lost:
        r1 = "PT1S-PT5M";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:323:0x0607, code lost:
        r1 = "PT0S-PT1S";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x060a, code lost:
        r3 = r7.numberOfStreams;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:325:0x060c, code lost:
        if (r3 == 1) goto L_0x0620;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:326:0x060e, code lost:
        r4 = r10.A00;
        X.C18260x0.A0z("emitMultipleStreamsError streamsCount=", X.AnonymousClass001.A0o(), r3);
        r5 = "PTT_VALIDATION_MULTIPLE_STREAMS";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:0x061b, code lost:
        r1 = java.lang.Integer.toString(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:328:0x0620, code lost:
        r3 = r7.samplingRate;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:329:0x0624, code lost:
        if (r3 == 16000) goto L_0x0634;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:330:0x0626, code lost:
        r4 = r10.A00;
        X.C18260x0.A0z("emitSamplingRateError samplingRateHz=", X.AnonymousClass001.A0o(), r3);
        r5 = "PTT_VALIDATION_SAMPLING_RATE";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:331:0x0634, code lost:
        r3 = r7.channels;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:332:0x0636, code lost:
        if (r3 == 1) goto L_0x0646;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:333:0x0638, code lost:
        r4 = r10.A00;
        X.C18260x0.A0z("emitChannelsCountError channelsCount=", X.AnonymousClass001.A0o(), r3);
        r5 = "PTT_VALIDATION_CHANNELS";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:334:0x0646, code lost:
        r7 = r10.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:335:0x0652, code lost:
        if (r7.A00.A01.A0X(6076) != false) goto L_0x065a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:336:0x0654, code lost:
        com.whatsapp.util.Log.w("emitSuccess suppressed");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:337:0x065a, code lost:
        com.whatsapp.util.Log.i("emitSuccess");
        r7 = r7.A01;
        r7.markerStart(494345136);
        r7.markerAnnotate(494345136, "is_success", true);
        r7.markerEnd(494345136, 2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:338:0x0670, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:341:?, code lost:
        com.whatsapp.util.Log.e("isValidVoiceMessageFile failed to parse file", r2);
        r4 = r10.A00;
        r3 = r2.errorCode;
        X.C18260x0.A0z("emitOpusParsingError errorCode=", X.AnonymousClass001.A0o(), r3);
        r4.A00("PTT_VALIDATION_PARSING", java.lang.Integer.toString(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:342:0x068e, code lost:
        r9 = r10.A00;
        X.C18270x1.A1B("emitFileSizeError fileSizeBytes=", X.AnonymousClass001.A0o(), r2);
        r9.A00("PTT_VALIDATION_FILE_SIZE", java.lang.Long.toString(java.lang.Math.round(java.lang.Math.ceil(((double) r2) / 100.0d) * 100.0d)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:343:0x06b1, code lost:
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:344:0x06b2, code lost:
        if (r9 != null) goto L_0x06b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:345:0x06b4, code lost:
        r2 = "parseVoiceMessageVisualizationData jsonVisualizationData is null";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:346:0x06b7, code lost:
        r5 = r9.length();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:347:0x06bb, code lost:
        if (r5 < 1) goto L_0x06fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:349:0x06bf, code lost:
        if (r5 > 10000) goto L_0x06fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:350:0x06c1, code lost:
        r10 = X.AnonymousClass002.A0I(r5);
        r11 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:352:?, code lost:
        r12 = r9.getInt(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:353:0x06ca, code lost:
        if (r12 < 0) goto L_0x06e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:355:0x06ce, code lost:
        if (r12 > 100) goto L_0x06e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:356:0x06d0, code lost:
        X.C18270x1.A1K(r10, r12);
        r11 = r11 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:357:0x06d5, code lost:
        if (r11 < r5) goto L_0x06c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:359:?, code lost:
        X.C18260x0.A0w("parseVoiceMessageVisualizationData success size=", X.AnonymousClass001.A0o(), r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:361:?, code lost:
        X.C18260x0.A0z("isValidValue value is outside expected range: ", X.AnonymousClass001.A0o(), r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:362:0x06eb, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:364:?, code lost:
        com.whatsapp.util.Log.w(X.AnonymousClass000.A0Y("parseVoiceMessageVisualizationData invalid integer at position ", X.AnonymousClass001.A0o(), r11), r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:365:0x06fa, code lost:
        r2 = X.AnonymousClass000.A0Y("parseVoiceMessageVisualizationData jsonDataLen=", X.AnonymousClass001.A0o(), r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:366:0x0704, code lost:
        com.whatsapp.util.Log.w(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:389:0x078b, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:390:0x078c, code lost:
        com.whatsapp.util.Log.e("sendmedia/sendvoicemessage/share-failed/ ", r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:391:0x0795, code lost:
        if (r2.getMessage() == null) goto L_0x07a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:394:0x079d, code lost:
        r1 = 19;
        r7 = "Device doesn't have enough free space";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:395:0x07a1, code lost:
        r3 = X.AnonymousClass5YV.A02(r1, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:396:0x07a7, code lost:
        r1 = 5;
        r7 = "Service internal error! ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:397:0x07ab, code lost:
        r1.A00();
        r1.A02.A0C((X.C66513Ls) null, (X.C108845de) null, (X.C624134x) null, r24, java.util.Collections.singletonList(r4), (java.util.List) null, false, false);
        r1.A05.A00(r4, 1, true, true);
        r3 = X.AnonymousClass5YV.A03((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:401:?, code lost:
        com.whatsapp.util.Log.e("requesthandler/send-message invalid contact ID");
        r3 = X.AnonymousClass5YV.A02(1, "Bad request - send_message");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:403:0x07dd, code lost:
        if (r6.equals("announce_user_opt_out") == false) goto L_0x0b06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:406:?, code lost:
        r8.A05.A00.A00(r9);
        r3 = X.AnonymousClass5YV.A03((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:407:0x07ed, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:410:?, code lost:
        com.whatsapp.util.Log.e("AnnounceUserOptOutRequest/handleRequest Error revoking access: ", r2);
        r1 = "Bad request - announce_user_opt_out";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:412:0x07fd, code lost:
        if (r6.equals("accept_call") == false) goto L_0x0b06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:413:0x07ff, code lost:
        r6 = r8.A03;
        r2 = r4.getJSONObject("payload");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:414:0x080f, code lost:
        if (com.whatsapp.voipcalling.Voip.A08(com.whatsapp.voipcalling.Voip.getCurrentCallState()) != false) goto L_0x081b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:415:0x0811, code lost:
        r2 = 18;
        r1 = "There is no incoming call";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:416:0x0815, code lost:
        r3 = X.AnonymousClass5YV.A02(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:417:0x081b, code lost:
        r5 = r6.A03.A02(r3, r2.getString("call_id"));
        r2 = com.whatsapp.voipcalling.Voip.getCallInfo();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:418:0x082b, code lost:
        if (r2 == null) goto L_0x0874;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:420:0x0833, code lost:
        if (r5.equals(r2.callId) == false) goto L_0x0874;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:422:0x0837, code lost:
        if (r2.isGroupCall != false) goto L_0x086f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:424:0x083b, code lost:
        if (r2.isJoinableGroupCall != false) goto L_0x086f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:425:0x083d, code lost:
        r3 = r2.videoEnabled;
        r2 = r6.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:426:0x0845, code lost:
        if (r2.A0D() == false) goto L_0x086a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:428:0x084b, code lost:
        if (X.C107305b5.A08(r2, r3) != false) goto L_0x086a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:429:0x084d, code lost:
        r4 = r6.A01.A00;
        r4.startActivity(X.C86664Kz.A1B().A1S(r4, r5, 3, !r6.A00.A00));
        r3 = X.AnonymousClass5YV.A03((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:430:0x086a, code lost:
        r2 = 9;
        r1 = "WhatsApp requires voice permissions for this operation.";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:431:0x086f, code lost:
        r2 = 23;
        r1 = "Group calling is disabled";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:432:0x0874, code lost:
        r2 = 17;
        r1 = "There is no call with that call id";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:434:0x087f, code lost:
        if (r6.equals("get_call_state") == false) goto L_0x0b06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:435:0x0881, code lost:
        r10 = r8.A06;
        r3 = X.AnonymousClass5YV.A03(X.C95794uX.A01(r10.A00, r10.A01, r10.A02, r10.A03, r10.A04, r10.A05, r3, (com.whatsapp.voipcalling.CallInfo) r10.A06.get(), (com.whatsapp.voipcalling.CallState) r10.A07.get()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:437:0x08c1, code lost:
        if (r6.equals("access_contacts") == false) goto L_0x0b06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:438:0x08c3, code lost:
        r3 = r8.A04;
        r2 = X.AnonymousClass001.A0s();
        r2.add(X.C85124Fa.A00);
        r5 = r3.A00;
        r5.A01.A02(r9);
        r4 = r2.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:440:0x08dd, code lost:
        if (r4.hasNext() == false) goto L_0x08f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:441:0x08df, code lost:
        r3 = X.C86664Kz.A0c(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:442:0x08ed, code lost:
        if ("com.whatsapp.provider.instrumentation".equals(r3.getAuthority()) == false) goto L_0x0b48;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:443:0x08ef, code lost:
        r5.A00.A00.grantUriPermission(r9, r3, 129);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:444:0x08f9, code lost:
        r3 = X.AnonymousClass5YV.A03((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:446:0x0906, code lost:
        if (r6.equals("reject_call") == false) goto L_0x0b06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:447:0x0908, code lost:
        r3 = r8.A0D.A00(r3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:449:0x0916, code lost:
        if (r6.equals("mark_message_read") == false) goto L_0x0b06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:450:0x0918, code lost:
        r6 = r8.A09;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:453:?, code lost:
        r2 = r4.getJSONObject("payload").getString("message_id");
        r7 = r6.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:455:?, code lost:
        r2 = new org.json.JSONArray(r7.A00.A02(r3, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:456:0x0938, code lost:
        if (r2.getInt(0) != 1) goto L_0x09d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:459:?, code lost:
        r8 = r7.A01.A05(new X.AnonymousClass2z0(X.C106405Yw.A04(r2.getString(3)), r2.getString(1), r2.getBoolean(2)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:460:0x0956, code lost:
        if (r8 == null) goto L_0x09ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:461:0x0958, code lost:
        r7 = X.AnonymousClass2z0.A00(r8);
        r6 = r6.A00;
        r9 = r6.A00.A0A(r7, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:462:0x0967, code lost:
        if (r9 != null) goto L_0x097d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:463:0x0969, code lost:
        r1 = X.AnonymousClass000.A0P(r7, "msgstore/setChatPartiallySeen/nochat/", X.AnonymousClass001.A0o());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:464:0x0973, code lost:
        com.whatsapp.util.Log.i(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:465:0x0976, code lost:
        r3 = X.AnonymousClass5YV.A03((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:467:0x0983, code lost:
        if (r9.A0Q < r8.A1M) goto L_0x0988;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:468:0x0985, code lost:
        r1 = "msgstore/setChatPartiallySeen/message already seen";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:469:0x0988, code lost:
        r3 = r6.A02;
        r19 = ((X.AnonymousClass2UO) r3.get()).A0J.A00(r7, r8.A1M);
        r2 = X.AnonymousClass001.A0o();
        r2.append("msgstore/setChatPartiallySeen/");
        r2.append(r7);
        r2.append("/");
        X.C18260x0.A1L(r2, r9.A08());
        r20 = ((X.AnonymousClass2UO) r3.get()).A0J.A02(r7, r8.A1M);
        r6.A05(r7, r8, r19 - r20, r20, 3, true, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:470:0x09ce, code lost:
        r2 = new java.lang.SecurityException("Message not found");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:474:0x09dd, code lost:
        throw new java.lang.SecurityException("Decryption failed - version mismatch");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:475:0x09de, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:478:?, code lost:
        r2 = new java.lang.SecurityException("Decryption failed", r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:479:0x09e6, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:480:0x09e7, code lost:
        r1 = "Bad request - mark_message_read";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:483:?, code lost:
        r3 = X.AnonymousClass5YV.A02(1, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:485:0x09f5, code lost:
        if (r6.equals("start_voip_call") == false) goto L_0x0b06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:486:0x09f7, code lost:
        r5 = r8.A0B;
        r8 = r4.getJSONObject("payload").getJSONArray("contact_ids");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:487:0x0a0b, code lost:
        if (r8.length() != 0) goto L_0x0a18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:488:0x0a0d, code lost:
        com.whatsapp.util.Log.w("requesthandler/handle-start-voip-call request did not include a contact");
        r3 = X.AnonymousClass5YV.A02(1, "Bad request - start_voip_call");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:489:0x0a18, code lost:
        r6 = X.AnonymousClass002.A0K();
        r7 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:492:0x0a21, code lost:
        if (r7 >= r8.length()) goto L_0x0a59;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:493:0x0a23, code lost:
        r2 = r8.getString(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:494:0x0a2b, code lost:
        if (android.text.TextUtils.isEmpty(r2) == false) goto L_0x0a38;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:495:0x0a2d, code lost:
        com.whatsapp.util.Log.w("requesthandler/handle-start-voip-call request included an empty contact");
        r3 = X.AnonymousClass5YV.A02(1, "Bad request - start_voip_call");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:496:0x0a38, code lost:
        r2 = r5.A07.A00(r3, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:497:0x0a42, code lost:
        if (r2.A0U() == false) goto L_0x0a53;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:498:0x0a44, code lost:
        com.whatsapp.util.Log.w("requesthandler/handle-start-voip-call cannot place group calls yet");
        r3 = X.AnonymousClass5YV.A02(23, "Group calling is disabled");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:499:0x0a53, code lost:
        r6.add(r2);
        r7 = r7 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:502:0x0a5f, code lost:
        if (r5.A06.A0D() == false) goto L_0x0aec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:505:0x0a65, code lost:
        if (r5.A01.A00 != false) goto L_0x0a6c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:506:0x0a67, code lost:
        r5.A09.A00(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:507:0x0a6c, code lost:
        r4 = X.C627236i.A06(X.AnonymousClass35J.A03(r5.A02, r5.A04, true));
        r2 = new java.util.concurrent.FutureTask(new X.C117925si(r5, r4, r6));
        r5.A00.post(r2);
        r2 = ((java.lang.Integer) r2.get()).intValue();
        r3 = r5.A08.A03(r3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:508:0x0a97, code lost:
        if (r2 == 0) goto L_0x0ac8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:509:0x0a99, code lost:
        switch(r2) {
            case 2: goto L_0x0a9d;
            case 3: goto L_0x0aa2;
            case 4: goto L_0x0aa7;
            case 5: goto L_0x0aac;
            case 6: goto L_0x0ab1;
            case 7: goto L_0x0ab6;
            case 8: goto L_0x0abb;
            case 9: goto L_0x0abb;
            default: goto L_0x0a9c;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:511:0x0a9d, code lost:
        r2 = 13;
        r1 = "Can't initiate a call when a pending call exists.";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:512:0x0aa2, code lost:
        r2 = 14;
        r1 = "Unable to perform requested operation as terms of service have not been accepted.";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:513:0x0aa7, code lost:
        r2 = 12;
        r1 = "WhatsApp needs an internet connection to perform this operation.";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:514:0x0aac, code lost:
        r2 = 11;
        r1 = "The requested contact is blocked.";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:515:0x0ab1, code lost:
        r2 = 15;
        r1 = "Video calling is disabled.";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:516:0x0ab6, code lost:
        r2 = 9;
        r1 = "WhatsApp requires voice permissions for this operation.";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:517:0x0abb, code lost:
        r2 = 10;
        r1 = "Can't initiate a call when already in a call.";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:518:0x0ac0, code lost:
        r2 = 5;
        r1 = "Service internal error! start_voip_call";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:519:0x0ac3, code lost:
        r3 = X.AnonymousClass5YV.A02(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:520:0x0ac8, code lost:
        r3 = X.AnonymousClass5YV.A03(X.AnonymousClass0x9.A1G().put("call_id", r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:524:?, code lost:
        r3 = X.AnonymousClass5YV.A02(5, "Service internal error! start_voip_call");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:527:0x0ae5, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:528:0x0ae6, code lost:
        r5.A09.A01(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:529:0x0aeb, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:530:0x0aec, code lost:
        com.whatsapp.util.Log.w("requesthandler/handle-start-voip-call insufficient permissions for call");
        r3 = X.AnonymousClass5YV.A02(9, "WhatsApp requires voice permissions for this operation.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:531:0x0afb, code lost:
        com.whatsapp.util.Log.w("requesthandler/handle-start-voip-call request included an invalid contact");
        r3 = X.AnonymousClass5YV.A02(1, "Bad request - start_voip_call");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:533:0x0b06, code lost:
        X.C18260x0.A0t("RequestHandler/handleRequest unhandled action = ", r6, X.AnonymousClass001.A0o());
        r3 = X.AnonymousClass5YV.A02(1, X.AnonymousClass000.A0V("Bad request - ", r6, X.AnonymousClass001.A0o()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:540:0x0b48, code lost:
        r3 = new java.lang.SecurityException(X.AnonymousClass000.A0P(r3, "Unexpected authority in URI: ", X.AnonymousClass001.A0o()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:570:0x0bfc, code lost:
        if (r6 != 1598968902) goto L_0x0bfe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0148, code lost:
        if (r6.equals(r10) != false) goto L_0x014b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x014b, code lost:
        switch(r12) {
            case -1472535883: goto L_0x0150;
            case -1368724237: goto L_0x0160;
            case -624136624: goto L_0x0204;
            case 565287780: goto L_0x07d7;
            case 628187957: goto L_0x07f7;
            case 711383033: goto L_0x0879;
            case 771140814: goto L_0x08bb;
            case 1331833598: goto L_0x0900;
            case 1912051456: goto L_0x0910;
            case 2060915200: goto L_0x09ef;
            default: goto L_0x014e;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0156, code lost:
        if (r6.equals("hang_up_call") == false) goto L_0x0b06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0158, code lost:
        r3 = r8.A0C.A00(r3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0166, code lost:
        if (r6.equals("get_unread_messages") == false) goto L_0x0b06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0168, code lost:
        r6 = r8.A07;
        r7 = r4.optJSONObject("payload");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0170, code lost:
        if (r7 != null) goto L_0x0176;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0172, code lost:
        r7 = X.AnonymousClass0x9.A1G();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0176, code lost:
        r4 = r7.optLong("time_limit_ms", 86400000);
        r2 = r7.optString("contact_id");
        r7 = X.AnonymousClass001.A0s();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x018d, code lost:
        if (android.text.TextUtils.isEmpty(r2) != false) goto L_0x01a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:?, code lost:
        r6.A00(X.C86604Kt.A0a(r6.A05.A00(r3, r2)), r7, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:?, code lost:
        com.whatsapp.util.Log.e("requesthandler/get-unread-messages invalid contact ID");
        r2 = 1;
        r1 = "Bad request - send_message";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01a7, code lost:
        r1 = r6.A00;
        r9 = r6.A07;
        r8 = r1.A0A(r9).iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01b7, code lost:
        if (r8.hasNext() == false) goto L_0x01d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01b9, code lost:
        r2 = X.C18300x5.A0P(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01c3, code lost:
        if (r6.A02.A09(r2) == false) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01c9, code lost:
        if (r9.A0h(r2) != false) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01d1, code lost:
        if (r6.A03.A0M(r2) != false) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01d3, code lost:
        r6.A00(r2, r7, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01d7, code lost:
        X.AnonymousClass6A6.A00(r7, 3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:?, code lost:
        r5 = X.AnonymousClass0x9.A1F();
        r4 = r7.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01e7, code lost:
        if (r4.hasNext() == false) goto L_0x01f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01e9, code lost:
        r1 = r6.A06.A02(X.C18300x5.A0T(r4), r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01f3, code lost:
        if (r1 == null) goto L_0x01e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01f5, code lost:
        r5.put(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01f9, code lost:
        r3 = X.AnonymousClass5YV.A03(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01ff, code lost:
        r2 = 5;
        r1 = "Service internal error! get_unread_messages";
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x040c A[SYNTHETIC, Splitter:B:220:0x040c] */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x0411 A[Catch:{ IOException -> 0x0415 }] */
    /* JADX WARNING: Removed duplicated region for block: B:399:? A[ExcHandler: NullPointerException | SecurityException (unused java.lang.Throwable), SYNTHETIC, Splitter:B:106:0x021c] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:383:0x0747=Splitter:B:383:0x0747, B:161:0x0319=Splitter:B:161:0x0319} */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:41:0x00e3=Splitter:B:41:0x00e3, B:482:0x09e9=Splitter:B:482:0x09e9, B:525:0x0ade=Splitter:B:525:0x0ade} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTransact(int r37, android.os.Parcel r38, android.os.Parcel r39, int r40) {
        /*
            r36 = this;
            java.lang.String r3 = "com.whatsapp.instrumentation.InstrumentationInterface"
            r0 = 1
            r2 = r36
            r6 = r37
            r4 = r38
            r15 = r39
            if (r6 < r0) goto L_0x0bfe
            r1 = 16777215(0xffffff, float:2.3509886E-38)
            if (r6 > r1) goto L_0x0bf9
            r4.enforceInterface(r3)
            if (r6 == r0) goto L_0x0b8a
            r5 = 2
            if (r6 != r5) goto L_0x0bfe
            java.lang.String r4 = r4.readString()
            java.lang.String r1 = "InstrumentationService/request"
            com.whatsapp.util.Log.d((java.lang.String) r1)
            com.whatsapp.instrumentation.api.InstrumentationService r2 = r2.A00
            X.1uP r1 = r2.A02
            X.2pD r3 = r1.A00()
            r3.A00()
            android.os.Binder.clearCallingIdentity()
            X.5LU r8 = r2.A00     // Catch:{ Exception -> 0x0b7a }
            X.2jE r1 = r8.A0G     // Catch:{ Exception -> 0x0b7a }
            boolean r1 = r1.A02()     // Catch:{ Exception -> 0x0b7a }
            if (r1 != 0) goto L_0x0049
            java.lang.String r1 = "RequestHandler/request client is not registered"
            com.whatsapp.util.Log.w((java.lang.String) r1)     // Catch:{ Exception -> 0x0b7a }
            java.lang.String r2 = "Client is not registered"
            r1 = 7
            java.lang.String r3 = X.AnonymousClass5YV.A02(r1, r2)     // Catch:{ Exception -> 0x0b7a }
            goto L_0x0c05
        L_0x0049:
            X.2OK r1 = r8.A02     // Catch:{ Exception -> 0x0b7a }
            boolean r1 = X.AnonymousClass2OK.A00(r1)     // Catch:{ Exception -> 0x0b7a }
            java.lang.String r7 = "Feature is disabled!"
            if (r1 != 0) goto L_0x005f
            java.lang.String r1 = "RequestHandler/request service not enabled"
        L_0x0055:
            com.whatsapp.util.Log.w((java.lang.String) r1)     // Catch:{ Exception -> 0x0b7a }
            r1 = 3
            java.lang.String r3 = X.AnonymousClass5YV.A02(r1, r7)     // Catch:{ Exception -> 0x0b7a }
            goto L_0x0c05
        L_0x005f:
            X.2sr r1 = r8.A00     // Catch:{ Exception -> 0x0b7a }
            X.1RR r2 = X.C56972sr.A01(r1)     // Catch:{ Exception -> 0x0b7a }
            if (r2 == 0) goto L_0x0070
            X.32v r1 = r8.A0E     // Catch:{ Exception -> 0x0b7a }
            boolean r1 = r1.A00(r2)     // Catch:{ Exception -> 0x0b7a }
            if (r1 == 0) goto L_0x0070
            goto L_0x0073
        L_0x0070:
            java.lang.String r1 = "RequestHandler/request service not enabled for this number"
            goto L_0x0055
        L_0x0073:
            X.5XU r1 = r8.A01     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            boolean r1 = r1.A02()     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            if (r1 != 0) goto L_0x0b3e
            org.json.JSONObject r4 = X.AnonymousClass0x9.A1H(r4)     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            java.lang.String r1 = "action"
            java.lang.String r6 = r4.getString(r1)     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            java.lang.String r11 = "header"
            org.json.JSONObject r2 = r4.getJSONObject(r11)     // Catch:{ JSONException -> 0x0b35 }
            java.lang.String r1 = "protocol_version"
            int r1 = r2.getInt(r1)     // Catch:{ JSONException -> 0x0b35 }
            if (r1 < r0) goto L_0x0b35
            java.lang.String r10 = "get_request_token"
            boolean r1 = r6.equals(r10)     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            if (r1 == 0) goto L_0x0105
            X.2eN r5 = r8.A0F     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            java.lang.String r8 = r3.A01     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            monitor-enter(r5)     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            X.2yy r7 = r5.A00     // Catch:{ all -> 0x0101 }
            java.lang.String r4 = "request/token"
            java.lang.String r2 = X.C60692yy.A00(r8, r4)     // Catch:{ all -> 0x0101 }
            android.content.SharedPreferences r1 = r7.A01()     // Catch:{ all -> 0x0101 }
            java.lang.String r6 = X.C18280x3.A0Z(r1, r2)     // Catch:{ all -> 0x0101 }
            if (r6 != 0) goto L_0x00e3
            java.security.SecureRandom r3 = new java.security.SecureRandom     // Catch:{ all -> 0x0101 }
            r3.<init>()     // Catch:{ all -> 0x0101 }
            r1 = 16
            byte[] r2 = new byte[r1]     // Catch:{ all -> 0x0101 }
            r3.nextBytes(r2)     // Catch:{ all -> 0x0101 }
            r1 = 11
            java.lang.String r6 = android.util.Base64.encodeToString(r2, r1)     // Catch:{ all -> 0x0101 }
            java.lang.String r2 = X.C60692yy.A00(r8, r4)     // Catch:{ all -> 0x0101 }
            java.lang.String r1 = "request/token_ts"
            java.lang.String r4 = X.C60692yy.A00(r8, r1)     // Catch:{ all -> 0x0101 }
            android.content.SharedPreferences r1 = r7.A01()     // Catch:{ all -> 0x0101 }
            android.content.SharedPreferences$Editor r1 = r1.edit()     // Catch:{ all -> 0x0101 }
            android.content.SharedPreferences$Editor r3 = r1.putString(r2, r6)     // Catch:{ all -> 0x0101 }
            X.2sH r1 = r7.A01     // Catch:{ all -> 0x0101 }
            long r1 = r1.A0H()     // Catch:{ all -> 0x0101 }
            X.C18270x1.A0i(r3, r4, r1)     // Catch:{ all -> 0x0101 }
        L_0x00e3:
            monitor-exit(r5)     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            org.json.JSONObject r3 = X.AnonymousClass0x9.A1G()     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            org.json.JSONObject r2 = X.AnonymousClass0x9.A1G()     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            java.lang.String r1 = "request_token"
            r2.put(r1, r6)     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            java.lang.String r1 = "success"
            r3.put(r1, r0)     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            java.lang.String r1 = "result"
            r3.put(r1, r2)     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            java.lang.String r3 = r3.toString()     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            goto L_0x0c05
        L_0x0101:
            r3 = move-exception
            monitor-exit(r5)     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            goto L_0x0b57
        L_0x0105:
            r9 = 0
            org.json.JSONObject r2 = r4.getJSONObject(r11)     // Catch:{ JSONException -> 0x0b2d }
            java.lang.String r1 = "authorization_token"
            java.lang.String r2 = r2.optString(r1, r9)     // Catch:{ JSONException -> 0x0b2d }
            if (r2 == 0) goto L_0x0b2d
            X.2eN r1 = r8.A0F     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            java.lang.String r9 = r3.A01     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            boolean r1 = r1.A00(r9, r2)     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            if (r1 == 0) goto L_0x0b1f
            X.5GP r2 = r8.A08     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            int r12 = r6.hashCode()     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            switch(r12) {
                case 711383033: goto L_0x013f;
                case 771140814: goto L_0x0142;
                case 1673427744: goto L_0x0144;
                default: goto L_0x0125;
            }     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
        L_0x0125:
            X.2yy r2 = r2.A00     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            java.lang.String r1 = "metadata/last_active_time"
            java.lang.String r11 = X.C60692yy.A00(r9, r1)     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            android.content.SharedPreferences r1 = r2.A01()     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            android.content.SharedPreferences$Editor r10 = r1.edit()     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            X.2sH r1 = r2.A01     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            long r1 = r1.A0H()     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            X.C18270x1.A0i(r10, r11, r1)     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            goto L_0x014b
        L_0x013f:
            java.lang.String r10 = "get_call_state"
            goto L_0x0144
        L_0x0142:
            java.lang.String r10 = "access_contacts"
        L_0x0144:
            boolean r1 = r6.equals(r10)     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            if (r1 != 0) goto L_0x014b
            goto L_0x0125
        L_0x014b:
            switch(r12) {
                case -1472535883: goto L_0x0150;
                case -1368724237: goto L_0x0160;
                case -624136624: goto L_0x0204;
                case 565287780: goto L_0x07d7;
                case 628187957: goto L_0x07f7;
                case 711383033: goto L_0x0879;
                case 771140814: goto L_0x08bb;
                case 1331833598: goto L_0x0900;
                case 1912051456: goto L_0x0910;
                case 2060915200: goto L_0x09ef;
                default: goto L_0x014e;
            }     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
        L_0x014e:
            goto L_0x0b06
        L_0x0150:
            java.lang.String r1 = "hang_up_call"
            boolean r1 = r6.equals(r1)     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            if (r1 == 0) goto L_0x0b06
            X.4uU r1 = r8.A0C     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            java.lang.String r3 = r1.A00(r3, r4)     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            goto L_0x0c05
        L_0x0160:
            java.lang.String r1 = "get_unread_messages"
            boolean r1 = r6.equals(r1)     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            if (r1 == 0) goto L_0x0b06
            X.4uV r6 = r8.A07     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            java.lang.String r1 = "payload"
            org.json.JSONObject r7 = r4.optJSONObject(r1)     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            if (r7 != 0) goto L_0x0176
            org.json.JSONObject r7 = X.AnonymousClass0x9.A1G()     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
        L_0x0176:
            java.lang.String r4 = "time_limit_ms"
            r1 = 86400000(0x5265c00, double:4.2687272E-316)
            long r4 = r7.optLong(r4, r1)     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            java.lang.String r1 = "contact_id"
            java.lang.String r2 = r7.optString(r1)     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            java.util.ArrayList r7 = X.AnonymousClass001.A0s()     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            boolean r1 = android.text.TextUtils.isEmpty(r2)     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            if (r1 != 0) goto L_0x01a7
            X.2fH r1 = r6.A05     // Catch:{ SecurityException -> 0x019d }
            X.3ZH r1 = r1.A00(r3, r2)     // Catch:{ SecurityException -> 0x019d }
            X.4uZ r1 = X.C86604Kt.A0a(r1)     // Catch:{ SecurityException -> 0x019d }
            r6.A00(r1, r7, r4)     // Catch:{ SecurityException -> 0x019d }
            goto L_0x01d7
        L_0x019d:
            java.lang.String r1 = "requesthandler/get-unread-messages invalid contact ID"
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            r2 = 1
            java.lang.String r1 = "Bad request - send_message"
            goto L_0x0815
        L_0x01a7:
            X.314 r1 = r6.A00     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            X.1R1 r9 = r6.A07     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            java.util.List r1 = r1.A0A(r9)     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            java.util.Iterator r8 = r1.iterator()     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
        L_0x01b3:
            boolean r1 = r8.hasNext()     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            if (r1 == 0) goto L_0x01d7
            X.4uZ r2 = X.C18300x5.A0P(r8)     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            X.2sA r1 = r6.A02     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            boolean r1 = r1.A09(r2)     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            if (r1 == 0) goto L_0x01b3
            boolean r1 = r9.A0h(r2)     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            if (r1 != 0) goto L_0x01b3
            X.2ss r1 = r6.A03     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            boolean r1 = r1.A0M(r2)     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            if (r1 != 0) goto L_0x01b3
            r6.A00(r2, r7, r4)     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            goto L_0x01b3
        L_0x01d7:
            r1 = 3
            X.AnonymousClass6A6.A00(r7, r1)     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            org.json.JSONArray r5 = X.AnonymousClass0x9.A1F()     // Catch:{ SecurityException -> 0x01ff }
            java.util.Iterator r4 = r7.iterator()     // Catch:{ SecurityException -> 0x01ff }
        L_0x01e3:
            boolean r1 = r4.hasNext()     // Catch:{ SecurityException -> 0x01ff }
            if (r1 == 0) goto L_0x01f9
            X.34x r2 = X.C18300x5.A0T(r4)     // Catch:{ SecurityException -> 0x01ff }
            X.1f7 r1 = r6.A06     // Catch:{ SecurityException -> 0x01ff }
            org.json.JSONObject r1 = r1.A02(r2, r3)     // Catch:{ SecurityException -> 0x01ff }
            if (r1 == 0) goto L_0x01e3
            r5.put(r1)     // Catch:{ SecurityException -> 0x01ff }
            goto L_0x01e3
        L_0x01f9:
            java.lang.String r3 = X.AnonymousClass5YV.A03(r5)     // Catch:{ SecurityException -> 0x01ff }
            goto L_0x0c05
        L_0x01ff:
            r2 = 5
            java.lang.String r1 = "Service internal error! get_unread_messages"
            goto L_0x0815
        L_0x0204:
            java.lang.String r1 = "send_message"
            boolean r1 = r6.equals(r1)     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            if (r1 == 0) goto L_0x0b06
            X.4uW r1 = r8.A0A     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            java.lang.String r12 = "plain_text"
            java.lang.String r2 = "payload"
            org.json.JSONObject r6 = r4.getJSONObject(r2)     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            java.lang.String r2 = "contact_id"
            java.lang.String r4 = r6.getString(r2)     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            X.2fH r2 = r1.A0C     // Catch:{ NullPointerException | SecurityException -> 0x07ca }
            X.3ZH r3 = r2.A00(r3, r4)     // Catch:{ NullPointerException | SecurityException -> 0x07ca }
            X.4uZ r4 = X.C86604Kt.A0a(r3)     // Catch:{ NullPointerException | SecurityException -> 0x07ca }
            X.32v r2 = r1.A0F     // Catch:{ NullPointerException | SecurityException -> 0x07ca }
            boolean r2 = r2.A01(r4)     // Catch:{ NullPointerException | SecurityException -> 0x07ca }
            r13 = 3
            if (r2 != 0) goto L_0x0235
            java.lang.String r3 = X.AnonymousClass5YV.A02(r13, r7)     // Catch:{ NullPointerException | SecurityException -> 0x07ca }
            goto L_0x0c05
        L_0x0235:
            boolean r2 = r3.A0U()     // Catch:{ NullPointerException | SecurityException -> 0x07ca }
            if (r2 == 0) goto L_0x025d
            X.4uZ r8 = r3.A0H     // Catch:{ NullPointerException | SecurityException -> 0x07ca }
            boolean r2 = r8 instanceof X.C27991fJ     // Catch:{ NullPointerException | SecurityException -> 0x07ca }
            if (r2 == 0) goto L_0x025d
            com.whatsapp.jid.GroupJid r8 = (com.whatsapp.jid.GroupJid) r8     // Catch:{ NullPointerException | SecurityException -> 0x07ca }
            X.2sj r2 = r1.A0A     // Catch:{ NullPointerException | SecurityException -> 0x07ca }
            boolean r2 = r2.A0C(r8)     // Catch:{ NullPointerException | SecurityException -> 0x07ca }
            if (r2 == 0) goto L_0x0253
            X.2rN r2 = r1.A0M     // Catch:{ NullPointerException | SecurityException -> 0x07ca }
            boolean r2 = r2.A04(r3, r8)     // Catch:{ NullPointerException | SecurityException -> 0x07ca }
            if (r2 == 0) goto L_0x025d
        L_0x0253:
            java.lang.String r2 = "You can't send a message to this group"
            r1 = 16
            java.lang.String r3 = X.AnonymousClass5YV.A02(r1, r2)     // Catch:{ NullPointerException | SecurityException -> 0x07ca }
            goto L_0x0c05
        L_0x025d:
            X.2sq r2 = r1.A04     // Catch:{ NullPointerException | SecurityException -> 0x07ca }
            boolean r2 = X.C86604Kt.A1a(r2, r3)     // Catch:{ NullPointerException | SecurityException -> 0x07ca }
            if (r2 == 0) goto L_0x026f
            java.lang.String r2 = "The requested contact is blocked."
            r1 = 11
            java.lang.String r3 = X.AnonymousClass5YV.A02(r1, r2)     // Catch:{ NullPointerException | SecurityException -> 0x07ca }
            goto L_0x0c05
        L_0x026f:
            X.5KG r8 = r1.A0D     // Catch:{ NullPointerException | SecurityException -> 0x07ca }
            X.2rt r3 = r8.A04     // Catch:{ NullPointerException | SecurityException -> 0x07ca }
            boolean r2 = r3.A07(r4)     // Catch:{ NullPointerException | SecurityException -> 0x07ca }
            if (r2 != 0) goto L_0x0288
            java.lang.String r1 = "system-messages-handler/new chat initiated"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ NullPointerException | SecurityException -> 0x07ca }
            java.lang.String r2 = "User tries to start a new thread which would produce a system message"
            r1 = 22
            java.lang.String r3 = X.AnonymousClass5YV.A02(r1, r2)     // Catch:{ NullPointerException | SecurityException -> 0x07ca }
            goto L_0x0c05
        L_0x0288:
            boolean r2 = r3.A07(r4)     // Catch:{ NullPointerException | SecurityException -> 0x07ca }
            if (r2 != 0) goto L_0x029d
            java.lang.String r1 = "system-messages-handler/new chat initiated"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ NullPointerException | SecurityException -> 0x07ca }
        L_0x0293:
            java.lang.String r2 = "There is a critical unread system message in the thread"
            r1 = 20
            java.lang.String r3 = X.AnonymousClass5YV.A02(r1, r2)     // Catch:{ NullPointerException | SecurityException -> 0x07ca }
            goto L_0x0c05
        L_0x029d:
            X.2sA r2 = r8.A01     // Catch:{ NullPointerException | SecurityException -> 0x07ca }
            boolean r2 = r2.A09(r4)     // Catch:{ NullPointerException | SecurityException -> 0x07ca }
            if (r2 == 0) goto L_0x032a
            X.2ss r2 = r8.A02     // Catch:{ NullPointerException | SecurityException -> 0x07ca }
            long r20 = r2.A08(r4)     // Catch:{ NullPointerException | SecurityException -> 0x07ca }
            X.3Lv r2 = r8.A03     // Catch:{ NullPointerException | SecurityException -> 0x07ca }
            r19 = 100
            r22 = -1
            r17 = r2
            r18 = r4
            r24 = r0
            X.2Ni r11 = r17.A0B(r18, r19, r20, r22, r24)     // Catch:{ NullPointerException | SecurityException -> 0x07ca }
            android.database.Cursor r10 = r11.A00     // Catch:{ all -> 0x031e }
            if (r10 == 0) goto L_0x032a
            boolean r2 = r10.moveToFirst()     // Catch:{ all -> 0x031e }
            if (r2 != 0) goto L_0x02c6
            goto L_0x0327
        L_0x02c6:
            X.2qz r2 = r8.A05     // Catch:{ all -> 0x031e }
            X.34x r9 = r2.A04(r10, r4)     // Catch:{ all -> 0x031e }
            if (r9 == 0) goto L_0x0302
            long r2 = r9.A1L     // Catch:{ all -> 0x031e }
            int r14 = (r2 > r20 ? 1 : (r2 == r20 ? 0 : -1))
            if (r14 == 0) goto L_0x0302
            long r2 = r9.A0K     // Catch:{ all -> 0x031e }
            X.2sH r14 = r8.A00     // Catch:{ all -> 0x031e }
            long r18 = r14.A0H()     // Catch:{ all -> 0x031e }
            r16 = 86400000(0x5265c00, double:4.2687272E-316)
            long r18 = r18 - r16
            int r14 = (r2 > r18 ? 1 : (r2 == r18 ? 0 : -1))
            if (r14 < 0) goto L_0x0302
            boolean r2 = r9 instanceof X.C30311mF     // Catch:{ all -> 0x031e }
            if (r2 != 0) goto L_0x0319
            boolean r2 = r9 instanceof X.C30341mI     // Catch:{ all -> 0x031e }
            if (r2 == 0) goto L_0x0302
            X.1mI r9 = (X.C30341mI) r9     // Catch:{ all -> 0x031e }
            int r2 = r9.A00     // Catch:{ all -> 0x031e }
            boolean r3 = X.AnonymousClass34J.A01(r2)     // Catch:{ all -> 0x031e }
            if (r3 != 0) goto L_0x0309
            r3 = 62
            if (r2 == r3) goto L_0x0309
            r3 = 63
            if (r2 == r3) goto L_0x0309
            switch(r2) {
                case 4: goto L_0x030c;
                case 12: goto L_0x030c;
                case 18: goto L_0x030c;
                case 20: goto L_0x030c;
                case 27: goto L_0x030c;
                case 52: goto L_0x030c;
                case 56: goto L_0x030c;
                case 57: goto L_0x030c;
                case 59: goto L_0x030c;
                case 67: goto L_0x030c;
                case 71: goto L_0x030c;
                case 79: goto L_0x030c;
                case 80: goto L_0x030c;
                case 90: goto L_0x030c;
                case 106: goto L_0x030c;
                case 123: goto L_0x030c;
                case 124: goto L_0x030c;
                case 126: goto L_0x030c;
                case 127: goto L_0x030c;
                case 130: goto L_0x030c;
                case 131: goto L_0x030c;
                case 144: goto L_0x030c;
                case 149: goto L_0x030c;
                default: goto L_0x0302;
            }     // Catch:{ all -> 0x031e }
        L_0x0302:
            boolean r2 = r10.moveToNext()     // Catch:{ all -> 0x031e }
            if (r2 != 0) goto L_0x02c6
            goto L_0x0327
        L_0x0309:
            java.lang.String r1 = "system-messages-handler/critical message"
            goto L_0x0316
        L_0x030c:
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x031e }
            java.lang.String r1 = "system-messages-handler/critical message "
            java.lang.String r1 = X.AnonymousClass000.A0Y(r1, r3, r2)     // Catch:{ all -> 0x031e }
        L_0x0316:
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ all -> 0x031e }
        L_0x0319:
            r10.close()     // Catch:{ NullPointerException | SecurityException -> 0x07ca }
            goto L_0x0293
        L_0x031e:
            r2 = move-exception
            android.database.Cursor r1 = r11.A00     // Catch:{ NullPointerException | SecurityException -> 0x07ca }
            if (r1 == 0) goto L_0x0326
            r1.close()     // Catch:{ NullPointerException | SecurityException -> 0x07ca }
        L_0x0326:
            throw r2     // Catch:{ NullPointerException | SecurityException -> 0x07ca }
        L_0x0327:
            r10.close()     // Catch:{ NullPointerException | SecurityException -> 0x07ca }
        L_0x032a:
            java.lang.String r2 = "media_type"
            java.lang.String r8 = r6.optString(r2, r12)     // Catch:{ NullPointerException | SecurityException -> 0x07ca }
            java.lang.String r2 = "media_uri"
            java.lang.String r10 = r6.optString(r2)     // Catch:{ NullPointerException | SecurityException -> 0x07ca }
            java.lang.String r2 = "message"
            java.lang.String r24 = r6.optString(r2)     // Catch:{ NullPointerException | SecurityException -> 0x07ca }
            java.lang.String r3 = "media_quality"
            r2 = -1
            int r3 = r6.optInt(r3, r2)     // Catch:{ NullPointerException | SecurityException -> 0x07ca }
            java.lang.String r2 = "visualization_data"
            org.json.JSONArray r9 = r6.optJSONArray(r2)     // Catch:{ NullPointerException | SecurityException -> 0x07ca }
            int r2 = r8.hashCode()     // Catch:{ NullPointerException | SecurityException -> 0x07ca }
            switch(r2) {
                case 106642994: goto L_0x0358;
                case 112202875: goto L_0x0372;
                case 354039290: goto L_0x045b;
                case 1021751938: goto L_0x0476;
                default: goto L_0x0350;
            }     // Catch:{ NullPointerException | SecurityException -> 0x07ca }
        L_0x0350:
            java.lang.String r1 = "Request is not implemented yet!"
            java.lang.String r3 = X.AnonymousClass5YV.A02(r5, r1)     // Catch:{ NullPointerException | SecurityException -> 0x07ca }
            goto L_0x0c05
        L_0x0358:
            java.lang.String r2 = "photo"
            boolean r2 = r8.equals(r2)     // Catch:{ NullPointerException | SecurityException -> 0x07ca }
            if (r2 == 0) goto L_0x0350
            java.lang.String r6 = "Service internal error! "
            java.lang.String r2 = "sendmedia/sendimages/share-failed/ "
            boolean r7 = android.text.TextUtils.isEmpty(r10)     // Catch:{ NullPointerException | SecurityException -> 0x07ca }
            if (r7 == 0) goto L_0x048a
            java.lang.String r1 = "Bad request -  photo uri is empty"
            java.lang.String r3 = X.AnonymousClass5YV.A02(r0, r1)     // Catch:{ NullPointerException | SecurityException -> 0x07ca }
            goto L_0x0c05
        L_0x0372:
            java.lang.String r2 = "video"
            boolean r2 = r8.equals(r2)     // Catch:{ NullPointerException | SecurityException -> 0x07ca }
            if (r2 == 0) goto L_0x0350
            boolean r2 = android.text.TextUtils.isEmpty(r10)     // Catch:{ NullPointerException | SecurityException -> 0x07ca }
            if (r2 == 0) goto L_0x0389
            r2 = 1
            java.lang.String r1 = "Bad request -  video uri is empty"
        L_0x0383:
            java.lang.String r3 = X.AnonymousClass5YV.A02(r2, r1)     // Catch:{ NullPointerException | SecurityException -> 0x07ca }
            goto L_0x0c05
        L_0x0389:
            X.5ZR r2 = r1.A09     // Catch:{ NullPointerException | SecurityException -> 0x07ca }
            X.57z r3 = r2.A04()     // Catch:{ NullPointerException | SecurityException -> 0x07ca }
            X.57z r2 = X.C997357z.GRANTED     // Catch:{ NullPointerException | SecurityException -> 0x07ca }
            if (r3 == r2) goto L_0x0398
            r2 = 24
            java.lang.String r1 = "Missing media permission to send media Messages"
            goto L_0x0383
        L_0x0398:
            r1.A00()     // Catch:{ IOException -> 0x043e, NullPointerException | SecurityException -> 0x07ca }
            X.5Ul r6 = r1.A01     // Catch:{ IOException -> 0x043e, NullPointerException | SecurityException -> 0x07ca }
            java.util.List r25 = java.util.Collections.singletonList(r4)     // Catch:{ IOException -> 0x043e, NullPointerException | SecurityException -> 0x07ca }
            android.net.Uri r3 = android.net.Uri.parse(r10)     // Catch:{ IOException -> 0x043e, NullPointerException | SecurityException -> 0x07ca }
            r5 = 0
            X.33i r2 = r1.A06     // Catch:{ IOException -> 0x03f2, all -> 0x03f0 }
            X.5UR r2 = r2.A0R()     // Catch:{ IOException -> 0x03f2, all -> 0x03f0 }
            java.io.InputStream r7 = r2.A06(r3)     // Catch:{ IOException -> 0x03f2, all -> 0x03f0 }
            java.lang.StringBuilder r8 = X.AnonymousClass001.A0o()     // Catch:{ IOException -> 0x03ed, all -> 0x03ea }
            java.lang.String r2 = "temp_"
            r8.append(r2)     // Catch:{ IOException -> 0x03ed, all -> 0x03ea }
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ IOException -> 0x03ed, all -> 0x03ea }
            java.lang.String r3 = X.AnonymousClass001.A0k(r8, r2)     // Catch:{ IOException -> 0x03ed, all -> 0x03ea }
            X.2oU r2 = r1.A08     // Catch:{ IOException -> 0x03ed, all -> 0x03ea }
            android.content.Context r2 = r2.A00     // Catch:{ IOException -> 0x03ed, all -> 0x03ea }
            java.io.File r2 = r2.getCacheDir()     // Catch:{ IOException -> 0x03ed, all -> 0x03ea }
            java.io.File r23 = java.io.File.createTempFile(r3, r5, r2)     // Catch:{ IOException -> 0x03ed, all -> 0x03ea }
            java.io.FileOutputStream r8 = X.AnonymousClass0x9.A0h(r23)     // Catch:{ IOException -> 0x03ed, all -> 0x03ea }
            r2 = 4096(0x1000, float:5.74E-42)
            byte[] r9 = new byte[r2]     // Catch:{ IOException -> 0x03e8 }
        L_0x03d5:
            int r3 = r7.read(r9)     // Catch:{ IOException -> 0x03e8 }
            r2 = -1
            if (r3 == r2) goto L_0x03e1
            r2 = 0
            r8.write(r9, r2, r3)     // Catch:{ IOException -> 0x03e8 }
            goto L_0x03d5
        L_0x03e1:
            r7.close()     // Catch:{ IOException -> 0x041c }
            r8.close()     // Catch:{ IOException -> 0x041c }
            goto L_0x0420
        L_0x03e8:
            r2 = move-exception
            goto L_0x03f5
        L_0x03ea:
            r2 = move-exception
            r8 = r5
            goto L_0x03fa
        L_0x03ed:
            r2 = move-exception
            r8 = r5
            goto L_0x03f5
        L_0x03f0:
            r2 = move-exception
            goto L_0x0409
        L_0x03f2:
            r2 = move-exception
            r7 = r5
            r8 = r5
        L_0x03f5:
            r2.printStackTrace()     // Catch:{ all -> 0x03f9 }
            goto L_0x040a
        L_0x03f9:
            r2 = move-exception
        L_0x03fa:
            if (r7 == 0) goto L_0x03ff
            r7.close()     // Catch:{ IOException -> 0x0405 }
        L_0x03ff:
            if (r8 == 0) goto L_0x0409
            r8.close()     // Catch:{ IOException -> 0x0405 }
            goto L_0x0409
        L_0x0405:
            r1 = move-exception
            r1.printStackTrace()     // Catch:{ IOException -> 0x043e, NullPointerException | SecurityException -> 0x07ca }
        L_0x0409:
            throw r2     // Catch:{ IOException -> 0x043e, NullPointerException | SecurityException -> 0x07ca }
        L_0x040a:
            if (r7 == 0) goto L_0x040f
            r7.close()     // Catch:{ IOException -> 0x0415 }
        L_0x040f:
            if (r8 == 0) goto L_0x0419
            r8.close()     // Catch:{ IOException -> 0x0415 }
            goto L_0x0419
        L_0x0415:
            r2 = move-exception
            r2.printStackTrace()     // Catch:{ IOException -> 0x043e, NullPointerException | SecurityException -> 0x07ca }
        L_0x0419:
            r23 = r5
            goto L_0x0420
        L_0x041c:
            r2 = move-exception
            r2.printStackTrace()     // Catch:{ IOException -> 0x043e, NullPointerException | SecurityException -> 0x07ca }
        L_0x0420:
            r26 = 0
            r21 = r5
            r22 = r5
            r28 = r26
            r19 = r5
            r18 = r6
            r20 = r5
            r27 = r26
            r18.A09(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)     // Catch:{ IOException -> 0x043e, NullPointerException | SecurityException -> 0x07ca }
            X.2oD r1 = r1.A05     // Catch:{ IOException -> 0x043e, NullPointerException | SecurityException -> 0x07ca }
            r1.A00(r4, r0, r0, r0)     // Catch:{ IOException -> 0x043e, NullPointerException | SecurityException -> 0x07ca }
            java.lang.String r3 = X.AnonymousClass5YV.A03(r5)     // Catch:{ IOException -> 0x043e, NullPointerException | SecurityException -> 0x07ca }
            goto L_0x0c05
        L_0x043e:
            r2 = move-exception
            java.lang.String r1 = "sendmedia/sendvideos/share-failed/ "
            com.whatsapp.util.Log.e(r1, r2)     // Catch:{ NullPointerException | SecurityException -> 0x07ca }
            java.lang.String r1 = r2.getMessage()     // Catch:{ NullPointerException | SecurityException -> 0x07ca }
            if (r1 == 0) goto L_0x0456
            boolean r1 = X.C86624Kv.A1Z(r2)     // Catch:{ NullPointerException | SecurityException -> 0x07ca }
            if (r1 == 0) goto L_0x0456
            r2 = 19
            java.lang.String r1 = "Device doesn't have enough free space"
            goto L_0x0383
        L_0x0456:
            r2 = 5
            java.lang.String r1 = "Service internal error! "
            goto L_0x0383
        L_0x045b:
            java.lang.String r2 = "voice_message"
            boolean r2 = r8.equals(r2)     // Catch:{ NullPointerException | SecurityException -> 0x07ca }
            if (r2 == 0) goto L_0x0350
            boolean r2 = android.text.TextUtils.isEmpty(r10)     // Catch:{ NullPointerException | SecurityException -> 0x07ca }
            if (r2 == 0) goto L_0x0532
            java.lang.String r1 = "sendVoiceMessage/ empty URI"
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ NullPointerException | SecurityException -> 0x07ca }
            java.lang.String r1 = "Bad request -  voice message uri is empty"
            java.lang.String r3 = X.AnonymousClass5YV.A02(r0, r1)     // Catch:{ NullPointerException | SecurityException -> 0x07ca }
            goto L_0x0c05
        L_0x0476:
            boolean r2 = r8.equals(r12)     // Catch:{ NullPointerException | SecurityException -> 0x07ca }
            if (r2 == 0) goto L_0x0350
            boolean r2 = android.text.TextUtils.isEmpty(r24)     // Catch:{ NullPointerException | SecurityException -> 0x07ca }
            if (r2 == 0) goto L_0x07ab
            java.lang.String r1 = "Bad request -  message is empty"
            java.lang.String r3 = X.AnonymousClass5YV.A02(r0, r1)     // Catch:{ NullPointerException | SecurityException -> 0x07ca }
            goto L_0x0c05
        L_0x048a:
            X.5ZR r7 = r1.A09     // Catch:{ NullPointerException | SecurityException -> 0x07ca }
            X.57z r8 = r7.A04()     // Catch:{ NullPointerException | SecurityException -> 0x07ca }
            X.57z r7 = X.C997357z.GRANTED     // Catch:{ NullPointerException | SecurityException -> 0x07ca }
            if (r8 == r7) goto L_0x049e
            r2 = 24
            java.lang.String r1 = "Missing media permission to send media Messages"
        L_0x0498:
            java.lang.String r3 = X.AnonymousClass5YV.A02(r2, r1)     // Catch:{ NullPointerException | SecurityException -> 0x07ca }
            goto L_0x0c05
        L_0x049e:
            android.net.Uri r17 = android.net.Uri.parse(r10)     // Catch:{ NullPointerException | SecurityException -> 0x07ca }
            r1.A00()     // Catch:{ IOException -> 0x04f8, 59c -> 0x0519, OutOfMemoryError -> 0x050e, SecurityException -> 0x0520, NullPointerException | SecurityException -> 0x07ca }
            X.5Ul r7 = r1.A01     // Catch:{ IOException -> 0x04f8, 59c -> 0x0519, OutOfMemoryError -> 0x050e, SecurityException -> 0x0520, NullPointerException | SecurityException -> 0x07ca }
            java.util.List r25 = java.util.Collections.singletonList(r4)     // Catch:{ IOException -> 0x04f8, 59c -> 0x0519, OutOfMemoryError -> 0x050e, SecurityException -> 0x0520, NullPointerException | SecurityException -> 0x07ca }
            r18 = 0
            r28 = 0
            r8 = -1
            if (r3 == r8) goto L_0x04c7
            r8 = 0
            if (r3 == 0) goto L_0x04ca
            r8 = 1
            if (r3 == r0) goto L_0x04ca
            r8 = 2
            if (r3 == r5) goto L_0x04ca
            r8 = 3
            if (r3 == r13) goto L_0x04ca
            java.lang.StringBuilder r8 = X.AnonymousClass001.A0o()     // Catch:{ IOException -> 0x04f8, 59c -> 0x0519, OutOfMemoryError -> 0x050e, SecurityException -> 0x0520, NullPointerException | SecurityException -> 0x07ca }
            java.lang.String r5 = "sendmedia/translateMediaQuality/ Unknown media quality: "
            X.C18260x0.A0z(r5, r8, r3)     // Catch:{ IOException -> 0x04f8, 59c -> 0x0519, OutOfMemoryError -> 0x050e, SecurityException -> 0x0520, NullPointerException | SecurityException -> 0x07ca }
        L_0x04c7:
            r23 = r18
            goto L_0x04ce
        L_0x04ca:
            java.lang.Integer r23 = java.lang.Integer.valueOf(r8)     // Catch:{ IOException -> 0x04f8, 59c -> 0x0519, OutOfMemoryError -> 0x050e, SecurityException -> 0x0520, NullPointerException | SecurityException -> 0x07ca }
        L_0x04ce:
            r20 = r18
            r21 = r18
            r22 = r18
            r26 = r18
            r27 = r18
            r30 = r28
            r31 = r28
            r32 = r28
            r33 = r28
            r34 = r28
            r35 = r28
            r19 = r18
            r29 = r28
            r16 = r7
            r16.A00(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)     // Catch:{ IOException -> 0x04f8, 59c -> 0x0519, OutOfMemoryError -> 0x050e, SecurityException -> 0x0520, NullPointerException | SecurityException -> 0x07ca }
            X.2oD r1 = r1.A05     // Catch:{ IOException -> 0x04f8, 59c -> 0x0519, OutOfMemoryError -> 0x050e, SecurityException -> 0x0520, NullPointerException | SecurityException -> 0x07ca }
            r1.A00(r4, r0, r0, r0)     // Catch:{ IOException -> 0x04f8, 59c -> 0x0519, OutOfMemoryError -> 0x050e, SecurityException -> 0x0520, NullPointerException | SecurityException -> 0x07ca }
            java.lang.String r3 = X.AnonymousClass5YV.A03(r18)     // Catch:{ IOException -> 0x04f8, 59c -> 0x0519, OutOfMemoryError -> 0x050e, SecurityException -> 0x0520, NullPointerException | SecurityException -> 0x07ca }
            goto L_0x0c05
        L_0x04f8:
            r4 = move-exception
            r3 = 5
            com.whatsapp.util.Log.e(r2, r4)     // Catch:{ NullPointerException | SecurityException -> 0x07ca }
            java.lang.String r1 = r4.getMessage()     // Catch:{ NullPointerException | SecurityException -> 0x07ca }
            if (r1 == 0) goto L_0x052c
            boolean r1 = X.C86624Kv.A1Z(r4)     // Catch:{ NullPointerException | SecurityException -> 0x07ca }
            if (r1 == 0) goto L_0x052c
            r2 = 19
            java.lang.String r1 = "Device doesn't have enough free space"
            goto L_0x0498
        L_0x050e:
            r1 = move-exception
            com.whatsapp.util.Log.e(r2, r1)     // Catch:{ NullPointerException | SecurityException -> 0x07ca }
            r1 = 5
            java.lang.String r3 = X.AnonymousClass5YV.A02(r1, r6)     // Catch:{ NullPointerException | SecurityException -> 0x07ca }
            goto L_0x0c05
        L_0x0519:
            r1 = move-exception
            com.whatsapp.util.Log.e(r2, r1)     // Catch:{ NullPointerException | SecurityException -> 0x07ca }
            java.lang.String r1 = "Bad request -  file not an image"
            goto L_0x0526
        L_0x0520:
            r1 = move-exception
            com.whatsapp.util.Log.e(r2, r1)     // Catch:{ NullPointerException | SecurityException -> 0x07ca }
            java.lang.String r1 = "Bad request -  URI inaccessible"
        L_0x0526:
            java.lang.String r3 = X.AnonymousClass5YV.A02(r0, r1)     // Catch:{ NullPointerException | SecurityException -> 0x07ca }
            goto L_0x0c05
        L_0x052c:
            java.lang.String r3 = X.AnonymousClass5YV.A02(r3, r6)     // Catch:{ NullPointerException | SecurityException -> 0x07ca }
            goto L_0x0c05
        L_0x0532:
            X.2OK r2 = r1.A0B     // Catch:{ NullPointerException | SecurityException -> 0x07ca }
            X.1VX r3 = r2.A01     // Catch:{ NullPointerException | SecurityException -> 0x07ca }
            r2 = 5649(0x1611, float:7.916E-42)
            boolean r2 = r3.A0X(r2)     // Catch:{ NullPointerException | SecurityException -> 0x07ca }
            if (r2 != 0) goto L_0x0546
            java.lang.String r1 = "sendVoiceMessage/ feature disabled"
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ NullPointerException | SecurityException -> 0x07ca }
            r1 = 3
            goto L_0x07a1
        L_0x0546:
            r1.A00()     // Catch:{ IOException -> 0x078b, NullPointerException | SecurityException -> 0x07ca }
            android.net.Uri r3 = android.net.Uri.parse(r10)     // Catch:{ IOException -> 0x078b, NullPointerException | SecurityException -> 0x07ca }
            X.33C r6 = new X.33C     // Catch:{ IOException -> 0x078b, NullPointerException | SecurityException -> 0x07ca }
            r6.<init>()     // Catch:{ IOException -> 0x078b, NullPointerException | SecurityException -> 0x07ca }
            X.53r r2 = r1.A0N     // Catch:{ IOException -> 0x078b, NullPointerException | SecurityException -> 0x07ca }
            java.io.File r8 = r2.A0E(r3)     // Catch:{ IOException -> 0x078b, NullPointerException | SecurityException -> 0x07ca }
            X.5Hb r10 = r1.A0G     // Catch:{ IOException -> 0x078b, NullPointerException | SecurityException -> 0x07ca }
            boolean r2 = r8.canRead()     // Catch:{ IOException -> 0x078b, NullPointerException | SecurityException -> 0x07ca }
            if (r2 != 0) goto L_0x0582
            X.5N5 r3 = r10.A00     // Catch:{ IOException -> 0x078b, NullPointerException | SecurityException -> 0x07ca }
            java.lang.String r1 = "emitFileNotExistsError"
            com.whatsapp.util.Log.w((java.lang.String) r1)     // Catch:{ IOException -> 0x078b, NullPointerException | SecurityException -> 0x07ca }
            java.lang.String r2 = "PTT_VALIDATION_FILE_NOT_EXIST"
            r1 = 0
            r3.A00(r2, r1)     // Catch:{ IOException -> 0x078b, NullPointerException | SecurityException -> 0x07ca }
        L_0x056d:
            java.lang.String r1 = "isValidVoiceMessageFile file validation failed"
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ IOException -> 0x078b, NullPointerException | SecurityException -> 0x07ca }
        L_0x0572:
            java.lang.String r1 = "sendVoiceMessage/ file validation failed"
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ IOException -> 0x078b, NullPointerException | SecurityException -> 0x07ca }
            r8.delete()     // Catch:{ IOException -> 0x078b, NullPointerException | SecurityException -> 0x07ca }
            java.lang.String r1 = "Bad request -  voice message file validation failed"
            java.lang.String r3 = X.AnonymousClass5YV.A02(r0, r1)     // Catch:{ IOException -> 0x078b, NullPointerException | SecurityException -> 0x07ca }
            goto L_0x0c05
        L_0x0582:
            long r2 = r8.length()     // Catch:{ IOException -> 0x078b, NullPointerException | SecurityException -> 0x07ca }
            r11 = 0
            int r7 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r7 <= 0) goto L_0x068e
            r11 = 2000000(0x1e8480, double:9.881313E-318)
            int r7 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r7 > 0) goto L_0x068e
            java.lang.String r2 = r8.getAbsolutePath()     // Catch:{ IOException -> 0x078b, NullPointerException | SecurityException -> 0x07ca }
            com.whatsapp.media.OggAnalyzer$OggFileReport r7 = com.whatsapp.media.OggAnalyzer.examineOggStream(r2)     // Catch:{ OggAnalyzerException -> 0x0670 }
            boolean r2 = r7.isAudioStreamOpus     // Catch:{ OggAnalyzerException -> 0x0670 }
            if (r2 != 0) goto L_0x05ad
            X.5N5 r4 = r10.A00     // Catch:{ OggAnalyzerException -> 0x0670 }
            java.lang.String r1 = "emitNotOpusError"
            com.whatsapp.util.Log.w((java.lang.String) r1)     // Catch:{ OggAnalyzerException -> 0x0670 }
            java.lang.String r5 = "PTT_VALIDATION_NOT_OPUS"
            r1 = 0
        L_0x05a9:
            r4.A00(r5, r1)     // Catch:{ OggAnalyzerException -> 0x0670 }
            goto L_0x0572
        L_0x05ad:
            float r2 = r7.fileDurationSeconds     // Catch:{ OggAnalyzerException -> 0x0670 }
            r3 = 1065353216(0x3f800000, float:1.0)
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 >= 0) goto L_0x05c9
            X.5N5 r4 = r10.A00     // Catch:{ OggAnalyzerException -> 0x0670 }
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ OggAnalyzerException -> 0x0670 }
            java.lang.String r1 = "emitDurationTooShortError durationSeconds="
            r3.append(r1)     // Catch:{ OggAnalyzerException -> 0x0670 }
            r3.append(r2)     // Catch:{ OggAnalyzerException -> 0x0670 }
            X.AnonymousClass0x2.A19(r3)     // Catch:{ OggAnalyzerException -> 0x0670 }
            java.lang.String r5 = "PTT_VALIDATION_DURATION_MIN"
            goto L_0x05e2
        L_0x05c9:
            r3 = 1133903872(0x43960000, float:300.0)
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 <= 0) goto L_0x060a
            X.5N5 r4 = r10.A00     // Catch:{ OggAnalyzerException -> 0x0670 }
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ OggAnalyzerException -> 0x0670 }
            java.lang.String r1 = "emitDurationTooLongError durationSeconds="
            r3.append(r1)     // Catch:{ OggAnalyzerException -> 0x0670 }
            r3.append(r2)     // Catch:{ OggAnalyzerException -> 0x0670 }
            X.AnonymousClass0x2.A19(r3)     // Catch:{ OggAnalyzerException -> 0x0670 }
            java.lang.String r5 = "PTT_VALIDATION_DURATION_MAX"
        L_0x05e2:
            r1 = 1202241536(0x47a8c000, float:86400.0)
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x05ec
            java.lang.String r1 = "P1D-P1Y"
            goto L_0x05a9
        L_0x05ec:
            r1 = 1135869952(0x43b40000, float:360.0)
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x05f5
            java.lang.String r1 = "PT6M-P1D"
            goto L_0x05a9
        L_0x05f5:
            r1 = 1133903872(0x43960000, float:300.0)
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x05fe
            java.lang.String r1 = "PT5M-PT6M"
            goto L_0x05a9
        L_0x05fe:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x0607
            java.lang.String r1 = "PT1S-PT5M"
            goto L_0x05a9
        L_0x0607:
            java.lang.String r1 = "PT0S-PT1S"
            goto L_0x05a9
        L_0x060a:
            int r3 = r7.numberOfStreams     // Catch:{ OggAnalyzerException -> 0x0670 }
            if (r3 == r0) goto L_0x0620
            X.5N5 r4 = r10.A00     // Catch:{ OggAnalyzerException -> 0x0670 }
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ OggAnalyzerException -> 0x0670 }
            java.lang.String r1 = "emitMultipleStreamsError streamsCount="
            X.C18260x0.A0z(r1, r2, r3)     // Catch:{ OggAnalyzerException -> 0x0670 }
            java.lang.String r5 = "PTT_VALIDATION_MULTIPLE_STREAMS"
        L_0x061b:
            java.lang.String r1 = java.lang.Integer.toString(r3)     // Catch:{ OggAnalyzerException -> 0x0670 }
            goto L_0x05a9
        L_0x0620:
            int r3 = r7.samplingRate     // Catch:{ OggAnalyzerException -> 0x0670 }
            r2 = 16000(0x3e80, float:2.2421E-41)
            if (r3 == r2) goto L_0x0634
            X.5N5 r4 = r10.A00     // Catch:{ OggAnalyzerException -> 0x0670 }
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ OggAnalyzerException -> 0x0670 }
            java.lang.String r1 = "emitSamplingRateError samplingRateHz="
            X.C18260x0.A0z(r1, r2, r3)     // Catch:{ OggAnalyzerException -> 0x0670 }
            java.lang.String r5 = "PTT_VALIDATION_SAMPLING_RATE"
            goto L_0x061b
        L_0x0634:
            int r3 = r7.channels     // Catch:{ OggAnalyzerException -> 0x0670 }
            if (r3 == r0) goto L_0x0646
            X.5N5 r4 = r10.A00     // Catch:{ OggAnalyzerException -> 0x0670 }
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ OggAnalyzerException -> 0x0670 }
            java.lang.String r1 = "emitChannelsCountError channelsCount="
            X.C18260x0.A0z(r1, r2, r3)     // Catch:{ OggAnalyzerException -> 0x0670 }
            java.lang.String r5 = "PTT_VALIDATION_CHANNELS"
            goto L_0x061b
        L_0x0646:
            X.5N5 r7 = r10.A00     // Catch:{ OggAnalyzerException -> 0x0670 }
            X.2OK r2 = r7.A00     // Catch:{ OggAnalyzerException -> 0x0670 }
            X.1VX r3 = r2.A01     // Catch:{ OggAnalyzerException -> 0x0670 }
            r2 = 6076(0x17bc, float:8.514E-42)
            boolean r2 = r3.A0X(r2)     // Catch:{ OggAnalyzerException -> 0x0670 }
            if (r2 != 0) goto L_0x065a
            java.lang.String r2 = "emitSuccess suppressed"
            com.whatsapp.util.Log.w((java.lang.String) r2)     // Catch:{ OggAnalyzerException -> 0x0670 }
            goto L_0x06b1
        L_0x065a:
            java.lang.String r2 = "emitSuccess"
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ OggAnalyzerException -> 0x0670 }
            X.8vZ r7 = r7.A01     // Catch:{ OggAnalyzerException -> 0x0670 }
            r3 = 494345136(0x1d771bb0, float:3.2704492E-21)
            r7.markerStart(r3)     // Catch:{ OggAnalyzerException -> 0x0670 }
            java.lang.String r2 = "is_success"
            r7.markerAnnotate((int) r3, (java.lang.String) r2, (boolean) r0)     // Catch:{ OggAnalyzerException -> 0x0670 }
            r7.markerEnd(r3, r5)     // Catch:{ OggAnalyzerException -> 0x0670 }
            goto L_0x06b1
        L_0x0670:
            r2 = move-exception
            java.lang.String r1 = "isValidVoiceMessageFile failed to parse file"
            com.whatsapp.util.Log.e(r1, r2)     // Catch:{ IOException -> 0x078b, NullPointerException | SecurityException -> 0x07ca }
            X.5N5 r4 = r10.A00     // Catch:{ IOException -> 0x078b, NullPointerException | SecurityException -> 0x07ca }
            int r3 = r2.errorCode     // Catch:{ IOException -> 0x078b, NullPointerException | SecurityException -> 0x07ca }
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ IOException -> 0x078b, NullPointerException | SecurityException -> 0x07ca }
            java.lang.String r1 = "emitOpusParsingError errorCode="
            X.C18260x0.A0z(r1, r2, r3)     // Catch:{ IOException -> 0x078b, NullPointerException | SecurityException -> 0x07ca }
            java.lang.String r2 = "PTT_VALIDATION_PARSING"
            java.lang.String r1 = java.lang.Integer.toString(r3)     // Catch:{ IOException -> 0x078b, NullPointerException | SecurityException -> 0x07ca }
            r4.A00(r2, r1)     // Catch:{ IOException -> 0x078b, NullPointerException | SecurityException -> 0x07ca }
            goto L_0x0572
        L_0x068e:
            X.5N5 r9 = r10.A00     // Catch:{ IOException -> 0x078b, NullPointerException | SecurityException -> 0x07ca }
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()     // Catch:{ IOException -> 0x078b, NullPointerException | SecurityException -> 0x07ca }
            java.lang.String r1 = "emitFileSizeError fileSizeBytes="
            X.C18270x1.A1B(r1, r4, r2)     // Catch:{ IOException -> 0x078b, NullPointerException | SecurityException -> 0x07ca }
            java.lang.String r7 = "PTT_VALIDATION_FILE_SIZE"
            double r5 = (double) r2     // Catch:{ IOException -> 0x078b, NullPointerException | SecurityException -> 0x07ca }
            r3 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r5 = r5 / r3
            double r1 = java.lang.Math.ceil(r5)     // Catch:{ IOException -> 0x078b, NullPointerException | SecurityException -> 0x07ca }
            double r1 = r1 * r3
            long r1 = java.lang.Math.round(r1)     // Catch:{ IOException -> 0x078b, NullPointerException | SecurityException -> 0x07ca }
            java.lang.String r1 = java.lang.Long.toString(r1)     // Catch:{ IOException -> 0x078b, NullPointerException | SecurityException -> 0x07ca }
            r9.A00(r7, r1)     // Catch:{ IOException -> 0x078b, NullPointerException | SecurityException -> 0x07ca }
            goto L_0x056d
        L_0x06b1:
            r7 = 0
            if (r9 != 0) goto L_0x06b7
            java.lang.String r2 = "parseVoiceMessageVisualizationData jsonVisualizationData is null"
            goto L_0x0704
        L_0x06b7:
            int r5 = r9.length()     // Catch:{ IOException -> 0x078b, NullPointerException | SecurityException -> 0x07ca }
            if (r5 < r0) goto L_0x06fa
            r2 = 10000(0x2710, float:1.4013E-41)
            if (r5 > r2) goto L_0x06fa
            java.util.ArrayList r10 = X.AnonymousClass002.A0I(r5)     // Catch:{ IOException -> 0x078b, NullPointerException | SecurityException -> 0x07ca }
            r11 = 0
        L_0x06c6:
            int r12 = r9.getInt(r11)     // Catch:{ JSONException -> 0x06eb }
            if (r12 < 0) goto L_0x06e1
            r2 = 100
            if (r12 > r2) goto L_0x06e1
            X.C18270x1.A1K(r10, r12)     // Catch:{ JSONException -> 0x06eb }
            int r11 = r11 + 1
            if (r11 < r5) goto L_0x06c6
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ IOException -> 0x078b, NullPointerException | SecurityException -> 0x07ca }
            java.lang.String r2 = "parseVoiceMessageVisualizationData success size="
            X.C18260x0.A0w(r2, r3, r5)     // Catch:{ IOException -> 0x078b, NullPointerException | SecurityException -> 0x07ca }
            goto L_0x0708
        L_0x06e1:
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ JSONException -> 0x06eb }
            java.lang.String r2 = "isValidValue value is outside expected range: "
            X.C18260x0.A0z(r2, r3, r12)     // Catch:{ JSONException -> 0x06eb }
            goto L_0x0707
        L_0x06eb:
            r5 = move-exception
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ IOException -> 0x078b, NullPointerException | SecurityException -> 0x07ca }
            java.lang.String r2 = "parseVoiceMessageVisualizationData invalid integer at position "
            java.lang.String r2 = X.AnonymousClass000.A0Y(r2, r3, r11)     // Catch:{ IOException -> 0x078b, NullPointerException | SecurityException -> 0x07ca }
            com.whatsapp.util.Log.w(r2, r5)     // Catch:{ IOException -> 0x078b, NullPointerException | SecurityException -> 0x07ca }
            goto L_0x0707
        L_0x06fa:
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ IOException -> 0x078b, NullPointerException | SecurityException -> 0x07ca }
            java.lang.String r2 = "parseVoiceMessageVisualizationData jsonDataLen="
            java.lang.String r2 = X.AnonymousClass000.A0Y(r2, r3, r5)     // Catch:{ IOException -> 0x078b, NullPointerException | SecurityException -> 0x07ca }
        L_0x0704:
            com.whatsapp.util.Log.w((java.lang.String) r2)     // Catch:{ IOException -> 0x078b, NullPointerException | SecurityException -> 0x07ca }
        L_0x0707:
            r10 = r7
        L_0x0708:
            r5 = 0
            if (r10 == 0) goto L_0x075b
            X.5GT r7 = r1.A0I     // Catch:{ IOException -> 0x078b, NullPointerException | SecurityException -> 0x07ca }
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ IOException -> 0x078b, NullPointerException | SecurityException -> 0x07ca }
            java.lang.String r2 = "generateVoiceMessageVisualizationFile/ validatedVisualizationData.size="
            X.C18260x0.A1A(r2, r3, r10)     // Catch:{ IOException -> 0x078b, NullPointerException | SecurityException -> 0x07ca }
            X.2eK r2 = r7.A00     // Catch:{ IOException -> 0x0744 }
            X.2gw r3 = r2.A00     // Catch:{ IOException -> 0x0744 }
            java.lang.String r2 = ""
            java.io.File r7 = r3.A00(r2)     // Catch:{ IOException -> 0x0744 }
            java.io.FileOutputStream r9 = X.AnonymousClass0x9.A0h(r7)     // Catch:{ IOException -> 0x0744 }
            java.util.Iterator r3 = r10.iterator()     // Catch:{ IOException -> 0x0740 }
        L_0x0728:
            boolean r2 = r3.hasNext()     // Catch:{ IOException -> 0x0740 }
            if (r2 == 0) goto L_0x073c
            java.lang.Object r2 = r3.next()     // Catch:{ IOException -> 0x0740 }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ IOException -> 0x0740 }
            int r2 = r2.intValue()     // Catch:{ IOException -> 0x0740 }
            r9.write(r2)     // Catch:{ IOException -> 0x0740 }
            goto L_0x0728
        L_0x073c:
            r9.close()     // Catch:{ IOException -> 0x0740 }
            goto L_0x074b
        L_0x0740:
            r3 = move-exception
            java.lang.String r2 = "Unexpected error writing or flushing visualization data to disk"
            goto L_0x0747
        L_0x0744:
            r3 = move-exception
            java.lang.String r2 = "generateVoiceMessageVisualizationFile/ Failed to create or open temporary file for visualization data"
        L_0x0747:
            com.whatsapp.util.Log.e(r2, r3)     // Catch:{ IOException -> 0x078b, NullPointerException | SecurityException -> 0x07ca }
            r7 = r5
        L_0x074b:
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ IOException -> 0x078b, NullPointerException | SecurityException -> 0x07ca }
            java.lang.String r2 = "sendVoiceMessage/ attached visualizationDataTempFile: "
            r3.append(r2)     // Catch:{ IOException -> 0x078b, NullPointerException | SecurityException -> 0x07ca }
            java.lang.String r2 = r7.getAbsolutePath()     // Catch:{ IOException -> 0x078b, NullPointerException | SecurityException -> 0x07ca }
            X.C18260x0.A1J(r3, r2)     // Catch:{ IOException -> 0x078b, NullPointerException | SecurityException -> 0x07ca }
        L_0x075b:
            r6.A0F = r8     // Catch:{ IOException -> 0x078b, NullPointerException | SecurityException -> 0x07ca }
            X.2a2 r3 = r1.A0J     // Catch:{ IOException -> 0x078b, NullPointerException | SecurityException -> 0x07ca }
            X.2sH r2 = r1.A07     // Catch:{ IOException -> 0x078b, NullPointerException | SecurityException -> 0x07ca }
            long r21 = r2.A0H()     // Catch:{ IOException -> 0x078b, NullPointerException | SecurityException -> 0x07ca }
            java.lang.String r20 = r8.getName()     // Catch:{ IOException -> 0x078b, NullPointerException | SecurityException -> 0x07ca }
            long r23 = r8.length()     // Catch:{ IOException -> 0x078b, NullPointerException | SecurityException -> 0x07ca }
            r25 = 0
            r16 = r3
            r17 = r6
            r18 = r4
            r19 = r5
            X.1mu r3 = r16.A00(r17, r18, r19, r20, r21, r23, r25)     // Catch:{ IOException -> 0x078b, NullPointerException | SecurityException -> 0x07ca }
            X.2qd r2 = r1.A0K     // Catch:{ IOException -> 0x078b, NullPointerException | SecurityException -> 0x07ca }
            r2.A00(r5, r3, r7)     // Catch:{ IOException -> 0x078b, NullPointerException | SecurityException -> 0x07ca }
            X.2oD r1 = r1.A05     // Catch:{ IOException -> 0x078b, NullPointerException | SecurityException -> 0x07ca }
            r1.A00(r4, r0, r0, r0)     // Catch:{ IOException -> 0x078b, NullPointerException | SecurityException -> 0x07ca }
            java.lang.String r3 = X.AnonymousClass5YV.A03(r5)     // Catch:{ NullPointerException | SecurityException -> 0x07ca }
            goto L_0x0c05
        L_0x078b:
            r2 = move-exception
            java.lang.String r1 = "sendmedia/sendvoicemessage/share-failed/ "
            com.whatsapp.util.Log.e(r1, r2)     // Catch:{ NullPointerException | SecurityException -> 0x07ca }
            java.lang.String r1 = r2.getMessage()     // Catch:{ NullPointerException | SecurityException -> 0x07ca }
            if (r1 == 0) goto L_0x07a7
            boolean r1 = X.C86624Kv.A1Z(r2)     // Catch:{ NullPointerException | SecurityException -> 0x07ca }
            if (r1 == 0) goto L_0x07a7
            r1 = 19
            java.lang.String r7 = "Device doesn't have enough free space"
        L_0x07a1:
            java.lang.String r3 = X.AnonymousClass5YV.A02(r1, r7)     // Catch:{ NullPointerException | SecurityException -> 0x07ca }
            goto L_0x0c05
        L_0x07a7:
            r1 = 5
            java.lang.String r7 = "Service internal error! "
            goto L_0x07a1
        L_0x07ab:
            r1.A00()     // Catch:{ NullPointerException | SecurityException -> 0x07ca }
            X.33m r5 = r1.A02     // Catch:{ NullPointerException | SecurityException -> 0x07ca }
            java.util.List r10 = java.util.Collections.singletonList(r4)     // Catch:{ NullPointerException | SecurityException -> 0x07ca }
            r6 = 0
            r12 = 0
            r8 = r6
            r11 = r6
            r7 = r6
            r13 = r12
            r9 = r24
            r5.A0C(r6, r7, r8, r9, r10, r11, r12, r13)     // Catch:{ NullPointerException | SecurityException -> 0x07ca }
            X.2oD r1 = r1.A05     // Catch:{ NullPointerException | SecurityException -> 0x07ca }
            r1.A00(r4, r0, r0, r0)     // Catch:{ NullPointerException | SecurityException -> 0x07ca }
            java.lang.String r3 = X.AnonymousClass5YV.A03(r6)     // Catch:{ NullPointerException | SecurityException -> 0x07ca }
            goto L_0x0c05
        L_0x07ca:
            java.lang.String r1 = "requesthandler/send-message invalid contact ID"
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            java.lang.String r1 = "Bad request - send_message"
            java.lang.String r3 = X.AnonymousClass5YV.A02(r0, r1)     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            goto L_0x0c05
        L_0x07d7:
            java.lang.String r1 = "announce_user_opt_out"
            boolean r1 = r6.equals(r1)     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            if (r1 == 0) goto L_0x0b06
            X.4uQ r1 = r8.A05     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            X.2ax r1 = r1.A00     // Catch:{ Exception -> 0x07ed }
            r1.A00(r9)     // Catch:{ Exception -> 0x07ed }
            r1 = 0
            java.lang.String r3 = X.AnonymousClass5YV.A03(r1)     // Catch:{ Exception -> 0x07ed }
            goto L_0x0c05
        L_0x07ed:
            r2 = move-exception
            java.lang.String r1 = "AnnounceUserOptOutRequest/handleRequest Error revoking access: "
            com.whatsapp.util.Log.e(r1, r2)     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            java.lang.String r1 = "Bad request - announce_user_opt_out"
            goto L_0x09e9
        L_0x07f7:
            java.lang.String r1 = "accept_call"
            boolean r1 = r6.equals(r1)     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            if (r1 == 0) goto L_0x0b06
            X.4uS r6 = r8.A03     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            java.lang.String r1 = "payload"
            org.json.JSONObject r2 = r4.getJSONObject(r1)     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            com.whatsapp.voipcalling.CallState r1 = com.whatsapp.voipcalling.Voip.getCurrentCallState()     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            boolean r1 = com.whatsapp.voipcalling.Voip.A08(r1)     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            if (r1 != 0) goto L_0x081b
            r2 = 18
            java.lang.String r1 = "There is no incoming call"
        L_0x0815:
            java.lang.String r3 = X.AnonymousClass5YV.A02(r2, r1)     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            goto L_0x0c05
        L_0x081b:
            java.lang.String r1 = "call_id"
            java.lang.String r2 = r2.getString(r1)     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            X.332 r1 = r6.A03     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            java.lang.String r5 = r1.A02(r3, r2)     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            com.whatsapp.voipcalling.CallInfo r2 = com.whatsapp.voipcalling.Voip.getCallInfo()     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            if (r2 == 0) goto L_0x0874
            java.lang.String r1 = r2.callId     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            boolean r1 = r5.equals(r1)     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            if (r1 == 0) goto L_0x0874
            boolean r1 = r2.isGroupCall     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            if (r1 != 0) goto L_0x086f
            boolean r1 = r2.isJoinableGroupCall     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            if (r1 != 0) goto L_0x086f
            boolean r3 = r2.videoEnabled     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            X.5ZR r2 = r6.A02     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            boolean r1 = r2.A0D()     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            if (r1 == 0) goto L_0x086a
            boolean r1 = X.C107305b5.A08(r2, r3)     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            if (r1 != 0) goto L_0x086a
            X.2oU r1 = r6.A01     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            android.content.Context r4 = r1.A00     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            X.1iO r1 = r6.A00     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            boolean r1 = r1.A00     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            r3 = r1 ^ 1
            X.36r r2 = X.C86664Kz.A1B()     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            r1 = 3
            android.content.Intent r1 = r2.A1S(r4, r5, r1, r3)     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            r4.startActivity(r1)     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            r1 = 0
            java.lang.String r3 = X.AnonymousClass5YV.A03(r1)     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            goto L_0x0c05
        L_0x086a:
            r2 = 9
            java.lang.String r1 = "WhatsApp requires voice permissions for this operation."
            goto L_0x0815
        L_0x086f:
            r2 = 23
            java.lang.String r1 = "Group calling is disabled"
            goto L_0x0815
        L_0x0874:
            r2 = 17
            java.lang.String r1 = "There is no call with that call id"
            goto L_0x0815
        L_0x0879:
            java.lang.String r1 = "get_call_state"
            boolean r1 = r6.equals(r1)     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            if (r1 == 0) goto L_0x0b06
            X.4uX r10 = r8.A06     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            X.4C1 r1 = r10.A07     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            java.lang.Object r9 = r1.get()     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            com.whatsapp.voipcalling.CallState r9 = (com.whatsapp.voipcalling.CallState) r9     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            X.4C1 r1 = r10.A06     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            java.lang.Object r8 = r1.get()     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            com.whatsapp.voipcalling.CallInfo r8 = (com.whatsapp.voipcalling.CallInfo) r8     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            X.2sr r7 = r10.A00     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            X.3Ex r6 = r10.A01     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            X.5ZU r5 = r10.A02     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            X.2Gr r4 = r10.A03     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            X.332 r2 = r10.A05     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            X.2fH r1 = r10.A04     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            r16 = r7
            r17 = r6
            r18 = r5
            r19 = r4
            r20 = r1
            r21 = r2
            r22 = r3
            r23 = r8
            r24 = r9
            org.json.JSONObject r1 = X.C95794uX.A01(r16, r17, r18, r19, r20, r21, r22, r23, r24)     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            java.lang.String r3 = X.AnonymousClass5YV.A03(r1)     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            goto L_0x0c05
        L_0x08bb:
            java.lang.String r1 = "access_contacts"
            boolean r1 = r6.equals(r1)     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            if (r1 == 0) goto L_0x0b06
            X.4uP r3 = r8.A04     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            java.util.ArrayList r2 = X.AnonymousClass001.A0s()     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            android.net.Uri r1 = X.C85124Fa.A00     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            r2.add(r1)     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            X.2YK r5 = r3.A00     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            X.1uP r1 = r5.A01     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            r1.A02(r9)     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            java.util.Iterator r4 = r2.iterator()     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
        L_0x08d9:
            boolean r1 = r4.hasNext()     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            if (r1 == 0) goto L_0x08f9
            android.net.Uri r3 = X.C86664Kz.A0c(r4)     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            java.lang.String r2 = r3.getAuthority()     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            java.lang.String r1 = "com.whatsapp.provider.instrumentation"
            boolean r1 = r1.equals(r2)     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            if (r1 == 0) goto L_0x0b48
            X.2oU r1 = r5.A00     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            android.content.Context r2 = r1.A00     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            r1 = 129(0x81, float:1.81E-43)
            r2.grantUriPermission(r9, r3, r1)     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            goto L_0x08d9
        L_0x08f9:
            r1 = 0
            java.lang.String r3 = X.AnonymousClass5YV.A03(r1)     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            goto L_0x0c05
        L_0x0900:
            java.lang.String r1 = "reject_call"
            boolean r1 = r6.equals(r1)     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            if (r1 == 0) goto L_0x0b06
            X.4uU r1 = r8.A0D     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            java.lang.String r3 = r1.A00(r3, r4)     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            goto L_0x0c05
        L_0x0910:
            java.lang.String r1 = "mark_message_read"
            boolean r1 = r6.equals(r1)     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            if (r1 == 0) goto L_0x0b06
            X.4uR r6 = r8.A09     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            java.lang.String r1 = "payload"
            org.json.JSONObject r2 = r4.getJSONObject(r1)     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            java.lang.String r1 = "message_id"
            java.lang.String r2 = r2.getString(r1)     // Catch:{ SecurityException -> 0x09e7 }
            X.2YJ r7 = r6.A01     // Catch:{ SecurityException -> 0x09e7 }
            X.332 r1 = r7.A00     // Catch:{ SecurityException -> 0x09e7 }
            java.lang.String r1 = r1.A02(r3, r2)     // Catch:{ SecurityException -> 0x09e7 }
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch:{ 24P | JSONException -> 0x09de }
            r2.<init>(r1)     // Catch:{ 24P | JSONException -> 0x09de }
            r1 = 0
            int r1 = r2.getInt(r1)     // Catch:{ 24P | JSONException -> 0x09de }
            if (r1 != r0) goto L_0x09d6
            java.lang.String r4 = r2.getString(r0)     // Catch:{ 24P | JSONException -> 0x09de }
            boolean r3 = r2.getBoolean(r5)     // Catch:{ 24P | JSONException -> 0x09de }
            r1 = 3
            java.lang.String r1 = r2.getString(r1)     // Catch:{ 24P | JSONException -> 0x09de }
            X.4uZ r1 = X.C106405Yw.A04(r1)     // Catch:{ 24P | JSONException -> 0x09de }
            X.2z0 r2 = new X.2z0     // Catch:{ 24P | JSONException -> 0x09de }
            r2.<init>(r1, r4, r3)     // Catch:{ 24P | JSONException -> 0x09de }
            X.2qz r1 = r7.A01     // Catch:{ SecurityException -> 0x09e7 }
            X.34x r8 = r1.A05(r2)     // Catch:{ SecurityException -> 0x09e7 }
            if (r8 == 0) goto L_0x09ce
            X.4uZ r7 = X.AnonymousClass2z0.A00(r8)     // Catch:{ SecurityException -> 0x09e7 }
            X.2sA r6 = r6.A00     // Catch:{ SecurityException -> 0x09e7 }
            r21 = 3
            X.2ss r1 = r6.A00     // Catch:{ SecurityException -> 0x09e7 }
            r5 = 0
            X.31A r9 = r1.A0A(r7, r5)     // Catch:{ SecurityException -> 0x09e7 }
            if (r9 != 0) goto L_0x097d
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ SecurityException -> 0x09e7 }
            java.lang.String r1 = "msgstore/setChatPartiallySeen/nochat/"
            java.lang.String r1 = X.AnonymousClass000.A0P(r7, r1, r2)     // Catch:{ SecurityException -> 0x09e7 }
        L_0x0973:
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ SecurityException -> 0x09e7 }
        L_0x0976:
            r1 = 0
            java.lang.String r3 = X.AnonymousClass5YV.A03(r1)     // Catch:{ SecurityException -> 0x09e7 }
            goto L_0x0c05
        L_0x097d:
            long r3 = r9.A0Q     // Catch:{ SecurityException -> 0x09e7 }
            long r1 = r8.A1M     // Catch:{ SecurityException -> 0x09e7 }
            int r10 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r10 < 0) goto L_0x0988
            java.lang.String r1 = "msgstore/setChatPartiallySeen/message already seen"
            goto L_0x0973
        L_0x0988:
            X.8qC r3 = r6.A02     // Catch:{ SecurityException -> 0x09e7 }
            java.lang.Object r1 = r3.get()     // Catch:{ SecurityException -> 0x09e7 }
            X.2UO r1 = (X.AnonymousClass2UO) r1     // Catch:{ SecurityException -> 0x09e7 }
            X.2rr r4 = r1.A0J     // Catch:{ SecurityException -> 0x09e7 }
            long r1 = r8.A1M     // Catch:{ SecurityException -> 0x09e7 }
            int r19 = r4.A00(r7, r1)     // Catch:{ SecurityException -> 0x09e7 }
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ SecurityException -> 0x09e7 }
            java.lang.String r1 = "msgstore/setChatPartiallySeen/"
            r2.append(r1)     // Catch:{ SecurityException -> 0x09e7 }
            r2.append(r7)     // Catch:{ SecurityException -> 0x09e7 }
            java.lang.String r1 = "/"
            r2.append(r1)     // Catch:{ SecurityException -> 0x09e7 }
            java.lang.String r1 = r9.A08()     // Catch:{ SecurityException -> 0x09e7 }
            X.C18260x0.A1L(r2, r1)     // Catch:{ SecurityException -> 0x09e7 }
            java.lang.Object r1 = r3.get()     // Catch:{ SecurityException -> 0x09e7 }
            X.2UO r1 = (X.AnonymousClass2UO) r1     // Catch:{ SecurityException -> 0x09e7 }
            X.2rr r3 = r1.A0J     // Catch:{ SecurityException -> 0x09e7 }
            long r1 = r8.A1M     // Catch:{ SecurityException -> 0x09e7 }
            int r20 = r3.A02(r7, r1)     // Catch:{ SecurityException -> 0x09e7 }
            int r19 = r19 - r20
            r22 = r0
            r23 = r5
            r16 = r6
            r17 = r7
            r18 = r8
            r16.A05(r17, r18, r19, r20, r21, r22, r23)     // Catch:{ SecurityException -> 0x09e7 }
            goto L_0x0976
        L_0x09ce:
            java.lang.String r1 = "Message not found"
            java.lang.SecurityException r2 = new java.lang.SecurityException     // Catch:{ SecurityException -> 0x09e7 }
            r2.<init>(r1)     // Catch:{ SecurityException -> 0x09e7 }
            goto L_0x09e6
        L_0x09d6:
            java.lang.String r2 = "Decryption failed - version mismatch"
            java.lang.SecurityException r1 = new java.lang.SecurityException     // Catch:{ 24P | JSONException -> 0x09de }
            r1.<init>(r2)     // Catch:{ 24P | JSONException -> 0x09de }
            throw r1     // Catch:{ 24P | JSONException -> 0x09de }
        L_0x09de:
            r3 = move-exception
            java.lang.String r1 = "Decryption failed"
            java.lang.SecurityException r2 = new java.lang.SecurityException     // Catch:{ SecurityException -> 0x09e7 }
            r2.<init>(r1, r3)     // Catch:{ SecurityException -> 0x09e7 }
        L_0x09e6:
            throw r2     // Catch:{ SecurityException -> 0x09e7 }
        L_0x09e7:
            java.lang.String r1 = "Bad request - mark_message_read"
        L_0x09e9:
            java.lang.String r3 = X.AnonymousClass5YV.A02(r0, r1)     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            goto L_0x0c05
        L_0x09ef:
            java.lang.String r1 = "start_voip_call"
            boolean r1 = r6.equals(r1)     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            if (r1 == 0) goto L_0x0b06
            X.4uT r5 = r8.A0B     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            java.lang.String r1 = "payload"
            org.json.JSONObject r2 = r4.getJSONObject(r1)     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            java.lang.String r1 = "contact_ids"
            org.json.JSONArray r8 = r2.getJSONArray(r1)     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            int r1 = r8.length()     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            java.lang.String r4 = "Bad request - start_voip_call"
            if (r1 != 0) goto L_0x0a18
            java.lang.String r1 = "requesthandler/handle-start-voip-call request did not include a contact"
            com.whatsapp.util.Log.w((java.lang.String) r1)     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            java.lang.String r3 = X.AnonymousClass5YV.A02(r0, r4)     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            goto L_0x0c05
        L_0x0a18:
            java.util.HashSet r6 = X.AnonymousClass002.A0K()     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            r7 = 0
        L_0x0a1d:
            int r1 = r8.length()     // Catch:{ SecurityException -> 0x0afb }
            if (r7 >= r1) goto L_0x0a59
            java.lang.String r2 = r8.getString(r7)     // Catch:{ SecurityException -> 0x0afb }
            boolean r1 = android.text.TextUtils.isEmpty(r2)     // Catch:{ SecurityException -> 0x0afb }
            if (r1 == 0) goto L_0x0a38
            java.lang.String r1 = "requesthandler/handle-start-voip-call request included an empty contact"
            com.whatsapp.util.Log.w((java.lang.String) r1)     // Catch:{ SecurityException -> 0x0afb }
            java.lang.String r3 = X.AnonymousClass5YV.A02(r0, r4)     // Catch:{ SecurityException -> 0x0afb }
            goto L_0x0c05
        L_0x0a38:
            X.2fH r1 = r5.A07     // Catch:{ SecurityException -> 0x0afb }
            X.3ZH r2 = r1.A00(r3, r2)     // Catch:{ SecurityException -> 0x0afb }
            boolean r1 = r2.A0U()     // Catch:{ SecurityException -> 0x0afb }
            if (r1 == 0) goto L_0x0a53
            java.lang.String r1 = "requesthandler/handle-start-voip-call cannot place group calls yet"
            com.whatsapp.util.Log.w((java.lang.String) r1)     // Catch:{ SecurityException -> 0x0afb }
            java.lang.String r2 = "Group calling is disabled"
            r1 = 23
            java.lang.String r3 = X.AnonymousClass5YV.A02(r1, r2)     // Catch:{ SecurityException -> 0x0afb }
            goto L_0x0c05
        L_0x0a53:
            r6.add(r2)     // Catch:{ SecurityException -> 0x0afb }
            int r7 = r7 + 1
            goto L_0x0a1d
        L_0x0a59:
            X.5ZR r1 = r5.A06     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            boolean r1 = r1.A0D()     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            if (r1 == 0) goto L_0x0aec
            X.1iO r1 = r5.A01     // Catch:{ InterruptedException | ExecutionException -> 0x0ad7 }
            boolean r1 = r1.A00     // Catch:{ InterruptedException | ExecutionException -> 0x0ad7 }
            if (r1 != 0) goto L_0x0a6c
            X.2fv r1 = r5.A09     // Catch:{ InterruptedException | ExecutionException -> 0x0ad7 }
            r1.A00(r0)     // Catch:{ InterruptedException | ExecutionException -> 0x0ad7 }
        L_0x0a6c:
            X.2sH r2 = r5.A04     // Catch:{ InterruptedException | ExecutionException -> 0x0ad7 }
            X.2sr r1 = r5.A02     // Catch:{ InterruptedException | ExecutionException -> 0x0ad7 }
            byte[] r1 = X.AnonymousClass35J.A03(r1, r2, r0)     // Catch:{ InterruptedException | ExecutionException -> 0x0ad7 }
            java.lang.String r4 = X.C627236i.A06(r1)     // Catch:{ InterruptedException | ExecutionException -> 0x0ad7 }
            X.5si r1 = new X.5si     // Catch:{ InterruptedException | ExecutionException -> 0x0ad7 }
            r1.<init>(r5, r4, r6)     // Catch:{ InterruptedException | ExecutionException -> 0x0ad7 }
            java.util.concurrent.FutureTask r2 = new java.util.concurrent.FutureTask     // Catch:{ InterruptedException | ExecutionException -> 0x0ad7 }
            r2.<init>(r1)     // Catch:{ InterruptedException | ExecutionException -> 0x0ad7 }
            android.os.Handler r1 = r5.A00     // Catch:{ InterruptedException | ExecutionException -> 0x0ad7 }
            r1.post(r2)     // Catch:{ InterruptedException | ExecutionException -> 0x0ad7 }
            java.lang.Object r1 = r2.get()     // Catch:{ InterruptedException | ExecutionException -> 0x0ad7 }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ InterruptedException | ExecutionException -> 0x0ad7 }
            int r2 = r1.intValue()     // Catch:{ InterruptedException | ExecutionException -> 0x0ad7 }
            X.332 r1 = r5.A08     // Catch:{ InterruptedException | ExecutionException -> 0x0ad7 }
            java.lang.String r3 = r1.A03(r3, r4)     // Catch:{ InterruptedException | ExecutionException -> 0x0ad7 }
            if (r2 == 0) goto L_0x0ac8
            switch(r2) {
                case 2: goto L_0x0a9d;
                case 3: goto L_0x0aa2;
                case 4: goto L_0x0aa7;
                case 5: goto L_0x0aac;
                case 6: goto L_0x0ab1;
                case 7: goto L_0x0ab6;
                case 8: goto L_0x0abb;
                case 9: goto L_0x0abb;
                default: goto L_0x0a9c;
            }     // Catch:{ InterruptedException | ExecutionException -> 0x0ad7 }
        L_0x0a9c:
            goto L_0x0ac0
        L_0x0a9d:
            r2 = 13
            java.lang.String r1 = "Can't initiate a call when a pending call exists."
            goto L_0x0ac3
        L_0x0aa2:
            r2 = 14
            java.lang.String r1 = "Unable to perform requested operation as terms of service have not been accepted."
            goto L_0x0ac3
        L_0x0aa7:
            r2 = 12
            java.lang.String r1 = "WhatsApp needs an internet connection to perform this operation."
            goto L_0x0ac3
        L_0x0aac:
            r2 = 11
            java.lang.String r1 = "The requested contact is blocked."
            goto L_0x0ac3
        L_0x0ab1:
            r2 = 15
            java.lang.String r1 = "Video calling is disabled."
            goto L_0x0ac3
        L_0x0ab6:
            r2 = 9
            java.lang.String r1 = "WhatsApp requires voice permissions for this operation."
            goto L_0x0ac3
        L_0x0abb:
            r2 = 10
            java.lang.String r1 = "Can't initiate a call when already in a call."
            goto L_0x0ac3
        L_0x0ac0:
            r2 = 5
            java.lang.String r1 = "Service internal error! start_voip_call"
        L_0x0ac3:
            java.lang.String r3 = X.AnonymousClass5YV.A02(r2, r1)     // Catch:{ InterruptedException | ExecutionException -> 0x0ad7 }
            goto L_0x0ade
        L_0x0ac8:
            org.json.JSONObject r2 = X.AnonymousClass0x9.A1G()     // Catch:{ InterruptedException | ExecutionException -> 0x0ad7 }
            java.lang.String r1 = "call_id"
            org.json.JSONObject r1 = r2.put(r1, r3)     // Catch:{ InterruptedException | ExecutionException -> 0x0ad7 }
            java.lang.String r3 = X.AnonymousClass5YV.A03(r1)     // Catch:{ InterruptedException | ExecutionException -> 0x0ad7 }
            goto L_0x0ade
        L_0x0ad7:
            java.lang.String r2 = "Service internal error! start_voip_call"
            r1 = 5
            java.lang.String r3 = X.AnonymousClass5YV.A02(r1, r2)     // Catch:{ all -> 0x0ae5 }
        L_0x0ade:
            X.2fv r1 = r5.A09     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            r1.A01(r0)     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            goto L_0x0c05
        L_0x0ae5:
            r2 = move-exception
            X.2fv r1 = r5.A09     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            r1.A01(r0)     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            throw r2     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
        L_0x0aec:
            java.lang.String r1 = "requesthandler/handle-start-voip-call insufficient permissions for call"
            com.whatsapp.util.Log.w((java.lang.String) r1)     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            r2 = 9
            java.lang.String r1 = "WhatsApp requires voice permissions for this operation."
            java.lang.String r3 = X.AnonymousClass5YV.A02(r2, r1)     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            goto L_0x0c05
        L_0x0afb:
            java.lang.String r1 = "requesthandler/handle-start-voip-call request included an invalid contact"
            com.whatsapp.util.Log.w((java.lang.String) r1)     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            java.lang.String r3 = X.AnonymousClass5YV.A02(r0, r4)     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            goto L_0x0c05
        L_0x0b06:
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            java.lang.String r1 = "RequestHandler/handleRequest unhandled action = "
            X.C18260x0.A0t(r1, r6, r2)     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            java.lang.String r1 = "Bad request - "
            java.lang.String r1 = X.AnonymousClass000.A0V(r1, r6, r2)     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            java.lang.String r3 = X.AnonymousClass5YV.A02(r0, r1)     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            goto L_0x0c05
        L_0x0b1f:
            java.lang.String r1 = "RequestHandler/request invalid authorization token"
            com.whatsapp.util.Log.w((java.lang.String) r1)     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            r2 = 4
            java.lang.String r1 = "Request is not authorized!"
            X.59e r3 = new X.59e     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            r3.<init>(r2, r1)     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            goto L_0x0b57
        L_0x0b2d:
            java.lang.String r1 = "Authorization token is missing."
            X.59e r3 = new X.59e     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            r3.<init>(r0, r1)     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            goto L_0x0b57
        L_0x0b35:
            r2 = 6
            java.lang.String r1 = "This protocol version is no longer supported."
            X.59e r3 = new X.59e     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            r3.<init>(r2, r1)     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            goto L_0x0b57
        L_0x0b3e:
            r2 = 21
            java.lang.String r1 = "This version of WhatsApp is no longer supported. Please download the latest version"
            X.59e r3 = new X.59e     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            r3.<init>(r2, r1)     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            goto L_0x0b57
        L_0x0b48:
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            java.lang.String r1 = "Unexpected authority in URI: "
            java.lang.String r1 = X.AnonymousClass000.A0P(r3, r1, r2)     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            java.lang.SecurityException r3 = new java.lang.SecurityException     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
            r3.<init>(r1)     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
        L_0x0b57:
            throw r3     // Catch:{ 59e -> 0x0b6f, all -> 0x0b58 }
        L_0x0b58:
            r3 = move-exception
            java.lang.String r1 = "RequestHandler/handleRequest caught exception handling request"
            com.whatsapp.util.Log.w(r1, r3)     // Catch:{ Exception -> 0x0b7a }
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x0b7a }
            java.lang.String r1 = "Service internal error! "
            java.lang.String r2 = X.AnonymousClass000.A0a(r1, r2, r3)     // Catch:{ Exception -> 0x0b7a }
            r1 = 5
            java.lang.String r3 = X.AnonymousClass5YV.A02(r1, r2)     // Catch:{ Exception -> 0x0b7a }
            goto L_0x0c05
        L_0x0b6f:
            r1 = move-exception
            int r2 = r1.errorCode     // Catch:{ Exception -> 0x0b7a }
            java.lang.String r1 = r1.message     // Catch:{ Exception -> 0x0b7a }
            java.lang.String r3 = X.AnonymousClass5YV.A02(r2, r1)     // Catch:{ Exception -> 0x0b7a }
            goto L_0x0c05
        L_0x0b7a:
            r1 = move-exception
            java.lang.String r0 = "InstrumentationService/request error"
            com.whatsapp.util.Log.w(r0, r1)
            java.lang.String r1 = r1.getMessage()
            android.os.RemoteException r0 = new android.os.RemoteException
            r0.<init>(r1)
            throw r0
        L_0x0b8a:
            java.lang.String r1 = "InstrumentationService/getState"
            com.whatsapp.util.Log.d((java.lang.String) r1)
            com.whatsapp.instrumentation.api.InstrumentationService r2 = r2.A00
            X.1uP r1 = r2.A02
            X.2pD r1 = r1.A00()
            r1.A00()
            android.os.Binder.clearCallingIdentity()
            X.5JP r5 = r2.A01     // Catch:{ Exception -> 0x0be9 }
            X.2sr r1 = r5.A00     // Catch:{ JSONException -> 0x0be0 }
            X.1RR r2 = X.C56972sr.A01(r1)     // Catch:{ JSONException -> 0x0be0 }
            if (r2 == 0) goto L_0x0bd3
            X.32v r1 = r5.A02     // Catch:{ JSONException -> 0x0be0 }
            boolean r1 = r1.A00(r2)     // Catch:{ JSONException -> 0x0be0 }
            if (r1 == 0) goto L_0x0bd3
            X.2jE r1 = r5.A03     // Catch:{ JSONException -> 0x0be0 }
            boolean r4 = r1.A02()     // Catch:{ JSONException -> 0x0be0 }
            org.json.JSONObject r3 = X.AnonymousClass0x9.A1G()     // Catch:{ JSONException -> 0x0be0 }
            java.lang.String r1 = "version"
            r3.put(r1, r0)     // Catch:{ JSONException -> 0x0be0 }
            java.lang.String r2 = "enabled"
            X.2OK r1 = r5.A01     // Catch:{ JSONException -> 0x0be0 }
            boolean r1 = X.AnonymousClass2OK.A00(r1)     // Catch:{ JSONException -> 0x0be0 }
            r3.put(r2, r1)     // Catch:{ JSONException -> 0x0be0 }
            java.lang.String r1 = "registered"
            r3.put(r1, r4)     // Catch:{ JSONException -> 0x0be0 }
            java.lang.String r3 = r3.toString()     // Catch:{ JSONException -> 0x0be0 }
            goto L_0x0c05
        L_0x0bd3:
            java.lang.String r1 = "ServiceState/get-service-state service not enabled for this number"
            com.whatsapp.util.Log.w((java.lang.String) r1)     // Catch:{ JSONException -> 0x0be0 }
            java.lang.String r2 = "Feature is disabled!"
            r1 = 3
            java.lang.String r3 = X.AnonymousClass5YV.A02(r1, r2)     // Catch:{ JSONException -> 0x0be0 }
            goto L_0x0c05
        L_0x0be0:
            r2 = move-exception
            java.lang.String r1 = "Service internal error! "
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ Exception -> 0x0be9 }
            r0.<init>(r1, r2)     // Catch:{ Exception -> 0x0be9 }
            throw r0     // Catch:{ Exception -> 0x0be9 }
        L_0x0be9:
            r1 = move-exception
            java.lang.String r0 = "InstrumentationService/getState error"
            com.whatsapp.util.Log.w(r0, r1)
            java.lang.String r1 = r1.getMessage()
            android.os.RemoteException r0 = new android.os.RemoteException
            r0.<init>(r1)
            throw r0
        L_0x0bf9:
            r1 = 1598968902(0x5f4e5446, float:1.4867585E19)
            if (r6 == r1) goto L_0x0c08
        L_0x0bfe:
            r0 = r40
            boolean r0 = super.onTransact(r6, r4, r15, r0)
            return r0
        L_0x0c05:
            r15.writeNoException()
        L_0x0c08:
            r15.writeString(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4MD.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }

    public AnonymousClass4MD() {
        attachInterface(this, "com.whatsapp.instrumentation.InstrumentationInterface");
    }
}
