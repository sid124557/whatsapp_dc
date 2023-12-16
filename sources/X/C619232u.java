package X;

/* renamed from: X.32u  reason: invalid class name and case insensitive filesystem */
public abstract class C619232u {
    public String A00;
    public boolean A01;

    public static final AnonymousClass39A A00(AnonymousClass1ER r6, String str) {
        AnonymousClass207 r1;
        String str2;
        String str3;
        AnonymousClass1EE r0;
        C172548Lq r02;
        if ((r6.bitField0_ & 1) == 0) {
            return null;
        }
        AnonymousClass1DR r3 = r6.header_;
        if (r3 == null) {
            r3 = AnonymousClass1DR.DEFAULT_INSTANCE;
        }
        int i = r3.mediaCase_;
        if (i == 0) {
            r1 = AnonymousClass207.MEDIA_NOT_SET;
        } else if (i == 3) {
            r1 = AnonymousClass207.DOCUMENT_MESSAGE;
        } else if (i == 4) {
            r1 = AnonymousClass207.IMAGE_MESSAGE;
        } else if (i == 6) {
            r1 = AnonymousClass207.JPEG_THUMBNAIL;
        } else if (i == 7) {
            r1 = AnonymousClass207.VIDEO_MESSAGE;
        } else if (i != 8) {
            r1 = null;
        } else {
            r1 = AnonymousClass207.LOCATION_MESSAGE;
        }
        if (!r3.hasMediaAttachment_ || r1 != AnonymousClass207.MEDIA_NOT_SET) {
            if (r1 == AnonymousClass207.JPEG_THUMBNAIL) {
                str2 = r3.title_;
                str3 = r3.subtitle_;
                if (i == 6) {
                    r02 = (C172548Lq) r3.media_;
                } else {
                    r02 = C172548Lq.A01;
                }
            } else if (r1 != AnonymousClass207.IMAGE_MESSAGE || (!AnonymousClass34T.A01(r6) && !"catalog_message".equals(str))) {
                return new AnonymousClass39A(r3.title_, (byte[]) null, r3.subtitle_);
            } else {
                str2 = r3.title_;
                str3 = r3.subtitle_;
                if (r3.mediaCase_ == 4) {
                    r0 = (AnonymousClass1EE) r3.media_;
                } else {
                    r0 = AnonymousClass1EE.DEFAULT_INSTANCE;
                }
                r02 = r0.jpegThumbnail_;
            }
            return new AnonymousClass39A(str2, r02.A07(), str3);
        }
        throw AnonymousClass24W.A01(C18320x8.A0X(), "media not set");
    }

