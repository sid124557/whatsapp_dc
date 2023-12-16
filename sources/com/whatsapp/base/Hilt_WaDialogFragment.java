package com.whatsapp.base;

import X.AnonymousClass002;
import X.AnonymousClass1R1;
import X.AnonymousClass25D;
import X.AnonymousClass29z;
import X.AnonymousClass2QX;
import X.AnonymousClass2R8;
import X.AnonymousClass2SD;
import X.AnonymousClass318;
import X.AnonymousClass33O;
import X.AnonymousClass3DY;
import X.AnonymousClass3XI;
import X.AnonymousClass487;
import X.AnonymousClass4GJ;
import X.AnonymousClass5TW;
import X.AnonymousClass5UK;
import X.AnonymousClass5VY;
import X.AnonymousClass5WY;
import X.AnonymousClass5X8;
import X.AnonymousClass5XU;
import X.AnonymousClass5Z5;
import X.AnonymousClass7SF;
import X.AnonymousClass7Vq;
import X.C105275Ug;
import X.C105975Xd;
import X.C106095Xp;
import X.C106175Xx;
import X.C106995aW;
import X.C107695bk;
import X.C112415jh;
import X.C113995mK;
import X.C116885r1;
import X.C116985rC;
import X.C1230066r;
import X.C17190ui;
import X.C18270x1;
import X.C18280x3;
import X.C18300x5;
import X.C18310x6;
import X.C18320x8;
import X.C18330xA;
import X.C184988ss;
import X.C187958y5;
import X.C29111iI;
import X.C39642Ct;
import X.C42662Pa;
import X.C45942ap;
import X.C47872dy;
import X.C48042eF;
import X.C48952fk;
import X.C49022fr;
import X.C49932hK;
import X.C50252hs;
import X.C50382i5;
import X.C53202mi;
import X.C54122oD;
import X.C54412og;
import X.C55422qK;
import X.C55802qw;
import X.C56352rq;
import X.C56422rx;
import X.C56542sA;
import X.C56762sW;
import X.C56912sl;
import X.C56932sn;
import X.C56962sq;
import X.C57162tC;
import X.C59292wg;
import X.C60892zL;
import X.C61072zf;
import X.C613130e;
import X.C619933b;
import X.C621233o;
import X.C64333Db;
import X.C65203Gp;
import X.C66653Mg;
import X.C66663Mh;
import X.C72343dZ;
import X.C88744aj;
import X.C88854au;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.DisplayExceptionDialogFactory$ClockWrongDialogFragment;
import com.whatsapp.DisplayExceptionDialogFactory$ContactBlockedDialogFragment;
import com.whatsapp.DisplayExceptionDialogFactory$DoNotShareCodeDialogFragment;
import com.whatsapp.DisplayExceptionDialogFactory$SoftwareAboutToExpireDialogFragment;
import com.whatsapp.DisplayExceptionDialogFactory$SoftwareExpiredDialogFragment;
import com.whatsapp.Hilt_BaseMessageDialogFragment;
import com.whatsapp.Hilt_ContentDistributionRecipientsPickerActivity_DiscardChangesConfirmationDialogFragment;
import com.whatsapp.Hilt_DisplayExceptionDialogFactory_ClockWrongDialogFragment;
import com.whatsapp.Hilt_DisplayExceptionDialogFactory_ContactBlockedDialogFragment;
import com.whatsapp.Hilt_DisplayExceptionDialogFactory_DoNotShareCodeDialogFragment;
import com.whatsapp.Hilt_DisplayExceptionDialogFactory_SoftwareAboutToExpireDialogFragment;
import com.whatsapp.Hilt_DisplayExceptionDialogFactory_SoftwareExpiredDialogFragment;
import com.whatsapp.Hilt_DisplayExceptionDialogFactory_UnsupportedDeviceDialogFragment;
import com.whatsapp.Hilt_LegacyMessageDialogFragment;
import com.whatsapp.Hilt_RevokeLinkConfirmationDialogFragment;
import com.whatsapp.Hilt_SimpleExternalStorageStateCallback_PermissionDeniedDialogFragment;
import com.whatsapp.Hilt_SimpleExternalStorageStateCallback_SDCardUnavailableDialogFragment;
import com.whatsapp.Hilt_SingleSelectionDialogFragment;
import com.whatsapp.LegacyMessageDialogFragment;
import com.whatsapp.RevokeLinkConfirmationDialogFragment;
import com.whatsapp.SimpleExternalStorageStateCallback$SDCardUnavailableDialogFragment;
import com.whatsapp.account.delete.Hilt_DeleteAccountFeedback_ChangeNumberMessageDialogFragment;
import com.whatsapp.authentication.Hilt_SetupDeviceAuthDialog;
import com.whatsapp.authentication.Hilt_VerifyTwoFactorAuthCodeDialogFragment;
import com.whatsapp.authentication.SetupDeviceAuthDialog;
import com.whatsapp.authentication.VerifyTwoFactorAuthCodeDialogFragment;
import com.whatsapp.avatar.profilephoto.Hilt_AvatarProfilePhotoErrorDialog;
import com.whatsapp.biz.product.view.fragment.Hilt_ProductReportReasonDialogFragment;
import com.whatsapp.biz.product.view.fragment.Hilt_ReportProductDialogFragment;
import com.whatsapp.biz.product.view.fragment.ProductReportReasonDialogFragment;
import com.whatsapp.blockbusiness.blockreasonlist.BlockReasonListFragment;
import com.whatsapp.blockbusiness.blockreasonlist.Hilt_BlockReasonListFragment;
import com.whatsapp.blocklist.Hilt_UnblockDialogFragment;
import com.whatsapp.businessdirectory.view.custom.ClearLocationDialogFragment;
import com.whatsapp.businessdirectory.view.custom.Hilt_ClearLocationDialogFragment;
import com.whatsapp.calling.avatar.view.Hilt_FLMConsentErrorDialogFragment;
import com.whatsapp.calling.backwardcompat.BackwardCompatDialog;
import com.whatsapp.calling.backwardcompat.Hilt_BackwardCompatDialog;
import com.whatsapp.calling.callhistory.view.CallsHistoryClearCallLogDialogFragment;
import com.whatsapp.calling.callhistory.view.Hilt_CallsHistoryClearCallLogDialogFragment;
import com.whatsapp.calling.fragment.CallConfirmationFragment;
import com.whatsapp.calling.fragment.Hilt_CallConfirmationFragment;
import com.whatsapp.calling.spam.CallSpamActivity;
import com.whatsapp.calling.spam.Hilt_CallSpamActivity_ReportSpamOrBlockDialogFragment;
import com.whatsapp.calling.views.AppSettingsWarningDialogFragment;
import com.whatsapp.calling.views.Hilt_AppSettingsWarningDialogFragment;
import com.whatsapp.calling.views.Hilt_JoinableEducationDialogFragment;
import com.whatsapp.chatinfo.ChatMediaVisibilityDialog;
import com.whatsapp.chatinfo.Hilt_ChatMediaVisibilityDialog;
import com.whatsapp.chatinfo.Hilt_ChatMediaVisibilityOffDialog;
import com.whatsapp.chatinfo.Hilt_ViewPhotoOrStatusDialogFragment;
import com.whatsapp.chatinfo.fragment.EncryptionExplanationDialogFragment;
import com.whatsapp.chatinfo.fragment.Hilt_EncryptionExplanationDialogFragment;
import com.whatsapp.chatlock.Hilt_ChatNowLockedDialogFragment;
import com.whatsapp.chatlock.Hilt_LeakyCompanionDialogFragment;
import com.whatsapp.chatlock.dialogs.ChatLockForgotSecretCodeContinueUnlockClearDialog;
import com.whatsapp.chatlock.dialogs.ChatLockForgotSecretCodeUnlockClearDialog;
import com.whatsapp.chatlock.dialogs.ChatLockPrivacySettingsUnlockClearDialog;
import com.whatsapp.chatlock.dialogs.Hilt_ChatLockForgotSecretCodeContinueUnlockClearDialog;
import com.whatsapp.chatlock.dialogs.Hilt_ChatLockForgotSecretCodeUnlockClearDialog;
import com.whatsapp.chatlock.dialogs.Hilt_ChatLockPrivacySettingsUnlockClearDialog;
import com.whatsapp.chatlock.dialogs.Hilt_ChatsAreLockedDialogFragment;
import com.whatsapp.chatlock.dialogs.Hilt_ClearLockedChatsDialogFragment;
import com.whatsapp.chatlock.dialogs.Hilt_UnarchiveForQuickLockDialogFragment;
import com.whatsapp.community.CommunityConfirmLinkDialogFragment;
import com.whatsapp.community.CommunityDeleteDialogFragment;
import com.whatsapp.community.CommunityPendingSuggestionsConfirmationDialog;
import com.whatsapp.community.Hilt_CommunityConfirmLinkDialogFragment;
import com.whatsapp.community.Hilt_CommunityDeleteDialogFragment;
import com.whatsapp.community.Hilt_CommunityPendingSuggestionsConfirmationDialog;
import com.whatsapp.community.deactivate.DeactivateCommunityConfirmationFragment;
import com.whatsapp.community.deactivate.Hilt_DeactivateCommunityConfirmationFragment;
import com.whatsapp.communitysuspend.CommunitySuspendDialogFragment;
import com.whatsapp.communitysuspend.Hilt_CommunitySuspendDialogFragment;
import com.whatsapp.companiondevice.Hilt_LinkedDevicesDetailDialogFragment;
import com.whatsapp.companiondevice.Hilt_WifiSpeedBumpDialogFragment;
import com.whatsapp.companiondevice.LinkedDevicesDetailDialogFragment;
import com.whatsapp.contact.picker.Hilt_PhoneNumberSelectionDialog;
import com.whatsapp.contact.picker.PhoneNumberSelectionDialog;
import com.whatsapp.contact.picker.invite.Hilt_InviteToGroupCallConfirmationFragment;
import com.whatsapp.contact.picker.invite.InviteToGroupCallConfirmationFragment;
import com.whatsapp.conversation.ChangeNumberNotificationDialogFragment;
import com.whatsapp.conversation.CustomStickerConfirmationDialog;
import com.whatsapp.conversation.Hilt_CapturePictureOrVideoDialogFragment;
import com.whatsapp.conversation.Hilt_ChangeNumberNotificationDialogFragment;
import com.whatsapp.conversation.Hilt_CustomStickerConfirmationDialog;
import com.whatsapp.conversation.conversationrow.BusinessTransitionInfoDialogFragment;
import com.whatsapp.conversation.conversationrow.ChatWithBusinessInDirectoryDialogFragment;
import com.whatsapp.conversation.conversationrow.ConversationRow$ConversationRowDialogFragment;
import com.whatsapp.conversation.conversationrow.ConversationRowContact$MessageSharedContactDialogFragment;
import com.whatsapp.conversation.conversationrow.DeviceUpdateDialogFragment;
import com.whatsapp.conversation.conversationrow.EncryptionChangeDialogFragment;
import com.whatsapp.conversation.conversationrow.Hilt_BusinessTransitionInfoDialogFragment;
import com.whatsapp.conversation.conversationrow.Hilt_ChatWithBusinessInDirectoryDialogFragment;
import com.whatsapp.conversation.conversationrow.Hilt_ConversationRowContact_MessageSharedContactDialogFragment;
import com.whatsapp.conversation.conversationrow.Hilt_ConversationRow_ConversationRowDialogFragment;
import com.whatsapp.conversation.conversationrow.Hilt_DeviceUpdateDialogFragment;
import com.whatsapp.conversation.conversationrow.Hilt_EncryptionChangeDialogFragment;
import com.whatsapp.conversation.conversationrow.Hilt_IdentityChangeDialogFragment;
import com.whatsapp.conversation.conversationrow.Hilt_SecurityNotificationDialogFragment;
import com.whatsapp.conversation.conversationrow.Hilt_VerifiedBusinessInfoDialogFragment;
import com.whatsapp.conversation.conversationrow.IdentityChangeDialogFragment;
import com.whatsapp.conversation.conversationrow.SecurityNotificationDialogFragment;
import com.whatsapp.conversation.conversationrow.VerifiedBusinessInfoDialogFragment;
import com.whatsapp.conversation.conversationrow.googlesearch.GoogleSearchDialogFragment;
import com.whatsapp.conversation.conversationrow.googlesearch.Hilt_GoogleSearchDialogFragment;
import com.whatsapp.conversation.conversationrow.message.Hilt_StarredMessagesActivity_UnstarAllDialogFragment;
import com.whatsapp.datasharingdisclosure.ui.Hilt_ConsumerMarketingDisclosureFullscreenFragment;
import com.whatsapp.dialogs.DeleteOrArchiveChatDialog;
import com.whatsapp.dialogs.Hilt_CreateOrAddToContactsDialog;
import com.whatsapp.dialogs.Hilt_DeleteOrArchiveChatDialog;
import com.whatsapp.dialogs.Hilt_ProgressDialogFragment;
import com.whatsapp.dialogs.Hilt_PromptDialogFragment;
import com.whatsapp.dialogs.Hilt_UnrecoverableErrorDialogFragment;
import com.whatsapp.dialogs.PromptDialogFragment;
import com.whatsapp.dialogs.UnrecoverableErrorDialogFragment;
import com.whatsapp.ephemeral.ChangeEphemeralSettingsDialog;
import com.whatsapp.ephemeral.Hilt_ChangeEphemeralSettingsDialog;
import com.whatsapp.events.EventCreationVideoCallDialog;
import com.whatsapp.events.Hilt_EventCreationVideoCallDialog;
import com.whatsapp.expressionstray.avatars.AvatarExpressionsFragment;
import com.whatsapp.expressionstray.avatars.Hilt_AvatarExpressionsFragment;
import com.whatsapp.expressionstray.gifs.GifExpressionsFragment;
import com.whatsapp.expressionstray.gifs.Hilt_GifExpressionsFragment;
import com.whatsapp.expressionstray.stickers.Hilt_StickerExpressionsFragment;
import com.whatsapp.expressionstray.stickers.StickerExpressionsFragment;
import com.whatsapp.group.Hilt_ConfirmApproveAllPendingRequestsDialogFragment;
import com.whatsapp.group.Hilt_GroupChatInfoActivity_DescriptionConflictDialogFragment;
import com.whatsapp.group.reporttoadmin.Hilt_ConfirmClearAdminReviewsDialogFragment;
import com.whatsapp.groupenforcements.ui.CreateGroupSuspendDialog;
import com.whatsapp.groupenforcements.ui.Hilt_CreateGroupSuspendDialog;
import com.whatsapp.growthlock.Hilt_InviteLinkUnavailableDialogFragment;
import com.whatsapp.growthlock.InviteLinkUnavailableDialogFragment;
import com.whatsapp.invites.Hilt_NobodyDeprecatedDialogFragment;
import com.whatsapp.invites.Hilt_PromptSendGroupInviteDialogFragment;
import com.whatsapp.invites.Hilt_RevokeInviteDialogFragment;
import com.whatsapp.invites.PromptSendGroupInviteDialogFragment;
import com.whatsapp.invites.RevokeInviteDialogFragment;
import com.whatsapp.location.Hilt_StopLiveLocationDialogFragment;
import com.whatsapp.location.StopLiveLocationDialogFragment;
import com.whatsapp.mediaview.Hilt_RevokeNuxDialogFragment;
import com.whatsapp.mediaview.RevokeNuxDialogFragment;
import com.whatsapp.mute.ui.Hilt_MuteDialogFragment;
import com.whatsapp.mute.ui.MuteDialogFragment;
import com.whatsapp.newsletter.multiadmin.DismissNewsletterAdminDialogFragment;
import com.whatsapp.newsletter.multiadmin.Hilt_DismissNewsletterAdminDialogFragment;
import com.whatsapp.newsletter.multiadmin.Hilt_RevokeNewsletterAdminInviteDialogFragment;
import com.whatsapp.newsletter.ui.delete.Hilt_DeleteConfirmationDialogFragment;
import com.whatsapp.phonematching.ConnectionUnavailableDialogFragment;
import com.whatsapp.phonematching.Hilt_ConnectionProgressDialogFragment;
import com.whatsapp.phonematching.Hilt_ConnectionUnavailableDialogFragment;
import com.whatsapp.picker.search.Hilt_PickerSearchDialogFragment;
import com.whatsapp.pininchat.expirationDialog.Hilt_PinInChatExpirationDialogFragment;
import com.whatsapp.product.newsletterenforcements.enforcedmessages.DeleteEnforcedMessageDialogFragment;
import com.whatsapp.product.newsletterenforcements.enforcedmessages.Hilt_DeleteEnforcedMessageDialogFragment;
import com.whatsapp.product.reporttoadmin.Hilt_ReportToAdminDialogFragment;
import com.whatsapp.product.reporttoadmin.ReportToAdminDialogFragment;
import com.whatsapp.profile.Hilt_ResetGroupPhoto_ConfirmDialogFragment;
import com.whatsapp.profile.Hilt_ResetPhoto_ConfirmDialogFragment;
import com.whatsapp.profile.ResetPhoto;
import com.whatsapp.qrcode.Hilt_QrEducationDialogFragment;
import com.whatsapp.qrcode.contactqr.Hilt_ErrorDialogFragment;
import com.whatsapp.qrcode.contactqr.Hilt_WebCodeDialogFragment;
import com.whatsapp.qrcode.contactqr.WebCodeDialogFragment;
import com.whatsapp.registration.Hilt_SelectPhoneNumberDialog;
import com.whatsapp.registration.Hilt_VerifyTwoFactorAuth_forgotPinDialog;
import com.whatsapp.registration.Hilt_VerifyTwoFactorAuth_resetAccountDialog;
import com.whatsapp.registration.SelectPhoneNumberDialog;
import com.whatsapp.registration.accountdefence.ui.DeviceConfirmationRegAlertDialogFragment;
import com.whatsapp.registration.accountdefence.ui.Hilt_DeviceConfirmationRegAlertDialogFragment;
import com.whatsapp.registration.accountdefence.ui.Hilt_OldDeviceMoveAccountConfirmationDialogFragment;
import com.whatsapp.report.Hilt_DeleteReportConfirmationDialogFragment;
import com.whatsapp.report.Hilt_DownloadLargeNewsletterReportFileConfirmationDialogFragment;
import com.whatsapp.report.Hilt_ShareReportConfirmationDialogFragment;
import com.whatsapp.settings.Hilt_MultiSelectionDialogFragment;
import com.whatsapp.settings.Hilt_PhotoQualityConfirmationDialogFragment;
import com.whatsapp.settings.Hilt_SettingsCompanionLogoutDialog;
import com.whatsapp.settings.Hilt_SettingsNetworkUsage_ResetUsageConfirmationDialog;
import com.whatsapp.settings.Hilt_VideoQualityConfirmationDialogFragment;
import com.whatsapp.settings.SettingsCompanionLogoutDialog;
import com.whatsapp.settings.chat.wallpaper.Hilt_WallpaperDownloadFailedDialogFragment;
import com.whatsapp.settings.chat.wallpaper.Hilt_WallpaperSetConfirmationDialogFragment;
import com.whatsapp.status.Hilt_StatusConfirmMuteDialogFragment;
import com.whatsapp.status.Hilt_StatusConfirmUnmuteDialogFragment;
import com.whatsapp.status.Hilt_StatusDeleteDialogFragment;
import com.whatsapp.status.StatusConfirmMuteDialogFragment;
import com.whatsapp.status.StatusConfirmUnmuteDialogFragment;
import com.whatsapp.status.StatusDeleteDialogFragment;
import com.whatsapp.status.privacy.Hilt_StatusPrivacyBottomSheetDialogFragment_DiscardChangesConfirmationDialogFragment;
import com.whatsapp.stickers.Hilt_RemoveStickerFromFavoritesDialogFragment;
import com.whatsapp.stickers.Hilt_StarOrRemoveFromRecentsStickerDialogFragment;
import com.whatsapp.stickers.Hilt_StarStickerFromPickerDialogFragment;
import com.whatsapp.stickers.RemoveStickerFromFavoritesDialogFragment;
import com.whatsapp.stickers.StarOrRemoveFromRecentsStickerDialogFragment;
import com.whatsapp.stickers.StarStickerFromPickerDialogFragment;
import com.whatsapp.stickers.picker.pages.Hilt_ThirdPartyPackPage_StickerBlockedDialogFragment;
import com.whatsapp.stickers.store.ConfirmPackDeleteDialogFragment;
import com.whatsapp.stickers.store.Hilt_ConfirmPackDeleteDialogFragment;
import com.whatsapp.stickers.thirdparty.AddThirdPartyStickerPackActivity;
import com.whatsapp.stickers.thirdparty.Hilt_AddThirdPartyStickerPackActivity_AddStickerPackDialogFragment;
import com.whatsapp.storage.Hilt_StorageUsageDeleteCompleteDialogFragment;
import com.whatsapp.storage.Hilt_StorageUsageDeleteMessagesDialogFragment;
import com.whatsapp.storage.StorageUsageDeleteCompleteDialogFragment;
import com.whatsapp.storage.StorageUsageDeleteMessagesDialogFragment;
import com.whatsapp.textstatuscomposer.Hilt_DiscardWarningDialogFragment;
import com.whatsapp.twofactor.Hilt_SetEmailFragment_ConfirmSkipEmailDialog;
import com.whatsapp.twofactor.Hilt_SettingsTwoFactorAuthActivity_ConfirmDisableDialog;
import com.whatsapp.util.DocumentWarningDialogFragment;
import com.whatsapp.util.Hilt_DocumentWarningDialogFragment;
import com.whatsapp.voipcalling.Hilt_ReplyWithMessageDialogFragment;
import com.whatsapp.voipcalling.Hilt_VoipActivityV2_EndCallConfirmationDialogFragment;
import com.whatsapp.voipcalling.Hilt_VoipActivityV2_MessageDialogFragment;
import com.whatsapp.voipcalling.Hilt_VoipActivityV2_NonActivityDismissDialogFragment;
import com.whatsapp.voipcalling.Hilt_VoipActivityV2_RemoveUserConfirmationDialogFragment;
import com.whatsapp.voipcalling.Hilt_VoipActivityV2_SwitchCameraForPersonalizedAvatarDialogFragment;
import com.whatsapp.voipcalling.Hilt_VoipActivityV2_SwitchConfirmationFragment;
import com.whatsapp.voipcalling.Hilt_VoipErrorDialogFragment;
import com.whatsapp.voipcalling.Hilt_WASecuredDialogFragment;
import com.whatsapp.voipcalling.ReplyWithMessageDialogFragment;
import com.whatsapp.voipcalling.VoipActivityV2;
import com.whatsapp.voipcalling.VoipErrorDialogFragment;
import com.whatsapp.voipcalling.WASecuredDialogFragment;

