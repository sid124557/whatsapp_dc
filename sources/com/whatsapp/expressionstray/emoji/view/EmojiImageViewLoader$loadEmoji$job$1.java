package com.whatsapp.expressionstray.emoji.view;

import X.AnonymousClass001;
import X.AnonymousClass218;
import X.AnonymousClass4GR;
import X.AnonymousClass5OY;
import X.AnonymousClass5RP;
import X.C104185Pz;
import X.C104775Sh;
import X.C162457s7;
import X.C57682u2;
import X.C59022wD;
import X.C616131n;
import X.C75003pT;
import X.C84814Du;
import X.C86664Kz;
import X.C999858y;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.lang.ref.WeakReference;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.emoji.view.EmojiImageViewLoader$loadEmoji$job$1", f = "EmojiImageViewLoader.kt", i = {}, l = {80}, m = "invokeSuspend", n = {}, s = {})
public final class EmojiImageViewLoader$loadEmoji$job$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ C104775Sh $task;
    public int label;
    public final /* synthetic */ AnonymousClass5OY this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EmojiImageViewLoader$loadEmoji$job$1(C104775Sh r2, AnonymousClass5OY r3, C84814Du r4) {
        super(r4, 2);
        this.this$0 = r3;
        this.$task = r2;
    }

    public final Object A09(Object obj) {
        Object obj2;
        View A0j;
        C104185Pz r2;
        int i;
        C999858y r0;
        Object obj3;
        AnonymousClass218 r4 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            C57682u2.A01(obj);
            AnonymousClass5OY r7 = this.this$0;
            C104775Sh r6 = this.$task;
            this.label = 1;
            Integer num = r6.A03;
            if (num != null) {
                r7.A02.A00(num.intValue(), "emoji_image_loader_load_start", (String) null);
            }
            AnonymousClass5RP r9 = r6.A02;
            WeakReference weakReference = r6.A04;
            View A0j2 = C86664Kz.A0j(weakReference);
            if (A0j2 != null) {
                obj2 = A0j2.getTag();
            } else {
                obj2 = null;
            }
            if (C162457s7.A0P(r9, obj2) && (A0j = C86664Kz.A0j(weakReference)) != null) {
                Drawable A05 = r7.A01.A05(A0j.getResources(), r6.A01, r6.A00);
                if (A05 != null) {
                    View A0j3 = C86664Kz.A0j(weakReference);
                    if (A0j3 != null) {
                        obj3 = A0j3.getTag();
                    } else {
                        obj3 = null;
                    }
                    if (C162457s7.A0P(r9, obj3)) {
                        if (C616131n.A00(this, r7.A06, new EmojiImageViewLoader$loadEmojiIntoView$2(A05, r6, r7, (C84814Du) null)) == r4) {
                            return r4;
                        }
                    } else if (num != null) {
                        r2 = r7.A02;
                        i = num.intValue();
                        r0 = C999858y.CANCEL;
                    }
                } else if (num != null) {
                    r2 = r7.A02;
                    i = num.intValue();
                    r0 = C999858y.FAIL;
                }
                r2.A01(r0, i);
            }
            if (C59022wD.A00 == r4) {
                return r4;
            }
        } else if (i2 == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        return C59022wD.A00;
    }

    public final C84814Du A0A(Object obj, C84814Du r5) {
        return new EmojiImageViewLoader$loadEmoji$job$1(this.$task, this.this$0, r5);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
