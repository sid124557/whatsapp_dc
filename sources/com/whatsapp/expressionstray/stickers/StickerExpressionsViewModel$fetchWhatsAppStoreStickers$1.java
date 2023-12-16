package com.whatsapp.expressionstray.stickers;

import X.AnonymousClass001;
import X.AnonymousClass218;
import X.AnonymousClass4GR;
import X.C57682u2;
import X.C59022wD;
import X.C616131n;
import X.C73853gB;
import X.C75003pT;
import X.C84814Du;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel$fetchWhatsAppStoreStickers$1", f = "StickerExpressionsViewModel.kt", i = {}, l = {429}, m = "invokeSuspend", n = {}, s = {})
public final class StickerExpressionsViewModel$fetchWhatsAppStoreStickers$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ Set $emojis;
    public final /* synthetic */ List $localResults;
    public int label;
    public final /* synthetic */ StickerExpressionsViewModel this$0;

    @DebugMetadata(c = "com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel$fetchWhatsAppStoreStickers$1$1", f = "StickerExpressionsViewModel.kt", i = {}, l = {431, 441, 455, 465}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel$fetchWhatsAppStoreStickers$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C75003pT implements AnonymousClass4GR {
        public int label;

        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object A09(java.lang.Object r44) {
            /*
                r43 = this;
                X.218 r8 = X.AnonymousClass218.COROUTINE_SUSPENDED
                r7 = r43
                int r1 = r7.label
                r6 = 2
                r5 = 1
                if (r1 == 0) goto L_0x001e
                if (r1 == r5) goto L_0x0037
                if (r1 == r6) goto L_0x0243
                r0 = 3
                if (r1 == r0) goto L_0x001a
                r0 = 4
                if (r1 != r0) goto L_0x02b9
                X.C57682u2.A01(r44)
            L_0x0017:
                X.2wD r0 = X.C59022wD.A00
                return r0
            L_0x001a:
                X.C57682u2.A01(r44)     // Catch:{ Exception -> 0x028e }
                goto L_0x0017
            L_0x001e:
                X.C57682u2.A01(r44)
                com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel r0 = com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel.this     // Catch:{ Exception -> 0x028e }
                X.2GE r0 = r0.A0C     // Catch:{ Exception -> 0x028e }
                X.1VX r1 = r0.A00     // Catch:{ Exception -> 0x028e }
                r0 = 5423(0x152f, float:7.599E-42)
                long r0 = X.C56952sp.A06(r1, r0)     // Catch:{ Exception -> 0x028e }
                r7.label = r5     // Catch:{ Exception -> 0x028e }
                java.lang.Object r0 = X.C616231o.A00(r7, r0)     // Catch:{ Exception -> 0x028e }
                if (r0 != r8) goto L_0x003a
                goto L_0x02be
            L_0x0037:
                X.C57682u2.A01(r44)     // Catch:{ Exception -> 0x028e }
            L_0x003a:
                java.util.Set r3 = r3     // Catch:{ Exception -> 0x028e }
                com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel r0 = com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel.this     // Catch:{ Exception -> 0x028e }
                X.2GE r0 = r0.A0C     // Catch:{ Exception -> 0x028e }
                X.1VX r2 = r0.A00     // Catch:{ Exception -> 0x028e }
                r1 = 5421(0x152d, float:7.596E-42)
                X.2vE r17 = X.C58422vE.A02     // Catch:{ Exception -> 0x028e }
                r0 = r17
                int r0 = r2.A0O(r0, r1)     // Catch:{ Exception -> 0x028e }
                java.util.List r1 = X.C73723fy.A0J(r3, r0)     // Catch:{ Exception -> 0x028e }
                java.lang.String r0 = ","
                r9 = 0
                r4 = 0
                java.lang.String r1 = X.C73723fy.A0A(r0, r1, r9)     // Catch:{ Exception -> 0x028e }
                java.lang.String r0 = X.C58152un.A0B     // Catch:{ Exception -> 0x028e }
                java.lang.String r11 = java.net.URLEncoder.encode(r1, r0)     // Catch:{ Exception -> 0x028e }
                java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x028e }
                java.lang.String r0 = "StickerExpressionsViewModel/fetchWhatsAppStoreStickers/query = "
                X.C18260x0.A0q(r0, r11, r1)     // Catch:{ Exception -> 0x028e }
                com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel r0 = com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel.this     // Catch:{ Exception -> 0x028e }
                X.2Q1 r2 = r0.A0D     // Catch:{ Exception -> 0x028e }
                X.C162457s7.A0H(r11)     // Catch:{ Exception -> 0x028e }
                java.lang.String r13 = " / "
                X.C162457s7.A0J(r11, r4)     // Catch:{ Exception -> 0x028e }
                org.json.JSONArray r22 = X.AnonymousClass0x9.A1F()     // Catch:{ Exception -> 0x028e }
                r12 = 0
                java.lang.String r3 = "https://static.whatsapp.net/wa/static/sticker?cat=sticker_search&terms=%s&country=%s"
                java.lang.Object[] r1 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x010b, all -> 0x0108 }
                r1[r4] = r11     // Catch:{ Exception -> 0x010b, all -> 0x0108 }
                X.2sr r0 = r2.A01     // Catch:{ Exception -> 0x010b, all -> 0x0108 }
                com.whatsapp.Me r0 = X.C56972sr.A00(r0)     // Catch:{ Exception -> 0x010b, all -> 0x0108 }
                if (r0 == 0) goto L_0x008c
                java.lang.String r0 = X.AnonymousClass0x9.A0w(r0)     // Catch:{ Exception -> 0x010b, all -> 0x0108 }
                if (r0 != 0) goto L_0x008e
            L_0x008c:
                java.lang.String r0 = "GB"
            L_0x008e:
                r1[r5] = r0     // Catch:{ Exception -> 0x010b, all -> 0x0108 }
                java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r6)     // Catch:{ Exception -> 0x010b, all -> 0x0108 }
                java.lang.String r0 = java.lang.String.format(r3, r0)     // Catch:{ Exception -> 0x010b, all -> 0x0108 }
                X.C162457s7.A0D(r0)     // Catch:{ Exception -> 0x010b, all -> 0x0108 }
                java.net.URL r3 = X.C18330xA.A0B(r0)     // Catch:{ Exception -> 0x010b, all -> 0x0108 }
                java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x010b, all -> 0x0108 }
                java.lang.String r0 = "DynamicStickersProvider/resultForQuery/contentUrl="
                X.C18260x0.A1P(r1, r0, r3)     // Catch:{ Exception -> 0x010b, all -> 0x0108 }
                r0 = 9
                android.net.TrafficStats.setThreadStatsTag(r0)     // Catch:{ Exception -> 0x010b, all -> 0x0108 }
                java.net.URLConnection r10 = r3.openConnection()     // Catch:{ Exception -> 0x010b, all -> 0x0108 }
                java.lang.String r0 = "null cannot be cast to non-null type java.net.HttpURLConnection"
                X.C162457s7.A0K(r10, r0)     // Catch:{ Exception -> 0x010b, all -> 0x0108 }
                java.net.HttpURLConnection r10 = (java.net.HttpURLConnection) r10     // Catch:{ Exception -> 0x010b, all -> 0x0108 }
                r10.connect()     // Catch:{ Exception -> 0x010b, all -> 0x0108 }
                java.io.InputStream r12 = r3.openStream()     // Catch:{ Exception -> 0x0106 }
                java.io.BufferedInputStream r3 = new java.io.BufferedInputStream     // Catch:{ Exception -> 0x0106 }
                r3.<init>(r12)     // Catch:{ Exception -> 0x0106 }
                java.io.BufferedReader r14 = X.C18310x6.A0Z(r3)     // Catch:{ all -> 0x00ff }
                java.io.StringWriter r16 = new java.io.StringWriter     // Catch:{ all -> 0x00f8 }
                r16.<init>()     // Catch:{ all -> 0x00f8 }
                r0 = 8192(0x2000, float:1.14794E-41)
                char[] r15 = new char[r0]     // Catch:{ all -> 0x00f8 }
            L_0x00d2:
                int r1 = r14.read(r15)     // Catch:{ all -> 0x00f8 }
                if (r1 < 0) goto L_0x00de
                r0 = r16
                r0.write(r15, r4, r1)     // Catch:{ all -> 0x00f8 }
                goto L_0x00d2
            L_0x00de:
                java.lang.String r1 = X.C18290x4.A0o(r16)     // Catch:{ all -> 0x00f8 }
                r14.close()     // Catch:{ all -> 0x00ff }
                int r0 = r1.length()     // Catch:{ all -> 0x00ff }
                if (r0 <= 0) goto L_0x00f2
                org.json.JSONArray r0 = new org.json.JSONArray     // Catch:{ all -> 0x00ff }
                r0.<init>(r1)     // Catch:{ all -> 0x00ff }
                r22 = r0
            L_0x00f2:
                r3.close()     // Catch:{ Exception -> 0x0106 }
                if (r12 == 0) goto L_0x0134
                goto L_0x0131
            L_0x00f8:
                r1 = move-exception
                throw r1     // Catch:{ all -> 0x00fa }
            L_0x00fa:
                r0 = move-exception
                X.AnonymousClass2A8.A00(r14, r1)     // Catch:{ all -> 0x00ff }
                throw r0     // Catch:{ all -> 0x00ff }
            L_0x00ff:
                r1 = move-exception
                throw r1     // Catch:{ all -> 0x0101 }
            L_0x0101:
                r0 = move-exception
                X.AnonymousClass2A8.A00(r3, r1)     // Catch:{ Exception -> 0x0106 }
                throw r0     // Catch:{ Exception -> 0x0106 }
            L_0x0106:
                r0 = move-exception
                goto L_0x010d
            L_0x0108:
                r0 = move-exception
                goto L_0x028a
            L_0x010b:
                r0 = move-exception
                r10 = r9
            L_0x010d:
                X.2qk r3 = r2.A00     // Catch:{ all -> 0x027f }
                java.lang.String r2 = "globalSearchProvider/query/error"
                java.lang.StringBuilder r1 = X.C18290x4.A0v(r0)     // Catch:{ all -> 0x027f }
                r1.append(r13)     // Catch:{ all -> 0x027f }
                X.C18320x8.A1N(r1, r0)     // Catch:{ all -> 0x027f }
                r1.append(r13)     // Catch:{ all -> 0x027f }
                java.lang.String r0 = r0.getLocalizedMessage()     // Catch:{ all -> 0x027f }
                java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ all -> 0x027f }
                r3.A0A(r2, r4, r0)     // Catch:{ all -> 0x027f }
                if (r12 == 0) goto L_0x012e
                r12.close()     // Catch:{ Exception -> 0x028e }
            L_0x012e:
                if (r10 == 0) goto L_0x0137
                goto L_0x0134
            L_0x0131:
                r12.close()     // Catch:{ Exception -> 0x028e }
            L_0x0134:
                r10.disconnect()     // Catch:{ Exception -> 0x028e }
            L_0x0137:
                android.net.TrafficStats.clearThreadStatsTag()     // Catch:{ Exception -> 0x028e }
                java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x028e }
                java.lang.String r0 = "DynamicStickersProvider/resultForQuery/query="
                X.C18260x0.A0q(r0, r11, r1)     // Catch:{ Exception -> 0x028e }
                java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x028e }
                java.lang.String r1 = "DynamicStickersProvider/resultForQuery/jsonArrayResponse="
                r0 = r22
                X.C18260x0.A1P(r2, r1, r0)     // Catch:{ Exception -> 0x028e }
                com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel r0 = com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel.this     // Catch:{ Exception -> 0x028e }
                X.2Q1 r11 = r0.A0D     // Catch:{ Exception -> 0x028e }
                java.util.ArrayList r21 = X.AnonymousClass001.A0s()     // Catch:{ Exception -> 0x028e }
                int r3 = r22.length()     // Catch:{ Exception -> 0x028e }
                X.2GE r0 = r11.A02     // Catch:{ Exception -> 0x028e }
                X.1VX r2 = r0.A00     // Catch:{ Exception -> 0x028e }
                r1 = 5424(0x1530, float:7.6E-42)
                r0 = r17
                int r0 = r2.A0O(r0, r1)     // Catch:{ Exception -> 0x028e }
                int r20 = java.lang.Math.min(r3, r0)     // Catch:{ Exception -> 0x028e }
                r12 = 0
            L_0x016b:
                r0 = r20
                if (r12 >= r0) goto L_0x022e
                r0 = r22
                org.json.JSONObject r2 = r0.getJSONObject(r12)     // Catch:{ Exception -> 0x028e }
                X.2ww r1 = r11.A03     // Catch:{ Exception -> 0x028e }
                X.C162457s7.A0H(r2)     // Catch:{ Exception -> 0x028e }
                X.C162457s7.A0J(r2, r4)     // Catch:{ Exception -> 0x028e }
                java.lang.String r0 = "media-key"
                java.lang.String r19 = r2.getString(r0)     // Catch:{ Exception -> 0x0220 }
                java.lang.String r0 = "file-hash"
                java.lang.String r15 = r2.getString(r0)     // Catch:{ Exception -> 0x0220 }
                java.lang.String r0 = "enc-file-hash"
                java.lang.String r18 = r2.getString(r0)     // Catch:{ Exception -> 0x0220 }
                java.lang.String r0 = "direct-path"
                java.lang.String r17 = r2.getString(r0)     // Catch:{ Exception -> 0x0220 }
                java.lang.String r0 = "file-size"
                int r16 = r2.getInt(r0)     // Catch:{ Exception -> 0x0220 }
                java.lang.String r0 = "mimetype"
                java.lang.String r14 = r2.getString(r0)     // Catch:{ Exception -> 0x0220 }
                java.lang.String r0 = "height"
                int r13 = r2.getInt(r0)     // Catch:{ Exception -> 0x0220 }
                java.lang.String r0 = "width"
                int r10 = r2.getInt(r0)     // Catch:{ Exception -> 0x0220 }
                java.lang.String r0 = "sticker-pack-id"
                java.lang.String r3 = X.C57282tO.A00(r0, r2, r4)     // Catch:{ Exception -> 0x0220 }
                X.2rq r0 = r1.A00     // Catch:{ Exception -> 0x021e }
                java.io.File r1 = r0.A02(r15)     // Catch:{ Exception -> 0x021e }
                boolean r0 = r1.exists()     // Catch:{ Exception -> 0x021e }
                if (r0 != r5) goto L_0x0210
                java.lang.String r2 = r1.getAbsolutePath()     // Catch:{ Exception -> 0x021e }
            L_0x01c6:
                X.39M r1 = new X.39M     // Catch:{ Exception -> 0x021e }
                r25 = r9
                r26 = r9
                r27 = r9
                r28 = r9
                r29 = r9
                r30 = r9
                r31 = r9
                r32 = r9
                r33 = r9
                r34 = r9
                r36 = r4
                r37 = r4
                r38 = r4
                r39 = r4
                r40 = r4
                r41 = r4
                r42 = r4
                r23 = r1
                r24 = r9
                r35 = r4
                r23.<init>(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42)     // Catch:{ Exception -> 0x021e }
                r0 = r19
                r1.A0B = r0     // Catch:{ Exception -> 0x021e }
                r0 = r18
                r1.A08 = r0     // Catch:{ Exception -> 0x021e }
                r1.A0A = r15     // Catch:{ Exception -> 0x021e }
                r1.A0D = r15     // Catch:{ Exception -> 0x021e }
                r0 = r17
                r1.A06 = r0     // Catch:{ Exception -> 0x021e }
                r0 = r16
                r1.A00 = r0     // Catch:{ Exception -> 0x021e }
                r1.A0C = r14     // Catch:{ Exception -> 0x021e }
                r1.A02 = r13     // Catch:{ Exception -> 0x021e }
                r1.A03 = r10     // Catch:{ Exception -> 0x021e }
                r1.A0F = r3     // Catch:{ Exception -> 0x021e }
                goto L_0x0212
            L_0x0210:
                r2 = r9
                goto L_0x01c6
            L_0x0212:
                if (r2 == 0) goto L_0x0218
                r1.A09 = r2     // Catch:{ Exception -> 0x021e }
                r1.A01 = r5     // Catch:{ Exception -> 0x021e }
            L_0x0218:
                r0 = r21
                r0.add(r1)     // Catch:{ Exception -> 0x028e }
                goto L_0x022a
            L_0x021e:
                r2 = move-exception
                goto L_0x0221
            L_0x0220:
                r2 = move-exception
            L_0x0221:
                java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x028e }
                java.lang.String r0 = "StickerMaker/createStickerFromJsonObject/couldn't parse json object "
                X.C18260x0.A1Q(r1, r0, r2)     // Catch:{ Exception -> 0x028e }
            L_0x022a:
                int r12 = r12 + 1
                goto L_0x016b
            L_0x022e:
                boolean r0 = r21.isEmpty()     // Catch:{ Exception -> 0x028e }
                if (r0 == 0) goto L_0x0249
                com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel r2 = com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel.this     // Catch:{ Exception -> 0x028e }
                java.util.List r1 = r2     // Catch:{ Exception -> 0x028e }
                X.3d3 r0 = X.C72023d3.A00     // Catch:{ Exception -> 0x028e }
                r7.label = r6     // Catch:{ Exception -> 0x028e }
                java.lang.Object r0 = r2.A0I(r1, r0, r9, r7)     // Catch:{ Exception -> 0x028e }
                if (r0 != r8) goto L_0x0246
                goto L_0x02bf
            L_0x0243:
                X.C57682u2.A01(r44)     // Catch:{ Exception -> 0x028e }
            L_0x0246:
                X.2wD r0 = X.C59022wD.A00     // Catch:{ Exception -> 0x028e }
                return r0
            L_0x0249:
                java.util.Set r1 = r3     // Catch:{ Exception -> 0x028e }
                X.5Zv[] r0 = new X.C106655Zv[r4]     // Catch:{ Exception -> 0x028e }
                java.lang.Object[] r0 = r1.toArray(r0)     // Catch:{ Exception -> 0x028e }
                X.5Zv[] r0 = (X.C106655Zv[]) r0     // Catch:{ Exception -> 0x028e }
                java.lang.String r2 = X.C387228w.A00(r0)     // Catch:{ Exception -> 0x028e }
                java.util.ArrayList r3 = X.C73783g4.A0c(r21)     // Catch:{ Exception -> 0x028e }
                java.util.Iterator r1 = r21.iterator()     // Catch:{ Exception -> 0x028e }
            L_0x025f:
                boolean r0 = r1.hasNext()     // Catch:{ Exception -> 0x028e }
                if (r0 == 0) goto L_0x0271
                X.39M r0 = X.AnonymousClass0x7.A0b(r1)     // Catch:{ Exception -> 0x028e }
                r0.A07 = r2     // Catch:{ Exception -> 0x028e }
                r0.A0K = r5     // Catch:{ Exception -> 0x028e }
                r3.add(r0)     // Catch:{ Exception -> 0x028e }
                goto L_0x025f
            L_0x0271:
                com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel r2 = com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel.this     // Catch:{ Exception -> 0x028e }
                java.util.List r1 = r2     // Catch:{ Exception -> 0x028e }
                r0 = 3
                r7.label = r0     // Catch:{ Exception -> 0x028e }
                java.lang.Object r0 = r2.A0I(r1, r3, r9, r7)     // Catch:{ Exception -> 0x028e }
                if (r0 != r8) goto L_0x0017
                goto L_0x02c0
            L_0x027f:
                r0 = move-exception
                if (r12 == 0) goto L_0x0285
                r12.close()     // Catch:{ Exception -> 0x028e }
            L_0x0285:
                if (r10 == 0) goto L_0x028a
                r10.disconnect()     // Catch:{ Exception -> 0x028e }
            L_0x028a:
                android.net.TrafficStats.clearThreadStatsTag()     // Catch:{ Exception -> 0x028e }
                throw r0     // Catch:{ Exception -> 0x028e }
            L_0x028e:
                r2 = move-exception
                java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
                java.lang.String r0 = "StickerExpressionsViewModel/fetchDynamicStickers/error = "
                X.C18260x0.A1Q(r1, r0, r2)
                boolean r0 = r2 instanceof java.util.concurrent.CancellationException
                if (r0 == 0) goto L_0x0017
                com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel r0 = com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel.this
                X.4Gp r0 = r0.A0g
                java.lang.Object r0 = r0.getValue()
                boolean r0 = r0 instanceof X.AnonymousClass1U6
                if (r0 == 0) goto L_0x0017
                com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel r4 = com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel.this
                java.util.List r3 = r2
                X.3d3 r2 = X.C72023d3.A00
                r1 = 0
                r0 = 4
                r7.label = r0
                java.lang.Object r0 = r4.A0I(r3, r2, r1, r7)
                if (r0 != r8) goto L_0x0017
                return r8
            L_0x02b9:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
                throw r0
            L_0x02be:
                return r8
            L_0x02bf:
                return r8
            L_0x02c0:
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel$fetchWhatsAppStoreStickers$1.AnonymousClass1.A09(java.lang.Object):java.lang.Object");
        }

        public final C84814Du A0A(Object obj, C84814Du r6) {
            return new AnonymousClass1(list, set, r6);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return C59022wD.A00(obj2, obj, this);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StickerExpressionsViewModel$fetchWhatsAppStoreStickers$1(StickerExpressionsViewModel stickerExpressionsViewModel, List list, Set set, C84814Du r5) {
        super(r5, 2);
        this.this$0 = stickerExpressionsViewModel;
        this.$emojis = set;
        this.$localResults = list;
    }

    public final Object A09(Object obj) {
        AnonymousClass218 r7 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            final StickerExpressionsViewModel stickerExpressionsViewModel = this.this$0;
            C73853gB r4 = stickerExpressionsViewModel.A0b;
            final Set set = this.$emojis;
            final List list = this.$localResults;
            AnonymousClass1 r0 = new AnonymousClass1((C84814Du) null);
            this.label = 1;
            if (C616131n.A00(this, r4, r0) == r7) {
                return r7;
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        return C59022wD.A00;
    }

    public final C84814Du A0A(Object obj, C84814Du r6) {
        return new StickerExpressionsViewModel$fetchWhatsAppStoreStickers$1(this.this$0, this.$localResults, this.$emojis, r6);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
