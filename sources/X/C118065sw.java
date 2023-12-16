package X;

import android.app.Application;
import com.whatsapp.authgraphql.ui.CommonViewModel;
import com.whatsapp.avatar.home.AvatarHomeViewModel;
import com.whatsapp.avatar.profilephoto.AvatarProfilePhotoViewModel;
import com.whatsapp.backup.encryptedbackup.EncBackupViewModel;
import com.whatsapp.backup.google.viewmodel.GoogleDriveNewUserSetupViewModel;
import com.whatsapp.backup.google.viewmodel.RestoreFromBackupViewModel;
import com.whatsapp.backup.google.viewmodel.SettingsGoogleDriveViewModel;
import com.whatsapp.biz.catalog.view.variants.VariantsCarouselFragmentViewModel;
import com.whatsapp.biz.catalog.viewmodel.ShareProductViewModel;
import com.whatsapp.biz.compliance.viewmodel.BusinessComplianceViewModel;
import com.whatsapp.biz.order.viewmodel.OrderInfoViewModel;
import com.whatsapp.biz.product.viewmodel.ComplianceInfoViewModel;
import com.whatsapp.biz.product.viewmodel.ProductBottomSheetViewModel;
import com.whatsapp.blockbusiness.blockreasonlist.BlockReasonListViewModel;
import com.whatsapp.bonsai.BonsaiConversationTitleViewModel;
import com.whatsapp.bonsai.BonsaiSystemMessageBottomSheetViewModel;
import com.whatsapp.bonsai.chatinfo.BotChatInfoViewModel;
import com.whatsapp.bonsai.discovery.BonsaiDiscoveryViewModel;
import com.whatsapp.bonsai.embodiment.BotEmbodimentViewModel;
import com.whatsapp.bonsai.prompts.BonsaiPromptsViewModel;
import com.whatsapp.bridge.wfal.WfalManager;
import com.whatsapp.businessapisearch.viewmodel.BusinessApiSearchActivityViewModel;
import com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryActivityViewModel;
import com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryConsumerHomeViewModel;
import com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryContextualSearchViewModel;
import com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryEducationNuxViewModel;
import com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryFrequentContactedViewModel;
import com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryPopularApiBusinessesViewModel;
import com.whatsapp.businessdirectory.viewmodel.LocationOptionPickerViewModel;
import com.whatsapp.calling.avatar.CallAvatarARClassManager;
import com.whatsapp.calling.avatar.CallAvatarFLMConsentManager;
import com.whatsapp.calling.avatar.camera.InitializeAvatarEffectUseCase;
import com.whatsapp.calling.avatar.data.FetchAvatarEffectUseCase;
import com.whatsapp.calling.avatar.viewmodel.CallAvatarViewModel;
import com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel;
import com.whatsapp.calling.callgrid.viewmodel.InCallBannerViewModel;
import com.whatsapp.calling.callgrid.viewmodel.MenuBottomSheetViewModel;
import com.whatsapp.calling.callgrid.viewmodel.OrientationViewModel;
import com.whatsapp.calling.callgrid.viewmodel.VoiceChatGridViewModel;
import com.whatsapp.calling.callheader.viewmodel.CallHeaderViewModel;
import com.whatsapp.calling.callhistory.group.GroupCallParticipantSuggestionsViewModel;
import com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentV2ViewModel;
import com.whatsapp.calling.calllink.viewmodel.CallLinkViewModel;
import com.whatsapp.calling.callrating.viewmodel.CallRatingViewModel;
import com.whatsapp.calling.callscreen.viewmodel.CallScreenViewModel;
import com.whatsapp.calling.chatmessages.AdhocParticipantBottomSheetViewModel;
import com.whatsapp.calling.chatmessages.CallLogMessageParticipantBottomSheetViewModel;
import com.whatsapp.calling.controls.viewmodel.BottomSheetViewModel;
import com.whatsapp.calling.controls.viewmodel.CallControlButtonsViewModel;
import com.whatsapp.calling.controls.viewmodel.ParticipantsListViewModel;
import com.whatsapp.calling.lightweightcalling.viewmodel.AudioChatBottomSheetViewModel;
import com.whatsapp.calling.lightweightcalling.viewmodel.AudioChatCallingViewModel;
import com.whatsapp.calling.psa.viewmodel.GroupCallPsaViewModel;
import com.whatsapp.calling.schedulecall.upcomingcalls.viewmodel.UpcomingActivityViewModel;
import com.whatsapp.calling.screenshare.ScreenShareViewModel;
import com.whatsapp.catalogcategory.view.viewmodel.CatalogAllCategoryViewModel;
import com.whatsapp.catalogcategory.view.viewmodel.CatalogCategoryGroupsViewModel;
import com.whatsapp.catalogcategory.view.viewmodel.CatalogCategoryTabsViewModel;
import com.whatsapp.catalogsearch.view.viewmodel.CatalogSearchViewModel;
import com.whatsapp.chatinfo.SharePhoneNumberViewModel;
import com.whatsapp.chatlock.ChatLockAuthViewModel;
import com.whatsapp.community.ConversationCommunityViewModel;
import com.whatsapp.community.communityInfo.CAGInfoViewModel;
import com.whatsapp.community.communityInfo.viewModels.CAGInfoChatLockViewModel;
import com.whatsapp.community.communitysettings.viewmodel.CommunitySettingsViewModel;
import com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManager;
import com.whatsapp.companiondevice.LinkedDeviceEditDeviceViewModel;
import com.whatsapp.companiondevice.LinkedDeviceEnterNicknameViewModel;
import com.whatsapp.companiondevice.LinkedDevicesSharedViewModel;
import com.whatsapp.companiondevice.LinkedDevicesViewModel;
import com.whatsapp.companionmode.registration.CompanionRegistrationViewModel;
import com.whatsapp.contact.picker.viewmodels.CallSuggestionsViewModel;
import com.whatsapp.contact.picker.viewmodels.InviteNonWhatsAppContactPickerViewModel;
import com.whatsapp.conversation.conversationrow.MessageSelectionViewModel;
import com.whatsapp.conversation.conversationrow.message.MessageDetailsViewModel;
import com.whatsapp.conversation.conversationrow.messagerating.MessageRatingViewModel;
import com.whatsapp.conversation.conversationrow.viewmodel.SharePhoneNumberRowViewModel;
import com.whatsapp.conversation.selection.SelectedImageAlbumViewModel;
import com.whatsapp.conversation.viewmodel.ConversationSearchViewModel;
import com.whatsapp.conversation.viewmodel.ConversationTitleViewModel;
import com.whatsapp.conversation.viewmodel.SurveyViewModel;
import com.whatsapp.conversationslist.ArchiveHeaderViewModel;
import com.whatsapp.conversationslist.InteropViewModel;
import com.whatsapp.countries.CountryListViewModel;
import com.whatsapp.countrygating.viewmodel.CountryGatingViewModel;
import com.whatsapp.datasharingdisclosure.ui.ConsumerDisclosureViewModel;
import com.whatsapp.emoji.search.EmojiSearchProvider;
import com.whatsapp.expressionstray.ExpressionsSearchViewModel;
import com.whatsapp.expressionstray.avatars.AvatarExpressionsViewModel;
import com.whatsapp.expressionstray.conversation.ExpressionsKeyboardViewModel;
import com.whatsapp.expressionstray.emoji.EmojiExpressionsViewModel;
import com.whatsapp.expressionstray.gifs.GifExpressionsSearchViewModel;
import com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel;
import com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel;
import com.whatsapp.extensions.bloks.viewmodel.WaExtensionsNavBarViewModel;
import com.whatsapp.extensions.bloks.viewmodel.WaFlowsViewModel;
import com.whatsapp.extensions.phoenix.viewmodel.ExtensionsFooterViewModel;
import com.whatsapp.extensions.webview.bridge.FlowsWebViewDataRepository;
import com.whatsapp.group.HistorySettingViewModel;
import com.whatsapp.home.HomeViewModel;
import com.whatsapp.inappbugreporting.InAppBugReportingViewModel;
import com.whatsapp.inappbugreporting.network.ReportBugProtocolHelper;
import com.whatsapp.inappsupport.ui.ContactUsWithAiViewModel;
import com.whatsapp.inappsupport.ui.SupportBkLayoutViewModel;
import com.whatsapp.migration.android.view.GoogleMigrateImporterViewModel;
import com.whatsapp.migration.export.ui.ExportMigrationViewModel;
import com.whatsapp.migration.transfer.ui.ChatTransferViewModel;
import com.whatsapp.mute.ui.MuteDialogViewModel;
import com.whatsapp.payments.ui.international.IndiaUpiInternationalActivationViewModel;
import com.whatsapp.payments.ui.international.IndiaUpiInternationalValidateQrViewModel;
import com.whatsapp.payments.ui.mapper.register.IndiaUpiMapperLinkViewModel;
import com.whatsapp.payments.ui.viewmodel.BrazilAddPixKeyViewModel;
import com.whatsapp.payments.ui.viewmodel.BrazilAddPixSelectionViewModel;
import com.whatsapp.payments.ui.viewmodel.BrazilIncomeCollectionViewModel;
import com.whatsapp.payments.ui.viewmodel.BrazilPixKeySettingViewModel;
import com.whatsapp.payments.ui.viewmodel.IndiaPaymentSettingsViewModel;
import com.whatsapp.payments.ui.viewmodel.IndiaUpiMandateHistoryViewModel;
import com.whatsapp.payments.ui.viewmodel.IndiaUpiNumberSettingsViewModel;
import com.whatsapp.payments.ui.viewmodel.IndiaUpiPauseMandateViewModel;
import com.whatsapp.payments.ui.viewmodel.IndiaUpiPaymentTransactionConfirmationBottomSheetViewModel;
import com.whatsapp.payments.ui.viewmodel.PaymentIncentiveViewModel;
import com.whatsapp.payments.ui.viewmodel.PaymentMerchantAccountViewModel;
import com.whatsapp.payments.viewmodel.IndiaUpiSecureQrCodeViewModel;
import com.whatsapp.pininchat.banner.PinInChatBannerViewModel;
import com.whatsapp.pnh.RequestPhoneNumberViewModel;
import com.whatsapp.polls.PollCreatorViewModel;
import com.whatsapp.polls.PollResultsViewModel;
import com.whatsapp.privacy.disclosure.ui.PrivacyDisclosureContainerViewModel;
import com.whatsapp.product.integrityappeals.NewsletterRequestReviewViewModel;
import com.whatsapp.product.newsletterenforcements.enforcedmessages.EnforcedMessagesViewModel;
import com.whatsapp.product.newsletterenforcements.geosuspend.NewsletterGeosuspensionInfoViewModel;
import com.whatsapp.product.newsletterenforcements.suspension.NewsletterSuspensionInfoViewModel;
import com.whatsapp.product.newsletterenforcements.userreports.NewsletterUserReportsViewModel;
import com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickers;
import com.whatsapp.profile.UsernameViewModel;
import com.whatsapp.qrcode.AgentDeviceLoginViewModel;
import com.whatsapp.quickactionbar.viewmodel.QuickActionBarViewModel;
import com.whatsapp.reactions.ReactionsTrayViewModel;
import com.whatsapp.registration.accountdefence.NewDeviceConfirmationRegistrationViewModel;
import com.whatsapp.registration.passkeys.PasskeyServerApiImpl;
import com.whatsapp.registration.report.BanReportViewModel;
import com.whatsapp.report.BusinessActivityReportViewModel;
import com.whatsapp.settings.SettingsAccountViewModel;
import com.whatsapp.settings.SettingsChatViewModel;
import com.whatsapp.settings.SettingsDataUsageViewModel;
import com.whatsapp.settings.SettingsPasskeysViewModel;
import com.whatsapp.settings.SettingsPrivacyCameraEffectsViewModel;
import com.whatsapp.settings.SettingsSetupUserProxyViewModel;
import com.whatsapp.settings.SettingsUserProxyViewModel;
import com.whatsapp.shops.ShopsBkLayoutViewModel;
import com.whatsapp.shops.ShopsProductPreviewFragmentViewModel;
import com.whatsapp.status.advertise.AdvertiseViewModel;
import com.whatsapp.status.advertise.CtwaStatusUpsellBottomSheetTriggerViewModel;
import com.whatsapp.status.advertise.UpdatesAdvertiseViewModel;
import com.whatsapp.status.archive.StatusArchiveSettingsViewModel;
import com.whatsapp.status.crossposting.CrossPostingUpdatesViewModel;
import com.whatsapp.stickers.WebpUtils;
import com.whatsapp.tosgating.viewmodel.ToSGatingViewModel;
import com.whatsapp.userban.ui.viewmodel.BanAppealViewModel;
import com.whatsapp.voipcalling.camera.VoipCameraManager;
import com.whatsapp.wabloks.base.GenericBkLayoutViewModel;
import com.whatsapp.wabloks.base.GenericBkLayoutViewModelWithReload;
import com.whatsapp.wabloks.commerce.ui.viewmodel.WaBkExtensionsLayoutViewModel;
import com.whatsapp.wabloks.ui.bottomsheet.BloksCDSBottomSheetViewModel;
import com.whatsapp.waffle.wfac.ui.WfacBanViewModel;
import org.wawebrtc.MediaCodecVideoEncoder;

