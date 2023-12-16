package X;

import com.whatsapp.messaging.offline.DelayedStanzasFetcher$StanzaFetcher;

/* renamed from: X.3vh  reason: invalid class name and case insensitive filesystem */
public final class C78863vh extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ AnonymousClass31C $messageClient;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C78863vh(AnonymousClass31C r2) {
        super(0);
        this.$messageClient = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        return new DelayedStanzasFetcher$StanzaFetcher(this.$messageClient, AnonymousClass454.A00);
    }
}
