package com.whatsapp.conversation.viewmodel;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0x2;
import X.AnonymousClass0x9;
import X.AnonymousClass218;
import X.AnonymousClass330;
import X.AnonymousClass39M;
import X.AnonymousClass4GR;
import X.C106655Zv;
import X.C18290x4;
import X.C194410o;
import X.C54292oU;
import X.C57682u2;
import X.C59022wD;
import X.C59452ww;
import X.C60392yU;
import X.C616131n;
import X.C624134x;
import X.C627236i;
import X.C73853gB;
import X.C75003pT;
import X.C84814Du;
import X.C95814uZ;
import android.graphics.Bitmap;
import com.whatsapp.R;
import com.whatsapp.stickers.WebpUtils;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.conversation.viewmodel.CustomStickerViewModel$sendSticker$1", f = "CustomStickerViewModel.kt", i = {}, l = {66}, m = "invokeSuspend", n = {}, s = {})
public final class CustomStickerViewModel$sendSticker$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ C95814uZ $chatJid;
    public int label;
    public final /* synthetic */ C194410o this$0;

    @DebugMetadata(c = "com.whatsapp.conversation.viewmodel.CustomStickerViewModel$sendSticker$1$1", f = "CustomStickerViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.conversation.viewmodel.CustomStickerViewModel$sendSticker$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C75003pT implements AnonymousClass4GR {
        public int label;

        public final Object A09(Object obj) {
            byte[] bArr;
            if (this.label == 0) {
                C57682u2.A01(obj);
                Bitmap bitmap = ((C60392yU) C194410o.this.A0A.getValue()).A00;
                if (bitmap != null) {
                    C194410o r5 = C194410o.this;
                    C95814uZ r4 = r2;
                    C59452ww r1 = r5.A07;
                    String A0o = C18290x4.A0o(r5.A01);
                    String valueOf = String.valueOf(C627236i.A04(C18290x4.A0t(AnonymousClass0x2.A1a(A0o))));
                    File A02 = r1.A00.A02(valueOf);
                    if (!A02.exists()) {
                        Log.d("StickerMaker/createFromBitmap/local file created");
                        FileOutputStream A0h = AnonymousClass0x9.A0h(A02);
                        bitmap.compress(Bitmap.CompressFormat.WEBP, 70, A0h);
                        A0h.flush();
                        A0h.close();
                    }
                    AnonymousClass39M A00 = C59452ww.A00(A02, valueOf, A0o);
                    byte[] bArr2 = null;
                    A00.A04 = new AnonymousClass330((String) null, (String) null, C54292oU.A00(r5.A04).getString(R.string.f11nameremoved), (String) null, (String) null, (String) null, (C106655Zv[]) null, false, true, false, false, false);
                    String str = A00.A09;
                    if (str != null) {
                        WebpUtils webpUtils = r5.A06;
                        File A0B = AnonymousClass002.A0B(str);
                        AnonymousClass330 r0 = A00.A04;
                        if (r0 != null) {
                            bArr = r0.A02();
                        } else {
                            bArr = null;
                        }
                        webpUtils.A03(A0B, bArr);
                    }
                    String str2 = A00.A0D;
                    if (str2 != null) {
                        File A022 = r5.A02.A02(str2);
                        WebpUtils webpUtils2 = r5.A06;
                        AnonymousClass330 r02 = A00.A04;
                        if (r02 != null) {
                            bArr2 = r02.A02();
                        }
                        webpUtils2.A03(A022, bArr2);
                    }
                    r5.A03.A0G(r4, (C624134x) null, A00, AnonymousClass0x9.A0k(8), false);
                    r5.A0D();
                }
                return C59022wD.A00;
            }
            throw AnonymousClass001.A0d();
        }

        public final C84814Du A0A(Object obj, C84814Du r5) {
            return new AnonymousClass1(r2, r5);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return C59022wD.A00(obj2, obj, this);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CustomStickerViewModel$sendSticker$1(C194410o r2, C95814uZ r3, C84814Du r4) {
        super(r4, 2);
        this.this$0 = r2;
        this.$chatJid = r3;
    }

    public final Object A09(Object obj) {
        AnonymousClass218 r6 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            final C194410o r4 = this.this$0;
            C73853gB r3 = r4.A08;
            final C95814uZ r2 = this.$chatJid;
            AnonymousClass1 r0 = new AnonymousClass1((C84814Du) null);
            this.label = 1;
            if (C616131n.A00(this, r3, r0) == r6) {
                return r6;
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        return C59022wD.A00;
    }

    public final C84814Du A0A(Object obj, C84814Du r5) {
        return new CustomStickerViewModel$sendSticker$1(this.this$0, this.$chatJid, r5);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
