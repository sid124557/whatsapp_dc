package X;

/* renamed from: X.5Wa  reason: invalid class name and case insensitive filesystem */
public final class C105695Wa {
    public final C620233e A00;
    public final AnonymousClass4FV A01;
    public final C183538qC A02;

    public static final Integer A00(C624134x r2) {
        int i;
        if (r2 instanceof C30481mW) {
            i = 39;
        } else {
            byte b = r2.A1I;
            if (b == 1) {
                return 2;
            }
            i = 3;
            if (b != 3) {
                if (b == 13) {
                    i = 11;
                } else if (b != 2) {
                    return null;
                } else {
                    i = 4;
                }
            }
        }
        return Integer.valueOf(i);
    }

    public C105695Wa(C620233e r1, AnonymousClass4FV r2, C183538qC r3) {
        C18260x0.A0V(r2, r1, r3);
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0170, code lost:
        if (r3 != 2) goto L_0x0172;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x017c, code lost:
        if (r3 != 2) goto L_0x017e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x00f5 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(java.lang.Boolean r8, java.lang.Integer r9, java.lang.Integer r10, java.lang.Integer r11, java.lang.String r12, java.util.List r13, int r14, boolean r15) {
        /*
            r7 = this;
            java.util.ArrayList r2 = X.C73783g4.A0c(r13)
            java.util.Iterator r3 = r13.iterator()
        L_0x0008:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0042
            X.34x r0 = X.C18300x5.A0T(r3)
            java.lang.Integer r0 = A00(r0)
            if (r0 == 0) goto L_0x003f
            int r1 = r0.intValue()
            r0 = 2
            if (r1 != r0) goto L_0x0025
            java.lang.String r0 = "photo"
        L_0x0021:
            r2.add(r0)
            goto L_0x0008
        L_0x0025:
            r0 = 3
            if (r1 != r0) goto L_0x002b
            java.lang.String r0 = "video"
            goto L_0x0021
        L_0x002b:
            r0 = 4
            if (r1 != r0) goto L_0x0031
            java.lang.String r0 = "audio"
            goto L_0x0021
        L_0x0031:
            r0 = 11
            if (r1 != r0) goto L_0x0038
            java.lang.String r0 = "gif"
            goto L_0x0021
        L_0x0038:
            r0 = 39
            if (r1 != r0) goto L_0x003f
            java.lang.String r0 = "text"
            goto L_0x0021
        L_0x003f:
            java.lang.String r0 = "other"
            goto L_0x0021
        L_0x0042:
            r1 = 0
            java.lang.String r0 = ", "
            java.lang.String r2 = X.C73723fy.A0A(r0, r2, r1)
            X.8qC r0 = r7.A02
            X.5hb r1 = X.C86644Kx.A0c(r0)
            java.lang.String r0 = "media_type"
            r1.A06(r0, r2)
            java.util.Iterator r6 = r13.iterator()
        L_0x0058:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0187
            X.34x r1 = X.C18300x5.A0T(r6)
            r4 = 2
            boolean r5 = X.AnonymousClass000.A1U(r14, r4)
            X.4sQ r2 = new X.4sQ
            r2.<init>()
            java.lang.Integer r0 = A00(r1)
            r2.A03 = r0
            X.33e r0 = r7.A00
            int r3 = r0.A02()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            if (r0 == 0) goto L_0x017e
            r0 = 3
            if (r3 == 0) goto L_0x0181
            r0 = 1
            if (r3 != r0) goto L_0x017b
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
        L_0x0088:
            r2.A02 = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r15)
            r2.A00 = r0
            X.5de r0 = r1.A0O
            if (r0 == 0) goto L_0x00a8
            int r3 = r0.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            if (r0 == 0) goto L_0x0172
            r0 = 3
            if (r3 == 0) goto L_0x0175
            r0 = 1
            if (r3 != r0) goto L_0x016f
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
        L_0x00a6:
            r2.A05 = r0
        L_0x00a8:
            r2.A04 = r9
            java.lang.Integer r0 = java.lang.Integer.valueOf(r14)
            r2.A06 = r0
            r2.A07 = r12
            X.2z0 r0 = r1.A1J
            java.lang.String r0 = r0.A01
            r2.A09 = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            r2.A01 = r0
            if (r10 == 0) goto L_0x00f5
            int r4 = r10.intValue()
            r3 = 125(0x7d, float:1.75E-43)
            switch(r4) {
                case -25: goto L_0x00ff;
                case -24: goto L_0x0102;
                case -23: goto L_0x0105;
                case -22: goto L_0x0108;
                case -21: goto L_0x010b;
                case -20: goto L_0x010e;
                case -19: goto L_0x0111;
                case -18: goto L_0x0122;
                case -17: goto L_0x0125;
                case -16: goto L_0x0128;
                case -15: goto L_0x012b;
                case -14: goto L_0x012e;
                case -13: goto L_0x00c9;
                case -12: goto L_0x0131;
                case -11: goto L_0x0134;
                case -10: goto L_0x0145;
                case -9: goto L_0x0148;
                case -8: goto L_0x014b;
                case -7: goto L_0x014e;
                case -6: goto L_0x0151;
                case -5: goto L_0x0154;
                case -4: goto L_0x00c9;
                case -3: goto L_0x0157;
                case -2: goto L_0x015a;
                case -1: goto L_0x015d;
                default: goto L_0x00c9;
            }
        L_0x00c9:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "unclassified error code: {"
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = "} subCode: {"
            r1.append(r0)
            r1.append(r11)
            java.lang.String r3 = X.AnonymousClass001.A0j(r1, r3)
        L_0x00e1:
            if (r8 == 0) goto L_0x00f3
            boolean r0 = r8.booleanValue()
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            if (r0 == 0) goto L_0x00fc
            java.lang.String r0 = "previous_session_"
        L_0x00ef:
            java.lang.String r3 = X.AnonymousClass000.A0V(r0, r3, r1)
        L_0x00f3:
            r2.A08 = r3
        L_0x00f5:
            X.4FV r0 = r7.A01
            r0.BhD(r2)
            goto L_0x0058
        L_0x00fc:
            java.lang.String r0 = "current_session_"
            goto L_0x00ef
        L_0x00ff:
            java.lang.String r3 = "crosspost_empty_media_path"
            goto L_0x00e1
        L_0x0102:
            java.lang.String r3 = "crosspost_empty_unique_id"
            goto L_0x00e1
        L_0x0105:
            java.lang.String r3 = "crosspost_entry_not_found_in_session_data"
            goto L_0x00e1
        L_0x0108:
            java.lang.String r3 = "eligibility_empty_unique_id"
            goto L_0x00e1
        L_0x010b:
            java.lang.String r3 = "eligibility_invalid_text_media_path"
            goto L_0x00e1
        L_0x010e:
            java.lang.String r3 = "eligibility_invalid_non_text_direct_url"
            goto L_0x00e1
        L_0x0111:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "eligibility_entry_state_invalid, actual state: {"
            r1.append(r0)
            r1.append(r11)
            java.lang.String r3 = X.AnonymousClass001.A0j(r1, r3)
            goto L_0x00e1
        L_0x0122:
            java.lang.String r3 = "eligibility_entry_not_found_in_session_data"
            goto L_0x00e1
        L_0x0125:
            java.lang.String r3 = "eligibility_db_map_empty"
            goto L_0x00e1
        L_0x0128:
            java.lang.String r3 = "text_status_burning_failed"
            goto L_0x00e1
        L_0x012b:
            java.lang.String r3 = "eligibility_session_data_validation_failed"
            goto L_0x00e1
        L_0x012e:
            java.lang.String r3 = "eligibility_purpose_encryption_key_validation_failed"
            goto L_0x00e1
        L_0x0131:
            java.lang.String r3 = "media_upload_cached_db_map_empty"
            goto L_0x00e1
        L_0x0134:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "media_upload_result_error: {"
            r1.append(r0)
            r1.append(r11)
            java.lang.String r3 = X.AnonymousClass001.A0j(r1, r3)
            goto L_0x00e1
        L_0x0145:
            java.lang.String r3 = "media_upload_empty_direct_url"
            goto L_0x00e1
        L_0x0148:
            java.lang.String r3 = "media_upload_media_file_not_exist"
            goto L_0x00e1
        L_0x014b:
            java.lang.String r3 = "media_upload_invalid_non_text_status_media_data"
            goto L_0x00e1
        L_0x014e:
            java.lang.String r3 = "media_upload_invalid_text_status_file_path"
            goto L_0x00e1
        L_0x0151:
            java.lang.String r3 = "media_upload_invalid_status_type"
            goto L_0x00e1
        L_0x0154:
            java.lang.String r3 = "account not linked"
            goto L_0x00e1
        L_0x0157:
            java.lang.String r3 = "crosspost_shared"
            goto L_0x00e1
        L_0x015a:
            java.lang.String r3 = "crosspost_already_sharing"
            goto L_0x00e1
        L_0x015d:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "delivery_failure with subCode: {"
            r1.append(r0)
            r1.append(r11)
            java.lang.String r3 = X.AnonymousClass001.A0j(r1, r3)
            goto L_0x00e1
        L_0x016f:
            r0 = 4
            if (r3 == r4) goto L_0x0175
        L_0x0172:
            r0 = 0
            goto L_0x00a6
        L_0x0175:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x00a6
        L_0x017b:
            r0 = 4
            if (r3 == r4) goto L_0x0181
        L_0x017e:
            r0 = 0
            goto L_0x0088
        L_0x0181:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x0088
        L_0x0187:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C105695Wa.A01(java.lang.Boolean, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.String, java.util.List, int, boolean):void");
    }
}
