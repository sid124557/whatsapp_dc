package X;

/* renamed from: X.6cV  reason: invalid class name and case insensitive filesystem */
public final class C130766cV extends C130786cX implements C181378mf {
    public static final int ALTER_MESSAGE_EPHEMERAL_SETTING_TO_MESSAGE_EPHEMERAL_SETTING_REMOVE_COLUMN_MIGRATION_FINISHED_FIELD_NUMBER = 37;
    public static final int ALTER_MESSAGE_EPHEMERAL_TO_MESSAGE_EPHEMERAL_REMOVE_COLUMN_MIGRATION_FINISHED_FIELD_NUMBER = 36;
    public static final int APP_VERSION_FIELD_NUMBER = 1;
    public static final int BACKUP_EXPORT_FILE_SIZE_FIELD_NUMBER = 38;
    public static final int BACKUP_VERSION_FIELD_NUMBER = 4;
    public static final int BLANK_ME_JID_MIGRATION_FINISHED_FIELD_NUMBER = 8;
    public static final int BROADCAST_ME_JID_MIGRATION_FINISHED_FIELD_NUMBER = 22;
    public static final int CALL_LOG_MIGRATION_FINISHED_FIELD_NUMBER = 5;
    public static final int CLEANED_DB_FIELD_NUMBER = 39;
    public static final C130766cV DEFAULT_INSTANCE;
    public static final int DEVICE_MODEL_FIELD_NUMBER = 2;
    public static final int JID_SUFFIX_FIELD_NUMBER = 3;
    public static final int LABELED_JID_MIGRATION_FINISHED_FIELD_NUMBER = 6;
    public static final int MEDIA_MIGRATION_FIXER_MIGRATION_FINISHED_FIELD_NUMBER = 32;
    public static final int MESSAGE_FREQUENT_MIGRATION_FINISHED_FIELD_NUMBER = 23;
    public static final int MESSAGE_FTS_MIGRATION_FINISHED_FIELD_NUMBER = 7;
    public static final int MESSAGE_FUTURE_MIGRATION_FINISHED_FIELD_NUMBER = 16;
    public static final int MESSAGE_LINK_MIGRATION_FINISHED_FIELD_NUMBER = 9;
    public static final int MESSAGE_LOCATION_MIGRATION_FINISHED_FIELD_NUMBER = 24;
    public static final int MESSAGE_MAIN_MIGRATION_FINISHED_FIELD_NUMBER = 10;
    public static final int MESSAGE_MAIN_VERIFICATION_MIGRATION_FINISHED_FIELD_NUMBER = 34;
    public static final int MESSAGE_MEDIA_MIGRATION_FINISHED_FIELD_NUMBER = 14;
    public static final int MESSAGE_MENTION_MIGRATION_FINISHED_FIELD_NUMBER = 20;
    public static final int MESSAGE_QUOTED_MIGRATION_FINISHED_FIELD_NUMBER = 17;
    public static final int MESSAGE_REVOKED_MIGRATION_FINISHED_FIELD_NUMBER = 21;
    public static final int MESSAGE_SEND_COUNT_MIGRATION_FINISHED_FIELD_NUMBER = 27;
    public static final int MESSAGE_SYSTEM_MIGRATION_FINISHED_FIELD_NUMBER = 18;
    public static final int MESSAGE_TEXT_MIGRATION_FINISHED_FIELD_NUMBER = 11;
    public static final int MESSAGE_THUMBNAIL_MIGRATION_FINISHED_FIELD_NUMBER = 26;
    public static final int MESSAGE_VCARD_MIGRATION_FINISHED_FIELD_NUMBER = 15;
    public static final int MIGRATION_CHAT_STORE_MIGRATION_FINISHED_FIELD_NUMBER = 30;
    public static final int MIGRATION_JID_STORE_MIGRATION_FINISHED_FIELD_NUMBER = 28;
    public static final int MISSED_CALLS_MIGRATION_FINISHED_FIELD_NUMBER = 12;
    public static volatile C178978iP PARSER = null;
    public static final int PARTICIPANT_USER_MIGRATION_FINISHED_FIELD_NUMBER = 25;
    public static final int PAYMENT_TRANSACTION_MIGRATION_FINISHED_FIELD_NUMBER = 29;
    public static final int QUOTED_ORDER_MESSAGE_MIGRATION_FINISHED_FIELD_NUMBER = 31;
    public static final int QUOTED_ORDER_MESSAGE_V2_MIGRATION_FINISHED_FIELD_NUMBER = 33;
    public static final int QUOTED_UI_ELEMENTS_REPLY_MESSAGE_MIGRATION_FINISHED_FIELD_NUMBER = 35;
    public static final int RECEIPT_DEVICE_MIGRATION_FINISHED_FIELD_NUMBER = 19;
    public static final int RECEIPT_USER_MIGRATION_FINISHED_FIELD_NUMBER = 13;
    public boolean alterMessageEphemeralSettingToMessageEphemeralSettingRemoveColumnMigrationFinished_;
    public boolean alterMessageEphemeralToMessageEphemeralRemoveColumnMigrationFinished_;
    public String appVersion_ = "";
    public long backupExportFileSize_;
    public int backupVersion_;
    public int bitField0_;
    public int bitField1_;
    public boolean blankMeJidMigrationFinished_;
    public boolean broadcastMeJidMigrationFinished_;
    public boolean callLogMigrationFinished_;
    public boolean cleanedDb_;
    public String deviceModel_ = "";
    public String jidSuffix_ = "";
    public boolean labeledJidMigrationFinished_;
    public boolean mediaMigrationFixerMigrationFinished_;
    public boolean messageFrequentMigrationFinished_;
    public boolean messageFtsMigrationFinished_;
    public boolean messageFutureMigrationFinished_;
    public boolean messageLinkMigrationFinished_;
    public boolean messageLocationMigrationFinished_;
    public boolean messageMainMigrationFinished_;
    public boolean messageMainVerificationMigrationFinished_;
    public boolean messageMediaMigrationFinished_;
    public boolean messageMentionMigrationFinished_;
    public boolean messageQuotedMigrationFinished_;
    public boolean messageRevokedMigrationFinished_;
    public boolean messageSendCountMigrationFinished_;
    public boolean messageSystemMigrationFinished_;
    public boolean messageTextMigrationFinished_;
    public boolean messageThumbnailMigrationFinished_;
    public boolean messageVcardMigrationFinished_;
    public boolean migrationChatStoreMigrationFinished_;
    public boolean migrationJidStoreMigrationFinished_;
    public boolean missedCallsMigrationFinished_;
    public boolean participantUserMigrationFinished_;
    public boolean paymentTransactionMigrationFinished_;
    public boolean quotedOrderMessageMigrationFinished_;
    public boolean quotedOrderMessageV2MigrationFinished_;
    public boolean quotedUiElementsReplyMessageMigrationFinished_;
    public boolean receiptDeviceMigrationFinished_;
    public boolean receiptUserMigrationFinished_;

