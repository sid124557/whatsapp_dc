package com.whatsapp.conversation.comments;

import X.AnonymousClass001;
import X.AnonymousClass0Y8;
import X.AnonymousClass218;
import X.AnonymousClass3ZH;
import X.AnonymousClass4GR;
import X.AnonymousClass5YB;
import X.C106905aM;
import X.C162457s7;
import X.C28011fL;
import X.C56892sj;
import X.C56972sr;
import X.C57682u2;
import X.C59022wD;
import X.C60842zG;
import X.C616131n;
import X.C624134x;
import X.C73853gB;
import X.C75003pT;
import X.C84814Du;
import X.C86624Kv;
import X.C95814uZ;
import android.content.Context;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.jid.UserJid;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.conversation.comments.ContactName$bind$1", f = "ContactName.kt", i = {}, l = {67}, m = "invokeSuspend", n = {}, s = {})
public final class ContactName$bind$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ C624134x $message;
    public int label;
    public final /* synthetic */ ContactName this$0;

    @DebugMetadata(c = "com.whatsapp.conversation.comments.ContactName$bind$1$1", f = "ContactName.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.conversation.comments.ContactName$bind$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C75003pT implements AnonymousClass4GR {
        public int label;

        public final Object A09(Object obj) {
            int A04;
            if (this.label == 0) {
                C57682u2.A01(obj);
                Context context = ContactName.this.getContext();
                ContactName contactName = ContactName.this;
                AnonymousClass5YB r4 = new AnonymousClass5YB(context, contactName, contactName.getWaContactNames(), ContactName.this.getWhatsAppLocale(), ContactName.this.getChatsCache(), ContactName.this.getAbProps());
                C56892sj groupParticipantsManager = ContactName.this.getGroupParticipantsManager();
                C95814uZ r2 = r7.A1J.A00;
                C162457s7.A0K(r2, "null cannot be cast to non-null type com.whatsapp.jid.MultipleParticipantJid");
                C95814uZ r1 = A0n;
                C162457s7.A0K(r1, "null cannot be cast to non-null type com.whatsapp.jid.UserJid");
                C60842zG A0J = C86624Kv.A0J(groupParticipantsManager, (C28011fL) r2, (UserJid) r1);
                ContactName contactName2 = ContactName.this;
                if (A0J != null) {
                    A04 = C86624Kv.A00(contactName2.getResources(), A0J);
                } else {
                    A04 = AnonymousClass0Y8.A04(contactName2.getContext(), R.color.f5nameremoved);
                }
                TextEmojiLabel textEmojiLabel = r4.A02;
                textEmojiLabel.setTextColor(A04);
                C106905aM.A04(textEmojiLabel);
                if (r7.A1J.A02) {
                    r4.A05();
                } else {
                    r4.A08(A0A);
                }
                ContactName contactName3 = ContactName.this;
                contactName3.setTextSize(contactName3.getConversationFont().A02(ContactName.this.getResources()));
                return C59022wD.A00;
            }
            throw AnonymousClass001.A0d();
        }

        public final C84814Du A0A(Object obj, C84814Du r8) {
            ContactName contactName = ContactName.this;
            C624134x r4 = r7;
            return new AnonymousClass1(A0A, A0n, r4, r8);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return C59022wD.A00(obj2, obj, this);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ContactName$bind$1(ContactName contactName, C624134x r3, C84814Du r4) {
        super(r4, 2);
        this.$message = r3;
        this.this$0 = contactName;
    }

    public final Object A09(Object obj) {
        final C95814uZ A0n;
        final AnonymousClass3ZH A0A;
        AnonymousClass218 r1 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            C624134x r3 = this.$message;
            if (r3.A1J.A02) {
                A0n = C56972sr.A04(this.this$0.getMeManager());
            } else {
                A0n = r3.A0n();
            }
            if (this.$message.A1J.A02) {
                A0A = C56972sr.A01(this.this$0.getMeManager());
            } else if (A0n != null) {
                A0A = this.this$0.getContactManager().A0A(A0n);
            }
            if (A0A != null) {
                C73853gB mainDispatcher = this.this$0.getMainDispatcher();
                final ContactName contactName = this.this$0;
                final C624134x r7 = this.$message;
                AnonymousClass1 r32 = new AnonymousClass1((C84814Du) null);
                this.label = 1;
                if (C616131n.A00(this, mainDispatcher, r32) == r1) {
                    return r1;
                }
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        return C59022wD.A00;
    }

    public final C84814Du A0A(Object obj, C84814Du r5) {
        return new ContactName$bind$1(this.this$0, this.$message, r5);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
