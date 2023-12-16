package X;

/* renamed from: X.2x5  reason: invalid class name and case insensitive filesystem */
public class C59542x5 {
    public final C56972sr A00;
    public final C56612sH A01;
    public final AnonymousClass1VX A02;
    public final C183538qC A03;

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001c, code lost:
        if (r0.equals(r3) == false) goto L_0x001e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0355  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x039b  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x0449  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass1EF A02(X.AnonymousClass3Z2 r10, X.C624134x r11, byte[] r12, boolean r13) {
        /*
            r9 = this;
            X.1EF r0 = X.AnonymousClass1EF.DEFAULT_INSTANCE
            X.6c9 r2 = r0.A0G()
            X.15x r2 = (X.AnonymousClass15x) r2
            X.34x r5 = r11.A0w()
            if (r5 == 0) goto L_0x00a4
            X.2z0 r0 = r11.A1J
            X.4uZ r0 = r0.A00
            if (r0 == 0) goto L_0x001e
            X.2z0 r4 = r5.A1J
            X.4uZ r3 = r4.A00
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x0035
        L_0x001e:
            X.2z0 r4 = r5.A1J
            X.4uZ r3 = r4.A00
            java.lang.String r6 = X.C627336j.A07(r3)
            X.1EF r1 = X.C18300x5.A0Q(r2)
            r6.getClass()
            int r0 = r1.bitField0_
            r0 = r0 | 8
            r1.bitField0_ = r0
            r1.remoteJid_ = r6
        L_0x0035:
            boolean r0 = r5 instanceof X.C30941nT
            if (r0 != 0) goto L_0x0111
            boolean r0 = r4.A02
            if (r0 == 0) goto L_0x0100
            X.2sr r0 = r9.A00
            com.whatsapp.jid.PhoneUserJid r0 = X.C56972sr.A04(r0)
        L_0x0043:
            if (r0 == 0) goto L_0x0058
            java.lang.String r3 = r0.getRawString()
            X.1EF r1 = X.C18300x5.A0Q(r2)
            r3.getClass()
            int r0 = r1.bitField0_
            r0 = r0 | 2
            r1.bitField0_ = r0
            r1.participant_ = r3
        L_0x0058:
            java.lang.String r3 = r4.A01
            X.1EF r1 = X.C18300x5.A0Q(r2)
            r3.getClass()
            int r0 = r1.bitField0_
            r0 = r0 | 1
            r1.bitField0_ = r0
            r1.stanzaId_ = r3
            X.6cX r0 = r2.A00
            X.1EF r0 = (X.AnonymousClass1EF) r0
            X.1EU r0 = r0.quotedMessage_
            if (r0 != 0) goto L_0x0073
            X.1EU r0 = X.AnonymousClass1EU.DEFAULT_INSTANCE
        L_0x0073:
            X.6c9 r3 = r0.A0H()
            X.1A4 r3 = (X.AnonymousClass1A4) r3
            X.2cu r1 = X.C47222cu.A00(r3)
            r0 = 1
            r1.A04 = r0
            r1.A02 = r13
            X.2pg r1 = r1.A01()
            X.8qC r0 = r9.A03
            java.lang.Object r0 = r0.get()
            X.3Le r0 = (X.C66383Le) r0
            r0.A01(r1, r5)
            X.1EF r1 = X.C18300x5.A0Q(r2)
            X.1EU r0 = X.AnonymousClass0x9.A0W(r3)
            r0.getClass()
            r1.quotedMessage_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 4
            r1.bitField0_ = r0
        L_0x00a4:
            boolean r0 = r11.A1m()
            if (r0 == 0) goto L_0x0173
            java.util.List r0 = r11.A18
            X.C626936e.A06(r0)
            java.util.ArrayList r6 = X.AnonymousClass001.A0s()
            java.util.ArrayList r5 = X.AnonymousClass001.A0s()
            java.util.Iterator r8 = r0.iterator()
        L_0x00bb:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0137
            java.lang.Object r3 = r8.next()
            X.3ZM r3 = (X.AnonymousClass3ZM) r3
            X.4uZ r1 = r3.A00
            boolean r0 = r1 instanceof com.whatsapp.jid.UserJid
            if (r0 == 0) goto L_0x00d1
            r6.add(r1)
            goto L_0x00bb
        L_0x00d1:
            java.lang.String r7 = r1.getRawString()
            java.lang.String r4 = r3.A01
            X.1B6 r0 = X.AnonymousClass1B6.DEFAULT_INSTANCE
            X.6c9 r3 = X.C18300x5.A0K(r0)
            X.6cX r1 = r3.A00
            X.1B6 r1 = (X.AnonymousClass1B6) r1
            r7.getClass()
            int r0 = r1.bitField0_
            r0 = r0 | 1
            r1.bitField0_ = r0
            r1.groupJid_ = r7
            if (r4 == 0) goto L_0x00fc
            X.6cX r1 = X.C18320x8.A0C(r3)
            X.1B6 r1 = (X.AnonymousClass1B6) r1
            int r0 = r1.bitField0_
            r0 = r0 | 2
            r1.bitField0_ = r0
            r1.groupSubject_ = r4
        L_0x00fc:
            X.C18320x8.A1B(r3, r5)
            goto L_0x00bb
        L_0x0100:
            X.4uZ r1 = r5.A0n()
            if (r1 == 0) goto L_0x010b
            boolean r0 = r1 instanceof X.AnonymousClass1fS
            if (r0 != 0) goto L_0x010b
            r3 = r1
        L_0x010b:
            com.whatsapp.jid.UserJid r0 = X.AnonymousClass32Y.A03(r3)
            goto L_0x0043
        L_0x0111:
            X.1nT r5 = (X.C30941nT) r5
            java.lang.String r4 = r5.A00
            if (r4 == 0) goto L_0x0124
            X.1EF r3 = X.C18300x5.A0Q(r2)
            int r1 = r3.bitField0_
            r0 = 1048576(0x100000, float:1.469368E-39)
            r1 = r1 | r0
            r3.bitField0_ = r1
            r3.groupSubject_ = r4
        L_0x0124:
            java.lang.String r4 = r5.A01
            if (r4 == 0) goto L_0x00a4
            X.1EF r3 = X.C18300x5.A0Q(r2)
            int r1 = r3.bitField0_
            r0 = 2097152(0x200000, float:2.938736E-39)
            r1 = r1 | r0
            r3.bitField0_ = r1
            r3.parentGroupJid_ = r4
            goto L_0x00a4
        L_0x0137:
            X.C626936e.A06(r6)
            java.util.ArrayList r4 = X.C18300x5.A0u(r6)
            X.C627336j.A0H(r6, r4)
            X.1EF r3 = X.C18300x5.A0Q(r2)
            X.8ya r1 = r3.mentionedJid_
            r0 = r1
            X.8T6 r0 = (X.AnonymousClass8T6) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x0154
            X.8ya r1 = X.C130786cX.A07(r1)
            r3.mentionedJid_ = r1
        L_0x0154:
            X.C170208Ch.A05(r4, r1)
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L_0x0173
            X.1EF r3 = X.C18300x5.A0Q(r2)
            X.8ya r1 = r3.groupMentions_
            r0 = r1
            X.8T6 r0 = (X.AnonymousClass8T6) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x0170
            X.8ya r1 = X.C130786cX.A07(r1)
            r3.groupMentions_ = r1
        L_0x0170:
            X.C170208Ch.A05(r5, r1)
        L_0x0173:
            r3 = 1
            int r0 = r11.A0A
            r0 = r0 & 1
            boolean r0 = X.AnonymousClass000.A1U(r0, r3)
            if (r0 == 0) goto L_0x0242
            X.1EF r1 = X.C18300x5.A0Q(r2)
            int r0 = r1.bitField0_
            r0 = r0 | 256(0x100, float:3.59E-43)
            r1.bitField0_ = r0
            r1.isForwarded_ = r3
            int r4 = r11.A06
            X.1EF r1 = X.C18300x5.A0Q(r2)
            int r0 = r1.bitField0_
            r0 = r0 | 128(0x80, float:1.794E-43)
            r1.bitField0_ = r0
            r1.forwardingScore_ = r4
            X.2mS r6 = r11.A0z()
            if (r6 == 0) goto L_0x01f7
            X.6cX r0 = r2.A00
            X.1EF r0 = (X.AnonymousClass1EF) r0
            X.1D9 r0 = r0.forwardedNewsletterMessageInfo_
            if (r0 != 0) goto L_0x01a8
            X.1D9 r0 = X.AnonymousClass1D9.DEFAULT_INSTANCE
        L_0x01a8:
            X.6c9 r5 = r0.A0H()
            X.4uY r0 = r6.A01
            java.lang.String r4 = X.C18300x5.A0g(r5, r0)
            X.6cX r1 = r5.A00
            X.1D9 r1 = (X.AnonymousClass1D9) r1
            r4.getClass()
            int r0 = r1.bitField0_
            r0 = r0 | 1
            r1.bitField0_ = r0
            r1.newsletterJid_ = r4
            int r4 = r6.A00
            X.6cX r1 = X.C18320x8.A0C(r5)
            X.1D9 r1 = (X.AnonymousClass1D9) r1
            int r0 = r1.bitField0_
            r0 = r0 | 2
            r1.bitField0_ = r0
            r1.serverMessageId_ = r4
            java.lang.String r4 = r6.A03
            X.6cX r1 = X.C18320x8.A0C(r5)
            X.1D9 r1 = (X.AnonymousClass1D9) r1
            int r0 = r1.bitField0_
            r0 = r0 | 4
            r1.bitField0_ = r0
            r1.newsletterName_ = r4
            X.6cX r0 = r5.A06()
            X.1D9 r0 = (X.AnonymousClass1D9) r0
            X.1EF r4 = X.C18300x5.A0Q(r2)
            r0.getClass()
            r4.forwardedNewsletterMessageInfo_ = r0
            int r1 = r4.bitField0_
            r0 = 33554432(0x2000000, float:9.403955E-38)
            r1 = r1 | r0
            r4.bitField0_ = r1
        L_0x01f7:
            X.1VX r4 = r9.A02
            r1 = 4513(0x11a1, float:6.324E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r4.A0Y(r0, r1)
            if (r0 == 0) goto L_0x0242
            X.2kg r1 = r11.A0s()
            if (r1 == 0) goto L_0x0242
            X.6cX r0 = r2.A00
            X.1EF r0 = (X.AnonymousClass1EF) r0
            X.1AF r0 = r0.businessMessageForwardInfo_
            if (r0 != 0) goto L_0x0213
            X.1AF r0 = X.AnonymousClass1AF.DEFAULT_INSTANCE
        L_0x0213:
            X.6c9 r5 = r0.A0H()
            com.whatsapp.jid.UserJid r0 = r1.A01
            java.lang.String r4 = X.C18300x5.A0g(r5, r0)
            X.6cX r1 = r5.A00
            X.1AF r1 = (X.AnonymousClass1AF) r1
            r4.getClass()
            int r0 = r1.bitField0_
            r0 = r0 | 1
            r1.bitField0_ = r0
            r1.businessOwnerJid_ = r4
            X.6cX r0 = r5.A06()
            X.1AF r0 = (X.AnonymousClass1AF) r0
            X.1EF r4 = X.C18300x5.A0Q(r2)
            r0.getClass()
            r4.businessMessageForwardInfo_ = r0
            int r1 = r4.bitField0_
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            r1 = r1 | r0
            r4.bitField0_ = r1
        L_0x0242:
            r1 = 262144(0x40000, float:3.67342E-40)
            int r0 = r11.A0A
            r0 = r0 & r1
            boolean r0 = X.AnonymousClass000.A1U(r0, r1)
            if (r0 == 0) goto L_0x025a
            X.1EF r4 = X.C18300x5.A0Q(r2)
            int r1 = r4.bitField0_
            r0 = 16777216(0x1000000, float:2.3509887E-38)
            r1 = r1 | r0
            r4.bitField0_ = r1
            r4.isSampled_ = r3
        L_0x025a:
            r0 = 0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0275
            r0 = 0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0275
            java.lang.String r0 = "getBytes"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)     // Catch:{ UnsupportedEncodingException -> 0x026f }
            throw r0     // Catch:{ UnsupportedEncodingException -> 0x026f }
        L_0x026f:
            r1 = move-exception
            java.lang.String r0 = "FMessageProtocolSerializers/buildOutgoingMessageContextInfo/error Failed to parse conversion data, exception="
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0275:
            X.2e5 r6 = r11.A0M
            if (r6 == 0) goto L_0x034d
            boolean r0 = r6 instanceof X.C22881Ql
            if (r0 != 0) goto L_0x0281
            boolean r0 = r6 instanceof X.C22891Qm
            if (r0 == 0) goto L_0x034d
        L_0x0281:
            X.C626936e.A06(r6)
            long r0 = java.lang.System.currentTimeMillis()
            boolean r4 = r6 instanceof X.C22881Ql
            if (r4 == 0) goto L_0x02db
            X.1Ql r6 = (X.C22881Ql) r6
            r4 = 0
            X.C162457s7.A0J(r2, r4)
            java.lang.String r8 = r6.A05     // Catch:{ Exception -> 0x02d7 }
            int r4 = r8.length()     // Catch:{ Exception -> 0x02d7 }
            if (r4 <= 0) goto L_0x02a8
            X.1EF r7 = X.C18300x5.A0Q(r2)     // Catch:{ Exception -> 0x02d7 }
            int r5 = r7.bitField0_     // Catch:{ Exception -> 0x02d7 }
            r4 = 32768(0x8000, float:4.5918E-41)
            r5 = r5 | r4
            r7.bitField0_ = r5     // Catch:{ Exception -> 0x02d7 }
            r7.entryPointConversionSource_ = r8     // Catch:{ Exception -> 0x02d7 }
        L_0x02a8:
            java.lang.String r8 = r6.A04     // Catch:{ Exception -> 0x02d7 }
            if (r8 == 0) goto L_0x02bf
            int r4 = r8.length()     // Catch:{ Exception -> 0x02d7 }
            if (r4 == 0) goto L_0x02bf
            X.1EF r7 = X.C18300x5.A0Q(r2)     // Catch:{ Exception -> 0x02d7 }
            int r5 = r7.bitField0_     // Catch:{ Exception -> 0x02d7 }
            r4 = 65536(0x10000, float:9.18355E-41)
            r5 = r5 | r4
            r7.bitField0_ = r5     // Catch:{ Exception -> 0x02d7 }
            r7.entryPointConversionApp_ = r8     // Catch:{ Exception -> 0x02d7 }
        L_0x02bf:
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ Exception -> 0x02d7 }
            long r4 = r6.A01     // Catch:{ Exception -> 0x02d7 }
            long r0 = r0 - r4
            long r0 = r7.toSeconds(r0)     // Catch:{ Exception -> 0x02d7 }
            int r5 = (int) r0     // Catch:{ Exception -> 0x02d7 }
            X.1EF r4 = X.C18300x5.A0Q(r2)     // Catch:{ Exception -> 0x02d7 }
            int r1 = r4.bitField0_     // Catch:{ Exception -> 0x02d7 }
            r0 = 131072(0x20000, float:1.83671E-40)
            r1 = r1 | r0
            r4.bitField0_ = r1     // Catch:{ Exception -> 0x02d7 }
            r4.entryPointConversionDelaySeconds_ = r5     // Catch:{ Exception -> 0x02d7 }
            goto L_0x034d
        L_0x02d7:
            r1 = move-exception
            java.lang.String r0 = "OrganicEntryPoint/fillMessageE2EContextInfo/failed to fill E2E context info/exception="
            goto L_0x034a
        L_0x02db:
            boolean r4 = r6 instanceof X.C22891Qm
            if (r4 == 0) goto L_0x034d
            X.1Qm r6 = (X.C22891Qm) r6
            r4 = 0
            X.C162457s7.A0J(r2, r4)
            java.lang.String r5 = r6.A02     // Catch:{ Exception -> 0x0347 }
            java.lang.String r4 = X.C58152un.A0B     // Catch:{ Exception -> 0x0347 }
            byte[] r4 = r5.getBytes(r4)     // Catch:{ Exception -> 0x0347 }
            X.6bf r7 = new X.6bf     // Catch:{ Exception -> 0x0347 }
            r7.<init>(r4)     // Catch:{ Exception -> 0x0347 }
            X.1EF r5 = X.C18300x5.A0Q(r2)     // Catch:{ Exception -> 0x0347 }
            int r4 = r5.bitField0_     // Catch:{ Exception -> 0x0347 }
            r4 = r4 | 32
            r5.bitField0_ = r4     // Catch:{ Exception -> 0x0347 }
            r5.conversionData_ = r7     // Catch:{ Exception -> 0x0347 }
            java.lang.String r7 = r6.A03     // Catch:{ Exception -> 0x0347 }
            X.1EF r5 = X.C18300x5.A0Q(r2)     // Catch:{ Exception -> 0x0347 }
            int r4 = r5.bitField0_     // Catch:{ Exception -> 0x0347 }
            r4 = r4 | 16
            r5.bitField0_ = r4     // Catch:{ Exception -> 0x0347 }
            r5.conversionSource_ = r7     // Catch:{ Exception -> 0x0347 }
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ Exception -> 0x0347 }
            long r4 = r6.A01     // Catch:{ Exception -> 0x0347 }
            long r0 = r0 - r4
            long r0 = r7.toSeconds(r0)     // Catch:{ Exception -> 0x0347 }
            int r4 = (int) r0     // Catch:{ Exception -> 0x0347 }
            X.1EF r1 = X.C18300x5.A0Q(r2)     // Catch:{ Exception -> 0x0347 }
            int r0 = r1.bitField0_     // Catch:{ Exception -> 0x0347 }
            r0 = r0 | 64
            r1.bitField0_ = r0     // Catch:{ Exception -> 0x0347 }
            r1.conversionDelaySeconds_ = r4     // Catch:{ Exception -> 0x0347 }
            java.lang.String r5 = r6.A04     // Catch:{ Exception -> 0x0347 }
            int r0 = r5.length()     // Catch:{ Exception -> 0x0347 }
            if (r0 <= 0) goto L_0x0337
            X.1EF r4 = X.C18300x5.A0Q(r2)     // Catch:{ Exception -> 0x0347 }
            int r1 = r4.bitField0_     // Catch:{ Exception -> 0x0347 }
            r0 = 4194304(0x400000, float:5.877472E-39)
            r1 = r1 | r0
            r4.bitField0_ = r1     // Catch:{ Exception -> 0x0347 }
            r4.trustBannerType_ = r5     // Catch:{ Exception -> 0x0347 }
        L_0x0337:
            int r5 = r6.A00     // Catch:{ Exception -> 0x0347 }
            X.1EF r4 = X.C18300x5.A0Q(r2)     // Catch:{ Exception -> 0x0347 }
            int r1 = r4.bitField0_     // Catch:{ Exception -> 0x0347 }
            r0 = 8388608(0x800000, float:1.17549435E-38)
            r1 = r1 | r0
            r4.bitField0_ = r1     // Catch:{ Exception -> 0x0347 }
            r4.trustBannerAction_ = r5     // Catch:{ Exception -> 0x0347 }
            goto L_0x034d
        L_0x0347:
            r1 = move-exception
            java.lang.String r0 = "CtwaAdsEntryPoint/fillMessageE2EContextInfo/failed to fill E2E context info/exception="
        L_0x034a:
            com.whatsapp.util.Log.e(r0, r1)
        L_0x034d:
            java.lang.String r0 = r11.A12
            boolean r0 = X.C18320x8.A1U(r0)
            if (r0 == 0) goto L_0x0399
            java.lang.String r0 = r11.A12
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0370
            java.lang.String r5 = r11.A12
            X.1EF r4 = X.C18300x5.A0Q(r2)
            r5.getClass()
            int r1 = r4.bitField0_
            r0 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 | r0
            r4.bitField0_ = r1
            r4.entryPointConversionSource_ = r5
        L_0x0370:
            java.lang.String r0 = r11.A11
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x038a
            java.lang.String r5 = r11.A11
            X.1EF r4 = X.C18300x5.A0Q(r2)
            r5.getClass()
            int r1 = r4.bitField0_
            r0 = 65536(0x10000, float:9.18355E-41)
            r1 = r1 | r0
            r4.bitField0_ = r1
            r4.entryPointConversionApp_ = r5
        L_0x038a:
            int r5 = r11.A03
            X.1EF r4 = X.C18300x5.A0Q(r2)
            int r1 = r4.bitField0_
            r0 = 131072(0x20000, float:1.83671E-40)
            r1 = r1 | r0
            r4.bitField0_ = r1
            r4.entryPointConversionDelaySeconds_ = r5
        L_0x0399:
            if (r10 == 0) goto L_0x0428
            X.2z0 r0 = r11.A1J
            X.4uZ r1 = r0.A00
            boolean r0 = r1 instanceof com.whatsapp.jid.UserJid
            if (r0 != 0) goto L_0x03ba
            boolean r0 = X.C627336j.A0K(r1)
            if (r0 != 0) goto L_0x03ba
            boolean r0 = r1 instanceof X.AnonymousClass1fI
            if (r0 == 0) goto L_0x0428
            int r1 = r11.A0D
            r0 = 4
            int r0 = X.AnonymousClass358.A00(r1, r0)
            boolean r0 = X.AnonymousClass001.A1U(r0)
            if (r0 == 0) goto L_0x0428
        L_0x03ba:
            X.C626936e.A06(r10)
            int r4 = r10.expiration
            X.1EF r1 = X.C18300x5.A0Q(r2)
            int r0 = r1.bitField0_
            r0 = r0 | 2048(0x800, float:2.87E-42)
            r1.bitField0_ = r0
            r1.expiration_ = r4
            long r0 = r10.ephemeralSettingTimestamp
            r5 = 0
            int r4 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x03e3
            long r0 = X.C18290x4.A0B(r0)
            X.1EF r5 = X.C18300x5.A0Q(r2)
            int r4 = r5.bitField0_
            r4 = r4 | 4096(0x1000, float:5.74E-42)
            r5.bitField0_ = r4
            r5.ephemeralSettingTimestamp_ = r0
        L_0x03e3:
            int r1 = r10.disappearingMessagesInitiator
            if (r1 != 0) goto L_0x05a4
            X.22v r4 = X.C374922v.CHANGED_IN_CHAT
        L_0x03e9:
            X.1EP r0 = X.AnonymousClass1EP.DEFAULT_INSTANCE
            X.6c9 r1 = r0.A0G()
            X.19t r1 = (X.C209019t) r1
            if (r4 == 0) goto L_0x03f6
            r1.A09(r4)
        L_0x03f6:
            X.1VX r0 = r9.A02
            boolean r0 = X.C56952sp.A0G(r0)
            if (r0 == 0) goto L_0x0412
            int r0 = r11.A04
            X.22w r0 = X.C57472th.A00(r0)
            r1.A0A(r0)
            java.lang.Boolean r0 = r11.A0o
            if (r0 == 0) goto L_0x0412
            boolean r0 = r0.booleanValue()
            r1.A0B(r0)
        L_0x0412:
            X.6cX r0 = r1.A06()
            X.1EP r0 = (X.AnonymousClass1EP) r0
            X.1EF r4 = X.C18300x5.A0Q(r2)
            r0.getClass()
            r4.disappearingMode_ = r0
            int r1 = r4.bitField0_
            r0 = 262144(0x40000, float:3.67342E-40)
            r1 = r1 | r0
            r4.bitField0_ = r1
        L_0x0428:
            if (r12 == 0) goto L_0x0445
            X.2z0 r0 = r11.A1J
            X.4uZ r0 = r0.A00
            boolean r0 = r0 instanceof X.AnonymousClass1fI
            if (r0 == 0) goto L_0x0445
            X.C626936e.A06(r12)
            X.8Lq r4 = X.C18270x1.A09(r2, r12)
            X.6cX r1 = r2.A00
            X.1EF r1 = (X.AnonymousClass1EF) r1
            int r0 = r1.bitField0_
            r0 = r0 | 8192(0x2000, float:1.14794E-41)
            r1.bitField0_ = r0
            r1.ephemeralSharedSecret_ = r4
        L_0x0445:
            X.2U8 r5 = r11.A0c
            if (r5 == 0) goto L_0x0596
            X.6cX r0 = r2.A00
            X.1EF r0 = (X.AnonymousClass1EF) r0
            X.1E4 r0 = r0.externalAdReply_
            if (r0 != 0) goto L_0x0453
            X.1E4 r0 = X.AnonymousClass1E4.DEFAULT_INSTANCE
        L_0x0453:
            X.6c9 r4 = r0.A0H()
            java.lang.String r6 = r5.A0A
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L_0x0470
            X.6cX r1 = X.C18320x8.A0C(r4)
            X.1E4 r1 = (X.AnonymousClass1E4) r1
            r6.getClass()
            int r0 = r1.bitField0_
            r0 = r0 | 1
            r1.bitField0_ = r0
            r1.title_ = r6
        L_0x0470:
            java.lang.String r6 = r5.A02
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L_0x0489
            X.6cX r1 = X.C18320x8.A0C(r4)
            X.1E4 r1 = (X.AnonymousClass1E4) r1
            r6.getClass()
            int r0 = r1.bitField0_
            r0 = r0 | 2
            r1.bitField0_ = r0
            r1.body_ = r6
        L_0x0489:
            X.22d r6 = X.AnonymousClass22d.NONE
            int r1 = r5.A01
            if (r1 != r3) goto L_0x059d
            X.22d r6 = X.AnonymousClass22d.IMAGE
        L_0x0491:
            X.6cX r1 = X.C18320x8.A0C(r4)
            X.1E4 r1 = (X.AnonymousClass1E4) r1
            int r0 = r6.value
            r1.mediaType_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 4
            r1.bitField0_ = r0
            java.lang.String r3 = r5.A09
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L_0x04b5
            X.1E4 r1 = A00(r4, r3)
            int r0 = r1.bitField0_
            r0 = r0 | 8
            r1.bitField0_ = r0
            r1.thumbnailUrl_ = r3
        L_0x04b5:
            java.lang.String r3 = r5.A04
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L_0x04c9
            X.1E4 r1 = A00(r4, r3)
            int r0 = r1.bitField0_
            r0 = r0 | 16
            r1.bitField0_ = r0
            r1.mediaUrl_ = r3
        L_0x04c9:
            byte[] r0 = r5.A0F
            if (r0 == 0) goto L_0x04dd
            X.8Lq r3 = X.C18270x1.A09(r4, r0)
            X.6cX r1 = r4.A00
            X.1E4 r1 = (X.AnonymousClass1E4) r1
            int r0 = r1.bitField0_
            r0 = r0 | 32
            r1.bitField0_ = r0
            r1.thumbnail_ = r3
        L_0x04dd:
            java.lang.String r3 = r5.A06
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L_0x04f1
            X.1E4 r1 = A00(r4, r3)
            int r0 = r1.bitField0_
            r0 = r0 | 128(0x80, float:1.794E-43)
            r1.bitField0_ = r0
            r1.sourceId_ = r3
        L_0x04f1:
            java.lang.String r3 = r5.A07
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L_0x0505
            X.1E4 r1 = A00(r4, r3)
            int r0 = r1.bitField0_
            r0 = r0 | 64
            r1.bitField0_ = r0
            r1.sourceType_ = r3
        L_0x0505:
            java.lang.String r3 = r5.A08
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L_0x0519
            X.1E4 r1 = A00(r4, r3)
            int r0 = r1.bitField0_
            r0 = r0 | 256(0x100, float:3.59E-43)
            r1.bitField0_ = r0
            r1.sourceUrl_ = r3
        L_0x0519:
            java.lang.String r3 = r5.A03
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L_0x052d
            X.1E4 r1 = A00(r4, r3)
            int r0 = r1.bitField0_
            r0 = r0 | 4096(0x1000, float:5.74E-42)
            r1.bitField0_ = r0
            r1.ctwaClid_ = r3
        L_0x052d:
            java.lang.String r3 = r5.A05
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L_0x0541
            X.1E4 r1 = A00(r4, r3)
            int r0 = r1.bitField0_
            r0 = r0 | 8192(0x2000, float:1.14794E-41)
            r1.bitField0_ = r0
            r1.ref_ = r3
        L_0x0541:
            boolean r3 = r5.A0D
            X.6cX r1 = X.C18320x8.A0C(r4)
            X.1E4 r1 = (X.AnonymousClass1E4) r1
            int r0 = r1.bitField0_
            r0 = r0 | 1024(0x400, float:1.435E-42)
            r1.bitField0_ = r0
            r1.renderLargerThumbnail_ = r3
            boolean r3 = r5.A0E
            X.6cX r1 = X.C18320x8.A0C(r4)
            X.1E4 r1 = (X.AnonymousClass1E4) r1
            int r0 = r1.bitField0_
            r0 = r0 | 2048(0x800, float:2.87E-42)
            r1.bitField0_ = r0
            r1.showAdAttribution_ = r3
            boolean r3 = r5.A0B
            X.6cX r1 = X.C18320x8.A0C(r4)
            X.1E4 r1 = (X.AnonymousClass1E4) r1
            int r0 = r1.bitField0_
            r0 = r0 | 16384(0x4000, float:2.2959E-41)
            r1.bitField0_ = r0
            r1.clickToWhatsappCall_ = r3
            boolean r3 = r5.A0C
            X.6cX r1 = X.C18320x8.A0C(r4)
            X.1E4 r1 = (X.AnonymousClass1E4) r1
            int r0 = r1.bitField0_
            r0 = r0 | 512(0x200, float:7.175E-43)
            r1.bitField0_ = r0
            r1.containsAutoReply_ = r3
            X.6cX r0 = r4.A06()
            X.1E4 r0 = (X.AnonymousClass1E4) r0
            X.1EF r1 = X.C18300x5.A0Q(r2)
            r0.getClass()
            r1.externalAdReply_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 16384(0x4000, float:2.2959E-41)
            r1.bitField0_ = r0
        L_0x0596:
            X.6cX r0 = r2.A06()
            X.1EF r0 = (X.AnonymousClass1EF) r0
            return r0
        L_0x059d:
            r0 = 2
            if (r1 != r0) goto L_0x0491
            X.22d r6 = X.AnonymousClass22d.VIDEO
            goto L_0x0491
        L_0x05a4:
            if (r1 != r3) goto L_0x05aa
            X.22v r4 = X.C374922v.INITIATED_BY_ME
            goto L_0x03e9
        L_0x05aa:
            r0 = 2
            if (r1 != r0) goto L_0x05b1
            X.22v r4 = X.C374922v.INITIATED_BY_OTHER
            goto L_0x03e9
        L_0x05b1:
            r4 = 0
            goto L_0x03e9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59542x5.A02(X.3Z2, X.34x, byte[], boolean):X.1EF");
    }

    public C59542x5(C56972sr r1, C56612sH r2, AnonymousClass1VX r3, C183538qC r4) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
        this.A03 = r4;
    }

    public static AnonymousClass1E4 A00(C130546c9 r0, Object obj) {
        r0.A07();
        AnonymousClass1E4 r02 = (AnonymousClass1E4) r0.A00;
        obj.getClass();
        return r02;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0063, code lost:
        if (X.AnonymousClass001.A1U(X.AnonymousClass358.A00(r4.A0D, 4)) == false) goto L_0x0065;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A01(X.AnonymousClass3Z2 r3, X.C624134x r4, byte[] r5) {
        /*
            X.34x r0 = r4.A0w()
            r2 = 1
            if (r0 != 0) goto L_0x0035
            r1 = 1024(0x400, float:1.435E-42)
            int r0 = r4.A0A
            r0 = r0 & r1
            boolean r0 = X.AnonymousClass000.A1U(r0, r1)
            if (r0 != 0) goto L_0x0035
            int r0 = r4.A0A
            r0 = r0 & 1
            boolean r0 = X.AnonymousClass000.A1U(r0, r2)
            if (r0 != 0) goto L_0x0035
            r1 = 262144(0x40000, float:3.67342E-40)
            int r0 = r4.A0A
            r0 = r0 & r1
            boolean r0 = X.AnonymousClass000.A1U(r0, r1)
            if (r0 != 0) goto L_0x0035
            r0 = 0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0036
            r0 = 0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0036
        L_0x0035:
            return r2
        L_0x0036:
            java.lang.String r0 = r4.A12
            boolean r0 = X.C18320x8.A1U(r0)
            if (r0 != 0) goto L_0x0035
            boolean r0 = r4.A1m()
            if (r0 != 0) goto L_0x0035
            if (r3 == 0) goto L_0x0065
            X.2z0 r0 = r4.A1J
            X.4uZ r1 = r0.A00
            boolean r0 = r1 instanceof com.whatsapp.jid.UserJid
            if (r0 != 0) goto L_0x0035
            boolean r0 = X.C627336j.A0K(r1)
            if (r0 != 0) goto L_0x0035
            boolean r0 = r1 instanceof X.AnonymousClass1fI
            if (r0 == 0) goto L_0x0065
            int r1 = r4.A0D
            r0 = 4
            int r0 = X.AnonymousClass358.A00(r1, r0)
            boolean r0 = X.AnonymousClass001.A1U(r0)
            if (r0 != 0) goto L_0x0035
        L_0x0065:
            if (r5 == 0) goto L_0x0070
            X.2z0 r0 = r4.A1J
            X.4uZ r0 = r0.A00
            boolean r0 = r0 instanceof X.AnonymousClass1fI
            if (r0 == 0) goto L_0x0070
            return r2
        L_0x0070:
            X.2e5 r1 = r4.A0M
            if (r1 == 0) goto L_0x007d
            boolean r0 = r1 instanceof X.C22881Ql
            if (r0 != 0) goto L_0x0035
            boolean r0 = r1 instanceof X.C22891Qm
            if (r0 == 0) goto L_0x007d
            return r2
        L_0x007d:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59542x5.A01(X.3Z2, X.34x, byte[]):boolean");
    }
}
