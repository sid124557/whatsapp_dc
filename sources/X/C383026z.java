package X;

import android.os.Bundle;
import com.whatsapp.community.CommunityPendingSuggestionsConfirmationDialog;

/* renamed from: X.26z  reason: invalid class name and case insensitive filesystem */
public class C383026z extends AnonymousClass8V2 implements AnonymousClass4GQ {
    public final int A00;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C383026z(java.lang.Object r8, int r9) {
        /*
            r7 = this;
            r0 = r7
            r7.A00 = r9
            switch(r9) {
                case 0: goto L_0x0015;
                case 1: goto L_0x001e;
                case 2: goto L_0x0025;
                case 3: goto L_0x002e;
                case 4: goto L_0x0035;
                case 5: goto L_0x003e;
                case 6: goto L_0x0045;
                case 7: goto L_0x004e;
                case 8: goto L_0x0057;
                case 9: goto L_0x0060;
                case 10: goto L_0x0069;
                case 11: goto L_0x0072;
                case 12: goto L_0x007b;
                case 13: goto L_0x0084;
                case 14: goto L_0x008b;
                case 15: goto L_0x0093;
                case 16: goto L_0x009d;
                case 17: goto L_0x00a7;
                case 18: goto L_0x00af;
                case 19: goto L_0x00b7;
                case 20: goto L_0x00bf;
                case 21: goto L_0x00c7;
                case 22: goto L_0x00cf;
                case 23: goto L_0x00d7;
                case 24: goto L_0x00e1;
                case 25: goto L_0x00e9;
                case 26: goto L_0x00f1;
                case 27: goto L_0x00f9;
                case 28: goto L_0x0101;
                case 29: goto L_0x010b;
                case 30: goto L_0x0113;
                case 31: goto L_0x011b;
                case 32: goto L_0x0123;
                case 33: goto L_0x012b;
                case 34: goto L_0x0133;
                case 35: goto L_0x013b;
                default: goto L_0x0006;
            }
        L_0x0006:
            java.lang.Class<com.whatsapp.waffle.wfac.ui.WfacBanActivity> r3 = com.whatsapp.waffle.wfac.ui.WfacBanActivity.class
            java.lang.String r4 = "transitionToScreen"
            java.lang.String r5 = "transitionToScreen(I)V"
        L_0x000e:
            r1 = 1
            r6 = 0
            r2 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        L_0x0015:
            java.lang.Class<com.whatsapp.bonsai.BonsaiSystemMessageBottomSheet> r3 = com.whatsapp.bonsai.BonsaiSystemMessageBottomSheet.class
            java.lang.String r4 = "onTypeChanged"
            java.lang.String r5 = "onTypeChanged(Lcom/whatsapp/bonsai/BonsaiSystemMessageBottomSheetViewModel$Type;)V"
            goto L_0x000e
        L_0x001e:
            java.lang.Class<com.whatsapp.bonsai.discovery.BonsaiDiscoveryViewModel> r3 = com.whatsapp.bonsai.discovery.BonsaiDiscoveryViewModel.class
            java.lang.String r4 = "loadContacts"
            java.lang.String r5 = "loadContacts(Lcom/whatsapp/bonsai/sync/discovery/DiscoveryBots;)V"
            goto L_0x000e
        L_0x0025:
            java.lang.Class<X.2cg> r3 = X.C47082cg.class
            java.lang.String r4 = "needRequestProfilePhoto"
            java.lang.String r5 = "needRequestProfilePhoto(Lcom/whatsapp/jid/UserJid;)Z"
            goto L_0x000e
        L_0x002e:
            java.lang.Class<X.4E1> r3 = X.AnonymousClass4E1.class
            java.lang.String r4 = "fromJson"
            java.lang.String r5 = "fromJson(Lorg/json/JSONObject;)Ljava/lang/Object;"
            goto L_0x000e
        L_0x0035:
            java.lang.Class<X.4E1> r3 = X.AnonymousClass4E1.class
            java.lang.String r4 = "toJson"
            java.lang.String r5 = "toJson(Ljava/lang/Object;)Lorg/json/JSONObject;"
            goto L_0x000e
        L_0x003e:
            java.lang.Class<X.1NN> r3 = X.AnonymousClass1NN.class
            java.lang.String r4 = "fillResponseStatus"
            java.lang.String r5 = "fillResponseStatus(Lcom/whatsapp/event/fmessage/FMessageEvent;)V"
            goto L_0x000e
        L_0x0045:
            java.lang.Class<com.whatsapp.community.CommunitySettingsActivity> r3 = com.whatsapp.community.CommunitySettingsActivity.class
            java.lang.String r4 = "updateAllow"
            java.lang.String r5 = "updateAllow(Lcom/whatsapp/community/communitysettings/uiState/AllowNonAdminSubgroupCreationUiState;)V"
            goto L_0x000e
        L_0x004e:
            java.lang.Class<com.whatsapp.community.CommunitySettingsActivity> r3 = com.whatsapp.community.CommunitySettingsActivity.class
            java.lang.String r4 = "updateMembersAddSettingRow"
            java.lang.String r5 = "updateMembersAddSettingRow(Z)V"
            goto L_0x000e
        L_0x0057:
            java.lang.Class<com.whatsapp.community.CommunitySettingsActivity> r3 = com.whatsapp.community.CommunitySettingsActivity.class
            java.lang.String r4 = "updatePendingGroupsDialog"
            java.lang.String r5 = "updatePendingGroupsDialog(Lcom/whatsapp/community/communitysettings/uiState/PendingGroupsDialogUiState;)V"
            goto L_0x000e
        L_0x0060:
            java.lang.Class<X.2xM> r3 = X.C59712xM.class
            java.lang.String r4 = "onParentClick"
            java.lang.String r5 = "onParentClick(Lcom/whatsapp/jid/GroupJid;)V"
            goto L_0x000e
        L_0x0069:
            java.lang.Class<X.2xM> r3 = X.C59712xM.class
            java.lang.String r4 = "onParentLongClick"
            java.lang.String r5 = "onParentLongClick(Lcom/whatsapp/jid/GroupJid;)Z"
            goto L_0x000e
        L_0x0072:
            java.lang.Class<com.whatsapp.community.communitysettings.AllowNonAdminMembersAddBottomSheet> r3 = com.whatsapp.community.communitysettings.AllowNonAdminMembersAddBottomSheet.class
            java.lang.String r4 = "updateRadioButtons"
            java.lang.String r5 = "updateRadioButtons(Z)V"
            goto L_0x000e
        L_0x007b:
            java.lang.Class<com.whatsapp.community.communitysettings.AllowNonAdminSubgroupCreationBottomSheet> r3 = com.whatsapp.community.communitysettings.AllowNonAdminSubgroupCreationBottomSheet.class
            java.lang.String r4 = "updateAllow"
            java.lang.String r5 = "updateAllow(Lcom/whatsapp/community/communitysettings/uiState/AllowNonAdminSubgroupCreationUiState;)V"
            goto L_0x000e
        L_0x0084:
            java.lang.Class<X.2Pe> r3 = X.C42702Pe.class
            java.lang.String r4 = "handleData"
            java.lang.String r5 = "handleData(Lcom/whatsapp/infra/graphql/generated/groups/QuerySuggestedGroupsResponseImpl;)V"
            goto L_0x000e
        L_0x008b:
            java.lang.Class<X.2Pe> r3 = X.C42702Pe.class
            java.lang.String r4 = "handleError"
            java.lang.String r5 = "handleError(Lcom/whatsapp/infra/graphql/error/MexErrorSummary;)Z"
            goto L_0x000e
        L_0x0093:
            java.lang.Class<X.2Y8> r3 = X.AnonymousClass2Y8.class
            java.lang.String r4 = "ratingParser"
            java.lang.String r5 = "ratingParser(Lorg/json/JSONObject;)Lcom/whatsapp/protocol/message/interactive/layout/Element;"
            goto L_0x000e
        L_0x009d:
            java.lang.Class<X.11L> r3 = X.AnonymousClass11L.class
            java.lang.String r4 = "updateResponseItems"
            java.lang.String r5 = "updateResponseItems(Lcom/whatsapp/event/fmessage/FMessageEvent;)V"
            goto L_0x000e
        L_0x00a7:
            java.lang.Class<X.2Q2> r3 = X.AnonymousClass2Q2.class
            java.lang.String r4 = "handleGetTextStatusData"
            java.lang.String r5 = "handleGetTextStatusData(Lcom/whatsapp/infra/graphql/generated/textstatus/GetTextStatusListResponse;)V"
            goto L_0x000e
        L_0x00af:
            java.lang.Class<X.2Q2> r3 = X.AnonymousClass2Q2.class
            java.lang.String r4 = "handleGetTextStatusError"
            java.lang.String r5 = "handleGetTextStatusError(Lcom/whatsapp/infra/graphql/error/MexErrorSummary;)Z"
            goto L_0x000e
        L_0x00b7:
            java.lang.Class<X.2pb> r3 = X.C54982pb.class
            java.lang.String r4 = "handleGetTextStatusData"
            java.lang.String r5 = "handleGetTextStatusData(Lcom/whatsapp/infra/graphql/generated/textstatus/GetTextStatusListResponse;)V"
            goto L_0x000e
        L_0x00bf:
            java.lang.Class<X.2pb> r3 = X.C54982pb.class
            java.lang.String r4 = "handleGetTextStatusError"
            java.lang.String r5 = "handleGetTextStatusError(Lcom/whatsapp/infra/graphql/error/MexErrorSummary;)Z"
            goto L_0x000e
        L_0x00c7:
            java.lang.Class<X.2pb> r3 = X.C54982pb.class
            java.lang.String r4 = "handleSetTextStatusData"
            java.lang.String r5 = "handleSetTextStatusData(Lcom/whatsapp/infra/graphql/generated/textstatus/UpdateTextStatusResponse;)V"
            goto L_0x000e
        L_0x00cf:
            java.lang.Class<X.2pb> r3 = X.C54982pb.class
            java.lang.String r4 = "handleSetTextStatusError"
            java.lang.String r5 = "handleSetTextStatusError(Lcom/whatsapp/infra/graphql/error/MexErrorSummary;)Z"
            goto L_0x000e
        L_0x00d7:
            java.lang.Class<com.whatsapp.expressionstray.stickers.SearchFunStickersBottomSheet> r3 = com.whatsapp.expressionstray.stickers.SearchFunStickersBottomSheet.class
            java.lang.String r4 = "onReportClicked"
            java.lang.String r5 = "onReportClicked(Lcom/whatsapp/funstickers/data/model/FunStickerModel;)V"
            goto L_0x000e
        L_0x00e1:
            java.lang.Class<X.1gy> r3 = X.C28491gy.class
            java.lang.String r4 = "handleData"
            java.lang.String r5 = "handleData(Lcom/whatsapp/infra/graphql/generated/newsletter/NewsletterAdminMetadataQueryResponse;)V"
            goto L_0x000e
        L_0x00e9:
            java.lang.Class<X.1gy> r3 = X.C28491gy.class
            java.lang.String r4 = "handleError"
            java.lang.String r5 = "handleError(Lcom/whatsapp/infra/graphql/error/MexErrorSummary;)Z"
            goto L_0x000e
        L_0x00f1:
            java.lang.Class<X.1h0> r3 = X.AnonymousClass1h0.class
            java.lang.String r4 = "handleData"
            java.lang.String r5 = "handleData(Lcom/whatsapp/infra/graphql/generated/newsletter/NewsletterMetadataResponse;)V"
            goto L_0x000e
        L_0x00f9:
            java.lang.Class<X.1h0> r3 = X.AnonymousClass1h0.class
            java.lang.String r4 = "handleError"
            java.lang.String r5 = "handleError(Lcom/whatsapp/infra/graphql/error/MexErrorSummary;)Z"
            goto L_0x000e
        L_0x0101:
            java.lang.Class<X.2Zv> r3 = X.C45382Zv.class
            java.lang.String r4 = "onResponseError"
            java.lang.String r5 = "onResponseError(Lcom/whatsapp/infra/graphql/error/MexErrorSummary;)Z"
            goto L_0x000e
        L_0x010b:
            java.lang.Class<X.1gw> r3 = X.AnonymousClass1gw.class
            java.lang.String r4 = "handleResponse"
            java.lang.String r5 = "handleResponse(Lcom/whatsapp/infra/graphql/generated/newsletter/NewsletterReactionSendersListResponse;)V"
            goto L_0x000e
        L_0x0113:
            java.lang.Class<X.1gw> r3 = X.AnonymousClass1gw.class
            java.lang.String r4 = "handleError"
            java.lang.String r5 = "handleError(Lcom/whatsapp/infra/graphql/error/MexErrorSummary;)Z"
            goto L_0x000e
        L_0x011b:
            java.lang.Class<X.1gx> r3 = X.C28481gx.class
            java.lang.String r4 = "handleSubscribersResponse"
            java.lang.String r5 = "handleSubscribersResponse(Lcom/whatsapp/infra/graphql/generated/newsletter/NewsletterSubscribersResponse;)V"
            goto L_0x000e
        L_0x0123:
            java.lang.Class<X.1gx> r3 = X.C28481gx.class
            java.lang.String r4 = "handleErrors"
            java.lang.String r5 = "handleErrors(Lcom/whatsapp/infra/graphql/error/MexErrorSummary;)Z"
            goto L_0x000e
        L_0x012b:
            java.lang.Class<X.1gz> r3 = X.C28501gz.class
            java.lang.String r4 = "handleData"
            java.lang.String r5 = "handleData(Lcom/whatsapp/infra/graphql/generated/newsletter/NewsletterMetadataUpdateResponse;)V"
            goto L_0x000e
        L_0x0133:
            java.lang.Class<X.1gz> r3 = X.C28501gz.class
            java.lang.String r4 = "handleError"
            java.lang.String r5 = "handleError(Lcom/whatsapp/infra/graphql/error/MexErrorSummary;)Z"
            goto L_0x000e
        L_0x013b:
            java.lang.Class<com.whatsapp.payments.phoenix.flowconfigurationservice.activities.IndiaUpiFcsTransactionConfirmationActivity> r3 = com.whatsapp.payments.phoenix.flowconfigurationservice.activities.IndiaUpiFcsTransactionConfirmationActivity.class
            java.lang.String r4 = "renderView"
            java.lang.String r5 = "renderView(I)V"
            goto L_0x000e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C383026z.<init>(java.lang.Object, int):void");
    }

    public static final CommunityPendingSuggestionsConfirmationDialog A00(int i, int i2, int i3) {
        CommunityPendingSuggestionsConfirmationDialog communityPendingSuggestionsConfirmationDialog = new CommunityPendingSuggestionsConfirmationDialog();
        Bundle A08 = AnonymousClass002.A08();
        A08.putInt("dialogId", i);
        A08.putInt("availableGroups", i2);
        A08.putInt("totalPendingGroups", i3);
        communityPendingSuggestionsConfirmationDialog.A0u(A08);
        return communityPendingSuggestionsConfirmationDialog;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:191:0x0385, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:?, code lost:
        X.AnonymousClass2A8.A00(r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x0389, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x0438, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:?, code lost:
        X.AnonymousClass2A8.A00(r9, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x043c, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x043f, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x0440, code lost:
        X.AnonymousClass2A8.A00(r8, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x0443, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:372:0x0726, code lost:
        if (r1 != 3) goto L_0x0728;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:557:0x0b77, code lost:
        return java.lang.Boolean.valueOf(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:674:0x0e9d, code lost:
        return X.C59022wD.A00;
     */
    /* JADX WARNING: Removed duplicated region for block: B:376:0x072d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r21) {
        /*
            r20 = this;
            r2 = r21
            r1 = r20
            int r0 = r1.A00
            switch(r0) {
                case 0: goto L_0x0e6b;
                case 1: goto L_0x0e43;
                case 2: goto L_0x0e30;
                case 3: goto L_0x0e25;
                case 4: goto L_0x0e1c;
                case 5: goto L_0x0d4b;
                case 6: goto L_0x01e5;
                case 7: goto L_0x0d1e;
                case 8: goto L_0x0cf1;
                case 9: goto L_0x0cc9;
                case 10: goto L_0x0cac;
                case 11: goto L_0x0c8c;
                case 12: goto L_0x0c5f;
                case 13: goto L_0x0b78;
                case 14: goto L_0x0b53;
                case 15: goto L_0x0afb;
                case 16: goto L_0x0adf;
                case 17: goto L_0x0a48;
                case 18: goto L_0x0009;
                case 19: goto L_0x09cb;
                case 20: goto L_0x0009;
                case 21: goto L_0x098e;
                case 22: goto L_0x0976;
                case 23: goto L_0x095f;
                case 24: goto L_0x0761;
                case 25: goto L_0x0752;
                case 26: goto L_0x0644;
                case 27: goto L_0x05f1;
                case 28: goto L_0x05e2;
                case 29: goto L_0x0474;
                case 30: goto L_0x0444;
                case 31: goto L_0x026e;
                case 32: goto L_0x01c6;
                case 33: goto L_0x00aa;
                case 34: goto L_0x008f;
                case 35: goto L_0x0065;
                case 36: goto L_0x0018;
                default: goto L_0x0009;
            }
        L_0x0009:
            r3 = 0
            java.lang.StringBuilder r1 = X.C18280x3.A0g(r2, r3)
            java.lang.String r0 = "Error with GET - "
            X.C18260x0.A1Q(r1, r0, r2)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            return r0
        L_0x0018:
            int r2 = X.AnonymousClass001.A0K(r2)
            java.lang.Object r4 = r1.receiver
            X.03q r4 = (X.C003203q) r4
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "WfacBanActivity/transitionToScreen/transitioning to screen "
            java.lang.String r0 = X.AnonymousClass000.A0Y(r0, r1, r2)
            X.AnonymousClass356.A03(r0)
            r0 = 1
            r3 = 0
            if (r2 == r0) goto L_0x0054
            r0 = 2
            if (r2 == r0) goto L_0x004e
            r0 = 3
            if (r2 == r0) goto L_0x0048
            r2 = r3
        L_0x0038:
            X.0dc r1 = X.AnonymousClass0x2.A0J(r4)
            r0 = 2131429051(0x7f0b06bb, float:1.8479764E38)
            if (r2 != 0) goto L_0x005a
            java.lang.String r0 = "fragment"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0048:
            com.whatsapp.waffle.wfac.ui.WfacBanDecisionFragment r2 = new com.whatsapp.waffle.wfac.ui.WfacBanDecisionFragment
            r2.<init>()
            goto L_0x0038
        L_0x004e:
            com.whatsapp.waffle.wfac.ui.WfacUnbanDecisionFragment r2 = new com.whatsapp.waffle.wfac.ui.WfacUnbanDecisionFragment
            r2.<init>()
            goto L_0x0038
        L_0x0054:
            com.whatsapp.waffle.wfac.ui.WfacBanInfoFragment r2 = new com.whatsapp.waffle.wfac.ui.WfacBanInfoFragment
            r2.<init>()
            goto L_0x0038
        L_0x005a:
            r1.A0A(r2, r0)
            r1.A0I(r3)
            r1.A01()
            goto L_0x0e9b
        L_0x0065:
            int r2 = X.AnonymousClass001.A0K(r2)
            java.lang.Object r1 = r1.receiver
            com.whatsapp.payments.phoenix.flowconfigurationservice.activities.IndiaUpiFcsTransactionConfirmationActivity r1 = (com.whatsapp.payments.phoenix.flowconfigurationservice.activities.IndiaUpiFcsTransactionConfirmationActivity) r1
            r0 = 1
            if (r2 == r0) goto L_0x008b
            r0 = 2
            if (r2 == r0) goto L_0x008b
            r0 = 3
            if (r2 == r0) goto L_0x008b
            r0 = 4
            if (r2 != r0) goto L_0x0e9b
            com.whatsapp.WaTextView r1 = r1.A08
            if (r1 != 0) goto L_0x0085
            java.lang.String r0 = "secondaryStatus"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0085:
            r0 = 0
            r1.setVisibility(r0)
            goto L_0x0e9b
        L_0x008b:
            r1.A00 = r2
            goto L_0x0e9b
        L_0x008f:
            X.7nS r2 = (X.C160327nS) r2
            r3 = 0
            X.C162457s7.A0J(r2, r3)
            java.lang.Object r1 = r1.receiver
            X.1gz r1 = (X.C28501gz) r1
            boolean r0 = r1.isCancelled
            if (r0 != 0) goto L_0x0b73
            X.4DF r1 = r1.callback
            if (r1 == 0) goto L_0x0b73
            X.8SE r0 = X.C1452274r.A00(r2)
            r1.onError(r0)
            goto L_0x0b73
        L_0x00aa:
            X.7aq r2 = (X.C153197aq) r2
            r8 = 0
            X.C162457s7.A0J(r2, r8)
            java.lang.Object r6 = r1.receiver
            X.1gz r6 = (X.C28501gz) r6
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "UpdateNewsletterGraphqlJob/onResponse "
            X.C18260x0.A1P(r1, r0, r2)
            java.lang.String r1 = "xwa2_newsletter_update"
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataUpdateResponseImpl$Xwa2NewsletterUpdate> r0 = com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataUpdateResponseImpl.Xwa2NewsletterUpdate.class
            X.7aq r0 = r2.A00(r0, r1)
            if (r0 == 0) goto L_0x0e9b
            org.json.JSONObject r0 = r0.A00
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFieldsImpl r3 = new com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFieldsImpl
            r3.<init>(r0)
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$State r0 = r3.BDI()
            r7 = 0
            if (r0 == 0) goto L_0x00ec
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterStateType r1 = r0.BDy()
        L_0x00da:
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterStateType r0 = com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterStateType.ACTIVE
            java.lang.String r5 = "newsletterStore"
            if (r1 == r0) goto L_0x0126
            X.4uY r4 = r6.newsletterJid
            X.2sL r2 = r6.A03
            if (r2 != 0) goto L_0x00ee
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r5)
            throw r0
        L_0x00ec:
            r1 = r7
            goto L_0x00da
        L_0x00ee:
            X.2se r0 = r6.A05
            if (r0 != 0) goto L_0x00fa
            java.lang.String r0 = "newsletterManager"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x00fa:
            X.2g3 r1 = new X.2g3
            r1.<init>(r2, r4, r0)
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$State r0 = r3.BDI()
            if (r0 == 0) goto L_0x0124
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterStateType r0 = r0.BDy()
        L_0x0109:
            r1.A01(r0)
            X.4DF r1 = r6.callback
            if (r1 == 0) goto L_0x0e9b
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$State r0 = r3.BDI()
            if (r0 == 0) goto L_0x011a
            java.lang.String r7 = r0.toString()
        L_0x011a:
            X.6nF r0 = new X.6nF
            r0.<init>(r7, r8)
            r1.onError(r0)
            goto L_0x0e9b
        L_0x0124:
            r0 = r7
            goto L_0x0109
        L_0x0126:
            java.util.ArrayList r7 = X.AnonymousClass001.A0s()
            X.7r8 r2 = r6.A06
            java.lang.String r9 = "newsletterGraphqlUtil"
            if (r2 != 0) goto L_0x0136
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r9)
            throw r0
        L_0x0136:
            X.4uY r1 = r6.newsletterJid
            boolean r0 = r6.updatePicture
            if (r0 == 0) goto L_0x0154
            byte[] r0 = r6.picture
            if (r0 == 0) goto L_0x0143
            int r0 = r0.length
            if (r0 != 0) goto L_0x0154
        L_0x0143:
            r0 = 1
        L_0x0144:
            X.1RL r0 = r2.A0A(r3, r1, r0)
            r7.add(r0)
            X.2sL r0 = r6.A03
            if (r0 != 0) goto L_0x0156
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r5)
            throw r0
        L_0x0154:
            r0 = 0
            goto L_0x0144
        L_0x0156:
            r0.A0A(r7)
            boolean r0 = r6.updatePicture
            if (r0 == 0) goto L_0x01af
            X.3Ex r1 = r6.A00
            if (r1 != 0) goto L_0x0168
            java.lang.String r0 = "contactManager"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0168:
            X.4uY r0 = r6.newsletterJid
            X.3ZH r5 = r1.A07(r0)
            if (r5 == 0) goto L_0x01af
            byte[] r4 = r6.picture
            r3 = 1
            if (r4 == 0) goto L_0x0179
            int r0 = r4.length
            if (r0 == 0) goto L_0x0179
            r3 = 0
        L_0x0179:
            java.lang.String r2 = "contactPhotoHelper"
            X.2ro r1 = r6.A01
            if (r3 == 0) goto L_0x018a
            if (r1 != 0) goto L_0x0186
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r2)
            throw r0
        L_0x0186:
            r1.A03(r5)
            goto L_0x01a3
        L_0x018a:
            if (r1 != 0) goto L_0x0191
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r2)
            throw r0
        L_0x0191:
            r0 = 1
            r1.A05(r5, r4, r0)
            X.2ro r1 = r6.A01
            if (r1 != 0) goto L_0x019e
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r2)
            throw r0
        L_0x019e:
            byte[] r0 = r6.picture
            r1.A05(r5, r0, r8)
        L_0x01a3:
            X.2ro r0 = r6.A01
            if (r0 != 0) goto L_0x01ac
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r2)
            throw r0
        L_0x01ac:
            r0.A04(r5)
        L_0x01af:
            X.7r8 r0 = r6.A06
            if (r0 != 0) goto L_0x01b8
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r9)
            throw r0
        L_0x01b8:
            r0.A0E(r7)
            X.4DF r1 = r6.callback
            if (r1 == 0) goto L_0x0e9b
            X.4uY r0 = r6.newsletterJid
            r1.BX8(r0)
            goto L_0x0e9b
        L_0x01c6:
            r0 = 0
            X.C162457s7.A0J(r2, r0)
            java.lang.Object r1 = r1.receiver
            X.1gx r1 = (X.C28481gx) r1
            boolean r0 = r1.isCancelled
            if (r0 != 0) goto L_0x01df
            X.4Ao r0 = r1.callback
            if (r0 == 0) goto L_0x01df
            java.lang.String r1 = r2.toString()
            X.6nG r0 = new X.6nG
            r0.<init>(r1)
        L_0x01df:
            r0 = 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L_0x01e5:
            X.2jh r2 = (X.C51362jh) r2
            r11 = 0
            X.C162457s7.A0J(r2, r11)
            java.lang.Object r7 = r1.receiver
            com.whatsapp.community.CommunitySettingsActivity r7 = (com.whatsapp.community.CommunitySettingsActivity) r7
            X.20R r0 = r2.A00
            int r6 = r0.ordinal()
            r5 = 3
            r4 = 1
            r3 = 2
            if (r6 == r4) goto L_0x0211
            if (r6 != r11) goto L_0x0269
            r0 = 2131895772(0x7f1225dc, float:1.9426386E38)
        L_0x01ff:
            java.lang.CharSequence r1 = r7.getText(r0)
            X.C162457s7.A0D(r1)
            com.whatsapp.settings.SettingsRowIconText r0 = r7.A0H
            if (r0 != 0) goto L_0x0215
            java.lang.String r0 = "allowNonAdminSubgroupCreation"
            java.lang.RuntimeException r1 = X.C18270x1.A0S(r0)
            throw r1
        L_0x0211:
            r0 = 2131895774(0x7f1225de, float:1.942639E38)
            goto L_0x01ff
        L_0x0215:
            r0.setSubText(r1)
            X.21C r0 = r2.A01
            int r0 = r0.ordinal()
            if (r0 == r3) goto L_0x0260
            if (r0 != r5) goto L_0x0e9b
            r0 = 2131887996(0x7f12077c, float:1.9410615E38)
        L_0x0225:
            java.lang.String r1 = r7.getString(r0)
            if (r1 == 0) goto L_0x0e9b
            android.view.View r0 = r7.A00
            java.util.ArrayList r10 = X.AnonymousClass001.A0s()
            X.33i r9 = r7.A08
            X.4ab r8 = X.C88694ab.A01(r0, r1, r11)
            X.5fd r6 = new X.5fd
            r6.<init>(r7, r8, r9, r10, r11)
            r6.A01()
            X.66R r0 = r7.A0N
            java.lang.Object r0 = r0.getValue()
            com.whatsapp.community.communitysettings.viewmodel.CommunitySettingsViewModel r0 = (com.whatsapp.community.communitysettings.viewmodel.CommunitySettingsViewModel) r0
            X.107 r3 = r0.A0F
            java.lang.Object r0 = r3.A07()
            X.C162457s7.A0D(r0)
            X.2jh r0 = (X.C51362jh) r0
            X.21C r2 = X.AnonymousClass21C.IDLE
            X.20R r1 = r0.A00
            X.2jh r0 = new X.2jh
            r0.<init>(r1, r2)
            r3.A0G(r0)
            goto L_0x0e9b
        L_0x0260:
            r0 = 2131887995(0x7f12077b, float:1.9410613E38)
            if (r6 == r4) goto L_0x0225
            r0 = 2131887994(0x7f12077a, float:1.941061E38)
            goto L_0x0225
        L_0x0269:
            X.3f1 r1 = X.C73153f1.A00()
            throw r1
        L_0x026e:
            X.7aq r2 = (X.C153197aq) r2
            r0 = 0
            X.C162457s7.A0J(r2, r0)
            java.lang.Object r5 = r1.receiver
            X.1gx r5 = (X.C28481gx) r5
            boolean r1 = r5.isCancelled
            if (r1 != 0) goto L_0x0e9b
            java.lang.String r3 = "xwa2_newsletter_subscribers"
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NewsletterSubscribersResponseImpl$Xwa2NewsletterSubscribers> r1 = com.whatsapp.infra.graphql.generated.newsletter.NewsletterSubscribersResponseImpl.Xwa2NewsletterSubscribers.class
            X.7aq r3 = r2.A00(r1, r3)
            r15 = 0
            if (r3 == 0) goto L_0x02a3
            java.lang.String r2 = "subscribers"
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NewsletterSubscribersResponseImpl$Xwa2NewsletterSubscribers$Subscribers> r1 = com.whatsapp.infra.graphql.generated.newsletter.NewsletterSubscribersResponseImpl.Xwa2NewsletterSubscribers.Subscribers.class
            X.7aq r3 = r3.A00(r1, r2)
        L_0x0291:
            java.util.ArrayList r4 = X.AnonymousClass001.A0s()
            if (r3 == 0) goto L_0x0330
            X.2sH r1 = r5.A00
            if (r1 != 0) goto L_0x02a5
            java.lang.String r0 = "time"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x02a3:
            r3 = r15
            goto L_0x0291
        L_0x02a5:
            long r18 = r1.A0H()
            java.lang.String r2 = "edges"
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NewsletterSubscribersResponseImpl$Xwa2NewsletterSubscribers$Subscribers$Edges> r1 = com.whatsapp.infra.graphql.generated.newsletter.NewsletterSubscribersResponseImpl.Xwa2NewsletterSubscribers.Subscribers.Edges.class
            X.6aY r1 = r3.A02(r1, r2)
            X.8Nf r9 = r1.iterator()
        L_0x02b5:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L_0x0330
            java.lang.Object r3 = r9.next()
            X.7aq r3 = (X.C153197aq) r3
            X.32W r8 = com.whatsapp.jid.Jid.Companion
            java.lang.String r7 = "node"
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NewsletterSubscribersResponseImpl$Xwa2NewsletterSubscribers$Subscribers$Edges$Node> r6 = com.whatsapp.infra.graphql.generated.newsletter.NewsletterSubscribersResponseImpl.Xwa2NewsletterSubscribers.Subscribers.Edges.Node.class
            X.7aq r2 = r3.A00(r6, r7)
            java.lang.String r1 = "id"
            java.lang.String r1 = r2.A04(r1)
            com.whatsapp.jid.Jid r13 = r8.A03(r1)
            X.1fH r13 = (X.C27981fH) r13
            X.7aq r2 = r3.A00(r6, r7)
            java.lang.String r1 = "pn"
            java.lang.String r1 = r2.A04(r1)
            com.whatsapp.jid.Jid r2 = r8.A03(r1)
            com.whatsapp.jid.PhoneUserJid r2 = (com.whatsapp.jid.PhoneUserJid) r2
            if (r13 == 0) goto L_0x02fc
            if (r2 == 0) goto L_0x02fc
            X.2sM r1 = r5.A01
            if (r1 != 0) goto L_0x02f9
            java.lang.String r0 = "waJidMapRepository"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x02f9:
            r1.A09(r13, r2)
        L_0x02fc:
            X.4uY r14 = r5.newsletterJid
            X.7aq r2 = r3.A00(r6, r7)
            java.lang.String r1 = "display_name"
            java.lang.String r16 = r2.A04(r1)
            X.7r8 r1 = r5.A04
            if (r1 != 0) goto L_0x0314
            java.lang.String r0 = "newsletterGraphqlUtils"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0314:
            java.lang.String r2 = "role"
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterRole r1 = com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterRole.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.Enum r1 = r3.A03(r1, r2)
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterRole r1 = (com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterRole) r1
            X.21q r11 = X.C162047r8.A00(r1)
            X.21d r12 = r5.typeOfFetch
            X.2ni r10 = new X.2ni
            r17 = r15
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
            r4.add(r10)
            goto L_0x02b5
        L_0x0330:
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "NewsletterSubscribersGraphqlJob/handleResponse "
            X.C18260x0.A19(r1, r2, r4)
            X.C18280x3.A13(r2)
            X.2hh r11 = r5.A03
            if (r11 != 0) goto L_0x0348
            java.lang.String r0 = "newsletterSubscribersManager"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0348:
            X.4uY r2 = r5.newsletterJid
            X.21d r6 = r5.typeOfFetch
            X.C18270x1.A14(r2, r6)
            X.3dV r1 = r11.A04
            X.4Fq r8 = r1.A04()
            X.3Yo r9 = r8.Axl()     // Catch:{ all -> 0x043d }
            r3 = 1
            X.4Fq r7 = r1.A04()     // Catch:{ all -> 0x038a }
            r1 = 2
            java.lang.String[] r10 = new java.lang.String[r1]     // Catch:{ all -> 0x0383 }
            X.2sm r1 = r11.A02     // Catch:{ all -> 0x0383 }
            X.C56922sm.A02(r1, r2, r10, r0)     // Catch:{ all -> 0x0383 }
            int r0 = r6.value     // Catch:{ all -> 0x0383 }
            X.C18280x3.A1Q(r10, r0, r3)     // Catch:{ all -> 0x0383 }
            r0 = r7
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0383 }
            X.2sg r6 = r0.A03     // Catch:{ all -> 0x0383 }
            java.lang.String r3 = "newsletter_subscribers"
            java.lang.String r1 = "chat_row_id=? AND type_of_fetch=?"
            java.lang.String r0 = "DELETE_NEWSLETTER_SUBSCRIBERS_FOR_TYPE"
            int r0 = r6.A07(r3, r1, r0, r10)     // Catch:{ all -> 0x0383 }
            r7.close()     // Catch:{ all -> 0x038a }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x038a }
            goto L_0x038f
        L_0x0383:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0385 }
        L_0x0385:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r7, r1)     // Catch:{ all -> 0x038a }
            throw r0     // Catch:{ all -> 0x038a }
        L_0x038a:
            r0 = move-exception
            X.3Z0 r0 = X.AnonymousClass3Z0.A01(r0)     // Catch:{ all -> 0x0436 }
        L_0x038f:
            java.lang.Throwable r1 = X.AnonymousClass3Z9.A00(r0)     // Catch:{ all -> 0x0436 }
            if (r1 == 0) goto L_0x039a
            java.lang.String r0 = "NewsletterSubscribersManager/deleteNewsletterSubscribersFromDb/failed"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0436 }
        L_0x039a:
            X.2sm r0 = r11.A02     // Catch:{ all -> 0x0436 }
            long r2 = r0.A07(r2)     // Catch:{ all -> 0x0436 }
            java.util.Iterator r16 = r4.iterator()     // Catch:{ all -> 0x0436 }
        L_0x03a4:
            boolean r0 = r16.hasNext()     // Catch:{ all -> 0x0436 }
            if (r0 == 0) goto L_0x0424
            java.lang.Object r12 = r16.next()     // Catch:{ all -> 0x0436 }
            X.2ni r12 = (X.C53812ni) r12     // Catch:{ all -> 0x0436 }
            r0 = r8
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0436 }
            X.2sg r10 = r0.A03     // Catch:{ all -> 0x0436 }
            java.lang.String r7 = "newsletter_subscribers"
            X.1fH r1 = r12.A03     // Catch:{ all -> 0x0436 }
            r14 = -1
            if (r1 == 0) goto L_0x0421
            X.34p r0 = r11.A03     // Catch:{ all -> 0x0436 }
            long r0 = r0.A05(r1)     // Catch:{ all -> 0x0436 }
        L_0x03c4:
            android.content.ContentValues r6 = X.AnonymousClass0x9.A06()     // Catch:{ all -> 0x0436 }
            java.lang.String r13 = "chat_row_id"
            X.C18270x1.A0c(r6, r13, r2)     // Catch:{ all -> 0x0436 }
            java.lang.String r13 = "jid_row_id"
            X.C18270x1.A0c(r6, r13, r0)     // Catch:{ all -> 0x0436 }
            java.lang.String r1 = "display_name"
            java.lang.String r0 = r12.A06     // Catch:{ all -> 0x0436 }
            r6.put(r1, r0)     // Catch:{ all -> 0x0436 }
            java.lang.String r1 = "profile_picture_direct_path"
            java.lang.String r0 = r12.A07     // Catch:{ all -> 0x0436 }
            r6.put(r1, r0)     // Catch:{ all -> 0x0436 }
            java.lang.Long r0 = r12.A05     // Catch:{ all -> 0x0436 }
            if (r0 == 0) goto L_0x03e9
            long r14 = r0.longValue()     // Catch:{ all -> 0x0436 }
        L_0x03e9:
            java.lang.Long r1 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x0436 }
            java.lang.String r0 = "subscription_time"
            r6.put(r0, r1)     // Catch:{ all -> 0x0436 }
            X.21q r0 = r12.A01     // Catch:{ all -> 0x0436 }
            int r0 = r0.value     // Catch:{ all -> 0x0436 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0436 }
            java.lang.String r0 = "role"
            r6.put(r0, r1)     // Catch:{ all -> 0x0436 }
            X.21d r0 = r12.A02     // Catch:{ all -> 0x0436 }
            int r0 = r0.value     // Catch:{ all -> 0x0436 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0436 }
            java.lang.String r0 = "type_of_fetch"
            r6.put(r0, r1)     // Catch:{ all -> 0x0436 }
            long r0 = r12.A00     // Catch:{ all -> 0x0436 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0436 }
            java.lang.String r0 = "fetched_time"
            r6.put(r0, r1)     // Catch:{ all -> 0x0436 }
            r1 = 5
            java.lang.String r0 = "STORE_NEWSLETTER_SUBSCRIBERS"
            r10.A0C(r7, r0, r6, r1)     // Catch:{ all -> 0x0436 }
            goto L_0x03a4
        L_0x0421:
            r0 = -1
            goto L_0x03c4
        L_0x0424:
            r9.A00()     // Catch:{ all -> 0x0436 }
            r9.close()     // Catch:{ all -> 0x043d }
            r8.close()
            X.4Ao r0 = r5.callback
            if (r0 == 0) goto L_0x0e9b
            r0.Bcx(r4)
            goto L_0x0e9b
        L_0x0436:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0438 }
        L_0x0438:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r9, r1)     // Catch:{ all -> 0x043d }
            throw r0     // Catch:{ all -> 0x043d }
        L_0x043d:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x043f }
        L_0x043f:
            r1 = move-exception
            X.AnonymousClass2A8.A00(r8, r0)
            throw r1
        L_0x0444:
            X.7nS r2 = (X.C160327nS) r2
            r3 = 0
            X.C162457s7.A0J(r2, r3)
            java.lang.Object r1 = r1.receiver
            X.1gw r1 = (X.AnonymousClass1gw) r1
            boolean r0 = r1.isCancelled
            if (r0 != 0) goto L_0x0b73
            X.8jL r1 = r1.callback
            if (r1 == 0) goto L_0x0b73
            X.8SE r0 = X.C1452274r.A00(r2)
            X.3RO r1 = (X.AnonymousClass3RO) r1
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            X.3Yv r2 = r1.A02
            boolean r0 = r2.element
            if (r0 != 0) goto L_0x0b73
            X.4Du r1 = r1.A01
            X.1hB r0 = new X.1hB
            r0.<init>()
            r1.BkD(r0)
            r0 = 1
            r2.element = r0
            goto L_0x0b73
        L_0x0474:
            X.7aq r2 = (X.C153197aq) r2
            r10 = 0
            X.C162457s7.A0J(r2, r10)
            java.lang.Object r4 = r1.receiver
            X.1gw r4 = (X.AnonymousClass1gw) r4
            java.lang.String r1 = "xwa2_newsletters_reaction_sender_list"
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NewsletterReactionSendersListResponseImpl$Xwa2NewslettersReactionSenderList> r0 = com.whatsapp.infra.graphql.generated.newsletter.NewsletterReactionSendersListResponseImpl.Xwa2NewslettersReactionSenderList.class
            X.7aq r2 = r2.A00(r0, r1)
            if (r2 == 0) goto L_0x051d
            java.lang.String r1 = "reactions"
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NewsletterReactionSendersListResponseImpl$Xwa2NewslettersReactionSenderList$Reactions> r0 = com.whatsapp.infra.graphql.generated.newsletter.NewsletterReactionSendersListResponseImpl.Xwa2NewslettersReactionSenderList.Reactions.class
            X.6aY r1 = r2.A02(r0, r1)
            if (r1 == 0) goto L_0x051d
            int r0 = X.C57692u3.A01(r1)
            java.util.LinkedHashMap r2 = X.C18330xA.A0C(r0)
            java.util.Iterator r9 = r1.iterator()
        L_0x04a0:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x051e
            java.lang.Object r6 = r9.next()
            X.7aq r6 = (X.C153197aq) r6
            java.lang.String r1 = "sender_list"
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NewsletterReactionSendersListResponseImpl$Xwa2NewslettersReactionSenderList$Reactions$SenderList> r0 = com.whatsapp.infra.graphql.generated.newsletter.NewsletterReactionSendersListResponseImpl.Xwa2NewslettersReactionSenderList.Reactions.SenderList.class
            X.7aq r3 = r6.A00(r0, r1)
            java.lang.String r1 = "edges"
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NewsletterReactionSendersListResponseImpl$Xwa2NewslettersReactionSenderList$Reactions$SenderList$Edges> r0 = com.whatsapp.infra.graphql.generated.newsletter.NewsletterReactionSendersListResponseImpl.Xwa2NewslettersReactionSenderList.Reactions.SenderList.Edges.class
            X.6aY r0 = r3.A02(r0, r1)
            java.util.ArrayList r5 = X.C18300x5.A0t(r0)
            java.util.Iterator r8 = r0.iterator()
        L_0x04c5:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0510
            java.lang.Object r3 = r8.next()
            X.7aq r3 = (X.C153197aq) r3
            java.lang.String r1 = "node"
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NewsletterReactionSendersListResponseImpl$Xwa2NewslettersReactionSenderList$Reactions$SenderList$Edges$Node> r0 = com.whatsapp.infra.graphql.generated.newsletter.NewsletterReactionSendersListResponseImpl.Xwa2NewslettersReactionSenderList.Reactions.SenderList.Edges.Node.class
            X.7aq r7 = r3.A00(r0, r1)
            X.C162457s7.A0D(r7)
            java.lang.String r1 = "id"
            java.lang.String r0 = r7.A04(r1)
            r3 = 0
            if (r0 != 0) goto L_0x04ef
            java.lang.String r0 = "profile_pic_direct_path"
            java.lang.String r0 = r7.A04(r0)
            if (r0 == 0) goto L_0x04c5
        L_0x04ef:
            java.lang.String r0 = r7.A04(r1)
            if (r0 == 0) goto L_0x0500
            com.whatsapp.jid.Jid r1 = X.AnonymousClass32W.A00(r0)
            boolean r0 = r1 instanceof X.C27981fH
            if (r0 == 0) goto L_0x0500
            X.1fH r1 = (X.C27981fH) r1
            r3 = r1
        L_0x0500:
            java.lang.String r0 = "profile_pic_direct_path"
            java.lang.String r1 = r7.A04(r0)
            X.2LX r0 = new X.2LX
            r0.<init>(r3, r1)
            r5.add(r0)
            goto L_0x04c5
        L_0x0510:
            org.json.JSONObject r1 = r6.A00
            java.lang.String r0 = "reaction_code"
            java.lang.String r0 = r1.optString(r0)
            r2.put(r0, r5)
            goto L_0x04a0
        L_0x051d:
            r2 = 0
        L_0x051e:
            X.8jL r1 = r4.callback
            if (r1 == 0) goto L_0x0e9b
            X.3RO r1 = (X.AnonymousClass3RO) r1
            java.lang.String r0 = "onResponse successful"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            X.3Yv r7 = r1.A02
            boolean r0 = r7.element
            if (r0 != 0) goto L_0x0e9b
            X.4Du r8 = r1.A01
            if (r2 == 0) goto L_0x05d4
            X.2SQ r11 = r1.A00
            java.util.LinkedHashMap r9 = X.C18320x8.A0r()
            java.util.Iterator r12 = X.AnonymousClass000.A0q(r2)
        L_0x053e:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x058b
            java.util.Map$Entry r0 = X.AnonymousClass001.A0w(r12)
            java.lang.Object r6 = r0.getKey()
            java.lang.Object r0 = r0.getValue()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r5 = X.C73783g4.A0c(r0)
            java.util.Iterator r4 = r0.iterator()
        L_0x055a:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0587
            java.lang.Object r3 = r4.next()
            X.2LX r3 = (X.AnonymousClass2LX) r3
            X.C162457s7.A0J(r3, r10)
            X.1fH r1 = r3.A00
            if (r1 == 0) goto L_0x0585
            X.3Ex r0 = r11.A00
            X.3ZH r2 = r0.A0A(r1)
            X.3ZH r0 = r2.A0G()
            if (r0 == 0) goto L_0x057a
            r2 = r0
        L_0x057a:
            java.lang.String r1 = r3.A01
            X.7YJ r0 = new X.7YJ
            r0.<init>(r2, r1)
            r5.add(r0)
            goto L_0x055a
        L_0x0585:
            r2 = 0
            goto L_0x057a
        L_0x0587:
            r9.put(r6, r5)
            goto L_0x053e
        L_0x058b:
            java.util.LinkedHashMap r6 = X.C18320x8.A0r()
            int r0 = r9.size()
            java.util.ArrayList r5 = X.AnonymousClass002.A0I(r0)
            java.util.Iterator r4 = X.AnonymousClass000.A0q(r9)
        L_0x059b:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x05d5
            java.util.Map$Entry r1 = X.AnonymousClass001.A0w(r4)
            java.lang.String r0 = X.C18310x6.A0q(r1)
            java.lang.Object r3 = r1.getValue()
            java.util.Collection r3 = (java.util.Collection) r3
            java.lang.String r0 = X.C107165ao.A03(r0)
            if (r0 == 0) goto L_0x05ce
            java.lang.String r2 = X.C107165ao.A02(r0)
            java.util.ArrayList r1 = X.C18300x5.A0t(r2)
            java.lang.Object r0 = r6.get(r2)
            java.util.Collection r0 = (java.util.Collection) r0
            if (r0 == 0) goto L_0x05c8
            r1.addAll(r0)
        L_0x05c8:
            r1.addAll(r3)
            r6.put(r2, r1)
        L_0x05ce:
            X.2wD r0 = X.C59022wD.A00
            r5.add(r0)
            goto L_0x059b
        L_0x05d4:
            r6 = 0
        L_0x05d5:
            X.1hC r0 = new X.1hC
            r0.<init>(r6)
            r8.BkD(r0)
            r0 = 1
            r7.element = r0
            goto L_0x0e9b
        L_0x05e2:
            r3 = 0
            java.lang.StringBuilder r1 = X.C18280x3.A0g(r2, r3)
            java.lang.String r0 = "MessageDeliveryUpdatesFetcher/ request failed with: "
            X.C18260x0.A1Q(r1, r0, r2)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            return r0
        L_0x05f1:
            X.7nS r2 = (X.C160327nS) r2
            r7 = 0
            X.C162457s7.A0J(r2, r7)
            java.lang.Object r6 = r1.receiver
            X.1h0 r6 = (X.AnonymousClass1h0) r6
            boolean r0 = r6.isCancelled
            if (r0 != 0) goto L_0x063f
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "BaseMetadataNewsletterGraphqlJob/onFailure error = "
            X.C18260x0.A1R(r1, r0, r2)
            X.8t1 r0 = r2.A00()
            int r5 = r0.B5a()
            X.4uY r4 = r6.newsletterJid
            if (r4 == 0) goto L_0x0634
            X.2sL r3 = r6.A01
            if (r3 == 0) goto L_0x0624
            X.2se r1 = r6.A04
            if (r1 != 0) goto L_0x062c
            java.lang.String r0 = "newsletterManager"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0624:
            java.lang.String r0 = "newsletterStore"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x062c:
            X.2g3 r0 = new X.2g3
            r0.<init>(r3, r4, r1)
            r0.A00(r5)
        L_0x0634:
            X.4DF r1 = r6.callback
            if (r1 == 0) goto L_0x063f
            X.8SE r0 = X.C1452274r.A00(r2)
            r1.onError(r0)
        L_0x063f:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)
            return r0
        L_0x0644:
            X.7aq r2 = (X.C153197aq) r2
            r6 = 0
            X.C162457s7.A0J(r2, r6)
            java.lang.Object r4 = r1.receiver
            X.1h0 r4 = (X.AnonymousClass1h0) r4
            boolean r0 = r4.isCancelled
            if (r0 != 0) goto L_0x0e9b
            java.lang.String r1 = "xwa2_newsletter"
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataResponseImpl$Xwa2Newsletter> r0 = com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataResponseImpl.Xwa2Newsletter.class
            X.7aq r0 = r2.A00(r0, r1)
            if (r0 == 0) goto L_0x0e9b
            org.json.JSONObject r0 = r0.A00
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFieldsImpl r5 = new com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFieldsImpl
            r5.<init>(r0)
            X.7r8 r0 = r4.A05
            if (r0 == 0) goto L_0x074a
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$State r0 = r5.BDI()
            r7 = 0
            if (r0 == 0) goto L_0x06bc
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterStateType r1 = r0.BDy()
        L_0x0673:
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterStateType r0 = com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterStateType.SUSPENDED
            if (r1 == r0) goto L_0x06de
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterStateType r0 = com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterStateType.DELETED
            if (r1 == r0) goto L_0x06de
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterStateType r0 = com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterStateType.GEOSUSPENDED
            if (r1 == r0) goto L_0x06de
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterStateType r0 = com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterStateType.NON_EXISTING
            if (r1 == r0) goto L_0x06de
            java.lang.String r0 = "id"
            java.lang.String r0 = r5.A04(r0)
            X.4uY r3 = X.C106415Yx.A00(r0)
            X.7r8 r0 = r4.A05
            if (r0 == 0) goto L_0x06d6
            X.1RL r2 = r0.A0A(r5, r3, r6)
            r0 = 1
            X.1RL[] r0 = new X.AnonymousClass1RL[r0]
            r0[r6] = r2
            java.util.ArrayList r1 = X.AnonymousClass8UF.A0m(r0)
            X.2sL r0 = r4.A01
            if (r0 == 0) goto L_0x06ce
            r0.A0A(r1)
            X.7r8 r0 = r4.A05
            if (r0 == 0) goto L_0x06c6
            r0.A0E(r1)
            X.2nv r0 = r4.A03
            if (r0 == 0) goto L_0x06be
            r0.A00(r2)
            X.4DF r0 = r4.callback
            if (r0 == 0) goto L_0x0e9b
            r0.BX8(r3)
            goto L_0x0e9b
        L_0x06bc:
            r1 = r7
            goto L_0x0673
        L_0x06be:
            java.lang.String r0 = "newsletterSystemMessagesManager"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x06c6:
            java.lang.String r0 = "newsletterGraphqlUtil"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x06ce:
            java.lang.String r0 = "newsletterStore"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x06d6:
            java.lang.String r0 = "newsletterGraphqlUtil"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x06de:
            X.4uY r3 = r4.newsletterJid
            if (r3 == 0) goto L_0x070c
            X.2sL r2 = r4.A01
            if (r2 == 0) goto L_0x06f2
            X.2se r0 = r4.A04
            if (r0 != 0) goto L_0x06fa
            java.lang.String r0 = "newsletterManager"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x06f2:
            java.lang.String r0 = "newsletterStore"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x06fa:
            X.2g3 r1 = new X.2g3
            r1.<init>(r2, r3, r0)
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$State r0 = r5.BDI()
            if (r0 == 0) goto L_0x0709
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterStateType r7 = r0.BDy()
        L_0x0709:
            r1.A01(r7)
        L_0x070c:
            X.7r8 r0 = r4.A05
            if (r0 == 0) goto L_0x0742
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$State r0 = r5.BDI()
            if (r0 == 0) goto L_0x0728
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterStateType r0 = r0.BDy()
            if (r0 == 0) goto L_0x0728
            int r1 = r0.ordinal()
            r0 = 2
            if (r1 == r0) goto L_0x073f
            r0 = 3
            r3 = 451(0x1c3, float:6.32E-43)
            if (r1 == r0) goto L_0x0729
        L_0x0728:
            r3 = 0
        L_0x0729:
            X.4DF r2 = r4.callback
            if (r2 == 0) goto L_0x0e9b
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$State r0 = r5.BDI()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            X.6nF r0 = new X.6nF
            r0.<init>(r1, r3)
            r2.onError(r0)
            goto L_0x0e9b
        L_0x073f:
            r3 = 423(0x1a7, float:5.93E-43)
            goto L_0x0729
        L_0x0742:
            java.lang.String r0 = "newsletterGraphqlUtil"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x074a:
            java.lang.String r0 = "newsletterGraphqlUtil"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0752:
            r3 = 0
            java.lang.StringBuilder r1 = X.C18280x3.A0g(r2, r3)
            java.lang.String r0 = "GetNewsletterGeosuspensionJob/error "
            X.C18260x0.A1P(r1, r0, r2)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            return r0
        L_0x0761:
            X.7aq r2 = (X.C153197aq) r2
            r3 = 0
            X.C162457s7.A0J(r2, r3)
            java.lang.Object r5 = r1.receiver
            X.1gy r5 = (X.C28491gy) r5
            java.lang.String r1 = "xwa2_newsletter_admin"
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NewsletterAdminMetadataQueryResponseImpl$Xwa2NewsletterAdmin> r0 = com.whatsapp.infra.graphql.generated.newsletter.NewsletterAdminMetadataQueryResponseImpl.Xwa2NewsletterAdmin.class
            X.7aq r4 = r2.A00(r0, r1)
            if (r4 == 0) goto L_0x0956
            java.lang.String r1 = "thread_metadata"
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NewsletterAdminMetadataQueryResponseImpl$Xwa2NewsletterAdmin$ThreadMetadata> r0 = com.whatsapp.infra.graphql.generated.newsletter.NewsletterAdminMetadataQueryResponseImpl.Xwa2NewsletterAdmin.ThreadMetadata.class
            X.7aq r2 = r4.A00(r0, r1)
            if (r2 == 0) goto L_0x0878
            java.lang.String r1 = "geo_states"
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NewsletterAdminMetadataQueryResponseImpl$Xwa2NewsletterAdmin$ThreadMetadata$GeoStates> r0 = com.whatsapp.infra.graphql.generated.newsletter.NewsletterAdminMetadataQueryResponseImpl.Xwa2NewsletterAdmin.ThreadMetadata.GeoStates.class
            X.6aY r0 = r2.A02(r0, r1)
            if (r0 == 0) goto L_0x0878
            java.util.ArrayList r7 = X.AnonymousClass001.A0s()
            java.util.Iterator r8 = r0.iterator()
        L_0x0793:
            boolean r0 = r8.hasNext()
            r6 = 1
            if (r0 == 0) goto L_0x07bb
            java.lang.Object r6 = r8.next()
            r2 = r6
            X.7aq r2 = (X.C153197aq) r2
            java.lang.String r1 = "state"
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NewsletterAdminMetadataQueryResponseImpl$Xwa2NewsletterAdmin$ThreadMetadata$GeoStates$State> r0 = com.whatsapp.infra.graphql.generated.newsletter.NewsletterAdminMetadataQueryResponseImpl.Xwa2NewsletterAdmin.ThreadMetadata.GeoStates.State.class
            X.7aq r2 = r2.A00(r0, r1)
            java.lang.String r1 = "type"
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterStateType r0 = com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterStateType.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.Enum r1 = r2.A03(r0, r1)
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterStateType r0 = com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterStateType.GEOSUSPENDED
            if (r1 != r0) goto L_0x0793
            r7.add(r6)
            goto L_0x0793
        L_0x07bb:
            java.util.ArrayList r8 = X.C73783g4.A0d(r7)
            java.util.Iterator r2 = r7.iterator()
        L_0x07c3:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x07db
            java.lang.Object r0 = r2.next()
            X.7aq r0 = (X.C153197aq) r0
            org.json.JSONObject r1 = r0.A00
            java.lang.String r0 = "country_code"
            java.lang.String r0 = r1.optString(r0)
            r8.add(r0)
            goto L_0x07c3
        L_0x07db:
            X.2j9 r1 = r5.A04
            java.lang.String r9 = "newsletterGeosuspendedStore"
            if (r1 != 0) goto L_0x07e7
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r9)
            throw r0
        L_0x07e7:
            X.4uY r0 = r5.newsletterJid
            java.util.List r0 = r1.A01(r0)
            java.util.ArrayList r2 = X.C73783g4.A0d(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x07f5:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0807
            java.lang.Object r0 = r1.next()
            X.2j7 r0 = (X.C51002j7) r0
            java.lang.String r0 = r0.A00
            r2.add(r0)
            goto L_0x07f5
        L_0x0807:
            java.util.Set r1 = X.C73723fy.A0P(r8)
            java.util.Set r0 = X.C73723fy.A0P(r2)
            java.util.Set r0 = X.C73723fy.A0Q(r1, r0)
            boolean r0 = X.C18310x6.A1X(r0)
            if (r0 == 0) goto L_0x083d
            X.1VX r2 = r5.A01
            if (r2 != 0) goto L_0x0822
            java.lang.RuntimeException r0 = X.C18270x1.A0R()
            throw r0
        L_0x0822:
            r1 = 5216(0x1460, float:7.309E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            if (r0 == 0) goto L_0x083d
            X.2sL r1 = r5.A00
            if (r1 != 0) goto L_0x0838
            java.lang.String r0 = "newsletterStore"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0838:
            X.4uY r0 = r5.newsletterJid
            r1.A02(r0, r6)
        L_0x083d:
            X.2j9 r7 = r5.A04
            if (r7 != 0) goto L_0x0846
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r9)
            throw r0
        L_0x0846:
            X.4uY r6 = r5.newsletterJid
            monitor-enter(r7)
            X.C162457s7.A0J(r6, r3)     // Catch:{ all -> 0x0874 }
            java.util.ArrayList r3 = X.C73783g4.A0d(r8)     // Catch:{ all -> 0x0874 }
            java.util.Iterator r2 = r8.iterator()     // Catch:{ all -> 0x0874 }
        L_0x0854:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x0874 }
            if (r0 == 0) goto L_0x0867
            java.lang.String r1 = X.AnonymousClass001.A0m(r2)     // Catch:{ all -> 0x0874 }
            X.2j7 r0 = new X.2j7     // Catch:{ all -> 0x0874 }
            r0.<init>(r1)     // Catch:{ all -> 0x0874 }
            r3.add(r0)     // Catch:{ all -> 0x0874 }
            goto L_0x0854
        L_0x0867:
            java.util.Set r1 = X.C73723fy.A0P(r3)     // Catch:{ all -> 0x0874 }
            X.2j8 r0 = new X.2j8     // Catch:{ all -> 0x0874 }
            r0.<init>(r1)     // Catch:{ all -> 0x0874 }
            r7.A02(r6, r0)     // Catch:{ all -> 0x0874 }
            goto L_0x0877
        L_0x0874:
            r1 = move-exception
            monitor-exit(r7)
            throw r1
        L_0x0877:
            monitor-exit(r7)
        L_0x0878:
            java.lang.String r1 = "messages"
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NewsletterAdminMetadataQueryResponseImpl$Xwa2NewsletterAdmin$Messages> r0 = com.whatsapp.infra.graphql.generated.newsletter.NewsletterAdminMetadataQueryResponseImpl.Xwa2NewsletterAdmin.Messages.class
            X.7aq r2 = r4.A00(r0, r1)
            if (r2 == 0) goto L_0x0908
            java.lang.String r1 = "edges"
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NewsletterAdminMetadataQueryResponseImpl$Xwa2NewsletterAdmin$Messages$Edges> r0 = com.whatsapp.infra.graphql.generated.newsletter.NewsletterAdminMetadataQueryResponseImpl.Xwa2NewsletterAdmin.Messages.Edges.class
            X.6aY r0 = r2.A02(r0, r1)
            java.util.ArrayList r6 = X.C18300x5.A0t(r0)
            java.util.Iterator r8 = r0.iterator()
        L_0x0893:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x08f7
            java.lang.Object r2 = r8.next()
            X.7aq r2 = (X.C153197aq) r2
            if (r2 == 0) goto L_0x0893
            java.lang.String r1 = "node"
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NewsletterAdminMetadataQueryResponseImpl$Xwa2NewsletterAdmin$Messages$Edges$Node> r0 = com.whatsapp.infra.graphql.generated.newsletter.NewsletterAdminMetadataQueryResponseImpl.Xwa2NewsletterAdmin.Messages.Edges.Node.class
            X.7aq r2 = r2.A00(r0, r1)
            if (r2 == 0) goto L_0x0893
            org.json.JSONObject r1 = r2.A00
            java.lang.String r0 = "server_id"
            java.lang.String r0 = X.C18300x5.A0l(r0, r1)
            java.lang.Long r7 = X.C829745q.A07(r0)
            java.lang.String r1 = "message_delivery_update"
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NewsletterAdminMetadataQueryResponseImpl$Xwa2NewsletterAdmin$Messages$Edges$Node$MessageDeliveryUpdate> r0 = com.whatsapp.infra.graphql.generated.newsletter.NewsletterAdminMetadataQueryResponseImpl.Xwa2NewsletterAdmin.Messages.Edges.Node.MessageDeliveryUpdate.class
            X.7aq r2 = r2.A00(r0, r1)
            java.lang.String r1 = "issue"
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NewsletterAdminMetadataQueryResponseImpl$Xwa2NewsletterAdmin$Messages$Edges$Node$MessageDeliveryUpdate$Issue> r0 = com.whatsapp.infra.graphql.generated.newsletter.NewsletterAdminMetadataQueryResponseImpl.Xwa2NewsletterAdmin.Messages.Edges.Node.MessageDeliveryUpdate.Issue.class
            X.7aq r2 = r2.A00(r0, r1)
            java.lang.String r1 = "code"
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2MessageDeliveryUpdateIssueCode r0 = com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2MessageDeliveryUpdateIssueCode.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.Enum r1 = r2.A03(r0, r1)
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2MessageDeliveryUpdateIssueCode r0 = com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2MessageDeliveryUpdateIssueCode.NEEDS_REVIEW
            boolean r0 = X.AnonymousClass000.A1Y(r1, r0)
            if (r7 == 0) goto L_0x0893
            if (r0 == 0) goto L_0x0893
            X.2rZ r3 = r5.A03
            if (r3 != 0) goto L_0x08e7
            java.lang.String r0 = "newsletterMessageStore"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x08e7:
            X.4uY r2 = r5.newsletterJid
            long r0 = r7.longValue()
            X.34x r0 = r3.A00(r2, r0)
            if (r0 == 0) goto L_0x0893
            r6.add(r0)
            goto L_0x0893
        L_0x08f7:
            X.2g4 r1 = r5.A05
            if (r1 != 0) goto L_0x0903
            java.lang.String r0 = "newsletterMessageEnforcementRepo"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0903:
            X.4uY r0 = r5.newsletterJid
            r1.A00(r0, r6)
        L_0x0908:
            java.lang.String r1 = "pending_admin_invites"
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NewsletterAdminMetadataQueryResponseImpl$Xwa2NewsletterAdmin$PendingAdminInvites> r0 = com.whatsapp.infra.graphql.generated.newsletter.NewsletterAdminMetadataQueryResponseImpl.Xwa2NewsletterAdmin.PendingAdminInvites.class
            X.6aY r0 = r4.A02(r0, r1)
            if (r0 == 0) goto L_0x0956
            java.util.ArrayList r4 = X.AnonymousClass001.A0s()
            java.util.Iterator r3 = r0.iterator()
        L_0x091b:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x094f
            java.lang.Object r2 = r3.next()
            X.7aq r2 = (X.C153197aq) r2
            java.lang.String r1 = "user"
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NewsletterAdminMetadataQueryResponseImpl$Xwa2NewsletterAdmin$PendingAdminInvites$User> r0 = com.whatsapp.infra.graphql.generated.newsletter.NewsletterAdminMetadataQueryResponseImpl.Xwa2NewsletterAdmin.PendingAdminInvites.User.class
            X.7aq r2 = r2.A00(r0, r1)
            X.C162457s7.A0D(r2)
            java.lang.String r1 = "id"
            java.lang.String r0 = r2.A04(r1)
            if (r0 == 0) goto L_0x091b
            java.lang.String r0 = r2.A04(r1)
            if (r0 == 0) goto L_0x091b
            com.whatsapp.jid.Jid r1 = X.AnonymousClass32W.A00(r0)
            boolean r0 = r1 instanceof X.C27981fH
            if (r0 == 0) goto L_0x091b
            if (r1 == 0) goto L_0x091b
            r4.add(r1)
            goto L_0x091b
        L_0x094f:
            X.4DG r0 = r5.callback
            if (r0 == 0) goto L_0x0956
            r0.BY1(r4)
        L_0x0956:
            X.4DG r0 = r5.callback
            if (r0 == 0) goto L_0x0e9b
            r0.onSuccess()
            goto L_0x0e9b
        L_0x095f:
            X.39D r2 = (X.AnonymousClass39D) r2
            r0 = 0
            X.C162457s7.A0J(r2, r0)
            java.lang.Object r0 = r1.receiver
            com.whatsapp.expressionstray.stickers.SearchFunStickersBottomSheet r0 = (com.whatsapp.expressionstray.stickers.SearchFunStickersBottomSheet) r0
            com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel r1 = X.C18300x5.A0O(r0)
            X.03q r0 = r0.A0R()
            r1.A0H(r0, r2)
            goto L_0x0e9b
        L_0x0976:
            X.7nS r2 = (X.C160327nS) r2
            r3 = 0
            java.lang.StringBuilder r1 = X.C18280x3.A0g(r2, r3)
            java.lang.String r0 = "Error with SET - "
            r1.append(r0)
            X.8t1 r0 = r2.A00()
            X.C18260x0.A0n(r0, r1)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            return r0
        L_0x098e:
            X.7aq r2 = (X.C153197aq) r2
            java.lang.Object r4 = r1.receiver
            X.2pb r4 = (X.C54982pb) r4
            r3 = 0
            if (r2 == 0) goto L_0x09ba
            java.lang.String r1 = "xwa2_update_text_status"
            java.lang.Class<com.whatsapp.infra.graphql.generated.textstatus.UpdateTextStatusResponseImpl$Xwa2UpdateTextStatus> r0 = com.whatsapp.infra.graphql.generated.textstatus.UpdateTextStatusResponseImpl.Xwa2UpdateTextStatus.class
            X.7aq r2 = r2.A00(r0, r1)
            if (r2 == 0) goto L_0x09ba
            java.lang.String r1 = "result"
            com.whatsapp.infra.graphql.generated.textstatus.enums.GraphQLXWA2TextStatusResult r0 = com.whatsapp.infra.graphql.generated.textstatus.enums.GraphQLXWA2TextStatusResult.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.Enum r2 = r2.A03(r0, r1)
        L_0x09ab:
            com.whatsapp.infra.graphql.generated.textstatus.enums.GraphQLXWA2TextStatusResult r0 = com.whatsapp.infra.graphql.generated.textstatus.enums.GraphQLXWA2TextStatusResult.SUCCESS
            if (r2 == r0) goto L_0x09bc
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Error with SET - "
            X.C18260x0.A1Q(r1, r0, r2)
            goto L_0x0e9b
        L_0x09ba:
            r2 = r3
            goto L_0x09ab
        L_0x09bc:
            java.lang.Boolean r0 = r4.A04
            boolean r0 = X.AnonymousClass0x9.A1Q(r0)
            if (r0 == 0) goto L_0x0e9b
            X.33p r0 = r4.A01
            r0.A1h(r3, r3)
            goto L_0x0e9b
        L_0x09cb:
            X.7aq r2 = (X.C153197aq) r2
            java.lang.Object r5 = r1.receiver
            X.2pb r5 = (X.C54982pb) r5
            if (r2 == 0) goto L_0x0a3e
            java.lang.String r1 = "xwa2_text_status_list"
            java.lang.Class<com.whatsapp.infra.graphql.generated.textstatus.GetTextStatusListResponseImpl$Xwa2TextStatusList> r0 = com.whatsapp.infra.graphql.generated.textstatus.GetTextStatusListResponseImpl.Xwa2TextStatusList.class
            X.6aY r0 = r2.A02(r0, r1)
            if (r0 == 0) goto L_0x0a3e
            java.util.Iterator r4 = r0.iterator()
        L_0x09e2:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0a3e
            java.lang.Object r0 = r4.next()
            X.7aq r0 = (X.C153197aq) r0
            org.json.JSONObject r0 = r0.A00
            com.whatsapp.infra.graphql.generated.textstatus.GetTextStatusListResponseImpl$Xwa2TextStatusList$InlineXWA2TextStatus r3 = new com.whatsapp.infra.graphql.generated.textstatus.GetTextStatusListResponseImpl$Xwa2TextStatusList$InlineXWA2TextStatus
            r3.<init>(r0)
            org.json.JSONObject r2 = r3.A00
            java.lang.String r0 = "jid"
            java.lang.String r1 = r2.optString(r0)
            X.2sr r0 = r5.A00
            X.1RR r0 = X.C56972sr.A01(r0)
            r11 = 0
            if (r0 == 0) goto L_0x0a3c
            X.4uZ r0 = r0.A0H
        L_0x0a08:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x09e2
            java.lang.String r0 = "text"
            java.lang.String r8 = r3.A04(r0)
            java.lang.String r1 = "emoji"
            java.lang.Class<com.whatsapp.infra.graphql.generated.textstatus.GetTextStatusListResponseImpl$Xwa2TextStatusList$InlineXWA2TextStatus$Emoji> r0 = com.whatsapp.infra.graphql.generated.textstatus.GetTextStatusListResponseImpl.Xwa2TextStatusList.InlineXWA2TextStatus.Emoji.class
            X.7aq r0 = r3.A00(r0, r1)
            if (r0 == 0) goto L_0x0a27
            org.json.JSONObject r1 = r0.A00
            java.lang.String r0 = "content"
            java.lang.String r11 = r1.optString(r0)
        L_0x0a27:
            java.lang.String r0 = "ephemeral_duration_sec"
            int r0 = r2.optInt(r0)
            long r6 = (long) r0
            java.lang.String r0 = "last_update_time"
            java.lang.String r0 = X.C18300x5.A0l(r0, r2)
            long r9 = java.lang.Long.parseLong(r0)
            r5.A01(r6, r8, r9, r11)
            goto L_0x09e2
        L_0x0a3c:
            r0 = r11
            goto L_0x0a08
        L_0x0a3e:
            X.2b6 r1 = r5.A03
            if (r1 == 0) goto L_0x0e9b
            r0 = 7
            r1.A00(r0)
            goto L_0x0e9b
        L_0x0a48:
            X.7aq r2 = (X.C153197aq) r2
            java.lang.Object r3 = r1.receiver
            X.2Q2 r3 = (X.AnonymousClass2Q2) r3
            if (r2 == 0) goto L_0x0e9b
            java.lang.String r1 = "xwa2_text_status_list"
            java.lang.Class<com.whatsapp.infra.graphql.generated.textstatus.GetTextStatusListResponseImpl$Xwa2TextStatusList> r0 = com.whatsapp.infra.graphql.generated.textstatus.GetTextStatusListResponseImpl.Xwa2TextStatusList.class
            X.6aY r0 = r2.A02(r0, r1)
            if (r0 == 0) goto L_0x0e9b
            java.util.Iterator r7 = r0.iterator()
        L_0x0a5f:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0e9b
            java.lang.Object r0 = r7.next()
            X.7aq r0 = (X.C153197aq) r0
            org.json.JSONObject r0 = r0.A00
            com.whatsapp.infra.graphql.generated.textstatus.GetTextStatusListResponseImpl$Xwa2TextStatusList$InlineXWA2TextStatus r2 = new com.whatsapp.infra.graphql.generated.textstatus.GetTextStatusListResponseImpl$Xwa2TextStatusList$InlineXWA2TextStatus
            r2.<init>(r0)
            X.32Y r1 = com.whatsapp.jid.UserJid.Companion
            org.json.JSONObject r6 = r2.A00
            java.lang.String r0 = "jid"
            java.lang.String r0 = r6.optString(r0)
            com.whatsapp.jid.UserJid r9 = r1.A0E(r0)
            if (r9 != 0) goto L_0x0a88
            java.lang.String r0 = "Null JID in GetTextStatusListResponse"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x0a5f
        L_0x0a88:
            boolean r0 = X.C627336j.A0L(r9)
            if (r0 == 0) goto L_0x0a96
            X.2sM r0 = r3.A02
            com.whatsapp.jid.PhoneUserJid r9 = X.C56662sM.A00(r0, r9)
            if (r9 == 0) goto L_0x0a5f
        L_0x0a96:
            java.lang.String r5 = "ephemeral_duration_sec"
            int r1 = r6.optInt(r5)
            r0 = -1
            if (r1 != r0) goto L_0x0ac4
            r12 = -1
        L_0x0aa1:
            X.3Ex r8 = r3.A01
            java.lang.String r0 = "text"
            java.lang.String r10 = r2.A04(r0)
            java.lang.String r1 = "emoji"
            java.lang.Class<com.whatsapp.infra.graphql.generated.textstatus.GetTextStatusListResponseImpl$Xwa2TextStatusList$InlineXWA2TextStatus$Emoji> r0 = com.whatsapp.infra.graphql.generated.textstatus.GetTextStatusListResponseImpl.Xwa2TextStatusList.InlineXWA2TextStatus.Emoji.class
            X.7aq r0 = r2.A00(r0, r1)
            if (r0 == 0) goto L_0x0abe
            org.json.JSONObject r1 = r0.A00
            java.lang.String r0 = "content"
            java.lang.String r11 = r1.optString(r0)
            if (r11 != 0) goto L_0x0ac0
        L_0x0abe:
            java.lang.String r11 = ""
        L_0x0ac0:
            r8.A0Z(r9, r10, r11, r12)
            goto L_0x0a5f
        L_0x0ac4:
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS
            java.lang.String r0 = "last_update_time"
            java.lang.String r0 = X.C18300x5.A0l(r0, r6)
            long r0 = java.lang.Long.parseLong(r0)
            long r12 = r4.toMillis(r0)
            int r0 = r6.optInt(r5)
            long r0 = (long) r0
            long r0 = r4.toMillis(r0)
            long r12 = r12 + r0
            goto L_0x0aa1
        L_0x0adf:
            X.1mU r2 = (X.C30461mU) r2
            r0 = 0
            X.C162457s7.A0J(r2, r0)
            java.lang.Object r0 = r1.receiver
            X.11L r0 = (X.AnonymousClass11L) r0
            X.4C6 r5 = X.AnonymousClass0IV.A00(r0)
            X.3gB r4 = r0.A07
            r3 = 0
            com.whatsapp.events.EventInfoViewModel$updateResponseItems$1 r1 = new com.whatsapp.events.EventInfoViewModel$updateResponseItems$1
            r1.<init>(r2, r0, r3)
            r0 = 2
            X.C616131n.A02(r4, r1, r5, r3, r0)
            goto L_0x0e9b
        L_0x0afb:
            org.json.JSONObject r2 = (org.json.JSONObject) r2
            r0 = 0
            X.C162457s7.A0J(r2, r0)
            java.lang.Object r4 = r1.receiver
            X.2Y8 r4 = (X.AnonymousClass2Y8) r4
            java.lang.String r0 = "id"
            java.lang.String r3 = r2.optString(r0)
            java.lang.String r0 = "rating_type"
            java.lang.String r1 = X.C18300x5.A0l(r0, r2)
            java.util.Locale r0 = java.util.Locale.getDefault()
            X.C162457s7.A0D(r0)
            java.lang.String r1 = r1.toUpperCase(r0)
            X.C162457s7.A0D(r1)
            java.lang.String r0 = "STAR_RATING"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0b40
            org.json.JSONObject r0 = r4.A00
            if (r0 == 0) goto L_0x0b3e
            int r0 = r0.optInt(r3)
        L_0x0b30:
            X.6op r1 = new X.6op
            r1.<init>(r0)
        L_0x0b35:
            X.C162457s7.A0H(r3)
            X.4yn r0 = new X.4yn
            r0.<init>(r1, r3)
            return r0
        L_0x0b3e:
            r0 = 0
            goto L_0x0b30
        L_0x0b40:
            java.lang.String r0 = "THUMBS_RATING"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0b50
            java.lang.String r0 = ""
            X.6oq r1 = new X.6oq
            r1.<init>(r0)
            goto L_0x0b35
        L_0x0b50:
            X.6oo r1 = X.C137516oo.A00
            goto L_0x0b35
        L_0x0b53:
            X.7nS r2 = (X.C160327nS) r2
            r3 = 0
            X.C162457s7.A0J(r2, r3)
            java.lang.Object r0 = r1.receiver
            X.2Pe r0 = (X.C42702Pe) r0
            X.2FL r1 = r0.A00
            if (r1 == 0) goto L_0x0b73
            X.8t1 r0 = r2.A00()
            int r2 = r0.B5a()
            X.4Du r1 = r1.A00
            X.24M r0 = new X.24M
            r0.<init>(r2)
            X.AnonymousClass3Z0.A02(r0, r1)
        L_0x0b73:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            return r0
        L_0x0b78:
            X.7aq r2 = (X.C153197aq) r2
            r0 = 0
            X.C162457s7.A0J(r2, r0)
            java.lang.Object r4 = r1.receiver
            X.2Pe r4 = (X.C42702Pe) r4
            java.lang.String r1 = "xwa2_group_query_by_id"
            java.lang.Class<com.whatsapp.infra.graphql.generated.groups.QuerySuggestedGroupsResponseImpl$Xwa2GroupQueryById> r0 = com.whatsapp.infra.graphql.generated.groups.QuerySuggestedGroupsResponseImpl.Xwa2GroupQueryById.class
            X.7aq r0 = r2.A00(r0, r1)
            if (r0 == 0) goto L_0x0c4e
            org.json.JSONObject r3 = r0.A00
            java.lang.String r0 = "__typename"
            java.lang.String r0 = r3.optString(r0)
            int r1 = r0.hashCode()
            r0 = -1008570490(0xffffffffc3e26f86, float:-452.87128)
            if (r1 != r0) goto L_0x0c4e
            com.whatsapp.infra.graphql.generated.groups.QuerySuggestedGroupsResponseImpl$Xwa2GroupQueryById$InlineXWA2CommunityGroup r2 = new com.whatsapp.infra.graphql.generated.groups.QuerySuggestedGroupsResponseImpl$Xwa2GroupQueryById$InlineXWA2CommunityGroup
            r2.<init>(r3)
            java.lang.String r1 = "sub_group_suggestions"
            java.lang.Class<com.whatsapp.infra.graphql.generated.groups.QuerySuggestedGroupsResponseImpl$Xwa2GroupQueryById$InlineXWA2CommunityGroup$SubGroupSuggestions> r0 = com.whatsapp.infra.graphql.generated.groups.QuerySuggestedGroupsResponseImpl.Xwa2GroupQueryById.InlineXWA2CommunityGroup.SubGroupSuggestions.class
            X.7aq r2 = r2.A00(r0, r1)
            if (r2 == 0) goto L_0x0c4e
            java.lang.String r1 = "edges"
            java.lang.Class<com.whatsapp.infra.graphql.generated.groups.QuerySuggestedGroupsResponseImpl$Xwa2GroupQueryById$InlineXWA2CommunityGroup$SubGroupSuggestions$Edges> r0 = com.whatsapp.infra.graphql.generated.groups.QuerySuggestedGroupsResponseImpl.Xwa2GroupQueryById.InlineXWA2CommunityGroup.SubGroupSuggestions.Edges.class
            X.6aY r0 = r2.A02(r0, r1)
            if (r0 == 0) goto L_0x0c4e
            java.util.ArrayList r3 = X.AnonymousClass001.A0s()
            java.util.Iterator r7 = r0.iterator()
        L_0x0bc0:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0c43
            java.lang.Object r2 = r7.next()
            X.7aq r2 = (X.C153197aq) r2
            java.lang.String r1 = "node"
            java.lang.Class<com.whatsapp.infra.graphql.generated.groups.QuerySuggestedGroupsResponseImpl$Xwa2GroupQueryById$InlineXWA2CommunityGroup$SubGroupSuggestions$Edges$Node> r0 = com.whatsapp.infra.graphql.generated.groups.QuerySuggestedGroupsResponseImpl.Xwa2GroupQueryById.InlineXWA2CommunityGroup.SubGroupSuggestions.Edges.Node.class
            X.7aq r6 = r2.A00(r0, r1)
            X.C162457s7.A0D(r6)
            X.1fJ r9 = r4.A03
            org.json.JSONObject r5 = r6.A00
            java.lang.String r2 = "id"
            java.lang.String r0 = r5.optString(r2)
            X.1fJ r10 = X.AnonymousClass34R.A05(r0)
            java.lang.String r1 = "subject"
            java.lang.Class<com.whatsapp.infra.graphql.generated.groups.QuerySuggestedGroupsResponseImpl$Xwa2GroupQueryById$InlineXWA2CommunityGroup$SubGroupSuggestions$Edges$Node$Subject> r0 = com.whatsapp.infra.graphql.generated.groups.QuerySuggestedGroupsResponseImpl.Xwa2GroupQueryById.InlineXWA2CommunityGroup.SubGroupSuggestions.Edges.Node.Subject.class
            X.7aq r0 = r6.A00(r0, r1)
            r13 = 0
            if (r0 == 0) goto L_0x0c41
            org.json.JSONObject r1 = r0.A00
            java.lang.String r0 = "value"
            java.lang.String r12 = r1.optString(r0)
        L_0x0bfb:
            java.lang.String r1 = "description"
            java.lang.Class<com.whatsapp.infra.graphql.generated.groups.QuerySuggestedGroupsResponseImpl$Xwa2GroupQueryById$InlineXWA2CommunityGroup$SubGroupSuggestions$Edges$Node$Description> r0 = com.whatsapp.infra.graphql.generated.groups.QuerySuggestedGroupsResponseImpl.Xwa2GroupQueryById.InlineXWA2CommunityGroup.SubGroupSuggestions.Edges.Node.Description.class
            X.7aq r0 = r6.A00(r0, r1)
            if (r0 == 0) goto L_0x0c0e
            org.json.JSONObject r1 = r0.A00
            java.lang.String r0 = "value"
            java.lang.String r13 = r1.optString(r0)
        L_0x0c0e:
            java.lang.String r1 = "creator"
            java.lang.Class<com.whatsapp.infra.graphql.generated.groups.QuerySuggestedGroupsResponseImpl$Xwa2GroupQueryById$InlineXWA2CommunityGroup$SubGroupSuggestions$Edges$Node$Creator> r0 = com.whatsapp.infra.graphql.generated.groups.QuerySuggestedGroupsResponseImpl.Xwa2GroupQueryById.InlineXWA2CommunityGroup.SubGroupSuggestions.Edges.Node.Creator.class
            X.7aq r0 = r6.A00(r0, r1)
            java.lang.String r0 = r0.A04(r2)
            com.whatsapp.jid.UserJid r11 = X.AnonymousClass32Y.A0A(r0)
            java.lang.String r0 = "creation_time"
            java.lang.String r0 = X.C18300x5.A0l(r0, r5)
            long r14 = java.lang.Long.parseLong(r0)
            java.lang.String r0 = "total_participants_count"
            int r0 = r5.optInt(r0)
            long r0 = (long) r0
            java.lang.String r2 = "is_existing_group"
            boolean r18 = r5.optBoolean(r2)
            X.2nf r8 = new X.2nf
            r16 = r0
            r8.<init>(r9, r10, r11, r12, r13, r14, r16, r18)
            r3.add(r8)
            goto L_0x0bc0
        L_0x0c41:
            r12 = r13
            goto L_0x0bfb
        L_0x0c43:
            X.2FL r0 = r4.A00
            if (r0 == 0) goto L_0x0e9b
            X.4Du r0 = r0.A00
            r0.BkD(r3)
            goto L_0x0e9b
        L_0x0c4e:
            X.2FL r0 = r4.A00
            if (r0 == 0) goto L_0x0e9b
            r2 = -1
            X.4Du r1 = r0.A00
            X.24M r0 = new X.24M
            r0.<init>(r2)
            X.AnonymousClass3Z0.A02(r0, r1)
            goto L_0x0e9b
        L_0x0c5f:
            X.2jh r2 = (X.C51362jh) r2
            r4 = 0
            X.C162457s7.A0J(r2, r4)
            java.lang.Object r3 = r1.receiver
            com.whatsapp.community.communitysettings.AllowNonAdminSubgroupCreationBottomSheet r3 = (com.whatsapp.community.communitysettings.AllowNonAdminSubgroupCreationBottomSheet) r3
            r1 = 1
            r3.A0A = r1
            X.20R r0 = r2.A00
            int r0 = r0.ordinal()
            if (r0 == r1) goto L_0x0c84
            if (r0 != r4) goto L_0x0c80
            android.widget.RadioGroup r1 = r3.A00
            if (r1 == 0) goto L_0x0c80
            r0 = 2131431864(0x7f0b11b8, float:1.848547E38)
        L_0x0c7d:
            r1.check(r0)
        L_0x0c80:
            r3.A0A = r4
            goto L_0x0e9b
        L_0x0c84:
            android.widget.RadioGroup r1 = r3.A00
            if (r1 == 0) goto L_0x0c80
            r0 = 2131431865(0x7f0b11b9, float:1.8485471E38)
            goto L_0x0c7d
        L_0x0c8c:
            boolean r3 = X.AnonymousClass001.A1Z(r2)
            java.lang.Object r2 = r1.receiver
            com.whatsapp.community.communitysettings.AllowNonAdminMembersAddBottomSheet r2 = (com.whatsapp.community.communitysettings.AllowNonAdminMembersAddBottomSheet) r2
            r0 = 1
            r2.A03 = r0
            android.widget.RadioGroup r1 = r2.A00
            if (r3 == 0) goto L_0x0ca8
            r0 = 2131431862(0x7f0b11b6, float:1.8485465E38)
        L_0x0c9e:
            if (r1 == 0) goto L_0x0ca3
            r1.check(r0)
        L_0x0ca3:
            r0 = 0
            r2.A03 = r0
            goto L_0x0e9b
        L_0x0ca8:
            r0 = 2131431861(0x7f0b11b5, float:1.8485463E38)
            goto L_0x0c9e
        L_0x0cac:
            com.whatsapp.jid.GroupJid r2 = (com.whatsapp.jid.GroupJid) r2
            r0 = 0
            X.C162457s7.A0J(r2, r0)
            java.lang.Object r1 = r1.receiver
            X.2xM r1 = (X.C59712xM) r1
            java.util.Set r0 = r1.A01
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L_0x0cc7
            r1.A01(r2)
            r0 = 1
        L_0x0cc2:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L_0x0cc7:
            r0 = 0
            goto L_0x0cc2
        L_0x0cc9:
            com.whatsapp.jid.GroupJid r2 = (com.whatsapp.jid.GroupJid) r2
            r0 = 0
            X.C162457s7.A0J(r2, r0)
            java.lang.Object r1 = r1.receiver
            X.2xM r1 = (X.C59712xM) r1
            java.util.Set r0 = r1.A01
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L_0x0cea
            X.2jn r0 = r1.A00
            java.util.Set r0 = r0.A00
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x0cea
            r1.A01(r2)
            goto L_0x0e9b
        L_0x0cea:
            X.4GQ r0 = r1.A06
            r0.invoke(r2)
            goto L_0x0e9b
        L_0x0cf1:
            X.2lB r2 = (X.C52252lB) r2
            r5 = 0
            X.C162457s7.A0J(r2, r5)
            java.lang.Object r4 = r1.receiver
            X.4ea r4 = (X.C89654ea) r4
            int r1 = r2.A01
            if (r1 == 0) goto L_0x0d19
            r3 = 1
            if (r1 == r3) goto L_0x0d10
            r0 = 2
            if (r1 != r0) goto L_0x0e9b
            com.whatsapp.community.CommunityPendingSuggestionsConfirmationDialog r1 = A00(r0, r5, r5)
        L_0x0d09:
            java.lang.String r0 = "CommunitySettingsActivity"
            r4.Bon(r1, r0)
            goto L_0x0e9b
        L_0x0d10:
            int r1 = r2.A00
            int r0 = r2.A02
            com.whatsapp.community.CommunityPendingSuggestionsConfirmationDialog r1 = A00(r3, r1, r0)
            goto L_0x0d09
        L_0x0d19:
            com.whatsapp.community.CommunityPendingSuggestionsConfirmationDialog r1 = A00(r5, r5, r5)
            goto L_0x0d09
        L_0x0d1e:
            boolean r3 = X.AnonymousClass001.A1Z(r2)
            java.lang.Object r2 = r1.receiver
            com.whatsapp.community.CommunitySettingsActivity r2 = (com.whatsapp.community.CommunitySettingsActivity) r2
            r0 = 2131887999(0x7f12077f, float:1.941062E38)
            if (r3 == 0) goto L_0x0d2e
            r0 = 2131888001(0x7f120781, float:1.9410625E38)
        L_0x0d2e:
            java.lang.CharSequence r1 = r2.getText(r0)
            X.C162457s7.A0H(r1)
            X.5UY r0 = r2.A0J
            if (r0 != 0) goto L_0x0d40
            java.lang.String r0 = "membersAddSettingRow"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0d40:
            android.view.View r0 = r0.A04()
            com.whatsapp.settings.SettingsRowIconText r0 = (com.whatsapp.settings.SettingsRowIconText) r0
            r0.setSubText(r1)
            goto L_0x0e9b
        L_0x0d4b:
            X.1mU r2 = (X.C30461mU) r2
            r7 = 0
            X.C162457s7.A0J(r2, r7)
            java.lang.Object r1 = r1.receiver
            X.1NN r1 = (X.AnonymousClass1NN) r1
            X.2pV r0 = r1.getEventMessageManager()
            long r5 = r2.A00
            X.2sH r0 = r0.A01
            long r3 = r0.A0D()
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            boolean r0 = X.AnonymousClass001.A1V(r0)
            if (r0 == 0) goto L_0x0d72
            X.5UY r1 = r1.A0C
            r0 = 8
            r1.A06(r0)
            goto L_0x0e9b
        L_0x0d72:
            X.2z0 r0 = r2.A1J
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x0e0b
            X.21m r0 = X.C372421m.GOING
        L_0x0d7a:
            X.5UY r2 = r1.A0C
            r2.A06(r7)
            if (r0 == 0) goto L_0x0db8
            int r1 = r0.ordinal()
            r0 = 1
            if (r1 == r0) goto L_0x0dda
            r0 = 2
            if (r1 != r0) goto L_0x0db8
            android.view.View r3 = r2.A04()
            android.widget.TextView r3 = (android.widget.TextView) r3
            r0 = 2131887636(0x7f120614, float:1.9409885E38)
            r3.setText(r0)
            android.content.Context r1 = r3.getContext()
            r0 = 2131231660(0x7f0803ac, float:1.8079407E38)
            android.graphics.drawable.Drawable r0 = X.C18310x6.A0G(r1, r0)
            r3.setBackground(r0)
            android.content.Context r2 = X.C18290x4.A0F(r3)
            r1 = 2130971136(0x7f040a00, float:1.7551002E38)
            r0 = 2131102955(0x7f060ceb, float:1.7818363E38)
            int r0 = X.C18300x5.A03(r2, r1, r0)
        L_0x0db3:
            r3.setTextColor(r0)
            goto L_0x0e9b
        L_0x0db8:
            android.view.View r3 = r2.A04()
            android.widget.TextView r3 = (android.widget.TextView) r3
            r0 = 2131887637(0x7f120615, float:1.9409887E38)
            r3.setText(r0)
            android.content.Context r1 = r3.getContext()
            r0 = 2131231658(0x7f0803aa, float:1.8079403E38)
            android.graphics.drawable.Drawable r0 = X.C18310x6.A0G(r1, r0)
            r3.setBackground(r0)
            android.content.Context r4 = r3.getContext()
            r0 = 2131101196(0x7f06060c, float:1.7814795E38)
            goto L_0x0e06
        L_0x0dda:
            android.view.View r3 = r2.A04()
            android.widget.TextView r3 = (android.widget.TextView) r3
            r0 = 2131887635(0x7f120613, float:1.9409883E38)
            r3.setText(r0)
            android.content.Context r1 = r3.getContext()
            r0 = 2131231659(0x7f0803ab, float:1.8079405E38)
            android.graphics.drawable.Drawable r0 = X.C18310x6.A0G(r1, r0)
            r3.setBackground(r0)
            android.content.Context r4 = r3.getContext()
            android.content.Context r2 = r3.getContext()
            r1 = 2130969727(0x7f04047f, float:1.7548144E38)
            r0 = 2131101198(0x7f06060e, float:1.7814799E38)
            int r0 = X.AnonymousClass5Yj.A02(r2, r1, r0)
        L_0x0e06:
            int r0 = X.AnonymousClass0Y8.A04(r4, r0)
            goto L_0x0db3
        L_0x0e0b:
            X.2pV r0 = r1.getEventMessageManager()
            X.1mi r0 = r0.A00(r2)
            if (r0 == 0) goto L_0x0e19
            X.21m r0 = r0.A01
            goto L_0x0d7a
        L_0x0e19:
            r0 = 0
            goto L_0x0d7a
        L_0x0e1c:
            java.lang.Object r0 = r1.receiver
            X.4E1 r0 = (X.AnonymousClass4E1) r0
            org.json.JSONObject r0 = r0.Bqt(r2)
            return r0
        L_0x0e25:
            org.json.JSONObject r2 = (org.json.JSONObject) r2
            java.lang.Object r0 = r1.receiver
            X.4E1 r0 = (X.AnonymousClass4E1) r0
            java.lang.Object r0 = r0.B3a(r2)
            return r0
        L_0x0e30:
            com.whatsapp.jid.UserJid r2 = (com.whatsapp.jid.UserJid) r2
            r0 = 0
            X.C162457s7.A0J(r2, r0)
            java.lang.Object r0 = r1.receiver
            X.2cg r0 = (X.C47082cg) r0
            boolean r0 = r0.A00(r2)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L_0x0e43:
            java.lang.Object r4 = r1.receiver
            com.whatsapp.bonsai.discovery.BonsaiDiscoveryViewModel r4 = (com.whatsapp.bonsai.discovery.BonsaiDiscoveryViewModel) r4
            if (r21 != 0) goto L_0x0e61
            X.08J r1 = r4.A00
            X.66R r0 = r4.A09
            java.lang.Object r0 = r0.getValue()
            r1.A0H(r0)
            X.4FS r3 = r4.A06
            r0 = 8
            X.5rQ r1 = new X.5rQ
            r1.<init>(r4, r0)
        L_0x0e5d:
            r3.BkM(r1)
            goto L_0x0e9b
        L_0x0e61:
            X.4FS r3 = r4.A06
            r0 = 30
            X.5rV r1 = new X.5rV
            r1.<init>(r4, r0, r2)
            goto L_0x0e5d
        L_0x0e6b:
            X.20P r2 = (X.AnonymousClass20P) r2
            java.lang.Object r0 = r1.receiver
            X.0eF r0 = (X.C08310eF) r0
            if (r2 == 0) goto L_0x0e9b
            android.view.View r1 = r0.A0B
            if (r1 == 0) goto L_0x0e9b
            r0 = 2131428084(0x7f0b02f4, float:1.8477802E38)
            android.widget.TextView r4 = X.AnonymousClass0x2.A0I(r1, r0)
            r0 = 2131428082(0x7f0b02f2, float:1.8477798E38)
            android.widget.TextView r3 = X.AnonymousClass0x2.A0I(r1, r0)
            int r1 = r2.ordinal()
            r0 = 0
            if (r1 == r0) goto L_0x0e9e
            r0 = 1
            if (r1 != r0) goto L_0x0e9b
            r0 = 2131886938(0x7f12035a, float:1.9408469E38)
            r4.setText(r0)
            r0 = 2131886937(0x7f120359, float:1.9408467E38)
        L_0x0e98:
            r3.setText(r0)
        L_0x0e9b:
            X.2wD r0 = X.C59022wD.A00
            return r0
        L_0x0e9e:
            r0 = 2131886950(0x7f120366, float:1.9408493E38)
            r4.setText(r0)
            r0 = 2131886948(0x7f120364, float:1.940849E38)
            goto L_0x0e98
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C383026z.invoke(java.lang.Object):java.lang.Object");
    }
}
