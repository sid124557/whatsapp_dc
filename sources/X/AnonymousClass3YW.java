package X;

import com.whatsapp.addons.di.AddOnBridgeModule;
import com.whatsapp.authcommon.di.CommonModule;
import com.whatsapp.authgraphql.di.UnifiedAuthenticationModule;
import com.whatsapp.avatar.di.AvatarModule;
import com.whatsapp.biz.BusinessProductModule;
import com.whatsapp.biz.di.DCEncryptedModule;
import com.whatsapp.bridge.wafflex.di.WaffleXProductModule;
import com.whatsapp.bridge.wfs.di.WfsProductReleaseModule;
import com.whatsapp.chatinfo.di.ActivityModule;
import com.whatsapp.conversation.conversationrow.nativeflow.NativeFlowActionModule;
import com.whatsapp.conversation.di.ConversationUiModule;
import com.whatsapp.core.di.TimeModule;
import com.whatsapp.cron.di.CronModule;
import com.whatsapp.dailyevent.di.DailyEventModule;
import com.whatsapp.data.di.QuotedMessageStoreModule;
import com.whatsapp.data.di.TextMessageDatabaseMigrationModule;
import com.whatsapp.data.migration.di.ForceMigrationModule;
import com.whatsapp.data.transactionlock.TransactionLockModule;
import com.whatsapp.dbmigration.di.DatabaseMigrationModule;
import com.whatsapp.dependencybridge.di.DependencyBridgeModule;
import com.whatsapp.di.CompanionModeModule;
import com.whatsapp.di.JidMapperProviderModule;
import com.whatsapp.di.MigrationModule;
import com.whatsapp.di.SearchModule;
import com.whatsapp.event.EventChatInfoModule;
import com.whatsapp.fieldstats.di.InfraABPropsModule;
import com.whatsapp.fmessage.di.FMessageRegistrationsModule;
import com.whatsapp.fmessage.factory.di.FMessageCloneModule;
import com.whatsapp.fmessage.factory.di.FMessageFactoryModule;
import com.whatsapp.fmessage.forward.di.FMessageForwardingSubsystemModule;
import com.whatsapp.fmessage.platform.di.FMessagePlatformModule;
import com.whatsapp.fmessage.platform.registration.di.FMessagePlatformRegistrationModule;
import com.whatsapp.fmessage.systemmessage.platform.registration.di.SystemMessagePlatformRegistrationModule;
import com.whatsapp.gifsearch.di.GifSearchModule;
import com.whatsapp.indiaupi.di.IndiaUpiModule;
import com.whatsapp.integrity.di.IntegrityModule;
import com.whatsapp.integritysignals.di.IntegritySignalsModule;
import com.whatsapp.media.dailyusage.di.MediaDailyUsageModule;
import com.whatsapp.notification.di.OtpNotificationModule;
import com.whatsapp.p2mlite.di.P2mLiteModule;
import com.whatsapp.pininchat.subsystem.di.PinInChatSubsystemModule;
import com.whatsapp.preloads.di.PreloadsReleaseModule;
import com.whatsapp.preview.di.PreviewSubsystemModule;
import com.whatsapp.reply.render.di.ReplyRenderModule;
import com.whatsapp.reply.subsystem.di.ReplySubsystemModule;
import com.whatsapp.stickers.di.RecentStickersModule;
import com.whatsapp.systemmessage.di.SystemMessageRegistrationsModule;
import com.whatsapp.systemmessage.factory.di.SystemMessageFactoryModule;
import com.whatsapp.wabloks.commerce.di.CommerceBloksModule;
import com.whatsapp.wabloks.commerce.phoenix.external.directconnection.ExtensionsProductModule;
import com.whatsapp.waffle.accountlinking.di.WfalProdInfraModule;
import com.whatsapp.waffle.wfac.di.WfacProductReleaseModule;
import com.whatsapp.waquickpromotionsdk.filters.di.WaQuickPromotionFilterModule;
import com.whatsapp.workmanager.WaWorkManagerModule;
import com.whatsapp.xfamily.graphql.di.XFamilyGQLModule;