public abstract class Hilt_WaDialogFragment extends DialogFragment implements AnonymousClass4GJ {
    public ContextWrapper A00;
    public boolean A01;
    public boolean A02 = false;
    public final Object A03 = AnonymousClass002.A0D();
    public volatile C116885r1 A04;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        if (r1 == r3) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1F(android.app.Activity r3) {
        /*
            r2 = this;
            r0 = 1
            r2.A0X = r0
            android.content.ContextWrapper r0 = r2.A00
            if (r0 == 0) goto L_0x000e
            android.content.Context r1 = X.C116885r1.A00(r0)
            r0 = 0
            if (r1 != r3) goto L_0x000f
        L_0x000e:
            r0 = 1
        L_0x000f:
            X.AnonymousClass2A2.A01(r0)
            r2.A03()
            r2.A1R()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.base.Hilt_WaDialogFragment.A1F(android.app.Activity):void");
    }

    private void A03() {
        if (this.A00 == null) {
            this.A00 = C18320x8.A0T(super.A1D(), this);
            this.A01 = AnonymousClass29z.A00(super.A1D());
        }
    }

    public void A1R() {
        if (this instanceof Hilt_WASecuredDialogFragment) {
            Hilt_WASecuredDialogFragment hilt_WASecuredDialogFragment = (Hilt_WASecuredDialogFragment) this;
            if (!hilt_WASecuredDialogFragment.A02) {
                hilt_WASecuredDialogFragment.A02 = true;
                AnonymousClass3DY A0N = C18310x6.A0N(hilt_WASecuredDialogFragment);
                WASecuredDialogFragment wASecuredDialogFragment = (WASecuredDialogFragment) hilt_WASecuredDialogFragment;
                C64333Db r1 = ((C88854au) A0N).A1B;
                C64333Db.Ad7(r1, wASecuredDialogFragment);
                wASecuredDialogFragment.A01 = C64333Db.A8X(r1);
                wASecuredDialogFragment.A00 = (C184988ss) r1.AJ2.get();
            }
        } else if (this instanceof Hilt_VoipErrorDialogFragment) {
            Hilt_VoipErrorDialogFragment hilt_VoipErrorDialogFragment = (Hilt_VoipErrorDialogFragment) this;
            if (!hilt_VoipErrorDialogFragment.A02) {
                hilt_VoipErrorDialogFragment.A02 = true;
                AnonymousClass3DY A0N2 = C18310x6.A0N(hilt_VoipErrorDialogFragment);
                VoipErrorDialogFragment voipErrorDialogFragment = (VoipErrorDialogFragment) hilt_VoipErrorDialogFragment;
                C64333Db r12 = ((C88854au) A0N2).A1B;
                C64333Db.Ad7(r12, voipErrorDialogFragment);
                voipErrorDialogFragment.A02 = C64333Db.A06(r12);
                voipErrorDialogFragment.A04 = C64333Db.A26(r12);
                voipErrorDialogFragment.A05 = C64333Db.A28(r12);
            }
        } else if (this instanceof Hilt_VoipActivityV2_SwitchConfirmationFragment) {
            Hilt_VoipActivityV2_SwitchConfirmationFragment hilt_VoipActivityV2_SwitchConfirmationFragment = (Hilt_VoipActivityV2_SwitchConfirmationFragment) this;
            if (!hilt_VoipActivityV2_SwitchConfirmationFragment.A02) {
                hilt_VoipActivityV2_SwitchConfirmationFragment.A02 = true;
                AnonymousClass3DY A0N3 = C18310x6.A0N(hilt_VoipActivityV2_SwitchConfirmationFragment);
                VoipActivityV2.SwitchConfirmationFragment switchConfirmationFragment = (VoipActivityV2.SwitchConfirmationFragment) hilt_VoipActivityV2_SwitchConfirmationFragment;
                C64333Db r0 = ((C88854au) A0N3).A1B;
                C64333Db.Ad7(r0, switchConfirmationFragment);
                switchConfirmationFragment.A00 = C64333Db.A2s(r0);
            }
        } else if (this instanceof Hilt_VoipActivityV2_SwitchCameraForPersonalizedAvatarDialogFragment) {
            Hilt_VoipActivityV2_SwitchCameraForPersonalizedAvatarDialogFragment hilt_VoipActivityV2_SwitchCameraForPersonalizedAvatarDialogFragment = (Hilt_VoipActivityV2_SwitchCameraForPersonalizedAvatarDialogFragment) this;
            if (!hilt_VoipActivityV2_SwitchCameraForPersonalizedAvatarDialogFragment.A02) {
                hilt_VoipActivityV2_SwitchCameraForPersonalizedAvatarDialogFragment.A02 = true;
                AnonymousClass3DY.A00(hilt_VoipActivityV2_SwitchCameraForPersonalizedAvatarDialogFragment);
            }
        } else if (this instanceof Hilt_VoipActivityV2_RemoveUserConfirmationDialogFragment) {
            Hilt_VoipActivityV2_RemoveUserConfirmationDialogFragment hilt_VoipActivityV2_RemoveUserConfirmationDialogFragment = (Hilt_VoipActivityV2_RemoveUserConfirmationDialogFragment) this;
            if (!hilt_VoipActivityV2_RemoveUserConfirmationDialogFragment.A02) {
                hilt_VoipActivityV2_RemoveUserConfirmationDialogFragment.A02 = true;
                AnonymousClass3DY A0N4 = C18310x6.A0N(hilt_VoipActivityV2_RemoveUserConfirmationDialogFragment);
                VoipActivityV2.RemoveUserConfirmationDialogFragment removeUserConfirmationDialogFragment = (VoipActivityV2.RemoveUserConfirmationDialogFragment) hilt_VoipActivityV2_RemoveUserConfirmationDialogFragment;
                C64333Db r13 = ((C88854au) A0N4).A1B;
                C64333Db.Ad7(r13, removeUserConfirmationDialogFragment);
                removeUserConfirmationDialogFragment.A01 = C64333Db.A26(r13);
                removeUserConfirmationDialogFragment.A02 = C64333Db.A28(r13);
            }
        } else if (this instanceof Hilt_VoipActivityV2_NonActivityDismissDialogFragment) {
            Hilt_VoipActivityV2_NonActivityDismissDialogFragment hilt_VoipActivityV2_NonActivityDismissDialogFragment = (Hilt_VoipActivityV2_NonActivityDismissDialogFragment) this;
            if (!hilt_VoipActivityV2_NonActivityDismissDialogFragment.A02) {
                hilt_VoipActivityV2_NonActivityDismissDialogFragment.A02 = true;
                AnonymousClass3DY.A00(hilt_VoipActivityV2_NonActivityDismissDialogFragment);
            }
        } else if (this instanceof Hilt_VoipActivityV2_MessageDialogFragment) {
            Hilt_VoipActivityV2_MessageDialogFragment hilt_VoipActivityV2_MessageDialogFragment = (Hilt_VoipActivityV2_MessageDialogFragment) this;
            if (!hilt_VoipActivityV2_MessageDialogFragment.A02) {
                hilt_VoipActivityV2_MessageDialogFragment.A02 = true;
                AnonymousClass3DY A0N5 = C18310x6.A0N(hilt_VoipActivityV2_MessageDialogFragment);
                VoipActivityV2.MessageDialogFragment messageDialogFragment = (VoipActivityV2.MessageDialogFragment) hilt_VoipActivityV2_MessageDialogFragment;
                C64333Db r02 = ((C88854au) A0N5).A1B;
                C64333Db.Ad7(r02, messageDialogFragment);
                messageDialogFragment.A00 = (AnonymousClass5TW) r02.ASQ.get();
            }
        } else if (this instanceof Hilt_VoipActivityV2_EndCallConfirmationDialogFragment) {
            Hilt_VoipActivityV2_EndCallConfirmationDialogFragment hilt_VoipActivityV2_EndCallConfirmationDialogFragment = (Hilt_VoipActivityV2_EndCallConfirmationDialogFragment) this;
            if (!hilt_VoipActivityV2_EndCallConfirmationDialogFragment.A02) {
                hilt_VoipActivityV2_EndCallConfirmationDialogFragment.A02 = true;
                AnonymousClass3DY.A00(hilt_VoipActivityV2_EndCallConfirmationDialogFragment);
            }
        } else if (this instanceof Hilt_ReplyWithMessageDialogFragment) {
            Hilt_ReplyWithMessageDialogFragment hilt_ReplyWithMessageDialogFragment = (Hilt_ReplyWithMessageDialogFragment) this;
            if (!hilt_ReplyWithMessageDialogFragment.A02) {
                hilt_ReplyWithMessageDialogFragment.A02 = true;
                AnonymousClass3DY A0N6 = C18310x6.A0N(hilt_ReplyWithMessageDialogFragment);
                ReplyWithMessageDialogFragment replyWithMessageDialogFragment = (ReplyWithMessageDialogFragment) hilt_ReplyWithMessageDialogFragment;
                C64333Db r03 = ((C88854au) A0N6).A1B;
                C64333Db.Ad6(r03, replyWithMessageDialogFragment);
                C107695bk r14 = r03.A00;
                C18300x5.A1C(r14, replyWithMessageDialogFragment);
                replyWithMessageDialogFragment.A01 = C64333Db.A2p(r03);
                replyWithMessageDialogFragment.A00 = (AnonymousClass7SF) r14.A6G.get();
            }
        } else if (this instanceof Hilt_DocumentWarningDialogFragment) {
            Hilt_DocumentWarningDialogFragment hilt_DocumentWarningDialogFragment = (Hilt_DocumentWarningDialogFragment) this;
            if (!hilt_DocumentWarningDialogFragment.A02) {
                hilt_DocumentWarningDialogFragment.A02 = true;
                AnonymousClass3DY A0N7 = C18310x6.A0N(hilt_DocumentWarningDialogFragment);
                DocumentWarningDialogFragment documentWarningDialogFragment = (DocumentWarningDialogFragment) hilt_DocumentWarningDialogFragment;
                C64333Db r15 = ((C88854au) A0N7).A1B;
                C64333Db.Ad7(r15, documentWarningDialogFragment);
                documentWarningDialogFragment.A03 = C64333Db.A04(r15);
                documentWarningDialogFragment.A02 = C64333Db.A01(r15);
                documentWarningDialogFragment.A07 = C64333Db.A8y(r15);
                documentWarningDialogFragment.A01 = C64333Db.A00(r15);
                documentWarningDialogFragment.A04 = C64333Db.A3D(r15);
                documentWarningDialogFragment.A06 = C64333Db.A8F(r15);
                documentWarningDialogFragment.A05 = (C48042eF) r15.AVm.get();
            }
        } else if (this instanceof Hilt_SettingsTwoFactorAuthActivity_ConfirmDisableDialog) {
            Hilt_SettingsTwoFactorAuthActivity_ConfirmDisableDialog hilt_SettingsTwoFactorAuthActivity_ConfirmDisableDialog = (Hilt_SettingsTwoFactorAuthActivity_ConfirmDisableDialog) this;
            if (!hilt_SettingsTwoFactorAuthActivity_ConfirmDisableDialog.A02) {
                hilt_SettingsTwoFactorAuthActivity_ConfirmDisableDialog.A02 = true;
                AnonymousClass3DY.A00(hilt_SettingsTwoFactorAuthActivity_ConfirmDisableDialog);
            }
        } else if (this instanceof Hilt_SetEmailFragment_ConfirmSkipEmailDialog) {
            Hilt_SetEmailFragment_ConfirmSkipEmailDialog hilt_SetEmailFragment_ConfirmSkipEmailDialog = (Hilt_SetEmailFragment_ConfirmSkipEmailDialog) this;
            if (!hilt_SetEmailFragment_ConfirmSkipEmailDialog.A02) {
                hilt_SetEmailFragment_ConfirmSkipEmailDialog.A02 = true;
                AnonymousClass3DY.A00(hilt_SetEmailFragment_ConfirmSkipEmailDialog);
            }
        } else if (this instanceof Hilt_DiscardWarningDialogFragment) {
            Hilt_DiscardWarningDialogFragment hilt_DiscardWarningDialogFragment = (Hilt_DiscardWarningDialogFragment) this;
            if (!hilt_DiscardWarningDialogFragment.A02) {
                hilt_DiscardWarningDialogFragment.A02 = true;
                AnonymousClass3DY.A00(hilt_DiscardWarningDialogFragment);
            }
        } else if (this instanceof Hilt_StorageUsageDeleteMessagesDialogFragment) {
            Hilt_StorageUsageDeleteMessagesDialogFragment hilt_StorageUsageDeleteMessagesDialogFragment = (Hilt_StorageUsageDeleteMessagesDialogFragment) this;
            if (!hilt_StorageUsageDeleteMessagesDialogFragment.A02) {
                hilt_StorageUsageDeleteMessagesDialogFragment.A02 = true;
                AnonymousClass3DY A0N8 = C18310x6.A0N(hilt_StorageUsageDeleteMessagesDialogFragment);
                StorageUsageDeleteMessagesDialogFragment storageUsageDeleteMessagesDialogFragment = (StorageUsageDeleteMessagesDialogFragment) hilt_StorageUsageDeleteMessagesDialogFragment;
                C64333Db r16 = ((C88854au) A0N8).A1B;
                C64333Db.Ad7(r16, storageUsageDeleteMessagesDialogFragment);
                storageUsageDeleteMessagesDialogFragment.A02 = C64333Db.A8y(r16);
                storageUsageDeleteMessagesDialogFragment.A00 = r16.AgO();
            }
        } else if (this instanceof Hilt_StorageUsageDeleteCompleteDialogFragment) {
            Hilt_StorageUsageDeleteCompleteDialogFragment hilt_StorageUsageDeleteCompleteDialogFragment = (Hilt_StorageUsageDeleteCompleteDialogFragment) this;
            if (!hilt_StorageUsageDeleteCompleteDialogFragment.A02) {
                hilt_StorageUsageDeleteCompleteDialogFragment.A02 = true;
                AnonymousClass3DY A0N9 = C18310x6.A0N(hilt_StorageUsageDeleteCompleteDialogFragment);
                StorageUsageDeleteCompleteDialogFragment storageUsageDeleteCompleteDialogFragment = (StorageUsageDeleteCompleteDialogFragment) hilt_StorageUsageDeleteCompleteDialogFragment;
                C64333Db r04 = ((C88854au) A0N9).A1B;
                C64333Db.Ad7(r04, storageUsageDeleteCompleteDialogFragment);
                storageUsageDeleteCompleteDialogFragment.A00 = C64333Db.A04(r04);
            }
        } else if (this instanceof Hilt_AddThirdPartyStickerPackActivity_AddStickerPackDialogFragment) {
            Hilt_AddThirdPartyStickerPackActivity_AddStickerPackDialogFragment hilt_AddThirdPartyStickerPackActivity_AddStickerPackDialogFragment = (Hilt_AddThirdPartyStickerPackActivity_AddStickerPackDialogFragment) this;
            if (!hilt_AddThirdPartyStickerPackActivity_AddStickerPackDialogFragment.A02) {
                hilt_AddThirdPartyStickerPackActivity_AddStickerPackDialogFragment.A02 = true;
                AnonymousClass3DY A0N10 = C18310x6.A0N(hilt_AddThirdPartyStickerPackActivity_AddStickerPackDialogFragment);
                AddThirdPartyStickerPackActivity.AddStickerPackDialogFragment addStickerPackDialogFragment = (AddThirdPartyStickerPackActivity.AddStickerPackDialogFragment) hilt_AddThirdPartyStickerPackActivity_AddStickerPackDialogFragment;
                C88854au r17 = (C88854au) A0N10;
                C64333Db r05 = r17.A1B;
                C64333Db.Ad7(r05, addStickerPackDialogFragment);
                addStickerPackDialogFragment.A00 = C64333Db.A04(r05);
                addStickerPackDialogFragment.A01 = r17.A18.ADE();
            }
        } else if (this instanceof Hilt_ConfirmPackDeleteDialogFragment) {
            Hilt_ConfirmPackDeleteDialogFragment hilt_ConfirmPackDeleteDialogFragment = (Hilt_ConfirmPackDeleteDialogFragment) this;
            if (!hilt_ConfirmPackDeleteDialogFragment.A02) {
                hilt_ConfirmPackDeleteDialogFragment.A02 = true;
                AnonymousClass3DY A0N11 = C18310x6.A0N(hilt_ConfirmPackDeleteDialogFragment);
                ConfirmPackDeleteDialogFragment confirmPackDeleteDialogFragment = (ConfirmPackDeleteDialogFragment) hilt_ConfirmPackDeleteDialogFragment;
                C64333Db r06 = ((C88854au) A0N11).A1B;
                C64333Db.Ad7(r06, confirmPackDeleteDialogFragment);
                confirmPackDeleteDialogFragment.A00 = (C56932sn) r06.AXB.get();
            }
        } else if (this instanceof Hilt_ThirdPartyPackPage_StickerBlockedDialogFragment) {
            Hilt_ThirdPartyPackPage_StickerBlockedDialogFragment hilt_ThirdPartyPackPage_StickerBlockedDialogFragment = (Hilt_ThirdPartyPackPage_StickerBlockedDialogFragment) this;
            if (!hilt_ThirdPartyPackPage_StickerBlockedDialogFragment.A02) {
                hilt_ThirdPartyPackPage_StickerBlockedDialogFragment.A02 = true;
                AnonymousClass3DY.A00(hilt_ThirdPartyPackPage_StickerBlockedDialogFragment);
            }
        } else if (this instanceof Hilt_StarStickerFromPickerDialogFragment) {
            Hilt_StarStickerFromPickerDialogFragment hilt_StarStickerFromPickerDialogFragment = (Hilt_StarStickerFromPickerDialogFragment) this;
            if (!hilt_StarStickerFromPickerDialogFragment.A02) {
                hilt_StarStickerFromPickerDialogFragment.A02 = true;
                AnonymousClass3DY A0N12 = C18310x6.A0N(hilt_StarStickerFromPickerDialogFragment);
                StarStickerFromPickerDialogFragment starStickerFromPickerDialogFragment = (StarStickerFromPickerDialogFragment) hilt_StarStickerFromPickerDialogFragment;
                C64333Db r18 = ((C88854au) A0N12).A1B;
                C64333Db.Ad7(r18, starStickerFromPickerDialogFragment);
                starStickerFromPickerDialogFragment.A04 = C64333Db.A8y(r18);
                starStickerFromPickerDialogFragment.A03 = (C56932sn) r18.AXB.get();
                starStickerFromPickerDialogFragment.A00 = (C56352rq) r18.ATd.get();
            }
        } else if (this instanceof Hilt_StarOrRemoveFromRecentsStickerDialogFragment) {
            Hilt_StarOrRemoveFromRecentsStickerDialogFragment hilt_StarOrRemoveFromRecentsStickerDialogFragment = (Hilt_StarOrRemoveFromRecentsStickerDialogFragment) this;
            if (!hilt_StarOrRemoveFromRecentsStickerDialogFragment.A02) {
                hilt_StarOrRemoveFromRecentsStickerDialogFragment.A02 = true;
                AnonymousClass3DY A0N13 = C18310x6.A0N(hilt_StarOrRemoveFromRecentsStickerDialogFragment);
                StarOrRemoveFromRecentsStickerDialogFragment starOrRemoveFromRecentsStickerDialogFragment = (StarOrRemoveFromRecentsStickerDialogFragment) hilt_StarOrRemoveFromRecentsStickerDialogFragment;
                C64333Db r19 = ((C88854au) A0N13).A1B;
                C64333Db.Ad7(r19, starOrRemoveFromRecentsStickerDialogFragment);
                starOrRemoveFromRecentsStickerDialogFragment.A05 = C72343dZ.A00(r19.ASJ);
                starOrRemoveFromRecentsStickerDialogFragment.A04 = C72343dZ.A00(r19.ARq);
                starOrRemoveFromRecentsStickerDialogFragment.A03 = C64333Db.A8y(r19);
                starOrRemoveFromRecentsStickerDialogFragment.A00 = (C65203Gp) r19.AXm.get();
                starOrRemoveFromRecentsStickerDialogFragment.A02 = (C56932sn) r19.AXB.get();
            }
        } else if (this instanceof Hilt_RemoveStickerFromFavoritesDialogFragment) {
            Hilt_RemoveStickerFromFavoritesDialogFragment hilt_RemoveStickerFromFavoritesDialogFragment = (Hilt_RemoveStickerFromFavoritesDialogFragment) this;
            if (!hilt_RemoveStickerFromFavoritesDialogFragment.A02) {
                hilt_RemoveStickerFromFavoritesDialogFragment.A02 = true;
                AnonymousClass3DY A0N14 = C18310x6.A0N(hilt_RemoveStickerFromFavoritesDialogFragment);
                RemoveStickerFromFavoritesDialogFragment removeStickerFromFavoritesDialogFragment = (RemoveStickerFromFavoritesDialogFragment) hilt_RemoveStickerFromFavoritesDialogFragment;
                C64333Db r07 = ((C88854au) A0N14).A1B;
                C64333Db.Ad7(r07, removeStickerFromFavoritesDialogFragment);
                removeStickerFromFavoritesDialogFragment.A01 = (C56932sn) r07.AXB.get();
            }
        } else if (this instanceof Hilt_StatusPrivacyBottomSheetDialogFragment_DiscardChangesConfirmationDialogFragment) {
            Hilt_StatusPrivacyBottomSheetDialogFragment_DiscardChangesConfirmationDialogFragment hilt_StatusPrivacyBottomSheetDialogFragment_DiscardChangesConfirmationDialogFragment = (Hilt_StatusPrivacyBottomSheetDialogFragment_DiscardChangesConfirmationDialogFragment) this;
            if (!hilt_StatusPrivacyBottomSheetDialogFragment_DiscardChangesConfirmationDialogFragment.A02) {
                hilt_StatusPrivacyBottomSheetDialogFragment_DiscardChangesConfirmationDialogFragment.A02 = true;
                AnonymousClass3DY.A00(hilt_StatusPrivacyBottomSheetDialogFragment_DiscardChangesConfirmationDialogFragment);
            }
        } else if (this instanceof Hilt_StatusDeleteDialogFragment) {
            Hilt_StatusDeleteDialogFragment hilt_StatusDeleteDialogFragment = (Hilt_StatusDeleteDialogFragment) this;
            if (!hilt_StatusDeleteDialogFragment.A02) {
                hilt_StatusDeleteDialogFragment.A02 = true;
                AnonymousClass3DY A0N15 = C18310x6.A0N(hilt_StatusDeleteDialogFragment);
                StatusDeleteDialogFragment statusDeleteDialogFragment = (StatusDeleteDialogFragment) hilt_StatusDeleteDialogFragment;
                C64333Db r110 = ((C88854au) A0N15).A1B;
                C64333Db.Ad7(r110, statusDeleteDialogFragment);
                statusDeleteDialogFragment.A00 = C64333Db.A04(r110);
                statusDeleteDialogFragment.A02 = C64333Db.A3o(r110);
                statusDeleteDialogFragment.A01 = C64333Db.A08(r110);
                statusDeleteDialogFragment.A04 = C64333Db.A8F(r110);
                statusDeleteDialogFragment.A05 = C72343dZ.A00(r110.A7Q);
            }
        } else if (this instanceof Hilt_StatusConfirmUnmuteDialogFragment) {
            Hilt_StatusConfirmUnmuteDialogFragment hilt_StatusConfirmUnmuteDialogFragment = (Hilt_StatusConfirmUnmuteDialogFragment) this;
            if (!hilt_StatusConfirmUnmuteDialogFragment.A02) {
                hilt_StatusConfirmUnmuteDialogFragment.A02 = true;
                AnonymousClass3DY A0N16 = C18310x6.A0N(hilt_StatusConfirmUnmuteDialogFragment);
                StatusConfirmUnmuteDialogFragment statusConfirmUnmuteDialogFragment = (StatusConfirmUnmuteDialogFragment) hilt_StatusConfirmUnmuteDialogFragment;
                C64333Db r111 = ((C88854au) A0N16).A1B;
                C64333Db.Ad7(r111, statusConfirmUnmuteDialogFragment);
                statusConfirmUnmuteDialogFragment.A03 = (C50252hs) r111.AWf.get();
                statusConfirmUnmuteDialogFragment.A00 = C64333Db.A26(r111);
                statusConfirmUnmuteDialogFragment.A01 = C64333Db.A28(r111);
                statusConfirmUnmuteDialogFragment.A04 = (C113995mK) r111.AWt.get();
            }
        } else if (this instanceof Hilt_StatusConfirmMuteDialogFragment) {
            Hilt_StatusConfirmMuteDialogFragment hilt_StatusConfirmMuteDialogFragment = (Hilt_StatusConfirmMuteDialogFragment) this;
            if (!hilt_StatusConfirmMuteDialogFragment.A02) {
                hilt_StatusConfirmMuteDialogFragment.A02 = true;
                AnonymousClass3DY A0N17 = C18310x6.A0N(hilt_StatusConfirmMuteDialogFragment);
                StatusConfirmMuteDialogFragment statusConfirmMuteDialogFragment = (StatusConfirmMuteDialogFragment) hilt_StatusConfirmMuteDialogFragment;
                C64333Db r112 = ((C88854au) A0N17).A1B;
                C64333Db.Ad7(r112, statusConfirmMuteDialogFragment);
                statusConfirmMuteDialogFragment.A03 = (C50252hs) r112.AWf.get();
                statusConfirmMuteDialogFragment.A00 = C64333Db.A26(r112);
                statusConfirmMuteDialogFragment.A01 = C64333Db.A28(r112);
                statusConfirmMuteDialogFragment.A04 = (C113995mK) r112.AWt.get();
            }
        } else if (this instanceof Hilt_WallpaperDownloadFailedDialogFragment) {
            Hilt_WallpaperDownloadFailedDialogFragment hilt_WallpaperDownloadFailedDialogFragment = (Hilt_WallpaperDownloadFailedDialogFragment) this;
            if (!hilt_WallpaperDownloadFailedDialogFragment.A02) {
                hilt_WallpaperDownloadFailedDialogFragment.A02 = true;
                AnonymousClass3DY.A00(hilt_WallpaperDownloadFailedDialogFragment);
            }
        } else if (this instanceof Hilt_SettingsNetworkUsage_ResetUsageConfirmationDialog) {
            Hilt_SettingsNetworkUsage_ResetUsageConfirmationDialog hilt_SettingsNetworkUsage_ResetUsageConfirmationDialog = (Hilt_SettingsNetworkUsage_ResetUsageConfirmationDialog) this;
            if (!hilt_SettingsNetworkUsage_ResetUsageConfirmationDialog.A02) {
                hilt_SettingsNetworkUsage_ResetUsageConfirmationDialog.A02 = true;
                AnonymousClass3DY.A00(hilt_SettingsNetworkUsage_ResetUsageConfirmationDialog);
            }
        } else if (this instanceof Hilt_SettingsCompanionLogoutDialog) {
            Hilt_SettingsCompanionLogoutDialog hilt_SettingsCompanionLogoutDialog = (Hilt_SettingsCompanionLogoutDialog) this;
            if (!hilt_SettingsCompanionLogoutDialog.A02) {
                hilt_SettingsCompanionLogoutDialog.A02 = true;
                AnonymousClass3DY A0N18 = C18310x6.A0N(hilt_SettingsCompanionLogoutDialog);
                SettingsCompanionLogoutDialog settingsCompanionLogoutDialog = (SettingsCompanionLogoutDialog) hilt_SettingsCompanionLogoutDialog;
                C64333Db r113 = ((C88854au) A0N18).A1B;
                C64333Db.Ad7(r113, settingsCompanionLogoutDialog);
                settingsCompanionLogoutDialog.A04 = C64333Db.A2p(r113);
                settingsCompanionLogoutDialog.A01 = C64333Db.A04(r113);
                settingsCompanionLogoutDialog.A07 = C64333Db.A8y(r113);
                settingsCompanionLogoutDialog.A00 = C64333Db.A00(r113);
                settingsCompanionLogoutDialog.A02 = C64333Db.A0E(r113);
                settingsCompanionLogoutDialog.A05 = C64333Db.A2s(r113);
                settingsCompanionLogoutDialog.A06 = (C54412og) r113.Aam.get();
                settingsCompanionLogoutDialog.A03 = (C47872dy) r113.A5w.get();
            }
        } else if (this instanceof Hilt_MultiSelectionDialogFragment) {
            Hilt_MultiSelectionDialogFragment hilt_MultiSelectionDialogFragment = (Hilt_MultiSelectionDialogFragment) this;
            if (!hilt_MultiSelectionDialogFragment.A02) {
                hilt_MultiSelectionDialogFragment.A02 = true;
                AnonymousClass3DY.A00(hilt_MultiSelectionDialogFragment);
            }
        } else if (this instanceof Hilt_ShareReportConfirmationDialogFragment) {
            Hilt_ShareReportConfirmationDialogFragment hilt_ShareReportConfirmationDialogFragment = (Hilt_ShareReportConfirmationDialogFragment) this;
            if (!hilt_ShareReportConfirmationDialogFragment.A02) {
                hilt_ShareReportConfirmationDialogFragment.A02 = true;
                AnonymousClass3DY.A00(hilt_ShareReportConfirmationDialogFragment);
            }
        } else if (this instanceof Hilt_DownloadLargeNewsletterReportFileConfirmationDialogFragment) {
            Hilt_DownloadLargeNewsletterReportFileConfirmationDialogFragment hilt_DownloadLargeNewsletterReportFileConfirmationDialogFragment = (Hilt_DownloadLargeNewsletterReportFileConfirmationDialogFragment) this;
            if (!hilt_DownloadLargeNewsletterReportFileConfirmationDialogFragment.A02) {
                hilt_DownloadLargeNewsletterReportFileConfirmationDialogFragment.A02 = true;
                AnonymousClass3DY.A00(hilt_DownloadLargeNewsletterReportFileConfirmationDialogFragment);
            }
        } else if (this instanceof Hilt_DeleteReportConfirmationDialogFragment) {
            Hilt_DeleteReportConfirmationDialogFragment hilt_DeleteReportConfirmationDialogFragment = (Hilt_DeleteReportConfirmationDialogFragment) this;
            if (!hilt_DeleteReportConfirmationDialogFragment.A02) {
                hilt_DeleteReportConfirmationDialogFragment.A02 = true;
                AnonymousClass3DY.A00(hilt_DeleteReportConfirmationDialogFragment);
            }
        } else if (this instanceof Hilt_OldDeviceMoveAccountConfirmationDialogFragment) {
            Hilt_OldDeviceMoveAccountConfirmationDialogFragment hilt_OldDeviceMoveAccountConfirmationDialogFragment = (Hilt_OldDeviceMoveAccountConfirmationDialogFragment) this;
            if (!hilt_OldDeviceMoveAccountConfirmationDialogFragment.A02) {
                hilt_OldDeviceMoveAccountConfirmationDialogFragment.A02 = true;
                AnonymousClass3DY.A00(hilt_OldDeviceMoveAccountConfirmationDialogFragment);
            }
        } else if (this instanceof Hilt_DeviceConfirmationRegAlertDialogFragment) {
            Hilt_DeviceConfirmationRegAlertDialogFragment hilt_DeviceConfirmationRegAlertDialogFragment = (Hilt_DeviceConfirmationRegAlertDialogFragment) this;
            if (!hilt_DeviceConfirmationRegAlertDialogFragment.A02) {
                hilt_DeviceConfirmationRegAlertDialogFragment.A02 = true;
                AnonymousClass3DY A0N19 = C18310x6.A0N(hilt_DeviceConfirmationRegAlertDialogFragment);
                DeviceConfirmationRegAlertDialogFragment deviceConfirmationRegAlertDialogFragment = (DeviceConfirmationRegAlertDialogFragment) hilt_DeviceConfirmationRegAlertDialogFragment;
                C64333Db r114 = ((C88854au) A0N19).A1B;
                C64333Db.Ad7(r114, deviceConfirmationRegAlertDialogFragment);
                deviceConfirmationRegAlertDialogFragment.A04 = C64333Db.A2p(r114);
                deviceConfirmationRegAlertDialogFragment.A03 = C64333Db.A06(r114);
                deviceConfirmationRegAlertDialogFragment.A05 = C64333Db.A5u(r114);
            }
        } else if (this instanceof Hilt_VerifyTwoFactorAuth_resetAccountDialog) {
            Hilt_VerifyTwoFactorAuth_resetAccountDialog hilt_VerifyTwoFactorAuth_resetAccountDialog = (Hilt_VerifyTwoFactorAuth_resetAccountDialog) this;
            if (!hilt_VerifyTwoFactorAuth_resetAccountDialog.A02) {
                hilt_VerifyTwoFactorAuth_resetAccountDialog.A02 = true;
                AnonymousClass3DY.A00(hilt_VerifyTwoFactorAuth_resetAccountDialog);
            }
        } else if (this instanceof Hilt_VerifyTwoFactorAuth_forgotPinDialog) {
            Hilt_VerifyTwoFactorAuth_forgotPinDialog hilt_VerifyTwoFactorAuth_forgotPinDialog = (Hilt_VerifyTwoFactorAuth_forgotPinDialog) this;
            if (!hilt_VerifyTwoFactorAuth_forgotPinDialog.A02) {
                hilt_VerifyTwoFactorAuth_forgotPinDialog.A02 = true;
                AnonymousClass3DY.A00(hilt_VerifyTwoFactorAuth_forgotPinDialog);
            }
        } else if (this instanceof Hilt_SelectPhoneNumberDialog) {
            Hilt_SelectPhoneNumberDialog hilt_SelectPhoneNumberDialog = (Hilt_SelectPhoneNumberDialog) this;
            if (!hilt_SelectPhoneNumberDialog.A02) {
                hilt_SelectPhoneNumberDialog.A02 = true;
                AnonymousClass3DY A0N20 = C18310x6.A0N(hilt_SelectPhoneNumberDialog);
                SelectPhoneNumberDialog selectPhoneNumberDialog = (SelectPhoneNumberDialog) hilt_SelectPhoneNumberDialog;
                C64333Db r08 = ((C88854au) A0N20).A1B;
                C64333Db.Ad7(r08, selectPhoneNumberDialog);
                selectPhoneNumberDialog.A00 = (C106175Xx) r08.ARx.get();
            }
        } else if (this instanceof Hilt_WebCodeDialogFragment) {
            Hilt_WebCodeDialogFragment hilt_WebCodeDialogFragment = (Hilt_WebCodeDialogFragment) this;
            if (!hilt_WebCodeDialogFragment.A02) {
                hilt_WebCodeDialogFragment.A02 = true;
                AnonymousClass3DY A0N21 = C18310x6.A0N(hilt_WebCodeDialogFragment);
                WebCodeDialogFragment webCodeDialogFragment = (WebCodeDialogFragment) hilt_WebCodeDialogFragment;
                C64333Db r115 = ((C88854au) A0N21).A1B;
                C64333Db.Ad7(r115, webCodeDialogFragment);
                webCodeDialogFragment.A00 = (C116985rC) r115.AOi.get();
                webCodeDialogFragment.A01 = (AnonymousClass2R8) r115.AWC.get();
            }
        } else if (this instanceof Hilt_ErrorDialogFragment) {
            Hilt_ErrorDialogFragment hilt_ErrorDialogFragment = (Hilt_ErrorDialogFragment) this;
            if (!hilt_ErrorDialogFragment.A02) {
                hilt_ErrorDialogFragment.A02 = true;
                AnonymousClass3DY.A00(hilt_ErrorDialogFragment);
            }
        } else if (this instanceof Hilt_QrEducationDialogFragment) {
            Hilt_QrEducationDialogFragment hilt_QrEducationDialogFragment = (Hilt_QrEducationDialogFragment) this;
            if (!hilt_QrEducationDialogFragment.A02) {
                hilt_QrEducationDialogFragment.A02 = true;
                AnonymousClass3DY.A00(hilt_QrEducationDialogFragment);
            }
        } else if (this instanceof Hilt_ResetPhoto_ConfirmDialogFragment) {
            Hilt_ResetPhoto_ConfirmDialogFragment hilt_ResetPhoto_ConfirmDialogFragment = (Hilt_ResetPhoto_ConfirmDialogFragment) this;
            if (!hilt_ResetPhoto_ConfirmDialogFragment.A02) {
                hilt_ResetPhoto_ConfirmDialogFragment.A02 = true;
                AnonymousClass3DY A0N22 = C18310x6.A0N(hilt_ResetPhoto_ConfirmDialogFragment);
                ResetPhoto.ConfirmDialogFragment confirmDialogFragment = (ResetPhoto.ConfirmDialogFragment) hilt_ResetPhoto_ConfirmDialogFragment;
                C64333Db.Ad7(((C88854au) A0N22).A1B, confirmDialogFragment);
                confirmDialogFragment.A00 = C88744aj.A00;
            }
        } else if (this instanceof Hilt_ResetGroupPhoto_ConfirmDialogFragment) {
            Hilt_ResetGroupPhoto_ConfirmDialogFragment hilt_ResetGroupPhoto_ConfirmDialogFragment = (Hilt_ResetGroupPhoto_ConfirmDialogFragment) this;
            if (!hilt_ResetGroupPhoto_ConfirmDialogFragment.A02) {
                hilt_ResetGroupPhoto_ConfirmDialogFragment.A02 = true;
                AnonymousClass3DY.A00(hilt_ResetGroupPhoto_ConfirmDialogFragment);
            }
        } else if (this instanceof Hilt_PinInChatExpirationDialogFragment) {
            Hilt_PinInChatExpirationDialogFragment hilt_PinInChatExpirationDialogFragment = (Hilt_PinInChatExpirationDialogFragment) this;
            if (!hilt_PinInChatExpirationDialogFragment.A02) {
                hilt_PinInChatExpirationDialogFragment.A02 = true;
                AnonymousClass3DY.A00(hilt_PinInChatExpirationDialogFragment);
            }
        } else if (this instanceof Hilt_PickerSearchDialogFragment) {
            Hilt_PickerSearchDialogFragment hilt_PickerSearchDialogFragment = (Hilt_PickerSearchDialogFragment) this;
            if (!hilt_PickerSearchDialogFragment.A02) {
                hilt_PickerSearchDialogFragment.A02 = true;
                AnonymousClass3DY.A00(hilt_PickerSearchDialogFragment);
            }
        } else if (this instanceof Hilt_ConnectionUnavailableDialogFragment) {
            Hilt_ConnectionUnavailableDialogFragment hilt_ConnectionUnavailableDialogFragment = (Hilt_ConnectionUnavailableDialogFragment) this;
            if (!hilt_ConnectionUnavailableDialogFragment.A02) {
                hilt_ConnectionUnavailableDialogFragment.A02 = true;
                AnonymousClass3DY A0N23 = C18310x6.A0N(hilt_ConnectionUnavailableDialogFragment);
                ConnectionUnavailableDialogFragment connectionUnavailableDialogFragment = (ConnectionUnavailableDialogFragment) hilt_ConnectionUnavailableDialogFragment;
                C64333Db r116 = ((C88854au) A0N23).A1B;
                C64333Db.Ad7(r116, connectionUnavailableDialogFragment);
                connectionUnavailableDialogFragment.A06 = C64333Db.A8y(r116);
                connectionUnavailableDialogFragment.A00 = (AnonymousClass5WY) r116.AUS.get();
                connectionUnavailableDialogFragment.A02 = C64333Db.A2o(r116);
                connectionUnavailableDialogFragment.A04 = (C53202mi) r116.AXV.get();
                connectionUnavailableDialogFragment.A01 = C64333Db.A24(r116);
                connectionUnavailableDialogFragment.A03 = C64333Db.A2r(r116);
                connectionUnavailableDialogFragment.A05 = (C56912sl) r116.ATe.get();
            }
        } else if (this instanceof Hilt_ConnectionProgressDialogFragment) {
            Hilt_ConnectionProgressDialogFragment hilt_ConnectionProgressDialogFragment = (Hilt_ConnectionProgressDialogFragment) this;
            if (!hilt_ConnectionProgressDialogFragment.A02) {
                hilt_ConnectionProgressDialogFragment.A02 = true;
                AnonymousClass3DY.A00(hilt_ConnectionProgressDialogFragment);
            }
        } else if (this instanceof Hilt_DeleteConfirmationDialogFragment) {
            Hilt_DeleteConfirmationDialogFragment hilt_DeleteConfirmationDialogFragment = (Hilt_DeleteConfirmationDialogFragment) this;
            if (!hilt_DeleteConfirmationDialogFragment.A02) {
                hilt_DeleteConfirmationDialogFragment.A02 = true;
                AnonymousClass3DY.A00(hilt_DeleteConfirmationDialogFragment);
            }
        } else if (this instanceof Hilt_RevokeNewsletterAdminInviteDialogFragment) {
            Hilt_RevokeNewsletterAdminInviteDialogFragment hilt_RevokeNewsletterAdminInviteDialogFragment = (Hilt_RevokeNewsletterAdminInviteDialogFragment) this;
            if (!hilt_RevokeNewsletterAdminInviteDialogFragment.A02) {
                hilt_RevokeNewsletterAdminInviteDialogFragment.A02 = true;
                AnonymousClass3DY.A00(hilt_RevokeNewsletterAdminInviteDialogFragment);
            }
        } else if (this instanceof Hilt_DismissNewsletterAdminDialogFragment) {
            Hilt_DismissNewsletterAdminDialogFragment hilt_DismissNewsletterAdminDialogFragment = (Hilt_DismissNewsletterAdminDialogFragment) this;
            if (!hilt_DismissNewsletterAdminDialogFragment.A02) {
                hilt_DismissNewsletterAdminDialogFragment.A02 = true;
                AnonymousClass3DY A0N24 = C18310x6.A0N(hilt_DismissNewsletterAdminDialogFragment);
                DismissNewsletterAdminDialogFragment dismissNewsletterAdminDialogFragment = (DismissNewsletterAdminDialogFragment) hilt_DismissNewsletterAdminDialogFragment;
                C64333Db r09 = ((C88854au) A0N24).A1B;
                C64333Db.Ad7(r09, dismissNewsletterAdminDialogFragment);
                dismissNewsletterAdminDialogFragment.A00 = C64333Db.A06(r09);
            }
        } else if (this instanceof Hilt_MuteDialogFragment) {
            Hilt_MuteDialogFragment hilt_MuteDialogFragment = (Hilt_MuteDialogFragment) this;
            if (!hilt_MuteDialogFragment.A02) {
                hilt_MuteDialogFragment.A02 = true;
                AnonymousClass3DY A0N25 = C18310x6.A0N(hilt_MuteDialogFragment);
                MuteDialogFragment muteDialogFragment = (MuteDialogFragment) hilt_MuteDialogFragment;
                C64333Db r117 = ((C88854au) A0N25).A1B;
                C64333Db.Ad7(r117, muteDialogFragment);
                muteDialogFragment.A00 = C64333Db.A04(r117);
                muteDialogFragment.A02 = C64333Db.A8y(r117);
                muteDialogFragment.A01 = C64333Db.A2s(r117);
            }
        } else if (this instanceof Hilt_RevokeNuxDialogFragment) {
            Hilt_RevokeNuxDialogFragment hilt_RevokeNuxDialogFragment = (Hilt_RevokeNuxDialogFragment) this;
            if (!hilt_RevokeNuxDialogFragment.A02) {
                hilt_RevokeNuxDialogFragment.A02 = true;
                AnonymousClass3DY A0N26 = C18310x6.A0N(hilt_RevokeNuxDialogFragment);
                RevokeNuxDialogFragment revokeNuxDialogFragment = (RevokeNuxDialogFragment) hilt_RevokeNuxDialogFragment;
                C64333Db r2 = ((C88854au) A0N26).A1B;
                C64333Db.Ad6(r2, revokeNuxDialogFragment);
                C107695bk r118 = r2.A00;
                C18300x5.A1C(r118, revokeNuxDialogFragment);
                revokeNuxDialogFragment.A00 = C64333Db.A00(r2);
                revokeNuxDialogFragment.A03 = C64333Db.A8X(r2);
                revokeNuxDialogFragment.A01 = C18280x3.A0L(r118);
                revokeNuxDialogFragment.A02 = C64333Db.A2s(r2);
            }
        } else if (this instanceof Hilt_StopLiveLocationDialogFragment) {
            Hilt_StopLiveLocationDialogFragment hilt_StopLiveLocationDialogFragment = (Hilt_StopLiveLocationDialogFragment) this;
            if (!hilt_StopLiveLocationDialogFragment.A02) {
                hilt_StopLiveLocationDialogFragment.A02 = true;
                AnonymousClass3DY A0N27 = C18310x6.A0N(hilt_StopLiveLocationDialogFragment);
                StopLiveLocationDialogFragment stopLiveLocationDialogFragment = (StopLiveLocationDialogFragment) hilt_StopLiveLocationDialogFragment;
                C64333Db r119 = ((C88854au) A0N27).A1B;
                C64333Db.Ad7(r119, stopLiveLocationDialogFragment);
                stopLiveLocationDialogFragment.A01 = C64333Db.A8y(r119);
                stopLiveLocationDialogFragment.A00 = (C621233o) r119.AJA.get();
            }
        } else if (this instanceof Hilt_RevokeInviteDialogFragment) {
            Hilt_RevokeInviteDialogFragment hilt_RevokeInviteDialogFragment = (Hilt_RevokeInviteDialogFragment) this;
            if (!hilt_RevokeInviteDialogFragment.A02) {
                hilt_RevokeInviteDialogFragment.A02 = true;
                AnonymousClass3DY A0N28 = C18310x6.A0N(hilt_RevokeInviteDialogFragment);
                RevokeInviteDialogFragment revokeInviteDialogFragment = (RevokeInviteDialogFragment) hilt_RevokeInviteDialogFragment;
                C64333Db r120 = ((C88854au) A0N28).A1B;
                C64333Db.Ad7(r120, revokeInviteDialogFragment);
                revokeInviteDialogFragment.A00 = C64333Db.A26(r120);
                revokeInviteDialogFragment.A01 = C64333Db.A28(r120);
            }
        } else if (this instanceof Hilt_PromptSendGroupInviteDialogFragment) {
            Hilt_PromptSendGroupInviteDialogFragment hilt_PromptSendGroupInviteDialogFragment = (Hilt_PromptSendGroupInviteDialogFragment) this;
            if (!hilt_PromptSendGroupInviteDialogFragment.A02) {
                hilt_PromptSendGroupInviteDialogFragment.A02 = true;
                AnonymousClass3DY A0N29 = C18310x6.A0N(hilt_PromptSendGroupInviteDialogFragment);
                PromptSendGroupInviteDialogFragment promptSendGroupInviteDialogFragment = (PromptSendGroupInviteDialogFragment) hilt_PromptSendGroupInviteDialogFragment;
                C64333Db r121 = ((C88854au) A0N29).A1B;
                C64333Db.Ad7(r121, promptSendGroupInviteDialogFragment);
                promptSendGroupInviteDialogFragment.A01 = C64333Db.A8w(r121);
                promptSendGroupInviteDialogFragment.A00 = C64333Db.A28(r121);
            }
        } else if (this instanceof Hilt_NobodyDeprecatedDialogFragment) {
            Hilt_NobodyDeprecatedDialogFragment hilt_NobodyDeprecatedDialogFragment = (Hilt_NobodyDeprecatedDialogFragment) this;
            if (!hilt_NobodyDeprecatedDialogFragment.A02) {
                hilt_NobodyDeprecatedDialogFragment.A02 = true;
                AnonymousClass3DY.A00(hilt_NobodyDeprecatedDialogFragment);
            }
        } else if (this instanceof Hilt_InviteLinkUnavailableDialogFragment) {
            Hilt_InviteLinkUnavailableDialogFragment hilt_InviteLinkUnavailableDialogFragment = (Hilt_InviteLinkUnavailableDialogFragment) this;
            if (!hilt_InviteLinkUnavailableDialogFragment.A02) {
                hilt_InviteLinkUnavailableDialogFragment.A02 = true;
                AnonymousClass3DY A0N30 = C18310x6.A0N(hilt_InviteLinkUnavailableDialogFragment);
                InviteLinkUnavailableDialogFragment inviteLinkUnavailableDialogFragment = (InviteLinkUnavailableDialogFragment) hilt_InviteLinkUnavailableDialogFragment;
                C64333Db r010 = ((C88854au) A0N30).A1B;
                C64333Db.Ad6(r010, inviteLinkUnavailableDialogFragment);
                C107695bk r011 = r010.A00;
                C18300x5.A1C(r011, inviteLinkUnavailableDialogFragment);
                inviteLinkUnavailableDialogFragment.A00 = C18280x3.A0L(r011);
            }
        } else if (this instanceof Hilt_CreateGroupSuspendDialog) {
            Hilt_CreateGroupSuspendDialog hilt_CreateGroupSuspendDialog = (Hilt_CreateGroupSuspendDialog) this;
            if (!hilt_CreateGroupSuspendDialog.A02) {
                hilt_CreateGroupSuspendDialog.A02 = true;
                AnonymousClass3DY A0N31 = C18310x6.A0N(hilt_CreateGroupSuspendDialog);
                CreateGroupSuspendDialog createGroupSuspendDialog = (CreateGroupSuspendDialog) hilt_CreateGroupSuspendDialog;
                C88854au r122 = (C88854au) A0N31;
                C64333Db r012 = r122.A1B;
                C64333Db.Ad6(r012, createGroupSuspendDialog);
                C107695bk r013 = r012.A00;
                C18300x5.A1C(r013, createGroupSuspendDialog);
                createGroupSuspendDialog.A01 = C18280x3.A0Q(r013);
                createGroupSuspendDialog.A00 = r122.A7M();
            }
        } else if (this instanceof Hilt_ConfirmClearAdminReviewsDialogFragment) {
            Hilt_ConfirmClearAdminReviewsDialogFragment hilt_ConfirmClearAdminReviewsDialogFragment = (Hilt_ConfirmClearAdminReviewsDialogFragment) this;
            if (!hilt_ConfirmClearAdminReviewsDialogFragment.A02) {
                hilt_ConfirmClearAdminReviewsDialogFragment.A02 = true;
                AnonymousClass3DY.A00(hilt_ConfirmClearAdminReviewsDialogFragment);
            }
        } else if (this instanceof Hilt_GroupChatInfoActivity_DescriptionConflictDialogFragment) {
            Hilt_GroupChatInfoActivity_DescriptionConflictDialogFragment hilt_GroupChatInfoActivity_DescriptionConflictDialogFragment = (Hilt_GroupChatInfoActivity_DescriptionConflictDialogFragment) this;
            if (!hilt_GroupChatInfoActivity_DescriptionConflictDialogFragment.A02) {
                hilt_GroupChatInfoActivity_DescriptionConflictDialogFragment.A02 = true;
                AnonymousClass3DY.A00(hilt_GroupChatInfoActivity_DescriptionConflictDialogFragment);
            }
        } else if (this instanceof Hilt_ConfirmApproveAllPendingRequestsDialogFragment) {
            Hilt_ConfirmApproveAllPendingRequestsDialogFragment hilt_ConfirmApproveAllPendingRequestsDialogFragment = (Hilt_ConfirmApproveAllPendingRequestsDialogFragment) this;
            if (!hilt_ConfirmApproveAllPendingRequestsDialogFragment.A02) {
                hilt_ConfirmApproveAllPendingRequestsDialogFragment.A02 = true;
                AnonymousClass3DY.A00(hilt_ConfirmApproveAllPendingRequestsDialogFragment);
            }
        } else if (this instanceof Hilt_StickerExpressionsFragment) {
            Hilt_StickerExpressionsFragment hilt_StickerExpressionsFragment = (Hilt_StickerExpressionsFragment) this;
            if (!hilt_StickerExpressionsFragment.A02) {
                hilt_StickerExpressionsFragment.A02 = true;
                AnonymousClass3DY A0N32 = C18310x6.A0N(hilt_StickerExpressionsFragment);
                StickerExpressionsFragment stickerExpressionsFragment = (StickerExpressionsFragment) hilt_StickerExpressionsFragment;
                C88854au r22 = (C88854au) A0N32;
                C64333Db r123 = r22.A1B;
                C64333Db.Ad6(r123, stickerExpressionsFragment);
                C107695bk r014 = r123.A00;
                C18300x5.A1C(r014, stickerExpressionsFragment);
                stickerExpressionsFragment.A0C = (AnonymousClass2SD) r014.AAr.get();
                stickerExpressionsFragment.A0E = (AnonymousClass33O) r123.AX1.get();
                stickerExpressionsFragment.A07 = (C56352rq) r123.ATd.get();
                stickerExpressionsFragment.A0B = (C59292wg) r22.A18.A3b.get();
            }
        } else if (this instanceof Hilt_GifExpressionsFragment) {
            Hilt_GifExpressionsFragment hilt_GifExpressionsFragment = (Hilt_GifExpressionsFragment) this;
            if (!hilt_GifExpressionsFragment.A02) {
                hilt_GifExpressionsFragment.A02 = true;
                AnonymousClass3DY A0N33 = C18310x6.A0N(hilt_GifExpressionsFragment);
                GifExpressionsFragment gifExpressionsFragment = (GifExpressionsFragment) hilt_GifExpressionsFragment;
                C64333Db r124 = ((C88854au) A0N33).A1B;
                C64333Db.Ad7(r124, gifExpressionsFragment);
                gifExpressionsFragment.A07 = (C106095Xp) r124.AG6.get();
                gifExpressionsFragment.A06 = C64333Db.A4H(r124);
                gifExpressionsFragment.A04 = C64333Db.A2o(r124);
                gifExpressionsFragment.A0A = C64333Db.A74(r124);
            }
        } else if (this instanceof Hilt_AvatarExpressionsFragment) {
            Hilt_AvatarExpressionsFragment hilt_AvatarExpressionsFragment = (Hilt_AvatarExpressionsFragment) this;
            if (!hilt_AvatarExpressionsFragment.A02) {
                hilt_AvatarExpressionsFragment.A02 = true;
                AnonymousClass3DY A0N34 = C18310x6.A0N(hilt_AvatarExpressionsFragment);
                AvatarExpressionsFragment avatarExpressionsFragment = (AvatarExpressionsFragment) hilt_AvatarExpressionsFragment;
                C64333Db r23 = ((C88854au) A0N34).A1B;
                C64333Db.Ad6(r23, avatarExpressionsFragment);
                C107695bk r125 = r23.A00;
                C18300x5.A1C(r125, avatarExpressionsFragment);
                avatarExpressionsFragment.A0C = C64333Db.A2q(r23);
                avatarExpressionsFragment.A0H = (AnonymousClass2SD) r125.AAr.get();
                avatarExpressionsFragment.A0I = (AnonymousClass33O) r23.AX1.get();
                avatarExpressionsFragment.A0A = (C56352rq) r23.ATd.get();
                avatarExpressionsFragment.A0K = (C49932hK) r23.A1d.get();
            }
        } else if (this instanceof Hilt_EventCreationVideoCallDialog) {
            Hilt_EventCreationVideoCallDialog hilt_EventCreationVideoCallDialog = (Hilt_EventCreationVideoCallDialog) this;
            if (!hilt_EventCreationVideoCallDialog.A02) {
                hilt_EventCreationVideoCallDialog.A02 = true;
                AnonymousClass3DY A0N35 = C18310x6.A0N(hilt_EventCreationVideoCallDialog);
                EventCreationVideoCallDialog eventCreationVideoCallDialog = (EventCreationVideoCallDialog) hilt_EventCreationVideoCallDialog;
                C64333Db r015 = ((C88854au) A0N35).A1B;
                C64333Db.Ad6(r015, eventCreationVideoCallDialog);
                C107695bk r016 = r015.A00;
                C18300x5.A1C(r016, eventCreationVideoCallDialog);
                eventCreationVideoCallDialog.A00 = (C45942ap) r016.A44.get();
            }
        } else if (this instanceof Hilt_ChangeEphemeralSettingsDialog) {
            Hilt_ChangeEphemeralSettingsDialog hilt_ChangeEphemeralSettingsDialog = (Hilt_ChangeEphemeralSettingsDialog) this;
            if (!hilt_ChangeEphemeralSettingsDialog.A02) {
                hilt_ChangeEphemeralSettingsDialog.A02 = true;
                AnonymousClass3DY A0N36 = C18310x6.A0N(hilt_ChangeEphemeralSettingsDialog);
                ChangeEphemeralSettingsDialog changeEphemeralSettingsDialog = (ChangeEphemeralSettingsDialog) hilt_ChangeEphemeralSettingsDialog;
                C64333Db r017 = ((C88854au) A0N36).A1B;
                C64333Db.Ad7(r017, changeEphemeralSettingsDialog);
                changeEphemeralSettingsDialog.A00 = (C57162tC) r017.AaV.get();
            }
        } else if (this instanceof Hilt_UnrecoverableErrorDialogFragment) {
            Hilt_UnrecoverableErrorDialogFragment hilt_UnrecoverableErrorDialogFragment = (Hilt_UnrecoverableErrorDialogFragment) this;
            if (!hilt_UnrecoverableErrorDialogFragment.A02) {
                hilt_UnrecoverableErrorDialogFragment.A02 = true;
                AnonymousClass3DY A0N37 = C18310x6.A0N(hilt_UnrecoverableErrorDialogFragment);
                UnrecoverableErrorDialogFragment unrecoverableErrorDialogFragment = (UnrecoverableErrorDialogFragment) hilt_UnrecoverableErrorDialogFragment;
                C64333Db r126 = ((C88854au) A0N37).A1B;
                C64333Db.Ad7(r126, unrecoverableErrorDialogFragment);
                unrecoverableErrorDialogFragment.A01 = C64333Db.A04(r126);
                unrecoverableErrorDialogFragment.A00 = C64333Db.A00(r126);
                unrecoverableErrorDialogFragment.A02 = (AnonymousClass5X8) r126.Aac.get();
                unrecoverableErrorDialogFragment.A03 = C64333Db.A2o(r126);
            }
        } else if (this instanceof Hilt_PromptDialogFragment) {
            Hilt_PromptDialogFragment hilt_PromptDialogFragment = (Hilt_PromptDialogFragment) this;
            if (!hilt_PromptDialogFragment.A02) {
                hilt_PromptDialogFragment.A02 = true;
                AnonymousClass3DY A0N38 = C18310x6.A0N(hilt_PromptDialogFragment);
                PromptDialogFragment promptDialogFragment = (PromptDialogFragment) hilt_PromptDialogFragment;
                C64333Db r018 = ((C88854au) A0N38).A1B;
                C64333Db.Ad7(r018, promptDialogFragment);
                promptDialogFragment.A00 = C64333Db.A2o(r018);
            }
        } else if (this instanceof Hilt_ProgressDialogFragment) {
            Hilt_ProgressDialogFragment hilt_ProgressDialogFragment = (Hilt_ProgressDialogFragment) this;
            if (!hilt_ProgressDialogFragment.A02) {
                hilt_ProgressDialogFragment.A02 = true;
                AnonymousClass3DY.A00(hilt_ProgressDialogFragment);
            }
        } else if (this instanceof Hilt_DeleteOrArchiveChatDialog) {
            Hilt_DeleteOrArchiveChatDialog hilt_DeleteOrArchiveChatDialog = (Hilt_DeleteOrArchiveChatDialog) this;
            if (!hilt_DeleteOrArchiveChatDialog.A02) {
                hilt_DeleteOrArchiveChatDialog.A02 = true;
                AnonymousClass3DY A0N39 = C18310x6.A0N(hilt_DeleteOrArchiveChatDialog);
                DeleteOrArchiveChatDialog deleteOrArchiveChatDialog = (DeleteOrArchiveChatDialog) hilt_DeleteOrArchiveChatDialog;
                C64333Db r127 = ((C88854au) A0N39).A1B;
                C64333Db.Ad7(r127, deleteOrArchiveChatDialog);
                deleteOrArchiveChatDialog.A00 = C64333Db.A04(r127);
                deleteOrArchiveChatDialog.A04 = C64333Db.A8y(r127);
                deleteOrArchiveChatDialog.A03 = C64333Db.A39(r127);
                deleteOrArchiveChatDialog.A02 = (C56542sA) r127.A4v.get();
                deleteOrArchiveChatDialog.A01 = C64333Db.A08(r127);
            }
        } else if (this instanceof Hilt_CreateOrAddToContactsDialog) {
            Hilt_CreateOrAddToContactsDialog hilt_CreateOrAddToContactsDialog = (Hilt_CreateOrAddToContactsDialog) this;
            if (!hilt_CreateOrAddToContactsDialog.A02) {
                hilt_CreateOrAddToContactsDialog.A02 = true;
                AnonymousClass3DY.A00(hilt_CreateOrAddToContactsDialog);
            }
        } else if (this instanceof Hilt_ConsumerMarketingDisclosureFullscreenFragment) {
            Hilt_ConsumerMarketingDisclosureFullscreenFragment hilt_ConsumerMarketingDisclosureFullscreenFragment = (Hilt_ConsumerMarketingDisclosureFullscreenFragment) this;
            if (!hilt_ConsumerMarketingDisclosureFullscreenFragment.A02) {
                hilt_ConsumerMarketingDisclosureFullscreenFragment.A02 = true;
                AnonymousClass3DY.A00(hilt_ConsumerMarketingDisclosureFullscreenFragment);
            }
        } else if (this instanceof Hilt_StarredMessagesActivity_UnstarAllDialogFragment) {
            Hilt_StarredMessagesActivity_UnstarAllDialogFragment hilt_StarredMessagesActivity_UnstarAllDialogFragment = (Hilt_StarredMessagesActivity_UnstarAllDialogFragment) this;
            if (!hilt_StarredMessagesActivity_UnstarAllDialogFragment.A02) {
                hilt_StarredMessagesActivity_UnstarAllDialogFragment.A02 = true;
                AnonymousClass3DY.A00(hilt_StarredMessagesActivity_UnstarAllDialogFragment);
            }
        } else if (this instanceof Hilt_GoogleSearchDialogFragment) {
            Hilt_GoogleSearchDialogFragment hilt_GoogleSearchDialogFragment = (Hilt_GoogleSearchDialogFragment) this;
            if (!hilt_GoogleSearchDialogFragment.A02) {
                hilt_GoogleSearchDialogFragment.A02 = true;
                AnonymousClass3DY A0N40 = C18310x6.A0N(hilt_GoogleSearchDialogFragment);
                GoogleSearchDialogFragment googleSearchDialogFragment = (GoogleSearchDialogFragment) hilt_GoogleSearchDialogFragment;
                C64333Db r128 = ((C88854au) A0N40).A1B;
                C64333Db.Ad7(r128, googleSearchDialogFragment);
                googleSearchDialogFragment.A01 = C64333Db.A04(r128);
                googleSearchDialogFragment.A05 = C64333Db.A8y(r128);
                googleSearchDialogFragment.A03 = C64333Db.A07(r128);
                googleSearchDialogFragment.A04 = C64333Db.A4H(r128);
                googleSearchDialogFragment.A02 = (C66663Mh) r128.AUd.get();
                googleSearchDialogFragment.A00 = C64333Db.A00(r128);
            }
        } else if (this instanceof Hilt_VerifiedBusinessInfoDialogFragment) {
            Hilt_VerifiedBusinessInfoDialogFragment hilt_VerifiedBusinessInfoDialogFragment = (Hilt_VerifiedBusinessInfoDialogFragment) this;
            if (!hilt_VerifiedBusinessInfoDialogFragment.A02) {
                hilt_VerifiedBusinessInfoDialogFragment.A02 = true;
                AnonymousClass3DY A0N41 = C18310x6.A0N(hilt_VerifiedBusinessInfoDialogFragment);
                VerifiedBusinessInfoDialogFragment verifiedBusinessInfoDialogFragment = (VerifiedBusinessInfoDialogFragment) hilt_VerifiedBusinessInfoDialogFragment;
                C64333Db r129 = ((C88854au) A0N41).A1B;
                C64333Db.Ad7(r129, verifiedBusinessInfoDialogFragment);
                verifiedBusinessInfoDialogFragment.A02 = C64333Db.A4H(r129);
                verifiedBusinessInfoDialogFragment.A01 = C64333Db.A3o(r129);
                verifiedBusinessInfoDialogFragment.A00 = C64333Db.A00(r129);
                verifiedBusinessInfoDialogFragment.A03 = C64333Db.A8X(r129);
            }
        } else if (this instanceof Hilt_EncryptionChangeDialogFragment) {
            Hilt_EncryptionChangeDialogFragment hilt_EncryptionChangeDialogFragment = (Hilt_EncryptionChangeDialogFragment) this;
            if (!hilt_EncryptionChangeDialogFragment.A02) {
                hilt_EncryptionChangeDialogFragment.A02 = true;
                AnonymousClass3DY A0N42 = C18310x6.A0N(hilt_EncryptionChangeDialogFragment);
                EncryptionChangeDialogFragment encryptionChangeDialogFragment = (EncryptionChangeDialogFragment) hilt_EncryptionChangeDialogFragment;
                C64333Db r24 = ((C88854au) A0N42).A1B;
                C64333Db.Ad7(r24, encryptionChangeDialogFragment);
                encryptionChangeDialogFragment.A01 = C64333Db.A06(r24);
                encryptionChangeDialogFragment.A08 = r24.Akp();
                encryptionChangeDialogFragment.A09 = C64333Db.A4H(r24);
                encryptionChangeDialogFragment.A07 = C64333Db.A3o(r24);
                encryptionChangeDialogFragment.A00 = C64333Db.A00(r24);
                encryptionChangeDialogFragment.A02 = C64333Db.A26(r24);
                encryptionChangeDialogFragment.A0C = C64333Db.A8X(r24);
                encryptionChangeDialogFragment.A04 = C64333Db.A28(r24);
                encryptionChangeDialogFragment.A05 = (C48952fk) r24.A3e.get();
                encryptionChangeDialogFragment.A0B = (C53202mi) r24.AXV.get();
                encryptionChangeDialogFragment.A03 = (C56422rx) r24.AZn.get();
                encryptionChangeDialogFragment.A06 = C64333Db.A3G(r24);
            }
        } else if (this instanceof Hilt_SecurityNotificationDialogFragment) {
            Hilt_SecurityNotificationDialogFragment hilt_SecurityNotificationDialogFragment = (Hilt_SecurityNotificationDialogFragment) this;
            if (hilt_SecurityNotificationDialogFragment instanceof Hilt_IdentityChangeDialogFragment) {
                Hilt_IdentityChangeDialogFragment hilt_IdentityChangeDialogFragment = (Hilt_IdentityChangeDialogFragment) hilt_SecurityNotificationDialogFragment;
                if (!hilt_IdentityChangeDialogFragment.A02) {
                    hilt_IdentityChangeDialogFragment.A02 = true;
                    AnonymousClass3DY A0N43 = C18310x6.A0N(hilt_IdentityChangeDialogFragment);
                    IdentityChangeDialogFragment identityChangeDialogFragment = (IdentityChangeDialogFragment) hilt_IdentityChangeDialogFragment;
                    C64333Db r130 = ((C88854au) A0N43).A1B;
                    C64333Db.Ad7(r130, identityChangeDialogFragment);
                    C64333Db.AdD(r130, identityChangeDialogFragment);
                    identityChangeDialogFragment.A01 = (C66653Mg) r130.AN6.get();
                    identityChangeDialogFragment.A00 = (AnonymousClass318) r130.AZQ.get();
                }
            } else if (hilt_SecurityNotificationDialogFragment instanceof Hilt_DeviceUpdateDialogFragment) {
                Hilt_DeviceUpdateDialogFragment hilt_DeviceUpdateDialogFragment = (Hilt_DeviceUpdateDialogFragment) hilt_SecurityNotificationDialogFragment;
                if (!hilt_DeviceUpdateDialogFragment.A02) {
                    hilt_DeviceUpdateDialogFragment.A02 = true;
                    AnonymousClass3DY A0N44 = C18310x6.A0N(hilt_DeviceUpdateDialogFragment);
                    DeviceUpdateDialogFragment deviceUpdateDialogFragment = (DeviceUpdateDialogFragment) hilt_DeviceUpdateDialogFragment;
                    C64333Db r131 = ((C88854au) A0N44).A1B;
                    C64333Db.Ad6(r131, deviceUpdateDialogFragment);
                    C107695bk r019 = r131.A00;
                    C18300x5.A1C(r019, deviceUpdateDialogFragment);
                    C64333Db.AdD(r131, deviceUpdateDialogFragment);
                    deviceUpdateDialogFragment.A00 = (C49022fr) r019.A3R.get();
                }
            } else if (!hilt_SecurityNotificationDialogFragment.A02) {
                hilt_SecurityNotificationDialogFragment.A02 = true;
                AnonymousClass3DY A0N45 = C18310x6.A0N(hilt_SecurityNotificationDialogFragment);
                SecurityNotificationDialogFragment securityNotificationDialogFragment = (SecurityNotificationDialogFragment) hilt_SecurityNotificationDialogFragment;
                C64333Db r020 = ((C88854au) A0N45).A1B;
                C64333Db.Ad7(r020, securityNotificationDialogFragment);
                C64333Db.AdD(r020, securityNotificationDialogFragment);
            }
        } else if (this instanceof Hilt_ConversationRow_ConversationRowDialogFragment) {
            Hilt_ConversationRow_ConversationRowDialogFragment hilt_ConversationRow_ConversationRowDialogFragment = (Hilt_ConversationRow_ConversationRowDialogFragment) this;
            if (!hilt_ConversationRow_ConversationRowDialogFragment.A02) {
                hilt_ConversationRow_ConversationRowDialogFragment.A02 = true;
                AnonymousClass3DY A0N46 = C18310x6.A0N(hilt_ConversationRow_ConversationRowDialogFragment);
                ConversationRow$ConversationRowDialogFragment conversationRow$ConversationRowDialogFragment = (ConversationRow$ConversationRowDialogFragment) hilt_ConversationRow_ConversationRowDialogFragment;
                C64333Db r132 = ((C88854au) A0N46).A1B;
                C64333Db.Ad7(r132, conversationRow$ConversationRowDialogFragment);
                conversationRow$ConversationRowDialogFragment.A00 = C64333Db.A06(r132);
                conversationRow$ConversationRowDialogFragment.A01 = C64333Db.A26(r132);
                conversationRow$ConversationRowDialogFragment.A02 = C64333Db.A28(r132);
                conversationRow$ConversationRowDialogFragment.A03 = (C187958y5) r132.ASM.get();
            }
        } else if (this instanceof Hilt_ConversationRowContact_MessageSharedContactDialogFragment) {
            Hilt_ConversationRowContact_MessageSharedContactDialogFragment hilt_ConversationRowContact_MessageSharedContactDialogFragment = (Hilt_ConversationRowContact_MessageSharedContactDialogFragment) this;
            if (!hilt_ConversationRowContact_MessageSharedContactDialogFragment.A02) {
                hilt_ConversationRowContact_MessageSharedContactDialogFragment.A02 = true;
                AnonymousClass3DY A0N47 = C18310x6.A0N(hilt_ConversationRowContact_MessageSharedContactDialogFragment);
                ConversationRowContact$MessageSharedContactDialogFragment conversationRowContact$MessageSharedContactDialogFragment = (ConversationRowContact$MessageSharedContactDialogFragment) hilt_ConversationRowContact_MessageSharedContactDialogFragment;
                C64333Db r021 = ((C88854au) A0N47).A1B;
                C64333Db.Ad6(r021, conversationRowContact$MessageSharedContactDialogFragment);
                C107695bk r022 = r021.A00;
                C18300x5.A1C(r022, conversationRowContact$MessageSharedContactDialogFragment);
                conversationRowContact$MessageSharedContactDialogFragment.A00 = (C105975Xd) r022.AAt.get();
            }
        } else if (this instanceof Hilt_ChatWithBusinessInDirectoryDialogFragment) {
            Hilt_ChatWithBusinessInDirectoryDialogFragment hilt_ChatWithBusinessInDirectoryDialogFragment = (Hilt_ChatWithBusinessInDirectoryDialogFragment) this;
            if (!hilt_ChatWithBusinessInDirectoryDialogFragment.A02) {
                hilt_ChatWithBusinessInDirectoryDialogFragment.A02 = true;
                AnonymousClass3DY A0N48 = C18310x6.A0N(hilt_ChatWithBusinessInDirectoryDialogFragment);
                ChatWithBusinessInDirectoryDialogFragment chatWithBusinessInDirectoryDialogFragment = (ChatWithBusinessInDirectoryDialogFragment) hilt_ChatWithBusinessInDirectoryDialogFragment;
                C64333Db r25 = ((C88854au) A0N48).A1B;
                C64333Db.Ad6(r25, chatWithBusinessInDirectoryDialogFragment);
                C107695bk r133 = r25.A00;
                C18300x5.A1C(r133, chatWithBusinessInDirectoryDialogFragment);
                chatWithBusinessInDirectoryDialogFragment.A00 = (C116985rC) r25.AOi.get();
                chatWithBusinessInDirectoryDialogFragment.A01 = C64333Db.A00(r25);
                chatWithBusinessInDirectoryDialogFragment.A04 = C64333Db.A8X(r25);
                chatWithBusinessInDirectoryDialogFragment.A03 = (AnonymousClass25D) r25.A3f.get();
                chatWithBusinessInDirectoryDialogFragment.A02 = (C42662Pa) r133.A1Y.get();
            }
        } else if (this instanceof Hilt_BusinessTransitionInfoDialogFragment) {
            Hilt_BusinessTransitionInfoDialogFragment hilt_BusinessTransitionInfoDialogFragment = (Hilt_BusinessTransitionInfoDialogFragment) this;
            if (!hilt_BusinessTransitionInfoDialogFragment.A02) {
                hilt_BusinessTransitionInfoDialogFragment.A02 = true;
                AnonymousClass3DY A0N49 = C18310x6.A0N(hilt_BusinessTransitionInfoDialogFragment);
                BusinessTransitionInfoDialogFragment businessTransitionInfoDialogFragment = (BusinessTransitionInfoDialogFragment) hilt_BusinessTransitionInfoDialogFragment;
                C64333Db r134 = ((C88854au) A0N49).A1B;
                C64333Db.Ad7(r134, businessTransitionInfoDialogFragment);
                businessTransitionInfoDialogFragment.A04 = C64333Db.A4H(r134);
                businessTransitionInfoDialogFragment.A03 = C64333Db.A3o(r134);
                businessTransitionInfoDialogFragment.A00 = C64333Db.A00(r134);
                businessTransitionInfoDialogFragment.A06 = C64333Db.A8X(r134);
                businessTransitionInfoDialogFragment.A01 = C64333Db.A26(r134);
                businessTransitionInfoDialogFragment.A02 = C64333Db.A3G(r134);
            }
        } else if (this instanceof Hilt_CustomStickerConfirmationDialog) {
            Hilt_CustomStickerConfirmationDialog hilt_CustomStickerConfirmationDialog = (Hilt_CustomStickerConfirmationDialog) this;
            if (!hilt_CustomStickerConfirmationDialog.A02) {
                hilt_CustomStickerConfirmationDialog.A02 = true;
                AnonymousClass3DY A0N50 = C18310x6.A0N(hilt_CustomStickerConfirmationDialog);
                CustomStickerConfirmationDialog customStickerConfirmationDialog = (CustomStickerConfirmationDialog) hilt_CustomStickerConfirmationDialog;
                C88854au r135 = (C88854au) A0N50;
                C64333Db.Ad7(r135.A1B, customStickerConfirmationDialog);
                customStickerConfirmationDialog.A01 = (C39642Ct) r135.A0j.get();
            }
        } else if (this instanceof Hilt_ChangeNumberNotificationDialogFragment) {
            Hilt_ChangeNumberNotificationDialogFragment hilt_ChangeNumberNotificationDialogFragment = (Hilt_ChangeNumberNotificationDialogFragment) this;
            if (!hilt_ChangeNumberNotificationDialogFragment.A02) {
                hilt_ChangeNumberNotificationDialogFragment.A02 = true;
                AnonymousClass3DY A0N51 = C18310x6.A0N(hilt_ChangeNumberNotificationDialogFragment);
                ChangeNumberNotificationDialogFragment changeNumberNotificationDialogFragment = (ChangeNumberNotificationDialogFragment) hilt_ChangeNumberNotificationDialogFragment;
                C64333Db r136 = ((C88854au) A0N51).A1B;
                C64333Db.Ad7(r136, changeNumberNotificationDialogFragment);
                changeNumberNotificationDialogFragment.A02 = C64333Db.A2p(r136);
                changeNumberNotificationDialogFragment.A00 = C64333Db.A26(r136);
            }
        } else if (this instanceof Hilt_CapturePictureOrVideoDialogFragment) {
            Hilt_CapturePictureOrVideoDialogFragment hilt_CapturePictureOrVideoDialogFragment = (Hilt_CapturePictureOrVideoDialogFragment) this;
            if (!hilt_CapturePictureOrVideoDialogFragment.A02) {
                hilt_CapturePictureOrVideoDialogFragment.A02 = true;
                AnonymousClass3DY.A00(hilt_CapturePictureOrVideoDialogFragment);
            }
        } else if (this instanceof Hilt_InviteToGroupCallConfirmationFragment) {
            Hilt_InviteToGroupCallConfirmationFragment hilt_InviteToGroupCallConfirmationFragment = (Hilt_InviteToGroupCallConfirmationFragment) this;
            if (!hilt_InviteToGroupCallConfirmationFragment.A02) {
                hilt_InviteToGroupCallConfirmationFragment.A02 = true;
                AnonymousClass3DY A0N52 = C18310x6.A0N(hilt_InviteToGroupCallConfirmationFragment);
                InviteToGroupCallConfirmationFragment inviteToGroupCallConfirmationFragment = (InviteToGroupCallConfirmationFragment) hilt_InviteToGroupCallConfirmationFragment;
                C64333Db r137 = ((C88854au) A0N52).A1B;
                C64333Db.Ad7(r137, inviteToGroupCallConfirmationFragment);
                inviteToGroupCallConfirmationFragment.A00 = C64333Db.A26(r137);
                inviteToGroupCallConfirmationFragment.A01 = C64333Db.A28(r137);
            }
        } else if (this instanceof Hilt_PhoneNumberSelectionDialog) {
            Hilt_PhoneNumberSelectionDialog hilt_PhoneNumberSelectionDialog = (Hilt_PhoneNumberSelectionDialog) this;
            if (!hilt_PhoneNumberSelectionDialog.A02) {
                hilt_PhoneNumberSelectionDialog.A02 = true;
                AnonymousClass3DY A0N53 = C18310x6.A0N(hilt_PhoneNumberSelectionDialog);
                PhoneNumberSelectionDialog phoneNumberSelectionDialog = (PhoneNumberSelectionDialog) hilt_PhoneNumberSelectionDialog;
                C64333Db r023 = ((C88854au) A0N53).A1B;
                C64333Db.Ad7(r023, phoneNumberSelectionDialog);
                phoneNumberSelectionDialog.A01 = C64333Db.A2p(r023);
            }
        } else if (this instanceof Hilt_WifiSpeedBumpDialogFragment) {
            Hilt_WifiSpeedBumpDialogFragment hilt_WifiSpeedBumpDialogFragment = (Hilt_WifiSpeedBumpDialogFragment) this;
            if (!hilt_WifiSpeedBumpDialogFragment.A02) {
                hilt_WifiSpeedBumpDialogFragment.A02 = true;
                AnonymousClass3DY.A00(hilt_WifiSpeedBumpDialogFragment);
            }
        } else if (this instanceof Hilt_LinkedDevicesDetailDialogFragment) {
            Hilt_LinkedDevicesDetailDialogFragment hilt_LinkedDevicesDetailDialogFragment = (Hilt_LinkedDevicesDetailDialogFragment) this;
            if (!hilt_LinkedDevicesDetailDialogFragment.A02) {
                hilt_LinkedDevicesDetailDialogFragment.A02 = true;
                AnonymousClass3DY A0N54 = C18310x6.A0N(hilt_LinkedDevicesDetailDialogFragment);
                LinkedDevicesDetailDialogFragment linkedDevicesDetailDialogFragment = (LinkedDevicesDetailDialogFragment) hilt_LinkedDevicesDetailDialogFragment;
                C64333Db r138 = ((C88854au) A0N54).A1B;
                C64333Db.Ad7(r138, linkedDevicesDetailDialogFragment);
                linkedDevicesDetailDialogFragment.A06 = C64333Db.A2p(r138);
                linkedDevicesDetailDialogFragment.A03 = C64333Db.A04(r138);
                linkedDevicesDetailDialogFragment.A02 = C64333Db.A00(r138);
                linkedDevicesDetailDialogFragment.A0B = C64333Db.A8X(r138);
                linkedDevicesDetailDialogFragment.A05 = C64333Db.A2o(r138);
                linkedDevicesDetailDialogFragment.A08 = C64333Db.A3S(r138);
                linkedDevicesDetailDialogFragment.A09 = (C55802qw) r138.ALH.get();
            }
        } else if (this instanceof Hilt_CommunitySuspendDialogFragment) {
            Hilt_CommunitySuspendDialogFragment hilt_CommunitySuspendDialogFragment = (Hilt_CommunitySuspendDialogFragment) this;
            if (!hilt_CommunitySuspendDialogFragment.A02) {
                hilt_CommunitySuspendDialogFragment.A02 = true;
                AnonymousClass3DY A0N55 = C18310x6.A0N(hilt_CommunitySuspendDialogFragment);
                CommunitySuspendDialogFragment communitySuspendDialogFragment = (CommunitySuspendDialogFragment) hilt_CommunitySuspendDialogFragment;
                C64333Db r024 = ((C88854au) A0N55).A1B;
                C64333Db.Ad6(r024, communitySuspendDialogFragment);
                C107695bk r025 = r024.A00;
                C18300x5.A1C(r025, communitySuspendDialogFragment);
                communitySuspendDialogFragment.A00 = C18280x3.A0L(r025);
            }
        } else if (this instanceof Hilt_DeactivateCommunityConfirmationFragment) {
            Hilt_DeactivateCommunityConfirmationFragment hilt_DeactivateCommunityConfirmationFragment = (Hilt_DeactivateCommunityConfirmationFragment) this;
            if (!hilt_DeactivateCommunityConfirmationFragment.A02) {
                hilt_DeactivateCommunityConfirmationFragment.A02 = true;
                AnonymousClass3DY A0N56 = C18310x6.A0N(hilt_DeactivateCommunityConfirmationFragment);
                DeactivateCommunityConfirmationFragment deactivateCommunityConfirmationFragment = (DeactivateCommunityConfirmationFragment) hilt_DeactivateCommunityConfirmationFragment;
                C64333Db r139 = ((C88854au) A0N56).A1B;
                C64333Db.Ad7(r139, deactivateCommunityConfirmationFragment);
                deactivateCommunityConfirmationFragment.A01 = C64333Db.A26(r139);
                deactivateCommunityConfirmationFragment.A02 = C64333Db.A28(r139);
            }
        } else if (this instanceof Hilt_CommunityPendingSuggestionsConfirmationDialog) {
            Hilt_CommunityPendingSuggestionsConfirmationDialog hilt_CommunityPendingSuggestionsConfirmationDialog = (Hilt_CommunityPendingSuggestionsConfirmationDialog) this;
            if (!hilt_CommunityPendingSuggestionsConfirmationDialog.A02) {
                hilt_CommunityPendingSuggestionsConfirmationDialog.A02 = true;
                AnonymousClass3DY A0N57 = C18310x6.A0N(hilt_CommunityPendingSuggestionsConfirmationDialog);
                CommunityPendingSuggestionsConfirmationDialog communityPendingSuggestionsConfirmationDialog = (CommunityPendingSuggestionsConfirmationDialog) hilt_CommunityPendingSuggestionsConfirmationDialog;
                C64333Db r140 = ((C88854au) A0N57).A1B;
                C64333Db.Ad7(r140, communityPendingSuggestionsConfirmationDialog);
                communityPendingSuggestionsConfirmationDialog.A01 = C64333Db.A26(r140);
                communityPendingSuggestionsConfirmationDialog.A02 = C64333Db.A28(r140);
            }
        } else if (this instanceof Hilt_CommunityDeleteDialogFragment) {
            Hilt_CommunityDeleteDialogFragment hilt_CommunityDeleteDialogFragment = (Hilt_CommunityDeleteDialogFragment) this;
            if (!hilt_CommunityDeleteDialogFragment.A02) {
                hilt_CommunityDeleteDialogFragment.A02 = true;
                AnonymousClass3DY A0N58 = C18310x6.A0N(hilt_CommunityDeleteDialogFragment);
                CommunityDeleteDialogFragment communityDeleteDialogFragment = (CommunityDeleteDialogFragment) hilt_CommunityDeleteDialogFragment;
                C64333Db r141 = ((C88854au) A0N58).A1B;
                C64333Db.Ad7(r141, communityDeleteDialogFragment);
                communityDeleteDialogFragment.A04 = C64333Db.A2p(r141);
                communityDeleteDialogFragment.A05 = C64333Db.A2q(r141);
                communityDeleteDialogFragment.A07 = C64333Db.A8y(r141);
                communityDeleteDialogFragment.A00 = (C66663Mh) r141.AUd.get();
                communityDeleteDialogFragment.A01 = C64333Db.A08(r141);
                communityDeleteDialogFragment.A03 = C64333Db.A28(r141);
                communityDeleteDialogFragment.A02 = C64333Db.A26(r141);
                communityDeleteDialogFragment.A06 = C64333Db.A3C(r141);
            }
        } else if (this instanceof Hilt_CommunityConfirmLinkDialogFragment) {
            Hilt_CommunityConfirmLinkDialogFragment hilt_CommunityConfirmLinkDialogFragment = (Hilt_CommunityConfirmLinkDialogFragment) this;
            if (!hilt_CommunityConfirmLinkDialogFragment.A02) {
                hilt_CommunityConfirmLinkDialogFragment.A02 = true;
                AnonymousClass3DY A0N59 = C18310x6.A0N(hilt_CommunityConfirmLinkDialogFragment);
                CommunityConfirmLinkDialogFragment communityConfirmLinkDialogFragment = (CommunityConfirmLinkDialogFragment) hilt_CommunityConfirmLinkDialogFragment;
                C64333Db r142 = ((C88854au) A0N59).A1B;
                C64333Db.Ad7(r142, communityConfirmLinkDialogFragment);
                communityConfirmLinkDialogFragment.A02 = C64333Db.A39(r142);
                communityConfirmLinkDialogFragment.A01 = C64333Db.A28(r142);
            }
        } else if (this instanceof Hilt_UnarchiveForQuickLockDialogFragment) {
            Hilt_UnarchiveForQuickLockDialogFragment hilt_UnarchiveForQuickLockDialogFragment = (Hilt_UnarchiveForQuickLockDialogFragment) this;
            if (!hilt_UnarchiveForQuickLockDialogFragment.A02) {
                hilt_UnarchiveForQuickLockDialogFragment.A02 = true;
                AnonymousClass3DY.A00(hilt_UnarchiveForQuickLockDialogFragment);
            }
        } else if (this instanceof Hilt_ClearLockedChatsDialogFragment) {
            Hilt_ClearLockedChatsDialogFragment hilt_ClearLockedChatsDialogFragment = (Hilt_ClearLockedChatsDialogFragment) this;
            if (!hilt_ClearLockedChatsDialogFragment.A02) {
                hilt_ClearLockedChatsDialogFragment.A02 = true;
                AnonymousClass3DY.A00(hilt_ClearLockedChatsDialogFragment);
            }
        } else if (this instanceof Hilt_ChatsAreLockedDialogFragment) {
            Hilt_ChatsAreLockedDialogFragment hilt_ChatsAreLockedDialogFragment = (Hilt_ChatsAreLockedDialogFragment) this;
            if (!hilt_ChatsAreLockedDialogFragment.A02) {
                hilt_ChatsAreLockedDialogFragment.A02 = true;
                AnonymousClass3DY.A00(hilt_ChatsAreLockedDialogFragment);
            }
        } else if (this instanceof Hilt_ChatLockPrivacySettingsUnlockClearDialog) {
            Hilt_ChatLockPrivacySettingsUnlockClearDialog hilt_ChatLockPrivacySettingsUnlockClearDialog = (Hilt_ChatLockPrivacySettingsUnlockClearDialog) this;
            if (!hilt_ChatLockPrivacySettingsUnlockClearDialog.A02) {
                hilt_ChatLockPrivacySettingsUnlockClearDialog.A02 = true;
                AnonymousClass3DY A0N60 = C18310x6.A0N(hilt_ChatLockPrivacySettingsUnlockClearDialog);
                ChatLockPrivacySettingsUnlockClearDialog chatLockPrivacySettingsUnlockClearDialog = (ChatLockPrivacySettingsUnlockClearDialog) hilt_ChatLockPrivacySettingsUnlockClearDialog;
                C64333Db r026 = ((C88854au) A0N60).A1B;
                C64333Db.Ad7(r026, chatLockPrivacySettingsUnlockClearDialog);
                chatLockPrivacySettingsUnlockClearDialog.A01 = (AnonymousClass5UK) r026.A4p.get();
            }
        } else if (this instanceof Hilt_ChatLockForgotSecretCodeUnlockClearDialog) {
            Hilt_ChatLockForgotSecretCodeUnlockClearDialog hilt_ChatLockForgotSecretCodeUnlockClearDialog = (Hilt_ChatLockForgotSecretCodeUnlockClearDialog) this;
            if (!hilt_ChatLockForgotSecretCodeUnlockClearDialog.A02) {
                hilt_ChatLockForgotSecretCodeUnlockClearDialog.A02 = true;
                AnonymousClass3DY A0N61 = C18310x6.A0N(hilt_ChatLockForgotSecretCodeUnlockClearDialog);
                ChatLockForgotSecretCodeUnlockClearDialog chatLockForgotSecretCodeUnlockClearDialog = (ChatLockForgotSecretCodeUnlockClearDialog) hilt_ChatLockForgotSecretCodeUnlockClearDialog;
                C64333Db r027 = ((C88854au) A0N61).A1B;
                C64333Db.Ad7(r027, chatLockForgotSecretCodeUnlockClearDialog);
                chatLockForgotSecretCodeUnlockClearDialog.A02 = (AnonymousClass5UK) r027.A4p.get();
            }
        } else if (this instanceof Hilt_ChatLockForgotSecretCodeContinueUnlockClearDialog) {
            Hilt_ChatLockForgotSecretCodeContinueUnlockClearDialog hilt_ChatLockForgotSecretCodeContinueUnlockClearDialog = (Hilt_ChatLockForgotSecretCodeContinueUnlockClearDialog) this;
            if (!hilt_ChatLockForgotSecretCodeContinueUnlockClearDialog.A02) {
                hilt_ChatLockForgotSecretCodeContinueUnlockClearDialog.A02 = true;
                AnonymousClass3DY A0N62 = C18310x6.A0N(hilt_ChatLockForgotSecretCodeContinueUnlockClearDialog);
                ChatLockForgotSecretCodeContinueUnlockClearDialog chatLockForgotSecretCodeContinueUnlockClearDialog = (ChatLockForgotSecretCodeContinueUnlockClearDialog) hilt_ChatLockForgotSecretCodeContinueUnlockClearDialog;
                C64333Db r143 = ((C88854au) A0N62).A1B;
                C64333Db.Ad7(r143, chatLockForgotSecretCodeContinueUnlockClearDialog);
                chatLockForgotSecretCodeContinueUnlockClearDialog.A03 = (AnonymousClass5UK) r143.A4p.get();
                chatLockForgotSecretCodeContinueUnlockClearDialog.A02 = (C106995aW) r143.A4q.get();
            }
        } else if (this instanceof Hilt_LeakyCompanionDialogFragment) {
            Hilt_LeakyCompanionDialogFragment hilt_LeakyCompanionDialogFragment = (Hilt_LeakyCompanionDialogFragment) this;
            if (!hilt_LeakyCompanionDialogFragment.A02) {
                hilt_LeakyCompanionDialogFragment.A02 = true;
                AnonymousClass3DY.A00(hilt_LeakyCompanionDialogFragment);
            }
        } else if (this instanceof Hilt_ChatNowLockedDialogFragment) {
            Hilt_ChatNowLockedDialogFragment hilt_ChatNowLockedDialogFragment = (Hilt_ChatNowLockedDialogFragment) this;
            if (!hilt_ChatNowLockedDialogFragment.A02) {
                hilt_ChatNowLockedDialogFragment.A02 = true;
                AnonymousClass3DY.A00(hilt_ChatNowLockedDialogFragment);
            }
        } else if (this instanceof Hilt_EncryptionExplanationDialogFragment) {
            Hilt_EncryptionExplanationDialogFragment hilt_EncryptionExplanationDialogFragment = (Hilt_EncryptionExplanationDialogFragment) this;
            if (!hilt_EncryptionExplanationDialogFragment.A02) {
                hilt_EncryptionExplanationDialogFragment.A02 = true;
                AnonymousClass3DY A0N63 = C18310x6.A0N(hilt_EncryptionExplanationDialogFragment);
                EncryptionExplanationDialogFragment encryptionExplanationDialogFragment = (EncryptionExplanationDialogFragment) hilt_EncryptionExplanationDialogFragment;
                C64333Db r144 = ((C88854au) A0N63).A1B;
                C64333Db.Ad7(r144, encryptionExplanationDialogFragment);
                encryptionExplanationDialogFragment.A02 = C64333Db.A3o(r144);
                encryptionExplanationDialogFragment.A03 = r144.Akp();
                encryptionExplanationDialogFragment.A00 = C64333Db.A00(r144);
                encryptionExplanationDialogFragment.A01 = C64333Db.A26(r144);
                encryptionExplanationDialogFragment.A05 = C64333Db.A8X(r144);
                encryptionExplanationDialogFragment.A04 = (C53202mi) r144.AXV.get();
            }
        } else if (this instanceof Hilt_ViewPhotoOrStatusDialogFragment) {
            Hilt_ViewPhotoOrStatusDialogFragment hilt_ViewPhotoOrStatusDialogFragment = (Hilt_ViewPhotoOrStatusDialogFragment) this;
            if (!hilt_ViewPhotoOrStatusDialogFragment.A02) {
                hilt_ViewPhotoOrStatusDialogFragment.A02 = true;
                AnonymousClass3DY.A00(hilt_ViewPhotoOrStatusDialogFragment);
            }
        } else if (this instanceof Hilt_ChatMediaVisibilityOffDialog) {
            Hilt_ChatMediaVisibilityOffDialog hilt_ChatMediaVisibilityOffDialog = (Hilt_ChatMediaVisibilityOffDialog) this;
            if (!hilt_ChatMediaVisibilityOffDialog.A02) {
                hilt_ChatMediaVisibilityOffDialog.A02 = true;
                AnonymousClass3DY.A00(hilt_ChatMediaVisibilityOffDialog);
            }
        } else if (this instanceof Hilt_ChatMediaVisibilityDialog) {
            Hilt_ChatMediaVisibilityDialog hilt_ChatMediaVisibilityDialog = (Hilt_ChatMediaVisibilityDialog) this;
            if (!hilt_ChatMediaVisibilityDialog.A02) {
                hilt_ChatMediaVisibilityDialog.A02 = true;
                AnonymousClass3DY A0N64 = C18310x6.A0N(hilt_ChatMediaVisibilityDialog);
                ChatMediaVisibilityDialog chatMediaVisibilityDialog = (ChatMediaVisibilityDialog) hilt_ChatMediaVisibilityDialog;
                C64333Db r028 = ((C88854au) A0N64).A1B;
                C64333Db.Ad7(r028, chatMediaVisibilityDialog);
                chatMediaVisibilityDialog.A04 = (AnonymousClass1R1) r028.A56.get();
            }
        } else if (this instanceof Hilt_JoinableEducationDialogFragment) {
            Hilt_JoinableEducationDialogFragment hilt_JoinableEducationDialogFragment = (Hilt_JoinableEducationDialogFragment) this;
            if (!hilt_JoinableEducationDialogFragment.A02) {
                hilt_JoinableEducationDialogFragment.A02 = true;
                AnonymousClass3DY.A00(hilt_JoinableEducationDialogFragment);
            }
        } else if (this instanceof Hilt_AppSettingsWarningDialogFragment) {
            Hilt_AppSettingsWarningDialogFragment hilt_AppSettingsWarningDialogFragment = (Hilt_AppSettingsWarningDialogFragment) this;
            if (!hilt_AppSettingsWarningDialogFragment.A02) {
                hilt_AppSettingsWarningDialogFragment.A02 = true;
                AnonymousClass3DY A0N65 = C18310x6.A0N(hilt_AppSettingsWarningDialogFragment);
                AppSettingsWarningDialogFragment appSettingsWarningDialogFragment = (AppSettingsWarningDialogFragment) hilt_AppSettingsWarningDialogFragment;
                C64333Db r029 = ((C88854au) A0N65).A1B;
                C64333Db.Ad7(r029, appSettingsWarningDialogFragment);
                appSettingsWarningDialogFragment.A01 = C64333Db.A2o(r029);
            }
        } else if (this instanceof Hilt_CallSpamActivity_ReportSpamOrBlockDialogFragment) {
            Hilt_CallSpamActivity_ReportSpamOrBlockDialogFragment hilt_CallSpamActivity_ReportSpamOrBlockDialogFragment = (Hilt_CallSpamActivity_ReportSpamOrBlockDialogFragment) this;
            if (!hilt_CallSpamActivity_ReportSpamOrBlockDialogFragment.A02) {
                hilt_CallSpamActivity_ReportSpamOrBlockDialogFragment.A02 = true;
                AnonymousClass3DY A0N66 = C18310x6.A0N(hilt_CallSpamActivity_ReportSpamOrBlockDialogFragment);
                CallSpamActivity.ReportSpamOrBlockDialogFragment reportSpamOrBlockDialogFragment = (CallSpamActivity.ReportSpamOrBlockDialogFragment) hilt_CallSpamActivity_ReportSpamOrBlockDialogFragment;
                C88854au r3 = (C88854au) A0N66;
                C64333Db r26 = r3.A1B;
                C64333Db.Ad7(r26, reportSpamOrBlockDialogFragment);
                reportSpamOrBlockDialogFragment.A02 = C64333Db.A04(r26);
                reportSpamOrBlockDialogFragment.A0G = C64333Db.A8y(r26);
                reportSpamOrBlockDialogFragment.A05 = C64333Db.A26(r26);
                reportSpamOrBlockDialogFragment.A06 = C64333Db.A28(r26);
                reportSpamOrBlockDialogFragment.A0F = (AnonymousClass2QX) r26.AWH.get();
                reportSpamOrBlockDialogFragment.A03 = (C56962sq) r26.A2b.get();
                reportSpamOrBlockDialogFragment.A08 = C64333Db.A3D(r26);
                reportSpamOrBlockDialogFragment.A0E = (C60892zL) r26.A2f.get();
                reportSpamOrBlockDialogFragment.A0A = r3.A7N();
                reportSpamOrBlockDialogFragment.A0D = (C619933b) r26.ALS.get();
                reportSpamOrBlockDialogFragment.A07 = (C54122oD) r26.A6t.get();
                reportSpamOrBlockDialogFragment.A04 = C64333Db.A24(r26);
            }
        } else if (this instanceof Hilt_CallConfirmationFragment) {
            Hilt_CallConfirmationFragment hilt_CallConfirmationFragment = (Hilt_CallConfirmationFragment) this;
            if (!hilt_CallConfirmationFragment.A02) {
                hilt_CallConfirmationFragment.A02 = true;
                AnonymousClass3DY A0N67 = C18310x6.A0N(hilt_CallConfirmationFragment);
                CallConfirmationFragment callConfirmationFragment = (CallConfirmationFragment) hilt_CallConfirmationFragment;
                C64333Db r145 = ((C88854au) A0N67).A1B;
                C64333Db.Ad7(r145, callConfirmationFragment);
                callConfirmationFragment.A00 = C64333Db.A06(r145);
                callConfirmationFragment.A01 = (C1230066r) r145.A4Q.get();
                callConfirmationFragment.A02 = C64333Db.A26(r145);
                callConfirmationFragment.A03 = C64333Db.A2s(r145);
                callConfirmationFragment.A04 = C64333Db.A3G(r145);
            }
        } else if (this instanceof Hilt_CallsHistoryClearCallLogDialogFragment) {
            Hilt_CallsHistoryClearCallLogDialogFragment hilt_CallsHistoryClearCallLogDialogFragment = (Hilt_CallsHistoryClearCallLogDialogFragment) this;
            if (!hilt_CallsHistoryClearCallLogDialogFragment.A02) {
                hilt_CallsHistoryClearCallLogDialogFragment.A02 = true;
                AnonymousClass3DY A0N68 = C18310x6.A0N(hilt_CallsHistoryClearCallLogDialogFragment);
                CallsHistoryClearCallLogDialogFragment callsHistoryClearCallLogDialogFragment = (CallsHistoryClearCallLogDialogFragment) hilt_CallsHistoryClearCallLogDialogFragment;
                C64333Db r32 = ((C88854au) A0N68).A1B;
                C64333Db.Ad6(r32, callsHistoryClearCallLogDialogFragment);
                C107695bk r146 = r32.A00;
                C18300x5.A1C(r146, callsHistoryClearCallLogDialogFragment);
                callsHistoryClearCallLogDialogFragment.A02 = C64333Db.A2p(r32);
                callsHistoryClearCallLogDialogFragment.A00 = C64333Db.A04(r32);
                callsHistoryClearCallLogDialogFragment.A06 = C64333Db.A8y(r32);
                callsHistoryClearCallLogDialogFragment.A01 = (C112415jh) r32.Aa3.get();
                callsHistoryClearCallLogDialogFragment.A07 = (C29111iI) r32.A4D.get();
                callsHistoryClearCallLogDialogFragment.A03 = (C56762sW) r32.A4R.get();
                callsHistoryClearCallLogDialogFragment.A04 = (C55422qK) r32.AUG.get();
                callsHistoryClearCallLogDialogFragment.A05 = (AnonymousClass3XI) r146.A7g.get();
            }
        } else if (this instanceof Hilt_BackwardCompatDialog) {
            Hilt_BackwardCompatDialog hilt_BackwardCompatDialog = (Hilt_BackwardCompatDialog) this;
            if (!hilt_BackwardCompatDialog.A02) {
                hilt_BackwardCompatDialog.A02 = true;
                AnonymousClass3DY A0N69 = C18310x6.A0N(hilt_BackwardCompatDialog);
                BackwardCompatDialog backwardCompatDialog = (BackwardCompatDialog) hilt_BackwardCompatDialog;
                C64333Db r030 = ((C88854au) A0N69).A1B;
                C64333Db.Ad7(r030, backwardCompatDialog);
                backwardCompatDialog.A00 = (C50382i5) r030.AZG.get();
            }
        } else if (this instanceof Hilt_FLMConsentErrorDialogFragment) {
            Hilt_FLMConsentErrorDialogFragment hilt_FLMConsentErrorDialogFragment = (Hilt_FLMConsentErrorDialogFragment) this;
            if (!hilt_FLMConsentErrorDialogFragment.A02) {
                hilt_FLMConsentErrorDialogFragment.A02 = true;
                AnonymousClass3DY.A00(hilt_FLMConsentErrorDialogFragment);
            }
        } else if (this instanceof Hilt_ClearLocationDialogFragment) {
            Hilt_ClearLocationDialogFragment hilt_ClearLocationDialogFragment = (Hilt_ClearLocationDialogFragment) this;
            if (!hilt_ClearLocationDialogFragment.A02) {
                hilt_ClearLocationDialogFragment.A02 = true;
                AnonymousClass3DY A0N70 = C18310x6.A0N(hilt_ClearLocationDialogFragment);
                ClearLocationDialogFragment clearLocationDialogFragment = (ClearLocationDialogFragment) hilt_ClearLocationDialogFragment;
                C64333Db r031 = ((C88854au) A0N70).A1B;
                C64333Db.Ad6(r031, clearLocationDialogFragment);
                C107695bk r032 = r031.A00;
                C18300x5.A1C(r032, clearLocationDialogFragment);
                clearLocationDialogFragment.A00 = (AnonymousClass7Vq) r032.A0x.get();
            }
        } else if (this instanceof Hilt_UnblockDialogFragment) {
            Hilt_UnblockDialogFragment hilt_UnblockDialogFragment = (Hilt_UnblockDialogFragment) this;
            if (!hilt_UnblockDialogFragment.A02) {
                hilt_UnblockDialogFragment.A02 = true;
                AnonymousClass3DY.A00(hilt_UnblockDialogFragment);
            }
        } else if (this instanceof Hilt_BlockReasonListFragment) {
            Hilt_BlockReasonListFragment hilt_BlockReasonListFragment = (Hilt_BlockReasonListFragment) this;
            if (!hilt_BlockReasonListFragment.A02) {
                hilt_BlockReasonListFragment.A02 = true;
                AnonymousClass3DY A0N71 = C18310x6.A0N(hilt_BlockReasonListFragment);
                BlockReasonListFragment blockReasonListFragment = (BlockReasonListFragment) hilt_BlockReasonListFragment;
                C64333Db r27 = ((C88854au) A0N71).A1B;
                C64333Db.Ad6(r27, blockReasonListFragment);
                C107695bk r147 = r27.A00;
                C18300x5.A1C(r147, blockReasonListFragment);
                blockReasonListFragment.A02 = C64333Db.A04(r27);
                blockReasonListFragment.A0B = C64333Db.A8y(r27);
                blockReasonListFragment.A08 = C64333Db.A3o(r27);
                blockReasonListFragment.A04 = C64333Db.A26(r27);
                blockReasonListFragment.A09 = r27.Akp();
                blockReasonListFragment.A06 = C64333Db.A2o(r27);
                blockReasonListFragment.A05 = C64333Db.A28(r27);
                blockReasonListFragment.A0A = C64333Db.A74(r27);
                blockReasonListFragment.A07 = (AnonymousClass487) r147.A9c.get();
            }
        } else if (this instanceof Hilt_ReportProductDialogFragment) {
            Hilt_ReportProductDialogFragment hilt_ReportProductDialogFragment = (Hilt_ReportProductDialogFragment) this;
            if (!hilt_ReportProductDialogFragment.A02) {
                hilt_ReportProductDialogFragment.A02 = true;
                AnonymousClass3DY.A00(hilt_ReportProductDialogFragment);
            }
        } else if (this instanceof Hilt_ProductReportReasonDialogFragment) {
            Hilt_ProductReportReasonDialogFragment hilt_ProductReportReasonDialogFragment = (Hilt_ProductReportReasonDialogFragment) this;
            if (!hilt_ProductReportReasonDialogFragment.A02) {
                hilt_ProductReportReasonDialogFragment.A02 = true;
                AnonymousClass3DY A0N72 = C18310x6.A0N(hilt_ProductReportReasonDialogFragment);
                ProductReportReasonDialogFragment productReportReasonDialogFragment = (ProductReportReasonDialogFragment) hilt_ProductReportReasonDialogFragment;
                C64333Db r033 = ((C88854au) A0N72).A1B;
                C64333Db.Ad7(r033, productReportReasonDialogFragment);
                productReportReasonDialogFragment.A01 = C64333Db.A04(r033);
            }
        } else if (this instanceof Hilt_AvatarProfilePhotoErrorDialog) {
            Hilt_AvatarProfilePhotoErrorDialog hilt_AvatarProfilePhotoErrorDialog = (Hilt_AvatarProfilePhotoErrorDialog) this;
            if (!hilt_AvatarProfilePhotoErrorDialog.A02) {
                hilt_AvatarProfilePhotoErrorDialog.A02 = true;
                AnonymousClass3DY.A00(hilt_AvatarProfilePhotoErrorDialog);
            }
        } else if (this instanceof Hilt_VerifyTwoFactorAuthCodeDialogFragment) {
            Hilt_VerifyTwoFactorAuthCodeDialogFragment hilt_VerifyTwoFactorAuthCodeDialogFragment = (Hilt_VerifyTwoFactorAuthCodeDialogFragment) this;
            if (!hilt_VerifyTwoFactorAuthCodeDialogFragment.A02) {
                hilt_VerifyTwoFactorAuthCodeDialogFragment.A02 = true;
                AnonymousClass3DY A0N73 = C18310x6.A0N(hilt_VerifyTwoFactorAuthCodeDialogFragment);
                VerifyTwoFactorAuthCodeDialogFragment verifyTwoFactorAuthCodeDialogFragment = (VerifyTwoFactorAuthCodeDialogFragment) hilt_VerifyTwoFactorAuthCodeDialogFragment;
                C64333Db r28 = ((C88854au) A0N73).A1B;
                C64333Db.Ad6(r28, verifyTwoFactorAuthCodeDialogFragment);
                C107695bk r148 = r28.A00;
                C18300x5.A1C(r148, verifyTwoFactorAuthCodeDialogFragment);
                verifyTwoFactorAuthCodeDialogFragment.A04 = C64333Db.A04(r28);
                verifyTwoFactorAuthCodeDialogFragment.A07 = C64333Db.A8y(r28);
                verifyTwoFactorAuthCodeDialogFragment.A05 = C64333Db.A2o(r28);
                verifyTwoFactorAuthCodeDialogFragment.A06 = (C613130e) r148.ABh.get();
            }
        } else if (this instanceof Hilt_SetupDeviceAuthDialog) {
            Hilt_SetupDeviceAuthDialog hilt_SetupDeviceAuthDialog = (Hilt_SetupDeviceAuthDialog) this;
            if (!hilt_SetupDeviceAuthDialog.A02) {
                hilt_SetupDeviceAuthDialog.A02 = true;
                AnonymousClass3DY A0N74 = C18310x6.A0N(hilt_SetupDeviceAuthDialog);
                SetupDeviceAuthDialog setupDeviceAuthDialog = (SetupDeviceAuthDialog) hilt_SetupDeviceAuthDialog;
                C64333Db r034 = ((C88854au) A0N74).A1B;
                C64333Db.Ad7(r034, setupDeviceAuthDialog);
                setupDeviceAuthDialog.A00 = (C105275Ug) r034.A0q.get();
            }
        } else if (this instanceof Hilt_DeleteAccountFeedback_ChangeNumberMessageDialogFragment) {
            Hilt_DeleteAccountFeedback_ChangeNumberMessageDialogFragment hilt_DeleteAccountFeedback_ChangeNumberMessageDialogFragment = (Hilt_DeleteAccountFeedback_ChangeNumberMessageDialogFragment) this;
            if (!hilt_DeleteAccountFeedback_ChangeNumberMessageDialogFragment.A02) {
                hilt_DeleteAccountFeedback_ChangeNumberMessageDialogFragment.A02 = true;
                AnonymousClass3DY.A00(hilt_DeleteAccountFeedback_ChangeNumberMessageDialogFragment);
            }
        } else if (this instanceof Hilt_SingleSelectionDialogFragment) {
            Hilt_SingleSelectionDialogFragment hilt_SingleSelectionDialogFragment = (Hilt_SingleSelectionDialogFragment) this;
            if (hilt_SingleSelectionDialogFragment instanceof Hilt_WallpaperSetConfirmationDialogFragment) {
                Hilt_WallpaperSetConfirmationDialogFragment hilt_WallpaperSetConfirmationDialogFragment = (Hilt_WallpaperSetConfirmationDialogFragment) hilt_SingleSelectionDialogFragment;
                if (!hilt_WallpaperSetConfirmationDialogFragment.A02) {
                    hilt_WallpaperSetConfirmationDialogFragment.A02 = true;
                    AnonymousClass3DY.A00(hilt_WallpaperSetConfirmationDialogFragment);
                }
            } else if (hilt_SingleSelectionDialogFragment instanceof Hilt_VideoQualityConfirmationDialogFragment) {
                Hilt_VideoQualityConfirmationDialogFragment hilt_VideoQualityConfirmationDialogFragment = (Hilt_VideoQualityConfirmationDialogFragment) hilt_SingleSelectionDialogFragment;
                if (!hilt_VideoQualityConfirmationDialogFragment.A02) {
                    hilt_VideoQualityConfirmationDialogFragment.A02 = true;
                    AnonymousClass3DY.A00(hilt_VideoQualityConfirmationDialogFragment);
                }
            } else if (hilt_SingleSelectionDialogFragment instanceof Hilt_PhotoQualityConfirmationDialogFragment) {
                Hilt_PhotoQualityConfirmationDialogFragment hilt_PhotoQualityConfirmationDialogFragment = (Hilt_PhotoQualityConfirmationDialogFragment) hilt_SingleSelectionDialogFragment;
                if (!hilt_PhotoQualityConfirmationDialogFragment.A02) {
                    hilt_PhotoQualityConfirmationDialogFragment.A02 = true;
                    AnonymousClass3DY.A00(hilt_PhotoQualityConfirmationDialogFragment);
                }
            } else if (!hilt_SingleSelectionDialogFragment.A02) {
                hilt_SingleSelectionDialogFragment.A02 = true;
                AnonymousClass3DY.A00(hilt_SingleSelectionDialogFragment);
            }
        } else if (this instanceof Hilt_SimpleExternalStorageStateCallback_SDCardUnavailableDialogFragment) {
            Hilt_SimpleExternalStorageStateCallback_SDCardUnavailableDialogFragment hilt_SimpleExternalStorageStateCallback_SDCardUnavailableDialogFragment = (Hilt_SimpleExternalStorageStateCallback_SDCardUnavailableDialogFragment) this;
            if (!hilt_SimpleExternalStorageStateCallback_SDCardUnavailableDialogFragment.A02) {
                hilt_SimpleExternalStorageStateCallback_SDCardUnavailableDialogFragment.A02 = true;
                AnonymousClass3DY A0N75 = C18310x6.A0N(hilt_SimpleExternalStorageStateCallback_SDCardUnavailableDialogFragment);
                SimpleExternalStorageStateCallback$SDCardUnavailableDialogFragment simpleExternalStorageStateCallback$SDCardUnavailableDialogFragment = (SimpleExternalStorageStateCallback$SDCardUnavailableDialogFragment) hilt_SimpleExternalStorageStateCallback_SDCardUnavailableDialogFragment;
                C64333Db r035 = ((C88854au) A0N75).A1B;
                C64333Db.Ad7(r035, simpleExternalStorageStateCallback$SDCardUnavailableDialogFragment);
                simpleExternalStorageStateCallback$SDCardUnavailableDialogFragment.A00 = (C61072zf) r035.AXI.get();
            }
        } else if (this instanceof Hilt_SimpleExternalStorageStateCallback_PermissionDeniedDialogFragment) {
            Hilt_SimpleExternalStorageStateCallback_PermissionDeniedDialogFragment hilt_SimpleExternalStorageStateCallback_PermissionDeniedDialogFragment = (Hilt_SimpleExternalStorageStateCallback_PermissionDeniedDialogFragment) this;
            if (!hilt_SimpleExternalStorageStateCallback_PermissionDeniedDialogFragment.A02) {
                hilt_SimpleExternalStorageStateCallback_PermissionDeniedDialogFragment.A02 = true;
                AnonymousClass3DY.A00(hilt_SimpleExternalStorageStateCallback_PermissionDeniedDialogFragment);
            }
        } else if (this instanceof Hilt_RevokeLinkConfirmationDialogFragment) {
            Hilt_RevokeLinkConfirmationDialogFragment hilt_RevokeLinkConfirmationDialogFragment = (Hilt_RevokeLinkConfirmationDialogFragment) this;
            if (!hilt_RevokeLinkConfirmationDialogFragment.A02) {
                hilt_RevokeLinkConfirmationDialogFragment.A02 = true;
                AnonymousClass3DY A0N76 = C18310x6.A0N(hilt_RevokeLinkConfirmationDialogFragment);
                RevokeLinkConfirmationDialogFragment revokeLinkConfirmationDialogFragment = (RevokeLinkConfirmationDialogFragment) hilt_RevokeLinkConfirmationDialogFragment;
                C64333Db r149 = ((C88854au) A0N76).A1B;
                C64333Db.Ad7(r149, revokeLinkConfirmationDialogFragment);
                revokeLinkConfirmationDialogFragment.A00 = C64333Db.A26(r149);
                revokeLinkConfirmationDialogFragment.A01 = C64333Db.A28(r149);
                revokeLinkConfirmationDialogFragment.A02 = C64333Db.A8w(r149);
            }
        } else if (this instanceof Hilt_DisplayExceptionDialogFactory_UnsupportedDeviceDialogFragment) {
            Hilt_DisplayExceptionDialogFactory_UnsupportedDeviceDialogFragment hilt_DisplayExceptionDialogFactory_UnsupportedDeviceDialogFragment = (Hilt_DisplayExceptionDialogFactory_UnsupportedDeviceDialogFragment) this;
            if (!hilt_DisplayExceptionDialogFactory_UnsupportedDeviceDialogFragment.A02) {
                hilt_DisplayExceptionDialogFactory_UnsupportedDeviceDialogFragment.A02 = true;
                AnonymousClass3DY.A00(hilt_DisplayExceptionDialogFactory_UnsupportedDeviceDialogFragment);
            }
        } else if (this instanceof Hilt_DisplayExceptionDialogFactory_SoftwareExpiredDialogFragment) {
            Hilt_DisplayExceptionDialogFactory_SoftwareExpiredDialogFragment hilt_DisplayExceptionDialogFactory_SoftwareExpiredDialogFragment = (Hilt_DisplayExceptionDialogFactory_SoftwareExpiredDialogFragment) this;
            if (!hilt_DisplayExceptionDialogFactory_SoftwareExpiredDialogFragment.A02) {
                hilt_DisplayExceptionDialogFactory_SoftwareExpiredDialogFragment.A02 = true;
                AnonymousClass3DY A0N77 = C18310x6.A0N(hilt_DisplayExceptionDialogFactory_SoftwareExpiredDialogFragment);
                DisplayExceptionDialogFactory$SoftwareExpiredDialogFragment displayExceptionDialogFactory$SoftwareExpiredDialogFragment = (DisplayExceptionDialogFactory$SoftwareExpiredDialogFragment) hilt_DisplayExceptionDialogFactory_SoftwareExpiredDialogFragment;
                C64333Db r29 = ((C88854au) A0N77).A1B;
                C64333Db.Ad6(r29, displayExceptionDialogFactory$SoftwareExpiredDialogFragment);
                C107695bk r150 = r29.A00;
                C18300x5.A1C(r150, displayExceptionDialogFactory$SoftwareExpiredDialogFragment);
                displayExceptionDialogFactory$SoftwareExpiredDialogFragment.A05 = C64333Db.A2p(r29);
                displayExceptionDialogFactory$SoftwareExpiredDialogFragment.A02 = (C50382i5) r29.AZG.get();
                displayExceptionDialogFactory$SoftwareExpiredDialogFragment.A06 = C64333Db.A4H(r29);
                displayExceptionDialogFactory$SoftwareExpiredDialogFragment.A01 = (AnonymousClass5XU) r29.AU0.get();
                displayExceptionDialogFactory$SoftwareExpiredDialogFragment.A00 = C64333Db.A00(r29);
                displayExceptionDialogFactory$SoftwareExpiredDialogFragment.A04 = C64333Db.A2o(r29);
                displayExceptionDialogFactory$SoftwareExpiredDialogFragment.A03 = C18280x3.A0L(r150);
            }
        } else if (this instanceof Hilt_DisplayExceptionDialogFactory_SoftwareAboutToExpireDialogFragment) {
            Hilt_DisplayExceptionDialogFactory_SoftwareAboutToExpireDialogFragment hilt_DisplayExceptionDialogFactory_SoftwareAboutToExpireDialogFragment = (Hilt_DisplayExceptionDialogFactory_SoftwareAboutToExpireDialogFragment) this;
            if (!hilt_DisplayExceptionDialogFactory_SoftwareAboutToExpireDialogFragment.A02) {
                hilt_DisplayExceptionDialogFactory_SoftwareAboutToExpireDialogFragment.A02 = true;
                AnonymousClass3DY A0N78 = C18310x6.A0N(hilt_DisplayExceptionDialogFactory_SoftwareAboutToExpireDialogFragment);
                DisplayExceptionDialogFactory$SoftwareAboutToExpireDialogFragment displayExceptionDialogFactory$SoftwareAboutToExpireDialogFragment = (DisplayExceptionDialogFactory$SoftwareAboutToExpireDialogFragment) hilt_DisplayExceptionDialogFactory_SoftwareAboutToExpireDialogFragment;
                C64333Db r036 = ((C88854au) A0N78).A1B;
                C64333Db.Ad6(r036, displayExceptionDialogFactory$SoftwareAboutToExpireDialogFragment);
                C107695bk r151 = r036.A00;
                C18300x5.A1C(r151, displayExceptionDialogFactory$SoftwareAboutToExpireDialogFragment);
                displayExceptionDialogFactory$SoftwareAboutToExpireDialogFragment.A01 = (C50382i5) r036.AZG.get();
                displayExceptionDialogFactory$SoftwareAboutToExpireDialogFragment.A00 = (AnonymousClass5Z5) r151.AB0.get();
            }
        } else if (this instanceof Hilt_DisplayExceptionDialogFactory_DoNotShareCodeDialogFragment) {
            Hilt_DisplayExceptionDialogFactory_DoNotShareCodeDialogFragment hilt_DisplayExceptionDialogFactory_DoNotShareCodeDialogFragment = (Hilt_DisplayExceptionDialogFactory_DoNotShareCodeDialogFragment) this;
            if (!hilt_DisplayExceptionDialogFactory_DoNotShareCodeDialogFragment.A02) {
                hilt_DisplayExceptionDialogFactory_DoNotShareCodeDialogFragment.A02 = true;
                AnonymousClass3DY A0N79 = C18310x6.A0N(hilt_DisplayExceptionDialogFactory_DoNotShareCodeDialogFragment);
                DisplayExceptionDialogFactory$DoNotShareCodeDialogFragment displayExceptionDialogFactory$DoNotShareCodeDialogFragment = (DisplayExceptionDialogFactory$DoNotShareCodeDialogFragment) hilt_DisplayExceptionDialogFactory_DoNotShareCodeDialogFragment;
                C64333Db r152 = ((C88854au) A0N79).A1B;
                C64333Db.Ad7(r152, displayExceptionDialogFactory$DoNotShareCodeDialogFragment);
                displayExceptionDialogFactory$DoNotShareCodeDialogFragment.A00 = C64333Db.A00(r152);
                displayExceptionDialogFactory$DoNotShareCodeDialogFragment.A01 = C64333Db.A8X(r152);
            }
        } else if (this instanceof Hilt_DisplayExceptionDialogFactory_ContactBlockedDialogFragment) {
            Hilt_DisplayExceptionDialogFactory_ContactBlockedDialogFragment hilt_DisplayExceptionDialogFactory_ContactBlockedDialogFragment = (Hilt_DisplayExceptionDialogFactory_ContactBlockedDialogFragment) this;
            if (!hilt_DisplayExceptionDialogFactory_ContactBlockedDialogFragment.A02) {
                hilt_DisplayExceptionDialogFactory_ContactBlockedDialogFragment.A02 = true;
                AnonymousClass3DY A0N80 = C18310x6.A0N(hilt_DisplayExceptionDialogFactory_ContactBlockedDialogFragment);
                DisplayExceptionDialogFactory$ContactBlockedDialogFragment displayExceptionDialogFactory$ContactBlockedDialogFragment = (DisplayExceptionDialogFactory$ContactBlockedDialogFragment) hilt_DisplayExceptionDialogFactory_ContactBlockedDialogFragment;
                C64333Db r037 = ((C88854au) A0N80).A1B;
                C64333Db.Ad7(r037, displayExceptionDialogFactory$ContactBlockedDialogFragment);
                displayExceptionDialogFactory$ContactBlockedDialogFragment.A00 = (C56962sq) r037.A2b.get();
            }
        } else if (this instanceof Hilt_DisplayExceptionDialogFactory_ClockWrongDialogFragment) {
            Hilt_DisplayExceptionDialogFactory_ClockWrongDialogFragment hilt_DisplayExceptionDialogFactory_ClockWrongDialogFragment = (Hilt_DisplayExceptionDialogFactory_ClockWrongDialogFragment) this;
            if (!hilt_DisplayExceptionDialogFactory_ClockWrongDialogFragment.A02) {
                hilt_DisplayExceptionDialogFactory_ClockWrongDialogFragment.A02 = true;
                AnonymousClass3DY A0N81 = C18310x6.A0N(hilt_DisplayExceptionDialogFactory_ClockWrongDialogFragment);
                DisplayExceptionDialogFactory$ClockWrongDialogFragment displayExceptionDialogFactory$ClockWrongDialogFragment = (DisplayExceptionDialogFactory$ClockWrongDialogFragment) hilt_DisplayExceptionDialogFactory_ClockWrongDialogFragment;
                C64333Db r153 = ((C88854au) A0N81).A1B;
                C64333Db.Ad7(r153, displayExceptionDialogFactory$ClockWrongDialogFragment);
                displayExceptionDialogFactory$ClockWrongDialogFragment.A02 = C64333Db.A2p(r153);
                displayExceptionDialogFactory$ClockWrongDialogFragment.A00 = (AnonymousClass5XU) r153.AU0.get();
                displayExceptionDialogFactory$ClockWrongDialogFragment.A01 = C64333Db.A2o(r153);
            }
        } else if (this instanceof Hilt_ContentDistributionRecipientsPickerActivity_DiscardChangesConfirmationDialogFragment) {
            Hilt_ContentDistributionRecipientsPickerActivity_DiscardChangesConfirmationDialogFragment hilt_ContentDistributionRecipientsPickerActivity_DiscardChangesConfirmationDialogFragment = (Hilt_ContentDistributionRecipientsPickerActivity_DiscardChangesConfirmationDialogFragment) this;
            if (!hilt_ContentDistributionRecipientsPickerActivity_DiscardChangesConfirmationDialogFragment.A02) {
                hilt_ContentDistributionRecipientsPickerActivity_DiscardChangesConfirmationDialogFragment.A02 = true;
                AnonymousClass3DY.A00(hilt_ContentDistributionRecipientsPickerActivity_DiscardChangesConfirmationDialogFragment);
            }
        } else if (this instanceof Hilt_BaseMessageDialogFragment) {
            Hilt_BaseMessageDialogFragment hilt_BaseMessageDialogFragment = (Hilt_BaseMessageDialogFragment) this;
            if (hilt_BaseMessageDialogFragment instanceof Hilt_ReportToAdminDialogFragment) {
                Hilt_ReportToAdminDialogFragment hilt_ReportToAdminDialogFragment = (Hilt_ReportToAdminDialogFragment) hilt_BaseMessageDialogFragment;
                if (!hilt_ReportToAdminDialogFragment.A02) {
                    hilt_ReportToAdminDialogFragment.A02 = true;
                    AnonymousClass3DY A0N82 = C18310x6.A0N(hilt_ReportToAdminDialogFragment);
                    ReportToAdminDialogFragment reportToAdminDialogFragment = (ReportToAdminDialogFragment) hilt_ReportToAdminDialogFragment;
                    C88854au r4 = (C88854au) A0N82;
                    C64333Db r33 = r4.A1B;
                    C64333Db.Ad6(r33, reportToAdminDialogFragment);
                    C107695bk r154 = r33.A00;
                    C18300x5.A1C(r154, reportToAdminDialogFragment);
                    reportToAdminDialogFragment.A00 = C64333Db.A04(r33);
                    reportToAdminDialogFragment.A04 = r4.A18.AD6();
                    reportToAdminDialogFragment.A03 = r154.ANp();
                    reportToAdminDialogFragment.A01 = r33.Ajc();
                    reportToAdminDialogFragment.A05 = C64333Db.A8F(r33);
                }
            } else if (hilt_BaseMessageDialogFragment instanceof Hilt_DeleteEnforcedMessageDialogFragment) {
                Hilt_DeleteEnforcedMessageDialogFragment hilt_DeleteEnforcedMessageDialogFragment = (Hilt_DeleteEnforcedMessageDialogFragment) hilt_BaseMessageDialogFragment;
                if (!hilt_DeleteEnforcedMessageDialogFragment.A02) {
                    hilt_DeleteEnforcedMessageDialogFragment.A02 = true;
                    AnonymousClass3DY A0N83 = C18310x6.A0N(hilt_DeleteEnforcedMessageDialogFragment);
                    DeleteEnforcedMessageDialogFragment deleteEnforcedMessageDialogFragment = (DeleteEnforcedMessageDialogFragment) hilt_DeleteEnforcedMessageDialogFragment;
                    C64333Db r155 = ((C88854au) A0N83).A1B;
                    C64333Db.Ad7(r155, deleteEnforcedMessageDialogFragment);
                    deleteEnforcedMessageDialogFragment.A03 = C64333Db.A8y(r155);
                    deleteEnforcedMessageDialogFragment.A00 = C64333Db.A08(r155);
                    deleteEnforcedMessageDialogFragment.A01 = C64333Db.A3D(r155);
                    deleteEnforcedMessageDialogFragment.A02 = C64333Db.A8F(r155);
                }
            } else if (hilt_BaseMessageDialogFragment instanceof Hilt_LegacyMessageDialogFragment) {
                Hilt_LegacyMessageDialogFragment hilt_LegacyMessageDialogFragment = (Hilt_LegacyMessageDialogFragment) hilt_BaseMessageDialogFragment;
                if (!hilt_LegacyMessageDialogFragment.A02) {
                    hilt_LegacyMessageDialogFragment.A02 = true;
                    AnonymousClass3DY A0N84 = C18310x6.A0N(hilt_LegacyMessageDialogFragment);
                    LegacyMessageDialogFragment legacyMessageDialogFragment = (LegacyMessageDialogFragment) hilt_LegacyMessageDialogFragment;
                    C64333Db r038 = ((C88854au) A0N84).A1B;
                    C64333Db.Ad7(r038, legacyMessageDialogFragment);
                    legacyMessageDialogFragment.A02 = C64333Db.A3o(r038);
                }
            } else if (!hilt_BaseMessageDialogFragment.A02) {
                hilt_BaseMessageDialogFragment.A02 = true;
                AnonymousClass3DY.A00(hilt_BaseMessageDialogFragment);
            }
        } else if (!this.A02) {
            this.A02 = true;
            C64333Db.Ad7(((C88854au) C18310x6.A0N(this)).A1B, (WaDialogFragment) this);
        }
    }

    public final Object generatedComponent() {
        if (this.A04 == null) {
            synchronized (this.A03) {
                if (this.A04 == null) {
                    this.A04 = C18330xA.A03(this);
                }
            }
        }
        return this.A04.generatedComponent();
    }

    public Context A1D() {
        if (super.A1D() == null && !this.A01) {
            return null;
        }
        A03();
        return this.A00;
    }

    public LayoutInflater A1E(Bundle bundle) {
        return C18270x1.A06(super.A1E(bundle), this);
    }

    public void A1G(Context context) {
        super.A1G(context);
        A03();
        A1R();
    }

    public C17190ui B6u() {
        return AnonymousClass5VY.A01(this, super.B6u());
    }
}
