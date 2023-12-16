package X;

import androidx.core.view.inputmethod.InputConnectionCompat;
import com.whatsapp.mentions.MentionableEntry;

/* renamed from: X.5gH  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C110465gH implements InputConnectionCompat.OnCommitContentListener {
    public final /* synthetic */ MentionableEntry A00;

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0046, code lost:
        if ("video/x.looping_mp4".equals(r3) != false) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00ef, code lost:
        if (r6.equals("video/x.looping_mp4") != false) goto L_0x00f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0198, code lost:
        if ((r5.A0p instanceof X.C135166kE) == false) goto L_0x019a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onCommitContent(androidx.core.view.inputmethod.InputContentInfoCompat r19, int r20, android.os.Bundle r21) {
        /*
            r18 = this;
            r0 = r18
            com.whatsapp.mentions.MentionableEntry r1 = r0.A00
            java.lang.String r0 = "mentionable/entry/onCommitContent"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            X.8ou r1 = r1.A0F
            if (r1 != 0) goto L_0x0014
            java.lang.String r0 = "mentionable/entry/no on commit content listener"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0012:
            r0 = 0
            return r0
        L_0x0014:
            X.68u r1 = (X.C1235368u) r1
            int r0 = r1.A02
            r4 = r19
            r2 = r20
            switch(r0) {
                case 0: goto L_0x009b;
                case 1: goto L_0x0172;
                default: goto L_0x001f;
            }
        L_0x001f:
            java.lang.Object r5 = r1.A00
            com.whatsapp.textstatuscomposer.TextStatusComposerActivity r5 = (com.whatsapp.textstatuscomposer.TextStatusComposerActivity) r5
            java.lang.Object r0 = r1.A01
            X.5WS r0 = (X.AnonymousClass5WS) r0
            X.7Gn r0 = r0.A00(r4, r2)
            if (r0 == 0) goto L_0x0012
            android.net.Uri r7 = r0.A00
            java.lang.String r3 = r0.A01
            if (r7 == 0) goto L_0x008c
            java.util.ArrayList r6 = X.C18300x5.A0s(r7)
            java.lang.String r0 = "image/gif"
            boolean r0 = r0.equals(r3)
            java.lang.String r2 = "video/x.looping_mp4"
            if (r0 != 0) goto L_0x0048
            boolean r0 = r2.equals(r3)
            r4 = 5
            if (r0 == 0) goto L_0x004a
        L_0x0048:
            r4 = 23
        L_0x004a:
            com.whatsapp.status.playback.widget.StatusEditText r0 = r5.A0j
            java.lang.String r0 = r0.getStringText()
            X.5YF r1 = new X.5YF
            r1.<init>(r7)
            r1.A0G(r0)
            boolean r0 = r2.equals(r3)
            if (r0 == 0) goto L_0x0067
            r0 = 13
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)
            r1.A0F(r0)
        L_0x0067:
            X.5Xq r3 = new X.5Xq
            r3.<init>(r1)
            X.5PE r2 = new X.5PE
            r2.<init>(r5)
            r2.A0G = r6
            X.6kE r0 = X.C135166kE.A00
            java.lang.String r0 = r0.getRawString()
            r2.A0C = r0
            r2.A02 = r4
            r1 = 1
            r2.A0K = r1
            X.AnonymousClass5PE.A00(r3, r2)
            android.content.Intent r0 = r2.A01()
            r5.startActivityForResult(r0, r1)
        L_0x008a:
            r0 = 1
            return r0
        L_0x008c:
            java.lang.String r0 = "textstatus/setuppreview/share-failed"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.3Wi r2 = r5.A05
            r1 = 2131893800(0x7f121e28, float:1.9422387E38)
            r0 = 0
            r2.A0H(r1, r0)
            goto L_0x008a
        L_0x009b:
            java.lang.Object r3 = r1.A00
            X.5l7 r3 = (X.C113245l7) r3
            java.lang.Object r0 = r1.A01
            X.5WS r0 = (X.AnonymousClass5WS) r0
            X.7Gn r2 = r0.A00(r4, r2)
            r13 = 0
            if (r2 == 0) goto L_0x0012
            boolean r0 = r3.A2V()
            if (r0 == 0) goto L_0x00de
            X.4eZ r1 = X.C113245l7.A09(r3)
            r0 = 2131886920(0x7f120348, float:1.9408432E38)
            java.lang.String r2 = r1.getString(r0)
            X.4eZ r1 = X.C113245l7.A09(r3)
            r0 = 16908298(0x102000a, float:2.3877257E-38)
            android.view.View r1 = X.C005205m.A00(r1, r0)
            java.util.List r12 = java.util.Collections.emptyList()
            X.33i r11 = r3.A3G
            X.4eZ r9 = X.C113245l7.A09(r3)
            r0 = -1
            X.4ab r10 = X.C88694ab.A02(r1, r2, r0)
            X.5fd r8 = new X.5fd
            r8.<init>(r9, r10, r11, r12, r13)
            r8.A01()
            goto L_0x008a
        L_0x00de:
            java.lang.String r6 = r2.A01
            java.lang.String r0 = "image/gif"
            boolean r0 = r6.equals(r0)
            java.lang.String r1 = "video/x.looping_mp4"
            if (r0 != 0) goto L_0x00f1
            boolean r0 = r6.equals(r1)
            r5 = 5
            if (r0 == 0) goto L_0x00f3
        L_0x00f1:
            r5 = 23
        L_0x00f3:
            boolean r0 = r6.equals(r1)
            r9 = 0
            if (r0 == 0) goto L_0x013e
            r0 = 13
            java.lang.Byte r4 = java.lang.Byte.valueOf(r0)
        L_0x0100:
            java.lang.String r0 = "image/webp.wasticker"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0140
            X.39M r4 = new X.39M
            r4.<init>()
            X.5Zv[] r12 = new X.C106655Zv[r13]
            java.lang.String r6 = ""
            X.330 r5 = new X.330
            r8 = r6
            r11 = r9
            r15 = r13
            r16 = r13
            r17 = r13
            r7 = r6
            r10 = r9
            r14 = r13
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r4.A04 = r5
            r0 = 512(0x200, float:7.175E-43)
            r4.A03 = r0
            r4.A02 = r0
            java.lang.String r0 = "image/webp"
            r4.A0C = r0
            android.net.Uri r0 = r2.A00
            java.lang.String r1 = r0.toString()
            r0 = 3
            r4.A09 = r1
            r4.A01 = r0
            X.4BP r0 = r3.A7G
            r0.Bci(r4, r9, r13)
            goto L_0x008a
        L_0x013e:
            r4 = r9
            goto L_0x0100
        L_0x0140:
            java.lang.String r0 = "image/png"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0169
            X.1VX r1 = r3.A41
            r0 = 6314(0x18aa, float:8.848E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x0169
            android.net.Uri r2 = r2.A00
            X.4FS r1 = X.C113245l7.A0G(r3)
            r10 = 10
            X.3c6 r0 = new X.3c6
            r9 = r5
            r5 = r0
            r6 = r3
            r7 = r2
            r8 = r4
            r5.<init>(r6, r7, r8, r9, r10)
            r1.BkM(r0)
            goto L_0x008a
        L_0x0169:
            X.4fS r1 = r3.A2a
            android.net.Uri r0 = r2.A00
            r1.A0B(r0, r4, r5)
            goto L_0x008a
        L_0x0172:
            java.lang.Object r5 = r1.A00
            com.whatsapp.status.playback.MessageReplyActivity r5 = (com.whatsapp.status.playback.MessageReplyActivity) r5
            java.lang.Object r0 = r1.A01
            X.5WS r0 = (X.AnonymousClass5WS) r0
            X.7Gn r4 = r0.A00(r4, r2)
            if (r4 == 0) goto L_0x0012
            java.lang.String r2 = r4.A01
            java.lang.String r0 = "image/gif"
            boolean r0 = r2.equals(r0)
            java.lang.String r1 = "video/x.looping_mp4"
            if (r0 != 0) goto L_0x0192
            boolean r0 = r2.equals(r1)
            if (r0 == 0) goto L_0x019a
        L_0x0192:
            X.4uZ r0 = r5.A0p
            boolean r0 = r0 instanceof X.C135166kE
            r3 = 25
            if (r0 != 0) goto L_0x019b
        L_0x019a:
            r3 = 5
        L_0x019b:
            boolean r0 = r2.equals(r1)
            if (r0 == 0) goto L_0x01b0
            r0 = 13
            java.lang.Byte r2 = java.lang.Byte.valueOf(r0)
        L_0x01a7:
            X.4fS r1 = r5.A0U
            android.net.Uri r0 = r4.A00
            r1.A0B(r0, r2, r3)
            goto L_0x008a
        L_0x01b0:
            r2 = 0
            goto L_0x01a7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C110465gH.onCommitContent(androidx.core.view.inputmethod.InputContentInfoCompat, int, android.os.Bundle):boolean");
    }

    public /* synthetic */ C110465gH(MentionableEntry mentionableEntry) {
        this.A00 = mentionableEntry;
    }
}
