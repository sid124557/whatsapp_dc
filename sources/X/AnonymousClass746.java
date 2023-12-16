package X;

import java.util.Locale;
import org.json.JSONObject;

/* renamed from: X.746  reason: invalid class name */
public class AnonymousClass746 extends AnonymousClass8V2 implements AnonymousClass4GQ {
    public final int A00;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass746(java.lang.Object r8, int r9) {
        /*
            r7 = this;
            r0 = r7
            r7.A00 = r9
            switch(r9) {
                case 0: goto L_0x0013;
                case 1: goto L_0x001a;
                case 2: goto L_0x0021;
                case 3: goto L_0x0028;
                case 4: goto L_0x002f;
                case 5: goto L_0x0036;
                case 6: goto L_0x003d;
                case 7: goto L_0x0044;
                case 8: goto L_0x0044;
                case 9: goto L_0x004b;
                case 10: goto L_0x0052;
                case 11: goto L_0x0059;
                case 12: goto L_0x0052;
                case 13: goto L_0x0059;
                case 14: goto L_0x0060;
                case 15: goto L_0x0067;
                case 16: goto L_0x006e;
                case 17: goto L_0x0075;
                case 18: goto L_0x007c;
                case 19: goto L_0x0075;
                case 20: goto L_0x0083;
                case 21: goto L_0x008a;
                case 22: goto L_0x0092;
                case 23: goto L_0x009a;
                case 24: goto L_0x00a2;
                case 25: goto L_0x00aa;
                case 26: goto L_0x00b2;
                case 27: goto L_0x00ba;
                case 28: goto L_0x00c2;
                case 29: goto L_0x00ca;
                case 30: goto L_0x00d2;
                case 31: goto L_0x00da;
                default: goto L_0x0006;
            }
        L_0x0006:
            java.lang.Class<X.7Wt> r3 = X.C151907Wt.class
            java.lang.String r4 = "update"
            java.lang.String r5 = "update(Lcom/whatsapp/pushtorecordmedia/PushToRecordMediaTipControllerState;)V"
        L_0x000c:
            r1 = 1
            r6 = 0
            r2 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        L_0x0013:
            java.lang.Class<X.6Hd> r3 = X.C125266Hd.class
            java.lang.String r4 = "onSelected"
            java.lang.String r5 = "onSelected(I)V"
            goto L_0x000c
        L_0x001a:
            java.lang.Class<com.whatsapp.biz.catalog.view.variants.TextVariantsBottomSheet> r3 = com.whatsapp.biz.catalog.view.variants.TextVariantsBottomSheet.class
            java.lang.String r4 = "closeWithResult"
            java.lang.String r5 = "closeWithResult(I)V"
            goto L_0x000c
        L_0x0021:
            java.lang.Class<X.6Hg> r3 = X.C125296Hg.class
            java.lang.String r4 = "onViewItemClick"
            java.lang.String r5 = "onViewItemClick(I)V"
            goto L_0x000c
        L_0x0028:
            java.lang.Class<com.whatsapp.biz.catalog.view.variants.VariantsCarouselFragment> r3 = com.whatsapp.biz.catalog.view.variants.VariantsCarouselFragment.class
            java.lang.String r4 = "updateUi"
            java.lang.String r5 = "updateUi(Lcom/whatsapp/biz/catalog/view/variants/VariantsCarouselFragmentUiState;)V"
            goto L_0x000c
        L_0x002f:
            java.lang.Class<X.4QF> r3 = X.AnonymousClass4QF.class
            java.lang.String r4 = "onBotProfileChanged"
            java.lang.String r5 = "onBotProfileChanged(Lcom/whatsapp/BotProfile;)V"
            goto L_0x000c
        L_0x0036:
            java.lang.Class<com.whatsapp.calling.lightweightcalling.view.AudioChatBottomSheetDialog> r3 = com.whatsapp.calling.lightweightcalling.view.AudioChatBottomSheetDialog.class
            java.lang.String r4 = "onIsCallActiveChanged"
            java.lang.String r5 = "onIsCallActiveChanged(Z)V"
            goto L_0x000c
        L_0x003d:
            java.lang.Class<X.4Ql> r3 = X.AnonymousClass4Ql.class
            java.lang.String r4 = "bindViewState"
            java.lang.String r5 = "bindViewState(Lcom/whatsapp/calling/lightweightcalling/viewmodel/AudioChatCallingBannerViewState;)V"
            goto L_0x000c
        L_0x0044:
            java.lang.Class<X.4PI> r3 = X.AnonymousClass4PI.class
            java.lang.String r4 = "setupVoiceChatBanner"
            java.lang.String r5 = "setupVoiceChatBanner(Z)V"
            goto L_0x000c
        L_0x004b:
            java.lang.Class<com.whatsapp.catalogcategory.view.viewmodel.CatalogAllCategoryViewModel> r3 = com.whatsapp.catalogcategory.view.viewmodel.CatalogAllCategoryViewModel.class
            java.lang.String r4 = "handleAllCategoryItemClicked"
            java.lang.String r5 = "handleAllCategoryItemClicked(Lcom/whatsapp/catalogcategory/view/adapter/CatalogCategoryListItem;)V"
            goto L_0x000c
        L_0x0052:
            java.lang.Class<X.7Ku> r3 = X.C149067Ku.class
            java.lang.String r4 = "onGroupInfoParsed"
            java.lang.String r5 = "onGroupInfoParsed(Lcom/whatsapp/group/batch/GroupInfoDataEnvelope;)V"
            goto L_0x000c
        L_0x0059:
            java.lang.Class<X.7Ku> r3 = X.C149067Ku.class
            java.lang.String r4 = "onCriticalEvent"
            java.lang.String r5 = "onCriticalEvent(Lcom/whatsapp/group/protocol/CriticalEvent;)V"
            goto L_0x000c
        L_0x0060:
            java.lang.Class<X.6n8> r3 = X.C136706n8.class
            java.lang.String r4 = "handleData"
            java.lang.String r5 = "handleData(Lcom/whatsapp/infra/graphql/generated/newsletter/NewsletterDeleteResponse;)V"
            goto L_0x000c
        L_0x0067:
            java.lang.Class<X.6n8> r3 = X.C136706n8.class
            java.lang.String r4 = "handleError"
            java.lang.String r5 = "handleError(Lcom/whatsapp/infra/graphql/error/MexErrorSummary;)Z"
            goto L_0x000c
        L_0x006e:
            java.lang.Class<X.6nD> r3 = X.C136756nD.class
            java.lang.String r4 = "handleRecommendedSuccess"
            java.lang.String r5 = "handleRecommendedSuccess(Lcom/whatsapp/infra/graphql/generated/newsletter/NewsletterRecommendedResponse;)V"
            goto L_0x000c
        L_0x0075:
            java.lang.Class<X.6nD> r3 = X.C136756nD.class
            java.lang.String r4 = "handleErrors"
            java.lang.String r5 = "handleErrors(Lcom/whatsapp/infra/graphql/error/MexErrorSummary;)Z"
            goto L_0x000c
        L_0x007c:
            java.lang.Class<X.6nD> r3 = X.C136756nD.class
            java.lang.String r4 = "handleDirectorySuccess"
            java.lang.String r5 = "handleDirectorySuccess(Lcom/whatsapp/infra/graphql/generated/newsletter/NewsletterSearchResponse;)V"
            goto L_0x000c
        L_0x0083:
            java.lang.Class<X.6n7> r3 = X.C136696n7.class
            java.lang.String r4 = "handleData"
            java.lang.String r5 = "handleData(Lcom/whatsapp/infra/graphql/generated/newsletter/NewsletterAcceptAdminInviteResponse;)V"
            goto L_0x000c
        L_0x008a:
            java.lang.Class<X.6n7> r3 = X.C136696n7.class
            java.lang.String r4 = "handleError"
            java.lang.String r5 = "handleError(Lcom/whatsapp/infra/graphql/error/MexErrorSummary;)Z"
            goto L_0x000c
        L_0x0092:
            java.lang.Class<X.6n9> r3 = X.C136716n9.class
            java.lang.String r4 = "handleData"
            java.lang.String r5 = "handleData(Lcom/whatsapp/infra/graphql/generated/newsletter/NewsletterAdminDemoteResponse;)V"
            goto L_0x000c
        L_0x009a:
            java.lang.Class<X.6n9> r3 = X.C136716n9.class
            java.lang.String r4 = "handleError"
            java.lang.String r5 = "handleError(Lcom/whatsapp/infra/graphql/error/MexErrorSummary;)Z"
            goto L_0x000c
        L_0x00a2:
            java.lang.Class<X.6nA> r3 = X.C136726nA.class
            java.lang.String r4 = "handleData"
            java.lang.String r5 = "handleData(Lcom/whatsapp/infra/graphql/generated/newsletter/NewsletterAdminInviteResponse;)V"
            goto L_0x000c
        L_0x00aa:
            java.lang.Class<X.6nA> r3 = X.C136726nA.class
            java.lang.String r4 = "handleError"
            java.lang.String r5 = "handleError(Lcom/whatsapp/infra/graphql/error/MexErrorSummary;)Z"
            goto L_0x000c
        L_0x00b2:
            java.lang.Class<X.6nB> r3 = X.C136736nB.class
            java.lang.String r4 = "handleData"
            java.lang.String r5 = "handleData(Lcom/whatsapp/infra/graphql/generated/newsletter/NewsletterAdminInviteRevokeResponse;)V"
            goto L_0x000c
        L_0x00ba:
            java.lang.Class<X.6nB> r3 = X.C136736nB.class
            java.lang.String r4 = "handleError"
            java.lang.String r5 = "handleError(Lcom/whatsapp/infra/graphql/error/MexErrorSummary;)Z"
            goto L_0x000c
        L_0x00c2:
            java.lang.Class<X.6nJ> r3 = X.C136816nJ.class
            java.lang.String r4 = "handleDirectorySuccess"
            java.lang.String r5 = "handleDirectorySuccess(Lcom/whatsapp/infra/graphql/generated/newsletter/NewsletterDirectoryListResponse;)V"
            goto L_0x000c
        L_0x00ca:
            java.lang.Class<X.6nJ> r3 = X.C136816nJ.class
            java.lang.String r4 = "handleErrors"
            java.lang.String r5 = "handleErrors(Lcom/whatsapp/infra/graphql/error/MexErrorSummary;)Z"
            goto L_0x000c
        L_0x00d2:
            java.lang.Class<X.6nH> r3 = X.C136796nH.class
            java.lang.String r4 = "handleDirectorySuccess"
            java.lang.String r5 = "handleDirectorySuccess(Lcom/whatsapp/infra/graphql/generated/newsletter/NewsletterDirectorySearchResponse;)V"
            goto L_0x000c
        L_0x00da:
            java.lang.Class<X.6nH> r3 = X.C136796nH.class
            java.lang.String r4 = "handleErrors"
            java.lang.String r5 = "handleErrors(Lcom/whatsapp/infra/graphql/error/MexErrorSummary;)Z"
            goto L_0x000c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass746.<init>(java.lang.Object, int):void");
    }

    public static C59022wD A01(C27851em r1, Object obj, int i) {
        r1.A01 = new AnonymousClass746(obj, i);
        return C59022wD.A00;
    }

    public static void A02(C27851em r1, Object obj, int i) {
        r1.A00 = new AnonymousClass746(obj, i);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x02ee, code lost:
        if (r5.has("transition_policy") == false) goto L_0x031c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x02f0, code lost:
        r3 = A00("transition_policy", r9, r5);
        r2 = r3.hashCode();
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x02fc, code lost:
        if (r2 == -1411068134) goto L_0x031d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0301, code lost:
        if (r2 == -212059869) goto L_0x0312;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0306, code lost:
        if (r2 != 39319094) goto L_0x031d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x030e, code lost:
        if (r3.equals("queue_duration_based") == false) goto L_0x031d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0310, code lost:
        r1 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0318, code lost:
        if (r3.equals("queue_flush_append") == false) goto L_0x031d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x031a, code lost:
        r1 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x031c, code lost:
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0323, code lost:
        if (r5.has("queue_duration_threshold") == false) goto L_0x0339;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0325, code lost:
        r3 = r5.getInt("queue_duration_threshold");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0329, code lost:
        r2 = java.lang.Integer.valueOf(r13);
        X.C162457s7.A0H(r4);
        r7.put(r2, new X.C152247Yd(r4, r1, r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0339, code lost:
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x033b, code lost:
        r6 = r6 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:335:0x0862, code lost:
        if (r1 == null) goto L_0x086b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:336:0x0864, code lost:
        r1.onError(X.C1452274r.A00(r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:338:0x086f, code lost:
        return java.lang.Boolean.valueOf(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:349:0x08b6, code lost:
        r4.A08(new com.whatsapp.infra.graphql.generated.newsletter.NewsletterDirectoryResponseFragmentImpl(r0.A00));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:383:0x096c, code lost:
        if (r9.A01() != true) goto L_0x096e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:385:0x0970, code lost:
        if (r7 == false) goto L_0x0972;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:386:0x0972, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:387:0x0973, code lost:
        if (r9 == null) goto L_0x0979;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:388:0x0975, code lost:
        r6 = r9.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:389:0x0979, code lost:
        r4 = r2.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:390:0x097d, code lost:
        if (r6 != r4) goto L_0x0980;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:391:0x097f, code lost:
        r5 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:392:0x0980, code lost:
        if (r8 == null) goto L_0x09e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:393:0x0982, code lost:
        if (r0 != false) goto L_0x0986;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:394:0x0984, code lost:
        if (r5 == false) goto L_0x09e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:395:0x0986, code lost:
        r5 = r11.A01();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:396:0x098a, code lost:
        if (r5 == null) goto L_0x09e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:397:0x098c, code lost:
        if (r4 == null) goto L_0x09e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:398:0x098e, code lost:
        r6 = 1;
        r9 = X.AnonymousClass000.A1U(X.C18290x4.A0G(r5).getConfiguration().screenLayout & 15, 1);
        r3 = r4.ordinal();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:399:0x09a4, code lost:
        if (r3 == 3) goto L_0x0a30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:401:0x09a7, code lost:
        if (r3 == 4) goto L_0x0a11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:402:0x09a9, code lost:
        r6 = new android.graphics.PointF(0.0f, 0.0f);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:403:0x09af, code lost:
        r12 = com.whatsapp.R.drawable.tooltip_ptt;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:404:0x09b2, code lost:
        if (r9 == false) goto L_0x09b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:405:0x09b4, code lost:
        r12 = com.whatsapp.R.drawable.tooltip_ptt_small;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:407:0x09b9, code lost:
        if (r12 == r11.A00) goto L_0x09d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:408:0x09bb, code lost:
        r11.A00 = r12;
        r9 = r11.A03.A04();
        X.C162457s7.A0D(r9);
        r9.setBackground(new X.C131666dx(X.C02680He.A00((android.content.res.Resources.Theme) null, X.C18290x4.A0G(r9), r12), r11.A04));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:409:0x09d9, code lost:
        r5.setTranslationX(r6.x);
        r5.setTranslationY(r6.y);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:410:0x09e3, code lost:
        if (r1 == r7) goto L_0x0a0e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:411:0x09e5, code lost:
        if (r8 == null) goto L_0x0a0e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:412:0x09e7, code lost:
        r8.setVisibility(0);
        r8.clearAnimation();
        r1 = r8.animate().setDuration(320);
        r0 = 0.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:413:0x09f8, code lost:
        if (r7 == false) goto L_0x09fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:414:0x09fa, code lost:
        r0 = 1.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:415:0x09fc, code lost:
        r1.alpha(r0).withEndAction(new X.C70133a0(r2, 35, r8)).start();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:419:0x0a17, code lost:
        if (r11.A04.A0T() != false) goto L_0x0a1a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:420:0x0a19, code lost:
        r6 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:421:0x0a1a, code lost:
        r6 = new android.graphics.PointF(((float) r6) * r11.A00(com.whatsapp.R.dimen.f6nameremoved), r11.A00(com.whatsapp.R.dimen.f6nameremoved));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:423:0x0a36, code lost:
        if (r11.A04.A0T() != false) goto L_0x0a39;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:424:0x0a38, code lost:
        r6 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:425:0x0a39, code lost:
        r4 = r11.A00(com.whatsapp.R.dimen.f6nameremoved);
        r3 = (float) r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:426:0x0a41, code lost:
        if (r9 == false) goto L_0x0a5a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:427:0x0a43, code lost:
        r3 = r3 * r11.A00(com.whatsapp.R.dimen.f6nameremoved);
        r0 = com.whatsapp.R.dimen.f6nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:428:0x0a4e, code lost:
        r6 = new android.graphics.PointF(r3, r4 - r11.A00(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:429:0x0a5a, code lost:
        r3 = r3 * r11.A00(com.whatsapp.R.dimen.f6nameremoved);
        r4 = r4 - r11.A00(com.whatsapp.R.dimen.f6nameremoved);
        r0 = com.whatsapp.R.dimen.f6nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002a, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x02c3, code lost:
        r0 = r1.equals(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x02df, code lost:
        if (r0 != false) goto L_0x02e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x02e1, code lost:
        r13 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x02e2, code lost:
        r4 = r5.getString("next_state");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r35) {
        /*
            r34 = this;
            r2 = r35
            r5 = r34
            int r0 = r5.A00
            switch(r0) {
                case 0: goto L_0x0048;
                case 1: goto L_0x005b;
                case 2: goto L_0x008e;
                case 3: goto L_0x00a9;
                case 4: goto L_0x0139;
                case 5: goto L_0x045e;
                case 6: goto L_0x046f;
                case 7: goto L_0x047e;
                case 8: goto L_0x047e;
                case 9: goto L_0x048b;
                case 10: goto L_0x0521;
                case 11: goto L_0x053a;
                case 12: goto L_0x0521;
                case 13: goto L_0x053a;
                case 14: goto L_0x054f;
                case 15: goto L_0x05b8;
                case 16: goto L_0x05c6;
                case 17: goto L_0x002b;
                case 18: goto L_0x0620;
                case 19: goto L_0x002b;
                case 20: goto L_0x06a2;
                case 21: goto L_0x06ec;
                case 22: goto L_0x06fe;
                case 23: goto L_0x0748;
                case 24: goto L_0x075a;
                case 25: goto L_0x07e4;
                case 26: goto L_0x0808;
                case 27: goto L_0x0852;
                case 28: goto L_0x0870;
                case 29: goto L_0x0009;
                case 30: goto L_0x0893;
                case 31: goto L_0x0009;
                case 32: goto L_0x08c2;
                default: goto L_0x0009;
            }
        L_0x0009:
            r0 = 0
            X.C162457s7.A0J(r2, r0)
            java.lang.Object r1 = r5.receiver
            X.6nC r1 = (X.C136746nC) r1
            boolean r0 = r1.isCancelled
            if (r0 != 0) goto L_0x0025
            X.8rv r3 = r1.callback
            if (r3 == 0) goto L_0x0025
            java.lang.String r1 = r2.toString()
            X.6nG r0 = new X.6nG
            r0.<init>(r1)
            r3.BS5(r0)
        L_0x0025:
            r0 = 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L_0x002b:
            r0 = 0
            X.C162457s7.A0J(r2, r0)
            java.lang.Object r1 = r5.receiver
            X.6nD r1 = (X.C136756nD) r1
            boolean r0 = r1.isCancelled
            if (r0 != 0) goto L_0x0025
            X.4DH r3 = r1.callback
            if (r3 == 0) goto L_0x0025
            java.lang.String r1 = r2.toString()
            X.6nG r0 = new X.6nG
            r0.<init>(r1)
            r3.BS5(r0)
            goto L_0x0025
        L_0x0048:
            int r3 = X.AnonymousClass001.A0K(r2)
            java.lang.Object r0 = r5.receiver
            X.6Hd r0 = (X.C125266Hd) r0
            X.8nR r2 = r0.A03
            X.7y9 r1 = r0.A04
            X.7xw r0 = r0.A01
            r2.BGq(r0, r1, r3)
            goto L_0x0a0e
        L_0x005b:
            int r4 = X.AnonymousClass001.A0K(r2)
            java.lang.Object r3 = r5.receiver
            com.whatsapp.biz.catalog.view.variants.TextVariantsBottomSheet r3 = (com.whatsapp.biz.catalog.view.variants.TextVariantsBottomSheet) r3
            androidx.recyclerview.widget.RecyclerView r0 = r3.A00
            r1 = 0
            if (r0 == 0) goto L_0x006a
            X.0R6 r1 = r0.A0N
        L_0x006a:
            boolean r0 = r1 instanceof X.C125266Hd
            if (r0 == 0) goto L_0x007b
            X.6Hd r1 = (X.C125266Hd) r1
            if (r1 == 0) goto L_0x007b
            int r0 = r1.A00
            if (r0 != r4) goto L_0x007b
        L_0x0076:
            r3.A1K()
            goto L_0x0a0e
        L_0x007b:
            android.os.Bundle r2 = X.AnonymousClass002.A08()
            java.lang.String r0 = "text.option.selection.result"
            r2.putInt(r0, r4)
            X.0df r1 = r3.A0U()
            java.lang.String r0 = "text.option.selection.request.key"
            r1.A0n(r0, r2)
            goto L_0x0076
        L_0x008e:
            int r4 = X.AnonymousClass001.A0K(r2)
            java.lang.Object r3 = r5.receiver
            X.6Hg r3 = (X.C125296Hg) r3
            boolean r0 = r3.A04
            if (r0 != 0) goto L_0x0a0e
            int r0 = r3.A00
            if (r0 == r4) goto L_0x0a0e
            X.8nR r2 = r3.A02
            X.7y9 r1 = r3.A03
            X.7xw r0 = r3.A01
            r2.BGq(r0, r1, r4)
            goto L_0x0a0e
        L_0x00a9:
            X.7Xk r2 = (X.C152067Xk) r2
            r3 = 0
            X.C162457s7.A0J(r2, r3)
            java.lang.Object r4 = r5.receiver
            com.whatsapp.biz.catalog.view.variants.VariantsCarouselFragment r4 = (com.whatsapp.biz.catalog.view.variants.VariantsCarouselFragment) r4
            java.util.List r2 = r2.A00
            boolean r0 = r2.isEmpty()
            r1 = 1
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x00cf
            java.lang.Object r0 = r2.get(r3)
            X.7Za r0 = (X.C152477Za) r0
            boolean r0 = r0.A04
            if (r0 == 0) goto L_0x00e8
            X.7a0 r0 = r4.A03
            if (r0 == 0) goto L_0x00cf
            r0.A00()
        L_0x00cf:
            int r0 = r2.size()
            if (r0 <= r1) goto L_0x0a0e
            java.lang.Object r0 = r2.get(r1)
            X.7Za r0 = (X.C152477Za) r0
            boolean r0 = r0.A04
            if (r0 == 0) goto L_0x0112
            X.7a0 r0 = r4.A04
            if (r0 == 0) goto L_0x0a0e
            r0.A00()
            goto L_0x0a0e
        L_0x00e8:
            X.7a0 r6 = r4.A03
            java.lang.Object r0 = r2.get(r3)
            X.7Za r0 = (X.C152477Za) r0
            int r9 = r0.A00
            java.lang.Object r0 = X.C73723fy.A06(r2, r1)
            X.7Za r0 = (X.C152477Za) r0
            if (r0 == 0) goto L_0x0110
            X.7xw r5 = r0.A01
        L_0x00fc:
            java.lang.Object r0 = r2.get(r3)
            X.7Za r0 = (X.C152477Za) r0
            X.7y9 r7 = r0.A02
            java.lang.Object r0 = r2.get(r3)
            X.7Za r0 = (X.C152477Za) r0
            java.lang.Integer r8 = r0.A03
            r4.A1J(r5, r6, r7, r8, r9)
            goto L_0x00cf
        L_0x0110:
            r5 = 0
            goto L_0x00fc
        L_0x0112:
            X.7a0 r6 = r4.A04
            java.lang.Object r0 = r2.get(r1)
            X.7Za r0 = (X.C152477Za) r0
            int r9 = r0.A00
            java.lang.Object r0 = r2.get(r3)
            X.7Za r0 = (X.C152477Za) r0
            X.7xw r5 = r0.A01
            java.lang.Object r0 = r2.get(r1)
            X.7Za r0 = (X.C152477Za) r0
            X.7y9 r7 = r0.A02
            java.lang.Object r0 = r2.get(r1)
            X.7Za r0 = (X.C152477Za) r0
            java.lang.Integer r8 = r0.A03
            r4.A1J(r5, r6, r7, r8, r9)
            goto L_0x0a0e
        L_0x0139:
            X.2o1 r2 = (X.C54002o1) r2
            java.lang.Object r0 = r5.receiver
            X.4QF r0 = (X.AnonymousClass4QF) r0
            if (r2 == 0) goto L_0x0a0e
            java.lang.String r3 = r2.A03
            if (r3 == 0) goto L_0x0a0e
            X.7kH r10 = r0.A02
            if (r10 != 0) goto L_0x0150
            java.lang.String r0 = "clientOrchestrator"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0150:
            org.json.JSONObject r2 = X.AnonymousClass0x9.A1H(r3)     // Catch:{ JSONException -> 0x0436 }
            java.lang.String r1 = "data"
            boolean r0 = r2.has(r1)     // Catch:{ JSONException -> 0x0436 }
            if (r0 == 0) goto L_0x0175
            org.json.JSONObject r0 = X.AnonymousClass0x9.A1H(r3)     // Catch:{ JSONException -> 0x0436 }
            org.json.JSONObject r2 = r0.getJSONObject(r1)     // Catch:{ JSONException -> 0x0436 }
            java.lang.String r1 = "aiagent_gen_behavior_graph_from_embodiment"
            boolean r0 = r2.has(r1)     // Catch:{ JSONException -> 0x0436 }
            if (r0 != 0) goto L_0x016e
            java.lang.String r1 = "aiagent_gen_behavior_graph"
        L_0x016e:
            org.json.JSONObject r2 = r2.getJSONObject(r1)     // Catch:{ JSONException -> 0x0436 }
            X.C162457s7.A0D(r2)     // Catch:{ JSONException -> 0x0436 }
        L_0x0175:
            java.lang.String r1 = "persona_profile"
            boolean r0 = r2.has(r1)     // Catch:{ JSONException -> 0x0436 }
            if (r0 == 0) goto L_0x01dd
            java.lang.String r28 = r2.getString(r1)     // Catch:{ JSONException -> 0x0436 }
        L_0x0181:
            java.lang.String r0 = "version"
            int r33 = r2.getInt(r0)     // Catch:{ JSONException -> 0x0436 }
            java.lang.String r0 = "initial_status"
            org.json.JSONObject r1 = r2.getJSONObject(r0)     // Catch:{ JSONException -> 0x0436 }
            java.lang.String r0 = "state"
            java.lang.String r5 = X.C18290x4.A0r(r0, r1)     // Catch:{ JSONException -> 0x0436 }
            java.lang.String r0 = "action"
            java.lang.String r0 = X.C18290x4.A0r(r0, r1)     // Catch:{ JSONException -> 0x0436 }
            java.util.Locale r9 = java.util.Locale.ROOT     // Catch:{ JSONException -> 0x0436 }
            java.lang.String r4 = r0.toLowerCase(r9)     // Catch:{ JSONException -> 0x0436 }
            X.C162457s7.A0D(r4)     // Catch:{ JSONException -> 0x0436 }
            java.lang.String r0 = "sentiment"
            java.lang.String r3 = A00(r0, r9, r1)     // Catch:{ JSONException -> 0x0436 }
            java.lang.String r0 = "intensity"
            java.lang.String r1 = A00(r0, r9, r1)     // Catch:{ JSONException -> 0x0436 }
            X.7Z9 r27 = new X.7Z9     // Catch:{ JSONException -> 0x0436 }
            r0 = r27
            r0.<init>(r5, r4, r3, r1)     // Catch:{ JSONException -> 0x0436 }
            X.3d3 r30 = X.C72023d3.A00     // Catch:{ JSONException -> 0x0436 }
            java.lang.String r0 = "prefetch_videos"
            org.json.JSONArray r0 = r2.getJSONArray(r0)     // Catch:{ JSONException -> 0x0436 }
            X.C162457s7.A0D(r0)     // Catch:{ JSONException -> 0x0436 }
            java.util.List r31 = X.C154247cr.A01(r0)     // Catch:{ JSONException -> 0x0436 }
            java.lang.String r0 = "persona_global_default_sentiment"
            java.lang.String r29 = r2.getString(r0)     // Catch:{ JSONException -> 0x0436 }
            java.lang.String r0 = "states"
            org.json.JSONArray r26 = r2.getJSONArray(r0)     // Catch:{ JSONException -> 0x0436 }
            X.C162457s7.A0D(r26)     // Catch:{ JSONException -> 0x0436 }
            java.util.LinkedHashMap r25 = X.C18320x8.A0r()     // Catch:{ JSONException -> 0x0436 }
            int r24 = r26.length()     // Catch:{ JSONException -> 0x0436 }
            r8 = 0
            goto L_0x01e0
        L_0x01dd:
            java.lang.String r28 = ""
            goto L_0x0181
        L_0x01e0:
            r0 = r24
            if (r8 >= r0) goto L_0x0354
            r0 = r26
            org.json.JSONObject r7 = r0.getJSONObject(r8)     // Catch:{ JSONException -> 0x0436 }
            java.lang.String r6 = "name"
            java.lang.String r23 = r7.getString(r6)     // Catch:{ JSONException -> 0x0436 }
            java.lang.String r0 = "actions"
            org.json.JSONArray r22 = r7.getJSONArray(r0)     // Catch:{ JSONException -> 0x0436 }
            X.C162457s7.A0D(r22)     // Catch:{ JSONException -> 0x0436 }
            java.util.LinkedHashMap r21 = X.C18320x8.A0r()     // Catch:{ JSONException -> 0x0436 }
            int r20 = r22.length()     // Catch:{ JSONException -> 0x0436 }
            r5 = 0
        L_0x0202:
            r0 = r20
            if (r5 >= r0) goto L_0x0287
            r0 = r22
            org.json.JSONObject r1 = r0.getJSONObject(r5)     // Catch:{ JSONException -> 0x0436 }
            java.lang.String r13 = A00(r6, r9, r1)     // Catch:{ JSONException -> 0x0436 }
            java.lang.String r0 = "sentiments"
            org.json.JSONArray r19 = r1.getJSONArray(r0)     // Catch:{ JSONException -> 0x0436 }
            X.C162457s7.A0D(r19)     // Catch:{ JSONException -> 0x0436 }
            java.util.LinkedHashMap r12 = X.C18320x8.A0r()     // Catch:{ JSONException -> 0x0436 }
            int r18 = r19.length()     // Catch:{ JSONException -> 0x0436 }
            r4 = 0
        L_0x0222:
            r0 = r18
            if (r4 >= r0) goto L_0x0279
            r0 = r19
            org.json.JSONObject r1 = r0.getJSONObject(r4)     // Catch:{ JSONException -> 0x0436 }
            java.lang.String r11 = A00(r6, r9, r1)     // Catch:{ JSONException -> 0x0436 }
            java.lang.String r0 = "is_default"
            boolean r17 = r1.getBoolean(r0)     // Catch:{ JSONException -> 0x0436 }
            java.lang.String r0 = "intensities"
            org.json.JSONArray r16 = r1.getJSONArray(r0)     // Catch:{ JSONException -> 0x0436 }
            X.C162457s7.A0D(r16)     // Catch:{ JSONException -> 0x0436 }
            java.util.LinkedHashMap r3 = X.C18320x8.A0r()     // Catch:{ JSONException -> 0x0436 }
            int r15 = r16.length()     // Catch:{ JSONException -> 0x0436 }
            r2 = 0
        L_0x0248:
            if (r2 >= r15) goto L_0x026c
            r0 = r16
            org.json.JSONObject r0 = r0.getJSONObject(r2)     // Catch:{ JSONException -> 0x0436 }
            java.lang.String r1 = A00(r6, r9, r0)     // Catch:{ JSONException -> 0x0436 }
            java.lang.String r14 = "videos"
            org.json.JSONArray r0 = r0.getJSONArray(r14)     // Catch:{ JSONException -> 0x0436 }
            X.C162457s7.A0D(r0)     // Catch:{ JSONException -> 0x0436 }
            java.util.List r14 = X.C154247cr.A01(r0)     // Catch:{ JSONException -> 0x0436 }
            X.7Yb r0 = new X.7Yb     // Catch:{ JSONException -> 0x0436 }
            r0.<init>(r1, r14)     // Catch:{ JSONException -> 0x0436 }
            r3.put(r1, r0)     // Catch:{ JSONException -> 0x0436 }
            int r2 = r2 + 1
            goto L_0x0248
        L_0x026c:
            X.5S4 r1 = new X.5S4     // Catch:{ JSONException -> 0x0436 }
            r0 = r17
            r1.<init>(r11, r3, r0)     // Catch:{ JSONException -> 0x0436 }
            r12.put(r11, r1)     // Catch:{ JSONException -> 0x0436 }
            int r4 = r4 + 1
            goto L_0x0222
        L_0x0279:
            X.7Y2 r1 = new X.7Y2     // Catch:{ JSONException -> 0x0436 }
            r1.<init>(r13, r12)     // Catch:{ JSONException -> 0x0436 }
            r0 = r21
            r0.put(r13, r1)     // Catch:{ JSONException -> 0x0436 }
            int r5 = r5 + 1
            goto L_0x0202
        L_0x0287:
            java.lang.String r0 = "transitions"
            org.json.JSONArray r12 = r7.getJSONArray(r0)     // Catch:{ JSONException -> 0x0436 }
            X.C162457s7.A0D(r12)     // Catch:{ JSONException -> 0x0436 }
            java.util.LinkedHashMap r7 = X.C18320x8.A0r()     // Catch:{ JSONException -> 0x0436 }
            int r11 = r12.length()     // Catch:{ JSONException -> 0x0436 }
            r6 = 0
        L_0x0299:
            if (r6 >= r11) goto L_0x033f
            org.json.JSONObject r5 = r12.getJSONObject(r6)     // Catch:{ JSONException -> 0x0436 }
            java.lang.String r0 = "trigger"
            java.lang.String r1 = A00(r0, r9, r5)     // Catch:{ JSONException -> 0x0436 }
            int r0 = r1.hashCode()     // Catch:{ JSONException -> 0x0436 }
            r13 = 4
            switch(r0) {
                case -2100154143: goto L_0x02ae;
                case -1099754412: goto L_0x02b6;
                case -670453360: goto L_0x02c1;
                case -269465212: goto L_0x02c8;
                case 50572276: goto L_0x02d0;
                case 825853265: goto L_0x02d8;
                case 1010548371: goto L_0x02be;
                default: goto L_0x02ad;
            }     // Catch:{ JSONException -> 0x0436 }
        L_0x02ad:
            goto L_0x02e1
        L_0x02ae:
            java.lang.String r0 = "video_about_to_finish"
            boolean r0 = r1.equals(r0)     // Catch:{ JSONException -> 0x0436 }
            r13 = 6
            goto L_0x02df
        L_0x02b6:
            java.lang.String r0 = "stop_typing"
            boolean r0 = r1.equals(r0)     // Catch:{ JSONException -> 0x0436 }
            r13 = 2
            goto L_0x02df
        L_0x02be:
            java.lang.String r0 = "llm_output"
            goto L_0x02c3
        L_0x02c1:
            java.lang.String r0 = "llm_streaming"
        L_0x02c3:
            boolean r0 = r1.equals(r0)     // Catch:{ JSONException -> 0x0436 }
            goto L_0x02df
        L_0x02c8:
            java.lang.String r0 = "llm_finished"
            boolean r0 = r1.equals(r0)     // Catch:{ JSONException -> 0x0436 }
            r13 = 5
            goto L_0x02df
        L_0x02d0:
            java.lang.String r0 = "start_typing"
            boolean r0 = r1.equals(r0)     // Catch:{ JSONException -> 0x0436 }
            r13 = 1
            goto L_0x02df
        L_0x02d8:
            java.lang.String r0 = "send_query"
            boolean r0 = r1.equals(r0)     // Catch:{ JSONException -> 0x0436 }
            r13 = 3
        L_0x02df:
            if (r0 != 0) goto L_0x02e2
        L_0x02e1:
            r13 = 0
        L_0x02e2:
            java.lang.String r0 = "next_state"
            java.lang.String r4 = r5.getString(r0)     // Catch:{ JSONException -> 0x0436 }
            java.lang.String r1 = "transition_policy"
            boolean r0 = r5.has(r1)     // Catch:{ JSONException -> 0x0436 }
            if (r0 == 0) goto L_0x031c
            java.lang.String r3 = A00(r1, r9, r5)     // Catch:{ JSONException -> 0x0436 }
            int r2 = r3.hashCode()     // Catch:{ JSONException -> 0x0436 }
            r0 = -1411068134(0xffffffffabe4cf1a, float:-1.6257857E-12)
            r1 = 0
            if (r2 == r0) goto L_0x031d
            r0 = -212059869(0xfffffffff35c3923, float:-1.7447879E31)
            if (r2 == r0) goto L_0x0312
            r0 = 39319094(0x257f636, float:1.5866364E-37)
            if (r2 != r0) goto L_0x031d
            java.lang.String r0 = "queue_duration_based"
            boolean r0 = r3.equals(r0)     // Catch:{ JSONException -> 0x0436 }
            if (r0 == 0) goto L_0x031d
            r1 = 2
            goto L_0x031d
        L_0x0312:
            java.lang.String r0 = "queue_flush_append"
            boolean r0 = r3.equals(r0)     // Catch:{ JSONException -> 0x0436 }
            if (r0 == 0) goto L_0x031d
            r1 = 1
            goto L_0x031d
        L_0x031c:
            r1 = 0
        L_0x031d:
            java.lang.String r0 = "queue_duration_threshold"
            boolean r2 = r5.has(r0)     // Catch:{ JSONException -> 0x0436 }
            if (r2 == 0) goto L_0x0339
            int r3 = r5.getInt(r0)     // Catch:{ JSONException -> 0x0436 }
        L_0x0329:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r13)     // Catch:{ JSONException -> 0x0436 }
            X.C162457s7.A0H(r4)     // Catch:{ JSONException -> 0x0436 }
            X.7Yd r0 = new X.7Yd     // Catch:{ JSONException -> 0x0436 }
            r0.<init>(r4, r1, r3)     // Catch:{ JSONException -> 0x0436 }
            r7.put(r2, r0)     // Catch:{ JSONException -> 0x0436 }
            goto L_0x033b
        L_0x0339:
            r3 = 0
            goto L_0x0329
        L_0x033b:
            int r6 = r6 + 1
            goto L_0x0299
        L_0x033f:
            X.C162457s7.A0H(r23)     // Catch:{ JSONException -> 0x0436 }
            X.7Yc r2 = new X.7Yc     // Catch:{ JSONException -> 0x0436 }
            r1 = r23
            r0 = r21
            r2.<init>(r1, r0, r7)     // Catch:{ JSONException -> 0x0436 }
            r0 = r25
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x0436 }
            int r8 = r8 + 1
            goto L_0x01e0
        L_0x0354:
            X.C162457s7.A0H(r28)     // Catch:{ JSONException -> 0x0436 }
            X.C162457s7.A0H(r29)     // Catch:{ JSONException -> 0x0436 }
            X.7Zp r3 = new X.7Zp     // Catch:{ JSONException -> 0x0436 }
            r32 = r25
            r26 = r3
            r26.<init>(r27, r28, r29, r30, r31, r32, r33)     // Catch:{ JSONException -> 0x0436 }
            r0 = 1
            r10.A05 = r0     // Catch:{ JSONException -> 0x0436 }
            java.util.Map r0 = r3.A06     // Catch:{ JSONException -> 0x0436 }
            java.util.Collection r0 = r0.values()     // Catch:{ JSONException -> 0x0436 }
            java.util.Iterator r5 = r0.iterator()     // Catch:{ JSONException -> 0x0436 }
        L_0x0370:
            boolean r0 = r5.hasNext()     // Catch:{ JSONException -> 0x0436 }
            if (r0 == 0) goto L_0x03c4
            java.lang.Object r0 = r5.next()     // Catch:{ JSONException -> 0x0436 }
            X.7Yc r0 = (X.C152237Yc) r0     // Catch:{ JSONException -> 0x0436 }
            java.util.Map r0 = r0.A01     // Catch:{ JSONException -> 0x0436 }
            java.util.Collection r0 = r0.values()     // Catch:{ JSONException -> 0x0436 }
            java.util.Iterator r4 = r0.iterator()     // Catch:{ JSONException -> 0x0436 }
        L_0x0386:
            boolean r0 = r4.hasNext()     // Catch:{ JSONException -> 0x0436 }
            if (r0 == 0) goto L_0x0370
            java.lang.Object r0 = r4.next()     // Catch:{ JSONException -> 0x0436 }
            X.7Y2 r0 = (X.AnonymousClass7Y2) r0     // Catch:{ JSONException -> 0x0436 }
            java.util.Map r0 = r0.A01     // Catch:{ JSONException -> 0x0436 }
            java.util.Collection r0 = r0.values()     // Catch:{ JSONException -> 0x0436 }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ JSONException -> 0x0436 }
        L_0x039c:
            boolean r0 = r2.hasNext()     // Catch:{ JSONException -> 0x0436 }
            if (r0 == 0) goto L_0x0386
            java.lang.Object r0 = r2.next()     // Catch:{ JSONException -> 0x0436 }
            X.5S4 r0 = (X.AnonymousClass5S4) r0     // Catch:{ JSONException -> 0x0436 }
            java.util.Map r0 = r0.A01     // Catch:{ JSONException -> 0x0436 }
            java.util.Collection r0 = r0.values()     // Catch:{ JSONException -> 0x0436 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ JSONException -> 0x0436 }
        L_0x03b2:
            boolean r0 = r1.hasNext()     // Catch:{ JSONException -> 0x0436 }
            if (r0 == 0) goto L_0x039c
            java.lang.Object r0 = r1.next()     // Catch:{ JSONException -> 0x0436 }
            X.7Yb r0 = (X.C152227Yb) r0     // Catch:{ JSONException -> 0x0436 }
            java.util.List r0 = r0.A01     // Catch:{ JSONException -> 0x0436 }
            java.util.Collections.shuffle(r0)     // Catch:{ JSONException -> 0x0436 }
            goto L_0x03b2
        L_0x03c4:
            r10.A08 = r3     // Catch:{ JSONException -> 0x0436 }
            X.7Z9 r1 = r3.A01     // Catch:{ JSONException -> 0x0436 }
            r10.A00 = r1     // Catch:{ JSONException -> 0x0436 }
            java.lang.String r0 = r1.A02     // Catch:{ JSONException -> 0x0436 }
            r10.A02 = r0     // Catch:{ JSONException -> 0x0436 }
            java.lang.String r0 = r1.A01     // Catch:{ JSONException -> 0x0436 }
            r10.A01 = r0     // Catch:{ JSONException -> 0x0436 }
            r10.A01()     // Catch:{ JSONException -> 0x0436 }
            X.7Zp r0 = r10.A08     // Catch:{ JSONException -> 0x0436 }
            if (r0 == 0) goto L_0x0411
            java.util.List r4 = r0.A05     // Catch:{ JSONException -> 0x0436 }
            java.util.Map r0 = r0.A06     // Catch:{ JSONException -> 0x0436 }
            java.util.Collection r0 = r0.values()     // Catch:{ JSONException -> 0x0436 }
            X.4C5 r1 = X.C73723fy.A0R(r0)     // Catch:{ JSONException -> 0x0436 }
            X.8Z1 r0 = X.AnonymousClass8Z1.A00     // Catch:{ JSONException -> 0x0436 }
            X.3pX r3 = X.C75043pX.A00     // Catch:{ JSONException -> 0x0436 }
            X.8PM r2 = new X.8PM     // Catch:{ JSONException -> 0x0436 }
            r2.<init>(r0, r3, r1)     // Catch:{ JSONException -> 0x0436 }
            X.8Z2 r0 = X.AnonymousClass8Z2.A00     // Catch:{ JSONException -> 0x0436 }
            X.8PM r1 = new X.8PM     // Catch:{ JSONException -> 0x0436 }
            r1.<init>(r0, r3, r2)     // Catch:{ JSONException -> 0x0436 }
            X.63Z r0 = X.AnonymousClass63Z.A00     // Catch:{ JSONException -> 0x0436 }
            X.8PM r2 = new X.8PM     // Catch:{ JSONException -> 0x0436 }
            r2.<init>(r0, r3, r1)     // Catch:{ JSONException -> 0x0436 }
            X.8Z3 r0 = X.AnonymousClass8Z3.A00     // Catch:{ JSONException -> 0x0436 }
            X.8PM r1 = new X.8PM     // Catch:{ JSONException -> 0x0436 }
            r1.<init>(r0, r3, r2)     // Catch:{ JSONException -> 0x0436 }
            X.8Z4 r0 = X.AnonymousClass8Z4.A00     // Catch:{ JSONException -> 0x0436 }
            X.4C5 r0 = X.C829345m.A04(r0, r1)     // Catch:{ JSONException -> 0x0436 }
            java.util.List r0 = X.C829345m.A01(r0)     // Catch:{ JSONException -> 0x0436 }
            java.util.List r30 = X.C73723fy.A0K(r0, r4)     // Catch:{ JSONException -> 0x0436 }
        L_0x0411:
            java.util.Iterator r6 = r30.iterator()     // Catch:{ JSONException -> 0x0436 }
        L_0x0415:
            boolean r0 = r6.hasNext()     // Catch:{ JSONException -> 0x0436 }
            if (r0 == 0) goto L_0x0a0e
            java.lang.Object r0 = r6.next()     // Catch:{ JSONException -> 0x0436 }
            X.7Zt r0 = (X.AnonymousClass7Zt) r0     // Catch:{ JSONException -> 0x0436 }
            java.util.concurrent.ConcurrentLinkedQueue r5 = r10.A04     // Catch:{ JSONException -> 0x0436 }
            java.lang.String r4 = r0.A06     // Catch:{ JSONException -> 0x0436 }
            java.lang.String r3 = r0.A04     // Catch:{ JSONException -> 0x0436 }
            java.lang.String r2 = r0.A03     // Catch:{ JSONException -> 0x0436 }
            java.lang.String r1 = X.C86604Kt.A0k()     // Catch:{ JSONException -> 0x0436 }
            X.7Lv r0 = new X.7Lv     // Catch:{ JSONException -> 0x0436 }
            r0.<init>(r4, r3, r2, r1)     // Catch:{ JSONException -> 0x0436 }
            r5.add(r0)     // Catch:{ JSONException -> 0x0436 }
            goto L_0x0415
        L_0x0436:
            r1 = move-exception
            java.lang.String r0 = "ClientOrchestrator/setBehaviorGraph unable to set behavior graph, aborting"
            com.whatsapp.util.Log.e(r0, r1)
            java.util.Set r0 = r10.A03
            java.util.Iterator r1 = r0.iterator()
        L_0x0442:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0a0e
            r1.next()
            r12 = 28001(0x6d61, float:3.9238E-41)
            java.lang.String r3 = ""
            r13 = 0
            X.7a1 r2 = new X.7a1
            r5 = r3
            r6 = r3
            r7 = r3
            r8 = r3
            r9 = r3
            r10 = r3
            r11 = r3
            r4 = r3
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            goto L_0x0442
        L_0x045e:
            boolean r1 = X.AnonymousClass001.A1Z(r2)
            java.lang.Object r0 = r5.receiver
            com.whatsapp.calling.lightweightcalling.view.AudioChatBottomSheetDialog r0 = (com.whatsapp.calling.lightweightcalling.view.AudioChatBottomSheetDialog) r0
            r0.A0F = r1
            if (r1 != 0) goto L_0x0a0e
            r0.A1L()
            goto L_0x0a0e
        L_0x046f:
            X.5Ss r2 = (X.C104885Ss) r2
            r0 = 0
            X.C162457s7.A0J(r2, r0)
            java.lang.Object r0 = r5.receiver
            X.4Ql r0 = (X.AnonymousClass4Ql) r0
            X.AnonymousClass4Ql.A01(r0, r2)
            goto L_0x0a0e
        L_0x047e:
            boolean r1 = X.AnonymousClass001.A1Z(r2)
            java.lang.Object r0 = r5.receiver
            X.4PI r0 = (X.AnonymousClass4PI) r0
            r0.setupVoiceChatBanner(r1)
            goto L_0x0a0e
        L_0x048b:
            X.7DQ r2 = (X.AnonymousClass7DQ) r2
            r0 = 0
            X.C162457s7.A0J(r2, r0)
            java.lang.Object r4 = r5.receiver
            com.whatsapp.catalogcategory.view.viewmodel.CatalogAllCategoryViewModel r4 = (com.whatsapp.catalogcategory.view.viewmodel.CatalogAllCategoryViewModel) r4
            boolean r0 = r2 instanceof X.C132936gO
            if (r0 == 0) goto L_0x04da
            X.6gO r2 = (X.C132936gO) r2
            X.2Qq r5 = r2.A00
            X.66R r0 = r4.A08
            X.0Wx r0 = X.AnonymousClass6CA.A0J(r0)
            java.lang.Object r0 = r0.A07()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            if (r0 == 0) goto L_0x04e7
            java.util.Iterator r6 = r0.iterator()
            r11 = 0
        L_0x04b0:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x04e7
            java.lang.Object r1 = r6.next()
            int r3 = r11 + 1
            if (r11 >= 0) goto L_0x04c3
            java.lang.RuntimeException r0 = X.C18280x3.A0X()
            throw r0
        L_0x04c3:
            X.7DQ r1 = (X.AnonymousClass7DQ) r1
            boolean r0 = r1 instanceof X.C132936gO
            if (r0 == 0) goto L_0x04d8
            X.6gO r1 = (X.C132936gO) r1
            X.2Qq r0 = r1.A00
            java.lang.String r1 = r0.A01
            java.lang.String r0 = r5.A01
            boolean r0 = X.C162457s7.A0P(r1, r0)
            if (r0 == 0) goto L_0x04d8
            goto L_0x04e8
        L_0x04d8:
            r11 = r3
            goto L_0x04b0
        L_0x04da:
            boolean r0 = r2 instanceof X.AnonymousClass6gN
            if (r0 == 0) goto L_0x0a0e
            X.6gN r2 = (X.AnonymousClass6gN) r2
            X.2Qq r5 = r2.A00
            com.whatsapp.jid.UserJid r7 = r2.A01
            X.6vh r2 = X.C141516vh.CATALOG_SEARCH_FLOW
            goto L_0x04f7
        L_0x04e7:
            r11 = -1
        L_0x04e8:
            X.5QB r6 = r4.A03
            com.whatsapp.jid.UserJid r7 = r2.A01
            java.lang.String r8 = r5.A01
            r9 = 1
            r10 = 2
            boolean r12 = r5.A04
            r6.A01(r7, r8, r9, r10, r11, r12)
            X.6vh r2 = X.C141516vh.CATALOG_CATEGORY_FLOW
        L_0x04f7:
            r3 = 1
            r0 = 3
            X.C162457s7.A0J(r2, r0)
            boolean r0 = r5.A04
            if (r0 == 0) goto L_0x0516
            java.lang.String r2 = r5.A01
            X.C162457s7.A0C(r2)
            java.lang.String r0 = r5.A02
            X.C162457s7.A0C(r0)
            X.6gc r1 = new X.6gc
            r1.<init>(r7, r2, r0, r3)
        L_0x050f:
            X.4UC r0 = r4.A06
            r0.A0H(r1)
            goto L_0x0a0e
        L_0x0516:
            java.lang.String r0 = r5.A01
            X.C162457s7.A0C(r0)
            X.6gb r1 = new X.6gb
            r1.<init>(r2, r7, r0)
            goto L_0x050f
        L_0x0521:
            X.2zA r2 = (X.C60792zA) r2
            r0 = 0
            X.C162457s7.A0J(r2, r0)
            java.lang.Object r3 = r5.receiver
            X.7Ku r3 = (X.C149067Ku) r3
            boolean r0 = r2.A03
            if (r0 != 0) goto L_0x0a0e
            X.2ze r1 = r2.A00
            if (r1 == 0) goto L_0x0a0e
            X.3Lq r0 = r3.A02
            r0.A0J(r1)
            goto L_0x0a0e
        L_0x053a:
            X.2j2 r2 = (X.C50952j2) r2
            r4 = 0
            X.C162457s7.A0J(r2, r4)
            java.lang.Object r0 = r5.receiver
            X.7Ku r0 = (X.C149067Ku) r0
            X.2qk r3 = r0.A01
            java.lang.String r1 = "participant-attribute-parser"
            java.lang.String r0 = r2.A00
            r3.A0A(r1, r4, r0)
            goto L_0x0a0e
        L_0x054f:
            X.7aq r2 = (X.C153197aq) r2
            r4 = 0
            X.C162457s7.A0J(r2, r4)
            java.lang.Object r3 = r5.receiver
            X.6n8 r3 = (X.C136706n8) r3
            X.7r8 r0 = r3.A02
            if (r0 != 0) goto L_0x0564
            java.lang.String r0 = "newsletterGraphqlUtils"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0564:
            java.lang.String r1 = "xwa2_newsletter_delete_v2"
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NewsletterDeleteResponseImpl$Xwa2NewsletterDeleteV2> r0 = com.whatsapp.infra.graphql.generated.newsletter.NewsletterDeleteResponseImpl.Xwa2NewsletterDeleteV2.class
            X.7aq r0 = r2.A00(r0, r1)
            if (r0 == 0) goto L_0x0596
            org.json.JSONObject r0 = r0.A00
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMutationResponseFragmentImpl r2 = new com.whatsapp.infra.graphql.generated.newsletter.NewsletterMutationResponseFragmentImpl
            r2.<init>(r0)
            java.lang.String r1 = "newsletter_state"
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NewsletterMutationResponseFragmentImpl$NewsletterState> r0 = com.whatsapp.infra.graphql.generated.newsletter.NewsletterMutationResponseFragmentImpl.NewsletterState.class
            X.7aq r2 = r2.A00(r0, r1)
            if (r2 == 0) goto L_0x0596
            java.lang.String r1 = "type"
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterStateType r0 = com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterStateType.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.Enum r1 = r2.A03(r0, r1)
        L_0x0587:
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterStateType r0 = com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterStateType.DELETED
            if (r1 != r0) goto L_0x05a8
            X.2se r1 = r3.A01
            if (r1 != 0) goto L_0x0598
            java.lang.String r0 = "newsletterManager"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0596:
            r1 = 0
            goto L_0x0587
        L_0x0598:
            X.4uY r0 = r3.newsletterJid
            r1.A07(r0)
            X.4DF r1 = r3.callback
            if (r1 == 0) goto L_0x0a0e
            X.4uY r0 = r3.newsletterJid
            r1.BX8(r0)
            goto L_0x0a0e
        L_0x05a8:
            X.4DF r2 = r3.callback
            if (r2 == 0) goto L_0x0a0e
            java.lang.String r1 = "Delete failed"
            X.6nF r0 = new X.6nF
            r0.<init>(r1, r4)
            r2.onError(r0)
            goto L_0x0a0e
        L_0x05b8:
            X.7nS r2 = (X.C160327nS) r2
            r3 = 0
            X.C162457s7.A0J(r2, r3)
            java.lang.Object r0 = r5.receiver
            X.6n8 r0 = (X.C136706n8) r0
            X.4DF r1 = r0.callback
            goto L_0x0862
        L_0x05c6:
            X.7aq r2 = (X.C153197aq) r2
            r0 = 0
            X.C162457s7.A0J(r2, r0)
            java.lang.Object r5 = r5.receiver
            X.6nD r5 = (X.C136756nD) r5
            boolean r0 = r5.isCancelled
            if (r0 != 0) goto L_0x0a0e
            java.lang.String r1 = "xwa2_newsletters_recommended"
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NewsletterRecommendedResponseImpl$Xwa2NewslettersRecommended> r0 = com.whatsapp.infra.graphql.generated.newsletter.NewsletterRecommendedResponseImpl.Xwa2NewslettersRecommended.class
            X.7aq r2 = r2.A00(r0, r1)
            if (r2 == 0) goto L_0x0a0e
            java.lang.String r1 = "result"
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NewsletterRecommendedResponseImpl$Xwa2NewslettersRecommended$Result> r0 = com.whatsapp.infra.graphql.generated.newsletter.NewsletterRecommendedResponseImpl.Xwa2NewslettersRecommended.Result.class
            X.6aY r0 = r2.A02(r0, r1)
            if (r0 == 0) goto L_0x0a0e
            java.util.ArrayList r4 = X.AnonymousClass001.A0s()
            java.util.Iterator r3 = r0.iterator()
        L_0x05f0:
            boolean r0 = r3.hasNext()
            r1 = 0
            if (r0 == 0) goto L_0x0617
            java.lang.Object r0 = r3.next()
            X.7aq r0 = (X.C153197aq) r0
            X.7r8 r2 = r5.A02
            if (r2 != 0) goto L_0x0608
            java.lang.String r0 = "newsletterGraphqlUtils"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0608:
            org.json.JSONObject r1 = r0.A00
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFieldsImpl r0 = new com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFieldsImpl
            r0.<init>(r1)
            X.1RL r0 = r2.A08(r0)
            r4.add(r0)
            goto L_0x05f0
        L_0x0617:
            X.4DH r0 = r5.callback
            if (r0 == 0) goto L_0x0a0e
            r0.BiS(r1, r4)
            goto L_0x0a0e
        L_0x0620:
            X.7aq r2 = (X.C153197aq) r2
            r0 = 0
            X.C162457s7.A0J(r2, r0)
            java.lang.Object r5 = r5.receiver
            X.6nD r5 = (X.C136756nD) r5
            boolean r0 = r5.isCancelled
            if (r0 != 0) goto L_0x0a0e
            java.lang.String r1 = "xwa2_newsletters_search"
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NewsletterSearchResponseImpl$Xwa2NewslettersSearch> r0 = com.whatsapp.infra.graphql.generated.newsletter.NewsletterSearchResponseImpl.Xwa2NewslettersSearch.class
            X.7aq r2 = r2.A00(r0, r1)
            if (r2 == 0) goto L_0x0a0e
            java.lang.String r1 = "result"
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NewsletterSearchResponseImpl$Xwa2NewslettersSearch$Result> r0 = com.whatsapp.infra.graphql.generated.newsletter.NewsletterSearchResponseImpl.Xwa2NewslettersSearch.Result.class
            X.6aY r0 = r2.A02(r0, r1)
            if (r0 == 0) goto L_0x0a0e
            java.util.ArrayList r7 = X.AnonymousClass001.A0s()
            java.util.Iterator r3 = r0.iterator()
        L_0x064a:
            boolean r0 = r3.hasNext()
            r6 = 0
            if (r0 == 0) goto L_0x0671
            java.lang.Object r0 = r3.next()
            X.7aq r0 = (X.C153197aq) r0
            X.7r8 r2 = r5.A02
            if (r2 != 0) goto L_0x0662
            java.lang.String r0 = "newsletterGraphqlUtils"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0662:
            org.json.JSONObject r1 = r0.A00
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFieldsImpl r0 = new com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFieldsImpl
            r0.<init>(r1)
            X.1RL r0 = r2.A08(r0)
            r7.add(r0)
            goto L_0x064a
        L_0x0671:
            java.util.ArrayList r4 = X.AnonymousClass001.A0s()
            java.util.Iterator r3 = r7.iterator()
        L_0x0679:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0699
            java.lang.Object r2 = r3.next()
            r1 = r2
            X.1RL r1 = (X.AnonymousClass1RL) r1
            boolean r0 = r5.filterOutSubscribedChannels
            if (r0 == 0) goto L_0x0695
            X.21q r1 = r1.A07
            X.21q r0 = X.C372821q.GUEST
            boolean r0 = X.AnonymousClass000.A1Y(r1, r0)
            if (r0 != 0) goto L_0x0695
            goto L_0x0679
        L_0x0695:
            r4.add(r2)
            goto L_0x0679
        L_0x0699:
            X.4DH r0 = r5.callback
            if (r0 == 0) goto L_0x0a0e
            r0.BiS(r6, r4)
            goto L_0x0a0e
        L_0x06a2:
            X.7aq r2 = (X.C153197aq) r2
            r6 = 0
            X.C162457s7.A0J(r2, r6)
            java.lang.Object r4 = r5.receiver
            X.6n7 r4 = (X.C136696n7) r4
            boolean r0 = r4.isCancelled
            if (r0 != 0) goto L_0x0a0e
            X.7r8 r0 = r4.A01
            r3 = 0
            if (r0 != 0) goto L_0x06bc
            java.lang.String r0 = "newsletterGraphqlUtils"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x06bc:
            java.lang.String r1 = "xwa2_newsletter_admin_invite_accept"
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NewsletterAcceptAdminInviteResponseImpl$Xwa2NewsletterAdminInviteAccept> r0 = com.whatsapp.infra.graphql.generated.newsletter.NewsletterAcceptAdminInviteResponseImpl.Xwa2NewsletterAdminInviteAccept.class
            X.7aq r0 = r2.A00(r0, r1)
            if (r0 == 0) goto L_0x06cd
            org.json.JSONObject r0 = r0.A00
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMutationResponseFragmentImpl r3 = new com.whatsapp.infra.graphql.generated.newsletter.NewsletterMutationResponseFragmentImpl
            r3.<init>(r0)
        L_0x06cd:
            boolean r0 = X.C162047r8.A05(r3)
            X.4DF r2 = r4.callback
            if (r0 != 0) goto L_0x06e3
            if (r2 == 0) goto L_0x0a0e
            java.lang.String r1 = "Invitation accept failed"
            X.6nF r0 = new X.6nF
            r0.<init>(r1, r6)
            r2.onError(r0)
            goto L_0x0a0e
        L_0x06e3:
            if (r2 == 0) goto L_0x0a0e
            X.4uY r0 = r4.newsletterJid
            r2.BX8(r0)
            goto L_0x0a0e
        L_0x06ec:
            X.7nS r2 = (X.C160327nS) r2
            r3 = 0
            X.C162457s7.A0J(r2, r3)
            java.lang.Object r1 = r5.receiver
            X.6n7 r1 = (X.C136696n7) r1
            boolean r0 = r1.isCancelled
            if (r0 != 0) goto L_0x086b
            X.4DF r1 = r1.callback
            goto L_0x0862
        L_0x06fe:
            X.7aq r2 = (X.C153197aq) r2
            r6 = 0
            X.C162457s7.A0J(r2, r6)
            java.lang.Object r4 = r5.receiver
            X.6n9 r4 = (X.C136716n9) r4
            boolean r0 = r4.isCancelled
            if (r0 != 0) goto L_0x0a0e
            X.7r8 r0 = r4.A01
            r3 = 0
            if (r0 != 0) goto L_0x0718
            java.lang.String r0 = "newsletterGraphqlUtils"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0718:
            java.lang.String r1 = "xwa2_newsletter_admin_demote"
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NewsletterAdminDemoteResponseImpl$Xwa2NewsletterAdminDemote> r0 = com.whatsapp.infra.graphql.generated.newsletter.NewsletterAdminDemoteResponseImpl.Xwa2NewsletterAdminDemote.class
            X.7aq r0 = r2.A00(r0, r1)
            if (r0 == 0) goto L_0x0729
            org.json.JSONObject r0 = r0.A00
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMutationResponseFragmentImpl r3 = new com.whatsapp.infra.graphql.generated.newsletter.NewsletterMutationResponseFragmentImpl
            r3.<init>(r0)
        L_0x0729:
            boolean r0 = X.C162047r8.A05(r3)
            X.4DF r2 = r4.callback
            if (r0 != 0) goto L_0x073f
            if (r2 == 0) goto L_0x0a0e
            java.lang.String r1 = "Demote failed"
            X.6nF r0 = new X.6nF
            r0.<init>(r1, r6)
            r2.onError(r0)
            goto L_0x0a0e
        L_0x073f:
            if (r2 == 0) goto L_0x0a0e
            X.4uY r0 = r4.newsletterJid
            r2.BX8(r0)
            goto L_0x0a0e
        L_0x0748:
            X.7nS r2 = (X.C160327nS) r2
            r3 = 0
            X.C162457s7.A0J(r2, r3)
            java.lang.Object r1 = r5.receiver
            X.6n9 r1 = (X.C136716n9) r1
            boolean r0 = r1.isCancelled
            if (r0 != 0) goto L_0x086b
            X.4DF r1 = r1.callback
            goto L_0x0862
        L_0x075a:
            X.7aq r2 = (X.C153197aq) r2
            r7 = 0
            X.C162457s7.A0J(r2, r7)
            java.lang.Object r4 = r5.receiver
            X.6nA r4 = (X.C136726nA) r4
            boolean r0 = r4.isCancelled
            if (r0 != 0) goto L_0x0a0e
            java.lang.String r8 = "xwa2_newsletter_admin_invite_create"
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NewsletterAdminInviteResponseImpl$Xwa2NewsletterAdminInviteCreate> r6 = com.whatsapp.infra.graphql.generated.newsletter.NewsletterAdminInviteResponseImpl.Xwa2NewsletterAdminInviteCreate.class
            X.7aq r3 = r2.A00(r6, r8)
            r5 = 0
            if (r3 == 0) goto L_0x0785
            java.lang.String r1 = "state"
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NewsletterAdminInviteResponseImpl$Xwa2NewsletterAdminInviteCreate$State> r0 = com.whatsapp.infra.graphql.generated.newsletter.NewsletterAdminInviteResponseImpl.Xwa2NewsletterAdminInviteCreate.State.class
            X.7aq r3 = r3.A00(r0, r1)
            if (r3 == 0) goto L_0x0785
            java.lang.String r1 = "type"
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterStateType r0 = com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterStateType.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.Enum r5 = r3.A03(r0, r1)
        L_0x0785:
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterStateType r0 = com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterStateType.ACTIVE
            if (r5 == r0) goto L_0x07a4
            X.642 r2 = r4.callback
            if (r2 == 0) goto L_0x0a0e
            java.lang.String r1 = "Channel is not active"
            X.6nF r0 = new X.6nF
            r0.<init>(r1, r7)
        L_0x0794:
            X.5o0 r2 = (X.C115035o0) r2
            X.4GQ r4 = r2.A01
            com.whatsapp.jid.UserJid r0 = r2.A00
            X.4x6 r1 = new X.4x6
            r1.<init>(r0)
        L_0x079f:
            r4.invoke(r1)
            goto L_0x0a0e
        L_0x07a4:
            X.7aq r0 = r2.A00(r6, r8)
            if (r0 == 0) goto L_0x07d8
            org.json.JSONObject r1 = r0.A00
            java.lang.String r0 = "invite_expiration_time"
            java.lang.String r0 = r1.optString(r0)
            if (r0 == 0) goto L_0x07d8
            java.lang.Long r0 = X.C829745q.A07(r0)
            if (r0 == 0) goto L_0x07d8
            long r2 = r0.longValue()
            r0 = 1000(0x3e8, float:1.401E-42)
            long r0 = (long) r0
            long r2 = r2 * r0
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            if (r0 == 0) goto L_0x07d8
            X.642 r0 = r4.callback
            if (r0 == 0) goto L_0x0a0e
            X.5o0 r0 = (X.C115035o0) r0
            X.4GQ r4 = r0.A01
            com.whatsapp.jid.UserJid r0 = r0.A00
            X.4x7 r1 = new X.4x7
            r1.<init>(r0, r2)
            goto L_0x079f
        L_0x07d8:
            X.642 r2 = r4.callback
            if (r2 == 0) goto L_0x0a0e
            java.lang.String r1 = "Expiration timestamp is null"
            X.6nG r0 = new X.6nG
            r0.<init>(r1)
            goto L_0x0794
        L_0x07e4:
            X.7nS r2 = (X.C160327nS) r2
            r3 = 0
            X.C162457s7.A0J(r2, r3)
            java.lang.Object r1 = r5.receiver
            X.6nA r1 = (X.C136726nA) r1
            boolean r0 = r1.isCancelled
            if (r0 != 0) goto L_0x086b
            X.642 r0 = r1.callback
            if (r0 == 0) goto L_0x086b
            X.C1452274r.A00(r2)
            X.5o0 r0 = (X.C115035o0) r0
            X.4GQ r2 = r0.A01
            com.whatsapp.jid.UserJid r1 = r0.A00
            X.4x6 r0 = new X.4x6
            r0.<init>(r1)
            r2.invoke(r0)
            goto L_0x086b
        L_0x0808:
            X.7aq r2 = (X.C153197aq) r2
            r6 = 0
            X.C162457s7.A0J(r2, r6)
            java.lang.Object r4 = r5.receiver
            X.6nB r4 = (X.C136736nB) r4
            boolean r0 = r4.isCancelled
            if (r0 != 0) goto L_0x0a0e
            X.7r8 r0 = r4.A01
            r3 = 0
            if (r0 != 0) goto L_0x0822
            java.lang.String r0 = "newsletterGraphqlUtils"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0822:
            java.lang.String r1 = "xwa2_newsletter_admin_invite_revoke"
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NewsletterAdminInviteRevokeResponseImpl$Xwa2NewsletterAdminInviteRevoke> r0 = com.whatsapp.infra.graphql.generated.newsletter.NewsletterAdminInviteRevokeResponseImpl.Xwa2NewsletterAdminInviteRevoke.class
            X.7aq r0 = r2.A00(r0, r1)
            if (r0 == 0) goto L_0x0833
            org.json.JSONObject r0 = r0.A00
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMutationResponseFragmentImpl r3 = new com.whatsapp.infra.graphql.generated.newsletter.NewsletterMutationResponseFragmentImpl
            r3.<init>(r0)
        L_0x0833:
            boolean r0 = X.C162047r8.A05(r3)
            X.4DF r2 = r4.callback
            if (r0 != 0) goto L_0x0849
            if (r2 == 0) goto L_0x0a0e
            java.lang.String r1 = "Revoking failed"
            X.6nF r0 = new X.6nF
            r0.<init>(r1, r6)
            r2.onError(r0)
            goto L_0x0a0e
        L_0x0849:
            if (r2 == 0) goto L_0x0a0e
            X.4uY r0 = r4.newsletterJid
            r2.BX8(r0)
            goto L_0x0a0e
        L_0x0852:
            X.7nS r2 = (X.C160327nS) r2
            r3 = 0
            X.C162457s7.A0J(r2, r3)
            java.lang.Object r1 = r5.receiver
            X.6nB r1 = (X.C136736nB) r1
            boolean r0 = r1.isCancelled
            if (r0 != 0) goto L_0x086b
            X.4DF r1 = r1.callback
        L_0x0862:
            if (r1 == 0) goto L_0x086b
            X.8SE r0 = X.C1452274r.A00(r2)
            r1.onError(r0)
        L_0x086b:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            return r0
        L_0x0870:
            X.7aq r2 = (X.C153197aq) r2
            r3 = 0
            X.C162457s7.A0J(r2, r3)
            java.lang.Object r4 = r5.receiver
            X.6nC r4 = (X.C136746nC) r4
            java.lang.String r1 = "xwa2_newsletters_directory_list"
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NewsletterDirectoryListResponseImpl$Xwa2NewslettersDirectoryList> r0 = com.whatsapp.infra.graphql.generated.newsletter.NewsletterDirectoryListResponseImpl.Xwa2NewslettersDirectoryList.class
            X.7aq r0 = r2.A00(r0, r1)
            if (r0 != 0) goto L_0x08b6
            X.8rv r2 = r4.callback
            if (r2 == 0) goto L_0x0a0e
            r1 = 0
            X.6nF r0 = new X.6nF
            r0.<init>(r1, r3)
            r2.BS5(r0)
            goto L_0x0a0e
        L_0x0893:
            X.7aq r2 = (X.C153197aq) r2
            r3 = 0
            X.C162457s7.A0J(r2, r3)
            java.lang.Object r4 = r5.receiver
            X.6nC r4 = (X.C136746nC) r4
            java.lang.String r1 = "xwa2_newsletters_directory_search"
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NewsletterDirectorySearchResponseImpl$Xwa2NewslettersDirectorySearch> r0 = com.whatsapp.infra.graphql.generated.newsletter.NewsletterDirectorySearchResponseImpl.Xwa2NewslettersDirectorySearch.class
            X.7aq r0 = r2.A00(r0, r1)
            if (r0 != 0) goto L_0x08b6
            X.8rv r2 = r4.callback
            if (r2 == 0) goto L_0x0a0e
            r1 = 0
            X.6nF r0 = new X.6nF
            r0.<init>(r1, r3)
            r2.BS5(r0)
            goto L_0x0a0e
        L_0x08b6:
            org.json.JSONObject r1 = r0.A00
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterDirectoryResponseFragmentImpl r0 = new com.whatsapp.infra.graphql.generated.newsletter.NewsletterDirectoryResponseFragmentImpl
            r0.<init>(r1)
            r4.A08(r0)
            goto L_0x0a0e
        L_0x08c2:
            X.7au r2 = (X.C153237au) r2
            r10 = 0
            X.C162457s7.A0J(r2, r10)
            java.lang.Object r11 = r5.receiver
            X.7Wt r11 = (X.C151907Wt) r11
            X.7au r9 = r11.A02
            r11.A02 = r2
            android.view.View r8 = r11.A01()
            boolean r7 = r2.A01()
            r6 = 0
            r5 = 1
            if (r7 == 0) goto L_0x0965
            if (r8 == 0) goto L_0x0965
            r0 = 2131434784(0x7f0b1d20, float:1.8491392E38)
            android.widget.TextView r12 = X.C18280x3.A0F(r8, r0)
            r0 = 2131432767(0x7f0b153f, float:1.84873E38)
            android.view.View r4 = X.C18290x4.A0M(r8, r0)
            X.6wc r1 = r2.A00()
            X.6wc r0 = X.C142086wc.PUSH_TO_VIDEO_NUX
            if (r1 != r0) goto L_0x0a7b
            X.6wD r3 = X.C141836wD.NUX_ANIMATION
            r1 = 2131892804(0x7f121a44, float:1.9420367E38)
        L_0x08f9:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            int r0 = r0.intValue()
            r12.setText(r0)
            com.whatsapp.pushtorecordmedia.PushToRecordIconAnimation r12 = r11.A01
            if (r12 != 0) goto L_0x0933
            X.6wD r0 = X.C141836wD.ICON_ANIMATION
            if (r3 != r0) goto L_0x0a78
            r0 = 2131432769(0x7f0b1541, float:1.8487305E38)
            android.view.View r0 = r8.findViewById(r0)
            android.view.ViewStub r0 = (android.view.ViewStub) r0
            android.view.View r12 = r0.inflate()
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.pushtorecordmedia.PushToRecordIconAnimation"
            X.C162457s7.A0K(r12, r0)
            com.whatsapp.pushtorecordmedia.PushToRecordIconAnimation r12 = (com.whatsapp.pushtorecordmedia.PushToRecordIconAnimation) r12
            X.7Zj r0 = r2.A00
            boolean r1 = r0.A03
            X.8tn r0 = r12.A00
            if (r0 != 0) goto L_0x0ac7
            if (r1 == 0) goto L_0x0a71
            X.8JN r0 = new X.8JN
            r0.<init>(r12)
        L_0x092f:
            r12.A00 = r0
            r11.A01 = r12
        L_0x0933:
            r1 = 8
            if (r12 == 0) goto L_0x095d
            X.6wD r13 = X.C141836wD.ICON_ANIMATION
            r0 = 8
            if (r3 != r13) goto L_0x093e
            r0 = 0
        L_0x093e:
            r12.setVisibility(r0)
            if (r3 != r13) goto L_0x095d
            android.content.Context r13 = r12.getContext()
            r0 = 2131102240(0x7f060a20, float:1.7816912E38)
            int r0 = X.AnonymousClass0Y8.A04(r13, r0)
            r12.setTint(r0)
            X.7Zj r0 = r2.A00
            int r13 = r0.A00
            if (r13 == 0) goto L_0x0a6e
            if (r13 != r5) goto L_0x0abc
            r0 = 2
        L_0x095a:
            r12.Bgt(r0)
        L_0x095d:
            X.6wD r0 = X.C141836wD.NUX_ANIMATION
            if (r3 != r0) goto L_0x0962
            r1 = 0
        L_0x0962:
            r4.setVisibility(r1)
        L_0x0965:
            if (r9 == 0) goto L_0x096e
            boolean r0 = r9.A01()
            r1 = 1
            if (r0 == r5) goto L_0x0972
        L_0x096e:
            r1 = 0
            r0 = 1
            if (r7 != 0) goto L_0x0973
        L_0x0972:
            r0 = 0
        L_0x0973:
            if (r9 == 0) goto L_0x0979
            X.6wc r6 = r9.A00()
        L_0x0979:
            X.6wc r4 = r2.A00()
            if (r6 != r4) goto L_0x0980
            r5 = 0
        L_0x0980:
            if (r8 == 0) goto L_0x09e3
            if (r0 != 0) goto L_0x0986
            if (r5 == 0) goto L_0x09e3
        L_0x0986:
            android.view.View r5 = r11.A01()
            if (r5 == 0) goto L_0x09e3
            if (r4 == 0) goto L_0x09e3
            android.content.res.Resources r0 = X.C18290x4.A0G(r5)
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.screenLayout
            r3 = r0 & 15
            r6 = 1
            r0 = 3
            boolean r9 = X.AnonymousClass000.A1U(r3, r6)
            int r3 = r4.ordinal()
            if (r3 == r0) goto L_0x0a30
            r0 = 4
            if (r3 == r0) goto L_0x0a11
            r0 = 0
            android.graphics.PointF r6 = new android.graphics.PointF
            r6.<init>(r0, r0)
        L_0x09af:
            r12 = 2131233756(0x7f080bdc, float:1.8083658E38)
            if (r9 == 0) goto L_0x09b7
            r12 = 2131233758(0x7f080bde, float:1.8083663E38)
        L_0x09b7:
            int r0 = r11.A00
            if (r12 == r0) goto L_0x09d9
            r11.A00 = r12
            X.5UY r0 = r11.A03
            android.view.View r9 = r0.A04()
            X.C162457s7.A0D(r9)
            X.33j r4 = r11.A04
            android.content.res.Resources r3 = X.C18290x4.A0G(r9)
            r0 = 0
            android.graphics.drawable.Drawable r3 = X.C02680He.A00(r0, r3, r12)
            X.6dx r0 = new X.6dx
            r0.<init>(r3, r4)
            r9.setBackground(r0)
        L_0x09d9:
            float r0 = r6.x
            r5.setTranslationX(r0)
            float r0 = r6.y
            r5.setTranslationY(r0)
        L_0x09e3:
            if (r1 == r7) goto L_0x0a0e
            if (r8 == 0) goto L_0x0a0e
            r8.setVisibility(r10)
            r8.clearAnimation()
            android.view.ViewPropertyAnimator r3 = r8.animate()
            r0 = 320(0x140, double:1.58E-321)
            android.view.ViewPropertyAnimator r1 = r3.setDuration(r0)
            r0 = 0
            if (r7 == 0) goto L_0x09fc
            r0 = 1065353216(0x3f800000, float:1.0)
        L_0x09fc:
            android.view.ViewPropertyAnimator r3 = r1.alpha(r0)
            r1 = 35
            X.3a0 r0 = new X.3a0
            r0.<init>(r2, r1, r8)
            android.view.ViewPropertyAnimator r0 = r3.withEndAction(r0)
            r0.start()
        L_0x0a0e:
            X.2wD r0 = X.C59022wD.A00
            return r0
        L_0x0a11:
            X.33j r0 = r11.A04
            boolean r0 = r0.A0T()
            if (r0 != 0) goto L_0x0a1a
            r6 = -1
        L_0x0a1a:
            float r3 = (float) r6
            r0 = 2131167937(0x7f070ac1, float:1.7950162E38)
            float r0 = r11.A00(r0)
            float r3 = r3 * r0
            r0 = 2131167938(0x7f070ac2, float:1.7950164E38)
            float r0 = r11.A00(r0)
            android.graphics.PointF r6 = new android.graphics.PointF
            r6.<init>(r3, r0)
            goto L_0x09af
        L_0x0a30:
            X.33j r0 = r11.A04
            boolean r0 = r0.A0T()
            if (r0 != 0) goto L_0x0a39
            r6 = -1
        L_0x0a39:
            r0 = 2131168602(0x7f070d5a, float:1.795151E38)
            float r4 = r11.A00(r0)
            float r3 = (float) r6
            if (r9 == 0) goto L_0x0a5a
            r0 = 2131168598(0x7f070d56, float:1.7951502E38)
            float r0 = r11.A00(r0)
            float r3 = r3 * r0
            r0 = 2131168599(0x7f070d57, float:1.7951504E38)
        L_0x0a4e:
            float r0 = r11.A00(r0)
            float r4 = r4 - r0
            android.graphics.PointF r6 = new android.graphics.PointF
            r6.<init>(r3, r4)
            goto L_0x09af
        L_0x0a5a:
            r0 = 2131168597(0x7f070d55, float:1.79515E38)
            float r0 = r11.A00(r0)
            float r3 = r3 * r0
            r0 = 2131165447(0x7f070107, float:1.7945111E38)
            float r0 = r11.A00(r0)
            float r4 = r4 - r0
            r0 = 2131168596(0x7f070d54, float:1.7951498E38)
            goto L_0x0a4e
        L_0x0a6e:
            r0 = 1
            goto L_0x095a
        L_0x0a71:
            X.5oY r0 = new X.5oY
            r0.<init>(r12)
            goto L_0x092f
        L_0x0a78:
            r12 = r6
            goto L_0x0933
        L_0x0a7b:
            X.6wc r0 = X.C142086wc.PUSH_TO_VIDEO_CAMERA_ENTRY_POINT_NUX
            if (r1 != r0) goto L_0x0a86
            X.6wD r3 = X.C141836wD.NONE
            r1 = 2131892803(0x7f121a43, float:1.9420365E38)
            goto L_0x08f9
        L_0x0a86:
            X.6wc r0 = X.C142086wc.LOCK_INSTRUCTION
            if (r1 != r0) goto L_0x0a91
            X.6wD r3 = X.C141836wD.NONE
            r1 = 2131895213(0x7f1223ad, float:1.9425253E38)
            goto L_0x08f9
        L_0x0a91:
            X.7Zj r3 = r2.A00
            boolean r0 = r3.A02
            if (r0 != 0) goto L_0x0a9e
            X.6wD r3 = X.C141836wD.NONE
            r1 = 2131895216(0x7f1223b0, float:1.9425259E38)
            goto L_0x08f9
        L_0x0a9e:
            boolean r1 = r3.A04
            int r0 = r3.A00
            if (r1 == 0) goto L_0x0ab0
            X.6wD r3 = X.C141836wD.ICON_ANIMATION
            r1 = 2131892808(0x7f121a48, float:1.9420375E38)
            if (r0 != r5) goto L_0x08f9
            r1 = 2131892806(0x7f121a46, float:1.942037E38)
            goto L_0x08f9
        L_0x0ab0:
            X.6wD r3 = X.C141836wD.NONE
            r1 = 2131892807(0x7f121a47, float:1.9420373E38)
            if (r0 != r5) goto L_0x08f9
            r1 = 2131892805(0x7f121a45, float:1.9420369E38)
            goto L_0x08f9
        L_0x0abc:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Invalid recorderMode: "
            java.lang.IllegalStateException r0 = X.C86604Kt.A0h(r0, r1, r13)
            throw r0
        L_0x0ac7:
            java.lang.String r0 = "PushToRecordIconAnimation already initialized"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass746.invoke(java.lang.Object):java.lang.Object");
    }

    public static String A00(String str, Locale locale, JSONObject jSONObject) {
        String string = jSONObject.getString(str);
        C162457s7.A0D(string);
        String lowerCase = string.toLowerCase(locale);
        C162457s7.A0D(lowerCase);
        return lowerCase;
    }
}