/* renamed from: X.5sw  reason: invalid class name and case insensitive filesystem */
public final class C118065sw implements AnonymousClass4C1 {
    public final int A00;
    public final C88844at A01;
    public final C64333Db A02;
    public final C88874aw A03;

    public static GoogleDriveNewUserSetupViewModel A01(C06260Ww r1, C56612sH r2, AnonymousClass33p r3) {
        return new GoogleDriveNewUserSetupViewModel(r1, r2, r3);
    }

    public static SettingsGoogleDriveViewModel A02(C69263Wi r1, AnonymousClass0WN r2, AnonymousClass0WF r3, C10240hc r4, C06260Ww r5, AnonymousClass0QJ r6, C10230hb r7, C29441ip r8, AnonymousClass33p r9, C625835r r10, AnonymousClass4FS r11) {
        return new SettingsGoogleDriveViewModel(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11);
    }

    public static ConversationCommunityViewModel A03(C56942so r1, C56892sj r2, C66493Lq r3, AnonymousClass4FS r4) {
        return new ConversationCommunityViewModel(r1, r2, r3, r4);
    }

    public static NewDeviceConfirmationRegistrationViewModel A04(C116985rC r1, C56612sH r2, C54292oU r3, AnonymousClass33T r4, AnonymousClass33p r5, C28861ht r6, C50152hi r7, AnonymousClass317 r8, C51072jE r9, C55092pm r10, C50232hq r11, C56502s5 r12, AnonymousClass4FS r13) {
        return new NewDeviceConfirmationRegistrationViewModel(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13);
    }

    public static SettingsDataUsageViewModel A05(C69263Wi r1, AnonymousClass49P r2, AnonymousClass310 r3, AnonymousClass1VX r4, AnonymousClass3Ci r5, AnonymousClass4FS r6) {
        return new SettingsDataUsageViewModel(r1, r2, r3, r4, r5, r6);
    }

    public static ShopsBkLayoutViewModel A06(C29441ip r1, C183538qC r2) {
        return new ShopsBkLayoutViewModel(r1, r2);
    }

    public static GenericBkLayoutViewModel A07(C29441ip r1, C183538qC r2) {
        return new GenericBkLayoutViewModel(r1, r2);
    }

    public Object get() {
        int i = this.A00 / 100;
        if (i == 0) {
            return A08();
        }
        if (i == 1) {
            return A09();
        }
        throw new AssertionError(this.A00);
    }

    public C118065sw(C88844at r1, C64333Db r2, C88874aw r3, int i) {
        this.A02 = r2;
        this.A01 = r1;
        this.A03 = r3;
        this.A00 = i;
    }

