package X;

/* renamed from: X.7T4  reason: invalid class name */
public final class AnonymousClass7T4 {
    public int A00;
    public Integer A01;
    public String A02;

    public AnonymousClass7T4(Integer num, String str, int i) {
        this.A01 = num;
        this.A02 = str;
        this.A00 = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0035, code lost:
        r4.put("error_description", r1.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003c, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x008e, code lost:
        r1.append(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0032, code lost:
        X.AnonymousClass001.A1K(r0, r10, " endpoint", r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map A00(java.lang.String r10) {
        /*
            r9 = this;
            java.util.HashMap r4 = X.AnonymousClass001.A0t()
            java.lang.Integer r8 = r9.A01
            if (r8 == 0) goto L_0x000d
            java.lang.String r0 = "http_response_code"
            r4.put(r0, r8)
        L_0x000d:
            java.lang.String r1 = r9.A02
            if (r1 == 0) goto L_0x0016
            java.lang.String r0 = "exception_name"
            r4.put(r0, r1)
        L_0x0016:
            int r7 = r9.A00
            java.lang.String r6 = "http_error"
            java.lang.String r5 = "response_data_error"
            java.lang.String r0 = "network_error"
            java.lang.String r3 = " endpoint"
            java.lang.String r2 = "error_description"
            java.lang.String r1 = "error_type"
            switch(r7) {
                case 0: goto L_0x00a8;
                case 1: goto L_0x009c;
                case 2: goto L_0x0092;
                case 3: goto L_0x0083;
                case 4: goto L_0x0079;
                case 5: goto L_0x006f;
                case 6: goto L_0x0063;
                case 7: goto L_0x0059;
                case 8: goto L_0x004d;
                case 9: goto L_0x003d;
                default: goto L_0x0027;
            }
        L_0x0027:
            java.lang.String r0 = "unknown_error"
            r4.put(r1, r0)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Unknown error in "
        L_0x0032:
            X.AnonymousClass001.A1K(r0, r10, r3, r1)
        L_0x0035:
            java.lang.String r0 = r1.toString()
            r4.put(r2, r0)
            return r4
        L_0x003d:
            r4.put(r1, r6)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r10)
            java.lang.String r0 = " endpoint's HTTP request is failed with http code: "
            r1.append(r0)
            r1.append(r8)
            goto L_0x0035
        L_0x004d:
            java.lang.String r0 = "connection_error"
            r4.put(r1, r0)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Error in connecting to "
            goto L_0x0032
        L_0x0059:
            r4.put(r1, r5)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Error in parsing the network response of "
            goto L_0x0032
        L_0x0063:
            java.lang.String r0 = "general_exception"
            r4.put(r1, r0)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "General exception in "
            goto L_0x0032
        L_0x006f:
            r4.put(r1, r6)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r10)
            java.lang.String r0 = " endpoint's HTTP request is trying to reach a Gone server"
            goto L_0x008e
        L_0x0079:
            r4.put(r1, r5)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r10)
            java.lang.String r0 = " endpoint response is empty"
            goto L_0x008e
        L_0x0083:
            java.lang.String r0 = "timeout_error"
            r4.put(r1, r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r10)
            java.lang.String r0 = " endpoint's request is timed out"
        L_0x008e:
            r1.append(r0)
            goto L_0x0035
        L_0x0092:
            r4.put(r1, r0)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Network error is identified by Graph API Network Library before staring network request to "
            goto L_0x0032
        L_0x009c:
            java.lang.String r0 = "request_data_error"
            r4.put(r1, r0)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Error in parsing the request parameter of "
            goto L_0x0032
        L_0x00a8:
            r4.put(r1, r0)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Network error is identified by ACS token generator client library in "
            goto L_0x0032
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7T4.A00(java.lang.String):java.util.Map");
    }
}
