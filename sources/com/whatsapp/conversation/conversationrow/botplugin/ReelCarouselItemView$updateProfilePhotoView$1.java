package com.whatsapp.conversation.conversationrow.botplugin;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass218;
import X.AnonymousClass4GR;
import X.AnonymousClass5WB;
import X.C107245ax;
import X.C18260x0;
import X.C30481mW;
import X.C53532nF;
import X.C57682u2;
import X.C59022wD;
import X.C616131n;
import X.C624134x;
import X.C626936e;
import X.C627236i;
import X.C64393Dh;
import X.C73853gB;
import X.C75003pT;
import X.C84814Du;
import X.C93384oT;
import android.graphics.Bitmap;
import com.whatsapp.components.button.ThumbnailButton;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.conversation.conversationrow.botplugin.ReelCarouselItemView$updateProfilePhotoView$1", f = "ReelCarouselItemView.kt", i = {}, l = {145}, m = "invokeSuspend", n = {}, s = {})
public final class ReelCarouselItemView$updateProfilePhotoView$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ C30481mW $message;
    public int label;
    public final /* synthetic */ C93384oT this$0;

    @DebugMetadata(c = "com.whatsapp.conversation.conversationrow.botplugin.ReelCarouselItemView$updateProfilePhotoView$1$1", f = "ReelCarouselItemView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.conversation.conversationrow.botplugin.ReelCarouselItemView$updateProfilePhotoView$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C75003pT implements AnonymousClass4GR {
        public int label;

        public final Object A09(Object obj) {
            if (this.label == 0) {
                C57682u2.A01(obj);
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("ReelCarouselItemView/updateProfilePhotoView ");
                A0o.append(r3.A1J);
                A0o.append(" bitmap is null =");
                C18260x0.A1U(A0o, AnonymousClass000.A1X(bitmap));
                Bitmap bitmap = bitmap;
                ThumbnailButton thumbnailButton = r22.A0A;
                if (bitmap != null) {
                    thumbnailButton.setImageBitmap(bitmap);
                    r22.A0A.setVisibility(0);
                } else {
                    thumbnailButton.setVisibility(8);
                }
                return C59022wD.A00;
            }
            throw AnonymousClass001.A0d();
        }

        public final C84814Du A0A(Object obj, C84814Du r6) {
            return new AnonymousClass1(bitmap, r22, r3, r6);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return C59022wD.A00(obj2, obj, this);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReelCarouselItemView$updateProfilePhotoView$1(C93384oT r2, C30481mW r3, C84814Du r4) {
        super(r4, 2);
        this.this$0 = r2;
        this.$message = r3;
    }

    public final Object A09(Object obj) {
        final Bitmap bitmap;
        String str;
        AnonymousClass218 r5 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            C93384oT r4 = this.this$0;
            C30481mW r2 = this.$message;
            int i2 = r4.A04;
            StringBuilder A0o = AnonymousClass001.A0o();
            C18260x0.A0m(C624134x.A08(r2, "ReelCarouselItemView/getProfilePhotoBitmap ", A0o), A0o);
            C53532nF A0r = r2.A0r();
            if (A0r == null || (str = A0r.A03) == null) {
                bitmap = null;
            } else {
                C64393Dh fMessageIO = r4.getFMessageIO();
                StringBuilder A0o2 = AnonymousClass001.A0o();
                String A04 = C627236i.A04(str);
                C626936e.A06(A04);
                A0o2.append(A04);
                bitmap = C107245ax.A06(new AnonymousClass5WB(i2, i2), C64393Dh.A00(fMessageIO, AnonymousClass000.A0X("-profilephoto", A0o2))).A02;
            }
            C73853gB mainDispatcher = this.this$0.getMainDispatcher();
            final C30481mW r3 = this.$message;
            final C93384oT r22 = this.this$0;
            AnonymousClass1 r0 = new AnonymousClass1((C84814Du) null);
            this.label = 1;
            if (C616131n.A00(this, mainDispatcher, r0) == r5) {
                return r5;
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        return C59022wD.A00;
    }

    public final C84814Du A0A(Object obj, C84814Du r5) {
        return new ReelCarouselItemView$updateProfilePhotoView$1(this.this$0, this.$message, r5);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