    public final Object A08() {
        switch (this.A00) {
            case 0:
                C56122rS r10 = (C56122rS) this.A02.A4F.get();
                C73853gB A002 = C69713Yc.A00();
                C64773Ex r7 = (C64773Ex) this.A02.A6O.get();
                AnonymousClass5ZU r8 = (AnonymousClass5ZU) this.A02.AaA.get();
                C56972sr r4 = (C56972sr) this.A02.AJW.get();
                C1230066r r5 = (C1230066r) this.A02.A4Q.get();
                AnonymousClass5Z0 A0q = this.A02.A00.AJu();
                C54292oU r9 = (C54292oU) this.A02.AaB.get();
                return new AdhocParticipantBottomSheetViewModel(this.A03.A3E, r4, r5, A0q, r7, r8, r9, r10, (AnonymousClass1VX) this.A02.A07.get(), A002);
            case 1:
                AnonymousClass4C1 A14 = this.A03.A1q;
                AnonymousClass33p r52 = (AnonymousClass33p) this.A02.Aaj.get();
                return new AdvertiseViewModel(this.A03.A3E, C116985rC.A01(), r52, (AnonymousClass4FS) this.A02.AbX.get(), A14);
            case 2:
                return new AnonymousClass4qA((C55152pt) this.A02.AWi.get(), (C620233e) this.A02.AWq.get(), this.A02.A00.APZ());
            case 3:
                Application A003 = C69773Yi.A00(this.A02.AdE);
                C56522s7 r72 = (C56522s7) this.A02.A8A.get();
                C116985rC A012 = C116985rC.A01();
                AnonymousClass2R8 r82 = (AnonymousClass2R8) this.A02.AWC.get();
                return new AgentDeviceLoginViewModel(A003, A012, C116985rC.A01(), C116985rC.A01(), r72, r82, (AnonymousClass4FS) this.A02.AbX.get());
            case 4:
                C56982ss r6 = (C56982ss) this.A02.A5B.get();
                C620733j r53 = (C620733j) this.A02.AbU.get();
                AnonymousClass33p r42 = (AnonymousClass33p) this.A02.Aaj.get();
                return new ArchiveHeaderViewModel((AnonymousClass314) this.A02.A6v.get(), r42, r53, r6, (AnonymousClass1VX) this.A02.A07.get());
            case 5:
                C56972sr r3 = (C56972sr) this.A02.AJW.get();
                C1230066r r54 = (C1230066r) this.A02.A4Q.get();
                C56122rS r102 = (C56122rS) this.A02.A4F.get();
                AnonymousClass5ZU r92 = (AnonymousClass5ZU) this.A02.AaA.get();
                C97174xk r43 = (C97174xk) this.A02.A00.A22.get();
                C64773Ex r73 = (C64773Ex) this.A02.A6O.get();
                C29421in r83 = (C29421in) this.A02.A6P.get();
                C112515jr A1X = this.A02.Ai5();
                C56322rn r12 = (C56322rn) this.A02.AIT.get();
                return new AudioChatBottomSheetViewModel(r3, r43, r54, A1X, r73, r83, r92, r102, (C56892sj) this.A02.AGm.get(), r12, (AnonymousClass1VX) this.A02.A07.get(), (AnonymousClass4FS) this.A02.AbX.get(), C69723Yd.A00(), C69713Yc.A00());
            case 6:
                C112515jr A1X2 = this.A02.Ai5();
                C97174xk r44 = (C97174xk) this.A02.A00.A22.get();
                C56972sr r32 = (C56972sr) this.A02.AJW.get();
                AnonymousClass5ZU r84 = (AnonymousClass5ZU) this.A02.AaA.get();
                C64773Ex r74 = (C64773Ex) this.A02.A6O.get();
                C56892sj r103 = (C56892sj) this.A02.AGm.get();
                C620633i r93 = (C620633i) this.A02.AYG.get();
                return new AudioChatCallingViewModel(r32, r44, (AnonymousClass3XG) this.A02.A4M.get(), A1X2, r74, r84, r93, r103, (AnonymousClass1VX) this.A02.A07.get());
            case 7:
                C41562Ks r75 = (C41562Ks) this.A02.A00.AAP.get();
                AnonymousClass2TU r122 = (AnonymousClass2TU) this.A02.A00.A9p.get();
                C45952aq r62 = (C45952aq) this.A02.A00.A4F.get();
                AvatarOnDemandStickers A0v = this.A03.A2Q();
                AnonymousClass2UA A0W = this.A03.A1z();
                C49932hK r11 = (C49932hK) this.A02.A1d.get();
                return new AvatarExpressionsViewModel((AnonymousClass2GI) this.A02.A00.A4E.get(), (AnonymousClass2GJ) this.A02.A00.A0j.get(), A0W, r62, r75, A0v, (C55862r2) this.A02.A1T.get(), (C56932sn) this.A02.AXB.get(), r11, r122, (C58912w1) this.A02.A00.AB6.get(), C69713Yc.A00());
            case 8:
                return new AnonymousClass2EM(this);
            case 9:
                C43222Rg r55 = (C43222Rg) this.A02.A1Y.get();
                return new AvatarHomeViewModel((C49652gs) this.A02.A1G.get(), this.A03.A2O(), r55, (AnonymousClass2QP) this.A03.A06.get(), (C55862r2) this.A02.A1T.get(), C69713Yc.A00());
            case 10:
                return new AnonymousClass2QP((C29351ig) this.A02.A1I.get(), C69723Yd.A00());
            case 11:
                return new C41722Li((AnonymousClass2EP) this.A03.A1W.get(), (AnonymousClass4B1) this.A03.A1i.get());
            case 12:
                return new AnonymousClass2EP(this);
            case 13:
                return new C29691kw();
            case 14:
                return new C26811co();
            case 15:
                return new AnonymousClass4J0(this, 6);
            case 16:
                return new C86134Iy(this, 10);
            case 17:
                C55862r2 r104 = (C55862r2) this.A02.A1T.get();
                C30191m3 r123 = (C30191m3) this.A02.ARj.get();
                C49652gs r76 = (C49652gs) this.A02.A1G.get();
                C55782qu r112 = (C55782qu) this.A02.A1W.get();
                C29351ig r94 = (C29351ig) this.A02.A1I.get();
                C101645Fo A022 = this.A03.A1X();
                return new AvatarProfilePhotoViewModel((C69263Wi) this.A02.AG7.get(), (C56972sr) this.A02.AJW.get(), this.A03.A1W(), A022, r76, this.A03.A2P(), r94, r104, r112, r123, (AnonymousClass4FS) this.A02.AbX.get());
            case 18:
                return new C41732Lj((AnonymousClass2EQ) this.A03.A1j.get(), (AnonymousClass4B1) this.A03.A1l.get());
            case 19:
                return new AnonymousClass2EQ(this);
            case 20:
                return new C29701kx();
            case 21:
                return new C26941d1((C55862r2) this.A02.A1T.get());
            case 22:
                return new AnonymousClass4J0(this, 7);
            case 23:
                return new C86134Iy(this, 11);
            case 24:
                AnonymousClass317 r63 = (AnonymousClass317) this.A02.ATf.get();
                return new BanAppealViewModel((AnonymousClass5WY) this.A02.AUS.get(), (AnonymousClass5X8) this.A02.Aac.get(), (AnonymousClass33T) this.A02.Aaf.get(), r63, (C51072jE) this.A02.ATh.get(), (C66433Lk) this.A02.AEu.get(), (C53742na) this.A02.A1z.get());
            case 25:
                C101605Fk r45 = (C101605Fk) this.A03.A1m.get();
                C28131fk r64 = (C28131fk) this.A02.AFZ.get();
                C101615Fl r56 = (C101615Fl) this.A03.A1n.get();
                return new BanReportViewModel((C101595Fj) this.A03.A1M.get(), r45, r56, r64, (C55402qI) this.A02.A3c.get(), (AnonymousClass4FS) this.A02.AbX.get());
            case 26:
                return new C101605Fk(this);
            case 27:
                return new C26831cq();
            case 28:
                return new C27061dD();
            case 29:
                return new C101615Fl(this);
            case 30:
                return new C26821cp();
            case 31:
                return new C101595Fj(this);
            case 32:
                C614030o r13 = (C614030o) this.A02.AOy.get();
                AnonymousClass4FV r113 = (AnonymousClass4FV) this.A02.ASY.get();
                C621033m r46 = (C621033m) this.A02.AZL.get();
                AnonymousClass3LP Akp = this.A02.Akp();
                C64773Ex r65 = (C64773Ex) this.A02.A6O.get();
                C56152rV r95 = (C56152rV) this.A02.AIn.get();
                C56962sq r57 = (C56962sq) this.A02.A2b.get();
                C49562gj A0l = this.A03.A2F();
                return new BlockReasonListViewModel(C69773Yi.A00(this.A02.AdE), r46, r57, r65, (AnonymousClass30W) this.A02.A00.AB2.get(), (C56612sH) this.A02.ASO.get(), r95, Akp, r113, A0l, r13, (AnonymousClass4FS) this.A02.AbX.get());
            case 33:
                return new BloksCDSBottomSheetViewModel();
            case 34:
                return new BonsaiConversationTitleViewModel((C69263Wi) this.A02.AG7.get(), (C1229766o) this.A02.A3A.get(), (C28871hu) this.A02.A51.get());
            case 35:
                AnonymousClass4FV r58 = (AnonymousClass4FV) this.A02.ASY.get();
                C64773Ex r47 = (C64773Ex) this.A02.A6O.get();
                return new BonsaiDiscoveryViewModel((AnonymousClass33R) this.A02.A35.get(), r47, r58, (AnonymousClass4FS) this.A02.AbX.get(), C72343dZ.A00(this.A02.A3R));
            case 36:
                C56382rt r59 = (C56382rt) this.A02.AU4.get();
                return new BonsaiPromptsViewModel((C621033m) this.A02.AZL.get(), (C29431io) this.A02.ALT.get(), r59, (AnonymousClass4FS) this.A02.AbX.get(), C72343dZ.A00(this.A02.A3R));
            case 37:
                return new BonsaiSystemMessageBottomSheetViewModel();
            case 38:
                return new BotChatInfoViewModel((C1229766o) this.A02.A3A.get(), (AnonymousClass3GN) this.A02.A3H.get(), C72343dZ.A00(this.A02.A3R));
            case 39:
                return new BotEmbodimentViewModel((C69263Wi) this.A02.AG7.get(), (C29431io) this.A02.ALT.get(), (AnonymousClass1VX) this.A02.A07.get(), (AnonymousClass4FS) this.A02.AbX.get(), C72343dZ.A00(this.A02.A3R));
            case 40:
                return new BottomSheetViewModel((C97174xk) this.A02.A00.A22.get(), (C620633i) this.A02.AYG.get(), (C187958y5) this.A02.ASM.get());
            case 41:
                AnonymousClass5BV r77 = (AnonymousClass5BV) this.A02.A00.A9A.get();
                return new BrazilAddPixKeyViewModel((AnonymousClass31C) this.A02.AKw.get(), (AnonymousClass9U5) this.A02.AQ5.get(), (AnonymousClass9U4) this.A02.AQC.get(), (AnonymousClass5BU) this.A02.A00.A99.get(), r77, (C194259Se) this.A02.APe.get());
            case 42:
                return new BrazilAddPixSelectionViewModel(this.A03.A2L());
            case 43:
                return new BrazilIncomeCollectionViewModel((C69263Wi) this.A02.AG7.get(), (AnonymousClass31C) this.A02.AKw.get(), (C40602Ha) this.A02.APq.get(), (C620933l) this.A02.APx.get());
            case 44:
                AnonymousClass9U4 r33 = (AnonymousClass9U4) this.A02.AQC.get();
                C190839Aa A2y = this.A02.A00.AN8();
                C194649Ty r66 = (C194649Ty) this.A02.A00.A1I.get();
                return new BrazilPixKeySettingViewModel(r33, A2y, this.A03.A2L(), r66, (AnonymousClass4FS) this.A02.AbX.get());
            case 45:
                AnonymousClass33p r510 = (AnonymousClass33p) this.A02.Aaj.get();
                C55402qI r67 = (C55402qI) this.A02.A3c.get();
                AnonymousClass5JS r78 = (AnonymousClass5JS) this.A02.A3d.get();
                AnonymousClass3T6 A0y = this.A03.A2U();
                return new BusinessActivityReportViewModel(C69773Yi.A00(this.A02.AdE), (C69263Wi) this.A02.AG7.get(), r510, r67, r78, this.A03.A2T(), A0y, this.A03.A2V(), (AnonymousClass4FS) this.A02.AbX.get());
            case 46:
                return new BusinessApiSearchActivityViewModel(C69773Yi.A00(this.A02.AdE), (AnonymousClass5IK) this.A02.A00.A1V.get());
            case 47:
                return new BusinessComplianceViewModel((AnonymousClass5HI) this.A02.A00.A1X.get(), (AnonymousClass4FS) this.A02.AbX.get());
            case 48:
                return new BusinessDirectoryActivityViewModel((AnonymousClass4w0) this.A02.A00.A1g.get());
            case 49:
                C112315jX A0D = this.A03.A1i();
                C105085Tn r79 = (C105085Tn) this.A02.A00.AAO.get();
                C1224064g r105 = (C1224064g) this.A03.A1X.get();
                AnonymousClass4w0 r68 = (AnonymousClass4w0) this.A02.A00.A1g.get();
                AnonymousClass5TO r85 = (AnonymousClass5TO) this.A02.A00.A3O.get();
                return new BusinessDirectoryConsumerHomeViewModel(C69773Yi.A00(this.A02.AdE), (C111525iE) this.A02.A00.A3d.get(), (C111545iG) this.A02.A00.A3e.get(), r68, r79, r85, A0D, r105, (C105355Up) this.A02.A00.A1a.get());
            case 50:
                return new C123936Ai(this, 1);
            case 51:
                return new C123946Aj(this, 1);
            case AnonymousClass1ES.REVOKE_MESSAGE_TIMESTAMP_FIELD_NUMBER:
                return new C123956Ak(this, 1);
            case 53:
                return new C123966Al(this, 1);
            case 54:
                return new C123986An(this, 1);
            case 55:
                return new C123996Ao(this, 1);
            case 56:
                return new C123926Ah(this, 2);
            case AnonymousClass1ES.IS_GROUP_HISTORY_MESSAGE_FIELD_NUMBER:
                return new C124006Ap(this, 1);
            case 58:
                return new C124016Aq(this, 1);
            case 59:
                return new C124076Aw(this, 1);
            case AnonymousClass1EU.POLL_CREATION_MESSAGE_V2_FIELD_NUMBER:
                C56612sH r17 = (C56612sH) this.A02.ASO.get();
                C69263Wi r16 = (C69263Wi) this.A02.AG7.get();
                Application A004 = C69773Yi.A00(this.A02.AdE);
                AnonymousClass0XV A005 = this.A03.A3E;
                C112275jT A09 = this.A03.A1e();
                C157167hq A0B = this.A03.A1g();
                C105955Xb A0C = this.A03.A1h();
                BusinessDirectoryContextualSearchViewModel businessDirectoryContextualSearchViewModel = r18;
                AnonymousClass7HD r37 = new AnonymousClass7HD();
                AnonymousClass5OG r27 = (AnonymousClass5OG) this.A02.A00.A3f.get();
                AnonymousClass4w0 r28 = (AnonymousClass4w0) this.A02.A00.A1g.get();
                C105085Tn r29 = (C105085Tn) this.A02.A00.AAO.get();
                AnonymousClass5TO r30 = (AnonymousClass5TO) this.A02.A00.A3O.get();
                C150977Sy r31 = (C150977Sy) this.A02.A00.A3X.get();
                BusinessDirectoryContextualSearchViewModel businessDirectoryContextualSearchViewModel2 = new BusinessDirectoryContextualSearchViewModel(A004, A005, (AnonymousClass5MC) this.A02.A00.A4Y.get(), r16, (AnonymousClass5IL) this.A02.A00.A3U.get(), (C111525iE) this.A02.A00.A3d.get(), (C111545iG) this.A02.A00.A3e.get(), A09, r27, r28, r29, r30, r31, A0B, (AnonymousClass5AA) this.A02.A00.ABi.get(), (C1223764d) this.A03.A1a.get(), A0C, (C182038nl) this.A03.A1Z.get(), r37, (C1224064g) this.A03.A1X.get(), r17, (C105355Up) this.A02.A00.A1a.get(), (AnonymousClass8E9) this.A02.A00.A1c.get(), (AnonymousClass5PS) this.A02.A00.A3Y.get());
                return businessDirectoryContextualSearchViewModel2;
            case 61:
                return new C124036As(this, 1);
            case 62:
                return new C124046At(this, 1);
            case 63:
                return new C124056Au(this, 1);
            case AnonymousClass1EU.POLL_CREATION_MESSAGE_V3_FIELD_NUMBER:
                return new BusinessDirectoryEducationNuxViewModel(C69773Yi.A00(this.A02.AdE), (C111525iE) this.A02.A00.A3d.get(), (AnonymousClass4w0) this.A02.A00.A1g.get());
            case AnonymousClass1EU.SCHEDULED_CALL_EDIT_MESSAGE_FIELD_NUMBER:
                return new BusinessDirectoryFrequentContactedViewModel(C69773Yi.A00(this.A02.AdE), (C111545iG) this.A02.A00.A3e.get(), this.A03.A2H());
            case AnonymousClass1EU.PTV_MESSAGE_FIELD_NUMBER:
                return new BusinessDirectoryPopularApiBusinessesViewModel(C69773Yi.A00(this.A02.AdE), (C111545iG) this.A02.A00.A3e.get(), this.A03.A1e(), this.A03.A1f(), (AnonymousClass5TO) this.A02.A00.A3O.get(), (C105355Up) this.A02.A00.A1a.get());
            case AnonymousClass1EU.BOT_INVOKE_MESSAGE_FIELD_NUMBER:
                return new CAGInfoChatLockViewModel((C28891hw) this.A02.A6s.get());
            case 68:
                C56982ss r710 = (C56982ss) this.A02.A5B.get();
                C64773Ex r511 = (C64773Ex) this.A02.A6O.get();
                C49882hF r114 = (C49882hF) this.A02.AGU.get();
                AnonymousClass5ZU r69 = (AnonymousClass5ZU) this.A02.AaA.get();
                C106995aW r48 = (C106995aW) this.A02.A4q.get();
                C66503Lr r124 = (C66503Lr) this.A02.AGs.get();
                C29431io r96 = (C29431io) this.A02.ALT.get();
                C28891hw r86 = (C28891hw) this.A02.A6s.get();
                AnonymousClass4AS r132 = (AnonymousClass4AS) this.A03.A1b.get();
                return new CAGInfoViewModel((C69263Wi) this.A02.AG7.get(), r48, r511, r69, r710, r86, r96, (C50932j0) this.A02.AGP.get(), r114, r124, r132, (AnonymousClass4FS) this.A02.AbX.get());
            case AnonymousClass1EU.CALL_LOG_MESSSAGE_FIELD_NUMBER:
                return new AnonymousClass4J2(this, 1);
            case AnonymousClass1EU.MESSAGE_HISTORY_BUNDLE_FIELD_NUMBER:
                C97174xk r14 = (C97174xk) this.A02.A00.A22.get();
                AnonymousClass5ZG r87 = (AnonymousClass5ZG) this.A02.A00.A21.get();
                AnonymousClass5NO A0j = this.A02.A00.AJi();
                FetchAvatarEffectUseCase A0I = this.A03.A1n();
                CallAvatarARClassManager callAvatarARClassManager = (CallAvatarARClassManager) this.A02.A00.A1z.get();
                InitializeAvatarEffectUseCase A0G = this.A03.A1l();
                CallAvatarFLMConsentManager callAvatarFLMConsentManager = (CallAvatarFLMConsentManager) this.A02.A00.A20.get();
                C103425Mx r125 = (C103425Mx) this.A02.A48.get();
                C101725Fw A0F = this.A03.A1k();
                AnonymousClass5MN A0H = this.A03.A1m();
                AnonymousClass1VX r172 = (AnonymousClass1VX) this.A02.A07.get();
                return new CallAvatarViewModel(callAvatarARClassManager, callAvatarFLMConsentManager, A0j, r87, A0F, A0G, A0H, r125, A0I, r14, (C56612sH) this.A02.ASO.get(), (C57162tC) this.A02.AaV.get(), r172, (C51932kc) this.A02.A1Z.get());
            case AnonymousClass1EU.ENC_COMMENT_MESSAGE_FIELD_NUMBER:
                return new CallControlButtonsViewModel((C97174xk) this.A02.A00.A22.get());
            case 72:
                AnonymousClass1VX r19 = (AnonymousClass1VX) this.A02.A07.get();
                C56972sr r18 = (C56972sr) this.A02.AJW.get();
                C54292oU r173 = (C54292oU) this.A02.AaB.get();
                AnonymousClass4FS r162 = (AnonymousClass4FS) this.A02.AbX.get();
                C52412lR A3g = this.A02.AkL();
                AnonymousClass5NO A0j2 = this.A02.A00.AJi();
                AnonymousClass4C1 A86 = this.A02.A00.A9g;
                AnonymousClass4C1 A87 = this.A02.A00.A9h;
                AnonymousClass4C1 A88 = this.A02.A00.A9i;
                AnonymousClass5TU r272 = (AnonymousClass5TU) this.A02.A00.AAL.get();
                C118405tU r282 = (C118405tU) this.A02.A00.A8Y.get();
                C91444jd r292 = (C91444jd) this.A02.A00.AAS.get();
                C116655qe r302 = (C116655qe) this.A02.A00.ABw.get();
                C64773Ex r312 = (C64773Ex) this.A02.A6O.get();
                AnonymousClass5ZU r322 = (AnonymousClass5ZU) this.A02.AaA.get();
                C54292oU r332 = r173;
                C620733j r34 = (C620733j) this.A02.AbU.get();
                return new CallGridViewModel((C111095hX) this.A02.A0a.get(), r18, A0j2, (C97174xk) this.A02.A00.A22.get(), (AnonymousClass8GN) this.A02.A00.A9V.get(), C88874aw.A0J(), r272, r282, r292, r302, r312, r322, r332, r34, (C56892sj) this.A02.AGm.get(), A3g, r19, (C66493Lq) this.A02.AGL.get(), (C56572sD) this.A02.AWF.get(), (C187958y5) this.A02.ASM.get(), r162, (VoipCameraManager) this.A02.Aa0.get(), A86, A87, A88);
            case 73:
                C56972sr r49 = (C56972sr) this.A02.AJW.get();
                C64773Ex r610 = (C64773Ex) this.A02.A6O.get();
                return new CallHeaderViewModel((C69263Wi) this.A02.AG7.get(), r49, (C97174xk) this.A02.A00.A22.get(), r610, (AnonymousClass5ZU) this.A02.AaA.get(), (C620733j) this.A02.AbU.get(), (C55422qK) this.A02.AUG.get(), (AnonymousClass4FS) this.A02.AbX.get());
            case AnonymousClass1EU.LOTTIE_STICKER_MESSAGE_FIELD_NUMBER:
                return new CallLinkViewModel(this.A03.A3E, this.A03.A1q(), (C29441ip) this.A02.A68.get());
            case AnonymousClass1EU.EVENT_MESSAGE_FIELD_NUMBER:
                C73853gB A006 = C69713Yc.A00();
                C73853gB A007 = C69723Yd.A00();
                AnonymousClass5Z0 A0q2 = this.A02.A00.AJu();
                AnonymousClass0XV A008 = this.A03.A3E;
                C66493Lq r24 = (C66493Lq) this.A02.AGL.get();
                AnonymousClass1VX r23 = (AnonymousClass1VX) this.A02.A07.get();
                C56892sj r22 = (C56892sj) this.A02.AGm.get();
                C56122rS r21 = (C56122rS) this.A02.A4F.get();
                C620733j r20 = (C620733j) this.A02.AbU.get();
                C54292oU r192 = (C54292oU) this.A02.AaB.get();
                AnonymousClass5ZU r182 = (AnonymousClass5ZU) this.A02.AaA.get();
                return new CallLogMessageParticipantBottomSheetViewModel(A008, (C56972sr) this.A02.AJW.get(), (C1230066r) this.A02.A4Q.get(), (C623234o) this.A02.A4O.get(), A0q2, (C64773Ex) this.A02.A6O.get(), r182, r192, r20, r21, r22, r23, r24, (C56572sD) this.A02.AWF.get(), A006, A007);
            case AnonymousClass1EU.ENC_EVENT_RESPONSE_MESSAGE_FIELD_NUMBER:
                AnonymousClass364 r35 = (AnonymousClass364) this.A02.A00.AC1.get();
                AnonymousClass5Z0 A0q3 = this.A02.A00.AJu();
                return new CallRatingViewModel((C106155Xv) this.A02.Aa5.get(), A0q3, r35, (AnonymousClass1VX) this.A02.A07.get());
            case AnonymousClass1EU.COMMENT_MESSAGE_FIELD_NUMBER:
                return new CallScreenViewModel((C97174xk) this.A02.A00.A22.get(), (C64773Ex) this.A02.A6O.get(), (AnonymousClass5ZU) this.A02.AaA.get(), (AnonymousClass1VX) this.A02.A07.get(), (C66493Lq) this.A02.AGL.get(), (C56572sD) this.A02.AWF.get());
            case AnonymousClass1EU.NEWSLETTER_ADMIN_INVITE_MESSAGE_FIELD_NUMBER:
                C97174xk r36 = (C97174xk) this.A02.A00.A22.get();
                return new CallSuggestionsViewModel((AnonymousClass2VV) this.A03.A1c.get(), r36, (C56612sH) this.A02.ASO.get(), C69703Yb.A00());
            case 79:
                return new AnonymousClass2VV(this);
            case 80:
                C56612sH r174 = (C56612sH) this.A02.ASO.get();
                AnonymousClass1VX r163 = (AnonymousClass1VX) this.A02.A07.get();
                AnonymousClass5XL A0L = this.A03.A1o();
                C150987Sz A0M = this.A03.A1p();
                AnonymousClass5ZU r26 = (AnonymousClass5ZU) this.A02.AaA.get();
                C56612sH r273 = r174;
                C620733j r283 = (C620733j) this.A02.AbU.get();
                C56762sW r293 = (C56762sW) this.A02.A4R.get();
                C56892sj r303 = (C56892sj) this.A02.AGm.get();
                C55422qK r313 = (C55422qK) this.A02.AUG.get();
                AnonymousClass1VX r323 = r163;
                AnonymousClass5IP r222 = (AnonymousClass5IP) this.A02.A00.A6l.get();
                C112415jh r232 = (C112415jh) this.A02.Aa3.get();
                C44772Xk r242 = (C44772Xk) this.A02.A6I.get();
                C64773Ex r25 = (C64773Ex) this.A02.A6O.get();
                return new CallsHistoryFragmentV2ViewModel((C56972sr) this.A02.AJW.get(), A0L, A0M, r222, r232, r242, r25, r26, r273, r283, r293, r303, r313, r323, (C66493Lq) this.A02.AGL.get(), (C28781hl) this.A02.AGO.get(), (C52472lX) this.A02.AXh.get(), (C56572sD) this.A02.AWF.get(), (C187958y5) this.A02.ASM.get(), (AnonymousClass4FS) this.A02.AbX.get());
            case 81:
                AnonymousClass5QD A0O = this.A03.A1r();
                return new CatalogAllCategoryViewModel((AnonymousClass5QB) this.A02.A00.A2H.get(), A0O, new AnonymousClass5AN(), (AnonymousClass4FS) this.A02.AbX.get());
            case 82:
                AnonymousClass5QD A0O2 = this.A03.A1r();
                return new CatalogCategoryGroupsViewModel((AnonymousClass5QB) this.A02.A00.A2H.get(), A0O2, new AnonymousClass5AN(), (AnonymousClass4FS) this.A02.AbX.get());
            case 83:
                AnonymousClass5QD A0O3 = this.A03.A1r();
                return new CatalogCategoryTabsViewModel((AnonymousClass5QB) this.A02.A00.A2H.get(), this.A03.A1j(), A0O3, (AnonymousClass4FS) this.A02.AbX.get());
            case 84:
                C103555Nl A0S = this.A03.A1v();
                return new CatalogSearchViewModel((AnonymousClass5MJ) this.A02.A00.A9Q.get(), this.A02.AhS(), C88874aw.A0Q(), A0S);
            case 85:
                C56982ss r512 = (C56982ss) this.A02.A5B.get();
                C56522s7 r611 = (C56522s7) this.A02.A8A.get();
                return new ChatLockAuthViewModel((C106995aW) this.A02.A4q.get(), (AnonymousClass5UK) this.A02.A4p.get(), r512, r611, (AnonymousClass4FS) this.A02.AbX.get());
            case 86:
                ChatTransferViewModel chatTransferViewModel = r16;
                C155927fk A0m = this.A03.A2G();
                C50592iR r284 = (C50592iR) this.A02.A00.A4A.get();
                AnonymousClass2UI r294 = (AnonymousClass2UI) this.A02.A00.A69.get();
                C28901hx r304 = (C28901hx) this.A02.A00.A8X.get();
                C28801hn r252 = (C28801hn) this.A02.A00.A7T.get();
                C56022rI r262 = (C56022rI) this.A02.AMv.get();
                C28851hs r274 = (C28851hs) this.A02.AMk.get();
                AnonymousClass33p r223 = (AnonymousClass33p) this.A02.Aaj.get();
                AnonymousClass1VW r233 = (AnonymousClass1VW) this.A02.A03.get();
                AnonymousClass1VX r243 = (AnonymousClass1VX) this.A02.A07.get();
                C56972sr r193 = (C56972sr) this.A02.AJW.get();
                C54292oU r202 = (C54292oU) this.A02.AaB.get();
                C57162tC r212 = (C57162tC) this.A02.AaV.get();
                ChatTransferViewModel chatTransferViewModel2 = new ChatTransferViewModel((AnonymousClass2EN) this.A03.A1d.get(), (AnonymousClass2EO) this.A03.A1e.get(), r193, r202, r212, r223, r233, r243, r252, r262, r274, r284, r294, r304, A0m, (C55112po) this.A02.A00.A75.get(), (AnonymousClass4FS) this.A02.AbX.get());
                return chatTransferViewModel2;
            case 87:
                return new AnonymousClass2EN(this);
            case 88:
                return new AnonymousClass2EO(this);
            case 89:
                return new CommonViewModel(C72343dZ.A00(this.A02.A2o));
            case 90:
                AnonymousClass31C r115 = (AnonymousClass31C) this.A02.AKw.get();
                C64773Ex r88 = (C64773Ex) this.A02.A6O.get();
                C56942so r410 = (C56942so) this.A02.A5V.get();
                C73853gB A009 = C69703Yb.A00();
                C84384Cd A1l = this.A02.AiI();
                AnonymousClass33U r711 = (AnonymousClass33U) this.A02.A5h.get();
                C50932j0 r106 = (C50932j0) this.A02.AGP.get();
                MemberSuggestedGroupsManager memberSuggestedGroupsManager = (MemberSuggestedGroupsManager) this.A02.AKB.get();
                return new CommunitySettingsViewModel(this.A03.A1w(), r410, A1l, memberSuggestedGroupsManager, r711, r88, (AnonymousClass1VX) this.A02.A07.get(), r106, r115, (AnonymousClass4FS) this.A02.AbX.get(), A009);
            case 91:
                return new CompanionRegistrationViewModel((C47872dy) this.A02.A5w.get(), (AnonymousClass4FS) this.A02.AbX.get());
            case 92:
                AnonymousClass5Y9 r38 = (AnonymousClass5Y9) this.A02.A4Y.get();
                C105145Tt r2 = (C105145Tt) this.A02.A4V.get();
                return new ComplianceInfoViewModel((C105405Uu) this.A02.A4W.get(), r2, r38, (AnonymousClass4FS) this.A02.AbX.get());
            case 93:
                return new ConsumerDisclosureViewModel((C54032o4) this.A03.A13.get());
            case 94:
                C56832sd r116 = (C56832sd) this.A02.AY6.get();
                C66543Lv r89 = (C66543Lv) this.A02.A71.get();
                C50002hT r712 = (C50002hT) this.A02.AYs.get();
                C44902Xx r612 = (C44902Xx) this.A02.A7W.get();
                C183538qC A0010 = C72343dZ.A00(this.A02.A6A);
                C49202g9 r107 = (C49202g9) this.A02.A6C.get();
                C40772Hr A7G = this.A02.Apn();
                return new C54032o4((C56612sH) this.A02.ASO.get(), this.A02.Aje(), (C40362Fn) this.A02.A7V.get(), r612, r712, r89, A7G, r107, r116, (AnonymousClass4FS) this.A02.AbX.get(), A0010);
            case 95:
                AnonymousClass1VX r613 = (AnonymousClass1VX) this.A02.A07.get();
                return new ContactUsWithAiViewModel((C69263Wi) this.A02.AG7.get(), (C56982ss) this.A02.A5B.get(), (C28891hw) this.A02.A6s.get(), r613, this.A03.A2E(), (C46012aw) this.A02.A00.A2M.get(), (AnonymousClass4FS) this.A02.AbX.get());
            case 96:
                return A03((C56942so) this.A02.A5V.get(), (C56892sj) this.A02.AGm.get(), (C66493Lq) this.A02.AGL.get(), (AnonymousClass4FS) this.A02.AbX.get());
            case 97:
                return new ConversationSearchViewModel();
            case 98:
                C116985rC A013 = C116985rC.A01();
                AnonymousClass2R8 r713 = (AnonymousClass2R8) this.A02.AWC.get();
                return new ConversationTitleViewModel(C69773Yi.A00(this.A02.AdE), A013, C116985rC.A01(), C116985rC.A01(), r713, (AnonymousClass4FS) this.A02.AbX.get());
            case 99:
                return new CountryGatingViewModel(this.A02.A00.AId(), (AnonymousClass1VX) this.A02.A07.get());
            default:
                throw new AssertionError(this.A00);
        }
    }

