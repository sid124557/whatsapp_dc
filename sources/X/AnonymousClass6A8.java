package X;

/* renamed from: X.6A8  reason: invalid class name */
public class AnonymousClass6A8 implements C15790rw {
    public Object A00;
    public final int A01;

    public AnonymousClass6A8(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARNING: Removed duplicated region for block: B:62:0x0171  */
    /* JADX WARNING: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void AwB(java.lang.Object r15) {
        /*
            r14 = this;
            int r0 = r14.A01
            switch(r0) {
                case 0: goto L_0x01cd;
                case 1: goto L_0x002e;
                case 2: goto L_0x0053;
                case 3: goto L_0x005f;
                case 4: goto L_0x0074;
                case 5: goto L_0x00a3;
                case 6: goto L_0x00e5;
                case 7: goto L_0x011c;
                case 8: goto L_0x014b;
                case 9: goto L_0x0178;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r4 = r14.A00
            X.5pp r4 = (X.C116155pp) r4
            java.util.List r15 = (java.util.List) r15
            int r0 = r15.size()
            byte[] r0 = new byte[r0]
            r4.A0C = r0
            r3 = 0
        L_0x0014:
            int r0 = r15.size()
            if (r3 >= r0) goto L_0x01ef
            byte[] r2 = r4.A0C
            java.lang.Object r0 = r15.get(r3)
            float r1 = X.AnonymousClass001.A05(r0)
            r0 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 * r0
            int r0 = (int) r1
            byte r0 = (byte) r0
            r2[r3] = r0
            int r3 = r3 + 1
            goto L_0x0014
        L_0x002e:
            java.lang.Object r2 = r14.A00
            X.4VM r2 = (X.AnonymousClass4VM) r2
            X.5HV r15 = (X.AnonymousClass5HV) r15
            java.util.List r1 = r15.A00
            int r0 = r1.size()
            if (r0 <= 0) goto L_0x0048
            java.lang.Object r0 = X.C18290x4.A0k(r1)
            X.5HU r0 = (X.AnonymousClass5HU) r0
            int r0 = r0.A00
            r2.A0E(r0)
            return
        L_0x0048:
            X.4UC r0 = r2.A05
            X.AnonymousClass0x9.A1I(r0)
            X.4UC r0 = r2.A04
            X.AnonymousClass0x7.A18(r0)
            return
        L_0x0053:
            java.lang.Object r1 = r14.A00
            X.4VM r1 = (X.AnonymousClass4VM) r1
            int r0 = X.AnonymousClass001.A0K(r15)
            r1.A0E(r0)
            return
        L_0x005f:
            java.lang.Object r0 = r14.A00
            X.4fR r0 = (X.C89884fR) r0
            X.3ZH r15 = (X.AnonymousClass3ZH) r15
            if (r15 == 0) goto L_0x01ef
            com.whatsapp.TextEmojiLabel r2 = r0.A0F
            X.5ZU r0 = r0.A0h
            java.lang.String r1 = r0.A0H(r15)
            r0 = 0
            r2.A0K(r0, r1)
            return
        L_0x0074:
            java.lang.Object r4 = r14.A00
            X.5l7 r4 = (X.C113245l7) r4
            java.util.Iterator r3 = X.C18320x8.A0q(r15)
        L_0x007c:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x01ef
            java.lang.Object r2 = r3.next()
            X.0PV r2 = (X.AnonymousClass0PV) r2
            X.0QB r1 = r2.A02
            X.4eZ r0 = X.C113245l7.A09(r4)
            boolean r0 = r1.A00(r0)
            if (r0 == 0) goto L_0x007c
            float r1 = r2.A00
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            boolean r0 = X.AnonymousClass001.A1W(r0)
            r4.A6Q = r0
            r4.A2G(r0)
            return
        L_0x00a3:
            java.lang.Object r4 = r14.A00
            com.whatsapp.gallery.MediaGalleryActivity r4 = (com.whatsapp.gallery.MediaGalleryActivity) r4
            java.util.List r15 = (java.util.List) r15
            boolean r0 = r15.isEmpty()
            r3 = 0
            if (r0 != 0) goto L_0x00d0
            java.util.Iterator r2 = r15.iterator()
        L_0x00b4:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x01ef
            java.lang.Object r1 = r2.next()
            X.0PV r1 = (X.AnonymousClass0PV) r1
            X.0QB r0 = r1.A02
            boolean r0 = r0.A00(r4)
            if (r0 == 0) goto L_0x00b4
            float r1 = r1.A00
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x00d0
            r3 = 1
        L_0x00d0:
            r4.A0k = r3
            r0 = 2131433839(0x7f0b196f, float:1.8489475E38)
            android.view.View r1 = r4.findViewById(r0)
            if (r1 == 0) goto L_0x01ef
            boolean r0 = r4.A0k
            int r0 = X.AnonymousClass001.A08(r0)
            r1.setVisibility(r0)
            return
        L_0x00e5:
            java.lang.Object r2 = r14.A00
            X.55S r2 = (X.AnonymousClass55S) r2
            com.whatsapp.group.GroupProfileEmojiEditor r15 = (com.whatsapp.group.GroupProfileEmojiEditor) r15
            X.4UF r0 = r15.A0D
            X.107 r0 = r0.A00
            int r0 = X.C86604Kt.A05(r0)
            r2.A00 = r0
            android.graphics.Bitmap r0 = r15.A00
            r2.A01 = r0
            android.content.Intent r1 = r15.getIntent()
            java.lang.String r0 = "emojiEditorImageResult"
            android.os.Parcelable r0 = r1.getParcelableExtra(r0)
            android.net.Uri r0 = (android.net.Uri) r0
            r2.A03 = r0
            X.33i r0 = r15.A08
            X.5UR r0 = r0.A0R()
            r2.A04 = r0
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ OutOfMemoryError -> 0x0118 }
            r0 = 640(0x280, float:8.97E-43)
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r0, r0, r1)     // Catch:{ OutOfMemoryError -> 0x0118 }
            goto L_0x0119
        L_0x0118:
            r0 = 0
        L_0x0119:
            r2.A02 = r0
            return
        L_0x011c:
            java.lang.Object r4 = r14.A00
            X.4uF r4 = (X.C95684uF) r4
            java.util.Iterator r3 = X.C18320x8.A0q(r15)
        L_0x0124:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x01ef
            java.lang.Object r2 = r3.next()
            X.0PV r2 = (X.AnonymousClass0PV) r2
            android.app.Activity r1 = r4.A00
            if (r1 == 0) goto L_0x0124
            X.0QB r0 = r2.A02
            java.util.List r0 = r0.A00
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x0124
            float r1 = r2.A00
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            boolean r0 = X.AnonymousClass001.A1W(r0)
            r4.A02(r0)
            return
        L_0x014b:
            java.lang.Object r3 = r14.A00
            X.4uI r3 = (X.C95704uI) r3
            java.util.Iterator r2 = X.C18320x8.A0q(r15)
        L_0x0153:
            r1 = 0
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0169
            java.lang.Object r0 = r2.next()
            X.0PV r0 = (X.AnonymousClass0PV) r0
            float r1 = r0.A00
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            r1 = 1
            if (r0 > 0) goto L_0x0169
            goto L_0x0153
        L_0x0169:
            r3.A0E = r1
            boolean r0 = r3.A7I()
            if (r0 == 0) goto L_0x01ef
            r3.A7G()
            r3.A7E()
            return
        L_0x0178:
            java.lang.Object r1 = r14.A00
            X.5pp r1 = (X.C116155pp) r1
            java.util.List r15 = (java.util.List) r15
            r0 = 0
            r1.A05 = r0
            X.8tA r0 = r1.A0I
            com.whatsapp.textstatuscomposer.voice.VoiceRecordingView r0 = (com.whatsapp.textstatuscomposer.voice.VoiceRecordingView) r0
            com.whatsapp.conversation.waveforms.VoiceVisualizer r2 = r0.A08
            r0 = 0
            r2.A02(r15, r0)
            r1.A02()
            java.io.File r13 = r1.A09
            if (r13 == 0) goto L_0x01ef
            X.5E1 r0 = r1.A0E
            X.8pe r10 = r1.A0J
            X.5sx r0 = r0.A00
            X.3Db r3 = r0.A03
            X.2oU r6 = X.C64333Db.A2q(r3)
            X.1VX r7 = X.C64333Db.A4B(r3)
            X.3Wi r5 = X.C64333Db.A04(r3)
            X.2qk r4 = X.C64333Db.A01(r3)
            X.75E r9 = new X.75E
            r9.<init>()
            X.5bk r2 = r3.A00
            X.4C1 r0 = r2.A0e
            java.lang.Object r11 = r0.get()
            X.5Td r11 = (X.C104995Td) r11
            X.5mK r8 = X.C86634Kw.A0q(r3)
            X.4C1 r0 = r2.A5r
            X.8qC r12 = X.C72343dZ.A00(r0)
            X.5pr r3 = new X.5pr
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r1.A08 = r3
            r3.A00 = r1
            return
        L_0x01cd:
            java.lang.Object r2 = r14.A00
            X.4bn r2 = (X.C89154bn) r2
            java.util.Iterator r1 = X.C18320x8.A0q(r15)
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x01ef
            java.lang.Object r0 = r1.next()
            X.0PV r0 = (X.AnonymousClass0PV) r0
            float r1 = r0.A00
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            boolean r0 = X.AnonymousClass001.A1W(r0)
            r2.A0C = r0
            r2.A7A()
        L_0x01ef:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6A8.AwB(java.lang.Object):void");
    }
}
