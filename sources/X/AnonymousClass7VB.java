package X;

/* renamed from: X.7VB  reason: invalid class name */
public abstract class AnonymousClass7VB {
    public final /* synthetic */ AnonymousClass7VY A00;

    /* JADX WARNING: Can't wrap try/catch for region: R(9:26|27|28|29|30|31|(1:33)|34|(1:36)(1:70)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x0042 */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0055 A[Catch:{ all -> 0x005d, all -> 0x00c7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x005c A[Catch:{ all -> 0x005d, all -> 0x00c7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00() {
        /*
            r5 = this;
            r1 = r5
            X.8zd r1 = (X.C188878zd) r1     // Catch:{ all -> 0x00c7 }
            int r0 = r1.A02     // Catch:{ all -> 0x00c7 }
            switch(r0) {
                case 0: goto L_0x0012;
                case 1: goto L_0x001c;
                case 2: goto L_0x002a;
                case 3: goto L_0x0032;
                case 4: goto L_0x0086;
                case 5: goto L_0x0090;
                case 6: goto L_0x009a;
                case 7: goto L_0x00bd;
                default: goto L_0x0008;
            }     // Catch:{ all -> 0x00c7 }
        L_0x0008:
            java.lang.Object r0 = r1.A01     // Catch:{ all -> 0x00c7 }
            android.media.MediaCodec r0 = (android.media.MediaCodec) r0     // Catch:{ all -> 0x00c7 }
            if (r0 == 0) goto L_0x00cd
            r0.release()     // Catch:{ all -> 0x00c7 }
            return
        L_0x0012:
            java.lang.Object r0 = r1.A01     // Catch:{ all -> 0x00c7 }
            X.8ux r0 = (X.C186228ux) r0     // Catch:{ all -> 0x00c7 }
            if (r0 == 0) goto L_0x00cd
            r0.cancel()     // Catch:{ all -> 0x00c7 }
            return
        L_0x001c:
            java.lang.Object r1 = r1.A01     // Catch:{ all -> 0x00c7 }
            X.85d r1 = (X.C1683685d) r1     // Catch:{ all -> 0x00c7 }
            if (r1 == 0) goto L_0x00cd
            r0 = 1
            r1.A02(r0)     // Catch:{ IOException | RuntimeException -> 0x0026 }
        L_0x0026:
            r0 = 0
            r1.A0H = r0     // Catch:{ all -> 0x00c7 }
            return
        L_0x002a:
            java.lang.Object r0 = r1.A01     // Catch:{ all -> 0x00c7 }
            X.85d r0 = (X.C1683685d) r0     // Catch:{ all -> 0x00c7 }
            r0.stop()     // Catch:{ all -> 0x00c7 }
            return
        L_0x0032:
            java.lang.Object r4 = r1.A01     // Catch:{ all -> 0x00c7 }
            X.7aZ r4 = (X.C153037aZ) r4     // Catch:{ all -> 0x00c7 }
            if (r4 == 0) goto L_0x00cd
            X.7VY r2 = new X.7VY     // Catch:{ all -> 0x005d }
            r2.<init>()     // Catch:{ all -> 0x005d }
            android.media.MediaCodec r1 = r4.A04     // Catch:{ all -> 0x005d }
            r1.stop()     // Catch:{ Exception -> 0x0042 }
        L_0x0042:
            X.8zd r0 = new X.8zd     // Catch:{ all -> 0x005d }
            r0.<init>((android.media.MediaCodec) r1, (X.AnonymousClass7VY) r2)     // Catch:{ all -> 0x005d }
            X.AnonymousClass7RG.A00(r0)     // Catch:{ all -> 0x005d }
            r0 = 0
            r4.A02 = r0     // Catch:{ all -> 0x005d }
            r4.A03 = r0     // Catch:{ all -> 0x005d }
            r4.A00 = r0     // Catch:{ all -> 0x005d }
            android.view.Surface r0 = r4.A05     // Catch:{ all -> 0x005d }
            if (r0 == 0) goto L_0x0058
            r0.release()     // Catch:{ all -> 0x005d }
        L_0x0058:
            java.lang.Throwable r0 = r2.A00     // Catch:{ all -> 0x005d }
            if (r0 == 0) goto L_0x00cd
            throw r0     // Catch:{ all -> 0x005d }
        L_0x005d:
            r3 = move-exception
            boolean r0 = r3 instanceof android.media.MediaCodec.CodecException     // Catch:{ all -> 0x00c7 }
            if (r0 == 0) goto L_0x0083
            r0 = r3
            android.media.MediaCodec$CodecException r0 = (android.media.MediaCodec.CodecException) r0     // Catch:{ all -> 0x00c7 }
            java.lang.String r2 = X.C159297la.A00(r0)     // Catch:{ all -> 0x00c7 }
        L_0x0069:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x00c7 }
            java.lang.String r0 = "codec info:  "
            r1.append(r0)     // Catch:{ all -> 0x00c7 }
            java.lang.String r0 = r4.A01     // Catch:{ all -> 0x00c7 }
            r1.append(r0)     // Catch:{ all -> 0x00c7 }
            java.lang.String r0 = " mediaCodecException: "
            java.lang.String r1 = X.AnonymousClass000.A0V(r0, r2, r1)     // Catch:{ all -> 0x00c7 }
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00c7 }
            r0.<init>(r1, r3)     // Catch:{ all -> 0x00c7 }
            throw r0     // Catch:{ all -> 0x00c7 }
        L_0x0083:
            java.lang.String r2 = "null"
            goto L_0x0069
        L_0x0086:
            java.lang.Object r0 = r1.A01     // Catch:{ all -> 0x00c7 }
            X.8ux r0 = (X.C186228ux) r0     // Catch:{ all -> 0x00c7 }
            if (r0 == 0) goto L_0x00cd
            r0.release()     // Catch:{ all -> 0x00c7 }
            return
        L_0x0090:
            java.lang.Object r0 = r1.A01     // Catch:{ all -> 0x00c7 }
            X.8v9 r0 = (X.C186348v9) r0     // Catch:{ all -> 0x00c7 }
            if (r0 == 0) goto L_0x00cd
            r0.release()     // Catch:{ all -> 0x00c7 }
            return
        L_0x009a:
            java.lang.Object r3 = r1.A01     // Catch:{ all -> 0x00c7 }
            X.7oD r3 = (X.C160727oD) r3     // Catch:{ all -> 0x00c7 }
            if (r3 == 0) goto L_0x00cd
            java.lang.Object[] r2 = X.AnonymousClass002.A0L()     // Catch:{ all -> 0x00c7 }
            r1 = 0
            X.7B8 r0 = r3.A08     // Catch:{ all -> 0x00c7 }
            r2[r1] = r0     // Catch:{ all -> 0x00c7 }
            java.lang.String r1 = "release: mMediaExtractor=%s"
            java.lang.String r0 = "BaseMediaDemuxer"
            X.C1445171w.A00(r0, r1, r2)     // Catch:{ all -> 0x00c7 }
            X.7B8 r0 = r3.A08     // Catch:{ all -> 0x00c7 }
            if (r0 == 0) goto L_0x00cd
            android.media.MediaExtractor r0 = r0.A00     // Catch:{ all -> 0x00c7 }
            r0.release()     // Catch:{ all -> 0x00c7 }
            r0 = 0
            r3.A08 = r0     // Catch:{ all -> 0x00c7 }
            return
        L_0x00bd:
            java.lang.Object r0 = r1.A01     // Catch:{ all -> 0x00c7 }
            X.8uw r0 = (X.C186218uw) r0     // Catch:{ all -> 0x00c7 }
            if (r0 == 0) goto L_0x00cd
            r0.finish()     // Catch:{ all -> 0x00c7 }
            return
        L_0x00c7:
            r1 = move-exception
            X.7VY r0 = r5.A00
            r0.A00(r1)
        L_0x00cd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7VB.A00():void");
    }

    public AnonymousClass7VB(AnonymousClass7VY r1) {
        this.A00 = r1;
    }
}