    static {
        C130766cV r1 = new C130766cV();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, C130766cV.class);
    }

    public static C130536c8 A00() {
        return (C130536c8) DEFAULT_INSTANCE.A0G();
    }

    public int A0M() {
        return this.backupVersion_;
    }

    public String A0N() {
        return this.jidSuffix_;
    }

    public boolean A0O() {
        return this.alterMessageEphemeralSettingToMessageEphemeralSettingRemoveColumnMigrationFinished_;
    }

    public boolean A0P() {
        return this.alterMessageEphemeralToMessageEphemeralRemoveColumnMigrationFinished_;
    }

    public boolean A0Q() {
        return this.blankMeJidMigrationFinished_;
    }

    public boolean A0R() {
        return this.broadcastMeJidMigrationFinished_;
    }

    public boolean A0S() {
        return this.callLogMigrationFinished_;
    }

    public boolean A0T() {
        return this.labeledJidMigrationFinished_;
    }

    public boolean A0U() {
        return this.messageFrequentMigrationFinished_;
    }

    public boolean A0V() {
        return this.messageFtsMigrationFinished_;
    }

    public boolean A0W() {
        return this.messageFutureMigrationFinished_;
    }

    public boolean A0X() {
        return this.messageLinkMigrationFinished_;
    }

    public boolean A0Y() {
        return this.messageLocationMigrationFinished_;
    }

    public boolean A0Z() {
        return this.messageMainMigrationFinished_;
    }

    public boolean A0a() {
        return this.messageMainVerificationMigrationFinished_;
    }

    public boolean A0b() {
        return this.messageMediaMigrationFinished_;
    }

    public boolean A0c() {
        return this.messageMentionMigrationFinished_;
    }

    public boolean A0d() {
        return this.messageQuotedMigrationFinished_;
    }

    public boolean A0e() {
        return this.messageRevokedMigrationFinished_;
    }

    public boolean A0f() {
        return this.messageSendCountMigrationFinished_;
    }

    public boolean A0g() {
        return this.messageSystemMigrationFinished_;
    }

    public boolean A0h() {
        return this.messageTextMigrationFinished_;
    }

    public boolean A0i() {
        return this.messageThumbnailMigrationFinished_;
    }

    public boolean A0j() {
        return this.messageVcardMigrationFinished_;
    }

    public boolean A0k() {
        return this.migrationChatStoreMigrationFinished_;
    }

    public boolean A0l() {
        return this.migrationJidStoreMigrationFinished_;
    }

    public boolean A0m() {
        return this.missedCallsMigrationFinished_;
    }

    public boolean A0n() {
        return this.participantUserMigrationFinished_;
    }

    public boolean A0o() {
        return this.paymentTransactionMigrationFinished_;
    }

    public boolean A0p() {
        return this.quotedOrderMessageMigrationFinished_;
    }

    public boolean A0q() {
        return this.quotedOrderMessageV2MigrationFinished_;
    }

    public boolean A0r() {
        return this.quotedUiElementsReplyMessageMigrationFinished_;
    }

    public boolean A0s() {
        return this.receiptDeviceMigrationFinished_;
    }

    public boolean A0t() {
        return this.receiptUserMigrationFinished_;
    }

    public boolean A0u() {
        return AnonymousClass000.A1S(this.bitField0_ & 8);
    }

    public boolean A0v() {
        return AnonymousClass000.A1S(this.bitField0_ & 4);
    }
}
