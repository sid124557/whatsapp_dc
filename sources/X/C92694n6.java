package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.conversation.conversationrow.ConversationRowContactInfoLinkedAccount;
import com.whatsapp.conversation.conversationrow.ConversationRowViewInstagramPosts;
import com.whatsapp.jid.UserJid;
import com.whatsapp.wds.components.button.WDSButton;
import org.json.JSONObject;

/* renamed from: X.4n6  reason: invalid class name and case insensitive filesystem */
public final class C92694n6 extends C93134nx {
    public C52842m8 A00;
    public AnonymousClass2O2 A01;
    public AnonymousClass5GF A02;
    public C153127ai A03;
    public C989153s A04;
    public AnonymousClass65M A05;
    public boolean A06;
    public final View A07 = C18290x4.A0M(this, R.id.linked_account_separator);
    public final C89644eZ A08;
    public final ConversationRowContactInfoLinkedAccount A09 = ((ConversationRowContactInfoLinkedAccount) C18290x4.A0M(this, R.id.linked_account_fb));
    public final ConversationRowContactInfoLinkedAccount A0A = ((ConversationRowContactInfoLinkedAccount) C18290x4.A0M(this, R.id.linked_account_ig));
    public final ConversationRowViewInstagramPosts A0B;
    public final C44862Xt A0C;
    public final C620733j A0D;
    public final AnonymousClass1k8 A0E;
    public final C30341mI A0F;
    public final WDSButton A0G;

    public final void setFlowsEntrypointMetadataCache(AnonymousClass2O2 r2) {
        C162457s7.A0J(r2, 0);
        this.A01 = r2;
    }

    public final void setLinkedAccountMediaCacheManager(C989153s r2) {
        C162457s7.A0J(r2, 0);
        this.A04 = r2;
    }

    public final void setLinkedAccountMediaGraphQLServiceFactory(AnonymousClass65M r2) {
        C162457s7.A0J(r2, 0);
        this.A05 = r2;
    }

    public final void setLinkedAccountMediaImageLoader(C153127ai r2) {
        C162457s7.A0J(r2, 0);
        this.A03 = r2;
    }

    public final void setStartFlowPrototypeUtil(AnonymousClass5GF r2) {
        C162457s7.A0J(r2, 0);
        this.A02 = r2;
    }

    public void A0v() {
        if (!this.A06) {
            this.A06 = true;
            C88864av A0C2 = C87094Nz.A0C(this);
            C64333Db r1 = A0C2.A0K;
            C87094Nz.A0W(r1, this);
            C87094Nz.A0X(r1, this);
            C87094Nz.A0Y(r1, this);
            C87094Nz.A0Z(r1, this);
            C87094Nz.A0a(r1, this, C87094Nz.A0D(r1));
            C116985rC A0A2 = C87094Nz.A0A(r1, this);
            C87094Nz.A0R(r1, r1.A00, this);
            C87094Nz.A0M(A0A2, r1, this, r1.A4V);
            C88834as r2 = A0C2.A0I;
            C87094Nz.A0Q(r2, r1, this);
            C87094Nz.A0b(r1, this, C87094Nz.A0E(r1));
            C87094Nz.A0I(A0A2, r1, A0C2, this, C86604Kt.A0i(r1));
            C87094Nz.A0L(A0A2, r1, this);
            C87094Nz.A0N(A0A2, r1, this);
            C87094Nz.A0J(A0A2, r1, A0C2, this);
            this.A01 = C86604Kt.A0Q(r1);
            this.A00 = C86634Kw.A0W(r1);
            this.A02 = C86604Kt.A0S(r1);
            this.A05 = (AnonymousClass65M) r2.A25.get();
            this.A04 = (C989153s) r1.A00.A6x.get();
            this.A03 = (C153127ai) r1.A00.A6w.get();
            this.A02 = r2.ACQ();
            this.A01 = (AnonymousClass2O2) r1.AFe.get();
        }
    }

