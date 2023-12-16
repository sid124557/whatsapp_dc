package X;

import com.whatsapp.data.ConversationDeleteWorker;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.3Gu  reason: invalid class name and case insensitive filesystem */
public class C65253Gu implements C85274Fp {
    public final /* synthetic */ ConversationDeleteWorker A00;
    public final /* synthetic */ C43912Ty A01;

    public C65253Gu(ConversationDeleteWorker conversationDeleteWorker, C43912Ty r2) {
        this.A00 = conversationDeleteWorker;
        this.A01 = r2;
    }

    public void BTW() {
        ConversationDeleteWorker.A0D.addAndGet(-1);
        this.A00.A0D();
    }

    public void BZ0(int i, int i2) {
        this.A00.A0E(this.A01.A07, i);
    }

    public void Bc5() {
        int max;
        ConversationDeleteWorker.A0D.addAndGet(1);
        C95814uZ r4 = this.A01.A07;
        ConversationDeleteWorker conversationDeleteWorker = this.A00;
        ConcurrentHashMap concurrentHashMap = ConversationDeleteWorker.A0B;
        concurrentHashMap.putIfAbsent(r4, new AnonymousClass2KR());
        AnonymousClass2KR r3 = (AnonymousClass2KR) concurrentHashMap.get(r4);
        int A002 = conversationDeleteWorker.A08.A00(r4);
        synchronized (r3) {
            int i = r3.A01;
            max = Math.max(0, A002 - i);
            r3.A01 = i + max;
        }
        ConversationDeleteWorker.A0E.addAndGet(max);
    }

    public boolean Boa() {
        return this.A00.A03;
    }
}
