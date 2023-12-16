package X;

import android.content.Intent;
import com.whatsapp.jid.Jid;

/* renamed from: X.63P  reason: invalid class name */
public final class AnonymousClass63P extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ C89644eZ $activity;
    public final /* synthetic */ boolean $isChatLocked;
    public final /* synthetic */ C624134x $selectedMessage;
    public final /* synthetic */ AnonymousClass4pK this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass63P(C89644eZ r2, AnonymousClass4pK r3, C624134x r4, boolean z) {
        super(1);
        this.this$0 = r3;
        this.$selectedMessage = r4;
        this.$activity = r2;
        this.$isChatLocked = z;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass33D r6 = (AnonymousClass33D) obj;
        this.this$0.A01.A00.put(r6.A00(), this.$selectedMessage);
        Intent A08 = C627736r.A08(this.$activity, 0);
        C162457s7.A0D(A08);
        A08.putExtra("jid", C627336j.A07((Jid) r6.A00()));
        A08.putExtra("args_conversation_screen_entry_point", 2);
        A08.putExtra("extra_quoted_message_row_id", this.$selectedMessage.A0H);
        if (this.$isChatLocked) {
            A08.putExtra("chatlockEntryPoint", 2);
        }
        this.this$0.A00.A0B(this.$activity, A08);
        return C59022wD.A00;
    }
}
