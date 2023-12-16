package com.whatsapp.events;

import X.AnonymousClass001;
import X.AnonymousClass1T5;
import X.AnonymousClass218;
import X.AnonymousClass3ZH;
import X.AnonymousClass4GR;
import X.AnonymousClass5UY;
import X.AnonymousClass7HU;
import X.C105365Uq;
import X.C107565bW;
import X.C162457s7;
import X.C19310zD;
import X.C51652kA;
import X.C56972sr;
import X.C57682u2;
import X.C59022wD;
import X.C616131n;
import X.C626936e;
import X.C73853gB;
import X.C75003pT;
import X.C84814Du;
import X.C95814uZ;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.jid.UserJid;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.events.EventResponseUserView$bind$1", f = "EventResponseUserView.kt", i = {}, l = {84}, m = "invokeSuspend", n = {}, s = {})
public final class EventResponseUserView$bind$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ C105365Uq $contactPhotoLoader;
    public final /* synthetic */ AnonymousClass1T5 $userItem;
    public int label;
    public final /* synthetic */ C19310zD this$0;

    @DebugMetadata(c = "com.whatsapp.events.EventResponseUserView$bind$1$1", f = "EventResponseUserView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.events.EventResponseUserView$bind$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C75003pT implements AnonymousClass4GR {
        public int label;

        public final Object A09(Object obj) {
            C51652kA r2;
            if (this.label == 0) {
                C57682u2.A01(obj);
                C105365Uq.this.A08(r7.A0G, A0A);
                C19310zD r5 = r7;
                AnonymousClass3ZH r4 = A0A;
                C95814uZ r1 = r8.A01;
                if (C56972sr.A08(r5.getMeManager(), r4)) {
                    r2 = new C51652kA(r5.getContext().getString(R.string.f11nameremoved), (String) null);
                } else {
                    int A0A = r5.getWaContactNames().A0A(r1);
                    AnonymousClass7HU A0D = r5.getWaContactNames().A0D(r4, A0A, false, true);
                    C162457s7.A0D(A0D);
                    r2 = new C51652kA(A0D.A01, r5.getWaContactNames().A0G(A0D.A00, r4, A0A));
                }
                C19310zD.A00(r2, r7, r8.A03);
                C19310zD r12 = r7;
                Long l = r8.A03;
                if (l == null) {
                    r12.A0E.setVisibility(8);
                } else {
                    WaTextView waTextView = r12.A0E;
                    r12.getTime();
                    waTextView.setText(C107565bW.A03(r12.getWhatsAppLocale(), r12.getTime().A0I(l.longValue())));
                    waTextView.setVisibility(0);
                }
                C19310zD r22 = r7;
                if (r8.A00.ordinal() != 1) {
                    r22.A0F.A06(8);
                } else {
                    AnonymousClass5UY r23 = r22.A0F;
                    ((TextView) r23.A04()).setText(R.string.f11nameremoved);
                    r23.A06(0);
                }
                r7.setUpContextMenu(r8);
                return C59022wD.A00;
            }
            throw AnonymousClass001.A0d();
        }

        public final C84814Du A0A(Object obj, C84814Du r8) {
            return new AnonymousClass1(A0A, r7, r8, r8);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return C59022wD.A00(obj2, obj, this);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EventResponseUserView$bind$1(C105365Uq r2, C19310zD r3, AnonymousClass1T5 r4, C84814Du r5) {
        super(r5, 2);
        this.this$0 = r3;
        this.$userItem = r4;
        this.$contactPhotoLoader = r2;
    }

    public final Object A09(Object obj) {
        final AnonymousClass3ZH A0A;
        AnonymousClass218 r2 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            C19310zD r4 = this.this$0;
            UserJid userJid = this.$userItem.A02;
            if (r4.getMeManager().A0a(userJid)) {
                A0A = C56972sr.A01(r4.getMeManager());
                C626936e.A06(A0A);
                C162457s7.A0D(A0A);
            } else {
                A0A = r4.getContactManager().A0A(userJid);
            }
            C73853gB mainDispatcher = this.this$0.getMainDispatcher();
            final C105365Uq r5 = this.$contactPhotoLoader;
            final C19310zD r7 = this.this$0;
            final AnonymousClass1T5 r8 = this.$userItem;
            AnonymousClass1 r42 = new AnonymousClass1((C84814Du) null);
            this.label = 1;
            if (C616131n.A00(this, mainDispatcher, r42) == r2) {
                return r2;
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        return C59022wD.A00;
    }

    public final C84814Du A0A(Object obj, C84814Du r6) {
        return new EventResponseUserView$bind$1(this.$contactPhotoLoader, this.this$0, this.$userItem, r6);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