/* renamed from: X.3YW  reason: invalid class name */
public final class AnonymousClass3YW implements AnonymousClass4C0 {
    public final AnonymousClass2ER A00;
    public final Object A01 = AnonymousClass002.A0D();
    public volatile Object A02;

    public Object generatedComponent() {
        if (this.A02 == null) {
            synchronized (this.A01) {
                if (this.A02 == null) {
                    AnonymousClass2ER r0 = this.A00;
                    C47672dd r14 = new C47672dd();
                    r14.A0t = new AnonymousClass2J5(r0.A00);
                    if (r14.A08 == null) {
                        r14.A08 = new ActivityModule();
                    }
                    if (r14.A00 == null) {
                        r14.A00 = new AddOnBridgeModule();
                    }
                    AvatarModule avatarModule = r14.A03;
                    AvatarModule avatarModule2 = avatarModule;
                    if (avatarModule == null) {
                        avatarModule2 = new AvatarModule();
                        r14.A03 = avatarModule2;
                    }
                    BusinessProductModule businessProductModule = r14.A04;
                    BusinessProductModule businessProductModule2 = businessProductModule;
                    if (businessProductModule == null) {
                        businessProductModule2 = new BusinessProductModule();
                        r14.A04 = businessProductModule2;
                    }
                    CommerceBloksModule commerceBloksModule = r14.A0m;
                    CommerceBloksModule commerceBloksModule2 = commerceBloksModule;
                    if (commerceBloksModule == null) {
                        commerceBloksModule2 = new CommerceBloksModule();
                        r14.A0m = commerceBloksModule2;
                    }
                    CommonModule commonModule = r14.A01;
                    CommonModule commonModule2 = commonModule;
                    if (commonModule == null) {
                        commonModule2 = new CommonModule();
                        r14.A01 = commonModule2;
                    }
                    CompanionModeModule companionModeModule = r14.A0K;
                    CompanionModeModule companionModeModule2 = companionModeModule;
                    if (companionModeModule == null) {
                        companionModeModule2 = new CompanionModeModule();
                        r14.A0K = companionModeModule2;
                    }
                    ConversationUiModule conversationUiModule = r14.A0A;
                    ConversationUiModule conversationUiModule2 = conversationUiModule;
                    if (conversationUiModule == null) {
                        conversationUiModule2 = new ConversationUiModule();
                        r14.A0A = conversationUiModule2;
                    }
                    CronModule cronModule = r14.A0C;
                    CronModule cronModule2 = cronModule;
                    if (cronModule == null) {
                        cronModule2 = new CronModule();
                        r14.A0C = cronModule2;
                    }
                    DCEncryptedModule dCEncryptedModule = r14.A05;
                    DCEncryptedModule dCEncryptedModule2 = dCEncryptedModule;
                    if (dCEncryptedModule == null) {
                        dCEncryptedModule2 = new DCEncryptedModule();
                        r14.A05 = dCEncryptedModule2;
                    }
                    DailyEventModule dailyEventModule = r14.A0D;
                    DailyEventModule dailyEventModule2 = dailyEventModule;
                    if (dailyEventModule == null) {
                        dailyEventModule2 = new DailyEventModule();
                        r14.A0D = dailyEventModule2;
                    }
                    DatabaseMigrationModule databaseMigrationModule = r14.A0I;
                    DatabaseMigrationModule databaseMigrationModule2 = databaseMigrationModule;
                    if (databaseMigrationModule == null) {
                        databaseMigrationModule2 = new DatabaseMigrationModule();
                        r14.A0I = databaseMigrationModule2;
                    }
                    DependencyBridgeModule dependencyBridgeModule = r14.A0J;
                    DependencyBridgeModule dependencyBridgeModule2 = dependencyBridgeModule;
                    if (dependencyBridgeModule == null) {
                        dependencyBridgeModule2 = new DependencyBridgeModule();
                        r14.A0J = dependencyBridgeModule2;
                    }
                    EventChatInfoModule eventChatInfoModule = r14.A0O;
                    EventChatInfoModule eventChatInfoModule2 = eventChatInfoModule;
                    if (eventChatInfoModule == null) {
                        eventChatInfoModule2 = new EventChatInfoModule();
                        r14.A0O = eventChatInfoModule2;
                    }
                    ExtensionsProductModule extensionsProductModule = r14.A0n;
                    ExtensionsProductModule extensionsProductModule2 = extensionsProductModule;
                    if (extensionsProductModule == null) {
                        extensionsProductModule2 = new ExtensionsProductModule();
                        r14.A0n = extensionsProductModule2;
                    }
                    FMessageCloneModule fMessageCloneModule = r14.A0R;
                    FMessageCloneModule fMessageCloneModule2 = fMessageCloneModule;
                    if (fMessageCloneModule == null) {
                        fMessageCloneModule2 = new FMessageCloneModule();
                        r14.A0R = fMessageCloneModule2;
                    }
                    FMessageFactoryModule fMessageFactoryModule = r14.A0S;
                    FMessageFactoryModule fMessageFactoryModule2 = fMessageFactoryModule;
                    if (fMessageFactoryModule == null) {
                        fMessageFactoryModule2 = new FMessageFactoryModule();
                        r14.A0S = fMessageFactoryModule2;
                    }
                    FMessageForwardingSubsystemModule fMessageForwardingSubsystemModule = r14.A0T;
                    FMessageForwardingSubsystemModule fMessageForwardingSubsystemModule2 = fMessageForwardingSubsystemModule;
                    if (fMessageForwardingSubsystemModule == null) {
                        fMessageForwardingSubsystemModule2 = new FMessageForwardingSubsystemModule();
                        r14.A0T = fMessageForwardingSubsystemModule2;
                    }
                    FMessagePlatformModule fMessagePlatformModule = r14.A0U;
                    FMessagePlatformModule fMessagePlatformModule2 = fMessagePlatformModule;
                    if (fMessagePlatformModule == null) {
                        fMessagePlatformModule2 = new FMessagePlatformModule();
                        r14.A0U = fMessagePlatformModule2;
                    }
                    FMessagePlatformRegistrationModule fMessagePlatformRegistrationModule = r14.A0V;
                    FMessagePlatformRegistrationModule fMessagePlatformRegistrationModule2 = fMessagePlatformRegistrationModule;
                    if (fMessagePlatformRegistrationModule == null) {
                        fMessagePlatformRegistrationModule2 = new FMessagePlatformRegistrationModule();
                        r14.A0V = fMessagePlatformRegistrationModule2;
                    }
                    FMessageRegistrationsModule fMessageRegistrationsModule = r14.A0Q;
                    FMessageRegistrationsModule fMessageRegistrationsModule2 = fMessageRegistrationsModule;
                    if (fMessageRegistrationsModule == null) {
                        fMessageRegistrationsModule2 = new FMessageRegistrationsModule();
                        r14.A0Q = fMessageRegistrationsModule2;
                    }
                    ForceMigrationModule forceMigrationModule = r14.A0G;
                    ForceMigrationModule forceMigrationModule2 = forceMigrationModule;
                    if (forceMigrationModule == null) {
                        forceMigrationModule2 = new ForceMigrationModule();
                        r14.A0G = forceMigrationModule2;
                    }
                    GifSearchModule gifSearchModule = r14.A0X;
                    GifSearchModule gifSearchModule2 = gifSearchModule;
                    if (gifSearchModule == null) {
                        gifSearchModule2 = new GifSearchModule();
                        r14.A0X = gifSearchModule2;
                    }
                    IndiaUpiModule indiaUpiModule = r14.A0Y;
                    IndiaUpiModule indiaUpiModule2 = indiaUpiModule;
                    if (indiaUpiModule == null) {
                        indiaUpiModule2 = new IndiaUpiModule();
                        r14.A0Y = indiaUpiModule2;
                    }
                    InfraABPropsModule infraABPropsModule = r14.A0P;
                    InfraABPropsModule infraABPropsModule2 = infraABPropsModule;
                    if (infraABPropsModule == null) {
                        infraABPropsModule2 = new InfraABPropsModule();
                        r14.A0P = infraABPropsModule2;
                    }
                    IntegrityModule integrityModule = r14.A0Z;
                    IntegrityModule integrityModule2 = integrityModule;
                    if (integrityModule == null) {
                        integrityModule2 = new IntegrityModule();
                        r14.A0Z = integrityModule2;
                    }
                    IntegritySignalsModule integritySignalsModule = r14.A0a;
                    IntegritySignalsModule integritySignalsModule2 = integritySignalsModule;
                    if (integritySignalsModule == null) {
                        integritySignalsModule2 = new IntegritySignalsModule();
                        r14.A0a = integritySignalsModule2;
                    }
                    JidMapperProviderModule jidMapperProviderModule = r14.A0L;
                    JidMapperProviderModule jidMapperProviderModule2 = jidMapperProviderModule;
                    if (jidMapperProviderModule == null) {
                        jidMapperProviderModule2 = new JidMapperProviderModule();
                        r14.A0L = jidMapperProviderModule2;
                    }
                    MediaDailyUsageModule mediaDailyUsageModule = r14.A0b;
                    MediaDailyUsageModule mediaDailyUsageModule2 = mediaDailyUsageModule;
                    if (mediaDailyUsageModule == null) {
                        mediaDailyUsageModule2 = new MediaDailyUsageModule();
                        r14.A0b = mediaDailyUsageModule2;
                    }
                    MigrationModule migrationModule = r14.A0M;
                    MigrationModule migrationModule2 = migrationModule;
                    if (migrationModule == null) {
                        migrationModule2 = new MigrationModule();
                        r14.A0M = migrationModule2;
                    }
                    NativeFlowActionModule nativeFlowActionModule = r14.A09;
                    NativeFlowActionModule nativeFlowActionModule2 = nativeFlowActionModule;
                    if (nativeFlowActionModule == null) {
                        nativeFlowActionModule2 = new NativeFlowActionModule();
                        r14.A09 = nativeFlowActionModule2;
                    }
                    OtpNotificationModule otpNotificationModule = r14.A0c;
                    OtpNotificationModule otpNotificationModule2 = otpNotificationModule;
                    if (otpNotificationModule == null) {
                        otpNotificationModule2 = new OtpNotificationModule();
                        r14.A0c = otpNotificationModule2;
                    }
                    P2mLiteModule p2mLiteModule = r14.A0d;
                    P2mLiteModule p2mLiteModule2 = p2mLiteModule;
                    if (p2mLiteModule == null) {
                        p2mLiteModule2 = new P2mLiteModule();
                        r14.A0d = p2mLiteModule2;
                    }
                    PinInChatSubsystemModule pinInChatSubsystemModule = r14.A0e;
                    PinInChatSubsystemModule pinInChatSubsystemModule2 = pinInChatSubsystemModule;
                    if (pinInChatSubsystemModule == null) {
                        pinInChatSubsystemModule2 = new PinInChatSubsystemModule();
                        r14.A0e = pinInChatSubsystemModule2;
                    }
                    PreloadsReleaseModule preloadsReleaseModule = r14.A0f;
                    PreloadsReleaseModule preloadsReleaseModule2 = preloadsReleaseModule;
                    if (preloadsReleaseModule == null) {
                        preloadsReleaseModule2 = new PreloadsReleaseModule();
                        r14.A0f = preloadsReleaseModule2;
                    }
                    PreviewSubsystemModule previewSubsystemModule = r14.A0g;
                    PreviewSubsystemModule previewSubsystemModule2 = previewSubsystemModule;
                    if (previewSubsystemModule == null) {
                        previewSubsystemModule2 = new PreviewSubsystemModule();
                        r14.A0g = previewSubsystemModule2;
                    }
                    QuotedMessageStoreModule quotedMessageStoreModule = r14.A0E;
                    QuotedMessageStoreModule quotedMessageStoreModule2 = quotedMessageStoreModule;
                    if (quotedMessageStoreModule == null) {
                        quotedMessageStoreModule2 = new QuotedMessageStoreModule();
                        r14.A0E = quotedMessageStoreModule2;
                    }
                    RecentStickersModule recentStickersModule = r14.A0j;
                    RecentStickersModule recentStickersModule2 = recentStickersModule;
                    if (recentStickersModule == null) {
                        recentStickersModule2 = new RecentStickersModule();
                        r14.A0j = recentStickersModule2;
                    }
                    ReplyRenderModule replyRenderModule = r14.A0h;
                    ReplyRenderModule replyRenderModule2 = replyRenderModule;
                    if (replyRenderModule == null) {
                        replyRenderModule2 = new ReplyRenderModule();
                        r14.A0h = replyRenderModule2;
                    }
                    ReplySubsystemModule replySubsystemModule = r14.A0i;
                    ReplySubsystemModule replySubsystemModule2 = replySubsystemModule;
                    if (replySubsystemModule == null) {
                        replySubsystemModule2 = new ReplySubsystemModule();
                        r14.A0i = replySubsystemModule2;
                    }
                    SearchModule searchModule = r14.A0N;
                    SearchModule searchModule2 = searchModule;
                    if (searchModule == null) {
                        searchModule2 = new SearchModule();
                        r14.A0N = searchModule2;
                    }
                    SystemMessageFactoryModule systemMessageFactoryModule = r14.A0l;
                    SystemMessageFactoryModule systemMessageFactoryModule2 = systemMessageFactoryModule;
                    if (systemMessageFactoryModule == null) {
                        systemMessageFactoryModule2 = new SystemMessageFactoryModule();
                        r14.A0l = systemMessageFactoryModule2;
                    }
                    SystemMessagePlatformRegistrationModule systemMessagePlatformRegistrationModule = r14.A0W;
                    if (systemMessagePlatformRegistrationModule == null) {
                        systemMessagePlatformRegistrationModule = new SystemMessagePlatformRegistrationModule();
                        r14.A0W = systemMessagePlatformRegistrationModule;
                    }
                    SystemMessageRegistrationsModule systemMessageRegistrationsModule = r14.A0k;
                    if (systemMessageRegistrationsModule == null) {
                        systemMessageRegistrationsModule = new SystemMessageRegistrationsModule();
                        r14.A0k = systemMessageRegistrationsModule;
                    }
                    TextMessageDatabaseMigrationModule textMessageDatabaseMigrationModule = r14.A0F;
                    if (textMessageDatabaseMigrationModule == null) {
                        textMessageDatabaseMigrationModule = new TextMessageDatabaseMigrationModule();
                        r14.A0F = textMessageDatabaseMigrationModule;
                    }
                    TimeModule timeModule = r14.A0B;
                    if (timeModule == null) {
                        timeModule = new TimeModule();
                        r14.A0B = timeModule;
                    }
                    TransactionLockModule transactionLockModule = r14.A0H;
                    if (transactionLockModule == null) {
                        transactionLockModule = new TransactionLockModule();
                        r14.A0H = transactionLockModule;
                    }
                    UnifiedAuthenticationModule unifiedAuthenticationModule = r14.A02;
                    if (unifiedAuthenticationModule == null) {
                        unifiedAuthenticationModule = new UnifiedAuthenticationModule();
                        r14.A02 = unifiedAuthenticationModule;
                    }
                    WaQuickPromotionFilterModule waQuickPromotionFilterModule = r14.A0q;
                    if (waQuickPromotionFilterModule == null) {
                        waQuickPromotionFilterModule = new WaQuickPromotionFilterModule();
                        r14.A0q = waQuickPromotionFilterModule;
                    }
                    WaWorkManagerModule waWorkManagerModule = r14.A0r;
                    if (waWorkManagerModule == null) {
                        waWorkManagerModule = new WaWorkManagerModule();
                        r14.A0r = waWorkManagerModule;
                    }
                    WaffleXProductModule waffleXProductModule = r14.A06;
                    if (waffleXProductModule == null) {
                        waffleXProductModule = new WaffleXProductModule();
                        r14.A06 = waffleXProductModule;
                    }
                    WfacProductReleaseModule wfacProductReleaseModule = r14.A0p;
                    if (wfacProductReleaseModule == null) {
                        wfacProductReleaseModule = new WfacProductReleaseModule();
                        r14.A0p = wfacProductReleaseModule;
                    }
                    WfalProdInfraModule wfalProdInfraModule = r14.A0o;
                    if (wfalProdInfraModule == null) {
                        wfalProdInfraModule = new WfalProdInfraModule();
                        r14.A0o = wfalProdInfraModule;
                    }
                    WfsProductReleaseModule wfsProductReleaseModule = r14.A07;
                    if (wfsProductReleaseModule == null) {
                        wfsProductReleaseModule = new WfsProductReleaseModule();
                        r14.A07 = wfsProductReleaseModule;
                    }
                    XFamilyGQLModule xFamilyGQLModule = r14.A0s;
                    if (xFamilyGQLModule == null) {
                        xFamilyGQLModule = new XFamilyGQLModule();
                        r14.A0s = xFamilyGQLModule;
                    }
                    CommonModule commonModule3 = commonModule2;
                    UnifiedAuthenticationModule unifiedAuthenticationModule2 = unifiedAuthenticationModule;
                    AvatarModule avatarModule3 = avatarModule2;
                    BusinessProductModule businessProductModule3 = businessProductModule2;
                    DCEncryptedModule dCEncryptedModule3 = dCEncryptedModule2;
                    WaffleXProductModule waffleXProductModule2 = waffleXProductModule;
                    WfsProductReleaseModule wfsProductReleaseModule2 = wfsProductReleaseModule;
                    this.A02 = new C64333Db(r14.A00, commonModule3, unifiedAuthenticationModule2, avatarModule3, businessProductModule3, dCEncryptedModule3, waffleXProductModule2, wfsProductReleaseModule2, r14.A08, nativeFlowActionModule2, conversationUiModule2, timeModule, cronModule2, dailyEventModule2, quotedMessageStoreModule2, textMessageDatabaseMigrationModule, forceMigrationModule2, transactionLockModule, databaseMigrationModule2, dependencyBridgeModule2, companionModeModule2, jidMapperProviderModule2, migrationModule2, searchModule2, eventChatInfoModule2, infraABPropsModule2, fMessageRegistrationsModule2, fMessageCloneModule2, fMessageFactoryModule2, fMessageForwardingSubsystemModule2, fMessagePlatformModule2, fMessagePlatformRegistrationModule2, systemMessagePlatformRegistrationModule, gifSearchModule2, indiaUpiModule2, integrityModule2, integritySignalsModule2, mediaDailyUsageModule2, otpNotificationModule2, p2mLiteModule2, pinInChatSubsystemModule2, preloadsReleaseModule2, previewSubsystemModule2, replyRenderModule2, replySubsystemModule2, recentStickersModule2, systemMessageRegistrationsModule, systemMessageFactoryModule2, commerceBloksModule2, extensionsProductModule2, wfalProdInfraModule, wfacProductReleaseModule, waQuickPromotionFilterModule, waWorkManagerModule, xFamilyGQLModule, r14.A0t);
                }
            }
        }
        return this.A02;
    }

    public AnonymousClass3YW(AnonymousClass2ER r2) {
        this.A00 = r2;
    }
}
