package com.whatsapp.conversation.comments;

import X.AnonymousClass001;
import X.AnonymousClass218;
import X.AnonymousClass3ZH;
import X.AnonymousClass4GR;
import X.C105365Uq;
import X.C56972sr;
import X.C57682u2;
import X.C59022wD;
import X.C616131n;
import X.C624134x;
import X.C73853gB;
import X.C75003pT;
import X.C84814Du;
import com.whatsapp.jid.UserJid;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.conversation.comments.ContactPictureView$bind$1", f = "ContactPictureView.kt", i = {}, l = {43}, m = "invokeSuspend", n = {}, s = {})
public final class ContactPictureView$bind$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ C105365Uq $contactPhotoLoader;
    public final /* synthetic */ C624134x $message;
    public int label;
    public final /* synthetic */ ContactPictureView this$0;

    @DebugMetadata(c = "com.whatsapp.conversation.comments.ContactPictureView$bind$1$1", f = "ContactPictureView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.conversation.comments.ContactPictureView$bind$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C75003pT implements AnonymousClass4GR {
        public int label;

        public final Object A09(Object obj) {
            if (this.label == 0) {
                C57682u2.A01(obj);
                C105365Uq.this.A08(contactPictureView2, A0A);
                return C59022wD.A00;
            }
            throw AnonymousClass001.A0d();
        }

        public final C84814Du A0A(Object obj, C84814Du r6) {
            return new AnonymousClass1(contactPictureView2, A0A, r6);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return C59022wD.A00(obj2, obj, this);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ContactPictureView$bind$1(C105365Uq r2, ContactPictureView contactPictureView, C624134x r4, C84814Du r5) {
        super(r5, 2);
        this.this$0 = contactPictureView;
        this.$message = r4;
        this.$contactPhotoLoader = r2;
    }

    public final Object A09(Object obj) {
        final AnonymousClass3ZH A0A;
        AnonymousClass218 r6 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            ContactPictureView contactPictureView = this.this$0;
            C624134x r1 = this.$message;
            if (r1.A1J.A02) {
                A0A = C56972sr.A01(contactPictureView.getMeManager());
            } else {
                UserJid A0o = r1.A0o();
                if (A0o != null) {
                    A0A = contactPictureView.getContactManager().A0A(A0o);
                }
            }
            if (A0A != null) {
                C73853gB mainDispatcher = this.this$0.getMainDispatcher();
                final C105365Uq r3 = this.$contactPhotoLoader;
                final ContactPictureView contactPictureView2 = this.this$0;
                AnonymousClass1 r0 = new AnonymousClass1((C84814Du) null);
                this.label = 1;
                if (C616131n.A00(this, mainDispatcher, r0) == r6) {
                    return r6;
                }
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        return C59022wD.A00;
    }

    public final C84814Du A0A(Object obj, C84814Du r6) {
        return new ContactPictureView$bind$1(this.$contactPhotoLoader, this.this$0, this.$message, r6);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
