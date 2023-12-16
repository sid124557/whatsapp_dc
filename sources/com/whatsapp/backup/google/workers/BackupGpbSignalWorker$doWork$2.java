package com.whatsapp.backup.google.workers;

import X.AnonymousClass001;
import X.AnonymousClass0EE;
import X.AnonymousClass0Y7;
import X.AnonymousClass4C6;
import X.AnonymousClass4GR;
import X.AnonymousClass8P9;
import X.C01400Ao;
import X.C01410Ap;
import X.C06520Ya;
import X.C57682u2;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import com.whatsapp.Me;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.backup.google.workers.BackupGpbSignalWorker$doWork$2", f = "BackupGpbSignalWorker.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class BackupGpbSignalWorker$doWork$2 extends C75003pT implements AnonymousClass4GR {
    public int label;
    public final /* synthetic */ BackupGpbSignalWorker this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BackupGpbSignalWorker$doWork$2(BackupGpbSignalWorker backupGpbSignalWorker, C84814Du r3) {
        super(r3, 2);
        this.this$0 = backupGpbSignalWorker;
    }

    public final Object A09(Object obj) {
        String A0X;
        Me A0F;
        String str;
        if (this.label == 0) {
            C57682u2.A01(obj);
            if (!(!this.this$0.A01.A01().getBoolean("send_gpb_signal", false) || (A0X = this.this$0.A03.A0X()) == null || (A0F = this.this$0.A00.A0F()) == null || (str = A0F.jabber_id) == null)) {
                AnonymousClass0Y7 A04 = this.this$0.A02.A04(A0X, "backup");
                if (!C06520Ya.A0C(new AnonymousClass0EE(), A04)) {
                    return new C01400Ao();
                }
                A04.A0F(str);
                this.this$0.A01.A01().edit().remove("send_gpb_signal").apply();
            }
            return new C01410Ap();
        }
        throw AnonymousClass001.A0d();
    }

    public final C84814Du A0A(Object obj, C84814Du r4) {
        return new BackupGpbSignalWorker$doWork$2(this.this$0, r4);
    }

    /* renamed from: A0B */
    public final Object invoke(C84814Du r3, AnonymousClass4C6 r4) {
        return ((AnonymousClass8P9) A0A(r4, r3)).A09(C59022wD.A00);
    }
}
