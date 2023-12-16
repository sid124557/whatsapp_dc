package X;

import android.view.View;
import com.whatsapp.R;
import com.whatsapp.conversation.conversationrow.ConversationRowAudioPreview;
import com.whatsapp.search.views.itemviews.AudioPlayerView;

/* renamed from: X.684  reason: invalid class name */
public class AnonymousClass684 extends C113115ku {
    public Object A00;
    public Object A01;
    public final int A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass684(C182298oB r2, C182308oC r3, C182308oC r4, C97924zW r5, AudioPlayerView audioPlayerView) {
        super((ConversationRowAudioPreview) null, r2, r3, audioPlayerView);
        this.A02 = 3;
        this.A00 = r5;
        this.A01 = r4;
    }

    public C30721mu B7W() {
        switch (this.A02) {
            case 0:
                return (C30721mu) ((C30471mV) ((C93324oK) this.A00).A0S);
            case 2:
                C30721mu r0 = ((C98044zj) this.A01).A09;
                C162457s7.A0D(r0);
                return r0;
            default:
                return ((C98044zj) this.A00).A09;
        }
    }

    public void BRl(boolean z) {
        Object obj;
        View findViewById;
        switch (this.A02) {
            case 0:
                if (((C116095pj) this.A01).A0c == null && (findViewById = C111095hX.A04((View) this.A00).findViewById(R.id.proximity_overlay)) != null) {
                    findViewById.setVisibility(C86634Kw.A01(z ? 1 : 0));
                    return;
                }
                return;
            case 2:
                C116095pj A002 = ((C98044zj) this.A01).A03.A00();
                if (A002 != null && A002.A0c == null) {
                    obj = this.A00;
                    break;
                } else {
                    return;
                }
                break;
            default:
                C116095pj A003 = ((C98044zj) this.A00).A03.A00();
                if (A003 != null && A003.A0c == null) {
                    obj = this.A01;
                    break;
                } else {
                    return;
                }
        }
        ((C182308oC) obj).BbU(z);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: X.4zW} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: X.4zX} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: X.4zW} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: X.4zW} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bcm(int r3, boolean r4) {
        /*
            r2 = this;
            int r0 = r2.A02
            switch(r0) {
                case 2: goto L_0x0009;
                case 3: goto L_0x001f;
                default: goto L_0x0005;
            }
        L_0x0005:
            super.Bcm(r3, r4)
        L_0x0008:
            return
        L_0x0009:
            super.Bcm(r3, r4)
            java.lang.Object r1 = r2.A01
            X.4zX r1 = (X.AnonymousClass4zX) r1
            boolean r0 = r1.A0D
            if (r0 == 0) goto L_0x0008
            com.whatsapp.search.views.itemviews.VoiceNoteProfileAvatarView r0 = r1.A0A
            if (r0 != 0) goto L_0x002c
            java.lang.String r0 = "newsletterAudioProfileAvatarView"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x001f:
            super.Bcm(r3, r4)
            java.lang.Object r1 = r2.A00
            X.4zW r1 = (X.C97924zW) r1
            boolean r0 = r1.A0D
            if (r0 == 0) goto L_0x0008
            com.whatsapp.search.views.itemviews.VoiceNoteProfileAvatarView r0 = r1.A0A
        L_0x002c:
            X.C87414Qt.A01(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass684.Bcm(int, boolean):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass684(ConversationRowAudioPreview conversationRowAudioPreview, C182298oB r2, C182308oC r3, AudioPlayerView audioPlayerView, Object obj, Object obj2, int i) {
        super(conversationRowAudioPreview, r2, r3, audioPlayerView);
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass684(C182298oB r2, C182308oC r3, AnonymousClass4zX r4, AudioPlayerView audioPlayerView) {
        super((ConversationRowAudioPreview) null, r2, r3, audioPlayerView);
        this.A02 = 2;
        this.A00 = r3;
        this.A01 = r4;
    }
}