    public static final String A01(AnonymousClass1ER r1) {
        if ((r1.bitField0_ & 4) == 0) {
            return null;
        }
        AnonymousClass1AO r0 = r1.footer_;
        if (r0 == null) {
            r0 = AnonymousClass1AO.DEFAULT_INSTANCE;
        }
        return r0.text_;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0213, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0222, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0223, code lost:
        r1 = X.C55682qk.A03(r0.A00, "JsonPayloadForNativeFlowMPMIsMalformed", X.AnonymousClass000.A0P(r2, "Malformed params_json payload detected. error: ", X.AnonymousClass001.A0o()), true);
        r1.append("MPMNativeFlowContentFactory/parseE2EProductListInfo/invalid or missing fields in button_params_json=");
        X.C18260x0.A15(r8.buttonParamsJson_, r1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00ed, code lost:
        if (r3.isEmpty() != false) goto L_0x00ef;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0222 A[ExcHandler: JSONException (r2v13 'e' org.json.JSONException A[CUSTOM_DECLARE]), Splitter:B:55:0x0104] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass39W A02(X.AnonymousClass1ER r24) {
        /*
            r23 = this;
            r0 = r23
            boolean r2 = r0 instanceof X.AnonymousClass1pF
            r1 = r24
            if (r2 == 0) goto L_0x0052
            r3 = 0
            java.lang.String r2 = r0.A00
            X.39A r5 = A00(r1, r2)
            java.lang.String r6 = r0.A03(r1, r3)
            int r2 = r1.interactiveMessageCase_
            r0 = 4
            if (r2 != r0) goto L_0x004f
            java.lang.Object r4 = r1.interactiveMessage_
            X.1C8 r4 = (X.AnonymousClass1C8) r4
        L_0x001c:
            if (r4 == 0) goto L_0x004d
            java.lang.String r3 = r4.id_
            int r1 = r4.surface_
            if (r1 == 0) goto L_0x004a
            r0 = 1
            if (r1 == r0) goto L_0x0047
            r0 = 2
            if (r1 == r0) goto L_0x0044
            r0 = 3
            if (r1 != r0) goto L_0x004a
            X.22z r0 = X.C375322z.WA
        L_0x002f:
            int r0 = r0.ordinal()
            int r2 = X.C18300x5.A02(r0)
            int r1 = r4.messageVersion_
            X.38r r0 = new X.38r
            r0.<init>(r3, r2, r1)
        L_0x003e:
            X.39W r1 = new X.39W
            r1.<init>(r5, r0, r6)
            return r1
        L_0x0044:
            X.22z r0 = X.C375322z.IG
            goto L_0x002f
        L_0x0047:
            X.22z r0 = X.C375322z.FB
            goto L_0x002f
        L_0x004a:
            X.22z r0 = X.C375322z.UNKNOWN_SURFACE
            goto L_0x002f
        L_0x004d:
            r0 = 0
            goto L_0x003e
        L_0x004f:
            X.1C8 r4 = X.AnonymousClass1C8.DEFAULT_INSTANCE
            goto L_0x001c
        L_0x0052:
            boolean r2 = r0 instanceof X.AnonymousClass1pJ
            if (r2 == 0) goto L_0x00c2
            X.1pJ r0 = (X.AnonymousClass1pJ) r0
            r2 = 0
            X.C162457s7.A0J(r1, r2)
            java.lang.String r3 = r0.A00
            java.lang.String r2 = "catalog_message"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0095
            r6 = 1
        L_0x0067:
            X.39A r7 = A00(r1, r3)
            boolean r2 = r0.A00
            java.lang.String r9 = r0.A03(r1, r2)
            java.lang.String r10 = A01(r1)
            java.lang.String r11 = ""
            X.1C7 r2 = r1.A0N()
            java.util.List r4 = X.AnonymousClass34T.A00(r2)
            X.1C7 r2 = r1.A0N()
            java.lang.String r3 = r2.messageParamsJson_
            r2 = 2
            if (r2 != r6) goto L_0x00a9
            X.2Y8 r2 = r0.A01
            X.1C7 r0 = r1.A0N()
            java.lang.String r0 = r0.messageParamsJson_
            X.C162457s7.A0D(r0)
            r5 = 0
            goto L_0x00a0
        L_0x0095:
            java.lang.String r2 = "form_message"
            boolean r2 = r2.equals(r3)
            int r6 = X.C18310x6.A02(r2)
            goto L_0x0067
        L_0x00a0:
            org.json.JSONObject r0 = X.AnonymousClass0x9.A1H(r0)     // Catch:{ JSONException -> 0x00ab }
            java.util.List r5 = r2.A00(r0, r5)     // Catch:{ JSONException -> 0x00ab }
            goto L_0x00b5
        L_0x00a9:
            r5 = 0
            goto L_0x00b5
        L_0x00ab:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "ElementsParser/parse error "
            X.C18260x0.A1P(r1, r0, r2)
        L_0x00b5:
            r2 = 0
            X.39P r1 = new X.39P
            r1.<init>(r2, r3, r4, r5, r6)
            X.39W r6 = new X.39W
            r8 = r1
            r6.<init>((X.AnonymousClass39A) r7, (X.AnonymousClass39P) r8, (java.lang.String) r9, (java.lang.String) r10, (java.lang.String) r11)
            return r6
        L_0x00c2:
            boolean r2 = r0 instanceof X.AnonymousClass1pI
            if (r2 == 0) goto L_0x024d
            X.1pI r0 = (X.AnonymousClass1pI) r0
            r9 = 0
            java.lang.String r2 = r0.A00
            X.39A r6 = A00(r1, r2)
            java.lang.String r18 = r0.A03(r1, r9)
            if (r18 != 0) goto L_0x00d7
            java.lang.String r18 = ""
        L_0x00d7:
            java.lang.String r19 = A01(r1)
            java.lang.String r20 = ""
            X.3d3 r21 = X.C72023d3.A00
            X.1C7 r1 = r1.A0N()
            X.8ya r3 = r1.buttons_
            r10 = 1
            if (r3 == 0) goto L_0x00ef
            boolean r2 = r3.isEmpty()
            r1 = 0
            if (r2 == 0) goto L_0x00f0
        L_0x00ef:
            r1 = 1
        L_0x00f0:
            r17 = 0
            if (r1 != 0) goto L_0x0242
            if (r6 == 0) goto L_0x0101
            byte[] r5 = r6.A02
        L_0x00f8:
            java.lang.Object r8 = r3.get(r9)
            X.1BH r8 = (X.AnonymousClass1BH) r8
            r16 = r20
            goto L_0x0104
        L_0x0101:
            r5 = r17
            goto L_0x00f8
        L_0x0104:
            java.lang.String r1 = r8.buttonParamsJson_     // Catch:{ JSONException -> 0x0222, 24P -> 0x0215 }
            org.json.JSONObject r4 = X.AnonymousClass0x9.A1H(r1)     // Catch:{ JSONException -> 0x0222, 24P -> 0x0215 }
            java.lang.String r1 = "thumbnail_product_id"
            java.lang.String r3 = r4.optString(r1)     // Catch:{ JSONException -> 0x0222, 24P -> 0x0215 }
            java.lang.String r1 = "business_owner_jid"
            java.lang.String r16 = X.C18300x5.A0l(r1, r4)     // Catch:{ JSONException -> 0x0222, 24P -> 0x0215 }
            int r1 = r16.length()     // Catch:{ JSONException -> 0x0222, 24P -> 0x0213 }
            if (r1 != 0) goto L_0x0126
            X.2qk r7 = r0.A00     // Catch:{ JSONException -> 0x0222, 24P -> 0x0213 }
            java.lang.String r2 = "JsonPayloadForNativeFlowMPMIsMissingRequiredData"
            java.lang.String r1 = "businessOwnerJID is empty when businessOwnerJID is a required field"
            r7.A0A(r2, r10, r1)     // Catch:{ JSONException -> 0x0222, 24P -> 0x0213 }
        L_0x0126:
            X.39B r7 = new X.39B     // Catch:{ JSONException -> 0x0222, 24P -> 0x0213 }
            r7.<init>(r5, r3, r9)     // Catch:{ JSONException -> 0x0222, 24P -> 0x0213 }
            byte[] r1 = r7.A02     // Catch:{ JSONException -> 0x0222, 24P -> 0x0213 }
            if (r1 == 0) goto L_0x0132
            int r1 = r1.length     // Catch:{ JSONException -> 0x0222, 24P -> 0x0213 }
            if (r1 != 0) goto L_0x013b
        L_0x0132:
            X.2qk r3 = r0.A00     // Catch:{ JSONException -> 0x0222, 24P -> 0x0213 }
            java.lang.String r2 = "NativeFlowMPMIsMissingThumbnailJpegData"
            java.lang.String r1 = "Error: thumbnail jpeg data is null or an empty byte array, so valid thumbnail jpeg is missing from payload"
            r3.A0A(r2, r10, r1)     // Catch:{ JSONException -> 0x0222, 24P -> 0x0213 }
        L_0x013b:
            java.lang.String r1 = r7.A01     // Catch:{ JSONException -> 0x0222, 24P -> 0x0213 }
            X.C162457s7.A0C(r1)     // Catch:{ JSONException -> 0x0222, 24P -> 0x0213 }
            int r1 = r1.length()     // Catch:{ JSONException -> 0x0222, 24P -> 0x0213 }
            if (r1 != 0) goto L_0x014f
            X.2qk r3 = r0.A00     // Catch:{ JSONException -> 0x0222, 24P -> 0x0213 }
            java.lang.String r2 = "NativeFlowMPMIsMissingThumbnailProductId"
            java.lang.String r1 = "Error: thumbnail product id is empty string, so valid thumbnail product id is missing from payload"
            r3.A0A(r2, r10, r1)     // Catch:{ JSONException -> 0x0222, 24P -> 0x0213 }
        L_0x014f:
            java.lang.String r1 = "sections"
            org.json.JSONArray r5 = r4.optJSONArray(r1)     // Catch:{ JSONException -> 0x0222, 24P -> 0x0213 }
            if (r5 != 0) goto L_0x015b
            r4 = r21
            goto L_0x01b9
        L_0x015b:
            X.8U9 r15 = new X.8U9     // Catch:{ JSONException -> 0x0222, 24P -> 0x0213 }
            r15.<init>()     // Catch:{ JSONException -> 0x0222, 24P -> 0x0213 }
            int r14 = r5.length()     // Catch:{ JSONException -> 0x0222, 24P -> 0x0213 }
        L_0x0164:
            if (r9 >= r14) goto L_0x01b5
            org.json.JSONObject r2 = r5.optJSONObject(r9)     // Catch:{ JSONException -> 0x0222, 24P -> 0x0213 }
            if (r2 == 0) goto L_0x01b2
            java.lang.String r1 = "title"
            java.lang.String r13 = r2.optString(r1)     // Catch:{ JSONException -> 0x0222, 24P -> 0x0213 }
            java.lang.String r1 = "product_items"
            org.json.JSONArray r4 = r2.optJSONArray(r1)     // Catch:{ JSONException -> 0x0222, 24P -> 0x0213 }
            if (r4 == 0) goto L_0x01b2
            X.8U9 r12 = new X.8U9     // Catch:{ JSONException -> 0x0222, 24P -> 0x0213 }
            r12.<init>()     // Catch:{ JSONException -> 0x0222, 24P -> 0x0213 }
            int r11 = r4.length()     // Catch:{ JSONException -> 0x0222, 24P -> 0x0213 }
            r3 = 0
        L_0x0186:
            if (r3 >= r11) goto L_0x01a6
            org.json.JSONObject r2 = r4.optJSONObject(r3)     // Catch:{ JSONException -> 0x0222, 24P -> 0x0213 }
            if (r2 == 0) goto L_0x01a3
            java.lang.String r1 = "product_retailer_id"
            java.lang.String r2 = r2.optString(r1)     // Catch:{ JSONException -> 0x0222, 24P -> 0x0213 }
            int r1 = X.AnonymousClass0x7.A06(r2)     // Catch:{ JSONException -> 0x0222, 24P -> 0x0213 }
            if (r1 <= 0) goto L_0x01a3
            X.392 r1 = new X.392     // Catch:{ JSONException -> 0x0222, 24P -> 0x0213 }
            r1.<init>((java.lang.String) r2)     // Catch:{ JSONException -> 0x0222, 24P -> 0x0213 }
            r12.add(r1)     // Catch:{ JSONException -> 0x0222, 24P -> 0x0213 }
        L_0x01a3:
            int r3 = r3 + 1
            goto L_0x0186
        L_0x01a6:
            java.util.List r2 = X.C159507lx.A0h(r12)     // Catch:{ JSONException -> 0x0222, 24P -> 0x0213 }
            X.396 r1 = new X.396     // Catch:{ JSONException -> 0x0222, 24P -> 0x0213 }
            r1.<init>(r13, r2)     // Catch:{ JSONException -> 0x0222, 24P -> 0x0213 }
            r15.add(r1)     // Catch:{ JSONException -> 0x0222, 24P -> 0x0213 }
        L_0x01b2:
            int r9 = r9 + 1
            goto L_0x0164
        L_0x01b5:
            java.util.List r4 = X.C159507lx.A0h(r15)     // Catch:{ JSONException -> 0x0222, 24P -> 0x0213 }
        L_0x01b9:
            boolean r1 = r4.isEmpty()     // Catch:{ JSONException -> 0x0222, 24P -> 0x0213 }
            if (r1 == 0) goto L_0x01d2
            X.2qk r3 = r0.A00     // Catch:{ JSONException -> 0x0222, 24P -> 0x0213 }
            java.lang.String r2 = "Error: parsedProductListInfo is an empty list"
            java.lang.String r1 = "JsonPayloadForNativeFlowMPMIsMissingRequiredData"
            r3.A0A(r1, r10, r2)     // Catch:{ JSONException -> 0x0222, 24P -> 0x0213 }
        L_0x01c8:
            com.whatsapp.jid.UserJid r2 = X.AnonymousClass32Y.A09(r16)     // Catch:{ JSONException -> 0x0222, 24P -> 0x0213 }
            X.39E r1 = new X.39E     // Catch:{ JSONException -> 0x0222, 24P -> 0x0213 }
            r1.<init>(r2, r7, r4)     // Catch:{ JSONException -> 0x0222, 24P -> 0x0213 }
            goto L_0x0240
        L_0x01d2:
            java.util.Iterator r9 = r4.iterator()     // Catch:{ JSONException -> 0x0222, 24P -> 0x0213 }
            r5 = r20
            r2 = 0
        L_0x01d9:
            boolean r1 = r9.hasNext()     // Catch:{ JSONException -> 0x0222, 24P -> 0x0213 }
            if (r1 == 0) goto L_0x01fb
            int r3 = r2 + 1
            java.lang.Object r1 = r9.next()     // Catch:{ JSONException -> 0x0222, 24P -> 0x0213 }
            X.396 r1 = (X.AnonymousClass396) r1     // Catch:{ JSONException -> 0x0222, 24P -> 0x0213 }
            java.util.List r1 = r1.A01     // Catch:{ JSONException -> 0x0222, 24P -> 0x0213 }
            boolean r1 = r1.isEmpty()     // Catch:{ JSONException -> 0x0222, 24P -> 0x0213 }
            if (r1 == 0) goto L_0x01f9
            java.lang.StringBuilder r2 = X.C18270x1.A0W(r2, r5)     // Catch:{ JSONException -> 0x0222, 24P -> 0x0213 }
            java.lang.String r1 = ", "
            java.lang.String r5 = X.AnonymousClass000.A0X(r1, r2)     // Catch:{ JSONException -> 0x0222, 24P -> 0x0213 }
        L_0x01f9:
            r2 = r3
            goto L_0x01d9
        L_0x01fb:
            int r1 = r5.length()     // Catch:{ JSONException -> 0x0222, 24P -> 0x0213 }
            if (r1 == 0) goto L_0x01c8
            X.2qk r3 = r0.A00     // Catch:{ JSONException -> 0x0222, 24P -> 0x0213 }
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ JSONException -> 0x0222, 24P -> 0x0213 }
            java.lang.String r1 = "Error: parsedProductListInfo has empty product sections at indices: "
            java.lang.String r2 = X.AnonymousClass000.A0V(r1, r5, r2)     // Catch:{ JSONException -> 0x0222, 24P -> 0x0213 }
            java.lang.String r1 = "JsonPayloadForNativeFlowMPMIsMissingRequiredData"
            r3.A0A(r1, r10, r2)     // Catch:{ JSONException -> 0x0222, 24P -> 0x0213 }
            goto L_0x01c8
        L_0x0213:
            r3 = move-exception
            goto L_0x0216
        L_0x0215:
            r3 = move-exception
        L_0x0216:
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "MPMNativeFlowContentFactory/parseE2EProductListInfo/invalid JID="
            r0 = r16
            X.C18260x0.A0u(r1, r0, r2, r3)
            goto L_0x0242
        L_0x0222:
            r2 = move-exception
            X.2qk r3 = r0.A00
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Malformed params_json payload detected. error: "
            java.lang.String r1 = X.AnonymousClass000.A0P(r2, r0, r1)
            java.lang.String r0 = "JsonPayloadForNativeFlowMPMIsMalformed"
            java.lang.StringBuilder r1 = X.C55682qk.A03(r3, r0, r1, r10)
            java.lang.String r0 = "MPMNativeFlowContentFactory/parseE2EProductListInfo/invalid or missing fields in button_params_json="
            r1.append(r0)
            java.lang.String r0 = r8.buttonParamsJson_
            X.C18260x0.A15(r0, r1, r2)
            goto L_0x0242
        L_0x0240:
            r17 = r1
        L_0x0242:
            r15 = 0
            r22 = 6
            X.39W r14 = new X.39W
            r16 = r6
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22)
            return r14
        L_0x024d:
            boolean r2 = r0 instanceof X.AnonymousClass1pH
            if (r2 == 0) goto L_0x02a1
            X.1pH r0 = (X.AnonymousClass1pH) r0
            r3 = 0
            java.lang.String r2 = r0.A00
            X.39A r5 = A00(r1, r2)
            java.lang.String r7 = r0.A03(r1, r3)
            java.lang.String r8 = A01(r1)
            X.1C7 r2 = r1.A0N()
            java.lang.String r4 = X.C18300x5.A0j(r2)
            if (r5 == 0) goto L_0x0294
            byte[] r3 = r5.A02
        L_0x026e:
            X.32a r2 = r0.A00
            r0 = 1
            X.39S r4 = X.C626535y.A02(r2, r4, r3, r0)
            if (r4 == 0) goto L_0x0296
            X.39H r0 = r4.A07
            java.lang.String r0 = r0.A01
            int r0 = X.AnonymousClass39S.A00(r0)
            if (r0 == 0) goto L_0x0296
            X.1C7 r0 = r1.A0N()
            java.util.List r0 = X.AnonymousClass34T.A00(r0)
            X.39P r6 = new X.39P
            r6.<init>((java.util.List) r0)
            X.39W r3 = new X.39W
            r3.<init>((X.AnonymousClass39S) r4, (X.AnonymousClass39A) r5, (X.AnonymousClass39P) r6, (java.lang.String) r7, (java.lang.String) r8)
            return r3
        L_0x0294:
            r3 = 0
            goto L_0x026e
        L_0x0296:
            java.lang.Integer r1 = X.C18320x8.A0X()
            java.lang.String r0 = "Order status: unknown status"
            X.24W r0 = X.AnonymousClass24W.A01(r1, r0)
            throw r0
        L_0x02a1:
            X.1pG r0 = (X.AnonymousClass1pG) r0
            r9 = 0
            r2 = 0
            X.39A r6 = A00(r1, r2)
            java.lang.String r5 = r0.A03(r1, r9)
            java.lang.String r4 = A01(r1)
            int r3 = r1.interactiveMessageCase_
            r2 = 7
            if (r3 != r2) goto L_0x030a
            java.lang.Object r1 = r1.interactiveMessage_
            X.1BG r1 = (X.AnonymousClass1BG) r1
        L_0x02ba:
            X.8ya r8 = r1.cards_
            java.util.ArrayList r7 = X.AnonymousClass001.A0s()
            X.C162457s7.A0H(r8)
            boolean r1 = r8 instanceof java.util.Collection
            if (r1 == 0) goto L_0x02ea
            boolean r1 = r8.isEmpty()
            if (r1 == 0) goto L_0x02ea
        L_0x02cd:
            java.util.Iterator r3 = r8.iterator()
        L_0x02d1:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x030d
            java.lang.Object r2 = r3.next()
            X.1ER r2 = (X.AnonymousClass1ER) r2
            X.1pJ r1 = r0.A00
            X.C162457s7.A0H(r2)
            X.39W r1 = r1.A02(r2)
            r7.add(r1)
            goto L_0x02d1
        L_0x02ea:
            java.util.Iterator r3 = r8.iterator()
        L_0x02ee:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x02cd
            java.lang.Object r1 = r3.next()
            X.1ER r1 = (X.AnonymousClass1ER) r1
            int r2 = r1.interactiveMessageCase_
            r1 = 6
            if (r2 == r1) goto L_0x02ee
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            java.lang.String r0 = "Some of the cards of the carousel msg are not native flow message"
            X.24W r0 = X.AnonymousClass24W.A01(r1, r0)
            throw r0
        L_0x030a:
            X.1BG r1 = X.AnonymousClass1BG.DEFAULT_INSTANCE
            goto L_0x02ba
        L_0x030d:
            X.38e r0 = new X.38e
            r0.<init>(r7)
            X.39W r1 = new X.39W
            r1.<init>(r6, r0, r5, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C619232u.A02(X.1ER):X.39W");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0047, code lost:
        if ("form_message".equals(r1) == false) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000e, code lost:
        if (r2 == null) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String A03(X.AnonymousClass1ER r6, boolean r7) {
        /*
            r5 = this;
            int r0 = r6.bitField0_
            r0 = r0 & 2
            if (r0 == 0) goto L_0x007d
            X.1AN r0 = r6.body_
            if (r0 != 0) goto L_0x000c
            X.1AN r0 = X.AnonymousClass1AN.DEFAULT_INSTANCE
        L_0x000c:
            java.lang.String r2 = r0.text_
            if (r2 != 0) goto L_0x007f
        L_0x0010:
            X.20G r1 = r6.A0M()
            X.20G r0 = X.AnonymousClass20G.SHOP_STOREFRONT_MESSAGE
            if (r1 == r0) goto L_0x007f
            boolean r0 = X.AnonymousClass34T.A01(r6)
            if (r0 != 0) goto L_0x007f
            X.34T r3 = X.AnonymousClass34T.A00
            int r1 = r6.interactiveMessageCase_
            r0 = 6
            if (r1 != r0) goto L_0x0049
            X.1C7 r4 = r6.A0N()
            if (r4 == 0) goto L_0x007b
            X.8ya r0 = r4.buttons_
            int r1 = r0.size()
            r0 = 1
            if (r1 != r0) goto L_0x007b
            r1 = 0
            X.8ya r0 = r4.buttons_
            java.lang.Object r0 = r0.get(r1)
            X.1BH r0 = (X.AnonymousClass1BH) r0
            if (r0 == 0) goto L_0x007b
            java.lang.String r1 = r0.name_
        L_0x0041:
            java.lang.String r0 = "form_message"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x007f
        L_0x0049:
            java.lang.String r0 = "review_order"
            boolean r0 = r3.A02(r6, r0)
            if (r0 != 0) goto L_0x007f
            java.lang.String r0 = "payment_method"
            boolean r0 = r3.A02(r6, r0)
            if (r0 != 0) goto L_0x007f
            java.lang.String r0 = "payment_status"
            boolean r0 = r3.A02(r6, r0)
            if (r0 != 0) goto L_0x007f
            int r1 = r6.interactiveMessageCase_
            r0 = 7
            if (r1 == r0) goto L_0x007f
            if (r7 != 0) goto L_0x007f
            boolean r0 = r5.A01
            if (r0 != 0) goto L_0x007f
            java.lang.Integer r1 = X.C18320x8.A0X()
            java.lang.String r0 = "missing body"
            X.24W r0 = X.AnonymousClass24W.A01(r1, r0)
            throw r0
        L_0x007b:
            r1 = 0
            goto L_0x0041
        L_0x007d:
            r2 = 0
            goto L_0x0010
        L_0x007f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C619232u.A03(X.1ER, boolean):java.lang.String");
    }
}
