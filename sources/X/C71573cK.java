package X;

import com.whatsapp.storage.StorageUsageActivity;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.List;

/* renamed from: X.3cK  reason: invalid class name and case insensitive filesystem */
public class C71573cK implements Runnable {
    public Object A00;
    public Object A01;
    public final int A02;

    public C71573cK(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v56, resolved type: X.1XL} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v58, resolved type: X.1WF} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v16, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v17, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v90, resolved type: X.1XL} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v91, resolved type: X.1XL} */
    /* JADX WARNING: type inference failed for: r11v5, types: [java.lang.String] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x02a4, code lost:
        if (r1 != false) goto L_0x02a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x02b1, code lost:
        r0.BhD(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x02b4, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x06a3, code lost:
        r4.A0S(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x06a6, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x06f3, code lost:
        r0.A0N();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x06f6, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x0741, code lost:
        if (r3 == false) goto L_0x0743;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:393:0x09c9, code lost:
        r7 = (X.C30471mV) r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0176, code lost:
        com.whatsapp.util.Log.e(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0179, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r24 = this;
            r5 = r24
            int r0 = r5.A02
            switch(r0) {
                case 0: goto L_0x02f4;
                case 1: goto L_0x0302;
                case 2: goto L_0x0055;
                case 3: goto L_0x0075;
                case 4: goto L_0x00a5;
                case 5: goto L_0x0330;
                case 6: goto L_0x001c;
                case 7: goto L_0x0355;
                case 8: goto L_0x0363;
                case 9: goto L_0x037a;
                case 10: goto L_0x0386;
                case 11: goto L_0x03aa;
                case 12: goto L_0x00d8;
                case 13: goto L_0x03c1;
                case 14: goto L_0x0438;
                case 15: goto L_0x0446;
                case 16: goto L_0x04ff;
                case 17: goto L_0x0530;
                case 18: goto L_0x011e;
                case 19: goto L_0x013d;
                case 20: goto L_0x015c;
                case 21: goto L_0x053d;
                case 22: goto L_0x0184;
                case 23: goto L_0x0553;
                case 24: goto L_0x01b3;
                case 25: goto L_0x06a7;
                case 26: goto L_0x06be;
                case 27: goto L_0x01d1;
                case 28: goto L_0x06dd;
                case 29: goto L_0x01e3;
                case 30: goto L_0x0205;
                case 31: goto L_0x06f7;
                case 32: goto L_0x023c;
                case 33: goto L_0x0716;
                case 34: goto L_0x0724;
                case 35: goto L_0x078a;
                case 36: goto L_0x07e9;
                case 37: goto L_0x0811;
                case 38: goto L_0x0856;
                case 39: goto L_0x087a;
                case 40: goto L_0x0891;
                case 41: goto L_0x026c;
                case 42: goto L_0x0284;
                case 43: goto L_0x08b6;
                case 44: goto L_0x0007;
                case 45: goto L_0x0007;
                case 46: goto L_0x02b5;
                case 47: goto L_0x02d7;
                case 48: goto L_0x08cc;
                case 49: goto L_0x08e1;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r5.A00
            X.5ZM r0 = (X.AnonymousClass5ZM) r0
            java.lang.Object r2 = r5.A01
            X.66M r2 = (X.AnonymousClass66M) r2
            r1 = 1
            X.4MC r0 = r0.A02
            boolean r0 = r0.cancel(r1)
            if (r0 == 0) goto L_0x001b
            r2.Azp()
        L_0x001b:
            return
        L_0x001c:
            java.lang.Object r2 = r5.A00
            com.whatsapp.status.playback.MessageReplyActivity r2 = (com.whatsapp.status.playback.MessageReplyActivity) r2
            java.lang.Object r1 = r5.A01
            X.39M r1 = (X.AnonymousClass39M) r1
            X.2hK r0 = r2.A1A
            X.39M r1 = r0.A00(r1)
            if (r1 == 0) goto L_0x0036
            X.3Wi r4 = r2.A05
            r0 = 5
            X.3cK r7 = new X.3cK
            r7.<init>(r2, r0, r1)
            goto L_0x06a3
        L_0x0036:
            X.2r2 r3 = r2.A10
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "hasAvatar="
            r1.append(r0)
            X.2gs r0 = r2.A0z
            boolean r0 = r0.A01()
            java.lang.String r2 = X.C18300x5.A0m(r1, r0)
            r1 = 4
            java.lang.String r0 = "failed_to_send_cleaned_sticker_quick_reply"
            r3.A02(r1, r0, r2)
            java.lang.String r0 = "MessageReplyActivity/sendAvatarReactionMessage/Failed to send avatar sticker, skipping"
            goto L_0x0176
        L_0x0055:
            java.lang.Object r3 = r5.A00
            com.whatsapp.status.audienceselector.StatusPrivacyActivity r3 = (com.whatsapp.status.audienceselector.StatusPrivacyActivity) r3
            java.lang.Object r4 = r5.A01
            X.5dj r4 = (X.C108895dj) r4
            r0 = 2131429345(0x7f0b07e1, float:1.848036E38)
            android.view.View r1 = r3.findViewById(r0)
            if (r1 == 0) goto L_0x001b
            X.5YA r0 = r3.A75()
            X.66O r5 = r3.A0H
            if (r5 != 0) goto L_0x090b
            java.lang.String r0 = "crosspostAccountLinkingResultListener"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0075:
            java.lang.Object r4 = r5.A00
            X.3Gm r4 = (X.C65173Gm) r4
            java.lang.Object r1 = r5.A01
            X.34x r1 = (X.C624134x) r1
            X.5Tp r0 = r4.A02
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x001b
            boolean r0 = r1 instanceof X.C30441mS
            if (r0 != 0) goto L_0x0095
            android.os.Handler r3 = r4.A00
            r0 = 4
            X.3cK r2 = new X.3cK
            r2.<init>(r4, r0, r1)
        L_0x0091:
            r3.post(r2)
            return
        L_0x0095:
            X.1mS r1 = (X.C30441mS) r1
            java.lang.String r1 = r1.A01
            if (r1 == 0) goto L_0x001b
            android.os.Handler r3 = r4.A00
            r0 = 11
            X.3c0 r2 = new X.3c0
            r2.<init>(r0, r1, r4)
            goto L_0x0091
        L_0x00a5:
            java.lang.Object r4 = r5.A00
            X.3Gm r4 = (X.C65173Gm) r4
            java.lang.Object r3 = r5.A01
            X.34x r3 = (X.C624134x) r3
            java.util.Map r2 = r4.A03
            X.2z0 r0 = r3.A1J
            java.lang.String r1 = r0.A01
            boolean r0 = r2.containsKey(r1)
            if (r0 != 0) goto L_0x001b
            r2.put(r1, r3)
            X.1iG r1 = r4.A01
            java.util.Map r0 = r4.A03
            java.util.ArrayList r2 = X.C18300x5.A0v(r0)
            java.util.Iterator r1 = X.C61102zi.A03(r1)
        L_0x00c8:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x001b
            java.lang.Object r0 = r1.next()
            X.65c r0 = (X.C1226265c) r0
            r0.BX0(r2)
            goto L_0x00c8
        L_0x00d8:
            java.lang.Object r2 = r5.A00
            X.1rJ r2 = (X.C32601rJ) r2
            java.lang.Object r1 = r5.A01
            android.graphics.drawable.Drawable r1 = (android.graphics.drawable.Drawable) r1
            boolean r0 = r2.A02()
            if (r0 == 0) goto L_0x0111
            r3 = 0
            if (r1 == 0) goto L_0x00ef
            r3 = 1
            android.widget.ImageView r0 = r2.A00
            r0.setImageDrawable(r1)
        L_0x00ef:
            X.8pV r0 = r2.A02
            if (r0 == 0) goto L_0x00f6
            r0.Bcc(r3)
        L_0x00f6:
            java.lang.Integer r0 = r2.A04
            if (r0 == 0) goto L_0x001b
            X.2qu r2 = r2.A01
            int r1 = r0.intValue()
            java.lang.String r0 = "sticker_image_emitted_to_ui"
            r2.A01(r1, r0)
            if (r3 == 0) goto L_0x010e
            X.21o r0 = X.C372621o.SUCCESS
        L_0x010a:
            r2.A02(r0, r1)
            return
        L_0x010e:
            X.21o r0 = X.C372621o.FAIL
            goto L_0x010a
        L_0x0111:
            java.lang.Integer r0 = r2.A04
            if (r0 == 0) goto L_0x001b
            X.2qu r2 = r2.A01
            int r1 = r0.intValue()
            X.21o r0 = X.C372621o.CANCEL
            goto L_0x010a
        L_0x011e:
            java.lang.Object r0 = r5.A00
            X.2sn r0 = (X.C56932sn) r0
            java.lang.Object r3 = r5.A01
            java.util.Collection r3 = (java.util.Collection) r3
            X.1ih r0 = r0.A0J
            r2 = 0
            java.util.Iterator r1 = X.C61102zi.A03(r0)
        L_0x012d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x001b
            java.lang.Object r0 = r1.next()
            X.2sh r0 = (X.C56872sh) r0
            r0.A0G(r3, r2)
            goto L_0x012d
        L_0x013d:
            java.lang.Object r0 = r5.A00
            X.2sn r0 = (X.C56932sn) r0
            java.lang.Object r3 = r5.A01
            java.util.Collection r3 = (java.util.Collection) r3
            X.1ih r0 = r0.A0J
            r2 = 0
            java.util.Iterator r1 = X.C61102zi.A03(r0)
        L_0x014c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x001b
            java.lang.Object r0 = r1.next()
            X.2sh r0 = (X.C56872sh) r0
            r0.A0F(r3, r2)
            goto L_0x014c
        L_0x015c:
            java.lang.Object r0 = r5.A00
            X.8LW r0 = (X.AnonymousClass8LW) r0
            java.lang.Object r2 = r5.A01
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
            java.lang.ref.WeakReference r0 = r0.A03
            java.lang.Object r1 = r0.get()
            X.7XO r1 = (X.AnonymousClass7XO) r1
            if (r1 == 0) goto L_0x001b
            boolean r0 = r2.isRecycled()
            if (r0 == 0) goto L_0x017a
            java.lang.String r0 = "AnimatedSticker/StickerFramePreloader/run/frame is recycled"
        L_0x0176:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x017a:
            boolean r0 = r1.A0G
            if (r0 == 0) goto L_0x001b
            r1.A03 = r2
            r1.A00()
            return
        L_0x0184:
            java.lang.Object r0 = r5.A00
            X.6oT r0 = (X.C137306oT) r0
            java.lang.Object r3 = r5.A01
            java.util.AbstractMap r3 = (java.util.AbstractMap) r3
            java.util.List r0 = r0.A04
            java.util.Iterator r2 = r0.iterator()
        L_0x0192:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x001b
            java.lang.Object r1 = r2.next()
            X.8s6 r1 = (X.AnonymousClass8s6) r1
            java.lang.String r0 = r1.getId()
            java.lang.Object r0 = r3.get(r0)
            X.2iT r0 = (X.C50612iT) r0
            if (r0 == 0) goto L_0x0192
            X.6pS r1 = (X.C137906pS) r1
            r1.A06(r0)
            r1.A01()
            goto L_0x0192
        L_0x01b3:
            java.lang.Object r0 = r5.A00
            X.2ht r0 = (X.C50262ht) r0
            java.lang.Object r2 = r5.A01
            X.2iT r2 = (X.C50612iT) r2
            X.1ih r0 = r0.A03
            java.util.Iterator r1 = X.C61102zi.A03(r0)
        L_0x01c1:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x001b
            java.lang.Object r0 = r1.next()
            X.2sh r0 = (X.C56872sh) r0
            r0.A0A(r2)
            goto L_0x01c1
        L_0x01d1:
            java.lang.Object r0 = r5.A00
            android.app.Activity r0 = (android.app.Activity) r0
            java.lang.Object r1 = r5.A01
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            boolean r0 = r0.isFinishing()
            if (r0 != 0) goto L_0x001b
            r1.run()
            return
        L_0x01e3:
            java.lang.String r0 = "storage-usage-activity/fetch chats"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.Object r2 = r5.A00
            java.util.concurrent.atomic.AtomicBoolean r2 = (java.util.concurrent.atomic.AtomicBoolean) r2
            boolean r0 = r2.get()
            if (r0 != 0) goto L_0x001b
            java.lang.Object r6 = r5.A01
            com.whatsapp.storage.StorageUsageActivity r6 = (com.whatsapp.storage.StorageUsageActivity) r6
            X.2yK r0 = r6.A0D
            X.1vC r0 = r0.A02
            java.util.ArrayList r8 = X.AnonymousClass001.A0s()
            android.database.Cursor r9 = r0.A09()
            goto L_0x091a
        L_0x0205:
            java.lang.Object r6 = r5.A00
            com.whatsapp.storage.StorageUsageDeleteMessagesDialogFragment r6 = (com.whatsapp.storage.StorageUsageDeleteMessagesDialogFragment) r6
            java.lang.Object r5 = r5.A01
            java.util.AbstractCollection r5 = (java.util.AbstractCollection) r5
            X.33m r2 = r6.A00
            r1 = 1
            r0 = 0
            r2.A0Y(r5, r1, r0)
            X.65h r9 = r6.A01
            if (r9 == 0) goto L_0x001b
            java.util.Collection r0 = r6.A04
            java.util.Iterator r2 = r0.iterator()
            r11 = 0
        L_0x0220:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x097d
            X.34x r1 = X.C18300x5.A0T(r2)
            boolean r0 = r1 instanceof X.C30471mV
            if (r0 == 0) goto L_0x0220
            boolean r0 = r1.A1F
            if (r0 == 0) goto L_0x0236
            boolean r0 = r6.A06
            if (r0 == 0) goto L_0x0220
        L_0x0236:
            X.1mV r1 = (X.C30471mV) r1
            long r0 = r1.A00
            long r11 = r11 + r0
            goto L_0x0220
        L_0x023c:
            java.lang.Object r6 = r5.A00
            X.29a r6 = (X.AnonymousClass29a) r6
            java.lang.Object r0 = r5.A01
            java.util.Iterator r4 = X.C18320x8.A0q(r0)
        L_0x0246:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x001b
            java.lang.Object r3 = r4.next()
            X.3ZS r3 = (X.AnonymousClass3ZS) r3
            X.4uZ r1 = r3.A01()
            java.lang.Object r2 = r6.A00
            com.whatsapp.storage.StorageUsageGalleryActivity r2 = (com.whatsapp.storage.StorageUsageGalleryActivity) r2
            X.4uZ r0 = r2.A0N
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0246
            X.39K r0 = r3.A00
            long r0 = r0.A0I
            r2.A03 = r0
            r2.A75()
            return
        L_0x026c:
            java.lang.Object r1 = r5.A00
            X.2hj r1 = (X.C50162hj) r1
            java.lang.Object r0 = r5.A01
            X.4uZ r0 = (X.C95814uZ) r0
            java.lang.Integer r0 = r1.A00(r0)
            if (r0 == 0) goto L_0x001b
            X.1WF r2 = new X.1WF
            r2.<init>()
            r2.A00 = r0
            X.4FV r0 = r1.A04
            goto L_0x02b1
        L_0x0284:
            java.lang.Object r4 = r5.A00
            X.2hj r4 = (X.C50162hj) r4
            java.lang.Object r1 = r5.A01
            X.4uZ r1 = (X.C95814uZ) r1
            java.lang.Integer r3 = r4.A00(r1)
            if (r3 == 0) goto L_0x001b
            X.1XL r2 = new X.1XL
            r2.<init>()
            X.2rV r0 = r4.A01
            X.34x r0 = r0.A00(r1)
            if (r0 == 0) goto L_0x02a6
            X.2z0 r0 = r0.A1J
            boolean r1 = r0.A02
            r0 = 0
            if (r1 == 0) goto L_0x02a7
        L_0x02a6:
            r0 = 1
        L_0x02a7:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A00 = r0
            r2.A01 = r3
            X.4FV r0 = r4.A04
        L_0x02b1:
            r0.BhD(r2)
            return
        L_0x02b5:
            java.lang.Object r1 = r5.A00
            X.5I3 r1 = (X.AnonymousClass5I3) r1
            X.0QU r3 = r1.A00
            boolean r0 = r3.A04()
            if (r0 != 0) goto L_0x001b
            java.lang.Object r2 = r5.A01
            X.3Aa r2 = (X.C63633Aa) r2
            X.0rg r0 = r2.A02
            java.lang.Object r1 = r0.apply(r1)
            boolean r0 = r3.A04()
            if (r0 != 0) goto L_0x001b
            X.08J r0 = r2.A03
            r0.A0G(r1)
            return
        L_0x02d7:
            java.lang.Object r1 = r5.A00
            X.53r r1 = (X.C989053r) r1
            java.lang.Object r3 = r5.A01
            java.io.File r3 = (java.io.File) r3
            X.3Dh r0 = r1.A01     // Catch:{ IOException -> 0x09f1 }
            boolean r0 = r0.A0f(r3)     // Catch:{ IOException -> 0x09f1 }
            if (r0 == 0) goto L_0x001b
            X.2oU r0 = r1.A04     // Catch:{ IOException -> 0x09f1 }
            android.content.Context r1 = r0.A00     // Catch:{ IOException -> 0x09f1 }
            android.net.Uri r0 = android.net.Uri.fromFile(r3)     // Catch:{ IOException -> 0x09f1 }
            X.C107655bf.A0Y(r1, r0)     // Catch:{ IOException -> 0x09f1 }
            goto L_0x09f0
        L_0x02f4:
            java.lang.Object r0 = r5.A00
            X.5Wl r0 = (X.C105795Wl) r0
            java.lang.Object r1 = r5.A01
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            android.widget.ImageView r0 = r0.A03
            r0.setImageBitmap(r1)
            return
        L_0x0302:
            java.lang.Object r4 = r5.A00
            com.whatsapp.status.audienceselector.StatusPrivacyActivity r4 = (com.whatsapp.status.audienceselector.StatusPrivacyActivity) r4
            java.lang.Object r3 = r5.A01
            X.5de r3 = (X.C108845de) r3
            X.33e r2 = r4.A74()
            int r1 = r3.A00
            if (r1 == 0) goto L_0x0325
            r0 = 1
            if (r1 == r0) goto L_0x0322
            java.util.List r0 = r3.A02
        L_0x0317:
            r2.A0E(r0, r1)
            X.3FH r0 = r4.A09
            if (r0 == 0) goto L_0x0328
            r0.A00()
            return
        L_0x0322:
            java.util.List r0 = r3.A01
            goto L_0x0317
        L_0x0325:
            X.3d3 r0 = X.C72023d3.A00
            goto L_0x0317
        L_0x0328:
            java.lang.String r0 = "syncdUpdateHelper"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0330:
            java.lang.Object r1 = r5.A00
            com.whatsapp.status.playback.MessageReplyActivity r1 = (com.whatsapp.status.playback.MessageReplyActivity) r1
            java.lang.Object r5 = r5.A01
            X.39M r5 = (X.AnonymousClass39M) r5
            r0 = -1
            r1.setResult(r0)
            X.33m r2 = r1.A0I
            X.4uZ r3 = r1.A0p
            X.C626936e.A06(r3)
            X.34x r4 = r1.A11
            r7 = 0
            r0 = 13
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            r2.A0G(r3, r4, r5, r6, r7)
            r0 = 17
            r1.A79(r0)
            return
        L_0x0355:
            java.lang.Object r0 = r5.A00
            com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment r0 = (com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment) r0
            java.lang.Object r1 = r5.A01
            X.3ZH r1 = (X.AnonymousClass3ZH) r1
            X.3Ex r0 = r0.A0C
            r0.A0M(r1)
            return
        L_0x0363:
            java.lang.Object r3 = r5.A00
            X.5JV r3 = (X.AnonymousClass5JV) r3
            java.lang.Object r2 = r5.A01
            X.2cy r0 = r3.A02
            java.util.List r1 = r0.A00()
            X.3Wi r4 = r3.A00
            r0 = 13
            X.3aN r7 = new X.3aN
            r7.<init>(r3, r1, r2, r0)
            goto L_0x06a3
        L_0x037a:
            java.lang.Object r1 = r5.A00
            X.8pW r1 = (X.C183118pW) r1
            java.lang.Object r0 = r5.A01
            java.util.List r0 = (java.util.List) r0
            r1.Bcb(r0)
            return
        L_0x0386:
            java.lang.Object r1 = r5.A00
            X.1el r1 = (X.C27841el) r1
            java.lang.Object r0 = r5.A01
            X.39M r0 = (X.AnonymousClass39M) r0
            java.lang.String r2 = r0.A0D
            java.lang.String r3 = r0.A0G
            java.lang.String r4 = r0.A08
            java.lang.String r5 = r0.A06
            java.lang.String r6 = r0.A0C
            java.lang.String r7 = r0.A0B
            int r9 = r0.A00
            int r10 = r0.A03
            int r11 = r0.A02
            java.lang.String r8 = r0.A07
            boolean r12 = r0.A0K
            boolean r13 = r0.A0L
            r1.A0H(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        L_0x03aa:
            java.lang.Object r0 = r5.A00
            X.1el r0 = (X.C27841el) r0
            java.lang.Object r4 = r5.A01
            java.util.List r3 = r0.A0D()
            X.3Wi r2 = r0.A01
            r1 = 9
            X.3cK r0 = new X.3cK
            r0.<init>(r4, r1, r3)
            r2.BkS(r0)
            return
        L_0x03c1:
            java.lang.Object r6 = r5.A00
            X.2sn r6 = (X.C56932sn) r6
            java.lang.Object r5 = r5.A01
            java.util.Collection r5 = (java.util.Collection) r5
            java.util.Iterator r9 = r5.iterator()
        L_0x03cd:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x042d
            X.39M r8 = X.AnonymousClass0x7.A0b(r9)
            boolean r0 = r8.A0J
            if (r0 == 0) goto L_0x03e8
            java.lang.String r1 = r8.A05
            if (r1 == 0) goto L_0x03e8
            X.2oq r0 = r6.A0V
            X.39M r8 = r0.A00(r1)
            if (r8 != 0) goto L_0x03e8
            goto L_0x03cd
        L_0x03e8:
            java.lang.String r7 = r8.A0D
            if (r7 == 0) goto L_0x03cd
            X.2pZ r4 = r6.A0R
            boolean r0 = r4.A02(r7)
            if (r0 == 0) goto L_0x03cd
            X.2rq r0 = r6.A05
            r0.A06(r7)
            X.8qC r0 = r6.A0a
            java.lang.Object r3 = r0.get()
            X.3Gp r3 = (X.C65203Gp) r3
            if (r3 == 0) goto L_0x0428
            X.2sH r0 = r6.A08
            long r1 = r0.A0H()
            r0 = 0
            java.util.Set r2 = r3.A0A(r8, r1, r0)
        L_0x040e:
            X.C626936e.A00()
            r4.A01()
            X.2oo r1 = r4.A01
            java.lang.String r0 = r1.A00(r7)
            r1.A02(r7, r0)
            X.2yp r0 = r4.A05
            r0.A03(r7)
            if (r3 == 0) goto L_0x03cd
            r3.A0O(r2)
            goto L_0x03cd
        L_0x0428:
            java.util.Set r2 = java.util.Collections.emptySet()
            goto L_0x040e
        L_0x042d:
            X.3Wi r4 = r6.A04
            r0 = 18
            X.3cK r7 = new X.3cK
            r7.<init>(r6, r0, r5)
            goto L_0x06a3
        L_0x0438:
            java.lang.Object r0 = r5.A00
            X.2sn r0 = (X.C56932sn) r0
            java.lang.Object r1 = r5.A01
            X.2iT r1 = (X.C50612iT) r1
            X.2jG r0 = r0.A0Y
            r0.A01(r1)
            return
        L_0x0446:
            java.lang.Object r6 = r5.A00
            X.2sn r6 = (X.C56932sn) r6
            java.lang.Object r2 = r5.A01
            java.util.List r2 = (java.util.List) r2
            X.1sS r0 = r6.A0Q
            r0.A05()
            java.lang.String r0 = "StickerRepository/reorderMyStickerPackSync"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.2pa r0 = r6.A0T
            X.C626936e.A00()
            X.2X2 r3 = r0.A03
            monitor-enter(r3)
            X.8qC r0 = r3.A00     // Catch:{ all -> 0x04fc }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x04fc }
            X.1RH r0 = (X.AnonymousClass1RH) r0     // Catch:{ all -> 0x04fc }
            X.4Fq r11 = r0.A0C()     // Catch:{ all -> 0x04fc }
            X.3Yo r10 = r11.Axl()     // Catch:{ all -> 0x04f2 }
            java.lang.String r0 = "StickerPackOrderDBTableHelper/setOrder/deleting the table"
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ all -> 0x04e8 }
            r0 = r11
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x04e8 }
            X.2sg r8 = r0.A03     // Catch:{ all -> 0x04e8 }
            java.lang.String r7 = "sticker_pack_order"
            java.lang.String r1 = "setOrder/DELETE_STICKER_PACK_ORDER"
            r0 = 0
            r8.A07(r7, r0, r1, r0)     // Catch:{ all -> 0x04e8 }
            java.util.Iterator r9 = r2.iterator()     // Catch:{ all -> 0x04e8 }
        L_0x0488:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x04e8 }
            if (r0 == 0) goto L_0x04c7
            java.lang.Object r5 = r9.next()     // Catch:{ all -> 0x04e8 }
            X.2iT r5 = (X.C50612iT) r5     // Catch:{ all -> 0x04e8 }
            java.lang.String r4 = r5.A0G     // Catch:{ all -> 0x04e8 }
            int r1 = r5.A00     // Catch:{ all -> 0x04e8 }
            android.content.ContentValues r2 = X.AnonymousClass0x9.A06()     // Catch:{ all -> 0x04e8 }
            java.lang.String r0 = "sticker_pack_id"
            r2.put(r0, r4)     // Catch:{ all -> 0x04e8 }
            java.lang.String r0 = "pack_order"
            X.C18270x1.A0b(r2, r0, r1)     // Catch:{ all -> 0x04e8 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x04e8 }
            java.lang.String r0 = "StickerPackOrderDBTableHelper/setOrder/setting "
            r1.append(r0)     // Catch:{ all -> 0x04e8 }
            java.lang.String r0 = r5.A0I     // Catch:{ all -> 0x04e8 }
            r1.append(r0)     // Catch:{ all -> 0x04e8 }
            java.lang.String r0 = " as order "
            r1.append(r0)     // Catch:{ all -> 0x04e8 }
            int r0 = r5.A00     // Catch:{ all -> 0x04e8 }
            X.C18260x0.A1F(r1, r0)     // Catch:{ all -> 0x04e8 }
            java.lang.String r0 = "setOrder/INSERT_STICKER_PACK_ORDER"
            r8.A09(r7, r0, r2)     // Catch:{ all -> 0x04e8 }
            goto L_0x0488
        L_0x04c7:
            java.lang.String r0 = "StickerPackOrderDBTableHelper/setOrder/transaction successful"
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ all -> 0x04e8 }
            r10.A00()     // Catch:{ all -> 0x04e8 }
            r10.close()     // Catch:{ all -> 0x04f2 }
            r11.close()     // Catch:{ all -> 0x04fc }
            monitor-exit(r3)
            X.3Wi r3 = r6.A04
            X.1ih r2 = r6.A0J
            java.util.Objects.requireNonNull(r2)
            r1 = 24
            X.5sF r0 = new X.5sF
            r0.<init>(r2, r1)
            r3.A0S(r0)
            return
        L_0x04e8:
            r1 = move-exception
            r10.close()     // Catch:{ all -> 0x04ed }
            goto L_0x04f1
        L_0x04ed:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x04f2 }
        L_0x04f1:
            throw r1     // Catch:{ all -> 0x04f2 }
        L_0x04f2:
            r1 = move-exception
            r11.close()     // Catch:{ all -> 0x04f7 }
            goto L_0x04fb
        L_0x04f7:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x04fc }
        L_0x04fb:
            throw r1     // Catch:{ all -> 0x04fc }
        L_0x04fc:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x04ff:
            java.lang.Object r0 = r5.A00
            X.2sn r0 = (X.C56932sn) r0
            java.lang.Object r1 = r5.A01
            X.2iT r1 = (X.C50612iT) r1
            X.2X3 r0 = r0.A0S
            java.lang.String r1 = r1.A0G
            X.8qC r0 = r0.A00
            X.4Fq r5 = X.C18630y0.A08(r0)
            r0 = 1
            java.lang.String[] r4 = X.C18300x5.A1a(r1, r0)     // Catch:{ all -> 0x052b }
            r0 = r5
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x052b }
            X.2sg r3 = r0.A03     // Catch:{ all -> 0x052b }
            java.lang.String r2 = "new_sticker_packs"
            java.lang.String r1 = "pack_id = ?"
            java.lang.String r0 = "unmarkPackAsNew/DELETE_NEW_STICKER_PACK"
            r3.A07(r2, r1, r0, r4)     // Catch:{ all -> 0x052b }
            r5.close()
            return
        L_0x052b:
            r1 = move-exception
            r5.close()     // Catch:{ all -> 0x0978 }
            throw r1
        L_0x0530:
            java.lang.Object r2 = r5.A00
            X.2sn r2 = (X.C56932sn) r2
            java.lang.Object r1 = r5.A01
            java.util.Collection r1 = (java.util.Collection) r1
            r0 = 1
            r2.A0G(r1, r0)
            return
        L_0x053d:
            java.lang.Object r2 = r5.A00
            X.5Nu r2 = (X.C103645Nu) r2
            java.lang.Object r1 = r5.A01
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0 = 0
            r2.A01 = r0
            X.10k r2 = r2.A03
            java.lang.String r1 = r1.toString()
            r0 = 0
            r2.A0E(r1, r0)
            return
        L_0x0553:
            java.lang.Object r2 = r5.A00
            X.6oT r2 = (X.C137306oT) r2
            java.lang.Object r6 = r5.A01
            X.2iT r6 = (X.C50612iT) r6
            java.util.ArrayList r9 = X.AnonymousClass001.A0s()
            java.util.ArrayList r8 = X.AnonymousClass001.A0s()
            java.util.ArrayList r7 = X.AnonymousClass001.A0s()
            java.util.ArrayList r5 = X.AnonymousClass001.A0s()
            java.util.ArrayList r3 = X.AnonymousClass001.A0s()
            java.util.ArrayList r1 = X.AnonymousClass001.A0s()
            java.util.List r0 = r6.A05
            r20 = r0
            java.lang.String r10 = r6.A0E
            java.lang.Integer r4 = X.C18290x4.A0Z()
            X.39M r13 = X.C105555Vl.A00(r4, r10, r0)
            java.util.List r4 = r6.A05
            java.lang.String r0 = r6.A0D
            java.lang.Integer r12 = X.AnonymousClass001.A0f()
            X.39M r11 = X.C105555Vl.A00(r12, r0, r4)
            X.3Wi r4 = r2.A0C
            r10 = 15
            X.3aN r0 = new X.3aN
            r0.<init>(r2, r13, r11, r10)
            r4.A0S(r0)
            java.util.Iterator r17 = r20.iterator()
        L_0x059d:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x0602
            X.39M r11 = X.AnonymousClass0x7.A0b(r17)
            if (r11 == 0) goto L_0x059d
            X.330 r0 = r11.A04
            if (r0 == 0) goto L_0x059d
            X.5Zv[] r10 = r0.A0B
            if (r10 == 0) goto L_0x059d
            X.2wo r0 = r2.A0E
            r19 = r0
            java.util.HashSet r13 = X.AnonymousClass002.A0K()
            int r0 = r10.length
            r18 = r0
            r14 = 0
        L_0x05bd:
            r0 = r18
            if (r14 >= r0) goto L_0x05db
            r15 = r10[r14]
            r0 = r19
            java.util.HashMap r0 = r0.A01
            boolean r16 = r0.containsKey(r15)
            if (r16 == 0) goto L_0x05d8
            java.lang.Object r0 = r0.get(r15)
            java.util.Collection r0 = (java.util.Collection) r0
            if (r0 == 0) goto L_0x05d8
            r13.addAll(r0)
        L_0x05d8:
            int r14 = r14 + 1
            goto L_0x05bd
        L_0x05db:
            A01(r12, r11, r13, r9)
            java.lang.Integer r0 = X.C18290x4.A0c()
            A01(r0, r11, r13, r8)
            java.lang.Integer r0 = X.C18290x4.A0a()
            A01(r0, r11, r13, r7)
            java.lang.Integer r0 = X.C18290x4.A0b()
            A01(r0, r11, r13, r5)
            java.lang.Integer r0 = X.C18290x4.A0d()
            A01(r0, r11, r13, r3)
            java.lang.Integer r0 = X.C18280x3.A0S()
            A01(r0, r11, r13, r1)
            goto L_0x059d
        L_0x0602:
            r10 = 55
            X.91S r0 = new X.91S
            r0.<init>(r10)
            java.util.Collections.sort(r9, r0)
            X.91S r0 = new X.91S
            r0.<init>(r10)
            java.util.Collections.sort(r8, r0)
            X.91S r0 = new X.91S
            r0.<init>(r10)
            java.util.Collections.sort(r7, r0)
            X.91S r0 = new X.91S
            r0.<init>(r10)
            java.util.Collections.sort(r5, r0)
            X.91S r0 = new X.91S
            r0.<init>(r10)
            java.util.Collections.sort(r3, r0)
            X.91S r0 = new X.91S
            r0.<init>(r10)
            java.util.Collections.sort(r1, r0)
            java.util.HashMap r10 = X.AnonymousClass001.A0t()
            android.content.Context r11 = r2.A05
            r0 = 2131886549(0x7f1201d5, float:1.940768E38)
            java.lang.String r13 = r11.getString(r0)
            java.lang.String r12 = "id_all"
            r0 = r20
            A00(r6, r12, r13, r10, r0)
            r0 = 2131886553(0x7f1201d9, float:1.9407688E38)
            java.lang.String r12 = r11.getString(r0)
            java.lang.String r0 = "id_love"
            A00(r6, r0, r12, r10, r1)
            r0 = 2131886551(0x7f1201d7, float:1.9407684E38)
            java.lang.String r1 = r11.getString(r0)
            java.lang.String r0 = "id_haha"
            A00(r6, r0, r1, r10, r9)
            r0 = 2131886555(0x7f1201db, float:1.9407692E38)
            java.lang.String r1 = r11.getString(r0)
            java.lang.String r0 = "id_sad"
            A00(r6, r0, r1, r10, r7)
            r0 = 2131886550(0x7f1201d6, float:1.9407682E38)
            java.lang.String r1 = r11.getString(r0)
            java.lang.String r0 = "id_angry"
            A00(r6, r0, r1, r10, r5)
            r0 = 2131886554(0x7f1201da, float:1.940769E38)
            java.lang.String r1 = r11.getString(r0)
            java.lang.String r0 = "id_reaction"
            A00(r6, r0, r1, r10, r8)
            X.1VX r5 = r2.A0D
            r1 = 4821(0x12d5, float:6.756E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r5.A0Y(r0, r1)
            if (r0 != 0) goto L_0x069c
            r0 = 2131886552(0x7f1201d8, float:1.9407686E38)
            java.lang.String r1 = r11.getString(r0)
            java.lang.String r0 = "id_lifestyle"
            A00(r6, r0, r1, r10, r3)
        L_0x069c:
            r0 = 22
            X.3cK r7 = new X.3cK
            r7.<init>(r2, r0, r10)
        L_0x06a3:
            r4.A0S(r7)
            return
        L_0x06a7:
            java.lang.Object r2 = r5.A00
            com.whatsapp.storage.StorageUsageActivity r2 = (com.whatsapp.storage.StorageUsageActivity) r2
            java.lang.Object r1 = r5.A01
            X.5In r1 = (X.C102355In) r1
            java.lang.String r0 = "storage-usage-activity/fetch forwarded files/completed"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 2
            r2.A77(r0)
            X.4X8 r0 = r2.A0H
            r0.A00 = r1
            goto L_0x06f3
        L_0x06be:
            java.lang.Object r3 = r5.A00
            com.whatsapp.storage.StorageUsageActivity r3 = (com.whatsapp.storage.StorageUsageActivity) r3
            java.lang.Object r2 = r5.A01
            X.5Io r2 = (X.C102365Io) r2
            java.lang.String r0 = "storage-usage-activity/fetch media size/completed"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.4X8 r1 = r3.A0H
            r1.A02 = r2
            r0 = 1
            int r0 = r1.A0M(r0)
            r1.A06(r0)
            r0 = 0
            r3.A77(r0)
            return
        L_0x06dd:
            java.lang.Object r2 = r5.A00
            com.whatsapp.storage.StorageUsageActivity r2 = (com.whatsapp.storage.StorageUsageActivity) r2
            java.lang.Object r1 = r5.A01
            X.5In r1 = (X.C102355In) r1
            java.lang.String r0 = "storage-usage-activity/fetch large files/completed"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 1
            r2.A77(r0)
            X.4X8 r0 = r2.A0H
            r0.A01 = r1
        L_0x06f3:
            r0.A0N()
            return
        L_0x06f7:
            java.lang.Object r3 = r5.A00
            com.whatsapp.storage.StorageUsageGalleryActivity r3 = (com.whatsapp.storage.StorageUsageGalleryActivity) r3
            java.lang.Object r2 = r5.A01
            java.util.Collection r2 = (java.util.Collection) r2
            java.lang.String r0 = "storage-usage-gallery-activity/load duplicate messages/timed out"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r3.A74()
            r1 = 1
            X.6AL r0 = new X.6AL
            r0.<init>(r3, r1)
            com.whatsapp.storage.StorageUsageDeleteMessagesDialogFragment r0 = com.whatsapp.storage.StorageUsageDeleteMessagesDialogFragment.A00(r0, r2, r2)
            X.C18270x1.A0t(r0, r3)
            return
        L_0x0716:
            java.lang.Object r0 = r5.A00
            X.2TV r0 = (X.AnonymousClass2TV) r0
            java.lang.Object r1 = r5.A01
            X.34x r1 = (X.C624134x) r1
            X.2pF r0 = r0.A03
            r0.A02(r1)
            return
        L_0x0724:
            java.lang.Object r4 = r5.A00
            com.whatsapp.support.DescribeProblemActivity r4 = (com.whatsapp.support.DescribeProblemActivity) r4
            java.lang.Object r0 = r5.A01
            X.4ea r0 = (X.C89654ea) r0
            X.2aw r1 = r4.A0B
            android.widget.EditText r2 = r4.A02
            java.lang.String r2 = X.C18290x4.A0m(r2)
            java.lang.String r20 = r2.trim()
            androidx.appcompat.widget.AppCompatCheckBox r2 = r4.A03
            if (r2 == 0) goto L_0x0743
            boolean r3 = r2.isChecked()
            r2 = 1
            if (r3 != 0) goto L_0x0744
        L_0x0743:
            r2 = 0
        L_0x0744:
            r11 = 0
            if (r2 == 0) goto L_0x0777
            java.lang.String r7 = r4.A0N
            java.lang.String r8 = r4.A0O
            X.8tj r2 = r4.A0E
            if (r2 == 0) goto L_0x0753
            java.util.List r11 = r2.BAg()
        L_0x0753:
            r6 = 0
            X.34j r3 = r4.A0J
            X.2zf r2 = r4.A07
            long r14 = r2.A02()
            X.2zf r2 = r4.A07
            long r16 = r2.A03()
            java.lang.String r10 = android.os.Environment.getExternalStorageState()
            X.2oX r2 = r4.A0A
            android.util.Pair r5 = r2.A00()
            r18 = 1
            r12 = r6
            r13 = r6
            r9 = r6
            r19 = r18
            java.lang.String r11 = r3.A04(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r16, r18, r19)
        L_0x0777:
            r22 = 1
            X.5nL r2 = new X.5nL
            r2.<init>(r0, r4)
            r18 = r1
            r19 = r2
            r21 = r11
            r23 = r22
            r18.A00(r19, r20, r21, r22, r23)
            return
        L_0x078a:
            java.lang.Object r3 = r5.A00
            com.whatsapp.support.faq.SearchFAQ r3 = (com.whatsapp.support.faq.SearchFAQ) r3
            java.lang.Object r2 = r5.A01
            android.content.Intent r2 = (android.content.Intent) r2
            java.lang.String r1 = "com.whatsapp.support.faq.SearchFAQ.showContactUs"
            boolean r0 = r2.hasExtra(r1)
            if (r0 == 0) goto L_0x07b8
            boolean r0 = X.AnonymousClass0x9.A1N(r2, r1)
            if (r0 == 0) goto L_0x07b8
            X.5WY r2 = r3.A01
            X.2mi r0 = r3.A03
            boolean r11 = r0.A00()
            java.lang.String r7 = r3.A06
            r4 = 0
            r6 = r4
            r8 = r4
            r9 = r4
            r10 = r4
            r5 = r4
            android.content.Intent r0 = r2.A00(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r3.startActivity(r0)
            return
        L_0x07b8:
            java.lang.String r0 = r3.A06
            boolean r0 = X.AnonymousClass2BI.A00(r0)
            if (r0 == 0) goto L_0x07e7
            X.3Mh r0 = r3.A06
            X.1Ej r1 = X.C66663Mh.A25
            java.lang.String r0 = r0.A06(r1)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x07e7
            X.3Mh r0 = r3.A06
            java.lang.String r8 = r0.A06(r1)
        L_0x07d4:
            X.2d8 r2 = r3.A04
            java.lang.String r6 = r3.A06
            java.lang.String r7 = r3.A07
            java.lang.String r9 = r3.A08
            java.util.ArrayList r10 = r3.A09
            java.util.List r11 = r3.A0C
            r12 = 1
            r4 = 0
            r5 = r4
            r2.A00(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        L_0x07e7:
            r8 = 0
            goto L_0x07d4
        L_0x07e9:
            java.lang.Object r4 = r5.A00
            com.whatsapp.support.faq.SearchFAQ r4 = (com.whatsapp.support.faq.SearchFAQ) r4
            java.lang.Object r3 = r5.A01
            X.3ZG r3 = (X.AnonymousClass3ZG) r3
            java.util.Locale r2 = java.util.Locale.ENGLISH
            java.lang.Object[] r1 = X.AnonymousClass002.A0M()
            int r0 = r4.A00
            X.AnonymousClass000.A1L(r1, r0)
            java.util.HashSet r0 = r4.A0B
            int r0 = r0.size()
            X.AnonymousClass000.A1M(r1, r0)
            java.lang.String r0 = "search-faq/post-event count:%d read:%d"
            java.lang.String.format(r2, r0, r1)
            X.4FV r0 = r4.A02
            r0.BhB(r3)
            return
        L_0x0811:
            java.lang.Object r8 = r5.A00
            com.whatsapp.textstatus.AddTextStatusActivity r8 = (com.whatsapp.textstatus.AddTextStatusActivity) r8
            java.lang.Object r7 = r5.A01
            androidx.recyclerview.widget.RecyclerView r7 = (androidx.recyclerview.widget.RecyclerView) r7
            r6 = 0
            java.util.List r5 = r8.A0L
            boolean r0 = r5.isEmpty()
            r4 = 8
            if (r0 == 0) goto L_0x0831
            r0 = 2131434097(0x7f0b1a71, float:1.8489998E38)
            X.C18280x3.A0r(r8, r0, r4)
        L_0x082a:
            r0 = 2131432722(0x7f0b1512, float:1.848721E38)
            X.C18280x3.A0r(r8, r0, r4)
            return
        L_0x0831:
            X.5Y0 r3 = r8.A0C
            X.C162457s7.A0C(r3)
            X.5Gt r2 = r8.A0K
            X.5Gs r1 = r8.A0J
            X.4WZ r0 = new X.4WZ
            r0.<init>(r3, r1, r2, r5)
            r8.A0C = r0
            X.C18270x1.A0u(r7)
            X.4WZ r0 = r8.A0C
            if (r0 != 0) goto L_0x084f
            java.lang.String r0 = "adapter"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x084f:
            r7.setAdapter(r0)
            r7.setVisibility(r6)
            goto L_0x082a
        L_0x0856:
            java.lang.Object r3 = r5.A00
            X.5S9 r3 = (X.AnonymousClass5S9) r3
            java.lang.Object r2 = r5.A01
            com.whatsapp.textstatus.AddTextStatusActivity r2 = (com.whatsapp.textstatus.AddTextStatusActivity) r2
            r1 = 1
            boolean r0 = r3.A02()
            if (r0 == 0) goto L_0x0868
            r3.A01(r1)
        L_0x0868:
            r2.A74()
            X.4WZ r1 = r2.A0C
            r0 = 0
            if (r1 != 0) goto L_0x0877
            java.lang.String r0 = "adapter"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0877:
            r1.A00 = r0
            return
        L_0x087a:
            java.lang.Object r0 = r5.A00
            com.whatsapp.textstatus.AddTextStatusActivity r0 = (com.whatsapp.textstatus.AddTextStatusActivity) r0
            java.lang.Object r1 = r5.A01
            android.graphics.drawable.Drawable r1 = (android.graphics.drawable.Drawable) r1
            com.whatsapp.WaImageButton r0 = r0.A02
            if (r0 != 0) goto L_0x088d
            java.lang.String r0 = "emojiButton"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x088d:
            r0.setImageDrawable(r1)
            return
        L_0x0891:
            java.lang.Object r0 = r5.A00
            int[] r0 = (int[]) r0
            java.lang.Object r1 = r5.A01
            com.whatsapp.textstatus.AddTextStatusActivity r1 = (com.whatsapp.textstatus.AddTextStatusActivity) r1
            android.content.res.Resources r3 = r1.getResources()
            X.C162457s7.A0D(r3)
            X.5Y0 r2 = r1.A0C
            X.C162457s7.A0D(r2)
            r6 = -1
            X.4qr r4 = new X.4qr
            r4.<init>(r0)
            r5 = 1065353216(0x3f800000, float:1.0)
            android.graphics.drawable.Drawable r0 = r2.A04(r3, r4, r5, r6)
            r1.A05.A0S(new X.C71573cK(r1, 39, r0))
            return
        L_0x08b6:
            java.lang.Object r2 = r5.A00
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r1 = r5.A01
            android.net.Uri r1 = (android.net.Uri) r1
            java.lang.String r0 = "android.intent.action.MEDIA_SCANNER_SCAN_FILE"
            android.content.Intent r0 = X.AnonymousClass0x9.A09(r0)
            android.content.Intent r0 = r0.setData(r1)
            r2.sendBroadcast(r0)
            return
        L_0x08cc:
            java.lang.Object r3 = r5.A01
            X.2zy r3 = (X.C61262zy) r3
            monitor-enter(r3)
            java.util.Map r2 = r3.A0C     // Catch:{ all -> 0x08de }
            java.lang.Object r1 = r5.A00     // Catch:{ all -> 0x08de }
            android.os.Handler r1 = (android.os.Handler) r1     // Catch:{ all -> 0x08de }
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x08de }
            r2.put(r1, r0)     // Catch:{ all -> 0x08de }
            monitor-exit(r3)     // Catch:{ all -> 0x08de }
            return
        L_0x08de:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x08de }
            throw r0
        L_0x08e1:
            java.lang.Object r2 = r5.A00
            X.3dH r2 = (X.C72163dH) r2
            java.lang.Object r0 = r5.A01
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            r0.run()     // Catch:{ all -> 0x08fb }
            monitor-enter(r2)
            int r0 = r2.A00     // Catch:{ all -> 0x08f8 }
            int r0 = r0 + -1
            r2.A00 = r0     // Catch:{ all -> 0x08f8 }
            r2.A00()     // Catch:{ all -> 0x08f8 }
            monitor-exit(r2)     // Catch:{ all -> 0x08f8 }
            return
        L_0x08f8:
            r1 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x08f8 }
            throw r1
        L_0x08fb:
            r1 = move-exception
            monitor-enter(r2)
            int r0 = r2.A00     // Catch:{ all -> 0x0908 }
            int r0 = r0 + -1
            r2.A00 = r0     // Catch:{ all -> 0x0908 }
            r2.A00()     // Catch:{ all -> 0x0908 }
        L_0x0906:
            monitor-exit(r2)     // Catch:{ all -> 0x0908 }
            goto L_0x090a
        L_0x0908:
            r1 = move-exception
            goto L_0x0906
        L_0x090a:
            throw r1
        L_0x090b:
            X.0O1 r2 = r3.A03
            if (r2 != 0) goto L_0x0916
            java.lang.String r0 = "crosspostAccountUnlinkingActivityResultLauncher"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0916:
            r0.A06(r1, r2, r3, r4, r5)
            return
        L_0x091a:
            boolean r0 = r9.moveToNext()     // Catch:{ all -> 0x0971 }
            if (r0 == 0) goto L_0x0948
            int r0 = X.AnonymousClass0x9.A01(r9)     // Catch:{ all -> 0x0971 }
            X.4uZ r7 = X.AnonymousClass0x2.A0K(r9, r0)     // Catch:{ all -> 0x0971 }
            if (r7 == 0) goto L_0x091a
            java.lang.String r0 = "conversation_size"
            long r3 = X.AnonymousClass0x2.A0C(r9, r0)     // Catch:{ all -> 0x0971 }
            java.lang.String r0 = "conversation_message_count"
            int r0 = X.AnonymousClass0x2.A04(r9, r0)     // Catch:{ all -> 0x0971 }
            X.39K r1 = new X.39K     // Catch:{ all -> 0x0971 }
            r1.<init>()     // Catch:{ all -> 0x0971 }
            r1.A0I = r3     // Catch:{ all -> 0x0971 }
            r1.A06 = r0     // Catch:{ all -> 0x0971 }
            X.3ZS r0 = new X.3ZS     // Catch:{ all -> 0x0971 }
            r0.<init>(r1, r7)     // Catch:{ all -> 0x0971 }
            r8.add(r0)     // Catch:{ all -> 0x0971 }
            goto L_0x091a
        L_0x0948:
            r9.close()
            r6.A0Q = r8
            r1 = 0
            r0 = 0
            com.whatsapp.storage.StorageUsageActivity.A0C(r6, r8, r1, r0)
            java.lang.String r0 = "storage-usage-activity/fetch chats/cache completed"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.util.ArrayList r0 = r6.A0Q
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x096a
            r1 = 34
            X.5sF r0 = new X.5sF
            r0.<init>(r5, r1)
            r6.A78(r0)
        L_0x096a:
            X.2yK r1 = r6.A0D
            r0 = 0
            r1.A02(r0, r2)
            return
        L_0x0971:
            r1 = move-exception
            if (r9 == 0) goto L_0x097c
            r9.close()     // Catch:{ all -> 0x0978 }
            throw r1
        L_0x0978:
            r0 = move-exception
            r1.addSuppressed(r0)
        L_0x097c:
            throw r1
        L_0x097d:
            java.util.HashMap r4 = X.AnonymousClass001.A0t()
            java.util.Collection r0 = r6.A03
            java.util.Iterator r2 = r0.iterator()
        L_0x0987:
            boolean r0 = r2.hasNext()
            r3 = 1
            if (r0 == 0) goto L_0x09a7
            X.34x r1 = X.C18300x5.A0T(r2)
            X.1mV r1 = (X.C30471mV) r1
            java.lang.String r0 = r1.A04
            java.lang.Number r0 = X.AnonymousClass0x9.A0p(r0, r4)
            java.lang.String r1 = r1.A04
            if (r0 == 0) goto L_0x09a3
            int r0 = r0.intValue()
            int r3 = r3 + r0
        L_0x09a3:
            X.AnonymousClass0x2.A1I(r1, r4, r3)
            goto L_0x0987
        L_0x09a7:
            boolean r0 = r6.A05
            if (r0 == 0) goto L_0x09e5
            java.util.Collection r0 = r6.A03
        L_0x09ad:
            java.util.Iterator r8 = r0.iterator()
            r13 = 0
        L_0x09b3:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x09e8
            X.34x r7 = X.C18300x5.A0T(r8)
            boolean r0 = r7 instanceof X.C30471mV
            if (r0 == 0) goto L_0x09b3
            boolean r0 = r7.A1F
            if (r0 == 0) goto L_0x09c9
            boolean r0 = r6.A06
            if (r0 == 0) goto L_0x09b3
        L_0x09c9:
            X.1mV r7 = (X.C30471mV) r7
            java.lang.String r2 = r7.A04
            java.lang.Number r1 = X.AnonymousClass0x9.A0p(r2, r4)
            if (r1 == 0) goto L_0x09b3
            int r0 = r1.intValue()
            if (r0 != r3) goto L_0x09e0
            r4.remove(r1)
            long r0 = r7.A00
            long r13 = r13 + r0
            goto L_0x09b3
        L_0x09e0:
            int r0 = r0 - r3
            X.AnonymousClass0x2.A1I(r2, r4, r0)
            goto L_0x09b3
        L_0x09e5:
            java.util.Collection r0 = r6.A04
            goto L_0x09ad
        L_0x09e8:
            int r10 = r5.size()
            r9.BQo(r10, r11, r13)
            return
        L_0x09f0:
            return
        L_0x09f1:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "mediafileurils/broadcastscanmediaintent/unable to scan file "
            X.C18260x0.A0k(r3, r0, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71573cK.run():void");
    }

    public static void A00(C50612iT r0, String str, String str2, AbstractMap abstractMap, List list) {
        C50612iT A002 = C137306oT.A00(r0, str, str2, list);
        abstractMap.put(A002.A0G, A002);
    }

    public static void A01(Object obj, Object obj2, AbstractCollection abstractCollection, AbstractCollection abstractCollection2) {
        if (abstractCollection.contains(obj)) {
            abstractCollection2.add(obj2);
        }
    }

    public C71573cK(C63633Aa r2, Object obj) {
        this.A02 = 46;
        this.A01 = r2;
        this.A00 = new AnonymousClass5I3(obj);
    }

    public C71573cK(StorageUsageActivity storageUsageActivity) {
        this.A02 = 29;
        this.A01 = storageUsageActivity;
        this.A00 = C18280x3.A0l();
    }
}
