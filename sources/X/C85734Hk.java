package X;

/* renamed from: X.4Hk  reason: invalid class name and case insensitive filesystem */
public class C85734Hk implements C84114Bb {
    public Object A00;
    public String A01;
    public final int A02;

    public C85734Hk(int i, String str, Object obj) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00fa, code lost:
        r2.A0D(r3, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00fd, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x015b, code lost:
        r0.add(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x015e, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void BSV(java.lang.Object r10) {
        /*
            r9 = this;
            int r0 = r9.A02
            if (r0 == 0) goto L_0x001c
            java.lang.String r2 = r9.A01
            java.lang.Object r1 = r9.A00
            android.app.Activity r1 = (android.app.Activity) r1
            X.9e5 r10 = (X.C197919e5) r10
            r0 = 2
            X.C162457s7.A0J(r10, r0)
            java.util.List r0 = r10.A00
            boolean r0 = r0.contains(r2)
            if (r0 != 0) goto L_0x001b
            r1.finish()
        L_0x001b:
            return
        L_0x001c:
            java.lang.Object r6 = r9.A00
            X.1QO r6 = (X.AnonymousClass1QO) r6
            java.lang.String r1 = r9.A01
            X.3Wu r10 = (X.C69383Wu) r10
            r0 = 2
            X.C162457s7.A0J(r10, r0)
            java.lang.String r4 = r10.A00
            X.C162457s7.A0C(r4)
            java.util.Map r5 = r10.A02
            int r3 = r1.hashCode()
            java.lang.String r0 = "EVENT_PARAM_BLOKS_PARAMS"
            java.lang.String r1 = X.C18310x6.A0o(r0, r5)
            r2 = 0
            if (r1 == 0) goto L_0x0065
            org.json.JSONTokener r0 = new org.json.JSONTokener
            r0.<init>(r1)
            java.lang.Object r0 = r0.nextValue()
            X.C162457s7.A0H(r0)
            java.lang.Object r8 = X.AnonymousClass355.A00(r0)
            boolean r0 = r8 instanceof java.util.Map
            if (r0 == 0) goto L_0x0054
            java.util.Map r8 = (java.util.Map) r8
            if (r8 != 0) goto L_0x0058
        L_0x0054:
            X.3d5 r8 = X.C72043d5.A00()
        L_0x0058:
            int r0 = r4.hashCode()
            java.lang.String r7 = "screen_id"
            java.lang.String r1 = "bloks_request_end"
            switch(r0) {
                case -1448417750: goto L_0x0143;
                case -330036277: goto L_0x012a;
                case -226946541: goto L_0x010c;
                case -20769540: goto L_0x00fe;
                case 427609089: goto L_0x00e3;
                case 499865650: goto L_0x00b4;
                case 553649050: goto L_0x008b;
                case 1483529842: goto L_0x0067;
                default: goto L_0x0064;
            }
        L_0x0064:
            return
        L_0x0065:
            r8 = r2
            goto L_0x0058
        L_0x0067:
            java.lang.String r0 = "REQUEST_START"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x001b
            X.1Uc r2 = r6.A0B
            java.util.List r0 = r2.A02
            r0.clear()
            java.util.List r0 = r2.A01
            r0.clear()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            java.lang.String r0 = "bloks_request_start"
            r2.A09(r1, r0)
            r1 = 0
            java.lang.String r0 = "bloks_cache_hit"
            r2.A05(r3, r0, r1)
            return
        L_0x008b:
            java.lang.String r0 = "REQUEST_FAILURE"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x001b
            X.1Uc r2 = r6.A0B
            X.C56672sN.A01(r2, r1, r3)
            java.lang.String r0 = "EVENT_PARAM_ERROR_CODE"
            java.lang.String r1 = X.C18310x6.A0o(r0, r5)
            if (r1 == 0) goto L_0x00a5
            java.lang.String r0 = "bloks_error_code"
            r2.A04(r3, r0, r1)
        L_0x00a5:
            java.lang.String r0 = "EVENT_PARAM_ERROR_MESSAGE"
            java.lang.String r1 = X.C18310x6.A0o(r0, r5)
            if (r1 == 0) goto L_0x00b2
            java.lang.String r0 = "bloks_error_message"
            r2.A04(r3, r0, r1)
        L_0x00b2:
            r0 = 3
            goto L_0x00fa
        L_0x00b4:
            java.lang.String r0 = "PAYLOAD_SIZE"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x001b
            java.lang.String r0 = "EVENT_PARAM_COMPRESSED_SIZE"
            java.lang.String r0 = X.C18310x6.A0o(r0, r5)
            if (r0 == 0) goto L_0x00cf
            X.1Uc r4 = r6.A0B
            java.lang.String r2 = "bloks_compressed_size"
            long r0 = java.lang.Long.parseLong(r0)
            r4.A03(r3, r2, r0)
        L_0x00cf:
            java.lang.String r0 = "EVENT_PARAM_UNCOMPRESSED_SIZE"
            java.lang.String r0 = X.C18310x6.A0o(r0, r5)
            if (r0 == 0) goto L_0x001b
            X.1Uc r4 = r6.A0B
            java.lang.String r2 = "bloks_uncompressed_size"
            long r0 = java.lang.Long.parseLong(r0)
            r4.A03(r3, r2, r0)
            return
        L_0x00e3:
            java.lang.String r0 = "OPEN_SCREEN"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x001b
            X.1VX r2 = r6.A0D
            r1 = 4510(0x119e, float:6.32E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            X.1Uc r2 = r6.A0B
            if (r0 != 0) goto L_0x015f
            r0 = 2
        L_0x00fa:
            r2.A0D(r3, r0)
            return
        L_0x00fe:
            java.lang.String r0 = "DROP_QPL_LOGGING_MARKER"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x001b
            X.1Uc r0 = r6.A0B
            X.C56672sN.A00(r0, r3)
            return
        L_0x010c:
            java.lang.String r0 = "REQUEST_SUCCESS"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x001b
            X.1Uc r2 = r6.A0B
            X.C56672sN.A01(r2, r1, r3)
            java.lang.String r1 = "prefetches_started"
            java.util.List r0 = r2.A02
            r2.A0B(r0, r3, r1)
            java.lang.String r1 = "prefetches_ended"
            java.util.List r0 = r2.A01
            r2.A0B(r0, r3, r1)
            return
        L_0x012a:
            java.lang.String r0 = "PREFETCH_REQUEST_SUCCESS"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x001b
            if (r8 == 0) goto L_0x0138
            java.lang.Object r2 = r8.get(r7)
        L_0x0138:
            boolean r0 = r2 instanceof java.lang.String
            if (r0 == 0) goto L_0x001b
            if (r2 == 0) goto L_0x001b
            X.1Uc r0 = r6.A0B
            java.util.List r0 = r0.A01
            goto L_0x015b
        L_0x0143:
            java.lang.String r0 = "PREFETCH_REQUEST_START"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x001b
            if (r8 == 0) goto L_0x0151
            java.lang.Object r2 = r8.get(r7)
        L_0x0151:
            boolean r0 = r2 instanceof java.lang.String
            if (r0 == 0) goto L_0x001b
            if (r2 == 0) goto L_0x001b
            X.1Uc r0 = r6.A0B
            java.util.List r0 = r0.A02
        L_0x015b:
            r0.add(r2)
            return
        L_0x015f:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            java.lang.String r0 = "bloks_render_start"
            r2.A09(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C85734Hk.BSV(java.lang.Object):void");
    }
}
