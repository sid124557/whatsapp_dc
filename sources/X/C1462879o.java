package X;

import com.google.android.search.verification.client.SearchActionVerificationClientService;

/* renamed from: X.79o  reason: invalid class name and case insensitive filesystem */
public final class C1462879o {
    public static final int A00;
    public static final int A01;
    public static final C175768Zq A02 = new C175768Zq((AnonymousClass8PR) null, (C175768Zq) null, 0, -1);
    public static final AnonymousClass2XH A03 = new AnonymousClass2XH("BUFFERED");
    public static final AnonymousClass2XH A04 = new AnonymousClass2XH("CHANNEL_CLOSED");
    public static final AnonymousClass2XH A05 = new AnonymousClass2XH("CLOSE_HANDLER_CLOSED");
    public static final AnonymousClass2XH A06 = new AnonymousClass2XH("CLOSE_HANDLER_INVOKED");
    public static final AnonymousClass2XH A07 = new AnonymousClass2XH("DONE_RCV");
    public static final AnonymousClass2XH A08 = new AnonymousClass2XH("FAILED");
    public static final AnonymousClass2XH A09 = new AnonymousClass2XH("INTERRUPTED_RCV");
    public static final AnonymousClass2XH A0A = new AnonymousClass2XH("INTERRUPTED_SEND");
    public static final AnonymousClass2XH A0B = new AnonymousClass2XH("SHOULD_BUFFER");
    public static final AnonymousClass2XH A0C = new AnonymousClass2XH("NO_CLOSE_CAUSE");
    public static final AnonymousClass2XH A0D = new AnonymousClass2XH("NO_RECEIVE_RESULT");
    public static final AnonymousClass2XH A0E = new AnonymousClass2XH("POISONED");
    public static final AnonymousClass2XH A0F = new AnonymousClass2XH("RESUMING_BY_EB");
    public static final AnonymousClass2XH A0G = new AnonymousClass2XH("S_RESUMING_BY_RCV");
    public static final AnonymousClass2XH A0H = new AnonymousClass2XH("SUSPEND");
    public static final AnonymousClass2XH A0I = new AnonymousClass2XH("SUSPEND_NO_WAITER");

    static {
        long j = (long) 1;
        long j2 = (long) Integer.MAX_VALUE;
        A01 = (int) AnonymousClass2AS.A00("kotlinx.coroutines.bufferedChannel.segmentSize", (long) 32, j, j2);
        A00 = (int) AnonymousClass2AS.A00("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", (long) SearchActionVerificationClientService.NOTIFICATION_ID, j, j2);
    }
}
