package X;

import com.whatsapp.mediacomposer.MediaComposerActivity;

/* renamed from: X.5mn  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C114285mn implements C182478oT {
    public final /* synthetic */ MediaComposerActivity A00;

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0085, code lost:
        if (r1 > r2) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0041, code lost:
        if (r0 != 0) goto L_0x0043;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0047 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int BeH(float r7, float r8) {
        /*
            r6 = this;
            com.whatsapp.mediacomposer.MediaComposerActivity r1 = r6.A00
            boolean r0 = r1.isFinishing()
            if (r0 != 0) goto L_0x0047
            com.whatsapp.mediacomposer.MediaComposerFragment r2 = r1.A76()
            if (r2 == 0) goto L_0x0047
            android.graphics.PointF r5 = r1.A1j
            r5.x = r7
            r5.y = r8
            X.5nf r0 = r2.A0E
            com.whatsapp.mediacomposer.doodle.DoodleView r0 = r0.A0M
            int[] r1 = r2.A0U
            r0.getLocationOnScreen(r1)
            float r4 = r5.x
            r0 = 0
            r0 = r1[r0]
            float r0 = (float) r0
            float r4 = r4 - r0
            r5.x = r4
            float r3 = r5.y
            r0 = 1
            r0 = r1[r0]
            float r0 = (float) r0
            float r3 = r3 - r0
            r5.y = r3
            boolean r0 = r2 instanceof com.whatsapp.mediacomposer.VideoComposerFragment
            if (r0 == 0) goto L_0x0049
            com.whatsapp.mediacomposer.VideoComposerFragment r2 = (com.whatsapp.mediacomposer.VideoComposerFragment) r2
            X.5nf r0 = r2.A0E
            boolean r0 = r0.A0B(r4, r3)
            if (r0 != 0) goto L_0x0043
            com.whatsapp.mediacomposer.VideoTimelineView r0 = r2.A0R
            int r0 = r0.A0A
        L_0x0041:
            if (r0 == 0) goto L_0x0047
        L_0x0043:
            r1 = 1
        L_0x0044:
            r0 = 3
            if (r1 != 0) goto L_0x0048
        L_0x0047:
            r0 = 0
        L_0x0048:
            return r0
        L_0x0049:
            boolean r0 = r2 instanceof com.whatsapp.mediacomposer.ImageComposerFragment
            if (r0 == 0) goto L_0x0088
            com.whatsapp.mediacomposer.ImageComposerFragment r2 = (com.whatsapp.mediacomposer.ImageComposerFragment) r2
            X.5Y7 r0 = r2.A07
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r0.A07
            if (r0 == 0) goto L_0x005a
            int r1 = r0.A0O
            r0 = 4
            if (r1 != r0) goto L_0x0043
        L_0x005a:
            X.5nf r0 = r2.A0E
            if (r0 == 0) goto L_0x0064
            boolean r0 = r0.A0B(r4, r3)
            if (r0 != 0) goto L_0x0043
        L_0x0064:
            com.whatsapp.mediacomposer.doodle.ImagePreviewContentLayout r0 = r2.A06
            X.5eK r3 = r0.A04
            boolean r0 = r3.A0L
            if (r0 == 0) goto L_0x0047
            X.8MU r0 = r3.A0F
            if (r0 == 0) goto L_0x0075
            boolean r0 = r0.A05
            if (r0 == 0) goto L_0x0075
            goto L_0x0043
        L_0x0075:
            float r2 = r3.A03
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            float r1 = r3.A00
            if (r0 != 0) goto L_0x0083
            float r0 = r3.A02
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            goto L_0x0041
        L_0x0083:
            int r0 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x0047
            goto L_0x0043
        L_0x0088:
            X.5nf r0 = r2.A0E
            boolean r1 = r0.A0B(r4, r3)
            goto L_0x0044
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C114285mn.BeH(float, float):int");
    }

    public /* synthetic */ C114285mn(MediaComposerActivity mediaComposerActivity) {
        this.A00 = mediaComposerActivity;
    }
}
