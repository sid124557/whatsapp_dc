package X;

import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import com.facebook.msys.mci.DefaultCrypto;

/* renamed from: X.6c8  reason: invalid class name and case insensitive filesystem */
public final class C130536c8 extends C130546c9 implements C181378mf {
    public C130536c8() {
        super(C130766cV.DEFAULT_INSTANCE);
    }

    public void A0B() {
        C130766cV A00 = A00(this);
        A00.bitField0_ |= 1;
        A00.appVersion_ = "2.23.26.14";
    }

    public static C130766cV A00(C130546c9 r0) {
        r0.A07();
        return (C130766cV) r0.A00;
    }

    public void A09() {
        C130766cV A00 = A00(this);
        A00.bitField1_ |= 16;
        A00.alterMessageEphemeralSettingToMessageEphemeralSettingRemoveColumnMigrationFinished_ = true;
    }

    public void A0A() {
        C130766cV A00 = A00(this);
        A00.bitField1_ |= 8;
        A00.alterMessageEphemeralToMessageEphemeralRemoveColumnMigrationFinished_ = true;
    }

    public void A0C() {
        C130766cV A00 = A00(this);
        A00.bitField0_ |= Integer.MIN_VALUE;
        A00.mediaMigrationFixerMigrationFinished_ = true;
    }

    public void A0D() {
        C130766cV A00 = A00(this);
        A00.bitField1_ |= 2;
        A00.messageMainVerificationMigrationFinished_ = true;
    }

    public void A0E(int i) {
        C130766cV A00 = A00(this);
        A00.bitField0_ |= 8;
        A00.backupVersion_ = i;
    }

    public void A0F(String str) {
        C130766cV A00 = A00(this);
        A00.bitField0_ |= 4;
        A00.jidSuffix_ = str;
    }

    public void A0G(boolean z) {
        C130766cV A00 = A00(this);
        A00.bitField0_ |= 128;
        A00.blankMeJidMigrationFinished_ = z;
    }

    public void A0H(boolean z) {
        C130766cV A00 = A00(this);
        A00.bitField0_ |= 2097152;
        A00.broadcastMeJidMigrationFinished_ = z;
    }

    public void A0I(boolean z) {
        C130766cV A00 = A00(this);
        A00.bitField0_ |= 16;
        A00.callLogMigrationFinished_ = z;
    }

    public void A0J(boolean z) {
        C130766cV A00 = A00(this);
        A00.bitField1_ |= 64;
        A00.cleanedDb_ = z;
    }

    public void A0K(boolean z) {
        C130766cV A00 = A00(this);
        A00.bitField0_ |= 32;
        A00.labeledJidMigrationFinished_ = z;
    }

    public void A0L(boolean z) {
        C130766cV A00 = A00(this);
        A00.bitField0_ |= 4194304;
        A00.messageFrequentMigrationFinished_ = z;
    }

    public void A0M(boolean z) {
        C130766cV A00 = A00(this);
        A00.bitField0_ |= 64;
        A00.messageFtsMigrationFinished_ = z;
    }

    public void A0N(boolean z) {
        C130766cV A00 = A00(this);
        A00.bitField0_ |= 32768;
        A00.messageFutureMigrationFinished_ = z;
    }

    public void A0O(boolean z) {
        C130766cV A00 = A00(this);
        A00.bitField0_ |= 256;
        A00.messageLinkMigrationFinished_ = z;
    }

    public void A0P(boolean z) {
        C130766cV A00 = A00(this);
        A00.bitField0_ |= 8388608;
        A00.messageLocationMigrationFinished_ = z;
    }

    public void A0Q(boolean z) {
        C130766cV A00 = A00(this);
        A00.bitField0_ |= 512;
        A00.messageMainMigrationFinished_ = z;
    }

    public void A0R(boolean z) {
        C130766cV A00 = A00(this);
        A00.bitField0_ |= DefaultCrypto.BUFFER_SIZE;
        A00.messageMediaMigrationFinished_ = z;
    }

    public void A0S(boolean z) {
        C130766cV A00 = A00(this);
        A00.bitField0_ |= 524288;
        A00.messageMentionMigrationFinished_ = z;
    }

    public void A0T(boolean z) {
        C130766cV A00 = A00(this);
        A00.bitField0_ |= 65536;
        A00.messageQuotedMigrationFinished_ = z;
    }

    public void A0U(boolean z) {
        C130766cV A00 = A00(this);
        A00.bitField0_ |= 1048576;
        A00.messageRevokedMigrationFinished_ = z;
    }

    public void A0V(boolean z) {
        C130766cV A00 = A00(this);
        A00.bitField0_ |= 67108864;
        A00.messageSendCountMigrationFinished_ = z;
    }

    public void A0W(boolean z) {
        C130766cV A00 = A00(this);
        A00.bitField0_ |= AnonymousClass35S.A0F;
        A00.messageSystemMigrationFinished_ = z;
    }

    public void A0X(boolean z) {
        C130766cV A00 = A00(this);
        A00.bitField0_ |= EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH;
        A00.messageTextMigrationFinished_ = z;
    }

    public void A0Y(boolean z) {
        C130766cV A00 = A00(this);
        A00.bitField0_ |= 33554432;
        A00.messageThumbnailMigrationFinished_ = z;
    }

    public void A0Z(boolean z) {
        C130766cV A00 = A00(this);
        A00.bitField0_ |= 16384;
        A00.messageVcardMigrationFinished_ = z;
    }

    public void A0a(boolean z) {
        C130766cV A00 = A00(this);
        A00.bitField0_ |= 536870912;
        A00.migrationChatStoreMigrationFinished_ = z;
    }

    public void A0b(boolean z) {
        C130766cV A00 = A00(this);
        A00.bitField0_ |= 134217728;
        A00.migrationJidStoreMigrationFinished_ = z;
    }

    public void A0c(boolean z) {
        C130766cV A00 = A00(this);
        A00.bitField0_ |= EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH;
        A00.missedCallsMigrationFinished_ = z;
    }

    public void A0d(boolean z) {
        C130766cV A00 = A00(this);
        A00.bitField0_ |= EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING;
        A00.participantUserMigrationFinished_ = z;
    }

    public void A0e(boolean z) {
        C130766cV A00 = A00(this);
        A00.bitField0_ |= 268435456;
        A00.paymentTransactionMigrationFinished_ = z;
    }

    public void A0f(boolean z) {
        C130766cV A00 = A00(this);
        A00.bitField0_ |= 1073741824;
        A00.quotedOrderMessageMigrationFinished_ = z;
    }

    public void A0g(boolean z) {
        C130766cV A00 = A00(this);
        A00.bitField1_ |= 1;
        A00.quotedOrderMessageV2MigrationFinished_ = z;
    }

    public void A0h(boolean z) {
        C130766cV A00 = A00(this);
        A00.bitField1_ |= 4;
        A00.quotedUiElementsReplyMessageMigrationFinished_ = z;
    }

    public void A0i(boolean z) {
        C130766cV A00 = A00(this);
        A00.bitField0_ |= 262144;
        A00.receiptDeviceMigrationFinished_ = z;
    }

    public void A0j(boolean z) {
        C130766cV A00 = A00(this);
        A00.bitField0_ |= ZipDecompressor.UNZIP_BUFFER_SIZE;
        A00.receiptUserMigrationFinished_ = z;
    }
}
