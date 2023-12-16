package com.whatsapp.expressionstray.emoji;

import X.AnonymousClass001;
import X.AnonymousClass0x7;
import X.AnonymousClass218;
import X.AnonymousClass4GR;
import X.AnonymousClass4rC;
import X.AnonymousClass4rE;
import X.AnonymousClass5MX;
import X.AnonymousClass5SX;
import X.AnonymousClass5Y0;
import X.C102725Ka;
import X.C162457s7;
import X.C57682u2;
import X.C59022wD;
import X.C616131n;
import X.C73153f1;
import X.C73783g4;
import X.C75003pT;
import X.C84814Du;
import X.C85524Gp;
import X.C94364r4;
import X.C94374r7;
import X.C94404rD;
import com.whatsapp.expressionstray.emoji.data.EmojiExpressionsDataSource$getEmojiItems$2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.emoji.EmojiExpressionsViewModel$refreshEmoji$1", f = "EmojiExpressionsViewModel.kt", i = {}, l = {83}, m = "invokeSuspend", n = {}, s = {})
public final class EmojiExpressionsViewModel$refreshEmoji$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ int $batch;
    public final /* synthetic */ Integer $qplInstanceKey;
    public int label;
    public final /* synthetic */ EmojiExpressionsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EmojiExpressionsViewModel$refreshEmoji$1(EmojiExpressionsViewModel emojiExpressionsViewModel, Integer num, C84814Du r4, int i) {
        super(r4, 2);
        this.this$0 = emojiExpressionsViewModel;
        this.$qplInstanceKey = num;
        this.$batch = i;
    }

    public static C94404rD A00(Iterator it) {
        AnonymousClass5MX r0 = (AnonymousClass5MX) it.next();
        C162457s7.A0K(r0, "null cannot be cast to non-null type com.whatsapp.expressionstray.emoji.grid.EmojiExpressionsViewItem.EmojiItem");
        return (C94404rD) r0;
    }

    public final Object A09(Object obj) {
        C94374r7 r7;
        C94364r4 r5;
        Object obj2 = obj;
        AnonymousClass218 r52 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj2);
            C102725Ka r3 = this.this$0.A06;
            this.label = 1;
            obj2 = C616131n.A00(this, r3.A06, new EmojiExpressionsDataSource$getEmojiItems$2(r3, (C84814Du) null));
            if (obj2 == r52) {
                return r52;
            }
        } else if (i == 1) {
            C57682u2.A01(obj2);
        } else {
            throw AnonymousClass001.A0d();
        }
        if (!(obj2 instanceof C94374r7) || (r7 = (C94374r7) obj2) == null) {
            throw AnonymousClass001.A0e("Null or loading result received.");
        }
        Integer num = this.$qplInstanceKey;
        if (num != null) {
            this.this$0.A08.A00(num.intValue(), "emoji_data_loading_end", (String) null);
        }
        EmojiExpressionsViewModel emojiExpressionsViewModel = this.this$0;
        int i2 = this.$batch;
        Integer num2 = this.$qplInstanceKey;
        if (i2 == 0) {
            List list = r7.A01;
            List<AnonymousClass5MX> list2 = r7.A00;
            if (num2 != null) {
                ArrayList A0c = C73783g4.A0c(list2);
                boolean z = true;
                for (AnonymousClass5MX r72 : list2) {
                    if (z) {
                        if (r72 instanceof C94404rD) {
                            C94404rD r73 = (C94404rD) r72;
                            r72 = new C94404rD(r73.A00, r73.A01, num2, r73.A03, r73.A04);
                        } else if (r72 instanceof AnonymousClass4rE) {
                            AnonymousClass4rE r74 = (AnonymousClass4rE) r72;
                            r72 = new AnonymousClass4rE(r74.A00, r74.A01, num2, r74.A03, r74.A04);
                        } else if (!(r72 instanceof AnonymousClass4rC)) {
                            throw C73153f1.A00();
                        }
                        z = false;
                    }
                    A0c.add(r72);
                }
                list2 = A0c;
            }
            r5 = new C94364r4(num2, list, list2);
        } else {
            if (num2 != null) {
                emojiExpressionsViewModel.A08.A00(num2.intValue(), "emoji_data_batching_start", (String) null);
            }
            ArrayList A0s = AnonymousClass001.A0s();
            ArrayList A0s2 = AnonymousClass001.A0s();
            AnonymousClass5SX r1 = null;
            boolean z2 = true;
            for (AnonymousClass5MX r12 : r7.A00) {
                if (r12 instanceof AnonymousClass4rC) {
                    if (AnonymousClass0x7.A1S(A0s2)) {
                        ArrayList A0d = C73783g4.A0d(A0s2);
                        Iterator it = A0s2.iterator();
                        while (it.hasNext()) {
                            A0d.add(A00(it).A03);
                        }
                        int[][] iArr = (int[][]) A0d.toArray(new int[0][]);
                        ArrayList A0d2 = C73783g4.A0d(A0s2);
                        Iterator it2 = A0s2.iterator();
                        while (it2.hasNext()) {
                            A0d2.add(A00(it2).A04);
                        }
                        int[][] iArr2 = (int[][]) A0d2.toArray(new int[0][]);
                        AnonymousClass5Y0 r8 = emojiExpressionsViewModel.A04;
                        C162457s7.A0H(r1);
                        Integer num3 = null;
                        if (z2) {
                            num3 = num2;
                        }
                        A0s.add(new AnonymousClass4rE(r8, r1, num3, iArr, iArr2));
                        A0s2.clear();
                        if (z2) {
                            z2 = false;
                        }
                    }
                    r1 = r12.A00();
                    A0s.add(r12);
                } else if (r12 instanceof C94404rD) {
                    if (r1 == null) {
                        r1 = r12.A00();
                    }
                    AnonymousClass5SX A00 = r12.A00();
                    if (!C162457s7.A0P(A00, r1) || A0s2.size() >= i2) {
                        ArrayList A0d3 = C73783g4.A0d(A0s2);
                        Iterator it3 = A0s2.iterator();
                        while (it3.hasNext()) {
                            A0d3.add(A00(it3).A03);
                        }
                        int[][] iArr3 = (int[][]) A0d3.toArray(new int[0][]);
                        ArrayList A0d4 = C73783g4.A0d(A0s2);
                        Iterator it4 = A0s2.iterator();
                        while (it4.hasNext()) {
                            A0d4.add(A00(it4).A04);
                        }
                        int[][] iArr4 = (int[][]) A0d4.toArray(new int[0][]);
                        AnonymousClass5Y0 r82 = emojiExpressionsViewModel.A04;
                        C162457s7.A0H(r1);
                        Integer num4 = null;
                        if (z2) {
                            num4 = num2;
                        }
                        A0s.add(new AnonymousClass4rE(r82, r1, num4, iArr3, iArr4));
                        A0s2.clear();
                        A0s2.add(r12);
                        r1 = A00;
                        if (z2) {
                            z2 = false;
                        }
                    } else {
                        A0s2.add(r12);
                    }
                }
            }
            if (AnonymousClass0x7.A1S(A0s2)) {
                ArrayList A0d5 = C73783g4.A0d(A0s2);
                Iterator it5 = A0s2.iterator();
                while (it5.hasNext()) {
                    A0d5.add(A00(it5).A03);
                }
                int[][] iArr5 = (int[][]) A0d5.toArray(new int[0][]);
                ArrayList A0d6 = C73783g4.A0d(A0s2);
                Iterator it6 = A0s2.iterator();
                while (it6.hasNext()) {
                    A0d6.add(A00(it6).A04);
                }
                int[][] iArr6 = (int[][]) A0d6.toArray(new int[0][]);
                AnonymousClass5Y0 r10 = emojiExpressionsViewModel.A04;
                C162457s7.A0H(r1);
                Integer num5 = null;
                if (z2) {
                    num5 = num2;
                }
                A0s.add(new AnonymousClass4rE(r10, r1, num5, iArr5, iArr6));
            }
            if (num2 != null) {
                emojiExpressionsViewModel.A08.A00(num2.intValue(), "emoji_data_batching_end", (String) null);
            }
            r5 = new C94364r4(num2, r7.A01, A0s);
        }
        C85524Gp r13 = this.this$0.A0C;
        do {
        } while (!r13.AzD(r13.getValue(), r5));
        return C59022wD.A00;
    }

    public final C84814Du A0A(Object obj, C84814Du r6) {
        return new EmojiExpressionsViewModel$refreshEmoji$1(this.this$0, this.$qplInstanceKey, r6, this.$batch);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
