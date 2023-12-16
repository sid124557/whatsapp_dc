package X;

import com.whatsapp.util.Log;

/* renamed from: X.4gw  reason: invalid class name and case insensitive filesystem */
public final class C90234gw extends C90244gx {
    public final AnonymousClass5PW A00;
    public final AnonymousClass7PS A01;
    public final C59082wK A02;
    public final C40082El A03;
    public final C29441ip A04;
    public final AnonymousClass1VX A05;
    public final C105915Wx A06;
    public final AnonymousClass31C A07;
    public final C105255Ue A08;
    public final C104705Sa A09;
    public final C147527Eq A0A = new C147527Eq();

    public void BQs(String str) {
        C162457s7.A0J(str, 0);
        this.A0A.A00.remove(str);
        A06();
        this.A09.A01(str);
        Log.e("GetCollectionsProtocol/onDeliveryFailure/delivery-error");
        this.A00.A01(this.A01, -1);
    }

    /* JADX WARNING: type inference failed for: r0v81, types: [java.lang.String] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BdM(X.AnonymousClass36K r41, java.lang.String r42) {
        /*
            r40 = this;
            r6 = 0
            r9 = r41
            r1 = r42
            X.C18270x1.A14(r1, r9)
            r5 = r40
            r5.A06()
            X.5Sa r0 = r5.A09
            r0.A02(r1)
            X.7Eq r0 = r5.A0A
            java.util.concurrent.ConcurrentHashMap r0 = r0.A00
            java.lang.Object r4 = r0.get(r1)
            X.2Ir r4 = (X.C41032Ir) r4
            X.1VX r3 = r5.A05
            r2 = 5886(0x16fe, float:8.248E-42)
            boolean r2 = r3.A0X(r2)
            if (r2 == 0) goto L_0x02fa
            if (r4 == 0) goto L_0x02fa
            java.lang.String r2 = "iq"
            X.AnonymousClass36K.A0N(r9, r2)
            X.36K r7 = r4.A00
            java.lang.String r8 = "after"
            java.lang.String r3 = "#elementValue"
            java.lang.String r4 = "collections"
            java.lang.String r2 = "paging"
            java.lang.String[] r14 = new java.lang.String[]{r4, r2, r8, r3}
            java.lang.Class<java.lang.String> r10 = java.lang.String.class
            r13 = 0
            java.lang.Long r11 = X.AnonymousClass0x2.A0T()
            java.lang.Long r12 = X.AnonymousClass0x2.A0S()
            r15 = r6
            java.lang.Object r8 = X.C626836d.A06(r9, r10, r11, r12, r13, r14, r15)
            java.lang.String r8 = (java.lang.String) r8
            r2 = 71
            X.92Z r3 = new X.92Z
            r3.<init>(r7, r2)
            java.lang.String[] r2 = new java.lang.String[r6]
            X.C626836d.A04(r9, r3, r2)
            java.lang.String r2 = "collection"
            java.lang.String[] r11 = new java.lang.String[]{r4, r2}
            r2 = 357(0x165, float:5.0E-43)
            X.92a r10 = new X.92a
            r10.<init>(r2)
            r12 = 0
            r14 = 20
            java.util.List r2 = X.C626836d.A0B(r9, r10, r11, r12, r14)
            r0.remove(r1)
            X.2El r0 = r5.A03
            r39 = r0
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x034f
            java.util.ArrayList r11 = X.AnonymousClass001.A0s()
            java.util.Iterator r19 = r2.iterator()
        L_0x0083:
            boolean r0 = r19.hasNext()
            if (r0 == 0) goto L_0x02e8
            java.lang.Object r4 = r19.next()
            X.56P r4 = (X.AnonymousClass56P) r4
            X.C162457s7.A0H(r4)
            X.C162457s7.A0J(r4, r6)
            java.lang.Object r0 = r4.A01
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r18 = X.AnonymousClass001.A0s()
            java.util.Iterator r17 = r0.iterator()
        L_0x00a1:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x0285
            java.lang.Object r0 = r17.next()
            X.6rH r0 = (X.C138956rH) r0
            java.lang.Object r3 = r0.A00
            X.56V r3 = (X.AnonymousClass56V) r3
            X.C162457s7.A0D(r3)
            X.56R r0 = r3.A08
            r7 = 0
            if (r0 == 0) goto L_0x0281
            java.lang.String r0 = r0.A00
            r31 = r0
        L_0x00bd:
            java.lang.String r0 = r3.A0C
            r26 = r0
            X.C162457s7.A0D(r26)
            java.lang.String r0 = r3.A0E
            r27 = r0
            X.C162457s7.A0D(r27)
            X.1vq r0 = r3.A01
            if (r0 == 0) goto L_0x027d
            java.lang.String r0 = r0.A00
            r28 = r0
        L_0x00d3:
            X.1vq r0 = r3.A00
            if (r0 == 0) goto L_0x027a
            java.lang.String r0 = r0.A00
            if (r0 == 0) goto L_0x027a
            X.7ny r2 = new X.7ny
            r2.<init>(r0)
        L_0x00e0:
            X.1vq r0 = r3.A02
            if (r0 == 0) goto L_0x0277
            java.lang.String r0 = r0.A00
        L_0x00e6:
            if (r2 == 0) goto L_0x00f3
            if (r0 == 0) goto L_0x00f3
            long r0 = java.lang.Long.parseLong(r0)     // Catch:{ Exception -> 0x00f6 }
            java.math.BigDecimal r32 = X.C57952uT.A00(r2, r0)     // Catch:{ Exception -> 0x00f6 }
            goto L_0x00fd
        L_0x00f3:
            r32 = r7
            goto L_0x00fd
        L_0x00f6:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            r32 = r7
            r2 = r7
        L_0x00fd:
            X.1vs r0 = r3.A06
            r9 = 0
            if (r0 != 0) goto L_0x0185
            r14 = r7
        L_0x0103:
            X.1vq r0 = r3.A03
            if (r0 == 0) goto L_0x0182
            java.lang.String r0 = r0.A00
            r30 = r0
        L_0x010b:
            X.1vq r0 = r3.A04
            if (r0 == 0) goto L_0x017f
            java.lang.String r0 = r0.A00
            r29 = r0
        L_0x0113:
            java.lang.String r0 = r3.A0D
            boolean r38 = java.lang.Boolean.parseBoolean(r0)
            java.lang.String r1 = r3.A0B
            java.lang.String r0 = "out of stock"
            boolean r0 = r0.equalsIgnoreCase(r1)
            boolean r34 = X.AnonymousClass000.A1S(r0)
            X.36K r1 = r3.A00
            java.lang.String r0 = "compliance_category"
            java.lang.String r9 = r1.A0r(r0, r7)
            java.util.List r1 = r3.A0F
            boolean r0 = X.C18310x6.A1X(r1)
            if (r0 == 0) goto L_0x0270
            java.util.ArrayList r13 = X.AnonymousClass001.A0s()
            java.util.Iterator r16 = r1.iterator()
        L_0x013d:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x01d2
            java.lang.Object r12 = r16.next()
            X.56Q r12 = (X.AnonymousClass56Q) r12
            if (r12 == 0) goto L_0x013d
            java.lang.String r0 = r12.A03
            r20 = r0
            X.C162457s7.A0D(r20)
            java.lang.String r15 = r12.A04
            X.C162457s7.A0D(r15)
            java.lang.String r10 = r12.A05
            X.C162457s7.A0D(r10)
            java.lang.Object r0 = r12.A02
            long r0 = X.C18310x6.A0B(r0)
            int r7 = (int) r0
            java.lang.Object r0 = r12.A00
            long r0 = X.C18310x6.A0B(r0)
            int r12 = (int) r0
            X.5db r0 = new X.5db
            r21 = r20
            r22 = r15
            r23 = r10
            r24 = r7
            r25 = r12
            r20 = r0
            r20.<init>(r21, r22, r23, r24, r25)
            r13.add(r0)
            goto L_0x013d
        L_0x017f:
            r29 = r7
            goto L_0x0113
        L_0x0182:
            r30 = r7
            goto L_0x010b
        L_0x0185:
            java.lang.Object r12 = r0.A00
            X.56S r12 = (X.AnonymousClass56S) r12
            java.lang.String r0 = r12.A02
            X.C162457s7.A0D(r0)
            if (r2 == 0) goto L_0x01cf
            long r0 = java.lang.Long.parseLong(r0)
            java.math.BigDecimal r10 = X.C57952uT.A00(r2, r0)     // Catch:{ IllegalArgumentException -> 0x01cf }
            java.lang.Object r1 = r12.A01
            X.1vq r1 = (X.C34801vq) r1
            java.lang.Object r0 = r12.A00
            X.1vq r0 = (X.C34801vq) r0
            if (r1 == 0) goto L_0x01c7
            if (r0 == 0) goto L_0x01c7
            java.lang.String r1 = r1.A00
            X.C162457s7.A0D(r1)
            java.lang.String r13 = r0.A00
            X.C162457s7.A0D(r13)
            java.lang.String r0 = "yyyy-MM-dd'T'HH:mmZ"
            java.text.SimpleDateFormat r12 = X.AnonymousClass0x7.A0u(r0)     // Catch:{ ParseException -> 0x01c7 }
            java.lang.String r0 = "UTC"
            java.util.TimeZone r0 = java.util.TimeZone.getTimeZone(r0)     // Catch:{ ParseException -> 0x01c7 }
            r12.setTimeZone(r0)     // Catch:{ ParseException -> 0x01c7 }
            java.util.Date r1 = r12.parse(r1)     // Catch:{ ParseException -> 0x01c7 }
            java.util.Date r0 = r12.parse(r13)     // Catch:{ ParseException -> 0x01c7 }
            r9 = r1
            goto L_0x01c8
        L_0x01c7:
            r0 = r7
        L_0x01c8:
            X.5dU r14 = new X.5dU
            r14.<init>(r2, r10, r9, r0)
            goto L_0x0103
        L_0x01cf:
            r14 = r7
            goto L_0x0103
        L_0x01d2:
            r0 = r39
            X.5Zw r7 = r0.A00
            X.36K r1 = r3.A00
            java.lang.String r0 = "compliance_info"
            X.36K r0 = r1.A0l(r0)
            X.7y0 r1 = X.C106665Zw.A01(r0)
            java.lang.String r0 = "COUNTRY_ORIGIN_EXEMPT"
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto L_0x01f2
            java.lang.String r9 = "N/A"
            r0 = 0
            X.7y0 r1 = new X.7y0
            r1.<init>(r0, r9, r0)
        L_0x01f2:
            java.lang.Long r0 = r3.A0A
            if (r0 == 0) goto L_0x026d
            long r35 = r0.longValue()
        L_0x01fa:
            X.56T r10 = r3.A09
            r0 = 0
            if (r10 == 0) goto L_0x022f
            java.lang.String r15 = r10.A03
            X.C162457s7.A0D(r15)
            X.1vq r9 = r10.A01
            if (r9 == 0) goto L_0x026a
            java.lang.String r9 = r9.A00
            r16 = r9
        L_0x020c:
            X.1vq r9 = r10.A00
            if (r9 == 0) goto L_0x0268
            java.lang.String r12 = r9.A00
        L_0x0212:
            X.6rC r9 = r10.A02
            if (r9 == 0) goto L_0x0218
            java.lang.String r0 = r9.A00
        L_0x0218:
            java.lang.String r9 = "true"
            boolean r25 = X.C162457s7.A0P(r0, r9)
            int r24 = X.AnonymousClass255.A00(r15)
            r23 = 0
            X.38u r0 = new X.38u
            r20 = r0
            r21 = r16
            r22 = r12
            r20.<init>(r21, r22, r23, r24, r25)
        L_0x022f:
            X.36K r10 = r3.A00
            java.lang.String r9 = "variant_info"
            X.36K r9 = r10.A0l(r9)
            X.5Nj r7 = r7.A01
            X.5dV r24 = r7.A00(r2, r9)
            r37 = 1
            X.5dw r7 = new X.5dw
            r21 = r1
            r22 = r0
            r23 = r14
            r25 = r2
            r33 = r13
            r20 = r7
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r37, r38)
            X.6rB r0 = r3.A07
            if (r0 == 0) goto L_0x0266
            java.lang.String r0 = r0.A00
            boolean r0 = java.lang.Boolean.parseBoolean(r0)
            X.4h8 r1 = new X.4h8
            r1.<init>(r7, r0)
        L_0x025f:
            r0 = r18
            r0.add(r1)
            goto L_0x00a1
        L_0x0266:
            r1 = r7
            goto L_0x025f
        L_0x0268:
            r12 = r0
            goto L_0x0212
        L_0x026a:
            r16 = r0
            goto L_0x020c
        L_0x026d:
            r35 = 99
            goto L_0x01fa
        L_0x0270:
            java.lang.String r0 = "Connection/Product/missing required fields."
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x00a1
        L_0x0277:
            r0 = r7
            goto L_0x00e6
        L_0x027a:
            r2 = r7
            goto L_0x00e0
        L_0x027d:
            r28 = r7
            goto L_0x00d3
        L_0x0281:
            r31 = r7
            goto L_0x00bd
        L_0x0285:
            java.lang.String r7 = r4.A02
            java.lang.String r3 = r4.A03
            java.lang.Object r10 = r4.A00
            X.56U r10 = (X.AnonymousClass56U) r10
            r9 = 0
            if (r10 != 0) goto L_0x02a8
            r0 = 0
            X.2gP r4 = new X.2gP
            r4.<init>(r0, r0, r6, r6)
        L_0x0296:
            r14 = 0
            X.2gz r0 = new X.2gz
            r12 = r0
            r13 = r4
            r15 = r7
            r16 = r3
            r17 = r18
            r12.<init>(r13, r14, r15, r16, r17)
            r11.add(r0)
            goto L_0x0083
        L_0x02a8:
            java.lang.String r1 = r10.A04
            X.C162457s7.A0D(r1)
            boolean r0 = X.C107575bX.A0F(r1)
            if (r0 != 0) goto L_0x02c5
            java.lang.String r0 = "APPROVED"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x02c5
            java.lang.String r0 = "REJECTED"
            boolean r0 = r1.equals(r0)
            int r9 = X.C18280x3.A00(r0)
        L_0x02c5:
            X.1vq r0 = r10.A02
            r4 = 0
            if (r0 == 0) goto L_0x02e6
            java.lang.String r2 = r0.A00
        L_0x02cc:
            X.1vq r0 = r10.A01
            if (r0 == 0) goto L_0x02e4
            java.lang.String r1 = r0.A00
        L_0x02d2:
            X.6rA r0 = r10.A03
            if (r0 == 0) goto L_0x02d8
            java.lang.String r4 = r0.A00
        L_0x02d8:
            java.lang.String r0 = "true"
            boolean r0 = X.C162457s7.A0P(r4, r0)
            X.2gP r4 = new X.2gP
            r4.<init>(r2, r1, r9, r0)
            goto L_0x0296
        L_0x02e4:
            r1 = r4
            goto L_0x02d2
        L_0x02e6:
            r2 = r4
            goto L_0x02cc
        L_0x02e8:
            X.C162457s7.A0D(r8)
            boolean r1 = X.C18320x8.A1U(r8)
            X.7Gs r0 = new X.7Gs
            r0.<init>(r1, r8)
            X.7Gr r3 = new X.7Gr
            r3.<init>(r0, r11)
            goto L_0x0339
        L_0x02fa:
            X.2wK r7 = r5.A02
            java.lang.String r0 = "collections"
            X.36K r3 = r9.A0l(r0)
            if (r3 == 0) goto L_0x034f
            java.lang.String r0 = "collection"
            java.util.List r0 = r3.A0s(r0)
            java.util.ArrayList r4 = X.AnonymousClass001.A0s()
            java.util.Iterator r2 = r0.iterator()
        L_0x0312:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x032a
            X.36K r1 = X.C18310x6.A0Y(r2)
            X.2gz r0 = r7.A01(r1)
            if (r0 == 0) goto L_0x0312
            X.2gz r0 = r7.A01(r1)
            r4.add(r0)
            goto L_0x0312
        L_0x032a:
            java.lang.String r0 = "paging"
            X.36K r0 = r3.A0l(r0)
            X.7Gs r0 = X.C106665Zw.A00(r0)
            X.7Gr r3 = new X.7Gr
            r3.<init>(r0, r4)
        L_0x0339:
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "GetCollectionsProtocol/onSuccess jid="
            r2.append(r0)
            X.7PS r1 = r5.A01
            com.whatsapp.jid.UserJid r0 = r1.A05
            X.C18260x0.A0m(r0, r2)
            X.5PW r0 = r5.A00
            r0.A00(r3, r1)
            return
        L_0x034f:
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "GetCollectionsProtocol/onSuccess/emptyPage jid="
            r2.append(r0)
            X.7PS r1 = r5.A01
            com.whatsapp.jid.UserJid r0 = r1.A05
            X.C18260x0.A0m(r0, r2)
            X.5PW r0 = r5.A00
            r0.A01(r1, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C90234gw.BdM(X.36K, java.lang.String):void");
    }

    public final void A06() {
        if (this.A01.A06 == null) {
            AnonymousClass316 A002 = C105255Ue.A00(this.A08, "catalog_collections_view_tag");
            if (A002 == null) {
                Log.d("BizQPLManager/endCollectionsDataSourceBlock/pref tracker not found. Have you called startPrefTracker()?");
            } else {
                A002.A09("datasource_collections");
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C90234gw(C620433g r2, AnonymousClass5PW r3, AnonymousClass7PS r4, C59082wK r5, C40082El r6, C29441ip r7, AnonymousClass1VX r8, C105915Wx r9, AnonymousClass31C r10, C105255Ue r11, C104705Sa r12) {
        super(r2, r4.A05);
        C18260x0.A0d(r11, r10, r6, r7);
        C162457s7.A0J(r2, 6);
        C18280x3.A15(r9, r12);
        C162457s7.A0J(r8, 11);
        this.A08 = r11;
        this.A07 = r10;
        this.A02 = r5;
        this.A03 = r6;
        this.A04 = r7;
        this.A01 = r4;
        this.A00 = r3;
        this.A06 = r9;
        this.A09 = r12;
        this.A05 = r8;
    }
}
