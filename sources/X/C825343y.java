package X;

import com.whatsapp.xfamily.accountlinking.ui.AccountLinkingWebAuthActivity;

/* renamed from: X.43y  reason: invalid class name and case insensitive filesystem */
public final class C825343y extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ C48792fU $delayedProgressSpinner;
    public final /* synthetic */ AccountLinkingWebAuthActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C825343y(AccountLinkingWebAuthActivity accountLinkingWebAuthActivity, C48792fU r3) {
        super(1);
        this.this$0 = accountLinkingWebAuthActivity;
        this.$delayedProgressSpinner = r3;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [X.59i, java.lang.Integer] */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r1v3 */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r1v5 */
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ? r1;
        int i;
        C108895dj r8 = (C108895dj) obj;
        C162457s7.A0J(r8, 0);
        C106245Ye.A00("AccountLinkingWebAuthActivity/handleRedirectUriDeepLink Received access token. Linking Account");
        AccountLinkingWebAuthActivity accountLinkingWebAuthActivity = this.this$0;
        C48792fU r2 = this.$delayedProgressSpinner;
        try {
            C56042rK r6 = accountLinkingWebAuthActivity.A04;
            if (r6 != null) {
                AnonymousClass21S r5 = AccountLinkingWebAuthActivity.A0B;
                C51132jK r4 = new C51132jK(r8);
                C18260x0.A1N(C18270x1.A0X(r5), "FbAccountManager/linkAccount called by ", r5);
                C617031x.A01(new C81293ze(r4, r6.A01), 2);
                AccountLinkingWebAuthActivity accountLinkingWebAuthActivity2 = this.this$0;
                C69263Wi.A06(accountLinkingWebAuthActivity2.A05, accountLinkingWebAuthActivity2, this.$delayedProgressSpinner, 49);
                return C59022wD.A00;
            }
            throw C18270x1.A0S("fbAccountManager");
        } catch (AnonymousClass57K unused) {
            accountLinkingWebAuthActivity.A74((C1000759i) null, r2, 190, (Integer) null);
        } catch (AnonymousClass57O unused2) {
            r1 = 0;
            i = 459;
            accountLinkingWebAuthActivity.A74(r1, r2, r1, Integer.valueOf(i));
        } catch (AnonymousClass57N unused3) {
            r1 = 0;
            i = 464;
            accountLinkingWebAuthActivity.A74(r1, r2, r1, Integer.valueOf(i));
        } catch (AnonymousClass57J unused4) {
            r1 = 0;
            i = 467;
            accountLinkingWebAuthActivity.A74(r1, r2, r1, Integer.valueOf(i));
        } catch (AnonymousClass57H unused5) {
            r1 = 0;
            i = 463;
            accountLinkingWebAuthActivity.A74(r1, r2, r1, Integer.valueOf(i));
        } catch (C1000759i unused6) {
            accountLinkingWebAuthActivity.A74((C1000759i) null, r2, (Integer) null, (Integer) null);
        }
    }
}