    public final C52842m8 A26() {
        C51512jw r0;
        UserJid A072 = AnonymousClass3ZH.A07(this.A09);
        if (A072 == null || (r0 = (C51512jw) this.A0E.A01(A072)) == null) {
            return null;
        }
        JSONObject jSONObject = r0.A01;
        return new C52842m8(Long.valueOf(jSONObject.optLong("biz_creation_date")), jSONObject.optString("fb_follower_count"), jSONObject.optString("ig_follower_count"), jSONObject.optBoolean("show_ig_posts", false));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0053, code lost:
        if (r0 == false) goto L_0x0055;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A27(X.C108775dX r12, com.whatsapp.conversation.conversationrow.ConversationRowContactInfoLinkedAccount r13, java.lang.String r14) {
        /*
            r11 = this;
            if (r14 == 0) goto L_0x0094
            int r0 = r14.length()
            if (r0 == 0) goto L_0x0094
            if (r12 == 0) goto L_0x0012
            int r0 = r12.A00
            if (r0 <= 0) goto L_0x0012
            java.lang.String r14 = java.lang.String.valueOf(r0)
        L_0x0012:
            X.33j r1 = r11.A0D
            r7 = 1
            X.C162457s7.A0J(r1, r7)
            r6 = 0
            if (r14 == 0) goto L_0x008f
            int r0 = r14.length()
            if (r0 == 0) goto L_0x008f
            r13.setVisibility(r6)
            long r3 = java.lang.Long.parseLong(r14)
            r5 = 2131755028(0x7f100014, float:1.9140924E38)
            java.lang.String r10 = X.AnonymousClass5VH.A01(r1, r3)
            X.C162457s7.A0D(r10)
            java.lang.String r2 = X.AnonymousClass5VH.A00(r3)
            java.lang.String r9 = "info"
            if (r2 == 0) goto L_0x0065
            int r1 = r2.hashCode()
            r0 = 66
            if (r1 == r0) goto L_0x0078
            r0 = 75
            if (r1 == r0) goto L_0x006e
            r0 = 77
            if (r1 != r0) goto L_0x0055
            java.lang.String r0 = "M"
            boolean r0 = r2.equals(r0)
            r2 = 2131888110(0x7f1207ee, float:1.9410846E38)
        L_0x0053:
            if (r0 != 0) goto L_0x0056
        L_0x0055:
            r2 = 0
        L_0x0056:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r10)
            android.content.Context r0 = r13.getContext()
            X.AnonymousClass0x2.A0s(r0, r1, r2)
            java.lang.String r10 = r1.toString()
        L_0x0065:
            com.whatsapp.WaTextView r8 = r13.A01
            if (r8 != 0) goto L_0x0082
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r9)
            throw r0
        L_0x006e:
            java.lang.String r0 = "K"
            boolean r0 = r2.equals(r0)
            r2 = 2131888109(0x7f1207ed, float:1.9410844E38)
            goto L_0x0053
        L_0x0078:
            java.lang.String r0 = "B"
            boolean r0 = r2.equals(r0)
            r2 = 2131888108(0x7f1207ec, float:1.9410842E38)
            goto L_0x0053
        L_0x0082:
            android.content.res.Resources r2 = X.C18290x4.A0G(r13)
            int r1 = (int) r3
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r6] = r10
            X.C86614Ku.A16(r2, r8, r0, r5, r1)
            return
        L_0x008f:
            r0 = 8
            r13.setVisibility(r0)
        L_0x0094:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C92694n6.A27(X.5dX, com.whatsapp.conversation.conversationrow.ConversationRowContactInfoLinkedAccount, java.lang.String):void");
    }

    public final AnonymousClass2O2 getFlowsEntrypointMetadataCache() {
        AnonymousClass2O2 r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("flowsEntrypointMetadataCache");
    }

    public final C989153s getLinkedAccountMediaCacheManager() {
        C989153s r0 = this.A04;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("linkedAccountMediaCacheManager");
    }

    public final AnonymousClass65M getLinkedAccountMediaGraphQLServiceFactory() {
        AnonymousClass65M r0 = this.A05;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("linkedAccountMediaGraphQLServiceFactory");
    }

    public final C153127ai getLinkedAccountMediaImageLoader() {
        C153127ai r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("linkedAccountMediaImageLoader");
    }

    public final AnonymousClass5GF getStartFlowPrototypeUtil() {
        AnonymousClass5GF r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("startFlowPrototypeUtil");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C92694n6(Context context, AnonymousClass677 r4, C44862Xt r5, C620733j r6, AnonymousClass1k8 r7, C30341mI r8) {
        super(context, r4, r8);
        C18260x0.A0Q(r6, context);
        A0v();
        this.A0D = r6;
        this.A0F = r8;
        this.A0E = r7;
        this.A0C = r5;
        Activity A002 = C111095hX.A00(context);
        C162457s7.A0K(A002, "null cannot be cast to non-null type com.whatsapp.WaBaseActivity");
        this.A08 = (C89644eZ) A002;
        C109345eT.A00(this.A04, this, 18);
        this.A0B = (ConversationRowViewInstagramPosts) C18290x4.A0M(this, R.id.view_instagram_posts_container);
        this.A0G = (WDSButton) C18290x4.A0M(this, R.id.flows_cta_button);
        C107555bV.A05(this, this.A0M, 0, 0);
        A25();
    }

    public int getLayout() {
        return R.layout.f8nameremoved;
    }
}
