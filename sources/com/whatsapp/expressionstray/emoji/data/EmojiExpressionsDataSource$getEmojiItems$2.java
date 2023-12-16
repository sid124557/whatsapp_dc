package com.whatsapp.expressionstray.emoji.data;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass4GR;
import X.AnonymousClass4rC;
import X.AnonymousClass5SX;
import X.AnonymousClass5Y0;
import X.C102725Ka;
import X.C104185Pz;
import X.C106655Zv;
import X.C107005aX;
import X.C107425bI;
import X.C149467Mo;
import X.C155677fI;
import X.C162457s7;
import X.C18260x0;
import X.C18270x1;
import X.C57682u2;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import X.C94374r7;
import X.C94404rD;
import X.C999858y;
import com.whatsapp.R;
import java.util.ArrayList;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.emoji.data.EmojiExpressionsDataSource$getEmojiItems$2", f = "EmojiExpressionsDataSource.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class EmojiExpressionsDataSource$getEmojiItems$2 extends C75003pT implements AnonymousClass4GR {
    public int label;
    public final /* synthetic */ C102725Ka this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EmojiExpressionsDataSource$getEmojiItems$2(C102725Ka r2, C84814Du r3) {
        super(r3, 2);
        this.this$0 = r2;
    }

    public final Object A09(Object obj) {
        C102725Ka r0;
        if (this.label == 0) {
            C57682u2.A01(obj);
            C104185Pz r1 = this.this$0.A02;
            int andIncrement = r1.A02.getAndIncrement();
            r1.A01.markerStart(694884634, andIncrement);
            this.this$0.A02.A00(andIncrement, "emoji_fetching_start", (String) null);
            int i = 0;
            boolean A1W = AnonymousClass001.A1W(this.this$0.A00.A01());
            this.this$0.A02.A00(andIncrement, "load_emoji_pages_start", (String) null);
            int length = C155677fI.A00(this.this$0.A03).length + (A1W ? 1 : 0);
            this.this$0.A02.A00(andIncrement, "load_emoji_pages_end", (String) null);
            ArrayList A0s = AnonymousClass001.A0s();
            ArrayList A0s2 = AnonymousClass001.A0s();
            if (A1W) {
                this.this$0.A02.A00(andIncrement, "load_recent_emojis_start", (String) null);
                AnonymousClass5SX r10 = new AnonymousClass5SX(R.drawable.selector_emoji_recent, R.string.f11nameremoved, "recents", true);
                A0s.add(r10);
                if (!this.this$0.A03.A0X(6632)) {
                    A0s2.add(new AnonymousClass4rC(r10, "recents", R.string.f11nameremoved));
                }
                int A01 = this.this$0.A00.A01();
                while (true) {
                    r0 = this.this$0;
                    if (i >= A01) {
                        break;
                    }
                    int[] iArr = (int[]) r0.A00.A02(i);
                    AnonymousClass5Y0 r12 = this.this$0.A01;
                    C162457s7.A0H(iArr);
                    AnonymousClass5Y0 r17 = r12;
                    A0s2.add(new C94404rD(r17, r10, (Integer) null, iArr, iArr));
                    i++;
                }
                r0.A02.A00(andIncrement, "load_recent_emojis_end", String.valueOf(A0s2.size()));
            }
            for (int i2 = A1W; i2 < length; i2++) {
                C104185Pz r2 = this.this$0.A02;
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("load_emoji_section_");
                A0o.append(i2);
                r2.A00(andIncrement, AnonymousClass000.A0X("_start", A0o), (String) null);
                C149467Mo r11 = C155677fI.A00(this.this$0.A03)[i2 - A1W];
                String A0Y = AnonymousClass000.A0Y("page_", AnonymousClass001.A0o(), i2);
                Object obj2 = this.this$0.A05.get(new Integer(r11.A00));
                C162457s7.A0H(obj2);
                int A0K = AnonymousClass001.A0K(obj2);
                int i3 = r11.A02;
                AnonymousClass5SX r122 = new AnonymousClass5SX(A0K, i3, A0Y, false);
                A0s.add(r122);
                A0s2.add(new AnonymousClass4rC(r122, C18260x0.A05("page_", i2), i3));
                Iterable<C106655Zv> iterable = (Iterable) r11.A03.get();
                C162457s7.A0D(iterable);
                C102725Ka r112 = this.this$0;
                for (C106655Zv r02 : iterable) {
                    int[] iArr2 = r02.A00;
                    C162457s7.A0C(iArr2);
                    int[] iArr3 = iArr2;
                    if (C107425bI.A02(iArr2)) {
                        iArr3 = C107005aX.A04(r112.A04, iArr2);
                    } else if (C107425bI.A03(iArr2)) {
                        iArr3 = C107005aX.A05(r112.A04, iArr2);
                    } else {
                        A0s2.add(new C94404rD(r112.A01, r122, (Integer) null, iArr2, iArr3));
                    }
                    C162457s7.A0D(iArr3);
                    A0s2.add(new C94404rD(r112.A01, r122, (Integer) null, iArr2, iArr3));
                }
                this.this$0.A02.A00(andIncrement, AnonymousClass000.A0X("_end", C18270x1.A0W(i2, "load_emoji_section_")), (String) null);
            }
            C94374r7 r3 = new C94374r7(A0s, A0s2);
            C102725Ka r22 = this.this$0;
            r22.A02.A00(andIncrement, "emoji_fetching_end", (String) null);
            r22.A02.A01(C999858y.SUCCESS, andIncrement);
            return r3;
        }
        throw AnonymousClass001.A0d();
    }

    public final C84814Du A0A(Object obj, C84814Du r4) {
        return new EmojiExpressionsDataSource$getEmojiItems$2(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A01(new EmojiExpressionsDataSource$getEmojiItems$2(this.this$0, (C84814Du) obj2));
    }
}
