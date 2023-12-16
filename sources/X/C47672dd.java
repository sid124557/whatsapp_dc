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

/* renamed from: X.2dd  reason: invalid class name and case insensitive filesystem */
public final class C47672dd {
    public AddOnBridgeModule A00;
    public CommonModule A01;
    public UnifiedAuthenticationModule A02;
    public AvatarModule A03;
    public BusinessProductModule A04;
    public DCEncryptedModule A05;
    public WaffleXProductModule A06;
    public WfsProductReleaseModule A07;
    public ActivityModule A08;
    public NativeFlowActionModule A09;
    public ConversationUiModule A0A;
    public TimeModule A0B;
    public CronModule A0C;
    public DailyEventModule A0D;
    public QuotedMessageStoreModule A0E;
    public TextMessageDatabaseMigrationModule A0F;
    public ForceMigrationModule A0G;
    public TransactionLockModule A0H;
    public DatabaseMigrationModule A0I;
    public DependencyBridgeModule A0J;
    public CompanionModeModule A0K;
    public JidMapperProviderModule A0L;
    public MigrationModule A0M;
    public SearchModule A0N;
    public EventChatInfoModule A0O;
    public InfraABPropsModule A0P;
    public FMessageRegistrationsModule A0Q;
    public FMessageCloneModule A0R;
    public FMessageFactoryModule A0S;
    public FMessageForwardingSubsystemModule A0T;
    public FMessagePlatformModule A0U;
    public FMessagePlatformRegistrationModule A0V;
    public SystemMessagePlatformRegistrationModule A0W;
    public GifSearchModule A0X;
    public IndiaUpiModule A0Y;
    public IntegrityModule A0Z;
    public IntegritySignalsModule A0a;
    public MediaDailyUsageModule A0b;
    public OtpNotificationModule A0c;
    public P2mLiteModule A0d;
    public PinInChatSubsystemModule A0e;
    public PreloadsReleaseModule A0f;
    public PreviewSubsystemModule A0g;
    public ReplyRenderModule A0h;
    public ReplySubsystemModule A0i;
    public RecentStickersModule A0j;
    public SystemMessageRegistrationsModule A0k;
    public SystemMessageFactoryModule A0l;
    public CommerceBloksModule A0m;
    public ExtensionsProductModule A0n;
    public WfalProdInfraModule A0o;
    public WfacProductReleaseModule A0p;
    public WaQuickPromotionFilterModule A0q;
    public WaWorkManagerModule A0r;
    public XFamilyGQLModule A0s;
    public AnonymousClass2J5 A0t;
}
