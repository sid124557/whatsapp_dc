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
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel$fetchGiphyTenorStickers$1", f = "StickerExpressionsViewModel.kt", i = {}, l = {477}, m = "invokeSuspend", n = {}, s = {})
public final class StickerExpressionsViewModel$fetchGiphyTenorStickers$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ List $localResults;
    public final /* synthetic */ String $searchText;
    public int label;
    public final /* synthetic */ StickerExpressionsViewModel this$0;

    @DebugMetadata(c = "com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel$fetchGiphyTenorStickers$1$1", f = "StickerExpressionsViewModel.kt", i = {2, 3, 3}, l = {479, 482, 485, 497, 508}, m = "invokeSuspend", n = {"stickersFromGiphyTenor", "stickersFromGiphyTenor", "queryCount"}, s = {"L$0", "L$0", "I$0"})
    /* renamed from: com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel$fetchGiphyTenorStickers$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C75003pT implements AnonymousClass4GR {
        public int I$0;
        public Object L$0;
        public Object L$1;
        public int label;

        public final java.lang.Object A09(java.lang.Object r12) {
            /*
                r11 = this;
                X.218 r5 = X.AnonymousClass218.COROUTINE_SUSPENDED
                int r0 = r11.label
                r7 = 0
                r4 = 5
                r6 = 4
                r2 = 3
                r9 = 2
                r10 = 1
                if (r0 == 0) goto L_0x0030
                if (r0 == r10) goto L_0x0049
                if (r0 == r9) goto L_0x002c
                if (r0 == r2) goto L_0x0027
                if (r0 == r6) goto L_0x001c
                if (r0 != r4) goto L_0x00f1
                X.C57682u2.A01(r12)
            L_0x0019:
                X.2wD r0 = X.C59022wD.A00
                return r0
            L_0x001c:
                int r7 = r11.I$0
                java.lang.Object r8 = r11.L$0
                java.util.List r8 = (java.util.List) r8
                X.C57682u2.A01(r12)     // Catch:{ Exception -> 0x00c3 }
                goto L_0x00c0
            L_0x0027:
                java.lang.Object r8 = r11.L$0
                java.util.List r8 = (java.util.List) r8
                goto L_0x0096
            L_0x002c:
                X.C57682u2.A01(r12)     // Catch:{ Exception -> 0x00c3 }
                goto L_0x0019
            L_0x0030:
                X.C57682u2.A01(r12)
                com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel r0 = com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel.this     // Catch:{ Exception -> 0x00c3 }
                X.2GE r0 = r0.A0C     // Catch:{ Exception -> 0x00c3 }
                X.1VX r1 = r0.A00     // Catch:{ Exception -> 0x00c3 }
                r0 = 5423(0x152f, float:7.599E-42)
                long r0 = X.C56952sp.A06(r1, r0)     // Catch:{ Exception -> 0x00c3 }
                r11.label = r10     // Catch:{ Exception -> 0x00c3 }
                java.lang.Object r0 = X.C616231o.A00(r11, r0)     // Catch:{ Exception -> 0x00c3 }
                if (r0 != r5) goto L_0x004c
                goto L_0x00f6
            L_0x0049:
                X.C57682u2.A01(r12)     // Catch:{ Exception -> 0x00c3 }
            L_0x004c:
                com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel r0 = com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel.this     // Catch:{ Exception -> 0x00c3 }
                X.2hx r8 = r0.A0K     // Catch:{ Exception -> 0x00c3 }
                java.lang.String r0 = r3     // Catch:{ Exception -> 0x00c3 }
                X.C162457s7.A0J(r0, r7)     // Catch:{ Exception -> 0x00c3 }
                r3 = 0
                r8.A00 = r3     // Catch:{ Exception -> 0x00c3 }
                r8.A01 = r7     // Catch:{ Exception -> 0x00c3 }
                java.lang.String r0 = r8.A01(r0, r3)     // Catch:{ Exception -> 0x00c3 }
                X.0PJ r1 = r8.A00(r0)     // Catch:{ Exception -> 0x00c3 }
                if (r1 != 0) goto L_0x0075
                r8.A01 = r10     // Catch:{ Exception -> 0x00c3 }
                r8.A00 = r3     // Catch:{ Exception -> 0x00c3 }
            L_0x0068:
                com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel r2 = com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel.this     // Catch:{ Exception -> 0x00c3 }
                java.util.List r1 = r2     // Catch:{ Exception -> 0x00c3 }
                X.3d3 r0 = X.C72023d3.A00     // Catch:{ Exception -> 0x00c3 }
                r11.label = r9     // Catch:{ Exception -> 0x00c3 }
                java.lang.Object r0 = r2.A0I(r1, r3, r0, r11)     // Catch:{ Exception -> 0x00c3 }
                goto L_0x00ee
            L_0x0075:
                java.lang.Object r0 = r1.A00     // Catch:{ Exception -> 0x00c3 }
                java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x00c3 }
                r8.A00 = r0     // Catch:{ Exception -> 0x00c3 }
                java.lang.Object r8 = r1.A01     // Catch:{ Exception -> 0x00c3 }
                java.util.List r8 = (java.util.List) r8     // Catch:{ Exception -> 0x00c3 }
                if (r8 == 0) goto L_0x0068
                boolean r0 = r8.isEmpty()     // Catch:{ Exception -> 0x00c3 }
                if (r0 != 0) goto L_0x0068
                com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel r1 = com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel.this     // Catch:{ Exception -> 0x00c3 }
                java.util.List r0 = r2     // Catch:{ Exception -> 0x00c3 }
                r11.L$0 = r8     // Catch:{ Exception -> 0x00c3 }
                r11.label = r2     // Catch:{ Exception -> 0x00c3 }
                java.lang.Object r0 = r1.A0I(r0, r3, r8, r11)     // Catch:{ Exception -> 0x00c3 }
                if (r0 != r5) goto L_0x0099
                goto L_0x00f7
            L_0x0096:
                X.C57682u2.A01(r12)     // Catch:{ Exception -> 0x00c3 }
            L_0x0099:
                com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel r0 = com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel.this     // Catch:{ Exception -> 0x00c3 }
                r0.A02 = r8     // Catch:{ Exception -> 0x00c3 }
            L_0x009d:
                int r1 = r8.size()     // Catch:{ Exception -> 0x00c3 }
                com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel r3 = com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel.this     // Catch:{ Exception -> 0x00c3 }
                r0 = 40
                if (r1 >= r0) goto L_0x0019
                if (r7 >= r6) goto L_0x0019
                java.util.List r2 = r3.A02     // Catch:{ Exception -> 0x00c3 }
                if (r2 == 0) goto L_0x00c0
                java.util.List r1 = r2     // Catch:{ Exception -> 0x00c3 }
                java.lang.String r0 = r3     // Catch:{ Exception -> 0x00c3 }
                r11.L$0 = r8     // Catch:{ Exception -> 0x00c3 }
                r11.L$1 = r2     // Catch:{ Exception -> 0x00c3 }
                r11.I$0 = r7     // Catch:{ Exception -> 0x00c3 }
                r11.label = r6     // Catch:{ Exception -> 0x00c3 }
                java.lang.Object r0 = r3.A0G(r0, r1, r2, r11)     // Catch:{ Exception -> 0x00c3 }
                if (r0 != r5) goto L_0x00c0
                goto L_0x00f8
            L_0x00c0:
                int r7 = r7 + 1
                goto L_0x009d
            L_0x00c3:
                r2 = move-exception
                java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
                java.lang.String r0 = "StickerExpressionsViewModel/fetchGiphyTenorStickers/error = "
                X.C18260x0.A1Q(r1, r0, r2)
                boolean r0 = r2 instanceof java.util.concurrent.CancellationException
                if (r0 == 0) goto L_0x0019
                com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel r0 = com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel.this
                X.4Gp r0 = r0.A0g
                java.lang.Object r0 = r0.getValue()
                boolean r0 = r0 instanceof X.AnonymousClass1U6
                if (r0 == 0) goto L_0x0019
                com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel r3 = com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel.this
                java.util.List r2 = r2
                r1 = 0
                X.3d3 r0 = X.C72023d3.A00
                r11.L$0 = r1
                r11.L$1 = r1
                r11.label = r4
                java.lang.Object r0 = r3.A0I(r2, r1, r0, r11)
            L_0x00ee:
                if (r0 != r5) goto L_0x0019
                return r5
            L_0x00f1:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
                throw r0
            L_0x00f6:
                return r5
            L_0x00f7:
                return r5
            L_0x00f8:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel$fetchGiphyTenorStickers$1.AnonymousClass1.A09(java.lang.Object):java.lang.Object");
        }

        public final C84814Du A0A(Object obj, C84814Du r6) {
            return new AnonymousClass1(str, list, r6);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return C59022wD.A00(obj2, obj, this);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StickerExpressionsViewModel$fetchGiphyTenorStickers$1(StickerExpressionsViewModel stickerExpressionsViewModel, String str, List list, C84814Du r5) {
        super(r5, 2);
        this.this$0 = stickerExpressionsViewModel;
        this.$searchText = str;
        this.$localResults = list;
    }

    public final Object A09(Object obj) {
        AnonymousClass218 r7 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            final StickerExpressionsViewModel stickerExpressionsViewModel = this.this$0;
            C73853gB r4 = stickerExpressionsViewModel.A0b;
            final String str = this.$searchText;
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
        return new StickerExpressionsViewModel$fetchGiphyTenorStickers$1(this.this$0, this.$searchText, this.$localResults, r6);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
