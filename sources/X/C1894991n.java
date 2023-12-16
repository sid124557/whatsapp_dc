package X;

/* renamed from: X.91n  reason: invalid class name and case insensitive filesystem */
public class C1894991n implements C835148s {
    public Object A00;
    public final int A01;

    public C1894991n(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static C1894991n A00(Object obj, int i) {
        return new C1894991n(obj, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0102, code lost:
        if (r2.A01 != 0) goto L_0x0104;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void BGn(java.lang.Object r4) {
        /*
            r3 = this;
            int r0 = r3.A01
            switch(r0) {
                case 0: goto L_0x00a6;
                case 1: goto L_0x00b2;
                case 2: goto L_0x00be;
                case 3: goto L_0x00ca;
                case 4: goto L_0x00d8;
                case 5: goto L_0x00e4;
                case 6: goto L_0x00f0;
                case 7: goto L_0x0109;
                case 8: goto L_0x00b1;
                case 9: goto L_0x0115;
                case 10: goto L_0x000c;
                case 11: goto L_0x0013;
                case 12: goto L_0x001a;
                case 13: goto L_0x0021;
                case 14: goto L_0x0028;
                case 15: goto L_0x002f;
                case 16: goto L_0x0036;
                case 17: goto L_0x003d;
                case 18: goto L_0x0044;
                case 19: goto L_0x004b;
                case 20: goto L_0x0052;
                case 21: goto L_0x0059;
                case 22: goto L_0x0060;
                case 23: goto L_0x0067;
                case 24: goto L_0x006e;
                case 25: goto L_0x0075;
                case 26: goto L_0x007c;
                case 27: goto L_0x0083;
                case 28: goto L_0x008a;
                case 29: goto L_0x0091;
                case 30: goto L_0x0098;
                case 31: goto L_0x009f;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.String r0 = "onVideoDecoderReleased"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)
            throw r0
        L_0x000c:
            java.lang.String r0 = "onSeekProcessed"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)
            throw r0
        L_0x0013:
            java.lang.String r0 = "onTimelineChanged"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)
            throw r0
        L_0x001a:
            java.lang.String r0 = "onPositionDiscontinuity"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)
            throw r0
        L_0x0021:
            java.lang.String r0 = "onVideoFrameProcessingOffset"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)
            throw r0
        L_0x0028:
            java.lang.String r0 = "onSkipSilenceEnabledChanged"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)
            throw r0
        L_0x002f:
            java.lang.String r0 = "onSurfaceSizeChanged"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)
            throw r0
        L_0x0036:
            java.lang.String r0 = "onPlaybackSuppressionReasonChanged"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)
            throw r0
        L_0x003d:
            java.lang.String r0 = "onAudioDecoderInitialized"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)
            throw r0
        L_0x0044:
            java.lang.String r0 = "onVideoSizeChanged"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)
            throw r0
        L_0x004b:
            java.lang.String r0 = "onPlayerReleased"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)
            throw r0
        L_0x0052:
            java.lang.String r0 = "onAudioDecoderReleased"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)
            throw r0
        L_0x0059:
            java.lang.String r0 = "onVolumeChanged"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)
            throw r0
        L_0x0060:
            java.lang.String r0 = "onSeekStarted"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)
            throw r0
        L_0x0067:
            java.lang.String r0 = "onIsLoadingChanged"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)
            throw r0
        L_0x006e:
            java.lang.String r0 = "onPlaybackStateChanged"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)
            throw r0
        L_0x0075:
            java.lang.String r0 = "onAudioUnderrun"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)
            throw r0
        L_0x007c:
            java.lang.String r0 = "onIsPlayingChanged"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)
            throw r0
        L_0x0083:
            java.lang.String r0 = "onAudioPositionAdvancing"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)
            throw r0
        L_0x008a:
            java.lang.String r0 = "onVideoDecoderInitialized"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)
            throw r0
        L_0x0091:
            java.lang.String r0 = "onDroppedVideoFrames"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)
            throw r0
        L_0x0098:
            java.lang.String r0 = "onPlayWhenReadyChanged"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)
            throw r0
        L_0x009f:
            java.lang.String r0 = "onPlayerStateChanged"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)
            throw r0
        L_0x00a6:
            java.lang.Object r0 = r3.A00
            X.7oF r0 = (X.C160747oF) r0
            X.8vR r4 = (X.C186488vR) r4
            X.6zd r0 = r0.A03
            r4.BYK(r0)
        L_0x00b1:
            return
        L_0x00b2:
            java.lang.Object r0 = r3.A00
            X.7oF r0 = (X.C160747oF) r0
            X.8vR r4 = (X.C186488vR) r4
            java.util.List r0 = r0.A0A
            r4.BcO(r0)
            return
        L_0x00be:
            java.lang.Object r0 = r3.A00
            X.7oF r0 = (X.C160747oF) r0
            X.8vR r4 = (X.C186488vR) r4
            boolean r0 = r0.A0B
            r4.BUm(r0)
            return
        L_0x00ca:
            java.lang.Object r0 = r3.A00
            X.7oF r0 = (X.C160747oF) r0
            X.8vR r4 = (X.C186488vR) r4
            boolean r1 = r0.A0D
            int r0 = r0.A00
            r4.BYM(r1, r0)
            return
        L_0x00d8:
            java.lang.Object r0 = r3.A00
            X.7oF r0 = (X.C160747oF) r0
            X.8vR r4 = (X.C186488vR) r4
            int r0 = r0.A00
            r4.BYI(r0)
            return
        L_0x00e4:
            java.lang.Object r0 = r3.A00
            X.7oF r0 = (X.C160747oF) r0
            X.8vR r4 = (X.C186488vR) r4
            int r0 = r0.A01
            r4.BYJ(r0)
            return
        L_0x00f0:
            java.lang.Object r2 = r3.A00
            X.7oF r2 = (X.C160747oF) r2
            X.8vR r4 = (X.C186488vR) r4
            int r1 = r2.A00
            r0 = 3
            if (r1 != r0) goto L_0x0104
            boolean r0 = r2.A0D
            if (r0 == 0) goto L_0x0104
            int r1 = r2.A01
            r0 = 1
            if (r1 == 0) goto L_0x0105
        L_0x0104:
            r0 = 0
        L_0x0105:
            r4.BUn(r0)
            return
        L_0x0109:
            java.lang.Object r0 = r3.A00
            X.7oF r0 = (X.C160747oF) r0
            X.8vR r4 = (X.C186488vR) r4
            X.7k2 r0 = r0.A04
            r4.BYE(r0)
            return
        L_0x0115:
            java.lang.Object r0 = r3.A00
            X.7oF r0 = (X.C160747oF) r0
            X.8vR r4 = (X.C186488vR) r4
            boolean r0 = r0.A0E
            r4.BSZ(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1894991n.BGn(java.lang.Object):void");
    }
}