    public final Object A09() {
        switch (this.A00) {
            case 100:
                C620733j r2 = (C620733j) this.A02.AbU.get();
                return new CountryListViewModel((C106175Xx) this.A02.ARx.get(), (C54292oU) this.A02.AaB.get(), r2, (C106675Zy) this.A02.A73.get());
            case 101:
                C113995mK r5 = (C113995mK) this.A02.AWt.get();
                WfalManager wfalManager = (WfalManager) this.A02.AbR.get();
                C105125Tr r7 = (C105125Tr) this.A02.A00.ACK.get();
                AnonymousClass5L2 r6 = (AnonymousClass5L2) this.A02.A00.A32.get();
                return new CrossPostingUpdatesViewModel(wfalManager, (C65173Gm) this.A02.ATW.get(), r5, r6, r7, (C104745Se) this.A02.Abv.get());
            case 102:
                C45682aP A9H = this.A02.AsO();
                return new CtwaStatusUpsellBottomSheetTriggerViewModel(C116985rC.A01(), (AnonymousClass4FV) this.A02.ASY.get(), (AnonymousClass4FS) this.A02.AbX.get(), A9H);
            case 103:
                C27821ej r4 = (C27821ej) this.A02.ATV.get();
                AnonymousClass33p r3 = (AnonymousClass33p) this.A02.Aaj.get();
                C102725Ka A0Y = this.A03.A21();
                return new EmojiExpressionsViewModel(r3, r4, (AnonymousClass5Y0) this.A02.A8o.get(), (AnonymousClass2GI) this.A02.A00.A4E.get(), A0Y, (C45952aq) this.A02.A00.A4F.get(), (C104185Pz) this.A02.A00.A4G.get(), (C60152y5) this.A02.AVn.get(), C69713Yc.A00());
            case 104:
                AnonymousClass4FV r72 = (AnonymousClass4FV) this.A02.ASY.get();
                AnonymousClass31C r8 = (AnonymousClass31C) this.A02.AKw.get();
                C620633i r42 = (C620633i) this.A02.AYG.get();
                C620733j r62 = (C620733j) this.A02.AbU.get();
                AnonymousClass0WN r32 = (AnonymousClass0WN) this.A02.A8q.get();
                AnonymousClass317 r9 = (AnonymousClass317) this.A02.ATf.get();
                return new EncBackupViewModel(r32, r42, (AnonymousClass33p) this.A02.Aaj.get(), r62, r72, r8, r9, (AnonymousClass4FS) this.A02.AbX.get());
            case 105:
                return new EnforcedMessagesViewModel((C64773Ex) this.A02.A6O.get(), (AnonymousClass1VX) this.A02.A07.get(), this.A03.A2J(), C69703Yb.A00());
            case 106:
                return new ExportMigrationViewModel((AnonymousClass1VX) this.A02.A07.get(), (C28851hs) this.A02.AMk.get());
            case 107:
                AnonymousClass2GI r43 = (AnonymousClass2GI) this.A02.A00.A4E.get();
                AnonymousClass2GJ r52 = (AnonymousClass2GJ) this.A02.A00.A0j.get();
                AnonymousClass2GL r82 = (AnonymousClass2GL) this.A02.A00.ABO.get();
                C56612sH r33 = (C56612sH) this.A02.ASO.get();
                AnonymousClass1VX r92 = (AnonymousClass1VX) this.A02.A07.get();
                AnonymousClass4FV r10 = (AnonymousClass4FV) this.A02.ASY.get();
                C55862r2 r13 = (C55862r2) this.A02.A1T.get();
                C45952aq r73 = (C45952aq) this.A02.A00.A4F.get();
                C49652gs r11 = (C49652gs) this.A02.A1G.get();
                return new ExpressionsKeyboardViewModel(r33, r43, r52, this.A03.A20(), r73, r82, r92, r10, r11, (AnonymousClass2QP) this.A03.A06.get(), r13, (AnonymousClass2TU) this.A02.A00.A9p.get(), (C49942hL) this.A03.A0J.get(), C69713Yc.A00());
            case C627136h.A03:
                C49942hL A12 = this.A03.A2Y();
                C116925r5.A00(A12);
                return A12;
            case 109:
                AnonymousClass2GI r44 = (AnonymousClass2GI) this.A02.A00.A4E.get();
                C56612sH r34 = (C56612sH) this.A02.ASO.get();
                AnonymousClass1VX r74 = (AnonymousClass1VX) this.A02.A07.get();
                AnonymousClass4FV r83 = (AnonymousClass4FV) this.A02.ASY.get();
                C55862r2 r112 = (C55862r2) this.A02.A1T.get();
                C41562Ks r63 = (C41562Ks) this.A02.A00.AAP.get();
                C49652gs r93 = (C49652gs) this.A02.A1G.get();
                C49932hK r12 = (C49932hK) this.A02.A1d.get();
                return new ExpressionsSearchViewModel(r34, r44, this.A03.A20(), r63, r74, r83, r93, (AnonymousClass2QP) this.A03.A06.get(), r112, r12, (AnonymousClass2TU) this.A02.A00.A9p.get(), (C49942hL) this.A03.A0J.get(), C69713Yc.A00());
            case 110:
                C56422rx r45 = (C56422rx) this.A02.AZn.get();
                C613330g r53 = (C613330g) this.A02.A6S.get();
                return new ExtensionsFooterViewModel((C64773Ex) this.A02.A6O.get(), r45, r53, (AnonymousClass1VX) this.A02.A07.get(), (AnonymousClass4FS) this.A02.AbX.get());
            case 111:
                return new GenericBkLayoutViewModelWithReload(C72343dZ.A00(this.A02.A2o));
            case 112:
                return A07((C29441ip) this.A02.A68.get(), C72343dZ.A00(this.A02.A2o));
            case 113:
                C41562Ks r22 = (C41562Ks) this.A02.A00.AAP.get();
                return new GifExpressionsSearchViewModel((AnonymousClass2GI) this.A02.A00.A4E.get(), (C45952aq) this.A02.A00.A4F.get(), r22, (C55922r8) this.A02.A00.A9d.get());
            case 114:
                return A01((C06260Ww) this.A02.AG9.get(), (C56612sH) this.A02.ASO.get(), (AnonymousClass33p) this.A02.Aaj.get());
            case 115:
                C44772Xk r46 = (C44772Xk) this.A02.A6I.get();
                AnonymousClass5ZR r64 = (AnonymousClass5ZR) this.A02.Aag.get();
                AnonymousClass317 r94 = (AnonymousClass317) this.A02.ATf.get();
                C28841hr r84 = (C28841hr) this.A02.A00.A5h.get();
                C104015Ph r113 = (C104015Ph) this.A02.A00.A5j.get();
                return new GoogleMigrateImporterViewModel((C29441ip) this.A02.A68.get(), r46, (C54292oU) this.A02.AaB.get(), r64, (C625635p) this.A02.A00.A5f.get(), r84, r94, (C56502s5) this.A02.A00.A5N.get(), r113, (C54622p1) this.A02.AFV.get());
            case 116:
                C64773Ex r23 = (C64773Ex) this.A02.A6O.get();
                return new GroupCallParticipantSuggestionsViewModel((AnonymousClass2VV) this.A03.A1c.get(), r23, (C56612sH) this.A02.ASO.get());
            case 117:
                return new GroupCallPsaViewModel(this.A02.A00.AJs(), (AnonymousClass5ZU) this.A02.AaA.get());
            case 118:
                return new HistorySettingViewModel((C29441ip) this.A02.A68.get(), (C64773Ex) this.A02.A6O.get(), (C56892sj) this.A02.AGm.get(), (C50932j0) this.A02.AGP.get(), (C29241iV) this.A02.AGn.get(), this.A03.A28());
            case 119:
                return new HomeViewModel(C69773Yi.A00(this.A02.AdE));
            case 120:
                C43752Ti A0g = this.A03.A2A();
                C47232cv A0i = this.A03.A2C();
                AnonymousClass2QA A0h = this.A03.A2B();
                ReportBugProtocolHelper A0j = this.A03.A2D();
                return new InAppBugReportingViewModel((AnonymousClass1VX) this.A02.A07.get(), A0g, A0h, A0i, (AnonymousClass5N4) this.A02.A00.A1P.get(), (AnonymousClass2WS) this.A02.A00.A6A.get(), A0j, (C989053r) this.A02.AJl.get());
            case 121:
                C56972sr r35 = (C56972sr) this.A02.AJW.get();
                C64773Ex r65 = (C64773Ex) this.A02.A6O.get();
                AnonymousClass5ZU r75 = (AnonymousClass5ZU) this.A02.AaA.get();
                C97174xk r54 = (C97174xk) this.A02.A00.A22.get();
                return new InCallBannerViewModel(r35, (C106155Xv) this.A02.Aa5.get(), r54, r65, r75, (AnonymousClass1VX) this.A02.A07.get());
            case 122:
                C197109ca r28 = (C197109ca) this.A02.AHW.get();
                AnonymousClass9OI r29 = (AnonymousClass9OI) this.A02.A00.A8l.get();
                C153527bU r30 = (C153527bU) this.A02.A00.A6Q.get();
                AnonymousClass9U4 r26 = (AnonymousClass9U4) this.A02.AQC.get();
                AnonymousClass9b0 r27 = (AnonymousClass9b0) this.A02.APz.get();
                C1906899l r24 = (C1906899l) this.A02.APJ.get();
                C620933l r25 = (C620933l) this.A02.APx.get();
                AnonymousClass1VX r222 = (AnonymousClass1VX) this.A02.A07.get();
                C196629bS r232 = (C196629bS) this.A02.AHY.get();
                AnonymousClass36Y r21 = (AnonymousClass36Y) this.A02.A7u.get();
                C617332a r20 = (C617332a) this.A02.APZ.get();
                AnonymousClass36F r19 = (AnonymousClass36F) this.A02.AQ1.get();
                C620733j r18 = (C620733j) this.A02.AbU.get();
                return new IndiaPaymentSettingsViewModel((C56612sH) this.A02.ASO.get(), r18, r19, r20, r21, r222, r232, r24, r25, r26, r27, r28, r29, r30, (C613130e) this.A02.A00.ABh.get(), (AnonymousClass4FS) this.A02.AbX.get());
            case 123:
                return new IndiaUpiInternationalActivationViewModel(C69773Yi.A00(this.A02.AdE), (C620733j) this.A02.AbU.get(), (AnonymousClass9U1) this.A02.AHX.get(), this.A03.A2M(), (C197109ca) this.A02.AHW.get(), (C158757kV) this.A02.A00.A6P.get());
            case 124:
                return new IndiaUpiInternationalValidateQrViewModel(C69773Yi.A00(this.A02.AdE), (AnonymousClass1VX) this.A02.A07.get(), this.A03.A2M(), (C197109ca) this.A02.AHW.get());
            case 125:
                return new IndiaUpiMandateHistoryViewModel((C69263Wi) this.A02.AG7.get(), (C54292oU) this.A02.AaB.get(), (AnonymousClass36F) this.A02.AQ1.get(), (C197109ca) this.A02.AHW.get(), (AnonymousClass4FS) this.A02.AbX.get());
            case 126:
                return new IndiaUpiMapperLinkViewModel(C69773Yi.A00(this.A02.AdE), (C56972sr) this.A02.AJW.get(), (C196629bS) this.A02.AHY.get(), this.A03.A2N(), (C153527bU) this.A02.A00.A6Q.get());
            case 127:
                return new IndiaUpiNumberSettingsViewModel((C153527bU) this.A02.A00.A6Q.get());
            case 128:
                C69263Wi r36 = (C69263Wi) this.A02.AG7.get();
                AnonymousClass8EA r76 = (AnonymousClass8EA) this.A02.ASG.get();
                C620733j r66 = (C620733j) this.A02.AbU.get();
                AnonymousClass9U4 r95 = (AnonymousClass9U4) this.A02.AQC.get();
                AnonymousClass9WN r102 = (AnonymousClass9WN) this.A02.A00.A6I.get();
                return new IndiaUpiPauseMandateViewModel(r36, (C56612sH) this.A02.ASO.get(), (C54292oU) this.A02.AaB.get(), r66, r76, (C29271iY) this.A02.AQ0.get(), r95, r102, (AnonymousClass4FS) this.A02.AbX.get());
            case 129:
                AnonymousClass9U5 r282 = (AnonymousClass9U5) this.A02.AQ5.get();
                AnonymousClass9TB r292 = (AnonymousClass9TB) this.A02.AHZ.get();
                AnonymousClass9B3 r302 = (AnonymousClass9B3) this.A02.A00.A6S.get();
                C40602Ha r272 = (C40602Ha) this.A02.APq.get();
                AnonymousClass9U1 r262 = (AnonymousClass9U1) this.A02.AHX.get();
                C194619Tt r252 = (C194619Tt) this.A02.A00.A6K.get();
                AnonymousClass31C r242 = (AnonymousClass31C) this.A02.AKw.get();
                AnonymousClass1VX r233 = (AnonymousClass1VX) this.A02.A07.get();
                C617332a r223 = (C617332a) this.A02.APZ.get();
                AnonymousClass36F r212 = (AnonymousClass36F) this.A02.AQ1.get();
                C54292oU r202 = (C54292oU) this.A02.AaB.get();
                C56612sH r192 = (C56612sH) this.A02.ASO.get();
                C56972sr r182 = (C56972sr) this.A02.AJW.get();
                return new IndiaUpiPaymentTransactionConfirmationBottomSheetViewModel((C69263Wi) this.A02.AG7.get(), r182, r192, r202, r212, r223, r233, r242, r252, r262, r272, r282, r292, r302, (C194259Se) this.A02.APe.get(), (AnonymousClass4FS) this.A02.AbX.get());
            case 130:
                C69263Wi r37 = (C69263Wi) this.A02.AG7.get();
                C66663Mh r47 = (C66663Mh) this.A02.AUd.get();
                AnonymousClass9U5 r114 = (AnonymousClass9U5) this.A02.AQ5.get();
                C153087ae r122 = (C153087ae) this.A02.AQ7.get();
                C40602Ha r103 = (C40602Ha) this.A02.APq.get();
                C196629bS r96 = (C196629bS) this.A02.AHY.get();
                return new IndiaUpiSecureQrCodeViewModel(r37, r47, (C56612sH) this.A02.ASO.get(), (C54292oU) this.A02.AaB.get(), (C54412og) this.A02.Aam.get(), (AnonymousClass31C) this.A02.AKw.get(), r96, r103, r114, r122, (AnonymousClass9U4) this.A02.AQC.get());
            case 131:
                return new InteropViewModel((AnonymousClass314) this.A02.A6v.get(), (C620733j) this.A02.AbU.get(), (AnonymousClass2LD) this.A02.AIK.get(), C69703Yb.A00());
            case 132:
                return new InviteNonWhatsAppContactPickerViewModel(C69773Yi.A00(this.A02.AdE), (C64773Ex) this.A02.A6O.get(), (AnonymousClass5ZU) this.A02.AaA.get(), (C620733j) this.A02.AbU.get(), (C103315Mk) this.A02.A00.A74.get());
            case 133:
                return new LinkedDeviceEditDeviceViewModel((C29041iB) this.A02.A5l.get(), (AnonymousClass4FS) this.A02.AbX.get());
            case 134:
                return new LinkedDeviceEnterNicknameViewModel((C29041iB) this.A02.A5l.get(), (AnonymousClass4FS) this.A02.AbX.get());
            case 135:
                Application A002 = C69773Yi.A00(this.A02.AdE);
                C116985rC A012 = C116985rC.A01();
                C29041iB r263 = (C29041iB) this.A02.A5l.get();
                C56522s7 r273 = (C56522s7) this.A02.A8A.get();
                C55802qw r283 = (C55802qw) this.A02.ALH.get();
                AnonymousClass1VX r293 = (AnonymousClass1VX) this.A02.A07.get();
                C65203Gp r224 = (C65203Gp) this.A02.AXm.get();
                C64663Ek r234 = (C64663Ek) this.A02.AXn.get();
                C29441ip r243 = (C29441ip) this.A02.A68.get();
                AnonymousClass33p r253 = (AnonymousClass33p) this.A02.Aaj.get();
                return new LinkedDevicesSharedViewModel(A002, A012, C116985rC.A02((C46022ax) this.A02.AHp.get()), (C69263Wi) this.A02.AG7.get(), (C66663Mh) this.A02.AUd.get(), (C48442eu) this.A02.A5r.get(), r224, r234, r243, r253, r263, r273, r283, r293, (C66653Mg) this.A02.AN6.get(), (C46122b7) this.A02.A00.A3S.get(), (AnonymousClass4FS) this.A02.AbX.get());
            case 136:
                C66653Mg r77 = (C66653Mg) this.A02.AN6.get();
                C29041iB r67 = (C29041iB) this.A02.A5l.get();
                return new LinkedDevicesViewModel(C69773Yi.A00(this.A02.AdE), C116985rC.A02((C46022ax) this.A02.AHp.get()), (C69263Wi) this.A02.AG7.get(), r67, r77, (AnonymousClass4FS) this.A02.AbX.get());
            case 137:
                Application A003 = C69773Yi.A00(this.A02.AdE);
                C111525iE r48 = (C111525iE) this.A02.A00.A3d.get();
                C105085Tn r68 = (C105085Tn) this.A02.A00.AAO.get();
                return new LocationOptionPickerViewModel(A003, r48, (AnonymousClass4w0) this.A02.A00.A1g.get(), r68, (C54292oU) this.A02.AaB.get(), (AnonymousClass5ZR) this.A02.Aag.get(), (C105355Up) this.A02.A00.A1a.get());
            case 138:
                C56972sr r38 = (C56972sr) this.A02.AJW.get();
                C97174xk r69 = (C97174xk) this.A02.A00.A22.get();
                C64773Ex r78 = (C64773Ex) this.A02.A6O.get();
                AnonymousClass5ZU r85 = (AnonymousClass5ZU) this.A02.AaA.get();
                AnonymousClass5ZG r55 = (AnonymousClass5ZG) this.A02.A00.A21.get();
                return new MenuBottomSheetViewModel(r38, this.A02.A00.AJi(), r55, r69, r78, r85, (AnonymousClass1VX) this.A02.A07.get(), (C51932kc) this.A02.A1Z.get());
            case 139:
                Application A004 = C69773Yi.A00(this.A02.AdE);
                C56522s7 r79 = (C56522s7) this.A02.A8A.get();
                C116985rC A013 = C116985rC.A01();
                AnonymousClass2R8 r86 = (AnonymousClass2R8) this.A02.AWC.get();
                return new MessageDetailsViewModel(A004, A013, C116985rC.A01(), C116985rC.A01(), r79, r86, (AnonymousClass4FS) this.A02.AbX.get());
            case 140:
                C66543Lv r49 = (C66543Lv) this.A02.A71.get();
                C55832qz r610 = (C55832qz) this.A02.AAY.get();
                AnonymousClass2W0 r56 = (AnonymousClass2W0) this.A02.A00.A7Y.get();
                return new MessageRatingViewModel((C40272Fe) this.A02.A00.A7X.get(), r49, r56, r610, (AnonymousClass4FS) this.A02.AbX.get());
            case 141:
                return new MessageSelectionViewModel(this.A03.A3E, (C69263Wi) this.A02.AG7.get(), (C29431io) this.A02.ALT.get(), (C55832qz) this.A02.AAY.get());
            case 142:
                C69263Wi r39 = (C69263Wi) this.A02.AG7.get();
                C50452iC r97 = (C50452iC) this.A02.A00.ABs.get();
                C64773Ex r57 = (C64773Ex) this.A02.A6O.get();
                AnonymousClass1R1 r104 = (AnonymousClass1R1) this.A02.A56.get();
                C29301ib r410 = (C29301ib) this.A02.A57.get();
                C28891hw r87 = (C28891hw) this.A02.A6s.get();
                return new MuteDialogViewModel(r39, r410, r57, (C56612sH) this.A02.ASO.get(), (AnonymousClass33p) this.A02.Aaj.get(), r87, r97, r104, (AnonymousClass4FS) this.A02.AbX.get());
            case 143:
                C56502s5 r123 = (C56502s5) this.A02.A00.A5N.get();
                C28861ht r611 = (C28861ht) this.A02.AJH.get();
                C50152hi A0w = this.A03.A2S();
                C50232hq r115 = (C50232hq) this.A02.A00.A0A.get();
                AnonymousClass317 r88 = (AnonymousClass317) this.A02.ATf.get();
                AnonymousClass33p r58 = (AnonymousClass33p) this.A02.Aaj.get();
                C55092pm r105 = (C55092pm) this.A02.AZm.get();
                AnonymousClass33T r411 = (AnonymousClass33T) this.A02.Aaf.get();
                return A04((C116985rC) this.A02.AOl.get(), (C56612sH) this.A02.ASO.get(), (C54292oU) this.A02.AaB.get(), r411, r58, r611, A0w, r88, (C51072jE) this.A02.ATh.get(), r105, r115, r123, (AnonymousClass4FS) this.A02.AbX.get());
            case MediaCodecVideoEncoder.MIN_ENCODER_HEIGHT /*144*/:
                return new NewsletterGeosuspensionInfoViewModel((C64773Ex) this.A02.A6O.get(), (AnonymousClass1VX) this.A02.A07.get(), this.A03.A2J(), C69703Yb.A00());
            case 145:
                return new NewsletterRequestReviewViewModel(this.A03.A2J(), C69703Yb.A00());
            case 146:
                C56982ss r412 = (C56982ss) this.A02.A5B.get();
                return new NewsletterSuspensionInfoViewModel((C64773Ex) this.A02.A6O.get(), r412, (AnonymousClass1VX) this.A02.A07.get(), this.A03.A2J(), C69703Yb.A00());
            case 147:
                return new NewsletterUserReportsViewModel(this.A03.A2K(), new C40722Hm());
            case 148:
                return new OrderInfoViewModel(C69773Yi.A00(this.A02.AdE), (C56972sr) this.A02.AJW.get(), (C620733j) this.A02.AbU.get());
            case 149:
                return new OrientationViewModel((C106155Xv) this.A02.Aa5.get(), (C54292oU) this.A02.AaB.get(), this.A02.A00.A9g, this.A02.A00.A9h);
            case 150:
                C69263Wi r413 = (C69263Wi) this.A02.AG7.get();
                C55682qk r310 = (C55682qk) this.A02.A75.get();
                C56122rS r124 = (C56122rS) this.A02.A4F.get();
                C187958y5 r14 = (C187958y5) this.A02.ASM.get();
                C97174xk r710 = (C97174xk) this.A02.A00.A22.get();
                C64773Ex r98 = (C64773Ex) this.A02.A6O.get();
                AnonymousClass5ZU r116 = (AnonymousClass5ZU) this.A02.AaA.get();
                C56962sq r59 = (C56962sq) this.A02.A2b.get();
                C29421in r106 = (C29421in) this.A02.A6P.get();
                AnonymousClass3XG r89 = (AnonymousClass3XG) this.A02.A4M.get();
                return new ParticipantsListViewModel(r310, r413, r59, (C106155Xv) this.A02.Aa5.get(), r710, r89, r98, r106, r116, r124, (AnonymousClass1VX) this.A02.A07.get(), r14, (AnonymousClass4FS) this.A02.AbX.get());
            case 151:
                return new PaymentIncentiveViewModel((C56612sH) this.A02.ASO.get(), (AnonymousClass9U4) this.A02.AQC.get(), (C194969Vi) this.A02.APk.get(), (AnonymousClass4FS) this.A02.AbX.get());
            case 152:
                AnonymousClass9U4 r612 = (AnonymousClass9U4) this.A02.AQC.get();
                C203499no r711 = (C203499no) this.A02.A00.A1J.get();
                C29251iW r311 = (C29251iW) this.A02.API.get();
                C194529Tg r810 = (C194529Tg) this.A02.AKK.get();
                return new PaymentMerchantAccountViewModel(r311, (C1906999m) this.A02.APr.get(), (C29261iX) this.A02.APs.get(), r612, r711, r810, (AnonymousClass4FS) this.A02.AbX.get());
            case 153:
                return new PinInChatBannerViewModel((C69263Wi) this.A02.AG7.get(), (C56612sH) this.A02.ASO.get(), this.A02.ApS());
            case 154:
                return new PollCreatorViewModel((C621033m) this.A02.AZL.get(), (C56612sH) this.A02.ASO.get(), (AnonymousClass1VX) this.A02.A07.get(), (C617532c) this.A02.A00.A9D.get());
            case 155:
                C29431io r99 = (C29431io) this.A02.ALT.get();
                AnonymousClass3N0 r414 = (AnonymousClass3N0) this.A02.A9z.get();
                C50062hZ A0F = this.A02.A00.AIr();
                C56892sj r811 = (C56892sj) this.A02.AGm.get();
                return new PollResultsViewModel(A0F, r414, (C64773Ex) this.A02.A6O.get(), (AnonymousClass5ZU) this.A02.AaA.get(), (C54292oU) this.A02.AaB.get(), r811, r99, (C55832qz) this.A02.AAY.get());
            case 156:
                C55952rB r415 = (C55952rB) this.A02.ARK.get();
                C48212eX r613 = (C48212eX) this.A02.ARN.get();
                return new PrivacyDisclosureContainerViewModel((C69263Wi) this.A02.AG7.get(), r415, (C59992xp) this.A02.A00.A9I.get(), r613, (AnonymousClass4FS) this.A02.AbX.get());
            case 157:
                Application A005 = C69773Yi.A00(this.A02.AdE);
                C48922fh A1Z = this.A02.Ai7();
                AnonymousClass7OY A08 = this.A03.A1d();
                ProductBottomSheetViewModel productBottomSheetViewModel = r11;
                AnonymousClass5MK A07 = this.A03.A1c();
                C104095Pq A032 = this.A03.A1Y();
                C49732h0 r235 = (C49732h0) this.A01.A02.get();
                C106945aQ r254 = (C106945aQ) this.A03.A0K.get();
                AnonymousClass5Y9 r203 = (AnonymousClass5Y9) this.A02.A4Y.get();
                C181798nL r213 = (C181798nL) this.A03.A1g.get();
                C105145Tt r193 = (C105145Tt) this.A02.A4V.get();
                C105405Uu r183 = (C105405Uu) this.A02.A4W.get();
                ProductBottomSheetViewModel productBottomSheetViewModel2 = new ProductBottomSheetViewModel(A005, (C56972sr) this.A02.AJW.get(), (AnonymousClass5T7) this.A02.A4a.get(), (C29201iR) this.A02.A4U.get(), A032, (C181728nE) this.A03.A1f.get(), r183, r193, r203, r213, A07, r235, A08, r254, (AnonymousClass5X1) this.A02.A3p.get(), A1Z, (C620733j) this.A02.AbU.get(), (C103115Lp) this.A02.A00.A8P.get());
                return productBottomSheetViewModel2;
            case 158:
                return new AnonymousClass4J1(this, 1);
            case 159:
                return new C106945aQ((C56972sr) this.A02.AJW.get(), (C57162tC) this.A02.AaV.get(), (C56662sM) this.A02.AaX.get());
            case 160:
                return new AnonymousClass4J3(this, 1);
            case 161:
                return new QuickActionBarViewModel((C64353Dd) this.A02.A00.A9m.get(), C72343dZ.A00(this.A02.A6O), C72343dZ.A00(this.A02.A00.A9l), C72343dZ.A00(this.A02.A07), C72343dZ.A00(this.A03.A2d), C69723Yd.A00(), C69693Ya.A00());
            case 162:
                return new C102105Hm(C72343dZ.A00(this.A02.AVn));
            case 163:
                C56972sr r312 = (C56972sr) this.A02.AJW.get();
                C56982ss r614 = (C56982ss) this.A02.A5B.get();
                C620633i r416 = (C620633i) this.A02.AYG.get();
                C58742vk r107 = (C58742vk) this.A02.ATH.get();
                C60152y5 r910 = (C60152y5) this.A02.AVn.get();
                return new ReactionsTrayViewModel(r312, r416, (C56612sH) this.A02.ASO.get(), r614, (AnonymousClass1VX) this.A02.A07.get(), (AnonymousClass5U1) this.A02.A00.A7W.get(), r910, r107, (AnonymousClass4FS) this.A02.AbX.get());
            case 164:
                return new RequestPhoneNumberViewModel((C621033m) this.A02.AZL.get(), (C56662sM) this.A02.AaX.get(), (AnonymousClass311) this.A02.Aab.get(), (AnonymousClass5N2) this.A02.AbB.get(), (C66433Lk) this.A02.AEu.get(), (AnonymousClass4FS) this.A02.AbX.get());
            case 165:
                return new RestoreFromBackupViewModel((C64393Dh) this.A02.AS1.get(), (AnonymousClass0NL) this.A02.A00.AAG.get(), (C625835r) this.A02.AM8.get(), (AnonymousClass4FS) this.A02.AbX.get());
            case 166:
                C56972sr r313 = (C56972sr) this.A02.AJW.get();
                C54292oU r108 = (C54292oU) this.A02.AaB.get();
                AnonymousClass49P A1U = this.A02.Ai2();
                C97174xk r510 = (C97174xk) this.A02.A00.A22.get();
                C116655qe r911 = (C116655qe) this.A02.A00.ABw.get();
                C73853gB A006 = C69693Ya.A00();
                C112515jr A1X = this.A02.Ai5();
                C97074xa r812 = (C97074xa) this.A02.A00.ABy.get();
                return new ScreenShareViewModel(r313, A1U, r510, (AnonymousClass5TU) this.A02.A00.AAL.get(), A1X, r812, r911, r108, (AnonymousClass1VX) this.A02.A07.get(), (VoipCameraManager) this.A02.Aa0.get(), A006);
            case 167:
                C69263Wi r813 = (C69263Wi) this.A02.AG7.get();
                C59452ww A13 = this.A03.A2Z();
                C54992pc A0c = this.A03.A25();
                AnonymousClass33p r117 = (AnonymousClass33p) this.A02.Aaj.get();
                C73853gB A007 = C69703Yb.A00();
                C29441ip r109 = (C29441ip) this.A02.A68.get();
                C56352rq r912 = (C56352rq) this.A02.ATd.get();
                AnonymousClass2OA A0e = this.A03.A27();
                C618332l A0d = this.A03.A26();
                C33091sQ r125 = (C33091sQ) this.A02.A00.A02.get();
                AnonymousClass2GV r214 = (AnonymousClass2GV) this.A02.ATp.get();
                C41602Kw r184 = (C41602Kw) this.A02.A00.A5M.get();
                return new SearchFunStickersViewModel(r813, r912, r109, r117, r125, (AnonymousClass1VX) this.A02.A07.get(), (AnonymousClass4FV) this.A02.ASY.get(), (C48092eK) this.A02.AYV.get(), A0c, (C54872pQ) this.A02.A00.A5K.get(), r184, A0d, A0e, r214, (C56932sn) this.A02.AXB.get(), (WebpUtils) this.A02.AbM.get(), A13, A007);
            case 168:
                return new SelectedImageAlbumViewModel((C29431io) this.A02.ALT.get(), (C55832qz) this.A02.AAY.get());
            case 169:
                return new SettingsAccountViewModel((C97034xW) this.A02.A00.A2R.get(), (C42712Pf) this.A02.AHC.get(), (AnonymousClass4FS) this.A02.AbX.get());
            case 170:
                return new SettingsChatViewModel((C625835r) this.A02.AM8.get(), (AnonymousClass4FS) this.A02.AbX.get());
            case 171:
                return A05((C69263Wi) this.A02.AG7.get(), this.A02.Ai2(), (AnonymousClass310) this.A02.A9r.get(), (AnonymousClass1VX) this.A02.A07.get(), (AnonymousClass3Ci) this.A02.A00.A9r.get(), (AnonymousClass4FS) this.A02.AbX.get());
            case 172:
                AnonymousClass0WN r314 = (AnonymousClass0WN) this.A02.A8q.get();
                C625835r r118 = (C625835r) this.A02.AM8.get();
                C06260Ww r615 = (C06260Ww) this.A02.AG9.get();
                AnonymousClass33p r1010 = (AnonymousClass33p) this.A02.Aaj.get();
                AnonymousClass0WF r417 = (AnonymousClass0WF) this.A02.A00.A0q.get();
                C29441ip r913 = (C29441ip) this.A02.A68.get();
                C10240hc r511 = (C10240hc) this.A02.AG8.get();
                C10230hb r814 = (C10230hb) this.A02.AGC.get();
                return A02((C69263Wi) this.A02.AG7.get(), r314, r417, r511, r615, (AnonymousClass0QJ) this.A02.AGB.get(), r814, r913, r1010, r118, (AnonymousClass4FS) this.A02.AbX.get());
            case 173:
                return new SettingsPasskeysViewModel((AnonymousClass33p) this.A02.Aaj.get(), (AnonymousClass4BG) this.A03.A2U.get(), (AnonymousClass4BH) this.A03.A2V.get(), (PasskeyServerApiImpl) this.A02.A00.A0u.get());
            case 174:
                return new C123856Aa(this, 1);
            case 175:
                return new AnonymousClass4JO(this, 1);
            case MediaCodecVideoEncoder.MIN_ENCODER_WIDTH /*176*/:
                AnonymousClass5WT A82 = this.A02.Aqs();
                return new SettingsPrivacyCameraEffectsViewModel((CallAvatarFLMConsentManager) this.A02.A00.A20.get(), this.A02.A00.AJi(), (C103425Mx) this.A02.A48.get(), A82, C69703Yb.A00());
            case 177:
                return new SettingsSetupUserProxyViewModel((C60442yZ) this.A02.AZc.get());
            case 178:
                C69263Wi r315 = (C69263Wi) this.A02.AG7.get();
                AnonymousClass33S r712 = (AnonymousClass33S) this.A02.AUY.get();
                C66523Lt r616 = (C66523Lt) this.A02.ALF.get();
                AnonymousClass2WY r815 = (AnonymousClass2WY) this.A03.A36.get();
                C60442yZ r1011 = (C60442yZ) this.A02.AZc.get();
                C45092Yq A10 = this.A03.A2W();
                return new SettingsUserProxyViewModel(r315, (C54392oe) this.A02.ANP.get(), (AnonymousClass1VX) this.A02.A07.get(), r616, r712, r815, this.A02.AqI(), r1011, A10, (AnonymousClass3Ci) this.A02.A00.A9r.get(), (AnonymousClass4FS) this.A02.AbX.get());
            case 179:
                return new AnonymousClass2WY((AnonymousClass4FV) this.A02.ASY.get());
            case 180:
                return new SharePhoneNumberRowViewModel((C56972sr) this.A02.AJW.get(), (C64773Ex) this.A02.A6O.get(), (AnonymousClass5ZU) this.A02.AaA.get(), (AnonymousClass311) this.A02.Aab.get(), (AnonymousClass4FS) this.A02.AbX.get());
            case 181:
                return new SharePhoneNumberViewModel((C56972sr) this.A02.AJW.get(), (C621033m) this.A02.AZL.get(), (AnonymousClass5N2) this.A02.AbB.get(), (C66433Lk) this.A02.AEu.get());
            case 182:
                return new ShareProductViewModel((C105405Uu) this.A02.A4W.get());
            case 183:
                return A06((C29441ip) this.A02.A68.get(), C72343dZ.A00(this.A02.A2o));
            case 184:
                return new ShopsProductPreviewFragmentViewModel((AnonymousClass4FV) this.A02.ASY.get(), (C1227565p) this.A02.AW0.get());
            case 185:
                return new StatusArchiveSettingsViewModel(this.A03.A3E, (C55152pt) this.A02.AWi.get(), this.A02.Aqu());
            case 186:
                AnonymousClass2GI r194 = (AnonymousClass2GI) this.A02.A00.A4E.get();
                AnonymousClass2GL r185 = (AnonymousClass2GL) this.A02.A00.ABO.get();
                AnonymousClass1VX r17 = (AnonymousClass1VX) this.A02.A07.get();
                AnonymousClass4FV r16 = (AnonymousClass4FV) this.A02.ASY.get();
                C45962ar A0Z = this.A03.A22();
                AnonymousClass2GE A0U = this.A03.A1x();
                C73853gB A008 = C69703Yb.A00();
                AnonymousClass2Q1 A0V = this.A03.A1y();
                C45532aA A5I = this.A02.A00.APg();
                AnonymousClass2GK A0a = this.A03.A23();
                AnonymousClass4FV r352 = r16;
                C51932kc r362 = (C51932kc) this.A02.A1Z.get();
                AnonymousClass2QP r372 = (AnonymousClass2QP) this.A03.A06.get();
                C55862r2 r382 = (C55862r2) this.A02.A1T.get();
                C29361ih r40 = (C29361ih) this.A02.AX3.get();
                C49252gE r41 = (C49252gE) this.A02.A00.ABM.get();
                C58912w1 r422 = (C58912w1) this.A02.A00.AB6.get();
                C51092jG r432 = (C51092jG) this.A02.AZB.get();
                C49942hL r442 = (C49942hL) this.A03.A0J.get();
                AnonymousClass2GI r264 = r194;
                C45952aq r274 = (C45952aq) this.A02.A00.A4F.get();
                C41562Ks r284 = (C41562Ks) this.A02.A00.AAP.get();
                AnonymousClass2TK r294 = (AnonymousClass2TK) this.A03.A2z.get();
                AnonymousClass2GL r322 = r185;
                C50302hx r332 = (C50302hx) this.A02.A00.A5a.get();
                AnonymousClass1VX r342 = r17;
                return new StickerExpressionsViewModel((AnonymousClass33p) this.A02.Aaj.get(), (C620733j) this.A02.AbU.get(), A0U, A0V, (EmojiSearchProvider) this.A02.A00.A40.get(), r264, r274, r284, r294, A0Z, A0a, r322, r332, r342, r352, r362, r372, r382, A5I, r40, r41, r422, r432, r442, A008, C69713Yc.A00());
            case 187:
                return new AnonymousClass2TK((AnonymousClass2O1) this.A01.A01.get(), this.A03.A2X(), this.A02.A00.APk(), (C58912w1) this.A02.A00.AB6.get(), C69713Yc.A00());
            case 188:
                return new SupportBkLayoutViewModel((C54322oX) this.A02.AXY.get(), C72343dZ.A00(this.A02.A2o));
            case 189:
                return new SurveyViewModel((C28681hb) this.A02.AXg.get());
            case 190:
                C56972sr r418 = (C56972sr) this.A02.AJW.get();
                return new ToSGatingViewModel(this.A02.A00.AId(), r418, (C56152rV) this.A02.AIn.get(), (AnonymousClass1VX) this.A02.A07.get(), (C29101iH) this.A02.AYt.get(), (C69183Wa) this.A02.AYu.get());
            case 191:
                C56972sr r316 = (C56972sr) this.A02.AJW.get();
                C64773Ex r419 = (C64773Ex) this.A02.A6O.get();
                C620733j r617 = (C620733j) this.A02.AbU.get();
                C55422qK r816 = (C55422qK) this.A02.AUG.get();
                C29281iZ r1012 = (C29281iZ) this.A02.AUD.get();
                return new UpcomingActivityViewModel(r316, r419, (C56612sH) this.A02.ASO.get(), r617, (C56892sj) this.A02.AGm.get(), r816, (C29241iV) this.A02.AGn.get(), r1012, (AnonymousClass4FS) this.A02.AbX.get());
            case 192:
                return new UpdatesAdvertiseViewModel(this.A03.A3E, C116985rC.A01(), (AnonymousClass33p) this.A02.Aaj.get(), (AnonymousClass5Z6) this.A02.A00.ABA.get());
            case 193:
                return new UsernameViewModel((C56972sr) this.A02.AJW.get(), this.A02.A00.AQ1());
            case 194:
                return new VariantsCarouselFragmentViewModel(this.A03.A1b(), (AnonymousClass1VX) this.A02.A07.get());
            case 195:
                AnonymousClass1VX r195 = (AnonymousClass1VX) this.A02.A07.get();
                C56972sr r186 = (C56972sr) this.A02.AJW.get();
                C54292oU r172 = (C54292oU) this.A02.AaB.get();
                AnonymousClass4FS r162 = (AnonymousClass4FS) this.A02.AbX.get();
                C52412lR A3g = this.A02.AkL();
                AnonymousClass5NO A0j2 = this.A02.A00.AJi();
                AnonymousClass4C1 A86 = this.A02.A00.A9g;
                AnonymousClass4C1 A87 = this.A02.A00.A9h;
                AnonymousClass4C1 A88 = this.A02.A00.A9i;
                AnonymousClass5QX A0K = C88874aw.A0J();
                AnonymousClass5TU r275 = (AnonymousClass5TU) this.A02.A00.AAL.get();
                C118405tU r285 = (C118405tU) this.A02.A00.A8Y.get();
                C91444jd r295 = (C91444jd) this.A02.A00.AAS.get();
                C116655qe r303 = (C116655qe) this.A02.A00.ABw.get();
                C64773Ex r31 = (C64773Ex) this.A02.A6O.get();
                AnonymousClass5ZU r323 = (AnonymousClass5ZU) this.A02.AaA.get();
                C44382Vv r333 = (C44382Vv) this.A02.A6u.get();
                C54292oU r343 = r172;
                return new VoiceChatGridViewModel((C111095hX) this.A02.A0a.get(), r186, A0j2, (C97174xk) this.A02.A00.A22.get(), (AnonymousClass8GN) this.A02.A00.A9V.get(), A0K, r275, r285, r295, r303, r31, r323, r333, r343, (C620733j) this.A02.AbU.get(), (C56892sj) this.A02.AGm.get(), A3g, r195, (C66493Lq) this.A02.AGL.get(), (C56572sD) this.A02.AWF.get(), (C187958y5) this.A02.ASM.get(), r162, (VoipCameraManager) this.A02.Aa0.get(), A86, A87, A88);
            case 196:
                return new WaBkExtensionsLayoutViewModel((C29441ip) this.A02.A68.get(), (C57162tC) this.A02.AaV.get(), (AnonymousClass1VX) this.A02.A07.get(), C72343dZ.A00(this.A02.A2o));
            case 197:
                C66433Lk r713 = (C66433Lk) this.A02.AEu.get();
                C59482wz r317 = (C59482wz) this.A02.A2n.get();
                C55832qz r618 = (C55832qz) this.A02.AAY.get();
                return new WaExtensionsNavBarViewModel(r317, (C56422rx) this.A02.AZn.get(), (AnonymousClass1VX) this.A02.A07.get(), r618, r713, (AnonymousClass4FS) this.A02.AbX.get());
            case 198:
                C56162rW A40 = this.A02.Akc();
                C54402of r914 = (C54402of) this.A02.AaC.get();
                C56612sH r817 = (C56612sH) this.A02.ASO.get();
                C23651Ud A45 = this.A02.Akh();
                C73853gB A009 = C69703Yb.A00();
                C29441ip r714 = (C29441ip) this.A02.A68.get();
                FlowsWebViewDataRepository A0b = this.A03.A24();
                return new WaFlowsViewModel((C621033m) this.A02.AZL.get(), (C620433g) this.A02.A3v.get(), r714, r817, r914, (AnonymousClass33p) this.A02.Aaj.get(), (C66543Lv) this.A02.A71.get(), (C59652xG) this.A02.A9o.get(), A40, this.A02.Akg(), A45, A0b, (AnonymousClass1VX) this.A02.A07.get(), (AnonymousClass4FS) this.A02.AbX.get(), A009);
            case 199:
                return new WfacBanViewModel((AnonymousClass33T) this.A02.Aaf.get(), (AnonymousClass317) this.A02.ATf.get(), (AnonymousClass2XB) this.A02.AbN.get());
            default:
                throw new AssertionError(this.A00);
        }
    }
}
