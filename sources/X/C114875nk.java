package X;

import com.whatsapp.mediaview.MediaViewFragment;

/* renamed from: X.5nk  reason: invalid class name and case insensitive filesystem */
public class C114875nk implements C185718u8 {
    public final /* synthetic */ MediaViewFragment A00;

    public C114875nk(MediaViewFragment mediaViewFragment) {
        this.A00 = mediaViewFragment;
    }

    /* JADX WARNING: type inference failed for: r2v67, types: [X.5YG] */
    /* JADX WARNING: type inference failed for: r2v94, types: [X.5YG] */
    /* JADX WARNING: type inference failed for: r3v64, types: [X.5YG, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r25v16, types: [X.6qG] */
    /* JADX WARNING: type inference failed for: r25v17, types: [X.567] */
    /* JADX WARNING: type inference failed for: r25v18, types: [X.567] */
    /* JADX WARNING: type inference failed for: r25v19, types: [X.6qG] */
    /* JADX WARNING: type inference failed for: r38v4, types: [X.567] */
    /* JADX WARNING: type inference failed for: r38v5, types: [X.567] */
    /* JADX WARNING: type inference failed for: r25v20, types: [X.6qG] */
    /* JADX WARNING: type inference failed for: r25v21, types: [X.567] */
    /* JADX WARNING: type inference failed for: r25v22, types: [X.567] */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0745, code lost:
        if (r3 != false) goto L_0x0301;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0747, code lost:
        r0.A0L.A0N(X.C86664Kz.A0y(r0), com.whatsapp.mediaview.MediaViewFragment.A01(r48));
        r1 = r1;
        r5 = r5;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x072c  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x0741  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0756  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass0PJ B1A(int r50) {
        /*
            r49 = this;
            r0 = r49
            com.whatsapp.mediaview.MediaViewFragment r0 = r0.A00
            r3 = r50
            X.1mV r15 = r0.A1a(r3)
            if (r15 != 0) goto L_0x001c
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "MediaViewFragment/createView/adapter/instantiateItem/no message "
            X.C18260x0.A0w(r0, r1, r3)
            r1 = 0
            X.0PJ r0 = new X.0PJ
            r0.<init>(r1, r1)
            return r0
        L_0x001c:
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "MediaViewFragment/createView/instantiateItem/ position:"
            r2.append(r1)
            r2.append(r3)
            java.lang.String r1 = " message:"
            X.2z0 r19 = X.C624134x.A08(r15, r1, r2)
            r1 = r19
            java.lang.String r1 = r1.A01
            X.C18260x0.A1J(r2, r1)
            boolean r1 = r0.A1y
            r24 = r1
            r8 = 0
            r0.A1y = r8
            android.view.LayoutInflater r20 = r0.A0I()
            byte r1 = r15.A1I
            r48 = r1
            r2 = 2
            r7 = 1
            r21 = 0
            if (r1 != r2) goto L_0x01ad
            r3 = 2131625401(0x7f0e05b9, float:1.8878009E38)
            r2 = r20
            r1 = r21
            android.view.View r1 = r2.inflate(r3, r1)
            r2 = 2131430204(0x7f0b0b3c, float:1.8482102E38)
            android.view.ViewGroup r22 = X.C86644Kx.A0J(r1, r2)
            r2 = 2131427780(0x7f0b01c4, float:1.8477186E38)
            android.widget.ImageView r5 = X.AnonymousClass0x9.A0F(r1, r2)
            int r2 = r15.A09
            if (r2 != r7) goto L_0x006d
            r2 = 2131233269(0x7f0809f5, float:1.808267E38)
            r5.setImageResource(r2)
        L_0x006d:
            r3 = r21
        L_0x006f:
            X.2z0 r4 = r0.A1R
            r2 = r19
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x007e
            r2 = r19
            X.C107315b6.A08(r5, r2)
        L_0x007e:
            if (r3 == 0) goto L_0x019d
            X.1sV r4 = r0.A1k
            X.5Bs r2 = new X.5Bs
            r2.<init>(r0, r7, r3)
            r4.A0F(r3, r15, r2, r7)
        L_0x008a:
            if (r22 == 0) goto L_0x0158
            r2 = r19
            X.4uZ r4 = r2.A00
            X.C626936e.A06(r4)
            X.3Ex r2 = r0.A0V
            X.3ZH r5 = r2.A0A(r4)
            boolean r2 = r5.A0U()
            if (r2 == 0) goto L_0x00aa
            X.2sj r3 = r0.A0r
            r2 = r4
            com.whatsapp.jid.GroupJid r2 = (com.whatsapp.jid.GroupJid) r2
            boolean r2 = r3.A0C(r2)
            if (r2 == 0) goto L_0x00cd
        L_0x00aa:
            X.2rN r2 = r0.A1i
            boolean r2 = r2.A04(r5, r4)
            if (r2 != 0) goto L_0x00cd
            boolean r2 = r4 instanceof X.C95804uY
            if (r2 != 0) goto L_0x00cd
            X.2ss r3 = r0.A0p
            com.whatsapp.jid.GroupJid r2 = X.AnonymousClass32V.A00(r4)
            int r3 = r3.A06(r2)
            r2 = 3
            if (r3 != r2) goto L_0x015f
            X.1VX r3 = r0.A0z
            r2 = 4727(0x1277, float:6.624E-42)
            boolean r2 = r3.A0X(r2)
            if (r2 == 0) goto L_0x015f
        L_0x00cd:
            boolean r2 = X.C86614Ku.A1Z(r15)
            if (r2 != 0) goto L_0x0143
            r3 = 2131430211(0x7f0b0b43, float:1.8482117E38)
            r2 = r22
            X.C86624Kv.A0z(r2, r3, r8)
            r5 = 2131625402(0x7f0e05ba, float:1.887801E38)
            r3 = r20
            r2 = r21
            android.view.View r6 = r3.inflate(r5, r2)
            r2 = 2131428535(0x7f0b04b7, float:1.8478717E38)
            android.view.View r2 = X.C06560Yg.A02(r6, r2)
            com.whatsapp.ui.media.MediaCaptionTextView r2 = (com.whatsapp.ui.media.MediaCaptionTextView) r2
            r0.A1e = r2
            r2 = r22
            r2.addView(r6, r8)
            com.whatsapp.ui.media.MediaCaptionTextView r2 = r0.A1e
            X.08M r5 = r2.A09
            X.0sA r3 = r0.A0V()
            r2 = 17
            X.C100385As.A01(r3, r5, r6, r0, r2)
            java.lang.String r3 = r15.A1w()
            r2 = 1024(0x400, float:1.435E-42)
            java.lang.String r2 = X.C107575bX.A0D(r3, r2)
            android.text.SpannableStringBuilder r6 = X.C18330xA.A00(r2)
            X.5Xz r5 = r0.A1G
            android.content.Context r10 = r1.getContext()
            java.util.List r3 = r15.A18
            r13 = 2131103185(0x7f060dd1, float:1.781883E38)
            X.5nq r2 = new X.5nq
            r14 = r7
            r9 = r2
            r11 = r4
            r12 = r5
            r9.<init>(r10, r11, r12, r13, r14)
            r5.A06(r6, r2, r3)
            com.whatsapp.ui.media.MediaCaptionTextView r2 = r0.A1e
            r2.setCaptionText(r6)
            com.whatsapp.ui.media.MediaCaptionTextView r3 = r0.A1e
            r2 = 10
            X.C1237169m.A00(r3, r15, r0, r2)
            X.1VX r3 = r0.A0z
            r2 = 3217(0xc91, float:4.508E-42)
            boolean r2 = r3.A0X(r2)
            if (r2 == 0) goto L_0x0143
            r2 = 400(0x190, float:5.6E-43)
            r0.A1V(r7, r2)
        L_0x0143:
            boolean r2 = r0.A1v
            if (r2 == 0) goto L_0x014d
            boolean r2 = X.AnonymousClass35Z.A00(r48)
            if (r2 != 0) goto L_0x0158
        L_0x014d:
            boolean r0 = r0.A0J
            if (r0 != 0) goto L_0x0153
            r8 = 8
        L_0x0153:
            r0 = r22
            r0.setVisibility(r8)
        L_0x0158:
            r0 = r19
            X.0PJ r0 = X.AnonymousClass0x9.A0G(r1, r0)
            return r0
        L_0x015f:
            X.3LP r2 = r0.A10
            boolean r2 = X.C57362tW.A00(r2, r4)
            if (r2 != 0) goto L_0x00cd
            X.1VX r3 = r0.A0z
            r2 = 5582(0x15ce, float:7.822E-42)
            boolean r2 = r3.A0X(r2)
            if (r2 == 0) goto L_0x00cd
            r5 = 2131625409(0x7f0e05c1, float:1.8878025E38)
            r3 = r20
            r2 = r21
            android.view.View r5 = r3.inflate(r5, r2)
            r2 = 2131434216(0x7f0b1ae8, float:1.849024E38)
            android.view.View r6 = X.C06560Yg.A02(r5, r2)
            r2 = 2131429844(0x7f0b09d4, float:1.8481372E38)
            android.view.View r3 = X.C06560Yg.A02(r5, r2)
            r2 = 32
            X.C18310x6.A19(r6, r0, r15, r2)
            r2 = 33
            X.C18310x6.A19(r3, r0, r15, r2)
            r2 = r22
            r2.addView(r5)
            r0.A0G = r7
            goto L_0x00cd
        L_0x019d:
            X.1mV r3 = r0.A1S
            if (r3 == 0) goto L_0x008a
            r2 = r19
            boolean r2 = X.C86664Kz.A1X(r3, r2)
            if (r2 == 0) goto L_0x008a
            r0.A1s = r7
            goto L_0x008a
        L_0x01ad:
            boolean r2 = r0.A1v
            boolean r1 = X.C627636p.A0G(r48)
            if (r2 == 0) goto L_0x065a
            if (r1 == 0) goto L_0x0324
            r3 = 2131625404(0x7f0e05bc, float:1.8878015E38)
            r2 = r20
            r1 = r21
            android.view.View r1 = r2.inflate(r3, r1)
            r2 = 2131430204(0x7f0b0b3c, float:1.8482102E38)
            android.view.ViewGroup r22 = X.C86644Kx.A0J(r1, r2)
            r2 = 2131434266(0x7f0b1b1a, float:1.8490341E38)
            android.view.View r5 = r1.findViewById(r2)
            com.whatsapp.mediaview.PhotoView r5 = (com.whatsapp.mediaview.PhotoView) r5
            r5.A08(r8)
            r2 = r21
            r5.A0K = r2
            r4 = r15
            X.1nB r4 = (X.AnonymousClass1nB) r4
            java.lang.String r2 = "MediaViewFragment/createGifVideoPlayer/createGifPlayer"
            com.whatsapp.util.Log.d((java.lang.String) r2)
            r2 = 2131434679(0x7f0b1cb7, float:1.8491179E38)
            android.view.ViewGroup r16 = X.C86644Kx.A0J(r1, r2)
            X.33C r6 = X.C30471mV.A00(r4)
            java.io.File r10 = r6.A0F
            X.C626936e.A06(r10)
            android.net.Uri r9 = android.net.Uri.fromFile(r10)
            X.2sH r12 = r0.A0h
            X.1VX r2 = r0.A0z
            r23 = r2
            X.4FV r11 = r0.A11
            int r2 = r4.A0B
            long r2 = (long) r2
            r36 = r2
            X.2z0 r2 = r4.A1J
            r42 = r2
            boolean r2 = r2.A02
            int r30 = X.C86654Ky.A01(r2)
            long r34 = r10.lastModified()
            java.lang.Integer r29 = java.lang.Integer.valueOf(r7)
            long r2 = r4.A00
            r25 = r2
            int r2 = r6.A08
            long r2 = (long) r2
            r17 = r2
            int r2 = r6.A06
            long r2 = (long) r2
            r13 = r2
            r3 = 2
            X.1uQ r2 = new X.1uQ
            r27 = r23
            r28 = r11
            r31 = r3
            r32 = r36
            r36 = r25
            r38 = r17
            r40 = r13
            r25 = r2
            r26 = r12
            r25.<init>(r26, r27, r28, r29, r30, r31, r32, r34, r36, r38, r40)
            X.4FS r11 = r0.A1m
            r6 = 6
            X.C70353aM.A00(r11, r0, r2, r10, r6)
            X.1VX r11 = r0.A0z
            X.3Wi r6 = r0.A0L
            r23 = r6
            X.33i r6 = r0.A0f
            r18 = r6
            X.03q r26 = r0.A0R()
            X.2oU r10 = r0.A0i
            X.2re r12 = r0.A18
            X.4FS r6 = r0.A1m
            r17 = r6
            X.8qC r6 = r0.A1p
            java.lang.Object r6 = r6.get()
            X.5NV r6 = (X.AnonymousClass5NV) r6
            X.C162457s7.A0J(r11, r8)
            r13 = r23
            X.C162457s7.A0J(r13, r7)
            r13 = r18
            X.C18260x0.A0b(r13, r9, r10, r3)
            r3 = 6
            X.C162457s7.A0J(r12, r3)
            r3 = r17
            X.C18280x3.A15(r3, r6)
            r3 = 4978(0x1372, float:6.976E-42)
            boolean r14 = r11.A0X(r3)
            r3 = 6393(0x18f9, float:8.959E-42)
            boolean r13 = r11.A0X(r3)
            if (r14 == 0) goto L_0x0304
            X.569 r11 = new X.569
            r11.<init>(r10, r12, r4)
            X.567 r3 = new X.567
            r34 = r8
            r25 = r3
            r27 = r23
            r28 = r18
            r29 = r10
            r30 = r6
            r31 = r17
            r32 = r2
            r33 = r8
            r25.<init>(r26, r27, r28, r29, r30, r31, r32, r33, r34)
            r3.A03 = r9
            X.AnonymousClass567.A01(r3, r11)
            if (r13 == 0) goto L_0x02a7
            r3.A0I()
        L_0x02a7:
            r3.A0C = r7
            r3.A0B = r7
            r2 = r16
            X.AnonymousClass5YG.A03(r2, r3)
            java.util.Map r6 = r0.A29
            r2 = r42
            r6.put(r2, r3)
            X.1VX r2 = r0.A0z
            X.4vZ r6 = new X.4vZ
            r13 = r5
            r9 = r6
            r10 = r2
            r11 = r0
            r12 = r5
            r14 = r4
            r9.<init>(r10, r11, r12, r13, r14)
            r2 = r16
            r2.setOnTouchListener(r6)
            X.7zU r2 = new X.7zU
            r2.<init>(r0, r3)
            r1.setOnSystemUiVisibilityChangeListener(r2)
            X.1VX r4 = r0.A0z
            X.C162457s7.A0J(r4, r8)
            r2 = 4978(0x1372, float:6.976E-42)
            boolean r4 = r4.A0X(r2)
            X.8K4 r2 = new X.8K4
            r2.<init>(r5, r4)
            r3.A0V(r2)
            if (r4 == 0) goto L_0x02f4
            X.8K5 r4 = new X.8K5
            r4.<init>(r5)
            boolean r2 = r3 instanceof X.AnonymousClass567
            if (r2 == 0) goto L_0x02f4
            r2 = r3
            X.567 r2 = (X.AnonymousClass567) r2
            r2.A0C = r4
        L_0x02f4:
            r2 = 4
            r3.A0S(r2)
            if (r24 == 0) goto L_0x0301
            r0.A1n = r3
            int r2 = r0.A05
            r3.A0S(r2)
        L_0x0301:
            r3 = r5
            goto L_0x006f
        L_0x0304:
            X.55y r6 = new X.55y
            r6.<init>(r10, r12, r4)
            X.6qG r3 = new X.6qG
            r33 = r8
            r25 = r3
            r27 = r23
            r28 = r18
            r29 = r11
            r30 = r21
            r31 = r2
            r32 = r8
            r25.<init>(r26, r27, r28, r29, r30, r31, r32, r33)
            r3.A04 = r9
            r3.A0i(r6)
            goto L_0x02a7
        L_0x0324:
            boolean r1 = X.AnonymousClass35Z.A00(r48)
            if (r1 == 0) goto L_0x06f0
            X.1VX r2 = r0.A0z
            r1 = 4953(0x1359, float:6.94E-42)
            boolean r1 = r2.A0X(r1)
            r3 = 2131625403(0x7f0e05bb, float:1.8878013E38)
            if (r1 == 0) goto L_0x033a
            r3 = 2131625407(0x7f0e05bf, float:1.8878021E38)
        L_0x033a:
            r2 = r20
            r1 = r21
            android.view.View r1 = r2.inflate(r3, r1)
            r3 = 81
            r2 = r48
            if (r2 != r3) goto L_0x034b
            X.C107235av.A01(r1)
        L_0x034b:
            r2 = 2131429083(0x7f0b06db, float:1.8479829E38)
            android.view.View r4 = r1.findViewById(r2)
            X.561 r4 = (X.AnonymousClass561) r4
            r2 = 2131430204(0x7f0b0b3c, float:1.8482102E38)
            android.view.ViewGroup r22 = X.C86644Kx.A0J(r4, r2)
            r2 = 2131434266(0x7f0b1b1a, float:1.8490341E38)
            android.view.View r5 = r1.findViewById(r2)
            com.whatsapp.mediaview.PhotoView r5 = (com.whatsapp.mediaview.PhotoView) r5
            r5.A08(r8)
            r2 = r21
            r5.A0K = r2
            r6 = r15
            X.1nB r6 = (X.AnonymousClass1nB) r6
            java.lang.String r2 = "MediaViewFragment/createVideoPlayer/createExoPlayerVideoPlayer"
            com.whatsapp.util.Log.d((java.lang.String) r2)
            r2 = 2131434679(0x7f0b1cb7, float:1.8491179E38)
            android.view.ViewGroup r23 = X.C86644Kx.A0J(r1, r2)
            android.widget.ImageView r3 = r4.A0H
            r2 = 8
            r3.setVisibility(r2)
            int r2 = r6.A0B
            long r2 = X.C18290x4.A0A(r2)
            r4.setDuration(r2)
            X.33C r9 = r6.A01
            X.1VX r2 = r0.A0z
            boolean r2 = X.AnonymousClass35Z.A02(r2, r6)
            r14 = 1
            if (r2 == 0) goto L_0x0564
            r4.A0B = r7
            X.4FV r2 = r0.A11
            r11 = r2
            X.36Y r9 = r0.A0y
            X.2hp r3 = r0.A1V
            X.2Yl r2 = r0.A1W
            r10 = 2
            X.6qD r37 = new X.6qD
            r46 = r7
            r38 = r9
            r39 = r11
            r40 = r21
            r41 = r6
            r42 = r3
            r43 = r2
            r44 = r7
            r45 = r10
            r37.<init>(r38, r39, r40, r41, r42, r43, r44, r45, r46)
            X.1VX r13 = r0.A0z
            X.3Wi r2 = r0.A0L
            r40 = r2
            X.33i r2 = r0.A0f
            r41 = r2
            X.03q r39 = r0.A0R()
            X.2oU r2 = r0.A0i
            r31 = r2
            X.33m r2 = r0.A0Q
            r28 = r2
            X.2zf r2 = r0.A0m
            r11 = r2
            X.5ZU r2 = r0.A0Z
            r30 = r2
            X.2eP r2 = r0.A1A
            r27 = r2
            X.33d r2 = r0.A1B
            r26 = r2
            X.1ip r2 = r0.A0U
            r25 = r2
            X.3Lo r2 = r0.A0q
            r18 = r2
            X.4ea r16 = X.C86664Kz.A0y(r0)
            X.4FS r2 = r0.A1m
            r17 = r2
            X.8qC r2 = r0.A1p
            java.lang.Object r12 = r2.get()
            X.5NV r12 = (X.AnonymousClass5NV) r12
            X.C162457s7.A0J(r13, r8)
            r2 = r40
            X.C162457s7.A0J(r2, r7)
            r9 = r41
            r3 = r31
            r2 = r28
            X.C18260x0.A0b(r9, r3, r2, r10)
            r10 = r30
            r9 = r27
            r3 = r26
            r2 = r25
            X.C18260x0.A0g(r11, r10, r9, r3, r2)
            r3 = r18
            r2 = r16
            X.C18270x1.A13(r3, r2)
            r3 = 15
            r2 = r17
            X.C162457s7.A0J(r2, r3)
            r2 = 16
            X.C162457s7.A0J(r12, r2)
            r2 = 4953(0x1359, float:6.94E-42)
            boolean r3 = r13.A0X(r2)
            r2 = 6393(0x18f9, float:8.959E-42)
            boolean r9 = r13.A0X(r2)
            if (r3 == 0) goto L_0x0533
            X.568 r3 = new X.568
            r29 = r25
            r32 = r11
            r33 = r18
            r34 = r27
            r35 = r26
            r36 = r6
            r25 = r3
            r26 = r16
            r27 = r40
            r25.<init>(r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            X.567 r2 = new X.567
            r47 = r8
            r38 = r2
            r42 = r31
            r43 = r12
            r44 = r17
            r46 = r8
            r45 = r37
            r38.<init>(r39, r40, r41, r42, r43, r44, r45, r46, r47)
            X.AnonymousClass567.A01(r2, r3)
            if (r9 == 0) goto L_0x0464
            r2.A0I()
        L_0x0464:
            X.5qS r3 = new X.5qS
            r3.<init>(r0, r6, r2)
            r2.A08 = r3
        L_0x046b:
            r2.A0W(r4)
            r3 = 2131430019(0x7f0b0a83, float:1.8481727E38)
            android.view.View r9 = r1.findViewById(r3)
            com.whatsapp.videoplayback.ExoPlayerErrorFrame r9 = (com.whatsapp.videoplayback.ExoPlayerErrorFrame) r9
            X.C162457s7.A0J(r9, r7)
            X.2ms r3 = new X.2ms
            r3.<init>(r9, r4, r7)
            r2.A0U(r3)
            if (r14 == 0) goto L_0x049a
            r30 = 9
            X.5ep r9 = new X.5ep
            r25 = r9
            r26 = r0
            r27 = r6
            r28 = r4
            r29 = r2
            r25.<init>(r26, r27, r28, r29, r30)
            com.whatsapp.videoplayback.ExoPlayerErrorFrame r3 = r3.A02
            r3.setOnRetryListener(r9)
        L_0x049a:
            r3 = r23
            X.AnonymousClass5YG.A03(r3, r2)
            java.util.Map r9 = r0.A29
            X.2z0 r3 = r6.A1J
            r9.put(r3, r2)
            boolean r3 = X.C86614Ku.A1Z(r6)
            if (r3 == 0) goto L_0x04bd
            r3 = 2131430204(0x7f0b0b3c, float:1.8482102E38)
            android.view.View r10 = X.C06560Yg.A02(r4, r3)
            X.03q r9 = r0.A0R()
            r3 = 2131233105(0x7f080951, float:1.8082338E38)
            X.C86614Ku.A11(r9, r10, r3)
        L_0x04bd:
            X.67b r9 = new X.67b
            r9.<init>(r4, r7, r0)
            r3 = r23
            X.C06560Yg.A0O(r3, r9)
            X.1VX r3 = r0.A0z
            X.68D r9 = new X.68D
            r29 = r5
            r25 = r9
            r26 = r3
            r27 = r0
            r28 = r5
            r30 = r6
            r31 = r4
            r32 = r8
            r25.<init>(r26, r27, r28, r29, r30, r31, r32)
            r3 = r23
            r3.setOnTouchListener(r9)
            X.1VX r9 = r0.A0z
            X.68D r3 = new X.68D
            r25 = r3
            r26 = r9
            r32 = r7
            r25.<init>(r26, r27, r28, r29, r30, r31, r32)
            r5.setOnTouchListener(r3)
            X.5fH r3 = new X.5fH
            r3.<init>(r0, r2)
            r1.setOnSystemUiVisibilityChangeListener(r3)
            X.5qW r3 = new X.5qW
            r3.<init>(r0, r2)
            r4.A06 = r3
            r3 = 2131434267(0x7f0b1b1b, float:1.8490343E38)
            android.view.View r9 = r1.findViewById(r3)
            X.5qU r3 = new X.5qU
            r3.<init>(r9, r0, r5, r14)
            r2.A0V(r3)
            X.8K6 r6 = new X.8K6
            r6.<init>(r9, r5)
            boolean r3 = r2 instanceof X.AnonymousClass567
            if (r3 == 0) goto L_0x051f
            r3 = r2
            X.567 r3 = (X.AnonymousClass567) r3
            r3.A0C = r6
        L_0x051f:
            r3 = 4
            r2.A0S(r3)
            boolean r3 = r0.A0J
            if (r3 != 0) goto L_0x052a
            r4.A06()
        L_0x052a:
            if (r24 == 0) goto L_0x0301
            r0.A1n = r2
            r4.setVisibility(r8)
            goto L_0x0301
        L_0x0533:
            X.55x r3 = new X.55x
            r29 = r25
            r32 = r11
            r33 = r18
            r34 = r27
            r35 = r26
            r36 = r6
            r25 = r3
            r26 = r16
            r27 = r40
            r25.<init>(r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            X.6qG r2 = new X.6qG
            r33 = r8
            r25 = r2
            r26 = r39
            r28 = r41
            r29 = r13
            r30 = r21
            r31 = r37
            r32 = r8
            r25.<init>(r26, r27, r28, r29, r30, r31, r32, r33)
            r2.A0i(r3)
            goto L_0x0464
        L_0x0564:
            if (r9 == 0) goto L_0x0653
            X.2z0 r2 = r6.A1J
            boolean r13 = r2.A02
            if (r13 != 0) goto L_0x0570
            boolean r2 = r9.A0R
            if (r2 == 0) goto L_0x0653
        L_0x0570:
            java.io.File r10 = r9.A0F
            if (r10 == 0) goto L_0x0653
            r4.A0B = r8
            X.C626936e.A06(r10)
            android.net.Uri r18 = android.net.Uri.fromFile(r10)
            X.2sH r12 = r0.A0h
            X.1VX r2 = r0.A0z
            r16 = r2
            X.4FV r11 = r0.A11
            int r2 = r6.A0B
            long r2 = (long) r2
            r36 = r2
            int r30 = X.C86654Ky.A01(r13)
            long r34 = r10.lastModified()
            java.lang.Integer r29 = java.lang.Integer.valueOf(r7)
            long r2 = r6.A00
            r25 = r2
            int r2 = r9.A08
            long r2 = (long) r2
            r13 = r2
            int r2 = r9.A06
            long r2 = (long) r2
            X.1uQ r17 = new X.1uQ
            r31 = 2
            r27 = r16
            r28 = r11
            r32 = r36
            r36 = r25
            r38 = r13
            r40 = r2
            r25 = r17
            r26 = r12
            r25.<init>(r26, r27, r28, r29, r30, r31, r32, r34, r36, r38, r40)
            X.4FS r9 = r0.A1m
            r3 = 6
            r2 = r17
            X.C70353aM.A00(r9, r0, r2, r10, r3)
            X.3Wi r3 = r0.A0L
            X.2re r2 = r0.A18
            X.5Ne r13 = new X.5Ne
            r13.<init>(r3, r2, r6)
            X.1VX r12 = r0.A0z
            X.3Wi r2 = r0.A0L
            r27 = r2
            X.33i r2 = r0.A0f
            r28 = r2
            X.03q r26 = r0.A0R()
            X.2oU r11 = r0.A0i
            X.2re r14 = r0.A18
            X.4FS r2 = r0.A1m
            r31 = r2
            X.8qC r2 = r0.A1p
            java.lang.Object r10 = r2.get()
            X.5NV r10 = (X.AnonymousClass5NV) r10
            X.C162457s7.A0J(r12, r8)
            r2 = r27
            X.C162457s7.A0J(r2, r7)
            r2 = 2
            r9 = r28
            r3 = r18
            X.C18260x0.A0b(r9, r3, r11, r2)
            r2 = 6
            X.C162457s7.A0J(r14, r2)
            r2 = r31
            X.C86634Kw.A1S(r2, r10)
            r2 = 4953(0x1359, float:6.94E-42)
            boolean r3 = r12.A0X(r2)
            r2 = 6393(0x18f9, float:8.959E-42)
            boolean r16 = r12.A0X(r2)
            if (r3 == 0) goto L_0x0635
            X.569 r9 = new X.569
            r9.<init>(r11, r14, r6, r13)
            X.567 r2 = new X.567
            r34 = r8
            r25 = r2
            r29 = r11
            r30 = r10
            r32 = r17
            r33 = r8
            r25.<init>(r26, r27, r28, r29, r30, r31, r32, r33, r34)
            r3 = r18
            r2.A03 = r3
            X.AnonymousClass567.A01(r2, r9)
            if (r16 == 0) goto L_0x0630
            r2.A0I()
        L_0x0630:
            r13.A01 = r2
            r14 = 0
            goto L_0x046b
        L_0x0635:
            X.55y r9 = new X.55y
            r9.<init>(r11, r14, r6, r13)
            X.6qG r2 = new X.6qG
            r33 = r8
            r25 = r2
            r29 = r12
            r30 = r21
            r31 = r17
            r32 = r8
            r25.<init>(r26, r27, r28, r29, r30, r31, r32, r33)
            r3 = r18
            r2.A04 = r3
            r2.A0i(r9)
            goto L_0x0630
        L_0x0653:
            java.lang.String r2 = "MediaViewFragment/createVideoPlayer/Video cannot be played with ExoPlayer"
            com.whatsapp.util.Log.d((java.lang.String) r2)
            goto L_0x0301
        L_0x065a:
            if (r1 == 0) goto L_0x06f0
            r3 = 2131625406(0x7f0e05be, float:1.887802E38)
            r2 = r20
            r1 = r21
            android.view.View r1 = r2.inflate(r3, r1)
            r2 = 2131430204(0x7f0b0b3c, float:1.8482102E38)
            android.view.ViewGroup r22 = X.C86644Kx.A0J(r1, r2)
            r2 = 48
            X.C18290x4.A1F(r1, r0, r2)
            X.33C r10 = X.C30471mV.A00(r15)
            r2 = r19
            boolean r2 = r2.A02
            if (r2 != 0) goto L_0x068e
            boolean r2 = r10.A0R
            if (r2 != 0) goto L_0x068e
            X.3Wi r4 = r0.A0L
            X.4ea r3 = X.C86664Kz.A0y(r0)
            int r2 = com.whatsapp.mediaview.MediaViewFragment.A01(r48)
            r4.A0N(r3, r2)
        L_0x068e:
            r2 = 2131434679(0x7f0b1cb7, float:1.8491179E38)
            android.view.ViewGroup r9 = X.C86644Kx.A0J(r1, r2)
            X.1VX r6 = r0.A0z
            X.3Wi r5 = r0.A0L
            X.33i r4 = r0.A0f
            android.content.Context r23 = r1.getContext()
            X.2oU r3 = r0.A0i
            java.io.File r2 = r10.A0F
            X.C626936e.A06(r2)
            r29 = r21
            r30 = r21
            r33 = r7
            r35 = r8
            r27 = r6
            r28 = r21
            r31 = r2
            r32 = r7
            r34 = r8
            r24 = r5
            r25 = r4
            r26 = r3
            X.5YG r4 = X.AnonymousClass5YG.A02(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            X.AnonymousClass5YG.A03(r9, r4)
            X.5qR r2 = new X.5qR
            r2.<init>(r0, r4)
            r4.A08 = r2
            r4.A0Z(r7)
            X.91B r2 = new X.91B
            r2.<init>(r8)
            r4.A07 = r2
            java.util.Map r3 = r0.A28
            r2 = r19
            r3.put(r2, r4)
            r2 = 2131434266(0x7f0b1b1a, float:1.8490341E38)
            android.view.View r3 = r1.findViewById(r2)
            com.whatsapp.mediaview.PhotoView r3 = (com.whatsapp.mediaview.PhotoView) r3
            r3.A08(r8)
            r2 = r21
            r3.A0K = r2
            r5 = r3
            goto L_0x006f
        L_0x06f0:
            r3 = 2131625408(0x7f0e05c0, float:1.8878023E38)
            r2 = r20
            r1 = r21
            android.view.View r1 = r2.inflate(r3, r1)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r2 = 2131430204(0x7f0b0b3c, float:1.8482102E38)
            android.view.ViewGroup r22 = X.C86644Kx.A0J(r1, r2)
            android.content.Context r3 = r0.A0G()
            r2 = 2
            X.68C r5 = new X.68C
            r5.<init>(r3, r0, r2)
            r1.addView(r5, r8)
            r4 = 1
            r2 = r48
            if (r2 == r7) goto L_0x0723
            r3 = 25
            if (r2 == r3) goto L_0x0723
            r3 = 57
            if (r2 == r3) goto L_0x0723
            r3 = 42
            if (r2 == r3) goto L_0x0723
            r4 = 0
        L_0x0723:
            r5.A08(r4)
            boolean r2 = X.AnonymousClass35Z.A00(r48)
            if (r2 != 0) goto L_0x0756
            r2 = r21
        L_0x072e:
            r5.A0K = r2
            X.33C r4 = X.C30471mV.A00(r15)
            X.C162457s7.A0J(r4, r8)
            boolean r3 = r4.A03()
            r2 = r19
            boolean r2 = r2.A02
            if (r2 != 0) goto L_0x0301
            boolean r2 = r4.A0R
            if (r2 != 0) goto L_0x0301
            if (r3 != 0) goto L_0x0301
            X.3Wi r4 = r0.A0L
            X.4ea r3 = X.C86664Kz.A0y(r0)
            int r2 = com.whatsapp.mediaview.MediaViewFragment.A01(r48)
            r4.A0N(r3, r2)
            goto L_0x0301
        L_0x0756:
            android.content.Context r3 = r0.A0G()
            r2 = 2131233271(0x7f0809f7, float:1.8082675E38)
            android.graphics.drawable.Drawable r2 = X.AnonymousClass0RP.A00(r3, r2)
            goto L_0x072e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C114875nk.B1A(int):X.0PJ");
    }

    public void B1b(int i) {
        AnonymousClass5YG r0;
        MediaViewFragment mediaViewFragment = this.A00;
        C30471mV A1a = mediaViewFragment.A1a(i);
        if (A1a != null && C627636p.A0G(A1a.A1I)) {
            AnonymousClass5YG r02 = (AnonymousClass5YG) mediaViewFragment.A28.remove(A1a.A1J);
            if (r02 != null) {
                r02.A0G();
            }
        } else if (mediaViewFragment.A1v && A1a != null && (r0 = (AnonymousClass5YG) mediaViewFragment.A29.remove(A1a.A1J)) != null) {
            r0.A0G();
            r0.A0D();
        }
    }

    public /* bridge */ /* synthetic */ int BBY(Object obj) {
        AnonymousClass2z0 r2 = (AnonymousClass2z0) obj;
        C1229866p r0 = this.A00.A1E;
        if (r0 == null) {
            return -2;
        }
        return r0.BBZ(r2);
    }

    public void BTY() {
        MediaViewFragment mediaViewFragment = this.A00;
        mediaViewFragment.A21 = true;
        MediaViewFragment.A05(mediaViewFragment);
        if (!mediaViewFragment.A1r && !mediaViewFragment.A22) {
            long j = mediaViewFragment.A06;
            if (j != 0) {
                mediaViewFragment.A1f.A00(4, C18310x6.A0A(j));
                mediaViewFragment.A22 = true;
            }
        }
    }

    public int getCount() {
        C1229866p r0 = this.A00.A1E;
        if (r0 == null) {
            return 0;
        }
        return r0.getCount();
    }
}
